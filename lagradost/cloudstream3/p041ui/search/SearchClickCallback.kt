package com.lagradost.cloudstream3.p041ui.search

import android.view.View
import kotlin.jvm.internal.Intrinsics

/* compiled from: SearchAdaptor.kt */
@Metadata(
    m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/search/SearchClickCallback;", "", "action", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "position", "card", "Lcom/lagradost/cloudstream3/SearchResponse;", "(ILandroid/view/View;ILcom/lagradost/cloudstream3/SearchResponse;)V", "getAction", "()I", "getCard", "()Lcom/lagradost/cloudstream3/SearchResponse;", "getPosition", "getView", "()Landroid/view/View;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.search.SearchClickCallback */ /* loaded from: classes4.dex */
class SearchClickCallback constructor(i: Int, view: View?, i2: Int, card: SearchResponse?) {
    val action: Int
    private val card: SearchResponse?
    val position: Int
    private val view: View?

    init {
        Intrinsics.checkNotNullParameter(view, "view")
        Intrinsics.checkNotNullParameter(card, "card")
        action = i
        this.view = view
        position = i2
        this.card = card
    }

    fun getCard(): SearchResponse? {
        return card
    }

    fun getView(): View? {
        return view
    }
}