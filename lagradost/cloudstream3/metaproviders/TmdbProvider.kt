package com.lagradost.cloudstream3.metaproviders

import com.lagradost.cloudstream3.Actor
import com.lagradost.cloudstream3.utils.AppUtils
import com.uwetrottmann.tmdb2.entities.Videos
import java.util.ArrayList
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: TmdbProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0002J\u0011\u0010\u0019\u001a\u00020\u001aH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0002\u0010 J\u001b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\$J\u0012\u0010%\u001a\u0004\u0018\u00010\"2\u0006\u0010&\u001a\u00020\u0004H\u0016J \u0010%\u001a\u0004\u0018\u00010\"2\u0006\u0010&\u001a\u00020\u00042\u000c\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0016J\u0012\u0010*\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0013\u001a\u00020\u001eH\u0016J \u0010*\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0013\u001a\u00020\u001e2\u000c\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0016J!\u0010+\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010(2\u0006\u0010-\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\$J,\u0010.\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u000200\u0012\u0006\u0012\u0004\u0018\u00010\u00040/\u0018\u00010(*\u000c\u0012\u0006\u0012\u0004\u0018\u000101\u0018\u00010(H\u0002J\u000c\u00102\u001a\u000203*\u000204H\u0002J\u000c\u00102\u001a\u000205*\u000206H\u0002J\u000c\u00107\u001a\u000208*\u000209H\u0002J\u000c\u00107\u001a\u00020:*\u00020;H\u0002J\u0016\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010(*\u0004\u0018\u00010=H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\nR\u0014\u0010\r\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006>"],
    m107d2 = ["Lcom/lagradost/cloudstream3/metaproviders/TmdbProvider;", "Lcom/lagradost/cloudstream3/MainAPI;", "()V", "apiName", "", "getApiName", "()Ljava/lang/String;", "disableSeasonZero", "", "getDisableSeasonZero", "()Z", "hasMainPage", "getHasMainPage", "includeAdult", "getIncludeAdult", "providerType", "Lcom/lagradost/cloudstream3/ProviderType;", "getProviderType", "()Lcom/lagradost/cloudstream3/ProviderType;", "tmdb", "Lcom/uwetrottmann/tmdb2/Tmdb;", "useMetaLoadResponse", "getUseMetaLoadResponse", "getImageUrl", "link", "getMainPage", "Lcom/lagradost/cloudstream3/HomePageResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUrl", "id", "", "tvShow", "(Ljava/lang/Integer;Z)Ljava/lang/String;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFromImdb", "imdb", "seasons", "", "Lcom/uwetrottmann/tmdb2/entities/TvSeason;", "loadFromTmdb", "search", "Lcom/lagradost/cloudstream3/SearchResponse;", "query", "toActors", "Lkotlin/Pair;", "Lcom/lagradost/cloudstream3/Actor;", "Lcom/uwetrottmann/tmdb2/entities/CastMember;", "toLoadResponse", "Lcom/lagradost/cloudstream3/MovieLoadResponse;", "Lcom/uwetrottmann/tmdb2/entities/Movie;", "Lcom/lagradost/cloudstream3/TvSeriesLoadResponse;", "Lcom/uwetrottmann/tmdb2/entities/TvShow;", "toSearchResponse", "Lcom/lagradost/cloudstream3/MovieSearchResponse;", "Lcom/uwetrottmann/tmdb2/entities/BaseMovie;", "Lcom/lagradost/cloudstream3/TvSeriesSearchResponse;", "Lcom/uwetrottmann/tmdb2/entities/BaseTvShow;", "toTrailers", "Lcom/uwetrottmann/tmdb2/entities/Videos;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes3.dex */
open class TmdbProvider : MainAPI() {
    val includeAdult = false
    open val useMetaLoadResponse = false
    open val apiName = "TMDB"
    val disableSeasonZero = true

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasMainPage = true

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val providerType: ProviderType = ProviderType.MetaProvider
    val tmdb: Tmdb = Tmdb("e6333b32409e02a4a6eba6fb7ff866bb")

    @Override // com.lagradost.cloudstream3.MainAPI
    override fun getMainPage(continuation: Continuation<in HomePageResponse?>?): Object? {
        return `getMainPage$suspendImpl`(this, continuation as Continuation<*>?)
    }

    @Override // com.lagradost.cloudstream3.MainAPI
    override fun load(str: String?, continuation: Continuation<in LoadResponse?>?): Object {
        return `load$suspendImpl`(this, str, continuation as Continuation<*>?)
    }

    fun loadFromImdb(imdb: String?): LoadResponse? {
        Intrinsics.checkNotNullParameter(imdb, "imdb")
        return null
    }

    fun loadFromImdb(imdb: String?, seasons: List<TvSeason?>?): LoadResponse? {
        Intrinsics.checkNotNullParameter(imdb, "imdb")
        Intrinsics.checkNotNullParameter(seasons, "seasons")
        return null
    }

    fun loadFromTmdb(i: Int): LoadResponse? {
        return null
    }

    fun loadFromTmdb(i: Int, seasons: List<TvSeason?>?): LoadResponse? {
        Intrinsics.checkNotNullParameter(seasons, "seasons")
        return null
    }

    @Override // com.lagradost.cloudstream3.MainAPI
    override fun search(
        str: String?,
        continuation: Continuation<in List<SearchResponse?>?>?
    ): Object {
        return `search$suspendImpl`(this, str, continuation as Continuation<*>?)
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun getImageUrl(str: String?): String? {
        if (str == null) {
            return null
        }
        return if (StringsKt.`startsWith$default`(str, "/", false, 2, null as Object?)) {
            "https://image.tmdb.org/t/p/w500/$str"
        } else str
    }

    private fun getUrl(num: Integer?, z: Boolean): String {
        if (z) {
            val sb = StringBuilder()
            sb.append("https://www.themoviedb.org/tv/")
            sb.append(if (num != null) num.intValue() else -1)
            return sb.toString()
        }
        val sb2 = StringBuilder()
        sb2.append("https://www.themoviedb.org/movie/")
        sb2.append(if (num != null) num.intValue() else -1)
        return sb2.toString()
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun toSearchResponse(baseTvShow: BaseTvShow): TvSeriesSearchResponse {
        val num: Integer?
        var str: String = baseTvShow.name
        if (str == null) {
            str = baseTvShow.original_name
        }
        val str2 = str
        Intrinsics.checkNotNullExpressionValue(str2, "this.name ?: this.original_name")
        val url = getUrl(baseTvShow.f10057id, true)
        val apiName = apiName
        val tvType: TvType = TvType.TvSeries
        val imageUrl = getImageUrl(baseTvShow.poster_path)
        val date: Date = baseTvShow.first_air_date
        num = if (date != null) {
            val calendar: Calendar = Calendar.getInstance()
            calendar.setTime(date)
            Integer.valueOf(calendar.get(1))
        } else {
            null
        }
        return TvSeriesSearchResponse(
            str2,
            url,
            apiName,
            tvType,
            imageUrl,
            num,
            null,
            baseTvShow.f10057id,
            null,
            null,
            768,
            null
        )
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun toSearchResponse(baseMovie: BaseMovie): MovieSearchResponse {
        val num: Integer?
        var str: String = baseMovie.title
        if (str == null) {
            str = baseMovie.original_title
        }
        val str2 = str
        Intrinsics.checkNotNullExpressionValue(str2, "this.title ?: this.original_title")
        val url = getUrl(baseMovie.f10051id, false)
        val apiName = apiName
        val tvType: TvType = TvType.TvSeries
        val imageUrl = getImageUrl(baseMovie.poster_path)
        val date: Date = baseMovie.release_date
        num = if (date != null) {
            val calendar: Calendar = Calendar.getInstance()
            calendar.setTime(date)
            Integer.valueOf(calendar.get(1))
        } else {
            null
        }
        return MovieSearchResponse(
            str2,
            url,
            apiName,
            tvType,
            imageUrl,
            num,
            baseMovie.f10051id,
            null,
            null,
            384,
            null
        )
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun toActors(list: List<CastMember?>?): List<Tuples<Actor, String>>? {
        var tuples: Tuples<*, *>?
        if (list != null) {
            val arrayList = ArrayList()
            for (castMember in list) {
                val str: String? = if (castMember != null) castMember.name else null
                tuples = if (str == null) {
                    null
                } else {
                    Intrinsics.checkNotNullExpressionValue(
                        str,
                        "it?.name ?: return@mapNotNull null"
                    )
                    Tuples<Any?, Any?>(
                        Actor(str, getImageUrl(castMember.profile_path)),
                        castMember.character
                    )
                }
                if (tuples != null) {
                    arrayList.add(tuples)
                }
            }
            return arrayList
        }
        return null
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
        if (r6 != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x017b, code lost:
        if (r2 == null) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */ /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private fun toLoadResponse(r32: TvShow): TvSeriesLoadResponse {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.metaproviders.TmdbProvider.toLoadResponse(com.uwetrottmann.tmdb2.entities.TvShow):com.lagradost.cloudstream3.TvSeriesLoadResponse")
    }

    /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */ /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */ /* JADX WARN: Removed duplicated region for block: B:42:0x00a1 A[SYNTHETIC] */ /* JADX WARN: Removed duplicated region for block: B:44:0x0054 A[SYNTHETIC] */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun toTrailers(r7: Videos?): List<String> {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto La8
            java.util.List<com.uwetrottmann.tmdb2.entities.Videos$Video> r7 = r7.results
            if (r7 == 0) goto La8
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r7 = r7.iterator()
        L14:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r7.next()
            r3 = r2
            com.uwetrottmann.tmdb2.entities.Videos$Video r3 = (com.uwetrottmann.tmdb2.entities.Videos.Video) r3
            com.uwetrottmann.tmdb2.enumerations.VideoType r4 = r3.type
            com.uwetrottmann.tmdb2.enumerations.VideoType r5 = com.uwetrottmann.tmdb2.enumerations.VideoType.OPENING_CREDITS
            if (r4 == r5) goto L2f
            com.uwetrottmann.tmdb2.enumerations.VideoType r3 = r3.type
            com.uwetrottmann.tmdb2.enumerations.VideoType r4 = com.uwetrottmann.tmdb2.enumerations.VideoType.FEATURETTE
            if (r3 == r4) goto L2f
            r3 = 1
            goto L30
        L2f:
            r3 = 0
        L30:
            if (r3 == 0) goto L14
            r1.add(r2)
            goto L14
        L36:
            java.util.List r1 = (java.util.List) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            com.lagradost.cloudstream3.metaproviders.TmdbProvider$toTrailers$$inlined$sortedBy$1 r7 = new com.lagradost.cloudstream3.metaproviders.TmdbProvider$toTrailers$$inlined$sortedBy$1
            r7.<init>()
            java.util.Comparator r7 = (java.util.Comparator) r7
            java.util.List r7 = kotlin.collections.CollectionsKt.sortedWith(r1, r7)
            if (r7 == 0) goto La8
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r7 = r7.iterator()
        L54:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto La5
            java.lang.Object r2 = r7.next()
            com.uwetrottmann.tmdb2.entities.Videos$Video r2 = (com.uwetrottmann.tmdb2.entities.Videos.Video) r2
            java.lang.String r3 = r2.site
            if (r3 == 0) goto L81
            java.lang.String r4 = "site"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.CharSequence r3 = kotlin.text.StringsKt.trim(r3)
            java.lang.String r3 = r3.toString()
            if (r3 == 0) goto L81
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r4)
            java.lang.String r4 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            goto L82
        L81:
            r3 = r0
        L82:
            java.lang.String r4 = "youtube"
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 == 0) goto L9e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "https://www.youtube.com/watch?v="
            r3.append(r4)
            java.lang.String r2 = r2.key
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            goto L9f
        L9e:
            r2 = r0
        L9f:
            if (r2 == 0) goto L54
            r1.add(r2)
            goto L54
        La5:
            r0 = r1
            java.util.List r0 = (java.util.List) r0
        La8:
            return r0
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.metaproviders.TmdbProvider.toTrailers(com.uwetrottmann.tmdb2.entities.Videos):java.util.List")
    }

    private fun toLoadResponse(movie: Movie): MovieLoadResponse {
        val tmdbProvider = this
        var str: String = movie.title
        if (str == null) {
            str = movie.original_title
        }
        Intrinsics.checkNotNullExpressionValue(str, "this.title ?: this.original_title")
        val url = getUrl(movie.f10051id, false)
        val tvType: TvType = TvType.Movie
        val appUtils = AppUtils.INSTANCE
        val str2: String = movie.imdb_id
        val num: Integer = movie.f10051id
        var str3: String = movie.title
        if (str3 == null) {
            str3 = movie.original_title
        }
        return MainAPIKt.newMovieLoadResponse(
            tmdbProvider as MainAPI,
            str,
            url,
            tvType,
            appUtils.toJson(TmdbLink(str2, num, null, null, str3)),
            `TmdbProvider$toLoadResponse$2`(this, movie) as Function1<MovieLoadResponse?, Unit>
        )
    }

    companion object {
        /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, T] */ /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, T] */ /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, T] */ /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List, T] */
        fun  /* synthetic */`getMainPage$suspendImpl`(
            tmdbProvider: TmdbProvider,
            continuation: Continuation<*>?
        ): Object {
            val objectRef: ObjectRef<*> = ObjectRef<Any?>()
            objectRef.element = CollectionsKt.emptyList<Any>()
            val objectRef2: ObjectRef<*> = ObjectRef<Any?>()
            objectRef2.element = CollectionsKt.emptyList<Any>()
            val objectRef3: ObjectRef<*> = ObjectRef<Any?>()
            objectRef3.element = CollectionsKt.emptyList<Any>()
            val objectRef4: ObjectRef<*> = ObjectRef<Any?>()
            objectRef4.element = CollectionsKt.emptyList<Any>()
            ParCollections.argamap(
                `TmdbProvider$getMainPage$2`(objectRef, tmdbProvider, null),
                `TmdbProvider$getMainPage$3`(objectRef2, tmdbProvider, null),
                `TmdbProvider$getMainPage$4`(objectRef3, tmdbProvider, null),
                `TmdbProvider$getMainPage$5`(objectRef4, tmdbProvider, null)
            )
            return HomePageResponse(
                CollectionsKt.listOf<Object>(
                    *arrayOf<HomePageList>(
                        HomePageList(
                            "Popular Movies",
                            objectRef.element as List,
                            null,
                            null,
                            null,
                            28,
                            null
                        ),
                        HomePageList(
                            "Popular Series",
                            objectRef2.element as List,
                            null,
                            null,
                            null,
                            28,
                            null
                        ),
                        HomePageList(
                            "Top Movies",
                            objectRef3.element as List,
                            null,
                            null,
                            null,
                            28,
                            null
                        ),
                        HomePageList(
                            "Top Series",
                            objectRef4.element as List,
                            null,
                            null,
                            null,
                            28,
                            null
                        )
                    ) as Array<Object>
                ), null, null, null, null, 30, null
            )
        }

        /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */ /* JADX WARN: Removed duplicated region for block: B:113:0x02a0  */ /* JADX WARN: Removed duplicated region for block: B:128:0x02e7  */ /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */ /* JADX WARN: Removed duplicated region for block: B:132:0x02f0  */ /* JADX WARN: Removed duplicated region for block: B:138:0x0318  */ /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */ /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */ /* JADX WARN: Removed duplicated region for block: B:164:0x0399  */ /* JADX WARN: Removed duplicated region for block: B:165:0x039c  */ /* JADX WARN: Removed duplicated region for block: B:167:0x039f  */ /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */ /* JADX WARN: Removed duplicated region for block: B:170:0x03a9  */ /* JADX WARN: Removed duplicated region for block: B:175:0x03b9  */ /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */ /* JADX WARN: Removed duplicated region for block: B:18:0x0092  */ /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */ /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */ /* JADX WARN: Removed duplicated region for block: B:21:0x00bf  */ /* JADX WARN: Removed duplicated region for block: B:43:0x013e  */ /* JADX WARN: Removed duplicated region for block: B:44:0x0143  */ /* JADX WARN: Removed duplicated region for block: B:46:0x0146  */ /* JADX WARN: Removed duplicated region for block: B:60:0x018c  */ /* JADX WARN: Removed duplicated region for block: B:75:0x01d3  */ /* JADX WARN: Removed duplicated region for block: B:79:0x01dc  */ /* JADX WARN: Removed duplicated region for block: B:85:0x0204  */ /* JADX WARN: Removed duplicated region for block: B:96:0x0251  */ /* JADX WARN: Removed duplicated region for block: B:97:0x0256  */ /* JADX WARN: Removed duplicated region for block: B:99:0x0259  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
        fun  /* synthetic */`load$suspendImpl`(
            r17: TmdbProvider?,
            r18: String?,
            r19: Continuation<*>?
        ): Any {
            /*
            Method dump skipped, instructions count: 1036
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.metaproviders.TmdbProvider.load\$suspendImpl(com.lagradost.cloudstream3.metaproviders.TmdbProvider, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
        }

        /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */ /* JADX WARN: Removed duplicated region for block: B:37:0x00b2 A[SYNTHETIC] */ /* JADX WARN: Removed duplicated region for block: B:40:0x0080 A[SYNTHETIC] */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
        fun  /* synthetic */`search$suspendImpl`(
            r10: TmdbProvider?,
            r11: String?,
            r12: Continuation<*>?
        ): Any {
            /*
            boolean r0 = r12 instanceof com.lagradost.cloudstream3.metaproviders.TmdbProvider$search$1
            if (r0 == 0) goto L14
            r0 = r12
            com.lagradost.cloudstream3.metaproviders.TmdbProvider$search$1 r0 = (com.lagradost.cloudstream3.metaproviders.TmdbProvider$search$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r12 = r0.label
            int r12 = r12 - r2
            r0.label = r12
            goto L19
        L14:
            com.lagradost.cloudstream3.metaproviders.TmdbProvider$search$1 r0 = new com.lagradost.cloudstream3.metaproviders.TmdbProvider$search$1
            r0.<init>(r10, r12)
        L19:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r10 = r0.L$0
            com.lagradost.cloudstream3.metaproviders.TmdbProvider r10 = (com.lagradost.cloudstream3.metaproviders.TmdbProvider) r10
            kotlin.ResultKt.throwOnFailure(r12)
            goto L64
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            kotlin.ResultKt.throwOnFailure(r12)
            com.uwetrottmann.tmdb2.Tmdb r12 = r10.tmdb
            com.uwetrottmann.tmdb2.services.SearchService r4 = r12.searchService()
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.boxing.boxInt(r3)
            boolean r12 = r10.getIncludeAdult()
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.boxing.boxBoolean(r12)
            java.lang.String r7 = "en-Us"
            java.lang.String r8 = "US"
            r5 = r11
            retrofit2.Call r11 = r4.multi(r5, r6, r7, r8, r9)
            java.lang.String r12 = "tmdb.searchService().mul…-Us\", \"US\", includeAdult)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r12)
            r0.L$0 = r10
            r0.label = r3
            java.lang.Object r12 = retrofit2.KotlinExtensions.awaitResponse(r11, r0)
            if (r12 != r1) goto L64
            return r1
        L64:
            retrofit2.Response r12 = (retrofit2.Response) r12
            java.lang.Object r11 = r12.body()
            com.uwetrottmann.tmdb2.entities.MediaResultsPage r11 = (com.uwetrottmann.tmdb2.entities.MediaResultsPage) r11
            r12 = 0
            if (r11 == 0) goto Lb9
            java.util.List<T> r11 = r11.results
            if (r11 == 0) goto Lb9
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r11 = r11.iterator()
        L80:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto Lb6
            java.lang.Object r1 = r11.next()
            com.uwetrottmann.tmdb2.entities.Media r1 = (com.uwetrottmann.tmdb2.entities.Media) r1
            com.uwetrottmann.tmdb2.entities.BaseMovie r2 = r1.movie
            if (r2 == 0) goto L9e
            java.lang.String r3 = "movie"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            com.lagradost.cloudstream3.MovieSearchResponse r2 = r10.toSearchResponse(r2)
            if (r2 == 0) goto L9e
            com.lagradost.cloudstream3.SearchResponse r2 = (com.lagradost.cloudstream3.SearchResponse) r2
            goto Lb0
        L9e:
            com.uwetrottmann.tmdb2.entities.BaseTvShow r1 = r1.tvShow
            if (r1 == 0) goto Laf
            java.lang.String r2 = "tvShow"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            com.lagradost.cloudstream3.TvSeriesSearchResponse r1 = r10.toSearchResponse(r1)
            r2 = r1
            com.lagradost.cloudstream3.SearchResponse r2 = (com.lagradost.cloudstream3.SearchResponse) r2
            goto Lb0
        Laf:
            r2 = r12
        Lb0:
            if (r2 == 0) goto L80
            r0.add(r2)
            goto L80
        Lb6:
            r12 = r0
            java.util.List r12 = (java.util.List) r12
        Lb9:
            return r12
        */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.metaproviders.TmdbProvider.search\$suspendImpl(com.lagradost.cloudstream3.metaproviders.TmdbProvider, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
        }
    }
}