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
import okhttp3.Response
import kotlin.coroutines.Continuation

/* compiled from: DdosGuardKiller.kt */
@Metadata(
    m108d1 = ["\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"],
    m107d2 = ["<anonymous>", "Lokhttp3/Response;", "Lkotlinx/coroutines/CoroutineScope;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.network.DdosGuardKiller\$intercept$1",
    m98f = "DdosGuardKiller.kt",
    m97i = [],
    m96l = [28, 32],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
)
/* loaded from: classes3.dex */
internal class `DdosGuardKiller$intercept$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */(/* synthetic */
    val `$chain`: Interceptor.Chain, /* synthetic */
    val `this$0`: DdosGuardKiller, continuation: Continuation<in `DdosGuardKiller$intercept$1`?>?
) : SuspendLambda(2, continuation), Function2<CoroutineScope, Continuation<in Response?>?, Object> {
    var label = 0

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        return `DdosGuardKiller$intercept$1`(`$chain`, `this$0`, continuation)
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in Response?>?
    ): Object {
        return (create(
            coroutineScope,
            continuation
        ) as `DdosGuardKiller$intercept$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        var obj: Object? = obj
        val z: Boolean
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj)
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj)
                return obj
            } else {
                throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
            }
        }
        ResultKt.throwOnFailure(obj)
        val request = `$chain`.request()
        z = `this$0`.alwaysBypass
        if (z) {
            label = 1
            obj = `this$0`.bypassDdosGuard(request, this)
            return if (obj === coroutine_suspended) coroutine_suspended else obj
        }
        val proceed = `$chain`.proceed(request)
        if (proceed.code() == 403) {
            label = 2
            obj = `this$0`.bypassDdosGuard(request, this)
            return if (obj === coroutine_suspended) {
                coroutine_suspended
            } else obj
        }
        return proceed
    }
}