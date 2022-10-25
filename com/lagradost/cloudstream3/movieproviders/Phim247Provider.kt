package com.lagradost.cloudstream3.movieproviders

import android.util.Base64
import org.jsoup.nodes.Element
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: Phim247Provider.kt */
@Metadata(
    m108d1 = ["\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 T2\u00020\u0001:\u0005RSTUVB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010!\u001a\u0004\u0018\u00010\u00042\u0006\u0010\"\u001a\u00020\u0004H\u0002J\u0016\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020\u0004J\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020'0$2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0002J\u0010\u0010/\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0002J\u0013\u00100\u001a\u0004\u0018\u000101H\u0096@ø\u0001\u0000¢\u0006\u0002\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u00042\u0006\u00104\u001a\u00020*H\u0002J \u00105\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u0004H\u0002J/\u00109\u001a\u0004\u0018\u00010\u00042\u0006\u0010:\u001a\u00020\u00042\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040<H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010=J\u001b\u0010>\u001a\u0004\u0018\u00010?2\u0006\u0010(\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010@JI\u0010A\u001a\u00020\b2\u0006\u0010B\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\b2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020G0E2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020G0EH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010JJ\u0019\u0010K\u001a\u00020L2\u0006\u0010(\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010@J!\u0010M\u001a\n\u0012\u0004\u0012\u00020N\u0018\u00010$2\u0006\u0010O\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010@J\u0012\u0010P\u001a\u00020\u0004*\u00020\u00042\u0006\u0010Q\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000c\u0010\nR\u0014\u0010\r\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006W"],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/Phim247Provider;", "Lcom/lagradost/cloudstream3/MainAPI;", "()V", "defaultPageUrl", "", "getDefaultPageUrl", "()Ljava/lang/String;", "hasChromecastSupport", "", "getHasChromecastSupport", "()Z", "hasDownloadSupport", "getHasDownloadSupport", "hasMainPage", "getHasMainPage", "hasQuickSearch", "getHasQuickSearch", "mainUrl", "getMainUrl", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "vpnStatus", "Lcom/lagradost/cloudstream3/VPNStatus;", "getVpnStatus", "()Lcom/lagradost/cloudstream3/VPNStatus;", "extractUrl", TvContractCompat.PARAM_INPUT, "extractUrls", "", "text", "getDataEpisode", "Lcom/lagradost/cloudstream3/Episode;", "url", "doc", "Lorg/jsoup/nodes/Document;", "getItemMovie", "Lcom/lagradost/cloudstream3/MovieSearchResponse;", "it", "Lorg/jsoup/nodes/Element;", "getItemMovieSearch", "getMainPage", "Lcom/lagradost/cloudstream3/HomePageResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPagingResult", "document", "getParamFromJS", "str", SDKConstants.PARAM_KEY, TtmlNode.END, "getRealHls", "urlPlaylist", "header", "", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadPage", "Lcom/lagradost/cloudstream3/PageResponse;", "search", "Lcom/lagradost/cloudstream3/SearchResponse;", "query", "decrypt", "password", "BongNgoResponse", "BongNgoSourceResponse", "Companion", "DataEp", "Quality", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class Phim247Provider : MainAPI() {
    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var mainUrl = "https://247phim.net/"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var name = "247Phim"
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
        get() = "$mainUrl/phim/phim-chieu-rap?xem-them=1"

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

    /* compiled from: Phim247Provider.kt */
    @Metadata(
        m108d1 = ["\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/Phim247Provider\$Companion;", "", "()V", "HOST_GET_SUB", "", "HOST_STREAM", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */ /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */ /* JADX WARN: Removed duplicated region for block: B:23:0x00b0  */ /* JADX WARN: Removed duplicated region for block: B:38:0x0179 A[LOOP:2: B:36:0x016d->B:38:0x0179, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:42:0x01e2 A[LOOP:3: B:40:0x01dc->B:42:0x01e2, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:45:0x023d A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:46:0x023e  */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun getMainPage(r30: Continuation<in HomePageResponse?>?): Any? {
        /*
            Method dump skipped, instructions count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.Phim247Provider.getMainPage(kotlin.coroutines.Continuation):java.lang.Object")
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
            boolean r2 = r1 instanceof com.lagradost.cloudstream3.movieproviders.Phim247Provider$loadPage$1
            if (r2 == 0) goto L18
            r2 = r1
            com.lagradost.cloudstream3.movieproviders.Phim247Provider$loadPage$1 r2 = (com.lagradost.cloudstream3.movieproviders.Phim247Provider$loadPage$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r1 = r2.label
            int r1 = r1 - r4
            r2.label = r1
            goto L1d
        L18:
            com.lagradost.cloudstream3.movieproviders.Phim247Provider$loadPage$1 r2 = new com.lagradost.cloudstream3.movieproviders.Phim247Provider$loadPage$1
            r2.<init>(r0, r1)
        L1d:
            java.lang.Object r1 = r2.result
            java.lang.Object r15 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r2.label
            r4 = 1
            if (r3 == 0) goto L3a
            if (r3 != r4) goto L32
            java.lang.Object r2 = r2.L$0
            com.lagradost.cloudstream3.movieproviders.Phim247Provider r2 = (com.lagradost.cloudstream3.movieproviders.Phim247Provider) r2
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
            java.lang.String r3 = ".panel-vod .item"
            org.jsoup.select.Elements r3 = r1.select(r3)
            java.lang.String r4 = "document.select(\".panel-vod .item\")"
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
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.Phim247Provider.loadPage(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
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
                    val element: Element = select.get(i)
                    if (element.attr("class") != null) {
                        val attr: String = element.attr("class")
                        Intrinsics.checkNotNullExpressionValue(attr, "li).attr(\"class\")")
                        if (StringsKt.`contains$default`(
                                attr as CharSequence,
                                AppMeasurementSdk.ConditionalUserProperty.ACTIVE as CharSequence,
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */ /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */ /* JADX WARN: Removed duplicated region for block: B:25:0x00c3 A[LOOP:1: B:23:0x00bd->B:25:0x00c3, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:35:0x0162 A[LOOP:0: B:33:0x015c->B:35:0x0162, LOOP_END] */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun search(
        r24: String?,
        r25: Continuation<in MutableList<out SearchResponse?>?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.Phim247Provider.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
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
            null,
            448,
            null
        )
    }

    private fun getItemMovieSearch(element: Element): MovieSearchResponse {
        val first: Element = element.select(TtmlNode.TAG_P).first()
        Intrinsics.checkNotNull(first)
        val title: String = first.text()
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

    private fun getParamFromJS(str: String, str2: String, str3: String): String {
        val substring: String = str.substring(
            StringsKt.`indexOf$default`(
                str as CharSequence,
                str2,
                0,
                false,
                6,
                null as Object?
            ) + str2.length()
        )
        Intrinsics.checkNotNullExpressionValue(
            substring,
            "this as java.lang.String).substring(startIndex)"
        )
        val substring2: String = substring.substring(
            0,
            StringsKt.`indexOf$default`(
                substring as CharSequence,
                str3,
                0,
                false,
                6,
                null as Object?
            )
        )
        Intrinsics.checkNotNullExpressionValue(
            substring2,
            "this as java.lang.String…ing(startIndex, endIndex)"
        )
        return substring2
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */ /* JADX WARN: Removed duplicated region for block: B:18:0x00ae  */ /* JADX WARN: Removed duplicated region for block: B:26:0x0178 A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:27:0x0179  */ /* JADX WARN: Removed duplicated region for block: B:37:0x0198  */ /* JADX WARN: Removed duplicated region for block: B:40:0x01ce  */ /* JADX WARN: Removed duplicated region for block: B:56:0x0249  */ /* JADX WARN: Removed duplicated region for block: B:57:0x024c  */ /* JADX WARN: Removed duplicated region for block: B:60:0x0284  */
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
            Method dump skipped, instructions count: 687
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.Phim247Provider.loadLinks(java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */ /* JADX WARN: Removed duplicated region for block: B:20:0x00a5  */ /* JADX WARN: Removed duplicated region for block: B:39:0x0172 A[LOOP:1: B:37:0x016c->B:39:0x0172, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:47:0x019d  */ /* JADX WARN: Removed duplicated region for block: B:48:0x01d7  */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun load(r43: String?, r44: Continuation<in LoadResponse?>?): Any {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.Phim247Provider.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    fun getDataEpisode(url: String?, doc: Document): List<Episode> {
        Intrinsics.checkNotNullParameter(url, "url")
        Intrinsics.checkNotNullParameter(doc, "doc")
        val select: Elements = doc.select(".list-episodes")
        val arrayList = ArrayList()
        val size: Int = select.size()
        for (i in 0 until size) {
            val select2: Elements = select.get(i).select("li")
            val size2: Int = select2.size()
            for (i2 in 0 until size2) {
                val element: Element = select2.get(i2)
                element.attr("data-url_web")
                val text: String = element.text()
                element.attr("data-id")
                element.attr("data-video_id")
                val attr: String = element.attr("data-url_cdn")
                val urlVietSub: String = element.attr("data-url_sub")
                val urlEngSub: String = element.attr("data-url_sub_en")
                val decode: ByteArray = Base64.decode(attr, 0)
                Intrinsics.checkNotNullExpressionValue(decode, "decode(dataKey, Base64.DEFAULT)")
                val str = String(decode, Charsets.UTF_8)
                Intrinsics.checkNotNullExpressionValue(urlEngSub, "urlEngSub")
                Intrinsics.checkNotNullExpressionValue(urlVietSub, "urlVietSub")
                val json: String = Gson().toJson(DataEp(urlEngSub, urlVietSub, str))
                Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(dataEp)")
                arrayList.add(
                    Episode(
                        json,
                        text,
                        Integer.valueOf(i),
                        null,
                        null,
                        null,
                        "Danh sách tập",
                        null,
                        176,
                        null
                    )
                )
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

    /* compiled from: Phim247Provider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000c\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/Phim247Provider\$Quality;", "", "name", "", "urlStream", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getUrlStream", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Quality(name: String, urlStream: String) {
        val name: String
        val urlStream: String
        operator fun component1(): String {
            return name
        }

        operator fun component2(): String {
            return urlStream
        }

        fun copy(name: String, urlStream: String): Quality {
            Intrinsics.checkNotNullParameter(name, "name")
            Intrinsics.checkNotNullParameter(urlStream, "urlStream")
            return Quality(name, urlStream)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Quality) {
                val quality = obj as Quality
                return Intrinsics.areEqual(name, quality.name) && Intrinsics.areEqual(
                    urlStream, quality.urlStream
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return name.hashCode() * 31 + urlStream.hashCode()
        }

        override fun toString(): String {
            return "Quality(name=" + name + ", urlStream=" + urlStream + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(name, "name")
            Intrinsics.checkNotNullParameter(urlStream, "urlStream")
            this.name = name
            this.urlStream = urlStream
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                quality: Quality,
                str: String,
                str2: String,
                i: Int,
                obj: Object?
            ): Quality {
                var str = str
                var str2 = str2
                if (i and 1 != 0) {
                    str = quality.name
                }
                if (i and 2 != 0) {
                    str2 = quality.urlStream
                }
                return quality.copy(str, str2)
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */ /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun getRealHls(r21: String?, r22: Map<String?, String?>?, r23: Continuation<in String?>?): Any {
        /*
            r20 = this;
            r0 = r23
            boolean r1 = r0 instanceof com.lagradost.cloudstream3.movieproviders.Phim247Provider$getRealHls$1
            if (r1 == 0) goto L18
            r1 = r0
            com.lagradost.cloudstream3.movieproviders.Phim247Provider$getRealHls$1 r1 = (com.lagradost.cloudstream3.movieproviders.Phim247Provider$getRealHls$1) r1
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
            com.lagradost.cloudstream3.movieproviders.Phim247Provider$getRealHls$1 r1 = new com.lagradost.cloudstream3.movieproviders.Phim247Provider$getRealHls$1
            r2 = r20
            r1.<init>(r2, r0)
        L1f:
            java.lang.Object r0 = r1.result
            java.lang.Object r15 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.label
            r14 = 1
            if (r3 == 0) goto L3e
            if (r3 != r14) goto L36
            java.lang.Object r1 = r1.L$0
            java.lang.String r1 = (java.lang.String) r1
            kotlin.ResultKt.throwOnFailure(r0)
            r19 = 1
            goto L73
        L36:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3e:
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
            r0 = 0
            r16 = 0
            r17 = 2044(0x7fc, float:2.864E-42)
            r18 = 0
            r5 = r21
            r1.L$0 = r5
            r1.label = r14
            r4 = r21
            r5 = r22
            r19 = 1
            r14 = r0
            r0 = r15
            r15 = r16
            r16 = r1
            java.lang.Object r1 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18)
            if (r1 != r0) goto L70
            return r0
        L70:
            r0 = r1
            r1 = r21
        L73:
            com.lagradost.nicehttp.NiceResponse r0 = (com.lagradost.nicehttp.NiceResponse) r0
            java.lang.String r0 = r0.getText()
            kotlin.text.Regex r3 = new kotlin.text.Regex
            java.lang.String r4 = ".*\\.m3u8"
            r3.<init>(r4)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r4 = 2
            r5 = 0
            r6 = 0
            kotlin.text.MatchResult r0 = kotlin.text.Regex.find$default(r3, r0, r5, r4, r6)
            if (r0 == 0) goto L8f
            java.lang.String r6 = r0.getValue()
        L8f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r7 = r1
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r9 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            java.lang.String r8 = "/"
            int r3 = kotlin.text.StringsKt.lastIndexOf$default(r7, r8, r9, r10, r11, r12)
            int r3 = r3 + 1
            java.lang.String r1 = r1.substring(r5, r3)
            java.lang.String r3 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.Phim247Provider.getRealHls(java.lang.String, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* compiled from: Phim247Provider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\t¨\u0006\u0018"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/Phim247Provider\$BongNgoSourceResponse;", "", SDKConstants.PARAM_KEY, "", "link", "typeplay", "namesv", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getLink", "getNamesv", "getTypeplay", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
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

    /* compiled from: Phim247Provider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000c\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/Phim247Provider\$DataEp;", "", "engsub", "", "vietsub", "urlStream", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEngsub", "()Ljava/lang/String;", "getUrlStream", "getVietsub", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class DataEp(
        @JsonProperty("engsub") engsub: String,
        @JsonProperty("vietsub") vietsub: String,
        @JsonProperty("urlStream") urlStream: String
    ) {
        val engsub: String
        val urlStream: String
        val vietsub: String
        operator fun component1(): String {
            return engsub
        }

        operator fun component2(): String {
            return vietsub
        }

        operator fun component3(): String {
            return urlStream
        }

        fun copy(
            @JsonProperty("engsub") engsub: String,
            @JsonProperty("vietsub") vietsub: String,
            @JsonProperty("urlStream") urlStream: String
        ): DataEp {
            Intrinsics.checkNotNullParameter(engsub, "engsub")
            Intrinsics.checkNotNullParameter(vietsub, "vietsub")
            Intrinsics.checkNotNullParameter(urlStream, "urlStream")
            return DataEp(engsub, vietsub, urlStream)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is DataEp) {
                val dataEp = obj as DataEp
                return Intrinsics.areEqual(engsub, dataEp.engsub) && Intrinsics.areEqual(
                    vietsub, dataEp.vietsub
                ) && Intrinsics.areEqual(urlStream, dataEp.urlStream)
            }
            return false
        }

        override fun hashCode(): Int {
            return (engsub.hashCode() * 31 + vietsub.hashCode()) * 31 + urlStream.hashCode()
        }

        override fun toString(): String {
            return "DataEp(engsub=" + engsub + ", vietsub=" + vietsub + ", urlStream=" + urlStream + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(engsub, "engsub")
            Intrinsics.checkNotNullParameter(vietsub, "vietsub")
            Intrinsics.checkNotNullParameter(urlStream, "urlStream")
            this.engsub = engsub
            this.vietsub = vietsub
            this.urlStream = urlStream
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                dataEp: DataEp,
                str: String,
                str2: String,
                str3: String,
                i: Int,
                obj: Object?
            ): DataEp {
                var str = str
                var str2 = str2
                var str3 = str3
                if (i and 1 != 0) {
                    str = dataEp.engsub
                }
                if (i and 2 != 0) {
                    str2 = dataEp.vietsub
                }
                if (i and 4 != 0) {
                    str3 = dataEp.urlStream
                }
                return dataEp.copy(str, str2, str3)
            }
        }
    }

    /* compiled from: Phim247Provider.kt */
    @Metadata(
        m108d1 = ["\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\u000c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/Phim247Provider\$BongNgoResponse;", "", "source", "", "Lcom/lagradost/cloudstream3/movieproviders/Phim247Provider\$BongNgoSourceResponse;", "(Ljava/util/List;)V", "getSource", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class BongNgoResponse(@JsonProperty("source") source: List<BongNgoSourceResponse>) {
        val source: List<BongNgoSourceResponse>
        operator fun component1(): List<BongNgoSourceResponse> {
            return source
        }

        fun copy(@JsonProperty("source") source: List<BongNgoSourceResponse>): BongNgoResponse {
            Intrinsics.checkNotNullParameter(source, "source")
            return BongNgoResponse(source)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is BongNgoResponse && Intrinsics.areEqual(
                source,
                (obj as BongNgoResponse).source
            )
        }

        override fun hashCode(): Int {
            return source.hashCode()
        }

        override fun toString(): String {
            return "BongNgoResponse(source=" + source + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(source, "source")
            this.source = source
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                bongNgoResponse: BongNgoResponse,
                list: List,
                i: Int,
                obj: Object?
            ): BongNgoResponse {
                var list: List = list
                if (i and 1 != 0) {
                    list = bongNgoResponse.source
                }
                return bongNgoResponse.copy(list)
            }
        }
    }

    companion object {
        val Companion = Companion(null)
        const val HOST_GET_SUB = "subtitles.0apis.xyz"
        const val HOST_STREAM = "https://api.solist.bar/ajax/episodes"
    }
}