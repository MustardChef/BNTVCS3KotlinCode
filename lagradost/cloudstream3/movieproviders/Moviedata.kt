package com.lagradost.cloudstream3.movieproviders

import java.util.List
import kotlin.jvm.internal.Intrinsics

/* compiled from: StreamingcommunityProvider.kt */
@Metadata(
    m108d1 = ["\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0001\u0010\u000c\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\nHÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018Jn\u0010%\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0003\u0010\u000c\u001a\b\u0012\u0004\u0012\u00020\r0\n2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0005HÖ\u0001R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0017\u0010\u000c\u001a\b\u0012\u0004\u0012\u00020\r0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u0006-"],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/Moviedata;", "", "id", "", "name", "", "type", "releaseDate", "seasonsCount", "genres", "", "Lcom/lagradost/cloudstream3/movieproviders/Genre;", "votes", "Lcom/lagradost/cloudstream3/movieproviders/Vote;", "runtime", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;)V", "getGenres", "()Ljava/util/List;", "getId", "()J", "getName", "()Ljava/lang/String;", "getReleaseDate", "getRuntime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSeasonsCount", "getType", "getVotes", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;)Lcom/lagradost/cloudstream3/movieproviders/Moviedata;", "equals", "", "other", "hashCode", "", "toString", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class Moviedata(
    @JsonProperty("id") j: Long,
    @JsonProperty("name") name: String,
    @JsonProperty("type") type: String,
    @JsonProperty("release_date") releaseDate: String,
    @JsonProperty("seasons_count") l: Long?,
    @JsonProperty("genres") genres: List<Genre>,
    @JsonProperty("votes") votes: List<Vote>,
    @JsonProperty("runtime") l2: Long?
) {
    val genres: List<Genre>

    /* renamed from: id */
    val id: Long
    val name: String
    val releaseDate: String
    val runtime: Long?
    val seasonsCount: Long?
    val type: String
    val votes: List<Vote>
    operator fun component1(): Long {
        return id
    }

    operator fun component2(): String {
        return name
    }

    operator fun component3(): String {
        return type
    }

    operator fun component4(): String {
        return releaseDate
    }

    operator fun component5(): Long? {
        return seasonsCount
    }

    operator fun component6(): List<Genre> {
        return genres
    }

    operator fun component7(): List<Vote> {
        return votes
    }

    operator fun component8(): Long? {
        return runtime
    }

    fun copy(
        @JsonProperty("id") j: Long,
        @JsonProperty("name") name: String,
        @JsonProperty("type") type: String,
        @JsonProperty("release_date") releaseDate: String,
        @JsonProperty("seasons_count") l: Long?,
        @JsonProperty("genres") genres: List<Genre>,
        @JsonProperty("votes") votes: List<Vote>,
        @JsonProperty("runtime") l2: Long?
    ): Moviedata {
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(type, "type")
        Intrinsics.checkNotNullParameter(releaseDate, "releaseDate")
        Intrinsics.checkNotNullParameter(genres, "genres")
        Intrinsics.checkNotNullParameter(votes, "votes")
        return Moviedata(j, name, type, releaseDate, l, genres, votes, l2)
    }

    override fun equals(obj: Object): Boolean {
        if (this === obj) {
            return true
        }
        if (obj is Moviedata) {
            val moviedata = obj as Moviedata
            return id == moviedata.id && Intrinsics.areEqual(
                name,
                moviedata.name
            ) && Intrinsics.areEqual(
                type, moviedata.type
            ) && Intrinsics.areEqual(releaseDate, moviedata.releaseDate) && Intrinsics.areEqual(
                seasonsCount, moviedata.seasonsCount
            ) && Intrinsics.areEqual(
                genres, moviedata.genres
            ) && Intrinsics.areEqual(votes, moviedata.votes) && Intrinsics.areEqual(
                runtime, moviedata.runtime
            )
        }
        return false
    }

    override fun hashCode(): Int {
        val hashCode: Int = (((`C$r8$backportedMethods$utility$Long$1$hashCode`.hashCode(
            id
        ) * 31 + name.hashCode()) * 31 + type.hashCode()) * 31 + releaseDate.hashCode()) * 31
        val l = seasonsCount
        val hashCode2 = (((hashCode + (l?.hashCode()
            ?: 0)) * 31 + genres.hashCode()) * 31 + votes.hashCode()) * 31
        val l2 = runtime
        return hashCode2 + (l2?.hashCode() ?: 0)
    }

    override fun toString(): String {
        return "Moviedata(id=" + id + ", name=" + name + ", type=" + type + ", releaseDate=" + releaseDate + ", seasonsCount=" + seasonsCount + ", genres=" + genres + ", votes=" + votes + ", runtime=" + runtime + ')'
    }

    init {
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(type, "type")
        Intrinsics.checkNotNullParameter(releaseDate, "releaseDate")
        Intrinsics.checkNotNullParameter(genres, "genres")
        Intrinsics.checkNotNullParameter(votes, "votes")
        id = j
        this.name = name
        this.type = type
        this.releaseDate = releaseDate
        seasonsCount = l
        this.genres = genres
        this.votes = votes
        runtime = l2
    }

    /* synthetic */   constructor(
        j: Long,
        str: String,
        str2: String,
        str3: String,
        l: Long?,
        list: List,
        list2: List,
        l2: Long?,
        i: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(
        j,
        str,
        str2,
        str3,
        if (i and 16 != 0) null else l,
        list,
        list2,
        if (i and 128 != 0) null else l2
    ) {
    }
}