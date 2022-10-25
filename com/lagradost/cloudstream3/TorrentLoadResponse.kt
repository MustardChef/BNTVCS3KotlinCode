package com.lagradost.cloudstream3

import java.util.LinkedHashMap
import kotlin.jvm.internal.Intrinsics

/* compiled from: MainAPI.kt */
@Metadata(
    m108d1 = ["\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\bJ\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0081\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001d¢\u0006\u0002\u0010\u001eJ\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010,J\u0011\u0010S\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010HÆ\u0003J\u0010\u0010T\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010,J\u0011\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010HÆ\u0003J\u0011\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0010HÆ\u0003J\u0011\u0010W\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0010HÆ\u0003J\t\u0010X\u001a\u00020\u0018HÆ\u0003J\u0015\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001aHÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010[\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001dHÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010a\u001a\u00020\nHÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010c\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010,J\u0096\u0002\u0010d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00102\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001dHÆ\u0001¢\u0006\u0002\u0010eJ\u0013\u0010f\u001a\u00020\u00182\b\u0010g\u001a\u0004\u0018\u00010hHÖ\u0003J\t\u0010i\u001a\u00020\rHÖ\u0001J\t\u0010j\u001a\u00020\u0003HÖ\u0001R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0005\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\u0017\u001a\u00020\u0018X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\rX\u0096\u000e¢\u0006\u0010\n\u0002\u0010/\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010$\"\u0004\b1\u0010&R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010$\"\u0004\b3\u0010&R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010$\"\u0004\b5\u0010&R(\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001dX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010$\"\u0004\b;\u0010&R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0096\u000e¢\u0006\u0010\n\u0002\u0010/\u001a\u0004\b<\u0010,\"\u0004\b=\u0010.R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010 \"\u0004\b?\u0010\"R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\$R&\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001aX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u00107\"\u0004\bB\u00109R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010 \"\u0004\bD\u0010\"R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010$\"\u0004\bF\u0010&R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010 \"\u0004\bH\u0010\"R\u001a\u0010\t\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001a\u0010\u0004\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010$\"\u0004\bN\u0010&R\u001e\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0096\u000e¢\u0006\u0010\n\u0002\u0010/\u001a\u0004\bO\u0010,\"\u0004\bP\u0010.¨\u0006k"],
    m107d2 = ["Lcom/lagradost/cloudstream3/TorrentLoadResponse;", "Lcom/lagradost/cloudstream3/LoadResponse;", "name", "", "url", "apiName", "magnet", "torrent", "plot", "type", "Lcom/lagradost/cloudstream3/TvType;", "posterUrl", "year", "", "rating", "tags", "", TypedValues.TransitionType.S_DURATION, "trailers", "recommendations", "Lcom/lagradost/cloudstream3/SearchResponse;", "actors", "Lcom/lagradost/cloudstream3/ActorData;", "comingSoon", "", "syncData", "", "reviewUrl", "posterHeaders", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/util/Map;Ljava/lang/String;Ljava/util/Map;)V", "getActors", "()Ljava/util/List;", "setActors", "(Ljava/util/List;)V", "getApiName", "()Ljava/lang/String;", "setApiName", "(Ljava/lang/String;)V", "getComingSoon", "()Z", "setComingSoon", "(Z)V", "getDuration", "()Ljava/lang/Integer;", "setDuration", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getMagnet", "setMagnet", "getName", "setName", "getPlot", "setPlot", "getPosterHeaders", "()Ljava/util/Map;", "setPosterHeaders", "(Ljava/util/Map;)V", "getPosterUrl", "setPosterUrl", "getRating", "setRating", "getRecommendations", "setRecommendations", "getReviewUrl", "getSyncData", "setSyncData", "getTags", "setTags", "getTorrent", "setTorrent", "getTrailers", "setTrailers", "getType", "()Lcom/lagradost/cloudstream3/TvType;", "setType", "(Lcom/lagradost/cloudstream3/TvType;)V", "getUrl", "setUrl", "getYear", "setYear", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/util/Map;Ljava/lang/String;Ljava/util/Map;)Lcom/lagradost/cloudstream3/TorrentLoadResponse;", "equals", "other", "", "hashCode", "toString", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class TorrentLoadResponse(
    name: String,
    url: String,
    apiName: String?,
    str: String,
    str2: String,
    str3: String?,
    type: TvType,
    str4: String?,
    num: Integer?,
    num2: Integer?,
    list: List<String>?,
    num3: Integer?,
    list2: List<String>?,
    list3: List<SearchResponse>?,
    list4: List<ActorData>?,
    z: Boolean,
    syncData: Map<String, String>,
    str5: String?,
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
    private var duration: Integer?
    var magnet: String
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
    var torrent: String

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

    operator fun component10(): Integer? {
        return getRating()
    }

    operator fun component11(): List<String>? {
        return tags
    }

    operator fun component12(): Integer? {
        return getDuration()
    }

    operator fun component13(): List<String>? {
        return trailers
    }

    operator fun component14(): List<SearchResponse>? {
        return getRecommendations()
    }

    operator fun component15(): List<ActorData>? {
        return actors
    }

    operator fun component16(): Boolean {
        return comingSoon
    }

    operator fun component17(): Map<String, String> {
        return getSyncData()
    }

    operator fun component18(): String? {
        return reviewUrl
    }

    operator fun component19(): Map<String, String>? {
        return posterHeaders
    }

    operator fun component2(): String {
        return getUrl()
    }

    operator fun component3(): String? {
        return getApiName()
    }

    operator fun component4(): String {
        return magnet
    }

    operator fun component5(): String {
        return torrent
    }

    operator fun component6(): String? {
        return plot
    }

    operator fun component7(): TvType {
        return getType()
    }

    operator fun component8(): String? {
        return posterUrl
    }

    operator fun component9(): Integer? {
        return getYear()
    }

    fun copy(
        name: String,
        url: String,
        apiName: String?,
        str: String,
        str2: String,
        str3: String?,
        type: TvType,
        str4: String?,
        num: Integer?,
        num2: Integer?,
        list: List<String>?,
        num3: Integer?,
        list2: List<String>?,
        list3: List<SearchResponse>?,
        list4: List<ActorData>?,
        z: Boolean,
        syncData: Map<String, String>,
        str5: String?,
        map: Map<String, String>?
    ): TorrentLoadResponse {
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(url, "url")
        Intrinsics.checkNotNullParameter(apiName, "apiName")
        Intrinsics.checkNotNullParameter(type, "type")
        Intrinsics.checkNotNullParameter(syncData, "syncData")
        return TorrentLoadResponse(
            name,
            url,
            apiName,
            str,
            str2,
            str3,
            type,
            str4,
            num,
            num2,
            list,
            num3,
            list2,
            list3,
            list4,
            z,
            syncData,
            str5,
            map
        )
    }

    override fun equals(obj: Object): Boolean {
        if (this === obj) {
            return true
        }
        if (obj is TorrentLoadResponse) {
            val torrentLoadResponse = obj as TorrentLoadResponse
            return Intrinsics.areEqual(
                getName(),
                torrentLoadResponse.getName()
            ) && Intrinsics.areEqual(getUrl(), torrentLoadResponse.getUrl()) && Intrinsics.areEqual(
                getApiName(),
                torrentLoadResponse.getApiName()
            ) && Intrinsics.areEqual(
                magnet, torrentLoadResponse.magnet
            ) && Intrinsics.areEqual(
                torrent, torrentLoadResponse.torrent
            ) && Intrinsics.areEqual(
                plot, torrentLoadResponse.plot
            ) && getType() === torrentLoadResponse.getType() && Intrinsics.areEqual(
                posterUrl, torrentLoadResponse.posterUrl
            ) && Intrinsics.areEqual(
                getYear(),
                torrentLoadResponse.getYear()
            ) && Intrinsics.areEqual(
                getRating(),
                torrentLoadResponse.getRating()
            ) && Intrinsics.areEqual(
                tags, torrentLoadResponse.tags
            ) && Intrinsics.areEqual(
                getDuration(),
                torrentLoadResponse.getDuration()
            ) && Intrinsics.areEqual(
                trailers, torrentLoadResponse.trailers
            ) && Intrinsics.areEqual(
                getRecommendations(),
                torrentLoadResponse.getRecommendations()
            ) && Intrinsics.areEqual(
                actors, torrentLoadResponse.actors
            ) && comingSoon == torrentLoadResponse.comingSoon && Intrinsics.areEqual(
                getSyncData(),
                torrentLoadResponse.getSyncData()
            ) && Intrinsics.areEqual(
                reviewUrl, torrentLoadResponse.reviewUrl
            ) && Intrinsics.areEqual(
                posterHeaders, torrentLoadResponse.posterHeaders
            )
        }
        return false
    }

    override fun hashCode(): Int {
        val hashCode =
            ((getName().hashCode() * 31 + getUrl().hashCode()) * 31 + getApiName()!!.hashCode()) * 31
        val str = magnet
        val hashCode2 = (hashCode + (str?.hashCode() ?: 0)) * 31
        val str2 = torrent
        val hashCode3: Int = (((((((((((hashCode2 + (str2?.hashCode()
            ?: 0)) * 31 + if (plot == null) 0 else plot!!.hashCode()) * 31 + getType().hashCode()) * 31 + if (posterUrl == null) 0 else posterUrl!!.hashCode()) * 31 + if (getYear() == null) 0 else getYear().hashCode()) * 31 + if (getRating() == null) 0 else getRating().hashCode()) * 31 + if (tags == null) 0 else tags!!.hashCode()) * 31 + if (getDuration() == null) 0 else getDuration().hashCode()) * 31 + if (trailers == null) 0 else trailers!!.hashCode()) * 31 + if (getRecommendations() == null) 0 else getRecommendations()!!.hashCode()) * 31 + if (actors == null) 0 else actors!!.hashCode()) * 31
        val comingSoon = comingSoon
        var i: Int = comingSoon.toInt()
        if (comingSoon) {
            i = 1
        }
        return (((hashCode3 + i) * 31 + getSyncData().hashCode()) * 31 + if (reviewUrl == null) 0 else reviewUrl!!.hashCode()) * 31 + if (posterHeaders != null) posterHeaders!!.hashCode() else 0
    }

    override fun toString(): String {
        return "TorrentLoadResponse(name=" + getName() + ", url=" + getUrl() + ", apiName=" + getApiName() + ", magnet=" + magnet + ", torrent=" + torrent + ", plot=" + plot + ", type=" + getType() + ", posterUrl=" + posterUrl + ", year=" + getYear() + ", rating=" + getRating() + ", tags=" + tags + ", duration=" + getDuration() + ", trailers=" + trailers + ", recommendations=" + getRecommendations() + ", actors=" + actors + ", comingSoon=" + comingSoon + ", syncData=" + getSyncData() + ", reviewUrl=" + reviewUrl + ", posterHeaders=" + posterHeaders + ')'
    }

    init {
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(url, "url")
        Intrinsics.checkNotNullParameter(apiName, "apiName")
        Intrinsics.checkNotNullParameter(type, "type")
        Intrinsics.checkNotNullParameter(syncData, "syncData")
        this.name = name
        this.url = url
        this.apiName = apiName
        magnet = str
        torrent = str2
        plot = str3
        this.type = type
        posterUrl = str4
        year = num
        rating = num2
        tags = list
        duration = num3
        trailers = list2
        recommendations = list3
        actors = list4
        comingSoon = z
        this.syncData = syncData
        reviewUrl = str5
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

    /* synthetic */   constructor(
        str: String,
        str2: String,
        str3: String?,
        str4: String,
        str5: String,
        str6: String?,
        tvType: TvType?,
        str7: String?,
        num: Integer?,
        num2: Integer?,
        list: List?,
        num3: Integer?,
        list2: List?,
        list3: List?,
        list4: List?,
        z: Boolean,
        map: Map?,
        str8: String?,
        map2: Map?,
        i: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(
        str,
        str2,
        str3,
        str4,
        str5,
        str6,
        (if (i and 64 != 0) TvType.Torrent else tvType)!!,
        if (i and 128 != 0) null else str7,
        if (i and 256 != 0) null else num,
        if (i and 512 != 0) null else num2,
        if (i and 1024 != 0) null else list,
        if (i and 2048 != 0) null else num3,
        if (i and 4096 != 0) null else list2,
        if (i and 8192 != 0) null else list3,
        if (i and 16384 != 0) null else list4,
        if (32768 and i != 0) false else z,
        if (65536 and i != 0) LinkedHashMap() else map,
        if (131072 and i != 0) null else str8,
        if (i and 262144 != 0) null else map2
    ) {
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