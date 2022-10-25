package com.lagradost.cloudstream3.movieproviders

import java.util.ArrayList
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: PelisplusProviderTemplate.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "", "url", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.movieproviders.PelisplusProviderTemplate\$getMainPage$2",
    m98f = "PelisplusProviderTemplate.kt",
    m97i = [],
    m96l = [150],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* loaded from: classes3.dex */
class `PelisplusProviderTemplate$getMainPage$2`(/* synthetic */val `this$0`: PelisplusProviderTemplate,
                                                               arrayList: ArrayList<HomePageList?>,
                                                               continuation: Continuation<in `PelisplusProviderTemplate$getMainPage$2`?>?
) : SuspendLambda(2, continuation), Function2<String, Continuation<in Unit>?, Object> {
    /* synthetic */ val `$homePageList`: ArrayList<HomePageList>

    /* synthetic */
    var `L$0`: Object? = null
    var label = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$homePageList` = arrayList
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        val `pelisplusProviderTemplate$getMainPage$2` = `PelisplusProviderTemplate$getMainPage$2`(
            `this$0`, `$homePageList`, continuation
        )
        `pelisplusProviderTemplate$getMainPage$2`.`L$0` = obj
        return `pelisplusProviderTemplate$getMainPage$2`
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(str: String, continuation: Continuation<in Unit>?): Object {
        return (create(
            str,
            continuation
        ) as `PelisplusProviderTemplate$getMainPage$2`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val obj2: Object
        var cleanName: String
        var cleanName2: String
        var movieSearchResponse: SearchResponse?
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
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
                20L,
                null,
                false,
                this,
                1790,
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
        val select: Elements =
            Jsoup.parse((obj2 as NiceResponse).getText()).select("div.main-inner")
        if (select != null) {
            val pelisplusProviderTemplate = `this$0`
            val arrayList: ArrayList<HomePageList> = `$homePageList`
            for (element in select) {
                val text: String = element.select(".widget-title").text()
                Intrinsics.checkNotNullExpressionValue(
                    text,
                    "inner.select(\".widget-title\").text()"
                )
                cleanName = pelisplusProviderTemplate.cleanName(text)
                val select2: Elements = element.select(".video-block")
                Intrinsics.checkNotNullExpressionValue(select2, "inner.select(\".video-block\")")
                val elements: Elements = select2
                val arrayList2 = ArrayList(CollectionsKt.collectionSizeOrDefault(elements, 10))
                for (element2 in elements) {
                    val attr: String =
                        element2.select("a").attr(ShareConstants.WEB_DIALOG_PARAM_HREF)
                    Intrinsics.checkNotNullExpressionValue(attr, "it.select(\"a\").attr(\"href\")")
                    val fixUrl: String = MainAPIKt.fixUrl(pelisplusProviderTemplate, attr)
                    val attr2: String = element2.select(".picture > img").attr("src")
                    Intrinsics.checkNotNullExpressionValue(
                        attr2,
                        "it.select(\".picture > img\").attr(\"src\")"
                    )
                    val `replace$default`: String = StringsKt.`replace$default`(
                        attr2,
                        "//img",
                        "https://img",
                        false,
                        4,
                        null as Object?
                    )
                    val text2: String = element2.select("div.name").text()
                    Intrinsics.checkNotNullExpressionValue(text2, "it.select(\"div.name\").text()")
                    cleanName2 = pelisplusProviderTemplate.cleanName(text2)
                    val str2 = cleanName2
                    val z = false
                    if (if (StringsKt.`contains$default`(
                                str2 as CharSequence,
                                "Temporada" as CharSequence,
                                false,
                                2,
                                null as Object?
                            ) || StringsKt.`contains$default`(
                                str2 as CharSequence,
                                "Capítulo" as CharSequence,
                                false,
                                2,
                                null as Object?
                            )
                        ) true else true
                    ) {
                        movieSearchResponse = TvSeriesSearchResponse(
                            cleanName2,
                            fixUrl,
                            pelisplusProviderTemplate.name,
                            TvType.TvSeries,
                            `replace$default`,
                            null,
                            null,
                            null,
                            null,
                            null,
                            MediaRouterJellybean.DEVICE_OUT_BLUETOOTH,
                            null
                        )
                    } else {
                        movieSearchResponse = MovieSearchResponse(
                            cleanName2,
                            fixUrl,
                            pelisplusProviderTemplate.name,
                            TvType.Movie,
                            `replace$default`,
                            null,
                            null,
                            null,
                            null,
                            384,
                            null
                        )
                    }
                    arrayList2.add(movieSearchResponse)
                }
                arrayList.add(HomePageList(cleanName, arrayList2, null, null, null, 28, null))
            }
            return Unit.INSTANCE
        }
        return null
    }
}