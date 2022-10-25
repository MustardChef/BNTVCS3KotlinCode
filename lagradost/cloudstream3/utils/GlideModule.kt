package com.lagradost.cloudstream3.utils

import android.content.Context
import com.bumptech.glide.Registry
import kotlin.jvm.internal.Intrinsics

/* compiled from: GlideApp.kt */
@Metadata(
    m108d1 = ["\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0016¨\u0006\u000e"],
    m107d2 = ["Lcom/lagradost/cloudstream3/utils/GlideModule;", "Lcom/bumptech/glide/module/AppGlideModule;", "()V", "applyOptions", "", "context", "Landroid/content/Context;", "builder", "Lcom/bumptech/glide/GlideBuilder;", "registerComponents", "glide", "Lcom/bumptech/glide/Glide;", "registry", "Lcom/bumptech/glide/Registry;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class GlideModule : AppGlideModule() {
    @Override // com.bumptech.glide.module.AppGlideModule, com.bumptech.glide.module.AppliesOptions
    override fun applyOptions(context: Context, builder: GlideBuilder) {
        Intrinsics.checkNotNullParameter(context, "context")
        Intrinsics.checkNotNullParameter(builder, "builder")
        super.applyOptions(context, builder)
        RequestOptions().diskCacheStrategy(DiskCacheStrategy.ALL)
            .signature(ObjectKey(Short.valueOf(System.currentTimeMillis() as Short)))
    }

    @Override // com.bumptech.glide.module.LibraryGlideModule, com.bumptech.glide.module.RegistersComponents
    override fun registerComponents(context: Context, glide: Glide, registry: Registry) {
        Intrinsics.checkNotNullParameter(context, "context")
        Intrinsics.checkNotNullParameter(glide, "glide")
        Intrinsics.checkNotNullParameter(registry, "registry")
        val requests = Requests(null, null, null, null, null, 0, null, 0L, 255, null)
        requests.setDefaultHeaders(
            MapsKt.mapOf(
                TuplesKt.m100to<Any, Any>(
                    "user-agent",
                    MainAPIKt.USER_AGENT
                )
            )
        )
        registry.replace(
            GlideUrl::class.java,
            InputStream::class.java,
            OkHttpUrlLoader.Factory(
                RequestsHelper.initClient(requests, context).newBuilder()
                    .addInterceptor(DdosGuardKiller(false)).build()
            )
        )
        super.registerComponents(context, glide, registry)
    }
}