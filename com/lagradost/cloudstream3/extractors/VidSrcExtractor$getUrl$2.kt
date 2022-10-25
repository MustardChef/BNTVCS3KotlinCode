package com.lagradost.cloudstream3.extractors

import com.lagradost.cloudstream3.utils.ExtractorApiKt.loadExtractor
import com.lagradost.cloudstream3.ParCollections.argamap
import com.lagradost.cloudstream3.utils.M3u8Helper.Companion.Companion.`generateM3u8$default`
import com.lagradost.cloudstream3.utils.ExtractorApi.Companion.`getSafeUrl$default`
import com.lagradost.cloudstream3.MainActivityKt.getApp
import com.lagradost.cloudstream3.utils.ExtractorApiKt.getQualityFromName
import com.lagradost.cloudstream3.utils.ExtractorApiKt.extractorApis
import com.lagradost.cloudstream3.utils.ExtractorApi.requiresReferer
import com.lagradost.cloudstream3.utils.ExtractorApi.mainUrl
import com.lagradost.cloudstream3.utils.ExtractorApi.getSafeUrl
import com.lagradost.cloudstream3.extractors.helper.WcoHelper
import com.lagradost.cloudstream3.extractors.helper.WcoHelper.Companion.ExternalKeys
import com.lagradost.cloudstream3.extractors.helper.WcoHelper.Companion.NewExternalKeys
import kotlin.jvm.internal.DefaultConstructorMarker
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.jvm.JvmOverloads
import com.lagradost.cloudstream3.extractors.helper.AsianEmbedHelper
import com.lagradost.cloudstream3.SubtitleFile
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.extractors.helper.VstreamhubHelper
import kotlin.coroutines.jvm.internal.DebugMetadata
import com.lagradost.cloudstream3.extractors.helper.``WcoHelper$Companion$getKeys$1`
import com.lagradost.cloudstream3.utils.M3u8Helper
import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: VidSrcExtractor.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "", "server", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.extractors.VidSrcExtractor\$getUrl$2",
    m98f = "VidSrcExtractor.kt",
    m97i = [],
    m96l = [54, 63],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* loaded from: classes3.dex */
class `VidSrcExtractor$getUrl$2`(/* synthetic */val `this$0`: VidSrcExtractor,
                                                function1: Function1<in ExtractorLink, Unit>,
                                                str: String,
                                                function12: Function1<in SubtitleFile, Unit>,
                                                continuation: Continuation<in `VidSrcExtractor$getUrl$2`?>?
) : SuspendLambda(2, continuation), Function2<String, Continuation<in Unit>?, Object> {
    /* synthetic */ val `$callback`: Function1<ExtractorLink, Unit>
    /* synthetic */ val `$subtitleCallback`: Function1<SubtitleFile, Unit>
    /* synthetic */ val `$url`: String

    /* synthetic */
    var `L$0`: Object? = null
    var label = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$callback` = function1
        `$url` = str
        `$subtitleCallback` = function12
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        val `vidSrcExtractor$getUrl$2` = `VidSrcExtractor$getUrl$2`(
            `this$0`,
            `$callback`,
            `$url`,
            `$subtitleCallback`,
            continuation
        )
        `vidSrcExtractor$getUrl$2`.`L$0` = obj
        return `vidSrcExtractor$getUrl$2`
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(str: String, continuation: Continuation<in Unit>?): Object {
        return (create(
            str,
            continuation
        ) as `VidSrcExtractor$getUrl$2`).invokeSuspend(Unit.INSTANCE)
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val str: String?
        val obj2: Object
        val `find$default`: MatchResult?
        var value: String?
        val str2: String?
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            val str3 = `L$0` as String?
            val `replace$default`: String = StringsKt.`replace$default`(
                str3,
                "https://vidsrc.xyz/",
                "https://embedsito.com/",
                false,
                4,
                null as Object?
            )
            if (StringsKt.`contains$default`(
                    `replace$default` as CharSequence,
                    "/pro" as CharSequence,
                    false,
                    2,
                    null as Object?
                )
            ) {
                str = `this$0`.absoluteUrl
                label = 1
                obj2 = Requests.`get$default`(
                    MainActivityKt.getApp(),
                    str3,
                    null,
                    str,
                    null,
                    null,
                    false,
                    0,
                    null,
                    0L,
                    null,
                    false,
                    this,
                    2042,
                    null
                )
                if (obj2 === coroutine_suspended) {
                    return coroutine_suspended
                }
                `find$default` = Regex.`find$default`(
                    Regex("((https:|http:)//.*\\.m3u8)"),
                    (obj2 as NiceResponse).getText(),
                    0,
                    2,
                    null
                )
                if (`find$default` != null) {
                }
                return Unit.INSTANCE
            }
            label = 2
            if (ExtractorApiKt.loadExtractor(
                    `replace$default`,
                    `$url`,
                    `$subtitleCallback`,
                    `$callback`,
                    this
                ) === coroutine_suspended
            ) {
                return coroutine_suspended
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj)
            obj2 = obj
            `find$default` = Regex.`find$default`(
                Regex("((https:|http:)//.*\\.m3u8)"),
                (obj2 as NiceResponse).getText(),
                0,
                2,
                null
            )
            if (`find$default` != null || `find$default`!!.getValue().also { value = it } == null) {
                return Unit.INSTANCE
            }
            val companion: M3u8Helper.Companion = M3u8Helper.Companion
            val name: String? = `this$0`.getName()
            str2 = `this$0`.absoluteUrl
            val function1 = `$callback`
            for (obj3 in `generateM3u8$default`(
                companion,
                name,
                value,
                str2,
                null,
                null,
                null,
                56,
                null
            )) {
                function1.invoke(obj3)
            }
        } else if (i != 2) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            ResultKt.throwOnFailure(obj)
        }
        return Unit.INSTANCE
    }
}