package com.lagradost.cloudstream3.utils

import java.util.Map
import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: M3u8Helper.kt */
@Metadata(
    m108d1 = ["\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"],
    m107d2 = ["<anonymous>", "Lcom/lagradost/nicehttp/NiceResponse;", "Lkotlinx/coroutines/CoroutineScope;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.utils.M3u8Helper\$hlsYield\$encryptionKeyResponse$1",
    m98f = "M3u8Helper.kt",
    m97i = [],
    m96l = [bqk.f6576bj],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* loaded from: classes4.dex */
class `M3u8Helper$hlsYield$encryptionKeyResponse$1`(
    objectRef: ObjectRef<String?>,
    map: Map<String, String>,
    continuation: Continuation<in `M3u8Helper$hlsYield$encryptionKeyResponse$1`?>?
) : SuspendLambda(2, continuation),
    Function2<CoroutineScope, Continuation<in NiceResponse?>?, Object> {
    /* synthetic */ val `$encryptionUri`: ObjectRef<String>
    /* synthetic */ val `$headers`: Map<String, String>
    var label = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$encryptionUri` = objectRef
        `$headers` = map
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        return `M3u8Helper$hlsYield$encryptionKeyResponse$1`(
            `$encryptionUri`,
            `$headers`,
            continuation
        )
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in NiceResponse?>?
    ): Object {
        return (create(
            coroutineScope,
            continuation
        ) as `M3u8Helper$hlsYield$encryptionKeyResponse$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj)
                return obj
            }
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        }
        ResultKt.throwOnFailure(obj)
        label = 1
        val obj2: Object = Requests.`get$default`(
            MainActivityKt.getApp(),
            `$encryptionUri`.element,
            `$headers`,
            null,
            null,
            null,
            false,
            0,
            null,
            0L,
            null,
            false,
            this,
            2044,
            null
        )
        return if (obj2 === coroutine_suspended) coroutine_suspended else obj2
    }
}