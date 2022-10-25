package com.lagradost.cloudstream3.utils

import android.app.Notification
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Functions
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: VideoDownloadManager.kt */
@Metadata(
    m108d1 = ["\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"],
    m107d2 = ["<anonymous>", "", "invoke", "()Ljava/lang/Integer;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class `VideoDownloadManager$downloadSingleEpisode$3`(
    context: Context,
    extractorLink: ExtractorLink,
    str: String,
    str2: String,
    z: Boolean,
    downloadEpisodeMetadata: DownloadEpisodeMetadata,
    str3: String,
    function2: Function2<Integer?, Notification?, Unit>
) : Lambda<Any?>(0), Functions<Integer?> {
    /* synthetic */ val `$context`: Context
    /* synthetic */ val `$ep`: DownloadEpisodeMetadata
    /* synthetic */ val `$folder`: String
    /* synthetic */ val `$link`: ExtractorLink
    /* synthetic */ val `$name`: String
    /* synthetic */ val `$notificationCallback`: Function2<Integer?, Notification?, Unit>
    /* synthetic */ val `$source`: String
    /* synthetic */ val `$tryResume`: Boolean

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$context` = context
        `$link` = extractorLink
        `$name` = str
        `$folder` = str2
        `$tryResume` = z
        `$ep` = downloadEpisodeMetadata
        `$source` = str3
        `$notificationCallback` = function2
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: VideoDownloadManager.kt */
    @Metadata(
        m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
        m107d2 = ["<anonymous>", "", "meta", "Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$CreateNotificationMetadata;", "invoke"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.utils.VideoDownloadManager$downloadSingleEpisode$3$1 */ /* loaded from: classes4.dex */
    class C49841 internal constructor(
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
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
            m99c = "com.lagradost.cloudstream3.utils.VideoDownloadManager\$downloadSingleEpisode$3$1$1",
            m98f = "VideoDownloadManager.kt",
            m97i = [],
            m96l = [1413],
            m95m = "invokeSuspend",
            m94n = [],
            m93s = []
        ) /* renamed from: com.lagradost.cloudstream3.utils.VideoDownloadManager$downloadSingleEpisode$3$1$1 */ /* loaded from: classes4.dex */
        class C49851 internal constructor(
            context: Context,
            str: String,
            extractorLink: ExtractorLink,
            downloadEpisodeMetadata: DownloadEpisodeMetadata,
            createNotificationMetadata: CreateNotificationMetadata,
            function2: Function2<Integer?, Notification?, Unit>,
            continuation: Continuation<in C49851?>?
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
                return C49851(
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
                return (create(continuation) as C49851).invokeSuspend(Unit.INSTANCE)
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
                        if (r31 and 256 !== 0) null else null,
                        if (r31 and 512 !== 0) null else null,
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
                C49851(
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

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    override fun invoke(): Integer {
        return Integer.valueOf(
            VideoDownloadManager.Companion.INSTANCE.downloadThing(
                `$context`, `$link`, `$name`, `$folder`, "mp4", `$tryResume`, Integer.valueOf(
                    `$ep`.getId()
                ), C49841(`$context`, `$source`, `$link`, `$ep`, `$notificationCallback`)
            )
        )
    }
}