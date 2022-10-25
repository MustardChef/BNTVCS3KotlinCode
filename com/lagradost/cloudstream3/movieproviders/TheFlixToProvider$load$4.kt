package com.lagradost.cloudstream3.movieproviders

import java.util.List
import kotlin.jvm.internal.Intrinsics

/* compiled from: TheFlixToProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/MovieLoadResponse;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes3.dex */
internal class `TheFlixToProvider$load$4`(/* synthetic */val `$year`: String, /* synthetic */
                                                         val `$poster`: String, /* synthetic */
                                                         val `$description`: String,
                                                         num: Integer,
                                                         list: List<String>,
                                                         list2: List<String>,
                                                         list3: List<MovieSearchResponse>,
                                                         z: Boolean,
                                                         num2: Integer
) : Lambda<Any?>(1), Function1<MovieLoadResponse, Unit> {
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
    /* bridge */ /* synthetic */  override fun invoke(movieLoadResponse: MovieLoadResponse) {
        invoke2(movieLoadResponse)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(newMovieLoadResponse: MovieLoadResponse) {
        Intrinsics.checkNotNullParameter(newMovieLoadResponse, "\$this\$newMovieLoadResponse")
        val str = `$year`
        newMovieLoadResponse.setYear(if (str != null) StringsKt.toIntOrNull(str) else null)
        newMovieLoadResponse.posterUrl = `$poster`
        newMovieLoadResponse.plot = `$description`
        newMovieLoadResponse.setDuration(`$runtime`)
        LoadResponse.Companion.addActorNames(newMovieLoadResponse, `$cast`)
        newMovieLoadResponse.tags = `$tags`
        newMovieLoadResponse.setRecommendations(`$recommendationsitem`)
        newMovieLoadResponse.comingSoon = `$comingsoon`
        newMovieLoadResponse.setRating(`$rating`)
    }
}