package com.lagradost.cloudstream3.movieproviders

import android.util.Patterns
import org.jsoup.nodes.Element
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: PhimChillProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 E2\u00020\u0001:\u0001EB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010!\u001a\u0004\u0018\u00010\u00042\u0006\u0010\"\u001a\u00020\u0004H\u0002J\u0016\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020\u0004J\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0$2\u0006\u0010(\u001a\u00020\u0004J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\u0013\u0010-\u001a\u0004\u0018\u00010.H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u00042\u0006\u00101\u001a\u000202H\u0002J\u001b\u00103\u001a\u0004\u0018\u0001042\u0006\u0010(\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u00105JI\u00106\u001a\u00020\b2\u0006\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u00020\b2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<0:2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020<0:H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010?J\u0019\u0010@\u001a\u00020A2\u0006\u0010(\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u00105J!\u0010B\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010$2\u0006\u0010D\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u00105R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000c\u0010\nR\u0014\u0010\r\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006F"],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/PhimChillProvider;", "Lcom/lagradost/cloudstream3/MainAPI;", "()V", "defaultPageUrl", "", "getDefaultPageUrl", "()Ljava/lang/String;", "hasChromecastSupport", "", "getHasChromecastSupport", "()Z", "hasDownloadSupport", "getHasDownloadSupport", "hasMainPage", "getHasMainPage", "hasQuickSearch", "getHasQuickSearch", "mainUrl", "getMainUrl", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "vpnStatus", "Lcom/lagradost/cloudstream3/VPNStatus;", "getVpnStatus", "()Lcom/lagradost/cloudstream3/VPNStatus;", "extractUrl", TvContractCompat.PARAM_INPUT, "extractUrls", "", "text", "getDataEpisode", "Lcom/lagradost/cloudstream3/Episode;", "url", "getItemMovie", "Lcom/lagradost/cloudstream3/MovieSearchResponse;", "it", "Lorg/jsoup/nodes/Element;", "getMainPage", "Lcom/lagradost/cloudstream3/HomePageResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPagingResult", "document", "Lorg/jsoup/nodes/Document;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadPage", "Lcom/lagradost/cloudstream3/PageResponse;", "search", "Lcom/lagradost/cloudstream3/SearchResponse;", "query", "Companion", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class PhimChillProvider : MainAPI() {
    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var mainUrl = "https://phimmoichills.net"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var name = "Phimmoi"
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
        get() = "$mainUrl/genre/phim-chieu-rap/"

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

    /* compiled from: PhimChillProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/PhimChillProvider\$Companion;", "", "()V", "HOST_STREAM", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */ /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */ /* JADX WARN: Removed duplicated region for block: B:23:0x00ae  */ /* JADX WARN: Removed duplicated region for block: B:34:0x01ca A[LOOP:2: B:32:0x01c0->B:34:0x01ca, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:38:0x0233 A[LOOP:3: B:36:0x022d->B:38:0x0233, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:41:0x0289 A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:42:0x028a  */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun getMainPage(r34: Continuation<in HomePageResponse?>?): Any? {
        /*
            Method dump skipped, instructions count: 674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.PhimChillProvider.getMainPage(kotlin.coroutines.Continuation):java.lang.Object")
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
            boolean r2 = r1 instanceof com.lagradost.cloudstream3.movieproviders.PhimChillProvider$loadPage$1
            if (r2 == 0) goto L18
            r2 = r1
            com.lagradost.cloudstream3.movieproviders.PhimChillProvider$loadPage$1 r2 = (com.lagradost.cloudstream3.movieproviders.PhimChillProvider$loadPage$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r1 = r2.label
            int r1 = r1 - r4
            r2.label = r1
            goto L1d
        L18:
            com.lagradost.cloudstream3.movieproviders.PhimChillProvider$loadPage$1 r2 = new com.lagradost.cloudstream3.movieproviders.PhimChillProvider$loadPage$1
            r2.<init>(r0, r1)
        L1d:
            java.lang.Object r1 = r2.result
            java.lang.Object r15 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r2.label
            r4 = 1
            if (r3 == 0) goto L3a
            if (r3 != r4) goto L32
            java.lang.Object r2 = r2.L$0
            com.lagradost.cloudstream3.movieproviders.PhimChillProvider r2 = (com.lagradost.cloudstream3.movieproviders.PhimChillProvider) r2
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
            java.lang.String r3 = "#binlist .item"
            org.jsoup.select.Elements r3 = r1.select(r3)
            java.lang.String r4 = "document.select(\"#binlist .item\")"
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
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.PhimChillProvider.loadPage(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    private fun getPagingResult(document: Document): String? {
        if (document.selectFirst(".pagination li") == null) {
            LogUtils.m6080d("no more page", *arrayOfNulls<Object>(0))
        } else {
            val select: Elements = document.select(".pagination li")
            if (select != null && !select.isEmpty()) {
                val size: Int = select.size()
                var i = 0
                while (true) {
                    if (i >= size) {
                        break
                    }
                    val select2: Elements = select.get(i).select("a")
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
            boolean r3 = r2 instanceof com.lagradost.cloudstream3.movieproviders.PhimChillProvider$search$1
            if (r3 == 0) goto L1a
            r3 = r2
            com.lagradost.cloudstream3.movieproviders.PhimChillProvider$search$1 r3 = (com.lagradost.cloudstream3.movieproviders.PhimChillProvider$search$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r5
            if (r4 == 0) goto L1a
            int r2 = r3.label
            int r2 = r2 - r5
            r3.label = r2
            goto L1f
        L1a:
            com.lagradost.cloudstream3.movieproviders.PhimChillProvider$search$1 r3 = new com.lagradost.cloudstream3.movieproviders.PhimChillProvider$search$1
            r3.<init>(r0, r2)
        L1f:
            java.lang.Object r2 = r3.result
            java.lang.Object r15 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r3.label
            r5 = 1
            if (r4 == 0) goto L3c
            if (r4 != r5) goto L34
            java.lang.Object r1 = r3.L$0
            com.lagradost.cloudstream3.movieproviders.PhimChillProvider r1 = (com.lagradost.cloudstream3.movieproviders.PhimChillProvider) r1
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
            java.lang.String r3 = "#binlist .item"
            org.jsoup.select.Elements r2 = r2.select(r3)
            java.lang.String r3 = "document.select(\"#binlist .item\")"
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
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.PhimChillProvider.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    private fun getItemMovie(element: Element): MovieSearchResponse {
        val last: Element = element.select("h3").last()
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
            MapsKt.mapOf(TuplesKt.m100to<Any, Any>("referer", mainUrl)),
            192,
            null
        )
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(9:5|6|7|(1:(3:10|11|12)(2:74|75))(10:76|(2:77|(2:79|(1:82)(1:81))(2:96|97))|83|(1:95)|87|88|89|90|91|(1:93)(1:94))|13|15|(5:20|(1:22)(1:70)|23|24|(5:55|56|57|58|59)(16:26|(1:28)|29|30|31|32|33|34|(1:50)|36|37|(1:39)|40|(3:42|(2:45|43)|46)|47|48))|71|72))|100|6|7|(0)(0)|13|15|(6:17|20|(0)(0)|23|24|(0)(0))|71|72|(1:(0))) */ /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
        r11 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0347, code lost:
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */ /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */ /* JADX WARN: Removed duplicated region for block: B:47:0x0182 A[Catch: Exception -> 0x0349, TryCatch #3 {Exception -> 0x0349, blocks: (B:40:0x0168, B:42:0x0174, B:45:0x017c, B:47:0x0182, B:49:0x0188, B:36:0x015c), top: B:95:0x015c }] */ /* JADX WARN: Removed duplicated region for block: B:48:0x0187  */ /* JADX WARN: Removed duplicated region for block: B:57:0x01d9 A[Catch: Exception -> 0x031f, TryCatch #0 {Exception -> 0x031f, blocks: (B:53:0x01cb, B:57:0x01d9, B:60:0x01f2), top: B:90:0x0199 }] */ /* JADX WARN: Removed duplicated region for block: B:98:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */ /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */ /* JADX WARN: Type inference failed for: r4v1 */ /* JADX WARN: Type inference failed for: r4v2 */ /* JADX WARN: Type inference failed for: r4v3 */ /* JADX WARN: Type inference failed for: r4v5 */ /* JADX WARN: Type inference failed for: r4v6 */ /* JADX WARN: Type inference failed for: r4v8 */ /* JADX WARN: Type inference failed for: r4v9 */ /* JADX WARN: Type inference failed for: r9v0 */ /* JADX WARN: Type inference failed for: r9v1 */ /* JADX WARN: Type inference failed for: r9v2, types: [int] */ /* JADX WARN: Type inference failed for: r9v21 */ /* JADX WARN: Type inference failed for: r9v22 */ /* JADX WARN: Type inference failed for: r9v23 */ /* JADX WARN: Type inference failed for: r9v3, types: [boolean] */ /* JADX WARN: Type inference failed for: r9v6 */ /* JADX WARN: Type inference failed for: r9v7 */
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
            Method dump skipped, instructions count: 862
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.PhimChillProvider.loadLinks(java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */ /* JADX WARN: Removed duplicated region for block: B:20:0x00a5  */ /* JADX WARN: Removed duplicated region for block: B:39:0x0194 A[LOOP:1: B:37:0x018c->B:39:0x0194, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:47:0x0220  */ /* JADX WARN: Removed duplicated region for block: B:48:0x0264  */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun load(r43: String?, r44: Continuation<in LoadResponse?>?): Any {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.PhimChillProvider.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    fun getDataEpisode(url: String?): List<Episode> {
        Intrinsics.checkNotNullParameter(url, "url")
        val document: Document = Jsoup.connect(url).timeout(TimeConstants.MIN).get()
        Intrinsics.checkNotNullExpressionValue(document, "connect(url).timeout(60 * 1000).get()")
        val listEpHtml: Elements = document.select("#list_episodes li")
        val arrayList = ArrayList()
        Intrinsics.checkNotNullExpressionValue(listEpHtml, "listEpHtml")
        for (element in listEpHtml) {
            val selectFirst: Element = element.selectFirst("a")
            Intrinsics.checkNotNull(selectFirst)
            val url2: String = selectFirst.attr(ShareConstants.WEB_DIALOG_PARAM_HREF)
            val selectFirst2: Element = element.selectFirst("a")
            Intrinsics.checkNotNull(selectFirst2)
            val text: String = selectFirst2.text()
            val selectFirst3: Element = element.selectFirst("a")
            Intrinsics.checkNotNull(selectFirst3)
            val attr: String = selectFirst3.attr("data-id")
            Intrinsics.checkNotNullExpressionValue(url2, "url")
            arrayList.add(Episode(url2, text, 0, null, null, null, attr, null, 128, null))
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
        } else StringsKt.`replace$default`(`replace$default`, ")", "", false, 4, null as Object?)
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

    companion object {
        val Companion = Companion(null)
        const val HOST_STREAM = "dash.megacdn.xyz"
    }
}