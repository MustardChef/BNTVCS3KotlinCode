package com.lagradost.cloudstream3.p041ui.home

import java.util.ArrayList
import kotlin.coroutines.Continuation

/* compiled from: HomeViewModel.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/utils/DataStoreHelper\$BookmarkedData;", "Lkotlinx/coroutines/CoroutineScope;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.ui.home.HomeViewModel\$loadStoredData$1\$list$1",
    m98f = "HomeViewModel.kt",
    m97i = [],
    m96l = [],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
)
/* renamed from: com.lagradost.cloudstream3.ui.home.HomeViewModel$loadStoredData$1$list$1 */ /* loaded from: classes3.dex */
internal class `HomeViewModel$loadStoredData$1$list$1` constructor(
    list: List<Tuples<Integer?, out WatchType>?>,
    enumSet: EnumSet<WatchType?>,
    continuation: Continuation<in `HomeViewModel$loadStoredData$1$list$1`?>?
) : SuspendLambda(2, continuation),
    Function2<CoroutineScope, Continuation<in List<BookmarkedData?>?>?, Object> {
    /* synthetic */ val `$watchPrefNotNull`: EnumSet<WatchType>
    /* synthetic */ val `$watchStatusIds`: List<Tuples<Integer?, WatchType>?>
    var label: Int = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$watchStatusIds` = list
        `$watchPrefNotNull` = enumSet
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        return `HomeViewModel$loadStoredData$1$list$1`(
            `$watchStatusIds`,
            `$watchPrefNotNull`,
            continuation
        )
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */  override fun invoke(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in List<BookmarkedData?>?>?
    ): Object {
        return invoke2(coroutineScope, continuation as Continuation<in List<BookmarkedData?>?>?)
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in List<BookmarkedData?>?>?
    ): Object {
        return (create(
            coroutineScope,
            continuation
        ) as `HomeViewModel$loadStoredData$1$list$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun invokeSuspend(obj: Object): Object {
        IntrinsicsKt.getCOROUTINE_SUSPENDED()
        if (label != 0) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        }
        ResultKt.throwOnFailure(obj)
        val enumSet: EnumSet<WatchType> = `$watchPrefNotNull`
        val arrayList: ArrayList<Tuples<*, *>> = ArrayList()
        for (obj2: Object in `$watchStatusIds`) {
            if (enumSet.contains((obj2 as Tuples<*, *>).getSecond())) {
                arrayList.add(obj2)
            }
        }
        val arrayList2: ArrayList = ArrayList()
        for (tuples: Tuples<*, *> in arrayList) {
            val bookmarkedData: BookmarkedData? =
                DataStoreHelper.INSTANCE.getBookmarkedData(tuples.getFirst() as Integer?)
            if (bookmarkedData != null) {
                arrayList2.add(bookmarkedData)
            }
        }
        return CollectionsKt.sortedWith(arrayList2, object : Comparator() {
            // from class: com.lagradost.cloudstream3.ui.home.HomeViewModel$loadStoredData$1$list$1$invokeSuspend$$inlined$sortedBy$1
            @Override // java.util.Comparator
            fun compare(t: T, t2: T): Int {
                return ComparisonsKt.compareValues(
                    Long.valueOf(-(t as BookmarkedData).latestUpdatedTime),
                    Long.valueOf(-(t2 as BookmarkedData).latestUpdatedTime)
                )
            }
        })
    }
}