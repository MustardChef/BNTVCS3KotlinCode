package com.lagradost.cloudstream3.p041ui.result

import android.content.Context
import com.lagradost.cloudstream3.p041ui.settings.SettingsFragment
import kotlin.jvm.internal.Intrinsics

/* compiled from: ImageAdapter.kt */
@Metadata(
    m108d1 = ["\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\nJ\b\u0010\u0015\u001a\u00020\u0004H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0004H\u0016J\u0018\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0004H\u0016J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0004H\u0016J\u0014\u0010\u001f\u001a\u00020\u00072\u000c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040!R\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000cR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012¨\u0006#"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/result/ImageAdapter;", "Landroidx/recyclerview/widget/RecyclerView\$Adapter;", "Landroidx/recyclerview/widget/RecyclerView\$ViewHolder;", TtmlNode.TAG_LAYOUT, "", "clickCallback", "Lkotlin/Function1;", "", "nextFocusUp", "nextFocusDown", "(ILkotlin/jvm/functions/Function1;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getClickCallback", "()Lkotlin/jvm/functions/Function1;", "images", "", "getLayout", "()I", "getNextFocusDown", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNextFocusUp", "getItemCount", "getItemId", "", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateList", "newList", "", "ImageViewHolder", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.result.ImageAdapter */ /* loaded from: classes4.dex */
class ImageAdapter constructor(
    val layout: Int,
    function1: Function1<Integer?, Unit>?,
    num: Integer?,
    num2: Integer?
) : RecyclerView.Adapter<RecyclerView.ViewHolder?>() {
    private val clickCallback: Function1<Integer?, Unit>?
    private val images: List<Integer>
    private val nextFocusDown: Integer?
    private val nextFocusUp: Integer?

    /* synthetic */   constructor(
        i: Int,
        function1: Function1<*, *>?,
        num: Integer?,
        num2: Integer?,
        i2: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(
        i,
        (if ((i2 and 2) != 0) null else function1)!!,
        if ((i2 and 4) != 0) null else num,
        if ((i2 and 8) != 0) null else num2
    ) {
    }

    fun getClickCallback(): Function1<Integer, Unit>? {
        return clickCallback
    }

    fun getNextFocusUp(): Integer? {
        return nextFocusUp
    }

    fun getNextFocusDown(): Integer? {
        return nextFocusDown
    }

    /* JADX WARN: Multi-variable type inference failed */
    init {
        clickCallback = function1
        nextFocusUp = num
        nextFocusDown = num2
        images = ArrayList()
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public override fun onCreateViewHolder(parent: ViewGroup, i: Int): RecyclerView.ViewHolder {
        Intrinsics.checkNotNullParameter(parent, "parent")
        val inflate: View = LayoutInflater.from(parent.getContext()).inflate(layout, parent, false)
        Intrinsics.checkNotNullExpressionValue(
            inflate,
            "from(parent.context).inf…te(layout, parent, false)"
        )
        return ImageViewHolder(inflate)
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public override fun onBindViewHolder(holder: RecyclerView.ViewHolder, i: Int) {
        Intrinsics.checkNotNullParameter(holder, "holder")
        if (holder is ImageViewHolder) {
            (holder as ImageViewHolder).bind(
                images.get(i).intValue(),
                clickCallback,
                nextFocusUp,
                nextFocusDown
            )
        }
    }

    // androidx.recyclerview.widget.RecyclerView.Adapter
    @get:Override
    val itemCount: Int
        // androidx.recyclerview.widget.RecyclerView.Adapter
        get() {
            return images.size()
        }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public override fun getItemId(i: Int): Long {
        return images.get(i).intValue()
    }

    fun updateList(newList: List<Integer?>) {
        Intrinsics.checkNotNullParameter(newList, "newList")
        val calculateDiff: DiffResult = DiffUtil.calculateDiff(DiffCallback<Any?>(images, newList))
        Intrinsics.checkNotNullExpressionValue(
            calculateDiff,
            "calculateDiff(\n         …mages, newList)\n        )"
        )
        images.clear()
        images.addAll(newList)
        calculateDiff.dispatchUpdatesTo(this)
    }

    /* compiled from: ImageAdapter.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J=\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\u000c\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\r¨\u0006\u000e"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/result/ImageAdapter\$ImageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView\$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "img", "", "clickCallback", "Lkotlin/Function1;", "nextFocusUp", "nextFocusDown", "(ILkotlin/jvm/functions/Function1;Ljava/lang/Integer;Ljava/lang/Integer;)V", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.result.ImageAdapter$ImageViewHolder */ /* loaded from: classes4.dex */
    class ImageViewHolder constructor(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        init {
            Intrinsics.checkNotNullParameter(itemView, "itemView")
        }

        fun bind(i: Int, function1: Function1<Integer?, Unit>?, num: Integer?, num2: Integer?) {
            val view: View = this.itemView
            val imageView: ImageView? = if (view is ImageView) view as ImageView? else null
            if (imageView != null) {
                imageView.setImageResource(i)
                if (num2 != null) {
                    imageView.setNextFocusDownId(num2.intValue())
                }
                if (num != null) {
                    imageView.setNextFocusUpId(num.intValue())
                }
                if (function1 != null) {
                    val companion: SettingsFragment.Companion = SettingsFragment.Companion.Companion
                    val context: Context = imageView.getContext()
                    Intrinsics.checkNotNullExpressionValue(context, "context")
                    if (companion.isTrueTvSettings(context)) {
                        imageView.setClickable(true)
                        imageView.setLongClickable(true)
                        imageView.setFocusable(true)
                        imageView.setFocusableInTouchMode(true)
                    }
                    imageView.setOnClickListener(object : OnClickListener() {
                        // from class: com.lagradost.cloudstream3.ui.result.-$$Lambda$ImageAdapter$ImageViewHolder$ebs6Cv3SXHTbEIKBudES_BJfzXw
                        @Override // android.view.View.OnClickListener
                        fun onClick(view2: View?) {
                            `m8759bind$lambda2$lambda0`(this@Function1, view2)
                        }
                    })
                    imageView.setOnLongClickListener(object : OnLongClickListener() {
                        // from class: com.lagradost.cloudstream3.ui.result.-$$Lambda$ImageAdapter$ImageViewHolder$PpvBnjFpDFV9RWIfAWbau4uhMWw
                        @Override // android.view.View.OnLongClickListener
                        fun onLongClick(view2: View?): Boolean {
                            val `m8760bind$lambda2$lambda1`: Boolean
                            `m8760bind$lambda2$lambda1` =
                                `m8760bind$lambda2$lambda1`(this@Function1, view2)
                            return `m8760bind$lambda2$lambda1`
                        }
                    })
                }
            }
        }

        companion object {
            /* JADX INFO: Access modifiers changed from: private */ /* renamed from: bind$lambda-2$lambda-0  reason: not valid java name */
            fun `m8759bind$lambda2$lambda0`(function1: Function1<*, *>, view: View?) {
                function1.invoke(0)
            }

            /* JADX INFO: Access modifiers changed from: private */ /* renamed from: bind$lambda-2$lambda-1  reason: not valid java name */
            fun `m8760bind$lambda2$lambda1`(function1: Function1<*, *>, view: View?): Boolean {
                function1.invoke(1)
                return true
            }
        }
    }
}