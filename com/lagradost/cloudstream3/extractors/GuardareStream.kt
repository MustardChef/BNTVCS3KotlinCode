package com.lagradost.cloudstream3.extractors

import com.google.firebase.messaging.Constants
import java.util.List
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: GuardareStream.kt */
@Metadata(
    m108d1 = ["\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0005¢\u0006\u0002\u0010\u0002J+\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u0014\u0010\u000c\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"],
    m107d2 = ["Lcom/lagradost/cloudstream3/extractors/GuardareStream;", "Lcom/lagradost/cloudstream3/utils/ExtractorApi;", "()V", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "requiresReferer", "", "getRequiresReferer", "()Z", "getUrl", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "url", "referer", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GuardareData", "GuardareJsonData", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class GuardareStream : ExtractorApi() {
    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    val requiresReferer = false

    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    var name = "Guardare"
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    var mainUrl = "https://guardare.stream"
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

    /* compiled from: GuardareStream.kt */
    @Metadata(
        m108d1 = ["\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\u000c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"],
        m107d2 = ["Lcom/lagradost/cloudstream3/extractors/GuardareStream\$GuardareJsonData;", "", "data", "", "Lcom/lagradost/cloudstream3/extractors/GuardareStream\$GuardareData;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class GuardareJsonData(@JsonProperty("data") data: List<GuardareData>) {
        val data: List<GuardareData>
        operator fun component1(): List<GuardareData> {
            return data
        }

        fun copy(@JsonProperty("data") data: List<GuardareData>): GuardareJsonData {
            Intrinsics.checkNotNullParameter(data, "data")
            return GuardareJsonData(data)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is GuardareJsonData && Intrinsics.areEqual(
                data,
                (obj as GuardareJsonData).data
            )
        }

        override fun hashCode(): Int {
            return data.hashCode()
        }

        override fun toString(): String {
            return "GuardareJsonData(data=" + data + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(data, "data")
            this.data = data
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                guardareJsonData: GuardareJsonData,
                list: List,
                i: Int,
                obj: Object?
            ): GuardareJsonData {
                var list: List = list
                if (i and 1 != 0) {
                    list = guardareJsonData.data
                }
                return guardareJsonData.copy(list)
            }
        }
    }

    /* compiled from: GuardareStream.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000c\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/extractors/GuardareStream\$GuardareData;", "", "file", "", Constants.ScionAnalytics.PARAM_LABEL, "type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFile", "()Ljava/lang/String;", "getLabel", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class GuardareData(
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
        ): GuardareData {
            Intrinsics.checkNotNullParameter(file, "file")
            Intrinsics.checkNotNullParameter(label, "label")
            Intrinsics.checkNotNullParameter(type, "type")
            return GuardareData(file, label, type)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is GuardareData) {
                val guardareData = obj as GuardareData
                return Intrinsics.areEqual(file, guardareData.file) && Intrinsics.areEqual(
                    label, guardareData.label
                ) && Intrinsics.areEqual(type, guardareData.type)
            }
            return false
        }

        override fun hashCode(): Int {
            return (file.hashCode() * 31 + label.hashCode()) * 31 + type.hashCode()
        }

        override fun toString(): String {
            return "GuardareData(file=" + file + ", label=" + label + ", type=" + type + ')'
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
                guardareData: GuardareData,
                str: String,
                str2: String,
                str3: String,
                i: Int,
                obj: Object?
            ): GuardareData {
                var str = str
                var str2 = str2
                var str3 = str3
                if (i and 1 != 0) {
                    str = guardareData.file
                }
                if (i and 2 != 0) {
                    str2 = guardareData.label
                }
                if (i and 4 != 0) {
                    str3 = guardareData.type
                }
                return guardareData.copy(str, str2, str3)
            }
        }
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */ /* JADX WARN: Removed duplicated region for block: B:20:0x00c0  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
        fun  /* synthetic */`getUrl$suspendImpl`(
            r24: GuardareStream?,
            r25: String?,
            r26: String?,
            r27: Continuation<*>?
        ): Any {
            /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.extractors.GuardareStream.getUrl\$suspendImpl(com.lagradost.cloudstream3.extractors.GuardareStream, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
        }
    }
}