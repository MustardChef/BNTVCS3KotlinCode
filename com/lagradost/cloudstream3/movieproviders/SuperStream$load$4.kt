package com.lagradost.cloudstream3.movieproviders

import java.util.ArrayList
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: SuperStream.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/TvSeriesLoadResponse;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class `SuperStream$load$4`(seriesData: SeriesData) : Lambda<Any?>(1),
    Function1<TvSeriesLoadResponse, Unit> {
    /* synthetic */ val `$data`: SeriesData

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$data` = seriesData
    }

    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override fun invoke(tvSeriesLoadResponse: TvSeriesLoadResponse) {
        invoke2(tvSeriesLoadResponse)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(newTvSeriesLoadResponse: TvSeriesLoadResponse) {
        var `split$default`: List?
        var `split$default2`: List
        var str: String?
        Intrinsics.checkNotNullParameter(newTvSeriesLoadResponse, "\$this\$newTvSeriesLoadResponse")
        newTvSeriesLoadResponse.setYear(`$data`.getYear())
        newTvSeriesLoadResponse.plot = `$data`.getDescription()
        var posterOrg: String = `$data`.getPosterOrg()
        if (posterOrg == null) {
            posterOrg = `$data`.getPoster()
        }
        newTvSeriesLoadResponse.posterUrl = posterOrg
        val imdbRating: String = `$data`.getImdbRating()
        var arrayList: ArrayList? = null
        newTvSeriesLoadResponse.setRating(
            if (imdbRating == null || StringsKt.`split$default`(
                    imdbRating as CharSequence,
                    arrayOf("/"),
                    false,
                    0,
                    6,
                    null as Object?
                ).also {
                    `split$default2` = it
                } == null || `split$default2`.get(0) as String?. also { str = it } == null
            ) null else StringsKt.toIntOrNull(str))
        val cats: String = `$data`.getCats()
        if (cats != null && StringsKt.`split$default`(
                cats as CharSequence,
                arrayOf(","),
                false,
                0,
                6,
                null as Object?
            ).also { `split$default` = it } != null
        ) {
            val list: List<String> = `split$default`
            val arrayList2 = ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10))
            for (str2 in list) {
                arrayList2.add(APIHolder.INSTANCE.capitalize(str2))
            }
            arrayList = arrayList2
        }
        newTvSeriesLoadResponse.tags = arrayList
        LoadResponse.Companion.addImdbId(newTvSeriesLoadResponse, `$data`.getImdbId())
    }
}