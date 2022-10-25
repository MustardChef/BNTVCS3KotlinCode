package com.lagradost.cloudstream3.p041ui.download

import java.util.List
import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: DownloadFragment.kt */
@Metadata(
    m108d1 = ["\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"],
    m107d2 = ["<anonymous>", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.ui.download.DownloadFragment\$setList$1",
    m98f = "DownloadFragment.kt",
    m97i = [],
    m96l = [],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* renamed from: com.lagradost.cloudstream3.ui.download.DownloadFragment$setList$1 */ /* loaded from: classes3.dex */
class `DownloadFragment$setList$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(/* synthetic */
    val `this$0`: DownloadFragment, /* synthetic */
    val `$list`: List<VisualDownloadHeaderCached>,
    continuation: Continuation<in `DownloadFragment$setList$1`?>?
) : SuspendLambda(1, continuation), Function1<Continuation<in Unit>?, Object> {
    var label: Int = 0

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun create(continuation: Continuation<*>?): Continuation<Unit> {
        return `DownloadFragment$setList$1`(`this$0`, `$list`, continuation)
    }

    @Override // kotlin.jvm.functions.Function1
    public override fun invoke(continuation: Continuation<in Unit>?): Object {
        return (create(continuation) as `DownloadFragment$setList$1`).invokeSuspend(Unit.INSTANCE)
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun invokeSuspend(obj: Object): Object {
        var adapter: RecyclerView.Adapter<*>
        IntrinsicsKt.getCOROUTINE_SUSPENDED()
        if (label == 0) {
            ResultKt.throwOnFailure(obj)
            val recyclerView: RecyclerView? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.download_list) as RecyclerView?
            val downloadHeaderAdapter: DownloadHeaderAdapter? =
                (if (recyclerView != null) recyclerView.getAdapter() else null)
            if (downloadHeaderAdapter != null) {
                downloadHeaderAdapter.setCardList(`$list`)
            }
            val recyclerView2: RecyclerView? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.download_list) as RecyclerView?
            if (recyclerView2 != null && (recyclerView2.getAdapter()
                    .also({ adapter = it })) != null
            ) {
                adapter.notifyDataSetChanged()
            }
            return Unit.INSTANCE
        }
        throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
    }
}