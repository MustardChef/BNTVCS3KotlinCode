package com.lagradost.cloudstream3.movieproviders

import com.fasterxml.jackson.core.type.TypeReference
import com.lagradost.cloudstream3.utils.AppUtils
import java.util.List
import kotlin.coroutines.Continuation

/* compiled from: TrailersTwoProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"],
    m107d2 = ["<anonymous>", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.movieproviders.TrailersTwoProvider\$loadLinks$2",
    m98f = "TrailersTwoProvider.kt",
    m97i = [],
    m96l = [168],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
)
/* loaded from: classes3.dex */
internal class `TrailersTwoProvider$loadLinks$2`(/* synthetic */val `$subtitleUrl`: String?,
                                                                function1: Function1<SubtitleFile?, Unit>,
                                                                continuation: Continuation<in `TrailersTwoProvider$loadLinks$2`?>?
) : SuspendLambda(1, continuation), Function1<Continuation<in Unit>?, Object> {
    /* synthetic */ val `$subtitleCallback`: Function1<SubtitleFile?, Unit>
    var label = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$subtitleCallback` = function1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(continuation: Continuation<*>?): Continuation<Unit> {
        return `TrailersTwoProvider$loadLinks$2`(`$subtitleUrl`, `$subtitleCallback`, continuation)
    }

    @Override // kotlin.jvm.functions.Function1
    override fun invoke(continuation: Continuation<in Unit>?): Object {
        return (create(continuation) as `TrailersTwoProvider$loadLinks$2`).invokeSuspend(Unit.INSTANCE)
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val obj2: Object
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            label = 1
            obj2 = Requests.`get$default`(
                MainActivityKt.getApp(),
                `$subtitleUrl`,
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
        val text: String = (obj2 as NiceResponse).getText()
        val appUtils = AppUtils.INSTANCE
        val function1: Function1<SubtitleFile, Unit> = `$subtitleCallback`
        for (trailersSubtitleFile in MainAPIKt.getMapper().readValue(
            text,
            object :
                TypeReference<List<TrailersSubtitleFile?>?>() { // from class: com.lagradost.cloudstream3.movieproviders.TrailersTwoProvider$loadLinks$2$invokeSuspend$$inlined$parseJson$1
            })) {
            val subtitleHelper: SubtitleHelper = SubtitleHelper.INSTANCE
            var languageCode: String = trailersSubtitleFile.languageCode
            if (languageCode == null) {
                languageCode = "en"
            }
            var fromTwoLettersToLanguage: String =
                subtitleHelper.fromTwoLettersToLanguage(languageCode)
            if (fromTwoLettersToLanguage == null) {
                fromTwoLettersToLanguage = "English"
            }
            val str = fromTwoLettersToLanguage
            val sb = StringBuilder()
            sb.append("https://trailers.to/subtitles/")
            val contentHash: String = trailersSubtitleFile.contentHash
            if (contentHash != null) {
                sb.append(contentHash)
                sb.append(JsonPointer.SEPARATOR)
                val languageCode2: String = trailersSubtitleFile.languageCode
                if (languageCode2 != null) {
                    sb.append(languageCode2)
                    sb.append(".vtt")
                    function1.invoke(SubtitleFile(str, sb.toString(), null, 4, null))
                }
            }
        }
        return Unit.INSTANCE
    }
}