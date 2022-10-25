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
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: Solidfiles.kt */
@Metadata(
    m108d1 = ["\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J)\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"],
    m107d2 = ["Lcom/lagradost/cloudstream3/extractors/Solidfiles;", "Lcom/lagradost/cloudstream3/utils/ExtractorApi;", "()V", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "name", "getName", "requiresReferer", "", "getRequiresReferer", "()Z", "getUrl", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "url", "referer", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ResponseSource", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class Solidfiles : ExtractorApi() {
    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    val requiresReferer = false

    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    val name = "Solidfiles"

    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    val mainUrl = "https://www.solidfiles.com"

    /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */ /* JADX WARN: Removed duplicated region for block: B:21:0x00b2  */ /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List] */
    @Override // com.lagradost.cloudstream3.utils.ExtractorApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun getUrl(
        r22: String?,
        r23: String?,
        r24: Continuation<in MutableList<out ExtractorLink?>?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.extractors.Solidfiles.getUrl(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: Solidfiles.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000c\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"],
        m107d2 = ["Lcom/lagradost/cloudstream3/extractors/Solidfiles\$ResponseSource;", "", "streamUrl", "", "nodeName", "(Ljava/lang/String;Ljava/lang/String;)V", "getNodeName", "()Ljava/lang/String;", "getStreamUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class ResponseSource(
        @JsonProperty("streamUrl") streamUrl: String,
        @JsonProperty("nodeName") nodeName: String
    ) {
        val nodeName: String
        val streamUrl: String
        operator fun component1(): String {
            return streamUrl
        }

        operator fun component2(): String {
            return nodeName
        }

        fun copy(
            @JsonProperty("streamUrl") streamUrl: String,
            @JsonProperty("nodeName") nodeName: String
        ): ResponseSource {
            Intrinsics.checkNotNullParameter(streamUrl, "streamUrl")
            Intrinsics.checkNotNullParameter(nodeName, "nodeName")
            return ResponseSource(streamUrl, nodeName)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is ResponseSource) {
                val responseSource = obj as ResponseSource
                return Intrinsics.areEqual(
                    streamUrl,
                    responseSource.streamUrl
                ) && Intrinsics.areEqual(
                    nodeName, responseSource.nodeName
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return streamUrl.hashCode() * 31 + nodeName.hashCode()
        }

        override fun toString(): String {
            return "ResponseSource(streamUrl=" + streamUrl + ", nodeName=" + nodeName + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(streamUrl, "streamUrl")
            Intrinsics.checkNotNullParameter(nodeName, "nodeName")
            this.streamUrl = streamUrl
            this.nodeName = nodeName
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                responseSource: ResponseSource,
                str: String,
                str2: String,
                i: Int,
                obj: Object?
            ): ResponseSource {
                var str = str
                var str2 = str2
                if (i and 1 != 0) {
                    str = responseSource.streamUrl
                }
                if (i and 2 != 0) {
                    str2 = responseSource.nodeName
                }
                return responseSource.copy(str, str2)
            }
        }
    }
}