package com.lagradost.cloudstream3.subtitles

import com.lagradost.cloudstream3.subtitles.AbstractSubtitleEntities.SubtitleEntity
import com.lagradost.cloudstream3.subtitles.AbstractSubtitleEntities.SubtitleSearch
import com.lagradost.cloudstream3.subtitles.AbstractSubProvider
import kotlin.Standard
import com.lagradost.cloudstream3.TvType
import kotlin.jvm.internal.DefaultConstructorMarker
import kotlin.jvm.JvmOverloads
import kotlin.jvm.internal.Intrinsics

/* compiled from: AbstractSubtitleEntities.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"],
    m107d2 = ["Lcom/lagradost/cloudstream3/subtitles/AbstractSubtitleEntities;", "", "()V", "SubtitleEntity", "SubtitleSearch", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class AbstractSubtitleEntities {
    /* compiled from: AbstractSubtitleEntities.kt */
    @Metadata(
        m108d1 = ["\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000c\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\rJ\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0013Jd\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000c\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\nHÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010\u000c\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b#\u0010\u0013\"\u0004\b$\u0010\u0015¨\u00064"],
        m107d2 = ["Lcom/lagradost/cloudstream3/subtitles/AbstractSubtitleEntities\$SubtitleEntity;", "", "idPrefix", "", "name", "lang", "data", "type", "Lcom/lagradost/cloudstream3/TvType;", "epNumber", "", "seasonNumber", "year", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getData", "()Ljava/lang/String;", "setData", "(Ljava/lang/String;)V", "getEpNumber", "()Ljava/lang/Integer;", "setEpNumber", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getIdPrefix", "setIdPrefix", "getLang", "setLang", "getName", "setName", "getSeasonNumber", "setSeasonNumber", "getType", "()Lcom/lagradost/cloudstream3/TvType;", "setType", "(Lcom/lagradost/cloudstream3/TvType;)V", "getYear", "setYear", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/lagradost/cloudstream3/subtitles/AbstractSubtitleEntities\$SubtitleEntity;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class SubtitleEntity(
        idPrefix: String,
        name: String,
        lang: String,
        data: String,
        type: TvType,
        num: Integer?,
        num2: Integer?,
        num3: Integer?
    ) {
        private var data: String
        private var epNumber: Integer?
        private var idPrefix: String
        private var lang: String
        private var name: String
        private var seasonNumber: Integer?
        private var type: TvType
        private var year: Integer?
        operator fun component1(): String {
            return idPrefix
        }

        operator fun component2(): String {
            return name
        }

        operator fun component3(): String {
            return lang
        }

        operator fun component4(): String {
            return data
        }

        operator fun component5(): TvType {
            return type
        }

        operator fun component6(): Integer? {
            return epNumber
        }

        operator fun component7(): Integer? {
            return seasonNumber
        }

        operator fun component8(): Integer? {
            return year
        }

        fun copy(
            idPrefix: String,
            name: String,
            lang: String,
            data: String,
            type: TvType,
            num: Integer?,
            num2: Integer?,
            num3: Integer?
        ): SubtitleEntity {
            Intrinsics.checkNotNullParameter(idPrefix, "idPrefix")
            Intrinsics.checkNotNullParameter(name, "name")
            Intrinsics.checkNotNullParameter(lang, "lang")
            Intrinsics.checkNotNullParameter(data, "data")
            Intrinsics.checkNotNullParameter(type, "type")
            return SubtitleEntity(idPrefix, name, lang, data, type, num, num2, num3)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is SubtitleEntity) {
                val subtitleEntity = obj as SubtitleEntity
                return Intrinsics.areEqual(
                    idPrefix,
                    subtitleEntity.idPrefix
                ) && Intrinsics.areEqual(
                    name, subtitleEntity.name
                ) && Intrinsics.areEqual(lang, subtitleEntity.lang) && Intrinsics.areEqual(
                    data, subtitleEntity.data
                ) && type === subtitleEntity.type && Intrinsics.areEqual(
                    epNumber, subtitleEntity.epNumber
                ) && Intrinsics.areEqual(
                    seasonNumber, subtitleEntity.seasonNumber
                ) && Intrinsics.areEqual(
                    year, subtitleEntity.year
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val hashCode =
                ((((idPrefix.hashCode() * 31 + name.hashCode()) * 31 + lang.hashCode()) * 31 + data.hashCode()) * 31 + type.hashCode()) * 31
            val num: Integer? = epNumber
            val hashCode2: Int = (hashCode + if (num == null) 0 else num.hashCode()) * 31
            val num2: Integer? = seasonNumber
            val hashCode3: Int = (hashCode2 + if (num2 == null) 0 else num2.hashCode()) * 31
            val num3: Integer? = year
            return hashCode3 + if (num3 != null) num3.hashCode() else 0
        }

        override fun toString(): String {
            return "SubtitleEntity(idPrefix=" + idPrefix + ", name=" + name + ", lang=" + lang + ", data=" + data + ", type=" + type + ", epNumber=" + epNumber + ", seasonNumber=" + seasonNumber + ", year=" + year + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(idPrefix, "idPrefix")
            Intrinsics.checkNotNullParameter(name, "name")
            Intrinsics.checkNotNullParameter(lang, "lang")
            Intrinsics.checkNotNullParameter(data, "data")
            Intrinsics.checkNotNullParameter(type, "type")
            this.idPrefix = idPrefix
            this.name = name
            this.lang = lang
            this.data = data
            this.type = type
            epNumber = num
            seasonNumber = num2
            year = num3
        }

        fun getIdPrefix(): String {
            return idPrefix
        }

        fun setIdPrefix(str: String) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            idPrefix = str
        }

        fun getName(): String {
            return name
        }

        fun setName(str: String) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            name = str
        }

        fun getLang(): String {
            return lang
        }

        fun setLang(str: String) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            lang = str
        }

        fun getData(): String {
            return data
        }

        fun setData(str: String) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            data = str
        }

        /* synthetic */   constructor(
            str: String,
            str2: String?,
            str3: String?,
            str4: String,
            tvType: TvType?,
            num: Integer?,
            num2: Integer?,
            num3: Integer?,
            i: Int,
            defaultConstructorMarker: DefaultConstructorMarker?
        ) : this(
            str,
            (if (i and 2 != 0) "" else str2)!!,
            (if (i and 4 != 0) "en" else str3)!!,
            if (i and 8 == 0) str4 else "",
            (if (i and 16 != 0) TvType.Movie else tvType)!!,
            if (i and 32 != 0) null else num,
            if (i and 64 != 0) null else num2,
            if (i and 128 == 0) num3 else null
        ) {
        }

        fun getType(): TvType {
            return type
        }

        fun setType(tvType: TvType) {
            Intrinsics.checkNotNullParameter(tvType, "<set-?>")
            type = tvType
        }

        fun getEpNumber(): Integer? {
            return epNumber
        }

        fun setEpNumber(num: Integer?) {
            epNumber = num
        }

        fun getSeasonNumber(): Integer? {
            return seasonNumber
        }

        fun setSeasonNumber(num: Integer?) {
            seasonNumber = num
        }

        fun getYear(): Integer? {
            return year
        }

        fun setYear(num: Integer?) {
            year = num
        }
    }

    /* compiled from: AbstractSubtitleEntities.kt */
    @Metadata(
        m108d1 = ["\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000bJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\rJT\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\bHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u000c\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001e\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000fR\u001e\u0010\n\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000f¨\u0006-"],
        m107d2 = ["Lcom/lagradost/cloudstream3/subtitles/AbstractSubtitleEntities\$SubtitleSearch;", "", "query", "", "imdb", "", "lang", "epNumber", "", "seasonNumber", "year", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getEpNumber", "()Ljava/lang/Integer;", "setEpNumber", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getImdb", "()Ljava/lang/Long;", "setImdb", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getLang", "()Ljava/lang/String;", "setLang", "(Ljava/lang/String;)V", "getQuery", "setQuery", "getSeasonNumber", "setSeasonNumber", "getYear", "setYear", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/lagradost/cloudstream3/subtitles/AbstractSubtitleEntities\$SubtitleSearch;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class SubtitleSearch(
        query: String,
        l: Long?,
        str: String?,
        num: Integer?,
        num2: Integer?,
        num3: Integer?
    ) {
        private var epNumber: Integer?
        var imdb: Long?
        var lang: String?
        private var query: String
        private var seasonNumber: Integer?
        private var year: Integer?
        operator fun component1(): String {
            return query
        }

        operator fun component2(): Long? {
            return imdb
        }

        operator fun component3(): String? {
            return lang
        }

        operator fun component4(): Integer? {
            return epNumber
        }

        operator fun component5(): Integer? {
            return seasonNumber
        }

        operator fun component6(): Integer? {
            return year
        }

        fun copy(
            query: String,
            l: Long?,
            str: String?,
            num: Integer?,
            num2: Integer?,
            num3: Integer?
        ): SubtitleSearch {
            Intrinsics.checkNotNullParameter(query, "query")
            return SubtitleSearch(query, l, str, num, num2, num3)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is SubtitleSearch) {
                val subtitleSearch = obj as SubtitleSearch
                return Intrinsics.areEqual(query, subtitleSearch.query) && Intrinsics.areEqual(
                    imdb, subtitleSearch.imdb
                ) && Intrinsics.areEqual(lang, subtitleSearch.lang) && Intrinsics.areEqual(
                    epNumber, subtitleSearch.epNumber
                ) && Intrinsics.areEqual(
                    seasonNumber, subtitleSearch.seasonNumber
                ) && Intrinsics.areEqual(
                    year, subtitleSearch.year
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val hashCode = query.hashCode() * 31
            val l = imdb
            val hashCode2 = (hashCode + (l?.hashCode() ?: 0)) * 31
            val str = lang
            val hashCode3 = (hashCode2 + (str?.hashCode() ?: 0)) * 31
            val num: Integer? = epNumber
            val hashCode4: Int = (hashCode3 + if (num == null) 0 else num.hashCode()) * 31
            val num2: Integer? = seasonNumber
            val hashCode5: Int = (hashCode4 + if (num2 == null) 0 else num2.hashCode()) * 31
            val num3: Integer? = year
            return hashCode5 + if (num3 != null) num3.hashCode() else 0
        }

        override fun toString(): String {
            return "SubtitleSearch(query=" + query + ", imdb=" + imdb + ", lang=" + lang + ", epNumber=" + epNumber + ", seasonNumber=" + seasonNumber + ", year=" + year + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(query, "query")
            this.query = query
            imdb = l
            lang = str
            epNumber = num
            seasonNumber = num2
            year = num3
        }

        @JvmOverloads
                /* synthetic */   constructor(
            str: String? = null,
            l: Long? = null,
            str2: String? = null,
            num: Integer? = null,
            num2: Integer? = null,
            num3: Integer? = null,
            i: Int = 63,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) "" else str,
            if (i and 2 != 0) null else l,
            if (i and 4 != 0) null else str2,
            if (i and 8 != 0) null else num,
            if (i and 16 != 0) null else num2,
            if (i and 32 == 0) num3 else null
        ) {
        }

        fun getQuery(): String {
            return query
        }

        fun setQuery(str: String) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            query = str
        }

        fun getEpNumber(): Integer? {
            return epNumber
        }

        fun setEpNumber(num: Integer?) {
            epNumber = num
        }

        fun getSeasonNumber(): Integer? {
            return seasonNumber
        }

        fun setSeasonNumber(num: Integer?) {
            seasonNumber = num
        }

        fun getYear(): Integer? {
            return year
        }

        fun setYear(num: Integer?) {
            year = num
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                subtitleSearch: SubtitleSearch,
                str: String,
                l: Long?,
                str2: String?,
                num: Integer?,
                num2: Integer?,
                num3: Integer?,
                i: Int,
                obj: Object?
            ): SubtitleSearch {
                var str = str
                var l = l
                var str2 = str2
                var num: Integer? = num
                var num2: Integer? = num2
                var num3: Integer? = num3
                if (i and 1 != 0) {
                    str = subtitleSearch.query
                }
                if (i and 2 != 0) {
                    l = subtitleSearch.imdb
                }
                val l2 = l
                if (i and 4 != 0) {
                    str2 = subtitleSearch.lang
                }
                val str3 = str2
                if (i and 8 != 0) {
                    num = subtitleSearch.epNumber
                }
                val num4: Integer? = num
                if (i and 16 != 0) {
                    num2 = subtitleSearch.seasonNumber
                }
                val num5: Integer? = num2
                if (i and 32 != 0) {
                    num3 = subtitleSearch.year
                }
                return subtitleSearch.copy(str, l2, str3, num4, num5, num3)
            }
        }
    }
}