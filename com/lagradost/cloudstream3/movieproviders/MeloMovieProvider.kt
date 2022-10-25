package com.lagradost.cloudstream3.movieproviders

import com.fasterxml.jackson.core.type.TypeReference
import com.lagradost.cloudstream3.utils.AppUtils
import org.jsoup.nodes.Element
import java.util.ArrayList
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: MeloMovieProvider.kt */
@Metadata(
    m108d1 = ["\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002,-B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0014\u001a\u00020\u000c2\u0006\u0010\u0015\u001a\u00020\u000cH\u0002J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0015\u001a\u00020\u000cH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0018JI\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u000c2\u0006\u0010\u001b\u001a\u00020\u00042\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001f0\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\"J\u001f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010&\u001a\u00020\u000cH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u001f\u0010'\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010&\u001a\u00020\u000cH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020)0$2\u0006\u0010*\u001a\u00020+H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u000cX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u000cX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/MeloMovieProvider;", "Lcom/lagradost/cloudstream3/MainAPI;", "()V", "hasChromecastSupport", "", "getHasChromecastSupport", "()Z", "hasQuickSearch", "getHasQuickSearch", "instantLinkLoading", "getInstantLinkLoading", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "fixUrl", "url", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "quickSearch", "", "Lcom/lagradost/cloudstream3/SearchResponse;", "query", "search", "serializeData", "Lcom/lagradost/cloudstream3/movieproviders/MeloMovieProvider\$MeloMovieLink;", "element", "Lorg/jsoup/nodes/Element;", "MeloMovieLink", "MeloMovieSearchResult", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class MeloMovieProvider : MainAPI() {
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasChromecastSupport = false

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var name = "MeloMovie"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var mainUrl = "https://melomovie.com"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val instantLinkLoading = true

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasQuickSearch = true

    /* compiled from: MeloMovieProvider.kt */
    @Metadata(
        m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011JB\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/MeloMovieProvider\$MeloMovieSearchResult;", "", "id", "", "imdbId", "", "title", "type", "year", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)V", "getId", "()I", "getImdbId", "()Ljava/lang/String;", "getTitle", "getType", "getYear", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)Lcom/lagradost/cloudstream3/movieproviders/MeloMovieProvider\$MeloMovieSearchResult;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class MeloMovieSearchResult(
        @JsonProperty("id") i: Int,
        @JsonProperty("imdb_code") imdbId: String,
        @JsonProperty("title") title: String,
        @JsonProperty("type") i2: Int,
        @JsonProperty("year") num: Integer
    ) {
        /* renamed from: id */
        val id: Int
        val imdbId: String
        val title: String
        val type: Int
        private val year: Integer
        operator fun component1(): Int {
            return id
        }

        operator fun component2(): String {
            return imdbId
        }

        operator fun component3(): String {
            return title
        }

        operator fun component4(): Int {
            return type
        }

        operator fun component5(): Integer {
            return year
        }

        fun copy(
            @JsonProperty("id") i: Int,
            @JsonProperty("imdb_code") imdbId: String,
            @JsonProperty("title") title: String,
            @JsonProperty("type") i2: Int,
            @JsonProperty("year") num: Integer
        ): MeloMovieSearchResult {
            Intrinsics.checkNotNullParameter(imdbId, "imdbId")
            Intrinsics.checkNotNullParameter(title, "title")
            return MeloMovieSearchResult(i, imdbId, title, i2, num)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is MeloMovieSearchResult) {
                val meloMovieSearchResult = obj as MeloMovieSearchResult
                return id == meloMovieSearchResult.id && Intrinsics.areEqual(
                    imdbId, meloMovieSearchResult.imdbId
                ) && Intrinsics.areEqual(
                    title, meloMovieSearchResult.title
                ) && type == meloMovieSearchResult.type && Intrinsics.areEqual(
                    year, meloMovieSearchResult.year
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val hashCode =
                (((id * 31 + imdbId.hashCode()) * 31 + title.hashCode()) * 31 + type) * 31
            val num: Integer = year
            return hashCode + if (num == null) 0 else num.hashCode()
        }

        override fun toString(): String {
            return "MeloMovieSearchResult(id=" + id + ", imdbId=" + imdbId + ", title=" + title + ", type=" + type + ", year=" + year + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(imdbId, "imdbId")
            Intrinsics.checkNotNullParameter(title, "title")
            id = i
            this.imdbId = imdbId
            this.title = title
            type = i2
            year = num
        }

        fun getYear(): Integer {
            return year
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                meloMovieSearchResult: MeloMovieSearchResult,
                i: Int,
                str: String,
                str2: String,
                i2: Int,
                num: Integer,
                i3: Int,
                obj: Object?
            ): MeloMovieSearchResult {
                var i = i
                var str = str
                var str2 = str2
                var i2 = i2
                var num: Integer = num
                if (i3 and 1 != 0) {
                    i = meloMovieSearchResult.id
                }
                if (i3 and 2 != 0) {
                    str = meloMovieSearchResult.imdbId
                }
                val str3 = str
                if (i3 and 4 != 0) {
                    str2 = meloMovieSearchResult.title
                }
                val str4 = str2
                if (i3 and 8 != 0) {
                    i2 = meloMovieSearchResult.type
                }
                val i4 = i2
                if (i3 and 16 != 0) {
                    num = meloMovieSearchResult.year
                }
                return meloMovieSearchResult.copy(i, str3, str4, i4, num)
            }
        }
    }

    /* compiled from: MeloMovieProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000c\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/MeloMovieProvider\$MeloMovieLink;", "", "name", "", "link", "(Ljava/lang/String;Ljava/lang/String;)V", "getLink", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class MeloMovieLink(@JsonProperty("name") name: String, @JsonProperty("link") link: String) {
        val link: String
        val name: String
        operator fun component1(): String {
            return name
        }

        operator fun component2(): String {
            return link
        }

        fun copy(
            @JsonProperty("name") name: String,
            @JsonProperty("link") link: String
        ): MeloMovieLink {
            Intrinsics.checkNotNullParameter(name, "name")
            Intrinsics.checkNotNullParameter(link, "link")
            return MeloMovieLink(name, link)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is MeloMovieLink) {
                val meloMovieLink = obj as MeloMovieLink
                return Intrinsics.areEqual(name, meloMovieLink.name) && Intrinsics.areEqual(
                    link, meloMovieLink.link
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return name.hashCode() * 31 + link.hashCode()
        }

        override fun toString(): String {
            return "MeloMovieLink(name=" + name + ", link=" + link + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(name, "name")
            Intrinsics.checkNotNullParameter(link, "link")
            this.name = name
            this.link = link
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                meloMovieLink: MeloMovieLink,
                str: String,
                str2: String,
                i: Int,
                obj: Object?
            ): MeloMovieLink {
                var str = str
                var str2 = str2
                if (i and 1 != 0) {
                    str = meloMovieLink.name
                }
                if (i and 2 != 0) {
                    str2 = meloMovieLink.link
                }
                return meloMovieLink.copy(str, str2)
            }
        }
    }

    @Override // com.lagradost.cloudstream3.MainAPI
    override fun quickSearch(
        str: String?,
        continuation: Continuation<in List<SearchResponse?>?>?
    ): Object {
        return search(str, continuation)
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */ /* JADX WARN: Removed duplicated region for block: B:20:0x00b4 A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:21:0x00b5  */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun search(
        r22: String?,
        r23: Continuation<in MutableList<out SearchResponse?>?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.MeloMovieProvider.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    private fun fixUrl(str: String): String {
        if (str.length() === 0) {
            return ""
        }
        return if (StringsKt.`startsWith$default`(str, "//", false, 2, null as Object?)) {
            "http:$str"
        } else if (StringsKt.`startsWith$default`(str, "http", false, 2, null as Object?)) {
            str
        } else {
            "http://$str"
        }
    }

    private fun serializeData(element: Element): List<MeloMovieLink> {
        var meloMovieLink: MeloMovieLink
        val eps: Elements = element.select("> tbody > tr")
        Intrinsics.checkNotNullExpressionValue(eps, "eps")
        val arrayList = ArrayList()
        val it: Iterator<Element> = eps.iterator()
        while (true) {
            var i = 1
            if (!it.hasNext()) {
                break
            }
            try {
                val select: Elements = it.next().select("> td")
                if (select.size() !== 5) {
                    i = 0
                }
                val name: String = select.get(i).text()
                val last: Element = select.last()
                Intrinsics.checkNotNull(last)
                val selectFirst: Element = last.selectFirst("> a")
                Intrinsics.checkNotNull(selectFirst)
                val attr: String = selectFirst.attr("data-lnk")
                Intrinsics.checkNotNullExpressionValue(
                    attr,
                    "tds.last()!!.selectFirst(\"> a\")!!.attr(\"data-lnk\")"
                )
                val fixUrl =
                    fixUrl(StringsKt.`replace$default`(attr, " ", "%20", false, 4, null as Object?))
                Intrinsics.checkNotNullExpressionValue(name, "name")
                meloMovieLink = MeloMovieLink(name, fixUrl)
            } catch (unused: Exception) {
                meloMovieLink = MeloMovieLink("", "")
            }
            arrayList.add(meloMovieLink)
        }
        val arrayList2 = ArrayList()
        for (obj in arrayList) {
            val meloMovieLink2 = obj as MeloMovieLink
            if (if (Intrinsics.areEqual(meloMovieLink2.link, "") || Intrinsics.areEqual(
                        meloMovieLink2.name,
                        ""
                    )
                ) false else true
            ) {
                arrayList2.add(obj)
            }
        }
        return arrayList2
    }

    @Override // com.lagradost.cloudstream3.MainAPI
    fun loadLinks(
        str: String?,
        z: Boolean,
        function1: Function1<SubtitleFile?, Unit>?,
        function12: Function1<ExtractorLink?, Unit>,
        continuation: Continuation<in Boolean?>?
    ): Object {
        val appUtils = AppUtils.INSTANCE
        for (meloMovieLink in MainAPIKt.getMapper().readValue(
            str,
            object :
                TypeReference<List<MeloMovieLink?>?>() { // from class: com.lagradost.cloudstream3.movieproviders.MeloMovieProvider$loadLinks$$inlined$parseJson$1
            })) {
            function12.invoke(
                ExtractorLink(
                    name,
                    meloMovieLink.name,
                    meloMovieLink.link,
                    "",
                    ExtractorApiKt.getQualityFromName(meloMovieLink.name),
                    false,
                    null,
                    null,
                    192,
                    null
                )
            )
        }
        return boxing.boxBoolean(true)
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */ /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */ /* JADX WARN: Removed duplicated region for block: B:58:0x01eb A[RETURN] */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun load(r27: String?, r28: Continuation<in LoadResponse?>?): Any {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.MeloMovieProvider.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    companion object {
        private fun `load$findUsingRegex`(str: String, str2: String): String? {
            var groups: MatchGroupCollection
            var matchGroup: MatchGroup
            var value: String?
            val `find$default` = Regex.`find$default`(Regex(str2), str, 0, 2, null)
            return if (`find$default` == null || `find$default`.groups.also {
                    groups = it
                } == null || groups[1]
                    .also { matchGroup = it } == null || matchGroup.value.also {
                    value = it
                } == null) {
                null
            } else value
        }
    }
}