package com.lagradost.cloudstream3.utils

import android.app.Notification
import kotlin.coroutines.Continuation

/* compiled from: DownloadFileWorkManager.kt */
@Metadata(
    m108d1 = ["\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"],
    m107d2 = ["<anonymous>", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.utils.DownloadFileWorkManager\$handleNotification$1",
    m98f = "DownloadFileWorkManager.kt",
    m97i = [],
    m96l = [],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
)
/* loaded from: classes4.dex */
internal class `DownloadFileWorkManager$handleNotification$1`(/* synthetic */val `this$0`: DownloadFileWorkManager, /* synthetic */
                                                                             val `$id`: Int,
                                                                             notification: Notification?,
                                                                             continuation: Continuation<in `DownloadFileWorkManager$handleNotification$1`?>?
) : SuspendLambda(1, continuation), Function1<Continuation<in Unit>?, Object> {
    /* synthetic */ val `$notification`: Notification?
    var label = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$notification` = notification
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(continuation: Continuation<*>?): Continuation<Unit> {
        return `DownloadFileWorkManager$handleNotification$1`(
            `this$0`,
            `$id`,
            `$notification`,
            continuation
        )
    }

    @Override // kotlin.jvm.functions.Function1
    override fun invoke(continuation: Continuation<in Unit>?): Object {
        return (create(continuation) as `DownloadFileWorkManager$handleNotification$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        IntrinsicsKt.getCOROUTINE_SUSPENDED()
        if (label == 0) {
            ResultKt.throwOnFailure(obj)
            `this$0`.setForegroundAsync(ForegroundInfo(`$id`, `$notification`))
            return Unit.INSTANCE
        }
        throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
    }
}