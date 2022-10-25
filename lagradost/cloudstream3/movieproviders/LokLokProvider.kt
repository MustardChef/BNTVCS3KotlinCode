package com.lagradost.cloudstream3.movieproviders

import java.util.ArrayList
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: LokLokProvider.kt */
@Metadata(
    m108d1 = ["\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 T2\u00020\u0001:\u000fTUVWXYZ[\\]^_`abB\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\"\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%H\u0002J\u001c\u0010&\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010'\u001a\u00020\bH\u0002J\u0013\u0010(\u001a\u0004\u0018\u00010)H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010*J\u001b\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010#\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010-JI\u0010.\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u00020\b2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u000204022\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020402H\u0096@ø\u0001\u0000¢\u0006\u0002\u00107J\u0019\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010-J!\u0010;\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010<2\u0006\u0010>\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010-J\u001a\u0010?\u001a\u00020@*\u00020A2\u0006\u0010B\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u0004J\u0010\u0010D\u001a\b\u0012\u0004\u0012\u00020E0<*\u00020FJ\u0018\u0010G\u001a\b\u0012\u0004\u0012\u00020H0<*\u00020I2\u0006\u0010J\u001a\u00020\u0004J\u0010\u0010K\u001a\b\u0012\u0004\u0012\u00020=0<*\u00020LJ\u0018\u0010M\u001a\b\u0012\u0004\u0012\u00020H0<*\u00020I2\u0006\u0010J\u001a\u00020\u0004J\u0012\u0010N\u001a\u00020O*\u00020P2\u0006\u0010J\u001a\u00020\u0004J\u0016\u0010N\u001a\u00020O*\u00020Q2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%J\u0012\u0010N\u001a\u00020O*\u00020R2\u0006\u0010J\u001a\u00020\u0004J\u0012\u0010N\u001a\u00020O*\u00020S2\u0006\u0010J\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000c\u0010\nR\u0014\u0010\r\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\nR\u001a\u0010\u0012\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006c"],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider;", "Lcom/lagradost/cloudstream3/MainAPI;", "()V", "defaultPageUrl", "", "getDefaultPageUrl", "()Ljava/lang/String;", "hasChromecastSupport", "", "getHasChromecastSupport", "()Z", "hasDownloadSupport", "getHasDownloadSupport", "hasMainPage", "getHasMainPage", "hasQuickSearch", "getHasQuickSearch", "isPremiumContent", "mainUrl", "getMainUrl", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "vpnStatus", "Lcom/lagradost/cloudstream3/VPNStatus;", "getVpnStatus", "()Lcom/lagradost/cloudstream3/VPNStatus;", "fixUrlImageHomeLokLok", "url", "cardType", "Lcom/lagradost/cloudstream3/ui/home/ParentItemAdapter\$CardType;", "fixUrlImageLokLok", "isCoverHorizontal", "getMainPage", "Lcom/lagradost/cloudstream3/HomePageResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadPage", "Lcom/lagradost/cloudstream3/PageResponse;", "param", "search", "", "Lcom/lagradost/cloudstream3/SearchResponse;", "query", "toEpisode", "Lcom/lagradost/cloudstream3/Episode;", "LEpisodeVo;", "idMovie", MonitorLogServerProtocol.PARAM_CATEGORY, "toHomePageList", "Lcom/lagradost/cloudstream3/HomePageList;", "Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$HomeResponse;", "toListMoviesPage", "Lcom/lagradost/cloudstream3/Page;", "Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$HomeCategoryResponse;", "nameApi", "toListSearchResponse", "Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$LokLokSearchResponse;", "toListTvShowPage", "toMovieSearchResponse", "Lcom/lagradost/cloudstream3/MovieSearchResponse;", "LLikeList;", "Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$RecommendContentVOItem;", "Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$SearchPageItem;", "Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$SearchResultItem;", "Companion", "Data", "DataCategory", "HomeCategoryResponse", "HomeResponse", "ItemCategory", "LokLokMovieDetailResponseData", "LokLokSearchResponse", "LokLokSource", "LokLokSourceResponse", "RecommendContentVOItem", "RecommendItem", "ScreenItem", "SearchPageItem", "SearchResultItem", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class LokLokProvider : MainAPI() {
    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var mainUrl = "https://tiktik.pro"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var name = "PhimHD"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val isPremiumContent = true

    /* compiled from: LokLokProvider.kt */
    @Metadata(m106k = 3, m105mv = [1, 6, 0], m103xi = 48) /* loaded from: classes3.dex */
    /* synthetic */
    object WhenMappings {
        /* synthetic */ val `$EnumSwitchMapping$0`: IntArray

        init {
            val iArr = IntArray(HomeParentItemAdapter.CardType.values().size)
            com.lagradost.cloudstream3.movieproviders.iArr.get(HomeParentItemAdapter.CardType.LONG_WIDTH_CARD.ordinal()) =
                1
            com.lagradost.cloudstream3.movieproviders.iArr.get(HomeParentItemAdapter.CardType.FULL_WIDTH_CARD.ordinal()) =
                2
            `$EnumSwitchMapping$0` = com.lagradost.cloudstream3.movieproviders.iArr
        }
    }

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasChromecastSupport: Boolean
        // com.lagradost.cloudstream3.MainAPI
        get() = false

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasDownloadSupport: Boolean
        // com.lagradost.cloudstream3.MainAPI
        get() = true

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasMainPage: Boolean
        // com.lagradost.cloudstream3.MainAPI
        get() = true

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasQuickSearch: Boolean
        // com.lagradost.cloudstream3.MainAPI
        get() = false

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val defaultPageUrl: String
        // com.lagradost.cloudstream3.MainAPI
        get() = String.valueOf(mainUrl)

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val supportedTypes: Set<Any>
        // com.lagradost.cloudstream3.MainAPI
        get() = SetsKt.setOf<Object>(
            *arrayOf<TvType>(
                TvType.Movie,
                TvType.TvSeries
            ) as Array<Object>
        )

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val vpnStatus: VPNStatus
        // com.lagradost.cloudstream3.MainAPI
        get() = VPNStatus.None

    /* compiled from: LokLokProvider.kt */
    @Metadata(
        m108d1 = ["\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0010\u001a\u00020\u00112\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0016R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$Companion;", "", "()V", "HEADER_DEFAULT", "", "", "getHEADER_DEFAULT", "()Ljava/util/Map;", "TOKEN_PLAY", "URL_GET_CATEGORY", "URL_GET_DETAIL", "URL_GET_LINK_PLAY", "URL_GET_MOVIE_IN_PAGE", "URL_ROOT_API", "URL_SEARCH", "URL_SEARCH_DEFAULT", "getIPTV", "", "listHomePageList", "Ljava/util/ArrayList;", "Lcom/lagradost/cloudstream3/HomePageList;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        val hEADER_DEFAULT: Map<String, String>
            get() = LokLokProvider.Companion.HEADER_DEFAULT

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */ /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        fun getIPTV(r22: java.util.ArrayList<HomePageList?>?, r23: Continuation<in Unit>?): Any {
            /*
                r21 = this;
                r0 = r23
                boolean r1 = r0 instanceof com.lagradost.cloudstream3.movieproviders.LokLokProvider$Companion$getIPTV$1
                if (r1 == 0) goto L18
                r1 = r0
                com.lagradost.cloudstream3.movieproviders.LokLokProvider$Companion$getIPTV$1 r1 = (com.lagradost.cloudstream3.movieproviders.LokLokProvider$Companion$getIPTV$1) r1
                int r2 = r1.label
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 & r3
                if (r2 == 0) goto L18
                int r0 = r1.label
                int r0 = r0 - r3
                r1.label = r0
                r2 = r21
                goto L1f
            L18:
                com.lagradost.cloudstream3.movieproviders.LokLokProvider$Companion$getIPTV$1 r1 = new com.lagradost.cloudstream3.movieproviders.LokLokProvider$Companion$getIPTV$1
                r2 = r21
                r1.<init>(r2, r0)
            L1f:
                java.lang.Object r0 = r1.result
                java.lang.Object r15 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r1.label
                r4 = 1
                if (r3 == 0) goto L41
                if (r3 != r4) goto L39
                java.lang.Object r1 = r1.L$0
                java.util.ArrayList r1 = (java.util.ArrayList) r1
                kotlin.ResultKt.throwOnFailure(r0)
                r20 = r1
                r1 = r0
                r0 = r20
                goto L70
            L39:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L41:
                kotlin.ResultKt.throwOnFailure(r0)
                com.lagradost.cloudstream3.utils.Extensions$RequestCustom r0 = com.lagradost.cloudstream3.MainActivityKt.getApp()
                r3 = r0
                com.lagradost.nicehttp.Requests r3 = (com.lagradost.nicehttp.Requests) r3
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 4
                java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.HOURS
                r12 = 0
                r14 = 0
                r17 = 1854(0x73e, float:2.598E-42)
                r18 = 0
                r0 = r22
                r1.L$0 = r0
                r1.label = r4
                java.lang.String r4 = "https://raw.githubusercontent.com/cinehubwork/abc/master/schedule.json"
                r19 = r15
                r15 = 0
                r16 = r1
                java.lang.Object r1 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18)
                r3 = r19
                if (r1 != r3) goto L70
                return r3
            L70:
                com.lagradost.nicehttp.NiceResponse r1 = (com.lagradost.nicehttp.NiceResponse) r1
                okhttp3.Response r1 = r1.getOkhttpResponse()
                boolean r3 = r1.isSuccessful()
                if (r3 == 0) goto La6
                okhttp3.ResponseBody r3 = r1.body()
                if (r3 == 0) goto La6
                com.google.gson.Gson r3 = new com.google.gson.Gson
                r3.<init>()
                okhttp3.ResponseBody r1 = r1.body()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                java.lang.String r1 = r1.string()
                java.lang.Class<com.phimhd.ListIPTV> r4 = com.phimhd.ListIPTV.class
                java.lang.Object r1 = r3.fromJson(r1, r4)
                com.phimhd.ListIPTV r1 = (com.phimhd.ListIPTV) r1
                java.lang.String r3 = "listIPTV"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
                com.lagradost.cloudstream3.HomePageList r1 = com.phimhd.ConfigHomeKt.toHomePageList(r1)
                r0.add(r1)
            La6:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.LokLokProvider.Companion.getIPTV(java.util.ArrayList, kotlin.coroutines.Continuation):java.lang.Object")
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */ /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */ /* JADX WARN: Type inference failed for: r0v2, types: [T, java.util.ArrayList] */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun getMainPage(r21: Continuation<in HomePageResponse?>?): Any? {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.LokLokProvider.getMainPage(kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */ /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */ /* JADX WARN: Removed duplicated region for block: B:29:0x015f A[LOOP:0: B:27:0x0159->B:29:0x015f, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:32:0x017e  */ /* JADX WARN: Removed duplicated region for block: B:46:0x02c1  */ /* JADX WARN: Removed duplicated region for block: B:47:0x02ee  */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun loadPage(r30: String?, r31: Continuation<in PageResponse?>?): Any {
        /*
            Method dump skipped, instructions count: 759
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.LokLokProvider.loadPage(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */ /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun search(
        r25: String?,
        r26: Continuation<in MutableList<out SearchResponse?>?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.LokLokProvider.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */ /* JADX WARN: Removed duplicated region for block: B:19:0x00c9  */ /* JADX WARN: Removed duplicated region for block: B:33:0x01da  */ /* JADX WARN: Removed duplicated region for block: B:35:0x0209  */ /* JADX WARN: Removed duplicated region for block: B:39:0x0214  */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0188 -> B:31:0x0193). Please submit an issue!!! */
    @Override // com.lagradost.cloudstream3.MainAPI
            /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */    fun loadLinks(
        r37: String?,
        r38: Boolean,
        r39: Function1<SubtitleFile?, Unit>?,
        r40: Function1<ExtractorLink?, Unit>?,
        r41: Continuation<in Boolean?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 589
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.LokLokProvider.loadLinks(java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */ /* JADX WARN: Removed duplicated region for block: B:20:0x013e  */ /* JADX WARN: Removed duplicated region for block: B:26:0x0177  */ /* JADX WARN: Removed duplicated region for block: B:29:0x0199  */ /* JADX WARN: Removed duplicated region for block: B:46:0x025a  */ /* JADX WARN: Type inference failed for: r8v15, types: [T, java.lang.Object, java.lang.String] */ /* JADX WARN: Type inference failed for: r9v12, types: [T, java.lang.String] */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun load(r46: String?, r47: Continuation<in LoadResponse?>?): Any {
        /*
            Method dump skipped, instructions count: 800
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.LokLokProvider.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* compiled from: LokLokProvider.kt */
    @Metadata(
        m108d1 = ["\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\u000cJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JK\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u00062\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006#"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$RecommendItem;", "", "homeSectionName", "", "homeSectionType", "coverType", "", "homeSectionId", "refId", "recommendContentVOList", "", "Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$RecommendContentVOItem;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/util/List;)V", "getCoverType", "()Ljava/lang/Number;", "getHomeSectionId", "getHomeSectionName", "()Ljava/lang/String;", "getHomeSectionType", "getRecommendContentVOList", "()Ljava/util/List;", "getRefId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class RecommendItem(
        @JsonProperty("homeSectionName") homeSectionName: String,
        @JsonProperty("homeSectionType") homeSectionType: String,
        @JsonProperty("coverType") coverType: Number,
        @JsonProperty("homeSectionId") homeSectionId: Number,
        @JsonProperty("refId") refId: Number,
        @JsonProperty("recommendContentVOList") recommendContentVOList: List<RecommendContentVOItem>
    ) {
        private val coverType: Number
        private val homeSectionId: Number
        val homeSectionName: String
        val homeSectionType: String
        val recommendContentVOList: List<RecommendContentVOItem>
        val refId: Number
        operator fun component1(): String {
            return homeSectionName
        }

        operator fun component2(): String {
            return homeSectionType
        }

        operator fun component3(): Number {
            return coverType
        }

        operator fun component4(): Number {
            return homeSectionId
        }

        operator fun component5(): Number {
            return refId
        }

        operator fun component6(): List<RecommendContentVOItem> {
            return recommendContentVOList
        }

        fun copy(
            @JsonProperty("homeSectionName") homeSectionName: String,
            @JsonProperty("homeSectionType") homeSectionType: String,
            @JsonProperty("coverType") coverType: Number,
            @JsonProperty("homeSectionId") homeSectionId: Number,
            @JsonProperty("refId") refId: Number,
            @JsonProperty("recommendContentVOList") recommendContentVOList: List<RecommendContentVOItem>
        ): RecommendItem {
            Intrinsics.checkNotNullParameter(homeSectionName, "homeSectionName")
            Intrinsics.checkNotNullParameter(homeSectionType, "homeSectionType")
            Intrinsics.checkNotNullParameter(coverType, "coverType")
            Intrinsics.checkNotNullParameter(homeSectionId, "homeSectionId")
            Intrinsics.checkNotNullParameter(refId, "refId")
            Intrinsics.checkNotNullParameter(recommendContentVOList, "recommendContentVOList")
            return RecommendItem(
                homeSectionName,
                homeSectionType,
                coverType,
                homeSectionId,
                refId,
                recommendContentVOList
            )
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is RecommendItem) {
                val recommendItem = obj as RecommendItem
                return Intrinsics.areEqual(
                    homeSectionName,
                    recommendItem.homeSectionName
                ) && Intrinsics.areEqual(
                    homeSectionType, recommendItem.homeSectionType
                ) && Intrinsics.areEqual(
                    coverType, recommendItem.coverType
                ) && Intrinsics.areEqual(
                    homeSectionId, recommendItem.homeSectionId
                ) && Intrinsics.areEqual(
                    refId, recommendItem.refId
                ) && Intrinsics.areEqual(
                    recommendContentVOList, recommendItem.recommendContentVOList
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return ((((homeSectionName.hashCode() * 31 + homeSectionType.hashCode()) * 31 + coverType.hashCode()) * 31 + homeSectionId.hashCode()) * 31 + refId.hashCode()) * 31 + recommendContentVOList.hashCode()
        }

        override fun toString(): String {
            return "RecommendItem(homeSectionName=" + homeSectionName + ", homeSectionType=" + homeSectionType + ", coverType=" + coverType + ", homeSectionId=" + homeSectionId + ", refId=" + refId + ", recommendContentVOList=" + recommendContentVOList + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(homeSectionName, "homeSectionName")
            Intrinsics.checkNotNullParameter(homeSectionType, "homeSectionType")
            Intrinsics.checkNotNullParameter(coverType, "coverType")
            Intrinsics.checkNotNullParameter(homeSectionId, "homeSectionId")
            Intrinsics.checkNotNullParameter(refId, "refId")
            Intrinsics.checkNotNullParameter(recommendContentVOList, "recommendContentVOList")
            this.homeSectionName = homeSectionName
            this.homeSectionType = homeSectionType
            this.coverType = coverType
            this.homeSectionId = homeSectionId
            this.refId = refId
            this.recommendContentVOList = recommendContentVOList
        }

        fun getCoverType(): Number? {
            return coverType
        }

        fun getHomeSectionId(): Number? {
            return homeSectionId
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                recommendItem: RecommendItem,
                str: String,
                str2: String,
                number: Number,
                number2: Number,
                number3: Number,
                list: List,
                i: Int,
                obj: Object?
            ): RecommendItem {
                var str = str
                var str2 = str2
                var number = number
                var number2 = number2
                var number3 = number3
                if (i and 1 != 0) {
                    str = recommendItem.homeSectionName
                }
                if (i and 2 != 0) {
                    str2 = recommendItem.homeSectionType
                }
                val str3 = str2
                if (i and 4 != 0) {
                    number = recommendItem.coverType
                }
                val number4 = number
                if (i and 8 != 0) {
                    number2 = recommendItem.homeSectionId
                }
                val number5 = number2
                if (i and 16 != 0) {
                    number3 = recommendItem.refId
                }
                val number6 = number3
                var list2: List<RecommendContentVOItem> = list
                if (i and 32 != 0) {
                    list2 = recommendItem.recommendContentVOList
                }
                return recommendItem.copy(str, str3, number4, number5, number6, list2)
            }
        }
    }

    /* compiled from: LokLokProvider.kt */
    @Metadata(
        m108d1 = ["\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000c\u001a\u00020\u0006\u0012\b\b\u0001\u0010\r\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003Jw\u0010*\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\u000c\u001a\u00020\u00062\b\b\u0003\u0010\r\u001a\u00020\u00062\b\b\u0003\u0010\u000e\u001a\u00020\u000b2\b\b\u0003\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010+\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000c\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u00060"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$RecommendContentVOItem;", "", MonitorLogServerProtocol.PARAM_CATEGORY, "", "contentType", "id", "", "imageUrl", "jumpAddress", "jumpType", "needLogin", "", "resourceNum", "resourceStatus", "showMark", "title", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Number;Ljava/lang/Number;ZLjava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "getContentType", "getId", "()Ljava/lang/Number;", "getImageUrl", "getJumpAddress", "getJumpType", "getNeedLogin", "()Z", "getResourceNum", "getResourceStatus", "getShowMark", "getTitle", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class RecommendContentVOItem(
        @JsonProperty("category") category: String,
        @JsonProperty("contentType") contentType: String,
        @JsonProperty("id") id: Number,
        @JsonProperty("imageUrl") imageUrl: String,
        @JsonProperty("jumpAddress") jumpAddress: String,
        @JsonProperty("jumpType") jumpType: String,
        @JsonProperty("needLogin") z: Boolean,
        @JsonProperty("resourceNum") resourceNum: Number,
        @JsonProperty("resourceStatus") resourceStatus: Number,
        @JsonProperty("showMark") z2: Boolean,
        @JsonProperty("title") title: String
    ) {
        val category: String
        val contentType: String

        /* renamed from: id */
        val id: Number
        val imageUrl: String
        val jumpAddress: String
        val jumpType: String
        val needLogin: Boolean
        val resourceNum: Number
        val resourceStatus: Number
        val showMark: Boolean
        val title: String
        operator fun component1(): String {
            return category
        }

        operator fun component10(): Boolean {
            return showMark
        }

        operator fun component11(): String {
            return title
        }

        operator fun component2(): String {
            return contentType
        }

        operator fun component3(): Number {
            return id
        }

        operator fun component4(): String {
            return imageUrl
        }

        operator fun component5(): String {
            return jumpAddress
        }

        operator fun component6(): String {
            return jumpType
        }

        operator fun component7(): Boolean {
            return needLogin
        }

        operator fun component8(): Number {
            return resourceNum
        }

        operator fun component9(): Number {
            return resourceStatus
        }

        fun copy(
            @JsonProperty("category") category: String,
            @JsonProperty("contentType") contentType: String,
            @JsonProperty("id") id: Number,
            @JsonProperty("imageUrl") imageUrl: String,
            @JsonProperty("jumpAddress") jumpAddress: String,
            @JsonProperty("jumpType") jumpType: String,
            @JsonProperty("needLogin") z: Boolean,
            @JsonProperty("resourceNum") resourceNum: Number,
            @JsonProperty("resourceStatus") resourceStatus: Number,
            @JsonProperty("showMark") z2: Boolean,
            @JsonProperty("title") title: String
        ): RecommendContentVOItem {
            Intrinsics.checkNotNullParameter(category, "category")
            Intrinsics.checkNotNullParameter(contentType, "contentType")
            Intrinsics.checkNotNullParameter(id, "id")
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl")
            Intrinsics.checkNotNullParameter(jumpAddress, "jumpAddress")
            Intrinsics.checkNotNullParameter(jumpType, "jumpType")
            Intrinsics.checkNotNullParameter(resourceNum, "resourceNum")
            Intrinsics.checkNotNullParameter(resourceStatus, "resourceStatus")
            Intrinsics.checkNotNullParameter(title, "title")
            return RecommendContentVOItem(
                category,
                contentType,
                id,
                imageUrl,
                jumpAddress,
                jumpType,
                z,
                resourceNum,
                resourceStatus,
                z2,
                title
            )
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is RecommendContentVOItem) {
                val recommendContentVOItem = obj as RecommendContentVOItem
                return Intrinsics.areEqual(
                    category,
                    recommendContentVOItem.category
                ) && Intrinsics.areEqual(
                    contentType, recommendContentVOItem.contentType
                ) && Intrinsics.areEqual(
                    id, recommendContentVOItem.id
                ) && Intrinsics.areEqual(
                    imageUrl, recommendContentVOItem.imageUrl
                ) && Intrinsics.areEqual(
                    jumpAddress, recommendContentVOItem.jumpAddress
                ) && Intrinsics.areEqual(
                    jumpType, recommendContentVOItem.jumpType
                ) && needLogin == recommendContentVOItem.needLogin && Intrinsics.areEqual(
                    resourceNum, recommendContentVOItem.resourceNum
                ) && Intrinsics.areEqual(
                    resourceStatus, recommendContentVOItem.resourceStatus
                ) && showMark == recommendContentVOItem.showMark && Intrinsics.areEqual(
                    title, recommendContentVOItem.title
                )
            }
            return false
        }

        /* JADX WARN: Multi-variable type inference failed */
        override fun hashCode(): Int {
            val hashCode =
                (((((category.hashCode() * 31 + contentType.hashCode()) * 31 + id.hashCode()) * 31 + imageUrl.hashCode()) * 31 + jumpAddress.hashCode()) * 31 + jumpType.hashCode()) * 31
            val z = needLogin
            var i: Int = z.toInt()
            if (z.toInt() != 0) {
                i = 1
            }
            val hashCode2 =
                (((hashCode + i) * 31 + resourceNum.hashCode()) * 31 + resourceStatus.hashCode()) * 31
            val z2 = showMark
            return (hashCode2 + if (z2) 1 else if (z2) 1 else 0) * 31 + title.hashCode()
        }

        override fun toString(): String {
            return "RecommendContentVOItem(category=" + category + ", contentType=" + contentType + ", id=" + id + ", imageUrl=" + imageUrl + ", jumpAddress=" + jumpAddress + ", jumpType=" + jumpType + ", needLogin=" + needLogin + ", resourceNum=" + resourceNum + ", resourceStatus=" + resourceStatus + ", showMark=" + showMark + ", title=" + title + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(category, "category")
            Intrinsics.checkNotNullParameter(contentType, "contentType")
            Intrinsics.checkNotNullParameter(id, "id")
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl")
            Intrinsics.checkNotNullParameter(jumpAddress, "jumpAddress")
            Intrinsics.checkNotNullParameter(jumpType, "jumpType")
            Intrinsics.checkNotNullParameter(resourceNum, "resourceNum")
            Intrinsics.checkNotNullParameter(resourceStatus, "resourceStatus")
            Intrinsics.checkNotNullParameter(title, "title")
            this.category = category
            this.contentType = contentType
            this.id = id
            this.imageUrl = imageUrl
            this.jumpAddress = jumpAddress
            this.jumpType = jumpType
            needLogin = z
            this.resourceNum = resourceNum
            this.resourceStatus = resourceStatus
            showMark = z2
            this.title = title
        }
    }

    /* compiled from: LokLokProvider.kt */
    @Metadata(
        m108d1 = ["\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u000c0\u0003¢\u0006\u0002\u0010\rJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000c0\u0003HÆ\u0003JM\u0010\u001b\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u000c0\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\t\u0010 \u001a\u00020\bHÖ\u0001R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u000c0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f¨\u0006!"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$Data;", "", "recommendItems", "", "Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$RecommendItem;", "page", "", "name", "", "searchResults", "Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$SearchResultItem;", "content", "Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$SearchPageItem;", "(Ljava/util/List;ILjava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getContent", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", "getPage", "()I", "getRecommendItems", "getSearchResults", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Data(
        @JsonProperty("recommendItems") recommendItems: List<RecommendItem>,
        @JsonProperty("page") i: Int,
        @JsonProperty("name") name: String,
        @JsonProperty("searchResults") searchResults: List<SearchResultItem>,
        @JsonProperty("content") content: List<SearchPageItem>
    ) {
        val content: List<SearchPageItem>
        val name: String
        val page: Int
        val recommendItems: List<RecommendItem>
        val searchResults: List<SearchResultItem>
        operator fun component1(): List<RecommendItem> {
            return recommendItems
        }

        operator fun component2(): Int {
            return page
        }

        operator fun component3(): String {
            return name
        }

        operator fun component4(): List<SearchResultItem> {
            return searchResults
        }

        operator fun component5(): List<SearchPageItem> {
            return content
        }

        fun copy(
            @JsonProperty("recommendItems") recommendItems: List<RecommendItem>,
            @JsonProperty("page") i: Int,
            @JsonProperty("name") name: String,
            @JsonProperty("searchResults") searchResults: List<SearchResultItem>,
            @JsonProperty("content") content: List<SearchPageItem>
        ): Data {
            Intrinsics.checkNotNullParameter(recommendItems, "recommendItems")
            Intrinsics.checkNotNullParameter(name, "name")
            Intrinsics.checkNotNullParameter(searchResults, "searchResults")
            Intrinsics.checkNotNullParameter(content, "content")
            return Data(recommendItems, i, name, searchResults, content)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Data) {
                val data = obj as Data
                return Intrinsics.areEqual(
                    recommendItems,
                    data.recommendItems
                ) && page == data.page && Intrinsics.areEqual(
                    name, data.name
                ) && Intrinsics.areEqual(searchResults, data.searchResults) && Intrinsics.areEqual(
                    content, data.content
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return (((recommendItems.hashCode() * 31 + page) * 31 + name.hashCode()) * 31 + searchResults.hashCode()) * 31 + content.hashCode()
        }

        override fun toString(): String {
            return "Data(recommendItems=" + recommendItems + ", page=" + page + ", name=" + name + ", searchResults=" + searchResults + ", content=" + content + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(recommendItems, "recommendItems")
            Intrinsics.checkNotNullParameter(name, "name")
            Intrinsics.checkNotNullParameter(searchResults, "searchResults")
            Intrinsics.checkNotNullParameter(content, "content")
            this.recommendItems = recommendItems
            page = i
            this.name = name
            this.searchResults = searchResults
            this.content = content
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                data: Data,
                list: List,
                i: Int,
                str: String,
                list2: List,
                list3: List,
                i2: Int,
                obj: Object?
            ): Data {
                var i = i
                var str = str
                var list4: List<RecommendItem> = list
                if (i2 and 1 != 0) {
                    list4 = data.recommendItems
                }
                if (i2 and 2 != 0) {
                    i = data.page
                }
                val i3 = i
                if (i2 and 4 != 0) {
                    str = data.name
                }
                val str2 = str
                var list5: List<SearchResultItem?> = list2
                if (i2 and 8 != 0) {
                    list5 = data.searchResults
                }
                val list6: List = list5
                var list7: List<SearchPageItem> = list3
                if (i2 and 16 != 0) {
                    list7 = data.content
                }
                return data.copy(list4, i3, str2, list6, list7)
            }
        }
    }

    /* compiled from: LokLokProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000c\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$ItemCategory;", "", NativeProtocol.WEB_DIALOG_PARAMS, "", "name", "screeningType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getParams", "getScreeningType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class ItemCategory(
        @JsonProperty("params") params: String,
        @JsonProperty("name") name: String,
        @JsonProperty("screeningType") screeningType: String
    ) {
        val name: String
        val params: String
        val screeningType: String
        operator fun component1(): String {
            return params
        }

        operator fun component2(): String {
            return name
        }

        operator fun component3(): String {
            return screeningType
        }

        fun copy(
            @JsonProperty("params") params: String,
            @JsonProperty("name") name: String,
            @JsonProperty("screeningType") screeningType: String
        ): ItemCategory {
            Intrinsics.checkNotNullParameter(params, "params")
            Intrinsics.checkNotNullParameter(name, "name")
            Intrinsics.checkNotNullParameter(screeningType, "screeningType")
            return ItemCategory(params, name, screeningType)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is ItemCategory) {
                val itemCategory = obj as ItemCategory
                return Intrinsics.areEqual(params, itemCategory.params) && Intrinsics.areEqual(
                    name, itemCategory.name
                ) && Intrinsics.areEqual(
                    screeningType, itemCategory.screeningType
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return (params.hashCode() * 31 + name.hashCode()) * 31 + screeningType.hashCode()
        }

        override fun toString(): String {
            return "ItemCategory(params=" + params + ", name=" + name + ", screeningType=" + screeningType + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(params, "params")
            Intrinsics.checkNotNullParameter(name, "name")
            Intrinsics.checkNotNullParameter(screeningType, "screeningType")
            this.params = params
            this.name = name
            this.screeningType = screeningType
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                itemCategory: ItemCategory,
                str: String,
                str2: String,
                str3: String,
                i: Int,
                obj: Object?
            ): ItemCategory {
                var str = str
                var str2 = str2
                var str3 = str3
                if (i and 1 != 0) {
                    str = itemCategory.params
                }
                if (i and 2 != 0) {
                    str2 = itemCategory.name
                }
                if (i and 4 != 0) {
                    str3 = itemCategory.screeningType
                }
                return itemCategory.copy(str, str2, str3)
            }
        }
    }

    /* compiled from: LokLokProvider.kt */
    @Metadata(
        m108d1 = ["\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$ScreenItem;", "", "id", "", "name", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$ItemCategory;", "(ILjava/lang/String;Ljava/util/List;)V", "getId", "()I", "getItems", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class ScreenItem(
        @JsonProperty("id") i: Int,
        @JsonProperty("name") name: String,
        @JsonProperty("items") items: List<ItemCategory>
    ) {
        /* renamed from: id */
        val id: Int
        val items: List<ItemCategory>
        val name: String
        operator fun component1(): Int {
            return id
        }

        operator fun component2(): String {
            return name
        }

        operator fun component3(): List<ItemCategory> {
            return items
        }

        fun copy(
            @JsonProperty("id") i: Int,
            @JsonProperty("name") name: String,
            @JsonProperty("items") items: List<ItemCategory>
        ): ScreenItem {
            Intrinsics.checkNotNullParameter(name, "name")
            Intrinsics.checkNotNullParameter(items, "items")
            return ScreenItem(i, name, items)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is ScreenItem) {
                val screenItem = obj as ScreenItem
                return id == screenItem.id && Intrinsics.areEqual(
                    name,
                    screenItem.name
                ) && Intrinsics.areEqual(
                    items, screenItem.items
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return (id * 31 + name.hashCode()) * 31 + items.hashCode()
        }

        override fun toString(): String {
            return "ScreenItem(id=" + id + ", name=" + name + ", items=" + items + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(name, "name")
            Intrinsics.checkNotNullParameter(items, "items")
            id = i
            this.name = name
            this.items = items
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                screenItem: ScreenItem,
                i: Int,
                str: String,
                list: List,
                i2: Int,
                obj: Object?
            ): ScreenItem {
                var i = i
                var str = str
                var list: List = list
                if (i2 and 1 != 0) {
                    i = screenItem.id
                }
                if (i2 and 2 != 0) {
                    str = screenItem.name
                }
                if (i2 and 4 != 0) {
                    list = screenItem.items
                }
                return screenItem.copy(i, str, list)
            }
        }
    }

    /* compiled from: LokLokProvider.kt */
    @Metadata(
        m108d1 = ["\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000cR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$DataCategory;", "", "screeningItems", "", "Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$ScreenItem;", "id", "", "name", "", NativeProtocol.WEB_DIALOG_PARAMS, "(Ljava/util/List;ILjava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getParams", "getScreeningItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class DataCategory(
        @JsonProperty("screeningItems") screeningItems: List<ScreenItem>,
        @JsonProperty("id") i: Int,
        @JsonProperty("name") name: String,
        @JsonProperty("params") params: String
    ) {
        /* renamed from: id */
        val id: Int
        val name: String
        val params: String
        val screeningItems: List<ScreenItem>
        operator fun component1(): List<ScreenItem> {
            return screeningItems
        }

        operator fun component2(): Int {
            return id
        }

        operator fun component3(): String {
            return name
        }

        operator fun component4(): String {
            return params
        }

        fun copy(
            @JsonProperty("screeningItems") screeningItems: List<ScreenItem>,
            @JsonProperty("id") i: Int,
            @JsonProperty("name") name: String,
            @JsonProperty("params") params: String
        ): DataCategory {
            Intrinsics.checkNotNullParameter(screeningItems, "screeningItems")
            Intrinsics.checkNotNullParameter(name, "name")
            Intrinsics.checkNotNullParameter(params, "params")
            return DataCategory(screeningItems, i, name, params)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is DataCategory) {
                val dataCategory = obj as DataCategory
                return Intrinsics.areEqual(
                    screeningItems,
                    dataCategory.screeningItems
                ) && id == dataCategory.id && Intrinsics.areEqual(
                    name, dataCategory.name
                ) && Intrinsics.areEqual(params, dataCategory.params)
            }
            return false
        }

        override fun hashCode(): Int {
            return ((screeningItems.hashCode() * 31 + id) * 31 + name.hashCode()) * 31 + params.hashCode()
        }

        override fun toString(): String {
            return "DataCategory(screeningItems=" + screeningItems + ", id=" + id + ", name=" + name + ", params=" + params + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(screeningItems, "screeningItems")
            Intrinsics.checkNotNullParameter(name, "name")
            Intrinsics.checkNotNullParameter(params, "params")
            this.screeningItems = screeningItems
            id = i
            this.name = name
            this.params = params
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                dataCategory: DataCategory,
                list: List,
                i: Int,
                str: String,
                str2: String,
                i2: Int,
                obj: Object?
            ): DataCategory {
                var list: List = list
                var i = i
                var str = str
                var str2 = str2
                if (i2 and 1 != 0) {
                    list = dataCategory.screeningItems
                }
                if (i2 and 2 != 0) {
                    i = dataCategory.id
                }
                if (i2 and 4 != 0) {
                    str = dataCategory.name
                }
                if (i2 and 8 != 0) {
                    str2 = dataCategory.params
                }
                return dataCategory.copy(list, i, str, str2)
            }
        }
    }

    /* compiled from: LokLokProvider.kt */
    @Metadata(
        m108d1 = ["\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$HomeCategoryResponse;", "", "data", "", "Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$DataCategory;", "code", "", "(Ljava/util/List;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getData", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class HomeCategoryResponse(
        @JsonProperty("data") data: List<DataCategory>,
        @JsonProperty("code") code: String
    ) {
        val code: String
        val data: List<DataCategory>
        operator fun component1(): List<DataCategory> {
            return data
        }

        operator fun component2(): String {
            return code
        }

        fun copy(
            @JsonProperty("data") data: List<DataCategory>,
            @JsonProperty("code") code: String
        ): HomeCategoryResponse {
            Intrinsics.checkNotNullParameter(data, "data")
            Intrinsics.checkNotNullParameter(code, "code")
            return HomeCategoryResponse(data, code)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is HomeCategoryResponse) {
                val homeCategoryResponse = obj as HomeCategoryResponse
                return Intrinsics.areEqual(data, homeCategoryResponse.data) && Intrinsics.areEqual(
                    code, homeCategoryResponse.code
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return data.hashCode() * 31 + code.hashCode()
        }

        override fun toString(): String {
            return "HomeCategoryResponse(data=" + data + ", code=" + code + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(data, "data")
            Intrinsics.checkNotNullParameter(code, "code")
            this.data = data
            this.code = code
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                homeCategoryResponse: HomeCategoryResponse,
                list: List,
                str: String,
                i: Int,
                obj: Object?
            ): HomeCategoryResponse {
                var list: List = list
                var str = str
                if (i and 1 != 0) {
                    list = homeCategoryResponse.data
                }
                if (i and 2 != 0) {
                    str = homeCategoryResponse.code
                }
                return homeCategoryResponse.copy(list, str)
            }
        }
    }

    /* compiled from: LokLokProvider.kt */
    @Metadata(
        m108d1 = ["\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000c\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$HomeResponse;", "", "data", "Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$Data;", "code", "", "(Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$Data;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getData", "()Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$Data;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class HomeResponse(@JsonProperty("data") data: Data, @JsonProperty("code") code: String) {
        val code: String
        val data: Data
        operator fun component1(): Data {
            return data
        }

        operator fun component2(): String {
            return code
        }

        fun copy(
            @JsonProperty("data") data: Data,
            @JsonProperty("code") code: String
        ): HomeResponse {
            Intrinsics.checkNotNullParameter(data, "data")
            Intrinsics.checkNotNullParameter(code, "code")
            return HomeResponse(data, code)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is HomeResponse) {
                val homeResponse = obj as HomeResponse
                return Intrinsics.areEqual(data, homeResponse.data) && Intrinsics.areEqual(
                    code, homeResponse.code
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return data.hashCode() * 31 + code.hashCode()
        }

        override fun toString(): String {
            return "HomeResponse(data=" + data + ", code=" + code + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(data, "data")
            Intrinsics.checkNotNullParameter(code, "code")
            this.data = data
            this.code = code
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                homeResponse: HomeResponse,
                data: Data,
                str: String,
                i: Int,
                obj: Object?
            ): HomeResponse {
                var data = data
                var str = str
                if (i and 1 != 0) {
                    data = homeResponse.data
                }
                if (i and 2 != 0) {
                    str = homeResponse.code
                }
                return homeResponse.copy(data, str)
            }
        }
    }

    /* compiled from: LokLokProvider.kt */
    @Metadata(
        m108d1 = ["\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000c\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$LokLokSearchResponse;", "", "data", "Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$Data;", "code", "", "(Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$Data;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getData", "()Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$Data;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class LokLokSearchResponse(
        @JsonProperty("data") data: Data,
        @JsonProperty("code") code: String
    ) {
        val code: String
        val data: Data
        operator fun component1(): Data {
            return data
        }

        operator fun component2(): String {
            return code
        }

        fun copy(
            @JsonProperty("data") data: Data,
            @JsonProperty("code") code: String
        ): LokLokSearchResponse {
            Intrinsics.checkNotNullParameter(data, "data")
            Intrinsics.checkNotNullParameter(code, "code")
            return LokLokSearchResponse(data, code)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is LokLokSearchResponse) {
                val lokLokSearchResponse = obj as LokLokSearchResponse
                return Intrinsics.areEqual(data, lokLokSearchResponse.data) && Intrinsics.areEqual(
                    code, lokLokSearchResponse.code
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return data.hashCode() * 31 + code.hashCode()
        }

        override fun toString(): String {
            return "LokLokSearchResponse(data=" + data + ", code=" + code + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(data, "data")
            Intrinsics.checkNotNullParameter(code, "code")
            this.data = data
            this.code = code
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                lokLokSearchResponse: LokLokSearchResponse,
                data: Data,
                str: String,
                i: Int,
                obj: Object?
            ): LokLokSearchResponse {
                var data = data
                var str = str
                if (i and 1 != 0) {
                    data = lokLokSearchResponse.data
                }
                if (i and 2 != 0) {
                    str = lokLokSearchResponse.code
                }
                return lokLokSearchResponse.copy(data, str)
            }
        }
    }

    /* compiled from: LokLokProvider.kt */
    @Metadata(
        m108d1 = ["\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000c\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$LokLokMovieDetailResponseData;", "", "data", "LLokLokMovieDetailResponse;", "code", "", "(LLokLokMovieDetailResponse;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getData", "()LLokLokMovieDetailResponse;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class LokLokMovieDetailResponseData(
        @JsonProperty("data") data: C5587LokLokMovieDetailResponse,
        @JsonProperty("code") code: String
    ) {
        val code: String
        private val data: C5587LokLokMovieDetailResponse
        operator fun component1(): C5587LokLokMovieDetailResponse {
            return data
        }

        operator fun component2(): String {
            return code
        }

        fun copy(
            @JsonProperty("data") data: C5587LokLokMovieDetailResponse,
            @JsonProperty("code") code: String
        ): LokLokMovieDetailResponseData {
            Intrinsics.checkNotNullParameter(data, "data")
            Intrinsics.checkNotNullParameter(code, "code")
            return LokLokMovieDetailResponseData(data, code)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is LokLokMovieDetailResponseData) {
                val lokLokMovieDetailResponseData = obj as LokLokMovieDetailResponseData
                return Intrinsics.areEqual(
                    data,
                    lokLokMovieDetailResponseData.data
                ) && Intrinsics.areEqual(
                    code, lokLokMovieDetailResponseData.code
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return data.hashCode() * 31 + code.hashCode()
        }

        override fun toString(): String {
            return "LokLokMovieDetailResponseData(data=" + data + ", code=" + code + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(data, "data")
            Intrinsics.checkNotNullParameter(code, "code")
            this.data = data
            this.code = code
        }

        fun getData(): C5587LokLokMovieDetailResponse {
            return data
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                lokLokMovieDetailResponseData: LokLokMovieDetailResponseData,
                c5587LokLokMovieDetailResponse: C5587LokLokMovieDetailResponse,
                str: String,
                i: Int,
                obj: Object?
            ): LokLokMovieDetailResponseData {
                var c5587LokLokMovieDetailResponse: C5587LokLokMovieDetailResponse =
                    c5587LokLokMovieDetailResponse
                var str = str
                if (i and 1 != 0) {
                    c5587LokLokMovieDetailResponse = lokLokMovieDetailResponseData.data
                }
                if (i and 2 != 0) {
                    str = lokLokMovieDetailResponseData.code
                }
                return lokLokMovieDetailResponseData.copy(c5587LokLokMovieDetailResponse, str)
            }
        }
    }

    /* compiled from: LokLokProvider.kt */
    @Metadata(
        m108d1 = ["\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000c\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$LokLokSourceResponse;", "", "data", "Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$LokLokSource;", "code", "", "(Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$LokLokSource;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getData", "()Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$LokLokSource;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class LokLokSourceResponse(
        @JsonProperty("data") data: LokLokSource,
        @JsonProperty("code") code: String
    ) {
        val code: String
        val data: LokLokSource
        operator fun component1(): LokLokSource {
            return data
        }

        operator fun component2(): String {
            return code
        }

        fun copy(
            @JsonProperty("data") data: LokLokSource,
            @JsonProperty("code") code: String
        ): LokLokSourceResponse {
            Intrinsics.checkNotNullParameter(data, "data")
            Intrinsics.checkNotNullParameter(code, "code")
            return LokLokSourceResponse(data, code)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is LokLokSourceResponse) {
                val lokLokSourceResponse = obj as LokLokSourceResponse
                return Intrinsics.areEqual(data, lokLokSourceResponse.data) && Intrinsics.areEqual(
                    code, lokLokSourceResponse.code
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return data.hashCode() * 31 + code.hashCode()
        }

        override fun toString(): String {
            return "LokLokSourceResponse(data=" + data + ", code=" + code + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(data, "data")
            Intrinsics.checkNotNullParameter(code, "code")
            this.data = data
            this.code = code
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                lokLokSourceResponse: LokLokSourceResponse,
                lokLokSource: LokLokSource,
                str: String,
                i: Int,
                obj: Object?
            ): LokLokSourceResponse {
                var lokLokSource = lokLokSource
                var str = str
                if (i and 1 != 0) {
                    lokLokSource = lokLokSourceResponse.data
                }
                if (i and 2 != 0) {
                    str = lokLokSourceResponse.code
                }
                return lokLokSourceResponse.copy(lokLokSource, str)
            }
        }
    }

    /* compiled from: LokLokProvider.kt */
    @Metadata(
        m108d1 = ["\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000c¨\u0006\u001a"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$LokLokSource;", "", "mediaUrl", "", "episodeId", "currentDefinition", "businessType", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;)V", "getBusinessType", "()Ljava/lang/Number;", "getCurrentDefinition", "()Ljava/lang/String;", "getEpisodeId", "getMediaUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class LokLokSource(
        @JsonProperty("mediaUrl") mediaUrl: String,
        @JsonProperty("episodeId") episodeId: String,
        @JsonProperty("currentDefinition") currentDefinition: String,
        @JsonProperty("businessType") businessType: Number
    ) {
        val businessType: Number
        val currentDefinition: String
        val episodeId: String
        val mediaUrl: String
        operator fun component1(): String {
            return mediaUrl
        }

        operator fun component2(): String {
            return episodeId
        }

        operator fun component3(): String {
            return currentDefinition
        }

        operator fun component4(): Number {
            return businessType
        }

        fun copy(
            @JsonProperty("mediaUrl") mediaUrl: String,
            @JsonProperty("episodeId") episodeId: String,
            @JsonProperty("currentDefinition") currentDefinition: String,
            @JsonProperty("businessType") businessType: Number
        ): LokLokSource {
            Intrinsics.checkNotNullParameter(mediaUrl, "mediaUrl")
            Intrinsics.checkNotNullParameter(episodeId, "episodeId")
            Intrinsics.checkNotNullParameter(currentDefinition, "currentDefinition")
            Intrinsics.checkNotNullParameter(businessType, "businessType")
            return LokLokSource(mediaUrl, episodeId, currentDefinition, businessType)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is LokLokSource) {
                val lokLokSource = obj as LokLokSource
                return Intrinsics.areEqual(mediaUrl, lokLokSource.mediaUrl) && Intrinsics.areEqual(
                    episodeId, lokLokSource.episodeId
                ) && Intrinsics.areEqual(
                    currentDefinition, lokLokSource.currentDefinition
                ) && Intrinsics.areEqual(
                    businessType, lokLokSource.businessType
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return ((mediaUrl.hashCode() * 31 + episodeId.hashCode()) * 31 + currentDefinition.hashCode()) * 31 + businessType.hashCode()
        }

        override fun toString(): String {
            return "LokLokSource(mediaUrl=" + mediaUrl + ", episodeId=" + episodeId + ", currentDefinition=" + currentDefinition + ", businessType=" + businessType + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(mediaUrl, "mediaUrl")
            Intrinsics.checkNotNullParameter(episodeId, "episodeId")
            Intrinsics.checkNotNullParameter(currentDefinition, "currentDefinition")
            Intrinsics.checkNotNullParameter(businessType, "businessType")
            this.mediaUrl = mediaUrl
            this.episodeId = episodeId
            this.currentDefinition = currentDefinition
            this.businessType = businessType
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                lokLokSource: LokLokSource,
                str: String,
                str2: String,
                str3: String,
                number: Number,
                i: Int,
                obj: Object?
            ): LokLokSource {
                var str = str
                var str2 = str2
                var str3 = str3
                var number = number
                if (i and 1 != 0) {
                    str = lokLokSource.mediaUrl
                }
                if (i and 2 != 0) {
                    str2 = lokLokSource.episodeId
                }
                if (i and 4 != 0) {
                    str3 = lokLokSource.currentDefinition
                }
                if (i and 8 != 0) {
                    number = lokLokSource.businessType
                }
                return lokLokSource.copy(str, str2, str3, number)
            }
        }
    }

    /* compiled from: LokLokProvider.kt */
    @Metadata(
        m108d1 = ["\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000c\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00032\b\b\u0003\u0010\u000c\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\tHÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006'"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$SearchResultItem;", "", "coverVerticalUrl", "", "coverHorizontalUrl", "name", "id", "", "domainType", "", "releaseTime", "sort", TypedValues.TransitionType.S_DURATION, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCoverHorizontalUrl", "()Ljava/lang/String;", "getCoverVerticalUrl", "getDomainType", "()I", "getDuration", "getId", "()Ljava/lang/Number;", "getName", "getReleaseTime", "getSort", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class SearchResultItem(
        @JsonProperty("coverVerticalUrl") coverVerticalUrl: String,
        @JsonProperty("coverHorizontalUrl") coverHorizontalUrl: String,
        @JsonProperty("name") name: String,
        @JsonProperty("id") id: Number,
        @JsonProperty("domainType") i: Int,
        @JsonProperty("releaseTime") releaseTime: String,
        @JsonProperty("sort") sort: String,
        @JsonProperty("duration") duration: String
    ) {
        val coverHorizontalUrl: String
        val coverVerticalUrl: String
        val domainType: Int
        val duration: String

        /* renamed from: id */
        val id: Number
        val name: String
        val releaseTime: String
        val sort: String
        operator fun component1(): String {
            return coverVerticalUrl
        }

        operator fun component2(): String {
            return coverHorizontalUrl
        }

        operator fun component3(): String {
            return name
        }

        operator fun component4(): Number {
            return id
        }

        operator fun component5(): Int {
            return domainType
        }

        operator fun component6(): String {
            return releaseTime
        }

        operator fun component7(): String {
            return sort
        }

        operator fun component8(): String {
            return duration
        }

        fun copy(
            @JsonProperty("coverVerticalUrl") coverVerticalUrl: String,
            @JsonProperty("coverHorizontalUrl") coverHorizontalUrl: String,
            @JsonProperty("name") name: String,
            @JsonProperty("id") id: Number,
            @JsonProperty("domainType") i: Int,
            @JsonProperty("releaseTime") releaseTime: String,
            @JsonProperty("sort") sort: String,
            @JsonProperty("duration") duration: String
        ): SearchResultItem {
            Intrinsics.checkNotNullParameter(coverVerticalUrl, "coverVerticalUrl")
            Intrinsics.checkNotNullParameter(coverHorizontalUrl, "coverHorizontalUrl")
            Intrinsics.checkNotNullParameter(name, "name")
            Intrinsics.checkNotNullParameter(id, "id")
            Intrinsics.checkNotNullParameter(releaseTime, "releaseTime")
            Intrinsics.checkNotNullParameter(sort, "sort")
            Intrinsics.checkNotNullParameter(duration, "duration")
            return SearchResultItem(
                coverVerticalUrl,
                coverHorizontalUrl,
                name,
                id,
                i,
                releaseTime,
                sort,
                duration
            )
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is SearchResultItem) {
                val searchResultItem = obj as SearchResultItem
                return Intrinsics.areEqual(
                    coverVerticalUrl,
                    searchResultItem.coverVerticalUrl
                ) && Intrinsics.areEqual(
                    coverHorizontalUrl, searchResultItem.coverHorizontalUrl
                ) && Intrinsics.areEqual(
                    name, searchResultItem.name
                ) && Intrinsics.areEqual(
                    id,
                    searchResultItem.id
                ) && domainType == searchResultItem.domainType && Intrinsics.areEqual(
                    releaseTime, searchResultItem.releaseTime
                ) && Intrinsics.areEqual(
                    sort, searchResultItem.sort
                ) && Intrinsics.areEqual(duration, searchResultItem.duration)
            }
            return false
        }

        override fun hashCode(): Int {
            return ((((((coverVerticalUrl.hashCode() * 31 + coverHorizontalUrl.hashCode()) * 31 + name.hashCode()) * 31 + id.hashCode()) * 31 + domainType) * 31 + releaseTime.hashCode()) * 31 + sort.hashCode()) * 31 + duration.hashCode()
        }

        override fun toString(): String {
            return "SearchResultItem(coverVerticalUrl=" + coverVerticalUrl + ", coverHorizontalUrl=" + coverHorizontalUrl + ", name=" + name + ", id=" + id + ", domainType=" + domainType + ", releaseTime=" + releaseTime + ", sort=" + sort + ", duration=" + duration + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(coverVerticalUrl, "coverVerticalUrl")
            Intrinsics.checkNotNullParameter(coverHorizontalUrl, "coverHorizontalUrl")
            Intrinsics.checkNotNullParameter(name, "name")
            Intrinsics.checkNotNullParameter(id, "id")
            Intrinsics.checkNotNullParameter(releaseTime, "releaseTime")
            Intrinsics.checkNotNullParameter(sort, "sort")
            Intrinsics.checkNotNullParameter(duration, "duration")
            this.coverVerticalUrl = coverVerticalUrl
            this.coverHorizontalUrl = coverHorizontalUrl
            this.name = name
            this.id = id
            domainType = i
            this.releaseTime = releaseTime
            this.sort = sort
            this.duration = duration
        }
    }

    /* compiled from: LokLokProvider.kt */
    @Metadata(
        m108d1 = ["\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\u000cJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\tHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012¨\u0006$"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/LokLokProvider\$SearchPageItem;", "", "image", "", "introduction", "name", "contentId", "", "domainType", "", "releaseTime", "sort", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;ILjava/lang/String;Ljava/lang/String;)V", "getContentId", "()Ljava/lang/Number;", "getDomainType", "()I", "getImage", "()Ljava/lang/String;", "getIntroduction", "getName", "getReleaseTime", "getSort", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class SearchPageItem(
        @JsonProperty("image") image: String,
        @JsonProperty("introduction") introduction: String,
        @JsonProperty("name") name: String,
        @JsonProperty("contentId") contentId: Number,
        @JsonProperty("domainType") i: Int,
        @JsonProperty("releaseTime") releaseTime: String,
        @JsonProperty("sort") sort: String
    ) {
        val contentId: Number
        val domainType: Int
        val image: String
        val introduction: String
        val name: String
        val releaseTime: String
        val sort: String
        operator fun component1(): String {
            return image
        }

        operator fun component2(): String {
            return introduction
        }

        operator fun component3(): String {
            return name
        }

        operator fun component4(): Number {
            return contentId
        }

        operator fun component5(): Int {
            return domainType
        }

        operator fun component6(): String {
            return releaseTime
        }

        operator fun component7(): String {
            return sort
        }

        fun copy(
            @JsonProperty("image") image: String,
            @JsonProperty("introduction") introduction: String,
            @JsonProperty("name") name: String,
            @JsonProperty("contentId") contentId: Number,
            @JsonProperty("domainType") i: Int,
            @JsonProperty("releaseTime") releaseTime: String,
            @JsonProperty("sort") sort: String
        ): SearchPageItem {
            Intrinsics.checkNotNullParameter(image, "image")
            Intrinsics.checkNotNullParameter(introduction, "introduction")
            Intrinsics.checkNotNullParameter(name, "name")
            Intrinsics.checkNotNullParameter(contentId, "contentId")
            Intrinsics.checkNotNullParameter(releaseTime, "releaseTime")
            Intrinsics.checkNotNullParameter(sort, "sort")
            return SearchPageItem(image, introduction, name, contentId, i, releaseTime, sort)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is SearchPageItem) {
                val searchPageItem = obj as SearchPageItem
                return Intrinsics.areEqual(image, searchPageItem.image) && Intrinsics.areEqual(
                    introduction, searchPageItem.introduction
                ) && Intrinsics.areEqual(
                    name, searchPageItem.name
                ) && Intrinsics.areEqual(
                    contentId,
                    searchPageItem.contentId
                ) && domainType == searchPageItem.domainType && Intrinsics.areEqual(
                    releaseTime, searchPageItem.releaseTime
                ) && Intrinsics.areEqual(
                    sort, searchPageItem.sort
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return (((((image.hashCode() * 31 + introduction.hashCode()) * 31 + name.hashCode()) * 31 + contentId.hashCode()) * 31 + domainType) * 31 + releaseTime.hashCode()) * 31 + sort.hashCode()
        }

        override fun toString(): String {
            return "SearchPageItem(image=" + image + ", introduction=" + introduction + ", name=" + name + ", contentId=" + contentId + ", domainType=" + domainType + ", releaseTime=" + releaseTime + ", sort=" + sort + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(image, "image")
            Intrinsics.checkNotNullParameter(introduction, "introduction")
            Intrinsics.checkNotNullParameter(name, "name")
            Intrinsics.checkNotNullParameter(contentId, "contentId")
            Intrinsics.checkNotNullParameter(releaseTime, "releaseTime")
            Intrinsics.checkNotNullParameter(sort, "sort")
            this.image = image
            this.introduction = introduction
            this.name = name
            this.contentId = contentId
            domainType = i
            this.releaseTime = releaseTime
            this.sort = sort
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                searchPageItem: SearchPageItem,
                str: String,
                str2: String,
                str3: String,
                number: Number,
                i: Int,
                str4: String,
                str5: String,
                i2: Int,
                obj: Object?
            ): SearchPageItem {
                var str = str
                var str2 = str2
                var str3 = str3
                var number = number
                var i = i
                var str4 = str4
                var str5 = str5
                if (i2 and 1 != 0) {
                    str = searchPageItem.image
                }
                if (i2 and 2 != 0) {
                    str2 = searchPageItem.introduction
                }
                val str6 = str2
                if (i2 and 4 != 0) {
                    str3 = searchPageItem.name
                }
                val str7 = str3
                if (i2 and 8 != 0) {
                    number = searchPageItem.contentId
                }
                val number2 = number
                if (i2 and 16 != 0) {
                    i = searchPageItem.domainType
                }
                val i3 = i
                if (i2 and 32 != 0) {
                    str4 = searchPageItem.releaseTime
                }
                val str8 = str4
                if (i2 and 64 != 0) {
                    str5 = searchPageItem.sort
                }
                return searchPageItem.copy(str, str6, str7, number2, i3, str8, str5)
            }
        }
    }

    fun toMovieSearchResponse(
        recommendContentVOItem: RecommendContentVOItem,
        cardType: CardType?
    ): MovieSearchResponse {
        Intrinsics.checkNotNullParameter(recommendContentVOItem, "<this>")
        val title = recommendContentVOItem.title
        return MovieSearchResponse(
            title,
            recommendContentVOItem.id + Typography.amp + recommendContentVOItem.category,
            name,
            TvType.Movie,
            fixUrlImageHomeLokLok(recommendContentVOItem.imageUrl, cardType),
            null,
            Integer.valueOf(recommendContentVOItem.id.intValue()),
            null,
            null,
            384,
            null
        )
    }

    private fun fixUrlImageHomeLokLok(str: String, cardType: CardType?): String {
        val i =
            if (cardType == null) -1 else WhenMappings.`$EnumSwitchMapping$0`[cardType.ordinal()]
        val str2 =
            if (i == 1 || i == 2) "?imageMogr2/format/webp" else "?imageView2/1/w/380/h/532/format/webp/interlace/1/ignore-error/1/q/90!/format/webp"
        return str + str2
    }

    private fun fixUrlImageLokLok(str: String, z: Boolean): String {
        val sb = StringBuilder()
        sb.append(str)
        sb.append(if (z) "?imageMogr2/gravity/Center/thumbnail/750x/crop/750x421/interlace/1/background/Z3JheQ==/ignore-error/1" else "?imageView2/1/w/380/h/532/format/webp/interlace/1/ignore-error/1/q/90!/format/webp")
        return sb.toString()
    }

    /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Type inference failed for: r4v17, types: [java.util.List] */
    fun toHomePageList(homeResponse: HomeResponse): List<HomePageList> {
        var cardType: CardType
        Intrinsics.checkNotNullParameter(homeResponse, "<this>")
        val recommendItems = homeResponse.data.recommendItems
        if (recommendItems == null || recommendItems.isEmpty()) {
            return CollectionsKt.emptyList<Any>()
        }
        val arrayList = ArrayList()
        for (obj in homeResponse.data.recommendItems) {
            if (Intrinsics.areEqual(obj.homeSectionType, "SINGLE_ALBUM")) {
                arrayList.add(obj)
            }
        }
        val arrayList2: ArrayList<RecommendItem> = arrayList
        val arrayList3 = ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10))
        for (recommendItem in arrayList2) {
            cardType =
                if (recommendItem.getHomeSectionId() != null && recommendItem.getHomeSectionId()
                        .intValue() === 80375
                ) {
                    HomeParentItemAdapter.CardType.BIG_CARD
                } else if (recommendItem.getCoverType() != null && recommendItem.getCoverType()
                        .intValue() === 0
                ) {
                    HomeParentItemAdapter.CardType.LONG_WIDTH_CARD
                } else if (recommendItem.getHomeSectionId() != null && recommendItem.getHomeSectionId()
                        .intValue() === 80393
                ) {
                    HomeParentItemAdapter.CardType.TOP_CARD
                } else {
                    HomeParentItemAdapter.CardType.NORMAL_CARD
                }
            val cardType2: CardType = cardType
            val recommendContentVOList = recommendItem.recommendContentVOList
            val arrayList4 =
                ArrayList(CollectionsKt.collectionSizeOrDefault(recommendContentVOList, 10))
            for (recommendContentVOItem in recommendContentVOList) {
                arrayList4.add(toMovieSearchResponse(recommendContentVOItem, cardType2))
            }
            val arrayList5: ArrayList = arrayList4
            val subList: ArrayList =
                if (cardType2 !== HomeParentItemAdapter.CardType.TOP_CARD || arrayList5.size() <= 9) arrayList5 else arrayList5.subList(
                    0,
                    9
                )
            val regex = Regex("LokLok")
            val replace: String = Regex("Loklok").replace(
                Regex("LOKLOK").replace(
                    regex.replace(
                        recommendItem.homeSectionName,
                        name
                    ), name
                ), name
            )
            arrayList3.add(
                HomePageList(
                    replace,
                    subList,
                    recommendItem.refId.toString() + "&0",
                    name,
                    cardType2
                )
            )
        }
        return arrayList3
    }

    fun toMovieSearchResponse(
        searchResultItem: SearchResultItem,
        nameApi: String?
    ): MovieSearchResponse {
        Intrinsics.checkNotNullParameter(searchResultItem, "<this>")
        Intrinsics.checkNotNullParameter(nameApi, "nameApi")
        val name = searchResultItem.name
        val sb = StringBuilder()
        sb.append(searchResultItem.id)
        sb.append(Typography.amp)
        sb.append(searchResultItem.domainType)
        return MovieSearchResponse(
            name,
            sb.toString(),
            nameApi,
            TvType.Movie,
            LokLokProvider.Companion.`fixUrlImageLokLok$default`(
                this,
                searchResultItem.coverVerticalUrl,
                false,
                2,
                null
            ),
            null,
            Integer.valueOf(searchResultItem.id.intValue()),
            null,
            null,
            384,
            null
        )
    }

    fun toListSearchResponse(lokLokSearchResponse: LokLokSearchResponse): List<SearchResponse> {
        Intrinsics.checkNotNullParameter(lokLokSearchResponse, "<this>")
        val searchResults = lokLokSearchResponse.data.searchResults
        if (!(searchResults == null || searchResults.isEmpty())) {
            val searchResults2 = lokLokSearchResponse.data.searchResults
            val arrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(searchResults2, 10))
            for (searchResultItem in searchResults2) {
                arrayList.add(toMovieSearchResponse(searchResultItem, name))
            }
            return arrayList
        }
        return CollectionsKt.emptyList<Any>()
    }

    fun toMovieSearchResponse(likeList: LikeList, nameApi: String?): MovieSearchResponse {
        Intrinsics.checkNotNullParameter(likeList, "<this>")
        Intrinsics.checkNotNullParameter(nameApi, "nameApi")
        var name: String = likeList.getName()
        if (name == null) {
            name = ""
        }
        val str = name
        return MovieSearchResponse(
            str,
            likeList.getId() + Typography.amp + likeList.getCategory(),
            nameApi,
            TvType.Movie,
            LokLokProvider.Companion.`fixUrlImageLokLok$default`(
                this,
                likeList.getCoverVerticalUrl(),
                false,
                2,
                null
            ),
            null,
            null,
            null,
            null,
            448,
            null
        )
    }

    fun toEpisode(episodeVo: EpisodeVo, idMovie: String, category: String): Episode {
        Intrinsics.checkNotNullParameter(episodeVo, "<this>")
        Intrinsics.checkNotNullParameter(idMovie, "idMovie")
        Intrinsics.checkNotNullParameter(category, "category")
        val name: String = episodeVo.getName()
        return Episode(
            idMovie + Typography.amp + category + Typography.amp.code + Gson().toJson(
                episodeVo
            ), name, 1, null, null, null, null, null, 184, null
        )
    }

    fun toMovieSearchResponse(
        searchPageItem: SearchPageItem,
        nameApi: String?
    ): MovieSearchResponse {
        Intrinsics.checkNotNullParameter(searchPageItem, "<this>")
        Intrinsics.checkNotNullParameter(nameApi, "nameApi")
        val name = searchPageItem.name
        val sb = StringBuilder()
        sb.append(searchPageItem.contentId)
        sb.append(Typography.amp)
        sb.append(searchPageItem.domainType)
        return MovieSearchResponse(
            name,
            sb.toString(),
            nameApi,
            TvType.Movie,
            LokLokProvider.Companion.`fixUrlImageLokLok$default`(
                this,
                searchPageItem.image,
                false,
                2,
                null
            ),
            null,
            Integer.valueOf(searchPageItem.contentId.intValue()),
            null,
            null,
            384,
            null
        )
    }

    fun toListTvShowPage(homeCategoryResponse: HomeCategoryResponse, nameApi: String?): List<Page> {
        var arrayList: ArrayList?
        var obj: Object?
        var items: List<ItemCategory>
        var z: Boolean
        Intrinsics.checkNotNullParameter(homeCategoryResponse, "<this>")
        Intrinsics.checkNotNullParameter(nameApi, "nameApi")
        val arrayList2 = ArrayList()
        val data = homeCategoryResponse.data
        val arrayList3 = ArrayList(CollectionsKt.collectionSizeOrDefault(data, 10))
        for (dataCategory in data) {
            if (dataCategory.id == 2) {
                val it: Iterator<T> = dataCategory.screeningItems.iterator()
                while (true) {
                    arrayList = null
                    if (!it.hasNext()) {
                        obj = null
                        break
                    }
                    obj = it.next()
                    if ((obj as ScreenItem?)!!.id == 5) {
                        z = true
                        continue
                    } else {
                        z = false
                        continue
                    }
                    if (z) {
                        break
                    }
                }
                val screenItem = obj as ScreenItem?
                if (screenItem != null && screenItem.items.also { items = it } != null) {
                    val arrayList4 = ArrayList()
                    for (obj2 in items) {
                        if (!StringsKt.isBlank(obj2.params)) {
                            arrayList4.add(obj2)
                        }
                    }
                    arrayList = arrayList4
                }
                if (arrayList != null) {
                    val arrayList5: ArrayList<ItemCategory>? = arrayList
                    val arrayList6 =
                        ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10))
                    for (itemCategory in arrayList5) {
                        arrayList6.add(
                            Page(
                                itemCategory.name,
                                "TV,SETI,MINISERIES,VARIETY,TALK,COMIC,DOCUMENTARY*" + itemCategory.params + '*',
                                false,
                                nameApi,
                                null,
                                16,
                                null
                            )
                        )
                    }
                    arrayList2.addAll(arrayList6)
                }
            }
            arrayList3.add(Unit.INSTANCE)
        }
        return arrayList2
    }

    fun toListMoviesPage(homeCategoryResponse: HomeCategoryResponse, nameApi: String?): List<Page> {
        var arrayList: ArrayList?
        var obj: Object?
        var items: List<ItemCategory>
        var z: Boolean
        Intrinsics.checkNotNullParameter(homeCategoryResponse, "<this>")
        Intrinsics.checkNotNullParameter(nameApi, "nameApi")
        val arrayList2 = ArrayList()
        val data = homeCategoryResponse.data
        val arrayList3 = ArrayList(CollectionsKt.collectionSizeOrDefault(data, 10))
        for (dataCategory in data) {
            if (dataCategory.id == 1) {
                val it: Iterator<T> = dataCategory.screeningItems.iterator()
                while (true) {
                    arrayList = null
                    if (!it.hasNext()) {
                        obj = null
                        break
                    }
                    obj = it.next()
                    if ((obj as ScreenItem?)!!.id == 2) {
                        z = true
                        continue
                    } else {
                        z = false
                        continue
                    }
                    if (z) {
                        break
                    }
                }
                val screenItem = obj as ScreenItem?
                if (screenItem != null && screenItem.items.also { items = it } != null) {
                    val arrayList4 = ArrayList()
                    for (obj2 in items) {
                        if (!StringsKt.isBlank(obj2.params)) {
                            arrayList4.add(obj2)
                        }
                    }
                    arrayList = arrayList4
                }
                if (arrayList != null) {
                    val arrayList5: ArrayList<ItemCategory>? = arrayList
                    val arrayList6 =
                        ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10))
                    for (itemCategory in arrayList5) {
                        arrayList6.add(
                            Page(
                                itemCategory.name,
                                "MOVIE,TVSPECIAL*" + itemCategory.params + '*',
                                false,
                                nameApi,
                                null,
                                16,
                                null
                            )
                        )
                    }
                    arrayList2.addAll(arrayList6)
                }
            }
            arrayList3.add(Unit.INSTANCE)
        }
        return arrayList2
    }

    companion object {
        val Companion = Companion(null)
        private val HEADER_DEFAULT: Map<String, String> = MapsKt.mapOf(
            TuplesKt.m100to<Any, Any>("lang", "vi"),
            TuplesKt.m100to<Any, Any>("Content-Type", AbstractSpiCall.ACCEPT_JSON_VALUE),
            TuplesKt.m100to<Any, Any>("versioncode", "11"),
            TuplesKt.m100to<Any, Any>("clienttype", "ios_jike_default")
        )
        const val TOKEN_PLAY =
            "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJnb29nbGVJZCI6IjEwNzY4NTQ0ODc2ODgwMTUxOTYxOCIsIm5pY2tOYW1lIjoiVGl0dGlrOTg3MjM3OTIiLCJjdXJyZW50VGltZU1pbGxpcyI6MTY0NTgwNDE2NzM0NywiZXhwIjoxNjQ4Mzk2MTY3LCJ1c2VySWQiOjI3MjIyNH0.kavvmPA_5XphtK2dM4CLil_OSrVYZLHIvCH76lI8CFw"
        const val URL_GET_CATEGORY = "https://ga-mobile-api.loklok.tv/cms/web/pc/search/list"
        const val URL_GET_DETAIL = "https://ga-mobile-api.loklok.tv/cms/web/pc/movieDrama/get"
        const val URL_GET_LINK_PLAY =
            "https://ga-mobile-api.loklok.tv/cms/web/pc/movieDrama/getPlayInfo"
        const val URL_GET_MOVIE_IN_PAGE = "https://ga-mobile-api.loklok.tv/cms/web/pc/album/detail"
        const val URL_ROOT_API = "https://ga-mobile-api.loklok.tv"
        const val URL_SEARCH = "https://ga-mobile-api.loklok.tv/cms/web/pc/search/searchWithKeyWord"
        const val URL_SEARCH_DEFAULT = "https://ga-mobile-api.loklok.tv/cms/web/pc/search/search"
        fun  /* synthetic */`toMovieSearchResponse$default`(
            lokLokProvider: LokLokProvider,
            recommendContentVOItem: RecommendContentVOItem?,
            cardType: CardType?,
            i: Int,
            obj: Object?
        ): MovieSearchResponse {
            var cardType: CardType? = cardType
            if (i and 1 != 0) {
                cardType = HomeParentItemAdapter.CardType.NORMAL_CARD
            }
            return lokLokProvider.toMovieSearchResponse(recommendContentVOItem, cardType)
        }

        fun  /* synthetic */`fixUrlImageHomeLokLok$default`(
            lokLokProvider: LokLokProvider,
            str: String,
            cardType: CardType?,
            i: Int,
            obj: Object?
        ): String {
            var cardType: CardType? = cardType
            if (i and 2 != 0) {
                cardType = HomeParentItemAdapter.CardType.NORMAL_CARD
            }
            return lokLokProvider.fixUrlImageHomeLokLok(str, cardType)
        }

        fun  /* synthetic */`fixUrlImageLokLok$default`(
            lokLokProvider: LokLokProvider,
            str: String,
            z: Boolean,
            i: Int,
            obj: Object?
        ): String {
            var z = z
            if (i and 2 != 0) {
                z = false
            }
            return lokLokProvider.fixUrlImageLokLok(str, z)
        }
    }
}