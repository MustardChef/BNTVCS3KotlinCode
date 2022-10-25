package com.lagradost.cloudstream3.widget

import android.content.Context
import kotlin.jvm.internal.Intrinsics

/* compiled from: CenterZoomLayoutManager.kt */
@Metadata(
    m108d1 = ["\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B+\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tB\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nB!\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\u000c\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u0019\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0006\u0010\u001c\u001a\u00020\u0011J$\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\n\u0010\u001f\u001a\u00060 R\u00020!2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001a\u0010\"\u001a\u00020\u00112\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110\u0010J+\u0010$\u001a\u00020\u00112\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00072\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\u0010&J\u0010\u0010'\u001a\u00020\u00112\b\b\u0002\u0010(\u001a\u00020\rR\u001c\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082D¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0013R\u001c\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"],
    m107d2 = ["Lcom/lagradost/cloudstream3/widget/CenterZoomLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "(Landroid/content/Context;)V", "orientation", "reverseLayout", "", "(Landroid/content/Context;IZ)V", "itemListener", "Lkotlin/Function1;", "", "lastViewIndex", "Ljava/lang/Integer;", "mShrinkAmount", "", "mShrinkDistance", "snapChild", "waitForSnap", "onLayoutCompleted", ServerProtocol.DIALOG_PARAM_STATE, "Landroidx/recyclerview/widget/RecyclerView\$State;", "removeOnSizeListener", "scrollHorizontallyBy", "dx", "recycler", "Landroidx/recyclerview/widget/RecyclerView\$Recycler;", "Landroidx/recyclerview/widget/RecyclerView;", "setOnSizeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "snap", "callback", "(Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "updateSize", "forceUpdate", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class CenterZoomLayoutManager : LinearLayoutManager {
    private var itemListener: Function1<Integer?, Unit>? = null
    private var lastViewIndex: Integer? = null
    private val mShrinkAmount: Float
    private val mShrinkDistance: Float
    private var snapChild: Integer? = null
    private var waitForSnap: Function1<Integer?, Unit>? = null

    constructor(context: Context?, attributeSet: AttributeSet?, i: Int, i2: Int) : super(
        context,
        attributeSet,
        i,
        i2
    ) {
        mShrinkAmount = 0.15f
        mShrinkDistance = 0.9f
    }

    constructor(context: Context?) : super(context) {
        mShrinkAmount = 0.15f
        mShrinkDistance = 0.9f
    }

    constructor(context: Context?, i: Int, z: Boolean) : super(context, i, z) {
        mShrinkAmount = 0.15f
        mShrinkDistance = 0.9f
    }

    fun updateSize(z: Boolean) {
        var f: Float
        var e: Exception?
        var num: Integer
        val width: Float = getWidth() / 2.0f
        val f2 = mShrinkDistance * width
        val f3 = 1.0f - mShrinkAmount
        val childCount: Int = getChildCount()
        var num2: Integer? = null
        var f4 = 0.0f
        for (i in 0 until childCount) {
            val childAt: View = getChildAt(i)
            if (childAt != null) {
                try {
                    f = (f3 - 1.0f) * (Math.min(
                        f2,
                        Math.abs(width - (getDecoratedRight(childAt) + getDecoratedLeft(childAt)) / 2.0f)
                    ) - 0.0f) / (f2 - 0.0f) + 1.0f
                    childAt.setScaleX(f)
                    childAt.setScaleY(f)
                } catch (e2: Exception) {
                    f = f4
                    e = e2
                }
                if (f > f4 && childAt.getTag() as Integer?. also { num = it } != null) {
                    try {
                        num2 = Integer.valueOf(num.intValue())
                    } catch (e3: Exception) {
                        e = e3
                        ArchComponentExt.logError(e)
                        f4 = f
                    }
                    f4 = f
                }
            }
        }
        if (num2 != null) {
            val intValue: Int = num2.intValue()
            val num3: Integer? = lastViewIndex
            if (num3 == null || num3.intValue() !== intValue || z) {
                lastViewIndex = Integer.valueOf(intValue)
                val function1: Function1<Integer?, Unit>? = itemListener
                function1?.invoke?.invoke()
            }
        }
    }

    fun setOnSizeListener(listener: Function1<Integer?, Unit>?) {
        Intrinsics.checkNotNullParameter(listener, "listener")
        lastViewIndex = null
        itemListener = listener
    }

    fun removeOnSizeListener() {
        itemListener = null
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    override fun onLayoutCompleted(state: RecyclerView.State) {
        var calculateDistanceToFinalSnap: IntArray
        super.onLayoutCompleted(state)
        if (waitForSnap != null) {
            val num: Integer? = snapChild
            val childAt: View = getChildAt(if (num != null) num.intValue() else 1)
            if (childAt != null && LinearSnapHelper().calculateDistanceToFinalSnap(this, childAt)
                    .also { calculateDistanceToFinalSnap = it } != null
            ) {
                val i = calculateDistanceToFinalSnap[0]
                val function1: Function1<Integer?, Unit>? = waitForSnap
                function1?.invoke?.invoke()
                waitForSnap = null
            }
        }
        `updateSize$default`(this, false, 1, null)
    }

    fun snap(num: Integer?, callback: Function1<Integer?, Unit>?) {
        Intrinsics.checkNotNullParameter(callback, "callback")
        waitForSnap = callback
        snapChild = num
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    override fun scrollHorizontallyBy(i: Int, recycler: Recycler, state: RecyclerView.State): Int {
        Intrinsics.checkNotNullParameter(recycler, "recycler")
        Intrinsics.checkNotNullParameter(state, "state")
        if (getOrientation() == 0) {
            val scrollHorizontallyBy: Int = super.scrollHorizontallyBy(i, recycler, state)
            `updateSize$default`(this, false, 1, null)
            return scrollHorizontallyBy
        }
        return 0
    }

    companion object {
        fun  /* synthetic */`updateSize$default`(
            centerZoomLayoutManager: CenterZoomLayoutManager,
            z: Boolean,
            i: Int,
            obj: Object?
        ) {
            var z = z
            if (i and 1 != 0) {
                z = false
            }
            centerZoomLayoutManager.updateSize(z)
        }

        @JvmStatic
        fun  /* synthetic */`snap$default`(
            centerZoomLayoutManager: CenterZoomLayoutManager,
            num: Integer?,
            function1: Function1<*, *>?,
            i: Int,
            obj: Object?
        ) {
            var num: Integer? = num
            if (i and 1 != 0) {
                num = null
            }
            centerZoomLayoutManager.snap(num, function1!!)
        }
    }
}