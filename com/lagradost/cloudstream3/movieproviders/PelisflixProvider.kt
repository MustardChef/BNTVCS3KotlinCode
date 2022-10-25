package com.lagradost.cloudstream3.movieproviders

import java.util.Set
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: PelisflixProvider.kt */
@Metadata(
    m108d1 = ["\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010\u001c\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ\u001b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\u000cH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\"JI\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u000c2\u0006\u0010%\u001a\u00020\u00042\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0'2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020)0'H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010,J\u001f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u00100\u001a\u00020\u000cH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\"R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u000cX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u000cX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u000cX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/PelisflixProvider;", "Lcom/lagradost/cloudstream3/MainAPI;", "()V", "hasChromecastSupport", "", "getHasChromecastSupport", "()Z", "hasDownloadSupport", "getHasDownloadSupport", "hasMainPage", "getHasMainPage", "lang", "", "getLang", "()Ljava/lang/String;", "setLang", "(Ljava/lang/String;)V", "mainUrl", "getMainUrl", "setMainUrl", "name", "getName", "setName", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "getMainPage", "Lcom/lagradost/cloudstream3/HomePageResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "", "Lcom/lagradost/cloudstream3/SearchResponse;", "query", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class PelisflixProvider : MainAPI() {
    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var mainUrl = "https://pelisflix.li"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var name = "Pelisflix"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }
    private var lang = "es"

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

    @Override // com.lagradost.cloudstream3.MainAPI
    override fun getLang(): String? {
        return lang
    }

    @Override // com.lagradost.cloudstream3.MainAPI
    override fun setLang(str: String) {
        Intrinsics.checkNotNullParameter(str, "<set-?>")
        lang = str
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:22|(1:23)|24|25|26|27|(1:29)(8:31|13|14|(1:15)|18|19|20|(2:39|(2:41|42)(2:43|44))(0))) */ /* JADX WARN: Code restructure failed: missing block: B:36:0x01aa, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01ab, code lost:
        r14 = r23;
        r15 = r24;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */ /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */ /* JADX WARN: Removed duplicated region for block: B:21:0x00ae  */ /* JADX WARN: Removed duplicated region for block: B:31:0x0128 A[Catch: Exception -> 0x01a8, LOOP:0: B:29:0x0122->B:31:0x0128, LOOP_END, TryCatch #2 {Exception -> 0x01a8, blocks: (B:28:0x00fe, B:29:0x0122, B:31:0x0128, B:32:0x0186), top: B:51:0x00fe }] */ /* JADX WARN: Removed duplicated region for block: B:41:0x01bc  */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00f5 -> B:51:0x00fe). Please submit an issue!!! */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x01b5 -> B:19:0x00a8). Please submit an issue!!! */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun getMainPage(r39: Continuation<in HomePageResponse?>?): Any? {
        /*
            Method dump skipped, instructions count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.PelisflixProvider.getMainPage(kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */ /* JADX WARN: Removed duplicated region for block: B:21:0x00aa  */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun search(
        r21: String?,
        r22: Continuation<in MutableList<out SearchResponse?>?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.PelisflixProvider.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:1|(2:3|(18:5|6|(1:(1:(6:10|11|(3:13|(8:16|(1:32)(1:20)|21|(1:23)(1:31)|24|(2:26|27)(2:29|30)|28|14)|33)|34|35|(2:37|(1:39)(6:41|11|(0)|34|35|(4:42|(1:44)(1:47)|45|46)(0)))(0))(2:48|49))(1:50))(4:114|(1:116)(1:121)|117|(1:119)(1:120))|51|(1:113)(1:57)|58|(1:60)(1:112)|61|(1:63)(1:111)|64|65|66|67|68|69|70|71|(5:73|(8:76|(1:97)(1:80)|81|(3:85|(1:94)(1:89)|(3:91|92|93))|95|96|93|74)|98|99|(3:101|35|(0)(0))(2:102|103))(2:104|105)))|122|6|(0)(0)|51|(1:53)|113|58|(0)(0)|61|(0)(0)|64|65|66|67|68|69|70|71|(0)(0)) */ /* JADX WARN: Code restructure failed: missing block: B:46:0x021c, code lost:
        r12 = r32;
        r16 = r1.select(".TPostBg").attr(r12);
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03f5  */ /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */ /* JADX WARN: Removed duplicated region for block: B:111:0x0446  */ /* JADX WARN: Removed duplicated region for block: B:16:0x00ac  */ /* JADX WARN: Removed duplicated region for block: B:34:0x01cf  */ /* JADX WARN: Removed duplicated region for block: B:35:0x01d5  */ /* JADX WARN: Removed duplicated region for block: B:38:0x01da  */ /* JADX WARN: Removed duplicated region for block: B:39:0x01e9  */ /* JADX WARN: Removed duplicated region for block: B:49:0x022e  */ /* JADX WARN: Removed duplicated region for block: B:78:0x02d9  */ /* JADX WARN: Removed duplicated region for block: B:84:0x035f  */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0335 -> B:82:0x0343). Please submit an issue!!! */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun load(r57: String?, r58: Continuation<in LoadResponse?>?): Any {
        /*
            Method dump skipped, instructions count: 1121
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.PelisflixProvider.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */ /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */ /* JADX WARN: Removed duplicated region for block: B:23:0x00db  */ /* JADX WARN: Removed duplicated region for block: B:31:0x017c  */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x015a -> B:30:0x015d). Please submit an issue!!! */
    @Override // com.lagradost.cloudstream3.MainAPI
            /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */    fun loadLinks(
        r40: String?,
        r41: Boolean,
        r42: Function1<SubtitleFile?, Unit>?,
        r43: Function1<ExtractorLink?, Unit>?,
        r44: Continuation<in Boolean?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.PelisflixProvider.loadLinks(java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
    }
}