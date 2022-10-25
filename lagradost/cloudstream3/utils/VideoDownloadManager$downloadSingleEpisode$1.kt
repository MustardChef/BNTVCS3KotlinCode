package com.lagradost.cloudstream3.utils

import android.app.Notification
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: VideoDownloadManager.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
    m107d2 = ["<anonymous>", "", "meta", "Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$CreateNotificationMetadata;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class `VideoDownloadManager$downloadSingleEpisode$1`(
    context: Context,
    str: String,
    extractorLink: ExtractorLink,
    downloadEpisodeMetadata: DownloadEpisodeMetadata,
    function2: Function2<Integer?, Notification?, Unit>
) : Lambda<Any?>(1), Function1<CreateNotificationMetadata, Unit> {
    /* synthetic */ val `$context`: Context
    /* synthetic */ val `$ep`: DownloadEpisodeMetadata
    /* synthetic */ val `$link`: ExtractorLink
    /* synthetic */ val `$notificationCallback`: Function2<Integer?, Notification?, Unit>
    /* synthetic */ val `$source`: String

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$context` = context
        `$source` = str
        `$link` = extractorLink
        `$ep` = downloadEpisodeMetadata
        `$notificationCallback` = function2
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: VideoDownloadManager.kt */
    @Metadata(
        m108d1 = ["\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"],
        m107d2 = ["<anonymous>", ""],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    @DebugMetadata(
        m99c = "com.lagradost.cloudstream3.utils.VideoDownloadManager\$downloadSingleEpisode$1$1",
        m98f = "VideoDownloadManager.kt",
        m97i = [],
        m96l = [1394],
        m95m = "invokeSuspend",
        m94n = [],
        m93s = []
    ) /* renamed from: com.lagradost.cloudstream3.utils.VideoDownloadManager$downloadSingleEpisode$1$1 */ /* loaded from: classes4.dex */
    class C49831 internal constructor(
        context: Context,
        str: String,
        extractorLink: ExtractorLink,
        downloadEpisodeMetadata: DownloadEpisodeMetadata,
        createNotificationMetadata: CreateNotificationMetadata,
        function2: Function2<Integer?, Notification?, Unit>,
        continuation: Continuation<in C49831?>?
    ) : SuspendLambda(1, continuation), Function1<Continuation<in Unit>?, Object> {
        /* synthetic */ val `$context`: Context
        /* synthetic */ val `$ep`: DownloadEpisodeMetadata
        /* synthetic */ val `$link`: ExtractorLink
        /* synthetic */ val `$meta`: CreateNotificationMetadata
        /* synthetic */ val `$notificationCallback`: Function2<Integer?, Notification?, Unit>
        /* synthetic */ val `$source`: String
        var label = 0

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
        init {
            `$context` = context
            `$source` = str
            `$link` = extractorLink
            `$ep` = downloadEpisodeMetadata
            `$meta` = createNotificationMetadata
            `$notificationCallback` = function2
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        override fun create(continuation: Continuation<*>?): Continuation<Unit> {
            return C49831(
                `$context`,
                `$source`,
                `$link`,
                `$ep`,
                `$meta`,
                `$notificationCallback`,
                continuation
            )
        }

        @Override // kotlin.jvm.functions.Function1
        override fun invoke(continuation: Continuation<in Unit>?): Object {
            return (create(continuation) as C49831).invokeSuspend(Unit.INSTANCE)
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        override fun invokeSuspend(obj: Object): Object {
            val createNotification: Object
            val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
            val i = label
            if (i == 0) {
                ResultKt.throwOnFailure(obj)
                label = 1
                createNotification = VideoDownloadManager.Companion.INSTANCE.createNotification(
                    `$context`,
                    `$source`,
                    `$link`.name,
                    `$ep`,
                    `$meta`.getType(),
                    `$meta`.getBytesDownloaded(),
                    `$meta`.getBytesTotal(),
                    `$notificationCallback`,
                    `$meta`.getHlsProgress(),
                    `$meta`.getHlsTotal(),
                    this
                )
                if (createNotification === coroutine_suspended) {
                    return coroutine_suspended
                }
            } else if (i != 1) {
                throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
            } else {
                ResultKt.throwOnFailure(obj)
            }
            return Unit.INSTANCE
        }
    }

    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override fun invoke(createNotificationMetadata: CreateNotificationMetadata) {
        invoke2(createNotificationMetadata)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(meta: CreateNotificationMetadata) {
        Intrinsics.checkNotNullParameter(meta, "meta")
        Coroutines.Companion.INSTANCE.main(
            C49831(
                `$context`,
                `$source`,
                `$link`,
                `$ep`,
                meta,
                `$notificationCallback`,
                null
            )
        )
    }
}