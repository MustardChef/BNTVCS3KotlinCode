package com.lagradost.cloudstream3.movieproviders

import java.util.List
import kotlin.jvm.internal.Intrinsics

/* compiled from: StreamingcommunityProvider.kt */
@Metadata(
    m108d1 = ["\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\u000cJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\b\u001a\u00020\u00032\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006#"],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/Episodejson;", "", "id", "", "number", "name", "", "plot", "seasonID", "images", "", "Lcom/lagradost/cloudstream3/movieproviders/ImageSeason;", "(JJLjava/lang/String;Ljava/lang/String;JLjava/util/List;)V", "getId", "()J", "getImages", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", "getNumber", "getPlot", "getSeasonID", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class Episodejson(
    @JsonProperty("id") j: Long,
    @JsonProperty("number") j2: Long,
    @JsonProperty("name") str: String,
    @JsonProperty("plot") str2: String,
    @JsonProperty("season_id") j3: Long,
    @JsonProperty("images") images: List<ImageSeason>
) {
    /* renamed from: id */
    val id: Long
    val images: List<ImageSeason>
    val name: String
    val number: Long
    val plot: String
    val seasonID: Long
    operator fun component1(): Long {
        return id
    }

    operator fun component2(): Long {
        return number
    }

    operator fun component3(): String {
        return name
    }

    operator fun component4(): String {
        return plot
    }

    operator fun component5(): Long {
        return seasonID
    }

    operator fun component6(): List<ImageSeason> {
        return images
    }

    fun copy(
        @JsonProperty("id") j: Long,
        @JsonProperty("number") j2: Long,
        @JsonProperty("name") str: String,
        @JsonProperty("plot") str2: String,
        @JsonProperty("season_id") j3: Long,
        @JsonProperty("images") images: List<ImageSeason>
    ): Episodejson {
        Intrinsics.checkNotNullParameter(images, "images")
        return Episodejson(j, j2, str, str2, j3, images)
    }

    override fun equals(obj: Object): Boolean {
        if (this === obj) {
            return true
        }
        if (obj is Episodejson) {
            val episodejson = obj as Episodejson
            return id == episodejson.id && number == episodejson.number && Intrinsics.areEqual(
                name, episodejson.name
            ) && Intrinsics.areEqual(
                plot,
                episodejson.plot
            ) && seasonID == episodejson.seasonID && Intrinsics.areEqual(
                images, episodejson.images
            )
        }
        return false
    }

    override fun hashCode(): Int {
        val hashCode: Int =
            (`C$r8$backportedMethods$utility$Long$1$hashCode`.hashCode(id) * 31 + `C$r8$backportedMethods$utility$Long$1$hashCode`.hashCode(
                number
            )) * 31
        val str = name
        val hashCode2 = (hashCode + (str?.hashCode() ?: 0)) * 31
        val str2 = plot
        return ((hashCode2 + (str2?.hashCode()
            ?: 0)) * 31 + `C$r8$backportedMethods$utility$Long$1$hashCode`.hashCode(
            seasonID
        )) * 31 + images.hashCode()
    }

    override fun toString(): String {
        return "Episodejson(id=" + id + ", number=" + number + ", name=" + name + ", plot=" + plot + ", seasonID=" + seasonID + ", images=" + images + ')'
    }

    init {
        Intrinsics.checkNotNullParameter(images, "images")
        id = j
        number = j2
        name = str
        plot = str2
        seasonID = j3
        this.images = images
    }

    /* synthetic */   constructor(
        j: Long,
        j2: Long,
        str: String?,
        str2: String?,
        j3: Long,
        list: List,
        i: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(
        j,
        j2,
        (if (i and 4 != 0) "" else str)!!,
        (if (i and 8 != 0) "" else str2)!!,
        j3,
        list
    ) {
    }
}