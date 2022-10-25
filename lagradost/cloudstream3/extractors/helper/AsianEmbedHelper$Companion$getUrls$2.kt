package com.lagradost.cloudstream3.extractors.helper

import android.util.Log
import org.jsoup.nodes.Element
import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: AsianEmbedHelper.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "", "it", "Lorg/jsoup/nodes/Element;", "kotlin.jvm.PlatformType"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.extractors.helper.AsianEmbedHelper\$Companion\$getUrls$2",
    m98f = "AsianEmbedHelper.kt",
    m97i = [0],
    m96l = [25],
    m95m = "invokeSuspend",
    m94n = ["datavid"],
    m93s = ["L$0"]
) /* loaded from: classes3.dex */
class `AsianEmbedHelper$Companion$getUrls$2`(/* synthetic */val `$url`: String,
                                                            function1: Function1<SubtitleFile, Unit>,
                                                            function12: Function1<ExtractorLink, Unit>,
                                                            continuation: Continuation<in `AsianEmbedHelper$Companion$getUrls$2`?>?
) : SuspendLambda(2, continuation), Function2<Element, Continuation<in Unit>?, Object> {
    /* synthetic */ val `$callback`: Function1<ExtractorLink, Unit>
    /* synthetic */ val `$subtitleCallback`: Function1<SubtitleFile, Unit>

    /* synthetic */
    var `L$0`: Object? = null
    var label = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$subtitleCallback` = function1
        `$callback` = function12
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        val `asianEmbedHelper$Companion$getUrls$2` = `AsianEmbedHelper$Companion$getUrls$2`(
            `$url`, `$subtitleCallback`, `$callback`, continuation
        )
        `asianEmbedHelper$Companion$getUrls$2`.`L$0` = obj
        return `asianEmbedHelper$Companion$getUrls$2`
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(element: Element, continuation: Continuation<in Unit>?): Object {
        return (create(
            element,
            continuation
        ) as `AsianEmbedHelper$Companion$getUrls$2`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        var obj: Object = obj
        val str: String?
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            var attr: String? = (`L$0` as Element?)!!.attr("data-video")
            if (attr == null) {
                attr = ""
            }
            if (!StringsKt.isBlank(attr)) {
                `L$0` = attr
                label = 1
                val loadExtractor: Object = ExtractorApiKt.loadExtractor(
                    attr,
                    `$url`,
                    `$subtitleCallback`,
                    `$callback`,
                    this
                )
                if (loadExtractor === coroutine_suspended) {
                    return coroutine_suspended
                }
                str = attr
                obj = loadExtractor
            }
            return Unit.INSTANCE
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            str = `L$0`
            ResultKt.throwOnFailure(obj)
        }
        val booleanValue: Boolean = (obj as Boolean).booleanValue()
        Log.i("AsianEmbed", "Result => ($booleanValue) (datavid) $str")
        return Unit.INSTANCE
    }
}