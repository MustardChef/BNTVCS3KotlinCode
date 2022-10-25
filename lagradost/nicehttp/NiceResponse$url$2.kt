package com.lagradost.nicehttp

import okhttp3.OkHttpClient
import okhttp3.dnsoverhttps.DnsOverHttps
import okhttp3.HttpUrl
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
import okhttp3.RequestBody
import okhttp3.Interceptor
import com.lagradost.nicehttp.NiceResponse
import androidx.browser.trusted.sharing.ShareTarget
import com.fasterxml.jackson.databind.DeserializationFeature
import com.facebook.share.internal.ShareConstants
import kotlin.Tuples
import kotlin.text.StringsKt
import kotlin.ranges.RangesKt
import com.lagradost.nicehttp.RequestsKt
import okhttp3.FormBody
import com.lagradost.nicehttp.RequestBodyTypes
import okhttp3.MultipartBody
import kotlin.text.Typography
import okhttp3.CacheControl
import com.lagradost.nicehttp.`RequestsKt$getHeaders$cookieMap$1`
import com.lagradost.nicehttp.`$$Lambda$RequestsKt$bAfRwzknvdCXxHGMsD5sJemaoQ`
import androidx.exifinterface.media.ExifInterface
import kotlin.LazyKt
import com.lagradost.nicehttp.``NiceResponse$text$2`
import kotlin.jvm.functions.Functions

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: Requests.kt */
@Metadata(
    m108d1 = ["\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"],
    m107d2 = ["<anonymous>", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class `NiceResponse$url$2`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */(  /* synthetic */
    val `this$0`: NiceResponse
) : Lambda<Any?>(0), Functions<String?> {
    @Override // kotlin.jvm.functions.Functions
    override fun invoke(): String {
        return `this$0`.okhttpResponse.request().url().toString()
    }
}