package com.lagradost.cloudstream3.movieproviders

import java.util.List
import kotlin.jvm.internal.Intrinsics

/* compiled from: StreamingcommunityProvider.kt */
@Metadata(
    m108d1 = ["\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0001\u0010\u000c\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003Js\u0010%\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u000e\b\u0003\u0010\u000c\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u000c\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006,"],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/Season;", "", "id", "", "name", "", "plot", "date", "number", "title_id", "createdAt", "updatedAt", "episodes", "", "Lcom/lagradost/cloudstream3/movieproviders/Episodejson;", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCreatedAt", "()Ljava/lang/String;", "getDate", "getEpisodes", "()Ljava/util/List;", "getId", "()J", "getName", "getNumber", "getPlot", "getTitle_id", "getUpdatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class Season(
    @JsonProperty("id") j: Long,
    @JsonProperty("name") str: String,
    @JsonProperty("plot") str2: String,
    @JsonProperty("date") str3: String,
    @JsonProperty("number") j2: Long,
    @JsonProperty("title_id") j3: Long,
    @JsonProperty("createdAt") str4: String,
    @JsonProperty("updated_at") str5: String,
    @JsonProperty("episodes") episodes: List<Episodejson>
) {
    val createdAt: String
    val date: String
    val episodes: List<Episodejson>

    /* renamed from: id */
    val id: Long
    val name: String
    val number: Long
    val plot: String
    val title_id: Long
    val updatedAt: String
    operator fun component1(): Long {
        return id
    }

    operator fun component2(): String {
        return name
    }

    operator fun component3(): String {
        return plot
    }

    operator fun component4(): String {
        return date
    }

    operator fun component5(): Long {
        return number
    }

    operator fun component6(): Long {
        return title_id
    }

    operator fun component7(): String {
        return createdAt
    }

    operator fun component8(): String {
        return updatedAt
    }

    operator fun component9(): List<Episodejson> {
        return episodes
    }

    fun copy(
        @JsonProperty("id") j: Long,
        @JsonProperty("name") str: String,
        @JsonProperty("plot") str2: String,
        @JsonProperty("date") str3: String,
        @JsonProperty("number") j2: Long,
        @JsonProperty("title_id") j3: Long,
        @JsonProperty("createdAt") str4: String,
        @JsonProperty("updated_at") str5: String,
        @JsonProperty("episodes") episodes: List<Episodejson>
    ): Season {
        Intrinsics.checkNotNullParameter(episodes, "episodes")
        return Season(j, str, str2, str3, j2, j3, str4, str5, episodes)
    }

    override fun equals(obj: Object): Boolean {
        if (this === obj) {
            return true
        }
        if (obj is Season) {
            val season = obj as Season
            return id == season.id && Intrinsics.areEqual(name, season.name) && Intrinsics.areEqual(
                plot, season.plot
            ) && Intrinsics.areEqual(
                date,
                season.date
            ) && number == season.number && title_id == season.title_id && Intrinsics.areEqual(
                createdAt, season.createdAt
            ) && Intrinsics.areEqual(updatedAt, season.updatedAt) && Intrinsics.areEqual(
                episodes, season.episodes
            )
        }
        return false
    }

    override fun hashCode(): Int {
        val hashCode: Int = `C$r8$backportedMethods$utility$Long$1$hashCode`.hashCode(id) * 31
        val str = name
        val hashCode2 = (hashCode + (str?.hashCode() ?: 0)) * 31
        val str2 = plot
        val hashCode3 = (hashCode2 + (str2?.hashCode() ?: 0)) * 31
        val str3 = date
        val hashCode4: Int = (((hashCode3 + (str3?.hashCode()
            ?: 0)) * 31 + `C$r8$backportedMethods$utility$Long$1$hashCode`.hashCode(
            number
        )) * 31 + `C$r8$backportedMethods$utility$Long$1$hashCode`.hashCode(title_id)) * 31
        val str4 = createdAt
        val hashCode5 = (hashCode4 + (str4?.hashCode() ?: 0)) * 31
        val str5 = updatedAt
        return (hashCode5 + (str5?.hashCode() ?: 0)) * 31 + episodes.hashCode()
    }

    override fun toString(): String {
        return "Season(id=" + id + ", name=" + name + ", plot=" + plot + ", date=" + date + ", number=" + number + ", title_id=" + title_id + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", episodes=" + episodes + ')'
    }

    init {
        Intrinsics.checkNotNullParameter(episodes, "episodes")
        id = j
        name = str
        plot = str2
        date = str3
        number = j2
        title_id = j3
        createdAt = str4
        updatedAt = str5
        this.episodes = episodes
    }

    /* synthetic */   constructor(
        j: Long,
        str: String?,
        str2: String?,
        str3: String?,
        j2: Long,
        j3: Long,
        str4: String?,
        str5: String?,
        list: List,
        i: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(
        j,
        (if (i and 2 != 0) "" else str)!!,
        (if (i and 4 != 0) "" else str2)!!,
        (if (i and 8 != 0) "" else str3)!!,
        j2,
        j3,
        (if (i and 64 != 0) "" else str4)!!,
        (if (i and 128 != 0) "" else str5)!!,
        list
    ) {
    }
}