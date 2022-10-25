package com.lagradost.cloudstream3.extractors

import java.util.List
import kotlin.coroutines.Continuation

@Metadata(
    m108d1 = ["\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J)\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"],
    m107d2 = ["Lcom/lagradost/cloudstream3/extractors/Evoload;", "Lcom/lagradost/cloudstream3/utils/ExtractorApi;", "()V", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "name", "getName", "requiresReferer", "", "getRequiresReferer", "()Z", "getUrl", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "url", "referer", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.extractors.Evoload */ /* loaded from: classes3.dex */
open class Evolaod : ExtractorApi() {
    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    val name = "Evoload"

    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    val mainUrl = "https://www.evoload.io"

    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    val requiresReferer = true

    @Override // com.lagradost.cloudstream3.utils.ExtractorApi
    override fun getUrl(
        str: String?,
        str2: String?,
        continuation: Continuation<in List<ExtractorLink?>?>?
    ): Object {
        return `getUrl$suspendImpl`(this, str, str2, continuation as Continuation<*>?)
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */ /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */ /* JADX WARN: Removed duplicated region for block: B:36:0x0168 A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:37:0x0169  */ /* JADX WARN: Removed duplicated region for block: B:40:0x0203 A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:41:0x0204  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
        fun  /* synthetic */`getUrl$suspendImpl`(
            r31: Evolaod?,
            r32: String?,
            r33: String?,
            r34: Continuation<*>?
        ): Any {
            /*
            Method dump skipped, instructions count: 624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.extractors.Evolaod.getUrl\$suspendImpl(com.lagradost.cloudstream3.extractors.Evoload, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
        }
    }
}