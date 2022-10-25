package com.lagradost.cloudstream3.utils

import android.content.Context
import com.lagradost.cloudstream3.AcraApplication
import kotlin.jvm.internal.Intrinsics

/* compiled from: DataStoreHelper.kt */
@Metadata(
    m108d1 = ["\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004ABCDB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000cJ\u0010\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000cH\u0002J\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000cJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0011J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\bJ\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0019J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u00182\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0019J\u000e\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\bJ$\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000c2\u0006\u0010\u0007\u001a\u00020\b2\u000c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000cJ\u0017\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\"J\u0006\u0010#\u001a\u00020\u0006J\u0015\u0010$\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010&J\u0017\u0010'\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0002\u0010&J\u001d\u0010(\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010)\u001a\u00020\u0010¢\u0006\u0002\u0010*J\u0016\u0010+\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0004J\u0016\u0010-\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010.\u001a\u00020\u0016JI\u0010/\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010\b2\b\u00100\u001a\u0004\u0018\u00010\b2\b\u00101\u001a\u0004\u0018\u00010\b2\b\u00102\u001a\u0004\u0018\u00010\b2\b\b\u0002\u00103\u001a\u0002042\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u00106J\u001d\u00107\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u00108\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u00109J\u001d\u0010:\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010.\u001a\u00020\b¢\u0006\u0002\u0010;J%\u0010<\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010=\u001a\u00020\u00142\u0006\u0010>\u001a\u00020\u0014¢\u0006\u0002\u0010?J\n\u0010@\u001a\u00020!*\u00020!R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006E"],
    m107d2 = ["Lcom/lagradost/cloudstream3/utils/DataStoreHelper;", "", "()V", "currentAccount", "", "addSync", "", "id", "", "idPrefix", "url", "getAllResumeStateIds", "", "getAllResumeStateIdsOld", "getAllWatchStateIds", "getBookmarkedData", "Lcom/lagradost/cloudstream3/utils/DataStoreHelper\$BookmarkedData;", "(Ljava/lang/Integer;)Lcom/lagradost/cloudstream3/utils/DataStoreHelper\$BookmarkedData;", "getCache", "cacheTime", "", "getDub", "Lcom/lagradost/cloudstream3/DubStatus;", "getLastWatched", "Lcom/lagradost/cloudstream3/utils/VideoDownloadHelper\$ResumeWatching;", "(Ljava/lang/Integer;)Lcom/lagradost/cloudstream3/utils/VideoDownloadHelper\$ResumeWatching;", "getLastWatchedOld", "getResultSeason", "getResultWatchState", "Lcom/lagradost/cloudstream3/ui/WatchType;", "getSync", "idPrefixes", "getViewPos", "Lcom/lagradost/cloudstream3/utils/DataStoreHelper\$PosDur;", "(Ljava/lang/Integer;)Lcom/lagradost/cloudstream3/utils/DataStoreHelper\$PosDur;", "migrateResumeWatching", "removeLastWatched", "parentId", "(Ljava/lang/Integer;)V", "removeLastWatchedOld", "setBookmarkedData", "data", "(Ljava/lang/Integer;Lcom/lagradost/cloudstream3/utils/DataStoreHelper\$BookmarkedData;)V", "setCache", "response", "setDub", "status", "setLastWatched", "episodeId", "episode", "season", "isFromDownload", "", "updateTime", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/Long;)V", "setResultSeason", "value", "(ILjava/lang/Integer;)V", "setResultWatchState", "(Ljava/lang/Integer;I)V", "setViewPos", "pos", "dur", "(Ljava/lang/Integer;JJ)V", "fixVisual", "BookmarkedData", "Cache", "PosDur", "ResumeWatchingResult", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class DataStoreHelper private constructor() {
    /* compiled from: DataStoreHelper.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000c\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"],
        m107d2 = ["Lcom/lagradost/cloudstream3/utils/DataStoreHelper\$PosDur;", "", "position", "", TypedValues.TransitionType.S_DURATION, "(JJ)V", "getDuration", "()J", "getPosition", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class PosDur(
        @param:JsonProperty("position") val position: Long, @param:JsonProperty(
            "duration"
        ) val duration: Long
    ) {
        operator fun component1(): Long {
            return position
        }

        operator fun component2(): Long {
            return duration
        }

        fun copy(@JsonProperty("position") j: Long, @JsonProperty("duration") j2: Long): PosDur {
            return PosDur(j, j2)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is PosDur) {
                val posDur = obj as PosDur
                return position == posDur.position && duration == posDur.duration
            }
            return false
        }

        override fun hashCode(): Int {
            return `C$r8$backportedMethods$utility$Long$1$hashCode`.hashCode(position) * 31 + `C$r8$backportedMethods$utility$Long$1$hashCode`.hashCode(
                duration
            )
        }

        override fun toString(): String {
            return "PosDur(position=" + position + ", duration=" + duration + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                posDur: PosDur,
                j: Long,
                j2: Long,
                i: Int,
                obj: Object?
            ): PosDur {
                var j = j
                var j2 = j2
                if (i and 1 != 0) {
                    j = posDur.position
                }
                if (i and 2 != 0) {
                    j2 = posDur.duration
                }
                return posDur.copy(j, j2)
            }
        }
    }

    fun fixVisual(posDur: PosDur): PosDur {
        Intrinsics.checkNotNullParameter(posDur, "<this>")
        if (posDur.duration <= 0) {
            return PosDur(0L, posDur.duration)
        }
        val j: Long = 100
        val position = posDur.position * j / posDur.duration
        if (position <= 1) {
            return PosDur(0L, posDur.duration)
        }
        if (position <= 5) {
            return PosDur(5 * posDur.duration / j, posDur.duration)
        }
        return if (position >= 95) PosDur(posDur.duration, posDur.duration) else posDur
    }

    /* compiled from: DataStoreHelper.kt */
    @Metadata(
        m108d1 = ["\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b+\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\b\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0016\b\u0003\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013J\u0010\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u00101\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0017\u00102\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0012HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\bHÆ\u0003J\t\u00106\u001a\u00020\bHÆ\u0003J\t\u00107\u001a\u00020\bHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u000cHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0094\u0001\u0010;\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0016\b\u0003\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@HÖ\u0003J\t\u0010A\u001a\u00020\u0003HÖ\u0001J\t\u0010B\u001a\u00020\bHÖ\u0001R\u0014\u0010\n\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0012X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\r\u001a\u0004\u0018\u00010\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0015\"\u0004\b$\u0010%R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0014\u0010\t\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0015R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b/\u0010\u0019¨\u0006C"],
        m107d2 = ["Lcom/lagradost/cloudstream3/utils/DataStoreHelper\$BookmarkedData;", "Lcom/lagradost/cloudstream3/SearchResponse;", "id", "", "bookmarkedTime", "", "latestUpdatedTime", "name", "", "url", "apiName", "type", "Lcom/lagradost/cloudstream3/TvType;", "posterUrl", "year", "quality", "Lcom/lagradost/cloudstream3/SearchQuality;", "posterHeaders", "", "(Ljava/lang/Integer;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/String;Ljava/lang/Integer;Lcom/lagradost/cloudstream3/SearchQuality;Ljava/util/Map;)V", "getApiName", "()Ljava/lang/String;", "getBookmarkedTime", "()J", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getLatestUpdatedTime", "getName", "getPosterHeaders", "()Ljava/util/Map;", "setPosterHeaders", "(Ljava/util/Map;)V", "getPosterUrl", "setPosterUrl", "(Ljava/lang/String;)V", "getQuality", "()Lcom/lagradost/cloudstream3/SearchQuality;", "setQuality", "(Lcom/lagradost/cloudstream3/SearchQuality;)V", "getType", "()Lcom/lagradost/cloudstream3/TvType;", "setType", "(Lcom/lagradost/cloudstream3/TvType;)V", "getUrl", "getYear", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/String;Ljava/lang/Integer;Lcom/lagradost/cloudstream3/SearchQuality;Ljava/util/Map;)Lcom/lagradost/cloudstream3/utils/DataStoreHelper\$BookmarkedData;", "equals", "", "other", "", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class BookmarkedData(
        @JsonProperty("id") num: Integer?,
        @JsonProperty("bookmarkedTime") j: Long,
        @JsonProperty("latestUpdatedTime") j2: Long,
        @JsonProperty("name") name: String,
        @JsonProperty("url") url: String,
        @JsonProperty("apiName") apiName: String,
        @JsonProperty("type") tvType: TvType?,
        @JsonProperty("posterUrl") str: String?,
        @JsonProperty("year") num2: Integer,
        @JsonProperty("quality") searchQuality: SearchQuality?,
        @JsonProperty("posterHeaders") map: Map<String, String>?
    ) : SearchResponse {
        // com.lagradost.cloudstream3.SearchResponse
        @get:Override
        val apiName: String
        val bookmarkedTime: Long

        /* renamed from: id */
        private var f10024id: Integer?
        val latestUpdatedTime: Long

        // com.lagradost.cloudstream3.SearchResponse
        @get:Override
        val name: String

        // com.lagradost.cloudstream3.SearchResponse
        // com.lagradost.cloudstream3.SearchResponse
        @get:Override
        @set:Override
        var posterHeaders: Map<String, String>?

        // com.lagradost.cloudstream3.SearchResponse
        // com.lagradost.cloudstream3.SearchResponse
        @get:Override
        @set:Override
        var posterUrl: String?
        private var quality: SearchQuality?
        private var type: TvType?

        // com.lagradost.cloudstream3.SearchResponse
        @get:Override
        val url: String
        private val year: Integer
        operator fun component1(): Integer? {
            return id
        }

        operator fun component10(): SearchQuality? {
            return getQuality()
        }

        operator fun component11(): Map<String, String>? {
            return posterHeaders
        }

        operator fun component2(): Long {
            return bookmarkedTime
        }

        operator fun component3(): Long {
            return latestUpdatedTime
        }

        operator fun component4(): String {
            return name
        }

        operator fun component5(): String {
            return url
        }

        operator fun component6(): String {
            return apiName
        }

        operator fun component7(): TvType? {
            return getType()
        }

        operator fun component8(): String? {
            return posterUrl
        }

        operator fun component9(): Integer {
            return year
        }

        fun copy(
            @JsonProperty("id") num: Integer?,
            @JsonProperty("bookmarkedTime") j: Long,
            @JsonProperty("latestUpdatedTime") j2: Long,
            @JsonProperty("name") name: String,
            @JsonProperty("url") url: String,
            @JsonProperty("apiName") apiName: String,
            @JsonProperty("type") tvType: TvType?,
            @JsonProperty("posterUrl") str: String?,
            @JsonProperty("year") num2: Integer,
            @JsonProperty("quality") searchQuality: SearchQuality?,
            @JsonProperty("posterHeaders") map: Map<String, String>?
        ): BookmarkedData {
            Intrinsics.checkNotNullParameter(name, "name")
            Intrinsics.checkNotNullParameter(url, "url")
            Intrinsics.checkNotNullParameter(apiName, "apiName")
            return BookmarkedData(
                num,
                j,
                j2,
                name,
                url,
                apiName,
                tvType,
                str,
                num2,
                searchQuality,
                map
            )
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is BookmarkedData) {
                val bookmarkedData = obj as BookmarkedData
                return Intrinsics.areEqual(
                    id,
                    bookmarkedData.id
                ) && bookmarkedTime == bookmarkedData.bookmarkedTime && latestUpdatedTime == bookmarkedData.latestUpdatedTime && Intrinsics.areEqual(
                    name, bookmarkedData.name
                ) && Intrinsics.areEqual(url, bookmarkedData.url) && Intrinsics.areEqual(
                    apiName, bookmarkedData.apiName
                ) && getType() === bookmarkedData.getType() && Intrinsics.areEqual(
                    posterUrl, bookmarkedData.posterUrl
                ) && Intrinsics.areEqual(
                    year,
                    bookmarkedData.year
                ) && getQuality() === bookmarkedData.getQuality() && Intrinsics.areEqual(
                    posterHeaders, bookmarkedData.posterHeaders
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val hashCode: Int =
                ((((((((if (id == null) 0 else id.hashCode()) * 31 + `C$r8$backportedMethods$utility$Long$1$hashCode`.hashCode(
                    bookmarkedTime
                )) * 31 + `C$r8$backportedMethods$utility$Long$1$hashCode`.hashCode(
                    latestUpdatedTime
                )) * 31 + name.hashCode()) * 31 + url.hashCode()) * 31 + apiName.hashCode()) * 31 + if (getType() == null) 0 else getType().hashCode()) * 31 + if (posterUrl == null) 0 else posterUrl!!.hashCode()) * 31
            val num: Integer = year
            return ((hashCode + if (num == null) 0 else num.hashCode()) * 31 + if (getQuality() == null) 0 else getQuality().hashCode()) * 31 + if (posterHeaders != null) posterHeaders!!.hashCode() else 0
        }

        override fun toString(): String {
            return "BookmarkedData(id=" + id + ", bookmarkedTime=" + bookmarkedTime + ", latestUpdatedTime=" + latestUpdatedTime + ", name=" + name + ", url=" + url + ", apiName=" + apiName + ", type=" + getType() + ", posterUrl=" + posterUrl + ", year=" + year + ", quality=" + getQuality() + ", posterHeaders=" + posterHeaders + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(name, "name")
            Intrinsics.checkNotNullParameter(url, "url")
            Intrinsics.checkNotNullParameter(apiName, "apiName")
            f10024id = num
            bookmarkedTime = j
            latestUpdatedTime = j2
            this.name = name
            this.url = url
            this.apiName = apiName
            type = tvType
            posterUrl = str
            year = num2
            quality = searchQuality
            posterHeaders = map
        }

        /* synthetic */   constructor(
            num: Integer?,
            j: Long,
            j2: Long,
            str: String,
            str2: String,
            str3: String,
            tvType: TvType?,
            str4: String?,
            num2: Integer,
            searchQuality: SearchQuality?,
            map: Map?,
            i: Int,
            defaultConstructorMarker: DefaultConstructorMarker?
        ) : this(
            num,
            j,
            j2,
            str,
            str2,
            str3,
            if (i and 64 != 0) null else tvType,
            str4,
            num2,
            if (i and 512 != 0) null else searchQuality,
            if (i and 1024 != 0) null else map
        ) {
        }

        // com.lagradost.cloudstream3.SearchResponse
        // com.lagradost.cloudstream3.SearchResponse
        @get:Override
        @set:Override
        var id: Integer?
            // com.lagradost.cloudstream3.SearchResponse
            get() = f10024id
            set(num) {
                f10024id = num
            }

        @Override // com.lagradost.cloudstream3.SearchResponse
        override fun getType(): TvType? {
            return type
        }

        @Override // com.lagradost.cloudstream3.SearchResponse
        override fun setType(tvType: TvType?) {
            type = tvType
        }

        fun getYear(): Integer {
            return year
        }

        @Override // com.lagradost.cloudstream3.SearchResponse
        override fun getQuality(): SearchQuality? {
            return quality
        }

        @Override // com.lagradost.cloudstream3.SearchResponse
        override fun setQuality(searchQuality: SearchQuality?) {
            quality = searchQuality
        }
    }

    /* compiled from: DataStoreHelper.kt */
    @Metadata(
        m108d1 = ["\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b0\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000c\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000c\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0016\b\u0003\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u000cHÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u00107\u001a\u00020\u0011HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0017\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u000cHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010@\u001a\u0004\u0018\u00010\u000cHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010A\u001a\u0004\u0018\u00010\u000cHÆ\u0003¢\u0006\u0002\u0010\u001aJ®\u0001\u0010B\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000c2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000c2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000c2\b\b\u0003\u0010\u0010\u001a\u00020\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0016\b\u0003\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010CJ\u0013\u0010D\u001a\u00020\u00112\b\u0010E\u001a\u0004\u0018\u00010FHÖ\u0003J\t\u0010G\u001a\u00020\u000cHÖ\u0001J\t\u0010H\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000c¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u001a\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000c¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b!\u0010\u001aR(\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0018\"\u0004\b'\u0010(R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000c¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b-\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b3\u00104¨\u0006I"],
        m107d2 = ["Lcom/lagradost/cloudstream3/utils/DataStoreHelper\$ResumeWatchingResult;", "Lcom/lagradost/cloudstream3/SearchResponse;", "name", "", "url", "apiName", "type", "Lcom/lagradost/cloudstream3/TvType;", "posterUrl", "watchPos", "Lcom/lagradost/cloudstream3/utils/DataStoreHelper\$PosDur;", "id", "", "parentId", "episode", "season", "isFromDownload", "", "quality", "Lcom/lagradost/cloudstream3/SearchQuality;", "posterHeaders", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/String;Lcom/lagradost/cloudstream3/utils/DataStoreHelper\$PosDur;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLcom/lagradost/cloudstream3/SearchQuality;Ljava/util/Map;)V", "getApiName", "()Ljava/lang/String;", "getEpisode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId", "setId", "(Ljava/lang/Integer;)V", "()Z", "getName", "getParentId", "getPosterHeaders", "()Ljava/util/Map;", "setPosterHeaders", "(Ljava/util/Map;)V", "getPosterUrl", "setPosterUrl", "(Ljava/lang/String;)V", "getQuality", "()Lcom/lagradost/cloudstream3/SearchQuality;", "setQuality", "(Lcom/lagradost/cloudstream3/SearchQuality;)V", "getSeason", "getType", "()Lcom/lagradost/cloudstream3/TvType;", "setType", "(Lcom/lagradost/cloudstream3/TvType;)V", "getUrl", "getWatchPos", "()Lcom/lagradost/cloudstream3/utils/DataStoreHelper\$PosDur;", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/String;Lcom/lagradost/cloudstream3/utils/DataStoreHelper\$PosDur;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLcom/lagradost/cloudstream3/SearchQuality;Ljava/util/Map;)Lcom/lagradost/cloudstream3/utils/DataStoreHelper\$ResumeWatchingResult;", "equals", "other", "", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class ResumeWatchingResult(
        @JsonProperty("name") name: String,
        @JsonProperty("url") url: String,
        @JsonProperty("apiName") apiName: String,
        @JsonProperty("type") tvType: TvType?,
        @JsonProperty("posterUrl") str: String?,
        @JsonProperty("watchPos") posDur: PosDur,
        @JsonProperty("id") num: Integer?,
        @JsonProperty("parentId") num2: Integer,
        @JsonProperty("episode") num3: Integer,
        @JsonProperty("season") num4: Integer,
        @JsonProperty("isFromDownload") z: Boolean,
        @JsonProperty("quality") searchQuality: SearchQuality?,
        @JsonProperty("posterHeaders") map: Map<String, String>?
    ) : SearchResponse {
        // com.lagradost.cloudstream3.SearchResponse
        @get:Override
        val apiName: String
        private val episode: Integer

        /* renamed from: id */
        private var f10025id: Integer?
        val isFromDownload: Boolean

        // com.lagradost.cloudstream3.SearchResponse
        @get:Override
        val name: String
        private val parentId: Integer

        // com.lagradost.cloudstream3.SearchResponse
        // com.lagradost.cloudstream3.SearchResponse
        @get:Override
        @set:Override
        var posterHeaders: Map<String, String>?

        // com.lagradost.cloudstream3.SearchResponse
        // com.lagradost.cloudstream3.SearchResponse
        @get:Override
        @set:Override
        var posterUrl: String?
        private var quality: SearchQuality?
        private val season: Integer
        private var type: TvType?

        // com.lagradost.cloudstream3.SearchResponse
        @get:Override
        val url: String
        val watchPos: PosDur
        operator fun component1(): String {
            return name
        }

        operator fun component10(): Integer {
            return season
        }

        operator fun component11(): Boolean {
            return isFromDownload
        }

        operator fun component12(): SearchQuality? {
            return getQuality()
        }

        operator fun component13(): Map<String, String>? {
            return posterHeaders
        }

        operator fun component2(): String {
            return url
        }

        operator fun component3(): String {
            return apiName
        }

        operator fun component4(): TvType? {
            return getType()
        }

        operator fun component5(): String? {
            return posterUrl
        }

        operator fun component6(): PosDur {
            return watchPos
        }

        operator fun component7(): Integer? {
            return id
        }

        operator fun component8(): Integer {
            return parentId
        }

        operator fun component9(): Integer {
            return episode
        }

        fun copy(
            @JsonProperty("name") name: String,
            @JsonProperty("url") url: String,
            @JsonProperty("apiName") apiName: String,
            @JsonProperty("type") tvType: TvType?,
            @JsonProperty("posterUrl") str: String?,
            @JsonProperty("watchPos") posDur: PosDur,
            @JsonProperty("id") num: Integer?,
            @JsonProperty("parentId") num2: Integer,
            @JsonProperty("episode") num3: Integer,
            @JsonProperty("season") num4: Integer,
            @JsonProperty("isFromDownload") z: Boolean,
            @JsonProperty("quality") searchQuality: SearchQuality?,
            @JsonProperty("posterHeaders") map: Map<String, String>?
        ): ResumeWatchingResult {
            Intrinsics.checkNotNullParameter(name, "name")
            Intrinsics.checkNotNullParameter(url, "url")
            Intrinsics.checkNotNullParameter(apiName, "apiName")
            return ResumeWatchingResult(
                name,
                url,
                apiName,
                tvType,
                str,
                posDur,
                num,
                num2,
                num3,
                num4,
                z,
                searchQuality,
                map
            )
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is ResumeWatchingResult) {
                val resumeWatchingResult = obj as ResumeWatchingResult
                return Intrinsics.areEqual(name, resumeWatchingResult.name) && Intrinsics.areEqual(
                    url, resumeWatchingResult.url
                ) && Intrinsics.areEqual(
                    apiName, resumeWatchingResult.apiName
                ) && getType() === resumeWatchingResult.getType() && Intrinsics.areEqual(
                    posterUrl, resumeWatchingResult.posterUrl
                ) && Intrinsics.areEqual(
                    watchPos,
                    resumeWatchingResult.watchPos
                ) && Intrinsics.areEqual(
                    id, resumeWatchingResult.id
                ) && Intrinsics.areEqual(
                    parentId,
                    resumeWatchingResult.parentId
                ) && Intrinsics.areEqual(
                    episode, resumeWatchingResult.episode
                ) && Intrinsics.areEqual(
                    season, resumeWatchingResult.season
                ) && isFromDownload == resumeWatchingResult.isFromDownload && getQuality() === resumeWatchingResult.getQuality() && Intrinsics.areEqual(
                    posterHeaders, resumeWatchingResult.posterHeaders
                )
            }
            return false
        }

        /* JADX WARN: Multi-variable type inference failed */
        override fun hashCode(): Int {
            val hashCode: Int =
                ((((name.hashCode() * 31 + url.hashCode()) * 31 + apiName.hashCode()) * 31 + if (getType() == null) 0 else getType().hashCode()) * 31 + if (posterUrl == null) 0 else posterUrl!!.hashCode()) * 31
            val posDur = watchPos
            val hashCode2: Int = ((hashCode + (posDur?.hashCode()
                ?: 0)) * 31 + if (id == null) 0 else id.hashCode()) * 31
            val num: Integer = parentId
            val hashCode3: Int = (hashCode2 + if (num == null) 0 else num.hashCode()) * 31
            val num2: Integer = episode
            val hashCode4: Int = (hashCode3 + if (num2 == null) 0 else num2.hashCode()) * 31
            val num3: Integer = season
            val hashCode5: Int = (hashCode4 + if (num3 == null) 0 else num3.hashCode()) * 31
            val z = isFromDownload
            var i: Int = z.toInt()
            if (z.toInt() != 0) {
                i = 1
            }
            return ((hashCode5 + i) * 31 + if (getQuality() == null) 0 else getQuality().hashCode()) * 31 + if (posterHeaders != null) posterHeaders!!.hashCode() else 0
        }

        override fun toString(): String {
            return "ResumeWatchingResult(name=" + name + ", url=" + url + ", apiName=" + apiName + ", type=" + getType() + ", posterUrl=" + posterUrl + ", watchPos=" + watchPos + ", id=" + id + ", parentId=" + parentId + ", episode=" + episode + ", season=" + season + ", isFromDownload=" + isFromDownload + ", quality=" + getQuality() + ", posterHeaders=" + posterHeaders + ')'
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
            watchPos = posDur
            f10025id = num
            parentId = num2
            episode = num3
            season = num4
            isFromDownload = z
            quality = searchQuality
            posterHeaders = map
        }

        /* synthetic */   constructor(
            str: String,
            str2: String,
            str3: String,
            tvType: TvType?,
            str4: String?,
            posDur: PosDur,
            num: Integer?,
            num2: Integer,
            num3: Integer,
            num4: Integer,
            z: Boolean,
            searchQuality: SearchQuality?,
            map: Map?,
            i: Int,
            defaultConstructorMarker: DefaultConstructorMarker?
        ) : this(
            str,
            str2,
            str3,
            if (i and 8 != 0) null else tvType,
            str4,
            posDur,
            num,
            num2,
            num3,
            num4,
            z,
            if (i and 2048 != 0) null else searchQuality,
            if (i and 4096 != 0) null else map
        ) {
        }

        @Override // com.lagradost.cloudstream3.SearchResponse
        override fun getType(): TvType? {
            return type
        }

        @Override // com.lagradost.cloudstream3.SearchResponse
        override fun setType(tvType: TvType?) {
            type = tvType
        }

        // com.lagradost.cloudstream3.SearchResponse
        // com.lagradost.cloudstream3.SearchResponse
        @get:Override
        @set:Override
        var id: Integer?
            // com.lagradost.cloudstream3.SearchResponse
            get() = f10025id
            set(num) {
                f10025id = num
            }

        fun getParentId(): Integer {
            return parentId
        }

        fun getEpisode(): Integer {
            return episode
        }

        fun getSeason(): Integer {
            return season
        }

        @Override // com.lagradost.cloudstream3.SearchResponse
        override fun getQuality(): SearchQuality? {
            return quality
        }

        @Override // com.lagradost.cloudstream3.SearchResponse
        override fun setQuality(searchQuality: SearchQuality?) {
            quality = searchQuality
        }
    }

    val allWatchStateIds: List<Any>?
        get() {
            val str = currentAccount + "/result_watch_state"
            val keys: List<String> = AcraApplication.Companion.getKeys(str)
            if (keys != null) {
                val arrayList = ArrayList()
                for (str2 in keys) {
                    val intOrNull: Integer? = StringsKt.toIntOrNull(
                        StringsKt.removePrefix(
                            str2,
                            (str + JsonPointer.SEPARATOR) as CharSequence
                        )
                    )
                    if (intOrNull != null) {
                        arrayList.add(intOrNull)
                    }
                }
                return arrayList
            }
            return null
        }
    val allResumeStateIds: List<Any>?
        get() {
            val str = currentAccount + "/result_resume_watching_2"
            val keys: List<String> = AcraApplication.Companion.getKeys(str)
            if (keys != null) {
                val arrayList = ArrayList()
                for (str2 in keys) {
                    val intOrNull: Integer? = StringsKt.toIntOrNull(
                        StringsKt.removePrefix(
                            str2,
                            (str + JsonPointer.SEPARATOR) as CharSequence
                        )
                    )
                    if (intOrNull != null) {
                        arrayList.add(intOrNull)
                    }
                }
                return arrayList
            }
            return null
        }
    private val allResumeStateIdsOld: List<Any>?
        private get() {
            val str = currentAccount + "/result_resume_watching"
            val keys: List<String> = AcraApplication.Companion.getKeys(str)
            if (keys != null) {
                val arrayList = ArrayList()
                for (str2 in keys) {
                    val intOrNull: Integer? = StringsKt.toIntOrNull(
                        StringsKt.removePrefix(
                            str2,
                            (str + JsonPointer.SEPARATOR) as CharSequence
                        )
                    )
                    if (intOrNull != null) {
                        arrayList.add(intOrNull)
                    }
                }
                return arrayList
            }
            return null
        }

    fun migrateResumeWatching() {
        AcraApplication.Companion.setKey(
            DataStoreHelperKt.RESULT_RESUME_WATCHING_HAS_MIGRATED,
            true
        )
        val allResumeStateIdsOld: List<Integer>? = allResumeStateIdsOld
        if (allResumeStateIdsOld != null) {
            for (number in allResumeStateIdsOld) {
                val intValue: Int = number.intValue()
                val dataStoreHelper = INSTANCE
                val lastWatchedOld: ResumeWatching? =
                    dataStoreHelper.getLastWatchedOld(Integer.valueOf(intValue))
                if (lastWatchedOld != null) {
                    dataStoreHelper.setLastWatched(
                        Integer.valueOf(lastWatchedOld.getParentId()),
                        null,
                        lastWatchedOld.getEpisode(),
                        lastWatchedOld.getSeason(),
                        lastWatchedOld.isFromDownload(),
                        Long.valueOf(lastWatchedOld.getUpdateTime())
                    )
                    dataStoreHelper.removeLastWatchedOld(Integer.valueOf(lastWatchedOld.getParentId()))
                }
            }
        }
    }

    fun setLastWatched(
        num: Integer?,
        num2: Integer?,
        num3: Integer?,
        num4: Integer?,
        z: Boolean,
        l: Long?
    ) {
        if (num == null) {
            return
        }
        val companion: AcraApplication.Companion = AcraApplication.Companion
        companion.setKey(
            currentAccount + "/result_resume_watching_2",
            num.toString(),
            ResumeWatching(
                num.intValue(),
                num2,
                num3,
                num4,
                if (l != null) l.longValue() else System.currentTimeMillis(),
                z
            )
        )
    }

    private fun removeLastWatchedOld(num: Integer?) {
        if (num == null) {
            return
        }
        val companion: AcraApplication.Companion = AcraApplication.Companion
        companion.removeKey(currentAccount + "/result_resume_watching", num.toString())
    }

    fun removeLastWatched(num: Integer?) {
        if (num == null) {
            return
        }
        val companion: AcraApplication.Companion = AcraApplication.Companion
        companion.removeKey(currentAccount + "/result_resume_watching_2", num.toString())
    }

    fun getLastWatched(num: Integer?): ResumeWatching? {
        var obj: Object? = null
        if (num == null) {
            return null
        }
        val companion: AcraApplication.Companion = AcraApplication.Companion
        val str = currentAccount + "/result_resume_watching_2"
        val num2: String = num.toString()
        val context: Context = companion.getContext()
        if (context != null) {
            val dataStore: DataStore = DataStore.Companion.INSTANCE
            try {
                val string: String = dataStore.getSharedPrefs(context)
                    .getString(dataStore.getFolderName(str, num2), null)
                if (string != null) {
                    Intrinsics.checkNotNullExpressionValue(
                        string,
                        "getSharedPrefs().getStri…h, null) ?: return defVal"
                    )
                    val readValue: Object =
                        dataStore.mapper.readValue<Any>(string, ResumeWatching::class.java)
                    Intrinsics.checkNotNullExpressionValue(
                        readValue,
                        "mapper.readValue(this, T::class.java)"
                    )
                    obj = readValue
                }
            } catch (unused: Exception) {
            }
        }
        return obj as ResumeWatching?
    }

    fun getLastWatchedOld(num: Integer?): ResumeWatching? {
        var obj: Object? = null
        if (num == null) {
            return null
        }
        val companion: AcraApplication.Companion = AcraApplication.Companion
        val str = currentAccount + "/result_resume_watching"
        val num2: String = num.toString()
        val context: Context = companion.getContext()
        if (context != null) {
            val dataStore: DataStore = DataStore.Companion.INSTANCE
            try {
                val string: String = dataStore.getSharedPrefs(context)
                    .getString(dataStore.getFolderName(str, num2), null)
                if (string != null) {
                    Intrinsics.checkNotNullExpressionValue(
                        string,
                        "getSharedPrefs().getStri…h, null) ?: return defVal"
                    )
                    val readValue: Object =
                        dataStore.mapper.readValue<Any>(string, ResumeWatching::class.java)
                    Intrinsics.checkNotNullExpressionValue(
                        readValue,
                        "mapper.readValue(this, T::class.java)"
                    )
                    obj = readValue
                }
            } catch (unused: Exception) {
            }
        }
        return obj as ResumeWatching?
    }

    fun setBookmarkedData(num: Integer?, data: BookmarkedData?) {
        Intrinsics.checkNotNullParameter(data, "data")
        if (num == null) {
            return
        }
        val companion: AcraApplication.Companion = AcraApplication.Companion
        companion.setKey(currentAccount + "/result_watch_state_data", num.toString(), data)
    }

    fun getBookmarkedData(num: Integer?): BookmarkedData? {
        var obj: Object? = null
        if (num == null) {
            return null
        }
        val companion: AcraApplication.Companion = AcraApplication.Companion
        val str = currentAccount + "/result_watch_state_data"
        val num2: String = num.toString()
        val context: Context = companion.getContext()
        if (context != null) {
            val dataStore: DataStore = DataStore.Companion.INSTANCE
            try {
                val string: String = dataStore.getSharedPrefs(context)
                    .getString(dataStore.getFolderName(str, num2), null)
                if (string != null) {
                    Intrinsics.checkNotNullExpressionValue(
                        string,
                        "getSharedPrefs().getStri…h, null) ?: return defVal"
                    )
                    val readValue: Object =
                        dataStore.mapper.readValue<Any>(string, BookmarkedData::class.java)
                    Intrinsics.checkNotNullExpressionValue(
                        readValue,
                        "mapper.readValue(this, T::class.java)"
                    )
                    obj = readValue
                }
            } catch (unused: Exception) {
            }
        }
        return obj
    }

    fun setViewPos(num: Integer?, j: Long, j2: Long) {
        if (num != null && j2 >= 30000) {
            val companion: AcraApplication.Companion = AcraApplication.Companion
            companion.setKey(currentAccount + "/video_pos_dur", num.toString(), PosDur(j, j2))
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun getViewPos(r5: Int?): PosDur {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            com.lagradost.cloudstream3.AcraApplication$Companion r1 = com.lagradost.cloudstream3.AcraApplication.Companion
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.lagradost.cloudstream3.utils.DataStoreHelper.currentAccount
            r2.append(r3)
            java.lang.String r3 = "/video_pos_dur"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = r5.toString()
            android.content.Context r1 = r1.getContext()
            if (r1 == 0) goto L4e
            com.lagradost.cloudstream3.utils.DataStore r3 = com.lagradost.cloudstream3.utils.DataStore.INSTANCE
            java.lang.String r5 = r3.getFolderName(r2, r5)
            android.content.SharedPreferences r1 = r3.getSharedPrefs(r1)     // Catch: java.lang.Exception -> L49
            java.lang.String r5 = r1.getString(r5, r0)     // Catch: java.lang.Exception -> L49
            if (r5 != 0) goto L34
            goto L49
        L34:
            java.lang.String r1 = "getSharedPrefs().getStri…h, null) ?: return defVal"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)     // Catch: java.lang.Exception -> L49
            com.fasterxml.jackson.databind.json.JsonMapper r1 = r3.getMapper()     // Catch: java.lang.Exception -> L49
            java.lang.Class<com.lagradost.cloudstream3.utils.DataStoreHelper$PosDur> r2 = com.lagradost.cloudstream3.utils.DataStoreHelper.PosDur.class
            java.lang.Object r5 = r1.readValue(r5, r2)     // Catch: java.lang.Exception -> L49
            java.lang.String r1 = "mapper.readValue(this, T::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)     // Catch: java.lang.Exception -> L49
            goto L4a
        L49:
            r5 = r0
        L4a:
            if (r5 != 0) goto L4d
            goto L4e
        L4d:
            r0 = r5
        L4e:
            com.lagradost.cloudstream3.utils.DataStoreHelper$PosDur r0 = (com.lagradost.cloudstream3.utils.DataStoreHelper.PosDur) r0
            return r0
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.utils.DataStoreHelper.getViewPos(java.lang.Integer):com.lagradost.cloudstream3.utils.DataStoreHelper\$PosDur")
    }

    fun getDub(i: Int): DubStatus {
        val values: Array<DubStatus> = DubStatus.values()
        val companion: AcraApplication.Companion = AcraApplication.Companion
        val str = currentAccount + "/result_dub"
        val valueOf: String = String.valueOf(i)
        val context: Context = companion.getContext()
        var obj: Object? = null
        if (context != null) {
            val dataStore: DataStore = DataStore.Companion.INSTANCE
            try {
                val string: String = dataStore.getSharedPrefs(context)
                    .getString(dataStore.getFolderName(str, valueOf), null)
                if (string != null) {
                    Intrinsics.checkNotNullExpressionValue(
                        string,
                        "getSharedPrefs().getStri…h, null) ?: return defVal"
                    )
                    val readValue: Object =
                        dataStore.mapper.readValue<Any>(string, Integer::class.java)
                    Intrinsics.checkNotNullExpressionValue(
                        readValue,
                        "mapper.readValue(this, T::class.java)"
                    )
                    obj = readValue
                }
            } catch (unused: Exception) {
            }
        }
        val num: Integer? = obj as Integer?
        return values.get(if (num != null) num.intValue() else 0)
    }

    fun setDub(i: Int, status: DubStatus) {
        Intrinsics.checkNotNullParameter(status, "status")
        val companion: AcraApplication.Companion = AcraApplication.Companion
        companion.setKey(
            currentAccount + "/result_dub",
            String.valueOf(i),
            Integer.valueOf(status.ordinal())
        )
    }

    /* compiled from: DataStoreHelper.kt */
    @Metadata(
        m108d1 = ["\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000c\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"],
        m107d2 = ["Lcom/lagradost/cloudstream3/utils/DataStoreHelper\$Cache;", "", "time", "", "value", "", "(JLjava/lang/String;)V", "getTime", "()J", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class Cache(@JsonProperty("time") j: Long, @JsonProperty("value") value: String) {
        val time: Long
        val value: String
        operator fun component1(): Long {
            return time
        }

        operator fun component2(): String {
            return value
        }

        fun copy(@JsonProperty("time") j: Long, @JsonProperty("value") value: String): Cache {
            Intrinsics.checkNotNullParameter(value, "value")
            return Cache(j, value)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Cache) {
                val cache = obj as Cache
                return time == cache.time && Intrinsics.areEqual(value, cache.value)
            }
            return false
        }

        override fun hashCode(): Int {
            return `C$r8$backportedMethods$utility$Long$1$hashCode`.hashCode(time) * 31 + value.hashCode()
        }

        override fun toString(): String {
            return "Cache(time=" + time + ", value=" + value + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(value, "value")
            time = j
            this.value = value
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                cache: Cache,
                j: Long,
                str: String,
                i: Int,
                obj: Object?
            ): Cache {
                var j = j
                var str = str
                if (i and 1 != 0) {
                    j = cache.time
                }
                if (i and 2 != 0) {
                    str = cache.value
                }
                return cache.copy(j, str)
            }
        }
    }

    fun setCache(url: String, response: String) {
        Intrinsics.checkNotNullParameter(url, "url")
        Intrinsics.checkNotNullParameter(response, "response")
        Log.d("BLUE", "insert cache to $url ")
        AcraApplication.Companion.setKey(
            "cache/api",
            url,
            Gson().toJson(Cache(System.currentTimeMillis(), response))
        )
    }

    fun getCache(url: String, j: Long): String? {
        val obj: Object?
        val str: String?
        var cache: Cache
        val string: String
        Intrinsics.checkNotNullParameter(url, "url")
        val context: Context = AcraApplication.Companion.context
        if (context != null) {
            val dataStore: DataStore = DataStore.Companion.INSTANCE
            try {
                string = dataStore.getSharedPrefs(context)
                    .getString(dataStore.getFolderName("cache/api", url), null)
            } catch (unused: Exception) {
            }
            if (string != null) {
                Intrinsics.checkNotNullExpressionValue(
                    string,
                    "getSharedPrefs().getStri…h, null) ?: return defVal"
                )
                obj = dataStore.mapper.readValue<Any>(string, String::class.java)
                Intrinsics.checkNotNullExpressionValue(obj, "mapper.readValue(this, T::class.java)")
                str = obj
                return if (str == null && Gson().fromJson<Any>(
                        str,
                        Cache::class.java as Class<Object?>?
                    ) as com.lagradost.cloudstream3.utils.DataStoreHelper.Cache?. also {
                        cache = it
                    } != null && System.currentTimeMillis() <= cache.time + j
                ) {
                    cache.value
                } else null
            }
        }
        obj = null
        str = obj
        return if (str == null) {
            null
        } else cache.value
    }

    fun setResultWatchState(num: Integer?, i: Int) {
        if (num == null) {
            return
        }
        val str = currentAccount + "/result_watch_state"
        if (i == WatchType.NONE.getInternalId()) {
            AcraApplication.Companion.removeKey(str, num.toString())
            AcraApplication.Companion.removeKey(
                currentAccount + "/result_watch_state_data",
                num.toString()
            )
            return
        }
        AcraApplication.Companion.setKey(str, num.toString(), Integer.valueOf(i))
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun getResultWatchState(r6: Int): WatchType {
        /*
            r5 = this;
            com.lagradost.cloudstream3.ui.WatchType$Companion r0 = com.lagradost.cloudstream3.p041ui.WatchType.Companion
            com.lagradost.cloudstream3.AcraApplication$Companion r1 = com.lagradost.cloudstream3.AcraApplication.Companion
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.lagradost.cloudstream3.utils.DataStoreHelper.currentAccount
            r2.append(r3)
            java.lang.String r3 = "/result_watch_state"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            android.content.Context r1 = r1.getContext()
            r3 = 0
            if (r1 == 0) goto L4d
            com.lagradost.cloudstream3.utils.DataStore r4 = com.lagradost.cloudstream3.utils.DataStore.INSTANCE
            java.lang.String r6 = r4.getFolderName(r2, r6)
            android.content.SharedPreferences r1 = r4.getSharedPrefs(r1)     // Catch: java.lang.Exception -> L48
            java.lang.String r6 = r1.getString(r6, r3)     // Catch: java.lang.Exception -> L48
            if (r6 != 0) goto L33
            goto L48
        L33:
            java.lang.String r1 = "getSharedPrefs().getStri…h, null) ?: return defVal"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)     // Catch: java.lang.Exception -> L48
            com.fasterxml.jackson.databind.json.JsonMapper r1 = r4.getMapper()     // Catch: java.lang.Exception -> L48
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            java.lang.Object r6 = r1.readValue(r6, r2)     // Catch: java.lang.Exception -> L48
            java.lang.String r1 = "mapper.readValue(this, T::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)     // Catch: java.lang.Exception -> L48
            goto L49
        L48:
            r6 = r3
        L49:
            if (r6 != 0) goto L4c
            goto L4d
        L4c:
            r3 = r6
        L4d:
            java.lang.Integer r3 = (java.lang.Integer) r3
            com.lagradost.cloudstream3.ui.WatchType r6 = r0.fromInternalId(r3)
            return r6
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.utils.DataStoreHelper.getResultWatchState(int):com.lagradost.cloudstream3.ui.WatchType")
    }

    fun getResultSeason(i: Int): Int {
        val companion: AcraApplication.Companion = AcraApplication.Companion
        val str = currentAccount + "/result_season"
        val valueOf: String = String.valueOf(i)
        val context: Context = companion.getContext()
        var obj: Object? = null
        if (context != null) {
            val dataStore: DataStore = DataStore.Companion.INSTANCE
            try {
                val string: String = dataStore.getSharedPrefs(context)
                    .getString(dataStore.getFolderName(str, valueOf), null)
                if (string != null) {
                    Intrinsics.checkNotNullExpressionValue(
                        string,
                        "getSharedPrefs().getStri…h, null) ?: return defVal"
                    )
                    val readValue: Object =
                        dataStore.mapper.readValue<Any>(string, Integer::class.java)
                    Intrinsics.checkNotNullExpressionValue(
                        readValue,
                        "mapper.readValue(this, T::class.java)"
                    )
                    obj = readValue
                }
            } catch (unused: Exception) {
            }
        }
        val num: Integer? = obj as Integer?
        return if (num != null) {
            num.intValue()
        } else -1
    }

    fun setResultSeason(i: Int, num: Integer?) {
        val companion: AcraApplication.Companion = AcraApplication.Companion
        companion.setKey(currentAccount + "/result_season", String.valueOf(i), num)
    }

    fun addSync(i: Int, idPrefix: String, url: String?) {
        Intrinsics.checkNotNullParameter(idPrefix, "idPrefix")
        Intrinsics.checkNotNullParameter(url, "url")
        val companion: AcraApplication.Companion = AcraApplication.Companion
        companion.setKey(idPrefix + "_sync", String.valueOf(i), url)
    }

    fun getSync(i: Int, idPrefixes: List<String>): List<String> {
        Intrinsics.checkNotNullParameter(idPrefixes, "idPrefixes")
        val arrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(idPrefixes, 10))
        val it: Iterator<T> = idPrefixes.iterator()
        while (it.hasNext()) {
            val companion: AcraApplication.Companion =
                AcraApplication.Companion
            val str = (it.next() as String).toString() + "_sync"
            val valueOf: String = String.valueOf(i)
            val context: Context = companion.getContext()
            var obj: Object? = null
            if (context != null) {
                val dataStore: DataStore = DataStore.Companion.INSTANCE
                try {
                    val string: String = dataStore.getSharedPrefs(context)
                        .getString(dataStore.getFolderName(str, valueOf), null)
                    if (string != null) {
                        Intrinsics.checkNotNullExpressionValue(
                            string,
                            "getSharedPrefs().getStri…h, null) ?: return defVal"
                        )
                        val readValue: Object =
                            dataStore.mapper.readValue<Any>(string, String::class.java)
                        Intrinsics.checkNotNullExpressionValue(
                            readValue,
                            "mapper.readValue(this, T::class.java)"
                        )
                        obj = readValue
                    }
                } catch (unused: Exception) {
                }
            }
            arrayList.add(obj as String?)
        }
        return arrayList
    }

    companion object {
        @kotlin.jvm.JvmField
        val INSTANCE = DataStoreHelper()
        private const val currentAccount = "0"
        fun  /* synthetic */`setLastWatched$default`(
            dataStoreHelper: DataStoreHelper,
            num: Integer?,
            num2: Integer?,
            num3: Integer?,
            num4: Integer?,
            z: Boolean,
            l: Long?,
            i: Int,
            obj: Object?
        ) {
            var l = l
            val z2 = if (i and 16 != 0) false else z
            if (i and 32 != 0) {
                l = null
            }
            dataStoreHelper.setLastWatched(num, num2, num3, num4, z2, l)
        }

        fun  /* synthetic */`getCache$default`(
            dataStoreHelper: DataStoreHelper,
            str: String,
            j: Long,
            i: Int,
            obj: Object?
        ): String? {
            var j = j
            if (i and 2 != 0) {
                j = 14400000
            }
            return dataStoreHelper.getCache(str, j)
        }
    }
}