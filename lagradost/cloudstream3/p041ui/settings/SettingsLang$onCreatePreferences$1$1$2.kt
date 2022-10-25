package com.lagradost.cloudstream3.p041ui.settings

import android.content.SharedPreferences
import com.lagradost.cloudstream3.p041ui.APIRepository
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: SettingsLang.kt */
@Metadata(
    m108d1 = ["\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"],
    m107d2 = ["<anonymous>", "", "selectedList", "", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.settings.SettingsLang$onCreatePreferences$1$1$2 */ /* loaded from: classes4.dex */
class `SettingsLang$onCreatePreferences$1$1$2` constructor(
    sharedPreferences: SharedPreferences,
    settingsLang: SettingsLang,
    dubStatusArr: Array<DubStatus?>,
    list: List<String>
) : Lambda<Any?>(1), Function1<List<Integer?>, Unit> {
    /* synthetic */ val `$dublist`: Array<DubStatus?>
    /* synthetic */ val `$names`: List<String>
    /* synthetic */ val `$settingsManager`: SharedPreferences
    /* synthetic */ val `this$0`: SettingsLang

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$settingsManager` = sharedPreferences
        `this$0` = settingsLang
        `$dublist` = dubStatusArr
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
        val companion: APIRepository.Companion = APIRepository.Companion.Companion
        val list: List<Integer?> = selectedList
        val dubStatusArr: Array<DubStatus?> = `$dublist`
        val arrayList: ArrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10))
        for (number: Number in list) {
            arrayList.add(dubStatusArr.get(number.intValue()))
        }
        companion.setDubStatusActive(CollectionsKt.toHashSet(arrayList))
        val edit: SharedPreferences.Editor = `$settingsManager`.edit()
        val string: String = `this$0`.getString(R.string.display_sub_key)
        val list2: List<String> = `$names`
        val arrayList2: ArrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10))
        for (number2: Number in list) {
            arrayList2.add(list2.get(number2.intValue()))
        }
        edit.putStringSet(string, CollectionsKt.toMutableSet(arrayList2)).apply()
    }
}