package com.lagradost.cloudstream3.utils

import android.app.Notification
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
    m99c = "com.lagradost.cloudstream3.utils.VideoDownloadManager\$downloadCheck$1",
    m98f = "VideoDownloadManager.kt",
    m97i = [0],
    m96l = [1454],
    m95m = "invokeSuspend",
    m94n = [FirebaseAnalytics.Param.INDEX],
    m93s = ["I$0"]
) /* loaded from: classes4.dex */
class `VideoDownloadManager$downloadCheck$1`(
    downloadResumePackage: DownloadResumePackage,
    downloadItem: DownloadItem,
    i: Int,
    context: Context?,
    function2: Function2<Integer?, Notification?, Unit>?,
    continuation: Continuation<in `VideoDownloadManager$downloadCheck$1`?>?
) : SuspendLambda(1, continuation), Function1<Continuation<in Unit>?, Object> {
    /* synthetic */ val `$context`: Context?
    /* synthetic */ val `$id`: Int
    /* synthetic */ val `$item`: DownloadItem
    /* synthetic */ val `$notificationCallback`: Function2<Integer?, Notification?, Unit>?
    /* synthetic */ val `$pkg`: DownloadResumePackage
    var `I$0` = 0
    var `I$1` = 0
    var label = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$pkg` = downloadResumePackage
        `$item` = downloadItem
        `$id` = i
        `$context` = context
        `$notificationCallback` = function2
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(continuation: Continuation<*>?): Continuation<Unit> {
        return `VideoDownloadManager$downloadCheck$1`(
            `$pkg`,
            `$item`,
            `$id`,
            `$context`,
            `$notificationCallback`,
            continuation
        )
    }

    @Override // kotlin.jvm.functions.Function1
    override fun invoke(continuation: Continuation<in Unit>?): Object {
        return (create(continuation) as `VideoDownloadManager$downloadCheck$1`).invokeSuspend(Unit.INSTANCE)
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046 A[Catch: Exception -> 0x00c3, all -> 0x00e6, TRY_ENTER, TryCatch #1 {all -> 0x00e6, blocks: (B:32:0x00ab, B:34:0x00af, B:36:0x00b5, B:18:0x0046, B:25:0x0065, B:29:0x008f, B:21:0x005c, B:45:0x00ca), top: B:51:0x000b }] */ /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */ /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */ /* JADX WARN: Removed duplicated region for block: B:31:0x00aa A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:34:0x00af A[Catch: Exception -> 0x00c3, all -> 0x00e6, TryCatch #1 {all -> 0x00e6, blocks: (B:32:0x00ab, B:34:0x00af, B:36:0x00b5, B:18:0x0046, B:25:0x0065, B:29:0x008f, B:21:0x005c, B:45:0x00ca), top: B:51:0x000b }] */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a8 -> B:52:0x00ab). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun invokeSuspend(r19: Any?): Any {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.utils.VideoDownloadManager\$downloadCheck$1.invokeSuspend(java.lang.Object):java.lang.Object")
    }
}