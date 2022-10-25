package com.lagradost.cloudstream3.p041ui.home

import android.content.Context
import com.lagradost.cloudstream3.p041ui.settings.SettingsFragment
import kotlin.jvm.internal.Intrinsics

@Metadata(
    m108d1 = ["\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001c\u001dB;\u0012\u000c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\u0010\u000bJ\b\u0010\u000c\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rH\u0016J\u0014\u0010\u0019\u001a\u00020\t2\u000c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u001bR\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/home/ParentItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView\$Adapter;", "Landroidx/recyclerview/widget/RecyclerView\$ViewHolder;", FirebaseAnalytics.Param.ITEMS, "", "Lcom/lagradost/cloudstream3/HomePageList;", "clickCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/ui/search/SearchClickCallback;", "", "moreInfoClickCallback", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "getItemId", "", "position", "getItemViewType", "onBindViewHolder", "holder", "onCreateViewHolder", "Lcom/lagradost/cloudstream3/ui/home/ParentItemAdapter\$ParentViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "updateList", "newList", "", "CardType", "ParentViewHolder", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.home.ParentItemAdapter */ /* loaded from: classes3.dex */
class HomeParentItemAdapter constructor(
    items: List<HomePageList>,
    clickCallback: Function1<SearchClickCallback?, Unit>,
    moreInfoClickCallback: Function1<HomePageList?, Unit>
) : RecyclerView.Adapter<RecyclerView.ViewHolder?>() {
    private val clickCallback: Function1<SearchClickCallback, Unit>
    private val items: List<HomePageList>
    private val moreInfoClickCallback: Function1<HomePageList, Unit>

    /* compiled from: HomeParentItemAdapter.kt */
    @Metadata(
        m108d1 = ["\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/home/ParentItemAdapter\$CardType;", "", "(Ljava/lang/String;I)V", "BIG_CARD", "NORMAL_CARD", "CIRCLE_CARD", "LONG_WIDTH_CARD", "FULL_WIDTH_CARD", "TOP_CARD", "TV_CARD", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    /* renamed from: com.lagradost.cloudstream3.ui.home.ParentItemAdapter$CardType */ /* loaded from: classes3.dex */
    enum class CardType {
        BIG_CARD, NORMAL_CARD, CIRCLE_CARD, LONG_WIDTH_CARD, FULL_WIDTH_CARD, TOP_CARD, TV_CARD
    }

    /* JADX WARN: Multi-variable type inference failed */
    init {
        Intrinsics.checkNotNullParameter(items, "items")
        Intrinsics.checkNotNullParameter(clickCallback, "clickCallback")
        Intrinsics.checkNotNullParameter(moreInfoClickCallback, "moreInfoClickCallback")
        this.items = items
        this.clickCallback = clickCallback
        this.moreInfoClickCallback = moreInfoClickCallback
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public override fun onCreateViewHolder(parent: ViewGroup, i: Int): RecyclerView.ViewHolder {
        Intrinsics.checkNotNullParameter(parent, "parent")
        val companion: SettingsFragment.Companion = SettingsFragment.Companion.Companion
        val context: Context = parent.getContext()
        Intrinsics.checkNotNullExpressionValue(context, "parent.context")
        val i2: Int =
            if (companion.isTvSettings(context)) R.layout.homepage_parent_tv else R.layout.homepage_parent
        if (i == CardType.BIG_CARD.ordinal()) {
            val inflate: View = LayoutInflater.from(parent.getContext()).inflate(i2, parent, false)
            Intrinsics.checkNotNullExpressionValue(
                inflate,
                "from(parent.context).inf…te(layout, parent, false)"
            )
            return ParentViewHolder(
                inflate,
                clickCallback,
                moreInfoClickCallback,
                CardType.BIG_CARD
            )
        } else if (i == CardType.CIRCLE_CARD.ordinal()) {
            val inflate2: View = LayoutInflater.from(parent.getContext()).inflate(i2, parent, false)
            Intrinsics.checkNotNullExpressionValue(
                inflate2,
                "from(parent.context).inf…te(layout, parent, false)"
            )
            return ParentViewHolder(
                inflate2,
                clickCallback,
                moreInfoClickCallback,
                CardType.CIRCLE_CARD
            )
        } else if (i == CardType.LONG_WIDTH_CARD.ordinal()) {
            val inflate3: View = LayoutInflater.from(parent.getContext()).inflate(i2, parent, false)
            Intrinsics.checkNotNullExpressionValue(
                inflate3,
                "from(parent.context).inf…te(layout, parent, false)"
            )
            return ParentViewHolder(
                inflate3,
                clickCallback,
                moreInfoClickCallback,
                CardType.LONG_WIDTH_CARD
            )
        } else if (i == CardType.FULL_WIDTH_CARD.ordinal()) {
            val inflate4: View = LayoutInflater.from(parent.getContext()).inflate(i2, parent, false)
            Intrinsics.checkNotNullExpressionValue(
                inflate4,
                "from(parent.context).inf…te(layout, parent, false)"
            )
            return ParentViewHolder(
                inflate4,
                clickCallback,
                moreInfoClickCallback,
                CardType.FULL_WIDTH_CARD
            )
        } else if (i == CardType.TOP_CARD.ordinal()) {
            val inflate5: View = LayoutInflater.from(parent.getContext()).inflate(i2, parent, false)
            Intrinsics.checkNotNullExpressionValue(
                inflate5,
                "from(parent.context).inf…te(layout, parent, false)"
            )
            return ParentViewHolder(
                inflate5,
                clickCallback,
                moreInfoClickCallback,
                CardType.TOP_CARD
            )
        } else if (i == CardType.TV_CARD.ordinal()) {
            val inflate6: View = LayoutInflater.from(parent.getContext()).inflate(i2, parent, false)
            Intrinsics.checkNotNullExpressionValue(
                inflate6,
                "from(parent.context).inf…te(layout, parent, false)"
            )
            return ParentViewHolder(
                inflate6,
                clickCallback,
                moreInfoClickCallback,
                CardType.TV_CARD
            )
        } else {
            val inflate7: View = LayoutInflater.from(parent.getContext()).inflate(i2, parent, false)
            Intrinsics.checkNotNullExpressionValue(
                inflate7,
                "from(parent.context).inf…te(layout, parent, false)"
            )
            return ParentViewHolder(inflate7, clickCallback, moreInfoClickCallback, null, 8, null)
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public override fun onBindViewHolder(holder: RecyclerView.ViewHolder, i: Int) {
        Intrinsics.checkNotNullParameter(holder, "holder")
        if (holder is ParentViewHolder) {
            (holder as ParentViewHolder).bind(items.get(i))
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public override fun getItemViewType(i: Int): Int {
        return items.get(i).getCardType().ordinal()
    }

    // androidx.recyclerview.widget.RecyclerView.Adapter
    @get:Override
    val itemCount: Int
        // androidx.recyclerview.widget.RecyclerView.Adapter
        get() {
            return items.size()
        }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public override fun getItemId(i: Int): Long {
        return items.get(i).getName().hashCode()
    }

    fun updateList(newList: List<HomePageList?>) {
        Intrinsics.checkNotNullParameter(newList, "newList")
        val arrayList: ArrayList = ArrayList()
        val arrayList2: ArrayList = ArrayList()
        for (homePageList: HomePageList in newList) {
            if (homePageList.getList().isEmpty()) {
                arrayList.add(homePageList)
            } else {
                arrayList2.add(homePageList)
            }
        }
        arrayList2.addAll(arrayList)
        val calculateDiff: DiffResult =
            DiffUtil.calculateDiff(SearchDiffCallback(items, arrayList2))
        Intrinsics.checkNotNullExpressionValue(
            calculateDiff,
            "calculateDiff(\n         …ewFilteredList)\n        )"
        )
        items.clear()
        items.addAll(arrayList2)
        calculateDiff.dispatchUpdatesTo(this)
    }

    /* compiled from: HomeParentItemAdapter.kt */
    @Metadata(
        m108d1 = ["\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\u000cJ\u000e\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\tR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/home/ParentItemAdapter\$ParentViewHolder;", "Landroidx/recyclerview/widget/RecyclerView\$ViewHolder;", "itemView", "Landroid/view/View;", "clickCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/ui/search/SearchClickCallback;", "", "moreInfoClickCallback", "Lcom/lagradost/cloudstream3/HomePageList;", "type", "Lcom/lagradost/cloudstream3/ui/home/ParentItemAdapter\$CardType;", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/lagradost/cloudstream3/ui/home/ParentItemAdapter\$CardType;)V", "moreInfo", "Landroid/widget/LinearLayout;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "title", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "tvMore", "getTvMore", "()Landroid/view/View;", "getType", "()Lcom/lagradost/cloudstream3/ui/home/ParentItemAdapter\$CardType;", "bind", "info", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.home.ParentItemAdapter$ParentViewHolder */ /* loaded from: classes3.dex */
    class ParentViewHolder constructor(
        itemView: View,
        clickCallback: Function1<SearchClickCallback, Unit>?,
        moreInfoClickCallback: Function1<HomePageList, Unit>,
        type: CardType
    ) : RecyclerView.ViewHolder(itemView) {
        private val clickCallback: Function1<SearchClickCallback, Unit>?
        private val moreInfo: LinearLayout?
        private val moreInfoClickCallback: Function1<HomePageList, Unit>
        private val recyclerView: RecyclerView
        private val title: TextView
        private val tvMore: View?
        val type: CardType

        /* compiled from: HomeParentItemAdapter.kt */
        @Metadata(
            m106k = 3,
            m105mv = [1, 6, 0],
            m103xi = 48
        ) /* renamed from: com.lagradost.cloudstream3.ui.home.ParentItemAdapter$ParentViewHolder$WhenMappings */ /* loaded from: classes3.dex */
        /* synthetic */
        object WhenMappings {
            /* synthetic */ val `$EnumSwitchMapping$0`: IntArray

            init {
                val iArr: IntArray = IntArray(CardType.values().size)
                com.lagradost.cloudstream3.p041ui.home.iArr.get(CardType.BIG_CARD.ordinal()) = 1
                com.lagradost.cloudstream3.p041ui.home.iArr.get(CardType.CIRCLE_CARD.ordinal()) = 2
                com.lagradost.cloudstream3.p041ui.home.iArr.get(CardType.LONG_WIDTH_CARD.ordinal()) =
                    3
                com.lagradost.cloudstream3.p041ui.home.iArr.get(CardType.FULL_WIDTH_CARD.ordinal()) =
                    4
                com.lagradost.cloudstream3.p041ui.home.iArr.get(CardType.TOP_CARD.ordinal()) = 5
                com.lagradost.cloudstream3.p041ui.home.iArr.get(CardType.TV_CARD.ordinal()) = 6
                `$EnumSwitchMapping$0` = com.lagradost.cloudstream3.p041ui.home.iArr
            }
        }

        /* synthetic */   constructor(
            view: View,
            function1: Function1<*, *>?,
            function12: Function1<*, *>,
            cardType: CardType?,
            i: Int,
            defaultConstructorMarker: DefaultConstructorMarker?
        ) : this(
            view,
            (function1)!!,
            function12,
            (if ((i and 8) != 0) CardType.NORMAL_CARD else cardType)!!
        ) {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
        init {
            Intrinsics.checkNotNullParameter(itemView, "itemView")
            Intrinsics.checkNotNullParameter(clickCallback, "clickCallback")
            Intrinsics.checkNotNullParameter(moreInfoClickCallback, "moreInfoClickCallback")
            Intrinsics.checkNotNullParameter(type, "type")
            this.clickCallback = clickCallback
            this.moreInfoClickCallback = moreInfoClickCallback
            this.type = type
            val textView: TextView =
                itemView.findViewById(C4761R.C4764id.home_parent_item_title) as TextView
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.home_parent_item_title")
            title = textView
            val textView2: TextView? = itemView.findViewById(C4761R.C4764id.tvMore) as TextView?
            tvMore = textView2
            val recyclerView: RecyclerView =
                itemView.findViewById(C4761R.C4764id.home_child_recyclerview) as RecyclerView
            Intrinsics.checkNotNullExpressionValue(recyclerView, "itemView.home_child_recyclerview")
            this.recyclerView = recyclerView
            val linearLayout: LinearLayout? =
                itemView.findViewById(C4761R.C4764id.home_child_more_info) as LinearLayout?
            moreInfo = linearLayout
            if (type == CardType.FULL_WIDTH_CARD) {
                LinearSnapHelper().attachToRecyclerView(recyclerView)
                if (linearLayout != null) {
                    linearLayout.setVisibility(8)
                }
            }
            if (type == CardType.TOP_CARD) {
                if (textView2 != null) {
                    textView2.setVisibility(8)
                }
                LinearSnapHelper().attachToRecyclerView(recyclerView)
            }
        }

        fun getTitle(): TextView {
            return title
        }

        fun getTvMore(): View? {
            return tvMore
        }

        fun getRecyclerView(): RecyclerView {
            return recyclerView
        }

        fun bind(info: HomePageList) {
            val i: Int
            Intrinsics.checkNotNullParameter(info, "info")
            title.setText(info.name)
            val recyclerView: RecyclerView = recyclerView
            val mutableList: List = CollectionsKt.toMutableList(info.getList() as Collection?)
            val function1: Function1<SearchClickCallback, Unit>? = clickCallback
            val nextFocusUpId: Int = this.recyclerView.getNextFocusUpId()
            val nextFocusDownId: Int = this.recyclerView.getNextFocusDownId()
            when (WhenMappings.`$EnumSwitchMapping$0`.get(
                type.ordinal()
            )) {
                1 -> i = R.layout.home_result_big_grid
                2 -> i = R.layout.home_result_circle_grid
                3 -> i = R.layout.home_result_long_width_grid
                4 -> i = R.layout.home_result_full_width_grid
                5 -> i = R.layout.home_result_top_grid
                6 -> i = R.layout.home_result_tv_long_width_grid
                else -> i = R.layout.home_result_grid
            }
            recyclerView.setAdapter(
                HomeChildItemAdapter(
                    mutableList,
                    Integer.valueOf(i),
                    Integer.valueOf(nextFocusUpId),
                    Integer.valueOf(nextFocusDownId),
                    function1
                )
            )
            val linearLayout: LinearLayout? = moreInfo
            if (linearLayout != null) {
                linearLayout.setOnClickListener(object : OnClickListener() {
                    // from class: com.lagradost.cloudstream3.ui.home.-$$Lambda$ParentItemAdapter$ParentViewHolder$wOCaFabcenQ9jgzxGy4v2GVxVzk
                    @Override // android.view.View.OnClickListener
                    fun onClick(view: View?) {
                        `m8660bind$lambda0`(this@ParentViewHolder, info, view)
                    }
                })
            }
        }

        companion object {
            /* JADX INFO: Access modifiers changed from: private */ /* renamed from: bind$lambda-0  reason: not valid java name */
            fun `m8660bind$lambda0`(`this$0`: ParentViewHolder, info: HomePageList, view: View?) {
                Intrinsics.checkNotNullParameter(`this$0`, "this$0")
                Intrinsics.checkNotNullParameter(info, "\$info")
                `this$0`.moreInfoClickCallback.invoke(info)
            }
        }
    }
}