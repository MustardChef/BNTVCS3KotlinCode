package com.lagradost.nicehttp

import okhttp3.dnsoverhttps.DnsOverHttps
import kotlin.collections.CollectionsKt
import com.lagradost.nicehttp.Requests
import com.lagradost.nicehttp.Session.CustomCookieJar
import kotlin.collections.MapsKt
import kotlin.TuplesKt
import com.google.firebase.analytics.FirebaseAnalytics
import com.facebook.internal.NativeProtocol
import com.google.android.exoplayer2.text.ttml.TtmlNode
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants
import kotlin.jvm.JvmOverloads
import kotlin.jvm.internal.DefaultConstructorMarker
import com.fasterxml.jackson.databind.ObjectMapper
import kotlin.jvm.internal.InlineMarker
import kotlinx.coroutines.CancellableContinuationImpl
import kotlin.coroutines.intrinsics.IntrinsicsKt
import com.lagradost.nicehttp.ContinuationCallback
import kotlin.coroutines.jvm.internal.DebugProbes
import com.lagradost.nicehttp.NiceFile
import com.lagradost.nicehttp.NiceResponse
import androidx.browser.trusted.sharing.ShareTarget
import com.fasterxml.jackson.databind.DeserializationFeature
import com.facebook.share.internal.ShareConstants
import kotlin.Tuples
import kotlin.text.StringsKt
import kotlin.ranges.RangesKt
import com.lagradost.nicehttp.RequestsKt
import com.lagradost.nicehttp.RequestBodyTypes
import kotlin.text.Typography
import com.lagradost.nicehttp.`RequestsKt$getHeaders$cookieMap$1`
import com.lagradost.nicehttp.`$$Lambda$RequestsKt$bAfRwzknvdCXxHGMsD5sJemaoQ`
import androidx.exifinterface.media.ExifInterface
import com.google.common.net.HttpHeaders
import kotlin.LazyKt
import com.lagradost.nicehttp.``NiceResponse$text$2`
import okhttp3.*
import kotlin.jvm.internal.Intrinsics

/* compiled from: Requests.kt */
@Metadata(
    m108d1 = ["\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"],
    m107d2 = ["Lcom/lagradost/nicehttp/CacheInterceptor;", "Lokhttp3/Interceptor;", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor\$Chain;", "library_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class CacheInterceptor : Interceptor {
    @Override // okhttp3.Interceptor
    override fun intercept(chain: Interceptor.Chain): Response {
        Intrinsics.checkNotNullParameter(chain, "chain")
        return chain.proceed(chain.request()).newBuilder().removeHeader("Cache-Control")
            .removeHeader(
                HttpHeaders.PRAGMA
            ).addHeader("Cache-Control", CacheControl.FORCE_CACHE.toString()).build()
    }
}