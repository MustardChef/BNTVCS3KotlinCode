package com.lagradost.cloudstream3

import androidx.exifinterface.media.ExifInterface
import kotlin.coroutines.jvm.internal.DebugMetadata
import com.lagradost.cloudstream3.``ParCollectionsKt$apmapIndexed$1$1$1`
import kotlin.jvm.internal.Intrinsics

/* compiled from: MainAPI.kt */
@Metadata(
    m108d1 = ["\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c¢\u0006\u0002\u0010\rJ\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u000cHÆ\u0003¢\u0006\u0002\u0010\u0013Jl\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000cHÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0006HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\"\u0010\u001a\"\u0004\b#\u0010\u001cR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001c¨\u00065"],
    m107d2 = ["Lcom/lagradost/cloudstream3/Episode;", "", "data", "", "name", "season", "", "episode", "posterUrl", "rating", "description", "date", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;)V", "getData", "()Ljava/lang/String;", "setData", "(Ljava/lang/String;)V", "getDate", "()Ljava/lang/Long;", "setDate", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getDescription", "setDescription", "getEpisode", "()Ljava/lang/Integer;", "setEpisode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getName", "setName", "getPosterUrl", "setPosterUrl", "getRating", "setRating", "getSeason", "setSeason", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;)Lcom/lagradost/cloudstream3/Episode;", "equals", "", "other", "hashCode", "toString", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class Episode(
    data: String,
    str: String?,
    num: Integer?,
    num2: Integer?,
    str2: String?,
    num3: Integer?,
    str3: String?,
    l: Long?
) {
    private var data: String
    var date: Long?
    var description: String?
    private var episode: Integer?
    var name: String?
    var posterUrl: String?
    private var rating: Integer?
    private var season: Integer?
    operator fun component1(): String {
        return data
    }

    operator fun component2(): String? {
        return name
    }

    operator fun component3(): Integer? {
        return season
    }

    operator fun component4(): Integer? {
        return episode
    }

    operator fun component5(): String? {
        return posterUrl
    }

    operator fun component6(): Integer? {
        return rating
    }

    operator fun component7(): String? {
        return description
    }

    operator fun component8(): Long? {
        return date
    }

    fun copy(
        data: String,
        str: String?,
        num: Integer?,
        num2: Integer?,
        str2: String?,
        num3: Integer?,
        str3: String?,
        l: Long?
    ): Episode {
        Intrinsics.checkNotNullParameter(data, "data")
        return Episode(data, str, num, num2, str2, num3, str3, l)
    }

    override fun equals(obj: Object): Boolean {
        if (this === obj) {
            return true
        }
        if (obj is Episode) {
            val episode = obj as Episode
            return Intrinsics.areEqual(data, episode.data) && Intrinsics.areEqual(
                name, episode.name
            ) && Intrinsics.areEqual(season, episode.season) && Intrinsics.areEqual(
                this.episode,
                episode.episode
            ) && Intrinsics.areEqual(
                posterUrl, episode.posterUrl
            ) && Intrinsics.areEqual(rating, episode.rating) && Intrinsics.areEqual(
                description, episode.description
            ) && Intrinsics.areEqual(date, episode.date)
        }
        return false
    }

    override fun hashCode(): Int {
        val hashCode = data.hashCode() * 31
        val str = name
        val hashCode2 = (hashCode + (str?.hashCode() ?: 0)) * 31
        val num: Integer? = season
        val hashCode3: Int = (hashCode2 + if (num == null) 0 else num.hashCode()) * 31
        val num2: Integer? = episode
        val hashCode4: Int = (hashCode3 + if (num2 == null) 0 else num2.hashCode()) * 31
        val str2 = posterUrl
        val hashCode5 = (hashCode4 + (str2?.hashCode() ?: 0)) * 31
        val num3: Integer? = rating
        val hashCode6: Int = (hashCode5 + if (num3 == null) 0 else num3.hashCode()) * 31
        val str3 = description
        val hashCode7 = (hashCode6 + (str3?.hashCode() ?: 0)) * 31
        val l = date
        return hashCode7 + (l?.hashCode() ?: 0)
    }

    override fun toString(): String {
        return "Episode(data=" + data + ", name=" + name + ", season=" + season + ", episode=" + episode + ", posterUrl=" + posterUrl + ", rating=" + rating + ", description=" + description + ", date=" + date + ')'
    }

    init {
        Intrinsics.checkNotNullParameter(data, "data")
        this.data = data
        name = str
        season = num
        episode = num2
        posterUrl = str2
        rating = num3
        description = str3
        date = l
    }

    /* synthetic */   constructor(
        str: String,
        str2: String?,
        num: Integer?,
        num2: Integer?,
        str3: String?,
        num3: Integer?,
        str4: String?,
        l: Long?,
        i: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(
        str,
        if (i and 2 != 0) null else str2,
        if (i and 4 != 0) null else num,
        if (i and 8 != 0) null else num2,
        if (i and 16 != 0) null else str3,
        if (i and 32 != 0) null else num3,
        if (i and 64 != 0) null else str4,
        if (i and 128 == 0) l else null
    ) {
    }

    fun getData(): String {
        return data
    }

    fun setData(str: String) {
        Intrinsics.checkNotNullParameter(str, "<set-?>")
        data = str
    }

    fun getSeason(): Integer? {
        return season
    }

    fun setSeason(num: Integer?) {
        season = num
    }

    fun getEpisode(): Integer? {
        return episode
    }

    fun setEpisode(num: Integer?) {
        episode = num
    }

    fun getRating(): Integer? {
        return rating
    }

    fun setRating(num: Integer?) {
        rating = num
    }
}