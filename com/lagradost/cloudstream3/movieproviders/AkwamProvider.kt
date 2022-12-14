package com.lagradost.cloudstream3.movieproviders

import com.phimhd.Constants
import org.jsoup.nodes.Element
import java.util.Comparator
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: AkwamProvider.kt */
@Metadata(
    m108d1 = ["\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010\u001a\u001a\u00020\u001bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0002\u0010!J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010%JI\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u00042\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020,0*H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010/J\u001f\u00100\u001a\b\u0012\u0004\u0012\u000202012\u0006\u00103\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010%J\u0013\u00104\u001a\u0004\u0018\u00010 *\u00020\bH\u0002¢\u0006\u0002\u00105J\u000c\u00106\u001a\u000207*\u000208H\u0002J\u000e\u00109\u001a\u0004\u0018\u000102*\u000208H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u000cR\u001a\u0010\r\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\u000cR\u001a\u0010\u0010\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\u000cR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006:"],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/AkwamProvider;", "Lcom/lagradost/cloudstream3/MainAPI;", "()V", "hasMainPage", "", "getHasMainPage", "()Z", "lang", "", "getLang", "()Ljava/lang/String;", "setLang", "(Ljava/lang/String;)V", "mainUrl", "getMainUrl", "setMainUrl", "name", "getName", "setName", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "usesWebView", "getUsesWebView", "getMainPage", "Lcom/lagradost/cloudstream3/HomePageResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQualityFromId", "Lcom/lagradost/cloudstream3/utils/Qualities;", "id", "", "(Ljava/lang/Integer;)Lcom/lagradost/cloudstream3/utils/Qualities;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "", "Lcom/lagradost/cloudstream3/SearchResponse;", "query", "getIntFromText", "(Ljava/lang/String;)Ljava/lang/Integer;", "toEpisode", "Lcom/lagradost/cloudstream3/Episode;", "Lorg/jsoup/nodes/Element;", "toSearchResponse", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class AkwamProvider : MainAPI() {
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val usesWebView = false
    private var lang = "ar"

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var mainUrl = "https://akwam.to"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var name = "Akwam"
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
            TvType.Anime,
            TvType.Cartoon
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
    fun toSearchResponse(element: Element): SearchResponse? {
        val attr: String = element.select("a.box").attr(ShareConstants.WEB_DIALOG_PARAM_HREF)
            ?: return null
        if (StringsKt.`contains$default`(
                attr as CharSequence,
                "/games/" as CharSequence,
                false,
                2,
                null as Object?
            ) || StringsKt.`contains$default`(
                attr as CharSequence,
                "/programs/" as CharSequence,
                false,
                2,
                null as Object?
            )
        ) {
            return null
        }
        val select: Elements = element.select("picture > img")
        val title: String = select.attr("alt")
        val attr2: String = select.attr("data-src")
        val text: String = element.select(".badge-secondary").text()
        Intrinsics.checkNotNullExpressionValue(text, "select(\".badge-secondary\").text()")
        val intOrNull: Integer = StringsKt.toIntOrNull(text)
        Intrinsics.checkNotNullExpressionValue(title, "title")
        return MovieSearchResponse(
            title,
            attr,
            name,
            TvType.TvSeries,
            attr2,
            intOrNull,
            null,
            null,
            null,
            384,
            null
        )
    }

    @Override // com.lagradost.cloudstream3.MainAPI
    override fun getMainPage(continuation: Continuation<in HomePageResponse?>?): Object? {
        return HomePageResponse(
            CollectionsKt.sortedWith(
                ParCollections.apmap(
                    CollectionsKt.listOf<Object>(
                        *arrayOf(
                            TuplesKt.m100to<Any, Any>("Movies", "$mainUrl/movies"),
                            TuplesKt.m100to("Series", mainUrl + Constants.KEY_SERIES),
                            TuplesKt.m100to<Any, Any>("Shows", "$mainUrl/shows")
                        ) as Array<Object?>
                    ), `AkwamProvider$getMainPage$pages$1`(this, null)
                ), object : Comparator() {
                    // from class: com.lagradost.cloudstream3.movieproviders.AkwamProvider$getMainPage$$inlined$sortedBy$1
                    @Override // java.util.Comparator
                    fun compare(t: T, t2: T): Int {
                        return ComparisonsKt.compareValues<Comparable<*>>(
                            (t as HomePageList).name,
                            (t2 as HomePageList).name
                        )
                    }
                }), null, null, null, null, 30, null
        )
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */ /* JADX WARN: Removed duplicated region for block: B:21:0x00a4  */
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
            boolean r2 = r1 instanceof com.lagradost.cloudstream3.movieproviders.AkwamProvider$search$1
            if (r2 == 0) goto L18
            r2 = r1
            com.lagradost.cloudstream3.movieproviders.AkwamProvider$search$1 r2 = (com.lagradost.cloudstream3.movieproviders.AkwamProvider$search$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r1 = r2.label
            int r1 = r1 - r4
            r2.label = r1
            goto L1d
        L18:
            com.lagradost.cloudstream3.movieproviders.AkwamProvider$search$1 r2 = new com.lagradost.cloudstream3.movieproviders.AkwamProvider$search$1
            r2.<init>(r0, r1)
        L1d:
            java.lang.Object r1 = r2.result
            java.lang.Object r15 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r2.label
            r4 = 1
            if (r3 == 0) goto L3a
            if (r3 != r4) goto L32
            java.lang.Object r2 = r2.L$0
            com.lagradost.cloudstream3.movieproviders.AkwamProvider r2 = (com.lagradost.cloudstream3.movieproviders.AkwamProvider) r2
            kotlin.ResultKt.throwOnFailure(r1)
            goto L80
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            kotlin.ResultKt.throwOnFailure(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r19.getMainUrl()
            r1.append(r3)
            java.lang.String r3 = "/search?q="
            r1.append(r3)
            r3 = r20
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.lagradost.cloudstream3.utils.Extensions$RequestCustom r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            com.lagradost.nicehttp.Requests r3 = (com.lagradost.nicehttp.Requests) r3
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
            if (r2 != r1) goto L7e
            return r1
        L7e:
            r1 = r2
            r2 = r0
        L80:
            com.lagradost.nicehttp.NiceResponse r1 = (com.lagradost.nicehttp.NiceResponse) r1
            org.jsoup.nodes.Document r1 = r1.getDocument()
            java.lang.String r3 = "div.col-lg-auto"
            org.jsoup.select.Elements r1 = r1.select(r3)
            java.lang.String r3 = "doc.select(\"div.col-lg-auto\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r1 = r1.iterator()
        L9e:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Lb9
            java.lang.Object r4 = r1.next()
            org.jsoup.nodes.Element r4 = (org.jsoup.nodes.Element) r4
            java.lang.String r5 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            com.lagradost.cloudstream3.SearchResponse r4 = r2.toSearchResponse(r4)
            if (r4 == 0) goto L9e
            r3.add(r4)
            goto L9e
        Lb9:
            java.util.List r3 = (java.util.List) r3
            return r3
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.AkwamProvider.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
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

    private fun toEpisode(element: Element): Episode {
        val select: Elements = element.select("a.text-white")
        return MainAPIKt.newEpisode<Any>(
            this,
            select.attr(ShareConstants.WEB_DIALOG_PARAM_HREF),
            `AkwamProvider$toEpisode$1`(
                select.text(),
                this,
                element.select("picture > img").attr("src"),
                element.select("p.entry-date").text()
            )
        )
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x029e  */ /* JADX WARN: Removed duplicated region for block: B:101:0x02c5  */ /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:125:0x00dd A[SYNTHETIC] */ /* JADX WARN: Removed duplicated region for block: B:126:0x011f A[SYNTHETIC] */ /* JADX WARN: Removed duplicated region for block: B:130:0x01ff A[SYNTHETIC] */ /* JADX WARN: Removed duplicated region for block: B:132:0x01bd A[SYNTHETIC] */ /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */ /* JADX WARN: Removed duplicated region for block: B:21:0x00bd  */ /* JADX WARN: Removed duplicated region for block: B:35:0x0104  */ /* JADX WARN: Removed duplicated region for block: B:47:0x0167  */ /* JADX WARN: Removed duplicated region for block: B:48:0x016e  */ /* JADX WARN: Removed duplicated region for block: B:52:0x0194 A[LOOP:2: B:50:0x018e->B:52:0x0194, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:56:0x01c3  */ /* JADX WARN: Removed duplicated region for block: B:76:0x0225  */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun load(r43: String?, r44: Continuation<in LoadResponse?>?): Any {
        /*
            Method dump skipped, instructions count: 849
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.AkwamProvider.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    private fun getQualityFromId(num: Integer?): Qualities {
        return if (num != null && num.intValue() === 2) Qualities.P360 else if (num != null && num.intValue() === 3) Qualities.P480 else if (num != null && num.intValue() === 4) Qualities.P720 else if (num != null && num.intValue() === 5) Qualities.P1080 else Qualities.Unknown
    }

    /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */ /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */ /* JADX WARN: Removed duplicated region for block: B:23:0x00db  */ /* JADX WARN: Removed duplicated region for block: B:35:0x01f5  */ /* JADX WARN: Removed duplicated region for block: B:40:0x028a  */ /* JADX WARN: Type inference failed for: r3v14, types: [java.util.Collection] */ /* JADX WARN: Type inference failed for: r6v4 */ /* JADX WARN: Type inference failed for: r6v5 */ /* JADX WARN: Type inference failed for: r6v8, types: [java.util.Collection] */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0240 -> B:39:0x0241). Please submit an issue!!! */
    @Override // com.lagradost.cloudstream3.MainAPI
            /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */    fun loadLinks(
        r34: String?,
        r35: Boolean,
        r36: Function1<SubtitleFile?, Unit>?,
        r37: Function1<ExtractorLink?, Unit>?,
        r38: Continuation<in Boolean?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 657
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.AkwamProvider.loadLinks(java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
    }
}