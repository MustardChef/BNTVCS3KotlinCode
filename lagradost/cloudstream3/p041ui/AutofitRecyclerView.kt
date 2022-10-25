package com.lagradost.cloudstream3.p041ui

import android.content.Context
import kotlin.jvm.internal.Intrinsics

/* compiled from: AutofitRecyclerView.kt */
@Metadata(
    m108d1 = ["\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u000c\"\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000c\"\u0004\b\u0016\u0010\u000eR$\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0011\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/AutofitRecyclerView;", "Lcom/lagradost/cloudstream3/widget/BetterRecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "columnWidth", "", "enableLoadmore", "", "getEnableLoadmore", "()Z", "setEnableLoadmore", "(Z)V", "itemWidth", "getItemWidth", "()I", "manager", "Lcom/lagradost/cloudstream3/ui/GrdLayoutManager;", "noMore", "getNoMore", "setNoMore", "value", "spanCount", "getSpanCount", "setSpanCount", "(I)V", "loadMoreComplete", "", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.AutofitRecyclerView */ /* loaded from: classes.dex */
class AutofitRecyclerView constructor(context: Context, attributeSet: AttributeSet?) :
    BetterRecyclerView(context, attributeSet) {
    var `_$_findViewCache`: Map<Integer, View>
    private var columnWidth: Int
    var enableLoadmore: Boolean = false
    private val manager: GrdLayoutManager
    var noMore: Boolean = false
    var spanCount: Int = 0
        set(i) {
            field = i
            if (i > 0) {
                manager.setSpanCount(i)
            }
        }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    constructor(context: Context) : this(context, null, 2, null) {
        Intrinsics.checkNotNullParameter(context, "context")
    }

    fun `_$_clearFindViewByIdCache`() {
        `_$_findViewCache`.clear()
    }

    fun `_$_findCachedViewById`(i: Int): View? {
        val map: Map<Integer, View> = `_$_findViewCache`
        val view: View? = map.get(Integer.valueOf(i))
        if (view == null) {
            val findViewById: View? = findViewById(i)
            if (findViewById != null) {
                map.put(Integer.valueOf(i), findViewById)
                return findViewById
            }
            return null
        }
        return view
    }

    fun loadMoreComplete() {}

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        Intrinsics.checkNotNullParameter(context, "context")
        `_$_findViewCache` = LinkedHashMap()
        val grdLayoutManager: GrdLayoutManager = GrdLayoutManager(context, 2)
        manager = grdLayoutManager
        columnWidth = -1
        if (attributeSet != null) {
            val obtainStyledAttributes: TypedArray =
                context.obtainStyledAttributes(attributeSet, intArrayOf(16843031))
            Intrinsics.checkNotNullExpressionValue(
                obtainStyledAttributes,
                "context.obtainStyledAttributes(attrs, attrsArray)"
            )
            columnWidth = obtainStyledAttributes.getDimensionPixelSize(0, -1)
            obtainStyledAttributes.recycle()
        }
        setLayoutManager(grdLayoutManager)
        grdLayoutManager.setSpanSizeLookup(object : SpanSizeLookup() {
            // from class: com.lagradost.cloudstream3.ui.AutofitRecyclerView.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public override fun getSpanSize(i: Int): Int {
                val adapter: RecyclerView.Adapter<*>? = this@AutofitRecyclerView.getAdapter()
                var z: Boolean = false
                if (adapter != null && adapter.getItemCount() == i + 1) {
                    z = true
                }
                if (z && enableLoadmore) {
                    return manager.getSpanCount()
                }
                return 1
            }
        })
    }

    /* synthetic */   constructor(
        context: Context,
        attributeSet: AttributeSet?,
        i: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(context, if ((i and 2) != 0) null else attributeSet) {
    }

    val itemWidth: Int
        get() {
            return getMeasuredWidth() / manager.getSpanCount()
        }
}