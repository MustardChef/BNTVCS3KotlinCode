package com.lagradost.cloudstream3.metaproviders

import java.util.List
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: CrossTmdbProvider.kt */
@Metadata(
    m108d1 = ["\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u00012B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u001b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\$JI\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00142\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020+0)H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010.J!\u0010/\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\u001a2\u0006\u00101\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\$R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0006\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000c\u0010\u0006\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0014X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8BX\u0082\u0084\u0002¢\u0006\u000c\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"],
    m107d2 = ["Lcom/lagradost/cloudstream3/metaproviders/CrossTmdbProvider;", "Lcom/lagradost/cloudstream3/metaproviders/TmdbProvider;", "()V", "apiName", "", "getApiName", "()Ljava/lang/String;", "lang", "getLang", "setLang", "(Ljava/lang/String;)V", "name", "getName", "setName", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "useMetaLoadResponse", "", "getUseMetaLoadResponse", "()Z", "usesWebView", "getUsesWebView", "validApis", "", "Lcom/lagradost/cloudstream3/MainAPI;", "getValidApis", "()Ljava/util/List;", "validApis\$delegate", "Lkotlin/Lazy;", "filterName", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "Lcom/lagradost/cloudstream3/SearchResponse;", "query", "CrossMetaData", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class CrossTmdbProvider : TmdbProvider() {
    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var name = "MultiMovie"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.metaproviders.TmdbProvider
    @get:Override
    override val apiName = "MultiMovie"
    private var lang = "en"

    // com.lagradost.cloudstream3.metaproviders.TmdbProvider
    @get:Override
    override val useMetaLoadResponse = true

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val usesWebView = true

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val supportedTypes: Set<TvType> = SetsKt.setOf<TvType>(TvType.Movie)
    private val `validApis$delegate`: Lazy<*> = LazyKt.lazy(`CrossTmdbProvider$validApis$2`(this))

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
    fun filterName(str: String?): String {
        return Regex("[^a-zA-Z0-9-]").replace(str, "")
    }

    private val validApis: List<Any>
        private get() = `validApis$delegate`.value as List

    /* compiled from: CrossTmdbProvider.kt */
    @Metadata(
        m108d1 = ["\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u001c\b\u0003\u0010\u0004\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000c\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\r\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005HÆ\u0003J1\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u001c\b\u0003\u0010\u0004\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR%\u0010\u0004\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"],
        m107d2 = ["Lcom/lagradost/cloudstream3/metaproviders/CrossTmdbProvider\$CrossMetaData;", "", "isSuccess", "", "movies", "", "Lkotlin/Pair;", "", "(ZLjava/util/List;)V", "()Z", "getMovies", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class CrossMetaData(
        @param:JsonProperty("isSuccess") val isSuccess: Boolean, @param:JsonProperty(
            "movies"
        ) val movies: List<Tuples<String, String>>?
    ) {
        operator fun component1(): Boolean {
            return isSuccess
        }

        operator fun component2(): List<Tuples<String, String>>? {
            return movies
        }

        fun copy(
            @JsonProperty("isSuccess") z: Boolean,
            @JsonProperty("movies") list: List<Tuples<String, String>>?
        ): CrossMetaData {
            return CrossMetaData(z, list)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is CrossMetaData) {
                val crossMetaData = obj as CrossMetaData
                return isSuccess == crossMetaData.isSuccess && Intrinsics.areEqual(
                    movies, crossMetaData.movies
                )
            }
            return false
        }

        /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Type inference failed for: r0v1, types: [int] */ /* JADX WARN: Type inference failed for: r0v4 */ /* JADX WARN: Type inference failed for: r0v5 */
        override fun hashCode(): Int {
            val z = isSuccess
            r0 = z
            if (z) {
                r0 = 1
            }
            val i: Int = r0 * 31
            val list = movies
            return i + (list?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "CrossMetaData(isSuccess=" + isSuccess + ", movies=" + movies + ')'
        }

        /* synthetic */   constructor(
            z: Boolean,
            list: List?,
            i: Int,
            defaultConstructorMarker: DefaultConstructorMarker?
        ) : this(z, if (i and 2 != 0) null else list) {
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                crossMetaData: CrossMetaData,
                z: Boolean,
                list: List?,
                i: Int,
                obj: Object?
            ): CrossMetaData {
                var z = z
                var list: List? = list
                if (i and 1 != 0) {
                    z = crossMetaData.isSuccess
                }
                if (i and 2 != 0) {
                    list = crossMetaData.movies
                }
                return crossMetaData.copy(z, list)
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */ /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    @Override // com.lagradost.cloudstream3.MainAPI
            /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */    fun loadLinks(
        r3: String?,
        r4: Boolean,
        r5: Function1<SubtitleFile?, Unit>?,
        r6: Function1<ExtractorLink?, Unit>?,
        r7: Continuation<in Boolean?>?
    ): Any {
        /*
            r2 = this;
            com.lagradost.cloudstream3.utils.AppUtils r7 = com.lagradost.cloudstream3.utils.AppUtils.INSTANCE
            r7 = 0
            if (r3 != 0) goto L7
        L5:
            r3 = r7
            goto L18
        L7:
            com.fasterxml.jackson.databind.json.JsonMapper r0 = com.lagradost.cloudstream3.MainAPIKt.getMapper()     // Catch: java.lang.Exception -> L5
            com.fasterxml.jackson.databind.ObjectMapper r0 = (com.fasterxml.jackson.databind.ObjectMapper) r0     // Catch: java.lang.Exception -> L5
            com.lagradost.cloudstream3.metaproviders.CrossTmdbProvider$loadLinks$$inlined$tryParseJson$1 r1 = new com.lagradost.cloudstream3.metaproviders.CrossTmdbProvider$loadLinks$$inlined$tryParseJson$1     // Catch: java.lang.Exception -> L5
            r1.<init>()     // Catch: java.lang.Exception -> L5
            com.fasterxml.jackson.core.type.TypeReference r1 = (com.fasterxml.jackson.core.type.TypeReference) r1     // Catch: java.lang.Exception -> L5
            java.lang.Object r3 = r0.readValue(r3, r1)     // Catch: java.lang.Exception -> L5
        L18:
            com.lagradost.cloudstream3.metaproviders.CrossTmdbProvider$CrossMetaData r3 = (com.lagradost.cloudstream3.metaproviders.CrossTmdbProvider.CrossMetaData) r3
            r0 = 0
            if (r3 == 0) goto L3e
            boolean r1 = r3.isSuccess()
            if (r1 != 0) goto L28
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.boxing.boxBoolean(r0)
            return r3
        L28:
            java.util.List r3 = r3.getMovies()
            if (r3 == 0) goto L38
            com.lagradost.cloudstream3.metaproviders.CrossTmdbProvider$loadLinks$2$1 r0 = new com.lagradost.cloudstream3.metaproviders.CrossTmdbProvider$loadLinks$2$1
            r0.<init>(r4, r5, r6, r7)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            com.lagradost.cloudstream3.ParCollections.apmap(r3, r0)
        L38:
            r3 = 1
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.boxing.boxBoolean(r3)
            return r3
        L3e:
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.boxing.boxBoolean(r0)
            return r3
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.metaproviders.CrossTmdbProvider.loadLinks(java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */ /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */ /* JADX WARN: Removed duplicated region for block: B:26:0x0064 A[ORIG_RETURN, RETURN] */
    @Override // com.lagradost.cloudstream3.metaproviders.TmdbProvider, com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun search(
        r5: String?,
        r6: Continuation<in MutableList<out SearchResponse?>?>?
    ): Any {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.lagradost.cloudstream3.metaproviders.CrossTmdbProvider$search$1
            if (r0 == 0) goto L14
            r0 = r6
            com.lagradost.cloudstream3.metaproviders.CrossTmdbProvider$search$1 r0 = (com.lagradost.cloudstream3.metaproviders.CrossTmdbProvider$search$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            com.lagradost.cloudstream3.metaproviders.CrossTmdbProvider$search$1 r0 = new com.lagradost.cloudstream3.metaproviders.CrossTmdbProvider$search$1
            r0.<init>(r4, r6)
        L19:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L3e
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.label = r3
            java.lang.Object r6 = super.search(r5, r0)
            if (r6 != r1) goto L3e
            return r1
        L3e:
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L64
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.Iterator r6 = r6.iterator()
        L4f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L61
            java.lang.Object r0 = r6.next()
            boolean r1 = r0 instanceof com.lagradost.cloudstream3.MovieSearchResponse
            if (r1 == 0) goto L4f
            r5.add(r0)
            goto L4f
        L61:
            java.util.List r5 = (java.util.List) r5
            goto L65
        L64:
            r5 = 0
        L65:
            return r5
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.metaproviders.CrossTmdbProvider.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */ /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */ /* JADX WARN: Removed duplicated region for block: B:39:0x00e2  */
    @Override // com.lagradost.cloudstream3.metaproviders.TmdbProvider, com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun load(r7: String?, r8: Continuation<in LoadResponse?>?): Any {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.lagradost.cloudstream3.metaproviders.CrossTmdbProvider$load$1
            if (r0 == 0) goto L14
            r0 = r8
            com.lagradost.cloudstream3.metaproviders.CrossTmdbProvider$load$1 r0 = (com.lagradost.cloudstream3.metaproviders.CrossTmdbProvider$load$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            com.lagradost.cloudstream3.metaproviders.CrossTmdbProvider$load$1 r0 = new com.lagradost.cloudstream3.metaproviders.CrossTmdbProvider$load$1
            r0.<init>(r6, r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r7 = r0.L$0
            com.lagradost.cloudstream3.metaproviders.CrossTmdbProvider r7 = (com.lagradost.cloudstream3.metaproviders.CrossTmdbProvider) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L45
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            kotlin.ResultKt.throwOnFailure(r8)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r8 = super.load(r7, r0)
            if (r8 != r1) goto L44
            return r1
        L44:
            r7 = r6
        L45:
            com.lagradost.cloudstream3.LoadResponse r8 = (com.lagradost.cloudstream3.LoadResponse) r8
            r0 = 0
            if (r8 == 0) goto Le2
            java.util.List r1 = r8.getRecommendations()
            if (r1 == 0) goto L72
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r1 = r1.iterator()
        L5d:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L6f
            java.lang.Object r4 = r1.next()
            boolean r5 = r4 instanceof com.lagradost.cloudstream3.MovieSearchResponse
            if (r5 == 0) goto L5d
            r2.add(r4)
            goto L5d
        L6f:
            java.util.List r2 = (java.util.List) r2
            goto L73
        L72:
            r2 = r0
        L73:
            r8.setRecommendations(r2)
            java.lang.String r1 = r8.getName()
            java.lang.String r1 = r7.filterName(r1)
            boolean r2 = r8 instanceof com.lagradost.cloudstream3.MovieLoadResponse
            if (r2 == 0) goto Lda
            java.util.List r2 = r7.getValidApis()
            com.lagradost.cloudstream3.metaproviders.CrossTmdbProvider$load$base$1$data$1 r4 = new com.lagradost.cloudstream3.metaproviders.CrossTmdbProvider$load$base$1$data$1
            r4.<init>(r8, r7, r1, r0)
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            java.util.List r7 = com.lagradost.cloudstream3.ParCollections.apmap(r2, r4)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.List r7 = kotlin.collections.CollectionsKt.filterNotNull(r7)
            r0 = r8
            com.lagradost.cloudstream3.MovieLoadResponse r0 = (com.lagradost.cloudstream3.MovieLoadResponse) r0
            com.lagradost.cloudstream3.utils.AppUtils r1 = com.lagradost.cloudstream3.utils.AppUtils.INSTANCE
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r7, r4)
            r2.<init>(r4)
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r7 = r7.iterator()
        Laf:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto Lcb
            java.lang.Object r4 = r7.next()
            com.lagradost.cloudstream3.MovieLoadResponse r4 = (com.lagradost.cloudstream3.MovieLoadResponse) r4
            java.lang.String r5 = r4.getApiName()
            java.lang.String r4 = r4.getDataUrl()
            kotlin.Pair r4 = kotlin.TuplesKt.m100to(r5, r4)
            r2.add(r4)
            goto Laf
        Lcb:
            java.util.List r2 = (java.util.List) r2
            com.lagradost.cloudstream3.metaproviders.CrossTmdbProvider$CrossMetaData r7 = new com.lagradost.cloudstream3.metaproviders.CrossTmdbProvider$CrossMetaData
            r7.<init>(r3, r2)
            java.lang.String r7 = r1.toJson(r7)
            r0.setDataUrl(r7)
            goto Le3
        Lda:
            com.lagradost.cloudstream3.ErrorLoadingException r7 = new com.lagradost.cloudstream3.ErrorLoadingException
            java.lang.String r8 = "Nothing besides movies are implemented for this provider"
            r7.<init>(r8)
            throw r7
        Le2:
            r8 = r0
        Le3:
            return r8
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.metaproviders.CrossTmdbProvider.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }
}