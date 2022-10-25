package com.lagradost.cloudstream3.p041ui.result

import android.content.Context
import com.lagradost.cloudstream3.mvvm.Resource
import kotlin.jvm.functions.Functions
import kotlin.jvm.internal.Intrinsics

/* compiled from: ResultFragmentTV.kt */
@Metadata(
    m108d1 = ["\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"],
    m107d2 = ["<anonymous>", "", "status", "Lcom/lagradost/cloudstream3/mvvm/Resource;", "Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncStatus;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentTV$onViewCreated$18 */ /* loaded from: classes4.dex */
internal class `ResultFragmentTV$onViewCreated$18` constructor(/* synthetic */val `this$0`: ResultFragmentTV,
                                                                              intRef: IntRef
) : Lambda<Any?>(1), Function1<Resource<out SyncStatus?>?, Unit> {
    /* synthetic */ val `$currentSyncProgress`: IntRef

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$currentSyncProgress` = intRef
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(resource: Resource<out SyncStatus?>?) {
        invoke2(resource as Resource<SyncStatus?>?)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(resource: Resource<SyncStatus?>?) {
        var z: Boolean = true
        if (resource is Resource.Failure) {
            val shimmerFrameLayout: ShimmerFrameLayout? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_sync_loading_shimmer) as ShimmerFrameLayout?
            if (shimmerFrameLayout != null) {
                shimmerFrameLayout.stopShimmer()
            }
            val shimmerFrameLayout2: ShimmerFrameLayout? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_sync_loading_shimmer) as ShimmerFrameLayout?
            if (shimmerFrameLayout2 != null) {
                shimmerFrameLayout2.setVisibility(8)
            }
            val scrollView: ScrollView? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_sync_holder) as ScrollView?
            if (scrollView != null) {
                scrollView.setVisibility(8)
            }
        } else {
            if (resource is Loading) {
                val shimmerFrameLayout3: ShimmerFrameLayout? =
                    `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_sync_loading_shimmer) as ShimmerFrameLayout?
                if (shimmerFrameLayout3 != null) {
                    shimmerFrameLayout3.startShimmer()
                }
                val shimmerFrameLayout4: ShimmerFrameLayout? =
                    `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_sync_loading_shimmer) as ShimmerFrameLayout?
                if (shimmerFrameLayout4 != null) {
                    shimmerFrameLayout4.setVisibility(0)
                }
                val scrollView2: ScrollView? =
                    `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_sync_holder) as ScrollView?
                if (scrollView2 != null) {
                    scrollView2.setVisibility(8)
                }
            } else if (resource is Resource.Success<*>) {
                val shimmerFrameLayout5: ShimmerFrameLayout? =
                    `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_sync_loading_shimmer) as ShimmerFrameLayout?
                if (shimmerFrameLayout5 != null) {
                    shimmerFrameLayout5.stopShimmer()
                }
                val shimmerFrameLayout6: ShimmerFrameLayout? =
                    `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_sync_loading_shimmer) as ShimmerFrameLayout?
                if (shimmerFrameLayout6 != null) {
                    shimmerFrameLayout6.setVisibility(8)
                }
                val scrollView3: ScrollView? =
                    `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_sync_holder) as ScrollView?
                if (scrollView3 != null) {
                    scrollView3.setVisibility(0)
                }
                val syncStatus: SyncStatus = resource.value as SyncStatus
                val slider: Slider? =
                    `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_sync_rating) as Slider?
                if (slider != null) {
                    val score: Integer? = syncStatus.getScore()
                    slider.setValue(if (score != null) score.intValue() else 0.0f)
                }
                val listView: ListView? =
                    `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_sync_check) as ListView?
                if (listView != null) {
                    listView.setItemChecked(syncStatus.status + 1, true)
                }
                val watchedEpisodes: Integer? = syncStatus.getWatchedEpisodes()
                val intValue: Int = if (watchedEpisodes != null) watchedEpisodes.intValue() else 0
                `$currentSyncProgress`.element = intValue
                val maxEpisodes: Integer? = syncStatus.getMaxEpisodes()
                if (maxEpisodes != null) {
                    ResultFragmentTV.Companion.`onViewCreated$setSyncMaxEpisodes`(
                        `this$0`,
                        Integer.valueOf(maxEpisodes.intValue())
                    )
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    val contentLoadingProgressBar: ContentLoadingProgressBar? =
                        `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_sync_episodes) as ContentLoadingProgressBar?
                    if (contentLoadingProgressBar != null) {
                        contentLoadingProgressBar.setProgress(intValue * 1000, true)
                    }
                } else {
                    val contentLoadingProgressBar2: ContentLoadingProgressBar? =
                        `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_sync_episodes) as ContentLoadingProgressBar?
                    if (contentLoadingProgressBar2 != null) {
                        contentLoadingProgressBar2.setProgress(intValue * 1000)
                    }
                }
                val editText: EditText? =
                    `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_sync_current_episodes) as EditText?
                if (editText != null) {
                    val factory: Editable.Factory? = Editable.Factory.getInstance()
                    editText.setText(
                        if (factory != null) factory.newEditable(
                            String.valueOf(
                                intValue
                            )
                        ) else null
                    )
                }
                ArchComponentExt.normalSafeApiCall<Unit>(C49452(`this$0`, syncStatus))
            }
            z = false
        }
        val overlappingPanelsLayout: OverlappingPanelsLayout? =
            `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_overlapping_panels) as OverlappingPanelsLayout?
        if (overlappingPanelsLayout != null) {
            overlappingPanelsLayout.setStartPanelLockState(if (z) OverlappingPanelsLayout.LockState.CLOSE else OverlappingPanelsLayout.LockState.UNLOCKED)
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: ResultFragmentTV.kt */
    @Metadata(
        m108d1 = ["\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"],
        m107d2 = ["<anonymous>", "", "invoke", "()Lkotlin/Unit;"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentTV$onViewCreated$18$2 */ /* loaded from: classes4.dex */
    class C49452 internal constructor(/* synthetic */val `this$0`: ResultFragmentTV,
                                                     syncStatus: SyncStatus
    ) : Lambda<Any?>(0), Functions<Unit> {
        /* renamed from: $d */
        /* synthetic */ val `f10020$d`: SyncStatus

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        init {
            `f10020$d` = syncStatus
        }

        @Override // kotlin.jvm.functions.Functions
        public override fun invoke() {
            var string: String?
            val context: Context? = `this$0`.getContext()
            if (context != null && (context.getString(R.string.sync_score_format)
                    .also({ string = it })) != null
            ) {
                val objArr: Array<Object> = arrayOfNulls<Object>(1)
                val score: Integer? = `f10020$d`.getScore()
                objArr.get(0) = Integer.valueOf(if (score != null) score.intValue() else 0)
                val format: String? = String.format(string, Arrays.copyOf(objArr, 1))
                Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)")
                if (format != null) {
                    val materialButton: MaterialButton? =
                        `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_sync_score_text) as MaterialButton?
                    if (materialButton != null) {
                        materialButton.setText(format)
                    }
                    return Unit.INSTANCE
                }
            }
            return null
        }
    }
}