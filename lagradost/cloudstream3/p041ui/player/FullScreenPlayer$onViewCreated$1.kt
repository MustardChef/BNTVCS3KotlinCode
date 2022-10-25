package com.lagradost.cloudstream3.p041ui.player

import android.content.Context
import kotlin.jvm.functions.Functions
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: FullScreenPlayer.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
    m107d2 = ["<anonymous>", "", "eventType", "Lcom/lagradost/cloudstream3/ui/player/PlayerEventType;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.player.FullScreenPlayer$onViewCreated$1 */ /* loaded from: classes3.dex */
class `FullScreenPlayer$onViewCreated$1` constructor(/* synthetic */val `this$0`: FullScreenPlayer,
                                                                    view: View
) : Lambda<Any?>(1), Function1<PlayerEventType, Unit> {
    /* synthetic */ val `$view`: View

    /* compiled from: FullScreenPlayer.kt */
    @Metadata(
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.player.FullScreenPlayer$onViewCreated$1$WhenMappings */ /* loaded from: classes3.dex */
    /* synthetic */
    object WhenMappings {
        /* synthetic */ val `$EnumSwitchMapping$0`: IntArray

        init {
            val iArr: IntArray = IntArray(PlayerEventType.values().size)
            com.lagradost.cloudstream3.p041ui.player.iArr.get(PlayerEventType.Lock.ordinal()) = 1
            com.lagradost.cloudstream3.p041ui.player.iArr.get(PlayerEventType.NextEpisode.ordinal()) =
                2
            com.lagradost.cloudstream3.p041ui.player.iArr.get(PlayerEventType.Pause.ordinal()) = 3
            com.lagradost.cloudstream3.p041ui.player.iArr.get(PlayerEventType.PlayPauseToggle.ordinal()) =
                4
            com.lagradost.cloudstream3.p041ui.player.iArr.get(PlayerEventType.Play.ordinal()) = 5
            com.lagradost.cloudstream3.p041ui.player.iArr.get(PlayerEventType.Resize.ordinal()) = 6
            com.lagradost.cloudstream3.p041ui.player.iArr.get(PlayerEventType.PrevEpisode.ordinal()) =
                7
            com.lagradost.cloudstream3.p041ui.player.iArr.get(PlayerEventType.SeekForward.ordinal()) =
                8
            com.lagradost.cloudstream3.p041ui.player.iArr.get(PlayerEventType.ShowSpeed.ordinal()) =
                9
            com.lagradost.cloudstream3.p041ui.player.iArr.get(PlayerEventType.SeekBack.ordinal()) =
                10
            com.lagradost.cloudstream3.p041ui.player.iArr.get(PlayerEventType.ToggleMute.ordinal()) =
                11
            com.lagradost.cloudstream3.p041ui.player.iArr.get(PlayerEventType.ToggleHide.ordinal()) =
                12
            com.lagradost.cloudstream3.p041ui.player.iArr.get(PlayerEventType.ShowMirrors.ordinal()) =
                13
            com.lagradost.cloudstream3.p041ui.player.iArr.get(PlayerEventType.SearchSubtitlesOnline.ordinal()) =
                14
            `$EnumSwitchMapping$0` = com.lagradost.cloudstream3.p041ui.player.iArr
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$view` = view
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(playerEventType: PlayerEventType) {
        invoke2(playerEventType)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(eventType: PlayerEventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType")
        when (WhenMappings.`$EnumSwitchMapping$0`.get(eventType.ordinal())) {
            1 -> {
                `this$0`.toggleLock()
                return
            }
            2 -> {
                `this$0`.getPlayer().handleEvent(CSPlayerEvent.NextEpisode)
                return
            }
            3 -> {
                `this$0`.getPlayer().handleEvent(CSPlayerEvent.Pause)
                return
            }
            4 -> {
                `this$0`.getPlayer().handleEvent(CSPlayerEvent.PlayPauseToggle)
                return
            }
            5 -> {
                `this$0`.getPlayer().handleEvent(CSPlayerEvent.Play)
                return
            }
            6 -> {
                `this$0`.nextResize()
                return
            }
            7 -> {
                `this$0`.getPlayer().handleEvent(CSPlayerEvent.PrevEpisode)
                return
            }
            8 -> {
                `this$0`.getPlayer().handleEvent(CSPlayerEvent.SeekForward)
                return
            }
            9 -> {
                `this$0`.showSpeedDialog()
                return
            }
            10 -> {
                `this$0`.getPlayer().handleEvent(CSPlayerEvent.SeekBack)
                return
            }
            11 -> {
                `this$0`.getPlayer().handleEvent(CSPlayerEvent.ToggleMute)
                return
            }
            12 -> {
                `this$0`.onClickChange()
                return
            }
            13 -> {
                `this$0`.showMirrorsDialogue()
                return
            }
            14 -> {
                if (GeneratorPlayer.Companion.Companion.getSubsProvidersIsActive()) {
                    val fullScreenPlayer: FullScreenPlayer = `this$0`
                    val context: Context = `$view`.getContext()
                    Intrinsics.checkNotNullExpressionValue(context, "view.context")
                    fullScreenPlayer.openOnlineSubPicker(context, null, C48681.INSTANCE)
                    return
                }
                return
            }
            else -> return
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: FullScreenPlayer.kt */
    @Metadata(
        m108d1 = ["\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"],
        m107d2 = ["<anonymous>", "", "invoke"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.player.FullScreenPlayer$onViewCreated$1$1 */ /* loaded from: classes3.dex */
    class C48681 internal constructor() : Lambda<Any?>(0), Functions<Unit> {
        @Override // kotlin.jvm.functions.Functions
                /* renamed from: invoke  reason: avoid collision after fix types in other method */    fun invoke2() {
        }

        @Override // kotlin.jvm.functions.Functions
        public /* bridge */ /* synthetic */  override fun invoke() {
            invoke2()
            return Unit.INSTANCE
        }

        companion object {
            val INSTANCE: C48681 = C48681()
        }
    }
}