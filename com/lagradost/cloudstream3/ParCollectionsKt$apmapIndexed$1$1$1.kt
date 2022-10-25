package com.lagradost.cloudstream3

import androidx.exifinterface.media.ExifInterface
import kotlin.coroutines.jvm.internal.DebugMetadata
import com.lagradost.cloudstream3.``ParCollectionsKt$apmapIndexed$1$1$1`
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function3

/* compiled from: ParCollections.kt */
@Metadata(
    m108d1 = ["\u0000\b\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\u00020\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "B", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lkotlinx/coroutines/CoroutineScope;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.ParCollectionsKt\$apmapIndexed$1$1$1",
    m98f = "ParCollections.kt",
    m97i = [],
    m96l = [38],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
)
/* loaded from: classes3.dex */
internal class `ParCollectionsKt$apmapIndexed$1$1$1`(
    function3: Function3<in Integer?, in A?, in Continuation<in B?>?, out Object?>,
    i: Int,
    a: A,
    continuation: Continuation<in `ParCollectionsKt$apmapIndexed$1$1$1`?>?
) : SuspendLambda(2, continuation), Function2<CoroutineScope, Continuation<in B?>?, Object> {
    /* renamed from: $a */
    /* synthetic */ val `f9906$a`: A

    /* renamed from: $f */
    /* synthetic */ val `f9907$f`: Function3<Integer?, A?, Continuation<in B?>?, Object?>
    /* synthetic */ val `$index`: Int
    var label = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `f9907$f` = function3
        `$index` = i
        `f9906$a` = a
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        return `ParCollectionsKt$apmapIndexed$1$1$1`(`f9907$f`, `$index`, `f9906$a`, continuation)
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in B?>?
    ): Object {
        return (create(
            coroutineScope,
            continuation
        ) as `ParCollectionsKt$apmapIndexed$1$1$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        var obj: Object = obj
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            val function3: Function3<Integer?, A?, Continuation<in B?>?, Object> = `f9907$f`
            val boxInt: Integer = boxing.boxInt(`$index`)
            val a: A = `f9906$a`
            label = 1
            obj = function3.invoke(boxInt, a, this)
            if (obj === coroutine_suspended) {
                return coroutine_suspended
            }
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            ResultKt.throwOnFailure(obj)
        }
        return obj
    }
}