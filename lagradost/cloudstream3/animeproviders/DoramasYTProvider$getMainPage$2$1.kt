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
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: DoramasYTProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/AnimeSearchResponse;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class `DoramasYTProvider$getMainPage$2$1`(/* synthetic */val `this$0`: DoramasYTProvider, /* synthetic */
                                                         val `$poster`: String, /* synthetic */
                                                         val `$title`: String, num: Integer
) : Lambda<Any?>(1), Function1<AnimeSearchResponse, Unit> {
    /* synthetic */ val `$epNum`: Integer

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$epNum` = num
    }

    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override fun invoke(animeSearchResponse: AnimeSearchResponse) {
        invoke2(animeSearchResponse)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(newAnimeSearchResponse: AnimeSearchResponse) {
        Intrinsics.checkNotNullParameter(newAnimeSearchResponse, "\$this\$newAnimeSearchResponse")
        val poster = `$poster`
        Intrinsics.checkNotNullExpressionValue(poster, "poster")
        newAnimeSearchResponse.posterUrl = fixUrl(`this$0`, poster)
        val companion: DoramasYTProvider.Companion = DoramasYTProvider.Companion.Companion
        val title = `$title`
        Intrinsics.checkNotNullExpressionValue(title, "title")
        addDubStatus(newAnimeSearchResponse, companion.getDubStatus(title), `$epNum`)
    }
}