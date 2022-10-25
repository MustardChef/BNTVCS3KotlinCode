package com.lagradost.cloudstream3.p041ui.search

import android.view.LayoutInflater
import kotlin.jvm.internal.Intrinsics

/* compiled from: SearchHistoryAdaptor.kt */
@Metadata(
    m108d1 = ["\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B'\u0012\u000c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u000cH\u0016J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000cH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000cH\u0016J\u0014\u0010\u0014\u001a\u00020\t2\u000c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/search/SearchHistoryAdaptor;", "Landroidx/recyclerview/widget/RecyclerView\$Adapter;", "Landroidx/recyclerview/widget/RecyclerView\$ViewHolder;", "cardList", "", "Lcom/lagradost/cloudstream3/ui/search/SearchHistoryItem;", "clickCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/ui/search/SearchHistoryCallback;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateList", "newList", "", "CardViewHolder", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.search.SearchHistoryAdaptor */ /* loaded from: classes4.dex */
class SearchHistoryAdaptor constructor(
    cardList: List<SearchHistoryItem>,
    clickCallback: Function1<SearchHistoryCallback?, Unit>
) : RecyclerView.Adapter<RecyclerView.ViewHolder?>() {
    private val cardList: List<SearchHistoryItem>
    private val clickCallback: Function1<SearchHistoryCallback, Unit>

    /* JADX WARN: Multi-variable type inference failed */
    init {
        Intrinsics.checkNotNullParameter(cardList, "cardList")
        Intrinsics.checkNotNullParameter(clickCallback, "clickCallback")
        this.cardList = cardList
        this.clickCallback = clickCallback
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public override fun onCreateViewHolder(parent: ViewGroup, i: Int): RecyclerView.ViewHolder {
        Intrinsics.checkNotNullParameter(parent, "parent")
        val inflate: View = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.search_history_item, parent, false)
        Intrinsics.checkNotNullExpressionValue(
            inflate,
            "from(parent.context)\n   …tory_item, parent, false)"
        )
        return CardViewHolder(inflate, clickCallback)
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public override fun onBindViewHolder(holder: RecyclerView.ViewHolder, i: Int) {
        Intrinsics.checkNotNullParameter(holder, "holder")
        if (holder is CardViewHolder) {
            (holder as CardViewHolder).bind(
                cardList.get(i)
            )
        }
    }

    // androidx.recyclerview.widget.RecyclerView.Adapter
    @get:Override
    val itemCount: Int
        // androidx.recyclerview.widget.RecyclerView.Adapter
        get() {
            return cardList.size()
        }

    fun updateList(newList: List<SearchHistoryItem>) {
        Intrinsics.checkNotNullParameter(newList, "newList")
        val calculateDiff: DiffResult =
            DiffUtil.calculateDiff(SearchHistoryDiffCallback(cardList, newList))
        Intrinsics.checkNotNullExpressionValue(
            calculateDiff,
            "calculateDiff(\n         …dList, newList)\n        )"
        )
        cardList.clear()
        cardList.addAll(newList)
        calculateDiff.dispatchUpdatesTo(this)
    }

    /* compiled from: SearchHistoryAdaptor.kt */
    @Metadata(
        m108d1 = ["\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/search/SearchHistoryAdaptor\$CardViewHolder;", "Landroidx/recyclerview/widget/RecyclerView\$ViewHolder;", "itemView", "Landroid/view/View;", "clickCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/ui/search/SearchHistoryCallback;", "", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "openButton", "removeButton", "Landroid/widget/ImageView;", "title", "Landroid/widget/TextView;", "bind", "card", "Lcom/lagradost/cloudstream3/ui/search/SearchHistoryItem;", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.search.SearchHistoryAdaptor$CardViewHolder */ /* loaded from: classes4.dex */
    class CardViewHolder constructor(
        itemView: View,
        clickCallback: Function1<SearchHistoryCallback, Unit>
    ) : RecyclerView.ViewHolder(itemView) {
        private val clickCallback: Function1<SearchHistoryCallback, Unit>
        private val openButton: View
        private val removeButton: ImageView
        private val title: TextView

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
        init {
            Intrinsics.checkNotNullParameter(itemView, "itemView")
            Intrinsics.checkNotNullParameter(clickCallback, "clickCallback")
            this.clickCallback = clickCallback
            val imageView: ImageView =
                itemView.findViewById(C4761R.C4764id.home_history_remove) as ImageView
            Intrinsics.checkNotNullExpressionValue(imageView, "itemView.home_history_remove")
            removeButton = imageView
            val constraintLayout: ConstraintLayout =
                itemView.findViewById(C4761R.C4764id.home_history_tab) as ConstraintLayout
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "itemView.home_history_tab")
            openButton = constraintLayout
            val textView: TextView =
                itemView.findViewById(C4761R.C4764id.home_history_title) as TextView
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.home_history_title")
            title = textView
        }

        fun bind(card: SearchHistoryItem) {
            Intrinsics.checkNotNullParameter(card, "card")
            title.setText(card.getSearchText())
            removeButton.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.search.-$$Lambda$SearchHistoryAdaptor$CardViewHolder$zFLdOz9rzEl2nmhZVNZHBcmW0tE
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    `m8883bind$lambda0`(this@CardViewHolder, card, view)
                }
            })
            openButton.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.search.-$$Lambda$SearchHistoryAdaptor$CardViewHolder$HECp3_9NeojQa2OmMek2yljRAuI
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    `m8884bind$lambda1`(this@CardViewHolder, card, view)
                }
            })
        }

        companion object {
            /* JADX INFO: Access modifiers changed from: private */ /* renamed from: bind$lambda-0  reason: not valid java name */
            fun `m8883bind$lambda0`(
                `this$0`: CardViewHolder,
                card: SearchHistoryItem,
                view: View?
            ) {
                Intrinsics.checkNotNullParameter(`this$0`, "this$0")
                Intrinsics.checkNotNullParameter(card, "\$card")
                `this$0`.clickCallback.invoke(SearchHistoryCallback(card, 1))
            }

            /* JADX INFO: Access modifiers changed from: private */ /* renamed from: bind$lambda-1  reason: not valid java name */
            fun `m8884bind$lambda1`(
                `this$0`: CardViewHolder,
                card: SearchHistoryItem,
                view: View?
            ) {
                Intrinsics.checkNotNullParameter(`this$0`, "this$0")
                Intrinsics.checkNotNullParameter(card, "\$card")
                `this$0`.clickCallback.invoke(SearchHistoryCallback(card, 0))
            }
        }
    }
}