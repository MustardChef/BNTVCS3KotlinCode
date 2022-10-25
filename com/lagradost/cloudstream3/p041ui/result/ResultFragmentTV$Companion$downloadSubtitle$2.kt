package com.lagradost.cloudstream3.p041ui.result

import android.content.Context
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: ResultFragmentTV.kt */
@Metadata(
    m108d1 = ["\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"],
    m107d2 = ["<anonymous>", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.ui.result.ResultFragmentTV\$Companion\$downloadSubtitle$2",
    m98f = "ResultFragmentTV.kt",
    m97i = [],
    m96l = [],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentTV$Companion$downloadSubtitle$2 */ /* loaded from: classes4.dex */
class `ResultFragmentTV$Companion$downloadSubtitle$2` constructor(
    context: Context,
    extractorSubtitleLink: ExtractorSubtitleLink,
    str: String,
    str2: String,
    continuation: Continuation<in `ResultFragmentTV$Companion$downloadSubtitle$2`?>?
) : SuspendLambda(1, continuation), Function1<Continuation<in Unit>?, Object> {
    /* synthetic */ val `$context`: Context
    /* synthetic */ val `$fileName`: String
    /* synthetic */ val `$folder`: String
    /* synthetic */ val `$link`: ExtractorSubtitleLink
    var label: Int = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$context` = context
        `$link` = extractorSubtitleLink
        `$fileName` = str
        `$folder` = str2
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun create(continuation: Continuation<*>?): Continuation<Unit> {
        return `ResultFragmentTV$Companion$downloadSubtitle$2`(
            `$context`,
            `$link`,
            `$fileName`,
            `$folder`,
            continuation
        )
    }

    @Override // kotlin.jvm.functions.Function1
    public override fun invoke(continuation: Continuation<in Unit>?): Object {
        return (create(continuation) as `ResultFragmentTV$Companion$downloadSubtitle$2`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: ResultFragmentTV.kt */
    @Metadata(
        m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
        m107d2 = ["<anonymous>", "", "it", "Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$CreateNotificationMetadata;", "invoke"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentTV$Companion$downloadSubtitle$2$1 */ /* loaded from: classes4.dex */
    class C49431 internal constructor() : Lambda<Any?>(1),
        Function1<CreateNotificationMetadata?, Unit> {
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        fun invoke2(it: CreateNotificationMetadata?) {
            Intrinsics.checkNotNullParameter(it, "it")
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */  override fun invoke(createNotificationMetadata: CreateNotificationMetadata?) {
            invoke2(createNotificationMetadata)
            return Unit.INSTANCE
        }

        companion object {
            val INSTANCE: C49431 = C49431()
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun invokeSuspend(obj: Object): Object {
        IntrinsicsKt.getCOROUTINE_SUSPENDED()
        if (label == 0) {
            ResultKt.throwOnFailure(obj)
            val videoDownloadManager: VideoDownloadManager = VideoDownloadManager.INSTANCE
            val context: Context? = `$context`
            if (context == null) {
                return Unit.INSTANCE
            }
            val extractorSubtitleLink: ExtractorSubtitleLink = `$link`
            videoDownloadManager.downloadThing(
                context,
                extractorSubtitleLink,
                `$fileName` + ' ' + `$link`.name,
                `$folder`,
                if (StringsKt.`contains$default`(
                        `$link`.url as CharSequence?,
                        ".srt" as CharSequence?,
                        false,
                        2,
                        null as Object?
                    )
                ) ".srt" else "vtt",
                false,
                null,
                C49431.INSTANCE
            )
            return Unit.INSTANCE
        }
        throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
    }
}