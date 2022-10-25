package com.lagradost.cloudstream3.utils

import com.lagradost.cloudstream3.MainAPIKt.isMovieType
import com.lagradost.cloudstream3.MainAPIKt.getMapper
import com.lagradost.cloudstream3.CommonActivity.Companion.`showToast$default`
import com.lagradost.cloudstream3.MainAPIKt.base64Decode
import com.lagradost.cloudstream3.AcraApplication.Companion.getKeys
import com.lagradost.cloudstream3.AcraApplication.Companion.setKey
import com.lagradost.cloudstream3.AcraApplication.Companion.context
import com.lagradost.cloudstream3.AcraApplication.Companion.removeKey
import com.lagradost.cloudstream3.MainActivityKt.getApp
import com.lagradost.cloudstream3.APIHolder.getApiFromNameNull
import com.lagradost.cloudstream3.MainAPI.extractorVerifierJob
import androidx.exifinterface.media.ExifInterface
import com.google.android.exoplayer2.source.rtsp.SessionDescription
import kotlin.LazyKt
import com.lagradost.cloudstream3.utils.``Vector2$lengthSquared$2`
import kotlin.jvm.internal.Intrinsics

/* compiled from: VideoDownloadHelper.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0006"],
    m107d2 = ["Lcom/lagradost/cloudstream3/utils/VideoDownloadHelper;", "", "()V", "DownloadEpisodeCached", "DownloadHeaderCached", "ResumeWatching", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
object VideoDownloadHelper {
    val INSTANCE: VideoDownloadHelper = VideoDownloadHelper()

    /* compiled from: VideoDownloadHelper.kt */
    @Metadata(
        m108d1 = ["\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u000c\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\rHÆ\u0003Jr\u0010&\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\b\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\u00062\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u000c\u001a\u00020\rHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\u0006HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000c\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u001a¨\u0006."],
        m107d2 = ["Lcom/lagradost/cloudstream3/utils/VideoDownloadHelper\$DownloadEpisodeCached;", "Lcom/lagradost/cloudstream3/ui/download/EasyDownloadButton\$IMinimumData;", "name", "", "poster", "episode", "", "season", "id", "parentId", "rating", "description", "cacheTime", "", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;IILjava/lang/Integer;Ljava/lang/String;J)V", "getCacheTime", "()J", "getDescription", "()Ljava/lang/String;", "getEpisode", "()I", "getId", "getName", "getParentId", "getPoster", "getRating", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSeason", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;IILjava/lang/Integer;Ljava/lang/String;J)Lcom/lagradost/cloudstream3/utils/VideoDownloadHelper\$DownloadEpisodeCached;", "equals", "", "other", "", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class DownloadEpisodeCached(
        @param:JsonProperty("name") val name: String,
        @param:JsonProperty(
            "poster"
        ) val poster: String,
        @param:JsonProperty("episode") val episode: Int,
        @JsonProperty("season") num: Integer,
        @JsonProperty("id") i2: Int,
        @JsonProperty("parentId") i3: Int,
        @JsonProperty("rating") num2: Integer,
        @JsonProperty("description") str3: String,
        @JsonProperty("cacheTime") j: Long
    ) : IMinimumData {
        val cacheTime: Long
        val description: String

        // com.lagradost.cloudstream3.p041ui.download.EasyDownloadButton.IMinimumData
        /* renamed from: id */
        @get:Override
        val id: Int
        val parentId: Int
        private val rating: Integer
        private val season: Integer
        operator fun component1(): String {
            return name
        }

        operator fun component2(): String {
            return poster
        }

        operator fun component3(): Int {
            return episode
        }

        operator fun component4(): Integer {
            return season
        }

        operator fun component5(): Int {
            return id
        }

        operator fun component6(): Int {
            return parentId
        }

        operator fun component7(): Integer {
            return rating
        }

        operator fun component8(): String {
            return description
        }

        operator fun component9(): Long {
            return cacheTime
        }

        fun copy(
            @JsonProperty("name") str: String,
            @JsonProperty("poster") str2: String,
            @JsonProperty("episode") i: Int,
            @JsonProperty("season") num: Integer,
            @JsonProperty("id") i2: Int,
            @JsonProperty("parentId") i3: Int,
            @JsonProperty("rating") num2: Integer,
            @JsonProperty("description") str3: String,
            @JsonProperty("cacheTime") j: Long
        ): DownloadEpisodeCached {
            return DownloadEpisodeCached(str, str2, i, num, i2, i3, num2, str3, j)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is DownloadEpisodeCached) {
                val downloadEpisodeCached = obj as DownloadEpisodeCached
                return Intrinsics.areEqual(name, downloadEpisodeCached.name) && Intrinsics.areEqual(
                    poster, downloadEpisodeCached.poster
                ) && episode == downloadEpisodeCached.episode && Intrinsics.areEqual(
                    season, downloadEpisodeCached.season
                ) && id == downloadEpisodeCached.id && parentId == downloadEpisodeCached.parentId && Intrinsics.areEqual(
                    rating, downloadEpisodeCached.rating
                ) && Intrinsics.areEqual(
                    description, downloadEpisodeCached.description
                ) && cacheTime == downloadEpisodeCached.cacheTime
            }
            return false
        }

        override fun hashCode(): Int {
            val str = name
            val hashCode = (str?.hashCode() ?: 0) * 31
            val str2 = poster
            val hashCode2 = ((hashCode + (str2?.hashCode() ?: 0)) * 31 + episode) * 31
            val num: Integer = season
            val hashCode3: Int =
                (((hashCode2 + if (num == null) 0 else num.hashCode()) * 31 + id) * 31 + parentId) * 31
            val num2: Integer = rating
            val hashCode4: Int = (hashCode3 + if (num2 == null) 0 else num2.hashCode()) * 31
            val str3 = description
            return (hashCode4 + (str3?.hashCode()
                ?: 0)) * 31 + `C$r8$backportedMethods$utility$Long$1$hashCode`.hashCode(
                cacheTime
            )
        }

        override fun toString(): String {
            return "DownloadEpisodeCached(name=" + name + ", poster=" + poster + ", episode=" + episode + ", season=" + season + ", id=" + id + ", parentId=" + parentId + ", rating=" + rating + ", description=" + description + ", cacheTime=" + cacheTime + ')'
        }

        init {
            season = num
            id = i2
            parentId = i3
            rating = num2
            description = str3
            cacheTime = j
        }

        fun getSeason(): Integer {
            return season
        }

        fun getRating(): Integer {
            return rating
        }
    }

    /* compiled from: VideoDownloadHelper.kt */
    @Metadata(
        m108d1 = ["\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u000c¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000cHÆ\u0003JQ\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\u000cHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\nHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u000c¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006&"],
        m107d2 = ["Lcom/lagradost/cloudstream3/utils/VideoDownloadHelper\$DownloadHeaderCached;", "", "apiName", "", "url", "type", "Lcom/lagradost/cloudstream3/TvType;", "name", "poster", "id", "", "cacheTime", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/String;Ljava/lang/String;IJ)V", "getApiName", "()Ljava/lang/String;", "getCacheTime", "()J", "getId", "()I", "getName", "getPoster", "getType", "()Lcom/lagradost/cloudstream3/TvType;", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class DownloadHeaderCached(
        @JsonProperty("apiName") apiName: String,
        @JsonProperty("url") url: String,
        @JsonProperty("type") type: TvType,
        @JsonProperty("name") name: String,
        @JsonProperty("poster") str: String,
        @JsonProperty("id") i: Int,
        @JsonProperty("cacheTime") j: Long
    ) {
        val apiName: String
        val cacheTime: Long

        /* renamed from: id */
        val id: Int
        val name: String
        val poster: String
        private val type: TvType
        val url: String
        operator fun component1(): String {
            return apiName
        }

        operator fun component2(): String {
            return url
        }

        operator fun component3(): TvType {
            return type
        }

        operator fun component4(): String {
            return name
        }

        operator fun component5(): String {
            return poster
        }

        operator fun component6(): Int {
            return id
        }

        operator fun component7(): Long {
            return cacheTime
        }

        fun copy(
            @JsonProperty("apiName") apiName: String,
            @JsonProperty("url") url: String,
            @JsonProperty("type") type: TvType,
            @JsonProperty("name") name: String,
            @JsonProperty("poster") str: String,
            @JsonProperty("id") i: Int,
            @JsonProperty("cacheTime") j: Long
        ): DownloadHeaderCached {
            Intrinsics.checkNotNullParameter(apiName, "apiName")
            Intrinsics.checkNotNullParameter(url, "url")
            Intrinsics.checkNotNullParameter(type, "type")
            Intrinsics.checkNotNullParameter(name, "name")
            return DownloadHeaderCached(apiName, url, type, name, str, i, j)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is DownloadHeaderCached) {
                val downloadHeaderCached = obj as DownloadHeaderCached
                return Intrinsics.areEqual(
                    apiName,
                    downloadHeaderCached.apiName
                ) && Intrinsics.areEqual(
                    url, downloadHeaderCached.url
                ) && type === downloadHeaderCached.type && Intrinsics.areEqual(
                    name, downloadHeaderCached.name
                ) && Intrinsics.areEqual(
                    poster, downloadHeaderCached.poster
                ) && id == downloadHeaderCached.id && cacheTime == downloadHeaderCached.cacheTime
            }
            return false
        }

        override fun hashCode(): Int {
            val hashCode: Int =
                (((apiName.hashCode() * 31 + url.hashCode()) * 31 + type.hashCode()) * 31 + name.hashCode()) * 31
            val str = poster
            return ((hashCode + (str?.hashCode()
                ?: 0)) * 31 + id) * 31 + `C$r8$backportedMethods$utility$Long$1$hashCode`.hashCode(
                cacheTime
            )
        }

        override fun toString(): String {
            return "DownloadHeaderCached(apiName=" + apiName + ", url=" + url + ", type=" + type + ", name=" + name + ", poster=" + poster + ", id=" + id + ", cacheTime=" + cacheTime + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(apiName, "apiName")
            Intrinsics.checkNotNullParameter(url, "url")
            Intrinsics.checkNotNullParameter(type, "type")
            Intrinsics.checkNotNullParameter(name, "name")
            this.apiName = apiName
            this.url = url
            this.type = type
            this.name = name
            poster = str
            id = i
            cacheTime = j
        }

        fun getType(): TvType {
            return type
        }
    }

    /* compiled from: VideoDownloadHelper.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JP\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000c\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"],
        m107d2 = ["Lcom/lagradost/cloudstream3/utils/VideoDownloadHelper\$ResumeWatching;", "", "parentId", "", "episodeId", "episode", "season", "updateTime", "", "isFromDownload", "", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;JZ)V", "getEpisode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEpisodeId", "()Z", "getParentId", "()I", "getSeason", "getUpdateTime", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;JZ)Lcom/lagradost/cloudstream3/utils/VideoDownloadHelper\$ResumeWatching;", "equals", "other", "hashCode", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class ResumeWatching(
        @param:JsonProperty("parentId") val parentId: Int,
        @JsonProperty("episodeId") num: Integer,
        @JsonProperty("episode") num2: Integer,
        @JsonProperty("season") num3: Integer,
        @JsonProperty("updateTime") j: Long,
        @JsonProperty("isFromDownload") z: Boolean
    ) {
        private val episode: Integer
        private val episodeId: Integer
        val isFromDownload: Boolean
        private val season: Integer
        val updateTime: Long
        operator fun component1(): Int {
            return parentId
        }

        operator fun component2(): Integer {
            return episodeId
        }

        operator fun component3(): Integer {
            return episode
        }

        operator fun component4(): Integer {
            return season
        }

        operator fun component5(): Long {
            return updateTime
        }

        operator fun component6(): Boolean {
            return isFromDownload
        }

        fun copy(
            @JsonProperty("parentId") i: Int,
            @JsonProperty("episodeId") num: Integer,
            @JsonProperty("episode") num2: Integer,
            @JsonProperty("season") num3: Integer,
            @JsonProperty("updateTime") j: Long,
            @JsonProperty("isFromDownload") z: Boolean
        ): ResumeWatching {
            return ResumeWatching(i, num, num2, num3, j, z)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is ResumeWatching) {
                val resumeWatching = obj as ResumeWatching
                return parentId == resumeWatching.parentId && Intrinsics.areEqual(
                    episodeId, resumeWatching.episodeId
                ) && Intrinsics.areEqual(
                    episode, resumeWatching.episode
                ) && Intrinsics.areEqual(
                    season, resumeWatching.season
                ) && updateTime == resumeWatching.updateTime && isFromDownload == resumeWatching.isFromDownload
            }
            return false
        }

        /* JADX WARN: Multi-variable type inference failed */
        override fun hashCode(): Int {
            val i = parentId * 31
            val num: Integer = episodeId
            val hashCode: Int = (i + if (num == null) 0 else num.hashCode()) * 31
            val num2: Integer = episode
            val hashCode2: Int = (hashCode + if (num2 == null) 0 else num2.hashCode()) * 31
            val num3: Integer = season
            val hashCode3: Int =
                ((hashCode2 + if (num3 != null) num3.hashCode() else 0) * 31 + `C$r8$backportedMethods$utility$Long$1$hashCode`.hashCode(
                    updateTime
                )) * 31
            val z = isFromDownload
            var i2: Int = z.toInt()
            if (z.toInt() != 0) {
                i2 = 1
            }
            return hashCode3 + i2
        }

        override fun toString(): String {
            return "ResumeWatching(parentId=" + parentId + ", episodeId=" + episodeId + ", episode=" + episode + ", season=" + season + ", updateTime=" + updateTime + ", isFromDownload=" + isFromDownload + ')'
        }

        init {
            episodeId = num
            episode = num2
            season = num3
            updateTime = j
            isFromDownload = z
        }

        fun getEpisodeId(): Integer {
            return episodeId
        }

        fun getEpisode(): Integer {
            return episode
        }

        fun getSeason(): Integer {
            return season
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                resumeWatching: ResumeWatching,
                i: Int,
                num: Integer,
                num2: Integer,
                num3: Integer,
                j: Long,
                z: Boolean,
                i2: Int,
                obj: Object?
            ): ResumeWatching {
                var i = i
                var num: Integer = num
                var num2: Integer = num2
                var num3: Integer = num3
                var j = j
                var z = z
                if (i2 and 1 != 0) {
                    i = resumeWatching.parentId
                }
                if (i2 and 2 != 0) {
                    num = resumeWatching.episodeId
                }
                val num4: Integer = num
                if (i2 and 4 != 0) {
                    num2 = resumeWatching.episode
                }
                val num5: Integer = num2
                if (i2 and 8 != 0) {
                    num3 = resumeWatching.season
                }
                val num6: Integer = num3
                if (i2 and 16 != 0) {
                    j = resumeWatching.updateTime
                }
                val j2 = j
                if (i2 and 32 != 0) {
                    z = resumeWatching.isFromDownload
                }
                return resumeWatching.copy(i, num4, num5, num6, j2, z)
            }
        }
    }
}