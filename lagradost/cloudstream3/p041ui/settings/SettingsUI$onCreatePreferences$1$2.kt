package com.lagradost.cloudstream3.p041ui.settings

import android.content.SharedPreferences
import androidx.preference.Preference
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: SettingsUI.kt */
@Metadata(
    m108d1 = ["\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"],
    m107d2 = ["<anonymous>", "", "list", "", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.settings.SettingsUI$onCreatePreferences$1$2 */ /* loaded from: classes4.dex */
class `SettingsUI$onCreatePreferences$1$2` constructor(
    sharedPreferences: SharedPreferences,
    strArr: Array<String?>,
    preference: Preference
) : Lambda<Any?>(1), Function1<List<Integer?>, Unit> {
    /* synthetic */ val `$it`: Preference
    /* synthetic */ val `$keys`: Array<String?>
    /* synthetic */ val `$settingsManager`: SharedPreferences

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$settingsManager` = sharedPreferences
        `$keys` = strArr
        `$it` = preference
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(list: List<Integer?>) {
        invoke2(list as List<Integer?>)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(list: List<Integer?>) {
        Intrinsics.checkNotNullParameter(list, "list")
        val edit: SharedPreferences.Editor = `$settingsManager`.edit()
        val strArr: Array<String?> = `$keys`
        val length: Int = strArr.size
        for (i in 0 until length) {
            edit.putBoolean(strArr.get(i), list.contains(Integer.valueOf(i)))
        }
        edit.apply()
        SearchResultBuilder.Companion.INSTANCE.updateCache(`$it`.getContext())
    }
}