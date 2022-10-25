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
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: ZoroProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/lagradost/cloudstream3/DubStatus;", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.animeproviders.ZoroProvider\$loadLinks$3",
    m98f = "ZoroProvider.kt",
    m97i = [0, 1, 1],
    m96l = [346, 350, 353],
    m95m = "invokeSuspend",
    m94n = ["it", "it", "extractorLink"],
    m93s = ["L$0", "L$0", "L$1"]
) /* loaded from: classes3.dex */
class `ZoroProvider$loadLinks$3`(/* synthetic */val `this$0`: ZoroProvider,
                                                function1: Function1<SubtitleFile, Unit>,
                                                function12: Function1<ExtractorLink, Unit>,
                                                str: String,
                                                continuation: Continuation<in `ZoroProvider$loadLinks$3`?>?
) : SuspendLambda(2, continuation),
    Function2<Tuples<out DubStatus?, out String?>, Continuation<in Unit>?, Object> {
    /* synthetic */ val `$callback`: Function1<ExtractorLink, Unit>
    /* synthetic */ val `$extractorData`: String
    /* synthetic */ val `$subtitleCallback`: Function1<SubtitleFile, Unit>

    /* synthetic */
    var `L$0`: Object? = null
    var `L$1`: Object? = null
    var label = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$subtitleCallback` = function1
        `$callback` = function12
        `$extractorData` = str
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        val `zoroProvider$loadLinks$3` = `ZoroProvider$loadLinks$3`(
            `this$0`,
            `$subtitleCallback`,
            `$callback`,
            `$extractorData`,
            continuation
        )
        `zoroProvider$loadLinks$3`.`L$0` = obj
        return `zoroProvider$loadLinks$3`
    }

    @Override // kotlin.jvm.functions.Function2
    /* bridge */ /* synthetic */  override fun invoke(
        tuples: Tuples<out DubStatus?, out String?>,
        continuation: Continuation<in Unit>?
    ): Object {
        return invoke2(tuples as Tuples<out DubStatus?, String?>, continuation)
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(
        tuples: Tuples<out DubStatus?, String?>,
        continuation: Continuation<in Unit>?
    ): Object {
        return (create(
            tuples,
            continuation
        ) as `ZoroProvider$loadLinks$3`).invokeSuspend(Unit.INSTANCE)
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun invokeSuspend(r25: Any?): Any {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.animeproviders.ZoroProvider\$loadLinks$3.invokeSuspend(java.lang.Object):java.lang.Object")
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: ZoroProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
        m107d2 = ["<anonymous>", "", "videoLink", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "invoke"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.animeproviders.ZoroProvider$loadLinks$3$1 */ /* loaded from: classes3.dex */
    class C47711 internal constructor(function1: Function1<ExtractorLink?, Unit>) : Lambda<Any?>(1),
        Function1<ExtractorLink, Unit> {
        /* synthetic */ val `$callback`: Function1<ExtractorLink, Unit>

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
        init {
            `$callback` = function1
        }

        @Override // kotlin.jvm.functions.Function1
        /* bridge */ /* synthetic */  override fun invoke(extractorLink: ExtractorLink) {
            invoke2(extractorLink)
            return Unit.INSTANCE
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        fun invoke2(videoLink: ExtractorLink) {
            Intrinsics.checkNotNullParameter(videoLink, "videoLink")
            if (StringsKt.`contains$default`(
                    videoLink.url as CharSequence,
                    "betterstream" as CharSequence,
                    false,
                    2,
                    null as Object?
                )
            ) {
                return
            }
            `$callback`.invoke(videoLink)
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: ZoroProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"],
        m107d2 = ["<anonymous>", "", "sourceName", "invoke"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.animeproviders.ZoroProvider$loadLinks$3$2 */ /* loaded from: classes3.dex */
    class C47722 internal constructor(tuples: Tuples<out DubStatus, String>) : Lambda<Any?>(1),
        Function1<String, String> {
        /* synthetic */ val `$it`: Tuples<DubStatus, String>

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
        init {
            `$it` = tuples
        }

        @Override // kotlin.jvm.functions.Function1
        override fun invoke(sourceName: String): String {
            Intrinsics.checkNotNullParameter(sourceName, "sourceName")
            return sourceName + " - " + `$it`.getFirst()
        }
    }
}