package com.lagradost.cloudstream3.movieproviders

import org.jsoup.nodes.Element
import java.util.ArrayList
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: TocanimeProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/AnimeLoadResponse;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class `TocanimeProvider$load$2`(/* synthetic */val `this$0`: TocanimeProvider,
                                               document: Document,
                                               list: List<Episode>,
                                               str: String
) : Lambda<Any?>(1), Function1<AnimeLoadResponse, Unit> {
    /* synthetic */ val `$document`: Document
    /* synthetic */ val `$episodes`: List<Episode>
    /* synthetic */ val `$trailer`: String

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$document` = document
        `$episodes` = list
        `$trailer` = str
    }

    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override fun invoke(animeLoadResponse: AnimeLoadResponse) {
        invoke2(animeLoadResponse)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(newAnimeLoadResponse: AnimeLoadResponse) {
        var searchResult: AnimeSearchResponse
        Intrinsics.checkNotNullParameter(newAnimeLoadResponse, "\$this\$newAnimeLoadResponse")
        val tocanimeProvider = `this$0`
        val selectFirst: Element = `$document`.selectFirst("img.img")
        newAnimeLoadResponse.posterUrl =
            MainAPIKt.fixUrlNull(tocanimeProvider, selectFirst?.attr("data-original"))
        val text: String = `$document`.select("dl.movie-des dd").get(1).text()
        Intrinsics.checkNotNullExpressionValue(
            text,
            "document.select(\"dl.movie-des dd\")[1].text()"
        )
        newAnimeLoadResponse.setYear(
            StringsKt.toIntOrNull(
                CollectionsKt.last<Any>(
                    StringsKt.`split$default`(
                        text as CharSequence,
                        arrayOf("/"),
                        false,
                        0,
                        6,
                        null as Object?
                    ) as List<Object?>?
                ) as String?
            )
        )
        newAnimeLoadResponse.showStatus = TocanimeProvider.Companion.Companion.getStatus(
            `$document`.select("dl.movie-des dd").get(0).text().toString()
        )
        newAnimeLoadResponse.plot = `$document`.select("div.box-content > p").text()
        val select: Elements = `$document`.select("dl.movie-des dd").get(4).select("li")
        Intrinsics.checkNotNullExpressionValue(
            select,
            "document.select(\"dl.movie-des dd\")[4].select(\"li\")"
        )
        val elements: Elements<Element> = select
        val arrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(elements, 10))
        for (element in elements) {
            val text2: String = element.select("a").text()
            Intrinsics.checkNotNullExpressionValue(text2, "it.select(\"a\").text()")
            arrayList.add(
                StringsKt.trim(
                    StringsKt.removeSuffix(
                        text2,
                        "," as CharSequence
                    ) as CharSequence?
                ).toString()
            )
        }
        newAnimeLoadResponse.tags = arrayList
        val select2: Elements = `$document`.select("div.col-lg-3.col-md-4.col-6")
        Intrinsics.checkNotNullExpressionValue(
            select2,
            "document.select(\"div.col-lg-3.col-md-4.col-6\")"
        )
        val elements2: Elements = select2
        val tocanimeProvider2 = `this$0`
        val arrayList2 = ArrayList(CollectionsKt.collectionSizeOrDefault(elements2, 10))
        for (it in elements2) {
            Intrinsics.checkNotNullExpressionValue(it, "it")
            searchResult = tocanimeProvider2.toSearchResult(it)
            arrayList2.add(searchResult)
        }
        newAnimeLoadResponse.setRecommendations(arrayList2)
        MainAPIKt.addEpisodes(newAnimeLoadResponse, DubStatus.Subbed, `$episodes`)
        LoadResponse.Companion.addTrailer(newAnimeLoadResponse, `$trailer`)
    }
}