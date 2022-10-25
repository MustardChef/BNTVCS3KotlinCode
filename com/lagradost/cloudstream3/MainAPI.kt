package com.lagradost.cloudstream3

import java.util.HashMap
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: MainAPI.kt */
@Metadata(
    m108d1 = ["\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 T2\u00020\u0001:\u0001TB\u0005¢\u0006\u0002\u0010\u0002J\u001b\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\nH\u0097@ø\u0001\u0000¢\u0006\u0002\u00107J\u0013\u00108\u001a\u0004\u0018\u000109H\u0097@ø\u0001\u0000¢\u0006\u0002\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010<2\u0006\u0010=\u001a\u00020>H\u0016J\u0006\u0010?\u001a\u000205J\u001b\u0010@\u001a\u0004\u0018\u00010A2\u0006\u0010B\u001a\u00020\nH\u0097@ø\u0001\u0000¢\u0006\u0002\u00107JI\u0010C\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\n2\u0006\u0010E\u001a\u00020\u00042\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u0002050G2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u0002050GH\u0097@ø\u0001\u0000¢\u0006\u0002\u0010JJ\u001b\u0010K\u001a\u0004\u0018\u00010L2\u0006\u0010B\u001a\u00020\nH\u0097@ø\u0001\u0000¢\u0006\u0002\u00107J\u000e\u0010M\u001a\u0002052\u0006\u0010D\u001a\u00020NJ!\u0010O\u001a\n\u0012\u0004\u0012\u00020Q\u0018\u00010P2\u0006\u0010R\u001a\u00020\nH\u0097@ø\u0001\u0000¢\u0006\u0002\u00107J!\u0010S\u001a\n\u0012\u0004\u0012\u00020Q\u0018\u00010P2\u0006\u0010R\u001a\u00020\nH\u0097@ø\u0001\u0000¢\u0006\u0002\u00107R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000cR\u0014\u0010\r\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0006R\u001a\u0010\u0018\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000c\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000c\"\u0004\b\u001e\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000c\"\u0004\b!\u0010\u001bR\u0014\u0010\"\u001a\u00020#X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u000c\"\u0004\b(\u0010\u001bR\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0006R\u0014\u00100\u001a\u000201X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006U"],
    m107d2 = ["Lcom/lagradost/cloudstream3/MainAPI;", "", "()V", "canBeOverridden", "", "getCanBeOverridden", "()Z", "setCanBeOverridden", "(Z)V", "defaultPageUrl", "", "getDefaultPageUrl", "()Ljava/lang/String;", "hasChromecastSupport", "getHasChromecastSupport", "hasDownloadSupport", "getHasDownloadSupport", "hasMainPage", "getHasMainPage", "hasQuickSearch", "getHasQuickSearch", "instantLinkLoading", "getInstantLinkLoading", "isPremiumContent", "lang", "getLang", "setLang", "(Ljava/lang/String;)V", "mainUrl", "getMainUrl", "setMainUrl", "name", "getName", "setName", "providerType", "Lcom/lagradost/cloudstream3/ProviderType;", "getProviderType", "()Lcom/lagradost/cloudstream3/ProviderType;", "storedCredentials", "getStoredCredentials", "setStoredCredentials", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "usesWebView", "getUsesWebView", "vpnStatus", "Lcom/lagradost/cloudstream3/VPNStatus;", "getVpnStatus", "()Lcom/lagradost/cloudstream3/VPNStatus;", "extractorVerifierJob", "", "extractorData", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMainPage", "Lcom/lagradost/cloudstream3/HomePageResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVideoInterceptor", "Lokhttp3/Interceptor;", "extractorLink", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "init", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "callback", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadPage", "Lcom/lagradost/cloudstream3/PageResponse;", "overrideWithNewData", "Lcom/lagradost/cloudstream3/ProvidersInfoJson;", "quickSearch", "", "Lcom/lagradost/cloudstream3/SearchResponse;", "query", "search", "Companion", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes3.dex */
abstract class MainAPI {
    open val hasMainPage = false
    open val hasQuickSearch = false
    open val instantLinkLoading = false
    open val isPremiumContent = false
    var storedCredentials: String? = null
    open val usesWebView = false
    open var name: String? = "NONE"
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }
    open var mainUrl: String? = "NONE"
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }
    var canBeOverridden = true
    open val defaultPageUrl = "NONE"
    private var lang = "en"
    open val hasChromecastSupport = true
    open val hasDownloadSupport = true
    open val supportedTypes: Set<TvType> = SetsKt.setOf<Object>(
        *arrayOf<TvType?>(
            TvType.Movie,
            TvType.TvSeries,
            TvType.Cartoon,
            TvType.Anime,
            TvType.OVA
        ) as Array<Object?>
    )
    open val vpnStatus = VPNStatus.None
    open val providerType = ProviderType.DirectProvider
    open fun extractorVerifierJob(str: String?, continuation: Continuation<in Unit>?): Object? {
        return MainAPI.Companion.`extractorVerifierJob$suspendImpl`(this, str, continuation)
    }

    open fun getMainPage(continuation: Continuation<in HomePageResponse?>?): Object? {
        return MainAPI.Companion.`getMainPage$suspendImpl`(this, continuation)
    }

    open fun getVideoInterceptor(extractorLink: ExtractorLink?): Interceptor? {
        Intrinsics.checkNotNullParameter(extractorLink, "extractorLink")
        return null
    }

    open fun load(str: String?, continuation: Continuation<in LoadResponse?>?): Object? {
        return MainAPI.Companion.`load$suspendImpl`(this, str, continuation)
    }

    open fun loadLinks(
        str: String?,
        z: Boolean,
        function1: Function1<SubtitleFile?, Unit>?,
        function12: Function1<ExtractorLink?, Unit>?,
        continuation: Continuation<in Boolean?>?
    ): Object? {
        return MainAPI.Companion.`loadLinks$suspendImpl`(
            this,
            str,
            z,
            function1,
            function12,
            continuation
        )
    }

    open fun loadPage(str: String?, continuation: Continuation<in PageResponse?>?): Object? {
        return MainAPI.Companion.`loadPage$suspendImpl`(this, str, continuation)
    }

    open fun quickSearch(
        str: String?,
        continuation: Continuation<in List<SearchResponse?>?>?
    ): Object? {
        return MainAPI.Companion.`quickSearch$suspendImpl`(this, str, continuation)
    }

    open fun search(str: String?, continuation: Continuation<in List<SearchResponse?>?>?): Object? {
        return MainAPI.Companion.`search$suspendImpl`(this, str, continuation)
    }

    /* compiled from: MainAPI.kt */
    @Metadata(
        m108d1 = ["\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R(\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"],
        m107d2 = ["Lcom/lagradost/cloudstream3/MainAPI\$Companion;", "", "()V", "overrideData", "Ljava/util/HashMap;", "", "Lcom/lagradost/cloudstream3/ProvidersInfoJson;", "getOverrideData", "()Ljava/util/HashMap;", "setOverrideData", "(Ljava/util/HashMap;)V", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        var overrideData: HashMap<String, ProvidersInfoJson>
            get() = MainAPI.Companion.overrideData
            set(hashMap) {
                MainAPI.Companion.overrideData = hashMap
            }
    }

    fun init() {
        var providersInfoJson: ProvidersInfoJson
        val hashMap: HashMap<String, ProvidersInfoJson> = MainAPI.Companion.overrideData
        if (hashMap == null || hashMap.get(getClass().getSimpleName())
                .also { providersInfoJson = it } == null
        ) {
            return
        }
        overrideWithNewData(providersInfoJson)
    }

    fun overrideWithNewData(data: ProvidersInfoJson) {
        Intrinsics.checkNotNullParameter(data, "data")
        if (canBeOverridden) {
            name = data.name
            if (!StringsKt.isBlank(data.url) && !Intrinsics.areEqual(data.url, "NONE")) {
                mainUrl = data.url
            }
            storedCredentials = data.credentials
        }
    }

    open fun getLang(): String? {
        return lang
    }

    open fun setLang(str: String) {
        Intrinsics.checkNotNullParameter(str, "<set-?>")
        lang = str
    }

    companion object {
        val Companion = Companion(null)
        private val overrideData: HashMap<String, ProvidersInfoJson>? = null
        fun  /* synthetic */`getMainPage$suspendImpl`(
            mainAPI: MainAPI?,
            continuation: Continuation<*>?
        ): Object {
            throw Standard(null, 1, null)
        }

        fun  /* synthetic */`search$suspendImpl`(
            mainAPI: MainAPI?,
            str: String?,
            continuation: Continuation<*>?
        ): Object {
            throw Standard(null, 1, null)
        }

        fun  /* synthetic */`loadPage$suspendImpl`(
            mainAPI: MainAPI?,
            str: String?,
            continuation: Continuation<*>?
        ): Object {
            throw Standard(null, 1, null)
        }

        fun  /* synthetic */`quickSearch$suspendImpl`(
            mainAPI: MainAPI?,
            str: String?,
            continuation: Continuation<*>?
        ): Object {
            throw Standard(null, 1, null)
        }

        fun  /* synthetic */`load$suspendImpl`(
            mainAPI: MainAPI?,
            str: String?,
            continuation: Continuation<*>?
        ): Object {
            throw Standard(null, 1, null)
        }

        fun  /* synthetic */`extractorVerifierJob$suspendImpl`(
            mainAPI: MainAPI?,
            str: String?,
            continuation: Continuation<*>?
        ): Object {
            throw Standard(null, 1, null)
        }

        fun  /* synthetic */`loadLinks$suspendImpl`(
            mainAPI: MainAPI?,
            str: String?,
            z: Boolean,
            function1: Function1<*, *>?,
            function12: Function1<*, *>?,
            continuation: Continuation<*>?
        ): Object {
            throw Standard(null, 1, null)
        }
    }
}