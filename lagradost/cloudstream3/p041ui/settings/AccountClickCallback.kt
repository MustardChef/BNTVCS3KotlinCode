package com.lagradost.cloudstream3.p041ui.settings

import android.view.View
import kotlin.jvm.internal.Intrinsics

/* compiled from: AccountAdapter.kt */
@Metadata(
    m108d1 = ["\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/settings/AccountClickCallback;", "", "action", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "card", "Lcom/lagradost/cloudstream3/syncproviders/AuthAPI\$LoginInfo;", "(ILandroid/view/View;Lcom/lagradost/cloudstream3/syncproviders/AuthAPI\$LoginInfo;)V", "getAction", "()I", "getCard", "()Lcom/lagradost/cloudstream3/syncproviders/AuthAPI\$LoginInfo;", "getView", "()Landroid/view/View;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.settings.AccountClickCallback */ /* loaded from: classes4.dex */
class AccountClickCallback constructor(i: Int, view: View, card: LoginInfo) {
    val action: Int
    private val card: LoginInfo
    private val view: View

    init {
        Intrinsics.checkNotNullParameter(view, "view")
        Intrinsics.checkNotNullParameter(card, "card")
        action = i
        this.view = view
        this.card = card
    }

    fun getCard(): LoginInfo {
        return card
    }

    fun getView(): View {
        return view
    }
}