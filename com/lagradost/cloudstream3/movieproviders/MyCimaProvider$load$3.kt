package com.lagradost.cloudstream3.movieproviders

import org.jsoup.nodes.Element
import java.util.ArrayList
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: MyCimaProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "", "it", "Lorg/jsoup/nodes/Element;", "kotlin.jvm.PlatformType"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.movieproviders.MyCimaProvider\$load$3",
    m98f = "MyCimaProvider.kt",
    m97i = [],
    m96l = [],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* loaded from: classes3.dex */
class `MyCimaProvider$load$3`(
    arrayList: ArrayList<Episode?>,
    num: Integer,
    myCimaProvider: MyCimaProvider,
    continuation: Continuation<in `MyCimaProvider$load$3`?>?
) : SuspendLambda(2, continuation), Function2<Element, Continuation<in Boolean?>?, Object> {
    /* synthetic */ val `$episodes`: ArrayList<Episode>
    /* synthetic */ val `$season`: Integer

    /* synthetic */
    var `L$0`: Object? = null
    var label = 0
    /* synthetic */ val `this$0`: MyCimaProvider

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$episodes` = arrayList
        `$season` = num
        `this$0` = myCimaProvider
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        val `myCimaProvider$load$3` =
            `MyCimaProvider$load$3`(`$episodes`, `$season`, `this$0`, continuation)
        `myCimaProvider$load$3`.`L$0` = obj
        return `myCimaProvider$load$3`
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(element: Element, continuation: Continuation<in Boolean?>?): Object {
        return (create(
            element,
            continuation
        ) as `MyCimaProvider$load$3`).invokeSuspend(Unit.INSTANCE)
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val intFromText: Integer
        IntrinsicsKt.getCOROUTINE_SUSPENDED()
        if (label == 0) {
            ResultKt.throwOnFailure(obj)
            val element = `L$0` as Element?
            val arrayList: ArrayList<Episode> = `$episodes`
            val attr: String = element!!.attr(ShareConstants.WEB_DIALOG_PARAM_HREF)
            Intrinsics.checkNotNullExpressionValue(attr, "it.attr(\"href\")")
            val text: String = element.text()
            val num: Integer = `$season`
            val myCimaProvider = `this$0`
            val text2: String = element.text()
            Intrinsics.checkNotNullExpressionValue(text2, "it.text()")
            intFromText = myCimaProvider.getIntFromText(text2)
            return boxing.boxBoolean(
                arrayList.add(
                    Episode(
                        attr,
                        text,
                        num,
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
        }
        throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
    }
}