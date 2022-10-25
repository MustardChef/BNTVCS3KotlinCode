package com.lagradost.cloudstream3.extractors

import com.google.firebase.messaging.Constants
import java.util.List
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: Tantifilm.kt */
@Metadata(
    m108d1 = ["\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0005¢\u0006\u0002\u0010\u0002J+\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u0014\u0010\u000c\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"],
    m107d2 = ["Lcom/lagradost/cloudstream3/extractors/Tantifilm;", "Lcom/lagradost/cloudstream3/utils/ExtractorApi;", "()V", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "requiresReferer", "", "getRequiresReferer", "()Z", "getUrl", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "url", "referer", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "TantifilmData", "TantifilmJsonData", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class Tantifilm : ExtractorApi() {
    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    val requiresReferer = false

    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    var name = "Tantifilm"
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    var mainUrl = "https://cercafilm.net"
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

    /* compiled from: Tantifilm.kt */
    @Metadata(
        m108d1 = ["\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J=\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\b\u0003\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000cR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000cR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"],
        m107d2 = ["Lcom/lagradost/cloudstream3/extractors/Tantifilm\$TantifilmJsonData;", "", "success", "", "data", "", "Lcom/lagradost/cloudstream3/extractors/Tantifilm\$TantifilmData;", "captions", "", "is_vr", "(ZLjava/util/List;Ljava/util/List;Z)V", "getCaptions", "()Ljava/util/List;", "getData", "()Z", "getSuccess", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class TantifilmJsonData(
        @JsonProperty("success") z: Boolean,
        @JsonProperty("data") data: List<TantifilmData>,
        @JsonProperty("captions") captions: List<String>,
        @JsonProperty("is_vr") z2: Boolean
    ) {
        val captions: List<String>
        val data: List<TantifilmData>
        private val is_vr: Boolean
        val success: Boolean
        operator fun component1(): Boolean {
            return success
        }

        operator fun component2(): List<TantifilmData> {
            return data
        }

        operator fun component3(): List<String> {
            return captions
        }

        operator fun component4(): Boolean {
            return is_vr
        }

        fun copy(
            @JsonProperty("success") z: Boolean,
            @JsonProperty("data") data: List<TantifilmData>,
            @JsonProperty("captions") captions: List<String>,
            @JsonProperty("is_vr") z2: Boolean
        ): TantifilmJsonData {
            Intrinsics.checkNotNullParameter(data, "data")
            Intrinsics.checkNotNullParameter(captions, "captions")
            return TantifilmJsonData(z, data, captions, z2)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is TantifilmJsonData) {
                val tantifilmJsonData = obj as TantifilmJsonData
                return success == tantifilmJsonData.success && Intrinsics.areEqual(
                    data, tantifilmJsonData.data
                ) && Intrinsics.areEqual(
                    captions, tantifilmJsonData.captions
                ) && is_vr == tantifilmJsonData.is_vr
            }
            return false
        }

        /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Type inference failed for: r0v1, types: [int] */ /* JADX WARN: Type inference failed for: r0v8 */ /* JADX WARN: Type inference failed for: r0v9 */
        override fun hashCode(): Int {
            val z = success
            r0 = z
            if (z) {
                r0 = 1
            }
            val hashCode: Int = ((r0 * 31 + data.hashCode()) * 31 + captions.hashCode()) * 31
            val z2 = is_vr
            return hashCode + if (z2) 1 else if (z2) 1 else 0
        }

        override fun toString(): String {
            return "TantifilmJsonData(success=" + success + ", data=" + data + ", captions=" + captions + ", is_vr=" + is_vr + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(data, "data")
            Intrinsics.checkNotNullParameter(captions, "captions")
            success = z
            this.data = data
            this.captions = captions
            is_vr = z2
        }

        fun is_vr(): Boolean {
            return is_vr
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                tantifilmJsonData: TantifilmJsonData,
                z: Boolean,
                list: List,
                list2: List,
                z2: Boolean,
                i: Int,
                obj: Object?
            ): TantifilmJsonData {
                var z = z
                var list: List = list
                var list2: List = list2
                var z2 = z2
                if (i and 1 != 0) {
                    z = tantifilmJsonData.success
                }
                if (i and 2 != 0) {
                    list = tantifilmJsonData.data
                }
                if (i and 4 != 0) {
                    list2 = tantifilmJsonData.captions
                }
                if (i and 8 != 0) {
                    z2 = tantifilmJsonData.is_vr
                }
                return tantifilmJsonData.copy(z, list, list2, z2)
            }
        }
    }

    /* compiled from: Tantifilm.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000c\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/extractors/Tantifilm\$TantifilmData;", "", "file", "", Constants.ScionAnalytics.PARAM_LABEL, "type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFile", "()Ljava/lang/String;", "getLabel", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class TantifilmData(
        @JsonProperty("file") file: String,
        @JsonProperty("label") label: String,
        @JsonProperty("type") type: String
    ) {
        val file: String
        val label: String
        val type: String
        operator fun component1(): String {
            return file
        }

        operator fun component2(): String {
            return label
        }

        operator fun component3(): String {
            return type
        }

        fun copy(
            @JsonProperty("file") file: String,
            @JsonProperty("label") label: String,
            @JsonProperty("type") type: String
        ): TantifilmData {
            Intrinsics.checkNotNullParameter(file, "file")
            Intrinsics.checkNotNullParameter(label, "label")
            Intrinsics.checkNotNullParameter(type, "type")
            return TantifilmData(file, label, type)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is TantifilmData) {
                val tantifilmData = obj as TantifilmData
                return Intrinsics.areEqual(file, tantifilmData.file) && Intrinsics.areEqual(
                    label, tantifilmData.label
                ) && Intrinsics.areEqual(type, tantifilmData.type)
            }
            return false
        }

        override fun hashCode(): Int {
            return (file.hashCode() * 31 + label.hashCode()) * 31 + type.hashCode()
        }

        override fun toString(): String {
            return "TantifilmData(file=" + file + ", label=" + label + ", type=" + type + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(file, "file")
            Intrinsics.checkNotNullParameter(label, "label")
            Intrinsics.checkNotNullParameter(type, "type")
            this.file = file
            this.label = label
            this.type = type
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                tantifilmData: TantifilmData,
                str: String,
                str2: String,
                str3: String,
                i: Int,
                obj: Object?
            ): TantifilmData {
                var str = str
                var str2 = str2
                var str3 = str3
                if (i and 1 != 0) {
                    str = tantifilmData.file
                }
                if (i and 2 != 0) {
                    str2 = tantifilmData.label
                }
                if (i and 4 != 0) {
                    str3 = tantifilmData.type
                }
                return tantifilmData.copy(str, str2, str3)
            }
        }
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */ /* JADX WARN: Removed duplicated region for block: B:20:0x00d2  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
        fun  /* synthetic */`getUrl$suspendImpl`(
            r24: Tantifilm?,
            r25: String?,
            r26: String?,
            r27: Continuation<*>?
        ): Any {
            /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.extractors.Tantifilm.getUrl\$suspendImpl(com.lagradost.cloudstream3.extractors.Tantifilm, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
        }
    }
}