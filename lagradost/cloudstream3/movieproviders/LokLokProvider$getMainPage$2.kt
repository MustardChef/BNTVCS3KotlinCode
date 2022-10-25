package com.lagradost.cloudstream3.movieproviders

import java.util.ArrayList
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: LokLokProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001H\u008a@"],
    m107d2 = ["<anonymous>", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.movieproviders.LokLokProvider\$getMainPage$2",
    m98f = "LokLokProvider.kt",
    m97i = [],
    m96l = [115],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* loaded from: classes3.dex */
class `LokLokProvider$getMainPage$2`(
    objectRef: ObjectRef<ArrayList<HomePageList?>?>,
    lokLokProvider: LokLokProvider,
    continuation: Continuation<in `LokLokProvider$getMainPage$2`?>?
) : SuspendLambda(1, continuation), Function1<Continuation<in Object?>?, Object> {
    /* synthetic */ val `$responseFirstPage`: ObjectRef<ArrayList<HomePageList>>
    var `L$0`: Object? = null
    var `L$1`: Object? = null
    var `L$2`: Object? = null
    var label = 0
    /* synthetic */ val `this$0`: LokLokProvider

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$responseFirstPage` = objectRef
        `this$0` = lokLokProvider
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(continuation: Continuation<*>?): Continuation<Unit> {
        return `LokLokProvider$getMainPage$2`(`$responseFirstPage`, `this$0`, continuation)
    }

    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override fun invoke(continuation: Continuation<in Object?>?): Object {
        return invoke2(continuation as Continuation<Object?>?)
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(continuation: Continuation<Object?>?): Object {
        return (create(continuation) as `LokLokProvider$getMainPage$2`).invokeSuspend(Unit.INSTANCE)
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val obj2: Object
        val gson: Gson?
        val arrayList: ArrayList<HomePageList>?
        val lokLokProvider: LokLokProvider?
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            val arrayList2: ArrayList<HomePageList> = `$responseFirstPage`.element
            val lokLokProvider2 = `this$0`
            val gson2 = Gson()
            `L$0` = arrayList2
            `L$1` = lokLokProvider2
            `L$2` = gson2
            label = 1
            obj2 = Requests.`get$default`(
                MainActivityKt.getApp(),
                "https://ga-mobile-api.loklok.tv/cms/app/homePage/getHome?page=0",
                LokLokProvider.Companion.Companion.getHEADER_DEFAULT(),
                null,
                null,
                null,
                false,
                4,
                TimeUnit.HOURS,
                0L,
                null,
                false,
                this,
                1852,
                null
            )
            if (obj2 === coroutine_suspended) {
                return coroutine_suspended
            }
            gson = gson2
            arrayList = arrayList2
            lokLokProvider = lokLokProvider2
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            gson = `L$2` as Gson?
            lokLokProvider = `L$1`
            ResultKt.throwOnFailure(obj)
            arrayList = `L$0` as ArrayList?
            obj2 = obj
        }
        val fromJson: Object = gson.fromJson<Any>(
            (obj2 as NiceResponse).getText(),
            HomeResponse::class.java as Class<Object?>
        )
        Intrinsics.checkNotNullExpressionValue(
            fromJson,
            "Gson().fromJson<HomeResp…ava\n                    )"
        )
        return boxing.boxBoolean(arrayList.addAll(lokLokProvider!!.toHomePageList(fromJson as HomeResponse)))
    }
}