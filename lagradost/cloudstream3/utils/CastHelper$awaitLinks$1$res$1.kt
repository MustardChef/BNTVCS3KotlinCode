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

/* compiled from: CastHelper.kt */
@Metadata(
    m108d1 = ["\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"],
    m107d2 = ["<anonymous>", "Lcom/google/android/gms/cast/framework/media/RemoteMediaClient\$MediaChannelResult;", "Lkotlinx/coroutines/CoroutineScope;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.utils.CastHelper\$awaitLinks$1\$res$1",
    m98f = "CastHelper.kt",
    m97i = [],
    m96l = [],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
)
/* loaded from: classes4.dex */
internal class `CastHelper$awaitLinks$1$res$1`(
    pendingResult: PendingResult<RemoteMediaClient.MediaChannelResult?>,
    continuation: Continuation<in `CastHelper$awaitLinks$1$res$1`?>?
) : SuspendLambda(2, continuation),
    Function2<CoroutineScope, Continuation<in RemoteMediaClient.MediaChannelResult?>?, Object> {
    /* synthetic */ val `$pending`: PendingResult<RemoteMediaClient.MediaChannelResult>
    var label = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$pending` = pendingResult
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        return `CastHelper$awaitLinks$1$res$1`(`$pending`, continuation)
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in RemoteMediaClient.MediaChannelResult?>?
    ): Object {
        return (create(
            coroutineScope,
            continuation
        ) as `CastHelper$awaitLinks$1$res$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        IntrinsicsKt.getCOROUTINE_SUSPENDED()
        if (label == 0) {
            ResultKt.throwOnFailure(obj)
            return `$pending`.await()
        }
        throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
    }
}