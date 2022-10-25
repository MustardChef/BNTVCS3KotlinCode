package com.lagradost.cloudstream3.utils

import android.content.Context
import androidx.tvprovider.media.p009tv.PreviewChannelHelper
import androidx.tvprovider.media.p009tv.WatchNextProgram
import kotlin.coroutines.Continuation

/* compiled from: AppUtils.kt */
@Metadata(
    m108d1 = ["\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"],
    m107d2 = ["<anonymous>", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.utils.AppUtils\$addProgramsToContinueWatching$1",
    m98f = "AppUtils.kt",
    m97i = [],
    m96l = [],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
)
/* loaded from: classes4.dex */
internal class `AppUtils$addProgramsToContinueWatching$1`(
    list: List<ResumeWatchingResult?>,
    context: Context,
    continuation: Continuation<in `AppUtils$addProgramsToContinueWatching$1`?>?
) : SuspendLambda(1, continuation), Function1<Continuation<in Unit>?, Object> {
    /* synthetic */ val `$data`: List<ResumeWatchingResult?>
    /* synthetic */ val `$this_addProgramsToContinueWatching`: Context
    var label = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$data` = list
        `$this_addProgramsToContinueWatching` = context
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(continuation: Continuation<*>?): Continuation<Unit> {
        return `AppUtils$addProgramsToContinueWatching$1`(
            `$data`,
            `$this_addProgramsToContinueWatching`,
            continuation
        )
    }

    @Override // kotlin.jvm.functions.Function1
    override fun invoke(continuation: Continuation<in Unit>?): Object {
        return (create(continuation) as `AppUtils$addProgramsToContinueWatching$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        var watchNextProgramByVideoId: Tuples<*, *>
        var buildWatchNextProgramUri: WatchNextProgram
        IntrinsicsKt.getCOROUTINE_SUSPENDED()
        if (label == 0) {
            ResultKt.throwOnFailure(obj)
            val context: Context = `$this_addProgramsToContinueWatching`
            for (resumeWatchingResult in `$data`) {
                try {
                    watchNextProgramByVideoId =
                        AppUtils.Companion.INSTANCE.getWatchNextProgramByVideoId(
                            resumeWatchingResult.getUrl(),
                            context
                        )
                    val watchNextProgram =
                        watchNextProgramByVideoId.component1() as WatchNextProgram
                    val l = watchNextProgramByVideoId.component2() as Long
                    buildWatchNextProgramUri = AppUtils.Companion.INSTANCE.buildWatchNextProgramUri(
                        context,
                        resumeWatchingResult
                    )
                    if (watchNextProgram != null && l != null) {
                        PreviewChannelHelper(context).updateWatchNextProgram(
                            buildWatchNextProgramUri,
                            l.longValue()
                        )
                    } else {
                        PreviewChannelHelper(context).publishWatchNextProgram(
                            buildWatchNextProgramUri
                        )
                    }
                } catch (e: Exception) {
                    ArchComponentExt.logError(e)
                }
            }
            return Unit.INSTANCE
        }
        throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
    }
}