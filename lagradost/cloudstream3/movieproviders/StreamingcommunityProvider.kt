package com.lagradost.cloudstream3.movieproviders

import com.lagradost.cloudstream3.utils.M3u8Helper
import java.util.HashMap
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: StreamingcommunityProvider.kt */
@Metadata(
    m108d1 = ["\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 82\u00020\u0001:\u00018B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nH\u0002J\u0011\u0010 \u001a\u00020!H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\"J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010&JI\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u00042\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020-0+H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010/J\u001f\u00100\u001a\b\u0012\u0004\u0012\u0002010\u001b2\u0006\u00102\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010&J\u0012\u00103\u001a\u0004\u0018\u00010\n2\u0006\u00104\u001a\u000205H\u0002J\u0017\u00106\u001a\u0004\u0018\u0001052\u0006\u00104\u001a\u000205H\u0002¢\u0006\u0002\u00107R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u000c\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000c\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000c\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u00069"],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/StreamingcommunityProvider;", "Lcom/lagradost/cloudstream3/MainAPI;", "()V", "hasChromecastSupport", "", "getHasChromecastSupport", "()Z", "hasMainPage", "getHasMainPage", "lang", "", "getLang", "()Ljava/lang/String;", "setLang", "(Ljava/lang/String;)V", "mainUrl", "getMainUrl", "setMainUrl", "name", "getName", "setName", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "getM3u8Qualities", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "m3u8Link", "referer", "qualityName", "getMainPage", "Lcom/lagradost/cloudstream3/HomePageResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "Lcom/lagradost/cloudstream3/SearchResponse;", "query", "translateip", "num", "", "translatenumber", "(I)Ljava/lang/Integer;", "Companion", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class StreamingcommunityProvider : MainAPI() {
    private var lang = "it"

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var mainUrl = "https://streamingcommunity.best"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var name = "Streamingcommunity"
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
    val supportedTypes: Set<TvType> =
        SetsKt.setOf<Object>(*arrayOf<TvType>(TvType.Movie, TvType.TvSeries) as Array<Object>)

    private fun translateip(i: Int): String? {
        return if (i != 85) {
            if (i != 95) {
                if (i != 117) {
                    when (i) {
                        16 -> "sc-b1-01.scws-content.net"
                        17 -> "sc-b1-02.scws-content.net"
                        18 -> "sc-b1-03.scws-content.net"
                        else -> when (i) {
                            141 -> "sc-b1-07.scws-content.net"
                            142 -> "sc-b1-08.scws-content.net"
                            143 -> "sc-b1-09.scws-content.net"
                            144 -> "sc-b1-10.scws-content.net"
                            else -> null
                        }
                    }
                } else "sc-b1-06.scws-content.net"
            } else "sc-b1-05.scws-content.net"
        } else "sc-b1-04.scws-content.net"
    }

    @Override // com.lagradost.cloudstream3.MainAPI
    override fun getLang(): String? {
        return lang
    }

    @Override // com.lagradost.cloudstream3.MainAPI
    override fun setLang(str: String) {
        Intrinsics.checkNotNullParameter(str, "<set-?>")
        lang = str
    }

    private fun translatenumber(i: Int): Integer? {
        return if (i != 67) {
            if (i != 133) {
                when (i) {
                    71 -> 2
                    72 -> 3
                    73 -> 4
                    74 -> 5
                    75 -> 6
                    76 -> 7
                    77 -> 8
                    78 -> 9
                    79 -> 10
                    else -> null
                }
            } else 11
        } else 1
    }

    /* compiled from: StreamingcommunityProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R-\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/StreamingcommunityProvider\$Companion;", "", "()V", "posterMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getPosterMap", "()Ljava/util/HashMap;", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        val posterMap: HashMap<String, String>
            get() = StreamingcommunityProvider.Companion.posterMap
    }

    /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */ /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */ /* JADX WARN: Removed duplicated region for block: B:23:0x0107  */ /* JADX WARN: Removed duplicated region for block: B:28:0x0167  */ /* JADX WARN: Removed duplicated region for block: B:34:0x0296  */ /* JADX WARN: Removed duplicated region for block: B:35:0x0299  */ /* JADX WARN: Removed duplicated region for block: B:38:0x02c0  */ /* JADX WARN: Removed duplicated region for block: B:43:0x0314  */ /* JADX WARN: Removed duplicated region for block: B:46:0x0352  */ /* JADX WARN: Type inference failed for: r13v10, types: [java.util.Collection] */ /* JADX WARN: Type inference failed for: r6v17, types: [java.util.Collection] */ /* JADX WARN: Type inference failed for: r8v19, types: [java.util.Collection] */ /* JADX WARN: Type inference failed for: r9v23, types: [java.util.List] */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x011b -> B:26:0x0161). Please submit an issue!!! */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0266 -> B:32:0x026f). Please submit an issue!!! */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0340 -> B:45:0x0343). Please submit an issue!!! */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun getMainPage(r46: Continuation<in HomePageResponse?>?): Any? {
        /*
            Method dump skipped, instructions count: 884
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.StreamingcommunityProvider.getMainPage(kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */ /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */ /* JADX WARN: Removed duplicated region for block: B:23:0x0122  */ /* JADX WARN: Removed duplicated region for block: B:29:0x0245  */ /* JADX WARN: Removed duplicated region for block: B:36:0x029f  */ /* JADX WARN: Removed duplicated region for block: B:44:0x0302  */ /* JADX WARN: Type inference failed for: r11v15, types: [java.util.Collection] */ /* JADX WARN: Type inference failed for: r5v15, types: [java.util.Collection] */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x01c5 -> B:27:0x01cd). Please submit an issue!!! */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun search(
        r43: String?,
        r44: Continuation<in MutableList<out SearchResponse?>?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 773
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.StreamingcommunityProvider.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */ /* JADX WARN: Removed duplicated region for block: B:18:0x00f1  */ /* JADX WARN: Removed duplicated region for block: B:24:0x0164  */ /* JADX WARN: Removed duplicated region for block: B:30:0x01f1 A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:31:0x01f2  */ /* JADX WARN: Removed duplicated region for block: B:34:0x021d  */ /* JADX WARN: Removed duplicated region for block: B:35:0x0220  */ /* JADX WARN: Removed duplicated region for block: B:38:0x0253  */ /* JADX WARN: Removed duplicated region for block: B:39:0x0272  */ /* JADX WARN: Removed duplicated region for block: B:42:0x02ba  */ /* JADX WARN: Removed duplicated region for block: B:43:0x02bf  */ /* JADX WARN: Removed duplicated region for block: B:47:0x02ed  */ /* JADX WARN: Removed duplicated region for block: B:53:0x0454  */ /* JADX WARN: Removed duplicated region for block: B:54:0x0457  */ /* JADX WARN: Removed duplicated region for block: B:57:0x047f  */ /* JADX WARN: Removed duplicated region for block: B:62:0x04de  */ /* JADX WARN: Type inference failed for: r3v46, types: [java.util.Collection] */ /* JADX WARN: Type inference failed for: r4v47, types: [java.util.List] */ /* JADX WARN: Type inference failed for: r5v28, types: [java.util.Collection] */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x03c3 -> B:51:0x03dd). Please submit an issue!!! */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun load(r58: String?, r59: Continuation<in LoadResponse?>?): Any {
        /*
            Method dump skipped, instructions count: 1654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.StreamingcommunityProvider.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    private fun getM3u8Qualities(str: String, str2: String, str3: String): List<ExtractorLink> {
        val companion: M3u8Helper.Companion = M3u8Helper.Companion
        val name = name
        return M3u8Helper.Companion.`generateM3u8$default`(
            companion,
            name,
            str,
            str2,
            null,
            null,
            "$name - $str3",
            24,
            null
        )
    }

    /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */ /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */ /* JADX WARN: Removed duplicated region for block: B:22:0x00ea A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:23:0x00eb  */ /* JADX WARN: Removed duplicated region for block: B:27:0x01cc A[LOOP:0: B:25:0x01c6->B:27:0x01cc, LOOP_END] */
    @Override // com.lagradost.cloudstream3.MainAPI
            /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */    fun loadLinks(
        r28: String?,
        r29: Boolean,
        r30: Function1<SubtitleFile?, Unit>?,
        r31: Function1<ExtractorLink?, Unit>?,
        r32: Continuation<in Boolean?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.StreamingcommunityProvider.loadLinks(java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
    }

    companion object {
        val Companion = Companion(null)
        private val posterMap: HashMap<String, String> = HashMap()
    }
}