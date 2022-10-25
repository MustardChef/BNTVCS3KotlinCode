package com.lagradost.cloudstream3.movieproviders

import java.util.List
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: TantiFilmProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/MovieLoadResponse;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class `TantifilmProvider$load$5`(/* synthetic */val `this$0`: TantiFilmProvider, /* synthetic */
                                                val `$poster`: String,
                                                objectRef: ObjectRef<String?>,
                                                str2: String,
                                                num: Integer,
                                                list: List<MovieSearchResponse>,
                                                list2: List<String>,
                                                num2: Integer,
                                                list3: List<ActorData>,
                                                str3: String
) : Lambda<Any?>(1), Function1<MovieLoadResponse, Unit> {
    /* synthetic */ val `$actors`: List<ActorData>
    /* synthetic */ val `$duratio`: Integer
    /* synthetic */ val `$plot`: String
    /* synthetic */ val `$rating`: Integer
    /* synthetic */ val `$recomm`: List<MovieSearchResponse>
    /* synthetic */ val `$tags`: List<String>
    /* synthetic */ val `$trailerurl`: String
    /* synthetic */ val `$year`: ObjectRef<String>

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$year` = objectRef
        `$plot` = str2
        `$rating` = num
        `$recomm` = list
        `$tags` = list2
        `$duratio` = num2
        `$actors` = list3
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
        newMovieLoadResponse.setYear(StringsKt.toIntOrNull(`$year`.element))
        newMovieLoadResponse.plot = `$plot`
        newMovieLoadResponse.setRating(`$rating`)
        newMovieLoadResponse.setRecommendations(`$recomm`)
        newMovieLoadResponse.tags = `$tags`
        newMovieLoadResponse.setDuration(`$duratio`)
        newMovieLoadResponse.actors = `$actors`
        LoadResponse.Companion.addTrailer(newMovieLoadResponse, `$trailerurl`)
    }
}