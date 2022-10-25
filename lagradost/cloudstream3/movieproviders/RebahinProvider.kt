package com.lagradost.cloudstream3.movieproviders

import com.google.firebase.messaging.Constants
import org.jsoup.nodes.Element
import java.util.ArrayList
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: RebahinProvider.kt */
@Metadata(
    m108d1 = ["\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u000689:;<=B\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010\u001a\u001a\u00020\u001bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJA\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\n2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001e0!2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001e0!H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010%JQ\u0010&\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010'\u001a\u00020\n2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001e0!2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001e0!H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010(J\u0019\u0010)\u001a\u00020*2\u0006\u0010\u001f\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010+JI\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u00042\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001e0!2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001e0!H\u0096@ø\u0001\u0000¢\u0006\u0002\u00101J\u001f\u00102\u001a\b\u0012\u0004\u0012\u000204032\u0006\u00105\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010+J\u000c\u00106\u001a\u000204*\u000207H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u000c\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000c\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000c\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006>"],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/RebahinProvider;", "Lcom/lagradost/cloudstream3/MainAPI;", "()V", "hasDownloadSupport", "", "getHasDownloadSupport", "()Z", "hasMainPage", "getHasMainPage", "lang", "", "getLang", "()Ljava/lang/String;", "setLang", "(Ljava/lang/String;)V", "mainUrl", "getMainUrl", "setMainUrl", "name", "getName", "setName", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "getMainPage", "Lcom/lagradost/cloudstream3/HomePageResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invokeKotakAjairSource", "", "url", "subCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "sourceCallback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invokeLokalSource", "ref", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLinks", "data", "isCasting", "subtitleCallback", "callback", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "", "Lcom/lagradost/cloudstream3/SearchResponse;", "query", "toSearchResult", "Lorg/jsoup/nodes/Element;", "Captions", "Data", "Player", "ResponseKotakAjair", "ResponseLocal", "Tracks", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class RebahinProvider : MainAPI() {
    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var mainUrl = "http://167.88.14.149"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var name = "Rebahin"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasMainPage = true
    private var lang = "id"

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasDownloadSupport = true

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val supportedTypes: Set<TvType> = SetsKt.setOf<Object>(
        *arrayOf<TvType>(
            TvType.Movie,
            TvType.TvSeries,
            TvType.Anime,
            TvType.AsianDrama
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

    /* JADX WARN: Can't wrap try/catch for region: R(14:9|(3:10|11|12)|(1:13)|14|(3:17|18|15)|48|49|50|51|52|53|23|24|(7:26|27|28|29|30|31|(1:33)(13:35|13|14|(1:15)|48|49|50|51|52|53|23|24|(2:42|(2:44|45)(2:46|47))(0)))(0)) */ /* JADX WARN: Can't wrap try/catch for region: R(7:26|27|28|29|30|31|(1:33)(13:35|13|14|(1:15)|48|49|50|51|52|53|23|24|(2:42|(2:44|45)(2:46|47))(0))) */ /* JADX WARN: Code restructure failed: missing block: B:39:0x01d5, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01d9, code lost:
        r14 = r15;
        r15 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01dc, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01dd, code lost:
        r14 = r25;
        r15 = r26;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */ /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */ /* JADX WARN: Removed duplicated region for block: B:21:0x0103  */ /* JADX WARN: Removed duplicated region for block: B:50:0x01f0  */ /* JADX WARN: Removed duplicated region for block: B:64:0x01a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0174 -> B:58:0x017a). Please submit an issue!!! */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x01e7 -> B:49:0x01ec). Please submit an issue!!! */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun getMainPage(r29: Continuation<in HomePageResponse?>?): Any? {
        /*
            Method dump skipped, instructions count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.RebahinProvider.getMainPage(kotlin.coroutines.Continuation):java.lang.Object")
    }

    private fun toSearchResult(element: Element): SearchResponse {
        val selectFirst: Element = element.selectFirst("span.mli-info > h2")
        Intrinsics.checkNotNull(selectFirst)
        val text: String = selectFirst.text()
        Intrinsics.checkNotNullExpressionValue(
            text,
            "this.selectFirst(\"span.mli-info > h2\")!!.text()"
        )
        val obj: String = StringsKt.trim(text as CharSequence).toString()
        val selectFirst2: Element = element.selectFirst("a")
        Intrinsics.checkNotNull(selectFirst2)
        val href: String = selectFirst2.attr(ShareConstants.WEB_DIALOG_PARAM_HREF)
        val select: Elements = element.select("span.mli-quality")
        Intrinsics.checkNotNullExpressionValue(select, "this.select(\"span.mli-quality\")")
        if ((if (select.isEmpty() xor true) TvType.Movie else TvType.TvSeries) === TvType.Movie) {
            val attr: String = element.select("img").attr("src")
            val text2: String = element.select("span.mli-quality").text()
            Intrinsics.checkNotNullExpressionValue(
                text2,
                "this.select(\"span.mli-quality\").text()"
            )
            val qualityFromString: SearchQuality =
                MainAPIKt.getQualityFromString(StringsKt.trim(text2 as CharSequence).toString())
            Intrinsics.checkNotNullExpressionValue(href, "href")
            return MainAPIKt.`newMovieSearchResponse$default`(
                this,
                obj,
                href,
                TvType.Movie,
                false,
                `RebahinProvider$toSearchResult$1`(attr, qualityFromString),
                8,
                null
            )
        }
        var attr2: String = element.select("img").attr("src")
        if (attr2.length() === 0) {
            attr2 = element.select("img").attr("data-original")
        }
        val text3: String = element.select("div.mli-eps > span").text()
        Intrinsics.checkNotNullExpressionValue(text3, "this.select(\"div.mli-eps > span\").text()")
        val intOrNull: Integer = StringsKt.toIntOrNull(Regex("[^0-9]").replace(text3, ""))
        Intrinsics.checkNotNullExpressionValue(href, "href")
        return MainAPIKt.`newAnimeSearchResponse$default`(
            this,
            obj,
            href,
            TvType.TvSeries,
            false,
            `RebahinProvider$toSearchResult$2`(attr2, intOrNull),
            8,
            null
        )
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */ /* JADX WARN: Removed duplicated region for block: B:21:0x00aa A[LOOP:0: B:19:0x00a4->B:21:0x00aa, LOOP_END] */
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
            boolean r2 = r1 instanceof com.lagradost.cloudstream3.movieproviders.RebahinProvider$search$1
            if (r2 == 0) goto L18
            r2 = r1
            com.lagradost.cloudstream3.movieproviders.RebahinProvider$search$1 r2 = (com.lagradost.cloudstream3.movieproviders.RebahinProvider$search$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r1 = r2.label
            int r1 = r1 - r4
            r2.label = r1
            goto L1d
        L18:
            com.lagradost.cloudstream3.movieproviders.RebahinProvider$search$1 r2 = new com.lagradost.cloudstream3.movieproviders.RebahinProvider$search$1
            r2.<init>(r0, r1)
        L1d:
            java.lang.Object r1 = r2.result
            java.lang.Object r15 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r2.label
            r4 = 1
            if (r3 == 0) goto L3a
            if (r3 != r4) goto L32
            java.lang.Object r2 = r2.L$0
            com.lagradost.cloudstream3.movieproviders.RebahinProvider r2 = (com.lagradost.cloudstream3.movieproviders.RebahinProvider) r2
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
            java.lang.String r3 = "/?s="
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
            java.lang.String r3 = "div.ml-item"
            org.jsoup.select.Elements r1 = r1.select(r3)
            java.lang.String r3 = "document.select(\"div.ml-item\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r4)
            r3.<init>(r4)
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r1 = r1.iterator()
        La4:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Lbd
            java.lang.Object r4 = r1.next()
            org.jsoup.nodes.Element r4 = (org.jsoup.nodes.Element) r4
            java.lang.String r5 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            com.lagradost.cloudstream3.SearchResponse r4 = r2.toSearchResult(r4)
            r3.add(r4)
            goto La4
        Lbd:
            java.util.List r3 = (java.util.List) r3
            return r3
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.RebahinProvider.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */ /* JADX WARN: Removed duplicated region for block: B:18:0x00d9  */ /* JADX WARN: Removed duplicated region for block: B:25:0x0183 A[LOOP:6: B:23:0x017d->B:25:0x0183, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:34:0x01e4  */ /* JADX WARN: Removed duplicated region for block: B:35:0x01e7  */ /* JADX WARN: Removed duplicated region for block: B:38:0x020d  */ /* JADX WARN: Removed duplicated region for block: B:39:0x0214  */ /* JADX WARN: Removed duplicated region for block: B:49:0x027c A[LOOP:7: B:47:0x0276->B:49:0x027c, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:52:0x02ab  */ /* JADX WARN: Removed duplicated region for block: B:59:0x0358 A[LOOP:1: B:57:0x0352->B:59:0x0358, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:63:0x038a  */ /* JADX WARN: Removed duplicated region for block: B:70:0x03c6  */ /* JADX WARN: Removed duplicated region for block: B:82:0x049a  */ /* JADX WARN: Removed duplicated region for block: B:89:0x0568 A[LOOP:0: B:87:0x0562->B:89:0x0568, LOOP_END] */ /* JADX WARN: Type inference failed for: r3v41, types: [java.util.List] */ /* JADX WARN: Type inference failed for: r3v43, types: [java.util.List] */ /* JADX WARN: Type inference failed for: r9v11, types: [java.util.List] */ /* JADX WARN: Type inference failed for: r9v14, types: [java.util.List] */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun load(r45: String?, r46: Continuation<in LoadResponse?>?): Any {
        /*
            Method dump skipped, instructions count: 1446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.RebahinProvider.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */ /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */ /* JADX WARN: Removed duplicated region for block: B:23:0x011a  */ /* JADX WARN: Removed duplicated region for block: B:38:0x01e4 A[LOOP:0: B:36:0x01de->B:38:0x01e4, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:46:0x027b  */ /* JADX WARN: Removed duplicated region for block: B:55:0x02e3  */ /* JADX WARN: Removed duplicated region for block: B:59:0x0310  */ /* JADX WARN: Removed duplicated region for block: B:64:0x0265 A[EXC_TOP_SPLITTER, SYNTHETIC] */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x01ac -> B:35:0x01b2). Please submit an issue!!! */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x02f3 -> B:58:0x02fd). Please submit an issue!!! */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun invokeLokalSource(
        r44: String?,
        r45: String?,
        r46: String?,
        r47: Function1<SubtitleFile?, Unit>?,
        r48: Function1<ExtractorLink?, Unit>?,
        r49: Continuation<in Unit>?
    ): Any {
        /*
            Method dump skipped, instructions count: 789
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.RebahinProvider.invokeLokalSource(java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */ /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */ /* JADX WARN: Removed duplicated region for block: B:20:0x0123  */ /* JADX WARN: Removed duplicated region for block: B:25:0x018f  */ /* JADX WARN: Removed duplicated region for block: B:28:0x01b5  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun invokeKotakAjairSource(
        r30: String?,
        r31: Function1<SubtitleFile?, Unit>?,
        r32: Function1<ExtractorLink?, Unit>?,
        r33: Continuation<in Unit>?
    ): Any {
        /*
            Method dump skipped, instructions count: 575
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.RebahinProvider.invokeKotakAjairSource(java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
    }

    @Override // com.lagradost.cloudstream3.MainAPI
    fun loadLinks(
        str: String?,
        z: Boolean,
        function1: Function1<SubtitleFile?, Unit>?,
        function12: Function1<ExtractorLink?, Unit>?,
        continuation: Continuation<in Boolean?>?
    ): Object {
        val `split$default`: List<String> = StringsKt.`split$default`(
            StringsKt.removeSurrounding(
                str,
                "[" as CharSequence,
                "]" as CharSequence
            ) as CharSequence?, arrayOf(","), false, 0, 6, null as Object?
        )
        val arrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(`split$default`, 10))
        for (str2 in `split$default`) {
            arrayList.add(StringsKt.trim(str2 as CharSequence).toString())
        }
        ParCollections.apmap(
            arrayList,
            `RebahinProvider$loadLinks$3`(this, function1, function12, null)
        )
        return boxing.boxBoolean(true)
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: RebahinProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/RebahinProvider\$ResponseLocal;", "", "file", "", Constants.ScionAnalytics.PARAM_LABEL, "type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFile", "()Ljava/lang/String;", "getLabel", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class ResponseLocal(
        @JsonProperty("file") file: String,
        @JsonProperty("label") label: String,
        @JsonProperty("type") str: String
    ) {
        val file: String
        val label: String
        val type: String
        operator fun component1(): String {
            return file
        }

        operator fun component2(): String {
            return label
        }

        operator fun component3(): String {
            return type
        }

        fun copy(
            @JsonProperty("file") file: String,
            @JsonProperty("label") label: String,
            @JsonProperty("type") str: String
        ): ResponseLocal {
            Intrinsics.checkNotNullParameter(file, "file")
            Intrinsics.checkNotNullParameter(label, "label")
            return ResponseLocal(file, label, str)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is ResponseLocal) {
                val responseLocal = obj as ResponseLocal
                return Intrinsics.areEqual(file, responseLocal.file) && Intrinsics.areEqual(
                    label, responseLocal.label
                ) && Intrinsics.areEqual(type, responseLocal.type)
            }
            return false
        }

        override fun hashCode(): Int {
            val hashCode = (file.hashCode() * 31 + label.hashCode()) * 31
            val str = type
            return hashCode + (str?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "ResponseLocal(file=" + file + ", label=" + label + ", type=" + type + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(file, "file")
            Intrinsics.checkNotNullParameter(label, "label")
            this.file = file
            this.label = label
            type = str
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                responseLocal: ResponseLocal,
                str: String,
                str2: String,
                str3: String,
                i: Int,
                obj: Object?
            ): ResponseLocal {
                var str = str
                var str2 = str2
                var str3 = str3
                if (i and 1 != 0) {
                    str = responseLocal.file
                }
                if (i and 2 != 0) {
                    str2 = responseLocal.label
                }
                if (i and 4 != 0) {
                    str3 = responseLocal.type
                }
                return responseLocal.copy(str, str2, str3)
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: RebahinProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/RebahinProvider\$Tracks;", "", "file", "", Constants.ScionAnalytics.PARAM_LABEL, "kind", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFile", "()Ljava/lang/String;", "getKind", "getLabel", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Tracks(
        @JsonProperty("file") file: String,
        @JsonProperty("label") str: String,
        @JsonProperty("kind") str2: String
    ) {
        val file: String
        val kind: String
        val label: String
        operator fun component1(): String {
            return file
        }

        operator fun component2(): String {
            return label
        }

        operator fun component3(): String {
            return kind
        }

        fun copy(
            @JsonProperty("file") file: String,
            @JsonProperty("label") str: String,
            @JsonProperty("kind") str2: String
        ): Tracks {
            Intrinsics.checkNotNullParameter(file, "file")
            return Tracks(file, str, str2)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Tracks) {
                val tracks = obj as Tracks
                return Intrinsics.areEqual(file, tracks.file) && Intrinsics.areEqual(
                    label, tracks.label
                ) && Intrinsics.areEqual(kind, tracks.kind)
            }
            return false
        }

        override fun hashCode(): Int {
            val hashCode = file.hashCode() * 31
            val str = label
            val hashCode2 = (hashCode + (str?.hashCode() ?: 0)) * 31
            val str2 = kind
            return hashCode2 + (str2?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "Tracks(file=" + file + ", label=" + label + ", kind=" + kind + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(file, "file")
            this.file = file
            label = str
            kind = str2
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                tracks: Tracks,
                str: String,
                str2: String,
                str3: String,
                i: Int,
                obj: Object?
            ): Tracks {
                var str = str
                var str2 = str2
                var str3 = str3
                if (i and 1 != 0) {
                    str = tracks.file
                }
                if (i and 2 != 0) {
                    str2 = tracks.label
                }
                if (i and 4 != 0) {
                    str3 = tracks.kind
                }
                return tracks.copy(str, str2, str3)
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: RebahinProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000c\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/RebahinProvider\$Captions;", "", "id", "", "hash", "language", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHash", "()Ljava/lang/String;", "getId", "getLanguage", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Captions(
        @JsonProperty("id") id: String,
        @JsonProperty("hash") hash: String,
        @JsonProperty("language") language: String
    ) {
        val hash: String

        /* renamed from: id */
        val id: String
        val language: String
        operator fun component1(): String {
            return id
        }

        operator fun component2(): String {
            return hash
        }

        operator fun component3(): String {
            return language
        }

        fun copy(
            @JsonProperty("id") id: String,
            @JsonProperty("hash") hash: String,
            @JsonProperty("language") language: String
        ): Captions {
            Intrinsics.checkNotNullParameter(id, "id")
            Intrinsics.checkNotNullParameter(hash, "hash")
            Intrinsics.checkNotNullParameter(language, "language")
            return Captions(id, hash, language)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Captions) {
                val captions = obj as Captions
                return Intrinsics.areEqual(id, captions.id) && Intrinsics.areEqual(
                    hash, captions.hash
                ) && Intrinsics.areEqual(language, captions.language)
            }
            return false
        }

        override fun hashCode(): Int {
            return (id.hashCode() * 31 + hash.hashCode()) * 31 + language.hashCode()
        }

        override fun toString(): String {
            return "Captions(id=" + id + ", hash=" + hash + ", language=" + language + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(id, "id")
            Intrinsics.checkNotNullParameter(hash, "hash")
            Intrinsics.checkNotNullParameter(language, "language")
            this.id = id
            this.hash = hash
            this.language = language
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                captions: Captions,
                str: String,
                str2: String,
                str3: String,
                i: Int,
                obj: Object?
            ): Captions {
                var str = str
                var str2 = str2
                var str3 = str3
                if (i and 1 != 0) {
                    str = captions.id
                }
                if (i and 2 != 0) {
                    str2 = captions.hash
                }
                if (i and 4 != 0) {
                    str3 = captions.language
                }
                return captions.copy(str, str2, str3)
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: RebahinProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000c\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/RebahinProvider\$Data;", "", "file", "", Constants.ScionAnalytics.PARAM_LABEL, "(Ljava/lang/String;Ljava/lang/String;)V", "getFile", "()Ljava/lang/String;", "getLabel", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Data(@JsonProperty("file") file: String, @JsonProperty("label") label: String) {
        val file: String
        val label: String
        operator fun component1(): String {
            return file
        }

        operator fun component2(): String {
            return label
        }

        fun copy(@JsonProperty("file") file: String, @JsonProperty("label") label: String): Data {
            Intrinsics.checkNotNullParameter(file, "file")
            Intrinsics.checkNotNullParameter(label, "label")
            return Data(file, label)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Data) {
                val data = obj as Data
                return Intrinsics.areEqual(file, data.file) && Intrinsics.areEqual(
                    label, data.label
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return file.hashCode() * 31 + label.hashCode()
        }

        override fun toString(): String {
            return "Data(file=" + file + ", label=" + label + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(file, "file")
            Intrinsics.checkNotNullParameter(label, "label")
            this.file = file
            this.label = label
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                data: Data,
                str: String,
                str2: String,
                i: Int,
                obj: Object?
            ): Data {
                var str = str
                var str2 = str2
                if (i and 1 != 0) {
                    str = data.file
                }
                if (i and 2 != 0) {
                    str2 = data.label
                }
                return data.copy(str, str2)
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: RebahinProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/RebahinProvider\$Player;", "", "poster_file", "", "(Ljava/lang/String;)V", "getPoster_file", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Player(@JsonProperty("poster_file") poster_file: String) {
        val poster_file: String
        operator fun component1(): String {
            return poster_file
        }

        fun copy(@JsonProperty("poster_file") poster_file: String): Player {
            Intrinsics.checkNotNullParameter(poster_file, "poster_file")
            return Player(poster_file)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is Player && Intrinsics.areEqual(
                poster_file,
                (obj as Player).poster_file
            )
        }

        override fun hashCode(): Int {
            return poster_file.hashCode()
        }

        override fun toString(): String {
            return "Player(poster_file=" + poster_file + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(poster_file, "poster_file")
            this.poster_file = poster_file
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                player: Player,
                str: String,
                i: Int,
                obj: Object?
            ): Player {
                var str = str
                if (i and 1 != 0) {
                    str = player.poster_file
                }
                return player.copy(str)
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: RebahinProvider.kt */
    @Metadata(
        m108d1 = ["\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\rR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/RebahinProvider\$ResponseKotakAjair;", "", "success", "", "player", "Lcom/lagradost/cloudstream3/movieproviders/RebahinProvider\$Player;", "data", "", "Lcom/lagradost/cloudstream3/movieproviders/RebahinProvider\$Data;", "captions", "Lcom/lagradost/cloudstream3/movieproviders/RebahinProvider\$Captions;", "(ZLcom/lagradost/cloudstream3/movieproviders/RebahinProvider\$Player;Ljava/util/List;Ljava/util/List;)V", "getCaptions", "()Ljava/util/List;", "getData", "getPlayer", "()Lcom/lagradost/cloudstream3/movieproviders/RebahinProvider\$Player;", "getSuccess", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class ResponseKotakAjair(
        @JsonProperty("success") z: Boolean,
        @JsonProperty("player") player: Player,
        @JsonProperty("data") list: List<Data>,
        @JsonProperty("captions") list2: List<Captions>
    ) {
        val captions: List<Captions>
        val data: List<Data>
        val player: Player
        val success: Boolean
        operator fun component1(): Boolean {
            return success
        }

        operator fun component2(): Player {
            return player
        }

        operator fun component3(): List<Data> {
            return data
        }

        operator fun component4(): List<Captions> {
            return captions
        }

        fun copy(
            @JsonProperty("success") z: Boolean,
            @JsonProperty("player") player: Player,
            @JsonProperty("data") list: List<Data>,
            @JsonProperty("captions") list2: List<Captions>
        ): ResponseKotakAjair {
            Intrinsics.checkNotNullParameter(player, "player")
            return ResponseKotakAjair(z, player, list, list2)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is ResponseKotakAjair) {
                val responseKotakAjair = obj as ResponseKotakAjair
                return success == responseKotakAjair.success && Intrinsics.areEqual(
                    player, responseKotakAjair.player
                ) && Intrinsics.areEqual(
                    data, responseKotakAjair.data
                ) && Intrinsics.areEqual(
                    captions, responseKotakAjair.captions
                )
            }
            return false
        }

        /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Type inference failed for: r0v1, types: [int] */ /* JADX WARN: Type inference failed for: r0v8 */ /* JADX WARN: Type inference failed for: r0v9 */
        override fun hashCode(): Int {
            val z = success
            r0 = z
            if (z) {
                r0 = 1
            }
            val hashCode: Int = (r0 * 31 + player.hashCode()) * 31
            val list = data
            val hashCode2 = (hashCode + (list?.hashCode() ?: 0)) * 31
            val list2 = captions
            return hashCode2 + (list2?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "ResponseKotakAjair(success=" + success + ", player=" + player + ", data=" + data + ", captions=" + captions + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(player, "player")
            success = z
            this.player = player
            data = list
            captions = list2
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                responseKotakAjair: ResponseKotakAjair,
                z: Boolean,
                player: Player,
                list: List,
                list2: List,
                i: Int,
                obj: Object?
            ): ResponseKotakAjair {
                var z = z
                var player = player
                var list: List = list
                var list2: List = list2
                if (i and 1 != 0) {
                    z = responseKotakAjair.success
                }
                if (i and 2 != 0) {
                    player = responseKotakAjair.player
                }
                if (i and 4 != 0) {
                    list = responseKotakAjair.data
                }
                if (i and 8 != 0) {
                    list2 = responseKotakAjair.captions
                }
                return responseKotakAjair.copy(z, player, list, list2)
            }
        }
    }
}