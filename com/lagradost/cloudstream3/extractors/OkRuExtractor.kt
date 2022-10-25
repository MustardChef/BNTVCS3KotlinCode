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

@Metadata(
    m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\u000c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"],
    m107d2 = ["Lcom/lagradost/cloudstream3/extractors/DataOptionsJson;", "", "flashvars", "Lcom/lagradost/cloudstream3/extractors/Flashvars;", "(Lcom/lagradost/cloudstream3/extractors/Flashvars;)V", "getFlashvars", "()Lcom/lagradost/cloudstream3/extractors/Flashvars;", "setFlashvars", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.extractors.DataOptionsJson */ /* loaded from: classes3.dex */
class OkRuExtractor(@param:JsonProperty("flashvars") var flashvars: Flashvars) {
    operator fun component1(): Flashvars {
        return flashvars
    }

    fun copy(@JsonProperty("flashvars") flashvars: Flashvars): OkRuExtractor {
        return OkRuExtractor(flashvars)
    }

    override fun equals(obj: Object): Boolean {
        return if (this === obj) {
            true
        } else obj is OkRuExtractor && Intrinsics.areEqual(
            flashvars,
            (obj as OkRuExtractor).flashvars
        )
    }

    override fun hashCode(): Int {
        val flashvars = flashvars ?: return 0
        return flashvars.hashCode()
    }

    override fun toString(): String {
        return "DataOptionsJson(flashvars=" + flashvars + ')'
    }

    @JvmOverloads
            /* synthetic */   constructor(
        flashvars: Flashvars? = null,
        i: Int = 1,
        defaultConstructorMarker: DefaultConstructorMarker? = null
    ) : this(if (i and 1 != 0) Flashvars(null, null, 3, null) else flashvars) {
    }

    companion object {
        fun  /* synthetic */`copy$default`(
            okRuExtractor: OkRuExtractor,
            flashvars: Flashvars,
            i: Int,
            obj: Object?
        ): OkRuExtractor {
            var flashvars = flashvars
            if (i and 1 != 0) {
                flashvars = okRuExtractor.flashvars
            }
            return okRuExtractor.copy(flashvars)
        }
    }
}