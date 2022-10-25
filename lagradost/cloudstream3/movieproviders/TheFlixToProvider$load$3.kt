package com.lagradost.cloudstream3.movieproviders

import java.util.List
import kotlin.jvm.internal.Intrinsics

/* compiled from: TheFlixToProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/TvSeriesLoadResponse;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes3.dex */
internal class `TheFlixToProvider$load$3`(/* synthetic */val `$poster`: String, /* synthetic */
                                                         val `$year`: String, /* synthetic */
                                                         val `$description`: String,
                                                         num: Integer,
                                                         list: List<String>,
                                                         list2: List<String>,
                                                         list3: List<MovieSearchResponse>,
                                                         z: Boolean,
                                                         num2: Integer
) : Lambda<Any?>(1), Function1<TvSeriesLoadResponse, Unit> {
    /* synthetic */ val `$cast`: List<String>
    /* synthetic */ val `$comingsoon`: Boolean
    /* synthetic */ val `$rating`: Integer
    /* synthetic */ val `$recommendationsitem`: List<MovieSearchResponse>
    /* synthetic */ val `$runtime`: Integer
    /* synthetic */ val `$tags`: List<String>

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$runtime` = num
        `$cast` = list
        `$tags` = list2
        `$recommendationsitem` = list3
        `$comingsoon` = z
        `$rating` = num2
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
        newTvSeriesLoadResponse.setYear(if (str != null) StringsKt.toIntOrNull(str) else null)
        newTvSeriesLoadResponse.plot = `$description`
        newTvSeriesLoadResponse.setDuration(`$runtime`)
        LoadResponse.Companion.addActorNames(newTvSeriesLoadResponse, `$cast`)
        newTvSeriesLoadResponse.tags = `$tags`
        newTvSeriesLoadResponse.setRecommendations(`$recommendationsitem`)
        newTvSeriesLoadResponse.comingSoon = `$comingsoon`
        newTvSeriesLoadResponse.setRating(`$rating`)
    }
}