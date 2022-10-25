package com.lagradost.cloudstream3.animeproviders

import android.util.Log
import com.lagradost.cloudstream3.Actor
import okhttp3.Request
import okhttp3.Response
import org.jsoup.nodes.Element
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: ZoroProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 G2\u00020\u0001:\u0004GHIJB\u0005¢\u0006\u0002\u0010\u0002J\u001b\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0012H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010,J\u0011\u0010-\u001a\u00020.H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010/J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0016J\u0019\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010,JI\u00107\u001a\u00020\b2\u0006\u00108\u001a\u00020\u00122\u0006\u00109\u001a\u00020\b2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020*0;2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020*0;H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010>J\u001f\u0010?\u001a\b\u0012\u0004\u0012\u00020A0@2\u0006\u0010B\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010,J\u0010\u0010C\u001a\u0004\u0018\u00010D*\u0004\u0018\u00010EH\u0002J\u000e\u0010F\u001a\u0004\u0018\u00010A*\u00020EH\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\nR\u0014\u0010\r\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\u00020\u0012X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0012X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R:\u0010\u001a\u001a\"\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u001bj\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0012`\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006K"],
    m107d2 = ["Lcom/lagradost/cloudstream3/animeproviders/ZoroProvider;", "Lcom/lagradost/cloudstream3/MainAPI;", "()V", "epRegex", "Lkotlin/text/Regex;", "getEpRegex", "()Lkotlin/text/Regex;", "hasChromecastSupport", "", "getHasChromecastSupport", "()Z", "hasDownloadSupport", "getHasDownloadSupport", "hasMainPage", "getHasMainPage", "hasQuickSearch", "getHasQuickSearch", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "sid", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getSid", "()Ljava/util/HashMap;", "setSid", "(Ljava/util/HashMap;)V", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "usesWebView", "getUsesWebView", "extractorVerifierJob", "", "extractorData", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMainPage", "Lcom/lagradost/cloudstream3/HomePageResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVideoInterceptor", "Lokhttp3/Interceptor;", "extractorLink", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "callback", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "", "Lcom/lagradost/cloudstream3/SearchResponse;", "query", "getActor", "Lcom/lagradost/cloudstream3/Actor;", "Lorg/jsoup/nodes/Element;", "toSearchResult", "Companion", "RapidCloudResponse", "Response", "ZoroSyncData", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class ZoroProvider : MainAPI() {
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasQuickSearch = false

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var mainUrl = "https://zoro.to"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var name = "Zoro"
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
    val hasChromecastSupport = true

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasDownloadSupport = true

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val usesWebView = true

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val supportedTypes: Set<TvType> = SetsKt.setOf<Object>(
        *arrayOf<TvType>(
            TvType.Anime,
            TvType.AnimeMovie,
            TvType.OVA
        ) as Array<Object>
    )
    val epRegex: Regex = Regex("Ep (\\d+)/")
    private var sid: HashMap<Integer, String> = HashMap()

    /* compiled from: ZoroProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\t"],
        m107d2 = ["Lcom/lagradost/cloudstream3/animeproviders/ZoroProvider\$Companion;", "", "()V", "getStatus", "Lcom/lagradost/cloudstream3/ShowStatus;", "t", "", "getType", "Lcom/lagradost/cloudstream3/TvType;", "app_release"],
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
                    "Finished Airing"
                )
            ) ShowStatus.Completed else if (Intrinsics.areEqual(
                    t,
                    "Currently Airing"
                )
            ) ShowStatus.Ongoing else ShowStatus.Completed
        }
    }

    private fun toSearchResult(element: Element): SearchResponse? {
        var text: String?
        var `find$default`: MatchResult
        var groupValues: List<String>
        var str: String?
        val zoroProvider = this
        val attr: String = element.select("a").attr(ShareConstants.WEB_DIALOG_PARAM_HREF)
        Intrinsics.checkNotNullExpressionValue(attr, "this.select(\"a\").attr(\"href\")")
        val fixUrl: String = MainAPIKt.fixUrl(zoroProvider, attr)
        val title: String = element.select("h3.film-name").text()
        val dubSub: String = element.select(".film-poster > .tick.ltr").text()
        Intrinsics.checkNotNullExpressionValue(dubSub, "dubSub")
        val contains: Boolean = StringsKt.contains(
            dubSub as CharSequence,
            MediaTrack.ROLE_DUB as CharSequence,
            true
        )
        val contains2: Boolean = StringsKt.contains(
            dubSub as CharSequence,
            "sub" as CharSequence,
            true
        )
        val selectFirst: Element = element.selectFirst(".film-poster > .tick.rtl > .tick-eps")
        val intOrNull: Integer? = if (selectFirst == null || selectFirst.text()
                .also { text = it } == null || Regex.`find$default`(
                epRegex, text, 0, 2, null
            ).also {
                `find$default` = it
            } == null || `find$default`.groupValues.also {
                groupValues = it
            } == null || groupValues[1].also { str = it } == null
        ) null else StringsKt.toIntOrNull(str)
        if (!StringsKt.`contains$default`(
                fixUrl as CharSequence,
                "/news/" as CharSequence,
                false,
                2,
                null as Object?
            )
        ) {
            Intrinsics.checkNotNullExpressionValue(title, "title")
            if (!StringsKt.equals(StringsKt.trim(title as CharSequence).toString(), "News", true)) {
                val attr2: String = element.select("img").attr("data-src")
                Intrinsics.checkNotNullExpressionValue(
                    attr2,
                    "this.select(\"img\").attr(\"data-src\")"
                )
                val fixUrl2: String = MainAPIKt.fixUrl(zoroProvider, attr2)
                val companion: Companion = ZoroProvider.Companion.Companion
                val text2: String = element.select("div.fd-infor > span.fdi-item").text()
                Intrinsics.checkNotNullExpressionValue(
                    text2,
                    "this.select(\"div.fd-infor > span.fdi-item\").text()"
                )
                return MainAPIKt.`newAnimeSearchResponse$default`(
                    zoroProvider,
                    title,
                    fixUrl,
                    companion.getType(text2),
                    false,
                    `ZoroProvider$toSearchResult$1`(fixUrl2, contains, contains2, intOrNull),
                    8,
                    null
                )
            }
        }
        return null
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */ /* JADX WARN: Removed duplicated region for block: B:21:0x00a8  */ /* JADX WARN: Removed duplicated region for block: B:33:0x012d  */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun getMainPage(r29: Continuation<in HomePageResponse?>?): Any? {
        /*
            Method dump skipped, instructions count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.animeproviders.ZoroProvider.getMainPage(kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: ZoroProvider.kt */
    @Metadata(
        m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000c\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"],
        m107d2 = ["Lcom/lagradost/cloudstream3/animeproviders/ZoroProvider\$Response;", "", "status", "", "html", "", "(ZLjava/lang/String;)V", "getHtml", "()Ljava/lang/String;", "getStatus", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Response(@JsonProperty("status") z: Boolean, @JsonProperty("html") html: String) {
        val html: String
        val status: Boolean
        operator fun component1(): Boolean {
            return status
        }

        operator fun component2(): String {
            return html
        }

        fun copy(@JsonProperty("status") z: Boolean, @JsonProperty("html") html: String): Response {
            Intrinsics.checkNotNullParameter(html, "html")
            return Response(z, html)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Response) {
                val response = obj as Response
                return status == response.status && Intrinsics.areEqual(html, response.html)
            }
            return false
        }

        /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Type inference failed for: r0v1, types: [int] */ /* JADX WARN: Type inference failed for: r0v4 */ /* JADX WARN: Type inference failed for: r0v5 */
        override fun hashCode(): Int {
            val z = status
            r0 = z
            if (z) {
                r0 = 1
            }
            return r0 * 31 + html.hashCode()
        }

        override fun toString(): String {
            return "Response(status=" + status + ", html=" + html + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(html, "html")
            status = z
            this.html = html
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                response: Response,
                z: Boolean,
                str: String,
                i: Int,
                obj: Object?
            ): Response {
                var z = z
                var str = str
                if (i and 1 != 0) {
                    z = response.status
                }
                if (i and 2 != 0) {
                    str = response.html
                }
                return response.copy(z, str)
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0159, code lost:
        if ((r5 != null ? kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r5, (java.lang.CharSequence) "RAW", false, 2, (java.lang.Object) null) : false) != false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */ /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */ /* JADX WARN: Removed duplicated region for block: B:44:0x0125  */ /* JADX WARN: Removed duplicated region for block: B:45:0x012a  */ /* JADX WARN: Removed duplicated region for block: B:47:0x012d  */ /* JADX WARN: Removed duplicated region for block: B:48:0x0139  */ /* JADX WARN: Removed duplicated region for block: B:50:0x013c  */ /* JADX WARN: Removed duplicated region for block: B:51:0x0148  */ /* JADX WARN: Removed duplicated region for block: B:53:0x014b  */ /* JADX WARN: Removed duplicated region for block: B:60:0x0166  */ /* JADX WARN: Removed duplicated region for block: B:66:0x016a A[SYNTHETIC] */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun search(
        r20: String?,
        r21: Continuation<in MutableList<out SearchResponse?>?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.animeproviders.ZoroProvider.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    private fun getActor(element: Element?): Actor? {
        var selectFirst: Element
        var selectFirst2: Element
        val fixUrlNull: String = MainAPIKt.fixUrlNull(this,
            if (element == null || element.selectFirst(".pi-avatar > img")
                    .also { selectFirst2 = it } == null
            ) null else selectFirst2.attr("data-src")
        )
            ?: return null
        val text: String = (if (element == null || element.selectFirst(".pi-detail > .pi-name")
                .also { selectFirst = it } == null
        ) null else selectFirst.text())
            ?: return null
        return Actor(text, fixUrlNull)
    }

    /* compiled from: ZoroProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000c\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"],
        m107d2 = ["Lcom/lagradost/cloudstream3/animeproviders/ZoroProvider\$ZoroSyncData;", "", "malId", "", "aniListId", "(Ljava/lang/String;Ljava/lang/String;)V", "getAniListId", "()Ljava/lang/String;", "getMalId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class ZoroSyncData(
        @param:JsonProperty("mal_id") val malId: String, @param:JsonProperty(
            "anilist_id"
        ) val aniListId: String
    ) {
        operator fun component1(): String {
            return malId
        }

        operator fun component2(): String {
            return aniListId
        }

        fun copy(
            @JsonProperty("mal_id") str: String,
            @JsonProperty("anilist_id") str2: String
        ): ZoroSyncData {
            return ZoroSyncData(str, str2)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is ZoroSyncData) {
                val zoroSyncData = obj as ZoroSyncData
                return Intrinsics.areEqual(malId, zoroSyncData.malId) && Intrinsics.areEqual(
                    aniListId, zoroSyncData.aniListId
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val str = malId
            val hashCode = (str?.hashCode() ?: 0) * 31
            val str2 = aniListId
            return hashCode + (str2?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "ZoroSyncData(malId=" + malId + ", aniListId=" + aniListId + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                zoroSyncData: ZoroSyncData,
                str: String,
                str2: String,
                i: Int,
                obj: Object?
            ): ZoroSyncData {
                var str = str
                var str2 = str2
                if (i and 1 != 0) {
                    str = zoroSyncData.malId
                }
                if (i and 2 != 0) {
                    str2 = zoroSyncData.aniListId
                }
                return zoroSyncData.copy(str, str2)
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */ /* JADX WARN: Removed duplicated region for block: B:132:0x043b  */ /* JADX WARN: Removed duplicated region for block: B:137:0x0467  */ /* JADX WARN: Removed duplicated region for block: B:166:0x00de A[EXC_TOP_SPLITTER, SYNTHETIC] */ /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */ /* JADX WARN: Removed duplicated region for block: B:171:0x043e A[SYNTHETIC] */ /* JADX WARN: Removed duplicated region for block: B:22:0x00d4  */ /* JADX WARN: Removed duplicated region for block: B:23:0x00d9  */ /* JADX WARN: Removed duplicated region for block: B:30:0x00fb  */ /* JADX WARN: Removed duplicated region for block: B:31:0x0100  */ /* JADX WARN: Removed duplicated region for block: B:34:0x010d  */ /* JADX WARN: Removed duplicated region for block: B:35:0x0115  */ /* JADX WARN: Removed duplicated region for block: B:39:0x013a A[LOOP:3: B:37:0x0134->B:39:0x013a, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:43:0x016a  */ /* JADX WARN: Removed duplicated region for block: B:84:0x0249  */ /* JADX WARN: Removed duplicated region for block: B:85:0x024e  */ /* JADX WARN: Removed duplicated region for block: B:88:0x02f9 A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:89:0x02fa  */ /* JADX WARN: Removed duplicated region for block: B:93:0x0352 A[LOOP:0: B:91:0x034a->B:93:0x0352, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:97:0x038f  */ /* JADX WARN: Type inference failed for: r0v17, types: [com.lagradost.cloudstream3.ShowStatus, T] */ /* JADX WARN: Type inference failed for: r0v23, types: [T, java.lang.String] */ /* JADX WARN: Type inference failed for: r0v34, types: [T, java.lang.Integer] */ /* JADX WARN: Type inference failed for: r0v63 */ /* JADX WARN: Type inference failed for: r0v65, types: [T] */ /* JADX WARN: Type inference failed for: r0v76 */ /* JADX WARN: Type inference failed for: r0v77 */ /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.String] */ /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.String] */ /* JADX WARN: Type inference failed for: r12v7 */ /* JADX WARN: Type inference failed for: r12v8, types: [org.jsoup.nodes.Element] */ /* JADX WARN: Type inference failed for: r12v9 */ /* JADX WARN: Type inference failed for: r34v1 */ /* JADX WARN: Type inference failed for: r34v2, types: [java.lang.String] */ /* JADX WARN: Type inference failed for: r38v0 */ /* JADX WARN: Type inference failed for: r38v1, types: [java.lang.String] */ /* JADX WARN: Type inference failed for: r3v45 */ /* JADX WARN: Type inference failed for: r3v46, types: [org.jsoup.nodes.Element] */ /* JADX WARN: Type inference failed for: r7v14, types: [java.util.List] */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun load(r50: String?, r51: Continuation<in LoadResponse?>?): Any {
        /*
            Method dump skipped, instructions count: 1293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.animeproviders.ZoroProvider.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: ZoroProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"],
        m107d2 = ["Lcom/lagradost/cloudstream3/animeproviders/ZoroProvider\$RapidCloudResponse;", "", "link", "", "(Ljava/lang/String;)V", "getLink", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class RapidCloudResponse(@JsonProperty("link") link: String) {
        val link: String
        operator fun component1(): String {
            return link
        }

        fun copy(@JsonProperty("link") link: String): RapidCloudResponse {
            Intrinsics.checkNotNullParameter(link, "link")
            return RapidCloudResponse(link)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is RapidCloudResponse && Intrinsics.areEqual(
                link,
                (obj as RapidCloudResponse).link
            )
        }

        override fun hashCode(): Int {
            return link.hashCode()
        }

        override fun toString(): String {
            return "RapidCloudResponse(link=" + link + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(link, "link")
            this.link = link
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                rapidCloudResponse: RapidCloudResponse,
                str: String,
                i: Int,
                obj: Object?
            ): RapidCloudResponse {
                var str = str
                if (i and 1 != 0) {
                    str = rapidCloudResponse.link
                }
                return rapidCloudResponse.copy(str)
            }
        }
    }

    @Override // com.lagradost.cloudstream3.MainAPI
    override fun extractorVerifierJob(str: String?, continuation: Continuation<in Unit>?): Object {
        val name = name
        Log.d(name, "Starting $name job!")
        val runSflixExtractorVerifierJob: Object =
            SflixProvider.Companion.runSflixExtractorVerifierJob(
                this,
                str,
                "https://rapid-cloud.ru/",
                continuation
            )
        return if (runSflixExtractorVerifierJob === IntrinsicsKt.getCOROUTINE_SUSPENDED()) runSflixExtractorVerifierJob else Unit.INSTANCE
    }

    fun getSid(): HashMap<Integer, String> {
        return sid
    }

    fun setSid(hashMap: HashMap<Integer?, String?>) {
        Intrinsics.checkNotNullParameter(hashMap, "<set-?>")
        sid = hashMap
    }

    @Override // com.lagradost.cloudstream3.MainAPI
    fun getVideoInterceptor(extractorLink: ExtractorLink?): Interceptor? {
        Intrinsics.checkNotNullParameter(extractorLink, "extractorLink")
        return object : Interceptor {
            // from class: com.lagradost.cloudstream3.animeproviders.-$$Lambda$ZoroProvider$g52fd72XTyEcxWLUkSA_Rt71xHE
            @Override // okhttp3.Interceptor
            override fun intercept(chain: Interceptor.Chain): Response {
                val `m8600getVideoInterceptor$lambda14`: Response
                `m8600getVideoInterceptor$lambda14` =
                    ZoroProvider.Companion.`m8600getVideoInterceptor$lambda14`(
                        this@ZoroProvider,
                        extractorLink,
                        chain
                    )
                return `m8600getVideoInterceptor$lambda14`
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */ /* JADX WARN: Removed duplicated region for block: B:21:0x00fb  */ /* JADX WARN: Removed duplicated region for block: B:29:0x013b  */
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
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.animeproviders.ZoroProvider.loadLinks(java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
    }

    companion object {
        val Companion = Companion(null)

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: getVideoInterceptor$lambda-14  reason: not valid java name */
        fun `m8600getVideoInterceptor$lambda14`(
            `this$0`: ZoroProvider,
            extractorLink: ExtractorLink,
            chain: Interceptor.Chain
        ): okhttp3.Response {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(extractorLink, "\$extractorLink")
            Intrinsics.checkNotNullParameter(chain, "chain")
            val request: Request = chain.request()
            if (StringsKt.`endsWith$default`(
                    request.url().toString(),
                    ".ts",
                    false,
                    2,
                    null as Object?
                ) && !Intrinsics.areEqual(
                    request.method(),
                    "OPTIONS"
                ) && !StringsKt.`contains$default`(
                    request.url().toString() as CharSequence,
                    "betterstream" as CharSequence,
                    false,
                    2,
                    null as Object?
                )
            ) {
                val newBuilder: Request.Builder = chain.request().newBuilder()
                val sid: String = `this$0`.sid.get(Integer.valueOf(extractorLink.url.hashCode()))
                if (sid != null) {
                    Intrinsics.checkNotNullExpressionValue(sid, "sid")
                    newBuilder.addHeader("SID", sid)
                }
                val build = newBuilder.build()
                Coroutines.INSTANCE.ioSafe(
                    `ZoroProvider$getVideoInterceptor$1$1`(
                        request.newBuilder().method("OPTIONS", request.body()).build(), null
                    )
                )
                return chain.proceed(build)
            }
            return chain.proceed(chain.request())
        }
    }
}