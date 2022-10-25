package com.lagradost.cloudstream3.movieproviders

import java.util.List
import kotlin.jvm.internal.Intrinsics

/* compiled from: EgyBestProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/MovieLoadResponse;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes3.dex */
internal class `EgyBestProvider$load$2`(/* synthetic */val `$posterUrl`: String,
                                                       num: Integer,
                                                       list: List<SearchResponse>,
                                                       str2: String,
                                                       list2: List<String>,
                                                       list3: List<ActorData>,
                                                       str3: String
) : Lambda<Any?>(1), Function1<MovieLoadResponse, Unit> {
    /* synthetic */ val `$actors`: List<ActorData>
    /* synthetic */ val `$recommendations`: List<SearchResponse>
    /* synthetic */ val `$synopsis`: String
    /* synthetic */ val `$tags`: List<String>
    /* synthetic */ val `$year`: Integer
    /* synthetic */ val `$youtubeTrailer`: String

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$year` = num
        `$recommendations` = list
        `$synopsis` = str2
        `$tags` = list2
        `$actors` = list3
        `$youtubeTrailer` = str3
    }

    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override fun invoke(movieLoadResponse: MovieLoadResponse) {
        invoke2(movieLoadResponse)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(newMovieLoadResponse: MovieLoadResponse) {
        Intrinsics.checkNotNullParameter(newMovieLoadResponse, "\$this\$newMovieLoadResponse")
        newMovieLoadResponse.posterUrl = `$posterUrl`
        newMovieLoadResponse.setYear(`$year`)
        newMovieLoadResponse.setRecommendations(`$recommendations`)
        newMovieLoadResponse.plot = `$synopsis`
        newMovieLoadResponse.tags = `$tags`
        newMovieLoadResponse.actors = `$actors`
        LoadResponse.Companion.addTrailer(newMovieLoadResponse, `$youtubeTrailer`)
    }
}