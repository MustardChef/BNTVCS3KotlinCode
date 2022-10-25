package com.lagradost.cloudstream3.p041ui.download

import android.content.Context
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: DownloadChildFragment.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.ui.download.DownloadChildFragment\$updateList$1$1\$data$1",
    m98f = "DownloadChildFragment.kt",
    m97i = [],
    m96l = [],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
)
/* renamed from: com.lagradost.cloudstream3.ui.download.DownloadChildFragment$updateList$1$1$data$1 */ /* loaded from: classes3.dex */
internal class `DownloadChildFragment$updateList$1$1$data$1` constructor(
    context: Context,
    str: String,
    continuation: Continuation<in `DownloadChildFragment$updateList$1$1$data$1`?>?
) : SuspendLambda(2, continuation),
    Function2<CoroutineScope, Continuation<in List<String?>?>?, Object> {
    /* synthetic */ val `$ctx`: Context
    /* synthetic */ val `$folder`: String
    var label: Int = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$ctx` = context
        `$folder` = str
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        return `DownloadChildFragment$updateList$1$1$data$1`(`$ctx`, `$folder`, continuation)
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */  override fun invoke(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in List<String?>?>?
    ): Object {
        return invoke2(coroutineScope, continuation)
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in List<String?>?>?
    ): Object {
        return (create(
            coroutineScope,
            continuation
        ) as `DownloadChildFragment$updateList$1$1$data$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun invokeSuspend(obj: Object): Object {
        IntrinsicsKt.getCOROUTINE_SUSPENDED()
        if (label == 0) {
            ResultKt.throwOnFailure(obj)
            val dataStore: DataStore = DataStore.INSTANCE
            val ctx: Context = `$ctx`
            Intrinsics.checkNotNullExpressionValue(ctx, "ctx")
            return dataStore.getKeys(ctx, `$folder`)
        }
        throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
    }
}