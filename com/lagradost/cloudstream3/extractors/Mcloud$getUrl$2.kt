package com.lagradost.cloudstream3.extractors

import com.google.common.net.HttpHeaders
import com.lagradost.cloudstream3.utils.M3u8Helper
import java.util.List
import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: Mcloud.kt */
@Metadata(
    m108d1 = ["\u0000\r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0000*\u0001\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "", "it", "com/lagradost/cloudstream3/extractors/Mcloud\$getUrl\$SourcesMcloud"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.extractors.Mcloud\$getUrl$2",
    m98f = "Mcloud.kt",
    m97i = [],
    m96l = [],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* loaded from: classes3.dex */
class `Mcloud$getUrl$2`(
    list: List<ExtractorLink>,
    mcloud: Mcloud,
    str: String,
    continuation: Continuation<in `Mcloud$getUrl$2`?>?
) : SuspendLambda(2, continuation),
    Function2<`Mcloud$getUrl$SourcesMcloud`, Continuation<in Unit>?, Object> {
    /* synthetic */ val `$sources`: List<ExtractorLink>
    /* synthetic */ val `$url`: String

    /* synthetic */
    var `L$0`: Object? = null
    var label = 0
    /* synthetic */ val `this$0`: Mcloud

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$sources` = list
        `this$0` = mcloud
        `$url` = str
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        val `mcloud$getUrl$2` = `Mcloud$getUrl$2`(`$sources`, `this$0`, `$url`, continuation)
        `mcloud$getUrl$2`.`L$0` = obj
        return `mcloud$getUrl$2`
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(
        `mcloud$getUrl$SourcesMcloud`: `Mcloud$getUrl$SourcesMcloud`,
        continuation: Continuation<in Unit>?
    ): Object {
        return (create(
            `mcloud$getUrl$SourcesMcloud`,
            continuation
        ) as `Mcloud$getUrl$2`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        IntrinsicsKt.getCOROUTINE_SUSPENDED()
        if (label == 0) {
            ResultKt.throwOnFailure(obj)
            val `mcloud$getUrl$SourcesMcloud` = `L$0` as `Mcloud$getUrl$SourcesMcloud`?
            if (StringsKt.`contains$default`(
                    `mcloud$getUrl$SourcesMcloud`.getFile() as CharSequence,
                    "m3u8" as CharSequence,
                    false,
                    2,
                    null as Object?
                )
            ) {
                val list: List<ExtractorLink> = `$sources`
                val companion: M3u8Helper.Companion = M3u8Helper.Companion
                val name: String? = `this$0`.getName()
                val file: String? = `mcloud$getUrl$SourcesMcloud`.getFile()
                val str = `$url`
                list.addAll(
                    M3u8Helper.Companion.`generateM3u8$default`(
                        companion, name, file, str, null, MapsKt.mapOf(
                            TuplesKt.m100to<Any, Any>(
                                HttpHeaders.REFERER, str
                            )
                        ), null, 40, null
                    )
                )
            }
            return Unit.INSTANCE
        }
        throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
    }
}