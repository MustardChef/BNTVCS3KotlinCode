package com.lagradost.cloudstream3.p041ui.search

import com.lagradost.cloudstream3.mvvm.Resource
import java.util.ArrayList
import kotlin.jvm.internal.Intrinsics

/* compiled from: SearchViewModel.kt */
@Metadata(
    m108d1 = ["\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0018\u001a\u00020\u0019J2\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001c2\u000c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020 H\u0002J2\u0010\"\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020 J\u0006\u0010#\u001a\u00020\u0013R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\r8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\n0\r8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000f¨\u0006$"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/search/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_currentHistory", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/lagradost/cloudstream3/ui/search/SearchHistoryItem;", "_currentSearch", "Lcom/lagradost/cloudstream3/ui/search/OnGoingSearch;", "_searchResponse", "Lcom/lagradost/cloudstream3/mvvm/Resource;", "Lcom/lagradost/cloudstream3/SearchResponse;", "currentHistory", "Landroidx/lifecycle/LiveData;", "getCurrentHistory", "()Landroidx/lifecycle/LiveData;", "currentSearch", "getCurrentSearch", "onGoingSearch", "Lkotlinx/coroutines/Job;", "repos", "Lcom/lagradost/cloudstream3/ui/APIRepository;", "searchResponse", "getSearchResponse", "clearSearch", "", "search", "query", "", "providersActive", "", "ignoreSettings", "", "isQuickSearch", "searchAndCancel", "updateHistory", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.search.SearchViewModel */ /* loaded from: classes4.dex */
class SearchViewModel constructor() : ViewModel() {
    private var onGoingSearch: Job? = null
    val repos: List<APIRepository>
    val _searchResponse: MutableLiveData<Resource<List<SearchResponse>>> =
        MutableLiveData<Resource<List<SearchResponse>>>()
    val _currentSearch: MutableLiveData<List<OnGoingSearch>> =
        MutableLiveData<List<OnGoingSearch>>()
    private val _currentHistory: MutableLiveData<List<SearchHistoryItem>> =
        MutableLiveData<List<SearchHistoryItem>>()

    init {
        val apis: List<MainAPI> = APIHolder.INSTANCE.apis
        val arrayList: ArrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(apis, 10))
        for (mainAPI: MainAPI? in apis) {
            arrayList.add(APIRepository(mainAPI, null, 2, null))
        }
        repos = arrayList
    }

    val searchResponse: LiveData<Resource<List<SearchResponse>>>
        get() {
            return _searchResponse
        }
    val currentSearch: LiveData<List<OnGoingSearch>>
        get() {
            return _currentSearch
        }
    val currentHistory: LiveData<List<SearchHistoryItem>>
        get() {
            return _currentHistory
        }

    fun clearSearch() {
        _searchResponse.postValue(Resource.Success<Any?>(ArrayList()))
        _currentSearch.postValue(CollectionsKt.emptyList<Any>())
    }

    fun searchAndCancel(query: String, providersActive: Set<String>, z: Boolean, z2: Boolean) {
        Intrinsics.checkNotNullParameter(query, "query")
        Intrinsics.checkNotNullParameter(providersActive, "providersActive")
        val job: Job? = onGoingSearch
        if (job != null) {
            Job.DefaultImpls.`cancel$default`(
                job,
                null as CancellationException?,
                1,
                null as Object?
            )
        }
        onGoingSearch = search(query, providersActive, z, z2)
    }

    fun updateHistory(): Job {
        val `launch$default`: Job
        `launch$default` = BuildersKt__Builders_commonKt.`launch$default`(
            ViewModelKt.getViewModelScope(this),
            null,
            null,
            `SearchViewModel$updateHistory$1`(this, null),
            3,
            null
        )
        return `launch$default`
    }

    private fun search(str: String, set: Set<String>, z: Boolean, z2: Boolean): Job {
        val `launch$default`: Job
        `launch$default` = BuildersKt__Builders_commonKt.`launch$default`(
            ViewModelKt.getViewModelScope(this),
            null,
            null,
            `SearchViewModel$search$1`(str, this, z2, z, set, null),
            3,
            null
        )
        return `launch$default`
    }

    companion object {
        /* JADX WARN: Multi-variable type inference failed */
        fun  /* synthetic */`searchAndCancel$default`(
            searchViewModel: SearchViewModel,
            str: String,
            set: Set,
            z: Boolean,
            z2: Boolean,
            i: Int,
            obj: Object?
        ) {
            var set: Set = set
            var z: Boolean = z
            var z2: Boolean = z2
            if ((i and 2) != 0) {
                set = SetsKt.emptySet<Any>()
            }
            if ((i and 4) != 0) {
                z = false
            }
            if ((i and 8) != 0) {
                z2 = false
            }
            searchViewModel.searchAndCancel(str, set, z, z2)
        }

        fun  /* synthetic */`search$default`(
            searchViewModel: SearchViewModel,
            str: String,
            set: Set,
            z: Boolean,
            z2: Boolean,
            i: Int,
            obj: Object?
        ): Job {
            var z: Boolean = z
            var z2: Boolean = z2
            if ((i and 4) != 0) {
                z = false
            }
            if ((i and 8) != 0) {
                z2 = false
            }
            return searchViewModel.search(str, set, z, z2)
        }
    }
}