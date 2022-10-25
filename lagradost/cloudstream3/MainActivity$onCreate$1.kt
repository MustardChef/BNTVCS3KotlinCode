package com.lagradost.cloudstream3

import androidx.exifinterface.media.ExifInterface
import kotlin.coroutines.jvm.internal.DebugMetadata
import com.lagradost.cloudstream3.``ParCollectionsKt$apmapIndexed$1$1$1`
import kotlin.coroutines.Continuation

/* compiled from: MainActivity.kt */
@Metadata(
    m108d1 = ["\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"],
    m107d2 = ["<anonymous>", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.MainActivity\$onCreate$1",
    m98f = "MainActivity.kt",
    m97i = [],
    m96l = [],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
)
/* loaded from: classes3.dex */
internal class `MainActivity$onCreate$1`  /* JADX INFO: Access modifiers changed from: package-private */
    (continuation: Continuation<in `MainActivity$onCreate$1`?>?) : SuspendLambda(1, continuation),
    Function1<Continuation<in Unit>?, Object> {
    var label = 0

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(continuation: Continuation<*>?): Continuation<Unit> {
        return `MainActivity$onCreate$1`(continuation)
    }

    @Override // kotlin.jvm.functions.Function1
    override fun invoke(continuation: Continuation<in Unit>?): Object {
        return (create(continuation) as `MainActivity$onCreate$1`).invokeSuspend(Unit.INSTANCE)
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: MainActivity.kt */
    @Metadata(
        m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"],
        m107d2 = ["<anonymous>", "", "api", "Lcom/lagradost/cloudstream3/syncproviders/InAppAuthAPIManager;"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    @DebugMetadata(
        m99c = "com.lagradost.cloudstream3.MainActivity\$onCreate$1$1",
        m98f = "MainActivity.kt",
        m97i = [],
        m96l = [568],
        m95m = "invokeSuspend",
        m94n = [],
        m93s = []
    ) /* renamed from: com.lagradost.cloudstream3.MainActivity$onCreate$1$1 */ /* loaded from: classes3.dex */
    class C47581 internal constructor(continuation: Continuation<in C47581?>?) :
        SuspendLambda(2, continuation),
        Function2<InAppAuthAPIManager, Continuation<in Unit>?, Object> {
        /* synthetic */
        var `L$0`: Object? = null
        var label = 0

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
            val c47581 = C47581(continuation)
            c47581.`L$0` = obj
            return c47581
        }

        @Override // kotlin.jvm.functions.Function2
        override fun invoke(
            inAppAuthAPIManager: InAppAuthAPIManager,
            continuation: Continuation<in Unit>?
        ): Object {
            return (create(
                inAppAuthAPIManager,
                continuation
            ) as C47581).invokeSuspend(Unit.INSTANCE)
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        override fun invokeSuspend(obj: Object): Object {
            val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
            val i = label
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj)
                    val inAppAuthAPIManager: InAppAuthAPIManager? = `L$0` as InAppAuthAPIManager?
                    label = 1
                    if (inAppAuthAPIManager.initialize(this) === coroutine_suspended) {
                        return coroutine_suspended
                    }
                } else if (i != 1) {
                    throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
                } else {
                    ResultKt.throwOnFailure(obj)
                }
            } catch (e: Exception) {
                ArchComponentExt.logError(e)
            }
            return Unit.INSTANCE
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        IntrinsicsKt.getCOROUTINE_SUSPENDED()
        if (label == 0) {
            ResultKt.throwOnFailure(obj)
            ParCollections.apmap<InAppAuthAPIManager, Unit>(
                AccountManager.Companion.getInAppAuths(),
                C47581(null)
            )
            return Unit.INSTANCE
        }
        throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
    }
}