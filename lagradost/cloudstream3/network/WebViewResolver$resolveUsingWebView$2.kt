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
import okhttp3.Request
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: WebViewResolver.kt */
@Metadata(
    m108d1 = ["\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"],
    m107d2 = ["<anonymous>", "", "it", "Lokhttp3/Request;", "invoke", "(Lokhttp3/Request;)Ljava/lang/Boolean;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class `WebViewResolver$resolveUsingWebView$2` internal constructor() : Lambda<Any?>(1),
    Function1<Request?, Boolean> {
    @Override // kotlin.jvm.functions.Function1
    override fun invoke(it: Request?): Boolean {
        Intrinsics.checkNotNullParameter(it, "it")
        return false
    }

    companion object {
        val INSTANCE = `WebViewResolver$resolveUsingWebView$2`()
    }
}