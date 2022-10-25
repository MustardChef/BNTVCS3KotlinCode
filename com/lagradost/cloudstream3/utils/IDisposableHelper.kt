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

/* compiled from: IDisposable.kt */
@Metadata(
    m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J1\u0010\u0003\u001a\u00020\u0004\"\b\b\u0000\u0010\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u0002H\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0002\u0010\n¨\u0006\u000b"],
    m107d2 = ["Lcom/lagradost/cloudstream3/utils/IDisposableHelper;", "", "()V", "using", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/lagradost/cloudstream3/utils/IDisposable;", "disposeObject", "work", "Lkotlin/Function1;", "(Lcom/lagradost/cloudstream3/utils/IDisposable;Lkotlin/jvm/functions/Function1;)V", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class IDisposableHelper private constructor() {
    fun <T : IDisposable?> using(disposeObject: T, work: Function1<in T, Unit>) {
        Intrinsics.checkNotNullParameter(disposeObject, "disposeObject")
        Intrinsics.checkNotNullParameter(work, "work")
        work.invoke(disposeObject)
        disposeObject!!.dispose()
    }

    companion object {
        val INSTANCE = IDisposableHelper()
    }
}