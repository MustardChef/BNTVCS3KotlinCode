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
import com.google.firebase.messaging.Constants
import kotlin.jvm.JvmOverloads
import com.lagradost.cloudstream3.extractors.helper.AsianEmbedHelper
import com.lagradost.cloudstream3.SubtitleFile
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.extractors.helper.VstreamhubHelper
import kotlin.coroutines.jvm.internal.DebugMetadata
import com.lagradost.cloudstream3.extractors.helper.``WcoHelper$Companion$getKeys$1`
import kotlin.jvm.internal.Intrinsics

/* compiled from: Supervideo.kt */
@Metadata(
    m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000c\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"],
    m107d2 = ["Lcom/lagradost/cloudstream3/extractors/Files;", "", "id", "", Constants.ScionAnalytics.PARAM_LABEL, "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getLabel", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class Files(@JsonProperty("file") id: String, @JsonProperty("label") str: String?) {
    /* renamed from: id */
    val id: String
    val label: String?
    operator fun component1(): String {
        return id
    }

    operator fun component2(): String? {
        return label
    }

    fun copy(@JsonProperty("file") id: String, @JsonProperty("label") str: String?): Files {
        Intrinsics.checkNotNullParameter(id, "id")
        return Files(id, str)
    }

    override fun equals(obj: Object): Boolean {
        if (this === obj) {
            return true
        }
        if (obj is Files) {
            val files = obj as Files
            return Intrinsics.areEqual(id, files.id) && Intrinsics.areEqual(
                label, files.label
            )
        }
        return false
    }

    override fun hashCode(): Int {
        val hashCode = id.hashCode() * 31
        val str = label
        return hashCode + (str?.hashCode() ?: 0)
    }

    override fun toString(): String {
        return "Files(id=" + id + ", label=" + label + ')'
    }

    init {
        Intrinsics.checkNotNullParameter(id, "id")
        this.id = id
        label = str
    }

    /* synthetic */   constructor(
        str: String,
        str2: String?,
        i: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(str, if (i and 2 != 0) null else str2) {
    }

    companion object {
        fun  /* synthetic */`copy$default`(
            files: Files,
            str: String,
            str2: String?,
            i: Int,
            obj: Object?
        ): Files {
            var str = str
            var str2 = str2
            if (i and 1 != 0) {
                str = files.id
            }
            if (i and 2 != 0) {
                str2 = files.label
            }
            return files.copy(str, str2)
        }
    }
}