package com.lagradost.cloudstream3.utils

import android.net.Uri
import kotlin.jvm.internal.Intrinsics

/* compiled from: ExtractorApi.kt */
@Metadata(
    m108d1 = ["\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000c\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0016J\u008e\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000c\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\nHÖ\u0001J\t\u00103\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0015\u0010\u000c\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0015\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001d\u0010\u0016R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00064"],
    m107d2 = ["Lcom/lagradost/cloudstream3/utils/ExtractorUri;", "", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "name", "", "basePath", "relativePath", "displayName", "id", "", "parentId", "episode", "season", "headerName", "tvType", "Lcom/lagradost/cloudstream3/TvType;", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;)V", "getBasePath", "()Ljava/lang/String;", "getDisplayName", "getEpisode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeaderName", "getId", "getName", "getParentId", "getRelativePath", "getSeason", "getTvType", "()Lcom/lagradost/cloudstream3/TvType;", "getUri", "()Landroid/net/Uri;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;)Lcom/lagradost/cloudstream3/utils/ExtractorUri;", "equals", "", "other", "hashCode", "toString", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class ExtractorUri(
    uri: Uri,
    name: String,
    str: String?,
    str2: String?,
    str3: String?,
    num: Integer?,
    num2: Integer?,
    num3: Integer?,
    num4: Integer?,
    str4: String?,
    tvType: TvType?
) {
    val basePath: String?
    val displayName: String?
    private val episode: Integer?
    val headerName: String?

    /* renamed from: id */
    private val f10026id: Integer?
    val name: String
    private val parentId: Integer?
    val relativePath: String?
    private val season: Integer?
    private val tvType: TvType?
    private val uri: Uri
    operator fun component1(): Uri {
        return uri
    }

    operator fun component10(): String? {
        return headerName
    }

    operator fun component11(): TvType? {
        return tvType
    }

    operator fun component2(): String {
        return name
    }

    operator fun component3(): String? {
        return basePath
    }

    operator fun component4(): String? {
        return relativePath
    }

    operator fun component5(): String? {
        return displayName
    }

    operator fun component6(): Integer? {
        return f10026id
    }

    operator fun component7(): Integer? {
        return parentId
    }

    operator fun component8(): Integer? {
        return episode
    }

    operator fun component9(): Integer? {
        return season
    }

    fun copy(
        uri: Uri,
        name: String,
        str: String?,
        str2: String?,
        str3: String?,
        num: Integer?,
        num2: Integer?,
        num3: Integer?,
        num4: Integer?,
        str4: String?,
        tvType: TvType?
    ): ExtractorUri {
        Intrinsics.checkNotNullParameter(uri, "uri")
        Intrinsics.checkNotNullParameter(name, "name")
        return ExtractorUri(uri, name, str, str2, str3, num, num2, num3, num4, str4, tvType)
    }

    override fun equals(obj: Object): Boolean {
        if (this === obj) {
            return true
        }
        if (obj is ExtractorUri) {
            val extractorUri = obj as ExtractorUri
            return Intrinsics.areEqual(uri, extractorUri.uri) && Intrinsics.areEqual(
                name, extractorUri.name
            ) && Intrinsics.areEqual(basePath, extractorUri.basePath) && Intrinsics.areEqual(
                relativePath, extractorUri.relativePath
            ) && Intrinsics.areEqual(
                displayName, extractorUri.displayName
            ) && Intrinsics.areEqual(
                f10026id, extractorUri.f10026id
            ) && Intrinsics.areEqual(parentId, extractorUri.parentId) && Intrinsics.areEqual(
                episode, extractorUri.episode
            ) && Intrinsics.areEqual(season, extractorUri.season) && Intrinsics.areEqual(
                headerName, extractorUri.headerName
            ) && tvType === extractorUri.tvType
        }
        return false
    }

    override fun hashCode(): Int {
        val hashCode: Int = (uri.hashCode() * 31 + name.hashCode()) * 31
        val str = basePath
        val hashCode2 = (hashCode + (str?.hashCode() ?: 0)) * 31
        val str2 = relativePath
        val hashCode3 = (hashCode2 + (str2?.hashCode() ?: 0)) * 31
        val str3 = displayName
        val hashCode4 = (hashCode3 + (str3?.hashCode() ?: 0)) * 31
        val num: Integer? = f10026id
        val hashCode5: Int = (hashCode4 + if (num == null) 0 else num.hashCode()) * 31
        val num2: Integer? = parentId
        val hashCode6: Int = (hashCode5 + if (num2 == null) 0 else num2.hashCode()) * 31
        val num3: Integer? = episode
        val hashCode7: Int = (hashCode6 + if (num3 == null) 0 else num3.hashCode()) * 31
        val num4: Integer? = season
        val hashCode8: Int = (hashCode7 + if (num4 == null) 0 else num4.hashCode()) * 31
        val str4 = headerName
        val hashCode9 = (hashCode8 + (str4?.hashCode() ?: 0)) * 31
        val tvType: TvType? = tvType
        return hashCode9 + if (tvType != null) tvType.hashCode() else 0
    }

    override fun toString(): String {
        return "ExtractorUri(uri=" + uri + ", name=" + name + ", basePath=" + basePath + ", relativePath=" + relativePath + ", displayName=" + displayName + ", id=" + f10026id + ", parentId=" + parentId + ", episode=" + episode + ", season=" + season + ", headerName=" + headerName + ", tvType=" + tvType + ')'
    }

    init {
        Intrinsics.checkNotNullParameter(uri, "uri")
        Intrinsics.checkNotNullParameter(name, "name")
        this.uri = uri
        this.name = name
        basePath = str
        relativePath = str2
        displayName = str3
        f10026id = num
        parentId = num2
        episode = num3
        season = num4
        headerName = str4
        this.tvType = tvType
    }

    /* synthetic */   constructor(
        uri: Uri,
        str: String,
        str2: String?,
        str3: String?,
        str4: String?,
        num: Integer?,
        num2: Integer?,
        num3: Integer?,
        num4: Integer?,
        str5: String?,
        tvType: TvType?,
        i: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(
        uri,
        str,
        if (i and 4 != 0) null else str2,
        if (i and 8 != 0) null else str3,
        if (i and 16 != 0) null else str4,
        if (i and 32 != 0) null else num,
        if (i and 64 != 0) null else num2,
        if (i and 128 != 0) null else num3,
        if (i and 256 != 0) null else num4,
        if (i and 512 != 0) null else str5,
        if (i and 1024 != 0) null else tvType
    ) {
    }

    fun getUri(): Uri {
        return uri
    }

    val id: Integer?
        get() = f10026id

    fun getParentId(): Integer? {
        return parentId
    }

    fun getEpisode(): Integer? {
        return episode
    }

    fun getSeason(): Integer? {
        return season
    }

    fun getTvType(): TvType? {
        return tvType
    }
}