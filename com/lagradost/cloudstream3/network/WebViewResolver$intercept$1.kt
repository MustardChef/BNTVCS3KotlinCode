package com.lagradost.cloudstream3.network

import com.lagradost.cloudstream3.utils.Coroutines.main
import com.lagradost.cloudstream3.AcraApplication.Companion.context
import com.lagradost.cloudstream3.MainActivityKt.getApp
import okhttp3.dnsoverhttps.DnsOverHttps
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
import kotlinx.coroutines.BuildersKt__BuildersKt
import com.lagradost.cloudstream3.network.``DdosGuardKiller$intercept$1`
import okhttp3.*
import kotlin.coroutines.Continuation

/* compiled from: WebViewResolver.kt */
@Metadata(
    m108d1 = ["\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"],
    m107d2 = ["<anonymous>", "Lokhttp3/Response;", "Lkotlinx/coroutines/CoroutineScope;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.network.WebViewResolver\$intercept$1",
    m98f = "WebViewResolver.kt",
    m97i = [],
    m96l = [31],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
)
/* loaded from: classes3.dex */
internal class `WebViewResolver$intercept$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */(/* synthetic */
    val `this$0`: WebViewResolver, /* synthetic */
    val `$request`: Request, /* synthetic */
    val `$chain`: Interceptor.Chain, continuation: Continuation<in `WebViewResolver$intercept$1`?>?
) : SuspendLambda(2, continuation), Function2<CoroutineScope, Continuation<in Response?>?, Object> {
    var label = 0

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        return `WebViewResolver$intercept$1`(`this$0`, `$request`, `$chain`, continuation)
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in Response?>?
    ): Object {
        return (create(
            coroutineScope,
            continuation
        ) as `WebViewResolver$intercept$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        var obj: Object = obj
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            label = 1
            obj = WebViewResolver.Companion.`resolveUsingWebView$default`(
                `this$0`,
                `$request`,
                null,
                this,
                2,
                null
            )
            if (obj === coroutine_suspended) {
                return coroutine_suspended
            }
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            ResultKt.throwOnFailure(obj)
        }
        var request = (obj as Tuples<*, *>).first as Request
        val chain = `$chain`
        if (request == null) {
            request = `$request`
        }
        return chain.proceed(request)
    }
}