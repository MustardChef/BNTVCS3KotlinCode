package com.lagradost.cloudstream3.p041ui.result

import android.util.Log
import com.lagradost.cloudstream3.mvvm.Resource
import kotlin.jvm.internal.Intrinsics

/* compiled from: SyncViewModel.kt */
@Metadata(
    m108d1 = ["\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u0000 D2\u00020\u0001:\u0001DB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u000cJ\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u000c2\u0006\u0010)\u001a\u00020\u000cH\u0002J\u001c\u0010*\u001a\u00020'2\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000c\u0018\u00010,J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u001e\u0010.\u001a\u00020$2\u0014\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e00H\u0002J\u000e\u00101\u001a\u0002022\u0006\u00103\u001a\u000204J\u0006\u00105\u001a\u00020\$J\u0012\u00106\u001a\u00020'2\b\u0010)\u001a\u0004\u0018\u00010\u000cH\u0002J\u000e\u00107\u001a\u0002022\u0006\u00108\u001a\u000204J\u000e\u00109\u001a\u0002022\u0006\u0010:\u001a\u000204J\u0012\u0010;\u001a\u00020'2\b\u0010)\u001a\u0004\u0018\u00010\u000cH\u0002J\u000e\u0010<\u001a\u0002022\u0006\u0010=\u001a\u000204J\u000e\u0010>\u001a\u0002022\u0006\u0010?\u001a\u000204J\u0006\u0010@\u001a\u000202J\b\u0010A\u001a\u00020\$H\u0002J\u0006\u0010B\u001a\u000202J\u0006\u0010C\u001a\u00020\$R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000c0\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u000c0\u0010j\b\u0012\u0004\u0012\u00020\u000c`\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000c0\u000b0\u00178F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u001d\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00178F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019R\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000c0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001f\u0010!\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\b0\u00178F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0019¨\u0006E"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/result/SyncViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_currentSynced", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/lagradost/cloudstream3/ui/result/CurrentSynced;", "_metaResponse", "Lcom/lagradost/cloudstream3/mvvm/Resource;", "Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncResult;", "_syncIds", "", "", "_userDataResponse", "Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncStatus;", "hasAddedFromUrl", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "getHasAddedFromUrl", "()Ljava/util/HashSet;", "setHasAddedFromUrl", "(Ljava/util/HashSet;)V", TtmlNode.TAG_METADATA, "Landroidx/lifecycle/LiveData;", "getMetadata", "()Landroidx/lifecycle/LiveData;", "repos", "Lcom/lagradost/cloudstream3/syncproviders/SyncRepo;", "syncIds", "getSyncIds", "synced", "getSynced", "syncs", "userData", "getUserData", "addFromUrl", "Lkotlinx/coroutines/Job;", "url", "addSync", "", "idPrefix", "id", "addSyncs", "map", "", "getMissing", "modifyData", "update", "Lkotlin/Function1;", "modifyMaxEpisode", "", "episodeNum", "", "publishUserData", "setAniListId", "setEpisodes", "episodes", "setEpisodesDelta", "delta", "setMalId", "setScore", "score", "setStatus", "which", "updateMetaAndUser", "updateMetadata", "updateSynced", "updateUserData", "Companion", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.result.SyncViewModel */ /* loaded from: classes4.dex */
class SyncViewModel constructor() : ViewModel() {
    val repos: List<SyncRepo> = AccountManager.Companion.syncApis
    private val _metaResponse: MutableLiveData<Resource<SyncResult>> =
        MutableLiveData<Resource<SyncResult>>()
    private val _userDataResponse: MutableLiveData<Resource<SyncStatus>> =
        MutableLiveData<Resource<SyncStatus>>(null)
    val syncs: Map<String, String> = LinkedHashMap()
    private val _syncIds: MutableLiveData<Map<String, String>> =
        MutableLiveData<Map<String, String>>(LinkedHashMap())
    private val _currentSynced: MutableLiveData<List<CurrentSynced>> =
        MutableLiveData<List<CurrentSynced>>(
            missing
        )
    var hasAddedFromUrl: HashSet<String> = HashSet()
        set(hashSet) {
            Intrinsics.checkNotNullParameter(hashSet, "<set-?>")
            field = hashSet
        }

    /* compiled from: SyncViewModel.kt */
    @Metadata(
        m108d1 = ["\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/result/SyncViewModel\$Companion;", "", "()V", "TAG", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.result.SyncViewModel$Companion */ /* loaded from: classes4.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}
    }

    val metadata: LiveData<Resource<SyncResult>>
        get() {
            return _metaResponse
        }
    val userData: LiveData<Resource<SyncStatus>>
        get() {
            return _userDataResponse
        }
    val syncIds: LiveData<Map<String, String>>
        get() {
            return _syncIds
        }
    val synced: LiveData<List<CurrentSynced>>
        get() {
            return _currentSynced
        }
    private val missing: List<CurrentSynced>
        private get() {
            val list: List<SyncRepo> = repos
            val arrayList: ArrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10))
            for (syncRepo: SyncRepo in list) {
                arrayList.add(
                    CurrentSynced(
                        syncRepo.name,
                        syncRepo.idPrefix,
                        syncs.containsKey(syncRepo.idPrefix),
                        syncRepo.hasAccount(),
                        syncRepo.getIcon()
                    )
                )
            }
            return arrayList
        }

    fun updateSynced() {
        Log.i(SyncViewModel.Companion.TAG, "updateSynced")
        _currentSynced.postValue(missing)
    }

    private fun addSync(str: String, str2: String): Boolean {
        if (Intrinsics.areEqual(syncs.get(str), str2)) {
            return false
        }
        Log.i(SyncViewModel.Companion.TAG, "addSync " + str + " = " + str2)
        syncs.put(str, str2)
        _syncIds.postValue(syncs)
        return true
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun setMalId(str: String?): Boolean {
        val idPrefix: String = AccountManager.Companion.malApi.getIdPrefix()
        if (str == null) {
            return false
        }
        return addSync(idPrefix, str)
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun setAniListId(str: String?): Boolean {
        val idPrefix: String = AccountManager.Companion.aniListApi.getIdPrefix()
        if (str == null) {
            return false
        }
        return addSync(idPrefix, str)
    }

    fun addFromUrl(str: String?): Job {
        val `launch$default`: Job
        `launch$default` = BuildersKt__Builders_commonKt.`launch$default`(
            ViewModelKt.getViewModelScope(this),
            null,
            null,
            `SyncViewModel$addFromUrl$1`(str, this, null),
            3,
            null
        )
        return `launch$default`
    }

    fun setEpisodesDelta(i: Int) {
        var watchedEpisodes: Integer
        Log.i(SyncViewModel.Companion.TAG, "setEpisodesDelta = " + i)
        val value: Resource<SyncStatus> = userData.getValue()
        if (!(value is Resource.Success<*>) || ((value.value as SyncStatus).getWatchedEpisodes()
                .also({ watchedEpisodes = it })) == null
        ) {
            return
        }
        setEpisodes(watchedEpisodes.intValue() + i)
    }

    fun setEpisodes(i: Int) {
        var totalEpisodes: Integer
        var intValue: Int
        Log.i(SyncViewModel.Companion.TAG, "setEpisodes = " + i)
        if (i < 0) {
            return
        }
        val value: Resource<SyncResult> = metadata.getValue()
        if ((value is Resource.Success<*>) && (((value.value as SyncResult).getTotalEpisodes()
                .also({ totalEpisodes = it })) != null) && (i > (totalEpisodes.intValue()
                .also({ intValue = it })))
        ) {
            setEpisodes(intValue)
            return
        }
        val value2: Resource<SyncStatus> = userData.getValue()
        if (value2 is Resource.Success<*>) {
            _userDataResponse.postValue(
                Resource.Success<Any?>(
                    SyncAPI.SyncStatus.`copy$default`(
                        value2.value as SyncStatus?,
                        0,
                        null,
                        Integer.valueOf(i),
                        null,
                        null,
                        27,
                        null
                    )
                )
            )
        }
    }

    fun setScore(i: Int) {
        Log.i(SyncViewModel.Companion.TAG, "setScore = " + i)
        val value: Resource<SyncStatus> = userData.getValue()
        if (value is Resource.Success<*>) {
            _userDataResponse.postValue(
                Resource.Success<Any?>(
                    SyncAPI.SyncStatus.`copy$default`(
                        value.value as SyncStatus?,
                        0,
                        Integer.valueOf(i),
                        null,
                        null,
                        null,
                        29,
                        null
                    )
                )
            )
        }
    }

    fun setStatus(i: Int) {
        Log.i(SyncViewModel.Companion.TAG, "setStatus = " + i)
        if (i < -1 || i > 5) {
            return
        }
        val value: Resource<SyncStatus> = userData.getValue()
        if (value is Resource.Success<*>) {
            _userDataResponse.postValue(
                Resource.Success<Any?>(
                    SyncAPI.SyncStatus.`copy$default`(
                        value.value as SyncStatus?, i, null, null, null, null, 30, null
                    )
                )
            )
        }
    }

    fun publishUserData(): Job {
        val `launch$default`: Job
        `launch$default` = BuildersKt__Builders_commonKt.`launch$default`(
            ViewModelKt.getViewModelScope(this),
            null,
            null,
            `SyncViewModel$publishUserData$1`(this, null),
            3,
            null
        )
        return `launch$default`
    }

    fun modifyMaxEpisode(i: Int) {
        Log.i(SyncViewModel.Companion.TAG, "modifyMaxEpisode = " + i)
        modifyData(`SyncViewModel$modifyMaxEpisode$1`(i))
    }

    private fun modifyData(function1: Function1<SyncStatus, SyncStatus>): Job {
        val `launch$default`: Job
        `launch$default` = BuildersKt__Builders_commonKt.`launch$default`(
            ViewModelKt.getViewModelScope(this),
            null,
            null,
            `SyncViewModel$modifyData$1`(this, function1, null),
            3,
            null
        )
        return `launch$default`
    }

    fun updateUserData(): Job {
        val `launch$default`: Job
        `launch$default` = BuildersKt__Builders_commonKt.`launch$default`(
            ViewModelKt.getViewModelScope(this),
            null,
            null,
            `SyncViewModel$updateUserData$1`(this, null),
            3,
            null
        )
        return `launch$default`
    }

    private fun updateMetadata(): Job {
        val `launch$default`: Job
        `launch$default` = BuildersKt__Builders_commonKt.`launch$default`(
            ViewModelKt.getViewModelScope(this),
            null,
            null,
            `SyncViewModel$updateMetadata$1`(this, null),
            3,
            null
        )
        return `launch$default`
    }

    fun updateMetaAndUser() {
        Log.i(SyncViewModel.Companion.TAG, "updateMetaAndUser")
        updateMetadata()
        updateUserData()
    }

    fun addSyncs(map: Map<String?, String?>?): Boolean {
        var z: Boolean
        if (map != null) {
            while (true) {
                for (entry: Map.Entry<String?, String?> in map.entrySet()) {
                    z = addSync(entry.getKey(), entry.getValue()) || z
                }
                return z
            }
        }
        return false
    }

    companion object {
        val Companion: Companion = Companion(null)
        val TAG: String = "SYNCVM"
    }
}