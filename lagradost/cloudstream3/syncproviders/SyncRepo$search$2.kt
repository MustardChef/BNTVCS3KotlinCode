package com.lagradost.cloudstream3.syncproviders

import java.util.List
import kotlin.coroutines.Continuation

/* compiled from: SyncRepo.kt */
@Metadata(
    m108d1 = ["\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncSearchResult;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.syncproviders.SyncRepo\$search$2",
    m98f = "SyncRepo.kt",
    m97i = [],
    m96l = [27],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
)
/* loaded from: classes3.dex */
internal class `SyncRepo$search$2`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */(/* synthetic */
    val `this$0`: SyncRepo, /* synthetic */
    val `$query`: String?, continuation: Continuation<in `SyncRepo$search$2`?>?
) : SuspendLambda(1, continuation), Function1<Continuation<in List<SyncSearchResult?>?>?, Object> {
    var label = 0

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(continuation: Continuation<*>?): Continuation<Unit> {
        return `SyncRepo$search$2`(`this$0`, `$query`, continuation)
    }

    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override fun invoke(continuation: Continuation<in List<SyncSearchResult?>?>?): Object {
        return invoke2(continuation as Continuation<in List<SyncSearchResult?>?>?)
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(continuation: Continuation<in List<SyncSearchResult?>?>?): Object {
        return (create(continuation) as `SyncRepo$search$2`).invokeSuspend(Unit.INSTANCE)
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        var obj: Object? = obj
        val syncAPI: SyncAPI?
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            syncAPI = `this$0`.repo
            label = 1
            obj = syncAPI.search(`$query`, this)
            if (obj === coroutine_suspended) {
                return coroutine_suspended
            }
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            ResultKt.throwOnFailure(obj)
        }
        val list: List? = obj
        if (list != null) {
            return list
        }
        throw ErrorLoadingException(null, 1, null)
    }
}