package com.lagradost.cloudstream3.animeproviders

import com.lagradost.cloudstream3.MainAPIKt.fixUrl
import com.lagradost.cloudstream3.MainAPIKt.`newAnimeSearchResponse$default`
import com.lagradost.cloudstream3.MainAPIKt.fixUrlNull
import com.lagradost.cloudstream3.movieproviders.SflixProvider.Companion.runSflixExtractorVerifierJob
import com.lagradost.cloudstream3.utils.ExtractorLink.url
import com.lagradost.cloudstream3.utils.Coroutines.ioSafe
import com.lagradost.cloudstream3.AnimeLoadResponse.japName
import com.lagradost.cloudstream3.AnimeLoadResponse.engName
import com.lagradost.cloudstream3.AnimeLoadResponse.posterUrl
import com.lagradost.cloudstream3.AnimeLoadResponse.setYear
import com.lagradost.cloudstream3.MainAPIKt.addEpisodes
import com.lagradost.cloudstream3.AnimeLoadResponse.showStatus
import com.lagradost.cloudstream3.AnimeLoadResponse.plot
import com.lagradost.cloudstream3.AnimeLoadResponse.tags
import com.lagradost.cloudstream3.AnimeLoadResponse.setRecommendations
import com.lagradost.cloudstream3.AnimeLoadResponse.actors
import com.lagradost.cloudstream3.AnimeSearchResponse.posterUrl
import com.lagradost.cloudstream3.MainAPIKt.addDubStatus
import com.lagradost.cloudstream3.AnimeLoadResponse.setRating
import com.lagradost.cloudstream3.AnimeLoadResponse.setType
import com.lagradost.cloudstream3.AnimeLoadResponse.getType
import com.lagradost.cloudstream3.AnimeLoadResponse.setDuration
import com.lagradost.cloudstream3.MainAPIKt.getDurationFromString
import com.lagradost.cloudstream3.MainAPIKt.base64Decode
import com.lagradost.cloudstream3.utils.ExtractorApi.Companion.`getUrl$default`
import com.lagradost.cloudstream3.utils.ExtractorApiKt.loadExtractor
import com.lagradost.cloudstream3.Episode.name
import com.lagradost.cloudstream3.Episode.setEpisode
import com.lagradost.cloudstream3.MainActivityKt.getApp
import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.TvType
import kotlin.collections.SetsKt
import kotlin.text.Regex
import kotlin.jvm.internal.DefaultConstructorMarker
import kotlin.text.StringsKt
import com.lagradost.cloudstream3.ShowStatus
import com.lagradost.cloudstream3.SearchResponse
import kotlin.text.MatchResult
import com.lagradost.cloudstream3.animeproviders.ZoroProvider
import com.facebook.share.internal.ShareConstants
import com.lagradost.cloudstream3.MainAPIKt
import com.google.android.gms.cast.MediaTrack
import com.lagradost.cloudstream3.animeproviders.``ZoroProvider$toSearchResult$1`
import okhttp3.Call
import okhttp3.Request
import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: ZoroProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"],
    m107d2 = ["<anonymous>", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.animeproviders.ZoroProvider\$getVideoInterceptor$1$1",
    m98f = "ZoroProvider.kt",
    m97i = [0],
    m96l = [371],
    m95m = "invokeSuspend",
    m94n = ["\$this\$await\$iv"],
    m93s = ["L$0"]
) /* loaded from: classes3.dex */
class `ZoroProvider$getVideoInterceptor$1$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */(/* synthetic */
    val `$options`: Request, continuation: Continuation<in `ZoroProvider$getVideoInterceptor$1$1`?>?
) : SuspendLambda(1, continuation), Function1<Continuation<in Unit>?, Object> {
    var `L$0`: Object? = null
    var label = 0

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(continuation: Continuation<*>?): Continuation<Unit> {
        return `ZoroProvider$getVideoInterceptor$1$1`(`$options`, continuation)
    }

    @Override // kotlin.jvm.functions.Function1
    override fun invoke(continuation: Continuation<in Unit>?): Object {
        return (create(continuation) as `ZoroProvider$getVideoInterceptor$1$1`).invokeSuspend(Unit.INSTANCE)
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            val companion: Requests.Companion = Requests.Companion
            val newCall: Call = MainActivityKt.getApp().getBaseClient().newCall(
                `$options`
            )
            `L$0` = newCall
            label = 1
            val `zoroProvider$getVideoInterceptor$1$1` = this
            val cancellableContinuationImpl: CancellableContinuationImpl<*> =
                CancellableContinuationImpl<Any?>(
                    IntrinsicsKt.intercepted<Any>(`zoroProvider$getVideoInterceptor$1$1`), 1
                )
            cancellableContinuationImpl.initCancellability()
            val cancellableContinuationImpl2: CancellableContinuationImpl<*> =
                cancellableContinuationImpl
            val continuationCallback = ContinuationCallback(newCall, cancellableContinuationImpl2)
            newCall.enqueue(continuationCallback)
            cancellableContinuationImpl2.invokeOnCancellation(continuationCallback)
            val result: Object = cancellableContinuationImpl.getResult()
            if (result === IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbes.probeCoroutineSuspended(`zoroProvider$getVideoInterceptor$1$1`)
            }
            if (result === coroutine_suspended) {
                return coroutine_suspended
            }
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            val call = `L$0` as Call?
            ResultKt.throwOnFailure(obj)
        }
        return Unit.INSTANCE
    }
}