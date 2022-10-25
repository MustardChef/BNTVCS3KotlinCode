package com.lagradost.cloudstream3.widget

import android.content.Context

/* loaded from: classes4.dex */
open class BetterRecyclerView(context: Context?, attributeSet: AttributeSet?, i: Int) :
    RecyclerView(context, attributeSet, i) {
    private var mInitialTouchX = 0
    private var mInitialTouchY = 0
    private var mScrollPointerId: Int
    private var mTouchSlop: Int

    constructor(context: Context?) : this(context, null) {}
    constructor(context: Context?, attributeSet: AttributeSet?) : this(context, attributeSet, 0) {}

    init {
        mScrollPointerId = -1
        mTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop()
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    override fun setScrollingTouchSlop(i: Int) {
        super.setScrollingTouchSlop(i)
        val viewConfiguration: ViewConfiguration = ViewConfiguration.get(getContext())
        if (i == 0) {
            mTouchSlop = viewConfiguration.getScaledTouchSlop()
        } else if (i != 1) {
        } else {
            mTouchSlop = ViewConfigurationCompat.getScaledPagingTouchSlop(viewConfiguration)
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    override fun onInterceptTouchEvent(motionEvent: MotionEvent): Boolean {
        val actionMasked: Int = MotionEventCompat.getActionMasked(motionEvent)
        val actionIndex: Int = MotionEventCompat.getActionIndex(motionEvent)
        return if (actionMasked == 0) {
            mScrollPointerId = MotionEventCompat.getPointerId(motionEvent, 0)
            mInitialTouchX = (motionEvent.getX() + 0.5f)
            mInitialTouchY = (motionEvent.getY() + 0.5f)
            super.onInterceptTouchEvent(motionEvent)
        } else if (actionMasked != 2) {
            if (actionMasked == 5) {
                mScrollPointerId = MotionEventCompat.getPointerId(motionEvent, actionIndex)
                mInitialTouchX = (MotionEventCompat.getX(motionEvent, actionIndex) + 0.5f).toInt()
                mInitialTouchY = (MotionEventCompat.getY(motionEvent, actionIndex) + 0.5f).toInt()
                return super.onInterceptTouchEvent(motionEvent)
            }
            super.onInterceptTouchEvent(motionEvent)
        } else {
            val findPointerIndex: Int =
                MotionEventCompat.findPointerIndex(motionEvent, mScrollPointerId)
            if (findPointerIndex < 0) {
                return false
            }
            val x: Int = (MotionEventCompat.getX(motionEvent, findPointerIndex) + 0.5f).toInt()
            val y: Int = (MotionEventCompat.getY(motionEvent, findPointerIndex) + 0.5f).toInt()
            if (getScrollState() != 1) {
                val i = x - mInitialTouchX
                val i2 = y - mInitialTouchY
                val canScrollHorizontally: Boolean = getLayoutManager().canScrollHorizontally()
                val canScrollVertically: Boolean = getLayoutManager().canScrollVertically()
                var z =
                    canScrollHorizontally && Math.abs(i) > mTouchSlop && (Math.abs(i) >= Math.abs(
                        i2
                    ) || canScrollVertically)
                if (canScrollVertically && Math.abs(i2) > mTouchSlop && (Math.abs(i2) >= Math.abs(i) || canScrollHorizontally)) {
                    z = true
                }
                return z && super.onInterceptTouchEvent(motionEvent)
            }
            super.onInterceptTouchEvent(motionEvent)
        }
    }

    companion object {
        private const val INVALID_POINTER = -1
    }
}