package com.lagradost.cloudstream3.movieproviders

import java.util.List
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: SflixProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/TvSeriesLoadResponse;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class `SflixProvider$load$5`(/* synthetic */val `$posterUrl`: String,
                                            objectRef: ObjectRef<Integer?>,
                                            str2: String,
                                            objectRef2: ObjectRef<String?>,
                                            objectRef3: ObjectRef<List<String?>?>,
                                            objectRef4: ObjectRef<List<String?>?>,
                                            list: List<MovieSearchResponse>,
                                            str3: String,
                                            num: Integer
) : Lambda<Any?>(1), Function1<TvSeriesLoadResponse, Unit> {
    /* synthetic */ val `$cast`: ObjectRef<List<String>>
    /* synthetic */ val `$duration`: ObjectRef<String>
    /* synthetic */ val `$plot`: String
    /* synthetic */ val `$rating`: Integer
    /* synthetic */ val `$recommendations`: List<MovieSearchResponse>
    /* synthetic */ val `$tags`: ObjectRef<List<String>>
    /* synthetic */ val `$year`: ObjectRef<Integer>
    /* synthetic */ val `$youtubeTrailer`: String

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$year` = objectRef
        `$plot` = str2
        `$duration` = objectRef2
        `$cast` = objectRef3
        `$tags` = objectRef4
        `$recommendations` = list
        `$youtubeTrailer` = str3
        `$rating` = num
    }

    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override fun invoke(tvSeriesLoadResponse: TvSeriesLoadResponse) {
        invoke2(tvSeriesLoadResponse)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(newTvSeriesLoadResponse: TvSeriesLoadResponse) {
        Intrinsics.checkNotNullParameter(newTvSeriesLoadResponse, "\$this\$newTvSeriesLoadResponse")
        newTvSeriesLoadResponse.posterUrl = `$posterUrl`
        newTvSeriesLoadResponse.setYear(`$year`.element)
        newTvSeriesLoadResponse.plot = `$plot`
        val tvSeriesLoadResponse: TvSeriesLoadResponse = newTvSeriesLoadResponse
        LoadResponse.Companion.addDuration(tvSeriesLoadResponse, `$duration`.element)
        LoadResponse.Companion.addActorNames(tvSeriesLoadResponse, `$cast`.element)
        newTvSeriesLoadResponse.tags = `$tags`.element
        newTvSeriesLoadResponse.setRecommendations(`$recommendations`)
        LoadResponse.Companion.addTrailer(tvSeriesLoadResponse, `$youtubeTrailer`)
        newTvSeriesLoadResponse.setRating(`$rating`)
    }
}