package com.lagradost.cloudstream3.p041ui

import java.util.List
import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: APIRepository.kt */
@Metadata(
    m108d1 = ["\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/SearchResponse;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.ui.APIRepository\$quickSearch$2",
    m98f = "APIRepository.kt",
    m97i = [],
    m96l = [73],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* renamed from: com.lagradost.cloudstream3.ui.APIRepository$quickSearch$2 */ /* loaded from: classes.dex */
class `APIRepository$quickSearch$2`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(/* synthetic */
    val `this$0`: APIRepository, /* synthetic */
    val `$query`: String, continuation: Continuation<in `APIRepository$quickSearch$2`?>?
) : SuspendLambda(1, continuation), Function1<Continuation<in List<SearchResponse?>?>?, Object> {
    var label: Int = 0

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun create(continuation: Continuation<*>?): Continuation<Unit> {
        return `APIRepository$quickSearch$2`(`this$0`, `$query`, continuation)
    }

    @Override // kotlin.jvm.functions.Function1
    public override fun invoke(continuation: Continuation<in List<SearchResponse?>?>?): Object {
        return (create(continuation) as `APIRepository$quickSearch$2`).invokeSuspend(Unit.INSTANCE)
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun invokeSuspend(obj: Object): Object {
        var obj: Object = obj
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i: Int = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            label = 1
            obj = `this$0`.getApi().quickSearch(`$query`, this)
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