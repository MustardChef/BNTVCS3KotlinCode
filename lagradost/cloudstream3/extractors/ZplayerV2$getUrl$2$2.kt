package com.lagradost.cloudstream3.extractors

import com.google.common.net.HttpHeaders
import com.lagradost.cloudstream3.utils.M3u8Helper
import java.util.List
import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: Zplayer.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "", "urlm3u8", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.extractors.ZplayerV2\$getUrl$2$2",
    m98f = "Zplayer.kt",
    m97i = [0],
    m96l = [41],
    m95m = "invokeSuspend",
    m94n = ["urlm3u8"],
    m93s = ["L$0"]
) /* loaded from: classes3.dex */
class `ZplayerV2$getUrl$2$2`(/* synthetic */val `$url`: String, /* synthetic */
                                            val `this$0`: ZplayerV2,
                                            list: List<ExtractorLink>,
                                            continuation: Continuation<in `ZplayerV2$getUrl$2$2`?>?
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
        val `zplayerV2$getUrl$2$2` =
            `ZplayerV2$getUrl$2$2`(`$url`, `this$0`, `$sources`, continuation)
        `zplayerV2$getUrl$2$2`.`L$0` = obj
        return `zplayerV2$getUrl$2$2`
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(str: String, continuation: Continuation<in Unit>?): Object {
        return (create(str, continuation) as `ZplayerV2$getUrl$2$2`).invokeSuspend(Unit.INSTANCE)
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val obj2: Object
        val str: String?
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            val str2 = `L$0` as String?
            if (StringsKt.`contains$default`(
                    str2 as CharSequence?,
                    "m3u8" as CharSequence,
                    false,
                    2,
                    null as Object?
                )
            ) {
                `L$0` = str2
                label = 1
                obj2 = Requests.`get$default`(
                    MainActivityKt.getApp(), str2, MapsKt.mapOf(
                        TuplesKt.m100to<Any, Any>(
                            HttpHeaders.REFERER, `$url`
                        )
                    ), null, null, null, false, 0, null, 0L, null, false, this, 2044, null
                )
                if (obj2 === coroutine_suspended) {
                    return coroutine_suspended
                }
                str = str2
            }
            return Unit.INSTANCE
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            ResultKt.throwOnFailure(obj)
            obj2 = obj
            str = `L$0`
        }
        if (StringsKt.`contains$default`(
                (obj2 as NiceResponse).getText() as CharSequence,
                "EXTM3U" as CharSequence,
                false,
                2,
                null as Object?
            )
        ) {
            val companion: M3u8Helper.Companion = M3u8Helper.Companion
            val name: String? = `this$0`.getName()
            val str3 = `$url`
            val list: List<ExtractorLink> = `$sources`
            for (extractorLink in M3u8Helper.Companion.`generateM3u8$default`(
                companion, name, str, str3, null, MapsKt.mapOf(
                    TuplesKt.m100to<Any, Any>(
                        HttpHeaders.REFERER, str3
                    )
                ), null, 40, null
            )) {
                list.add(extractorLink)
            }
        }
        return Unit.INSTANCE
    }
}