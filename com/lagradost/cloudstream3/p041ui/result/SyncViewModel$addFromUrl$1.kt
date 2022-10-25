package com.lagradost.cloudstream3.p041ui.result

import android.util.Log
import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: SyncViewModel.kt */
@Metadata(
    m108d1 = ["\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"],
    m107d2 = ["<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.ui.result.SyncViewModel\$addFromUrl$1",
    m98f = "SyncViewModel.kt",
    m97i = [],
    m96l = [104],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* renamed from: com.lagradost.cloudstream3.ui.result.SyncViewModel$addFromUrl$1 */ /* loaded from: classes4.dex */
class `SyncViewModel$addFromUrl$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(/* synthetic */
    val `$url`: String?, /* synthetic */
    val `this$0`: SyncViewModel, continuation: Continuation<in `SyncViewModel$addFromUrl$1`?>?
) : SuspendLambda(2, continuation), Function2<CoroutineScope, Continuation<in Unit>?, Object> {
    var label: Int = 0

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        return `SyncViewModel$addFromUrl$1`(`$url`, `this$0`, continuation)
    }

    @Override // kotlin.jvm.functions.Function2
    public override fun invoke(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in Unit>?
    ): Object {
        return (create(coroutineScope, continuation) as `SyncViewModel$addFromUrl$1`).invokeSuspend(
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
            Log.i(SyncViewModel.Companion.TAG, "addFromUrl = " + `$url`)
            if (`$url` == null || `this$0`.getHasAddedFromUrl().contains(`$url`)) {
                return Unit.INSTANCE
            }
            label = 1
            obj = SyncUtil.INSTANCE.getIdsFromUrl(`$url`, this)
            if (obj === coroutine_suspended) {
                return coroutine_suspended
            }
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            ResultKt.throwOnFailure(obj)
        }
        val tuples: Tuples<*, *>? = obj
        if (tuples != null) {
            val syncViewModel: SyncViewModel = `this$0`
            val str: String? = `$url`
            val str2: String? = tuples.component1() as String?
            val str3: String? = tuples.component2() as String?
            syncViewModel.getHasAddedFromUrl().add(str)
            syncViewModel.setMalId(str2)
            syncViewModel.setAniListId(str3)
            syncViewModel.updateSynced()
            if (str2 != null || str3 != null) {
                Log.i(
                    SyncViewModel.Companion.TAG,
                    "addFromUrl->updateMetaAndUser " + str2 + ' ' + str3
                )
                syncViewModel.updateMetaAndUser()
            }
        }
        return Unit.INSTANCE
    }
}