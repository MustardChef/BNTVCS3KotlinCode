package com.lagradost.cloudstream3.p041ui.result

import android.content.Context
import kotlin.jvm.functions.Functions
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: ResultFragmentTV.kt */
@Metadata(
    m108d1 = ["\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"],
    m107d2 = ["<anonymous>", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentTV$onViewCreated$setSyncMaxEpisodes$1 */ /* loaded from: classes4.dex */
class `ResultFragmentTV$onViewCreated$setSyncMaxEpisodes$1` constructor(/* synthetic */val `this$0`: ResultFragmentTV,
                                                                                       num: Integer?
) : Lambda<Any?>(0), Functions<Unit> {
    /* synthetic */ val `$totalEpisodes`: Integer?

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$totalEpisodes` = num
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */  override fun invoke() {
        invoke2()
        return Unit.INSTANCE
    }

    @Override // kotlin.jvm.functions.Functions
            /* renamed from: invoke  reason: avoid collision after fix types in other method */    fun invoke2() {
        var string: String?
        val str: String?
        var string2: String?
        val textView: TextView? =
            `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_sync_max_episodes) as TextView?
        val context: Context? = if (textView != null) textView.getContext() else null
        val textView2: TextView? =
            `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_sync_max_episodes) as TextView?
        if (textView2 == null) {
            return
        }
        val num: Integer? = `$totalEpisodes`
        if (num != null) {
            val intValue: Int = num.intValue()
            if (context == null || (context.getString(R.string.sync_total_episodes_some)
                    .also({ string2 = it })) == null
            ) {
                str = null
            } else {
                str = String.format(
                    string2,
                    Arrays.copyOf(arrayOf<Object>(Integer.valueOf(intValue)), 1)
                )
                Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)")
            }
            if (str != null) {
                string = str
                textView2.setText(string)
            }
        }
        string = if (context != null) context.getString(R.string.sync_total_episodes_none) else null
        textView2.setText(string)
    }
}