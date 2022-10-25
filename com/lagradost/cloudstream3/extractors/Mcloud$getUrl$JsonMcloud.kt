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
    m108d1 = ["\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000*\u0002\u0000\u0005\b\u008a\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ$\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000c\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"],
    m107d2 = ["com/lagradost/cloudstream3/extractors/Mcloud\$getUrl\$JsonMcloud", "", "status", "", "data", "com/lagradost/cloudstream3/extractors/Mcloud\$getUrl\$DataMcloud", "(Ljava/lang/Integer;Lcom/lagradost/cloudstream3/extractors/Mcloud\$getUrl\$DataMcloud;)V", "getData", "()Lcom/lagradost/cloudstream3/extractors/Mcloud\$getUrl\$DataMcloud;", "Lcom/lagradost/cloudstream3/extractors/Mcloud\$getUrl\$DataMcloud;", "getStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/Integer;Lcom/lagradost/cloudstream3/extractors/Mcloud\$getUrl\$DataMcloud;)Lcom/lagradost/cloudstream3/extractors/Mcloud\$getUrl\$JsonMcloud;", "equals", "", "other", "hashCode", "toString", "", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class `Mcloud$getUrl$JsonMcloud`(
    @JsonProperty("status") num: Integer?,
    @JsonProperty("data") data: `Mcloud$getUrl$DataMcloud`
) {
    val data: `Mcloud$getUrl$DataMcloud`
    private val status: Integer?
    operator fun component1(): Integer? {
        return status
    }

    operator fun component2(): `Mcloud$getUrl$DataMcloud` {
        return data
    }

    fun copy(
        @JsonProperty("status") num: Integer?,
        @JsonProperty("data") data: `Mcloud$getUrl$DataMcloud`
    ): `Mcloud$getUrl$JsonMcloud` {
        Intrinsics.checkNotNullParameter(data, "data")
        return `Mcloud$getUrl$JsonMcloud`(num, data)
    }

    override fun equals(obj: Object): Boolean {
        if (this === obj) {
            return true
        }
        if (obj is `Mcloud$getUrl$JsonMcloud`) {
            val `mcloud$getUrl$JsonMcloud` = obj as `Mcloud$getUrl$JsonMcloud`
            return Intrinsics.areEqual(
                status,
                `mcloud$getUrl$JsonMcloud`.status
            ) && Intrinsics.areEqual(
                data, `mcloud$getUrl$JsonMcloud`.data
            )
        }
        return false
    }

    override fun hashCode(): Int {
        val num: Integer? = status
        return (if (num == null) 0 else num.hashCode()) * 31 + data.hashCode()
    }

    override fun toString(): String {
        return "JsonMcloud(status=" + status + ", data=" + data + ')'
    }

    init {
        Intrinsics.checkNotNullParameter(data, "data")
        status = num
        this.data = data
    }

    fun getStatus(): Integer? {
        return status
    }

    /* synthetic */   constructor(
        num: Integer?,
        `mcloud$getUrl$DataMcloud`: `Mcloud$getUrl$DataMcloud`?,
        i: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(
        if (i and 1 != 0) null else num,
        (if (i and 2 != 0) `Mcloud$getUrl$DataMcloud`(
            null,
            1,
            null
        ) else `mcloud$getUrl$DataMcloud`)!!
    ) {
    }

    companion object {
        fun  /* synthetic */`copy$default`(
            `mcloud$getUrl$JsonMcloud`: `Mcloud$getUrl$JsonMcloud`,
            num: Integer?,
            `mcloud$getUrl$DataMcloud`: `Mcloud$getUrl$DataMcloud`,
            i: Int,
            obj: Object?
        ): `Mcloud$getUrl$JsonMcloud` {
            var num: Integer? = num
            var `mcloud$getUrl$DataMcloud` = `mcloud$getUrl$DataMcloud`
            if (i and 1 != 0) {
                num = `mcloud$getUrl$JsonMcloud`.status
            }
            if (i and 2 != 0) {
                `mcloud$getUrl$DataMcloud` = `mcloud$getUrl$JsonMcloud`.data
            }
            return `mcloud$getUrl$JsonMcloud`.copy(num, `mcloud$getUrl$DataMcloud`)
        }
    }
}