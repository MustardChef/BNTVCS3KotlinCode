package com.lagradost.cloudstream3.animeproviders

import org.jsoup.nodes.Element
import java.util.ArrayList
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: NineAnimeProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/AnimeLoadResponse;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class `NineAnimeProvider$load$3`(
    arrayList: ArrayList<Episode?>,
    arrayList2: ArrayList<Episode?>,
    element: Element,
    element2: Element,
    element3: Element
) : Lambda<Any?>(1), Function1<AnimeLoadResponse, Unit> {
    /* synthetic */ val `$binfo`: Element
    /* synthetic */ val `$dubEpisodes`: ArrayList<Episode>
    /* synthetic */ val `$info`: Element
    /* synthetic */ val `$ratingElement`: Element
    /* synthetic */ val `$subEpisodes`: ArrayList<Episode>

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$dubEpisodes` = arrayList
        `$subEpisodes` = arrayList2
        `$info` = element
        `$binfo` = element2
        `$ratingElement` = element3
    }

    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override fun invoke(animeLoadResponse: AnimeLoadResponse) {
        invoke2(animeLoadResponse)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(newAnimeLoadResponse: AnimeLoadResponse) {
        Intrinsics.checkNotNullParameter(newAnimeLoadResponse, "\$this\$newAnimeLoadResponse")
        MainAPIKt.addEpisodes(newAnimeLoadResponse, DubStatus.Dubbed, `$dubEpisodes`)
        MainAPIKt.addEpisodes(newAnimeLoadResponse, DubStatus.Subbed, `$subEpisodes`)
        val selectFirst: Element = `$info`.selectFirst(".synopsis > .shorting > .content")
        newAnimeLoadResponse.plot = selectFirst?.text()
        val selectFirst2: Element = `$binfo`.selectFirst(".poster > span > img")
        newAnimeLoadResponse.posterUrl = selectFirst2?.attr("src")
        val attr: String = `$ratingElement`.attr("data-score")
        Intrinsics.checkNotNullExpressionValue(attr, "ratingElement.attr(\"data-score\")")
        newAnimeLoadResponse.setRating(Integer.valueOf((Float.parseFloat(attr) * 1000.0f) as Int))
        val select: Elements = `$info`.select(".bmeta > .meta > div")
        Intrinsics.checkNotNullExpressionValue(select, "info.select(\".bmeta > .meta > div\")")
        for (element in select) {
            val ownText: String = element.ownText()
            if (ownText != null) {
                when (ownText.hashCode()) {
                    -1774937088 -> if (ownText.equals("Type: ")) {
                        val selectFirst3: Element = element.selectFirst("span > a")
                        newAnimeLoadResponse.setType(
                            if (Intrinsics.areEqual(
                                    selectFirst3?.text(), "ONA"
                                )
                            ) TvType.OVA else newAnimeLoadResponse.getType()
                        )
                        break
                    } else {
                        continue
                    }
                    -1069999142 -> if (ownText.equals("Duration: ")) {
                        val selectFirst4: Element = element.selectFirst(TtmlNode.TAG_SPAN)
                        newAnimeLoadResponse.setDuration(
                            MainAPIKt.getDurationFromString(
                                selectFirst4?.text()
                            )
                        )
                        break
                    } else {
                        continue
                    }
                    1383335608 -> if (ownText.equals("Status: ")) {
                        val selectFirst5: Element = element.selectFirst(TtmlNode.TAG_SPAN)
                        val text: String? = selectFirst5?.text()
                        newAnimeLoadResponse.showStatus = if (Intrinsics.areEqual(
                                text,
                                "Releasing"
                            )
                        ) ShowStatus.Ongoing else if (Intrinsics.areEqual(
                                text,
                                AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_COMPLETED
                            )
                        ) ShowStatus.Completed else newAnimeLoadResponse.showStatus
                        break
                    } else {
                        continue
                    }
                    1584878537 -> if (ownText.equals("Genre: ")) {
                        val select2: Elements = element.select("span > a")
                        Intrinsics.checkNotNullExpressionValue(
                            select2,
                            "element.select(\"span > a\")"
                        )
                        val arrayList = ArrayList()
                        val it: Iterator<Element> = select2.iterator()
                        while (it.hasNext()) {
                            val next = it.next()
                            val text2: String? = next?.text()
                            if (text2 != null) {
                                arrayList.add(text2)
                            }
                        }
                        newAnimeLoadResponse.tags = arrayList
                        break
                    } else {
                        continue
                    }
                }
            }
        }
    }
}