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

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: VideoDownloadManager.kt */
@Metadata(m106k = 3, m105mv = [1, 6, 0], m103xi = 48)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.utils.VideoDownloadManager",
    m98f = "VideoDownloadManager.kt",
    m97i = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
    m96l = [307],
    m95m = "createNotification",
    m94n = ["this", "context", "linkName", "ep", ServerProtocol.DIALOG_PARAM_STATE, "notificationCallback", "hlsProgress", "hlsTotal", "builder", "rowTwo", "downloadFormat", "progress", "total"],
    m93s = ["L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "J$0", "J$1"]
) /* loaded from: classes4.dex */
class `VideoDownloadManager$createNotification$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */(/* synthetic */
    val `this$0`: VideoDownloadManager,
    continuation: Continuation<in `VideoDownloadManager$createNotification$1`?>?
) : ContinuationImpl(continuation) {
    var `J$0`: Long = 0
    var `J$1`: Long = 0
    var `L$0`: Object? = null
    var `L$1`: Object? = null
    var `L$10`: Object? = null
    var `L$2`: Object? = null
    var `L$3`: Object? = null
    var `L$4`: Object? = null
    var `L$5`: Object? = null
    var `L$6`: Object? = null
    var `L$7`: Object? = null
    var `L$8`: Object? = null
    var `L$9`: Object? = null
    var label = 0

    /* synthetic */
    var result: Object? = null

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val createNotification: Object
        result = obj
        label = label or Integer.MIN_VALUE
        createNotification = `this$0`.createNotification(
            null,
            null,
            null,
            null,
            null,
            0L,
            0L,
            null,
            null,
            null,
            this
        )
        return createNotification
    }
}