package com.lagradost.cloudstream3.p041ui.download

import android.content.Context
import kotlin.jvm.internal.Intrinsics

/* compiled from: DownloadFragment.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
    m107d2 = ["<anonymous>", "", "id", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.download.DownloadFragment$onViewCreated$1 */ /* loaded from: classes3.dex */
internal class `DownloadFragment$onViewCreated$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(  /* synthetic */
    val `this$0`: DownloadFragment
) : Lambda<Any?>(1), Function1<Integer, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(num: Integer) {
        invoke(num.intValue())
        return Unit.INSTANCE
    }

    override fun invoke(i: Int) {
        var z: Boolean
        var context: Context?
        val downloadViewModel: DownloadViewModel?
        val recyclerView: RecyclerView? =
            `this$0`.`_$_findCachedViewById`(C4761R.C4764id.download_list) as RecyclerView?
        var downloadViewModel2: DownloadViewModel? = null
        val downloadHeaderAdapter: DownloadHeaderAdapter? =
            (if (recyclerView != null) recyclerView.getAdapter() else null)
        val cardList: List<VisualDownloadHeaderCached>? =
            if (downloadHeaderAdapter != null) downloadHeaderAdapter.getCardList() else null
        if (cardList != null) {
            val list: List<VisualDownloadHeaderCached> = cardList
            var z2: Boolean = true
            if (!(list is Collection) || !list.isEmpty()) {
                for (visualDownloadHeaderCached: VisualDownloadHeaderCached in list) {
                    if (visualDownloadHeaderCached.getData().id == i) {
                        z = true
                        continue
                    } else {
                        z = false
                        continue
                    }
                    if (z) {
                        break
                    }
                }
            }
            z2 = false
            if (!z2 || (`this$0`.getContext().also({ context = it })) == null) {
                return
            }
            val downloadFragment: DownloadFragment = `this$0`
            downloadFragment.setList(ArrayList())
            downloadViewModel = downloadFragment.downloadsViewModel
            if (downloadViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("downloadsViewModel")
            } else {
                downloadViewModel2 = downloadViewModel
            }
            downloadViewModel2!!.updateList(context)
        }
    }
}