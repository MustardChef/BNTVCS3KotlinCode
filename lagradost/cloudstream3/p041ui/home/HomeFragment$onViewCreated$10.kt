package com.lagradost.cloudstream3.p041ui.home

import android.view.View
import kotlin.jvm.internal.Intrinsics

/* compiled from: HomeFragment.kt */
@Metadata(
    m108d1 = ["\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H\n¢\u0006\u0002\b\u0007"],
    m107d2 = ["<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "", "Lcom/lagradost/cloudstream3/SearchResponse;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.home.HomeFragment$onViewCreated$10 */ /* loaded from: classes3.dex */
internal class `HomeFragment$onViewCreated$10`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(  /* synthetic */
    val `this$0`: HomeFragment
) : Lambda<Any?>(1), Function1<Tuples<out Boolean?, out List<SearchResponse?>?>, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(tuples: Tuples<out Boolean?, out List<SearchResponse?>?>) {
        invoke2(tuples as Tuples<Boolean?, out List<SearchResponse?>?>)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(tuples: Tuples<Boolean?, out List<SearchResponse?>?>) {
        Intrinsics.checkNotNullParameter(tuples, "<name for destructuring parameter 0>")
        val booleanValue: Boolean = tuples.component1().booleanValue()
        val component2: List<SearchResponse?>? = tuples.component2()
        val home_bookmarked_holder: LinearLayout? =
            `this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_bookmarked_holder) as LinearLayout?
        Intrinsics.checkNotNullExpressionValue(home_bookmarked_holder, "home_bookmarked_holder")
        home_bookmarked_holder.setVisibility(if (booleanValue) 0 else 8)
        val recyclerView: RecyclerView? =
            `this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_bookmarked_child_recyclerview) as RecyclerView?
        val adapter: RecyclerView.Adapter<*>? =
            if (recyclerView != null) recyclerView.getAdapter() else null
        val homeChildItemAdapter: HomeChildItemAdapter? =
            if (adapter is HomeChildItemAdapter) adapter else null
        if (homeChildItemAdapter != null) {
            homeChildItemAdapter.updateList(component2)
        }
        val frameLayout: FrameLayout? =
            `this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_bookmarked_child_more_info) as FrameLayout?
        if (frameLayout != null) {
            val homeFragment: HomeFragment = `this$0`
            frameLayout.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.home.-$$Lambda$HomeFragment$onViewCreated$10$RSxYOcFQ0SS3OAFs_HdbpMDgrrE
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    `m8648invoke$lambda0`(this@HomeFragment, component2, view)
                }
            })
        }
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: invoke$lambda-0  reason: not valid java name */
        fun `m8648invoke$lambda0`(`this$0`: HomeFragment, bookmarks: List?, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(bookmarks, "\$bookmarks")
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                val string: String = `this$0`.getString(R.string.error_bookmarks_text)
                Intrinsics.checkNotNullExpressionValue(
                    string,
                    "getString(R.string.error_bookmarks_text)"
                )
                HomeFragment.Companion.Companion.loadHomepageList(
                    activity,
                    HomePageList(string, bookmarks, null, null, null, 28, null)
                )
            }
        }
    }
}