package com.lagradost.cloudstream3.utils

import android.content.res.Resources
import com.bumptech.glide.Priority
import com.bumptech.glide.load.Key
import com.bumptech.glide.load.Transformation

/* loaded from: classes4.dex */
class GlideOptions : RequestOptions(), Cloneable {
    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* bridge */ /* synthetic */  override fun apply(baseRequestOptions: BaseRequestOptions<*>?): RequestOptions {
        return apply2(baseRequestOptions as BaseRequestOptions<*>?)
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* bridge */ /* synthetic */  override fun decode(cls: Class): RequestOptions {
        return decode2(cls as Class<*>)
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* bridge */ /* synthetic */  override fun optionalTransform(transformation: Transformation<*>?): RequestOptions {
        return optionalTransform2(transformation as Transformation<Bitmap?>?)
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* bridge */ /* synthetic */  override operator fun set(
        option: Option<*>?,
        obj: Object?
    ): RequestOptions {
        return set2<Option<*>?>(option as Option<Option<*>?>?, obj as Option<*>?)
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* bridge */ /* synthetic */  override fun transform(transformation: Transformation<*>?): RequestOptions {
        return transform2(transformation as Transformation<Bitmap?>?)
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @SafeVarargs
    /* bridge */ /* synthetic */  override fun transform(transformationArr: Array<Transformation<*>?>): RequestOptions {
        return transform2(*transformationArr as Array<Transformation<Bitmap?>?>)
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @SafeVarargs
    @Deprecated
    /* bridge */ /* synthetic */  override fun transforms(transformationArr: Array<Transformation<*>?>): RequestOptions {
        return transforms2(*transformationArr as Array<Transformation<Bitmap?>?>)
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun sizeMultiplier(f: Float): RequestOptions {
        return super.sizeMultiplier(f) as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun useUnlimitedSourceGeneratorsPool(z: Boolean): RequestOptions {
        return super.useUnlimitedSourceGeneratorsPool(z) as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun useAnimationPool(z: Boolean): RequestOptions {
        return super.useAnimationPool(z) as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun onlyRetrieveFromCache(z: Boolean): RequestOptions {
        return super.onlyRetrieveFromCache(z) as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun diskCacheStrategy(diskCacheStrategy: DiskCacheStrategy): RequestOptions {
        return super.diskCacheStrategy(diskCacheStrategy) as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun priority(priority: Priority): RequestOptions {
        return super.priority(priority) as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun placeholder(drawable: Drawable): RequestOptions {
        return super.placeholder(drawable) as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun placeholder(i: Int): RequestOptions {
        return super.placeholder(i) as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun fallback(drawable: Drawable): RequestOptions {
        return super.fallback(drawable) as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun fallback(i: Int): RequestOptions {
        return super.fallback(i) as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun error(drawable: Drawable): RequestOptions {
        return super.error(drawable) as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun error(i: Int): RequestOptions {
        return super.error(i) as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun theme(theme: Resources.Theme): RequestOptions {
        return super.theme(theme) as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun skipMemoryCache(z: Boolean): RequestOptions {
        return super.skipMemoryCache(z) as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun override(i: Int, i2: Int): RequestOptions {
        return super.override(i, i2) as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun override(i: Int): RequestOptions {
        return super.override(i) as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun signature(key: Key): RequestOptions {
        return super.signature(key) as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    fun clone(): RequestOptions {
        return super.m8556clone() as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
            /* renamed from: set  reason: avoid collision after fix types in other method */    fun <Y> set2(
        option: Option<Y?>?,
        y: Y
    ): RequestOptions {
        return super.set<Option<Y>>(option as Option<Option<Y>?>?, y as Option<Y>) as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
            /* renamed from: decode  reason: avoid collision after fix types in other method */    fun decode2(
        cls: Class<*>?
    ): RequestOptions {
        return super.decode(cls) as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun encodeFormat(compressFormat: Bitmap.CompressFormat): RequestOptions {
        return super.encodeFormat(compressFormat) as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun encodeQuality(i: Int): RequestOptions {
        return super.encodeQuality(i) as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun frame(j: Long): RequestOptions {
        return super.frame(j) as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun format(decodeFormat: DecodeFormat): RequestOptions {
        return super.format(decodeFormat) as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun disallowHardwareConfig(): RequestOptions {
        return super.disallowHardwareConfig() as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun downsample(downsampleStrategy: DownsampleStrategy): RequestOptions {
        return super.downsample(downsampleStrategy) as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun timeout(i: Int): RequestOptions {
        return super.timeout(i) as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun optionalCenterCrop(): RequestOptions {
        return super.optionalCenterCrop() as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun centerCrop(): RequestOptions {
        return super.centerCrop() as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun optionalFitCenter(): RequestOptions {
        return super.optionalFitCenter() as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun fitCenter(): RequestOptions {
        return super.fitCenter() as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun optionalCenterInside(): RequestOptions {
        return super.optionalCenterInside() as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun centerInside(): RequestOptions {
        return super.centerInside() as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun optionalCircleCrop(): RequestOptions {
        return super.optionalCircleCrop() as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun circleCrop(): RequestOptions {
        return super.circleCrop() as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
            /* renamed from: transform  reason: avoid collision after fix types in other method */    fun transform2(
        transformation: Transformation<Bitmap?>?
    ): RequestOptions {
        return super.transform(transformation) as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @SafeVarargs /* renamed from: transform  reason: avoid collision after fix types in other method */    fun transform2(
        vararg transformationArr: Transformation<Bitmap?>?
    ): RequestOptions {
        return super.transform(*transformationArr) as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @SafeVarargs
    @Deprecated /* renamed from: transforms  reason: avoid collision after fix types in other method */    fun transforms2(
        vararg transformationArr: Transformation<Bitmap?>?
    ): RequestOptions {
        return super.transforms(*transformationArr) as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
            /* renamed from: optionalTransform  reason: avoid collision after fix types in other method */    fun optionalTransform2(
        transformation: Transformation<Bitmap?>?
    ): RequestOptions {
        return super.optionalTransform(transformation) as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun <Y> optionalTransform(
        cls: Class<Y>,
        transformation: Transformation<Y>
    ): RequestOptions {
        return super.optionalTransform(
            cls as Class,
            transformation as Transformation<*>
        ) as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun <Y> transform(cls: Class<Y>, transformation: Transformation<Y>): RequestOptions {
        return super.transform(cls as Class, transformation as Transformation<*>) as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun dontTransform(): RequestOptions {
        return super.dontTransform() as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun dontAnimate(): RequestOptions {
        return super.dontAnimate() as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
            /* renamed from: apply  reason: avoid collision after fix types in other method */    fun apply2(
        baseRequestOptions: BaseRequestOptions<*>?
    ): RequestOptions {
        return super.apply(baseRequestOptions) as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun lock(): RequestOptions {
        return super.lock() as GlideOptions
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    override fun autoClone(): RequestOptions {
        return super.autoClone() as GlideOptions
    }

    companion object {
        private var centerCropTransform2: GlideOptions? = null
        private var centerInsideTransform1: GlideOptions? = null
        private var circleCropTransform3: GlideOptions? = null
        private var fitCenterTransform0: GlideOptions? = null
        private var noAnimation5: GlideOptions? = null
        private var noTransformation4: GlideOptions? = null
        fun sizeMultiplierOf(f: Float): GlideOptions {
            return GlideOptions().sizeMultiplier(f)
        }

        fun diskCacheStrategyOf(diskCacheStrategy: DiskCacheStrategy): GlideOptions {
            return GlideOptions().diskCacheStrategy(diskCacheStrategy)
        }

        fun priorityOf(priority: Priority): GlideOptions {
            return GlideOptions().priority(priority)
        }

        fun placeholderOf(drawable: Drawable?): GlideOptions {
            return GlideOptions().placeholder(drawable)
        }

        fun placeholderOf(i: Int): GlideOptions {
            return GlideOptions().placeholder(i)
        }

        fun errorOf(drawable: Drawable?): GlideOptions {
            return GlideOptions().error(drawable)
        }

        fun errorOf(i: Int): GlideOptions {
            return GlideOptions().error(i)
        }

        fun skipMemoryCacheOf(z: Boolean): GlideOptions {
            return GlideOptions().skipMemoryCache(z)
        }

        fun overrideOf(i: Int, i2: Int): GlideOptions {
            return GlideOptions().override(i, i2)
        }

        fun overrideOf(i: Int): GlideOptions {
            return GlideOptions().override(i)
        }

        fun signatureOf(key: Key): GlideOptions {
            return GlideOptions().signature(key)
        }

        fun fitCenterTransform(): GlideOptions? {
            if (fitCenterTransform0 == null) {
                fitCenterTransform0 = GlideOptions().fitCenter().autoClone()
            }
            return fitCenterTransform0
        }

        fun centerInsideTransform(): GlideOptions? {
            if (centerInsideTransform1 == null) {
                centerInsideTransform1 = GlideOptions().centerInside().autoClone()
            }
            return centerInsideTransform1
        }

        fun centerCropTransform(): GlideOptions? {
            if (centerCropTransform2 == null) {
                centerCropTransform2 = GlideOptions().centerCrop().autoClone()
            }
            return centerCropTransform2
        }

        fun circleCropTransform(): GlideOptions? {
            if (circleCropTransform3 == null) {
                circleCropTransform3 = GlideOptions().circleCrop().autoClone()
            }
            return circleCropTransform3
        }

        fun bitmapTransform(transformation: Transformation<Bitmap?>?): GlideOptions {
            return GlideOptions().transform2(transformation)
        }

        fun noTransformation(): GlideOptions? {
            if (noTransformation4 == null) {
                noTransformation4 = GlideOptions().dontTransform().autoClone()
            }
            return noTransformation4
        }

        fun <T> option(option: Option<T?>?, t: T): GlideOptions {
            return GlideOptions().set2<Option<T>?>(option as Option<Option<T>?>?, t as Option<T>)
        }

        fun decodeTypeOf(cls: Class<*>?): GlideOptions {
            return GlideOptions().decode2(cls)
        }

        fun formatOf(decodeFormat: DecodeFormat): GlideOptions {
            return GlideOptions().format(decodeFormat)
        }

        fun frameOf(j: Long): GlideOptions {
            return GlideOptions().frame(j)
        }

        fun downsampleOf(downsampleStrategy: DownsampleStrategy): GlideOptions {
            return GlideOptions().downsample(downsampleStrategy)
        }

        fun timeoutOf(i: Int): GlideOptions {
            return GlideOptions().timeout(i)
        }

        fun encodeQualityOf(i: Int): GlideOptions {
            return GlideOptions().encodeQuality(i)
        }

        fun encodeFormatOf(compressFormat: Bitmap.CompressFormat): GlideOptions {
            return GlideOptions().encodeFormat(compressFormat)
        }

        fun noAnimation(): GlideOptions? {
            if (noAnimation5 == null) {
                noAnimation5 = GlideOptions().dontAnimate().autoClone()
            }
            return noAnimation5
        }
    }
}