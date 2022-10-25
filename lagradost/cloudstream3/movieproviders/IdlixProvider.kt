package com.lagradost.cloudstream3.movieproviders

import com.google.firebase.messaging.Constants
import org.jsoup.nodes.Element
import java.util.List
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: IdlixProvider.kt */
@Metadata(
    m108d1 = ["\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\b;<=>?@ABB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\nH\u0002J\u0011\u0010\u001c\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\nH\u0002JA\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\n2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\"0%2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\"0%H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010)JA\u0010*\u001a\u00020\"2\u0006\u0010#\u001a\u00020\n2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\"0%2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\"0%H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010)JA\u0010+\u001a\u00020\"2\u0006\u0010#\u001a\u00020\n2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\"0%2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\"0%H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010)J\u0019\u0010,\u001a\u00020-2\u0006\u0010#\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010.JI\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\u00042\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\"0%2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\"0%H\u0096@ø\u0001\u0000¢\u0006\u0002\u00104J\u001f\u00105\u001a\b\u0012\u0004\u0012\u000207062\u0006\u00108\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010.J\u000c\u00109\u001a\u000207*\u00020:H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u000c\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000c\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000c\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006C"],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/IdlixProvider;", "Lcom/lagradost/cloudstream3/MainAPI;", "()V", "hasDownloadSupport", "", "getHasDownloadSupport", "()Z", "hasMainPage", "getHasMainPage", "lang", "", "getLang", "()Ljava/lang/String;", "setLang", "(Ljava/lang/String;)V", "mainUrl", "getMainUrl", "setMainUrl", "name", "getName", "setName", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "getLanguage", "str", "getMainPage", "Lcom/lagradost/cloudstream3/HomePageResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProperLink", ShareConstants.MEDIA_URI, "invokeCdnSource", "", "url", "subCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "sourceCallback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invokeLaviolaSource", "invokeLokalSource", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLinks", "data", "isCasting", "subtitleCallback", "callback", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "", "Lcom/lagradost/cloudstream3/SearchResponse;", "query", "toSearchResult", "Lorg/jsoup/nodes/Element;", "Captions", "Data", "Player", "ResponseCdn", "ResponseHash", "ResponseLaviolaSource", "ResponseSource", "Tracks", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class IdlixProvider : MainAPI() {
    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var mainUrl = "https://94.103.82.88"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var name = "Idlix"
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
    val supportedTypes: Set<TvType> =
        SetsKt.setOf<Object>(*arrayOf<TvType>(TvType.Movie, TvType.TvSeries) as Array<Object>)

    @Override // com.lagradost.cloudstream3.MainAPI
    override fun getLang(): String? {
        return lang
    }

    @Override // com.lagradost.cloudstream3.MainAPI
    override fun setLang(str: String) {
        Intrinsics.checkNotNullParameter(str, "<set-?>")
        lang = str
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */ /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun getMainPage(r29: Continuation<in HomePageResponse?>?): Any? {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.IdlixProvider.getMainPage(kotlin.coroutines.Continuation):java.lang.Object")
    }

    private fun getProperLink(str: String): String {
        var groupValues: List<String?>
        var groupValues2: List<String?>
        var str3: String? = null
        return if (StringsKt.`contains$default`(
                str as CharSequence,
                "/episode/" as CharSequence,
                false,
                2,
                null as Object?
            )
        ) {
            val `find$default` = Regex.`find$default`(
                Regex("(.+?)-season"),
                StringsKt.`substringAfter$default`(
                    str,
                    "$mainUrl/episode/",
                    null as String?,
                    2,
                    null as Object?
                ),
                0,
                2,
                null
            )
            if (`find$default` != null && `find$default`.groupValues.also {
                    groupValues2 = it
                } != null) {
                str3 = groupValues2[1]
            }
            val valueOf: String = String.valueOf(str3)
            "$mainUrl/tvseries/$valueOf"
        } else if (StringsKt.`contains$default`(
                str as CharSequence,
                "/season/" as CharSequence,
                false,
                2,
                null as Object?
            )
        ) {
            val `find$default2` = Regex.`find$default`(
                Regex("(.+?)-season"),
                StringsKt.`substringAfter$default`(
                    str,
                    "$mainUrl/season/",
                    null as String?,
                    2,
                    null as Object?
                ),
                0,
                2,
                null
            )
            if (`find$default2` != null && `find$default2`.groupValues.also {
                    groupValues = it
                } != null) {
                str3 = groupValues[1]
            }
            val valueOf2: String = String.valueOf(str3)
            "$mainUrl/tvseries/$valueOf2"
        } else {
            str
        }
    }

    private fun toSearchResult(element: Element): SearchResponse {
        val selectFirst: Element = element.selectFirst("h3 > a")
        Intrinsics.checkNotNull(selectFirst)
        val text: String = selectFirst.text()
        Intrinsics.checkNotNullExpressionValue(text, "this.selectFirst(\"h3 > a\")!!.text()")
        val obj: String =
            StringsKt.trim(Regex("\\(\\d{4}\\)").replace(text, "") as CharSequence).toString()
        val selectFirst2: Element = element.selectFirst("h3 > a")
        Intrinsics.checkNotNull(selectFirst2)
        val attr: String = selectFirst2.attr(ShareConstants.WEB_DIALOG_PARAM_HREF)
        Intrinsics.checkNotNullExpressionValue(
            attr,
            "this.selectFirst(\"h3 > a\")!!.attr(\"href\")"
        )
        return MainAPIKt.`newMovieSearchResponse$default`(
            this,
            obj,
            getProperLink(attr),
            TvType.Movie,
            false,
            `IdlixProvider$toSearchResult$1`(
                element.select("div.poster > img").attr("src").toString(),
                MainAPIKt.getQualityFromString(element.select("span.quality").text())
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
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.IdlixProvider.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */ /* JADX WARN: Removed duplicated region for block: B:24:0x0098  */ /* JADX WARN: Removed duplicated region for block: B:29:0x00dc A[LOOP:0: B:27:0x00d6->B:29:0x00dc, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:32:0x0117  */ /* JADX WARN: Removed duplicated region for block: B:38:0x0149  */ /* JADX WARN: Removed duplicated region for block: B:39:0x014c  */ /* JADX WARN: Removed duplicated region for block: B:42:0x016f  */ /* JADX WARN: Removed duplicated region for block: B:43:0x0176  */ /* JADX WARN: Removed duplicated region for block: B:46:0x0180  */ /* JADX WARN: Removed duplicated region for block: B:53:0x01b0 A[LOOP:1: B:51:0x01a8->B:53:0x01b0, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:57:0x0213  */ /* JADX WARN: Removed duplicated region for block: B:64:0x02a1  */ /* JADX WARN: Removed duplicated region for block: B:69:0x03a6  */ /* JADX WARN: Removed duplicated region for block: B:73:0x0298 A[EDGE_INSN: B:73:0x0298->B:62:0x0298 ?: BREAK  , SYNTHETIC] */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun load(r35: String?, r36: Continuation<in LoadResponse?>?): Any {
        /*
            Method dump skipped, instructions count: 966
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.IdlixProvider.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    private fun getLanguage(str: String): String {
        val lowerCase: String = str.toLowerCase(Locale.ROOT)
        Intrinsics.checkNotNullExpressionValue(
            lowerCase,
            "this as java.lang.String).toLowerCase(Locale.ROOT)"
        )
        if (!StringsKt.`contains$default`(
                lowerCase as CharSequence,
                "indonesia" as CharSequence,
                false,
                2,
                null as Object?
            )
        ) {
            val lowerCase2: String = str.toLowerCase(Locale.ROOT)
            Intrinsics.checkNotNullExpressionValue(
                lowerCase2,
                "this as java.lang.String).toLowerCase(Locale.ROOT)"
            )
            if (!StringsKt.`contains$default`(
                    lowerCase2 as CharSequence,
                    "bahasa" as CharSequence,
                    false,
                    2,
                    null as Object?
                )
            ) {
                return str
            }
        }
        return "Indonesian"
    }

    /* compiled from: IdlixProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000c\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/IdlixProvider\$ResponseHash;", "", "embed_url", "", "type", "(Ljava/lang/String;Ljava/lang/String;)V", "getEmbed_url", "()Ljava/lang/String;", "getType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class ResponseHash(
        @JsonProperty("embed_url") embed_url: String,
        @JsonProperty("type") str: String
    ) {
        val embed_url: String
        val type: String
        operator fun component1(): String {
            return embed_url
        }

        operator fun component2(): String {
            return type
        }

        fun copy(
            @JsonProperty("embed_url") embed_url: String,
            @JsonProperty("type") str: String
        ): ResponseHash {
            Intrinsics.checkNotNullParameter(embed_url, "embed_url")
            return ResponseHash(embed_url, str)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is ResponseHash) {
                val responseHash = obj as ResponseHash
                return Intrinsics.areEqual(
                    embed_url,
                    responseHash.embed_url
                ) && Intrinsics.areEqual(
                    type, responseHash.type
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val hashCode = embed_url.hashCode() * 31
            val str = type
            return hashCode + (str?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "ResponseHash(embed_url=" + embed_url + ", type=" + type + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(embed_url, "embed_url")
            this.embed_url = embed_url
            type = str
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                responseHash: ResponseHash,
                str: String,
                str2: String,
                i: Int,
                obj: Object?
            ): ResponseHash {
                var str = str
                var str2 = str2
                if (i and 1 != 0) {
                    str = responseHash.embed_url
                }
                if (i and 2 != 0) {
                    str2 = responseHash.type
                }
                return responseHash.copy(str, str2)
            }
        }
    }

    /* compiled from: IdlixProvider.kt */
    @Metadata(
        m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\u000b¨\u0006\u0016"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/IdlixProvider\$ResponseSource;", "", "hls", "", "videoSource", "", "securedLink", "(ZLjava/lang/String;Ljava/lang/String;)V", "getHls", "()Z", "getSecuredLink", "()Ljava/lang/String;", "getVideoSource", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class ResponseSource(
        @JsonProperty("hls") z: Boolean,
        @JsonProperty("videoSource") videoSource: String,
        @JsonProperty("securedLink") str: String
    ) {
        val hls: Boolean
        val securedLink: String
        val videoSource: String
        operator fun component1(): Boolean {
            return hls
        }

        operator fun component2(): String {
            return videoSource
        }

        operator fun component3(): String {
            return securedLink
        }

        fun copy(
            @JsonProperty("hls") z: Boolean,
            @JsonProperty("videoSource") videoSource: String,
            @JsonProperty("securedLink") str: String
        ): ResponseSource {
            Intrinsics.checkNotNullParameter(videoSource, "videoSource")
            return ResponseSource(z, videoSource, str)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is ResponseSource) {
                val responseSource = obj as ResponseSource
                return hls == responseSource.hls && Intrinsics.areEqual(
                    videoSource, responseSource.videoSource
                ) && Intrinsics.areEqual(
                    securedLink, responseSource.securedLink
                )
            }
            return false
        }

        /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Type inference failed for: r0v1, types: [int] */ /* JADX WARN: Type inference failed for: r0v6 */ /* JADX WARN: Type inference failed for: r0v7 */
        override fun hashCode(): Int {
            val z = hls
            r0 = z
            if (z) {
                r0 = 1
            }
            val hashCode: Int = (r0 * 31 + videoSource.hashCode()) * 31
            val str = securedLink
            return hashCode + (str?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "ResponseSource(hls=" + hls + ", videoSource=" + videoSource + ", securedLink=" + securedLink + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(videoSource, "videoSource")
            hls = z
            this.videoSource = videoSource
            securedLink = str
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                responseSource: ResponseSource,
                z: Boolean,
                str: String,
                str2: String,
                i: Int,
                obj: Object?
            ): ResponseSource {
                var z = z
                var str = str
                var str2 = str2
                if (i and 1 != 0) {
                    z = responseSource.hls
                }
                if (i and 2 != 0) {
                    str = responseSource.videoSource
                }
                if (i and 4 != 0) {
                    str2 = responseSource.securedLink
                }
                return responseSource.copy(z, str, str2)
            }
        }
    }

    /* compiled from: IdlixProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/IdlixProvider\$Tracks;", "", "kind", "", "file", Constants.ScionAnalytics.PARAM_LABEL, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFile", "()Ljava/lang/String;", "getKind", "getLabel", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Tracks(
        @JsonProperty("kind") str: String,
        @JsonProperty("file") file: String,
        @JsonProperty("label") str2: String
    ) {
        val file: String
        val kind: String
        val label: String
        operator fun component1(): String {
            return kind
        }

        operator fun component2(): String {
            return file
        }

        operator fun component3(): String {
            return label
        }

        fun copy(
            @JsonProperty("kind") str: String,
            @JsonProperty("file") file: String,
            @JsonProperty("label") str2: String
        ): Tracks {
            Intrinsics.checkNotNullParameter(file, "file")
            return Tracks(str, file, str2)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Tracks) {
                val tracks = obj as Tracks
                return Intrinsics.areEqual(kind, tracks.kind) && Intrinsics.areEqual(
                    file, tracks.file
                ) && Intrinsics.areEqual(label, tracks.label)
            }
            return false
        }

        override fun hashCode(): Int {
            val str = kind
            val hashCode = ((str?.hashCode() ?: 0) * 31 + file.hashCode()) * 31
            val str2 = label
            return hashCode + (str2?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "Tracks(kind=" + kind + ", file=" + file + ", label=" + label + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(file, "file")
            kind = str
            this.file = file
            label = str2
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
                    str = tracks.kind
                }
                if (i and 2 != 0) {
                    str2 = tracks.file
                }
                if (i and 4 != 0) {
                    str3 = tracks.label
                }
                return tracks.copy(str, str2, str3)
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */ /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */ /* JADX WARN: Removed duplicated region for block: B:22:0x0193 A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:23:0x0194  */ /* JADX WARN: Removed duplicated region for block: B:27:0x01d7 A[LOOP:0: B:25:0x01d1->B:27:0x01d7, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:31:0x0203  */ /* JADX WARN: Removed duplicated region for block: B:39:0x0269  */ /* JADX WARN: Removed duplicated region for block: B:54:0x02ac A[SYNTHETIC] */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun invokeLokalSource(
        r28: String?,
        r29: Function1<SubtitleFile?, Unit>?,
        r30: Function1<ExtractorLink?, Unit>?,
        r31: Continuation<in Unit>?
    ): Any {
        /*
            Method dump skipped, instructions count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.IdlixProvider.invokeLokalSource(java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* compiled from: IdlixProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000c\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/IdlixProvider\$ResponseLaviolaSource;", "", "file", "", Constants.ScionAnalytics.PARAM_LABEL, "(Ljava/lang/String;Ljava/lang/String;)V", "getFile", "()Ljava/lang/String;", "getLabel", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class ResponseLaviolaSource(
        @JsonProperty("file") file: String,
        @JsonProperty("label") str: String
    ) {
        val file: String
        val label: String
        operator fun component1(): String {
            return file
        }

        operator fun component2(): String {
            return label
        }

        fun copy(
            @JsonProperty("file") file: String,
            @JsonProperty("label") str: String
        ): ResponseLaviolaSource {
            Intrinsics.checkNotNullParameter(file, "file")
            return ResponseLaviolaSource(file, str)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is ResponseLaviolaSource) {
                val responseLaviolaSource = obj as ResponseLaviolaSource
                return Intrinsics.areEqual(file, responseLaviolaSource.file) && Intrinsics.areEqual(
                    label, responseLaviolaSource.label
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val hashCode = file.hashCode() * 31
            val str = label
            return hashCode + (str?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "ResponseLaviolaSource(file=" + file + ", label=" + label + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(file, "file")
            this.file = file
            label = str
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                responseLaviolaSource: ResponseLaviolaSource,
                str: String,
                str2: String,
                i: Int,
                obj: Object?
            ): ResponseLaviolaSource {
                var str = str
                var str2 = str2
                if (i and 1 != 0) {
                    str = responseLaviolaSource.file
                }
                if (i and 2 != 0) {
                    str2 = responseLaviolaSource.label
                }
                return responseLaviolaSource.copy(str, str2)
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */ /* JADX WARN: Removed duplicated region for block: B:16:0x00a4  */ /* JADX WARN: Removed duplicated region for block: B:23:0x0130  */ /* JADX WARN: Removed duplicated region for block: B:31:0x0194  */ /* JADX WARN: Removed duplicated region for block: B:34:0x01b9  */ /* JADX WARN: Removed duplicated region for block: B:41:0x0253 A[LOOP:0: B:39:0x024d->B:41:0x0253, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:43:0x02c0  */ /* JADX WARN: Removed duplicated region for block: B:44:0x02ca  */ /* JADX WARN: Removed duplicated region for block: B:51:0x0314  */ /* JADX WARN: Removed duplicated region for block: B:60:0x039c  */ /* JADX WARN: Removed duplicated region for block: B:64:0x03ce  */ /* JADX WARN: Removed duplicated region for block: B:68:0x02fd A[EXC_TOP_SPLITTER, SYNTHETIC] */ /* JADX WARN: Type inference failed for: r10v15, types: [java.util.Collection] */ /* JADX WARN: Type inference failed for: r3v21, types: [java.util.Collection] */ /* JADX WARN: Type inference failed for: r7v14, types: [java.util.Collection] */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0194 -> B:32:0x01b3). Please submit an issue!!! */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x020d -> B:38:0x021d). Please submit an issue!!! */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x02ca -> B:45:0x02ce). Please submit an issue!!! */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x03ae -> B:63:0x03ba). Please submit an issue!!! */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun invokeLaviolaSource(
        r45: String?,
        r46: Function1<SubtitleFile?, Unit>?,
        r47: Function1<ExtractorLink?, Unit>?,
        r48: Continuation<in Unit>?
    ): Any {
        /*
            Method dump skipped, instructions count: 979
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.IdlixProvider.invokeLaviolaSource(java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: IdlixProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000c\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/IdlixProvider\$Captions;", "", "id", "", "hash", "language", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHash", "()Ljava/lang/String;", "getId", "getLanguage", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
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

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: IdlixProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000c\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/IdlixProvider\$Data;", "", "file", "", Constants.ScionAnalytics.PARAM_LABEL, "(Ljava/lang/String;Ljava/lang/String;)V", "getFile", "()Ljava/lang/String;", "getLabel", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
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

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: IdlixProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/IdlixProvider\$Player;", "", "poster_file", "", "(Ljava/lang/String;)V", "getPoster_file", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
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

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: IdlixProvider.kt */
    @Metadata(
        m108d1 = ["\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\rR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/IdlixProvider\$ResponseCdn;", "", "success", "", "player", "Lcom/lagradost/cloudstream3/movieproviders/IdlixProvider\$Player;", "data", "", "Lcom/lagradost/cloudstream3/movieproviders/IdlixProvider\$Data;", "captions", "Lcom/lagradost/cloudstream3/movieproviders/IdlixProvider\$Captions;", "(ZLcom/lagradost/cloudstream3/movieproviders/IdlixProvider\$Player;Ljava/util/List;Ljava/util/List;)V", "getCaptions", "()Ljava/util/List;", "getData", "getPlayer", "()Lcom/lagradost/cloudstream3/movieproviders/IdlixProvider\$Player;", "getSuccess", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class ResponseCdn(
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
        ): ResponseCdn {
            Intrinsics.checkNotNullParameter(player, "player")
            return ResponseCdn(z, player, list, list2)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is ResponseCdn) {
                val responseCdn = obj as ResponseCdn
                return success == responseCdn.success && Intrinsics.areEqual(
                    player, responseCdn.player
                ) && Intrinsics.areEqual(data, responseCdn.data) && Intrinsics.areEqual(
                    captions, responseCdn.captions
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
            return "ResponseCdn(success=" + success + ", player=" + player + ", data=" + data + ", captions=" + captions + ')'
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
                responseCdn: ResponseCdn,
                z: Boolean,
                player: Player,
                list: List,
                list2: List,
                i: Int,
                obj: Object?
            ): ResponseCdn {
                var z = z
                var player = player
                var list: List = list
                var list2: List = list2
                if (i and 1 != 0) {
                    z = responseCdn.success
                }
                if (i and 2 != 0) {
                    player = responseCdn.player
                }
                if (i and 4 != 0) {
                    list = responseCdn.data
                }
                if (i and 8 != 0) {
                    list2 = responseCdn.captions
                }
                return responseCdn.copy(z, player, list, list2)
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */ /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */ /* JADX WARN: Removed duplicated region for block: B:20:0x0126  */ /* JADX WARN: Removed duplicated region for block: B:25:0x0193  */ /* JADX WARN: Removed duplicated region for block: B:28:0x01b8  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun invokeCdnSource(
        r30: String?,
        r31: Function1<SubtitleFile?, Unit>?,
        r32: Function1<ExtractorLink?, Unit>?,
        r33: Continuation<in Unit>?
    ): Any {
        /*
            Method dump skipped, instructions count: 551
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.IdlixProvider.invokeCdnSource(java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */ /* JADX WARN: Removed duplicated region for block: B:20:0x00b2  */ /* JADX WARN: Removed duplicated region for block: B:21:0x00b5  */ /* JADX WARN: Removed duplicated region for block: B:25:0x00dc A[LOOP:0: B:23:0x00d6->B:25:0x00dc, LOOP_END] */
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
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.IdlixProvider.loadLinks(java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
    }
}