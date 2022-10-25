package com.lagradost.cloudstream3.p041ui.result

import android.app.Activity
import androidx.fragment.app.Fragment
import com.lagradost.cloudstream3.p041ui.WatchType
import com.lagradost.cloudstream3.utils.AppUtils
import com.phimhd.Key
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Functions
import kotlin.jvm.internal.Intrinsics

/* compiled from: ResultFragmentPhimHD.kt */
@Metadata(
    m108d1 = ["\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 e2\u00020\u00012\u00020\u0002:\u0002efB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010*\u001a\u00020+H\u0002J\u0017\u0010,\u001a\u00020\b2\b\u0010-\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0002\u0010.J\u0016\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u00020\b2\u0006\u00101\u001a\u00020\bJ\u0010\u00102\u001a\u00020+2\u0006\u00103\u001a\u00020\rH\u0002J\u0018\u00104\u001a\u00020+2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\bH\u0002J\u0010\u00108\u001a\u00020+2\u0006\u00109\u001a\u00020:H\u0016J&\u0010;\u001a\u0004\u0018\u00010<2\u0006\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\b\u0010C\u001a\u00020+H\u0016J\b\u0010D\u001a\u00020+H\u0016J\u0016\u0010E\u001a\u00020+2\u000c\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u0005H\u0016J\b\u0010H\u001a\u00020+H\u0016J\b\u0010I\u001a\u00020+H\u0016J\u001a\u0010J\u001a\u00020+2\u0006\u0010K\u001a\u00020<2\b\u0010A\u001a\u0004\u0018\u00010BH\u0017J\u0018\u0010L\u001a\u00020+2\u000e\u0010M\u001a\n\u0012\u0004\u0012\u00020N\u0018\u00010\u0005H\u0002J\u0017\u0010O\u001a\u00020+2\b\u0010P\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0002\u0010\u001dJ&\u0010Q\u001a\u00020+2\b\u0010R\u001a\u0004\u0018\u00010S2\b\b\u0001\u0010T\u001a\u00020\n2\b\u0010U\u001a\u0004\u0018\u00010VH\u0002J\u0017\u0010W\u001a\u00020+2\b\u0010X\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0002\u0010\u001dJ\"\u0010Y\u001a\u00020+2\u000e\u0010Z\u001a\n\u0012\u0004\u0012\u00020[\u0018\u00010\u00052\b\u0010\\\u001a\u0004\u0018\u00010\bH\u0002J\u0012\u0010]\u001a\u00020+2\b\u0010^\u001a\u0004\u0018\u00010_H\u0002J\u0017\u0010`\u001a\u00020+2\b\u0010a\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0002\u0010\u001dJ\b\u0010b\u001a\u00020+H\u0002J\u0010\u0010c\u001a\u00020+2\u0006\u0010d\u001a\u00020\nH\u0002R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0012\u0010\u001e\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\u001f\u001a\u00020 X\u0082.¢\u0006\u0002\n\u0000R\u001c\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010#\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u000e\u0010(\u001a\u00020)X\u0082.¢\u0006\u0002\n\u0000¨\u0006g"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/result/ResultFragmentPhimHD;", "Landroidx/fragment/app/Fragment;", "Lcom/discord/panels/PanelsChildGestureRegionObserver\$GestureRegionsListener;", "()V", "currentEpisodes", "", "Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;", "currentHeaderName", "", "currentId", "", "Ljava/lang/Integer;", "currentIsMovie", "", "Ljava/lang/Boolean;", "currentLoadingCount", "currentPoster", "currentType", "Lcom/lagradost/cloudstream3/TvType;", "downloadButton", "Lcom/lagradost/cloudstream3/ui/download/EasyDownloadButton;", "dubRange", "", "Lcom/lagradost/cloudstream3/DubStatus;", "episodeRanges", "startAction", "getStartAction", "()Ljava/lang/Integer;", "setStartAction", "(Ljava/lang/Integer;)V", "startValue", "syncModel", "Lcom/lagradost/cloudstream3/ui/result/SyncViewModel;", "syncdata", "", "url", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "viewModel", "Lcom/lagradost/cloudstream3/ui/result/ResultViewModel;", "fixGrid", "", "fromIndexToSeasonText", "selection", "(Ljava/lang/Integer;)Ljava/lang/String;", "getHtmlComment", "idPost", "shortName", "lateFixDownloadButton", "show", "loadComments", "web", "Landroid/webkit/WebView;", "urlReview", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onDestroyView", "onGestureRegionsUpdate", "gestureRegions", "Landroid/graphics/Rect;", "onPause", "onResume", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "setActors", "actors", "Lcom/lagradost/cloudstream3/ActorData;", "setDuration", TypedValues.TransitionType.S_DURATION, "setFormatText", "textView", "Landroid/widget/TextView;", "format", "arg", "", "setRating", "rating", "setRecommendations", "rec", "Lcom/lagradost/cloudstream3/SearchResponse;", "validApiName", "setShow", "showStatus", "Lcom/lagradost/cloudstream3/ShowStatus;", "setYear", "year", "updateUI", "updateVisStatus", ServerProtocol.DIALOG_PARAM_STATE, "Companion", "UriWebViewClient", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD */ /* loaded from: classes4.dex */
class ResultFragmentPhimHD constructor() : Fragment(), GestureRegionsListener {
    var `_$_findViewCache`: Map<Integer, View> = LinkedHashMap()
    val currentEpisodes: List<ResultEpisode>? = null
    val currentHeaderName: String? = null
    val currentId: Integer? = null
    val currentIsMovie: Boolean? = null
    val currentLoadingCount: Int = 0
    val currentPoster: String? = null
    val currentType: TvType? = null
    val downloadButton: EasyDownloadButton? = null
    private val dubRange: Set<DubStatus>? = null
    private val episodeRanges: List<String>? = null
    var startAction: Integer? = null
    private val startValue: Integer? = null
    var syncModel: SyncViewModel? = null
    val syncdata: Map<String, String>? = null
    var url: String? = null
    var viewModel: ResultViewModel? = null

    /* compiled from: ResultFragmentPhimHD.kt */
    @Metadata(
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD$WhenMappings */ /* loaded from: classes4.dex */
    /* synthetic */
    object WhenMappings {
        /* synthetic */ val `$EnumSwitchMapping$0`: IntArray

        init {
            val iArr: IntArray = IntArray(ShowStatus.values().size)
            com.lagradost.cloudstream3.p041ui.result.iArr.get(ShowStatus.Ongoing.ordinal()) = 1
            com.lagradost.cloudstream3.p041ui.result.iArr.get(ShowStatus.Completed.ordinal()) = 2
            `$EnumSwitchMapping$0` = com.lagradost.cloudstream3.p041ui.result.iArr
        }
    }

    fun `_$_clearFindViewByIdCache`() {
        `_$_findViewCache`.clear()
    }

    fun `_$_findCachedViewById`(i: Int): View? {
        var findViewById: View?
        val map: Map<Integer, View> = `_$_findViewCache`
        val view: View? = map.get(Integer.valueOf(i))
        if (view == null) {
            val view2: View? = getView()
            if (view2 == null || (view2.findViewById(i).also({ findViewById = it })) == null) {
                return null
            }
            map.put(Integer.valueOf(i), findViewById)
            return findViewById
        }
        return view
    }

    /* compiled from: ResultFragmentPhimHD.kt */
    @Metadata(
        m108d1 = ["\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J[\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ\"\u0010\u001e\u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\$H\u0002J*\u0010\u001e\u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0004H\u0002J\u0018\u0010(\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u0004H\u0002J8\u0010*\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u0017H\u0002J)\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u00020\u001b2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u001b¢\u0006\u0002\u00102J*\u0010,\u001a\u00020-2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020\u001b2\b\b\u0002\u00101\u001a\u00020\u001bJn\u00103\u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00042\u000c\u00104\u001a\b\u0012\u0004\u0012\u000206052\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u000105J\u0006\u00108\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000cX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00069"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/result/ResultFragmentPhimHD\$Companion;", "", "()V", "API_NAME_BUNDLE", "", "EPISODE_BUNDLE", "RESTART_BUNDLE", "SEASON_BUNDLE", "START_ACTION_BUNDLE", "START_VALUE_BUNDLE", "URL_BUNDLE", "updateUIListener", "Lkotlin/Function0;", "", "downloadEpisode", "activity", "Landroid/app/Activity;", "episode", "Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;", "currentIsMovie", "", "currentHeaderName", "currentType", "Lcom/lagradost/cloudstream3/TvType;", "currentPoster", "apiName", "parentId", "", "url", "(Landroid/app/Activity;Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;ZLjava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadSubtitle", "context", "Landroid/content/Context;", "link", "Lcom/lagradost/cloudstream3/ui/player/SubtitleData;", "meta", "Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadEpisodeMetadata;", "Lcom/lagradost/cloudstream3/utils/ExtractorSubtitleLink;", "fileName", "folder", "getFolder", "titleName", "getMeta", "tvType", "newInstance", "Landroid/os/Bundle;", "card", "Lcom/lagradost/cloudstream3/SearchResponse;", "startAction", "startValue", "(Lcom/lagradost/cloudstream3/SearchResponse;ILjava/lang/Integer;)Landroid/os/Bundle;", "startDownload", "links", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "subs", "updateUI", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD$Companion */ /* loaded from: classes4.dex */
    class Companion private constructor() {
        /* compiled from: ResultFragmentPhimHD.kt */
        @Metadata(
            m106k = 3,
            m105mv = [1, 6, 0],
            m103xi = 48
        ) /* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD$Companion$WhenMappings */ /* loaded from: classes4.dex */
        /* synthetic */
        object WhenMappings {
            /* synthetic */ val `$EnumSwitchMapping$0`: IntArray

            init {
                val iArr: IntArray = IntArray(TvType.values().size)
                com.lagradost.cloudstream3.p041ui.result.iArr.get(TvType.Anime.ordinal()) = 1
                com.lagradost.cloudstream3.p041ui.result.iArr.get(TvType.Movie.ordinal()) = 2
                com.lagradost.cloudstream3.p041ui.result.iArr.get(TvType.AnimeMovie.ordinal()) = 3
                com.lagradost.cloudstream3.p041ui.result.iArr.get(TvType.TvSeries.ordinal()) = 4
                com.lagradost.cloudstream3.p041ui.result.iArr.get(TvType.OVA.ordinal()) = 5
                com.lagradost.cloudstream3.p041ui.result.iArr.get(TvType.Cartoon.ordinal()) = 6
                com.lagradost.cloudstream3.p041ui.result.iArr.get(TvType.Torrent.ordinal()) = 7
                com.lagradost.cloudstream3.p041ui.result.iArr.get(TvType.Documentary.ordinal()) = 8
                com.lagradost.cloudstream3.p041ui.result.iArr.get(TvType.AsianDrama.ordinal()) = 9
                `$EnumSwitchMapping$0` = com.lagradost.cloudstream3.p041ui.result.iArr
            }
        }

        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        fun newInstance(card: SearchResponse, i: Int, num: Integer?): Bundle {
            Intrinsics.checkNotNullParameter(card, "card")
            val bundle: Bundle = Bundle()
            bundle.putString("url", card.url)
            bundle.putString("apiName", card.apiName)
            if (card is ResumeWatchingResult) {
                val resumeWatchingResult: ResumeWatchingResult = card as ResumeWatchingResult
                if (resumeWatchingResult.getSeason() != null) {
                    bundle.putInt("season", resumeWatchingResult.getSeason().intValue())
                }
                if (resumeWatchingResult.getEpisode() != null) {
                    bundle.putInt("episode", resumeWatchingResult.getEpisode().intValue())
                }
            }
            bundle.putInt("startAction", i)
            if (num != null) {
                bundle.putInt("startValue", num.intValue())
            }
            bundle.putBoolean("restart", true)
            return bundle
        }

        fun newInstance(url: String?, apiName: String?, i: Int, i2: Int): Bundle {
            Intrinsics.checkNotNullParameter(url, "url")
            Intrinsics.checkNotNullParameter(apiName, "apiName")
            val bundle: Bundle = Bundle()
            bundle.putString("url", url)
            bundle.putString("apiName", apiName)
            bundle.putInt("startAction", i)
            bundle.putInt("startValue", i2)
            bundle.putBoolean("restart", true)
            return bundle
        }

        fun updateUI() {
            val functions: Functions<*>? = ResultFragmentPhimHD.Companion.updateUIListener
            if (functions != null) {
                functions.invoke()
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        fun downloadSubtitle(
            context: Context?,
            subtitleData: SubtitleData,
            downloadEpisodeMetadata: DownloadEpisodeMetadata
        ) {
            if (context != null) {
                val fileName: String =
                    VideoDownloadManager.INSTANCE.getFileName(context, downloadEpisodeMetadata)
                val companion: ResultFragmentPhimHD.Companion = Companion
                val type: TvType? = downloadEpisodeMetadata.getType()
                if (type == null) {
                    return
                }
                Companion.downloadSubtitle(
                    context,
                    ExtractorSubtitleLink(
                        subtitleData.getName(),
                        subtitleData.getUrl(),
                        "",
                        null,
                        8,
                        null
                    ),
                    fileName,
                    companion.getFolder(type, downloadEpisodeMetadata.mainName)
                )
            }
        }

        private fun downloadSubtitle(
            context: Context,
            extractorSubtitleLink: ExtractorSubtitleLink,
            str: String,
            str2: String
        ) {
            Coroutines.INSTANCE.ioSafe(
                `ResultFragmentPhimHD$Companion$downloadSubtitle$2`(
                    context,
                    extractorSubtitleLink,
                    str,
                    str2,
                    null
                )
            )
        }

        /* JADX INFO: Access modifiers changed from: private */
        fun getMeta(
            resultEpisode: ResultEpisode,
            str: String?,
            str2: String?,
            str3: String?,
            z: Boolean,
            tvType: TvType?
        ): DownloadEpisodeMetadata {
            val id: Int = resultEpisode.getId()
            val sanitizeFilename: String = VideoDownloadManager.INSTANCE.sanitizeFilename(str)
            val poster: String? = resultEpisode.getPoster()
            return DownloadEpisodeMetadata(
                id,
                sanitizeFilename,
                str2,
                if (poster == null) str3 else poster,
                resultEpisode.getName(),
                if (z) null else resultEpisode.getSeason(),
                if (z) null else Integer.valueOf(resultEpisode.getEpisode()),
                tvType
            )
        }

        private fun getFolder(tvType: TvType, str: String): String {
            val sanitizeFilename: String = VideoDownloadManager.INSTANCE.sanitizeFilename(str)
            when (WhenMappings.`$EnumSwitchMapping$0`.get(tvType.ordinal())) {
                1 -> return "Anime/" + sanitizeFilename
                2, 3 -> return "Movies"
                4 -> return "TVSeries/" + sanitizeFilename
                5 -> return "OVA"
                6 -> return "Cartoons/" + sanitizeFilename
                7 -> return "Torrent"
                8 -> return "Documentaries"
                9 -> return "AsianDrama"
                else -> throw NoWhenBranchMatchedException()
            }
        }

        fun startDownload(
            context: Context?,
            episode: ResultEpisode,
            z: Boolean,
            currentHeaderName: String,
            currentType: TvType?,
            currentPoster: String?,
            apiName: String?,
            i: Int,
            url: String?,
            links: List<ExtractorLink?>?,
            list: List<SubtitleData?>?
        ) {
            Intrinsics.checkNotNullParameter(episode, "episode")
            Intrinsics.checkNotNullParameter(currentHeaderName, "currentHeaderName")
            Intrinsics.checkNotNullParameter(currentType, "currentType")
            Intrinsics.checkNotNullParameter(currentPoster, "currentPoster")
            Intrinsics.checkNotNullParameter(apiName, "apiName")
            Intrinsics.checkNotNullParameter(url, "url")
            Intrinsics.checkNotNullParameter(links, "links")
            if (context == null) {
                return
            }
            try {
                val meta: DownloadEpisodeMetadata =
                    getMeta(episode, currentHeaderName, apiName, currentPoster, z, currentType)
                val folder: String = getFolder(currentType, currentHeaderName)
                AcraApplication.Companion.setKey(
                    DataStoreKt.DOWNLOAD_HEADER_CACHE,
                    String.valueOf(i),
                    DownloadHeaderCached(
                        apiName,
                        url,
                        currentType,
                        currentHeaderName,
                        currentPoster,
                        i,
                        System.currentTimeMillis()
                    )
                )
                AcraApplication.Companion.setKey(
                    DataStore.INSTANCE.getFolderName(
                        DataStoreKt.DOWNLOAD_EPISODE_CACHE,
                        String.valueOf(i)
                    ),
                    String.valueOf(episode.getId()),
                    DownloadEpisodeCached(
                        episode.getName(),
                        episode.getPoster(),
                        episode.getEpisode(),
                        episode.getSeason(),
                        episode.getId(),
                        i,
                        episode.getRating(),
                        episode.getDescription(),
                        System.currentTimeMillis()
                    )
                )
                VideoDownloadManager.INSTANCE.downloadEpisodeUsingWorker(
                    context,
                    "downloadpage/" + i,
                    folder,
                    meta,
                    links
                )
                val downloadSubsLanguageISO639_1: List<String> =
                    SubtitlesFragment.Companion.Companion.getDownloadSubsLanguageISO639_1()
                if (list != null) {
                    val arrayList: ArrayList = ArrayList()
                    for (obj: Object? in list) {
                        if (CollectionsKt.contains(
                                downloadSubsLanguageISO639_1,
                                SubtitleHelper.INSTANCE.fromLanguageToTwoLetters(
                                    (obj as SubtitleData).getName(),
                                    true
                                )
                            )
                        ) {
                            arrayList.add(obj)
                        }
                    }
                    val arrayList2: ArrayList<SubtitleData> = arrayList
                    val arrayList3: ArrayList<ExtractorSubtitleLink> =
                        ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10))
                    for (subtitleData: SubtitleData in arrayList2) {
                        arrayList3.add(
                            ExtractorSubtitleLink(
                                subtitleData.getName(),
                                subtitleData.getUrl(),
                                "",
                                null,
                                8,
                                null
                            )
                        )
                    }
                    for (extractorSubtitleLink: ExtractorSubtitleLink? in arrayList3) {
                        Companion.downloadSubtitle(
                            context,
                            extractorSubtitleLink,
                            VideoDownloadManager.INSTANCE.getFileName(context, meta),
                            folder
                        )
                    }
                }
            } catch (e: Exception) {
                ArchComponentExt.logError(e)
            }
        }

        fun downloadEpisode(
            activity: Activity,
            resultEpisode: ResultEpisode?,
            z: Boolean,
            str: String?,
            tvType: TvType?,
            str2: String?,
            str3: String?,
            i: Int,
            str4: String?,
            continuation: Continuation<in Unit>?
        ): Object {
            val companion: AppController? = AppController.Companion.getInstance()
            if ((if (companion != null) companion.getKey() else null) != null) {
                val companion2: AppController? = AppController.Companion.getInstance()
                val key: Key? = if (companion2 != null) companion2.getKey() else null
                Intrinsics.checkNotNull(key)
                if (key!!.isExpired()) {
                    Log.d("DuongKK", "start Countdownads")
                    Objects.requireNonNull(
                        activity,
                        "null cannot be cast to non-null type com.lagradost.cloudstream3.MainActivity"
                    )
                    (activity as MainActivity).showDialogUpgrade()
                    return Unit.INSTANCE
                }
                CommonActivity.INSTANCE.showToast(activity, R.string.download_started, 0)
                val safeApiCall: Object = ArchComponentExt.safeApiCall(
                    `ResultFragmentPhimHD$Companion$downloadEpisode$2`(
                        resultEpisode,
                        activity,
                        z,
                        str,
                        tvType,
                        str2,
                        str3,
                        i,
                        str4,
                        null
                    ), continuation
                )
                return if (safeApiCall === IntrinsicsKt.getCOROUTINE_SUSPENDED()) safeApiCall else Unit.INSTANCE
            }
            Objects.requireNonNull(
                activity,
                "null cannot be cast to non-null type com.lagradost.cloudstream3.MainActivity"
            )
            (activity as MainActivity).showDialogUpgrade()
            return Unit.INSTANCE
        }

        companion object {
            fun  /* synthetic */`newInstance$default`(
                companion: ResultFragmentPhimHD.Companion,
                searchResponse: SearchResponse,
                i: Int,
                num: Integer?,
                i2: Int,
                obj: Object?
            ): Bundle {
                var i: Int = i
                var num: Integer? = num
                if ((i2 and 2) != 0) {
                    i = 0
                }
                if ((i2 and 4) != 0) {
                    num = null
                }
                return companion.newInstance(searchResponse, i, num)
            }

            fun  /* synthetic */`newInstance$default`(
                companion: ResultFragmentPhimHD.Companion,
                str: String?,
                str2: String?,
                i: Int,
                i2: Int,
                i3: Int,
                obj: Object?
            ): Bundle {
                var i: Int = i
                var i2: Int = i2
                if ((i3 and 4) != 0) {
                    i = 0
                }
                if ((i3 and 8) != 0) {
                    i2 = 0
                }
                return companion.newInstance(str, str2, i, i2)
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onCreateView(
        inflater: LayoutInflater,
        viewGroup: ViewGroup,
        bundle: Bundle
    ): View {
        Intrinsics.checkNotNullParameter(inflater, "inflater")
        val resultFragmentPhimHD: ResultFragmentPhimHD = this
        viewModel = ViewModelProvider(resultFragmentPhimHD).get(ResultViewModel::class.java)
        syncModel = ViewModelProvider(resultFragmentPhimHD).get(SyncViewModel::class.java)
        return inflater.inflate(R.layout.fragment_result_swipe, viewGroup, false)
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onDestroyView() {
        val recyclerView: RecyclerView? =
            `_$_findCachedViewById`(C4761R.C4764id.result_episodes) as RecyclerView?
        val episodeAdapter: EpisodeAdapter? =
            (if (recyclerView != null) recyclerView.getAdapter() else null)
        if (episodeAdapter != null) {
            episodeAdapter.killAdapter()
        }
        super.onDestroyView()
        `_$_clearFindViewByIdCache`()
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onDestroy() {
        val easyDownloadButton: EasyDownloadButton? = downloadButton
        if (easyDownloadButton != null) {
            easyDownloadButton.dispose()
        }
        Companion.updateUIListener = null
        val recyclerView: RecyclerView? =
            `_$_findCachedViewById`(C4761R.C4764id.result_cast_items) as RecyclerView?
        if (recyclerView != null) {
            PanelsChildGestureRegionObserver.Provider.get().unregister(recyclerView)
        }
        super.onDestroy()
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onResume() {
        var window: Window
        super.onResume()
        val activity: FragmentActivity? = getActivity()
        if (activity == null || (activity.getWindow().also({ window = it })) == null) {
            return
        }
        window.setNavigationBarColor(
            UIHelper.INSTANCE.colorFromAttribute(
                activity,
                R.attr.primaryBlackBackground
            )
        )
    }

    /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Code restructure failed: missing block: B:44:0x0086, code lost:
        if ((r5.getVisibility() == 0) == true) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */ /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun updateVisStatus(r5: Int) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.p041ui.result.ResultFragmentPhimHD.updateVisStatus(int):void")
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun fromIndexToSeasonText(num: Integer?): String {
        if (num == null) {
            val string: String = getString(R.string.no_season)
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.no_season)")
            return string
        } else if (num.intValue() === -2) {
            val string2: String = getString(R.string.no_season)
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.no_season)")
            return string2
        } else {
            return getString(R.string.season) + ' ' + num
        }
    }

    private fun setFormatText(textView: TextView?, i: Int, obj: Object?) {
        ArchComponentExt.normalSafeApiCall<Unit>(
            `ResultFragmentPhimHD$setFormatText$1`(
                obj,
                textView,
                this,
                i
            )
        )
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun setDuration(num: Integer?) {
        setFormatText(
            `_$_findCachedViewById`(C4761R.C4764id.result_meta_duration) as TextView?,
            R.string.duration_format,
            num
        )
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun setShow(showStatus: ShowStatus?) {
        val num: Integer?
        var string: String?
        var textView: TextView
        val i: Int =
            if (showStatus == null) -1 else WhenMappings.`$EnumSwitchMapping$0`.get(showStatus.ordinal())
        if (i == -1) {
            num = null
        } else if (i == 1) {
            num = Integer.valueOf(R.string.status_ongoing as Int)
        } else if (i != 2) {
            throw NoWhenBranchMatchedException()
        } else {
            num = Integer.valueOf(R.string.status_completed as Int)
        }
        if (num == null) {
            val textView2: TextView? =
                `_$_findCachedViewById`(C4761R.C4764id.result_meta_status) as TextView?
            if (textView2 == null) {
                return
            }
            textView2.setVisibility(8)
            return
        }
        val context: Context? = getContext()
        if ((context == null) || ((context.getString(num.intValue()).also({
                string = it
            })) == null) || ((`_$_findCachedViewById`(C4761R.C4764id.result_meta_status) as TextView?. also ({
                textView = it
            })) == null)) {
            return
        }
        textView.setText(string)
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun setYear(num: Integer?) {
        setFormatText(
            `_$_findCachedViewById`(C4761R.C4764id.result_meta_year) as TextView?,
            R.string.year_format,
            num
        )
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun setRating(num: Integer?) {
        setFormatText(
            `_$_findCachedViewById`(C4761R.C4764id.result_meta_rating) as TextView?,
            R.string.rating_format,
            if (num != null) Float.valueOf(num.intValue() / 1000.0f) else null
        )
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun setActors(list: List<ActorData>?) {
        val list2: List<ActorData>? = list
        val z: Boolean = true
        if (list2 == null || list2.isEmpty()) {
            val textView: TextView? =
                `_$_findCachedViewById`(C4761R.C4764id.result_cast_text) as TextView?
            if (textView != null) {
                textView.setVisibility(0)
            }
            val recyclerView: RecyclerView? =
                `_$_findCachedViewById`(C4761R.C4764id.result_cast_items) as RecyclerView?
            if (recyclerView != null) {
                recyclerView.setVisibility(8)
            }
            setFormatText(
                `_$_findCachedViewById`(C4761R.C4764id.result_cast_text) as TextView?,
                R.string.cast_format,
                getString(R.string.updating)
            )
            return
        }
        if ((CollectionsKt.first<Any>(list as List<Object?>?) as ActorData).actor.image != null) {
            val context: Context? = getContext()
            if (if ((context == null || !SettingsFragment.Companion.Companion.isTvSettings(context))) false else false) {
                val recyclerView2: RecyclerView? =
                    `_$_findCachedViewById`(C4761R.C4764id.result_cast_items) as RecyclerView?
                val actorAdaptor: ActorAdaptor? =
                    (if (recyclerView2 != null) recyclerView2.getAdapter() else null)
                if (actorAdaptor != null) {
                    actorAdaptor.updateList(list)
                }
                val textView2: TextView? =
                    `_$_findCachedViewById`(C4761R.C4764id.result_cast_text) as TextView?
                if (textView2 != null) {
                    textView2.setVisibility(8)
                }
                val recyclerView3: RecyclerView? =
                    `_$_findCachedViewById`(C4761R.C4764id.result_cast_items) as RecyclerView?
                if (recyclerView3 == null) {
                    return
                }
                recyclerView3.setVisibility(0)
                return
            }
        }
        val textView3: TextView? =
            `_$_findCachedViewById`(C4761R.C4764id.result_cast_text) as TextView?
        if (textView3 != null) {
            textView3.setVisibility(0)
        }
        val recyclerView4: RecyclerView? =
            `_$_findCachedViewById`(C4761R.C4764id.result_cast_items) as RecyclerView?
        if (recyclerView4 != null) {
            recyclerView4.setVisibility(8)
        }
        setFormatText(
            `_$_findCachedViewById`(C4761R.C4764id.result_cast_text) as TextView?,
            R.string.cast_format,
            CollectionsKt.`joinToString$default`(
                list,
                null,
                null,
                null,
                0,
                null,
                `ResultFragmentPhimHD$setActors$2`.Companion.INSTANCE,
                31,
                null
            )
        )
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun setRecommendations(list: List<SearchResponse>?, str: String?) {
        var str: String? = str
        var result_recommendations_filter_button: MaterialButton
        var searchResponse: SearchResponse
        val list2: List<SearchResponse>? = list
        val z: Boolean = list2 == null || list2.isEmpty()
        val imageView: ImageView? =
            `_$_findCachedViewById`(C4761R.C4764id.result_recommendations_btt) as ImageView?
        if (imageView != null) {
            imageView.setVisibility(if (z) 8 else 0)
        }
        val imageView2: ImageView? =
            `_$_findCachedViewById`(C4761R.C4764id.result_recommendations_btt) as ImageView?
        if (imageView2 != null) {
            imageView2.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.result.-$$Lambda$ResultFragmentPhimHD$NHzZk2JY4iye8KqdNlANecH56WQ
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    Companion.`m8780setRecommendations$lambda4`(this@ResultFragmentPhimHD, view)
                }
            })
        }
        val overlappingPanelsLayout: OverlappingPanelsLayout? =
            `_$_findCachedViewById`(C4761R.C4764id.result_overlapping_panels) as OverlappingPanelsLayout?
        if (overlappingPanelsLayout != null) {
            overlappingPanelsLayout.setEndPanelLockState(OverlappingPanelsLayout.LockState.CLOSE)
        }
        var unit: Unit = null
        if (str == null) {
            str =
                if ((list == null || (CollectionsKt.firstOrNull<Any>(list as List<Object?>?) as SearchResponse?. also ({
                        searchResponse = it
                    })) == null)) null else searchResponse.apiName
        }
        if (list != null) {
            val list3: List<SearchResponse> = list
            val arrayList: ArrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10))
            for (searchResponse2: SearchResponse in list3) {
                arrayList.add(searchResponse2.apiName)
            }
            val distinct: List? = CollectionsKt.distinct(arrayList)
            if (distinct != null) {
                val result_recommendations_filter_button2: MaterialButton? =
                    `_$_findCachedViewById`(C4761R.C4764id.result_recommendations_filter_button) as MaterialButton?
                if (result_recommendations_filter_button2 != null) {
                    Intrinsics.checkNotNullExpressionValue(
                        result_recommendations_filter_button2,
                        "result_recommendations_filter_button"
                    )
                    result_recommendations_filter_button2.setVisibility(if (distinct.size() > 1) 0 else 8)
                }
                val materialButton: MaterialButton? =
                    `_$_findCachedViewById`(C4761R.C4764id.result_recommendations_filter_button) as MaterialButton?
                if (materialButton != null) {
                    materialButton.setText(str)
                }
                val materialButton2: MaterialButton? =
                    `_$_findCachedViewById`(C4761R.C4764id.result_recommendations_filter_button) as MaterialButton?
                if (materialButton2 != null) {
                    materialButton2.setOnClickListener(object : OnClickListener() {
                        // from class: com.lagradost.cloudstream3.ui.result.-$$Lambda$ResultFragmentPhimHD$WCz3dbeIpGSSoeYFiK7tQp58AdA
                        @Override // android.view.View.OnClickListener
                        fun onClick(view: View?) {
                            Companion.`m8781setRecommendations$lambda7$lambda6`(
                                this@ResultFragmentPhimHD,
                                distinct,
                                str,
                                list,
                                view
                            )
                        }
                    })
                    unit = Unit.INSTANCE
                }
            }
        }
        if (unit == null && (`_$_findCachedViewById`(C4761R.C4764id.result_recommendations_filter_button) as MaterialButton?. also ({
                result_recommendations_filter_button = it
            })) != null) {
            Intrinsics.checkNotNullExpressionValue(
                result_recommendations_filter_button,
                "result_recommendations_filter_button"
            )
            result_recommendations_filter_button.setVisibility(8)
        }
        val autofitRecyclerView: AutofitRecyclerView? =
            `_$_findCachedViewById`(C4761R.C4764id.result_recommendations) as AutofitRecyclerView?
        if (autofitRecyclerView != null) {
            autofitRecyclerView.post(object : Runnable() {
                // from class: com.lagradost.cloudstream3.ui.result.-$$Lambda$ResultFragmentPhimHD$oaayFelw591rzhZ9GNQKkYqbZ_Q
                @Override // java.lang.Runnable
                fun run() {
                    Companion.`m8779setRecommendations$lambda11`(list, this, str)
                }
            })
        }
    }

    private fun fixGrid() {
        var spanCount: Integer
        val activity: FragmentActivity? = getActivity()
        if (activity == null || (UIHelper.INSTANCE.getSpanCount(activity)
                .also({ spanCount = it })) == null
        ) {
            return
        }
        spanCount.intValue()
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public override fun onConfigurationChanged(newConfig: Configuration) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig")
        super.onConfigurationChanged(newConfig)
        fixGrid()
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun lateFixDownloadButton(z: Boolean) {
        if (z) {
            val tvType: TvType? = currentType
            if (!(if ((tvType == null || MainAPIKt.isMovieType(tvType))) false else true)) {
                (`_$_findCachedViewById`(C4761R.C4764id.result_movie_parent) as LinearLayout?).setVisibility(
                    0
                )
                (`_$_findCachedViewById`(C4761R.C4764id.result_episodes_text) as TextView?).setVisibility(
                    8
                )
                (`_$_findCachedViewById`(C4761R.C4764id.result_episodes) as RecyclerView?).setVisibility(
                    8
                )
                return
            }
        }
        (`_$_findCachedViewById`(C4761R.C4764id.result_movie_parent) as LinearLayout?).setVisibility(
            0
        )
        val frameLayout: FrameLayout? =
            `_$_findCachedViewById`(C4761R.C4764id.frame_download) as FrameLayout?
        if (frameLayout != null) {
            frameLayout.setVisibility(8)
        }
        (`_$_findCachedViewById`(C4761R.C4764id.result_episodes_text) as TextView?).setVisibility(0)
        (`_$_findCachedViewById`(C4761R.C4764id.result_episodes) as RecyclerView?).setVisibility(0)
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun updateUI() {
        var syncViewModel: SyncViewModel? = syncModel
        var resultViewModel: ResultViewModel? = null
        if (syncViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("syncModel")
            syncViewModel = null
        }
        syncViewModel!!.updateUserData()
        val resultViewModel2: ResultViewModel? = viewModel
        if (resultViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel")
        } else {
            resultViewModel = resultViewModel2
        }
        resultViewModel!!.reloadEpisodes()
    }

    /* JADX WARN: Code restructure failed: missing block: B:313:0x079c, code lost:
        if (r2.getResult().getValue() == null) goto L262;
     */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0759  */ /* JADX WARN: Removed duplicated region for block: B:304:0x077c  */ /* JADX WARN: Removed duplicated region for block: B:309:0x078c  */ /* JADX WARN: Removed duplicated region for block: B:316:0x07a2  */ /* JADX WARN: Removed duplicated region for block: B:55:0x00e7  */ /* JADX WARN: Removed duplicated region for block: B:59:0x00ff  */ /* JADX WARN: Removed duplicated region for block: B:63:0x0118  */ /* JADX WARN: Removed duplicated region for block: B:66:0x0125  */ /* JADX WARN: Removed duplicated region for block: B:69:0x0136  */ /* JADX WARN: Removed duplicated region for block: B:72:0x014e  */ /* JADX WARN: Removed duplicated region for block: B:73:0x0154  */ /* JADX WARN: Removed duplicated region for block: B:87:0x0187  */ /* JADX WARN: Removed duplicated region for block: B:90:0x0196  */ /* JADX WARN: Removed duplicated region for block: B:93:0x01af  */ /* JADX WARN: Removed duplicated region for block: B:94:0x01b6  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */ public override fun onViewCreated(r23: android.view.View?, r24: Bundle?) {
        /*
            Method dump skipped, instructions count: 2216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.p041ui.result.ResultFragmentPhimHD.onViewCreated(android.view.View, android.os.Bundle):void")
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onPause() {
        super.onPause()
        PanelsChildGestureRegionObserver.Provider.get().addGestureRegionsUpdateListener(this)
    }

    @Override // com.discord.panels.PanelsChildGestureRegionObserver.GestureRegionsListener
    public override fun onGestureRegionsUpdate(gestureRegions: List<Rect?>) {
        var overlappingPanelsLayout: OverlappingPanelsLayout
        Intrinsics.checkNotNullParameter(gestureRegions, "gestureRegions")
        val context: Context? = getContext()
        val z: Boolean = true
        if (!(if ((context == null || !SettingsFragment.Companion.Companion.isTvSettings(context))) false else false) || (`_$_findCachedViewById`(
                C4761R.C4764id.result_overlapping_panels
            ) as OverlappingPanelsLayout?. also ({ overlappingPanelsLayout = it })) == null
        ) {
            return
        }
        overlappingPanelsLayout.setChildGestureRegions(gestureRegions)
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: ResultFragmentPhimHD.kt */
    @Metadata(
        m108d1 = ["\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\u000b"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/result/ResultFragmentPhimHD\$UriWebViewClient;", "Landroid/webkit/WebViewClient;", "()V", "onPageFinished", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/webkit/WebView;", "url", "", "shouldOverrideUrlLoading", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD$UriWebViewClient */ /* loaded from: classes4.dex */
    class UriWebViewClient constructor() : WebViewClient() {
        @Override // android.webkit.WebViewClient
        fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
            Intrinsics.checkNotNullParameter(view, "view")
            Intrinsics.checkNotNullParameter(url, "url")
            return !Intrinsics.areEqual(Uri.parse(url).getHost(), "m.facebook.com")
        }

        @Override // android.webkit.WebViewClient
        fun onPageFinished(view: WebView?, url: String?) {
            Intrinsics.checkNotNullParameter(view, "view")
            Intrinsics.checkNotNullParameter(url, "url")
            super.onPageFinished(view, url)
            Uri.parse(url).getHost()
            if (StringsKt.`contains$default`(
                    url as CharSequence?,
                    "/plugins/close_popup.php?reload" as CharSequence?,
                    false,
                    2,
                    null as Object?
                )
            ) {
                Handler().postDelayed(RunnableC4888x90df1c9a.Companion.INSTANCE, 600L)
            }
        }

        companion object {
            /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onPageFinished$lambda-0  reason: not valid java name */
            fun `m8782onPageFinished$lambda0`() {}
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun loadComments(webView: WebView?, str: String) {
        val htmlComment: String
        webView.setWebViewClient(UriWebViewClient())
        webView.getSettings().setJavaScriptEnabled(true)
        webView.getSettings().setAppCacheEnabled(true)
        webView.getSettings().setDomStorageEnabled(true)
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true)
        webView.getSettings().setSupportMultipleWindows(true)
        webView.getSettings().setSupportZoom(false)
        webView.getSettings().setBuiltInZoomControls(false)
        CookieManager.getInstance().setAcceptCookie(true)
        if (Build.VERSION.SDK_INT >= 21) {
            webView.getSettings().setMixedContentMode(0)
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true)
        }
        if (StringsKt.`startsWith$default`(str, "http", false, 2, null as Object?)) {
            htmlComment =
                "<!doctype html> <html lang=\"en\"> <head></head> <body> <div id=\"fb-root\"></div> <script>(function(d, s, id) { var js, fjs = d.getElementsByTagName(s)[0]; if (d.getElementById(id)) return; js = d.createElement(s); js.id = id; js.src = \"//connect.facebook.net/en_US/sdk.js#xfbml=1&version=v2.6\"; fjs.parentNode.insertBefore(js, fjs); }(document, 'script', 'facebook-jssdk'));</script> <div class=\"fb-comments\" data-href=\"" + str + "\" data-numposts=\"5\" data-order-by=\"reverse_time\" data-colorscheme=\"dark\"></div> </body> </html>"
        } else {
            htmlComment = getHtmlComment(str, "free-movies-online-1")
        }
        webView.loadDataWithBaseURL(
            "http://www.nothing.com",
            htmlComment,
            "text/html",
            "UTF-8",
            null
        )
        webView.setMinimumHeight(100)
    }

    fun getHtmlComment(idPost: String, shortName: String): String {
        Intrinsics.checkNotNullParameter(idPost, "idPost")
        Intrinsics.checkNotNullParameter(shortName, "shortName")
        return "<div id='disqus_thread'></div><script type='text/javascript'>var disqus_identifier = '" + idPost + "';var disqus_shortname = '" + shortName + "'; (function() { var dsq = document.createElement('script'); dsq.type = 'text/javascript'; dsq.async = true;dsq.src = 'http://' + disqus_shortname + '.disqus.com/embed.js';(document.getElementsByTagName('head')[0] || document.getElementsByTagName('body')[0]).appendChild(dsq); })();</script>"
    }

    companion object {
        val API_NAME_BUNDLE: String = "apiName"
        val Companion: Companion = Companion(null)
        val EPISODE_BUNDLE: String = "episode"
        val RESTART_BUNDLE: String = "restart"
        val SEASON_BUNDLE: String = "season"
        val START_ACTION_BUNDLE: String = "startAction"
        val START_VALUE_BUNDLE: String = "startValue"
        val URL_BUNDLE: String = "url"
        private val updateUIListener: Functions<Unit>? = null

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: setRecommendations$lambda-4  reason: not valid java name */
        fun `m8780setRecommendations$lambda4`(`this$0`: ResultFragmentPhimHD, view: View?) {
            val i: Int
            var selectedPanel: Panel
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val overlappingPanelsLayout: OverlappingPanelsLayout? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_overlapping_panels) as OverlappingPanelsLayout?
            val z: Boolean = true
            if (if (((overlappingPanelsLayout == null) || ((overlappingPanelsLayout.getSelectedPanel()
                        .also({ selectedPanel = it })) == null) || (selectedPanel.ordinal() !== 1))
                ) false else false
            ) {
                val overlappingPanelsLayout2: OverlappingPanelsLayout? =
                    `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_overlapping_panels) as OverlappingPanelsLayout?
                if (overlappingPanelsLayout2 != null) {
                    overlappingPanelsLayout2.openEndPanel()
                }
                i = R.id.result_recommendations
            } else {
                val overlappingPanelsLayout3: OverlappingPanelsLayout? =
                    `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_overlapping_panels) as OverlappingPanelsLayout?
                if (overlappingPanelsLayout3 != null) {
                    overlappingPanelsLayout3.closePanels()
                }
                i = R.id.result_description
            }
            val imageView: ImageView? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_recommendations_btt) as ImageView?
            if (imageView != null) {
                imageView.setNextFocusDownId(i)
            }
            val materialButton: MaterialButton? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_search) as MaterialButton?
            if (materialButton != null) {
                materialButton.setNextFocusDownId(i)
            }
            val materialButton2: MaterialButton? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_open_in_browser) as MaterialButton?
            if (materialButton2 != null) {
                materialButton2.setNextFocusDownId(i)
            }
            val materialButton3: MaterialButton? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_share) as MaterialButton?
            if (materialButton3 == null) {
                return
            }
            materialButton3.setNextFocusDownId(i)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: setRecommendations$lambda-7$lambda-6  reason: not valid java name */
        fun `m8781setRecommendations$lambda7$lambda6`(
            `this$0`: ResultFragmentPhimHD,
            apiNames: List?,
            str: String?,
            list: List?,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(apiNames, "\$apiNames")
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                val indexOf: Int = CollectionsKt.indexOf<Any>(apiNames as List<String?>?, str)
                val string: String = `this$0`.getString(R.string.home_change_provider_img_des)
                Intrinsics.checkNotNullExpressionValue(
                    string,
                    "getString(R.string.home_change_provider_img_des)"
                )
                SingleSelectionHelper.INSTANCE.showBottomDialog(
                    activity,
                    apiNames,
                    indexOf,
                    string,
                    false,
                    `ResultFragmentPhimHD$setRecommendations$3$1$1`.Companion.INSTANCE,
                    `ResultFragmentPhimHD$setRecommendations$3$1$2`(`this$0`, list, apiNames)
                )
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: setRecommendations$lambda-11  reason: not valid java name */
        fun `m8779setRecommendations$lambda11`(
            list: List?,
            `this$0`: ResultFragmentPhimHD,
            str: String?
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            if (list != null) {
                val autofitRecyclerView: AutofitRecyclerView? =
                    `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_recommendations) as AutofitRecyclerView?
                val searchAdaptor: SearchAdaptor? =
                    (if (autofitRecyclerView != null) autofitRecyclerView.getAdapter() else null) as SearchAdaptor?
                if (searchAdaptor != null) {
                    val arrayList: ArrayList = ArrayList()
                    for (obj: Object? in list) {
                        if (Intrinsics.areEqual((obj as SearchResponse).apiName, str)) {
                            arrayList.add(obj)
                        }
                    }
                    searchAdaptor.updateList(arrayList)
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-14  reason: not valid java name */
        fun `m8762onViewCreated$lambda14`(`this$0`: ResultFragmentPhimHD, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            CommonActivity.INSTANCE.showToast(
                `this$0`.getActivity(),
                R.string.no_chromecast_support_toast,
                1
            )
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-16$lambda-15  reason: not valid java name */
        fun `m8763onViewCreated$lambda16$lambda15`(`this$0`: ResultFragmentPhimHD, i: Int) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val mediaRouteButton: MediaRouteButton? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.media_route_button) as MediaRouteButton?
            if (mediaRouteButton == null) {
                return
            }
            mediaRouteButton.setVisibility(if (i == 1) 8 else 0)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-17  reason: not valid java name */
        fun `m8764onViewCreated$lambda17`(
            `this$0`: ResultFragmentPhimHD,
            nestedScrollView: NestedScrollView?,
            i: Int,
            i2: Int,
            i3: Int,
            i4: Int
        ) {
            var extendedFloatingActionButton: ExtendedFloatingActionButton
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(nestedScrollView, "<anonymous parameter 0>")
            val i5: Int = i2 - i4
            if (i5 > 0) {
                val extendedFloatingActionButton2: ExtendedFloatingActionButton? =
                    `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_bookmark_fab) as ExtendedFloatingActionButton?
                if (extendedFloatingActionButton2 != null) {
                    extendedFloatingActionButton2.shrink()
                }
            } else if (i5 < -5 && (`this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_bookmark_fab) as ExtendedFloatingActionButton?. also ({
                    extendedFloatingActionButton = it
                })) != null) {
                extendedFloatingActionButton.extend()
            }
            val frameLayout: FrameLayout? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_poster_blur_holder) as FrameLayout?
            if (frameLayout == null) {
                return
            }
            frameLayout.setTranslationY(-i2)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-18  reason: not valid java name */
        fun `m8765onViewCreated$lambda18`(`this$0`: ResultFragmentPhimHD, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                UIHelper.INSTANCE.popCurrentPage(activity)
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        fun `onViewCreated$handleAction`(
            resultFragmentPhimHD: ResultFragmentPhimHD?,
            str: String?,
            mainAPI: MainAPI?,
            episodeClickEvent: EpisodeClickEvent?
        ): Job {
            return Coroutines.INSTANCE.main(
                `ResultFragmentPhimHD$onViewCreated$handleAction$1`(
                    episodeClickEvent,
                    resultFragmentPhimHD,
                    str,
                    mainAPI,
                    null
                )
            )
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-20  reason: not valid java name */
        fun `m8766onViewCreated$lambda20`(`this$0`: ResultFragmentPhimHD, it: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val uIHelper: UIHelper = UIHelper.INSTANCE
            Intrinsics.checkNotNullExpressionValue(it, "it")
            val values: Array<WatchType> = WatchType.values()
            val arrayList: ArrayList = ArrayList(values.size)
            for (watchType: WatchType in values) {
                arrayList.add(
                    Tuples<Any?, Any?>(
                        Integer.valueOf(watchType.getInternalId()),
                        Integer.valueOf(watchType.getStringRes())
                    )
                )
            }
            uIHelper.popupMenuNoIcons(
                it,
                arrayList,
                `ResultFragmentPhimHD$onViewCreated$8$2`(`this$0`)
            )
        }

        /* JADX INFO: Access modifiers changed from: private */
        fun `onViewCreated$setFocusUpAndDown`(view: View?, view2: View?) {
            if (view == null || view2 == null) {
                return
            }
            view.setNextFocusDownId(view2.getId())
            view2.setNextFocusUpId(view.getId())
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-28$lambda-22  reason: not valid java name */
        fun `m8767onViewCreated$lambda28$lambda22`(
            `this$0`: ResultFragmentPhimHD,
            adapterView: AdapterView?,
            view: View?,
            i: Int,
            j: Long
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            var syncViewModel: SyncViewModel? = `this$0`.syncModel
            if (syncViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("syncModel")
                syncViewModel = null
            }
            syncViewModel!!.setStatus(i - 1)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-28$lambda-23  reason: not valid java name */
        fun `m8768onViewCreated$lambda28$lambda23`(
            `this$0`: ResultFragmentPhimHD,
            slider: Slider?,
            f: Float,
            z: Boolean
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(slider, "<anonymous parameter 0>")
            var syncViewModel: SyncViewModel? = `this$0`.syncModel
            if (syncViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("syncModel")
                syncViewModel = null
            }
            syncViewModel!!.setScore(f.toInt())
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-28$lambda-24  reason: not valid java name */
        fun `m8769onViewCreated$lambda28$lambda24`(`this$0`: ResultFragmentPhimHD, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            var syncViewModel: SyncViewModel? = `this$0`.syncModel
            if (syncViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("syncModel")
                syncViewModel = null
            }
            syncViewModel!!.setEpisodesDelta(1)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-28$lambda-25  reason: not valid java name */
        fun `m8770onViewCreated$lambda28$lambda25`(`this$0`: ResultFragmentPhimHD, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            var syncViewModel: SyncViewModel? = `this$0`.syncModel
            if (syncViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("syncModel")
                syncViewModel = null
            }
            syncViewModel!!.setEpisodesDelta(-1)
        }

        /* JADX INFO: Access modifiers changed from: private */
        fun `onViewCreated$setSyncMaxEpisodes`(
            resultFragmentPhimHD: ResultFragmentPhimHD,
            num: Integer?
        ) {
            val contentLoadingProgressBar: ContentLoadingProgressBar? =
                resultFragmentPhimHD.`_$_findCachedViewById`(C4761R.C4764id.result_sync_episodes) as ContentLoadingProgressBar?
            if (contentLoadingProgressBar != null) {
                contentLoadingProgressBar.setMax((if (num != null) num.intValue() else 0) * 1000)
            }
            ArchComponentExt.normalSafeApiCall<Unit>(
                `ResultFragmentPhimHD$onViewCreated$setSyncMaxEpisodes$1`(resultFragmentPhimHD, num)
            )
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-29  reason: not valid java name */
        fun `m8771onViewCreated$lambda29`(`this$0`: ResultFragmentPhimHD, view: View?, z: Boolean) {
            var materialButton: MaterialButton
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            if (!z || (`this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_bookmark_button) as MaterialButton?. also ({
                    materialButton = it
                })) == null) {
                return
            }
            materialButton.requestFocus()
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-31  reason: not valid java name */
        fun `m8772onViewCreated$lambda31`(`this$0`: ResultFragmentPhimHD, it: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val set: Set<DubStatus>? = `this$0`.dubRange
            if (set != null) {
                val uIHelper: UIHelper = UIHelper.INSTANCE
                Intrinsics.checkNotNullExpressionValue(it, "it")
                val set2: Set<DubStatus> = set
                val arrayList: ArrayList =
                    ArrayList(CollectionsKt.collectionSizeOrDefault(set2, 10))
                for (dubStatus: DubStatus in set2) {
                    arrayList.add(
                        Tuples<Any?, Any?>(
                            Integer.valueOf(dubStatus.ordinal()),
                            dubStatus.toString()
                        )
                    )
                }
                uIHelper.popupMenuNoIconsAndNoStringRes(
                    it,
                    CollectionsKt.toList(arrayList),
                    `ResultFragmentPhimHD$onViewCreated$24$2`(`this$0`)
                )
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-33  reason: not valid java name */
        fun `m8773onViewCreated$lambda33`(`this$0`: ResultFragmentPhimHD, it: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val list: List<String>? = `this$0`.episodeRanges
            if (list != null) {
                val uIHelper: UIHelper = UIHelper.INSTANCE
                Intrinsics.checkNotNullExpressionValue(it, "it")
                val list2: List<String> = list
                val arrayList: ArrayList =
                    ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10))
                var i: Int = 0
                for (obj: Object? in list2) {
                    val i2: Int = i + 1
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow()
                    }
                    arrayList.add(Tuples<Any?, Any?>(Integer.valueOf(i), obj as String?))
                    i = i2
                }
                uIHelper.popupMenuNoIconsAndNoStringRes(
                    it,
                    CollectionsKt.toList(arrayList),
                    `ResultFragmentPhimHD$onViewCreated$25$2`(`this$0`)
                )
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-34  reason: not valid java name */
        fun `m8774onViewCreated$lambda34`(`this$0`: ResultFragmentPhimHD, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            var syncViewModel: SyncViewModel? = `this$0`.syncModel
            if (syncViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("syncModel")
                syncViewModel = null
            }
            syncViewModel!!.publishUserData()
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-40$lambda-36  reason: not valid java name */
        fun `m8775onViewCreated$lambda40$lambda36`(
            `this$0`: ResultFragmentPhimHD,
            str: String?,
            apiName: String?,
            z: Boolean,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(apiName, "\$apiName")
            var resultViewModel: ResultViewModel? = `this$0`.viewModel
            if (resultViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel")
                resultViewModel = null
            }
            resultViewModel!!.load(str, apiName, z)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-40$lambda-37  reason: not valid java name */
        fun `m8776onViewCreated$lambda40$lambda37`(
            str: String?,
            `this$0`: ResultFragmentPhimHD,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val intent: Intent = Intent("android.intent.action.VIEW")
            intent.setData(Uri.parse(str))
            try {
                `this$0`.startActivity(intent)
            } catch (e: Exception) {
                ArchComponentExt.logError(e)
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-40$lambda-38  reason: not valid java name */
        fun `m8777onViewCreated$lambda40$lambda38`(
            str: String?,
            `this$0`: ResultFragmentPhimHD,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val intent: Intent = Intent("android.intent.action.VIEW")
            intent.setData(Uri.parse(str))
            try {
                `this$0`.startActivity(intent)
            } catch (e: Exception) {
                ArchComponentExt.logError(e)
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-40$lambda-39  reason: not valid java name */
        fun `m8778onViewCreated$lambda40$lambda39`(str: String?, view: View) {
            val context: Context? = view.getContext()
            if (context != null) {
                AppUtils.INSTANCE.openBrowser(context, str)
            }
        }
    }
}