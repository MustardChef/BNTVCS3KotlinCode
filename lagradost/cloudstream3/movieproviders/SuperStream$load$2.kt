package com.lagradost.cloudstream3.movieproviders

import java.util.ArrayList
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: SuperStream.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/MovieLoadResponse;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class `SuperStream$load$2`(movieData: MovieData, superStream: SuperStream) : Lambda<Any?>(1),
    Function1<MovieLoadResponse, Unit> {
    /* synthetic */ val `$data`: MovieData
    /* synthetic */ val `this$0`: SuperStream

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$data` = movieData
        `this$0` = superStream
    }

    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override fun invoke(movieLoadResponse: MovieLoadResponse) {
        invoke2(movieLoadResponse)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(newMovieLoadResponse: MovieLoadResponse) {
        val arrayList: ArrayList?
        var `split$default`: List
        var str: String?
        var `split$default2`: List
        Intrinsics.checkNotNullParameter(newMovieLoadResponse, "\$this\$newMovieLoadResponse")
        val superStream = `this$0`
        val arrayList2 = ArrayList()
        for (data in `$data`.getRecommend()) {
            val searchResponse: MovieSearchResponse = data.toSearchResponse(superStream)
            if (searchResponse != null) {
                arrayList2.add(searchResponse)
            }
        }
        newMovieLoadResponse.setRecommendations(arrayList2)
        var posterOrg: String = `$data`.getPosterOrg()
        if (posterOrg == null) {
            posterOrg = `$data`.getPoster()
        }
        newMovieLoadResponse.posterUrl = posterOrg
        newMovieLoadResponse.setYear(`$data`.getYear())
        newMovieLoadResponse.plot = `$data`.getDescription()
        val cats: String = `$data`.getCats()
        var num: Integer? = null
        if (cats == null || StringsKt.`split$default`(
                cats as CharSequence,
                arrayOf(","),
                false,
                0,
                6,
                null as Object?
            ).also { `split$default2` = it } == null
        ) {
            arrayList = null
        } else {
            val list: List<String> = `split$default2`
            val arrayList3 = ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10))
            for (str2 in list) {
                arrayList3.add(APIHolder.INSTANCE.capitalize(str2))
            }
            arrayList = arrayList3
        }
        newMovieLoadResponse.tags = arrayList
        val imdbRating: String = `$data`.getImdbRating()
        if (imdbRating != null && StringsKt.`split$default`(
                imdbRating as CharSequence,
                arrayOf("/"),
                false,
                0,
                6,
                null as Object?
            ).also {
                `split$default` = it
            } != null && `split$default`.get(0) as String?. also { str = it } != null
        ) {
            num = StringsKt.toIntOrNull(str)
        }
        newMovieLoadResponse.setRating(num)
        val movieLoadResponse: MovieLoadResponse = newMovieLoadResponse
        LoadResponse.Companion.addTrailer(movieLoadResponse, `$data`.getTrailerUrl())
        LoadResponse.Companion.addImdbId(movieLoadResponse, `$data`.getImdbId())
    }
}