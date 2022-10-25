package com.lagradost.cloudstream3.movieproviders

import java.util.Map
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: NginxProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/MovieSearchResponse;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class `NginxProvider$getMainPage$returnList$1$currentList$1$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */(/* synthetic */
    val `$posterUrl`: String, /* synthetic */
    val `$authHeader`: Map<String, String>
) : Lambda<Any?>(1), Function1<MovieSearchResponse?, Unit> {
    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override fun invoke(movieSearchResponse: MovieSearchResponse?) {
        invoke2(movieSearchResponse)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(newMovieSearchResponse: MovieSearchResponse?) {
        Intrinsics.checkNotNullParameter(newMovieSearchResponse, "\$this\$newMovieSearchResponse")
        MainAPIKt.addPoster(newMovieSearchResponse, `$posterUrl`, `$authHeader`)
    }
}