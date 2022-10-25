package com.lagradost.cloudstream3.widget

import android.content.Context
import kotlin.jvm.internal.Intrinsics

/* compiled from: FlowLayout.kt */
@Metadata(
    m108d1 = ["\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001 B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0011\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J0\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0014J\u0018\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nH\u0014R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u000c\"\u0004\b\r\u0010\u000e¨\u0006!"],
    m107d2 = ["Lcom/lagradost/cloudstream3/widget/FlowLayout;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "c", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "itemSpacing", "", "getItemSpacing", "()I", "setItemSpacing", "(I)V", "checkLayoutParams", "", TtmlNode.TAG_P, "Landroid/view/ViewGroup\$LayoutParams;", "generateDefaultLayoutParams", "Lcom/lagradost/cloudstream3/widget/FlowLayout\$LayoutParams;", "generateLayoutParams", "onLayout", "", "b", "left", ViewHierarchyConstants.DIMENSION_TOP_KEY, TtmlNode.RIGHT, "bottom", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "LayoutParams", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class FlowLayout : ViewGroup {
    var `_$_findViewCache`: Map<Integer, View>
    var itemSpacing = 0
    fun `_$_clearFindViewByIdCache`() {
        `_$_findViewCache`.clear()
    }

    fun `_$_findCachedViewById`(i: Int): View? {
        val map: Map<Integer, View> = `_$_findViewCache`
        val view: View? = map[Integer.valueOf(i)]
        if (view == null) {
            val findViewById: View = findViewById(i)
            if (findViewById != null) {
                map.put(Integer.valueOf(i), findViewById)
                return findViewById
            }
            return null
        }
        return view
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    constructor(context: Context?) : super(context) {
        `_$_findViewCache` = LinkedHashMap()
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    constructor(c: Context, attributeSet: AttributeSet?) : super(c, attributeSet) {
        Intrinsics.checkNotNullParameter(c, "c")
        `_$_findViewCache` = LinkedHashMap()
        val obtainStyledAttributes: TypedArray =
            c.obtainStyledAttributes(attributeSet, C4761R.styleable.FlowLayout_Layout)
        Intrinsics.checkNotNullExpressionValue(
            obtainStyledAttributes,
            "c.obtainStyledAttributes…leable.FlowLayout_Layout)"
        )
        itemSpacing = obtainStyledAttributes.getDimensionPixelSize(0, 0)
        obtainStyledAttributes.recycle()
    }

    @Override // android.view.View
    protected fun onMeasure(i: Int, i2: Int) {
        val size: Int = View.MeasureSpec.getSize(i)
        val childCount: Int = getChildCount()
        var i3 = 0
        var i4 = 0
        var i5 = 0
        var i6 = 0
        var i7 = 0
        while (i3 < childCount) {
            val child: View = getChildAt(i3)
            measureChild(child, i, i2)
            val measuredWidth: Int = child.getMeasuredWidth()
            val measuredHeight: Int = child.getMeasuredHeight()
            val i8 = i4 + measuredWidth
            Intrinsics.checkNotNullExpressionValue(child, "child")
            val layoutParams: ViewGroup.LayoutParams = child.getLayoutParams()
            if (i8 - if (layoutParams is ViewGroup.MarginLayoutParams) MarginLayoutParamsCompat.getMarginEnd(
                    layoutParams as ViewGroup.MarginLayoutParams
                ) else 0 - child.getPaddingEnd() - itemSpacing > size
            ) {
                i5 = Math.max(i5, i4)
                i7 += measuredHeight
                i4 = 0
            }
            val i9 = i4 + measuredWidth
            val i10 = if (measuredWidth == 0) 0 else itemSpacing
            i6 = Math.max(i6, measuredHeight + i7)
            val layoutParams2: ViewGroup.LayoutParams = child.getLayoutParams()
            Objects.requireNonNull(
                layoutParams2,
                "null cannot be cast to non-null type com.lagradost.cloudstream3.widget.FlowLayout.LayoutParams"
            )
            val layoutParams3 = layoutParams2 as LayoutParams
            layoutParams3.x = i4
            layoutParams3.y = i7
            i3++
            i4 = i9 + i10
        }
        setMeasuredDimension(
            ViewGroup.resolveSize(Math.max(i4, i5), i),
            ViewGroup.resolveSize(i6, i2)
        )
    }

    @Override // android.view.ViewGroup, android.view.View
    protected fun onLayout(z: Boolean, i: Int, i2: Int, i3: Int, i4: Int) {
        val childCount: Int = getChildCount()
        for (i5 in 0 until childCount) {
            val childAt: View = getChildAt(i5)
            val layoutParams: ViewGroup.LayoutParams = childAt.getLayoutParams()
            Objects.requireNonNull(
                layoutParams,
                "null cannot be cast to non-null type com.lagradost.cloudstream3.widget.FlowLayout.LayoutParams"
            )
            val layoutParams2 = layoutParams as LayoutParams
            childAt.layout(
                layoutParams2.x,
                layoutParams2.y,
                layoutParams2.x + childAt.getMeasuredWidth(),
                layoutParams2.y + childAt.getMeasuredHeight()
            )
        }
    }

    @Override // android.view.ViewGroup
    fun generateLayoutParams(attrs: AttributeSet?): LayoutParams {
        Intrinsics.checkNotNullParameter(attrs, "attrs")
        val context: Context = getContext()
        Intrinsics.checkNotNullExpressionValue(context, "context")
        return LayoutParams(context, attrs)
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    fun generateDefaultLayoutParams(): LayoutParams {
        return LayoutParams(-2, -2)
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    fun generateLayoutParams(p: ViewGroup.LayoutParams?): LayoutParams {
        Intrinsics.checkNotNullParameter(p, "p")
        return LayoutParams(p)
    }

    @Override // android.view.ViewGroup
    protected fun checkLayoutParams(p: ViewGroup.LayoutParams?): Boolean {
        Intrinsics.checkNotNullParameter(p, "p")
        return p is LayoutParams
    }

    /* compiled from: FlowLayout.kt */
    @Metadata(
        m108d1 = ["\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0019\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u0017\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nB\u0011\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u000cB\u0011\b\u0010\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013¨\u0006\u001a"],
        m107d2 = ["Lcom/lagradost/cloudstream3/widget/FlowLayout\$LayoutParams;", "Landroid/view/ViewGroup\$MarginLayoutParams;", "c", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "(II)V", "source", "(Landroid/view/ViewGroup\$MarginLayoutParams;)V", "Landroid/view/ViewGroup\$LayoutParams;", "(Landroid/view/ViewGroup\$LayoutParams;)V", "spacing", "getSpacing", "()I", "setSpacing", "(I)V", "x", "getX", "setX", "y", "getY", "setY", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class LayoutParams : ViewGroup.MarginLayoutParams {
        var spacing: Int

        /* renamed from: x */
        var x = 0

        /* renamed from: y */
        var y = 0

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        constructor(c: Context, attributeSet: AttributeSet?) : super(c, attributeSet) {
            Intrinsics.checkNotNullParameter(c, "c")
            spacing = -1
            val obtainStyledAttributes: TypedArray =
                c.obtainStyledAttributes(attributeSet, C4761R.styleable.FlowLayout_Layout)
            Intrinsics.checkNotNullExpressionValue(
                obtainStyledAttributes,
                "c.obtainStyledAttributes…leable.FlowLayout_Layout)"
            )
            spacing = 0
            obtainStyledAttributes.recycle()
        }

        constructor(i: Int, i2: Int) : super(i, i2) {
            spacing = -1
            spacing = 0
        }

        constructor(marginLayoutParams: ViewGroup.MarginLayoutParams?) : super(marginLayoutParams) {
            spacing = -1
        }

        constructor(layoutParams: ViewGroup.LayoutParams?) : super(layoutParams) {
            spacing = -1
        }
    }
}