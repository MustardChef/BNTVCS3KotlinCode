package com.lagradost.cloudstream3.extractors

import com.lagradost.cloudstream3.utils.ExtractorApiKt.loadExtractor
import com.lagradost.cloudstream3.ParCollections.argamap
import com.lagradost.cloudstream3.utils.M3u8Helper.Companion.Companion.`generateM3u8$default`
import com.lagradost.cloudstream3.utils.ExtractorApi.Companion.`getSafeUrl$default`
import com.lagradost.cloudstream3.MainActivityKt.getApp
import com.lagradost.cloudstream3.utils.ExtractorApiKt.getQualityFromName
import com.lagradost.cloudstream3.utils.ExtractorApiKt.extractorApis
import com.lagradost.cloudstream3.utils.ExtractorApi.requiresReferer
import com.lagradost.cloudstream3.utils.ExtractorApi.mainUrl
import com.lagradost.cloudstream3.utils.ExtractorApi.getSafeUrl
import com.lagradost.cloudstream3.extractors.helper.WcoHelper
import com.lagradost.cloudstream3.extractors.helper.WcoHelper.Companion.ExternalKeys
import com.lagradost.cloudstream3.extractors.helper.WcoHelper.Companion.NewExternalKeys
import kotlin.jvm.internal.DefaultConstructorMarker
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.jvm.JvmOverloads
import com.lagradost.cloudstream3.extractors.helper.AsianEmbedHelper
import com.lagradost.cloudstream3.SubtitleFile
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.extractors.helper.VstreamhubHelper
import kotlin.coroutines.jvm.internal.DebugMetadata
import com.lagradost.cloudstream3.extractors.helper.``WcoHelper$Companion$getKeys$1`
import kotlin.jvm.internal.Intrinsics

/* compiled from: OkRuExtractor.kt */
@Metadata(
    m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\u000c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"],
    m107d2 = ["Lcom/lagradost/cloudstream3/extractors/Flashvars;", "", TtmlNode.TAG_METADATA, "", "hlsManifestUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "getHlsManifestUrl", "()Ljava/lang/String;", "setHlsManifestUrl", "(Ljava/lang/String;)V", "getMetadata", "setMetadata", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class Flashvars(
    @param:JsonProperty("metadata") var metadata: String?, @param:JsonProperty(
        "hlsManifestUrl"
    ) var hlsManifestUrl: String?
) {
    operator fun component1(): String? {
        return metadata
    }

    operator fun component2(): String? {
        return hlsManifestUrl
    }

    fun copy(
        @JsonProperty("metadata") str: String?,
        @JsonProperty("hlsManifestUrl") str2: String?
    ): Flashvars {
        return Flashvars(str, str2)
    }

    override fun equals(obj: Object): Boolean {
        if (this === obj) {
            return true
        }
        if (obj is Flashvars) {
            val flashvars = obj as Flashvars
            return Intrinsics.areEqual(metadata, flashvars.metadata) && Intrinsics.areEqual(
                hlsManifestUrl, flashvars.hlsManifestUrl
            )
        }
        return false
    }

    override fun hashCode(): Int {
        val str = metadata
        val hashCode = (str?.hashCode() ?: 0) * 31
        val str2 = hlsManifestUrl
        return hashCode + (str2?.hashCode() ?: 0)
    }

    override fun toString(): String {
        return "Flashvars(metadata=" + metadata + ", hlsManifestUrl=" + hlsManifestUrl + ')'
    }

    @JvmOverloads
            /* synthetic */   constructor(
        str: String? = null,
        str2: String? = null,
        i: Int = 3,
        defaultConstructorMarker: DefaultConstructorMarker? = null
    ) : this(if (i and 1 != 0) null else str, if (i and 2 != 0) null else str2) {
    }

    companion object {
        fun  /* synthetic */`copy$default`(
            flashvars: Flashvars,
            str: String?,
            str2: String?,
            i: Int,
            obj: Object?
        ): Flashvars {
            var str = str
            var str2 = str2
            if (i and 1 != 0) {
                str = flashvars.metadata
            }
            if (i and 2 != 0) {
                str2 = flashvars.hlsManifestUrl
            }
            return flashvars.copy(str, str2)
        }
    }
}