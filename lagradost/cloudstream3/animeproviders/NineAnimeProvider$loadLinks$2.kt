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

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: NineAnimeProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "", "it", "Lorg/jsoup/nodes/Element;", "kotlin.jvm.PlatformType"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.animeproviders.NineAnimeProvider\$loadLinks$2",
    m98f = "NineAnimeProvider.kt",
    m97i = [0, 1, 1],
    m96l = [340, 342],
    m95m = "invokeSuspend",
    m94n = ["name", "name", "url"],
    m93s = ["L$0", "L$0", "L$1"]
) /* loaded from: classes3.dex */
class `NineAnimeProvider$loadLinks$2`(/* synthetic */val `this$0`: NineAnimeProvider,
                                                     function1: Function1<SubtitleFile, Unit>,
                                                     function12: Function1<ExtractorLink, Unit>,
                                                     continuation: Continuation<in `NineAnimeProvider$loadLinks$2`?>?
) : SuspendLambda(2, continuation), Function2<Element, Continuation<in Unit>?, Object> {
    /* synthetic */ val `$callback`: Function1<ExtractorLink, Unit>
    /* synthetic */ val `$subtitleCallback`: Function1<SubtitleFile, Unit>

    /* synthetic */
    var `L$0`: Object? = null
    var `L$1`: Object? = null
    var label = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$subtitleCallback` = function1
        `$callback` = function12
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        val `nineAnimeProvider$loadLinks$2` = `NineAnimeProvider$loadLinks$2`(
            `this$0`,
            `$subtitleCallback`,
            `$callback`,
            continuation
        )
        `nineAnimeProvider$loadLinks$2`.`L$0` = obj
        return `nineAnimeProvider$loadLinks$2`
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(element: Element, continuation: Continuation<in Unit>?): Object {
        return (create(
            element,
            continuation
        ) as `NineAnimeProvider$loadLinks$2`).invokeSuspend(Unit.INSTANCE)
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0094 A[Catch: Exception -> 0x00cc, TryCatch #0 {Exception -> 0x00cc, blocks: (B:7:0x0018, B:29:0x008c, B:31:0x0094, B:12:0x002c, B:18:0x0059, B:20:0x005d, B:22:0x0063, B:25:0x006a, B:32:0x00c9, B:15:0x003a), top: B:38:0x000a }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun invokeSuspend(r17: Any?): Any {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.animeproviders.NineAnimeProvider\$loadLinks$2.invokeSuspend(java.lang.Object):java.lang.Object")
    }
}