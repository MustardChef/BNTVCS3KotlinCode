package com.lagradost.cloudstream3.p041ui

import android.util.Log
import kotlin.jvm.internal.Intrinsics

/* compiled from: ControllerActivity.kt */
@Metadata(
    m108d1 = ["\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\u000c\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0019"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/SelectSourceController;", "Lcom/google/android/gms/cast/framework/media/uicontroller/UIController;", ViewHierarchyConstants.VIEW_KEY, "Landroid/widget/ImageView;", "activity", "Lcom/lagradost/cloudstream3/ui/ControllerActivity;", "(Landroid/widget/ImageView;Lcom/lagradost/cloudstream3/ui/ControllerActivity;)V", "getActivity", "()Lcom/lagradost/cloudstream3/ui/ControllerActivity;", "isLoadingMore", "", "()Z", "setLoadingMore", "(Z)V", "mapper", "Lcom/fasterxml/jackson/databind/json/JsonMapper;", "getView", "()Landroid/widget/ImageView;", "getCurrentMetaData", "Lcom/lagradost/cloudstream3/ui/MetadataHolder;", "onMediaStatusUpdated", "", "onSessionConnected", "castSession", "Lcom/google/android/gms/cast/framework/CastSession;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.SelectSourceController */ /* loaded from: classes.dex */
class SelectSourceController constructor(view: ImageView, activity: ControllerActivity) :
    UIController() {
    val activity: ControllerActivity
    var isLoadingMore: Boolean = false
    private val mapper: JsonMapper
    private val view: ImageView
    fun getView(): ImageView {
        return view
    }

    init {
        Intrinsics.checkNotNullParameter(view, "view")
        Intrinsics.checkNotNullParameter(activity, "activity")
        this.view = view
        this.activity = activity
        val build: JsonMapper = JsonMapper.builder()
            .addModule(KotlinModule(0, false, false, false, null, false, 63, null))
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).build()
        Intrinsics.checkNotNullExpressionValue(
            build,
            "builder().addModule(Kotl…ROPERTIES, false).build()"
        )
        mapper = build
        view.setImageResource(R.drawable.ic_baseline_playlist_play_24)
        view.setOnClickListener(object : OnClickListener() {
            // from class: com.lagradost.cloudstream3.ui.-$$Lambda$SelectSourceController$sE9IYbhHbbbT_OKFo6K9CMCZ4RA
            @Override // android.view.View.OnClickListener
            fun onClick(view2: View?) {
                `m8605_init_$lambda11`(this@SelectSourceController, view2)
            }
        })
    }

    private val currentMetaData: MetadataHolder?
        private get() {
            var mediaInfo: MediaInfo
            var customData: JSONObject
            try {
                val remoteMediaClient: RemoteMediaClient? = getRemoteMediaClient()
                val jSONObject: String? =
                    if (((remoteMediaClient == null) || ((remoteMediaClient.getMediaInfo()
                            .also({ mediaInfo = it })) == null) || ((mediaInfo.getCustomData()
                            .also({ customData = it })) == null))
                    ) null else customData.toString()
                if (jSONObject != null) {
                    val readValue: Object =
                        DataStore.INSTANCE.mapper.readValue(jSONObject, MetadataHolder::class.java)
                    Intrinsics.checkNotNullExpressionValue(
                        readValue,
                        "mapper.readValue(this, T::class.java)"
                    )
                    return readValue
                }
                return null
            } catch (unused: Exception) {
                return null
            }
        }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
        r0 = com.lagradost.cloudstream3.p041ui.ControllerActivityKt.getItemIndex(r0);
     */
    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */ public override fun onMediaStatusUpdated() {
        /*
            r14 = this;
            super.onMediaStatusUpdated()
            com.lagradost.cloudstream3.ui.MetadataHolder r2 = r14.getCurrentMetaData()
            android.widget.ImageView r0 = r14.view
            r1 = 0
            if (r2 == 0) goto L17
            java.util.List r3 = r2.getCurrentLinks()
            if (r3 == 0) goto L17
            int r3 = r3.size()
            goto L18
        L17:
            r3 = 0
        L18:
            r4 = 1
            if (r3 <= r4) goto L1c
            goto L1d
        L1c:
            r1 = 4
        L1d:
            r0.setVisibility(r1)
            if (r2 == 0) goto Lce
            java.util.List r0 = r2.getEpisodes()     // Catch: java.lang.Exception -> Lc8
            int r0 = r0.size()     // Catch: java.lang.Exception -> Lc8
            int r1 = r2.getCurrentEpisodeIndex()     // Catch: java.lang.Exception -> Lc8
            int r1 = r1 + r4
            if (r0 <= r1) goto Lce
            com.google.android.gms.cast.framework.media.RemoteMediaClient r0 = r14.getRemoteMediaClient()     // Catch: java.lang.Exception -> Lc8
            if (r0 == 0) goto Lc7
            java.lang.Integer r0 = com.lagradost.cloudstream3.p041ui.ControllerActivityKt.access$getItemIndex(r0)     // Catch: java.lang.Exception -> Lc8
            if (r0 == 0) goto Lc7
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> Lc8
            com.google.android.gms.cast.framework.media.RemoteMediaClient r1 = r14.getRemoteMediaClient()     // Catch: java.lang.Exception -> Lc8
            r3 = 0
            if (r1 == 0) goto L57
            com.google.android.gms.cast.framework.media.MediaQueue r1 = r1.getMediaQueue()     // Catch: java.lang.Exception -> Lc8
            if (r1 == 0) goto L57
            int r1 = r1.getItemCount()     // Catch: java.lang.Exception -> Lc8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> Lc8
            goto L58
        L57:
            r1 = r3
        L58:
            int r5 = r2.getCurrentEpisodeIndex()     // Catch: java.lang.Exception -> Lc8
            int r5 = r5 + r4
            java.util.List r6 = r2.getEpisodes()     // Catch: java.lang.Exception -> Lc8
            java.lang.Object r6 = r6.get(r5)     // Catch: java.lang.Exception -> Lc8
            com.lagradost.cloudstream3.ui.result.ResultEpisode r6 = (com.lagradost.cloudstream3.p041ui.result.ResultEpisode) r6     // Catch: java.lang.Exception -> Lc8
            com.google.android.gms.cast.framework.media.RemoteMediaClient r7 = r14.getRemoteMediaClient()     // Catch: java.lang.Exception -> L9f
            if (r7 == 0) goto L76
            long r7 = r7.getStreamDuration()     // Catch: java.lang.Exception -> L9f
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Exception -> L9f
            goto L77
        L76:
            r7 = r3
        L77:
            com.google.android.gms.cast.framework.media.RemoteMediaClient r8 = r14.getRemoteMediaClient()     // Catch: java.lang.Exception -> L9f
            if (r8 == 0) goto L85
            long r8 = r8.getApproximateStreamPosition()     // Catch: java.lang.Exception -> L9f
            java.lang.Long r3 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Exception -> L9f
        L85:
            if (r7 == 0) goto La5
            if (r3 == 0) goto La5
            com.lagradost.cloudstream3.utils.DataStoreHelper r8 = com.lagradost.cloudstream3.utils.DataStoreHelper.INSTANCE     // Catch: java.lang.Exception -> L9f
            int r9 = r6.getId()     // Catch: java.lang.Exception -> L9f
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Exception -> L9f
            long r10 = r3.longValue()     // Catch: java.lang.Exception -> L9f
            long r12 = r7.longValue()     // Catch: java.lang.Exception -> L9f
            r8.setViewPos(r9, r10, r12)     // Catch: java.lang.Exception -> L9f
            goto La5
        L9f:
            r3 = move-exception
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Exception -> Lc8
            com.lagradost.cloudstream3.mvvm.ArchComponentExt.logError(r3)     // Catch: java.lang.Exception -> Lc8
        La5:
            if (r1 == 0) goto Lce
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> Lc8
            int r1 = r1 - r0
            if (r1 != r4) goto Lce
            boolean r0 = r14.isLoadingMore     // Catch: java.lang.Exception -> Lc8
            if (r0 != 0) goto Lce
            r14.isLoadingMore = r4     // Catch: java.lang.Exception -> Lc8
            com.lagradost.cloudstream3.utils.Coroutines r7 = com.lagradost.cloudstream3.utils.Coroutines.INSTANCE     // Catch: java.lang.Exception -> Lc8
            com.lagradost.cloudstream3.ui.SelectSourceController$onMediaStatusUpdated$1 r8 = new com.lagradost.cloudstream3.ui.SelectSourceController$onMediaStatusUpdated$1     // Catch: java.lang.Exception -> Lc8
            r9 = 0
            r0 = r8
            r1 = r6
            r3 = r5
            r4 = r14
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> Lc8
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8     // Catch: java.lang.Exception -> Lc8
            r7.ioSafe(r8)     // Catch: java.lang.Exception -> Lc8
            goto Lce
        Lc7:
            return
        Lc8:
            r0 = move-exception
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        Lce:
            return
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.p041ui.SelectSourceController.onMediaStatusUpdated():void")
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public override fun onSessionConnected(castSession: CastSession) {
        Intrinsics.checkNotNullParameter(castSession, "castSession")
        super.onSessionConnected(castSession)
        val remoteMediaClient: RemoteMediaClient? = getRemoteMediaClient()
        if (remoteMediaClient != null) {
            remoteMediaClient.queueSetRepeatMode(0, JSONObject())
        }
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: _init_$lambda-11  reason: not valid java name */
        fun `m8605_init_$lambda11`(`this$0`: SelectSourceController, view: View?) {
            val arrayList: ArrayList
            val i: Int
            var mediaStatus: MediaStatus
            var contentId: String?
            var currentItem: MediaQueueItem
            var media: MediaInfo
            val i2: Int
            var currentItem2: MediaQueueItem
            var media2: MediaInfo
            var mediaInfo: MediaInfo
            var mediaTracks: List<MediaTrack?>
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val currentMetaData: MetadataHolder? = `this$0`.currentMetaData
            if (currentMetaData != null) {
                val currentLinks: List<ExtractorLink?>? = currentMetaData.getCurrentLinks()
                if (!currentLinks!!.isEmpty()) {
                    val remoteMediaClient: RemoteMediaClient? = `this$0`.getRemoteMediaClient()
                    if ((if (remoteMediaClient != null) remoteMediaClient.getCurrentItem() else null) != null) {
                        val remoteMediaClient2: RemoteMediaClient? = `this$0`.getRemoteMediaClient()
                        var i3: Int = 0
                        if ((remoteMediaClient2 == null) || ((remoteMediaClient2.getMediaInfo()
                                .also({ mediaInfo = it })) == null) || ((mediaInfo.getMediaTracks()
                                .also({ mediaTracks = it })) == null)
                        ) {
                            arrayList = ArrayList()
                        } else {
                            val arrayList2: ArrayList = ArrayList()
                            for (obj: Object in mediaTracks) {
                                if ((obj as MediaTrack).getType() == 1) {
                                    arrayList2.add(obj)
                                }
                            }
                            arrayList = arrayList2
                        }
                        val builder: AlertDialog.Builder = AlertDialog.Builder(
                            `this$0`.view.getContext(),
                            R.style.AlertDialogCustomBlack
                        )
                        builder.setView(R.layout.sort_bottom_sheet)
                        val create: AlertDialog = builder.create()
                        Intrinsics.checkNotNullExpressionValue(
                            create,
                            "bottomSheetDialogBuilder.create()"
                        )
                        create.show()
                        val findViewById: View = create.findViewById<View>(R.id.sort_providers)
                        Intrinsics.checkNotNull(findViewById)
                        val listView: ListView = findViewById as ListView
                        val findViewById2: View = create.findViewById<View>(R.id.sort_subtitles)
                        Intrinsics.checkNotNull(findViewById2)
                        val listView2: ListView = findViewById2 as ListView
                        if (arrayList.isEmpty()) {
                            val linearLayout: LinearLayout? =
                                create.findViewById<View>(R.id.sort_subtitles_holder) as LinearLayout?
                            if (linearLayout != null) {
                                linearLayout.setVisibility(8)
                            }
                        } else {
                            val arrayAdapter: ArrayAdapter = ArrayAdapter(
                                `this$0`.view.getContext(),
                                R.layout.sort_bottom_single_choice
                            )
                            arrayAdapter.add(
                                `this$0`.view.getContext().getString(R.string.no_subtitles)
                            )
                            val arrayList3: ArrayList<MediaTrack> = arrayList
                            val arrayList4: ArrayList = ArrayList()
                            for (mediaTrack: MediaTrack in arrayList3) {
                                val name: String? = mediaTrack.getName()
                                if (name != null) {
                                    arrayList4.add(name)
                                }
                            }
                            arrayAdapter.addAll(arrayList4)
                            listView2.setChoiceMode(1)
                            listView2.setAdapter(arrayAdapter as ListAdapter?)
                            val remoteMediaClient3: RemoteMediaClient? =
                                `this$0`.getRemoteMediaClient()
                            val activeTrackIds: LongArray? =
                                if ((remoteMediaClient3 == null || (remoteMediaClient3.getMediaStatus()
                                        .also({ mediaStatus = it })) == null)
                                ) null else mediaStatus.getActiveTrackIds()
                            if (activeTrackIds == null) {
                                i = 0
                            } else {
                                val arrayList5: ArrayList =
                                    ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10))
                                for (mediaTrack2: MediaTrack in arrayList3) {
                                    arrayList5.add(Long.valueOf(mediaTrack2.getId()))
                                }
                                val it: Iterator = arrayList5.iterator()
                                var i4: Int = 0
                                while (true) {
                                    if (!it.hasNext()) {
                                        i4 = -1
                                        break
                                    } else if (ArraysKt.contains(
                                            activeTrackIds,
                                            (it.next() as Number).longValue()
                                        )
                                    ) {
                                        break
                                    } else {
                                        i4++
                                    }
                                }
                                i = i4 + 1
                            }
                            listView2.setSelection(i)
                            listView2.setItemChecked(i, true)
                            listView2.setOnItemClickListener(object : OnItemClickListener() {
                                // from class: com.lagradost.cloudstream3.ui.-$$Lambda$SelectSourceController$ky1oEWBWZYppctt5Bzs8jtsNZRc
                                @Override // android.widget.AdapterView.OnItemClickListener
                                fun onItemClick(
                                    adapterView: AdapterView?,
                                    view2: View?,
                                    i5: Int,
                                    j: Long
                                ) {
                                    `m8609lambda11$lambda7`(
                                        this@SelectSourceController,
                                        arrayList,
                                        create,
                                        adapterView,
                                        view2,
                                        i5,
                                        j
                                    )
                                }
                            })
                        }
                        val remoteMediaClient4: RemoteMediaClient? = `this$0`.getRemoteMediaClient()
                        if ((remoteMediaClient4 == null) || ((remoteMediaClient4.getCurrentItem()
                                .also({ currentItem2 = it })) == null) || ((currentItem2.getMedia()
                                .also({ media2 = it })) == null) || ((media2.getContentUrl()
                                .also({ contentId = it })) == null)
                        ) {
                            val remoteMediaClient5: RemoteMediaClient? =
                                `this$0`.getRemoteMediaClient()
                            contentId =
                                if (((remoteMediaClient5 == null) || ((remoteMediaClient5.getCurrentItem()
                                        .also({
                                            currentItem = it
                                        })) == null) || ((currentItem.getMedia()
                                        .also({ media = it })) == null))
                                ) null else media.getContentId()
                        }
                        val list: List<ExtractorLink?>? = currentLinks
                        val arrayList6: ArrayList =
                            ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10))
                        for (extractorLink: ExtractorLink in list) {
                            arrayList6.add(
                                extractorLink.name + ' ' + Qualities.Companion.getStringByInt(
                                    Integer.valueOf(extractorLink.quality)
                                )
                            )
                        }
                        val array: Array<Object?> = arrayList6.toArray(arrayOfNulls<String>(0))
                        Objects.requireNonNull(
                            array,
                            "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
                        )
                        val it2: Iterator<ExtractorLink?> = currentLinks.iterator()
                        while (true) {
                            if (!it2.hasNext()) {
                                i2 = -1
                                break
                            } else if (Intrinsics.areEqual(it2.next().getUrl(), contentId)) {
                                i2 = i3
                                break
                            } else {
                                i3++
                            }
                        }
                        val arrayAdapter2: ArrayAdapter = ArrayAdapter(
                            `this$0`.view.getContext(),
                            R.layout.sort_bottom_single_choice
                        )
                        arrayAdapter2.addAll(ArraysKt.toMutableList(array))
                        listView.setChoiceMode(1)
                        listView.setAdapter(arrayAdapter2 as ListAdapter?)
                        listView.setSelection(i2)
                        listView.setItemChecked(i2, true)
                        listView.setOnItemClickListener(object : OnItemClickListener() {
                            // from class: com.lagradost.cloudstream3.ui.-$$Lambda$SelectSourceController$Ysh7PEP6Cg95l3_0U833pSp58ck
                            @Override // android.widget.AdapterView.OnItemClickListener
                            fun onItemClick(
                                adapterView: AdapterView?,
                                view2: View?,
                                i5: Int,
                                j: Long
                            ) {
                                `m8607lambda11$lambda10`(
                                    this@MetadataHolder,
                                    create,
                                    `this$0`,
                                    adapterView,
                                    view2,
                                    i5,
                                    j
                                )
                            }
                        })
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: lambda-11$lambda-7  reason: not valid java name */
        fun `m8609lambda11$lambda7`(
            `this$0`: SelectSourceController,
            subTracks: List,
            bottomSheetDialog: AlertDialog?,
            adapterView: AdapterView?,
            view: View?,
            i: Int,
            j: Long
        ) {
            var activeMediaTracks: PendingResult<RemoteMediaClient.MediaChannelResult?>
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(subTracks, "\$subTracks")
            Intrinsics.checkNotNullParameter(bottomSheetDialog, "\$bottomSheetDialog")
            if (i == 0) {
                val remoteMediaClient: RemoteMediaClient? = `this$0`.getRemoteMediaClient()
                if (remoteMediaClient != null) {
                    remoteMediaClient.setActiveMediaTracks(LongArray(0))
                }
            } else {
                val currentSavedStyle: SaveChromeCaptionStyle =
                    ChromecastSubtitlesFragment.Companion.Companion.getCurrentSavedStyle()
                val textTrackStyle: TextTrackStyle = TextTrackStyle()
                val fontGenericFamily: Integer? = currentSavedStyle.getFontGenericFamily()
                if (fontGenericFamily != null) {
                    textTrackStyle.setFontGenericFamily(fontGenericFamily.intValue())
                }
                textTrackStyle.setWindowColor(currentSavedStyle.getWindowColor())
                textTrackStyle.setBackgroundColor(currentSavedStyle.getBackgroundColor())
                textTrackStyle.setEdgeColor(currentSavedStyle.getEdgeColor())
                textTrackStyle.setEdgeType(currentSavedStyle.getEdgeType())
                textTrackStyle.setForegroundColor(currentSavedStyle.getForegroundColor())
                textTrackStyle.setFontScale(currentSavedStyle.getFontScale())
                val remoteMediaClient2: RemoteMediaClient? = `this$0`.getRemoteMediaClient()
                if (remoteMediaClient2 != null) {
                    remoteMediaClient2.setTextTrackStyle(textTrackStyle)
                }
                val remoteMediaClient3: RemoteMediaClient? = `this$0`.getRemoteMediaClient()
                if (remoteMediaClient3 != null && (remoteMediaClient3.setActiveMediaTracks(
                        longArrayOf((subTracks.get(i - 1) as MediaTrack).getId())
                    ).also({ activeMediaTracks = it })) != null
                ) {
                    activeMediaTracks.setResultCallback(
                        `$$Lambda$SelectSourceController$zZTaJxBU5cjTG4CXRW8tO6q1Kvg`.Companion.INSTANCE
                    )
                }
            }
            UIHelper.INSTANCE.dismissSafe(bottomSheetDialog, `this$0`.activity)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: lambda-11$lambda-7$lambda-6  reason: not valid java name */
        fun `m8610lambda11$lambda7$lambda6`(mediaChannelResult: RemoteMediaClient.MediaChannelResult) {
            if (mediaChannelResult.getStatus().isSuccess()) {
                return
            }
            Log.e(
                "CHROMECAST",
                "Failed with status code:" + mediaChannelResult.getStatus()
                    .getStatusCode() + " > " + mediaChannelResult.getStatus().getStatusMessage()
            )
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: lambda-11$lambda-10  reason: not valid java name */
        fun `m8607lambda11$lambda10`(
            metadataHolder: MetadataHolder,
            bottomSheetDialog: AlertDialog?,
            `this$0`: SelectSourceController,
            adapterView: AdapterView?,
            view: View?,
            i: Int,
            j: Long
        ) {
            Intrinsics.checkNotNullParameter(bottomSheetDialog, "\$bottomSheetDialog")
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            `m8608lambda11$lambda10$loadMirror`(
                metadataHolder,
                metadataHolder.getEpisodes().get(metadataHolder.getCurrentEpisodeIndex()),
                `this$0`,
                i
            )
            UIHelper.INSTANCE.dismissSafe(bottomSheetDialog, `this$0`.activity)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: lambda-11$lambda-10$loadMirror  reason: not valid java name */
        fun `m8608lambda11$lambda10$loadMirror`(
            metadataHolder: MetadataHolder,
            resultEpisode: ResultEpisode?,
            selectSourceController: SelectSourceController,
            i: Int
        ) {
            val num: Integer?
            var mediaQueue: MediaQueue
            var itemIds: IntArray
            var mediaInfo: MediaInfo
            if (metadataHolder.getCurrentLinks().size() <= i) {
                return
            }
            val castHelper: CastHelper = CastHelper.INSTANCE
            val remoteMediaClient: RemoteMediaClient? =
                selectSourceController.getRemoteMediaClient()
            val mediaInfo2: MediaInfo = castHelper.getMediaInfo(
                resultEpisode,
                metadataHolder,
                i,
                if ((remoteMediaClient == null || (remoteMediaClient.getMediaInfo()
                        .also({ mediaInfo = it })) == null)
                ) null else mediaInfo.getCustomData(),
                metadataHolder.getCurrentSubtitles()
            )
            val remoteMediaClient2: RemoteMediaClient? =
                selectSourceController.getRemoteMediaClient()
            val approximateStreamPosition: Long =
                if (remoteMediaClient2 != null) remoteMediaClient2.getApproximateStreamPosition() else 0L
            try {
                val remoteMediaClient3: RemoteMediaClient? =
                    selectSourceController.getRemoteMediaClient()
                val itemIndex: Integer? =
                    if (remoteMediaClient3 != null) ControllerActivityKt.getItemIndex(
                        remoteMediaClient3
                    ) else null
                val remoteMediaClient4: RemoteMediaClient? =
                    selectSourceController.getRemoteMediaClient()
                if ((remoteMediaClient4 == null) || ((remoteMediaClient4.getMediaQueue()
                        .also({ mediaQueue = it })) == null) || ((mediaQueue.getItemIds()
                        .also({ itemIds = it })) == null)
                ) {
                    num = null
                } else {
                    num =
                        Integer.valueOf(itemIds.get(if (itemIndex != null) itemIndex.intValue() + 1 else 0))
                }
                if (itemIndex == null && num != null) {
                    val castHelper2: CastHelper = CastHelper.INSTANCE
                    val remoteMediaClient5: RemoteMediaClient? =
                        selectSourceController.getRemoteMediaClient()
                    castHelper2.awaitLinks(
                        if (remoteMediaClient5 != null) remoteMediaClient5.queueInsertAndPlayItem(
                            MediaQueueItem.Builder(mediaInfo2).build(),
                            num.intValue(),
                            approximateStreamPosition,
                            JSONObject()
                        ) else null,
                        `SelectSourceController$1$3$loadMirror$1`(
                            i,
                            metadataHolder,
                            resultEpisode,
                            selectSourceController
                        )
                    )
                    return
                }
                val castHelper3: CastHelper = CastHelper.INSTANCE
                val remoteMediaClient6: RemoteMediaClient? =
                    selectSourceController.getRemoteMediaClient()
                castHelper3.awaitLinks(
                    if (remoteMediaClient6 != null) remoteMediaClient6.load(
                        mediaInfo2,
                        true,
                        approximateStreamPosition
                    ) else null,
                    `SelectSourceController$1$3$loadMirror$2`(
                        i,
                        metadataHolder,
                        resultEpisode,
                        selectSourceController
                    )
                )
            } catch (unused: Exception) {
                val castHelper4: CastHelper = CastHelper.INSTANCE
                val remoteMediaClient7: RemoteMediaClient? =
                    selectSourceController.getRemoteMediaClient()
                castHelper4.awaitLinks(
                    if (remoteMediaClient7 != null) remoteMediaClient7.load(
                        mediaInfo2,
                        true,
                        approximateStreamPosition
                    ) else null,
                    `SelectSourceController$1$3$loadMirror$3`(
                        i,
                        metadataHolder,
                        resultEpisode,
                        selectSourceController
                    )
                )
            }
        }
    }
}