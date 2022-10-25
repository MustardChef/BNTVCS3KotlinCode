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

/* compiled from: Mcloud.kt */
@Metadata(
    m108d1 = ["\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0002\u0000\u0003\b\u008a\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u000c2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"],
    m107d2 = ["com/lagradost/cloudstream3/extractors/Mcloud\$getUrl\$DataMcloud", "", "media", "com/lagradost/cloudstream3/extractors/Mcloud\$getUrl\$MediaMcloud", "(Lcom/lagradost/cloudstream3/extractors/Mcloud\$getUrl\$MediaMcloud;)V", "getMedia", "()Lcom/lagradost/cloudstream3/extractors/Mcloud\$getUrl\$MediaMcloud;", "Lcom/lagradost/cloudstream3/extractors/Mcloud\$getUrl\$MediaMcloud;", "component1", "copy", "(Lcom/lagradost/cloudstream3/extractors/Mcloud\$getUrl\$MediaMcloud;)Lcom/lagradost/cloudstream3/extractors/Mcloud\$getUrl\$DataMcloud;", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class `Mcloud$getUrl$DataMcloud`(@param:JsonProperty("media") val media: `Mcloud$getUrl$MediaMcloud`) {
    operator fun component1(): `Mcloud$getUrl$MediaMcloud` {
        return media
    }

    fun copy(@JsonProperty("media") `mcloud$getUrl$MediaMcloud`: `Mcloud$getUrl$MediaMcloud`): `Mcloud$getUrl$DataMcloud` {
        return `Mcloud$getUrl$DataMcloud`(`mcloud$getUrl$MediaMcloud`)
    }

    override fun equals(obj: Object): Boolean {
        return if (this === obj) {
            true
        } else obj is `Mcloud$getUrl$DataMcloud` && Intrinsics.areEqual(
            media,
            (obj as `Mcloud$getUrl$DataMcloud`).media
        )
    }

    override fun hashCode(): Int {
        val `mcloud$getUrl$MediaMcloud` = media ?: return 0
        return `mcloud$getUrl$MediaMcloud`.hashCode()
    }

    override fun toString(): String {
        return "DataMcloud(media=" + media + ')'
    }

    /* synthetic */   constructor(
        `mcloud$getUrl$MediaMcloud`: `Mcloud$getUrl$MediaMcloud`?,
        i: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(
        (if (i and 1 != 0) `Mcloud$getUrl$MediaMcloud`(
            null,
            1,
            null
        ) else `mcloud$getUrl$MediaMcloud`)!!
    ) {
    }

    companion object {
        fun  /* synthetic */`copy$default`(
            `mcloud$getUrl$DataMcloud`: `Mcloud$getUrl$DataMcloud`,
            `mcloud$getUrl$MediaMcloud`: `Mcloud$getUrl$MediaMcloud`,
            i: Int,
            obj: Object?
        ): `Mcloud$getUrl$DataMcloud` {
            var `mcloud$getUrl$MediaMcloud` = `mcloud$getUrl$MediaMcloud`
            if (i and 1 != 0) {
                `mcloud$getUrl$MediaMcloud` = `mcloud$getUrl$DataMcloud`.media
            }
            return `mcloud$getUrl$DataMcloud`.copy(`mcloud$getUrl$MediaMcloud`)
        }
    }
}