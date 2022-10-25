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
    m108d1 = ["\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000*\u0002\u0000\u0005\b\u008a\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000c\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"],
    m107d2 = ["com/lagradost/cloudstream3/extractors/WcoStream\$getUrl\$WcoResponse", "", "status", "", "data", "com/lagradost/cloudstream3/extractors/WcoStream\$getUrl\$DataWco", "(Ljava/lang/Integer;Lcom/lagradost/cloudstream3/extractors/WcoStream\$getUrl\$DataWco;)V", "getData", "()Lcom/lagradost/cloudstream3/extractors/WcoStream\$getUrl\$DataWco;", "Lcom/lagradost/cloudstream3/extractors/WcoStream\$getUrl\$DataWco;", "getStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/Integer;Lcom/lagradost/cloudstream3/extractors/WcoStream\$getUrl\$DataWco;)Lcom/lagradost/cloudstream3/extractors/WcoStream\$getUrl\$WcoResponse;", "equals", "", "other", "hashCode", "toString", "", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class `WcoStream$getUrl$WcoResponse`(
    @JsonProperty("status") num: Integer?,
    @JsonProperty("data") `wcoStream$getUrl$DataWco`: `WcoStream$getUrl$DataWco`
) {
    val data: `WcoStream$getUrl$DataWco`
    private val status: Integer?
    operator fun component1(): Integer? {
        return status
    }

    operator fun component2(): `WcoStream$getUrl$DataWco` {
        return data
    }

    fun copy(
        @JsonProperty("status") num: Integer?,
        @JsonProperty("data") `wcoStream$getUrl$DataWco`: `WcoStream$getUrl$DataWco`
    ): `WcoStream$getUrl$WcoResponse` {
        return `WcoStream$getUrl$WcoResponse`(num, `wcoStream$getUrl$DataWco`)
    }

    override fun equals(obj: Object): Boolean {
        if (this === obj) {
            return true
        }
        if (obj is `WcoStream$getUrl$WcoResponse`) {
            val `wcoStream$getUrl$WcoResponse` = obj as `WcoStream$getUrl$WcoResponse`
            return Intrinsics.areEqual(
                status,
                `wcoStream$getUrl$WcoResponse`.status
            ) && Intrinsics.areEqual(
                data, `wcoStream$getUrl$WcoResponse`.data
            )
        }
        return false
    }

    override fun hashCode(): Int {
        val num: Integer? = status
        val hashCode = (if (num == null) 0 else num.hashCode()) * 31
        val `wcoStream$getUrl$DataWco` = data
        return hashCode + (`wcoStream$getUrl$DataWco`?.hashCode() ?: 0)
    }

    override fun toString(): String {
        return "WcoResponse(status=" + status + ", data=" + data + ')'
    }

    init {
        status = num
        data = `wcoStream$getUrl$DataWco`
    }

    fun getStatus(): Integer? {
        return status
    }

    /* synthetic */   constructor(
        num: Integer?,
        `wcoStream$getUrl$DataWco`: `WcoStream$getUrl$DataWco`?,
        i: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(
        if (i and 1 != 0) null else num,
        (if (i and 2 != 0) `WcoStream$getUrl$DataWco`(
            null,
            1,
            null
        ) else `wcoStream$getUrl$DataWco`)!!
    ) {
    }

    companion object {
        fun  /* synthetic */`copy$default`(
            `wcoStream$getUrl$WcoResponse`: `WcoStream$getUrl$WcoResponse`,
            num: Integer?,
            `wcoStream$getUrl$DataWco`: `WcoStream$getUrl$DataWco`,
            i: Int,
            obj: Object?
        ): `WcoStream$getUrl$WcoResponse` {
            var num: Integer? = num
            var `wcoStream$getUrl$DataWco` = `wcoStream$getUrl$DataWco`
            if (i and 1 != 0) {
                num = `wcoStream$getUrl$WcoResponse`.status
            }
            if (i and 2 != 0) {
                `wcoStream$getUrl$DataWco` = `wcoStream$getUrl$WcoResponse`.data
            }
            return `wcoStream$getUrl$WcoResponse`.copy(num, `wcoStream$getUrl$DataWco`)
        }
    }
}