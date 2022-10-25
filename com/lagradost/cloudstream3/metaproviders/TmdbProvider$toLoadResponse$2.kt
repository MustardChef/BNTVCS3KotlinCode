package com.lagradost.cloudstream3.metaproviders

import com.lagradost.cloudstream3.Actor
import com.lagradost.cloudstream3.LoadResponse
import com.uwetrottmann.tmdb2.entities.Genre
import java.util.ArrayList
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: TmdbProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/MovieLoadResponse;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class `TmdbProvider$toLoadResponse$2`(/* synthetic */val `this$0`: TmdbProvider, movie: Movie) :
    Lambda<Any?>(1), Function1<MovieLoadResponse, Unit> {
    /* synthetic */ val `$this_toLoadResponse`: Movie

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$this_toLoadResponse` = movie
    }

    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override fun invoke(movieLoadResponse: MovieLoadResponse) {
        invoke2(movieLoadResponse)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(newMovieLoadResponse: MovieLoadResponse) {
        val imageUrl: String?
        val num: Integer?
        val arrayList: ArrayList?
        val trailers: List<String?>?
        val arrayList2: ArrayList?
        val actors: List<Tuples<Actor?, String?>?>
        var list: List<CastMember?>?
        var iterable: Iterable
        var searchResponse: MovieSearchResponse
        Intrinsics.checkNotNullParameter(newMovieLoadResponse, "\$this\$newMovieLoadResponse")
        imageUrl = `this$0`.getImageUrl(`$this_toLoadResponse`.poster_path)
        newMovieLoadResponse.posterUrl = imageUrl
        val date: Date = `$this_toLoadResponse`.release_date
        var list2: List? = null
        num = if (date != null) {
            val calendar: Calendar = Calendar.getInstance()
            calendar.setTime(date)
            Integer.valueOf(calendar.get(1))
        } else {
            null
        }
        newMovieLoadResponse.setYear(num)
        newMovieLoadResponse.plot = `$this_toLoadResponse`.overview
        val companion: LoadResponse.Companion = LoadResponse.Companion
        val movieLoadResponse: MovieLoadResponse = newMovieLoadResponse
        val movieExternalIds: MovieExternalIds = `$this_toLoadResponse`.external_ids
        companion.addImdbId(
            movieLoadResponse,
            if (movieExternalIds != null) movieExternalIds.imdb_id else null
        )
        val list3: List<Genre> = `$this_toLoadResponse`.genres
        arrayList = if (list3 != null) {
            val arrayList3 = ArrayList()
            for (genre in list3) {
                val str: String? = genre.name
                if (str != null) {
                    arrayList3.add(str)
                }
            }
            arrayList3
        } else {
            null
        }
        newMovieLoadResponse.tags = arrayList
        newMovieLoadResponse.setDuration(`$this_toLoadResponse`.runtime)
        newMovieLoadResponse.setRating(`$this_toLoadResponse`.rating)
        val companion2: LoadResponse.Companion = LoadResponse.Companion
        trailers = `this$0`.toTrailers(`$this_toLoadResponse`.videos)
        companion2.addTrailer(movieLoadResponse, trailers)
        var movieResultsPage: MovieResultsPage = `$this_toLoadResponse`.recommendations
        if (movieResultsPage == null) {
            movieResultsPage = `$this_toLoadResponse`.similar
        }
        if (movieResultsPage == null || movieResultsPage.results.also { iterable = it } == null) {
            arrayList2 = null
        } else {
            val iterable2: Iterable<BaseMovie> = iterable
            val tmdbProvider = `this$0`
            val arrayList4 = ArrayList(CollectionsKt.collectionSizeOrDefault<Any>(iterable2, 10))
            for (it in iterable2) {
                Intrinsics.checkNotNullExpressionValue(it, "it")
                searchResponse = tmdbProvider.toSearchResponse(it)
                arrayList4.add(searchResponse)
            }
            arrayList2 = arrayList4
        }
        newMovieLoadResponse.setRecommendations(arrayList2)
        val companion3: LoadResponse.Companion = LoadResponse.Companion
        val tmdbProvider2 = `this$0`
        val credits: Credits = `$this_toLoadResponse`.credits
        if (credits != null && credits.cast.also { list = it } != null) {
            list2 = CollectionsKt.toList(list)
        }
        actors = tmdbProvider2.toActors(list2)
        companion3.addActors(movieLoadResponse, actors)
    }
}