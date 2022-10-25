package com.lagradost.cloudstream3.movieproviders

import android.util.Base64
import org.jsoup.nodes.Element
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: BongNgoProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 N2\u00020\u0001:\u0003LMNB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010!\u001a\u0004\u0018\u00010\u00042\u0006\u0010\"\u001a\u00020\u0004H\u0002J\u0016\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020\u0004J\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0$2\u0006\u0010(\u001a\u00020\u0004J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\u0013\u0010-\u001a\u0004\u0018\u00010.H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u00042\u0006\u00101\u001a\u000202H\u0002J/\u00103\u001a\u0004\u0018\u00010\u00042\u0006\u00104\u001a\u00020\u00042\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000406H\u0086@ø\u0001\u0000¢\u0006\u0002\u00107J\u001b\u00108\u001a\u0004\u0018\u0001092\u0006\u0010(\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010:JI\u0010;\u001a\u00020\b2\u0006\u0010<\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\b2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020A0?2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020A0?H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010DJ\u0019\u0010E\u001a\u00020F2\u0006\u0010(\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010:J!\u0010G\u001a\n\u0012\u0004\u0012\u00020H\u0018\u00010$2\u0006\u0010I\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010:J\u0012\u0010J\u001a\u00020\u0004*\u00020\u00042\u0006\u0010K\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000c\u0010\nR\u0014\u0010\r\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006O"],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/BongNgoProvider;", "Lcom/lagradost/cloudstream3/MainAPI;", "()V", "defaultPageUrl", "", "getDefaultPageUrl", "()Ljava/lang/String;", "hasChromecastSupport", "", "getHasChromecastSupport", "()Z", "hasDownloadSupport", "getHasDownloadSupport", "hasMainPage", "getHasMainPage", "hasQuickSearch", "getHasQuickSearch", "mainUrl", "getMainUrl", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "vpnStatus", "Lcom/lagradost/cloudstream3/VPNStatus;", "getVpnStatus", "()Lcom/lagradost/cloudstream3/VPNStatus;", "extractUrl", TvContractCompat.PARAM_INPUT, "extractUrls", "", "text", "getDataEpisode", "Lcom/lagradost/cloudstream3/Episode;", "url", "getItemMovie", "Lcom/lagradost/cloudstream3/MovieSearchResponse;", "it", "Lorg/jsoup/nodes/Element;", "getMainPage", "Lcom/lagradost/cloudstream3/HomePageResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPagingResult", "document", "Lorg/jsoup/nodes/Document;", "getRealHls", "urlPlaylist", "header", "", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadPage", "Lcom/lagradost/cloudstream3/PageResponse;", "search", "Lcom/lagradost/cloudstream3/SearchResponse;", "query", "decrypt", "password", "BongNgoResponse", "BongNgoSourceResponse", "Companion", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class BongNgoProvider : MainAPI() {
    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var mainUrl = "https://bongngovip.com/"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var name = "Bongngo"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasChromecastSupport: Boolean
        // com.lagradost.cloudstream3.MainAPI
        get() = false

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasDownloadSupport: Boolean
        // com.lagradost.cloudstream3.MainAPI
        get() = true

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasMainPage: Boolean
        // com.lagradost.cloudstream3.MainAPI
        get() = true

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasQuickSearch: Boolean
        // com.lagradost.cloudstream3.MainAPI
        get() = false

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val defaultPageUrl: String
        // com.lagradost.cloudstream3.MainAPI
        get() = "$mainUrl/phim-le/"

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val supportedTypes: Set<Any>
        // com.lagradost.cloudstream3.MainAPI
        get() = SetsKt.setOf<Object>(
            *arrayOf<TvType>(
                TvType.Movie,
                TvType.TvSeries
            ) as Array<Object>
        )

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val vpnStatus: VPNStatus
        // com.lagradost.cloudstream3.MainAPI
        get() = VPNStatus.None

    /* compiled from: BongNgoProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/BongNgoProvider\$Companion;", "", "()V", "HOST_GET_SUB", "", "HOST_STREAM", "URL_REFERER_STREAM", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */ /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */ /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */ /* JADX WARN: Removed duplicated region for block: B:37:0x0172 A[LOOP:2: B:35:0x0166->B:37:0x0172, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:41:0x01dd A[LOOP:3: B:39:0x01d7->B:41:0x01dd, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:44:0x0233 A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:45:0x0234  */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun getMainPage(r30: Continuation<in HomePageResponse?>?): Any? {
        /*
            Method dump skipped, instructions count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.BongNgoProvider.getMainPage(kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */ /* JADX WARN: Removed duplicated region for block: B:21:0x0096 A[LOOP:0: B:19:0x0090->B:21:0x0096, LOOP_END] */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun loadPage(r21: String?, r22: Continuation<in PageResponse?>?): Any {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof com.lagradost.cloudstream3.movieproviders.BongNgoProvider$loadPage$1
            if (r2 == 0) goto L18
            r2 = r1
            com.lagradost.cloudstream3.movieproviders.BongNgoProvider$loadPage$1 r2 = (com.lagradost.cloudstream3.movieproviders.BongNgoProvider$loadPage$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r1 = r2.label
            int r1 = r1 - r4
            r2.label = r1
            goto L1d
        L18:
            com.lagradost.cloudstream3.movieproviders.BongNgoProvider$loadPage$1 r2 = new com.lagradost.cloudstream3.movieproviders.BongNgoProvider$loadPage$1
            r2.<init>(r0, r1)
        L1d:
            java.lang.Object r1 = r2.result
            java.lang.Object r15 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r2.label
            r4 = 1
            if (r3 == 0) goto L3a
            if (r3 != r4) goto L32
            java.lang.Object r2 = r2.L$0
            com.lagradost.cloudstream3.movieproviders.BongNgoProvider r2 = (com.lagradost.cloudstream3.movieproviders.BongNgoProvider) r2
            kotlin.ResultKt.throwOnFailure(r1)
            goto L68
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            kotlin.ResultKt.throwOnFailure(r1)
            com.lagradost.cloudstream3.utils.Extensions$RequestCustom r1 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r3 = r1
            com.lagradost.nicehttp.Requests r3 = (com.lagradost.nicehttp.Requests) r3
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r1 = 0
            r17 = 2046(0x7fe, float:2.867E-42)
            r18 = 0
            r2.L$0 = r0
            r2.label = r4
            r4 = r21
            r19 = r15
            r15 = r1
            r16 = r2
            java.lang.Object r1 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18)
            r2 = r19
            if (r1 != r2) goto L67
            return r2
        L67:
            r2 = r0
        L68:
            com.lagradost.nicehttp.NiceResponse r1 = (com.lagradost.nicehttp.NiceResponse) r1
            java.lang.String r1 = r1.getText()
            org.jsoup.nodes.Document r1 = org.jsoup.Jsoup.parse(r1)
            java.lang.String r3 = ".los .box"
            org.jsoup.select.Elements r3 = r1.select(r3)
            java.lang.String r4 = "document.select(\".los .box\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r3, r5)
            r4.<init>(r5)
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r3 = r3.iterator()
        L90:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto La9
            java.lang.Object r5 = r3.next()
            org.jsoup.nodes.Element r5 = (org.jsoup.nodes.Element) r5
            java.lang.String r6 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            com.lagradost.cloudstream3.MovieSearchResponse r5 = r2.getItemMovie(r5)
            r4.add(r5)
            goto L90
        La9:
            java.util.List r4 = (java.util.List) r4
            com.lagradost.cloudstream3.PageResponse r3 = new com.lagradost.cloudstream3.PageResponse
            java.lang.String r5 = "document"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
            java.lang.String r1 = r2.getPagingResult(r1)
            r3.<init>(r4, r1)
            return r3
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.BongNgoProvider.loadPage(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    private fun getPagingResult(document: Document): String? {
        if (document.selectFirst(".pagination .page-numbers") == null) {
            LogUtils.m6080d("no more page", *arrayOfNulls<Object>(0))
        } else {
            val select: Elements = document.select(".pagination .page-numbers li")
            if (select != null && !select.isEmpty()) {
                val size: Int = select.size()
                var i = 0
                while (true) {
                    if (i >= size) {
                        break
                    }
                    val select2: Elements = select.get(i).select(TtmlNode.TAG_SPAN)
                    if (select2.attr("class") != null) {
                        val attr: String = select2.attr("class")
                        Intrinsics.checkNotNullExpressionValue(attr, "li).attr(\"class\")")
                        if (StringsKt.`contains$default`(
                                attr as CharSequence,
                                "current" as CharSequence,
                                false,
                                2,
                                null as Object?
                            )
                        ) {
                            if (i == select.size() - 1) {
                                LogUtils.m6080d("no more page", *arrayOfNulls<Object>(0))
                            } else {
                                val i2 = i + 1
                                if (select.get(i2) != null) {
                                    val elementsByTag: Elements =
                                        select.get(i2).getElementsByTag("a")
                                    if (elementsByTag != null && !elementsByTag.isEmpty()) {
                                        val first: Element = elementsByTag.first()
                                        Intrinsics.checkNotNull(first)
                                        val attr2: String =
                                            first.attr(ShareConstants.WEB_DIALOG_PARAM_HREF)
                                        Intrinsics.checkNotNullExpressionValue(
                                            attr2,
                                            "a.first()!!.attr(\"href\")"
                                        )
                                        val fixUrl: String = MainAPIKt.fixUrl(this, attr2)
                                        LogUtils.m6080d("has more page", *arrayOfNulls<Object>(0))
                                        return fixUrl
                                    }
                                    LogUtils.m6080d("no more page", *arrayOfNulls<Object>(0))
                                } else {
                                    LogUtils.m6080d("no more page", *arrayOfNulls<Object>(0))
                                }
                            }
                        }
                    }
                    i++
                }
            } else {
                LogUtils.m6080d("no more page", *arrayOfNulls<Object>(0))
            }
        }
        return null
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */ /* JADX WARN: Removed duplicated region for block: B:25:0x00bf A[LOOP:0: B:23:0x00b9->B:25:0x00bf, LOOP_END] */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun search(
        r21: String?,
        r22: Continuation<in MutableList<out SearchResponse?>?>?
    ): Any {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            boolean r3 = r2 instanceof com.lagradost.cloudstream3.movieproviders.BongNgoProvider$search$1
            if (r3 == 0) goto L1a
            r3 = r2
            com.lagradost.cloudstream3.movieproviders.BongNgoProvider$search$1 r3 = (com.lagradost.cloudstream3.movieproviders.BongNgoProvider$search$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r5
            if (r4 == 0) goto L1a
            int r2 = r3.label
            int r2 = r2 - r5
            r3.label = r2
            goto L1f
        L1a:
            com.lagradost.cloudstream3.movieproviders.BongNgoProvider$search$1 r3 = new com.lagradost.cloudstream3.movieproviders.BongNgoProvider$search$1
            r3.<init>(r0, r2)
        L1f:
            java.lang.Object r2 = r3.result
            java.lang.Object r15 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r3.label
            r5 = 1
            if (r4 == 0) goto L3c
            if (r4 != r5) goto L34
            java.lang.Object r1 = r3.L$0
            com.lagradost.cloudstream3.movieproviders.BongNgoProvider r1 = (com.lagradost.cloudstream3.movieproviders.BongNgoProvider) r1
            kotlin.ResultKt.throwOnFailure(r2)
            goto L91
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3c:
            kotlin.ResultKt.throwOnFailure(r2)
            java.lang.String r2 = "DEFAULT_SEARCH"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r2 == 0) goto L4c
            java.lang.String r1 = r20.getDefaultPageUrl()
            goto L69
        L4c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r20.getMainUrl()
            r2.append(r4)
            java.lang.String r4 = "/tim-kiem/"
            r2.append(r4)
            r2.append(r1)
            r1 = 47
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L69:
            com.lagradost.cloudstream3.utils.Extensions$RequestCustom r2 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r4 = r2
            com.lagradost.nicehttp.Requests r4 = (com.lagradost.nicehttp.Requests) r4
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r2 = 0
            r16 = 0
            r18 = 2046(0x7fe, float:2.867E-42)
            r19 = 0
            r3.L$0 = r0
            r3.label = r5
            r5 = r1
            r1 = r15
            r15 = r2
            r17 = r3
            java.lang.Object r2 = com.lagradost.nicehttp.Requests.get$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19)
            if (r2 != r1) goto L90
            return r1
        L90:
            r1 = r0
        L91:
            com.lagradost.nicehttp.NiceResponse r2 = (com.lagradost.nicehttp.NiceResponse) r2
            java.lang.String r2 = r2.getText()
            org.jsoup.nodes.Document r2 = org.jsoup.Jsoup.parse(r2)
            java.lang.String r3 = ".los .box"
            org.jsoup.select.Elements r2 = r2.select(r3)
            java.lang.String r3 = "document.select(\".los .box\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r4)
            r3.<init>(r4)
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r2 = r2.iterator()
        Lb9:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto Ld2
            java.lang.Object r4 = r2.next()
            org.jsoup.nodes.Element r4 = (org.jsoup.nodes.Element) r4
            java.lang.String r5 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            com.lagradost.cloudstream3.MovieSearchResponse r4 = r1.getItemMovie(r4)
            r3.add(r4)
            goto Lb9
        Ld2:
            java.util.List r3 = (java.util.List) r3
            return r3
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.BongNgoProvider.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    private fun getItemMovie(element: Element): MovieSearchResponse {
        val last: Element = element.select(".entry-title").last()
        Intrinsics.checkNotNull(last)
        val title: String = last.text()
        val selectFirst: Element = element.selectFirst("a")
        Intrinsics.checkNotNull(selectFirst)
        val attr: String = selectFirst.attr(ShareConstants.WEB_DIALOG_PARAM_HREF)
        Intrinsics.checkNotNullExpressionValue(attr, "it.selectFirst(\"a\")!!.attr(\"href\")")
        val fixUrl: String = MainAPIKt.fixUrl(this, attr)
        val selectFirst2: Element = element.selectFirst("img")
        Intrinsics.checkNotNull(selectFirst2)
        val attr2: String = selectFirst2.attr("src")
        Intrinsics.checkNotNullExpressionValue(title, "title")
        return MovieSearchResponse(
            title,
            fixUrl,
            name,
            TvType.Movie,
            attr2,
            0,
            null,
            null,
            null,
            448,
            null
        )
    }

    fun decrypt(str: String?, password: String): String {
        Intrinsics.checkNotNullParameter(str, "<this>")
        Intrinsics.checkNotNullParameter(password, "password")
        val bytes: ByteArray = password.getBytes(Charsets.UTF_8)
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)")
        val secretKeySpec = SecretKeySpec(bytes, "AES")
        val bArr = ByteArray(16)
        val charArray: CharArray = password.toCharArray()
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()")
        val length = charArray.size
        for (i in 0 until length) {
            bArr[i] = charArray[i].code.toByte()
        }
        val ivParameterSpec = IvParameterSpec(bArr)
        val cipher: Cipher = Cipher.getInstance("AES/GCM/NoPadding")
        cipher.init(2, secretKeySpec, ivParameterSpec)
        val decryptedByteValue: ByteArray = cipher.doFinal(Base64.decode(str, 0))
        Intrinsics.checkNotNullExpressionValue(decryptedByteValue, "decryptedByteValue")
        return String(decryptedByteValue, Charsets.UTF_8)
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(7:5|6|(1:(2:139|(1:(1:(10:143|144|145|93|(4:96|(1:105)(5:98|99|(1:101)|102|103)|104|94)|106|89|(21:47|(19:52|(1:54)|55|(15:60|(1:62)|63|(1:65)|66|(9:71|(4:73|74|(1:76)(2:110|(1:112)(2:113|(1:115)(12:116|117|(9:122|(1:124)(1:126)|125|79|(4:84|(2:86|(1:88)(5:90|(1:92)|93|(1:94)|106))(1:108)|89|(0))|109|(0)(0)|89|(0))|127|(0)(0)|125|79|(5:81|84|(0)(0)|89|(0))|109|(0)(0)|89|(0))))|77)(2:128|(1:130)(1:131))|78|79|(0)|109|(0)(0)|89|(0))|132|(0)(0)|78|79|(0)|109|(0)(0)|89|(0))|133|(0)|63|(0)|66|(10:68|71|(0)(0)|78|79|(0)|109|(0)(0)|89|(0))|132|(0)(0)|78|79|(0)|109|(0)(0)|89|(0))|134|(0)|55|(16:57|60|(0)|63|(0)|66|(0)|132|(0)(0)|78|79|(0)|109|(0)(0)|89|(0))|133|(0)|63|(0)|66|(0)|132|(0)(0)|78|79|(0)|109|(0)(0)|89|(0))|135|136)(2:146|147))(16:148|149|150|117|(12:119|122|(0)(0)|125|79|(0)|109|(0)(0)|89|(0)|135|136)|127|(0)(0)|125|79|(0)|109|(0)(0)|89|(0)|135|136))(13:151|152|153|17|(6:21|(1:32)(1:25)|(3:27|28|29)(1:31)|30|19|18)|33|34|(4:37|(3:39|40|41)(1:43)|42|35)|44|45|(0)|135|136))(1:9))(2:156|(1:158)(1:159))|10|11|12|(1:14)(11:16|17|(2:19|18)|33|34|(1:35)|44|45|(0)|135|136)))|160|6|(0)(0)|10|11|12|(0)(0)|(1:(0))) */ /* JADX WARN: Code restructure failed: missing block: B:140:0x0603, code lost:
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x04a2  */ /* JADX WARN: Removed duplicated region for block: B:107:0x04a3  */ /* JADX WARN: Removed duplicated region for block: B:109:0x04d2  */ /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */ /* JADX WARN: Removed duplicated region for block: B:116:0x0512 A[Catch: Exception -> 0x0603, TryCatch #1 {Exception -> 0x0603, blocks: (B:128:0x0599, B:129:0x05c6, B:131:0x05cc, B:133:0x05d8, B:135:0x05de, B:136:0x05f0, B:57:0x02f4, B:59:0x0320, B:65:0x032c, B:66:0x0332, B:68:0x0337, B:74:0x0343, B:75:0x0349, B:77:0x034f, B:78:0x0365, B:80:0x036a, B:86:0x0376, B:89:0x0386, B:114:0x050d, B:116:0x0512, B:122:0x051e, B:124:0x0530, B:125:0x0547, B:91:0x03dc, B:93:0x03e8, B:94:0x043a, B:98:0x048c, B:100:0x0494, B:108:0x04a4, B:111:0x04da, B:37:0x0254, B:38:0x027d, B:41:0x0285, B:43:0x0296, B:48:0x02a7, B:49:0x02ab, B:50:0x02c3, B:52:0x02c9, B:54:0x02da, B:55:0x02de, B:33:0x01d6), top: B:145:0x01d6 }] */ /* JADX WARN: Removed duplicated region for block: B:122:0x051e A[Catch: Exception -> 0x0603, TryCatch #1 {Exception -> 0x0603, blocks: (B:128:0x0599, B:129:0x05c6, B:131:0x05cc, B:133:0x05d8, B:135:0x05de, B:136:0x05f0, B:57:0x02f4, B:59:0x0320, B:65:0x032c, B:66:0x0332, B:68:0x0337, B:74:0x0343, B:75:0x0349, B:77:0x034f, B:78:0x0365, B:80:0x036a, B:86:0x0376, B:89:0x0386, B:114:0x050d, B:116:0x0512, B:122:0x051e, B:124:0x0530, B:125:0x0547, B:91:0x03dc, B:93:0x03e8, B:94:0x043a, B:98:0x048c, B:100:0x0494, B:108:0x04a4, B:111:0x04da, B:37:0x0254, B:38:0x027d, B:41:0x0285, B:43:0x0296, B:48:0x02a7, B:49:0x02ab, B:50:0x02c3, B:52:0x02c9, B:54:0x02da, B:55:0x02de, B:33:0x01d6), top: B:145:0x01d6 }] */ /* JADX WARN: Removed duplicated region for block: B:131:0x05cc A[Catch: Exception -> 0x0603, TryCatch #1 {Exception -> 0x0603, blocks: (B:128:0x0599, B:129:0x05c6, B:131:0x05cc, B:133:0x05d8, B:135:0x05de, B:136:0x05f0, B:57:0x02f4, B:59:0x0320, B:65:0x032c, B:66:0x0332, B:68:0x0337, B:74:0x0343, B:75:0x0349, B:77:0x034f, B:78:0x0365, B:80:0x036a, B:86:0x0376, B:89:0x0386, B:114:0x050d, B:116:0x0512, B:122:0x051e, B:124:0x0530, B:125:0x0547, B:91:0x03dc, B:93:0x03e8, B:94:0x043a, B:98:0x048c, B:100:0x0494, B:108:0x04a4, B:111:0x04da, B:37:0x0254, B:38:0x027d, B:41:0x0285, B:43:0x0296, B:48:0x02a7, B:49:0x02ab, B:50:0x02c3, B:52:0x02c9, B:54:0x02da, B:55:0x02de, B:33:0x01d6), top: B:145:0x01d6 }] */ /* JADX WARN: Removed duplicated region for block: B:138:0x05f3  */ /* JADX WARN: Removed duplicated region for block: B:28:0x00d8  */ /* JADX WARN: Removed duplicated region for block: B:35:0x024f A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:36:0x0250  */ /* JADX WARN: Removed duplicated region for block: B:41:0x0285 A[Catch: Exception -> 0x0603, TRY_ENTER, TryCatch #1 {Exception -> 0x0603, blocks: (B:128:0x0599, B:129:0x05c6, B:131:0x05cc, B:133:0x05d8, B:135:0x05de, B:136:0x05f0, B:57:0x02f4, B:59:0x0320, B:65:0x032c, B:66:0x0332, B:68:0x0337, B:74:0x0343, B:75:0x0349, B:77:0x034f, B:78:0x0365, B:80:0x036a, B:86:0x0376, B:89:0x0386, B:114:0x050d, B:116:0x0512, B:122:0x051e, B:124:0x0530, B:125:0x0547, B:91:0x03dc, B:93:0x03e8, B:94:0x043a, B:98:0x048c, B:100:0x0494, B:108:0x04a4, B:111:0x04da, B:37:0x0254, B:38:0x027d, B:41:0x0285, B:43:0x0296, B:48:0x02a7, B:49:0x02ab, B:50:0x02c3, B:52:0x02c9, B:54:0x02da, B:55:0x02de, B:33:0x01d6), top: B:145:0x01d6 }] */ /* JADX WARN: Removed duplicated region for block: B:52:0x02c9 A[Catch: Exception -> 0x0603, TryCatch #1 {Exception -> 0x0603, blocks: (B:128:0x0599, B:129:0x05c6, B:131:0x05cc, B:133:0x05d8, B:135:0x05de, B:136:0x05f0, B:57:0x02f4, B:59:0x0320, B:65:0x032c, B:66:0x0332, B:68:0x0337, B:74:0x0343, B:75:0x0349, B:77:0x034f, B:78:0x0365, B:80:0x036a, B:86:0x0376, B:89:0x0386, B:114:0x050d, B:116:0x0512, B:122:0x051e, B:124:0x0530, B:125:0x0547, B:91:0x03dc, B:93:0x03e8, B:94:0x043a, B:98:0x048c, B:100:0x0494, B:108:0x04a4, B:111:0x04da, B:37:0x0254, B:38:0x027d, B:41:0x0285, B:43:0x0296, B:48:0x02a7, B:49:0x02ab, B:50:0x02c3, B:52:0x02c9, B:54:0x02da, B:55:0x02de, B:33:0x01d6), top: B:145:0x01d6 }] */ /* JADX WARN: Removed duplicated region for block: B:57:0x02f4 A[Catch: Exception -> 0x0603, TryCatch #1 {Exception -> 0x0603, blocks: (B:128:0x0599, B:129:0x05c6, B:131:0x05cc, B:133:0x05d8, B:135:0x05de, B:136:0x05f0, B:57:0x02f4, B:59:0x0320, B:65:0x032c, B:66:0x0332, B:68:0x0337, B:74:0x0343, B:75:0x0349, B:77:0x034f, B:78:0x0365, B:80:0x036a, B:86:0x0376, B:89:0x0386, B:114:0x050d, B:116:0x0512, B:122:0x051e, B:124:0x0530, B:125:0x0547, B:91:0x03dc, B:93:0x03e8, B:94:0x043a, B:98:0x048c, B:100:0x0494, B:108:0x04a4, B:111:0x04da, B:37:0x0254, B:38:0x027d, B:41:0x0285, B:43:0x0296, B:48:0x02a7, B:49:0x02ab, B:50:0x02c3, B:52:0x02c9, B:54:0x02da, B:55:0x02de, B:33:0x01d6), top: B:145:0x01d6 }] */ /* JADX WARN: Removed duplicated region for block: B:65:0x032c A[Catch: Exception -> 0x0603, TryCatch #1 {Exception -> 0x0603, blocks: (B:128:0x0599, B:129:0x05c6, B:131:0x05cc, B:133:0x05d8, B:135:0x05de, B:136:0x05f0, B:57:0x02f4, B:59:0x0320, B:65:0x032c, B:66:0x0332, B:68:0x0337, B:74:0x0343, B:75:0x0349, B:77:0x034f, B:78:0x0365, B:80:0x036a, B:86:0x0376, B:89:0x0386, B:114:0x050d, B:116:0x0512, B:122:0x051e, B:124:0x0530, B:125:0x0547, B:91:0x03dc, B:93:0x03e8, B:94:0x043a, B:98:0x048c, B:100:0x0494, B:108:0x04a4, B:111:0x04da, B:37:0x0254, B:38:0x027d, B:41:0x0285, B:43:0x0296, B:48:0x02a7, B:49:0x02ab, B:50:0x02c3, B:52:0x02c9, B:54:0x02da, B:55:0x02de, B:33:0x01d6), top: B:145:0x01d6 }] */ /* JADX WARN: Removed duplicated region for block: B:74:0x0343 A[Catch: Exception -> 0x0603, TryCatch #1 {Exception -> 0x0603, blocks: (B:128:0x0599, B:129:0x05c6, B:131:0x05cc, B:133:0x05d8, B:135:0x05de, B:136:0x05f0, B:57:0x02f4, B:59:0x0320, B:65:0x032c, B:66:0x0332, B:68:0x0337, B:74:0x0343, B:75:0x0349, B:77:0x034f, B:78:0x0365, B:80:0x036a, B:86:0x0376, B:89:0x0386, B:114:0x050d, B:116:0x0512, B:122:0x051e, B:124:0x0530, B:125:0x0547, B:91:0x03dc, B:93:0x03e8, B:94:0x043a, B:98:0x048c, B:100:0x0494, B:108:0x04a4, B:111:0x04da, B:37:0x0254, B:38:0x027d, B:41:0x0285, B:43:0x0296, B:48:0x02a7, B:49:0x02ab, B:50:0x02c3, B:52:0x02c9, B:54:0x02da, B:55:0x02de, B:33:0x01d6), top: B:145:0x01d6 }] */ /* JADX WARN: Removed duplicated region for block: B:77:0x034f A[Catch: Exception -> 0x0603, TryCatch #1 {Exception -> 0x0603, blocks: (B:128:0x0599, B:129:0x05c6, B:131:0x05cc, B:133:0x05d8, B:135:0x05de, B:136:0x05f0, B:57:0x02f4, B:59:0x0320, B:65:0x032c, B:66:0x0332, B:68:0x0337, B:74:0x0343, B:75:0x0349, B:77:0x034f, B:78:0x0365, B:80:0x036a, B:86:0x0376, B:89:0x0386, B:114:0x050d, B:116:0x0512, B:122:0x051e, B:124:0x0530, B:125:0x0547, B:91:0x03dc, B:93:0x03e8, B:94:0x043a, B:98:0x048c, B:100:0x0494, B:108:0x04a4, B:111:0x04da, B:37:0x0254, B:38:0x027d, B:41:0x0285, B:43:0x0296, B:48:0x02a7, B:49:0x02ab, B:50:0x02c3, B:52:0x02c9, B:54:0x02da, B:55:0x02de, B:33:0x01d6), top: B:145:0x01d6 }] */ /* JADX WARN: Removed duplicated region for block: B:80:0x036a A[Catch: Exception -> 0x0603, TryCatch #1 {Exception -> 0x0603, blocks: (B:128:0x0599, B:129:0x05c6, B:131:0x05cc, B:133:0x05d8, B:135:0x05de, B:136:0x05f0, B:57:0x02f4, B:59:0x0320, B:65:0x032c, B:66:0x0332, B:68:0x0337, B:74:0x0343, B:75:0x0349, B:77:0x034f, B:78:0x0365, B:80:0x036a, B:86:0x0376, B:89:0x0386, B:114:0x050d, B:116:0x0512, B:122:0x051e, B:124:0x0530, B:125:0x0547, B:91:0x03dc, B:93:0x03e8, B:94:0x043a, B:98:0x048c, B:100:0x0494, B:108:0x04a4, B:111:0x04da, B:37:0x0254, B:38:0x027d, B:41:0x0285, B:43:0x0296, B:48:0x02a7, B:49:0x02ab, B:50:0x02c3, B:52:0x02c9, B:54:0x02da, B:55:0x02de, B:33:0x01d6), top: B:145:0x01d6 }] */ /* JADX WARN: Removed duplicated region for block: B:86:0x0376 A[Catch: Exception -> 0x0603, TRY_LEAVE, TryCatch #1 {Exception -> 0x0603, blocks: (B:128:0x0599, B:129:0x05c6, B:131:0x05cc, B:133:0x05d8, B:135:0x05de, B:136:0x05f0, B:57:0x02f4, B:59:0x0320, B:65:0x032c, B:66:0x0332, B:68:0x0337, B:74:0x0343, B:75:0x0349, B:77:0x034f, B:78:0x0365, B:80:0x036a, B:86:0x0376, B:89:0x0386, B:114:0x050d, B:116:0x0512, B:122:0x051e, B:124:0x0530, B:125:0x0547, B:91:0x03dc, B:93:0x03e8, B:94:0x043a, B:98:0x048c, B:100:0x0494, B:108:0x04a4, B:111:0x04da, B:37:0x0254, B:38:0x027d, B:41:0x0285, B:43:0x0296, B:48:0x02a7, B:49:0x02ab, B:50:0x02c3, B:52:0x02c9, B:54:0x02da, B:55:0x02de, B:33:0x01d6), top: B:145:0x01d6 }] */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:139:0x05f8 -> B:56:0x02f2). Please submit an issue!!! */
    @Override // com.lagradost.cloudstream3.MainAPI
            /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */    fun loadLinks(
        r45: String?,
        r46: Boolean,
        r47: Function1<SubtitleFile?, Unit>?,
        r48: Function1<ExtractorLink?, Unit>?,
        r49: Continuation<in Boolean?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 1570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.BongNgoProvider.loadLinks(java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */ /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun getRealHls(r21: String?, r22: Map<String?, String?>?, r23: Continuation<in String?>?): Any {
        /*
            r20 = this;
            r0 = r23
            boolean r1 = r0 instanceof com.lagradost.cloudstream3.movieproviders.BongNgoProvider$getRealHls$1
            if (r1 == 0) goto L18
            r1 = r0
            com.lagradost.cloudstream3.movieproviders.BongNgoProvider$getRealHls$1 r1 = (com.lagradost.cloudstream3.movieproviders.BongNgoProvider$getRealHls$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L18
            int r0 = r1.label
            int r0 = r0 - r3
            r1.label = r0
            r2 = r20
            goto L1f
        L18:
            com.lagradost.cloudstream3.movieproviders.BongNgoProvider$getRealHls$1 r1 = new com.lagradost.cloudstream3.movieproviders.BongNgoProvider$getRealHls$1
            r2 = r20
            r1.<init>(r2, r0)
        L1f:
            java.lang.Object r0 = r1.result
            java.lang.Object r15 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.label
            r4 = 1
            if (r3 == 0) goto L3c
            if (r3 != r4) goto L34
            java.lang.Object r1 = r1.L$0
            java.lang.String r1 = (java.lang.String) r1
            kotlin.ResultKt.throwOnFailure(r0)
            goto L6e
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3c:
            kotlin.ResultKt.throwOnFailure(r0)
            com.lagradost.cloudstream3.utils.Extensions$RequestCustom r0 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r3 = r0
            com.lagradost.nicehttp.Requests r3 = (com.lagradost.nicehttp.Requests) r3
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r0 = 0
            r17 = 2044(0x7fc, float:2.864E-42)
            r18 = 0
            r5 = r21
            r1.L$0 = r5
            r1.label = r4
            r4 = r21
            r5 = r22
            r19 = r15
            r15 = r0
            r16 = r1
            java.lang.Object r0 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18)
            r1 = r19
            if (r0 != r1) goto L6c
            return r1
        L6c:
            r1 = r21
        L6e:
            com.lagradost.nicehttp.NiceResponse r0 = (com.lagradost.nicehttp.NiceResponse) r0
            java.lang.String r0 = r0.getText()
            kotlin.text.Regex r3 = new kotlin.text.Regex
            java.lang.String r4 = ".*\\.m3u8"
            r3.<init>(r4)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r4 = 0
            r5 = 2
            r6 = 0
            kotlin.text.MatchResult r0 = kotlin.text.Regex.find$default(r3, r0, r4, r5, r6)
            if (r0 == 0) goto L8a
            java.lang.String r6 = r0.getValue()
        L8a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "https://"
            r0.append(r3)
            android.net.Uri r1 = android.net.Uri.parse(r1)
            java.lang.String r1 = r1.getHost()
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.BongNgoProvider.getRealHls(java.lang.String, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */ /* JADX WARN: Removed duplicated region for block: B:20:0x00a1  */ /* JADX WARN: Removed duplicated region for block: B:38:0x0197 A[LOOP:1: B:37:0x0195->B:38:0x0197, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:46:0x01c6  */ /* JADX WARN: Removed duplicated region for block: B:47:0x0202  */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun load(r42: String?, r43: Continuation<in LoadResponse?>?): Any {
        /*
            Method dump skipped, instructions count: 571
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.BongNgoProvider.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    fun getDataEpisode(url: String?): List<Episode> {
        Intrinsics.checkNotNullParameter(url, "url")
        val document: Document = Jsoup.connect(url).timeout(TimeConstants.MIN).get()
        Intrinsics.checkNotNullExpressionValue(document, "connect(url).timeout(60 * 1000).get()")
        val select: Elements = document.select("#movie-list-server .epg")
        val arrayList = ArrayList()
        val size: Int = select.size()
        for (i in 0 until size) {
            val element: Element = select.get(i)
            val text: String = element.select("h3").text()
            val select2: Elements = element.select(".movie-list-eps li")
            var i2 = 0
            var size2: Int = select2.size()
            while (i2 < size2) {
                val element2: Element = select2.get(i2)
                val url2: String = element2.select("a").attr(ShareConstants.WEB_DIALOG_PARAM_HREF)
                val text2: String = element2.select("a").text()
                element2.select("a").attr("data-id")
                element2.select("a").attr("data-fid")
                element2.select("a").attr("data-key")
                Intrinsics.checkNotNullExpressionValue(url2, "url")
                arrayList.add(
                    Episode(
                        url2,
                        text2,
                        Integer.valueOf(i),
                        null,
                        null,
                        null,
                        text,
                        null,
                        176,
                        null
                    )
                )
                i2++
                size2 = size2
            }
        }
        return arrayList
    }

    private fun extractUrl(str: String): String? {
        var obj: Object?
        var `replace$default`: String?
        val it: Iterator = StringsKt.`split$default`(
            str as CharSequence,
            arrayOf(" "),
            false,
            0,
            6,
            null as Object?
        ).iterator()
        while (true) {
            if (!it.hasNext()) {
                obj = null
                break
            }
            obj = it.next()
            if (Patterns.WEB_URL.matcher(obj as String?).find()) {
                break
            }
        }
        val str2 = obj as String?
        return if (str2 == null || StringsKt.`replace$default`(
                str2,
                "url(",
                "",
                false,
                4,
                null as Object?
            )
                .also { `replace$default` = it } == null
        ) {
            null
        } else StringsKt.`replace$default`(
            `replace$default`,
            ")",
            "",
            false,
            4,
            null as Object?
        )
    }

    fun extractUrls(text: String): List<String> {
        Intrinsics.checkNotNullParameter(text, "text")
        val arrayList = ArrayList()
        val compile: Pattern = Pattern.compile(
            "((https?|ftp|gopher|telnet|file):((//)|(\\\\))+[\\w\\d:#@%/;$()~_?\\+-=\\\\\\.&]*)",
            2
        )
        Intrinsics.checkNotNullExpressionValue(
            compile,
            "compile(urlRegex, Pattern.CASE_INSENSITIVE)"
        )
        val matcher: Matcher = compile.matcher(text)
        Intrinsics.checkNotNullExpressionValue(matcher, "pattern.matcher(text)")
        while (matcher.find()) {
            val substring: String = text.substring(matcher.start(0), matcher.end(0))
            Intrinsics.checkNotNullExpressionValue(
                substring,
                "this as java.lang.String…ing(startIndex, endIndex)"
            )
            arrayList.add(substring)
        }
        return arrayList
    }

    /* compiled from: BongNgoProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\t¨\u0006\u0018"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/BongNgoProvider\$BongNgoSourceResponse;", "", SDKConstants.PARAM_KEY, "", "link", "typeplay", "namesv", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getLink", "getNamesv", "getTypeplay", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class BongNgoSourceResponse(
        @JsonProperty("key") key: String,
        @JsonProperty("link") link: String,
        @JsonProperty("typeplay") typeplay: String,
        @JsonProperty("namesv") namesv: String
    ) {
        val key: String
        val link: String
        val namesv: String
        val typeplay: String
        operator fun component1(): String {
            return key
        }

        operator fun component2(): String {
            return link
        }

        operator fun component3(): String {
            return typeplay
        }

        operator fun component4(): String {
            return namesv
        }

        fun copy(
            @JsonProperty("key") key: String,
            @JsonProperty("link") link: String,
            @JsonProperty("typeplay") typeplay: String,
            @JsonProperty("namesv") namesv: String
        ): BongNgoSourceResponse {
            Intrinsics.checkNotNullParameter(key, "key")
            Intrinsics.checkNotNullParameter(link, "link")
            Intrinsics.checkNotNullParameter(typeplay, "typeplay")
            Intrinsics.checkNotNullParameter(namesv, "namesv")
            return BongNgoSourceResponse(key, link, typeplay, namesv)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is BongNgoSourceResponse) {
                val bongNgoSourceResponse = obj as BongNgoSourceResponse
                return Intrinsics.areEqual(key, bongNgoSourceResponse.key) && Intrinsics.areEqual(
                    link, bongNgoSourceResponse.link
                ) && Intrinsics.areEqual(
                    typeplay, bongNgoSourceResponse.typeplay
                ) && Intrinsics.areEqual(
                    namesv, bongNgoSourceResponse.namesv
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return ((key.hashCode() * 31 + link.hashCode()) * 31 + typeplay.hashCode()) * 31 + namesv.hashCode()
        }

        override fun toString(): String {
            return "BongNgoSourceResponse(key=" + key + ", link=" + link + ", typeplay=" + typeplay + ", namesv=" + namesv + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(key, "key")
            Intrinsics.checkNotNullParameter(link, "link")
            Intrinsics.checkNotNullParameter(typeplay, "typeplay")
            Intrinsics.checkNotNullParameter(namesv, "namesv")
            this.key = key
            this.link = link
            this.typeplay = typeplay
            this.namesv = namesv
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                bongNgoSourceResponse: BongNgoSourceResponse,
                str: String,
                str2: String,
                str3: String,
                str4: String,
                i: Int,
                obj: Object?
            ): BongNgoSourceResponse {
                var str = str
                var str2 = str2
                var str3 = str3
                var str4 = str4
                if (i and 1 != 0) {
                    str = bongNgoSourceResponse.key
                }
                if (i and 2 != 0) {
                    str2 = bongNgoSourceResponse.link
                }
                if (i and 4 != 0) {
                    str3 = bongNgoSourceResponse.typeplay
                }
                if (i and 8 != 0) {
                    str4 = bongNgoSourceResponse.namesv
                }
                return bongNgoSourceResponse.copy(str, str2, str3, str4)
            }
        }
    }

    /* compiled from: BongNgoProvider.kt */
    @Metadata(
        m108d1 = ["\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/BongNgoProvider\$BongNgoResponse;", "", "source", "", "Lcom/lagradost/cloudstream3/movieproviders/BongNgoProvider\$BongNgoSourceResponse;", "subtitle", "", "(Ljava/util/List;Ljava/lang/String;)V", "getSource", "()Ljava/util/List;", "getSubtitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class BongNgoResponse(
        @JsonProperty("source") source: List<BongNgoSourceResponse>,
        @JsonProperty("subtitle") subtitle: String
    ) {
        val source: List<BongNgoSourceResponse>
        val subtitle: String
        operator fun component1(): List<BongNgoSourceResponse> {
            return source
        }

        operator fun component2(): String {
            return subtitle
        }

        fun copy(
            @JsonProperty("source") source: List<BongNgoSourceResponse>,
            @JsonProperty("subtitle") subtitle: String
        ): BongNgoResponse {
            Intrinsics.checkNotNullParameter(source, "source")
            Intrinsics.checkNotNullParameter(subtitle, "subtitle")
            return BongNgoResponse(source, subtitle)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is BongNgoResponse) {
                val bongNgoResponse = obj as BongNgoResponse
                return Intrinsics.areEqual(source, bongNgoResponse.source) && Intrinsics.areEqual(
                    subtitle, bongNgoResponse.subtitle
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return source.hashCode() * 31 + subtitle.hashCode()
        }

        override fun toString(): String {
            return "BongNgoResponse(source=" + source + ", subtitle=" + subtitle + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(source, "source")
            Intrinsics.checkNotNullParameter(subtitle, "subtitle")
            this.source = source
            this.subtitle = subtitle
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                bongNgoResponse: BongNgoResponse,
                list: List,
                str: String,
                i: Int,
                obj: Object?
            ): BongNgoResponse {
                var list: List = list
                var str = str
                if (i and 1 != 0) {
                    list = bongNgoResponse.source
                }
                if (i and 2 != 0) {
                    str = bongNgoResponse.subtitle
                }
                return bongNgoResponse.copy(list, str)
            }
        }
    }

    companion object {
        val Companion = Companion(null)
        const val HOST_GET_SUB = "https://subtiles.0apis.xyz"
        const val HOST_STREAM = "https://api.cheapgames.xyz/ajax/episodes"
        const val URL_REFERER_STREAM = "https://streamcherry.biz/"
    }
}