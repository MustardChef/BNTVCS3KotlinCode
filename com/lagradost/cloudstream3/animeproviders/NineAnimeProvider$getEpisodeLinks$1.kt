package com.lagradost.cloudstream3.animeproviders

import com.lagradost.cloudstream3.MainAPIKt.fixUrl
import com.lagradost.cloudstream3.MainAPIKt.`newAnimeSearchResponse$default`
import com.lagradost.cloudstream3.MainAPIKt.fixUrlNull
import com.lagradost.cloudstream3.movieproviders.SflixProvider.Companion.runSflixExtractorVerifierJob
import com.lagradost.cloudstream3.utils.ExtractorLink.url
import com.lagradost.cloudstream3.utils.Coroutines.ioSafe
import com.lagradost.cloudstream3.AnimeLoadResponse.japName
import com.lagradost.cloudstream3.AnimeLoadResponse.engName
import com.lagradost.cloudstream3.AnimeLoadResponse.posterUrl
import com.lagradost.cloudstream3.AnimeLoadResponse.setYear
import com.lagradost.cloudstream3.MainAPIKt.addEpisodes
import com.lagradost.cloudstream3.AnimeLoadResponse.showStatus
import com.lagradost.cloudstream3.AnimeLoadResponse.plot
import com.lagradost.cloudstream3.AnimeLoadResponse.tags
import com.lagradost.cloudstream3.AnimeLoadResponse.setRecommendations
import com.lagradost.cloudstream3.AnimeLoadResponse.actors
import com.lagradost.cloudstream3.AnimeSearchResponse.posterUrl
import com.lagradost.cloudstream3.MainAPIKt.addDubStatus
import com.lagradost.cloudstream3.AnimeLoadResponse.setRating
import com.lagradost.cloudstream3.AnimeLoadResponse.setType
import com.lagradost.cloudstream3.AnimeLoadResponse.getType
import com.lagradost.cloudstream3.AnimeLoadResponse.setDuration
import com.lagradost.cloudstream3.MainAPIKt.getDurationFromString
import com.lagradost.cloudstream3.MainAPIKt.base64Decode
import com.lagradost.cloudstream3.utils.ExtractorApi.Companion.`getUrl$default`
import com.lagradost.cloudstream3.utils.ExtractorApiKt.loadExtractor
import com.lagradost.cloudstream3.Episode.name
import com.lagradost.cloudstream3.Episode.setEpisode
import com.lagradost.cloudstream3.MainActivityKt.getApp
import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.TvType
import kotlin.collections.SetsKt
import kotlin.text.Regex
import kotlin.jvm.internal.DefaultConstructorMarker
import kotlin.text.StringsKt
import com.lagradost.cloudstream3.ShowStatus
import com.lagradost.cloudstream3.SearchResponse
import kotlin.text.MatchResult
import com.lagradost.cloudstream3.animeproviders.ZoroProvider
import com.facebook.share.internal.ShareConstants
import com.lagradost.cloudstream3.MainAPIKt
import com.google.android.gms.cast.MediaTrack
import com.lagradost.cloudstream3.animeproviders.``ZoroProvider$toSearchResult$1`
import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: NineAnimeProvider.kt */
@Metadata(m106k = 3, m105mv = [1, 6, 0], m103xi = 48)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.animeproviders.NineAnimeProvider",
    m98f = "NineAnimeProvider.kt",
    m97i = [],
    m96l = [324],
    m95m = "getEpisodeLinks",
    m94n = [],
    m93s = []
) /* loaded from: classes3.dex */
class `NineAnimeProvider$getEpisodeLinks$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */(/* synthetic */
    val `this$0`: NineAnimeProvider,
    continuation: Continuation<in `NineAnimeProvider$getEpisodeLinks$1`?>?
) : ContinuationImpl(continuation) {
    var label = 0

    /* synthetic */
    var result: Object? = null

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val episodeLinks: Object
        result = obj
        label = label or Integer.MIN_VALUE
        episodeLinks = `this$0`.getEpisodeLinks(null, this)
        return episodeLinks
    }
}