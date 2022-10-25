package com.lagradost.cloudstream3.movieproviders

import android.util.Log
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: TwoEmbedProvider.kt */
@Metadata(
    m108d1 = ["\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJI\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001a0!2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001a0!H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010%R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000c\u0010\u0006\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TwoEmbedProvider;", "Lcom/lagradost/cloudstream3/metaproviders/TmdbProvider;", "()V", "apiName", "", "getApiName", "()Ljava/lang/String;", "instantLinkLoading", "", "getInstantLinkLoading", "()Z", "mainUrl", "getMainUrl", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "useMetaLoadResponse", "getUseMetaLoadResponse", "extractorVerifierJob", "", "extractorData", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "EmbedJson", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class TwoEmbedProvider : TmdbProvider() {
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val instantLinkLoading = false

    // com.lagradost.cloudstream3.metaproviders.TmdbProvider
    @get:Override
    val apiName = "2Embed"

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var name = "2Embed"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var mainUrl = "https://www.2embed.to"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.metaproviders.TmdbProvider
    @get:Override
    val useMetaLoadResponse = true

    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    val supportedTypes: Set<TvType> =
        SetsKt.setOf<Object>(*arrayOf<TvType>(TvType.Movie, TvType.TvSeries) as Array<Object>)

    /* compiled from: TwoEmbedProvider.kt */
    @Metadata(
        m108d1 = ["\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003JC\u0010\u0013\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00062\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000cR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000cR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/TwoEmbedProvider\$EmbedJson;", "", "type", "", "link", "sources", "", "tracks", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getLink", "()Ljava/lang/String;", "getSources", "()Ljava/util/List;", "getTracks", "getType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class EmbedJson(
        @JsonProperty("type") str: String,
        @JsonProperty("link") link: String,
        @JsonProperty("sources") sources: List<String>,
        @JsonProperty("tracks") list: List<String>
    ) {
        val link: String
        val sources: List<String>
        val tracks: List<String>
        val type: String
        operator fun component1(): String {
            return type
        }

        operator fun component2(): String {
            return link
        }

        operator fun component3(): List<String> {
            return sources
        }

        operator fun component4(): List<String> {
            return tracks
        }

        fun copy(
            @JsonProperty("type") str: String,
            @JsonProperty("link") link: String,
            @JsonProperty("sources") sources: List<String>,
            @JsonProperty("tracks") list: List<String>
        ): EmbedJson {
            Intrinsics.checkNotNullParameter(link, "link")
            Intrinsics.checkNotNullParameter(sources, "sources")
            return EmbedJson(str, link, sources, list)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is EmbedJson) {
                val embedJson = obj as EmbedJson
                return Intrinsics.areEqual(type, embedJson.type) && Intrinsics.areEqual(
                    link, embedJson.link
                ) && Intrinsics.areEqual(sources, embedJson.sources) && Intrinsics.areEqual(
                    tracks, embedJson.tracks
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val str = type
            val hashCode =
                (((str?.hashCode() ?: 0) * 31 + link.hashCode()) * 31 + sources.hashCode()) * 31
            val list = tracks
            return hashCode + (list?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "EmbedJson(type=" + type + ", link=" + link + ", sources=" + sources + ", tracks=" + tracks + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(link, "link")
            Intrinsics.checkNotNullParameter(sources, "sources")
            type = str
            this.link = link
            this.sources = sources
            tracks = list
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                embedJson: EmbedJson,
                str: String,
                str2: String,
                list: List,
                list2: List,
                i: Int,
                obj: Object?
            ): EmbedJson {
                var str = str
                var str2 = str2
                var list: List = list
                var list2: List = list2
                if (i and 1 != 0) {
                    str = embedJson.type
                }
                if (i and 2 != 0) {
                    str2 = embedJson.link
                }
                if (i and 4 != 0) {
                    list = embedJson.sources
                }
                if (i and 8 != 0) {
                    list2 = embedJson.tracks
                }
                return embedJson.copy(str, str2, list, list2)
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */ /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */ /* JADX WARN: Removed duplicated region for block: B:42:0x01ab A[LOOP:0: B:40:0x01a5->B:42:0x01ab, LOOP_END] */
    @Override // com.lagradost.cloudstream3.MainAPI
            /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */    fun loadLinks(
        r25: String?,
        r26: Boolean,
        r27: Function1<SubtitleFile?, Unit>?,
        r28: Function1<ExtractorLink?, Unit>?,
        r29: Continuation<in Boolean?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.TwoEmbedProvider.loadLinks(java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
    }

    @Override // com.lagradost.cloudstream3.MainAPI
    override fun extractorVerifierJob(str: String?, continuation: Continuation<in Unit>?): Object {
        val name = name
        Log.d(name, "Starting $name job!")
        val runSflixExtractorVerifierJob: Object =
            SflixProvider.Companion.Companion.runSflixExtractorVerifierJob(
                this,
                str,
                "https://rabbitstream.net/",
                continuation
            )
        return if (runSflixExtractorVerifierJob === IntrinsicsKt.getCOROUTINE_SUSPENDED()) runSflixExtractorVerifierJob else Unit.INSTANCE
    }
}