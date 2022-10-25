package com.lagradost.cloudstream3

import java.util.Map
import kotlin.jvm.internal.Intrinsics

/* compiled from: MainAPI.kt */
@Metadata(
    m108d1 = ["\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b'\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\u0016\b\u0003\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u00101\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u00102\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0017\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0003J\u0080\u0001\u00104\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\r2\u0016\b\u0003\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020\nHÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R(\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0012R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b)\u0010\u0014\"\u0004\b*\u0010\u0016¨\u0006<"],
    m107d2 = ["Lcom/lagradost/cloudstream3/MovieSearchResponse;", "Lcom/lagradost/cloudstream3/SearchResponse;", "name", "", "url", "apiName", "type", "Lcom/lagradost/cloudstream3/TvType;", "posterUrl", "year", "", "id", "quality", "Lcom/lagradost/cloudstream3/SearchQuality;", "posterHeaders", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/lagradost/cloudstream3/SearchQuality;Ljava/util/Map;)V", "getApiName", "()Ljava/lang/String;", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getName", "getPosterHeaders", "()Ljava/util/Map;", "setPosterHeaders", "(Ljava/util/Map;)V", "getPosterUrl", "setPosterUrl", "(Ljava/lang/String;)V", "getQuality", "()Lcom/lagradost/cloudstream3/SearchQuality;", "setQuality", "(Lcom/lagradost/cloudstream3/SearchQuality;)V", "getType", "()Lcom/lagradost/cloudstream3/TvType;", "setType", "(Lcom/lagradost/cloudstream3/TvType;)V", "getUrl", "getYear", "setYear", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/lagradost/cloudstream3/SearchQuality;Ljava/util/Map;)Lcom/lagradost/cloudstream3/MovieSearchResponse;", "equals", "", "other", "", "hashCode", "toString", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class MovieSearchResponse(
    @JsonProperty("name") name: String,
    @JsonProperty("url") url: String,
    @JsonProperty("apiName") apiName: String?,
    @JsonProperty("type") tvType: TvType?,
    @JsonProperty("posterUrl") str: String?,
    @JsonProperty("year") num: Integer?,
    @JsonProperty("id") num2: Integer?,
    @JsonProperty("quality") searchQuality: SearchQuality?,
    @JsonProperty("posterHeaders") map: Map<String?, String?>?
) : SearchResponse {
    // com.lagradost.cloudstream3.SearchResponse
    @get:Override
    override val apiName: String?

    /* renamed from: id */
    private var f9900id: Integer?

    // com.lagradost.cloudstream3.SearchResponse
    @get:Override
    override val name: String

    // com.lagradost.cloudstream3.SearchResponse
    // com.lagradost.cloudstream3.SearchResponse
    @get:Override
    @set:Override
    override var posterHeaders: Map<String?, String?>?

    // com.lagradost.cloudstream3.SearchResponse
    // com.lagradost.cloudstream3.SearchResponse
    @get:Override
    @set:Override
    override var posterUrl: String?

    // com.lagradost.cloudstream3.SearchResponse
    // com.lagradost.cloudstream3.SearchResponse
    @get:Override
    @set:Override
    override var quality: SearchQuality?

    // com.lagradost.cloudstream3.SearchResponse
    // com.lagradost.cloudstream3.SearchResponse
    @get:Override
    @set:Override
    override var type: TvType?

    // com.lagradost.cloudstream3.SearchResponse
    @get:Override
    override val url: String
    private var year: Integer?
    operator fun component1(): String {
        return name
    }

    operator fun component2(): String {
        return url
    }

    operator fun component3(): String? {
        return apiName
    }

    operator fun component4(): TvType? {
        return type
    }

    operator fun component5(): String? {
        return posterUrl
    }

    operator fun component6(): Integer? {
        return year
    }

    operator fun component7(): Integer? {
        return id
    }

    operator fun component8(): SearchQuality? {
        return quality
    }

    operator fun component9(): Map<String?, String?>? {
        return posterHeaders
    }

    fun copy(
        @JsonProperty("name") name: String,
        @JsonProperty("url") url: String,
        @JsonProperty("apiName") apiName: String?,
        @JsonProperty("type") tvType: TvType?,
        @JsonProperty("posterUrl") str: String?,
        @JsonProperty("year") num: Integer?,
        @JsonProperty("id") num2: Integer?,
        @JsonProperty("quality") searchQuality: SearchQuality?,
        @JsonProperty("posterHeaders") map: Map<String?, String?>?
    ): MovieSearchResponse {
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(url, "url")
        Intrinsics.checkNotNullParameter(apiName, "apiName")
        return MovieSearchResponse(name, url, apiName, tvType, str, num, num2, searchQuality, map)
    }

    override fun equals(obj: Object): Boolean {
        if (this === obj) {
            return true
        }
        if (obj is MovieSearchResponse) {
            val movieSearchResponse = obj as MovieSearchResponse
            return Intrinsics.areEqual(name, movieSearchResponse.name) && Intrinsics.areEqual(
                url, movieSearchResponse.url
            ) && Intrinsics.areEqual(
                apiName, movieSearchResponse.apiName
            ) && type === movieSearchResponse.type && Intrinsics.areEqual(
                posterUrl, movieSearchResponse.posterUrl
            ) && Intrinsics.areEqual(year, movieSearchResponse.year) && Intrinsics.areEqual(
                id, movieSearchResponse.id
            ) && quality == movieSearchResponse.quality && Intrinsics.areEqual(
                posterHeaders, movieSearchResponse.posterHeaders
            )
        }
        return false
    }

    override fun hashCode(): Int {
        val hashCode =
            ((((name.hashCode() * 31 + url.hashCode()) * 31 + apiName!!.hashCode()) * 31 + if (type == null) 0 else type!!.hashCode()) * 31 + if (posterUrl == null) 0 else posterUrl!!.hashCode()) * 31
        val num: Integer? = year
        return (((hashCode + if (num == null) 0 else num.hashCode()) * 31 + if (id == null) 0 else id.hashCode()) * 31 + if (quality == null) 0 else quality!!.hashCode()) * 31 + if (posterHeaders != null) posterHeaders!!.hashCode() else 0
    }

    override fun toString(): String {
        return "MovieSearchResponse(name=" + name + ", url=" + url + ", apiName=" + apiName + ", type=" + type + ", posterUrl=" + posterUrl + ", year=" + year + ", id=" + id + ", quality=" + quality + ", posterHeaders=" + posterHeaders + ')'
    }

    init {
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(url, "url")
        Intrinsics.checkNotNullParameter(apiName, "apiName")
        this.name = name
        this.url = url
        this.apiName = apiName
        type = tvType
        posterUrl = str
        year = num
        f9900id = num2
        quality = searchQuality
        posterHeaders = map
    }

    /* synthetic */   constructor(
        str: String,
        str2: String,
        str3: String?,
        tvType: TvType?,
        str4: String?,
        num: Integer?,
        num2: Integer?,
        searchQuality: SearchQuality?,
        map: Map?,
        i: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(
        str,
        str2,
        str3,
        if (i and 8 != 0) null else tvType,
        if (i and 16 != 0) null else str4,
        if (i and 32 != 0) null else num,
        if (i and 64 != 0) null else num2,
        if (i and 128 != 0) null else searchQuality,
        if (i and 256 != 0) null else map
    ) {
    }

    fun getYear(): Integer? {
        return year
    }

    fun setYear(num: Integer?) {
        year = num
    }

    // com.lagradost.cloudstream3.SearchResponse
    // com.lagradost.cloudstream3.SearchResponse
    @get:Override
    @set:Override
    override var id: Integer?
        // com.lagradost.cloudstream3.SearchResponse
        get() = f9900id
        // com.lagradost.cloudstream3.SearchResponse
        set(num) {
            f9900id = num
        }
}