package com.lagradost.cloudstream3.movieproviders

import java.util.List
import kotlin.jvm.internal.Intrinsics

/* compiled from: PhimmoichillProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/TvSeriesLoadResponse;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes3.dex */
internal class `PhimmoichillProvider$load$2`(/* synthetic */val `$poster`: String,
                                                            num: Integer,
                                                            str2: String,
                                                            list: List<String>,
                                                            num2: Integer,
                                                            list2: List<String>,
                                                            list3: List<SearchResponse>,
                                                            str3: String
) : Lambda<Any?>(1), Function1<TvSeriesLoadResponse, Unit> {
    /* synthetic */ val `$actors`: List<String>
    /* synthetic */ val `$description`: String
    /* synthetic */ val `$rating`: Integer
    /* synthetic */ val `$recommendations`: List<SearchResponse>
    /* synthetic */ val `$tags`: List<String>
    /* synthetic */ val `$trailer`: String
    /* synthetic */ val `$year`: Integer

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$year` = num
        `$description` = str2
        `$tags` = list
        `$rating` = num2
        `$actors` = list2
        `$recommendations` = list3
        `$trailer` = str3
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
        newTvSeriesLoadResponse.setYear(`$year`)
        newTvSeriesLoadResponse.plot = `$description`
        newTvSeriesLoadResponse.tags = `$tags`
        newTvSeriesLoadResponse.setRating(`$rating`)
        val tvSeriesLoadResponse: TvSeriesLoadResponse = newTvSeriesLoadResponse
        LoadResponse.Companion.addActorNames(tvSeriesLoadResponse, `$actors`)
        newTvSeriesLoadResponse.setRecommendations(`$recommendations`)
        LoadResponse.Companion.addTrailer(tvSeriesLoadResponse, `$trailer`)
    }
}