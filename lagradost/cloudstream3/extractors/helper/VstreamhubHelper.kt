package com.lagradost.cloudstream3.extractors.helper

import com.lagradost.cloudstream3.SubtitleFile
import com.lagradost.cloudstream3.utils.ExtractorLink
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.DefaultConstructorMarker

/* compiled from: VstreamhubHelper.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"],
    m107d2 = ["Lcom/lagradost/cloudstream3/extractors/helper/VstreamhubHelper;", "", "()V", "Companion", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
object VstreamhubHelper {
    val Companion = Companion(null)
    private const val baseUrl = "https://vstreamhub.com"
    private const val baseName = "Vstreamhub"

    /* compiled from: VstreamhubHelper.kt */
    @Metadata(
        m108d1 = ["\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JA\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\n2\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"],
        m107d2 = ["Lcom/lagradost/cloudstream3/extractors/helper/VstreamhubHelper\$Companion;", "", "()V", "baseName", "", "baseUrl", "getUrls", "", "url", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */ /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */ /* JADX WARN: Removed duplicated region for block: B:24:0x00d3  */ /* JADX WARN: Removed duplicated region for block: B:27:0x00e9  */ /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        fun getUrls(
            r31: String?,
            r32: Function1<in SubtitleFile?, Unit>?,
            r33: Function1<in ExtractorLink?, Unit>?,
            r34: Continuation<in Unit>?
        ): Any {
            /*
                Method dump skipped, instructions count: 582
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.extractors.helper.VstreamhubHelper.Companion.getUrls(java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
        }
    }
}