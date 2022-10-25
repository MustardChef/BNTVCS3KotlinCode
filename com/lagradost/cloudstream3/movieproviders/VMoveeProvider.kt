package com.lagradost.cloudstream3.movieproviders

import com.google.firebase.messaging.Constants
import java.util.List
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: VMoveeProvider.kt */
@Metadata(
    m108d1 = ["\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003$%&B\u0005¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014JI\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00162\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001c0\u001aH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\u000c\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/VMoveeProvider;", "Lcom/lagradost/cloudstream3/MainAPI;", "()V", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLinks", "", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "", "Lcom/lagradost/cloudstream3/SearchResponse;", "query", "LoadLinksAjax", "ReeoovAPI", "ReeoovAPIData", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class VMoveeProvider : MainAPI() {
    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var name = "VMovee"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var mainUrl = "https://www.vmovee.watch"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val supportedTypes: Set<TvType> = SetsKt.setOf<TvType>(TvType.Movie)

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */ /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */ /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun search(
        r22: String?,
        r23: Continuation<in MutableList<out SearchResponse?>?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.VMoveeProvider.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* compiled from: VMoveeProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/VMoveeProvider\$LoadLinksAjax;", "", "embedUrl", "", "(Ljava/lang/String;)V", "getEmbedUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class LoadLinksAjax(@JsonProperty("embed_url") embedUrl: String) {
        val embedUrl: String
        operator fun component1(): String {
            return embedUrl
        }

        fun copy(@JsonProperty("embed_url") embedUrl: String): LoadLinksAjax {
            Intrinsics.checkNotNullParameter(embedUrl, "embedUrl")
            return LoadLinksAjax(embedUrl)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is LoadLinksAjax && Intrinsics.areEqual(
                embedUrl,
                (obj as LoadLinksAjax).embedUrl
            )
        }

        override fun hashCode(): Int {
            return embedUrl.hashCode()
        }

        override fun toString(): String {
            return "LoadLinksAjax(embedUrl=" + embedUrl + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(embedUrl, "embedUrl")
            this.embedUrl = embedUrl
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                loadLinksAjax: LoadLinksAjax,
                str: String,
                i: Int,
                obj: Object?
            ): LoadLinksAjax {
                var str = str
                if (i and 1 != 0) {
                    str = loadLinksAjax.embedUrl
                }
                return loadLinksAjax.copy(str)
            }
        }
    }

    /* compiled from: VMoveeProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000c\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/VMoveeProvider\$ReeoovAPIData;", "", "file", "", Constants.ScionAnalytics.PARAM_LABEL, "(Ljava/lang/String;Ljava/lang/String;)V", "getFile", "()Ljava/lang/String;", "getLabel", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class ReeoovAPIData(@JsonProperty("file") file: String, @JsonProperty("label") label: String) {
        val file: String
        val label: String
        operator fun component1(): String {
            return file
        }

        operator fun component2(): String {
            return label
        }

        fun copy(
            @JsonProperty("file") file: String,
            @JsonProperty("label") label: String
        ): ReeoovAPIData {
            Intrinsics.checkNotNullParameter(file, "file")
            Intrinsics.checkNotNullParameter(label, "label")
            return ReeoovAPIData(file, label)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is ReeoovAPIData) {
                val reeoovAPIData = obj as ReeoovAPIData
                return Intrinsics.areEqual(file, reeoovAPIData.file) && Intrinsics.areEqual(
                    label, reeoovAPIData.label
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return file.hashCode() * 31 + label.hashCode()
        }

        override fun toString(): String {
            return "ReeoovAPIData(file=" + file + ", label=" + label + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(file, "file")
            Intrinsics.checkNotNullParameter(label, "label")
            this.file = file
            this.label = label
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                reeoovAPIData: ReeoovAPIData,
                str: String,
                str2: String,
                i: Int,
                obj: Object?
            ): ReeoovAPIData {
                var str = str
                var str2 = str2
                if (i and 1 != 0) {
                    str = reeoovAPIData.file
                }
                if (i and 2 != 0) {
                    str2 = reeoovAPIData.label
                }
                return reeoovAPIData.copy(str, str2)
            }
        }
    }

    /* compiled from: VMoveeProvider.kt */
    @Metadata(
        m108d1 = ["\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\u000c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/VMoveeProvider\$ReeoovAPI;", "", "data", "", "Lcom/lagradost/cloudstream3/movieproviders/VMoveeProvider\$ReeoovAPIData;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class ReeoovAPI(@JsonProperty("data") data: List<ReeoovAPIData>) {
        val data: List<ReeoovAPIData>
        operator fun component1(): List<ReeoovAPIData> {
            return data
        }

        fun copy(@JsonProperty("data") data: List<ReeoovAPIData>): ReeoovAPI {
            Intrinsics.checkNotNullParameter(data, "data")
            return ReeoovAPI(data)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is ReeoovAPI && Intrinsics.areEqual(
                data,
                (obj as ReeoovAPI).data
            )
        }

        override fun hashCode(): Int {
            return data.hashCode()
        }

        override fun toString(): String {
            return "ReeoovAPI(data=" + data + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(data, "data")
            this.data = data
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                reeoovAPI: ReeoovAPI,
                list: List,
                i: Int,
                obj: Object?
            ): ReeoovAPI {
                var list: List = list
                if (i and 1 != 0) {
                    list = reeoovAPI.data
                }
                return reeoovAPI.copy(list)
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */ /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */ /* JADX WARN: Removed duplicated region for block: B:24:0x0121  */ /* JADX WARN: Removed duplicated region for block: B:27:0x016b A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:28:0x016c  */ /* JADX WARN: Removed duplicated region for block: B:31:0x0181  */ /* JADX WARN: Removed duplicated region for block: B:38:0x0227 A[LOOP:0: B:36:0x0221->B:38:0x0227, LOOP_END] */
    @Override // com.lagradost.cloudstream3.MainAPI
            /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */    fun loadLinks(
        r30: String?,
        r31: Boolean,
        r32: Function1<SubtitleFile?, Unit>?,
        r33: Function1<ExtractorLink?, Unit>?,
        r34: Continuation<in Boolean?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.VMoveeProvider.loadLinks(java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun load(r27: String?, r28: Continuation<in LoadResponse?>?): Any {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.VMoveeProvider.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }
}