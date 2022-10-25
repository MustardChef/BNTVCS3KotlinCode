package com.lagradost.cloudstream3.utils

import android.content.Context
import com.bumptech.glide.Priority
import com.bumptech.glide.RequestBuilder
import com.bumptech.glide.load.Key
import com.bumptech.glide.load.Transformation

/* loaded from: classes4.dex */
class GlideRequest<TranscodeType> : RequestBuilder<TranscodeType>, Cloneable {
    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.request.BaseRequestOptions
    /* bridge */ /* synthetic */  override fun apply(baseRequestOptions: BaseRequestOptions<*>?): RequestBuilder<TranscodeType>? {
        return apply(baseRequestOptions as BaseRequestOptions<*>?)
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.request.BaseRequestOptions
    /* bridge */ /* synthetic */  override fun apply(baseRequestOptions: BaseRequestOptions<*>?): BaseRequestOptions<*> {
        return apply(baseRequestOptions as BaseRequestOptions<*>?)
    }

    @Override
    override // com.bumptech.glide.request.BaseRequestOptions
            /* bridge */ /* synthetic */   fun decode(cls: Class): BaseRequestOptions<*> {
        return decode(cls as Class<*>)
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
            /* bridge */ /* synthetic */   fun optionalTransform(transformation: Transformation<*>?): BaseRequestOptions<*> {
        return optionalTransform(transformation as Transformation<Bitmap?>?)
    }

    @Override
    operator // com.bumptech.glide.request.BaseRequestOptions
            /* bridge */ /* synthetic */   fun set(
        option: Option<*>?,
        obj: Object?
    ): BaseRequestOptions<*> {
        return set(option as Option<Option<*>?>?, obj as Option<*>?)
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
            /* bridge */ /* synthetic */   fun transform(transformation: Transformation<*>?): BaseRequestOptions<*> {
        return transform(transformation as Transformation<Bitmap?>?)
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
            /* bridge */ /* synthetic */   fun transform(transformationArr: Array<Transformation<*>?>?): BaseRequestOptions<*> {
        return transform(transformationArr as Array<Transformation<Bitmap?>?>?)
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @Deprecated  /* bridge */ /* synthetic */   fun transforms(transformationArr: Array<Transformation<*>?>?): BaseRequestOptions<*> {
        return transforms(transformationArr as Array<Transformation<Bitmap?>?>?)
    }

    internal constructor(
        cls: Class<TranscodeType>?,
        requestBuilder: RequestBuilder<*>?
    ) : super(cls, requestBuilder) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    constructor(
        glide: Glide?,
        requestManager: RequestManager?,
        cls: Class<TranscodeType>?,
        context: Context?
    ) : super(glide, requestManager, cls, context) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.RequestBuilder
    public override fun getDownloadOnlyRequest(): GlideRequest<File> {
        return GlideRequest<Any?>(
            File::class.java,
            this
        ).apply(DOWNLOAD_ONLY_OPTIONS as BaseRequestOptions<*>)
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun sizeMultiplier(f: Float): GlideRequest<TranscodeType> {
        return super.sizeMultiplier(f) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun useUnlimitedSourceGeneratorsPool(z: Boolean): GlideRequest<TranscodeType> {
        return super.useUnlimitedSourceGeneratorsPool(z) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun useAnimationPool(z: Boolean): GlideRequest<TranscodeType> {
        return super.useAnimationPool(z) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun onlyRetrieveFromCache(z: Boolean): GlideRequest<TranscodeType> {
        return super.onlyRetrieveFromCache(z) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun diskCacheStrategy(diskCacheStrategy: DiskCacheStrategy): GlideRequest<TranscodeType> {
        return super.diskCacheStrategy(diskCacheStrategy) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun priority(priority: Priority): GlideRequest<TranscodeType> {
        return super.priority(priority) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun placeholder(drawable: Drawable): GlideRequest<TranscodeType> {
        return super.placeholder(drawable) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun placeholder(i: Int): GlideRequest<TranscodeType> {
        return super.placeholder(i) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun fallback(drawable: Drawable): GlideRequest<TranscodeType> {
        return super.fallback(drawable) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun fallback(i: Int): GlideRequest<TranscodeType> {
        return super.fallback(i) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun error(drawable: Drawable): GlideRequest<TranscodeType> {
        return super.error(drawable) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun error(i: Int): GlideRequest<TranscodeType> {
        return super.error(i) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun theme(theme: Resources.Theme): GlideRequest<TranscodeType> {
        return super.theme(theme) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun skipMemoryCache(z: Boolean): GlideRequest<TranscodeType> {
        return super.skipMemoryCache(z) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun override(i: Int, i2: Int): GlideRequest<TranscodeType> {
        return super.override(i, i2) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun override(i: Int): GlideRequest<TranscodeType> {
        return super.override(i) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun signature(key: Key): GlideRequest<TranscodeType> {
        return super.signature(key) as GlideRequest<*>
    }

    @Override
    override // com.bumptech.glide.request.BaseRequestOptions
    fun <Y> set(option: Option<Y>, y: Y): GlideRequest<TranscodeType> {
        return super.set<Option<Y>>(option as Option<Option<Y>>, y as Option<Y>) as GlideRequest<*>
    }

    @Override
    override // com.bumptech.glide.request.BaseRequestOptions
    fun decode(cls: Class<*>): GlideRequest<TranscodeType> {
        return super.decode(cls) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun encodeFormat(compressFormat: Bitmap.CompressFormat): GlideRequest<TranscodeType> {
        return super.encodeFormat(compressFormat) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun encodeQuality(i: Int): GlideRequest<TranscodeType> {
        return super.encodeQuality(i) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun frame(j: Long): GlideRequest<TranscodeType> {
        return super.frame(j) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun format(decodeFormat: DecodeFormat): GlideRequest<TranscodeType> {
        return super.format(decodeFormat) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun disallowHardwareConfig(): GlideRequest<TranscodeType> {
        return super.disallowHardwareConfig() as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun downsample(downsampleStrategy: DownsampleStrategy): GlideRequest<TranscodeType> {
        return super.downsample(downsampleStrategy) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun timeout(i: Int): GlideRequest<TranscodeType> {
        return super.timeout(i) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun optionalCenterCrop(): GlideRequest<TranscodeType> {
        return super.optionalCenterCrop() as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun centerCrop(): GlideRequest<TranscodeType> {
        return super.centerCrop() as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun optionalFitCenter(): GlideRequest<TranscodeType> {
        return super.optionalFitCenter() as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun fitCenter(): GlideRequest<TranscodeType> {
        return super.fitCenter() as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun optionalCenterInside(): GlideRequest<TranscodeType> {
        return super.optionalCenterInside() as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun centerInside(): GlideRequest<TranscodeType> {
        return super.centerInside() as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun optionalCircleCrop(): GlideRequest<TranscodeType> {
        return super.optionalCircleCrop() as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun circleCrop(): GlideRequest<TranscodeType> {
        return super.circleCrop() as GlideRequest<*>
    }

    @Override
    override // com.bumptech.glide.request.BaseRequestOptions
    fun transform(transformation: Transformation<Bitmap>): GlideRequest<TranscodeType> {
        return super.transform(transformation) as GlideRequest<*>
    }

    @Override
    override // com.bumptech.glide.request.BaseRequestOptions
    fun transform(vararg transformationArr: Transformation<Bitmap?>?): GlideRequest<TranscodeType> {
        return super.transform(*transformationArr) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @Deprecated
    override fun transforms(vararg transformationArr: Transformation<Bitmap?>?): GlideRequest<TranscodeType> {
        return super.transforms(*transformationArr) as GlideRequest<*>
    }

    @Override
    override // com.bumptech.glide.request.BaseRequestOptions
    fun optionalTransform(transformation: Transformation<Bitmap>): GlideRequest<TranscodeType> {
        return super.optionalTransform(transformation) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun <Y> optionalTransform(
        cls: Class<Y>,
        transformation: Transformation<Y>
    ): GlideRequest<TranscodeType> {
        return super.optionalTransform(
            cls as Class,
            transformation as Transformation<*>
        ) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun <Y> transform(
        cls: Class<Y>,
        transformation: Transformation<Y>
    ): GlideRequest<TranscodeType> {
        return super.transform(cls as Class, transformation as Transformation<*>) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun dontTransform(): GlideRequest<TranscodeType> {
        return super.dontTransform() as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun dontAnimate(): GlideRequest<TranscodeType> {
        return super.dontAnimate() as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun lock(): GlideRequest<TranscodeType> {
        return super.lock() as GlideRequest<*>
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun autoClone(): GlideRequest<TranscodeType> {
        return super.autoClone() as GlideRequest<*>
    }

    @Override
    override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.request.BaseRequestOptions
    fun apply(baseRequestOptions: BaseRequestOptions<*>?): GlideRequest<TranscodeType> {
        return super.apply(baseRequestOptions) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.RequestBuilder
    override fun transition(transitionOptions: TransitionOptions<*, in TranscodeType>?): GlideRequest<TranscodeType> {
        return super.transition(transitionOptions as TransitionOptions<*, *>?) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.RequestBuilder
    override fun listener(requestListener: RequestListener<TranscodeType>): GlideRequest<TranscodeType> {
        return super.listener(requestListener as RequestListener<*>) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.RequestBuilder
    override fun addListener(requestListener: RequestListener<TranscodeType>): GlideRequest<TranscodeType> {
        return super.addListener(requestListener as RequestListener<*>) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.RequestBuilder
    override fun error(requestBuilder: RequestBuilder<TranscodeType>): GlideRequest<TranscodeType> {
        return super.error(requestBuilder as RequestBuilder<*>) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.RequestBuilder
    override fun error(obj: Object): GlideRequest<TranscodeType> {
        return super.error(obj) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.RequestBuilder
    override fun thumbnail(requestBuilder: RequestBuilder<TranscodeType>): GlideRequest<TranscodeType> {
        return super.thumbnail(requestBuilder as RequestBuilder<*>) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.RequestBuilder
    @SafeVarargs
    override fun thumbnail(vararg requestBuilderArr: RequestBuilder<TranscodeType>): GlideRequest<TranscodeType> {
        return super.thumbnail(*requestBuilderArr as Array<RequestBuilder<*>>) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.RequestBuilder
    override fun thumbnail(list: List<RequestBuilder<TranscodeType>?>): GlideRequest<TranscodeType> {
        return super.thumbnail(list) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.RequestBuilder
    override fun thumbnail(f: Float): GlideRequest<TranscodeType> {
        return super.thumbnail(f) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    override fun load(obj: Object): GlideRequest<TranscodeType> {
        return super.load(obj) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    override fun load(bitmap: Bitmap): GlideRequest<TranscodeType> {
        return super.load(bitmap) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    override fun load(drawable: Drawable): GlideRequest<TranscodeType> {
        return super.load(drawable) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    override fun load(str: String): GlideRequest<TranscodeType> {
        return super.load(str) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    override fun load(uri: Uri): GlideRequest<TranscodeType> {
        return super.load(uri) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    override fun load(file: File): GlideRequest<TranscodeType> {
        return super.load(file) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    override fun load(num: Integer): GlideRequest<TranscodeType> {
        return super.load(num) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    @Deprecated
    override fun load(url: URL): GlideRequest<TranscodeType> {
        return super.load(url) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.ModelTypes
    override fun load(bArr: ByteArray): GlideRequest<TranscodeType> {
        return super.load(bArr) as GlideRequest<*>
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.request.BaseRequestOptions
    override fun clone(): GlideRequest<TranscodeType> {
        return super.clone() as GlideRequest<*>
    }
}