package com.lagradost.cloudstream3.p041ui.home

import java.util.ArrayList
import kotlin.coroutines.Continuation

/* compiled from: HomeViewModel.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/utils/VideoDownloadHelper\$ResumeWatching;", "Lkotlinx/coroutines/CoroutineScope;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.ui.home.HomeViewModel\$loadResumeWatching$1\$resumeWatching$1",
    m98f = "HomeViewModel.kt",
    m97i = [],
    m96l = [],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
)
/* renamed from: com.lagradost.cloudstream3.ui.home.HomeViewModel$loadResumeWatching$1$resumeWatching$1 */ /* loaded from: classes3.dex */
internal class `HomeViewModel$loadResumeWatching$1$resumeWatching$1`  /* JADX INFO: Access modifiers changed from: package-private */
constructor(continuation: Continuation<in `HomeViewModel$loadResumeWatching$1$resumeWatching$1`?>?) :
    SuspendLambda(2, continuation),
    Function2<CoroutineScope, Continuation<in List<ResumeWatching?>?>?, Object> {
    var label: Int = 0

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        return `HomeViewModel$loadResumeWatching$1$resumeWatching$1`(continuation)
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */  override fun invoke(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in List<ResumeWatching?>?>?
    ): Object {
        return invoke2(coroutineScope, continuation as Continuation<in List<ResumeWatching?>?>?)
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in List<ResumeWatching?>?>?
    ): Object {
        return (create(
            coroutineScope,
            continuation
        ) as `HomeViewModel$loadResumeWatching$1$resumeWatching$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun invokeSuspend(obj: Object): Object {
        IntrinsicsKt.getCOROUTINE_SUSPENDED()
        if (label == 0) {
            ResultKt.throwOnFailure(obj)
            val allResumeStateIds: List<Integer>? = DataStoreHelper.INSTANCE.allResumeStateIds
            if (allResumeStateIds != null) {
                val arrayList: ArrayList = ArrayList()
                for (number: Number in allResumeStateIds) {
                    val lastWatched: ResumeWatching? =
                        DataStoreHelper.INSTANCE.getLastWatched(boxing.boxInt(number.intValue()))
                    if (lastWatched != null) {
                        arrayList.add(lastWatched)
                    }
                }
                return CollectionsKt.sortedWith(arrayList, object : Comparator() {
                    // from class: com.lagradost.cloudstream3.ui.home.HomeViewModel$loadResumeWatching$1$resumeWatching$1$invokeSuspend$$inlined$sortedBy$1
                    @Override // java.util.Comparator
                    fun compare(t: T, t2: T): Int {
                        return ComparisonsKt.compareValues(
                            Long.valueOf(-(t as ResumeWatching).updateTime),
                            Long.valueOf(-(t2 as ResumeWatching).updateTime)
                        )
                    }
                })
            }
            return null
        }
        throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
    }
}