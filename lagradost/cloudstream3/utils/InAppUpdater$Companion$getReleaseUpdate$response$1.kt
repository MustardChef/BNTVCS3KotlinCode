package com.lagradost.cloudstream3.utils

import java.util.Map
import kotlin.coroutines.Continuation

/* compiled from: InAppUpdater.kt */
@Metadata(
    m108d1 = ["\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"],
    m107d2 = ["<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.utils.InAppUpdater\$Companion\$getReleaseUpdate\$response$1",
    m98f = "InAppUpdater.kt",
    m97i = [],
    m96l = [90],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
)
/* loaded from: classes4.dex */
internal class `InAppUpdater$Companion$getReleaseUpdate$response$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */(/* synthetic */
    val `$url`: String, /* synthetic */
    val `$headers`: Map<String, String>,
    continuation: Continuation<in `InAppUpdater$Companion$getReleaseUpdate$response$1`?>?
) : SuspendLambda(2, continuation), Function2<CoroutineScope, Continuation<in String?>?, Object> {
    var label = 0

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        return `InAppUpdater$Companion$getReleaseUpdate$response$1`(
            `$url`,
            `$headers`,
            continuation
        )
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in String?>?
    ): Object {
        return (create(
            coroutineScope,
            continuation
        ) as `InAppUpdater$Companion$getReleaseUpdate$response$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val obj2: Object
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            label = 1
            obj2 = Requests.`get$default`(
                MainActivityKt.getApp(),
                `$url`,
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
            if (obj2 === coroutine_suspended) {
                return coroutine_suspended
            }
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            ResultKt.throwOnFailure(obj)
            obj2 = obj
        }
        return (obj2 as NiceResponse).getText()
    }
}