package com.lagradost.cloudstream3.mvvm

import androidx.exifinterface.media.ExifInterface
import kotlin.jvm.internal.DefaultConstructorMarker
import com.lagradost.cloudstream3.mvvm.Resource.Loading
import kotlin.jvm.JvmOverloads
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import com.lagradost.cloudstream3.mvvm.ArchComponentExt
import kotlin.collections.ArraysKt
import com.lagradost.cloudstream3.mvvm.`ArchComponentExtKt$safeFail$stackTraceMsg$1`
import kotlinx.coroutines.BuildersKt
import kotlinx.coroutines.Dispatchers
import com.lagradost.cloudstream3.mvvm.``ArchComponentExtKt$safeApiCall$2`
import kotlin.jvm.internal.Intrinsics

/* compiled from: ArchComponentExt.kt */
@Metadata(
    m108d1 = ["\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"],
    m107d2 = ["Lcom/lagradost/cloudstream3/mvvm/Resource;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "Failure", "Loading", "Success", "Lcom/lagradost/cloudstream3/mvvm/Resource\$Success;", "Lcom/lagradost/cloudstream3/mvvm/Resource\$Failure;", "Lcom/lagradost/cloudstream3/mvvm/Resource\$Loading;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes3.dex */
abstract class Resource<T> private constructor() {
    /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

    /* compiled from: ArchComponentExt.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u000c2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"],
        m107d2 = ["Lcom/lagradost/cloudstream3/mvvm/Resource\$Success;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/lagradost/cloudstream3/mvvm/Resource;", "value", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/lagradost/cloudstream3/mvvm/Resource\$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Success<T>(val value: T) : Resource<T>(null) {
        operator fun component1(): T {
            return value
        }

        fun copy(t: T): Success<T> {
            return Success(t)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is Success<*> && Intrinsics.areEqual(
                value,
                (obj as Success<*>).value
            )
        }

        override fun hashCode(): Int {
            val t: T = value ?: return 0
            return t.hashCode()
        }

        override fun toString(): String {
            return "Success(value=" + value + ')'
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                success: Success<*>,
                obj: Object?,
                i: Int,
                obj2: Object?
            ): Success<*> {
                var obj: Object? = obj
                if (i and 1 != 0) {
                    obj = success.value
                }
                return success.copy(obj)
            }
        }
    }

    /* compiled from: ArchComponentExt.kt */
    @Metadata(
        m108d1 = ["\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003J:\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001d\u001a\u00020\nHÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000c\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0013¨\u0006\u001e"],
        m107d2 = ["Lcom/lagradost/cloudstream3/mvvm/Resource\$Failure;", "Lcom/lagradost/cloudstream3/mvvm/Resource;", "", "isNetworkError", "", "errorCode", "", "errorResponse", "", "errorString", "", "(ZLjava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getErrorResponse", "()Ljava/lang/Object;", "getErrorString", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "component4", "copy", "(ZLjava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;)Lcom/lagradost/cloudstream3/mvvm/Resource\$Failure;", "equals", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Failure(z: Boolean, num: Integer?, obj: Object?, errorString: String) :
        Resource<Any?>(null) {
        private val errorCode: Integer?
        private val errorResponse: Object?
        val errorString: String
        val isNetworkError: Boolean
        operator fun component1(): Boolean {
            return isNetworkError
        }

        operator fun component2(): Integer? {
            return errorCode
        }

        operator fun component3(): Object? {
            return errorResponse
        }

        operator fun component4(): String {
            return errorString
        }

        fun copy(z: Boolean, num: Integer?, obj: Object?, errorString: String): Failure {
            Intrinsics.checkNotNullParameter(errorString, "errorString")
            return Failure(z, num, obj, errorString)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Failure) {
                val failure = obj as Failure
                return isNetworkError == failure.isNetworkError && Intrinsics.areEqual(
                    errorCode, failure.errorCode
                ) && Intrinsics.areEqual(
                    errorResponse, failure.errorResponse
                ) && Intrinsics.areEqual(
                    errorString, failure.errorString
                )
            }
            return false
        }

        /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Type inference failed for: r0v1, types: [int] */ /* JADX WARN: Type inference failed for: r0v8 */ /* JADX WARN: Type inference failed for: r0v9 */
        override fun hashCode(): Int {
            val z = isNetworkError
            r0 = z
            if (z) {
                r0 = 1
            }
            val i: Int = r0 * 31
            val num: Integer? = errorCode
            val hashCode: Int = (i + if (num == null) 0 else num.hashCode()) * 31
            val obj: Object? = errorResponse
            return (hashCode + if (obj != null) obj.hashCode() else 0) * 31 + errorString.hashCode()
        }

        override fun toString(): String {
            return "Failure(isNetworkError=" + isNetworkError + ", errorCode=" + errorCode + ", errorResponse=" + errorResponse + ", errorString=" + errorString + ')'
        }

        fun getErrorCode(): Integer? {
            return errorCode
        }

        fun getErrorResponse(): Object? {
            return errorResponse
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        init {
            Intrinsics.checkNotNullParameter(errorString, "errorString")
            isNetworkError = z
            errorCode = num
            errorResponse = obj
            this.errorString = errorString
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                failure: Failure,
                z: Boolean,
                num: Integer?,
                obj: Object?,
                str: String,
                i: Int,
                obj2: Object?
            ): Failure {
                var z = z
                var num: Integer? = num
                var obj: Object? = obj
                var str = str
                if (i and 1 != 0) {
                    z = failure.isNetworkError
                }
                if (i and 2 != 0) {
                    num = failure.errorCode
                }
                if (i and 4 != 0) {
                    obj = failure.errorResponse
                }
                if (i and 8 != 0) {
                    str = failure.errorString
                }
                return failure.copy(z, num, obj, str)
            }
        }
    }

    /* compiled from: ArchComponentExt.kt */
    @Metadata(
        m108d1 = ["\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\u000c\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"],
        m107d2 = ["Lcom/lagradost/cloudstream3/mvvm/Resource\$Loading;", "Lcom/lagradost/cloudstream3/mvvm/Resource;", "", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Loading(val url: String?) : Resource<Any?>(null) {
        operator fun component1(): String? {
            return url
        }

        fun copy(str: String?): Loading {
            return Loading(str)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is Loading && Intrinsics.areEqual(
                url,
                (obj as Loading).url
            )
        }

        override fun hashCode(): Int {
            val str = url ?: return 0
            return str.hashCode()
        }

        override fun toString(): String {
            return "Loading(url=" + url + ')'
        }

        @JvmOverloads
                /* synthetic */   constructor(
            str: String? = null,
            i: Int = 1,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(if (i and 1 != 0) null else str) {
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                loading: Loading,
                str: String?,
                i: Int,
                obj: Object?
            ): Loading {
                var str = str
                if (i and 1 != 0) {
                    str = loading.url
                }
                return loading.copy(str)
            }
        }
    }
}