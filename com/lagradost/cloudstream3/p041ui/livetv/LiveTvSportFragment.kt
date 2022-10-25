package com.lagradost.cloudstream3.p041ui.livetv

import android.app.Activity
import androidx.fragment.app.Fragment
import com.lagradost.cloudstream3.mvvm.Resource
import com.phimhd.Key
import kotlin.jvm.internal.Intrinsics

/* compiled from: LiveTvSportFragment.kt */
@Metadata(
    m108d1 = ["\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J&\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000c\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0016"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/livetv/LiveTvSportFragment;", "Landroidx/fragment/app/Fragment;", "()V", "liveTvViewModel", "Lcom/lagradost/cloudstream3/ui/livetv/LiveTvViewModel;", "fixGrid", "", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "Companion", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.livetv.LiveTvSportFragment */ /* loaded from: classes3.dex */
class LiveTvSportFragment constructor() : Fragment() {
    var `_$_findViewCache`: Map<Integer, View> = LinkedHashMap()
    private var liveTvViewModel: LiveTvViewModel? = null
    fun `_$_clearFindViewByIdCache`() {
        `_$_findViewCache`.clear()
    }

    fun `_$_findCachedViewById`(i: Int): View? {
        var findViewById: View?
        val map: Map<Integer, View> = `_$_findViewCache`
        val view: View? = map.get(Integer.valueOf(i))
        if (view == null) {
            val view2: View? = getView()
            if (view2 == null || (view2.findViewById(i).also({ findViewById = it })) == null) {
                return null
            }
            map.put(Integer.valueOf(i), findViewById)
            return findViewById
        }
        return view
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */  override fun onDestroyView() {
        super.onDestroyView()
        `_$_clearFindViewByIdCache`()
    }

    /* compiled from: LiveTvSportFragment.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\b\u0010\u000c\u001a\u0004\u0018\u00010\rR(\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000e"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/livetv/LiveTvSportFragment\$Companion;", "", "()V", "clickCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/ui/search/SearchClickCallback;", "", "getClickCallback", "()Lkotlin/jvm/functions/Function1;", "setClickCallback", "(Lkotlin/jvm/functions/Function1;)V", "pushSearch", "activity", "Landroid/app/Activity;", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.livetv.LiveTvSportFragment$Companion */ /* loaded from: classes3.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        fun pushSearch(activity: Activity?) {
            val uIHelper: UIHelper = UIHelper.INSTANCE
            val bundle: Bundle = Bundle()
            val unit: Unit = Unit.INSTANCE
            uIHelper.navigate(activity, R.id.global_to_navigation_livetv, bundle)
        }

        var clickCallback: (Any) -> Unit
            get() {
                return LiveTvSportFragment.Companion.clickCallback
            }
            set(function1) {
                LiveTvSportFragment.Companion.clickCallback = function1
            }
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onCreateView(
        inflater: LayoutInflater,
        viewGroup: ViewGroup,
        bundle: Bundle
    ): View {
        var window: Window
        Intrinsics.checkNotNullParameter(inflater, "inflater")
        val activity: FragmentActivity? = getActivity()
        if (activity != null && (activity.getWindow().also({ window = it })) != null) {
            window.setSoftInputMode(4)
        }
        liveTvViewModel = ViewModelProvider(this).get(LiveTvViewModel::class.java)
        return inflater.inflate(R.layout.fragment_tv, viewGroup, false)
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onDestroy() {
        super.onDestroy()
        LiveTvSportFragment.Companion.clickCallback = null
    }

    private fun fixGrid() {
        var spanCount: Integer
        val activity: FragmentActivity? = getActivity()
        if (activity != null && (UIHelper.INSTANCE.getSpanCount(activity)
                .also({ spanCount = it })) != null
        ) {
            HomeFragment.Companion.Companion.setCurrentSpan(spanCount.intValue())
        }
        (`_$_findCachedViewById`(C4761R.C4764id.livetv_autofit_results) as AutofitRecyclerView?).setSpanCount(
            HomeFragment.Companion.Companion.getCurrentSpan()
        )
        HomeFragment.Companion.Companion.setCurrentSpan(HomeFragment.Companion.Companion.getCurrentSpan())
        HomeFragment.Companion.Companion.getConfigEvent()
            .invoke(Integer.valueOf(HomeFragment.Companion.Companion.getCurrentSpan()))
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public override fun onConfigurationChanged(newConfig: Configuration) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig")
        super.onConfigurationChanged(newConfig)
        fixGrid()
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onViewCreated(view: View, bundle: Bundle) {
        val searchAdaptor: SearchAdaptor?
        var maxAdView: MaxAdView
        Intrinsics.checkNotNullParameter(view, "view")
        super.onViewCreated(view, bundle)
        val context: Context? = getContext()
        if (context != null) {
            UIHelper.INSTANCE.fixPaddingStatusbar(
                context,
                `_$_findCachedViewById`(C4761R.C4764id.livetv_root) as LinearLayout?
            )
        }
        fixGrid()
        val companion: AppController? = AppController.Companion.getInstance()
        var liveTvViewModel: LiveTvViewModel? = null
        if ((if (companion != null) companion.getKey() else null) != null) {
            val companion2: AppController? = AppController.Companion.getInstance()
            val key: Key? = if (companion2 != null) companion2.getKey() else null
            Intrinsics.checkNotNull(key)
            if (!key!!.isExpired() && (`_$_findCachedViewById`(C4761R.C4764id.adView) as MaxAdView?. also ({
                    maxAdView = it
                })) != null) {
                maxAdView.setVisibility(8)
            }
        }
        val autofitRecyclerView: AutofitRecyclerView? =
            `_$_findCachedViewById`(C4761R.C4764id.livetv_autofit_results) as AutofitRecyclerView?
        if (getActivity() != null) {
            val arrayList: ArrayList = ArrayList()
            val livetv_autofit_results: AutofitRecyclerView? =
                `_$_findCachedViewById`(C4761R.C4764id.livetv_autofit_results) as AutofitRecyclerView?
            Intrinsics.checkNotNullExpressionValue(livetv_autofit_results, "livetv_autofit_results")
            searchAdaptor = SearchAdaptor(
                arrayList,
                livetv_autofit_results,
                null,
                `LiveTvSportFragment$onViewCreated$1$1`(this),
                4,
                null
            )
        } else {
            searchAdaptor = null
        }
        autofitRecyclerView.setAdapter(searchAdaptor)
        val liveTvSportFragment: LiveTvSportFragment = this
        var liveTvViewModel2: LiveTvViewModel? = this.liveTvViewModel
        if (liveTvViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveTvViewModel")
            liveTvViewModel2 = null
        }
        ArchComponentExt.observe<Resource<List<SearchResponse>>>(
            liveTvSportFragment,
            liveTvViewModel2.getSearchResponse(),
            `LiveTvSportFragment$onViewCreated$2`(this)
        )
        (`_$_findCachedViewById`(C4761R.C4764id.livetv_back) as ImageView?).setOnClickListener(
            object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.livetv.-$$Lambda$LiveTvSportFragment$j9JhlMXvxAbdh-fSg-WLsK3AvXI
                @Override // android.view.View.OnClickListener
                fun onClick(view2: View?) {
                    LiveTvSportFragment.Companion.`m8662onViewCreated$lambda2`(
                        this@LiveTvSportFragment,
                        view2
                    )
                }
            })
        val liveTvViewModel3: LiveTvViewModel? = this.liveTvViewModel
        if (liveTvViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveTvViewModel")
        } else {
            liveTvViewModel = liveTvViewModel3
        }
        liveTvViewModel!!.search()
    }

    companion object {
        @kotlin.jvm.JvmField
        val Companion: Companion = Companion(null)
        private val clickCallback: Function1<SearchClickCallback, Unit>? = null

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-2  reason: not valid java name */
        fun `m8662onViewCreated$lambda2`(`this$0`: LiveTvSportFragment, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                UIHelper.INSTANCE.popCurrentPage(activity)
            }
        }
    }
}