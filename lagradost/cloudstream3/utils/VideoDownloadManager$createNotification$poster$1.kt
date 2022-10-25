package com.lagradost.cloudstream3.utils

import android.content.Context
import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: VideoDownloadManager.kt */
@Metadata(
    m108d1 = ["\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"],
    m107d2 = ["<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.utils.VideoDownloadManager\$createNotification\$poster$1",
    m98f = "VideoDownloadManager.kt",
    m97i = [],
    m96l = [],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* loaded from: classes4.dex */
class `VideoDownloadManager$createNotification$poster$1`(
    context: Context,
    downloadEpisodeMetadata: DownloadEpisodeMetadata,
    continuation: Continuation<in `VideoDownloadManager$createNotification$poster$1`?>?
) : SuspendLambda(2, continuation), Function2<CoroutineScope, Continuation<in Bitmap?>?, Object> {
    /* synthetic */ val `$context`: Context
    /* synthetic */ val `$ep`: DownloadEpisodeMetadata
    var label = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$context` = context
        `$ep` = downloadEpisodeMetadata
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        return `VideoDownloadManager$createNotification$poster$1`(`$context`, `$ep`, continuation)
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in Bitmap?>?
    ): Object {
        return (create(
            coroutineScope,
            continuation
        ) as `VideoDownloadManager$createNotification$poster$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val imageBitmapFromUrl: Bitmap
        IntrinsicsKt.getCOROUTINE_SUSPENDED()
        if (label == 0) {
            ResultKt.throwOnFailure(obj)
            imageBitmapFromUrl = VideoDownloadManager.Companion.INSTANCE.getImageBitmapFromUrl(
                `$context`, `$ep`.getPoster()
            )
            return imageBitmapFromUrl
        }
        throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
    }
}