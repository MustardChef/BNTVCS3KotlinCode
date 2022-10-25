package com.lagradost.cloudstream3

import java.util.EnumSet
import kotlin.jvm.internal.Intrinsics

/* compiled from: MainAPI.kt */
@Metadata(
    m108d1 = ["\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b2\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B«\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0003\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u0010\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0016\b\u0003\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u0010;\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0017\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\"J\u0011\u0010B\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000cHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u0010HÆ\u0003J´\u0001\u0010E\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0014\b\u0003\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u00102\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0016\b\u0003\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010FJ\u0013\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010JHÖ\u0003J\t\u0010K\u001a\u00020\nHÖ\u0001J\t\u0010L\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\$R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0018\"\u0004\b(\u0010)R(\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001e\"\u0004\b+\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0018\"\u0004\b-\u0010)R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0018R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b7\u0010\"\"\u0004\b8\u0010$¨\u0006M"],
    m107d2 = ["Lcom/lagradost/cloudstream3/AnimeSearchResponse;", "Lcom/lagradost/cloudstream3/SearchResponse;", "name", "", "url", "apiName", "type", "Lcom/lagradost/cloudstream3/TvType;", "posterUrl", "year", "", "dubStatus", "Ljava/util/EnumSet;", "Lcom/lagradost/cloudstream3/DubStatus;", "otherName", "episodes", "", "id", "quality", "Lcom/lagradost/cloudstream3/SearchQuality;", "posterHeaders", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/EnumSet;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Integer;Lcom/lagradost/cloudstream3/SearchQuality;Ljava/util/Map;)V", "getApiName", "()Ljava/lang/String;", "getDubStatus", "()Ljava/util/EnumSet;", "setDubStatus", "(Ljava/util/EnumSet;)V", "getEpisodes", "()Ljava/util/Map;", "setEpisodes", "(Ljava/util/Map;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getName", "getOtherName", "setOtherName", "(Ljava/lang/String;)V", "getPosterHeaders", "setPosterHeaders", "getPosterUrl", "setPosterUrl", "getQuality", "()Lcom/lagradost/cloudstream3/SearchQuality;", "setQuality", "(Lcom/lagradost/cloudstream3/SearchQuality;)V", "getType", "()Lcom/lagradost/cloudstream3/TvType;", "setType", "(Lcom/lagradost/cloudstream3/TvType;)V", "getUrl", "getYear", "setYear", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/EnumSet;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Integer;Lcom/lagradost/cloudstream3/SearchQuality;Ljava/util/Map;)Lcom/lagradost/cloudstream3/AnimeSearchResponse;", "equals", "", "other", "", "hashCode", "toString", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class AnimeSearchResponse(
    @JsonProperty("name") name: String,
    @JsonProperty("url") url: String,
    @JsonProperty("apiName") apiName: String?,
    @JsonProperty("type") tvType: TvType?,
    @JsonProperty("posterUrl") str: String?,
    @JsonProperty("year") num: Integer?,
    @JsonProperty("dubStatus") enumSet: EnumSet<DubStatus?>,
    @JsonProperty("otherName") str2: String?,
    @JsonProperty("episodes") episodes: Map<DubStatus, Integer>,
    @JsonProperty("id") num2: Integer?,
    @JsonProperty("quality") searchQuality: SearchQuality?,
    @JsonProperty("posterHeaders") map: Map<String?, String?>?
) : SearchResponse {
    // com.lagradost.cloudstream3.SearchResponse
    @get:Override
    override val apiName: String?
    private var dubStatus: EnumSet<DubStatus>
    private var episodes: Map<DubStatus, Integer>

    /* renamed from: id */
    private var f9896id: Integer?

    // com.lagradost.cloudstream3.SearchResponse
    @get:Override
    override val name: String
    var otherName: String?

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

    operator fun component10(): Integer? {
        return id
    }

    operator fun component11(): SearchQuality? {
        return quality
    }

    operator fun component12(): Map<String?, String?>? {
        return posterHeaders
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

    operator fun component7(): EnumSet<DubStatus> {
        return dubStatus
    }

    operator fun component8(): String? {
        return otherName
    }

    operator fun component9(): Map<DubStatus, Integer> {
        return episodes
    }

    fun copy(
        @JsonProperty("name") name: String,
        @JsonProperty("url") url: String,
        @JsonProperty("apiName") apiName: String?,
        @JsonProperty("type") tvType: TvType?,
        @JsonProperty("posterUrl") str: String?,
        @JsonProperty("year") num: Integer?,
        @JsonProperty("dubStatus") enumSet: EnumSet<DubStatus?>,
        @JsonProperty("otherName") str2: String?,
        @JsonProperty("episodes") episodes: Map<DubStatus, Integer>,
        @JsonProperty("id") num2: Integer?,
        @JsonProperty("quality") searchQuality: SearchQuality?,
        @JsonProperty("posterHeaders") map: Map<String?, String?>?
    ): AnimeSearchResponse {
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(url, "url")
        Intrinsics.checkNotNullParameter(apiName, "apiName")
        Intrinsics.checkNotNullParameter(episodes, "episodes")
        return AnimeSearchResponse(
            name,
            url,
            apiName,
            tvType,
            str,
            num,
            enumSet,
            str2,
            episodes,
            num2,
            searchQuality,
            map
        )
    }

    override fun equals(obj: Object): Boolean {
        if (this === obj) {
            return true
        }
        if (obj is AnimeSearchResponse) {
            val animeSearchResponse = obj as AnimeSearchResponse
            return Intrinsics.areEqual(name, animeSearchResponse.name) && Intrinsics.areEqual(
                url, animeSearchResponse.url
            ) && Intrinsics.areEqual(
                apiName, animeSearchResponse.apiName
            ) && type === animeSearchResponse.type && Intrinsics.areEqual(
                posterUrl, animeSearchResponse.posterUrl
            ) && Intrinsics.areEqual(year, animeSearchResponse.year) && Intrinsics.areEqual(
                dubStatus, animeSearchResponse.dubStatus
            ) && Intrinsics.areEqual(
                otherName, animeSearchResponse.otherName
            ) && Intrinsics.areEqual(
                episodes, animeSearchResponse.episodes
            ) && Intrinsics.areEqual(
                id, animeSearchResponse.id
            ) && quality == animeSearchResponse.quality && Intrinsics.areEqual(
                posterHeaders, animeSearchResponse.posterHeaders
            )
        }
        return false
    }

    override fun hashCode(): Int {
        val hashCode =
            ((((name.hashCode() * 31 + url.hashCode()) * 31 + apiName!!.hashCode()) * 31 + if (type == null) 0 else type!!.hashCode()) * 31 + if (posterUrl == null) 0 else posterUrl!!.hashCode()) * 31
        val num: Integer? = year
        val hashCode2: Int = (hashCode + if (num == null) 0 else num.hashCode()) * 31
        val enumSet: EnumSet<DubStatus> = dubStatus
        val hashCode3: Int = (hashCode2 + if (enumSet == null) 0 else enumSet.hashCode()) * 31
        val str = otherName
        return ((((hashCode3 + (str?.hashCode()
            ?: 0)) * 31 + episodes.hashCode()) * 31 + if (id == null) 0 else id.hashCode()) * 31 + if (quality == null) 0 else quality!!.hashCode()) * 31 + if (posterHeaders != null) posterHeaders!!.hashCode() else 0
    }

    override fun toString(): String {
        return "AnimeSearchResponse(name=" + name + ", url=" + url + ", apiName=" + apiName + ", type=" + type + ", posterUrl=" + posterUrl + ", year=" + year + ", dubStatus=" + dubStatus + ", otherName=" + otherName + ", episodes=" + episodes + ", id=" + id + ", quality=" + quality + ", posterHeaders=" + posterHeaders + ')'
    }

    init {
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(url, "url")
        Intrinsics.checkNotNullParameter(apiName, "apiName")
        Intrinsics.checkNotNullParameter(episodes, "episodes")
        this.name = name
        this.url = url
        this.apiName = apiName
        type = tvType
        posterUrl = str
        year = num
        dubStatus = enumSet
        otherName = str2
        this.episodes = episodes
        f9896id = num2
        quality = searchQuality
        posterHeaders = map
    }

    fun getYear(): Integer? {
        return year
    }

    fun setYear(num: Integer?) {
        year = num
    }

    fun getDubStatus(): EnumSet<DubStatus> {
        return dubStatus
    }

    fun setDubStatus(enumSet: EnumSet<DubStatus?>) {
        dubStatus = enumSet
    }

    /* synthetic */   constructor(
        str: String,
        str2: String,
        str3: String?,
        tvType: TvType?,
        str4: String?,
        num: Integer?,
        enumSet: EnumSet?,
        str5: String?,
        map: Map?,
        num2: Integer?,
        searchQuality: SearchQuality?,
        map2: Map?,
        i: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(
        str,
        str2,
        str3,
        if (i and 8 != 0) null else tvType,
        if (i and 16 != 0) null else str4,
        if (i and 32 != 0) null else num,
        if (i and 64 != 0) null else enumSet,
        if (i and 128 != 0) null else str5,
        if (i and 256 != 0) LinkedHashMap() else map,
        if (i and 512 != 0) null else num2,
        if (i and 1024 != 0) null else searchQuality,
        if (i and 2048 != 0) null else map2
    ) {
    }

    fun getEpisodes(): Map<DubStatus, Integer> {
        return episodes
    }

    fun setEpisodes(map: Map<DubStatus, Integer>) {
        Intrinsics.checkNotNullParameter(map, "<set-?>")
        episodes = map
    }

    // com.lagradost.cloudstream3.SearchResponse
    // com.lagradost.cloudstream3.SearchResponse
    @get:Override
    @set:Override
    override var id: Integer?
        // com.lagradost.cloudstream3.SearchResponse
        get() = f9896id
        // com.lagradost.cloudstream3.SearchResponse
        set(num) {
            f9896id = num
        }
}