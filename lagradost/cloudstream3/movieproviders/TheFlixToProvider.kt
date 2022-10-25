package com.lagradost.cloudstream3.movieproviders

import com.google.common.net.HttpHeaders
import java.util.ArrayList
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: TheFlixToProvider.kt */
@Metadata(
    m108d1 = ["\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u0000 22\u00020\u0001:\u001a23456789:;<=>?@ABCDEFGHIJKB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\nH\u0002J\u001d\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u001aH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ\u0011\u0010 \u001a\u00020!H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ\u001b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u001e\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJI\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u00042\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020*0(H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010-J\u001f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u00101\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u000c\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000c\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006L"],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider;", "Lcom/lagradost/cloudstream3/MainAPI;", "()V", "hasMainPage", "", "getHasMainPage", "()Z", "instantLinkLoading", "getInstantLinkLoading", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "cleanTitle", "title", "getCookies", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLoadMan", "Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$LoadMain;", "url", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMainPage", "Lcom/lagradost/cloudstream3/HomePageResponse;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "", "Lcom/lagradost/cloudstream3/SearchResponse;", "query", "Companion", "Docs", "Episodes", "Genres", "HomeJson", "HomeProps", "LoadMain", "LoadPageProps", "LoadProps", "MoviesListNewArrivals", "MoviesListTrending", "PageProps", "RecommendationsList", "RuntimeConfig", "RuntimeConfigData", "SearchJson", "SearchMainList", "SearchPageProps", "SearchProps", "Seasons", HttpHeaders.SERVER, "TheFlixMetadata", "TmdbServer", "TvsListNewEpisodes", "TvsListTrending", "VideoData", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class TheFlixToProvider : MainAPI() {
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val instantLinkLoading = false

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var name = "TheFlix.to"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var mainUrl = "https://theflix.to"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasMainPage = true

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val supportedTypes: Set<TvType> =
        SetsKt.setOf<Object>(*arrayOf<TvType>(TvType.Movie, TvType.TvSeries) as Array<Object>)

    /* compiled from: TheFlixToProvider.kt */
    @Metadata(m106k = 3, m105mv = [1, 6, 0], m103xi = 48) /* loaded from: classes3.dex */
    /* synthetic */
    object WhenMappings {
        /* synthetic */ val `$EnumSwitchMapping$0`: IntArray

        init {
            val iArr = IntArray(TvType.values().size)
            com.lagradost.cloudstream3.movieproviders.iArr.get(TvType.TvSeries.ordinal()) = 1
            com.lagradost.cloudstream3.movieproviders.iArr.get(TvType.Movie.ordinal()) = 2
            `$EnumSwitchMapping$0` = com.lagradost.cloudstream3.movieproviders.iArr
        }
    }

    /* compiled from: TheFlixToProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$Companion;", "", "()V", "latestCookies", "", "", "getLatestCookies", "()Ljava/util/Map;", "setLatestCookies", "(Ljava/util/Map;)V", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        val latestCookies: Map<String, String>
            get() = TheFlixToProvider.Companion.latestCookies

        fun setLatestCookies(map: Map<String?, String?>) {
            Intrinsics.checkNotNullParameter(map, "<set-?>")
            TheFlixToProvider.Companion.latestCookies = map
        }
    }

    /* compiled from: TheFlixToProvider.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$HomeJson;", "", "props", "Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$HomeProps;", "(Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$HomeProps;)V", "getProps", "()Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$HomeProps;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class HomeJson(@JsonProperty("props") props: HomeProps) {
        val props: HomeProps
        operator fun component1(): HomeProps {
            return props
        }

        fun copy(@JsonProperty("props") props: HomeProps): HomeJson {
            Intrinsics.checkNotNullParameter(props, "props")
            return HomeJson(props)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is HomeJson && Intrinsics.areEqual(
                props,
                (obj as HomeJson).props
            )
        }

        override fun hashCode(): Int {
            return props.hashCode()
        }

        override fun toString(): String {
            return "HomeJson(props=" + props + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(props, "props")
            this.props = props
        }

        @JvmOverloads
                /* synthetic */   constructor(
            homeProps: HomeProps? = null,
            i: Int = 1,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(if (i and 1 != 0) HomeProps(null, 1, null) else homeProps) {
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                homeJson: HomeJson,
                homeProps: HomeProps,
                i: Int,
                obj: Object?
            ): HomeJson {
                var homeProps = homeProps
                if (i and 1 != 0) {
                    homeProps = homeJson.props
                }
                return homeJson.copy(homeProps)
            }
        }
    }

    /* compiled from: TheFlixToProvider.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$HomeProps;", "", "pageProps", "Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$PageProps;", "(Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$PageProps;)V", "getPageProps", "()Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$PageProps;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class HomeProps(@JsonProperty("pageProps") pageProps: PageProps) {
        val pageProps: PageProps
        operator fun component1(): PageProps {
            return pageProps
        }

        fun copy(@JsonProperty("pageProps") pageProps: PageProps): HomeProps {
            Intrinsics.checkNotNullParameter(pageProps, "pageProps")
            return HomeProps(pageProps)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is HomeProps && Intrinsics.areEqual(
                pageProps,
                (obj as HomeProps).pageProps
            )
        }

        override fun hashCode(): Int {
            return pageProps.hashCode()
        }

        override fun toString(): String {
            return "HomeProps(pageProps=" + pageProps + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(pageProps, "pageProps")
            this.pageProps = pageProps
        }

        @JvmOverloads
                /* synthetic */   constructor(
            pageProps: PageProps? = null,
            i: Int = 1,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(if (i and 1 != 0) PageProps(null, null, null, null, 15, null) else pageProps) {
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                homeProps: HomeProps,
                pageProps: PageProps,
                i: Int,
                obj: Object?
            ): HomeProps {
                var pageProps = pageProps
                if (i and 1 != 0) {
                    pageProps = homeProps.pageProps
                }
                return homeProps.copy(pageProps)
            }
        }
    }

    /* compiled from: TheFlixToProvider.kt */
    @Metadata(
        m108d1 = ["\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$PageProps;", "", "moviesListTrending", "Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$MoviesListTrending;", "moviesListNewArrivals", "Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$MoviesListNewArrivals;", "tvsListTrending", "Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$TvsListTrending;", "tvsListNewEpisodes", "Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$TvsListNewEpisodes;", "(Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$MoviesListTrending;Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$MoviesListNewArrivals;Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$TvsListTrending;Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$TvsListNewEpisodes;)V", "getMoviesListNewArrivals", "()Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$MoviesListNewArrivals;", "getMoviesListTrending", "()Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$MoviesListTrending;", "getTvsListNewEpisodes", "()Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$TvsListNewEpisodes;", "getTvsListTrending", "()Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$TvsListTrending;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class PageProps(
        @JsonProperty("moviesListTrending") moviesListTrending: MoviesListTrending,
        @JsonProperty("moviesListNewArrivals") moviesListNewArrivals: MoviesListNewArrivals,
        @JsonProperty("tvsListTrending") tvsListTrending: TvsListTrending,
        @JsonProperty("tvsListNewEpisodes") tvsListNewEpisodes: TvsListNewEpisodes
    ) {
        val moviesListNewArrivals: MoviesListNewArrivals
        val moviesListTrending: MoviesListTrending
        val tvsListNewEpisodes: TvsListNewEpisodes
        val tvsListTrending: TvsListTrending
        operator fun component1(): MoviesListTrending {
            return moviesListTrending
        }

        operator fun component2(): MoviesListNewArrivals {
            return moviesListNewArrivals
        }

        operator fun component3(): TvsListTrending {
            return tvsListTrending
        }

        operator fun component4(): TvsListNewEpisodes {
            return tvsListNewEpisodes
        }

        fun copy(
            @JsonProperty("moviesListTrending") moviesListTrending: MoviesListTrending,
            @JsonProperty("moviesListNewArrivals") moviesListNewArrivals: MoviesListNewArrivals,
            @JsonProperty("tvsListTrending") tvsListTrending: TvsListTrending,
            @JsonProperty("tvsListNewEpisodes") tvsListNewEpisodes: TvsListNewEpisodes
        ): PageProps {
            Intrinsics.checkNotNullParameter(moviesListTrending, "moviesListTrending")
            Intrinsics.checkNotNullParameter(moviesListNewArrivals, "moviesListNewArrivals")
            Intrinsics.checkNotNullParameter(tvsListTrending, "tvsListTrending")
            Intrinsics.checkNotNullParameter(tvsListNewEpisodes, "tvsListNewEpisodes")
            return PageProps(
                moviesListTrending,
                moviesListNewArrivals,
                tvsListTrending,
                tvsListNewEpisodes
            )
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is PageProps) {
                val pageProps = obj as PageProps
                return Intrinsics.areEqual(
                    moviesListTrending,
                    pageProps.moviesListTrending
                ) && Intrinsics.areEqual(
                    moviesListNewArrivals, pageProps.moviesListNewArrivals
                ) && Intrinsics.areEqual(
                    tvsListTrending, pageProps.tvsListTrending
                ) && Intrinsics.areEqual(
                    tvsListNewEpisodes, pageProps.tvsListNewEpisodes
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return ((moviesListTrending.hashCode() * 31 + moviesListNewArrivals.hashCode()) * 31 + tvsListTrending.hashCode()) * 31 + tvsListNewEpisodes.hashCode()
        }

        override fun toString(): String {
            return "PageProps(moviesListTrending=" + moviesListTrending + ", moviesListNewArrivals=" + moviesListNewArrivals + ", tvsListTrending=" + tvsListTrending + ", tvsListNewEpisodes=" + tvsListNewEpisodes + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(moviesListTrending, "moviesListTrending")
            Intrinsics.checkNotNullParameter(moviesListNewArrivals, "moviesListNewArrivals")
            Intrinsics.checkNotNullParameter(tvsListTrending, "tvsListTrending")
            Intrinsics.checkNotNullParameter(tvsListNewEpisodes, "tvsListNewEpisodes")
            this.moviesListTrending = moviesListTrending
            this.moviesListNewArrivals = moviesListNewArrivals
            this.tvsListTrending = tvsListTrending
            this.tvsListNewEpisodes = tvsListNewEpisodes
        }

        @JvmOverloads
                /* synthetic */   constructor(
            moviesListTrending: MoviesListTrending? = null,
            moviesListNewArrivals: MoviesListNewArrivals? = null,
            tvsListTrending: TvsListTrending? = null,
            tvsListNewEpisodes: TvsListNewEpisodes? = null,
            i: Int = 15,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) MoviesListTrending(
                null,
                null,
                null,
                null,
                null,
                null,
                63,
                null
            ) else moviesListTrending,
            if (i and 2 != 0) MoviesListNewArrivals(
                null,
                null,
                null,
                null,
                null,
                null,
                63,
                null
            ) else moviesListNewArrivals,
            if (i and 4 != 0) TvsListTrending(
                null,
                null,
                null,
                null,
                null,
                null,
                63,
                null
            ) else tvsListTrending,
            if (i and 8 != 0) TvsListNewEpisodes(
                null,
                null,
                null,
                null,
                null,
                null,
                63,
                null
            ) else tvsListNewEpisodes
        ) {
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                pageProps: PageProps,
                moviesListTrending: MoviesListTrending,
                moviesListNewArrivals: MoviesListNewArrivals,
                tvsListTrending: TvsListTrending,
                tvsListNewEpisodes: TvsListNewEpisodes,
                i: Int,
                obj: Object?
            ): PageProps {
                var moviesListTrending = moviesListTrending
                var moviesListNewArrivals = moviesListNewArrivals
                var tvsListTrending = tvsListTrending
                var tvsListNewEpisodes = tvsListNewEpisodes
                if (i and 1 != 0) {
                    moviesListTrending = pageProps.moviesListTrending
                }
                if (i and 2 != 0) {
                    moviesListNewArrivals = pageProps.moviesListNewArrivals
                }
                if (i and 4 != 0) {
                    tvsListTrending = pageProps.tvsListTrending
                }
                if (i and 8 != 0) {
                    tvsListNewEpisodes = pageProps.tvsListNewEpisodes
                }
                return pageProps.copy(
                    moviesListTrending,
                    moviesListNewArrivals,
                    tvsListTrending,
                    tvsListNewEpisodes
                )
            }
        }
    }

    /* compiled from: TheFlixToProvider.kt */
    @Metadata(
        m108d1 = ["\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0018\b\u0003\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u000c¢\u0006\u0002\u0010\rJ\u0019\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000cHÆ\u0003Jd\u0010\u001e\u001a\u00020\u00002\u0018\b\u0003\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u000cHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0007HÖ\u0001J\t\u0010$\u001a\u00020\u000cHÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u000c¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$MoviesListTrending;", "", "docs", "Ljava/util/ArrayList;", "Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$Docs;", "Lkotlin/collections/ArrayList;", "total", "", "page", "limit", "pages", "type", "", "(Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getDocs", "()Ljava/util/ArrayList;", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPage", "getPages", "getTotal", "getType", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$MoviesListTrending;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class MoviesListTrending(
        @JsonProperty("docs") docs: ArrayList<Docs?>,
        @JsonProperty("total") num: Integer?,
        @JsonProperty("page") num2: Integer?,
        @JsonProperty("limit") num3: Integer?,
        @JsonProperty("pages") num4: Integer?,
        @JsonProperty("type") str: String?
    ) {
        private val docs: ArrayList<Docs>
        private val limit: Integer?
        private val page: Integer?
        private val pages: Integer?
        private val total: Integer?
        val type: String?
        operator fun component1(): ArrayList<Docs> {
            return docs
        }

        operator fun component2(): Integer? {
            return total
        }

        operator fun component3(): Integer? {
            return page
        }

        operator fun component4(): Integer? {
            return limit
        }

        operator fun component5(): Integer? {
            return pages
        }

        operator fun component6(): String? {
            return type
        }

        fun copy(
            @JsonProperty("docs") docs: ArrayList<Docs?>,
            @JsonProperty("total") num: Integer?,
            @JsonProperty("page") num2: Integer?,
            @JsonProperty("limit") num3: Integer?,
            @JsonProperty("pages") num4: Integer?,
            @JsonProperty("type") str: String?
        ): MoviesListTrending {
            Intrinsics.checkNotNullParameter(docs, "docs")
            return MoviesListTrending(docs, num, num2, num3, num4, str)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is MoviesListTrending) {
                val moviesListTrending = obj as MoviesListTrending
                return Intrinsics.areEqual(docs, moviesListTrending.docs) && Intrinsics.areEqual(
                    total, moviesListTrending.total
                ) && Intrinsics.areEqual(page, moviesListTrending.page) && Intrinsics.areEqual(
                    limit, moviesListTrending.limit
                ) && Intrinsics.areEqual(
                    pages, moviesListTrending.pages
                ) && Intrinsics.areEqual(type, moviesListTrending.type)
            }
            return false
        }

        override fun hashCode(): Int {
            val hashCode: Int = docs.hashCode() * 31
            val num: Integer? = total
            val hashCode2: Int = (hashCode + if (num == null) 0 else num.hashCode()) * 31
            val num2: Integer? = page
            val hashCode3: Int = (hashCode2 + if (num2 == null) 0 else num2.hashCode()) * 31
            val num3: Integer? = limit
            val hashCode4: Int = (hashCode3 + if (num3 == null) 0 else num3.hashCode()) * 31
            val num4: Integer? = pages
            val hashCode5: Int = (hashCode4 + if (num4 == null) 0 else num4.hashCode()) * 31
            val str = type
            return hashCode5 + (str?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "MoviesListTrending(docs=" + docs + ", total=" + total + ", page=" + page + ", limit=" + limit + ", pages=" + pages + ", type=" + type + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(docs, "docs")
            this.docs = docs
            total = num
            page = num2
            limit = num3
            pages = num4
            type = str
        }

        @JvmOverloads
                /* synthetic */   constructor(
            arrayList: ArrayList? = null,
            num: Integer? = null,
            num2: Integer? = null,
            num3: Integer? = null,
            num4: Integer? = null,
            str: String? = null,
            i: Int = 63,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) ArrayList() else arrayList,
            if (i and 2 != 0) null else num,
            if (i and 4 != 0) null else num2,
            if (i and 8 != 0) null else num3,
            if (i and 16 != 0) null else num4,
            if (i and 32 == 0) str else null
        ) {
        }

        fun getDocs(): ArrayList<Docs> {
            return docs
        }

        fun getTotal(): Integer? {
            return total
        }

        fun getPage(): Integer? {
            return page
        }

        fun getLimit(): Integer? {
            return limit
        }

        fun getPages(): Integer? {
            return pages
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                moviesListTrending: MoviesListTrending,
                arrayList: ArrayList,
                num: Integer?,
                num2: Integer?,
                num3: Integer?,
                num4: Integer?,
                str: String?,
                i: Int,
                obj: Object?
            ): MoviesListTrending {
                var num: Integer? = num
                var num2: Integer? = num2
                var num3: Integer? = num3
                var num4: Integer? = num4
                var str = str
                var arrayList2: ArrayList<Docs?> = arrayList
                if (i and 1 != 0) {
                    arrayList2 = moviesListTrending.docs
                }
                if (i and 2 != 0) {
                    num = moviesListTrending.total
                }
                val num5: Integer? = num
                if (i and 4 != 0) {
                    num2 = moviesListTrending.page
                }
                val num6: Integer? = num2
                if (i and 8 != 0) {
                    num3 = moviesListTrending.limit
                }
                val num7: Integer? = num3
                if (i and 16 != 0) {
                    num4 = moviesListTrending.pages
                }
                val num8: Integer? = num4
                if (i and 32 != 0) {
                    str = moviesListTrending.type
                }
                return moviesListTrending.copy(arrayList2, num5, num6, num7, num8, str)
            }
        }
    }

    /* compiled from: TheFlixToProvider.kt */
    @Metadata(
        m108d1 = ["\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0018\b\u0003\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u000c¢\u0006\u0002\u0010\rJ\u0019\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000cHÆ\u0003Jd\u0010\u001e\u001a\u00020\u00002\u0018\b\u0003\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u000cHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0007HÖ\u0001J\t\u0010$\u001a\u00020\u000cHÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u000c¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$MoviesListNewArrivals;", "", "docs", "Ljava/util/ArrayList;", "Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$Docs;", "Lkotlin/collections/ArrayList;", "total", "", "page", "limit", "pages", "type", "", "(Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getDocs", "()Ljava/util/ArrayList;", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPage", "getPages", "getTotal", "getType", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$MoviesListNewArrivals;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class MoviesListNewArrivals(
        @JsonProperty("docs") docs: ArrayList<Docs?>,
        @JsonProperty("total") num: Integer?,
        @JsonProperty("page") num2: Integer?,
        @JsonProperty("limit") num3: Integer?,
        @JsonProperty("pages") num4: Integer?,
        @JsonProperty("type") str: String?
    ) {
        private val docs: ArrayList<Docs>
        private val limit: Integer?
        private val page: Integer?
        private val pages: Integer?
        private val total: Integer?
        val type: String?
        operator fun component1(): ArrayList<Docs> {
            return docs
        }

        operator fun component2(): Integer? {
            return total
        }

        operator fun component3(): Integer? {
            return page
        }

        operator fun component4(): Integer? {
            return limit
        }

        operator fun component5(): Integer? {
            return pages
        }

        operator fun component6(): String? {
            return type
        }

        fun copy(
            @JsonProperty("docs") docs: ArrayList<Docs?>,
            @JsonProperty("total") num: Integer?,
            @JsonProperty("page") num2: Integer?,
            @JsonProperty("limit") num3: Integer?,
            @JsonProperty("pages") num4: Integer?,
            @JsonProperty("type") str: String?
        ): MoviesListNewArrivals {
            Intrinsics.checkNotNullParameter(docs, "docs")
            return MoviesListNewArrivals(docs, num, num2, num3, num4, str)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is MoviesListNewArrivals) {
                val moviesListNewArrivals = obj as MoviesListNewArrivals
                return Intrinsics.areEqual(docs, moviesListNewArrivals.docs) && Intrinsics.areEqual(
                    total, moviesListNewArrivals.total
                ) && Intrinsics.areEqual(
                    page, moviesListNewArrivals.page
                ) && Intrinsics.areEqual(
                    limit, moviesListNewArrivals.limit
                ) && Intrinsics.areEqual(
                    pages, moviesListNewArrivals.pages
                ) && Intrinsics.areEqual(
                    type, moviesListNewArrivals.type
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val hashCode: Int = docs.hashCode() * 31
            val num: Integer? = total
            val hashCode2: Int = (hashCode + if (num == null) 0 else num.hashCode()) * 31
            val num2: Integer? = page
            val hashCode3: Int = (hashCode2 + if (num2 == null) 0 else num2.hashCode()) * 31
            val num3: Integer? = limit
            val hashCode4: Int = (hashCode3 + if (num3 == null) 0 else num3.hashCode()) * 31
            val num4: Integer? = pages
            val hashCode5: Int = (hashCode4 + if (num4 == null) 0 else num4.hashCode()) * 31
            val str = type
            return hashCode5 + (str?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "MoviesListNewArrivals(docs=" + docs + ", total=" + total + ", page=" + page + ", limit=" + limit + ", pages=" + pages + ", type=" + type + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(docs, "docs")
            this.docs = docs
            total = num
            page = num2
            limit = num3
            pages = num4
            type = str
        }

        @JvmOverloads
                /* synthetic */   constructor(
            arrayList: ArrayList? = null,
            num: Integer? = null,
            num2: Integer? = null,
            num3: Integer? = null,
            num4: Integer? = null,
            str: String? = null,
            i: Int = 63,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) ArrayList() else arrayList,
            if (i and 2 != 0) null else num,
            if (i and 4 != 0) null else num2,
            if (i and 8 != 0) null else num3,
            if (i and 16 != 0) null else num4,
            if (i and 32 == 0) str else null
        ) {
        }

        fun getDocs(): ArrayList<Docs> {
            return docs
        }

        fun getTotal(): Integer? {
            return total
        }

        fun getPage(): Integer? {
            return page
        }

        fun getLimit(): Integer? {
            return limit
        }

        fun getPages(): Integer? {
            return pages
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                moviesListNewArrivals: MoviesListNewArrivals,
                arrayList: ArrayList,
                num: Integer?,
                num2: Integer?,
                num3: Integer?,
                num4: Integer?,
                str: String?,
                i: Int,
                obj: Object?
            ): MoviesListNewArrivals {
                var num: Integer? = num
                var num2: Integer? = num2
                var num3: Integer? = num3
                var num4: Integer? = num4
                var str = str
                var arrayList2: ArrayList<Docs?> = arrayList
                if (i and 1 != 0) {
                    arrayList2 = moviesListNewArrivals.docs
                }
                if (i and 2 != 0) {
                    num = moviesListNewArrivals.total
                }
                val num5: Integer? = num
                if (i and 4 != 0) {
                    num2 = moviesListNewArrivals.page
                }
                val num6: Integer? = num2
                if (i and 8 != 0) {
                    num3 = moviesListNewArrivals.limit
                }
                val num7: Integer? = num3
                if (i and 16 != 0) {
                    num4 = moviesListNewArrivals.pages
                }
                val num8: Integer? = num4
                if (i and 32 != 0) {
                    str = moviesListNewArrivals.type
                }
                return moviesListNewArrivals.copy(arrayList2, num5, num6, num7, num8, str)
            }
        }
    }

    /* compiled from: TheFlixToProvider.kt */
    @Metadata(
        m108d1 = ["\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0018\b\u0003\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u000c¢\u0006\u0002\u0010\rJ\u0019\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000cHÆ\u0003Jd\u0010\u001e\u001a\u00020\u00002\u0018\b\u0003\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u000cHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0007HÖ\u0001J\t\u0010$\u001a\u00020\u000cHÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u000c¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$TvsListTrending;", "", "docs", "Ljava/util/ArrayList;", "Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$Docs;", "Lkotlin/collections/ArrayList;", "total", "", "page", "limit", "pages", "type", "", "(Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getDocs", "()Ljava/util/ArrayList;", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPage", "getPages", "getTotal", "getType", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$TvsListTrending;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class TvsListTrending(
        @JsonProperty("docs") docs: ArrayList<Docs?>,
        @JsonProperty("total") num: Integer?,
        @JsonProperty("page") num2: Integer?,
        @JsonProperty("limit") num3: Integer?,
        @JsonProperty("pages") num4: Integer?,
        @JsonProperty("type") str: String?
    ) {
        private val docs: ArrayList<Docs>
        private val limit: Integer?
        private val page: Integer?
        private val pages: Integer?
        private val total: Integer?
        val type: String?
        operator fun component1(): ArrayList<Docs> {
            return docs
        }

        operator fun component2(): Integer? {
            return total
        }

        operator fun component3(): Integer? {
            return page
        }

        operator fun component4(): Integer? {
            return limit
        }

        operator fun component5(): Integer? {
            return pages
        }

        operator fun component6(): String? {
            return type
        }

        fun copy(
            @JsonProperty("docs") docs: ArrayList<Docs?>,
            @JsonProperty("total") num: Integer?,
            @JsonProperty("page") num2: Integer?,
            @JsonProperty("limit") num3: Integer?,
            @JsonProperty("pages") num4: Integer?,
            @JsonProperty("type") str: String?
        ): TvsListTrending {
            Intrinsics.checkNotNullParameter(docs, "docs")
            return TvsListTrending(docs, num, num2, num3, num4, str)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is TvsListTrending) {
                val tvsListTrending = obj as TvsListTrending
                return Intrinsics.areEqual(docs, tvsListTrending.docs) && Intrinsics.areEqual(
                    total, tvsListTrending.total
                ) && Intrinsics.areEqual(page, tvsListTrending.page) && Intrinsics.areEqual(
                    limit, tvsListTrending.limit
                ) && Intrinsics.areEqual(pages, tvsListTrending.pages) && Intrinsics.areEqual(
                    type, tvsListTrending.type
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val hashCode: Int = docs.hashCode() * 31
            val num: Integer? = total
            val hashCode2: Int = (hashCode + if (num == null) 0 else num.hashCode()) * 31
            val num2: Integer? = page
            val hashCode3: Int = (hashCode2 + if (num2 == null) 0 else num2.hashCode()) * 31
            val num3: Integer? = limit
            val hashCode4: Int = (hashCode3 + if (num3 == null) 0 else num3.hashCode()) * 31
            val num4: Integer? = pages
            val hashCode5: Int = (hashCode4 + if (num4 == null) 0 else num4.hashCode()) * 31
            val str = type
            return hashCode5 + (str?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "TvsListTrending(docs=" + docs + ", total=" + total + ", page=" + page + ", limit=" + limit + ", pages=" + pages + ", type=" + type + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(docs, "docs")
            this.docs = docs
            total = num
            page = num2
            limit = num3
            pages = num4
            type = str
        }

        @JvmOverloads
                /* synthetic */   constructor(
            arrayList: ArrayList? = null,
            num: Integer? = null,
            num2: Integer? = null,
            num3: Integer? = null,
            num4: Integer? = null,
            str: String? = null,
            i: Int = 63,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) ArrayList() else arrayList,
            if (i and 2 != 0) null else num,
            if (i and 4 != 0) null else num2,
            if (i and 8 != 0) null else num3,
            if (i and 16 != 0) null else num4,
            if (i and 32 == 0) str else null
        ) {
        }

        fun getDocs(): ArrayList<Docs> {
            return docs
        }

        fun getTotal(): Integer? {
            return total
        }

        fun getPage(): Integer? {
            return page
        }

        fun getLimit(): Integer? {
            return limit
        }

        fun getPages(): Integer? {
            return pages
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                tvsListTrending: TvsListTrending,
                arrayList: ArrayList,
                num: Integer?,
                num2: Integer?,
                num3: Integer?,
                num4: Integer?,
                str: String?,
                i: Int,
                obj: Object?
            ): TvsListTrending {
                var num: Integer? = num
                var num2: Integer? = num2
                var num3: Integer? = num3
                var num4: Integer? = num4
                var str = str
                var arrayList2: ArrayList<Docs?> = arrayList
                if (i and 1 != 0) {
                    arrayList2 = tvsListTrending.docs
                }
                if (i and 2 != 0) {
                    num = tvsListTrending.total
                }
                val num5: Integer? = num
                if (i and 4 != 0) {
                    num2 = tvsListTrending.page
                }
                val num6: Integer? = num2
                if (i and 8 != 0) {
                    num3 = tvsListTrending.limit
                }
                val num7: Integer? = num3
                if (i and 16 != 0) {
                    num4 = tvsListTrending.pages
                }
                val num8: Integer? = num4
                if (i and 32 != 0) {
                    str = tvsListTrending.type
                }
                return tvsListTrending.copy(arrayList2, num5, num6, num7, num8, str)
            }
        }
    }

    /* compiled from: TheFlixToProvider.kt */
    @Metadata(
        m108d1 = ["\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0018\b\u0003\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u000c¢\u0006\u0002\u0010\rJ\u0019\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000cHÆ\u0003Jd\u0010\u001e\u001a\u00020\u00002\u0018\b\u0003\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u000cHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0007HÖ\u0001J\t\u0010$\u001a\u00020\u000cHÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u000c¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$TvsListNewEpisodes;", "", "docs", "Ljava/util/ArrayList;", "Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$Docs;", "Lkotlin/collections/ArrayList;", "total", "", "page", "limit", "pages", "type", "", "(Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getDocs", "()Ljava/util/ArrayList;", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPage", "getPages", "getTotal", "getType", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$TvsListNewEpisodes;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class TvsListNewEpisodes(
        @JsonProperty("docs") docs: ArrayList<Docs?>,
        @JsonProperty("total") num: Integer?,
        @JsonProperty("page") num2: Integer?,
        @JsonProperty("limit") num3: Integer?,
        @JsonProperty("pages") num4: Integer?,
        @JsonProperty("type") str: String?
    ) {
        private val docs: ArrayList<Docs>
        private val limit: Integer?
        private val page: Integer?
        private val pages: Integer?
        private val total: Integer?
        val type: String?
        operator fun component1(): ArrayList<Docs> {
            return docs
        }

        operator fun component2(): Integer? {
            return total
        }

        operator fun component3(): Integer? {
            return page
        }

        operator fun component4(): Integer? {
            return limit
        }

        operator fun component5(): Integer? {
            return pages
        }

        operator fun component6(): String? {
            return type
        }

        fun copy(
            @JsonProperty("docs") docs: ArrayList<Docs?>,
            @JsonProperty("total") num: Integer?,
            @JsonProperty("page") num2: Integer?,
            @JsonProperty("limit") num3: Integer?,
            @JsonProperty("pages") num4: Integer?,
            @JsonProperty("type") str: String?
        ): TvsListNewEpisodes {
            Intrinsics.checkNotNullParameter(docs, "docs")
            return TvsListNewEpisodes(docs, num, num2, num3, num4, str)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is TvsListNewEpisodes) {
                val tvsListNewEpisodes = obj as TvsListNewEpisodes
                return Intrinsics.areEqual(docs, tvsListNewEpisodes.docs) && Intrinsics.areEqual(
                    total, tvsListNewEpisodes.total
                ) && Intrinsics.areEqual(page, tvsListNewEpisodes.page) && Intrinsics.areEqual(
                    limit, tvsListNewEpisodes.limit
                ) && Intrinsics.areEqual(
                    pages, tvsListNewEpisodes.pages
                ) && Intrinsics.areEqual(type, tvsListNewEpisodes.type)
            }
            return false
        }

        override fun hashCode(): Int {
            val hashCode: Int = docs.hashCode() * 31
            val num: Integer? = total
            val hashCode2: Int = (hashCode + if (num == null) 0 else num.hashCode()) * 31
            val num2: Integer? = page
            val hashCode3: Int = (hashCode2 + if (num2 == null) 0 else num2.hashCode()) * 31
            val num3: Integer? = limit
            val hashCode4: Int = (hashCode3 + if (num3 == null) 0 else num3.hashCode()) * 31
            val num4: Integer? = pages
            val hashCode5: Int = (hashCode4 + if (num4 == null) 0 else num4.hashCode()) * 31
            val str = type
            return hashCode5 + (str?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "TvsListNewEpisodes(docs=" + docs + ", total=" + total + ", page=" + page + ", limit=" + limit + ", pages=" + pages + ", type=" + type + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(docs, "docs")
            this.docs = docs
            total = num
            page = num2
            limit = num3
            pages = num4
            type = str
        }

        @JvmOverloads
                /* synthetic */   constructor(
            arrayList: ArrayList? = null,
            num: Integer? = null,
            num2: Integer? = null,
            num3: Integer? = null,
            num4: Integer? = null,
            str: String? = null,
            i: Int = 63,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) ArrayList() else arrayList,
            if (i and 2 != 0) null else num,
            if (i and 4 != 0) null else num2,
            if (i and 8 != 0) null else num3,
            if (i and 16 != 0) null else num4,
            if (i and 32 == 0) str else null
        ) {
        }

        fun getDocs(): ArrayList<Docs> {
            return docs
        }

        fun getTotal(): Integer? {
            return total
        }

        fun getPage(): Integer? {
            return page
        }

        fun getLimit(): Integer? {
            return limit
        }

        fun getPages(): Integer? {
            return pages
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                tvsListNewEpisodes: TvsListNewEpisodes,
                arrayList: ArrayList,
                num: Integer?,
                num2: Integer?,
                num3: Integer?,
                num4: Integer?,
                str: String?,
                i: Int,
                obj: Object?
            ): TvsListNewEpisodes {
                var num: Integer? = num
                var num2: Integer? = num2
                var num3: Integer? = num3
                var num4: Integer? = num4
                var str = str
                var arrayList2: ArrayList<Docs?> = arrayList
                if (i and 1 != 0) {
                    arrayList2 = tvsListNewEpisodes.docs
                }
                if (i and 2 != 0) {
                    num = tvsListNewEpisodes.total
                }
                val num5: Integer? = num
                if (i and 4 != 0) {
                    num2 = tvsListNewEpisodes.page
                }
                val num6: Integer? = num2
                if (i and 8 != 0) {
                    num3 = tvsListNewEpisodes.limit
                }
                val num7: Integer? = num3
                if (i and 16 != 0) {
                    num4 = tvsListNewEpisodes.pages
                }
                val num8: Integer? = num4
                if (i and 32 != 0) {
                    str = tvsListNewEpisodes.type
                }
                return tvsListNewEpisodes.copy(arrayList2, num5, num6, num7, num8, str)
            }
        }
    }

    /* compiled from: TheFlixToProvider.kt */
    @Metadata(
        m108d1 = ["\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b4\b\u0086\b\u0018\u00002\u00020\u0001Bí\u0001\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u001c\b\u0003\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0019¢\u0006\u0002\u0010\u001aJ\t\u00105\u001a\u00020\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\$J\u0010\u0010=\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u001d\u0010>\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0019HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010A\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\$J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010D\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\$J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jö\u0001\u0010G\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u001c\b\u0003\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0019HÆ\u0001¢\u0006\u0002\u0010HJ\u0013\u0010I\u001a\u00020\u00162\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010K\u001a\u00020\bHÖ\u0001J\t\u0010L\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010\$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010%\u001a\u0004\b.\u0010\$R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR%\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0019¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010+\u001a\u0004\b3\u0010*R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010%\u001a\u0004\b4\u0010$¨\u0006M"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$Docs;", "", "name", "", "originalLanguage", "popularity", "", "runtime", "", "status", "voteAverage", "voteCount", "cast", "director", "overview", "posterUrl", "releaseDate", "createdAt", "updatedAt", "conversionDate", "id", "available", "", "videos", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/ArrayList;)V", "getAvailable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCast", "()Ljava/lang/String;", "getConversionDate", "getCreatedAt", "getDirector", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "getOriginalLanguage", "getOverview", "getPopularity", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPosterUrl", "getReleaseDate", "getRuntime", "getStatus", "getUpdatedAt", "getVideos", "()Ljava/util/ArrayList;", "getVoteAverage", "getVoteCount", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/ArrayList;)Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$Docs;", "equals", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Docs(
        @JsonProperty("name") name: String,
        @JsonProperty("originalLanguage") str: String?,
        @JsonProperty("popularity") d: Double?,
        @JsonProperty("runtime") num: Integer?,
        @JsonProperty("status") str2: String?,
        @JsonProperty("voteAverage") d2: Double?,
        @JsonProperty("voteCount") num2: Integer?,
        @JsonProperty("cast") str3: String?,
        @JsonProperty("director") str4: String?,
        @JsonProperty("overview") str5: String?,
        @JsonProperty("posterUrl") str6: String?,
        @JsonProperty("releaseDate") str7: String?,
        @JsonProperty("createdAt") str8: String?,
        @JsonProperty("updatedAt") str9: String?,
        @JsonProperty("conversionDate") str10: String?,
        @JsonProperty("id") num3: Integer?,
        @JsonProperty("available") bool: Boolean?,
        @JsonProperty("videos") arrayList: ArrayList<String?>
    ) {
        val available: Boolean?
        val cast: String?
        val conversionDate: String?
        val createdAt: String?
        val director: String?

        /* renamed from: id */
        private val f9982id: Integer?
        val name: String
        val originalLanguage: String?
        val overview: String?
        val popularity: Double?
        val posterUrl: String?
        val releaseDate: String?
        private val runtime: Integer?
        val status: String?
        val updatedAt: String?
        private val videos: ArrayList<String>
        val voteAverage: Double?
        private val voteCount: Integer?
        operator fun component1(): String {
            return name
        }

        operator fun component10(): String? {
            return overview
        }

        operator fun component11(): String? {
            return posterUrl
        }

        operator fun component12(): String? {
            return releaseDate
        }

        operator fun component13(): String? {
            return createdAt
        }

        operator fun component14(): String? {
            return updatedAt
        }

        operator fun component15(): String? {
            return conversionDate
        }

        operator fun component16(): Integer? {
            return f9982id
        }

        operator fun component17(): Boolean? {
            return available
        }

        operator fun component18(): ArrayList<String> {
            return videos
        }

        operator fun component2(): String? {
            return originalLanguage
        }

        operator fun component3(): Double? {
            return popularity
        }

        operator fun component4(): Integer? {
            return runtime
        }

        operator fun component5(): String? {
            return status
        }

        operator fun component6(): Double? {
            return voteAverage
        }

        operator fun component7(): Integer? {
            return voteCount
        }

        operator fun component8(): String? {
            return cast
        }

        operator fun component9(): String? {
            return director
        }

        fun copy(
            @JsonProperty("name") name: String,
            @JsonProperty("originalLanguage") str: String?,
            @JsonProperty("popularity") d: Double?,
            @JsonProperty("runtime") num: Integer?,
            @JsonProperty("status") str2: String?,
            @JsonProperty("voteAverage") d2: Double?,
            @JsonProperty("voteCount") num2: Integer?,
            @JsonProperty("cast") str3: String?,
            @JsonProperty("director") str4: String?,
            @JsonProperty("overview") str5: String?,
            @JsonProperty("posterUrl") str6: String?,
            @JsonProperty("releaseDate") str7: String?,
            @JsonProperty("createdAt") str8: String?,
            @JsonProperty("updatedAt") str9: String?,
            @JsonProperty("conversionDate") str10: String?,
            @JsonProperty("id") num3: Integer?,
            @JsonProperty("available") bool: Boolean?,
            @JsonProperty("videos") arrayList: ArrayList<String?>
        ): Docs {
            Intrinsics.checkNotNullParameter(name, "name")
            return Docs(
                name,
                str,
                d,
                num,
                str2,
                d2,
                num2,
                str3,
                str4,
                str5,
                str6,
                str7,
                str8,
                str9,
                str10,
                num3,
                bool,
                arrayList
            )
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Docs) {
                val docs = obj as Docs
                return Intrinsics.areEqual(name, docs.name) && Intrinsics.areEqual(
                    originalLanguage, docs.originalLanguage
                ) && Intrinsics.areEqual(
                    popularity as Object?, docs.popularity as Object?
                ) && Intrinsics.areEqual(
                    runtime, docs.runtime
                ) && Intrinsics.areEqual(status, docs.status) && Intrinsics.areEqual(
                    voteAverage as Object?, docs.voteAverage as Object?
                ) && Intrinsics.areEqual(
                    voteCount, docs.voteCount
                ) && Intrinsics.areEqual(cast, docs.cast) && Intrinsics.areEqual(
                    director, docs.director
                ) && Intrinsics.areEqual(overview, docs.overview) && Intrinsics.areEqual(
                    posterUrl, docs.posterUrl
                ) && Intrinsics.areEqual(
                    releaseDate, docs.releaseDate
                ) && Intrinsics.areEqual(
                    createdAt, docs.createdAt
                ) && Intrinsics.areEqual(updatedAt, docs.updatedAt) && Intrinsics.areEqual(
                    conversionDate, docs.conversionDate
                ) && Intrinsics.areEqual(
                    f9982id, docs.f9982id
                ) && Intrinsics.areEqual(available, docs.available) && Intrinsics.areEqual(
                    videos, docs.videos
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val hashCode = name.hashCode() * 31
            val str = originalLanguage
            val hashCode2 = (hashCode + (str?.hashCode() ?: 0)) * 31
            val d = popularity
            val hashCode3 = (hashCode2 + (d?.hashCode() ?: 0)) * 31
            val num: Integer? = runtime
            val hashCode4: Int = (hashCode3 + if (num == null) 0 else num.hashCode()) * 31
            val str2 = status
            val hashCode5 = (hashCode4 + (str2?.hashCode() ?: 0)) * 31
            val d2 = voteAverage
            val hashCode6 = (hashCode5 + (d2?.hashCode() ?: 0)) * 31
            val num2: Integer? = voteCount
            val hashCode7: Int = (hashCode6 + if (num2 == null) 0 else num2.hashCode()) * 31
            val str3 = cast
            val hashCode8 = (hashCode7 + (str3?.hashCode() ?: 0)) * 31
            val str4 = director
            val hashCode9 = (hashCode8 + (str4?.hashCode() ?: 0)) * 31
            val str5 = overview
            val hashCode10 = (hashCode9 + (str5?.hashCode() ?: 0)) * 31
            val str6 = posterUrl
            val hashCode11 = (hashCode10 + (str6?.hashCode() ?: 0)) * 31
            val str7 = releaseDate
            val hashCode12 = (hashCode11 + (str7?.hashCode() ?: 0)) * 31
            val str8 = createdAt
            val hashCode13 = (hashCode12 + (str8?.hashCode() ?: 0)) * 31
            val str9 = updatedAt
            val hashCode14 = (hashCode13 + (str9?.hashCode() ?: 0)) * 31
            val str10 = conversionDate
            val hashCode15 = (hashCode14 + (str10?.hashCode() ?: 0)) * 31
            val num3: Integer? = f9982id
            val hashCode16: Int = (hashCode15 + if (num3 == null) 0 else num3.hashCode()) * 31
            val bool = available
            val hashCode17 = (hashCode16 + (bool?.hashCode() ?: 0)) * 31
            val arrayList: ArrayList<String> = videos
            return hashCode17 + if (arrayList != null) arrayList.hashCode() else 0
        }

        override fun toString(): String {
            return "Docs(name=" + name + ", originalLanguage=" + originalLanguage + ", popularity=" + popularity + ", runtime=" + runtime + ", status=" + status + ", voteAverage=" + voteAverage + ", voteCount=" + voteCount + ", cast=" + cast + ", director=" + director + ", overview=" + overview + ", posterUrl=" + posterUrl + ", releaseDate=" + releaseDate + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", conversionDate=" + conversionDate + ", id=" + f9982id + ", available=" + available + ", videos=" + videos + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(name, "name")
            this.name = name
            originalLanguage = str
            popularity = d
            runtime = num
            status = str2
            voteAverage = d2
            voteCount = num2
            cast = str3
            director = str4
            overview = str5
            posterUrl = str6
            releaseDate = str7
            createdAt = str8
            updatedAt = str9
            conversionDate = str10
            f9982id = num3
            available = bool
            videos = arrayList
        }

        @JvmOverloads
                /* synthetic */   constructor(
            str: String? = null,
            str2: String? = null,
            d: Double? = null,
            num: Integer? = null,
            str3: String? = null,
            d2: Double? = null,
            num2: Integer? = null,
            str4: String? = null,
            str5: String? = null,
            str6: String? = null,
            str7: String? = null,
            str8: String? = null,
            str9: String? = null,
            str10: String? = null,
            str11: String? = null,
            num3: Integer? = null,
            bool: Boolean? = null,
            arrayList: ArrayList? = null,
            i: Int = 262143,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            (if (i and 1 != 0) String() else str)!!,
            if (i and 2 != 0) null else str2,
            if (i and 4 != 0) null else d,
            if (i and 8 != 0) null else num,
            if (i and 16 != 0) null else str3,
            if (i and 32 != 0) null else d2,
            if (i and 64 != 0) null else num2,
            if (i and 128 != 0) null else str4,
            if (i and 256 != 0) null else str5,
            if (i and 512 != 0) null else str6,
            if (i and 1024 != 0) null else str7,
            if (i and 2048 != 0) null else str8,
            if (i and 4096 != 0) null else str9,
            if (i and 8192 != 0) null else str10,
            if (i and 16384 != 0) null else str11,
            if (i and 32768 != 0) null else num3,
            if (i and 65536 != 0) null else bool,
            if (i and 131072 != 0) ArrayList() else arrayList
        ) {
        }

        fun getRuntime(): Integer? {
            return runtime
        }

        fun getVoteCount(): Integer? {
            return voteCount
        }

        val id: Integer?
            get() = f9982id

        fun getVideos(): ArrayList<String> {
            return videos
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun getCookies(r25: Continuation<in MutableMap<String?, String?>?>?): Any {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.TheFlixToProvider.getCookies(kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */ /* JADX WARN: Removed duplicated region for block: B:20:0x00a7  */ /* JADX WARN: Removed duplicated region for block: B:42:0x025a  */ /* JADX WARN: Removed duplicated region for block: B:45:0x0261  */ /* JADX WARN: Removed duplicated region for block: B:47:0x0273  */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun getMainPage(r31: Continuation<in HomePageResponse?>?): Any? {
        /*
            Method dump skipped, instructions count: 633
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.TheFlixToProvider.getMainPage(kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* compiled from: TheFlixToProvider.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$SearchJson;", "", "props", "Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$SearchProps;", "(Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$SearchProps;)V", "getProps", "()Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$SearchProps;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class SearchJson(@JsonProperty("props") props: SearchProps) {
        val props: SearchProps
        operator fun component1(): SearchProps {
            return props
        }

        fun copy(@JsonProperty("props") props: SearchProps): SearchJson {
            Intrinsics.checkNotNullParameter(props, "props")
            return SearchJson(props)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is SearchJson && Intrinsics.areEqual(
                props,
                (obj as SearchJson).props
            )
        }

        override fun hashCode(): Int {
            return props.hashCode()
        }

        override fun toString(): String {
            return "SearchJson(props=" + props + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(props, "props")
            this.props = props
        }

        @JvmOverloads
                /* synthetic */   constructor(
            searchProps: SearchProps? = null,
            i: Int = 1,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(if (i and 1 != 0) SearchProps(null, 1, null) else searchProps) {
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                searchJson: SearchJson,
                searchProps: SearchProps,
                i: Int,
                obj: Object?
            ): SearchJson {
                var searchProps = searchProps
                if (i and 1 != 0) {
                    searchProps = searchJson.props
                }
                return searchJson.copy(searchProps)
            }
        }
    }

    /* compiled from: TheFlixToProvider.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$SearchProps;", "", "pageProps", "Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$SearchPageProps;", "(Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$SearchPageProps;)V", "getPageProps", "()Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$SearchPageProps;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class SearchProps(@JsonProperty("pageProps") pageProps: SearchPageProps) {
        val pageProps: SearchPageProps
        operator fun component1(): SearchPageProps {
            return pageProps
        }

        fun copy(@JsonProperty("pageProps") pageProps: SearchPageProps): SearchProps {
            Intrinsics.checkNotNullParameter(pageProps, "pageProps")
            return SearchProps(pageProps)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is SearchProps && Intrinsics.areEqual(
                pageProps,
                (obj as SearchProps).pageProps
            )
        }

        override fun hashCode(): Int {
            return pageProps.hashCode()
        }

        override fun toString(): String {
            return "SearchProps(pageProps=" + pageProps + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(pageProps, "pageProps")
            this.pageProps = pageProps
        }

        @JvmOverloads
                /* synthetic */   constructor(
            searchPageProps: SearchPageProps? = null,
            i: Int = 1,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(if (i and 1 != 0) SearchPageProps(null, 1, null) else searchPageProps) {
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                searchProps: SearchProps,
                searchPageProps: SearchPageProps,
                i: Int,
                obj: Object?
            ): SearchProps {
                var searchPageProps = searchPageProps
                if (i and 1 != 0) {
                    searchPageProps = searchProps.pageProps
                }
                return searchProps.copy(searchPageProps)
            }
        }
    }

    /* compiled from: TheFlixToProvider.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$SearchPageProps;", "", "mainList", "Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$SearchMainList;", "(Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$SearchMainList;)V", "getMainList", "()Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$SearchMainList;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class SearchPageProps(@JsonProperty("mainList") mainList: SearchMainList) {
        val mainList: SearchMainList
        operator fun component1(): SearchMainList {
            return mainList
        }

        fun copy(@JsonProperty("mainList") mainList: SearchMainList): SearchPageProps {
            Intrinsics.checkNotNullParameter(mainList, "mainList")
            return SearchPageProps(mainList)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is SearchPageProps && Intrinsics.areEqual(
                mainList,
                (obj as SearchPageProps).mainList
            )
        }

        override fun hashCode(): Int {
            return mainList.hashCode()
        }

        override fun toString(): String {
            return "SearchPageProps(mainList=" + mainList + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(mainList, "mainList")
            this.mainList = mainList
        }

        @JvmOverloads
                /* synthetic */   constructor(
            searchMainList: SearchMainList? = null,
            i: Int = 1,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) SearchMainList(
                null,
                null,
                null,
                null,
                null,
                null,
                63,
                null
            ) else searchMainList
        ) {
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                searchPageProps: SearchPageProps,
                searchMainList: SearchMainList,
                i: Int,
                obj: Object?
            ): SearchPageProps {
                var searchMainList = searchMainList
                if (i and 1 != 0) {
                    searchMainList = searchPageProps.mainList
                }
                return searchPageProps.copy(searchMainList)
            }
        }
    }

    /* compiled from: TheFlixToProvider.kt */
    @Metadata(
        m108d1 = ["\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0018\b\u0003\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u000c¢\u0006\u0002\u0010\rJ\u0019\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000cHÆ\u0003Jd\u0010\u001e\u001a\u00020\u00002\u0018\b\u0003\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u000cHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0007HÖ\u0001J\t\u0010$\u001a\u00020\u000cHÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u000c¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$SearchMainList;", "", "docs", "Ljava/util/ArrayList;", "Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$Docs;", "Lkotlin/collections/ArrayList;", "total", "", "page", "limit", "pages", "type", "", "(Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getDocs", "()Ljava/util/ArrayList;", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPage", "getPages", "getTotal", "getType", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$SearchMainList;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class SearchMainList(
        @JsonProperty("docs") docs: ArrayList<Docs?>,
        @JsonProperty("total") num: Integer?,
        @JsonProperty("page") num2: Integer?,
        @JsonProperty("limit") num3: Integer?,
        @JsonProperty("pages") num4: Integer?,
        @JsonProperty("type") str: String?
    ) {
        private val docs: ArrayList<Docs>
        private val limit: Integer?
        private val page: Integer?
        private val pages: Integer?
        private val total: Integer?
        val type: String?
        operator fun component1(): ArrayList<Docs> {
            return docs
        }

        operator fun component2(): Integer? {
            return total
        }

        operator fun component3(): Integer? {
            return page
        }

        operator fun component4(): Integer? {
            return limit
        }

        operator fun component5(): Integer? {
            return pages
        }

        operator fun component6(): String? {
            return type
        }

        fun copy(
            @JsonProperty("docs") docs: ArrayList<Docs?>,
            @JsonProperty("total") num: Integer?,
            @JsonProperty("page") num2: Integer?,
            @JsonProperty("limit") num3: Integer?,
            @JsonProperty("pages") num4: Integer?,
            @JsonProperty("type") str: String?
        ): SearchMainList {
            Intrinsics.checkNotNullParameter(docs, "docs")
            return SearchMainList(docs, num, num2, num3, num4, str)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is SearchMainList) {
                val searchMainList = obj as SearchMainList
                return Intrinsics.areEqual(docs, searchMainList.docs) && Intrinsics.areEqual(
                    total, searchMainList.total
                ) && Intrinsics.areEqual(page, searchMainList.page) && Intrinsics.areEqual(
                    limit, searchMainList.limit
                ) && Intrinsics.areEqual(pages, searchMainList.pages) && Intrinsics.areEqual(
                    type, searchMainList.type
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val hashCode: Int = docs.hashCode() * 31
            val num: Integer? = total
            val hashCode2: Int = (hashCode + if (num == null) 0 else num.hashCode()) * 31
            val num2: Integer? = page
            val hashCode3: Int = (hashCode2 + if (num2 == null) 0 else num2.hashCode()) * 31
            val num3: Integer? = limit
            val hashCode4: Int = (hashCode3 + if (num3 == null) 0 else num3.hashCode()) * 31
            val num4: Integer? = pages
            val hashCode5: Int = (hashCode4 + if (num4 == null) 0 else num4.hashCode()) * 31
            val str = type
            return hashCode5 + (str?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "SearchMainList(docs=" + docs + ", total=" + total + ", page=" + page + ", limit=" + limit + ", pages=" + pages + ", type=" + type + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(docs, "docs")
            this.docs = docs
            total = num
            page = num2
            limit = num3
            pages = num4
            type = str
        }

        @JvmOverloads
                /* synthetic */   constructor(
            arrayList: ArrayList? = null,
            num: Integer? = null,
            num2: Integer? = null,
            num3: Integer? = null,
            num4: Integer? = null,
            str: String? = null,
            i: Int = 63,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) ArrayList() else arrayList,
            if (i and 2 != 0) null else num,
            if (i and 4 != 0) null else num2,
            if (i and 8 != 0) null else num3,
            if (i and 16 != 0) null else num4,
            if (i and 32 == 0) str else null
        ) {
        }

        fun getDocs(): ArrayList<Docs> {
            return docs
        }

        fun getTotal(): Integer? {
            return total
        }

        fun getPage(): Integer? {
            return page
        }

        fun getLimit(): Integer? {
            return limit
        }

        fun getPages(): Integer? {
            return pages
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                searchMainList: SearchMainList,
                arrayList: ArrayList,
                num: Integer?,
                num2: Integer?,
                num3: Integer?,
                num4: Integer?,
                str: String?,
                i: Int,
                obj: Object?
            ): SearchMainList {
                var num: Integer? = num
                var num2: Integer? = num2
                var num3: Integer? = num3
                var num4: Integer? = num4
                var str = str
                var arrayList2: ArrayList<Docs?> = arrayList
                if (i and 1 != 0) {
                    arrayList2 = searchMainList.docs
                }
                if (i and 2 != 0) {
                    num = searchMainList.total
                }
                val num5: Integer? = num
                if (i and 4 != 0) {
                    num2 = searchMainList.page
                }
                val num6: Integer? = num2
                if (i and 8 != 0) {
                    num3 = searchMainList.limit
                }
                val num7: Integer? = num3
                if (i and 16 != 0) {
                    num4 = searchMainList.pages
                }
                val num8: Integer? = num4
                if (i and 32 != 0) {
                    str = searchMainList.type
                }
                return searchMainList.copy(arrayList2, num5, num6, num7, num8, str)
            }
        }
    }

    @Override // com.lagradost.cloudstream3.MainAPI
    override fun search(
        str: String,
        continuation: Continuation<in List<SearchResponse?>?>?
    ): Object {
        val arrayList = ArrayList()
        ParCollections.apmap(
            CollectionsKt.listOf<Object>(
                *arrayOf(
                    "$mainUrl/movies/trending?search=$str",
                    "$mainUrl/tv-shows/trending?search=$str"
                ) as Array<Object>
            ), `TheFlixToProvider$search$2`(this, arrayList, null)
        )
        return arrayList
    }

    /* compiled from: TheFlixToProvider.kt */
    @Metadata(
        m108d1 = ["\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0010Jn\u0010#\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\$J\u0013\u0010%\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u000c\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0014\u0010\u0010R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0015\u0010\u0010R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\t\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006*"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$LoadMain;", "", "props", "Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$LoadProps;", "page", "", "buildId", "runtimeConfig", "Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$RuntimeConfig;", "isFallback", "", "gssp", "customServer", "appGip", "(Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$LoadProps;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$RuntimeConfig;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAppGip", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBuildId", "()Ljava/lang/String;", "getCustomServer", "getGssp", "getPage", "getProps", "()Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$LoadProps;", "getRuntimeConfig", "()Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$RuntimeConfig;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$LoadProps;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$RuntimeConfig;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$LoadMain;", "equals", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class LoadMain(
        @param:JsonProperty("props") val props: LoadProps,
        @param:JsonProperty(
            "page"
        ) val page: String?,
        @param:JsonProperty("buildId") val buildId: String?,
        @param:JsonProperty("runtimeConfig") val runtimeConfig: RuntimeConfig,
        @param:JsonProperty(
            "isFallback"
        ) val isFallback: Boolean?,
        @param:JsonProperty("gssp") val gssp: Boolean?,
        @param:JsonProperty(
            "customServer"
        ) val customServer: Boolean?,
        @param:JsonProperty("appGip") val appGip: Boolean?
    ) {
        operator fun component1(): LoadProps {
            return props
        }

        operator fun component2(): String? {
            return page
        }

        operator fun component3(): String? {
            return buildId
        }

        operator fun component4(): RuntimeConfig {
            return runtimeConfig
        }

        operator fun component5(): Boolean? {
            return isFallback
        }

        operator fun component6(): Boolean? {
            return gssp
        }

        operator fun component7(): Boolean? {
            return customServer
        }

        operator fun component8(): Boolean? {
            return appGip
        }

        fun copy(
            @JsonProperty("props") loadProps: LoadProps,
            @JsonProperty("page") str: String?,
            @JsonProperty("buildId") str2: String?,
            @JsonProperty("runtimeConfig") runtimeConfig: RuntimeConfig,
            @JsonProperty("isFallback") bool: Boolean?,
            @JsonProperty("gssp") bool2: Boolean?,
            @JsonProperty("customServer") bool3: Boolean?,
            @JsonProperty("appGip") bool4: Boolean?
        ): LoadMain {
            return LoadMain(loadProps, str, str2, runtimeConfig, bool, bool2, bool3, bool4)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is LoadMain) {
                val loadMain = obj as LoadMain
                return Intrinsics.areEqual(props, loadMain.props) && Intrinsics.areEqual(
                    page, loadMain.page
                ) && Intrinsics.areEqual(buildId, loadMain.buildId) && Intrinsics.areEqual(
                    runtimeConfig, loadMain.runtimeConfig
                ) && Intrinsics.areEqual(
                    isFallback, loadMain.isFallback
                ) && Intrinsics.areEqual(gssp, loadMain.gssp) && Intrinsics.areEqual(
                    customServer, loadMain.customServer
                ) && Intrinsics.areEqual(
                    appGip, loadMain.appGip
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val loadProps = props
            val hashCode = (loadProps?.hashCode() ?: 0) * 31
            val str = page
            val hashCode2 = (hashCode + (str?.hashCode() ?: 0)) * 31
            val str2 = buildId
            val hashCode3 = (hashCode2 + (str2?.hashCode() ?: 0)) * 31
            val runtimeConfig = runtimeConfig
            val hashCode4 = (hashCode3 + (runtimeConfig?.hashCode() ?: 0)) * 31
            val bool = isFallback
            val hashCode5 = (hashCode4 + (bool?.hashCode() ?: 0)) * 31
            val bool2 = gssp
            val hashCode6 = (hashCode5 + (bool2?.hashCode() ?: 0)) * 31
            val bool3 = customServer
            val hashCode7 = (hashCode6 + (bool3?.hashCode() ?: 0)) * 31
            val bool4 = appGip
            return hashCode7 + (bool4?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "LoadMain(props=" + props + ", page=" + page + ", buildId=" + buildId + ", runtimeConfig=" + runtimeConfig + ", isFallback=" + isFallback + ", gssp=" + gssp + ", customServer=" + customServer + ", appGip=" + appGip + ')'
        }

        @JvmOverloads
                /* synthetic */   constructor(
            loadProps: LoadProps? = null,
            str: String? = null,
            str2: String? = null,
            runtimeConfig: RuntimeConfig? = null,
            bool: Boolean? = null,
            bool2: Boolean? = null,
            bool3: Boolean? = null,
            bool4: Boolean? = null,
            i: Int = 255,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) LoadProps(null, null, 3, null) else loadProps,
            if (i and 2 != 0) null else str,
            if (i and 4 != 0) null else str2,
            if (i and 8 != 0) RuntimeConfig(null, null, null, null, 15, null) else runtimeConfig,
            if (i and 16 != 0) null else bool,
            if (i and 32 != 0) null else bool2,
            if (i and 64 != 0) null else bool3,
            if (i and 128 == 0) bool4 else null
        ) {
        }
    }

    /* compiled from: TheFlixToProvider.kt */
    @Metadata(
        m108d1 = ["\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$LoadProps;", "", "pageProps", "Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$LoadPageProps;", "_NSSP", "", "(Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$LoadPageProps;Ljava/lang/Boolean;)V", "get_NSSP", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPageProps", "()Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$LoadPageProps;", "component1", "component2", "copy", "(Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$LoadPageProps;Ljava/lang/Boolean;)Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$LoadProps;", "equals", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class LoadProps(
        @param:JsonProperty("pageProps") val pageProps: LoadPageProps, @param:JsonProperty(
            "__N_SSP"
        ) private val _NSSP: Boolean?
    ) {
        operator fun component1(): LoadPageProps {
            return pageProps
        }

        operator fun component2(): Boolean? {
            return _NSSP
        }

        fun copy(
            @JsonProperty("pageProps") loadPageProps: LoadPageProps,
            @JsonProperty("__N_SSP") bool: Boolean?
        ): LoadProps {
            return LoadProps(loadPageProps, bool)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is LoadProps) {
                val loadProps = obj as LoadProps
                return Intrinsics.areEqual(pageProps, loadProps.pageProps) && Intrinsics.areEqual(
                    _NSSP, loadProps._NSSP
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val loadPageProps = pageProps
            val hashCode = (loadPageProps?.hashCode() ?: 0) * 31
            val bool = _NSSP
            return hashCode + (bool?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "LoadProps(pageProps=" + pageProps + ", _NSSP=" + _NSSP + ')'
        }

        @JvmOverloads
                /* synthetic */   constructor(
            loadPageProps: LoadPageProps? = null,
            bool: Boolean? = null,
            i: Int = 3,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) LoadPageProps(
                null,
                null,
                null,
                null,
                15,
                null
            ) else loadPageProps, if (i and 2 != 0) null else bool
        ) {
        }

        fun get_NSSP(): Boolean? {
            return _NSSP
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                loadProps: LoadProps,
                loadPageProps: LoadPageProps,
                bool: Boolean?,
                i: Int,
                obj: Object?
            ): LoadProps {
                var loadPageProps = loadPageProps
                var bool = bool
                if (i and 1 != 0) {
                    loadPageProps = loadProps.pageProps
                }
                if (i and 2 != 0) {
                    bool = loadProps._NSSP
                }
                return loadProps.copy(loadPageProps, bool)
            }
        }
    }

    /* compiled from: TheFlixToProvider.kt */
    @Metadata(
        m108d1 = ["\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u001c\b\u0003\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\n¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u001d\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\nHÆ\u0003JK\u0010\u0017\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u001c\b\u0003\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\nHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\tHÖ\u0001R%\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\n¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u001e"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$LoadPageProps;", "", "selectedTv", "Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$TheFlixMetadata;", "movie", "recommendationsList", "Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$RecommendationsList;", "basePageSegments", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "(Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$TheFlixMetadata;Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$TheFlixMetadata;Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$RecommendationsList;Ljava/util/ArrayList;)V", "getBasePageSegments", "()Ljava/util/ArrayList;", "getMovie", "()Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$TheFlixMetadata;", "getRecommendationsList", "()Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$RecommendationsList;", "getSelectedTv", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class LoadPageProps {
        private val basePageSegments: ArrayList<String>
        val movie: TheFlixMetadata
        val recommendationsList: RecommendationsList
        val selectedTv: TheFlixMetadata
        operator fun component1(): TheFlixMetadata {
            return selectedTv
        }

        operator fun component2(): TheFlixMetadata {
            return movie
        }

        operator fun component3(): RecommendationsList {
            return recommendationsList
        }

        operator fun component4(): ArrayList<String> {
            return basePageSegments
        }

        fun copy(
            @JsonProperty("selectedTv") theFlixMetadata: TheFlixMetadata,
            @JsonProperty("movie") theFlixMetadata2: TheFlixMetadata,
            @JsonProperty("recommendationsList") recommendationsList: RecommendationsList,
            @JsonProperty("basePageSegments") arrayList: ArrayList<String?>
        ): LoadPageProps {
            return LoadPageProps(theFlixMetadata, theFlixMetadata2, recommendationsList, arrayList)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is LoadPageProps) {
                val loadPageProps = obj as LoadPageProps
                return Intrinsics.areEqual(
                    selectedTv,
                    loadPageProps.selectedTv
                ) && Intrinsics.areEqual(
                    movie, loadPageProps.movie
                ) && Intrinsics.areEqual(
                    recommendationsList, loadPageProps.recommendationsList
                ) && Intrinsics.areEqual(
                    basePageSegments, loadPageProps.basePageSegments
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val theFlixMetadata = selectedTv
            val hashCode = (theFlixMetadata?.hashCode() ?: 0) * 31
            val theFlixMetadata2 = movie
            val hashCode2 = (hashCode + (theFlixMetadata2?.hashCode() ?: 0)) * 31
            val recommendationsList = recommendationsList
            val hashCode3 = (hashCode2 + (recommendationsList?.hashCode() ?: 0)) * 31
            val arrayList: ArrayList<String> = basePageSegments
            return hashCode3 + if (arrayList != null) arrayList.hashCode() else 0
        }

        override fun toString(): String {
            return "LoadPageProps(selectedTv=" + selectedTv + ", movie=" + movie + ", recommendationsList=" + recommendationsList + ", basePageSegments=" + basePageSegments + ')'
        }

        constructor(
            @JsonProperty("selectedTv") theFlixMetadata: TheFlixMetadata,
            @JsonProperty("movie") theFlixMetadata2: TheFlixMetadata,
            @JsonProperty("recommendationsList") recommendationsList: RecommendationsList,
            @JsonProperty("basePageSegments") arrayList: ArrayList<String?>
        ) {
            selectedTv = theFlixMetadata
            movie = theFlixMetadata2
            this.recommendationsList = recommendationsList
            basePageSegments = arrayList
        }

        @JvmOverloads
                /* synthetic */   constructor(
            theFlixMetadata: TheFlixMetadata? = null,
            theFlixMetadata2: TheFlixMetadata? = null,
            recommendationsList: RecommendationsList? = null,
            arrayList: ArrayList? = null,
            i: Int = 15,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) {
            val loadPageProps: LoadPageProps
            val arrayList2: ArrayList?
            val theFlixMetadata3 = if (i and 1 != 0) TheFlixMetadata(
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                4194303,
                null
            ) else theFlixMetadata!!
            val theFlixMetadata4 = if (i and 2 != 0) TheFlixMetadata(
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                4194303,
                null
            ) else theFlixMetadata2!!
            val recommendationsList2 = if (i and 4 != 0) RecommendationsList(
                null,
                null,
                null,
                null,
                null,
                null,
                63,
                null
            ) else recommendationsList!!
            if (i and 8 != 0) {
                arrayList2 = ArrayList()
                loadPageProps = this
            } else {
                loadPageProps = this
                arrayList2 = arrayList
            }
            LoadPageProps(theFlixMetadata3, theFlixMetadata4, recommendationsList2, arrayList2)
        }

        fun getBasePageSegments(): ArrayList<String> {
            return basePageSegments
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                loadPageProps: LoadPageProps,
                theFlixMetadata: TheFlixMetadata,
                theFlixMetadata2: TheFlixMetadata,
                recommendationsList: RecommendationsList,
                arrayList: ArrayList,
                i: Int,
                obj: Object?
            ): LoadPageProps {
                var theFlixMetadata = theFlixMetadata
                var theFlixMetadata2 = theFlixMetadata2
                var recommendationsList = recommendationsList
                var arrayList: ArrayList = arrayList
                if (i and 1 != 0) {
                    theFlixMetadata = loadPageProps.selectedTv
                }
                if (i and 2 != 0) {
                    theFlixMetadata2 = loadPageProps.movie
                }
                if (i and 4 != 0) {
                    recommendationsList = loadPageProps.recommendationsList
                }
                if (i and 8 != 0) {
                    arrayList = loadPageProps.basePageSegments
                }
                return loadPageProps.copy(
                    theFlixMetadata,
                    theFlixMetadata2,
                    recommendationsList,
                    arrayList
                )
            }
        }
    }

    /* compiled from: TheFlixToProvider.kt */
    @Metadata(
        m108d1 = ["\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u000c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b>\b\u0086\b\u0018\u00002\u00020\u0001BÃ\u0002\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u001c\b\u0003\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019j\n\u0012\u0004\u0012\u00020\u001a\u0018\u0001`\u001b\u0012\u001c\b\u0003\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0019j\n\u0012\u0004\u0012\u00020\u001d\u0018\u0001`\u001b\u0012\u001c\b\u0003\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0019j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u001b\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010 J\u0010\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010H\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010\"J\u001d\u0010I\u001a\u0016\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019j\n\u0012\u0004\u0012\u00020\u001a\u0018\u0001`\u001bHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001d\u0010K\u001a\u0016\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0019j\n\u0012\u0004\u0012\u00020\u001d\u0018\u0001`\u001bHÆ\u0003J\u001d\u0010L\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0019j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u001bHÆ\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010P\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010Q\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u00104J\u000b\u0010R\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u00104J\u0010\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010)JÌ\u0002\u0010U\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u001c\b\u0003\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019j\n\u0012\u0004\u0012\u00020\u001a\u0018\u0001`\u001b2\u001c\b\u0003\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0019j\n\u0012\u0004\u0012\u00020\u001d\u0018\u0001`\u001b2\u001c\b\u0003\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0019j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u001b2\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010VJ\u0013\u0010W\u001a\u00020\u00172\b\u0010X\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Y\u001a\u00020\u0003HÖ\u0001J\t\u0010Z\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R%\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019j\n\u0012\u0004\u0012\u00020\u001a\u0018\u0001`\u001b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010*\u001a\u0004\b-\u0010)R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010%R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010*\u001a\u0004\b/\u0010)R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010*\u001a\u0004\b0\u0010)R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010%R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u0010%R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u00105\u001a\u0004\b3\u00104R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u0010%R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010*\u001a\u0004\b8\u0010)R%\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0019j\n\u0012\u0004\u0012\u00020\u001d\u0018\u0001`\u001b¢\u0006\b\n\u0000\u001a\u0004\b9\u0010,R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u0010%R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b;\u0010%R%\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0019j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u001b¢\u0006\b\n\u0000\u001a\u0004\b<\u0010,R\u0015\u0010\u000c\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u00105\u001a\u0004\b=\u00104R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010*\u001a\u0004\b>\u0010)¨\u0006["],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$TheFlixMetadata;", "", "episodeRuntime", "", "name", "", "numberOfSeasons", "numberOfEpisodes", "originalLanguage", "popularity", "", "status", "voteAverage", "voteCount", "cast", "director", "overview", "posterUrl", "releaseDate", "createdAt", "updatedAt", "id", "available", "", "genres", "Ljava/util/ArrayList;", "Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$Genres;", "Lkotlin/collections/ArrayList;", "seasons", "Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$Seasons;", "videos", "runtime", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Integer;)V", "getAvailable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCast", "()Ljava/lang/String;", "getCreatedAt", "getDirector", "getEpisodeRuntime", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGenres", "()Ljava/util/ArrayList;", "getId", "getName", "getNumberOfEpisodes", "getNumberOfSeasons", "getOriginalLanguage", "getOverview", "getPopularity", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPosterUrl", "getReleaseDate", "getRuntime", "getSeasons", "getStatus", "getUpdatedAt", "getVideos", "getVoteAverage", "getVoteCount", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Integer;)Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$TheFlixMetadata;", "equals", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class TheFlixMetadata(
        @JsonProperty("episodeRuntime") num: Integer?,
        @JsonProperty("name") str: String?,
        @JsonProperty("numberOfSeasons") num2: Integer?,
        @JsonProperty("numberOfEpisodes") num3: Integer?,
        @JsonProperty("originalLanguage") str2: String?,
        @JsonProperty("popularity") d: Double?,
        @JsonProperty("status") str3: String?,
        @JsonProperty("voteAverage") d2: Double?,
        @JsonProperty("voteCount") num4: Integer?,
        @JsonProperty("cast") str4: String?,
        @JsonProperty("director") str5: String?,
        @JsonProperty("overview") str6: String?,
        @JsonProperty("posterUrl") str7: String?,
        @JsonProperty("releaseDate") str8: String?,
        @JsonProperty("createdAt") str9: String?,
        @JsonProperty("updatedAt") str10: String?,
        @JsonProperty("id") num5: Integer?,
        @JsonProperty("available") bool: Boolean?,
        @JsonProperty("genres") arrayList: ArrayList<Genres?>,
        @JsonProperty("seasons") arrayList2: ArrayList<Seasons?>,
        @JsonProperty("videos") arrayList3: ArrayList<String?>,
        @JsonProperty("runtime") num6: Integer?
    ) {
        val available: Boolean?
        val cast: String?
        val createdAt: String?
        val director: String?
        private val episodeRuntime: Integer?
        private val genres: ArrayList<Genres>

        /* renamed from: id */
        private val f9986id: Integer?
        val name: String?
        private val numberOfEpisodes: Integer?
        private val numberOfSeasons: Integer?
        val originalLanguage: String?
        val overview: String?
        val popularity: Double?
        val posterUrl: String?
        val releaseDate: String?
        private val runtime: Integer?
        private val seasons: ArrayList<Seasons>
        val status: String?
        val updatedAt: String?
        private val videos: ArrayList<String>
        val voteAverage: Double?
        private val voteCount: Integer?
        operator fun component1(): Integer? {
            return episodeRuntime
        }

        operator fun component10(): String? {
            return cast
        }

        operator fun component11(): String? {
            return director
        }

        operator fun component12(): String? {
            return overview
        }

        operator fun component13(): String? {
            return posterUrl
        }

        operator fun component14(): String? {
            return releaseDate
        }

        operator fun component15(): String? {
            return createdAt
        }

        operator fun component16(): String? {
            return updatedAt
        }

        operator fun component17(): Integer? {
            return f9986id
        }

        operator fun component18(): Boolean? {
            return available
        }

        operator fun component19(): ArrayList<Genres> {
            return genres
        }

        operator fun component2(): String? {
            return name
        }

        operator fun component20(): ArrayList<Seasons> {
            return seasons
        }

        operator fun component21(): ArrayList<String> {
            return videos
        }

        operator fun component22(): Integer? {
            return runtime
        }

        operator fun component3(): Integer? {
            return numberOfSeasons
        }

        operator fun component4(): Integer? {
            return numberOfEpisodes
        }

        operator fun component5(): String? {
            return originalLanguage
        }

        operator fun component6(): Double? {
            return popularity
        }

        operator fun component7(): String? {
            return status
        }

        operator fun component8(): Double? {
            return voteAverage
        }

        operator fun component9(): Integer? {
            return voteCount
        }

        fun copy(
            @JsonProperty("episodeRuntime") num: Integer?,
            @JsonProperty("name") str: String?,
            @JsonProperty("numberOfSeasons") num2: Integer?,
            @JsonProperty("numberOfEpisodes") num3: Integer?,
            @JsonProperty("originalLanguage") str2: String?,
            @JsonProperty("popularity") d: Double?,
            @JsonProperty("status") str3: String?,
            @JsonProperty("voteAverage") d2: Double?,
            @JsonProperty("voteCount") num4: Integer?,
            @JsonProperty("cast") str4: String?,
            @JsonProperty("director") str5: String?,
            @JsonProperty("overview") str6: String?,
            @JsonProperty("posterUrl") str7: String?,
            @JsonProperty("releaseDate") str8: String?,
            @JsonProperty("createdAt") str9: String?,
            @JsonProperty("updatedAt") str10: String?,
            @JsonProperty("id") num5: Integer?,
            @JsonProperty("available") bool: Boolean?,
            @JsonProperty("genres") arrayList: ArrayList<Genres?>,
            @JsonProperty("seasons") arrayList2: ArrayList<Seasons?>,
            @JsonProperty("videos") arrayList3: ArrayList<String?>,
            @JsonProperty("runtime") num6: Integer?
        ): TheFlixMetadata {
            return TheFlixMetadata(
                num,
                str,
                num2,
                num3,
                str2,
                d,
                str3,
                d2,
                num4,
                str4,
                str5,
                str6,
                str7,
                str8,
                str9,
                str10,
                num5,
                bool,
                arrayList,
                arrayList2,
                arrayList3,
                num6
            )
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is TheFlixMetadata) {
                val theFlixMetadata = obj as TheFlixMetadata
                return Intrinsics.areEqual(
                    episodeRuntime,
                    theFlixMetadata.episodeRuntime
                ) && Intrinsics.areEqual(
                    name, theFlixMetadata.name
                ) && Intrinsics.areEqual(
                    numberOfSeasons, theFlixMetadata.numberOfSeasons
                ) && Intrinsics.areEqual(
                    numberOfEpisodes, theFlixMetadata.numberOfEpisodes
                ) && Intrinsics.areEqual(
                    originalLanguage, theFlixMetadata.originalLanguage
                ) && Intrinsics.areEqual(
                    popularity as Object?, theFlixMetadata.popularity as Object?
                ) && Intrinsics.areEqual(
                    status, theFlixMetadata.status
                ) && Intrinsics.areEqual(
                    voteAverage as Object?, theFlixMetadata.voteAverage as Object?
                ) && Intrinsics.areEqual(
                    voteCount, theFlixMetadata.voteCount
                ) && Intrinsics.areEqual(
                    cast, theFlixMetadata.cast
                ) && Intrinsics.areEqual(director, theFlixMetadata.director) && Intrinsics.areEqual(
                    overview, theFlixMetadata.overview
                ) && Intrinsics.areEqual(
                    posterUrl, theFlixMetadata.posterUrl
                ) && Intrinsics.areEqual(
                    releaseDate, theFlixMetadata.releaseDate
                ) && Intrinsics.areEqual(
                    createdAt, theFlixMetadata.createdAt
                ) && Intrinsics.areEqual(
                    updatedAt, theFlixMetadata.updatedAt
                ) && Intrinsics.areEqual(
                    f9986id, theFlixMetadata.f9986id
                ) && Intrinsics.areEqual(
                    available, theFlixMetadata.available
                ) && Intrinsics.areEqual(
                    genres, theFlixMetadata.genres
                ) && Intrinsics.areEqual(
                    seasons, theFlixMetadata.seasons
                ) && Intrinsics.areEqual(
                    videos, theFlixMetadata.videos
                ) && Intrinsics.areEqual(
                    runtime, theFlixMetadata.runtime
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val num: Integer? = episodeRuntime
            val hashCode = (if (num == null) 0 else num.hashCode()) * 31
            val str = name
            val hashCode2 = (hashCode + (str?.hashCode() ?: 0)) * 31
            val num2: Integer? = numberOfSeasons
            val hashCode3: Int = (hashCode2 + if (num2 == null) 0 else num2.hashCode()) * 31
            val num3: Integer? = numberOfEpisodes
            val hashCode4: Int = (hashCode3 + if (num3 == null) 0 else num3.hashCode()) * 31
            val str2 = originalLanguage
            val hashCode5 = (hashCode4 + (str2?.hashCode() ?: 0)) * 31
            val d = popularity
            val hashCode6 = (hashCode5 + (d?.hashCode() ?: 0)) * 31
            val str3 = status
            val hashCode7 = (hashCode6 + (str3?.hashCode() ?: 0)) * 31
            val d2 = voteAverage
            val hashCode8 = (hashCode7 + (d2?.hashCode() ?: 0)) * 31
            val num4: Integer? = voteCount
            val hashCode9: Int = (hashCode8 + if (num4 == null) 0 else num4.hashCode()) * 31
            val str4 = cast
            val hashCode10 = (hashCode9 + (str4?.hashCode() ?: 0)) * 31
            val str5 = director
            val hashCode11 = (hashCode10 + (str5?.hashCode() ?: 0)) * 31
            val str6 = overview
            val hashCode12 = (hashCode11 + (str6?.hashCode() ?: 0)) * 31
            val str7 = posterUrl
            val hashCode13 = (hashCode12 + (str7?.hashCode() ?: 0)) * 31
            val str8 = releaseDate
            val hashCode14 = (hashCode13 + (str8?.hashCode() ?: 0)) * 31
            val str9 = createdAt
            val hashCode15 = (hashCode14 + (str9?.hashCode() ?: 0)) * 31
            val str10 = updatedAt
            val hashCode16 = (hashCode15 + (str10?.hashCode() ?: 0)) * 31
            val num5: Integer? = f9986id
            val hashCode17: Int = (hashCode16 + if (num5 == null) 0 else num5.hashCode()) * 31
            val bool = available
            val hashCode18 = (hashCode17 + (bool?.hashCode() ?: 0)) * 31
            val arrayList: ArrayList<Genres> = genres
            val hashCode19: Int =
                (hashCode18 + if (arrayList == null) 0 else arrayList.hashCode()) * 31
            val arrayList2: ArrayList<Seasons> = seasons
            val hashCode20: Int =
                (hashCode19 + if (arrayList2 == null) 0 else arrayList2.hashCode()) * 31
            val arrayList3: ArrayList<String> = videos
            val hashCode21: Int =
                (hashCode20 + if (arrayList3 == null) 0 else arrayList3.hashCode()) * 31
            val num6: Integer? = runtime
            return hashCode21 + if (num6 != null) num6.hashCode() else 0
        }

        override fun toString(): String {
            return "TheFlixMetadata(episodeRuntime=" + episodeRuntime + ", name=" + name + ", numberOfSeasons=" + numberOfSeasons + ", numberOfEpisodes=" + numberOfEpisodes + ", originalLanguage=" + originalLanguage + ", popularity=" + popularity + ", status=" + status + ", voteAverage=" + voteAverage + ", voteCount=" + voteCount + ", cast=" + cast + ", director=" + director + ", overview=" + overview + ", posterUrl=" + posterUrl + ", releaseDate=" + releaseDate + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", id=" + f9986id + ", available=" + available + ", genres=" + genres + ", seasons=" + seasons + ", videos=" + videos + ", runtime=" + runtime + ')'
        }

        init {
            episodeRuntime = num
            name = str
            numberOfSeasons = num2
            numberOfEpisodes = num3
            originalLanguage = str2
            popularity = d
            status = str3
            voteAverage = d2
            voteCount = num4
            cast = str4
            director = str5
            overview = str6
            posterUrl = str7
            releaseDate = str8
            createdAt = str9
            updatedAt = str10
            f9986id = num5
            available = bool
            genres = arrayList
            seasons = arrayList2
            videos = arrayList3
            runtime = num6
        }

        fun getEpisodeRuntime(): Integer? {
            return episodeRuntime
        }

        fun getNumberOfSeasons(): Integer? {
            return numberOfSeasons
        }

        fun getNumberOfEpisodes(): Integer? {
            return numberOfEpisodes
        }

        fun getVoteCount(): Integer? {
            return voteCount
        }

        val id: Integer?
            get() = f9986id

        @JvmOverloads
                /* synthetic */   constructor(
            num: Integer? = null,
            str: String? = null,
            num2: Integer? = null,
            num3: Integer? = null,
            str2: String? = null,
            d: Double? = null,
            str3: String? = null,
            d2: Double? = null,
            num4: Integer? = null,
            str4: String? = null,
            str5: String? = null,
            str6: String? = null,
            str7: String? = null,
            str8: String? = null,
            str9: String? = null,
            str10: String? = null,
            num5: Integer? = null,
            bool: Boolean? = null,
            arrayList: ArrayList? = null,
            arrayList2: ArrayList? = null,
            arrayList3: ArrayList? = null,
            num6: Integer? = null,
            i: Int = 4194303,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) null else num,
            if (i and 2 != 0) null else str,
            if (i and 4 != 0) null else num2,
            if (i and 8 != 0) null else num3,
            if (i and 16 != 0) null else str2,
            if (i and 32 != 0) null else d,
            if (i and 64 != 0) null else str3,
            if (i and 128 != 0) null else d2,
            if (i and 256 != 0) null else num4,
            if (i and 512 != 0) null else str4,
            if (i and 1024 != 0) null else str5,
            if (i and 2048 != 0) null else str6,
            if (i and 4096 != 0) null else str7,
            if (i and 8192 != 0) null else str8,
            if (i and 16384 != 0) null else str9,
            if (i and 32768 != 0) null else str10,
            if (i and 65536 != 0) null else num5,
            if (i and 131072 != 0) null else bool,
            if (i and 262144 != 0) ArrayList() else arrayList,
            if (i and 524288 != 0) ArrayList() else arrayList2,
            if (i and 1048576 != 0) ArrayList() else arrayList3,
            if (i and 2097152 != 0) null else num6
        ) {
        }

        fun getGenres(): ArrayList<Genres> {
            return genres
        }

        fun getSeasons(): ArrayList<Seasons> {
            return seasons
        }

        fun getVideos(): ArrayList<String> {
            return videos
        }

        fun getRuntime(): Integer? {
            return runtime
        }
    }

    /* compiled from: TheFlixToProvider.kt */
    @Metadata(
        m108d1 = ["\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u0005\u0012\u001c\b\u0003\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\u0010¢\u0006\u0002\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\u0010HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0098\u0001\u0010*\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u00052\u001c\b\u0003\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\u0010HÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R%\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u000c\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001e\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013¨\u00061"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$Seasons;", "", "name", "", "numberOfEpisodes", "", "seasonNumber", "overview", "posterUrl", "releaseDate", "createdAt", "updatedAt", "id", "episodes", "Ljava/util/ArrayList;", "Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$Episodes;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/ArrayList;)V", "getCreatedAt", "()Ljava/lang/String;", "getEpisodes", "()Ljava/util/ArrayList;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "getNumberOfEpisodes", "getOverview", "getPosterUrl", "getReleaseDate", "getSeasonNumber", "getUpdatedAt", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/ArrayList;)Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$Seasons;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Seasons(
        @param:JsonProperty("name") val name: String?,
        @JsonProperty("numberOfEpisodes") num: Integer?,
        @JsonProperty("seasonNumber") num2: Integer?,
        @JsonProperty("overview") str2: String?,
        @JsonProperty("posterUrl") str3: String?,
        @JsonProperty("releaseDate") str4: String?,
        @JsonProperty("createdAt") str5: String?,
        @JsonProperty("updatedAt") str6: String?,
        @JsonProperty("id") num3: Integer?,
        @JsonProperty("episodes") arrayList: ArrayList<Episodes?>
    ) {
        val createdAt: String?
        private val episodes: ArrayList<Episodes>

        /* renamed from: id */
        private val f9985id: Integer?
        private val numberOfEpisodes: Integer?
        val overview: String?
        val posterUrl: String?
        val releaseDate: String?
        private val seasonNumber: Integer?
        val updatedAt: String?
        operator fun component1(): String? {
            return name
        }

        operator fun component10(): ArrayList<Episodes> {
            return episodes
        }

        operator fun component2(): Integer? {
            return numberOfEpisodes
        }

        operator fun component3(): Integer? {
            return seasonNumber
        }

        operator fun component4(): String? {
            return overview
        }

        operator fun component5(): String? {
            return posterUrl
        }

        operator fun component6(): String? {
            return releaseDate
        }

        operator fun component7(): String? {
            return createdAt
        }

        operator fun component8(): String? {
            return updatedAt
        }

        operator fun component9(): Integer? {
            return f9985id
        }

        fun copy(
            @JsonProperty("name") str: String?,
            @JsonProperty("numberOfEpisodes") num: Integer?,
            @JsonProperty("seasonNumber") num2: Integer?,
            @JsonProperty("overview") str2: String?,
            @JsonProperty("posterUrl") str3: String?,
            @JsonProperty("releaseDate") str4: String?,
            @JsonProperty("createdAt") str5: String?,
            @JsonProperty("updatedAt") str6: String?,
            @JsonProperty("id") num3: Integer?,
            @JsonProperty("episodes") arrayList: ArrayList<Episodes?>
        ): Seasons {
            return Seasons(str, num, num2, str2, str3, str4, str5, str6, num3, arrayList)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Seasons) {
                val seasons = obj as Seasons
                return Intrinsics.areEqual(name, seasons.name) && Intrinsics.areEqual(
                    numberOfEpisodes, seasons.numberOfEpisodes
                ) && Intrinsics.areEqual(
                    seasonNumber, seasons.seasonNumber
                ) && Intrinsics.areEqual(
                    overview, seasons.overview
                ) && Intrinsics.areEqual(posterUrl, seasons.posterUrl) && Intrinsics.areEqual(
                    releaseDate, seasons.releaseDate
                ) && Intrinsics.areEqual(
                    createdAt, seasons.createdAt
                ) && Intrinsics.areEqual(
                    updatedAt, seasons.updatedAt
                ) && Intrinsics.areEqual(f9985id, seasons.f9985id) && Intrinsics.areEqual(
                    episodes, seasons.episodes
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val str = name
            val hashCode = (str?.hashCode() ?: 0) * 31
            val num: Integer? = numberOfEpisodes
            val hashCode2: Int = (hashCode + if (num == null) 0 else num.hashCode()) * 31
            val num2: Integer? = seasonNumber
            val hashCode3: Int = (hashCode2 + if (num2 == null) 0 else num2.hashCode()) * 31
            val str2 = overview
            val hashCode4 = (hashCode3 + (str2?.hashCode() ?: 0)) * 31
            val str3 = posterUrl
            val hashCode5 = (hashCode4 + (str3?.hashCode() ?: 0)) * 31
            val str4 = releaseDate
            val hashCode6 = (hashCode5 + (str4?.hashCode() ?: 0)) * 31
            val str5 = createdAt
            val hashCode7 = (hashCode6 + (str5?.hashCode() ?: 0)) * 31
            val str6 = updatedAt
            val hashCode8 = (hashCode7 + (str6?.hashCode() ?: 0)) * 31
            val num3: Integer? = f9985id
            val hashCode9: Int = (hashCode8 + if (num3 == null) 0 else num3.hashCode()) * 31
            val arrayList: ArrayList<Episodes> = episodes
            return hashCode9 + if (arrayList != null) arrayList.hashCode() else 0
        }

        override fun toString(): String {
            return "Seasons(name=" + name + ", numberOfEpisodes=" + numberOfEpisodes + ", seasonNumber=" + seasonNumber + ", overview=" + overview + ", posterUrl=" + posterUrl + ", releaseDate=" + releaseDate + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", id=" + f9985id + ", episodes=" + episodes + ')'
        }

        init {
            numberOfEpisodes = num
            seasonNumber = num2
            overview = str2
            posterUrl = str3
            releaseDate = str4
            createdAt = str5
            updatedAt = str6
            f9985id = num3
            episodes = arrayList
        }

        fun getNumberOfEpisodes(): Integer? {
            return numberOfEpisodes
        }

        fun getSeasonNumber(): Integer? {
            return seasonNumber
        }

        val id: Integer?
            get() = f9985id

        @JvmOverloads
                /* synthetic */   constructor(
            str: String? = null,
            num: Integer? = null,
            num2: Integer? = null,
            str2: String? = null,
            str3: String? = null,
            str4: String? = null,
            str5: String? = null,
            str6: String? = null,
            num3: Integer? = null,
            arrayList: ArrayList? = null,
            i: Int = AnalyticsListener.EVENT_DROPPED_VIDEO_FRAMES,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) null else str,
            if (i and 2 != 0) null else num,
            if (i and 4 != 0) null else num2,
            if (i and 8 != 0) null else str2,
            if (i and 16 != 0) null else str3,
            if (i and 32 != 0) null else str4,
            if (i and 64 != 0) null else str5,
            if (i and 128 != 0) null else str6,
            if (i and 256 == 0) num3 else null,
            if (i and 512 != 0) ArrayList() else arrayList
        ) {
        }

        fun getEpisodes(): ArrayList<Episodes> {
            return episodes
        }
    }

    /* compiled from: TheFlixToProvider.kt */
    @Metadata(
        m108d1 = ["\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u001c\b\u0003\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0011¢\u0006\u0002\u0010\u0012J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u001d\u0010&\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0011HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J¤\u0001\u0010/\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u001c\b\u0003\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0011HÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u0003HÖ\u0001J\t\u00105\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u000c\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001c\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R%\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b#\u0010\u0016¨\u00066"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$Episodes;", "", "episodeNumber", "", "name", "", "seasonNumber", "voteAverage", "", "voteCount", "overview", "releaseDate", "createdAt", "updatedAt", "id", "videos", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/ArrayList;)V", "getCreatedAt", "()Ljava/lang/String;", "getEpisodeNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId", "getName", "getOverview", "getReleaseDate", "getSeasonNumber", "getUpdatedAt", "getVideos", "()Ljava/util/ArrayList;", "getVoteAverage", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getVoteCount", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/ArrayList;)Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$Episodes;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Episodes(
        @JsonProperty("episodeNumber") num: Integer?,
        @JsonProperty("name") str: String?,
        @JsonProperty("seasonNumber") num2: Integer?,
        @JsonProperty("voteAverage") d: Double?,
        @JsonProperty("voteCount") num3: Integer?,
        @JsonProperty("overview") str2: String?,
        @JsonProperty("releaseDate") str3: String?,
        @JsonProperty("createdAt") str4: String?,
        @JsonProperty("updatedAt") str5: String?,
        @JsonProperty("id") num4: Integer?,
        @JsonProperty("videos") arrayList: ArrayList<String?>
    ) {
        val createdAt: String?
        private val episodeNumber: Integer?

        /* renamed from: id */
        private val f9983id: Integer?
        val name: String?
        val overview: String?
        val releaseDate: String?
        private val seasonNumber: Integer?
        val updatedAt: String?
        private val videos: ArrayList<String>
        val voteAverage: Double?
        private val voteCount: Integer?
        operator fun component1(): Integer? {
            return episodeNumber
        }

        operator fun component10(): Integer? {
            return f9983id
        }

        operator fun component11(): ArrayList<String> {
            return videos
        }

        operator fun component2(): String? {
            return name
        }

        operator fun component3(): Integer? {
            return seasonNumber
        }

        operator fun component4(): Double? {
            return voteAverage
        }

        operator fun component5(): Integer? {
            return voteCount
        }

        operator fun component6(): String? {
            return overview
        }

        operator fun component7(): String? {
            return releaseDate
        }

        operator fun component8(): String? {
            return createdAt
        }

        operator fun component9(): String? {
            return updatedAt
        }

        fun copy(
            @JsonProperty("episodeNumber") num: Integer?,
            @JsonProperty("name") str: String?,
            @JsonProperty("seasonNumber") num2: Integer?,
            @JsonProperty("voteAverage") d: Double?,
            @JsonProperty("voteCount") num3: Integer?,
            @JsonProperty("overview") str2: String?,
            @JsonProperty("releaseDate") str3: String?,
            @JsonProperty("createdAt") str4: String?,
            @JsonProperty("updatedAt") str5: String?,
            @JsonProperty("id") num4: Integer?,
            @JsonProperty("videos") arrayList: ArrayList<String?>
        ): Episodes {
            return Episodes(num, str, num2, d, num3, str2, str3, str4, str5, num4, arrayList)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Episodes) {
                val episodes = obj as Episodes
                return Intrinsics.areEqual(
                    episodeNumber,
                    episodes.episodeNumber
                ) && Intrinsics.areEqual(
                    name, episodes.name
                ) && Intrinsics.areEqual(
                    seasonNumber,
                    episodes.seasonNumber
                ) && Intrinsics.areEqual(
                    voteAverage as Object?, episodes.voteAverage as Object?
                ) && Intrinsics.areEqual(
                    voteCount, episodes.voteCount
                ) && Intrinsics.areEqual(
                    overview, episodes.overview
                ) && Intrinsics.areEqual(
                    releaseDate, episodes.releaseDate
                ) && Intrinsics.areEqual(
                    createdAt, episodes.createdAt
                ) && Intrinsics.areEqual(
                    updatedAt, episodes.updatedAt
                ) && Intrinsics.areEqual(
                    f9983id, episodes.f9983id
                ) && Intrinsics.areEqual(videos, episodes.videos)
            }
            return false
        }

        override fun hashCode(): Int {
            val num: Integer? = episodeNumber
            val hashCode = (if (num == null) 0 else num.hashCode()) * 31
            val str = name
            val hashCode2 = (hashCode + (str?.hashCode() ?: 0)) * 31
            val num2: Integer? = seasonNumber
            val hashCode3: Int = (hashCode2 + if (num2 == null) 0 else num2.hashCode()) * 31
            val d = voteAverage
            val hashCode4 = (hashCode3 + (d?.hashCode() ?: 0)) * 31
            val num3: Integer? = voteCount
            val hashCode5: Int = (hashCode4 + if (num3 == null) 0 else num3.hashCode()) * 31
            val str2 = overview
            val hashCode6 = (hashCode5 + (str2?.hashCode() ?: 0)) * 31
            val str3 = releaseDate
            val hashCode7 = (hashCode6 + (str3?.hashCode() ?: 0)) * 31
            val str4 = createdAt
            val hashCode8 = (hashCode7 + (str4?.hashCode() ?: 0)) * 31
            val str5 = updatedAt
            val hashCode9 = (hashCode8 + (str5?.hashCode() ?: 0)) * 31
            val num4: Integer? = f9983id
            val hashCode10: Int = (hashCode9 + if (num4 == null) 0 else num4.hashCode()) * 31
            val arrayList: ArrayList<String> = videos
            return hashCode10 + if (arrayList != null) arrayList.hashCode() else 0
        }

        override fun toString(): String {
            return "Episodes(episodeNumber=" + episodeNumber + ", name=" + name + ", seasonNumber=" + seasonNumber + ", voteAverage=" + voteAverage + ", voteCount=" + voteCount + ", overview=" + overview + ", releaseDate=" + releaseDate + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", id=" + f9983id + ", videos=" + videos + ')'
        }

        init {
            episodeNumber = num
            name = str
            seasonNumber = num2
            voteAverage = d
            voteCount = num3
            overview = str2
            releaseDate = str3
            createdAt = str4
            updatedAt = str5
            f9983id = num4
            videos = arrayList
        }

        fun getEpisodeNumber(): Integer? {
            return episodeNumber
        }

        fun getSeasonNumber(): Integer? {
            return seasonNumber
        }

        fun getVoteCount(): Integer? {
            return voteCount
        }

        val id: Integer?
            get() = f9983id

        @JvmOverloads
                /* synthetic */   constructor(
            num: Integer? = null,
            str: String? = null,
            num2: Integer? = null,
            d: Double? = null,
            num3: Integer? = null,
            str2: String? = null,
            str3: String? = null,
            str4: String? = null,
            str5: String? = null,
            num4: Integer? = null,
            arrayList: ArrayList? = null,
            i: Int = 2047,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) null else num,
            if (i and 2 != 0) null else str,
            if (i and 4 != 0) null else num2,
            if (i and 8 != 0) null else d,
            if (i and 16 != 0) null else num3,
            if (i and 32 != 0) null else str2,
            if (i and 64 != 0) null else str3,
            if (i and 128 != 0) null else str4,
            if (i and 256 != 0) null else str5,
            if (i and 512 == 0) num4 else null,
            if (i and 1024 != 0) ArrayList() else arrayList
        ) {
        }

        fun getVideos(): ArrayList<String> {
            return videos
        }
    }

    /* compiled from: TheFlixToProvider.kt */
    @Metadata(
        m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$Genres;", "", "name", "", "id", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$Genres;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Genres(@param:JsonProperty("name") val name: String?, @JsonProperty("id") num: Integer?) {
        /* renamed from: id */
        private val f9984id: Integer?
        operator fun component1(): String? {
            return name
        }

        operator fun component2(): Integer? {
            return f9984id
        }

        fun copy(@JsonProperty("name") str: String?, @JsonProperty("id") num: Integer?): Genres {
            return Genres(str, num)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Genres) {
                val genres = obj as Genres
                return Intrinsics.areEqual(name, genres.name) && Intrinsics.areEqual(
                    f9984id, genres.f9984id
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val str = name
            val hashCode = (str?.hashCode() ?: 0) * 31
            val num: Integer? = f9984id
            return hashCode + if (num != null) num.hashCode() else 0
        }

        override fun toString(): String {
            return "Genres(name=" + name + ", id=" + f9984id + ')'
        }

        init {
            f9984id = num
        }

        @JvmOverloads
                /* synthetic */   constructor(
            str: String? = null,
            num: Integer? = null,
            i: Int = 3,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(if (i and 1 != 0) null else str, if (i and 2 != 0) null else num) {
        }

        val id: Integer?
            get() = f9984id

        companion object {
            fun  /* synthetic */`copy$default`(
                genres: Genres,
                str: String?,
                num: Integer?,
                i: Int,
                obj: Object?
            ): Genres {
                var str = str
                var num: Integer? = num
                if (i and 1 != 0) {
                    str = genres.name
                }
                if (i and 2 != 0) {
                    num = genres.f9984id
                }
                return genres.copy(str, num)
            }
        }
    }

    /* compiled from: TheFlixToProvider.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\t¨\u0006\u0019"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$RuntimeConfig;", "", "AddThisService", "Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$RuntimeConfigData;", "Application", "GtmService", "Services", "(Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$RuntimeConfigData;Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$RuntimeConfigData;Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$RuntimeConfigData;Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$RuntimeConfigData;)V", "getAddThisService", "()Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$RuntimeConfigData;", "getApplication", "getGtmService", "getServices", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class RuntimeConfig {
        val addThisService: RuntimeConfigData
        val application: RuntimeConfigData
        val gtmService: RuntimeConfigData
        val services: RuntimeConfigData?
        operator fun component1(): RuntimeConfigData {
            return addThisService
        }

        operator fun component2(): RuntimeConfigData {
            return application
        }

        operator fun component3(): RuntimeConfigData {
            return gtmService
        }

        operator fun component4(): RuntimeConfigData? {
            return services
        }

        fun copy(
            @JsonProperty("AddThisService") runtimeConfigData: RuntimeConfigData,
            @JsonProperty("Application") runtimeConfigData2: RuntimeConfigData,
            @JsonProperty("GtmService") runtimeConfigData3: RuntimeConfigData,
            @JsonProperty("Services") runtimeConfigData4: RuntimeConfigData?
        ): RuntimeConfig {
            return RuntimeConfig(
                runtimeConfigData,
                runtimeConfigData2,
                runtimeConfigData3,
                runtimeConfigData4
            )
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is RuntimeConfig) {
                val runtimeConfig = obj as RuntimeConfig
                return Intrinsics.areEqual(
                    addThisService,
                    runtimeConfig.addThisService
                ) && Intrinsics.areEqual(
                    application, runtimeConfig.application
                ) && Intrinsics.areEqual(
                    gtmService, runtimeConfig.gtmService
                ) && Intrinsics.areEqual(
                    services, runtimeConfig.services
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val runtimeConfigData = addThisService
            val hashCode = (runtimeConfigData?.hashCode() ?: 0) * 31
            val runtimeConfigData2 = application
            val hashCode2 = (hashCode + (runtimeConfigData2?.hashCode() ?: 0)) * 31
            val runtimeConfigData3 = gtmService
            val hashCode3 = (hashCode2 + (runtimeConfigData3?.hashCode() ?: 0)) * 31
            val runtimeConfigData4 = services
            return hashCode3 + (runtimeConfigData4?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "RuntimeConfig(AddThisService=" + addThisService + ", Application=" + application + ", GtmService=" + gtmService + ", Services=" + services + ')'
        }

        constructor(
            @JsonProperty("AddThisService") runtimeConfigData: RuntimeConfigData,
            @JsonProperty("Application") runtimeConfigData2: RuntimeConfigData,
            @JsonProperty("GtmService") runtimeConfigData3: RuntimeConfigData,
            @JsonProperty("Services") runtimeConfigData4: RuntimeConfigData?
        ) {
            addThisService = runtimeConfigData
            application = runtimeConfigData2
            gtmService = runtimeConfigData3
            services = runtimeConfigData4
        }

        @JvmOverloads
                /* synthetic */   constructor(
            runtimeConfigData: RuntimeConfigData? = null,
            runtimeConfigData2: RuntimeConfigData? = null,
            runtimeConfigData3: RuntimeConfigData? = null,
            runtimeConfigData4: RuntimeConfigData? = null,
            i: Int = 15,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) {
            val runtimeConfig: RuntimeConfig
            val runtimeConfigData5: RuntimeConfigData?
            val runtimeConfigData6 = if (i and 1 != 0) RuntimeConfigData(
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                16383,
                null
            ) else runtimeConfigData!!
            val runtimeConfigData7 = if (i and 2 != 0) RuntimeConfigData(
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                16383,
                null
            ) else runtimeConfigData2!!
            val runtimeConfigData8 = if (i and 4 != 0) RuntimeConfigData(
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                16383,
                null
            ) else runtimeConfigData3!!
            if (i and 8 != 0) {
                runtimeConfigData5 = RuntimeConfigData(
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    16383,
                    null
                )
                runtimeConfig = this
            } else {
                runtimeConfig = this
                runtimeConfigData5 = runtimeConfigData4
            }
            RuntimeConfig(
                runtimeConfigData6,
                runtimeConfigData7,
                runtimeConfigData8,
                runtimeConfigData5
            )
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                runtimeConfig: RuntimeConfig,
                runtimeConfigData: RuntimeConfigData,
                runtimeConfigData2: RuntimeConfigData,
                runtimeConfigData3: RuntimeConfigData,
                runtimeConfigData4: RuntimeConfigData?,
                i: Int,
                obj: Object?
            ): RuntimeConfig {
                var runtimeConfigData = runtimeConfigData
                var runtimeConfigData2 = runtimeConfigData2
                var runtimeConfigData3 = runtimeConfigData3
                var runtimeConfigData4 = runtimeConfigData4
                if (i and 1 != 0) {
                    runtimeConfigData = runtimeConfig.addThisService
                }
                if (i and 2 != 0) {
                    runtimeConfigData2 = runtimeConfig.application
                }
                if (i and 4 != 0) {
                    runtimeConfigData3 = runtimeConfig.gtmService
                }
                if (i and 8 != 0) {
                    runtimeConfigData4 = runtimeConfig.services
                }
                return runtimeConfig.copy(
                    runtimeConfigData,
                    runtimeConfigData2,
                    runtimeConfigData3,
                    runtimeConfigData4
                )
            }
        }
    }

    /* compiled from: TheFlixToProvider.kt */
    @Metadata(
        m108d1 = ["\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¶\u0001\u00106\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00107J\u0013\u00108\u001a\u00020\u00062\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001b\u0010\u0018R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001c\u0010\u0018R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001d\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0013\u0010\u000c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b'\u0010\u0018¨\u0006="],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$RuntimeConfigData;", "", "PublicId", "", "ContentUsageType", "IsDevelopmentMode", "", "IsDevelopmentOrProductionMode", "IsProductionMode", "IsStagingMode", "IsTestMode", "Mode", "Name", "Url", "UseFilterInfoInUrl", "TrackingId", HttpHeaders.SERVER, "Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$Server;", "TmdbServer", "Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$TmdbServer;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$Server;Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$TmdbServer;)V", "getContentUsageType", "()Ljava/lang/String;", "getIsDevelopmentMode", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIsDevelopmentOrProductionMode", "getIsProductionMode", "getIsStagingMode", "getIsTestMode", "getMode", "getName", "getPublicId", "getServer", "()Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$Server;", "getTmdbServer", "()Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$TmdbServer;", "getTrackingId", "getUrl", "getUseFilterInfoInUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$Server;Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$TmdbServer;)Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$RuntimeConfigData;", "equals", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class RuntimeConfigData(
        @param:JsonProperty("PublicId") val publicId: String?,
        @param:JsonProperty(
            "ContentUsageType"
        ) val contentUsageType: String?,
        @param:JsonProperty("IsDevelopmentMode") val isDevelopmentMode: Boolean?,
        @param:JsonProperty(
            "IsDevelopmentOrProductionMode"
        ) val isDevelopmentOrProductionMode: Boolean?,
        @param:JsonProperty("IsProductionMode") val isProductionMode: Boolean?,
        @param:JsonProperty(
            "IsStagingMode"
        ) val isStagingMode: Boolean?,
        @param:JsonProperty("IsTestMode") val isTestMode: Boolean?,
        @param:JsonProperty(
            "Mode"
        ) val mode: String?,
        @param:JsonProperty("Name") val name: String?,
        @param:JsonProperty("Url") val url: String?,
        @param:JsonProperty(
            "UseFilterInfoInUrl"
        ) val useFilterInfoInUrl: Boolean?,
        @param:JsonProperty("TrackingId") val trackingId: String?,
        @param:JsonProperty(
            "Server"
        ) val server: Server,
        @param:JsonProperty(
            "TmdbServer"
        ) val tmdbServer: TmdbServer
    ) {
        operator fun component1(): String? {
            return publicId
        }

        operator fun component10(): String? {
            return url
        }

        operator fun component11(): Boolean? {
            return useFilterInfoInUrl
        }

        operator fun component12(): String? {
            return trackingId
        }

        operator fun component13(): Server {
            return server
        }

        operator fun component14(): TmdbServer {
            return tmdbServer
        }

        operator fun component2(): String? {
            return contentUsageType
        }

        operator fun component3(): Boolean? {
            return isDevelopmentMode
        }

        operator fun component4(): Boolean? {
            return isDevelopmentOrProductionMode
        }

        operator fun component5(): Boolean? {
            return isProductionMode
        }

        operator fun component6(): Boolean? {
            return isStagingMode
        }

        operator fun component7(): Boolean? {
            return isTestMode
        }

        operator fun component8(): String? {
            return mode
        }

        operator fun component9(): String? {
            return name
        }

        fun copy(
            @JsonProperty("PublicId") str: String?,
            @JsonProperty("ContentUsageType") str2: String?,
            @JsonProperty("IsDevelopmentMode") bool: Boolean?,
            @JsonProperty("IsDevelopmentOrProductionMode") bool2: Boolean?,
            @JsonProperty("IsProductionMode") bool3: Boolean?,
            @JsonProperty("IsStagingMode") bool4: Boolean?,
            @JsonProperty("IsTestMode") bool5: Boolean?,
            @JsonProperty("Mode") str3: String?,
            @JsonProperty("Name") str4: String?,
            @JsonProperty("Url") str5: String?,
            @JsonProperty("UseFilterInfoInUrl") bool6: Boolean?,
            @JsonProperty("TrackingId") str6: String?,
            @JsonProperty("Server") server: Server,
            @JsonProperty("TmdbServer") tmdbServer: TmdbServer
        ): RuntimeConfigData {
            return RuntimeConfigData(
                str,
                str2,
                bool,
                bool2,
                bool3,
                bool4,
                bool5,
                str3,
                str4,
                str5,
                bool6,
                str6,
                server,
                tmdbServer
            )
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is RuntimeConfigData) {
                val runtimeConfigData = obj as RuntimeConfigData
                return Intrinsics.areEqual(
                    publicId,
                    runtimeConfigData.publicId
                ) && Intrinsics.areEqual(
                    contentUsageType, runtimeConfigData.contentUsageType
                ) && Intrinsics.areEqual(
                    isDevelopmentMode, runtimeConfigData.isDevelopmentMode
                ) && Intrinsics.areEqual(
                    isDevelopmentOrProductionMode, runtimeConfigData.isDevelopmentOrProductionMode
                ) && Intrinsics.areEqual(
                    isProductionMode, runtimeConfigData.isProductionMode
                ) && Intrinsics.areEqual(
                    isStagingMode, runtimeConfigData.isStagingMode
                ) && Intrinsics.areEqual(
                    isTestMode, runtimeConfigData.isTestMode
                ) && Intrinsics.areEqual(
                    mode, runtimeConfigData.mode
                ) && Intrinsics.areEqual(name, runtimeConfigData.name) && Intrinsics.areEqual(
                    url, runtimeConfigData.url
                ) && Intrinsics.areEqual(
                    useFilterInfoInUrl, runtimeConfigData.useFilterInfoInUrl
                ) && Intrinsics.areEqual(
                    trackingId, runtimeConfigData.trackingId
                ) && Intrinsics.areEqual(
                    server, runtimeConfigData.server
                ) && Intrinsics.areEqual(
                    tmdbServer, runtimeConfigData.tmdbServer
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val str = publicId
            val hashCode = (str?.hashCode() ?: 0) * 31
            val str2 = contentUsageType
            val hashCode2 = (hashCode + (str2?.hashCode() ?: 0)) * 31
            val bool = isDevelopmentMode
            val hashCode3 = (hashCode2 + (bool?.hashCode() ?: 0)) * 31
            val bool2 = isDevelopmentOrProductionMode
            val hashCode4 = (hashCode3 + (bool2?.hashCode() ?: 0)) * 31
            val bool3 = isProductionMode
            val hashCode5 = (hashCode4 + (bool3?.hashCode() ?: 0)) * 31
            val bool4 = isStagingMode
            val hashCode6 = (hashCode5 + (bool4?.hashCode() ?: 0)) * 31
            val bool5 = isTestMode
            val hashCode7 = (hashCode6 + (bool5?.hashCode() ?: 0)) * 31
            val str3 = mode
            val hashCode8 = (hashCode7 + (str3?.hashCode() ?: 0)) * 31
            val str4 = name
            val hashCode9 = (hashCode8 + (str4?.hashCode() ?: 0)) * 31
            val str5 = url
            val hashCode10 = (hashCode9 + (str5?.hashCode() ?: 0)) * 31
            val bool6 = useFilterInfoInUrl
            val hashCode11 = (hashCode10 + (bool6?.hashCode() ?: 0)) * 31
            val str6 = trackingId
            val hashCode12 = (hashCode11 + (str6?.hashCode() ?: 0)) * 31
            val server = server
            val hashCode13 = (hashCode12 + (server?.hashCode() ?: 0)) * 31
            val tmdbServer = tmdbServer
            return hashCode13 + (tmdbServer?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "RuntimeConfigData(PublicId=" + publicId + ", ContentUsageType=" + contentUsageType + ", IsDevelopmentMode=" + isDevelopmentMode + ", IsDevelopmentOrProductionMode=" + isDevelopmentOrProductionMode + ", IsProductionMode=" + isProductionMode + ", IsStagingMode=" + isStagingMode + ", IsTestMode=" + isTestMode + ", Mode=" + mode + ", Name=" + name + ", Url=" + url + ", UseFilterInfoInUrl=" + useFilterInfoInUrl + ", TrackingId=" + trackingId + ", Server=" + server + ", TmdbServer=" + tmdbServer + ')'
        }

        @JvmOverloads
                /* synthetic */   constructor(
            str: String? = null,
            str2: String? = null,
            bool: Boolean? = null,
            bool2: Boolean? = null,
            bool3: Boolean? = null,
            bool4: Boolean? = null,
            bool5: Boolean? = null,
            str3: String? = null,
            str4: String? = null,
            str5: String? = null,
            bool6: Boolean? = null,
            str6: String? = null,
            server: Server? = null,
            tmdbServer: TmdbServer? = null,
            i: Int = 16383,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) null else str,
            if (i and 2 != 0) null else str2,
            if (i and 4 != 0) null else bool,
            if (i and 8 != 0) null else bool2,
            if (i and 16 != 0) null else bool3,
            if (i and 32 != 0) null else bool4,
            if (i and 64 != 0) null else bool5,
            if (i and 128 != 0) null else str3,
            if (i and 256 != 0) null else str4,
            if (i and 512 != 0) null else str5,
            if (i and 1024 != 0) null else bool6,
            if (i and 2048 != 0) null else str6,
            if (i and 4096 != 0) Server(null, 1, null) else server,
            if (i and 8192 != 0) TmdbServer(null, 1, null) else tmdbServer
        ) {
        }
    }

    /* compiled from: TheFlixToProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$TmdbServer;", "", "Url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class TmdbServer(@param:JsonProperty("Url") val url: String?) {
        operator fun component1(): String? {
            return url
        }

        fun copy(@JsonProperty("Url") str: String?): TmdbServer {
            return TmdbServer(str)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is TmdbServer && Intrinsics.areEqual(
                url,
                (obj as TmdbServer).url
            )
        }

        override fun hashCode(): Int {
            val str = url ?: return 0
            return str.hashCode()
        }

        override fun toString(): String {
            return "TmdbServer(Url=" + url + ')'
        }

        @JvmOverloads
                /* synthetic */   constructor(
            str: String? = null,
            i: Int = 1,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(if (i and 1 != 0) null else str) {
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                tmdbServer: TmdbServer,
                str: String?,
                i: Int,
                obj: Object?
            ): TmdbServer {
                var str = str
                if (i and 1 != 0) {
                    str = tmdbServer.url
                }
                return tmdbServer.copy(str)
            }
        }
    }

    /* compiled from: TheFlixToProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$Server;", "", "Url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Server(@param:JsonProperty("Url") val url: String?) {
        operator fun component1(): String? {
            return url
        }

        fun copy(@JsonProperty("Url") str: String?): Server {
            return Server(str)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is Server && Intrinsics.areEqual(
                url,
                (obj as Server).url
            )
        }

        override fun hashCode(): Int {
            val str = url ?: return 0
            return str.hashCode()
        }

        override fun toString(): String {
            return "Server(Url=" + url + ')'
        }

        @JvmOverloads
                /* synthetic */   constructor(
            str: String? = null,
            i: Int = 1,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(if (i and 1 != 0) null else str) {
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                server: Server,
                str: String?,
                i: Int,
                obj: Object?
            ): Server {
                var str = str
                if (i and 1 != 0) {
                    str = server.url
                }
                return server.copy(str)
            }
        }
    }

    /* compiled from: TheFlixToProvider.kt */
    @Metadata(
        m108d1 = ["\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0018\b\u0003\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u000c¢\u0006\u0002\u0010\rJ\u0019\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000cHÆ\u0003Jd\u0010\u001e\u001a\u00020\u00002\u0018\b\u0003\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u000cHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0007HÖ\u0001J\t\u0010$\u001a\u00020\u000cHÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u000c¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$RecommendationsList;", "", "docs", "Ljava/util/ArrayList;", "Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$Docs;", "Lkotlin/collections/ArrayList;", "total", "", "page", "limit", "pages", "type", "", "(Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getDocs", "()Ljava/util/ArrayList;", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPage", "getPages", "getTotal", "getType", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$RecommendationsList;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class RecommendationsList(
        @JsonProperty("docs") docs: ArrayList<Docs?>,
        @JsonProperty("total") num: Integer?,
        @JsonProperty("page") num2: Integer?,
        @JsonProperty("limit") num3: Integer?,
        @JsonProperty("pages") num4: Integer?,
        @JsonProperty("type") str: String?
    ) {
        private val docs: ArrayList<Docs>
        private val limit: Integer?
        private val page: Integer?
        private val pages: Integer?
        private val total: Integer?
        val type: String?
        operator fun component1(): ArrayList<Docs> {
            return docs
        }

        operator fun component2(): Integer? {
            return total
        }

        operator fun component3(): Integer? {
            return page
        }

        operator fun component4(): Integer? {
            return limit
        }

        operator fun component5(): Integer? {
            return pages
        }

        operator fun component6(): String? {
            return type
        }

        fun copy(
            @JsonProperty("docs") docs: ArrayList<Docs?>,
            @JsonProperty("total") num: Integer?,
            @JsonProperty("page") num2: Integer?,
            @JsonProperty("limit") num3: Integer?,
            @JsonProperty("pages") num4: Integer?,
            @JsonProperty("type") str: String?
        ): RecommendationsList {
            Intrinsics.checkNotNullParameter(docs, "docs")
            return RecommendationsList(docs, num, num2, num3, num4, str)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is RecommendationsList) {
                val recommendationsList = obj as RecommendationsList
                return Intrinsics.areEqual(docs, recommendationsList.docs) && Intrinsics.areEqual(
                    total, recommendationsList.total
                ) && Intrinsics.areEqual(
                    page, recommendationsList.page
                ) && Intrinsics.areEqual(limit, recommendationsList.limit) && Intrinsics.areEqual(
                    pages, recommendationsList.pages
                ) && Intrinsics.areEqual(
                    type, recommendationsList.type
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val hashCode: Int = docs.hashCode() * 31
            val num: Integer? = total
            val hashCode2: Int = (hashCode + if (num == null) 0 else num.hashCode()) * 31
            val num2: Integer? = page
            val hashCode3: Int = (hashCode2 + if (num2 == null) 0 else num2.hashCode()) * 31
            val num3: Integer? = limit
            val hashCode4: Int = (hashCode3 + if (num3 == null) 0 else num3.hashCode()) * 31
            val num4: Integer? = pages
            val hashCode5: Int = (hashCode4 + if (num4 == null) 0 else num4.hashCode()) * 31
            val str = type
            return hashCode5 + (str?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "RecommendationsList(docs=" + docs + ", total=" + total + ", page=" + page + ", limit=" + limit + ", pages=" + pages + ", type=" + type + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(docs, "docs")
            this.docs = docs
            total = num
            page = num2
            limit = num3
            pages = num4
            type = str
        }

        @JvmOverloads
                /* synthetic */   constructor(
            arrayList: ArrayList? = null,
            num: Integer? = null,
            num2: Integer? = null,
            num3: Integer? = null,
            num4: Integer? = null,
            str: String? = null,
            i: Int = 63,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) ArrayList() else arrayList,
            if (i and 2 != 0) null else num,
            if (i and 4 != 0) null else num2,
            if (i and 8 != 0) null else num3,
            if (i and 16 != 0) null else num4,
            if (i and 32 == 0) str else null
        ) {
        }

        fun getDocs(): ArrayList<Docs> {
            return docs
        }

        fun getTotal(): Integer? {
            return total
        }

        fun getPage(): Integer? {
            return page
        }

        fun getLimit(): Integer? {
            return limit
        }

        fun getPages(): Integer? {
            return pages
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                recommendationsList: RecommendationsList,
                arrayList: ArrayList,
                num: Integer?,
                num2: Integer?,
                num3: Integer?,
                num4: Integer?,
                str: String?,
                i: Int,
                obj: Object?
            ): RecommendationsList {
                var num: Integer? = num
                var num2: Integer? = num2
                var num3: Integer? = num3
                var num4: Integer? = num4
                var str = str
                var arrayList2: ArrayList<Docs?> = arrayList
                if (i and 1 != 0) {
                    arrayList2 = recommendationsList.docs
                }
                if (i and 2 != 0) {
                    num = recommendationsList.total
                }
                val num5: Integer? = num
                if (i and 4 != 0) {
                    num2 = recommendationsList.page
                }
                val num6: Integer? = num2
                if (i and 8 != 0) {
                    num3 = recommendationsList.limit
                }
                val num7: Integer? = num3
                if (i and 16 != 0) {
                    num4 = recommendationsList.pages
                }
                val num8: Integer? = num4
                if (i and 32 != 0) {
                    str = recommendationsList.type
                }
                return recommendationsList.copy(arrayList2, num5, num6, num7, num8, str)
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun cleanTitle(str: String?): String {
        val `substringBefore$default`: String =
            StringsKt.`substringBefore$default`(str, "/season", null as String?, 2, null as Object?)
        if (Regex("\\..\\.").containsMatchIn(`substringBefore$default`)) {
            val lowerCase: String = StringsKt.`replace$default`(
                Regex("(:|-&)").replace(
                    StringsKt.`replace$default`(
                        StringsKt.`replace$default`(
                            StringsKt.`replace$default`(
                                StringsKt.`replace$default`(
                                    StringsKt.removeSuffix(
                                        `substringBefore$default`,
                                        "." as CharSequence
                                    ), " - ", "-", false, 4, null as Object?
                                ),
                                ".",
                                "-",
                                false,
                                4,
                                null as Object?
                            ), " ", "-", false, 4, null as Object?
                        ),
                        "-&",
                        "",
                        false,
                        4,
                        null as Object?
                    ), ""
                ), "'", "-", false, 4, null as Object?
            ).toLowerCase(Locale.ROOT)
            Intrinsics.checkNotNullExpressionValue(
                lowerCase,
                "this as java.lang.String).toLowerCase(Locale.ROOT)"
            )
            return lowerCase
        }
        val lowerCase2: String = StringsKt.`replace$default`(
            Regex("(:|-&|\\.)").replace(
                StringsKt.`replace$default`(
                    StringsKt.`replace$default`(
                        StringsKt.`replace$default`(
                            StringsKt.`replace$default`(str, " - ", "-", false, 4, null as Object?),
                            " ",
                            "-",
                            false,
                            4,
                            null as Object?
                        ), "-&", "", false, 4, null as Object?
                    ),
                    "/",
                    "-",
                    false,
                    4,
                    null as Object?
                ), ""
            ), "'", "-", false, 4, null as Object?
        ).toLowerCase(Locale.ROOT)
        Intrinsics.checkNotNullExpressionValue(
            lowerCase2,
            "this as java.lang.String).toLowerCase(Locale.ROOT)"
        )
        return lowerCase2
    }

    /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */ /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */ /* JADX WARN: Removed duplicated region for block: B:21:0x007b A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun getLoadMan(r20: String?, r21: Continuation<in LoadMain?>?): Any {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            boolean r2 = r1 instanceof com.lagradost.cloudstream3.movieproviders.TheFlixToProvider$getLoadMan$1
            if (r2 == 0) goto L18
            r2 = r1
            com.lagradost.cloudstream3.movieproviders.TheFlixToProvider$getLoadMan$1 r2 = (com.lagradost.cloudstream3.movieproviders.TheFlixToProvider$getLoadMan$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r1 = r2.label
            int r1 = r1 - r4
            r2.label = r1
            goto L1d
        L18:
            com.lagradost.cloudstream3.movieproviders.TheFlixToProvider$getLoadMan$1 r2 = new com.lagradost.cloudstream3.movieproviders.TheFlixToProvider$getLoadMan$1
            r2.<init>(r0, r1)
        L1d:
            java.lang.Object r1 = r2.result
            java.lang.Object r15 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r2.label
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L42
            if (r3 == r5) goto L39
            if (r3 != r4) goto L31
            kotlin.ResultKt.throwOnFailure(r1)
            goto L7d
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            java.lang.Object r3 = r2.L$0
            java.lang.String r3 = (java.lang.String) r3
            kotlin.ResultKt.throwOnFailure(r1)
            r1 = r3
            goto L52
        L42:
            kotlin.ResultKt.throwOnFailure(r1)
            r1 = r20
            r2.L$0 = r1
            r2.label = r5
            java.lang.Object r3 = r0.getCookies(r2)
            if (r3 != r15) goto L52
            return r15
        L52:
            com.lagradost.cloudstream3.utils.Extensions$RequestCustom r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            com.lagradost.nicehttp.Requests r3 = (com.lagradost.nicehttp.Requests) r3
            java.util.Map<java.lang.String, java.lang.String> r5 = com.lagradost.cloudstream3.movieproviders.TheFlixToProvider.latestCookies
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r17 = 2044(0x7fc, float:2.864E-42)
            r18 = 0
            r14 = 0
            r2.L$0 = r14
            r2.label = r4
            r4 = r1
            r1 = 0
            r14 = r1
            r1 = r15
            r15 = r16
            r16 = r2
            java.lang.Object r2 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18)
            if (r2 != r1) goto L7c
            return r1
        L7c:
            r1 = r2
        L7d:
            com.lagradost.nicehttp.NiceResponse r1 = (com.lagradost.nicehttp.NiceResponse) r1
            org.jsoup.nodes.Document r1 = r1.getDocument()
            java.lang.String r2 = "script[type=application/json]"
            org.jsoup.nodes.Element r1 = r1.selectFirst(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            java.lang.String r1 = r1.data()
            com.lagradost.cloudstream3.utils.AppUtils r2 = com.lagradost.cloudstream3.utils.AppUtils.INSTANCE
            java.lang.String r2 = "script"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            com.fasterxml.jackson.databind.json.JsonMapper r2 = com.lagradost.cloudstream3.MainAPIKt.getMapper()
            com.fasterxml.jackson.databind.ObjectMapper r2 = (com.fasterxml.jackson.databind.ObjectMapper) r2
            com.lagradost.cloudstream3.movieproviders.TheFlixToProvider$getLoadMan$$inlined$parseJson$1 r3 = new com.lagradost.cloudstream3.movieproviders.TheFlixToProvider$getLoadMan$$inlined$parseJson$1
            r3.<init>()
            com.fasterxml.jackson.core.type.TypeReference r3 = (com.fasterxml.jackson.core.type.TypeReference) r3
            java.lang.Object r1 = r2.readValue(r1, r3)
            return r1
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.TheFlixToProvider.getLoadMan(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Removed duplicated region for block: B:106:0x02e0  */ /* JADX WARN: Removed duplicated region for block: B:107:0x02ea  */ /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */ /* JADX WARN: Removed duplicated region for block: B:117:0x030c  */ /* JADX WARN: Removed duplicated region for block: B:118:0x0325  */ /* JADX WARN: Removed duplicated region for block: B:121:0x0332  */ /* JADX WARN: Removed duplicated region for block: B:126:0x0360  */ /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */ /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */ /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */ /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */ /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */ /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */ /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */ /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */ /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */ /* JADX WARN: Removed duplicated region for block: B:47:0x00e7  */ /* JADX WARN: Removed duplicated region for block: B:77:0x01cb  */ /* JADX WARN: Removed duplicated region for block: B:78:0x01db  */ /* JADX WARN: Removed duplicated region for block: B:81:0x01e2  */ /* JADX WARN: Removed duplicated region for block: B:88:0x0208  */ /* JADX WARN: Type inference failed for: r16v0 */ /* JADX WARN: Type inference failed for: r16v1, types: [java.util.List] */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun load(r40: String?, r41: Continuation<in LoadResponse?>?): Any {
        /*
            Method dump skipped, instructions count: 904
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.TheFlixToProvider.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* compiled from: TheFlixToProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TheFlixToProvider\$VideoData;", "", "url", "", "id", "type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getType", "getUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class VideoData(
        @param:JsonProperty("url") val url: String?, /* renamed from: id */
        @param:JsonProperty(
            "id"
        ) val id: String?, @param:JsonProperty("type") val type: String?
    ) {
        operator fun component1(): String? {
            return url
        }

        operator fun component2(): String? {
            return id
        }

        operator fun component3(): String? {
            return type
        }

        fun copy(
            @JsonProperty("url") str: String?,
            @JsonProperty("id") str2: String?,
            @JsonProperty("type") str3: String?
        ): VideoData {
            return VideoData(str, str2, str3)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is VideoData) {
                val videoData = obj as VideoData
                return Intrinsics.areEqual(url, videoData.url) && Intrinsics.areEqual(
                    id, videoData.id
                ) && Intrinsics.areEqual(type, videoData.type)
            }
            return false
        }

        override fun hashCode(): Int {
            val str = url
            val hashCode = (str?.hashCode() ?: 0) * 31
            val str2 = id
            val hashCode2 = (hashCode + (str2?.hashCode() ?: 0)) * 31
            val str3 = type
            return hashCode2 + (str3?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "VideoData(url=" + url + ", id=" + id + ", type=" + type + ')'
        }

        @JvmOverloads
                /* synthetic */   constructor(
            str: String? = null,
            str2: String? = null,
            str3: String? = null,
            i: Int = 7,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) null else str,
            if (i and 2 != 0) null else str2,
            if (i and 4 != 0) null else str3
        ) {
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                videoData: VideoData,
                str: String?,
                str2: String?,
                str3: String?,
                i: Int,
                obj: Object?
            ): VideoData {
                var str = str
                var str2 = str2
                var str3 = str3
                if (i and 1 != 0) {
                    str = videoData.url
                }
                if (i and 2 != 0) {
                    str2 = videoData.id
                }
                if (i and 4 != 0) {
                    str3 = videoData.type
                }
                return videoData.copy(str, str2, str3)
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */ /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */ /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */ /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */ /* JADX WARN: Removed duplicated region for block: B:58:0x0133  */ /* JADX WARN: Removed duplicated region for block: B:59:0x013a  */ /* JADX WARN: Removed duplicated region for block: B:61:0x013d  */ /* JADX WARN: Removed duplicated region for block: B:62:0x0145  */ /* JADX WARN: Removed duplicated region for block: B:74:0x0178  */
    @Override // com.lagradost.cloudstream3.MainAPI
            /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */    fun loadLinks(
        r23: String?,
        r24: Boolean,
        r25: Function1<SubtitleFile?, Unit>?,
        r26: Function1<ExtractorLink?, Unit>?,
        r27: Continuation<in Boolean?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 547
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.TheFlixToProvider.loadLinks(java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
    }

    companion object {
        val Companion = Companion(null)
        private val latestCookies: Map<String, String> = MapsKt.emptyMap<Any, Any>()
    }
}