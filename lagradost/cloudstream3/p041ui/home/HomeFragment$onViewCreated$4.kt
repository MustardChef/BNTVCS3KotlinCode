package com.lagradost.cloudstream3.p041ui.home

import android.content.Context
import kotlin.jvm.internal.Intrinsics

/* compiled from: HomeFragment.kt */
@Metadata(
    m108d1 = ["\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"],
    m107d2 = ["<anonymous>", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/lagradost/cloudstream3/SearchResponse;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.home.HomeFragment$onViewCreated$4 */ /* loaded from: classes3.dex */
internal class `HomeFragment$onViewCreated$4`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(  /* synthetic */
    val `this$0`: HomeFragment
) : Lambda<Any?>(1), Function1<List<SearchResponse?>, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(list: List<SearchResponse?>) {
        invoke2(list)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(list: List<SearchResponse?>) {
        val list2: List<SearchResponse?>? = list
        var z: Boolean = false
        if (list2 == null || list2.isEmpty()) {
            HomeFragment.Companion.`toggleMainVisibility$default`(`this$0`, false, null, 2, null)
            return
        }
        val homeChildItemAdapter: HomeChildItemAdapter? =
            (`this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_main_poster_recyclerview) as RecyclerView?).getAdapter()
        if (homeChildItemAdapter != null && Intrinsics.areEqual(
                homeChildItemAdapter.getCardList(),
                list
            )
        ) {
            val homeFragment: HomeFragment = `this$0`
            val context: Context? = homeFragment.getContext()
            homeFragment.toggleMainVisibility(
                true,
                if (context != null) Boolean.valueOf(
                    SettingsFragment.Companion.Companion.isTvSettings(context)
                ) else null
            )
            return
        }
        `this$0`.setUpActionHeaderMovieHomeScreen(list.get(0))
        val size: Int = list.size()
        val recyclerView: RecyclerView? =
            `this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_main_poster_recyclerview) as RecyclerView?
        if (recyclerView != null) {
            recyclerView.setAdapter(
                HomeChildItemAdapter(
                    CollectionsKt.toMutableList(list2 as Collection?),
                    Integer.valueOf(R.layout.home_result_big_grid as Int),
                    Integer.valueOf((`this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_main_poster_recyclerview) as RecyclerView?).getNextFocusUpId()),
                    Integer.valueOf((`this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_main_poster_recyclerview) as RecyclerView?).getNextFocusDownId()),
                    C48611(
                        `this$0`
                    )
                )
            )
        }
        val context2: Context? = `this$0`.getContext()
        if (context2 != null && !SettingsFragment.Companion.Companion.isTvSettings(context2)) {
            z = true
        }
        if (z) {
            val recyclerView2: RecyclerView? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_main_poster_recyclerview) as RecyclerView?
            if (recyclerView2 != null) {
                val homeFragment2: HomeFragment = `this$0`
                recyclerView2.post(object : Runnable() {
                    // from class: com.lagradost.cloudstream3.ui.home.-$$Lambda$HomeFragment$onViewCreated$4$rcSX0LDbD0hDUx2-UYgGqnp45To
                    @Override // java.lang.Runnable
                    fun run() {
                        `m8653invoke$lambda1`(this@HomeFragment, size)
                    }
                })
            }
        } else {
            val searchResponse: SearchResponse? =
                CollectionsKt.firstOrNull<Any>(list as List<Object?>?) as SearchResponse?
            if (searchResponse != null) {
                `this$0`.focusCallback(searchResponse)
            }
        }
        val homeFragment3: HomeFragment = `this$0`
        val context3: Context? = homeFragment3.getContext()
        homeFragment3.toggleMainVisibility(
            true,
            if (context3 != null) Boolean.valueOf(
                SettingsFragment.Companion.Companion.isTvSettings(context3)
            ) else null
        )
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: HomeFragment.kt */
    @Metadata(
        m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
        m107d2 = ["<anonymous>", "", "callback", "Lcom/lagradost/cloudstream3/ui/search/SearchClickCallback;", "invoke"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.home.HomeFragment$onViewCreated$4$1 */ /* loaded from: classes3.dex */
    class C48611  /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ internal constructor(  /* synthetic */
        val `this$0`: HomeFragment
    ) : Lambda<Any?>(1), Function1<SearchClickCallback, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */  override fun invoke(searchClickCallback: SearchClickCallback) {
            invoke2(searchClickCallback)
            return Unit.INSTANCE
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        fun invoke2(callback: SearchClickCallback) {
            Intrinsics.checkNotNullParameter(callback, "callback")
            `this$0`.homeHandleSearch(callback)
        }
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: invoke$lambda-1  reason: not valid java name */
        fun `m8653invoke$lambda1`(`this$0`: HomeFragment, i: Int) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val recyclerView: RecyclerView? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_main_poster_recyclerview) as RecyclerView?
            val centerZoomLayoutManager: CenterZoomLayoutManager? =
                (if (recyclerView != null) recyclerView.getLayoutManager() else null) as CenterZoomLayoutManager?
            if (centerZoomLayoutManager != null) {
                centerZoomLayoutManager.updateSize(true)
                if (i > 2) {
                    centerZoomLayoutManager.scrollToPosition(i / 2)
                    CenterZoomLayoutManager.`snap$default`(
                        centerZoomLayoutManager,
                        null,
                        `HomeFragment$onViewCreated$4$2$1$1`(`this$0`),
                        1,
                        null
                    )
                }
            }
        }
    }
}