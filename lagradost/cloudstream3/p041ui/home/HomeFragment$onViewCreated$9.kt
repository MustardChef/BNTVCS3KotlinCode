package com.lagradost.cloudstream3.p041ui.home

import android.content.Context
import kotlin.jvm.internal.Intrinsics

/* compiled from: HomeFragment.kt */
@Metadata(
    m108d1 = ["\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u001e\u0010\u0002\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\n¢\u0006\u0002\b\u0006"],
    m107d2 = ["<anonymous>", "", "availableWatchStatusTypes", "Lkotlin/Pair;", "Ljava/util/EnumSet;", "Lcom/lagradost/cloudstream3/ui/WatchType;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.home.HomeFragment$onViewCreated$9 */ /* loaded from: classes3.dex */
internal class `HomeFragment$onViewCreated$9` constructor(/* synthetic */val `this$0`: HomeFragment,
                                                                         list: List<Tuples<out MaterialButton, out WatchType>?>
) : Lambda<Any?>(1), Function1<Tuples<out EnumSet<WatchType?>?, out EnumSet<WatchType?>?>, Unit> {
    /* synthetic */ val `$toggleList`: List<Tuples<MaterialButton, WatchType>?>

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$toggleList` = list
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(tuples: Tuples<out EnumSet<WatchType?>?, out EnumSet<WatchType?>?>) {
        invoke2(tuples)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(availableWatchStatusTypes: Tuples<out EnumSet<WatchType?>?, out EnumSet<WatchType?>?>) {
        Intrinsics.checkNotNullParameter(availableWatchStatusTypes, "availableWatchStatusTypes")
        val context: Context? = `this$0`.getContext()
        if (context != null) {
            val dataStore: DataStore = DataStore.INSTANCE
            val first: EnumSet<WatchType?>? = availableWatchStatusTypes.getFirst()
            val arrayList: ArrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(first, 10))
            for (watchType: WatchType in first) {
                arrayList.add(Integer.valueOf(watchType.getInternalId()))
            }
            dataStore.setKey(
                context,
                HomeFragmentKt.HOME_BOOKMARK_VALUE_LIST,
                CollectionsKt.toIntArray(arrayList)
            )
        }
        for (tuples: Tuples<MaterialButton?, WatchType?> in `$toggleList`) {
            val second: WatchType? = tuples.getSecond()
            val first2: MaterialButton? = tuples.getFirst()
            if (first2 != null) {
                first2.setVisibility(
                    if (availableWatchStatusTypes.getSecond().contains(second)) 0 else 8
                )
                first2.setSelected(availableWatchStatusTypes.getFirst().contains(second))
            }
        }
    }
}