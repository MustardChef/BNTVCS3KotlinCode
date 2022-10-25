package com.lagradost.cloudstream3.p041ui.settings

import android.content.SharedPreferences
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: SettingsLang.kt */
@Metadata(
    m108d1 = ["\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"],
    m107d2 = ["<anonymous>", "", "selectedList", "", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.settings.SettingsLang$onCreatePreferences$4$1$3 */ /* loaded from: classes4.dex */
class `SettingsLang$onCreatePreferences$4$1$3` constructor(
    sharedPreferences: SharedPreferences,
    settingsLang: SettingsLang,
    list: List<Tuples<String, String>>
) : Lambda<Any?>(1), Function1<List<Integer?>, Unit> {
    /* synthetic */ val `$names`: List<Tuples<String, String>>
    /* synthetic */ val `$settingsManager`: SharedPreferences
    /* synthetic */ val `this$0`: SettingsLang

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$settingsManager` = sharedPreferences
        `this$0` = settingsLang
        `$names` = list
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(list: List<Integer?>) {
        invoke2(list as List<Integer?>)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(selectedList: List<Integer?>) {
        Intrinsics.checkNotNullParameter(selectedList, "selectedList")
        val edit: SharedPreferences.Editor = `$settingsManager`.edit()
        val string: String = `this$0`.getString(R.string.provider_lang_key)
        val list: List<Integer?> = selectedList
        val list2: List<Tuples<String, String>> = `$names`
        val arrayList: ArrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10))
        for (number: Number in list) {
            arrayList.add(list2.get(number.intValue()).getFirst())
        }
        edit.putStringSet(string, CollectionsKt.toMutableSet(arrayList)).apply()
    }
}