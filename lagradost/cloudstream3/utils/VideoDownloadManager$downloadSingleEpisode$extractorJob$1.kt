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
@Metadata(
    m108d1 = ["\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"],
    m107d2 = ["<anonymous>", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.utils.VideoDownloadManager\$downloadSingleEpisode\$extractorJob$1",
    m98f = "VideoDownloadManager.kt",
    m97i = [],
    m96l = [1380],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* loaded from: classes4.dex */
class `VideoDownloadManager$downloadSingleEpisode$extractorJob$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */(/* synthetic */
    val `$link`: ExtractorLink,
    continuation: Continuation<in `VideoDownloadManager$downloadSingleEpisode$extractorJob$1`?>?
) : SuspendLambda(1, continuation), Function1<Continuation<in Unit>?, Object?> {
    var label = 0

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(continuation: Continuation<*>?): Continuation<Unit> {
        return `VideoDownloadManager$downloadSingleEpisode$extractorJob$1`(`$link`, continuation)
    }

    @Override // kotlin.jvm.functions.Function1
    override operator fun invoke(continuation: Continuation<in Unit>): Object {
        return (create(continuation) as `VideoDownloadManager$downloadSingleEpisode$extractorJob$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        var apiFromNameNull: MainAPI
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            if (`$link`.extractorData != null && APIHolder.INSTANCE.getApiFromNameNull(`$link`.source)
                    .also { apiFromNameNull = it } != null
            ) {
                label = 1
                if (apiFromNameNull.extractorVerifierJob(
                        `$link`.extractorData,
                        this
                    ) === coroutine_suspended
                ) {
                    return coroutine_suspended
                }
            }
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            ResultKt.throwOnFailure(obj)
        }
        return Unit.INSTANCE
    }
}