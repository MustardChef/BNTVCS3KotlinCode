package com.lagradost.cloudstream3.p041ui.result

import android.widget.TextView

/* compiled from: ResultFragmentPhimHD.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
    m107d2 = ["<anonymous>", "", "count", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD$onViewCreated$27 */ /* loaded from: classes4.dex */
internal class `ResultFragmentPhimHD$onViewCreated$27`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(  /* synthetic */
    val `this$0`: ResultFragmentPhimHD
) : Lambda<Any?>(1), Function1<Integer, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(num: Integer) {
        invoke(num.intValue())
        return Unit.INSTANCE
    }

    override fun invoke(i: Int) {
        val resultFragmentPhimHD: ResultFragmentPhimHD
        val i2: Int
        if (i < 0) {
            val textView: TextView? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_episodes_text) as TextView?
            if (textView == null) {
                return
            }
            textView.setVisibility(8)
            return
        }
        val textView2: TextView? =
            `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_episodes_text) as TextView?
        if (textView2 == null) {
            return
        }
        val sb: StringBuilder = StringBuilder()
        sb.append(i)
        sb.append(' ')
        if (i == 1) {
            resultFragmentPhimHD = `this$0`
            i2 = R.string.episode
        } else {
            resultFragmentPhimHD = `this$0`
            i2 = R.string.episodes
        }
        sb.append(resultFragmentPhimHD.getString(i2))
        textView2.setText(sb.toString())
    }
}