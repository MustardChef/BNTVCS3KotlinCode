package com.lagradost.cloudstream3.utils

import android.app.Notification
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Functions

/* compiled from: VideoDownloadManager.kt */
@Metadata(
    m108d1 = ["\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"],
    m107d2 = ["<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.utils.VideoDownloadManager\$downloadCheck$1\$connectionResult$1",
    m98f = "VideoDownloadManager.kt",
    m97i = [],
    m96l = [],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
)
/* loaded from: classes4.dex */
internal class `VideoDownloadManager$downloadCheck$1$connectionResult$1`(
    context: Context,
    downloadItem: DownloadItem,
    extractorLink: ExtractorLink,
    function2: Function2<Integer?, Notification?, Unit>,
    z: Boolean,
    continuation: Continuation<in `VideoDownloadManager$downloadCheck$1$connectionResult$1`?>?
) : SuspendLambda(2, continuation), Function2<CoroutineScope, Continuation<in Integer?>?, Object> {
    /* synthetic */ val `$context`: Context
    /* synthetic */ val `$item`: DownloadItem
    /* synthetic */ val `$link`: ExtractorLink
    /* synthetic */ val `$notificationCallback`: Function2<Integer?, Notification?, Unit>
    /* synthetic */ val `$resume`: Boolean
    var label = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$context` = context
        `$item` = downloadItem
        `$link` = extractorLink
        `$notificationCallback` = function2
        `$resume` = z
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        return `VideoDownloadManager$downloadCheck$1$connectionResult$1`(
            `$context`,
            `$item`,
            `$link`,
            `$notificationCallback`,
            `$resume`,
            continuation
        )
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in Integer?>?
    ): Object {
        return (create(
            coroutineScope,
            continuation
        ) as `VideoDownloadManager$downloadCheck$1$connectionResult$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        IntrinsicsKt.getCOROUTINE_SUSPENDED()
        if (label == 0) {
            ResultKt.throwOnFailure(obj)
            return ArchComponentExt.normalSafeApiCall(
                C49821(
                    `$context`,
                    `$item`,
                    `$link`,
                    `$notificationCallback`,
                    `$resume`
                )
            )
        }
        throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: VideoDownloadManager.kt */
    @Metadata(
        m108d1 = ["\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"],
        m107d2 = ["<anonymous>", "", "invoke", "()Ljava/lang/Integer;"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.utils.VideoDownloadManager$downloadCheck$1$connectionResult$1$1 */ /* loaded from: classes4.dex */
    class C49821 internal constructor(
        context: Context,
        downloadItem: DownloadItem,
        extractorLink: ExtractorLink,
        function2: Function2<Integer?, Notification?, Unit>,
        z: Boolean
    ) : Lambda<Any?>(0), Functions<Integer?> {
        /* synthetic */ val `$context`: Context
        /* synthetic */ val `$item`: DownloadItem
        /* synthetic */ val `$link`: ExtractorLink
        /* synthetic */ val `$notificationCallback`: Function2<Integer?, Notification?, Unit>
        /* synthetic */ val `$resume`: Boolean

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
        init {
            `$context` = context
            `$item` = downloadItem
            `$link` = extractorLink
            `$notificationCallback` = function2
            `$resume` = z
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Functions
        override fun invoke(): Integer {
            val downloadSingleEpisode: Int
            downloadSingleEpisode = VideoDownloadManager.Companion.INSTANCE.downloadSingleEpisode(
                `$context`,
                `$item`.getSource(),
                `$item`.getFolder(),
                `$item`.getEp(),
                `$link`,
                `$notificationCallback`,
                `$resume`
            )
            val valueOf: Integer = Integer.valueOf(downloadSingleEpisode)
            val intValue: Int = valueOf.intValue()
            System.out.println("Single episode finished with return code: $intValue" as Object)
            return valueOf
        }
    }
}