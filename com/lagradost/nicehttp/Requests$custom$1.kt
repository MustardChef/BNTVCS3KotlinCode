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
import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: Requests.kt */
@Metadata(m106k = 3, m105mv = [1, 6, 0], m103xi = 48)
@DebugMetadata(
    m99c = "com.lagradost.nicehttp.Requests",
    m98f = "Requests.kt",
    m97i = [0],
    m96l = [581],
    m95m = "custom",
    m94n = ["\$this\$await\$iv"],
    m93s = ["L$0"]
) /* loaded from: classes4.dex */
class `Requests$custom$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */(/* synthetic */
    val `this$0`: Requests, continuation: Continuation<in `Requests$custom$1`?>?
) : ContinuationImpl(continuation) {
    var `L$0`: Object? = null
    var label = 0

    /* synthetic */
    var result: Object? = null

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        result = obj
        label = label or Integer.MIN_VALUE
        return `this$0`.custom(
            null,
            null,
            null,
            null,
            null,
            null,
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
            this
        )
    }
}