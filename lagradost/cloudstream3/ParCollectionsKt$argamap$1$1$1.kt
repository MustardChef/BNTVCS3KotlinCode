package com.lagradost.cloudstream3

import androidx.exifinterface.media.ExifInterface
import kotlin.coroutines.jvm.internal.DebugMetadata
import com.lagradost.cloudstream3.``ParCollectionsKt$apmapIndexed$1$1$1`
import kotlin.coroutines.Continuation

/* compiled from: ParCollections.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "", "R", "Lkotlinx/coroutines/CoroutineScope;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.ParCollectionsKt\$argamap$1$1$1",
    m98f = "ParCollections.kt",
    m97i = [],
    m96l = [62],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
)
/* loaded from: classes3.dex */
internal class `ParCollectionsKt$argamap$1$1$1`(
    function1: Function1<Continuation<in R?>?, Object?>,
    continuation: Continuation<in `ParCollectionsKt$argamap$1$1$1`?>?
) : SuspendLambda(2, continuation), Function2<CoroutineScope, Continuation<in Object?>?, Object> {
    /* synthetic */ val `$it`: Function1<Continuation<in R?>?, Object?>
    var label = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$it` = function1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        return `ParCollectionsKt$argamap$1$1$1`(`$it`, continuation)
    }

    @Override // kotlin.jvm.functions.Function2
    /* bridge */ /* synthetic */  override fun invoke(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in Object?>?
    ): Object {
        return invoke2(coroutineScope, continuation as Continuation<Object?>?)
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(coroutineScope: CoroutineScope, continuation: Continuation<Object?>?): Object {
        return (create(
            coroutineScope,
            continuation
        ) as `ParCollectionsKt$argamap$1$1$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        var obj: Object = obj
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        return try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj)
                val function1: Function1<Continuation<in R?>, Object> = `$it`
                label = 1
                obj = function1.invoke(this)
                if (obj === coroutine_suspended) {
                    return coroutine_suspended
                }
            } else if (i != 1) {
                throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
            } else {
                ResultKt.throwOnFailure(obj)
            }
            obj
        } catch (e: Exception) {
            ArchComponentExt.logError(e)
            Unit.INSTANCE
        }
    }
}