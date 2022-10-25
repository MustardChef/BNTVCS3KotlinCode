package com.lagradost.cloudstream3.movieproviders

import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: CineblogProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/MovieLoadResponse;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class `CineblogProvider$load$3`(/* synthetic */val `this$0`: CineblogProvider, /* synthetic */
                                               val `$poster`: String,
                                               objectRef: ObjectRef<String?>,
                                               str2: String,
                                               r5: Void,
                                               list: List<MovieSearchResponse>,
                                               list2: List<ActorData>
) : Lambda<Any?>(1), Function1<MovieLoadResponse, Unit> {
    /* synthetic */ val `$actors`: List<ActorData>
    /* synthetic */ val `$description`: String
    /* synthetic */ val `$rating`: Void
    /* synthetic */ val `$recomm`: List<MovieSearchResponse>
    /* synthetic */ val `$year`: ObjectRef<String>

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$year` = objectRef
        `$description` = str2
        `$rating` = r5
        `$recomm` = list
        `$actors` = list2
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
        newMovieLoadResponse.plot = `$description`
        newMovieLoadResponse.setRating(`$rating` as Integer)
        newMovieLoadResponse.setRecommendations(`$recomm`)
        newMovieLoadResponse.setDuration(null)
        newMovieLoadResponse.actors = `$actors`
    }
}