package com.lagradost.cloudstream3.p041ui.livetv

import com.lagradost.cloudstream3.mvvm.Resource
import java.util.List
import kotlin.jvm.internal.Intrinsics

/* compiled from: LiveTvSportFragment.kt */
@Metadata(
    m108d1 = ["\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\n¢\u0006\u0002\b\u0006"],
    m107d2 = ["<anonymous>", "", "it", "Lcom/lagradost/cloudstream3/mvvm/Resource;", "", "Lcom/lagradost/cloudstream3/SearchResponse;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.livetv.LiveTvSportFragment$onViewCreated$2 */ /* loaded from: classes3.dex */
internal class `LiveTvSportFragment$onViewCreated$2`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(  /* synthetic */
    val `this$0`: LiveTvSportFragment
) : Lambda<Any?>(1), Function1<Resource<out List<SearchResponse?>?>, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(resource: Resource<out List<SearchResponse?>?>) {
        invoke2(resource)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(it: Resource<out List<SearchResponse?>?>) {
        var contentLoadingProgressBar: ContentLoadingProgressBar
        Intrinsics.checkNotNullParameter(it, "it")
        if (it is Resource.Success<*>) {
            val value: Object = (it as Resource.Success<*>).value
            val liveTvSportFragment: LiveTvSportFragment = `this$0`
            val list: List<SearchResponse> = value
            System.out.println(("DATA: " + list) as Object?)
            val autofitRecyclerView: AutofitRecyclerView? =
                liveTvSportFragment.`_$_findCachedViewById`(C4761R.C4764id.livetv_autofit_results) as AutofitRecyclerView?
            val adapter: RecyclerView.Adapter<*>? =
                if (autofitRecyclerView != null) autofitRecyclerView.getAdapter() else null
            val searchAdaptor: SearchAdaptor? =
                if (adapter is SearchAdaptor) adapter as SearchAdaptor? else null
            if (searchAdaptor != null) {
                searchAdaptor.updateList(list)
            }
            val contentLoadingProgressBar2: ContentLoadingProgressBar? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.livetv_loading_bar) as ContentLoadingProgressBar?
            if (contentLoadingProgressBar2 == null) {
                return
            }
            contentLoadingProgressBar2.setAlpha(0.0f)
        } else if (it is Resource.Failure) {
            val contentLoadingProgressBar3: ContentLoadingProgressBar? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.livetv_loading_bar) as ContentLoadingProgressBar?
            if (contentLoadingProgressBar3 == null) {
                return
            }
            contentLoadingProgressBar3.setAlpha(0.0f)
        } else if (!(it is Loading) || (`this$0`.`_$_findCachedViewById`(C4761R.C4764id.livetv_loading_bar) as ContentLoadingProgressBar?. also ({
                contentLoadingProgressBar = it
            })) == null) {
        } else {
            contentLoadingProgressBar.setAlpha(1.0f)
        }
    }
}