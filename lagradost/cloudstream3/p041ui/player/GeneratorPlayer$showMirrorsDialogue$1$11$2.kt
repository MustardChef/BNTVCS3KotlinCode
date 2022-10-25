package com.lagradost.cloudstream3.p041ui.player

import android.content.Context
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: GeneratorPlayer.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
    m107d2 = ["<anonymous>", "", "it", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.player.GeneratorPlayer$showMirrorsDialogue$1$11$2 */ /* loaded from: classes3.dex */
class `GeneratorPlayer$showMirrorsDialogue$1$11$2` constructor(
    sharedPreferences: SharedPreferences,
    context: Context,
    strArr: Array<String?>,
    generatorPlayer: GeneratorPlayer,
    z: Boolean
) : Lambda<Any?>(1), Function1<Integer, Unit> {
    /* synthetic */ val `$ctx`: Context
    /* synthetic */ val `$isPlaying`: Boolean
    /* synthetic */ val `$prefValues`: Array<String?>
    /* synthetic */ val `$settingsManager`: SharedPreferences
    /* synthetic */ val `this$0`: GeneratorPlayer

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$settingsManager` = sharedPreferences
        `$ctx` = context
        `$prefValues` = strArr
        `this$0` = generatorPlayer
        `$isPlaying` = z
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(num: Integer) {
        invoke(num.intValue())
        return Unit.INSTANCE
    }

    override fun invoke(i: Int) {
        `$settingsManager`.edit()
            .putString(`$ctx`.getString(R.string.subtitles_encoding_key), `$prefValues`.get(i))
            .apply()
        val companion: CustomDecoder.Companion = CustomDecoder.Companion.Companion
        val ctx: Context = `$ctx`
        Intrinsics.checkNotNullExpressionValue(ctx, "ctx")
        companion.updateForcedEncoding(ctx)
        GeneratorPlayer.Companion.`m8725showMirrorsDialogue$lambda30$dismiss`(
            `$isPlaying`,
            `this$0`
        )
        `this$0`.getPlayer().seekTime(-1L)
    }
}