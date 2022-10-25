package com.lagradost.cloudstream3

import java.util.LinkedHashMap
import kotlin.jvm.internal.Intrinsics

/* compiled from: MainAPI.kt */
@Metadata(
    m108d1 = ["\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\bU\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B¿\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\u001a\b\u0002\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000c\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000c\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010#¢\u0006\u0002\u0010\$J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010HÆ\u0003J\u0011\u0010c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010HÆ\u0003J\u0010\u0010d\u001a\u0004\u0018\u00010\u000cHÆ\u0003¢\u0006\u0002\u00102J\u0010\u0010e\u001a\u0004\u0018\u00010\u000cHÆ\u0003¢\u0006\u0002\u00102J\u0011\u0010f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010HÆ\u0003J\u0011\u0010g\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0010HÆ\u0003J\u0011\u0010h\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0010HÆ\u0003J\t\u0010i\u001a\u00020\u001fHÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010k\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000eHÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010m\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010#HÆ\u0003J\t\u0010n\u001a\u00020\u0003HÆ\u0003J\t\u0010o\u001a\u00020\u0003HÆ\u0003J\t\u0010p\u001a\u00020\u0003HÆ\u0003J\t\u0010q\u001a\u00020\tHÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010s\u001a\u0004\u0018\u00010\u000cHÆ\u0003¢\u0006\u0002\u00102J\u001b\u0010t\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000eHÆ\u0003JÐ\u0002\u0010u\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\u001a\b\u0002\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000c2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000c2\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00102\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00102\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010#HÆ\u0001¢\u0006\u0002\u0010vJ\u0013\u0010w\u001a\u00020\u001f2\b\u0010x\u001a\u0004\u0018\u00010yHÖ\u0003J\t\u0010z\u001a\u00020\u000cHÖ\u0001J\t\u0010{\u001a\u00020\u0003HÖ\u0001R\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010\u0007\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010\u001e\u001a\u00020\u001fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u000cX\u0096\u000e¢\u0006\u0010\n\u0002\u00105\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010*\"\u0004\b7\u0010,R,\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010*\"\u0004\b=\u0010,R\u001a\u0010\u0005\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010*\"\u0004\b?\u0010,R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010*\"\u0004\bA\u0010,R(\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010#X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u00109\"\u0004\bC\u0010;R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010*\"\u0004\bE\u0010,R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u000cX\u0096\u000e¢\u0006\u0010\n\u0002\u00105\u001a\u0004\bF\u00102\"\u0004\bG\u00104R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010&\"\u0004\bI\u0010(R\u0016\u0010!\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010*R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR&\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u00109\"\u0004\bP\u0010;R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010&\"\u0004\bR\u0010(R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010&\"\u0004\bT\u0010(R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010&\"\u0004\bV\u0010(R\u001a\u0010\b\u001a\u00020\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001a\u0010\u0006\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010*\"\u0004\b\\\u0010,R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0096\u000e¢\u0006\u0010\n\u0002\u00105\u001a\u0004\b]\u00102\"\u0004\b^\u00104¨\u0006|"],
    m107d2 = ["Lcom/lagradost/cloudstream3/AnimeLoadResponse;", "Lcom/lagradost/cloudstream3/LoadResponse;", "engName", "", "japName", "name", "url", "apiName", "type", "Lcom/lagradost/cloudstream3/TvType;", "posterUrl", "year", "", "episodes", "", "Lcom/lagradost/cloudstream3/DubStatus;", "", "Lcom/lagradost/cloudstream3/Episode;", "showStatus", "Lcom/lagradost/cloudstream3/ShowStatus;", "plot", "tags", "synonyms", "rating", TypedValues.TransitionType.S_DURATION, "trailers", "recommendations", "Lcom/lagradost/cloudstream3/SearchResponse;", "actors", "Lcom/lagradost/cloudstream3/ActorData;", "comingSoon", "", "syncData", "reviewUrl", "posterHeaders", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;Lcom/lagradost/cloudstream3/ShowStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/util/Map;Ljava/lang/String;Ljava/util/Map;)V", "getActors", "()Ljava/util/List;", "setActors", "(Ljava/util/List;)V", "getApiName", "()Ljava/lang/String;", "setApiName", "(Ljava/lang/String;)V", "getComingSoon", "()Z", "setComingSoon", "(Z)V", "getDuration", "()Ljava/lang/Integer;", "setDuration", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getEngName", "setEngName", "getEpisodes", "()Ljava/util/Map;", "setEpisodes", "(Ljava/util/Map;)V", "getJapName", "setJapName", "getName", "setName", "getPlot", "setPlot", "getPosterHeaders", "setPosterHeaders", "getPosterUrl", "setPosterUrl", "getRating", "setRating", "getRecommendations", "setRecommendations", "getReviewUrl", "getShowStatus", "()Lcom/lagradost/cloudstream3/ShowStatus;", "setShowStatus", "(Lcom/lagradost/cloudstream3/ShowStatus;)V", "getSyncData", "setSyncData", "getSynonyms", "setSynonyms", "getTags", "setTags", "getTrailers", "setTrailers", "getType", "()Lcom/lagradost/cloudstream3/TvType;", "setType", "(Lcom/lagradost/cloudstream3/TvType;)V", "getUrl", "setUrl", "getYear", "setYear", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;Lcom/lagradost/cloudstream3/ShowStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/util/Map;Ljava/lang/String;Ljava/util/Map;)Lcom/lagradost/cloudstream3/AnimeLoadResponse;", "equals", "other", "", "hashCode", "toString", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class AnimeLoadResponse(
    str: String?,
    str2: String?,
    name: String,
    url: String,
    apiName: String?,
    type: TvType,
    str3: String?,
    num: Integer?,
    episodes: Map<DubStatus, List<Episode>>,
    showStatus: ShowStatus?,
    str4: String?,
    list: List<String>?,
    list2: List<String>?,
    num2: Integer?,
    num3: Integer?,
    list3: List<String>?,
    list4: List<SearchResponse>?,
    list5: List<ActorData>?,
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
    var engName: String?
    private var episodes: Map<DubStatus, List<Episode>>
    var japName: String?
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
    var showStatus: ShowStatus?
    private override var syncData: Map<String, String>
    var synonyms: List<String>?

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
    operator fun component1(): String? {
        return engName
    }

    operator fun component10(): ShowStatus? {
        return showStatus
    }

    operator fun component11(): String? {
        return plot
    }

    operator fun component12(): List<String>? {
        return tags
    }

    operator fun component13(): List<String>? {
        return synonyms
    }

    operator fun component14(): Integer? {
        return getRating()
    }

    operator fun component15(): Integer? {
        return getDuration()
    }

    operator fun component16(): List<String>? {
        return trailers
    }

    operator fun component17(): List<SearchResponse>? {
        return getRecommendations()
    }

    operator fun component18(): List<ActorData>? {
        return actors
    }

    operator fun component19(): Boolean {
        return comingSoon
    }

    operator fun component2(): String? {
        return japName
    }

    operator fun component20(): Map<String, String> {
        return getSyncData()
    }

    operator fun component21(): String? {
        return reviewUrl
    }

    operator fun component22(): Map<String, String>? {
        return posterHeaders
    }

    operator fun component3(): String {
        return getName()
    }

    operator fun component4(): String {
        return getUrl()
    }

    operator fun component5(): String? {
        return getApiName()
    }

    operator fun component6(): TvType {
        return getType()
    }

    operator fun component7(): String? {
        return posterUrl
    }

    operator fun component8(): Integer? {
        return getYear()
    }

    operator fun component9(): Map<DubStatus, List<Episode>> {
        return episodes
    }

    fun copy(
        str: String?,
        str2: String?,
        name: String,
        url: String,
        apiName: String?,
        type: TvType,
        str3: String?,
        num: Integer?,
        episodes: Map<DubStatus, List<Episode>>,
        showStatus: ShowStatus?,
        str4: String?,
        list: List<String>?,
        list2: List<String>?,
        num2: Integer?,
        num3: Integer?,
        list3: List<String>?,
        list4: List<SearchResponse>?,
        list5: List<ActorData>?,
        z: Boolean,
        syncData: Map<String, String>,
        str5: String?,
        map: Map<String, String>?
    ): AnimeLoadResponse {
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(url, "url")
        Intrinsics.checkNotNullParameter(apiName, "apiName")
        Intrinsics.checkNotNullParameter(type, "type")
        Intrinsics.checkNotNullParameter(episodes, "episodes")
        Intrinsics.checkNotNullParameter(syncData, "syncData")
        return AnimeLoadResponse(
            str,
            str2,
            name,
            url,
            apiName,
            type,
            str3,
            num,
            episodes,
            showStatus,
            str4,
            list,
            list2,
            num2,
            num3,
            list3,
            list4,
            list5,
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
        if (obj is AnimeLoadResponse) {
            val animeLoadResponse = obj as AnimeLoadResponse
            return Intrinsics.areEqual(engName, animeLoadResponse.engName) && Intrinsics.areEqual(
                japName, animeLoadResponse.japName
            ) && Intrinsics.areEqual(getName(), animeLoadResponse.getName()) && Intrinsics.areEqual(
                getUrl(),
                animeLoadResponse.getUrl()
            ) && Intrinsics.areEqual(
                getApiName(),
                animeLoadResponse.getApiName()
            ) && getType() === animeLoadResponse.getType() && Intrinsics.areEqual(
                posterUrl, animeLoadResponse.posterUrl
            ) && Intrinsics.areEqual(getYear(), animeLoadResponse.getYear()) && Intrinsics.areEqual(
                episodes, animeLoadResponse.episodes
            ) && showStatus == animeLoadResponse.showStatus && Intrinsics.areEqual(
                plot, animeLoadResponse.plot
            ) && Intrinsics.areEqual(tags, animeLoadResponse.tags) && Intrinsics.areEqual(
                synonyms, animeLoadResponse.synonyms
            ) && Intrinsics.areEqual(
                getRating(),
                animeLoadResponse.getRating()
            ) && Intrinsics.areEqual(
                getDuration(),
                animeLoadResponse.getDuration()
            ) && Intrinsics.areEqual(
                trailers, animeLoadResponse.trailers
            ) && Intrinsics.areEqual(
                getRecommendations(),
                animeLoadResponse.getRecommendations()
            ) && Intrinsics.areEqual(
                actors, animeLoadResponse.actors
            ) && comingSoon == animeLoadResponse.comingSoon && Intrinsics.areEqual(
                getSyncData(),
                animeLoadResponse.getSyncData()
            ) && Intrinsics.areEqual(
                reviewUrl, animeLoadResponse.reviewUrl
            ) && Intrinsics.areEqual(
                posterHeaders, animeLoadResponse.posterHeaders
            )
        }
        return false
    }

    override fun hashCode(): Int {
        val str = engName
        val hashCode = (str?.hashCode() ?: 0) * 31
        val str2 = japName
        val hashCode2: Int = ((((((((hashCode + (str2?.hashCode()
            ?: 0)) * 31 + getName().hashCode()) * 31 + getUrl().hashCode()) * 31 + getApiName()!!.hashCode()) * 31 + getType().hashCode()) * 31 + if (posterUrl == null) 0 else posterUrl!!.hashCode()) * 31 + if (getYear() == null) 0 else getYear().hashCode()) * 31 + episodes.hashCode()) * 31
        val showStatus = showStatus
        val hashCode3: Int =
            (((hashCode2 + if (showStatus == null) 0 else showStatus.hashCode()) * 31 + if (plot == null) 0 else plot!!.hashCode()) * 31 + if (tags == null) 0 else tags!!.hashCode()) * 31
        val list = synonyms
        val hashCode4: Int = ((((((hashCode3 + (list?.hashCode()
            ?: 0)) * 31 + if (getRating() == null) 0 else getRating().hashCode()) * 31 + if (getDuration() == null) 0 else getDuration().hashCode()) * 31 + if (trailers == null) 0 else trailers!!.hashCode()) * 31 + if (getRecommendations() == null) 0 else getRecommendations()!!.hashCode()) * 31 + if (actors == null) 0 else actors!!.hashCode()) * 31
        val comingSoon = comingSoon
        var i: Int = comingSoon.toInt()
        if (comingSoon) {
            i = 1
        }
        return (((hashCode4 + i) * 31 + getSyncData().hashCode()) * 31 + if (reviewUrl == null) 0 else reviewUrl!!.hashCode()) * 31 + if (posterHeaders != null) posterHeaders!!.hashCode() else 0
    }

    override fun toString(): String {
        return "AnimeLoadResponse(engName=" + engName + ", japName=" + japName + ", name=" + getName() + ", url=" + getUrl() + ", apiName=" + getApiName() + ", type=" + getType() + ", posterUrl=" + posterUrl + ", year=" + getYear() + ", episodes=" + episodes + ", showStatus=" + showStatus + ", plot=" + plot + ", tags=" + tags + ", synonyms=" + synonyms + ", rating=" + getRating() + ", duration=" + getDuration() + ", trailers=" + trailers + ", recommendations=" + getRecommendations() + ", actors=" + actors + ", comingSoon=" + comingSoon + ", syncData=" + getSyncData() + ", reviewUrl=" + reviewUrl + ", posterHeaders=" + posterHeaders + ')'
    }

    init {
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(url, "url")
        Intrinsics.checkNotNullParameter(apiName, "apiName")
        Intrinsics.checkNotNullParameter(type, "type")
        Intrinsics.checkNotNullParameter(episodes, "episodes")
        Intrinsics.checkNotNullParameter(syncData, "syncData")
        engName = str
        japName = str2
        this.name = name
        this.url = url
        this.apiName = apiName
        this.type = type
        posterUrl = str3
        year = num
        this.episodes = episodes
        this.showStatus = showStatus
        plot = str4
        tags = list
        synonyms = list2
        rating = num2
        duration = num3
        trailers = list3
        recommendations = list4
        actors = list5
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

    /* synthetic */   constructor(
        str: String?,
        str2: String?,
        str3: String,
        str4: String,
        str5: String?,
        tvType: TvType,
        str6: String?,
        num: Integer?,
        map: Map?,
        showStatus: ShowStatus?,
        str7: String?,
        list: List?,
        list2: List?,
        num2: Integer?,
        num3: Integer?,
        list3: List?,
        list4: List?,
        list5: List?,
        z: Boolean,
        map2: Map?,
        str8: String?,
        map3: Map?,
        i: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(
        if (i and 1 != 0) null else str,
        if (i and 2 != 0) null else str2,
        str3,
        str4,
        str5,
        tvType,
        if (i and 64 != 0) null else str6,
        if (i and 128 != 0) null else num,
        if (i and 256 != 0) LinkedHashMap() else map,
        if (i and 512 != 0) null else showStatus,
        if (i and 1024 != 0) null else str7,
        if (i and 2048 != 0) null else list,
        if (i and 4096 != 0) null else list2,
        if (i and 8192 != 0) null else num2,
        if (i and 16384 != 0) null else num3,
        if (32768 and i != 0) null else list3,
        if (65536 and i != 0) null else list4,
        if (131072 and i != 0) null else list5,
        if (262144 and i != 0) false else z,
        if (524288 and i != 0) LinkedHashMap() else map2,
        if (1048576 and i != 0) null else str8,
        if (i and 2097152 != 0) null else map3
    ) {
    }

    fun getEpisodes(): Map<DubStatus, List<Episode>> {
        return episodes
    }

    fun setEpisodes(map: Map<DubStatus, List<Episode>>) {
        Intrinsics.checkNotNullParameter(map, "<set-?>")
        episodes = map
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