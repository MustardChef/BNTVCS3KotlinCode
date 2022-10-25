package com.lagradost.cloudstream3.network

import com.lagradost.cloudstream3.utils.Coroutines.main
import com.lagradost.cloudstream3.AcraApplication.Companion.context
import com.lagradost.cloudstream3.MainActivityKt.getApp
import okhttp3.OkHttpClient
import okhttp3.dnsoverhttps.DnsOverHttps
import okhttp3.HttpUrl
import kotlin.collections.CollectionsKt
import com.lagradost.cloudstream3.network.DohProviders
import kotlin.collections.MapsKt
import kotlin.TuplesKt
import com.lagradost.cloudstream3.MainAPIKt
import com.lagradost.nicehttp.Requests
import androidx.preference.PreferenceManager
import com.bongngotv2.R
import com.lagradost.nicehttp.RequestsKt
import com.lagradost.cloudstream3.network.`RequestsHelperKt$getHeaders$cookieMap$1`
import com.lagradost.cloudstream3.network.RequestsHelper
import com.facebook.share.internal.ShareConstants
import okhttp3.Interceptor
import kotlinx.coroutines.BuildersKt__BuildersKt
import com.lagradost.cloudstream3.network.``DdosGuardKiller$intercept$1`
import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: WebViewResolver.kt */
@Metadata(m106k = 3, m105mv = [1, 6, 0], m103xi = 48)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.network.WebViewResolver",
    m98f = "WebViewResolver.kt",
    m97i = [0, 0, 0, 0, 0, 0],
    m96l = [192],
    m95m = "resolveUsingWebView",
    m94n = ["webView", "fixedRequest", "extraRequestList", "loop", "totalTime", "delayTime"],
    m93s = ["L$0", "L$1", "L$2", "I$0", "J$0", "J$1"]
) /* loaded from: classes3.dex */
class `WebViewResolver$resolveUsingWebView$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */(/* synthetic */
    val `this$0`: WebViewResolver,
    continuation: Continuation<in `WebViewResolver$resolveUsingWebView$1`?>?
) : ContinuationImpl(continuation) {
    var `I$0` = 0
    var `J$0`: Long = 0
    var `J$1`: Long = 0
    var `L$0`: Object? = null
    var `L$1`: Object? = null
    var `L$2`: Object? = null
    var label = 0

    /* synthetic */
    var result: Object? = null

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        result = obj
        label = label or Integer.MIN_VALUE
        return `this$0`.resolveUsingWebView(null, null, this)
    }
}