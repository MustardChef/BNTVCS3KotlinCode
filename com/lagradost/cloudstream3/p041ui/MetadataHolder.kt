package com.lagradost.cloudstream3.p041ui

import java.util.List
import kotlin.jvm.internal.Intrinsics

/* compiled from: ControllerActivity.kt */
@Metadata(
    m108d1 = ["\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000c0\u000b\u0012\u000c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\u000c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b¢\u0006\u0002\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000c0\u000bHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bHÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bHÆ\u0003Jo\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000c0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bHÆ\u0001J\u0013\u0010&\u001a\u00020\u00052\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\tHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000c0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013¨\u0006*"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/MetadataHolder;", "", "apiName", "", "isMovie", "", "title", "poster", "currentEpisodeIndex", "", "episodes", "", "Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;", "currentLinks", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "currentSubtitles", "Lcom/lagradost/cloudstream3/ui/player/SubtitleData;", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/util/List;)V", "getApiName", "()Ljava/lang/String;", "getCurrentEpisodeIndex", "()I", "getCurrentLinks", "()Ljava/util/List;", "getCurrentSubtitles", "getEpisodes", "()Z", "getPoster", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.MetadataHolder */ /* loaded from: classes.dex */
class MetadataHolder constructor(
    apiName: String,
    z: Boolean,
    str: String,
    str2: String,
    i: Int,
    episodes: List<ResultEpisode>,
    currentLinks: List<ExtractorLink>,
    currentSubtitles: List<SubtitleData>
) {
    val apiName: String
    val currentEpisodeIndex: Int
    private val currentLinks: List<ExtractorLink>
    val currentSubtitles: List<SubtitleData>
    private val episodes: List<ResultEpisode>
    val isMovie: Boolean
    val poster: String
    val title: String
    operator fun component1(): String {
        return apiName
    }

    operator fun component2(): Boolean {
        return isMovie
    }

    operator fun component3(): String {
        return title
    }

    operator fun component4(): String {
        return poster
    }

    operator fun component5(): Int {
        return currentEpisodeIndex
    }

    operator fun component6(): List<ResultEpisode> {
        return episodes
    }

    operator fun component7(): List<ExtractorLink> {
        return currentLinks
    }

    operator fun component8(): List<SubtitleData> {
        return currentSubtitles
    }

    fun copy(
        apiName: String,
        z: Boolean,
        str: String,
        str2: String,
        i: Int,
        episodes: List<ResultEpisode>,
        currentLinks: List<ExtractorLink>,
        currentSubtitles: List<SubtitleData>
    ): MetadataHolder {
        Intrinsics.checkNotNullParameter(apiName, "apiName")
        Intrinsics.checkNotNullParameter(episodes, "episodes")
        Intrinsics.checkNotNullParameter(currentLinks, "currentLinks")
        Intrinsics.checkNotNullParameter(currentSubtitles, "currentSubtitles")
        return MetadataHolder(apiName, z, str, str2, i, episodes, currentLinks, currentSubtitles)
    }

    override fun equals(obj: Object): Boolean {
        if (this === obj) {
            return true
        }
        if (obj is MetadataHolder) {
            val metadataHolder: MetadataHolder = obj
            return Intrinsics.areEqual(
                apiName,
                metadataHolder.apiName
            ) && (isMovie == metadataHolder.isMovie) && Intrinsics.areEqual(
                title, metadataHolder.title
            ) && Intrinsics.areEqual(
                poster,
                metadataHolder.poster
            ) && (currentEpisodeIndex == metadataHolder.currentEpisodeIndex) && Intrinsics.areEqual(
                episodes, metadataHolder.episodes
            ) && Intrinsics.areEqual(
                currentLinks, metadataHolder.currentLinks
            ) && Intrinsics.areEqual(
                currentSubtitles, metadataHolder.currentSubtitles
            )
        }
        return false
    }

    /* JADX WARN: Multi-variable type inference failed */
    override fun hashCode(): Int {
        val hashCode: Int = apiName.hashCode() * 31
        val z: Boolean = isMovie
        var i: Int = z.toInt()
        if (z.toInt() != 0) {
            i = 1
        }
        val i2: Int = (hashCode + i) * 31
        val str: String? = title
        val hashCode2: Int = (i2 + (if (str == null) 0 else str.hashCode())) * 31
        val str2: String? = poster
        return ((((((((hashCode2 + (if (str2 != null) str2.hashCode() else 0)) * 31) + currentEpisodeIndex) * 31) + episodes.hashCode()) * 31) + currentLinks.hashCode()) * 31) + currentSubtitles.hashCode()
    }

    override fun toString(): String {
        return "MetadataHolder(apiName=" + apiName + ", isMovie=" + isMovie + ", title=" + title + ", poster=" + poster + ", currentEpisodeIndex=" + currentEpisodeIndex + ", episodes=" + episodes + ", currentLinks=" + currentLinks + ", currentSubtitles=" + currentSubtitles + ')'
    }

    /* JADX WARN: Multi-variable type inference failed */
    init {
        Intrinsics.checkNotNullParameter(apiName, "apiName")
        Intrinsics.checkNotNullParameter(episodes, "episodes")
        Intrinsics.checkNotNullParameter(currentLinks, "currentLinks")
        Intrinsics.checkNotNullParameter(currentSubtitles, "currentSubtitles")
        this.apiName = apiName
        isMovie = z
        title = str
        poster = str2
        currentEpisodeIndex = i
        this.episodes = episodes
        this.currentLinks = currentLinks
        this.currentSubtitles = currentSubtitles
    }

    fun getEpisodes(): List<ResultEpisode> {
        return episodes
    }

    fun getCurrentLinks(): List<ExtractorLink> {
        return currentLinks
    }

    fun getCurrentSubtitles(): List<SubtitleData> {
        return currentSubtitles
    }
}