package com.lagradost.cloudstream3.p041ui.home

import java.util.ArrayList
import kotlin.coroutines.Continuation

/* compiled from: HomeViewModel.kt */
@Metadata(
    m108d1 = ["\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0018\u00010\u0001*\u00020\u0005H\u008a@"],
    m107d2 = ["<anonymous>", "", "Lkotlin/Pair;", "", "Lcom/lagradost/cloudstream3/ui/WatchType;", "Lkotlinx/coroutines/CoroutineScope;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.ui.home.HomeViewModel\$loadStoredData$1\$watchStatusIds$1",
    m98f = "HomeViewModel.kt",
    m97i = [],
    m96l = [],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
)
/* renamed from: com.lagradost.cloudstream3.ui.home.HomeViewModel$loadStoredData$1$watchStatusIds$1 */ /* loaded from: classes3.dex */
internal class `HomeViewModel$loadStoredData$1$watchStatusIds$1`  /* JADX INFO: Access modifiers changed from: package-private */
constructor(continuation: Continuation<in `HomeViewModel$loadStoredData$1$watchStatusIds$1`?>?) :
    SuspendLambda(2, continuation),
    Function2<CoroutineScope, Continuation<in List<Tuples<out Integer?, out WatchType?>?>?>?, Object> {
    var label: Int = 0

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        return `HomeViewModel$loadStoredData$1$watchStatusIds$1`(continuation)
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */  override fun invoke(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in List<Tuples<out Integer?, out WatchType?>?>?>?
    ): Object {
        return invoke2(
            coroutineScope,
            continuation as Continuation<in List<Tuples<Integer?, out WatchType?>?>?>?
        )
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in List<Tuples<Integer?, out WatchType?>?>?>?
    ): Object {
        return (create(
            coroutineScope,
            continuation
        ) as `HomeViewModel$loadStoredData$1$watchStatusIds$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun invokeSuspend(obj: Object): Object {
        IntrinsicsKt.getCOROUTINE_SUSPENDED()
        if (label == 0) {
            ResultKt.throwOnFailure(obj)
            val allWatchStateIds: List<Integer>? = DataStoreHelper.INSTANCE.allWatchStateIds
            if (allWatchStateIds != null) {
                val list: List<Integer> = allWatchStateIds
                val arrayList: ArrayList =
                    ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10))
                for (number: Number in list) {
                    val intValue: Int = number.intValue()
                    arrayList.add(
                        Tuples<Any?, Any?>(
                            boxing.boxInt(intValue),
                            DataStoreHelper.INSTANCE.getResultWatchState(intValue)
                        )
                    )
                }
                return arrayList
            }
            return null
        }
        throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
    }
}