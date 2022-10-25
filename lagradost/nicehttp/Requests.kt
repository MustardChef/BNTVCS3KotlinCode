package com.lagradost.nicehttp

import com.fasterxml.jackson.module.kotlin.Extensions
import okhttp3.Call
import okhttp3.Response
import java.util.List
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: Requests.kt */
@Metadata(
    m108d1 = ["\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u0000 N2\u00020\u0001:\u0001NB{\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000c\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010Jï\u0001\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0014\b\u0002\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00062\u0014\b\u0002\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0002\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u000208\u0018\u0001072\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010;2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020\u000b2\b\b\u0002\u0010?\u001a\u00020\r2\b\b\u0002\u0010@\u001a\u00020\u000f2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\b\b\u0002\u0010C\u001a\u00020=H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010DJç\u0001\u0010E\u001a\u00020.2\u0006\u00100\u001a\u00020\u00062\u0014\b\u0002\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00062\u0014\b\u0002\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0002\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u000208\u0018\u0001072\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010;2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020\u000b2\b\b\u0002\u0010?\u001a\u00020\r2\b\b\u0002\u0010@\u001a\u00020\u000f2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\b\b\u0002\u0010C\u001a\u00020=H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010FJ¥\u0001\u0010G\u001a\u00020.2\u0006\u00100\u001a\u00020\u00062\u0014\b\u0002\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00062\u0014\b\u0002\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020\u000b2\b\b\u0002\u0010?\u001a\u00020\r2\b\b\u0002\u0010@\u001a\u00020\u000f2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\b\b\u0002\u0010C\u001a\u00020=H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010HJ¥\u0001\u0010I\u001a\u00020.2\u0006\u00100\u001a\u00020\u00062\u0014\b\u0002\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00062\u0014\b\u0002\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020\u000b2\b\b\u0002\u0010?\u001a\u00020\r2\b\b\u0002\u0010@\u001a\u00020\u000f2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\b\b\u0002\u0010C\u001a\u00020=H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010HJç\u0001\u0010J\u001a\u00020.2\u0006\u00100\u001a\u00020\u00062\u0014\b\u0002\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00062\u0014\b\u0002\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0002\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u000208\u0018\u0001072\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010;2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020\u000b2\b\b\u0002\u0010?\u001a\u00020\r2\b\b\u0002\u0010@\u001a\u00020\u000f2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\b\b\u0002\u0010C\u001a\u00020=H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010FJç\u0001\u0010K\u001a\u00020.2\u0006\u00100\u001a\u00020\u00062\u0014\b\u0002\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00062\u0014\b\u0002\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0002\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u000208\u0018\u0001072\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010;2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020\u000b2\b\b\u0002\u0010?\u001a\u00020\r2\b\b\u0002\u0010@\u001a\u00020\u000f2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\b\b\u0002\u0010C\u001a\u00020=H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010FJç\u0001\u0010L\u001a\u00020.2\u0006\u00100\u001a\u00020\u00062\u0014\b\u0002\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00062\u0014\b\u0002\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0002\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u000208\u0018\u0001072\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010;2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020\u000b2\b\b\u0002\u0010?\u001a\u00020\r2\b\b\u0002\u0010@\u001a\u00020\u000f2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\b\b\u0002\u0010C\u001a\u00020=H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010FJç\u0001\u0010M\u001a\u00020.2\u0006\u00100\u001a\u00020\u00062\u0014\b\u0002\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00062\u0014\b\u0002\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0002\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u000208\u0018\u0001072\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010;2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020\u000b2\b\b\u0002\u0010?\u001a\u00020\r2\b\b\u0002\u0010@\u001a\u00020\u000f2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\b\b\u0002\u0010C\u001a\u00020=H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010FR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000c\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006O"],
    m107d2 = ["Lcom/lagradost/nicehttp/Requests;", "", "baseClient", "Lokhttp3/OkHttpClient;", "defaultHeaders", "", "", "defaultReferer", "defaultData", "defaultCookies", "defaultCacheTime", "", "defaultCacheTimeUnit", "Ljava/util/concurrent/TimeUnit;", "defaultTimeOut", "", "(Lokhttp3/OkHttpClient;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/util/concurrent/TimeUnit;J)V", "getBaseClient", "()Lokhttp3/OkHttpClient;", "setBaseClient", "(Lokhttp3/OkHttpClient;)V", "getDefaultCacheTime", "()I", "setDefaultCacheTime", "(I)V", "getDefaultCacheTimeUnit", "()Ljava/util/concurrent/TimeUnit;", "setDefaultCacheTimeUnit", "(Ljava/util/concurrent/TimeUnit;)V", "getDefaultCookies", "()Ljava/util/Map;", "setDefaultCookies", "(Ljava/util/Map;)V", "getDefaultData", "setDefaultData", "getDefaultHeaders", "setDefaultHeaders", "getDefaultReferer", "()Ljava/lang/String;", "setDefaultReferer", "(Ljava/lang/String;)V", "getDefaultTimeOut", "()J", "setDefaultTimeOut", "(J)V", "custom", "Lcom/lagradost/nicehttp/NiceResponse;", FirebaseAnalytics.Param.METHOD, "url", "headers", "referer", NativeProtocol.WEB_DIALOG_PARAMS, "cookies", "data", "files", "", "Lcom/lagradost/nicehttp/NiceFile;", "json", "requestBody", "Lokhttp3/RequestBody;", "allowRedirects", "", "cacheTime", "cacheUnit", "timeout", "interceptor", "Lokhttp3/Interceptor;", "verify", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/Object;Lokhttp3/RequestBody;ZILjava/util/concurrent/TimeUnit;JLokhttp3/Interceptor;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/Object;Lokhttp3/RequestBody;ZILjava/util/concurrent/TimeUnit;JLokhttp3/Interceptor;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ZILjava/util/concurrent/TimeUnit;JLokhttp3/Interceptor;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", TtmlNode.TAG_HEAD, SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "patch", "post", "put", "Companion", "library_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes4.dex */
open class Requests(
    baseClient: OkHttpClient,
    defaultHeaders: Map<String, String>,
    str: String?,
    defaultData: Map<String, String>,
    defaultCookies: Map<String, String>,
    i: Int,
    defaultCacheTimeUnit: TimeUnit,
    j: Long
) {
    private var baseClient: OkHttpClient
    var defaultCacheTime: Int
    private var defaultCacheTimeUnit: TimeUnit
    private var defaultCookies: Map<String, String>
    private var defaultData: Map<String, String>
    private var defaultHeaders: Map<String, String>
    var defaultReferer: String?
    var defaultTimeOut: Long

    @JvmOverloads
            /* synthetic */   constructor(
        okHttpClient: OkHttpClient? = null,
        map: Map? = null,
        str: String? = null,
        map2: Map? = null,
        map3: Map? = null,
        i: Int = 0,
        timeUnit: TimeUnit? = null,
        j: Long = 0L,
        i2: Int = 255,
        defaultConstructorMarker: DefaultConstructorMarker? = null
    ) : this(
        if (i2 and 1 != 0) OkHttpClient() else okHttpClient,
        if (i2 and 2 != 0) MapsKt.mapOf<Any, Any>(
            TuplesKt.m100to<Any, Any>(
                "user-agent",
                "NiceHttp"
            )
        ) else map,
        if (i2 and 4 != 0) null else str,
        if (i2 and 8 != 0) MapsKt.emptyMap<Any, Any>() else map2,
        if (i2 and 16 != 0) MapsKt.emptyMap<Any, Any>() else map3,
        if (i2 and 32 != 0) 0 else i,
        if (i2 and 64 != 0) TimeUnit.MINUTES else timeUnit,
        if (i2 and 128 != 0) 0L else j
    ) {
    }

    fun getBaseClient(): OkHttpClient {
        return baseClient
    }

    fun setBaseClient(okHttpClient: OkHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "<set-?>")
        baseClient = okHttpClient
    }

    fun getDefaultHeaders(): Map<String, String> {
        return defaultHeaders
    }

    fun setDefaultHeaders(map: Map<String, String>) {
        Intrinsics.checkNotNullParameter(map, "<set-?>")
        defaultHeaders = map
    }

    fun getDefaultData(): Map<String, String> {
        return defaultData
    }

    fun setDefaultData(map: Map<String, String>) {
        Intrinsics.checkNotNullParameter(map, "<set-?>")
        defaultData = map
    }

    fun getDefaultCookies(): Map<String, String> {
        return defaultCookies
    }

    fun setDefaultCookies(map: Map<String, String>) {
        Intrinsics.checkNotNullParameter(map, "<set-?>")
        defaultCookies = map
    }

    fun getDefaultCacheTimeUnit(): TimeUnit {
        return defaultCacheTimeUnit
    }

    fun setDefaultCacheTimeUnit(timeUnit: TimeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "<set-?>")
        defaultCacheTimeUnit = timeUnit
    }

    /* compiled from: Requests.kt */
    @Metadata(
        m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\t\u001a\u00020\n*\u00020\u000bH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000cR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"],
        m107d2 = ["Lcom/lagradost/nicehttp/Requests\$Companion;", "", "()V", "mapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "getMapper", "()Lcom/fasterxml/jackson/databind/ObjectMapper;", "setMapper", "(Lcom/fasterxml/jackson/databind/ObjectMapper;)V", "await", "Lokhttp3/Response;", "Lokhttp3/Call;", "(Lokhttp3/Call;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "library_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        var mapper: ObjectMapper
            get() = Requests.Companion.mapper
            set(objectMapper) {
                Intrinsics.checkNotNullParameter(objectMapper, "<set-?>")
                Requests.Companion.mapper = objectMapper
            }

        private fun `await$$forInline`(
            call: Call,
            continuation: Continuation<in Response>
        ): Object {
            InlineMarker.mark(0)
            val cancellableContinuationImpl: CancellableContinuationImpl<*> =
                CancellableContinuationImpl<Any?>(IntrinsicsKt.intercepted(continuation), 1)
            cancellableContinuationImpl.initCancellability()
            val cancellableContinuationImpl2: CancellableContinuationImpl<*> =
                cancellableContinuationImpl
            val continuationCallback = ContinuationCallback(call, cancellableContinuationImpl2)
            call.enqueue(continuationCallback)
            cancellableContinuationImpl2.invokeOnCancellation(continuationCallback)
            val result: Object = cancellableContinuationImpl.getResult()
            if (result === IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbes.probeCoroutineSuspended(continuation)
            }
            InlineMarker.mark(1)
            return result
        }

        fun await(call: Call, continuation: Continuation<in Response?>?): Object {
            val cancellableContinuationImpl: CancellableContinuationImpl<*> =
                CancellableContinuationImpl<Any?>(IntrinsicsKt.intercepted(continuation), 1)
            cancellableContinuationImpl.initCancellability()
            val cancellableContinuationImpl2: CancellableContinuationImpl<*> =
                cancellableContinuationImpl
            val continuationCallback = ContinuationCallback(call, cancellableContinuationImpl2)
            call.enqueue(continuationCallback)
            cancellableContinuationImpl2.invokeOnCancellation(continuationCallback)
            val result: Object = cancellableContinuationImpl.getResult()
            if (result === IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbes.probeCoroutineSuspended(continuation)
            }
            return result
        }
    }

    init {
        Intrinsics.checkNotNullParameter(baseClient, "baseClient")
        Intrinsics.checkNotNullParameter(defaultHeaders, "defaultHeaders")
        Intrinsics.checkNotNullParameter(defaultData, "defaultData")
        Intrinsics.checkNotNullParameter(defaultCookies, "defaultCookies")
        Intrinsics.checkNotNullParameter(defaultCacheTimeUnit, "defaultCacheTimeUnit")
        this.baseClient = baseClient
        this.defaultHeaders = defaultHeaders
        defaultReferer = str
        this.defaultData = defaultData
        this.defaultCookies = defaultCookies
        defaultCacheTime = i
        this.defaultCacheTimeUnit = defaultCacheTimeUnit
        defaultTimeOut = j
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0030  */ /* JADX WARN: Removed duplicated region for block: B:46:0x0043  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun custom(
        r23: String?,
        r24: String?,
        r25: Map<String?, String?>?,
        r26: String?,
        r27: Map<String?, String?>?,
        r28: Map<String?, String?>?,
        r29: Map<String?, String?>?,
        r30: List<NiceFile?>?,
        r31: Any?,
        r32: RequestBody?,
        r33: Boolean,
        r34: Int,
        r35: java.util.concurrent.TimeUnit?,
        r36: Long,
        r38: Interceptor?,
        r39: Boolean,
        r40: Continuation<in NiceResponse?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.nicehttp.Requests.custom(java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.util.Map, java.util.Map, java.util.Map, java.util.List, java.lang.Object, okhttp3.RequestBody, boolean, int, java.util.concurrent.TimeUnit, long, okhttp3.Interceptor, boolean, kotlin.coroutines.Continuation):java.lang.Object")
    }

    operator fun get(
        str: String?,
        map: Map<String?, String?>?,
        str2: String?,
        map2: Map<String?, String?>?,
        map3: Map<String?, String?>?,
        z: Boolean,
        i: Int,
        timeUnit: TimeUnit?,
        j: Long,
        interceptor: Interceptor?,
        z2: Boolean,
        continuation: Continuation<in NiceResponse?>?
    ): Object {
        return custom(
            ShareTarget.METHOD_GET,
            str,
            map,
            str2,
            map2,
            map3,
            null,
            null,
            null,
            null,
            z,
            i,
            timeUnit,
            j,
            interceptor,
            z2,
            continuation
        )
    }

    fun post(
        str: String?,
        map: Map<String?, String?>?,
        str2: String?,
        map2: Map<String?, String?>?,
        map3: Map<String?, String?>?,
        map4: Map<String?, String?>?,
        list: List<NiceFile?>?,
        obj: Object?,
        requestBody: RequestBody?,
        z: Boolean,
        i: Int,
        timeUnit: TimeUnit?,
        j: Long,
        interceptor: Interceptor?,
        z2: Boolean,
        continuation: Continuation<in NiceResponse?>?
    ): Object {
        return custom(
            ShareTarget.METHOD_POST,
            str,
            map,
            str2,
            map2,
            map3,
            map4,
            list,
            obj,
            requestBody,
            z,
            i,
            timeUnit,
            j,
            interceptor,
            z2,
            continuation
        )
    }

    fun put(
        str: String?,
        map: Map<String?, String?>?,
        str2: String?,
        map2: Map<String?, String?>?,
        map3: Map<String?, String?>?,
        map4: Map<String?, String?>?,
        list: List<NiceFile?>?,
        obj: Object?,
        requestBody: RequestBody?,
        z: Boolean,
        i: Int,
        timeUnit: TimeUnit?,
        j: Long,
        interceptor: Interceptor?,
        z2: Boolean,
        continuation: Continuation<in NiceResponse?>?
    ): Object {
        return custom(
            "PUT",
            str,
            map,
            str2,
            map2,
            map3,
            map4,
            list,
            obj,
            requestBody,
            z,
            i,
            timeUnit,
            j,
            interceptor,
            z2,
            continuation
        )
    }

    fun delete(
        str: String?,
        map: Map<String?, String?>?,
        str2: String?,
        map2: Map<String?, String?>?,
        map3: Map<String?, String?>?,
        map4: Map<String?, String?>?,
        list: List<NiceFile?>?,
        obj: Object?,
        requestBody: RequestBody?,
        z: Boolean,
        i: Int,
        timeUnit: TimeUnit?,
        j: Long,
        interceptor: Interceptor?,
        z2: Boolean,
        continuation: Continuation<in NiceResponse?>?
    ): Object {
        return custom(
            "DELETE",
            str,
            map,
            str2,
            map2,
            map3,
            map4,
            list,
            obj,
            requestBody,
            z,
            i,
            timeUnit,
            j,
            interceptor,
            z2,
            continuation
        )
    }

    fun head(
        str: String?,
        map: Map<String?, String?>?,
        str2: String?,
        map2: Map<String?, String?>?,
        map3: Map<String?, String?>?,
        z: Boolean,
        i: Int,
        timeUnit: TimeUnit?,
        j: Long,
        interceptor: Interceptor?,
        z2: Boolean,
        continuation: Continuation<in NiceResponse?>?
    ): Object {
        return custom(
            "HEAD",
            str,
            map,
            str2,
            map2,
            map3,
            null,
            null,
            null,
            null,
            z,
            i,
            timeUnit,
            j,
            interceptor,
            z2,
            continuation
        )
    }

    fun patch(
        str: String?,
        map: Map<String?, String?>?,
        str2: String?,
        map2: Map<String?, String?>?,
        map3: Map<String?, String?>?,
        map4: Map<String?, String?>?,
        list: List<NiceFile?>?,
        obj: Object?,
        requestBody: RequestBody?,
        z: Boolean,
        i: Int,
        timeUnit: TimeUnit?,
        j: Long,
        interceptor: Interceptor?,
        z2: Boolean,
        continuation: Continuation<in NiceResponse?>?
    ): Object {
        return custom(
            "PATCH",
            str,
            map,
            str2,
            map2,
            map3,
            map4,
            list,
            obj,
            requestBody,
            z,
            i,
            timeUnit,
            j,
            interceptor,
            z2,
            continuation
        )
    }

    fun options(
        str: String?,
        map: Map<String?, String?>?,
        str2: String?,
        map2: Map<String?, String?>?,
        map3: Map<String?, String?>?,
        map4: Map<String?, String?>?,
        list: List<NiceFile?>?,
        obj: Object?,
        requestBody: RequestBody?,
        z: Boolean,
        i: Int,
        timeUnit: TimeUnit?,
        j: Long,
        interceptor: Interceptor?,
        z2: Boolean,
        continuation: Continuation<in NiceResponse?>?
    ): Object {
        return custom(
            "OPTIONS",
            str,
            map,
            str2,
            map2,
            map3,
            map4,
            list,
            obj,
            requestBody,
            z,
            i,
            timeUnit,
            j,
            interceptor,
            z2,
            continuation
        )
    }

    companion object {
        val Companion = Companion(null)
        private val mapper: ObjectMapper? = null

        init {
            val configure: ObjectMapper = Extensions.jacksonObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            Intrinsics.checkNotNullExpressionValue(
                com.lagradost.nicehttp.configure,
                "jacksonObjectMapper().co…          false\n        )"
            )
            Requests.Companion.mapper = com.lagradost.nicehttp.configure
        }

        fun  /* synthetic */`custom$default`(
            requests: Requests,
            str: String?,
            str2: String?,
            map: Map?,
            str3: String?,
            map2: Map?,
            map3: Map?,
            map4: Map?,
            list: List?,
            obj: Object?,
            requestBody: RequestBody?,
            z: Boolean,
            i: Int,
            timeUnit: TimeUnit?,
            j: Long,
            interceptor: Interceptor?,
            z2: Boolean,
            continuation: Continuation<*>?,
            i2: Int,
            obj2: Object?
        ): Object {
            if (obj2 == null) {
                return requests.custom(
                    str,
                    str2,
                    if (i2 and 4 != 0) MapsKt.emptyMap<Any, Any>() else map,
                    if (i2 and 8 != 0) null else str3,
                    if (i2 and 16 != 0) MapsKt.emptyMap<Any, Any>() else map2,
                    if (i2 and 32 != 0) MapsKt.emptyMap<Any, Any>() else map3,
                    if (i2 and 64 != 0) requests.getDefaultData() else map4,
                    if (i2 and 128 != 0) null else list,
                    if (i2 and 256 != 0) null else obj,
                    if (i2 and 512 != 0) null else requestBody,
                    if (i2 and 1024 != 0) true else z,
                    if (i2 and 2048 != 0) requests.defaultCacheTime else i,
                    if (i2 and 4096 != 0) requests.getDefaultCacheTimeUnit() else timeUnit,
                    if (i2 and 8192 != 0) requests.defaultTimeOut else j,
                    if (i2 and 16384 != 0) null else interceptor,
                    if (i2 and 32768 != 0) true else z2,
                    continuation
                )
            }
            throw UnsupportedOperationException("Super calls with default arguments not supported in this target, function: custom")
        }

        fun  /* synthetic */`get$default`(
            requests: Requests,
            str: String?,
            map: Map?,
            str2: String?,
            map2: Map?,
            map3: Map?,
            z: Boolean,
            i: Int,
            timeUnit: TimeUnit?,
            j: Long,
            interceptor: Interceptor?,
            z2: Boolean,
            continuation: Continuation<*>?,
            i2: Int,
            obj: Object?
        ): Object {
            if (obj == null) {
                return requests.get(
                    str,
                    if (i2 and 2 != 0) MapsKt.emptyMap<Any, Any>() else map,
                    if (i2 and 4 != 0) null else str2,
                    if (i2 and 8 != 0) MapsKt.emptyMap<Any, Any>() else map2,
                    if (i2 and 16 != 0) MapsKt.emptyMap<Any, Any>() else map3,
                    if (i2 and 32 != 0) true else z,
                    if (i2 and 64 != 0) requests.defaultCacheTime else i,
                    if (i2 and 128 != 0) requests.getDefaultCacheTimeUnit() else timeUnit,
                    if (i2 and 256 != 0) requests.defaultTimeOut else j,
                    if (i2 and 512 != 0) null else interceptor,
                    if (i2 and 1024 != 0) true else z2,
                    continuation
                )
            }
            throw UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get")
        }

        fun  /* synthetic */`post$default`(
            requests: Requests,
            str: String?,
            map: Map?,
            str2: String?,
            map2: Map?,
            map3: Map?,
            map4: Map?,
            list: List?,
            obj: Object?,
            requestBody: RequestBody?,
            z: Boolean,
            i: Int,
            timeUnit: TimeUnit?,
            j: Long,
            interceptor: Interceptor?,
            z2: Boolean,
            continuation: Continuation<*>?,
            i2: Int,
            obj2: Object?
        ): Object {
            if (obj2 == null) {
                return requests.post(
                    str,
                    if (i2 and 2 != 0) MapsKt.emptyMap<Any, Any>() else map,
                    if (i2 and 4 != 0) null else str2,
                    if (i2 and 8 != 0) MapsKt.emptyMap<Any, Any>() else map2,
                    if (i2 and 16 != 0) MapsKt.emptyMap<Any, Any>() else map3,
                    if (i2 and 32 != 0) requests.getDefaultData() else map4,
                    if (i2 and 64 != 0) null else list,
                    if (i2 and 128 != 0) null else obj,
                    if (i2 and 256 != 0) null else requestBody,
                    if (i2 and 512 != 0) true else z,
                    if (i2 and 1024 != 0) requests.defaultCacheTime else i,
                    if (i2 and 2048 != 0) requests.getDefaultCacheTimeUnit() else timeUnit,
                    if (i2 and 4096 != 0) requests.defaultTimeOut else j,
                    if (i2 and 8192 != 0) null else interceptor,
                    if (i2 and 16384 != 0) true else z2,
                    continuation
                )
            }
            throw UnsupportedOperationException("Super calls with default arguments not supported in this target, function: post")
        }

        fun  /* synthetic */`put$default`(
            requests: Requests,
            str: String?,
            map: Map?,
            str2: String?,
            map2: Map?,
            map3: Map?,
            map4: Map?,
            list: List?,
            obj: Object?,
            requestBody: RequestBody?,
            z: Boolean,
            i: Int,
            timeUnit: TimeUnit?,
            j: Long,
            interceptor: Interceptor?,
            z2: Boolean,
            continuation: Continuation<*>?,
            i2: Int,
            obj2: Object?
        ): Object {
            if (obj2 == null) {
                return requests.put(
                    str,
                    if (i2 and 2 != 0) MapsKt.emptyMap<Any, Any>() else map,
                    if (i2 and 4 != 0) null else str2,
                    if (i2 and 8 != 0) MapsKt.emptyMap<Any, Any>() else map2,
                    if (i2 and 16 != 0) MapsKt.emptyMap<Any, Any>() else map3,
                    if (i2 and 32 != 0) requests.getDefaultData() else map4,
                    if (i2 and 64 != 0) null else list,
                    if (i2 and 128 != 0) null else obj,
                    if (i2 and 256 != 0) null else requestBody,
                    if (i2 and 512 != 0) true else z,
                    if (i2 and 1024 != 0) requests.defaultCacheTime else i,
                    if (i2 and 2048 != 0) requests.getDefaultCacheTimeUnit() else timeUnit,
                    if (i2 and 4096 != 0) requests.defaultTimeOut else j,
                    if (i2 and 8192 != 0) null else interceptor,
                    if (i2 and 16384 != 0) true else z2,
                    continuation
                )
            }
            throw UnsupportedOperationException("Super calls with default arguments not supported in this target, function: put")
        }

        fun  /* synthetic */`delete$default`(
            requests: Requests,
            str: String?,
            map: Map?,
            str2: String?,
            map2: Map?,
            map3: Map?,
            map4: Map?,
            list: List?,
            obj: Object?,
            requestBody: RequestBody?,
            z: Boolean,
            i: Int,
            timeUnit: TimeUnit?,
            j: Long,
            interceptor: Interceptor?,
            z2: Boolean,
            continuation: Continuation<*>?,
            i2: Int,
            obj2: Object?
        ): Object {
            if (obj2 == null) {
                return requests.delete(
                    str,
                    if (i2 and 2 != 0) MapsKt.emptyMap<Any, Any>() else map,
                    if (i2 and 4 != 0) null else str2,
                    if (i2 and 8 != 0) MapsKt.emptyMap<Any, Any>() else map2,
                    if (i2 and 16 != 0) MapsKt.emptyMap<Any, Any>() else map3,
                    if (i2 and 32 != 0) requests.getDefaultData() else map4,
                    if (i2 and 64 != 0) null else list,
                    if (i2 and 128 != 0) null else obj,
                    if (i2 and 256 != 0) null else requestBody,
                    if (i2 and 512 != 0) true else z,
                    if (i2 and 1024 != 0) requests.defaultCacheTime else i,
                    if (i2 and 2048 != 0) requests.getDefaultCacheTimeUnit() else timeUnit,
                    if (i2 and 4096 != 0) requests.defaultTimeOut else j,
                    if (i2 and 8192 != 0) null else interceptor,
                    if (i2 and 16384 != 0) true else z2,
                    continuation
                )
            }
            throw UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete")
        }

        fun  /* synthetic */`head$default`(
            requests: Requests,
            str: String?,
            map: Map?,
            str2: String?,
            map2: Map?,
            map3: Map?,
            z: Boolean,
            i: Int,
            timeUnit: TimeUnit?,
            j: Long,
            interceptor: Interceptor?,
            z2: Boolean,
            continuation: Continuation<*>?,
            i2: Int,
            obj: Object?
        ): Object {
            if (obj == null) {
                return requests.head(
                    str,
                    if (i2 and 2 != 0) MapsKt.emptyMap<Any, Any>() else map,
                    if (i2 and 4 != 0) null else str2,
                    if (i2 and 8 != 0) MapsKt.emptyMap<Any, Any>() else map2,
                    if (i2 and 16 != 0) MapsKt.emptyMap<Any, Any>() else map3,
                    if (i2 and 32 != 0) true else z,
                    if (i2 and 64 != 0) requests.defaultCacheTime else i,
                    if (i2 and 128 != 0) requests.getDefaultCacheTimeUnit() else timeUnit,
                    if (i2 and 256 != 0) requests.defaultTimeOut else j,
                    if (i2 and 512 != 0) null else interceptor,
                    if (i2 and 1024 != 0) true else z2,
                    continuation
                )
            }
            throw UnsupportedOperationException("Super calls with default arguments not supported in this target, function: head")
        }

        fun  /* synthetic */`patch$default`(
            requests: Requests,
            str: String?,
            map: Map?,
            str2: String?,
            map2: Map?,
            map3: Map?,
            map4: Map?,
            list: List?,
            obj: Object?,
            requestBody: RequestBody?,
            z: Boolean,
            i: Int,
            timeUnit: TimeUnit?,
            j: Long,
            interceptor: Interceptor?,
            z2: Boolean,
            continuation: Continuation<*>?,
            i2: Int,
            obj2: Object?
        ): Object {
            if (obj2 == null) {
                return requests.patch(
                    str,
                    if (i2 and 2 != 0) MapsKt.emptyMap<Any, Any>() else map,
                    if (i2 and 4 != 0) null else str2,
                    if (i2 and 8 != 0) MapsKt.emptyMap<Any, Any>() else map2,
                    if (i2 and 16 != 0) MapsKt.emptyMap<Any, Any>() else map3,
                    if (i2 and 32 != 0) requests.getDefaultData() else map4,
                    if (i2 and 64 != 0) null else list,
                    if (i2 and 128 != 0) null else obj,
                    if (i2 and 256 != 0) null else requestBody,
                    if (i2 and 512 != 0) true else z,
                    if (i2 and 1024 != 0) requests.defaultCacheTime else i,
                    if (i2 and 2048 != 0) requests.getDefaultCacheTimeUnit() else timeUnit,
                    if (i2 and 4096 != 0) requests.defaultTimeOut else j,
                    if (i2 and 8192 != 0) null else interceptor,
                    if (i2 and 16384 != 0) true else z2,
                    continuation
                )
            }
            throw UnsupportedOperationException("Super calls with default arguments not supported in this target, function: patch")
        }

        fun  /* synthetic */`options$default`(
            requests: Requests,
            str: String?,
            map: Map?,
            str2: String?,
            map2: Map?,
            map3: Map?,
            map4: Map?,
            list: List?,
            obj: Object?,
            requestBody: RequestBody?,
            z: Boolean,
            i: Int,
            timeUnit: TimeUnit?,
            j: Long,
            interceptor: Interceptor?,
            z2: Boolean,
            continuation: Continuation<*>?,
            i2: Int,
            obj2: Object?
        ): Object {
            if (obj2 == null) {
                return requests.options(
                    str,
                    if (i2 and 2 != 0) MapsKt.emptyMap<Any, Any>() else map,
                    if (i2 and 4 != 0) null else str2,
                    if (i2 and 8 != 0) MapsKt.emptyMap<Any, Any>() else map2,
                    if (i2 and 16 != 0) MapsKt.emptyMap<Any, Any>() else map3,
                    if (i2 and 32 != 0) requests.getDefaultData() else map4,
                    if (i2 and 64 != 0) null else list,
                    if (i2 and 128 != 0) null else obj,
                    if (i2 and 256 != 0) null else requestBody,
                    if (i2 and 512 != 0) true else z,
                    if (i2 and 1024 != 0) requests.defaultCacheTime else i,
                    if (i2 and 2048 != 0) requests.getDefaultCacheTimeUnit() else timeUnit,
                    if (i2 and 4096 != 0) requests.defaultTimeOut else j,
                    if (i2 and 8192 != 0) null else interceptor,
                    if (i2 and 16384 != 0) true else z2,
                    continuation
                )
            }
            throw UnsupportedOperationException("Super calls with default arguments not supported in this target, function: options")
        }
    }
}