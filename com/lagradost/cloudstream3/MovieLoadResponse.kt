package com.lagradost.cloudstream3

import java.util.LinkedHashMap
import kotlin.jvm.internal.Intrinsics

/* compiled from: MainAPI.kt */
@Metadata(
    m108d1 = ["\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\bG\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Bõ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001c¢\u0006\u0002\u0010\u001dJ\t\u0010N\u001a\u00020\u0003HÆ\u0003J\u0011\u0010O\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0003J\u0010\u0010P\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010-J\u0011\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0003J\u0011\u0010R\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000fHÆ\u0003J\u0011\u0010S\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000fHÆ\u0003J\t\u0010T\u001a\u00020\u0017HÆ\u0003J\u0015\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0019HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010W\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001cHÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0007HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010]\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010-J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010_\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010-J\u0088\u0002\u0010`\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001cHÆ\u0001¢\u0006\u0002\u0010aJ\u0013\u0010b\u001a\u00020\u00172\b\u0010c\u001a\u0004\u0018\u00010dHÖ\u0003J\t\u0010e\u001a\u00020\u000bHÖ\u0001J\t\u0010f\u001a\u00020\u0003HÖ\u0001R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\u0016\u001a\u00020\u0017X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0096\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010#\"\u0004\b2\u0010%R\u001c\u0010\u000c\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010#\"\u0004\b4\u0010%R(\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001cX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010#\"\u0004\b:\u0010%R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000bX\u0096\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\b;\u0010-\"\u0004\b<\u0010/R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001f\"\u0004\b>\u0010!R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010#R&\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0019X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u00106\"\u0004\bA\u00108R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u001f\"\u0004\bC\u0010!R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u001f\"\u0004\bE\u0010!R\u001a\u0010\u0006\u001a\u00020\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001a\u0010\u0004\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010#\"\u0004\bK\u0010%R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\bL\u0010-\"\u0004\bM\u0010/¨\u0006g"],
    m107d2 = ["Lcom/lagradost/cloudstream3/MovieLoadResponse;", "Lcom/lagradost/cloudstream3/LoadResponse;", "name", "", "url", "apiName", "type", "Lcom/lagradost/cloudstream3/TvType;", "dataUrl", "posterUrl", "year", "", "plot", "rating", "tags", "", TypedValues.TransitionType.S_DURATION, "trailers", "recommendations", "Lcom/lagradost/cloudstream3/SearchResponse;", "actors", "Lcom/lagradost/cloudstream3/ActorData;", "comingSoon", "", "syncData", "", "reviewUrl", "posterHeaders", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/util/Map;Ljava/lang/String;Ljava/util/Map;)V", "getActors", "()Ljava/util/List;", "setActors", "(Ljava/util/List;)V", "getApiName", "()Ljava/lang/String;", "setApiName", "(Ljava/lang/String;)V", "getComingSoon", "()Z", "setComingSoon", "(Z)V", "getDataUrl", "setDataUrl", "getDuration", "()Ljava/lang/Integer;", "setDuration", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getName", "setName", "getPlot", "setPlot", "getPosterHeaders", "()Ljava/util/Map;", "setPosterHeaders", "(Ljava/util/Map;)V", "getPosterUrl", "setPosterUrl", "getRating", "setRating", "getRecommendations", "setRecommendations", "getReviewUrl", "getSyncData", "setSyncData", "getTags", "setTags", "getTrailers", "setTrailers", "getType", "()Lcom/lagradost/cloudstream3/TvType;", "setType", "(Lcom/lagradost/cloudstream3/TvType;)V", "getUrl", "setUrl", "getYear", "setYear", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/util/Map;Ljava/lang/String;Ljava/util/Map;)Lcom/lagradost/cloudstream3/MovieLoadResponse;", "equals", "other", "", "hashCode", "toString", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class MovieLoadResponse(
    name: String,
    url: String,
    apiName: String?,
    type: TvType,
    dataUrl: String,
    str: String?,
    num: Integer?,
    str2: String?,
    num2: Integer?,
    list: List<String>?,
    num3: Integer?,
    list2: List<String>?,
    list3: List<SearchResponse>?,
    list4: List<ActorData>?,
    z: Boolean,
    syncData: Map<String, String>,
    str3: String?,
    map: Map<String, String>?
) : LoadResponse {
    // com.lagradost.cloudstream3.LoadResponse
    // com.lagradost.cloudstream3.LoadResponse
    @get:Override
    @set:Override
    override var actors: List<ActorData>?
    private override var apiName: String?

    // com.lagradost.cloudstream3.LoadResponse
    // com.lagradost.cloudstream3.LoadResponse
    @get:Override
    @set:Override
    override var comingSoon: Boolean
    private var dataUrl: String
    private var duration: Integer?
    private override var name: String

    // com.lagradost.cloudstream3.LoadResponse
    // com.lagradost.cloudstream3.LoadResponse
    @get:Override
    @set:Override
    override var plot: String?

    // com.lagradost.cloudstream3.LoadResponse
    // com.lagradost.cloudstream3.LoadResponse
    @get:Override
    @set:Override
    override var posterHeaders: Map<String, String>?

    // com.lagradost.cloudstream3.LoadResponse
    // com.lagradost.cloudstream3.LoadResponse
    @get:Override
    @set:Override
    override var posterUrl: String?
    private var rating: Integer?
    private override var recommendations: List<SearchResponse>?

    // com.lagradost.cloudstream3.LoadResponse
    @get:Override
    override val reviewUrl: String?
    private override var syncData: Map<String, String>

    // com.lagradost.cloudstream3.LoadResponse
    // com.lagradost.cloudstream3.LoadResponse
    @get:Override
    @set:Override
    override var tags: List<String>?

    // com.lagradost.cloudstream3.LoadResponse
    // com.lagradost.cloudstream3.LoadResponse
    @get:Override
    @set:Override
    override var trailers: List<String>?
    private override var type: TvType
    private override var url: String
    private var year: Integer?
    operator fun component1(): String {
        return getName()
    }

    operator fun component10(): List<String>? {
        return tags
    }

    operator fun component11(): Integer? {
        return getDuration()
    }

    operator fun component12(): List<String>? {
        return trailers
    }

    operator fun component13(): List<SearchResponse>? {
        return getRecommendations()
    }

    operator fun component14(): List<ActorData>? {
        return actors
    }

    operator fun component15(): Boolean {
        return comingSoon
    }

    operator fun component16(): Map<String, String> {
        return getSyncData()
    }

    operator fun component17(): String? {
        return reviewUrl
    }

    operator fun component18(): Map<String, String>? {
        return posterHeaders
    }

    operator fun component2(): String {
        return getUrl()
    }

    operator fun component3(): String? {
        return getApiName()
    }

    operator fun component4(): TvType {
        return getType()
    }

    operator fun component5(): String {
        return dataUrl
    }

    operator fun component6(): String? {
        return posterUrl
    }

    operator fun component7(): Integer? {
        return getYear()
    }

    operator fun component8(): String? {
        return plot
    }

    operator fun component9(): Integer? {
        return getRating()
    }

    fun copy(
        name: String,
        url: String,
        apiName: String?,
        type: TvType,
        dataUrl: String,
        str: String?,
        num: Integer?,
        str2: String?,
        num2: Integer?,
        list: List<String>?,
        num3: Integer?,
        list2: List<String>?,
        list3: List<SearchResponse>?,
        list4: List<ActorData>?,
        z: Boolean,
        syncData: Map<String, String>,
        str3: String?,
        map: Map<String, String>?
    ): MovieLoadResponse {
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(url, "url")
        Intrinsics.checkNotNullParameter(apiName, "apiName")
        Intrinsics.checkNotNullParameter(type, "type")
        Intrinsics.checkNotNullParameter(dataUrl, "dataUrl")
        Intrinsics.checkNotNullParameter(syncData, "syncData")
        return MovieLoadResponse(
            name,
            url,
            apiName,
            type,
            dataUrl,
            str,
            num,
            str2,
            num2,
            list,
            num3,
            list2,
            list3,
            list4,
            z,
            syncData,
            str3,
            map
        )
    }

    override fun equals(obj: Object): Boolean {
        if (this === obj) {
            return true
        }
        if (obj is MovieLoadResponse) {
            val movieLoadResponse = obj as MovieLoadResponse
            return Intrinsics.areEqual(
                getName(),
                movieLoadResponse.getName()
            ) && Intrinsics.areEqual(getUrl(), movieLoadResponse.getUrl()) && Intrinsics.areEqual(
                getApiName(),
                movieLoadResponse.getApiName()
            ) && getType() === movieLoadResponse.getType() && Intrinsics.areEqual(
                dataUrl, movieLoadResponse.dataUrl
            ) && Intrinsics.areEqual(
                posterUrl, movieLoadResponse.posterUrl
            ) && Intrinsics.areEqual(getYear(), movieLoadResponse.getYear()) && Intrinsics.areEqual(
                plot, movieLoadResponse.plot
            ) && Intrinsics.areEqual(
                getRating(),
                movieLoadResponse.getRating()
            ) && Intrinsics.areEqual(
                tags, movieLoadResponse.tags
            ) && Intrinsics.areEqual(
                getDuration(),
                movieLoadResponse.getDuration()
            ) && Intrinsics.areEqual(
                trailers, movieLoadResponse.trailers
            ) && Intrinsics.areEqual(
                getRecommendations(),
                movieLoadResponse.getRecommendations()
            ) && Intrinsics.areEqual(
                actors, movieLoadResponse.actors
            ) && comingSoon == movieLoadResponse.comingSoon && Intrinsics.areEqual(
                getSyncData(),
                movieLoadResponse.getSyncData()
            ) && Intrinsics.areEqual(
                reviewUrl, movieLoadResponse.reviewUrl
            ) && Intrinsics.areEqual(
                posterHeaders, movieLoadResponse.posterHeaders
            )
        }
        return false
    }

    override fun hashCode(): Int {
        val hashCode: Int =
            (((((((((((((getName().hashCode() * 31 + getUrl().hashCode()) * 31 + getApiName()!!.hashCode()) * 31 + getType().hashCode()) * 31 + dataUrl.hashCode()) * 31 + if (posterUrl == null) 0 else posterUrl!!.hashCode()) * 31 + if (getYear() == null) 0 else getYear().hashCode()) * 31 + if (plot == null) 0 else plot!!.hashCode()) * 31 + if (getRating() == null) 0 else getRating().hashCode()) * 31 + if (tags == null) 0 else tags!!.hashCode()) * 31 + if (getDuration() == null) 0 else getDuration().hashCode()) * 31 + if (trailers == null) 0 else trailers!!.hashCode()) * 31 + if (getRecommendations() == null) 0 else getRecommendations()!!.hashCode()) * 31 + if (actors == null) 0 else actors!!.hashCode()) * 31
        val comingSoon = comingSoon
        var i: Int = comingSoon.toInt()
        if (comingSoon) {
            i = 1
        }
        return (((hashCode + i) * 31 + getSyncData().hashCode()) * 31 + if (reviewUrl == null) 0 else reviewUrl!!.hashCode()) * 31 + if (posterHeaders != null) posterHeaders!!.hashCode() else 0
    }

    override fun toString(): String {
        return "MovieLoadResponse(name=" + getName() + ", url=" + getUrl() + ", apiName=" + getApiName() + ", type=" + getType() + ", dataUrl=" + dataUrl + ", posterUrl=" + posterUrl + ", year=" + getYear() + ", plot=" + plot + ", rating=" + getRating() + ", tags=" + tags + ", duration=" + getDuration() + ", trailers=" + trailers + ", recommendations=" + getRecommendations() + ", actors=" + actors + ", comingSoon=" + comingSoon + ", syncData=" + getSyncData() + ", reviewUrl=" + reviewUrl + ", posterHeaders=" + posterHeaders + ')'
    }

    init {
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(url, "url")
        Intrinsics.checkNotNullParameter(apiName, "apiName")
        Intrinsics.checkNotNullParameter(type, "type")
        Intrinsics.checkNotNullParameter(dataUrl, "dataUrl")
        Intrinsics.checkNotNullParameter(syncData, "syncData")
        this.name = name
        this.url = url
        this.apiName = apiName
        this.type = type
        this.dataUrl = dataUrl
        posterUrl = str
        year = num
        plot = str2
        rating = num2
        tags = list
        duration = num3
        trailers = list2
        recommendations = list3
        actors = list4
        comingSoon = z
        this.syncData = syncData
        reviewUrl = str3
        posterHeaders = map
    }

    @Override // com.lagradost.cloudstream3.LoadResponse
    override fun getName(): String {
        return name
    }

    @Override // com.lagradost.cloudstream3.LoadResponse
    override fun setName(str: String) {
        Intrinsics.checkNotNullParameter(str, "<set-?>")
        name = str
    }

    @Override // com.lagradost.cloudstream3.LoadResponse
    override fun getUrl(): String {
        return url
    }

    @Override // com.lagradost.cloudstream3.LoadResponse
    override fun setUrl(str: String) {
        Intrinsics.checkNotNullParameter(str, "<set-?>")
        url = str
    }

    @Override // com.lagradost.cloudstream3.LoadResponse
    override fun getApiName(): String? {
        return apiName
    }

    @Override // com.lagradost.cloudstream3.LoadResponse
    override fun setApiName(str: String?) {
        Intrinsics.checkNotNullParameter(str, "<set-?>")
        apiName = str
    }

    @Override // com.lagradost.cloudstream3.LoadResponse
    override fun getType(): TvType {
        return type
    }

    @Override // com.lagradost.cloudstream3.LoadResponse
    override fun setType(tvType: TvType) {
        Intrinsics.checkNotNullParameter(tvType, "<set-?>")
        type = tvType
    }

    fun getDataUrl(): String {
        return dataUrl
    }

    fun setDataUrl(str: String) {
        Intrinsics.checkNotNullParameter(str, "<set-?>")
        dataUrl = str
    }

    @Override // com.lagradost.cloudstream3.LoadResponse
    override fun getYear(): Integer? {
        return year
    }

    @Override // com.lagradost.cloudstream3.LoadResponse
    override fun setYear(num: Integer?) {
        year = num
    }

    @Override // com.lagradost.cloudstream3.LoadResponse
    override fun getRating(): Integer? {
        return rating
    }

    @Override // com.lagradost.cloudstream3.LoadResponse
    override fun setRating(num: Integer?) {
        rating = num
    }

    @Override // com.lagradost.cloudstream3.LoadResponse
    override fun getDuration(): Integer? {
        return duration
    }

    @Override // com.lagradost.cloudstream3.LoadResponse
    override fun setDuration(num: Integer?) {
        duration = num
    }

    @Override // com.lagradost.cloudstream3.LoadResponse
    override fun getRecommendations(): List<SearchResponse>? {
        return recommendations
    }

    @Override // com.lagradost.cloudstream3.LoadResponse
    override fun setRecommendations(list: List<SearchResponse>?) {
        recommendations = list
    }

    /* synthetic */   constructor(
        str: String,
        str2: String,
        str3: String?,
        tvType: TvType,
        str4: String,
        str5: String?,
        num: Integer?,
        str6: String?,
        num2: Integer?,
        list: List?,
        num3: Integer?,
        list2: List?,
        list3: List?,
        list4: List?,
        z: Boolean,
        map: Map?,
        str7: String?,
        map2: Map?,
        i: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(
        str,
        str2,
        str3,
        tvType,
        str4,
        if (i and 32 != 0) null else str5,
        if (i and 64 != 0) null else num,
        if (i and 128 != 0) null else str6,
        if (i and 256 != 0) null else num2,
        if (i and 512 != 0) null else list,
        if (i and 1024 != 0) null else num3,
        if (i and 2048 != 0) null else list2,
        if (i and 4096 != 0) null else list3,
        if (i and 8192 != 0) null else list4,
        if (i and 16384 != 0) false else z,
        if (32768 and i != 0) LinkedHashMap() else map,
        if (65536 and i != 0) null else str7,
        if (i and 131072 != 0) null else map2
    ) {
    }

    @Override // com.lagradost.cloudstream3.LoadResponse
    override fun getSyncData(): Map<String, String> {
        return syncData
    }

    @Override // com.lagradost.cloudstream3.LoadResponse
    override fun setSyncData(map: Map<String, String>) {
        Intrinsics.checkNotNullParameter(map, "<set-?>")
        syncData = map
    }
}