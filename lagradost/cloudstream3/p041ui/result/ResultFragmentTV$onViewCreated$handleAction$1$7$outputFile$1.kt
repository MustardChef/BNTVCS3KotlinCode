package com.lagradost.cloudstream3.p041ui.result

import java.io.File
import kotlin.coroutines.Continuation

/* compiled from: ResultFragmentTV.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "Ljava/io/File;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.ui.result.ResultFragmentTV\$onViewCreated\$handleAction$1$7\$outputFile$1",
    m98f = "ResultFragmentTV.kt",
    m97i = [],
    m96l = [],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
)
/* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentTV$onViewCreated$handleAction$1$7$outputFile$1 */ /* loaded from: classes4.dex */
internal class `ResultFragmentTV$onViewCreated$handleAction$1$7$outputFile$1` constructor(
    file: File,
    continuation: Continuation<in `ResultFragmentTV$onViewCreated$handleAction$1$7$outputFile$1`?>?
) : SuspendLambda(2, continuation), Function2<CoroutineScope, Continuation<in File?>?, Object> {
    /* synthetic */ val `$outputDir`: File
    var label: Int = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$outputDir` = file
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        return `ResultFragmentTV$onViewCreated$handleAction$1$7$outputFile$1`(
            `$outputDir`,
            continuation
        )
    }

    @Override // kotlin.jvm.functions.Function2
    public override fun invoke(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in File?>?
    ): Object {
        return (create(
            coroutineScope,
            continuation
        ) as `ResultFragmentTV$onViewCreated$handleAction$1$7$outputFile$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun invokeSuspend(obj: Object): Object {
        IntrinsicsKt.getCOROUTINE_SUSPENDED()
        if (label == 0) {
            ResultKt.throwOnFailure(obj)
            return File.createTempFile("mirrorlist", ".m3u8", `$outputDir`)
        }
        throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
    }
}