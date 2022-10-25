package com.lagradost.cloudstream3.movieproviders

import org.jsoup.nodes.Element
import java.util.List
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: FaselHDProvider.kt */
@Metadata(
    m108d1 = ["\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010\u001a\u001a\u00020\u001bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010 JI\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020'0%H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010*J\u001f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010.\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010 J\u0013\u0010/\u001a\u0004\u0018\u000100*\u00020\bH\u0002¢\u0006\u0002\u00101J\u000e\u00102\u001a\u0004\u0018\u00010-*\u000203H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u000cR\u001a\u0010\r\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\u000cR\u001a\u0010\u0010\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\u000cR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/FaselHDProvider;", "Lcom/lagradost/cloudstream3/MainAPI;", "()V", "hasMainPage", "", "getHasMainPage", "()Z", "lang", "", "getLang", "()Ljava/lang/String;", "setLang", "(Ljava/lang/String;)V", "mainUrl", "getMainUrl", "setMainUrl", "name", "getName", "setName", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "usesWebView", "getUsesWebView", "getMainPage", "Lcom/lagradost/cloudstream3/HomePageResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "", "Lcom/lagradost/cloudstream3/SearchResponse;", "query", "getIntFromText", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "toSearchResponse", "Lorg/jsoup/nodes/Element;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class FaselHDProvider : MainAPI() {
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val usesWebView = false
    private var lang = "ar"

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var mainUrl = "https://faselhd.io"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var name = "FaselHD"
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
    val supportedTypes: Set<TvType> = SetsKt.setOf<Object>(
        *arrayOf<TvType>(
            TvType.TvSeries,
            TvType.Movie,
            TvType.AsianDrama,
            TvType.Anime
        ) as Array<Object>
    )

    @Override // com.lagradost.cloudstream3.MainAPI
    override fun getLang(): String? {
        return lang
    }

    @Override // com.lagradost.cloudstream3.MainAPI
    override fun setLang(str: String) {
        Intrinsics.checkNotNullParameter(str, "<set-?>")
        lang = str
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun getIntFromText(str: String?): Integer? {
        var groupValues: List<String?>?
        var str2: String?
        val `find$default` = Regex.`find$default`(Regex("\\d+"), str, 0, 2, null)
        return if (`find$default` == null || `find$default`.groupValues.also {
                groupValues = it
            } == null || CollectionsKt.firstOrNull<Any>(groupValues as List<Object?>?) as String?. also {
                str2 = it
            } == null) {
            null
        } else StringsKt.toIntOrNull(str2)
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun toSearchResponse(element: Element): SearchResponse? {
        var text: String?
        val attr: String =
            element.select("div.postDiv a").attr(ShareConstants.WEB_DIALOG_PARAM_HREF)
                ?: return null
        var attr2: String = element.select("div.postDiv a div img").attr("data-src")
        if (attr2 == null) {
            attr2 = element.select("div.postDiv a div img").attr("src")
        }
        val str = attr2
        val title: String = element.select("div.postDiv a div img").attr("alt")
        val first: Element = element.select(".quality").first()
        val replace: String? = if (first == null || first.text()
                .also { text = it } == null
        ) null else Regex("1080p |-").replace(text, "")
        Intrinsics.checkNotNullExpressionValue(title, "title")
        return MovieSearchResponse(
            Regex("الموسم الأول|برنامج|فيلم|مترجم|اون لاين|مسلسل|مشاهدة|انمي|أنمي").replace(
                title,
                ""
            ),
            attr,
            name,
            if (StringsKt.`contains$default`(
                    title as CharSequence,
                    "فيلم" as CharSequence,
                    false,
                    2,
                    null as Object?
                )
            ) TvType.Movie else TvType.TvSeries,
            str,
            null,
            null,
            MainAPIKt.getQualityFromString(replace),
            null,
            256,
            null
        )
    }

    @Override // com.lagradost.cloudstream3.MainAPI
    override fun getMainPage(continuation: Continuation<in HomePageResponse?>?): Object? {
        return HomePageResponse(
            ParCollections.apmap(
                CollectionsKt.listOf<Object>(
                    *arrayOf<Tuples<*, *>>(
                        Tuples<Any?, Any?>(
                            "Movies", mainUrl + "/all-movies/page/" + RangesKt.random(
                                IntRange(0, 10), Random.Default
                            )
                        ), Tuples<Any?, Any?>(
                            "Series", mainUrl + "/series/page/" + RangesKt.random(
                                IntRange(0, 10), Random.Default
                            )
                        ), Tuples<Any?, Any?>("Top Movies IMDB", "$mainUrl/movies_top_imdb")
                    ) as Array<Object>
                ), `FaselHDProvider$getMainPage$pages$1`(this, null)
            ), null, null, null, null, 30, null
        )
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */ /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun search(
        r20: String?,
        r21: Continuation<in MutableList<out SearchResponse?>?>?
    ): Any {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            boolean r2 = r1 instanceof com.lagradost.cloudstream3.movieproviders.FaselHDProvider$search$1
            if (r2 == 0) goto L18
            r2 = r1
            com.lagradost.cloudstream3.movieproviders.FaselHDProvider$search$1 r2 = (com.lagradost.cloudstream3.movieproviders.FaselHDProvider$search$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r1 = r2.label
            int r1 = r1 - r4
            r2.label = r1
            goto L1d
        L18:
            com.lagradost.cloudstream3.movieproviders.FaselHDProvider$search$1 r2 = new com.lagradost.cloudstream3.movieproviders.FaselHDProvider$search$1
            r2.<init>(r0, r1)
        L1d:
            java.lang.Object r1 = r2.result
            java.lang.Object r15 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r2.label
            r4 = 1
            if (r3 == 0) goto L3a
            if (r3 != r4) goto L32
            java.lang.Object r2 = r2.L$0
            com.lagradost.cloudstream3.movieproviders.FaselHDProvider r2 = (com.lagradost.cloudstream3.movieproviders.FaselHDProvider) r2
            kotlin.ResultKt.throwOnFailure(r1)
            goto L8b
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            kotlin.ResultKt.throwOnFailure(r1)
            r8 = 0
            r9 = 4
            r10 = 0
            java.lang.String r6 = " "
            java.lang.String r7 = "+"
            r5 = r20
            java.lang.String r1 = kotlin.text.StringsKt.replace$default(r5, r6, r7, r8, r9, r10)
            com.lagradost.cloudstream3.utils.Extensions$RequestCustom r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            com.lagradost.nicehttp.Requests r3 = (com.lagradost.nicehttp.Requests) r3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r19.getMainUrl()
            r5.append(r6)
            java.lang.String r6 = "/?s="
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            r17 = 2046(0x7fe, float:2.867E-42)
            r18 = 0
            r2.L$0 = r0
            r2.label = r4
            r4 = r1
            r1 = r15
            r15 = r16
            r16 = r2
            java.lang.Object r2 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18)
            if (r2 != r1) goto L89
            return r1
        L89:
            r1 = r2
            r2 = r0
        L8b:
            com.lagradost.nicehttp.NiceResponse r1 = (com.lagradost.nicehttp.NiceResponse) r1
            org.jsoup.nodes.Document r1 = r1.getDocument()
            java.lang.String r3 = "div[id=\"postList\"] div[class=\"col-xl-2 col-lg-2 col-md-3 col-sm-3\"]"
            org.jsoup.select.Elements r1 = r1.select(r3)
            java.lang.String r3 = "d.select(\"div[id=\\\"postL…-2 col-md-3 col-sm-3\\\"]\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r1 = r1.iterator()
        La9:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Lc4
            java.lang.Object r4 = r1.next()
            org.jsoup.nodes.Element r4 = (org.jsoup.nodes.Element) r4
            java.lang.String r5 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            com.lagradost.cloudstream3.SearchResponse r4 = r2.toSearchResponse(r4)
            if (r4 == 0) goto La9
            r3.add(r4)
            goto La9
        Lc4:
            java.util.List r3 = (java.util.List) r3
            return r3
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.FaselHDProvider.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */ /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */ /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */ /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */ /* JADX WARN: Removed duplicated region for block: B:27:0x00cb  */ /* JADX WARN: Removed duplicated region for block: B:40:0x0148  */ /* JADX WARN: Removed duplicated region for block: B:53:0x019b A[LOOP:2: B:51:0x0195->B:53:0x019b, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:57:0x01ca  */ /* JADX WARN: Removed duplicated region for block: B:62:0x01ee  */ /* JADX WARN: Removed duplicated region for block: B:63:0x020d  */ /* JADX WARN: Removed duplicated region for block: B:74:0x00e9 A[SYNTHETIC] */ /* JADX WARN: Removed duplicated region for block: B:76:0x0166 A[SYNTHETIC] */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun load(r33: String?, r34: Continuation<in LoadResponse?>?): Any {
        /*
            Method dump skipped, instructions count: 760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.FaselHDProvider.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */ /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */ /* JADX WARN: Removed duplicated region for block: B:22:0x00f9 A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:23:0x00fa  */ /* JADX WARN: Removed duplicated region for block: B:27:0x0128  */ /* JADX WARN: Type inference failed for: r3v16, types: [com.lagradost.nicehttp.Requests] */
    @Override // com.lagradost.cloudstream3.MainAPI
            /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */    fun loadLinks(
        r29: String?,
        r30: Boolean,
        r31: Function1<SubtitleFile?, Unit>?,
        r32: Function1<ExtractorLink?, Unit>?,
        r33: Continuation<in Boolean?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.FaselHDProvider.loadLinks(java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
    }
}