package com.lagradost.cloudstream3.movieproviders

import java.util.Set
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: VfFilmProvider.kt */
@Metadata(
    m108d1 = ["\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0019\u0010\u001c\u001a\u00020\u000c2\u0006\u0010\u001d\u001a\u00020\u000cH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000cH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJI\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u000c2\u0006\u0010$\u001a\u00020\u00042\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0&2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020(0&H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010+J\u001f\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-2\u0006\u0010/\u001a\u00020\u000cH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u000cX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u000cX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u000cX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u00060"],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/VfFilmProvider;", "Lcom/lagradost/cloudstream3/MainAPI;", "()V", "hasChromecastSupport", "", "getHasChromecastSupport", "()Z", "hasMainPage", "getHasMainPage", "hasQuickSearch", "getHasQuickSearch", "lang", "", "getLang", "()Ljava/lang/String;", "setLang", "(Ljava/lang/String;)V", "mainUrl", "getMainUrl", "setMainUrl", "name", "getName", "setName", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "getDirect", "original", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "", "Lcom/lagradost/cloudstream3/SearchResponse;", "query", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class VfFilmProvider : MainAPI() {
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasChromecastSupport = false

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasMainPage = false

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasQuickSearch = false

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var mainUrl = "https://vf-film.me"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var name = "vf-film.me"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }
    private var lang = "fr"

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val supportedTypes: Set<TvType> = SetsKt.setOf<TvType>(TvType.Movie)

    @Override // com.lagradost.cloudstream3.MainAPI
    override fun getLang(): String? {
        return lang
    }

    @Override // com.lagradost.cloudstream3.MainAPI
    override fun setLang(str: String) {
        Intrinsics.checkNotNullParameter(str, "<set-?>")
        lang = str
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */ /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */ /* JADX WARN: Removed duplicated region for block: B:28:0x00ac  */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun search(
        r21: String?,
        r22: Continuation<in MutableList<out SearchResponse?>?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.VfFilmProvider.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    @Override // com.lagradost.cloudstream3.MainAPI
    fun loadLinks(
        str: String,
        z: Boolean,
        function1: Function1<SubtitleFile?, Unit>?,
        function12: Function1<ExtractorLink?, Unit>,
        continuation: Continuation<in Boolean?>?
    ): Object {
        if (str.length() <= 4) {
            return boxing.boxBoolean(false)
        }
        function12.invoke(
            ExtractorLink(
                name,
                name,
                str,
                "",
                Qualities.P720.value,
                false,
                null,
                null,
                192,
                null
            )
        )
        return boxing.boxBoolean(true)
    }

    /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */ /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */ /* JADX WARN: Removed duplicated region for block: B:27:0x00ca A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun getDirect(r23: String?, r24: Continuation<in String?>?): Any {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.VfFilmProvider.getDirect(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */ /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */ /* JADX WARN: Removed duplicated region for block: B:22:0x00b4  */ /* JADX WARN: Removed duplicated region for block: B:23:0x00b9  */ /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */ /* JADX WARN: Removed duplicated region for block: B:46:0x01ce  */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun load(r23: String?, r24: Continuation<in LoadResponse?>?): Any {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.VfFilmProvider.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }
}