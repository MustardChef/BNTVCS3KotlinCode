package com.lagradost.cloudstream3.subtitleproviders

import com.facebook.appevents.UserDataStore
import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import com.lagradost.cloudstream3.SubtitleFile
import com.lagradost.cloudstream3.subtitleproviders.SubtitleApi
import com.lagradost.cloudstream3.services.ApiService
import com.lagradost.cloudstream3.services.ApiUtils
import com.lagradost.cloudstream3.subtitleproviders.MovieIMDB
import com.lagradost.cloudstream3.subtitleproviders.SubtitleResponseOpenSubtitle
import kotlin.text.StringsKt
import kotlin.collections.CollectionsKt
import kotlin.random.Random
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants

/* compiled from: MovieIMDB.kt */
@Metadata(
    m108d1 = ["\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bJ\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\u000c\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR \u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR \u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR \u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR \u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR \u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR \u0010!\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR \u0010$\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR \u0010'\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR \u0010*\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR \u0010-\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR \u00100\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR \u00103\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR \u00106\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR \u00109\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR \u0010<\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR \u0010?\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\bR \u0010B\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bR \u0010E\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0006\"\u0004\bG\u0010\bR \u0010H\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR \u0010K\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0006\"\u0004\bM\u0010\b¨\u0006N"],
    m107d2 = ["Lcom/lagradost/cloudstream3/subtitleproviders/MovieIMDB;", "", "()V", "actors", "", "getActors", "()Ljava/lang/String;", "setActors", "(Ljava/lang/String;)V", "awards", "getAwards", "setAwards", "boxOffice", "getBoxOffice", "setBoxOffice", UserDataStore.COUNTRY, "getCountry", "setCountry", "dVD", "getDVD", "setDVD", "director", "getDirector", "setDirector", "genre", "getGenre", "setGenre", "imdbID", "getImdbID", "setImdbID", "imdbRating", "getImdbRating", "setImdbRating", "imdbVotes", "getImdbVotes", "setImdbVotes", "language", "getLanguage", "setLanguage", "metascore", "getMetascore", "setMetascore", "plot", "getPlot", "setPlot", "poster", "getPoster", "setPoster", "production", "getProduction", "setProduction", "rated", "getRated", "setRated", "released", "getReleased", "setReleased", "response", "getResponse", "setResponse", "runtime", "getRuntime", "setRuntime", "title", "getTitle", "setTitle", "type", "getType", "setType", "website", "getWebsite", "setWebsite", "writer", "getWriter", "setWriter", "year", "getYear", "setYear", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class MovieIMDB {
    @SerializedName("Actors")
    @Expose
    var actors: String? = null

    @SerializedName("Awards")
    @Expose
    var awards: String? = null

    @SerializedName("BoxOffice")
    @Expose
    var boxOffice: String? = null

    @SerializedName("Country")
    @Expose
    var country: String? = null

    @SerializedName("DVD")
    @Expose
    var dVD: String? = null

    @SerializedName("Director")
    @Expose
    var director: String? = null

    @SerializedName("Genre")
    @Expose
    var genre: String? = null

    @SerializedName("imdbID")
    @Expose
    var imdbID: String? = null

    @SerializedName("imdbRating")
    @Expose
    var imdbRating: String? = null

    @SerializedName("imdbVotes")
    @Expose
    var imdbVotes: String? = null

    @SerializedName("Language")
    @Expose
    var language: String? = null

    @SerializedName("Metascore")
    @Expose
    var metascore: String? = null

    @SerializedName("Plot")
    @Expose
    var plot: String? = null

    @SerializedName("Poster")
    @Expose
    var poster: String? = null

    @SerializedName("Production")
    @Expose
    var production: String? = null

    @SerializedName("Rated")
    @Expose
    var rated: String? = null

    @SerializedName("Released")
    @Expose
    var released: String? = null

    @SerializedName("Response")
    @Expose
    var response: String? = null

    @SerializedName("Runtime")
    @Expose
    var runtime: String? = null

    @SerializedName("Title")
    @Expose
    var title: String? = null

    @SerializedName("Type")
    @Expose
    var type: String? = null

    @SerializedName("Website")
    @Expose
    var website: String? = null

    @SerializedName("Writer")
    @Expose
    var writer: String? = null

    @SerializedName("Year")
    @Expose
    var year: String? = null
}