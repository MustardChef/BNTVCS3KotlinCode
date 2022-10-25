package com.lagradost.cloudstream3.utils

import com.lagradost.cloudstream3.MainAPIKt.isMovieType
import com.lagradost.cloudstream3.MainAPIKt.getMapper
import com.lagradost.cloudstream3.CommonActivity.Companion.`showToast$default`
import com.lagradost.cloudstream3.MainAPIKt.base64Decode
import com.lagradost.cloudstream3.AcraApplication.Companion.getKeys
import com.lagradost.cloudstream3.AcraApplication.Companion.setKey
import com.lagradost.cloudstream3.AcraApplication.Companion.context
import com.lagradost.cloudstream3.AcraApplication.Companion.removeKey
import com.lagradost.cloudstream3.MainActivityKt.getApp
import com.lagradost.cloudstream3.APIHolder.getApiFromNameNull
import com.lagradost.cloudstream3.MainAPI.extractorVerifierJob
import androidx.exifinterface.media.ExifInterface
import com.google.android.exoplayer2.source.rtsp.SessionDescription
import kotlin.LazyKt
import com.lagradost.cloudstream3.utils.``Vector2$lengthSquared$2`
import kotlin.jvm.internal.Intrinsics

/* compiled from: Vector2.kt */
@Metadata(
    m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u000e\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0000J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0011\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0018H\u0086\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u001b\u0010\u0006\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\u000c\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\u000c\n\u0004\b\r\u0010\n\u001a\u0004\b\u000c\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\b¨\u0006\u001e"],
    m107d2 = ["Lcom/lagradost/cloudstream3/utils/Vector2;", "", "x", "", "y", "(FF)V", SessionDescription.ATTR_LENGTH, "getLength", "()F", "length\$delegate", "Lkotlin/Lazy;", "lengthSquared", "getLengthSquared", "lengthSquared\$delegate", "getX", "getY", "component1", "component2", "copy", "distanceTo", "other", "equals", "", "hashCode", "", "minus", "plus", "times", "toString", "", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class Vector2(/* renamed from: x */
    val x: Float, /* renamed from: y */
    val y: Float
) {

    private val `lengthSquared$delegate`: Lazy<*> = LazyKt.lazy(`Vector2$lengthSquared$2`(this))
    private val `length$delegate`: Lazy<*> = LazyKt.lazy(`Vector2$length$2`(this))
    operator fun component1(): Float {
        return x
    }

    operator fun component2(): Float {
        return y
    }

    fun copy(f: Float, f2: Float): Vector2 {
        return Vector2(f, f2)
    }

    override fun equals(obj: Object): Boolean {
        if (this === obj) {
            return true
        }
        if (obj is Vector2) {
            val vector2 = obj as Vector2
            return Intrinsics.areEqual(
                Float.valueOf(x) as Object?,
                Float.valueOf(vector2.x) as Object?
            ) && Intrinsics.areEqual(
                Float.valueOf(
                    y
                ) as Object?, Float.valueOf(vector2.y) as Object?
            )
        }
        return false
    }

    override fun hashCode(): Int {
        return Float.floatToIntBits(x) * 31 + Float.floatToIntBits(y)
    }

    operator fun minus(other: Vector2): Vector2 {
        Intrinsics.checkNotNullParameter(other, "other")
        return Vector2(x - other.x, y - other.y)
    }

    operator fun plus(other: Vector2): Vector2 {
        Intrinsics.checkNotNullParameter(other, "other")
        return Vector2(x + other.x, y + other.y)
    }

    operator fun times(i: Int): Vector2 {
        val f = i.toFloat()
        return Vector2(x * f, y * f)
    }

    override fun toString(): String {
        return '('.code.toFloat() + x + ", " + y + ')'
    }

    fun distanceTo(other: Vector2): Float {
        Intrinsics.checkNotNullParameter(other, "other")
        return minus(other).length
    }

    /* JADX INFO: Access modifiers changed from: private */
    val lengthSquared: Float
        get() = (`lengthSquared$delegate`.value as Number).floatValue()
    val length: Float
        get() = (`length$delegate`.value as Number).floatValue()

    companion object {
        fun  /* synthetic */`copy$default`(
            vector2: Vector2,
            f: Float,
            f2: Float,
            i: Int,
            obj: Object?
        ): Vector2 {
            var f = f
            var f2 = f2
            if (i and 1 != 0) {
                f = vector2.x
            }
            if (i and 2 != 0) {
                f2 = vector2.y
            }
            return vector2.copy(f, f2)
        }
    }
}