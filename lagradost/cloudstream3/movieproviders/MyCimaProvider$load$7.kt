package com.lagradost.cloudstream3.movieproviders

import com.lagradost.cloudstream3.Actor
import java.util.List
import kotlin.jvm.internal.Intrinsics

/* compiled from: MyCimaProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/TvSeriesLoadResponse;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes3.dex */
internal class `MyCimaProvider$load$7`(
    num: Integer,
    str: String,
    list: List<String>,
    num2: Integer,
    str2: String,
    list2: List<SearchResponse>,
    list3: List<Actor>
) : Lambda<Any?>(1), Function1<TvSeriesLoadResponse, Unit> {
    /* synthetic */ val `$actors`: List<Actor>
    /* synthetic */ val `$duration`: Integer
    /* synthetic */ val `$posterUrl`: String
    /* synthetic */ val `$recommendations`: List<SearchResponse>
    /* synthetic */ val `$synopsis`: String
    /* synthetic */ val `$tags`: List<String>
    /* synthetic */ val `$year`: Integer

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$duration` = num
        `$posterUrl` = str
        `$tags` = list
        `$year` = num2
        `$synopsis` = str2
        `$recommendations` = list2
        `$actors` = list3
    }

    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override fun invoke(tvSeriesLoadResponse: TvSeriesLoadResponse) {
        invoke2(tvSeriesLoadResponse)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(newTvSeriesLoadResponse: TvSeriesLoadResponse) {
        Intrinsics.checkNotNullParameter(newTvSeriesLoadResponse, "\$this\$newTvSeriesLoadResponse")
        newTvSeriesLoadResponse.setDuration(`$duration`)
        newTvSeriesLoadResponse.posterUrl = `$posterUrl`
        newTvSeriesLoadResponse.tags = `$tags`
        newTvSeriesLoadResponse.setYear(`$year`)
        newTvSeriesLoadResponse.plot = `$synopsis`
        newTvSeriesLoadResponse.setRecommendations(`$recommendations`)
        LoadResponse.Companion.addActorsOnly(newTvSeriesLoadResponse, `$actors`)
    }
}