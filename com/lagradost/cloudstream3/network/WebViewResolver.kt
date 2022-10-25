package com.lagradost.cloudstream3.network

import android.webkit.WebResourceRequest
import com.anggrayudi.storage.file.MimeType
import okhttp3.Request
import okhttp3.Response
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: WebViewResolver.kt */
@Metadata(
    m108d1 = ["\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0016JC\u0010\u000f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00050\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00150\u0014H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\n\u0010\u0017\u001a\u00020\u0011*\u00020\u0018J\n\u0010\u0019\u001a\u00020\u001a*\u00020\u000cR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"],
    m107d2 = ["Lcom/lagradost/cloudstream3/network/WebViewResolver;", "Lokhttp3/Interceptor;", "interceptUrl", "Lkotlin/text/Regex;", "additionalUrls", "", "(Lkotlin/text/Regex;Ljava/util/List;)V", "getAdditionalUrls", "()Ljava/util/List;", "getInterceptUrl", "()Lkotlin/text/Regex;", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor\$Chain;", "resolveUsingWebView", "Lkotlin/Pair;", "Lokhttp3/Request;", ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID, "requestCallBack", "Lkotlin/Function1;", "", "(Lokhttp3/Request;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toRequest", "Landroid/webkit/WebResourceRequest;", "toWebResourceResponse", "Landroid/webkit/WebResourceResponse;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class WebViewResolver(interceptUrl: Regex, additionalUrls: List<Regex>) : Interceptor {
    val additionalUrls: List<Regex>
    val interceptUrl: Regex

    init {
        Intrinsics.checkNotNullParameter(interceptUrl, "interceptUrl")
        Intrinsics.checkNotNullParameter(additionalUrls, "additionalUrls")
        this.interceptUrl = interceptUrl
        this.additionalUrls = additionalUrls
    }

    /* synthetic */   constructor(
        regex: Regex,
        list: List?,
        i: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(regex, if (i and 2 != 0) CollectionsKt.emptyList<Any>() else list) {
    }

    @Override // okhttp3.Interceptor
    override fun intercept(chain: Interceptor.Chain): Response {
        Intrinsics.checkNotNullParameter(chain, "chain")
        return BuildersKt.`runBlocking$default`(
            null,
            `WebViewResolver$intercept$1`(this, chain.request(), chain, null),
            1,
            null
        )
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */ /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */ /* JADX WARN: Removed duplicated region for block: B:17:0x00b5  */ /* JADX WARN: Removed duplicated region for block: B:25:0x00d8  */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00d3 -> B:24:0x00d6). Please submit an issue!!! */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun resolveUsingWebView(
        r21: Request?,
        r22: Function1<Request?, Boolean?>?,
        r23: Continuation<in Tuples<Request?, out MutableList<Request?>?>?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.network.WebViewResolver.resolveUsingWebView(okhttp3.Request, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
    }

    fun toRequest(webResourceRequest: WebResourceRequest): Request {
        Intrinsics.checkNotNullParameter(webResourceRequest, "<this>")
        val uri: String = webResourceRequest.getUrl().toString()
        Intrinsics.checkNotNullExpressionValue(uri, "this.url.toString()")
        val method: String = webResourceRequest.getMethod()
        Intrinsics.checkNotNullExpressionValue(method, "this.method")
        val requestHeaders: Map<String, String> = webResourceRequest.getRequestHeaders()
        Intrinsics.checkNotNullExpressionValue(requestHeaders, "this.requestHeaders")
        return RequestsKt.`requestCreator$default`(
            method,
            uri,
            requestHeaders,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            4088,
            null
        )
    }

    fun toWebResourceResponse(response: Response): WebResourceResponse {
        val webResourceResponse: WebResourceResponse
        val str: String?
        var groupValues: List<String?>?
        var str2: String?
        var groupValues2: List<String?>?
        var str3: String?
        Intrinsics.checkNotNullParameter(response, "<this>")
        var `header$default`: String? =
            Response.`header$default`(response, "Content-Type", null, 2, null)
        val regex = Regex("(.*);(?:.*charset=(.*)(?:|;)|)")
        if (`header$default` != null) {
            val `find$default` = Regex.`find$default`(regex, `header$default`, 0, 2, null)
            if (`find$default` != null && `find$default`.groupValues.also {
                    groupValues2 = it
                } != null && CollectionsKt.getOrNull<Any>(groupValues2, 1) as String?. also {
                    str3 = it
                } != null) {
                var str4 = str3
                if (StringsKt.isBlank(str4)) {
                    str4 = null
                }
                val str5 = str4
                if (str5 != null) {
                    `header$default` = str5
                }
            }
            if (`find$default` == null || `find$default`.groupValues.also {
                    groupValues = it
                } == null || CollectionsKt.getOrNull<Any>(groupValues, 2) as String?. also {
                    str2 = it
                } == null) {
                str = null
            } else {
                var str6 = str2
                if (StringsKt.isBlank(str6)) {
                    str6 = null
                }
                str = str6
            }
            val body: ResponseBody? = response.body()
            webResourceResponse = WebResourceResponse(
                `header$default`,
                str,
                if (body != null) body.byteStream() else null
            )
        } else {
            val body2: ResponseBody? = response.body()
            webResourceResponse = WebResourceResponse(
                MimeType.BINARY_FILE,
                null,
                if (body2 != null) body2.byteStream() else null
            )
        }
        return webResourceResponse
    }

    companion object {
        /* JADX WARN: Multi-variable type inference failed */
        fun  /* synthetic */`resolveUsingWebView$default`(
            webViewResolver: WebViewResolver,
            request: Request?,
            function1: Function1<*, *>?,
            continuation: Continuation<*>?,
            i: Int,
            obj: Object?
        ): Object {
            var function1 = function1
            if (i and 2 != 0) {
                function1 = `WebViewResolver$resolveUsingWebView$2`.Companion.INSTANCE
            }
            return webViewResolver.resolveUsingWebView(request, function1, continuation)
        }

        /* JADX INFO: Access modifiers changed from: private */
        fun `resolveUsingWebView$destroyWebView`(objectRef: ObjectRef<WebView?>) {
            Coroutines.INSTANCE.main(
                `WebViewResolver$resolveUsingWebView$destroyWebView$1`(
                    objectRef,
                    null
                )
            )
        }
    }
}