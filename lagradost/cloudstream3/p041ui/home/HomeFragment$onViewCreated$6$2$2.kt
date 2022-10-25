package com.lagradost.cloudstream3.p041ui.home

import android.content.Intent
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: HomeFragment.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "", "Landroid/view/MenuItem;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.home.HomeFragment$onViewCreated$6$2$2 */ /* loaded from: classes3.dex */
class `HomeFragment$onViewCreated$6$2$2` constructor(
    list: List<MainAPI>,
    homeFragment: HomeFragment
) : Lambda<Any?>(1), Function1<MenuItem, Unit> {
    /* synthetic */ val `$validAPIs`: List<MainAPI>
    /* synthetic */ val `this$0`: HomeFragment

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$validAPIs` = list
        `this$0` = homeFragment
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(menuItem: MenuItem) {
        invoke2(menuItem)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(popupMenuNoIconsAndNoStringRes: MenuItem) {
        Intrinsics.checkNotNullParameter(
            popupMenuNoIconsAndNoStringRes,
            "\$this\$popupMenuNoIconsAndNoStringRes"
        )
        try {
            val intent: Intent = Intent("android.intent.action.VIEW")
            intent.setData(
                Uri.parse(
                    `$validAPIs`.get(popupMenuNoIconsAndNoStringRes.getItemId()).getMainUrl()
                )
            )
            `this$0`.startActivity(intent)
        } catch (e: Exception) {
            ArchComponentExt.logError(e)
        }
    }
}