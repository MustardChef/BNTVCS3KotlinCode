package com.lagradost.cloudstream3.network

import android.content.Context
import com.google.common.net.HttpHeaders
import okhttp3.Cache
import okhttp3.Headers
import okhttp3.Request
import kotlin.jvm.internal.Intrinsics

@Metadata(
    m108d1 = ["\u0000,\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001\u001a\u0012\u0010\u000b\u001a\u00020\u000c*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"!\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"],
    m107d2 = ["DEFAULT_HEADERS", "", "", "cookies", "Lokhttp3/Request;", "getCookies", "(Lokhttp3/Request;)Ljava/util/Map;", "getHeaders", "Lokhttp3/Headers;", "headers", "cookie", "initClient", "Lokhttp3/OkHttpClient;", "Lcom/lagradost/nicehttp/Requests;", "context", "Landroid/content/Context;", "app_release"],
    m106k = 2,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.network.RequestsHelperKt */ /* loaded from: classes3.dex */
object RequestsHelper {
    private val DEFAULT_HEADERS: Map<String, String> =
        MapsKt.mapOf(TuplesKt.m100to<Any, Any>("user-agent", MainAPIKt.USER_AGENT))

    fun initClient(requests: Requests, context: Context): OkHttpClient {
        Intrinsics.checkNotNullParameter(requests, "<this>")
        Intrinsics.checkNotNullParameter(context, "context")
        val i: Int = PreferenceManager.getDefaultSharedPreferences(context)
            .getInt(context.getString(R.string.dns_pref), 0)
        val cache: OkHttpClient.Builder = RequestsKt.ignoreAllSSLErrors(
            OkHttpClient.Builder().followRedirects(true).followSslRedirects(true)
        ).cache(
            Cache(File(context.getCacheDir(), "http_cache"), 52428800L)
        )
        if (i == 1) {
            DohProviders.addGoogleDns(cache)
        } else if (i == 2) {
            DohProviders.addCloudFlareDns(cache)
        } else if (i == 4) {
            DohProviders.addAdGuardDns(cache)
        }
        requests.setBaseClient(cache.build())
        return requests.getBaseClient()
    }

    fun getCookies(request: Request): Map<String, String> {
        Intrinsics.checkNotNullParameter(request, "<this>")
        return RequestsKt.getCookies(request.headers(), HttpHeaders.COOKIE)
    }

    fun getHeaders(headers: Map<String?, String?>?, cookie: Map<String?, String?>): Headers {
        val emptyMap: Map
        Intrinsics.checkNotNullParameter(headers, "headers")
        Intrinsics.checkNotNullParameter(cookie, "cookie")
        emptyMap = if (!cookie.isEmpty()) {
            MapsKt.mapOf(
                TuplesKt.m100to<Any, Any>(
                    HttpHeaders.COOKIE,
                    CollectionsKt.`joinToString$default`(
                        cookie.entrySet(),
                        " ",
                        null,
                        null,
                        0,
                        null,
                        `RequestsHelperKt$getHeaders$cookieMap$1`.Companion.INSTANCE,
                        30,
                        null
                    )
                )
            )
        } else {
            MapsKt.emptyMap<Any, Any>()
        }
        return Headers.Companion.m79of(MapsKt.plus(MapsKt.plus(DEFAULT_HEADERS, headers), emptyMap))
    }
}