package com.lagradost.cloudstream3.utils

import android.content.Context
import com.bumptech.glide.RequestBuilder
import com.bumptech.glide.manager.Lifecycle

/* loaded from: classes4.dex */
class GlideRequests(
    glide: Glide?,
    lifecycle: Lifecycle?,
    requestManagerTreeNode: RequestManagerTreeNode?,
    context: Context?
) : RequestManager(glide, lifecycle, requestManagerTreeNode, context) {
    @Override // com.bumptech.glide.RequestManager
    /* bridge */ /* synthetic */  override fun addDefaultRequestListener(requestListener: RequestListener<*>?): RequestManager {
        return addDefaultRequestListener(requestListener as RequestListener<Object?>?)
    }

    @Override // com.bumptech.glide.RequestManager
    /* renamed from: as */   override fun <ResourceType> mo137as(cls: Class<ResourceType>): GlideRequest<ResourceType> {
        return GlideRequest(this.glide, this, cls, this.context)
    }

    @Override // com.bumptech.glide.RequestManager
    @Synchronized
    override fun applyDefaultRequestOptions(requestOptions: RequestOptions): GlideRequests {
        return super.applyDefaultRequestOptions(requestOptions) as GlideRequests
    }

    @Override // com.bumptech.glide.RequestManager
    @Synchronized
    override fun setDefaultRequestOptions(requestOptions: RequestOptions): GlideRequests {
        return super.setDefaultRequestOptions(requestOptions) as GlideRequests
    }

    @Override // com.bumptech.glide.RequestManager
    fun addDefaultRequestListener(requestListener: RequestListener<Object>): GlideRequests {
        return super.addDefaultRequestListener(requestListener) as GlideRequests
    }

    @Override // com.bumptech.glide.RequestManager
    override fun asBitmap(): GlideRequest<Bitmap> {
        return super.asBitmap() as GlideRequest<*>
    }

    @Override // com.bumptech.glide.RequestManager
    override fun asGif(): GlideRequest<GifDrawable> {
        return super.asGif() as GlideRequest<*>
    }

    @Override // com.bumptech.glide.RequestManager
    override fun asDrawable(): GlideRequest<Drawable> {
        return super.asDrawable() as GlideRequest<*>
    }

    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    override fun load(bitmap: Bitmap): RequestBuilder<Drawable> {
        return super.load(bitmap) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    override fun load(drawable: Drawable): RequestBuilder<Drawable> {
        return super.load(drawable) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    override fun load(str: String): RequestBuilder<Drawable> {
        return super.load(str) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    override fun load(uri: Uri): RequestBuilder<Drawable> {
        return super.load(uri) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    override fun load(file: File): RequestBuilder<Drawable> {
        return super.load(file) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    override fun load(num: Integer): RequestBuilder<Drawable> {
        return super.load(num) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    @Deprecated
    override fun load(url: URL): RequestBuilder<Drawable> {
        return super.load(url) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    override fun load(bArr: ByteArray): RequestBuilder<Drawable> {
        return super.load(bArr) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.RequestManager, com.bumptech.glide.ModelTypes
    override fun load(obj: Object): RequestBuilder<Drawable> {
        return super.load(obj) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.RequestManager
    override fun downloadOnly(): GlideRequest<File> {
        return super.downloadOnly() as GlideRequest<*>
    }

    @Override // com.bumptech.glide.RequestManager
    override fun download(obj: Object): GlideRequest<File> {
        return super.download(obj) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.RequestManager
    override fun asFile(): GlideRequest<File> {
        return super.asFile() as GlideRequest<*>
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.RequestManager
    override fun setRequestOptions(requestOptions: RequestOptions) {
        if (requestOptions is GlideOptions) {
            super.setRequestOptions(requestOptions)
        } else {
            super.setRequestOptions(GlideOptions().apply2(requestOptions as BaseRequestOptions<*>))
        }
    }
}