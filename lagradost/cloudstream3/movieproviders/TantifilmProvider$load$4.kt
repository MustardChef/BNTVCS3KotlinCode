package com.lagradost.cloudstream3.movieproviders

import java.util.List
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: TantiFilmProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/TvSeriesLoadResponse;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class `TantifilmProvider$load$4`(/* synthetic */val `this$0`: TantiFilmProvider, /* synthetic */
                                                val `$poster`: String,
                                                objectRef: ObjectRef<String?>,
                                                list: List<String>,
                                                num: Integer,
                                                list2: List<MovieSearchResponse>,
                                                str2: String
) : Lambda<Any?>(1), Function1<TvSeriesLoadResponse, Unit> {
    /* synthetic */ val `$descipt`: List<String>
    /* synthetic */ val `$rating`: Integer
    /* synthetic */ val `$recomm`: List<MovieSearchResponse>
    /* synthetic */ val `$trailerurl`: String
    /* synthetic */ val `$year`: ObjectRef<String>

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$year` = objectRef
        `$descipt` = list
        `$rating` = num
        `$recomm` = list2
        `$trailerurl` = str2
    }

    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override fun invoke(tvSeriesLoadResponse: TvSeriesLoadResponse) {
        invoke2(tvSeriesLoadResponse)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(newTvSeriesLoadResponse: TvSeriesLoadResponse) {
        Intrinsics.checkNotNullParameter(newTvSeriesLoadResponse, "\$this\$newTvSeriesLoadResponse")
        newTvSeriesLoadResponse.posterUrl = MainAPIKt.fixUrlNull(`this$0`, `$poster`)
        newTvSeriesLoadResponse.setYear(StringsKt.toIntOrNull(`$year`.element))
        newTvSeriesLoadResponse.plot = `$descipt`[0]
        newTvSeriesLoadResponse.setRating(`$rating`)
        newTvSeriesLoadResponse.setRecommendations(`$recomm`)
        LoadResponse.Companion.addTrailer(newTvSeriesLoadResponse, `$trailerurl`)
    }
}