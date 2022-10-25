package com.lagradost.cloudstream3.p041ui.home

import android.app.Activity
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: HomeFragment.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
    m107d2 = ["<anonymous>", "", "callback", "Lcom/lagradost/cloudstream3/ui/search/SearchClickCallback;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.home.HomeFragment$Companion$loadHomepageList$2 */ /* loaded from: classes3.dex */
class `HomeFragment$Companion$loadHomepageList$2` constructor(
    activity: Activity?,
    bottomSheetDialog: BottomSheetDialog
) : Lambda<Any?>(1), Function1<SearchClickCallback, Unit> {
    /* synthetic */ val `$bottomSheetDialogBuilder`: BottomSheetDialog
    /* synthetic */ val `$this_loadHomepageList`: Activity?

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$this_loadHomepageList` = activity
        `$bottomSheetDialogBuilder` = bottomSheetDialog
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(searchClickCallback: SearchClickCallback) {
        invoke2(searchClickCallback)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(callback: SearchClickCallback) {
        Intrinsics.checkNotNullParameter(callback, "callback")
        SearchHelper.Companion.INSTANCE.handleSearchClickCallback(
            `$this_loadHomepageList`,
            callback
        )
        if (callback.getAction() == 0 || callback.getAction() == 2) {
            UIHelper.INSTANCE.dismissSafe(`$bottomSheetDialogBuilder`, `$this_loadHomepageList`)
        }
    }
}