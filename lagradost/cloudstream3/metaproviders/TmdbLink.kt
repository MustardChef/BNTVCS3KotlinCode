package com.lagradost.cloudstream3.metaproviders

import com.lagradost.cloudstream3.utils.AppUtils.toJson
import com.lagradost.cloudstream3.ParCollections.argamap
import com.lagradost.cloudstream3.syncproviders.AccountManager.Companion.syncApis
import com.lagradost.cloudstream3.syncproviders.AccountManager.Companion.aniListApi
import com.lagradost.cloudstream3.AnimeLoadResponse.posterUrl
import com.lagradost.cloudstream3.syncproviders.SyncAPI.SyncResult.posterUrl
import com.lagradost.cloudstream3.AnimeLoadResponse.plot
import com.lagradost.cloudstream3.syncproviders.SyncAPI.SyncResult.synopsis
import com.lagradost.cloudstream3.AnimeLoadResponse.tags
import com.lagradost.cloudstream3.syncproviders.SyncAPI.SyncResult.genres
import com.lagradost.cloudstream3.AnimeLoadResponse.setRating
import com.lagradost.cloudstream3.syncproviders.SyncAPI.SyncResult.getPublicScore
import com.lagradost.cloudstream3.LoadResponse.Companion.addTrailer
import com.lagradost.cloudstream3.syncproviders.SyncAPI.SyncResult.trailerUrl
import com.lagradost.cloudstream3.LoadResponse.Companion.addAniListId
import com.lagradost.cloudstream3.syncproviders.SyncAPI.SyncResult.id
import com.lagradost.cloudstream3.AnimeLoadResponse.setRecommendations
import com.lagradost.cloudstream3.syncproviders.SyncAPI.SyncResult.recommendations
import com.lagradost.cloudstream3.APIHolder.apis
import com.lagradost.cloudstream3.MainAPI.getLang
import com.lagradost.cloudstream3.TvSeriesLoadResponse.posterUrl
import com.lagradost.cloudstream3.TvSeriesLoadResponse.setYear
import com.lagradost.cloudstream3.TvSeriesLoadResponse.plot
import com.lagradost.cloudstream3.TvSeriesLoadResponse.tags
import com.lagradost.cloudstream3.TvSeriesLoadResponse.setDuration
import com.lagradost.cloudstream3.TvSeriesLoadResponse.setRating
import com.lagradost.cloudstream3.TvSeriesLoadResponse.setRecommendations
import com.lagradost.cloudstream3.MovieLoadResponse.posterUrl
import com.lagradost.cloudstream3.MovieLoadResponse.setYear
import com.lagradost.cloudstream3.MovieLoadResponse.plot
import com.lagradost.cloudstream3.MovieLoadResponse.tags
import com.lagradost.cloudstream3.MovieLoadResponse.setDuration
import com.lagradost.cloudstream3.MovieLoadResponse.setRating
import com.lagradost.cloudstream3.MovieLoadResponse.setRecommendations
import com.lagradost.cloudstream3.MainAPI.supportedTypes
import com.lagradost.cloudstream3.APIHolder.getApiFromNameNull
import com.lagradost.cloudstream3.MainAPI.loadLinks
import com.lagradost.cloudstream3.mvvm.ArchComponentExt.logError
import com.lagradost.cloudstream3.MainAPI.mainUrl
import com.lagradost.cloudstream3.MainAPI.load
import com.fasterxml.jackson.annotation.JsonProperty
import com.lagradost.cloudstream3.metaproviders.TmdbLink
import kotlin.jvm.internal.DefaultConstructorMarker
import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.ProviderType
import com.uwetrottmann.tmdb2.Tmdb
import com.lagradost.cloudstream3.HomePageResponse
import com.lagradost.cloudstream3.metaproviders.TmdbProvider
import com.lagradost.cloudstream3.LoadResponse
import com.uwetrottmann.tmdb2.entities.TvSeason
import com.lagradost.cloudstream3.SearchResponse
import kotlin.text.StringsKt
import com.uwetrottmann.tmdb2.entities.BaseTvShow
import com.lagradost.cloudstream3.TvSeriesSearchResponse
import com.lagradost.cloudstream3.TvType
import com.uwetrottmann.tmdb2.entities.BaseMovie
import com.lagradost.cloudstream3.MovieSearchResponse
import com.uwetrottmann.tmdb2.entities.CastMember
import kotlin.Tuples
import com.uwetrottmann.tmdb2.entities.TvShow
import com.lagradost.cloudstream3.TvSeriesLoadResponse
import com.uwetrottmann.tmdb2.entities.Movie
import com.lagradost.cloudstream3.MovieLoadResponse
import com.lagradost.cloudstream3.MainAPIKt
import com.lagradost.cloudstream3.metaproviders.``TmdbProvider$toLoadResponse$2`
import kotlin.jvm.internal.Intrinsics

/* compiled from: TmdbProvider.kt */
@Metadata(
    m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u0017\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000c\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000c\u001a\u0004\b\u0010\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000c\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001e"],
    m107d2 = ["Lcom/lagradost/cloudstream3/metaproviders/TmdbLink;", "", "imdbID", "", "tmdbID", "", "episode", "season", "movieName", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getEpisode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getImdbID", "()Ljava/lang/String;", "getMovieName", "getSeason", "getTmdbID", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/lagradost/cloudstream3/metaproviders/TmdbLink;", "equals", "", "other", "hashCode", "toString", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class TmdbLink(
    @param:JsonProperty("imdbID") val imdbID: String,
    @JsonProperty("tmdbID") num: Integer,
    @JsonProperty("episode") num2: Integer?,
    @JsonProperty("season") num3: Integer?,
    @JsonProperty("movieName") str2: String?
) {
    private val episode: Integer?
    val movieName: String?
    private val season: Integer?
    private val tmdbID: Integer
    operator fun component1(): String {
        return imdbID
    }

    operator fun component2(): Integer {
        return tmdbID
    }

    operator fun component3(): Integer? {
        return episode
    }

    operator fun component4(): Integer? {
        return season
    }

    operator fun component5(): String? {
        return movieName
    }

    fun copy(
        @JsonProperty("imdbID") str: String,
        @JsonProperty("tmdbID") num: Integer,
        @JsonProperty("episode") num2: Integer?,
        @JsonProperty("season") num3: Integer?,
        @JsonProperty("movieName") str2: String?
    ): TmdbLink {
        return TmdbLink(str, num, num2, num3, str2)
    }

    override fun equals(obj: Object): Boolean {
        if (this === obj) {
            return true
        }
        if (obj is TmdbLink) {
            val tmdbLink = obj as TmdbLink
            return Intrinsics.areEqual(imdbID, tmdbLink.imdbID) && Intrinsics.areEqual(
                tmdbID, tmdbLink.tmdbID
            ) && Intrinsics.areEqual(episode, tmdbLink.episode) && Intrinsics.areEqual(
                season, tmdbLink.season
            ) && Intrinsics.areEqual(movieName, tmdbLink.movieName)
        }
        return false
    }

    override fun hashCode(): Int {
        val str = imdbID
        val hashCode = (str?.hashCode() ?: 0) * 31
        val num: Integer = tmdbID
        val hashCode2: Int = (hashCode + if (num == null) 0 else num.hashCode()) * 31
        val num2: Integer? = episode
        val hashCode3: Int = (hashCode2 + if (num2 == null) 0 else num2.hashCode()) * 31
        val num3: Integer? = season
        val hashCode4: Int = (hashCode3 + if (num3 == null) 0 else num3.hashCode()) * 31
        val str2 = movieName
        return hashCode4 + (str2?.hashCode() ?: 0)
    }

    override fun toString(): String {
        return "TmdbLink(imdbID=" + imdbID + ", tmdbID=" + tmdbID + ", episode=" + episode + ", season=" + season + ", movieName=" + movieName + ')'
    }

    init {
        tmdbID = num
        episode = num2
        season = num3
        movieName = str2
    }

    /* synthetic */   constructor(
        str: String,
        num: Integer,
        num2: Integer?,
        num3: Integer?,
        str2: String?,
        i: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(str, num, num2, num3, if (i and 16 != 0) null else str2) {
    }

    fun getTmdbID(): Integer {
        return tmdbID
    }

    fun getEpisode(): Integer? {
        return episode
    }

    fun getSeason(): Integer? {
        return season
    }

    companion object {
        fun  /* synthetic */`copy$default`(
            tmdbLink: TmdbLink,
            str: String,
            num: Integer,
            num2: Integer?,
            num3: Integer?,
            str2: String?,
            i: Int,
            obj: Object?
        ): TmdbLink {
            var str = str
            var num: Integer = num
            var num2: Integer? = num2
            var num3: Integer? = num3
            var str2 = str2
            if (i and 1 != 0) {
                str = tmdbLink.imdbID
            }
            if (i and 2 != 0) {
                num = tmdbLink.tmdbID
            }
            val num4: Integer = num
            if (i and 4 != 0) {
                num2 = tmdbLink.episode
            }
            val num5: Integer? = num2
            if (i and 8 != 0) {
                num3 = tmdbLink.season
            }
            val num6: Integer? = num3
            if (i and 16 != 0) {
                str2 = tmdbLink.movieName
            }
            return tmdbLink.copy(str, num4, num5, num6, str2)
        }
    }
}