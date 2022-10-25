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
    m108d1 = ["\u0000#\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\u008a\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0018\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\u000c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"],
    m107d2 = ["com/lagradost/cloudstream3/extractors/Mcloud\$getUrl\$SourcesMcloud", "", "file", "", "(Ljava/lang/String;)V", "getFile", "()Ljava/lang/String;", "component1", "copy", "(Ljava/lang/String;)Lcom/lagradost/cloudstream3/extractors/Mcloud\$getUrl\$SourcesMcloud;", "equals", "", "other", "hashCode", "", "toString", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class `Mcloud$getUrl$SourcesMcloud`(@JsonProperty("file") file: String) {
    val file: String
    operator fun component1(): String {
        return file
    }

    fun copy(@JsonProperty("file") file: String): `Mcloud$getUrl$SourcesMcloud` {
        Intrinsics.checkNotNullParameter(file, "file")
        return `Mcloud$getUrl$SourcesMcloud`(file)
    }

    override fun equals(obj: Object): Boolean {
        return if (this === obj) {
            true
        } else obj is `Mcloud$getUrl$SourcesMcloud` && Intrinsics.areEqual(
            file,
            (obj as `Mcloud$getUrl$SourcesMcloud`).file
        )
    }

    override fun hashCode(): Int {
        return file.hashCode()
    }

    override fun toString(): String {
        return "SourcesMcloud(file=" + file + ')'
    }

    init {
        Intrinsics.checkNotNullParameter(file, "file")
        this.file = file
    }

    companion object {
        fun  /* synthetic */`copy$default`(
            `mcloud$getUrl$SourcesMcloud`: `Mcloud$getUrl$SourcesMcloud`,
            str: String,
            i: Int,
            obj: Object?
        ): `Mcloud$getUrl$SourcesMcloud` {
            var str = str
            if (i and 1 != 0) {
                str = `mcloud$getUrl$SourcesMcloud`.file
            }
            return `mcloud$getUrl$SourcesMcloud`.copy(str)
        }
    }
}