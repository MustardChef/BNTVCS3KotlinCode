package com.lagradost.cloudstream3.utils

import java.util.List
import kotlin.jvm.internal.Intrinsics

/* compiled from: ExtractorApi.kt */
@Metadata(
    m108d1 = ["\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u000c\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\u000cHÆ\u0003J\u0015\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000eHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jm\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u000c2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020\u000c2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\nHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\u000cX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012¨\u0006+"],
    m107d2 = ["Lcom/lagradost/cloudstream3/utils/ExtractorLinkPlayList;", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "source", "", "name", "playlist", "", "Lcom/lagradost/cloudstream3/utils/PlayListItem;", "referer", "quality", "", "isM3u8", "", "headers", "", "extractorData", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;IZLjava/util/Map;Ljava/lang/String;)V", "getExtractorData", "()Ljava/lang/String;", "getHeaders", "()Ljava/util/Map;", "()Z", "getName", "getPlaylist", "()Ljava/util/List;", "getQuality", "()I", "getReferer", "getSource", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "toString", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class ExtractorLinkPlayList(
    source: String,
    name: String,
    playlist: List<PlayListItem>,
    referer: String,
    i: Int,
    z: Boolean,
    headers: Map<String, String>,
    str: String?
) : ExtractorLink(source, name, "", referer, i, z, headers, str) {
    // com.lagradost.cloudstream3.utils.ExtractorLink
    @get:Override
    override val extractorData: String?

    // com.lagradost.cloudstream3.utils.ExtractorLink, com.lagradost.cloudstream3.utils.VideoDownloadManager.IDownloadableMinimum
    @get:Override
    override val headers: Map<String, String>

    // com.lagradost.cloudstream3.utils.ExtractorLink
    @get:Override
    override val isM3u8: Boolean

    // com.lagradost.cloudstream3.utils.ExtractorLink
    @get:Override
    override val name: String
    val playlist: List<PlayListItem>

    // com.lagradost.cloudstream3.utils.ExtractorLink
    @get:Override
    override val quality: Int

    // com.lagradost.cloudstream3.utils.ExtractorLink, com.lagradost.cloudstream3.utils.VideoDownloadManager.IDownloadableMinimum
    @get:Override
    override val referer: String

    // com.lagradost.cloudstream3.utils.ExtractorLink
    @get:Override
    override val source: String
    operator fun component1(): String {
        return source
    }

    operator fun component2(): String {
        return name
    }

    operator fun component3(): List<PlayListItem> {
        return playlist
    }

    operator fun component4(): String {
        return referer
    }

    operator fun component5(): Int {
        return quality
    }

    operator fun component6(): Boolean {
        return isM3u8
    }

    operator fun component7(): Map<String, String> {
        return headers
    }

    operator fun component8(): String? {
        return extractorData
    }

    fun copy(
        source: String,
        name: String,
        playlist: List<PlayListItem>,
        referer: String,
        i: Int,
        z: Boolean,
        headers: Map<String, String>,
        str: String?
    ): ExtractorLinkPlayList {
        Intrinsics.checkNotNullParameter(source, "source")
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(playlist, "playlist")
        Intrinsics.checkNotNullParameter(referer, "referer")
        Intrinsics.checkNotNullParameter(headers, "headers")
        return ExtractorLinkPlayList(source, name, playlist, referer, i, z, headers, str)
    }

    override fun equals(obj: Object): Boolean {
        if (this === obj) {
            return true
        }
        if (obj is ExtractorLinkPlayList) {
            val extractorLinkPlayList = obj as ExtractorLinkPlayList
            return Intrinsics.areEqual(source, extractorLinkPlayList.source) && Intrinsics.areEqual(
                name, extractorLinkPlayList.name
            ) && Intrinsics.areEqual(
                playlist,
                extractorLinkPlayList.playlist
            ) && Intrinsics.areEqual(
                referer, extractorLinkPlayList.referer
            ) && quality == extractorLinkPlayList.quality && isM3u8 == extractorLinkPlayList.isM3u8 && Intrinsics.areEqual(
                headers, extractorLinkPlayList.headers
            ) && Intrinsics.areEqual(
                extractorData, extractorLinkPlayList.extractorData
            )
        }
        return false
    }

    override fun hashCode(): Int {
        val hashCode =
            ((((source.hashCode() * 31 + name.hashCode()) * 31 + playlist.hashCode()) * 31 + referer.hashCode()) * 31 + quality) * 31
        val isM3u8 = isM3u8
        var i: Int = isM3u8.toInt()
        if (isM3u8) {
            i = 1
        }
        return ((hashCode + i) * 31 + headers.hashCode()) * 31 + if (extractorData == null) 0 else extractorData!!.hashCode()
    }

    @Override // com.lagradost.cloudstream3.utils.ExtractorLink
    override fun toString(): String {
        return "ExtractorLinkPlayList(source=" + source + ", name=" + name + ", playlist=" + playlist + ", referer=" + referer + ", quality=" + quality + ", isM3u8=" + isM3u8 + ", headers=" + headers + ", extractorData=" + extractorData + ')'
    }

    /* synthetic */   constructor(
        str: String,
        str2: String,
        list: List,
        str3: String,
        i: Int,
        z: Boolean,
        map: Map?,
        str4: String?,
        i2: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(
        str,
        str2,
        list,
        str3,
        i,
        if (i2 and 32 != 0) false else z,
        if (i2 and 64 != 0) MapsKt.emptyMap<Any, Any>() else map,
        if (i2 and 128 != 0) null else str4
    ) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        Intrinsics.checkNotNullParameter(source, "source")
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(playlist, "playlist")
        Intrinsics.checkNotNullParameter(referer, "referer")
        Intrinsics.checkNotNullParameter(headers, "headers")
        this.source = source
        this.name = name
        this.playlist = playlist
        this.referer = referer
        this.quality = i
        this.isM3u8 = z
        this.headers = headers
        this.extractorData = str
    }
}