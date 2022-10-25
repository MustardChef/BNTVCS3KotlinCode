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
import com.lagradost.cloudstream3.mvvm.Resource
import org.jsoup.nodes.Element
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: YomoviesProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"],
    m107d2 = ["<anonymous>", "Lcom/lagradost/cloudstream3/mvvm/Resource;", "", "source", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.movieproviders.YomoviesProvider\$loadLinks$3",
    m98f = "YomoviesProvider.kt",
    m97i = [],
    m96l = [118],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* loaded from: classes3.dex */
class `YomoviesProvider$loadLinks$3`(/* synthetic */val `this$0`: YomoviesProvider,
                                                    function1: Function1<in SubtitleFile, Unit>,
                                                    function12: Function1<in ExtractorLink, Unit>,
                                                    continuation: Continuation<in `YomoviesProvider$loadLinks$3`?>?
) : SuspendLambda(2, continuation),
    Function2<String, Continuation<in Resource<out Object?>?>?, Object> {
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
        val `yomoviesProvider$loadLinks$3` =
            `YomoviesProvider$loadLinks$3`(`this$0`, `$subtitleCallback`, `$callback`, continuation)
        `yomoviesProvider$loadLinks$3`.`L$0` = obj
        return `yomoviesProvider$loadLinks$3`
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(
        str: String,
        continuation: Continuation<in Resource<out Object?>?>?
    ): Object {
        return (create(
            str,
            continuation
        ) as `YomoviesProvider$loadLinks$3`).invokeSuspend(Unit.INSTANCE)
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: YomoviesProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001H\u008a@"],
        m107d2 = ["<anonymous>", ""],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    @DebugMetadata(
        m99c = "com.lagradost.cloudstream3.movieproviders.YomoviesProvider\$loadLinks$3$1",
        m98f = "YomoviesProvider.kt",
        m97i = [],
        m96l = [120, 132],
        m95m = "invokeSuspend",
        m94n = [],
        m93s = []
    ) /* renamed from: com.lagradost.cloudstream3.movieproviders.YomoviesProvider$loadLinks$3$1 */ /* loaded from: classes3.dex */
    class C48321 internal constructor(/* synthetic */val `$source`: String?, /* synthetic */
                                                     val `this$0`: YomoviesProvider,
                                                     function1: Function1<in SubtitleFile, Unit>,
                                                     function12: Function1<in ExtractorLink, Unit>,
                                                     continuation: Continuation<in C48321?>?
    ) : SuspendLambda(1, continuation), Function1<Continuation<in Object?>?, Object?> {
        /* synthetic */ val `$callback`: Function1<ExtractorLink, Unit>
        /* synthetic */ val `$subtitleCallback`: Function1<SubtitleFile, Unit>
        var label = 0

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
        init {
            `$subtitleCallback` = function1
            `$callback` = function12
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        override fun create(continuation: Continuation<*>?): Continuation<Unit> {
            return C48321(`$source`, `this$0`, `$subtitleCallback`, `$callback`, continuation)
        }

        @Override // kotlin.jvm.functions.Function1
        /* bridge */ /* synthetic */  override operator fun invoke(continuation: Continuation<in Object?>): Object {
            return invoke2(continuation as Continuation<Object?>)
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        fun invoke2(continuation: Continuation<Object?>?): Object {
            return (create(continuation) as C48321).invokeSuspend(Unit.INSTANCE)
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        override fun invokeSuspend(obj: Object): Object {
            val obj2: Object
            val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
            val i = label
            if (i == 0) {
                ResultKt.throwOnFailure(obj)
                if (StringsKt.`startsWith$default`(
                        `$source`,
                        "https://membed.net",
                        false,
                        2,
                        null as Object?
                    )
                ) {
                    val app: RequestCustom = MainActivityKt.getApp()
                    val str = `$source`
                    label = 1
                    obj2 = Requests.`get$default`(
                        app,
                        str,
                        null,
                        `this$0`.getMainUrl() + JsonPointer.SEPARATOR,
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
                } else {
                    val str2 = `$source`
                    label = 2
                    val loadExtractor: Object = ExtractorApiKt.loadExtractor(
                        str2,
                        `this$0`.getMainUrl() + JsonPointer.SEPARATOR,
                        `$subtitleCallback`,
                        `$callback`,
                        this
                    )
                    return if (loadExtractor === coroutine_suspended) coroutine_suspended else loadExtractor
                }
            } else if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj)
                    return obj
                }
                throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
            } else {
                ResultKt.throwOnFailure(obj)
                obj2 = obj
            }
            val select: Elements =
                (obj2 as NiceResponse).getDocument().select("ul.list-server-items li")
            Intrinsics.checkNotNullExpressionValue(
                select,
                "app.get(\n               …ul.list-server-items li\")"
            )
            return ParCollections.apmap(
                select,
                C48331(`this$0`, `$subtitleCallback`, `$callback`, null)
            )
        }

        /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: YomoviesProvider.kt */
        @Metadata(
            m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\u008a@"],
            m107d2 = ["<anonymous>", "", "it", "Lorg/jsoup/nodes/Element;", "kotlin.jvm.PlatformType"],
            m106k = 3,
            m105mv = [1, 6, 0],
            m103xi = 48
        )
        @DebugMetadata(
            m99c = "com.lagradost.cloudstream3.movieproviders.YomoviesProvider\$loadLinks$3$1$1",
            m98f = "YomoviesProvider.kt",
            m97i = [],
            m96l = [125],
            m95m = "invokeSuspend",
            m94n = [],
            m93s = []
        ) /* renamed from: com.lagradost.cloudstream3.movieproviders.YomoviesProvider$loadLinks$3$1$1 */ /* loaded from: classes3.dex */
        class C48331 internal constructor(/* synthetic */val `this$0`: YomoviesProvider,
                                                         function1: Function1<in SubtitleFile, Unit>,
                                                         function12: Function1<in ExtractorLink, Unit>,
                                                         continuation: Continuation<in C48331?>?
        ) : SuspendLambda(2, continuation), Function2<Element, Continuation<in Boolean?>?, Object> {
            /* synthetic */ val `$callback`: Function1<ExtractorLink, Unit>
            /* synthetic */ val `$subtitleCallback`: Function1<SubtitleFile, Unit>

            /* synthetic */
            var `L$0`: Object? = null
            var label = 0

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
            init {
                `$subtitleCallback` = function1
                `$callback` = function12
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
                val c48331 = C48331(`this$0`, `$subtitleCallback`, `$callback`, continuation)
                c48331.`L$0` = obj
                return c48331
            }

            @Override // kotlin.jvm.functions.Function2
            override fun invoke(
                element: Element,
                continuation: Continuation<in Boolean?>?
            ): Object {
                return (create(element, continuation) as C48331).invokeSuspend(Unit.INSTANCE)
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            override fun invokeSuspend(obj: Object): Object {
                var obj: Object = obj
                val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
                val i = label
                if (i == 0) {
                    ResultKt.throwOnFailure(obj)
                    val attr: String = (`L$0` as Element?)!!.attr("data-video")
                    Intrinsics.checkNotNullExpressionValue(attr, "it.attr(\"data-video\")")
                    val `substringBefore$default`: String = StringsKt.`substringBefore$default`(
                        attr,
                        "=https://msubload",
                        null as String?,
                        2,
                        null as Object?
                    )
                    label = 1
                    obj = ExtractorApiKt.loadExtractor(
                        `substringBefore$default`,
                        `this$0`.getMainUrl() + JsonPointer.SEPARATOR,
                        `$subtitleCallback`,
                        `$callback`,
                        this
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
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        var obj: Object = obj
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            label = 1
            obj = ArchComponentExt.safeApiCall(
                C48321(
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