package com.lagradost.cloudstream3

import okhttp3.Request
import okhttp3.Response
import java.io.IOException
import kotlin.jvm.internal.Intrinsics

/* compiled from: MainActivity.kt */
@Metadata(
    m108d1 = ["\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ForceCacheInterceptor;", "Lokhttp3/Interceptor;", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor\$Chain;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class ForceCacheInterceptor : Interceptor {
    @Override // okhttp3.Interceptor
    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        Intrinsics.checkNotNullParameter(chain, "chain")
        val newBuilder: Request.Builder = chain.request().newBuilder()
        if (!NetworkUtils.isConnected()) {
            newBuilder.cacheControl(CacheControl.FORCE_CACHE)
        }
        return chain.proceed(newBuilder.build())
    }
}