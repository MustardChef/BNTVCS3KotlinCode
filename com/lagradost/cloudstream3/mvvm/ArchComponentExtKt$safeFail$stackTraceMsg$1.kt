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

/* compiled from: ArchComponentExt.kt */
@Metadata(
    m108d1 = ["\u0000\u0012\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"],
    m107d2 = ["<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Ljava/lang/StackTraceElement;", "kotlin.jvm.PlatformType", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes3.dex */
internal class `ArchComponentExtKt$safeFail$stackTraceMsg$1` : Lambda<Any?>(1),
    Function1<StackTraceElement?, CharSequence?> {
    @Override // kotlin.jvm.functions.Function1
    override fun invoke(stackTraceElement: StackTraceElement): CharSequence {
        return stackTraceElement.getFileName() + ' ' + stackTraceElement.getLineNumber()
    }

    companion object {
        val INSTANCE = `ArchComponentExtKt$safeFail$stackTraceMsg$1`()
    }
}