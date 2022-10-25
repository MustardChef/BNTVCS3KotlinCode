package com.lagradost.cloudstream3.p041ui.result

import android.content.Context
import kotlin.jvm.functions.Functions
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: ResultFragmentPhimHD.kt */
@Metadata(
    m108d1 = ["\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"],
    m107d2 = ["<anonymous>", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD$setFormatText$1 */ /* loaded from: classes4.dex */
class `ResultFragmentPhimHD$setFormatText$1` constructor(
    obj: Object?,
    textView: TextView?,
    resultFragmentPhimHD: ResultFragmentPhimHD,
    i: Int
) : Lambda<Any?>(0), Functions<Unit> {
    /* synthetic */ val `$arg`: Object?
    /* synthetic */ val `$format`: Int
    /* synthetic */ val `$textView`: TextView?
    /* synthetic */ val `this$0`: ResultFragmentPhimHD

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$arg` = obj
        `$textView` = textView
        `this$0` = resultFragmentPhimHD
        `$format` = i
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */  override fun invoke() {
        invoke2()
        return Unit.INSTANCE
    }

    @Override // kotlin.jvm.functions.Functions
            /* renamed from: invoke  reason: avoid collision after fix types in other method */    fun invoke2() {
        val str: String?
        var string: String?
        if (`$arg` == null) {
            val textView: TextView? = `$textView`
            if (textView == null) {
                return
            }
            textView.setVisibility(8)
            return
        }
        val context: Context? = `this$0`.getContext()
        if (context == null || (context.getString(`$format`).also({ string = it })) == null) {
            str = null
        } else {
            str = String.format(string, Arrays.copyOf(arrayOf<Object?>(`$arg`), 1))
            Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)")
        }
        if (str == null) {
            val textView2: TextView? = `$textView`
            if (textView2 == null) {
                return
            }
            textView2.setVisibility(8)
            return
        }
        val textView3: TextView? = `$textView`
        if (textView3 != null) {
            textView3.setVisibility(0)
        }
        val textView4: TextView? = `$textView`
        if (textView4 == null) {
            return
        }
        textView4.setText(str)
    }
}