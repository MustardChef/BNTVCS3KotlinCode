package com.lagradost.cloudstream3.movieproviders

import java.util.ArrayList
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: FaselHDProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "Lcom/lagradost/cloudstream3/HomePageList;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.movieproviders.FaselHDProvider\$getMainPage\$pages$1",
    m98f = "FaselHDProvider.kt",
    m97i = [0],
    m96l = [46],
    m95m = "invokeSuspend",
    m94n = ["title"],
    m93s = ["L$0"]
)
/* loaded from: classes3.dex */
internal class `FaselHDProvider$getMainPage$pages$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */(/* synthetic */
    val `this$0`: FaselHDProvider,
    continuation: Continuation<in `FaselHDProvider$getMainPage$pages$1`?>?
) : SuspendLambda(2, continuation),
    Function2<Tuples<out String?, out String?>, Continuation<in HomePageList?>?, Object> {
    /* synthetic */
    var `L$0`: Object? = null
    var label = 0

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        val `faselHDProvider$getMainPage$pages$1` = `FaselHDProvider$getMainPage$pages$1`(
            `this$0`, continuation
        )
        `faselHDProvider$getMainPage$pages$1`.`L$0` = obj
        return `faselHDProvider$getMainPage$pages$1`
    }

    @Override // kotlin.jvm.functions.Function2
    /* bridge */ /* synthetic */  override fun invoke(
        tuples: Tuples<out String?, out String?>,
        continuation: Continuation<in HomePageList?>?
    ): Object {
        return invoke2(tuples as Tuples<String?, String?>, continuation)
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(
        tuples: Tuples<String?, String?>,
        continuation: Continuation<in HomePageList?>?
    ): Object {
        return (create(
            tuples,
            continuation
        ) as `FaselHDProvider$getMainPage$pages$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val str: String?
        val obj2: Object
        var searchResponse: SearchResponse
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            val tuples = `L$0` as Tuples<*, *>?
            str = tuples!!.component1() as String
            val str2 = tuples.component2() as String
            `L$0` = str
            label = 1
            obj2 = Requests.`get$default`(
                MainActivityKt.getApp(),
                str2,
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
            str = `L$0`
        }
        val select: Elements = (obj2 as NiceResponse).getDocument()
            .select("div[id=\"postList\"] div[class=\"col-xl-2 col-lg-2 col-md-3 col-sm-3\"]")
        Intrinsics.checkNotNullExpressionValue(
            select,
            "doc.select(\"div[id=\\\"pos…-2 col-md-3 col-sm-3\\\"]\")"
        )
        val faselHDProvider = `this$0`
        val arrayList = ArrayList()
        for (element in select) {
            Intrinsics.checkNotNullExpressionValue(element, "element")
            searchResponse = faselHDProvider.toSearchResponse(element)
            if (searchResponse != null) {
                arrayList.add(searchResponse)
            }
        }
        return HomePageList(str, arrayList, null, null, null, 28, null)
    }
}