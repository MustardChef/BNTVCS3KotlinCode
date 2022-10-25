package com.lagradost.cloudstream3.movieproviders

import java.util.ArrayList
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: AkwamProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "Lcom/lagradost/cloudstream3/HomePageList;", "it", "Lkotlin/Pair;", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.movieproviders.AkwamProvider\$getMainPage\$pages$1",
    m98f = "AkwamProvider.kt",
    m97i = [0],
    m96l = [45],
    m95m = "invokeSuspend",
    m94n = ["it"],
    m93s = ["L$0"]
)
/* loaded from: classes3.dex */
internal class `AkwamProvider$getMainPage$pages$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */(/* synthetic */
    val `this$0`: AkwamProvider,
    continuation: Continuation<in `AkwamProvider$getMainPage$pages$1`?>?
) : SuspendLambda(2, continuation),
    Function2<Tuples<out String?, out String?>, Continuation<in HomePageList?>?, Object> {
    /* synthetic */
    var `L$0`: Object? = null
    var label = 0

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        val `akwamProvider$getMainPage$pages$1` =
            `AkwamProvider$getMainPage$pages$1`(`this$0`, continuation)
        `akwamProvider$getMainPage$pages$1`.`L$0` = obj
        return `akwamProvider$getMainPage$pages$1`
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
        return (create(tuples, continuation) as `AkwamProvider$getMainPage$pages$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val obj2: Object
        val tuples: Tuples<*, *>?
        var searchResponse: SearchResponse
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            val tuples2 = `L$0` as Tuples<*, *>?
            `L$0` = tuples2
            label = 1
            obj2 = Requests.`get$default`(
                MainActivityKt.getApp(),
                tuples2!!.second as String,
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
            tuples = tuples2
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            tuples = `L$0`
            ResultKt.throwOnFailure(obj)
            obj2 = obj
        }
        val select: Elements =
            (obj2 as NiceResponse).getDocument().select("div.col-lg-auto.col-md-4.col-6.mb-12")
        Intrinsics.checkNotNullExpressionValue(
            select,
            "doc.select(\"div.col-lg-auto.col-md-4.col-6.mb-12\")"
        )
        val akwamProvider = `this$0`
        val arrayList = ArrayList()
        for (element in select) {
            Intrinsics.checkNotNullExpressionValue(element, "element")
            searchResponse = akwamProvider.toSearchResponse(element)
            if (searchResponse != null) {
                arrayList.add(searchResponse)
            }
        }
        return HomePageList(tuples!!.first as String, arrayList, null, null, null, 28, null)
    }
}