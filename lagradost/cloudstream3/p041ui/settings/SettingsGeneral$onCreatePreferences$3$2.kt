package com.lagradost.cloudstream3.p041ui.settings

import android.content.Context

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: SettingsGeneral.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
    m107d2 = ["<anonymous>", "", "it", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.settings.SettingsGeneral$onCreatePreferences$3$2 */ /* loaded from: classes4.dex */
class `SettingsGeneral$onCreatePreferences$3$2` constructor(
    sharedPreferences: SharedPreferences,
    settingsGeneral: SettingsGeneral,
    iArr: IntArray
) : Lambda<Any?>(1), Function1<Integer, Unit> {
    /* synthetic */ val `$prefValues`: IntArray
    /* synthetic */ val `$settingsManager`: SharedPreferences
    /* synthetic */ val `this$0`: SettingsGeneral

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$settingsManager` = sharedPreferences
        `this$0` = settingsGeneral
        `$prefValues` = iArr
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(num: Integer) {
        invoke(num.intValue())
        return Unit.INSTANCE
    }

    override fun invoke(i: Int) {
        `$settingsManager`.edit()
            .putInt(`this$0`.getString(R.string.dns_pref), `$prefValues`.get(i)).apply()
        var context: Context? = `this$0`.getContext()
        if (context == null) {
            context = AcraApplication.Companion.context
        }
        if (context != null) {
            RequestsHelper.initClient(MainActivityKt.getApp(), context)
        }
    }
}