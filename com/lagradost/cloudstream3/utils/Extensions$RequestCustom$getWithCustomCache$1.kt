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
import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: Extensions.kt */
@Metadata(m106k = 3, m105mv = [1, 6, 0], m103xi = 48)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.utils.Extensions\$RequestCustom",
    m98f = "Extensions.kt",
    m97i = [0],
    m96l = [43],
    m95m = "getWithCustomCache",
    m94n = ["url"],
    m93s = ["L$0"]
) /* loaded from: classes4.dex */
class `Extensions$RequestCustom$getWithCustomCache$1`(
    requestCustom: RequestCustom,
    continuation: Continuation<in `Extensions$RequestCustom$getWithCustomCache$1`?>?
) : ContinuationImpl(continuation) {
    var `L$0`: Object? = null
    var label = 0

    /* synthetic */
    var result: Object? = null
    /* synthetic */ val `this$0`: RequestCustom

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `this$0` = requestCustom
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        result = obj
        label = label or Integer.MIN_VALUE
        return `this$0`.getWithCustomCache(
            null,
            null,
            null,
            null,
            null,
            false,
            0,
            null,
            0L,
            null,
            false,
            this
        )
    }
}