package com.lagradost.cloudstream3.movieproviders

import org.jsoup.nodes.Element
import java.util.Set
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: UakinoProvider.kt */
@Metadata(
    m108d1 = ["\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u00011B\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010\u001a\u001a\u00020\u001bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010 JI\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020'0%H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010*J\u001f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010.\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010 J\u000c\u0010/\u001a\u00020-*\u000200H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u000c\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000c\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000c\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062"],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/UakinoProvider;", "Lcom/lagradost/cloudstream3/MainAPI;", "()V", "hasDownloadSupport", "", "getHasDownloadSupport", "()Z", "hasMainPage", "getHasMainPage", "lang", "", "getLang", "()Ljava/lang/String;", "setLang", "(Ljava/lang/String;)V", "mainUrl", "getMainUrl", "setMainUrl", "name", "getName", "setName", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "getMainPage", "Lcom/lagradost/cloudstream3/HomePageResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "", "Lcom/lagradost/cloudstream3/SearchResponse;", "query", "toSearchResponse", "Lorg/jsoup/nodes/Element;", "Responses", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class UakinoProvider : MainAPI() {
    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var mainUrl = "https://uakino.club"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var name = "Uakino"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasMainPage = true
    private var lang = "uk"

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasDownloadSupport = true

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val supportedTypes: Set<TvType> = SetsKt.setOf<Object>(
        *arrayOf<TvType>(
            TvType.Movie,
            TvType.TvSeries,
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */ /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun getMainPage(r29: Continuation<in HomePageResponse?>?): Any? {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.UakinoProvider.getMainPage(kotlin.coroutines.Continuation):java.lang.Object")
    }

    private fun toSearchResponse(element: Element): SearchResponse {
        var text: String?
        val selectFirst: Element = element.selectFirst("a.movie-title")
        val valueOf: String = String.valueOf(
            if (selectFirst == null || selectFirst.text()
                    .also { text = it } == null
            ) null else StringsKt.trim(text as CharSequence?).toString())
        val selectFirst2: Element = element.selectFirst("a.movie-title")
        val valueOf2: String =
            String.valueOf(selectFirst2?.attr(ShareConstants.WEB_DIALOG_PARAM_HREF))
        val uakinoProvider = this
        val selectFirst3: Element = element.selectFirst("img")
        return MainAPIKt.`newMovieSearchResponse$default`(
            uakinoProvider,
            valueOf,
            valueOf2,
            TvType.Movie,
            false,
            `UakinoProvider$toSearchResponse$1`(
                MainAPIKt.fixUrlNull(
                    uakinoProvider,
                    selectFirst3?.attr("src")
                )
            ),
            8,
            null
        )
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */ /* JADX WARN: Removed duplicated region for block: B:21:0x00cd A[LOOP:0: B:19:0x00c7->B:21:0x00cd, LOOP_END] */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun search(
        r25: String?,
        r26: Continuation<in MutableList<out SearchResponse?>?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.UakinoProvider.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */ /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */ /* JADX WARN: Removed duplicated region for block: B:28:0x00f6  */ /* JADX WARN: Removed duplicated region for block: B:29:0x00fd  */ /* JADX WARN: Removed duplicated region for block: B:33:0x012a A[LOOP:1: B:31:0x0124->B:33:0x012a, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:36:0x015e  */ /* JADX WARN: Removed duplicated region for block: B:37:0x0161  */ /* JADX WARN: Removed duplicated region for block: B:46:0x0186  */ /* JADX WARN: Removed duplicated region for block: B:47:0x018e  */ /* JADX WARN: Removed duplicated region for block: B:57:0x01dd A[LOOP:2: B:55:0x01d7->B:57:0x01dd, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:61:0x0212 A[LOOP:3: B:59:0x020c->B:61:0x0212, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:64:0x022c  */ /* JADX WARN: Removed duplicated region for block: B:75:0x031d  */ /* JADX WARN: Removed duplicated region for block: B:76:0x0322  */ /* JADX WARN: Removed duplicated region for block: B:80:0x034a  */ /* JADX WARN: Removed duplicated region for block: B:91:0x03c4  */ /* JADX WARN: Type inference failed for: r3v25, types: [java.util.List] */ /* JADX WARN: Type inference failed for: r4v25, types: [java.util.List] */ /* JADX WARN: Type inference failed for: r9v10, types: [java.util.List] */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun load(r45: String?, r46: Continuation<in LoadResponse?>?): Any {
        /*
            Method dump skipped, instructions count: 1024
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.UakinoProvider.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */ /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */ /* JADX WARN: Removed duplicated region for block: B:25:0x00ea  */ /* JADX WARN: Removed duplicated region for block: B:26:0x00f1  */ /* JADX WARN: Removed duplicated region for block: B:33:0x0101  */ /* JADX WARN: Removed duplicated region for block: B:44:0x01b4  */ /* JADX WARN: Removed duplicated region for block: B:45:0x01b9  */ /* JADX WARN: Removed duplicated region for block: B:49:0x01e0 A[LOOP:0: B:47:0x01da->B:49:0x01e0, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:51:0x0209  */
    @Override // com.lagradost.cloudstream3.MainAPI
            /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */    fun loadLinks(
        r30: String?,
        r31: Boolean,
        r32: Function1<SubtitleFile?, Unit>?,
        r33: Function1<ExtractorLink?, Unit>?,
        r34: Continuation<in Boolean?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.UakinoProvider.loadLinks(java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* compiled from: UakinoProvider.kt */
    @Metadata(
        m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\t\u0010\r\u001a\u00020\u0005HÆ\u0003J$\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/UakinoProvider\$Responses;", "", "success", "", "response", "", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "getResponse", "()Ljava/lang/String;", "getSuccess", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;)Lcom/lagradost/cloudstream3/movieproviders/UakinoProvider\$Responses;", "equals", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Responses(
        @JsonProperty("success") bool: Boolean,
        @JsonProperty("response") response: String
    ) {
        val response: String
        val success: Boolean
        operator fun component1(): Boolean {
            return success
        }

        operator fun component2(): String {
            return response
        }

        fun copy(
            @JsonProperty("success") bool: Boolean,
            @JsonProperty("response") response: String
        ): Responses {
            Intrinsics.checkNotNullParameter(response, "response")
            return Responses(bool, response)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Responses) {
                val responses = obj as Responses
                return Intrinsics.areEqual(success, responses.success) && Intrinsics.areEqual(
                    response, responses.response
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val bool = success
            return (bool?.hashCode() ?: 0) * 31 + response.hashCode()
        }

        override fun toString(): String {
            return "Responses(success=" + success + ", response=" + response + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(response, "response")
            success = bool
            this.response = response
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                responses: Responses,
                bool: Boolean,
                str: String,
                i: Int,
                obj: Object?
            ): Responses {
                var bool = bool
                var str = str
                if (i and 1 != 0) {
                    bool = responses.success
                }
                if (i and 2 != 0) {
                    str = responses.response
                }
                return responses.copy(bool, str)
            }
        }
    }
}