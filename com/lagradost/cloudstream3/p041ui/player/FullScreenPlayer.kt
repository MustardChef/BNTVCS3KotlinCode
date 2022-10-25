package com.lagradost.cloudstream3.p041ui.player

import android.animation.ObjectAnimator
import kotlin.jvm.functions.Functions
import kotlin.jvm.internal.Intrinsics

/* compiled from: FullScreenPlayer.kt */
@Metadata(
    m108d1 = ["\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b3\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0016\u0018\u0000 \u008b\u00012\u00020\u0001:\u0004\u008b\u0001\u008c\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010T\u001a\u00020UH\u0004J\b\u0010V\u001a\u00020UH\u0004J-\u0010W\u001a\u0004\u0018\u00010\u000b2\b\u0010X\u001a\u0004\u0018\u00010\u000b2\b\u0010Y\u001a\u0004\u0018\u00010\u00172\b\u0010Z\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0002\u0010[J\b\u0010\\\u001a\u00020UH\u0004J\b\u0010]\u001a\u00020UH\u0004J\b\u0010^\u001a\u00020UH\u0016J\b\u0010_\u001a\u00020UH\u0002J\u000f\u0010`\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0002\u0010aJ\u0018\u0010b\u001a\u00020!2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020!H\u0002J\u001c\u0010f\u001a\u00020!2\b\u0010g\u001a\u0004\u0018\u00010h2\b\u0010c\u001a\u0004\u0018\u00010iH\u0003J\u0018\u0010j\u001a\u00020!2\u0006\u0010k\u001a\u00020\u00122\u0006\u0010l\u001a\u00020\u0012H\u0002J\b\u0010m\u001a\u00020UH\u0002J\b\u0010n\u001a\u00020UH\u0016J\b\u0010o\u001a\u00020UH\u0016J\u001a\u0010p\u001a\u00020U2\u0006\u0010g\u001a\u00020h2\b\u0010q\u001a\u0004\u0018\u00010rH\u0017J-\u0010s\u001a\u00020U2\u0006\u0010t\u001a\u00020u2\b\u0010v\u001a\u0004\u0018\u00010\u000b2\u000c\u0010w\u001a\b\u0012\u0004\u0012\u00020U0xH\u0016¢\u0006\u0002\u0010yJ\u0006\u0010z\u001a\u00020UJ\u0006\u0010{\u001a\u00020UJ\b\u0010|\u001a\u00020UH\u0002J\u0010\u0010}\u001a\u00020U2\u0006\u0010~\u001a\u00020\u0012H\u0002J\u0011\u0010\u007f\u001a\u00020U2\u0007\u0010\u0080\u0001\u001a\u00020\u0012H\u0002J\t\u0010\u0081\u0001\u001a\u00020UH\u0016J\t\u0010\u0082\u0001\u001a\u00020UH\u0002J\t\u0010\u0083\u0001\u001a\u00020UH\u0002J\t\u0010\u0084\u0001\u001a\u00020UH\u0002J\t\u0010\u0085\u0001\u001a\u00020UH\u0016J\t\u0010\u0086\u0001\u001a\u00020UH\u0002J\t\u0010\u0087\u0001\u001a\u00020UH\u0002J\t\u0010\u0088\u0001\u001a\u00020UH\u0004J\t\u0010\u0089\u0001\u001a\u00020UH\u0002J\t\u0010\u008a\u0001\u001a\u00020UH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000c\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001aR\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001dX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020!X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R\u001a\u0010)\u001a\u00020\u000bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020!X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00100\u001a\u00020!X\u0094\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010#\"\u0004\b1\u0010%R\u001a\u00102\u001a\u00020!X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010#\"\u0004\b3\u0010%R\u001a\u00104\u001a\u00020!X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010#\"\u0004\b5\u0010%R\u001a\u00106\u001a\u00020!X\u0094\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010#\"\u0004\b8\u0010%R\u0012\u00109\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010:R\u001a\u0010;\u001a\u00020!X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010#\"\u0004\b=\u0010%R\u001a\u0010>\u001a\u00020!X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010#\"\u0004\b@\u0010%R\u0014\u0010A\u001a\u00020\u00058DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u000eR\u0014\u0010C\u001a\u00020\u00058DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u000eR\u0012\u0010E\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010:R$\u0010G\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b8D@DX\u0084\u000e¢\u0006\u000c\u001a\u0004\bH\u0010+\"\u0004\bI\u0010-R\u001a\u0010J\u001a\u00020!X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010#\"\u0004\bL\u0010%R\u001a\u0010M\u001a\u00020!X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010#\"\u0004\bO\u0010%R\u001a\u0010P\u001a\u00020!X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010#\"\u0004\bR\u0010%R\u0014\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u008d\u0001"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/player/FullScreenPlayer;", "Lcom/lagradost/cloudstream3/ui/player/AbstractPlayerFragment;", "()V", "brightnessIcons", "", "", "currentClickCount", "currentDoubleTapIndex", "currentLastTouchAction", "Lcom/lagradost/cloudstream3/ui/player/FullScreenPlayer\$TouchAction;", "currentLastTouchEndTime", "", "currentPrefQuality", "getCurrentPrefQuality", "()I", "setCurrentPrefQuality", "(I)V", "currentRequestedBrightness", "", "currentRequestedVolume", "currentTapIndex", "currentTouchAction", "currentTouchLast", "Lcom/lagradost/cloudstream3/utils/Vector2;", "currentTouchStart", "currentTouchStartPlayerTime", "Ljava/lang/Long;", "currentTouchStartTime", "displayMetrics", "Landroid/util/DisplayMetrics;", "getDisplayMetrics", "()Landroid/util/DisplayMetrics;", "doubleTapEnabled", "", "getDoubleTapEnabled", "()Z", "setDoubleTapEnabled", "(Z)V", "doubleTapPauseEnabled", "getDoubleTapPauseEnabled", "setDoubleTapPauseEnabled", "fastForwardTime", "getFastForwardTime", "()J", "setFastForwardTime", "(J)V", "fullscreenNotch", "isCurrentTouchValid", "isFullScreenPlayer", "setFullScreenPlayer", "isLocked", "setLocked", "isShowing", "setShowing", "lockRotation", "getLockRotation", "setLockRotation", "navigationBarHeight", "Ljava/lang/Integer;", "playBackSpeedEnabled", "getPlayBackSpeedEnabled", "setPlayBackSpeedEnabled", "playerResizeEnabled", "getPlayerResizeEnabled", "setPlayerResizeEnabled", "screenHeight", "getScreenHeight", "screenWidth", "getScreenWidth", "statusBarHeight", "value", "subtitleDelay", "getSubtitleDelay", "setSubtitleDelay", "swipeHorizontalEnabled", "getSwipeHorizontalEnabled", "setSwipeHorizontalEnabled", "swipeVerticalEnabled", "getSwipeVerticalEnabled", "setSwipeVerticalEnabled", "useTrueSystemBrightness", "getUseTrueSystemBrightness", "setUseTrueSystemBrightness", "volumeIcons", "animateLayoutChanges", "", "autoHide", "calculateNewTime", "startTime", "touchStart", "touchEnd", "(Ljava/lang/Long;Lcom/lagradost/cloudstream3/utils/Vector2;Lcom/lagradost/cloudstream3/utils/Vector2;)Ljava/lang/Long;", "enterFullscreen", "exitFullscreen", "exitedPipMode", "fastForward", "getBrightness", "()Ljava/lang/Float;", "handleKeyEvent", "event", "Landroid/view/KeyEvent;", "hasNavigated", "handleMotionEvent", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "Landroid/view/MotionEvent;", "isValidTouch", "rawX", "rawY", "onClickChange", "onDestroy", "onResume", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "openOnlineSubPicker", "context", "Landroid/content/Context;", "imdbId", "dismissCallback", "Lkotlin/Function0;", "(Landroid/content/Context;Ljava/lang/Long;Lkotlin/jvm/functions/Function0;)V", "resetFastForwardText", "resetRewindText", "rewind", "setBrightness", "brightness", "setPlayBackSpeed", "speed", "showMirrorsDialogue", "showSpeedDialog", "showSubtitleOffsetDialog", "skipOp", "subtitlesChanged", "toggleLock", "toggleShowDelayed", "uiReset", "updateLockUI", "updateUIVisibility", "Companion", "TouchAction", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.player.FullScreenPlayer */ /* loaded from: classes3.dex */
open class FullScreenPlayer constructor() : AbstractPlayerFragment(null, 1, null) {
    override var `_$_findViewCache`: Map<Integer, View> = LinkedHashMap()
    private val brightnessIcons: List<Integer>
    private var currentClickCount: Int = 0
    private var currentDoubleTapIndex: Int = 0
    private var currentLastTouchAction: TouchAction? = null
    private var currentLastTouchEndTime: Long = 0
    /* JADX INFO: Access modifiers changed from: protected */  var currentPrefQuality: Int
        protected set
    private var currentRequestedBrightness: Float
    private var currentRequestedVolume: Float = 0f
    private var currentTapIndex: Int = 0
    private var currentTouchAction: TouchAction? = null
    private var currentTouchLast: Vector2? = null
    private var currentTouchStart: Vector2? = null
    private var currentTouchStartPlayerTime: Long? = null
    private var currentTouchStartTime: Long? = null
    private val displayMetrics: DisplayMetrics
    protected var doubleTapEnabled: Boolean = false
    protected var doubleTapPauseEnabled: Boolean
    protected var fastForwardTime: Long
    private val fullscreenNotch: Boolean
    private var isCurrentTouchValid: Boolean = false
    /* JADX INFO: Access modifiers changed from: protected */  open var isFullScreenPlayer: Boolean =
        true
        protected set
    protected var isLocked: Boolean = false
    /* JADX INFO: Access modifiers changed from: protected */  var isShowing: Boolean = false
        protected set
    protected open var lockRotation: Boolean = true
    private var navigationBarHeight: Integer? = null
    protected var playBackSpeedEnabled: Boolean = false
    protected var playerResizeEnabled: Boolean = false
    private var statusBarHeight: Integer? = null
    protected var swipeHorizontalEnabled: Boolean = false
    protected var swipeVerticalEnabled: Boolean = false
    protected var useTrueSystemBrightness: Boolean
    private val volumeIcons: List<Integer>

    /* compiled from: FullScreenPlayer.kt */
    @Metadata(
        m108d1 = ["\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/player/FullScreenPlayer\$TouchAction;", "", "(Ljava/lang/String;I)V", "Brightness", "Volume", "Time", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    /* renamed from: com.lagradost.cloudstream3.ui.player.FullScreenPlayer$TouchAction */ /* loaded from: classes3.dex */
    enum class TouchAction {
        Brightness, Volume, Time
    }

    /* compiled from: FullScreenPlayer.kt */
    @Metadata(
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.player.FullScreenPlayer$WhenMappings */ /* loaded from: classes3.dex */
    /* synthetic */
    object WhenMappings {
        /* synthetic */ val `$EnumSwitchMapping$0`: IntArray

        init {
            val iArr: IntArray = IntArray(TouchAction.values().size)
            com.lagradost.cloudstream3.p041ui.player.iArr.get(TouchAction.Time.ordinal()) = 1
            com.lagradost.cloudstream3.p041ui.player.iArr.get(TouchAction.Brightness.ordinal()) = 2
            com.lagradost.cloudstream3.p041ui.player.iArr.get(TouchAction.Volume.ordinal()) = 3
            `$EnumSwitchMapping$0` = com.lagradost.cloudstream3.p041ui.player.iArr
        }
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.AbstractPlayerFragment
    public override fun `_$_clearFindViewByIdCache`() {
        this.`_$_findViewCache`.clear()
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.AbstractPlayerFragment
    public override fun `_$_findCachedViewById`(i: Int): View? {
        var findViewById: View?
        val map: Map<Integer?, View?>? = this.`_$_findViewCache`
        val view: View? = map!!.get(Integer.valueOf(i))
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

    @Override // com.lagradost.cloudstream3.p041ui.player.AbstractPlayerFragment, androidx.fragment.app.Fragment
    public /* synthetic */  override fun onDestroyView() {
        super.onDestroyView()
        `_$_clearFindViewByIdCache`()
    }

    init {
        currentPrefQuality = Qualities.P2160.value
        fastForwardTime = 10000L
        doubleTapPauseEnabled = true
        useTrueSystemBrightness = true
        fullscreenNotch = true
        val displayMetrics: DisplayMetrics = Resources.getSystem().getDisplayMetrics()
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getSystem().displayMetrics")
        this.displayMetrics = displayMetrics
        brightnessIcons = CollectionsKt.listOf<Object>(
            *arrayOf<Integer>(
                Integer.valueOf(R.drawable.sun_1 as Int),
                Integer.valueOf(R.drawable.sun_2 as Int),
                Integer.valueOf(R.drawable.sun_3 as Int),
                Integer.valueOf(R.drawable.sun_4 as Int),
                Integer.valueOf(R.drawable.sun_5 as Int),
                Integer.valueOf(R.drawable.sun_6 as Int)
            ) as Array<Object>
        )
        volumeIcons = CollectionsKt.listOf<Object>(
            *arrayOf<Integer>(
                Integer.valueOf(R.drawable.ic_baseline_volume_mute_24 as Int),
                Integer.valueOf(R.drawable.ic_baseline_volume_down_24 as Int),
                Integer.valueOf(R.drawable.ic_baseline_volume_up_24 as Int)
            ) as Array<Object>
        )
        currentRequestedBrightness = 1.0f
    }

    /* JADX INFO: Access modifiers changed from: protected */
    protected var subtitleDelay: Long
        protected get() {
            try {
                return -getPlayer().getSubtitleOffset()
            } catch (e: Exception) {
                ArchComponentExt.logError(e)
                return 0L
            }
        }
        set(j) {
            try {
                getPlayer().setSubtitleOffset(-j)
            } catch (e: Exception) {
                ArchComponentExt.logError(e)
            }
        }

    protected fun getDisplayMetrics(): DisplayMetrics {
        return displayMetrics
    }

    /* JADX INFO: Access modifiers changed from: protected */
    val screenWidth: Int
        get() {
            return Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels)
        }

    /* JADX INFO: Access modifiers changed from: protected */
    val screenHeight: Int
        get() {
            return Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels)
        }

    open fun showMirrorsDialogue() {
        throw Standard(null, 1, null)
    }

    open fun openOnlineSubPicker(context: Context?, l: Long?, dismissCallback: Functions<Unit>?) {
        Intrinsics.checkNotNullParameter(context, "context")
        Intrinsics.checkNotNullParameter(dismissCallback, "dismissCallback")
        throw Standard(null, 1, null)
    }

    private fun isValidTouch(f: Float, f2: Float): Boolean {
        val num: Integer? = statusBarHeight
        return f2 > ((if (num != null) num.intValue() else 0).toFloat()) && f < (screenWidth.toFloat())
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.AbstractPlayerFragment
    public override fun exitedPipMode() {
        animateLayoutChanges()
    }

    protected fun animateLayoutChanges() {
        val toPx: Float
        var linearLayout: LinearLayout
        if (isShowing) {
            updateUIVisibility()
        } else {
            val frameLayout: FrameLayout? =
                `_$_findCachedViewById`(C4761R.C4764id.player_holder) as FrameLayout?
            if (frameLayout != null) {
                frameLayout.postDelayed(object : Runnable() {
                    // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$FullScreenPlayer$QpWlN67hNthTRFUu-cGOqFmxqxo
                    @Override // java.lang.Runnable
                    fun run() {
                        Companion.`m8670animateLayoutChanges$lambda0`(this@FullScreenPlayer)
                    }
                }, 200L)
            }
        }
        val f: Float = if (isShowing) 0.0f else -UIHelper.INSTANCE.getToPx(50)
        val textView: TextView? =
            `_$_findCachedViewById`(C4761R.C4764id.player_video_title) as TextView?
        if (textView != null) {
            val ofFloat: ObjectAnimator = ObjectAnimator.ofFloat(textView, "translationY", f)
            ofFloat.setDuration(200L)
            ofFloat.start()
        }
        val textView2: TextView? =
            `_$_findCachedViewById`(C4761R.C4764id.player_video_title_rez) as TextView?
        if (textView2 != null) {
            val ofFloat2: ObjectAnimator = ObjectAnimator.ofFloat(textView2, "translationY", f)
            ofFloat2.setDuration(200L)
            ofFloat2.start()
        }
        val toPx2: Float = if (isShowing) 0.0f else UIHelper.INSTANCE.getToPx(50)
        val linearLayout2: LinearLayout? =
            `_$_findCachedViewById`(C4761R.C4764id.bottom_player_bar) as LinearLayout?
        if (linearLayout2 != null) {
            val ofFloat3: ObjectAnimator =
                ObjectAnimator.ofFloat(linearLayout2, "translationY", toPx2)
            ofFloat3.setDuration(200L)
            ofFloat3.start()
        }
        val f2: Float = if (isShowing) 1.0f else 0.0f
        val alphaAnimation: AlphaAnimation = AlphaAnimation(1.0f - f2, f2)
        alphaAnimation.setDuration(100L)
        alphaAnimation.setFillAfter(true)
        val subView: SubtitleView? = getSubView()
        val subStyle: SaveCaptionStyle? = getSubStyle()
        if (subView != null && subStyle != null) {
            if (isShowing) {
                toPx =
                    (if ((`_$_findCachedViewById`(C4761R.C4764id.bottom_player_bar) as LinearLayout?) != null) linearLayout.getHeight() else 0.0f) + UIHelper.INSTANCE.getToPx(
                        40
                    )
            } else {
                toPx = UIHelper.INSTANCE.getToPx(subStyle.getElevation()).toFloat()
            }
            val ofFloat4: ObjectAnimator = ObjectAnimator.ofFloat(subView, "translationY", -toPx)
            ofFloat4.setDuration(200L)
            ofFloat4.start()
        }
        val f3: Float = if (isShowing) 0.0f else -UIHelper.INSTANCE.getToPx(50)
        val imageView: ImageView? =
            `_$_findCachedViewById`(C4761R.C4764id.player_open_source) as ImageView?
        if (imageView != null) {
            val ofFloat5: ObjectAnimator = ObjectAnimator.ofFloat(imageView, "translationY", f3)
            ofFloat5.setDuration(200L)
            ofFloat5.start()
        }
        if (!isLocked) {
            val frameLayout2: FrameLayout? =
                `_$_findCachedViewById`(C4761R.C4764id.player_ffwd_holder) as FrameLayout?
            if (frameLayout2 != null) {
                frameLayout2.setAlpha(1.0f)
            }
            val frameLayout3: FrameLayout? =
                `_$_findCachedViewById`(C4761R.C4764id.player_rew_holder) as FrameLayout?
            if (frameLayout3 != null) {
                frameLayout3.setAlpha(1.0f)
            }
            val `_$_findCachedViewById`: View? =
                `_$_findCachedViewById`(C4761R.C4764id.shadow_overlay)
            if (`_$_findCachedViewById` != null) {
                `_$_findCachedViewById`.setVisibility(0)
            }
            val `_$_findCachedViewById2`: View? =
                `_$_findCachedViewById`(C4761R.C4764id.shadow_overlay)
            if (`_$_findCachedViewById2` != null) {
                `_$_findCachedViewById2`.startAnimation(alphaAnimation)
            }
            val frameLayout4: FrameLayout? =
                `_$_findCachedViewById`(C4761R.C4764id.player_ffwd_holder) as FrameLayout?
            if (frameLayout4 != null) {
                frameLayout4.startAnimation(alphaAnimation)
            }
            val frameLayout5: FrameLayout? =
                `_$_findCachedViewById`(C4761R.C4764id.player_rew_holder) as FrameLayout?
            if (frameLayout5 != null) {
                frameLayout5.startAnimation(alphaAnimation)
            }
            val imageView2: ImageView? =
                `_$_findCachedViewById`(C4761R.C4764id.player_pause_play) as ImageView?
            if (imageView2 != null) {
                imageView2.startAnimation(alphaAnimation)
            }
        }
        val linearLayout3: LinearLayout? =
            `_$_findCachedViewById`(C4761R.C4764id.bottom_player_bar) as LinearLayout?
        if (linearLayout3 != null) {
            linearLayout3.startAnimation(alphaAnimation)
        }
        val imageView3: ImageView? =
            `_$_findCachedViewById`(C4761R.C4764id.player_open_source) as ImageView?
        if (imageView3 != null) {
            imageView3.startAnimation(alphaAnimation)
        }
        val frameLayout6: FrameLayout? =
            `_$_findCachedViewById`(C4761R.C4764id.player_top_holder) as FrameLayout?
        if (frameLayout6 != null) {
            frameLayout6.startAnimation(alphaAnimation)
        }
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.AbstractPlayerFragment
    public override fun subtitlesChanged() {
        val materialButton: MaterialButton? =
            `_$_findCachedViewById`(C4761R.C4764id.player_subtitle_offset_btt) as MaterialButton?
        if (materialButton == null) {
            return
        }
        materialButton.setVisibility(if (getPlayer().getCurrentPreferredSubtitle() == null) 8 else 0)
    }

    /* JADX INFO: Access modifiers changed from: protected */
    fun enterFullscreen() {
        var activity: FragmentActivity
        var window: Window
        if (isFullScreenPlayer) {
            val activity2: FragmentActivity? = getActivity()
            if (activity2 != null) {
                UIHelper.INSTANCE.hideSystemUI(activity2)
            }
            if (Build.VERSION.SDK_INT >= 28 && fullscreenNotch) {
                val activity3: FragmentActivity? = getActivity()
                val attributes: WindowManager.LayoutParams? =
                    if ((activity3 == null || (activity3.getWindow()
                            .also({ window = it })) == null)
                    ) null else window.getAttributes()
                if (attributes != null) {
                    attributes.layoutInDisplayCutoutMode = 1
                }
                val activity4: FragmentActivity? = getActivity()
                val window2: Window? = if (activity4 != null) activity4.getWindow() else null
                if (window2 != null) {
                    window2.setAttributes(attributes)
                }
            }
        }
        if (!lockRotation || (getActivity().also({ activity = it })) == null) {
            return
        }
        activity.setRequestedOrientation(6)
    }

    /* JADX INFO: Access modifiers changed from: protected */
    fun exitFullscreen() {
        var window: Window
        val activity: FragmentActivity? = getActivity()
        if (activity != null) {
            UIHelper.INSTANCE.showSystemUI(activity)
        }
        val activity2: FragmentActivity? = getActivity()
        if (activity2 != null) {
            activity2.setRequestedOrientation(2)
        }
        val activity3: FragmentActivity? = getActivity()
        val attributes: WindowManager.LayoutParams? =
            if ((activity3 == null || (activity3.getWindow()
                    .also({ window = it })) == null)
            ) null else window.getAttributes()
        if (attributes != null) {
            attributes.screenBrightness = -1.0f
        }
        if (Build.VERSION.SDK_INT >= 28 && attributes != null) {
            attributes.layoutInDisplayCutoutMode = 0
        }
        val activity4: FragmentActivity? = getActivity()
        val window2: Window? = if (activity4 != null) activity4.getWindow() else null
        if (window2 == null) {
            return
        }
        window2.setAttributes(attributes)
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.AbstractPlayerFragment, androidx.fragment.app.Fragment
    public override fun onResume() {
        enterFullscreen()
        super.onResume()
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.AbstractPlayerFragment, androidx.fragment.app.Fragment
    public override fun onDestroy() {
        exitFullscreen()
        super.onDestroy()
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun setPlayBackSpeed(f: Float) {
        try {
            AcraApplication.Companion.setKey("playback_speed", Float.valueOf(f))
            val materialButton: MaterialButton? =
                `_$_findCachedViewById`(C4761R.C4764id.player_speed_btt) as MaterialButton?
            if (materialButton != null) {
                val string: String = getString(R.string.player_speed_text_format)
                Intrinsics.checkNotNullExpressionValue(
                    string,
                    "getString(R.string.player_speed_text_format)"
                )
                val format: String =
                    String.format(string, Arrays.copyOf(arrayOf<Object>(Float.valueOf(f)), 1))
                Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)")
                materialButton.setText(
                    StringsKt.`replace$default`(
                        format,
                        ".0x",
                        "x",
                        false,
                        4,
                        null as Object?
                    )
                )
            }
        } catch (e: Exception) {
            ArchComponentExt.logError(e)
        }
        getPlayer().setPlaybackSpeed(f)
    }

    private fun skipOp() {
        getPlayer().seekTime(85000L)
    }

    private fun showSubtitleOffsetDialog() {
        val context: Context? = getContext()
        if (context != null) {
            val create: AlertDialog = AlertDialog.Builder(context, R.style.AlertDialogCustom)
                .setView(R.layout.subtitle_offset).create()
            Intrinsics.checkNotNullExpressionValue(create, "builder.create()")
            create.show()
            val subtitleDelay: Long = subtitleDelay
            val findViewById: View = create.findViewById<View>(R.id.apply_btt)
            Intrinsics.checkNotNull(findViewById)
            val textView: TextView = findViewById as TextView
            val findViewById2: View = create.findViewById<View>(R.id.cancel_btt)
            Intrinsics.checkNotNull(findViewById2)
            val textView2: TextView = findViewById2 as TextView
            val findViewById3: View = create.findViewById<View>(R.id.subtitle_offset_input)
            Intrinsics.checkNotNull(findViewById3)
            val editText: EditText = findViewById3 as EditText
            val findViewById4: View = create.findViewById<View>(R.id.subtitle_offset_subtract)
            Intrinsics.checkNotNull(findViewById4)
            val imageView: ImageView = findViewById4 as ImageView
            val findViewById5: View = create.findViewById<View>(R.id.subtitle_offset_add)
            Intrinsics.checkNotNull(findViewById5)
            val imageView2: ImageView = findViewById5 as ImageView
            val findViewById6: View = create.findViewById<View>(R.id.subtitle_offset_sub_title)
            Intrinsics.checkNotNull(findViewById6)
            val textView3: TextView = findViewById6 as TextView
            editText.addTextChangedListener(object : TextWatcher() {
                // from class: com.lagradost.cloudstream3.ui.player.FullScreenPlayer$showSubtitleOffsetDialog$lambda-18$$inlined$doOnTextChanged$1
                @Override // android.text.TextWatcher
                fun afterTextChanged(editable: Editable?) {
                }

                @Override // android.text.TextWatcher
                fun beforeTextChanged(charSequence: CharSequence?, i: Int, i2: Int, i3: Int) {
                }

                @Override // android.text.TextWatcher
                fun onTextChanged(charSequence: CharSequence?, i: Int, i2: Int, i3: Int) {
                    var obj: String?
                    var longOrNull: Long
                    var string: String?
                    var string2: String?
                    if ((charSequence == null) || ((charSequence.toString()
                            .also({ obj = it })) == null) || ((StringsKt.toLongOrNull(obj)
                            .also({ longOrNull = it })) == null)
                    ) {
                        return
                    }
                    val longValue: Long = longOrNull.longValue()
                    this@FullScreenPlayer.subtitleDelay = longValue
                    var str: String? = null
                    val i4: Int = (if (longValue > 0L) 1 else (if (longValue == 0L) 0 else -1))
                    if (i4 > 0) {
                        val context2: Context? = getContext()
                        if (context2 != null && (context2.getString(R.string.subtitle_offset_extra_hint_later_format)
                                .also({ string2 = it })) != null
                        ) {
                            str = String.format(
                                string2,
                                Arrays.copyOf(arrayOf<Object>(Long.valueOf(longValue)), 1)
                            )
                            Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)")
                        }
                    } else if (i4 < 0) {
                        val context3: Context? = getContext()
                        if (context3 != null && (context3.getString(R.string.subtitle_offset_extra_hint_before_format)
                                .also({ string = it })) != null
                        ) {
                            str = String.format(
                                string,
                                Arrays.copyOf(arrayOf<Object>(Long.valueOf(-longValue)), 1)
                            )
                            Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)")
                        }
                    } else if (i4 == 0) {
                        val context4: Context? = getContext()
                        if (context4 != null) {
                            str =
                                context4.getString(R.string.subtitle_offset_extra_hint_none_format)
                        }
                    } else {
                        str = null
                    }
                    if (str != null) {
                        textView3.setText(str)
                    }
                }
            })
            val factory: Editable.Factory? = Editable.Factory.getInstance()
            editText.setText(if (factory != null) factory.newEditable(String.valueOf(subtitleDelay)) else null)
            imageView2.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$FullScreenPlayer$PRJJPcbD7iyfn9YM3S7NRSU9VJ8
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    Companion.`m8699showSubtitleOffsetDialog$lambda18$lambda13`(r1, editText, view)
                }
            })
            imageView.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$FullScreenPlayer$jAhh9uFTPUTs5apdnD0-DLw7WNY
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    Companion.`m8700showSubtitleOffsetDialog$lambda18$lambda14`(r1, editText, view)
                }
            })
            create.setOnDismissListener(object : OnDismissListener() {
                // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$FullScreenPlayer$-nJFYUNzhHNGg2Xn8W3gMOBf6Eg
                @Override // android.content.DialogInterface.OnDismissListener
                fun onDismiss(dialogInterface: DialogInterface?) {
                    Companion.`m8701showSubtitleOffsetDialog$lambda18$lambda15`(
                        this@FullScreenPlayer,
                        dialogInterface
                    )
                }
            })
            textView.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$FullScreenPlayer$fVDzd_bEio765n8zSNt4YM1LYu8
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    Companion.`m8702showSubtitleOffsetDialog$lambda18$lambda16`(
                        this@AlertDialog,
                        this,
                        view
                    )
                }
            })
            textView2.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$FullScreenPlayer$qC1Di7UO3RH15PUC2wbwrdcBkLg
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    Companion.`m8703showSubtitleOffsetDialog$lambda18$lambda17`(
                        this@FullScreenPlayer,
                        subtitleDelay,
                        create,
                        view
                    )
                }
            })
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun showSpeedDialog() {
        val listOf: List<String> = CollectionsKt.listOf<Object>(
            *arrayOf(
                "0.5x",
                "0.75x",
                "0.85x",
                "1x",
                "1.15x",
                "1.25x",
                "1.4x",
                "1.5x",
                "1.75x",
                "2x"
            ) as Array<Object>
        )
        val listOf2: List = CollectionsKt.listOf<Object>(
            *arrayOf<Float>(
                Float.valueOf(0.5f),
                Float.valueOf(0.75f),
                Float.valueOf(0.85f),
                Float.valueOf(1.0f),
                Float.valueOf(1.15f),
                Float.valueOf(1.25f),
                Float.valueOf(1.4f),
                Float.valueOf(1.5f),
                Float.valueOf(1.75f),
                Float.valueOf(2.0f)
            ) as Array<Object>
        )
        val indexOf: Int = listOf2.indexOf(Float.valueOf(getPlayer().getPlaybackSpeed()))
        val activity: FragmentActivity? = getActivity()
        if (activity != null) {
            val string: String = activity.getString(R.string.player_speed)
            Intrinsics.checkNotNullExpressionValue(string, "act.getString(R.string.player_speed)")
            SingleSelectionHelper.INSTANCE.showDialog(
                activity,
                listOf,
                indexOf,
                string,
                false,
                `FullScreenPlayer$showSpeedDialog$1$1`(this),
                `FullScreenPlayer$showSpeedDialog$1$2`(this, listOf2)
            )
        }
    }

    fun resetRewindText() {
        val textView: TextView? = `_$_findCachedViewById`(C4761R.C4764id.exo_rew_text) as TextView?
        if (textView == null) {
            return
        }
        val string: String = getString(R.string.rew_text_regular_format)
        Intrinsics.checkNotNullExpressionValue(
            string,
            "getString(R.string.rew_text_regular_format)"
        )
        val format: String = String.format(
            string, Arrays.copyOf(
                arrayOf<Object>(
                    Long.valueOf(
                        fastForwardTime / 1000
                    )
                ), 1
            )
        )
        Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)")
        textView.setText(format)
    }

    fun resetFastForwardText() {
        val textView: TextView? = `_$_findCachedViewById`(C4761R.C4764id.exo_ffwd_text) as TextView?
        if (textView == null) {
            return
        }
        val string: String = getString(R.string.ffw_text_regular_format)
        Intrinsics.checkNotNullExpressionValue(
            string,
            "getString(R.string.ffw_text_regular_format)"
        )
        val format: String = String.format(
            string, Arrays.copyOf(
                arrayOf<Object>(
                    Long.valueOf(
                        fastForwardTime / 1000
                    )
                ), 1
            )
        )
        Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)")
        textView.setText(format)
    }

    private fun rewind() {
        try {
            val constraintLayout: ConstraintLayout? =
                `_$_findCachedViewById`(C4761R.C4764id.player_center_menu) as ConstraintLayout?
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0)
            }
            val frameLayout: FrameLayout? =
                `_$_findCachedViewById`(C4761R.C4764id.player_rew_holder) as FrameLayout?
            if (frameLayout != null) {
                frameLayout.setAlpha(1.0f)
            }
            val loadAnimation: Animation =
                AnimationUtils.loadAnimation(getContext(), R.anim.rotate_left)
            val imageButton: ImageButton? =
                `_$_findCachedViewById`(C4761R.C4764id.exo_rew) as ImageButton?
            if (imageButton != null) {
                imageButton.startAnimation(loadAnimation)
            }
            val loadAnimation2: Animation =
                AnimationUtils.loadAnimation(getContext(), R.anim.go_left)
            loadAnimation2.setAnimationListener(`FullScreenPlayer$rewind$1`(this))
            val textView: TextView? =
                `_$_findCachedViewById`(C4761R.C4764id.exo_rew_text) as TextView?
            if (textView != null) {
                textView.startAnimation(loadAnimation2)
            }
            val textView2: TextView? =
                `_$_findCachedViewById`(C4761R.C4764id.exo_rew_text) as TextView?
            if (textView2 != null) {
                val string: String = getString(R.string.rew_text_format)
                Intrinsics.checkNotNullExpressionValue(
                    string,
                    "getString(R.string.rew_text_format)"
                )
                val format: String = String.format(
                    string, Arrays.copyOf(
                        arrayOf<Object>(
                            Long.valueOf(
                                fastForwardTime / 1000
                            )
                        ), 1
                    )
                )
                Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)")
                textView2.setText(format)
            }
            getPlayer().seekTime(-fastForwardTime)
        } catch (e: Exception) {
            ArchComponentExt.logError(e)
        }
    }

    private fun fastForward() {
        try {
            val constraintLayout: ConstraintLayout? =
                `_$_findCachedViewById`(C4761R.C4764id.player_center_menu) as ConstraintLayout?
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0)
            }
            val frameLayout: FrameLayout? =
                `_$_findCachedViewById`(C4761R.C4764id.player_ffwd_holder) as FrameLayout?
            if (frameLayout != null) {
                frameLayout.setAlpha(1.0f)
            }
            val loadAnimation: Animation =
                AnimationUtils.loadAnimation(getContext(), R.anim.rotate_right)
            val imageButton: ImageButton? =
                `_$_findCachedViewById`(C4761R.C4764id.exo_ffwd) as ImageButton?
            if (imageButton != null) {
                imageButton.startAnimation(loadAnimation)
            }
            val loadAnimation2: Animation =
                AnimationUtils.loadAnimation(getContext(), R.anim.go_right)
            loadAnimation2.setAnimationListener(`FullScreenPlayer$fastForward$1`(this))
            val textView: TextView? =
                `_$_findCachedViewById`(C4761R.C4764id.exo_ffwd_text) as TextView?
            if (textView != null) {
                textView.startAnimation(loadAnimation2)
            }
            val textView2: TextView? =
                `_$_findCachedViewById`(C4761R.C4764id.exo_ffwd_text) as TextView?
            if (textView2 != null) {
                val string: String = getString(R.string.ffw_text_format)
                Intrinsics.checkNotNullExpressionValue(
                    string,
                    "getString(R.string.ffw_text_format)"
                )
                val format: String = String.format(
                    string, Arrays.copyOf(
                        arrayOf<Object>(
                            Long.valueOf(
                                fastForwardTime / 1000
                            )
                        ), 1
                    )
                )
                Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)")
                textView2.setText(format)
            }
            getPlayer().seekTime(fastForwardTime)
        } catch (e: Exception) {
            ArchComponentExt.logError(e)
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun onClickChange() {
        var activity: FragmentActivity?
        val z: Boolean = !isShowing
        isShowing = z
        if (z) {
            val frameLayout: FrameLayout? =
                `_$_findCachedViewById`(C4761R.C4764id.player_intro_play) as FrameLayout?
            if (frameLayout != null) {
                frameLayout.setVisibility(8)
            }
            autoHide()
        }
        if (isFullScreenPlayer && (getActivity().also({ activity = it })) != null) {
            UIHelper.INSTANCE.hideSystemUI(activity)
        }
        animateLayoutChanges()
        val imageView: ImageView? =
            `_$_findCachedViewById`(C4761R.C4764id.player_pause_play) as ImageView?
        if (imageView != null) {
            imageView.requestFocus()
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun toggleLock() {
        var frameLayout: FrameLayout
        if (!isShowing) {
            onClickChange()
        }
        val z: Boolean = !isLocked
        isLocked = z
        if (z && isShowing && ((`_$_findCachedViewById`(C4761R.C4764id.player_holder) as FrameLayout?. also ({
                frameLayout = it
            })) != null)) {
            frameLayout.postDelayed(object : Runnable() {
                // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$FullScreenPlayer$U8UtHF7pn0WE8H6lFbBH_thU1E8
                @Override // java.lang.Runnable
                fun run() {
                    Companion.`m8704toggleLock$lambda20`(this@FullScreenPlayer)
                }
            }, 200L)
        }
        val alphaAnimation: AlphaAnimation = AlphaAnimation(
            (`_$_findCachedViewById`(C4761R.C4764id.player_video_title) as TextView?).getAlpha(),
            if (isLocked) 0.0f else 1.0f
        )
        alphaAnimation.setDuration(100L)
        alphaAnimation.setFillAfter(true)
        updateUIVisibility()
        val imageView: ImageView? =
            `_$_findCachedViewById`(C4761R.C4764id.player_pause_play) as ImageView?
        if (imageView != null) {
            imageView.startAnimation(alphaAnimation)
        }
        val frameLayout2: FrameLayout? =
            `_$_findCachedViewById`(C4761R.C4764id.player_ffwd_holder) as FrameLayout?
        if (frameLayout2 != null) {
            frameLayout2.startAnimation(alphaAnimation)
        }
        val frameLayout3: FrameLayout? =
            `_$_findCachedViewById`(C4761R.C4764id.player_rew_holder) as FrameLayout?
        if (frameLayout3 != null) {
            frameLayout3.startAnimation(alphaAnimation)
        }
        val textView: TextView? =
            `_$_findCachedViewById`(C4761R.C4764id.player_video_title_rez) as TextView?
        if (textView != null) {
            textView.startAnimation(alphaAnimation)
        }
        val materialButton: MaterialButton? =
            `_$_findCachedViewById`(C4761R.C4764id.player_episode_filler) as MaterialButton?
        if (materialButton != null) {
            materialButton.startAnimation(alphaAnimation)
        }
        val textView2: TextView? =
            `_$_findCachedViewById`(C4761R.C4764id.player_video_title) as TextView?
        if (textView2 != null) {
            textView2.startAnimation(alphaAnimation)
        }
        val frameLayout4: FrameLayout? =
            `_$_findCachedViewById`(C4761R.C4764id.player_top_holder) as FrameLayout?
        if (frameLayout4 != null) {
            frameLayout4.startAnimation(alphaAnimation)
        }
        val linearLayout: LinearLayout? =
            `_$_findCachedViewById`(C4761R.C4764id.player_lock_holder) as LinearLayout?
        if (linearLayout != null) {
            linearLayout.startAnimation(alphaAnimation)
        }
        val `_$_findCachedViewById`: View? = `_$_findCachedViewById`(C4761R.C4764id.shadow_overlay)
        if (`_$_findCachedViewById` != null) {
            `_$_findCachedViewById`.setVisibility(0)
        }
        val `_$_findCachedViewById2`: View? = `_$_findCachedViewById`(C4761R.C4764id.shadow_overlay)
        if (`_$_findCachedViewById2` != null) {
            `_$_findCachedViewById2`.startAnimation(alphaAnimation)
        }
        updateLockUI()
    }

    private fun updateUIVisibility() {
        val z: Boolean = isLocked || !isShowing
        val context: Context? = getContext()
        val z2: Boolean =
            if ((context == null || PreferenceManager.getDefaultSharedPreferences(context)
                    .getInt(getString(R.string.prefer_limit_title_key), 0) >= 0)
            ) z else true
        val linearLayout: LinearLayout? =
            `_$_findCachedViewById`(C4761R.C4764id.player_lock_holder) as LinearLayout?
        if (linearLayout != null) {
            linearLayout.setVisibility(if (z) 8 else 0)
        }
        val linearLayout2: LinearLayout? =
            `_$_findCachedViewById`(C4761R.C4764id.player_video_bar) as LinearLayout?
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(if (z) 8 else 0)
        }
        val frameLayout: FrameLayout? =
            `_$_findCachedViewById`(C4761R.C4764id.player_pause_play_holder) as FrameLayout?
        if (frameLayout != null) {
            frameLayout.setVisibility(if (z) 8 else 0)
        }
        val imageView: ImageView? =
            `_$_findCachedViewById`(C4761R.C4764id.player_pause_play) as ImageView?
        if (imageView != null) {
            imageView.setVisibility(if (z) 8 else 0)
        }
        val frameLayout2: FrameLayout? =
            `_$_findCachedViewById`(C4761R.C4764id.player_top_holder) as FrameLayout?
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(if (z) 8 else 0)
        }
        val textView: TextView? =
            `_$_findCachedViewById`(C4761R.C4764id.player_video_title) as TextView?
        if (textView != null) {
            textView.setVisibility(if (z2) 8 else 0)
        }
        val textView2: TextView? =
            `_$_findCachedViewById`(C4761R.C4764id.player_video_title_rez) as TextView?
        if (textView2 != null) {
            textView2.setVisibility(if (z) 8 else 0)
        }
        val materialButton: MaterialButton? =
            `_$_findCachedViewById`(C4761R.C4764id.player_episode_filler) as MaterialButton?
        if (materialButton != null) {
            materialButton.setVisibility(if (z) 8 else 0)
        }
        val constraintLayout: ConstraintLayout? =
            `_$_findCachedViewById`(C4761R.C4764id.player_center_menu) as ConstraintLayout?
        if (constraintLayout != null) {
            constraintLayout.setVisibility(if (z) 8 else 0)
        }
        val materialButton2: MaterialButton? =
            `_$_findCachedViewById`(C4761R.C4764id.player_lock) as MaterialButton?
        if (materialButton2 != null) {
            materialButton2.setVisibility(if (true xor isShowing) 8 else 0)
        }
        val frameLayout3: FrameLayout? =
            `_$_findCachedViewById`(C4761R.C4764id.player_go_back_holder) as FrameLayout?
        if (frameLayout3 == null) {
            return
        }
        frameLayout3.setVisibility(if (z) 8 else 0)
    }

    private fun updateLockUI() {
        val num: Integer?
        val materialButton: MaterialButton? =
            `_$_findCachedViewById`(C4761R.C4764id.player_lock) as MaterialButton?
        if (materialButton != null) {
            materialButton.setIconResource(if (isLocked) R.drawable.video_locked else R.drawable.video_unlocked)
        }
        if (getLayout() == R.layout.fragment_player) {
            if (isLocked) {
                val context: Context? = getContext()
                num = if (context != null) Integer.valueOf(
                    UIHelper.INSTANCE.colorFromAttribute(
                        context,
                        R.attr.colorPrimary
                    )
                ) else null
            } else {
                num = -1
            }
            if (num != null) {
                val materialButton2: MaterialButton? =
                    `_$_findCachedViewById`(C4761R.C4764id.player_lock) as MaterialButton?
                if (materialButton2 != null) {
                    materialButton2.setTextColor(num.intValue())
                }
                val materialButton3: MaterialButton? =
                    `_$_findCachedViewById`(C4761R.C4764id.player_lock) as MaterialButton?
                if (materialButton3 != null) {
                    materialButton3.setIconTint(ColorStateList.valueOf(num.intValue()))
                }
                val materialButton4: MaterialButton? =
                    `_$_findCachedViewById`(C4761R.C4764id.player_lock) as MaterialButton?
                if (materialButton4 == null) {
                    return
                }
                materialButton4.setRippleColor(
                    ColorStateList.valueOf(
                        Color.argb(
                            50,
                            (num.intValue() shr 16) and 255,
                            (num.intValue() shr 8) and 255,
                            num.intValue() and 255
                        )
                    )
                )
            }
        }
    }

    protected fun autoHide() {
        val i: Int = currentTapIndex + 1
        currentTapIndex = i
        val frameLayout: FrameLayout? =
            `_$_findCachedViewById`(C4761R.C4764id.player_holder) as FrameLayout?
        if (frameLayout != null) {
            frameLayout.postDelayed(object : Runnable() {
                // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$FullScreenPlayer$MSgFXNZ8ucRdzaGJcRxymRisV1o
                @Override // java.lang.Runnable
                fun run() {
                    Companion.`m8671autoHide$lambda23`(this@FullScreenPlayer, i)
                }
            }, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS)
        }
    }

    private fun toggleShowDelayed() {
        if (doubleTapEnabled || doubleTapPauseEnabled) {
            val i: Int = currentDoubleTapIndex
            val frameLayout: FrameLayout? =
                `_$_findCachedViewById`(C4761R.C4764id.player_holder) as FrameLayout?
            if (frameLayout != null) {
                frameLayout.postDelayed(object : Runnable() {
                    // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$FullScreenPlayer$oWTQYrBYZHUU3m8c5I1B1NtAuVg
                    @Override // java.lang.Runnable
                    fun run() {
                        Companion.`m8705toggleShowDelayed$lambda24`(i, this)
                    }
                }, 200L)
                return
            }
            return
        }
        onClickChange()
    }

    /* compiled from: FullScreenPlayer.kt */
    @Metadata(
        m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001a\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u0002¨\u0006\u000b"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/player/FullScreenPlayer\$Companion;", "", "()V", "convertTimeToString", "", "sec", "", "forceLetters", "inp", "letters", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.player.FullScreenPlayer$Companion */ /* loaded from: classes3.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        private fun forceLetters(j: Long, i: Int): String {
            val length: Int = i - String.valueOf(j).length()
            if (length > 0) {
                return StringsKt.repeat("0", length) + j
            }
            return String.valueOf(j)
        }

        /* JADX INFO: Access modifiers changed from: private */
        fun convertTimeToString(j: Long): String {
            var j2: Long
            val str: String
            val j3: Long = j % 60
            val ceil: Long = ((Math.ceil((j - j3) / 60.0) as Int) % 60).toLong()
            val ceil2: Long = Math.ceil((j2 - ceil) / 60.0)
            val sb: StringBuilder = StringBuilder()
            var str2: String? = ""
            val i: Int = (if (ceil2 > 0L) 1 else (if (ceil2 == 0L) 0 else -1))
            if (i > 0) {
                str = `forceLetters$default`(this, ceil2, 0, 2, null) + ':'
            } else {
                str = ""
            }
            sb.append(str)
            if (ceil >= 0 || i >= 0) {
                str2 = `forceLetters$default`(this, ceil, 0, 2, null) + ':'
            }
            sb.append(str2)
            sb.append(`forceLetters$default`(this, j3, 0, 2, null))
            return sb.toString()
        }

        companion object {
            fun  /* synthetic */`forceLetters$default`(
                companion: FullScreenPlayer.Companion,
                j: Long,
                i: Int,
                i2: Int,
                obj: Object?
            ): String {
                var i: Int = i
                if ((i2 and 2) != 0) {
                    i = 2
                }
                return companion.forceLetters(j, i)
            }
        }
    }

    private fun calculateNewTime(l: Long?, vector2: Vector2?, vector22: Vector2?): Long? {
        if ((vector2 != null) && (vector22 != null) && (l != null)) {
            val x: Float = ((vector22.x - vector2.x) * 2.0f) / screenWidth
            val duration: Long? = getPlayer().getDuration()
            if (duration != null) {
                val longValue: Long = duration.longValue()
                return Long.valueOf(
                    Math.max(
                        Math.min(
                            l.longValue() + ((longValue.toFloat()) * x * x * (if (x < 0.0f) -1 else 1)),
                            longValue
                        ), 0L
                    )
                )
            }
        }
        return null
    }

    private val brightness: Float?
        private get() {
            var context: Context
            var window: Window
            var attributes: WindowManager.LayoutParams
            r1 = null
            r1 = null
            var f: Float? = null
            if (useTrueSystemBrightness) {
                try {
                    return Float.valueOf(
                        Settings.System.getInt(
                            if (getContext() != null) context.getContentResolver() else null,
                            "screen_brightness"
                        ) / 255.0f
                    )
                } catch (unused: Exception) {
                    useTrueSystemBrightness = false
                    return brightness
                }
            }
            try {
                val activity: FragmentActivity? = getActivity()
                if ((activity != null) && ((activity.getWindow()
                        .also({ window = it })) != null) && ((window.getAttributes()
                        .also({ attributes = it })) != null)
                ) {
                    f = Float.valueOf(attributes.screenBrightness)
                }
            } catch (e: Exception) {
                ArchComponentExt.logError(e)
                f = null
            }
            return f
        }

    private fun setBrightness(f: Float) {
        var window: Window
        if (useTrueSystemBrightness) {
            try {
                val context: Context? = getContext()
                Settings.System.putInt(
                    if (context != null) context.getContentResolver() else null,
                    "screen_brightness_mode",
                    0
                )
                val context2: Context? = getContext()
                Settings.System.putInt(
                    if (context2 != null) context2.getContentResolver() else null,
                    "screen_brightness",
                    (255 * f).toInt()
                )
                return
            } catch (unused: Exception) {
                useTrueSystemBrightness = false
                setBrightness(f)
                return
            }
        }
        try {
            val activity: FragmentActivity? = getActivity()
            val attributes: WindowManager.LayoutParams? =
                if ((activity == null || (activity.getWindow()
                        .also({ window = it })) == null)
                ) null else window.getAttributes()
            if (attributes != null) {
                attributes.screenBrightness = f
            }
            val activity2: FragmentActivity? = getActivity()
            val window2: Window? = if (activity2 != null) activity2.getWindow() else null
            if (window2 == null) {
                return
            }
            window2.setAttributes(attributes)
        } catch (e: Exception) {
            ArchComponentExt.logError(e)
        }
    }

    private fun handleMotionEvent(view: View?, motionEvent: MotionEvent?): Boolean {
        var audioManager: AudioManager
        var l: Long
        var calculateNewTime: Long
        var calculateNewTime2: Long
        val touchAction: TouchAction
        if (motionEvent == null || view == null) {
            return false
        }
        val vector2: Vector2 = Vector2(motionEvent.getX(), motionEvent.getY())
        val vector22: Vector2? = currentTouchStart
        val frameLayout: FrameLayout? =
            `_$_findCachedViewById`(C4761R.C4764id.player_intro_play) as FrameLayout?
        if (frameLayout != null) {
            frameLayout.setVisibility(8)
        }
        val action: Int = motionEvent.getAction()
        if (action == 0) {
            val isValidTouch: Boolean = isValidTouch(vector2.x, vector2.y)
            isCurrentTouchValid = isValidTouch
            if (isValidTouch) {
                currentTouchStartTime = Long.valueOf(System.currentTimeMillis())
                currentTouchStart = vector2
                currentTouchLast = vector2
                currentTouchStartPlayerTime = getPlayer().getPosition()
                val brightness: Float? = brightness
                if (brightness != null) {
                    currentRequestedBrightness = brightness.floatValue()
                    val unit: Unit = Unit.INSTANCE
                    val unit2: Unit = Unit.INSTANCE
                }
                val activity: FragmentActivity? = getActivity()
                val systemService: Object? =
                    if (activity != null) activity.getSystemService("audio") else null
                if ((if (systemService is AudioManager) systemService as AudioManager? else null) != null) {
                    currentRequestedVolume =
                        audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3)
                    val unit3: Unit = Unit.INSTANCE
                    val unit4: Unit = Unit.INSTANCE
                }
            }
        } else if (action == 1) {
            if (isCurrentTouchValid && !isLocked && isFullScreenPlayer && swipeHorizontalEnabled && (currentTouchAction == TouchAction.Time) && ((currentTouchStartPlayerTime.also(
                    { l = it })) != null) && ((calculateNewTime(
                    l,
                    vector22,
                    vector2
                ).also({ calculateNewTime = it })) != null)
            ) {
                val longValue: Long = calculateNewTime.longValue()
                if (Math.abs(longValue - l.longValue()) > FullScreenPlayerKt.MINIMUM_SEEK_TIME) {
                    getPlayer().seekTo(longValue)
                }
                val unit5: Unit = Unit.INSTANCE
                val unit6: Unit = Unit.INSTANCE
            }
            val l2: Long? = currentTouchStartTime
            val valueOf: Long? =
                if (l2 != null) Long.valueOf(l2.longValue() - System.currentTimeMillis()) else null
            if (isCurrentTouchValid && (currentTouchAction == null) && (currentLastTouchAction == null) && (valueOf != null) && (valueOf.longValue() < 200)) {
                if (!isLocked && System.currentTimeMillis() - currentLastTouchEndTime < 200) {
                    val i: Int = currentClickCount + 1
                    currentClickCount = i
                    if (i >= 1) {
                        currentDoubleTapIndex++
                        if (doubleTapPauseEnabled && isFullScreenPlayer) {
                            if (vector2.x < (screenWidth / 2) - (screenWidth * 0.15)) {
                                if (doubleTapEnabled) {
                                    rewind()
                                }
                            } else if (vector2.x > (screenWidth / 2) + (screenWidth * 0.15)) {
                                if (doubleTapEnabled) {
                                    fastForward()
                                }
                            } else {
                                getPlayer().handleEvent(CSPlayerEvent.PlayPauseToggle)
                            }
                        } else if (doubleTapEnabled && isFullScreenPlayer) {
                            if (vector2.x < screenWidth / 2) {
                                rewind()
                            } else {
                                fastForward()
                            }
                        }
                    }
                } else {
                    currentClickCount = 0
                    toggleShowDelayed()
                }
            } else {
                currentClickCount = 0
            }
            autoHide()
            isCurrentTouchValid = false
            currentTouchStart = null
            currentLastTouchAction = currentTouchAction
            currentTouchAction = null
            currentTouchStartPlayerTime = null
            currentTouchLast = null
            currentTouchStartTime = null
            val textView: TextView? =
                `_$_findCachedViewById`(C4761R.C4764id.player_time_text) as TextView?
            if (textView != null) {
                textView.setVisibility(8)
            }
            val relativeLayout: RelativeLayout? =
                `_$_findCachedViewById`(C4761R.C4764id.player_progressbar_left_holder) as RelativeLayout?
            if (relativeLayout != null) {
                relativeLayout.setVisibility(8)
            }
            val relativeLayout2: RelativeLayout? =
                `_$_findCachedViewById`(C4761R.C4764id.player_progressbar_right_holder) as RelativeLayout?
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(8)
            }
            currentLastTouchEndTime = System.currentTimeMillis()
        } else if ((action == 2) && (vector22 != null) && isCurrentTouchValid && !isLocked && isFullScreenPlayer) {
            if (currentTouchAction == null) {
                val minus: Vector2 = vector22.minus(vector2)
                if (swipeVerticalEnabled && Math.abs((minus.y * 100) / screenHeight) > 2.0f) {
                    if (vector22.x < screenWidth / 2) {
                        if (isShowing) {
                            isShowing = false
                            animateLayoutChanges()
                        }
                        touchAction = TouchAction.Brightness
                    } else {
                        touchAction = TouchAction.Volume
                    }
                    currentTouchAction = touchAction
                }
                if (swipeHorizontalEnabled && Math.abs((minus.x * 100) / screenHeight) > 2.0f) {
                    currentTouchAction = TouchAction.Time
                }
            }
            val vector23: Vector2? = currentTouchLast
            if (vector23 != null) {
                val y: Float = (vector23.minus(vector2).y * 2.0f) / screenHeight
                val textView2: TextView? =
                    `_$_findCachedViewById`(C4761R.C4764id.player_time_text) as TextView?
                if (textView2 != null) {
                    textView2.setVisibility(8)
                }
                val relativeLayout3: RelativeLayout? =
                    `_$_findCachedViewById`(C4761R.C4764id.player_progressbar_left_holder) as RelativeLayout?
                if (relativeLayout3 != null) {
                    relativeLayout3.setVisibility(8)
                }
                val relativeLayout4: RelativeLayout? =
                    `_$_findCachedViewById`(C4761R.C4764id.player_progressbar_right_holder) as RelativeLayout?
                if (relativeLayout4 != null) {
                    relativeLayout4.setVisibility(8)
                }
                val touchAction2: TouchAction? = currentTouchAction
                val i2: Int =
                    if (touchAction2 == null) -1 else WhenMappings.`$EnumSwitchMapping$0`.get(
                        touchAction2.ordinal()
                    )
                if (i2 == 1) {
                    val l3: Long? = currentTouchStartPlayerTime
                    val valueOf2: Long? =
                        if (l3 != null) Long.valueOf((l3.longValue() / 1000) * 1000) else null
                    if (valueOf2 != null && (calculateNewTime(
                            valueOf2,
                            vector22,
                            vector2
                        ).also({ calculateNewTime2 = it })) != null
                    ) {
                        val longValue2: Long = calculateNewTime2.longValue()
                        val longValue3: Long = longValue2 - valueOf2.longValue()
                        val textView3: TextView? =
                            `_$_findCachedViewById`(C4761R.C4764id.player_time_text) as TextView?
                        if (textView3 != null) {
                            val sb: StringBuilder = StringBuilder()
                            val companion: Companion = Companion
                            val j: Long = 1000
                            sb.append(companion.convertTimeToString(longValue2 / j))
                            sb.append(" [")
                            sb.append(if (Math.abs(longValue3) < 1000) "" else if (longValue3 > 0) "+" else "-")
                            sb.append(companion.convertTimeToString(Math.abs(longValue3 / j)))
                            sb.append(']')
                            textView3.setText(sb.toString())
                        }
                        val player_time_text: TextView? =
                            `_$_findCachedViewById`(C4761R.C4764id.player_time_text) as TextView?
                        if (player_time_text != null) {
                            Intrinsics.checkNotNullExpressionValue(
                                player_time_text,
                                "player_time_text"
                            )
                            player_time_text.setVisibility(0)
                        }
                        val unit7: Unit = Unit.INSTANCE
                        val unit8: Unit = Unit.INSTANCE
                    }
                    val unit9: Unit = Unit.INSTANCE
                } else if (i2 == 2) {
                    val relativeLayout5: RelativeLayout? =
                        `_$_findCachedViewById`(C4761R.C4764id.player_progressbar_right_holder) as RelativeLayout?
                    if (relativeLayout5 != null) {
                        relativeLayout5.setVisibility(0)
                    }
                    val f: Float = currentRequestedBrightness
                    val min: Float = Math.min(1.0f, Math.max(y + f, 0.0f))
                    currentRequestedBrightness = min
                    if (!(f == min)) {
                        setBrightness(min)
                    }
                    val progressBar: ProgressBar? =
                        `_$_findCachedViewById`(C4761R.C4764id.player_progressbar_right) as ProgressBar?
                    if (progressBar != null) {
                        progressBar.setMax(AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND)
                    }
                    val progressBar2: ProgressBar? =
                        `_$_findCachedViewById`(C4761R.C4764id.player_progressbar_right) as ProgressBar?
                    if (progressBar2 != null) {
                        progressBar2.setProgress(
                            Math.max(
                                2000,
                                (currentRequestedBrightness * 100000.0f).toInt()
                            )
                        )
                    }
                    val imageView: ImageView? =
                        `_$_findCachedViewById`(C4761R.C4764id.player_progressbar_right_icon) as ImageView?
                    if (imageView != null) {
                        val list: List<Integer> = brightnessIcons
                        imageView.setImageResource(
                            list.get(
                                Math.min(
                                    list.size() - 1, Math.max(
                                        0, Math.rint(
                                            currentRequestedBrightness * (brightnessIcons.size() - 1)
                                        ) as Int
                                    )
                                )
                            ).intValue()
                        )
                        val unit10: Unit = Unit.INSTANCE
                    }
                } else if (i2 == 3) {
                    val activity2: FragmentActivity? = getActivity()
                    val systemService2: Object? =
                        if (activity2 != null) activity2.getSystemService("audio") else null
                    val audioManager2: AudioManager? =
                        if (systemService2 is AudioManager) systemService2 as AudioManager? else null
                    if (audioManager2 != null) {
                        val player_progressbar_left_holder: RelativeLayout? =
                            `_$_findCachedViewById`(C4761R.C4764id.player_progressbar_left_holder) as RelativeLayout?
                        if (player_progressbar_left_holder != null) {
                            Intrinsics.checkNotNullExpressionValue(
                                player_progressbar_left_holder,
                                "player_progressbar_left_holder"
                            )
                            player_progressbar_left_holder.setVisibility(0)
                        }
                        val streamMaxVolume: Int = audioManager2.getStreamMaxVolume(3)
                        val streamVolume: Int = audioManager2.getStreamVolume(3)
                        currentRequestedVolume =
                            Math.min(1.0f, Math.max(currentRequestedVolume + y, 0.0f))
                        val progressBar3: ProgressBar? =
                            `_$_findCachedViewById`(C4761R.C4764id.player_progressbar_left) as ProgressBar?
                        if (progressBar3 != null) {
                            progressBar3.setMax(AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND)
                        }
                        val progressBar4: ProgressBar? =
                            `_$_findCachedViewById`(C4761R.C4764id.player_progressbar_left) as ProgressBar?
                        if (progressBar4 != null) {
                            progressBar4.setProgress(
                                Math.max(
                                    2000,
                                    (currentRequestedVolume * 100000.0f).toInt()
                                )
                            )
                        }
                        val imageView2: ImageView? =
                            `_$_findCachedViewById`(C4761R.C4764id.player_progressbar_left_icon) as ImageView?
                        if (imageView2 != null) {
                            val list2: List<Integer> = volumeIcons
                            imageView2.setImageResource(
                                list2.get(
                                    Math.min(
                                        list2.size() - 1, Math.max(
                                            0, Math.rint(
                                                currentRequestedVolume * (volumeIcons.size() - 1)
                                            ) as Int
                                        )
                                    )
                                ).intValue()
                            )
                            val unit11: Unit = Unit.INSTANCE
                        }
                        val rint: Int = Math.rint(currentRequestedVolume * streamMaxVolume)
                        if (rint != streamVolume) {
                            audioManager2.adjustStreamVolume(
                                3,
                                if (rint >= streamVolume) 1 else -1,
                                0
                            )
                        }
                        val unit12: Unit = Unit.INSTANCE
                        val unit13: Unit = Unit.INSTANCE
                    }
                } else {
                    val unit14: Unit = Unit.INSTANCE
                }
            }
        }
        currentTouchLast = vector2
        return true
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun handleKeyEvent(keyEvent: KeyEvent, z: Boolean): Boolean {
        if (z) {
            autoHide()
        } else {
            val keyCode: Int = keyEvent.getKeyCode()
            if (keyEvent.getAction() === 0) {
                when (keyCode) {
                    19 -> if (!isShowing) {
                        onClickChange()
                        return true
                    }
                    21 -> {
                        if (!isShowing && !isLocked) {
                            getPlayer().seekTime(-10000L)
                            return true
                        }
                        val imageView: ImageView? =
                            `_$_findCachedViewById`(C4761R.C4764id.player_pause_play) as ImageView?
                        if (imageView != null && imageView.isFocused()) {
                            getPlayer().seekTime(-30000L)
                            return true
                        }
                    }
                    22 -> {
                        if (!isShowing && !isLocked) {
                            getPlayer().seekTime(10000L)
                            return true
                        }
                        val imageView2: ImageView? =
                            `_$_findCachedViewById`(C4761R.C4764id.player_pause_play) as ImageView?
                        if (imageView2 != null && imageView2.isFocused()) {
                            getPlayer().seekTime(30000L)
                            return true
                        }
                    }
                    23 -> if (!isShowing) {
                        if (!isLocked) {
                            getPlayer().handleEvent(CSPlayerEvent.PlayPauseToggle)
                        }
                        onClickChange()
                        return true
                    }
                }
            }
            if (keyCode != 4) {
                if (keyCode != 19 && keyCode != 20) {
                    when (keyCode) {
                    }
                }
                if (!isShowing) {
                    return true
                }
                autoHide()
            } else if (isShowing) {
                onClickChange()
                return true
            }
        }
        return false
    }

    /* JADX INFO: Access modifiers changed from: protected */
    fun uiReset() {
        isLocked = false
        isShowing = false
        val materialButton: MaterialButton? =
            `_$_findCachedViewById`(C4761R.C4764id.player_skip_episode) as MaterialButton?
        if (materialButton != null) {
            materialButton.setVisibility(8)
        }
        val materialButton2: MaterialButton? =
            `_$_findCachedViewById`(C4761R.C4764id.player_skip_op) as MaterialButton?
        if (materialButton2 != null) {
            materialButton2.setVisibility(8)
        }
        val `_$_findCachedViewById`: View? = `_$_findCachedViewById`(C4761R.C4764id.shadow_overlay)
        if (`_$_findCachedViewById` != null) {
            `_$_findCachedViewById`.setVisibility(8)
        }
        updateLockUI()
        updateUIVisibility()
        animateLayoutChanges()
        resetFastForwardText()
        resetRewindText()
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.AbstractPlayerFragment, androidx.fragment.app.Fragment
    public override fun onViewCreated(view: View, bundle: Bundle) {
        Intrinsics.checkNotNullParameter(view, "view")
        super.onViewCreated(view, bundle)
        val context: Context? = AcraApplication.Companion.context
        var obj: Object? = null
        if (context != null) {
            val dataStore: DataStore = DataStore.INSTANCE
            try {
                val string: String? =
                    dataStore.getSharedPrefs(context).getString("playback_speed", null)
                if (string != null) {
                    Intrinsics.checkNotNullExpressionValue(
                        string,
                        "getSharedPrefs().getStri…h, null) ?: return defVal"
                    )
                    val readValue: Object = dataStore.mapper.readValue(string, Float::class.java)
                    Intrinsics.checkNotNullExpressionValue(
                        readValue,
                        "mapper.readValue(this, T::class.java)"
                    )
                    obj = readValue
                }
            } catch (unused: Exception) {
            }
        }
        val f: Float? = obj
        setPlayBackSpeed(if (f != null) f.floatValue() else 1.0f)
        CommonActivity.INSTANCE.playerEventListener = `FullScreenPlayer$onViewCreated$1`(this, view)
        CommonActivity.INSTANCE.setKeyEventListener(`FullScreenPlayer$onViewCreated$2`(this))
        try {
            val context2: Context? = getContext()
            var i: Int = 0
            if (context2 != null) {
                val defaultSharedPreferences: SharedPreferences =
                    PreferenceManager.getDefaultSharedPreferences(context2)
                fastForwardTime = defaultSharedPreferences.getInt(
                    context2.getString(R.string.double_tap_seek_time_key),
                    10
                ) * 1000
                navigationBarHeight =
                    Integer.valueOf(UIHelper.INSTANCE.getNavigationBarHeight(context2))
                statusBarHeight = Integer.valueOf(UIHelper.INSTANCE.getStatusBarHeight(context2))
                swipeHorizontalEnabled = defaultSharedPreferences.getBoolean(
                    context2.getString(R.string.swipe_enabled_key),
                    true
                )
                swipeVerticalEnabled = defaultSharedPreferences.getBoolean(
                    context2.getString(R.string.swipe_vertical_enabled_key),
                    true
                )
                playBackSpeedEnabled = defaultSharedPreferences.getBoolean(
                    context2.getString(R.string.playback_speed_enabled_key),
                    false
                )
                playerResizeEnabled = defaultSharedPreferences.getBoolean(
                    context2.getString(R.string.player_resize_enabled_key),
                    true
                )
                doubleTapEnabled = defaultSharedPreferences.getBoolean(
                    context2.getString(R.string.double_tap_enabled_key),
                    false
                )
                doubleTapPauseEnabled = defaultSharedPreferences.getBoolean(
                    context2.getString(R.string.double_tap_pause_enabled_key),
                    false
                )
                currentPrefQuality = defaultSharedPreferences.getInt(
                    context2.getString(R.string.quality_pref_key),
                    currentPrefQuality
                )
            }
            val materialButton: MaterialButton? =
                `_$_findCachedViewById`(C4761R.C4764id.player_speed_btt) as MaterialButton?
            if (materialButton != null) {
                materialButton.setVisibility(if (playBackSpeedEnabled) 0 else 8)
            }
            val materialButton2: MaterialButton? =
                `_$_findCachedViewById`(C4761R.C4764id.player_resize_btt) as MaterialButton?
            if (materialButton2 != null) {
                val materialButton3: MaterialButton? = materialButton2
                if (!playerResizeEnabled) {
                    i = 8
                }
                materialButton3.setVisibility(i)
            }
        } catch (e: Exception) {
            ArchComponentExt.logError(e)
        }
        val imageView: ImageView? =
            `_$_findCachedViewById`(C4761R.C4764id.player_pause_play) as ImageView?
        if (imageView != null) {
            imageView.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$FullScreenPlayer$XJq3j5FEck1UOsT-uNdlVV0HpNg
                @Override // android.view.View.OnClickListener
                fun onClick(view2: View?) {
                    Companion.`m8684onViewCreated$lambda32`(this@FullScreenPlayer, view2)
                }
            })
        }
        val materialButton4: MaterialButton? =
            `_$_findCachedViewById`(C4761R.C4764id.player_resize_btt) as MaterialButton?
        if (materialButton4 != null) {
            materialButton4.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$FullScreenPlayer$O3kSYdMmlC3jdPFC2GfYjZE1y7k
                @Override // android.view.View.OnClickListener
                fun onClick(view2: View?) {
                    Companion.`m8685onViewCreated$lambda33`(this@FullScreenPlayer, view2)
                }
            })
        }
        val materialButton5: MaterialButton? =
            `_$_findCachedViewById`(C4761R.C4764id.player_speed_btt) as MaterialButton?
        if (materialButton5 != null) {
            materialButton5.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$FullScreenPlayer$chc5sdLeqWx3NaKfJpaeuPL7n2M
                @Override // android.view.View.OnClickListener
                fun onClick(view2: View?) {
                    Companion.`m8686onViewCreated$lambda34`(this@FullScreenPlayer, view2)
                }
            })
        }
        val materialButton6: MaterialButton? =
            `_$_findCachedViewById`(C4761R.C4764id.player_skip_op) as MaterialButton?
        if (materialButton6 != null) {
            materialButton6.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$FullScreenPlayer$h6MBXdMhKv0-AcBtwwhKzWGjCgQ
                @Override // android.view.View.OnClickListener
                fun onClick(view2: View?) {
                    Companion.`m8687onViewCreated$lambda35`(this@FullScreenPlayer, view2)
                }
            })
        }
        val materialButton7: MaterialButton? =
            `_$_findCachedViewById`(C4761R.C4764id.player_skip_episode) as MaterialButton?
        if (materialButton7 != null) {
            materialButton7.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$FullScreenPlayer$gsUt4Vl1HTBVOaiGC-eDlA6TgXw
                @Override // android.view.View.OnClickListener
                fun onClick(view2: View?) {
                    Companion.`m8688onViewCreated$lambda36`(this@FullScreenPlayer, view2)
                }
            })
        }
        val materialButton8: MaterialButton? =
            `_$_findCachedViewById`(C4761R.C4764id.player_lock) as MaterialButton?
        if (materialButton8 != null) {
            materialButton8.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$FullScreenPlayer$JcBbnZm_GFo5fo0CAoIWHpXNSiM
                @Override // android.view.View.OnClickListener
                fun onClick(view2: View?) {
                    Companion.`m8689onViewCreated$lambda37`(this@FullScreenPlayer, view2)
                }
            })
        }
        val materialButton9: MaterialButton? =
            `_$_findCachedViewById`(C4761R.C4764id.player_subtitle_offset_btt) as MaterialButton?
        if (materialButton9 != null) {
            materialButton9.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$FullScreenPlayer$ayi9FvFYIZnSICbdUOZtXA-uxXY
                @Override // android.view.View.OnClickListener
                fun onClick(view2: View?) {
                    Companion.`m8690onViewCreated$lambda38`(this@FullScreenPlayer, view2)
                }
            })
        }
        val imageButton: ImageButton? =
            `_$_findCachedViewById`(C4761R.C4764id.exo_rew) as ImageButton?
        if (imageButton != null) {
            imageButton.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$FullScreenPlayer$7JUM-EzHYYo4-uaqJ9JItQfec8U
                @Override // android.view.View.OnClickListener
                fun onClick(view2: View?) {
                    Companion.`m8691onViewCreated$lambda39`(this@FullScreenPlayer, view2)
                }
            })
        }
        val imageButton2: ImageButton? =
            `_$_findCachedViewById`(C4761R.C4764id.exo_ffwd) as ImageButton?
        if (imageButton2 != null) {
            imageButton2.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$FullScreenPlayer$Tww4BAAFrq5-soxnNoTY8lnKATE
                @Override // android.view.View.OnClickListener
                fun onClick(view2: View?) {
                    Companion.`m8692onViewCreated$lambda40`(this@FullScreenPlayer, view2)
                }
            })
        }
        val imageView2: ImageView? =
            `_$_findCachedViewById`(C4761R.C4764id.player_go_back) as ImageView?
        if (imageView2 != null) {
            imageView2.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$FullScreenPlayer$-Kd1Cu2VJXoAIXotSKsZEao7OkA
                @Override // android.view.View.OnClickListener
                fun onClick(view2: View?) {
                    Companion.`m8693onViewCreated$lambda41`(this@FullScreenPlayer, view2)
                }
            })
        }
        val materialButton10: MaterialButton? =
            `_$_findCachedViewById`(C4761R.C4764id.player_sources_btt) as MaterialButton?
        if (materialButton10 != null) {
            materialButton10.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$FullScreenPlayer$5PJMQYrNCp3pqXqchMYiuKagrSM
                @Override // android.view.View.OnClickListener
                fun onClick(view2: View?) {
                    Companion.`m8694onViewCreated$lambda42`(this@FullScreenPlayer, view2)
                }
            })
        }
        val frameLayout: FrameLayout? =
            `_$_findCachedViewById`(C4761R.C4764id.player_intro_play) as FrameLayout?
        if (frameLayout != null) {
            frameLayout.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$FullScreenPlayer$KJGmE-yACQ-YB7ZY6a5Tc5cR5j8
                @Override // android.view.View.OnClickListener
                fun onClick(view2: View?) {
                    Companion.`m8695onViewCreated$lambda43`(this@FullScreenPlayer, view2)
                }
            })
        }
        val frameLayout2: FrameLayout? =
            `_$_findCachedViewById`(C4761R.C4764id.player_holder) as FrameLayout?
        if (frameLayout2 != null) {
            frameLayout2.setOnTouchListener(object : OnTouchListener() {
                // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$FullScreenPlayer$_Kd-RTFixOohT8tE5bav6XrqtSI
                @Override // android.view.View.OnTouchListener
                fun onTouch(view2: View?, motionEvent: MotionEvent?): Boolean {
                    val `m8696onViewCreated$lambda44`: Boolean
                    `m8696onViewCreated$lambda44` = Companion.`m8696onViewCreated$lambda44`(
                        this@FullScreenPlayer,
                        view2,
                        motionEvent
                    )
                    return `m8696onViewCreated$lambda44`
                }
            })
        }
        val defaultTimeBar: DefaultTimeBar? =
            `_$_findCachedViewById`(C4761R.C4764id.exo_progress) as DefaultTimeBar?
        if (defaultTimeBar != null) {
            defaultTimeBar.setOnTouchListener(object : OnTouchListener() {
                // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$FullScreenPlayer$A0PGtbjGTJOOblTAXwu4O3mwktQ
                @Override // android.view.View.OnTouchListener
                fun onTouch(view2: View?, motionEvent: MotionEvent?): Boolean {
                    val `m8697onViewCreated$lambda45`: Boolean
                    `m8697onViewCreated$lambda45` = Companion.`m8697onViewCreated$lambda45`(
                        this@FullScreenPlayer,
                        view2,
                        motionEvent
                    )
                    return `m8697onViewCreated$lambda45`
                }
            })
        }
        try {
            uiReset()
        } catch (e2: Exception) {
            ArchComponentExt.logError(e2)
        }
    }

    companion object {
        val Companion: Companion = Companion(null)

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: animateLayoutChanges$lambda-0  reason: not valid java name */
        fun `m8670animateLayoutChanges$lambda0`(`this$0`: FullScreenPlayer) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            `this$0`.updateUIVisibility()
        }

        /* renamed from: showSubtitleOffsetDialog$lambda-18$changeBy  reason: not valid java name */
        private fun `m8698showSubtitleOffsetDialog$lambda18$changeBy`(editText: EditText, j: Long) {
            var obj: String?
            var longOrNull: Long
            val text: Editable? = editText.getText()
            val longValue: Long = (if (((text == null) || ((text.toString()
                    .also({ obj = it })) == null) || ((StringsKt.toLongOrNull(obj)
                    .also({ longOrNull = it })) == null))
            ) 0L else longOrNull.longValue()) + j
            val factory: Editable.Factory? = Editable.Factory.getInstance()
            editText.setText(if (factory != null) factory.newEditable(String.valueOf(longValue)) else null)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: showSubtitleOffsetDialog$lambda-18$lambda-13  reason: not valid java name */
        fun `m8699showSubtitleOffsetDialog$lambda18$lambda13`(
            j: Long,
            input: EditText?,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(input, "\$input")
            FullScreenPlayer.Companion.`m8698showSubtitleOffsetDialog$lambda18$changeBy`(input, j)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: showSubtitleOffsetDialog$lambda-18$lambda-14  reason: not valid java name */
        fun `m8700showSubtitleOffsetDialog$lambda18$lambda14`(
            j: Long,
            input: EditText?,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(input, "\$input")
            FullScreenPlayer.Companion.`m8698showSubtitleOffsetDialog$lambda18$changeBy`(input, -j)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: showSubtitleOffsetDialog$lambda-18$lambda-15  reason: not valid java name */
        fun `m8701showSubtitleOffsetDialog$lambda18$lambda15`(
            `this$0`: FullScreenPlayer,
            dialogInterface: DialogInterface?
        ) {
            var activity: FragmentActivity?
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            if (!`this$0`.isFullScreenPlayer || (`this$0`.getActivity()
                    .also({ activity = it })) == null
            ) {
                return
            }
            UIHelper.INSTANCE.hideSystemUI(activity)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: showSubtitleOffsetDialog$lambda-18$lambda-16  reason: not valid java name */
        fun `m8702showSubtitleOffsetDialog$lambda18$lambda16`(
            dialog: AlertDialog?,
            `this$0`: FullScreenPlayer,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(dialog, "\$dialog")
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            UIHelper.INSTANCE.dismissSafe(dialog, `this$0`.getActivity())
            `this$0`.getPlayer().seekTime(1L)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: showSubtitleOffsetDialog$lambda-18$lambda-17  reason: not valid java name */
        fun `m8703showSubtitleOffsetDialog$lambda18$lambda17`(
            `this$0`: FullScreenPlayer,
            j: Long,
            dialog: AlertDialog?,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(dialog, "\$dialog")
            `this$0`.subtitleDelay = j
            UIHelper.INSTANCE.dismissSafe(dialog, `this$0`.getActivity())
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: toggleLock$lambda-20  reason: not valid java name */
        fun `m8704toggleLock$lambda20`(`this$0`: FullScreenPlayer) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            if (`this$0`.isLocked && `this$0`.isShowing) {
                `this$0`.onClickChange()
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: autoHide$lambda-23  reason: not valid java name */
        fun `m8671autoHide$lambda23`(`this$0`: FullScreenPlayer, i: Int) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            if (!`this$0`.isCurrentTouchValid && `this$0`.isShowing && (i == `this$0`.currentTapIndex) && `this$0`.getPlayer()
                    .getIsPlaying()
            ) {
                `this$0`.onClickChange()
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: toggleShowDelayed$lambda-24  reason: not valid java name */
        fun `m8705toggleShowDelayed$lambda24`(i: Int, `this$0`: FullScreenPlayer) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            if (i == `this$0`.currentDoubleTapIndex) {
                `this$0`.onClickChange()
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-32  reason: not valid java name */
        fun `m8684onViewCreated$lambda32`(`this$0`: FullScreenPlayer, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            `this$0`.autoHide()
            `this$0`.getPlayer().handleEvent(CSPlayerEvent.PlayPauseToggle)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-33  reason: not valid java name */
        fun `m8685onViewCreated$lambda33`(`this$0`: FullScreenPlayer, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            `this$0`.autoHide()
            `this$0`.nextResize()
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-34  reason: not valid java name */
        fun `m8686onViewCreated$lambda34`(`this$0`: FullScreenPlayer, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            `this$0`.autoHide()
            `this$0`.showSpeedDialog()
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-35  reason: not valid java name */
        fun `m8687onViewCreated$lambda35`(`this$0`: FullScreenPlayer, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            `this$0`.autoHide()
            `this$0`.skipOp()
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-36  reason: not valid java name */
        fun `m8688onViewCreated$lambda36`(`this$0`: FullScreenPlayer, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            `this$0`.autoHide()
            `this$0`.getPlayer().handleEvent(CSPlayerEvent.NextEpisode)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-37  reason: not valid java name */
        fun `m8689onViewCreated$lambda37`(`this$0`: FullScreenPlayer, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            `this$0`.autoHide()
            `this$0`.toggleLock()
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-38  reason: not valid java name */
        fun `m8690onViewCreated$lambda38`(`this$0`: FullScreenPlayer, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            `this$0`.showSubtitleOffsetDialog()
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-39  reason: not valid java name */
        fun `m8691onViewCreated$lambda39`(`this$0`: FullScreenPlayer, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            `this$0`.autoHide()
            `this$0`.rewind()
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-40  reason: not valid java name */
        fun `m8692onViewCreated$lambda40`(`this$0`: FullScreenPlayer, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            `this$0`.autoHide()
            `this$0`.fastForward()
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-41  reason: not valid java name */
        fun `m8693onViewCreated$lambda41`(`this$0`: FullScreenPlayer, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                UIHelper.INSTANCE.popCurrentPage(activity)
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-42  reason: not valid java name */
        fun `m8694onViewCreated$lambda42`(`this$0`: FullScreenPlayer, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            `this$0`.showMirrorsDialogue()
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-43  reason: not valid java name */
        fun `m8695onViewCreated$lambda43`(`this$0`: FullScreenPlayer, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val frameLayout: FrameLayout? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.player_intro_play) as FrameLayout?
            if (frameLayout != null) {
                frameLayout.setVisibility(8)
            }
            `this$0`.getPlayer().handleEvent(CSPlayerEvent.Play)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-44  reason: not valid java name */
        fun `m8696onViewCreated$lambda44`(
            `this$0`: FullScreenPlayer,
            view: View?,
            motionEvent: MotionEvent?
        ): Boolean {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            return `this$0`.handleMotionEvent(view, motionEvent)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-45  reason: not valid java name */
        fun `m8697onViewCreated$lambda45`(
            `this$0`: FullScreenPlayer,
            view: View?,
            motionEvent: MotionEvent
        ): Boolean {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val action: Int = motionEvent.getAction()
            if (action == 0) {
                `this$0`.currentTapIndex++
                return false
            }
            if (action != 1) {
                if (action == 2) {
                    `this$0`.currentTapIndex++
                    return false
                } else if (action != 3 && action != 12) {
                    return false
                }
            }
            `this$0`.autoHide()
            return false
        }
    }
}