package com.lagradost.cloudstream3.p041ui.home

import java.util.List
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: HomeFragment.kt */
@Metadata(
    m108d1 = ["\u0000\u001a\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H\n¢\u0006\u0002\b\u0007"],
    m107d2 = ["<anonymous>", "", "it", "Lkotlin/Pair;", "", "", "Lcom/lagradost/cloudstream3/TvType;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.home.HomeFragment$onViewCreated$3$1$1 */ /* loaded from: classes3.dex */
class `HomeFragment$onViewCreated$3$1$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(  /* synthetic */
    val `this$0`: HomeFragment
) : Lambda<Any?>(1), Function1<Tuples<out Integer?, out List<TvType?>?>, CharSequence> {
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(it: Tuples<Integer?, out List<TvType?>?>): CharSequence {
        Intrinsics.checkNotNullParameter(it, "it")
        val string: String = `this$0`.getString(it.getFirst().intValue())
        Intrinsics.checkNotNullExpressionValue(string, "getString(it.first)")
        return string
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(tuples: Tuples<out Integer?, out List<TvType?>?>): CharSequence {
        return invoke2(tuples as Tuples<Integer?, out List<TvType?>?>)
    }
}