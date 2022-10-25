package com.lagradost.cloudstream3.p041ui.download

import android.view.LayoutInflater
import kotlin.jvm.internal.Intrinsics

/* compiled from: DownloadHeaderAdapter.kt */
@Metadata(
    m108d1 = ["\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B;\u0012\u000c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\u0010\u000cJ\u0012\u0010\u0014\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0006\u0010\u0018\u001a\u00020\tJ\u0018\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0017H\u0016J\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0017H\u0016J\u0010\u0010 \u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J\u0010\u0010!\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J\u0010\u0010\"\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0002H\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/download/DownloadHeaderAdapter;", "Landroidx/recyclerview/widget/RecyclerView\$Adapter;", "Landroidx/recyclerview/widget/RecyclerView\$ViewHolder;", "cardList", "", "Lcom/lagradost/cloudstream3/ui/download/VisualDownloadHeaderCached;", "clickCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/ui/download/DownloadHeaderClickEvent;", "", "movieClickCallback", "Lcom/lagradost/cloudstream3/ui/download/DownloadClickEvent;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getCardList", "()Ljava/util/List;", "setCardList", "(Ljava/util/List;)V", "mBoundViewHolders", "Ljava/util/HashSet;", "Lcom/lagradost/cloudstream3/ui/download/DownloadButtonViewHolder;", "getAllBoundViewHolders", "", "getItemCount", "", "killAdapter", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewAttachedToWindow", "onViewDetachedFromWindow", "onViewRecycled", "DownloadHeaderViewHolder", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.download.DownloadHeaderAdapter */ /* loaded from: classes3.dex */
class DownloadHeaderAdapter constructor(
    cardList: List<VisualDownloadHeaderCached>,
    clickCallback: Function1<DownloadHeaderClickEvent?, Unit>,
    movieClickCallback: Function1<DownloadClickEvent?, Unit>
) : RecyclerView.Adapter<RecyclerView.ViewHolder?>() {
    private var cardList: List<VisualDownloadHeaderCached>
    private val clickCallback: Function1<DownloadHeaderClickEvent, Unit>
    private val mBoundViewHolders: HashSet<DownloadButtonViewHolder>
    private val movieClickCallback: Function1<DownloadClickEvent, Unit>
    fun getCardList(): List<VisualDownloadHeaderCached> {
        return cardList
    }

    fun setCardList(list: List<VisualDownloadHeaderCached>) {
        Intrinsics.checkNotNullParameter(list, "<set-?>")
        cardList = list
    }

    /* JADX WARN: Multi-variable type inference failed */
    init {
        Intrinsics.checkNotNullParameter(cardList, "cardList")
        Intrinsics.checkNotNullParameter(clickCallback, "clickCallback")
        Intrinsics.checkNotNullParameter(movieClickCallback, "movieClickCallback")
        this.cardList = cardList
        this.clickCallback = clickCallback
        this.movieClickCallback = movieClickCallback
        mBoundViewHolders = HashSet()
    }

    private val allBoundViewHolders: Set<DownloadButtonViewHolder>
        private get() {
            return Collections.unmodifiableSet(mBoundViewHolders)
        }

    fun killAdapter() {
        var downloadButton: EasyDownloadButton
        val allBoundViewHolders: Set<DownloadButtonViewHolder>? = allBoundViewHolders
        if (allBoundViewHolders != null) {
            for (downloadButtonViewHolder: DownloadButtonViewHolder? in allBoundViewHolders) {
                if (downloadButtonViewHolder != null && (downloadButtonViewHolder.getDownloadButton()
                        .also({ downloadButton = it })) != null
                ) {
                    downloadButton.dispose()
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public override fun onViewDetachedFromWindow(holder: RecyclerView.ViewHolder) {
        Intrinsics.checkNotNullParameter(holder, "holder")
        if (holder is DownloadButtonViewHolder) {
            (holder as DownloadButtonViewHolder).getDownloadButton().dispose()
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public override fun onViewRecycled(holder: RecyclerView.ViewHolder) {
        Intrinsics.checkNotNullParameter(holder, "holder")
        if (holder is DownloadButtonViewHolder) {
            (holder as DownloadButtonViewHolder).getDownloadButton().dispose()
            mBoundViewHolders.remove(holder)
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public override fun onViewAttachedToWindow(holder: RecyclerView.ViewHolder) {
        Intrinsics.checkNotNullParameter(holder, "holder")
        if (holder is DownloadButtonViewHolder) {
            (holder as DownloadButtonViewHolder).reattachDownloadButton()
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public override fun onCreateViewHolder(parent: ViewGroup, i: Int): RecyclerView.ViewHolder {
        Intrinsics.checkNotNullParameter(parent, "parent")
        val inflate: View = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.download_header_episode, parent, false)
        Intrinsics.checkNotNullExpressionValue(
            inflate,
            "from(parent.context).inf…r_episode, parent, false)"
        )
        return DownloadHeaderViewHolder(inflate, clickCallback, movieClickCallback)
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public override fun onBindViewHolder(holder: RecyclerView.ViewHolder, i: Int) {
        Intrinsics.checkNotNullParameter(holder, "holder")
        if (holder is DownloadHeaderViewHolder) {
            (holder as DownloadHeaderViewHolder).bind(cardList.get(i))
            mBoundViewHolders.add(holder)
        }
    }

    // androidx.recyclerview.widget.RecyclerView.Adapter
    @get:Override
    val itemCount: Int
        // androidx.recyclerview.widget.RecyclerView.Adapter
        get() {
            return cardList.size()
        }

    /* compiled from: DownloadHeaderAdapter.kt */
    @Metadata(
        m108d1 = ["\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001bH\u0007J\b\u0010!\u001a\u00020\bH\u0016R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/download/DownloadHeaderAdapter\$DownloadHeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView\$ViewHolder;", "Lcom/lagradost/cloudstream3/ui/download/DownloadButtonViewHolder;", "itemView", "Landroid/view/View;", "clickCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/ui/download/DownloadHeaderClickEvent;", "", "movieClickCallback", "Lcom/lagradost/cloudstream3/ui/download/DownloadClickEvent;", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "downloadBar", "Landroidx/core/widget/ContentLoadingProgressBar;", "downloadButton", "Lcom/lagradost/cloudstream3/ui/download/EasyDownloadButton;", "getDownloadButton", "()Lcom/lagradost/cloudstream3/ui/download/EasyDownloadButton;", "setDownloadButton", "(Lcom/lagradost/cloudstream3/ui/download/EasyDownloadButton;)V", "downloadImage", "Landroid/widget/ImageView;", "extraInfo", "Landroid/widget/TextView;", "holder", "Landroidx/cardview/widget/CardView;", "localCard", "Lcom/lagradost/cloudstream3/ui/download/VisualDownloadHeaderCached;", "normalImage", "poster", "title", "bind", "card", "reattachDownloadButton", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.download.DownloadHeaderAdapter$DownloadHeaderViewHolder */ /* loaded from: classes3.dex */
    class DownloadHeaderViewHolder constructor(
        itemView: View,
        clickCallback: Function1<DownloadHeaderClickEvent, Unit>,
        movieClickCallback: Function1<DownloadClickEvent, Unit>
    ) : RecyclerView.ViewHolder(itemView), DownloadButtonViewHolder {
        private val clickCallback: Function1<DownloadHeaderClickEvent, Unit>
        private val downloadBar: ContentLoadingProgressBar
        private override var downloadButton: EasyDownloadButton
        private val downloadImage: ImageView
        private val extraInfo: TextView
        private val holder: CardView
        private var localCard: VisualDownloadHeaderCached? = null
        private val movieClickCallback: Function1<DownloadClickEvent, Unit>
        private val normalImage: ImageView
        private val poster: ImageView
        private val title: TextView

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
        init {
            Intrinsics.checkNotNullParameter(itemView, "itemView")
            Intrinsics.checkNotNullParameter(clickCallback, "clickCallback")
            Intrinsics.checkNotNullParameter(movieClickCallback, "movieClickCallback")
            this.clickCallback = clickCallback
            this.movieClickCallback = movieClickCallback
            downloadButton = EasyDownloadButton()
            poster = itemView.findViewById(C4761R.C4764id.download_header_poster) as ImageView
            val textView: TextView =
                itemView.findViewById(C4761R.C4764id.download_header_title) as TextView
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.download_header_title")
            title = textView
            val textView2: TextView =
                itemView.findViewById(C4761R.C4764id.download_header_info) as TextView
            Intrinsics.checkNotNullExpressionValue(textView2, "itemView.download_header_info")
            extraInfo = textView2
            val cardView: CardView =
                itemView.findViewById(C4761R.C4764id.episode_holder) as CardView
            Intrinsics.checkNotNullExpressionValue(cardView, "itemView.episode_holder")
            holder = cardView
            val contentLoadingProgressBar: ContentLoadingProgressBar =
                itemView.findViewById(C4761R.C4764id.download_header_progress_downloaded) as ContentLoadingProgressBar
            Intrinsics.checkNotNullExpressionValue(
                contentLoadingProgressBar,
                "itemView.download_header_progress_downloaded"
            )
            downloadBar = contentLoadingProgressBar
            val imageView: ImageView =
                itemView.findViewById(C4761R.C4764id.download_header_episode_download) as ImageView
            Intrinsics.checkNotNullExpressionValue(
                imageView,
                "itemView.download_header_episode_download"
            )
            downloadImage = imageView
            val imageView2: ImageView =
                itemView.findViewById(C4761R.C4764id.download_header_goto_child) as ImageView
            Intrinsics.checkNotNullExpressionValue(
                imageView2,
                "itemView.download_header_goto_child"
            )
            normalImage = imageView2
        }

        @Override // com.lagradost.cloudstream3.p041ui.download.DownloadButtonViewHolder
        public override fun getDownloadButton(): EasyDownloadButton {
            return downloadButton
        }

        @Override // com.lagradost.cloudstream3.p041ui.download.DownloadButtonViewHolder
        public override fun setDownloadButton(easyDownloadButton: EasyDownloadButton) {
            Intrinsics.checkNotNullParameter(easyDownloadButton, "<set-?>")
            downloadButton = easyDownloadButton
        }

        fun bind(card: VisualDownloadHeaderCached) {
            Intrinsics.checkNotNullParameter(card, "card")
            localCard = card
            val data: DownloadHeaderCached? = card.getData()
            val imageView: ImageView? = poster
            if (imageView != null) {
                UIHelper.`setImage$default`(
                    UIHelper.INSTANCE,
                    imageView,
                    data.poster,
                    null,
                    null,
                    6,
                    null
                )
            }
            val imageView2: ImageView? = poster
            if (imageView2 != null) {
                imageView2.setOnClickListener(object : OnClickListener() {
                    // from class: com.lagradost.cloudstream3.ui.download.-$$Lambda$DownloadHeaderAdapter$DownloadHeaderViewHolder$ciI9uW7zU1HY5PMGqIQ32LM7MSA
                    @Override // android.view.View.OnClickListener
                    fun onClick(view: View?) {
                        `m8625bind$lambda0`(this@DownloadHeaderViewHolder, data, view)
                    }
                })
            }
            title.setText(data.name)
            val format: String = String.format(
                "%.1f",
                Arrays.copyOf(
                    arrayOf<Object>(
                        Float.valueOf(
                            (card.getTotalBytes().toFloat()) / 1000000.0f
                        )
                    ), 1
                )
            )
            Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)")
            if (card.getChild() != null) {
                downloadBar.setVisibility(0)
                downloadImage.setVisibility(0)
                normalImage.setVisibility(8)
                holder.setOnClickListener(object : OnClickListener() {
                    // from class: com.lagradost.cloudstream3.ui.download.-$$Lambda$DownloadHeaderAdapter$DownloadHeaderViewHolder$3zKNHTN8SDlUQQhBkNhNGx5LrME
                    @Override // android.view.View.OnClickListener
                    fun onClick(view: View?) {
                        `m8626bind$lambda1`(this@DownloadHeaderViewHolder, card, view)
                    }
                })
                return
            }
            downloadBar.setVisibility(8)
            downloadImage.setVisibility(8)
            normalImage.setVisibility(0)
            try {
                val textView: TextView = extraInfo
                val string: String = textView.getContext().getString(R.string.extra_info_format)
                Intrinsics.checkNotNullExpressionValue(
                    string,
                    "extraInfo.context.getStr…string.extra_info_format)"
                )
                val objArr: Array<Object> = arrayOfNulls<Object>(3)
                objArr.get(0) = Integer.valueOf(card.getTotalDownloads())
                objArr.get(1) = if (card.getTotalDownloads() == 1) extraInfo.getContext()
                    .getString(R.string.episode) else extraInfo.getContext()
                    .getString(R.string.episodes)
                objArr.get(2) = format
                val format2: String = String.format(string, Arrays.copyOf(objArr, 3))
                Intrinsics.checkNotNullExpressionValue(format2, "format(this, *args)")
                textView.setText(format2)
            } catch (e: Exception) {
                extraInfo.setText("Error")
                ArchComponentExt.logError(e)
            }
            holder.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.download.-$$Lambda$DownloadHeaderAdapter$DownloadHeaderViewHolder$B0w90_pwL4SLiiMh9QHkHFuv898
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    `m8627bind$lambda2`(this@DownloadHeaderViewHolder, data, view)
                }
            })
        }

        @Override // com.lagradost.cloudstream3.p041ui.download.DownloadButtonViewHolder
        public override fun reattachDownloadButton() {
            getDownloadButton().dispose()
            val visualDownloadHeaderCached: VisualDownloadHeaderCached? = localCard
            if ((if (visualDownloadHeaderCached != null) visualDownloadHeaderCached.getChild() else null) != null) {
                getDownloadButton().setUpButton(
                    Long.valueOf(visualDownloadHeaderCached.getCurrentBytes()),
                    Long.valueOf(visualDownloadHeaderCached.getTotalBytes()),
                    downloadBar,
                    downloadImage,
                    extraInfo,
                    visualDownloadHeaderCached!!.getChild(),
                    movieClickCallback
                )
            }
        }

        companion object {
            /* JADX INFO: Access modifiers changed from: private */ /* renamed from: bind$lambda-0  reason: not valid java name */
            fun `m8625bind$lambda0`(
                `this$0`: DownloadHeaderViewHolder,
                d: DownloadHeaderCached?,
                view: View?
            ) {
                Intrinsics.checkNotNullParameter(`this$0`, "this$0")
                Intrinsics.checkNotNullParameter(d, "\$d")
                `this$0`.clickCallback.invoke(DownloadHeaderClickEvent(1, d))
            }

            /* JADX INFO: Access modifiers changed from: private */ /* renamed from: bind$lambda-1  reason: not valid java name */
            fun `m8626bind$lambda1`(
                `this$0`: DownloadHeaderViewHolder,
                card: VisualDownloadHeaderCached,
                view: View?
            ) {
                Intrinsics.checkNotNullParameter(`this$0`, "this$0")
                Intrinsics.checkNotNullParameter(card, "\$card")
                `this$0`.movieClickCallback.invoke(DownloadClickEvent(0, card.getChild()))
            }

            /* JADX INFO: Access modifiers changed from: private */ /* renamed from: bind$lambda-2  reason: not valid java name */
            fun `m8627bind$lambda2`(
                `this$0`: DownloadHeaderViewHolder,
                d: DownloadHeaderCached?,
                view: View?
            ) {
                Intrinsics.checkNotNullParameter(`this$0`, "this$0")
                Intrinsics.checkNotNullParameter(d, "\$d")
                `this$0`.clickCallback.invoke(DownloadHeaderClickEvent(0, d))
            }
        }
    }
}