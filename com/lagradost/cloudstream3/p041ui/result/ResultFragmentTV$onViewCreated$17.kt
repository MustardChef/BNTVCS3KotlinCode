package com.lagradost.cloudstream3.p041ui.result

import android.content.Context
import com.lagradost.cloudstream3.mvvm.Resource
import kotlin.jvm.internal.Intrinsics

/* compiled from: ResultFragmentTV.kt */
@Metadata(
    m108d1 = ["\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"],
    m107d2 = ["<anonymous>", "", "meta", "Lcom/lagradost/cloudstream3/mvvm/Resource;", "Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncResult;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentTV$onViewCreated$17 */ /* loaded from: classes4.dex */
internal class `ResultFragmentTV$onViewCreated$17` constructor(/* synthetic */val `this$0`: ResultFragmentTV,
                                                                              intRef: IntRef
) : Lambda<Any?>(1), Function1<Resource<out SyncResult?>?, Unit> {
    /* synthetic */ val `$currentSyncProgress`: IntRef

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$currentSyncProgress` = intRef
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(resource: Resource<out SyncResult?>?) {
        invoke2(resource as Resource<SyncResult?>?)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(meta: Resource<SyncResult?>?) {
        var textView: TextView
        var context: Context
        val resultViewModel: ResultViewModel?
        Intrinsics.checkNotNullParameter(meta, "meta")
        var str: String? = null
        var resultViewModel2: ResultViewModel? = null
        str = null
        if (meta is Resource.Success<*>) {
            val syncResult: SyncResult = meta.value as SyncResult
            val contentLoadingProgressBar: ContentLoadingProgressBar? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_sync_episodes) as ContentLoadingProgressBar?
            if (contentLoadingProgressBar != null) {
                contentLoadingProgressBar.setProgress(`$currentSyncProgress`.element * 1000)
            }
            ResultFragmentTV.Companion.`onViewCreated$setSyncMaxEpisodes`(
                `this$0`,
                syncResult.getTotalEpisodes()
            )
            resultViewModel = `this$0`.viewModel
            if (resultViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel")
            } else {
                resultViewModel2 = resultViewModel
            }
            resultViewModel2!!.setMeta(syncResult)
        } else if (!(meta is Loading) || (`this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_sync_max_episodes) as TextView?. also ({
                textView = it
            })) == null) {
        } else {
            val textView2: TextView? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_sync_max_episodes) as TextView?
            if (textView2 != null && (textView2.getContext().also({ context = it })) != null) {
                str = context.getString(R.string.sync_total_episodes_none)
            }
            textView.setText(str)
        }
    }
}