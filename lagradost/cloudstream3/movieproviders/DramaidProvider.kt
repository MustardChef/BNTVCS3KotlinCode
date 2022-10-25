package com.lagradost.cloudstream3.movieproviders

import com.google.firebase.messaging.Constants
import org.jsoup.nodes.Element
import java.util.List
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: DramaidProvider.kt */
@Metadata(
    m108d1 = ["\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 ;2\u00020\u0001:\u0003;<=B\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010\u001e\u001a\u00020\u001fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000eH\u0002JI\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020$0'2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020$0'H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010+J\u0019\u0010,\u001a\u00020-2\u0006\u0010%\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010.JI\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\u00042\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020$0'2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020$0'H\u0096@ø\u0001\u0000¢\u0006\u0002\u00104J\u001f\u00105\u001a\b\u0012\u0004\u0012\u000207062\u0006\u00108\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010.J\u000c\u00109\u001a\u000207*\u00020:H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\u0006R\u001a\u0010\r\u001a\u00020\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006>"],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/DramaidProvider;", "Lcom/lagradost/cloudstream3/MainAPI;", "()V", "hasChromecastSupport", "", "getHasChromecastSupport", "()Z", "hasDownloadSupport", "getHasDownloadSupport", "hasMainPage", "getHasMainPage", "hasQuickSearch", "getHasQuickSearch", "lang", "", "getLang", "()Ljava/lang/String;", "setLang", "(Ljava/lang/String;)V", "mainUrl", "getMainUrl", "setMainUrl", "name", "getName", "setName", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "getMainPage", "Lcom/lagradost/cloudstream3/HomePageResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProperDramaLink", ShareConstants.MEDIA_URI, "invokeDriveSource", "", "url", "subCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "sourceCallback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLinks", "data", "isCasting", "subtitleCallback", "callback", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "", "Lcom/lagradost/cloudstream3/SearchResponse;", "query", "toSearchResult", "Lorg/jsoup/nodes/Element;", "Companion", "Sources", "Tracks", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class DramaidProvider : MainAPI() {
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasChromecastSupport = false

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasQuickSearch = false

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var mainUrl = "https://185.224.83.103"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var name = "DramaId"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasMainPage = true
    private var lang = "id"

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasDownloadSupport = true

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val supportedTypes: Set<TvType> = SetsKt.setOf<TvType>(TvType.AsianDrama)

    @Override // com.lagradost.cloudstream3.MainAPI
    override fun getLang(): String? {
        return lang
    }

    @Override // com.lagradost.cloudstream3.MainAPI
    override fun setLang(str: String) {
        Intrinsics.checkNotNullParameter(str, "<set-?>")
        lang = str
    }

    /* compiled from: DramaidProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/DramaidProvider\$Companion;", "", "()V", "getStatus", "Lcom/lagradost/cloudstream3/ShowStatus;", "t", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        fun getStatus(t: String?): ShowStatus {
            Intrinsics.checkNotNullParameter(t, "t")
            return if (Intrinsics.areEqual(
                    t,
                    AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_COMPLETED
                )
            ) ShowStatus.Completed else if (Intrinsics.areEqual(
                    t,
                    "Ongoing"
                )
            ) ShowStatus.Ongoing else ShowStatus.Completed
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */ /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun getMainPage(r29: Continuation<in HomePageResponse?>?): Any? {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.DramaidProvider.getMainPage(kotlin.coroutines.Continuation):java.lang.Object")
    }

    private fun getProperDramaLink(str: String): String {
        var groupValues: List<String?>
        var str3: String? = null
        if (StringsKt.`contains$default`(
                str as CharSequence,
                "/series/" as CharSequence,
                false,
                2,
                null as Object?
            )
        ) {
            return str
        }
        val sb = StringBuilder()
        sb.append(mainUrl)
        sb.append("/series/")
        val `find$default` = Regex.`find$default`(Regex("$mainUrl/(.+)-ep.+"), str, 0, 2, null)
        if (`find$default` != null && `find$default`.groupValues.also {
                groupValues = it
            } != null) {
            str3 = groupValues[1]
        }
        sb.append(str3)
        return sb.toString()
    }

    private fun toSearchResult(element: Element): SearchResponse {
        val selectFirst: Element = element.selectFirst("a.tip")
        Intrinsics.checkNotNull(selectFirst)
        val attr: String = selectFirst.attr(ShareConstants.WEB_DIALOG_PARAM_HREF)
        Intrinsics.checkNotNullExpressionValue(attr, "this.selectFirst(\"a.tip\")!!.attr(\"href\")")
        val properDramaLink = getProperDramaLink(attr)
        val selectFirst2: Element = element.selectFirst("h2[itemprop=headline]")
        Intrinsics.checkNotNull(selectFirst2)
        val text: String = selectFirst2.text()
        Intrinsics.checkNotNullExpressionValue(
            text,
            "this.selectFirst(\"h2[itemprop=headline]\")!!.text()"
        )
        val obj: String = StringsKt.trim(text as CharSequence).toString()
        val selectFirst3: Element = element.selectFirst(".limit > noscript > img")
        Intrinsics.checkNotNull(selectFirst3)
        return MainAPIKt.`newTvSeriesSearchResponse$default`(
            this,
            obj,
            properDramaLink,
            TvType.AsianDrama,
            false,
            `DramaidProvider$toSearchResult$1`(selectFirst3.attr("src")),
            8,
            null
        )
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */ /* JADX WARN: Removed duplicated region for block: B:21:0x00aa A[LOOP:0: B:19:0x00a4->B:21:0x00aa, LOOP_END] */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun search(
        r20: String?,
        r21: Continuation<in MutableList<out SearchResponse?>?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.DramaidProvider.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */ /* JADX WARN: Removed duplicated region for block: B:21:0x00c4 A[LOOP:0: B:19:0x00be->B:21:0x00c4, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:31:0x0185 A[LOOP:1: B:29:0x017d->B:31:0x0185, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:35:0x0218 A[LOOP:2: B:33:0x0212->B:35:0x0218, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:38:0x0289  */ /* JADX WARN: Removed duplicated region for block: B:40:0x02ac  */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun load(r29: String?, r30: Continuation<in LoadResponse?>?): Any {
        /*
            Method dump skipped, instructions count: 707
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.DramaidProvider.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: DramaidProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\nJ8\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/DramaidProvider\$Sources;", "", "file", "", Constants.ScionAnalytics.PARAM_LABEL, "type", MonitorLogServerProtocol.DEFAULT_SAMPLE_RATES_KEY, "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getDefault", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFile", "()Ljava/lang/String;", "getLabel", "getType", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/lagradost/cloudstream3/movieproviders/DramaidProvider\$Sources;", "equals", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Sources(
        @JsonProperty("file") file: String,
        @JsonProperty("label") label: String,
        @JsonProperty("type") type: String,
        @JsonProperty("default") bool: Boolean
    ) {
        /* renamed from: default  reason: not valid java name */
        val default: Boolean
        val file: String
        val label: String
        val type: String
        operator fun component1(): String {
            return file
        }

        operator fun component2(): String {
            return label
        }

        operator fun component3(): String {
            return type
        }

        operator fun component4(): Boolean {
            return default
        }

        fun copy(
            @JsonProperty("file") file: String,
            @JsonProperty("label") label: String,
            @JsonProperty("type") type: String,
            @JsonProperty("default") bool: Boolean
        ): Sources {
            Intrinsics.checkNotNullParameter(file, "file")
            Intrinsics.checkNotNullParameter(label, "label")
            Intrinsics.checkNotNullParameter(type, "type")
            return Sources(file, label, type, bool)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Sources) {
                val sources = obj as Sources
                return Intrinsics.areEqual(file, sources.file) && Intrinsics.areEqual(
                    label, sources.label
                ) && Intrinsics.areEqual(type, sources.type) && Intrinsics.areEqual(
                    default, sources.default
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val hashCode = ((file.hashCode() * 31 + label.hashCode()) * 31 + type.hashCode()) * 31
            val bool = default
            return hashCode + (bool?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "Sources(file=" + file + ", label=" + label + ", type=" + type + ", default=" + default + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(file, "file")
            Intrinsics.checkNotNullParameter(label, "label")
            Intrinsics.checkNotNullParameter(type, "type")
            this.file = file
            this.label = label
            this.type = type
            default = bool
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                sources: Sources,
                str: String,
                str2: String,
                str3: String,
                bool: Boolean,
                i: Int,
                obj: Object?
            ): Sources {
                var str = str
                var str2 = str2
                var str3 = str3
                var bool = bool
                if (i and 1 != 0) {
                    str = sources.file
                }
                if (i and 2 != 0) {
                    str2 = sources.label
                }
                if (i and 4 != 0) {
                    str3 = sources.type
                }
                if (i and 8 != 0) {
                    bool = sources.default
                }
                return sources.copy(str, str2, str3, bool)
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: DramaidProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\nJ8\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/DramaidProvider\$Tracks;", "", "file", "", Constants.ScionAnalytics.PARAM_LABEL, "type", MonitorLogServerProtocol.DEFAULT_SAMPLE_RATES_KEY, "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getDefault", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFile", "()Ljava/lang/String;", "getLabel", "getType", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/lagradost/cloudstream3/movieproviders/DramaidProvider\$Tracks;", "equals", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Tracks(
        @JsonProperty("file") file: String,
        @JsonProperty("label") label: String,
        @JsonProperty("kind") type: String,
        @JsonProperty("default") bool: Boolean
    ) {
        /* renamed from: default  reason: not valid java name */
        val default: Boolean
        val file: String
        val label: String
        val type: String
        operator fun component1(): String {
            return file
        }

        operator fun component2(): String {
            return label
        }

        operator fun component3(): String {
            return type
        }

        operator fun component4(): Boolean {
            return default
        }

        fun copy(
            @JsonProperty("file") file: String,
            @JsonProperty("label") label: String,
            @JsonProperty("kind") type: String,
            @JsonProperty("default") bool: Boolean
        ): Tracks {
            Intrinsics.checkNotNullParameter(file, "file")
            Intrinsics.checkNotNullParameter(label, "label")
            Intrinsics.checkNotNullParameter(type, "type")
            return Tracks(file, label, type, bool)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Tracks) {
                val tracks = obj as Tracks
                return Intrinsics.areEqual(file, tracks.file) && Intrinsics.areEqual(
                    label, tracks.label
                ) && Intrinsics.areEqual(type, tracks.type) && Intrinsics.areEqual(
                    default, tracks.default
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val hashCode = ((file.hashCode() * 31 + label.hashCode()) * 31 + type.hashCode()) * 31
            val bool = default
            return hashCode + (bool?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "Tracks(file=" + file + ", label=" + label + ", type=" + type + ", default=" + default + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(file, "file")
            Intrinsics.checkNotNullParameter(label, "label")
            Intrinsics.checkNotNullParameter(type, "type")
            this.file = file
            this.label = label
            this.type = type
            default = bool
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                tracks: Tracks,
                str: String,
                str2: String,
                str3: String,
                bool: Boolean,
                i: Int,
                obj: Object?
            ): Tracks {
                var str = str
                var str2 = str2
                var str3 = str3
                var bool = bool
                if (i and 1 != 0) {
                    str = tracks.file
                }
                if (i and 2 != 0) {
                    str2 = tracks.label
                }
                if (i and 4 != 0) {
                    str3 = tracks.type
                }
                if (i and 8 != 0) {
                    bool = tracks.default
                }
                return tracks.copy(str, str2, str3, bool)
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */ /* JADX WARN: Removed duplicated region for block: B:30:0x0121  */ /* JADX WARN: Removed duplicated region for block: B:35:0x0196  */ /* JADX WARN: Removed duplicated region for block: B:43:0x01b7  */ /* JADX WARN: Removed duplicated region for block: B:52:0x01a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */ /* JADX WARN: Removed duplicated region for block: B:54:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun invokeDriveSource(
        r26: String?,
        r27: String?,
        r28: Function1<SubtitleFile, Unit>?,
        r29: Function1<ExtractorLink, Unit>?,
        r30: Continuation<in Unit>?
    ): Any {
        /*
            Method dump skipped, instructions count: 503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.DramaidProvider.invokeDriveSource(java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */ /* JADX WARN: Removed duplicated region for block: B:21:0x00b4  */ /* JADX WARN: Removed duplicated region for block: B:27:0x0106 A[LOOP:1: B:25:0x0100->B:27:0x0106, LOOP_END] */
    @Override // com.lagradost.cloudstream3.MainAPI
            /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */    fun loadLinks(
        r21: String?,
        r22: Boolean,
        r23: Function1<SubtitleFile?, Unit>?,
        r24: Function1<ExtractorLink?, Unit>?,
        r25: Continuation<in Boolean?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.DramaidProvider.loadLinks(java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
    }

    companion object {
        val Companion = Companion(null)
    }
}