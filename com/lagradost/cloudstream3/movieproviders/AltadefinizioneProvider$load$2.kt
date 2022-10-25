package com.lagradost.cloudstream3.movieproviders

import java.util.List
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: AltadefinizioneProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/MovieLoadResponse;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class `AltadefinizioneProvider$load$2`(/* synthetic */val `this$0`: AltadefinizioneProvider, /* synthetic */
                                                      val `$poster`: String, /* synthetic */
                                                      val `$year`: Int, /* synthetic */
                                                      val `$description`: String,
                                                      r5: Void,
                                                      list: List<MovieSearchResponse>,
                                                      list2: List<ActorData>,
                                                      list3: List<String>,
                                                      str3: String
) : Lambda<Any?>(1), Function1<MovieLoadResponse, Unit> {
    /* synthetic */ val `$actors`: List<ActorData>
    /* synthetic */ val `$rating`: Void
    /* synthetic */ val `$recomm`: List<MovieSearchResponse>
    /* synthetic */ val `$tags`: List<String>
    /* synthetic */ val `$trailerurl`: String

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$rating` = r5
        `$recomm` = list
        `$actors` = list2
        `$tags` = list3
        `$trailerurl` = str3
    }

    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override fun invoke(movieLoadResponse: MovieLoadResponse) {
        invoke2(movieLoadResponse)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(newMovieLoadResponse: MovieLoadResponse) {
        Intrinsics.checkNotNullParameter(newMovieLoadResponse, "\$this\$newMovieLoadResponse")
        newMovieLoadResponse.posterUrl = MainAPIKt.fixUrlNull(`this$0`, `$poster`)
        newMovieLoadResponse.setYear(Integer.valueOf(`$year`))
        newMovieLoadResponse.plot = `$description`
        newMovieLoadResponse.setRating(`$rating` as Integer)
        newMovieLoadResponse.setRecommendations(`$recomm`)
        newMovieLoadResponse.setDuration(null)
        newMovieLoadResponse.actors = `$actors`
        newMovieLoadResponse.tags = `$tags`
        LoadResponse.Companion.addTrailer(newMovieLoadResponse, `$trailerurl`)
    }
}