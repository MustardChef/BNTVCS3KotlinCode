package com.lagradost.cloudstream3.extractors

import com.google.firebase.messaging.Constants
import java.util.List
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: Streamlare.kt */
@Metadata(
    m108d1 = ["\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0005¢\u0006\u0002\u0010\u0002J+\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\nR\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"],
    m107d2 = ["Lcom/lagradost/cloudstream3/extractors/Slmaxed;", "Lcom/lagradost/cloudstream3/utils/ExtractorApi;", "()V", "embedRegex", "Lkotlin/text/Regex;", "getEmbedRegex", "()Lkotlin/text/Regex;", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "name", "getName", "requiresReferer", "", "getRequiresReferer", "()Z", "getUrl", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "url", "referer", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "JsonResponse", "Result", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes3.dex */
open class Slmaxed : ExtractorApi() {
    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    val name = "Streamlare"

    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    val mainUrl = "https://slmaxed.com/"

    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    val requiresReferer = true
    val embedRegex: Regex = Regex("/e/([^/]*)")

    @Override // com.lagradost.cloudstream3.utils.ExtractorApi
    override fun getUrl(
        str: String?,
        str2: String?,
        continuation: Continuation<in List<ExtractorLink?>?>?
    ): Object {
        return `getUrl$suspendImpl`(this, str, str2, continuation as Continuation<*>?)
    }

    /* compiled from: Streamlare.kt */
    @Metadata(
        m108d1 = ["\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0016\b\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000cR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000cR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000c¨\u0006\u001e"],
        m107d2 = ["Lcom/lagradost/cloudstream3/extractors/Slmaxed\$JsonResponse;", "", "status", "", "message", "type", "token", "result", "", "Lcom/lagradost/cloudstream3/extractors/Slmaxed\$Result;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getMessage", "()Ljava/lang/String;", "getResult", "()Ljava/util/Map;", "getStatus", "getToken", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class JsonResponse(
        @param:JsonProperty val status: String?,
        @param:JsonProperty val message: String?,
        @param:JsonProperty val type: String?,
        @param:JsonProperty val token: String?,
        @param:JsonProperty val result: Map<String, Result>?
    ) {
        operator fun component1(): String? {
            return status
        }

        operator fun component2(): String? {
            return message
        }

        operator fun component3(): String? {
            return type
        }

        operator fun component4(): String? {
            return token
        }

        operator fun component5(): Map<String, Result>? {
            return result
        }

        fun copy(
            @JsonProperty str: String?,
            @JsonProperty str2: String?,
            @JsonProperty str3: String?,
            @JsonProperty str4: String?,
            @JsonProperty map: Map<String, Result>?
        ): JsonResponse {
            return JsonResponse(str, str2, str3, str4, map)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is JsonResponse) {
                val jsonResponse = obj as JsonResponse
                return Intrinsics.areEqual(status, jsonResponse.status) && Intrinsics.areEqual(
                    message, jsonResponse.message
                ) && Intrinsics.areEqual(type, jsonResponse.type) && Intrinsics.areEqual(
                    token, jsonResponse.token
                ) && Intrinsics.areEqual(result, jsonResponse.result)
            }
            return false
        }

        override fun hashCode(): Int {
            val str = status
            val hashCode = (str?.hashCode() ?: 0) * 31
            val str2 = message
            val hashCode2 = (hashCode + (str2?.hashCode() ?: 0)) * 31
            val str3 = type
            val hashCode3 = (hashCode2 + (str3?.hashCode() ?: 0)) * 31
            val str4 = token
            val hashCode4 = (hashCode3 + (str4?.hashCode() ?: 0)) * 31
            val map = result
            return hashCode4 + (map?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "JsonResponse(status=" + status + ", message=" + message + ", type=" + type + ", token=" + token + ", result=" + result + ')'
        }

        @JvmOverloads
                /* synthetic */   constructor(
            str: String? = null,
            str2: String? = null,
            str3: String? = null,
            str4: String? = null,
            map: Map? = null,
            i: Int = 31,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) null else str,
            if (i and 2 != 0) null else str2,
            if (i and 4 != 0) null else str3,
            if (i and 8 != 0) null else str4,
            if (i and 16 != 0) null else map
        ) {
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                jsonResponse: JsonResponse,
                str: String?,
                str2: String?,
                str3: String?,
                str4: String?,
                map: Map?,
                i: Int,
                obj: Object?
            ): JsonResponse {
                var str = str
                var str2 = str2
                var str3 = str3
                var str4 = str4
                if (i and 1 != 0) {
                    str = jsonResponse.status
                }
                if (i and 2 != 0) {
                    str2 = jsonResponse.message
                }
                val str5 = str2
                if (i and 4 != 0) {
                    str3 = jsonResponse.type
                }
                val str6 = str3
                if (i and 8 != 0) {
                    str4 = jsonResponse.token
                }
                val str7 = str4
                var map2: Map<String, Result>? = map
                if (i and 16 != 0) {
                    map2 = jsonResponse.result
                }
                return jsonResponse.copy(str, str5, str6, str7, map2)
            }
        }
    }

    /* compiled from: Streamlare.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/extractors/Slmaxed\$Result;", "", Constants.ScionAnalytics.PARAM_LABEL, "", "file", "type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFile", "()Ljava/lang/String;", "getLabel", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Result(
        @param:JsonProperty val label: String?,
        @param:JsonProperty val file: String?,
        @param:JsonProperty val type: String?
    ) {
        operator fun component1(): String? {
            return label
        }

        operator fun component2(): String? {
            return file
        }

        operator fun component3(): String? {
            return type
        }

        fun copy(
            @JsonProperty str: String?,
            @JsonProperty str2: String?,
            @JsonProperty str3: String?
        ): Result {
            return Result(str, str2, str3)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Result) {
                val result = obj as Result
                return Intrinsics.areEqual(label, result.label) && Intrinsics.areEqual(
                    file, result.file
                ) && Intrinsics.areEqual(type, result.type)
            }
            return false
        }

        override fun hashCode(): Int {
            val str = label
            val hashCode = (str?.hashCode() ?: 0) * 31
            val str2 = file
            val hashCode2 = (hashCode + (str2?.hashCode() ?: 0)) * 31
            val str3 = type
            return hashCode2 + (str3?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "Result(label=" + label + ", file=" + file + ", type=" + type + ')'
        }

        @JvmOverloads
                /* synthetic */   constructor(
            str: String? = null,
            str2: String? = null,
            str3: String? = null,
            i: Int = 7,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) null else str,
            if (i and 2 != 0) null else str2,
            if (i and 4 != 0) null else str3
        ) {
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                result: Result,
                str: String?,
                str2: String?,
                str3: String?,
                i: Int,
                obj: Object?
            ): Result {
                var str = str
                var str2 = str2
                var str3 = str3
                if (i and 1 != 0) {
                    str = result.label
                }
                if (i and 2 != 0) {
                    str2 = result.file
                }
                if (i and 4 != 0) {
                    str3 = result.type
                }
                return result.copy(str, str2, str3)
            }
        }
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */ /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */ /* JADX WARN: Removed duplicated region for block: B:20:0x00f2  */ /* JADX WARN: Removed duplicated region for block: B:46:0x0181  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
        fun  /* synthetic */`getUrl$suspendImpl`(
            r26: Slmaxed?,
            r27: String?,
            r28: String?,
            r29: Continuation<*>?
        ): Any {
            /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.extractors.Slmaxed.getUrl\$suspendImpl(com.lagradost.cloudstream3.extractors.Slmaxed, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
        }
    }
}