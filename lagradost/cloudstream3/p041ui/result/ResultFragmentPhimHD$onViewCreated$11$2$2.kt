package com.lagradost.cloudstream3.p041ui.result

import android.view.MenuItem
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: ResultFragmentPhimHD.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "", "Landroid/view/MenuItem;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD$onViewCreated$11$2$2 */ /* loaded from: classes4.dex */
class `ResultFragmentPhimHD$onViewCreated$11$2$2`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(  /* synthetic */
    val `this$0`: ResultFragmentPhimHD
) : Lambda<Any?>(1), Function1<MenuItem, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(menuItem: MenuItem) {
        invoke2(menuItem)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(popupMenuNoIconsAndNoStringRes: MenuItem) {
        var resultViewModel: ResultViewModel?
        Intrinsics.checkNotNullParameter(
            popupMenuNoIconsAndNoStringRes,
            "\$this\$popupMenuNoIconsAndNoStringRes"
        )
        val itemId: Int = popupMenuNoIconsAndNoStringRes.getItemId()
        resultViewModel = `this$0`.viewModel
        if (resultViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel")
            resultViewModel = null
        }
        resultViewModel!!.changeSeason(if (itemId != -2) Integer.valueOf(itemId) else null)
    }
}