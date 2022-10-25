package com.lagradost.nicehttp

import okhttp3.Cookie
import okhttp3.CookieJar
import java.util.ArrayList
import kotlin.jvm.internal.Intrinsics

/* compiled from: Requests.kt */
@Metadata(
    m108d1 = ["\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0006"],
    m107d2 = ["Lcom/lagradost/nicehttp/Session;", "Lcom/lagradost/nicehttp/Requests;", "client", "Lokhttp3/OkHttpClient;", "(Lokhttp3/OkHttpClient;)V", "CustomCookieJar", "library_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class Session(client: OkHttpClient) :
    Requests(null, null, null, null, null, 0, null, 0L, 255, null) {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        Intrinsics.checkNotNullParameter(client, "client")
        baseClient = client.newBuilder().cookieJar(CustomCookieJar(this)).build()
    }

    /* compiled from: Requests.kt */
    @Metadata(
        m108d1 = ["\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001e\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\n2\u000c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"],
        m107d2 = ["Lcom/lagradost/nicehttp/Session\$CustomCookieJar;", "Lokhttp3/CookieJar;", "(Lcom/lagradost/nicehttp/Session;)V", "cookies", "", "", "Lokhttp3/Cookie;", "loadForRequest", "", "url", "Lokhttp3/HttpUrl;", "saveFromResponse", "", "library_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    /* loaded from: classes4.dex */
    inner class CustomCookieJar(`this$0`: Session) : CookieJar {
        private var cookies: Map<String, Cookie>
        /* synthetic */ val `this$0`: Session

        init {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            this.`this$0` = `this$0`
            cookies = MapsKt.emptyMap<Any, Any>()
        }

        @Override // okhttp3.CookieJar
        override fun loadForRequest(url: HttpUrl): List? {
            Intrinsics.checkNotNullParameter(url, "url")
            return CollectionsKt.toList(cookies.values())
        }

        @Override // okhttp3.CookieJar
        override fun saveFromResponse(url: HttpUrl, cookies: List<Cookie>) {
            Intrinsics.checkNotNullParameter(url, "url")
            Intrinsics.checkNotNullParameter(cookies, "cookies")
            val map = this.cookies
            val list = cookies
            val arrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10))
            for (cookie in list) {
                arrayList.add(TuplesKt.m100to(cookie.name(), cookie))
            }
            this.cookies = MapsKt.plus(map, arrayList)
        }
    }
}