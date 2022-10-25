package com.lagradost.cloudstream3.extractors

import java.util.Locale
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: VidSrcExtractor.kt */
@Metadata(
    m108d1 = ["\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JK\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u000c2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000cH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"],
    m107d2 = ["Lcom/lagradost/cloudstream3/extractors/VidSrcExtractor2;", "Lcom/lagradost/cloudstream3/extractors/VidSrcExtractor;", "()V", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "getUrl", "", "url", "referer", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class VidSrcExtractor2 : VidSrcExtractor() {
    // com.lagradost.cloudstream3.extractors.VidSrcExtractor, com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    override val mainUrl = "https://vidsrc.me/embed"

    @Override // com.lagradost.cloudstream3.extractors.VidSrcExtractor, com.lagradost.cloudstream3.utils.ExtractorApi
    override fun getUrl(
        str: String,
        str2: String?,
        function1: Function1<SubtitleFile?, Unit>?,
        function12: Function1<ExtractorLink?, Unit>?,
        continuation: Continuation<in Unit>?
    ): Object? {
        val lowerCase: String = str.toLowerCase(Locale.ROOT)
        Intrinsics.checkNotNullExpressionValue(
            lowerCase,
            "this as java.lang.String).toLowerCase(Locale.ROOT)"
        )
        val url: Object = super.getUrl(
            StringsKt.`replace$default`(
                lowerCase,
                mainUrl,
                super.getMainUrl(),
                false,
                4,
                null as Object?
            ), str2, function1, function12, continuation
        )
        return if (url === IntrinsicsKt.getCOROUTINE_SUSPENDED()) url else Unit.INSTANCE
    }
}