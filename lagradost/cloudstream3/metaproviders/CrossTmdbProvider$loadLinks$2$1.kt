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

/* compiled from: CrossTmdbProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.metaproviders.CrossTmdbProvider\$loadLinks$2$1",
    m98f = "CrossTmdbProvider.kt",
    m97i = [],
    m96l = [45],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
)
/* loaded from: classes3.dex */
internal class `CrossTmdbProvider$loadLinks$2$1`(/* synthetic */val `$isCasting`: Boolean,
                                                                function1: Function1<SubtitleFile?, Unit>,
                                                                function12: Function1<ExtractorLink?, Unit>,
                                                                continuation: Continuation<in `CrossTmdbProvider$loadLinks$2$1`?>?
) : SuspendLambda(2, continuation),
    Function2<Tuples<out String?, out String?>, Continuation<in Object?>?, Object> {
    /* synthetic */ val `$callback`: Function1<ExtractorLink?, Unit>
    /* synthetic */ val `$subtitleCallback`: Function1<SubtitleFile?, Unit>

    /* synthetic */
    var `L$0`: Object? = null
    var label = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$subtitleCallback` = function1
        `$callback` = function12
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        val `crossTmdbProvider$loadLinks$2$1` = `CrossTmdbProvider$loadLinks$2$1`(
            `$isCasting`,
            `$subtitleCallback`,
            `$callback`,
            continuation
        )
        `crossTmdbProvider$loadLinks$2$1`.`L$0` = obj
        return `crossTmdbProvider$loadLinks$2$1`
    }

    @Override // kotlin.jvm.functions.Function2
    /* bridge */ /* synthetic */  override fun invoke(
        tuples: Tuples<out String?, out String?>,
        continuation: Continuation<in Object?>?
    ): Object {
        return invoke2(tuples as Tuples<String?, String?>, continuation as Continuation<Object?>?)
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(tuples: Tuples<String?, String?>, continuation: Continuation<Object?>?): Object {
        return (create(tuples, continuation) as `CrossTmdbProvider$loadLinks$2$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        var obj: Object = obj
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        return try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj)
                val tuples = `L$0` as Tuples<*, *>?
                val str = tuples!!.component2() as String
                val apiFromNameNull: MainAPI =
                    APIHolder.INSTANCE.getApiFromNameNull(tuples.component1() as String)
                        ?: return null
                val z = `$isCasting`
                val function1: Function1<SubtitleFile?, Unit> = `$subtitleCallback`
                val function12: Function1<ExtractorLink?, Unit> = `$callback`
                label = 1
                obj = apiFromNameNull.loadLinks(str, z, function1, function12, this)
                if (obj === coroutine_suspended) {
                    return coroutine_suspended
                }
            } else if (i != 1) {
                throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
            } else {
                ResultKt.throwOnFailure(obj)
            }
            obj
        } catch (e: Exception) {
            ArchComponentExt.logError(e)
            Unit.INSTANCE
        }
    }
}