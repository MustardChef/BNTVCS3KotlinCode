package com.lagradost.cloudstream3.p041ui.result

import android.content.Context
import com.lagradost.cloudstream3.mvvm.Resource
import com.lagradost.cloudstream3.p041ui.quicksearch.QuickSearchFragment
import com.lagradost.cloudstream3.widget.FlowLayout
import com.phimhd.Key
import kotlin.jvm.internal.Intrinsics

/* compiled from: ResultFragmentPhimHD.kt */
@Metadata(
    m108d1 = ["\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"],
    m107d2 = ["<anonymous>", "", "data", "Lcom/lagradost/cloudstream3/mvvm/Resource;", "Lcom/lagradost/cloudstream3/LoadResponse;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD$onViewCreated$29 */ /* loaded from: classes4.dex */
internal class `ResultFragmentPhimHD$onViewCreated$29` constructor(/* synthetic */val `this$0`: ResultFragmentPhimHD,
                                                                                  mainAPI: MainAPI,
                                                                                  str: String
) : Lambda<Any?>(1), Function1<Resource<out LoadResponse?>?, Unit> {
    /* synthetic */ val `$api`: MainAPI
    /* synthetic */ val `$apiName`: String

    /* compiled from: ResultFragmentPhimHD.kt */
    @Metadata(
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD$onViewCreated$29$WhenMappings */ /* loaded from: classes4.dex */
    /* synthetic */
    object WhenMappings {
        /* synthetic */ val `$EnumSwitchMapping$0`: IntArray
        /* synthetic */ val `$EnumSwitchMapping$1`: IntArray
        /* synthetic */ val `$EnumSwitchMapping$2`: IntArray

        init {
            val iArr: IntArray = IntArray(VPNStatus.values().size)
            com.lagradost.cloudstream3.p041ui.result.iArr.get(VPNStatus.MightBeNeeded.ordinal()) = 1
            com.lagradost.cloudstream3.p041ui.result.iArr.get(VPNStatus.Torrent.ordinal()) = 2
            `$EnumSwitchMapping$0` = com.lagradost.cloudstream3.p041ui.result.iArr
            val iArr2: IntArray = IntArray(ProviderType.values().size)
            com.lagradost.cloudstream3.p041ui.result.iArr2.get(ProviderType.MetaProvider.ordinal()) =
                1
            `$EnumSwitchMapping$1` = com.lagradost.cloudstream3.p041ui.result.iArr2
            val iArr3: IntArray = IntArray(TvType.values().size)
            com.lagradost.cloudstream3.p041ui.result.iArr3.get(TvType.TvSeries.ordinal()) = 1
            com.lagradost.cloudstream3.p041ui.result.iArr3.get(TvType.Anime.ordinal()) = 2
            com.lagradost.cloudstream3.p041ui.result.iArr3.get(TvType.OVA.ordinal()) = 3
            com.lagradost.cloudstream3.p041ui.result.iArr3.get(TvType.AnimeMovie.ordinal()) = 4
            com.lagradost.cloudstream3.p041ui.result.iArr3.get(TvType.Cartoon.ordinal()) = 5
            com.lagradost.cloudstream3.p041ui.result.iArr3.get(TvType.Documentary.ordinal()) = 6
            com.lagradost.cloudstream3.p041ui.result.iArr3.get(TvType.Movie.ordinal()) = 7
            com.lagradost.cloudstream3.p041ui.result.iArr3.get(TvType.Torrent.ordinal()) = 8
            com.lagradost.cloudstream3.p041ui.result.iArr3.get(TvType.AsianDrama.ordinal()) = 9
            `$EnumSwitchMapping$2` = com.lagradost.cloudstream3.p041ui.result.iArr3
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$api` = mainAPI
        `$apiName` = str
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(resource: Resource<out LoadResponse?>?) {
        invoke2(resource)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(data: Resource<out LoadResponse?>?) {
        val showStatus: ShowStatus?
        var syncViewModel: SyncViewModel?
        var syncViewModel2: SyncViewModel?
        val resultFragmentPhimHD: ResultFragmentPhimHD
        val i: Int
        val easyDownloadButton: EasyDownloadButton?
        val easyDownloadButton2: EasyDownloadButton?
        var cardView: CardView
        var syncViewModel3: SyncViewModel?
        var syncViewModel4: SyncViewModel?
        var episodes: List<Episode?>
        val str: String
        val string: String
        Intrinsics.checkNotNullParameter(data, "data")
        if (data is Resource.Success<*>) {
            val loadResponse: LoadResponse = data.value as LoadResponse
            val z: Boolean = loadResponse is AnimeLoadResponse
            if (!z) {
                val result_episode_loading: ShimmerFrameLayout? =
                    `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_episode_loading) as ShimmerFrameLayout?
                Intrinsics.checkNotNullExpressionValue(
                    result_episode_loading,
                    "result_episode_loading"
                )
                if (result_episode_loading.getVisibility() === 0) {
                    val result_episode_loading2: ShimmerFrameLayout? =
                        `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_episode_loading) as ShimmerFrameLayout?
                    Intrinsics.checkNotNullExpressionValue(
                        result_episode_loading2,
                        "result_episode_loading"
                    )
                    result_episode_loading2.setVisibility(8)
                }
            }
            `this$0`.updateVisStatus(2)
            val textView: TextView? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_vpn) as TextView?
            if (textView != null) {
                val i2: Int = WhenMappings.`$EnumSwitchMapping$0`.get(
                    `$api`.vpnStatus.ordinal()
                )
                if (i2 == 1) {
                    string = `this$0`.getString(R.string.vpn_might_be_needed)
                } else if (i2 == 2) {
                    string = `this$0`.getString(R.string.vpn_torrent)
                }
                textView.setText(string)
            }
            val textView2: TextView? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_vpn) as TextView?
            if (textView2 != null) {
                textView2.setVisibility(if (`$api`.vpnStatus === VPNStatus.None) 8 else 0)
            }
            val textView3: TextView? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_info) as TextView?
            if (textView3 != null) {
                if (WhenMappings.`$EnumSwitchMapping$1`.get(
                        `$api`.providerType.ordinal()
                    ) == 1
                ) {
                    str = `this$0`.getString(R.string.provider_info_meta)
                }
                textView3.setText(str)
            }
            val textView4: TextView? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_info) as TextView?
            if (textView4 != null) {
                textView4.setVisibility(if (`$api`.providerType === ProviderType.MetaProvider) 0 else 8)
            }
            if (MainAPIKt.isEpisodeBased(loadResponse.type)) {
                val tvSeriesLoadResponse: TvSeriesLoadResponse? =
                    if (loadResponse is TvSeriesLoadResponse) loadResponse as TvSeriesLoadResponse? else null
                if ((if ((tvSeriesLoadResponse == null || (tvSeriesLoadResponse.getEpisodes()
                            .also({ episodes = it })) == null)
                    ) 1 else episodes.size()) < 1
                ) {
                    val textView5: TextView? =
                        `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_info) as TextView?
                    if (textView5 != null) {
                        textView5.setText(`this$0`.getString(R.string.no_episodes_found))
                    }
                    val textView6: TextView? =
                        `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_info) as TextView?
                    if (textView6 != null) {
                        textView6.setVisibility(0)
                    }
                }
            }
            `this$0`.currentHeaderName = loadResponse.name
            `this$0`.currentType = loadResponse.type
            `this$0`.currentPoster = loadResponse.posterUrl
            `this$0`.currentIsMovie = Boolean.valueOf(!MainAPIKt.isEpisodeBased(loadResponse))
            val materialButton: MaterialButton? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_open_in_browser) as MaterialButton?
            if (materialButton != null) {
                val resultFragmentPhimHD2: ResultFragmentPhimHD = `this$0`
                materialButton.setOnClickListener(object : OnClickListener() {
                    // from class: com.lagradost.cloudstream3.ui.result.-$$Lambda$ResultFragmentPhimHD$onViewCreated$29$mNwlDXGYORwr5f8JwR22TOiBK_Y
                    @Override // android.view.View.OnClickListener
                    fun onClick(view: View?) {
                        `m8786invoke$lambda0`(this@LoadResponse, resultFragmentPhimHD2, view)
                    }
                })
                val unit: Unit = Unit.INSTANCE
            }
            val materialButton2: MaterialButton? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_search) as MaterialButton?
            if (materialButton2 != null) {
                val resultFragmentPhimHD3: ResultFragmentPhimHD = `this$0`
                materialButton2.setOnClickListener(object : OnClickListener() {
                    // from class: com.lagradost.cloudstream3.ui.result.-$$Lambda$ResultFragmentPhimHD$onViewCreated$29$qczR9LOs8-sTAOAtBxsrS3HiNfo
                    @Override // android.view.View.OnClickListener
                    fun onClick(view: View?) {
                        `m8787invoke$lambda1`(this@ResultFragmentPhimHD, loadResponse, view)
                    }
                })
                val unit2: Unit = Unit.INSTANCE
            }
            val materialButton3: MaterialButton? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_share) as MaterialButton?
            if (materialButton3 != null) {
                val resultFragmentPhimHD4: ResultFragmentPhimHD = `this$0`
                materialButton3.setOnClickListener(object : OnClickListener() {
                    // from class: com.lagradost.cloudstream3.ui.result.-$$Lambda$ResultFragmentPhimHD$onViewCreated$29$pSaLgsesVrLV_djoiHY87-PtX1s
                    @Override // android.view.View.OnClickListener
                    fun onClick(view: View?) {
                        `m8791invoke$lambda2`(this@LoadResponse, resultFragmentPhimHD4, view)
                    }
                })
                val unit3: Unit = Unit.INSTANCE
            }
            if (loadResponse is TvSeriesLoadResponse) {
                showStatus = (loadResponse as TvSeriesLoadResponse).showStatus
            } else {
                showStatus = if (z) (loadResponse as AnimeLoadResponse).showStatus else null
            }
            `this$0`.setShow(showStatus)
            `this$0`.setDuration(loadResponse.getDuration())
            `this$0`.setYear(loadResponse.getYear())
            `this$0`.setRating(loadResponse.getRating())
            `this$0`.setRecommendations(loadResponse.recommendations, null)
            `this$0`.setActors(loadResponse.actors)
            syncViewModel = `this$0`.syncModel
            if (syncViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("syncModel")
                syncViewModel = null
            }
            if (syncViewModel!!.addSyncs(loadResponse.syncData)) {
                syncViewModel3 = `this$0`.syncModel
                if (syncViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("syncModel")
                    syncViewModel3 = null
                }
                syncViewModel3!!.updateMetaAndUser()
                syncViewModel4 = `this$0`.syncModel
                if (syncViewModel4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("syncModel")
                    syncViewModel4 = null
                }
                syncViewModel4!!.updateSynced()
            } else {
                syncViewModel2 = `this$0`.syncModel
                if (syncViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("syncModel")
                    syncViewModel2 = null
                }
                syncViewModel2!!.addFromUrl(loadResponse.url)
            }
            val materialButton4: MaterialButton? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_meta_site) as MaterialButton?
            if (materialButton4 != null) {
                materialButton4.setText(loadResponse.apiName)
            }
            val posterUrl: String = loadResponse.posterUrl
            val str2: String? = posterUrl
            if (!(str2 == null || str2.length() === 0)) {
                val imageView: ImageView? =
                    `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_poster) as ImageView?
                if (imageView != null) {
                    Boolean.valueOf(
                        UIHelper.`setImage$default`(
                            UIHelper.INSTANCE,
                            imageView,
                            posterUrl,
                            loadResponse.posterHeaders,
                            null,
                            4,
                            null
                        )
                    )
                }
                val imageView2: ImageView? =
                    `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_poster_blur) as ImageView?
                if (imageView2 != null) {
                    UIHelper.INSTANCE.setImageBlur(
                        imageView2,
                        posterUrl,
                        10,
                        3,
                        loadResponse.posterHeaders
                    )
                    val unit4: Unit = Unit.INSTANCE
                }
                val context: Context? = `this$0`.getContext()
                if ((if ((context == null || SettingsFragment.Companion.Companion.isTrueTvSettings(
                            context
                        ))
                    ) false else true) && (`this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_poster_holder) as CardView?. also ({
                        cardView = it
                    })) != null
                ) {
                    val resultFragmentPhimHD5: ResultFragmentPhimHD = `this$0`
                    cardView.setOnClickListener(object : OnClickListener() {
                        // from class: com.lagradost.cloudstream3.ui.result.-$$Lambda$ResultFragmentPhimHD$onViewCreated$29$Nff7XMd3p2BbXqFVu0gcAULi1PU
                        @Override // android.view.View.OnClickListener
                        fun onClick(view: View?) {
                            `m8792invoke$lambda4`(this@ResultFragmentPhimHD, posterUrl, view)
                        }
                    })
                    val unit5: Unit = Unit.INSTANCE
                }
            } else {
                val imageView3: ImageView? =
                    `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_poster) as ImageView?
                if (imageView3 != null) {
                    imageView3.setImageResource(R.drawable.default_cover)
                    val unit6: Unit = Unit.INSTANCE
                }
                val imageView4: ImageView? =
                    `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_poster_blur) as ImageView?
                if (imageView4 != null) {
                    imageView4.setImageResource(R.drawable.default_cover)
                    val unit7: Unit = Unit.INSTANCE
                }
            }
            val cardView2: CardView? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_poster_holder) as CardView?
            if (cardView2 != null) {
                cardView2.setVisibility(0)
            }
            val plot: String? = loadResponse.plot
            if (!(plot == null || plot.length() === 0)) {
                var plot2: String = loadResponse.plot
                Intrinsics.checkNotNull(plot2)
                if (plot2.length() > 1000) {
                    val sb: StringBuilder = StringBuilder()
                    val substring: String = plot2.substring(0, 1000)
                    Intrinsics.checkNotNullExpressionValue(
                        substring,
                        "this as java.lang.String…ing(startIndex, endIndex)"
                    )
                    sb.append(substring)
                    sb.append("...")
                    plot2 = sb.toString()
                }
                val resultFragmentPhimHD6: ResultFragmentPhimHD = `this$0`
                (`this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_description) as TextView?).setOnClickListener(
                    object : OnClickListener() {
                        // from class: com.lagradost.cloudstream3.ui.result.-$$Lambda$ResultFragmentPhimHD$onViewCreated$29$XtIiy-WF3_rfcgxxvb4sbMsxPmI
                        @Override // android.view.View.OnClickListener
                        fun onClick(view: View?) {
                            `m8793invoke$lambda5`(this@ResultFragmentPhimHD, loadResponse, view)
                        }
                    })
                (`this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_description) as TextView?).setText(
                    plot2
                )
            } else {
                val textView7: TextView? =
                    `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_description) as TextView?
                if (loadResponse.type === TvType.Torrent) {
                    resultFragmentPhimHD = `this$0`
                    i = R.string.torrent_no_plot
                } else {
                    resultFragmentPhimHD = `this$0`
                    i = R.string.normal_no_plot
                }
                textView7.setText(resultFragmentPhimHD.getString(i))
            }
            val flowLayout: FlowLayout? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_tag)
            if (flowLayout != null) {
                flowLayout.removeAllViews()
                val unit8: Unit = Unit.INSTANCE
            }
            val comingSoon: Boolean = loadResponse.comingSoon
            val resultFragmentPhimHD7: ResultFragmentPhimHD = `this$0`
            val result_coming_soon: TextView? =
                resultFragmentPhimHD7.`_$_findCachedViewById`(C4761R.C4764id.result_coming_soon) as TextView?
            if (result_coming_soon != null) {
                Intrinsics.checkNotNullExpressionValue(result_coming_soon, "result_coming_soon")
                result_coming_soon.setVisibility(if (comingSoon) 0 else 8)
            }
            val result_data_holder: LinearLayout? =
                resultFragmentPhimHD7.`_$_findCachedViewById`(C4761R.C4764id.result_data_holder) as LinearLayout?
            if (result_data_holder != null) {
                Intrinsics.checkNotNullExpressionValue(result_data_holder, "result_data_holder")
                result_data_holder.setVisibility(if (comingSoon) 8 else 0)
            }
            val unit9: Unit = Unit.INSTANCE
            val tags: List<String> = loadResponse.tags
            val list: List<String>? = tags
            if (!(list == null || list.isEmpty())) {
                val context2: Context? = `this$0`.getContext()
                val z2: Boolean =
                    context2 != null && SettingsFragment.Companion.Companion.isTrueTvSettings(
                        context2
                    )
                var i3: Int = 0
                for (str3: String? in tags) {
                    val i4: Int = i3 + 1
                    val inflate: View = `this$0`.getLayoutInflater()
                        .inflate(R.layout.result_tag, null as ViewGroup?)
                    val materialButton5: MaterialButton =
                        inflate.findViewById(R.id.result_tag_card) as MaterialButton
                    materialButton5.setText(str3)
                    materialButton5.setFocusable(!z2)
                    materialButton5.setClickable(!z2)
                    val flowLayout2: FlowLayout? =
                        `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_tag)
                    if (flowLayout2 != null) {
                        flowLayout2.addView(inflate, i3)
                        val unit10: Unit = Unit.INSTANCE
                    }
                    i3 = i4
                }
            }
            if (!MainAPIKt.isMovieType(loadResponse.type)) {
                `this$0`.lateFixDownloadButton(false)
                val materialButton6: MaterialButton? =
                    `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_play_movie) as MaterialButton?
                if (materialButton6 != null) {
                    val resultFragmentPhimHD8: ResultFragmentPhimHD = `this$0`
                    val str4: String = `$apiName`
                    val mainAPI: MainAPI = `$api`
                    materialButton6.setOnClickListener(object : OnClickListener() {
                        // from class: com.lagradost.cloudstream3.ui.result.-$$Lambda$ResultFragmentPhimHD$onViewCreated$29$Q3FefuE3q5i0hslBuRvwyJFI5N8
                        @Override // android.view.View.OnClickListener
                        fun onClick(view: View?) {
                            `m8789invoke$lambda11`(this@ResultFragmentPhimHD, str4, mainAPI, view)
                        }
                    })
                    val unit11: Unit = Unit.INSTANCE
                }
                val materialButton7: MaterialButton? =
                    `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_play_movie) as MaterialButton?
                if (materialButton7 != null) {
                    val resultFragmentPhimHD9: ResultFragmentPhimHD = `this$0`
                    val str5: String = `$apiName`
                    val mainAPI2: MainAPI = `$api`
                    materialButton7.setOnLongClickListener(object : OnLongClickListener() {
                        // from class: com.lagradost.cloudstream3.ui.result.-$$Lambda$ResultFragmentPhimHD$onViewCreated$29$8QuM49Oa24iqI604mHXPSihlfP0
                        @Override // android.view.View.OnLongClickListener
                        fun onLongClick(view: View?): Boolean {
                            val `m8790invoke$lambda12`: Boolean
                            `m8790invoke$lambda12` = `m8790invoke$lambda12`(
                                this@ResultFragmentPhimHD,
                                str5,
                                mainAPI2,
                                view
                            )
                            return `m8790invoke$lambda12`
                        }
                    })
                    val unit12: Unit = Unit.INSTANCE
                }
            } else {
                val hasDownloadSupport: Boolean = `$api`.hasDownloadSupport
                `this$0`.lateFixDownloadButton(true)
                val materialButton8: MaterialButton? =
                    `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_play_movie) as MaterialButton?
                if (materialButton8 != null) {
                    val resultFragmentPhimHD10: ResultFragmentPhimHD = `this$0`
                    val str6: String = `$apiName`
                    val mainAPI3: MainAPI = `$api`
                    materialButton8.setOnClickListener(object : OnClickListener() {
                        // from class: com.lagradost.cloudstream3.ui.result.-$$Lambda$ResultFragmentPhimHD$onViewCreated$29$bZ761W8R9mOJ47m79OJkOd9024M
                        @Override // android.view.View.OnClickListener
                        fun onClick(view: View?) {
                            `m8794invoke$lambda7`(this@ResultFragmentPhimHD, str6, mainAPI3, view)
                        }
                    })
                    val unit13: Unit = Unit.INSTANCE
                }
                val materialButton9: MaterialButton? =
                    `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_play_movie) as MaterialButton?
                if (materialButton9 != null) {
                    val resultFragmentPhimHD11: ResultFragmentPhimHD = `this$0`
                    val str7: String = `$apiName`
                    val mainAPI4: MainAPI = `$api`
                    materialButton9.setOnLongClickListener(object : OnLongClickListener() {
                        // from class: com.lagradost.cloudstream3.ui.result.-$$Lambda$ResultFragmentPhimHD$onViewCreated$29$W3KMB3Nmoh-i3cirQ7eFEIoQnos
                        @Override // android.view.View.OnLongClickListener
                        fun onLongClick(view: View?): Boolean {
                            val `m8795invoke$lambda8`: Boolean
                            `m8795invoke$lambda8` = `m8795invoke$lambda8`(
                                this@ResultFragmentPhimHD,
                                str7,
                                mainAPI4,
                                view
                            )
                            return `m8795invoke$lambda8`
                        }
                    })
                    val unit14: Unit = Unit.INSTANCE
                }
                val materialButton10: MaterialButton? =
                    `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_download_movie) as MaterialButton?
                if (materialButton10 != null) {
                    val resultFragmentPhimHD12: ResultFragmentPhimHD = `this$0`
                    val str8: String = `$apiName`
                    val mainAPI5: MainAPI = `$api`
                    materialButton10.setOnLongClickListener(object : OnLongClickListener() {
                        // from class: com.lagradost.cloudstream3.ui.result.-$$Lambda$ResultFragmentPhimHD$onViewCreated$29$YjU9HKrdppL0-veMcQOJbjyiDPc
                        @Override // android.view.View.OnLongClickListener
                        fun onLongClick(view: View?): Boolean {
                            val `m8796invoke$lambda9`: Boolean
                            `m8796invoke$lambda9` = `m8796invoke$lambda9`(
                                this@ResultFragmentPhimHD,
                                str8,
                                mainAPI5,
                                view
                            )
                            return `m8796invoke$lambda9`
                        }
                    })
                    val unit15: Unit = Unit.INSTANCE
                }
                if (hasDownloadSupport) {
                    val id: Int = APIHolder.INSTANCE.getId(loadResponse)
                    val videoDownloadManager: VideoDownloadManager = VideoDownloadManager.INSTANCE
                    val requireContext: Context = `this$0`.requireContext()
                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()")
                    val downloadFileInfoAndUpdateSettings: DownloadedFileInfoResult? =
                        videoDownloadManager.getDownloadFileInfoAndUpdateSettings(
                            requireContext,
                            id
                        )
                    easyDownloadButton = `this$0`.downloadButton
                    if (easyDownloadButton != null) {
                        easyDownloadButton.dispose()
                        val unit16: Unit = Unit.INSTANCE
                    }
                    `this$0`.downloadButton = EasyDownloadButton()
                    easyDownloadButton2 = `this$0`.downloadButton
                    if (easyDownloadButton2 != null) {
                        val valueOf: Long? =
                            if (downloadFileInfoAndUpdateSettings != null) Long.valueOf(
                                downloadFileInfoAndUpdateSettings.fileLength
                            ) else null
                        val valueOf2: Long? =
                            if (downloadFileInfoAndUpdateSettings != null) Long.valueOf(
                                downloadFileInfoAndUpdateSettings.totalBytes
                            ) else null
                        val result_movie_progress_downloaded: ContentLoadingProgressBar? =
                            `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_movie_progress_downloaded) as ContentLoadingProgressBar?
                        Intrinsics.checkNotNullExpressionValue(
                            result_movie_progress_downloaded,
                            "result_movie_progress_downloaded"
                        )
                        val result_movie_download_icon: ImageView? =
                            `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_movie_download_icon) as ImageView?
                        Intrinsics.checkNotNullExpressionValue(
                            result_movie_download_icon,
                            "result_movie_download_icon"
                        )
                        val textView8: TextView? =
                            `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_movie_download_text) as TextView?
                        val textView9: TextView? =
                            `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_movie_download_text_precentage) as TextView?
                        val result_download_movie: MaterialButton? =
                            `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_download_movie) as MaterialButton?
                        Intrinsics.checkNotNullExpressionValue(
                            result_download_movie,
                            "result_download_movie"
                        )
                        easyDownloadButton2.setUpMoreButton(
                            valueOf,
                            valueOf2,
                            result_movie_progress_downloaded,
                            result_movie_download_icon,
                            textView8,
                            textView9,
                            result_download_movie,
                            true,
                            DownloadEpisodeCached(
                                loadResponse.name,
                                loadResponse.posterUrl,
                                0,
                                null,
                                id,
                                id,
                                loadResponse.getRating(),
                                loadResponse.plot,
                                System.currentTimeMillis()
                            ),
                            C493310(
                                `this$0`, loadResponse, id, `$apiName`, `$api`
                            )
                        )
                        val unit17: Unit = Unit.INSTANCE
                    }
                    val materialButton11: MaterialButton? =
                        `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_download_movie) as MaterialButton?
                    if (materialButton11 != null) {
                        val resultFragmentPhimHD13: ResultFragmentPhimHD = `this$0`
                        val str9: String = `$apiName`
                        val mainAPI6: MainAPI = `$api`
                        materialButton11.setOnLongClickListener(object : OnLongClickListener() {
                            // from class: com.lagradost.cloudstream3.ui.result.-$$Lambda$ResultFragmentPhimHD$onViewCreated$29$e_c7zIjXCG8E_kjKd4f7MIySM_k
                            @Override // android.view.View.OnLongClickListener
                            fun onLongClick(view: View?): Boolean {
                                val `m8788invoke$lambda10`: Boolean
                                `m8788invoke$lambda10` = `m8788invoke$lambda10`(
                                    this@ResultFragmentPhimHD,
                                    str9,
                                    mainAPI6,
                                    view
                                )
                                return `m8788invoke$lambda10`
                            }
                        })
                        val unit18: Unit = Unit.INSTANCE
                    }
                }
            }
            val context3: Context? = `this$0`.getContext()
            if (context3 != null) {
                val i5: Int = WhenMappings.`$EnumSwitchMapping$2`.get(loadResponse.type.ordinal())
                var i6: Int = R.string.movies_singular
                when (i5) {
                    1 -> i6 = R.string.tv_series_singular
                    2 -> i6 = R.string.anime_singular
                    3 -> i6 = R.string.ova_singular
                    4, 7 -> {}
                    5 -> i6 = R.string.cartoons_singular
                    6 -> i6 = R.string.documentaries_singular
                    8 -> i6 = R.string.torrent_singular
                    9 -> i6 = R.string.asian_drama_singular
                    else -> throw NoWhenBranchMatchedException()
                }
                val string2: String? = context3.getString(i6)
                if (string2 != null) {
                    val textView10: TextView? =
                        `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_meta_type) as TextView?
                    if (textView10 != null) {
                        textView10.setText(string2)
                    }
                    val unit19: Unit = Unit.INSTANCE
                    val unit20: Unit = Unit.INSTANCE
                }
            }
            val reviewUrl: String? = loadResponse.reviewUrl
            if (reviewUrl != null) {
                val resultFragmentPhimHD14: ResultFragmentPhimHD = `this$0`
                val webReview: WebView? =
                    resultFragmentPhimHD14.`_$_findCachedViewById`(C4761R.C4764id.webReview) as WebView?
                Intrinsics.checkNotNullExpressionValue(webReview, "webReview")
                resultFragmentPhimHD14.loadComments(webReview, reviewUrl)
                val unit21: Unit = Unit.INSTANCE
                val unit22: Unit = Unit.INSTANCE
            }
            if (z) {
                (`this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_title) as TextView?).setText(
                    loadResponse.name
                )
            } else {
                (`this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_title) as TextView?).setText(
                    loadResponse.name
                )
            }
        } else if (data is Resource.Failure) {
            val textView11: TextView? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_error_text) as TextView?
            val sb2: StringBuilder = StringBuilder()
            val url: String? = `this$0`.getUrl()
            sb2.append(if (url != null) url + '\n' else null)
            sb2.append(data.errorString)
            textView11.setText(sb2.toString())
            `this$0`.updateVisStatus(1)
        } else if (data is Loading) {
            `this$0`.updateVisStatus(0)
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: ResultFragmentPhimHD.kt */
    @Metadata(
        m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
        m107d2 = ["<anonymous>", "", "downloadClickEvent", "Lcom/lagradost/cloudstream3/ui/download/DownloadClickEvent;", "invoke"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD$onViewCreated$29$10 */ /* loaded from: classes4.dex */
    class C493310 internal constructor(/* synthetic */val `this$0`: ResultFragmentPhimHD,
                                                      loadResponse: LoadResponse,
                                                      i: Int,
                                                      str: String,
                                                      mainAPI: MainAPI
    ) : Lambda<Any?>(1), Function1<DownloadClickEvent, Unit> {
        /* synthetic */ val `$api`: MainAPI
        /* synthetic */ val `$apiName`: String

        /* renamed from: $d */
        /* synthetic */ val `f10019$d`: LoadResponse
        /* synthetic */ val `$localId`: Int

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        init {
            `f10019$d` = loadResponse
            `$localId` = i
            `$apiName` = str
            `$api` = mainAPI
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */  override fun invoke(downloadClickEvent: DownloadClickEvent) {
            invoke2(downloadClickEvent)
            return Unit.INSTANCE
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        fun invoke2(downloadClickEvent: DownloadClickEvent) {
            val str: String?
            val list: List?
            var resultEpisode: ResultEpisode
            Intrinsics.checkNotNullParameter(downloadClickEvent, "downloadClickEvent")
            if (downloadClickEvent.getAction() != 4) {
                str = `this$0`.currentHeaderName
                DownloadButtonSetup.Companion.INSTANCE.handleDownloadClick(
                    `this$0`.getActivity(),
                    str,
                    downloadClickEvent
                )
                return
            }
            val companion: AppController? = AppController.Companion.getInstance()
            if ((if (companion != null) companion.getKey() else null) != null) {
                val companion2: AppController? = AppController.Companion.getInstance()
                val key: Key? = if (companion2 != null) companion2.getKey() else null
                Intrinsics.checkNotNull(key)
                if (!key!!.isExpired()) {
                    list = `this$0`.currentEpisodes
                    if (list == null || (CollectionsKt.firstOrNull<Any>(list as List<Object?>?) as ResultEpisode?. also ({
                            resultEpisode = it
                        })) == null) {
                        return
                    }
                    val loadResponse: LoadResponse = `f10019$d`
                    val i: Int = `$localId`
                    ResultFragmentPhimHD.Companion.`onViewCreated$handleAction`(
                        `this$0`,
                        `$apiName`,
                        `$api`,
                        EpisodeClickEvent(
                            6,
                            ResultEpisode(
                                loadResponse.name,
                                loadResponse.name,
                                null,
                                0,
                                null,
                                resultEpisode.getData(),
                                loadResponse.apiName,
                                i,
                                0,
                                0L,
                                0L,
                                null,
                                null,
                                null,
                                loadResponse.type,
                                i
                            )
                        )
                    )
                    return
                }
                Log.d("DuongKK", "start Countdownads")
                val activity: FragmentActivity = `this$0`.getActivity()
                Objects.requireNonNull(
                    activity,
                    "null cannot be cast to non-null type com.lagradost.cloudstream3.MainActivity"
                )
                (activity as MainActivity).showDialogUpgrade()
                return
            }
            val activity2: FragmentActivity = `this$0`.getActivity()
            Objects.requireNonNull(
                activity2,
                "null cannot be cast to non-null type com.lagradost.cloudstream3.MainActivity"
            )
            (activity2 as MainActivity).showDialogUpgrade()
        }
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: invoke$lambda-0  reason: not valid java name */
        fun `m8786invoke$lambda0`(d: LoadResponse, `this$0`: ResultFragmentPhimHD, view: View?) {
            Intrinsics.checkNotNullParameter(d, "\$d")
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val intent: Intent = Intent("android.intent.action.VIEW")
            intent.setData(Uri.parse(d.url))
            try {
                `this$0`.startActivity(intent)
            } catch (e: Exception) {
                ArchComponentExt.logError(e)
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: invoke$lambda-1  reason: not valid java name */
        fun `m8787invoke$lambda1`(`this$0`: ResultFragmentPhimHD, d: LoadResponse, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(d, "\$d")
            QuickSearchFragment.Companion.Companion.`pushSearch$default`(
                QuickSearchFragment.Companion.Companion,
                `this$0`.getActivity(),
                d.name,
                null,
                4,
                null
            )
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: invoke$lambda-2  reason: not valid java name */
        fun `m8791invoke$lambda2`(d: LoadResponse, `this$0`: ResultFragmentPhimHD, view: View?) {
            Intrinsics.checkNotNullParameter(d, "\$d")
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            try {
                val intent: Intent = Intent("android.intent.action.SEND")
                intent.setType("text/plain")
                intent.putExtra("android.intent.extra.SUBJECT", d.name)
                intent.putExtra("android.intent.extra.TEXT", d.url)
                `this$0`.startActivity(Intent.createChooser(intent, d.name))
            } catch (e: Exception) {
                ArchComponentExt.logError(e)
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: invoke$lambda-4  reason: not valid java name */
        fun `m8792invoke$lambda4`(`this$0`: ResultFragmentPhimHD, str: String?, view: View?) {
            val `runBlocking$default`: Object
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            try {
                val context: Context? = `this$0`.getContext()
                if (context != null) {
                    `runBlocking$default` = BuildersKt__BuildersKt.`runBlocking$default`(
                        null,
                        `ResultFragmentPhimHD$onViewCreated$29$4$1$1`(context, str, null),
                        1,
                        null
                    )
                    val imageView: ImageView = `runBlocking$default` as ImageView
                }
            } catch (e: Exception) {
                ArchComponentExt.logError(e)
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: invoke$lambda-5  reason: not valid java name */
        fun `m8793invoke$lambda5`(`this$0`: ResultFragmentPhimHD, d: LoadResponse, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(d, "\$d")
            AlertDialog.Builder(`this$0`.requireContext()).setMessage(d.plot)
                .setTitle(if (d.type === TvType.Torrent) R.string.torrent_plot else R.string.result_plot)
                .show()
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: invoke$lambda-7  reason: not valid java name */
        fun `m8794invoke$lambda7`(
            `this$0`: ResultFragmentPhimHD,
            apiName: String?,
            api: MainAPI?,
            view: View?
        ) {
            val list: List?
            var resultEpisode: ResultEpisode?
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(apiName, "\$apiName")
            Intrinsics.checkNotNullParameter(api, "\$api")
            list = `this$0`.currentEpisodes
            if (list == null || (CollectionsKt.firstOrNull<Any>(list as List<Object?>?) as ResultEpisode?. also ({
                    resultEpisode = it
                })) == null) {
                return
            }
            ResultFragmentPhimHD.Companion.`onViewCreated$handleAction`(
                `this$0`,
                apiName,
                api,
                EpisodeClickEvent(11, resultEpisode)
            )
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: invoke$lambda-8  reason: not valid java name */
        fun `m8795invoke$lambda8`(
            `this$0`: ResultFragmentPhimHD,
            apiName: String?,
            api: MainAPI?,
            view: View?
        ): Boolean {
            val list: List?
            var resultEpisode: ResultEpisode?
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(apiName, "\$apiName")
            Intrinsics.checkNotNullParameter(api, "\$api")
            list = `this$0`.currentEpisodes
            if (list != null && (CollectionsKt.firstOrNull<Any>(list as List<Object?>?) as ResultEpisode?. also ({
                    resultEpisode = it
                })) != null) {
                ResultFragmentPhimHD.Companion.`onViewCreated$handleAction`(
                    `this$0`,
                    apiName,
                    api,
                    EpisodeClickEvent(10, resultEpisode)
                )
            }
            return true
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: invoke$lambda-9  reason: not valid java name */
        fun `m8796invoke$lambda9`(
            `this$0`: ResultFragmentPhimHD,
            apiName: String?,
            api: MainAPI?,
            view: View?
        ): Boolean {
            val list: List?
            var resultEpisode: ResultEpisode?
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(apiName, "\$apiName")
            Intrinsics.checkNotNullParameter(api, "\$api")
            list = `this$0`.currentEpisodes
            if (list != null && (CollectionsKt.firstOrNull<Any>(list as List<Object?>?) as ResultEpisode?. also ({
                    resultEpisode = it
                })) != null) {
                ResultFragmentPhimHD.Companion.`onViewCreated$handleAction`(
                    `this$0`,
                    apiName,
                    api,
                    EpisodeClickEvent(10, resultEpisode)
                )
            }
            return true
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: invoke$lambda-10  reason: not valid java name */
        fun `m8788invoke$lambda10`(
            `this$0`: ResultFragmentPhimHD,
            apiName: String?,
            api: MainAPI?,
            view: View?
        ): Boolean {
            val list: List?
            var resultEpisode: ResultEpisode?
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(apiName, "\$apiName")
            Intrinsics.checkNotNullParameter(api, "\$api")
            list = `this$0`.currentEpisodes
            if (list == null || (CollectionsKt.firstOrNull<Any>(list as List<Object?>?) as ResultEpisode?. also ({
                    resultEpisode = it
                })) == null) {
                return false
            }
            ResultFragmentPhimHD.Companion.`onViewCreated$handleAction`(
                `this$0`,
                apiName,
                api,
                EpisodeClickEvent(7, resultEpisode)
            )
            return true
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: invoke$lambda-11  reason: not valid java name */
        fun `m8789invoke$lambda11`(
            `this$0`: ResultFragmentPhimHD,
            apiName: String?,
            api: MainAPI?,
            view: View?
        ) {
            val list: List?
            var resultEpisode: ResultEpisode?
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(apiName, "\$apiName")
            Intrinsics.checkNotNullParameter(api, "\$api")
            list = `this$0`.currentEpisodes
            if (list == null || (CollectionsKt.firstOrNull<Any>(list as List<Object?>?) as ResultEpisode?. also ({
                    resultEpisode = it
                })) == null) {
                return
            }
            ResultFragmentPhimHD.Companion.`onViewCreated$handleAction`(
                `this$0`,
                apiName,
                api,
                EpisodeClickEvent(11, resultEpisode)
            )
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: invoke$lambda-12  reason: not valid java name */
        fun `m8790invoke$lambda12`(
            `this$0`: ResultFragmentPhimHD,
            apiName: String?,
            api: MainAPI?,
            view: View?
        ): Boolean {
            val list: List?
            var resultEpisode: ResultEpisode?
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(apiName, "\$apiName")
            Intrinsics.checkNotNullParameter(api, "\$api")
            list = `this$0`.currentEpisodes
            if (list != null && (CollectionsKt.firstOrNull<Any>(list as List<Object?>?) as ResultEpisode?. also ({
                    resultEpisode = it
                })) != null) {
                ResultFragmentPhimHD.Companion.`onViewCreated$handleAction`(
                    `this$0`,
                    apiName,
                    api,
                    EpisodeClickEvent(10, resultEpisode)
                )
            }
            return true
        }
    }
}