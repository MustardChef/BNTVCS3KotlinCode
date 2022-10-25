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
import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: TmdbProvider.kt */
@Metadata(m106k = 3, m105mv = [1, 6, 0], m103xi = 48)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.metaproviders.TmdbProvider",
    m98f = "TmdbProvider.kt",
    m97i = [0],
    m96l = [359],
    m95m = "search\$suspendImpl",
    m94n = ["this"],
    m93s = ["L$0"]
) /* loaded from: classes3.dex */
class `TmdbProvider$search$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */(/* synthetic */
    val `this$0`: TmdbProvider, continuation: Continuation<in `TmdbProvider$search$1`?>?
) : ContinuationImpl(continuation) {
    var `L$0`: Object? = null
    var label = 0

    /* synthetic */
    var result: Object? = null

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        result = obj
        label = label or Integer.MIN_VALUE
        return TmdbProvider.Companion.`search$suspendImpl`(
            `this$0`,
            null as String?,
            this as Continuation<*>
        )
    }
}