package com.lagradost.cloudstream3.movieproviders

import java.util.List
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: SoaptwoDayProvider.kt */
@Metadata(
    m108d1 = ["\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002./B\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0019\u001a\u00020\u001aH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u000cH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJI\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u000c2\u0006\u0010\"\u001a\u00020\u00042\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&0\$H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010)J\u001f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010-\u001a\u00020\u000cH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u000cX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u000cX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u00060"],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SoaptwoDayProvider;", "Lcom/lagradost/cloudstream3/MainAPI;", "()V", "hasChromecastSupport", "", "getHasChromecastSupport", "()Z", "hasDownloadSupport", "getHasDownloadSupport", "hasMainPage", "getHasMainPage", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "getMainPage", "Lcom/lagradost/cloudstream3/HomePageResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "", "Lcom/lagradost/cloudstream3/SearchResponse;", "query", "ServerJson", "Subs", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class SoaptwoDayProvider : MainAPI() {
    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var mainUrl = "https://secretlink.xyz"
        // com.lagradost.cloudstream3.MainAPI
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.MainAPI
    // com.lagradost.cloudstream3.MainAPI
    @get:Override
    @set:Override
    var name = "Soap2Day"
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
    val supportedTypes: Set<TvType> =
        SetsKt.setOf<Object>(*arrayOf<TvType>(TvType.Movie, TvType.TvSeries) as Array<Object>)

    /* compiled from: SoaptwoDayProvider.kt */
    @Metadata(m106k = 3, m105mv = [1, 6, 0], m103xi = 48) /* loaded from: classes3.dex */
    /* synthetic */
    object WhenMappings {
        /* synthetic */ val `$EnumSwitchMapping$0`: IntArray

        init {
            val iArr = IntArray(TvType.values().size)
            com.lagradost.cloudstream3.movieproviders.iArr.get(TvType.TvSeries.ordinal()) = 1
            com.lagradost.cloudstream3.movieproviders.iArr.get(TvType.Movie.ordinal()) = 2
            `$EnumSwitchMapping$0` = com.lagradost.cloudstream3.movieproviders.iArr
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:22|(1:23)|24|25|26|27|(1:29)(8:31|13|14|(1:15)|18|19|20|(2:39|40)(0))) */ /* JADX WARN: Code restructure failed: missing block: B:36:0x01a9, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01aa, code lost:
        r14 = r23;
        r15 = r24;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */ /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */ /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */ /* JADX WARN: Removed duplicated region for block: B:31:0x0129 A[Catch: Exception -> 0x01a7, LOOP:0: B:29:0x0123->B:31:0x0129, LOOP_END, TryCatch #2 {Exception -> 0x01a7, blocks: (B:28:0x00ff, B:29:0x0123, B:31:0x0129, B:32:0x0193), top: B:47:0x00ff }] */ /* JADX WARN: Removed duplicated region for block: B:41:0x01bb  */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00f9 -> B:47:0x00ff). Please submit an issue!!! */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x01b4 -> B:19:0x00a5). Please submit an issue!!! */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun getMainPage(r30: Continuation<in HomePageResponse?>?): Any? {
        /*
            Method dump skipped, instructions count: 463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.SoaptwoDayProvider.getMainPage(kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */ /* JADX WARN: Removed duplicated region for block: B:21:0x00ab A[LOOP:0: B:19:0x00a5->B:21:0x00ab, LOOP_END] */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun search(
        r20: String?,
        r21: Continuation<in MutableList<out SearchResponse?>?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.SoaptwoDayProvider.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x02a6, code lost:
        if (r9 == null) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:110:0x02b8  */ /* JADX WARN: Removed duplicated region for block: B:111:0x02bb  */ /* JADX WARN: Removed duplicated region for block: B:114:0x02c9  */ /* JADX WARN: Removed duplicated region for block: B:117:0x02ff  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */ /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */ /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */ /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */ /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */ /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */ /* JADX WARN: Removed duplicated region for block: B:35:0x00ba  */ /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */ /* JADX WARN: Removed duplicated region for block: B:61:0x0145  */ /* JADX WARN: Removed duplicated region for block: B:79:0x01f3  */ /* JADX WARN: Removed duplicated region for block: B:99:0x028b  */
    @Override // com.lagradost.cloudstream3.MainAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun load(r42: String?, r43: Continuation<in LoadResponse?>?): Any {
        /*
            Method dump skipped, instructions count: 823
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.SoaptwoDayProvider.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* compiled from: SoaptwoDayProvider.kt */
    @Metadata(
        m108d1 = ["\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b(\b\u0086\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000cHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0098\u0001\u0010/\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u00020\u00052\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\tHÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017¨\u00065"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SoaptwoDayProvider\$ServerJson;", "", "zero", "", SDKConstants.PARAM_KEY, "", "stream", "streambackup", "pos", "", "type", "subs", "", "Lcom/lagradost/cloudstream3/movieproviders/SoaptwoDayProvider\$Subs;", "prevEpiTitle", "prevEpiUrl", "nextEpiTitle", "nextEpiUrl", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNextEpiTitle", "()Ljava/lang/String;", "getNextEpiUrl", "getPos", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPrevEpiTitle", "getPrevEpiUrl", "getStream", "getStreambackup", "getSubs", "()Ljava/util/List;", "getType", "getZero", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/lagradost/cloudstream3/movieproviders/SoaptwoDayProvider\$ServerJson;", "equals", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class ServerJson(
        @param:JsonProperty("0") val zero: String,
        @param:JsonProperty(
            "key"
        ) val key: Boolean,
        @param:JsonProperty("val") val stream: String,
        @param:JsonProperty("val_bak") val streambackup: String,
        @JsonProperty("pos") num: Integer,
        @JsonProperty("type") str4: String,
        @JsonProperty("subs") list: List<Subs>,
        @JsonProperty("prev_epi_title") str5: String,
        @JsonProperty("prev_epi_url") str6: String,
        @JsonProperty("next_epi_title") str7: String,
        @JsonProperty("next_epi_url") str8: String
    ) {
        val nextEpiTitle: String
        val nextEpiUrl: String
        private val pos: Integer
        val prevEpiTitle: String
        val prevEpiUrl: String
        val subs: List<Subs>
        val type: String
        operator fun component1(): String {
            return zero
        }

        operator fun component10(): String {
            return nextEpiTitle
        }

        operator fun component11(): String {
            return nextEpiUrl
        }

        operator fun component2(): Boolean {
            return key
        }

        operator fun component3(): String {
            return stream
        }

        operator fun component4(): String {
            return streambackup
        }

        operator fun component5(): Integer {
            return pos
        }

        operator fun component6(): String {
            return type
        }

        operator fun component7(): List<Subs> {
            return subs
        }

        operator fun component8(): String {
            return prevEpiTitle
        }

        operator fun component9(): String {
            return prevEpiUrl
        }

        fun copy(
            @JsonProperty("0") str: String,
            @JsonProperty("key") bool: Boolean,
            @JsonProperty("val") str2: String,
            @JsonProperty("val_bak") str3: String,
            @JsonProperty("pos") num: Integer,
            @JsonProperty("type") str4: String,
            @JsonProperty("subs") list: List<Subs>,
            @JsonProperty("prev_epi_title") str5: String,
            @JsonProperty("prev_epi_url") str6: String,
            @JsonProperty("next_epi_title") str7: String,
            @JsonProperty("next_epi_url") str8: String
        ): ServerJson {
            return ServerJson(str, bool, str2, str3, num, str4, list, str5, str6, str7, str8)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is ServerJson) {
                val serverJson = obj as ServerJson
                return Intrinsics.areEqual(zero, serverJson.zero) && Intrinsics.areEqual(
                    key, serverJson.key
                ) && Intrinsics.areEqual(stream, serverJson.stream) && Intrinsics.areEqual(
                    streambackup, serverJson.streambackup
                ) && Intrinsics.areEqual(
                    pos, serverJson.pos
                ) && Intrinsics.areEqual(type, serverJson.type) && Intrinsics.areEqual(
                    subs, serverJson.subs
                ) && Intrinsics.areEqual(
                    prevEpiTitle,
                    serverJson.prevEpiTitle
                ) && Intrinsics.areEqual(
                    prevEpiUrl, serverJson.prevEpiUrl
                ) && Intrinsics.areEqual(
                    nextEpiTitle, serverJson.nextEpiTitle
                ) && Intrinsics.areEqual(
                    nextEpiUrl, serverJson.nextEpiUrl
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val str = zero
            val hashCode = (str?.hashCode() ?: 0) * 31
            val bool = key
            val hashCode2 = (hashCode + (bool?.hashCode() ?: 0)) * 31
            val str2 = stream
            val hashCode3 = (hashCode2 + (str2?.hashCode() ?: 0)) * 31
            val str3 = streambackup
            val hashCode4 = (hashCode3 + (str3?.hashCode() ?: 0)) * 31
            val num: Integer = pos
            val hashCode5: Int = (hashCode4 + if (num == null) 0 else num.hashCode()) * 31
            val str4 = type
            val hashCode6 = (hashCode5 + (str4?.hashCode() ?: 0)) * 31
            val list = subs
            val hashCode7 = (hashCode6 + (list?.hashCode() ?: 0)) * 31
            val str5 = prevEpiTitle
            val hashCode8 = (hashCode7 + (str5?.hashCode() ?: 0)) * 31
            val str6 = prevEpiUrl
            val hashCode9 = (hashCode8 + (str6?.hashCode() ?: 0)) * 31
            val str7 = nextEpiTitle
            val hashCode10 = (hashCode9 + (str7?.hashCode() ?: 0)) * 31
            val str8 = nextEpiUrl
            return hashCode10 + (str8?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "ServerJson(zero=" + zero + ", key=" + key + ", stream=" + stream + ", streambackup=" + streambackup + ", pos=" + pos + ", type=" + type + ", subs=" + subs + ", prevEpiTitle=" + prevEpiTitle + ", prevEpiUrl=" + prevEpiUrl + ", nextEpiTitle=" + nextEpiTitle + ", nextEpiUrl=" + nextEpiUrl + ')'
        }

        init {
            pos = num
            type = str4
            subs = list
            prevEpiTitle = str5
            prevEpiUrl = str6
            nextEpiTitle = str7
            nextEpiUrl = str8
        }

        fun getPos(): Integer {
            return pos
        }
    }

    /* compiled from: SoaptwoDayProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000c\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010&\u001a\u00020\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0090\u0001\u0010)\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\t\u001a\u00020\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\t\u0010/\u001a\u00020\nHÖ\u0001R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u000c\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0017\u0010\u0011R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0018\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001d\u0010\u0011¨\u00060"],
        m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/SoaptwoDayProvider\$Subs;", "", "id", "", "movieId", "tvId", "episodeId", MonitorLogServerProtocol.DEFAULT_SAMPLE_RATES_KEY, "IsShow", "name", "", "path", "downlink", "sourceFileName", "createtime", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getIsShow", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCreatetime", "getDefault", "getDownlink", "()Ljava/lang/String;", "getEpisodeId", "getId", "getMovieId", "getName", "getPath", "getSourceFileName", "getTvId", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/lagradost/cloudstream3/movieproviders/SoaptwoDayProvider\$Subs;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Subs(
        @JsonProperty("id") num: Integer,
        @JsonProperty("movieId") num2: Integer,
        @JsonProperty("tvId") num3: Integer,
        @JsonProperty("episodeId") num4: Integer,
        @JsonProperty("default") num5: Integer,
        @JsonProperty("IsShow") num6: Integer,
        @JsonProperty("name") name: String,
        @JsonProperty("path") str: String,
        @JsonProperty("downlink") str2: String,
        @JsonProperty("source_file_name") str3: String,
        @JsonProperty("createtime") num7: Integer
    ) {
        private val IsShow: Integer
        private val createtime: Integer

        /* renamed from: default  reason: not valid java name */
        private val f10815default: Integer
        val downlink: String
        private val episodeId: Integer

        /* renamed from: id */
        private val f9972id: Integer
        private val movieId: Integer
        val name: String
        val path: String
        val sourceFileName: String
        private val tvId: Integer
        operator fun component1(): Integer {
            return f9972id
        }

        operator fun component10(): String {
            return sourceFileName
        }

        operator fun component11(): Integer {
            return createtime
        }

        operator fun component2(): Integer {
            return movieId
        }

        operator fun component3(): Integer {
            return tvId
        }

        operator fun component4(): Integer {
            return episodeId
        }

        operator fun component5(): Integer {
            return f10815default
        }

        operator fun component6(): Integer {
            return IsShow
        }

        operator fun component7(): String {
            return name
        }

        operator fun component8(): String {
            return path
        }

        operator fun component9(): String {
            return downlink
        }

        fun copy(
            @JsonProperty("id") num: Integer,
            @JsonProperty("movieId") num2: Integer,
            @JsonProperty("tvId") num3: Integer,
            @JsonProperty("episodeId") num4: Integer,
            @JsonProperty("default") num5: Integer,
            @JsonProperty("IsShow") num6: Integer,
            @JsonProperty("name") name: String,
            @JsonProperty("path") str: String,
            @JsonProperty("downlink") str2: String,
            @JsonProperty("source_file_name") str3: String,
            @JsonProperty("createtime") num7: Integer
        ): Subs {
            Intrinsics.checkNotNullParameter(name, "name")
            return Subs(num, num2, num3, num4, num5, num6, name, str, str2, str3, num7)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Subs) {
                val subs = obj as Subs
                return Intrinsics.areEqual(f9972id, subs.f9972id) && Intrinsics.areEqual(
                    movieId, subs.movieId
                ) && Intrinsics.areEqual(tvId, subs.tvId) && Intrinsics.areEqual(
                    episodeId, subs.episodeId
                ) && Intrinsics.areEqual(
                    f10815default, subs.f10815default
                ) && Intrinsics.areEqual(
                    IsShow, subs.IsShow
                ) && Intrinsics.areEqual(name, subs.name) && Intrinsics.areEqual(
                    path, subs.path
                ) && Intrinsics.areEqual(downlink, subs.downlink) && Intrinsics.areEqual(
                    sourceFileName, subs.sourceFileName
                ) && Intrinsics.areEqual(
                    createtime, subs.createtime
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val num: Integer = f9972id
            val hashCode = (if (num == null) 0 else num.hashCode()) * 31
            val num2: Integer = movieId
            val hashCode2: Int = (hashCode + if (num2 == null) 0 else num2.hashCode()) * 31
            val num3: Integer = tvId
            val hashCode3: Int = (hashCode2 + if (num3 == null) 0 else num3.hashCode()) * 31
            val num4: Integer = episodeId
            val hashCode4: Int = (hashCode3 + if (num4 == null) 0 else num4.hashCode()) * 31
            val num5: Integer = f10815default
            val hashCode5: Int = (hashCode4 + if (num5 == null) 0 else num5.hashCode()) * 31
            val num6: Integer = IsShow
            val hashCode6: Int =
                ((hashCode5 + if (num6 == null) 0 else num6.hashCode()) * 31 + name.hashCode()) * 31
            val str = path
            val hashCode7 = (hashCode6 + (str?.hashCode() ?: 0)) * 31
            val str2 = downlink
            val hashCode8 = (hashCode7 + (str2?.hashCode() ?: 0)) * 31
            val str3 = sourceFileName
            val hashCode9 = (hashCode8 + (str3?.hashCode() ?: 0)) * 31
            val num7: Integer = createtime
            return hashCode9 + if (num7 != null) num7.hashCode() else 0
        }

        override fun toString(): String {
            return "Subs(id=" + f9972id + ", movieId=" + movieId + ", tvId=" + tvId + ", episodeId=" + episodeId + ", default=" + f10815default + ", IsShow=" + IsShow + ", name=" + name + ", path=" + path + ", downlink=" + downlink + ", sourceFileName=" + sourceFileName + ", createtime=" + createtime + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(name, "name")
            f9972id = num
            movieId = num2
            tvId = num3
            episodeId = num4
            f10815default = num5
            IsShow = num6
            this.name = name
            path = str
            downlink = str2
            sourceFileName = str3
            createtime = num7
        }

        val id: Integer
            get() = f9972id

        fun getMovieId(): Integer {
            return movieId
        }

        fun getTvId(): Integer {
            return tvId
        }

        fun getEpisodeId(): Integer {
            return episodeId
        }

        val default: Integer
            get() = f10815default
        val isShow: Integer
            get() = IsShow

        fun getCreatetime(): Integer {
            return createtime
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(10:5|6|(1:(1:(6:10|11|(4:13|(5:16|(4:19|(2:23|24)|25|17)|28|29|14)|30|31)(1:45)|(1:44)|33|(9:35|(1:37)|38|(1:40)|11|(0)(0)|(0)|33|(2:42|43)(0))(0))(2:46|47))(1:48))(2:69|(1:71)(1:72))|49|(1:51)(1:68)|52|(1:54)(1:67)|55|56|57))|73|6|(0)(0)|49|(0)(0)|52|(0)(0)|55|56|57|(1:(6:59|60|(1:62)(1:64)|63|33|(0)(0)))) */ /* JADX WARN: Code restructure failed: missing block: B:30:0x0108, code lost:
        if (r6 != null) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */ /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */ /* JADX WARN: Removed duplicated region for block: B:22:0x00d6  */ /* JADX WARN: Removed duplicated region for block: B:23:0x00db  */ /* JADX WARN: Removed duplicated region for block: B:26:0x00e4  */ /* JADX WARN: Removed duplicated region for block: B:27:0x00e9  */ /* JADX WARN: Removed duplicated region for block: B:39:0x016d  */ /* JADX WARN: Removed duplicated region for block: B:47:0x02d8  */ /* JADX WARN: Removed duplicated region for block: B:61:0x035f  */ /* JADX WARN: Removed duplicated region for block: B:63:0x0364  */ /* JADX WARN: Removed duplicated region for block: B:64:0x0369  */ /* JADX WARN: Type inference failed for: r23v0 */ /* JADX WARN: Type inference failed for: r23v1 */ /* JADX WARN: Type inference failed for: r23v10 */ /* JADX WARN: Type inference failed for: r23v2, types: [boolean] */ /* JADX WARN: Type inference failed for: r23v3 */ /* JADX WARN: Type inference failed for: r23v4 */ /* JADX WARN: Type inference failed for: r23v5 */ /* JADX WARN: Type inference failed for: r4v10, types: [java.util.Collection] */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0269 -> B:45:0x026c). Please submit an issue!!! */
    @Override // com.lagradost.cloudstream3.MainAPI
            /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */    fun loadLinks(
        r48: String?,
        r49: Boolean,
        r50: Function1<SubtitleFile?, Unit>?,
        r51: Function1<ExtractorLink?, Unit>?,
        r52: Continuation<in Boolean?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 880
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.SoaptwoDayProvider.loadLinks(java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
    }
}