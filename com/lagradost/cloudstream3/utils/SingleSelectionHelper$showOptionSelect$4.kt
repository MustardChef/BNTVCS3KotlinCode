package com.lagradost.cloudstream3.utils

import android.view.MenuItem
import kotlin.jvm.internal.Intrinsics

/* compiled from: SingleSelectionHelper.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "", "Landroid/view/MenuItem;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes4.dex */
internal class `SingleSelectionHelper$showOptionSelect$4`(function1: Function1<Tuples<Boolean?, Integer?>?, Unit>) :
    Lambda<Any?>(1), Function1<MenuItem, Unit> {
    /* synthetic */ val `$callback`: Function1<Tuples<Boolean?, Integer?>, Unit>

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$callback` = function1
    }

    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override fun invoke(menuItem: MenuItem) {
        invoke2(menuItem)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(popupMenuNoIconsAndNoStringRes: MenuItem) {
        Intrinsics.checkNotNullParameter(
            popupMenuNoIconsAndNoStringRes,
            "\$this\$popupMenuNoIconsAndNoStringRes"
        )
        `$callback`.invoke(
            Tuples<A, B>(
                false,
                Integer.valueOf(popupMenuNoIconsAndNoStringRes.getItemId())
            )
        )
    }
}