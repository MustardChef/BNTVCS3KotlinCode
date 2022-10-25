package com.lagradost.cloudstream3.p041ui.player

import java.util.List

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: FullScreenPlayer.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
    m107d2 = ["<anonymous>", "", FirebaseAnalytics.Param.INDEX, "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.player.FullScreenPlayer$showSpeedDialog$1$2 */ /* loaded from: classes3.dex */
class `FullScreenPlayer$showSpeedDialog$1$2`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(/* synthetic */
    val `this$0`: FullScreenPlayer, /* synthetic */
    val `$speedsNumbers`: List<Float>
) : Lambda<Any?>(1), Function1<Integer, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(num: Integer) {
        invoke(num.intValue())
        return Unit.INSTANCE
    }

    override fun invoke(i: Int) {
        var activity: FragmentActivity?
        if (`this$0`.isFullScreenPlayer() && (`this$0`.getActivity()
                .also({ activity = it })) != null
        ) {
            UIHelper.INSTANCE.hideSystemUI(activity)
        }
        `this$0`.setPlayBackSpeed(`$speedsNumbers`.get(i).floatValue())
    }
}