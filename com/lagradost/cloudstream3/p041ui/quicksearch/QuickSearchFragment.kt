package com.lagradost.cloudstream3.p041ui.quicksearch

import android.app.Activity
import androidx.fragment.app.Fragment
import kotlin.jvm.internal.Intrinsics

/* compiled from: QuickSearchFragment.kt */
@Metadata(
    m108d1 = ["\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016J\u001a\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J \u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0019R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001f"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/quicksearch/QuickSearchFragment;", "Landroidx/fragment/app/Fragment;", "()V", QuickSearchFragment.Companion.PROVIDER_KEY, "", "", "searchViewModel", "Lcom/lagradost/cloudstream3/ui/search/SearchViewModel;", "fixGrid", "", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "search", "", "context", "Landroid/content/Context;", "query", "isQuickSearch", "Companion", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.quicksearch.QuickSearchFragment */ /* loaded from: classes3.dex */
class QuickSearchFragment constructor() : Fragment() {
    var `_$_findViewCache`: Map<Integer, View> = LinkedHashMap()
    private val providers: Set<String>? = null
    private var searchViewModel: SearchViewModel? = null
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

    /* compiled from: QuickSearchFragment.kt */
    @Metadata(
        m108d1 = ["\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J3\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\u000c\u0010\r¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/quicksearch/QuickSearchFragment\$Companion;", "", "()V", "AUTOSEARCH_KEY", "", "PROVIDER_KEY", "clickCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/ui/search/SearchClickCallback;", "", "getClickCallback", "()Lkotlin/jvm/functions/Function1;", "setClickCallback", "(Lkotlin/jvm/functions/Function1;)V", "pushSearch", "activity", "Landroid/app/Activity;", "autoSearch", Companion.PROVIDER_KEY, "", "(Landroid/app/Activity;Ljava/lang/String;[Ljava/lang/String;)V", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.quicksearch.QuickSearchFragment$Companion */ /* loaded from: classes3.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        fun pushSearch(activity: Activity?, str: String?, strArr: Array<String?>?) {
            val uIHelper: UIHelper = UIHelper.INSTANCE
            val bundle: Bundle = Bundle()
            if (strArr != null) {
                bundle.putStringArray(QuickSearchFragment.Companion.PROVIDER_KEY, strArr)
            }
            if (str != null) {
                bundle.putString(
                    QuickSearchFragment.Companion.AUTOSEARCH_KEY,
                    StringsKt.trim(
                        StringsKt.removeSuffix(
                            StringsKt.removeSuffix(
                                StringsKt.removeSuffix(
                                    StringsKt.removeSuffix(
                                        StringsKt.trim(str as CharSequence?).toString(),
                                        "(DUB)" as CharSequence?
                                    ),
                                    "(SUB)" as CharSequence?
                                ), "(Dub)" as CharSequence?
                            ), "(Sub)" as CharSequence?
                        ) as CharSequence?
                    ).toString()
                )
            }
            val unit: Unit = Unit.INSTANCE
            uIHelper.navigate(activity, R.id.global_to_navigation_quick_search, bundle)
        }

        var clickCallback: (Any) -> Unit
            get() {
                return QuickSearchFragment.Companion.clickCallback
            }
            set(function1) {
                QuickSearchFragment.Companion.clickCallback = function1
            }

        companion object {
            fun  /* synthetic */`pushSearch$default`(
                companion: QuickSearchFragment.Companion,
                activity: Activity?,
                str: String?,
                strArr: Array<String?>?,
                i: Int,
                obj: Object?
            ) {
                var str: String? = str
                var strArr: Array<String?>? = strArr
                if ((i and 2) != 0) {
                    str = null
                }
                if ((i and 4) != 0) {
                    strArr = null
                }
                companion.pushSearch(activity, str, strArr)
            }
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
        searchViewModel =
            ViewModelProvider(this).get(SearchViewModel::class.java) as SearchViewModel?
        return inflater.inflate(R.layout.quick_search, viewGroup, false)
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onDestroy() {
        super.onDestroy()
        Companion.clickCallback = null
    }

    fun search(context: Context?, query: String?, z: Boolean): Boolean {
        var filterProviderByPreferredMedia: List<MainAPI>
        Intrinsics.checkNotNullParameter(query, "query")
        var set: Set<String?>? = providers
        var searchViewModel: SearchViewModel? = null
        if (set == null) {
            if (context == null || (APIHolder.INSTANCE.filterProviderByPreferredMedia(
                    context,
                    false
                ).also({ filterProviderByPreferredMedia = it })) == null
            ) {
                set = null
            } else {
                val list: List<MainAPI> = filterProviderByPreferredMedia
                val arrayList: ArrayList =
                    ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10))
                for (mainAPI: MainAPI in list) {
                    arrayList.add(mainAPI.name)
                }
                set = CollectionsKt.toSet(arrayList)
            }
        }
        if (set != null) {
            val searchViewModel2: SearchViewModel? = this.searchViewModel
            if (searchViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchViewModel")
            } else {
                searchViewModel = searchViewModel2
            }
            searchViewModel.searchAndCancel(query, set, false, z)
            return true
        }
        return false
    }

    private fun fixGrid() {
        var spanCount: Integer
        val activity: FragmentActivity? = getActivity()
        if (activity != null && (UIHelper.INSTANCE.getSpanCount(activity)
                .also({ spanCount = it })) != null
        ) {
            HomeFragment.Companion.Companion.setCurrentSpan(spanCount.intValue())
        }
        (`_$_findCachedViewById`(C4761R.C4764id.quick_search_autofit_results) as AutofitRecyclerView?).setSpanCount(
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

    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */ /* JADX WARN: Removed duplicated region for block: B:43:0x00e4  */ /* JADX WARN: Removed duplicated region for block: B:54:0x0134  */ /* JADX WARN: Removed duplicated region for block: B:62:0x014a  */ /* JADX WARN: Removed duplicated region for block: B:68:0x0161  */ /* JADX WARN: Removed duplicated region for block: B:71:0x017d  */ /* JADX WARN: Removed duplicated region for block: B:72:0x0187  */ /* JADX WARN: Removed duplicated region for block: B:75:0x0192  */ /* JADX WARN: Removed duplicated region for block: B:78:0x01ac  */ /* JADX WARN: Removed duplicated region for block: B:79:0x01b0  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */ public override fun onViewCreated(r13: android.view.View?, r14: Bundle?) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.p041ui.quicksearch.QuickSearchFragment.onViewCreated(android.view.View, android.os.Bundle):void")
    }

    companion object {
        val AUTOSEARCH_KEY: String = "autosearch"
        @kotlin.jvm.JvmField
        val Companion: Companion = Companion(null)
        val PROVIDER_KEY: String = "providers"
        private val clickCallback: Function1<SearchClickCallback, Unit>? = null

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-5  reason: not valid java name */
        fun `m8752onViewCreated$lambda5`(`this$0`: QuickSearchFragment, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                UIHelper.INSTANCE.popCurrentPage(activity)
            }
        }
    }
}