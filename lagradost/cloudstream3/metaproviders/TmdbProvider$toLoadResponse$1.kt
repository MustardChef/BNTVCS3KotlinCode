package com.lagradost.cloudstream3.metaproviders

import com.lagradost.cloudstream3.Actor
import com.lagradost.cloudstream3.LoadResponse
import com.uwetrottmann.tmdb2.entities.Genre
import java.util.ArrayList
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: TmdbProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/TvSeriesLoadResponse;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class `TmdbProvider$toLoadResponse$1`(/* synthetic */val `this$0`: TmdbProvider, tvShow: TvShow) :
    Lambda<Any?>(1), Function1<TvSeriesLoadResponse, Unit> {
    /* synthetic */ val `$this_toLoadResponse`: TvShow

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$this_toLoadResponse` = tvShow
    }

    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override fun invoke(tvSeriesLoadResponse: TvSeriesLoadResponse) {
        invoke2(tvSeriesLoadResponse)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(newTvSeriesLoadResponse: TvSeriesLoadResponse) {
        val imageUrl: String?
        val num: Integer?
        val arrayList: ArrayList?
        val trailers: List<String?>?
        val arrayList2: ArrayList?
        val actors: List<Tuples<Actor?, String?>?>
        var list: List<CastMember?>?
        var iterable: Iterable
        var searchResponse: TvSeriesSearchResponse
        Intrinsics.checkNotNullParameter(newTvSeriesLoadResponse, "\$this\$newTvSeriesLoadResponse")
        imageUrl = `this$0`.getImageUrl(`$this_toLoadResponse`.poster_path)
        newTvSeriesLoadResponse.posterUrl = imageUrl
        val date: Date = `$this_toLoadResponse`.first_air_date
        var list2: List? = null
        num = if (date != null) {
            val calendar: Calendar = Calendar.getInstance()
            calendar.setTime(date)
            Integer.valueOf(calendar.get(1))
        } else {
            null
        }
        newTvSeriesLoadResponse.setYear(num)
        newTvSeriesLoadResponse.plot = `$this_toLoadResponse`.overview
        val companion: LoadResponse.Companion = LoadResponse.Companion
        val tvSeriesLoadResponse: TvSeriesLoadResponse = newTvSeriesLoadResponse
        val tvExternalIds: TvExternalIds = `$this_toLoadResponse`.external_ids
        companion.addImdbId(
            tvSeriesLoadResponse,
            if (tvExternalIds != null) tvExternalIds.imdb_id else null
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
        newTvSeriesLoadResponse.tags = arrayList
        val list4: List<Integer> = `$this_toLoadResponse`.episode_run_time
        newTvSeriesLoadResponse.setDuration(
            if (list4 != null) Integer.valueOf(
                CollectionsKt.averageOfInt(
                    list4
                ).toInt()
            ) else null
        )
        newTvSeriesLoadResponse.setRating(`$this_toLoadResponse`.rating)
        val companion2: LoadResponse.Companion = LoadResponse.Companion
        trailers = `this$0`.toTrailers(`$this_toLoadResponse`.videos)
        companion2.addTrailer(tvSeriesLoadResponse, trailers)
        var tvShowResultsPage: TvShowResultsPage = `$this_toLoadResponse`.recommendations
        if (tvShowResultsPage == null) {
            tvShowResultsPage = `$this_toLoadResponse`.similar
        }
        if (tvShowResultsPage == null || tvShowResultsPage.results.also { iterable = it } == null) {
            arrayList2 = null
        } else {
            val iterable2: Iterable<BaseTvShow> = iterable
            val tmdbProvider = `this$0`
            val arrayList4 = ArrayList(CollectionsKt.collectionSizeOrDefault<Any>(iterable2, 10))
            for (it in iterable2) {
                Intrinsics.checkNotNullExpressionValue(it, "it")
                searchResponse = tmdbProvider.toSearchResponse(it)
                arrayList4.add(searchResponse)
            }
            arrayList2 = arrayList4
        }
        newTvSeriesLoadResponse.setRecommendations(arrayList2)
        val companion3: LoadResponse.Companion = LoadResponse.Companion
        val tmdbProvider2 = `this$0`
        val credits: Credits = `$this_toLoadResponse`.credits
        if (credits != null && credits.cast.also { list = it } != null) {
            list2 = CollectionsKt.toList(list)
        }
        actors = tmdbProvider2.toActors(list2)
        companion3.addActors(tvSeriesLoadResponse, actors)
    }
}