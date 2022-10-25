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

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: DownloadFileWorkManager.kt */
@Metadata(m106k = 3, m105mv = [1, 6, 0], m103xi = 48)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.utils.DownloadFileWorkManager",
    m98f = "DownloadFileWorkManager.kt",
    m97i = [0, 0, 1, 1, 2, 2],
    m96l = [31, 46, 49],
    m95m = "doWork",
    m94n = ["this", SDKConstants.PARAM_KEY, "this", SDKConstants.PARAM_KEY, "this", SDKConstants.PARAM_KEY],
    m93s = ["L$0", "L$1", "L$0", "L$1", "L$0", "L$1"]
) /* loaded from: classes4.dex */
class `DownloadFileWorkManager$doWork$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */(/* synthetic */
    val `this$0`: DownloadFileWorkManager,
    continuation: Continuation<in `DownloadFileWorkManager$doWork$1`?>?
) : ContinuationImpl(continuation) {
    var `L$0`: Object? = null
    var `L$1`: Object? = null
    var label = 0

    /* synthetic */
    var result: Object? = null

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        result = obj
        label = label or Integer.MIN_VALUE
        return `this$0`.doWork(this)
    }
}