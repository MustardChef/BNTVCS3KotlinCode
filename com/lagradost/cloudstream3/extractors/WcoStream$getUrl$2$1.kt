package com.lagradost.cloudstream3.extractors

import com.google.common.net.HttpHeaders
import java.util.List
import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: WcoStream.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "", "serverurl", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.extractors.WcoStream\$getUrl$2$1",
    m98f = "WcoStream.kt",
    m97i = [0],
    m96l = [162],
    m95m = "invokeSuspend",
    m94n = ["serverurl"],
    m93s = ["L$0"]
) /* loaded from: classes3.dex */
class `WcoStream$getUrl$2$1`(/* synthetic */val `$url`: String,
                                            list: List<ExtractorLink>,
                                            continuation: Continuation<in `WcoStream$getUrl$2$1`?>?
) : SuspendLambda(2, continuation), Function2<String, Continuation<in Unit>?, Object> {
    /* synthetic */ val `$sources`: List<ExtractorLink>

    /* synthetic */
    var `L$0`: Object? = null
    var label = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$sources` = list
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        val `wcoStream$getUrl$2$1` = `WcoStream$getUrl$2$1`(`$url`, `$sources`, continuation)
        `wcoStream$getUrl$2$1`.`L$0` = obj
        return `wcoStream$getUrl$2$1`
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(str: String, continuation: Continuation<in Unit>?): Object {
        return (create(str, continuation) as `WcoStream$getUrl$2$1`).invokeSuspend(Unit.INSTANCE)
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val obj2: Object
        val str: String?
        val str2: String
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            val str3 = `L$0` as String?
            `L$0` = str3
            label = 1
            obj2 = Requests.`get$default`(
                MainActivityKt.getApp(), str3, MapsKt.mapOf(
                    TuplesKt.m100to<Any, Any>(
                        HttpHeaders.REFERER, `$url`
                    )
                ), null, null, null, false, 0, null, 0L, null, false, this, 2044, null
            )
            if (obj2 === coroutine_suspended) {
                return coroutine_suspended
            }
            str = str3
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            ResultKt.throwOnFailure(obj)
            obj2 = obj
            str = `L$0`
        }
        if (StringsKt.`contains$default`(
                (obj2 as NiceResponse).getText() as CharSequence,
                "EXTM3" as CharSequence,
                false,
                2,
                null as Object?
            )
        ) {
            str2 = if (StringsKt.`contains$default`(
                    str as CharSequence?,
                    "H4" as CharSequence,
                    false,
                    2,
                    null as Object?
                )
            ) {
                "1080p"
            } else if (StringsKt.`contains$default`(
                    str as CharSequence?,
                    "H3" as CharSequence,
                    false,
                    2,
                    null as Object?
                )
            ) {
                "720p"
            } else if (StringsKt.`contains$default`(
                    str as CharSequence?,
                    "H2" as CharSequence,
                    false,
                    2,
                    null as Object?
                )
            ) {
                "480p"
            } else {
                if (StringsKt.`contains$default`(
                        str as CharSequence?,
                        "H1" as CharSequence,
                        false,
                        2,
                        null as Object?
                    )
                ) "360p" else "Auto"
            }
            `$sources`.add(
                ExtractorLink(
                    "VidStream",
                    "VidStream",
                    str,
                    `$url`,
                    ExtractorApiKt.getQualityFromName(str2),
                    true,
                    null,
                    null,
                    192,
                    null
                )
            )
        }
        return Unit.INSTANCE
    }
}