package com.lagradost.cloudstream3.network

import android.webkit.WebView
import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: WebViewResolver.kt */
@Metadata(
    m108d1 = ["\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"],
    m107d2 = ["<anonymous>", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.network.WebViewResolver\$resolveUsingWebView\$destroyWebView$1",
    m98f = "WebViewResolver.kt",
    m97i = [],
    m96l = [],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* loaded from: classes3.dex */
class `WebViewResolver$resolveUsingWebView$destroyWebView$1`(
    objectRef: ObjectRef<WebView?>,
    continuation: Continuation<in `WebViewResolver$resolveUsingWebView$destroyWebView$1`?>?
) : SuspendLambda(1, continuation), Function1<Continuation<in Unit>?, Object> {
    /* synthetic */ val `$webView`: ObjectRef<WebView>
    var label = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$webView` = objectRef
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(continuation: Continuation<*>?): Continuation<Unit> {
        return `WebViewResolver$resolveUsingWebView$destroyWebView$1`(`$webView`, continuation)
    }

    @Override // kotlin.jvm.functions.Function1
    override fun invoke(continuation: Continuation<in Unit>?): Object {
        return (create(continuation) as `WebViewResolver$resolveUsingWebView$destroyWebView$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        IntrinsicsKt.getCOROUTINE_SUSPENDED()
        if (label == 0) {
            ResultKt.throwOnFailure(obj)
            val webView: WebView = `$webView`.element
            if (webView != null) {
                webView.stopLoading()
            }
            val webView2: WebView = `$webView`.element
            if (webView2 != null) {
                webView2.destroy()
            }
            `$webView`.element = null
            System.out.println("Destroyed webview" as Object)
            return Unit.INSTANCE
        }
        throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
    }
}