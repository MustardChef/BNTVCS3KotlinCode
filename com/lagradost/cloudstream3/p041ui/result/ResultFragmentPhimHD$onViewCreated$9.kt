package com.lagradost.cloudstream3.p041ui.result

import android.content.Context
import com.lagradost.cloudstream3.p041ui.WatchType
import kotlin.jvm.internal.Intrinsics

/* compiled from: ResultFragmentPhimHD.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
    m107d2 = ["<anonymous>", "", "watchType", "Lcom/lagradost/cloudstream3/ui/WatchType;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD$onViewCreated$9 */ /* loaded from: classes4.dex */
internal class `ResultFragmentPhimHD$onViewCreated$9`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(  /* synthetic */
    val `this$0`: ResultFragmentPhimHD
) : Lambda<Any?>(1), Function1<WatchType, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(watchType: WatchType) {
        invoke2(watchType)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(watchType: WatchType) {
        var context: Context?
        var context2: Context?
        Intrinsics.checkNotNullParameter(watchType, "watchType")
        val materialButton: MaterialButton? =
            `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_bookmark_button) as MaterialButton?
        if (materialButton != null) {
            materialButton.setText(`this$0`.getString(watchType.getStringRes()))
        }
        val extendedFloatingActionButton: ExtendedFloatingActionButton? =
            `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_bookmark_fab) as ExtendedFloatingActionButton?
        if (extendedFloatingActionButton != null) {
            extendedFloatingActionButton.setText(`this$0`.getString(watchType.getStringRes()))
        }
        var num: Integer? = null
        if (watchType == WatchType.NONE) {
            val extendedFloatingActionButton2: ExtendedFloatingActionButton? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_bookmark_fab) as ExtendedFloatingActionButton?
            if (extendedFloatingActionButton2 != null && (extendedFloatingActionButton2.getContext()
                    .also({ context2 = it })) != null
            ) {
                num = Integer.valueOf(UIHelper.INSTANCE.colorFromAttribute(context2, R.attr.white))
            }
        } else {
            val extendedFloatingActionButton3: ExtendedFloatingActionButton? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_bookmark_fab) as ExtendedFloatingActionButton?
            if (extendedFloatingActionButton3 != null && (extendedFloatingActionButton3.getContext()
                    .also({ context = it })) != null
            ) {
                num = Integer.valueOf(
                    UIHelper.INSTANCE.colorFromAttribute(
                        context,
                        R.attr.colorPrimary
                    )
                )
            }
        }
        if (num != null) {
            val resultFragmentPhimHD: ResultFragmentPhimHD = `this$0`
            val valueOf: ColorStateList = ColorStateList.valueOf(num.intValue())
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(it)")
            val extendedFloatingActionButton4: ExtendedFloatingActionButton? =
                resultFragmentPhimHD.`_$_findCachedViewById`(C4761R.C4764id.result_bookmark_fab) as ExtendedFloatingActionButton?
            if (extendedFloatingActionButton4 != null) {
                extendedFloatingActionButton4.setIconTint(valueOf)
            }
            val extendedFloatingActionButton5: ExtendedFloatingActionButton? =
                resultFragmentPhimHD.`_$_findCachedViewById`(C4761R.C4764id.result_bookmark_fab) as ExtendedFloatingActionButton?
            if (extendedFloatingActionButton5 != null) {
                extendedFloatingActionButton5.setTextColor(valueOf)
            }
        }
        val extendedFloatingActionButton6: ExtendedFloatingActionButton? =
            `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_bookmark_fab) as ExtendedFloatingActionButton?
        if (extendedFloatingActionButton6 != null) {
            val resultFragmentPhimHD2: ResultFragmentPhimHD = `this$0`
            extendedFloatingActionButton6.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.result.-$$Lambda$ResultFragmentPhimHD$onViewCreated$9$vIjwo0bcdhkx8yPjFy_EHKMD4KE
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    `m8803invoke$lambda2`(this@ResultFragmentPhimHD, watchType, view)
                }
            })
        }
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: invoke$lambda-2  reason: not valid java name */
        fun `m8803invoke$lambda2`(
            `this$0`: ResultFragmentPhimHD,
            watchType: WatchType,
            view: View
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(watchType, "\$watchType")
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                val singleSelectionHelper: SingleSelectionHelper = SingleSelectionHelper.INSTANCE
                val fragmentActivity: FragmentActivity = activity
                val values: Array<WatchType> = WatchType.values()
                val arrayList: ArrayList = ArrayList(values.size)
                for (watchType2: WatchType in values) {
                    arrayList.add(view.getContext().getString(watchType2.getStringRes()))
                }
                val list: List<String> = CollectionsKt.toList(arrayList)
                val ordinal: Int = watchType.ordinal()
                val string: String = view.getContext().getString(R.string.action_add_to_bookmarks)
                Intrinsics.checkNotNullExpressionValue(
                    string,
                    "fab.context.getString(R.….action_add_to_bookmarks)"
                )
                singleSelectionHelper.showBottomDialog(
                    fragmentActivity,
                    list,
                    ordinal,
                    string,
                    false,
                    `ResultFragmentPhimHD$onViewCreated$9$2$2`.Companion.INSTANCE,
                    `ResultFragmentPhimHD$onViewCreated$9$2$3`(`this$0`)
                )
            }
        }
    }
}