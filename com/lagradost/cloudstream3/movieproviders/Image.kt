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

/* compiled from: StreamingcommunityProvider.kt */
@Metadata(
    m108d1 = ["\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00052\b\b\u0003\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000cR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006 "],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/Image;", "", "imageableID", "", "imageableType", "", "serverID", "proxyID", "url", "type", "(JLjava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V", "getImageableID", "()J", "getImageableType", "()Ljava/lang/String;", "getProxyID", "getServerID", "getType", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class Image(
    @JsonProperty("imageable_id") j: Long,
    @JsonProperty("imageable_type") imageableType: String,
    @JsonProperty("server_id") j2: Long,
    @JsonProperty("proxy_id") j3: Long,
    @JsonProperty("url") url: String,
    @JsonProperty("type") type: String
) {
    val imageableID: Long
    val imageableType: String
    val proxyID: Long
    val serverID: Long
    val type: String
    val url: String
    operator fun component1(): Long {
        return imageableID
    }

    operator fun component2(): String {
        return imageableType
    }

    operator fun component3(): Long {
        return serverID
    }

    operator fun component4(): Long {
        return proxyID
    }

    operator fun component5(): String {
        return url
    }

    operator fun component6(): String {
        return type
    }

    fun copy(
        @JsonProperty("imageable_id") j: Long,
        @JsonProperty("imageable_type") imageableType: String,
        @JsonProperty("server_id") j2: Long,
        @JsonProperty("proxy_id") j3: Long,
        @JsonProperty("url") url: String,
        @JsonProperty("type") type: String
    ): Image {
        Intrinsics.checkNotNullParameter(imageableType, "imageableType")
        Intrinsics.checkNotNullParameter(url, "url")
        Intrinsics.checkNotNullParameter(type, "type")
        return Image(j, imageableType, j2, j3, url, type)
    }

    override fun equals(obj: Object): Boolean {
        if (this === obj) {
            return true
        }
        if (obj is Image) {
            val image = obj as Image
            return imageableID == image.imageableID && Intrinsics.areEqual(
                imageableType, image.imageableType
            ) && serverID == image.serverID && proxyID == image.proxyID && Intrinsics.areEqual(
                url, image.url
            ) && Intrinsics.areEqual(type, image.type)
        }
        return false
    }

    override fun hashCode(): Int {
        return ((((`C$r8$backportedMethods$utility$Long$1$hashCode`.hashCode(imageableID) * 31 + imageableType.hashCode()) * 31 + `C$r8$backportedMethods$utility$Long$1$hashCode`.hashCode(
            serverID
        )) * 31 + `C$r8$backportedMethods$utility$Long$1$hashCode`.hashCode(proxyID)) * 31 + url.hashCode()) * 31 + type.hashCode()
    }

    override fun toString(): String {
        return "Image(imageableID=" + imageableID + ", imageableType=" + imageableType + ", serverID=" + serverID + ", proxyID=" + proxyID + ", url=" + url + ", type=" + type + ')'
    }

    init {
        Intrinsics.checkNotNullParameter(imageableType, "imageableType")
        Intrinsics.checkNotNullParameter(url, "url")
        Intrinsics.checkNotNullParameter(type, "type")
        imageableID = j
        this.imageableType = imageableType
        serverID = j2
        proxyID = j3
        this.url = url
        this.type = type
    }
}