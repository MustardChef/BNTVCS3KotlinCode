package com.lagradost.cloudstream3.movieproviders

import java.util.ArrayList
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: CimaNowProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"],
    m107d2 = ["<anonymous>", "", "", "it", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.movieproviders.CimaNowProvider\$search$4",
    m98f = "CimaNowProvider.kt",
    m97i = [],
    m96l = [73],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* loaded from: classes3.dex */
class `CimaNowProvider$search$4`(/* synthetic */val `this$0`: CimaNowProvider, /* synthetic */
                                                val `$query`: String,
                                                arrayList: ArrayList<SearchResponse?>,
                                                continuation: Continuation<in `CimaNowProvider$search$4`?>?
) : SuspendLambda(2, continuation), Function2<Integer, Continuation<in List<Unit>?>?, Object> {
    /* synthetic */ val `$result`: ArrayList<SearchResponse>

    /* synthetic */
    var `I$0` = 0
    var label = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$result` = arrayList
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        val `cimaNowProvider$search$4` =
            `CimaNowProvider$search$4`(`this$0`, `$query`, `$result`, continuation)
        `cimaNowProvider$search$4`.`I$0` = (obj as Number).intValue()
        return `cimaNowProvider$search$4`
    }

    override fun invoke(i: Int, continuation: Continuation<in List<Unit>?>?): Object {
        return (create(
            Integer.valueOf(i),
            continuation
        ) as `CimaNowProvider$search$4`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.jvm.functions.Function2
    /* bridge */ /* synthetic */  override fun invoke(
        num: Integer,
        continuation: Continuation<in List<Unit>?>?
    ): Object {
        return invoke(num.intValue(), continuation)
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val obj2: Object
        var searchResponse: SearchResponse
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            val i2 = `I$0`
            val app: RequestCustom = MainActivityKt.getApp()
            label = 1
            obj2 = Requests.`get$default`(
                app,
                `this$0`.getMainUrl().toString() + "/page/" + i2 + "/?s=" + `$query` + '\"',
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
        val select: Elements = (obj2 as NiceResponse).getDocument().select("section article a")
        Intrinsics.checkNotNullExpressionValue(
            select,
            "app.get(\"\$mainUrl/page/$…lect(\"section article a\")"
        )
        val elements: Elements = select
        val cimaNowProvider = `this$0`
        val arrayList: ArrayList<SearchResponse> = `$result`
        val arrayList2 = ArrayList(CollectionsKt.collectionSizeOrDefault(elements, 10))
        for (element in elements) {
            val postUrl: String = element.attr(ShareConstants.WEB_DIALOG_PARAM_HREF)
            val select2: Elements = element.select("li[aria-label=\"episode\"]")
            Intrinsics.checkNotNullExpressionValue(
                select2,
                "element.select(\"li[aria-label=\\\"episode\\\"]\")"
            )
            if (!!select2.isEmpty()) {
                Intrinsics.checkNotNullExpressionValue(postUrl, "postUrl")
                if (!Regex(
                        cimaNowProvider.getMainUrl()
                            .toString() + "/expired-download/|" + cimaNowProvider.getMainUrl() + "/افلام-اون-لاين/"
                    ).containsMatchIn(postUrl)
                ) {
                    Intrinsics.checkNotNullExpressionValue(element, "element")
                    searchResponse = cimaNowProvider.toSearchResponse(element)
                    Intrinsics.checkNotNull(searchResponse)
                    arrayList.add(searchResponse)
                }
            }
            arrayList2.add(Unit.INSTANCE)
        }
        return arrayList2
    }
}