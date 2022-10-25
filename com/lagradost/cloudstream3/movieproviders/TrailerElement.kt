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
    m108d1 = ["\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b<\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BÝ\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0016J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u00104\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jæ\u0001\u0010?\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020EHÖ\u0001J\t\u0010F\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000c\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b#\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b&\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0018R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b*\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0018R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b,\u0010\u001c¨\u0006G"],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TrailerElement;", "", "id", "", "url", "", "host", "videoableID", "videoableType", "createdAt", "updatedAt", "size", "createdBy", "serverID", "name", "quality", "originalName", "views", "public", "proxyID", "proxyDefaultID", "scwsID", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "getCreatedAt", "()Ljava/lang/String;", "getCreatedBy", "getHost", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getName", "getOriginalName", "()Ljava/lang/Object;", "getProxyDefaultID", "getProxyID", "getPublic", "getQuality", "getScwsID", "getServerID", "getSize", "getUpdatedAt", "getUrl", "getVideoableID", "getVideoableType", "getViews", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/lagradost/cloudstream3/movieproviders/TrailerElement;", "equals", "", "other", "hashCode", "", "toString", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class TrailerElement(/* renamed from: id */
    @param:JsonProperty("id") val id: Long?,
    @param:JsonProperty("url") val url: String?,
    @param:JsonProperty(
        "host"
    ) val host: String?,
    @param:JsonProperty("videoable_id") val videoableID: Long?,
    @param:JsonProperty(
        "videoable_type"
    ) val videoableType: String?,
    @param:JsonProperty("created_at") val createdAt: String?,
    @param:JsonProperty(
        "updated_at"
    ) val updatedAt: String?,
    @param:JsonProperty("size") val size: String?,
    @param:JsonProperty("created_by") val createdBy: String?,
    @param:JsonProperty(
        "server_id"
    ) val serverID: Long?,
    @param:JsonProperty("name") val name: String?,
    @param:JsonProperty("quality") val quality: String?,
    @JsonProperty("original_name") obj: Object?,
    @JsonProperty("views") l4: Long?,
    @JsonProperty("public") l5: Long?,
    @JsonProperty("proxy_id") obj2: Object?,
    @JsonProperty("proxy_default_id") obj3: Object?,
    @JsonProperty("scws_id") obj4: Object?
) {

    private val originalName: Object?
    private val proxyDefaultID: Object?
    private val proxyID: Object?

    /* renamed from: public  reason: not valid java name */
    val public: Long?
    private val scwsID: Object?
    val views: Long?
    operator fun component1(): Long? {
        return id
    }

    operator fun component10(): Long? {
        return serverID
    }

    operator fun component11(): String? {
        return name
    }

    operator fun component12(): String? {
        return quality
    }

    operator fun component13(): Object? {
        return originalName
    }

    operator fun component14(): Long? {
        return views
    }

    operator fun component15(): Long? {
        return public
    }

    operator fun component16(): Object? {
        return proxyID
    }

    operator fun component17(): Object? {
        return proxyDefaultID
    }

    operator fun component18(): Object? {
        return scwsID
    }

    operator fun component2(): String? {
        return url
    }

    operator fun component3(): String? {
        return host
    }

    operator fun component4(): Long? {
        return videoableID
    }

    operator fun component5(): String? {
        return videoableType
    }

    operator fun component6(): String? {
        return createdAt
    }

    operator fun component7(): String? {
        return updatedAt
    }

    operator fun component8(): String? {
        return size
    }

    operator fun component9(): String? {
        return createdBy
    }

    fun copy(
        @JsonProperty("id") l: Long?,
        @JsonProperty("url") str: String?,
        @JsonProperty("host") str2: String?,
        @JsonProperty("videoable_id") l2: Long?,
        @JsonProperty("videoable_type") str3: String?,
        @JsonProperty("created_at") str4: String?,
        @JsonProperty("updated_at") str5: String?,
        @JsonProperty("size") str6: String?,
        @JsonProperty("created_by") str7: String?,
        @JsonProperty("server_id") l3: Long?,
        @JsonProperty("name") str8: String?,
        @JsonProperty("quality") str9: String?,
        @JsonProperty("original_name") obj: Object?,
        @JsonProperty("views") l4: Long?,
        @JsonProperty("public") l5: Long?,
        @JsonProperty("proxy_id") obj2: Object?,
        @JsonProperty("proxy_default_id") obj3: Object?,
        @JsonProperty("scws_id") obj4: Object?
    ): TrailerElement {
        return TrailerElement(
            l,
            str,
            str2,
            l2,
            str3,
            str4,
            str5,
            str6,
            str7,
            l3,
            str8,
            str9,
            obj,
            l4,
            l5,
            obj2,
            obj3,
            obj4
        )
    }

    override fun equals(obj: Object): Boolean {
        if (this === obj) {
            return true
        }
        if (obj is TrailerElement) {
            val trailerElement = obj as TrailerElement
            return Intrinsics.areEqual(id, trailerElement.id) && Intrinsics.areEqual(
                url, trailerElement.url
            ) && Intrinsics.areEqual(host, trailerElement.host) && Intrinsics.areEqual(
                videoableID, trailerElement.videoableID
            ) && Intrinsics.areEqual(
                videoableType, trailerElement.videoableType
            ) && Intrinsics.areEqual(
                createdAt, trailerElement.createdAt
            ) && Intrinsics.areEqual(
                updatedAt, trailerElement.updatedAt
            ) && Intrinsics.areEqual(size, trailerElement.size) && Intrinsics.areEqual(
                createdBy, trailerElement.createdBy
            ) && Intrinsics.areEqual(
                serverID, trailerElement.serverID
            ) && Intrinsics.areEqual(name, trailerElement.name) && Intrinsics.areEqual(
                quality, trailerElement.quality
            ) && Intrinsics.areEqual(
                originalName, trailerElement.originalName
            ) && Intrinsics.areEqual(
                views, trailerElement.views
            ) && Intrinsics.areEqual(public, trailerElement.public) && Intrinsics.areEqual(
                proxyID, trailerElement.proxyID
            ) && Intrinsics.areEqual(
                proxyDefaultID, trailerElement.proxyDefaultID
            ) && Intrinsics.areEqual(
                scwsID, trailerElement.scwsID
            )
        }
        return false
    }

    override fun hashCode(): Int {
        val l = id
        val hashCode = (l?.hashCode() ?: 0) * 31
        val str = url
        val hashCode2 = (hashCode + (str?.hashCode() ?: 0)) * 31
        val str2 = host
        val hashCode3 = (hashCode2 + (str2?.hashCode() ?: 0)) * 31
        val l2 = videoableID
        val hashCode4 = (hashCode3 + (l2?.hashCode() ?: 0)) * 31
        val str3 = videoableType
        val hashCode5 = (hashCode4 + (str3?.hashCode() ?: 0)) * 31
        val str4 = createdAt
        val hashCode6 = (hashCode5 + (str4?.hashCode() ?: 0)) * 31
        val str5 = updatedAt
        val hashCode7 = (hashCode6 + (str5?.hashCode() ?: 0)) * 31
        val str6 = size
        val hashCode8 = (hashCode7 + (str6?.hashCode() ?: 0)) * 31
        val str7 = createdBy
        val hashCode9 = (hashCode8 + (str7?.hashCode() ?: 0)) * 31
        val l3 = serverID
        val hashCode10 = (hashCode9 + (l3?.hashCode() ?: 0)) * 31
        val str8 = name
        val hashCode11 = (hashCode10 + (str8?.hashCode() ?: 0)) * 31
        val str9 = quality
        val hashCode12 = (hashCode11 + (str9?.hashCode() ?: 0)) * 31
        val obj: Object? = originalName
        val hashCode13: Int = (hashCode12 + if (obj == null) 0 else obj.hashCode()) * 31
        val l4 = views
        val hashCode14 = (hashCode13 + (l4?.hashCode() ?: 0)) * 31
        val l5 = public
        val hashCode15 = (hashCode14 + (l5?.hashCode() ?: 0)) * 31
        val obj2: Object? = proxyID
        val hashCode16: Int = (hashCode15 + if (obj2 == null) 0 else obj2.hashCode()) * 31
        val obj3: Object? = proxyDefaultID
        val hashCode17: Int = (hashCode16 + if (obj3 == null) 0 else obj3.hashCode()) * 31
        val obj4: Object? = scwsID
        return hashCode17 + if (obj4 != null) obj4.hashCode() else 0
    }

    override fun toString(): String {
        return "TrailerElement(id=" + id + ", url=" + url + ", host=" + host + ", videoableID=" + videoableID + ", videoableType=" + videoableType + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", size=" + size + ", createdBy=" + createdBy + ", serverID=" + serverID + ", name=" + name + ", quality=" + quality + ", originalName=" + originalName + ", views=" + views + ", public=" + public + ", proxyID=" + proxyID + ", proxyDefaultID=" + proxyDefaultID + ", scwsID=" + scwsID + ')'
    }

    init {
        originalName = obj
        views = l4
        public = l5
        proxyID = obj2
        proxyDefaultID = obj3
        scwsID = obj4
    }

    @JvmOverloads
            /* synthetic */   constructor(
        l: Long? = null,
        str: String? = null,
        str2: String? = null,
        l2: Long? = null,
        str3: String? = null,
        str4: String? = null,
        str5: String? = null,
        str6: String? = null,
        str7: String? = null,
        l3: Long? = null,
        str8: String? = null,
        str9: String? = null,
        obj: Object? = null,
        l4: Long? = null,
        l5: Long? = null,
        obj2: Object? = null,
        obj3: Object? = null,
        obj4: Object? = null,
        i: Int = 262143,
        defaultConstructorMarker: DefaultConstructorMarker? = null
    ) : this(
        if (i and 1 != 0) null else l,
        if (i and 2 != 0) null else str,
        if (i and 4 != 0) null else str2,
        if (i and 8 != 0) null else l2,
        if (i and 16 != 0) null else str3,
        if (i and 32 != 0) null else str4,
        if (i and 64 != 0) null else str5,
        if (i and 128 != 0) null else str6,
        if (i and 256 != 0) null else str7,
        if (i and 512 != 0) null else l3,
        if (i and 1024 != 0) null else str8,
        if (i and 2048 != 0) null else str9,
        if (i and 4096 != 0) null else obj,
        if (i and 8192 != 0) null else l4,
        if (i and 16384 != 0) null else l5,
        if (i and 32768 != 0) null else obj2,
        if (i and 65536 != 0) null else obj3,
        if (i and 131072 != 0) null else obj4
    ) {
    }

    fun getOriginalName(): Object? {
        return originalName
    }

    fun getProxyID(): Object? {
        return proxyID
    }

    fun getProxyDefaultID(): Object? {
        return proxyDefaultID
    }

    fun getScwsID(): Object? {
        return scwsID
    }
}