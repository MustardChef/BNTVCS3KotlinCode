package com.lagradost.cloudstream3.p041ui.result

import android.util.Log
import com.lagradost.cloudstream3.mvvm.Resource
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: ResultViewModel.kt */
@Metadata(
    m108d1 = ["\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000c\u0018\u0000 l2\u00020\u0001:\u0001lB\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010G\u001a\u00020\u00152\u0006\u0010H\u001a\u00020\u00152\b\u0010I\u001a\u0004\u0018\u00010-H\u0002J\u0010\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010\u0007J\u0015\u0010M\u001a\u00020K2\b\u0010N\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010OJ\u0015\u0010P\u001a\u00020K2\b\u0010Q\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010OJ1\u0010R\u001a\u00020K2\u000e\u0010S\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\u0010Q\u001a\u0004\u0018\u00010\u00122\b\u0010N\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0002\u0010TJ\u0014\u0010U\u001a\u0004\u0018\u00010\u00052\b\u0010V\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010W\u001a\u0004\u0018\u00010(2\u0006\u0010X\u001a\u00020\u000bJ\u001e\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\\\u001a\u00020]JI\u0010^\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020`0\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020a0\r0_0\u00102\u0006\u0010X\u001a\u00020\u000b2\u0006\u0010b\u001a\u00020]2\b\b\u0002\u0010c\u001a\u00020]H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010dJ\u0019\u0010e\u001a\u00020K2\n\b\u0002\u0010f\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0002\u0010OJ\u0006\u0010g\u001a\u00020KJ\u000e\u0010h\u001a\u00020K2\u0006\u0010I\u001a\u00020-J/\u0010i\u001a\u00020K2\b\u0010f\u001a\u0004\u0018\u00010\u00122\u000c\u0010S\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010Q\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0002\u0010jJ\u000e\u0010k\u001a\u00020Z2\u0006\u0010L\u001a\u00020\u0017R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00100\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00100\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00198F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR+\u0010\u001e\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\t0\u00198F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001bR\u001d\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00198F¢\u0006\u0006\u001a\u0004\b!\u0010\u001bR0\u0010\"\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120#j\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012`$0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00198F¢\u0006\u0006\u001a\u0004\b&\u0010\u001bR\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001c\u0010,\u001a\u0004\u0018\u00010-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0010\u00102\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00103\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R#\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00100\u00198F¢\u0006\u0006\u001a\u0004\b5\u0010\u001bR\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020\u00120\u00198F¢\u0006\u0006\u001a\u0004\b7\u0010\u001bR\u001d\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\u0019¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u001bR\u0010\u0010:\u001a\u0004\u0018\u00010;X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00100\u00198F¢\u0006\u0006\u001a\u0004\b=\u0010\u001bR\u001f\u0010>\u001a\u0010\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\n0\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010+R\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010+R\u0014\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010+R\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00170\u00198F¢\u0006\u0006\u001a\u0004\bF\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006m"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/result/ResultViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_apiName", "Landroidx/lifecycle/MutableLiveData;", "", "_dubStatus", "Lcom/lagradost/cloudstream3/DubStatus;", "_dubSubEpisodes", "", "", "Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;", "_dubSubSelections", "", "_episodes", "_publicEpisodes", "Lcom/lagradost/cloudstream3/mvvm/Resource;", "_publicEpisodesCount", "", "_rangeOptions", "_resultResponse", "Lcom/lagradost/cloudstream3/LoadResponse;", "_watchStatus", "Lcom/lagradost/cloudstream3/ui/WatchType;", "apiName", "Landroidx/lifecycle/LiveData;", "getApiName", "()Landroidx/lifecycle/LiveData;", "dubStatus", "getDubStatus", "dubSubEpisodes", "getDubSubEpisodes", "dubSubSelections", "getDubSubSelections", "episodeById", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "episodes", "getEpisodes", "generator", "Lcom/lagradost/cloudstream3/ui/player/IGenerator;", "id", "getId", "()Landroidx/lifecycle/MutableLiveData;", "lastMeta", "Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncResult;", "getLastMeta", "()Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncResult;", "setLastMeta", "(Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncResult;)V", "loadResponseVM", "page", "publicEpisodes", "getPublicEpisodes", "publicEpisodesCount", "getPublicEpisodesCount", "rangeOptions", "getRangeOptions", "repo", "Lcom/lagradost/cloudstream3/ui/APIRepository;", "result", "getResult", "seasonSelections", "getSeasonSelections", "selectedRange", "getSelectedRange", "selectedRangeInt", "selectedSeason", "getSelectedSeason", "watchStatus", "getWatchStatus", "applyMeta", "resp", "meta", "changeDubStatus", "", "status", "changeRange", SessionDescription.ATTR_RANGE, "(Ljava/lang/Integer;)V", "changeSeason", "selection", "filterEpisodes", "list", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V", "filterName", "name", "getGenerator", "episode", "load", "Lkotlinx/coroutines/Job;", "url", "showFillers", "", "loadEpisode", "Lkotlin/Pair;", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "Lcom/lagradost/cloudstream3/ui/player/SubtitleData;", "isCasting", "clearCache", "(Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadWatchStatus", "localId", "reloadEpisodes", "setMeta", "updateEpisodes", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;)V", "updateWatchStatus", "Companion", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.result.ResultViewModel */ /* loaded from: classes4.dex */
class ResultViewModel constructor() : ViewModel() {
    private val _apiName: MutableLiveData<String>
    private val _dubStatus: MutableLiveData<DubStatus>
    private val _dubSubEpisodes: MutableLiveData<Map<DubStatus, List<ResultEpisode>>>
    private val _dubSubSelections: MutableLiveData<Set<DubStatus>>
    private val _rangeOptions: MutableLiveData<List<String>>
    val _watchStatus: MutableLiveData<WatchType>
    var generator: IGenerator? = null

    /* renamed from: id */
    private val f10022id: MutableLiveData<Integer>
    private var lastMeta: SyncResult? = null
    private val loadResponseVM: LoadResponse? = null
    val page: MutableLiveData<LoadResponse>
    private val rangeOptions: LiveData<List<String>>
    private val repo: APIRepository? = null
    private val seasonSelections: MutableLiveData<List<Integer>>
    private val selectedRange: MutableLiveData<String>
    private val selectedRangeInt: MutableLiveData<Integer>
    private val selectedSeason: MutableLiveData<Integer>
    private val _resultResponse: MutableLiveData<Resource<LoadResponse>> =
        MutableLiveData<Resource<LoadResponse>>()
    val _episodes: MutableLiveData<List<ResultEpisode>> = MutableLiveData<List<ResultEpisode>>()
    private val episodeById: MutableLiveData<HashMap<Integer, Integer>> =
        MutableLiveData<HashMap<Integer, Integer>>()
    private val _publicEpisodes: MutableLiveData<Resource<List<ResultEpisode>>> =
        MutableLiveData<Resource<List<ResultEpisode>>>()
    private val _publicEpisodesCount: MutableLiveData<Integer> = MutableLiveData<Integer>()

    init {
        val mutableLiveData: MutableLiveData<List<String>> = MutableLiveData<List<String>>()
        _rangeOptions = mutableLiveData
        selectedRange = MutableLiveData<String>()
        selectedRangeInt = MutableLiveData<Integer>()
        rangeOptions = mutableLiveData
        _dubStatus = MutableLiveData<DubStatus>()
        page = MutableLiveData<LoadResponse>()
        f10022id = MutableLiveData<Integer>()
        selectedSeason = MutableLiveData<T>(-2)
        seasonSelections = MutableLiveData<List<Integer>>()
        _dubSubSelections = MutableLiveData<Set<DubStatus>>()
        _dubSubEpisodes = MutableLiveData<Map<DubStatus, List<ResultEpisode>>>()
        _watchStatus = MutableLiveData<WatchType>()
        _apiName = MutableLiveData<String>()
    }

    fun getSelectedRange(): MutableLiveData<String> {
        return selectedRange
    }

    fun getRangeOptions(): LiveData<List<String>> {
        return rangeOptions
    }

    val result: LiveData<Resource<LoadResponse>>
        get() {
            return _resultResponse
        }
    val episodes: LiveData<List<ResultEpisode>>
        get() {
            return _episodes
        }
    val publicEpisodes: LiveData<Resource<List<ResultEpisode>>>
        get() {
            return _publicEpisodes
        }
    val publicEpisodesCount: LiveData<Integer>
        get() {
            return _publicEpisodesCount
        }
    val dubStatus: LiveData<DubStatus>
        get() {
            return _dubStatus
        }
    val id: MutableLiveData<Integer>
        get() {
            return f10022id
        }

    fun getSelectedSeason(): MutableLiveData<Integer> {
        return selectedSeason
    }

    fun getSeasonSelections(): MutableLiveData<List<Integer>> {
        return seasonSelections
    }

    val dubSubSelections: LiveData<Set<DubStatus>>
        get() {
            return _dubSubSelections
        }
    val dubSubEpisodes: LiveData<Map<DubStatus, List<ResultEpisode>>>
        get() {
            return _dubSubEpisodes
        }
    val watchStatus: LiveData<WatchType>
        get() {
            return _watchStatus
        }

    fun updateWatchStatus(status: WatchType): Job {
        val `launch$default`: Job
        Intrinsics.checkNotNullParameter(status, "status")
        `launch$default` = BuildersKt__Builders_commonKt.`launch$default`(
            ViewModelKt.getViewModelScope(this),
            null,
            null,
            `ResultViewModel$updateWatchStatus$1`(this, status, null),
            3,
            null
        )
        return `launch$default`
    }

    /* compiled from: ResultViewModel.kt */
    @Metadata(
        m108d1 = ["\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/result/ResultViewModel\$Companion;", "", "()V", "TAG", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.result.ResultViewModel$Companion */ /* loaded from: classes4.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}
    }

    fun getLastMeta(): SyncResult? {
        return lastMeta
    }

    fun setLastMeta(syncResult: SyncResult?) {
        lastMeta = syncResult
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun applyMeta(loadResponse: LoadResponse, syncResult: SyncResult?): LoadResponse {
        var arrayList: ArrayList?
        var union: Set?
        var copy: SyncSearchResult?
        if (syncResult == null) {
            return loadResponse
        }
        lastMeta = syncResult
        Log.i(ResultViewModel.Companion.TAG, "applyMeta")
        var duration: Integer? = loadResponse.getDuration()
        if (duration == null) {
            duration = syncResult.getDuration()
        }
        loadResponse.setDuration(duration)
        var rating: Integer? = loadResponse.getRating()
        if (rating == null) {
            rating = syncResult.getPublicScore()
        }
        loadResponse.setRating(rating)
        var tags: List<String?>? = loadResponse.tags
        if (tags == null) {
            tags = syncResult.genres
        }
        loadResponse.tags = tags
        val plot: String? = loadResponse.plot
        loadResponse.plot =
            if (plot == null || StringsKt.isBlank(plot)) syncResult.synopsis else loadResponse.plot
        LoadResponse.Companion.addTrailer(loadResponse, syncResult.trailerUrl)
        var posterUrl: String = loadResponse.posterUrl
        if (posterUrl == null && (syncResult.posterUrl.also({ posterUrl = it })) == null) {
            posterUrl = syncResult.backgroundPosterUrl
        }
        loadResponse.posterUrl = posterUrl
        var actors: List<ActorData?>? = loadResponse.actors
        if (actors == null) {
            actors = syncResult.getActors()
        }
        loadResponse.actors = actors
        val arrayList2: ArrayList = ArrayList()
        val listOf: List<String> = CollectionsKt.listOf(NineAnimeProvider().getName())
        val recommendations: List<SyncSearchResult>? = syncResult.recommendations
        if (recommendations != null) {
            for (syncSearchResult: SyncSearchResult in recommendations) {
                for (str: String? in listOf) {
                    copy = syncSearchResult.copy(
                        if ((r20 and 1) !== 0) syncSearchResult.name else null,
                        if ((r20 and 2) !== 0) syncSearchResult.apiName else str,
                        if ((r20 and 4) !== 0) syncSearchResult.syncId else null,
                        if ((r20 and 8) !== 0) syncSearchResult.url else null,
                        if ((r20 and 16) !== 0) syncSearchResult.posterUrl else null,
                        if ((r20 and 32) !== 0) syncSearchResult.getType() else null,
                        if ((r20 and 64) !== 0) syncSearchResult.getQuality() else null,
                        if ((r20 and 128) !== 0) syncSearchResult.posterHeaders else null,
                        if ((r20 and 256) !== 0) syncSearchResult.id else null
                    )
                    arrayList2.add(copy)
                }
            }
        }
        val recommendations2: List<SearchResponse>? = loadResponse.recommendations
        if ((recommendations2 == null) || ((CollectionsKt.union(recommendations2, arrayList2)
                .also({ union = it })) == null) || ((CollectionsKt.toList(union)
                .also({ arrayList = it })) == null)
        ) {
            arrayList = arrayList2
        }
        loadResponse.recommendations = arrayList
        return loadResponse
    }

    fun setMeta(meta: SyncResult?) {
        var loadResponse: LoadResponse
        Intrinsics.checkNotNullParameter(meta, "meta")
        Log.i(ResultViewModel.Companion.TAG, "setMeta")
        val value: Resource<LoadResponse> = result.getValue()
        val success: Resource.Success<*>? = if (value is Resource.Success<*>) value else null
        if (success == null || (success.value as LoadResponse?. also ({
                loadResponse = it
            })) == null) {
            return
        }
        _resultResponse.postValue(Resource.Success<Any?>(applyMeta(loadResponse, meta)))
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun loadWatchStatus(num: Integer?) {
        var num: Integer? = num
        if (num == null && (f10022id.getValue().also({ num = it })) == null) {
            return
        }
        _watchStatus.postValue(DataStoreHelper.INSTANCE.getResultWatchState(num.intValue()))
    }

    private fun filterEpisodes(list: List<ResultEpisode>?, num: Integer?, num2: Integer?) {
        var value: Integer?
        var intValue: Int
        if (list == null) {
            return
        }
        val hashMap: HashMap = HashMap()
        for (resultEpisode: ResultEpisode in list) {
            if (!hashMap.containsKey(resultEpisode.getSeason())) {
                hashMap.put(resultEpisode.getSeason(), true)
            }
        }
        val list2: List<Tuples<*, *>> = MapsKt.toList(hashMap)
        val arrayList: ArrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10))
        for (tuples: Tuples<*, *> in list2) {
            arrayList.add(tuples.getFirst() as Integer?)
        }
        val sortedWith: List<Integer> = CollectionsKt.sortedWith(arrayList, object : Comparator() {
            // from class: com.lagradost.cloudstream3.ui.result.ResultViewModel$filterEpisodes$$inlined$sortedBy$1
            @Override // java.util.Comparator
            fun compare(t: T?, t2: T?): Int {
                return ComparisonsKt.compareValues<Comparable<*>>(t as Integer?, t2 as Integer?)
            }
        })
        seasonSelections.postValue(sortedWith)
        if (sortedWith.isEmpty()) {
            _publicEpisodes.postValue(Resource.Success<Any?>(CollectionsKt.emptyList<Any>()))
            return
        }
        val num3: Integer? =
            if (!hashMap.containsKey(num)) CollectionsKt.first<Any>(sortedWith as List<Object?>?) as Integer? else num
        val value2: Integer? = f10022id.getValue()
        if (value2 != null) {
            DataStoreHelper.INSTANCE.setResultSeason(value2.intValue(), num3)
        }
        selectedSeason.postValue(Integer.valueOf(if (num3 != null) num3.intValue() else -2))
        val arrayList2: List = ArrayList()
        for (obj: Object in list) {
            if (Intrinsics.areEqual((obj as ResultEpisode).getSeason(), num3)) {
                arrayList2.add(obj)
            }
        }
        var list3: List = arrayList2
        _publicEpisodesCount.postValue(Integer.valueOf(list3.size()))
        val arrayList3: ArrayList = ArrayList()
        val progressionLastElement: Int =
            progressionUtil.getProgressionLastElement(0, list3.size() - 1, 50)
        if (progressionLastElement >= 0) {
            var i: Int = 0
            while (true) {
                val i2: Int = i + 50
                if (i2 < list3.size()) {
                    val sb: StringBuilder = StringBuilder()
                    sb.append(i + 1)
                    sb.append('-')
                    sb.append(i2)
                    arrayList3.add(sb.toString())
                } else {
                    val sb2: StringBuilder = StringBuilder()
                    sb2.append(i + 1)
                    sb2.append('-')
                    sb2.append(list3.size())
                    arrayList3.add(sb2.toString())
                }
                if (i == progressionLastElement) {
                    break
                }
                i = i2
            }
        }
        if (num2 != null) {
            intValue = num2.intValue()
        } else {
            if (num != null) {
                value = 0
            } else {
                value = selectedRangeInt.getValue()
                if (value == null) {
                    value = 0
                }
            }
            intValue = value.intValue()
        }
        if (intValue * 50 > list3.size()) {
            intValue = list3.size() / 50
        }
        if (list3.size() > 60) {
            list3 = list3.subList(intValue * 50, Math.min(list3.size(), (intValue + 1) * 50))
            _rangeOptions.postValue(arrayList3)
            selectedRangeInt.postValue(Integer.valueOf(intValue))
            selectedRange.postValue(arrayList3.get(intValue))
        } else {
            val str: String = "1-" + list3.size()
            _rangeOptions.postValue(CollectionsKt.listOf(str))
            selectedRangeInt.postValue(0)
            selectedRange.postValue(str)
        }
        _publicEpisodes.postValue(Resource.Success<Any?>(list3))
    }

    fun changeSeason(num: Integer?) {
        filterEpisodes(_episodes.getValue(), num, null)
    }

    fun changeRange(num: Integer?) {
        filterEpisodes(_episodes.getValue(), null, num)
    }

    fun changeDubStatus(dubStatus: DubStatus?) {
        var value: Map<DubStatus?, List<ResultEpisode?>>
        var list: List<ResultEpisode>?
        if ((dubStatus == null) || ((dubSubEpisodes.getValue()
                .also({ value = it })) == null) || ((value.get(dubStatus)
                .also({ list = it })) == null)
        ) {
            return
        }
        val it: Integer? = f10022id.getValue()
        if (it != null) {
            val dataStoreHelper: DataStoreHelper = DataStoreHelper.INSTANCE
            Intrinsics.checkNotNullExpressionValue(it, "it")
            dataStoreHelper.setDub(it.intValue(), dubStatus)
        }
        _dubStatus.postValue(dubStatus)
        updateEpisodes(null, list, null)
    }

    fun loadEpisode(
        resultEpisode: ResultEpisode,
        z: Boolean,
        z2: Boolean,
        continuation: Continuation<in Resource<out Tuples<out Set<ExtractorLink?>?, out Set<SubtitleData?>?>?>?>?
    ): Object {
        return ArchComponentExt.safeApiCall<Tuples<out Set<ExtractorLink>?, out Set<SubtitleData>?>>(
            `ResultViewModel$loadEpisode$2`(this, resultEpisode, z2, z, null),
            continuation
        )
    }

    fun getGenerator(episode: ResultEpisode): IGenerator? {
        Intrinsics.checkNotNullParameter(episode, "episode")
        val value: List<ResultEpisode>? = _episodes.getValue()
        val indexOf: Int = if (value != null) value.indexOf(episode) else episode.getIndex()
        val iGenerator: IGenerator? = generator
        if (iGenerator != null) {
            iGenerator.mo8669goto(indexOf)
        }
        return generator
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun updateEpisodes(num: Integer?, list: List<ResultEpisode>?, num2: Integer?) {
        var num: Integer? = num
        var num2: Integer? = num2
        _episodes.postValue(list)
        generator = RepoLinkGenerator(list, 0, loadResponseVM, 2, null)
        val hashMap: HashMap<Integer, Integer> = HashMap()
        val value: Integer = selectedRangeInt.getValue()
        for (indexedValue: IndexedValue<*> in CollectionsKt.withIndex(list)) {
            hashMap.put(
                Integer.valueOf((indexedValue.getValue() as ResultEpisode).getId()),
                Integer.valueOf(indexedValue.getIndex())
            )
        }
        episodeById.postValue(hashMap)
        if (num2 != null && num2.intValue() === -1) {
            val dataStoreHelper: DataStoreHelper = DataStoreHelper.INSTANCE
            if (num == null && (f10022id.getValue().also({ num = it })) == null) {
                return
            }
            num2 = Integer.valueOf(dataStoreHelper.getResultSeason(num.intValue()))
        }
        filterEpisodes(list, num2, value)
    }

    fun reloadEpisodes() {
        var copy: ResultEpisode?
        val value: List<ResultEpisode>? = _episodes.getValue()
        if (value == null) {
            return
        }
        val list: List<ResultEpisode> = value
        val arrayList: ArrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10))
        for (resultEpisode: ResultEpisode in list) {
            val viewPos: PosDur? =
                DataStoreHelper.INSTANCE.getViewPos(Integer.valueOf(resultEpisode.getId()))
            var j: Long = 0
            val position: Long = if (viewPos != null) viewPos.position else 0L
            if (viewPos != null) {
                j = viewPos.duration
            }
            copy = resultEpisode.copy(
                if ((r36 and 1) !== 0) resultEpisode.headerName else null,
                if ((r36 and 2) !== 0) resultEpisode.name else null,
                if ((r36 and 4) !== 0) resultEpisode.poster else null,
                if ((r36 and 8) !== 0) resultEpisode.episode else 0,
                if ((r36 and 16) !== 0) resultEpisode.season else null,
                if ((r36 and 32) !== 0) resultEpisode.data else null,
                if ((r36 and 64) !== 0) resultEpisode.apiName else null,
                if ((r36 and 128) !== 0) resultEpisode.f10017id else 0,
                if ((r36 and 256) !== 0) resultEpisode.index else 0,
                if ((r36 and 512) !== 0) resultEpisode.position else position,
                if ((r36 and 1024) !== 0) resultEpisode.duration else j,
                if ((r36 and 2048) !== 0) resultEpisode.rating else null,
                if ((r36 and 4096) !== 0) resultEpisode.description else null,
                if ((r36 and 8192) !== 0) resultEpisode.isFiller else null,
                if ((r36 and 16384) !== 0) resultEpisode.tvType else null,
                if ((r36 and 32768) !== 0) resultEpisode.parentId else 0
            )
            arrayList.add(copy)
        }
        updateEpisodes(null, arrayList, selectedSeason.getValue())
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun filterName(str: String?): String? {
        var groupValues: List<String>
        var str2: String
        if (str == null) {
            return null
        }
        val `find$default`: MatchResult? =
            Regex.`find$default`(Regex("[eE]pisode [0-9]*(.*)"), str, 0, 2, null)
        if ((`find$default` != null) && ((`find$default`.getGroupValues()
                .also({ groupValues = it })) != null) && ((groupValues.get(1)
                .also({ str2 = it })) != null)
        ) {
            if (str2.length() === 0) {
                return null
            }
        }
        return str
    }

    fun load(url: String?, apiName: String?, z: Boolean): Job {
        val `launch$default`: Job
        Intrinsics.checkNotNullParameter(url, "url")
        Intrinsics.checkNotNullParameter(apiName, "apiName")
        `launch$default` = BuildersKt__Builders_commonKt.`launch$default`(
            ViewModelKt.getViewModelScope(this),
            null,
            null,
            `ResultViewModel$load$1`(this, url, apiName, z, null),
            3,
            null
        )
        return `launch$default`
    }

    val apiName: LiveData<String>
        get() {
            return _apiName
        }

    companion object {
        val Companion: Companion = Companion(null)
        val TAG: String = "RVM"
        fun  /* synthetic */`loadWatchStatus$default`(
            resultViewModel: ResultViewModel,
            num: Integer?,
            i: Int,
            obj: Object?
        ) {
            var num: Integer? = num
            if ((i and 1) != 0) {
                num = null
            }
            resultViewModel.loadWatchStatus(num)
        }

        fun  /* synthetic */`loadEpisode$default`(
            resultViewModel: ResultViewModel,
            resultEpisode: ResultEpisode,
            z: Boolean,
            z2: Boolean,
            continuation: Continuation<*>?,
            i: Int,
            obj: Object?
        ): Object {
            var z2: Boolean = z2
            if ((i and 4) != 0) {
                z2 = false
            }
            return resultViewModel.loadEpisode(resultEpisode, z, z2, continuation)
        }
    }
}