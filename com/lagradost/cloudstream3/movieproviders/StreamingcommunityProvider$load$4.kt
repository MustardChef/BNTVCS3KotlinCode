package com.lagradost.cloudstream3.movieproviders

import org.jsoup.nodes.Element
import java.util.ArrayList
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: StreamingcommunityProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/TvSeriesLoadResponse;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class `StreamingcommunityProvider$load$4`(/* synthetic */val `$poster`: String, /* synthetic */
                                                         val `$year`: String,
                                                         document: Document,
                                                         moviedata: Moviedata,
                                                         str3: String,
                                                         list: List<MovieSearchResponse>
) : Lambda<Any?>(1), Function1<TvSeriesLoadResponse, Unit> {
    /* synthetic */ val `$datajs`: Moviedata
    /* synthetic */ val `$document`: Document
    /* synthetic */ val `$listacorr`: List<MovieSearchResponse>
    /* synthetic */ val `$trailerurl`: String

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$document` = document
        `$datajs` = moviedata
        `$trailerurl` = str3
        `$listacorr` = list
    }

    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override fun invoke(tvSeriesLoadResponse: TvSeriesLoadResponse) {
        invoke2(tvSeriesLoadResponse)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(newTvSeriesLoadResponse: TvSeriesLoadResponse) {
        Intrinsics.checkNotNullParameter(newTvSeriesLoadResponse, "\$this\$newTvSeriesLoadResponse")
        newTvSeriesLoadResponse.posterUrl = `$poster`
        val str = `$year`
        val sb = StringBuilder()
        val length: Int = str.length()
        for (i in 0 until length) {
            val charAt: Char = str.charAt(i)
            if (Character.isDigit(charAt)) {
                sb.append(charAt)
            }
        }
        val sb2 = sb.toString()
        Intrinsics.checkNotNullExpressionValue(
            sb2,
            "filterTo(StringBuilder(), predicate).toString()"
        )
        newTvSeriesLoadResponse.setYear(Integer.valueOf(Integer.parseInt(sb2)))
        val selectFirst: Element = `$document`.selectFirst("div.plot-wrap > p")
        Intrinsics.checkNotNull(selectFirst)
        newTvSeriesLoadResponse.plot = selectFirst.text()
        val runtime: Long? = `$datajs`.runtime
        newTvSeriesLoadResponse.setDuration(if (runtime != null) Integer.valueOf(runtime.longValue() as Int) else null)
        val floatOrNull: Float? = StringsKt.toFloatOrNull(`$datajs`.votes.get(0).getAverage())
        newTvSeriesLoadResponse.setRating(if (floatOrNull != null) Integer.valueOf((floatOrNull.floatValue() * 1000) as Int) else null)
        val genres: List<Genre?>? = `$datajs`.genres
        val arrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(genres, 10))
        for (genre in genres!!) {
            arrayList.add(genre.getName())
        }
        newTvSeriesLoadResponse.tags = arrayList
        LoadResponse.Companion.addTrailer(newTvSeriesLoadResponse, `$trailerurl`)
        newTvSeriesLoadResponse.setRecommendations(`$listacorr`)
    }
}