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
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: CastHelper.kt */
@Metadata(
    m108d1 = ["\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"],
    m107d2 = ["<anonymous>", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.utils.CastHelper\$awaitLinks$1",
    m98f = "CastHelper.kt",
    m97i = [],
    m96l = [74],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* loaded from: classes4.dex */
class `CastHelper$awaitLinks$1`(
    function1: Function1<in Boolean?, Unit>,
    pendingResult: PendingResult<RemoteMediaClient.MediaChannelResult?>,
    continuation: Continuation<in `CastHelper$awaitLinks$1`?>?
) : SuspendLambda(1, continuation), Function1<Continuation<in Unit>?, Object?> {
    /* synthetic */ val `$callback`: Function1<Boolean?, Unit>
    /* synthetic */ val `$pending`: PendingResult<RemoteMediaClient.MediaChannelResult>
    var label = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$callback` = function1
        `$pending` = pendingResult
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(continuation: Continuation<*>?): Continuation<Unit> {
        return `CastHelper$awaitLinks$1`(`$callback`, `$pending`, continuation)
    }

    @Override // kotlin.jvm.functions.Function1
    override operator fun invoke(continuation: Continuation<in Unit>): Object {
        return (create(continuation) as `CastHelper$awaitLinks$1`).invokeSuspend(Unit.INSTANCE)
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        var obj: Object = obj
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            label = 1
            obj = BuildersKt.withContext<RemoteMediaClient.MediaChannelResult>(
                Dispatchers.getIO(), `CastHelper$awaitLinks$1$res$1`(
                    `$pending`, null
                ), this
            )
            if (obj === coroutine_suspended) {
                return coroutine_suspended
            }
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            ResultKt.throwOnFailure(obj)
        }
        Intrinsics.checkNotNullExpressionValue(
            obj,
            "pending: PendingResult<R…s.IO) { pending.await() }"
        )
        if ((obj as RemoteMediaClient.MediaChannelResult).getStatus().getStatusCode() == 2100) {
            `$callback`.invoke(boxing.boxBoolean(true))
            System.out.println("FAILED AND LOAD NEXT" as Object)
        }
        return Unit.INSTANCE
    }
}