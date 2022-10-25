package com.lagradost.cloudstream3

import java.util.Map
import kotlin.jvm.internal.Intrinsics

/* compiled from: MainAPI.kt */
@Metadata(
    m108d1 = ["\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0016\b\u0003\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u0017\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u00103\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u00104\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u00105\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u008c\u0001\u00106\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0003\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u00107J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;HÖ\u0003J\t\u0010<\u001a\u00020\nHÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u000c\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R(\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010!R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b+\u0010\u0015¨\u0006>"],
    m107d2 = ["Lcom/lagradost/cloudstream3/TvSeriesSearchResponse;", "Lcom/lagradost/cloudstream3/SearchResponse;", "name", "", "url", "apiName", "type", "Lcom/lagradost/cloudstream3/TvType;", "posterUrl", "year", "", "episodes", "id", "quality", "Lcom/lagradost/cloudstream3/SearchQuality;", "posterHeaders", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/lagradost/cloudstream3/SearchQuality;Ljava/util/Map;)V", "getApiName", "()Ljava/lang/String;", "getEpisodes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId", "setId", "(Ljava/lang/Integer;)V", "getName", "getPosterHeaders", "()Ljava/util/Map;", "setPosterHeaders", "(Ljava/util/Map;)V", "getPosterUrl", "setPosterUrl", "(Ljava/lang/String;)V", "getQuality", "()Lcom/lagradost/cloudstream3/SearchQuality;", "setQuality", "(Lcom/lagradost/cloudstream3/SearchQuality;)V", "getType", "()Lcom/lagradost/cloudstream3/TvType;", "setType", "(Lcom/lagradost/cloudstream3/TvType;)V", "getUrl", "getYear", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/lagradost/cloudstream3/SearchQuality;Ljava/util/Map;)Lcom/lagradost/cloudstream3/TvSeriesSearchResponse;", "equals", "", "other", "", "hashCode", "toString", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class TvSeriesSearchResponse(
    @JsonProperty("name") name: String,
    @JsonProperty("url") url: String,
    @JsonProperty("apiName") apiName: String,
    @JsonProperty("type") tvType: TvType,
    @JsonProperty("posterUrl") str: String,
    @JsonProperty("year") num: Integer?,
    @JsonProperty("episodes") num2: Integer?,
    @JsonProperty("id") num3: Integer,
    @JsonProperty("quality") searchQuality: SearchQuality,
    @JsonProperty("posterHeaders") map: Map<String, String>
) : SearchResponse {
    private val apiName: String
    private val episodes: Integer?

    /* renamed from: id */
    private var f9957id: Integer
    private val name: String
    private var posterHeaders: Map<String, String>
    private var posterUrl: String
    private var quality: SearchQuality
    private var type: TvType
    private val url: String
    private val year: Integer?
    operator fun component1(): String {
        return getName()
    }

    operator fun component10(): Map<String, String> {
        return getPosterHeaders()
    }

    operator fun component2(): String {
        return getUrl()
    }

    operator fun component3(): String {
        return getApiName()
    }

    operator fun component4(): TvType {
        return getType()
    }

    operator fun component5(): String {
        return getPosterUrl()
    }

    operator fun component6(): Integer? {
        return year
    }

    operator fun component7(): Integer? {
        return episodes
    }

    operator fun component8(): Integer {
        return id
    }

    operator fun component9(): SearchQuality {
        return getQuality()
    }

    fun copy(
        @JsonProperty("name") name: String,
        @JsonProperty("url") url: String,
        @JsonProperty("apiName") apiName: String,
        @JsonProperty("type") tvType: TvType,
        @JsonProperty("posterUrl") str: String,
        @JsonProperty("year") num: Integer?,
        @JsonProperty("episodes") num2: Integer?,
        @JsonProperty("id") num3: Integer,
        @JsonProperty("quality") searchQuality: SearchQuality,
        @JsonProperty("posterHeaders") map: Map<String, String>
    ): TvSeriesSearchResponse {
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(url, "url")
        Intrinsics.checkNotNullParameter(apiName, "apiName")
        return TvSeriesSearchResponse(
            name,
            url,
            apiName,
            tvType,
            str,
            num,
            num2,
            num3,
            searchQuality,
            map
        )
    }

    fun equals(obj: Object): Boolean {
        if (this === obj) {
            return true
        }
        if (obj is TvSeriesSearchResponse) {
            val tvSeriesSearchResponse = obj as TvSeriesSearchResponse
            return Intrinsics.areEqual(
                getName(),
                tvSeriesSearchResponse.getName()
            ) && Intrinsics.areEqual(
                getUrl(),
                tvSeriesSearchResponse.getUrl()
            ) && Intrinsics.areEqual(
                getApiName(),
                tvSeriesSearchResponse.getApiName()
            ) && getType() === tvSeriesSearchResponse.getType() && Intrinsics.areEqual(
                getPosterUrl(),
                tvSeriesSearchResponse.getPosterUrl()
            ) && Intrinsics.areEqual(
                year, tvSeriesSearchResponse.year
            ) && Intrinsics.areEqual(
                episodes, tvSeriesSearchResponse.episodes
            ) && Intrinsics.areEqual(
                id, tvSeriesSearchResponse.id
            ) && getQuality() == tvSeriesSearchResponse.getQuality() && Intrinsics.areEqual(
                getPosterHeaders(),
                tvSeriesSearchResponse.getPosterHeaders()
            )
        }
        return false
    }

    fun hashCode(): Int {
        val hashCode =
            ((((getName().hashCode() * 31 + getUrl().hashCode()) * 31 + getApiName().hashCode()) * 31 + if (getType() == null) 0 else getType().hashCode()) * 31 + if (getPosterUrl() == null) 0 else getPosterUrl().hashCode()) * 31
        val num: Integer? = year
        val hashCode2: Int = (hashCode + if (num == null) 0 else num.hashCode()) * 31
        val num2: Integer? = episodes
        return (((hashCode2 + if (num2 == null) 0 else num2.hashCode()) * 31 + if (id == null) 0 else id.hashCode()) * 31 + if (getQuality() == null) 0 else getQuality().hashCode()) * 31 + if (getPosterHeaders() != null) getPosterHeaders().hashCode() else 0
    }

    fun toString(): String {
        return "TvSeriesSearchResponse(name=" + getName() + ", url=" + getUrl() + ", apiName=" + getApiName() + ", type=" + getType() + ", posterUrl=" + getPosterUrl() + ", year=" + year + ", episodes=" + episodes + ", id=" + id + ", quality=" + getQuality() + ", posterHeaders=" + getPosterHeaders() + ')'
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
        episodes = num2
        f9957id = num3
        quality = searchQuality
        posterHeaders = map
    }

    /* synthetic */   constructor(
        str: String,
        str2: String,
        str3: String,
        tvType: TvType?,
        str4: String?,
        num: Integer?,
        num2: Integer?,
        num3: Integer?,
        searchQuality: SearchQuality?,
        map: Map?,
        i: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(
        str,
        str2,
        str3,
        (if (i and 8 != 0) null else tvType)!!,
        (if (i and 16 != 0) null else str4)!!,
        if (i and 32 != 0) null else num,
        if (i and 64 != 0) null else num2,
        if (i and 128 != 0) null else num3,
        (if (i and 256 != 0) null else searchQuality)!!,
        (if (i and 512 != 0) null else map)!!
    ) {
    }

    @Override // com.lagradost.cloudstream3.SearchResponse
    override fun getName(): String? {
        return name
    }

    @Override // com.lagradost.cloudstream3.SearchResponse
    override fun getUrl(): String? {
        return url
    }

    @Override // com.lagradost.cloudstream3.SearchResponse
    override fun getApiName(): String? {
        return apiName
    }

    @Override // com.lagradost.cloudstream3.SearchResponse
    override fun getType(): TvType {
        return type
    }

    @Override // com.lagradost.cloudstream3.SearchResponse
    override fun setType(tvType: TvType) {
        type = tvType
    }

    @Override // com.lagradost.cloudstream3.SearchResponse
    override fun getPosterUrl(): String? {
        return posterUrl
    }

    @Override // com.lagradost.cloudstream3.SearchResponse
    override fun setPosterUrl(str: String) {
        posterUrl = str
    }

    fun getYear(): Integer? {
        return year
    }

    fun getEpisodes(): Integer? {
        return episodes
    }

    @Override // com.lagradost.cloudstream3.SearchResponse
    override fun getId(): Integer {
        return f9957id
    }

    @Override // com.lagradost.cloudstream3.SearchResponse
    override fun setId(num: Integer) {
        f9957id = num
    }

    @Override // com.lagradost.cloudstream3.SearchResponse
    override fun getQuality(): SearchQuality {
        return quality
    }

    @Override // com.lagradost.cloudstream3.SearchResponse
    override fun setQuality(searchQuality: SearchQuality) {
        quality = searchQuality
    }

    @Override // com.lagradost.cloudstream3.SearchResponse
    override fun getPosterHeaders(): Map? {
        return posterHeaders
    }

    @Override // com.lagradost.cloudstream3.SearchResponse
    override fun setPosterHeaders(map: Map<String, String>) {
        posterHeaders = map
    }
}