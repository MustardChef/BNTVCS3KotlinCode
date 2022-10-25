package com.lagradost.cloudstream3.p041ui.search

import com.lagradost.cloudstream3.mvvm.Resource
import java.util.ArrayList
import kotlin.jvm.internal.Intrinsics

/* compiled from: SearchFragment.kt */
@Metadata(
    m108d1 = ["\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"],
    m107d2 = ["<anonymous>", "", "list", "", "Lcom/lagradost/cloudstream3/ui/search/OnGoingSearch;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.search.SearchFragment$onViewCreated$8 */ /* loaded from: classes4.dex */
internal class `SearchFragment$onViewCreated$8` constructor(
    reentrantLock: ReentrantLock,
    searchFragment: SearchFragment
) : Lambda<Any?>(1), Function1<List<OnGoingSearch>, Unit> {
    /* synthetic */ val `$listLock`: ReentrantLock
    /* synthetic */ val `this$0`: SearchFragment

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$listLock` = reentrantLock
        `this$0` = searchFragment
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(list: List<OnGoingSearch>) {
        invoke2(list)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(list: List<OnGoingSearch>) {
        Intrinsics.checkNotNullParameter(list, "list")
        try {
            try {
                `$listLock`.lock()
                val recyclerView: RecyclerView? =
                    `this$0`.`_$_findCachedViewById`(C4761R.C4764id.search_master_recycler) as RecyclerView?
                val homeParentItemAdapter: HomeParentItemAdapter? =
                    (if (recyclerView != null) recyclerView.getAdapter() else null) as HomeParentItemAdapter?
                if (homeParentItemAdapter != null) {
                    val list2: List<OnGoingSearch> = list
                    val arrayList: ArrayList =
                        ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10))
                    for (onGoingSearch: OnGoingSearch in list2) {
                        arrayList.add(
                            HomePageList(
                                onGoingSearch.getApiName(),
                                if (onGoingSearch.getData() is Resource.Success<*>) SearchFragment.Companion.Companion.filterSearchResponse(
                                    (onGoingSearch.getData() as Resource.Success<*>?)!!.value as List?
                                ) else ArrayList(),
                                null,
                                null,
                                null,
                                28,
                                null
                            )
                        )
                    }
                    homeParentItemAdapter.updateList(arrayList)
                }
            } catch (e: Exception) {
                ArchComponentExt.logError(e)
            }
        } finally {
            `$listLock`.unlock()
        }
    }
}