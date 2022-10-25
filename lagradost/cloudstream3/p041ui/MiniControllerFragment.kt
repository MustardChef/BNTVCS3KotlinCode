package com.lagradost.cloudstream3.p041ui

import android.content.Context
import com.google.android.gms.cast.framework.media.widget.MiniControllerFragment
import kotlin.jvm.internal.Intrinsics

@Metadata(
    m108d1 = ["\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0015"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/MyMiniControllerFragment;", "Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;", "()V", "currentColor", "", "getCurrentColor", "()I", "setCurrentColor", "(I)V", "onInflate", "", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "bundle", "Landroid/os/Bundle;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.MyMiniControllerFragment */ /* loaded from: classes.dex */
class MiniControllerFragment constructor() : MiniControllerFragment() {
    var `_$_findViewCache`: Map<Integer, View> = LinkedHashMap()
    var currentColor: Int = 0
    fun `_$_clearFindViewByIdCache`() {
        `_$_findViewCache`.clear()
    }

    fun `_$_findCachedViewById`(i: Int): View? {
        var findViewById: View?
        val map: Map<Integer, View> = `_$_findViewCache`
        val view: View? = map.get(Integer.valueOf(i))
        if (view == null) {
            val view2: View? = getView()
            if (view2 == null || (view2.findViewById(i).also({ findViewById = it })) == null) {
                return null
            }
            map.put(Integer.valueOf(i), findViewById)
            return findViewById
        }
        return view
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */  override fun onDestroyView() {
        super.onDestroyView()
        `_$_clearFindViewByIdCache`()
    }

    @Override // com.google.android.gms.cast.framework.media.widget.MiniControllerFragment, androidx.fragment.app.Fragment
    public override fun onInflate(context: Context, attributeSet: AttributeSet, bundle: Bundle) {
        Intrinsics.checkNotNullParameter(context, "context")
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet")
        val obtainStyledAttributes: TypedArray =
            context.obtainStyledAttributes(attributeSet, C4761R.styleable.CustomCast, 0, 0)
        Intrinsics.checkNotNullExpressionValue(
            obtainStyledAttributes,
            "context.obtainStyledAttr…yleable.CustomCast, 0, 0)"
        )
        if (obtainStyledAttributes.hasValue(0)) {
            currentColor = obtainStyledAttributes.getColor(0, 0)
        }
        obtainStyledAttributes.recycle()
        super.onInflate(context, attributeSet, bundle)
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onViewCreated(view: View, bundle: Bundle) {
        Intrinsics.checkNotNullParameter(view, "view")
        super.onViewCreated(view, bundle)
        try {
            val progressBar: ProgressBar? = view.findViewById(R.id.progressBar) as ProgressBar?
            val linearLayout: LinearLayout? = view.findViewById(R.id.container_all) as LinearLayout?
            val relativeLayout: RelativeLayout? =
                view.findViewById(R.id.container_current) as RelativeLayout?
            val context: Context? = getContext()
            if (context != null) {
                if (progressBar != null) {
                    progressBar.setBackgroundColor(
                        UIHelper.INSTANCE.adjustAlpha(
                            UIHelper.INSTANCE.colorFromAttribute(
                                context,
                                R.attr.colorPrimary
                            ), 0.35f
                        )
                    )
                }
                val layoutParams: RelativeLayout.LayoutParams =
                    LayoutParams(-1, UIHelper.INSTANCE.getToPx(2))
                if (progressBar != null) {
                    progressBar.setLayoutParams(layoutParams)
                }
                val i: Int = currentColor
                if (i != 0 && relativeLayout != null) {
                    relativeLayout.setBackgroundColor(i)
                }
            }
            val childAt: View? = if (linearLayout != null) linearLayout.getChildAt(0) else null
            if (childAt == null) {
                return
            }
            childAt.setAlpha(0.0f)
        } catch (unused: Exception) {
        }
    }
}