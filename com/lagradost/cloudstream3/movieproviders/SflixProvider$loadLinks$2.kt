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
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: SflixProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "", "url", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.movieproviders.SflixProvider\$loadLinks$2",
    m98f = "SflixProvider.kt",
    m97i = [],
    m96l = [329],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* loaded from: classes3.dex */
class `SflixProvider$loadLinks$2`(/* synthetic */val `this$0`: SflixProvider,
                                                 function1: Function1<in SubtitleFile, Unit>,
                                                 function12: Function1<in ExtractorLink, Unit>,
                                                 continuation: Continuation<in `SflixProvider$loadLinks$2`?>?
) : SuspendLambda(2, continuation), Function2<String, Continuation<in Unit>?, Object> {
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
        val `sflixProvider$loadLinks$2` =
            `SflixProvider$loadLinks$2`(`this$0`, `$subtitleCallback`, `$callback`, continuation)
        `sflixProvider$loadLinks$2`.`L$0` = obj
        return `sflixProvider$loadLinks$2`
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(str: String, continuation: Continuation<in Unit>?): Object {
        return (create(
            str,
            continuation
        ) as `SflixProvider$loadLinks$2`).invokeSuspend(Unit.INSTANCE)
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: SflixProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"],
        m107d2 = ["<anonymous>", ""],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    @DebugMetadata(
        m99c = "com.lagradost.cloudstream3.movieproviders.SflixProvider\$loadLinks$2$1",
        m98f = "SflixProvider.kt",
        m97i = [],
        m96l = [340, 348, 350],
        m95m = "invokeSuspend",
        m94n = [],
        m93s = []
    ) /* renamed from: com.lagradost.cloudstream3.movieproviders.SflixProvider$loadLinks$2$1 */ /* loaded from: classes3.dex */
    class C48231 internal constructor(/* synthetic */val `$url`: String?, /* synthetic */
                                                     val `this$0`: SflixProvider,
                                                     function1: Function1<in SubtitleFile, Unit>,
                                                     function12: Function1<in ExtractorLink, Unit>,
                                                     continuation: Continuation<in C48231?>?
    ) : SuspendLambda(1, continuation), Function1<Continuation<in Unit>?, Object?> {
        /* synthetic */ val `$callback`: Function1<ExtractorLink, Unit>
        /* synthetic */ val `$subtitleCallback`: Function1<SubtitleFile, Unit>
        var label = 0

        /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: SflixProvider.kt */
        @Metadata(
            m108d1 = ["\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"],
            m107d2 = ["<anonymous>", "", "it", "invoke"],
            m106k = 3,
            m105mv = [1, 6, 0],
            m103xi = 48
        ) /* renamed from: com.lagradost.cloudstream3.movieproviders.SflixProvider$loadLinks$2$1$1 */ /* loaded from: classes3.dex */
        class C48241 internal constructor() : Lambda<Any?>(1), Function1<String?, String?> {
            @Override // kotlin.jvm.functions.Function1
            override operator fun invoke(it: String): String {
                Intrinsics.checkNotNullParameter(it, "it")
                return it
            }

            companion object {
                val INSTANCE = C48241()
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
        init {
            `$subtitleCallback` = function1
            `$callback` = function12
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        override fun create(continuation: Continuation<*>?): Continuation<Unit> {
            return C48231(`$url`, `this$0`, `$subtitleCallback`, `$callback`, continuation)
        }

        @Override // kotlin.jvm.functions.Function1
        override operator fun invoke(continuation: Continuation<in Unit>): Object {
            return (create(continuation) as C48231).invokeSuspend(Unit.INSTANCE)
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        override fun invokeSuspend(obj: Object): Object {
            val obj2: Object
            val extractRabbitStream: Object
            val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
            val i = label
            if (i == 0) {
                ResultKt.throwOnFailure(obj)
                val `substringAfterLast$default`: String = StringsKt.`substringAfterLast$default`(
                    `$url`, ".", null as String?, 2, null as Object?
                )
                val app: RequestCustom = MainActivityKt.getApp()
                label = 1
                obj2 = Requests.`get$default`(
                    app,
                    `this$0`.getMainUrl()
                        .toString() + "/ajax/get_link/" + `substringAfterLast$default`,
                    null,
                    null,
                    null,
                    null,
                    false,
                    0,
                    null,
                    0L,
                    null,
                    false,
                    this,
                    2046,
                    null
                )
                if (obj2 === coroutine_suspended) {
                    return coroutine_suspended
                }
            } else if (i != 1) {
                if (i == 2 || i == 3) {
                    ResultKt.throwOnFailure(obj)
                    return Unit.INSTANCE
                }
                throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
            } else {
                ResultKt.throwOnFailure(obj)
                obj2 = obj
            }
            val link: String = (Requests.Companion.getMapper().readValue<IframeJson>(
                (obj2 as NiceResponse).getText(),
                object :
                    TypeReference<IframeJson?>() { // from class: com.lagradost.cloudstream3.movieproviders.SflixProvider$loadLinks$2$1$invokeSuspend$$inlined$parsed$1
                }) as IframeJson).getLink() ?: return Unit.INSTANCE
            if (StringsKt.contains(link as CharSequence, "streamlare" as CharSequence, true)) {
                label = 2
                if (ExtractorApiKt.loadExtractor(
                        link,
                        null,
                        `$subtitleCallback`,
                        `$callback`,
                        this
                    ) === coroutine_suspended
                ) {
                    return coroutine_suspended
                }
            } else {
                label = 3
                extractRabbitStream = SflixProvider.Companion.Companion.extractRabbitStream(
                    `this$0`,
                    link,
                    `$subtitleCallback`,
                    `$callback`,
                    false,
                    if (r19 and 16 !== 0) null else null,
                    C48241.INSTANCE,
                    this
                )
                if (extractRabbitStream === coroutine_suspended) {
                    return coroutine_suspended
                }
            }
            return Unit.INSTANCE
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        var obj: Object = obj
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            label = 1
            obj = ArchComponentExt.suspendSafeApiCall<Unit>(
                C48231(
                    `L$0` as String?,
                    `this$0`,
                    `$subtitleCallback`,
                    `$callback`,
                    null
                ), this
            )
            if (obj === coroutine_suspended) {
                return coroutine_suspended
            }
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            ResultKt.throwOnFailure(obj)
        }
        return obj
    }
}