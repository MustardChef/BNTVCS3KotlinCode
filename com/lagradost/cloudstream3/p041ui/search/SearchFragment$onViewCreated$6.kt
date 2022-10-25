package com.lagradost.cloudstream3.p041ui.search

import java.util.List
import kotlin.jvm.internal.Intrinsics

/* compiled from: SearchFragment.kt */
@Metadata(
    m108d1 = ["\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"],
    m107d2 = ["<anonymous>", "", "list", "", "Lcom/lagradost/cloudstream3/ui/search/SearchHistoryItem;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.search.SearchFragment$onViewCreated$6 */ /* loaded from: classes4.dex */
internal class `SearchFragment$onViewCreated$6`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(  /* synthetic */
    val `this$0`: SearchFragment
) : Lambda<Any?>(1), Function1<List<SearchHistoryItem>, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(list: List<SearchHistoryItem>) {
        invoke2(list)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(list: List<SearchHistoryItem>) {
        Intrinsics.checkNotNullParameter(list, "list")
        val adapter: RecyclerView.Adapter<*> =
            (`this$0`.`_$_findCachedViewById`(C4761R.C4764id.search_history_recycler) as RecyclerView?).getAdapter()
        val searchHistoryAdaptor: SearchHistoryAdaptor? =
            if (adapter is SearchHistoryAdaptor) adapter else null
        if (searchHistoryAdaptor != null) {
            searchHistoryAdaptor.updateList(list)
        }
    }
}