package com.lagradost.cloudstream3.movieproviders

import com.fasterxml.jackson.core.type.TypeReference
import com.lagradost.cloudstream3.utils.AppUtils
import java.util.List
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: TrailersTwoProvider.kt */
@Metadata(
    m108d1 = ["\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002%&B\u0005¢\u0006\u0002\u0010\u0002JI\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\b2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020!0\u001fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\$R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000c\u0010\u0006\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u0014\u0010\u0019\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TrailersTwoProvider;", "Lcom/lagradost/cloudstream3/metaproviders/TmdbProvider;", "()V", "apiName", "", "getApiName", "()Ljava/lang/String;", "instantLinkLoading", "", "getInstantLinkLoading", "()Z", "mainUrl", "getMainUrl", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "useMetaLoadResponse", "getUseMetaLoadResponse", "user", "getUser", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "TrailersEpisode", "TrailersMovie", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class TrailersTwoProvider : TmdbProvider() {
    val user = "cloudstream"

    // com.lagradost.cloudstream3.metaproviders.TmdbProvider
    @get:Override
    val apiName = "Trailers.to"

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var name = "Trailers.to"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var mainUrl = "https://trailers.to"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.metaproviders.TmdbProvider
    @get:Override
    val useMetaLoadResponse = true

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val instantLinkLoading = true

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val supportedTypes: Set<TvType> =
        SetsKt.setOf<Object>(*arrayOf<TvType>(TvType.Movie, TvType.TvSeries) as Array<Object>)

    /* compiled from: TrailersTwoProvider.kt */
    @Metadata(
        m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ0\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000c\u0010\r¨\u0006\u0019"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TrailersTwoProvider\$TrailersEpisode;", "", "itemID", "", "imdb", "", "tmdb", "(ILjava/lang/String;Ljava/lang/Integer;)V", "getImdb", "()Ljava/lang/String;", "getItemID", "()I", "getTmdb", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(ILjava/lang/String;Ljava/lang/Integer;)Lcom/lagradost/cloudstream3/movieproviders/TrailersTwoProvider\$TrailersEpisode;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class TrailersEpisode(
        @param:JsonProperty("ItemID") val itemID: Int, @param:JsonProperty(
            "IMDb"
        ) val imdb: String, @JsonProperty("TMDb") num: Integer
    ) {
        private val tmdb: Integer
        operator fun component1(): Int {
            return itemID
        }

        operator fun component2(): String {
            return imdb
        }

        operator fun component3(): Integer {
            return tmdb
        }

        fun copy(
            @JsonProperty("ItemID") i: Int,
            @JsonProperty("IMDb") str: String,
            @JsonProperty("TMDb") num: Integer
        ): TrailersEpisode {
            return TrailersEpisode(i, str, num)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is TrailersEpisode) {
                val trailersEpisode = obj as TrailersEpisode
                return itemID == trailersEpisode.itemID && Intrinsics.areEqual(
                    imdb, trailersEpisode.imdb
                ) && Intrinsics.areEqual(tmdb, trailersEpisode.tmdb)
            }
            return false
        }

        override fun hashCode(): Int {
            val i = itemID * 31
            val str = imdb
            val hashCode = (i + (str?.hashCode() ?: 0)) * 31
            val num: Integer = tmdb
            return hashCode + if (num != null) num.hashCode() else 0
        }

        override fun toString(): String {
            return "TrailersEpisode(itemID=" + itemID + ", imdb=" + imdb + ", tmdb=" + tmdb + ')'
        }

        init {
            tmdb = num
        }

        fun getTmdb(): Integer {
            return tmdb
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                trailersEpisode: TrailersEpisode,
                i: Int,
                str: String,
                num: Integer,
                i2: Int,
                obj: Object?
            ): TrailersEpisode {
                var i = i
                var str = str
                var num: Integer = num
                if (i2 and 1 != 0) {
                    i = trailersEpisode.itemID
                }
                if (i2 and 2 != 0) {
                    str = trailersEpisode.imdb
                }
                if (i2 and 4 != 0) {
                    num = trailersEpisode.tmdb
                }
                return trailersEpisode.copy(i, str, num)
            }
        }
    }

    /* compiled from: TrailersTwoProvider.kt */
    @Metadata(
        m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ0\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000c\u0010\r¨\u0006\u0019"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TrailersTwoProvider\$TrailersMovie;", "", "itemID", "", "imdb", "", "tmdb", "(ILjava/lang/String;Ljava/lang/Integer;)V", "getImdb", "()Ljava/lang/String;", "getItemID", "()I", "getTmdb", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(ILjava/lang/String;Ljava/lang/Integer;)Lcom/lagradost/cloudstream3/movieproviders/TrailersTwoProvider\$TrailersMovie;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class TrailersMovie(
        @param:JsonProperty("ItemID") val itemID: Int, @param:JsonProperty(
            "IMDb"
        ) val imdb: String, @JsonProperty("TMDb") num: Integer
    ) {
        private val tmdb: Integer
        operator fun component1(): Int {
            return itemID
        }

        operator fun component2(): String {
            return imdb
        }

        operator fun component3(): Integer {
            return tmdb
        }

        fun copy(
            @JsonProperty("ItemID") i: Int,
            @JsonProperty("IMDb") str: String,
            @JsonProperty("TMDb") num: Integer
        ): TrailersMovie {
            return TrailersMovie(i, str, num)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is TrailersMovie) {
                val trailersMovie = obj as TrailersMovie
                return itemID == trailersMovie.itemID && Intrinsics.areEqual(
                    imdb, trailersMovie.imdb
                ) && Intrinsics.areEqual(tmdb, trailersMovie.tmdb)
            }
            return false
        }

        override fun hashCode(): Int {
            val i = itemID * 31
            val str = imdb
            val hashCode = (i + (str?.hashCode() ?: 0)) * 31
            val num: Integer = tmdb
            return hashCode + if (num != null) num.hashCode() else 0
        }

        override fun toString(): String {
            return "TrailersMovie(itemID=" + itemID + ", imdb=" + imdb + ", tmdb=" + tmdb + ')'
        }

        init {
            tmdb = num
        }

        fun getTmdb(): Integer {
            return tmdb
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                trailersMovie: TrailersMovie,
                i: Int,
                str: String,
                num: Integer,
                i2: Int,
                obj: Object?
            ): TrailersMovie {
                var i = i
                var str = str
                var num: Integer = num
                if (i2 and 1 != 0) {
                    i = trailersMovie.itemID
                }
                if (i2 and 2 != 0) {
                    str = trailersMovie.imdb
                }
                if (i2 and 4 != 0) {
                    num = trailersMovie.tmdb
                }
                return trailersMovie.copy(i, str, num)
            }
        }
    }

    @Override // com.lagradost.cloudstream3.MainAPI
    fun loadLinks(
        str: String?,
        z: Boolean,
        function1: Function1<SubtitleFile?, Unit>,
        function12: Function1<ExtractorLink?, Unit>,
        continuation: Continuation<in Boolean?>?
    ): Object {
        val tuples: Tuples<*, *>
        val appUtils = AppUtils.INSTANCE
        val tmdbLink: TmdbLink = MainAPIKt.getMapper().readValue(
            str,
            object :
                TypeReference<TmdbLink?>() { // from class: com.lagradost.cloudstream3.movieproviders.TrailersTwoProvider$loadLinks$$inlined$parseJson$1
            }) as TmdbLink
        val listOf: List = if (tmdbLink.getImdbID() != null) CollectionsKt.listOf<Object>(
            *arrayOf(
                tmdbLink.getImdbID(),
                "imdb"
            ) as Array<Object>
        ) else CollectionsKt.listOf<Object>(
            *arrayOf(
                String.valueOf(tmdbLink.getTmdbID()),
                "tmdb"
            ) as Array<Object>
        )
        val str2 = listOf.get(0) as String
        val str3 = listOf.get(1) as String
        val z2 = tmdbLink.getEpisode() == null && tmdbLink.getSeason() == null
        tuples = if (z2) {
            val str4 = user + JsonPointer.SEPARATOR + str3 + JsonPointer.SEPARATOR.code + str2
            Tuples<Any?, Any?>(
                "https://trailers.to/video/$str4",
                "https://trailers.to/subtitles/$str4"
            )
        } else {
            val sb = StringBuilder()
            sb.append(user)
            sb.append(JsonPointer.SEPARATOR)
            sb.append(str3)
            sb.append(JsonPointer.SEPARATOR)
            sb.append(str2)
            sb.append("/S")
            val season: Integer = tmdbLink.getSeason()
            sb.append(if (season != null) season.intValue() else 1)
            sb.append('E')
            val episode: Integer = tmdbLink.getEpisode()
            sb.append(if (episode != null) episode.intValue() else 1)
            val sb2 = sb.toString()
            Tuples<Any?, Any?>(
                "https://trailers.to/video/$sb2",
                "https://trailers.to/subtitles/$sb2"
            )
        }
        val str5 = tuples.component1() as String
        function12.invoke(
            ExtractorLink(
                name,
                name,
                str5,
                "https://trailers.to",
                Qualities.Unknown.value,
                false,
                null,
                null,
                192,
                null
            )
        )
        ParCollections.argamap(
            `TrailersTwoProvider$loadLinks$2`(
                tuples.component2() as String?,
                function1,
                null
            ), `TrailersTwoProvider$loadLinks$3`(tmdbLink, z2, str5, function12, this, null)
        )
        return boxing.boxBoolean(true)
    }
}