package com.lagradost.cloudstream3.p041ui.home

import com.lagradost.cloudstream3.mvvm.Resource
import java.util.EnumSet

/* compiled from: HomeViewModel.kt */
@Metadata(
    m108d1 = ["\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010%\u001a\u00020\"H\u0002J\u0012\u0010&\u001a\u00020\u001c2\b\u0010'\u001a\u0004\u0018\u00010(H\u0002J\u0012\u0010)\u001a\u00020*2\b\u0010'\u001a\u0004\u0018\u00010(H\u0002J\u0010\u0010)\u001a\u00020\u001c2\b\u0010+\u001a\u0004\u0018\u00010\u0005J\u0006\u0010,\u001a\u00020\u001cJ\u0016\u0010-\u001a\u00020\u001c2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\u0006\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000c0\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000c0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R/\u0010\u0017\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R)\u0010\u0019\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000c0\u00070\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u001f\u0010\u001d\u001a\u0010\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f0\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u001f\u0010\u001f\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c0\u0014¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000c0\u0014¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016¨\u0006/"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_apiName", "Landroidx/lifecycle/MutableLiveData;", "", "_availableWatchStatusTypes", "Lkotlin/Pair;", "Ljava/util/EnumSet;", "Lcom/lagradost/cloudstream3/ui/WatchType;", "_bookmarks", "", "", "Lcom/lagradost/cloudstream3/SearchResponse;", "_page", "Lcom/lagradost/cloudstream3/mvvm/Resource;", "Lcom/lagradost/cloudstream3/HomePageResponse;", "_randomItems", "_resumeWatching", "apiName", "Landroidx/lifecycle/LiveData;", "getApiName", "()Landroidx/lifecycle/LiveData;", "availableWatchStatusTypes", "getAvailableWatchStatusTypes", "bookmarks", "getBookmarks", "onGoingLoad", "Lkotlinx/coroutines/Job;", "page", "getPage", "randomItems", "getRandomItems", "repo", "Lcom/lagradost/cloudstream3/ui/APIRepository;", "resumeWatching", "getResumeWatching", "autoloadRepo", "load", "api", "Lcom/lagradost/cloudstream3/MainAPI;", "loadAndCancel", "", "preferredApiName", "loadResumeWatching", "loadStoredData", "preferredWatchStatus", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.home.HomeViewModel */ /* loaded from: classes3.dex */
class HomeViewModel : ViewModel() {
    private val _apiName: MutableLiveData<String>
    val _availableWatchStatusTypes: MutableLiveData<Tuples<EnumSet<WatchType>, EnumSet<WatchType>>>
    val _bookmarks: MutableLiveData<Tuples<Boolean, List<SearchResponse>>>
    private val _page: MutableLiveData<Resource<HomePageResponse>>
    private val _randomItems: MutableLiveData<List<SearchResponse>>
    private val _resumeWatching: MutableLiveData<List<SearchResponse>>
    private val apiName: LiveData<String>
    private val availableWatchStatusTypes: LiveData<Tuples<EnumSet<WatchType>, EnumSet<WatchType>>>
    private val bookmarks: LiveData<Tuples<Boolean, List<SearchResponse>>>
    private var onGoingLoad: Job? = null
    private val page: LiveData<Resource<HomePageResponse>>
    private val randomItems: LiveData<List<SearchResponse>>
    private val repo: APIRepository? = null
    private val resumeWatching: LiveData<List<SearchResponse>>

    init {
        val mutableLiveData: MutableLiveData<String> = MutableLiveData<String>()
        _apiName = mutableLiveData
        apiName = mutableLiveData
        val mutableLiveData2: MutableLiveData<Resource<HomePageResponse>> =
            MutableLiveData<Resource<HomePageResponse>>()
        _page = mutableLiveData2
        page = mutableLiveData2
        val mutableLiveData3: MutableLiveData<List<SearchResponse>> =
            MutableLiveData<List<SearchResponse>>(null)
        _randomItems = mutableLiveData3
        randomItems = mutableLiveData3
        val mutableLiveData4: MutableLiveData<Tuples<EnumSet<WatchType>, EnumSet<WatchType>>> =
            MutableLiveData<Tuples<EnumSet<WatchType>, EnumSet<WatchType>>>()
        _availableWatchStatusTypes = mutableLiveData4
        availableWatchStatusTypes = mutableLiveData4
        val mutableLiveData5: MutableLiveData<Tuples<Boolean, List<SearchResponse>>> =
            MutableLiveData<Tuples<Boolean, List<SearchResponse>>>()
        _bookmarks = mutableLiveData5
        bookmarks = mutableLiveData5
        val mutableLiveData6: MutableLiveData<List<SearchResponse>> =
            MutableLiveData<List<SearchResponse>>()
        _resumeWatching = mutableLiveData6
        resumeWatching = mutableLiveData6
    }

    fun getApiName(): LiveData<String> {
        return apiName
    }

    fun getPage(): LiveData<Resource<HomePageResponse>> {
        return page
    }

    fun getRandomItems(): LiveData<List<SearchResponse>> {
        return randomItems
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun autoloadRepo(): APIRepository {
        for (mainAPI in APIHolder.INSTANCE.apis) {
            if (mainAPI.hasMainPage) {
                return APIRepository(mainAPI, null, 2, null)
            }
        }
        throw NoSuchElementException("Collection contains no element matching the predicate.")
    }

    fun getAvailableWatchStatusTypes(): LiveData<Tuples<EnumSet<WatchType>, EnumSet<WatchType>>> {
        return availableWatchStatusTypes
    }

    fun getBookmarks(): LiveData<Tuples<Boolean, List<SearchResponse>>> {
        return bookmarks
    }

    fun getResumeWatching(): LiveData<List<SearchResponse>> {
        return resumeWatching
    }

    fun loadResumeWatching(): Job {
        val `launch$default`: Job
        `launch$default` = BuildersKt__Builders_commonKt.`launch$default`(
            ViewModelKt.getViewModelScope(this),
            null,
            null,
            `HomeViewModel$loadResumeWatching$1`(this, null),
            3,
            null
        )
        return `launch$default`
    }

    fun loadStoredData(enumSet: EnumSet<WatchType?>): Job {
        val `launch$default`: Job
        `launch$default` = BuildersKt__Builders_commonKt.`launch$default`(
            ViewModelKt.getViewModelScope(this),
            null,
            null,
            `HomeViewModel$loadStoredData$1`(this, enumSet, null),
            3,
            null
        )
        return `launch$default`
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun loadAndCancel(mainAPI: MainAPI) {
        val job: Job? = onGoingLoad
        if (job != null) {
            Job.DefaultImpls.`cancel$default`(
                job,
                null as CancellationException?,
                1,
                null as Object?
            )
        }
        onGoingLoad = load(mainAPI)
    }

    private fun load(mainAPI: MainAPI): Job {
        val `launch$default`: Job
        `launch$default` = BuildersKt__Builders_commonKt.`launch$default`(
            ViewModelKt.getViewModelScope(this),
            null,
            null,
            `HomeViewModel$load$1`(this, mainAPI, null),
            3,
            null
        )
        return `launch$default`
    }

    fun loadAndCancel(str: String?): Job {
        val `launch$default`: Job
        `launch$default` = BuildersKt__Builders_commonKt.`launch$default`(
            ViewModelKt.getViewModelScope(this),
            null,
            null,
            `HomeViewModel$loadAndCancel$1`(str, this, null),
            3,
            null
        )
        return `launch$default`
    }
}