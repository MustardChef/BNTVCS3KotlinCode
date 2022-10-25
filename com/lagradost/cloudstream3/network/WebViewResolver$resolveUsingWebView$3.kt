package com.lagradost.cloudstream3.network

import android.content.Context
import okhttp3.Headers
import okhttp3.Request
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: WebViewResolver.kt */
@Metadata(
    m108d1 = ["\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"],
    m107d2 = ["<anonymous>", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.network.WebViewResolver\$resolveUsingWebView$3",
    m98f = "WebViewResolver.kt",
    m97i = [],
    m96l = [],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* loaded from: classes3.dex */
class `WebViewResolver$resolveUsingWebView$3`(
    objectRef: ObjectRef<WebView?>,
    str: String,
    headers: Headers,
    webViewResolver: WebViewResolver,
    objectRef2: ObjectRef<Request?>,
    list: List<Request>,
    function1: Function1<Request?, Boolean>,
    continuation: Continuation<in `WebViewResolver$resolveUsingWebView$3`?>?
) : SuspendLambda(1, continuation), Function1<Continuation<in Unit>?, Object> {
    /* synthetic */ val `$extraRequestList`: List<Request>
    /* synthetic */ val `$fixedRequest`: ObjectRef<Request>
    /* synthetic */ val `$headers`: Headers
    /* synthetic */ val `$requestCallBack`: Function1<Request?, Boolean>
    /* synthetic */ val `$url`: String
    /* synthetic */ val `$webView`: ObjectRef<WebView>
    var label = 0
    /* synthetic */ val `this$0`: WebViewResolver

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$webView` = objectRef
        `$url` = str
        `$headers` = headers
        `this$0` = webViewResolver
        `$fixedRequest` = objectRef2
        `$extraRequestList` = list
        `$requestCallBack` = function1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(continuation: Continuation<*>?): Continuation<Unit> {
        return `WebViewResolver$resolveUsingWebView$3`(
            `$webView`,
            `$url`,
            `$headers`,
            `this$0`,
            `$fixedRequest`,
            `$extraRequestList`,
            `$requestCallBack`,
            continuation
        )
    }

    @Override // kotlin.jvm.functions.Function1
    override fun invoke(continuation: Continuation<in Unit>?): Object {
        return (create(continuation) as `WebViewResolver$resolveUsingWebView$3`).invokeSuspend(Unit.INSTANCE)
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, android.webkit.WebView] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val objectRef: ObjectRef<WebView>
        val context: Context
        IntrinsicsKt.getCOROUTINE_SUSPENDED()
        if (label == 0) {
            ResultKt.throwOnFailure(obj)
            try {
                objectRef = `$webView`
                context = AcraApplication.Companion.context
            } catch (e: Exception) {
                ArchComponentExt.logError(e)
            }
            if (context != null) {
                webView = WebView(context)
                webView.getSettings().setJavaScriptEnabled(true)
                webView.getSettings().setDomStorageEnabled(true)
                webView.getSettings().setUserAgentString(MainAPIKt.USER_AGENT)
                webView.getSettings().setBlockNetworkImage(true)
                objectRef.element = webView
                val webView2: WebView = `$webView`.element
                if (webView2 != null) {
                    webView2.setWebViewClient(
                        C48342(
                            `this$0`,
                            `$fixedRequest`,
                            `$extraRequestList`,
                            `$requestCallBack`,
                            `$webView`
                        )
                    )
                }
                val webView3: WebView = `$webView`.element
                if (webView3 != null) {
                    webView3.loadUrl(`$url`, MapsKt.toMap(`$headers`))
                }
                return Unit.INSTANCE
            }
            throw RuntimeException("No base context in WebViewResolver")
        }
        throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
    }

    /* compiled from: WebViewResolver.kt */
    @Metadata(
        m108d1 = ["\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"],
        m107d2 = ["com/lagradost/cloudstream3/network/WebViewResolver\$resolveUsingWebView$3$2", "Landroid/webkit/WebViewClient;", "shouldInterceptRequest", "Landroid/webkit/WebResourceResponse;", ViewHierarchyConstants.VIEW_KEY, "Landroid/webkit/WebView;", ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID, "Landroid/webkit/WebResourceRequest;", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.network.WebViewResolver$resolveUsingWebView$3$2 */ /* loaded from: classes3.dex */
    class C48342 internal constructor(/* synthetic */val `this$0`: WebViewResolver,
                                                     objectRef: ObjectRef<Request?>,
                                                     list: List<Request>,
                                                     function1: Function1<Request?, Boolean>,
                                                     objectRef2: ObjectRef<WebView?>
    ) : WebViewClient() {
        /* synthetic */ val `$extraRequestList`: List<Request>
        /* synthetic */ val `$fixedRequest`: ObjectRef<Request>
        /* synthetic */ val `$requestCallBack`: Function1<Request?, Boolean>
        /* synthetic */ val `$webView`: ObjectRef<WebView>

        /* JADX WARN: Multi-variable type inference failed */
        init {
            `$fixedRequest` = objectRef
            `$extraRequestList` = list
            `$requestCallBack` = function1
            `$webView` = objectRef2
        }

        @Override // android.webkit.WebViewClient
        fun shouldInterceptRequest(
            view: WebView?,
            request: WebResourceRequest
        ): WebResourceResponse {
            val `runBlocking$default`: Object
            Intrinsics.checkNotNullParameter(view, "view")
            Intrinsics.checkNotNullParameter(request, "request")
            `runBlocking$default` = BuildersKt__BuildersKt.`runBlocking$default`(
                null,
                `WebViewResolver$resolveUsingWebView$3$2$shouldInterceptRequest$1`(
                    request,
                    `this$0`,
                    `$fixedRequest`,
                    `$extraRequestList`,
                    this,
                    view,
                    `$requestCallBack`,
                    `$webView`,
                    null
                ),
                1,
                null
            )
            return `runBlocking$default` as WebResourceResponse
        }
    }
}