package com.lagradost.cloudstream3.movieproviders

import android.util.Base64
import androidx.core.app.NotificationCompat
import com.fasterxml.jackson.core.type.TypeReference
import com.google.common.base.Ascii
import com.lagradost.cloudstream3.utils.AppUtils
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: SuperStream.kt */
@Metadata(
    m108d1 = ["\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u0001:\u0019<=>?@ABCDEFGHIJKLMNOPQRSTB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\u0011\u0010!\u001a\u00020\"H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010#J\u0019\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010'JI\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\b2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0,2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020.0,H\u0096@ø\u0001\u0000¢\u0006\u0002\u00101J\u0019\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010'J%\u00105\u001a\u0002H6\"\n\b\u0000\u00106\u0018\u0001*\u0002072\u0006\u00104\u001a\u00020\u0004H\u0082Hø\u0001\u0000¢\u0006\u0002\u0010'J\b\u00108\u001a\u00020\u0004H\u0002J\u001f\u00109\u001a\b\u0012\u0004\u0012\u00020;0:2\u0006\u00104\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010'R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\nR\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u000e\u0010\u0011\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006U"],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SuperStream;", "Lcom/lagradost/cloudstream3/MainAPI;", "()V", "apiUrl", "", "appId", "appKey", "hasChromecastSupport", "", "getHasChromecastSupport", "()Z", "hasMainPage", "getHasMainPage", "headers", "", "instantLinkLoading", "getInstantLinkLoading", "ip", "iv", SDKConstants.PARAM_KEY, "name", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "token", "getExpiryDate", "", "getMainPage", "Lcom/lagradost/cloudstream3/HomePageResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryApi", "Lcom/lagradost/nicehttp/NiceResponse;", "query", "queryApiParsed", ExifInterface.GPS_DIRECTION_TRUE, "", "randomToken", "search", "", "Lcom/lagradost/cloudstream3/SearchResponse;", "CipherUtils", "Data", "DataJSON", "HexDump", "LinkData", "LinkDataProp", "LinkList", "ListJSON", "LoadData", "MD5Util", "MainData", "MovieData", "MovieDataProp", "ParsedLinkData", "PostJSON", "PrivateSubtitleData", "ResponseTypes", "SeriesData", "SeriesDataProp", "SeriesEpisode", "SeriesLanguage", "SeriesSeasonProp", "SubtitleDataProp", "SubtitleList", "Subtitles", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class SuperStream : MainAPI() {
    private val apiUrl: String
    private val appId: String
    private val appKey: String

    /* renamed from: ip */
    private val f9973ip: String

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var name = "SuperStream"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasMainPage = true

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasChromecastSupport = true

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val supportedTypes: Set<TvType> = SetsKt.setOf<Object>(
        *arrayOf<TvType>(
            TvType.Movie,
            TvType.TvSeries,
            TvType.Anime,
            TvType.AnimeMovie
        ) as Array<Object>
    )

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val instantLinkLoading = true
    private val headers: Map<String, String> = MapsKt.mapOf(
        TuplesKt.m100to<Any, Any>("Platform", "android"),
        TuplesKt.m100to<Any, Any>("Accept", "charset=utf-8")
    )
    private val token = randomToken()

    /* renamed from: iv */
    private val f9974iv: String = MainAPIKt.base64Decode("d0VpcGhUbiE=")
    private val key: String = MainAPIKt.base64Decode("MTIzZDZjZWRmNjI2ZHk1NDIzM2FhMXc2")

    init {
        val base64Decode: String = MainAPIKt.base64Decode("aHR0cHM6Ly8xNTIuMzIuMTQ5LjE2MA==")
        f9973ip = base64Decode
        apiUrl = base64Decode + MainAPIKt.base64Decode("L2FwaS9hcGlfY2xpZW50L2luZGV4Lw==")
        appKey = MainAPIKt.base64Decode("bW92aWVib3g=")
        appId = MainAPIKt.base64Decode("Y29tLnRkby5zaG93Ym94")
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: SuperStream.kt */
    @Metadata(
        m108d1 = ["\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000c"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$ResponseTypes;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "toTvType", "Lcom/lagradost/cloudstream3/TvType;", "Series", "Movies", "Companion", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    /* loaded from: classes3.dex */
    enum class ResponseTypes(val value: Int) {
        Series(2), Movies(1);

        fun toTvType(): TvType {
            return if (this == Series) TvType.TvSeries else TvType.Movie
        }

        /* compiled from: SuperStream.kt */
        @Metadata(
            m108d1 = ["\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"],
            m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$ResponseTypes\$Companion;", "", "()V", "getResponseType", "Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$ResponseTypes;", "value", "", "(Ljava/lang/Integer;)Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$ResponseTypes;", "app_release"],
            m106k = 1,
            m105mv = [1, 6, 0],
            m103xi = 48
        ) /* loaded from: classes3.dex */
        class Companion private constructor() {
            /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

            fun getResponseType(num: Integer?): ResponseTypes {
                var responseTypes: ResponseTypes?
                val values = values()
                val length = values.size
                var i = 0
                while (true) {
                    if (i >= length) {
                        responseTypes = null
                        break
                    }
                    responseTypes = values[i]
                    if (num != null && responseTypes.value == num.intValue()) {
                        break
                    }
                    i++
                }
                return responseTypes ?: Movies
            }
        }

        companion object {
            val Companion = Companion(null)
        }
    }

    private fun randomToken(): String {
        return CollectionsKt.`joinToString$default`(
            IntRange(0, 31),
            "",
            null,
            null,
            0,
            null,
            `SuperStream$randomToken$1`.Companion.INSTANCE,
            30,
            null
        )
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: SuperStream.kt */
    @Metadata(
        m108d1 = ["\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J\"\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u0004J\u0010\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$CipherUtils;", "", "()V", "ALGORITHM", "", "TRANSFORMATION", "encrypt", "str", SDKConstants.PARAM_KEY, "iv", "getVerify", "str2", "str3", "md5", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class CipherUtils private constructor() {
        fun encrypt(str: String, key: String, iv: String): String? {
            Intrinsics.checkNotNullParameter(str, "str")
            Intrinsics.checkNotNullParameter(key, "key")
            Intrinsics.checkNotNullParameter(iv, "iv")
            return try {
                val cipher: Cipher = Cipher.getInstance(TRANSFORMATION)
                Intrinsics.checkNotNullExpressionValue(cipher, "getInstance(TRANSFORMATION)")
                val bArr = ByteArray(24)
                val bytes: ByteArray = key.getBytes(Charsets.UTF_8)
                Intrinsics.checkNotNullExpressionValue(
                    bytes,
                    "this as java.lang.String).getBytes(charset)"
                )
                var length = if (bytes.size <= 24) bytes.size else 24
                System.arraycopy(bytes, 0, bArr, 0, length)
                while (length < 24) {
                    bArr[length] = 0
                    length++
                }
                val bytes2: ByteArray = iv.getBytes(Charsets.UTF_8)
                Intrinsics.checkNotNullExpressionValue(
                    bytes2,
                    "this as java.lang.String).getBytes(charset)"
                )
                cipher.init(1, SecretKeySpec(bArr, ALGORITHM), IvParameterSpec(bytes2))
                val bytes3: ByteArray = str.getBytes(Charsets.UTF_8)
                Intrinsics.checkNotNullExpressionValue(
                    bytes3,
                    "this as java.lang.String).getBytes(charset)"
                )
                val encode: ByteArray = Base64.encode(cipher.doFinal(bytes3), 2)
                Intrinsics.checkNotNullExpressionValue(
                    encode,
                    "encode(cipher.doFinal(str.toByteArray()), 2)"
                )
                val UTF_8: Charset = StandardCharsets.UTF_8
                Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8")
                String(encode, UTF_8)
            } catch (e: Exception) {
                e.printStackTrace()
                null
            }
        }

        fun md5(str: String): String? {
            Intrinsics.checkNotNullParameter(str, "str")
            val md5 = MD5Util.INSTANCE.md5(str)
            if (md5 != null) {
                val lowerCase: String =
                    HexDump.`toHexString$default`(HexDump.INSTANCE, md5, 0, 0, 6, null)
                        .toLowerCase(Locale.ROOT)
                Intrinsics.checkNotNullExpressionValue(
                    lowerCase,
                    "this as java.lang.String).toLowerCase(Locale.ROOT)"
                )
                return lowerCase
            }
            return null
        }

        fun getVerify(str: String?, str2: String, str3: String): String? {
            Intrinsics.checkNotNullParameter(str2, "str2")
            Intrinsics.checkNotNullParameter(str3, "str3")
            return if (str != null) {
                md5(md5(str2) + str3 + str)
            } else null
        }

        companion object {
            private const val ALGORITHM = "DESede"
            val INSTANCE = CipherUtils()
            private const val TRANSFORMATION = "DESede/CBC/PKCS5Padding"
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: SuperStream.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000c"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$HexDump;", "", "()V", "HEX_DIGITS", "", "toHexString", "", "bArr", "", "i", "", "i2", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class HexDump private constructor() {
        fun toHexString(bArr: ByteArray): String {
            Intrinsics.checkNotNullParameter(bArr, "bArr")
            return `toHexString$default`(this, bArr, 0, 0, 6, null)
        }

        fun toHexString(bArr: ByteArray, i: Int): String {
            Intrinsics.checkNotNullParameter(bArr, "bArr")
            return `toHexString$default`(this, bArr, i, 0, 4, null)
        }

        fun toHexString(bArr: ByteArray, i: Int, i2: Int): String {
            var i = i
            Intrinsics.checkNotNullParameter(bArr, "bArr")
            val cArr = CharArray(i2 * 2)
            val i3 = i2 + i
            var i4 = 0
            while (i < i3) {
                val b = bArr[i]
                val i5 = i4 + 1
                val cArr2 = HEX_DIGITS
                cArr[i4] = cArr2[b ushr 4 and 15]
                i4 = i5 + 1
                cArr[i5] = cArr2[b and Ascii.f9766SI]
                i++
            }
            return String(cArr)
        }

        companion object {
            val INSTANCE = HexDump()
            private val HEX_DIGITS = charArrayOf(
                '0',
                '1',
                '2',
                '3',
                '4',
                '5',
                '6',
                '7',
                '8',
                '9',
                'A',
                'B',
                'C',
                'D',
                'E',
                'F'
            )

            fun  /* synthetic */`toHexString$default`(
                hexDump: HexDump,
                bArr: ByteArray,
                i: Int,
                i2: Int,
                i3: Int,
                obj: Object?
            ): String {
                var i = i
                var i2 = i2
                if (i3 and 2 != 0) {
                    i = 0
                }
                if (i3 and 4 != 0) {
                    i2 = bArr.size
                }
                return hexDump.toHexString(bArr, i, i2)
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: SuperStream.kt */
    @Metadata(
        m108d1 = ["\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$MD5Util;", "", "()V", "md5", "", "bArr", "str", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class MD5Util private constructor() {
        fun md5(str: String): ByteArray? {
            Intrinsics.checkNotNullParameter(str, "str")
            val bytes: ByteArray = str.getBytes(Charsets.UTF_8)
            Intrinsics.checkNotNullExpressionValue(
                bytes,
                "this as java.lang.String).getBytes(charset)"
            )
            return md5(bytes)
        }

        fun md5(bArr: ByteArray?): ByteArray? {
            return try {
                val messageDigest: MessageDigest = MessageDigest.getInstance("MD5")
                if (bArr == null) {
                    return null
                }
                messageDigest.update(bArr)
                messageDigest.digest()
            } catch (e: NoSuchAlgorithmException) {
                e.printStackTrace()
                null
            }
        }

        companion object {
            val INSTANCE = MD5Util()
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun queryApi(str: String, continuation: Continuation<in NiceResponse?>?): Object {
        val encrypt = CipherUtils.INSTANCE.encrypt(str, key, f9974iv)
        Intrinsics.checkNotNull(encrypt)
        val md5 = CipherUtils.INSTANCE.md5(appKey)
        Intrinsics.checkNotNull(md5)
        val bytes: ByteArray =
            ("{\"app_key\":\"" + md5 + "\",\"verify\":\"" + CipherUtils.INSTANCE.getVerify(
                encrypt,
                appKey,
                key
            ) + "\",\"encrypt_data\":\"" + encrypt + "\"}").getBytes(
                Charsets.UTF_8
            )
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)")
        val encode: ByteArray = Base64.encode(bytes, 0)
        Intrinsics.checkNotNullExpressionValue(
            encode,
            "encode(newBody.toByteArray(), Base64.DEFAULT)"
        )
        val str2 = String(encode, Charsets.UTF_8)
        return Requests.`post$default`(
            MainActivityKt.getApp(),
            apiUrl,
            headers,
            null,
            null,
            null,
            MapsKt.mapOf(
                TuplesKt.m100to<Any, Any>("data", str2),
                TuplesKt.m100to<Any, Any>("appid", "27"),
                TuplesKt.m100to<Any, Any>("platform", "android"),
                TuplesKt.m100to<Any, Any>(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, "129"),
                TuplesKt.m100to<Any, Any>("medium", "Website&token" + token)
            ),
            null,
            null,
            null,
            false,
            0,
            null,
            0L,
            null,
            false,
            continuation,
            32732,
            null
        )
    }

    private  /* synthetic */  fun <T> queryApiParsed(
        str: String,
        continuation: Continuation<in T?>
    ): Object {
        InlineMarker.mark(0)
        val queryApi: Object = queryApi(str, continuation)
        InlineMarker.mark(1)
        val mapper: ObjectMapper = Requests.Companion.getMapper()
        val text: String = (queryApi as NiceResponse).getText()
        Intrinsics.needClassReification()
        return mapper.readValue<T>(
            text,
            object :
                TypeReference<T>() { // from class: com.lagradost.cloudstream3.movieproviders.SuperStream$queryApiParsed$$inlined$parsed$1
            })
    }

    private val expiryDate: Long
        private get() = APIHolder.INSTANCE.unixTime + 43200

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: SuperStream.kt */
    @Metadata(
        m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jb\u0010\u001d\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000c\u0010\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011¨\u0006$"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$PostJSON;", "", "id", "", "title", "", "poster", "poster2", "boxType", "imdbRating", "quality_tag", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getBoxType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId", "getImdbRating", "()Ljava/lang/String;", "getPoster", "getPoster2", "getQuality_tag", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$PostJSON;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class PostJSON(
        @JsonProperty("id") num: Integer?,
        @JsonProperty("title") str: String?,
        @JsonProperty("poster") str2: String?,
        @JsonProperty("poster_2") str3: String?,
        @JsonProperty("box_type") num2: Integer?,
        @JsonProperty("imdb_rating") str4: String?,
        @JsonProperty("quality_tag") str5: String?
    ) {
        private val boxType: Integer?

        /* renamed from: id */
        private val f9979id: Integer?
        val imdbRating: String?
        val poster: String?
        val poster2: String?
        val quality_tag: String?
        val title: String?
        operator fun component1(): Integer? {
            return f9979id
        }

        operator fun component2(): String? {
            return title
        }

        operator fun component3(): String? {
            return poster
        }

        operator fun component4(): String? {
            return poster2
        }

        operator fun component5(): Integer? {
            return boxType
        }

        operator fun component6(): String? {
            return imdbRating
        }

        operator fun component7(): String? {
            return quality_tag
        }

        fun copy(
            @JsonProperty("id") num: Integer?,
            @JsonProperty("title") str: String?,
            @JsonProperty("poster") str2: String?,
            @JsonProperty("poster_2") str3: String?,
            @JsonProperty("box_type") num2: Integer?,
            @JsonProperty("imdb_rating") str4: String?,
            @JsonProperty("quality_tag") str5: String?
        ): PostJSON {
            return PostJSON(num, str, str2, str3, num2, str4, str5)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is PostJSON) {
                val postJSON = obj as PostJSON
                return Intrinsics.areEqual(f9979id, postJSON.f9979id) && Intrinsics.areEqual(
                    title, postJSON.title
                ) && Intrinsics.areEqual(poster, postJSON.poster) && Intrinsics.areEqual(
                    poster2, postJSON.poster2
                ) && Intrinsics.areEqual(boxType, postJSON.boxType) && Intrinsics.areEqual(
                    imdbRating, postJSON.imdbRating
                ) && Intrinsics.areEqual(
                    quality_tag, postJSON.quality_tag
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val num: Integer? = f9979id
            val hashCode = (if (num == null) 0 else num.hashCode()) * 31
            val str = title
            val hashCode2 = (hashCode + (str?.hashCode() ?: 0)) * 31
            val str2 = poster
            val hashCode3 = (hashCode2 + (str2?.hashCode() ?: 0)) * 31
            val str3 = poster2
            val hashCode4 = (hashCode3 + (str3?.hashCode() ?: 0)) * 31
            val num2: Integer? = boxType
            val hashCode5: Int = (hashCode4 + if (num2 == null) 0 else num2.hashCode()) * 31
            val str4 = imdbRating
            val hashCode6 = (hashCode5 + (str4?.hashCode() ?: 0)) * 31
            val str5 = quality_tag
            return hashCode6 + (str5?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "PostJSON(id=" + f9979id + ", title=" + title + ", poster=" + poster + ", poster2=" + poster2 + ", boxType=" + boxType + ", imdbRating=" + imdbRating + ", quality_tag=" + quality_tag + ')'
        }

        init {
            f9979id = num
            title = str
            poster = str2
            poster2 = str3
            boxType = num2
            imdbRating = str4
            quality_tag = str5
        }

        @JvmOverloads
                /* synthetic */   constructor(
            num: Integer? = null,
            str: String? = null,
            str2: String? = null,
            str3: String? = null,
            num2: Integer? = null,
            str4: String? = null,
            str5: String? = null,
            i: Int = 127,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) null else num,
            if (i and 2 != 0) null else str,
            if (i and 4 != 0) null else str2,
            if (i and 8 != 0) null else str3,
            if (i and 16 != 0) null else num2,
            if (i and 32 != 0) null else str4,
            if (i and 64 != 0) null else str5
        ) {
        }

        val id: Integer?
            get() = f9979id

        fun getBoxType(): Integer? {
            return boxType
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                postJSON: PostJSON,
                num: Integer?,
                str: String?,
                str2: String?,
                str3: String?,
                num2: Integer?,
                str4: String?,
                str5: String?,
                i: Int,
                obj: Object?
            ): PostJSON {
                var num: Integer? = num
                var str = str
                var str2 = str2
                var str3 = str3
                var num2: Integer? = num2
                var str4 = str4
                var str5 = str5
                if (i and 1 != 0) {
                    num = postJSON.f9979id
                }
                if (i and 2 != 0) {
                    str = postJSON.title
                }
                val str6 = str
                if (i and 4 != 0) {
                    str2 = postJSON.poster
                }
                val str7 = str2
                if (i and 8 != 0) {
                    str3 = postJSON.poster2
                }
                val str8 = str3
                if (i and 16 != 0) {
                    num2 = postJSON.boxType
                }
                val num3: Integer? = num2
                if (i and 32 != 0) {
                    str4 = postJSON.imdbRating
                }
                val str9 = str4
                if (i and 64 != 0) {
                    str5 = postJSON.quality_tag
                }
                return postJSON.copy(num, str6, str7, str8, num3, str9, str5)
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: SuperStream.kt */
    @Metadata(
        m108d1 = ["\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0003\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b¢\u0006\u0002\u0010\u000cJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0019\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bHÆ\u0003JX\u0010\u001b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0018\b\u0003\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR!\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006\""],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$ListJSON;", "", "code", "", "type", "", "name", "boxType", "list", "Ljava/util/ArrayList;", "Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$PostJSON;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/ArrayList;)V", "getBoxType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCode", "getList", "()Ljava/util/ArrayList;", "getName", "()Ljava/lang/String;", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/ArrayList;)Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$ListJSON;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class ListJSON(
        @JsonProperty("code") num: Integer?,
        @JsonProperty("type") str: String?,
        @JsonProperty("name") str2: String?,
        @JsonProperty("box_type") num2: Integer?,
        @JsonProperty("list") list: ArrayList<PostJSON?>
    ) {
        private val boxType: Integer?
        private val code: Integer?
        private val list: ArrayList<PostJSON>
        val name: String?
        val type: String?
        operator fun component1(): Integer? {
            return code
        }

        operator fun component2(): String? {
            return type
        }

        operator fun component3(): String? {
            return name
        }

        operator fun component4(): Integer? {
            return boxType
        }

        operator fun component5(): ArrayList<PostJSON> {
            return list
        }

        fun copy(
            @JsonProperty("code") num: Integer?,
            @JsonProperty("type") str: String?,
            @JsonProperty("name") str2: String?,
            @JsonProperty("box_type") num2: Integer?,
            @JsonProperty("list") list: ArrayList<PostJSON?>
        ): ListJSON {
            Intrinsics.checkNotNullParameter(list, "list")
            return ListJSON(num, str, str2, num2, list)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is ListJSON) {
                val listJSON = obj as ListJSON
                return Intrinsics.areEqual(code, listJSON.code) && Intrinsics.areEqual(
                    type, listJSON.type
                ) && Intrinsics.areEqual(name, listJSON.name) && Intrinsics.areEqual(
                    boxType, listJSON.boxType
                ) && Intrinsics.areEqual(list, listJSON.list)
            }
            return false
        }

        override fun hashCode(): Int {
            val num: Integer? = code
            val hashCode = (if (num == null) 0 else num.hashCode()) * 31
            val str = type
            val hashCode2 = (hashCode + (str?.hashCode() ?: 0)) * 31
            val str2 = name
            val hashCode3 = (hashCode2 + (str2?.hashCode() ?: 0)) * 31
            val num2: Integer? = boxType
            return (hashCode3 + if (num2 != null) num2.hashCode() else 0) * 31 + list.hashCode()
        }

        override fun toString(): String {
            return "ListJSON(code=" + code + ", type=" + type + ", name=" + name + ", boxType=" + boxType + ", list=" + list + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(list, "list")
            code = num
            type = str
            name = str2
            boxType = num2
            this.list = list
        }

        fun getCode(): Integer? {
            return code
        }

        fun getBoxType(): Integer? {
            return boxType
        }

        @JvmOverloads
                /* synthetic */   constructor(
            num: Integer? = null,
            str: String? = null,
            str2: String? = null,
            num2: Integer? = null,
            arrayList: ArrayList? = null,
            i: Int = 31,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) null else num,
            if (i and 2 != 0) null else str,
            if (i and 4 != 0) null else str2,
            if (i and 8 == 0) num2 else null,
            if (i and 16 != 0) ArrayList() else arrayList
        ) {
        }

        fun getList(): ArrayList<PostJSON> {
            return list
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                listJSON: ListJSON,
                num: Integer?,
                str: String?,
                str2: String?,
                num2: Integer?,
                arrayList: ArrayList,
                i: Int,
                obj: Object?
            ): ListJSON {
                var num: Integer? = num
                var str = str
                var str2 = str2
                var num2: Integer? = num2
                if (i and 1 != 0) {
                    num = listJSON.code
                }
                if (i and 2 != 0) {
                    str = listJSON.type
                }
                val str3 = str
                if (i and 4 != 0) {
                    str2 = listJSON.name
                }
                val str4 = str2
                if (i and 8 != 0) {
                    num2 = listJSON.boxType
                }
                val num3: Integer? = num2
                var arrayList2: ArrayList<PostJSON?> = arrayList
                if (i and 16 != 0) {
                    arrayList2 = listJSON.list
                }
                return listJSON.copy(num, str3, str4, num3, arrayList2)
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: SuperStream.kt */
    @Metadata(
        m108d1 = ["\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0018\b\u0003\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J#\u0010\n\u001a\u00020\u00002\u0018\b\u0003\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u000c2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$DataJSON;", "", "data", "Ljava/util/ArrayList;", "Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$ListJSON;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getData", "()Ljava/util/ArrayList;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class DataJSON(@JsonProperty("data") data: ArrayList<ListJSON?>) {
        private val data: ArrayList<ListJSON>
        operator fun component1(): ArrayList<ListJSON> {
            return data
        }

        fun copy(@JsonProperty("data") data: ArrayList<ListJSON?>): DataJSON {
            Intrinsics.checkNotNullParameter(data, "data")
            return DataJSON(data)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is DataJSON && Intrinsics.areEqual(
                data,
                (obj as DataJSON).data
            )
        }

        override fun hashCode(): Int {
            return data.hashCode()
        }

        override fun toString(): String {
            return "DataJSON(data=" + data + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(data, "data")
            this.data = data
        }

        @JvmOverloads
                /* synthetic */   constructor(
            arrayList: ArrayList? = null,
            i: Int = 1,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(if (i and 1 != 0) ArrayList() else arrayList) {
        }

        fun getData(): ArrayList<ListJSON> {
            return data
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                dataJSON: DataJSON,
                arrayList: ArrayList,
                i: Int,
                obj: Object?
            ): DataJSON {
                var arrayList: ArrayList = arrayList
                if (i and 1 != 0) {
                    arrayList = dataJSON.data
                }
                return dataJSON.copy(arrayList)
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */ /* JADX WARN: Removed duplicated region for block: B:21:0x00c1  */ /* JADX WARN: Type inference failed for: r5v2, types: [com.lagradost.cloudstream3.HomePageList] */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun getMainPage(r20: Continuation<in HomePageResponse?>?): Any? {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.SuperStream.getMainPage(kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: SuperStream.kt */
    @Metadata(
        m108d1 = ["\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\rJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003Jz\u0010#\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\u0010\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,J\t\u0010-\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\u000c\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0019\u0010\u000f¨\u0006."],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$Data;", "", "id", "", "boxType", "title", "", "posterOrg", "poster", "cats", "year", "imdbRating", "qualityTag", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getBoxType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCats", "()Ljava/lang/String;", "getId", "getImdbRating", "getPoster", "getPosterOrg", "getQualityTag", "getTitle", "getYear", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$Data;", "equals", "", "other", "hashCode", "toSearchResponse", "Lcom/lagradost/cloudstream3/MovieSearchResponse;", "api", "Lcom/lagradost/cloudstream3/MainAPI;", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Data(
        @JsonProperty("id") num: Integer?,
        @JsonProperty("box_type") num2: Integer?,
        @JsonProperty("title") str: String?,
        @JsonProperty("poster_org") str2: String?,
        @JsonProperty("poster") str3: String?,
        @JsonProperty("cats") str4: String?,
        @JsonProperty("year") num3: Integer?,
        @JsonProperty("imdb_rating") str5: String?,
        @JsonProperty("quality_tag") str6: String?
    ) {
        private val boxType: Integer?
        val cats: String?

        /* renamed from: id */
        private val f9975id: Integer?
        val imdbRating: String?
        val poster: String?
        val posterOrg: String?
        val qualityTag: String?
        val title: String?
        private val year: Integer?
        operator fun component1(): Integer? {
            return f9975id
        }

        operator fun component2(): Integer? {
            return boxType
        }

        operator fun component3(): String? {
            return title
        }

        operator fun component4(): String? {
            return posterOrg
        }

        operator fun component5(): String? {
            return poster
        }

        operator fun component6(): String? {
            return cats
        }

        operator fun component7(): Integer? {
            return year
        }

        operator fun component8(): String? {
            return imdbRating
        }

        operator fun component9(): String? {
            return qualityTag
        }

        fun copy(
            @JsonProperty("id") num: Integer?,
            @JsonProperty("box_type") num2: Integer?,
            @JsonProperty("title") str: String?,
            @JsonProperty("poster_org") str2: String?,
            @JsonProperty("poster") str3: String?,
            @JsonProperty("cats") str4: String?,
            @JsonProperty("year") num3: Integer?,
            @JsonProperty("imdb_rating") str5: String?,
            @JsonProperty("quality_tag") str6: String?
        ): Data {
            return Data(num, num2, str, str2, str3, str4, num3, str5, str6)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Data) {
                val data = obj as Data
                return Intrinsics.areEqual(f9975id, data.f9975id) && Intrinsics.areEqual(
                    boxType, data.boxType
                ) && Intrinsics.areEqual(title, data.title) && Intrinsics.areEqual(
                    posterOrg, data.posterOrg
                ) && Intrinsics.areEqual(poster, data.poster) && Intrinsics.areEqual(
                    cats, data.cats
                ) && Intrinsics.areEqual(year, data.year) && Intrinsics.areEqual(
                    imdbRating, data.imdbRating
                ) && Intrinsics.areEqual(
                    qualityTag, data.qualityTag
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val num: Integer? = f9975id
            val hashCode = (if (num == null) 0 else num.hashCode()) * 31
            val num2: Integer? = boxType
            val hashCode2: Int = (hashCode + if (num2 == null) 0 else num2.hashCode()) * 31
            val str = title
            val hashCode3 = (hashCode2 + (str?.hashCode() ?: 0)) * 31
            val str2 = posterOrg
            val hashCode4 = (hashCode3 + (str2?.hashCode() ?: 0)) * 31
            val str3 = poster
            val hashCode5 = (hashCode4 + (str3?.hashCode() ?: 0)) * 31
            val str4 = cats
            val hashCode6 = (hashCode5 + (str4?.hashCode() ?: 0)) * 31
            val num3: Integer? = year
            val hashCode7: Int = (hashCode6 + if (num3 == null) 0 else num3.hashCode()) * 31
            val str5 = imdbRating
            val hashCode8 = (hashCode7 + (str5?.hashCode() ?: 0)) * 31
            val str6 = qualityTag
            return hashCode8 + (str6?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "Data(id=" + f9975id + ", boxType=" + boxType + ", title=" + title + ", posterOrg=" + posterOrg + ", poster=" + poster + ", cats=" + cats + ", year=" + year + ", imdbRating=" + imdbRating + ", qualityTag=" + qualityTag + ')'
        }

        init {
            f9975id = num
            boxType = num2
            title = str
            posterOrg = str2
            poster = str3
            cats = str4
            year = num3
            imdbRating = str5
            qualityTag = str6
        }

        @JvmOverloads
                /* synthetic */   constructor(
            num: Integer? = null,
            num2: Integer? = null,
            str: String? = null,
            str2: String? = null,
            str3: String? = null,
            str4: String? = null,
            num3: Integer? = null,
            str5: String? = null,
            str6: String? = null,
            i: Int = 511,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) null else num,
            if (i and 2 != 0) null else num2,
            if (i and 4 != 0) null else str,
            if (i and 8 != 0) null else str2,
            if (i and 16 != 0) null else str3,
            if (i and 32 != 0) null else str4,
            if (i and 64 != 0) null else num3,
            if (i and 128 != 0) null else str5,
            if (i and 256 == 0) str6 else null
        ) {
        }

        val id: Integer?
            get() = f9975id

        fun getBoxType(): Integer? {
            return boxType
        }

        fun getYear(): Integer? {
            return year
        }

        fun toSearchResponse(api: MainAPI?): MovieSearchResponse? {
            Intrinsics.checkNotNullParameter(api, "api")
            var str = title
            if (str == null) {
                str = ""
            }
            val str2: String = str
            val appUtils = AppUtils.INSTANCE
            val num: Integer? = f9975id
            return if (num != null) {
                MainAPIKt.newMovieSearchResponse(
                    api,
                    str2,
                    appUtils.toJson(
                        LoadData(
                            num.intValue(),
                            boxType
                        )
                    ),
                    ResponseTypes.Companion.Companion.getResponseType(boxType).toTvType(),
                    false,
                    `SuperStream$Data$toSearchResponse$1`(this)
                )
            } else null
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: SuperStream.kt */
    @Metadata(
        m108d1 = ["\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0018\b\u0003\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J#\u0010\n\u001a\u00020\u00002\u0018\b\u0003\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u000c2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$MainData;", "", "data", "Ljava/util/ArrayList;", "Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$Data;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getData", "()Ljava/util/ArrayList;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class MainData(@JsonProperty("data") data: ArrayList<Data?>) {
        private val data: ArrayList<Data>
        operator fun component1(): ArrayList<Data> {
            return data
        }

        fun copy(@JsonProperty("data") data: ArrayList<Data?>): MainData {
            Intrinsics.checkNotNullParameter(data, "data")
            return MainData(data)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is MainData && Intrinsics.areEqual(
                data,
                (obj as MainData).data
            )
        }

        override fun hashCode(): Int {
            return data.hashCode()
        }

        override fun toString(): String {
            return "MainData(data=" + data + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(data, "data")
            this.data = data
        }

        @JvmOverloads
                /* synthetic */   constructor(
            arrayList: ArrayList? = null,
            i: Int = 1,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(if (i and 1 != 0) ArrayList() else arrayList) {
        }

        fun getData(): ArrayList<Data> {
            return data
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                mainData: MainData,
                arrayList: ArrayList,
                i: Int,
                obj: Object?
            ): MainData {
                var arrayList: ArrayList = arrayList
                if (i and 1 != 0) {
                    arrayList = mainData.data
                }
                return mainData.copy(arrayList)
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */ /* JADX WARN: Removed duplicated region for block: B:21:0x00ac  */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun search(
        r6: String?,
        r7: Continuation<in MutableList<out SearchResponse?>?>?
    ): Any {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.lagradost.cloudstream3.movieproviders.SuperStream$search$1
            if (r0 == 0) goto L14
            r0 = r7
            com.lagradost.cloudstream3.movieproviders.SuperStream$search$1 r0 = (com.lagradost.cloudstream3.movieproviders.SuperStream$search$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            com.lagradost.cloudstream3.movieproviders.SuperStream$search$1 r0 = new com.lagradost.cloudstream3.movieproviders.SuperStream$search$1
            r0.<init>(r5, r7)
        L19:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.L$0
            com.lagradost.cloudstream3.movieproviders.SuperStream r6 = (com.lagradost.cloudstream3.movieproviders.SuperStream) r6
            kotlin.ResultKt.throwOnFailure(r7)
            goto L7c
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "{\"childmode\":\""
            r2.append(r4)
            r2.append(r7)
            java.lang.String r7 = "\",\"app_version\":\"11.5\",\"appid\":\""
            r2.append(r7)
            java.lang.String r7 = r5.appId
            r2.append(r7)
            java.lang.String r7 = "\",\"module\":\"Search3\",\"channel\":\"Website\",\"page\":\"1\",\"lang\":\"en\",\"type\":\"all\",\"keyword\":\""
            r2.append(r7)
            r2.append(r6)
            java.lang.String r6 = "\",\"pagelimit\":\"20\",\"expired_date\":\""
            r2.append(r6)
            long r6 = r5.getExpiryDate()
            r2.append(r6)
            java.lang.String r6 = "\",\"platform\":\"android\"}"
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            com.lagradost.cloudstream3.utils.AppUtils r7 = com.lagradost.cloudstream3.utils.AppUtils.INSTANCE
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r7 = r5.queryApi(r6, r0)
            if (r7 != r1) goto L7b
            return r1
        L7b:
            r6 = r5
        L7c:
            com.lagradost.nicehttp.NiceResponse r7 = (com.lagradost.nicehttp.NiceResponse) r7
            java.lang.String r7 = r7.getText()
            com.fasterxml.jackson.databind.json.JsonMapper r0 = com.lagradost.cloudstream3.MainAPIKt.getMapper()
            com.fasterxml.jackson.databind.ObjectMapper r0 = (com.fasterxml.jackson.databind.ObjectMapper) r0
            com.lagradost.cloudstream3.movieproviders.SuperStream$search$$inlined$parseJson$1 r1 = new com.lagradost.cloudstream3.movieproviders.SuperStream$search$$inlined$parseJson$1
            r1.<init>()
            com.fasterxml.jackson.core.type.TypeReference r1 = (com.fasterxml.jackson.core.type.TypeReference) r1
            java.lang.Object r7 = r0.readValue(r7, r1)
            com.lagradost.cloudstream3.movieproviders.SuperStream$MainData r7 = (com.lagradost.cloudstream3.movieproviders.SuperStream.MainData) r7
            java.util.ArrayList r7 = r7.getData()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r7 = r7.iterator()
        La6:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto Lbf
            java.lang.Object r1 = r7.next()
            com.lagradost.cloudstream3.movieproviders.SuperStream$Data r1 = (com.lagradost.cloudstream3.movieproviders.SuperStream.Data) r1
            r2 = r6
            com.lagradost.cloudstream3.MainAPI r2 = (com.lagradost.cloudstream3.MainAPI) r2
            com.lagradost.cloudstream3.MovieSearchResponse r1 = r1.toSearchResponse(r2)
            if (r1 == 0) goto La6
            r0.add(r1)
            goto La6
        Lbf:
            java.util.List r0 = (java.util.List) r0
            return r0
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.SuperStream.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: SuperStream.kt */
    @Metadata(
        m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000c\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$LoadData;", "", "id", "", "type", "(ILjava/lang/Integer;)V", "getId", "()I", "getType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(ILjava/lang/Integer;)Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$LoadData;", "equals", "", "other", "hashCode", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class LoadData(/* renamed from: id */
        val id: Int, num: Integer?
    ) {
        private val type: Integer?
        operator fun component1(): Int {
            return id
        }

        operator fun component2(): Integer? {
            return type
        }

        fun copy(i: Int, num: Integer?): LoadData {
            return LoadData(i, num)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is LoadData) {
                val loadData = obj as LoadData
                return id == loadData.id && Intrinsics.areEqual(type, loadData.type)
            }
            return false
        }

        override fun hashCode(): Int {
            val i = id * 31
            val num: Integer? = type
            return i + if (num == null) 0 else num.hashCode()
        }

        override fun toString(): String {
            return "LoadData(id=" + id + ", type=" + type + ')'
        }

        init {
            type = num
        }

        fun getType(): Integer? {
            return type
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                loadData: LoadData,
                i: Int,
                num: Integer?,
                i2: Int,
                obj: Object?
            ): LoadData {
                var i = i
                var num: Integer? = num
                if (i2 and 1 != 0) {
                    i = loadData.id
                }
                if (i2 and 2 != 0) {
                    num = loadData.type
                }
                return loadData.copy(i, num)
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: SuperStream.kt */
    @Metadata(
        m108d1 = ["\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0091\u0002\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0003\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0002\u0010\u001cJ\u0010\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u000f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u009a\u0002\u0010M\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aHÆ\u0001¢\u0006\u0002\u0010NJ\u0013\u0010O\u001a\u00020P2\b\u0010Q\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010R\u001a\u00020\u0003HÖ\u0001J\t\u0010S\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000c\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010!\u001a\u0004\b&\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010!\u001a\u0004\b/\u0010 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010!\u001a\u0004\b1\u0010 R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010!\u001a\u0004\b2\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001eR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001eR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010!\u001a\u0004\b6\u0010 ¨\u0006T"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$MovieData;", "", "id", "", "title", "", "director", "writer", "actors", "runtime", "poster", "description", "cats", "year", "imdbId", "imdbRating", "trailer", "released", "contentRating", "tmdbId", "tomatoMeter", "posterOrg", "trailerUrl", "imdbLink", "boxType", "recommend", "", "Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$Data;", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V", "getActors", "()Ljava/lang/String;", "getBoxType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCats", "getContentRating", "getDescription", "getDirector", "getId", "getImdbId", "getImdbLink", "getImdbRating", "getPoster", "getPosterOrg", "getRecommend", "()Ljava/util/List;", "getReleased", "getRuntime", "getTitle", "getTmdbId", "getTomatoMeter", "getTrailer", "getTrailerUrl", "getWriter", "getYear", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$MovieData;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class MovieData(
        @JsonProperty("id") num: Integer,
        @JsonProperty("title") str: String,
        @JsonProperty("director") str2: String,
        @JsonProperty("writer") str3: String,
        @JsonProperty("actors") str4: String,
        @JsonProperty("runtime") num2: Integer,
        @JsonProperty("poster") str5: String,
        @JsonProperty("description") str6: String,
        @JsonProperty("cats") str7: String,
        @JsonProperty("year") num3: Integer,
        @JsonProperty("imdb_id") str8: String,
        @JsonProperty("imdb_rating") str9: String,
        @JsonProperty("trailer") str10: String,
        @JsonProperty("released") str11: String,
        @JsonProperty("content_rating") str12: String,
        @JsonProperty("tmdb_id") num4: Integer,
        @JsonProperty("tomato_meter") num5: Integer,
        @JsonProperty("poster_org") str13: String,
        @JsonProperty("trailer_url") str14: String,
        @JsonProperty("imdb_link") str15: String,
        @JsonProperty("box_type") num6: Integer,
        @JsonProperty("recommend") recommend: List<Data>
    ) {
        val actors: String
        private val boxType: Integer
        val cats: String
        val contentRating: String
        val description: String
        val director: String

        /* renamed from: id */
        private val f9978id: Integer
        val imdbId: String
        val imdbLink: String
        val imdbRating: String
        val poster: String
        val posterOrg: String
        val recommend: List<Data>
        val released: String
        private val runtime: Integer
        val title: String
        private val tmdbId: Integer
        private val tomatoMeter: Integer
        val trailer: String
        val trailerUrl: String
        val writer: String
        private val year: Integer
        operator fun component1(): Integer {
            return f9978id
        }

        operator fun component10(): Integer {
            return year
        }

        operator fun component11(): String {
            return imdbId
        }

        operator fun component12(): String {
            return imdbRating
        }

        operator fun component13(): String {
            return trailer
        }

        operator fun component14(): String {
            return released
        }

        operator fun component15(): String {
            return contentRating
        }

        operator fun component16(): Integer {
            return tmdbId
        }

        operator fun component17(): Integer {
            return tomatoMeter
        }

        operator fun component18(): String {
            return posterOrg
        }

        operator fun component19(): String {
            return trailerUrl
        }

        operator fun component2(): String {
            return title
        }

        operator fun component20(): String {
            return imdbLink
        }

        operator fun component21(): Integer {
            return boxType
        }

        operator fun component22(): List<Data> {
            return recommend
        }

        operator fun component3(): String {
            return director
        }

        operator fun component4(): String {
            return writer
        }

        operator fun component5(): String {
            return actors
        }

        operator fun component6(): Integer {
            return runtime
        }

        operator fun component7(): String {
            return poster
        }

        operator fun component8(): String {
            return description
        }

        operator fun component9(): String {
            return cats
        }

        fun copy(
            @JsonProperty("id") num: Integer,
            @JsonProperty("title") str: String,
            @JsonProperty("director") str2: String,
            @JsonProperty("writer") str3: String,
            @JsonProperty("actors") str4: String,
            @JsonProperty("runtime") num2: Integer,
            @JsonProperty("poster") str5: String,
            @JsonProperty("description") str6: String,
            @JsonProperty("cats") str7: String,
            @JsonProperty("year") num3: Integer,
            @JsonProperty("imdb_id") str8: String,
            @JsonProperty("imdb_rating") str9: String,
            @JsonProperty("trailer") str10: String,
            @JsonProperty("released") str11: String,
            @JsonProperty("content_rating") str12: String,
            @JsonProperty("tmdb_id") num4: Integer,
            @JsonProperty("tomato_meter") num5: Integer,
            @JsonProperty("poster_org") str13: String,
            @JsonProperty("trailer_url") str14: String,
            @JsonProperty("imdb_link") str15: String,
            @JsonProperty("box_type") num6: Integer,
            @JsonProperty("recommend") recommend: List<Data>
        ): MovieData {
            Intrinsics.checkNotNullParameter(recommend, "recommend")
            return MovieData(
                num,
                str,
                str2,
                str3,
                str4,
                num2,
                str5,
                str6,
                str7,
                num3,
                str8,
                str9,
                str10,
                str11,
                str12,
                num4,
                num5,
                str13,
                str14,
                str15,
                num6,
                recommend
            )
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is MovieData) {
                val movieData = obj as MovieData
                return Intrinsics.areEqual(f9978id, movieData.f9978id) && Intrinsics.areEqual(
                    title, movieData.title
                ) && Intrinsics.areEqual(director, movieData.director) && Intrinsics.areEqual(
                    writer, movieData.writer
                ) && Intrinsics.areEqual(actors, movieData.actors) && Intrinsics.areEqual(
                    runtime, movieData.runtime
                ) && Intrinsics.areEqual(poster, movieData.poster) && Intrinsics.areEqual(
                    description, movieData.description
                ) && Intrinsics.areEqual(
                    cats, movieData.cats
                ) && Intrinsics.areEqual(year, movieData.year) && Intrinsics.areEqual(
                    imdbId, movieData.imdbId
                ) && Intrinsics.areEqual(imdbRating, movieData.imdbRating) && Intrinsics.areEqual(
                    trailer, movieData.trailer
                ) && Intrinsics.areEqual(released, movieData.released) && Intrinsics.areEqual(
                    contentRating, movieData.contentRating
                ) && Intrinsics.areEqual(
                    tmdbId, movieData.tmdbId
                ) && Intrinsics.areEqual(tomatoMeter, movieData.tomatoMeter) && Intrinsics.areEqual(
                    posterOrg, movieData.posterOrg
                ) && Intrinsics.areEqual(
                    trailerUrl, movieData.trailerUrl
                ) && Intrinsics.areEqual(
                    imdbLink, movieData.imdbLink
                ) && Intrinsics.areEqual(boxType, movieData.boxType) && Intrinsics.areEqual(
                    recommend, movieData.recommend
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val num: Integer = f9978id
            val hashCode = (if (num == null) 0 else num.hashCode()) * 31
            val str = title
            val hashCode2 = (hashCode + (str?.hashCode() ?: 0)) * 31
            val str2 = director
            val hashCode3 = (hashCode2 + (str2?.hashCode() ?: 0)) * 31
            val str3 = writer
            val hashCode4 = (hashCode3 + (str3?.hashCode() ?: 0)) * 31
            val str4 = actors
            val hashCode5 = (hashCode4 + (str4?.hashCode() ?: 0)) * 31
            val num2: Integer = runtime
            val hashCode6: Int = (hashCode5 + if (num2 == null) 0 else num2.hashCode()) * 31
            val str5 = poster
            val hashCode7 = (hashCode6 + (str5?.hashCode() ?: 0)) * 31
            val str6 = description
            val hashCode8 = (hashCode7 + (str6?.hashCode() ?: 0)) * 31
            val str7 = cats
            val hashCode9 = (hashCode8 + (str7?.hashCode() ?: 0)) * 31
            val num3: Integer = year
            val hashCode10: Int = (hashCode9 + if (num3 == null) 0 else num3.hashCode()) * 31
            val str8 = imdbId
            val hashCode11 = (hashCode10 + (str8?.hashCode() ?: 0)) * 31
            val str9 = imdbRating
            val hashCode12 = (hashCode11 + (str9?.hashCode() ?: 0)) * 31
            val str10 = trailer
            val hashCode13 = (hashCode12 + (str10?.hashCode() ?: 0)) * 31
            val str11 = released
            val hashCode14 = (hashCode13 + (str11?.hashCode() ?: 0)) * 31
            val str12 = contentRating
            val hashCode15 = (hashCode14 + (str12?.hashCode() ?: 0)) * 31
            val num4: Integer = tmdbId
            val hashCode16: Int = (hashCode15 + if (num4 == null) 0 else num4.hashCode()) * 31
            val num5: Integer = tomatoMeter
            val hashCode17: Int = (hashCode16 + if (num5 == null) 0 else num5.hashCode()) * 31
            val str13 = posterOrg
            val hashCode18 = (hashCode17 + (str13?.hashCode() ?: 0)) * 31
            val str14 = trailerUrl
            val hashCode19 = (hashCode18 + (str14?.hashCode() ?: 0)) * 31
            val str15 = imdbLink
            val hashCode20 = (hashCode19 + (str15?.hashCode() ?: 0)) * 31
            val num6: Integer = boxType
            return (hashCode20 + if (num6 != null) num6.hashCode() else 0) * 31 + recommend.hashCode()
        }

        override fun toString(): String {
            return "MovieData(id=" + f9978id + ", title=" + title + ", director=" + director + ", writer=" + writer + ", actors=" + actors + ", runtime=" + runtime + ", poster=" + poster + ", description=" + description + ", cats=" + cats + ", year=" + year + ", imdbId=" + imdbId + ", imdbRating=" + imdbRating + ", trailer=" + trailer + ", released=" + released + ", contentRating=" + contentRating + ", tmdbId=" + tmdbId + ", tomatoMeter=" + tomatoMeter + ", posterOrg=" + posterOrg + ", trailerUrl=" + trailerUrl + ", imdbLink=" + imdbLink + ", boxType=" + boxType + ", recommend=" + recommend + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(recommend, "recommend")
            f9978id = num
            title = str
            director = str2
            writer = str3
            actors = str4
            runtime = num2
            poster = str5
            description = str6
            cats = str7
            year = num3
            imdbId = str8
            imdbRating = str9
            trailer = str10
            released = str11
            contentRating = str12
            tmdbId = num4
            tomatoMeter = num5
            posterOrg = str13
            trailerUrl = str14
            imdbLink = str15
            boxType = num6
            this.recommend = recommend
        }

        val id: Integer
            get() = f9978id

        fun getRuntime(): Integer {
            return runtime
        }

        fun getYear(): Integer {
            return year
        }

        fun getTmdbId(): Integer {
            return tmdbId
        }

        fun getTomatoMeter(): Integer {
            return tomatoMeter
        }

        fun getBoxType(): Integer {
            return boxType
        }

        @JvmOverloads
                /* synthetic */   constructor(
            num: Integer? = null,
            str: String? = null,
            str2: String? = null,
            str3: String? = null,
            str4: String? = null,
            num2: Integer? = null,
            str5: String? = null,
            str6: String? = null,
            str7: String? = null,
            num3: Integer? = null,
            str8: String? = null,
            str9: String? = null,
            str10: String? = null,
            str11: String? = null,
            str12: String? = null,
            num4: Integer? = null,
            num5: Integer? = null,
            str13: String? = null,
            str14: String? = null,
            str15: String? = null,
            num6: Integer? = null,
            list: List? = null,
            i: Int = 4194303,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) null else num,
            if (i and 2 != 0) null else str,
            if (i and 4 != 0) null else str2,
            if (i and 8 != 0) null else str3,
            if (i and 16 != 0) null else str4,
            if (i and 32 != 0) null else num2,
            if (i and 64 != 0) null else str5,
            if (i and 128 != 0) null else str6,
            if (i and 256 != 0) null else str7,
            if (i and 512 != 0) null else num3,
            if (i and 1024 != 0) null else str8,
            if (i and 2048 != 0) null else str9,
            if (i and 4096 != 0) null else str10,
            if (i and 8192 != 0) null else str11,
            if (i and 16384 != 0) null else str12,
            if (i and 32768 != 0) null else num4,
            if (i and 65536 != 0) null else num5,
            if (i and 131072 != 0) null else str13,
            if (i and 262144 != 0) null else str14,
            if (i and 524288 != 0) null else str15,
            if (i and 1048576 != 0) null else num6,
            if (i and 2097152 != 0) CollectionsKt.emptyList<Any>() else list
        ) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: SuperStream.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$MovieDataProp;", "", "data", "Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$MovieData;", "(Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$MovieData;)V", "getData", "()Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$MovieData;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class MovieDataProp {
        val data: MovieData?
        operator fun component1(): MovieData? {
            return data
        }

        fun copy(@JsonProperty("data") movieData: MovieData?): MovieDataProp {
            return MovieDataProp(movieData)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is MovieDataProp && Intrinsics.areEqual(
                data,
                (obj as MovieDataProp).data
            )
        }

        override fun hashCode(): Int {
            val movieData = data ?: return 0
            return movieData.hashCode()
        }

        override fun toString(): String {
            return "MovieDataProp(data=" + data + ')'
        }

        constructor(@JsonProperty("data") movieData: MovieData?) {
            data = movieData
        }

        @JvmOverloads
                /* synthetic */   constructor(
            movieData: MovieData? = null,
            i: Int = 1,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) {
            val movieDataProp: MovieDataProp
            val movieData2: MovieData?
            if (i and 1 != 0) {
                movieData2 = MovieData(
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    4194303,
                    null
                )
                movieDataProp = this
            } else {
                movieDataProp = this
                movieData2 = movieData
            }
            MovieDataProp(movieData2)
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                movieDataProp: MovieDataProp,
                movieData: MovieData?,
                i: Int,
                obj: Object?
            ): MovieDataProp {
                var movieData = movieData
                if (i and 1 != 0) {
                    movieData = movieDataProp.data
                }
                return movieDataProp.copy(movieData)
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: SuperStream.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0013\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$SeriesDataProp;", "", "code", "", NotificationCompat.CATEGORY_MESSAGE, "", "data", "Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$SeriesData;", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$SeriesData;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getData", "()Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$SeriesData;", "getMsg", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$SeriesData;)Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$SeriesDataProp;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class SeriesDataProp {
        private val code: Integer?
        val data: SeriesData?
        val msg: String?
        operator fun component1(): Integer? {
            return code
        }

        operator fun component2(): String? {
            return msg
        }

        operator fun component3(): SeriesData? {
            return data
        }

        fun copy(
            @JsonProperty("code") num: Integer?,
            @JsonProperty("msg") str: String?,
            @JsonProperty("data") seriesData: SeriesData?
        ): SeriesDataProp {
            return SeriesDataProp(num, str, seriesData)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is SeriesDataProp) {
                val seriesDataProp = obj as SeriesDataProp
                return Intrinsics.areEqual(code, seriesDataProp.code) && Intrinsics.areEqual(
                    msg, seriesDataProp.msg
                ) && Intrinsics.areEqual(data, seriesDataProp.data)
            }
            return false
        }

        override fun hashCode(): Int {
            val num: Integer? = code
            val hashCode = (if (num == null) 0 else num.hashCode()) * 31
            val str = msg
            val hashCode2 = (hashCode + (str?.hashCode() ?: 0)) * 31
            val seriesData = data
            return hashCode2 + (seriesData?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "SeriesDataProp(code=" + code + ", msg=" + msg + ", data=" + data + ')'
        }

        constructor(
            @JsonProperty("code") num: Integer?,
            @JsonProperty("msg") str: String?,
            @JsonProperty("data") seriesData: SeriesData?
        ) {
            code = num
            msg = str
            data = seriesData
        }

        fun getCode(): Integer? {
            return code
        }

        @JvmOverloads
                /* synthetic */   constructor(
            num: Integer? = null,
            str: String? = null,
            seriesData: SeriesData? = null,
            i: Int = 7,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) {
            val seriesDataProp: SeriesDataProp
            val seriesData2: SeriesData?
            val num2: Integer? = if (i and 1 != 0) null else num
            val str2 = if (i and 2 == 0) str else null
            if (i and 4 != 0) {
                seriesData2 = SeriesData(
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    -1,
                    33554431,
                    null
                )
                seriesDataProp = this
            } else {
                seriesDataProp = this
                seriesData2 = seriesData
            }
            SeriesDataProp(num2, str2, seriesData2)
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                seriesDataProp: SeriesDataProp,
                num: Integer?,
                str: String?,
                seriesData: SeriesData?,
                i: Int,
                obj: Object?
            ): SeriesDataProp {
                var num: Integer? = num
                var str = str
                var seriesData = seriesData
                if (i and 1 != 0) {
                    num = seriesDataProp.code
                }
                if (i and 2 != 0) {
                    str = seriesDataProp.msg
                }
                if (i and 4 != 0) {
                    seriesData = seriesDataProp.data
                }
                return seriesDataProp.copy(num, str, seriesData)
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: SuperStream.kt */
    @Metadata(
        m108d1 = ["\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u001c\b\u0003\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000cJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001d\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\tHÆ\u0003JD\u0010\u0015\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u001c\b\u0003\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\tHÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\u000cR%\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$SeriesSeasonProp;", "", "code", "", NotificationCompat.CATEGORY_MESSAGE, "", "data", "Ljava/util/ArrayList;", "Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$SeriesEpisode;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/ArrayList;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getData", "()Ljava/util/ArrayList;", "getMsg", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/ArrayList;)Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$SeriesSeasonProp;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class SeriesSeasonProp(
        @JsonProperty("code") num: Integer?,
        @JsonProperty("msg") str: String?,
        @JsonProperty("data") arrayList: ArrayList<SeriesEpisode?>
    ) {
        private val code: Integer?
        private val data: ArrayList<SeriesEpisode>
        val msg: String?
        operator fun component1(): Integer? {
            return code
        }

        operator fun component2(): String? {
            return msg
        }

        operator fun component3(): ArrayList<SeriesEpisode> {
            return data
        }

        fun copy(
            @JsonProperty("code") num: Integer?,
            @JsonProperty("msg") str: String?,
            @JsonProperty("data") arrayList: ArrayList<SeriesEpisode?>
        ): SeriesSeasonProp {
            return SeriesSeasonProp(num, str, arrayList)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is SeriesSeasonProp) {
                val seriesSeasonProp = obj as SeriesSeasonProp
                return Intrinsics.areEqual(code, seriesSeasonProp.code) && Intrinsics.areEqual(
                    msg, seriesSeasonProp.msg
                ) && Intrinsics.areEqual(data, seriesSeasonProp.data)
            }
            return false
        }

        override fun hashCode(): Int {
            val num: Integer? = code
            val hashCode = (if (num == null) 0 else num.hashCode()) * 31
            val str = msg
            val hashCode2 = (hashCode + (str?.hashCode() ?: 0)) * 31
            val arrayList: ArrayList<SeriesEpisode> = data
            return hashCode2 + if (arrayList != null) arrayList.hashCode() else 0
        }

        override fun toString(): String {
            return "SeriesSeasonProp(code=" + code + ", msg=" + msg + ", data=" + data + ')'
        }

        init {
            code = num
            msg = str
            data = arrayList
        }

        fun getCode(): Integer? {
            return code
        }

        @JvmOverloads
                /* synthetic */   constructor(
            num: Integer? = null,
            str: String? = null,
            arrayList: ArrayList? = null,
            i: Int = 7,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) null else num,
            if (i and 2 != 0) null else str,
            if (i and 4 != 0) ArrayList() else arrayList
        ) {
        }

        fun getData(): ArrayList<SeriesEpisode> {
            return data
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                seriesSeasonProp: SeriesSeasonProp,
                num: Integer?,
                str: String?,
                arrayList: ArrayList,
                i: Int,
                obj: Object?
            ): SeriesSeasonProp {
                var num: Integer? = num
                var str = str
                var arrayList: ArrayList = arrayList
                if (i and 1 != 0) {
                    num = seriesSeasonProp.code
                }
                if (i and 2 != 0) {
                    str = seriesSeasonProp.msg
                }
                if (i and 4 != 0) {
                    arrayList = seriesSeasonProp.data
                }
                return seriesSeasonProp.copy(num, str, arrayList)
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: SuperStream.kt */
    @Metadata(
        m108d1 = ["\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\bf\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001BÙ\u0003\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010)\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010*\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010+\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010,J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010_\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010h\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010i\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0002\u0010BJ\u000b\u0010j\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010m\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010p\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010s\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010w\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010|\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010}\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010~\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010\u007f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010.Jä\u0003\u0010\u0080\u0001\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010)\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010*\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0003\u0010\u0081\u0001J\u0016\u0010\u0082\u0001\u001a\u00030\u0083\u00012\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0003HÖ\u0001J\n\u0010\u0086\u0001\u001a\u00020\u0007HÖ\u0001R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010/\u001a\u0004\b0\u0010.R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010/\u001a\u0004\b3\u0010.R\u0015\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010/\u001a\u0004\b4\u0010.R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010/\u001a\u0004\b5\u0010.R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010/\u001a\u0004\b6\u0010.R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010/\u001a\u0004\b7\u0010.R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b8\u00102R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010/\u001a\u0004\b9\u0010.R\u0013\u0010+\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b:\u00102R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b;\u00102R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010/\u001a\u0004\b<\u0010.R\u0013\u0010!\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b=\u00102R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010/\u001a\u0004\b>\u0010.R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b?\u00102R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b@\u00102R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\n\n\u0002\u0010C\u001a\u0004\bA\u0010BR\u0013\u0010 \u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bD\u00102R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010/\u001a\u0004\bE\u0010.R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010/\u001a\u0004\bF\u0010.R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010/\u001a\u0004\bG\u0010.R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010/\u001a\u0004\bH\u0010.R\u0015\u0010\u000c\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010/\u001a\u0004\bI\u0010.R\u0015\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010/\u001a\u0004\bJ\u0010.R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bK\u00102R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bL\u00102R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bM\u00102R\u0013\u0010)\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bN\u00102R\u0013\u0010*\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bO\u00102R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bP\u00102R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010/\u001a\u0004\bQ\u0010.R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bR\u00102R\u0015\u0010'\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010/\u001a\u0004\bS\u0010.R\u0015\u0010(\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010/\u001a\u0004\bT\u0010.R\u0015\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010/\u001a\u0004\bU\u0010.R\u0015\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010/\u001a\u0004\bV\u0010.R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010/\u001a\u0004\bW\u0010.R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010/\u001a\u0004\bX\u0010.¨\u0006\u0087\u0001"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$SeriesEpisode;", "", "id", "", "tid", "mbId", "imdbId", "", "imdbIdStatus", "srtStatus", "season", "episode", ServerProtocol.DIALOG_PARAM_STATE, "title", "thumbs", "thumbsBak", "thumbsOriginal", "posterImdb", "synopsis", "runtime", ViewHierarchyConstants.VIEW_KEY, "download", "sourceFile", "codeFile", "addTime", "updateTime", "released", "releasedTimestamp", "", "audioLang", "qualityTag", "_3d", "remark", "pending", "imdbRating", "display", "sync", "tomatoMeter", "tomatoMeterCount", "tomatoAudience", "tomatoAudienceCount", "thumbsMin", "thumbsOrg", "imdbLink", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "get_3d", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAddTime", "getAudioLang", "()Ljava/lang/String;", "getCodeFile", "getDisplay", "getDownload", "getEpisode", "getId", "getImdbId", "getImdbIdStatus", "getImdbLink", "getImdbRating", "getMbId", "getPending", "getPosterImdb", "getQualityTag", "getReleased", "getReleasedTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRemark", "getRuntime", "getSeason", "getSourceFile", "getSrtStatus", "getState", "getSync", "getSynopsis", "getThumbs", "getThumbsBak", "getThumbsMin", "getThumbsOrg", "getThumbsOriginal", "getTid", "getTitle", "getTomatoAudience", "getTomatoAudienceCount", "getTomatoMeter", "getTomatoMeterCount", "getUpdateTime", "getView", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$SeriesEpisode;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class SeriesEpisode(
        @JsonProperty("id") num: Integer?,
        @JsonProperty("tid") num2: Integer?,
        @JsonProperty("mb_id") num3: Integer?,
        @JsonProperty("imdb_id") str: String?,
        @JsonProperty("imdb_id_status") num4: Integer?,
        @JsonProperty("srt_status") num5: Integer?,
        @JsonProperty("season") num6: Integer?,
        @JsonProperty("episode") num7: Integer?,
        @JsonProperty("state") num8: Integer?,
        @JsonProperty("title") str2: String?,
        @JsonProperty("thumbs") str3: String?,
        @JsonProperty("thumbs_bak") str4: String?,
        @JsonProperty("thumbs_original") str5: String?,
        @JsonProperty("poster_imdb") num9: Integer?,
        @JsonProperty("synopsis") str6: String?,
        @JsonProperty("runtime") num10: Integer?,
        @JsonProperty("view") num11: Integer?,
        @JsonProperty("download") num12: Integer?,
        @JsonProperty("source_file") num13: Integer?,
        @JsonProperty("code_file") num14: Integer?,
        @JsonProperty("add_time") num15: Integer?,
        @JsonProperty("update_time") num16: Integer?,
        @JsonProperty("released") str7: String?,
        @JsonProperty("released_timestamp") l: Long?,
        @JsonProperty("audio_lang") str8: String?,
        @JsonProperty("quality_tag") str9: String?,
        @JsonProperty("3d") num17: Integer?,
        @JsonProperty("remark") str10: String?,
        @JsonProperty("pending") str11: String?,
        @JsonProperty("imdb_rating") str12: String?,
        @JsonProperty("display") num18: Integer?,
        @JsonProperty("sync") num19: Integer?,
        @JsonProperty("tomato_meter") num20: Integer?,
        @JsonProperty("tomato_meter_count") num21: Integer?,
        @JsonProperty("tomato_audience") num22: Integer?,
        @JsonProperty("tomato_audience_count") num23: Integer?,
        @JsonProperty("thumbs_min") str13: String?,
        @JsonProperty("thumbs_org") str14: String?,
        @JsonProperty("imdb_link") str15: String?
    ) {
        private val _3d: Integer?
        private val addTime: Integer?
        val audioLang: String?
        private val codeFile: Integer?
        private val display: Integer?
        private val download: Integer?
        private val episode: Integer?

        /* renamed from: id */
        private val f9981id: Integer?
        val imdbId: String?
        private val imdbIdStatus: Integer?
        val imdbLink: String?
        val imdbRating: String?
        private val mbId: Integer?
        val pending: String?
        private val posterImdb: Integer?
        val qualityTag: String?
        val released: String?
        val releasedTimestamp: Long?
        val remark: String?
        private val runtime: Integer?
        private val season: Integer?
        private val sourceFile: Integer?
        private val srtStatus: Integer?
        private val state: Integer?
        private val sync: Integer?
        val synopsis: String?
        val thumbs: String?
        val thumbsBak: String?
        val thumbsMin: String?
        val thumbsOrg: String?
        val thumbsOriginal: String?
        private val tid: Integer?
        val title: String?
        private val tomatoAudience: Integer?
        private val tomatoAudienceCount: Integer?
        private val tomatoMeter: Integer?
        private val tomatoMeterCount: Integer?
        private val updateTime: Integer?
        private val view: Integer?
        operator fun component1(): Integer? {
            return f9981id
        }

        operator fun component10(): String? {
            return title
        }

        operator fun component11(): String? {
            return thumbs
        }

        operator fun component12(): String? {
            return thumbsBak
        }

        operator fun component13(): String? {
            return thumbsOriginal
        }

        operator fun component14(): Integer? {
            return posterImdb
        }

        operator fun component15(): String? {
            return synopsis
        }

        operator fun component16(): Integer? {
            return runtime
        }

        operator fun component17(): Integer? {
            return view
        }

        operator fun component18(): Integer? {
            return download
        }

        operator fun component19(): Integer? {
            return sourceFile
        }

        operator fun component2(): Integer? {
            return tid
        }

        operator fun component20(): Integer? {
            return codeFile
        }

        operator fun component21(): Integer? {
            return addTime
        }

        operator fun component22(): Integer? {
            return updateTime
        }

        operator fun component23(): String? {
            return released
        }

        operator fun component24(): Long? {
            return releasedTimestamp
        }

        operator fun component25(): String? {
            return audioLang
        }

        operator fun component26(): String? {
            return qualityTag
        }

        operator fun component27(): Integer? {
            return _3d
        }

        operator fun component28(): String? {
            return remark
        }

        operator fun component29(): String? {
            return pending
        }

        operator fun component3(): Integer? {
            return mbId
        }

        operator fun component30(): String? {
            return imdbRating
        }

        operator fun component31(): Integer? {
            return display
        }

        operator fun component32(): Integer? {
            return sync
        }

        operator fun component33(): Integer? {
            return tomatoMeter
        }

        operator fun component34(): Integer? {
            return tomatoMeterCount
        }

        operator fun component35(): Integer? {
            return tomatoAudience
        }

        operator fun component36(): Integer? {
            return tomatoAudienceCount
        }

        operator fun component37(): String? {
            return thumbsMin
        }

        operator fun component38(): String? {
            return thumbsOrg
        }

        operator fun component39(): String? {
            return imdbLink
        }

        operator fun component4(): String? {
            return imdbId
        }

        operator fun component5(): Integer? {
            return imdbIdStatus
        }

        operator fun component6(): Integer? {
            return srtStatus
        }

        operator fun component7(): Integer? {
            return season
        }

        operator fun component8(): Integer? {
            return episode
        }

        operator fun component9(): Integer? {
            return state
        }

        fun copy(
            @JsonProperty("id") num: Integer?,
            @JsonProperty("tid") num2: Integer?,
            @JsonProperty("mb_id") num3: Integer?,
            @JsonProperty("imdb_id") str: String?,
            @JsonProperty("imdb_id_status") num4: Integer?,
            @JsonProperty("srt_status") num5: Integer?,
            @JsonProperty("season") num6: Integer?,
            @JsonProperty("episode") num7: Integer?,
            @JsonProperty("state") num8: Integer?,
            @JsonProperty("title") str2: String?,
            @JsonProperty("thumbs") str3: String?,
            @JsonProperty("thumbs_bak") str4: String?,
            @JsonProperty("thumbs_original") str5: String?,
            @JsonProperty("poster_imdb") num9: Integer?,
            @JsonProperty("synopsis") str6: String?,
            @JsonProperty("runtime") num10: Integer?,
            @JsonProperty("view") num11: Integer?,
            @JsonProperty("download") num12: Integer?,
            @JsonProperty("source_file") num13: Integer?,
            @JsonProperty("code_file") num14: Integer?,
            @JsonProperty("add_time") num15: Integer?,
            @JsonProperty("update_time") num16: Integer?,
            @JsonProperty("released") str7: String?,
            @JsonProperty("released_timestamp") l: Long?,
            @JsonProperty("audio_lang") str8: String?,
            @JsonProperty("quality_tag") str9: String?,
            @JsonProperty("3d") num17: Integer?,
            @JsonProperty("remark") str10: String?,
            @JsonProperty("pending") str11: String?,
            @JsonProperty("imdb_rating") str12: String?,
            @JsonProperty("display") num18: Integer?,
            @JsonProperty("sync") num19: Integer?,
            @JsonProperty("tomato_meter") num20: Integer?,
            @JsonProperty("tomato_meter_count") num21: Integer?,
            @JsonProperty("tomato_audience") num22: Integer?,
            @JsonProperty("tomato_audience_count") num23: Integer?,
            @JsonProperty("thumbs_min") str13: String?,
            @JsonProperty("thumbs_org") str14: String?,
            @JsonProperty("imdb_link") str15: String?
        ): SeriesEpisode {
            return SeriesEpisode(
                num,
                num2,
                num3,
                str,
                num4,
                num5,
                num6,
                num7,
                num8,
                str2,
                str3,
                str4,
                str5,
                num9,
                str6,
                num10,
                num11,
                num12,
                num13,
                num14,
                num15,
                num16,
                str7,
                l,
                str8,
                str9,
                num17,
                str10,
                str11,
                str12,
                num18,
                num19,
                num20,
                num21,
                num22,
                num23,
                str13,
                str14,
                str15
            )
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is SeriesEpisode) {
                val seriesEpisode = obj as SeriesEpisode
                return Intrinsics.areEqual(f9981id, seriesEpisode.f9981id) && Intrinsics.areEqual(
                    tid, seriesEpisode.tid
                ) && Intrinsics.areEqual(mbId, seriesEpisode.mbId) && Intrinsics.areEqual(
                    imdbId, seriesEpisode.imdbId
                ) && Intrinsics.areEqual(
                    imdbIdStatus, seriesEpisode.imdbIdStatus
                ) && Intrinsics.areEqual(
                    srtStatus, seriesEpisode.srtStatus
                ) && Intrinsics.areEqual(
                    season, seriesEpisode.season
                ) && Intrinsics.areEqual(episode, seriesEpisode.episode) && Intrinsics.areEqual(
                    state, seriesEpisode.state
                ) && Intrinsics.areEqual(title, seriesEpisode.title) && Intrinsics.areEqual(
                    thumbs, seriesEpisode.thumbs
                ) && Intrinsics.areEqual(
                    thumbsBak, seriesEpisode.thumbsBak
                ) && Intrinsics.areEqual(
                    thumbsOriginal, seriesEpisode.thumbsOriginal
                ) && Intrinsics.areEqual(
                    posterImdb, seriesEpisode.posterImdb
                ) && Intrinsics.areEqual(
                    synopsis, seriesEpisode.synopsis
                ) && Intrinsics.areEqual(
                    runtime, seriesEpisode.runtime
                ) && Intrinsics.areEqual(view, seriesEpisode.view) && Intrinsics.areEqual(
                    download, seriesEpisode.download
                ) && Intrinsics.areEqual(
                    sourceFile, seriesEpisode.sourceFile
                ) && Intrinsics.areEqual(
                    codeFile, seriesEpisode.codeFile
                ) && Intrinsics.areEqual(
                    addTime, seriesEpisode.addTime
                ) && Intrinsics.areEqual(
                    updateTime, seriesEpisode.updateTime
                ) && Intrinsics.areEqual(
                    released, seriesEpisode.released
                ) && Intrinsics.areEqual(
                    releasedTimestamp, seriesEpisode.releasedTimestamp
                ) && Intrinsics.areEqual(
                    audioLang, seriesEpisode.audioLang
                ) && Intrinsics.areEqual(
                    qualityTag, seriesEpisode.qualityTag
                ) && Intrinsics.areEqual(
                    _3d, seriesEpisode._3d
                ) && Intrinsics.areEqual(remark, seriesEpisode.remark) && Intrinsics.areEqual(
                    pending, seriesEpisode.pending
                ) && Intrinsics.areEqual(
                    imdbRating, seriesEpisode.imdbRating
                ) && Intrinsics.areEqual(
                    display, seriesEpisode.display
                ) && Intrinsics.areEqual(sync, seriesEpisode.sync) && Intrinsics.areEqual(
                    tomatoMeter, seriesEpisode.tomatoMeter
                ) && Intrinsics.areEqual(
                    tomatoMeterCount, seriesEpisode.tomatoMeterCount
                ) && Intrinsics.areEqual(
                    tomatoAudience, seriesEpisode.tomatoAudience
                ) && Intrinsics.areEqual(
                    tomatoAudienceCount, seriesEpisode.tomatoAudienceCount
                ) && Intrinsics.areEqual(
                    thumbsMin, seriesEpisode.thumbsMin
                ) && Intrinsics.areEqual(
                    thumbsOrg, seriesEpisode.thumbsOrg
                ) && Intrinsics.areEqual(
                    imdbLink, seriesEpisode.imdbLink
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val num: Integer? = f9981id
            val hashCode = (if (num == null) 0 else num.hashCode()) * 31
            val num2: Integer? = tid
            val hashCode2: Int = (hashCode + if (num2 == null) 0 else num2.hashCode()) * 31
            val num3: Integer? = mbId
            val hashCode3: Int = (hashCode2 + if (num3 == null) 0 else num3.hashCode()) * 31
            val str = imdbId
            val hashCode4 = (hashCode3 + (str?.hashCode() ?: 0)) * 31
            val num4: Integer? = imdbIdStatus
            val hashCode5: Int = (hashCode4 + if (num4 == null) 0 else num4.hashCode()) * 31
            val num5: Integer? = srtStatus
            val hashCode6: Int = (hashCode5 + if (num5 == null) 0 else num5.hashCode()) * 31
            val num6: Integer? = season
            val hashCode7: Int = (hashCode6 + if (num6 == null) 0 else num6.hashCode()) * 31
            val num7: Integer? = episode
            val hashCode8: Int = (hashCode7 + if (num7 == null) 0 else num7.hashCode()) * 31
            val num8: Integer? = state
            val hashCode9: Int = (hashCode8 + if (num8 == null) 0 else num8.hashCode()) * 31
            val str2 = title
            val hashCode10 = (hashCode9 + (str2?.hashCode() ?: 0)) * 31
            val str3 = thumbs
            val hashCode11 = (hashCode10 + (str3?.hashCode() ?: 0)) * 31
            val str4 = thumbsBak
            val hashCode12 = (hashCode11 + (str4?.hashCode() ?: 0)) * 31
            val str5 = thumbsOriginal
            val hashCode13 = (hashCode12 + (str5?.hashCode() ?: 0)) * 31
            val num9: Integer? = posterImdb
            val hashCode14: Int = (hashCode13 + if (num9 == null) 0 else num9.hashCode()) * 31
            val str6 = synopsis
            val hashCode15 = (hashCode14 + (str6?.hashCode() ?: 0)) * 31
            val num10: Integer? = runtime
            val hashCode16: Int = (hashCode15 + if (num10 == null) 0 else num10.hashCode()) * 31
            val num11: Integer? = view
            val hashCode17: Int = (hashCode16 + if (num11 == null) 0 else num11.hashCode()) * 31
            val num12: Integer? = download
            val hashCode18: Int = (hashCode17 + if (num12 == null) 0 else num12.hashCode()) * 31
            val num13: Integer? = sourceFile
            val hashCode19: Int = (hashCode18 + if (num13 == null) 0 else num13.hashCode()) * 31
            val num14: Integer? = codeFile
            val hashCode20: Int = (hashCode19 + if (num14 == null) 0 else num14.hashCode()) * 31
            val num15: Integer? = addTime
            val hashCode21: Int = (hashCode20 + if (num15 == null) 0 else num15.hashCode()) * 31
            val num16: Integer? = updateTime
            val hashCode22: Int = (hashCode21 + if (num16 == null) 0 else num16.hashCode()) * 31
            val str7 = released
            val hashCode23 = (hashCode22 + (str7?.hashCode() ?: 0)) * 31
            val l = releasedTimestamp
            val hashCode24 = (hashCode23 + (l?.hashCode() ?: 0)) * 31
            val str8 = audioLang
            val hashCode25 = (hashCode24 + (str8?.hashCode() ?: 0)) * 31
            val str9 = qualityTag
            val hashCode26 = (hashCode25 + (str9?.hashCode() ?: 0)) * 31
            val num17: Integer? = _3d
            val hashCode27: Int = (hashCode26 + if (num17 == null) 0 else num17.hashCode()) * 31
            val str10 = remark
            val hashCode28 = (hashCode27 + (str10?.hashCode() ?: 0)) * 31
            val str11 = pending
            val hashCode29 = (hashCode28 + (str11?.hashCode() ?: 0)) * 31
            val str12 = imdbRating
            val hashCode30 = (hashCode29 + (str12?.hashCode() ?: 0)) * 31
            val num18: Integer? = display
            val hashCode31: Int = (hashCode30 + if (num18 == null) 0 else num18.hashCode()) * 31
            val num19: Integer? = sync
            val hashCode32: Int = (hashCode31 + if (num19 == null) 0 else num19.hashCode()) * 31
            val num20: Integer? = tomatoMeter
            val hashCode33: Int = (hashCode32 + if (num20 == null) 0 else num20.hashCode()) * 31
            val num21: Integer? = tomatoMeterCount
            val hashCode34: Int = (hashCode33 + if (num21 == null) 0 else num21.hashCode()) * 31
            val num22: Integer? = tomatoAudience
            val hashCode35: Int = (hashCode34 + if (num22 == null) 0 else num22.hashCode()) * 31
            val num23: Integer? = tomatoAudienceCount
            val hashCode36: Int = (hashCode35 + if (num23 == null) 0 else num23.hashCode()) * 31
            val str13 = thumbsMin
            val hashCode37 = (hashCode36 + (str13?.hashCode() ?: 0)) * 31
            val str14 = thumbsOrg
            val hashCode38 = (hashCode37 + (str14?.hashCode() ?: 0)) * 31
            val str15 = imdbLink
            return hashCode38 + (str15?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "SeriesEpisode(id=" + f9981id + ", tid=" + tid + ", mbId=" + mbId + ", imdbId=" + imdbId + ", imdbIdStatus=" + imdbIdStatus + ", srtStatus=" + srtStatus + ", season=" + season + ", episode=" + episode + ", state=" + state + ", title=" + title + ", thumbs=" + thumbs + ", thumbsBak=" + thumbsBak + ", thumbsOriginal=" + thumbsOriginal + ", posterImdb=" + posterImdb + ", synopsis=" + synopsis + ", runtime=" + runtime + ", view=" + view + ", download=" + download + ", sourceFile=" + sourceFile + ", codeFile=" + codeFile + ", addTime=" + addTime + ", updateTime=" + updateTime + ", released=" + released + ", releasedTimestamp=" + releasedTimestamp + ", audioLang=" + audioLang + ", qualityTag=" + qualityTag + ", _3d=" + _3d + ", remark=" + remark + ", pending=" + pending + ", imdbRating=" + imdbRating + ", display=" + display + ", sync=" + sync + ", tomatoMeter=" + tomatoMeter + ", tomatoMeterCount=" + tomatoMeterCount + ", tomatoAudience=" + tomatoAudience + ", tomatoAudienceCount=" + tomatoAudienceCount + ", thumbsMin=" + thumbsMin + ", thumbsOrg=" + thumbsOrg + ", imdbLink=" + imdbLink + ')'
        }

        init {
            f9981id = num
            tid = num2
            mbId = num3
            imdbId = str
            imdbIdStatus = num4
            srtStatus = num5
            season = num6
            episode = num7
            state = num8
            title = str2
            thumbs = str3
            thumbsBak = str4
            thumbsOriginal = str5
            posterImdb = num9
            synopsis = str6
            runtime = num10
            view = num11
            download = num12
            sourceFile = num13
            codeFile = num14
            addTime = num15
            updateTime = num16
            released = str7
            releasedTimestamp = l
            audioLang = str8
            qualityTag = str9
            _3d = num17
            remark = str10
            pending = str11
            imdbRating = str12
            display = num18
            sync = num19
            tomatoMeter = num20
            tomatoMeterCount = num21
            tomatoAudience = num22
            tomatoAudienceCount = num23
            thumbsMin = str13
            thumbsOrg = str14
            imdbLink = str15
        }

        @JvmOverloads
                /* synthetic */   constructor(
            num: Integer? = null,
            num2: Integer? = null,
            num3: Integer? = null,
            str: String? = null,
            num4: Integer? = null,
            num5: Integer? = null,
            num6: Integer? = null,
            num7: Integer? = null,
            num8: Integer? = null,
            str2: String? = null,
            str3: String? = null,
            str4: String? = null,
            str5: String? = null,
            num9: Integer? = null,
            str6: String? = null,
            num10: Integer? = null,
            num11: Integer? = null,
            num12: Integer? = null,
            num13: Integer? = null,
            num14: Integer? = null,
            num15: Integer? = null,
            num16: Integer? = null,
            str7: String? = null,
            l: Long? = null,
            str8: String? = null,
            str9: String? = null,
            num17: Integer? = null,
            str10: String? = null,
            str11: String? = null,
            str12: String? = null,
            num18: Integer? = null,
            num19: Integer? = null,
            num20: Integer? = null,
            num21: Integer? = null,
            num22: Integer? = null,
            num23: Integer? = null,
            str13: String? = null,
            str14: String? = null,
            str15: String? = null,
            i: Int = -1,
            i2: Int = 127,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) null else num,
            if (i and 2 != 0) null else num2,
            if (i and 4 != 0) null else num3,
            if (i and 8 != 0) null else str,
            if (i and 16 != 0) null else num4,
            if (i and 32 != 0) null else num5,
            if (i and 64 != 0) null else num6,
            if (i and 128 != 0) null else num7,
            if (i and 256 != 0) null else num8,
            if (i and 512 != 0) null else str2,
            if (i and 1024 != 0) null else str3,
            if (i and 2048 != 0) null else str4,
            if (i and 4096 != 0) null else str5,
            if (i and 8192 != 0) null else num9,
            if (i and 16384 != 0) null else str6,
            if (i and 32768 != 0) null else num10,
            if (i and 65536 != 0) null else num11,
            if (i and 131072 != 0) null else num12,
            if (i and 262144 != 0) null else num13,
            if (i and 524288 != 0) null else num14,
            if (i and 1048576 != 0) null else num15,
            if (i and 2097152 != 0) null else num16,
            if (i and 4194304 != 0) null else str7,
            if (i and 8388608 != 0) null else l,
            if (i and 16777216 != 0) null else str8,
            if (i and 33554432 != 0) null else str9,
            if (i and 67108864 != 0) null else num17,
            if (i and 134217728 != 0) null else str10,
            if (i and 268435456 != 0) null else str11,
            if (i and 536870912 != 0) null else str12,
            if (i and 1073741824 != 0) null else num18,
            if (i and Integer.MIN_VALUE !== 0) null else num19,
            if (i2 and 1 != 0) null else num20,
            if (i2 and 2 != 0) null else num21,
            if (i2 and 4 != 0) null else num22,
            if (i2 and 8 != 0) null else num23,
            if (i2 and 16 != 0) null else str13,
            if (i2 and 32 != 0) null else str14,
            if (i2 and 64 != 0) null else str15
        ) {
        }

        val id: Integer?
            get() = f9981id

        fun getTid(): Integer? {
            return tid
        }

        fun getMbId(): Integer? {
            return mbId
        }

        fun getImdbIdStatus(): Integer? {
            return imdbIdStatus
        }

        fun getSrtStatus(): Integer? {
            return srtStatus
        }

        fun getSeason(): Integer? {
            return season
        }

        fun getEpisode(): Integer? {
            return episode
        }

        fun getState(): Integer? {
            return state
        }

        fun getPosterImdb(): Integer? {
            return posterImdb
        }

        fun getRuntime(): Integer? {
            return runtime
        }

        fun getView(): Integer? {
            return view
        }

        fun getDownload(): Integer? {
            return download
        }

        fun getSourceFile(): Integer? {
            return sourceFile
        }

        fun getCodeFile(): Integer? {
            return codeFile
        }

        fun getAddTime(): Integer? {
            return addTime
        }

        fun getUpdateTime(): Integer? {
            return updateTime
        }

        fun get_3d(): Integer? {
            return _3d
        }

        fun getDisplay(): Integer? {
            return display
        }

        fun getSync(): Integer? {
            return sync
        }

        fun getTomatoMeter(): Integer? {
            return tomatoMeter
        }

        fun getTomatoMeterCount(): Integer? {
            return tomatoMeterCount
        }

        fun getTomatoAudience(): Integer? {
            return tomatoAudience
        }

        fun getTomatoAudienceCount(): Integer? {
            return tomatoAudienceCount
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: SuperStream.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000c\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$SeriesLanguage;", "", "title", "", "lang", "(Ljava/lang/String;Ljava/lang/String;)V", "getLang", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class SeriesLanguage(
        @param:JsonProperty("title") val title: String?, @param:JsonProperty(
            "lang"
        ) val lang: String?
    ) {
        operator fun component1(): String? {
            return title
        }

        operator fun component2(): String? {
            return lang
        }

        fun copy(
            @JsonProperty("title") str: String?,
            @JsonProperty("lang") str2: String?
        ): SeriesLanguage {
            return SeriesLanguage(str, str2)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is SeriesLanguage) {
                val seriesLanguage = obj as SeriesLanguage
                return Intrinsics.areEqual(title, seriesLanguage.title) && Intrinsics.areEqual(
                    lang, seriesLanguage.lang
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val str = title
            val hashCode = (str?.hashCode() ?: 0) * 31
            val str2 = lang
            return hashCode + (str2?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "SeriesLanguage(title=" + title + ", lang=" + lang + ')'
        }

        @JvmOverloads
                /* synthetic */   constructor(
            str: String? = null,
            str2: String? = null,
            i: Int = 3,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(if (i and 1 != 0) null else str, if (i and 2 != 0) null else str2) {
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                seriesLanguage: SeriesLanguage,
                str: String?,
                str2: String?,
                i: Int,
                obj: Object?
            ): SeriesLanguage {
                var str = str
                var str2 = str2
                if (i and 1 != 0) {
                    str = seriesLanguage.title
                }
                if (i and 2 != 0) {
                    str2 = seriesLanguage.lang
                }
                return seriesLanguage.copy(str, str2)
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: SuperStream.kt */
    @Metadata(
        m108d1 = ["\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b(\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u007f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B÷\u0005\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010-\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010.\u001a\u0004\u0018\u00010/\u0012\n\b\u0003\u00100\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u00101\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u00102\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u00103\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u00104\u001a\u0004\u0018\u00010\u0006\u0012\u0018\b\u0003\u00105\u001a\u0012\u0012\u0004\u0012\u00020\u000306j\b\u0012\u0004\u0012\u00020\u0003`7\u0012\u0018\b\u0003\u00108\u001a\u0012\u0012\u0004\u0012\u00020\u000306j\b\u0012\u0004\u0012\u00020\u0003`7\u0012\u0018\b\u0003\u00109\u001a\u0012\u0012\u0004\u0012\u00020\u000606j\b\u0012\u0004\u0012\u00020\u0006`7\u0012\n\b\u0003\u0010:\u001a\u0004\u0018\u00010\u0006\u0012\u0018\b\u0003\u0010;\u001a\u0012\u0012\u0004\u0012\u00020<06j\b\u0012\u0004\u0012\u00020<`7\u0012\u0018\b\u0003\u0010=\u001a\u0012\u0012\u0004\u0012\u00020>06j\b\u0012\u0004\u0012\u00020>`7\u0012\n\b\u0003\u0010?\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010@\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010A\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010BJ\u0011\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010FJ\u000c\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010FJ\u000c\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010FJ\u000c\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000c\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000c\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000c\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010FJ\u0011\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010FJ\u0011\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010FJ\u0011\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010FJ\u0011\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010FJ\u000c\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000c\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010FJ\u000c\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010FJ\u0011\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010FJ\u0011\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010FJ\u000c\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000c\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000c\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000c\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010FJ\u000c\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010FJ\u0011\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010FJ\u000c\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000c\u0010 \u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010¡\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010FJ\u0011\u0010¢\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010FJ\u0011\u0010£\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010FJ\u0011\u0010¤\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010FJ\u0011\u0010¥\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010FJ\u000c\u0010¦\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010§\u0001\u001a\u0004\u0018\u00010/HÆ\u0003¢\u0006\u0002\u0010|J\u000c\u0010¨\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000c\u0010©\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000c\u0010ª\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000c\u0010«\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000c\u0010¬\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u001a\u0010\u00ad\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u000306j\b\u0012\u0004\u0012\u00020\u0003`7HÆ\u0003J\u0011\u0010®\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010FJ\u001a\u0010¯\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u000306j\b\u0012\u0004\u0012\u00020\u0003`7HÆ\u0003J\u001a\u0010°\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u000606j\b\u0012\u0004\u0012\u00020\u0006`7HÆ\u0003J\u000c\u0010±\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u001a\u0010²\u0001\u001a\u0012\u0012\u0004\u0012\u00020<06j\b\u0012\u0004\u0012\u00020<`7HÆ\u0003J\u001a\u0010³\u0001\u001a\u0012\u0012\u0004\u0012\u00020>06j\b\u0012\u0004\u0012\u00020>`7HÆ\u0003J\u0011\u0010´\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010FJ\u000c\u0010µ\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000c\u0010¶\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010·\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010FJ\u0011\u0010¸\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010FJ\u000c\u0010¹\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000c\u0010º\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0082\u0006\u0010»\u0001\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010-\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010.\u001a\u0004\u0018\u00010/2\n\b\u0003\u00100\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u00101\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u00102\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u00103\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u00104\u001a\u0004\u0018\u00010\u00062\u0018\b\u0003\u00105\u001a\u0012\u0012\u0004\u0012\u00020\u000306j\b\u0012\u0004\u0012\u00020\u0003`72\u0018\b\u0003\u00108\u001a\u0012\u0012\u0004\u0012\u00020\u000306j\b\u0012\u0004\u0012\u00020\u0003`72\u0018\b\u0003\u00109\u001a\u0012\u0012\u0004\u0012\u00020\u000606j\b\u0012\u0004\u0012\u00020\u0006`72\n\b\u0003\u0010:\u001a\u0004\u0018\u00010\u00062\u0018\b\u0003\u0010;\u001a\u0012\u0012\u0004\u0012\u00020<06j\b\u0012\u0004\u0012\u00020<`72\u0018\b\u0003\u0010=\u001a\u0012\u0012\u0004\u0012\u00020>06j\b\u0012\u0004\u0012\u00020>`72\n\b\u0003\u0010?\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010@\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010A\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0003\u0010¼\u0001J\u0016\u0010½\u0001\u001a\u00030¾\u00012\t\u0010¿\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010À\u0001\u001a\u00020\u0003HÖ\u0001J\n\u0010Á\u0001\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010G\u001a\u0004\bE\u0010FR\u0015\u0010)\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010G\u001a\u0004\bH\u0010FR\u0015\u0010*\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010G\u001a\u0004\bI\u0010FR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010DR\u0013\u00102\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bK\u0010DR\u0013\u00103\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bL\u0010DR\u0015\u0010?\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010G\u001a\u0004\bM\u0010FR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bN\u0010DR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010G\u001a\u0004\bO\u0010FR\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010G\u001a\u0004\bP\u0010FR\u0013\u0010\"\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010DR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bR\u0010DR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bS\u0010DR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010G\u001a\u0004\bT\u0010FR\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010G\u001a\u0004\bU\u0010FR\u0013\u0010-\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bV\u0010DR!\u0010;\u001a\u0012\u0012\u0004\u0012\u00020<06j\b\u0012\u0004\u0012\u00020<`7¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bY\u0010DR\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010G\u001a\u0004\bZ\u0010FR!\u00109\u001a\u0012\u0012\u0004\u0012\u00020\u000606j\b\u0012\u0004\u0012\u00020\u0006`7¢\u0006\b\n\u0000\u001a\u0004\b[\u0010XR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010G\u001a\u0004\b\\\u0010FR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b]\u0010DR\u0013\u0010:\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b^\u0010DR\u0013\u0010!\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b_\u0010DR!\u0010=\u001a\u0012\u0012\u0004\u0012\u00020>06j\b\u0012\u0004\u0012\u00020>`7¢\u0006\b\n\u0000\u001a\u0004\b`\u0010XR\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010G\u001a\u0004\ba\u0010FR\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010G\u001a\u0004\bb\u0010FR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010G\u001a\u0004\bc\u0010FR\u0015\u0010+\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010G\u001a\u0004\bd\u0010FR\u0015\u0010,\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010G\u001a\u0004\be\u0010FR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bf\u0010DR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010G\u001a\u0004\bg\u0010FR\u0013\u00100\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bh\u0010DR\u0013\u00101\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bi\u0010DR\u0013\u0010(\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bj\u0010DR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bk\u0010DR\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010G\u001a\u0004\bl\u0010FR\u0013\u0010 \u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bm\u0010DR!\u00108\u001a\u0012\u0012\u0004\u0012\u00020\u000306j\b\u0012\u0004\u0012\u00020\u0003`7¢\u0006\b\n\u0000\u001a\u0004\bn\u0010XR\u0013\u0010A\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bo\u0010DR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010G\u001a\u0004\bp\u0010FR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bq\u0010DR\u0015\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010G\u001a\u0004\br\u0010FR\u0015\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010G\u001a\u0004\bs\u0010FR\u0015\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010G\u001a\u0004\bt\u0010FR\u0013\u0010'\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bu\u0010DR\u0013\u0010$\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bv\u0010DR\u0013\u00104\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bw\u0010DR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bx\u0010DR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010G\u001a\u0004\by\u0010FR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010G\u001a\u0004\bz\u0010FR\u0015\u0010.\u001a\u0004\u0018\u00010/¢\u0006\n\n\u0002\u0010}\u001a\u0004\b{\u0010|R\u0013\u0010\u000c\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b~\u0010DR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010G\u001a\u0004\b\u007f\u0010FR\u0014\u0010@\u001a\u0004\u0018\u00010\u0006¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010DR\"\u00105\u001a\u0012\u0012\u0004\u0012\u00020\u000306j\b\u0012\u0004\u0012\u00020\u0003`7¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010X¨\u0006Â\u0001"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$SeriesData;", "", "id", "", "mbId", "title", "", "display", ServerProtocol.DIALOG_PARAM_STATE, "vipOnly", "codeFile", "director", "writer", "actors", "addTime", "poster", "posterImdb", "bannerMini", "description", "imdbId", "cats", "year", "collect", ViewHierarchyConstants.VIEW_KEY, "download", "updateTime", "released", "releasedTimestamp", "episodeReleased", "episodeReleasedTimestamp", "maxSeason", "maxEpisode", "remark", "imdbRating", "contentRating", "tmdbId", "tomatoUrl", "tomatoMeter", "tomatoMeterCount", "tomatoMeterState", "reelgoodUrl", "audienceScore", "audienceScoreCount", "noTomatoUrl", "orderYear", "episodateId", "weightsDay", "", "posterMin", "posterOrg", "bannerMiniMin", "bannerMiniOrg", "trailerUrl", "years", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "season", "history", "imdbLink", "episode", "Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$SeriesEpisode;", "language", "Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$SeriesLanguage;", "boxType", "yearYear", "seasonEpisode", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getActors", "()Ljava/lang/String;", "getAddTime", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAudienceScore", "getAudienceScoreCount", "getBannerMini", "getBannerMiniMin", "getBannerMiniOrg", "getBoxType", "getCats", "getCodeFile", "getCollect", "getContentRating", "getDescription", "getDirector", "getDisplay", "getDownload", "getEpisodateId", "getEpisode", "()Ljava/util/ArrayList;", "getEpisodeReleased", "getEpisodeReleasedTimestamp", "getHistory", "getId", "getImdbId", "getImdbLink", "getImdbRating", "getLanguage", "getMaxEpisode", "getMaxSeason", "getMbId", "getNoTomatoUrl", "getOrderYear", "getPoster", "getPosterImdb", "getPosterMin", "getPosterOrg", "getReelgoodUrl", "getReleased", "getReleasedTimestamp", "getRemark", "getSeason", "getSeasonEpisode", "getState", "getTitle", "getTmdbId", "getTomatoMeter", "getTomatoMeterCount", "getTomatoMeterState", "getTomatoUrl", "getTrailerUrl", "getUpdateTime", "getView", "getVipOnly", "getWeightsDay", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getWriter", "getYear", "getYearYear", "getYears", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$SeriesData;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class SeriesData(
        @JsonProperty("id") num: Integer?,
        @JsonProperty("mb_id") num2: Integer?,
        @JsonProperty("title") str: String?,
        @JsonProperty("display") num3: Integer?,
        @JsonProperty("state") num4: Integer?,
        @JsonProperty("vip_only") num5: Integer?,
        @JsonProperty("code_file") num6: Integer?,
        @JsonProperty("director") str2: String?,
        @JsonProperty("writer") str3: String?,
        @JsonProperty("actors") str4: String?,
        @JsonProperty("add_time") num7: Integer?,
        @JsonProperty("poster") str5: String?,
        @JsonProperty("poster_imdb") num8: Integer?,
        @JsonProperty("banner_mini") str6: String?,
        @JsonProperty("description") str7: String?,
        @JsonProperty("imdb_id") str8: String?,
        @JsonProperty("cats") str9: String?,
        @JsonProperty("year") num9: Integer?,
        @JsonProperty("collect") num10: Integer?,
        @JsonProperty("view") num11: Integer?,
        @JsonProperty("download") num12: Integer?,
        @JsonProperty("update_time") str10: String?,
        @JsonProperty("released") str11: String?,
        @JsonProperty("released_timestamp") num13: Integer?,
        @JsonProperty("episode_released") str12: String?,
        @JsonProperty("episode_released_timestamp") num14: Integer?,
        @JsonProperty("max_season") num15: Integer?,
        @JsonProperty("max_episode") num16: Integer?,
        @JsonProperty("remark") str13: String?,
        @JsonProperty("imdb_rating") str14: String?,
        @JsonProperty("content_rating") str15: String?,
        @JsonProperty("tmdb_id") num17: Integer?,
        @JsonProperty("tomato_url") str16: String?,
        @JsonProperty("tomato_meter") num18: Integer?,
        @JsonProperty("tomato_meter_count") num19: Integer?,
        @JsonProperty("tomato_meter_state") str17: String?,
        @JsonProperty("reelgood_url") str18: String?,
        @JsonProperty("audience_score") num20: Integer?,
        @JsonProperty("audience_score_count") num21: Integer?,
        @JsonProperty("no_tomato_url") num22: Integer?,
        @JsonProperty("order_year") num23: Integer?,
        @JsonProperty("episodate_id") str19: String?,
        @JsonProperty("weights_day") d: Double?,
        @JsonProperty("poster_min") str20: String?,
        @JsonProperty("poster_org") str21: String?,
        @JsonProperty("banner_mini_min") str22: String?,
        @JsonProperty("banner_mini_org") str23: String?,
        @JsonProperty("trailer_url") str24: String?,
        @JsonProperty("years") years: ArrayList<Integer?>,
        @JsonProperty("season") season: ArrayList<Integer?>,
        @JsonProperty("history") history: ArrayList<String?>,
        @JsonProperty("imdb_link") str25: String?,
        @JsonProperty("episode") episode: ArrayList<SeriesEpisode?>,
        @JsonProperty("language") language: ArrayList<SeriesLanguage?>,
        @JsonProperty("box_type") num24: Integer?,
        @JsonProperty("year_year") str26: String?,
        @JsonProperty("season_episode") str27: String?
    ) {
        val actors: String?
        private val addTime: Integer?
        private val audienceScore: Integer?
        private val audienceScoreCount: Integer?
        val bannerMini: String?
        val bannerMiniMin: String?
        val bannerMiniOrg: String?
        private val boxType: Integer?
        val cats: String?
        private val codeFile: Integer?
        private val collect: Integer?
        val contentRating: String?
        val description: String?
        val director: String?
        private val display: Integer?
        private val download: Integer?
        val episodateId: String?
        private val episode: ArrayList<SeriesEpisode>
        val episodeReleased: String?
        private val episodeReleasedTimestamp: Integer?
        private val history: ArrayList<String>

        /* renamed from: id */
        private val f9980id: Integer?
        val imdbId: String?
        val imdbLink: String?
        val imdbRating: String?
        private val language: ArrayList<SeriesLanguage>
        private val maxEpisode: Integer?
        private val maxSeason: Integer?
        private val mbId: Integer?
        private val noTomatoUrl: Integer?
        private val orderYear: Integer?
        val poster: String?
        private val posterImdb: Integer?
        val posterMin: String?
        val posterOrg: String?
        val reelgoodUrl: String?
        val released: String?
        private val releasedTimestamp: Integer?
        val remark: String?
        private val season: ArrayList<Integer>
        val seasonEpisode: String?
        private val state: Integer?
        val title: String?
        private val tmdbId: Integer?
        private val tomatoMeter: Integer?
        private val tomatoMeterCount: Integer?
        val tomatoMeterState: String?
        val tomatoUrl: String?
        val trailerUrl: String?
        val updateTime: String?
        private val view: Integer?
        private val vipOnly: Integer?
        val weightsDay: Double?
        val writer: String?
        private val year: Integer?
        val yearYear: String?
        private val years: ArrayList<Integer>
        operator fun component1(): Integer? {
            return f9980id
        }

        operator fun component10(): String? {
            return actors
        }

        operator fun component11(): Integer? {
            return addTime
        }

        operator fun component12(): String? {
            return poster
        }

        operator fun component13(): Integer? {
            return posterImdb
        }

        operator fun component14(): String? {
            return bannerMini
        }

        operator fun component15(): String? {
            return description
        }

        operator fun component16(): String? {
            return imdbId
        }

        operator fun component17(): String? {
            return cats
        }

        operator fun component18(): Integer? {
            return year
        }

        operator fun component19(): Integer? {
            return collect
        }

        operator fun component2(): Integer? {
            return mbId
        }

        operator fun component20(): Integer? {
            return view
        }

        operator fun component21(): Integer? {
            return download
        }

        operator fun component22(): String? {
            return updateTime
        }

        operator fun component23(): String? {
            return released
        }

        operator fun component24(): Integer? {
            return releasedTimestamp
        }

        operator fun component25(): String? {
            return episodeReleased
        }

        operator fun component26(): Integer? {
            return episodeReleasedTimestamp
        }

        operator fun component27(): Integer? {
            return maxSeason
        }

        operator fun component28(): Integer? {
            return maxEpisode
        }

        operator fun component29(): String? {
            return remark
        }

        operator fun component3(): String? {
            return title
        }

        operator fun component30(): String? {
            return imdbRating
        }

        operator fun component31(): String? {
            return contentRating
        }

        operator fun component32(): Integer? {
            return tmdbId
        }

        operator fun component33(): String? {
            return tomatoUrl
        }

        operator fun component34(): Integer? {
            return tomatoMeter
        }

        operator fun component35(): Integer? {
            return tomatoMeterCount
        }

        operator fun component36(): String? {
            return tomatoMeterState
        }

        operator fun component37(): String? {
            return reelgoodUrl
        }

        operator fun component38(): Integer? {
            return audienceScore
        }

        operator fun component39(): Integer? {
            return audienceScoreCount
        }

        operator fun component4(): Integer? {
            return display
        }

        operator fun component40(): Integer? {
            return noTomatoUrl
        }

        operator fun component41(): Integer? {
            return orderYear
        }

        operator fun component42(): String? {
            return episodateId
        }

        operator fun component43(): Double? {
            return weightsDay
        }

        operator fun component44(): String? {
            return posterMin
        }

        operator fun component45(): String? {
            return posterOrg
        }

        operator fun component46(): String? {
            return bannerMiniMin
        }

        operator fun component47(): String? {
            return bannerMiniOrg
        }

        operator fun component48(): String? {
            return trailerUrl
        }

        operator fun component49(): ArrayList<Integer> {
            return years
        }

        operator fun component5(): Integer? {
            return state
        }

        operator fun component50(): ArrayList<Integer> {
            return season
        }

        operator fun component51(): ArrayList<String> {
            return history
        }

        operator fun component52(): String? {
            return imdbLink
        }

        operator fun component53(): ArrayList<SeriesEpisode> {
            return episode
        }

        operator fun component54(): ArrayList<SeriesLanguage> {
            return language
        }

        operator fun component55(): Integer? {
            return boxType
        }

        operator fun component56(): String? {
            return yearYear
        }

        operator fun component57(): String? {
            return seasonEpisode
        }

        operator fun component6(): Integer? {
            return vipOnly
        }

        operator fun component7(): Integer? {
            return codeFile
        }

        operator fun component8(): String? {
            return director
        }

        operator fun component9(): String? {
            return writer
        }

        fun copy(
            @JsonProperty("id") num: Integer?,
            @JsonProperty("mb_id") num2: Integer?,
            @JsonProperty("title") str: String?,
            @JsonProperty("display") num3: Integer?,
            @JsonProperty("state") num4: Integer?,
            @JsonProperty("vip_only") num5: Integer?,
            @JsonProperty("code_file") num6: Integer?,
            @JsonProperty("director") str2: String?,
            @JsonProperty("writer") str3: String?,
            @JsonProperty("actors") str4: String?,
            @JsonProperty("add_time") num7: Integer?,
            @JsonProperty("poster") str5: String?,
            @JsonProperty("poster_imdb") num8: Integer?,
            @JsonProperty("banner_mini") str6: String?,
            @JsonProperty("description") str7: String?,
            @JsonProperty("imdb_id") str8: String?,
            @JsonProperty("cats") str9: String?,
            @JsonProperty("year") num9: Integer?,
            @JsonProperty("collect") num10: Integer?,
            @JsonProperty("view") num11: Integer?,
            @JsonProperty("download") num12: Integer?,
            @JsonProperty("update_time") str10: String?,
            @JsonProperty("released") str11: String?,
            @JsonProperty("released_timestamp") num13: Integer?,
            @JsonProperty("episode_released") str12: String?,
            @JsonProperty("episode_released_timestamp") num14: Integer?,
            @JsonProperty("max_season") num15: Integer?,
            @JsonProperty("max_episode") num16: Integer?,
            @JsonProperty("remark") str13: String?,
            @JsonProperty("imdb_rating") str14: String?,
            @JsonProperty("content_rating") str15: String?,
            @JsonProperty("tmdb_id") num17: Integer?,
            @JsonProperty("tomato_url") str16: String?,
            @JsonProperty("tomato_meter") num18: Integer?,
            @JsonProperty("tomato_meter_count") num19: Integer?,
            @JsonProperty("tomato_meter_state") str17: String?,
            @JsonProperty("reelgood_url") str18: String?,
            @JsonProperty("audience_score") num20: Integer?,
            @JsonProperty("audience_score_count") num21: Integer?,
            @JsonProperty("no_tomato_url") num22: Integer?,
            @JsonProperty("order_year") num23: Integer?,
            @JsonProperty("episodate_id") str19: String?,
            @JsonProperty("weights_day") d: Double?,
            @JsonProperty("poster_min") str20: String?,
            @JsonProperty("poster_org") str21: String?,
            @JsonProperty("banner_mini_min") str22: String?,
            @JsonProperty("banner_mini_org") str23: String?,
            @JsonProperty("trailer_url") str24: String?,
            @JsonProperty("years") years: ArrayList<Integer?>,
            @JsonProperty("season") season: ArrayList<Integer?>,
            @JsonProperty("history") history: ArrayList<String?>,
            @JsonProperty("imdb_link") str25: String?,
            @JsonProperty("episode") episode: ArrayList<SeriesEpisode?>,
            @JsonProperty("language") language: ArrayList<SeriesLanguage?>,
            @JsonProperty("box_type") num24: Integer?,
            @JsonProperty("year_year") str26: String?,
            @JsonProperty("season_episode") str27: String?
        ): SeriesData {
            Intrinsics.checkNotNullParameter(years, "years")
            Intrinsics.checkNotNullParameter(season, "season")
            Intrinsics.checkNotNullParameter(history, "history")
            Intrinsics.checkNotNullParameter(episode, "episode")
            Intrinsics.checkNotNullParameter(language, "language")
            return SeriesData(
                num,
                num2,
                str,
                num3,
                num4,
                num5,
                num6,
                str2,
                str3,
                str4,
                num7,
                str5,
                num8,
                str6,
                str7,
                str8,
                str9,
                num9,
                num10,
                num11,
                num12,
                str10,
                str11,
                num13,
                str12,
                num14,
                num15,
                num16,
                str13,
                str14,
                str15,
                num17,
                str16,
                num18,
                num19,
                str17,
                str18,
                num20,
                num21,
                num22,
                num23,
                str19,
                d,
                str20,
                str21,
                str22,
                str23,
                str24,
                years,
                season,
                history,
                str25,
                episode,
                language,
                num24,
                str26,
                str27
            )
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is SeriesData) {
                val seriesData = obj as SeriesData
                return Intrinsics.areEqual(f9980id, seriesData.f9980id) && Intrinsics.areEqual(
                    mbId, seriesData.mbId
                ) && Intrinsics.areEqual(title, seriesData.title) && Intrinsics.areEqual(
                    display, seriesData.display
                ) && Intrinsics.areEqual(state, seriesData.state) && Intrinsics.areEqual(
                    vipOnly, seriesData.vipOnly
                ) && Intrinsics.areEqual(codeFile, seriesData.codeFile) && Intrinsics.areEqual(
                    director, seriesData.director
                ) && Intrinsics.areEqual(writer, seriesData.writer) && Intrinsics.areEqual(
                    actors, seriesData.actors
                ) && Intrinsics.areEqual(addTime, seriesData.addTime) && Intrinsics.areEqual(
                    poster, seriesData.poster
                ) && Intrinsics.areEqual(posterImdb, seriesData.posterImdb) && Intrinsics.areEqual(
                    bannerMini, seriesData.bannerMini
                ) && Intrinsics.areEqual(
                    description, seriesData.description
                ) && Intrinsics.areEqual(
                    imdbId, seriesData.imdbId
                ) && Intrinsics.areEqual(cats, seriesData.cats) && Intrinsics.areEqual(
                    year, seriesData.year
                ) && Intrinsics.areEqual(collect, seriesData.collect) && Intrinsics.areEqual(
                    view, seriesData.view
                ) && Intrinsics.areEqual(download, seriesData.download) && Intrinsics.areEqual(
                    updateTime, seriesData.updateTime
                ) && Intrinsics.areEqual(
                    released, seriesData.released
                ) && Intrinsics.areEqual(
                    releasedTimestamp, seriesData.releasedTimestamp
                ) && Intrinsics.areEqual(
                    episodeReleased, seriesData.episodeReleased
                ) && Intrinsics.areEqual(
                    episodeReleasedTimestamp, seriesData.episodeReleasedTimestamp
                ) && Intrinsics.areEqual(
                    maxSeason, seriesData.maxSeason
                ) && Intrinsics.areEqual(
                    maxEpisode, seriesData.maxEpisode
                ) && Intrinsics.areEqual(
                    remark, seriesData.remark
                ) && Intrinsics.areEqual(imdbRating, seriesData.imdbRating) && Intrinsics.areEqual(
                    contentRating, seriesData.contentRating
                ) && Intrinsics.areEqual(
                    tmdbId, seriesData.tmdbId
                ) && Intrinsics.areEqual(tomatoUrl, seriesData.tomatoUrl) && Intrinsics.areEqual(
                    tomatoMeter, seriesData.tomatoMeter
                ) && Intrinsics.areEqual(
                    tomatoMeterCount, seriesData.tomatoMeterCount
                ) && Intrinsics.areEqual(
                    tomatoMeterState, seriesData.tomatoMeterState
                ) && Intrinsics.areEqual(
                    reelgoodUrl, seriesData.reelgoodUrl
                ) && Intrinsics.areEqual(
                    audienceScore, seriesData.audienceScore
                ) && Intrinsics.areEqual(
                    audienceScoreCount, seriesData.audienceScoreCount
                ) && Intrinsics.areEqual(
                    noTomatoUrl, seriesData.noTomatoUrl
                ) && Intrinsics.areEqual(
                    orderYear, seriesData.orderYear
                ) && Intrinsics.areEqual(
                    episodateId, seriesData.episodateId
                ) && Intrinsics.areEqual(
                    weightsDay as Object?, seriesData.weightsDay as Object?
                ) && Intrinsics.areEqual(
                    posterMin, seriesData.posterMin
                ) && Intrinsics.areEqual(
                    posterOrg, seriesData.posterOrg
                ) && Intrinsics.areEqual(
                    bannerMiniMin, seriesData.bannerMiniMin
                ) && Intrinsics.areEqual(
                    bannerMiniOrg, seriesData.bannerMiniOrg
                ) && Intrinsics.areEqual(
                    trailerUrl, seriesData.trailerUrl
                ) && Intrinsics.areEqual(
                    years, seriesData.years
                ) && Intrinsics.areEqual(season, seriesData.season) && Intrinsics.areEqual(
                    history, seriesData.history
                ) && Intrinsics.areEqual(imdbLink, seriesData.imdbLink) && Intrinsics.areEqual(
                    episode, seriesData.episode
                ) && Intrinsics.areEqual(language, seriesData.language) && Intrinsics.areEqual(
                    boxType, seriesData.boxType
                ) && Intrinsics.areEqual(yearYear, seriesData.yearYear) && Intrinsics.areEqual(
                    seasonEpisode, seriesData.seasonEpisode
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val num: Integer? = f9980id
            val hashCode = (if (num == null) 0 else num.hashCode()) * 31
            val num2: Integer? = mbId
            val hashCode2: Int = (hashCode + if (num2 == null) 0 else num2.hashCode()) * 31
            val str = title
            val hashCode3 = (hashCode2 + (str?.hashCode() ?: 0)) * 31
            val num3: Integer? = display
            val hashCode4: Int = (hashCode3 + if (num3 == null) 0 else num3.hashCode()) * 31
            val num4: Integer? = state
            val hashCode5: Int = (hashCode4 + if (num4 == null) 0 else num4.hashCode()) * 31
            val num5: Integer? = vipOnly
            val hashCode6: Int = (hashCode5 + if (num5 == null) 0 else num5.hashCode()) * 31
            val num6: Integer? = codeFile
            val hashCode7: Int = (hashCode6 + if (num6 == null) 0 else num6.hashCode()) * 31
            val str2 = director
            val hashCode8 = (hashCode7 + (str2?.hashCode() ?: 0)) * 31
            val str3 = writer
            val hashCode9 = (hashCode8 + (str3?.hashCode() ?: 0)) * 31
            val str4 = actors
            val hashCode10 = (hashCode9 + (str4?.hashCode() ?: 0)) * 31
            val num7: Integer? = addTime
            val hashCode11: Int = (hashCode10 + if (num7 == null) 0 else num7.hashCode()) * 31
            val str5 = poster
            val hashCode12 = (hashCode11 + (str5?.hashCode() ?: 0)) * 31
            val num8: Integer? = posterImdb
            val hashCode13: Int = (hashCode12 + if (num8 == null) 0 else num8.hashCode()) * 31
            val str6 = bannerMini
            val hashCode14 = (hashCode13 + (str6?.hashCode() ?: 0)) * 31
            val str7 = description
            val hashCode15 = (hashCode14 + (str7?.hashCode() ?: 0)) * 31
            val str8 = imdbId
            val hashCode16 = (hashCode15 + (str8?.hashCode() ?: 0)) * 31
            val str9 = cats
            val hashCode17 = (hashCode16 + (str9?.hashCode() ?: 0)) * 31
            val num9: Integer? = year
            val hashCode18: Int = (hashCode17 + if (num9 == null) 0 else num9.hashCode()) * 31
            val num10: Integer? = collect
            val hashCode19: Int = (hashCode18 + if (num10 == null) 0 else num10.hashCode()) * 31
            val num11: Integer? = view
            val hashCode20: Int = (hashCode19 + if (num11 == null) 0 else num11.hashCode()) * 31
            val num12: Integer? = download
            val hashCode21: Int = (hashCode20 + if (num12 == null) 0 else num12.hashCode()) * 31
            val str10 = updateTime
            val hashCode22 = (hashCode21 + (str10?.hashCode() ?: 0)) * 31
            val str11 = released
            val hashCode23 = (hashCode22 + (str11?.hashCode() ?: 0)) * 31
            val num13: Integer? = releasedTimestamp
            val hashCode24: Int = (hashCode23 + if (num13 == null) 0 else num13.hashCode()) * 31
            val str12 = episodeReleased
            val hashCode25 = (hashCode24 + (str12?.hashCode() ?: 0)) * 31
            val num14: Integer? = episodeReleasedTimestamp
            val hashCode26: Int = (hashCode25 + if (num14 == null) 0 else num14.hashCode()) * 31
            val num15: Integer? = maxSeason
            val hashCode27: Int = (hashCode26 + if (num15 == null) 0 else num15.hashCode()) * 31
            val num16: Integer? = maxEpisode
            val hashCode28: Int = (hashCode27 + if (num16 == null) 0 else num16.hashCode()) * 31
            val str13 = remark
            val hashCode29 = (hashCode28 + (str13?.hashCode() ?: 0)) * 31
            val str14 = imdbRating
            val hashCode30 = (hashCode29 + (str14?.hashCode() ?: 0)) * 31
            val str15 = contentRating
            val hashCode31 = (hashCode30 + (str15?.hashCode() ?: 0)) * 31
            val num17: Integer? = tmdbId
            val hashCode32: Int = (hashCode31 + if (num17 == null) 0 else num17.hashCode()) * 31
            val str16 = tomatoUrl
            val hashCode33 = (hashCode32 + (str16?.hashCode() ?: 0)) * 31
            val num18: Integer? = tomatoMeter
            val hashCode34: Int = (hashCode33 + if (num18 == null) 0 else num18.hashCode()) * 31
            val num19: Integer? = tomatoMeterCount
            val hashCode35: Int = (hashCode34 + if (num19 == null) 0 else num19.hashCode()) * 31
            val str17 = tomatoMeterState
            val hashCode36 = (hashCode35 + (str17?.hashCode() ?: 0)) * 31
            val str18 = reelgoodUrl
            val hashCode37 = (hashCode36 + (str18?.hashCode() ?: 0)) * 31
            val num20: Integer? = audienceScore
            val hashCode38: Int = (hashCode37 + if (num20 == null) 0 else num20.hashCode()) * 31
            val num21: Integer? = audienceScoreCount
            val hashCode39: Int = (hashCode38 + if (num21 == null) 0 else num21.hashCode()) * 31
            val num22: Integer? = noTomatoUrl
            val hashCode40: Int = (hashCode39 + if (num22 == null) 0 else num22.hashCode()) * 31
            val num23: Integer? = orderYear
            val hashCode41: Int = (hashCode40 + if (num23 == null) 0 else num23.hashCode()) * 31
            val str19 = episodateId
            val hashCode42 = (hashCode41 + (str19?.hashCode() ?: 0)) * 31
            val d = weightsDay
            val hashCode43 = (hashCode42 + (d?.hashCode() ?: 0)) * 31
            val str20 = posterMin
            val hashCode44 = (hashCode43 + (str20?.hashCode() ?: 0)) * 31
            val str21 = posterOrg
            val hashCode45 = (hashCode44 + (str21?.hashCode() ?: 0)) * 31
            val str22 = bannerMiniMin
            val hashCode46 = (hashCode45 + (str22?.hashCode() ?: 0)) * 31
            val str23 = bannerMiniOrg
            val hashCode47 = (hashCode46 + (str23?.hashCode() ?: 0)) * 31
            val str24 = trailerUrl
            val hashCode48: Int = ((((hashCode47 + (str24?.hashCode()
                ?: 0)) * 31 + years.hashCode()) * 31 + season.hashCode()) * 31 + history.hashCode()) * 31
            val str25 = imdbLink
            val hashCode49: Int = (((hashCode48 + (str25?.hashCode()
                ?: 0)) * 31 + episode.hashCode()) * 31 + language.hashCode()) * 31
            val num24: Integer? = boxType
            val hashCode50: Int = (hashCode49 + if (num24 == null) 0 else num24.hashCode()) * 31
            val str26 = yearYear
            val hashCode51 = (hashCode50 + (str26?.hashCode() ?: 0)) * 31
            val str27 = seasonEpisode
            return hashCode51 + (str27?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "SeriesData(id=" + f9980id + ", mbId=" + mbId + ", title=" + title + ", display=" + display + ", state=" + state + ", vipOnly=" + vipOnly + ", codeFile=" + codeFile + ", director=" + director + ", writer=" + writer + ", actors=" + actors + ", addTime=" + addTime + ", poster=" + poster + ", posterImdb=" + posterImdb + ", bannerMini=" + bannerMini + ", description=" + description + ", imdbId=" + imdbId + ", cats=" + cats + ", year=" + year + ", collect=" + collect + ", view=" + view + ", download=" + download + ", updateTime=" + updateTime + ", released=" + released + ", releasedTimestamp=" + releasedTimestamp + ", episodeReleased=" + episodeReleased + ", episodeReleasedTimestamp=" + episodeReleasedTimestamp + ", maxSeason=" + maxSeason + ", maxEpisode=" + maxEpisode + ", remark=" + remark + ", imdbRating=" + imdbRating + ", contentRating=" + contentRating + ", tmdbId=" + tmdbId + ", tomatoUrl=" + tomatoUrl + ", tomatoMeter=" + tomatoMeter + ", tomatoMeterCount=" + tomatoMeterCount + ", tomatoMeterState=" + tomatoMeterState + ", reelgoodUrl=" + reelgoodUrl + ", audienceScore=" + audienceScore + ", audienceScoreCount=" + audienceScoreCount + ", noTomatoUrl=" + noTomatoUrl + ", orderYear=" + orderYear + ", episodateId=" + episodateId + ", weightsDay=" + weightsDay + ", posterMin=" + posterMin + ", posterOrg=" + posterOrg + ", bannerMiniMin=" + bannerMiniMin + ", bannerMiniOrg=" + bannerMiniOrg + ", trailerUrl=" + trailerUrl + ", years=" + years + ", season=" + season + ", history=" + history + ", imdbLink=" + imdbLink + ", episode=" + episode + ", language=" + language + ", boxType=" + boxType + ", yearYear=" + yearYear + ", seasonEpisode=" + seasonEpisode + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(years, "years")
            Intrinsics.checkNotNullParameter(season, "season")
            Intrinsics.checkNotNullParameter(history, "history")
            Intrinsics.checkNotNullParameter(episode, "episode")
            Intrinsics.checkNotNullParameter(language, "language")
            f9980id = num
            mbId = num2
            title = str
            display = num3
            state = num4
            vipOnly = num5
            codeFile = num6
            director = str2
            writer = str3
            actors = str4
            addTime = num7
            poster = str5
            posterImdb = num8
            bannerMini = str6
            description = str7
            imdbId = str8
            cats = str9
            year = num9
            collect = num10
            view = num11
            download = num12
            updateTime = str10
            released = str11
            releasedTimestamp = num13
            episodeReleased = str12
            episodeReleasedTimestamp = num14
            maxSeason = num15
            maxEpisode = num16
            remark = str13
            imdbRating = str14
            contentRating = str15
            tmdbId = num17
            tomatoUrl = str16
            tomatoMeter = num18
            tomatoMeterCount = num19
            tomatoMeterState = str17
            reelgoodUrl = str18
            audienceScore = num20
            audienceScoreCount = num21
            noTomatoUrl = num22
            orderYear = num23
            episodateId = str19
            weightsDay = d
            posterMin = str20
            posterOrg = str21
            bannerMiniMin = str22
            bannerMiniOrg = str23
            trailerUrl = str24
            this.years = years
            this.season = season
            this.history = history
            imdbLink = str25
            this.episode = episode
            this.language = language
            boxType = num24
            yearYear = str26
            seasonEpisode = str27
        }

        val id: Integer?
            get() = f9980id

        fun getMbId(): Integer? {
            return mbId
        }

        fun getDisplay(): Integer? {
            return display
        }

        fun getState(): Integer? {
            return state
        }

        fun getVipOnly(): Integer? {
            return vipOnly
        }

        fun getCodeFile(): Integer? {
            return codeFile
        }

        fun getAddTime(): Integer? {
            return addTime
        }

        fun getPosterImdb(): Integer? {
            return posterImdb
        }

        fun getYear(): Integer? {
            return year
        }

        fun getCollect(): Integer? {
            return collect
        }

        fun getView(): Integer? {
            return view
        }

        fun getDownload(): Integer? {
            return download
        }

        fun getReleasedTimestamp(): Integer? {
            return releasedTimestamp
        }

        fun getEpisodeReleasedTimestamp(): Integer? {
            return episodeReleasedTimestamp
        }

        fun getMaxSeason(): Integer? {
            return maxSeason
        }

        fun getMaxEpisode(): Integer? {
            return maxEpisode
        }

        fun getTmdbId(): Integer? {
            return tmdbId
        }

        fun getTomatoMeter(): Integer? {
            return tomatoMeter
        }

        fun getTomatoMeterCount(): Integer? {
            return tomatoMeterCount
        }

        fun getAudienceScore(): Integer? {
            return audienceScore
        }

        fun getAudienceScoreCount(): Integer? {
            return audienceScoreCount
        }

        fun getNoTomatoUrl(): Integer? {
            return noTomatoUrl
        }

        fun getOrderYear(): Integer? {
            return orderYear
        }

        @JvmOverloads
                /* synthetic */   constructor(
            num: Integer? = null,
            num2: Integer? = null,
            str: String? = null,
            num3: Integer? = null,
            num4: Integer? = null,
            num5: Integer? = null,
            num6: Integer? = null,
            str2: String? = null,
            str3: String? = null,
            str4: String? = null,
            num7: Integer? = null,
            str5: String? = null,
            num8: Integer? = null,
            str6: String? = null,
            str7: String? = null,
            str8: String? = null,
            str9: String? = null,
            num9: Integer? = null,
            num10: Integer? = null,
            num11: Integer? = null,
            num12: Integer? = null,
            str10: String? = null,
            str11: String? = null,
            num13: Integer? = null,
            str12: String? = null,
            num14: Integer? = null,
            num15: Integer? = null,
            num16: Integer? = null,
            str13: String? = null,
            str14: String? = null,
            str15: String? = null,
            num17: Integer? = null,
            str16: String? = null,
            num18: Integer? = null,
            num19: Integer? = null,
            str17: String? = null,
            str18: String? = null,
            num20: Integer? = null,
            num21: Integer? = null,
            num22: Integer? = null,
            num23: Integer? = null,
            str19: String? = null,
            d: Double? = null,
            str20: String? = null,
            str21: String? = null,
            str22: String? = null,
            str23: String? = null,
            str24: String? = null,
            arrayList: ArrayList? = null,
            arrayList2: ArrayList? = null,
            arrayList3: ArrayList? = null,
            str25: String? = null,
            arrayList4: ArrayList? = null,
            arrayList5: ArrayList? = null,
            num24: Integer? = null,
            str26: String? = null,
            str27: String? = null,
            i: Int = -1,
            i2: Int = 33554431,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) null else num,
            if (i and 2 != 0) null else num2,
            if (i and 4 != 0) null else str,
            if (i and 8 != 0) null else num3,
            if (i and 16 != 0) null else num4,
            if (i and 32 != 0) null else num5,
            if (i and 64 != 0) null else num6,
            if (i and 128 != 0) null else str2,
            if (i and 256 != 0) null else str3,
            if (i and 512 != 0) null else str4,
            if (i and 1024 != 0) null else num7,
            if (i and 2048 != 0) null else str5,
            if (i and 4096 != 0) null else num8,
            if (i and 8192 != 0) null else str6,
            if (i and 16384 != 0) null else str7,
            if (i and 32768 != 0) null else str8,
            if (i and 65536 != 0) null else str9,
            if (i and 131072 != 0) null else num9,
            if (i and 262144 != 0) null else num10,
            if (i and 524288 != 0) null else num11,
            if (i and 1048576 != 0) null else num12,
            if (i and 2097152 != 0) null else str10,
            if (i and 4194304 != 0) null else str11,
            if (i and 8388608 != 0) null else num13,
            if (i and 16777216 != 0) null else str12,
            if (i and 33554432 != 0) null else num14,
            if (i and 67108864 != 0) null else num15,
            if (i and 134217728 != 0) null else num16,
            if (i and 268435456 != 0) null else str13,
            if (i and 536870912 != 0) null else str14,
            if (i and 1073741824 != 0) null else str15,
            if (i and Integer.MIN_VALUE !== 0) null else num17,
            if (i2 and 1 != 0) null else str16,
            if (i2 and 2 != 0) null else num18,
            if (i2 and 4 != 0) null else num19,
            if (i2 and 8 != 0) null else str17,
            if (i2 and 16 != 0) null else str18,
            if (i2 and 32 != 0) null else num20,
            if (i2 and 64 != 0) null else num21,
            if (i2 and 128 != 0) null else num22,
            if (i2 and 256 != 0) null else num23,
            if (i2 and 512 != 0) null else str19,
            if (i2 and 1024 != 0) null else d,
            if (i2 and 2048 != 0) null else str20,
            if (i2 and 4096 != 0) null else str21,
            if (i2 and 8192 != 0) null else str22,
            if (i2 and 16384 != 0) null else str23,
            if (i2 and 32768 != 0) null else str24,
            if (i2 and 65536 != 0) ArrayList() else arrayList,
            if (i2 and 131072 != 0) ArrayList() else arrayList2,
            if (i2 and 262144 != 0) ArrayList() else arrayList3,
            if (i2 and 524288 != 0) null else str25,
            if (i2 and 1048576 != 0) ArrayList() else arrayList4,
            if (i2 and 2097152 != 0) ArrayList() else arrayList5,
            if (i2 and 4194304 != 0) null else num24,
            if (i2 and 8388608 != 0) null else str26,
            if (i2 and 16777216 != 0) null else str27
        ) {
        }

        fun getYears(): ArrayList<Integer> {
            return years
        }

        fun getSeason(): ArrayList<Integer> {
            return season
        }

        fun getHistory(): ArrayList<String> {
            return history
        }

        fun getEpisode(): ArrayList<SeriesEpisode> {
            return episode
        }

        fun getLanguage(): ArrayList<SeriesLanguage> {
            return language
        }

        fun getBoxType(): Integer? {
            return boxType
        }
    }

    /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */ /* JADX WARN: Removed duplicated region for block: B:19:0x009a  */ /* JADX WARN: Removed duplicated region for block: B:34:0x012d  */ /* JADX WARN: Removed duplicated region for block: B:44:0x0167  */ /* JADX WARN: Removed duplicated region for block: B:52:0x01d2  */ /* JADX WARN: Removed duplicated region for block: B:55:0x01f2  */ /* JADX WARN: Removed duplicated region for block: B:61:0x027c  */ /* JADX WARN: Removed duplicated region for block: B:63:0x0288  */ /* JADX WARN: Removed duplicated region for block: B:97:0x035f  */ /* JADX WARN: Type inference failed for: r10v10, types: [java.util.Collection] */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0253 -> B:59:0x025b). Please submit an issue!!! */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun load(r33: String?, r34: Continuation<in LoadResponse?>?): Any {
        /*
            Method dump skipped, instructions count: 869
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.SuperStream.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: SuperStream.kt */
    @Metadata(
        m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ:\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000cR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\r\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000c¨\u0006\u001b"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$LinkData;", "", "id", "", "type", "season", "episode", "(IILjava/lang/Integer;Ljava/lang/Integer;)V", "getEpisode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId", "()I", "getSeason", "getType", "component1", "component2", "component3", "component4", "copy", "(IILjava/lang/Integer;Ljava/lang/Integer;)Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$LinkData;", "equals", "", "other", "hashCode", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class LinkData(/* renamed from: id */
        val id: Int, val type: Int, num: Integer, num2: Integer
    ) {
        private val episode: Integer
        private val season: Integer
        operator fun component1(): Int {
            return id
        }

        operator fun component2(): Int {
            return type
        }

        operator fun component3(): Integer {
            return season
        }

        operator fun component4(): Integer {
            return episode
        }

        fun copy(i: Int, i2: Int, num: Integer, num2: Integer): LinkData {
            return LinkData(i, i2, num, num2)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is LinkData) {
                val linkData = obj as LinkData
                return id == linkData.id && type == linkData.type && Intrinsics.areEqual(
                    season, linkData.season
                ) && Intrinsics.areEqual(episode, linkData.episode)
            }
            return false
        }

        override fun hashCode(): Int {
            val i = (id * 31 + type) * 31
            val num: Integer = season
            val hashCode: Int = (i + if (num == null) 0 else num.hashCode()) * 31
            val num2: Integer = episode
            return hashCode + if (num2 != null) num2.hashCode() else 0
        }

        override fun toString(): String {
            return "LinkData(id=" + id + ", type=" + type + ", season=" + season + ", episode=" + episode + ')'
        }

        init {
            season = num
            episode = num2
        }

        fun getSeason(): Integer {
            return season
        }

        fun getEpisode(): Integer {
            return episode
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                linkData: LinkData,
                i: Int,
                i2: Int,
                num: Integer,
                num2: Integer,
                i3: Int,
                obj: Object?
            ): LinkData {
                var i = i
                var i2 = i2
                var num: Integer = num
                var num2: Integer = num2
                if (i3 and 1 != 0) {
                    i = linkData.id
                }
                if (i3 and 2 != 0) {
                    i2 = linkData.type
                }
                if (i3 and 4 != 0) {
                    num = linkData.season
                }
                if (i3 and 8 != 0) {
                    num2 = linkData.episode
                }
                return linkData.copy(i, i2, num, num2)
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: SuperStream.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0013\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$LinkDataProp;", "", "code", "", NotificationCompat.CATEGORY_MESSAGE, "", "data", "Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$ParsedLinkData;", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$ParsedLinkData;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getData", "()Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$ParsedLinkData;", "getMsg", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$ParsedLinkData;)Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$LinkDataProp;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class LinkDataProp(
        @JsonProperty("code") num: Integer?,
        @JsonProperty("msg") str: String?,
        @JsonProperty("data") parsedLinkData: ParsedLinkData
    ) {
        private val code: Integer?
        val data: ParsedLinkData
        val msg: String?
        operator fun component1(): Integer? {
            return code
        }

        operator fun component2(): String? {
            return msg
        }

        operator fun component3(): ParsedLinkData {
            return data
        }

        fun copy(
            @JsonProperty("code") num: Integer?,
            @JsonProperty("msg") str: String?,
            @JsonProperty("data") parsedLinkData: ParsedLinkData
        ): LinkDataProp {
            return LinkDataProp(num, str, parsedLinkData)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is LinkDataProp) {
                val linkDataProp = obj as LinkDataProp
                return Intrinsics.areEqual(code, linkDataProp.code) && Intrinsics.areEqual(
                    msg, linkDataProp.msg
                ) && Intrinsics.areEqual(data, linkDataProp.data)
            }
            return false
        }

        override fun hashCode(): Int {
            val num: Integer? = code
            val hashCode = (if (num == null) 0 else num.hashCode()) * 31
            val str = msg
            val hashCode2 = (hashCode + (str?.hashCode() ?: 0)) * 31
            val parsedLinkData = data
            return hashCode2 + (parsedLinkData?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "LinkDataProp(code=" + code + ", msg=" + msg + ", data=" + data + ')'
        }

        init {
            code = num
            msg = str
            data = parsedLinkData
        }

        fun getCode(): Integer? {
            return code
        }

        @JvmOverloads
                /* synthetic */   constructor(
            num: Integer? = null,
            str: String? = null,
            parsedLinkData: ParsedLinkData? = null,
            i: Int = 7,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) null else num,
            if (i and 2 != 0) null else str,
            if (i and 4 != 0) ParsedLinkData(null, null, null, 7, null) else parsedLinkData
        ) {
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                linkDataProp: LinkDataProp,
                num: Integer?,
                str: String?,
                parsedLinkData: ParsedLinkData,
                i: Int,
                obj: Object?
            ): LinkDataProp {
                var num: Integer? = num
                var str = str
                var parsedLinkData = parsedLinkData
                if (i and 1 != 0) {
                    num = linkDataProp.code
                }
                if (i and 2 != 0) {
                    str = linkDataProp.msg
                }
                if (i and 4 != 0) {
                    parsedLinkData = linkDataProp.data
                }
                return linkDataProp.copy(num, str, parsedLinkData)
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: SuperStream.kt */
    @Metadata(
        m108d1 = ["\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\bD\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u008d\u0002\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u001bJ\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00109\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010:\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010=\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010>\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010?\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010@\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010A\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010E\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010J\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010K\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010L\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0096\u0002\u0010M\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010NJ\u0013\u0010O\u001a\u00020P2\b\u0010Q\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010R\u001a\u00020\u000bHÖ\u0001J\t\u0010S\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b!\u0010\u001fR\u0015\u0010\u000c\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b%\u0010\u001fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b(\u0010\u001fR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b)\u0010\u001fR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b*\u0010\u001fR\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b+\u0010\u001fR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b,\u0010\u001fR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b-\u0010\u001fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001dR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001dR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001dR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010$\u001a\u0004\b2\u0010#R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b3\u0010\u001fR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b4\u0010\u001fR\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b5\u0010\u001fR\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b6\u0010\u001f¨\u0006T"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$LinkList;", "", "path", "", "quality", "realQuality", "format", "size", "sizeBytes", "", "count", "", "dateline", "fid", "mmfid", "h265", "hdr", "filename", "original", "colorbit", "success", "timeout", "vipLink", "fps", "bitstream", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getBitstream", "()Ljava/lang/String;", "getColorbit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCount", "getDateline", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFid", "getFilename", "getFormat", "getFps", "getH265", "getHdr", "getHeight", "getMmfid", "getOriginal", "getPath", "getQuality", "getRealQuality", "getSize", "getSizeBytes", "getSuccess", "getTimeout", "getVipLink", "getWidth", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$LinkList;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class LinkList(
        @param:JsonProperty("path") val path: String?,
        @param:JsonProperty(
            "quality"
        ) val quality: String?,
        @param:JsonProperty("real_quality") val realQuality: String?,
        @param:JsonProperty(
            "format"
        ) val format: String?,
        @param:JsonProperty("size") val size: String?,
        @param:JsonProperty("size_bytes") val sizeBytes: Long?,
        @JsonProperty("count") num: Integer?,
        @JsonProperty("dateline") l2: Long?,
        @JsonProperty("fid") num2: Integer?,
        @JsonProperty("mmfid") num3: Integer?,
        @JsonProperty("h265") num4: Integer?,
        @JsonProperty("hdr") num5: Integer?,
        @JsonProperty("filename") str6: String?,
        @JsonProperty("original") num6: Integer?,
        @JsonProperty("colorbit") num7: Integer?,
        @JsonProperty("success") num8: Integer?,
        @JsonProperty("timeout") num9: Integer?,
        @JsonProperty("vip_link") num10: Integer?,
        @JsonProperty("fps") num11: Integer?,
        @JsonProperty("bitstream") str7: String?,
        @JsonProperty("width") num12: Integer?,
        @JsonProperty("height") num13: Integer?
    ) {
        val bitstream: String?
        private val colorbit: Integer?
        private val count: Integer?
        val dateline: Long?
        private val fid: Integer?
        val filename: String?
        private val fps: Integer?
        private val h265: Integer?
        private val hdr: Integer?
        private val height: Integer?
        private val mmfid: Integer?
        private val original: Integer?
        private val success: Integer?
        private val timeout: Integer?
        private val vipLink: Integer?
        private val width: Integer?
        operator fun component1(): String? {
            return path
        }

        operator fun component10(): Integer? {
            return mmfid
        }

        operator fun component11(): Integer? {
            return h265
        }

        operator fun component12(): Integer? {
            return hdr
        }

        operator fun component13(): String? {
            return filename
        }

        operator fun component14(): Integer? {
            return original
        }

        operator fun component15(): Integer? {
            return colorbit
        }

        operator fun component16(): Integer? {
            return success
        }

        operator fun component17(): Integer? {
            return timeout
        }

        operator fun component18(): Integer? {
            return vipLink
        }

        operator fun component19(): Integer? {
            return fps
        }

        operator fun component2(): String? {
            return quality
        }

        operator fun component20(): String? {
            return bitstream
        }

        operator fun component21(): Integer? {
            return width
        }

        operator fun component22(): Integer? {
            return height
        }

        operator fun component3(): String? {
            return realQuality
        }

        operator fun component4(): String? {
            return format
        }

        operator fun component5(): String? {
            return size
        }

        operator fun component6(): Long? {
            return sizeBytes
        }

        operator fun component7(): Integer? {
            return count
        }

        operator fun component8(): Long? {
            return dateline
        }

        operator fun component9(): Integer? {
            return fid
        }

        fun copy(
            @JsonProperty("path") str: String?,
            @JsonProperty("quality") str2: String?,
            @JsonProperty("real_quality") str3: String?,
            @JsonProperty("format") str4: String?,
            @JsonProperty("size") str5: String?,
            @JsonProperty("size_bytes") l: Long?,
            @JsonProperty("count") num: Integer?,
            @JsonProperty("dateline") l2: Long?,
            @JsonProperty("fid") num2: Integer?,
            @JsonProperty("mmfid") num3: Integer?,
            @JsonProperty("h265") num4: Integer?,
            @JsonProperty("hdr") num5: Integer?,
            @JsonProperty("filename") str6: String?,
            @JsonProperty("original") num6: Integer?,
            @JsonProperty("colorbit") num7: Integer?,
            @JsonProperty("success") num8: Integer?,
            @JsonProperty("timeout") num9: Integer?,
            @JsonProperty("vip_link") num10: Integer?,
            @JsonProperty("fps") num11: Integer?,
            @JsonProperty("bitstream") str7: String?,
            @JsonProperty("width") num12: Integer?,
            @JsonProperty("height") num13: Integer?
        ): LinkList {
            return LinkList(
                str,
                str2,
                str3,
                str4,
                str5,
                l,
                num,
                l2,
                num2,
                num3,
                num4,
                num5,
                str6,
                num6,
                num7,
                num8,
                num9,
                num10,
                num11,
                str7,
                num12,
                num13
            )
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is LinkList) {
                val linkList = obj as LinkList
                return Intrinsics.areEqual(path, linkList.path) && Intrinsics.areEqual(
                    quality, linkList.quality
                ) && Intrinsics.areEqual(
                    realQuality, linkList.realQuality
                ) && Intrinsics.areEqual(
                    format, linkList.format
                ) && Intrinsics.areEqual(size, linkList.size) && Intrinsics.areEqual(
                    sizeBytes, linkList.sizeBytes
                ) && Intrinsics.areEqual(count, linkList.count) && Intrinsics.areEqual(
                    dateline, linkList.dateline
                ) && Intrinsics.areEqual(fid, linkList.fid) && Intrinsics.areEqual(
                    mmfid, linkList.mmfid
                ) && Intrinsics.areEqual(h265, linkList.h265) && Intrinsics.areEqual(
                    hdr, linkList.hdr
                ) && Intrinsics.areEqual(filename, linkList.filename) && Intrinsics.areEqual(
                    original, linkList.original
                ) && Intrinsics.areEqual(colorbit, linkList.colorbit) && Intrinsics.areEqual(
                    success, linkList.success
                ) && Intrinsics.areEqual(timeout, linkList.timeout) && Intrinsics.areEqual(
                    vipLink, linkList.vipLink
                ) && Intrinsics.areEqual(fps, linkList.fps) && Intrinsics.areEqual(
                    bitstream, linkList.bitstream
                ) && Intrinsics.areEqual(width, linkList.width) && Intrinsics.areEqual(
                    height, linkList.height
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val str = path
            val hashCode = (str?.hashCode() ?: 0) * 31
            val str2 = quality
            val hashCode2 = (hashCode + (str2?.hashCode() ?: 0)) * 31
            val str3 = realQuality
            val hashCode3 = (hashCode2 + (str3?.hashCode() ?: 0)) * 31
            val str4 = format
            val hashCode4 = (hashCode3 + (str4?.hashCode() ?: 0)) * 31
            val str5 = size
            val hashCode5 = (hashCode4 + (str5?.hashCode() ?: 0)) * 31
            val l = sizeBytes
            val hashCode6 = (hashCode5 + (l?.hashCode() ?: 0)) * 31
            val num: Integer? = count
            val hashCode7: Int = (hashCode6 + if (num == null) 0 else num.hashCode()) * 31
            val l2 = dateline
            val hashCode8 = (hashCode7 + (l2?.hashCode() ?: 0)) * 31
            val num2: Integer? = fid
            val hashCode9: Int = (hashCode8 + if (num2 == null) 0 else num2.hashCode()) * 31
            val num3: Integer? = mmfid
            val hashCode10: Int = (hashCode9 + if (num3 == null) 0 else num3.hashCode()) * 31
            val num4: Integer? = h265
            val hashCode11: Int = (hashCode10 + if (num4 == null) 0 else num4.hashCode()) * 31
            val num5: Integer? = hdr
            val hashCode12: Int = (hashCode11 + if (num5 == null) 0 else num5.hashCode()) * 31
            val str6 = filename
            val hashCode13 = (hashCode12 + (str6?.hashCode() ?: 0)) * 31
            val num6: Integer? = original
            val hashCode14: Int = (hashCode13 + if (num6 == null) 0 else num6.hashCode()) * 31
            val num7: Integer? = colorbit
            val hashCode15: Int = (hashCode14 + if (num7 == null) 0 else num7.hashCode()) * 31
            val num8: Integer? = success
            val hashCode16: Int = (hashCode15 + if (num8 == null) 0 else num8.hashCode()) * 31
            val num9: Integer? = timeout
            val hashCode17: Int = (hashCode16 + if (num9 == null) 0 else num9.hashCode()) * 31
            val num10: Integer? = vipLink
            val hashCode18: Int = (hashCode17 + if (num10 == null) 0 else num10.hashCode()) * 31
            val num11: Integer? = fps
            val hashCode19: Int = (hashCode18 + if (num11 == null) 0 else num11.hashCode()) * 31
            val str7 = bitstream
            val hashCode20 = (hashCode19 + (str7?.hashCode() ?: 0)) * 31
            val num12: Integer? = width
            val hashCode21: Int = (hashCode20 + if (num12 == null) 0 else num12.hashCode()) * 31
            val num13: Integer? = height
            return hashCode21 + if (num13 != null) num13.hashCode() else 0
        }

        override fun toString(): String {
            return "LinkList(path=" + path + ", quality=" + quality + ", realQuality=" + realQuality + ", format=" + format + ", size=" + size + ", sizeBytes=" + sizeBytes + ", count=" + count + ", dateline=" + dateline + ", fid=" + fid + ", mmfid=" + mmfid + ", h265=" + h265 + ", hdr=" + hdr + ", filename=" + filename + ", original=" + original + ", colorbit=" + colorbit + ", success=" + success + ", timeout=" + timeout + ", vipLink=" + vipLink + ", fps=" + fps + ", bitstream=" + bitstream + ", width=" + width + ", height=" + height + ')'
        }

        init {
            count = num
            dateline = l2
            fid = num2
            mmfid = num3
            h265 = num4
            hdr = num5
            filename = str6
            original = num6
            colorbit = num7
            success = num8
            timeout = num9
            vipLink = num10
            fps = num11
            bitstream = str7
            width = num12
            height = num13
        }

        @JvmOverloads
                /* synthetic */   constructor(
            str: String? = null,
            str2: String? = null,
            str3: String? = null,
            str4: String? = null,
            str5: String? = null,
            l: Long? = null,
            num: Integer? = null,
            l2: Long? = null,
            num2: Integer? = null,
            num3: Integer? = null,
            num4: Integer? = null,
            num5: Integer? = null,
            str6: String? = null,
            num6: Integer? = null,
            num7: Integer? = null,
            num8: Integer? = null,
            num9: Integer? = null,
            num10: Integer? = null,
            num11: Integer? = null,
            str7: String? = null,
            num12: Integer? = null,
            num13: Integer? = null,
            i: Int = 4194303,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) null else str,
            if (i and 2 != 0) null else str2,
            if (i and 4 != 0) null else str3,
            if (i and 8 != 0) null else str4,
            if (i and 16 != 0) null else str5,
            if (i and 32 != 0) null else l,
            if (i and 64 != 0) null else num,
            if (i and 128 != 0) null else l2,
            if (i and 256 != 0) null else num2,
            if (i and 512 != 0) null else num3,
            if (i and 1024 != 0) null else num4,
            if (i and 2048 != 0) null else num5,
            if (i and 4096 != 0) null else str6,
            if (i and 8192 != 0) null else num6,
            if (i and 16384 != 0) null else num7,
            if (i and 32768 != 0) null else num8,
            if (i and 65536 != 0) null else num9,
            if (i and 131072 != 0) null else num10,
            if (i and 262144 != 0) null else num11,
            if (i and 524288 != 0) null else str7,
            if (i and 1048576 != 0) null else num12,
            if (i and 2097152 != 0) null else num13
        ) {
        }

        fun getCount(): Integer? {
            return count
        }

        fun getFid(): Integer? {
            return fid
        }

        fun getMmfid(): Integer? {
            return mmfid
        }

        fun getH265(): Integer? {
            return h265
        }

        fun getHdr(): Integer? {
            return hdr
        }

        fun getOriginal(): Integer? {
            return original
        }

        fun getColorbit(): Integer? {
            return colorbit
        }

        fun getSuccess(): Integer? {
            return success
        }

        fun getTimeout(): Integer? {
            return timeout
        }

        fun getVipLink(): Integer? {
            return vipLink
        }

        fun getFps(): Integer? {
            return fps
        }

        fun getWidth(): Integer? {
            return width
        }

        fun getHeight(): Integer? {
            return height
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: SuperStream.kt */
    @Metadata(
        m108d1 = ["\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001BE\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0003\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0018\b\u0003\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0005j\b\u0012\u0004\u0012\u00020\t`\u0007¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0019\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J\u0019\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0005j\b\u0012\u0004\u0012\u00020\t`\u0007HÆ\u0003JN\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0018\b\u0003\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\u0018\b\u0003\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0005j\b\u0012\u0004\u0012\u00020\t`\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R!\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0005j\b\u0012\u0004\u0012\u00020\t`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000cR!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000cR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$ParsedLinkData;", "", "seconds", "", "quality", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "list", "Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$LinkList;", "(Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "getList", "()Ljava/util/ArrayList;", "getQuality", "getSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/util/ArrayList;)Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$ParsedLinkData;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class ParsedLinkData(
        @JsonProperty("seconds") num: Integer?,
        @JsonProperty("quality") quality: ArrayList<String?>,
        @JsonProperty("list") list: ArrayList<LinkList?>
    ) {
        private val list: ArrayList<LinkList>
        private val quality: ArrayList<String>
        private val seconds: Integer?
        operator fun component1(): Integer? {
            return seconds
        }

        operator fun component2(): ArrayList<String> {
            return quality
        }

        operator fun component3(): ArrayList<LinkList> {
            return list
        }

        fun copy(
            @JsonProperty("seconds") num: Integer?,
            @JsonProperty("quality") quality: ArrayList<String?>,
            @JsonProperty("list") list: ArrayList<LinkList?>
        ): ParsedLinkData {
            Intrinsics.checkNotNullParameter(quality, "quality")
            Intrinsics.checkNotNullParameter(list, "list")
            return ParsedLinkData(num, quality, list)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is ParsedLinkData) {
                val parsedLinkData = obj as ParsedLinkData
                return Intrinsics.areEqual(seconds, parsedLinkData.seconds) && Intrinsics.areEqual(
                    quality, parsedLinkData.quality
                ) && Intrinsics.areEqual(list, parsedLinkData.list)
            }
            return false
        }

        override fun hashCode(): Int {
            val num: Integer? = seconds
            return ((if (num == null) 0 else num.hashCode()) * 31 + quality.hashCode()) * 31 + list.hashCode()
        }

        override fun toString(): String {
            return "ParsedLinkData(seconds=" + seconds + ", quality=" + quality + ", list=" + list + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(quality, "quality")
            Intrinsics.checkNotNullParameter(list, "list")
            seconds = num
            this.quality = quality
            this.list = list
        }

        fun getSeconds(): Integer? {
            return seconds
        }

        @JvmOverloads
                /* synthetic */   constructor(
            num: Integer? = null,
            arrayList: ArrayList? = null,
            arrayList2: ArrayList? = null,
            i: Int = 7,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) null else num,
            if (i and 2 != 0) ArrayList() else arrayList,
            if (i and 4 != 0) ArrayList() else arrayList2
        ) {
        }

        fun getQuality(): ArrayList<String> {
            return quality
        }

        fun getList(): ArrayList<LinkList> {
            return list
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                parsedLinkData: ParsedLinkData,
                num: Integer?,
                arrayList: ArrayList,
                arrayList2: ArrayList,
                i: Int,
                obj: Object?
            ): ParsedLinkData {
                var num: Integer? = num
                var arrayList: ArrayList = arrayList
                var arrayList2: ArrayList = arrayList2
                if (i and 1 != 0) {
                    num = parsedLinkData.seconds
                }
                if (i and 2 != 0) {
                    arrayList = parsedLinkData.quality
                }
                if (i and 4 != 0) {
                    arrayList2 = parsedLinkData.list
                }
                return parsedLinkData.copy(num, arrayList, arrayList2)
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: SuperStream.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0013\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$SubtitleDataProp;", "", "code", "", NotificationCompat.CATEGORY_MESSAGE, "", "data", "Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$PrivateSubtitleData;", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$PrivateSubtitleData;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getData", "()Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$PrivateSubtitleData;", "getMsg", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$PrivateSubtitleData;)Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$SubtitleDataProp;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class SubtitleDataProp(
        @JsonProperty("code") num: Integer?,
        @JsonProperty("msg") str: String?,
        @JsonProperty("data") privateSubtitleData: PrivateSubtitleData
    ) {
        private val code: Integer?
        val data: PrivateSubtitleData
        val msg: String?
        operator fun component1(): Integer? {
            return code
        }

        operator fun component2(): String? {
            return msg
        }

        operator fun component3(): PrivateSubtitleData {
            return data
        }

        fun copy(
            @JsonProperty("code") num: Integer?,
            @JsonProperty("msg") str: String?,
            @JsonProperty("data") privateSubtitleData: PrivateSubtitleData
        ): SubtitleDataProp {
            return SubtitleDataProp(num, str, privateSubtitleData)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is SubtitleDataProp) {
                val subtitleDataProp = obj as SubtitleDataProp
                return Intrinsics.areEqual(code, subtitleDataProp.code) && Intrinsics.areEqual(
                    msg, subtitleDataProp.msg
                ) && Intrinsics.areEqual(data, subtitleDataProp.data)
            }
            return false
        }

        override fun hashCode(): Int {
            val num: Integer? = code
            val hashCode = (if (num == null) 0 else num.hashCode()) * 31
            val str = msg
            val hashCode2 = (hashCode + (str?.hashCode() ?: 0)) * 31
            val privateSubtitleData = data
            return hashCode2 + (privateSubtitleData?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "SubtitleDataProp(code=" + code + ", msg=" + msg + ", data=" + data + ')'
        }

        init {
            code = num
            msg = str
            data = privateSubtitleData
        }

        fun getCode(): Integer? {
            return code
        }

        @JvmOverloads
                /* synthetic */   constructor(
            num: Integer? = null,
            str: String? = null,
            privateSubtitleData: PrivateSubtitleData? = null,
            i: Int = 7,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) null else num,
            if (i and 2 != 0) null else str,
            if (i and 4 != 0) PrivateSubtitleData(null, null, 3, null) else privateSubtitleData
        ) {
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                subtitleDataProp: SubtitleDataProp,
                num: Integer?,
                str: String?,
                privateSubtitleData: PrivateSubtitleData,
                i: Int,
                obj: Object?
            ): SubtitleDataProp {
                var num: Integer? = num
                var str = str
                var privateSubtitleData = privateSubtitleData
                if (i and 1 != 0) {
                    num = subtitleDataProp.code
                }
                if (i and 2 != 0) {
                    str = subtitleDataProp.msg
                }
                if (i and 4 != 0) {
                    privateSubtitleData = subtitleDataProp.data
                }
                return subtitleDataProp.copy(num, str, privateSubtitleData)
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: SuperStream.kt */
    @Metadata(
        m108d1 = ["\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u009e\u0001\u0010/\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u0003HÖ\u0001J\t\u00105\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u000c\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001f\u0010\u0016R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b \u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\"\u0010\u0016¨\u00066"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$Subtitles;", "", "sid", "", "mid", "", "filePath", "lang", "language", "delay", "point", "order", "adminOrder", "myselect", "addTime", "", "count", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;)V", "getAddTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAdminOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCount", "getDelay", "getFilePath", "()Ljava/lang/String;", "getLang", "getLanguage", "getMid", "getMyselect", "getOrder", "getPoint", "getSid", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;)Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$Subtitles;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Subtitles(
        @JsonProperty("sid") num: Integer?,
        @JsonProperty("mid") str: String?,
        @JsonProperty("file_path") str2: String?,
        @JsonProperty("lang") str3: String?,
        @JsonProperty("language") str4: String?,
        @JsonProperty("delay") num2: Integer?,
        @JsonProperty("point") str5: String?,
        @JsonProperty("order") num3: Integer?,
        @JsonProperty("admin_order") num4: Integer?,
        @JsonProperty("myselect") num5: Integer?,
        @JsonProperty("add_time") l: Long?,
        @JsonProperty("count") num6: Integer?
    ) {
        val addTime: Long?
        private val adminOrder: Integer?
        private val count: Integer?
        private val delay: Integer?
        val filePath: String?
        val lang: String?
        val language: String?
        val mid: String?
        private val myselect: Integer?
        private val order: Integer?
        val point: String?
        private val sid: Integer?
        operator fun component1(): Integer? {
            return sid
        }

        operator fun component10(): Integer? {
            return myselect
        }

        operator fun component11(): Long? {
            return addTime
        }

        operator fun component12(): Integer? {
            return count
        }

        operator fun component2(): String? {
            return mid
        }

        operator fun component3(): String? {
            return filePath
        }

        operator fun component4(): String? {
            return lang
        }

        operator fun component5(): String? {
            return language
        }

        operator fun component6(): Integer? {
            return delay
        }

        operator fun component7(): String? {
            return point
        }

        operator fun component8(): Integer? {
            return order
        }

        operator fun component9(): Integer? {
            return adminOrder
        }

        fun copy(
            @JsonProperty("sid") num: Integer?,
            @JsonProperty("mid") str: String?,
            @JsonProperty("file_path") str2: String?,
            @JsonProperty("lang") str3: String?,
            @JsonProperty("language") str4: String?,
            @JsonProperty("delay") num2: Integer?,
            @JsonProperty("point") str5: String?,
            @JsonProperty("order") num3: Integer?,
            @JsonProperty("admin_order") num4: Integer?,
            @JsonProperty("myselect") num5: Integer?,
            @JsonProperty("add_time") l: Long?,
            @JsonProperty("count") num6: Integer?
        ): Subtitles {
            return Subtitles(num, str, str2, str3, str4, num2, str5, num3, num4, num5, l, num6)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Subtitles) {
                val subtitles = obj as Subtitles
                return Intrinsics.areEqual(sid, subtitles.sid) && Intrinsics.areEqual(
                    mid, subtitles.mid
                ) && Intrinsics.areEqual(filePath, subtitles.filePath) && Intrinsics.areEqual(
                    lang, subtitles.lang
                ) && Intrinsics.areEqual(language, subtitles.language) && Intrinsics.areEqual(
                    delay, subtitles.delay
                ) && Intrinsics.areEqual(point, subtitles.point) && Intrinsics.areEqual(
                    order, subtitles.order
                ) && Intrinsics.areEqual(adminOrder, subtitles.adminOrder) && Intrinsics.areEqual(
                    myselect, subtitles.myselect
                ) && Intrinsics.areEqual(addTime, subtitles.addTime) && Intrinsics.areEqual(
                    count, subtitles.count
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val num: Integer? = sid
            val hashCode = (if (num == null) 0 else num.hashCode()) * 31
            val str = mid
            val hashCode2 = (hashCode + (str?.hashCode() ?: 0)) * 31
            val str2 = filePath
            val hashCode3 = (hashCode2 + (str2?.hashCode() ?: 0)) * 31
            val str3 = lang
            val hashCode4 = (hashCode3 + (str3?.hashCode() ?: 0)) * 31
            val str4 = language
            val hashCode5 = (hashCode4 + (str4?.hashCode() ?: 0)) * 31
            val num2: Integer? = delay
            val hashCode6: Int = (hashCode5 + if (num2 == null) 0 else num2.hashCode()) * 31
            val str5 = point
            val hashCode7 = (hashCode6 + (str5?.hashCode() ?: 0)) * 31
            val num3: Integer? = order
            val hashCode8: Int = (hashCode7 + if (num3 == null) 0 else num3.hashCode()) * 31
            val num4: Integer? = adminOrder
            val hashCode9: Int = (hashCode8 + if (num4 == null) 0 else num4.hashCode()) * 31
            val num5: Integer? = myselect
            val hashCode10: Int = (hashCode9 + if (num5 == null) 0 else num5.hashCode()) * 31
            val l = addTime
            val hashCode11 = (hashCode10 + (l?.hashCode() ?: 0)) * 31
            val num6: Integer? = count
            return hashCode11 + if (num6 != null) num6.hashCode() else 0
        }

        override fun toString(): String {
            return "Subtitles(sid=" + sid + ", mid=" + mid + ", filePath=" + filePath + ", lang=" + lang + ", language=" + language + ", delay=" + delay + ", point=" + point + ", order=" + order + ", adminOrder=" + adminOrder + ", myselect=" + myselect + ", addTime=" + addTime + ", count=" + count + ')'
        }

        init {
            sid = num
            mid = str
            filePath = str2
            lang = str3
            language = str4
            delay = num2
            point = str5
            order = num3
            adminOrder = num4
            myselect = num5
            addTime = l
            count = num6
        }

        @JvmOverloads
                /* synthetic */   constructor(
            num: Integer? = null,
            str: String? = null,
            str2: String? = null,
            str3: String? = null,
            str4: String? = null,
            num2: Integer? = null,
            str5: String? = null,
            num3: Integer? = null,
            num4: Integer? = null,
            num5: Integer? = null,
            l: Long? = null,
            num6: Integer? = null,
            i: Int = 4095,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) null else num,
            if (i and 2 != 0) null else str,
            if (i and 4 != 0) null else str2,
            if (i and 8 != 0) null else str3,
            if (i and 16 != 0) null else str4,
            if (i and 32 != 0) null else num2,
            if (i and 64 != 0) null else str5,
            if (i and 128 != 0) null else num3,
            if (i and 256 != 0) null else num4,
            if (i and 512 != 0) null else num5,
            if (i and 1024 != 0) null else l,
            if (i and 2048 == 0) num6 else null
        ) {
        }

        fun getSid(): Integer? {
            return sid
        }

        fun getDelay(): Integer? {
            return delay
        }

        fun getOrder(): Integer? {
            return order
        }

        fun getAdminOrder(): Integer? {
            return adminOrder
        }

        fun getMyselect(): Integer? {
            return myselect
        }

        fun getCount(): Integer? {
            return count
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: SuperStream.kt */
    @Metadata(
        m108d1 = ["\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0003\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0019\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J/\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0018\b\u0003\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000c¨\u0006\u0016"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$SubtitleList;", "", "language", "", "subtitles", "Ljava/util/ArrayList;", "Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$Subtitles;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/util/ArrayList;)V", "getLanguage", "()Ljava/lang/String;", "getSubtitles", "()Ljava/util/ArrayList;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class SubtitleList(
        @JsonProperty("language") str: String?,
        @JsonProperty("subtitles") subtitles: ArrayList<Subtitles?>
    ) {
        val language: String?
        private val subtitles: ArrayList<Subtitles>
        operator fun component1(): String? {
            return language
        }

        operator fun component2(): ArrayList<Subtitles> {
            return subtitles
        }

        fun copy(
            @JsonProperty("language") str: String?,
            @JsonProperty("subtitles") subtitles: ArrayList<Subtitles?>
        ): SubtitleList {
            Intrinsics.checkNotNullParameter(subtitles, "subtitles")
            return SubtitleList(str, subtitles)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is SubtitleList) {
                val subtitleList = obj as SubtitleList
                return Intrinsics.areEqual(language, subtitleList.language) && Intrinsics.areEqual(
                    subtitles, subtitleList.subtitles
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val str = language
            return (str?.hashCode() ?: 0) * 31 + subtitles.hashCode()
        }

        override fun toString(): String {
            return "SubtitleList(language=" + language + ", subtitles=" + subtitles + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(subtitles, "subtitles")
            language = str
            this.subtitles = subtitles
        }

        @JvmOverloads
                /* synthetic */   constructor(
            str: String? = null,
            arrayList: ArrayList? = null,
            i: Int = 3,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(if (i and 1 != 0) null else str, if (i and 2 != 0) ArrayList() else arrayList) {
        }

        fun getSubtitles(): ArrayList<Subtitles> {
            return subtitles
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                subtitleList: SubtitleList,
                str: String?,
                arrayList: ArrayList,
                i: Int,
                obj: Object?
            ): SubtitleList {
                var str = str
                var arrayList: ArrayList = arrayList
                if (i and 1 != 0) {
                    str = subtitleList.language
                }
                if (i and 2 != 0) {
                    arrayList = subtitleList.subtitles
                }
                return subtitleList.copy(str, arrayList)
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: SuperStream.kt */
    @Metadata(
        m108d1 = ["\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B9\u0012\u0018\b\u0003\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0018\b\u0003\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u0005¢\u0006\u0002\u0010\bJ\u0019\u0010\u000c\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\u0019\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u0005HÆ\u0003J=\u0010\u000e\u001a\u00020\u00002\u0018\b\u0003\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u0018\b\u0003\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R!\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$PrivateSubtitleData;", "", "select", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "list", "Lcom/lagradost/cloudstream3/movieproviders/SuperStream\$SubtitleList;", "(Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "getList", "()Ljava/util/ArrayList;", "getSelect", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class PrivateSubtitleData(
        @JsonProperty("select") select: ArrayList<String?>,
        @JsonProperty("list") list: ArrayList<SubtitleList?>
    ) {
        private val list: ArrayList<SubtitleList>
        private val select: ArrayList<String>
        operator fun component1(): ArrayList<String> {
            return select
        }

        operator fun component2(): ArrayList<SubtitleList> {
            return list
        }

        fun copy(
            @JsonProperty("select") select: ArrayList<String?>,
            @JsonProperty("list") list: ArrayList<SubtitleList?>
        ): PrivateSubtitleData {
            Intrinsics.checkNotNullParameter(select, "select")
            Intrinsics.checkNotNullParameter(list, "list")
            return PrivateSubtitleData(select, list)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is PrivateSubtitleData) {
                val privateSubtitleData = obj as PrivateSubtitleData
                return Intrinsics.areEqual(
                    select,
                    privateSubtitleData.select
                ) && Intrinsics.areEqual(
                    list, privateSubtitleData.list
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return select.hashCode() * 31 + list.hashCode()
        }

        override fun toString(): String {
            return "PrivateSubtitleData(select=" + select + ", list=" + list + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(select, "select")
            Intrinsics.checkNotNullParameter(list, "list")
            this.select = select
            this.list = list
        }

        @JvmOverloads
                /* synthetic */   constructor(
            arrayList: ArrayList? = null,
            arrayList2: ArrayList? = null,
            i: Int = 3,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) ArrayList() else arrayList,
            if (i and 2 != 0) ArrayList() else arrayList2
        ) {
        }

        fun getSelect(): ArrayList<String> {
            return select
        }

        fun getList(): ArrayList<SubtitleList> {
            return list
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                privateSubtitleData: PrivateSubtitleData,
                arrayList: ArrayList,
                arrayList2: ArrayList,
                i: Int,
                obj: Object?
            ): PrivateSubtitleData {
                var arrayList: ArrayList = arrayList
                var arrayList2: ArrayList = arrayList2
                if (i and 1 != 0) {
                    arrayList = privateSubtitleData.select
                }
                if (i and 2 != 0) {
                    arrayList2 = privateSubtitleData.list
                }
                return privateSubtitleData.copy(arrayList, arrayList2)
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */ /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */ /* JADX WARN: Removed duplicated region for block: B:35:0x013c  */ /* JADX WARN: Removed duplicated region for block: B:46:0x0166  */ /* JADX WARN: Removed duplicated region for block: B:55:0x017e  */ /* JADX WARN: Removed duplicated region for block: B:59:0x0192  */ /* JADX WARN: Removed duplicated region for block: B:60:0x01c9  */ /* JADX WARN: Removed duplicated region for block: B:63:0x0221 A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:64:0x0222  */ /* JADX WARN: Removed duplicated region for block: B:72:0x0254  */ /* JADX WARN: Removed duplicated region for block: B:96:0x0179 A[SYNTHETIC] */
    @Override // com.lagradost.cloudstream3.MainAPI
            /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */    fun loadLinks(
        r11: String?,
        r12: Boolean,
        r13: Function1<SubtitleFile?, Unit>?,
        r14: Function1<ExtractorLink?, Unit>?,
        r15: Continuation<in Boolean?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.SuperStream.loadLinks(java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
    }

    companion object {
        private fun `loadLinks$toExtractorLink`(
            linkList: LinkList,
            superStream: SuperStream
        ): ExtractorLink? {
            val path = linkList.path
            if (path == null || StringsKt.isBlank(path)) {
                return null
            }
            val name = superStream.name
            var size = linkList.size
            if (size == null) {
                size = ""
            }
            return ExtractorLink(
                name,
                size,
                StringsKt.`replace$default`(linkList.path, "\\/", "", false, 4, null as Object?),
                "",
                ExtractorApiKt.getQualityFromName(linkList.quality),
                false,
                null,
                null,
                224,
                null
            )
        }

        private fun `loadLinks$toSubtitleFile`(subtitles: Subtitles): SubtitleFile? {
            var language = subtitles.language
            if (language == null && subtitles.lang.also { language = it } == null) {
                language = ""
            }
            val str = language
            val filePath = subtitles.filePath ?: return null
            return SubtitleFile(str, filePath, null, 4, null)
        }
    }
}