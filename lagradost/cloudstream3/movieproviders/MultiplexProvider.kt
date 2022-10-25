package com.lagradost.cloudstream3.movieproviders

import com.google.firebase.messaging.Constants
import org.jsoup.nodes.Element
import java.util.Set
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: MultiplexProvider.kt */
@Metadata(
    m108d1 = ["\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u00012B\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010\u001a\u001a\u00020\u001bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010 JI\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020'0%H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010*J\u001f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010.\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010 J\u000c\u0010/\u001a\u00020-*\u000200H\u0002J\u000c\u00101\u001a\u00020-*\u000200H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u000c\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000c\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000c\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/MultiplexProvider;", "Lcom/lagradost/cloudstream3/MainAPI;", "()V", "hasDownloadSupport", "", "getHasDownloadSupport", "()Z", "hasMainPage", "getHasMainPage", "lang", "", "getLang", "()Ljava/lang/String;", "setLang", "(Ljava/lang/String;)V", "mainUrl", "getMainUrl", "setMainUrl", "name", "getName", "setName", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "getMainPage", "Lcom/lagradost/cloudstream3/HomePageResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "", "Lcom/lagradost/cloudstream3/SearchResponse;", "query", "toBottomSearchResult", "Lorg/jsoup/nodes/Element;", "toSearchResult", "ResponseSource", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class MultiplexProvider : MainAPI() {
    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var mainUrl = "https://146.19.24.137"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var name = "Multiplex"
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */ /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */ /* JADX WARN: Removed duplicated region for block: B:33:0x0113  */ /* JADX WARN: Removed duplicated region for block: B:45:0x018f  */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun getMainPage(r29: Continuation<in HomePageResponse?>?): Any? {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.MultiplexProvider.getMainPage(kotlin.coroutines.Continuation):java.lang.Object")
    }

    private fun toSearchResult(element: Element): SearchResponse {
        val selectFirst: Element = element.selectFirst("h2.entry-title > a")
        Intrinsics.checkNotNull(selectFirst)
        val text: String = selectFirst.text()
        Intrinsics.checkNotNullExpressionValue(
            text,
            "this.selectFirst(\"h2.entry-title > a\")!!.text()"
        )
        val obj: String = StringsKt.trim(text as CharSequence).toString()
        val selectFirst2: Element = element.selectFirst("a")
        Intrinsics.checkNotNull(selectFirst2)
        val href: String = selectFirst2.attr(ShareConstants.WEB_DIALOG_PARAM_HREF)
        val multiplexProvider = this
        val selectFirst3: Element = element.selectFirst("a > img")
        val fixUrl: String =
            MainAPIKt.fixUrl(multiplexProvider, String.valueOf(selectFirst3?.attr("data-src")))
        val text2: String = element.select("div.gmr-quality-item > a").text()
        Intrinsics.checkNotNullExpressionValue(
            text2,
            "this.select(\"div.gmr-quality-item > a\").text()"
        )
        val qualityFromString: SearchQuality =
            MainAPIKt.getQualityFromString(StringsKt.trim(text2 as CharSequence).toString())
        if (qualityFromString == null) {
            val text3: String = element.select("div.gmr-numbeps > span").text()
            Intrinsics.checkNotNullExpressionValue(
                text3,
                "this.select(\"div.gmr-numbeps > span\").text()"
            )
            val intOrNull: Integer = StringsKt.toIntOrNull(text3)
            Intrinsics.checkNotNullExpressionValue(href, "href")
            return MainAPIKt.`newAnimeSearchResponse$default`(
                multiplexProvider,
                obj,
                href,
                TvType.TvSeries,
                false,
                `MultiplexProvider$toSearchResult$1`(fixUrl, intOrNull),
                8,
                null
            )
        }
        Intrinsics.checkNotNullExpressionValue(href, "href")
        return MainAPIKt.`newMovieSearchResponse$default`(
            multiplexProvider,
            obj,
            href,
            TvType.Movie,
            false,
            `MultiplexProvider$toSearchResult$2`(fixUrl, qualityFromString),
            8,
            null
        )
    }

    private fun toBottomSearchResult(element: Element): SearchResponse {
        val selectFirst: Element = element.selectFirst("a > span.idmuvi-rp-title")
        Intrinsics.checkNotNull(selectFirst)
        val text: String = selectFirst.text()
        Intrinsics.checkNotNullExpressionValue(
            text,
            "this.selectFirst(\"a > sp…dmuvi-rp-title\")!!.text()"
        )
        val obj: String = StringsKt.trim(text as CharSequence).toString()
        val selectFirst2: Element = element.selectFirst("a")
        Intrinsics.checkNotNull(selectFirst2)
        val href: String = selectFirst2.attr(ShareConstants.WEB_DIALOG_PARAM_HREF)
        val multiplexProvider = this
        val selectFirst3: Element = element.selectFirst("a > img")
        val fixUrl: String =
            MainAPIKt.fixUrl(multiplexProvider, String.valueOf(selectFirst3?.attr("data-src")))
        Intrinsics.checkNotNullExpressionValue(href, "href")
        return MainAPIKt.`newMovieSearchResponse$default`(
            multiplexProvider,
            obj,
            href,
            TvType.Movie,
            false,
            `MultiplexProvider$toBottomSearchResult$1`(fixUrl),
            8,
            null
        )
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */ /* JADX WARN: Removed duplicated region for block: B:21:0x00af A[LOOP:0: B:19:0x00a9->B:21:0x00af, LOOP_END] */
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
            boolean r2 = r1 instanceof com.lagradost.cloudstream3.movieproviders.MultiplexProvider$search$1
            if (r2 == 0) goto L18
            r2 = r1
            com.lagradost.cloudstream3.movieproviders.MultiplexProvider$search$1 r2 = (com.lagradost.cloudstream3.movieproviders.MultiplexProvider$search$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r1 = r2.label
            int r1 = r1 - r4
            r2.label = r1
            goto L1d
        L18:
            com.lagradost.cloudstream3.movieproviders.MultiplexProvider$search$1 r2 = new com.lagradost.cloudstream3.movieproviders.MultiplexProvider$search$1
            r2.<init>(r0, r1)
        L1d:
            java.lang.Object r1 = r2.result
            java.lang.Object r15 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r2.label
            r4 = 1
            if (r3 == 0) goto L3a
            if (r3 != r4) goto L32
            java.lang.Object r2 = r2.L$0
            com.lagradost.cloudstream3.movieproviders.MultiplexProvider r2 = (com.lagradost.cloudstream3.movieproviders.MultiplexProvider) r2
            kotlin.ResultKt.throwOnFailure(r1)
            goto L85
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
            java.lang.String r3 = "&post_type[]=post&post_type[]=tv"
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
            if (r2 != r1) goto L83
            return r1
        L83:
            r1 = r2
            r2 = r0
        L85:
            com.lagradost.nicehttp.NiceResponse r1 = (com.lagradost.nicehttp.NiceResponse) r1
            org.jsoup.nodes.Document r1 = r1.getDocument()
            java.lang.String r3 = "div#gmr-main-load > article.item"
            org.jsoup.select.Elements r1 = r1.select(r3)
            java.lang.String r3 = "document.select(\"div#gmr…ain-load > article.item\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r4)
            r3.<init>(r4)
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r1 = r1.iterator()
        La9:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Lc2
            java.lang.Object r4 = r1.next()
            org.jsoup.nodes.Element r4 = (org.jsoup.nodes.Element) r4
            java.lang.String r5 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            com.lagradost.cloudstream3.SearchResponse r4 = r2.toSearchResult(r4)
            r3.add(r4)
            goto La9
        Lc2:
            java.util.List r3 = (java.util.List) r3
            return r3
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.MultiplexProvider.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */ /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */ /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */ /* JADX WARN: Removed duplicated region for block: B:33:0x00df A[LOOP:0: B:31:0x00d9->B:33:0x00df, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:36:0x011b  */ /* JADX WARN: Removed duplicated region for block: B:37:0x011e  */ /* JADX WARN: Removed duplicated region for block: B:46:0x0144  */ /* JADX WARN: Removed duplicated region for block: B:47:0x014b  */ /* JADX WARN: Removed duplicated region for block: B:67:0x01cc A[LOOP:2: B:65:0x01c6->B:67:0x01cc, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:70:0x01e6  */ /* JADX WARN: Removed duplicated region for block: B:75:0x02b6  */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun load(r31: String?, r32: Continuation<in LoadResponse?>?): Any {
        /*
            Method dump skipped, instructions count: 723
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.MultiplexProvider.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: MultiplexProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/MultiplexProvider\$ResponseSource;", "", "file", "", "type", Constants.ScionAnalytics.PARAM_LABEL, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFile", "()Ljava/lang/String;", "getLabel", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class ResponseSource(
        @JsonProperty("file") file: String,
        @JsonProperty("type") str: String,
        @JsonProperty("label") str2: String
    ) {
        val file: String
        val label: String
        val type: String
        operator fun component1(): String {
            return file
        }

        operator fun component2(): String {
            return type
        }

        operator fun component3(): String {
            return label
        }

        fun copy(
            @JsonProperty("file") file: String,
            @JsonProperty("type") str: String,
            @JsonProperty("label") str2: String
        ): ResponseSource {
            Intrinsics.checkNotNullParameter(file, "file")
            return ResponseSource(file, str, str2)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is ResponseSource) {
                val responseSource = obj as ResponseSource
                return Intrinsics.areEqual(file, responseSource.file) && Intrinsics.areEqual(
                    type, responseSource.type
                ) && Intrinsics.areEqual(label, responseSource.label)
            }
            return false
        }

        override fun hashCode(): Int {
            val hashCode = file.hashCode() * 31
            val str = type
            val hashCode2 = (hashCode + (str?.hashCode() ?: 0)) * 31
            val str2 = label
            return hashCode2 + (str2?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "ResponseSource(file=" + file + ", type=" + type + ", label=" + label + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(file, "file")
            this.file = file
            type = str
            label = str2
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                responseSource: ResponseSource,
                str: String,
                str2: String,
                str3: String,
                i: Int,
                obj: Object?
            ): ResponseSource {
                var str = str
                var str2 = str2
                var str3 = str3
                if (i and 1 != 0) {
                    str = responseSource.file
                }
                if (i and 2 != 0) {
                    str2 = responseSource.type
                }
                if (i and 4 != 0) {
                    str3 = responseSource.label
                }
                return responseSource.copy(str, str2, str3)
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */ /* JADX WARN: Removed duplicated region for block: B:20:0x00b6  */ /* JADX WARN: Removed duplicated region for block: B:26:0x0183 A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:27:0x0184  */ /* JADX WARN: Removed duplicated region for block: B:30:0x01e4 A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:31:0x01e5  */ /* JADX WARN: Removed duplicated region for block: B:35:0x0211  */ /* JADX WARN: Removed duplicated region for block: B:44:0x0274  */ /* JADX WARN: Removed duplicated region for block: B:47:0x0291  */ /* JADX WARN: Removed duplicated region for block: B:54:0x030f A[LOOP:0: B:52:0x0309->B:54:0x030f, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:56:0x0378  */ /* JADX WARN: Removed duplicated region for block: B:59:0x038a  */ /* JADX WARN: Type inference failed for: r3v42, types: [java.util.Collection] */ /* JADX WARN: Type inference failed for: r4v27, types: [java.util.Collection] */ /* JADX WARN: Type inference failed for: r7v17, types: [java.util.Collection] */ /* JADX WARN: Type inference failed for: r8v18, types: [java.util.Collection] */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0274 -> B:45:0x028b). Please submit an issue!!! */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x02d9 -> B:51:0x02e3). Please submit an issue!!! */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x037f -> B:58:0x0380). Please submit an issue!!! */
    @Override // com.lagradost.cloudstream3.MainAPI
            /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */    fun loadLinks(
        r44: String?,
        r45: Boolean,
        r46: Function1<SubtitleFile?, Unit>?,
        r47: Function1<ExtractorLink?, Unit>?,
        r48: Continuation<in Boolean?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 913
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.MultiplexProvider.loadLinks(java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
    }
}