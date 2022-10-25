package com.lagradost.cloudstream3.p041ui.player

import android.app.Activity
import androidx.fragment.app.Fragment
import com.google.android.exoplayer2.Player
import com.lagradost.cloudstream3.utils.AppUtils
import kotlinx.coroutines.Debug
import kotlin.jvm.internal.Intrinsics

/* compiled from: AbstractPlayerFragment.kt */
@Metadata(
    m108d1 = ["\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010*\u001a\u00020+2\u000c\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-H\u0016J\b\u0010/\u001a\u00020+H\u0016J\u0010\u00100\u001a\u00020+2\u0006\u00101\u001a\u00020\u0006H\u0002J\b\u00102\u001a\u00020+H\u0016J\b\u00103\u001a\u00020+H\u0016J\u0006\u00104\u001a\u00020+J&\u00105\u001a\u0004\u0018\u0001062\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\b\u0010=\u001a\u00020+H\u0016J\b\u0010>\u001a\u00020+H\u0016J\u0010\u0010?\u001a\u00020+2\u0006\u0010@\u001a\u00020\u0006H\u0016J\b\u0010A\u001a\u00020+H\u0016J\b\u0010B\u001a\u00020+H\u0016J\u0010\u0010C\u001a\u00020+2\u0006\u0010D\u001a\u00020\u001fH\u0002J\u001a\u0010E\u001a\u00020+2\u0006\u0010F\u001a\u0002062\b\u0010;\u001a\u0004\u0018\u00010<H\u0017J\u001c\u0010G\u001a\u00020+2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0IH\u0016J\u0014\u0010J\u001a\u00020+2\n\u0010K\u001a\u00060Lj\u0002`MH\u0016J\u001c\u0010N\u001a\u00020+2\u0012\u0010O\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020P0IH\u0016J\u0012\u0010Q\u001a\u00020+2\b\u0010\u0002\u001a\u0004\u0018\u00010RH\u0002J\b\u0010S\u001a\u00020+H\u0016J\b\u0010T\u001a\u00020+H\u0002J\u0016\u0010U\u001a\u00020+2\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020\u0006J\u0016\u0010U\u001a\u00020+2\u0006\u0010U\u001a\u00020\u000e2\u0006\u0010W\u001a\u00020\u0006J\b\u0010X\u001a\u00020+H\u0016J\u001c\u0010Y\u001a\u00020+2\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020[0IH\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0094\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\u000c\u0010\nR\u001e\u0010\r\u001a\u00020\u000e8\u0004@\u0004X\u0085\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0010\"\u0004\b\u001d\u0010\u0012R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006\\"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/player/AbstractPlayerFragment;", "Landroidx/fragment/app/Fragment;", "player", "Lcom/lagradost/cloudstream3/ui/player/IPlayer;", "(Lcom/lagradost/cloudstream3/ui/player/IPlayer;)V", "hasPipModeSupport", "", "getHasPipModeSupport", "()Z", "setHasPipModeSupport", "(Z)V", "isBuffering", "setBuffering", TtmlNode.TAG_LAYOUT, "", "getLayout", "()I", "setLayout", "(I)V", "mMediaSessionCompat", "Landroid/support/v4/media/session/MediaSessionCompat;", "mediaSessionConnector", "Lcom/google/android/exoplayer2/ext/mediasession/MediaSessionConnector;", "pipReceiver", "Landroid/content/BroadcastReceiver;", "getPlayer", "()Lcom/lagradost/cloudstream3/ui/player/IPlayer;", "resizeMode", "getResizeMode", "setResizeMode", "subStyle", "Lcom/lagradost/cloudstream3/ui/subtitles/SaveCaptionStyle;", "getSubStyle", "()Lcom/lagradost/cloudstream3/ui/subtitles/SaveCaptionStyle;", "setSubStyle", "(Lcom/lagradost/cloudstream3/ui/subtitles/SaveCaptionStyle;)V", "subView", "Lcom/google/android/exoplayer2/ui/SubtitleView;", "getSubView", "()Lcom/google/android/exoplayer2/ui/SubtitleView;", "setSubView", "(Lcom/google/android/exoplayer2/ui/SubtitleView;)V", "embeddedSubtitlesFetched", "", "subtitles", "", "Lcom/lagradost/cloudstream3/ui/player/SubtitleData;", "exitedPipMode", "keepScreenOn", Debug.DEBUG_PROPERTY_VALUE_ON, "nextEpisode", "nextMirror", "nextResize", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onDestroyView", "onPictureInPictureModeChanged", "isInPictureInPictureMode", "onResume", "onStop", "onSubStyleChanged", "style", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "playerDimensionsLoaded", "widthHeight", "Lkotlin/Pair;", "playerError", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "playerPositionChanged", "posDur", "", "playerUpdated", "", "prevEpisode", "requestAudioFocus", "resize", "Lcom/lagradost/cloudstream3/ui/player/PlayerResize;", "showToast", "subtitlesChanged", "updateIsPlaying", "playing", "Lcom/lagradost/cloudstream3/ui/player/CSPlayerLoading;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.player.AbstractPlayerFragment */ /* loaded from: classes3.dex */
abstract class AbstractPlayerFragment constructor(player: IPlayer) : Fragment() {
    var `_$_findViewCache`: Map<Integer, View>
    protected open var hasPipModeSupport: Boolean
    var isBuffering: Boolean
    /* JADX INFO: Access modifiers changed from: protected *//* JADX INFO: Access modifiers changed from: protected */  var layout: Int
    private var mMediaSessionCompat: MediaSessionCompat? = null
    private val mediaSessionConnector: MediaSessionConnector? = null
    private var pipReceiver: BroadcastReceiver? = null
    val player: IPlayer
    var resizeMode: Int = 0
    var subStyle: SaveCaptionStyle? = null
    var subView: SubtitleView? = null

    /* compiled from: AbstractPlayerFragment.kt */
    @Metadata(
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.player.AbstractPlayerFragment$WhenMappings */ /* loaded from: classes3.dex */
    /* synthetic */
    object WhenMappings {
        /* synthetic */ val `$EnumSwitchMapping$0`: IntArray

        init {
            val iArr: IntArray = IntArray(PlayerResize.values().size)
            com.lagradost.cloudstream3.p041ui.player.iArr.get(PlayerResize.Fill.ordinal()) = 1
            com.lagradost.cloudstream3.p041ui.player.iArr.get(PlayerResize.Fit.ordinal()) = 2
            com.lagradost.cloudstream3.p041ui.player.iArr.get(PlayerResize.Zoom.ordinal()) = 3
            `$EnumSwitchMapping$0` = com.lagradost.cloudstream3.p041ui.player.iArr
        }
    }

    open fun `_$_clearFindViewByIdCache`() {
        `_$_findViewCache`.clear()
    }

    open fun `_$_findCachedViewById`(i: Int): View? {
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

    init {
        Intrinsics.checkNotNullParameter(player, "player")
        `_$_findViewCache` = LinkedHashMap()
        this.player = player
        isBuffering = true
        hasPipModeSupport = true
        layout = R.layout.fragment_player
    }

    @JvmOverloads
            /* synthetic */   constructor(
        cS3IPlayer: CS3IPlayer? = null,
        i: Int = 1,
        defaultConstructorMarker: DefaultConstructorMarker? = null
    ) : this(if ((i and 1) != 0) CS3IPlayer() else cS3IPlayer) {
    }

    open fun nextEpisode() {
        throw Standard(null, 1, null)
    }

    open fun prevEpisode() {
        throw Standard(null, 1, null)
    }

    open fun playerPositionChanged(posDur: Tuples<Long?, Long?>?) {
        Intrinsics.checkNotNullParameter(posDur, "posDur")
        throw Standard(null, 1, null)
    }

    open fun playerDimensionsLoaded(widthHeight: Tuples<Integer?, Integer?>?) {
        Intrinsics.checkNotNullParameter(widthHeight, "widthHeight")
        throw Standard(null, 1, null)
    }

    open fun subtitlesChanged() {
        throw Standard(null, 1, null)
    }

    open fun embeddedSubtitlesFetched(subtitles: List<SubtitleData?>?) {
        Intrinsics.checkNotNullParameter(subtitles, "subtitles")
        throw Standard(null, 1, null)
    }

    open fun exitedPipMode() {
        throw Standard(null, 1, null)
    }

    private fun keepScreenOn(z: Boolean) {
        var window: Window
        var window2: Window
        if (z) {
            val activity: FragmentActivity? = getActivity()
            if (activity == null || (activity.getWindow().also({ window2 = it })) == null) {
                return
            }
            window2.addFlags(128)
            return
        }
        val activity2: FragmentActivity? = getActivity()
        if (activity2 == null || (activity2.getWindow().also({ window = it })) == null) {
            return
        }
        window.clearFlags(128)
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun updateIsPlaying(tuples: Tuples<out CSPlayerLoading, out CSPlayerLoading>) {
        var z: Boolean
        var imageView: ImageView
        var activity: FragmentActivity?
        val component1: CSPlayerLoading = tuples.component1()
        val component2: CSPlayerLoading = tuples.component2()
        var z2: Boolean = false
        val z3: Boolean = CSPlayerLoading.IsPlaying == component2
        keepScreenOn(!(CSPlayerLoading.IsPaused == component2))
        val z4: Boolean = CSPlayerLoading.IsBuffering == component2
        isBuffering = z4
        if (z4) {
            val frameLayout: FrameLayout? =
                `_$_findCachedViewById`(C4761R.C4764id.player_pause_play_holder_holder) as FrameLayout?
            if (frameLayout != null) {
                frameLayout.setVisibility(8)
            }
            val progressBar: ProgressBar? =
                `_$_findCachedViewById`(C4761R.C4764id.player_buffering) as ProgressBar?
            if (progressBar != null) {
                progressBar.setVisibility(0)
            }
        } else {
            val frameLayout2: FrameLayout? =
                `_$_findCachedViewById`(C4761R.C4764id.player_pause_play_holder_holder) as FrameLayout?
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(0)
            }
            val progressBar2: ProgressBar? =
                `_$_findCachedViewById`(C4761R.C4764id.player_buffering) as ProgressBar?
            if (progressBar2 != null) {
                progressBar2.setVisibility(8)
            }
            var i: Int = R.drawable.netflix_pause
            if (component1 != component2) {
                val imageView2: ImageView? =
                    `_$_findCachedViewById`(C4761R.C4764id.player_pause_play) as ImageView?
                if (imageView2 != null) {
                    imageView2.setImageResource(if (z3) R.drawable.play_to_pause else R.drawable.pause_to_play)
                }
                val imageView3: ImageView? =
                    `_$_findCachedViewById`(C4761R.C4764id.player_pause_play) as ImageView?
                val drawable: Drawable? = if (imageView3 != null) imageView3.getDrawable() else null
                if (Build.VERSION.SDK_INT <= 28 || !(drawable is AnimatedImageDrawable)) {
                    z = false
                } else {
                    (drawable as AnimatedImageDrawable?).start()
                    z = true
                }
                if (drawable is AnimatedVectorDrawable) {
                    (drawable as AnimatedVectorDrawable?).start()
                    z = true
                }
                if (drawable is AnimatedVectorDrawableCompat) {
                    (drawable as AnimatedVectorDrawableCompat?).start()
                    z = true
                }
                if (!z && (`_$_findCachedViewById`(C4761R.C4764id.player_pause_play) as ImageView?. also ({
                        imageView = it
                    })) != null) {
                    if (!z3) {
                        i = R.drawable.netflix_play
                    }
                    imageView.setImageResource(i)
                }
            } else {
                val imageView4: ImageView? =
                    `_$_findCachedViewById`(C4761R.C4764id.player_pause_play) as ImageView?
                if (imageView4 != null) {
                    if (!z3) {
                        i = R.drawable.netflix_play
                    }
                    imageView4.setImageResource(i)
                }
            }
        }
        val commonActivity: CommonActivity = CommonActivity.INSTANCE
        if (z3 && hasPipModeSupport) {
            z2 = true
        }
        commonActivity.canEnterPipMode = z2
        if ((Build.VERSION.SDK_INT < 26) || !CommonActivity.INSTANCE.isInPIPMode || ((getActivity().also(
                { activity = it })) == null)) {
            return
        }
        PlayerPipHelper.Companion.updatePIPModeActions(activity, z3)
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onPictureInPictureModeChanged(z: Boolean) {
        var activity: FragmentActivity
        try {
            CommonActivity.INSTANCE.isInPIPMode = z
            if (z) {
                val frameLayout: FrameLayout? =
                    `_$_findCachedViewById`(C4761R.C4764id.player_holder) as FrameLayout?
                if (frameLayout != null) {
                    frameLayout.setAlpha(0.0f)
                }
                pipReceiver = object : BroadcastReceiver() {
                    // from class: com.lagradost.cloudstream3.ui.player.AbstractPlayerFragment$onPictureInPictureModeChanged$1
                    @Override // android.content.BroadcastReceiver
                    fun onReceive(context: Context?, intent: Intent) {
                        Intrinsics.checkNotNullParameter(context, "context")
                        Intrinsics.checkNotNullParameter(intent, "intent")
                        if (Intrinsics.areEqual(
                                IPlayerKt.ACTION_MEDIA_CONTROL,
                                intent.getAction()
                            )
                        ) {
                            player.handleEvent(
                                CSPlayerEvent.values()
                                    .get(intent.getIntExtra(IPlayerKt.EXTRA_CONTROL_TYPE, 0))
                            )
                        }
                    }
                }
                val intentFilter: IntentFilter = IntentFilter()
                intentFilter.addAction(IPlayerKt.ACTION_MEDIA_CONTROL)
                val activity2: FragmentActivity? = getActivity()
                if (activity2 != null) {
                    activity2.registerReceiver(pipReceiver, intentFilter)
                }
                val cSPlayerLoading: CSPlayerLoading =
                    if (player.getIsPlaying()) CSPlayerLoading.IsPlaying else CSPlayerLoading.IsPaused
                updateIsPlaying(Tuples(cSPlayerLoading, cSPlayerLoading))
                return
            }
            val frameLayout2: FrameLayout? =
                `_$_findCachedViewById`(C4761R.C4764id.player_holder) as FrameLayout?
            if (frameLayout2 != null) {
                frameLayout2.setAlpha(1.0f)
            }
            exitedPipMode()
            val broadcastReceiver: BroadcastReceiver? = pipReceiver
            if (broadcastReceiver != null && (getActivity().also({ activity = it })) != null) {
                activity.unregisterReceiver(broadcastReceiver)
            }
            val activity3: FragmentActivity? = getActivity()
            if (activity3 != null) {
                UIHelper.INSTANCE.hideSystemUI(activity3)
            }
            val view: View? = getView()
            if (view != null) {
                UIHelper.INSTANCE.hideKeyboard(view)
            }
        } catch (e: Exception) {
            ArchComponentExt.logError(e)
        }
    }

    open fun nextMirror() {
        throw Standard(null, 1, null)
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun requestAudioFocus() {
        var activity: FragmentActivity?
        if (Build.VERSION.SDK_INT < 26 || (getActivity().also({ activity = it })) == null) {
            return
        }
        AppUtils.INSTANCE.requestLocalAudioFocus(activity, AppUtils.INSTANCE.focusRequest)
    }

    open fun playerError(exception: Exception) {
        Intrinsics.checkNotNullParameter(exception, "exception")
        exception.printStackTrace()
        val context: Context? = getContext()
        if (context == null) {
            return
        }
        if (exception is PlaybackException) {
            var message: String? = exception.getMessage()
            if (message == null) {
                message = ""
            }
            val playbackException: PlaybackException = exception as PlaybackException
            val errorCodeName: String = playbackException.getErrorCodeName()
            Intrinsics.checkNotNullExpressionValue(errorCodeName, "exception.errorCodeName")
            val i: Int = playbackException.errorCode
            if (i != 17 && i != 19) {
                if (i != 1001 && i != 1003) {
                    if (i != 3003) {
                        if (i != 5002) {
                            if (i != 2000) {
                                if (i != 2001) {
                                    when (i) {
                                        2003, 2004 -> {}
                                        2005, 2006 -> {}
                                        else -> when (i) {
                                            PlaybackException.ERROR_CODE_DECODER_INIT_FAILED, PlaybackException.ERROR_CODE_DECODER_QUERY_FAILED, PlaybackException.ERROR_CODE_DECODING_FAILED -> {}
                                            else -> {
                                                CommonActivity.INSTANCE.showToast(
                                                    getActivity() as Activity?,
                                                    context.getString(R.string.unexpected_error) + '\n' + errorCodeName + " (" + i + ")\n" + message,
                                                    0 as Integer?
                                                )
                                                return
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    CommonActivity.INSTANCE.showToast(
                        getActivity() as Activity?,
                        context.getString(R.string.source_error) + '\n' + errorCodeName + " (" + i + ")\n" + message,
                        0 as Integer?
                    )
                    nextMirror()
                    return
                }
                CommonActivity.INSTANCE.showToast(
                    getActivity() as Activity?,
                    context.getString(R.string.remote_error) + '\n' + errorCodeName + " (" + i + ")\n" + message,
                    0 as Integer?
                )
                nextMirror()
                return
            }
            CommonActivity.INSTANCE.showToast(
                getActivity() as Activity?,
                context.getString(R.string.render_error) + '\n' + errorCodeName + " (" + i + ")\n" + message,
                0 as Integer?
            )
            nextMirror()
        } else if (exception is InvalidFileException) {
            CommonActivity.INSTANCE.showToast(
                getActivity() as Activity?,
                context.getString(R.string.source_error) + '\n' + exception.getMessage(),
                0 as Integer?
            )
            nextMirror()
        } else {
            CommonActivity.INSTANCE.showToast(
                getActivity() as Activity?,
                exception.getMessage(),
                0 as Integer?
            )
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun onSubStyleChanged(saveCaptionStyle: SaveCaptionStyle) {
        val iPlayer: IPlayer = player
        if (iPlayer is CS3IPlayer) {
            iPlayer.updateSubtitleStyle(saveCaptionStyle)
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun playerUpdated(obj: Object?) {
        if (obj is ExoPlayer) {
            val context: Context? = getContext()
            if (context != null) {
                val mediaSessionCompat: MediaSessionCompat = MediaSessionCompat(
                    context,
                    "Player",
                    ComponentName(context, MediaButtonReceiver::class.java),
                    null
                )
                MediaSessionConnector(mediaSessionCompat).setPlayer(obj as Player?)
                mediaSessionCompat.setActive(true)
                mMediaSessionCompat = mediaSessionCompat
            }
            val playerView: PlayerView? =
                `_$_findCachedViewById`(C4761R.C4764id.player_view) as PlayerView?
            if (playerView != null) {
                playerView.setPlayer(obj as Player?)
            }
            val playerView2: PlayerView? =
                `_$_findCachedViewById`(C4761R.C4764id.player_view) as PlayerView?
            if (playerView2 != null) {
                playerView2.performClick()
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onDestroyView() {
        super.onDestroyView()
        val activity: FragmentActivity = getActivity()
        Objects.requireNonNull(
            activity,
            "null cannot be cast to non-null type com.lagradost.cloudstream3.MainActivity"
        )
        (activity as MainActivity).releaseCountdownAds()
        `_$_clearFindViewByIdCache`()
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */ /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */ /* JADX WARN: Removed duplicated region for block: B:25:0x0115  */ /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */ public override fun onViewCreated(r23: android.view.View?, r24: Bundle?) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.p041ui.player.AbstractPlayerFragment.onViewCreated(android.view.View, android.os.Bundle):void")
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onDestroy() {
        CommonActivity.INSTANCE.playerEventListener = null
        CommonActivity.INSTANCE.setKeyEventListener(null)
        CommonActivity.INSTANCE.canEnterPipMode = false
        SubtitlesFragment.Companion.Companion.getApplyStyleEvent()
            .minusAssign(`AbstractPlayerFragment$onDestroy$1`(this))
        keepScreenOn(false)
        super.onDestroy()
    }

    fun nextResize() {
        val length: Int = (resizeMode + 1) % PlayerResize.values().size
        resizeMode = length
        resize(length, true)
    }

    fun resize(i: Int, z: Boolean) {
        resize(PlayerResize.values().get(i), z)
    }

    fun resize(resize: PlayerResize, z: Boolean) {
        Intrinsics.checkNotNullParameter(resize, "resize")
        AcraApplication.Companion.setKey(
            IPlayerKt.RESIZE_MODE_KEY,
            Integer.valueOf(resize.ordinal())
        )
        val i: Int = WhenMappings.`$EnumSwitchMapping$0`.get(resize.ordinal())
        var i2: Int = 3
        if (i != 1) {
            if (i == 2) {
                i2 = 0
            } else if (i != 3) {
                throw NoWhenBranchMatchedException()
            } else {
                i2 = 4
            }
        }
        val playerView: PlayerView? =
            `_$_findCachedViewById`(C4761R.C4764id.player_view) as PlayerView?
        if (playerView != null) {
            playerView.setResizeMode(i2)
        }
        if (z) {
            CommonActivity.INSTANCE.showToast(getActivity(), resize.getNameRes(), 0)
        }
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onStop() {
        player.onStop()
        super.onStop()
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onResume() {
        val context: Context? = getContext()
        if (context != null) {
            player.onResume(context)
        }
        super.onResume()
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onCreateView(
        inflater: LayoutInflater,
        viewGroup: ViewGroup,
        bundle: Bundle
    ): View {
        Intrinsics.checkNotNullParameter(inflater, "inflater")
        return inflater.inflate(layout, viewGroup, false)
    }
}