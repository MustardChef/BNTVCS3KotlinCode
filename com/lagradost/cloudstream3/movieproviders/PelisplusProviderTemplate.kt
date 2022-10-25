package com.lagradost.cloudstream3.movieproviders

import java.util.ArrayList
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: PelisplusProviderTemplate.kt */
@Metadata(
    m108d1 = ["\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0002J\u0011\u0010\u0015\u001a\u00020\u0016H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J-\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u000b2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ\u001b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\"JI\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u00042\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u001d0\u001b2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010(J)\u0010)\u001a\u0012\u0012\u0004\u0012\u00020+0*j\b\u0012\u0004\u0012\u00020+`,2\u0006\u0010-\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\"R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/PelisplusProviderTemplate;", "Lcom/lagradost/cloudstream3/MainAPI;", "()V", "hasMainPage", "", "getHasMainPage", "()Z", "hasQuickSearch", "getHasQuickSearch", "homePageUrlList", "", "", "getHomePageUrlList", "()Ljava/util/List;", "lang", "getLang", "()Ljava/lang/String;", "setLang", "(Ljava/lang/String;)V", "cleanName", TvContractCompat.PARAM_INPUT, "getMainPage", "Lcom/lagradost/cloudstream3/HomePageResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPelisStream", "link", "callback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLinks", "data", "isCasting", "subtitleCallback", "Lcom/lagradost/cloudstream3/SubtitleFile;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "Ljava/util/ArrayList;", "Lcom/lagradost/cloudstream3/SearchResponse;", "Lkotlin/collections/ArrayList;", "query", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes3.dex */
open class PelisplusProviderTemplate : MainAPI() {
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasQuickSearch = false
    private var lang = "es"
    open val homePageUrlList: List<String> = CollectionsKt.emptyList<Any>()

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasMainPage = true

    /* compiled from: PelisplusProviderTemplate.kt */
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
    fun search(str: String?, continuation: Continuation<in ArrayList<SearchResponse?>?>?): Object {
        return `search$suspendImpl`(this, str, continuation as Continuation<*>?)
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

    /* JADX INFO: Access modifiers changed from: private */
    fun cleanName(str: String?): String {
        return StringsKt.trim(
            Regex("([Tt]emporada (\\d+)|[Cc]apítulo (\\d+))|[Tt]emporada|[Cc]apítulo").replace(
                str,
                ""
            ) as CharSequence
        ).toString()
    }

    /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun getPelisStream(
        r21: String?,
        r22: Function1<ExtractorLink, Unit>?,
        r23: Continuation<in Boolean?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.PelisplusProviderTemplate.getPelisStream(java.lang.String, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */ /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */ /* JADX WARN: Removed duplicated region for block: B:34:0x0148  */ /* JADX WARN: Removed duplicated region for block: B:40:0x0168 A[SYNTHETIC] */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
        fun  /* synthetic */`search$suspendImpl`(
            r20: PelisplusProviderTemplate?,
            r21: String?,
            r22: Continuation<*>?
        ): Any {
            /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.PelisplusProviderTemplate.search\$suspendImpl(com.lagradost.cloudstream3.movieproviders.PelisplusProviderTemplate, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
        }

        /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */ /* JADX WARN: Removed duplicated region for block: B:27:0x00eb  */ /* JADX WARN: Removed duplicated region for block: B:64:0x01d2  */ /* JADX WARN: Removed duplicated region for block: B:81:0x0250  */ /* JADX WARN: Removed duplicated region for block: B:84:0x0298  */ /* JADX WARN: Removed duplicated region for block: B:88:0x0200 A[SYNTHETIC] */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
        fun  /* synthetic */`load$suspendImpl`(
            r42: PelisplusProviderTemplate?,
            r43: String?,
            r44: Continuation<*>?
        ): Any {
            /*
            Method dump skipped, instructions count: 724
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.PelisplusProviderTemplate.load\$suspendImpl(com.lagradost.cloudstream3.movieproviders.PelisplusProviderTemplate, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
        }

        fun  /* synthetic */`getMainPage$suspendImpl`(
            pelisplusProviderTemplate: PelisplusProviderTemplate,
            continuation: Continuation<*>?
        ): Object {
            val homePageUrlList = pelisplusProviderTemplate.homePageUrlList
            val arrayList = ArrayList()
            ParCollections.apmap(
                homePageUrlList,
                `PelisplusProviderTemplate$getMainPage$2`(
                    pelisplusProviderTemplate,
                    arrayList,
                    null
                )
            )
            return HomePageResponse(arrayList, null, null, null, null, 30, null)
        }

        /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */ /* JADX WARN: Removed duplicated region for block: B:20:0x00b4  */ /* JADX WARN: Removed duplicated region for block: B:23:0x00e2  */ /* JADX WARN: Removed duplicated region for block: B:26:0x0110  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
        fun  /* synthetic */`loadLinks$suspendImpl`(
            r21: PelisplusProviderTemplate?,
            r22: String?,
            r23: Boolean,
            r24: Function1<*, *>?,
            r25: Function1<*, *>?,
            r26: Continuation<*>?
        ): Any {
            /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.PelisplusProviderTemplate.loadLinks\$suspendImpl(com.lagradost.cloudstream3.movieproviders.PelisplusProviderTemplate, java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
        }
    }
}