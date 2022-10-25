package com.lagradost.nicehttp

import com.google.common.net.HttpHeaders
import okhttp3.Headers
import okhttp3.MediaType
import okhttp3.Request
import okhttp3.Response
import java.io.File
import kotlin.jvm.internal.Intrinsics

/* compiled from: Requests.kt */
@Metadata(
    m108d1 = ["\u0000X\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bH\u0002\u001a\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0002\u001a\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002\u001aJ\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u00022\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00012\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010\u001b\u001a8\u0010#\u001a\u00020$2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u00022\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b\u001aÃ\u0001\u0010(\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b2\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010)\u001a\u001e\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b*\u00020$2\u0006\u0010*\u001a\u00020\u0002\u001a\n\u0010+\u001a\u00020,*\u00020,\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0004\"$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b*\u00020\u000c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\r¨\u0006-"],
    m107d2 = ["cantHaveBody", "", "", "getCantHaveBody", "()Ljava/util/List;", "mustHaveBody", "getMustHaveBody", "cookies", "", "Lokhttp3/Request;", "getCookies", "(Lokhttp3/Request;)Ljava/util/Map;", "Lokhttp3/Response;", "(Lokhttp3/Response;)Ljava/util/Map;", "addParamsToUrl", "url", NativeProtocol.WEB_DIALOG_PARAMS, "appendUri", ShareConstants.MEDIA_URI, "appendQuery", "getCache", "Lokhttp3/CacheControl;", "cacheTime", "", "cacheUnit", "Ljava/util/concurrent/TimeUnit;", "getData", "Lokhttp3/RequestBody;", FirebaseAnalytics.Param.METHOD, "data", "files", "Lcom/lagradost/nicehttp/NiceFile;", "json", "", "requestBody", "getHeaders", "Lokhttp3/Headers;", "headers", "referer", "cookie", "requestCreator", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/Object;Lokhttp3/RequestBody;Ljava/lang/Integer;Ljava/util/concurrent/TimeUnit;)Lokhttp3/Request;", "cookieKey", "ignoreAllSSLErrors", "Lokhttp3/OkHttpClient\$Builder;", "library_release"],
    m106k = 2,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
object RequestsKt {
    val mustHaveBody: List<String> =
        CollectionsKt.listOf<Object>(*arrayOf(ShareTarget.METHOD_POST, "PUT") as Array<Object>)
    val cantHaveBody: List<String> =
        CollectionsKt.listOf<Object>(*arrayOf(ShareTarget.METHOD_GET, "HEAD") as Array<Object>)

    /* renamed from: ignoreAllSSLErrors$lambda-10 */
    fun `m9026ignoreAllSSLErrors$lambda10`(str: String?, sSLSession: SSLSession?): Boolean {
        return true
    }

    fun getCookies(headers: Headers, cookieKey: String?): Map<String, String> {
        var str: String?
        var obj: String
        var obj2: String?
        Intrinsics.checkNotNullParameter(headers, "<this>")
        Intrinsics.checkNotNullParameter(cookieKey, "cookieKey")
        val arrayList = ArrayList()
        for (tuples in headers) {
            if (StringsKt.equals(tuples.getFirst(), cookieKey, true)) {
                arrayList.add(tuples)
            }
        }
        val tuples2 = CollectionsKt.getOrNull(arrayList, 0) as Tuples<*, *>?
        var linkedHashMap: LinkedHashMap? = null
        val `split$default`: List? = if (tuples2 == null || tuples2.second as String?. also {
                str = it
            } == null) null else StringsKt.`split$default`(
            str as CharSequence?,
            arrayOf(";"),
            false,
            0,
            6,
            null as Object?
        )
        if (`split$default` != null) {
            val list: List<String>? = `split$default`
            val linkedHashMap2 = LinkedHashMap(
                RangesKt.coerceAtLeast(
                    MapsKt.mapCapacity(
                        CollectionsKt.collectionSizeOrDefault(
                            list,
                            10
                        )
                    ), 16
                )
            )
            for (str2 in list!!) {
                val `split$default2`: List = StringsKt.`split$default`(
                    str2 as CharSequence,
                    arrayOf("="),
                    false,
                    0,
                    6,
                    null as Object?
                )
                val str3 = CollectionsKt.getOrNull(`split$default2`, 0) as String?
                var str4: String? = ""
                if (str3 == null || StringsKt.trim(str3 as CharSequence?).toString()
                        .also { obj = it } == null
                ) {
                    obj = ""
                }
                val str5 = CollectionsKt.getOrNull(`split$default2`, 1) as String?
                if (str5 != null && StringsKt.trim(str5 as CharSequence?).toString()
                        .also { obj2 = it } != null
                ) {
                    str4 = obj2
                }
                val m100to: Tuples<*, *> = TuplesKt.m100to<Any, Any?>(obj, str4)
                linkedHashMap2.put(m100to.first, m100to.second)
            }
            linkedHashMap = LinkedHashMap()
            for (entry in linkedHashMap2.entrySet()) {
                if (StringsKt.isBlank(entry.getKey() as CharSequence) xor true && StringsKt.isBlank(
                        entry.getValue() as CharSequence
                    ) xor true
                ) {
                    linkedHashMap.put(entry.getKey(), entry.getValue())
                }
            }
        }
        return if (linkedHashMap == null) MapsKt.emptyMap<Any, Any>() else linkedHashMap
    }

    fun getCookies(response: Response?): Map<String, String> {
        return getCookies(response!!.headers(), "set-cookie")
    }

    private fun getCookies(request: Request): Map<String, String> {
        return getCookies(request.headers(), HttpHeaders.COOKIE)
    }

    fun getData(
        method: String,
        map: Map<String?, String?>?,
        list: List<NiceFile>?,
        obj: Object?,
        requestBody: RequestBody?
    ): RequestBody? {
        val requestBody2: RequestBody?
        val jsonString: String?
        Intrinsics.checkNotNullParameter(method, "method")
        val list2 = cantHaveBody
        val upperCase: String = method.toUpperCase(Locale.ROOT)
        Intrinsics.checkNotNullExpressionValue(
            upperCase,
            "this as java.lang.String).toUpperCase(Locale.ROOT)"
        )
        if (list2.contains(upperCase)) {
            return null
        }
        if (requestBody != null) {
            return requestBody
        }
        if (map != null) {
            val builder: FormBody.Builder = FormBody.Builder(null, 1, null)
            for (entry in map.entrySet()) {
                builder.add(entry.getKey(), entry.getValue())
            }
            requestBody2 = builder.build()
        } else if (obj != null) {
            jsonString = if (obj is JSONObject) {
                (obj as JSONObject?).toString()
            } else if (obj is JSONArray) {
                (obj as JSONArray?).toString()
            } else {
                if (obj is String) obj else Requests.Companion.Companion.getMapper()
                    .writeValueAsString(obj)
            }
            val str: String? = if (obj is String) RequestBodyTypes.TEXT else RequestBodyTypes.JSON
            val companion: RequestBody.Companion = RequestBody.Companion
            Intrinsics.checkNotNullExpressionValue(jsonString, "jsonString")
            requestBody2 = companion.create(jsonString, MediaType.Companion.parse(str))
        } else {
            requestBody2 = if (!(list == null || list.isEmpty())) {
                val type: MultipartBody.Builder =
                    MultipartBody.Builder(null, 1, null).setType(MultipartBody.FORM)
                for (niceFile in list) {
                    if (niceFile.file != null) {
                        val name: String? = niceFile.name
                        val fileName: String? = niceFile.fileName
                        val companion2: RequestBody.Companion = RequestBody.Companion
                        val file: File? = niceFile.file
                        val fileType: String? = niceFile.fileType
                        type.addFormDataPart(
                            name,
                            fileName,
                            companion2.create(
                                file,
                                if (fileType == null) null else MediaType.Companion.parse(fileType)
                            )
                        )
                    } else {
                        type.addFormDataPart(niceFile.name, niceFile.fileName)
                    }
                }
                type.build()
            } else {
                null
            }
        }
        if (requestBody2 == null) {
            val list4 = mustHaveBody
            val upperCase2: String = method.toUpperCase(Locale.ROOT)
            Intrinsics.checkNotNullExpressionValue(
                upperCase2,
                "this as java.lang.String).toUpperCase(Locale.ROOT)"
            )
            return if (list4.contains(upperCase2)) FormBody.Builder(null, 1, null).build() else null
        }
        return requestBody2
    }

    private fun appendUri(str: String?, str2: String): String {
        var str2 = str2
        val uri = URI(str)
        val scheme: String = uri.getScheme()
        val authority: String = uri.getAuthority()
        val path: String = uri.getPath()
        if (uri.getQuery() != null) {
            str2 = uri.getQuery() + Typography.amp + str2
        }
        val uri2: String = URI(scheme, authority, path, str2, uri.getFragment()).toString()
        Intrinsics.checkNotNullExpressionValue(
            uri2,
            "URI(\n        oldUri.sche…fragment\n    ).toString()"
        )
        return uri2
    }

    private fun getCache(i: Int, timeUnit: TimeUnit): CacheControl {
        return CacheControl.Builder().maxStale(i, timeUnit).build()
    }

    fun getHeaders(
        headers: Map<String?, String?>?,
        str: String?,
        cookie: Map<String?, String?>
    ): Headers {
        val emptyMap: Map
        Intrinsics.checkNotNullParameter(headers, "headers")
        Intrinsics.checkNotNullParameter(cookie, "cookie")
        var mapOf: Map? =
            if (str == null) null else MapsKt.mapOf(TuplesKt.m100to<Any, Any>("referer", str))
        if (mapOf == null) {
            mapOf = MapsKt.emptyMap<Any, Any>()
        }
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
                        `RequestsKt$getHeaders$cookieMap$1`.Companion.INSTANCE,
                        30,
                        null
                    )
                )
            )
        } else {
            MapsKt.emptyMap<Any, Any>()
        }
        return Headers.Companion.m79of(MapsKt.plus(MapsKt.plus(headers, emptyMap), mapOf))
    }

    fun  /* synthetic */`requestCreator$default`(
        str: String,
        str2: String?,
        map: Map?,
        str3: String?,
        map2: Map?,
        map3: Map?,
        map4: Map?,
        list: List?,
        obj: Object?,
        requestBody: RequestBody?,
        num: Integer?,
        timeUnit: TimeUnit?,
        i: Int,
        obj2: Object?
    ): Request {
        return requestCreator(
            str,
            str2,
            if (i and 4 != 0) MapsKt.emptyMap<Any, Any>() else map,
            if (i and 8 != 0) null else str3,
            if (i and 16 != 0) MapsKt.emptyMap<Any, Any>() else map2,
            if (i and 32 != 0) MapsKt.emptyMap<Any, Any>() else map3,
            if (i and 64 != 0) null else map4,
            if (i and 128 != 0) null else list,
            if (i and 256 != 0) null else obj,
            if (i and 512 != 0) null else requestBody,
            if (i and 1024 != 0) null else num,
            if (i and 2048 == 0) timeUnit else null
        )
    }

    fun requestCreator(
        method: String,
        url: String?,
        headers: Map<String?, String?>?,
        str: String?,
        params: Map<String, String>,
        cookies: Map<String?, String?>,
        map: Map<String?, String?>?,
        list: List<NiceFile>?,
        obj: Object?,
        requestBody: RequestBody?,
        num: Integer?,
        timeUnit: TimeUnit?
    ): Request {
        Intrinsics.checkNotNullParameter(method, "method")
        Intrinsics.checkNotNullParameter(url, "url")
        Intrinsics.checkNotNullParameter(headers, "headers")
        Intrinsics.checkNotNullParameter(params, "params")
        Intrinsics.checkNotNullParameter(cookies, "cookies")
        val url2: Request.Builder = Request.Builder().url(addParamsToUrl(url, params))
        if (num != null && timeUnit != null) {
            url2.cacheControl(getCache(num.intValue(), timeUnit))
        }
        return url2.headers(getHeaders(headers, str, cookies))
            .method(method, getData(method, map, list, obj, requestBody)).build()
    }

    fun ignoreAllSSLErrors(builder: OkHttpClient.Builder): OkHttpClient.Builder {
        Intrinsics.checkNotNullParameter(builder, "<this>")
        val x509TrustManager: X509TrustManager = object : X509TrustManager() {
            // from class: com.lagradost.nicehttp.RequestsKt$ignoreAllSSLErrors$naiveTrustManager$1
            @Override // javax.net.ssl.X509TrustManager
            fun checkClientTrusted(certs: Array<X509Certificate?>?, authType: String?) {
                Intrinsics.checkNotNullParameter(certs, "certs")
                Intrinsics.checkNotNullParameter(authType, "authType")
            }

            @Override // javax.net.ssl.X509TrustManager
            fun checkServerTrusted(certs: Array<X509Certificate?>?, authType: String?) {
                Intrinsics.checkNotNullParameter(certs, "certs")
                Intrinsics.checkNotNullParameter(authType, "authType")
            }

            // javax.net.ssl.X509TrustManager
            @get:Override
            val acceptedIssuers: Array<Any>
                get() = arrayOfNulls(0)
        }
        val sSLContext: SSLContext = SSLContext.getInstance("TLSv1.2")
        sSLContext.init(null, arrayOf<TrustManager>(x509TrustManager), SecureRandom())
        val insecureSocketFactory: SSLSocketFactory = sSLContext.getSocketFactory()
        Intrinsics.checkNotNullExpressionValue(insecureSocketFactory, "insecureSocketFactory")
        builder.sslSocketFactory(insecureSocketFactory, x509TrustManager)
        builder.hostnameVerifier(`$$Lambda$RequestsKt$bAfRwzknvdCXxHGMsD5sJemaoQ`.Companion.INSTANCE)
        return builder
    }

    private fun addParamsToUrl(str: String?, map: Map<String, String>): String? {
        var str = str
        for (entry in map.entrySet()) {
            val value: String = entry.getValue()
            if (value != null) {
                str = appendUri(str, entry.getKey() + '=' + value)
            }
        }
        return str
    }
}