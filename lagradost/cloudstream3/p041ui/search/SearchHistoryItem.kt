package com.lagradost.cloudstream3.p041ui.search

import java.util.List
import kotlin.jvm.internal.Intrinsics

/* compiled from: SearchHistoryAdaptor.kt */
@Metadata(
    m108d1 = ["\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0003\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/search/SearchHistoryItem;", "", "searchedAt", "", "searchText", "", "type", "", "Lcom/lagradost/cloudstream3/TvType;", SDKConstants.PARAM_KEY, "(JLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getSearchText", "getSearchedAt", "()J", "getType", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.search.SearchHistoryItem */ /* loaded from: classes4.dex */
class SearchHistoryItem constructor(
    @JsonProperty("searchedAt") j: Long,
    @JsonProperty("searchText") searchText: String,
    @JsonProperty("type") type: List<TvType>,
    @JsonProperty("key") key: String
) {
    val key: String
    val searchText: String
    val searchedAt: Long
    private val type: List<TvType>
    operator fun component1(): Long {
        return searchedAt
    }

    operator fun component2(): String {
        return searchText
    }

    operator fun component3(): List<TvType> {
        return type
    }

    operator fun component4(): String {
        return key
    }

    fun copy(
        @JsonProperty("searchedAt") j: Long,
        @JsonProperty("searchText") searchText: String,
        @JsonProperty("type") type: List<TvType>,
        @JsonProperty("key") key: String
    ): SearchHistoryItem {
        Intrinsics.checkNotNullParameter(searchText, "searchText")
        Intrinsics.checkNotNullParameter(type, "type")
        Intrinsics.checkNotNullParameter(key, "key")
        return SearchHistoryItem(j, searchText, type, key)
    }

    override fun equals(obj: Object): Boolean {
        if (this === obj) {
            return true
        }
        if (obj is SearchHistoryItem) {
            val searchHistoryItem: SearchHistoryItem = obj
            return (searchedAt == searchHistoryItem.searchedAt) && Intrinsics.areEqual(
                searchText, searchHistoryItem.searchText
            ) && Intrinsics.areEqual(
                type, searchHistoryItem.type
            ) && Intrinsics.areEqual(key, searchHistoryItem.key)
        }
        return false
    }

    override fun hashCode(): Int {
        return (((((`C$r8$backportedMethods$utility$Long$1$hashCode`.hashCode(searchedAt) * 31) + searchText.hashCode()) * 31) + type.hashCode()) * 31) + key.hashCode()
    }

    override fun toString(): String {
        return "SearchHistoryItem(searchedAt=" + searchedAt + ", searchText=" + searchText + ", type=" + type + ", key=" + key + ')'
    }

    /* JADX WARN: Multi-variable type inference failed */
    init {
        Intrinsics.checkNotNullParameter(searchText, "searchText")
        Intrinsics.checkNotNullParameter(type, "type")
        Intrinsics.checkNotNullParameter(key, "key")
        searchedAt = j
        this.searchText = searchText
        this.type = type
        this.key = key
    }

    fun getType(): List<TvType> {
        return type
    }

    companion object {
        fun  /* synthetic */`copy$default`(
            searchHistoryItem: SearchHistoryItem,
            j: Long,
            str: String,
            list: List,
            str2: String,
            i: Int,
            obj: Object?
        ): SearchHistoryItem {
            var j: Long = j
            var str: String = str
            var str2: String = str2
            if ((i and 1) != 0) {
                j = searchHistoryItem.searchedAt
            }
            val j2: Long = j
            if ((i and 2) != 0) {
                str = searchHistoryItem.searchText
            }
            val str3: String = str
            var list2: List<TvType?> = list
            if ((i and 4) != 0) {
                list2 = searchHistoryItem.type
            }
            val list3: List = list2
            if ((i and 8) != 0) {
                str2 = searchHistoryItem.key
            }
            return searchHistoryItem.copy(j2, str3, list3, str2)
        }
    }
}