package com.lagradost.cloudstream3.network

import android.webkit.WebResourceRequest
import okhttp3.Request
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: WebViewResolver.kt */
@Metadata(
    m108d1 = ["\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"],
    m107d2 = ["<anonymous>", "Landroid/webkit/WebResourceResponse;", "Lkotlinx/coroutines/CoroutineScope;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.network.WebViewResolver\$resolveUsingWebView$3$2\$shouldInterceptRequest$1",
    m98f = "WebViewResolver.kt",
    m97i = [],
    m96l = [156, 161],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
)
/* loaded from: classes3.dex */
internal class `WebViewResolver$resolveUsingWebView$3$2$shouldInterceptRequest$1`(
    webResourceRequest: WebResourceRequest,
    webViewResolver: WebViewResolver,
    objectRef: ObjectRef<Request?>,
    list: List<Request>,
    c48342: C48342,
    webView: WebView?,
    function1: Function1<Request?, Boolean>,
    objectRef2: ObjectRef<WebView?>,
    continuation: Continuation<in `WebViewResolver$resolveUsingWebView$3$2$shouldInterceptRequest$1`?>?
) : SuspendLambda(2, continuation),
    Function2<CoroutineScope, Continuation<in WebResourceResponse?>?, Object> {
    /* synthetic */ val `$extraRequestList`: List<Request>
    /* synthetic */ val `$fixedRequest`: ObjectRef<Request>
    /* synthetic */ val `$request`: WebResourceRequest
    /* synthetic */ val `$requestCallBack`: Function1<Request?, Boolean>
    /* synthetic */ val `$view`: WebView?
    /* synthetic */ val `$webView`: ObjectRef<WebView>
    var `L$0`: Object? = null
    var label = 0
    /* synthetic */ val `this$0`: WebViewResolver
    /* synthetic */ val `this$1`: C48342

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$request` = webResourceRequest
        `this$0` = webViewResolver
        `$fixedRequest` = objectRef
        `$extraRequestList` = list
        `this$1` = c48342
        `$view` = webView
        `$requestCallBack` = function1
        `$webView` = objectRef2
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        return `WebViewResolver$resolveUsingWebView$3$2$shouldInterceptRequest$1`(
            `$request`,
            `this$0`,
            `$fixedRequest`,
            `$extraRequestList`,
            `this$1`,
            `$view`,
            `$requestCallBack`,
            `$webView`,
            continuation
        )
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in WebResourceResponse?>?
    ): Object {
        return (create(
            coroutineScope,
            continuation
        ) as `WebViewResolver$resolveUsingWebView$3$2$shouldInterceptRequest$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Type inference failed for: r2v39, types: [okhttp3.Request, T, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        var z: Boolean
        var z2: Boolean
        val shouldInterceptRequest: WebResourceResponse
        val `post$default`: Object
        val webViewResolver: WebViewResolver?
        val obj2: Object
        val webViewResolver2: WebViewResolver?
        val shouldInterceptRequest2: WebResourceResponse
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        return try {
            if (i != 0) {
                return if (i == 1) {
                    webViewResolver2 = `L$0`
                    ResultKt.throwOnFailure(obj)
                    obj2 = obj
                    webViewResolver2!!.toWebResourceResponse((obj2 as NiceResponse).getOkhttpResponse())
                } else if (i == 2) {
                    webViewResolver = `L$0`
                    ResultKt.throwOnFailure(obj)
                    `post$default` = obj
                    webViewResolver!!.toWebResourceResponse((`post$default` as NiceResponse).getOkhttpResponse())
                } else {
                    throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
                }
            }
            ResultKt.throwOnFailure(obj)
            val uri: String = `$request`.getUrl().toString()
            Intrinsics.checkNotNullExpressionValue(uri, "request.url.toString()")
            if (`this$0`.interceptUrl.containsMatchIn(uri)) {
                val objectRef: ObjectRef<Request> = `$fixedRequest`
                request = `this$0`.toRequest(`$request`)
                val function1: Function1<Request, Boolean> = `$requestCallBack`
                val objectRef2: ObjectRef<WebView?> = `$webView`
                if (function1.invoke(request).booleanValue()) {
                    WebViewResolver.Companion.`resolveUsingWebView$destroyWebView`(objectRef2)
                }
                objectRef.element = request
                System.out.println("Web-view request finished: $uri" as Object)
                WebViewResolver.Companion.`resolveUsingWebView$destroyWebView`(`$webView`)
                return null
            }
            val additionalUrls: List<Regex?>? = `this$0`.additionalUrls
            if (additionalUrls !is Collection || !additionalUrls.isEmpty()) {
                for (regex in additionalUrls!!) {
                    if (regex!!.containsMatchIn(uri)) {
                        z = true
                        break
                    }
                }
            }
            z = false
            if (z) {
                val list = `$extraRequestList`
                val request2 = `this$0`.toRequest(`$request`)
                val function12 = `$requestCallBack`
                val objectRef3: ObjectRef<WebView?> = `$webView`
                if (function12.invoke(request2).booleanValue()) {
                    WebViewResolver.Companion.`resolveUsingWebView$destroyWebView`(objectRef3)
                }
                list.add(request2)
            }
            val listOf: List<String> = CollectionsKt.listOf<Object>(
                *arrayOf(
                    ".jpg",
                    ".png",
                    ".webp",
                    ".mpg",
                    ".mpeg",
                    ".jpeg",
                    ".webm",
                    ".mp4",
                    ".mp3",
                    ".gifv",
                    ".flv",
                    ".asf",
                    ".mov",
                    ".mng",
                    ".mkv",
                    ".ogg",
                    ".avi",
                    ".wav",
                    ".woff2",
                    ".woff",
                    ".ttf",
                    ".css",
                    ".vtt",
                    ".srt",
                    ".ts",
                    ".gif",
                    "wss://"
                ) as Array<Object>
            )
            if (listOf !is Collection || !listOf.isEmpty()) {
                for (str2 in listOf) {
                    val path: String = URI(uri).getPath()
                    Intrinsics.checkNotNullExpressionValue(path, "URI(webViewUrl).path")
                    if (StringsKt.`contains$default`(
                            path as CharSequence,
                            str2 as CharSequence,
                            false,
                            2,
                            null as Object?
                        )
                    ) {
                        z2 = true
                        break
                    }
                }
            }
            z2 = false
            if (!z2 && !StringsKt.`endsWith$default`(
                    uri,
                    "/favicon.ico",
                    false,
                    2,
                    null as Object?
                )
            ) {
                return if (StringsKt.`contains$default`(
                        uri as CharSequence,
                        "recaptcha" as CharSequence,
                        false,
                        2,
                        null as Object?
                    )
                ) {
                    shouldInterceptRequest2 =
                        super /*android.webkit.WebViewClient*/.shouldInterceptRequest(
                            `$view`, `$request`
                        )
                    shouldInterceptRequest2
                } else if (Intrinsics.areEqual(`$request`.getMethod(), ShareTarget.METHOD_GET)) {
                    val webViewResolver3 = `this$0`
                    val requestHeaders: Map<String, String> = `$request`.getRequestHeaders()
                    Intrinsics.checkNotNullExpressionValue(requestHeaders, "request.requestHeaders")
                    `L$0` = webViewResolver3
                    label = 1
                    obj2 = Requests.`get$default`(
                        MainActivityKt.getApp(),
                        uri,
                        requestHeaders,
                        null,
                        null,
                        null,
                        false,
                        0,
                        null,
                        0L,
                        null,
                        false,
                        this,
                        2044,
                        null
                    )
                    if (obj2 === coroutine_suspended) {
                        return coroutine_suspended
                    }
                    webViewResolver2 = webViewResolver3
                    webViewResolver2.toWebResourceResponse((obj2 as NiceResponse).getOkhttpResponse())
                } else if (!Intrinsics.areEqual(`$request`.getMethod(), ShareTarget.METHOD_POST)) {
                    shouldInterceptRequest =
                        super /*android.webkit.WebViewClient*/.shouldInterceptRequest(
                            `$view`, `$request`
                        )
                    shouldInterceptRequest
                } else {
                    val webViewResolver4 = `this$0`
                    val requestHeaders2: Map<String, String> = `$request`.getRequestHeaders()
                    Intrinsics.checkNotNullExpressionValue(
                        requestHeaders2,
                        "request.requestHeaders"
                    )
                    `L$0` = webViewResolver4
                    label = 2
                    `post$default` = Requests.`post$default`(
                        MainActivityKt.getApp(),
                        uri,
                        requestHeaders2,
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
                        this,
                        32764,
                        null
                    )
                    if (`post$default` === coroutine_suspended) {
                        return coroutine_suspended
                    }
                    webViewResolver = webViewResolver4
                    webViewResolver.toWebResourceResponse((`post$default` as NiceResponse).getOkhttpResponse())
                }
            }
            WebResourceResponse("image/png", null, null)
        } catch (unused: Exception) {
            null
        }
    }
}