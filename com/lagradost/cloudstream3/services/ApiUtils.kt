package com.lagradost.cloudstream3.services

import okhttp3.Request
import okhttp3.Response
import java.util.concurrent.TimeUnit
import kotlin.jvm.internal.Intrinsics

/* compiled from: ApiUtils.kt */
@Metadata(
    m108d1 = ["\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ!\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u0002H\u0010\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u000c¨\u0006\u0015"],
    m107d2 = ["Lcom/lagradost/cloudstream3/services/ApiUtils;", "", "()V", "builder", "Lretrofit2/Retrofit\$Builder;", "getBuilder", "()Lretrofit2/Retrofit\$Builder;", "httpClient", "Lokhttp3/OkHttpClient\$Builder;", "getHttpClient", "()Lokhttp3/OkHttpClient\$Builder;", "setHttpClient", "(Lokhttp3/OkHttpClient\$Builder;)V", "createApi", "Lcom/lagradost/cloudstream3/services/ApiService;", "createService", ExifInterface.LATITUDE_SOUTH, "serviceClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "Companion", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class ApiUtils {
    private val builder: Retrofit.Builder
    private var httpClient: OkHttpClient.Builder? = null

    init {
        val addConverterFactory: Retrofit.Builder =
            Retrofit.Builder().baseUrl("https://phimhd.xyz/")
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
        Intrinsics.checkNotNullExpressionValue(
            addConverterFactory,
            "Builder()\n        .baseU…onverterFactory.create())"
        )
        builder = addConverterFactory
    }

    fun getHttpClient(): OkHttpClient.Builder? {
        return httpClient
    }

    fun setHttpClient(builder: OkHttpClient.Builder?) {
        httpClient = builder
    }

    fun getBuilder(): Retrofit.Builder {
        return builder
    }

    /* compiled from: ApiUtils.kt */
    @Metadata(
        m108d1 = ["\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"],
        m107d2 = ["Lcom/lagradost/cloudstream3/services/ApiUtils\$Companion;", "", "()V", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}
    }

    fun <S> createService(cls: Class<S>?): S {
        val builder: OkHttpClient.Builder = OkHttpClient.Builder()
        httpClient = builder
        if (builder != null) {
            builder.readTimeout(3L, TimeUnit.MINUTES)
        }
        val builder2: OkHttpClient.Builder? = httpClient
        if (builder2 != null) {
            builder2.connectTimeout(3L, TimeUnit.MINUTES)
        }
        val builder3: OkHttpClient.Builder? = httpClient
        if (builder3 != null) {
            builder3.addInterceptor(`$$Lambda$ApiUtils$bDXlutHUzLCg3HelnBfEzhZ7gME`.Companion.INSTANCE)
        }
        val builder4: OkHttpClient.Builder? = httpClient
        Intrinsics.checkNotNull(builder4)
        val build: Retrofit = this.builder.client(builder4.build()).build()
        Intrinsics.checkNotNullExpressionValue(build, "builder.client(client).build()")
        return build.create<Any>(cls)
    }

    fun createApi(): ApiService {
        return createService(ApiService::class.java) as ApiService
    }

    companion object {
        val Companion = Companion(null)

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: createService$lambda-0  reason: not valid java name */
        fun `m8604createService$lambda0`(chain: Interceptor.Chain): Response {
            Intrinsics.checkNotNullParameter(chain, "chain")
            val request: Request = chain.request()
            return chain.proceed(
                request.newBuilder().addHeader("Content-Type", AbstractSpiCall.ACCEPT_JSON_VALUE)
                    .method(request.method(), request.body()).build()
            )
        }
    }
}