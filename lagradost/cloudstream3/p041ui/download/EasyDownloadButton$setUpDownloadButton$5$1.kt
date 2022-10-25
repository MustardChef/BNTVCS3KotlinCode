package com.lagradost.cloudstream3.p041ui.download

import android.view.MenuItem
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: EasyDownloadButton.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "", "Landroid/view/MenuItem;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.download.EasyDownloadButton$setUpDownloadButton$5$1 */ /* loaded from: classes3.dex */
class `EasyDownloadButton$setUpDownloadButton$5$1` constructor(
    function1: Function1<DownloadClickEvent?, Unit>,
    iMinimumData: IMinimumData?
) : Lambda<Any?>(1), Function1<MenuItem, Unit> {
    /* synthetic */ val `$clickCallback`: Function1<DownloadClickEvent, Unit>
    /* synthetic */ val `$data`: IMinimumData?

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$clickCallback` = function1
        `$data` = iMinimumData
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(menuItem: MenuItem) {
        invoke2(menuItem)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(popupMenuNoIcons: MenuItem) {
        Intrinsics.checkNotNullParameter(popupMenuNoIcons, "\$this\$popupMenuNoIcons")
        `$clickCallback`.invoke(DownloadClickEvent(popupMenuNoIcons.getItemId(), `$data`))
    }
}