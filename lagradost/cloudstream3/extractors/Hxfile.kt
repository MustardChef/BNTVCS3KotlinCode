package com.lagradost.cloudstream3.extractors

import com.google.firebase.messaging.Constants
import java.util.List
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: Hxfile.kt */
@Metadata(
    m108d1 = ["\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J+\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000cR\u0014\u0010\r\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"],
    m107d2 = ["Lcom/lagradost/cloudstream3/extractors/Hxfile;", "Lcom/lagradost/cloudstream3/utils/ExtractorApi;", "()V", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "name", "getName", "redirect", "", "getRedirect", "()Z", "requiresReferer", "getRequiresReferer", "getUrl", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "url", "referer", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ResponseSource", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes3.dex */
open class Hxfile : ExtractorApi() {
    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    val requiresReferer = false

    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    val name = "Hxfile"

    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    val mainUrl = "https://hxfile.co"
    open val redirect = true

    @Override // com.lagradost.cloudstream3.utils.ExtractorApi
    override fun getUrl(
        str: String?,
        str2: String?,
        continuation: Continuation<in List<ExtractorLink?>?>?
    ): Object {
        return `getUrl$suspendImpl`(this, str, str2, continuation as Continuation<*>?)
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: Hxfile.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/extractors/Hxfile\$ResponseSource;", "", "file", "", "type", Constants.ScionAnalytics.PARAM_LABEL, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFile", "()Ljava/lang/String;", "getLabel", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class ResponseSource(
        @JsonProperty("file") file: String,
        @JsonProperty("type") str: String,
        @JsonProperty("label") str2: String
    ) {
        val file: String
        val label: String
        val type: String
        operator fun component1(): String {
            return file
        }

        operator fun component2(): String {
            return type
        }

        operator fun component3(): String {
            return label
        }

        fun copy(
            @JsonProperty("file") file: String,
            @JsonProperty("type") str: String,
            @JsonProperty("label") str2: String
        ): ResponseSource {
            Intrinsics.checkNotNullParameter(file, "file")
            return ResponseSource(file, str, str2)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is ResponseSource) {
                val responseSource = obj as ResponseSource
                return Intrinsics.areEqual(file, responseSource.file) && Intrinsics.areEqual(
                    type, responseSource.type
                ) && Intrinsics.areEqual(label, responseSource.label)
            }
            return false
        }

        override fun hashCode(): Int {
            val hashCode = file.hashCode() * 31
            val str = type
            val hashCode2 = (hashCode + (str?.hashCode() ?: 0)) * 31
            val str2 = label
            return hashCode2 + (str2?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "ResponseSource(file=" + file + ", type=" + type + ", label=" + label + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(file, "file")
            this.file = file
            type = str
            label = str2
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                responseSource: ResponseSource,
                str: String,
                str2: String,
                str3: String,
                i: Int,
                obj: Object?
            ): ResponseSource {
                var str = str
                var str2 = str2
                var str3 = str3
                if (i and 1 != 0) {
                    str = responseSource.file
                }
                if (i and 2 != 0) {
                    str2 = responseSource.type
                }
                if (i and 4 != 0) {
                    str3 = responseSource.label
                }
                return responseSource.copy(str, str2, str3)
            }
        }
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */ /* JADX WARN: Removed duplicated region for block: B:21:0x00ba  */ /* JADX WARN: Removed duplicated region for block: B:29:0x0120  */ /* JADX WARN: Removed duplicated region for block: B:53:0x0215  */ /* JADX WARN: Removed duplicated region for block: B:72:0x0281  */ /* JADX WARN: Removed duplicated region for block: B:73:0x0288  */ /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
        fun  /* synthetic */`getUrl$suspendImpl`(
            r32: Hxfile?,
            r33: String?,
            r34: String?,
            r35: Continuation<*>?
        ): Any {
            /*
            Method dump skipped, instructions count: 706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.extractors.Hxfile.getUrl\$suspendImpl(com.lagradost.cloudstream3.extractors.Hxfile, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
        }
    }
}