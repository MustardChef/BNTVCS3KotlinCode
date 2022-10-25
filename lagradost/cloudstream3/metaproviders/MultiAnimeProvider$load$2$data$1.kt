package com.lagradost.cloudstream3.metaproviders

import java.util.Iterator
import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: MultiAnimeProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.metaproviders.MultiAnimeProvider\$load$2\$data$1",
    m98f = "MultiAnimeProvider.kt",
    m97i = [],
    m96l = [49],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* loaded from: classes3.dex */
class `MultiAnimeProvider$load$2$data$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */(/* synthetic */
    val `this$0`: MultiAnimeProvider,
    continuation: Continuation<in `MultiAnimeProvider$load$2$data$1`?>?
) : SuspendLambda(2, continuation), Function2<String, Continuation<in LoadResponse?>?, Object> {
    /* synthetic */
    var `L$0`: Object? = null
    var label = 0

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        val `multiAnimeProvider$load$2$data$1` =
            `MultiAnimeProvider$load$2$data$1`(`this$0`, continuation)
        `multiAnimeProvider$load$2$data$1`.`L$0` = obj
        return `multiAnimeProvider$load$2$data$1`
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(str: String, continuation: Continuation<in LoadResponse?>?): Object {
        return (create(
            str,
            continuation
        ) as `MultiAnimeProvider$load$2$data$1`).invokeSuspend(Unit.INSTANCE)
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        var obj: Object = obj
        val validApis: List?
        var obj2: Object?
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            val str = `L$0` as String?
            validApis = `this$0`.validApis
            val it: Iterator = validApis.iterator()
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null
                    break
                }
                obj2 = it.next()
                if (StringsKt.`startsWith$default`(
                        str,
                        (obj2 as MainAPI?).mainUrl,
                        false,
                        2,
                        null as Object?
                    )
                ) {
                    break
                }
            }
            val mainAPI: MainAPI = obj2 as MainAPI? ?: return null
            label = 1
            obj = mainAPI.load(str, this)
            if (obj === coroutine_suspended) {
                return coroutine_suspended
            }
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            ResultKt.throwOnFailure(obj)
        }
        return obj as LoadResponse
    }
}