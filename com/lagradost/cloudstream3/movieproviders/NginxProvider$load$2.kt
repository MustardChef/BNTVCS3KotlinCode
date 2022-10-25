package com.lagradost.cloudstream3.movieproviders

import java.util.List
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: NginxProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/MovieLoadResponse;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class `NginxProvider$load$2`(
    num: Integer,
    str: String,
    num2: Integer,
    list: List<String>,
    list2: List<String>,
    str2: String,
    map: Map<String, String>
) : Lambda<Any?>(1), Function1<MovieLoadResponse, Unit> {
    /* synthetic */ val `$authHeader`: Map<String, String>
    /* synthetic */ val `$date`: Integer
    /* synthetic */ val `$description`: String
    /* synthetic */ val `$poster`: String
    /* synthetic */ val `$ratingAverage`: Integer
    /* synthetic */ val `$tagsList`: List<String>
    /* synthetic */ val `$trailer`: List<String>

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$date` = num
        `$description` = str
        `$ratingAverage` = num2
        `$tagsList` = list
        `$trailer` = list2
        `$poster` = str2
        `$authHeader` = map
    }

    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override fun invoke(movieLoadResponse: MovieLoadResponse) {
        invoke2(movieLoadResponse)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(newMovieLoadResponse: MovieLoadResponse) {
        Intrinsics.checkNotNullParameter(newMovieLoadResponse, "\$this\$newMovieLoadResponse")
        newMovieLoadResponse.setYear(`$date`)
        newMovieLoadResponse.plot = `$description`
        newMovieLoadResponse.setRating(`$ratingAverage`)
        newMovieLoadResponse.tags = `$tagsList`
        val movieLoadResponse: MovieLoadResponse = newMovieLoadResponse
        LoadResponse.Companion.addTrailer(movieLoadResponse, `$trailer`)
        MainAPIKt.addPoster(movieLoadResponse, `$poster`, `$authHeader`)
    }
}