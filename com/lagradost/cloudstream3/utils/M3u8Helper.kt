package com.lagradost.cloudstream3.utils

import java.util.ArrayList
import kotlin.jvm.internal.Intrinsics

/* compiled from: M3u8Helper.kt */
@Metadata(
    m108d1 = ["\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000 &2\u00020\u0001:\u0003&'(B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\r\u001a\u00020\u000cH\u0002J\"\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\nH\u0002J\u0010\u0010\u0012\u001a\u00020\u000c2\u0006\u0010\u0013\u001a\u00020\u000cH\u0002J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\u000c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000cH\u0002J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u000cH\u0002J#\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010 \u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010\u001c¢\u0006\u0002\u0010\"J\u0018\u0010#\u001a\u0004\u0018\u00010\u00182\u000c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\u0010\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"],
    m107d2 = ["Lcom/lagradost/cloudstream3/utils/M3u8Helper;", "", "()V", "ENCRYPTION_DETECTION_REGEX", "Lkotlin/text/Regex;", "ENCRYPTION_URL_IV_REGEX", "QUALITY_REGEX", "TS_EXTENSION_REGEX", "defaultIvGen", "", "", "absoluteExtensionDetermination", "", "url", "getDecrypter", "secretKey", "data", "iv", "getParentLink", ShareConstants.MEDIA_URI, "hlsYield", "Lcom/lagradost/cloudstream3/utils/M3u8Helper\$HlsDownloadData;", "qualities", "", "Lcom/lagradost/cloudstream3/utils/M3u8Helper\$M3u8Stream;", "startIndex", "", "isEncrypted", "", "m3u8Data", "isNotCompleteUrl", "m3u8Generation", "m3u8", "returnThis", "(Lcom/lagradost/cloudstream3/utils/M3u8Helper\$M3u8Stream;Ljava/lang/Boolean;)Ljava/util/List;", "selectBest", "toBytes16Big", "n", "Companion", "HlsDownloadData", "M3u8Stream", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class M3u8Helper {
    private val ENCRYPTION_DETECTION_REGEX: Regex = Regex("#EXT-X-KEY:METHOD=([^,]+),")
    private val ENCRYPTION_URL_IV_REGEX: Regex =
        Regex("#EXT-X-KEY:METHOD=([^,]+),URI=\"([^\"]+)\"(?:,IV=(.*))?")
    private val QUALITY_REGEX: Regex =
        Regex("#EXT-X-STREAM-INF:(?:(?:.*?(?:RESOLUTION=\\d+x(\\d+)).*?\\s+(.*))|(?:.*?\\s+(.*)))")
    private val TS_EXTENSION_REGEX: Regex = Regex("(.*\\.ts.*|.*\\.jpg.*|.*\\.html.*|.*\\.txt.*)")
    private val defaultIvGen: Iterator<ByteArray> =
        SequencesKt.sequence(`M3u8Helper$defaultIvGen$1`(this, null)).iterator()

    /* compiled from: M3u8Helper.kt */
    @Metadata(
        m108d1 = ["\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JU\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\t¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"],
        m107d2 = ["Lcom/lagradost/cloudstream3/utils/M3u8Helper\$Companion;", "", "()V", "generator", "Lcom/lagradost/cloudstream3/utils/M3u8Helper;", "generateM3u8", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "source", "", "streamUrl", "referer", "quality", "", "headers", "", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        fun generateM3u8(
            source: String,
            streamUrl: String,
            referer: String,
            num: Integer?,
            headers: Map<String?, String?>,
            name: String
        ): List<ExtractorLink> {
            Intrinsics.checkNotNullParameter(source, "source")
            Intrinsics.checkNotNullParameter(streamUrl, "streamUrl")
            Intrinsics.checkNotNullParameter(referer, "referer")
            Intrinsics.checkNotNullParameter(headers, "headers")
            Intrinsics.checkNotNullParameter(name, "name")
            val m3u8Generation: List<M3u8Stream> = M3u8Helper.Companion.generator.m3u8Generation(
                M3u8Stream(streamUrl, num, headers),
                null
            )
            val arrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(m3u8Generation, 10))
            for (m3u8Stream in m3u8Generation) {
                val streamUrl2 = m3u8Stream.streamUrl
                val quality: Integer? = m3u8Stream.getQuality()
                arrayList.add(
                    ExtractorLink(
                        source,
                        name,
                        streamUrl2,
                        referer,
                        if (quality != null) quality.intValue() else Qualities.Unknown.value,
                        true,
                        m3u8Stream.headers,
                        null,
                        128,
                        null
                    )
                )
            }
            return arrayList
        }

        companion object {
            @kotlin.jvm.JvmStatic
            fun  /* synthetic */`generateM3u8$default`(
                companion: M3u8Helper.Companion,
                str: String,
                str2: String,
                str3: String,
                num: Integer?,
                map: Map,
                str4: String?,
                i: Int,
                obj: Object?
            ): List {
                var num: Integer? = num
                if (i and 8 != 0) {
                    num = null
                }
                val num2: Integer? = num
                var map2: Map = map
                if (i and 16 != 0) {
                    map2 = MapsKt.emptyMap<Any, Any>()
                }
                return companion.generateM3u8(
                    str,
                    str2,
                    str3,
                    num2,
                    map2,
                    (if (i and 32 != 0) str else str4)!!
                )
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun absoluteExtensionDetermination(str: String?): String? {
        var `split$default`: List
        val str2 = StringsKt.`split$default`(
            StringsKt.`split$default`(
                str as CharSequence?,
                arrayOf("/"),
                false,
                0,
                6,
                null as Object?
            ).get(`split$default`.size() - 1) as CharSequence,
            arrayOf("?"),
            false,
            0,
            6,
            null as Object?
        ).get(0) as String
        if (StringsKt.`contains$default`(
                str2 as CharSequence,
                "." as CharSequence,
                false,
                2,
                null as Object?
            )
        ) {
            var `split$default2`: List? = StringsKt.`split$default`(
                str2 as CharSequence,
                arrayOf("."),
                false,
                0,
                6,
                null as Object?
            )
            if (`split$default2`.isEmpty()) {
                `split$default2` = null
            }
            val list: List? = `split$default2`
            return if (list != null) {
                CollectionsKt.last<Any>(list as List<Object?>?) as String?
            } else null
        }
        return null
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun toBytes16Big(i: Int): ByteArray {
        val bArr = ByteArray(16)
        for (i2 in 0..15) {
            bArr[i2] = (Math.max(0, (i / Math.pow(256.0, 15 - i2)) as Int) % 256) as Byte
        }
        return bArr
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun getDecrypter(bArr: ByteArray?, bArr2: ByteArray?, bArr3: ByteArray): ByteArray {
        var bArr3 = bArr3
        if (bArr3.size == 0) {
            bArr3 = defaultIvGen.next()
        }
        val cipher: Cipher = Cipher.getInstance("AES/CBC/PKCS5Padding")
        cipher.init(2, SecretKeySpec(bArr, "AES"), IvParameterSpec(bArr3))
        val doFinal: ByteArray = cipher.doFinal(bArr2)
        Intrinsics.checkNotNullExpressionValue(doFinal, "c.doFinal(data)")
        return doFinal
    }

    private fun isEncrypted(str: String): Boolean {
        val `find$default` = Regex.`find$default`(ENCRYPTION_DETECTION_REGEX, str, 0, 2, null)
        return if (`find$default` != null) {
            `find$default`.value.length() > 0 || !Intrinsics.areEqual(
                `find$default`.destructured.match.groupValues.get(1),
                "NONE"
            )
        } else false
    }

    /* compiled from: M3u8Helper.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000cJ\u0015\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J:\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\u000cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"],
        m107d2 = ["Lcom/lagradost/cloudstream3/utils/M3u8Helper\$M3u8Stream;", "", "streamUrl", "", "quality", "", "headers", "", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;)V", "getHeaders", "()Ljava/util/Map;", "getQuality", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStreamUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;)Lcom/lagradost/cloudstream3/utils/M3u8Helper\$M3u8Stream;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class M3u8Stream(streamUrl: String, num: Integer?, headers: Map<String?, String?>) {
        val headers: Map<String?, String?>
        private val quality: Integer?
        val streamUrl: String
        operator fun component1(): String {
            return streamUrl
        }

        operator fun component2(): Integer? {
            return quality
        }

        operator fun component3(): Map<String?, String?> {
            return headers
        }

        fun copy(streamUrl: String, num: Integer?, headers: Map<String?, String?>): M3u8Stream {
            Intrinsics.checkNotNullParameter(streamUrl, "streamUrl")
            Intrinsics.checkNotNullParameter(headers, "headers")
            return M3u8Stream(streamUrl, num, headers)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is M3u8Stream) {
                val m3u8Stream = obj as M3u8Stream
                return Intrinsics.areEqual(streamUrl, m3u8Stream.streamUrl) && Intrinsics.areEqual(
                    quality, m3u8Stream.quality
                ) && Intrinsics.areEqual(headers, m3u8Stream.headers)
            }
            return false
        }

        override fun hashCode(): Int {
            val hashCode = streamUrl.hashCode() * 31
            val num: Integer? = quality
            return (hashCode + if (num == null) 0 else num.hashCode()) * 31 + headers.hashCode()
        }

        override fun toString(): String {
            return "M3u8Stream(streamUrl=" + streamUrl + ", quality=" + quality + ", headers=" + headers + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(streamUrl, "streamUrl")
            Intrinsics.checkNotNullParameter(headers, "headers")
            this.streamUrl = streamUrl
            quality = num
            this.headers = headers
        }

        fun getQuality(): Integer? {
            return quality
        }

        /* synthetic */   constructor(
            str: String,
            num: Integer?,
            map: Map?,
            i: Int,
            defaultConstructorMarker: DefaultConstructorMarker?
        ) : this(
            str,
            if (i and 2 != 0) null else num,
            if (i and 4 != 0) MapsKt.emptyMap<Any, Any>() else map
        ) {
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                m3u8Stream: M3u8Stream,
                str: String,
                num: Integer?,
                map: Map,
                i: Int,
                obj: Object?
            ): M3u8Stream {
                var str = str
                var num: Integer? = num
                var map: Map = map
                if (i and 1 != 0) {
                    str = m3u8Stream.streamUrl
                }
                if (i and 2 != 0) {
                    num = m3u8Stream.quality
                }
                if (i and 4 != 0) {
                    map = m3u8Stream.headers
                }
                return m3u8Stream.copy(str, num, map)
            }
        }
    }

    private fun selectBest(list: List<M3u8Stream>): M3u8Stream {
        val arrayList = ArrayList()
        for (obj in CollectionsKt.sortedWith(list, object : Comparator() {
            // from class: com.lagradost.cloudstream3.utils.M3u8Helper$selectBest$$inlined$sortedBy$1
            @Override // java.util.Comparator
            fun compare(t: T, t2: T): Int {
                val m3u8Stream = t as M3u8Stream
                var i = 0
                val valueOf: Integer = Integer.valueOf(
                    if (m3u8Stream.getQuality() == null || m3u8Stream.getQuality()
                            .intValue() > 1080
                    ) 0 else m3u8Stream.getQuality().intValue()
                )
                val m3u8Stream2 = t2 as M3u8Stream
                if (m3u8Stream2.getQuality() != null && m3u8Stream2.getQuality()
                        .intValue() <= 1080
                ) {
                    i = m3u8Stream2.getQuality().intValue()
                }
                return ComparisonsKt.compareValues(valueOf, Integer.valueOf(i))
            }
        })) {
            if (CollectionsKt.contains(
                    CollectionsKt.listOf<Object>(
                        *arrayOf(
                            "m3u",
                            "m3u8"
                        ) as Array<Object>
                    ), absoluteExtensionDetermination((obj as M3u8Stream).streamUrl)
                )
            ) {
                arrayList.add(obj)
            }
        }
        return CollectionsKt.getOrNull(arrayList, 0) as M3u8Stream
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun getParentLink(str: String?): String {
        val mutableList: List = CollectionsKt.toMutableList(
            StringsKt.`split$default`(
                str as CharSequence?,
                arrayOf("/"),
                false,
                0,
                6,
                null as Object?
            ) as Collection?
        )
        CollectionsKt.removeLast(mutableList)
        return CollectionsKt.`joinToString$default`(
            mutableList,
            "/",
            null,
            null,
            0,
            null,
            null,
            62,
            null
        )
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun isNotCompleteUrl(str: String): Boolean {
        return if (StringsKt.`contains$default`(
                str as CharSequence,
                "https://" as CharSequence,
                false,
                2,
                null as Object?
            ) || StringsKt.`contains$default`(
                str as CharSequence,
                "http://" as CharSequence,
                false,
                2,
                null as Object?
            )
        ) false else true
    }

    fun m3u8Generation(m3u8: M3u8Stream?, bool: Boolean?): List<M3u8Stream> {
        Intrinsics.checkNotNullParameter(m3u8, "m3u8")
        return SequencesKt.toList(
            SequencesKt.sequence(
                `M3u8Helper$m3u8Generation$generate$1`(
                    this,
                    m3u8,
                    bool,
                    null
                )
            )
        )
    }

    /* compiled from: M3u8Helper.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"],
        m107d2 = ["Lcom/lagradost/cloudstream3/utils/M3u8Helper\$HlsDownloadData;", "", "bytes", "", "currentIndex", "", "totalTs", "errored", "", "([BIIZ)V", "getBytes", "()[B", "getCurrentIndex", "()I", "getErrored", "()Z", "getTotalTs", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class HlsDownloadData(bytes: ByteArray, i: Int, i2: Int, z: Boolean) {
        val bytes: ByteArray
        val currentIndex: Int
        val errored: Boolean
        val totalTs: Int
        operator fun component1(): ByteArray {
            return bytes
        }

        operator fun component2(): Int {
            return currentIndex
        }

        operator fun component3(): Int {
            return totalTs
        }

        operator fun component4(): Boolean {
            return errored
        }

        fun copy(bytes: ByteArray, i: Int, i2: Int, z: Boolean): HlsDownloadData {
            Intrinsics.checkNotNullParameter(bytes, "bytes")
            return HlsDownloadData(bytes, i, i2, z)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is HlsDownloadData) {
                val hlsDownloadData = obj as HlsDownloadData
                return Intrinsics.areEqual(
                    bytes,
                    hlsDownloadData.bytes
                ) && currentIndex == hlsDownloadData.currentIndex && totalTs == hlsDownloadData.totalTs && errored == hlsDownloadData.errored
            }
            return false
        }

        /* JADX WARN: Multi-variable type inference failed */
        override fun hashCode(): Int {
            val hashCode: Int = ((Arrays.hashCode(bytes) * 31 + currentIndex) * 31 + totalTs) * 31
            val z = errored
            var i: Int = z.toInt()
            if (z.toInt() != 0) {
                i = 1
            }
            return hashCode + i
        }

        override fun toString(): String {
            return "HlsDownloadData(bytes=" + Arrays.toString(bytes)
                .toString() + ", currentIndex=" + currentIndex.toString() + ", totalTs=" + totalTs.toString() + ", errored=" + errored + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(bytes, "bytes")
            this.bytes = bytes
            currentIndex = i
            totalTs = i2
            errored = z
        }

        /* synthetic */   constructor(
            bArr: ByteArray,
            i: Int,
            i2: Int,
            z: Boolean,
            i3: Int,
            defaultConstructorMarker: DefaultConstructorMarker?
        ) : this(bArr, i, i2, if (i3 and 8 != 0) false else z) {
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                hlsDownloadData: HlsDownloadData,
                bArr: ByteArray,
                i: Int,
                i2: Int,
                z: Boolean,
                i3: Int,
                obj: Object?
            ): HlsDownloadData {
                var bArr = bArr
                var i = i
                var i2 = i2
                var z = z
                if (i3 and 1 != 0) {
                    bArr = hlsDownloadData.bytes
                }
                if (i3 and 2 != 0) {
                    i = hlsDownloadData.currentIndex
                }
                if (i3 and 4 != 0) {
                    i2 = hlsDownloadData.totalTs
                }
                if (i3 and 8 != 0) {
                    z = hlsDownloadData.errored
                }
                return hlsDownloadData.copy(bArr, i, i2, z)
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0123, code lost:
        if (r5 == null) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Type inference failed for: r10v8, types: [T, byte[], java.lang.Object] */ /* JADX WARN: Type inference failed for: r12v14, types: [T, java.lang.String] */ /* JADX WARN: Type inference failed for: r12v6, types: [T, java.lang.String] */ /* JADX WARN: Type inference failed for: r6v0, types: [T, byte[]] */ /* JADX WARN: Type inference failed for: r6v1, types: [T, byte[]] */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun hlsYield(r16: List<M3u8Stream?>?, r17: Int): Iterator<HlsDownloadData> {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.utils.M3u8Helper.hlsYield(java.util.List, int):java.util.Iterator")
    }

    companion object {
        @kotlin.jvm.JvmField
        val Companion = Companion(null)
        private val generator = M3u8Helper()
        fun  /* synthetic */`getDecrypter$default`(
            m3u8Helper: M3u8Helper,
            bArr: ByteArray?,
            bArr2: ByteArray?,
            bArr3: ByteArray,
            i: Int,
            obj: Object?
        ): ByteArray {
            var bArr3 = bArr3
            if (i and 4 != 0) {
                bArr3 = "".getBytes(Charsets.UTF_8)
                Intrinsics.checkNotNullExpressionValue(
                    bArr3,
                    "this as java.lang.String).getBytes(charset)"
                )
            }
            return m3u8Helper.getDecrypter(bArr, bArr2, bArr3)
        }

        fun  /* synthetic */`hlsYield$default`(
            m3u8Helper: M3u8Helper,
            list: List?,
            i: Int,
            i2: Int,
            obj: Object?
        ): Iterator {
            var i = i
            if (i2 and 2 != 0) {
                i = 0
            }
            return m3u8Helper.hlsYield(list, i)
        }
    }
}