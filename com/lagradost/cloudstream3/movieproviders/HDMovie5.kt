package com.lagradost.cloudstream3.movieproviders

import java.util.Set
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: HDMovie5.kt */
@Metadata(
    m108d1 = ["\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u000201B\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010\u001a\u001a\u00020\u001bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010 JI\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020'0%H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010*J\u001f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010.\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010 J\u001f\u0010/\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010.\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010 R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u000c\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000c\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000c\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062"],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/HDMovie5;", "Lcom/lagradost/cloudstream3/MainAPI;", "()V", "hasMainPage", "", "getHasMainPage", "()Z", "hasQuickSearch", "getHasQuickSearch", "lang", "", "getLang", "()Ljava/lang/String;", "setLang", "(Ljava/lang/String;)V", "mainUrl", "getMainUrl", "setMainUrl", "name", "getName", "setName", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "getMainPage", "Lcom/lagradost/cloudstream3/HomePageResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "quickSearch", "", "Lcom/lagradost/cloudstream3/SearchResponse;", "query", "search", "PlayerAjaxResponse", "QuickSearchResponse", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class HDMovie5 : MainAPI() {
    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var mainUrl = "https://hdmovie2.art"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var name = "HDMovie"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }
    private var lang = "hi"

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasQuickSearch = true

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasMainPage = true

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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */ /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun getMainPage(r24: Continuation<in HomePageResponse?>?): Any? {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.HDMovie5.getMainPage(kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: HDMovie5.kt */
    @Metadata(
        m108d1 = ["\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\b\u0018\u00002\u00020\u0001:\u0001\u001aB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000c¨\u0006\u001b"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/HDMovie5\$QuickSearchResponse;", "", "title", "", "url", "img", "extra", "Lcom/lagradost/cloudstream3/movieproviders/HDMovie5\$QuickSearchResponse\$Extra;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/movieproviders/HDMovie5\$QuickSearchResponse\$Extra;)V", "getExtra", "()Lcom/lagradost/cloudstream3/movieproviders/HDMovie5\$QuickSearchResponse\$Extra;", "getImg", "()Ljava/lang/String;", "getTitle", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Extra", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class QuickSearchResponse(title: String, url: String, img: String, extra: Extra) {
        val extra: Extra
        val img: String
        val title: String
        val url: String
        operator fun component1(): String {
            return title
        }

        operator fun component2(): String {
            return url
        }

        operator fun component3(): String {
            return img
        }

        operator fun component4(): Extra {
            return extra
        }

        fun copy(title: String, url: String, img: String, extra: Extra): QuickSearchResponse {
            Intrinsics.checkNotNullParameter(title, "title")
            Intrinsics.checkNotNullParameter(url, "url")
            Intrinsics.checkNotNullParameter(img, "img")
            Intrinsics.checkNotNullParameter(extra, "extra")
            return QuickSearchResponse(title, url, img, extra)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is QuickSearchResponse) {
                val quickSearchResponse = obj as QuickSearchResponse
                return Intrinsics.areEqual(title, quickSearchResponse.title) && Intrinsics.areEqual(
                    url, quickSearchResponse.url
                ) && Intrinsics.areEqual(img, quickSearchResponse.img) && Intrinsics.areEqual(
                    extra, quickSearchResponse.extra
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return ((title.hashCode() * 31 + url.hashCode()) * 31 + img.hashCode()) * 31 + extra.hashCode()
        }

        override fun toString(): String {
            return "QuickSearchResponse(title=" + title + ", url=" + url + ", img=" + img + ", extra=" + extra + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(title, "title")
            Intrinsics.checkNotNullParameter(url, "url")
            Intrinsics.checkNotNullParameter(img, "img")
            Intrinsics.checkNotNullParameter(extra, "extra")
            this.title = title
            this.url = url
            this.img = img
            this.extra = extra
        }

        /* compiled from: HDMovie5.kt */
        @Metadata(
            m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"],
            m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/HDMovie5\$QuickSearchResponse\$Extra;", "", "date", "", "(Ljava/lang/String;)V", "getDate", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
            m106k = 1,
            m105mv = [1, 6, 0],
            m103xi = 48
        ) /* loaded from: classes3.dex */
        class Extra(date: String) {
            val date: String
            operator fun component1(): String {
                return date
            }

            fun copy(date: String): Extra {
                Intrinsics.checkNotNullParameter(date, "date")
                return Extra(date)
            }

            override fun equals(obj: Object): Boolean {
                return if (this === obj) {
                    true
                } else obj is Extra && Intrinsics.areEqual(
                    date,
                    (obj as Extra).date
                )
            }

            override fun hashCode(): Int {
                return date.hashCode()
            }

            override fun toString(): String {
                return "Extra(date=" + date + ')'
            }

            init {
                Intrinsics.checkNotNullParameter(date, "date")
                this.date = date
            }

            companion object {
                fun  /* synthetic */`copy$default`(
                    extra: Extra,
                    str: String,
                    i: Int,
                    obj: Object?
                ): Extra {
                    var str = str
                    if (i and 1 != 0) {
                        str = extra.date
                    }
                    return extra.copy(str)
                }
            }
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                quickSearchResponse: QuickSearchResponse,
                str: String,
                str2: String,
                str3: String,
                extra: Extra,
                i: Int,
                obj: Object?
            ): QuickSearchResponse {
                var str = str
                var str2 = str2
                var str3 = str3
                var extra = extra
                if (i and 1 != 0) {
                    str = quickSearchResponse.title
                }
                if (i and 2 != 0) {
                    str2 = quickSearchResponse.url
                }
                if (i and 4 != 0) {
                    str3 = quickSearchResponse.img
                }
                if (i and 8 != 0) {
                    extra = quickSearchResponse.extra
                }
                return quickSearchResponse.copy(str, str2, str3, extra)
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */ /* JADX WARN: Removed duplicated region for block: B:21:0x00b8 A[LOOP:0: B:19:0x00b2->B:21:0x00b8, LOOP_END] */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun quickSearch(
        r21: String?,
        r22: Continuation<in MutableList<out SearchResponse?>?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.HDMovie5.quickSearch(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
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
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.HDMovie5.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */ /* JADX WARN: Removed duplicated region for block: B:20:0x00fd  */ /* JADX WARN: Removed duplicated region for block: B:21:0x0104  */ /* JADX WARN: Removed duplicated region for block: B:24:0x011b  */ /* JADX WARN: Removed duplicated region for block: B:25:0x012c  */ /* JADX WARN: Removed duplicated region for block: B:29:0x0152 A[LOOP:0: B:27:0x014c->B:29:0x0152, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:33:0x01aa A[LOOP:1: B:31:0x01a2->B:33:0x01aa, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:37:0x020e  */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun load(r42: String?, r43: Continuation<in LoadResponse?>?): Any {
        /*
            Method dump skipped, instructions count: 624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.HDMovie5.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: HDMovie5.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/HDMovie5\$PlayerAjaxResponse;", "", "embedURL", "", "(Ljava/lang/String;)V", "getEmbedURL", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class PlayerAjaxResponse(@param:JsonProperty("embed_url") val embedURL: String?) {
        operator fun component1(): String? {
            return embedURL
        }

        fun copy(@JsonProperty("embed_url") str: String?): PlayerAjaxResponse {
            return PlayerAjaxResponse(str)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is PlayerAjaxResponse && Intrinsics.areEqual(
                embedURL,
                (obj as PlayerAjaxResponse).embedURL
            )
        }

        override fun hashCode(): Int {
            val str = embedURL ?: return 0
            return str.hashCode()
        }

        override fun toString(): String {
            return "PlayerAjaxResponse(embedURL=" + embedURL + ')'
        }

        @JvmOverloads
                /* synthetic */   constructor(
            str: String? = null,
            i: Int = 1,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(if (i and 1 != 0) null else str) {
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                playerAjaxResponse: PlayerAjaxResponse,
                str: String?,
                i: Int,
                obj: Object?
            ): PlayerAjaxResponse {
                var str = str
                if (i and 1 != 0) {
                    str = playerAjaxResponse.embedURL
                }
                return playerAjaxResponse.copy(str)
            }
        }
    }

    @Override // com.lagradost.cloudstream3.MainAPI
    fun loadLinks(
        str: String?,
        z: Boolean,
        function1: Function1<SubtitleFile?, Unit>?,
        function12: Function1<ExtractorLink?, Unit>?,
        continuation: Continuation<in Boolean?>?
    ): Object {
        return boxing.boxBoolean(
            ParCollections.apmapIndexed(
                StringsKt.`split$default`(
                    str as CharSequence?,
                    arrayOf(","),
                    false,
                    0,
                    6,
                    null as Object?
                ), `HDMovie5$loadLinks$2`(this, function1, function12, null)
            ).contains(boxing.boxBoolean(true))
        )
    }
}