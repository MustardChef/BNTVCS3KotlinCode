package com.lagradost.cloudstream3.p041ui.player

import android.app.Activity
import kotlin.jvm.internal.Intrinsics

/* compiled from: PlayerPipHelper.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/player/PlayerPipHelper;", "", "()V", "Companion", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.player.PlayerPipHelper */ /* loaded from: classes3.dex */
object PlayerPipHelper {
    val Companion: Companion = Companion(null)

    /* compiled from: PlayerPipHelper.kt */
    @Metadata(
        m108d1 = ["\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J*\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\u000c\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0003J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0013"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/player/PlayerPipHelper\$Companion;", "", "()V", "getPen", "Landroid/app/PendingIntent;", "activity", "Landroid/app/Activity;", "code", "", "getRemoteAction", "Landroid/app/RemoteAction;", "id", "title", "event", "Lcom/lagradost/cloudstream3/ui/player/CSPlayerEvent;", "updatePIPModeActions", "", "isPlaying", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.player.PlayerPipHelper$Companion */ /* loaded from: classes3.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        private fun getPen(activity: Activity, i: Int): PendingIntent {
            if (Build.VERSION.SDK_INT >= 23) {
                val broadcast: PendingIntent = PendingIntent.getBroadcast(
                    activity,
                    i,
                    Intent(IPlayerKt.ACTION_MEDIA_CONTROL).putExtra(
                        IPlayerKt.EXTRA_CONTROL_TYPE,
                        i
                    ),
                    67108864
                )
                Intrinsics.checkNotNullExpressionValue(
                    broadcast,
                    "{\n                Pendin…          )\n            }"
                )
                return broadcast
            }
            val broadcast2: PendingIntent = PendingIntent.getBroadcast(
                activity,
                i,
                Intent(IPlayerKt.ACTION_MEDIA_CONTROL).putExtra(IPlayerKt.EXTRA_CONTROL_TYPE, i),
                0
            )
            Intrinsics.checkNotNullExpressionValue(
                broadcast2,
                "{\n                Pendin…          )\n            }"
            )
            return broadcast2
        }

        private fun getRemoteAction(
            activity: Activity,
            i: Int,
            i2: Int,
            cSPlayerEvent: CSPlayerEvent
        ): RemoteAction {
            val string: String = activity.getString(i2)
            Intrinsics.checkNotNullExpressionValue(string, "activity.getString(title)")
            val str: String = string
            return RemoteAction(
                Icon.createWithResource(activity, i),
                str,
                str,
                getPen(activity, cSPlayerEvent.getValue())
            )
        }

        fun updatePIPModeActions(activity: Activity, z: Boolean) {
            Intrinsics.checkNotNullParameter(activity, "activity")
            val arrayList: ArrayList = ArrayList()
            arrayList.add(
                getRemoteAction(
                    activity,
                    R.drawable.go_back_30,
                    R.string.go_back_30,
                    CSPlayerEvent.SeekBack
                )
            )
            if (z) {
                arrayList.add(
                    getRemoteAction(
                        activity,
                        R.drawable.netflix_pause,
                        R.string.pause,
                        CSPlayerEvent.Pause
                    )
                )
            } else {
                arrayList.add(
                    getRemoteAction(
                        activity,
                        R.drawable.ic_baseline_play_arrow_24,
                        R.string.pause,
                        CSPlayerEvent.Play
                    )
                )
            }
            arrayList.add(
                getRemoteAction(
                    activity,
                    R.drawable.go_forward_30,
                    R.string.go_forward_30,
                    CSPlayerEvent.SeekForward
                )
            )
            activity.setPictureInPictureParams(Builder().setActions(arrayList).build())
        }
    }
}