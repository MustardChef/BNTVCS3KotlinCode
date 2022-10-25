package com.lagradost.cloudstream3.extractors

import java.util.List
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: Linkbox.kt */
@Metadata(
    m108d1 = ["\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0013\u0014\u0015B\u0005¢\u0006\u0002\u0010\u0002J)\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"],
    m107d2 = ["Lcom/lagradost/cloudstream3/extractors/Linkbox;", "Lcom/lagradost/cloudstream3/utils/ExtractorApi;", "()V", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "name", "getName", "requiresReferer", "", "getRequiresReferer", "()Z", "getUrl", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "url", "referer", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Data", "RList", "Responses", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class Linkbox : ExtractorApi() {
    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    val name = "Linkbox"

    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    val mainUrl = "https://www.linkbox.to"

    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    val requiresReferer = true

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|(1:(1:9)(2:30|31))(2:32|(1:34)(1:35))|10|11|12|13|(4:19|(2:22|20)|23|24)|25))|36|6|(0)(0)|10|11|12|13|(6:15|17|19|(1:20)|23|24)|25) */ /* JADX WARN: Code restructure failed: missing block: B:21:0x00d7, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d8, code lost:
        r0.printStackTrace();
        r13 = r23;
     */
    /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */ /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */ /* JADX WARN: Removed duplicated region for block: B:32:0x0107 A[LOOP:0: B:30:0x0101->B:32:0x0107, LOOP_END] */ /* JADX WARN: Type inference failed for: r0v16, types: [java.util.List] */
    @Override // com.lagradost.cloudstream3.utils.ExtractorApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun getUrl(
        r28: String?,
        r29: String?,
        r30: Continuation<in MutableList<out ExtractorLink?>?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.extractors.Linkbox.getUrl(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* compiled from: Linkbox.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000c\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"],
        m107d2 = ["Lcom/lagradost/cloudstream3/extractors/Linkbox\$RList;", "", "url", "", "resolution", "(Ljava/lang/String;Ljava/lang/String;)V", "getResolution", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class RList(@JsonProperty("url") url: String, @JsonProperty("resolution") str: String) {
        val resolution: String
        val url: String
        operator fun component1(): String {
            return url
        }

        operator fun component2(): String {
            return resolution
        }

        fun copy(@JsonProperty("url") url: String, @JsonProperty("resolution") str: String): RList {
            Intrinsics.checkNotNullParameter(url, "url")
            return RList(url, str)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is RList) {
                val rList = obj as RList
                return Intrinsics.areEqual(url, rList.url) && Intrinsics.areEqual(
                    resolution, rList.resolution
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val hashCode = url.hashCode() * 31
            val str = resolution
            return hashCode + (str?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "RList(url=" + url + ", resolution=" + resolution + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(url, "url")
            this.url = url
            resolution = str
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                rList: RList,
                str: String,
                str2: String,
                i: Int,
                obj: Object?
            ): RList {
                var str = str
                var str2 = str2
                if (i and 1 != 0) {
                    str = rList.url
                }
                if (i and 2 != 0) {
                    str2 = rList.resolution
                }
                return rList.copy(str, str2)
            }
        }
    }

    /* compiled from: Linkbox.kt */
    @Metadata(
        m108d1 = ["\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\u000c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"],
        m107d2 = ["Lcom/lagradost/cloudstream3/extractors/Linkbox\$Data;", "", "rList", "", "Lcom/lagradost/cloudstream3/extractors/Linkbox\$RList;", "(Ljava/util/List;)V", "getRList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Data(@param:JsonProperty("rList") val rList: List<RList>) {
        operator fun component1(): List<RList> {
            return rList
        }

        fun copy(@JsonProperty("rList") list: List<RList>): Data {
            return Data(list)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is Data && Intrinsics.areEqual(
                rList,
                (obj as Data).rList
            )
        }

        override fun hashCode(): Int {
            val list = rList ?: return 0
            return list.hashCode()
        }

        override fun toString(): String {
            return "Data(rList=" + rList + ')'
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(data: Data, list: List, i: Int, obj: Object?): Data {
                var list: List = list
                if (i and 1 != 0) {
                    list = data.rList
                }
                return data.copy(list)
            }
        }
    }

    /* compiled from: Linkbox.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"],
        m107d2 = ["Lcom/lagradost/cloudstream3/extractors/Linkbox\$Responses;", "", "data", "Lcom/lagradost/cloudstream3/extractors/Linkbox\$Data;", "(Lcom/lagradost/cloudstream3/extractors/Linkbox\$Data;)V", "getData", "()Lcom/lagradost/cloudstream3/extractors/Linkbox\$Data;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Responses(@param:JsonProperty("data") val data: Data) {
        operator fun component1(): Data {
            return data
        }

        fun copy(@JsonProperty("data") data: Data): Responses {
            return Responses(data)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is Responses && Intrinsics.areEqual(
                data,
                (obj as Responses).data
            )
        }

        override fun hashCode(): Int {
            val data = data ?: return 0
            return data.hashCode()
        }

        override fun toString(): String {
            return "Responses(data=" + data + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                responses: Responses,
                data: Data,
                i: Int,
                obj: Object?
            ): Responses {
                var data = data
                if (i and 1 != 0) {
                    data = responses.data
                }
                return responses.copy(data)
            }
        }
    }
}