package com.lagradost.cloudstream3.movieproviders

import com.fasterxml.jackson.core.type.TypeReference
import com.lagradost.cloudstream3.utils.AppUtils
import org.jsoup.nodes.Element
import java.util.ArrayList
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: TheFlixToProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "", "url", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.movieproviders.TheFlixToProvider\$search$2",
    m98f = "TheFlixToProvider.kt",
    m97i = [],
    m96l = [bqk.f6597cd],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
)
/* loaded from: classes3.dex */
internal class `TheFlixToProvider$search$2`(/* synthetic */val `this$0`: TheFlixToProvider,
                                                           arrayList: ArrayList<SearchResponse?>,
                                                           continuation: Continuation<in `TheFlixToProvider$search$2`?>?
) : SuspendLambda(2, continuation), Function2<String, Continuation<in Unit>?, Object> {
    /* synthetic */ val `$search`: ArrayList<SearchResponse>

    /* synthetic */
    var `L$0`: Object? = null
    var label = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$search` = arrayList
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        val `theFlixToProvider$search$2` =
            `TheFlixToProvider$search$2`(`this$0`, `$search`, continuation)
        `theFlixToProvider$search$2`.`L$0` = obj
        return `theFlixToProvider$search$2`
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(str: String, continuation: Continuation<in Unit>?): Object {
        return (create(
            str,
            continuation
        ) as `TheFlixToProvider$search$2`).invokeSuspend(Unit.INSTANCE)
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val obj2: Object
        var cleanTitle: String
        var sb: String
        var add: Boolean
        var cleanTitle2: String
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        var z = true
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            val str = `L$0` as String?
            label = 1
            obj2 = Requests.`get$default`(
                MainActivityKt.getApp(),
                str,
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
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            ResultKt.throwOnFailure(obj)
            obj2 = obj
        }
        val selectFirst: Element =
            (obj2 as NiceResponse).getDocument().selectFirst("script[type=application/json]")
        Intrinsics.checkNotNull(selectFirst)
        val scriptText: String = selectFirst.data()
        Intrinsics.checkNotNullExpressionValue(scriptText, "scriptText")
        var z2 = false
        if (StringsKt.`contains$default`(
                scriptText as CharSequence,
                "pageProps" as CharSequence,
                false,
                2,
                null as Object?
            )
        ) {
            val appUtils = AppUtils.INSTANCE
            val mainList: SearchMainList = (MainAPIKt.getMapper().readValue(
                scriptText,
                object :
                    TypeReference<SearchJson?>() { // from class: com.lagradost.cloudstream3.movieproviders.TheFlixToProvider$search$2$invokeSuspend$$inlined$parseJson$1
                }) as SearchJson).getProps().getPageProps().getMainList()
            val listOf: List<Tuples<*, *>> = CollectionsKt.listOf<Tuples<*, *>>(
                Tuples<Any?, Any?>(
                    mainList.getDocs(),
                    mainList.getType()
                )
            )
            val theFlixToProvider = `this$0`
            val arrayList: ArrayList<SearchResponse> = `$search`
            var i2 = 10
            val arrayList2 = ArrayList(CollectionsKt.collectionSizeOrDefault(listOf, 10))
            for (tuples in listOf) {
                val str2 = tuples.component2() as String
                val arrayList3: ArrayList<Docs> = tuples.component1() as ArrayList
                val arrayList4 = ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, i2))
                for (docs in arrayList3) {
                    val name: String = docs.getName()
                    val posterUrl: String = docs.getPosterUrl()
                    val tvType: TvType = if (str2 != null && StringsKt.`contains$default`(
                            str2,
                            "TV",
                            z2,
                            2,
                            null as Object?
                        ) == z
                    ) TvType.TvSeries else TvType.Movie
                    if (tvType === TvType.Movie) {
                        val sb2 = StringBuilder()
                        sb2.append(theFlixToProvider.getMainUrl())
                        sb2.append("/movie/")
                        sb2.append(docs.getId())
                        sb2.append('-')
                        cleanTitle2 = theFlixToProvider.cleanTitle(name)
                        sb2.append(cleanTitle2)
                        sb = sb2.toString()
                    } else {
                        val sb3 = StringBuilder()
                        sb3.append(theFlixToProvider.getMainUrl())
                        sb3.append("/tv-show/")
                        sb3.append(docs.getId())
                        sb3.append('-')
                        cleanTitle = theFlixToProvider.cleanTitle(name)
                        sb3.append(cleanTitle)
                        sb3.append("/season-1/episode-1")
                        sb = sb3.toString()
                    }
                    val str3 = sb
                    add = if (tvType === TvType.Movie) {
                        arrayList.add(
                            MovieSearchResponse(
                                name,
                                str3,
                                theFlixToProvider.getName(),
                                TvType.Movie,
                                posterUrl,
                                null,
                                null,
                                null,
                                null,
                                448,
                                null
                            )
                        )
                    } else {
                        arrayList.add(
                            TvSeriesSearchResponse(
                                name,
                                str3,
                                theFlixToProvider.getName(),
                                TvType.TvSeries,
                                posterUrl,
                                null,
                                null,
                                null,
                                null,
                                null,
                                MediaRouterJellybean.DEVICE_OUT_BLUETOOTH,
                                null
                            )
                        )
                    }
                    arrayList4.add(boxing.boxBoolean(add))
                    z = true
                    z2 = false
                }
                arrayList2.add(arrayList4)
                z = true
                z2 = false
                i2 = 10
            }
        }
        return Unit.INSTANCE
    }
}