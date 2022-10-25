package com.lagradost.cloudstream3.movieproviders

import java.util.ArrayList
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: LokLokProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"],
    m107d2 = ["<anonymous>", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.movieproviders.LokLokProvider\$getMainPage$8",
    m98f = "LokLokProvider.kt",
    m97i = [],
    m96l = [177],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* loaded from: classes3.dex */
class `LokLokProvider$getMainPage$8`(
    arrayList: ArrayList<Page?>,
    lokLokProvider: LokLokProvider,
    arrayList2: ArrayList<Page?>,
    objectRef: ObjectRef<String?>,
    objectRef2: ObjectRef<String?>,
    continuation: Continuation<in `LokLokProvider$getMainPage$8`?>?
) : SuspendLambda(1, continuation), Function1<Continuation<in Unit>?, Object> {
    /* synthetic */ val `$listMenuMovies`: ArrayList<Page>
    /* synthetic */ val `$listMenuTvShow`: ArrayList<Page>
    /* synthetic */ val `$menuTitleMovie`: ObjectRef<String>
    /* synthetic */ val `$menuTitleTvShow`: ObjectRef<String>
    var `L$0`: Object? = null
    var label = 0
    /* synthetic */ val `this$0`: LokLokProvider

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$listMenuTvShow` = arrayList
        `this$0` = lokLokProvider
        `$listMenuMovies` = arrayList2
        `$menuTitleTvShow` = objectRef
        `$menuTitleMovie` = objectRef2
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(continuation: Continuation<*>?): Continuation<Unit> {
        return `LokLokProvider$getMainPage$8`(
            `$listMenuTvShow`,
            `this$0`,
            `$listMenuMovies`,
            `$menuTitleTvShow`,
            `$menuTitleMovie`,
            continuation
        )
    }

    @Override // kotlin.jvm.functions.Function1
    override fun invoke(continuation: Continuation<in Unit>?): Object {
        return (create(continuation) as `LokLokProvider$getMainPage$8`).invokeSuspend(Unit.INSTANCE)
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val withCustomCache: Object
        val gson: Gson?
        var obj2: Object?
        var obj3: Object?
        var z: Boolean
        var z2: Boolean
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            val gson2 = Gson()
            val app: RequestCustom = MainActivityKt.getApp()
            val header_default: Map<String, String> =
                LokLokProvider.Companion.Companion.getHEADER_DEFAULT()
            val timeUnit: TimeUnit = TimeUnit.HOURS
            `L$0` = gson2
            label = 1
            withCustomCache = app.getWithCustomCache(
                LokLokProvider.Companion.URL_GET_CATEGORY,
                if (r30 and 2 !== 0) MapsKt.emptyMap<Any, Any>() else header_default,
                if (r30 and 4 !== 0) null else null,
                if (r30 and 8 !== 0) MapsKt.emptyMap<Any, Any>() else null,
                if (r30 and 16 !== 0) MapsKt.emptyMap<Any, Any>() else null,
                r30 and 32 !== 0,
                if (r30 and 64 !== 0) app.getDefaultCacheTime() else 4,
                if (r30 and 128 !== 0) app.getDefaultCacheTimeUnit() else timeUnit,
                if (r30 and 256 !== 0) app.getDefaultTimeOut() else 0L,
                if (r30 and 512 !== 0) null else null,
                r30 and 1024 !== 0,
                this
            )
            if (withCustomCache === coroutine_suspended) {
                return coroutine_suspended
            }
            gson = gson2
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            gson = `L$0` as Gson?
            ResultKt.throwOnFailure(obj)
            withCustomCache = obj
        }
        val homeCategoryResponse: HomeCategoryResponse = gson.fromJson<Any>(
            (withCustomCache as NiceResponse).getText(),
            HomeCategoryResponse::class.java as Class<Object?>
        ) as HomeCategoryResponse
        val arrayList: ArrayList<Page> = `$listMenuTvShow`
        val lokLokProvider = `this$0`
        Intrinsics.checkNotNullExpressionValue(homeCategoryResponse, "homeCategoryResponse")
        arrayList.addAll(lokLokProvider.toListTvShowPage(homeCategoryResponse, `this$0`.getName()))
        val arrayList2: ArrayList<Page> = `$listMenuMovies`
        val lokLokProvider2 = `this$0`
        arrayList2.addAll(
            lokLokProvider2.toListMoviesPage(
                homeCategoryResponse,
                lokLokProvider2.getName()
            )
        )
        val objectRef: ObjectRef<String> = `$menuTitleTvShow`
        val it: Iterator<T> = homeCategoryResponse.getData().iterator()
        while (true) {
            if (!it.hasNext()) {
                obj2 = null
                break
            }
            obj2 = it.next()
            if ((obj2 as DataCategory?).getId() == 2) {
                z2 = true
                continue
            } else {
                z2 = false
                continue
            }
            if (z2) {
                break
            }
        }
        val dataCategory: DataCategory? = obj2 as DataCategory?
        objectRef.element = if (dataCategory != null) dataCategory.getName() else 0
        val objectRef2: ObjectRef<String> = `$menuTitleMovie`
        val it2: Iterator<T> = homeCategoryResponse.getData().iterator()
        while (true) {
            if (!it2.hasNext()) {
                obj3 = null
                break
            }
            obj3 = it2.next()
            if ((obj3 as DataCategory?).getId() == 1) {
                z = true
                continue
            } else {
                z = false
                continue
            }
            if (z) {
                break
            }
        }
        val dataCategory2: DataCategory? = obj3 as DataCategory?
        objectRef2.element = if (dataCategory2 != null) dataCategory2.getName() else 0
        return Unit.INSTANCE
    }
}