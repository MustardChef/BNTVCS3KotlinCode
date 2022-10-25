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

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: UpstreamExtractor.kt */
@Metadata(m106k = 3, m105mv = [1, 6, 0], m103xi = 48)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.extractors.UpstreamExtractor",
    m98f = "UpstreamExtractor.kt",
    m97i = [0, 0, 0],
    m96l = [17],
    m95m = "getUrl",
    m94n = ["this", "referer", "sources"],
    m93s = ["L$0", "L$1", "L$2"]
) /* loaded from: classes3.dex */
class `UpstreamExtractor$getUrl$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */(/* synthetic */
    val `this$0`: UpstreamExtractor, continuation: Continuation<in `UpstreamExtractor$getUrl$1`?>?
) : ContinuationImpl(continuation) {
    var `L$0`: Object? = null
    var `L$1`: Object? = null
    var `L$2`: Object? = null
    var label = 0

    /* synthetic */
    var result: Object? = null

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        result = obj
        label = label or Integer.MIN_VALUE
        return `this$0`.getUrl(null, null, this)
    }
}