package com.lagradost.cloudstream3.movieproviders

import com.lagradost.cloudstream3.ParCollections.apmapIndexed
import com.lagradost.cloudstream3.MainAPIKt.base64Decode
import com.lagradost.cloudstream3.MainActivityKt.getApp
import com.lagradost.cloudstream3.APIHolder.unixTime
import com.lagradost.cloudstream3.MainAPIKt.newMovieSearchResponse
import com.lagradost.cloudstream3.utils.AppUtils.toJson
import com.lagradost.cloudstream3.utils.ExtractorApiKt.getQualityFromName
import com.lagradost.cloudstream3.HomePageList.name
import com.lagradost.cloudstream3.MainAPIKt.newEpisode
import com.lagradost.cloudstream3.MainAPIKt.`newMovieSearchResponse$default`
import com.lagradost.cloudstream3.MainAPIKt.getQualityFromString
import com.lagradost.cloudstream3.MainAPI.mainUrl
import com.lagradost.cloudstream3.MainAPIKt.base64Encode
import com.lagradost.cloudstream3.utils.Qualities.value
import com.lagradost.cloudstream3.MainAPIKt.fixUrl
import com.lagradost.cloudstream3.APIHolder.unixTimeMS
import com.lagradost.cloudstream3.utils.M3u8Helper.m3u8Generation
import com.lagradost.cloudstream3.MainAPI.name
import com.lagradost.cloudstream3.utils.M3u8Helper.M3u8Stream.streamUrl
import com.lagradost.cloudstream3.utils.M3u8Helper.M3u8Stream.getQuality
import com.lagradost.cloudstream3.mvvm.ArchComponentExt.suspendSafeApiCall
import com.lagradost.cloudstream3.SearchResponse.name
import com.lagradost.cloudstream3.MainAPIKt.fixUrlNull
import com.lagradost.cloudstream3.MainAPIKt.`newTvSeriesSearchResponse$default`
import com.lagradost.cloudstream3.MainAPIKt.`newAnimeSearchResponse$default`
import com.lagradost.cloudstream3.MainAPIKt.getMapper
import com.lagradost.cloudstream3.MovieLoadResponse.setRecommendations
import com.lagradost.cloudstream3.MovieLoadResponse.posterUrl
import com.lagradost.cloudstream3.MovieLoadResponse.setYear
import com.lagradost.cloudstream3.MovieLoadResponse.plot
import com.lagradost.cloudstream3.APIHolder.capitalize
import com.lagradost.cloudstream3.MovieLoadResponse.tags
import com.lagradost.cloudstream3.MovieLoadResponse.setRating
import com.lagradost.cloudstream3.LoadResponse.Companion.addTrailer
import com.lagradost.cloudstream3.LoadResponse.Companion.addImdbId
import com.lagradost.cloudstream3.TvSeriesLoadResponse.setYear
import com.lagradost.cloudstream3.TvSeriesLoadResponse.plot
import com.lagradost.cloudstream3.TvSeriesLoadResponse.posterUrl
import com.lagradost.cloudstream3.TvSeriesLoadResponse.setRating
import com.lagradost.cloudstream3.TvSeriesLoadResponse.tags
import com.lagradost.cloudstream3.ParCollections.argamap
import com.lagradost.cloudstream3.MovieLoadResponse.setDuration
import com.lagradost.cloudstream3.LoadResponse.Companion.addActorsOnly
import com.lagradost.cloudstream3.TvSeriesLoadResponse.setDuration
import com.lagradost.cloudstream3.TvSeriesLoadResponse.setRecommendations
import com.lagradost.cloudstream3.utils.ExtractorApiKt.httpsify
import com.lagradost.cloudstream3.utils.ExtractorApiKt.loadExtractor
import com.lagradost.cloudstream3.MainAPIKt.addPoster
import com.lagradost.cloudstream3.TvSeriesLoadResponse.setName
import com.lagradost.cloudstream3.TvSeriesLoadResponse.setUrl
import com.lagradost.cloudstream3.TvSeriesLoadResponse.setEpisodes
import com.lagradost.cloudstream3.LoadResponse.Companion.addDuration
import com.lagradost.cloudstream3.LoadResponse.Companion.addActorNames
import com.lagradost.cloudstream3.MovieLoadResponse.comingSoon
import com.lagradost.cloudstream3.TvSeriesLoadResponse.showStatus
import com.lagradost.cloudstream3.MovieLoadResponse.actors
import com.lagradost.cloudstream3.TvSeriesLoadResponse.actors
import com.lagradost.cloudstream3.AnimeLoadResponse.posterUrl
import com.lagradost.cloudstream3.AnimeLoadResponse.setYear
import com.lagradost.cloudstream3.AnimeLoadResponse.showStatus
import com.lagradost.cloudstream3.AnimeLoadResponse.plot
import com.lagradost.cloudstream3.AnimeLoadResponse.tags
import com.lagradost.cloudstream3.AnimeLoadResponse.setRecommendations
import com.lagradost.cloudstream3.MainAPIKt.addEpisodes
import com.lagradost.cloudstream3.MovieSearchResponse.posterUrl
import com.lagradost.cloudstream3.LoadResponse.Companion.addImdbUrl
import com.lagradost.cloudstream3.Episode.setSeason
import com.lagradost.cloudstream3.Episode.setEpisode
import com.lagradost.cloudstream3.Episode.name
import com.lagradost.cloudstream3.Episode.posterUrl
import com.lagradost.cloudstream3.Episode.description
import com.lagradost.cloudstream3.MainAPIKt.`addDate$default`
import com.lagradost.cloudstream3.TvSeriesLoadResponse.comingSoon
import com.lagradost.cloudstream3.mvvm.ArchComponentExt.safeApiCall
import com.lagradost.cloudstream3.TvSeriesSearchResponse.setPosterUrl
import com.lagradost.cloudstream3.utils.M3u8Helper.Companion.Companion.`generateM3u8$default`
import com.lagradost.cloudstream3.LoadResponse.Companion.addRating
import com.lagradost.cloudstream3.utils.Extensions.RequestCustom.getWithCustomCache
import com.lagradost.cloudstream3.MainAPIKt.fixTitle
import com.lagradost.cloudstream3.AnimeLoadResponse.japName
import com.lagradost.cloudstream3.AnimeLoadResponse.engName
import com.lagradost.cloudstream3.MovieSearchResponse.quality
import com.lagradost.cloudstream3.mvvm.ArchComponentExt.logError
import com.lagradost.cloudstream3.utils.ExtractorApi.Companion.`getUrl$default`
import com.lagradost.cloudstream3.utils.ExtractorApi.getSafeUrl
import com.lagradost.cloudstream3.utils.SubtitleHelper.fromTwoLettersToLanguage
import com.lagradost.cloudstream3.utils.ExtractorApiKt.extractorApis
import com.lagradost.cloudstream3.utils.ExtractorApi.name
import com.lagradost.cloudstream3.AnimeSearchResponse.posterUrl
import com.lagradost.cloudstream3.MainAPIKt.addDubStatus
import com.lagradost.cloudstream3.MainAPIKt.addSub
import com.lagradost.cloudstream3.MovieSearchResponse.setYear
import com.lagradost.cloudstream3.MainAPIKt.addQuality
import com.lagradost.cloudstream3.TvSeriesSearchResponse.setQuality
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.type.TypeReference
import com.lagradost.cloudstream3.movieproviders.Vote
import com.lagradost.cloudstream3.movieproviders.Pivot
import com.lagradost.cloudstream3.movieproviders.Episodejson
import com.lagradost.cloudstream3.movieproviders.Season
import kotlin.jvm.internal.DefaultConstructorMarker
import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.TvType
import kotlin.collections.SetsKt
import com.lagradost.cloudstream3.HomePageResponse
import com.lagradost.cloudstream3.movieproviders.HDMovie5.QuickSearchResponse.Extra
import com.lagradost.cloudstream3.SearchResponse
import com.lagradost.cloudstream3.LoadResponse
import com.lagradost.cloudstream3.movieproviders.HDMovie5.PlayerAjaxResponse
import kotlin.jvm.JvmOverloads
import com.lagradost.cloudstream3.SubtitleFile
import com.lagradost.cloudstream3.utils.ExtractorLink
import kotlin.coroutines.jvm.internal.boxing
import com.lagradost.cloudstream3.ParCollections
import kotlin.text.StringsKt
import com.lagradost.cloudstream3.movieproviders.``HDMovie5$loadLinks$2`
import com.lagradost.cloudstream3.utils.AppUtils
import org.jsoup.nodes.Element
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: FilmanProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "", "item", "Lorg/jsoup/nodes/Element;", "kotlin.jvm.PlatformType"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.movieproviders.FilmanProvider\$loadLinks$2",
    m98f = "FilmanProvider.kt",
    m97i = [],
    m96l = [141],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* loaded from: classes3.dex */
class `FilmanProvider$loadLinks$2`(
    function1: Function1<in SubtitleFile, Unit>,
    function12: Function1<in ExtractorLink, Unit>,
    continuation: Continuation<in `FilmanProvider$loadLinks$2`?>?
) : SuspendLambda(2, continuation), Function2<Element, Continuation<in Unit>?, Object> {
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
        val `filmanProvider$loadLinks$2` =
            `FilmanProvider$loadLinks$2`(`$subtitleCallback`, `$callback`, continuation)
        `filmanProvider$loadLinks$2`.`L$0` = obj
        return `filmanProvider$loadLinks$2`
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(element: Element, continuation: Continuation<in Unit>?): Object {
        return (create(
            element,
            continuation
        ) as `FilmanProvider$loadLinks$2`).invokeSuspend(Unit.INSTANCE)
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        var src: String?
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            val attr: String = (`L$0` as Element?).select("a").attr("data-iframe")
            Intrinsics.checkNotNullExpressionValue(attr, "item.select(\"a\").attr(\"data-iframe\")")
            val base64Decode: String = MainAPIKt.base64Decode(attr)
            val appUtils = AppUtils.INSTANCE
            var linkElement: LinkElement? = null
            if (base64Decode != null) {
                try {
                    linkElement = MainAPIKt.getMapper().readValue(
                        base64Decode,
                        object :
                            TypeReference<LinkElement?>() { // from class: com.lagradost.cloudstream3.movieproviders.FilmanProvider$loadLinks$2$invokeSuspend$$inlined$tryParseJson$1
                        })
                } catch (unused: Exception) {
                }
            }
            val linkElement2 = linkElement
            if (linkElement2 == null || linkElement2.src.also { src = it } == null) {
                return Unit.INSTANCE
            }
            label = 1
            if (ExtractorApiKt.loadExtractor(
                    src,
                    `$subtitleCallback`,
                    `$callback`,
                    this
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