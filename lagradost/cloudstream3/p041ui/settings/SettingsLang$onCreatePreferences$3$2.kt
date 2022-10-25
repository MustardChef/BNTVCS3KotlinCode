package com.lagradost.cloudstream3.p041ui.settings

import android.content.SharedPreferences

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: SettingsLang.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
    m107d2 = ["<anonymous>", "", "languageIndex", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.settings.SettingsLang$onCreatePreferences$3$2 */ /* loaded from: classes4.dex */
class `SettingsLang$onCreatePreferences$3$2` constructor(/* synthetic */val `$languageCodes`: List<String>, /* synthetic */
                                                                        val `this$0`: SettingsLang,
                                                                        sharedPreferences: SharedPreferences
) : Lambda<Any?>(1), Function1<Integer, Unit> {
    /* synthetic */ val `$settingsManager`: SharedPreferences

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$settingsManager` = sharedPreferences
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(num: Integer) {
        invoke(num.intValue())
        return Unit.INSTANCE
    }

    override fun invoke(i: Int) {
        try {
            val str: String = `$languageCodes`.get(i)
            CommonActivity.INSTANCE.setLocale(`this$0`.getActivity(), str)
            `$settingsManager`.edit().putString(`this$0`.getString(R.string.locale_key), str)
                .apply()
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                activity.recreate()
            }
        } catch (e: Exception) {
            ArchComponentExt.logError(e)
        }
    }
}