package com.lagradost.cloudstream3.movieproviders

import com.lagradost.cloudstream3.ParCollections.apmapIndexed
import com.lagradost.cloudstream3.MainAPIKt.base64Decode
import com.lagradost.cloudstream3.MainActivityKt.getApp
import com.lagradost.cloudstream3.APIHolder.unixTime
import com.lagradost.cloudstream3.MainAPIKt.newMovieSearchResponse
import com.lagradost.cloudstream3.utils.AppUtils.toJson
import com.lagradost.cloudstream3.utils.ExtractorApiKt.getQualityFromName
import com.lagradost.cloudstream3.HomePageList.name
import com.lagradost.cloudstream3.MainAPIKt.newEpisode
import com.lagradost.cloudstream3.MainAPIKt.`newMovieSearchResponse$default`
import com.lagradost.cloudstream3.MainAPIKt.getQualityFromString
import com.lagradost.cloudstream3.MainAPI.mainUrl
import com.lagradost.cloudstream3.MainAPIKt.base64Encode
import com.lagradost.cloudstream3.utils.Qualities.value
import com.lagradost.cloudstream3.MainAPIKt.fixUrl
import com.lagradost.cloudstream3.APIHolder.unixTimeMS
import com.lagradost.cloudstream3.utils.M3u8Helper.m3u8Generation
import com.lagradost.cloudstream3.MainAPI.name
import com.lagradost.cloudstream3.utils.M3u8Helper.M3u8Stream.streamUrl
import com.lagradost.cloudstream3.utils.M3u8Helper.M3u8Stream.getQuality
import com.lagradost.cloudstream3.mvvm.ArchComponentExt.suspendSafeApiCall
import com.lagradost.cloudstream3.SearchResponse.name
import com.lagradost.cloudstream3.MainAPIKt.fixUrlNull
import com.lagradost.cloudstream3.MainAPIKt.`newTvSeriesSearchResponse$default`
import com.lagradost.cloudstream3.MainAPIKt.`newAnimeSearchResponse$default`
import com.lagradost.cloudstream3.MainAPIKt.getMapper
import com.lagradost.cloudstream3.MovieLoadResponse.setRecommendations
import com.lagradost.cloudstream3.MovieLoadResponse.posterUrl
import com.lagradost.cloudstream3.MovieLoadResponse.setYear
import com.lagradost.cloudstream3.MovieLoadResponse.plot
import com.lagradost.cloudstream3.APIHolder.capitalize
import com.lagradost.cloudstream3.MovieLoadResponse.tags
import com.lagradost.cloudstream3.MovieLoadResponse.setRating
import com.lagradost.cloudstream3.LoadResponse.Companion.addTrailer
import com.lagradost.cloudstream3.LoadResponse.Companion.addImdbId
import com.lagradost.cloudstream3.TvSeriesLoadResponse.setYear
import com.lagradost.cloudstream3.TvSeriesLoadResponse.plot
import com.lagradost.cloudstream3.TvSeriesLoadResponse.posterUrl
import com.lagradost.cloudstream3.TvSeriesLoadResponse.setRating
import com.lagradost.cloudstream3.TvSeriesLoadResponse.tags
import com.lagradost.cloudstream3.ParCollections.argamap
import com.lagradost.cloudstream3.MovieLoadResponse.setDuration
import com.lagradost.cloudstream3.LoadResponse.Companion.addActorsOnly
import com.lagradost.cloudstream3.TvSeriesLoadResponse.setDuration
import com.lagradost.cloudstream3.TvSeriesLoadResponse.setRecommendations
import com.lagradost.cloudstream3.utils.ExtractorApiKt.httpsify
import com.lagradost.cloudstream3.utils.ExtractorApiKt.loadExtractor
import com.lagradost.cloudstream3.MainAPIKt.addPoster
import com.lagradost.cloudstream3.TvSeriesLoadResponse.setName
import com.lagradost.cloudstream3.TvSeriesLoadResponse.setUrl
import com.lagradost.cloudstream3.TvSeriesLoadResponse.setEpisodes
import com.lagradost.cloudstream3.LoadResponse.Companion.addDuration
import com.lagradost.cloudstream3.LoadResponse.Companion.addActorNames
import com.lagradost.cloudstream3.MovieLoadResponse.comingSoon
import com.lagradost.cloudstream3.TvSeriesLoadResponse.showStatus
import com.lagradost.cloudstream3.MovieLoadResponse.actors
import com.lagradost.cloudstream3.TvSeriesLoadResponse.actors
import com.lagradost.cloudstream3.AnimeLoadResponse.posterUrl
import com.lagradost.cloudstream3.AnimeLoadResponse.setYear
import com.lagradost.cloudstream3.AnimeLoadResponse.showStatus
import com.lagradost.cloudstream3.AnimeLoadResponse.plot
import com.lagradost.cloudstream3.AnimeLoadResponse.tags
import com.lagradost.cloudstream3.AnimeLoadResponse.setRecommendations
import com.lagradost.cloudstream3.MainAPIKt.addEpisodes
import com.lagradost.cloudstream3.MovieSearchResponse.posterUrl
import com.lagradost.cloudstream3.LoadResponse.Companion.addImdbUrl
import com.lagradost.cloudstream3.Episode.setSeason
import com.lagradost.cloudstream3.Episode.setEpisode
import com.lagradost.cloudstream3.Episode.name
import com.lagradost.cloudstream3.Episode.posterUrl
import com.lagradost.cloudstream3.Episode.description
import com.lagradost.cloudstream3.MainAPIKt.`addDate$default`
import com.lagradost.cloudstream3.TvSeriesLoadResponse.comingSoon
import com.lagradost.cloudstream3.mvvm.ArchComponentExt.safeApiCall
import com.lagradost.cloudstream3.TvSeriesSearchResponse.setPosterUrl
import com.lagradost.cloudstream3.utils.M3u8Helper.Companion.Companion.`generateM3u8$default`
import com.lagradost.cloudstream3.LoadResponse.Companion.addRating
import com.lagradost.cloudstream3.utils.Extensions.RequestCustom.getWithCustomCache
import com.lagradost.cloudstream3.MainAPIKt.fixTitle
import com.lagradost.cloudstream3.AnimeLoadResponse.japName
import com.lagradost.cloudstream3.AnimeLoadResponse.engName
import com.lagradost.cloudstream3.MovieSearchResponse.quality
import com.lagradost.cloudstream3.mvvm.ArchComponentExt.logError
import com.lagradost.cloudstream3.utils.ExtractorApi.Companion.`getUrl$default`
import com.lagradost.cloudstream3.utils.ExtractorApi.getSafeUrl
import com.lagradost.cloudstream3.utils.SubtitleHelper.fromTwoLettersToLanguage
import com.lagradost.cloudstream3.utils.ExtractorApiKt.extractorApis
import com.lagradost.cloudstream3.utils.ExtractorApi.name
import com.lagradost.cloudstream3.AnimeSearchResponse.posterUrl
import com.lagradost.cloudstream3.MainAPIKt.addDubStatus
import com.lagradost.cloudstream3.MainAPIKt.addSub
import com.lagradost.cloudstream3.MovieSearchResponse.setYear
import com.lagradost.cloudstream3.MainAPIKt.addQuality
import com.lagradost.cloudstream3.TvSeriesSearchResponse.setQuality
import com.fasterxml.jackson.annotation.JsonProperty
import com.lagradost.cloudstream3.movieproviders.Vote
import com.lagradost.cloudstream3.movieproviders.Pivot
import com.lagradost.cloudstream3.movieproviders.Episodejson
import com.lagradost.cloudstream3.movieproviders.Season
import kotlin.jvm.internal.DefaultConstructorMarker
import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.TvType
import kotlin.collections.SetsKt
import com.lagradost.cloudstream3.HomePageResponse
import com.lagradost.cloudstream3.movieproviders.HDMovie5.QuickSearchResponse.Extra
import com.lagradost.cloudstream3.SearchResponse
import com.lagradost.cloudstream3.LoadResponse
import com.lagradost.cloudstream3.movieproviders.HDMovie5.PlayerAjaxResponse
import kotlin.jvm.JvmOverloads
import com.lagradost.cloudstream3.SubtitleFile
import com.lagradost.cloudstream3.utils.ExtractorLink
import kotlin.coroutines.jvm.internal.boxing
import com.lagradost.cloudstream3.ParCollections
import kotlin.text.StringsKt
import com.lagradost.cloudstream3.movieproviders.``HDMovie5$loadLinks$2`
import kotlin.jvm.internal.Intrinsics

/* compiled from: TrailersTwoProvider.kt */
@Metadata(
    m108d1 = ["\u00001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b3\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0003\b\u0080\u0001\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BÉ\u0005\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u00100\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u00101\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u00102\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u00103\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u00104\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u00105\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u00106\u001a\u0004\u0018\u000107\u0012\n\b\u0001\u00108\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u00109\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010:\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010;\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010<\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010=\u001a\u0004\u0018\u00010>\u0012\n\b\u0001\u0010?\u001a\u0004\u0018\u00010@¢\u0006\u0002\u0010AJ\u000c\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010 \u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010¡\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010¢\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010£\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010¤\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010¥\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010¦\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010§\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010¨\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010©\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010ª\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010«\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010¬\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010®\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010¯\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010°\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010±\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010²\u0001\u001a\u0004\u0018\u000107HÆ\u0003¢\u0006\u0002\u0010YJ\u000c\u0010³\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010´\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010µ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010¶\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010·\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010¸\u0001\u001a\u0004\u0018\u00010>HÆ\u0003J\u0011\u0010¹\u0001\u001a\u0004\u0018\u00010@HÆ\u0003¢\u0006\u0002\u0010_J\u000c\u0010º\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010»\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010¼\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000c\u0010½\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÔ\u0005\u0010¾\u0001\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u00102\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u00104\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u00105\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u00106\u001a\u0004\u0018\u0001072\n\b\u0003\u00108\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u00109\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010:\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010;\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010<\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010=\u001a\u0004\u0018\u00010>2\n\b\u0003\u0010?\u001a\u0004\u0018\u00010@HÆ\u0001¢\u0006\u0003\u0010¿\u0001J\u0016\u0010À\u0001\u001a\u00030Á\u00012\t\u0010Â\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010Ã\u0001\u001a\u000207HÖ\u0001J\n\u0010Ä\u0001\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0013\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010CR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010CR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010CR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010CR\u0013\u0010(\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010CR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u0010CR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010CR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u0010CR\u0013\u0010)\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u0010CR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bM\u0010CR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u0010CR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u0010CR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u0010CR\u0013\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010CR\u0013\u0010/\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u0010CR\u0013\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bS\u0010CR\u0013\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bT\u0010CR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bU\u0010CR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bV\u0010CR\u0013\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u0010CR\u0015\u00106\u001a\u0004\u0018\u000107¢\u0006\n\n\u0002\u0010Z\u001a\u0004\bX\u0010YR\u0013\u0010<\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b[\u0010CR\u0013\u0010=\u001a\u0004\u0018\u00010>¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010]R\u0015\u0010?\u001a\u0004\u0018\u00010@¢\u0006\n\n\u0002\u0010`\u001a\u0004\b^\u0010_R\u0013\u0010.\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\ba\u0010CR\u0013\u00101\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bb\u0010CR\u0013\u0010-\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bc\u0010CR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bd\u0010CR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\be\u0010CR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bf\u0010CR\u0013\u00103\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bg\u0010CR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bh\u0010CR\u0013\u0010*\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bi\u0010CR\u0013\u00109\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bj\u0010CR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bk\u0010CR\u0013\u00102\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bl\u0010CR\u0013\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bm\u0010CR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bn\u0010CR\u0013\u00104\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bo\u0010CR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bp\u0010CR\u0013\u00105\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bq\u0010CR\u0013\u00100\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\br\u0010CR\u0013\u0010\u000c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bs\u0010CR\u0013\u0010+\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bt\u0010CR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bu\u0010CR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bv\u0010CR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bw\u0010CR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bx\u0010CR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\by\u0010CR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bz\u0010CR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b{\u0010CR\u0013\u00108\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b|\u0010CR\u0013\u0010'\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b}\u0010CR\u0013\u0010;\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b~\u0010CR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010CR\u0014\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010CR\u0014\u0010,\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010CR\u0014\u0010:\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010C¨\u0006Å\u0001"],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/MetaInfo;", "", "MatchedBy", "", "IDSubMovieFile", "MovieHash", "MovieByteSize", "MovieTimeMS", "IDSubtitleFile", "SubFileName", "SubActualCD", "SubSize", "SubHash", "SubLastTS", "SubTSGroup", "InfoReleaseGroup", "InfoFormat", "InfoOther", "IDSubtitle", "UserID", "SubLanguageID", "SubFormat", "SubSumCD", "SubAuthorComment", "SubAddDate", "SubBad", "SubRating", "SubSumVotes", "SubDownloadsCnt", "MovieReleaseName", "MovieFPS", "IDMovie", "IDMovieImdb", "MovieName", "MovieNameEng", "MovieYear", "MovieImdbRating", "SubFeatured", "UserNickName", "SubTranslator", "ISO639", "LanguageName", "SubComments", "SubHearingImpaired", "UserRank", "SeriesSeason", "SeriesEpisode", "MovieKind", "SubHD", "SeriesIMDBParent", "SubEncoding", "SubAutoTranslation", "SubForeignPartsOnly", "SubFromTrusted", "QueryCached", "", "SubTSGroupHash", "SubDownloadLink", "ZipDownloadLink", "SubtitlesLink", "QueryNumber", "QueryParameters", "Lcom/lagradost/cloudstream3/movieproviders/QueryParameters;", "Score", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/movieproviders/QueryParameters;Ljava/lang/Double;)V", "getIDMovie", "()Ljava/lang/String;", "getIDMovieImdb", "getIDSubMovieFile", "getIDSubtitle", "getIDSubtitleFile", "getISO639", "getInfoFormat", "getInfoOther", "getInfoReleaseGroup", "getLanguageName", "getMatchedBy", "getMovieByteSize", "getMovieFPS", "getMovieHash", "getMovieImdbRating", "getMovieKind", "getMovieName", "getMovieNameEng", "getMovieReleaseName", "getMovieTimeMS", "getMovieYear", "getQueryCached", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getQueryNumber", "getQueryParameters", "()Lcom/lagradost/cloudstream3/movieproviders/QueryParameters;", "getScore", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getSeriesEpisode", "getSeriesIMDBParent", "getSeriesSeason", "getSubActualCD", "getSubAddDate", "getSubAuthorComment", "getSubAutoTranslation", "getSubBad", "getSubComments", "getSubDownloadLink", "getSubDownloadsCnt", "getSubEncoding", "getSubFeatured", "getSubFileName", "getSubForeignPartsOnly", "getSubFormat", "getSubFromTrusted", "getSubHD", "getSubHash", "getSubHearingImpaired", "getSubLanguageID", "getSubLastTS", "getSubRating", "getSubSize", "getSubSumCD", "getSubSumVotes", "getSubTSGroup", "getSubTSGroupHash", "getSubTranslator", "getSubtitlesLink", "getUserID", "getUserNickName", "getUserRank", "getZipDownloadLink", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/movieproviders/QueryParameters;Ljava/lang/Double;)Lcom/lagradost/cloudstream3/movieproviders/MetaInfo;", "equals", "", "other", "hashCode", "toString", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class MetaInfo(
    @param:JsonProperty("MatchedBy") val matchedBy: String,
    @param:JsonProperty("IDSubMovieFile") val iDSubMovieFile: String,
    @param:JsonProperty(
        "MovieHash"
    ) val movieHash: String,
    @param:JsonProperty("MovieByteSize") val movieByteSize: String,
    @param:JsonProperty(
        "MovieTimeMS"
    ) val movieTimeMS: String,
    @param:JsonProperty("IDSubtitleFile") val iDSubtitleFile: String,
    @param:JsonProperty(
        "SubFileName"
    ) val subFileName: String,
    @param:JsonProperty("SubActualCD") val subActualCD: String,
    @param:JsonProperty(
        "SubSize"
    ) val subSize: String,
    @param:JsonProperty("SubHash") val subHash: String,
    @param:JsonProperty(
        "SubLastTS"
    ) val subLastTS: String,
    @param:JsonProperty("SubTSGroup") val subTSGroup: String,
    @param:JsonProperty(
        "InfoReleaseGroup"
    ) val infoReleaseGroup: String,
    @param:JsonProperty("InfoFormat") val infoFormat: String,
    @param:JsonProperty(
        "InfoOther"
    ) val infoOther: String,
    @param:JsonProperty("IDSubtitle") val iDSubtitle: String,
    @param:JsonProperty(
        "UserID"
    ) val userID: String,
    @param:JsonProperty("SubLanguageID") val subLanguageID: String,
    @param:JsonProperty(
        "SubFormat"
    ) val subFormat: String,
    @param:JsonProperty("SubSumCD") val subSumCD: String,
    @param:JsonProperty(
        "SubAuthorComment"
    ) val subAuthorComment: String,
    @param:JsonProperty("SubAddDate") val subAddDate: String,
    @param:JsonProperty(
        "SubBad"
    ) val subBad: String,
    @param:JsonProperty("SubRating") val subRating: String,
    @param:JsonProperty(
        "SubSumVotes"
    ) val subSumVotes: String,
    @param:JsonProperty("SubDownloadsCnt") val subDownloadsCnt: String,
    @param:JsonProperty(
        "MovieReleaseName"
    ) val movieReleaseName: String,
    @param:JsonProperty("MovieFPS") val movieFPS: String,
    @param:JsonProperty(
        "IDMovie"
    ) val iDMovie: String,
    @param:JsonProperty("IDMovieImdb") val iDMovieImdb: String,
    @param:JsonProperty(
        "MovieName"
    ) val movieName: String,
    @param:JsonProperty("MovieNameEng") val movieNameEng: String,
    @param:JsonProperty(
        "MovieYear"
    ) val movieYear: String,
    @param:JsonProperty("MovieImdbRating") val movieImdbRating: String,
    @param:JsonProperty(
        "SubFeatured"
    ) val subFeatured: String,
    @param:JsonProperty("UserNickName") val userNickName: String,
    @param:JsonProperty(
        "SubTranslator"
    ) val subTranslator: String,
    @param:JsonProperty("ISO639") val iSO639: String,
    @param:JsonProperty(
        "LanguageName"
    ) val languageName: String,
    @param:JsonProperty("SubComments") val subComments: String,
    @param:JsonProperty(
        "SubHearingImpaired"
    ) val subHearingImpaired: String,
    @param:JsonProperty("UserRank") val userRank: String,
    @param:JsonProperty(
        "SeriesSeason"
    ) val seriesSeason: String,
    @param:JsonProperty("SeriesEpisode") val seriesEpisode: String,
    @param:JsonProperty(
        "MovieKind"
    ) val movieKind: String,
    @param:JsonProperty("SubHD") val subHD: String,
    @param:JsonProperty("SeriesIMDBParent") val seriesIMDBParent: String,
    @param:JsonProperty(
        "SubEncoding"
    ) val subEncoding: String,
    @param:JsonProperty("SubAutoTranslation") val subAutoTranslation: String,
    @param:JsonProperty(
        "SubForeignPartsOnly"
    ) val subForeignPartsOnly: String,
    @param:JsonProperty("SubFromTrusted") val subFromTrusted: String,
    @JsonProperty("QueryCached") num: Integer,
    @JsonProperty("SubTSGroupHash") str52: String,
    @JsonProperty("SubDownloadLink") str53: String,
    @JsonProperty("ZipDownloadLink") str54: String,
    @JsonProperty("SubtitlesLink") str55: String,
    @JsonProperty("QueryNumber") str56: String,
    @JsonProperty("QueryParameters") queryParameters: QueryParameters,
    @JsonProperty("Score") d: Double
) {
    private val QueryCached: Integer
    val queryNumber: String
    val queryParameters: QueryParameters
    val score: Double
    val subDownloadLink: String
    val subTSGroupHash: String
    val subtitlesLink: String
    val zipDownloadLink: String
    operator fun component1(): String {
        return matchedBy
    }

    operator fun component10(): String {
        return subHash
    }

    operator fun component11(): String {
        return subLastTS
    }

    operator fun component12(): String {
        return subTSGroup
    }

    operator fun component13(): String {
        return infoReleaseGroup
    }

    operator fun component14(): String {
        return infoFormat
    }

    operator fun component15(): String {
        return infoOther
    }

    operator fun component16(): String {
        return iDSubtitle
    }

    operator fun component17(): String {
        return userID
    }

    operator fun component18(): String {
        return subLanguageID
    }

    operator fun component19(): String {
        return subFormat
    }

    operator fun component2(): String {
        return iDSubMovieFile
    }

    operator fun component20(): String {
        return subSumCD
    }

    operator fun component21(): String {
        return subAuthorComment
    }

    operator fun component22(): String {
        return subAddDate
    }

    operator fun component23(): String {
        return subBad
    }

    operator fun component24(): String {
        return subRating
    }

    operator fun component25(): String {
        return subSumVotes
    }

    operator fun component26(): String {
        return subDownloadsCnt
    }

    operator fun component27(): String {
        return movieReleaseName
    }

    operator fun component28(): String {
        return movieFPS
    }

    operator fun component29(): String {
        return iDMovie
    }

    operator fun component3(): String {
        return movieHash
    }

    operator fun component30(): String {
        return iDMovieImdb
    }

    operator fun component31(): String {
        return movieName
    }

    operator fun component32(): String {
        return movieNameEng
    }

    operator fun component33(): String {
        return movieYear
    }

    operator fun component34(): String {
        return movieImdbRating
    }

    operator fun component35(): String {
        return subFeatured
    }

    operator fun component36(): String {
        return userNickName
    }

    operator fun component37(): String {
        return subTranslator
    }

    operator fun component38(): String {
        return iSO639
    }

    operator fun component39(): String {
        return languageName
    }

    operator fun component4(): String {
        return movieByteSize
    }

    operator fun component40(): String {
        return subComments
    }

    operator fun component41(): String {
        return subHearingImpaired
    }

    operator fun component42(): String {
        return userRank
    }

    operator fun component43(): String {
        return seriesSeason
    }

    operator fun component44(): String {
        return seriesEpisode
    }

    operator fun component45(): String {
        return movieKind
    }

    operator fun component46(): String {
        return subHD
    }

    operator fun component47(): String {
        return seriesIMDBParent
    }

    operator fun component48(): String {
        return subEncoding
    }

    operator fun component49(): String {
        return subAutoTranslation
    }

    operator fun component5(): String {
        return movieTimeMS
    }

    operator fun component50(): String {
        return subForeignPartsOnly
    }

    operator fun component51(): String {
        return subFromTrusted
    }

    operator fun component52(): Integer {
        return QueryCached
    }

    operator fun component53(): String {
        return subTSGroupHash
    }

    operator fun component54(): String {
        return subDownloadLink
    }

    operator fun component55(): String {
        return zipDownloadLink
    }

    operator fun component56(): String {
        return subtitlesLink
    }

    operator fun component57(): String {
        return queryNumber
    }

    operator fun component58(): QueryParameters {
        return queryParameters
    }

    operator fun component59(): Double {
        return score
    }

    operator fun component6(): String {
        return iDSubtitleFile
    }

    operator fun component7(): String {
        return subFileName
    }

    operator fun component8(): String {
        return subActualCD
    }

    operator fun component9(): String {
        return subSize
    }

    fun copy(
        @JsonProperty("MatchedBy") str: String,
        @JsonProperty("IDSubMovieFile") str2: String,
        @JsonProperty("MovieHash") str3: String,
        @JsonProperty("MovieByteSize") str4: String,
        @JsonProperty("MovieTimeMS") str5: String,
        @JsonProperty("IDSubtitleFile") str6: String,
        @JsonProperty("SubFileName") str7: String,
        @JsonProperty("SubActualCD") str8: String,
        @JsonProperty("SubSize") str9: String,
        @JsonProperty("SubHash") str10: String,
        @JsonProperty("SubLastTS") str11: String,
        @JsonProperty("SubTSGroup") str12: String,
        @JsonProperty("InfoReleaseGroup") str13: String,
        @JsonProperty("InfoFormat") str14: String,
        @JsonProperty("InfoOther") str15: String,
        @JsonProperty("IDSubtitle") str16: String,
        @JsonProperty("UserID") str17: String,
        @JsonProperty("SubLanguageID") str18: String,
        @JsonProperty("SubFormat") str19: String,
        @JsonProperty("SubSumCD") str20: String,
        @JsonProperty("SubAuthorComment") str21: String,
        @JsonProperty("SubAddDate") str22: String,
        @JsonProperty("SubBad") str23: String,
        @JsonProperty("SubRating") str24: String,
        @JsonProperty("SubSumVotes") str25: String,
        @JsonProperty("SubDownloadsCnt") str26: String,
        @JsonProperty("MovieReleaseName") str27: String,
        @JsonProperty("MovieFPS") str28: String,
        @JsonProperty("IDMovie") str29: String,
        @JsonProperty("IDMovieImdb") str30: String,
        @JsonProperty("MovieName") str31: String,
        @JsonProperty("MovieNameEng") str32: String,
        @JsonProperty("MovieYear") str33: String,
        @JsonProperty("MovieImdbRating") str34: String,
        @JsonProperty("SubFeatured") str35: String,
        @JsonProperty("UserNickName") str36: String,
        @JsonProperty("SubTranslator") str37: String,
        @JsonProperty("ISO639") str38: String,
        @JsonProperty("LanguageName") str39: String,
        @JsonProperty("SubComments") str40: String,
        @JsonProperty("SubHearingImpaired") str41: String,
        @JsonProperty("UserRank") str42: String,
        @JsonProperty("SeriesSeason") str43: String,
        @JsonProperty("SeriesEpisode") str44: String,
        @JsonProperty("MovieKind") str45: String,
        @JsonProperty("SubHD") str46: String,
        @JsonProperty("SeriesIMDBParent") str47: String,
        @JsonProperty("SubEncoding") str48: String,
        @JsonProperty("SubAutoTranslation") str49: String,
        @JsonProperty("SubForeignPartsOnly") str50: String,
        @JsonProperty("SubFromTrusted") str51: String,
        @JsonProperty("QueryCached") num: Integer,
        @JsonProperty("SubTSGroupHash") str52: String,
        @JsonProperty("SubDownloadLink") str53: String,
        @JsonProperty("ZipDownloadLink") str54: String,
        @JsonProperty("SubtitlesLink") str55: String,
        @JsonProperty("QueryNumber") str56: String,
        @JsonProperty("QueryParameters") queryParameters: QueryParameters,
        @JsonProperty("Score") d: Double
    ): MetaInfo {
        return MetaInfo(
            str,
            str2,
            str3,
            str4,
            str5,
            str6,
            str7,
            str8,
            str9,
            str10,
            str11,
            str12,
            str13,
            str14,
            str15,
            str16,
            str17,
            str18,
            str19,
            str20,
            str21,
            str22,
            str23,
            str24,
            str25,
            str26,
            str27,
            str28,
            str29,
            str30,
            str31,
            str32,
            str33,
            str34,
            str35,
            str36,
            str37,
            str38,
            str39,
            str40,
            str41,
            str42,
            str43,
            str44,
            str45,
            str46,
            str47,
            str48,
            str49,
            str50,
            str51,
            num,
            str52,
            str53,
            str54,
            str55,
            str56,
            queryParameters,
            d
        )
    }

    override fun equals(obj: Object): Boolean {
        if (this === obj) {
            return true
        }
        if (obj is MetaInfo) {
            val metaInfo = obj as MetaInfo
            return Intrinsics.areEqual(matchedBy, metaInfo.matchedBy) && Intrinsics.areEqual(
                iDSubMovieFile, metaInfo.iDSubMovieFile
            ) && Intrinsics.areEqual(
                movieHash, metaInfo.movieHash
            ) && Intrinsics.areEqual(
                movieByteSize, metaInfo.movieByteSize
            ) && Intrinsics.areEqual(
                movieTimeMS, metaInfo.movieTimeMS
            ) && Intrinsics.areEqual(
                iDSubtitleFile, metaInfo.iDSubtitleFile
            ) && Intrinsics.areEqual(
                subFileName, metaInfo.subFileName
            ) && Intrinsics.areEqual(
                subActualCD, metaInfo.subActualCD
            ) && Intrinsics.areEqual(
                subSize, metaInfo.subSize
            ) && Intrinsics.areEqual(subHash, metaInfo.subHash) && Intrinsics.areEqual(
                subLastTS, metaInfo.subLastTS
            ) && Intrinsics.areEqual(subTSGroup, metaInfo.subTSGroup) && Intrinsics.areEqual(
                infoReleaseGroup, metaInfo.infoReleaseGroup
            ) && Intrinsics.areEqual(
                infoFormat, metaInfo.infoFormat
            ) && Intrinsics.areEqual(
                infoOther, metaInfo.infoOther
            ) && Intrinsics.areEqual(iDSubtitle, metaInfo.iDSubtitle) && Intrinsics.areEqual(
                userID, metaInfo.userID
            ) && Intrinsics.areEqual(subLanguageID, metaInfo.subLanguageID) && Intrinsics.areEqual(
                subFormat, metaInfo.subFormat
            ) && Intrinsics.areEqual(subSumCD, metaInfo.subSumCD) && Intrinsics.areEqual(
                subAuthorComment, metaInfo.subAuthorComment
            ) && Intrinsics.areEqual(
                subAddDate, metaInfo.subAddDate
            ) && Intrinsics.areEqual(subBad, metaInfo.subBad) && Intrinsics.areEqual(
                subRating, metaInfo.subRating
            ) && Intrinsics.areEqual(
                subSumVotes, metaInfo.subSumVotes
            ) && Intrinsics.areEqual(
                subDownloadsCnt, metaInfo.subDownloadsCnt
            ) && Intrinsics.areEqual(
                movieReleaseName, metaInfo.movieReleaseName
            ) && Intrinsics.areEqual(
                movieFPS, metaInfo.movieFPS
            ) && Intrinsics.areEqual(iDMovie, metaInfo.iDMovie) && Intrinsics.areEqual(
                iDMovieImdb, metaInfo.iDMovieImdb
            ) && Intrinsics.areEqual(
                movieName, metaInfo.movieName
            ) && Intrinsics.areEqual(
                movieNameEng, metaInfo.movieNameEng
            ) && Intrinsics.areEqual(
                movieYear, metaInfo.movieYear
            ) && Intrinsics.areEqual(
                movieImdbRating, metaInfo.movieImdbRating
            ) && Intrinsics.areEqual(
                subFeatured, metaInfo.subFeatured
            ) && Intrinsics.areEqual(
                userNickName, metaInfo.userNickName
            ) && Intrinsics.areEqual(
                subTranslator, metaInfo.subTranslator
            ) && Intrinsics.areEqual(
                iSO639, metaInfo.iSO639
            ) && Intrinsics.areEqual(languageName, metaInfo.languageName) && Intrinsics.areEqual(
                subComments, metaInfo.subComments
            ) && Intrinsics.areEqual(
                subHearingImpaired, metaInfo.subHearingImpaired
            ) && Intrinsics.areEqual(
                userRank, metaInfo.userRank
            ) && Intrinsics.areEqual(seriesSeason, metaInfo.seriesSeason) && Intrinsics.areEqual(
                seriesEpisode, metaInfo.seriesEpisode
            ) && Intrinsics.areEqual(
                movieKind, metaInfo.movieKind
            ) && Intrinsics.areEqual(subHD, metaInfo.subHD) && Intrinsics.areEqual(
                seriesIMDBParent, metaInfo.seriesIMDBParent
            ) && Intrinsics.areEqual(
                subEncoding, metaInfo.subEncoding
            ) && Intrinsics.areEqual(
                subAutoTranslation, metaInfo.subAutoTranslation
            ) && Intrinsics.areEqual(
                subForeignPartsOnly, metaInfo.subForeignPartsOnly
            ) && Intrinsics.areEqual(
                subFromTrusted, metaInfo.subFromTrusted
            ) && Intrinsics.areEqual(
                QueryCached, metaInfo.QueryCached
            ) && Intrinsics.areEqual(
                subTSGroupHash, metaInfo.subTSGroupHash
            ) && Intrinsics.areEqual(
                subDownloadLink, metaInfo.subDownloadLink
            ) && Intrinsics.areEqual(
                zipDownloadLink, metaInfo.zipDownloadLink
            ) && Intrinsics.areEqual(
                subtitlesLink, metaInfo.subtitlesLink
            ) && Intrinsics.areEqual(
                queryNumber, metaInfo.queryNumber
            ) && Intrinsics.areEqual(
                queryParameters, metaInfo.queryParameters
            ) && Intrinsics.areEqual(
                score as Object, metaInfo.score as Object
            )
        }
        return false
    }

    override fun hashCode(): Int {
        val str = matchedBy
        val hashCode = (str?.hashCode() ?: 0) * 31
        val str2 = iDSubMovieFile
        val hashCode2 = (hashCode + (str2?.hashCode() ?: 0)) * 31
        val str3 = movieHash
        val hashCode3 = (hashCode2 + (str3?.hashCode() ?: 0)) * 31
        val str4 = movieByteSize
        val hashCode4 = (hashCode3 + (str4?.hashCode() ?: 0)) * 31
        val str5 = movieTimeMS
        val hashCode5 = (hashCode4 + (str5?.hashCode() ?: 0)) * 31
        val str6 = iDSubtitleFile
        val hashCode6 = (hashCode5 + (str6?.hashCode() ?: 0)) * 31
        val str7 = subFileName
        val hashCode7 = (hashCode6 + (str7?.hashCode() ?: 0)) * 31
        val str8 = subActualCD
        val hashCode8 = (hashCode7 + (str8?.hashCode() ?: 0)) * 31
        val str9 = subSize
        val hashCode9 = (hashCode8 + (str9?.hashCode() ?: 0)) * 31
        val str10 = subHash
        val hashCode10 = (hashCode9 + (str10?.hashCode() ?: 0)) * 31
        val str11 = subLastTS
        val hashCode11 = (hashCode10 + (str11?.hashCode() ?: 0)) * 31
        val str12 = subTSGroup
        val hashCode12 = (hashCode11 + (str12?.hashCode() ?: 0)) * 31
        val str13 = infoReleaseGroup
        val hashCode13 = (hashCode12 + (str13?.hashCode() ?: 0)) * 31
        val str14 = infoFormat
        val hashCode14 = (hashCode13 + (str14?.hashCode() ?: 0)) * 31
        val str15 = infoOther
        val hashCode15 = (hashCode14 + (str15?.hashCode() ?: 0)) * 31
        val str16 = iDSubtitle
        val hashCode16 = (hashCode15 + (str16?.hashCode() ?: 0)) * 31
        val str17 = userID
        val hashCode17 = (hashCode16 + (str17?.hashCode() ?: 0)) * 31
        val str18 = subLanguageID
        val hashCode18 = (hashCode17 + (str18?.hashCode() ?: 0)) * 31
        val str19 = subFormat
        val hashCode19 = (hashCode18 + (str19?.hashCode() ?: 0)) * 31
        val str20 = subSumCD
        val hashCode20 = (hashCode19 + (str20?.hashCode() ?: 0)) * 31
        val str21 = subAuthorComment
        val hashCode21 = (hashCode20 + (str21?.hashCode() ?: 0)) * 31
        val str22 = subAddDate
        val hashCode22 = (hashCode21 + (str22?.hashCode() ?: 0)) * 31
        val str23 = subBad
        val hashCode23 = (hashCode22 + (str23?.hashCode() ?: 0)) * 31
        val str24 = subRating
        val hashCode24 = (hashCode23 + (str24?.hashCode() ?: 0)) * 31
        val str25 = subSumVotes
        val hashCode25 = (hashCode24 + (str25?.hashCode() ?: 0)) * 31
        val str26 = subDownloadsCnt
        val hashCode26 = (hashCode25 + (str26?.hashCode() ?: 0)) * 31
        val str27 = movieReleaseName
        val hashCode27 = (hashCode26 + (str27?.hashCode() ?: 0)) * 31
        val str28 = movieFPS
        val hashCode28 = (hashCode27 + (str28?.hashCode() ?: 0)) * 31
        val str29 = iDMovie
        val hashCode29 = (hashCode28 + (str29?.hashCode() ?: 0)) * 31
        val str30 = iDMovieImdb
        val hashCode30 = (hashCode29 + (str30?.hashCode() ?: 0)) * 31
        val str31 = movieName
        val hashCode31 = (hashCode30 + (str31?.hashCode() ?: 0)) * 31
        val str32 = movieNameEng
        val hashCode32 = (hashCode31 + (str32?.hashCode() ?: 0)) * 31
        val str33 = movieYear
        val hashCode33 = (hashCode32 + (str33?.hashCode() ?: 0)) * 31
        val str34 = movieImdbRating
        val hashCode34 = (hashCode33 + (str34?.hashCode() ?: 0)) * 31
        val str35 = subFeatured
        val hashCode35 = (hashCode34 + (str35?.hashCode() ?: 0)) * 31
        val str36 = userNickName
        val hashCode36 = (hashCode35 + (str36?.hashCode() ?: 0)) * 31
        val str37 = subTranslator
        val hashCode37 = (hashCode36 + (str37?.hashCode() ?: 0)) * 31
        val str38 = iSO639
        val hashCode38 = (hashCode37 + (str38?.hashCode() ?: 0)) * 31
        val str39 = languageName
        val hashCode39 = (hashCode38 + (str39?.hashCode() ?: 0)) * 31
        val str40 = subComments
        val hashCode40 = (hashCode39 + (str40?.hashCode() ?: 0)) * 31
        val str41 = subHearingImpaired
        val hashCode41 = (hashCode40 + (str41?.hashCode() ?: 0)) * 31
        val str42 = userRank
        val hashCode42 = (hashCode41 + (str42?.hashCode() ?: 0)) * 31
        val str43 = seriesSeason
        val hashCode43 = (hashCode42 + (str43?.hashCode() ?: 0)) * 31
        val str44 = seriesEpisode
        val hashCode44 = (hashCode43 + (str44?.hashCode() ?: 0)) * 31
        val str45 = movieKind
        val hashCode45 = (hashCode44 + (str45?.hashCode() ?: 0)) * 31
        val str46 = subHD
        val hashCode46 = (hashCode45 + (str46?.hashCode() ?: 0)) * 31
        val str47 = seriesIMDBParent
        val hashCode47 = (hashCode46 + (str47?.hashCode() ?: 0)) * 31
        val str48 = subEncoding
        val hashCode48 = (hashCode47 + (str48?.hashCode() ?: 0)) * 31
        val str49 = subAutoTranslation
        val hashCode49 = (hashCode48 + (str49?.hashCode() ?: 0)) * 31
        val str50 = subForeignPartsOnly
        val hashCode50 = (hashCode49 + (str50?.hashCode() ?: 0)) * 31
        val str51 = subFromTrusted
        val hashCode51 = (hashCode50 + (str51?.hashCode() ?: 0)) * 31
        val num: Integer = QueryCached
        val hashCode52: Int = (hashCode51 + if (num == null) 0 else num.hashCode()) * 31
        val str52 = subTSGroupHash
        val hashCode53 = (hashCode52 + (str52?.hashCode() ?: 0)) * 31
        val str53 = subDownloadLink
        val hashCode54 = (hashCode53 + (str53?.hashCode() ?: 0)) * 31
        val str54 = zipDownloadLink
        val hashCode55 = (hashCode54 + (str54?.hashCode() ?: 0)) * 31
        val str55 = subtitlesLink
        val hashCode56 = (hashCode55 + (str55?.hashCode() ?: 0)) * 31
        val str56 = queryNumber
        val hashCode57 = (hashCode56 + (str56?.hashCode() ?: 0)) * 31
        val queryParameters = queryParameters
        val hashCode58 = (hashCode57 + (queryParameters?.hashCode() ?: 0)) * 31
        val d = score
        return hashCode58 + (d?.hashCode() ?: 0)
    }

    override fun toString(): String {
        return "MetaInfo(MatchedBy=" + matchedBy + ", IDSubMovieFile=" + iDSubMovieFile + ", MovieHash=" + movieHash + ", MovieByteSize=" + movieByteSize + ", MovieTimeMS=" + movieTimeMS + ", IDSubtitleFile=" + iDSubtitleFile + ", SubFileName=" + subFileName + ", SubActualCD=" + subActualCD + ", SubSize=" + subSize + ", SubHash=" + subHash + ", SubLastTS=" + subLastTS + ", SubTSGroup=" + subTSGroup + ", InfoReleaseGroup=" + infoReleaseGroup + ", InfoFormat=" + infoFormat + ", InfoOther=" + infoOther + ", IDSubtitle=" + iDSubtitle + ", UserID=" + userID + ", SubLanguageID=" + subLanguageID + ", SubFormat=" + subFormat + ", SubSumCD=" + subSumCD + ", SubAuthorComment=" + subAuthorComment + ", SubAddDate=" + subAddDate + ", SubBad=" + subBad + ", SubRating=" + subRating + ", SubSumVotes=" + subSumVotes + ", SubDownloadsCnt=" + subDownloadsCnt + ", MovieReleaseName=" + movieReleaseName + ", MovieFPS=" + movieFPS + ", IDMovie=" + iDMovie + ", IDMovieImdb=" + iDMovieImdb + ", MovieName=" + movieName + ", MovieNameEng=" + movieNameEng + ", MovieYear=" + movieYear + ", MovieImdbRating=" + movieImdbRating + ", SubFeatured=" + subFeatured + ", UserNickName=" + userNickName + ", SubTranslator=" + subTranslator + ", ISO639=" + iSO639 + ", LanguageName=" + languageName + ", SubComments=" + subComments + ", SubHearingImpaired=" + subHearingImpaired + ", UserRank=" + userRank + ", SeriesSeason=" + seriesSeason + ", SeriesEpisode=" + seriesEpisode + ", MovieKind=" + movieKind + ", SubHD=" + subHD + ", SeriesIMDBParent=" + seriesIMDBParent + ", SubEncoding=" + subEncoding + ", SubAutoTranslation=" + subAutoTranslation + ", SubForeignPartsOnly=" + subForeignPartsOnly + ", SubFromTrusted=" + subFromTrusted + ", QueryCached=" + QueryCached + ", SubTSGroupHash=" + subTSGroupHash + ", SubDownloadLink=" + subDownloadLink + ", ZipDownloadLink=" + zipDownloadLink + ", SubtitlesLink=" + subtitlesLink + ", QueryNumber=" + queryNumber + ", QueryParameters=" + queryParameters + ", Score=" + score + ')'
    }

    init {
        QueryCached = num
        subTSGroupHash = str52
        subDownloadLink = str53
        zipDownloadLink = str54
        subtitlesLink = str55
        queryNumber = str56
        this.queryParameters = queryParameters
        score = d
    }

    fun getQueryCached(): Integer {
        return QueryCached
    }
}