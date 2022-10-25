package com.lagradost.cloudstream3.utils

import java.util.Locale
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: ExtractorApi.kt */
@Metadata(
    m108d1 = ["\u0000H\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\u001a\u000e\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000c\u001a\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000c\u001a\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\r\u001a\u00020\u000c\u001a#\u0010\u0011\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0012\u001a\u00020\u000c2\u0006\u0010\u0013\u001a\u00020\u000cH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001a\u0010\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u000c\u001a\u000e\u0010\u0018\u001a\u00020\u000c2\u0006\u0010\u0019\u001a\u00020\u000c\u001aA\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u000c2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001f0\u001dH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\"\u001aM\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u000c2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000c2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001f0\u001dH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010$\u001a\u000e\u0010%\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u000c\u001a\u0019\u0010&\u001a\u00020\u000c2\u0006\u0010\u0019\u001a\u00020\u000cH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010'\u001a\n\u0010(\u001a\u00020)*\u00020)\"\u0019\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"],
    m107d2 = ["extractorApis", "", "Lcom/lagradost/cloudstream3/utils/ExtractorApi;", "getExtractorApis", "()[Lcom/lagradost/cloudstream3/utils/ExtractorApi;", "[Lcom/lagradost/cloudstream3/utils/ExtractorApi;", "packedRegex", "Lkotlin/text/Regex;", "schemaStripRegex", "getSchemaStripRegex", "()Lkotlin/text/Regex;", "getAndUnpack", "", TypedValues.Custom.S_STRING, "getExtractorApiFromName", "name", "getPacked", "getPostForm", "requestUrl", "html", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQualityFromName", "", "qualityName", "httpsify", "url", "loadExtractor", "", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "referer", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requireReferer", "unshortenLinkSafe", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toUs", "", "app_release"],
    m106k = 2,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
object ExtractorApiKt {
    val schemaStripRegex: Regex = Regex("^(https:|)//(www\\.|)")
    private val packedRegex: Regex = Regex("eval\\(function\\(p,a,c,k,e,.*\\)\\)")
    @kotlin.jvm.JvmStatic
    val extractorApis = arrayOf<ExtractorApi>(
        WcoStream(),
        Vidstreamz(),
        Vizcloud(),
        Vizcloud2(),
        VizcloudOnline(),
        VizcloudXyz(),
        VizcloudLive(),
        VizcloudInfo(),
        MwvnVizcloudInfo(),
        VizcloudDigital(),
        VizcloudCloud(),
        VideoVard(),
        VideovardSX(),
        Mp4Upload(),
        StreamTape(),
        MixDropBz(),
        MixDropCh(),
        MixDropTo(),
        MixDrop(),
        Mcloud(),
        XStreamCdn(),
        StreamSB(),
        StreamSB1(),
        StreamSB2(),
        StreamSB3(),
        StreamSB4(),
        StreamSB5(),
        StreamSB6(),
        StreamSB7(),
        StreamSB8(),
        StreamSB9(),
        StreamSB10(),
        SBfull(),
        Streamhub2(),
        FEmbed(),
        FeHD(),
        Fplayer(),
        DBfilm(),
        Luxubu(),
        LayarKaca(),
        Uqload(),
        Uqload1(),
        Evolaod(),
        Evoload1(),
        VoeExtractor(),
        Tomatomatela(),
        Cinestart(),
        OkRu(),
        OkRuHttps(),
        DoodExtractor(),
        DoodPmExtractor(),
        DoodToExtractor(),
        DoodSoExtractor(),
        DoodLaExtractor(),
        DoodWsExtractor(),
        DoodShExtractor(),
        DoodWatchExtractor(),
        AsianLoad(),
        Jawcloud(),
        Zplayer(),
        ZplayerV2(),
        Upstream(),
        Maxstream(),
        Tantifilm(),
        Userload(),
        Supervideo(),
        GuardareStream(),
        PlayerVoxzer(),
        BullStream(),
        GMPlayer(),
        Blogger(),
        Solidfiles(),
        YourUpload(),
        Hxfile(),
        KotakAnimeid(),
        Neonime8n(),
        Neonime7n(),
        Yufiles(),
        Aico(),
        JWPlayer(),
        Meownime(),
        DesuArcg(),
        DesuOdchan(),
        DesuOdvip(),
        DesuDrive(),
        Filesim(),
        Linkbox(),
        Acefile(),
        SpeedoStream(),
        Streamlare(),
        VidSrcExtractor(),
        VidSrcExtractor2()
    )

    fun toUs(j: Long): Long {
        return j * 1000000
    }

    @kotlin.jvm.JvmStatic
    fun getQualityFromName(str: String?): Int {
        if (str == null) {
            return Qualities.Unknown.value
        }
        val lowerCase: String = str.toLowerCase(Locale.ROOT)
        Intrinsics.checkNotNullExpressionValue(
            lowerCase,
            "this as java.lang.String).toLowerCase(Locale.ROOT)"
        )
        val obj: String = StringsKt.trim(
            StringsKt.`replace$default`(
                lowerCase,
                TtmlNode.TAG_P,
                "",
                false,
                4,
                null as Object?
            ) as CharSequence?
        ).toString()
        val qualities = if (Intrinsics.areEqual(obj, "4k")) Qualities.P2160 else null
        if (qualities != null) {
            return qualities.value
        }
        val intOrNull: Integer? = StringsKt.toIntOrNull(obj)
        return if (intOrNull != null) {
            intOrNull.intValue()
        } else Qualities.Unknown.value
    }

    fun getPacked(string: String?): String? {
        Intrinsics.checkNotNullParameter(string, "string")
        val `find$default` = Regex.`find$default`(packedRegex, string, 0, 2, null)
        return `find$default`?.value
    }

    fun getAndUnpack(string: String?): String? {
        Intrinsics.checkNotNullParameter(string, "string")
        val unpack: String? = JsUnpacker(getPacked(string)).unpack()
        return unpack ?: string
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */ /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun unshortenLinkSafe(r7: String?, r8: Continuation<in String?>?): Any {
        /*
            boolean r0 = r8 instanceof com.lagradost.cloudstream3.utils.ExtractorApiKt$unshortenLinkSafe$1
            if (r0 == 0) goto L14
            r0 = r8
            com.lagradost.cloudstream3.utils.ExtractorApiKt$unshortenLinkSafe$1 r0 = (com.lagradost.cloudstream3.utils.ExtractorApiKt$unshortenLinkSafe$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            com.lagradost.cloudstream3.utils.ExtractorApiKt$unshortenLinkSafe$1 r0 = new com.lagradost.cloudstream3.utils.ExtractorApiKt$unshortenLinkSafe$1
            r0.<init>(r8)
        L19:
            r4 = r0
            java.lang.Object r8 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r7 = r4.L$0
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Exception -> L57
            goto L53
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.ResultKt.throwOnFailure(r8)
            com.lagradost.cloudstream3.utils.ShortLink r8 = com.lagradost.cloudstream3.utils.UnshortenUrl.INSTANCE     // Catch: java.lang.Exception -> L57
            boolean r8 = r8.isShortLink(r7)     // Catch: java.lang.Exception -> L57
            if (r8 == 0) goto L5d
            com.lagradost.cloudstream3.utils.ShortLink r1 = com.lagradost.cloudstream3.utils.UnshortenUrl.INSTANCE     // Catch: java.lang.Exception -> L57
            r3 = 0
            r5 = 2
            r6 = 0
            r4.L$0 = r7     // Catch: java.lang.Exception -> L57
            r4.label = r2     // Catch: java.lang.Exception -> L57
            r2 = r7
            java.lang.Object r8 = com.lagradost.cloudstream3.utils.UnshortenUrl.unshorten$default(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L57
            if (r8 != r0) goto L53
            return r0
        L53:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L57
            r7 = r8
            goto L5d
        L57:
            r8 = move-exception
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            com.lagradost.cloudstream3.mvvm.ArchComponentExt.logError(r8)
        L5d:
            return r7
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.utils.ExtractorApiKt.unshortenLinkSafe(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    fun loadExtractor(
        str: String?,
        function1: Function1<SubtitleFile?, Unit>?,
        function12: Function1<ExtractorLink?, Unit>?,
        continuation: Continuation<in Boolean?>?
    ): Object {
        return loadExtractor(str, null, function1, function12, continuation)
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */ /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    @kotlin.jvm.JvmStatic
    fun loadExtractor(
        r17: String?,
        r18: String?,
        r19: Function1<SubtitleFile?, Unit>?,
        r20: Function1<ExtractorLink?, Unit>?,
        r21: Continuation<in Boolean?>?
    ): Any {
        /*
            r0 = r21
            boolean r1 = r0 instanceof com.lagradost.cloudstream3.utils.ExtractorApiKt$loadExtractor$2
            if (r1 == 0) goto L16
            r1 = r0
            com.lagradost.cloudstream3.utils.ExtractorApiKt$loadExtractor$2 r1 = (com.lagradost.cloudstream3.utils.ExtractorApiKt$loadExtractor$2) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L16
            int r0 = r1.label
            int r0 = r0 - r3
            r1.label = r0
            goto L1b
        L16:
            com.lagradost.cloudstream3.utils.ExtractorApiKt$loadExtractor$2 r1 = new com.lagradost.cloudstream3.utils.ExtractorApiKt$loadExtractor$2
            r1.<init>(r0)
        L1b:
            r7 = r1
            java.lang.Object r0 = r7.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r7.label
            r3 = 2
            r8 = 1
            if (r2 == 0) goto L4f
            if (r2 == r8) goto L39
            if (r2 != r3) goto L31
            kotlin.ResultKt.throwOnFailure(r0)
            goto Lb2
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            java.lang.Object r2 = r7.L$2
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            java.lang.Object r4 = r7.L$1
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            java.lang.Object r5 = r7.L$0
            java.lang.String r5 = (java.lang.String) r5
            kotlin.ResultKt.throwOnFailure(r0)
            r6 = r2
            r16 = r5
            r5 = r4
            r4 = r16
            goto L6d
        L4f:
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r18
            r7.L$0 = r0
            r2 = r19
            r7.L$1 = r2
            r4 = r20
            r7.L$2 = r4
            r7.label = r8
            r5 = r17
            java.lang.Object r5 = unshortenLinkSafe(r5, r7)
            if (r5 != r1) goto L69
            return r1
        L69:
            r6 = r4
            r4 = r0
            r0 = r5
            r5 = r2
        L6d:
            java.lang.String r0 = (java.lang.String) r0
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r2 = r0.toLowerCase(r2)
            java.lang.String r9 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r9)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            kotlin.text.Regex r9 = com.lagradost.cloudstream3.utils.ExtractorApiKt.schemaStripRegex
            java.lang.String r10 = ""
            java.lang.String r2 = r9.replace(r2, r10)
            com.lagradost.cloudstream3.utils.ExtractorApi[] r9 = com.lagradost.cloudstream3.utils.ExtractorApiKt.extractorApis
            int r11 = r9.length
            r12 = 0
            r13 = 0
        L89:
            if (r13 >= r11) goto Lbb
            r14 = r9[r13]
            java.lang.String r15 = r14.getMainUrl()
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15
            kotlin.text.Regex r8 = com.lagradost.cloudstream3.utils.ExtractorApiKt.schemaStripRegex
            java.lang.String r8 = r8.replace(r15, r10)
            r15 = 0
            boolean r8 = kotlin.text.StringsKt.startsWith$default(r2, r8, r12, r3, r15)
            if (r8 == 0) goto Lb7
            r7.L$0 = r15
            r7.L$1 = r15
            r7.L$2 = r15
            r7.label = r3
            r2 = r14
            r3 = r0
            java.lang.Object r0 = r2.getSafeUrl(r3, r4, r5, r6, r7)
            if (r0 != r1) goto Lb1
            return r1
        Lb1:
            r8 = 1
        Lb2:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.boxing.boxBoolean(r8)
            return r0
        Lb7:
            r8 = 1
            int r13 = r13 + 1
            goto L89
        Lbb:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.boxing.boxBoolean(r12)
            return r0
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.utils.ExtractorApiKt.loadExtractor(java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
    }

    fun  /* synthetic */`loadExtractor$default`(
        str: String?,
        str2: String?,
        function1: Function1<*, *>?,
        function12: Function1<*, *>?,
        continuation: Continuation<*>?,
        i: Int,
        obj: Object?
    ): Object {
        var str2 = str2
        if (i and 2 != 0) {
            str2 = null
        }
        return loadExtractor(str, str2, function1!!, function12, continuation)
    }

    fun getExtractorApiFromName(name: String?): ExtractorApi {
        var extractorApiArr: Array<ExtractorApi?>
        Intrinsics.checkNotNullParameter(name, "name")
        for (extractorApi in extractorApis) {
            if (Intrinsics.areEqual(extractorApi.name, name)) {
                return extractorApi
            }
        }
        return extractorApis[0]
    }

    fun requireReferer(name: String?): Boolean {
        Intrinsics.checkNotNullParameter(name, "name")
        return getExtractorApiFromName(name).requiresReferer
    }

    @kotlin.jvm.JvmStatic
    fun httpsify(url: String): String {
        Intrinsics.checkNotNullParameter(url, "url")
        return if (StringsKt.`startsWith$default`(url, "//", false, 2, null as Object?)) {
            "https:$url"
        } else url
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */ /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */ /* JADX WARN: Removed duplicated region for block: B:65:0x018b A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:66:0x018c  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun getPostForm(r22: String?, r23: String?, r24: Continuation<in String?>?): Any {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.utils.ExtractorApiKt.getPostForm(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }
}