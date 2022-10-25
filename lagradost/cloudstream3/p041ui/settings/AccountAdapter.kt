package com.lagradost.cloudstream3.p041ui.settings

import android.view.LayoutInflater
import kotlin.jvm.internal.Intrinsics

/* compiled from: AccountAdapter.kt */
@Metadata(
    m108d1 = ["\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB1\u0012\u000c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\u0010\u000cJ\b\u0010\u0011\u001a\u00020\u0007H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0007H\u0016J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0007H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0007H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/settings/AccountAdapter;", "Landroidx/recyclerview/widget/RecyclerView\$Adapter;", "Landroidx/recyclerview/widget/RecyclerView\$ViewHolder;", "cardList", "", "Lcom/lagradost/cloudstream3/syncproviders/AuthAPI\$LoginInfo;", TtmlNode.TAG_LAYOUT, "", "clickCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/ui/settings/AccountClickCallback;", "", "(Ljava/util/List;ILkotlin/jvm/functions/Function1;)V", "getCardList", "()Ljava/util/List;", "getLayout", "()I", "getItemCount", "getItemId", "", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CardViewHolder", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.settings.AccountAdapter */ /* loaded from: classes4.dex */
class AccountAdapter constructor(
    cardList: List<LoginInfo>,
    i: Int,
    clickCallback: Function1<AccountClickCallback?, Unit>
) : RecyclerView.Adapter<RecyclerView.ViewHolder?>() {
    private val cardList: List<LoginInfo>
    private val clickCallback: Function1<AccountClickCallback, Unit>
    val layout: Int

    /* synthetic */   constructor(
        list: List,
        i: Int,
        function1: Function1<*, *>,
        i2: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(list, if ((i2 and 2) != 0) R.layout.account_single else i, function1) {
    }

    fun getCardList(): List<LoginInfo> {
        return cardList
    }

    /* JADX WARN: Multi-variable type inference failed */
    init {
        Intrinsics.checkNotNullParameter(cardList, "cardList")
        Intrinsics.checkNotNullParameter(clickCallback, "clickCallback")
        this.cardList = cardList
        layout = i
        this.clickCallback = clickCallback
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public override fun onCreateViewHolder(parent: ViewGroup, i: Int): RecyclerView.ViewHolder {
        Intrinsics.checkNotNullParameter(parent, "parent")
        val inflate: View = LayoutInflater.from(parent.getContext()).inflate(layout, parent, false)
        Intrinsics.checkNotNullExpressionValue(
            inflate,
            "from(parent.context).inf…te(layout, parent, false)"
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

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public override fun getItemId(i: Int): Long {
        return cardList.get(i).getAccountIndex()
    }

    /* compiled from: AccountAdapter.kt */
    @Metadata(
        m108d1 = ["\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/settings/AccountAdapter\$CardViewHolder;", "Landroidx/recyclerview/widget/RecyclerView\$ViewHolder;", "itemView", "Landroid/view/View;", "clickCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/ui/settings/AccountClickCallback;", "", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "accountName", "Landroid/widget/TextView;", "pfp", "Landroid/widget/ImageView;", "bind", "card", "Lcom/lagradost/cloudstream3/syncproviders/AuthAPI\$LoginInfo;", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.settings.AccountAdapter$CardViewHolder */ /* loaded from: classes4.dex */
    class CardViewHolder constructor(
        itemView: View,
        clickCallback: Function1<AccountClickCallback, Unit>
    ) : RecyclerView.ViewHolder(itemView) {
        private val accountName: TextView
        private val clickCallback: Function1<AccountClickCallback, Unit>
        private val pfp: ImageView

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
        init {
            Intrinsics.checkNotNullParameter(itemView, "itemView")
            Intrinsics.checkNotNullParameter(clickCallback, "clickCallback")
            this.clickCallback = clickCallback
            val findViewById: View = itemView.findViewById(R.id.account_profile_picture)
            Intrinsics.checkNotNull(findViewById)
            pfp = findViewById as ImageView
            val findViewById2: View = itemView.findViewById(R.id.account_name)
            Intrinsics.checkNotNull(findViewById2)
            accountName = findViewById2 as TextView
        }

        fun bind(card: LoginInfo) {
            Intrinsics.checkNotNullParameter(card, "card")
            val textView: TextView = accountName
            var name: String? = card.name
            if (name == null) {
                name = String.format(
                    "%s %d",
                    Arrays.copyOf(
                        arrayOf<Object>(
                            accountName.getContext().getString(R.string.account),
                            Integer.valueOf(card.accountIndex)
                        ), 2
                    )
                )
                Intrinsics.checkNotNullExpressionValue(name, "format(this, *args)")
            }
            textView.setText(name)
            pfp.setVisibility(
                if (UIHelper.`setImage$default`(
                        UIHelper.INSTANCE,
                        pfp,
                        card.profilePicture,
                        null,
                        null,
                        6,
                        null
                    )
                ) 0 else 8
            )
            this.itemView.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.settings.-$$Lambda$AccountAdapter$CardViewHolder$kBnWZZh2dT_EPo20mAzmc8M6CdI
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    `m8893bind$lambda0`(this@CardViewHolder, card, view)
                }
            })
        }

        companion object {
            /* JADX INFO: Access modifiers changed from: private */ /* renamed from: bind$lambda-0  reason: not valid java name */
            fun `m8893bind$lambda0`(`this$0`: CardViewHolder, card: LoginInfo, view: View?) {
                Intrinsics.checkNotNullParameter(`this$0`, "this$0")
                Intrinsics.checkNotNullParameter(card, "\$card")
                val function1: Function1<AccountClickCallback, Unit> = `this$0`.clickCallback
                val itemView: View = `this$0`.itemView
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView")
                function1.invoke(AccountClickCallback(0, itemView, card))
            }
        }
    }
}