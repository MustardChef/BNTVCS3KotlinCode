package com.lagradost.cloudstream3.p041ui.settings

import com.lagradost.cloudstream3.AcraApplication
import java.util.ArrayList
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: SettingsGeneral.kt */
@Metadata(
    m108d1 = ["\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"],
    m107d2 = ["<anonymous>", "", "indexes", "", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.settings.SettingsGeneral$onCreatePreferences$showDelete$3 */ /* loaded from: classes4.dex */
class `SettingsGeneral$onCreatePreferences$showDelete$3` constructor(list: List<CustomSite>) :
    Lambda<Any?>(1), Function1<List<Integer?>, Unit> {
    /* synthetic */ val `$current`: List<CustomSite>

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$current` = list
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(list: List<Integer?>) {
        invoke2(list as List<Integer?>)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(indexes: List<Integer?>) {
        Intrinsics.checkNotNullParameter(indexes, "indexes")
        val list: List<CustomSite> = `$current`
        val list2: List<Integer?> = indexes
        val arrayList: ArrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10))
        for (number: Number in list2) {
            arrayList.add(list.get(number.intValue()))
        }
        list.removeAll(arrayList)
        val companion: AcraApplication.Companion = AcraApplication.Companion
        val array: Array<Object> = `$current`.toArray(arrayOfNulls<CustomSite>(0))
        Objects.requireNonNull(
            array,
            "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
        )
        companion.setKey(DataStoreKt.USER_PROVIDER_API, array)
    }
}