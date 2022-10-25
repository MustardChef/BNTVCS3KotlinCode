package com.lagradost.cloudstream3

import android.util.Base64
import com.lagradost.cloudstream3.utils.AppUtils
import kotlin.jvm.internal.Intrinsics

/* compiled from: MainAPI.kt */
@Metadata(
    m108d1 = ["\u0000À\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0007\u001a\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0004H\u0007\u001a\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0010H\u0007\u001a\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004\u001a\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u001a\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u001a\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004\u001a\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u00012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u001c\u001a\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u001a\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u00042\u0006\u0010 \u001a\u00020\u0004\u001a\u0012\u0010!\u001a\u0004\u0018\u00010\u00042\b\u0010 \u001a\u0004\u0018\u00010\u0004\u001a\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00172\u000c\u0010$\u001a\b\u0012\u0004\u0012\u00020#0%\u001a\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u00172\u000c\u0010(\u001a\b\u0012\u0004\u0012\u00020'0%\u001a\u0014\u0010)\u001a\u00020**\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-\u001a\u001e\u0010)\u001a\u00020**\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010.\u001a\u00020\u0004\u001a\u0019\u0010/\u001a\u00020**\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u00102\u001a#\u00103\u001a\u00020**\u0002002\u0006\u00104\u001a\u0002052\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u00106\u001a7\u00103\u001a\u00020**\u0002002\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u0002082\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010<\u001a#\u00103\u001a\u00020**\u0002002\u0006\u0010=\u001a\u0002082\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010>\u001a#\u00103\u001a\u00020**\u0002002\u0006\u00104\u001a\u00020\u00042\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010?\u001a\"\u0010@\u001a\u00020**\u00020A2\u0006\u00104\u001a\u0002052\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u0017\u001a,\u0010B\u001a\u00020**\u00020C2\b\u0010 \u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010E\u001a,\u0010B\u001a\u00020**\u00020F2\b\u0010 \u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010E\u001a\u0012\u0010G\u001a\u00020**\u00020F2\u0006\u0010H\u001a\u00020\u0004\u001a\u0019\u0010I\u001a\u00020**\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u00102\u001a\u0012\u0010J\u001a\u00020\u0004*\u00020K2\u0006\u0010 \u001a\u00020\u0004\u001a\u0016\u0010L\u001a\u0004\u0018\u00010\u0004*\u00020K2\b\u0010 \u001a\u0004\u0018\u00010\u0004\u001a\u000c\u0010M\u001a\u000208*\u0004\u0018\u00010C\u001a\n\u0010N\u001a\u000208*\u00020O\u001a\u000c\u0010P\u001a\u000208*\u0004\u0018\u00010C\u001a\u000c\u0010P\u001a\u000208*\u0004\u0018\u00010O\u001a\n\u0010Q\u001a\u000208*\u00020O\u001aG\u0010R\u001a\u00020A*\u00020K2\u0006\u0010S\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010T\u001a\u00020O2\b\b\u0002\u0010U\u001a\u0002082\u0019\b\u0002\u0010V\u001a\u0013\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020*0W¢\u0006\u0002\bX\u001aI\u0010Y\u001a\u000200*\u00020K2\u0006\u0010S\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\b\b\u0002\u0010T\u001a\u00020O2\b\b\u0002\u0010Z\u001a\u0002082\u0019\b\u0002\u0010V\u001a\u0013\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020*0W¢\u0006\u0002\bX\u001a8\u0010[\u001a\u00020+\"\u0004\b\u0000\u0010\\*\u00020K2\u0006\u0010]\u001a\u0002H\\2\u0019\b\u0002\u0010V\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020*0W¢\u0006\u0002\bX¢\u0006\u0002\u0010^\u001a7\u0010[\u001a\u00020+*\u00020K2\u0006\u0010 \u001a\u00020\u00042\u0019\b\u0002\u0010V\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020*0W¢\u0006\u0002\bX2\b\b\u0002\u0010Z\u001a\u000208\u001aR\u0010_\u001a\u00020`\"\u0004\b\u0000\u0010\\*\u00020K2\u0006\u0010S\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010T\u001a\u00020O2\b\u0010]\u001a\u0004\u0018\u0001H\\2\u0019\b\u0002\u0010V\u001a\u0013\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020*0W¢\u0006\u0002\bX¢\u0006\u0002\u0010a\u001aE\u0010_\u001a\u00020`*\u00020K2\u0006\u0010S\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010T\u001a\u00020O2\u0006\u0010b\u001a\u00020\u00042\u0019\b\u0002\u0010V\u001a\u0013\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020*0W¢\u0006\u0002\bX\u001aI\u0010c\u001a\u00020d*\u00020K2\u0006\u0010S\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\b\b\u0002\u0010T\u001a\u00020O2\b\b\u0002\u0010Z\u001a\u0002082\u0019\b\u0002\u0010V\u001a\u0013\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020*0W¢\u0006\u0002\bX\u001aK\u0010e\u001a\u00020f*\u00020K2\u0006\u0010S\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010T\u001a\u00020O2\u000c\u00101\u001a\b\u0012\u0004\u0012\u00020+0\u00172\u0019\b\u0002\u0010V\u001a\u0013\u0012\u0004\u0012\u00020f\u0012\u0004\u0012\u00020*0W¢\u0006\u0002\bX\u001aI\u0010g\u001a\u00020h*\u00020K2\u0006\u0010S\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\b\b\u0002\u0010T\u001a\u00020O2\b\b\u0002\u0010Z\u001a\u0002082\u0019\b\u0002\u0010V\u001a\u0013\u0012\u0004\u0012\u00020h\u0012\u0004\u0012\u00020*0W¢\u0006\u0002\bX\u001a\u0013\u0010i\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u001c\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000c¨\u0006j"],
    m107d2 = ["PROVIDER_STATUS_BETA_ONLY", "", "PROVIDER_STATUS_DOWN", MainAPIKt.PROVIDER_STATUS_KEY, "", "PROVIDER_STATUS_OK", "PROVIDER_STATUS_SLOW", "PROVIDER_STATUS_URL", "USER_AGENT", "mapper", "Lcom/fasterxml/jackson/databind/json/JsonMapper;", "getMapper", "()Lcom/fasterxml/jackson/databind/json/JsonMapper;", "base64Decode", TypedValues.Custom.S_STRING, "base64DecodeArray", "", "base64Encode", "array", "capitalizeString", "str", "capitalizeStringNullable", "fetchUrls", "", "text", "fixTitle", "getDurationFromString", TvContractCompat.PARAM_INPUT, "(Ljava/lang/String;)Ljava/lang/Integer;", "getQualityFromString", "Lcom/lagradost/cloudstream3/SearchQuality;", "imdbUrlToId", "url", "imdbUrlToIdNullable", "sortSubs", "Lcom/lagradost/cloudstream3/ui/player/SubtitleData;", "subs", "", "sortUrls", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "urls", "addDate", "", "Lcom/lagradost/cloudstream3/Episode;", "date", "Ljava/util/Date;", "format", "addDub", "Lcom/lagradost/cloudstream3/AnimeSearchResponse;", "episodes", "(Lcom/lagradost/cloudstream3/AnimeSearchResponse;Ljava/lang/Integer;)V", "addDubStatus", "status", "Lcom/lagradost/cloudstream3/DubStatus;", "(Lcom/lagradost/cloudstream3/AnimeSearchResponse;Lcom/lagradost/cloudstream3/DubStatus;Ljava/lang/Integer;)V", "dubExist", "", "subExist", "dubEpisodes", "subEpisodes", "(Lcom/lagradost/cloudstream3/AnimeSearchResponse;ZZLjava/lang/Integer;Ljava/lang/Integer;)V", "isDub", "(Lcom/lagradost/cloudstream3/AnimeSearchResponse;ZLjava/lang/Integer;)V", "(Lcom/lagradost/cloudstream3/AnimeSearchResponse;Ljava/lang/String;Ljava/lang/Integer;)V", "addEpisodes", "Lcom/lagradost/cloudstream3/AnimeLoadResponse;", "addPoster", "Lcom/lagradost/cloudstream3/LoadResponse;", "headers", "", "Lcom/lagradost/cloudstream3/SearchResponse;", "addQuality", "quality", "addSub", "fixUrl", "Lcom/lagradost/cloudstream3/MainAPI;", "fixUrlNull", "isAnimeBased", "isAnimeOp", "Lcom/lagradost/cloudstream3/TvType;", "isEpisodeBased", "isMovieType", "newAnimeLoadResponse", "name", "type", "comingSoonIfNone", "initializer", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "newAnimeSearchResponse", "fix", "newEpisode", ExifInterface.GPS_DIRECTION_TRUE, "data", "(Lcom/lagradost/cloudstream3/MainAPI;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lcom/lagradost/cloudstream3/Episode;", "newMovieLoadResponse", "Lcom/lagradost/cloudstream3/MovieLoadResponse;", "(Lcom/lagradost/cloudstream3/MainAPI;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lcom/lagradost/cloudstream3/MovieLoadResponse;", "dataUrl", "newMovieSearchResponse", "Lcom/lagradost/cloudstream3/MovieSearchResponse;", "newTvSeriesLoadResponse", "Lcom/lagradost/cloudstream3/TvSeriesLoadResponse;", "newTvSeriesSearchResponse", "Lcom/lagradost/cloudstream3/TvSeriesSearchResponse;", "toRatingInt", "app_release"],
    m106k = 2,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
object MainAPIKt {
    const val PROVIDER_STATUS_BETA_ONLY = 3
    const val PROVIDER_STATUS_DOWN = 0
    const val PROVIDER_STATUS_KEY = "PROVIDER_STATUS_KEY"
    const val PROVIDER_STATUS_OK = 1
    const val PROVIDER_STATUS_SLOW = 2
    const val PROVIDER_STATUS_URL =
        "https://raw.githubusercontent.com/cinehubwork/abc/master/providers.json"
    const val USER_AGENT =
        "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36"
    private val mapper: JsonMapper? = null

    init {
        val build: JsonMapper = JsonMapper.builder()
            .addModule(KotlinModule(0, false, false, false, null, false, 63, null))
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).build()
        Intrinsics.checkNotNull(com.lagradost.cloudstream3.build)
        mapper = com.lagradost.cloudstream3.build
    }

    @kotlin.jvm.JvmStatic
    fun getMapper(): JsonMapper? {
        return mapper
    }

    @kotlin.jvm.JvmStatic
    fun base64Decode(string: String?): String {
        Intrinsics.checkNotNullParameter(string, "string")
        return String(base64DecodeArray(string), Charsets.ISO_8859_1)
    }

    fun base64DecodeArray(string: String?): ByteArray {
        Intrinsics.checkNotNullParameter(string, "string")
        return try {
            val decode: ByteArray = Base64.decode(string, 0)
            Intrinsics.checkNotNullExpressionValue(
                decode,
                "{\n        android.util.B…til.Base64.DEFAULT)\n    }"
            )
            decode
        } catch (unused: Exception) {
            val decode2: ByteArray = java.util.Base64.getDecoder().decode(string)
            Intrinsics.checkNotNullExpressionValue(
                decode2,
                "{\n        Base64.getDecoder().decode(string)\n    }"
            )
            decode2
        }
    }

    @kotlin.jvm.JvmStatic
    fun base64Encode(array: ByteArray?): String {
        Intrinsics.checkNotNullParameter(array, "array")
        return try {
            val encode: ByteArray = Base64.encode(array, 2)
            Intrinsics.checkNotNullExpressionValue(
                encode,
                "encode(array, android.util.Base64.NO_WRAP)"
            )
            String(encode, Charsets.ISO_8859_1)
        } catch (unused: Exception) {
            val encode2: ByteArray = java.util.Base64.getEncoder().encode(array)
            Intrinsics.checkNotNullExpressionValue(encode2, "getEncoder().encode(array)")
            String(encode2, Charsets.UTF_8)
        }
    }

    @kotlin.jvm.JvmStatic
    fun fixUrlNull(mainAPI: MainAPI, str: String?): String? {
        Intrinsics.checkNotNullParameter(mainAPI, "<this>")
        return if (str == null || str.length() === 0) {
            null
        } else fixUrl(mainAPI, str)
    }

    @kotlin.jvm.JvmStatic
    fun fixUrl(mainAPI: MainAPI, url: String): String {
        Intrinsics.checkNotNullParameter(mainAPI, "<this>")
        Intrinsics.checkNotNullParameter(url, "url")
        if (StringsKt.`startsWith$default`(
                url,
                "http",
                false,
                2,
                null as Object?
            ) || StringsKt.`startsWith$default`(url, "{\"", false, 2, null as Object?)
        ) {
            return url
        }
        if (url.length() === 0) {
            return ""
        }
        return if (StringsKt.`startsWith$default`(url, "//", false, 2, null as Object?)) {
            "https:$url"
        } else if (StringsKt.`startsWith$default`(
                url as CharSequence,
                JsonPointer.SEPARATOR as Char,
                false,
                2,
                null as Object?
            )
        ) {
            mainAPI.mainUrl + url
        } else {
            mainAPI.mainUrl + JsonPointer.SEPARATOR + url
        }
    }

    @kotlin.jvm.JvmStatic
    fun sortUrls(urls: Set<ExtractorLink?>?): List<ExtractorLink> {
        Intrinsics.checkNotNullParameter(urls, "urls")
        return CollectionsKt.sortedWith(urls, object : Comparator() {
            // from class: com.lagradost.cloudstream3.MainAPIKt$sortUrls$$inlined$sortedBy$1
            @Override // java.util.Comparator
            fun compare(t: T, t2: T): Int {
                return ComparisonsKt.compareValues(
                    Integer.valueOf(-(t as ExtractorLink).getQuality()),
                    Integer.valueOf(-(t2 as ExtractorLink).getQuality())
                )
            }
        })
    }

    @kotlin.jvm.JvmStatic
    fun sortSubs(subs: Set<SubtitleData?>?): List<SubtitleData> {
        Intrinsics.checkNotNullParameter(subs, "subs")
        return CollectionsKt.sortedWith(subs, object : Comparator() {
            // from class: com.lagradost.cloudstream3.MainAPIKt$sortSubs$$inlined$sortedBy$1
            @Override // java.util.Comparator
            fun compare(t: T, t2: T): Int {
                return ComparisonsKt.compareValues<Comparable<*>>(
                    (t as SubtitleData).getName(),
                    (t2 as SubtitleData).getName()
                )
            }
        })
    }

    fun capitalizeString(str: String?): String? {
        Intrinsics.checkNotNullParameter(str, "str")
        val capitalizeStringNullable = capitalizeStringNullable(str)
        return capitalizeStringNullable ?: str
    }

    fun capitalizeStringNullable(str: String?): String? {
        val valueOf: String
        return if (str == null) {
            null
        } else try {
            if (str.length() > 0) {
                val sb = StringBuilder()
                val charAt: Char = str.charAt(0)
                if (Character.isLowerCase(charAt)) {
                    val locale: Locale = Locale.getDefault()
                    Intrinsics.checkNotNullExpressionValue(locale, "getDefault()")
                    valueOf = CharsKt.titlecase(charAt, locale)
                } else {
                    valueOf = String.valueOf(charAt)
                }
                sb.append(valueOf as Object)
                val substring: String = str.substring(1)
                Intrinsics.checkNotNullExpressionValue(
                    substring,
                    "this as java.lang.String).substring(startIndex)"
                )
                sb.append(substring)
                return sb.toString()
            }
            str
        } catch (unused: Exception) {
            str
        }
    }

    @kotlin.jvm.JvmStatic
    fun fixTitle(str: String?): String {
        Intrinsics.checkNotNullParameter(str, "str")
        return CollectionsKt.`joinToString$default`(
            StringsKt.`split$default`(
                str as CharSequence?,
                arrayOf(" "),
                false,
                0,
                6,
                null as Object?
            ), " ", null, null, 0, null, `MainAPIKt$fixTitle$1`.Companion.INSTANCE, 30, null
        )
    }

    fun imdbUrlToId(url: String): String? {
        var groupValues: List<String?>
        var groupValues2: List<String>
        var str: String?
        Intrinsics.checkNotNullParameter(url, "url")
        val `find$default` = Regex.`find$default`(Regex("/title/(tt[0-9]*)"), url, 0, 2, null)
        if (`find$default` == null || `find$default`.groupValues.also {
                groupValues2 = it
            } == null || groupValues2[1].also { str = it } == null) {
            val `find$default2` = Regex.`find$default`(Regex("tt[0-9]{5,}"), url, 0, 2, null)
            return if (`find$default2` == null || `find$default2`.groupValues.also {
                    groupValues = it
                } == null) {
                null
            } else groupValues[0]
        }
        return str
    }

    fun imdbUrlToIdNullable(str: String?): String? {
        return if (str == null) {
            null
        } else imdbUrlToId(str)
    }

    @kotlin.jvm.JvmStatic
    fun isMovieType(tvType: TvType): Boolean {
        Intrinsics.checkNotNullParameter(tvType, "<this>")
        return tvType === TvType.Movie || tvType === TvType.AnimeMovie || tvType === TvType.Torrent
    }

    fun isAnimeOp(tvType: TvType): Boolean {
        Intrinsics.checkNotNullParameter(tvType, "<this>")
        return tvType === TvType.Anime || tvType === TvType.OVA
    }

    @kotlin.jvm.JvmStatic
    fun getQualityFromString(str: String?): SearchQuality? {
        if (str == null) {
            return null
        }
        val lowerCase: String =
            StringsKt.trim(str as CharSequence?).toString().toLowerCase(Locale.ROOT)
        Intrinsics.checkNotNullExpressionValue(
            lowerCase,
            "this as java.lang.String).toLowerCase(Locale.ROOT)"
        )
        val `replace$default`: String =
            StringsKt.`replace$default`(lowerCase, " ", "", false, 4, null as Object?)
        return when (`replace$default`.hashCode()) {
            -1385972001 -> {
                if (`replace$default`.equals("bluray")) {
                    SearchQuality.BlueRay
                } else null
            }
            -1367739670 -> {
                if (`replace$default`.equals("camrip")) {
                    SearchQuality.CamRip
                } else null
            }
            -1360595129 -> {
                if (`replace$default`.equals("telecine")) {
                    SearchQuality.Telecine
                } else null
            }
            -1360103099 -> {
                if (`replace$default`.equals("telesync")) {
                    SearchQuality.Telesync
                } else null
            }
            -1327781603 -> {
                if (`replace$default`.equals("highquality")) {
                    SearchQuality.HQ
                } else null
            }
            -1319984697 -> {
                if (`replace$default`.equals("dvdrip")) {
                    SearchQuality.DVD
                } else null
            }
            -1319983920 -> {
                if (`replace$default`.equals("dvdscr")) {
                    SearchQuality.DVD
                } else null
            }
            -791790267 -> {
                if (`replace$default`.equals("webrip")) {
                    SearchQuality.WebRip
                } else null
            }
            -289214347 -> {
                if (`replace$default`.equals("highdefinition")) {
                    SearchQuality.HD
                } else null
            }
            -15830640 -> {
                if (`replace$default`.equals("blueray")) {
                    SearchQuality.BlueRay
                } else null
            }
            1719 -> {
                if (`replace$default`.equals("4k")) {
                    SearchQuality.FourK
                } else null
            }
            3152 -> {
                if (`replace$default`.equals(TtmlNode.TAG_BR)) {
                    SearchQuality.BlueRay
                } else null
            }
            3324 -> {
                if (`replace$default`.equals("hd")) {
                    SearchQuality.HD
                } else null
            }
            3337 -> {
                if (`replace$default`.equals("hq")) {
                    SearchQuality.HQ
                } else null
            }
            3665 -> {
                if (`replace$default`.equals("sd")) {
                    SearchQuality.SD
                } else null
            }
            3695 -> {
                if (`replace$default`.equals("tc")) {
                    SearchQuality.Telecine
                } else null
            }
            3711 -> {
                if (`replace$default`.equals(HlsSegmentFormat.f9702TS)) {
                    SearchQuality.Telesync
                } else null
            }
            3801 -> {
                if (`replace$default`.equals("wp")) {
                    SearchQuality.WorkPrint
                } else null
            }
            97643 -> {
                if (`replace$default`.equals("blu")) {
                    SearchQuality.BlueRay
                } else null
            }
            98255 -> {
                if (`replace$default`.equals("cam")) {
                    SearchQuality.Cam
                } else null
            }
            99858 -> {
                if (`replace$default`.equals("dvd")) {
                    SearchQuality.DVD
                } else null
            }
            101346 -> {
                if (`replace$default`.equals("fhd")) {
                    SearchQuality.HD
                } else null
            }
            103158 -> {
                if (`replace$default`.equals("hdr")) {
                    SearchQuality.HDR
                } else null
            }
            112921 -> {
                if (`replace$default`.equals("rip")) {
                    SearchQuality.CamRip
                } else null
            }
            113729 -> {
                if (`replace$default`.equals("sdr")) {
                    SearchQuality.SDR
                } else null
            }
            115761 -> {
                if (`replace$default`.equals("uhd")) {
                    SearchQuality.UHD
                } else null
            }
            117588 -> {
                if (`replace$default`.equals("web")) {
                    SearchQuality.WebRip
                } else null
            }
            3027034 -> {
                if (`replace$default`.equals("blue")) {
                    SearchQuality.BlueRay
                } else null
            }
            3198059 -> {
                if (`replace$default`.equals("hdtc")) {
                    SearchQuality.HdCam
                } else null
            }
            3198075 -> {
                if (`replace$default`.equals("hdts")) {
                    SearchQuality.HdCam
                } else null
            }
            3198078 -> {
                if (`replace$default`.equals("hdtv")) {
                    SearchQuality.HD
                } else null
            }
            99123539 -> {
                if (`replace$default`.equals("hdcam")) {
                    SearchQuality.HdCam
                } else null
            }
            99138205 -> {
                if (`replace$default`.equals("hdrip")) {
                    SearchQuality.HD
                } else null
            }
            113005276 -> {
                if (`replace$default`.equals("webdl")) {
                    SearchQuality.WebRip
                } else null
            }
            1106161212 -> {
                if (`replace$default`.equals("workprint")) {
                    SearchQuality.WorkPrint
                } else null
            }
            1312628413 -> {
                if (`replace$default`.equals("standard")) {
                    SearchQuality.SD
                } else null
            }
            else -> null
        }
    }

    @kotlin.jvm.JvmStatic
    fun  /* synthetic */`newMovieSearchResponse$default`(
        mainAPI: MainAPI,
        str: String,
        str2: String,
        tvType: TvType?,
        z: Boolean,
        function1: Function1<*, *>,
        i: Int,
        obj: Object?
    ): MovieSearchResponse {
        var tvType = tvType
        var function1 = function1
        if (i and 4 != 0) {
            tvType = TvType.Movie
        }
        val tvType2 = tvType
        val z2 = if (i and 8 != 0) true else z
        if (i and 16 != 0) {
            function1 = `MainAPIKt$newMovieSearchResponse$1`.Companion.INSTANCE
        }
        return newMovieSearchResponse(mainAPI, str, str2, tvType2, z2, function1)
    }

    @kotlin.jvm.JvmStatic
    fun newMovieSearchResponse(
        mainAPI: MainAPI,
        name: String,
        str: String,
        type: TvType?,
        z: Boolean,
        initializer: Function1<MovieSearchResponse?, Unit>
    ): MovieSearchResponse {
        var url = str
        Intrinsics.checkNotNullParameter(mainAPI, "<this>")
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(url, "url")
        Intrinsics.checkNotNullParameter(type, "type")
        Intrinsics.checkNotNullParameter(initializer, "initializer")
        if (z) {
            url = fixUrl(mainAPI, url)
        }
        val movieSearchResponse = MovieSearchResponse(
            name,
            url,
            mainAPI.name,
            type,
            null,
            null,
            null,
            null,
            null,
            496,
            null
        )
        initializer.invoke(movieSearchResponse)
        return movieSearchResponse
    }

    @kotlin.jvm.JvmStatic
    fun  /* synthetic */`newTvSeriesSearchResponse$default`(
        mainAPI: MainAPI,
        str: String?,
        str2: String,
        tvType: TvType?,
        z: Boolean,
        function1: Function1<*, *>,
        i: Int,
        obj: Object?
    ): TvSeriesSearchResponse {
        var tvType = tvType
        var function1 = function1
        if (i and 4 != 0) {
            tvType = TvType.TvSeries
        }
        val tvType2 = tvType
        val z2 = if (i and 8 != 0) true else z
        if (i and 16 != 0) {
            function1 = `MainAPIKt$newTvSeriesSearchResponse$1`.Companion.INSTANCE
        }
        return newTvSeriesSearchResponse(mainAPI, str, str2, tvType2, z2, function1)
    }

    fun newTvSeriesSearchResponse(
        mainAPI: MainAPI,
        name: String?,
        str: String,
        type: TvType?,
        z: Boolean,
        initializer: Function1<TvSeriesSearchResponse?, Unit>
    ): TvSeriesSearchResponse {
        var url = str
        Intrinsics.checkNotNullParameter(mainAPI, "<this>")
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(url, "url")
        Intrinsics.checkNotNullParameter(type, "type")
        Intrinsics.checkNotNullParameter(initializer, "initializer")
        if (z) {
            url = fixUrl(mainAPI, url)
        }
        val tvSeriesSearchResponse = TvSeriesSearchResponse(
            name!!,
            url,
            mainAPI.name,
            type,
            null,
            null,
            null,
            null,
            null,
            null,
            1008,
            null
        )
        initializer.invoke(tvSeriesSearchResponse)
        return tvSeriesSearchResponse
    }

    @kotlin.jvm.JvmStatic
    fun  /* synthetic */`newAnimeSearchResponse$default`(
        mainAPI: MainAPI,
        str: String,
        str2: String,
        tvType: TvType?,
        z: Boolean,
        function1: Function1<*, *>,
        i: Int,
        obj: Object?
    ): AnimeSearchResponse {
        var tvType = tvType
        var function1 = function1
        if (i and 4 != 0) {
            tvType = TvType.Anime
        }
        val tvType2 = tvType
        val z2 = if (i and 8 != 0) true else z
        if (i and 16 != 0) {
            function1 = `MainAPIKt$newAnimeSearchResponse$1`.Companion.INSTANCE
        }
        return newAnimeSearchResponse(mainAPI, str, str2, tvType2, z2, function1)
    }

    fun newAnimeSearchResponse(
        mainAPI: MainAPI,
        name: String,
        str: String,
        type: TvType?,
        z: Boolean,
        initializer: Function1<AnimeSearchResponse?, Unit>
    ): AnimeSearchResponse {
        var url = str
        Intrinsics.checkNotNullParameter(mainAPI, "<this>")
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(url, "url")
        Intrinsics.checkNotNullParameter(type, "type")
        Intrinsics.checkNotNullParameter(initializer, "initializer")
        if (z) {
            url = fixUrl(mainAPI, url)
        }
        val animeSearchResponse = AnimeSearchResponse(
            name,
            url,
            mainAPI.name,
            type,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            4080,
            null
        )
        initializer.invoke(animeSearchResponse)
        return animeSearchResponse
    }

    @kotlin.jvm.JvmStatic
    fun addQuality(searchResponse: SearchResponse, quality: String?) {
        Intrinsics.checkNotNullParameter(searchResponse, "<this>")
        Intrinsics.checkNotNullParameter(quality, "quality")
        searchResponse.quality = getQualityFromString(quality)
    }

    fun  /* synthetic */`addPoster$default`(
        searchResponse: SearchResponse,
        str: String?,
        map: Map?,
        i: Int,
        obj: Object?
    ) {
        var map: Map? = map
        if (i and 2 != 0) {
            map = null
        }
        addPoster(searchResponse, str, map)
    }

    fun addPoster(searchResponse: SearchResponse, str: String?, map: Map<String?, String?>?) {
        Intrinsics.checkNotNullParameter(searchResponse, "<this>")
        searchResponse.setPosterUrl(str)
        searchResponse.setPosterHeaders(map)
    }

    fun  /* synthetic */`addPoster$default`(
        loadResponse: LoadResponse,
        str: String?,
        map: Map?,
        i: Int,
        obj: Object?
    ) {
        var map: Map? = map
        if (i and 2 != 0) {
            map = null
        }
        addPoster(loadResponse, str, map)
    }

    @kotlin.jvm.JvmStatic
    fun addPoster(loadResponse: LoadResponse, str: String?, map: Map<String, String>?) {
        Intrinsics.checkNotNullParameter(loadResponse, "<this>")
        loadResponse.setPosterUrl(str)
        loadResponse.setPosterHeaders(map)
    }

    fun  /* synthetic */`addDubStatus$default`(
        animeSearchResponse: AnimeSearchResponse,
        dubStatus: DubStatus?,
        num: Integer?,
        i: Int,
        obj: Object?
    ) {
        var num: Integer? = num
        if (i and 2 != 0) {
            num = null
        }
        addDubStatus(animeSearchResponse, dubStatus, num)
    }

    fun addDubStatus(animeSearchResponse: AnimeSearchResponse, status: DubStatus?, num: Integer?) {
        Intrinsics.checkNotNullParameter(animeSearchResponse, "<this>")
        Intrinsics.checkNotNullParameter(status, "status")
        var dubStatus: EnumSet<DubStatus?> = animeSearchResponse.dubStatus
        if (dubStatus != null) {
            dubStatus.add(status)
        } else {
            dubStatus = EnumSet.of(status)
        }
        animeSearchResponse.dubStatus = dubStatus
        val type = animeSearchResponse.type
        val z = true
        if ((if (type == null || !isMovieType(type)) false else false) || num == null || num.intValue() <= 0) {
            return
        }
        animeSearchResponse.episodes.put(status, num)
    }

    fun  /* synthetic */`addDubStatus$default`(
        animeSearchResponse: AnimeSearchResponse,
        z: Boolean,
        num: Integer?,
        i: Int,
        obj: Object?
    ) {
        var num: Integer? = num
        if (i and 2 != 0) {
            num = null
        }
        addDubStatus(animeSearchResponse, z, num)
    }

    fun addDubStatus(animeSearchResponse: AnimeSearchResponse, z: Boolean, num: Integer?) {
        Intrinsics.checkNotNullParameter(animeSearchResponse, "<this>")
        addDubStatus(animeSearchResponse, if (z) DubStatus.Dubbed else DubStatus.Subbed, num)
    }

    fun addDub(animeSearchResponse: AnimeSearchResponse, num: Integer?) {
        Intrinsics.checkNotNullParameter(animeSearchResponse, "<this>")
        if (num == null || num.intValue() <= 0) {
            return
        }
        addDubStatus(animeSearchResponse, DubStatus.Dubbed, num)
    }

    @kotlin.jvm.JvmStatic
    fun addSub(animeSearchResponse: AnimeSearchResponse, num: Integer?) {
        Intrinsics.checkNotNullParameter(animeSearchResponse, "<this>")
        if (num == null || num.intValue() <= 0) {
            return
        }
        addDubStatus(animeSearchResponse, DubStatus.Subbed, num)
    }

    fun  /* synthetic */`addDubStatus$default`(
        animeSearchResponse: AnimeSearchResponse,
        z: Boolean,
        z2: Boolean,
        num: Integer?,
        num2: Integer?,
        i: Int,
        obj: Object?
    ) {
        var num: Integer? = num
        var num2: Integer? = num2
        if (i and 4 != 0) {
            num = null
        }
        if (i and 8 != 0) {
            num2 = null
        }
        addDubStatus(animeSearchResponse, z, z2, num, num2)
    }

    fun addDubStatus(
        animeSearchResponse: AnimeSearchResponse,
        z: Boolean,
        z2: Boolean,
        num: Integer?,
        num2: Integer?
    ) {
        Intrinsics.checkNotNullParameter(animeSearchResponse, "<this>")
        if (z) {
            addDubStatus(animeSearchResponse, DubStatus.Dubbed, num)
        }
        if (z2) {
            addDubStatus(animeSearchResponse, DubStatus.Subbed, num2)
        }
    }

    fun  /* synthetic */`addDubStatus$default`(
        animeSearchResponse: AnimeSearchResponse,
        str: String?,
        num: Integer?,
        i: Int,
        obj: Object?
    ) {
        var num: Integer? = num
        if (i and 2 != 0) {
            num = null
        }
        addDubStatus(animeSearchResponse, str, num)
    }

    fun addDubStatus(animeSearchResponse: AnimeSearchResponse, status: String?, num: Integer?) {
        Intrinsics.checkNotNullParameter(animeSearchResponse, "<this>")
        Intrinsics.checkNotNullParameter(status, "status")
        if (StringsKt.contains(status as CharSequence?, "(dub)" as CharSequence, true)) {
            `addDubStatus$default`(
                animeSearchResponse,
                DubStatus.Dubbed,
                null as Integer?,
                2,
                null as Object?
            )
        } else if (StringsKt.contains(status as CharSequence?, "(sub)" as CharSequence, true)) {
            `addDubStatus$default`(
                animeSearchResponse,
                DubStatus.Subbed,
                null as Integer?,
                2,
                null as Object?
            )
        }
    }

    @kotlin.jvm.JvmStatic
    fun getDurationFromString(str: String?): Integer? {
        var obj: String?
        var `replace$default`: String
        var groupValues: List<String?>
        var groupValues2: List<String?>
        if (str != null && StringsKt.trim(str as CharSequence?).toString()
                .also { obj = it } != null && StringsKt.`replace$default`(
                obj,
                " ",
                "",
                false,
                4,
                null as Object?
            ).also { `replace$default` = it } != null
        ) {
            val str2 = `replace$default`
            val `find$default` =
                Regex.`find$default`(Regex("([0-9]*)h.*?([0-9]*)m"), str2, 0, 2, null)
            if (`find$default` != null && `find$default`.groupValues.also {
                    groupValues2 = it
                } != null && groupValues2.size() === 3) {
                val intOrNull: Integer? = StringsKt.toIntOrNull(groupValues2[1])
                val intOrNull2: Integer? = StringsKt.toIntOrNull(groupValues2[2])
                return if (intOrNull2 == null || intOrNull == null) {
                    null
                } else Integer.valueOf(intOrNull.intValue() * 60 + intOrNull2.intValue())
            }
            val `find$default2` = Regex.`find$default`(Regex("([0-9]*)m"), str2, 0, 2, null)
            if (`find$default2` != null && `find$default2`.groupValues.also {
                    groupValues = it
                } != null && groupValues.size() === 2) {
                return StringsKt.toIntOrNull(groupValues[1])
            }
        }
        return null
    }

    fun isEpisodeBased(loadResponse: LoadResponse?): Boolean {
        return if (loadResponse == null) {
            false
        } else (loadResponse is AnimeLoadResponse || loadResponse is TvSeriesLoadResponse) && isEpisodeBased(
            loadResponse.type
        )
    }

    fun isAnimeBased(loadResponse: LoadResponse?): Boolean {
        return if (loadResponse == null) {
            false
        } else loadResponse.type === TvType.Anime || loadResponse.type === TvType.OVA
    }

    @kotlin.jvm.JvmStatic
    fun isEpisodeBased(tvType: TvType?): Boolean {
        return if (tvType == null) {
            false
        } else tvType === TvType.TvSeries || tvType === TvType.Anime
    }

    @kotlin.jvm.JvmStatic
    fun addEpisodes(
        animeLoadResponse: AnimeLoadResponse,
        status: DubStatus?,
        list: List<Episode?>?
    ) {
        Intrinsics.checkNotNullParameter(animeLoadResponse, "<this>")
        Intrinsics.checkNotNullParameter(status, "status")
        if (list == null) {
            return
        }
        animeLoadResponse.episodes.put(status, list)
    }

    fun  /* synthetic */`newAnimeLoadResponse$default`(
        mainAPI: MainAPI,
        str: String,
        str2: String,
        tvType: TvType,
        z: Boolean,
        function1: Function1<*, *>,
        i: Int,
        obj: Object?
    ): AnimeLoadResponse {
        var function1 = function1
        val z2 = if (i and 8 != 0) true else z
        if (i and 16 != 0) {
            function1 = `MainAPIKt$newAnimeLoadResponse$1`.Companion.INSTANCE
        }
        return newAnimeLoadResponse(mainAPI, str, str2, tvType, z2, function1)
    }

    fun newAnimeLoadResponse(
        mainAPI: MainAPI,
        name: String,
        url: String,
        type: TvType,
        z: Boolean,
        initializer: Function1<AnimeLoadResponse?, Unit>
    ): AnimeLoadResponse {
        var z2: Boolean
        Intrinsics.checkNotNullParameter(mainAPI, "<this>")
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(url, "url")
        Intrinsics.checkNotNullParameter(type, "type")
        Intrinsics.checkNotNullParameter(initializer, "initializer")
        val animeLoadResponse = AnimeLoadResponse(
            null,
            null,
            name,
            url,
            mainAPI.name,
            type,
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
            false,
            null,
            null,
            null,
            4194243,
            null
        )
        initializer.invoke(animeLoadResponse)
        if (z) {
            animeLoadResponse.comingSoon = true
            val it: Iterator<DubStatus> = animeLoadResponse.episodes.keySet().iterator()
            while (true) {
                if (!it.hasNext()) {
                    break
                }
                val list: List<Episode?> = animeLoadResponse.episodes.get(it.next())
                if (list == null || list.isEmpty()) {
                    z2 = true
                    continue
                } else {
                    z2 = false
                    continue
                }
                if (!z2) {
                    animeLoadResponse.comingSoon = false
                    break
                }
            }
        }
        return animeLoadResponse
    }

    fun  /* synthetic */`newMovieLoadResponse$default`(
        mainAPI: MainAPI,
        str: String,
        str2: String,
        tvType: TvType,
        obj: Object,
        function1: Function1<*, *>,
        i: Int,
        obj2: Object?
    ): MovieLoadResponse {
        var function1 = function1
        if (i and 16 != 0) {
            function1 = `MainAPIKt$newMovieLoadResponse$1`.Companion.INSTANCE
        }
        return newMovieLoadResponse(mainAPI, str, str2, tvType, obj, function1)
    }

    fun <T> newMovieLoadResponse(
        mainAPI: MainAPI,
        name: String,
        url: String,
        type: TvType,
        t: T?,
        initializer: Function1<MovieLoadResponse?, Unit>
    ): MovieLoadResponse {
        Intrinsics.checkNotNullParameter(mainAPI, "<this>")
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(url, "url")
        Intrinsics.checkNotNullParameter(type, "type")
        Intrinsics.checkNotNullParameter(initializer, "initializer")
        if (t is String) {
            return newMovieLoadResponse(mainAPI, name, url, type, t as String, initializer)
        }
        val str = if (t == null || AppUtils.INSTANCE.toJson(t).also { r0 = it } == null) "" else ""
        val movieLoadResponse = MovieLoadResponse(
            name,
            url,
            mainAPI.name,
            type,
            str,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            StringsKt.isBlank(str),
            null,
            null,
            null,
            245728,
            null
        )
        initializer.invoke(movieLoadResponse)
        return movieLoadResponse
    }

    fun  /* synthetic */`newMovieLoadResponse$default`(
        mainAPI: MainAPI,
        str: String,
        str2: String,
        tvType: TvType,
        str3: String,
        function1: Function1<*, *>,
        i: Int,
        obj: Object?
    ): MovieLoadResponse {
        var function1 = function1
        if (i and 16 != 0) {
            function1 = `MainAPIKt$newMovieLoadResponse$2`.Companion.INSTANCE
        }
        return newMovieLoadResponse(
            mainAPI,
            str,
            str2,
            tvType,
            str3,
            function1 as Function1<MovieLoadResponse?, Unit>
        )
    }

    fun newMovieLoadResponse(
        mainAPI: MainAPI,
        name: String,
        url: String,
        type: TvType,
        dataUrl: String,
        initializer: Function1<MovieLoadResponse?, Unit>
    ): MovieLoadResponse {
        Intrinsics.checkNotNullParameter(mainAPI, "<this>")
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(url, "url")
        Intrinsics.checkNotNullParameter(type, "type")
        Intrinsics.checkNotNullParameter(dataUrl, "dataUrl")
        Intrinsics.checkNotNullParameter(initializer, "initializer")
        val movieLoadResponse = MovieLoadResponse(
            name,
            url,
            mainAPI.name,
            type,
            dataUrl,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            StringsKt.isBlank(dataUrl),
            null,
            null,
            null,
            245728,
            null
        )
        initializer.invoke(movieLoadResponse)
        return movieLoadResponse
    }

    @kotlin.jvm.JvmStatic
    fun  /* synthetic */`addDate$default`(
        episode: Episode,
        str: String?,
        str2: String?,
        i: Int,
        obj: Object?
    ) {
        var str2 = str2
        if (i and 2 != 0) {
            str2 = TmdbHelper.TMDB_DATE_PATTERN
        }
        addDate(episode, str, str2)
    }

    fun addDate(episode: Episode, str: String?, format: String?) {
        Intrinsics.checkNotNullParameter(episode, "<this>")
        Intrinsics.checkNotNullParameter(format, "format")
        try {
            val simpleDateFormat = SimpleDateFormat(format)
            if (str == null) {
                return
            }
            val parse: Date = simpleDateFormat.parse(str)
            episode.date = if (parse != null) Long.valueOf(parse.getTime()) else null
        } catch (e: Exception) {
            ArchComponentExt.logError(e)
        }
    }

    fun addDate(episode: Episode, date: Date?) {
        Intrinsics.checkNotNullParameter(episode, "<this>")
        episode.date = if (date != null) Long.valueOf(date.getTime()) else null
    }

    fun  /* synthetic */`newEpisode$default`(
        mainAPI: MainAPI,
        str: String,
        function1: Function1<*, *>,
        z: Boolean,
        i: Int,
        obj: Object?
    ): Episode {
        var function1 = function1
        var z = z
        if (i and 2 != 0) {
            function1 = `MainAPIKt$newEpisode$1`.Companion.INSTANCE
        }
        if (i and 4 != 0) {
            z = true
        }
        return newEpisode(mainAPI, str, function1, z)
    }

    fun newEpisode(
        mainAPI: MainAPI,
        url: String,
        initializer: Function1<Episode?, Unit>,
        z: Boolean
    ): Episode {
        var url = url
        Intrinsics.checkNotNullParameter(mainAPI, "<this>")
        Intrinsics.checkNotNullParameter(url, "url")
        Intrinsics.checkNotNullParameter(initializer, "initializer")
        if (z) {
            url = fixUrl(mainAPI, url)
        }
        val episode = Episode(url, null, null, null, null, null, null, null, 254, null)
        initializer.invoke(episode)
        return episode
    }

    fun  /* synthetic */`newEpisode$default`(
        mainAPI: MainAPI,
        obj: Object,
        function1: Function1<*, *>,
        i: Int,
        obj2: Object?
    ): Episode {
        var function1 = function1
        if (i and 2 != 0) {
            function1 = `MainAPIKt$newEpisode$2`.Companion.INSTANCE
        }
        return newEpisode<Any>(mainAPI, obj, function1)
    }

    @kotlin.jvm.JvmStatic
    fun <T> newEpisode(mainAPI: MainAPI, t: T?, initializer: Function1<Episode?, Unit>): Episode {
        var json: String
        Intrinsics.checkNotNullParameter(mainAPI, "<this>")
        Intrinsics.checkNotNullParameter(initializer, "initializer")
        if (t is String) {
            return `newEpisode$default`(mainAPI, t as String, initializer, false, 4, null)
        }
        if (t != null && AppUtils.INSTANCE.toJson(t).also { json = it } != null) {
            val episode = Episode(json, null, null, null, null, null, null, null, 254, null)
            initializer.invoke(episode)
            return episode
        }
        throw ErrorLoadingException("invalid newEpisode")
    }

    fun  /* synthetic */`newTvSeriesLoadResponse$default`(
        mainAPI: MainAPI,
        str: String,
        str2: String,
        tvType: TvType,
        list: List,
        function1: Function1<*, *>,
        i: Int,
        obj: Object?
    ): TvSeriesLoadResponse {
        var function1 = function1
        if (i and 16 != 0) {
            function1 = `MainAPIKt$newTvSeriesLoadResponse$1`.Companion.INSTANCE
        }
        return newTvSeriesLoadResponse(mainAPI, str, str2, tvType, list, function1)
    }

    fun newTvSeriesLoadResponse(
        mainAPI: MainAPI,
        name: String,
        url: String,
        type: TvType,
        episodes: List<Episode?>,
        initializer: Function1<TvSeriesLoadResponse?, Unit>
    ): TvSeriesLoadResponse {
        Intrinsics.checkNotNullParameter(mainAPI, "<this>")
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(url, "url")
        Intrinsics.checkNotNullParameter(type, "type")
        Intrinsics.checkNotNullParameter(episodes, "episodes")
        Intrinsics.checkNotNullParameter(initializer, "initializer")
        val tvSeriesLoadResponse = TvSeriesLoadResponse(
            name,
            url,
            mainAPI.name,
            type,
            episodes,
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
            episodes.isEmpty(),
            null,
            null,
            null,
            491488,
            null
        )
        initializer.invoke(tvSeriesLoadResponse)
        return tvSeriesLoadResponse
    }

    fun fetchUrls(str: String?): List<String> {
        return if (str == null || str.length() === 0) {
            CollectionsKt.emptyList<Any>()
        } else SequencesKt.toList(
            SequencesKt.map(
                Regex.`findAll$default`(
                    Regex("(https?://(www\\.)?[-a-zA-Z0-9@:%._+~#=]{1,256}\\.[a-zA-Z0-9()]{1,6}\\b([-a-zA-Z0-9()@:%_+.~#?&/=]*))"),
                    str,
                    0,
                    2,
                    null
                ), `MainAPIKt$fetchUrls$1`.Companion.INSTANCE
            )
        )
    }

    fun toRatingInt(str: String?): Integer? {
        var `replace$default`: String?
        var obj: String?
        var doubleOrNull: Double
        return if (str == null || StringsKt.`replace$default`(
                str,
                " ",
                "",
                false,
                4,
                null as Object?
            )
                .also {
                    `replace$default` = it
                } == null || StringsKt.trim(`replace$default` as CharSequence?).toString()
                .also { obj = it } == null || StringsKt.toDoubleOrNull(obj)
                .also { doubleOrNull = it } == null
        ) {
            null
        } else Integer.valueOf(
            (Math.abs(
                doubleOrNull.doubleValue()
            ) * 1000.0f) as Int
        )
    }
}