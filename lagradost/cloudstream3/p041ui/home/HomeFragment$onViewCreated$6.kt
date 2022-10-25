package com.lagradost.cloudstream3.p041ui.home

import android.view.View
import com.lagradost.cloudstream3.mvvm.Resource
import kotlin.jvm.internal.Intrinsics

/* compiled from: HomeFragment.kt */
@Metadata(
    m108d1 = ["\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n¢\u0006\u0002\b\u0005"],
    m107d2 = ["<anonymous>", "", "data", "Lcom/lagradost/cloudstream3/mvvm/Resource;", "Lcom/lagradost/cloudstream3/HomePageResponse;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.home.HomeFragment$onViewCreated$6 */ /* loaded from: classes3.dex */
internal class `HomeFragment$onViewCreated$6`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(  /* synthetic */
    val `this$0`: HomeFragment
) : Lambda<Any?>(1), Function1<Resource<out HomePageResponse?>?, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(resource: Resource<out HomePageResponse?>?) {
        invoke2(resource as Resource<HomePageResponse?>?)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(data: Resource<HomePageResponse?>?) {
        val onClickListener: OnClickListener?
        val z: Boolean
        var extendedFloatingActionButton: ExtendedFloatingActionButton
        val emptyList: ArrayList
        var items: List<HomePageList?>
        var homePageList: HomePageList?
        Intrinsics.checkNotNullParameter(data, "data")
        if (data is Resource.Success<*>) {
            val shimmerFrameLayout: ShimmerFrameLayout? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_loading_shimmer) as ShimmerFrameLayout?
            if (shimmerFrameLayout != null) {
                shimmerFrameLayout.stopShimmer()
            }
            val homePageResponse: HomePageResponse? = data.value as HomePageResponse?
            HomeFragment.Companion.Companion.getListHomepageItems().clear()
            `this$0`.currentHomePage = homePageResponse
            val recyclerView: RecyclerView? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_master_recycler) as RecyclerView?
            val adapter: RecyclerView.Adapter<*>? =
                if (recyclerView != null) recyclerView.getAdapter() else null
            val homeParentItemAdapter: HomeParentItemAdapter? =
                if (adapter is HomeParentItemAdapter) adapter else null
            if (homeParentItemAdapter != null) {
                if (homePageResponse == null || (homePageResponse.items.also({
                        items = it
                    })) == null) {
                    emptyList = CollectionsKt.emptyList<Any>()
                } else {
                    val arrayList: ArrayList = ArrayList()
                    for (homePageList2: HomePageList in items) {
                        try {
                            HomeFragment.Companion.Companion.getListHomepageItems().addAll(
                                SearchFragment.Companion.Companion.filterSearchResponse(
                                    homePageList2.getList()
                                )
                            )
                            homePageList = HomePageList(
                                homePageList2.name,
                                SearchFragment.Companion.Companion.filterSearchResponse(
                                    homePageList2.getList()
                                ),
                                homePageList2.urlMore,
                                homePageList2.nameApi,
                                homePageList2.getCardType()
                            )
                        } catch (e: Exception) {
                            ArchComponentExt.logError(e)
                            homePageList = null
                        }
                        if (homePageList != null) {
                            arrayList.add(homePageList)
                        }
                    }
                    emptyList = arrayList
                }
                homeParentItemAdapter.updateList(emptyList)
            }
            val frameLayout: FrameLayout? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_loading) as FrameLayout?
            if (frameLayout != null) {
                frameLayout.setVisibility(8)
            }
            val linearLayout: LinearLayout? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_loading_error) as LinearLayout?
            if (linearLayout != null) {
                linearLayout.setVisibility(8)
            }
            val nestedScrollView: NestedScrollView? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_loaded) as NestedScrollView?
            if (nestedScrollView != null) {
                nestedScrollView.setVisibility(0)
            }
            z = `this$0`.toggleRandomButton
            if (z && (`this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_random) as ExtendedFloatingActionButton?. also ({
                    extendedFloatingActionButton = it
                })) != null) {
                extendedFloatingActionButton.setVisibility(
                    if (HomeFragment.Companion.Companion.getListHomepageItems()
                            .isEmpty() xor true
                    ) 0 else 8
                )
            }
            `this$0`.setUpPageHomeScreen(homePageResponse)
        } else if (data is Resource.Failure) {
            val shimmerFrameLayout2: ShimmerFrameLayout? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_loading_shimmer) as ShimmerFrameLayout?
            if (shimmerFrameLayout2 != null) {
                shimmerFrameLayout2.stopShimmer()
            }
            (`this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_error_text) as TextView?).setText(
                data.errorString
            )
            onClickListener = `this$0`.apiChangeClickListener
            (`this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_reload_connectionerror) as MaterialButton?).setOnClickListener(
                onClickListener
            )
            val homeFragment: HomeFragment = `this$0`
            (`this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_reload_connection_open_in_browser) as MaterialButton?).setOnClickListener(
                object : OnClickListener() {
                    // from class: com.lagradost.cloudstream3.ui.home.-$$Lambda$HomeFragment$onViewCreated$6$G_efs_rqpSh20_d1NErKk_ciKbA
                    @Override // android.view.View.OnClickListener
                    fun onClick(view: View?) {
                        `m8656invoke$lambda2`(this@HomeFragment, view)
                    }
                })
            val frameLayout2: FrameLayout? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_loading) as FrameLayout?
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8)
            }
            val linearLayout2: LinearLayout? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_loading_error) as LinearLayout?
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0)
            }
            val nestedScrollView2: NestedScrollView? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_loaded) as NestedScrollView?
            if (nestedScrollView2 == null) {
                return
            }
            nestedScrollView2.setVisibility(8)
        } else if (data is Loading) {
            val recyclerView2: RecyclerView? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_master_recycler) as RecyclerView?
            val adapter2: RecyclerView.Adapter<*>? =
                if (recyclerView2 != null) recyclerView2.getAdapter() else null
            val homeParentItemAdapter2: HomeParentItemAdapter? =
                if (adapter2 is HomeParentItemAdapter) adapter2 else null
            if (homeParentItemAdapter2 != null) {
                homeParentItemAdapter2.updateList(CollectionsKt.emptyList<Any>())
            }
            val shimmerFrameLayout3: ShimmerFrameLayout? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_loading_shimmer) as ShimmerFrameLayout?
            if (shimmerFrameLayout3 != null) {
                shimmerFrameLayout3.startShimmer()
            }
            val frameLayout3: FrameLayout? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_loading) as FrameLayout?
            if (frameLayout3 != null) {
                frameLayout3.setVisibility(0)
            }
            val linearLayout3: LinearLayout? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_loading_error) as LinearLayout?
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(8)
            }
            val nestedScrollView3: NestedScrollView? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.home_loaded) as NestedScrollView?
            if (nestedScrollView3 == null) {
                return
            }
            nestedScrollView3.setVisibility(8)
        }
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: invoke$lambda-2  reason: not valid java name */
        fun `m8656invoke$lambda2`(`this$0`: HomeFragment, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val apis: List<MainAPI> = APIHolder.INSTANCE.apis
            val uIHelper: UIHelper = UIHelper.INSTANCE
            Intrinsics.checkNotNullExpressionValue(view, "view")
            val list: List<MainAPI> = apis
            val arrayList: ArrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10))
            var i: Int = 0
            for (obj: Object in list) {
                val i2: Int = i + 1
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow()
                }
                arrayList.add(Tuples<Any?, Any?>(Integer.valueOf(i), (obj as MainAPI).name))
                i = i2
            }
            uIHelper.popupMenuNoIconsAndNoStringRes(
                view,
                arrayList,
                `HomeFragment$onViewCreated$6$2$2`(apis, `this$0`)
            )
        }
    }
}