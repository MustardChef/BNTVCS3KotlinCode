package com.lagradost.cloudstream3.p041ui.search

import java.util.List
import kotlin.jvm.internal.Intrinsics

/* compiled from: SyncSearchViewModel.kt */
@Metadata(
    m108d1 = ["\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/search/SyncSearchViewModel;", "", "()V", "repos", "", "Lcom/lagradost/cloudstream3/syncproviders/SyncRepo;", "SyncSearchResultSearchResponse", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.search.SyncSearchViewModel */ /* loaded from: classes4.dex */
class SyncSearchViewModel constructor() {
    private val repos: List<SyncRepo> = AccountManager.Companion.syncApis

    /* compiled from: SyncSearchViewModel.kt */
    @Metadata(
        m108d1 = ["\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010.\u001a\u0004\u0018\u00010\u000cHÆ\u0003J\u0017\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0003Jt\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u00101J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u00020\nHÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0011¨\u00068"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/search/SyncSearchViewModel\$SyncSearchResultSearchResponse;", "Lcom/lagradost/cloudstream3/SearchResponse;", "name", "", "url", "apiName", "type", "Lcom/lagradost/cloudstream3/TvType;", "posterUrl", "id", "", "quality", "Lcom/lagradost/cloudstream3/SearchQuality;", "posterHeaders", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/String;Ljava/lang/Integer;Lcom/lagradost/cloudstream3/SearchQuality;Ljava/util/Map;)V", "getApiName", "()Ljava/lang/String;", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getName", "getPosterHeaders", "()Ljava/util/Map;", "setPosterHeaders", "(Ljava/util/Map;)V", "getPosterUrl", "setPosterUrl", "(Ljava/lang/String;)V", "getQuality", "()Lcom/lagradost/cloudstream3/SearchQuality;", "setQuality", "(Lcom/lagradost/cloudstream3/SearchQuality;)V", "getType", "()Lcom/lagradost/cloudstream3/TvType;", "setType", "(Lcom/lagradost/cloudstream3/TvType;)V", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/String;Ljava/lang/Integer;Lcom/lagradost/cloudstream3/SearchQuality;Ljava/util/Map;)Lcom/lagradost/cloudstream3/ui/search/SyncSearchViewModel\$SyncSearchResultSearchResponse;", "equals", "", "other", "", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.search.SyncSearchViewModel$SyncSearchResultSearchResponse */ /* loaded from: classes4.dex */
    class SyncSearchResultSearchResponse constructor(
        name: String,
        url: String,
        apiName: String,
        tvType: TvType?,
        str: String?,
        num: Integer?,
        searchQuality: SearchQuality?,
        map: Map<String, String>?
    ) : SearchResponse {
        // com.lagradost.cloudstream3.SearchResponse
        @get:Override
        val apiName: String

        /* renamed from: id */
        private var f10023id: Integer?

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
        private var type: TvType?

        // com.lagradost.cloudstream3.SearchResponse
        @get:Override
        val url: String
        operator fun component1(): String {
            return name
        }

        operator fun component2(): String {
            return url
        }

        operator fun component3(): String {
            return apiName
        }

        operator fun component4(): TvType? {
            return getType()
        }

        operator fun component5(): String? {
            return posterUrl
        }

        operator fun component6(): Integer? {
            return id
        }

        operator fun component7(): SearchQuality? {
            return getQuality()
        }

        operator fun component8(): Map<String, String>? {
            return posterHeaders
        }

        fun copy(
            name: String,
            url: String,
            apiName: String,
            tvType: TvType?,
            str: String?,
            num: Integer?,
            searchQuality: SearchQuality?,
            map: Map<String, String>?
        ): SyncSearchResultSearchResponse {
            Intrinsics.checkNotNullParameter(name, "name")
            Intrinsics.checkNotNullParameter(url, "url")
            Intrinsics.checkNotNullParameter(apiName, "apiName")
            return SyncSearchResultSearchResponse(
                name,
                url,
                apiName,
                tvType,
                str,
                num,
                searchQuality,
                map
            )
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is SyncSearchResultSearchResponse) {
                val syncSearchResultSearchResponse: SyncSearchResultSearchResponse = obj
                return Intrinsics.areEqual(
                    name,
                    syncSearchResultSearchResponse.name
                ) && Intrinsics.areEqual(
                    url, syncSearchResultSearchResponse.url
                ) && Intrinsics.areEqual(
                    apiName, syncSearchResultSearchResponse.apiName
                ) && (getType() === syncSearchResultSearchResponse.getType()) && Intrinsics.areEqual(
                    posterUrl, syncSearchResultSearchResponse.posterUrl
                ) && Intrinsics.areEqual(
                    id,
                    syncSearchResultSearchResponse.id
                ) && (getQuality() === syncSearchResultSearchResponse.getQuality()) && Intrinsics.areEqual(
                    posterHeaders, syncSearchResultSearchResponse.posterHeaders
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return (((((((((((((name.hashCode() * 31) + url.hashCode()) * 31) + apiName.hashCode()) * 31) + (if (getType() == null) 0 else getType().hashCode())) * 31) + (if (posterUrl == null) 0 else posterUrl!!.hashCode())) * 31) + (if (id == null) 0 else id.hashCode())) * 31) + (if (getQuality() == null) 0 else getQuality().hashCode())) * 31) + (if (posterHeaders != null) posterHeaders!!.hashCode() else 0)
        }

        override fun toString(): String {
            return "SyncSearchResultSearchResponse(name=" + name + ", url=" + url + ", apiName=" + apiName + ", type=" + getType() + ", posterUrl=" + posterUrl + ", id=" + id + ", quality=" + getQuality() + ", posterHeaders=" + posterHeaders + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(name, "name")
            Intrinsics.checkNotNullParameter(url, "url")
            Intrinsics.checkNotNullParameter(apiName, "apiName")
            this.name = name
            this.url = url
            this.apiName = apiName
            type = tvType
            posterUrl = str
            f10023id = num
            quality = searchQuality
            posterHeaders = map
        }

        /* synthetic */   constructor(
            str: String,
            str2: String,
            str3: String,
            tvType: TvType?,
            str4: String?,
            num: Integer?,
            searchQuality: SearchQuality?,
            map: Map?,
            i: Int,
            defaultConstructorMarker: DefaultConstructorMarker?
        ) : this(
            str,
            str2,
            str3,
            tvType,
            str4,
            num,
            if ((i and 64) != 0) null else searchQuality,
            if ((i and 128) != 0) null else map
        ) {
        }

        @Override // com.lagradost.cloudstream3.SearchResponse
        public override fun getType(): TvType? {
            return type
        }

        @Override // com.lagradost.cloudstream3.SearchResponse
        public override fun setType(tvType: TvType?) {
            type = tvType
        }

        // com.lagradost.cloudstream3.SearchResponse
        // com.lagradost.cloudstream3.SearchResponse
        @get:Override
        @set:Override
        var id: Integer?
            // com.lagradost.cloudstream3.SearchResponse
            get() {
                return f10023id
            }
            set(num) {
                f10023id = num
            }

        @Override // com.lagradost.cloudstream3.SearchResponse
        public override fun getQuality(): SearchQuality? {
            return quality
        }

        @Override // com.lagradost.cloudstream3.SearchResponse
        public override fun setQuality(searchQuality: SearchQuality?) {
            quality = searchQuality
        }
    }
}