package com.lagradost.cloudstream3.p041ui.home

import android.app.Activity
import androidx.lifecycle.Observer
import com.lagradost.cloudstream3.mvvm.Resource
import kotlin.jvm.internal.Intrinsics

/* compiled from: PageBottomSheet.kt */
@Metadata(
    m108d1 = ["\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001f"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/home/PageBottomSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "is_loading", "", "()Z", "set_loading", "(Z)V", "listData", "Ljava/util/ArrayList;", "Lcom/lagradost/cloudstream3/SearchResponse;", "Lkotlin/collections/ArrayList;", "name", "", "nameApi", "url", "viewModel", "Lcom/lagradost/cloudstream3/ui/home/PageViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "Companion", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.home.PageBottomSheet */ /* loaded from: classes3.dex */
class PageBottomSheet() : BottomSheetDialogFragment() {
    private var is_loading = false
    private var name: String? = null
    private var nameApi: String? = null
    private var url: String? = null
    private var viewModel: PageViewModel? = null
    var `_$_findViewCache`: Map<Integer, View> = LinkedHashMap()
    private val listData: ArrayList<SearchResponse> = ArrayList()
    fun `_$_clearFindViewByIdCache`() {
        `_$_findViewCache`.clear()
    }

    fun `_$_findCachedViewById`(i: Int): View? {
        var findViewById: View?
        val map: Map<Integer, View> = `_$_findViewCache`
        val view: View? = map[Integer.valueOf(i)]
        if (view == null) {
            val view2: View = getView()
            if (view2 == null || (view2.findViewById(i).also { findViewById = it }) == null) {
                return null
            }
            map.put(Integer.valueOf(i), findViewById)
            return findViewById
        }
        return view
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    /* synthetic */  override fun onDestroyView() {
        super.onDestroyView()
        `_$_clearFindViewByIdCache`()
    }

    /* compiled from: PageBottomSheet.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J(\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¨\u0006\r"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/home/PageBottomSheet\$Companion;", "", "()V", "newInstance", "Lcom/lagradost/cloudstream3/ui/home/PageBottomSheet;", "url", "", "name", "nameApi", "push", "", "activity", "Landroid/app/Activity;", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.home.PageBottomSheet$Companion */ /* loaded from: classes3.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        fun newInstance(url: String?, name: String?, nameApi: String?): PageBottomSheet {
            Intrinsics.checkNotNullParameter(url, "url")
            Intrinsics.checkNotNullParameter(name, "name")
            Intrinsics.checkNotNullParameter(nameApi, "nameApi")
            val bundle = Bundle()
            bundle.putString("url", url)
            bundle.putString("name", name)
            bundle.putString("nameApi", nameApi)
            val pageBottomSheet = PageBottomSheet()
            pageBottomSheet.setArguments(bundle)
            return pageBottomSheet
        }

        fun push(activity: Activity?, url: String?, name: String?, nameApi: String?) {
            Intrinsics.checkNotNullParameter(url, "url")
            Intrinsics.checkNotNullParameter(name, "name")
            Intrinsics.checkNotNullParameter(nameApi, "nameApi")
            val uIHelper: UIHelper = UIHelper.INSTANCE
            val bundle = Bundle()
            bundle.putString("url", url)
            bundle.putString("name", name)
            bundle.putString("nameApi", nameApi)
            val unit = Unit.INSTANCE
            uIHelper.navigate(activity, R.id.global_to_navigation_page, bundle)
        }
    }

    fun is_loading(): Boolean {
        return is_loading
    }

    fun set_loading(z: Boolean) {
        is_loading = z
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    override fun onCreate(bundle: Bundle) {
        super.onCreate(bundle)
        viewModel = ViewModelProvider(this).get(PageViewModel::class.java)
        val arguments: Bundle = getArguments()
        if (arguments != null) {
            name = arguments.getString("name", "")
            url = arguments.getString("url", "")
            nameApi = arguments.getString("nameApi", "")
        }
    }

    @Override // androidx.fragment.app.Fragment
    override fun onCreateView(
        inflater: LayoutInflater,
        viewGroup: ViewGroup,
        bundle: Bundle
    ): View {
        Intrinsics.checkNotNullParameter(inflater, "inflater")
        return inflater.inflate(R.layout.dialog_page, viewGroup, false)
    }

    @Override // androidx.fragment.app.Fragment
    override fun onViewCreated(view: View, bundle: Bundle) {
        Intrinsics.checkNotNullParameter(view, "view")
        super.onViewCreated(view, bundle)
        val findViewById: View = view.findViewById(R.id.home_expanded_text)
        Intrinsics.checkNotNull(findViewById)
        (findViewById as TextView).setText(name)
        val findViewById2: View = view.findViewById(R.id.home_expanded_recycler)
        Intrinsics.checkNotNull(findViewById2)
        val autofitRecyclerView: AutofitRecyclerView = findViewById2 as AutofitRecyclerView
        val findViewById3: View = view.findViewById(R.id.home_expanded_drag_down)
        Intrinsics.checkNotNull(findViewById3)
        (findViewById3 as FrameLayout).setOnClickListener(object : OnClickListener() {
            // from class: com.lagradost.cloudstream3.ui.home.-$$Lambda$PageBottomSheet$VbHvrDJY2R4If3IRf7l4Gx9LXrQ
            @Override // android.view.View.OnClickListener
            fun onClick(view2: View?) {
                PageBottomSheet.Companion.`m8658onViewCreated$lambda1`(this@PageBottomSheet, view2)
            }
        })
        autofitRecyclerView.setSpanCount(HomeFragment.Companion.Companion.getCurrentSpan())
        autofitRecyclerView.setAdapter(
            SearchAdaptor(
                listData,
                autofitRecyclerView,
                true,
                `PageBottomSheet$onViewCreated$2`(this)
            )
        )
        autofitRecyclerView.setEnableLoadmore(true)
        autofitRecyclerView.addOnScrollListener(object : OnScrollListener() {
            // from class: com.lagradost.cloudstream3.ui.home.PageBottomSheet$onViewCreated$3
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            override fun onScrolled(recyclerView: RecyclerView, i: Int, i2: Int) {
                val str: String?
                val pageViewModel: PageViewModel
                val str2: String
                val str3: String
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView")
                super.onScrolled(recyclerView, i, i2)
                val gridLayoutManager: GridLayoutManager =
                    recyclerView.getLayoutManager() as GridLayoutManager
                Intrinsics.checkNotNull(gridLayoutManager)
                if (gridLayoutManager.getItemCount() > gridLayoutManager.findLastCompletelyVisibleItemPosition() + 2 || is_loading()) {
                    return
                }
                set_loading(true)
                if (autofitRecyclerView.getNoMore()) {
                    return
                }
                val adapter: RecyclerView.Adapter<*> = recyclerView.getAdapter()
                var pageViewModel2: PageViewModel? = null
                val valueOf: Integer? =
                    if (adapter != null) Integer.valueOf(adapter.getItemCount()) else null
                Intrinsics.checkNotNull(valueOf)
                if (valueOf.intValue() > 1) {
                    Log.d("Blue", "Loadmore  now ------>")
                    str = url
                    if (str != null) {
                        val pageBottomSheet = this@PageBottomSheet
                        pageViewModel = pageBottomSheet.viewModel
                        if (pageViewModel == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel")
                        } else {
                            pageViewModel2 = pageViewModel
                        }
                        str2 = pageBottomSheet.name
                        str3 = pageBottomSheet.nameApi
                        pageViewModel2!!.getPage(str, str2, str3)
                    }
                }
            }
        })
        `PageBottomSheet$onViewCreated$spanListener$1`(autofitRecyclerView)
        var pageViewModel = viewModel
        var pageViewModel2: PageViewModel? = null
        if (pageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel")
            pageViewModel = null
        }
        pageViewModel.getSearchResponse()
            .observe(getViewLifecycleOwner(), // androidx.lifecycle.Observer
                Observer<Any?> { obj ->
                    // from class: com.lagradost.cloudstream3.ui.home.-$$Lambda$PageBottomSheet$9OE-s2vV68f2wE1GQ_Oad_mwEI0
                    PageBottomSheet.Companion.`m8659onViewCreated$lambda2`(
                        this@PageBottomSheet,
                        autofitRecyclerView,
                        obj as Resource<*>
                    )
                })
        val pageViewModel3 = viewModel
        if (pageViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel")
        } else {
            pageViewModel2 = pageViewModel3
        }
        pageViewModel2!!.getPage(url, name, nameApi)
    }

    companion object {
        @kotlin.jvm.JvmField
        val Companion = Companion(null)

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
        fun `m8658onViewCreated$lambda1`(`this$0`: PageBottomSheet, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            `this$0`.dismiss()
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-2  reason: not valid java name */
        fun `m8659onViewCreated$lambda2`(
            `this$0`: PageBottomSheet,
            recycle: AutofitRecyclerView,
            resource: Resource<*>?
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(recycle, "\$recycle")
            if (resource is Loading) {
                return
            }
            if (resource is Resource.Failure) {
                `this$0`.is_loading = false
                Log.e("Blue", "Error 1 " + resource.errorString)
                recycle.loadMoreComplete()
                recycle.setEnableLoadmore(false)
            } else if (resource is Resource.Success<*>) {
                `this$0`.is_loading = false
                recycle.loadMoreComplete()
                val success = resource
                val z = (success.value as PageResponse).nextUrl == null
                recycle.setNoMore(z)
                `this$0`.url = (success.value as PageResponse).nextUrl
                if (`this$0`.listData.size() === 0) {
                    `this$0`.listData.addAll((success.value as PageResponse).list)
                    val adapter: RecyclerView.Adapter<*> = recycle.getAdapter()
                    Objects.requireNonNull(
                        adapter,
                        "null cannot be cast to non-null type com.lagradost.cloudstream3.ui.search.SearchAdapter"
                    )
                    (adapter as SearchAdaptor).notifyDataSetChanged()
                    LogUtils.m6080d("Blue", "notifyDataSetChanged")
                } else if (!(success.value as PageResponse).list.isEmpty()) {
                    val size: Int = `this$0`.listData.size()
                    `this$0`.listData.addAll((success.value as PageResponse).list)
                    val adapter2: RecyclerView.Adapter<*> = recycle.getAdapter()
                    if (adapter2 != null) {
                        adapter2.notifyItemRangeInserted(
                            size,
                            (success.value as PageResponse).list.size()
                        )
                    }
                    LogUtils.m6080d("Blue", "notifyItemRangeInserted")
                } else {
                    val adapter3: RecyclerView.Adapter<*> = recycle.getAdapter()
                    Objects.requireNonNull(
                        adapter3,
                        "null cannot be cast to non-null type com.lagradost.cloudstream3.ui.search.SearchAdapter"
                    )
                    (adapter3 as SearchAdaptor).setEnableLoadmore(Boolean.valueOf(!z))
                    val adapter4: RecyclerView.Adapter<*> = recycle.getAdapter()
                    Objects.requireNonNull(
                        adapter4,
                        "null cannot be cast to non-null type com.lagradost.cloudstream3.ui.search.SearchAdapter"
                    )
                    (adapter4 as SearchAdaptor).notifyDataSetChanged()
                    LogUtils.m6080d("Blue", "notifyDataSetChanged No more")
                    Toast.makeText(`this$0`.getContext(), "Danh sách đã hết", 0).show()
                }
            }
        }
    }
}