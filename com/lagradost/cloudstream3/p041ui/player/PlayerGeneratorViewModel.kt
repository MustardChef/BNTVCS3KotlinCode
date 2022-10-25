package com.lagradost.cloudstream3.p041ui.player

import android.util.Log
import com.lagradost.cloudstream3.mvvm.Resource
import kotlin.jvm.internal.Intrinsics

/* compiled from: PlayerGeneratorViewModel.kt */
@Metadata(
    m108d1 = ["\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 <2\u00020\u0001:\u0001<B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u001e\u001a\u00020\u001f2\u000c\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u0005J\u0010\u0010!\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010\u0019J*\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001f0(J\r\u0010)\u001a\u0004\u0018\u00010*¢\u0006\u0002\u0010+J\b\u0010,\u001a\u0004\u0018\u00010\u000fJ\b\u0010-\u001a\u0004\u0018\u00010\u000fJ\r\u0010.\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010/J\u001a\u00100\u001a\u00020\u001f2\b\b\u0002\u00101\u001a\u00020\r2\b\b\u0002\u00102\u001a\u00020\rJ\u000e\u00100\u001a\u00020\u001f2\u0006\u00103\u001a\u00020*J\u0006\u00104\u001a\u00020\u001fJ\u0006\u00105\u001a\u00020\u001fJ\u0014\u00106\u001a\u00020\u001f2\u000c\u00107\u001a\b\u0012\u0004\u0012\u00020&08J\u0006\u00109\u001a\u00020\u001fJ\u0006\u0010:\u001a\u00020\u001fJ\"\u0010;\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001f0(R*\u0010\u0003\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00060\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000c0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000c0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R-\u0010\u0012\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00060\u00050\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001f\u0010\u001a\u001a\u0010\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000c0\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u001f\u0010\u001c\u001a\u0010\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000c0\u00138F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015¨\u0006="],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/player/PlayerGeneratorViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_currentLinks", "Landroidx/lifecycle/MutableLiveData;", "", "Lkotlin/Pair;", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "Lcom/lagradost/cloudstream3/utils/ExtractorUri;", "_currentSubs", "Lcom/lagradost/cloudstream3/ui/player/SubtitleData;", "_loadingLinks", "Lcom/lagradost/cloudstream3/mvvm/Resource;", "", "_notifyData", "", "currentJob", "Lkotlinx/coroutines/Job;", "currentLinks", "Landroidx/lifecycle/LiveData;", "getCurrentLinks", "()Landroidx/lifecycle/LiveData;", "currentSubs", "getCurrentSubs", "generator", "Lcom/lagradost/cloudstream3/ui/player/IGenerator;", "loadingLinks", "getLoadingLinks", "notifyData", "getNotifyData", "addSubtitles", "", "file", "attachGenerator", "newGenerator", "extrasZipSubtitle", "subtitleFileZip", "fileDir", "", "callback", "Lkotlin/Function1;", "getId", "", "()Ljava/lang/Integer;", "getMeta", "getNextMeta", "hasNextEpisode", "()Ljava/lang/Boolean;", "loadLinks", "clearCache", "isCasting", "episode", "loadLinksNext", "loadLinksPrev", "notifyToPlayer", "listSubPath", "", "preLoadNextLinks", "refreshData", "uploadFileSub", "Companion", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.player.PlayerGeneratorViewModel */ /* loaded from: classes3.dex */
class PlayerGeneratorViewModel constructor() : ViewModel() {
    val _currentLinks: MutableLiveData<Set<Tuples<ExtractorLink, ExtractorUri>>>
    val _currentSubs: MutableLiveData<Set<SubtitleData>>
    val _loadingLinks: MutableLiveData<Resource<Boolean>>
    private val _notifyData: MutableLiveData<Resource<Object>>
    private var currentJob: Job? = null
    private val currentLinks: LiveData<Set<Tuples<ExtractorLink, ExtractorUri>>>
    private val currentSubs: LiveData<Set<SubtitleData>>
    var generator: IGenerator? = null
    private val loadingLinks: LiveData<Resource<Boolean>>
    fun refreshData() {}

    /* compiled from: PlayerGeneratorViewModel.kt */
    @Metadata(
        m108d1 = ["\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/player/PlayerGeneratorViewModel\$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.player.PlayerGeneratorViewModel$Companion */ /* loaded from: classes3.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        val tAG: String
            get() {
                return PlayerGeneratorViewModel.Companion.TAG
            }
    }

    init {
        val mutableLiveData: MutableLiveData<Set<Tuples<ExtractorLink, ExtractorUri>>> =
            MutableLiveData<Set<Tuples<ExtractorLink, ExtractorUri>>>(SetsKt.emptySet<Any>())
        _currentLinks = mutableLiveData
        currentLinks = mutableLiveData
        val mutableLiveData2: MutableLiveData<Set<SubtitleData>> =
            MutableLiveData<Set<SubtitleData>>(SetsKt.emptySet<Any>())
        _currentSubs = mutableLiveData2
        currentSubs = mutableLiveData2
        val mutableLiveData3: MutableLiveData<Resource<Boolean>> =
            MutableLiveData<Resource<Boolean>>()
        _loadingLinks = mutableLiveData3
        loadingLinks = mutableLiveData3
        _notifyData = MutableLiveData<Resource<Object>>()
    }

    fun getCurrentLinks(): LiveData<Set<Tuples<ExtractorLink, ExtractorUri>>> {
        return currentLinks
    }

    fun getCurrentSubs(): LiveData<Set<SubtitleData>> {
        return currentSubs
    }

    fun getLoadingLinks(): LiveData<Resource<Boolean>> {
        return loadingLinks
    }

    val notifyData: LiveData<Resource<Object>>
        get() {
            return _notifyData
        }

    fun notifyToPlayer(listSubPath: List<String?>?) {
        Intrinsics.checkNotNullParameter(listSubPath, "listSubPath")
        _notifyData.postValue(Resource.Success<Any?>(listSubPath))
    }

    val id: Integer?
        get() {
            val iGenerator: IGenerator? = generator
            if (iGenerator != null) {
                return iGenerator.getCurrentId()
            }
            return null
        }

    fun loadLinks(i: Int) {
        val iGenerator: IGenerator? = generator
        if (iGenerator != null) {
            iGenerator.mo8669goto(i)
        }
        PlayerGeneratorViewModel.Companion.`loadLinks$default`(this, false, false, 3, null)
    }

    fun loadLinksPrev() {
        Log.i(PlayerGeneratorViewModel.Companion.TAG, "loadLinksPrev")
        val iGenerator: IGenerator? = generator
        val z: Boolean = true
        if (if ((iGenerator == null || !iGenerator.hasPrev())) false else false) {
            val iGenerator2: IGenerator? = generator
            if (iGenerator2 != null) {
                iGenerator2.prev()
            }
            PlayerGeneratorViewModel.Companion.`loadLinks$default`(this, false, false, 3, null)
        }
    }

    fun loadLinksNext() {
        Log.i(PlayerGeneratorViewModel.Companion.TAG, "loadLinksNext")
        val iGenerator: IGenerator? = generator
        val z: Boolean = true
        if (if ((iGenerator == null || !iGenerator.hasNext())) false else false) {
            val iGenerator2: IGenerator? = generator
            if (iGenerator2 != null) {
                iGenerator2.next()
            }
            PlayerGeneratorViewModel.Companion.`loadLinks$default`(this, false, false, 3, null)
        }
    }

    fun hasNextEpisode(): Boolean? {
        val iGenerator: IGenerator? = generator
        if (iGenerator != null) {
            return Boolean.valueOf(iGenerator.hasNext())
        }
        return null
    }

    fun preLoadNextLinks() {
        val `launch$default`: Job
        Log.i(PlayerGeneratorViewModel.Companion.TAG, "preLoadNextLinks")
        val job: Job? = currentJob
        if (job != null) {
            Job.DefaultImpls.`cancel$default`(
                job,
                null as CancellationException?,
                1,
                null as Object?
            )
        }
        `launch$default` = BuildersKt__Builders_commonKt.`launch$default`(
            ViewModelKt.getViewModelScope(this),
            null,
            null,
            `PlayerGeneratorViewModel$preLoadNextLinks$1`(this, null),
            3,
            null
        )
        currentJob = `launch$default`
    }

    val meta: Object
        get() {
            return ArchComponentExt.normalSafeApiCall<Object>(
                `PlayerGeneratorViewModel$getMeta$1`(
                    this
                )
            )
        }
    val nextMeta: Object
        get() {
            return ArchComponentExt.normalSafeApiCall<Object>(
                `PlayerGeneratorViewModel$getNextMeta$1`(this)
            )
        }

    fun attachGenerator(iGenerator: IGenerator?) {
        if (generator == null) {
            generator = iGenerator
        }
    }

    fun addSubtitles(file: Set<SubtitleData?>?) {
        Intrinsics.checkNotNullParameter(file, "file")
        var value: Set<SubtitleData?>? = _currentSubs.getValue()
        if (value == null) {
            value = SetsKt.emptySet<Any>()
        }
        val set: Set<SubtitleData> =
            CollectionsKt.toSet(CollectionsKt.distinct(SetsKt.plus(value, file as Iterable?)))
        if (Intrinsics.areEqual(set, value)) {
            return
        }
        _currentSubs.postValue(set)
        Log.d("BLUE", "addSubtitles postValue")
    }

    fun loadLinks(z: Boolean, z2: Boolean) {
        val `launch$default`: Job
        Log.i(PlayerGeneratorViewModel.Companion.TAG, "loadLinks")
        val job: Job? = currentJob
        if (job != null) {
            Job.DefaultImpls.`cancel$default`(
                job,
                null as CancellationException?,
                1,
                null as Object?
            )
        }
        `launch$default` = BuildersKt__Builders_commonKt.`launch$default`(
            ViewModelKt.getViewModelScope(this),
            null,
            null,
            `PlayerGeneratorViewModel$loadLinks$1`(this, z, z2, null),
            3,
            null
        )
        currentJob = `launch$default`
    }

    fun uploadFileSub(file: String?, callback: Function1<SubtitleData?, Unit>) {
        Intrinsics.checkNotNullParameter(file, "file")
        Intrinsics.checkNotNullParameter(callback, "callback")
        Log.d("BLUE uploadFileSub", String.valueOf(file))
        SubtitleBrowserRepository().uploadFile(
            File(file),
            `PlayerGeneratorViewModel$uploadFileSub$1`(this, callback)
        )
    }

    fun extrasZipSubtitle(
        subtitleFileZip: SubtitleData,
        fileDir: String?,
        callback: Function1<SubtitleData?, Unit>
    ) {
        Intrinsics.checkNotNullParameter(subtitleFileZip, "subtitleFileZip")
        Intrinsics.checkNotNullParameter(fileDir, "fileDir")
        Intrinsics.checkNotNullParameter(callback, "callback")
        BuildersKt__Builders_commonKt.`launch$default`(
            ViewModelKt.getViewModelScope(this),
            Dispatchers.getIO(),
            null,
            `PlayerGeneratorViewModel$extrasZipSubtitle$1`(
                subtitleFileZip,
                fileDir,
                this,
                callback,
                null
            ),
            2,
            null
        )
    }

    companion object {
        val Companion: Companion = Companion(null)
        private val TAG: String = "PlayViewGen"
        fun  /* synthetic */`loadLinks$default`(
            playerGeneratorViewModel: PlayerGeneratorViewModel,
            z: Boolean,
            z2: Boolean,
            i: Int,
            obj: Object?
        ) {
            var z: Boolean = z
            var z2: Boolean = z2
            if ((i and 1) != 0) {
                z = false
            }
            if ((i and 2) != 0) {
                z2 = false
            }
            playerGeneratorViewModel.loadLinks(z, z2)
        }
    }
}