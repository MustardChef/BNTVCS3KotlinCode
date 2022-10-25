package com.lagradost.cloudstream3.movieproviders

import com.google.common.net.HttpHeaders
import org.jsoup.nodes.Element
import java.util.ArrayList
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: HDrezkaProvider.kt */
@Metadata(
    m108d1 = ["\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0005>?@ABB\u0005¢\u0006\u0002\u0010\u0002J<\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00042\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001b0!H\u0002J\u0010\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\nH\u0002J\u0010\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\nH\u0002J\u0011\u0010'\u001a\u00020(H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010)J\u0010\u0010*\u001a\u00020+2\u0006\u0010&\u001a\u00020\nH\u0002JH\u0010,\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010-\u001a\u00020\n2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u001b0!2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001b0!H\u0002J\u0019\u00100\u001a\u0002012\u0006\u0010\u001d\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u00102JI\u00103\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00042\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u001b0!2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001b0!H\u0096@ø\u0001\u0000¢\u0006\u0002\u00107J\u001f\u00108\u001a\b\u0012\u0004\u0012\u00020:092\u0006\u0010;\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u00102J\u000c\u0010<\u001a\u00020:*\u00020=H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u000c\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000c\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000c\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006C"],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/HDrezkaProvider;", "Lcom/lagradost/cloudstream3/MainAPI;", "()V", "hasDownloadSupport", "", "getHasDownloadSupport", "()Z", "hasMainPage", "getHasMainPage", "lang", "", "getLang", "()Ljava/lang/String;", "setLang", "(Ljava/lang/String;)V", "mainUrl", "getMainUrl", "setMainUrl", "name", "getName", "setName", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "cleanCallback", "", "source", "url", "quality", "isM3u8", "sourceCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "decryptStreamUrl", "data", "getLanguage", "str", "getMainPage", "Lcom/lagradost/cloudstream3/HomePageResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQuality", "", "invokeSources", "subtitle", "subCallback", "Lcom/lagradost/cloudstream3/SubtitleFile;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLinks", "isCasting", "subtitleCallback", "callback", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "", "Lcom/lagradost/cloudstream3/SearchResponse;", "query", "toSearchResult", "Lorg/jsoup/nodes/Element;", "Data", "LocalSources", HttpHeaders.SERVER, "Sources", HttpHeaders.TRAILER, "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class HDrezkaProvider : MainAPI() {
    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var mainUrl = "https://hdrezka19139.org"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var name = "HDrezka"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasMainPage = true
    private var lang = "ru"

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

    @Override // com.lagradost.cloudstream3.MainAPI
    override fun getMainPage(continuation: Continuation<in HomePageResponse?>?): Object? {
        val arrayList = ArrayList()
        ParCollections.apmap(
            CollectionsKt.listOf<Object>(
                *arrayOf<Tuples<*, *>>(
                    Tuples<Any?, Any?>(
                        "фильмы",
                        "$mainUrl/films/?filter=watching"
                    ),
                    Tuples<Any?, Any?>("сериалы", "$mainUrl/series/?filter=watching"),
                    Tuples<Any?, Any?>("мультфильмы", "$mainUrl/cartoons/?filter=watching"),
                    Tuples<Any?, Any?>("аниме", "$mainUrl/animation/?filter=watching")
                ) as Array<Object>
            ), `HDrezkaProvider$getMainPage$2`(arrayList, this, null)
        )
        if (arrayList.size() <= 0) {
            throw ErrorLoadingException(null, 1, null)
        }
        return HomePageResponse(arrayList, null, null, null, null, 30, null)
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun toSearchResult(element: Element): SearchResponse {
        var text: String?
        val selectFirst: Element = element.selectFirst("div.b-content__inline_item-link > a")
        val valueOf: String = String.valueOf(
            if (selectFirst == null || selectFirst.text()
                    .also { text = it } == null
            ) null else StringsKt.trim(text as CharSequence?).toString())
        val selectFirst2: Element = element.selectFirst("a")
        val valueOf2: String =
            String.valueOf(selectFirst2?.attr(ShareConstants.WEB_DIALOG_PARAM_HREF))
        val attr: String = element.select("img").attr("src")
        val select: Elements = element.select("span.info")
        Intrinsics.checkNotNullExpressionValue(select, "this.select(\"span.info\")")
        if ((if (select.isEmpty() xor true) TvType.TvSeries else TvType.Movie) === TvType.Movie) {
            return MainAPIKt.`newMovieSearchResponse$default`(
                this,
                valueOf,
                valueOf2,
                TvType.Movie,
                false,
                `HDrezkaProvider$toSearchResult$1`(attr),
                8,
                null
            )
        }
        val text2: String = element.select("span.info").text()
        Intrinsics.checkNotNullExpressionValue(text2, "this.select(\"span.info\").text()")
        return MainAPIKt.`newAnimeSearchResponse$default`(
            this,
            valueOf,
            valueOf2,
            TvType.TvSeries,
            false,
            `HDrezkaProvider$toSearchResult$2`(
                attr,
                StringsKt.toIntOrNull(
                    Regex("[^0-9]").replace(
                        StringsKt.`substringAfter$default`(
                            text2,
                            ",",
                            null as String?,
                            2,
                            null as Object?
                        ), ""
                    )
                )
            ),
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
            boolean r2 = r1 instanceof com.lagradost.cloudstream3.movieproviders.HDrezkaProvider$search$1
            if (r2 == 0) goto L18
            r2 = r1
            com.lagradost.cloudstream3.movieproviders.HDrezkaProvider$search$1 r2 = (com.lagradost.cloudstream3.movieproviders.HDrezkaProvider$search$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r1 = r2.label
            int r1 = r1 - r4
            r2.label = r1
            goto L1d
        L18:
            com.lagradost.cloudstream3.movieproviders.HDrezkaProvider$search$1 r2 = new com.lagradost.cloudstream3.movieproviders.HDrezkaProvider$search$1
            r2.<init>(r0, r1)
        L1d:
            java.lang.Object r1 = r2.result
            java.lang.Object r15 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r2.label
            r4 = 1
            if (r3 == 0) goto L3a
            if (r3 != r4) goto L32
            java.lang.Object r2 = r2.L$0
            com.lagradost.cloudstream3.movieproviders.HDrezkaProvider r2 = (com.lagradost.cloudstream3.movieproviders.HDrezkaProvider) r2
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
            java.lang.String r3 = "/search/?do=search&subaction=search&q="
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
            java.lang.String r3 = "div.b-content__inline_items div.b-content__inline_item"
            org.jsoup.select.Elements r1 = r1.select(r3)
            java.lang.String r3 = "document.select(\"div.b-c….b-content__inline_item\")"
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
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.HDrezkaProvider.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Removed duplicated region for block: B:103:0x04bc  */ /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */ /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */ /* JADX WARN: Removed duplicated region for block: B:34:0x0144  */ /* JADX WARN: Removed duplicated region for block: B:35:0x0149  */ /* JADX WARN: Removed duplicated region for block: B:39:0x0173 A[LOOP:5: B:37:0x016d->B:39:0x0173, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:48:0x01ad  */ /* JADX WARN: Removed duplicated region for block: B:49:0x01b0  */ /* JADX WARN: Removed duplicated region for block: B:58:0x0268 A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:59:0x0269  */ /* JADX WARN: Removed duplicated region for block: B:67:0x029b  */ /* JADX WARN: Removed duplicated region for block: B:68:0x02a0  */ /* JADX WARN: Removed duplicated region for block: B:71:0x02be  */ /* JADX WARN: Removed duplicated region for block: B:72:0x02c3  */ /* JADX WARN: Removed duplicated region for block: B:76:0x02ed  */ /* JADX WARN: Removed duplicated region for block: B:88:0x034a A[LOOP:1: B:86:0x0344->B:88:0x034a, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:91:0x037a  */ /* JADX WARN: Removed duplicated region for block: B:94:0x03ac  */ /* JADX WARN: Type inference failed for: r6v7, types: [java.util.List] */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun load(r43: String?, r44: Continuation<in LoadResponse?>?): Any {
        /*
            Method dump skipped, instructions count: 1397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.HDrezkaProvider.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    private fun decryptStreamUrl(str: String?): String {
        val listOf: List =
            CollectionsKt.listOf<Object>(*arrayOf("@", "#", "!", "^", "$") as Array<Object>)
        val plus: List<String> = CollectionsKt.plus(
            `decryptStreamUrl$getTrash`(listOf, 2) as Collection,
            `decryptStreamUrl$getTrash`(listOf, 3) as Iterable
        )
        val `joinToString$default`: String = CollectionsKt.`joinToString$default`(
            StringsKt.`split$default`(
                StringsKt.`replace$default`(
                    str,
                    "#h",
                    "",
                    false,
                    4,
                    null as Object?
                ) as CharSequence?, arrayOf("//_//"), false, 0, 6, null as Object?
            ), "", null, null, 0, null, null, 62, null
        )
        var str2: String? = `joinToString$default`
        for (str3 in plus) {
            val bytes: ByteArray = str3.getBytes(Charsets.UTF_8)
            Intrinsics.checkNotNullExpressionValue(
                bytes,
                "this as java.lang.String).getBytes(charset)"
            )
            str2 = StringsKt.`replace$default`(
                str2,
                MainAPIKt.base64Encode(bytes),
                "",
                false,
                4,
                null as Object?
            )
        }
        return MainAPIKt.base64Decode(str2)
    }

    private fun cleanCallback(
        str: String,
        str2: String,
        str3: String,
        z: Boolean,
        function1: Function1<ExtractorLink, Unit>
    ) {
        function1.invoke(
            ExtractorLink(
                str, str, str2, mainUrl + JsonPointer.SEPARATOR, getQuality(str3), z, MapsKt.mapOf(
                    TuplesKt.m100to<Any, Any>(
                        HttpHeaders.ORIGIN, mainUrl
                    )
                ), null, 128, null
            )
        )
    }

    private fun getLanguage(str: String): String {
        return if (Intrinsics.areEqual(str, "Русский")) "Russian" else if (Intrinsics.areEqual(
                str,
                "Українська"
            )
        ) "Ukrainian" else str
    }

    private fun getQuality(str: String): Int {
        when (str.hashCode()) {
            -1762539867 -> if (str.equals("1080p Ultra")) {
                return Qualities.P1080.value
            }
            1572835 -> if (str.equals("360p")) {
                return Qualities.P240.value
            }
            1604548 -> if (str.equals("480p")) {
                return Qualities.P360.value
            }
            1688155 -> if (str.equals("720p")) {
                return Qualities.P480.value
            }
            46737913 -> if (str.equals("1080p")) {
                return Qualities.P720.value
            }
        }
        return ExtractorApiKt.getQualityFromName(str)
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun invokeSources(
        str: String,
        str2: String?,
        str3: String?,
        function1: Function1<SubtitleFile?, Unit>,
        function12: Function1<ExtractorLink, Unit>
    ) {
        var groupValues: List<String?>?
        var str4: String
        var groupValues2: List<String?>?
        val `split$default`: List<String> = StringsKt.`split$default`(
            decryptStreamUrl(str2) as CharSequence,
            arrayOf(","),
            false,
            0,
            6,
            null as Object?
        )
        val arrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(`split$default`, 10))
        for (str5 in `split$default`) {
            val `find$default` = Regex.`find$default`(Regex("\\[([0-9]*p.*?)]"), str5, 0, 2, null)
            var obj: String =
                StringsKt.trim(String.valueOf(if (`find$default` == null || `find$default`.groupValues.also {
                        groupValues2 = it
                    } == null) null else CollectionsKt.getOrNull<Any>(
                    groupValues2,
                    1
                ) as String) as CharSequence?).toString()
            val `split$default2`: List<String> = StringsKt.`split$default`(
                StringsKt.`replace$default`(
                    str5,
                    '[' + obj + ']'.code,
                    "",
                    false,
                    4,
                    null as Object?
                ) as CharSequence?, arrayOf("or"), false, 0, 6, null as Object?
            )
            val arrayList2 = ArrayList(CollectionsKt.collectionSizeOrDefault(`split$default2`, 10))
            for (str6 in `split$default2`) {
                arrayList2.add(StringsKt.trim(str6 as CharSequence).toString())
            }
            val arrayList3: ArrayList<String> = arrayList2
            val arrayList4 = ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10))
            for (str7 in arrayList3) {
                if (StringsKt.`endsWith$default`(str7, ".m3u8", false, 2, null as Object?)) {
                    str4 = obj
                    cleanCallback("$str (Main)", str7, obj, true, function12)
                } else {
                    str4 = obj
                    cleanCallback("$str (Backup)", str7, str4, false, function12)
                }
                arrayList4.add(Unit.INSTANCE)
                obj = str4
            }
            arrayList.add(arrayList4)
        }
        val `split$default3`: List<String> = StringsKt.`split$default`(
            str3 as CharSequence?,
            arrayOf(","),
            false,
            0,
            6,
            null as Object?
        )
        val arrayList5 = ArrayList(CollectionsKt.collectionSizeOrDefault(`split$default3`, 10))
        for (str8 in `split$default3`) {
            val `find$default2` = Regex.`find$default`(Regex("\\[(.*)]"), str8, 0, 2, null)
            val valueOf: String =
                String.valueOf(if (`find$default2` == null || `find$default2`.groupValues.also {
                        groupValues = it
                    } == null) null else CollectionsKt.getOrNull<Any>(groupValues, 1) as String)
            function1.invoke(
                SubtitleFile(
                    getLanguage(valueOf),
                    StringsKt.trim(
                        StringsKt.`replace$default`(
                            str8,
                            '[' + valueOf + ']'.code,
                            "",
                            false,
                            4,
                            null as Object?
                        ) as CharSequence?
                    ).toString(),
                    null,
                    4,
                    null
                )
            )
            arrayList5.add(Unit.INSTANCE)
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */ /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */ /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */ /* JADX WARN: Removed duplicated region for block: B:45:0x0140  */ /* JADX WARN: Removed duplicated region for block: B:63:0x0156 A[SYNTHETIC] */
    @Override // com.lagradost.cloudstream3.MainAPI
            /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */    fun loadLinks(
        r25: String?,
        r26: Boolean,
        r27: Function1<SubtitleFile?, Unit>?,
        r28: Function1<ExtractorLink?, Unit>?,
        r29: Continuation<in Boolean?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.HDrezkaProvider.loadLinks(java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* compiled from: HDrezkaProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u001f\u0010\u000c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/HDrezkaProvider\$LocalSources;", "", "streams", "", "subtitle", "(Ljava/lang/String;Ljava/lang/Object;)V", "getStreams", "()Ljava/lang/String;", "getSubtitle", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class LocalSources(
        @JsonProperty("streams") streams: String,
        @JsonProperty("subtitle") obj: Object
    ) {
        val streams: String
        private val subtitle: Object
        operator fun component1(): String {
            return streams
        }

        operator fun component2(): Object {
            return subtitle
        }

        fun copy(
            @JsonProperty("streams") streams: String,
            @JsonProperty("subtitle") obj: Object
        ): LocalSources {
            Intrinsics.checkNotNullParameter(streams, "streams")
            return LocalSources(streams, obj)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is LocalSources) {
                val localSources = obj as LocalSources
                return Intrinsics.areEqual(streams, localSources.streams) && Intrinsics.areEqual(
                    subtitle, localSources.subtitle
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val hashCode = streams.hashCode() * 31
            val obj: Object = subtitle
            return hashCode + if (obj == null) 0 else obj.hashCode()
        }

        override fun toString(): String {
            return "LocalSources(streams=" + streams + ", subtitle=" + subtitle + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(streams, "streams")
            this.streams = streams
            subtitle = obj
        }

        fun getSubtitle(): Object {
            return subtitle
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                localSources: LocalSources,
                str: String,
                obj: Object,
                i: Int,
                obj2: Object?
            ): LocalSources {
                var str = str
                var obj: Object = obj
                if (i and 1 != 0) {
                    str = localSources.streams
                }
                if (i and 2 != 0) {
                    obj = localSources.subtitle
                }
                return localSources.copy(str, obj)
            }
        }
    }

    /* compiled from: HDrezkaProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u001f\u0010\u000c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/HDrezkaProvider\$Sources;", "", "url", "", "subtitle", "(Ljava/lang/String;Ljava/lang/Object;)V", "getSubtitle", "()Ljava/lang/Object;", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Sources(@JsonProperty("url") url: String, @JsonProperty("subtitle") obj: Object) {
        private val subtitle: Object
        val url: String
        operator fun component1(): String {
            return url
        }

        operator fun component2(): Object {
            return subtitle
        }

        fun copy(@JsonProperty("url") url: String, @JsonProperty("subtitle") obj: Object): Sources {
            Intrinsics.checkNotNullParameter(url, "url")
            return Sources(url, obj)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Sources) {
                val sources = obj as Sources
                return Intrinsics.areEqual(url, sources.url) && Intrinsics.areEqual(
                    subtitle, sources.subtitle
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val hashCode = url.hashCode() * 31
            val obj: Object = subtitle
            return hashCode + if (obj == null) 0 else obj.hashCode()
        }

        override fun toString(): String {
            return "Sources(url=" + url + ", subtitle=" + subtitle + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(url, "url")
            this.url = url
            subtitle = obj
        }

        fun getSubtitle(): Object {
            return subtitle
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                sources: Sources,
                str: String,
                obj: Object,
                i: Int,
                obj2: Object?
            ): Sources {
                var str = str
                var obj: Object = obj
                if (i and 1 != 0) {
                    str = sources.url
                }
                if (i and 2 != 0) {
                    obj = sources.subtitle
                }
                return sources.copy(str, obj)
            }
        }
    }

    /* compiled from: HDrezkaProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/HDrezkaProvider\$Server;", "", "translator_name", "", "translator_id", "camrip", "ads", "director", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAds", "()Ljava/lang/String;", "getCamrip", "getDirector", "getTranslator_id", "getTranslator_name", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Server(
        @param:JsonProperty("translator_name") val translator_name: String,
        @param:JsonProperty(
            "translator_id"
        ) val translator_id: String,
        @param:JsonProperty("camrip") val camrip: String,
        @param:JsonProperty(
            "ads"
        ) val ads: String,
        @param:JsonProperty("director") val director: String
    ) {
        operator fun component1(): String {
            return translator_name
        }

        operator fun component2(): String {
            return translator_id
        }

        operator fun component3(): String {
            return camrip
        }

        operator fun component4(): String {
            return ads
        }

        operator fun component5(): String {
            return director
        }

        fun copy(
            @JsonProperty("translator_name") str: String,
            @JsonProperty("translator_id") str2: String,
            @JsonProperty("camrip") str3: String,
            @JsonProperty("ads") str4: String,
            @JsonProperty("director") str5: String
        ): Server {
            return Server(str, str2, str3, str4, str5)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Server) {
                val server = obj as Server
                return Intrinsics.areEqual(
                    translator_name,
                    server.translator_name
                ) && Intrinsics.areEqual(
                    translator_id, server.translator_id
                ) && Intrinsics.areEqual(
                    camrip, server.camrip
                ) && Intrinsics.areEqual(ads, server.ads) && Intrinsics.areEqual(
                    director, server.director
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val str = translator_name
            val hashCode = (str?.hashCode() ?: 0) * 31
            val str2 = translator_id
            val hashCode2 = (hashCode + (str2?.hashCode() ?: 0)) * 31
            val str3 = camrip
            val hashCode3 = (hashCode2 + (str3?.hashCode() ?: 0)) * 31
            val str4 = ads
            val hashCode4 = (hashCode3 + (str4?.hashCode() ?: 0)) * 31
            val str5 = director
            return hashCode4 + (str5?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "Server(translator_name=" + translator_name + ", translator_id=" + translator_id + ", camrip=" + camrip + ", ads=" + ads + ", director=" + director + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                server: Server,
                str: String,
                str2: String,
                str3: String,
                str4: String,
                str5: String,
                i: Int,
                obj: Object?
            ): Server {
                var str = str
                var str2 = str2
                var str3 = str3
                var str4 = str4
                var str5 = str5
                if (i and 1 != 0) {
                    str = server.translator_name
                }
                if (i and 2 != 0) {
                    str2 = server.translator_id
                }
                val str6 = str2
                if (i and 4 != 0) {
                    str3 = server.camrip
                }
                val str7 = str3
                if (i and 8 != 0) {
                    str4 = server.ads
                }
                val str8 = str4
                if (i and 16 != 0) {
                    str5 = server.director
                }
                return server.copy(str, str6, str7, str8, str5)
            }
        }
    }

    /* compiled from: HDrezkaProvider.kt */
    @Metadata(
        m108d1 = ["\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000cJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jc\u0010\u001d\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/HDrezkaProvider\$Data;", "", "id", "", "favs", "server", "", "Lcom/lagradost/cloudstream3/movieproviders/HDrezkaProvider\$Server;", "season", "episode", "action", "ref", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getEpisode", "getFavs", "getId", "getRef", "getSeason", "getServer", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Data(/* renamed from: id */
        @param:JsonProperty("id") val id: String,
        @param:JsonProperty("favs") val favs: String,
        @param:JsonProperty(
            "server"
        ) val server: List<Server>,
        @param:JsonProperty(
            "season"
        ) val season: String,
        @param:JsonProperty("episode") val episode: String,
        @param:JsonProperty(
            "action"
        ) val action: String,
        @param:JsonProperty("ref") val ref: String
    ) {

        operator fun component1(): String {
            return id
        }

        operator fun component2(): String {
            return favs
        }

        operator fun component3(): List<Server> {
            return server
        }

        operator fun component4(): String {
            return season
        }

        operator fun component5(): String {
            return episode
        }

        operator fun component6(): String {
            return action
        }

        operator fun component7(): String {
            return ref
        }

        fun copy(
            @JsonProperty("id") str: String,
            @JsonProperty("favs") str2: String,
            @JsonProperty("server") list: List<Server>,
            @JsonProperty("season") str3: String,
            @JsonProperty("episode") str4: String,
            @JsonProperty("action") str5: String,
            @JsonProperty("ref") str6: String
        ): Data {
            return Data(str, str2, list, str3, str4, str5, str6)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Data) {
                val data = obj as Data
                return Intrinsics.areEqual(id, data.id) && Intrinsics.areEqual(
                    favs, data.favs
                ) && Intrinsics.areEqual(server, data.server) && Intrinsics.areEqual(
                    season, data.season
                ) && Intrinsics.areEqual(episode, data.episode) && Intrinsics.areEqual(
                    action, data.action
                ) && Intrinsics.areEqual(ref, data.ref)
            }
            return false
        }

        override fun hashCode(): Int {
            val str = id
            val hashCode = (str?.hashCode() ?: 0) * 31
            val str2 = favs
            val hashCode2 = (hashCode + (str2?.hashCode() ?: 0)) * 31
            val list = server
            val hashCode3 = (hashCode2 + (list?.hashCode() ?: 0)) * 31
            val str3 = season
            val hashCode4 = (hashCode3 + (str3?.hashCode() ?: 0)) * 31
            val str4 = episode
            val hashCode5 = (hashCode4 + (str4?.hashCode() ?: 0)) * 31
            val str5 = action
            val hashCode6 = (hashCode5 + (str5?.hashCode() ?: 0)) * 31
            val str6 = ref
            return hashCode6 + (str6?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "Data(id=" + id + ", favs=" + favs + ", server=" + server + ", season=" + season + ", episode=" + episode + ", action=" + action + ", ref=" + ref + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                data: Data,
                str: String,
                str2: String,
                list: List,
                str3: String,
                str4: String,
                str5: String,
                str6: String,
                i: Int,
                obj: Object?
            ): Data {
                var str = str
                var str2 = str2
                var str3 = str3
                var str4 = str4
                var str5 = str5
                var str6 = str6
                if (i and 1 != 0) {
                    str = data.id
                }
                if (i and 2 != 0) {
                    str2 = data.favs
                }
                val str7 = str2
                var list2: List<Server?> = list
                if (i and 4 != 0) {
                    list2 = data.server
                }
                val list3: List = list2
                if (i and 8 != 0) {
                    str3 = data.season
                }
                val str8 = str3
                if (i and 16 != 0) {
                    str4 = data.episode
                }
                val str9 = str4
                if (i and 32 != 0) {
                    str5 = data.action
                }
                val str10 = str5
                if (i and 64 != 0) {
                    str6 = data.ref
                }
                return data.copy(str, str7, list3, str8, str9, str10, str6)
            }
        }
    }

    /* compiled from: HDrezkaProvider.kt */
    @Metadata(
        m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/HDrezkaProvider\$Trailer;", "", "success", "", "code", "", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getSuccess", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;)Lcom/lagradost/cloudstream3/movieproviders/HDrezkaProvider\$Trailer;", "equals", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Trailer(
        @param:JsonProperty("success") val success: Boolean, @param:JsonProperty(
            "code"
        ) val code: String
    ) {
        operator fun component1(): Boolean {
            return success
        }

        operator fun component2(): String {
            return code
        }

        fun copy(
            @JsonProperty("success") bool: Boolean,
            @JsonProperty("code") str: String
        ): Trailer {
            return Trailer(bool, str)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Trailer) {
                val trailer = obj as Trailer
                return Intrinsics.areEqual(success, trailer.success) && Intrinsics.areEqual(
                    code, trailer.code
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val bool = success
            val hashCode = (bool?.hashCode() ?: 0) * 31
            val str = code
            return hashCode + (str?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "Trailer(success=" + success + ", code=" + code + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                trailer: Trailer,
                bool: Boolean,
                str: String,
                i: Int,
                obj: Object?
            ): Trailer {
                var bool = bool
                var str = str
                if (i and 1 != 0) {
                    bool = trailer.success
                }
                if (i and 2 != 0) {
                    str = trailer.code
                }
                return trailer.copy(bool, str)
            }
        }
    }

    companion object {
        private fun `decryptStreamUrl$getTrash`(list: List<String>, i: Int): List<String> {
            val arrayList = ArrayList()
            var i2 = 1
            if (1 <= i) {
                while (true) {
                    arrayList.add(list)
                    if (i2 == i) {
                        break
                    }
                    i2++
                }
            }
            val it: Iterator = arrayList.iterator()
            if (!it.hasNext()) {
                throw UnsupportedOperationException("Empty collection can't be reduced.")
            }
            var next: ArrayList = it.next()
            while (it.hasNext()) {
                val arrayList2 = ArrayList()
                for (str in next) {
                    val it2: Iterator = it.next().iterator()
                    while (it2.hasNext()) {
                        arrayList2.add(str + it2.next() as String)
                    }
                }
                next = arrayList2
            }
            return next
        }
    }
}