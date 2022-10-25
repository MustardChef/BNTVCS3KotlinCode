package com.lagradost.cloudstream3.movieproviders

import org.jsoup.nodes.Element
import java.util.ArrayList
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: MyCimaProvider.kt */
@Metadata(
    m108d1 = ["\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u00015B\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010\u001a\u001a\u00020\u001bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010 JI\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020'0%H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010*J\u001f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010.\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010 J\u000e\u0010/\u001a\u0004\u0018\u00010\b*\u00020\bH\u0002J\u0013\u00100\u001a\u0004\u0018\u000101*\u00020\bH\u0002¢\u0006\u0002\u00102J\u000e\u00103\u001a\u0004\u0018\u00010-*\u000204H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u000cR\u001a\u0010\r\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\u000cR\u001a\u0010\u0010\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\u000cR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u00066"],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/MyCimaProvider;", "Lcom/lagradost/cloudstream3/MainAPI;", "()V", "hasMainPage", "", "getHasMainPage", "()Z", "lang", "", "getLang", "()Ljava/lang/String;", "setLang", "(Ljava/lang/String;)V", "mainUrl", "getMainUrl", "setMainUrl", "name", "getName", "setName", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "usesWebView", "getUsesWebView", "getMainPage", "Lcom/lagradost/cloudstream3/HomePageResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "", "Lcom/lagradost/cloudstream3/SearchResponse;", "query", "getImageURL", "getIntFromText", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "toSearchResponse", "Lorg/jsoup/nodes/Element;", "MoreEPS", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class MyCimaProvider : MainAPI() {
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val usesWebView = false
    private var lang = "ar"

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var mainUrl = "https://mycima.tv"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var name = "MyCima"
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

    private fun getImageURL(str: String): String {
        return Regex("--im(age|g):url\\(|\\);").replace(str, "")
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

    /* JADX INFO: Access modifiers changed from: private */
    fun toSearchResponse(element: Element): SearchResponse {
        var attr: String
        val select: Elements = element.select("div.Thumb--GridItem a")
        val select2: Elements = element.select("span.BG--GridItem")
        val imageURL = if (select2 == null || select2.attr("data-lazy-style")
                .also { attr = it } == null
        ) null else getImageURL(attr)
        val select3: Elements = element.select("div.GridItem span.year")
        val text: String? = if (select3 != null) select3.text() else null
        val text2: String = element.select("div.Thumb--GridItem strong").text()
        Intrinsics.checkNotNullExpressionValue(
            text2,
            "select(\"div.Thumb--GridItem strong\").text()"
        )
        val `replace$default`: String = StringsKt.`replace$default`(
            Regex("مشاهدة|فيلم|مسلسل|مترجم").replace(
                StringsKt.`replace$default`(
                    text2,
                    String.valueOf(text),
                    "",
                    false,
                    4,
                    null as Object?
                ), ""
            ), "( نسخة مدبلجة )", " ( نسخة مدبلجة ) ", false, 4, null as Object?
        )
        val attr2: String = select.attr(ShareConstants.WEB_DIALOG_PARAM_HREF)
        Intrinsics.checkNotNullExpressionValue(attr2, "url.attr(\"href\")")
        val name = name
        val attr3: String = select.attr("title")
        Intrinsics.checkNotNullExpressionValue(attr3, "url.attr(\"title\")")
        return MovieSearchResponse(
            `replace$default`,
            attr2,
            name,
            if (StringsKt.`contains$default`(
                    attr3 as CharSequence,
                    "فيلم" as CharSequence,
                    false,
                    2,
                    null as Object?
                )
            ) TvType.Movie else TvType.TvSeries,
            imageURL,
            text?.let { getIntFromText(it) },
            null,
            null,
            null,
            384,
            null
        )
    }

    @Override // com.lagradost.cloudstream3.MainAPI
    override fun getMainPage(continuation: Continuation<in HomePageResponse?>?): Object? {
        return HomePageResponse(CollectionsKt.sortedWith(ParCollections.apmap(
            CollectionsKt.listOf<Object>(
                *arrayOf<Tuples<*, *>?>(
                    TuplesKt.m100to<Any, Any>(
                        "Movies", mainUrl + "/movies/page/" + RangesKt.random(
                            IntRange(0, 25), Random.Default
                        )
                    ), TuplesKt.m100to<Any, Any>(
                        "Series", mainUrl + "/seriestv/new/page/" + RangesKt.random(
                            IntRange(0, 25), Random.Default
                        )
                    )
                ) as Array<Object?>
            ), `MyCimaProvider$getMainPage$pages$1`(this, null)
        ), object : Comparator() {
            // from class: com.lagradost.cloudstream3.movieproviders.MyCimaProvider$getMainPage$$inlined$sortedBy$1
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

    @Override // com.lagradost.cloudstream3.MainAPI
    override fun search(
        str: String?,
        continuation: Continuation<in List<SearchResponse?>?>?
    ): Object {
        val `replace$default`: String =
            StringsKt.`replace$default`(str, " ", "%20", false, 4, null as Object?)
        val arrayList = ArrayList()
        ParCollections.apmap(
            CollectionsKt.listOf<Object>(
                *arrayOf(
                    "$mainUrl/search/$`replace$default`",
                    "$mainUrl/search/$`replace$default`/list/series/",
                    "$mainUrl/search/$`replace$default`/list/anime/"
                ) as Array<Object>
            ), `MyCimaProvider$search$2`(this, arrayList, null)
        )
        return CollectionsKt.sortedWith(CollectionsKt.distinct(arrayList), object : Comparator() {
            // from class: com.lagradost.cloudstream3.movieproviders.MyCimaProvider$search$$inlined$sortedBy$1
            @Override // java.util.Comparator
            fun compare(t: T, t2: T): Int {
                return ComparisonsKt.compareValues<Comparable<*>>(
                    (t as SearchResponse).name,
                    (t2 as SearchResponse).name
                )
            }
        })
    }

    /* compiled from: MyCimaProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/MyCimaProvider\$MoreEPS;", "", AgentOptions.OUTPUT, "", "(Ljava/lang/String;)V", "getOutput", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class MoreEPS(output: String) {
        val output: String
        operator fun component1(): String {
            return output
        }

        fun copy(output: String): MoreEPS {
            Intrinsics.checkNotNullParameter(output, "output")
            return MoreEPS(output)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is MoreEPS && Intrinsics.areEqual(
                output,
                (obj as MoreEPS).output
            )
        }

        override fun hashCode(): Int {
            return output.hashCode()
        }

        override fun toString(): String {
            return "MoreEPS(output=" + output + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(output, "output")
            this.output = output
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                moreEPS: MoreEPS,
                str: String,
                i: Int,
                obj: Object?
            ): MoreEPS {
                var str = str
                if (i and 1 != 0) {
                    str = moreEPS.output
                }
                return moreEPS.copy(str)
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0258  */ /* JADX WARN: Removed duplicated region for block: B:109:0x0285  */ /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:111:0x0289  */ /* JADX WARN: Removed duplicated region for block: B:112:0x02ad  */ /* JADX WARN: Removed duplicated region for block: B:126:0x0189 A[SYNTHETIC] */ /* JADX WARN: Removed duplicated region for block: B:130:0x0246 A[SYNTHETIC] */ /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */ /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */ /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */ /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */ /* JADX WARN: Removed duplicated region for block: B:35:0x00d2  */ /* JADX WARN: Removed duplicated region for block: B:50:0x0106  */ /* JADX WARN: Removed duplicated region for block: B:57:0x016c  */ /* JADX WARN: Removed duplicated region for block: B:63:0x018e  */ /* JADX WARN: Removed duplicated region for block: B:69:0x01ad  */ /* JADX WARN: Removed duplicated region for block: B:70:0x01af  */ /* JADX WARN: Removed duplicated region for block: B:72:0x01b2  */ /* JADX WARN: Removed duplicated region for block: B:76:0x01e4 A[LOOP:1: B:74:0x01de->B:76:0x01e4, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:79:0x01fe  */ /* JADX WARN: Removed duplicated region for block: B:96:0x0243  */ /* JADX WARN: Removed duplicated region for block: B:99:0x024e  */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun load(r30: String?, r31: Continuation<in LoadResponse?>?): Any {
        /*
            Method dump skipped, instructions count: 1233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.MyCimaProvider.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */ /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    @Override // com.lagradost.cloudstream3.MainAPI
            /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */    fun loadLinks(
        r32: String?,
        r33: Boolean,
        r34: Function1<SubtitleFile?, Unit>?,
        r35: Function1<ExtractorLink?, Unit>?,
        r36: Continuation<in Boolean?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.MyCimaProvider.loadLinks(java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
    }
}