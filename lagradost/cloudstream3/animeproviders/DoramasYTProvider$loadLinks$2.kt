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
import org.jsoup.nodes.Element
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: DoramasYTProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "", "it", "Lorg/jsoup/nodes/Element;", "kotlin.jvm.PlatformType"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.animeproviders.DoramasYTProvider\$loadLinks$2",
    m98f = "DoramasYTProvider.kt",
    m97i = [],
    m96l = [146, 150],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* loaded from: classes3.dex */
class `DoramasYTProvider$loadLinks$2`(/* synthetic */val `this$0`: DoramasYTProvider,
                                                     function1: Function1<SubtitleFile, Unit>,
                                                     function12: Function1<ExtractorLink, Unit>,
                                                     continuation: Continuation<in `DoramasYTProvider$loadLinks$2`?>?
) : SuspendLambda(2, continuation), Function2<Element, Continuation<in Object?>?, Object> {
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
        val `doramasYTProvider$loadLinks$2` = `DoramasYTProvider$loadLinks$2`(
            `this$0`,
            `$subtitleCallback`,
            `$callback`,
            continuation
        )
        `doramasYTProvider$loadLinks$2`.`L$0` = obj
        return `doramasYTProvider$loadLinks$2`
    }

    @Override // kotlin.jvm.functions.Function2
    /* bridge */ /* synthetic */  override fun invoke(
        element: Element,
        continuation: Continuation<in Object?>?
    ): Object {
        return invoke2(element, continuation as Continuation<Object?>?)
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(element: Element, continuation: Continuation<Object?>?): Object {
        return (create(
            element,
            continuation
        ) as `DoramasYTProvider$loadLinks$2`).invokeSuspend(Unit.INSTANCE)
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val `url$default`: Object
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            val encodedurl: String = (`L$0` as Element?).select(TtmlNode.TAG_P).attr("data-player")
            Intrinsics.checkNotNullExpressionValue(encodedurl, "encodedurl")
            val `replace$default`: String = StringsKt.`replace$default`(
                base64Decode(encodedurl),
                "https://doramasyt.com/reproductor?url=",
                "",
                false,
                4,
                null as Object?
            )
            if (StringsKt.`startsWith$default`(
                    `replace$default`,
                    "https://www.fembed.com",
                    false,
                    2,
                    null as Object?
                )
            ) {
                label = 1
                `url$default` =
                    ExtractorApi.`getUrl$default`(FEmbed(), `replace$default`, null, this, 2, null)
                if (`url$default` === coroutine_suspended) {
                    return coroutine_suspended
                }
            } else {
                label = 2
                val loadExtractor: Object = ExtractorApiKt.loadExtractor(
                    `replace$default`,
                    `this$0`.getMainUrl(),
                    `$subtitleCallback`,
                    `$callback`,
                    this
                )
                return if (loadExtractor === coroutine_suspended) coroutine_suspended else loadExtractor
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj)
            `url$default` = obj
        } else {
            if (i == 2) {
                ResultKt.throwOnFailure(obj)
                return obj
            }
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        }
        val function1: Function1<ExtractorLink, Unit> = `$callback`
        for (extractorLink in `url$default`) {
            function1.invoke(extractorLink)
        }
        return Unit.INSTANCE
    }
}