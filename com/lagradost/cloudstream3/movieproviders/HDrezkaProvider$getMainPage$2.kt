package com.lagradost.cloudstream3.movieproviders

import com.lagradost.cloudstream3.mvvm.Resource
import java.util.ArrayList
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: HDrezkaProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u008a@"],
    m107d2 = ["<anonymous>", "Lcom/lagradost/cloudstream3/mvvm/Resource;", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.movieproviders.HDrezkaProvider\$getMainPage$2",
    m98f = "HDrezkaProvider.kt",
    m97i = [],
    m96l = [41],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
)
/* loaded from: classes3.dex */
internal class `HDrezkaProvider$getMainPage$2`(
    arrayList: ArrayList<HomePageList?>,
    hDrezkaProvider: HDrezkaProvider,
    continuation: Continuation<in `HDrezkaProvider$getMainPage$2`?>?
) : SuspendLambda(2, continuation),
    Function2<Tuples<out String?, out String?>, Continuation<in Resource<out Boolean?>?>?, Object> {
    /* synthetic */ val `$items`: ArrayList<HomePageList>

    /* synthetic */
    var `L$0`: Object? = null
    var label = 0
    /* synthetic */ val `this$0`: HDrezkaProvider

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$items` = arrayList
        `this$0` = hDrezkaProvider
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        val `hDrezkaProvider$getMainPage$2` =
            `HDrezkaProvider$getMainPage$2`(`$items`, `this$0`, continuation)
        `hDrezkaProvider$getMainPage$2`.`L$0` = obj
        return `hDrezkaProvider$getMainPage$2`
    }

    @Override // kotlin.jvm.functions.Function2
    /* bridge */ /* synthetic */  override fun invoke(
        tuples: Tuples<out String?, out String?>,
        continuation: Continuation<in Resource<out Boolean?>?>?
    ): Object {
        return invoke2(
            tuples as Tuples<String?, String?>,
            continuation as Continuation<in Resource<Boolean?>?>?
        )
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(
        tuples: Tuples<String?, String?>,
        continuation: Continuation<in Resource<Boolean?>?>?
    ): Object {
        return (create(
            tuples,
            continuation
        ) as `HDrezkaProvider$getMainPage$2`).invokeSuspend(Unit.INSTANCE)
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: HDrezkaProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\u008a@"],
        m107d2 = ["<anonymous>", ""],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    @DebugMetadata(
        m99c = "com.lagradost.cloudstream3.movieproviders.HDrezkaProvider\$getMainPage$2$1",
        m98f = "HDrezkaProvider.kt",
        m97i = [],
        m96l = [42],
        m95m = "invokeSuspend",
        m94n = [],
        m93s = []
    ) /* renamed from: com.lagradost.cloudstream3.movieproviders.HDrezkaProvider$getMainPage$2$1 */ /* loaded from: classes3.dex */
    class C48051 internal constructor(/* synthetic */val `$url`: String,
                                                     arrayList: ArrayList<HomePageList?>,
                                                     str2: String,
                                                     hDrezkaProvider: HDrezkaProvider,
                                                     continuation: Continuation<in C48051?>?
    ) : SuspendLambda(1, continuation), Function1<Continuation<in Boolean?>?, Object> {
        /* synthetic */ val `$header`: String
        /* synthetic */ val `$items`: ArrayList<HomePageList>
        var label = 0
        /* synthetic */ val `this$0`: HDrezkaProvider

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        init {
            `$items` = arrayList
            `$header` = str2
            `this$0` = hDrezkaProvider
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        override fun create(continuation: Continuation<*>?): Continuation<Unit> {
            return C48051(`$url`, `$items`, `$header`, `this$0`, continuation)
        }

        @Override // kotlin.jvm.functions.Function1
        override fun invoke(continuation: Continuation<in Boolean?>?): Object {
            return (create(continuation) as C48051).invokeSuspend(Unit.INSTANCE)
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        override fun invokeSuspend(obj: Object): Object {
            val obj2: Object
            var searchResult: SearchResponse
            val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
            val i = label
            if (i == 0) {
                ResultKt.throwOnFailure(obj)
                label = 1
                obj2 = Requests.`get$default`(
                    MainActivityKt.getApp(),
                    `$url`,
                    null,
                    null,
                    null,
                    null,
                    false,
                    0,
                    null,
                    0L,
                    null,
                    false,
                    this,
                    2046,
                    null
                )
                if (obj2 === coroutine_suspended) {
                    return coroutine_suspended
                }
            } else if (i != 1) {
                throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
            } else {
                ResultKt.throwOnFailure(obj)
                obj2 = obj
            }
            val select: Elements = (obj2 as NiceResponse).getDocument()
                .select("div.b-content__inline_items div.b-content__inline_item")
            Intrinsics.checkNotNullExpressionValue(
                select,
                "app.get(url).document.se…e_item\"\n                )"
            )
            val elements: Elements = select
            val hDrezkaProvider = `this$0`
            val arrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(elements, 10))
            for (it in elements) {
                Intrinsics.checkNotNullExpressionValue(it, "it")
                searchResult = hDrezkaProvider.toSearchResult(it)
                arrayList.add(searchResult)
            }
            return boxing.boxBoolean(
                `$items`.add(
                    HomePageList(
                        MainAPIKt.fixTitle(`$header`),
                        arrayList,
                        null,
                        null,
                        null,
                        28,
                        null
                    )
                )
            )
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        var obj: Object = obj
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            val tuples = `L$0` as Tuples<*, *>?
            val str = tuples!!.component2() as String
            val arrayList: ArrayList<HomePageList?> = `$items`
            label = 1
            obj = ArchComponentExt.safeApiCall(
                C48051(
                    str,
                    arrayList,
                    tuples.component1() as String,
                    `this$0`,
                    null
                ), this
            )
            if (obj === coroutine_suspended) {
                return coroutine_suspended
            }
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            ResultKt.throwOnFailure(obj)
        }
        return obj
    }
}