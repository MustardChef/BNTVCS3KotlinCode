package com.lagradost.cloudstream3.p041ui.download

import android.widget.ImageView
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: EasyDownloadButton.kt */
@Metadata(
    m108d1 = ["\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"],
    m107d2 = ["<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.download.EasyDownloadButton$setUpMoreButton$1 */ /* loaded from: classes3.dex */
class `EasyDownloadButton$setUpMoreButton$1` constructor(
    imageView: ImageView,
    textView: TextView?,
    textView2: TextView?
) : Lambda<Any?>(1), Function1<Tuples<out Integer?, out String?>, Unit> {
    /* synthetic */ val `$downloadImage`: ImageView
    /* synthetic */ val `$textView`: TextView?
    /* synthetic */ val `$textViewProgress`: TextView?

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$downloadImage` = imageView
        `$textViewProgress` = textView
        `$textView` = textView2
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(tuples: Tuples<out Integer?, out String?>) {
        invoke2(tuples as Tuples<Integer?, String?>)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(tuples: Tuples<Integer?, String?>) {
        Intrinsics.checkNotNullParameter(tuples, "<name for destructuring parameter 0>")
        val intValue: Int = tuples.component1().intValue()
        val component2: String? = tuples.component2()
        val imageView: ImageView = `$downloadImage`
        val textView: TextView? = `$textViewProgress`
        var z: Boolean = true
        if (textView != null && textView.getVisibility() !== 8) {
            z = false
        }
        imageView.setVisibility(if (z) 0 else 8)
        `$downloadImage`.setImageResource(intValue)
        val textView2: TextView? = `$textView`
        if (textView2 == null) {
            return
        }
        textView2.setText(component2)
    }
}