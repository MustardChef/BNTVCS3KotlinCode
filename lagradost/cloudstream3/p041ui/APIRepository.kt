package com.lagradost.cloudstream3.p041ui

import com.lagradost.cloudstream3.mvvm.Resource
import java.util.HashSet
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: APIRepository.kt */
@Metadata(
    m108d1 = ["\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 22\u00020\u0001:\u00012B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001b\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u0019\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001cH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u001c2\u0006\u0010!\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJI\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\n2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00180&2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00180&H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010*J\u001f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u001c2\u0006\u0010!\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ%\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.0\u001c2\u0006\u00100\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ%\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.0\u001c2\u0006\u00100\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000cR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000cR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/APIRepository;", "", "api", "Lcom/lagradost/cloudstream3/MainAPI;", "subtitleApi", "Lcom/lagradost/cloudstream3/subtitleproviders/SubtitleApi;", "(Lcom/lagradost/cloudstream3/MainAPI;Lcom/lagradost/cloudstream3/subtitleproviders/SubtitleApi;)V", "getApi", "()Lcom/lagradost/cloudstream3/MainAPI;", "hasMainPage", "", "getHasMainPage", "()Z", "hasQuickSearch", "getHasQuickSearch", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "name", "getName", "getSubtitleApi", "()Lcom/lagradost/cloudstream3/subtitleproviders/SubtitleApi;", "extractorVerifierJob", "", "extractorData", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMainPage", "Lcom/lagradost/cloudstream3/mvvm/Resource;", "Lcom/lagradost/cloudstream3/HomePageResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadPage", "Lcom/lagradost/cloudstream3/PageResponse;", "quickSearch", "", "Lcom/lagradost/cloudstream3/SearchResponse;", "query", "search", "Companion", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.APIRepository */ /* loaded from: classes.dex */
class APIRepository constructor(api: MainAPI, subtitleApi: SubtitleApi?) {
    private val api: MainAPI
    val hasMainPage: Boolean
    val hasQuickSearch: Boolean
    val mainUrl: String
    val name: String
    private val subtitleApi: SubtitleApi?

    /* compiled from: APIRepository.kt */
    @Metadata(
        m108d1 = ["\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u000c¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u000c¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/APIRepository\$Companion;", "", "()V", "dubStatusActive", "Ljava/util/HashSet;", "Lcom/lagradost/cloudstream3/DubStatus;", "Lkotlin/collections/HashSet;", "getDubStatusActive", "()Ljava/util/HashSet;", "setDubStatusActive", "(Ljava/util/HashSet;)V", "noneApi", "Lcom/lagradost/cloudstream3/MainAPI;", "getNoneApi", "()Lcom/lagradost/cloudstream3/MainAPI;", "randomApi", "getRandomApi", "isInvalidData", "", "data", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.APIRepository$Companion */ /* loaded from: classes.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        var dubStatusActive: HashSet<DubStatus>
            get() {
                return APIRepository.Companion.dubStatusActive
            }
            set(hashSet) {
                Intrinsics.checkNotNullParameter(hashSet, "<set-?>")
                APIRepository.Companion.dubStatusActive = hashSet
            }
        val noneApi: MainAPI
            get() {
                return APIRepository.Companion.noneApi
            }
        val randomApi: MainAPI
            get() {
                return APIRepository.Companion.randomApi
            }

        fun isInvalidData(data: String): Boolean {
            Intrinsics.checkNotNullParameter(data, "data")
            return (data.length() === 0) || Intrinsics.areEqual(
                data,
                HttpUrl.PATH_SEGMENT_ENCODE_SET_URI
            ) || Intrinsics.areEqual(data, "about:blank")
        }
    }

    init {
        Intrinsics.checkNotNullParameter(api, "api")
        this.api = api
        this.subtitleApi = subtitleApi
        hasMainPage = api.hasMainPage
        name = api.name
        mainUrl = api.mainUrl
        hasQuickSearch = api.hasQuickSearch
    }

    /* synthetic */   constructor(
        mainAPI: MainAPI,
        subtitleApi: SubtitleApi?,
        i: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(mainAPI, if ((i and 2) != 0) null else subtitleApi) {
    }

    fun getApi(): MainAPI {
        return api
    }

    fun getSubtitleApi(): SubtitleApi? {
        return subtitleApi
    }

    fun load(str: String?, continuation: Continuation<in Resource<out LoadResponse?>?>?): Object {
        if (APIRepository.Companion.Companion.isInvalidData(str)) {
            throw ErrorLoadingException(null, 1, null)
        }
        return ArchComponentExt.safeApiCall<LoadResponse>(
            `APIRepository$load$2`(this, str, null),
            continuation
        )
    }

    fun search(
        str: String,
        continuation: Continuation<in Resource<out List<SearchResponse?>?>?>?
    ): Object {
        if (str.length() === 0) {
            return Resource.Success<Any?>(CollectionsKt.emptyList<Any>())
        }
        return ArchComponentExt.safeApiCall(`APIRepository$search$2`(this, str, null), continuation)
    }

    fun loadPage(str: String?, continuation: Continuation<in Resource<PageResponse?>?>?): Object {
        return ArchComponentExt.safeApiCall(
            `APIRepository$loadPage$2`(this, str, null),
            continuation
        )
    }

    fun quickSearch(
        str: String,
        continuation: Continuation<in Resource<out List<SearchResponse?>?>?>?
    ): Object {
        if (str.length() === 0) {
            return Resource.Success<Any?>(CollectionsKt.emptyList<Any>())
        }
        return ArchComponentExt.safeApiCall(
            `APIRepository$quickSearch$2`(this, str, null),
            continuation
        )
    }

    fun getMainPage(continuation: Continuation<in Resource<HomePageResponse?>?>?): Object {
        return ArchComponentExt.safeApiCall(`APIRepository$getMainPage$2`(this, null), continuation)
    }

    fun extractorVerifierJob(str: String?, continuation: Continuation<in Unit>?): Object {
        val safeApiCall: Object = ArchComponentExt.safeApiCall(
            `APIRepository$extractorVerifierJob$2`(this, str, null),
            continuation
        )
        return if (safeApiCall === IntrinsicsKt.getCOROUTINE_SUSPENDED()) safeApiCall else Unit.INSTANCE
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */ /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun loadLinks(
        r9: String?,
        r10: Boolean,
        r11: Function1<SubtitleFile?, Unit>?,
        r12: Function1<ExtractorLink?, Unit>?,
        r13: Continuation<in Boolean?>?
    ): Any {
        /*
            r8 = this;
            boolean r0 = r13 instanceof com.lagradost.cloudstream3.p041ui.APIRepository$loadLinks$1
            if (r0 == 0) goto L14
            r0 = r13
            com.lagradost.cloudstream3.ui.APIRepository$loadLinks$1 r0 = (com.lagradost.cloudstream3.p041ui.APIRepository$loadLinks$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r13 = r0.label
            int r13 = r13 - r2
            r0.label = r13
            goto L19
        L14:
            com.lagradost.cloudstream3.ui.APIRepository$loadLinks$1 r0 = new com.lagradost.cloudstream3.ui.APIRepository$loadLinks$1
            r0.<init>(r8, r13)
        L19:
            r6 = r0
            java.lang.Object r13 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r7 = 0
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.lang.Throwable -> L2c
            goto L59
        L2c:
            r9 = move-exception
            goto L64
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            kotlin.ResultKt.throwOnFailure(r13)
            com.lagradost.cloudstream3.ui.APIRepository$Companion r13 = com.lagradost.cloudstream3.p041ui.APIRepository.Companion
            boolean r13 = r13.isInvalidData(r9)
            if (r13 == 0) goto L46
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.boxing.boxBoolean(r7)
            return r9
        L46:
            com.lagradost.cloudstream3.MainAPI r1 = r8.api     // Catch: java.lang.Throwable -> L2c
            if (r10 == 0) goto L4c
            r3 = 1
            goto L4d
        L4c:
            r3 = 0
        L4d:
            r6.label = r2     // Catch: java.lang.Throwable -> L2c
            r2 = r9
            r4 = r11
            r5 = r12
            java.lang.Object r13 = r1.loadLinks(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2c
            if (r13 != r0) goto L59
            return r0
        L59:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch: java.lang.Throwable -> L2c
            boolean r9 = r13.booleanValue()     // Catch: java.lang.Throwable -> L2c
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.boxing.boxBoolean(r9)
            return r9
        L64:
            com.lagradost.cloudstream3.mvvm.ArchComponentExt.logError(r9)
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.boxing.boxBoolean(r7)
            return r9
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.p041ui.APIRepository.loadLinks(java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
    }

    companion object {
        val Companion: Companion = Companion(null)
        private val dubStatusActive: HashSet<DubStatus> = HashSet()
        private val noneApi: MainAPI = object : MainAPI() {
            // com.lagradost.cloudstream3.MainAPI
            // com.lagradost.cloudstream3.MainAPI
            // from class: com.lagradost.cloudstream3.ui.APIRepository$Companion$noneApi$1
            @get:Override
            @set:Override
            var name: String = "None"
                // com.lagradost.cloudstream3.MainAPI
                set(str) {
                    Intrinsics.checkNotNullParameter(str, "<set-?>")
                    field = str
                }

            // com.lagradost.cloudstream3.MainAPI
            @get:Override
            val supportedTypes: Set<TvType> = SetsKt.emptySet<Any>()
            private var lang: String = ""

            @Override // com.lagradost.cloudstream3.MainAPI
            public override fun getLang(): String? {
                return lang
            }

            @Override // com.lagradost.cloudstream3.MainAPI
            public override fun setLang(str: String) {
                Intrinsics.checkNotNullParameter(str, "<set-?>")
                lang = str
            }
        }
        private val randomApi: MainAPI = object : MainAPI() {
            // com.lagradost.cloudstream3.MainAPI
            // com.lagradost.cloudstream3.MainAPI
            // from class: com.lagradost.cloudstream3.ui.APIRepository$Companion$randomApi$1
            @get:Override
            @set:Override
            var name: String = "Random"
                // com.lagradost.cloudstream3.MainAPI
                set(str) {
                    Intrinsics.checkNotNullParameter(str, "<set-?>")
                    field = str
                }

            // com.lagradost.cloudstream3.MainAPI
            @get:Override
            val supportedTypes: Set<TvType> = SetsKt.emptySet<Any>()
            private var lang: String = ""

            @Override // com.lagradost.cloudstream3.MainAPI
            public override fun getLang(): String? {
                return lang
            }

            @Override // com.lagradost.cloudstream3.MainAPI
            public override fun setLang(str: String) {
                Intrinsics.checkNotNullParameter(str, "<set-?>")
                lang = str
            }
        }
    }
}