package com.lagradost.cloudstream3.syncproviders

import java.util.List
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: SyncAPI.kt */
@Metadata(
    m108d1 = ["\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0004\u0016\u0017\u0018\u0019J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H&J\u001b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u001b\u0010\u000c\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ!\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J!\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"],
    m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/SyncAPI;", "Lcom/lagradost/cloudstream3/syncproviders/OAuth2API;", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "getIdFromUrl", "url", "getResult", "Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncResult;", "id", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStatus", "Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncStatus;", "score", "", "status", "(Ljava/lang/String;Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "", "Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncSearchResult;", "name", "SyncNextAiring", "SyncResult", "SyncSearchResult", "SyncStatus", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
interface SyncAPI : OAuth2API {
    fun getIdFromUrl(str: String?): String
    val mainUrl: String
    fun getResult(str: String?, continuation: Continuation<in SyncResult?>?): Object?
    fun getStatus(str: String?, continuation: Continuation<in SyncStatus?>?): Object?
    fun score(
        str: String?,
        syncStatus: SyncStatus,
        continuation: Continuation<in Boolean?>?
    ): Object

    fun search(str: String?, continuation: Continuation<in List<SyncSearchResult?>?>?): Object?

    /* compiled from: SyncAPI.kt */
    @Metadata(
        m108d1 = ["\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b'\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u0014J~\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020\u000fHÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R(\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0012\"\u0004\b%\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0012¨\u0006<"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncSearchResult;", "Lcom/lagradost/cloudstream3/SearchResponse;", "name", "", "apiName", "syncId", "url", "posterUrl", "type", "Lcom/lagradost/cloudstream3/TvType;", "quality", "Lcom/lagradost/cloudstream3/SearchQuality;", "posterHeaders", "", "id", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Lcom/lagradost/cloudstream3/SearchQuality;Ljava/util/Map;Ljava/lang/Integer;)V", "getApiName", "()Ljava/lang/String;", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getName", "getPosterHeaders", "()Ljava/util/Map;", "setPosterHeaders", "(Ljava/util/Map;)V", "getPosterUrl", "setPosterUrl", "(Ljava/lang/String;)V", "getQuality", "()Lcom/lagradost/cloudstream3/SearchQuality;", "setQuality", "(Lcom/lagradost/cloudstream3/SearchQuality;)V", "getSyncId", "setSyncId", "getType", "()Lcom/lagradost/cloudstream3/TvType;", "setType", "(Lcom/lagradost/cloudstream3/TvType;)V", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Lcom/lagradost/cloudstream3/SearchQuality;Ljava/util/Map;Ljava/lang/Integer;)Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncSearchResult;", "equals", "", "other", "", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class SyncSearchResult(
        name: String,
        apiName: String,
        syncId: String,
        url: String,
        str: String?,
        tvType: TvType?,
        searchQuality: SearchQuality?,
        map: Map<String, String>?,
        num: Integer?
    ) : SearchResponse {
        // com.lagradost.cloudstream3.SearchResponse
        @get:Override
        val apiName: String

        /* renamed from: id */
        private var f9991id: Integer?

        // com.lagradost.cloudstream3.SearchResponse
        @get:Override
        val name: String

        // com.lagradost.cloudstream3.SearchResponse
        // com.lagradost.cloudstream3.SearchResponse
        @get:Override
        @set:Override
        var posterHeaders: Map<String, String>?

        // com.lagradost.cloudstream3.SearchResponse
        // com.lagradost.cloudstream3.SearchResponse
        @get:Override
        @set:Override
        var posterUrl: String?
        private var quality: SearchQuality?
        private var syncId: String
        private var type: TvType?

        // com.lagradost.cloudstream3.SearchResponse
        @get:Override
        val url: String
        operator fun component1(): String {
            return name
        }

        operator fun component2(): String {
            return apiName
        }

        operator fun component3(): String {
            return syncId
        }

        operator fun component4(): String {
            return url
        }

        operator fun component5(): String? {
            return posterUrl
        }

        operator fun component6(): TvType? {
            return getType()
        }

        operator fun component7(): SearchQuality? {
            return getQuality()
        }

        operator fun component8(): Map<String, String>? {
            return posterHeaders
        }

        operator fun component9(): Integer? {
            return id
        }

        fun copy(
            name: String,
            apiName: String,
            syncId: String,
            url: String,
            str: String?,
            tvType: TvType?,
            searchQuality: SearchQuality?,
            map: Map<String, String>?,
            num: Integer?
        ): SyncSearchResult {
            Intrinsics.checkNotNullParameter(name, "name")
            Intrinsics.checkNotNullParameter(apiName, "apiName")
            Intrinsics.checkNotNullParameter(syncId, "syncId")
            Intrinsics.checkNotNullParameter(url, "url")
            return SyncSearchResult(
                name,
                apiName,
                syncId,
                url,
                str,
                tvType,
                searchQuality,
                map,
                num
            )
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is SyncSearchResult) {
                val syncSearchResult = obj as SyncSearchResult
                return Intrinsics.areEqual(name, syncSearchResult.name) && Intrinsics.areEqual(
                    apiName, syncSearchResult.apiName
                ) && Intrinsics.areEqual(syncId, syncSearchResult.syncId) && Intrinsics.areEqual(
                    url, syncSearchResult.url
                ) && Intrinsics.areEqual(
                    posterUrl, syncSearchResult.posterUrl
                ) && getType() === syncSearchResult.getType() && getQuality() === syncSearchResult.getQuality() && Intrinsics.areEqual(
                    posterHeaders, syncSearchResult.posterHeaders
                ) && Intrinsics.areEqual(id, syncSearchResult.id)
            }
            return false
        }

        override fun hashCode(): Int {
            return (((((((name.hashCode() * 31 + apiName.hashCode()) * 31 + syncId.hashCode()) * 31 + url.hashCode()) * 31 + if (posterUrl == null) 0 else posterUrl!!.hashCode()) * 31 + if (getType() == null) 0 else getType().hashCode()) * 31 + if (getQuality() == null) 0 else getQuality().hashCode()) * 31 + if (posterHeaders == null) 0 else posterHeaders!!.hashCode()) * 31 + if (id != null) id.hashCode() else 0
        }

        override fun toString(): String {
            return "SyncSearchResult(name=" + name + ", apiName=" + apiName + ", syncId=" + syncId + ", url=" + url + ", posterUrl=" + posterUrl + ", type=" + getType() + ", quality=" + getQuality() + ", posterHeaders=" + posterHeaders + ", id=" + id + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(name, "name")
            Intrinsics.checkNotNullParameter(apiName, "apiName")
            Intrinsics.checkNotNullParameter(syncId, "syncId")
            Intrinsics.checkNotNullParameter(url, "url")
            this.name = name
            this.apiName = apiName
            this.syncId = syncId
            this.url = url
            posterUrl = str
            type = tvType
            quality = searchQuality
            posterHeaders = map
            f9991id = num
        }

        /* synthetic */   constructor(
            str: String,
            str2: String,
            str3: String,
            str4: String,
            str5: String?,
            tvType: TvType?,
            searchQuality: SearchQuality?,
            map: Map?,
            num: Integer?,
            i: Int,
            defaultConstructorMarker: DefaultConstructorMarker?
        ) : this(
            str,
            str2,
            str3,
            str4,
            str5,
            if (i and 32 != 0) null else tvType,
            if (i and 64 != 0) null else searchQuality,
            if (i and 128 != 0) null else map,
            if (i and 256 != 0) null else num
        ) {
        }

        fun getSyncId(): String {
            return syncId
        }

        fun setSyncId(str: String) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            syncId = str
        }

        @Override // com.lagradost.cloudstream3.SearchResponse
        override fun getType(): TvType? {
            return type
        }

        @Override // com.lagradost.cloudstream3.SearchResponse
        override fun setType(tvType: TvType?) {
            type = tvType
        }

        @Override // com.lagradost.cloudstream3.SearchResponse
        override fun getQuality(): SearchQuality? {
            return quality
        }

        @Override // com.lagradost.cloudstream3.SearchResponse
        override fun setQuality(searchQuality: SearchQuality?) {
            quality = searchQuality
        }

        // com.lagradost.cloudstream3.SearchResponse
        // com.lagradost.cloudstream3.SearchResponse
        @get:Override
        @set:Override
        var id: Integer?
            // com.lagradost.cloudstream3.SearchResponse
            get() = f9991id
            set(num) {
                f9991id = num
            }
    }

    /* compiled from: SyncAPI.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000c\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncNextAiring;", "", "episode", "", "unixTime", "", "(IJ)V", "getEpisode", "()I", "getUnixTime", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class SyncNextAiring(val episode: Int, val unixTime: Long) {
        operator fun component1(): Int {
            return episode
        }

        operator fun component2(): Long {
            return unixTime
        }

        fun copy(i: Int, j: Long): SyncNextAiring {
            return SyncNextAiring(i, j)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is SyncNextAiring) {
                val syncNextAiring = obj as SyncNextAiring
                return episode == syncNextAiring.episode && unixTime == syncNextAiring.unixTime
            }
            return false
        }

        override fun hashCode(): Int {
            return episode * 31 + `C$r8$backportedMethods$utility$Long$1$hashCode`.hashCode(unixTime)
        }

        override fun toString(): String {
            return "SyncNextAiring(episode=" + episode + ", unixTime=" + unixTime + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                syncNextAiring: SyncNextAiring,
                i: Int,
                j: Long,
                i2: Int,
                obj: Object?
            ): SyncNextAiring {
                var i = i
                var j = j
                if (i2 and 1 != 0) {
                    i = syncNextAiring.episode
                }
                if (i2 and 2 != 0) {
                    j = syncNextAiring.unixTime
                }
                return syncNextAiring.copy(i, j)
            }
        }
    }

    /* compiled from: SyncAPI.kt */
    @Metadata(
        m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJH\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0006\u0010\n\"\u0004\b\u000b\u0010\u000cR\u001e\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0016\u0010\u000f¨\u0006#"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncStatus;", "", "status", "", "score", "watchedEpisodes", "isFavorite", "", "maxEpisodes", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "()Ljava/lang/Boolean;", "setFavorite", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getMaxEpisodes", "()Ljava/lang/Integer;", "setMaxEpisodes", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getScore", "getStatus", "()I", "getWatchedEpisodes", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncStatus;", "equals", "other", "hashCode", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class SyncStatus(val status: Int, num: Integer, num2: Integer, bool: Boolean?, num3: Integer?) {
        var isFavorite: Boolean?
        private var maxEpisodes: Integer?
        private val score: Integer
        private val watchedEpisodes: Integer
        operator fun component1(): Int {
            return status
        }

        operator fun component2(): Integer {
            return score
        }

        operator fun component3(): Integer {
            return watchedEpisodes
        }

        operator fun component4(): Boolean? {
            return isFavorite
        }

        operator fun component5(): Integer? {
            return maxEpisodes
        }

        fun copy(i: Int, num: Integer, num2: Integer, bool: Boolean?, num3: Integer?): SyncStatus {
            return SyncStatus(i, num, num2, bool, num3)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is SyncStatus) {
                val syncStatus = obj as SyncStatus
                return status == syncStatus.status && Intrinsics.areEqual(
                    score,
                    syncStatus.score
                ) && Intrinsics.areEqual(
                    watchedEpisodes, syncStatus.watchedEpisodes
                ) && Intrinsics.areEqual(
                    isFavorite, syncStatus.isFavorite
                ) && Intrinsics.areEqual(
                    maxEpisodes, syncStatus.maxEpisodes
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val i = status * 31
            val num: Integer = score
            val hashCode: Int = (i + if (num == null) 0 else num.hashCode()) * 31
            val num2: Integer = watchedEpisodes
            val hashCode2: Int = (hashCode + if (num2 == null) 0 else num2.hashCode()) * 31
            val bool = isFavorite
            val hashCode3 = (hashCode2 + (bool?.hashCode() ?: 0)) * 31
            val num3: Integer? = maxEpisodes
            return hashCode3 + if (num3 != null) num3.hashCode() else 0
        }

        override fun toString(): String {
            return "SyncStatus(status=" + status + ", score=" + score + ", watchedEpisodes=" + watchedEpisodes + ", isFavorite=" + isFavorite + ", maxEpisodes=" + maxEpisodes + ')'
        }

        init {
            score = num
            watchedEpisodes = num2
            isFavorite = bool
            maxEpisodes = num3
        }

        /* synthetic */   constructor(
            i: Int,
            num: Integer,
            num2: Integer,
            bool: Boolean?,
            num3: Integer?,
            i2: Int,
            defaultConstructorMarker: DefaultConstructorMarker?
        ) : this(
            i,
            num,
            num2,
            if (i2 and 8 != 0) null else bool,
            if (i2 and 16 != 0) null else num3
        ) {
        }

        fun getScore(): Integer {
            return score
        }

        fun getWatchedEpisodes(): Integer {
            return watchedEpisodes
        }

        fun getMaxEpisodes(): Integer? {
            return maxEpisodes
        }

        fun setMaxEpisodes(num: Integer?) {
            maxEpisodes = num
        }

        companion object {
            @kotlin.jvm.JvmStatic
            fun  /* synthetic */`copy$default`(
                syncStatus: SyncStatus,
                i: Int,
                num: Integer,
                num2: Integer,
                bool: Boolean?,
                num3: Integer?,
                i2: Int,
                obj: Object?
            ): SyncStatus {
                var i = i
                var num: Integer = num
                var num2: Integer = num2
                var bool = bool
                var num3: Integer? = num3
                if (i2 and 1 != 0) {
                    i = syncStatus.status
                }
                if (i2 and 2 != 0) {
                    num = syncStatus.score
                }
                val num4: Integer = num
                if (i2 and 4 != 0) {
                    num2 = syncStatus.watchedEpisodes
                }
                val num5: Integer = num2
                if (i2 and 8 != 0) {
                    bool = syncStatus.isFavorite
                }
                val bool2 = bool
                if (i2 and 16 != 0) {
                    num3 = syncStatus.maxEpisodes
                }
                return syncStatus.copy(i, num4, num5, bool2, num3)
            }
        }
    }

    /* compiled from: SyncAPI.kt */
    @Metadata(
        m108d1 = ["\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bY\b\u0086\b\u0018\u00002\u00020\u0001B\u009b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001b\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u000f¢\u0006\u0002\u0010 J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\u0011\u0010^\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0003J\u0011\u0010_\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010a\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010;J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010d\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010e\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u00103J\u0011\u0010f\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u000fHÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u0010\u0010h\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010i\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u0011\u0010j\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u000fHÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010l\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010m\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0011\u0010q\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0003J¦\u0002\u0010r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u000f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010sJ\u0013\u0010t\u001a\u00020\u00142\b\u0010u\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010v\u001a\u00020\u0005HÖ\u0001J\t\u0010w\u001a\u00020\u0003HÖ\u0001R\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\$R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u00101\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u00106\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\"\"\u0004\b8\u0010\$R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010*\"\u0004\b:\u0010,R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u0010\n\u0002\u0010>\u001a\u0004\b\u0013\u0010;\"\u0004\b<\u0010=R\u001c\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010*\"\u0004\bH\u0010,R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010D\"\u0004\bJ\u0010FR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u00101\u001a\u0004\bK\u0010.\"\u0004\bL\u00100R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\"\"\u0004\bN\u0010\$R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u00106\u001a\u0004\bO\u00103\"\u0004\bP\u00105R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\"\"\u0004\bR\u0010\$R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\"\"\u0004\bT\u0010\$R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010*\"\u0004\bV\u0010,R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010*\"\u0004\bX\u0010,R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u00101\u001a\u0004\bY\u0010.\"\u0004\bZ\u00100R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010*\"\u0004\b\\\u0010,¨\u0006x"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncResult;", "", "id", "", "totalEpisodes", "", "title", "publicScore", TypedValues.TransitionType.S_DURATION, "synopsis", "airStatus", "Lcom/lagradost/cloudstream3/ShowStatus;", "nextAiring", "Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncNextAiring;", "studio", "", "genres", "synonyms", "trailerUrl", "isAdult", "", "posterUrl", "backgroundPosterUrl", "startDate", "", "endDate", "recommendations", "Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncSearchResult;", "nextSeason", "prevSeason", "actors", "Lcom/lagradost/cloudstream3/ActorData;", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/lagradost/cloudstream3/ShowStatus;Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncNextAiring;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncSearchResult;Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncSearchResult;Ljava/util/List;)V", "getActors", "()Ljava/util/List;", "setActors", "(Ljava/util/List;)V", "getAirStatus", "()Lcom/lagradost/cloudstream3/ShowStatus;", "setAirStatus", "(Lcom/lagradost/cloudstream3/ShowStatus;)V", "getBackgroundPosterUrl", "()Ljava/lang/String;", "setBackgroundPosterUrl", "(Ljava/lang/String;)V", "getDuration", "()Ljava/lang/Integer;", "setDuration", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getEndDate", "()Ljava/lang/Long;", "setEndDate", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getGenres", "setGenres", "getId", "setId", "()Ljava/lang/Boolean;", "setAdult", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getNextAiring", "()Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncNextAiring;", "setNextAiring", "(Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncNextAiring;)V", "getNextSeason", "()Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncSearchResult;", "setNextSeason", "(Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncSearchResult;)V", "getPosterUrl", "setPosterUrl", "getPrevSeason", "setPrevSeason", "getPublicScore", "setPublicScore", "getRecommendations", "setRecommendations", "getStartDate", "setStartDate", "getStudio", "setStudio", "getSynonyms", "setSynonyms", "getSynopsis", "setSynopsis", "getTitle", "setTitle", "getTotalEpisodes", "setTotalEpisodes", "getTrailerUrl", "setTrailerUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/lagradost/cloudstream3/ShowStatus;Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncNextAiring;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncSearchResult;Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncSearchResult;Ljava/util/List;)Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncResult;", "equals", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class SyncResult(
        id: String,
        num: Integer?,
        str: String?,
        num2: Integer?,
        num3: Integer?,
        str2: String?,
        showStatus: ShowStatus?,
        syncNextAiring: SyncNextAiring?,
        list: List<String>?,
        list2: List<String>?,
        list3: List<String>?,
        str3: String?,
        bool: Boolean?,
        str4: String?,
        str5: String?,
        l: Long?,
        l2: Long?,
        list4: List<SyncSearchResult>?,
        syncSearchResult: SyncSearchResult?,
        syncSearchResult2: SyncSearchResult?,
        list5: List<ActorData>?
    ) {
        private var actors: List<ActorData>?
        private var airStatus: ShowStatus?
        var backgroundPosterUrl: String?
        private var duration: Integer?
        var endDate: Long?
        var genres: List<String>?

        /* renamed from: id */
        private var f9990id: String
        var isAdult: Boolean?
        var nextAiring: SyncNextAiring?
        var nextSeason: SyncSearchResult?
        var posterUrl: String?
        var prevSeason: SyncSearchResult?
        private var publicScore: Integer?
        var recommendations: List<SyncSearchResult>?
        var startDate: Long?
        var studio: List<String>?
        var synonyms: List<String>?
        var synopsis: String?
        var title: String?
        private var totalEpisodes: Integer?
        var trailerUrl: String?
        operator fun component1(): String {
            return f9990id
        }

        operator fun component10(): List<String>? {
            return genres
        }

        operator fun component11(): List<String>? {
            return synonyms
        }

        operator fun component12(): String? {
            return trailerUrl
        }

        operator fun component13(): Boolean? {
            return isAdult
        }

        operator fun component14(): String? {
            return posterUrl
        }

        operator fun component15(): String? {
            return backgroundPosterUrl
        }

        operator fun component16(): Long? {
            return startDate
        }

        operator fun component17(): Long? {
            return endDate
        }

        operator fun component18(): List<SyncSearchResult>? {
            return recommendations
        }

        operator fun component19(): SyncSearchResult? {
            return nextSeason
        }

        operator fun component2(): Integer? {
            return totalEpisodes
        }

        operator fun component20(): SyncSearchResult? {
            return prevSeason
        }

        operator fun component21(): List<ActorData>? {
            return actors
        }

        operator fun component3(): String? {
            return title
        }

        operator fun component4(): Integer? {
            return publicScore
        }

        operator fun component5(): Integer? {
            return duration
        }

        operator fun component6(): String? {
            return synopsis
        }

        operator fun component7(): ShowStatus? {
            return airStatus
        }

        operator fun component8(): SyncNextAiring? {
            return nextAiring
        }

        operator fun component9(): List<String>? {
            return studio
        }

        fun copy(
            id: String,
            num: Integer?,
            str: String?,
            num2: Integer?,
            num3: Integer?,
            str2: String?,
            showStatus: ShowStatus?,
            syncNextAiring: SyncNextAiring?,
            list: List<String>?,
            list2: List<String>?,
            list3: List<String>?,
            str3: String?,
            bool: Boolean?,
            str4: String?,
            str5: String?,
            l: Long?,
            l2: Long?,
            list4: List<SyncSearchResult>?,
            syncSearchResult: SyncSearchResult?,
            syncSearchResult2: SyncSearchResult?,
            list5: List<ActorData>?
        ): SyncResult {
            Intrinsics.checkNotNullParameter(id, "id")
            return SyncResult(
                id,
                num,
                str,
                num2,
                num3,
                str2,
                showStatus,
                syncNextAiring,
                list,
                list2,
                list3,
                str3,
                bool,
                str4,
                str5,
                l,
                l2,
                list4,
                syncSearchResult,
                syncSearchResult2,
                list5
            )
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is SyncResult) {
                val syncResult = obj as SyncResult
                return Intrinsics.areEqual(f9990id, syncResult.f9990id) && Intrinsics.areEqual(
                    totalEpisodes, syncResult.totalEpisodes
                ) && Intrinsics.areEqual(
                    title, syncResult.title
                ) && Intrinsics.areEqual(
                    publicScore,
                    syncResult.publicScore
                ) && Intrinsics.areEqual(
                    duration, syncResult.duration
                ) && Intrinsics.areEqual(
                    synopsis, syncResult.synopsis
                ) && airStatus === syncResult.airStatus && Intrinsics.areEqual(
                    nextAiring, syncResult.nextAiring
                ) && Intrinsics.areEqual(
                    studio, syncResult.studio
                ) && Intrinsics.areEqual(genres, syncResult.genres) && Intrinsics.areEqual(
                    synonyms, syncResult.synonyms
                ) && Intrinsics.areEqual(
                    trailerUrl, syncResult.trailerUrl
                ) && Intrinsics.areEqual(
                    isAdult, syncResult.isAdult
                ) && Intrinsics.areEqual(
                    posterUrl, syncResult.posterUrl
                ) && Intrinsics.areEqual(
                    backgroundPosterUrl, syncResult.backgroundPosterUrl
                ) && Intrinsics.areEqual(
                    startDate, syncResult.startDate
                ) && Intrinsics.areEqual(
                    endDate, syncResult.endDate
                ) && Intrinsics.areEqual(
                    recommendations, syncResult.recommendations
                ) && Intrinsics.areEqual(
                    nextSeason, syncResult.nextSeason
                ) && Intrinsics.areEqual(
                    prevSeason, syncResult.prevSeason
                ) && Intrinsics.areEqual(
                    actors, syncResult.actors
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val hashCode = f9990id.hashCode() * 31
            val num: Integer? = totalEpisodes
            val hashCode2: Int = (hashCode + if (num == null) 0 else num.hashCode()) * 31
            val str = title
            val hashCode3 = (hashCode2 + (str?.hashCode() ?: 0)) * 31
            val num2: Integer? = publicScore
            val hashCode4: Int = (hashCode3 + if (num2 == null) 0 else num2.hashCode()) * 31
            val num3: Integer? = duration
            val hashCode5: Int = (hashCode4 + if (num3 == null) 0 else num3.hashCode()) * 31
            val str2 = synopsis
            val hashCode6 = (hashCode5 + (str2?.hashCode() ?: 0)) * 31
            val showStatus: ShowStatus? = airStatus
            val hashCode7: Int =
                (hashCode6 + if (showStatus == null) 0 else showStatus.hashCode()) * 31
            val syncNextAiring = nextAiring
            val hashCode8 = (hashCode7 + (syncNextAiring?.hashCode() ?: 0)) * 31
            val list = studio
            val hashCode9 = (hashCode8 + (list?.hashCode() ?: 0)) * 31
            val list2 = genres
            val hashCode10 = (hashCode9 + (list2?.hashCode() ?: 0)) * 31
            val list3 = synonyms
            val hashCode11 = (hashCode10 + (list3?.hashCode() ?: 0)) * 31
            val str3 = trailerUrl
            val hashCode12 = (hashCode11 + (str3?.hashCode() ?: 0)) * 31
            val bool = isAdult
            val hashCode13 = (hashCode12 + (bool?.hashCode() ?: 0)) * 31
            val str4 = posterUrl
            val hashCode14 = (hashCode13 + (str4?.hashCode() ?: 0)) * 31
            val str5 = backgroundPosterUrl
            val hashCode15 = (hashCode14 + (str5?.hashCode() ?: 0)) * 31
            val l = startDate
            val hashCode16 = (hashCode15 + (l?.hashCode() ?: 0)) * 31
            val l2 = endDate
            val hashCode17 = (hashCode16 + (l2?.hashCode() ?: 0)) * 31
            val list4 = recommendations
            val hashCode18 = (hashCode17 + (list4?.hashCode() ?: 0)) * 31
            val syncSearchResult = nextSeason
            val hashCode19 = (hashCode18 + (syncSearchResult?.hashCode() ?: 0)) * 31
            val syncSearchResult2 = prevSeason
            val hashCode20 = (hashCode19 + (syncSearchResult2?.hashCode() ?: 0)) * 31
            val list5: List<ActorData>? = actors
            return hashCode20 + (list5?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "SyncResult(id=" + f9990id + ", totalEpisodes=" + totalEpisodes + ", title=" + title + ", publicScore=" + publicScore + ", duration=" + duration + ", synopsis=" + synopsis + ", airStatus=" + airStatus + ", nextAiring=" + nextAiring + ", studio=" + studio + ", genres=" + genres + ", synonyms=" + synonyms + ", trailerUrl=" + trailerUrl + ", isAdult=" + isAdult + ", posterUrl=" + posterUrl + ", backgroundPosterUrl=" + backgroundPosterUrl + ", startDate=" + startDate + ", endDate=" + endDate + ", recommendations=" + recommendations + ", nextSeason=" + nextSeason + ", prevSeason=" + prevSeason + ", actors=" + actors + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(id, "id")
            f9990id = id
            totalEpisodes = num
            title = str
            publicScore = num2
            duration = num3
            synopsis = str2
            airStatus = showStatus
            nextAiring = syncNextAiring
            studio = list
            genres = list2
            synonyms = list3
            trailerUrl = str3
            isAdult = bool
            posterUrl = str4
            backgroundPosterUrl = str5
            startDate = l
            endDate = l2
            recommendations = list4
            nextSeason = syncSearchResult
            prevSeason = syncSearchResult2
            actors = list5
        }

        /* synthetic */   constructor(
            str: String,
            num: Integer?,
            str2: String?,
            num2: Integer?,
            num3: Integer?,
            str3: String?,
            showStatus: ShowStatus?,
            syncNextAiring: SyncNextAiring?,
            list: List?,
            list2: List?,
            list3: List?,
            str4: String?,
            bool: Boolean?,
            str5: String?,
            str6: String?,
            l: Long?,
            l2: Long?,
            list4: List?,
            syncSearchResult: SyncSearchResult?,
            syncSearchResult2: SyncSearchResult?,
            list5: List?,
            i: Int,
            defaultConstructorMarker: DefaultConstructorMarker?
        ) : this(
            str,
            if (i and 2 != 0) null else num,
            if (i and 4 != 0) null else str2,
            if (i and 8 != 0) null else num2,
            if (i and 16 != 0) null else num3,
            if (i and 32 != 0) null else str3,
            if (i and 64 != 0) null else showStatus,
            if (i and 128 != 0) null else syncNextAiring,
            if (i and 256 != 0) null else list,
            if (i and 512 != 0) null else list2,
            if (i and 1024 != 0) null else list3,
            if (i and 2048 != 0) null else str4,
            if (i and 4096 != 0) null else bool,
            if (i and 8192 != 0) null else str5,
            if (i and 16384 != 0) null else str6,
            if (i and 32768 != 0) null else l,
            if (i and 65536 != 0) null else l2,
            if (i and 131072 != 0) null else list4,
            if (i and 262144 != 0) null else syncSearchResult,
            if (i and 524288 != 0) null else syncSearchResult2,
            if (i and 1048576 == 0) list5 else null
        ) {
        }

        var id: String
            get() = f9990id
            set(str) {
                Intrinsics.checkNotNullParameter(str, "<set-?>")
                f9990id = str
            }

        fun getTotalEpisodes(): Integer? {
            return totalEpisodes
        }

        fun setTotalEpisodes(num: Integer?) {
            totalEpisodes = num
        }

        fun getPublicScore(): Integer? {
            return publicScore
        }

        fun setPublicScore(num: Integer?) {
            publicScore = num
        }

        fun getDuration(): Integer? {
            return duration
        }

        fun setDuration(num: Integer?) {
            duration = num
        }

        fun getAirStatus(): ShowStatus? {
            return airStatus
        }

        fun setAirStatus(showStatus: ShowStatus?) {
            airStatus = showStatus
        }

        fun getActors(): List<ActorData>? {
            return actors
        }

        fun setActors(list: List<ActorData>?) {
            actors = list
        }
    }
}