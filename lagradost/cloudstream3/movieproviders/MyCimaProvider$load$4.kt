package com.lagradost.cloudstream3.movieproviders

import com.fasterxml.jackson.core.type.TypeReference
import com.lagradost.cloudstream3.utils.AppUtils
import java.util.ArrayList
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: MyCimaProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "", "it", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.movieproviders.MyCimaProvider\$load$4",
    m98f = "MyCimaProvider.kt",
    m97i = [],
    m96l = [194],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* loaded from: classes3.dex */
class `MyCimaProvider$load$4`(
    num: Integer,
    myCimaProvider: MyCimaProvider,
    elements: Elements,
    arrayList: ArrayList<Episode?>,
    num2: Integer,
    continuation: Continuation<in `MyCimaProvider$load$4`?>?
) : SuspendLambda(2, continuation), Function2<Integer, Continuation<in Unit>?, Object> {
    /* synthetic */ val `$episodes`: ArrayList<Episode>
    /* synthetic */ val `$moreButton`: Elements
    /* synthetic */ val `$season`: Integer
    /* synthetic */ val `$totals`: Integer

    /* synthetic */
    var `L$0`: Object? = null
    var label = 0
    /* synthetic */ val `this$0`: MyCimaProvider

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$totals` = num
        `this$0` = myCimaProvider
        `$moreButton` = elements
        `$episodes` = arrayList
        `$season` = num2
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        val `myCimaProvider$load$4` = `MyCimaProvider$load$4`(
            `$totals`,
            `this$0`,
            `$moreButton`,
            `$episodes`,
            `$season`,
            continuation
        )
        `myCimaProvider$load$4`.`L$0` = obj
        return `myCimaProvider$load$4`
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(num: Integer, continuation: Continuation<in Unit>?): Object {
        return (create(num, continuation) as `MyCimaProvider$load$4`).invokeSuspend(Unit.INSTANCE)
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val obj2: Object
        var intFromText: Integer
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            val num: Integer? = `L$0` as Integer?
            if (num != null) {
                val intValue: Int = num.intValue()
                val num2: Integer = `$totals`
                Intrinsics.checkNotNull(num2)
                if (intValue > num2.intValue()) {
                    return Unit.INSTANCE
                }
                label = 1
                obj2 = Requests.`get$default`(
                    MainActivityKt.getApp(),
                    `this$0`.getMainUrl()
                        .toString() + "/AjaxCenter/MoreEpisodes/" + `$moreButton`.attr("data-term") + JsonPointer.SEPARATOR + num,
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
            }
            return Unit.INSTANCE
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            ResultKt.throwOnFailure(obj)
            obj2 = obj
        }
        val appUtils = AppUtils.INSTANCE
        val output: String = (MainAPIKt.getMapper().readValue(
            (obj2 as NiceResponse).getText(),
            object :
                TypeReference<MoreEPS?>() { // from class: com.lagradost.cloudstream3.movieproviders.MyCimaProvider$load$4$invokeSuspend$$inlined$parseJson$1
            }) as MoreEPS).getOutput()
        val select: Elements = Jsoup.parse(
            if (output != null) StringsKt.`replace$default`(
                output,
                "\\",
                "",
                false,
                4,
                null as Object?
            ) else null
        ).select("a")
        Intrinsics.checkNotNullExpressionValue(select, "document.select(\"a\")")
        val elements: Elements = select
        val arrayList: ArrayList<Episode> = `$episodes`
        val num3: Integer = `$season`
        val myCimaProvider = `this$0`
        var arrayList2 = ArrayList(CollectionsKt.collectionSizeOrDefault(elements, 10))
        for (element in elements) {
            val attr: String = element.attr(ShareConstants.WEB_DIALOG_PARAM_HREF)
            Intrinsics.checkNotNullExpressionValue(attr, "it.attr(\"href\")")
            val text: String = element.text()
            val text2: String = element.text()
            Intrinsics.checkNotNullExpressionValue(text2, "it.text()")
            intFromText = myCimaProvider.getIntFromText(text2)
            val arrayList3: ArrayList = arrayList2
            arrayList3.add(
                boxing.boxBoolean(
                    arrayList.add(
                        Episode(
                            attr,
                            text,
                            num3,
                            intFromText,
                            null,
                            null,
                            null,
                            null,
                            240,
                            null
                        )
                    )
                )
            )
            arrayList2 = arrayList3
        }
        return Unit.INSTANCE
    }
}