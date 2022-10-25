package com.lagradost.cloudstream3.p041ui.result

import java.util.HashMap
import kotlin.coroutines.Continuation

/* compiled from: ResultViewModel.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u008a@"],
    m107d2 = ["<anonymous>", "Ljava/util/HashMap;", "", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.ui.result.ResultViewModel\$load$1\$fillerEpisodes$1",
    m98f = "ResultViewModel.kt",
    m97i = [],
    m96l = [401],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
)
/* renamed from: com.lagradost.cloudstream3.ui.result.ResultViewModel$load$1$fillerEpisodes$1 */ /* loaded from: classes4.dex */
internal class `ResultViewModel$load$1$fillerEpisodes$1` constructor(
    loadResponse: LoadResponse,
    continuation: Continuation<in `ResultViewModel$load$1$fillerEpisodes$1`?>?
) : SuspendLambda(1, continuation),
    Function1<Continuation<in HashMap<Integer?, Boolean?>?>?, Object> {
    /* synthetic */ val `$loadResponse`: LoadResponse
    var label: Int = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$loadResponse` = loadResponse
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun create(continuation: Continuation<*>?): Continuation<Unit> {
        return `ResultViewModel$load$1$fillerEpisodes$1`(`$loadResponse`, continuation)
    }

    @Override // kotlin.jvm.functions.Function1
    public override fun invoke(continuation: Continuation<in HashMap<Integer?, Boolean?>?>?): Object {
        return (create(continuation) as `ResultViewModel$load$1$fillerEpisodes$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun invokeSuspend(obj: Object): Object {
        var obj: Object = obj
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i: Int = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            label = 1
            obj = FillerEpisodeCheck.INSTANCE.getFillerEpisodes(`$loadResponse`.name, this)
            if (obj === coroutine_suspended) {
                return coroutine_suspended
            }
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            ResultKt.throwOnFailure(obj)
        }
        return obj
    }
}