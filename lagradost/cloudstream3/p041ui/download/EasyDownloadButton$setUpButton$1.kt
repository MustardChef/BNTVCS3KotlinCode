package com.lagradost.cloudstream3.p041ui.download

import android.widget.ImageView
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: EasyDownloadButton.kt */
@Metadata(
    m108d1 = ["\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"],
    m107d2 = ["<anonymous>", "", "it", "Lkotlin/Pair;", "", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.download.EasyDownloadButton$setUpButton$1 */ /* loaded from: classes3.dex */
class `EasyDownloadButton$setUpButton$1` constructor(imageView: ImageView) : Lambda<Any?>(1),
    Function1<Tuples<out Integer?, out String?>, Unit> {
    /* synthetic */ val `$downloadImage`: ImageView

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$downloadImage` = imageView
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(tuples: Tuples<out Integer?, out String?>) {
        invoke2(tuples as Tuples<Integer?, String?>)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(it: Tuples<Integer?, String?>) {
        Intrinsics.checkNotNullParameter(it, "it")
        `$downloadImage`.setImageResource(it.getFirst().intValue())
    }
}