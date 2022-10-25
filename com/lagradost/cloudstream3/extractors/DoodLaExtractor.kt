package com.lagradost.cloudstream3.extractors

import java.util.List
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: DoodExtractor.kt */
@Metadata(
    m108d1 = ["\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0016J+\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u0014\u0010\u000c\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"],
    m107d2 = ["Lcom/lagradost/cloudstream3/extractors/DoodLaExtractor;", "Lcom/lagradost/cloudstream3/utils/ExtractorApi;", "()V", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "requiresReferer", "", "getRequiresReferer", "()Z", "getExtractorUrl", "id", "getUrl", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "url", "referer", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes3.dex */
open class DoodLaExtractor : ExtractorApi() {
    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    val requiresReferer = false

    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    var name = "DoodStream"
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    open var mainUrl = "https://dood.la"
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    @Override // com.lagradost.cloudstream3.utils.ExtractorApi
    override fun getUrl(
        str: String?,
        str2: String?,
        continuation: Continuation<in List<ExtractorLink?>?>?
    ): Object {
        return `getUrl$suspendImpl`(this, str, str2, continuation as Continuation<*>?)
    }

    @Override // com.lagradost.cloudstream3.utils.ExtractorApi
    override fun getExtractorUrl(id: String): String {
        Intrinsics.checkNotNullParameter(id, "id")
        return "$mainUrl/d/$id"
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */ /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
        fun  /* synthetic */`getUrl$suspendImpl`(
            r26: DoodLaExtractor?,
            r27: String?,
            r28: String?,
            r29: Continuation<*>?
        ): Any {
            /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.extractors.DoodLaExtractor.getUrl\$suspendImpl(com.lagradost.cloudstream3.extractors.DoodLaExtractor, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
        }
    }
}