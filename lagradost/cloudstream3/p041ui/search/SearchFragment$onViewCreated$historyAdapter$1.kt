package com.lagradost.cloudstream3.p041ui.search

import java.util.Collection
import kotlin.jvm.internal.Intrinsics

/* compiled from: SearchFragment.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
    m107d2 = ["<anonymous>", "", "click", "Lcom/lagradost/cloudstream3/ui/search/SearchHistoryCallback;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.search.SearchFragment$onViewCreated$historyAdapter$1 */ /* loaded from: classes4.dex */
internal class `SearchFragment$onViewCreated$historyAdapter$1` constructor(/* synthetic */val `this$0`: SearchFragment,
                                                                                          list: List<Tuples<out MaterialButton, out List<TvType>?>?>
) : Lambda<Any?>(1), Function1<SearchHistoryCallback, Unit> {
    /* synthetic */ val `$pairList`: List<Tuples<MaterialButton, List<TvType>?>?>

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$pairList` = list
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(searchHistoryCallback: SearchHistoryCallback) {
        invoke2(searchHistoryCallback)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(click: SearchHistoryCallback) {
        val searchViewModel: SearchViewModel?
        val searchViewModel2: SearchViewModel?
        Intrinsics.checkNotNullParameter(click, "click")
        val item: SearchHistoryItem? = click.getItem()
        val clickAction: Int = click.getClickAction()
        if (clickAction != 0) {
            if (clickAction != 1) {
                return
            }
            AcraApplication.Companion.removeKey(SearchViewModelKt.SEARCH_HISTORY_KEY, item.getKey())
            searchViewModel2 = `this$0`.getSearchViewModel()
            searchViewModel2!!.updateHistory()
            return
        }
        searchViewModel = `this$0`.getSearchViewModel()
        searchViewModel!!.clearSearch()
        if (!item!!.getType().isEmpty()) {
            SearchFragment.Companion.`onViewCreated$updateSelectedList`(
                `this$0`, `$pairList`, CollectionsKt.toMutableList(
                    item.getType() as Collection?
                )
            )
        }
        val searchView: SearchView? =
            `this$0`.`_$_findCachedViewById`(C4761R.C4764id.main_search) as SearchView?
        if (searchView != null) {
            searchView.setQuery(item.getSearchText(), true)
        }
    }
}