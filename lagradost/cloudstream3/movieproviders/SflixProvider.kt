package com.lagradost.cloudstream3.movieproviders

import com.google.firebase.messaging.Constants
import org.jsoup.nodes.Element
import java.net.URI
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: SflixProvider.kt */
@Metadata(
    m108d1 = ["\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 :2\u00020\u0001:\u0005:;<=>B\u0005¢\u0006\u0002\u0010\u0002J\u001b\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\$J\u0011\u0010%\u001a\u00020&H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010'J\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\$JI\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u00042\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\"0/2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\"0/H\u0096@ø\u0001\u0000¢\u0006\u0002\u00103J\u001f\u00104\u001a\b\u0012\u0004\u0012\u000206052\u0006\u00107\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\$J\u000c\u00108\u001a\u000206*\u000209H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\u0006R\u001a\u0010\r\u001a\u00020\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u001eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006?"],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SflixProvider;", "Lcom/lagradost/cloudstream3/MainAPI;", "()V", "hasChromecastSupport", "", "getHasChromecastSupport", "()Z", "hasDownloadSupport", "getHasDownloadSupport", "hasMainPage", "getHasMainPage", "hasQuickSearch", "getHasQuickSearch", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "usesWebView", "getUsesWebView", "vpnStatus", "Lcom/lagradost/cloudstream3/VPNStatus;", "getVpnStatus", "()Lcom/lagradost/cloudstream3/VPNStatus;", "extractorVerifierJob", "", "extractorData", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMainPage", "Lcom/lagradost/cloudstream3/HomePageResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "", "Lcom/lagradost/cloudstream3/SearchResponse;", "query", "toSearchResult", "Lorg/jsoup/nodes/Element;", "Companion", "IframeJson", "SourceObject", "Sources", "Tracks", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes3.dex */
open class SflixProvider : MainAPI() {
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasQuickSearch = false

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var mainUrl = "https://sflix.to"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var name = "Sflix.to"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasMainPage = true

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasChromecastSupport = true

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val hasDownloadSupport = true

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val usesWebView = true

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val supportedTypes: Set<TvType> =
        SetsKt.setOf<Object>(*arrayOf<TvType>(TvType.Movie, TvType.TvSeries) as Array<Object>)

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val vpnStatus: VPNStatus = VPNStatus.None

    @Override // com.lagradost.cloudstream3.MainAPI
    override fun extractorVerifierJob(str: String?, continuation: Continuation<in Unit>?): Object {
        return Companion.`extractorVerifierJob$suspendImpl`(
            this,
            str,
            continuation as Continuation<*>?
        )
    }

    @Override // com.lagradost.cloudstream3.MainAPI
    override fun getMainPage(continuation: Continuation<in HomePageResponse?>?): Object? {
        return Companion.`getMainPage$suspendImpl`(this, continuation as Continuation<*>?)
    }

    @Override // com.lagradost.cloudstream3.MainAPI
    override fun load(str: String?, continuation: Continuation<in LoadResponse?>?): Object {
        return Companion.`load$suspendImpl`(this, str, continuation as Continuation<*>?)
    }

    @Override // com.lagradost.cloudstream3.MainAPI
    fun loadLinks(
        str: String?,
        z: Boolean,
        function1: Function1<SubtitleFile?, Unit>?,
        function12: Function1<ExtractorLink?, Unit>?,
        continuation: Continuation<in Boolean?>?
    ): Object {
        return Companion.`loadLinks$suspendImpl`(
            this,
            str,
            z,
            function1 as Function1<*, *>?,
            function12 as Function1<*, *>?,
            continuation as Continuation<*>?
        )
    }

    @Override // com.lagradost.cloudstream3.MainAPI
    override fun search(
        str: String?,
        continuation: Continuation<in List<SearchResponse?>?>?
    ): Object {
        return Companion.`search$suspendImpl`(this, str, continuation as Continuation<*>?)
    }

    /* compiled from: SflixProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SflixProvider\$Tracks;", "", "file", "", Constants.ScionAnalytics.PARAM_LABEL, "kind", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFile", "()Ljava/lang/String;", "getKind", "getLabel", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Tracks(
        @param:JsonProperty("file") val file: String, @param:JsonProperty(
            "label"
        ) val label: String, @param:JsonProperty("kind") val kind: String
    ) {
        operator fun component1(): String {
            return file
        }

        operator fun component2(): String {
            return label
        }

        operator fun component3(): String {
            return kind
        }

        fun copy(
            @JsonProperty("file") str: String,
            @JsonProperty("label") str2: String,
            @JsonProperty("kind") str3: String
        ): Tracks {
            return Tracks(str, str2, str3)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Tracks) {
                val tracks = obj as Tracks
                return Intrinsics.areEqual(file, tracks.file) && Intrinsics.areEqual(
                    label, tracks.label
                ) && Intrinsics.areEqual(kind, tracks.kind)
            }
            return false
        }

        override fun hashCode(): Int {
            val str = file
            val hashCode = (str?.hashCode() ?: 0) * 31
            val str2 = label
            val hashCode2 = (hashCode + (str2?.hashCode() ?: 0)) * 31
            val str3 = kind
            return hashCode2 + (str3?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "Tracks(file=" + file + ", label=" + label + ", kind=" + kind + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                tracks: Tracks,
                str: String,
                str2: String,
                str3: String,
                i: Int,
                obj: Object?
            ): Tracks {
                var str = str
                var str2 = str2
                var str3 = str3
                if (i and 1 != 0) {
                    str = tracks.file
                }
                if (i and 2 != 0) {
                    str2 = tracks.label
                }
                if (i and 4 != 0) {
                    str3 = tracks.kind
                }
                return tracks.copy(str, str2, str3)
            }
        }
    }

    /* compiled from: SflixProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SflixProvider\$Sources;", "", "file", "", "type", Constants.ScionAnalytics.PARAM_LABEL, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFile", "()Ljava/lang/String;", "getLabel", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Sources(
        @param:JsonProperty("file") val file: String, @param:JsonProperty(
            "type"
        ) val type: String, @param:JsonProperty("label") val label: String
    ) {
        operator fun component1(): String {
            return file
        }

        operator fun component2(): String {
            return type
        }

        operator fun component3(): String {
            return label
        }

        fun copy(
            @JsonProperty("file") str: String,
            @JsonProperty("type") str2: String,
            @JsonProperty("label") str3: String
        ): Sources {
            return Sources(str, str2, str3)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Sources) {
                val sources = obj as Sources
                return Intrinsics.areEqual(file, sources.file) && Intrinsics.areEqual(
                    type, sources.type
                ) && Intrinsics.areEqual(label, sources.label)
            }
            return false
        }

        override fun hashCode(): Int {
            val str = file
            val hashCode = (str?.hashCode() ?: 0) * 31
            val str2 = type
            val hashCode2 = (hashCode + (str2?.hashCode() ?: 0)) * 31
            val str3 = label
            return hashCode2 + (str3?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "Sources(file=" + file + ", type=" + type + ", label=" + label + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                sources: Sources,
                str: String,
                str2: String,
                str3: String,
                i: Int,
                obj: Object?
            ): Sources {
                var str = str
                var str2 = str2
                var str3 = str3
                if (i and 1 != 0) {
                    str = sources.file
                }
                if (i and 2 != 0) {
                    str2 = sources.type
                }
                if (i and 4 != 0) {
                    str3 = sources.label
                }
                return sources.copy(str, str2, str3)
            }
        }
    }

    /* compiled from: SflixProvider.kt */
    @Metadata(
        m108d1 = ["\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\u0012\b\u0001\u0010\u0002\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\u0012\b\u0001\u0010\u0005\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\u0012\b\u0001\u0010\u0006\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\u0012\b\u0001\u0010\u0007\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\u0012\b\u0001\u0010\b\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u0013\u0010\u0011\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u0012\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u0013\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u0014\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u0015\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0003HÆ\u0003Jm\u0010\u0016\u001a\u00020\u00002\u0012\b\u0003\u0010\u0002\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u0012\b\u0003\u0010\u0005\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u0012\b\u0003\u0010\u0006\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u0012\b\u0003\u0010\u0007\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u0012\b\u0003\u0010\b\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u001b\u0010\u0002\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000cR\u001b\u0010\u0005\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000cR\u001b\u0010\u0006\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000cR\u001b\u0010\u0007\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000cR\u001b\u0010\b\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000c¨\u0006\u001e"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SflixProvider\$SourceObject;", "", "sources", "", "Lcom/lagradost/cloudstream3/movieproviders/SflixProvider\$Sources;", "sources1", "sources2", "sourcesBackup", "tracks", "Lcom/lagradost/cloudstream3/movieproviders/SflixProvider\$Tracks;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getSources", "()Ljava/util/List;", "getSources1", "getSources2", "getSourcesBackup", "getTracks", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class SourceObject(
        @param:JsonProperty("sources") val sources: List<Sources>, @param:JsonProperty(
            "sources_1"
        ) val sources1: List<Sources>, @param:JsonProperty(
            "sources_2"
        ) val sources2: List<Sources>, @param:JsonProperty(
            "sourcesBackup"
        ) val sourcesBackup: List<Sources>, @param:JsonProperty(
            "tracks"
        ) val tracks: List<Tracks>
    ) {
        operator fun component1(): List<Sources> {
            return sources
        }

        operator fun component2(): List<Sources> {
            return sources1
        }

        operator fun component3(): List<Sources> {
            return sources2
        }

        operator fun component4(): List<Sources> {
            return sourcesBackup
        }

        operator fun component5(): List<Tracks> {
            return tracks
        }

        fun copy(
            @JsonProperty("sources") list: List<Sources>,
            @JsonProperty("sources_1") list2: List<Sources>,
            @JsonProperty("sources_2") list3: List<Sources>,
            @JsonProperty("sourcesBackup") list4: List<Sources>,
            @JsonProperty("tracks") list5: List<Tracks>
        ): SourceObject {
            return SourceObject(list, list2, list3, list4, list5)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is SourceObject) {
                val sourceObject = obj as SourceObject
                return Intrinsics.areEqual(sources, sourceObject.sources) && Intrinsics.areEqual(
                    sources1, sourceObject.sources1
                ) && Intrinsics.areEqual(
                    sources2, sourceObject.sources2
                ) && Intrinsics.areEqual(
                    sourcesBackup, sourceObject.sourcesBackup
                ) && Intrinsics.areEqual(
                    tracks, sourceObject.tracks
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val list = sources
            val hashCode = (list?.hashCode() ?: 0) * 31
            val list2 = sources1
            val hashCode2 = (hashCode + (list2?.hashCode() ?: 0)) * 31
            val list3 = sources2
            val hashCode3 = (hashCode2 + (list3?.hashCode() ?: 0)) * 31
            val list4 = sourcesBackup
            val hashCode4 = (hashCode3 + (list4?.hashCode() ?: 0)) * 31
            val list5 = tracks
            return hashCode4 + (list5?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "SourceObject(sources=" + sources + ", sources1=" + sources1 + ", sources2=" + sources2 + ", sourcesBackup=" + sourcesBackup + ", tracks=" + tracks + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                sourceObject: SourceObject,
                list: List,
                list2: List,
                list3: List,
                list4: List,
                list5: List,
                i: Int,
                obj: Object?
            ): SourceObject {
                var list6: List<Sources> = list
                if (i and 1 != 0) {
                    list6 = sourceObject.sources
                }
                var list7: List<Sources?> = list2
                if (i and 2 != 0) {
                    list7 = sourceObject.sources1
                }
                val list8: List = list7
                var list9: List<Sources?> = list3
                if (i and 4 != 0) {
                    list9 = sourceObject.sources2
                }
                val list10: List = list9
                var list11: List<Sources?> = list4
                if (i and 8 != 0) {
                    list11 = sourceObject.sourcesBackup
                }
                val list12: List = list11
                var list13: List<Tracks> = list5
                if (i and 16 != 0) {
                    list13 = sourceObject.tracks
                }
                return sourceObject.copy(list6, list8, list10, list12, list13)
            }
        }
    }

    /* compiled from: SflixProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SflixProvider\$IframeJson;", "", "link", "", "(Ljava/lang/String;)V", "getLink", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class IframeJson(@param:JsonProperty("link") val link: String?) {
        operator fun component1(): String? {
            return link
        }

        fun copy(@JsonProperty("link") str: String?): IframeJson {
            return IframeJson(str)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is IframeJson && Intrinsics.areEqual(
                link,
                (obj as IframeJson).link
            )
        }

        override fun hashCode(): Int {
            val str = link ?: return 0
            return str.hashCode()
        }

        override fun toString(): String {
            return "IframeJson(link=" + link + ')'
        }

        @JvmOverloads
                /* synthetic */   constructor(
            str: String? = null,
            i: Int = 1,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(if (i and 1 != 0) null else str) {
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                iframeJson: IframeJson,
                str: String?,
                i: Int,
                obj: Object?
            ): IframeJson {
                var str = str
                if (i and 1 != 0) {
                    str = iframeJson.link
                }
                return iframeJson.copy(str)
            }
        }
    }

    private fun toSearchResult(element: Element): SearchResponse {
        var emptyList: List
        var text: String?
        var obj: String?
        var intOrNull: Integer?
        var num: Integer?
        var searchQuality: SearchQuality?
        var text2: String?
        var obj2: String?
        var text3: String?
        var obj3: String?
        var select: Elements?
        val selectFirst: Element = element.selectFirst("div.film-poster")
        Intrinsics.checkNotNull(selectFirst)
        val select2: Elements = selectFirst.select("img")
        val title: String = select2.attr("title")
        val attr: String = select2.attr("data-src")
        val attr2 = attr ?: select2.attr("src")
        val attr3: String = selectFirst.select("a").attr(ShareConstants.WEB_DIALOG_PARAM_HREF)
        Intrinsics.checkNotNullExpressionValue(attr3, "inner.select(\"a\").attr(\"href\")")
        val fixUrl: String = MainAPIKt.fixUrl(this, attr3)
        var num2: Integer? = null
        val `contains$default`: Boolean = StringsKt.`contains$default`(
            fixUrl as CharSequence,
            "/movie/" as CharSequence,
            false,
            2,
            null as Object?
        )
        val selectFirst2: Element = element.selectFirst("div.film-detail > div.fd-infor")
        if (selectFirst2 == null || selectFirst2.select(TtmlNode.TAG_SPAN)
                .also { select = it } == null || CollectionsKt.toList(select)
                .also { emptyList = it } == null
        ) {
            emptyList = CollectionsKt.emptyList<Any>()
        }
        val size: Int = emptyList.size()
        if (size == 1) {
            val element2 = emptyList.get(0) as Element
            if (element2 != null && element2.text().also { text = it } != null && StringsKt.trim(
                    text as CharSequence?
                ).toString().also { obj = it } != null) {
                intOrNull = StringsKt.toIntOrNull(obj)
                num = intOrNull
                searchQuality = null
            }
            intOrNull = null
            num = intOrNull
            searchQuality = null
        } else if (size == 2) {
            val element3 = emptyList.get(0) as Element
            if (element3 != null && element3.text().also { text2 = it } != null && StringsKt.trim(
                    text2 as CharSequence?
                ).toString().also { obj2 = it } != null) {
                intOrNull = StringsKt.toIntOrNull(obj2)
                num = intOrNull
                searchQuality = null
            }
            intOrNull = null
            num = intOrNull
            searchQuality = null
        } else if (size != 3) {
            num = null
            searchQuality = null
        } else {
            val element4 = emptyList.get(1) as Element
            val qualityFromString: SearchQuality = MainAPIKt.getQualityFromString(element4?.text())
            val element5 = emptyList.get(2) as Element
            if (element5 != null && element5.text().also { text3 = it } != null && StringsKt.trim(
                    text3 as CharSequence?
                ).toString().also { obj3 = it } != null) {
                num2 = StringsKt.toIntOrNull(obj3)
            }
            searchQuality = qualityFromString
            num = num2
        }
        if (`contains$default`) {
            Intrinsics.checkNotNullExpressionValue(title, "title")
            return MovieSearchResponse(
                title,
                fixUrl,
                name,
                TvType.Movie,
                attr2,
                num,
                null,
                searchQuality,
                null,
                320,
                null
            )
        }
        Intrinsics.checkNotNullExpressionValue(title, "title")
        return TvSeriesSearchResponse(
            title,
            fixUrl,
            name,
            TvType.Movie,
            attr2,
            num,
            null,
            null,
            searchQuality,
            null,
            640,
            null
        )
    }

    /* compiled from: SflixProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001+B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J5\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\rJ1\u0010\u000e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000c\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J+\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0018Jo\u0010\u0019\u001a\u0004\u0018\u00010\u0015*\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00042\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00150\u001c2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00150\u001c2\u0006\u0010 \u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001cH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\"J\u000c\u0010#\u001a\u00020\b*\u0004\u0018\u00010\u0004J0\u0010$\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010%*\u00020&2\u0006\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0002J\u000e\u0010)\u001a\u0004\u0018\u00010\u001d*\u00020*H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SflixProvider\$Companion;", "", "()V", "generateTimeStamp", "", "getUpdatedData", "Lkotlin/Pair;", "Lcom/lagradost/cloudstream3/movieproviders/SflixProvider\$Companion\$PollingData;", "", "response", "Lcom/lagradost/nicehttp/NiceResponse;", "data", "baseUrl", "(Lcom/lagradost/nicehttp/NiceResponse;Lcom/lagradost/cloudstream3/movieproviders/SflixProvider\$Companion\$PollingData;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initPolling", "extractorData", "referer", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "negotiateNewSid", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runSflixExtractorVerifierJob", "", "api", "Lcom/lagradost/cloudstream3/MainAPI;", "(Lcom/lagradost/cloudstream3/MainAPI;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "extractRabbitStream", "url", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "useSidAuthentication", "nameTransformer", "(Lcom/lagradost/cloudstream3/MainAPI;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isValidServer", "toExtractorLink", "", "Lcom/lagradost/cloudstream3/movieproviders/SflixProvider\$Sources;", "caller", "name", "toSubtitleFile", "Lcom/lagradost/cloudstream3/movieproviders/SflixProvider\$Tracks;", "PollingData", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        /* compiled from: SflixProvider.kt */
        @Metadata(
            m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000bJB\u0010\u0016\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000c\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000c\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"],
            m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SflixProvider\$Companion\$PollingData;", "", "sid", "", "upgrades", "Ljava/util/ArrayList;", "pingInterval", "", "pingTimeout", "(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getPingInterval", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPingTimeout", "getSid", "()Ljava/lang/String;", "getUpgrades", "()Ljava/util/ArrayList;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/lagradost/cloudstream3/movieproviders/SflixProvider\$Companion\$PollingData;", "equals", "", "other", "hashCode", "toString", "app_release"],
            m106k = 1,
            m105mv = [1, 6, 0],
            m103xi = 48
        ) /* loaded from: classes3.dex */
        class PollingData(
            @JsonProperty("sid") str: String?,
            @JsonProperty("upgrades") upgrades: ArrayList<String?>,
            @JsonProperty("pingInterval") num: Integer?,
            @JsonProperty("pingTimeout") num2: Integer?
        ) {
            private val pingInterval: Integer?
            private val pingTimeout: Integer?
            val sid: String?
            private val upgrades: ArrayList<String>
            operator fun component1(): String? {
                return sid
            }

            operator fun component2(): ArrayList<String> {
                return upgrades
            }

            operator fun component3(): Integer? {
                return pingInterval
            }

            operator fun component4(): Integer? {
                return pingTimeout
            }

            fun copy(
                @JsonProperty("sid") str: String?,
                @JsonProperty("upgrades") upgrades: ArrayList<String?>,
                @JsonProperty("pingInterval") num: Integer?,
                @JsonProperty("pingTimeout") num2: Integer?
            ): PollingData {
                Intrinsics.checkNotNullParameter(upgrades, "upgrades")
                return PollingData(str, upgrades, num, num2)
            }

            override fun equals(obj: Object): Boolean {
                if (this === obj) {
                    return true
                }
                if (obj is PollingData) {
                    val pollingData = obj as PollingData
                    return Intrinsics.areEqual(sid, pollingData.sid) && Intrinsics.areEqual(
                        upgrades, pollingData.upgrades
                    ) && Intrinsics.areEqual(
                        pingInterval, pollingData.pingInterval
                    ) && Intrinsics.areEqual(
                        pingTimeout, pollingData.pingTimeout
                    )
                }
                return false
            }

            override fun hashCode(): Int {
                val str = sid
                val hashCode: Int = ((str?.hashCode() ?: 0) * 31 + upgrades.hashCode()) * 31
                val num: Integer? = pingInterval
                val hashCode2: Int = (hashCode + if (num == null) 0 else num.hashCode()) * 31
                val num2: Integer? = pingTimeout
                return hashCode2 + if (num2 != null) num2.hashCode() else 0
            }

            override fun toString(): String {
                return "PollingData(sid=" + sid + ", upgrades=" + upgrades + ", pingInterval=" + pingInterval + ", pingTimeout=" + pingTimeout + ')'
            }

            init {
                Intrinsics.checkNotNullParameter(upgrades, "upgrades")
                sid = str
                this.upgrades = upgrades
                pingInterval = num
                pingTimeout = num2
            }

            @JvmOverloads
                    /* synthetic */   constructor(
                str: String? = null,
                arrayList: ArrayList? = null,
                num: Integer? = null,
                num2: Integer? = null,
                i: Int = 15,
                defaultConstructorMarker: DefaultConstructorMarker? = null
            ) : this(
                if (i and 1 != 0) null else str,
                if (i and 2 != 0) ArrayList() else arrayList,
                if (i and 4 != 0) null else num,
                if (i and 8 != 0) null else num2
            ) {
            }

            fun getUpgrades(): ArrayList<String> {
                return upgrades
            }

            fun getPingInterval(): Integer? {
                return pingInterval
            }

            fun getPingTimeout(): Integer? {
                return pingTimeout
            }

            companion object {
                /* JADX WARN: Multi-variable type inference failed */
                fun  /* synthetic */`copy$default`(
                    pollingData: PollingData,
                    str: String?,
                    arrayList: ArrayList,
                    num: Integer?,
                    num2: Integer?,
                    i: Int,
                    obj: Object?
                ): PollingData {
                    var str = str
                    var arrayList: ArrayList = arrayList
                    var num: Integer? = num
                    var num2: Integer? = num2
                    if (i and 1 != 0) {
                        str = pollingData.sid
                    }
                    if (i and 2 != 0) {
                        arrayList = pollingData.upgrades
                    }
                    if (i and 4 != 0) {
                        num = pollingData.pingInterval
                    }
                    if (i and 8 != 0) {
                        num2 = pollingData.pingTimeout
                    }
                    return pollingData.copy(str, arrayList, num, num2)
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        fun generateTimeStamp(): String {
            var unixTimeMS: Long = APIHolder.INSTANCE.unixTimeMS
            var str = ""
            while (unixTimeMS > 0) {
                val sb = StringBuilder()
                sb.append(str)
                val j: Long = 64
                sb.append(
                    "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz-_".charAt(
                        (unixTimeMS % j).toInt()
                    )
                )
                str = sb.toString()
                unixTimeMS /= j
            }
            return StringsKt.reversed(str as CharSequence).toString()
        }

        /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */ /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */ /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */ /* JADX WARN: Removed duplicated region for block: B:26:0x00da A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:27:0x00db  */ /* JADX WARN: Removed duplicated region for block: B:31:0x00f2 A[RETURN] */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00ec -> B:13:0x003c). Please submit an issue!!! */ /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        fun negotiateNewSid(r26: String?, r27: Continuation<in PollingData?>?): Any {
            /*
                Method dump skipped, instructions count: 244
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.SflixProvider.Companion.negotiateNewSid(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
        }

        /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */ /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        fun getUpdatedData(
            r6: NiceResponse?,
            r7: PollingData?,
            r8: String?,
            r9: Continuation<in Tuples<PollingData?, Boolean?>?>?
        ): Any {
            /*
                r5 = this;
                boolean r0 = r9 instanceof com.lagradost.cloudstream3.movieproviders.SflixProvider$Companion$getUpdatedData$1
                if (r0 == 0) goto L14
                r0 = r9
                com.lagradost.cloudstream3.movieproviders.SflixProvider$Companion$getUpdatedData$1 r0 = (com.lagradost.cloudstream3.movieproviders.SflixProvider$Companion$getUpdatedData$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r9 = r0.label
                int r9 = r9 - r2
                r0.label = r9
                goto L19
            L14:
                com.lagradost.cloudstream3.movieproviders.SflixProvider$Companion$getUpdatedData$1 r0 = new com.lagradost.cloudstream3.movieproviders.SflixProvider$Companion$getUpdatedData$1
                r0.<init>(r5, r9)
            L19:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 != r4) goto L30
                java.lang.Object r6 = r0.L$0
                r7 = r6
                com.lagradost.cloudstream3.movieproviders.SflixProvider$Companion$PollingData r7 = (com.lagradost.cloudstream3.movieproviders.SflixProvider.Companion.PollingData) r7
                kotlin.ResultKt.throwOnFailure(r9)
                goto L50
            L30:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L38:
                kotlin.ResultKt.throwOnFailure(r9)
                okhttp3.Response r6 = r6.getOkhttpResponse()
                boolean r6 = r6.isSuccessful()
                if (r6 != 0) goto L67
                r0.L$0 = r7
                r0.label = r4
                java.lang.Object r9 = r5.negotiateNewSid(r8, r0)
                if (r9 != r1) goto L50
                return r1
            L50:
                com.lagradost.cloudstream3.movieproviders.SflixProvider$Companion$PollingData r9 = (com.lagradost.cloudstream3.movieproviders.SflixProvider.Companion.PollingData) r9
                if (r9 == 0) goto L5e
                java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.boxing.boxBoolean(r4)
                kotlin.Pair r6 = kotlin.TuplesKt.m100to(r9, r6)
                if (r6 != 0) goto L66
            L5e:
                java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.boxing.boxBoolean(r3)
                kotlin.Pair r6 = kotlin.TuplesKt.m100to(r7, r6)
            L66:
                return r6
            L67:
                java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.boxing.boxBoolean(r3)
                kotlin.Pair r6 = kotlin.TuplesKt.m100to(r7, r6)
                return r6
            */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.SflixProvider.Companion.getUpdatedData(com.lagradost.nicehttp.NiceResponse, com.lagradost.cloudstream3.movieproviders.SflixProvider\$Companion\$PollingData, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
        }

        /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */ /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */ /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */ /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */ /* JADX WARN: Removed duplicated region for block: B:34:0x01a4 A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:35:0x01a5  */ /* JADX WARN: Removed duplicated region for block: B:38:0x0220 A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:39:0x0221  */ /* JADX WARN: Removed duplicated region for block: B:42:0x0233  */ /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        fun initPolling(
            r32: String?,
            r33: String?,
            r34: Continuation<in Tuples<PollingData?, String?>?>?
        ): Any {
            /*
                Method dump skipped, instructions count: 571
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.SflixProvider.Companion.initPolling(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */ /* JADX WARN: Removed duplicated region for block: B:22:0x0142  */ /* JADX WARN: Removed duplicated region for block: B:32:0x0189  */ /* JADX WARN: Removed duplicated region for block: B:43:0x01cc  */ /* JADX WARN: Removed duplicated region for block: B:45:0x01d1  */ /* JADX WARN: Removed duplicated region for block: B:51:0x0210  */ /* JADX WARN: Removed duplicated region for block: B:52:0x0215  */ /* JADX WARN: Removed duplicated region for block: B:55:0x026d A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:56:0x026e  */ /* JADX WARN: Removed duplicated region for block: B:59:0x0286  */ /* JADX WARN: Removed duplicated region for block: B:60:0x028b  */ /* JADX WARN: Removed duplicated region for block: B:63:0x02b3 A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:64:0x02b4  */ /* JADX WARN: Removed duplicated region for block: B:67:0x0347 A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:68:0x0348  */ /* JADX WARN: Removed duplicated region for block: B:71:0x0381  */ /* JADX WARN: Removed duplicated region for block: B:76:0x03b7  */ /* JADX WARN: Removed duplicated region for block: B:81:0x03d9  */ /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.Object] */ /* JADX WARN: Type inference failed for: r10v2, types: [com.lagradost.cloudstream3.movieproviders.SflixProvider$Companion$PollingData, T] */ /* JADX WARN: Type inference failed for: r3v9, types: [T, java.lang.String] */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x03a5 -> B:75:0x03ae). Please submit an issue!!! */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x03b7 -> B:41:0x01c8). Please submit an issue!!! */ /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        fun runSflixExtractorVerifierJob(
            r43: MainAPI?,
            r44: String?,
            r45: String?,
            r46: Continuation<in Unit>?
        ): Any {
            /*
                Method dump skipped, instructions count: 993
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.SflixProvider.Companion.runSflixExtractorVerifierJob(com.lagradost.cloudstream3.MainAPI, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
        }

        fun isValidServer(str: String?): Boolean {
            val str2: String?
            val listOf: List = CollectionsKt.listOf<Object>(
                *arrayOf(
                    "upcloud",
                    "vidcloud",
                    "streamlare"
                ) as Array<Object>
            )
            if (str != null) {
                val ROOT: Locale = Locale.ROOT
                Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT")
                str2 = str.toLowerCase(ROOT)
                Intrinsics.checkNotNullExpressionValue(
                    str2,
                    "this as java.lang.String).toLowerCase(locale)"
                )
            } else {
                str2 = null
            }
            return CollectionsKt.contains(listOf, str2)
        }

        /* JADX INFO: Access modifiers changed from: private */
        fun toExtractorLink(
            sources: Sources,
            mainAPI: MainAPI,
            str: String,
            str2: String?
        ): List<ExtractorLink>? {
            val file = sources.file
            if (file != null) {
                val path: String = URI(sources.file).getPath()
                Intrinsics.checkNotNullExpressionValue(path, "URI(this.file).path")
                val z = false
                if (if (StringsKt.`endsWith$default`(
                            path,
                            ".m3u8",
                            false,
                            2,
                            null as Object?
                        ) || StringsKt.equals(sources.type, "hls", true)
                    ) true else true
                ) {
                    val m3u8Generation: List<M3u8Stream> = M3u8Helper().m3u8Generation(
                        M3u8Stream(sources.file, null, null, 4, null),
                        null
                    )
                    val arrayList =
                        ArrayList(CollectionsKt.collectionSizeOrDefault(m3u8Generation, 10))
                    for (m3u8Stream in m3u8Generation) {
                        val name: String = mainAPI.name
                        val str3: String = mainAPI.name + ' ' + str
                        val streamUrl: String = m3u8Stream.streamUrl
                        val mainUrl: String = mainAPI.mainUrl
                        val quality: Integer = m3u8Stream.getQuality()
                        arrayList.add(
                            ExtractorLink(
                                name,
                                str3,
                                streamUrl,
                                mainUrl,
                                ExtractorApiKt.getQualityFromName(if (quality != null) quality.toString() else null),
                                true,
                                null,
                                str2,
                                64,
                                null
                            )
                        )
                    }
                    return arrayList
                }
                return CollectionsKt.listOf<ExtractorLink>(
                    ExtractorLink(
                        mainAPI.name,
                        mainAPI.name,
                        file,
                        mainAPI.mainUrl,
                        ExtractorApiKt.getQualityFromName(sources.label),
                        false,
                        null,
                        str2,
                        64,
                        null
                    )
                )
            }
            return null
        }

        /* JADX INFO: Access modifiers changed from: private */
        fun toSubtitleFile(tracks: Tracks): SubtitleFile? {
            val file = tracks.file
            if (file != null) {
                var label = tracks.label
                if (label == null) {
                    label = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN
                }
                return SubtitleFile(label, file, null, 4, null)
            }
            return null
        }

        fun extractRabbitStream(
            mainAPI: MainAPI?,
            str: String?,
            function1: Function1<SubtitleFile?, Unit>?,
            function12: Function1<ExtractorLink?, Unit>?,
            z: Boolean,
            str2: String?,
            function13: Function1<String?, String?>?,
            continuation: Continuation<in Unit>?
        ): Object {
            return ArchComponentExt.suspendSafeApiCall<Unit>(
                `SflixProvider$Companion$extractRabbitStream$2`(
                    str,
                    mainAPI,
                    z,
                    str2,
                    function1,
                    function13,
                    function12,
                    null
                ),
                continuation
            )
        }

        companion object {
            fun  /* synthetic */`toExtractorLink$default`(
                companion: SflixProvider.Companion,
                sources: Sources,
                mainAPI: MainAPI,
                str: String,
                str2: String?,
                i: Int,
                obj: Object?
            ): List? {
                var str2 = str2
                if (i and 4 != 0) {
                    str2 = null
                }
                return companion.toExtractorLink(sources, mainAPI, str, str2)
            }
        }
    }

    companion object {
        @kotlin.jvm.JvmField
        val Companion = Companion(null)

        /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */ /* JADX WARN: Removed duplicated region for block: B:21:0x00be  */ /* JADX WARN: Removed duplicated region for block: B:29:0x0131  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
        fun  /* synthetic */`getMainPage$suspendImpl`(
            r24: SflixProvider?,
            r25: Continuation<*>?
        ): Any {
            /*
            Method dump skipped, instructions count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.SflixProvider.getMainPage\$suspendImpl(com.lagradost.cloudstream3.movieproviders.SflixProvider, kotlin.coroutines.Continuation):java.lang.Object")
        }

        /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */ /* JADX WARN: Removed duplicated region for block: B:21:0x00b9  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
        fun  /* synthetic */`search$suspendImpl`(
            r19: SflixProvider?,
            r20: String?,
            r21: Continuation<*>?
        ): Any {
            /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.SflixProvider.search\$suspendImpl(com.lagradost.cloudstream3.movieproviders.SflixProvider, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
        }

        /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Removed duplicated region for block: B:103:0x036e  */ /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */ /* JADX WARN: Removed duplicated region for block: B:112:0x03a4  */ /* JADX WARN: Removed duplicated region for block: B:116:0x03ca  */ /* JADX WARN: Removed duplicated region for block: B:132:0x044d  */ /* JADX WARN: Removed duplicated region for block: B:136:0x0460  */ /* JADX WARN: Removed duplicated region for block: B:143:0x0536  */ /* JADX WARN: Removed duplicated region for block: B:170:0x05ff  */ /* JADX WARN: Removed duplicated region for block: B:180:0x06d1  */ /* JADX WARN: Removed duplicated region for block: B:183:0x0702  */ /* JADX WARN: Removed duplicated region for block: B:18:0x00e3  */ /* JADX WARN: Removed duplicated region for block: B:210:0x0450 A[SYNTHETIC] */ /* JADX WARN: Removed duplicated region for block: B:24:0x014b  */ /* JADX WARN: Removed duplicated region for block: B:48:0x01d5  */ /* JADX WARN: Type inference failed for: r0v18, types: [java.util.List] */ /* JADX WARN: Type inference failed for: r0v22, types: [java.util.List] */ /* JADX WARN: Type inference failed for: r2v23, types: [T] */ /* JADX WARN: Type inference failed for: r2v30, types: [java.util.List, T] */ /* JADX WARN: Type inference failed for: r2v33, types: [java.util.List, T] */ /* JADX WARN: Type inference failed for: r2v45 */ /* JADX WARN: Type inference failed for: r2v46 */ /* JADX WARN: Type inference failed for: r7v1 */ /* JADX WARN: Type inference failed for: r7v2, types: [T] */ /* JADX WARN: Type inference failed for: r7v36 */ /* JADX WARN: Type inference failed for: r7v37, types: [T] */ /* JADX WARN: Type inference failed for: r7v48 */ /* JADX WARN: Type inference failed for: r7v49 */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
        fun  /* synthetic */`load$suspendImpl`(
            r59: SflixProvider?,
            r60: String?,
            r61: Continuation<*>?
        ): Any {
            /*
            Method dump skipped, instructions count: 1802
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.SflixProvider.load\$suspendImpl(com.lagradost.cloudstream3.movieproviders.SflixProvider, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
        }

        /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */ /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */ /* JADX WARN: Removed duplicated region for block: B:27:0x0108  */ /* JADX WARN: Removed duplicated region for block: B:40:0x0170  */ /* JADX WARN: Removed duplicated region for block: B:47:0x0191  */ /* JADX WARN: Removed duplicated region for block: B:48:0x0198  */ /* JADX WARN: Removed duplicated region for block: B:50:0x019b  */ /* JADX WARN: Removed duplicated region for block: B:53:0x01aa  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
        fun  /* synthetic */`loadLinks$suspendImpl`(
            r25: SflixProvider?,
            r26: String?,
            r27: Boolean,
            r28: Function1<*, *>?,
            r29: Function1<*, *>?,
            r30: Continuation<*>?
        ): Any {
            /*
            Method dump skipped, instructions count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.SflixProvider.loadLinks\$suspendImpl(com.lagradost.cloudstream3.movieproviders.SflixProvider, java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
        }

        fun  /* synthetic */`extractorVerifierJob$suspendImpl`(
            sflixProvider: SflixProvider?,
            str: String?,
            continuation: Continuation<*>?
        ): Object {
            val runSflixExtractorVerifierJob: Object =
                SflixProvider.Companion.Companion.runSflixExtractorVerifierJob(
                    sflixProvider,
                    str,
                    "https://rabbitstream.net/",
                    continuation
                )
            return if (runSflixExtractorVerifierJob === IntrinsicsKt.getCOROUTINE_SUSPENDED()) runSflixExtractorVerifierJob else Unit.INSTANCE
        }
    }
}