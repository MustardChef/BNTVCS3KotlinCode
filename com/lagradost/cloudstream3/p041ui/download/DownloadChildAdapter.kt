package com.lagradost.cloudstream3.p041ui.download

import android.content.Context
import com.lagradost.cloudstream3.utils.AppUtils
import kotlin.jvm.internal.Intrinsics

/* compiled from: DownloadChildAdapter.kt */
@Metadata(
    m108d1 = ["\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B'\u0012\u000c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\u0012\u0010\u0012\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0006\u0010\u0016\u001a\u00020\tJ\u0018\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0015H\u0016J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0015H\u0016J\u0010\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0002H\u0016J\u0010\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0002H\u0016J\u0010\u0010 \u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0002H\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u000c\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/download/DownloadChildAdapter;", "Landroidx/recyclerview/widget/RecyclerView\$Adapter;", "Landroidx/recyclerview/widget/RecyclerView\$ViewHolder;", "cardList", "", "Lcom/lagradost/cloudstream3/ui/download/VisualDownloadChildCached;", "clickCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/ui/download/DownloadClickEvent;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getCardList", "()Ljava/util/List;", "setCardList", "(Ljava/util/List;)V", "mBoundViewHolders", "Ljava/util/HashSet;", "Lcom/lagradost/cloudstream3/ui/download/DownloadButtonViewHolder;", "getAllBoundViewHolders", "", "getItemCount", "", "killAdapter", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewAttachedToWindow", "onViewDetachedFromWindow", "onViewRecycled", "DownloadChildViewHolder", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.download.DownloadChildAdapter */ /* loaded from: classes3.dex */
class DownloadChildAdapter constructor(
    cardList: List<VisualDownloadChildCached>,
    clickCallback: Function1<DownloadClickEvent?, Unit>
) : RecyclerView.Adapter<RecyclerView.ViewHolder?>() {
    private var cardList: List<VisualDownloadChildCached>
    private val clickCallback: Function1<DownloadClickEvent, Unit>
    private val mBoundViewHolders: HashSet<DownloadButtonViewHolder>
    fun getCardList(): List<VisualDownloadChildCached> {
        return cardList
    }

    fun setCardList(list: List<VisualDownloadChildCached>) {
        Intrinsics.checkNotNullParameter(list, "<set-?>")
        cardList = list
    }

    /* JADX WARN: Multi-variable type inference failed */
    init {
        Intrinsics.checkNotNullParameter(cardList, "cardList")
        Intrinsics.checkNotNullParameter(clickCallback, "clickCallback")
        this.cardList = cardList
        this.clickCallback = clickCallback
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
            .inflate(R.layout.download_child_episode, parent, false)
        Intrinsics.checkNotNullExpressionValue(
            inflate,
            "from(parent.context).inf…d_episode, parent, false)"
        )
        return DownloadChildViewHolder(inflate, clickCallback)
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public override fun onBindViewHolder(holder: RecyclerView.ViewHolder, i: Int) {
        Intrinsics.checkNotNullParameter(holder, "holder")
        if (holder is DownloadChildViewHolder) {
            (holder as DownloadChildViewHolder).bind(cardList.get(i))
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

    /* compiled from: DownloadChildAdapter.kt */
    @Metadata(
        m108d1 = ["\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\u0010\tJ\u000e\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0017J\b\u0010\u001e\u001a\u00020\bH\u0016R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000c\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/download/DownloadChildAdapter\$DownloadChildViewHolder;", "Landroidx/recyclerview/widget/RecyclerView\$ViewHolder;", "Lcom/lagradost/cloudstream3/ui/download/DownloadButtonViewHolder;", "itemView", "Landroid/view/View;", "clickCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/ui/download/DownloadClickEvent;", "", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "downloadButton", "Lcom/lagradost/cloudstream3/ui/download/EasyDownloadButton;", "getDownloadButton", "()Lcom/lagradost/cloudstream3/ui/download/EasyDownloadButton;", "setDownloadButton", "(Lcom/lagradost/cloudstream3/ui/download/EasyDownloadButton;)V", "downloadImage", "Landroid/widget/ImageView;", "extraInfo", "Landroid/widget/TextView;", "holder", "Landroidx/cardview/widget/CardView;", "localCard", "Lcom/lagradost/cloudstream3/ui/download/VisualDownloadChildCached;", "progressBar", "Landroidx/core/widget/ContentLoadingProgressBar;", "progressBarDownload", "title", "bind", "card", "reattachDownloadButton", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.download.DownloadChildAdapter$DownloadChildViewHolder */ /* loaded from: classes3.dex */
    class DownloadChildViewHolder constructor(
        itemView: View,
        clickCallback: Function1<DownloadClickEvent, Unit>
    ) : RecyclerView.ViewHolder(itemView), DownloadButtonViewHolder {
        private val clickCallback: Function1<DownloadClickEvent, Unit>
        private override var downloadButton: EasyDownloadButton
        private val downloadImage: ImageView
        private val extraInfo: TextView
        private val holder: CardView
        private var localCard: VisualDownloadChildCached? = null
        private val progressBar: ContentLoadingProgressBar
        private val progressBarDownload: ContentLoadingProgressBar
        private val title: TextView

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
        init {
            Intrinsics.checkNotNullParameter(itemView, "itemView")
            Intrinsics.checkNotNullParameter(clickCallback, "clickCallback")
            this.clickCallback = clickCallback
            downloadButton = EasyDownloadButton()
            val textView: TextView =
                itemView.findViewById(C4761R.C4764id.download_child_episode_text) as TextView
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.download_child_episode_text")
            title = textView
            val textView2: TextView =
                itemView.findViewById(C4761R.C4764id.download_child_episode_text_extra) as TextView
            Intrinsics.checkNotNullExpressionValue(
                textView2,
                "itemView.download_child_episode_text_extra"
            )
            extraInfo = textView2
            val cardView: CardView =
                itemView.findViewById(C4761R.C4764id.download_child_episode_holder) as CardView
            Intrinsics.checkNotNullExpressionValue(
                cardView,
                "itemView.download_child_episode_holder"
            )
            holder = cardView
            val contentLoadingProgressBar: ContentLoadingProgressBar =
                itemView.findViewById(C4761R.C4764id.download_child_episode_progress) as ContentLoadingProgressBar
            Intrinsics.checkNotNullExpressionValue(
                contentLoadingProgressBar,
                "itemView.download_child_episode_progress"
            )
            progressBar = contentLoadingProgressBar
            val contentLoadingProgressBar2: ContentLoadingProgressBar =
                itemView.findViewById(C4761R.C4764id.download_child_episode_progress_downloaded) as ContentLoadingProgressBar
            Intrinsics.checkNotNullExpressionValue(
                contentLoadingProgressBar2,
                "itemView.download_child_…isode_progress_downloaded"
            )
            progressBarDownload = contentLoadingProgressBar2
            val imageView: ImageView =
                itemView.findViewById(C4761R.C4764id.download_child_episode_download) as ImageView
            Intrinsics.checkNotNullExpressionValue(
                imageView,
                "itemView.download_child_episode_download"
            )
            downloadImage = imageView
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

        fun bind(card: VisualDownloadChildCached) {
            Intrinsics.checkNotNullParameter(card, "card")
            localCard = card
            val data: DownloadEpisodeCached? = card.getData()
            val viewPos: PosDur? = DataStoreHelper.INSTANCE.getViewPos(Integer.valueOf(data.id))
            if (viewPos != null) {
                val fixVisual: PosDur = DataStoreHelper.INSTANCE.fixVisual(viewPos)
                val j: Long = 1000
                progressBar.setMax((fixVisual.duration / j).toInt())
                progressBar.setProgress((fixVisual.position / j).toInt())
                progressBar.setVisibility(0)
            } else {
                progressBar.setVisibility(8)
            }
            val textView: TextView = title
            val appUtils: AppUtils = AppUtils.INSTANCE
            val context: Context = title.getContext()
            Intrinsics.checkNotNullExpressionValue(context, "title.context")
            textView.setText(
                appUtils.getNameFull(
                    context,
                    data.name,
                    Integer.valueOf(data.episode),
                    data.getSeason()
                )
            )
            title.setSelected(true)
            getDownloadButton().setUpButton(
                Long.valueOf(card.getCurrentBytes()),
                Long.valueOf(card.getTotalBytes()),
                progressBarDownload,
                downloadImage,
                extraInfo,
                card.getData(),
                clickCallback
            )
            holder.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.download.-$$Lambda$DownloadChildAdapter$DownloadChildViewHolder$qd_faaq8AeT61_45y0sJl8XuQ_M
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    `m8622bind$lambda0`(this@DownloadChildViewHolder, data, view)
                }
            })
        }

        @Override // com.lagradost.cloudstream3.p041ui.download.DownloadButtonViewHolder
        public override fun reattachDownloadButton() {
            getDownloadButton().dispose()
            val visualDownloadChildCached: VisualDownloadChildCached? = localCard
            if (visualDownloadChildCached != null) {
                getDownloadButton().setUpButton(
                    Long.valueOf(visualDownloadChildCached.getCurrentBytes()),
                    Long.valueOf(visualDownloadChildCached.getTotalBytes()),
                    progressBarDownload,
                    downloadImage,
                    extraInfo,
                    visualDownloadChildCached.getData(),
                    clickCallback
                )
            }
        }

        companion object {
            /* JADX INFO: Access modifiers changed from: private */ /* renamed from: bind$lambda-0  reason: not valid java name */
            fun `m8622bind$lambda0`(
                `this$0`: DownloadChildViewHolder,
                d: DownloadEpisodeCached?,
                view: View?
            ) {
                Intrinsics.checkNotNullParameter(`this$0`, "this$0")
                Intrinsics.checkNotNullParameter(d, "\$d")
                `this$0`.clickCallback.invoke(DownloadClickEvent(0, d))
            }
        }
    }
}