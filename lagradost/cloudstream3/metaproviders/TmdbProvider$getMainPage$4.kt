package com.lagradost.cloudstream3.metaproviders

import retrofit2.Call
import retrofit2.Response
import java.util.ArrayList
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: TmdbProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"],
    m107d2 = ["<anonymous>", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.metaproviders.TmdbProvider\$getMainPage$4",
    m98f = "TmdbProvider.kt",
    m97i = [],
    m96l = [bqk.f6543bC],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* loaded from: classes3.dex */
class `TmdbProvider$getMainPage$4`(
    objectRef: ObjectRef<List<MovieSearchResponse?>?>,
    tmdbProvider: TmdbProvider,
    continuation: Continuation<in `TmdbProvider$getMainPage$4`?>?
) : SuspendLambda(1, continuation), Function1<Continuation<in Unit>?, Object> {
    /* synthetic */ val `$topMovies`: ObjectRef<List<MovieSearchResponse>>
    var `L$0`: Object? = null
    var label = 0
    /* synthetic */ val `this$0`: TmdbProvider

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$topMovies` = objectRef
        `this$0` = tmdbProvider
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(continuation: Continuation<*>?): Continuation<Unit> {
        return `TmdbProvider$getMainPage$4`(`$topMovies`, `this$0`, continuation)
    }

    @Override // kotlin.jvm.functions.Function1
    override fun invoke(continuation: Continuation<in Unit>?): Object {
        return (create(continuation) as `TmdbProvider$getMainPage$4`).invokeSuspend(Unit.INSTANCE)
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        var obj: Object = obj
        val tmdb: Tmdb?
        val objectRef: ObjectRef<List<MovieSearchResponse>>?
        val t: T
        var iterable: Iterable
        var searchResponse: MovieSearchResponse
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            val objectRef2: ObjectRef<List<MovieSearchResponse>> = `$topMovies`
            tmdb = `this$0`.tmdb
            val call: Call<MovieResultsPage> =
                tmdb.moviesService().topRated(boxing.boxInt(1), "en-US", "US")
            Intrinsics.checkNotNullExpressionValue(
                call,
                "tmdb.moviesService().topRated(1, \"en-US\", \"US\")"
            )
            `L$0` = objectRef2
            label = 1
            val awaitResponse: Object = KotlinExtensions.awaitResponse(call, this)
            if (awaitResponse === coroutine_suspended) {
                return coroutine_suspended
            }
            objectRef = objectRef2
            obj = awaitResponse
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            objectRef = `L$0` as ObjectRef<*>?
            ResultKt.throwOnFailure(obj)
        }
        val movieResultsPage: MovieResultsPage = (obj as Response<*>).body() as MovieResultsPage
        if (movieResultsPage == null || movieResultsPage.results.also { iterable = it } == null) {
            t = CollectionsKt.emptyList<Any>()
        } else {
            val iterable2: Iterable<BaseMovie> = iterable
            val tmdbProvider = `this$0`
            val arrayList = ArrayList(CollectionsKt.collectionSizeOrDefault<Any>(iterable2, 10))
            for (it in iterable2) {
                Intrinsics.checkNotNullExpressionValue(it, "it")
                searchResponse = tmdbProvider.toSearchResponse(it)
                arrayList.add(searchResponse)
            }
            t = arrayList
        }
        objectRef.element = t
        return Unit.INSTANCE
    }
}