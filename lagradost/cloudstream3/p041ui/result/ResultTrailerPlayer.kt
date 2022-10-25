package com.lagradost.cloudstream3.p041ui.result

import android.content.Context
import kotlin.jvm.internal.Intrinsics

/* compiled from: ResultTrailerPlayer.kt */
@Metadata(
    m108d1 = ["\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\b\u0016\u0018\u0000 52\u00020\u00012\u00020\u00022\u00020\u0003:\u00015B\u0005¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0017\u001a\u00020\u00182\u000c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u0018H\u0016J\b\u0010\u001d\u001a\u00020\u0018H\u0002J\b\u0010\u001e\u001a\u00020\u0018H\u0016J\b\u0010\u001f\u001a\u00020\u0018H\u0016J\b\u0010 \u001a\u00020\u0006H\u0016J\u0010\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#H\u0016J\u0016\u0010$\u001a\u00020\u00182\u000c\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u001aH\u0016J\u001a\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u001c\u0010,\u001a\u00020\u00182\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u001c\u0010.\u001a\u00020\u00182\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002000\u0011H\u0016J\b\u00101\u001a\u00020\u0018H\u0016J\b\u00102\u001a\u00020\u0018H\u0016J\u0010\u00103\u001a\u00020\u00182\u0006\u00104\u001a\u00020\u0006H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0094\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0094\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\u000c\u0010\nR\u001a\u0010\r\u001a\u00020\u0006X\u0094\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\nR(\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u00066"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/result/ResultTrailerPlayer;", "Lcom/lagradost/cloudstream3/ui/player/FullScreenPlayer;", "Lcom/discord/panels/PanelsChildGestureRegionObserver\$GestureRegionsListener;", "Lcom/lagradost/cloudstream3/utils/IOnBackPressed;", "()V", "hasPipModeSupport", "", "getHasPipModeSupport", "()Z", "setHasPipModeSupport", "(Z)V", "isFullScreenPlayer", "setFullScreenPlayer", "lockRotation", "getLockRotation", "setLockRotation", "playerWidthHeight", "Lkotlin/Pair;", "", "getPlayerWidthHeight", "()Lkotlin/Pair;", "setPlayerWidthHeight", "(Lkotlin/Pair;)V", "embeddedSubtitlesFetched", "", "subtitles", "", "Lcom/lagradost/cloudstream3/ui/player/SubtitleData;", "exitedPipMode", "fixPlayerSize", "nextEpisode", "nextMirror", "onBackPressed", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onGestureRegionsUpdate", "gestureRegions", "Landroid/graphics/Rect;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "playerDimensionsLoaded", "widthHeight", "playerPositionChanged", "posDur", "", "prevEpisode", "subtitlesChanged", "updateFullscreen", "fullscreen", "Companion", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.result.ResultTrailerPlayer */ /* loaded from: classes4.dex */
open class ResultTrailerPlayer constructor() : FullScreenPlayer(), GestureRegionsListener,
    IOnBackPressed {
    var `_$_findViewCache`: Map<Integer, View> = LinkedHashMap()

    // com.lagradost.cloudstream3.p041ui.player.AbstractPlayerFragment
    // com.lagradost.cloudstream3.p041ui.player.AbstractPlayerFragment
    @get:Override
    @set:Override
    protected var hasPipModeSupport: Boolean = false

    // com.lagradost.cloudstream3.p041ui.player.FullScreenPlayer
    /* JADX INFO: Access modifiers changed from: protected */
    @get:Override
    @set:Override
    var isFullScreenPlayer: Boolean = false
        // com.lagradost.cloudstream3.p041ui.player.FullScreenPlayer
        protected set

    // com.lagradost.cloudstream3.p041ui.player.FullScreenPlayer
    // com.lagradost.cloudstream3.p041ui.player.FullScreenPlayer
    @get:Override
    @set:Override
    protected var lockRotation: Boolean = false
    private var playerWidthHeight: Tuples<Integer?, Integer?>? = null

    @Override // com.lagradost.cloudstream3.p041ui.player.FullScreenPlayer, com.lagradost.cloudstream3.p041ui.player.AbstractPlayerFragment
    public override fun `_$_clearFindViewByIdCache`() {
        `_$_findViewCache`.clear()
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.FullScreenPlayer, com.lagradost.cloudstream3.p041ui.player.AbstractPlayerFragment
    public override fun `_$_findCachedViewById`(i: Int): View? {
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

    @Override // com.lagradost.cloudstream3.p041ui.player.AbstractPlayerFragment
    public override fun embeddedSubtitlesFetched(subtitles: List<SubtitleData?>?) {
        Intrinsics.checkNotNullParameter(subtitles, "subtitles")
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.FullScreenPlayer, com.lagradost.cloudstream3.p041ui.player.AbstractPlayerFragment
    public override fun exitedPipMode() {
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.AbstractPlayerFragment
    public override fun nextEpisode() {
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.AbstractPlayerFragment
    public override fun nextMirror() {
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.FullScreenPlayer, com.lagradost.cloudstream3.p041ui.player.AbstractPlayerFragment, androidx.fragment.app.Fragment
    public /* synthetic */  override fun onDestroyView() {
        super.onDestroyView()
        `_$_clearFindViewByIdCache`()
    }

    public override fun onGestureRegionsUpdate(gestureRegions: List<Rect?>) {
        Intrinsics.checkNotNullParameter(gestureRegions, "gestureRegions")
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.AbstractPlayerFragment
    public override fun playerPositionChanged(posDur: Tuples<Long?, Long?>?) {
        Intrinsics.checkNotNullParameter(posDur, "posDur")
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.AbstractPlayerFragment
    public override fun prevEpisode() {
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.FullScreenPlayer, com.lagradost.cloudstream3.p041ui.player.AbstractPlayerFragment
    public override fun subtitlesChanged() {
    }

    /* compiled from: ResultTrailerPlayer.kt */
    @Metadata(
        m108d1 = ["\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/result/ResultTrailerPlayer\$Companion;", "", "()V", "TAG", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.result.ResultTrailerPlayer$Companion */ /* loaded from: classes4.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}
    }

    fun getPlayerWidthHeight(): Tuples<Integer?, Integer?>? {
        return playerWidthHeight
    }

    fun setPlayerWidthHeight(tuples: Tuples<Integer?, Integer?>?) {
        playerWidthHeight = tuples
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public override fun onConfigurationChanged(newConfig: Configuration) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig")
        super.onConfigurationChanged(newConfig)
        uiReset()
        fixPlayerSize()
    }

    private fun fixPlayerSize() {
        var resources: Resources
        var configuration: Configuration
        val screenHeight: Int
        val tuples: Tuples<Integer?, Integer?>? = playerWidthHeight
        if (tuples != null) {
            val intValue: Int = tuples.component1().intValue()
            val intValue2: Int = tuples.component2().intValue()
            val context: Context? = getContext()
            if ((context == null) || ((context.getResources()
                    .also({ resources = it })) == null) || ((resources.getConfiguration()
                    .also({ configuration = it })) == null)
            ) {
                return
            }
            if (configuration.orientation === 2) {
                screenHeight = getScreenWidth()
            } else {
                screenHeight = getScreenHeight()
            }
            val result_trailer_loading: ShimmerFrameLayout? =
                `_$_findCachedViewById`(C4761R.C4764id.result_trailer_loading) as ShimmerFrameLayout?
            if (result_trailer_loading != null) {
                Intrinsics.checkNotNullExpressionValue(
                    result_trailer_loading,
                    "result_trailer_loading"
                )
                result_trailer_loading.setVisibility(8)
            }
            val player_background: ConstraintLayout? =
                `_$_findCachedViewById`(C4761R.C4764id.player_background) as ConstraintLayout?
            if (player_background != null) {
                Intrinsics.checkNotNullExpressionValue(player_background, "player_background")
                player_background.setVisibility(0)
                player_background.setLayoutParams(
                    LayoutParams(
                        -1,
                        if (isFullScreenPlayer) -1 else (screenHeight * intValue2) / intValue
                    )
                )
            }
        }
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.AbstractPlayerFragment
    public override fun playerDimensionsLoaded(widthHeight: Tuples<Integer?, Integer?>?) {
        Intrinsics.checkNotNullParameter(widthHeight, "widthHeight")
        playerWidthHeight = widthHeight
        fixPlayerSize()
    }

    private fun updateFullscreen(z: Boolean) {
        isFullScreenPlayer = z
        lockRotation = z
        val imageView: ImageView? =
            `_$_findCachedViewById`(C4761R.C4764id.player_fullscreen) as ImageView?
        if (imageView != null) {
            imageView.setImageResource(if (z) R.drawable.baseline_fullscreen_exit_24 else R.drawable.baseline_fullscreen_24)
        }
        uiReset()
        if (z) {
            enterFullscreen()
            val frameLayout: FrameLayout? =
                `_$_findCachedViewById`(C4761R.C4764id.result_top_bar) as FrameLayout?
            if (frameLayout != null) {
                frameLayout.setVisibility(8)
            }
            val frameLayout2: FrameLayout? =
                `_$_findCachedViewById`(C4761R.C4764id.result_fullscreen_holder) as FrameLayout?
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(0)
            }
            val frameLayout3: FrameLayout? =
                `_$_findCachedViewById`(C4761R.C4764id.result_main_holder) as FrameLayout?
            if (frameLayout3 != null) {
                frameLayout3.setVisibility(8)
            }
            val constraintLayout: ConstraintLayout? =
                `_$_findCachedViewById`(C4761R.C4764id.player_background) as ConstraintLayout?
            if (constraintLayout != null) {
                val viewGroup: ViewGroup? = constraintLayout.getParent() as ViewGroup?
                if (viewGroup != null) {
                    viewGroup.removeView(constraintLayout)
                }
                val frameLayout4: FrameLayout? =
                    `_$_findCachedViewById`(C4761R.C4764id.result_fullscreen_holder) as FrameLayout?
                if (frameLayout4 != null) {
                    frameLayout4.addView(constraintLayout)
                }
            }
        } else {
            val frameLayout5: FrameLayout? =
                `_$_findCachedViewById`(C4761R.C4764id.result_top_bar) as FrameLayout?
            if (frameLayout5 != null) {
                frameLayout5.setVisibility(0)
            }
            val frameLayout6: FrameLayout? =
                `_$_findCachedViewById`(C4761R.C4764id.result_fullscreen_holder) as FrameLayout?
            if (frameLayout6 != null) {
                frameLayout6.setVisibility(8)
            }
            val frameLayout7: FrameLayout? =
                `_$_findCachedViewById`(C4761R.C4764id.result_main_holder) as FrameLayout?
            if (frameLayout7 != null) {
                frameLayout7.setVisibility(0)
            }
            val constraintLayout2: ConstraintLayout? =
                `_$_findCachedViewById`(C4761R.C4764id.player_background) as ConstraintLayout?
            if (constraintLayout2 != null) {
                val viewGroup2: ViewGroup? = constraintLayout2.getParent() as ViewGroup?
                if (viewGroup2 != null) {
                    viewGroup2.removeView(constraintLayout2)
                }
                val frameLayout8: FrameLayout? =
                    `_$_findCachedViewById`(C4761R.C4764id.result_smallscreen_holder) as FrameLayout?
                if (frameLayout8 != null) {
                    frameLayout8.addView(constraintLayout2)
                }
            }
            exitFullscreen()
        }
        fixPlayerSize()
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.FullScreenPlayer, com.lagradost.cloudstream3.p041ui.player.AbstractPlayerFragment, androidx.fragment.app.Fragment
    public override fun onViewCreated(view: View, bundle: Bundle) {
        Intrinsics.checkNotNullParameter(view, "view")
        super.onViewCreated(view, bundle)
        val imageView: ImageView? =
            `_$_findCachedViewById`(C4761R.C4764id.player_fullscreen) as ImageView?
        if (imageView != null) {
            imageView.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.result.-$$Lambda$ResultTrailerPlayer$DL8qyoDoYwpQycoF2T-FKREnD6I
                @Override // android.view.View.OnClickListener
                fun onClick(view2: View?) {
                    ResultTrailerPlayer.Companion.`m8865onViewCreated$lambda4`(
                        this@ResultTrailerPlayer,
                        view2
                    )
                }
            })
        }
        updateFullscreen(isFullScreenPlayer)
        uiReset()
    }

    @Override // com.lagradost.cloudstream3.utils.IOnBackPressed
    public override fun onBackPressed(): Boolean {
        if (isFullScreenPlayer) {
            updateFullscreen(false)
            return false
        }
        return true
    }

    companion object {
        val Companion: Companion = Companion(null)
        val TAG: String = "RESULT_TRAILER"

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-4  reason: not valid java name */
        fun `m8865onViewCreated$lambda4`(`this$0`: ResultTrailerPlayer, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            `this$0`.updateFullscreen(!`this$0`.isFullScreenPlayer)
        }
    }
}