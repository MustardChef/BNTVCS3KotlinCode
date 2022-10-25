package com.lagradost.cloudstream3.p041ui.player

import android.content.Context
import com.anggrayudi.storage.file.MimeType
import com.google.android.exoplayer2.Format
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.Player
import com.google.android.exoplayer2.Renderer
import com.google.android.exoplayer2.source.ads.AdsLoader
import com.google.android.exoplayer2.upstream.DataSource
import com.phimhd.Config
import com.phimhd.Key
import kotlin.jvm.functions.Functions
import kotlin.jvm.internal.Intrinsics

/* compiled from: CS3IPlayer.kt */
@Metadata(
    m108d1 = ["\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 \u008d\u00012\u00020\u0001:\u0002\u008d\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010I\u001a\u0004\u0018\u00010\u0011H\u0016J\u000f\u0010J\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0002\u0010KJ\b\u0010L\u001a\u00020!H\u0016J\b\u0010M\u001a\u00020,H\u0016J\u000f\u0010N\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0002\u0010KJ<\u0010O\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020P0\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u001a0\u001f2\b\u0010Q\u001a\u0004\u0018\u00010R2\b\u0010S\u001a\u0004\u0018\u00010R2\u0006\u0010T\u001a\u00020BH\u0002J\b\u0010U\u001a\u00020\u0004H\u0016J\u0010\u0010V\u001a\u00020\u001b2\u0006\u0010W\u001a\u00020XH\u0016J\u008a\u0002\u0010Y\u001a\u00020\u001b2\u0014\u00106\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000107\u0012\u0004\u0012\u00020\u001b0\u00192 \u0010D\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020E0\u001f\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00192\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010.2\u0018\u00102\u001a\u0014\u0012\b\u0012\u000603j\u0002`4\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00192 \u00101\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u001f\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00192\u000e\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001a2 \u00105\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001f\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00192\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010.2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010.2\u000e\u0010C\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010.2\u001a\u0010\u0018\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0019H\u0016J$\u0010Z\u001a\u00020\u001b2\b\u0010[\u001a\u0004\u0018\u00010\\2\b\u0010]\u001a\u0004\u0018\u00010^2\b\u0010_\u001a\u0004\u0018\u00010`J2\u0010a\u001a\u00020\u001b2\u0006\u0010b\u001a\u00020c2\u0006\u0010d\u001a\u00020e2\u000c\u0010f\u001a\b\u0012\u0004\u0012\u00020P0\u001a2\n\b\u0002\u0010g\u001a\u0004\u0018\u00010hH\u0002J\u0018\u0010i\u001a\u00020\u001b2\u0006\u0010b\u001a\u00020c2\u0006\u0010j\u001a\u00020\nH\u0002J\u0018\u0010k\u001a\u00020\u001b2\u0006\u0010b\u001a\u00020c2\u0006\u0010l\u001a\u00020\u000cH\u0002Jg\u0010m\u001a\u00020\u001b2\u0006\u0010b\u001a\u00020c2\u0006\u0010n\u001a\u00020!2\b\u0010l\u001a\u0004\u0018\u00010\u000c2\b\u0010j\u001a\u0004\u0018\u00010\n2\b\u0010o\u001a\u0004\u0018\u00010\u00042\u000c\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00110q2\b\u0010r\u001a\u0004\u0018\u00010\u00112\b\u00108\u001a\u0004\u0018\u0001092\b\u0010s\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0002\u0010tJ\u0016\u0010u\u001a\u00020\u001b2\u0006\u0010b\u001a\u00020c2\u0006\u0010v\u001a\u00020wJ\b\u0010x\u001a\u00020\u001bH\u0016J\u0006\u0010y\u001a\u00020\u001bJ\u0010\u0010z\u001a\u00020\u001b2\u0006\u0010b\u001a\u00020cH\u0016J\b\u0010{\u001a\u00020\u001bH\u0016J\b\u0010|\u001a\u00020\u001bH\u0016J\u0012\u0010}\u001a\u00020\u001b2\b\b\u0002\u0010~\u001a\u00020!H\u0002J\u0010\u0010\u007f\u001a\u00020\u001b2\u0006\u0010b\u001a\u00020cH\u0016J\t\u0010\u0080\u0001\u001a\u00020\u001bH\u0002J\t\u0010\u0081\u0001\u001a\u00020\u001bH\u0002J\u0012\u0010\u0082\u0001\u001a\u00020\u001b2\u0007\u0010\u0083\u0001\u001a\u00020\u0004H\u0016J\u0012\u0010\u0084\u0001\u001a\u00020\u001b2\u0007\u0010\u0083\u0001\u001a\u00020\u0004H\u0016J\u0017\u0010\u0085\u0001\u001a\u00020\u001b2\u000c\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00110qH\u0016J\u0012\u0010\u0086\u0001\u001a\u00020\u001b2\u0007\u0010\u0087\u0001\u001a\u00020,H\u0016J\u0013\u0010\u0088\u0001\u001a\u00020!2\b\u0010r\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u0089\u0001\u001a\u00020\u001b2\u0007\u0010\u008a\u0001\u001a\u00020\u0004H\u0016J\u0011\u0010\u008b\u0001\u001a\u00020\u001b2\u0006\u0010_\u001a\u00020`H\u0016J\u0007\u0010\u008c\u0001\u001a\u00020\u001bJ\u0016\u0010\u0082\u0001\u001a\u00020\u001b*\u00020\u001d2\u0007\u0010\u0083\u0001\u001a\u00020\u0004H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b\u000f\u0010\bR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0018\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f0\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u000e\u0010*\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010-\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020,X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R(\u00101\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u001f\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R \u00102\u001a\u0014\u0012\b\u0012\u000603j\u0002`4\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R(\u00105\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001f\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u00106\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u000107\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00108\u001a\u0004\u0018\u000109X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010:\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010;\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010>\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0006\"\u0004\b@\u0010\bR\u000e\u0010A\u001a\u00020BX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010C\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010D\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020E0\u001f\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010F\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0006\"\u0004\bH\u0010\b¨\u0006\u008e\u0001"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/player/CS3IPlayer;", "Lcom/lagradost/cloudstream3/ui/player/IPlayer;", "()V", "cacheSize", "", "getCacheSize", "()J", "setCacheSize", "(J)V", "currentDownloadedFile", "Lcom/lagradost/cloudstream3/utils/ExtractorUri;", "currentLink", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "currentSubtitleOffset", "getCurrentSubtitleOffset", "setCurrentSubtitleOffset", "currentSubtitles", "Lcom/lagradost/cloudstream3/ui/player/SubtitleData;", "getCurrentSubtitles", "()Lcom/lagradost/cloudstream3/ui/player/SubtitleData;", "setCurrentSubtitles", "(Lcom/lagradost/cloudstream3/ui/player/SubtitleData;)V", "currentWindow", "", "embeddedSubtitlesFetched", "Lkotlin/Function1;", "", "", "exoPlayer", "Lcom/google/android/exoplayer2/ExoPlayer;", "exoPlayerSelectedTracks", "Lkotlin/Pair;", "", "", "hasUsedFirstRender", "ignoreSSL", "imaAdsLoader", "Lcom/google/android/exoplayer2/ext/ima/ImaAdsLoader;", "getImaAdsLoader", "()Lcom/google/android/exoplayer2/ext/ima/ImaAdsLoader;", "setImaAdsLoader", "(Lcom/google/android/exoplayer2/ext/ima/ImaAdsLoader;)V", "isPlaying", "lastMuteVolume", "", "nextEpisode", "Lkotlin/Function0;", "playBackSpeed", "playbackPosition", "playerDimensionsLoaded", "playerError", "Ljava/lang/Exception;", "Lkotlin/Exception;", "playerPositionChanged", "playerUpdated", "", "playerView", "Lcom/google/android/exoplayer2/ui/PlayerView;", "prevEpisode", "requestAutoFocus", "requestedListeningPercentages", "seekActionTime", "simpleCacheSize", "getSimpleCacheSize", "setSimpleCacheSize", "subtitleHelper", "Lcom/lagradost/cloudstream3/ui/player/PlayerSubtitleHelper;", "subtitlesUpdates", "updateIsPlaying", "Lcom/lagradost/cloudstream3/ui/player/CSPlayerLoading;", "videoBufferMs", "getVideoBufferMs", "setVideoBufferMs", "getCurrentPreferredSubtitle", "getDuration", "()Ljava/lang/Long;", "getIsPlaying", "getPlaybackSpeed", "getPosition", "getSubSources", "Lcom/google/android/exoplayer2/source/SingleSampleMediaSource;", "onlineSourceFactory", "Lcom/google/android/exoplayer2/upstream/DataSource\$Factory;", "offlineSourceFactory", "subHelper", "getSubtitleOffset", "handleEvent", "event", "Lcom/lagradost/cloudstream3/ui/player/CSPlayerEvent;", "initCallbacks", "initSubtitles", "subView", "Lcom/google/android/exoplayer2/ui/SubtitleView;", "subHolder", "Landroid/widget/FrameLayout;", "style", "Lcom/lagradost/cloudstream3/ui/subtitles/SaveCaptionStyle;", "loadExo", "context", "Landroid/content/Context;", "mediaItem", "Lcom/google/android/exoplayer2/MediaItem;", "subSources", "cacheFactory", "Lcom/google/android/exoplayer2/upstream/cache/CacheDataSource\$Factory;", "loadOfflinePlayer", "data", "loadOnlinePlayer", "link", "loadPlayer", "sameEpisode", "startPosition", "subtitles", "", "subtitle", "autoPlay", "(Landroid/content/Context;ZLcom/lagradost/cloudstream3/utils/ExtractorLink;Lcom/lagradost/cloudstream3/utils/ExtractorUri;Ljava/lang/Long;Ljava/util/Set;Lcom/lagradost/cloudstream3/ui/player/SubtitleData;Lcom/google/android/exoplayer2/ui/PlayerView;Ljava/lang/Boolean;)V", "loadYtFile", "yt", "Lat/huber/youtubeExtractor/YtFile;", "onPause", "onRenderFirst", "onResume", "onStop", "release", "releasePlayer", "saveTime", "reloadPlayer", "reloadSubs", "saveData", "seekTime", "time", "seekTo", "setActiveSubtitles", "setPlaybackSpeed", "speed", "setPreferredSubtitles", "setSubtitleOffset", TypedValues.CycleType.S_WAVE_OFFSET, "updateSubtitleStyle", "updatedTime", "Companion", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.player.CS3IPlayer */ /* loaded from: classes3.dex */
class CS3IPlayer constructor() : IPlayer {
    var cacheSize: Long = 0
    private var currentDownloadedFile: ExtractorUri? = null
    private var currentLink: ExtractorLink? = null
    var currentSubtitleOffset: Long = 0
    var currentSubtitles: SubtitleData? = null
    private var currentWindow: Int = 0
    private var embeddedSubtitlesFetched: Function1<List<SubtitleData>?, Unit>? = null
    var exoPlayer: ExoPlayer? = null
    private var hasUsedFirstRender: Boolean = false
    private var imaAdsLoader: ImaAdsLoader? = null

    // com.lagradost.cloudstream3.p041ui.player.IPlayer
    @get:Override
    override var isPlaying: Boolean = false
        private set
    private var nextEpisode: Functions<Unit>? = null
    private var playbackPosition: Long = 0
    var playerDimensionsLoaded: Function1<Tuples<Integer?, Integer?>?, Unit>? = null
    var playerError: Function1<Exception?, Unit>? = null
    private var playerPositionChanged: Function1<Tuples<Long?, Long?>?, Unit>? = null
    private var playerUpdated: Function1<Object?, Unit>? = null
    private var playerView: PlayerView? = null
    private var prevEpisode: Functions<Unit>? = null
    var requestAutoFocus: Functions<Unit>? = null
    private var requestedListeningPercentages: List<Integer>? = null
    var simpleCacheSize: Long = 0
    private var subtitlesUpdates: Functions<Unit>? = null
    var updateIsPlaying: Function1<Tuples<out CSPlayerLoading?, out CSPlayerLoading?>, Unit>? = null
    var videoBufferMs: Long = 0
    private val seekActionTime: Long = 30000
    private val ignoreSSL: Boolean = true
    private var playBackSpeed: Float = 1.0f
    private var lastMuteVolume: Float = 1.0f
    private val subtitleHelper: PlayerSubtitleHelper = PlayerSubtitleHelper()
    private val exoPlayerSelectedTracks: List<Tuples<String, Boolean>> =
        CollectionsKt.emptyList<Any>()

    /* compiled from: CS3IPlayer.kt */
    @Metadata(
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.player.CS3IPlayer$WhenMappings */ /* loaded from: classes3.dex */
    /* synthetic */
    object WhenMappings {
        /* synthetic */ val `$EnumSwitchMapping$0`: IntArray
        /* synthetic */ val `$EnumSwitchMapping$1`: IntArray
        /* synthetic */ val `$EnumSwitchMapping$2`: IntArray

        init {
            val iArr: IntArray = IntArray(SubtitleStatus.values().size)
            com.lagradost.cloudstream3.p041ui.player.iArr.get(SubtitleStatus.REQUIRES_RELOAD.ordinal()) =
                1
            com.lagradost.cloudstream3.p041ui.player.iArr.get(SubtitleStatus.IS_ACTIVE.ordinal()) =
                2
            com.lagradost.cloudstream3.p041ui.player.iArr.get(SubtitleStatus.NOT_FOUND.ordinal()) =
                3
            `$EnumSwitchMapping$0` = com.lagradost.cloudstream3.p041ui.player.iArr
            val iArr2: IntArray = IntArray(CSPlayerEvent.values().size)
            com.lagradost.cloudstream3.p041ui.player.iArr2.get(CSPlayerEvent.Play.ordinal()) = 1
            com.lagradost.cloudstream3.p041ui.player.iArr2.get(CSPlayerEvent.Pause.ordinal()) = 2
            com.lagradost.cloudstream3.p041ui.player.iArr2.get(CSPlayerEvent.ToggleMute.ordinal()) =
                3
            com.lagradost.cloudstream3.p041ui.player.iArr2.get(CSPlayerEvent.PlayPauseToggle.ordinal()) =
                4
            com.lagradost.cloudstream3.p041ui.player.iArr2.get(CSPlayerEvent.SeekForward.ordinal()) =
                5
            com.lagradost.cloudstream3.p041ui.player.iArr2.get(CSPlayerEvent.SeekBack.ordinal()) = 6
            com.lagradost.cloudstream3.p041ui.player.iArr2.get(CSPlayerEvent.NextEpisode.ordinal()) =
                7
            com.lagradost.cloudstream3.p041ui.player.iArr2.get(CSPlayerEvent.PrevEpisode.ordinal()) =
                8
            `$EnumSwitchMapping$1` = com.lagradost.cloudstream3.p041ui.player.iArr2
            val iArr3: IntArray = IntArray(SubtitleOrigin.values().size)
            com.lagradost.cloudstream3.p041ui.player.iArr3.get(SubtitleOrigin.DOWNLOADED_FILE.ordinal()) =
                1
            com.lagradost.cloudstream3.p041ui.player.iArr3.get(SubtitleOrigin.URL.ordinal()) = 2
            com.lagradost.cloudstream3.p041ui.player.iArr3.get(SubtitleOrigin.EMBEDDED_IN_VIDEO.ordinal()) =
                3
            `$EnumSwitchMapping$2` = com.lagradost.cloudstream3.p041ui.player.iArr3
        }
    }

    // com.lagradost.cloudstream3.p041ui.player.IPlayer
    @get:Override
    override val duration: Long?
        // com.lagradost.cloudstream3.p041ui.player.IPlayer
        get() {
            val exoPlayer: ExoPlayer? = exoPlayer
            if (exoPlayer != null) {
                return Long.valueOf(exoPlayer.getDuration())
            }
            return null
        }

    // com.lagradost.cloudstream3.p041ui.player.IPlayer
    @get:Override
    override val position: Long?
        // com.lagradost.cloudstream3.p041ui.player.IPlayer
        get() {
            val exoPlayer: ExoPlayer? = exoPlayer
            if (exoPlayer != null) {
                return Long.valueOf(exoPlayer.getCurrentPosition())
            }
            return null
        }

    // com.lagradost.cloudstream3.p041ui.player.IPlayer
    // com.lagradost.cloudstream3.p041ui.player.IPlayer
    @get:Override
    @set:Override
    override var playbackSpeed: Float
        // com.lagradost.cloudstream3.p041ui.player.IPlayer
        get() {
            return playBackSpeed
        }
        // com.lagradost.cloudstream3.p041ui.player.IPlayer
        set(f) {
            val exoPlayer: ExoPlayer? = exoPlayer
            if (exoPlayer != null) {
                exoPlayer.setPlaybackSpeed(f)
            }
            playBackSpeed = f
        }

    @Override // com.lagradost.cloudstream3.p041ui.player.IPlayer
    public override fun initCallbacks(
        playerUpdated: Function1<Object?, Unit>?,
        function1: Function1<Tuples<out CSPlayerLoading?, out CSPlayerLoading?>?, Unit>?,
        functions: Functions<Unit>?,
        function12: Function1<Exception?, Unit>?,
        function13: Function1<Tuples<Integer?, Integer?>?, Unit>?,
        list: List<Integer>?,
        function14: Function1<Tuples<Long?, Long?>?, Unit>?,
        functions2: Functions<Unit>?,
        functions3: Functions<Unit>?,
        functions4: Functions<Unit>?,
        function15: Function1<List<SubtitleData?>?, Unit>?
    ) {
        Intrinsics.checkNotNullParameter(playerUpdated, "playerUpdated")
        this.playerUpdated = playerUpdated
        updateIsPlaying = function1
        requestAutoFocus = functions
        playerError = function12
        playerDimensionsLoaded = function13
        requestedListeningPercentages = list
        playerPositionChanged = function14
        nextEpisode = functions2
        prevEpisode = functions3
        subtitlesUpdates = functions4
        embeddedSubtitlesFetched = function15
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun reloadSubs() {
        var applicationLooper: Looper?
        val exoPlayer: ExoPlayer? = exoPlayer
        if (exoPlayer == null || (exoPlayer.getApplicationLooper()
                .also({ applicationLooper = it })) == null
        ) {
            return
        }
        try {
            Boolean.valueOf(Handler(applicationLooper).post(object : Runnable() {
                // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$CS3IPlayer$SUYYF7Jq7e7MKCwC5W4mJgApBFE
                @Override // java.lang.Runnable
                fun run() {
                    Companion.`m8665reloadSubs$lambda1$lambda0`(this@CS3IPlayer)
                }
            }))
        } catch (e: Exception) {
            ArchComponentExt.logError(e)
            val unit: Unit = Unit.INSTANCE
        }
    }

    fun initSubtitles(
        subtitleView: SubtitleView?,
        frameLayout: FrameLayout?,
        saveCaptionStyle: SaveCaptionStyle?
    ) {
        subtitleHelper.initSubtitles(subtitleView, frameLayout, saveCaptionStyle)
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.IPlayer
    public override fun loadPlayer(
        context: Context?,
        z: Boolean,
        extractorLink: ExtractorLink?,
        extractorUri: ExtractorUri?,
        l: Long?,
        subtitles: Set<SubtitleData?>?,
        subtitleData: SubtitleData?,
        playerView: PlayerView?,
        bool: Boolean?
    ) {
        Intrinsics.checkNotNullParameter(context, "context")
        Intrinsics.checkNotNullParameter(subtitles, "subtitles")
        Log.i(CS3IPlayerKt.TAG, "loadPlayer")
        this.playerView = playerView
        if (z) {
            saveData()
        } else {
            currentSubtitles = subtitleData
            playbackPosition = 0L
        }
        if (l != null) {
            playbackPosition = l.longValue()
        }
        isPlaying = if (bool != null) bool.booleanValue() else isPlaying
        Companion.`releasePlayer$default`(this, false, 1, null)
        if (extractorLink != null) {
            loadOnlinePlayer(context, extractorLink)
        } else if (extractorUri != null) {
            loadOfflinePlayer(context, extractorUri)
        }
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.IPlayer
    public override fun setActiveSubtitles(subtitles: Set<SubtitleData?>) {
        Intrinsics.checkNotNullParameter(subtitles, "subtitles")
        Log.i(CS3IPlayerKt.TAG, "setActiveSubtitles " + subtitles.size())
        subtitleHelper.setAllSubtitles(subtitles)
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.IPlayer
    public override fun setPreferredSubtitles(subtitleData: SubtitleData?): Boolean {
        Log.i(CS3IPlayerKt.TAG, "setPreferredSubtitles init " + subtitleData)
        currentSubtitles = subtitleData
        val exoPlayer: ExoPlayer? = exoPlayer
        val trackSelector: TrackSelector? =
            if (exoPlayer != null) exoPlayer.getTrackSelector() else null
        val defaultTrackSelector: DefaultTrackSelector? =
            if (trackSelector is DefaultTrackSelector) trackSelector as DefaultTrackSelector? else null
        if (defaultTrackSelector != null) {
            val name: String? = if (subtitleData != null) subtitleData.getName() else null
            val str: String? = name
            if (str == null || StringsKt.isBlank(str)) {
                defaultTrackSelector.setParameters(
                    defaultTrackSelector.buildUponParameters()
                        .setPreferredTextLanguage(null as String?)
                )
            } else {
                val i: Int = WhenMappings.`$EnumSwitchMapping$0`.get(
                    subtitleHelper.subtitleStatus(subtitleData).ordinal()
                )
                if (i == 1) {
                    Log.i(CS3IPlayerKt.TAG, "setPreferredSubtitles REQUIRES_RELOAD")
                    return true
                } else if (i == 2) {
                    Log.i(CS3IPlayerKt.TAG, "setPreferredSubtitles IS_ACTIVE")
                    val buildUponParameters: ParametersBuilder =
                        defaultTrackSelector.buildUponParameters()
                    if (subtitleData.getOrigin() == SubtitleOrigin.EMBEDDED_IN_VIDEO) {
                        buildUponParameters.setPreferredTextLanguage(subtitleData.getUrl())
                    } else {
                        buildUponParameters.setPreferredTextLanguage('_' + name)
                    }
                    defaultTrackSelector.setParameters(buildUponParameters)
                } else if (i == 3) {
                    Log.i(CS3IPlayerKt.TAG, "setPreferredSubtitles NOT_FOUND")
                    return true
                }
            }
            return false
        }
        return false
    }

    // com.lagradost.cloudstream3.p041ui.player.IPlayer
    // com.lagradost.cloudstream3.p041ui.player.IPlayer
    @get:Override
    @set:Override
    override var subtitleOffset: Long
        // com.lagradost.cloudstream3.p041ui.player.IPlayer
        get() {
            return currentSubtitleOffset
        }
        // com.lagradost.cloudstream3.p041ui.player.IPlayer
        set(j) {
            currentSubtitleOffset = j
            val customTextRenderer: CustomTextRenderer? = Companion.currentTextRenderer
            if (customTextRenderer != null) {
                customTextRenderer.setRenderOffsetMs(j)
            }
        }/*
            r15 = this;
            com.lagradost.cloudstream3.ui.player.PlayerSubtitleHelper r0 = r15.subtitleHelper
            java.util.Set r0 = r0.getAllSubtitles()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L87
            java.lang.Object r1 = r0.next()
            r2 = r1
            com.lagradost.cloudstream3.ui.player.SubtitleData r2 = (com.lagradost.cloudstream3.p041ui.player.SubtitleData) r2
            java.util.List<kotlin.Pair<java.lang.String, java.lang.Boolean>> r3 = r15.exoPlayerSelectedTracks
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            boolean r4 = r3 instanceof java.util.Collection
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L2e
            r4 = r3
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L2e
        L2c:
            r5 = 0
            goto L84
        L2e:
            java.util.Iterator r3 = r3.iterator()
        L32:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2c
            java.lang.Object r4 = r3.next()
            kotlin.Pair r4 = (kotlin.Tuples) r4
            com.lagradost.cloudstream3.ui.player.SubtitleOrigin r7 = r2.getOrigin()
            com.lagradost.cloudstream3.ui.player.SubtitleOrigin r8 = com.lagradost.cloudstream3.p041ui.player.SubtitleOrigin.EMBEDDED_IN_VIDEO
            if (r7 != r8) goto L4b
            java.lang.String r7 = r2.getUrl()
            goto L4f
        L4b:
            java.lang.String r7 = r2.getName()
        L4f:
            r8 = r7
            java.lang.Object r7 = r4.getSecond()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L81
            java.lang.Object r4 = r4.getFirst()
            r9 = r4
            java.lang.String r9 = (java.lang.String) r9
            r12 = 0
            r13 = 4
            r14 = 0
            java.lang.String r10 = "-"
            java.lang.String r11 = ""
            java.lang.String r4 = kotlin.text.StringsKt.replace$default(r9, r10, r11, r12, r13, r14)
            r11 = 0
            r12 = 4
            r13 = 0
            java.lang.String r9 = "-"
            java.lang.String r10 = ""
            java.lang.String r7 = kotlin.text.StringsKt.replace$default(r8, r9, r10, r11, r12, r13)
            boolean r4 = kotlin.text.StringsKt.equals(r4, r7, r5)
            if (r4 == 0) goto L81
            r4 = 1
            goto L82
        L81:
            r4 = 0
        L82:
            if (r4 == 0) goto L32
        L84:
            if (r5 == 0) goto Lc
            goto L88
        L87:
            r1 = 0
        L88:
            com.lagradost.cloudstream3.ui.player.SubtitleData r1 = (com.lagradost.cloudstream3.p041ui.player.SubtitleData) r1
            return r1
        */// com.lagradost.cloudstream3.p041ui.player.IPlayer

    /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
        continue;
     */
    @get:Override
    override val currentPreferredSubtitle: SubtitleData?
        // com.lagradost.cloudstream3.p041ui.player.IPlayer
        /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */  get() {
            /*
                 r15 = this;
                 com.lagradost.cloudstream3.ui.player.PlayerSubtitleHelper r0 = r15.subtitleHelper
                 java.util.Set r0 = r0.getAllSubtitles()
                 java.lang.Iterable r0 = (java.lang.Iterable) r0
                 java.util.Iterator r0 = r0.iterator()
             Lc:
                 boolean r1 = r0.hasNext()
                 if (r1 == 0) goto L87
                 java.lang.Object r1 = r0.next()
                 r2 = r1
                 com.lagradost.cloudstream3.ui.player.SubtitleData r2 = (com.lagradost.cloudstream3.p041ui.player.SubtitleData) r2
                 java.util.List<kotlin.Pair<java.lang.String, java.lang.Boolean>> r3 = r15.exoPlayerSelectedTracks
                 java.lang.Iterable r3 = (java.lang.Iterable) r3
                 boolean r4 = r3 instanceof java.util.Collection
                 r5 = 1
                 r6 = 0
                 if (r4 == 0) goto L2e
                 r4 = r3
                 java.util.Collection r4 = (java.util.Collection) r4
                 boolean r4 = r4.isEmpty()
                 if (r4 == 0) goto L2e
             L2c:
                 r5 = 0
                 goto L84
             L2e:
                 java.util.Iterator r3 = r3.iterator()
             L32:
                 boolean r4 = r3.hasNext()
                 if (r4 == 0) goto L2c
                 java.lang.Object r4 = r3.next()
                 kotlin.Pair r4 = (kotlin.Tuples) r4
                 com.lagradost.cloudstream3.ui.player.SubtitleOrigin r7 = r2.getOrigin()
                 com.lagradost.cloudstream3.ui.player.SubtitleOrigin r8 = com.lagradost.cloudstream3.p041ui.player.SubtitleOrigin.EMBEDDED_IN_VIDEO
                 if (r7 != r8) goto L4b
                 java.lang.String r7 = r2.getUrl()
                 goto L4f
             L4b:
                 java.lang.String r7 = r2.getName()
             L4f:
                 r8 = r7
                 java.lang.Object r7 = r4.getSecond()
                 java.lang.Boolean r7 = (java.lang.Boolean) r7
                 boolean r7 = r7.booleanValue()
                 if (r7 == 0) goto L81
                 java.lang.Object r4 = r4.getFirst()
                 r9 = r4
                 java.lang.String r9 = (java.lang.String) r9
                 r12 = 0
                 r13 = 4
                 r14 = 0
                 java.lang.String r10 = "-"
                 java.lang.String r11 = ""
                 java.lang.String r4 = kotlin.text.StringsKt.replace$default(r9, r10, r11, r12, r13, r14)
                 r11 = 0
                 r12 = 4
                 r13 = 0
                 java.lang.String r9 = "-"
                 java.lang.String r10 = ""
                 java.lang.String r7 = kotlin.text.StringsKt.replace$default(r8, r9, r10, r11, r12, r13)
                 boolean r4 = kotlin.text.StringsKt.equals(r4, r7, r5)
                 if (r4 == 0) goto L81
                 r4 = 1
                 goto L82
             L81:
                 r4 = 0
             L82:
                 if (r4 == 0) goto L32
             L84:
                 if (r5 == 0) goto Lc
                 goto L88
             L87:
                 r1 = 0
             L88:
                 com.lagradost.cloudstream3.ui.player.SubtitleData r1 = (com.lagradost.cloudstream3.p041ui.player.SubtitleData) r1
                 return r1
             */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.p041ui.player.CS3IPlayer.getCurrentPreferredSubtitle():com.lagradost.cloudstream3.ui.player.SubtitleData")
        }

    @Override // com.lagradost.cloudstream3.p041ui.player.IPlayer
    public override fun updateSubtitleStyle(style: SaveCaptionStyle) {
        Intrinsics.checkNotNullParameter(style, "style")
        subtitleHelper.setSubStyle(style)
    }

    private fun saveData() {
        Log.i(CS3IPlayerKt.TAG, "saveData")
        updatedTime()
        val exoPlayer: ExoPlayer? = exoPlayer
        if (exoPlayer != null) {
            playbackPosition = exoPlayer.getCurrentPosition()
            currentWindow = exoPlayer.getCurrentWindowIndex()
            isPlaying = exoPlayer.isPlaying()
        }
    }

    private fun releasePlayer(z: Boolean) {
        Log.i(CS3IPlayerKt.TAG, "releasePlayer")
        if (z) {
            updatedTime()
        }
        val exoPlayer: ExoPlayer? = exoPlayer
        if (exoPlayer != null) {
            exoPlayer.release()
        }
        Companion.currentTextRenderer = null
        this.exoPlayer = null
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.IPlayer
    public override fun onStop() {
        Log.i(CS3IPlayerKt.TAG, "onStop")
        saveData()
        val exoPlayer: ExoPlayer? = exoPlayer
        if (exoPlayer != null) {
            exoPlayer.pause()
        }
        Companion.`releasePlayer$default`(this, false, 1, null)
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.IPlayer
    public override fun onPause() {
        Log.i(CS3IPlayerKt.TAG, "onPause")
        saveData()
        val exoPlayer: ExoPlayer? = exoPlayer
        if (exoPlayer != null) {
            exoPlayer.pause()
        }
        Companion.`releasePlayer$default`(this, false, 1, null)
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.IPlayer
    public override fun onResume(context: Context?) {
        Intrinsics.checkNotNullParameter(context, "context")
        if (exoPlayer == null) {
            reloadPlayer(context)
        }
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.IPlayer
    public override fun release() {
        Companion.`releasePlayer$default`(this, false, 1, null)
    }

    /* compiled from: CS3IPlayer.kt */
    @Metadata(
        m108d1 = ["\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u008e\u0001\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u000c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020\"2\b\b\u0002\u0010(\u001a\u00020)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/2\n\b\u0002\u00100\u001a\u0004\u0018\u000101H\u0002J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0002J\u001a\u00106\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\"H\u0002J\u0018\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u00142\u0006\u00109\u001a\u00020:H\u0002J)\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u00142\u0006\u0010;\u001a\u00020\u00142\n\b\u0002\u0010<\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0002\u0010=J\u0010\u0010>\u001a\u00020?2\u0006\u00108\u001a\u00020\u0014H\u0002J\u0010\u0010@\u001a\u00020-2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u000c\u0010A\u001a\u000203*\u00020\u0019H\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000c\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006B"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/player/CS3IPlayer\$Companion;", "", "()V", "currentTextRenderer", "Lcom/lagradost/cloudstream3/ui/player/CustomTextRenderer;", "getCurrentTextRenderer", "()Lcom/lagradost/cloudstream3/ui/player/CustomTextRenderer;", "setCurrentTextRenderer", "(Lcom/lagradost/cloudstream3/ui/player/CustomTextRenderer;)V", "requestSubtitleUpdate", "Lkotlin/Function0;", "", "getRequestSubtitleUpdate", "()Lkotlin/jvm/functions/Function0;", "setRequestSubtitleUpdate", "(Lkotlin/jvm/functions/Function0;)V", "simpleCache", "Lcom/google/android/exoplayer2/upstream/cache/SimpleCache;", "ytVideos", "", "", "Lat/huber/youtubeExtractor/YtFile;", "buildExoPlayer", "Lcom/google/android/exoplayer2/ExoPlayer;", "context", "Landroid/content/Context;", "mediaItem", "Lcom/google/android/exoplayer2/MediaItem;", "subSources", "", "Lcom/google/android/exoplayer2/source/SingleSampleMediaSource;", "currentWindow", "", "playbackPosition", "", "playBackSpeed", "", "subtitleOffset", "cacheSize", "videoBufferMs", "playWhenReady", "", "cacheFactory", "Lcom/google/android/exoplayer2/upstream/cache/CacheDataSource\$Factory;", "trackSelector", "Lcom/google/android/exoplayer2/trackselection/TrackSelector;", "playerView", "Lcom/google/android/exoplayer2/ui/PlayerView;", "imaAdsLoader", "Lcom/google/android/exoplayer2/ext/ima/ImaAdsLoader;", "createOnlineSource", "Lcom/google/android/exoplayer2/upstream/DataSource\$Factory;", "link", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "getCache", "getMediaItem", "mimeType", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "url", "isLiveStream", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/google/android/exoplayer2/MediaItem;", "getMediaItemBuilder", "Lcom/google/android/exoplayer2/MediaItem\$Builder;", "getTrackSelector", "createOfflineSource", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.player.CS3IPlayer$Companion */ /* loaded from: classes3.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        var requestSubtitleUpdate: Functions<Unit>
            get() {
                return CS3IPlayer.Companion.requestSubtitleUpdate
            }
            set(functions) {
                CS3IPlayer.Companion.requestSubtitleUpdate = functions
            }

        /* JADX INFO: Access modifiers changed from: private */
        fun createOnlineSource(extractorLink: ExtractorLink?): DataSource.Factory {
            val factory: OkHttpDataSource.Factory
            val videoInterceptor: Interceptor? =
                APIHolder.INSTANCE.getApiFromName(extractorLink.source)
                    .getVideoInterceptor(extractorLink)
            if (videoInterceptor == null) {
                val allowCrossProtocolRedirects: DefaultHttpDataSource.Factory =
                    DefaultHttpDataSource.Factory().setUserAgent(MainAPIKt.USER_AGENT)
                        .setAllowCrossProtocolRedirects(true)
                Intrinsics.checkNotNullExpressionValue(
                    allowCrossProtocolRedirects,
                    "{\n                Defaul…yer-android\n            }"
                )
                factory = allowCrossProtocolRedirects
            } else {
                val userAgent: OkHttpDataSource.Factory = OkHttpDataSource.Factory(
                    MainActivityKt.getApp().getBaseClient().newBuilder()
                        .addInterceptor(videoInterceptor).build()
                ).setUserAgent(MainAPIKt.USER_AGENT)
                Intrinsics.checkNotNullExpressionValue(
                    userAgent,
                    "{\n                val cl…USER_AGENT)\n            }"
                )
                factory = userAgent
            }
            factory.setDefaultRequestProperties(
                MapsKt.plus(
                    MapsKt.mapOf(
                        TuplesKt.m100to<Any, Any>(
                            "referer",
                            extractorLink.referer
                        ),
                        TuplesKt.m100to<Any, Any>("accept", MimeType.UNKNOWN),
                        TuplesKt.m100to<Any, Any>(
                            "sec-ch-ua",
                            "\"Chromium\";v=\"91\", \" Not;A Brand\";v=\"99\""
                        ),
                        TuplesKt.m100to<Any, Any>("sec-ch-ua-mobile", "?0"),
                        TuplesKt.m100to<Any, Any>("sec-fetch-user", "?1"),
                        TuplesKt.m100to<Any, Any>("sec-fetch-mode", "navigate"),
                        TuplesKt.m100to<Any, Any>("sec-fetch-dest", "video")
                    ), extractorLink.headers
                )
            )
            return factory
        }

        /* JADX INFO: Access modifiers changed from: private */
        fun createOfflineSource(context: Context?): DataSource.Factory {
            return DefaultDataSourceFactory(context, MainAPIKt.USER_AGENT)
        }

        /* JADX INFO: Access modifiers changed from: private */
        fun getCache(context: Context?, j: Long): SimpleCache? {
            try {
                val standaloneDatabaseProvider: StandaloneDatabaseProvider =
                    StandaloneDatabaseProvider(context)
                val file: File = File(context.getCacheDir(), "exoplayer")
                file.deleteOnExit()
                return SimpleCache(
                    file,
                    LeastRecentlyUsedCacheEvictor(j),
                    standaloneDatabaseProvider
                )
            } catch (e: Exception) {
                ArchComponentExt.logError(e)
                return null
            }
        }

        private fun getMediaItemBuilder(str: String): MediaItem.Builder {
            val mimeType: MediaItem.Builder
            var config: Config
            var config2: Config
            var config3: Config
            val companion: AppController? = AppController.Companion.getInstance()
            var str2: String? = null
            if ((if (companion != null) companion.getKey() else null) != null) {
                val companion2: AppController? = AppController.Companion.getInstance()
                val key: Key? = if (companion2 != null) companion2.getKey() else null
                Intrinsics.checkNotNull(key)
                if (!key!!.isExpired()) {
                    mimeType = MediaItem.Builder().setMimeType(str)
                    Intrinsics.checkNotNullExpressionValue(
                        mimeType,
                        "if(AppController.instanc…      }\n                }"
                    )
                    return mimeType
                }
            }
            val companion3: AppController? = AppController.Companion.getInstance()
            var z: Boolean = false
            if (companion3 != null && !companion3.getVastAdded()) {
                z = true
            }
            if (z) {
                val companion4: AppController? = AppController.Companion.getInstance()
                if ((if ((companion4 == null || (companion4.getConfig()
                            .also({ config3 = it })) == null)
                    ) null else config3.vast) != null
                ) {
                    val companion5: AppController? = AppController.Companion.getInstance()
                    if (companion5 != null) {
                        companion5.setVastAdded(true)
                    }
                    val mimeType2: MediaItem.Builder = MediaItem.Builder().setMimeType(str)
                    val companion6: AppController? = AppController.Companion.getInstance()
                    val builder: AdsConfiguration.Builder = AdsConfiguration.Builder(
                        Uri.parse(
                            if ((companion6 == null || (companion6.getConfig()
                                    .also({ config2 = it })) == null)
                            ) null else config2.vast
                        )
                    )
                    val companion7: AppController? = AppController.Companion.getInstance()
                    if (companion7 != null && (companion7.getConfig()
                            .also({ config = it })) != null
                    ) {
                        str2 = config.vast
                    }
                    mimeType =
                        mimeType2.setAdsConfiguration(builder.setAdTagUri(Uri.parse(str2)).build())
                    Intrinsics.checkNotNullExpressionValue(
                        mimeType,
                        "if(AppController.instanc…      }\n                }"
                    )
                    return mimeType
                }
            }
            mimeType = MediaItem.Builder().setMimeType(str)
            Intrinsics.checkNotNullExpressionValue(
                mimeType,
                "if(AppController.instanc…      }\n                }"
            )
            return mimeType
        }

        /* JADX INFO: Access modifiers changed from: private */
        fun getMediaItem(str: String, uri: Uri?): MediaItem {
            val build: MediaItem = getMediaItemBuilder(str).setUri(uri).build()
            Intrinsics.checkNotNullExpressionValue(
                build,
                "getMediaItemBuilder(mimeType).setUri(uri).build()"
            )
            return build
        }

        /* JADX INFO: Access modifiers changed from: private */
        fun getMediaItem(str: String, str2: String?, bool: Boolean?): MediaItem {
            val uri: MediaItem.Builder = getMediaItemBuilder(str).setUri(str2)
            Intrinsics.checkNotNullExpressionValue(uri, "getMediaItemBuilder(mimeType).setUri(url)")
            if (Intrinsics.areEqual(bool as Object?, true as Object?)) {
                uri.setLiveConfiguration(
                    LiveConfiguration.Builder().setMaxPlaybackSpeed(1.02f).build()
                )
            }
            val build: MediaItem = uri.build()
            Intrinsics.checkNotNullExpressionValue(build, "mediaItem.build()")
            return build
        }

        private fun getTrackSelector(context: Context?): TrackSelector {
            val defaultTrackSelector: DefaultTrackSelector = DefaultTrackSelector(context)
            defaultTrackSelector.setParameters(
                ParametersBuilder(context).setRendererDisabled(
                    3,
                    true
                ).setDisabledTextTrackSelectionFlags(3).clearSelectionOverrides().build()
            )
            return defaultTrackSelector
        }

        var currentTextRenderer: CustomTextRenderer
            get() {
                return CS3IPlayer.Companion.currentTextRenderer
            }
            set(customTextRenderer) {
                CS3IPlayer.Companion.currentTextRenderer = customTextRenderer
            }

        private fun buildExoPlayer(
            context: Context?,
            mediaItem: MediaItem,
            list: List<SingleSampleMediaSource>,
            i: Int,
            j: Long,
            f: Float,
            j2: Long,
            j3: Long,
            j4: Long,
            z: Boolean,
            factory: CacheDataSource.Factory?,
            trackSelector: TrackSelector?,
            playerView: PlayerView?,
            imaAdsLoader: ImaAdsLoader?
        ): ExoPlayer {
            val adsLoaderProvider: DefaultMediaSourceFactory
            val loadControl: ExoPlayer.Builder =
                ExoPlayer.Builder(context).setRenderersFactory(object : RenderersFactory {
                    // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$CS3IPlayer$Companion$EnatB5mN82SH8E_V7KMfDTIs5YY
                    @Override // com.google.android.exoplayer2.RenderersFactory
                    public override fun createRenderers(
                        handler: Handler,
                        videoRendererEventListener: VideoRendererEventListener,
                        audioRendererEventListener: AudioRendererEventListener,
                        textOutput: TextOutput,
                        metadataOutput: MetadataOutput
                    ): Array<Renderer> {
                        val `m8666buildExoPlayer$lambda3`: Array<Renderer>
                        `m8666buildExoPlayer$lambda3` = `m8666buildExoPlayer$lambda3`(
                            context,
                            j2,
                            handler,
                            videoRendererEventListener,
                            audioRendererEventListener,
                            textOutput,
                            metadataOutput
                        )
                        return `m8666buildExoPlayer$lambda3`
                    }
                })
                    .setTrackSelector(if (trackSelector == null) getTrackSelector(context) else trackSelector)
                    .setLoadControl(
                        DefaultLoadControl.Builder()
                            .setTargetBufferBytes(if (j3 <= 0) -1 else if (j3 > 2147483647L) Integer.MAX_VALUE else j3.toInt())
                            .setBufferDurationsMs(
                                50000,
                                if (j4 <= 0) 50000 else j4.toInt(),
                                DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS,
                                5000
                            ).build()
                    )
            Intrinsics.checkNotNullExpressionValue(
                loadControl,
                "Builder(context)\n       …d()\n                    )"
            )
            if (factory == null) {
                adsLoaderProvider = DefaultMediaSourceFactory(context)
            } else {
                adsLoaderProvider = DefaultMediaSourceFactory(factory).setAdsLoaderProvider(object :
                    AdsLoaderProvider {
                    // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$CS3IPlayer$Companion$8YC1wfp7PMa-yuZTYbmCAMIUJeE
                    @Override // com.google.android.exoplayer2.source.DefaultMediaSourceFactory.AdsLoaderProvider
                    public override fun getAdsLoader(adsConfiguration: AdsConfiguration): AdsLoader {
                        val `m8667buildExoPlayer$lambda4`: AdsLoader
                        `m8667buildExoPlayer$lambda4` =
                            `m8667buildExoPlayer$lambda4`(this@ImaAdsLoader, adsConfiguration)
                        return `m8667buildExoPlayer$lambda4`
                    }
                })
            }
            val createMediaSource: MediaSource =
                adsLoaderProvider.setAdViewProvider(playerView).createMediaSource(mediaItem)
            Intrinsics.checkNotNullExpressionValue(
                createMediaSource,
                "if (cacheFactory == null…ateMediaSource(mediaItem)"
            )
            val build: ExoPlayer = loadControl.build()
            build.setPlayWhenReady(z)
            build.seekTo(i, j)
            val spreadBuilder: SpreadBuilder = SpreadBuilder(2)
            spreadBuilder.add(createMediaSource)
            val array: Array<Object> = list.toArray(arrayOfNulls<SingleSampleMediaSource>(0))
            Objects.requireNonNull(
                array,
                "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            )
            spreadBuilder.addSpread(array)
            build.setMediaSource(
                MergingMediaSource(
                    *spreadBuilder.toArray(
                        arrayOfNulls<MediaSource>(
                            spreadBuilder.size()
                        )
                    ) as Array<MediaSource?>
                ), j
            )
            build.setHandleAudioBecomingNoisy(true)
            build.setPlaybackSpeed(f)
            Intrinsics.checkNotNullExpressionValue(
                build,
                "exoPlayerBuilder.build()…BackSpeed)\n\n            }"
            )
            return build
        }

        companion object {
            fun  /* synthetic */`getMediaItem$default`(
                companion: CS3IPlayer.Companion,
                str: String,
                str2: String?,
                bool: Boolean?,
                i: Int,
                obj: Object?
            ): MediaItem {
                var bool: Boolean? = bool
                if ((i and 4) != 0) {
                    bool = false
                }
                return companion.getMediaItem(str, str2, bool)
            }

            fun  /* synthetic */`buildExoPlayer$default`(
                companion: CS3IPlayer.Companion,
                context: Context?,
                mediaItem: MediaItem,
                list: List,
                i: Int,
                j: Long,
                f: Float,
                j2: Long,
                j3: Long,
                j4: Long,
                z: Boolean,
                factory: CacheDataSource.Factory?,
                trackSelector: TrackSelector?,
                playerView: PlayerView?,
                imaAdsLoader: ImaAdsLoader?,
                i2: Int,
                obj: Object?
            ): ExoPlayer {
                return companion.buildExoPlayer(
                    context,
                    mediaItem,
                    list,
                    i,
                    j,
                    f,
                    j2,
                    j3,
                    j4,
                    if ((i2 and 512) != 0) true else z,
                    if ((i2 and 1024) != 0) null else factory,
                    if ((i2 and 2048) != 0) null else trackSelector,
                    playerView,
                    if ((i2 and 8192) != 0) null else imaAdsLoader
                )
            }

            /* JADX INFO: Access modifiers changed from: private */ /* renamed from: buildExoPlayer$lambda-3  reason: not valid java name */
            fun `m8666buildExoPlayer$lambda3`(
                context: Context?,
                j: Long,
                eventHandler: Handler,
                videoRendererEventListener: VideoRendererEventListener?,
                audioRendererEventListener: AudioRendererEventListener?,
                textRendererOutput: TextOutput?,
                metadataRendererOutput: MetadataOutput?
            ): Array<Renderer> {
                Intrinsics.checkNotNullParameter(context, "\$context")
                Intrinsics.checkNotNullParameter(eventHandler, "eventHandler")
                Intrinsics.checkNotNullParameter(
                    videoRendererEventListener,
                    "videoRendererEventListener"
                )
                Intrinsics.checkNotNullParameter(
                    audioRendererEventListener,
                    "audioRendererEventListener"
                )
                Intrinsics.checkNotNullParameter(textRendererOutput, "textRendererOutput")
                Intrinsics.checkNotNullParameter(metadataRendererOutput, "metadataRendererOutput")
                val createRenderers: Array<Renderer> =
                    DefaultRenderersFactory(context).createRenderers(
                        eventHandler,
                        videoRendererEventListener,
                        audioRendererEventListener,
                        textRendererOutput,
                        metadataRendererOutput
                    )
                Intrinsics.checkNotNullExpressionValue(
                    createRenderers,
                    "DefaultRenderersFactory(…                        )"
                )
                val rendererArr: Array<Renderer> = createRenderers
                val arrayList: ArrayList = ArrayList(rendererArr.size)
                for (customTextRenderer: CustomTextRenderer? in rendererArr) {
                    if (customTextRenderer is TextRenderer) {
                        Companion.setCurrentTextRenderer(
                            CustomTextRenderer(
                                j,
                                textRendererOutput,
                                eventHandler.getLooper(),
                                CustomSubtitleDecoderFactory()
                            )
                        )
                        val currentTextRenderer: CustomTextRenderer =
                            Companion.getCurrentTextRenderer()
                        Intrinsics.checkNotNull(currentTextRenderer)
                        customTextRenderer = currentTextRenderer
                    }
                    arrayList.add(customTextRenderer)
                }
                val array: Array<Object> = arrayList.toArray(arrayOfNulls<Renderer>(0))
                Objects.requireNonNull(
                    array,
                    "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
                )
                return array
            }

            /* JADX INFO: Access modifiers changed from: private */ /* renamed from: buildExoPlayer$lambda-4  reason: not valid java name */
            fun `m8667buildExoPlayer$lambda4`(
                imaAdsLoader: ImaAdsLoader,
                it: AdsConfiguration?
            ): AdsLoader {
                Intrinsics.checkNotNullParameter(it, "it")
                return imaAdsLoader
            }
        }
    }

    fun updatedTime() {
        var function1: Function1<Tuples<Long?, Long?>?, Unit>
        val exoPlayer: ExoPlayer? = exoPlayer
        val valueOf: Long? =
            if (exoPlayer != null) Long.valueOf(exoPlayer.getCurrentPosition()) else null
        val exoPlayer2: ExoPlayer? = this.exoPlayer
        val valueOf2: Long? =
            if (exoPlayer2 != null) Long.valueOf(exoPlayer2.getContentDuration()) else null
        if ((valueOf2 == null) || (valueOf == null) || ((playerPositionChanged.also({
                function1 = it
            })) == null)) {
            return
        }
        function1.invoke(Tuples<Any?, Any?>(valueOf, valueOf2))
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.IPlayer
    public override fun seekTime(j: Long) {
        val exoPlayer: ExoPlayer? = exoPlayer
        if (exoPlayer != null) {
            seekTime(exoPlayer, j)
        }
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.IPlayer
    public override fun seekTo(j: Long) {
        updatedTime()
        val exoPlayer: ExoPlayer? = exoPlayer
        if (exoPlayer != null) {
            exoPlayer.seekTo(j)
        }
    }

    private fun seekTime(exoPlayer: ExoPlayer, j: Long) {
        updatedTime()
        exoPlayer.seekTo(exoPlayer.getCurrentPosition() + j)
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.IPlayer
    public override fun handleEvent(event: CSPlayerEvent) {
        Intrinsics.checkNotNullParameter(event, "event")
        Log.i(CS3IPlayerKt.TAG, "handleEvent " + event.name())
        try {
            val exoPlayer: ExoPlayer? = exoPlayer
            if (exoPlayer != null) {
                when (WhenMappings.`$EnumSwitchMapping$1`.get(event.ordinal())) {
                    1 -> exoPlayer.play()
                    2 -> exoPlayer.pause()
                    3 -> if (exoPlayer.getVolume() <= 0.0f) {
                        exoPlayer.setVolume(lastMuteVolume)
                        break
                    } else {
                        lastMuteVolume = exoPlayer.getVolume()
                        exoPlayer.setVolume(0.0f)
                        break
                    }
                    4 -> if (exoPlayer.isPlaying()) {
                        exoPlayer.pause()
                        break
                    } else {
                        exoPlayer.play()
                        break
                    }
                    5 -> seekTime(exoPlayer, seekActionTime)
                    6 -> seekTime(exoPlayer, -seekActionTime)
                    7 -> {
                        val functions: Functions<Unit>? = nextEpisode
                        if (functions != null) {
                            functions.invoke()
                            break
                        }
                    }
                    8 -> {
                        val functions2: Functions<Unit>? = prevEpisode
                        if (functions2 != null) {
                            functions2.invoke()
                            break
                        }
                    }
                }
            }
        } catch (e: Exception) {
            Log.e(CS3IPlayerKt.TAG, "handleEvent error", e)
            val function1: Function1<Exception?, Unit>? = playerError
            if (function1 != null) {
                function1.invoke(e)
            }
        }
    }

    fun getImaAdsLoader(): ImaAdsLoader? {
        return imaAdsLoader
    }

    fun setImaAdsLoader(imaAdsLoader: ImaAdsLoader?) {
        this.imaAdsLoader = imaAdsLoader
    }

    private fun loadExo(
        context: Context?,
        mediaItem: MediaItem,
        list: List<SingleSampleMediaSource>,
        factory: CacheDataSource.Factory?
    ) {
        var str: String?
        Log.i(CS3IPlayerKt.TAG, "loadExo")
        try {
            hasUsedFirstRender = false
            val build: ImaAdsLoader = ImaAdsLoader.Builder(context).build()
            imaAdsLoader = build
            val companion: Companion = Companion
            val i: Int = currentWindow
            val j: Long = playbackPosition
            val f: Float = playBackSpeed
            val j2: Long = cacheSize
            val j3: Long = videoBufferMs
            val z: Boolean = isPlaying
            val j4: Long = currentSubtitleOffset
            str = CS3IPlayerKt.TAG
            try {
                val `buildExoPlayer$default`: ExoPlayer = Companion.`buildExoPlayer$default`(
                    companion,
                    context,
                    mediaItem,
                    list,
                    i,
                    j,
                    f,
                    j4,
                    j2,
                    j3,
                    z,
                    factory,
                    null,
                    playerView,
                    build,
                    2048,
                    null
                )
                exoPlayer = `buildExoPlayer$default`
                val imaAdsLoader: ImaAdsLoader? = imaAdsLoader
                if (imaAdsLoader != null) {
                    imaAdsLoader.setPlayer(`buildExoPlayer$default`)
                }
                Companion.requestSubtitleUpdate = `CS3IPlayer$loadExo$1`(this)
                val function1: Function1<Object?, Unit>? = playerUpdated
                if (function1 != null) {
                    function1.invoke(exoPlayer)
                }
                val exoPlayer: ExoPlayer? = exoPlayer
                if (exoPlayer != null) {
                    exoPlayer.prepare()
                }
                val exoPlayer2: ExoPlayer? = this.exoPlayer
                if (exoPlayer2 != null) {
                    val function12: Function1<Tuples<out CSPlayerLoading?, out CSPlayerLoading?>, Unit>? =
                        updateIsPlaying
                    if (function12 != null) {
                        function12.invoke(
                            Tuples<Any?, Any?>(
                                CSPlayerLoading.IsBuffering,
                                CSPlayerLoading.IsBuffering
                            )
                        )
                    }
                    isPlaying = exoPlayer2.isPlaying()
                }
                val exoPlayer3: ExoPlayer? = this.exoPlayer
                if (exoPlayer3 != null) {
                    exoPlayer3.addListener(`CS3IPlayer$loadExo$3`(this) as Player.Listener?)
                }
            } catch (e: Exception) {
                e = e
                Log.e(str, "loadExo error", e)
                val function13: Function1<Exception?, Unit>? = playerError
                if (function13 != null) {
                    function13.invoke(e)
                }
            }
        } catch (e2: Exception) {
            e = e2
            str = CS3IPlayerKt.TAG
        }
    }

    fun onRenderFirst() {
        var list: List<Integer?>
        if (hasUsedFirstRender) {
            return
        }
        Log.i(CS3IPlayerKt.TAG, "Rendered first frame")
        val exoPlayer: ExoPlayer? = exoPlayer
        if (exoPlayer != null && exoPlayer.getDuration() < SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US) {
            val extractorUri: ExtractorUri? = currentDownloadedFile
        }
        setPreferredSubtitles(currentSubtitles)
        hasUsedFirstRender = true
        val exoPlayer2: ExoPlayer? = this.exoPlayer
        val videoFormat: Format? = if (exoPlayer2 != null) exoPlayer2.getVideoFormat() else null
        val valueOf: Integer? =
            if (videoFormat != null) Integer.valueOf(videoFormat.width) else null
        val valueOf2: Integer? =
            if (videoFormat != null) Integer.valueOf(videoFormat.height) else null
        if (valueOf2 == null || valueOf == null) {
            return
        }
        val function1: Function1<Tuples<Integer?, Integer?>?, Unit>? = playerDimensionsLoaded
        if (function1 != null) {
            function1.invoke(Tuples<Any?, Any?>(valueOf, valueOf2))
        }
        updatedTime()
        val exoPlayer3: ExoPlayer? = this.exoPlayer
        if (exoPlayer3 == null || (requestedListeningPercentages.also({ list = it })) == null) {
            return
        }
        for (number: Number in list) {
            exoPlayer3.createMessage(object : PlayerMessage.Target {
                // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$CS3IPlayer$g6xfHfeN6_1Sxd7ftAVJrpjcLtU
                @Override // com.google.android.exoplayer2.PlayerMessage.Target
                public override fun handleMessage(i: Int, obj: Object) {
                    Companion.`m8664onRenderFirst$lambda13$lambda12$lambda11`(
                        this@CS3IPlayer,
                        i,
                        obj
                    )
                }
            }).setLooper(Looper.getMainLooper())
                .setPosition((exoPlayer3.getContentDuration() * number.intValue()) / 100)
                .setDeleteAfterDelivery(false).send()
        }
    }

    private fun loadOfflinePlayer(context: Context?, extractorUri: ExtractorUri?) {
        Log.i(CS3IPlayerKt.TAG, "loadOfflinePlayer")
        try {
            currentDownloadedFile = extractorUri
            val companion: Companion = Companion
            val mediaItem: MediaItem =
                companion.getMediaItem(MimeTypes.VIDEO_MP4, extractorUri.getUri())
            val createOfflineSource: DataSource.Factory = companion.createOfflineSource(context)
            val subSources: Tuples<List<SingleSampleMediaSource>, List<SubtitleData>> =
                getSubSources(createOfflineSource, createOfflineSource, subtitleHelper)
            val component1: List<SingleSampleMediaSource> = subSources.component1()
            subtitleHelper.setActiveSubtitles(CollectionsKt.toSet(subSources.component2()))
            Companion.`loadExo$default`(this, context, mediaItem, component1, null, 8, null)
        } catch (e: Exception) {
            Log.e(CS3IPlayerKt.TAG, "loadOfflinePlayer error", e)
            val function1: Function1<Exception?, Unit>? = playerError
            if (function1 != null) {
                function1.invoke(e)
            }
        }
    }

    private fun getSubSources(
        factory: DataSource.Factory?,
        factory2: DataSource.Factory?,
        playerSubtitleHelper: PlayerSubtitleHelper
    ): Tuples<List<SingleSampleMediaSource>, List<SubtitleData>> {
        var singleSampleMediaSource: SingleSampleMediaSource?
        val arrayList: ArrayList = ArrayList()
        val arrayList2: ArrayList = ArrayList()
        for (subtitleData: SubtitleData? in playerSubtitleHelper.getAllSubtitles()) {
            val build: SubtitleConfiguration =
                SubtitleConfiguration.Builder(Uri.parse(subtitleData.getUrl()))
                    .setMimeType(subtitleData.getMimeType())
                    .setLanguage('_' + subtitleData.getName()).setSelectionFlags(1).build()
            Intrinsics.checkNotNullExpressionValue(
                build,
                "Builder(Uri.parse(sub.ur…\n                .build()"
            )
            val i: Int = WhenMappings.`$EnumSwitchMapping$2`.get(subtitleData.getOrigin().ordinal())
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw NoWhenBranchMatchedException()
                    }
                    if (factory2 != null) {
                        arrayList.add(subtitleData)
                        singleSampleMediaSource = SingleSampleMediaSource.Factory(factory2)
                            .createMediaSource(build, C3282C.TIME_UNSET)
                    } else {
                        singleSampleMediaSource = null
                    }
                } else if (factory != null) {
                    arrayList.add(subtitleData)
                    singleSampleMediaSource = SingleSampleMediaSource.Factory(factory)
                        .createMediaSource(build, C3282C.TIME_UNSET)
                } else {
                    singleSampleMediaSource = null
                }
            } else if (factory2 != null) {
                arrayList.add(subtitleData)
                singleSampleMediaSource = SingleSampleMediaSource.Factory(factory2)
                    .createMediaSource(build, C3282C.TIME_UNSET)
            } else {
                singleSampleMediaSource = null
            }
            if (singleSampleMediaSource != null) {
                arrayList2.add(singleSampleMediaSource)
            }
        }
        return Tuples<List<SingleSampleMediaSource>, List<SubtitleData>>(arrayList2, arrayList)
    }

    fun loadYtFile(context: Context?, yt: YtFile?) {
        Intrinsics.checkNotNullParameter(context, "context")
        Intrinsics.checkNotNullParameter(yt, "yt")
        val url: String = yt.getUrl()
        Intrinsics.checkNotNullExpressionValue(url, "yt.url")
        val format: at.huber.youtubeExtractor.Format? = yt.getFormat()
        loadOnlinePlayer(
            context,
            ExtractorLink(
                "YouTube",
                "",
                url,
                "",
                if (format != null) format.getHeight() else Qualities.Unknown.value,
                false,
                null,
                null,
                224,
                null
            )
        )
    }

    private fun loadOnlinePlayer(context: Context?, extractorLink: ExtractorLink?) {
        Log.i(CS3IPlayerKt.TAG, "loadOnlinePlayer " + extractorLink)
        try {
            if (StringsKt.`contains$default`(
                    extractorLink.url as CharSequence?,
                    "youtube.com" as CharSequence?,
                    false,
                    2,
                    null as Object?
                )
            ) {
                val `replace$default`: String = StringsKt.`replace$default`(
                    extractorLink.url,
                    "/embed/",
                    "/watch?v=",
                    false,
                    4,
                    null as Object?
                )
                val ytFile: YtFile? = Companion.ytVideos.get(`replace$default`)
                if (ytFile != null) {
                    loadYtFile(context, ytFile)
                    return
                }
                val youTubeExtractor: YouTubeExtractor =
                    object : YouTubeExtractor(context, `replace$default`, this) {
                        // from class: com.lagradost.cloudstream3.ui.player.CS3IPlayer$loadOnlinePlayer$ytExtractor$1
                        /* synthetic */ var `$context`: Context? = null
                        /* synthetic */ var `$ytLink`: String? = null
                        /* synthetic */ var `this$0`: CS3IPlayer? = null

                        /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        init {
                            super(context)
                            `$context` = context
                            `$ytLink` = `replace$default`
                            `this$0` = this
                        }

                        @Override // at.huber.youtubeExtractor.YouTubeExtractor
                        protected override fun onExtractionComplete(
                            sparseArray: SparseArray<YtFile?>,
                            videoMeta: VideoMeta
                        ) {
                            val function1: Function1<*, *>?
                            val map: Map
                            var format: at.huber.youtubeExtractor.Format
                            var ytFile2: YtFile? = null
                            if (sparseArray != null) {
                                val size: Int = sparseArray.size()
                                for (i in 0 until size) {
                                    sparseArray.keyAt(i)
                                    val valueAt: YtFile = sparseArray.valueAt(i)
                                    val height: Int = if ((ytFile2 == null || (ytFile2.getFormat()
                                            .also({ format = it })) == null)
                                    ) 0 else format.getHeight()
                                    val format2: at.huber.youtubeExtractor.Format? =
                                        valueAt.getFormat()
                                    if (height < (if (format2 != null) format2.getHeight() else -1)) {
                                        val format3: at.huber.youtubeExtractor.Format? =
                                            valueAt.getFormat()
                                        if ((if (format3 != null) format3.getAudioBitrate() else -1) > 0) {
                                            ytFile2 = valueAt
                                        }
                                    }
                                }
                            }
                            if (ytFile2 == null) {
                                function1 = `this$0`!!.playerError
                                if (function1 != null) {
                                    function1.invoke(ErrorLoadingException("No Link"))
                                    return
                                }
                                return
                            }
                            val str: String? = `$ytLink`
                            val cS3IPlayer: CS3IPlayer? = `this$0`
                            val context2: Context? = `$context`
                            map = Companion.ytVideos
                            map.put(str, ytFile2)
                            cS3IPlayer!!.loadYtFile(context2, ytFile2)
                        }
                    }
                Log.i(CS3IPlayerKt.TAG, "YouTube extraction on " + `replace$default`)
                youTubeExtractor.extract(`replace$default`)
                return
            }
            currentLink = extractorLink
            if (ignoreSSL) {
                val sSLContext: SSLContext = SSLContext.getInstance("TLS")
                Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\")")
                sSLContext.init(null, arrayOf(SSLTrustManager()), SecureRandom())
                sSLContext.createSSLEngine()
                HttpsURLConnection.setDefaultHostnameVerifier(
                    `$$Lambda$CS3IPlayer$8b3TnVf7tccFRsf4O3iBf48LIBk`.Companion.INSTANCE
                )
                HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory())
            }
            val str: String =
                if (extractorLink.isM3u8) MimeTypes.APPLICATION_M3U8 else MimeTypes.VIDEO_MP4
            val companion: Companion = Companion
            val mediaItem: MediaItem = companion.getMediaItem(
                str, extractorLink.url, Boolean.valueOf(
                    Intrinsics.areEqual(extractorLink.extractorData, ConfigHomeKt.IPTV_API_NAME)
                )
            )
            val createOnlineSource: DataSource.Factory = companion.createOnlineSource(extractorLink)
            val subSources: Tuples<List<SingleSampleMediaSource>, List<SubtitleData>> =
                getSubSources(
                    createOnlineSource,
                    companion.createOfflineSource(context),
                    subtitleHelper
                )
            val component1: List<SingleSampleMediaSource> = subSources.component1()
            subtitleHelper.setActiveSubtitles(CollectionsKt.toSet(subSources.component2()))
            if (Companion.simpleCache == null) {
                Companion.simpleCache = companion.getCache(context, simpleCacheSize)
            }
            val factory: CacheDataSource.Factory = CacheDataSource.Factory()
            val simpleCache2: SimpleCache? = Companion.simpleCache
            if (simpleCache2 != null) {
                factory.setCache(simpleCache2)
            }
            factory.setUpstreamDataSourceFactory(createOnlineSource)
            loadExo(context, mediaItem, component1, factory)
        } catch (e: Exception) {
            Log.e(CS3IPlayerKt.TAG, "loadOnlinePlayer error", e)
            val function1: Function1<Exception?, Unit>? = playerError
            if (function1 != null) {
                function1.invoke(e)
            }
        }
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.IPlayer
    public override fun reloadPlayer(context: Context?) {
        Intrinsics.checkNotNullParameter(context, "context")
        Log.i(CS3IPlayerKt.TAG, "reloadPlayer")
        val exoPlayer: ExoPlayer? = exoPlayer
        if (exoPlayer != null) {
            exoPlayer.release()
        }
        val extractorLink: ExtractorLink? = currentLink
        if (extractorLink != null) {
            loadOnlinePlayer(context, extractorLink)
            return
        }
        val extractorUri: ExtractorUri? = currentDownloadedFile
        if (extractorUri != null) {
            loadOfflinePlayer(context, extractorUri)
        }
    }

    companion object {
        private val currentTextRenderer: CustomTextRenderer? = null
        private val requestSubtitleUpdate: Functions<Unit>? = null
        private val simpleCache: SimpleCache? = null
        val Companion: Companion = Companion(null)
        private val ytVideos: Map<String, YtFile> = LinkedHashMap()

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: loadOnlinePlayer$lambda-16  reason: not valid java name */
        fun `m8663loadOnlinePlayer$lambda16`(str: String?, sSLSession: SSLSession?): Boolean {
            Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>")
            Intrinsics.checkNotNullParameter(sSLSession, "<anonymous parameter 1>")
            return true
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: reloadSubs$lambda-1$lambda-0  reason: not valid java name */
        fun `m8665reloadSubs$lambda1$lambda0`(`this$0`: CS3IPlayer) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            try {
                `this$0`.seekTime(1L)
            } catch (e: Exception) {
                ArchComponentExt.logError(e)
            }
        }

        fun  /* synthetic */`releasePlayer$default`(
            cS3IPlayer: CS3IPlayer,
            z: Boolean,
            i: Int,
            obj: Object?
        ) {
            var z: Boolean = z
            if ((i and 1) != 0) {
                z = true
            }
            cS3IPlayer.releasePlayer(z)
        }

        fun  /* synthetic */`loadExo$default`(
            cS3IPlayer: CS3IPlayer,
            context: Context?,
            mediaItem: MediaItem,
            list: List,
            factory: CacheDataSource.Factory?,
            i: Int,
            obj: Object?
        ) {
            var factory: CacheDataSource.Factory? = factory
            if ((i and 8) != 0) {
                factory = null
            }
            cS3IPlayer.loadExo(context, mediaItem, list, factory)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onRenderFirst$lambda-13$lambda-12$lambda-11  reason: not valid java name */
        fun `m8664onRenderFirst$lambda13$lambda12$lambda11`(
            `this$0`: CS3IPlayer,
            i: Int,
            obj: Object?
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            `this$0`.updatedTime()
        }
    }
}