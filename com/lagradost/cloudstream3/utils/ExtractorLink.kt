package com.lagradost.cloudstream3.utils

import java.util.Map
import kotlin.jvm.internal.Intrinsics

/* compiled from: ExtractorApi.kt */
@Metadata(
    m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u000f\b\u0016\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000c\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\b\u0010\u001a\u001a\u00020\u0003H\u0016R\u0016\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000cX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001b"],
    m107d2 = ["Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$IDownloadableMinimum;", "source", "", "name", "url", "referer", "quality", "", "isM3u8", "", "headers", "", "extractorData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Map;Ljava/lang/String;)V", "getExtractorData", "()Ljava/lang/String;", "getHeaders", "()Ljava/util/Map;", "()Z", "getName", "getQuality", "()I", "getReferer", "getSource", "getUrl", "toString", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes4.dex */
open class ExtractorLink(
    source: String,
    name: String,
    url: String,
    referer: String,
    i: Int,
    z: Boolean,
    headers: Map<String, String>,
    str: String?
) : IDownloadableMinimum {
    open val extractorData: String?

    // com.lagradost.cloudstream3.utils.VideoDownloadManager.IDownloadableMinimum
    @get:Override
    val headers: Map<String, String>
    open val isM3u8: Boolean
    open val name: String
    open val quality: Int

    // com.lagradost.cloudstream3.utils.VideoDownloadManager.IDownloadableMinimum
    @get:Override
    val referer: String
    open val source: String

    // com.lagradost.cloudstream3.utils.VideoDownloadManager.IDownloadableMinimum
    @get:Override
    val url: String

    init {
        Intrinsics.checkNotNullParameter(source, "source")
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(url, "url")
        Intrinsics.checkNotNullParameter(referer, "referer")
        Intrinsics.checkNotNullParameter(headers, "headers")
        this.source = source
        this.name = name
        this.url = url
        this.referer = referer
        quality = i
        isM3u8 = z
        this.headers = headers
        extractorData = str
    }

    /* synthetic */   constructor(
        str: String,
        str2: String,
        str3: String,
        str4: String,
        i: Int,
        z: Boolean,
        map: Map?,
        str5: String?,
        i2: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(
        str,
        str2,
        str3,
        str4,
        i,
        if (i2 and 32 != 0) false else z,
        if (i2 and 64 != 0) MapsKt.emptyMap<Any, Any>() else map,
        if (i2 and 128 != 0) null else str5
    ) {
    }

    override fun toString(): String {
        return "ExtractorLink(name=$name, url=$url, referer=$referer, isM3u8=$isM3u8)"
    }
}