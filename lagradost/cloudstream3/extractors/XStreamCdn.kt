package com.lagradost.cloudstream3.extractors

import com.google.firebase.messaging.Constants
import java.util.List
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: XStreamCdn.kt */
@Metadata(
    m108d1 = ["\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0016J)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\u0006R\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"],
    m107d2 = ["Lcom/lagradost/cloudstream3/extractors/XStreamCdn;", "Lcom/lagradost/cloudstream3/utils/ExtractorApi;", "()V", "domainUrl", "", "getDomainUrl", "()Ljava/lang/String;", "setDomainUrl", "(Ljava/lang/String;)V", "mainUrl", "getMainUrl", "name", "getName", "requiresReferer", "", "getRequiresReferer", "()Z", "getExtractorUrl", "id", "getUrl", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "url", "referer", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ResponseData", "ResponseJson", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes3.dex */
open class XStreamCdn : ExtractorApi() {
    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    val requiresReferer = false

    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    val name = "XStreamCdn"

    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    val mainUrl = "https://embedsito.com"
    open var domainUrl = "embedsito.com"
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    @Override // com.lagradost.cloudstream3.utils.ExtractorApi
    override fun getUrl(
        str: String?,
        str2: String?,
        continuation: Continuation<in List<ExtractorLink?>?>?
    ): Object {
        return `getUrl$suspendImpl`(this, str, str2, continuation as Continuation<*>?)
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: XStreamCdn.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000c\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"],
        m107d2 = ["Lcom/lagradost/cloudstream3/extractors/XStreamCdn\$ResponseData;", "", "file", "", Constants.ScionAnalytics.PARAM_LABEL, "(Ljava/lang/String;Ljava/lang/String;)V", "getFile", "()Ljava/lang/String;", "getLabel", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class ResponseData(@JsonProperty("file") file: String, @JsonProperty("label") label: String) {
        val file: String
        val label: String
        operator fun component1(): String {
            return file
        }

        operator fun component2(): String {
            return label
        }

        fun copy(
            @JsonProperty("file") file: String,
            @JsonProperty("label") label: String
        ): ResponseData {
            Intrinsics.checkNotNullParameter(file, "file")
            Intrinsics.checkNotNullParameter(label, "label")
            return ResponseData(file, label)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is ResponseData) {
                val responseData = obj as ResponseData
                return Intrinsics.areEqual(file, responseData.file) && Intrinsics.areEqual(
                    label, responseData.label
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return file.hashCode() * 31 + label.hashCode()
        }

        override fun toString(): String {
            return "ResponseData(file=" + file + ", label=" + label + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(file, "file")
            Intrinsics.checkNotNullParameter(label, "label")
            this.file = file
            this.label = label
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                responseData: ResponseData,
                str: String,
                str2: String,
                i: Int,
                obj: Object?
            ): ResponseData {
                var str = str
                var str2 = str2
                if (i and 1 != 0) {
                    str = responseData.file
                }
                if (i and 2 != 0) {
                    str2 = responseData.label
                }
                return responseData.copy(str, str2)
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: XStreamCdn.kt */
    @Metadata(
        m108d1 = ["\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000c\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/extractors/XStreamCdn\$ResponseJson;", "", "success", "", "data", "", "Lcom/lagradost/cloudstream3/extractors/XStreamCdn\$ResponseData;", "(ZLjava/util/List;)V", "getData", "()Ljava/util/List;", "getSuccess", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class ResponseJson(
        @param:JsonProperty("success") val success: Boolean, @param:JsonProperty(
            "data"
        ) val data: List<ResponseData>
    ) {
        operator fun component1(): Boolean {
            return success
        }

        operator fun component2(): List<ResponseData> {
            return data
        }

        fun copy(
            @JsonProperty("success") z: Boolean,
            @JsonProperty("data") list: List<ResponseData>
        ): ResponseJson {
            return ResponseJson(z, list)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is ResponseJson) {
                val responseJson = obj as ResponseJson
                return success == responseJson.success && Intrinsics.areEqual(
                    data, responseJson.data
                )
            }
            return false
        }

        /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Type inference failed for: r0v1, types: [int] */ /* JADX WARN: Type inference failed for: r0v4 */ /* JADX WARN: Type inference failed for: r0v5 */
        override fun hashCode(): Int {
            val z = success
            r0 = z
            if (z) {
                r0 = 1
            }
            val i: Int = r0 * 31
            val list = data
            return i + (list?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "ResponseJson(success=" + success + ", data=" + data + ')'
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                responseJson: ResponseJson,
                z: Boolean,
                list: List,
                i: Int,
                obj: Object?
            ): ResponseJson {
                var z = z
                var list: List = list
                if (i and 1 != 0) {
                    z = responseJson.success
                }
                if (i and 2 != 0) {
                    list = responseJson.data
                }
                return responseJson.copy(z, list)
            }
        }
    }

    @Override // com.lagradost.cloudstream3.utils.ExtractorApi
    override fun getExtractorUrl(id: String): String {
        Intrinsics.checkNotNullParameter(id, "id")
        return "$domainUrl/api/source/$id"
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */ /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */ /* JADX WARN: Removed duplicated region for block: B:19:0x00ec  */ /* JADX WARN: Removed duplicated region for block: B:21:0x00f1  */ /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
        fun  /* synthetic */`getUrl$suspendImpl`(
            r26: XStreamCdn?,
            r27: String?,
            r28: String?,
            r29: Continuation<*>?
        ): Any {
            /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.extractors.XStreamCdn.getUrl\$suspendImpl(com.lagradost.cloudstream3.extractors.XStreamCdn, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
        }
    }
}