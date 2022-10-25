package com.lagradost.cloudstream3.p041ui.player

import android.view.animation.Animation
import kotlin.jvm.internal.Intrinsics

/* compiled from: FullScreenPlayer.kt */
@Metadata(
    m108d1 = ["\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"],
    m107d2 = ["com/lagradost/cloudstream3/ui/player/FullScreenPlayer\$fastForward$1", "Landroid/view/animation/Animation\$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.player.FullScreenPlayer$fastForward$1 */ /* loaded from: classes3.dex */
class `FullScreenPlayer$fastForward$1`     /* JADX INFO: Access modifiers changed from: package-private */ constructor(  /* synthetic */
    val `this$0`: FullScreenPlayer
) : Animation.AnimationListener {
    @Override // android.view.animation.Animation.AnimationListener
    fun onAnimationRepeat(animation: Animation?) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    fun onAnimationStart(animation: Animation?) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    fun onAnimationEnd(animation: Animation?) {
        val textView: TextView? =
            `this$0`.`_$_findCachedViewById`(C4761R.C4764id.exo_ffwd_text) as TextView?
        if (textView != null) {
            val fullScreenPlayer: FullScreenPlayer = `this$0`
            textView.post(object : Runnable() {
                // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$FullScreenPlayer$fastForward$1$9VNiLV4rY3nqsCGZp3c0KLWQxXw
                @Override // java.lang.Runnable
                fun run() {
                    `m8706onAnimationEnd$lambda0`(this@FullScreenPlayer)
                }
            })
        }
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onAnimationEnd$lambda-0  reason: not valid java name */
        fun `m8706onAnimationEnd$lambda0`(`this$0`: FullScreenPlayer) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            `this$0`.resetFastForwardText()
            val constraintLayout: ConstraintLayout? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.player_center_menu) as ConstraintLayout?
            if (constraintLayout != null) {
                constraintLayout.setVisibility(if (`this$0`.isShowing() xor true) 8 else 0)
            }
            val frameLayout: FrameLayout? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.player_ffwd_holder) as FrameLayout?
            if (frameLayout == null) {
                return
            }
            frameLayout.setAlpha(if (`this$0`.isShowing()) 1.0f else 0.0f)
        }
    }
}