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
import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: ArchComponentExt.kt */
@Metadata(m106k = 3, m105mv = [1, 6, 0], m103xi = 48)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.mvvm.ArchComponentExtKt",
    m98f = "ArchComponentExt.kt",
    m97i = [],
    m96l = [56],
    m95m = "suspendSafeApiCall",
    m94n = [],
    m93s = []
) /* loaded from: classes3.dex */
class `ArchComponentExtKt$suspendSafeApiCall$1`<T>  /* JADX INFO: Access modifiers changed from: package-private */
    (continuation: Continuation<in `ArchComponentExtKt$suspendSafeApiCall$1`<*>?>?) :
    ContinuationImpl(continuation) {
    var label = 0

    /* synthetic */
    var result: Object? = null

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        result = obj
        label = label or Integer.MIN_VALUE
        return ArchComponentExt.suspendSafeApiCall<Any>(null, this)
    }
}