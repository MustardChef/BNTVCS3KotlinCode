package com.lagradost.cloudstream3.movieproviders

import java.util.Set
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: PinoyMoviesEsProvider.kt */
@Metadata(
    m108d1 = ["\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u00019B\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010\u001c\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ8\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020#2\u0018\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000c0&0%2\u0006\u0010'\u001a\u00020\u000cH\u0002J\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u000cH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010+JI\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u000c2\u0006\u0010.\u001a\u00020\u00042\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u000202002\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020200H\u0096@ø\u0001\u0000¢\u0006\u0002\u00105J\u001f\u00106\u001a\b\u0012\u0004\u0012\u0002070%2\u0006\u00108\u001a\u00020\u000cH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010+R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u000cX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u000cX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u000cX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006:"],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/PinoyMoviesEsProvider;", "Lcom/lagradost/cloudstream3/MainAPI;", "()V", "hasDownloadSupport", "", "getHasDownloadSupport", "()Z", "hasMainPage", "getHasMainPage", "hasQuickSearch", "getHasQuickSearch", "lang", "", "getLang", "()Ljava/lang/String;", "setLang", "(Ljava/lang/String;)V", "mainUrl", "getMainUrl", "setMainUrl", "name", "getName", "setName", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "getMainPage", "Lcom/lagradost/cloudstream3/HomePageResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRowElements", "", "Lcom/lagradost/cloudstream3/HomePageList;", "mainbody", "Lorg/jsoup/select/Elements;", "rows", "", "Lkotlin/Pair;", "sep", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "Lcom/lagradost/cloudstream3/SearchResponse;", "query", "EmbedUrl", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class PinoyMoviesEsProvider : MainAPI() {
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasDownloadSupport = false

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasQuickSearch = false

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var name = "Pinoy Movies"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var mainUrl = "https://pinoymovies.es"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }
    private var lang = "tl"

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val supportedTypes: Set<TvType> = SetsKt.setOf<TvType>(TvType.AsianDrama)

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasMainPage = true

    @Override // com.lagradost.cloudstream3.MainAPI
    override fun getLang(): String? {
        return lang
    }

    @Override // com.lagradost.cloudstream3.MainAPI
    override fun setLang(str: String) {
        Intrinsics.checkNotNullParameter(str, "<set-?>")
        lang = str
    }

    /* compiled from: PinoyMoviesEsProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000c\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/PinoyMoviesEsProvider\$EmbedUrl;", "", "embed_url", "", "type", "(Ljava/lang/String;Ljava/lang/String;)V", "getEmbed_url", "()Ljava/lang/String;", "getType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class EmbedUrl(
        @JsonProperty("embed_url") embed_url: String,
        @JsonProperty("type") type: String
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
            @JsonProperty("type") type: String
        ): EmbedUrl {
            Intrinsics.checkNotNullParameter(embed_url, "embed_url")
            Intrinsics.checkNotNullParameter(type, "type")
            return EmbedUrl(embed_url, type)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is EmbedUrl) {
                val embedUrl = obj as EmbedUrl
                return Intrinsics.areEqual(embed_url, embedUrl.embed_url) && Intrinsics.areEqual(
                    type, embedUrl.type
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return embed_url.hashCode() * 31 + type.hashCode()
        }

        override fun toString(): String {
            return "EmbedUrl(embed_url=" + embed_url + ", type=" + type + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(embed_url, "embed_url")
            Intrinsics.checkNotNullParameter(type, "type")
            this.embed_url = embed_url
            this.type = type
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                embedUrl: EmbedUrl,
                str: String,
                str2: String,
                i: Int,
                obj: Object?
            ): EmbedUrl {
                var str = str
                var str2 = str2
                if (i and 1 != 0) {
                    str = embedUrl.embed_url
                }
                if (i and 2 != 0) {
                    str2 = embedUrl.type
                }
                return embedUrl.copy(str, str2)
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x011e  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private fun getRowElements(
        r27: Elements,
        r28: List<Tuples<String, String>>,
        r29: String
    ): List<HomePageList> {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.PinoyMoviesEsProvider.getRowElements(org.jsoup.select.Elements, java.util.List, java.lang.String):java.util.List")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */ /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun getMainPage(r23: Continuation<in HomePageResponse?>?): Any? {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.PinoyMoviesEsProvider.getMainPage(kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fb, code lost:
        if (r7 == null) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */ /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */ /* JADX WARN: Removed duplicated region for block: B:63:0x0183  */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun search(
        r21: String?,
        r22: Continuation<in MutableList<out SearchResponse?>?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.PinoyMoviesEsProvider.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x026f, code lost:
        if (r1 != null) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x021e  */ /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:121:0x0252  */ /* JADX WARN: Removed duplicated region for block: B:137:0x01ee A[SYNTHETIC] */ /* JADX WARN: Removed duplicated region for block: B:139:0x015c A[SYNTHETIC] */ /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */ /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */ /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */ /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */ /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */ /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun load(r44: String?, r45: Continuation<in LoadResponse?>?): Any {
        /*
            Method dump skipped, instructions count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.PinoyMoviesEsProvider.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */ /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */ /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */ /* JADX WARN: Removed duplicated region for block: B:27:0x00ce  */ /* JADX WARN: Removed duplicated region for block: B:44:0x0165 A[LOOP:0: B:42:0x015f->B:44:0x0165, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:51:0x01a6  */ /* JADX WARN: Removed duplicated region for block: B:54:0x01bb  */ /* JADX WARN: Removed duplicated region for block: B:57:0x01c1  */ /* JADX WARN: Removed duplicated region for block: B:58:0x01c3  */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0103 -> B:53:0x01b6). Please submit an issue!!! */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0192 -> B:49:0x019e). Please submit an issue!!! */
    @Override // com.lagradost.cloudstream3.MainAPI
            /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */    fun loadLinks(
        r20: String?,
        r21: Boolean,
        r22: Function1<SubtitleFile?, Unit>?,
        r23: Function1<ExtractorLink?, Unit>?,
        r24: Continuation<in Boolean?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.PinoyMoviesEsProvider.loadLinks(java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
    }
}