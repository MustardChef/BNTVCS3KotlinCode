package com.lagradost.cloudstream3.utils

import android.app.Activity
import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: InAppUpdater.kt */
@Metadata(
    m108d1 = ["\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"],
    m107d2 = ["<anonymous>", "Lcom/lagradost/cloudstream3/utils/InAppUpdater\$Companion\$Update;", "Lkotlinx/coroutines/CoroutineScope;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.utils.InAppUpdater\$Companion\$getPreReleaseUpdate$1",
    m98f = "InAppUpdater.kt",
    m97i = [0, 0, 1, 1],
    m96l = [157, 166],
    m95m = "invokeSuspend",
    m94n = ["tagUrl", "headers", "found", "foundAsset"],
    m93s = ["L$0", "L$1", "L$0", "L$1"]
) /* loaded from: classes4.dex */
class `InAppUpdater$Companion$getPreReleaseUpdate$1`(
    activity: Activity,
    continuation: Continuation<in `InAppUpdater$Companion$getPreReleaseUpdate$1`?>?
) : SuspendLambda(2, continuation),
    Function2<CoroutineScope, Continuation<in InAppUpdater.Companion.Update?>?, Object> {
    /* synthetic */ val `$this_getPreReleaseUpdate`: Activity
    var `L$0`: Object? = null
    var `L$1`: Object? = null
    var `L$2`: Object? = null
    var label = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$this_getPreReleaseUpdate` = activity
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        return `InAppUpdater$Companion$getPreReleaseUpdate$1`(
            `$this_getPreReleaseUpdate`,
            continuation
        )
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in InAppUpdater.Companion.Update?>?
    ): Object {
        return (create(
            coroutineScope,
            continuation
        ) as `InAppUpdater$Companion$getPreReleaseUpdate$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0132  */ /* JADX WARN: Removed duplicated region for block: B:33:0x014d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun invokeSuspend(r26: Any?): Any {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.utils.InAppUpdater\$Companion\$getPreReleaseUpdate$1.invokeSuspend(java.lang.Object):java.lang.Object")
    }
}