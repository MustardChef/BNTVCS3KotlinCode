package com.lagradost.cloudstream3.p041ui.download

import android.app.Activity
import androidx.fragment.app.Fragment
import com.lagradost.cloudstream3.utils.Event
import kotlin.jvm.internal.Intrinsics

/* compiled from: DownloadFragment.kt */
@Metadata(
    m108d1 = ["\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0002J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\u001a\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0016\u0010\u0019\u001a\u00020\u00062\u000c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002J\u0014\u0010\u001d\u001a\u00020\u0006*\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000cH\u0002R\u001c\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000¨\u0006 "],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/download/DownloadFragment;", "Landroidx/fragment/app/Fragment;", "()V", "downloadDeleteEventListener", "Lkotlin/Function1;", "", "", "downloadsViewModel", "Lcom/lagradost/cloudstream3/ui/download/DownloadViewModel;", "getBytesAsText", "", "bytes", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onDestroyView", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "setList", "list", "", "Lcom/lagradost/cloudstream3/ui/download/VisualDownloadHeaderCached;", "setLayoutWidth", "weight", "Companion", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.download.DownloadFragment */ /* loaded from: classes3.dex */
class DownloadFragment constructor() : Fragment() {
    var `_$_findViewCache`: Map<Integer, View> = LinkedHashMap()
    private var downloadDeleteEventListener: Function1<Integer?, Unit>? = null
    var downloadsViewModel: DownloadViewModel? = null
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

    /* compiled from: DownloadFragment.kt */
    @Metadata(
        m108d1 = ["\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/download/DownloadFragment\$Companion;", "", "()V", "push", "", "activity", "Landroid/app/Activity;", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.download.DownloadFragment$Companion */ /* loaded from: classes3.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        fun push(activity: Activity?) {
            val uIHelper: UIHelper = UIHelper.INSTANCE
            val bundle: Bundle = Bundle()
            val unit: Unit = Unit.INSTANCE
            uIHelper.navigate(activity, R.id.global_to_navigation_downloads, bundle)
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun getBytesAsText(j: Long): String {
        val format: String = String.format(
            "%.1f",
            Arrays.copyOf(arrayOf<Object>(Float.valueOf((j.toFloat()) / 1.0E9f)), 1)
        )
        Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)")
        return format
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun setLayoutWidth(view: View, j: Long) {
        view.setLayoutParams(LayoutParams(0, -1, Math.max((j.toFloat()) / 1.0E9f, 0.1f)))
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun setList(list: List<VisualDownloadHeaderCached>) {
        Coroutines.INSTANCE.main(`DownloadFragment$setList$1`(this, list, null))
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onDestroyView() {
        val recyclerView: RecyclerView? =
            `_$_findCachedViewById`(C4761R.C4764id.download_list) as RecyclerView?
        val downloadHeaderAdapter: DownloadHeaderAdapter? =
            (if (recyclerView != null) recyclerView.getAdapter() else null)
        if (downloadHeaderAdapter != null) {
            downloadHeaderAdapter.killAdapter()
        }
        super.onDestroyView()
        `_$_clearFindViewByIdCache`()
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onDestroy() {
        if (downloadDeleteEventListener != null) {
            val downloadDeleteEvent: Event<Integer> =
                VideoDownloadManager.INSTANCE.downloadDeleteEvent
            val function1: Function1<Integer?, Unit>? = downloadDeleteEventListener
            Intrinsics.checkNotNull(function1)
            downloadDeleteEvent.minusAssign(function1)
            downloadDeleteEventListener = null
        }
        super.onDestroy()
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onCreateView(
        inflater: LayoutInflater,
        viewGroup: ViewGroup,
        bundle: Bundle
    ): View {
        Intrinsics.checkNotNullParameter(inflater, "inflater")
        var downloadViewModel: DownloadViewModel? =
            ViewModelProvider(this).get(DownloadViewModel::class.java)
        downloadsViewModel = downloadViewModel
        val downloadFragment: DownloadFragment = this
        var downloadViewModel2: DownloadViewModel? = null
        if (downloadViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("downloadsViewModel")
            downloadViewModel = null
        }
        ArchComponentExt.observe(
            downloadFragment,
            downloadViewModel!!.getNoDownloadsText(),
            `DownloadFragment$onCreateView$1`(this)
        )
        var downloadViewModel3: DownloadViewModel? = downloadsViewModel
        if (downloadViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("downloadsViewModel")
            downloadViewModel3 = null
        }
        ArchComponentExt.observe(
            downloadFragment,
            downloadViewModel3!!.getHeaderCards(),
            `DownloadFragment$onCreateView$2`(this)
        )
        var downloadViewModel4: DownloadViewModel? = downloadsViewModel
        if (downloadViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("downloadsViewModel")
            downloadViewModel4 = null
        }
        ArchComponentExt.observe(
            downloadFragment,
            downloadViewModel4!!.getAvailableBytes(),
            `DownloadFragment$onCreateView$3`(this)
        )
        var downloadViewModel5: DownloadViewModel? = downloadsViewModel
        if (downloadViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("downloadsViewModel")
            downloadViewModel5 = null
        }
        ArchComponentExt.observe(
            downloadFragment,
            downloadViewModel5!!.getUsedBytes(),
            `DownloadFragment$onCreateView$4`(this)
        )
        val downloadViewModel6: DownloadViewModel? = downloadsViewModel
        if (downloadViewModel6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("downloadsViewModel")
        } else {
            downloadViewModel2 = downloadViewModel6
        }
        ArchComponentExt.observe(
            downloadFragment,
            downloadViewModel2!!.getDownloadBytes(),
            `DownloadFragment$onCreateView$5`(this)
        )
        return inflater.inflate(R.layout.fragment_downloads, viewGroup, false)
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onViewCreated(view: View, bundle: Bundle) {
        Intrinsics.checkNotNullParameter(view, "view")
        super.onViewCreated(view, bundle)
        UIHelper.INSTANCE.hideKeyboard(this)
        val downloadHeaderAdapter: DownloadHeaderAdapter = DownloadHeaderAdapter(
            ArrayList(),
            `DownloadFragment$onViewCreated$adapter$1`(this),
            `DownloadFragment$onViewCreated$adapter$2`(this)
        )
        val `downloadFragment$onViewCreated$1`: `DownloadFragment$onViewCreated$1`? =
            `DownloadFragment$onViewCreated$1`(this)
        downloadDeleteEventListener = `downloadFragment$onViewCreated$1`
        if (`downloadFragment$onViewCreated$1` != null) {
            VideoDownloadManager.INSTANCE.downloadDeleteEvent.plusAssign(
                `downloadFragment$onViewCreated$1`
            )
        }
        (`_$_findCachedViewById`(C4761R.C4764id.download_list) as RecyclerView?).setAdapter(
            downloadHeaderAdapter
        )
        (`_$_findCachedViewById`(C4761R.C4764id.download_list) as RecyclerView?).setLayoutManager(
            GridLayoutManager(getContext(), 1)
        )
        var downloadViewModel: DownloadViewModel? = downloadsViewModel
        if (downloadViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("downloadsViewModel")
            downloadViewModel = null
        }
        val requireContext: Context = requireContext()
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()")
        downloadViewModel!!.updateList(requireContext)
        val context: Context? = getContext()
        if (context != null) {
            UIHelper.INSTANCE.fixPaddingStatusbar(
                context,
                `_$_findCachedViewById`(C4761R.C4764id.download_root) as CoordinatorLayout?
            )
        }
    }

    companion object {
        val Companion: Companion = Companion(null)
    }
}