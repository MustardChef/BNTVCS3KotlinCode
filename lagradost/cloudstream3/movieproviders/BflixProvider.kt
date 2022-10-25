package com.lagradost.cloudstream3.movieproviders

import com.google.firebase.messaging.Constants
import java.net.URLDecoder
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: BflixProvider.kt */
@Metadata(
    m108d1 = ["\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\u0004:;<=B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u001b\u001a\u00020\u000cH\u0002J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u001b\u001a\u00020\u000cH\u0002J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u001e\u001a\u00020\u000cH\u0002J\u0011\u0010\u001f\u001a\u00020 H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000c2\u0006\u0010#\u001a\u00020\u000cH\u0002J\u0018\u0010$\u001a\u00020\u000c2\u0006\u0010%\u001a\u00020\u000c2\u0006\u0010&\u001a\u00020\u000cH\u0002J\u001b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010\u001e\u001a\u00020\u000cH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010)JI\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u000c2\u0006\u0010,\u001a\u00020\u00042\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u0002000.H\u0096@ø\u0001\u0000¢\u0006\u0002\u00103J!\u00104\u001a\n\u0012\u0004\u0012\u000206\u0018\u0001052\u0006\u00107\u001a\u00020\u000cH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010)J\u0010\u00108\u001a\u00020\u000c2\u0006\u0010\u001b\u001a\u00020\u000cH\u0002J\u0010\u00109\u001a\u00020\u000c2\u0006\u0010\u001b\u001a\u00020\u000cH\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000cX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u000cX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006>"],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/BflixProvider;", "Lcom/lagradost/cloudstream3/MainAPI;", "()V", "hasChromecastSupport", "", "getHasChromecastSupport", "()Z", "hasDownloadSupport", "getHasDownloadSupport", "hasMainPage", "getHasMainPage", SDKConstants.PARAM_KEY, "", "mainUrl", "getMainUrl", "()Ljava/lang/String;", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "decode", TvContractCompat.PARAM_INPUT, "encode", "getLink", "url", "getMainPage", "Lcom/lagradost/cloudstream3/HomePageResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVrf", "id", "je", "inputOne", "inputTwo", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "", "Lcom/lagradost/cloudstream3/SearchResponse;", "query", "ue", "ze", "Links", "Response", "Servers", "Subtitles", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes3.dex */
open class BflixProvider : MainAPI() {
    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var mainUrl = "https://bflix.ru"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var name = "Bflix"
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
    val hasDownloadSupport = true

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val supportedTypes: Set<TvType> =
        SetsKt.setOf<Object>(*arrayOf<TvType>(TvType.Movie, TvType.TvSeries) as Array<Object>)
    private val key = "5uLKesbh0nkrpPq9VwMC6+tQBdomjJ4HNl/fWOSiREvAYagT8yIG7zx2D13UZFXc"

    /* compiled from: BflixProvider.kt */
    @Metadata(m106k = 3, m105mv = [1, 6, 0], m103xi = 48) /* loaded from: classes3.dex */
    /* synthetic */
    object WhenMappings {
        /* synthetic */ val `$EnumSwitchMapping$0`: IntArray

        init {
            val iArr = IntArray(TvType.values().size)
            com.lagradost.cloudstream3.movieproviders.iArr.get(TvType.TvSeries.ordinal()) = 1
            com.lagradost.cloudstream3.movieproviders.iArr.get(TvType.Movie.ordinal()) = 2
            `$EnumSwitchMapping$0` = com.lagradost.cloudstream3.movieproviders.iArr
        }
    }

    @Override // com.lagradost.cloudstream3.MainAPI
    override fun getMainPage(continuation: Continuation<in HomePageResponse?>?): Object? {
        return `getMainPage$suspendImpl`(this, continuation as Continuation<*>?)
    }

    @Override // com.lagradost.cloudstream3.MainAPI
    override fun load(str: String?, continuation: Continuation<in LoadResponse?>?): Object {
        return `load$suspendImpl`(this, str, continuation as Continuation<*>?)
    }

    @Override // com.lagradost.cloudstream3.MainAPI
    fun loadLinks(
        str: String?,
        z: Boolean,
        function1: Function1<SubtitleFile?, Unit>?,
        function12: Function1<ExtractorLink?, Unit>?,
        continuation: Continuation<in Boolean?>?
    ): Object {
        return `loadLinks$suspendImpl`(
            this,
            str,
            z,
            function1 as Function1<*, *>?,
            function12 as Function1<*, *>?,
            continuation as Continuation<*>?
        )
    }

    @Override // com.lagradost.cloudstream3.MainAPI
    override fun search(
        str: String?,
        continuation: Continuation<in List<SearchResponse?>?>?
    ): Object {
        return `search$suspendImpl`(this, str, continuation as Continuation<*>?)
    }

    private fun getVrf(str: String): String? {
        var `replace$default`: String
        val obj: String = StringsKt.reversed(
            StringsKt.slice(
                m139ue(encode(str) + "0000000"),
                IntRange(0, 5)
            ) as CharSequence?
        ).toString()
        val sb = StringBuilder()
        sb.append(obj)
        val encode = encode(str)
        if (encode == null || StringsKt.`replace$default`(
                encode,
                "+",
                "%20",
                false,
                4,
                null as Object?
            ).also { `replace$default` = it } == null
        ) {
            return null
        }
        sb.append(Regex("=+$").replace(m139ue(m140je(obj, `replace$default`)), ""))
        return sb.toString()
    }

    private fun getLink(str: String): String {
        return decode(
            m140je(
                StringsKt.slice(str, IntRange(0, 5)),
                m138ze(StringsKt.slice(str, IntRange(6, StringsKt.getLastIndex(str))))
            )
        )
    }

    /* renamed from: ue */
    private fun m139ue(str: String): String {
        val z: Boolean
        var i = 0
        while (true) {
            if (i >= str.length()) {
                z = false
                break
            }
            if (str.charAt(i) >= 256) {
                z = true
                break
            }
            i++
        }
        if (z) {
            throw Exception("illegal characters!")
        }
        var str3 = ""
        val progressionLastElement: Int =
            progressionUtil.getProgressionLastElement(0, str.length() - 1, 3)
        if (progressionLastElement >= 0) {
            var i2 = 0
            while (true) {
                val iArr = intArrayOf(-1, -1, -1, -1)
                iArr[0] = str.charAt(i2) shr 2
                iArr[1] = str.charAt(i2) and 3 shl 4
                val i3 = i2 + 1
                if (str.length() > i3) {
                    iArr[1] = iArr[1] or (str.charAt(i3) shr 4)
                    iArr[2] = str.charAt(i3) and 15 shl 2
                }
                val i4 = i2 + 2
                if (str.length() > i4) {
                    iArr[2] = iArr[2] or (str.charAt(i4) shr 6)
                    iArr[3] = str.charAt(i4) and '?'
                }
                for (i5 in 0..3) {
                    val i6 = iArr[i5]
                    if (i6 == -1) {
                        str3 = "$str3="
                    } else if (i6 >= 0 && i6 < 64) {
                        str3 = str3 + key.charAt(i6)
                    }
                }
                if (i2 == progressionLastElement) {
                    break
                }
                i2 += 3
            }
        }
        return str3
    }

    /* renamed from: je */
    private fun m140je(str: String, str2: String): String {
        val iArr = IntArray(256)
        for (i in 0..255) {
            iArr[i] = i
        }
        var i2 = 0
        for (i3 in 0..255) {
            i2 = (i2 + iArr[i3] + str.charAt(i3 % str.length())) % 256
            val i4 = iArr[i3]
            iArr[i3] = iArr[i2]
            iArr[i2] = i4
        }
        val length: Int = str2.length()
        var str3 = ""
        var i5 = 0
        var i6 = 0
        for (i7 in 0 until length) {
            i5 = (i5 + i7) % 256
            i6 = (i6 + iArr[i5]) % 256
            val i8 = iArr[i5]
            iArr[i5] = iArr[i6]
            iArr[i6] = i8
            str3 = str3 + (str2.charAt(i7) xor iArr[(iArr[i5] + iArr[i6]) % 256]) as Char
        }
        return str3
    }

    /* renamed from: ze */
    private fun m138ze(str: String): String {
        var str = str
        val str2 = str
        var str3 = ""
        if (Regex("[\\t\\n\\u000c\\r]").replace(str2, "").length() % 4 === 0) {
            str = Regex("/==?$/").replace(str2, "")
        }
        if (str.length() % 4 !== 1) {
            if (!Regex("[^+/0-9A-Za-z]").containsMatchIn(str)) {
                val length: Int = str.length()
                var i = 0
                var i2 = 0
                for (i3 in 0 until length) {
                    i2 = i2 shl 6 or StringsKt.`indexOf$default`(
                        key as CharSequence,
                        str.charAt(i3),
                        0,
                        false,
                        6,
                        null as Object?
                    )
                    i += 6
                    if (24 == i) {
                        str3 =
                            str3 + (16711680 and i2 shr 16).toChar() + (i2 and MotionEventCompat.ACTION_POINTER_INDEX_MASK shr 8).toChar().code + (i2 and 255).toChar().code
                        i = 0
                        i2 = 0
                    }
                }
                if (12 == i) {
                    return str3 + (i2 shr 4).toChar()
                }
                if (18 == i) {
                    val i4 = i2 shr 2
                    str3 =
                        str3 + (i4 and MotionEventCompat.ACTION_POINTER_INDEX_MASK shr 8).toChar() + (i4 and 255).toChar().code
                }
                return str3
            }
        }
        throw Exception("bad input")
    }

    private fun encode(str: String): String {
        return URLEncoder.encode(str, "utf-8")
    }

    private fun decode(str: String): String {
        return URLDecoder.decode(str, "utf-8")
    }

    /* compiled from: BflixProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/BflixProvider\$Response;", "", "html", "", "(Ljava/lang/String;)V", "getHtml", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Response(@JsonProperty("html") html: String) {
        val html: String
        operator fun component1(): String {
            return html
        }

        fun copy(@JsonProperty("html") html: String): Response {
            Intrinsics.checkNotNullParameter(html, "html")
            return Response(html)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is Response && Intrinsics.areEqual(
                html,
                (obj as Response).html
            )
        }

        override fun hashCode(): Int {
            return html.hashCode()
        }

        override fun toString(): String {
            return "Response(html=" + html + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(html, "html")
            this.html = html
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                response: Response,
                str: String,
                i: Int,
                obj: Object?
            ): Response {
                var str = str
                if (i and 1 != 0) {
                    str = response.html
                }
                return response.copy(str)
            }
        }
    }

    /* compiled from: BflixProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000c\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/BflixProvider\$Subtitles;", "", "file", "", Constants.ScionAnalytics.PARAM_LABEL, "kind", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFile", "()Ljava/lang/String;", "getKind", "getLabel", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Subtitles(
        @JsonProperty("file") file: String,
        @JsonProperty("label") label: String,
        @JsonProperty("kind") kind: String
    ) {
        val file: String
        val kind: String
        val label: String
        operator fun component1(): String {
            return file
        }

        operator fun component2(): String {
            return label
        }

        operator fun component3(): String {
            return kind
        }

        fun copy(
            @JsonProperty("file") file: String,
            @JsonProperty("label") label: String,
            @JsonProperty("kind") kind: String
        ): Subtitles {
            Intrinsics.checkNotNullParameter(file, "file")
            Intrinsics.checkNotNullParameter(label, "label")
            Intrinsics.checkNotNullParameter(kind, "kind")
            return Subtitles(file, label, kind)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Subtitles) {
                val subtitles = obj as Subtitles
                return Intrinsics.areEqual(file, subtitles.file) && Intrinsics.areEqual(
                    label, subtitles.label
                ) && Intrinsics.areEqual(kind, subtitles.kind)
            }
            return false
        }

        override fun hashCode(): Int {
            return (file.hashCode() * 31 + label.hashCode()) * 31 + kind.hashCode()
        }

        override fun toString(): String {
            return "Subtitles(file=" + file + ", label=" + label + ", kind=" + kind + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(file, "file")
            Intrinsics.checkNotNullParameter(label, "label")
            Intrinsics.checkNotNullParameter(kind, "kind")
            this.file = file
            this.label = label
            this.kind = kind
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                subtitles: Subtitles,
                str: String,
                str2: String,
                str3: String,
                i: Int,
                obj: Object?
            ): Subtitles {
                var str = str
                var str2 = str2
                var str3 = str3
                if (i and 1 != 0) {
                    str = subtitles.file
                }
                if (i and 2 != 0) {
                    str2 = subtitles.label
                }
                if (i and 4 != 0) {
                    str3 = subtitles.kind
                }
                return subtitles.copy(str, str2, str3)
            }
        }
    }

    /* compiled from: BflixProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/BflixProvider\$Links;", "", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Links(@JsonProperty("url") url: String) {
        val url: String
        operator fun component1(): String {
            return url
        }

        fun copy(@JsonProperty("url") url: String): Links {
            Intrinsics.checkNotNullParameter(url, "url")
            return Links(url)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is Links && Intrinsics.areEqual(
                url,
                (obj as Links).url
            )
        }

        override fun hashCode(): Int {
            return url.hashCode()
        }

        override fun toString(): String {
            return "Links(url=" + url + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(url, "url")
            this.url = url
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                links: Links,
                str: String,
                i: Int,
                obj: Object?
            ): Links {
                var str = str
                if (i and 1 != 0) {
                    str = links.url
                }
                return links.copy(str)
            }
        }
    }

    /* compiled from: BflixProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/BflixProvider\$Servers;", "", "mcloud", "", "mp4upload", "streamtape", "vidstream", "videovard", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMcloud", "()Ljava/lang/String;", "getMp4upload", "getStreamtape", "getVideovard", "getVidstream", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Servers(
        @param:JsonProperty("28") val mcloud: String,
        @param:JsonProperty(
            "35"
        ) val mp4upload: String,
        @param:JsonProperty("40") val streamtape: String,
        @param:JsonProperty(
            "41"
        ) val vidstream: String,
        @param:JsonProperty("43") val videovard: String
    ) {
        operator fun component1(): String {
            return mcloud
        }

        operator fun component2(): String {
            return mp4upload
        }

        operator fun component3(): String {
            return streamtape
        }

        operator fun component4(): String {
            return vidstream
        }

        operator fun component5(): String {
            return videovard
        }

        fun copy(
            @JsonProperty("28") str: String,
            @JsonProperty("35") str2: String,
            @JsonProperty("40") str3: String,
            @JsonProperty("41") str4: String,
            @JsonProperty("43") str5: String
        ): Servers {
            return Servers(str, str2, str3, str4, str5)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Servers) {
                val servers = obj as Servers
                return Intrinsics.areEqual(mcloud, servers.mcloud) && Intrinsics.areEqual(
                    mp4upload, servers.mp4upload
                ) && Intrinsics.areEqual(
                    streamtape, servers.streamtape
                ) && Intrinsics.areEqual(
                    vidstream, servers.vidstream
                ) && Intrinsics.areEqual(
                    videovard, servers.videovard
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val str = mcloud
            val hashCode = (str?.hashCode() ?: 0) * 31
            val str2 = mp4upload
            val hashCode2 = (hashCode + (str2?.hashCode() ?: 0)) * 31
            val str3 = streamtape
            val hashCode3 = (hashCode2 + (str3?.hashCode() ?: 0)) * 31
            val str4 = vidstream
            val hashCode4 = (hashCode3 + (str4?.hashCode() ?: 0)) * 31
            val str5 = videovard
            return hashCode4 + (str5?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "Servers(mcloud=" + mcloud + ", mp4upload=" + mp4upload + ", streamtape=" + streamtape + ", vidstream=" + vidstream + ", videovard=" + videovard + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                servers: Servers,
                str: String,
                str2: String,
                str3: String,
                str4: String,
                str5: String,
                i: Int,
                obj: Object?
            ): Servers {
                var str = str
                var str2 = str2
                var str3 = str3
                var str4 = str4
                var str5 = str5
                if (i and 1 != 0) {
                    str = servers.mcloud
                }
                if (i and 2 != 0) {
                    str2 = servers.mp4upload
                }
                val str6 = str2
                if (i and 4 != 0) {
                    str3 = servers.streamtape
                }
                val str7 = str3
                if (i and 8 != 0) {
                    str4 = servers.vidstream
                }
                val str8 = str4
                if (i and 16 != 0) {
                    str5 = servers.videovard
                }
                return servers.copy(str, str6, str7, str8, str5)
            }
        }
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */ /* JADX WARN: Removed duplicated region for block: B:21:0x00e9  */ /* JADX WARN: Removed duplicated region for block: B:37:0x01c4  */ /* JADX WARN: Removed duplicated region for block: B:39:0x01d6  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
        fun  /* synthetic */`getMainPage$suspendImpl`(
            r27: BflixProvider?,
            r28: Continuation<*>?
        ): Any {
            /*
            Method dump skipped, instructions count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.BflixProvider.getMainPage\$suspendImpl(com.lagradost.cloudstream3.movieproviders.BflixProvider, kotlin.coroutines.Continuation):java.lang.Object")
        }

        /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */ /* JADX WARN: Removed duplicated region for block: B:26:0x00cd  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
        fun  /* synthetic */`search$suspendImpl`(
            r20: BflixProvider?,
            r21: String?,
            r22: Continuation<*>?
        ): Any {
            /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.BflixProvider.search\$suspendImpl(com.lagradost.cloudstream3.movieproviders.BflixProvider, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
        }

        /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */ /* JADX WARN: Removed duplicated region for block: B:113:0x0440  */ /* JADX WARN: Removed duplicated region for block: B:123:0x047a  */ /* JADX WARN: Removed duplicated region for block: B:131:0x04bc  */ /* JADX WARN: Removed duplicated region for block: B:139:0x0307 A[EDGE_INSN: B:139:0x0307->B:65:0x0307 ?: BREAK  , SYNTHETIC] */ /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */ /* JADX WARN: Removed duplicated region for block: B:22:0x00d9 A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:23:0x00da  */ /* JADX WARN: Removed duplicated region for block: B:43:0x0229  */ /* JADX WARN: Removed duplicated region for block: B:73:0x0332  */ /* JADX WARN: Removed duplicated region for block: B:92:0x03c2  */ /* JADX WARN: Type inference failed for: r0v12, types: [java.util.List] */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
        fun  /* synthetic */`load$suspendImpl`(
            r56: BflixProvider?,
            r57: String?,
            r58: Continuation<*>?
        ): Any {
            /*
            Method dump skipped, instructions count: 1268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.BflixProvider.load\$suspendImpl(com.lagradost.cloudstream3.movieproviders.BflixProvider, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
        }

        /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */ /* JADX WARN: Removed duplicated region for block: B:20:0x00d4  */ /* JADX WARN: Removed duplicated region for block: B:26:0x0130  */ /* JADX WARN: Removed duplicated region for block: B:27:0x0137  */ /* JADX WARN: Removed duplicated region for block: B:29:0x013a  */ /* JADX WARN: Removed duplicated region for block: B:31:0x013f  */ /* JADX WARN: Removed duplicated region for block: B:42:0x0205  */ /* JADX WARN: Removed duplicated region for block: B:55:0x0270  */ /* JADX WARN: Removed duplicated region for block: B:56:0x027b  */ /* JADX WARN: Removed duplicated region for block: B:62:0x02e3  */ /* JADX WARN: Removed duplicated region for block: B:63:0x02ee  */ /* JADX WARN: Removed duplicated region for block: B:66:0x0337  */ /* JADX WARN: Removed duplicated region for block: B:72:0x03b7  */ /* JADX WARN: Removed duplicated region for block: B:73:0x03cd  */ /* JADX WARN: Removed duplicated region for block: B:84:0x040d  */ /* JADX WARN: Removed duplicated region for block: B:86:0x0420  */ /* JADX WARN: Removed duplicated region for block: B:93:0x04bb A[LOOP:0: B:91:0x04b5->B:93:0x04bb, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:96:0x04f9  */ /* JADX WARN: Type inference failed for: r0v28 */ /* JADX WARN: Type inference failed for: r4v26, types: [java.util.Collection] */ /* JADX WARN: Type inference failed for: r7v30, types: [java.util.Collection] */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x02e3 -> B:95:0x04e9). Please submit an issue!!! */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x0410 -> B:64:0x0331). Please submit an issue!!! */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x048c -> B:90:0x0494). Please submit an issue!!! */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
        fun  /* synthetic */`loadLinks$suspendImpl`(
            r42: BflixProvider?,
            r43: String?,
            r44: Boolean,
            r45: Function1<*, *>?,
            r46: Function1<*, *>?,
            r47: Continuation<*>?
        ): Any {
            /*
            Method dump skipped, instructions count: 1281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.BflixProvider.loadLinks\$suspendImpl(com.lagradost.cloudstream3.movieproviders.BflixProvider, java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
        }
    }
}