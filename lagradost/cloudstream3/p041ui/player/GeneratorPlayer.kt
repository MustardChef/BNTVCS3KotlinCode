package com.lagradost.cloudstream3.p041ui.player

import android.app.Activity
import androidx.lifecycle.Observer
import androidx.navigation.fragment.Fragment
import com.anggrayudi.storage.file.MimeType
import com.lagradost.cloudstream3.mvvm.Resource
import com.lagradost.cloudstream3.utils.Qualities
import com.phimhd.Constants
import kotlin.jvm.functions.Functions
import kotlin.jvm.internal.Intrinsics

/* compiled from: GeneratorPlayer.kt */
@Metadata(
    m108d1 = ["\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 q2\u00020\u0001:\u0002qrB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u000cH\u0002J\b\u00106\u001a\u00020\u0015H\u0002J\b\u00107\u001a\u00020\u0015H\u0002J\b\u00108\u001a\u000204H\u0002J\u0016\u00109\u001a\u0002042\u000c\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000c0;H\u0016J(\u0010<\u001a\u0004\u0018\u00010\u000c2\u000c\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000c0\u00042\u0006\u0010=\u001a\u00020\u00152\u0006\u0010>\u001a\u00020\u0015H\u0002J\b\u0010?\u001a\u00020@H\u0002J\b\u0010A\u001a\u00020!H\u0002J\b\u0010B\u001a\u00020CH\u0002J\u0012\u0010D\u001a\u0002042\b\u0010E\u001a\u0004\u0018\u00010\u0006H\u0002J*\u0010F\u001a\u0002042\u0018\u0010G\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00052\u0006\u0010H\u001a\u00020\u0015H\u0002J\b\u0010I\u001a\u000204H\u0016J\b\u0010J\u001a\u000204H\u0016J\b\u0010K\u001a\u000204H\u0002J\b\u0010L\u001a\u00020\u0015H\u0002J&\u0010M\u001a\u0004\u0018\u00010N2\u0006\u0010O\u001a\u00020P2\b\u0010Q\u001a\u0004\u0018\u00010R2\b\u0010S\u001a\u0004\u0018\u00010TH\u0016J\b\u0010U\u001a\u000204H\u0016J\b\u0010V\u001a\u000204H\u0016J\b\u0010W\u001a\u000204H\u0016J\u001a\u0010X\u001a\u0002042\u0006\u0010Y\u001a\u00020N2\b\u0010S\u001a\u0004\u0018\u00010TH\u0016J-\u0010Z\u001a\u0002042\u0006\u0010[\u001a\u00020\\2\b\u0010]\u001a\u0004\u0018\u00010C2\u000c\u0010^\u001a\b\u0012\u0004\u0012\u0002040_H\u0016¢\u0006\u0002\u0010`J\b\u0010a\u001a\u000204H\u0002J\u001c\u0010b\u001a\u0002042\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u0005H\u0016J\u001c\u0010d\u001a\u0002042\u0012\u0010e\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020C0\u0005H\u0016J\b\u0010f\u001a\u000204H\u0016J\u001e\u0010g\u001a\u0002042\u0014\u0010c\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0005H\u0007J\u0012\u0010h\u001a\u00020\u00152\b\u0010i\u001a\u0004\u0018\u00010\u000cH\u0002J\b\u0010j\u001a\u000204H\u0007J\b\u0010k\u001a\u000204H\u0016J(\u0010l\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00050;2\b\b\u0002\u0010m\u001a\u00020\u0015H\u0002J\b\u0010n\u001a\u000204H\u0002J\b\u0010o\u001a\u000204H\u0002J\u0012\u0010p\u001a\u0002042\b\u0010S\u001a\u0004\u0018\u00010TH\u0002R$\u0010\u0003\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000c0\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001f\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R(\u0010(\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020! +*\n\u0012\u0004\u0012\u00020!\u0018\u00010*0*0)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082.¢\u0006\u0002\n\u0000¨\u0006s"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/player/GeneratorPlayer;", "Lcom/lagradost/cloudstream3/ui/player/FullScreenPlayer;", "()V", "currentLinks", "", "Lkotlin/Pair;", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "Lcom/lagradost/cloudstream3/utils/ExtractorUri;", "currentMeta", "", "currentSelectedLink", "currentSelectedSubtitles", "Lcom/lagradost/cloudstream3/ui/player/SubtitleData;", "currentSubs", "currentVerifyLink", "Lkotlinx/coroutines/Job;", "getCurrentVerifyLink", "()Lkotlinx/coroutines/Job;", "setCurrentVerifyLink", "(Lkotlinx/coroutines/Job;)V", "isActive", "", "isNextEpisode", "limitTitle", "", "maxEpisodeSet", "getMaxEpisodeSet", "()Ljava/lang/Integer;", "setMaxEpisodeSet", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "nextMeta", "preferredAutoSelectSubtitles", "", "selectSourceDialog", "Landroidx/appcompat/app/AlertDialog;", "getSelectSourceDialog", "()Landroidx/appcompat/app/AlertDialog;", "setSelectSourceDialog", "(Landroidx/appcompat/app/AlertDialog;)V", "subsPathPicker", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "sync", "Lcom/lagradost/cloudstream3/ui/result/SyncViewModel;", "titleRez", "viewModel", "Lcom/lagradost/cloudstream3/ui/player/PlayerGeneratorViewModel;", "viewModelBrowserSubtitle", "Lcom/lagradost/cloudstream3/ui/browser/SubtitleBrowserViewModel;", "addAndSelectSubtitles", "", "subtitleData", "autoSelectFromDownloads", "autoSelectFromSettings", "autoSelectSubtitles", "embeddedSubtitlesFetched", "subtitles", "", "getAutoSelectSubtitle", "settings", "downloads", "getMetaData", "Lcom/lagradost/cloudstream3/ui/player/GeneratorPlayer\$TempMetaData;", "getPlayerVideoTitle", "getPos", "", "loadExtractorJob", "extractorLink", "loadLink", "link", "sameEpisode", "nextEpisode", "nextMirror", "noLinksFound", "noSubtitles", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onDestroyView", "onResume", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "openOnlineSubPicker", "context", "Landroid/content/Context;", "imdbId", "dismissCallback", "Lkotlin/Function0;", "(Landroid/content/Context;Ljava/lang/Long;Lkotlin/jvm/functions/Function0;)V", "openSubPicker", "playerDimensionsLoaded", "widthHeight", "playerPositionChanged", "posDur", "prevEpisode", "setPlayerDimen", "setSubtitles", "sub", "setTitle", "showMirrorsDialogue", "sortLinks", "useQualitySettings", "startLoading", "startPlayer", "unwrapBundle", "Companion", "TempMetaData", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.player.GeneratorPlayer */ /* loaded from: classes3.dex */
class GeneratorPlayer constructor() : FullScreenPlayer() {
    private var currentMeta: Object? = null
    private var currentSelectedLink: Tuples<out ExtractorLink, ExtractorUri>? = null
    private var currentSelectedSubtitles: SubtitleData? = null
    private var currentVerifyLink: Job? = null
    private var isActive: Boolean = false
    private var isNextEpisode: Boolean = false
    private var limitTitle: Int = 0
    var maxEpisodeSet: Integer? = null
    private var nextMeta: Object? = null
    private var preferredAutoSelectSubtitles: String? = null
    private var selectSourceDialog: AlertDialog? = null
    private val subsPathPicker: ActivityResultLauncher<Array<String>>
    private var sync: SyncViewModel? = null
    private var viewModel: PlayerGeneratorViewModel? = null
    private var viewModelBrowserSubtitle: SubtitleBrowserViewModel? = null
    override var `_$_findViewCache`: Map<Integer, View> = LinkedHashMap()
    private var titleRez: Int = 3
    private val currentLinks: Set<Tuples<out ExtractorLink, ExtractorUri>> = SetsKt.emptySet<Any>()
    val currentSubs: Set<SubtitleData> = SetsKt.emptySet<Any>()

    @Override // com.lagradost.cloudstream3.p041ui.player.FullScreenPlayer, com.lagradost.cloudstream3.p041ui.player.AbstractPlayerFragment
    public override fun `_$_clearFindViewByIdCache`() {
        this.`_$_findViewCache`.clear()
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.FullScreenPlayer, com.lagradost.cloudstream3.p041ui.player.AbstractPlayerFragment
    public override fun `_$_findCachedViewById`(i: Int): View? {
        var findViewById: View?
        val map: Map<Integer?, View?>? = this.`_$_findViewCache`
        val view: View? = map!!.get(Integer.valueOf(i))
        if (view == null) {
            val view2: View? = getView()
            if (view2 == null || (view2.findViewById(i).also({ findViewById = it })) == null) {
                return null
            }
            map.put(Integer.valueOf(i), findViewById)
            return findViewById
        }
        return view
    }

    /* compiled from: GeneratorPlayer.kt */
    @Metadata(
        m108d1 = ["\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042(\b\u0002\u0010\u0011\u001a\"\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012j\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000c\u0010\r¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/player/GeneratorPlayer\$Companion;", "", "()V", "lastUsedGenerator", "Lcom/lagradost/cloudstream3/ui/player/IGenerator;", "subsProviders", "", "Lcom/lagradost/cloudstream3/syncproviders/providers/OpenSubtitlesApi;", "getSubsProviders", "()Ljava/util/List;", "subsProvidersIsActive", "", "getSubsProvidersIsActive", "()Z", "newInstance", "Landroid/os/Bundle;", "generator", "syncData", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.player.GeneratorPlayer$Companion */ /* loaded from: classes3.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        fun newInstance(generator: IGenerator, hashMap: HashMap<String?, String?>?): Bundle {
            Intrinsics.checkNotNullParameter(generator, "generator")
            Log.i(CS3IPlayerKt.TAG, "newInstance = " + hashMap)
            GeneratorPlayer.Companion.lastUsedGenerator = generator
            val bundle: Bundle = Bundle()
            if (hashMap != null) {
                bundle.putSerializable("syncData", hashMap)
            }
            return bundle
        }

        val subsProviders: List<Any>
            get() {
                val arrayList: ArrayList = ArrayList()
                for (obj: Object in AccountManager.Companion.subtitleProviders) {
                    val openSubtitlesApi: OpenSubtitlesApi = obj as OpenSubtitlesApi
                    if (if ((openSubtitlesApi.getRequiresLogin() && openSubtitlesApi.loginInfo() == null)) false else true) {
                        arrayList.add(obj)
                    }
                }
                return arrayList
            }
        val subsProvidersIsActive: Boolean
            get() {
                return !subsProviders.isEmpty()
            }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`newInstance$default`(
                companion: GeneratorPlayer.Companion,
                iGenerator: IGenerator,
                hashMap: HashMap?,
                i: Int,
                obj: Object?
            ): Bundle {
                var hashMap: HashMap? = hashMap
                if ((i and 2) != 0) {
                    hashMap = null
                }
                return companion.newInstance(iGenerator, hashMap)
            }
        }
    }

    init {
        val registerForActivityResult: ActivityResultLauncher<Array<String>> =
            registerForActivityResult(OpenDocument(), object : ActivityResultCallback<Any?> {
                // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$GeneratorPlayer$9ksNnf2uBMcOYiG6qtwlhg8lAww
                @Override // androidx.activity.result.ActivityResultCallback
                public override fun onActivityResult(obj: Object) {
                    Companion.`m8735subsPathPicker$lambda14`(this@GeneratorPlayer, obj as Uri?)
                }
            })
        Intrinsics.checkNotNullExpressionValue(
            registerForActivityResult,
            "registerForActivityResul…)\n            }\n        }"
        )
        subsPathPicker = registerForActivityResult
    }

    fun startLoading() {
        getPlayer().release()
        currentSelectedSubtitles = null
        isActive = false
        val materialButton: MaterialButton? =
            `_$_findCachedViewById`(C4761R.C4764id.overlay_loading_skip_button) as MaterialButton?
        if (materialButton != null) {
            materialButton.setVisibility(8)
        }
        val frameLayout: FrameLayout? =
            `_$_findCachedViewById`(C4761R.C4764id.player_loading_overlay) as FrameLayout?
        if (frameLayout == null) {
            return
        }
        frameLayout.setVisibility(0)
    }

    private fun setSubtitles(subtitleData: SubtitleData?): Boolean {
        currentSelectedSubtitles = subtitleData
        return getPlayer().setPreferredSubtitles(subtitleData)
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.AbstractPlayerFragment
    public override fun embeddedSubtitlesFetched(subtitles: List<SubtitleData?>?) {
        Intrinsics.checkNotNullParameter(subtitles, "subtitles")
        var playerGeneratorViewModel: PlayerGeneratorViewModel? = viewModel
        if (playerGeneratorViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel")
            playerGeneratorViewModel = null
        }
        playerGeneratorViewModel!!.addSubtitles(CollectionsKt.toSet(subtitles))
    }

    private fun noSubtitles(): Boolean {
        return setSubtitles(null)
    }

    private val pos: Long
        private get() {
            val dataStoreHelper: DataStoreHelper = DataStoreHelper.INSTANCE
            var playerGeneratorViewModel: PlayerGeneratorViewModel? = viewModel
            if (playerGeneratorViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel")
                playerGeneratorViewModel = null
            }
            val viewPos: PosDur? = dataStoreHelper.getViewPos(playerGeneratorViewModel.getId())
            if ((viewPos == null) || (viewPos.duration == 0L) || ((viewPos.position * 100) / viewPos.duration > 95)) {
                return 0L
            }
            return viewPos.position
        }

    fun getCurrentVerifyLink(): Job? {
        return currentVerifyLink
    }

    fun setCurrentVerifyLink(job: Job?) {
        currentVerifyLink = job
    }

    private fun loadExtractorJob(extractorLink: ExtractorLink?) {
        val job: Job? = currentVerifyLink
        if (job != null) {
            Job.DefaultImpls.`cancel$default`(
                job,
                null as CancellationException?,
                1,
                null as Object?
            )
        }
        if (extractorLink != null) {
            currentVerifyLink = Coroutines.INSTANCE.ioSafe(
                `GeneratorPlayer$loadExtractorJob$1$1`(
                    extractorLink,
                    null
                )
            )
        }
    }

    private fun loadLink(tuples: Tuples<out ExtractorLink, ExtractorUri>?, z: Boolean) {
        val valueOf: Long?
        if (tuples == null) {
            return
        }
        val frameLayout: FrameLayout? =
            `_$_findCachedViewById`(C4761R.C4764id.player_loading_overlay) as FrameLayout?
        if (frameLayout != null) {
            frameLayout.setVisibility(8)
        }
        uiReset()
        currentSelectedLink = tuples
        var playerGeneratorViewModel: PlayerGeneratorViewModel? = viewModel
        if (playerGeneratorViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel")
            playerGeneratorViewModel = null
        }
        currentMeta = playerGeneratorViewModel.getMeta()
        var playerGeneratorViewModel2: PlayerGeneratorViewModel? = viewModel
        if (playerGeneratorViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel")
            playerGeneratorViewModel2 = null
        }
        nextMeta = playerGeneratorViewModel2.getNextMeta()
        isActive = true
        setPlayerDimen(null)
        setTitle()
        loadExtractorJob(tuples.getFirst())
        val context: Context? = getContext()
        if (context != null) {
            val component1: ExtractorLink = tuples.component1()
            val component2: ExtractorUri = tuples.component2()
            val player: IPlayer? = getPlayer()
            if (z) {
                valueOf = null
            } else {
                valueOf = Long.valueOf(if (isNextEpisode) 0L else pos)
            }
            val set: Set<SubtitleData> = currentSubs
            val subtitleData: SubtitleData? = if (z) currentSelectedSubtitles else null
            IPlayer.DefaultImpls.`loadPlayer$default`(
                player,
                context,
                z,
                component1,
                component2,
                valueOf,
                set,
                if (subtitleData == null) getAutoSelectSubtitle(set, true, true) else subtitleData,
                `_$_findCachedViewById`(C4761R.C4764id.player_view) as PlayerView?,
                null,
                256,
                null
            )
        }
    }

    private fun sortLinks(z: Boolean): List<Tuples<ExtractorLink, ExtractorUri>> {
        return CollectionsKt.sortedWith(currentLinks, object : Comparator() {
            // from class: com.lagradost.cloudstream3.ui.player.GeneratorPlayer$sortLinks$$inlined$sortedBy$1
            @Override // java.util.Comparator
            fun compare(t: T, t2: T): Int {
                val extractorLink: ExtractorLink? =
                    (t as Tuples<*, *>).component1() as ExtractorLink?
                var quality: Int =
                    if (extractorLink != null) extractorLink.quality else Qualities.Unknown.value
                if (z && quality > getCurrentPrefQuality()) {
                    quality = (getCurrentPrefQuality() - quality) - 1
                }
                val valueOf: Integer = Integer.valueOf(-quality)
                val extractorLink2: ExtractorLink? =
                    (t2 as Tuples<*, *>).component1() as ExtractorLink?
                var quality2: Int =
                    if (extractorLink2 != null) extractorLink2.quality else Qualities.Unknown.value
                if (z && quality2 > getCurrentPrefQuality()) {
                    quality2 = (getCurrentPrefQuality() - quality2) - 1
                }
                return ComparisonsKt.compareValues(valueOf, Integer.valueOf(-quality2))
            }
        })
    }

    /* compiled from: GeneratorPlayer.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J2\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000c\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000c\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000b¨\u0006\u001d"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/player/GeneratorPlayer\$TempMetaData;", "", "episode", "", "season", "name", "", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getEpisode", "()Ljava/lang/Integer;", "setEpisode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getSeason", "setSeason", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/lagradost/cloudstream3/ui/player/GeneratorPlayer\$TempMetaData;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.player.GeneratorPlayer$TempMetaData */ /* loaded from: classes3.dex */
    class TempMetaData constructor(num: Integer?, num2: Integer?, str: String?) {
        private var episode: Integer?
        var name: String?
        private var season: Integer?
        operator fun component1(): Integer? {
            return episode
        }

        operator fun component2(): Integer? {
            return season
        }

        operator fun component3(): String? {
            return name
        }

        fun copy(num: Integer?, num2: Integer?, str: String?): TempMetaData {
            return TempMetaData(num, num2, str)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is TempMetaData) {
                val tempMetaData: TempMetaData = obj
                return Intrinsics.areEqual(episode, tempMetaData.episode) && Intrinsics.areEqual(
                    season, tempMetaData.season
                ) && Intrinsics.areEqual(name, tempMetaData.name)
            }
            return false
        }

        override fun hashCode(): Int {
            val num: Integer? = episode
            val hashCode: Int = (if (num == null) 0 else num.hashCode()) * 31
            val num2: Integer? = season
            val hashCode2: Int = (hashCode + (if (num2 == null) 0 else num2.hashCode())) * 31
            val str: String? = name
            return hashCode2 + (if (str != null) str.hashCode() else 0)
        }

        override fun toString(): String {
            return "TempMetaData(episode=" + episode + ", season=" + season + ", name=" + name + ')'
        }

        init {
            episode = num
            season = num2
            name = str
        }

        @JvmOverloads
                /* synthetic */   constructor(
            num: Integer? = null,
            num2: Integer? = null,
            str: String? = null,
            i: Int = 7,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if ((i and 1) != 0) null else num,
            if ((i and 2) != 0) null else num2,
            if ((i and 4) != 0) null else str
        ) {
        }

        fun getEpisode(): Integer? {
            return episode
        }

        fun setEpisode(num: Integer?) {
            episode = num
        }

        fun getSeason(): Integer? {
            return season
        }

        fun setSeason(num: Integer?) {
            season = num
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                tempMetaData: TempMetaData,
                num: Integer?,
                num2: Integer?,
                str: String?,
                i: Int,
                obj: Object?
            ): TempMetaData {
                var num: Integer? = num
                var num2: Integer? = num2
                var str: String? = str
                if ((i and 1) != 0) {
                    num = tempMetaData.episode
                }
                if ((i and 2) != 0) {
                    num2 = tempMetaData.season
                }
                if ((i and 4) != 0) {
                    str = tempMetaData.name
                }
                return tempMetaData.copy(num, num2, str)
            }
        }
    }

    private val metaData: TempMetaData
        private get() {
            val tempMetaData: TempMetaData = TempMetaData(null, null, null, 7, null)
            val obj: Object? = currentMeta
            if (obj is ResultEpisode) {
                val resultEpisode: ResultEpisode? = obj as ResultEpisode?
                if (!MainAPIKt.isMovieType(resultEpisode.getTvType())) {
                    tempMetaData.setEpisode(Integer.valueOf(resultEpisode.getEpisode()))
                    tempMetaData.setSeason(resultEpisode.getSeason())
                }
                tempMetaData.name = resultEpisode.getHeaderName()
            } else if (obj is ExtractorUri) {
                val extractorUri: ExtractorUri? = obj as ExtractorUri?
                val tvType: TvType? = extractorUri.getTvType()
                var z: Boolean = false
                if (tvType != null && !MainAPIKt.isMovieType(tvType)) {
                    z = true
                }
                if (z) {
                    tempMetaData.setEpisode(extractorUri.getEpisode())
                    tempMetaData.setSeason(extractorUri.getSeason())
                }
                tempMetaData.name = extractorUri.headerName
            }
            return tempMetaData
        }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List, T] */ /* JADX WARN: Type inference failed for: r0v18, types: [T, java.lang.String] */
    @Override // com.lagradost.cloudstream3.p041ui.player.FullScreenPlayer
    public override fun openOnlineSubPicker(
        context: Context?,
        l: Long?,
        dismissCallback: Functions<Unit>?
    ) {
        Intrinsics.checkNotNullParameter(context, "context")
        Intrinsics.checkNotNullParameter(dismissCallback, "dismissCallback")
        val subsProviders: List<OpenSubtitlesApi> = Companion.Companion.getSubsProviders()
        val dialog: Dialog = Dialog(context, R.style.AlertDialogCustomBlack)
        dialog.setContentView(R.layout.dialog_online_subtitles)
        val arrayAdapter: ArrayAdapter =
            ArrayAdapter(dialog.getContext(), R.layout.sort_bottom_single_choice)
        dialog.show()
        (dialog.findViewById(C4761R.C4764id.cancel_btt) as MaterialButton).setOnClickListener(object :
            OnClickListener() {
            // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$GeneratorPlayer$Z2PmITOwsBX5cYFogTkJrxaeybU
            @Override // android.view.View.OnClickListener
            fun onClick(view: View?) {
                Companion.`m8720openOnlineSubPicker$lambda3`(dialog, view)
            }
        })
        (dialog.findViewById(C4761R.C4764id.subtitle_adapter) as ListView).setChoiceMode(1)
        (dialog.findViewById(C4761R.C4764id.subtitle_adapter) as ListView).setAdapter(arrayAdapter as ListAdapter?)
        val adapter: ListAdapter =
            (dialog.findViewById(C4761R.C4764id.subtitle_adapter) as ListView).getAdapter()
        val arrayAdapter2: ArrayAdapter? =
            if (adapter is ArrayAdapter) adapter as ArrayAdapter? else null
        val objectRef: ObjectRef<*> = ObjectRef<Any?>()
        objectRef.element = CollectionsKt.emptyList<Any>()
        val objectRef2: ObjectRef<*> = ObjectRef<Any?>()
        (dialog.findViewById(C4761R.C4764id.subtitle_adapter) as ListView).setOnItemClickListener(
            object : OnItemClickListener() {
                // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$GeneratorPlayer$CWYj6Qur5dADk0kS32qq6auzDKU
                @Override // android.widget.AdapterView.OnItemClickListener
                fun onItemClick(adapterView: AdapterView?, view: View?, i: Int, j: Long) {
                    Companion.`m8721openOnlineSubPicker$lambda4`(
                        this@ObjectRef,
                        objectRef,
                        adapterView,
                        view,
                        i,
                        j
                    )
                }
            })
        val objectRef3: ObjectRef<*> = ObjectRef<Any?>()
        objectRef3.element = SubtitlesFragment.Companion.Companion.getAutoSelectLanguageISO639_1()
        val metaData: TempMetaData = metaData
        val valueOf: ColorStateList = ColorStateList.valueOf(
            UIHelper.INSTANCE.colorFromAttribute(
                context,
                R.attr.colorAccent
            )
        )
        Intrinsics.checkNotNullExpressionValue(
            valueOf,
            "valueOf(context.colorFro…bute(R.attr.colorAccent))"
        )
        (dialog.findViewById(C4761R.C4764id.search_loading_bar) as ContentLoadingProgressBar).setProgressTintList(
            valueOf
        )
        (dialog.findViewById(C4761R.C4764id.search_loading_bar) as ContentLoadingProgressBar).setIndeterminateTintList(
            valueOf
        )
        (dialog.findViewById(C4761R.C4764id.subtitles_search) as SearchView).setOnQueryTextListener(
            object : OnQueryTextListener {
                // from class: com.lagradost.cloudstream3.ui.player.GeneratorPlayer$openOnlineSubPicker$3
                @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
                public override fun onQueryTextChange(str: String): Boolean {
                    return true
                }

                @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
                public override fun onQueryTextSubmit(str: String): Boolean {
                    val contentLoadingProgressBar: ContentLoadingProgressBar? =
                        dialog.findViewById(C4761R.C4764id.search_loading_bar) as ContentLoadingProgressBar?
                    if (contentLoadingProgressBar != null) {
                        contentLoadingProgressBar.show()
                    }
                    Coroutines.INSTANCE.ioSafe(
                        `GeneratorPlayer$openOnlineSubPicker$3$onQueryTextSubmit$1`(
                            str,
                            metaData,
                            objectRef3,
                            l,
                            subsProviders,
                            this,
                            dialog,
                            objectRef,
                            arrayAdapter2,
                            null
                        )
                    )
                    return true
                }
            })
        (dialog.findViewById(C4761R.C4764id.search_filter) as ImageView).setOnClickListener(object :
            OnClickListener() {
            // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$GeneratorPlayer$j5KA0A1nytbQkQum7eI503BIeXE
            @Override // android.view.View.OnClickListener
            fun onClick(view: View?) {
                Companion.`m8722openOnlineSubPicker$lambda8`(
                    this@GeneratorPlayer,
                    objectRef3,
                    context,
                    dialog,
                    view
                )
            }
        })
        (dialog.findViewById(C4761R.C4764id.apply_btt) as MaterialButton).setOnClickListener(object :
            OnClickListener() {
            // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$GeneratorPlayer$ZF0iUlFlPZTUabFaC9fmuu4LuQ4
            @Override // android.view.View.OnClickListener
            fun onClick(view: View?) {
                Companion.`m8718openOnlineSubPicker$lambda12`(
                    this@ObjectRef,
                    dialog,
                    subsProviders,
                    this,
                    view
                )
            }
        })
        dialog.setOnDismissListener(object : OnDismissListener() {
            // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$GeneratorPlayer$m2uNmmkgSsmvboVs2vQqwQdBh90
            @Override // android.content.DialogInterface.OnDismissListener
            fun onDismiss(dialogInterface: DialogInterface?) {
                Companion.`m8719openOnlineSubPicker$lambda13`(this@Functions, dialogInterface)
            }
        })
        dialog.show()
        (dialog.findViewById(C4761R.C4764id.subtitles_search) as SearchView).setQuery(
            metaData.name,
            true
        )
    }

    private fun openSubPicker() {
        try {
            subsPathPicker.launch(
                arrayOf<String>(
                    "text/plain",
                    "text/str",
                    MimeType.BINARY_FILE,
                    MimeTypes.TEXT_UNKNOWN,
                    MimeTypes.TEXT_VTT,
                    MimeTypes.TEXT_SSA,
                    MimeTypes.APPLICATION_TTML,
                    MimeTypes.APPLICATION_MP4VTT,
                    MimeTypes.APPLICATION_SUBRIP
                )
            )
        } catch (e: Exception) {
            ArchComponentExt.logError(e)
        }
    }

    fun addAndSelectSubtitles(subtitleData: SubtitleData) {
        val context: Context? = getContext()
        if (context == null) {
            return
        }
        setSubtitles(subtitleData)
        val mutableSet: Set<SubtitleData> = CollectionsKt.toMutableSet(currentSubs)
        mutableSet.add(subtitleData)
        getPlayer().setActiveSubtitles(mutableSet)
        getPlayer().reloadPlayer(context)
        var playerGeneratorViewModel: PlayerGeneratorViewModel? = viewModel
        if (playerGeneratorViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel")
            playerGeneratorViewModel = null
        }
        playerGeneratorViewModel!!.addSubtitles(SetsKt.setOf(subtitleData))
        val alertDialog: AlertDialog? = selectSourceDialog
        if (alertDialog != null) {
            UIHelper.INSTANCE.dismissSafe(alertDialog)
        }
        val stringCompanionObject: String.Companion = StringCompanionObject.INSTANCE
        val string: String = context.getString(R.string.player_loaded_subtitles)
        Intrinsics.checkNotNullExpressionValue(
            string,
            "ctx.getString(R.string.player_loaded_subtitles)"
        )
        val format: String =
            String.format(string, Arrays.copyOf(arrayOf(subtitleData.getName()), 1))
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)")
        CommonActivity.INSTANCE.showToast(getActivity() as Activity?, format, 1 as Integer?)
    }

    fun getSelectSourceDialog(): AlertDialog? {
        return selectSourceDialog
    }

    fun setSelectSourceDialog(alertDialog: AlertDialog?) {
        selectSourceDialog = alertDialog
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.FullScreenPlayer
    public override fun showMirrorsDialogue() {
        var name: String?
        var it: Iterator
        var num: Integer?
        try {
            currentSelectedSubtitles = getPlayer().getCurrentPreferredSubtitle()
            val context: Context? = getContext()
            if (context != null) {
                val isPlaying: Boolean = getPlayer().getIsPlaying()
                getPlayer().handleEvent(CSPlayerEvent.Pause)
                val sortSubs: List<SubtitleData> = MainAPIKt.sortSubs(currentSubs)
                val create: AlertDialog =
                    AlertDialog.Builder(context, R.style.AlertDialogCustomBlack)
                        .setView(R.layout.player_select_source_and_subs).create()
                Intrinsics.checkNotNullExpressionValue(create, "sourceBuilder.create()")
                selectSourceDialog = create
                create.show()
                val listView: ListView =
                    create.findViewById<View>(C4761R.C4764id.sort_providers) as ListView
                val listView2: ListView =
                    create.findViewById<View>(C4761R.C4764id.sort_subtitles) as ListView
                val inflate: View? = getLayoutInflater().inflate(
                    R.layout.sort_bottom_footer_add_choice,
                    null as ViewGroup?
                )
                if (inflate == null) {
                    throw NullPointerException("null cannot be cast to non-null type android.widget.TextView")
                }
                val textView: TextView = inflate as TextView
                textView.setText(context.getString(R.string.player_load_subtitles))
                textView.setOnClickListener(object : OnClickListener() {
                    // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$GeneratorPlayer$f_d5TNOEQpJ-Uq2z3ExiT_59iJI
                    @Override // android.view.View.OnClickListener
                    fun onClick(view: View?) {
                        Companion.`m8726showMirrorsDialogue$lambda30$lambda15`(
                            this@GeneratorPlayer,
                            view
                        )
                    }
                })
                listView2.addFooterView(textView)
                val booleanRef: BooleanRef = BooleanRef()
                booleanRef.element = true
                if (Companion.Companion.getSubsProvidersIsActive()) {
                    val inflate2: View? = getLayoutInflater().inflate(
                        R.layout.sort_bottom_footer_add_choice,
                        null as ViewGroup?
                    )
                    if (inflate2 == null) {
                        throw NullPointerException("null cannot be cast to non-null type android.widget.TextView")
                    }
                    val textView2: TextView = inflate2 as TextView
                    textView2.setText(context.getString(R.string.player_load_subtitles_online))
                    textView2.setOnClickListener(object : OnClickListener() {
                        // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$GeneratorPlayer$h6ocGA-TI494B60F1TtKIWEYXjY
                        @Override // android.view.View.OnClickListener
                        fun onClick(view: View?) {
                            Companion.`m8727showMirrorsDialogue$lambda30$lambda16`(
                                this@BooleanRef,
                                create,
                                this,
                                isPlaying,
                                view
                            )
                        }
                    })
                    listView2.addFooterView(textView2)
                }
                val inflate3: View? = getLayoutInflater().inflate(
                    R.layout.sort_bottom_footer_add_choice,
                    null as ViewGroup?
                )
                if (inflate3 == null) {
                    throw NullPointerException("null cannot be cast to non-null type android.widget.TextView")
                }
                val textView3: TextView = inflate3 as TextView
                textView3.setText(getString(R.string.open_browser_load_subtitle))
                textView3.setOnClickListener(object : OnClickListener() {
                    // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$GeneratorPlayer$1joU2_q0DUHDKF8kjXBp4aRuLig
                    @Override // android.view.View.OnClickListener
                    fun onClick(view: View?) {
                        Companion.`m8728showMirrorsDialogue$lambda30$lambda17`(
                            this@BooleanRef,
                            create,
                            this,
                            view
                        )
                    }
                })
                listView2.addFooterView(textView3)
                val intRef: IntRef = IntRef()
                val intRef2: IntRef = IntRef()
                val sortLinks: List<Tuples<ExtractorLink, ExtractorUri>> = sortLinks(false)
                if (sortLinks.isEmpty()) {
                    val linearLayout: LinearLayout? =
                        create.findViewById<View>(R.id.sort_sources_holder) as LinearLayout?
                    if (linearLayout != null) {
                        Intrinsics.checkNotNullExpressionValue(
                            linearLayout,
                            "findViewById<LinearLayou…R.id.sort_sources_holder)"
                        )
                        linearLayout.setVisibility(8)
                    }
                } else {
                    intRef2.element = CollectionsKt.indexOf(
                        sortLinks as List<Tuples<out ExtractorLink, ExtractorUri>?>?,
                        currentSelectedLink
                    )
                    intRef.element = intRef2.element
                    val arrayAdapter: ArrayAdapter =
                        ArrayAdapter(context, R.layout.sort_bottom_single_choice)
                    val list: List<Tuples<ExtractorLink, ExtractorUri>> = sortLinks
                    val arrayList: ArrayList =
                        ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10))
                    var it2: Iterator = list.iterator()
                    while (it2.hasNext()) {
                        val tuples: Tuples<*, *> = it2.next()
                        val extractorLink: ExtractorLink? = tuples.component1() as ExtractorLink?
                        val extractorUri: ExtractorUri? = tuples.component2() as ExtractorUri?
                        if (extractorLink == null || (extractorLink.name.also({
                                name = it
                            })) == null) {
                            name = if (extractorUri != null) extractorUri.name else "NULL"
                        }
                        val sb: StringBuilder = StringBuilder()
                        sb.append(name)
                        sb.append(' ')
                        val companion: Qualities.Companion = Qualities.Companion
                        if (extractorLink != null) {
                            val valueOf: Integer = Integer.valueOf(extractorLink.quality)
                            it = it2
                            num = valueOf
                        } else {
                            it = it2
                            num = null
                        }
                        sb.append(companion.getStringByInt(num))
                        arrayList.add(sb.toString())
                        it2 = it
                    }
                    arrayAdapter.addAll(arrayList)
                    listView.setChoiceMode(1)
                    listView.setAdapter(arrayAdapter as ListAdapter?)
                    listView.setSelection(intRef.element)
                    listView.setItemChecked(intRef.element, true)
                    listView.setOnItemClickListener(object : OnItemClickListener() {
                        // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$GeneratorPlayer$DvGEsU25_Egwcc3evOsdDZvDfQY
                        @Override // android.widget.AdapterView.OnItemClickListener
                        fun onItemClick(adapterView: AdapterView?, view: View?, i: Int, j: Long) {
                            Companion.`m8729showMirrorsDialogue$lambda30$lambda19`(
                                this@IntRef,
                                listView,
                                adapterView,
                                view,
                                i,
                                j
                            )
                        }
                    })
                }
                create.setOnDismissListener(object : OnDismissListener() {
                    // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$GeneratorPlayer$zRL1iQ76JXbh03oHfJ4NiO34uwE
                    @Override // android.content.DialogInterface.OnDismissListener
                    fun onDismiss(dialogInterface: DialogInterface?) {
                        Companion.`m8730showMirrorsDialogue$lambda30$lambda20`(
                            this@BooleanRef,
                            this,
                            isPlaying,
                            dialogInterface
                        )
                    }
                })
                val indexOf: Int = CollectionsKt.indexOf<SubtitleData>(
                    sortSubs as List<SubtitleData?>?,
                    currentSelectedSubtitles
                ) + 1
                val intRef3: IntRef = IntRef()
                intRef3.element = indexOf
                val arrayAdapter2: ArrayAdapter =
                    ArrayAdapter(context, R.layout.sort_bottom_single_choice)
                arrayAdapter2.add(getString(R.string.no_subtitles))
                val list2: List<SubtitleData> = sortSubs
                val arrayList2: ArrayList =
                    ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10))
                for (subtitleData: SubtitleData in list2) {
                    arrayList2.add(subtitleData.getName())
                }
                arrayAdapter2.addAll(arrayList2)
                listView2.setAdapter(arrayAdapter2 as ListAdapter?)
                listView2.setChoiceMode(1)
                listView2.setSelection(intRef3.element)
                listView2.setItemChecked(intRef3.element, true)
                listView2.setOnItemClickListener(object : OnItemClickListener() {
                    // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$GeneratorPlayer$gbeSUXRR7Il_GLmNMZ5x1iJS88E
                    @Override // android.widget.AdapterView.OnItemClickListener
                    fun onItemClick(adapterView: AdapterView?, view: View?, i: Int, j: Long) {
                        Companion.`m8731showMirrorsDialogue$lambda30$lambda22`(
                            this@IntRef,
                            listView2,
                            adapterView,
                            view,
                            i,
                            j
                        )
                    }
                })
                val materialButton: MaterialButton? =
                    create.findViewById<View>(C4761R.C4764id.cancel_btt) as MaterialButton?
                if (materialButton != null) {
                    materialButton.setOnClickListener(object : OnClickListener() {
                        // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$GeneratorPlayer$2Saf8xsphw-3frug7fXR5UDNxgw
                        @Override // android.view.View.OnClickListener
                        fun onClick(view: View?) {
                            Companion.`m8732showMirrorsDialogue$lambda30$lambda23`(
                                this@AlertDialog,
                                this,
                                view
                            )
                        }
                    })
                }
                val subtitles_encoding_format: TextView? =
                    create.findViewById<View>(C4761R.C4764id.subtitles_encoding_format) as TextView?
                if (subtitles_encoding_format != null) {
                    Intrinsics.checkNotNullExpressionValue(
                        subtitles_encoding_format,
                        "subtitles_encoding_format"
                    )
                    val defaultSharedPreferences: SharedPreferences =
                        PreferenceManager.getDefaultSharedPreferences(context)
                    val stringArray: Array<String> =
                        context.getResources().getStringArray(R.array.subtitles_encoding_list)
                    Intrinsics.checkNotNullExpressionValue(
                        stringArray,
                        "ctx.resources.getStringA….subtitles_encoding_list)"
                    )
                    val stringArray2: Array<String> =
                        context.getResources().getStringArray(R.array.subtitles_encoding_values)
                    Intrinsics.checkNotNullExpressionValue(
                        stringArray2,
                        "ctx.resources.getStringA…ubtitles_encoding_values)"
                    )
                    val indexOf2: Int = ArraysKt.indexOf(
                        stringArray2,
                        defaultSharedPreferences.getString(
                            context.getString(R.string.subtitles_encoding_key),
                            null
                        )
                    )
                    subtitles_encoding_format.setText(stringArray.get(if (indexOf2 == -1) 0 else indexOf2))
                }
                val linearLayout2: LinearLayout? =
                    create.findViewById<View>(C4761R.C4764id.subtitles_click_settings) as LinearLayout?
                if (linearLayout2 != null) {
                    linearLayout2.setOnClickListener(object : OnClickListener() {
                        // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$GeneratorPlayer$fx_p-zuyuXq9syLXmmvuece8EME
                        @Override // android.view.View.OnClickListener
                        fun onClick(view: View?) {
                            Companion.`m8733showMirrorsDialogue$lambda30$lambda25`(
                                context,
                                this,
                                booleanRef,
                                create,
                                isPlaying,
                                view
                            )
                        }
                    })
                }
                val materialButton2: MaterialButton? =
                    create.findViewById<View>(C4761R.C4764id.apply_btt) as MaterialButton?
                if (materialButton2 != null) {
                    materialButton2.setOnClickListener(object : OnClickListener() {
                        // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$GeneratorPlayer$w2IHyRlUB7cNUoCr0bw3sgPFAFg
                        @Override // android.view.View.OnClickListener
                        fun onClick(view: View?) {
                            Companion.`m8734showMirrorsDialogue$lambda30$lambda29`(
                                this@IntRef,
                                intRef2,
                                intRef3,
                                indexOf,
                                this,
                                sortSubs,
                                sortLinks,
                                create,
                                view
                            )
                        }
                    })
                }
            }
        } catch (e: Exception) {
            ArchComponentExt.logError(e)
        }
    }

    private fun noLinksFound() {
        CommonActivity.INSTANCE.showToast(getActivity(), R.string.no_links_found_toast, 0)
        val activity: FragmentActivity? = getActivity()
        if (activity != null) {
            UIHelper.INSTANCE.popCurrentPage(activity)
        }
    }

    fun startPlayer() {
        if (isActive) {
            return
        }
        val `sortLinks$default`: List = Companion.`sortLinks$default`(this, false, 1, null)
        if (`sortLinks$default`.isEmpty()) {
            noLinksFound()
        } else {
            loadLink(
                CollectionsKt.first<Any>(`sortLinks$default` as List<Object?>?) as Tuples<*, *>?,
                false
            )
        }
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.AbstractPlayerFragment
    public override fun nextEpisode() {
        isNextEpisode = true
        getPlayer().release()
        var playerGeneratorViewModel: PlayerGeneratorViewModel? = viewModel
        if (playerGeneratorViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel")
            playerGeneratorViewModel = null
        }
        playerGeneratorViewModel!!.loadLinksNext()
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.AbstractPlayerFragment
    public override fun prevEpisode() {
        isNextEpisode = true
        getPlayer().release()
        var playerGeneratorViewModel: PlayerGeneratorViewModel? = viewModel
        if (playerGeneratorViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel")
            playerGeneratorViewModel = null
        }
        playerGeneratorViewModel!!.loadLinksPrev()
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.AbstractPlayerFragment
    public override fun nextMirror() {
        val `sortLinks$default`: List = Companion.`sortLinks$default`(this, false, 1, null)
        if (`sortLinks$default`.isEmpty()) {
            noLinksFound()
            return
        }
        val indexOf: Int = CollectionsKt.indexOf(
            `sortLinks$default` as List<Tuples<out ExtractorLink?, ExtractorUri?>?>?,
            currentSelectedLink
        ) + 1
        if (indexOf >= `sortLinks$default`.size()) {
            noLinksFound()
        } else {
            loadLink(`sortLinks$default`.get(indexOf) as Tuples<*, *>?, true)
        }
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.FullScreenPlayer, com.lagradost.cloudstream3.p041ui.player.AbstractPlayerFragment, androidx.fragment.app.Fragment
    public override fun onDestroy() {
        ResultFragmentPhimHD.Companion.Companion.updateUI()
        val job: Job? = currentVerifyLink
        if (job != null) {
            Job.DefaultImpls.`cancel$default`(
                job,
                null as CancellationException?,
                1,
                null as Object?
            )
        }
        super.onDestroy()
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x0174, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.hasNextEpisode(), (java.lang.Object) true) != false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0146  */ /* JADX WARN: Removed duplicated region for block: B:152:0x015c  */ /* JADX WARN: Removed duplicated region for block: B:167:0x0184  */ /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    @Override // com.lagradost.cloudstream3.p041ui.player.AbstractPlayerFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */ public override fun playerPositionChanged(r24: Tuples<Long?, Long?>?) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.p041ui.player.GeneratorPlayer.playerPositionChanged(kotlin.Pair):void")
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x004c A[SYNTHETIC] */ /* JADX WARN: Removed duplicated region for block: B:155:0x00bc A[EDGE_INSN: B:155:0x00bc->B:129:0x00bc ?: BREAK  , SYNTHETIC] */ /* JADX WARN: Removed duplicated region for block: B:160:0x00fa A[SYNTHETIC] */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private fun getAutoSelectSubtitle(
        r13: Set<SubtitleData>,
        r14: Boolean,
        r15: Boolean
    ): SubtitleData {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.p041ui.player.GeneratorPlayer.getAutoSelectSubtitle(java.util.Set, boolean, boolean):com.lagradost.cloudstream3.ui.player.SubtitleData")
    }

    fun autoSelectFromSettings(): Boolean {
        var autoSelectSubtitle: SubtitleData?
        var ctx: Context?
        val str: String? = preferredAutoSelectSubtitles
        if ((str == null || str.length() === 0) || (getPlayer().getCurrentPreferredSubtitle() != null) || ((getAutoSelectSubtitle(
                currentSubs, true, false
            ).also({ autoSelectSubtitle = it })) == null) || ((getContext().also({
                ctx = it
            })) == null) || !setSubtitles(autoSelectSubtitle)
        ) {
            return false
        }
        val player: IPlayer? = getPlayer()
        Intrinsics.checkNotNullExpressionValue(ctx, "ctx")
        player!!.reloadPlayer(ctx)
        getPlayer().handleEvent(CSPlayerEvent.Play)
        return true
    }

    fun autoSelectFromDownloads(): Boolean {
        var autoSelectSubtitle: SubtitleData?
        var ctx: Context?
        if ((getPlayer().getCurrentPreferredSubtitle() != null) || ((getAutoSelectSubtitle(
                currentSubs, false, true
            ).also({ autoSelectSubtitle = it })) == null) || ((getContext().also({
                ctx = it
            })) == null) || !setSubtitles(autoSelectSubtitle)
        ) {
            return false
        }
        val player: IPlayer? = getPlayer()
        Intrinsics.checkNotNullExpressionValue(ctx, "ctx")
        player!!.reloadPlayer(ctx)
        getPlayer().handleEvent(CSPlayerEvent.Play)
        return true
    }

    fun autoSelectSubtitles() {
        ArchComponentExt.normalSafeApiCall<Unit>(`GeneratorPlayer$autoSelectSubtitles$1`(this))
    }

    private val playerVideoTitle: String
        private get() {
            val tvType: TvType?
            val str: String?
            val num: Integer?
            val num2: Integer?
            val str2: String
            val obj: Object? = currentMeta
            var str3: String? = null
            if (obj is ResultEpisode) {
                val resultEpisode: ResultEpisode? = obj as ResultEpisode?
                str3 = resultEpisode.getHeaderName()
                str = resultEpisode.getName()
                num = Integer.valueOf(resultEpisode.getEpisode())
                num2 = resultEpisode.getSeason()
                tvType = resultEpisode.getTvType()
            } else if (obj is ExtractorUri) {
                val extractorUri: ExtractorUri? = obj as ExtractorUri?
                str3 = extractorUri.headerName
                str = extractorUri.name
                num = extractorUri.getEpisode()
                num2 = extractorUri.getSeason()
                tvType = extractorUri.getTvType()
            } else {
                tvType = null
                str = null
                num = null
                num2 = null
            }
            var str4: String? = ""
            if (str3 != null) {
                val sb: StringBuilder = StringBuilder()
                sb.append(str3)
                if (!MainAPIKt.isEpisodeBased(tvType) || num == null) {
                    str2 = ""
                } else if (num2 == null) {
                    str2 = " - " + getString(R.string.episode) + ' ' + num
                } else {
                    str2 =
                        " \"" + getString(R.string.season_short) + num2 + ':' + getString(R.string.episode_short) + num + '\"'
                }
                sb.append(str2)
                val str5: String? = str
                if (!(str5 == null || StringsKt.isBlank(str5)) && !Intrinsics.areEqual(str, str3)) {
                    str4 = " - " + str
                }
                sb.append(str4)
                return sb.toString()
            }
            return ""
        }

    fun setTitle() {
        var playerVideoTitle: String = playerVideoTitle
        if (limitTitle < 0) {
            val textView: TextView? =
                `_$_findCachedViewById`(C4761R.C4764id.player_video_title) as TextView?
            if (textView != null) {
                textView.setVisibility(8)
            }
        } else {
            val length: Int = playerVideoTitle.length()
            val i: Int = limitTitle
            val i2: Int = length - i
            if (i > 0 && i2 > 3) {
                val sb: StringBuilder = StringBuilder()
                val substring: String = playerVideoTitle.substring(0, limitTitle - 1)
                Intrinsics.checkNotNullExpressionValue(
                    substring,
                    "this as java.lang.String…ing(startIndex, endIndex)"
                )
                sb.append(substring)
                sb.append("...")
                playerVideoTitle = sb.toString()
            }
        }
        val obj: Object? = currentMeta
        val resultEpisode: ResultEpisode? =
            if (obj is ResultEpisode) obj as ResultEpisode? else null
        val isFiller: Boolean? = if (resultEpisode != null) resultEpisode.isFiller() else null
        val frameLayout: FrameLayout? =
            `_$_findCachedViewById`(C4761R.C4764id.player_episode_filler_holder) as FrameLayout?
        if (frameLayout != null) {
            frameLayout.setVisibility(if (isFiller != null) isFiller.booleanValue() else if (false) 0 else 8)
        }
        val textView2: TextView? =
            `_$_findCachedViewById`(C4761R.C4764id.player_video_title) as TextView?
        if (textView2 != null) {
            textView2.setText(playerVideoTitle)
        }
        val iGenerator: IGenerator = Companion.lastUsedGenerator
        if (iGenerator is SponsorFileGenerator) {
            Objects.requireNonNull(
                iGenerator,
                "null cannot be cast to non-null type com.lagradost.cloudstream3.ui.player.SponsorFileGenerator"
            )
            if (Intrinsics.areEqual(iGenerator.getApiName(), ConfigHomeKt.IPTV_API_NAME)) {
                val textView3: TextView? =
                    `_$_findCachedViewById`(C4761R.C4764id.player_video_title_live) as TextView?
                if (textView3 != null) {
                    textView3.setVisibility(0)
                    val textView4: TextView? =
                        `_$_findCachedViewById`(C4761R.C4764id.player_video_title) as TextView?
                    if (textView4 != null) {
                        textView4.setVisibility(8)
                    }
                }
                val frameLayout2: FrameLayout? =
                    `_$_findCachedViewById`(C4761R.C4764id.player_episode_filler_holder) as FrameLayout?
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(0)
                    frameLayout2.setOnClickListener(object : OnClickListener() {
                        // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$GeneratorPlayer$PvSjDtSFJa71UexnvXjPn_tcUi8
                        @Override // android.view.View.OnClickListener
                        fun onClick(view: View?) {
                            Companion.`m8723setTitle$lambda44$lambda42`(this@GeneratorPlayer, view)
                        }
                    })
                    val materialButton: MaterialButton? =
                        `_$_findCachedViewById`(C4761R.C4764id.player_episode_filler) as MaterialButton?
                    if (materialButton != null) {
                        materialButton.setText(getString(R.string.bug_report_txt))
                    }
                    val materialButton2: MaterialButton? =
                        `_$_findCachedViewById`(C4761R.C4764id.player_episode_filler) as MaterialButton?
                    if (materialButton2 != null) {
                        materialButton2.setOnClickListener(object : OnClickListener() {
                            // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$GeneratorPlayer$Pntgmp_J-pj5m1OIqASiEhsyeEU
                            @Override // android.view.View.OnClickListener
                            fun onClick(view: View?) {
                                Companion.`m8724setTitle$lambda44$lambda43`(
                                    this@GeneratorPlayer,
                                    view
                                )
                            }
                        })
                    }
                }
            }
        }
    }

    fun setPlayerDimen(tuples: Tuples<Integer?, Integer?>?) {
        val str: String
        var name: String
        var second: ExtractorUri
        val str2: String
        var first: ExtractorLink
        if (tuples != null) {
            val intValue: Int = tuples.component1().intValue()
            val intValue2: Int = tuples.component2().intValue()
            val sb: StringBuilder = StringBuilder()
            sb.append(intValue)
            sb.append('x')
            sb.append(intValue2)
            str = sb.toString()
        } else {
            str = ""
        }
        val tuples2: Tuples<out ExtractorLink, ExtractorUri>? = currentSelectedLink
        if ((tuples2 == null) || ((tuples2.getFirst()
                .also({ first = it })) == null) || ((first.name.also({ name = it })) == null)
        ) {
            val tuples3: Tuples<out ExtractorLink, ExtractorUri>? = currentSelectedLink
            name = if ((tuples3 == null || (tuples3.getSecond()
                    .also({ second = it })) == null)
            ) "NULL" else second.name
        }
        val textView: TextView? =
            `_$_findCachedViewById`(C4761R.C4764id.player_video_title_rez) as TextView?
        if (textView == null) {
            return
        }
        val i: Int = titleRez
        if (i != 0) {
            if (i == 1) {
                str2 = str
            } else if (i == 2) {
                str2 = name
            } else if (i == 3) {
                str2 = name.toString() + " - " + str
            }
        }
        textView.setText(str2)
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.AbstractPlayerFragment
    public override fun playerDimensionsLoaded(widthHeight: Tuples<Integer?, Integer?>?) {
        Intrinsics.checkNotNullParameter(widthHeight, "widthHeight")
        setPlayerDimen(widthHeight)
    }

    private fun unwrapBundle(bundle: Bundle?) {
        Log.i(CS3IPlayerKt.TAG, "unwrapBundle = " + bundle)
        if (bundle != null) {
            var syncViewModel: SyncViewModel? = sync
            if (syncViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sync")
                syncViewModel = null
            }
            val serializable: Serializable = bundle.getSerializable("syncData")
            syncViewModel.addSyncs(if (serializable is HashMap) serializable as HashMap? else null)
        }
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.AbstractPlayerFragment, androidx.fragment.app.Fragment
    public override fun onCreateView(
        inflater: LayoutInflater,
        viewGroup: ViewGroup,
        bundle: Bundle
    ): View {
        Intrinsics.checkNotNullParameter(inflater, "inflater")
        val context: Context? = getContext()
        val z: Boolean = true
        setLayout(if ((context == null || !SettingsFragment.Companion.Companion.isTvSettings(context))) false else if (false) R.layout.fragment_player_tv else R.layout.fragment_player)
        val generatorPlayer: GeneratorPlayer = this
        viewModel = ViewModelProvider(generatorPlayer).get(PlayerGeneratorViewModel::class.java)
        viewModelBrowserSubtitle = ViewModelProvider(generatorPlayer).get(
            SubtitleBrowserViewModel::class.java
        ) as SubtitleBrowserViewModel?
        sync = ViewModelProvider(generatorPlayer).get(SyncViewModel::class.java) as SyncViewModel?
        var playerGeneratorViewModel: PlayerGeneratorViewModel? = viewModel
        if (playerGeneratorViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel")
            playerGeneratorViewModel = null
        }
        playerGeneratorViewModel!!.attachGenerator(Companion.lastUsedGenerator)
        unwrapBundle(bundle)
        unwrapBundle(getArguments())
        return super.onCreateView(inflater, viewGroup, bundle)
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.FullScreenPlayer, com.lagradost.cloudstream3.p041ui.player.AbstractPlayerFragment, androidx.fragment.app.Fragment
    public override fun onResume() {
        var savedStateHandle: SavedStateHandle
        var liveData: MutableLiveData<*>
        super.onResume()
        var playerGeneratorViewModel: PlayerGeneratorViewModel? = viewModel
        if (playerGeneratorViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel")
            playerGeneratorViewModel = null
        }
        Log.d("BLUE --> onResume", playerGeneratorViewModel.getNotifyData().toString())
        val currentBackStackEntry: NavBackStackEntry? =
            Fragment.findNavController(this).getCurrentBackStackEntry()
        if ((currentBackStackEntry == null) || ((currentBackStackEntry.getSavedStateHandle().also({
                savedStateHandle = it
            })) == null) || ((savedStateHandle.getLiveData<Any>("your_key")
                .also({ liveData = it })) == null)
        ) {
            return
        }
        liveData.observe(getViewLifecycleOwner(), object : Observer<Any?> {
            // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$GeneratorPlayer$xTn3mJmXOvWjmIBjr0Z1I1UkDj8
            @Override // androidx.lifecycle.Observer
            public override fun onChanged(obj: Object) {
                Companion.`m8715onResume$lambda46`(this@GeneratorPlayer, obj as String?)
            }
        })
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.FullScreenPlayer, com.lagradost.cloudstream3.p041ui.player.AbstractPlayerFragment, androidx.fragment.app.Fragment
    public override fun onViewCreated(view: View, bundle: Bundle) {
        Intrinsics.checkNotNullParameter(view, "view")
        super.onViewCreated(view, bundle)
        val generatorPlayer: GeneratorPlayer = this
        var subtitleBrowserViewModel: SubtitleBrowserViewModel? = viewModelBrowserSubtitle
        var playerGeneratorViewModel: PlayerGeneratorViewModel? = null
        if (subtitleBrowserViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModelBrowserSubtitle")
            subtitleBrowserViewModel = null
        }
        ArchComponentExt.observe<Resource<Object>>(
            generatorPlayer,
            subtitleBrowserViewModel.getResultResponse(),
            `GeneratorPlayer$onViewCreated$1`.Companion.INSTANCE
        )
        var playerGeneratorViewModel2: PlayerGeneratorViewModel? = viewModel
        if (playerGeneratorViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel")
            playerGeneratorViewModel2 = null
        }
        ArchComponentExt.observe<Resource<Object>>(
            generatorPlayer,
            playerGeneratorViewModel2.getNotifyData(),
            `GeneratorPlayer$onViewCreated$2`.Companion.INSTANCE
        )
        val context: Context? = getContext()
        if (context != null) {
            val defaultSharedPreferences: SharedPreferences =
                PreferenceManager.getDefaultSharedPreferences(context)
            titleRez =
                defaultSharedPreferences.getInt(getString(R.string.prefer_limit_title_rez_key), 3)
            limitTitle =
                defaultSharedPreferences.getInt(getString(R.string.prefer_limit_title_key), 0)
            CustomDecoder.Companion.Companion.updateForcedEncoding(context)
        }
        unwrapBundle(bundle)
        unwrapBundle(getArguments())
        var syncViewModel: SyncViewModel? = sync
        if (syncViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sync")
            syncViewModel = null
        }
        syncViewModel.updateUserData()
        preferredAutoSelectSubtitles =
            SubtitlesFragment.Companion.Companion.getAutoSelectLanguageISO639_1()
        if (currentSelectedLink == null) {
            var playerGeneratorViewModel3: PlayerGeneratorViewModel? = viewModel
            if (playerGeneratorViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel")
                playerGeneratorViewModel3 = null
            }
            PlayerGeneratorViewModel.Companion.`loadLinks$default`(
                playerGeneratorViewModel3,
                false,
                false,
                3,
                null
            )
        }
        val materialButton: MaterialButton? =
            `_$_findCachedViewById`(C4761R.C4764id.overlay_loading_skip_button) as MaterialButton?
        if (materialButton != null) {
            materialButton.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$GeneratorPlayer$WHujn8-6XQLWKbTwruFDWaKkpY4
                @Override // android.view.View.OnClickListener
                fun onClick(view2: View?) {
                    Companion.`m8716onViewCreated$lambda48`(this@GeneratorPlayer, view2)
                }
            })
        }
        val imageView: ImageView? =
            `_$_findCachedViewById`(C4761R.C4764id.player_loading_go_back) as ImageView?
        if (imageView != null) {
            imageView.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$GeneratorPlayer$HtWU9hjscP9iZeffoskMNTzLU0Q
                @Override // android.view.View.OnClickListener
                fun onClick(view2: View?) {
                    Companion.`m8717onViewCreated$lambda49`(this@GeneratorPlayer, view2)
                }
            })
        }
        var playerGeneratorViewModel4: PlayerGeneratorViewModel? = viewModel
        if (playerGeneratorViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel")
            playerGeneratorViewModel4 = null
        }
        ArchComponentExt.observe<Resource<Boolean>>(
            generatorPlayer,
            playerGeneratorViewModel4!!.getLoadingLinks(),
            `GeneratorPlayer$onViewCreated$6`(this)
        )
        var playerGeneratorViewModel5: PlayerGeneratorViewModel? = viewModel
        if (playerGeneratorViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel")
            playerGeneratorViewModel5 = null
        }
        ArchComponentExt.observe(
            generatorPlayer,
            playerGeneratorViewModel5!!.getCurrentLinks(),
            `GeneratorPlayer$onViewCreated$7`(this)
        )
        val playerGeneratorViewModel6: PlayerGeneratorViewModel? = viewModel
        if (playerGeneratorViewModel6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel")
        } else {
            playerGeneratorViewModel = playerGeneratorViewModel6
        }
        ArchComponentExt.observe(
            generatorPlayer,
            playerGeneratorViewModel!!.getCurrentSubs(),
            `GeneratorPlayer$onViewCreated$8`(this)
        )
    }

    @Override // com.lagradost.cloudstream3.p041ui.player.FullScreenPlayer, com.lagradost.cloudstream3.p041ui.player.AbstractPlayerFragment, androidx.fragment.app.Fragment
    public override fun onDestroyView() {
        val companion: AppController? = AppController.Companion.getInstance()
        if (companion != null) {
            companion.setVastAdded(false)
        }
        super.onDestroyView()
        `_$_clearFindViewByIdCache`()
    }

    companion object {
        val Companion: Companion = Companion(null)
        private val lastUsedGenerator: IGenerator? = null
        fun  /* synthetic */`sortLinks$default`(
            generatorPlayer: GeneratorPlayer,
            z: Boolean,
            i: Int,
            obj: Object?
        ): List {
            var z: Boolean = z
            if ((i and 1) != 0) {
                z = true
            }
            return generatorPlayer.sortLinks(z)
        }

        /* renamed from: openOnlineSubPicker$lambda-3 */
        fun `m8720openOnlineSubPicker$lambda3`(dialog: Dialog?, view: View?) {
            Intrinsics.checkNotNullParameter(dialog, "\$dialog")
            UIHelper.INSTANCE.dismissSafe(dialog)
        }

        /* JADX WARN: Type inference failed for: r1v4, types: [com.lagradost.cloudstream3.subtitles.AbstractSubtitleEntities$SubtitleEntity, T] */ /* renamed from: openOnlineSubPicker$lambda-4 */
        fun `m8721openOnlineSubPicker$lambda4`(
            currentSubtitle: ObjectRef<*>,
            currentSubtitles: ObjectRef<*>,
            adapterView: AdapterView?,
            view: View?,
            i: Int,
            j: Long
        ) {
            Intrinsics.checkNotNullParameter(currentSubtitle, "\$currentSubtitle")
            Intrinsics.checkNotNullParameter(currentSubtitles, "\$currentSubtitles")
            r1 = CollectionsKt.getOrNull(currentSubtitles.element as List?, i) as SubtitleEntity
            if (r1 === 0) {
                return
            }
            currentSubtitle.element = r1
        }

        fun `openOnlineSubPicker$getName`(subtitleEntity: SubtitleEntity): String {
            if (StringsKt.isBlank(subtitleEntity.getLang())) {
                return subtitleEntity.getName()
            }
            var fromTwoLettersToLanguage: String? =
                SubtitleHelper.INSTANCE.fromTwoLettersToLanguage(
                    StringsKt.trim(subtitleEntity.getLang() as CharSequence?).toString()
                )
            if (fromTwoLettersToLanguage == null) {
                fromTwoLettersToLanguage = subtitleEntity.getLang()
            }
            return fromTwoLettersToLanguage + ' ' + subtitleEntity.getName()
        }

        /* JADX WARN: Multi-variable type inference failed */
        fun `openOnlineSubPicker$setSubtitlesList`(
            objectRef: ObjectRef<List<SubtitleEntity?>?>,
            arrayAdapter: ArrayAdapter<String?>?,
            list: List<SubtitleEntity?>
        ) {
            objectRef.element = list
            if (arrayAdapter != null) {
                arrayAdapter.clear()
            }
            if (arrayAdapter != null) {
                val list2: List<SubtitleEntity> = objectRef.element
                val arrayList: ArrayList =
                    ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10))
                for (subtitleEntity: SubtitleEntity? in list2) {
                    arrayList.add(
                        GeneratorPlayer.Companion.`openOnlineSubPicker$getName`(
                            subtitleEntity
                        )
                    )
                }
                arrayAdapter.addAll(arrayList)
            }
        }

        /* renamed from: openOnlineSubPicker$lambda-8 */
        fun `m8722openOnlineSubPicker$lambda8`(
            `this$0`: GeneratorPlayer,
            currentLanguageTwoLetters: ObjectRef<*>,
            context: Context,
            dialog: Dialog?,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(
                currentLanguageTwoLetters,
                "\$currentLanguageTwoLetters"
            )
            Intrinsics.checkNotNullParameter(context, "\$context")
            Intrinsics.checkNotNullParameter(dialog, "\$dialog")
            val languages: List<Language639> = SubtitleHelper.INSTANCE.languages
            val arrayList: ArrayList =
                ArrayList(CollectionsKt.collectionSizeOrDefault(languages, 10))
            for (language639: Language639 in languages) {
                arrayList.add(language639.iSO_639_1)
            }
            val arrayList2: ArrayList = arrayList
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                val singleSelectionHelper: SingleSelectionHelper = SingleSelectionHelper.INSTANCE
                val fragmentActivity: FragmentActivity = activity
                val languages2: List<Language639> = SubtitleHelper.INSTANCE.languages
                val arrayList3: ArrayList =
                    ArrayList(CollectionsKt.collectionSizeOrDefault(languages2, 10))
                for (language6392: Language639 in languages2) {
                    arrayList3.add(language6392.languageName)
                }
                val indexOf: Int = arrayList2.indexOf(currentLanguageTwoLetters.element)
                val string: String = context.getString(R.string.subs_subtitle_languages)
                Intrinsics.checkNotNullExpressionValue(
                    string,
                    "context.getString(R.stri….subs_subtitle_languages)"
                )
                singleSelectionHelper.showDialog(
                    fragmentActivity,
                    arrayList3,
                    indexOf,
                    string,
                    true,
                    `GeneratorPlayer$openOnlineSubPicker$4$2`.Companion.INSTANCE,
                    `GeneratorPlayer$openOnlineSubPicker$4$3`(
                        currentLanguageTwoLetters,
                        arrayList2,
                        dialog
                    )
                )
            }
        }

        /* renamed from: openOnlineSubPicker$lambda-12 */
        fun `m8718openOnlineSubPicker$lambda12`(
            currentSubtitle: ObjectRef<*>,
            dialog: Dialog?,
            providers: List,
            `this$0`: GeneratorPlayer,
            view: View?
        ) {
            var obj: Object?
            Intrinsics.checkNotNullParameter(currentSubtitle, "\$currentSubtitle")
            Intrinsics.checkNotNullParameter(dialog, "\$dialog")
            Intrinsics.checkNotNullParameter(providers, "\$providers")
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val subtitleEntity: SubtitleEntity? = currentSubtitle.element as SubtitleEntity?
            if (subtitleEntity != null) {
                val it: Iterator = providers.iterator()
                while (true) {
                    if (!it.hasNext()) {
                        obj = null
                        break
                    }
                    obj = it.next()
                    if (Intrinsics.areEqual(
                            (obj as OpenSubtitlesApi?).idPrefix,
                            subtitleEntity.getIdPrefix()
                        )
                    ) {
                        break
                    }
                }
                val openSubtitlesApi: OpenSubtitlesApi? = obj as OpenSubtitlesApi?
                if (openSubtitlesApi != null) {
                    Coroutines.INSTANCE.ioSafe(
                        `GeneratorPlayer$openOnlineSubPicker$5$1$2$1`(
                            openSubtitlesApi,
                            subtitleEntity,
                            `this$0`,
                            null
                        )
                    )
                }
            }
            UIHelper.INSTANCE.dismissSafe(dialog)
        }

        /* renamed from: openOnlineSubPicker$lambda-13 */
        fun `m8719openOnlineSubPicker$lambda13`(
            dismissCallback: Functions<*>,
            dialogInterface: DialogInterface?
        ) {
            Intrinsics.checkNotNullParameter(dismissCallback, "\$dismissCallback")
            dismissCallback.invoke()
        }

        /* renamed from: subsPathPicker$lambda-14 */
        fun `m8735subsPathPicker$lambda14`(`this$0`: GeneratorPlayer, uri: Uri?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            ArchComponentExt.normalSafeApiCall<Unit>(
                `GeneratorPlayer$subsPathPicker$1$1`(
                    uri,
                    `this$0`
                )
            )
        }

        /* renamed from: showMirrorsDialogue$lambda-30$lambda-15 */
        fun `m8726showMirrorsDialogue$lambda30$lambda15`(`this$0`: GeneratorPlayer, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            `this$0`.openSubPicker()
        }

        /* renamed from: showMirrorsDialogue$lambda-30$dismiss */
        fun `m8725showMirrorsDialogue$lambda30$dismiss`(
            z: Boolean,
            generatorPlayer: GeneratorPlayer
        ) {
            if (z) {
                generatorPlayer.getPlayer().handleEvent(CSPlayerEvent.Play)
            }
            val activity: FragmentActivity? = generatorPlayer.getActivity()
            if (activity != null) {
                UIHelper.INSTANCE.hideSystemUI(activity)
            }
        }

        /* renamed from: showMirrorsDialogue$lambda-30$lambda-16 */
        fun `m8727showMirrorsDialogue$lambda30$lambda16`(
            shouldDismiss: BooleanRef,
            sourceDialog: AlertDialog?,
            `this$0`: GeneratorPlayer,
            z: Boolean,
            view: View
        ) {
            Intrinsics.checkNotNullParameter(shouldDismiss, "\$shouldDismiss")
            Intrinsics.checkNotNullParameter(sourceDialog, "\$sourceDialog")
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            shouldDismiss.element = false
            UIHelper.INSTANCE.dismissSafe(sourceDialog, `this$0`.getActivity())
            val context: Context = view.getContext()
            Intrinsics.checkNotNullExpressionValue(context, "it.context")
            `this$0`.openOnlineSubPicker(
                context,
                null,
                `GeneratorPlayer$showMirrorsDialogue$1$2$1`(z, `this$0`)
            )
        }

        /* renamed from: showMirrorsDialogue$lambda-30$lambda-17 */
        fun `m8728showMirrorsDialogue$lambda30$lambda17`(
            shouldDismiss: BooleanRef,
            sourceDialog: AlertDialog?,
            `this$0`: GeneratorPlayer,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(shouldDismiss, "\$shouldDismiss")
            Intrinsics.checkNotNullParameter(sourceDialog, "\$sourceDialog")
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            shouldDismiss.element = false
            UIHelper.INSTANCE.dismissSafe(sourceDialog, `this$0`.getActivity())
            SubtitleBrowserFragment.Companion.Companion.pushSearch(`this$0`.getActivity())
        }

        /* renamed from: showMirrorsDialogue$lambda-30$lambda-19 */
        fun `m8729showMirrorsDialogue$lambda30$lambda19`(
            sourceIndex: IntRef,
            listView: ListView,
            adapterView: AdapterView?,
            view: View?,
            i: Int,
            j: Long
        ) {
            Intrinsics.checkNotNullParameter(sourceIndex, "\$sourceIndex")
            sourceIndex.element = i
            listView.setItemChecked(i, true)
        }

        /* renamed from: showMirrorsDialogue$lambda-30$lambda-20 */
        fun `m8730showMirrorsDialogue$lambda30$lambda20`(
            shouldDismiss: BooleanRef,
            `this$0`: GeneratorPlayer,
            z: Boolean,
            dialogInterface: DialogInterface?
        ) {
            Intrinsics.checkNotNullParameter(shouldDismiss, "\$shouldDismiss")
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            if (shouldDismiss.element) {
                GeneratorPlayer.Companion.`m8725showMirrorsDialogue$lambda30$dismiss`(z, `this$0`)
            }
            `this$0`.selectSourceDialog = null
        }

        /* renamed from: showMirrorsDialogue$lambda-30$lambda-22 */
        fun `m8731showMirrorsDialogue$lambda30$lambda22`(
            subtitleIndex: IntRef,
            listView: ListView,
            adapterView: AdapterView?,
            view: View?,
            i: Int,
            j: Long
        ) {
            Intrinsics.checkNotNullParameter(subtitleIndex, "\$subtitleIndex")
            subtitleIndex.element = i
            listView.setItemChecked(i, true)
        }

        /* renamed from: showMirrorsDialogue$lambda-30$lambda-23 */
        fun `m8732showMirrorsDialogue$lambda30$lambda23`(
            sourceDialog: AlertDialog?,
            `this$0`: GeneratorPlayer,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(sourceDialog, "\$sourceDialog")
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            UIHelper.INSTANCE.dismissSafe(sourceDialog, `this$0`.getActivity())
        }

        /* renamed from: showMirrorsDialogue$lambda-30$lambda-25 */
        fun `m8733showMirrorsDialogue$lambda30$lambda25`(
            ctx: Context,
            `this$0`: GeneratorPlayer,
            shouldDismiss: BooleanRef,
            sourceDialog: AlertDialog?,
            z: Boolean,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(ctx, "\$ctx")
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(shouldDismiss, "\$shouldDismiss")
            Intrinsics.checkNotNullParameter(sourceDialog, "\$sourceDialog")
            val defaultSharedPreferences: SharedPreferences =
                PreferenceManager.getDefaultSharedPreferences(ctx)
            val stringArray: Array<String> =
                ctx.getResources().getStringArray(R.array.subtitles_encoding_list)
            Intrinsics.checkNotNullExpressionValue(
                stringArray,
                "ctx.resources.getStringA….subtitles_encoding_list)"
            )
            val stringArray2: Array<String?> =
                ctx.getResources().getStringArray(R.array.subtitles_encoding_values)
            Intrinsics.checkNotNullExpressionValue(
                stringArray2,
                "ctx.resources.getStringA…ubtitles_encoding_values)"
            )
            val string: String = defaultSharedPreferences.getString(
                `this$0`.getString(R.string.subtitles_encoding_key),
                null
            )
            shouldDismiss.element = false
            UIHelper.INSTANCE.dismissSafe(sourceDialog, `this$0`.getActivity())
            val indexOf: Int = ArraysKt.indexOf(stringArray2, string)
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                val singleSelectionHelper: SingleSelectionHelper = SingleSelectionHelper.INSTANCE
                val fragmentActivity: FragmentActivity = activity
                val list: List<String> = ArraysKt.toList(stringArray)
                val i: Int = if (indexOf == -1) 0 else indexOf
                val string2: String = ctx.getString(R.string.subtitles_encoding)
                Intrinsics.checkNotNullExpressionValue(
                    string2,
                    "ctx.getString(R.string.subtitles_encoding)"
                )
                singleSelectionHelper.showDialog(
                    fragmentActivity,
                    list,
                    i,
                    string2,
                    true,
                    `GeneratorPlayer$showMirrorsDialogue$1$11$1`.Companion.INSTANCE,
                    `GeneratorPlayer$showMirrorsDialogue$1$11$2`(
                        defaultSharedPreferences,
                        ctx,
                        stringArray2,
                        `this$0`,
                        z
                    )
                )
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:72:0x009b, code lost:
        if (r3 != false) goto L33;
     */
        /* renamed from: showMirrorsDialogue$lambda-30$lambda-29 */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
        fun `m8734showMirrorsDialogue$lambda30$lambda29`(
            r2: IntRef?,
            r3: IntRef?,
            r4: IntRef?,
            r5: Int,
            r6: GeneratorPlayer?,
            r7: MutableList?,
            r8: MutableList?,
            r9: AlertDialog?,
            r10: android.view.View?
        ) {
            /*
            java.lang.String r10 = "$sourceIndex"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r10)
            java.lang.String r10 = "$startSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r10)
            java.lang.String r10 = "$subtitleIndex"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r10)
            java.lang.String r10 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r10)
            java.lang.String r10 = "$currentSubtitles"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r10)
            java.lang.String r10 = "$sortedUrls"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r10)
            java.lang.String r10 = "$sourceDialog"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r10)
            int r10 = r2.element
            int r3 = r3.element
            r0 = 0
            r1 = 1
            if (r10 == r3) goto L2d
            r3 = 1
            goto L2e
        L2d:
            r3 = 0
        L2e:
            int r10 = r4.element
            if (r10 == r5) goto L9f
            if (r3 != 0) goto L9d
            int r3 = r4.element
            if (r3 > 0) goto L3d
            boolean r3 = r6.noSubtitles()
            goto L9b
        L3d:
            int r3 = r4.element
            int r3 = r3 - r1
            java.lang.Object r3 = kotlin.collections.CollectionsKt.getOrNull(r7, r3)
            com.lagradost.cloudstream3.ui.player.SubtitleData r3 = (com.lagradost.cloudstream3.p041ui.player.SubtitleData) r3
            if (r3 == 0) goto L9a
            java.lang.Boolean r4 = r3.isZipUrl()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
            if (r4 == 0) goto L95
            android.content.Context r2 = r6.getContext()
            r4 = 0
            if (r2 == 0) goto L68
            java.io.File r2 = r2.getExternalFilesDir(r4)
            if (r2 == 0) goto L68
            java.lang.String r2 = r2.getAbsolutePath()
            goto L69
        L68:
            r2 = r4
        L69:
            if (r2 == 0) goto L94
            android.content.Context r5 = r6.getContext()
            r7 = 2131952036(0x7f1301a4, float:1.9540503E38)
            java.lang.String r7 = r6.getString(r7)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r7, r0)
            r5.show()
            com.lagradost.cloudstream3.ui.player.PlayerGeneratorViewModel r5 = r6.viewModel
            if (r5 != 0) goto L89
            java.lang.String r5 = "viewModel"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
            goto L8a
        L89:
            r4 = r5
        L8a:
            com.lagradost.cloudstream3.ui.player.GeneratorPlayer$showMirrorsDialogue$1$12$1$1$1 r5 = new com.lagradost.cloudstream3.ui.player.GeneratorPlayer$showMirrorsDialogue$1$12$1$1$1
            r5.<init>(r6)
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r4.extrasZipSubtitle(r3, r2, r5)
        L94:
            return
        L95:
            boolean r3 = r6.setSubtitles(r3)
            goto L9b
        L9a:
            r3 = 0
        L9b:
            if (r3 == 0) goto L9e
        L9d:
            r0 = 1
        L9e:
            r3 = r0
        L9f:
            if (r3 == 0) goto Lae
            int r2 = r2.element
            java.lang.Object r2 = kotlin.collections.CollectionsKt.getOrNull(r8, r2)
            kotlin.Pair r2 = (kotlin.Tuples) r2
            if (r2 == 0) goto Lae
            r6.loadLink(r2, r1)
        Lae:
            com.lagradost.cloudstream3.utils.UIHelper r2 = com.lagradost.cloudstream3.utils.UIHelper.INSTANCE
            android.app.Dialog r9 = (android.app.Dialog) r9
            androidx.fragment.app.FragmentActivity r3 = r6.getActivity()
            android.app.Activity r3 = (android.app.Activity) r3
            r2.dismissSafe(r9, r3)
            return
        */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.p041ui.player.GeneratorPlayer.m8734showMirrorsDialogue\$lambda30\$lambda29(kotlin.jvm.internal.Ref\$IntRef, kotlin.jvm.internal.Ref\$IntRef, kotlin.jvm.internal.Ref\$IntRef, int, com.lagradost.cloudstream3.ui.player.GeneratorPlayer, java.util.List, java.util.List, androidx.appcompat.app.AlertDialog, android.view.View):void")
        }

        /* renamed from: setTitle$lambda-44$lambda-42 */
        fun `m8723setTitle$lambda44$lambda42`(`this$0`: GeneratorPlayer, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val intent: Intent = Intent("android.intent.action.VIEW")
            intent.setData(Uri.parse(Constants.URL_PAGE))
            `this$0`.startActivity(intent)
        }

        /* renamed from: setTitle$lambda-44$lambda-43 */
        fun `m8724setTitle$lambda44$lambda43`(`this$0`: GeneratorPlayer, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val intent: Intent = Intent("android.intent.action.VIEW")
            intent.setData(Uri.parse(Constants.URL_PAGE))
            `this$0`.startActivity(intent)
        }

        /* renamed from: onResume$lambda-46 */
        fun `m8715onResume$lambda46`(`this$0`: GeneratorPlayer, it: String?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Log.d("BLUE --> onResume", it)
            var playerGeneratorViewModel: PlayerGeneratorViewModel? = `this$0`.viewModel
            if (playerGeneratorViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel")
                playerGeneratorViewModel = null
            }
            Intrinsics.checkNotNullExpressionValue(it, "it")
            playerGeneratorViewModel!!.uploadFileSub(it, `GeneratorPlayer$onResume$1$1`(`this$0`))
        }

        /* renamed from: onViewCreated$lambda-48 */
        fun `m8716onViewCreated$lambda48`(`this$0`: GeneratorPlayer, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            `this$0`.startPlayer()
        }

        /* renamed from: onViewCreated$lambda-49 */
        fun `m8717onViewCreated$lambda49`(`this$0`: GeneratorPlayer, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            `this$0`.getPlayer().release()
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                UIHelper.INSTANCE.popCurrentPage(activity)
            }
        }
    }
}