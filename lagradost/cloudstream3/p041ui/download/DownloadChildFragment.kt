package com.lagradost.cloudstream3.p041ui.download

import android.content.Context
import androidx.fragment.app.Fragment
import kotlin.jvm.internal.Intrinsics

/* compiled from: DownloadChildFragment.kt */
@Metadata(
    m108d1 = ["\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\u001a\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u001c\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/download/DownloadChildFragment;", "Landroidx/fragment/app/Fragment;", "()V", "downloadDeleteEventListener", "Lkotlin/Function1;", "", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onDestroyView", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "updateList", "Lkotlinx/coroutines/Job;", "folder", "", "Companion", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.download.DownloadChildFragment */ /* loaded from: classes3.dex */
class DownloadChildFragment constructor() : Fragment() {
    var `_$_findViewCache`: Map<Integer, View> = LinkedHashMap()
    private var downloadDeleteEventListener: Function1<Integer?, Unit>? = null
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

    /* compiled from: DownloadChildFragment.kt */
    @Metadata(
        m108d1 = ["\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/download/DownloadChildFragment\$Companion;", "", "()V", "newInstance", "Landroid/os/Bundle;", "headerName", "", "folder", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.download.DownloadChildFragment$Companion */ /* loaded from: classes3.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        fun newInstance(headerName: String?, folder: String?): Bundle {
            Intrinsics.checkNotNullParameter(headerName, "headerName")
            Intrinsics.checkNotNullParameter(folder, "folder")
            val bundle: Bundle = Bundle()
            bundle.putString("folder", folder)
            bundle.putString("name", headerName)
            return bundle
        }
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onDestroyView() {
        val recyclerView: RecyclerView? =
            `_$_findCachedViewById`(C4761R.C4764id.download_child_list) as RecyclerView?
        val downloadChildAdapter: DownloadChildAdapter? =
            (if (recyclerView != null) recyclerView.getAdapter() else null)
        if (downloadChildAdapter != null) {
            downloadChildAdapter.killAdapter()
        }
        super.onDestroyView()
        `_$_clearFindViewByIdCache`()
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onDestroy() {
        val function1: Function1<Integer?, Unit>? = downloadDeleteEventListener
        if (function1 != null) {
            VideoDownloadManager.INSTANCE.downloadDeleteEvent.minusAssign(function1)
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
        return inflater.inflate(R.layout.fragment_child_downloads, viewGroup, false)
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun updateList(str: String?): Job {
        return Coroutines.INSTANCE.main(`DownloadChildFragment$updateList$1`(this, str, null))
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onViewCreated(view: View, bundle: Bundle) {
        Intrinsics.checkNotNullParameter(view, "view")
        super.onViewCreated(view, bundle)
        val arguments: Bundle? = getArguments()
        val string: String? = if (arguments != null) arguments.getString("folder") else null
        val arguments2: Bundle? = getArguments()
        val string2: String? = if (arguments2 != null) arguments2.getString("name") else null
        if (string == null) {
            val activity: FragmentActivity? = getActivity()
            if (activity != null) {
                activity.onBackPressed()
                return
            }
            return
        }
        val context: Context? = getContext()
        if (context != null) {
            UIHelper.INSTANCE.fixPaddingStatusbar(
                context,
                `_$_findCachedViewById`(C4761R.C4764id.download_child_root) as CoordinatorLayout?
            )
        }
        (`_$_findCachedViewById`(C4761R.C4764id.download_child_toolbar) as MaterialToolbar?).setTitle(
            string2
        )
        (`_$_findCachedViewById`(C4761R.C4764id.download_child_toolbar) as MaterialToolbar?).setNavigationIcon(
            R.drawable.ic_baseline_arrow_back_24
        )
        (`_$_findCachedViewById`(C4761R.C4764id.download_child_toolbar) as MaterialToolbar?).setNavigationOnClickListener(
            object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.download.-$$Lambda$DownloadChildFragment$H7oplXCQLxHiF-0G2QThI3Or1PQ
                @Override // android.view.View.OnClickListener
                fun onClick(view2: View?) {
                    DownloadChildFragment.Companion.`m8624onViewCreated$lambda1`(
                        this@DownloadChildFragment,
                        view2
                    )
                }
            })
        val downloadChildAdapter: DownloadChildAdapter = DownloadChildAdapter(
            ArrayList(),
            `DownloadChildFragment$onViewCreated$adapter$1`(this, string2)
        )
        val `downloadChildFragment$onViewCreated$2`: `DownloadChildFragment$onViewCreated$2`? =
            `DownloadChildFragment$onViewCreated$2`(this, string)
        downloadDeleteEventListener = `downloadChildFragment$onViewCreated$2`
        if (`downloadChildFragment$onViewCreated$2` != null) {
            VideoDownloadManager.INSTANCE.downloadDeleteEvent.plusAssign(
                `downloadChildFragment$onViewCreated$2`
            )
        }
        (`_$_findCachedViewById`(C4761R.C4764id.download_child_list) as RecyclerView?).setAdapter(
            downloadChildAdapter
        )
        (`_$_findCachedViewById`(C4761R.C4764id.download_child_list) as RecyclerView?).setLayoutManager(
            GridLayoutManager(getContext(), 1)
        )
        updateList(string)
    }

    companion object {
        val Companion: Companion = Companion(null)

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
        fun `m8624onViewCreated$lambda1`(`this$0`: DownloadChildFragment, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                activity.onBackPressed()
            }
        }
    }
}