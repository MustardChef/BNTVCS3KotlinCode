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

/* compiled from: WcoStream.kt */
@Metadata(
    m108d1 = ["\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0002\u0000\u0003\b\u008a\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u000c2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"],
    m107d2 = ["com/lagradost/cloudstream3/extractors/WcoStream\$getUrl\$DataWco", "", "media", "com/lagradost/cloudstream3/extractors/WcoStream\$getUrl\$MediaWco", "(Lcom/lagradost/cloudstream3/extractors/WcoStream\$getUrl\$MediaWco;)V", "getMedia", "()Lcom/lagradost/cloudstream3/extractors/WcoStream\$getUrl\$MediaWco;", "Lcom/lagradost/cloudstream3/extractors/WcoStream\$getUrl\$MediaWco;", "component1", "copy", "(Lcom/lagradost/cloudstream3/extractors/WcoStream\$getUrl\$MediaWco;)Lcom/lagradost/cloudstream3/extractors/WcoStream\$getUrl\$DataWco;", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class `WcoStream$getUrl$DataWco`(@param:JsonProperty("media") val media: `WcoStream$getUrl$MediaWco`) {
    operator fun component1(): `WcoStream$getUrl$MediaWco` {
        return media
    }

    fun copy(@JsonProperty("media") `wcoStream$getUrl$MediaWco`: `WcoStream$getUrl$MediaWco`): `WcoStream$getUrl$DataWco` {
        return `WcoStream$getUrl$DataWco`(`wcoStream$getUrl$MediaWco`)
    }

    override fun equals(obj: Object): Boolean {
        return if (this === obj) {
            true
        } else obj is `WcoStream$getUrl$DataWco` && Intrinsics.areEqual(
            media,
            (obj as `WcoStream$getUrl$DataWco`).media
        )
    }

    override fun hashCode(): Int {
        val `wcoStream$getUrl$MediaWco` = media ?: return 0
        return `wcoStream$getUrl$MediaWco`.hashCode()
    }

    override fun toString(): String {
        return "DataWco(media=" + media + ')'
    }

    /* synthetic */   constructor(
        `wcoStream$getUrl$MediaWco`: `WcoStream$getUrl$MediaWco`?,
        i: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(
        (if (i and 1 != 0) `WcoStream$getUrl$MediaWco`(
            null,
            1,
            null
        ) else `wcoStream$getUrl$MediaWco`)!!
    ) {
    }

    companion object {
        fun  /* synthetic */`copy$default`(
            `wcoStream$getUrl$DataWco`: `WcoStream$getUrl$DataWco`,
            `wcoStream$getUrl$MediaWco`: `WcoStream$getUrl$MediaWco`,
            i: Int,
            obj: Object?
        ): `WcoStream$getUrl$DataWco` {
            var `wcoStream$getUrl$MediaWco` = `wcoStream$getUrl$MediaWco`
            if (i and 1 != 0) {
                `wcoStream$getUrl$MediaWco` = `wcoStream$getUrl$DataWco`.media
            }
            return `wcoStream$getUrl$DataWco`.copy(`wcoStream$getUrl$MediaWco`)
        }
    }
}