package com.lagradost.cloudstream3.p041ui.search

import android.view.LayoutInflater
import kotlin.jvm.internal.Intrinsics

@Metadata(
    m108d1 = ["\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003!\"#B;\u0012\u000c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\u0010\u000eJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0016J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0015H\u0016J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0015H\u0016J\u0014\u0010\u001e\u001a\u00020\r2\u000c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050 R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/search/SearchAdapter;", "Landroidx/recyclerview/widget/RecyclerView\$Adapter;", "Landroidx/recyclerview/widget/RecyclerView\$ViewHolder;", "cardList", "", "Lcom/lagradost/cloudstream3/SearchResponse;", "resView", "Lcom/lagradost/cloudstream3/ui/AutofitRecyclerView;", "enableLoadmore", "", "clickCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/ui/search/SearchClickCallback;", "", "(Ljava/util/List;Lcom/lagradost/cloudstream3/ui/AutofitRecyclerView;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;)V", "getEnableLoadmore", "()Ljava/lang/Boolean;", "setEnableLoadmore", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateList", "newList", "", "CardViewHolder", "Companion", "FooterViewHolder", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.search.SearchAdapter */ /* loaded from: classes4.dex */
class SearchAdaptor constructor(
    cardList: List<SearchResponse>,
    resView: AutofitRecyclerView,
    bool: Boolean,
    clickCallback: Function1<SearchClickCallback?, Unit>?
) : RecyclerView.Adapter<RecyclerView.ViewHolder?>() {
    private val cardList: List<SearchResponse>
    private val clickCallback: Function1<SearchClickCallback, Unit>?
    var enableLoadmore: Boolean
    private val resView: AutofitRecyclerView

    /* synthetic */   constructor(
        list: List,
        autofitRecyclerView: AutofitRecyclerView,
        bool: Boolean?,
        function1: Function1<*, *>?,
        i: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(list, autofitRecyclerView, (if ((i and 4) != 0) false else bool)!!, function1) {
    }

    /* compiled from: SearchAdaptor.kt */
    @Metadata(
        m108d1 = ["\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/search/SearchAdapter\$Companion;", "", "()V", "TYPE_DATA", "", "TYPE_FOOTER", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.search.SearchAdapter$Companion */ /* loaded from: classes4.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}
    }

    /* JADX WARN: Multi-variable type inference failed */
    init {
        Intrinsics.checkNotNullParameter(cardList, "cardList")
        Intrinsics.checkNotNullParameter(resView, "resView")
        Intrinsics.checkNotNullParameter(clickCallback, "clickCallback")
        this.cardList = cardList
        this.resView = resView
        enableLoadmore = bool
        this.clickCallback = clickCallback
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public override fun getItemViewType(i: Int): Int {
        return if ((i == itemCount - 1 && Intrinsics.areEqual(
                enableLoadmore as Object?,
                true as Object?
            ))
        ) 2 else 1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public override fun onCreateViewHolder(parent: ViewGroup, i: Int): RecyclerView.ViewHolder {
        Intrinsics.checkNotNullParameter(parent, "parent")
        if (i == 1) {
            val inflate: View = LayoutInflater.from(parent.getContext()).inflate(
                if (UIHelper.INSTANCE.IsBottomLayout(parent.getContext())) R.layout.search_result_grid_expanded else R.layout.search_result_grid,
                parent,
                false
            )
            Intrinsics.checkNotNullExpressionValue(
                inflate,
                "from(parent.context).inf…te(layout, parent, false)"
            )
            return CardViewHolder(inflate, clickCallback, resView)
        } else if (i == 2) {
            val inflate2: View =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.loadmore, parent, false)
            Intrinsics.checkNotNullExpressionValue(
                inflate2,
                "from(parent.context).inf…ut.loadmore,parent,false)"
            )
            return FooterViewHolder(inflate2)
        } else {
            val inflate3: View =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.loadmore, parent, false)
            Intrinsics.checkNotNullExpressionValue(
                inflate3,
                "from(parent.context).inf…ut.loadmore,parent,false)"
            )
            return FooterViewHolder(inflate3)
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public override fun onBindViewHolder(holder: RecyclerView.ViewHolder, i: Int) {
        Intrinsics.checkNotNullParameter(holder, "holder")
        if (holder is CardViewHolder) {
            (holder as CardViewHolder).bind(
                cardList.get(i), i
            )
        }
    }

    // androidx.recyclerview.widget.RecyclerView.Adapter
    @get:Override
    val itemCount: Int
        // androidx.recyclerview.widget.RecyclerView.Adapter
        get() {
            if (Intrinsics.areEqual(enableLoadmore as Object?, true as Object?)) {
                return cardList.size() + 1
            }
            return cardList.size()
        }

    fun updateList(newList: List<SearchResponse>) {
        Intrinsics.checkNotNullParameter(newList, "newList")
        val calculateDiff: DiffResult = DiffUtil.calculateDiff(
            SearchResponseDiffCallback(
                cardList, newList
            )
        )
        Intrinsics.checkNotNullExpressionValue(
            calculateDiff,
            "calculateDiff(\n         …dList, newList)\n        )"
        )
        cardList.clear()
        cardList.addAll(newList)
        calculateDiff.dispatchUpdatesTo(this)
    }

    /* compiled from: SearchAdaptor.kt */
    @Metadata(
        m108d1 = ["\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0012R\u0011\u0010\u000b\u001a\u00020\u000c¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/search/SearchAdapter\$CardViewHolder;", "Landroidx/recyclerview/widget/RecyclerView\$ViewHolder;", "itemView", "Landroid/view/View;", "clickCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/ui/search/SearchClickCallback;", "", "resView", "Lcom/lagradost/cloudstream3/ui/AutofitRecyclerView;", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;Lcom/lagradost/cloudstream3/ui/AutofitRecyclerView;)V", "cardView", "Landroid/widget/ImageView;", "getCardView", "()Landroid/widget/ImageView;", "compactView", "", "coverHeight", "", "bind", "card", "Lcom/lagradost/cloudstream3/SearchResponse;", "position", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.search.SearchAdapter$CardViewHolder */ /* loaded from: classes4.dex */
    class CardViewHolder constructor(
        itemView: View,
        clickCallback: Function1<SearchClickCallback, Unit>?,
        resView: AutofitRecyclerView
    ) : RecyclerView.ViewHolder(itemView) {
        private val cardView: ImageView
        private val clickCallback: Function1<SearchClickCallback, Unit>?
        private val compactView: Boolean = false
        private val coverHeight: Int
        private val resView: AutofitRecyclerView

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
        init {
            Intrinsics.checkNotNullParameter(itemView, "itemView")
            Intrinsics.checkNotNullParameter(clickCallback, "clickCallback")
            Intrinsics.checkNotNullParameter(resView, "resView")
            this.clickCallback = clickCallback
            this.resView = resView
            val imageView: ImageView = itemView.findViewById(C4761R.C4764id.imageView) as ImageView
            Intrinsics.checkNotNullExpressionValue(imageView, "itemView.imageView")
            cardView = imageView
            coverHeight =
                if (compactView) UIHelper.INSTANCE.getToPx(80) else MathKt.roundToInt(resView.getItemWidth() / 0.68)
        }

        fun getCardView(): ImageView {
            return cardView
        }

        fun bind(card: SearchResponse?, i: Int) {
            Intrinsics.checkNotNullParameter(card, "card")
            if (!compactView) {
                cardView.setLayoutParams(
                    LayoutParams(
                        -1, if (card is LiveTvSearchResponse) MathKt.roundToInt(
                            resView.getItemWidth() / 1.7
                        ) else coverHeight
                    )
                )
            }
            val searchResultBuilder: SearchResultBuilder = SearchResultBuilder.Companion.INSTANCE
            val function1: Function1<SearchClickCallback, Unit>? = clickCallback
            val itemView: View = this.itemView
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView")
            searchResultBuilder.bind(
                function1,
                card,
                i,
                itemView,
                if ((r18 and 16) !== 0) null else null,
                if ((r18 and 32) !== 0) null else null,
                if ((r18 and 64) !== 0) null else null
            )
        }
    }

    /* compiled from: SearchAdaptor.kt */
    @Metadata(
        m108d1 = ["\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/search/SearchAdapter\$FooterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView\$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.search.SearchAdapter$FooterViewHolder */ /* loaded from: classes4.dex */
    class FooterViewHolder constructor(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        init {
            Intrinsics.checkNotNullParameter(itemView, "itemView")
        }
    }

    companion object {
        val Companion: Companion = Companion(null)
        val TYPE_DATA: Int = 1
        val TYPE_FOOTER: Int = 2
    }
}