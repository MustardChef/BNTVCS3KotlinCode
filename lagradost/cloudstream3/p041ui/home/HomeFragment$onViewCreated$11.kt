package com.lagradost.cloudstream3.p041ui.home

import android.view.View
import kotlin.jvm.internal.Intrinsics

/* compiled from: HomeFragment.kt */
@Metadata(
    m108d1 = ["\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"],
    m107d2 = ["<anonymous>", "", "resumeWatching", "", "Lcom/lagradost/cloudstream3/SearchResponse;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.home.HomeFragment$onViewCreated$11 */ /* loaded from: classes3.dex */
internal class `HomeFragment$onViewCreated$11`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(  /* synthetic */
    val `this$0`: HomeFragment
) : Lambda<Any?>(1), Function1<List<SearchResponse?>, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(list: List<SearchResponse?>) {
        invoke2(list)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(resumeWatching: List<SearchResponse?>) {
        Intrinsics.checkNotNullParameter(resumeWatching, "resumeWatching")
        val linearLayout: LinearLayout? =
            `this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_watch_holder) as LinearLayout?
        if (linearLayout != null) {
            linearLayout.setVisibility(if (resumeWatching.isEmpty() xor true) 0 else 8)
        }
        val recyclerView: RecyclerView? =
            `this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_watch_child_recyclerview) as RecyclerView?
        val adapter: RecyclerView.Adapter<*>? =
            if (recyclerView != null) recyclerView.getAdapter() else null
        val homeChildItemAdapter: HomeChildItemAdapter? =
            if (adapter is HomeChildItemAdapter) adapter else null
        if (homeChildItemAdapter != null) {
            homeChildItemAdapter.updateList(resumeWatching)
        }
        val frameLayout: FrameLayout? =
            `this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_watch_child_more_info) as FrameLayout?
        if (frameLayout != null) {
            val homeFragment: HomeFragment = `this$0`
            frameLayout.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.home.-$$Lambda$HomeFragment$onViewCreated$11$LNjWQSZ8JGXNQxrO_NNxh_TbEQ0
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    `m8649invoke$lambda0`(this@HomeFragment, resumeWatching, view)
                }
            })
        }
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: invoke$lambda-0  reason: not valid java name */
        fun `m8649invoke$lambda0`(`this$0`: HomeFragment, resumeWatching: List?, view: View?) {
            val str: String
            var text: CharSequence
            var obj: String
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(resumeWatching, "\$resumeWatching")
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                val companion: HomeFragment.Companion = HomeFragment.Companion.Companion
                val fragmentActivity: FragmentActivity = activity
                val textView: TextView? =
                    `this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_watch_parent_item_title) as TextView?
                if ((textView == null) || ((textView.getText()
                        .also({ text = it })) == null) || ((text.toString()
                        .also({ obj = it })) == null)
                ) {
                    val string: String = `this$0`.getString(R.string.continue_watching)
                    Intrinsics.checkNotNullExpressionValue(
                        string,
                        "getString(R.string.continue_watching)"
                    )
                    str = string
                } else {
                    str = obj
                }
                companion.loadHomepageList(
                    fragmentActivity,
                    HomePageList(str, resumeWatching, null, null, null, 28, null)
                )
            }
        }
    }
}