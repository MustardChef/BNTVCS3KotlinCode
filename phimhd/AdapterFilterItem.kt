package com.phimhd

import android.os.Handler
import kotlin.jvm.internal.Intrinsics

/* compiled from: AdapterFilterItem.kt */
@Metadata(
    m108d1 = ["\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B!\u0012\u000c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000c¨\u0006\u0019"],
    m107d2 = ["Lcom/phimhd/AdapterFilterItem;", "Landroidx/recyclerview/widget/RecyclerView\$Adapter;", "Lcom/phimhd/AdapterFilterItem\$ViewHolder;", "list", "", "Lcom/lagradost/cloudstream3/Page;", "iCallback", "Lcom/lagradost/cloudstream3/ui/browser/ICallback;", "(Ljava/util/List;Lcom/lagradost/cloudstream3/ui/browser/ICallback;)V", "getICallback", "()Lcom/lagradost/cloudstream3/ui/browser/ICallback;", "getList", "()Ljava/util/List;", "clearSelected", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class AdapterFilterItem(list: List<Page>, iCallback: ICallback<Page?>) :
    RecyclerView.Adapter<ViewHolder?>() {
    private val iCallback: ICallback<Page>
    private val list: List<Page>
    fun getICallback(): ICallback<Page> {
        return iCallback
    }

    fun getList(): List<Page> {
        return list
    }

    init {
        Intrinsics.checkNotNullParameter(list, "list")
        Intrinsics.checkNotNullParameter(iCallback, "iCallback")
        this.list = list
        this.iCallback = iCallback
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    override fun onCreateViewHolder(parent: ViewGroup, i: Int): ViewHolder {
        Intrinsics.checkNotNullParameter(parent, "parent")
        val inflate: View = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.filter_item_layout, parent, false)
        Intrinsics.checkNotNullExpressionValue(
            inflate,
            "from(parent.context).inf…em_layout, parent, false)"
        )
        return ViewHolder(inflate)
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    fun onBindViewHolder(holder: ViewHolder, i: Int) {
        Intrinsics.checkNotNullParameter(holder, "holder")
        val page: Page = list[i]
        val layoutParams: ViewGroup.LayoutParams = holder.itemView.getLayoutParams()
        Objects.requireNonNull(
            layoutParams,
            "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams"
        )
        val layoutParams2: RecyclerView.LayoutParams = layoutParams as RecyclerView.LayoutParams
        if (i == 0) {
            layoutParams2.setMargins(
                0,
                holder.itemView.getContext().getResources()
                    .getDimensionPixelSize(R.dimen.margin_top_filter_blur),
                0,
                0
            )
        } else if (i == itemCount - 1) {
            layoutParams2.setMargins(
                0,
                0,
                0,
                holder.itemView.getContext().getResources()
                    .getDimensionPixelSize(R.dimen.margin_bottom_filter_blur)
            )
        } else {
            layoutParams2.setMargins(0, 0, 0, 0)
        }
        holder.itemView.setLayoutParams(layoutParams2)
        if (page.isSelected) {
            val tvName: TextView = holder.getTvName()
            if (tvName != null) {
                tvName.setTextSize(22.0f)
            }
            val tvName2: TextView = holder.getTvName()
            if (tvName2 != null) {
                tvName2.setTextColor(
                    ContextCompat.getColor(
                        holder.itemView.getContext(),
                        R.color.white
                    )
                )
            }
            val tvName3: TextView = holder.getTvName()
            if (tvName3 != null) {
                val tvName4: TextView = holder.getTvName()
                tvName3.setTypeface(if (tvName4 != null) tvName4.getTypeface() else null, 1)
            }
        } else {
            val tvName5: TextView = holder.getTvName()
            if (tvName5 != null) {
                tvName5.setTextSize(16.0f)
            }
            val tvName6: TextView = holder.getTvName()
            if (tvName6 != null) {
                tvName6.setTextColor(
                    ContextCompat.getColor(
                        holder.itemView.getContext(),
                        R.color.white_90
                    )
                )
            }
            val tvName7: TextView = holder.getTvName()
            if (tvName7 != null) {
                val tvName8: TextView = holder.getTvName()
                tvName7.setTypeface(if (tvName8 != null) tvName8.getTypeface() else null, 0)
            }
        }
        if (page.description != null) {
            val tvDes: TextView = holder.getTvDes()
            if (tvDes != null) {
                tvDes.setText(page.description)
            }
            val tvDes2: TextView = holder.getTvDes()
            if (tvDes2 != null) {
                tvDes2.setVisibility(0)
            }
        } else {
            val tvDes3: TextView = holder.getTvDes()
            if (tvDes3 != null) {
                tvDes3.setVisibility(8)
            }
        }
        val tvName9: TextView = holder.getTvName()
        if (tvName9 != null) {
            tvName9.setText(page.name)
        }
        holder.itemView.setOnClickListener(object : OnClickListener() {
            // from class: com.phimhd.-$$Lambda$AdapterFilterItem$CJ1WVOX-iDBpfVB-LZKrTMB4H0U
            @Override // android.view.View.OnClickListener
            fun onClick(view: View?) {
                `m9029onBindViewHolder$lambda1`(this@AdapterFilterItem, page, i, view)
            }
        })
    }

    private fun clearSelected() {
        val size: Int = list.size()
        for (i in 0 until size) {
            val page: Page = list[i]
            if (page.isSelected) {
                page.isSelected = false
                notifyItemChanged(i)
            }
        }
    }

    // androidx.recyclerview.widget.RecyclerView.Adapter
    @get:Override
    val itemCount: Int
        // androidx.recyclerview.widget.RecyclerView.Adapter
        get() {
            val list: List<Page> = list
            return list?.size() ?: 0
        }

    /* compiled from: AdapterFilterItem.kt */
    @Metadata(
        m108d1 = ["\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000c\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u000e"],
        m107d2 = ["Lcom/phimhd/AdapterFilterItem\$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView\$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "tvDes", "Landroid/widget/TextView;", "getTvDes", "()Landroid/widget/TextView;", "setTvDes", "(Landroid/widget/TextView;)V", "tvName", "getTvName", "setTvName", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var tvDes: TextView
        private var tvName: TextView

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        init {
            Intrinsics.checkNotNullParameter(itemView, "itemView")
            tvName = itemView.findViewById(R.id.tvName) as TextView
            tvDes = itemView.findViewById(R.id.tvDes) as TextView
        }

        fun getTvName(): TextView {
            return tvName
        }

        fun setTvName(textView: TextView) {
            tvName = textView
        }

        fun getTvDes(): TextView {
            return tvDes
        }

        fun setTvDes(textView: TextView) {
            tvDes = textView
        }
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onBindViewHolder$lambda-1  reason: not valid java name */
        fun `m9029onBindViewHolder$lambda1`(
            `this$0`: AdapterFilterItem,
            item: Page,
            i: Int,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(item, "\$item")
            `this$0`.clearSelected()
            item.isSelected = true
            `this$0`.notifyItemChanged(i)
            Handler().postDelayed(object : Runnable() {
                // from class: com.phimhd.-$$Lambda$AdapterFilterItem$e5NOxep_RrYy0ONrnOqCsB_7YqY
                @Override // java.lang.Runnable
                fun run() {
                    `m9030onBindViewHolder$lambda1$lambda0`(this@AdapterFilterItem, item)
                }
            }, 300L)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onBindViewHolder$lambda-1$lambda-0  reason: not valid java name */
        fun `m9030onBindViewHolder$lambda1$lambda0`(`this$0`: AdapterFilterItem, item: Page?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(item, "\$item")
            `this$0`.iCallback.onCallback(item)
        }
    }
}