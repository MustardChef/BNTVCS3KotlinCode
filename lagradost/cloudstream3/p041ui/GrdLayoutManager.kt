package com.lagradost.cloudstream3.p041ui

import android.content.Context
import kotlin.jvm.internal.Intrinsics

/* compiled from: AutofitRecyclerView.kt */
@Metadata(
    m108d1 = ["\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J.\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00052\n\u0010\u0015\u001a\u00060\u0016R\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u0005H\u0016J*\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001e"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/GrdLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "context", "Landroid/content/Context;", "_spanCount", "", "(Landroid/content/Context;I)V", "getContext", "()Landroid/content/Context;", "calcOffsetToNextView", "direction", "getNextViewPos", "fromPos", "hitBorder", "", "from", TypedValues.CycleType.S_WAVE_OFFSET, "onFocusSearchFailed", "Landroid/view/View;", "focused", "focusDirection", "recycler", "Landroidx/recyclerview/widget/RecyclerView\$Recycler;", "Landroidx/recyclerview/widget/RecyclerView;", ServerProtocol.DIALOG_PARAM_STATE, "Landroidx/recyclerview/widget/RecyclerView\$State;", "onInterceptFocusSearch", "onRequestChildFocus", "parent", "child", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.GrdLayoutManager */ /* loaded from: classes.dex */
class GrdLayoutManager constructor(context: Context, i: Int) : GridLayoutManager(context, i) {
    private val context: Context

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        Intrinsics.checkNotNullParameter(context, "context")
        this.context = context
    }

    fun getContext(): Context {
        return context
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public override fun onFocusSearchFailed(
        focused: View,
        i: Int,
        recycler: Recycler,
        state: RecyclerView.State
    ): View {
        Intrinsics.checkNotNullParameter(focused, "focused")
        Intrinsics.checkNotNullParameter(recycler, "recycler")
        Intrinsics.checkNotNullParameter(state, "state")
        try {
            return findViewByPosition(getNextViewPos(getPosition(focused), i))
        } catch (unused: Exception) {
            return null
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public override fun onRequestChildFocus(
        parent: RecyclerView,
        state: RecyclerView.State,
        child: View,
        view: View
    ): Boolean {
        Intrinsics.checkNotNullParameter(parent, "parent")
        Intrinsics.checkNotNullParameter(state, "state")
        Intrinsics.checkNotNullParameter(child, "child")
        try {
            Intrinsics.checkNotNull(view)
            parent.scrollToPosition(Math.max(0, getPosition(view) - 2))
            return super.onRequestChildFocus(parent, state, child, view)
        } catch (unused: Exception) {
            return false
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public override fun onInterceptFocusSearch(focused: View, i: Int): View {
        Intrinsics.checkNotNullParameter(focused, "focused")
        try {
            return findViewByPosition(getNextViewPos(getPosition(focused), i))
        } catch (unused: Exception) {
            return null
        }
    }

    private fun getNextViewPos(i: Int, i2: Int): Int {
        val calcOffsetToNextView: Int = calcOffsetToNextView(i2)
        return if (hitBorder(i, calcOffsetToNextView)) i else i + calcOffsetToNextView
    }

    private fun calcOffsetToNextView(i: Int): Int {
        val spanCount: Int = getSpanCount()
        val orientation: Int = getOrientation()
        if (orientation == 0) {
            if (i != 17) {
                if (i != 33) {
                    return if (i != 66) if (i != 130) 0 else 1 else spanCount
                }
                return -1
            }
            return -spanCount
        } else if (orientation != 1) {
            return 0
        } else {
            if (i != 17) {
                if (i != 33) {
                    if (i != 66) {
                        if (i != 130) {
                            return 0
                        }
                        return spanCount
                    }
                    return 1
                }
                return -spanCount
            }
            return -1
        }
    }

    private fun hitBorder(i: Int, i2: Int): Boolean {
        val spanCount: Int = getSpanCount()
        if (Math.abs(i2) === 1) {
            val i3: Int = (i % spanCount) + i2
            if (i3 >= 0 && i3 < spanCount) {
                return false
            }
        } else {
            val i4: Int = i + i2
            if (spanCount > i4 || i4 >= 0) {
                return false
            }
        }
        return true
    }
}