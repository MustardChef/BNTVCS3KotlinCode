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
import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: Pelisplus.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "", "api", "Lcom/lagradost/cloudstream3/extractors/MultiQuality;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.extractors.Pelisplus\$getUrl$2",
    m98f = "Pelisplus.kt",
    m97i = [],
    m96l = [40],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* loaded from: classes3.dex */
class `Pelisplus$getUrl$2`(/* synthetic */val `$id`: String,
                                          function1: Function1<in SubtitleFile, Unit>,
                                          function12: Function1<in ExtractorLink, Unit>,
                                          continuation: Continuation<in `Pelisplus$getUrl$2`?>?
) : SuspendLambda(2, continuation), Function2<MultiQuality, Continuation<in Unit>?, Object> {
    /* synthetic */ val `$callback`: Function1<ExtractorLink, Unit>
    /* synthetic */ val `$subtitleCallback`: Function1<SubtitleFile, Unit>

    /* synthetic */
    var `L$0`: Object? = null
    var label = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$subtitleCallback` = function1
        `$callback` = function12
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        val `pelisplus$getUrl$2` =
            `Pelisplus$getUrl$2`(`$id`, `$subtitleCallback`, `$callback`, continuation)
        `pelisplus$getUrl$2`.`L$0` = obj
        return `pelisplus$getUrl$2`
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(multiQuality: MultiQuality, continuation: Continuation<in Unit>?): Object {
        return (create(
            multiQuality,
            continuation
        ) as `Pelisplus$getUrl$2`).invokeSuspend(Unit.INSTANCE)
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