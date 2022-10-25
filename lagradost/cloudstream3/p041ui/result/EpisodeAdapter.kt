package com.lagradost.cloudstream3.p041ui.result

import android.content.Context
import com.lagradost.cloudstream3.p041ui.settings.SettingsFragment
import kotlin.jvm.internal.Intrinsics

/* compiled from: EpisodeAdapter.kt */
@Metadata(
    m108d1 = ["\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'BC\u0012\u000c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u0018\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0016J\u0006\u0010\u001b\u001a\u00020\u000bJ\u0018\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0014H\u0016J\u0018\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0014H\u0016J\u0010\u0010#\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0002H\u0016J\u0010\u0010$\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0002H\u0016J\u0010\u0010%\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0002H\u0016J\u0006\u0010&\u001a\u00020\u000bR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/result/EpisodeAdapter;", "Landroidx/recyclerview/widget/RecyclerView\$Adapter;", "Landroidx/recyclerview/widget/RecyclerView\$ViewHolder;", "cardList", "", "Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;", "hasDownloadSupport", "", "clickCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/ui/result/EpisodeClickEvent;", "", "downloadClickCallback", "Lcom/lagradost/cloudstream3/ui/download/DownloadClickEvent;", "(Ljava/util/List;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getCardList", "()Ljava/util/List;", "setCardList", "(Ljava/util/List;)V", TtmlNode.TAG_LAYOUT, "", "mBoundViewHolders", "Ljava/util/HashSet;", "Lcom/lagradost/cloudstream3/ui/download/DownloadButtonViewHolder;", "getAllBoundViewHolders", "", "getItemCount", "killAdapter", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewAttachedToWindow", "onViewDetachedFromWindow", "onViewRecycled", "updateLayout", "EpisodeCardViewHolder", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.result.EpisodeAdapter */ /* loaded from: classes4.dex */
class EpisodeAdapter constructor(
    cardList: List<ResultEpisode>,
    z: Boolean,
    clickCallback: Function1<EpisodeClickEvent?, Unit>,
    downloadClickCallback: Function1<DownloadClickEvent?, Unit>
) : RecyclerView.Adapter<RecyclerView.ViewHolder?>() {
    private var cardList: List<ResultEpisode>
    private val clickCallback: Function1<EpisodeClickEvent, Unit>
    private val downloadClickCallback: Function1<DownloadClickEvent, Unit>
    private val hasDownloadSupport: Boolean
    private var layout: Int = 0
    private val mBoundViewHolders: HashSet<DownloadButtonViewHolder>
    fun getCardList(): List<ResultEpisode> {
        return cardList
    }

    fun setCardList(list: List<ResultEpisode>) {
        Intrinsics.checkNotNullParameter(list, "<set-?>")
        cardList = list
    }

    /* JADX WARN: Multi-variable type inference failed */
    init {
        Intrinsics.checkNotNullParameter(cardList, "cardList")
        Intrinsics.checkNotNullParameter(clickCallback, "clickCallback")
        Intrinsics.checkNotNullParameter(downloadClickCallback, "downloadClickCallback")
        this.cardList = cardList
        hasDownloadSupport = z
        this.clickCallback = clickCallback
        this.downloadClickCallback = downloadClickCallback
        mBoundViewHolders = HashSet()
    }

    private val allBoundViewHolders: Set<Any>
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

    fun updateLayout() {
        val arrayList: ArrayList = ArrayList()
        for (obj: Object in cardList) {
            if ((obj as ResultEpisode).getPoster() != null) {
                arrayList.add(obj)
            }
        }
        layout =
            if ((arrayList.size() as Float) >= (cardList.size() as Float) / 2.0f) R.layout.result_episode_large else R.layout.result_episode
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public override fun onCreateViewHolder(parent: ViewGroup, i: Int): RecyclerView.ViewHolder {
        Intrinsics.checkNotNullParameter(parent, "parent")
        val inflate: View = LayoutInflater.from(parent.getContext()).inflate(layout, parent, false)
        Intrinsics.checkNotNullExpressionValue(
            inflate,
            "from(parent.context).inf…te(layout, parent, false)"
        )
        return EpisodeCardViewHolder(
            inflate,
            hasDownloadSupport,
            clickCallback,
            downloadClickCallback
        )
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public override fun onBindViewHolder(holder: RecyclerView.ViewHolder, i: Int) {
        Intrinsics.checkNotNullParameter(holder, "holder")
        if (holder is EpisodeCardViewHolder) {
            (holder as EpisodeCardViewHolder).bind(cardList.get(i))
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

    /* compiled from: EpisodeAdapter.kt */
    @Metadata(
        m108d1 = ["\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\u0010\rJ\u0010\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020\$H\u0007J\b\u0010+\u001a\u00020\nH\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010#\u001a\u0004\u0018\u00010\$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006,"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/result/EpisodeAdapter\$EpisodeCardViewHolder;", "Landroidx/recyclerview/widget/RecyclerView\$ViewHolder;", "Lcom/lagradost/cloudstream3/ui/download/DownloadButtonViewHolder;", "itemView", "Landroid/view/View;", "hasDownloadSupport", "", "clickCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/ui/result/EpisodeClickEvent;", "", "downloadClickCallback", "Lcom/lagradost/cloudstream3/ui/download/DownloadClickEvent;", "(Landroid/view/View;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "downloadButton", "Lcom/lagradost/cloudstream3/ui/download/EasyDownloadButton;", "getDownloadButton", "()Lcom/lagradost/cloudstream3/ui/download/EasyDownloadButton;", "setDownloadButton", "(Lcom/lagradost/cloudstream3/ui/download/EasyDownloadButton;)V", "episodeDescript", "Landroid/widget/TextView;", "episodeDownloadBar", "Landroidx/core/widget/ContentLoadingProgressBar;", "episodeDownloadImage", "Landroid/widget/ImageView;", "episodeFiller", "Lcom/google/android/material/button/MaterialButton;", "episodeHolder", "Landroidx/cardview/widget/CardView;", "kotlin.jvm.PlatformType", "episodePoster", "episodeProgress", "episodeRating", "episodeText", "localCard", "Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;", "getLocalCard", "()Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;", "setLocalCard", "(Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;)V", "bind", "card", "reattachDownloadButton", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.result.EpisodeAdapter$EpisodeCardViewHolder */ /* loaded from: classes4.dex */
    class EpisodeCardViewHolder constructor(
        itemView: View,
        z: Boolean,
        clickCallback: Function1<EpisodeClickEvent, Unit>,
        downloadClickCallback: Function1<DownloadClickEvent, Unit>
    ) : RecyclerView.ViewHolder(itemView), DownloadButtonViewHolder {
        private val clickCallback: Function1<EpisodeClickEvent, Unit>
        private var downloadButton: EasyDownloadButton
        private val downloadClickCallback: Function1<DownloadClickEvent, Unit>
        private val episodeDescript: TextView
        private val episodeDownloadBar: ContentLoadingProgressBar
        private val episodeDownloadImage: ImageView
        private val episodeFiller: MaterialButton
        private val episodeHolder: CardView
        private val episodePoster: ImageView
        private val episodeProgress: ContentLoadingProgressBar
        private val episodeRating: TextView
        private val episodeText: TextView
        private val hasDownloadSupport: Boolean
        var localCard: ResultEpisode? = null

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
        init {
            Intrinsics.checkNotNullParameter(itemView, "itemView")
            Intrinsics.checkNotNullParameter(clickCallback, "clickCallback")
            Intrinsics.checkNotNullParameter(downloadClickCallback, "downloadClickCallback")
            hasDownloadSupport = z
            this.clickCallback = clickCallback
            this.downloadClickCallback = downloadClickCallback
            downloadButton = EasyDownloadButton()
            val textView: TextView = itemView.findViewById(C4761R.C4764id.episode_text) as TextView
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.episode_text")
            episodeText = textView
            episodeFiller = itemView.findViewById(C4761R.C4764id.episode_filler) as MaterialButton
            episodeRating = itemView.findViewById(C4761R.C4764id.episode_rating) as TextView
            episodeDescript = itemView.findViewById(C4761R.C4764id.episode_descript) as TextView
            episodeProgress =
                itemView.findViewById(C4761R.C4764id.episode_progress) as ContentLoadingProgressBar
            episodePoster = itemView.findViewById(C4761R.C4764id.episode_poster) as ImageView
            val contentLoadingProgressBar: ContentLoadingProgressBar =
                itemView.findViewById(C4761R.C4764id.result_episode_progress_downloaded) as ContentLoadingProgressBar
            Intrinsics.checkNotNullExpressionValue(
                contentLoadingProgressBar,
                "itemView.result_episode_progress_downloaded"
            )
            episodeDownloadBar = contentLoadingProgressBar
            val imageView: ImageView =
                itemView.findViewById(C4761R.C4764id.result_episode_download) as ImageView
            Intrinsics.checkNotNullExpressionValue(imageView, "itemView.result_episode_download")
            episodeDownloadImage = imageView
            episodeHolder = itemView.findViewById(C4761R.C4764id.episode_holder) as CardView
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

        fun bind(card: ResultEpisode) {
            val sb: StringBuilder
            val str: String?
            var context: Context
            var string: String?
            Intrinsics.checkNotNullParameter(card, "card")
            localCard = card
            if (card.getName() == null) {
                sb = StringBuilder()
                sb.append(episodeText.getContext().getString(R.string.episode))
                sb.append(' ')
                sb.append(card.getEpisode())
            } else {
                sb = StringBuilder()
                sb.append(card.getEpisode())
                sb.append(". ")
                sb.append(card.getName())
            }
            val sb2: String = sb.toString()
            val materialButton: MaterialButton? = episodeFiller
            if (materialButton != null) {
                materialButton.setVisibility(
                    if (Intrinsics.areEqual(
                            card.isFiller() as Object?,
                            true as Object?
                        )
                    ) 0 else 8
                )
            }
            episodeText.setText(sb2)
            episodeText.setSelected(true)
            val displayPosition: Long = ResultFragmentPhimHDKt.getDisplayPosition(card)
            val contentLoadingProgressBar: ContentLoadingProgressBar? = episodeProgress
            if (contentLoadingProgressBar != null) {
                contentLoadingProgressBar.setMax((card.getDuration() / 1000).toInt())
            }
            val contentLoadingProgressBar2: ContentLoadingProgressBar? = episodeProgress
            if (contentLoadingProgressBar2 != null) {
                contentLoadingProgressBar2.setProgress((displayPosition / 1000).toInt())
            }
            val contentLoadingProgressBar3: ContentLoadingProgressBar? = episodeProgress
            if (contentLoadingProgressBar3 != null) {
                contentLoadingProgressBar3.setVisibility(if (displayPosition > 0) 0 else 8)
            }
            if (card.getPoster() != null) {
                val imageView: ImageView? = episodePoster
                if (imageView != null) {
                    imageView.setVisibility(0)
                }
                val imageView2: ImageView? = episodePoster
                if (imageView2 != null) {
                    UIHelper.`setImage$default`(
                        UIHelper.INSTANCE,
                        imageView2,
                        card.getPoster(),
                        null,
                        null,
                        6,
                        null
                    )
                }
            } else {
                val imageView3: ImageView? = episodePoster
                if (imageView3 != null) {
                    imageView3.setVisibility(8)
                }
            }
            if (card.getRating() != null) {
                val textView: TextView? = episodeRating
                if (textView != null) {
                    if ((textView == null) || ((textView.getContext().also({
                            context = it
                        })) == null) || ((context.getString(R.string.rated_format)
                            .also({ string = it })) == null)
                    ) {
                        str = null
                    } else {
                        str = String.format(
                            string,
                            Arrays.copyOf(
                                arrayOf<Object>(
                                    Float.valueOf(
                                        card.getRating().intValue() / 10.0f
                                    )
                                ), 1
                            )
                        )
                        Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)")
                    }
                    textView.setText(str)
                }
            } else {
                val textView2: TextView? = episodeRating
                if (textView2 != null) {
                    textView2.setText("")
                }
            }
            if (card.getDescription() != null) {
                val textView3: TextView? = episodeDescript
                if (textView3 != null) {
                    textView3.setVisibility(0)
                }
                val textView4: TextView? = episodeDescript
                if (textView4 != null) {
                    textView4.setText(card.getDescription())
                }
            } else {
                val textView5: TextView? = episodeDescript
                if (textView5 != null) {
                    textView5.setVisibility(8)
                }
            }
            val imageView4: ImageView? = episodePoster
            if (imageView4 != null) {
                imageView4.setOnClickListener(object : OnClickListener() {
                    // from class: com.lagradost.cloudstream3.ui.result.-$$Lambda$EpisodeAdapter$EpisodeCardViewHolder$hpSo3PdWLu3t7mraFmGjtdl7xGQ
                    @Override // android.view.View.OnClickListener
                    fun onClick(view: View?) {
                        `m8754bind$lambda0`(this@EpisodeCardViewHolder, card, view)
                    }
                })
            }
            val imageView5: ImageView? = episodePoster
            if (imageView5 != null) {
                imageView5.setOnLongClickListener(object : OnLongClickListener() {
                    // from class: com.lagradost.cloudstream3.ui.result.-$$Lambda$EpisodeAdapter$EpisodeCardViewHolder$H0X8QY2nVVKgKis1YUyfxQL_iOw
                    @Override // android.view.View.OnLongClickListener
                    fun onLongClick(view: View?): Boolean {
                        val `m8755bind$lambda1`: Boolean
                        `m8755bind$lambda1` =
                            `m8755bind$lambda1`(this@EpisodeCardViewHolder, card, view)
                        return `m8755bind$lambda1`
                    }
                })
            }
            episodeHolder.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.result.-$$Lambda$EpisodeAdapter$EpisodeCardViewHolder$VP0GW3WKvVSJ-wfPpH10jig36Po
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    `m8756bind$lambda2`(this@EpisodeCardViewHolder, card, view)
                }
            })
            val companion: SettingsFragment.Companion = SettingsFragment.Companion.Companion
            val context2: Context = episodeHolder.getContext()
            Intrinsics.checkNotNullExpressionValue(context2, "episodeHolder.context")
            if (companion.isTrueTvSettings(context2)) {
                episodeHolder.setFocusable(true)
                episodeHolder.setFocusableInTouchMode(true)
                episodeHolder.setTouchscreenBlocksFocus(false)
            }
            episodeHolder.setOnLongClickListener(object : OnLongClickListener() {
                // from class: com.lagradost.cloudstream3.ui.result.-$$Lambda$EpisodeAdapter$EpisodeCardViewHolder$dSo0Svc_cii1czG5TxbCRsV4yGE
                @Override // android.view.View.OnLongClickListener
                fun onLongClick(view: View?): Boolean {
                    val `m8757bind$lambda3`: Boolean
                    `m8757bind$lambda3` =
                        `m8757bind$lambda3`(this@EpisodeCardViewHolder, card, view)
                    return `m8757bind$lambda3`
                }
            })
            episodeDownloadImage.setVisibility(if (hasDownloadSupport) 0 else 8)
            episodeDownloadBar.setVisibility(if (hasDownloadSupport) 0 else 8)
        }

        @Override // com.lagradost.cloudstream3.p041ui.download.DownloadButtonViewHolder
        public override fun reattachDownloadButton() {
            getDownloadButton().dispose()
            val resultEpisode: ResultEpisode? = localCard
            if (!hasDownloadSupport || resultEpisode == null) {
                return
            }
            val videoDownloadManager: VideoDownloadManager = VideoDownloadManager.INSTANCE
            val context: Context = this.itemView.getContext()
            Intrinsics.checkNotNullExpressionValue(context, "itemView.context")
            val downloadFileInfoAndUpdateSettings: DownloadedFileInfoResult? =
                videoDownloadManager.getDownloadFileInfoAndUpdateSettings(
                    context,
                    resultEpisode.getId()
                )
            getDownloadButton().setUpButton(
                if (downloadFileInfoAndUpdateSettings != null) Long.valueOf(
                    downloadFileInfoAndUpdateSettings.fileLength
                ) else null,
                if (downloadFileInfoAndUpdateSettings != null) Long.valueOf(
                    downloadFileInfoAndUpdateSettings.totalBytes
                ) else null,
                episodeDownloadBar,
                episodeDownloadImage,
                null,
                DownloadEpisodeCached(
                    resultEpisode.getName(),
                    resultEpisode.getPoster(),
                    resultEpisode.getEpisode(),
                    resultEpisode.getSeason(),
                    resultEpisode.getId(),
                    resultEpisode.getParentId(),
                    resultEpisode.getRating(),
                    resultEpisode.getDescription(),
                    System.currentTimeMillis()
                ),
                `EpisodeAdapter$EpisodeCardViewHolder$reattachDownloadButton$1`(this, resultEpisode)
            )
        }

        companion object {
            /* JADX INFO: Access modifiers changed from: private */ /* renamed from: bind$lambda-0  reason: not valid java name */
            fun `m8754bind$lambda0`(
                `this$0`: EpisodeCardViewHolder,
                card: ResultEpisode?,
                view: View?
            ) {
                Intrinsics.checkNotNullParameter(`this$0`, "this$0")
                Intrinsics.checkNotNullParameter(card, "\$card")
                `this$0`.clickCallback.invoke(EpisodeClickEvent(11, card))
            }

            /* JADX INFO: Access modifiers changed from: private */ /* renamed from: bind$lambda-1  reason: not valid java name */
            fun `m8755bind$lambda1`(
                `this$0`: EpisodeCardViewHolder,
                card: ResultEpisode?,
                view: View?
            ): Boolean {
                Intrinsics.checkNotNullParameter(`this$0`, "this$0")
                Intrinsics.checkNotNullParameter(card, "\$card")
                `this$0`.clickCallback.invoke(EpisodeClickEvent(12, card))
                return true
            }

            /* JADX INFO: Access modifiers changed from: private */ /* renamed from: bind$lambda-2  reason: not valid java name */
            fun `m8756bind$lambda2`(
                `this$0`: EpisodeCardViewHolder,
                card: ResultEpisode?,
                view: View?
            ) {
                Intrinsics.checkNotNullParameter(`this$0`, "this$0")
                Intrinsics.checkNotNullParameter(card, "\$card")
                `this$0`.clickCallback.invoke(EpisodeClickEvent(11, card))
            }

            /* JADX INFO: Access modifiers changed from: private */ /* renamed from: bind$lambda-3  reason: not valid java name */
            fun `m8757bind$lambda3`(
                `this$0`: EpisodeCardViewHolder,
                card: ResultEpisode?,
                view: View?
            ): Boolean {
                Intrinsics.checkNotNullParameter(`this$0`, "this$0")
                Intrinsics.checkNotNullParameter(card, "\$card")
                `this$0`.clickCallback.invoke(EpisodeClickEvent(10, card))
                return true
            }
        }
    }
}