package com.lagradost.cloudstream3.p041ui.result

import com.lagradost.cloudstream3.mvvm.Resource
import java.util.List
import kotlin.jvm.internal.Intrinsics

/* compiled from: ResultFragmentTV.kt */
@Metadata(
    m108d1 = ["\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\n¢\u0006\u0002\b\u0006"],
    m107d2 = ["<anonymous>", "", "episodes", "Lcom/lagradost/cloudstream3/mvvm/Resource;", "", "Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentTV$onViewCreated$20 */ /* loaded from: classes4.dex */
internal class `ResultFragmentTV$onViewCreated$20`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(  /* synthetic */
    val `this$0`: ResultFragmentTV
) : Lambda<Any?>(1), Function1<Resource<out List<ResultEpisode?>?>?, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(resource: Resource<out List<ResultEpisode?>?>?) {
        invoke2(resource)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(episodes: Resource<out List<ResultEpisode?>?>?) {
        Intrinsics.checkNotNullParameter(episodes, "episodes")
        if (episodes is Resource.Failure) {
            val shimmerFrameLayout: ShimmerFrameLayout? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_episode_loading) as ShimmerFrameLayout?
            if (shimmerFrameLayout == null) {
                return
            }
            shimmerFrameLayout.setVisibility(8)
        } else if (episodes is Loading) {
            val shimmerFrameLayout2: ShimmerFrameLayout? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_episode_loading) as ShimmerFrameLayout?
            if (shimmerFrameLayout2 == null) {
                return
            }
            shimmerFrameLayout2.setVisibility(0)
        } else if (episodes is Resource.Success<*>) {
            val shimmerFrameLayout3: ShimmerFrameLayout? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_episode_loading) as ShimmerFrameLayout?
            if (shimmerFrameLayout3 != null) {
                shimmerFrameLayout3.setVisibility(8)
            }
            if ((`this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_episodes) as RecyclerView?) == null || (`this$0`.`_$_findCachedViewById`(
                    C4761R.C4764id.result_episodes
                ) as RecyclerView?).getAdapter() == null
            ) {
                return
            }
            val success: Resource.Success<*> = episodes
            `this$0`.currentEpisodes = success.value as List?
            val recyclerView: RecyclerView? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_episodes) as RecyclerView?
            val adapter: RecyclerView.Adapter<*>? =
                if (recyclerView != null) recyclerView.getAdapter() else null
            val episodeAdapter: EpisodeAdapter? = if (adapter is EpisodeAdapter) adapter else null
            if (episodeAdapter != null) {
                episodeAdapter.setCardList(success.value as List)
            }
            val recyclerView2: RecyclerView? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_episodes) as RecyclerView?
            val adapter2: RecyclerView.Adapter<*>? =
                if (recyclerView2 != null) recyclerView2.getAdapter() else null
            val episodeAdapter2: EpisodeAdapter? =
                if (adapter2 is EpisodeAdapter) adapter2 else null
            if (episodeAdapter2 != null) {
                episodeAdapter2.updateLayout()
            }
            val recyclerView3: RecyclerView? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_episodes) as RecyclerView?
            val adapter3: RecyclerView.Adapter<*>? =
                if (recyclerView3 != null) recyclerView3.getAdapter() else null
            val episodeAdapter3: EpisodeAdapter? =
                if (adapter3 is EpisodeAdapter) adapter3 else null
            if (episodeAdapter3 != null) {
                episodeAdapter3.notifyDataSetChanged()
            }
        }
    }
}