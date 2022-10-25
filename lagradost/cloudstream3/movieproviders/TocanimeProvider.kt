package com.lagradost.cloudstream3.movieproviders

import org.jsoup.nodes.Element
import java.net.URLEncoder
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: TocanimeProvider.kt */
@Metadata(
    m108d1 = ["\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 12\u00020\u0001:\u0003123B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0018\u001a\u00020\nH\u0002J\u0011\u0010\u0019\u001a\u00020\u001aH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJI\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u00042\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&0\$H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010)J\u001f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010-\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ\u000c\u0010.\u001a\u00020/*\u000200H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u000c\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000c\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TocanimeProvider;", "Lcom/lagradost/cloudstream3/MainAPI;", "()V", "hasDownloadSupport", "", "getHasDownloadSupport", "()Z", "hasMainPage", "getHasMainPage", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "encode", TvContractCompat.PARAM_INPUT, "getMainPage", "Lcom/lagradost/cloudstream3/HomePageResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "", "Lcom/lagradost/cloudstream3/SearchResponse;", "query", "toSearchResult", "Lcom/lagradost/cloudstream3/AnimeSearchResponse;", "Lorg/jsoup/nodes/Element;", "Companion", "Formats", "Responses", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class TocanimeProvider : MainAPI() {
    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var mainUrl = "https://tocanime.co"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var name = "Tocanime"
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
    val hasDownloadSupport = true

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

    /* compiled from: TocanimeProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\t"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TocanimeProvider\$Companion;", "", "()V", "getStatus", "Lcom/lagradost/cloudstream3/ShowStatus;", "t", "", "getType", "Lcom/lagradost/cloudstream3/TvType;", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        fun getType(t: String): TvType {
            Intrinsics.checkNotNullParameter(t, "t")
            if (StringsKt.`contains$default`(
                    t as CharSequence,
                    "OVA" as CharSequence,
                    false,
                    2,
                    null as Object?
                ) || StringsKt.`contains$default`(
                    t as CharSequence,
                    "Special" as CharSequence,
                    false,
                    2,
                    null as Object?
                )
            ) {
                return TvType.OVA
            }
            return if (StringsKt.`contains$default`(
                    t as CharSequence,
                    "Movie" as CharSequence,
                    false,
                    2,
                    null as Object?
                )
            ) TvType.AnimeMovie else TvType.Anime
        }

        fun getStatus(t: String?): ShowStatus {
            Intrinsics.checkNotNullParameter(t, "t")
            return if (Intrinsics.areEqual(
                    t,
                    "Đã hoàn thành"
                )
            ) ShowStatus.Completed else if (Intrinsics.areEqual(
                    t,
                    "Chưa hoàn thành"
                )
            ) ShowStatus.Ongoing else ShowStatus.Completed
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b4, code lost:
        if (r5 == null) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */ /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun getMainPage(r29: Continuation<in HomePageResponse?>?): Any? {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.TocanimeProvider.getMainPage(kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun toSearchResult(element: Element): AnimeSearchResponse {
        var text: String
        var text2: String?
        val selectFirst: Element = element.selectFirst("h3 a")
        val str = if (selectFirst == null || selectFirst.text()
                .also { text2 = it } == null || StringsKt.trim(text2 as CharSequence?).toString()
                .also { r1 = it } == null
        ) "" else ""
        val tocanimeProvider = this
        val selectFirst2: Element = element.selectFirst("h3 a")
        Intrinsics.checkNotNull(selectFirst2)
        val attr: String = selectFirst2.attr(ShareConstants.WEB_DIALOG_PARAM_HREF)
        Intrinsics.checkNotNullExpressionValue(attr, "this.selectFirst(\"h3 a\")!!.attr(\"href\")")
        val fixUrl: String = MainAPIKt.fixUrl(tocanimeProvider, attr)
        val selectFirst3: Element = element.selectFirst("div.card-item-img")
        var num: Integer? = null
        val fixUrlNull: String =
            MainAPIKt.fixUrlNull(tocanimeProvider, selectFirst3?.attr("data-original"))
        val selectFirst4: Element = element.selectFirst("div.card-item-badget.rtl")
        if (selectFirst4 != null && selectFirst4.text().also { text = it } != null) {
            val str2 = text
            val sb = StringBuilder()
            val length: Int = str2.length()
            for (i in 0 until length) {
                val charAt: Char = str2.charAt(i)
                if (Character.isDigit(charAt)) {
                    sb.append(charAt)
                }
            }
            val sb2 = sb.toString()
            Intrinsics.checkNotNullExpressionValue(
                sb2,
                "filterTo(StringBuilder(), predicate).toString()"
            )
            val intOrNull: Integer? = StringsKt.toIntOrNull(sb2)
            if (!StringsKt.`contains$default`(
                    str2 as CharSequence,
                    "Preview" as CharSequence,
                    false,
                    2,
                    null as Object?
                )
            ) {
                num = intOrNull
            } else if (intOrNull != null) {
                num = Integer.valueOf(intOrNull.intValue() - 1)
            }
        }
        return MainAPIKt.`newAnimeSearchResponse$default`(
            tocanimeProvider,
            str,
            fixUrl,
            TvType.Anime,
            false,
            `TocanimeProvider$toSearchResult$1`(fixUrlNull, num),
            8,
            null
        )
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */ /* JADX WARN: Removed duplicated region for block: B:21:0x00ab A[LOOP:0: B:19:0x00a5->B:21:0x00ab, LOOP_END] */
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
            boolean r2 = r1 instanceof com.lagradost.cloudstream3.movieproviders.TocanimeProvider$search$1
            if (r2 == 0) goto L18
            r2 = r1
            com.lagradost.cloudstream3.movieproviders.TocanimeProvider$search$1 r2 = (com.lagradost.cloudstream3.movieproviders.TocanimeProvider$search$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r1 = r2.label
            int r1 = r1 - r4
            r2.label = r1
            goto L1d
        L18:
            com.lagradost.cloudstream3.movieproviders.TocanimeProvider$search$1 r2 = new com.lagradost.cloudstream3.movieproviders.TocanimeProvider$search$1
            r2.<init>(r0, r1)
        L1d:
            java.lang.Object r1 = r2.result
            java.lang.Object r15 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r2.label
            r4 = 1
            if (r3 == 0) goto L3a
            if (r3 != r4) goto L32
            java.lang.Object r2 = r2.L$0
            com.lagradost.cloudstream3.movieproviders.TocanimeProvider r2 = (com.lagradost.cloudstream3.movieproviders.TocanimeProvider) r2
            kotlin.ResultKt.throwOnFailure(r1)
            goto L81
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            kotlin.ResultKt.throwOnFailure(r1)
            com.lagradost.cloudstream3.utils.Extensions$RequestCustom r1 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r3 = r1
            com.lagradost.nicehttp.Requests r3 = (com.lagradost.nicehttp.Requests) r3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = r19.getMainUrl()
            r1.append(r5)
            java.lang.String r5 = "/content/search?t=kw&q="
            r1.append(r5)
            r5 = r20
            r1.append(r5)
            java.lang.String r1 = r1.toString()
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
            if (r2 != r1) goto L7f
            return r1
        L7f:
            r1 = r2
            r2 = r0
        L81:
            com.lagradost.nicehttp.NiceResponse r1 = (com.lagradost.nicehttp.NiceResponse) r1
            org.jsoup.nodes.Document r1 = r1.getDocument()
            java.lang.String r3 = "div.col-lg-3.col-md-4.col-6"
            org.jsoup.select.Elements r1 = r1.select(r3)
            java.lang.String r3 = "document.select(\"div.col-lg-3.col-md-4.col-6\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r4)
            r3.<init>(r4)
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r1 = r1.iterator()
        La5:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Lbe
            java.lang.Object r4 = r1.next()
            org.jsoup.nodes.Element r4 = (org.jsoup.nodes.Element) r4
            java.lang.String r5 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            com.lagradost.cloudstream3.AnimeSearchResponse r4 = r2.toSearchResult(r4)
            r3.add(r4)
            goto La5
        Lbe:
            java.util.List r3 = (java.util.List) r3
            return r3
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.TocanimeProvider.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */ /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */ /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */ /* JADX WARN: Removed duplicated region for block: B:23:0x008a A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun load(r22: String?, r23: Continuation<in LoadResponse?>?): Any {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.TocanimeProvider.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun encode(str: String?): String {
        return URLEncoder.encode(str, "utf-8")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    @Override // com.lagradost.cloudstream3.MainAPI
            /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */    fun loadLinks(
        r21: String?,
        r22: Boolean,
        r23: Function1<SubtitleFile?, Unit>?,
        r24: Function1<ExtractorLink?, Unit>?,
        r25: Continuation<in Boolean?>?
    ): Any {
        /*
            r20 = this;
            r0 = r20
            r1 = r25
            boolean r2 = r1 instanceof com.lagradost.cloudstream3.movieproviders.TocanimeProvider$loadLinks$1
            if (r2 == 0) goto L18
            r2 = r1
            com.lagradost.cloudstream3.movieproviders.TocanimeProvider$loadLinks$1 r2 = (com.lagradost.cloudstream3.movieproviders.TocanimeProvider$loadLinks$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r1 = r2.label
            int r1 = r1 - r4
            r2.label = r1
            goto L1d
        L18:
            com.lagradost.cloudstream3.movieproviders.TocanimeProvider$loadLinks$1 r2 = new com.lagradost.cloudstream3.movieproviders.TocanimeProvider$loadLinks$1
            r2.<init>(r0, r1)
        L1d:
            java.lang.Object r1 = r2.result
            java.lang.Object r15 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r2.label
            r14 = 1
            if (r3 == 0) goto L44
            if (r3 != r14) goto L3c
            java.lang.Object r3 = r2.L$2
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            java.lang.Object r4 = r2.L$1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r2.L$0
            com.lagradost.cloudstream3.movieproviders.TocanimeProvider r2 = (com.lagradost.cloudstream3.movieproviders.TocanimeProvider) r2
            kotlin.ResultKt.throwOnFailure(r1)
            r19 = 1
            goto L8d
        L3c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L44:
            kotlin.ResultKt.throwOnFailure(r1)
            com.lagradost.cloudstream3.utils.Extensions$RequestCustom r1 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r3 = r1
            com.lagradost.nicehttp.Requests r3 = (com.lagradost.nicehttp.Requests) r3
            java.lang.String r1 = "Accept"
        */
        //  java.lang.String r4 = "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8"
        /*
            kotlin.Pair r1 = kotlin.TuplesKt.m100to(r1, r4)
            java.util.Map r5 = kotlin.collections.MapsKt.mapOf(r1)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r1 = 0
            r16 = 0
            r17 = 2044(0x7fc, float:2.864E-42)
            r18 = 0
            r2.L$0 = r0
            r4 = r21
            r2.L$1 = r4
            r22 = r15
            r15 = r24
            r2.L$2 = r15
            r2.label = r14
            r19 = 1
            r14 = r1
            r1 = r22
            r15 = r16
            r16 = r2
            java.lang.Object r2 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18)
            if (r2 != r1) goto L87
            return r1
        L87:
            r4 = r21
            r3 = r24
            r1 = r2
            r2 = r0
        L8d:
            com.lagradost.nicehttp.NiceResponse r1 = (com.lagradost.nicehttp.NiceResponse) r1
            org.jsoup.nodes.Document r1 = r1.getDocument()
            java.lang.String r5 = "script"
            org.jsoup.select.Elements r1 = r1.select(r5)
            java.lang.String r5 = "document.select(\"script\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
            java.util.List r1 = (java.util.List) r1
            com.lagradost.cloudstream3.movieproviders.TocanimeProvider$loadLinks$2 r5 = new com.lagradost.cloudstream3.movieproviders.TocanimeProvider$loadLinks$2
            r6 = 0
            r5.<init>(r4, r2, r3, r6)
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            com.lagradost.cloudstream3.ParCollections.apmap(r1, r5)
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.boxing.boxBoolean(r19)
            return r1
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.TocanimeProvider.loadLinks(java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* compiled from: TocanimeProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TocanimeProvider\$Formats;", "", "auto", "", "(Ljava/lang/String;)V", "getAuto", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Formats(@param:JsonProperty("auto") val auto: String) {
        operator fun component1(): String {
            return auto
        }

        fun copy(@JsonProperty("auto") str: String): Formats {
            return Formats(str)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is Formats && Intrinsics.areEqual(
                auto,
                (obj as Formats).auto
            )
        }

        override fun hashCode(): Int {
            val str = auto ?: return 0
            return str.hashCode()
        }

        override fun toString(): String {
            return "Formats(auto=" + auto + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                formats: Formats,
                str: String,
                i: Int,
                obj: Object?
            ): Formats {
                var str = str
                if (i and 1 != 0) {
                    str = formats.auto
                }
                return formats.copy(str)
            }
        }
    }

    /* compiled from: TocanimeProvider.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TocanimeProvider\$Responses;", "", "formats", "Lcom/lagradost/cloudstream3/movieproviders/TocanimeProvider\$Formats;", "(Lcom/lagradost/cloudstream3/movieproviders/TocanimeProvider\$Formats;)V", "getFormats", "()Lcom/lagradost/cloudstream3/movieproviders/TocanimeProvider\$Formats;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Responses(@param:JsonProperty("formats") val formats: Formats) {
        operator fun component1(): Formats {
            return formats
        }

        fun copy(@JsonProperty("formats") formats: Formats): Responses {
            return Responses(formats)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is Responses && Intrinsics.areEqual(
                formats,
                (obj as Responses).formats
            )
        }

        override fun hashCode(): Int {
            val formats = formats ?: return 0
            return formats.hashCode()
        }

        override fun toString(): String {
            return "Responses(formats=" + formats + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                responses: Responses,
                formats: Formats,
                i: Int,
                obj: Object?
            ): Responses {
                var formats = formats
                if (i and 1 != 0) {
                    formats = responses.formats
                }
                return responses.copy(formats)
            }
        }
    }

    companion object {
        val Companion = Companion(null)
    }
}