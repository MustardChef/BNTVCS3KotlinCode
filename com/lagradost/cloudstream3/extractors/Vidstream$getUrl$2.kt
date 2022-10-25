package com.lagradost.cloudstream3.extractors

import java.util.ArrayList
import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: Vidstream.kt */
@Metadata(
    m108d1 = ["\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\u008a@"],
    m107d2 = ["<anonymous>", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.extractors.Vidstream\$getUrl$2",
    m98f = "Vidstream.kt",
    m97i = [],
    m96l = [],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* loaded from: classes3.dex */
class `Vidstream$getUrl$2`(/* synthetic */val `this$0`: Vidstream, /* synthetic */
                                          val `$id`: String,
                                          function1: Function1<SubtitleFile?, Unit>?,
                                          function12: Function1<ExtractorLink?, Unit>,
                                          continuation: Continuation<in `Vidstream$getUrl$2`?>?
) : SuspendLambda(1, continuation), Function1<Continuation<in Object?>?, Object> {
    /* synthetic */ val `$callback`: Function1<ExtractorLink?, Unit>
    /* synthetic */ val `$subtitleCallback`: Function1<SubtitleFile?, Unit>?
    var label = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$subtitleCallback` = function1
        `$callback` = function12
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(continuation: Continuation<*>?): Continuation<Unit> {
        return `Vidstream$getUrl$2`(`this$0`, `$id`, `$subtitleCallback`, `$callback`, continuation)
    }

    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override fun invoke(continuation: Continuation<in Object?>?): Object {
        return invoke2(continuation as Continuation<Object?>?)
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(continuation: Continuation<Object?>?): Object {
        return (create(continuation) as `Vidstream$getUrl$2`).invokeSuspend(Unit.INSTANCE)
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: Vidstream.kt */
    @Metadata(
        m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"],
        m107d2 = ["<anonymous>", "", "api", "Lcom/lagradost/cloudstream3/extractors/MultiQuality;"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    @DebugMetadata(
        m99c = "com.lagradost.cloudstream3.extractors.Vidstream\$getUrl$2$1",
        m98f = "Vidstream.kt",
        m97i = [],
        m96l = [42],
        m95m = "invokeSuspend",
        m94n = [],
        m93s = []
    ) /* renamed from: com.lagradost.cloudstream3.extractors.Vidstream$getUrl$2$1 */ /* loaded from: classes3.dex */
    class C47741 internal constructor(/* synthetic */val `$id`: String,
                                                     function1: Function1<SubtitleFile, Unit>?,
                                                     function12: Function1<ExtractorLink, Unit>,
                                                     continuation: Continuation<in C47741?>?
    ) : SuspendLambda(2, continuation), Function2<MultiQuality, Continuation<in Unit>?, Object> {
        /* synthetic */ val `$callback`: Function1<ExtractorLink, Unit>
        /* synthetic */ val `$subtitleCallback`: Function1<SubtitleFile, Unit>?

        /* synthetic */
        var `L$0`: Object? = null
        var label = 0

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
        init {
            `$subtitleCallback` = function1
            `$callback` = function12
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
            val c47741 = C47741(`$id`, `$subtitleCallback`, `$callback`, continuation)
            c47741.`L$0` = obj
            return c47741
        }

        @Override // kotlin.jvm.functions.Function2
        override fun invoke(
            multiQuality: MultiQuality,
            continuation: Continuation<in Unit>?
        ): Object {
            return (create(multiQuality, continuation) as C47741).invokeSuspend(Unit.INSTANCE)
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        override fun invokeSuspend(obj: Object): Object {
            val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
            val i = label
            if (i == 0) {
                ResultKt.throwOnFailure(obj)
                val multiQuality = `L$0` as MultiQuality?
                label = 1
                if (ExtractorApi.`getSafeUrl$default`(
                        multiQuality,
                        multiQuality!!.getExtractorUrl(`$id`),
                        null,
                        `$subtitleCallback`,
                        `$callback`,
                        this,
                        2,
                        null
                    ) === coroutine_suspended
                ) {
                    return coroutine_suspended
                }
            } else if (i != 1) {
                throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
            } else {
                ResultKt.throwOnFailure(obj)
            }
            return Unit.INSTANCE
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val arrayList: ArrayList
        IntrinsicsKt.getCOROUTINE_SUSPENDED()
        if (label == 0) {
            ResultKt.throwOnFailure(obj)
            arrayList = `this$0`.normalApis
            return ParCollections.apmap(
                arrayList,
                C47741(`$id`, `$subtitleCallback`, `$callback`, null)
            )
        }
        throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
    }
}