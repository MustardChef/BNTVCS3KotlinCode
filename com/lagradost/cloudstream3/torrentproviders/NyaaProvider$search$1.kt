package com.lagradost.cloudstream3.torrentproviders

import com.lagradost.cloudstream3.utils.Qualities.value
import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.TvType
import kotlin.collections.SetsKt
import com.lagradost.cloudstream3.VPNStatus
import com.lagradost.cloudstream3.SearchResponse
import com.lagradost.cloudstream3.LoadResponse
import com.lagradost.cloudstream3.SubtitleFile
import com.lagradost.cloudstream3.utils.ExtractorLink
import kotlin.coroutines.jvm.internal.boxing
import com.lagradost.cloudstream3.utils.Qualities
import kotlin.coroutines.jvm.internal.DebugMetadata
import com.lagradost.cloudstream3.torrentproviders.NyaaProvider
import com.lagradost.cloudstream3.torrentproviders.``NyaaProvider$load$1`
import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: NyaaProvider.kt */
@Metadata(m106k = 3, m105mv = [1, 6, 0], m103xi = 48)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.torrentproviders.NyaaProvider",
    m98f = "NyaaProvider.kt",
    m97i = [0],
    m96l = [19],
    m95m = "search",
    m94n = ["this"],
    m93s = ["L$0"]
) /* loaded from: classes3.dex */
class `NyaaProvider$search$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */(/* synthetic */
    val `this$0`: NyaaProvider, continuation: Continuation<in `NyaaProvider$search$1`?>?
) : ContinuationImpl(continuation) {
    var `L$0`: Object? = null
    var label = 0

    /* synthetic */
    var result: Object? = null

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        result = obj
        label = label or Integer.MIN_VALUE
        return `this$0`.search(null, this)
    }
}