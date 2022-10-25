package com.lagradost.cloudstream3.extractors

import com.google.firebase.messaging.Constants
import java.util.List
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: StreamSB.kt */
@Metadata(
    m108d1 = ["\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0003\u001b\u001c\u001dB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J+\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000c\u0010\b\"\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"],
    m107d2 = ["Lcom/lagradost/cloudstream3/extractors/StreamSB;", "Lcom/lagradost/cloudstream3/utils/ExtractorApi;", "()V", "hexArray", "", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "requiresReferer", "", "getRequiresReferer", "()Z", "bytesToHex", "bytes", "", "getUrl", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "url", "referer", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Main", "StreamData", "Subs", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes3.dex */
open class StreamSB : ExtractorApi() {
    private val hexArray: CharArray

    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    val requiresReferer = false

    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    var name = "StreamSB"
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    open var mainUrl = "https://watchsb.com"
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

    init {
        val charArray: CharArray = "0123456789ABCDEF".toCharArray()
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()")
        hexArray = charArray
    }

    private fun bytesToHex(bArr: ByteArray): String {
        val cArr = CharArray(bArr.size * 2)
        val length = bArr.size
        for (i in 0 until length) {
            val i2: Int = bArr[i] and 255
            val i3: Int = i * 2
            val cArr2 = hexArray
            cArr[i3] = cArr2[i2 ushr 4]
            cArr[i3 + 1] = cArr2[i2 and 15]
        }
        return String(cArr)
    }

    /* compiled from: StreamSB.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000c\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"],
        m107d2 = ["Lcom/lagradost/cloudstream3/extractors/StreamSB\$Subs;", "", "file", "", Constants.ScionAnalytics.PARAM_LABEL, "(Ljava/lang/String;Ljava/lang/String;)V", "getFile", "()Ljava/lang/String;", "getLabel", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Subs(@JsonProperty("file") file: String, @JsonProperty("label") label: String) {
        val file: String
        val label: String
        operator fun component1(): String {
            return file
        }

        operator fun component2(): String {
            return label
        }

        fun copy(@JsonProperty("file") file: String, @JsonProperty("label") label: String): Subs {
            Intrinsics.checkNotNullParameter(file, "file")
            Intrinsics.checkNotNullParameter(label, "label")
            return Subs(file, label)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Subs) {
                val subs = obj as Subs
                return Intrinsics.areEqual(file, subs.file) && Intrinsics.areEqual(
                    label, subs.label
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return file.hashCode() * 31 + label.hashCode()
        }

        override fun toString(): String {
            return "Subs(file=" + file + ", label=" + label + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(file, "file")
            Intrinsics.checkNotNullParameter(label, "label")
            this.file = file
            this.label = label
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                subs: Subs,
                str: String,
                str2: String,
                i: Int,
                obj: Object?
            ): Subs {
                var str = str
                var str2 = str2
                if (i and 1 != 0) {
                    str = subs.file
                }
                if (i and 2 != 0) {
                    str2 = subs.label
                }
                return subs.copy(str, str2)
            }
        }
    }

    /* compiled from: StreamSB.kt */
    @Metadata(
        m108d1 = ["\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000c\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003Ja\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00032\b\b\u0003\u0010\u000c\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006'"],
        m107d2 = ["Lcom/lagradost/cloudstream3/extractors/StreamSB\$StreamData;", "", "file", "", "cdnImg", "hash", "subs", "", "Lcom/lagradost/cloudstream3/extractors/StreamSB\$Subs;", SessionDescription.ATTR_LENGTH, "id", "title", "backup", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackup", "()Ljava/lang/String;", "getCdnImg", "getFile", "getHash", "getId", "getLength", "getSubs", "()Ljava/util/List;", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class StreamData(
        @JsonProperty("file") file: String,
        @JsonProperty("cdn_img") cdnImg: String,
        @JsonProperty("hash") hash: String,
        @JsonProperty("subs") list: List<Subs>,
        @JsonProperty("length") length: String,
        @JsonProperty("id") id: String,
        @JsonProperty("title") title: String,
        @JsonProperty("backup") backup: String
    ) {
        val backup: String
        val cdnImg: String
        val file: String
        val hash: String

        /* renamed from: id */
        val id: String
        val length: String
        val subs: List<Subs>
        val title: String
        operator fun component1(): String {
            return file
        }

        operator fun component2(): String {
            return cdnImg
        }

        operator fun component3(): String {
            return hash
        }

        operator fun component4(): List<Subs> {
            return subs
        }

        operator fun component5(): String {
            return length
        }

        operator fun component6(): String {
            return id
        }

        operator fun component7(): String {
            return title
        }

        operator fun component8(): String {
            return backup
        }

        fun copy(
            @JsonProperty("file") file: String,
            @JsonProperty("cdn_img") cdnImg: String,
            @JsonProperty("hash") hash: String,
            @JsonProperty("subs") list: List<Subs>,
            @JsonProperty("length") length: String,
            @JsonProperty("id") id: String,
            @JsonProperty("title") title: String,
            @JsonProperty("backup") backup: String
        ): StreamData {
            Intrinsics.checkNotNullParameter(file, "file")
            Intrinsics.checkNotNullParameter(cdnImg, "cdnImg")
            Intrinsics.checkNotNullParameter(hash, "hash")
            Intrinsics.checkNotNullParameter(length, "length")
            Intrinsics.checkNotNullParameter(id, "id")
            Intrinsics.checkNotNullParameter(title, "title")
            Intrinsics.checkNotNullParameter(backup, "backup")
            return StreamData(file, cdnImg, hash, list, length, id, title, backup)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is StreamData) {
                val streamData = obj as StreamData
                return Intrinsics.areEqual(file, streamData.file) && Intrinsics.areEqual(
                    cdnImg, streamData.cdnImg
                ) && Intrinsics.areEqual(hash, streamData.hash) && Intrinsics.areEqual(
                    subs, streamData.subs
                ) && Intrinsics.areEqual(length, streamData.length) && Intrinsics.areEqual(
                    id, streamData.id
                ) && Intrinsics.areEqual(title, streamData.title) && Intrinsics.areEqual(
                    backup, streamData.backup
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val hashCode = ((file.hashCode() * 31 + cdnImg.hashCode()) * 31 + hash.hashCode()) * 31
            val list = subs
            return ((((hashCode + (list?.hashCode()
                ?: 0)) * 31 + length.hashCode()) * 31 + id.hashCode()) * 31 + title.hashCode()) * 31 + backup.hashCode()
        }

        override fun toString(): String {
            return "StreamData(file=" + file + ", cdnImg=" + cdnImg + ", hash=" + hash + ", subs=" + subs + ", length=" + length + ", id=" + id + ", title=" + title + ", backup=" + backup + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(file, "file")
            Intrinsics.checkNotNullParameter(cdnImg, "cdnImg")
            Intrinsics.checkNotNullParameter(hash, "hash")
            Intrinsics.checkNotNullParameter(length, "length")
            Intrinsics.checkNotNullParameter(id, "id")
            Intrinsics.checkNotNullParameter(title, "title")
            Intrinsics.checkNotNullParameter(backup, "backup")
            this.file = file
            this.cdnImg = cdnImg
            this.hash = hash
            subs = list
            this.length = length
            this.id = id
            this.title = title
            this.backup = backup
        }
    }

    /* compiled from: StreamSB.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000c\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"],
        m107d2 = ["Lcom/lagradost/cloudstream3/extractors/StreamSB\$Main;", "", "streamData", "Lcom/lagradost/cloudstream3/extractors/StreamSB\$StreamData;", "statusCode", "", "(Lcom/lagradost/cloudstream3/extractors/StreamSB\$StreamData;I)V", "getStatusCode", "()I", "getStreamData", "()Lcom/lagradost/cloudstream3/extractors/StreamSB\$StreamData;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Main(
        @JsonProperty("stream_data") streamData: StreamData,
        @JsonProperty("status_code") i: Int
    ) {
        val statusCode: Int
        val streamData: StreamData
        operator fun component1(): StreamData {
            return streamData
        }

        operator fun component2(): Int {
            return statusCode
        }

        fun copy(
            @JsonProperty("stream_data") streamData: StreamData,
            @JsonProperty("status_code") i: Int
        ): Main {
            Intrinsics.checkNotNullParameter(streamData, "streamData")
            return Main(streamData, i)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Main) {
                val main = obj as Main
                return Intrinsics.areEqual(
                    streamData,
                    main.streamData
                ) && statusCode == main.statusCode
            }
            return false
        }

        override fun hashCode(): Int {
            return streamData.hashCode() * 31 + statusCode
        }

        override fun toString(): String {
            return "Main(streamData=" + streamData + ", statusCode=" + statusCode + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(streamData, "streamData")
            this.streamData = streamData
            statusCode = i
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                main: Main,
                streamData: StreamData,
                i: Int,
                i2: Int,
                obj: Object?
            ): Main {
                var streamData = streamData
                var i = i
                if (i2 and 1 != 0) {
                    streamData = main.streamData
                }
                if (i2 and 2 != 0) {
                    i = main.statusCode
                }
                return main.copy(streamData, i)
            }
        }
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */ /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */ /* JADX WARN: Removed duplicated region for block: B:22:0x016b A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:23:0x016c  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
        fun  /* synthetic */`getUrl$suspendImpl`(
            r26: StreamSB?,
            r27: String?,
            r28: String?,
            r29: Continuation<*>?
        ): Any {
            /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.extractors.StreamSB.getUrl\$suspendImpl(com.lagradost.cloudstream3.extractors.StreamSB, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
        }
    }
}