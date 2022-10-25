package com.lagradost.cloudstream3.extractors

import com.lagradost.cloudstream3.utils.ExtractorApiKt.loadExtractor
import com.lagradost.cloudstream3.ParCollections.argamap
import com.lagradost.cloudstream3.utils.M3u8Helper.Companion.Companion.`generateM3u8$default`
import com.lagradost.cloudstream3.utils.ExtractorApi.Companion.`getSafeUrl$default`
import com.lagradost.cloudstream3.MainActivityKt.getApp
import com.lagradost.cloudstream3.utils.ExtractorApiKt.getQualityFromName
import com.lagradost.cloudstream3.utils.ExtractorApiKt.extractorApis
import com.lagradost.cloudstream3.utils.ExtractorApi.requiresReferer
import com.lagradost.cloudstream3.utils.ExtractorApi.mainUrl
import com.lagradost.cloudstream3.utils.ExtractorApi.getSafeUrl
import com.lagradost.cloudstream3.extractors.helper.WcoHelper
import com.lagradost.cloudstream3.extractors.helper.WcoHelper.Companion.ExternalKeys
import com.lagradost.cloudstream3.extractors.helper.WcoHelper.Companion.NewExternalKeys
import kotlin.jvm.internal.DefaultConstructorMarker
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.jvm.JvmOverloads
import com.lagradost.cloudstream3.extractors.helper.AsianEmbedHelper
import com.lagradost.cloudstream3.SubtitleFile
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.extractors.helper.VstreamhubHelper
import kotlin.coroutines.jvm.internal.DebugMetadata
import com.lagradost.cloudstream3.extractors.helper.``WcoHelper$Companion$getKeys$1`
import kotlin.coroutines.Continuation

/* compiled from: VidSrcExtractor.kt */
@Metadata(
    m108d1 = ["\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JK\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u00132\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f0\u0013H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"],
    m107d2 = ["Lcom/lagradost/cloudstream3/extractors/VidSrcExtractor;", "Lcom/lagradost/cloudstream3/utils/ExtractorApi;", "()V", "absoluteUrl", "", "mainUrl", "getMainUrl", "()Ljava/lang/String;", "name", "getName", "requiresReferer", "", "getRequiresReferer", "()Z", "getUrl", "", "url", "referer", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes3.dex */
open class VidSrcExtractor : ExtractorApi() {
    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    val requiresReferer = false

    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    val name = "VidSrc"
    val absoluteUrl = "https://v2.vidsrc.me"

    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    val mainUrl = "https://v2.vidsrc.me/embed"

    @Override // com.lagradost.cloudstream3.utils.ExtractorApi
    open fun getUrl(
        str: String,
        str2: String?,
        function1: Function1<in SubtitleFile?, Unit>?,
        function12: Function1<in ExtractorLink?, Unit>?,
        continuation: Continuation<in Unit>?
    ): Object? {
        return `getUrl$suspendImpl`(
            this,
            str,
            str2,
            function1 as Function1<*, *>?,
            function12 as Function1<*, *>?,
            continuation as Continuation<*>?
        )
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: Can't wrap try/catch for region: R(7:(1:24)|25|26|27|28|29|(1:31)(8:33|14|15|16|17|18|19|(2:40|41)(0))) */ /* JADX WARN: Can't wrap try/catch for region: R(9:10|(3:11|12|13)|14|15|16|17|18|19|(2:21|(7:24|25|26|27|28|29|(1:31)(8:33|14|15|16|17|18|19|(2:40|41)(0)))(4:23|18|19|(0)(0)))(0)) */ /* JADX WARN: Code restructure failed: missing block: B:37:0x01a3, code lost:
        r2 = r27;
     */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x01b5, code lost:
        r4 = r0;
        r15 = r2;
        r7 = r17;
        r5 = r18;
        r8 = r20;
        r3 = r21;
        r2 = r24;
        r6 = r28;
     */
        /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */ /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */ /* JADX WARN: Removed duplicated region for block: B:26:0x00fc  */ /* JADX WARN: Removed duplicated region for block: B:44:0x01e5  */ /* JADX WARN: Type inference failed for: r0v10 */ /* JADX WARN: Type inference failed for: r0v16, types: [java.util.Collection] */ /* JADX WARN: Type inference failed for: r0v18 */ /* JADX WARN: Type inference failed for: r0v3 */ /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0188 -> B:53:0x0196). Please submit an issue!!! */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x01c3 -> B:41:0x01cb). Please submit an issue!!! */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x01cd -> B:43:0x01df). Please submit an issue!!! */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
        fun  /* synthetic */`getUrl$suspendImpl`(
            r30: VidSrcExtractor?,
            r31: String?,
            r32: String?,
            r33: Function1<*, *>?,
            r34: Function1<*, *>?,
            r35: Continuation<*>?
        ): Any {
            /*
            Method dump skipped, instructions count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.extractors.VidSrcExtractor.getUrl\$suspendImpl(com.lagradost.cloudstream3.extractors.VidSrcExtractor, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
        }
    }
}