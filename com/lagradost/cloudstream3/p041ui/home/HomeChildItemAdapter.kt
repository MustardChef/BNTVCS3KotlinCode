package com.lagradost.cloudstream3.p041ui.home

import android.view.LayoutInflater
import kotlin.jvm.internal.Intrinsics

/* compiled from: HomeChildItemAdapter.kt */
@Metadata(
    m108d1 = ["\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBK\u0012\u000c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\u0010\u000eJ\b\u0010\u0012\u001a\u00020\u0007H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0007H\u0016J\u0014\u0010\u001c\u001a\u00020\r2\u000c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u001eR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011¨\u0006 "],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/home/HomeChildItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView\$Adapter;", "Landroidx/recyclerview/widget/RecyclerView\$ViewHolder;", "cardList", "", "Lcom/lagradost/cloudstream3/SearchResponse;", "overrideLayout", "", "nextFocusUp", "nextFocusDown", "clickCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/ui/search/SearchClickCallback;", "", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "getCardList", "()Ljava/util/List;", "Ljava/lang/Integer;", "getItemCount", "getItemId", "", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateList", "newList", "", "CardViewHolder", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.home.HomeChildItemAdapter */ /* loaded from: classes3.dex */
class HomeChildItemAdapter constructor(
    cardList: List<SearchResponse>,
    num: Integer?,
    num2: Integer?,
    num3: Integer?,
    clickCallback: Function1<SearchClickCallback, Unit>?
) : RecyclerView.Adapter<RecyclerView.ViewHolder?>() {
    private val cardList: List<SearchResponse>
    private val clickCallback: Function1<SearchClickCallback, Unit>?
    private val nextFocusDown: Integer?
    private val nextFocusUp: Integer?
    private val overrideLayout: Integer?

    /* synthetic */   constructor(
        list: List,
        num: Integer?,
        num2: Integer?,
        num3: Integer?,
        function1: Function1<*, *>?,
        i: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(
        list,
        if ((i and 2) != 0) null else num,
        if ((i and 4) != 0) null else num2,
        if ((i and 8) != 0) null else num3,
        (function1)!!
    ) {
    }

    fun getCardList(): List<SearchResponse> {
        return cardList
    }

    /* JADX WARN: Multi-variable type inference failed */
    init {
        Intrinsics.checkNotNullParameter(cardList, "cardList")
        Intrinsics.checkNotNullParameter(clickCallback, "clickCallback")
        this.cardList = cardList
        overrideLayout = num
        nextFocusUp = num2
        nextFocusDown = num3
        this.clickCallback = clickCallback
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public override fun onCreateViewHolder(parent: ViewGroup, i: Int): RecyclerView.ViewHolder {
        Intrinsics.checkNotNullParameter(parent, "parent")
        val num: Integer? = overrideLayout
        val inflate: View = LayoutInflater.from(parent.getContext()).inflate(
            if (num != null) num.intValue() else if (UIHelper.INSTANCE.IsBottomLayout(parent.getContext())) R.layout.home_result_grid_expanded else R.layout.home_result_grid,
            parent,
            false
        )
        Intrinsics.checkNotNullExpressionValue(
            inflate,
            "from(parent.context).inf…te(layout, parent, false)"
        )
        return CardViewHolder(inflate, clickCallback, itemCount, nextFocusUp, nextFocusDown)
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
            return cardList.size()
        }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public override fun getItemId(i: Int): Long {
        var i: Int = i
        val id: Integer? = cardList.get(i).getId()
        if (id != null) {
            i = id.intValue()
        }
        return i.toLong()
    }

    fun updateList(newList: List<SearchResponse?>?) {
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

    /* compiled from: HomeChildItemAdapter.kt */
    @Metadata(
        m108d1 = ["\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000cJ\u0016\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0012\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0012"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/home/HomeChildItemAdapter\$CardViewHolder;", "Landroidx/recyclerview/widget/RecyclerView\$ViewHolder;", "itemView", "Landroid/view/View;", "clickCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/ui/search/SearchClickCallback;", "", "itemCount", "", "nextFocusUp", "nextFocusDown", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;ILjava/lang/Integer;Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "bind", "card", "Lcom/lagradost/cloudstream3/SearchResponse;", "position", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.home.HomeChildItemAdapter$CardViewHolder */ /* loaded from: classes3.dex */
    class CardViewHolder constructor(
        itemView: View?,
        clickCallback: Function1<SearchClickCallback, Unit>?,
        i: Int,
        num: Integer?,
        num2: Integer?
    ) : RecyclerView.ViewHolder(itemView) {
        private val clickCallback: Function1<SearchClickCallback, Unit>?
        private val itemCount: Int
        private val nextFocusDown: Integer?
        private val nextFocusUp: Integer?

        /* synthetic */   constructor(
            view: View?,
            function1: Function1<*, *>?,
            i: Int,
            num: Integer?,
            num2: Integer?,
            i2: Int,
            defaultConstructorMarker: DefaultConstructorMarker?
        ) : this(
            view,
            (function1)!!,
            i,
            if ((i2 and 8) != 0) null else num,
            if ((i2 and 16) != 0) null else num2
        ) {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
        init {
            Intrinsics.checkNotNullParameter(itemView, "itemView")
            Intrinsics.checkNotNullParameter(clickCallback, "clickCallback")
            this.clickCallback = clickCallback
            itemCount = i
            nextFocusUp = num
            nextFocusDown = num2
        }

        fun bind(card: SearchResponse?, i: Int) {
            val bool: Boolean?
            var cardView: CardView
            Intrinsics.checkNotNullParameter(card, "card")
            if (i == 0) {
                bool = true
            } else {
                bool = if (i == itemCount - 1) false else null
            }
            val bool2: Boolean? = bool
            val searchResultBuilder: SearchResultBuilder = SearchResultBuilder.Companion.INSTANCE
            val function1: Function1<SearchClickCallback, Unit>? = clickCallback
            val itemView: View = this.itemView
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView")
            searchResultBuilder.bind(
                function1,
                card,
                i,
                itemView,
                bool2,
                nextFocusUp,
                nextFocusDown
            )
            itemView.setTag(Integer.valueOf(i))
            if (i != 0 || (itemView.findViewById(C4761R.C4764id.backgroundCard) as CardView?. also ({
                    cardView = it
                })) == null) {
                return
            }
            cardView.setNextFocusLeftId(R.id.nav_rail_view)
        }
    }
}