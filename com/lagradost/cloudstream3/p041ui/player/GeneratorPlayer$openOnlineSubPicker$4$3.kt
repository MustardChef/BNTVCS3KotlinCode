package com.lagradost.cloudstream3.p041ui.player

import android.app.Dialog

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: GeneratorPlayer.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
    m107d2 = ["<anonymous>", "", FirebaseAnalytics.Param.INDEX, "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.player.GeneratorPlayer$openOnlineSubPicker$4$3 */ /* loaded from: classes3.dex */
class `GeneratorPlayer$openOnlineSubPicker$4$3` constructor(
    objectRef: ObjectRef<String?>,
    list: List<String>,
    dialog: Dialog
) : Lambda<Any?>(1), Function1<Integer, Unit> {
    /* synthetic */ val `$currentLanguageTwoLetters`: ObjectRef<String>
    /* synthetic */ val `$dialog`: Dialog
    /* synthetic */ val `$lang639_1`: List<String>

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$currentLanguageTwoLetters` = objectRef
        `$lang639_1` = list
        `$dialog` = dialog
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(num: Integer) {
        invoke(num.intValue())
        return Unit.INSTANCE
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object] */
    override fun invoke(i: Int) {
        `$currentLanguageTwoLetters`.element = `$lang639_1`.get(i)
        (`$dialog`.findViewById(C4761R.C4764id.subtitles_search) as SearchView).setQuery(
            (`$dialog`.findViewById(
                C4761R.C4764id.subtitles_search
            ) as SearchView).getQuery(), true
        )
    }
}