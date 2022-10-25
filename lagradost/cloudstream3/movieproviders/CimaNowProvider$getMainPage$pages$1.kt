package com.lagradost.cloudstream3.movieproviders

import org.jsoup.nodes.Element
import java.util.ArrayList
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: CimaNowProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "Lcom/lagradost/cloudstream3/HomePageList;", "it", "Lorg/jsoup/nodes/Element;", "kotlin.jvm.PlatformType"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.movieproviders.CimaNowProvider\$getMainPage\$pages$1",
    m98f = "CimaNowProvider.kt",
    m97i = [],
    m96l = [],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* loaded from: classes3.dex */
class `CimaNowProvider$getMainPage$pages$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */(/* synthetic */
    val `this$0`: CimaNowProvider,
    continuation: Continuation<in `CimaNowProvider$getMainPage$pages$1`?>?
) : SuspendLambda(2, continuation), Function2<Element, Continuation<in HomePageList?>?, Object> {
    /* synthetic */
    var `L$0`: Object? = null
    var label = 0

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        val `cimaNowProvider$getMainPage$pages$1` = `CimaNowProvider$getMainPage$pages$1`(
            `this$0`, continuation
        )
        `cimaNowProvider$getMainPage$pages$1`.`L$0` = obj
        return `cimaNowProvider$getMainPage$pages$1`
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(element: Element, continuation: Continuation<in HomePageList?>?): Object {
        return (create(
            element,
            continuation
        ) as `CimaNowProvider$getMainPage$pages$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        var searchResponse: SearchResponse?
        IntrinsicsKt.getCOROUTINE_SUSPENDED()
        if (label == 0) {
            ResultKt.throwOnFailure(obj)
            val element = `L$0` as Element?
            val html: String = element.select(TtmlNode.TAG_SPAN).html()
            Intrinsics.checkNotNullExpressionValue(html, "it.select(\"span\").html()")
            val replace: String = Regex("<em>.*| <i c.*").replace(html, "")
            val select: Elements = element.select("a")
            Intrinsics.checkNotNullExpressionValue(select, "it.select(\"a\")")
            val cimaNowProvider = `this$0`
            val arrayList = ArrayList()
            for (it in select) {
                val attr: String = it.attr(ShareConstants.WEB_DIALOG_PARAM_HREF)
                Intrinsics.checkNotNullExpressionValue(attr, "it.attr(\"href\")")
                searchResponse = if (Regex(
                        cimaNowProvider.getMainUrl()
                            .toString() + "/category/|" + cimaNowProvider.getMainUrl() + "/الاكثر-مشاهدة/"
                    ).containsMatchIn(attr)
                ) {
                    null
                } else {
                    Intrinsics.checkNotNullExpressionValue(it, "it")
                    cimaNowProvider.toSearchResponse(it)
                }
                if (searchResponse != null) {
                    arrayList.add(searchResponse)
                }
            }
            return HomePageList(replace, arrayList, null, null, null, 28, null)
        }
        throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
    }
}