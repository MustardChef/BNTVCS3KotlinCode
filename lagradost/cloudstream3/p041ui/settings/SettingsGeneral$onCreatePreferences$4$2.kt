package com.lagradost.cloudstream3.p041ui.settings

import android.content.SharedPreferences

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: SettingsGeneral.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
    m107d2 = ["<anonymous>", "", "it", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.settings.SettingsGeneral$onCreatePreferences$4$2 */ /* loaded from: classes4.dex */
class `SettingsGeneral$onCreatePreferences$4$2` constructor(/* synthetic */val `$dirs`: List<String?>, /* synthetic */
                                                                           val `this$0`: SettingsGeneral,
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
        val activityResultLauncher: ActivityResultLauncher<*>
        if (i == `$dirs`.size()) {
            try {
                activityResultLauncher = `this$0`.pathPicker
                activityResultLauncher.launch(Uri.EMPTY)
                return
            } catch (e: Exception) {
                ArchComponentExt.logError(e)
                return
            }
        }
        `$settingsManager`.edit()
            .putString(`this$0`.getString(R.string.download_path_key), `$dirs`.get(i)).apply()
        `$settingsManager`.edit()
            .putString(`this$0`.getString(R.string.download_path_pref), `$dirs`.get(i)).apply()
    }
}