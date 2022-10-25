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
    m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000bJ:\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0006HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\u000c\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0012¨\u0006$"],
    m107d2 = ["Lcom/lagradost/cloudstream3/extractors/Videos;", "", "name", "", "url", "seekSchema", "", "disallowed", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getDisallowed", "()Ljava/lang/Boolean;", "setDisallowed", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getSeekSchema", "()Ljava/lang/Integer;", "setSeekSchema", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getUrl", "setUrl", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/lagradost/cloudstream3/extractors/Videos;", "equals", "other", "hashCode", "toString", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class Videos(
    @JsonProperty("name") name: String,
    @JsonProperty("url") url: String,
    @JsonProperty("seekSchema") num: Integer?,
    @JsonProperty("disallowed") bool: Boolean?
) {
    var disallowed: Boolean?
    private var name: String
    private var seekSchema: Integer?
    private var url: String
    operator fun component1(): String {
        return name
    }

    operator fun component2(): String {
        return url
    }

    operator fun component3(): Integer? {
        return seekSchema
    }

    operator fun component4(): Boolean? {
        return disallowed
    }

    fun copy(
        @JsonProperty("name") name: String,
        @JsonProperty("url") url: String,
        @JsonProperty("seekSchema") num: Integer?,
        @JsonProperty("disallowed") bool: Boolean?
    ): Videos {
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(url, "url")
        return Videos(name, url, num, bool)
    }

    override fun equals(obj: Object): Boolean {
        if (this === obj) {
            return true
        }
        if (obj is Videos) {
            val videos = obj as Videos
            return Intrinsics.areEqual(name, videos.name) && Intrinsics.areEqual(
                url, videos.url
            ) && Intrinsics.areEqual(seekSchema, videos.seekSchema) && Intrinsics.areEqual(
                disallowed, videos.disallowed
            )
        }
        return false
    }

    override fun hashCode(): Int {
        val hashCode = (name.hashCode() * 31 + url.hashCode()) * 31
        val num: Integer? = seekSchema
        val hashCode2: Int = (hashCode + if (num == null) 0 else num.hashCode()) * 31
        val bool = disallowed
        return hashCode2 + (bool?.hashCode() ?: 0)
    }

    override fun toString(): String {
        return "Videos(name=" + name + ", url=" + url + ", seekSchema=" + seekSchema + ", disallowed=" + disallowed + ')'
    }

    init {
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(url, "url")
        this.name = name
        this.url = url
        seekSchema = num
        disallowed = bool
    }

    /* synthetic */   constructor(
        str: String,
        str2: String,
        num: Integer?,
        bool: Boolean?,
        i: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(str, str2, if (i and 4 != 0) null else num, if (i and 8 != 0) null else bool) {
    }

    fun getName(): String {
        return name
    }

    fun setName(str: String) {
        Intrinsics.checkNotNullParameter(str, "<set-?>")
        name = str
    }

    fun getUrl(): String {
        return url
    }

    fun setUrl(str: String) {
        Intrinsics.checkNotNullParameter(str, "<set-?>")
        url = str
    }

    fun getSeekSchema(): Integer? {
        return seekSchema
    }

    fun setSeekSchema(num: Integer?) {
        seekSchema = num
    }

    companion object {
        fun  /* synthetic */`copy$default`(
            videos: Videos,
            str: String,
            str2: String,
            num: Integer?,
            bool: Boolean?,
            i: Int,
            obj: Object?
        ): Videos {
            var str = str
            var str2 = str2
            var num: Integer? = num
            var bool = bool
            if (i and 1 != 0) {
                str = videos.name
            }
            if (i and 2 != 0) {
                str2 = videos.url
            }
            if (i and 4 != 0) {
                num = videos.seekSchema
            }
            if (i and 8 != 0) {
                bool = videos.disallowed
            }
            return videos.copy(str, str2, num, bool)
        }
    }
}