package com.lagradost.cloudstream3.p041ui.result

import android.content.DialogInterface
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: ResultFragmentPhimHD.kt */
@Metadata(
    m108d1 = ["\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"],
    m107d2 = ["<anonymous>", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD\$onViewCreated\$handleAction$1",
    m98f = "ResultFragmentPhimHD.kt",
    m97i = [1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5],
    m96l = [888, 1016, 1018, 1019, 1020, 1178, 1240],
    m95m = "invokeSuspend",
    m94n = ["currentLinks", "currentSubs", "showTitle", "currentLinks", "currentSubs", "showTitle", "currentLinks", "currentSubs", "showTitle", "currentLinks", "currentSubs", "showTitle", "act", "subs", "data"],
    m93s = ["L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$1", "L$2", "L$3"]
) /* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD$onViewCreated$handleAction$1 */ /* loaded from: classes4.dex */
class `ResultFragmentPhimHD$onViewCreated$handleAction$1` constructor(/* synthetic */val `$episodeClick`: EpisodeClickEvent?, /* synthetic */
                                                                                     val `this$0`: ResultFragmentPhimHD?, /* synthetic */
                                                                                     val `$apiName`: String?,
                                                                                     mainAPI: MainAPI?,
                                                                                     continuation: Continuation<in `ResultFragmentPhimHD$onViewCreated$handleAction$1`?>?
) : SuspendLambda(1, continuation), Function1<Continuation<in Unit>?, Object> {
    /* synthetic */ val `$api`: MainAPI?
    var `L$0`: Object? = null
    var `L$1`: Object? = null
    var `L$2`: Object? = null
    var `L$3`: Object? = null
    var label: Int = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$api` = mainAPI
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun create(continuation: Continuation<*>?): Continuation<Unit> {
        return `ResultFragmentPhimHD$onViewCreated$handleAction$1`(
            `$episodeClick`,
            `this$0`,
            `$apiName`,
            `$api`,
            continuation
        )
    }

    @Override // kotlin.jvm.functions.Function1
    public override fun invoke(continuation: Continuation<in Unit>?): Object {
        return (create(continuation) as `ResultFragmentPhimHD$onViewCreated$handleAction$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x0385, code lost:
        if (r0 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b1, code lost:
        r16 = r27.this$0.currentType;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bc, code lost:
        r17 = r27.this$0.currentPoster;
     */
    /* JADX WARN: Removed duplicated region for block: B:189:0x054f A[Catch: Exception -> 0x0037, LOOP:0: B:187:0x0549->B:189:0x054f, LOOP_END, TryCatch #0 {Exception -> 0x0037, blocks: (B:8:0x0030, B:186:0x053d, B:187:0x0549, B:189:0x054f, B:190:0x058b, B:191:0x059c, B:193:0x05a2, B:194:0x05cd, B:168:0x04e4, B:170:0x04ef, B:172:0x0502, B:174:0x0505, B:176:0x050b, B:178:0x050e, B:180:0x0514, B:182:0x0517), top: B:212:0x0010 }] */ /* JADX WARN: Removed duplicated region for block: B:193:0x05a2 A[Catch: Exception -> 0x0037, LOOP:1: B:191:0x059c->B:193:0x05a2, LOOP_END, TryCatch #0 {Exception -> 0x0037, blocks: (B:8:0x0030, B:186:0x053d, B:187:0x0549, B:189:0x054f, B:190:0x058b, B:191:0x059c, B:193:0x05a2, B:194:0x05cd, B:168:0x04e4, B:170:0x04ef, B:172:0x0502, B:174:0x0505, B:176:0x050b, B:178:0x050e, B:180:0x0514, B:182:0x0517), top: B:212:0x0010 }] */ /* JADX WARN: Removed duplicated region for block: B:59:0x0170  */ /* JADX WARN: Removed duplicated region for block: B:88:0x0259  */ /* JADX WARN: Removed duplicated region for block: B:90:0x0262  */ /* JADX WARN: Removed duplicated region for block: B:92:0x0265  */ /* JADX WARN: Type inference failed for: r0v36, types: [androidx.appcompat.app.AlertDialog, T] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */ public override fun invokeSuspend(r28: Any?): Any {
        /*
            Method dump skipped, instructions count: 1748
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.p041ui.result.ResultFragmentPhimHD\$onViewCreated\$handleAction$1.invokeSuspend(java.lang.Object):java.lang.Object")
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: ResultFragmentPhimHD.kt */
    @Metadata(
        m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n??\u0006\u0002\b\u0004"],
        m107d2 = ["<anonymous>", "", "link", "Lcom/lagradost/cloudstream3/ui/player/SubtitleData;", "invoke"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD$onViewCreated$handleAction$1$2 */ /* loaded from: classes4.dex */
    class C49342  /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ internal constructor(/* synthetic */
        val `this$0`: ResultFragmentPhimHD, /* synthetic */
        val `$episodeClick`: EpisodeClickEvent, /* synthetic */
        val `$apiName`: String
    ) : Lambda<Any?>(1), Function1<SubtitleData?, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */  override fun invoke(subtitleData: SubtitleData?) {
            invoke2(subtitleData)
            return Unit.INSTANCE
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
            r7 = r9.this$0.currentIsMovie;
         */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */ /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        fun invoke2(r10: SubtitleData?) {
            /*
                r9 = this;
                java.lang.String r0 = "link"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD$Companion r0 = com.lagradost.cloudstream3.p041ui.result.ResultFragmentPhimHD.Companion
                com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD r1 = r9.this$0
                android.content.Context r1 = r1.getContext()
                com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD$Companion r2 = com.lagradost.cloudstream3.p041ui.result.ResultFragmentPhimHD.Companion
                com.lagradost.cloudstream3.ui.result.EpisodeClickEvent r3 = r9.$episodeClick
                com.lagradost.cloudstream3.ui.result.ResultEpisode r3 = r3.getData()
                com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD r4 = r9.this$0
                java.lang.String r4 = com.lagradost.cloudstream3.p041ui.result.ResultFragmentPhimHD.access$getCurrentHeaderName$p(r4)
                if (r4 != 0) goto L1e
                return
            L1e:
                java.lang.String r5 = r9.$apiName
                com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD r6 = r9.this$0
                java.lang.String r6 = com.lagradost.cloudstream3.p041ui.result.ResultFragmentPhimHD.access$getCurrentPoster$p(r6)
                if (r6 != 0) goto L29
                return
            L29:
                com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD r7 = r9.this$0
                java.lang.Boolean r7 = com.lagradost.cloudstream3.p041ui.result.ResultFragmentPhimHD.access$getCurrentIsMovie$p(r7)
                if (r7 == 0) goto L56
                boolean r7 = r7.booleanValue()
                com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD r8 = r9.this$0
                com.lagradost.cloudstream3.TvType r8 = com.lagradost.cloudstream3.p041ui.result.ResultFragmentPhimHD.access$getCurrentType$p(r8)
                if (r8 != 0) goto L3e
                return
            L3e:
                com.lagradost.cloudstream3.utils.VideoDownloadManager$DownloadEpisodeMetadata r2 = com.lagradost.cloudstream3.p041ui.result.ResultFragmentPhimHD.Companion.access$getMeta(r2, r3, r4, r5, r6, r7, r8)
                com.lagradost.cloudstream3.p041ui.result.ResultFragmentPhimHD.Companion.access$downloadSubtitle(r0, r1, r10, r2)
                com.lagradost.cloudstream3.CommonActivity r10 = com.lagradost.cloudstream3.CommonActivity.INSTANCE
                com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD r0 = r9.this$0
                androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
                android.app.Activity r0 = (android.app.Activity) r0
                r1 = 2131951871(0x7f1300ff, float:1.9540169E38)
                r2 = 0
                r10.showToast(r0, r1, r2)
            L56:
                return
            */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.p041ui.result.ResultFragmentPhimHD\$onViewCreated\$handleAction$1.C49342.invoke2(com.lagradost.cloudstream3.ui.player.SubtitleData):void")
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: ResultFragmentPhimHD.kt */
    @Metadata(
        m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n??\u0006\u0002\b\u0004"],
        m107d2 = ["<anonymous>", "", "link", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "invoke"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD$onViewCreated$handleAction$1$5 */ /* loaded from: classes4.dex */
    class C49355  /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ internal constructor(  /* synthetic */
        val `this$0`: ResultFragmentPhimHD
    ) : Lambda<Any?>(1), Function1<ExtractorLink, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */  override fun invoke(extractorLink: ExtractorLink) {
            invoke2(extractorLink)
            return Unit.INSTANCE
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        fun invoke2(link: ExtractorLink) {
            Intrinsics.checkNotNullParameter(link, "link")
            try {
                val intent: Intent = Intent("android.intent.action.VIEW")
                intent.setData(Uri.parse(link.url))
                `this$0`.startActivity(intent)
            } catch (e: Exception) {
                ArchComponentExt.logError(e)
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: ResultFragmentPhimHD.kt */
    @Metadata(
        m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n??\u0006\u0002\b\u0004"],
        m107d2 = ["<anonymous>", "", "link", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "invoke"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD$onViewCreated$handleAction$1$6 */ /* loaded from: classes4.dex */
    class C49366 internal constructor(
        objectRef: ObjectRef<Set<ExtractorLink?>?>,
        resultFragmentPhimHD: ResultFragmentPhimHD,
        episodeClickEvent: EpisodeClickEvent,
        objectRef2: ObjectRef<Set<SubtitleData?>?>,
        str: String
    ) : Lambda<Any?>(1), Function1<ExtractorLink?, Unit> {
        /* synthetic */ val `$apiName`: String
        /* synthetic */ val `$currentLinks`: ObjectRef<Set<ExtractorLink>>
        /* synthetic */ val `$currentSubs`: ObjectRef<Set<SubtitleData>>
        /* synthetic */ val `$episodeClick`: EpisodeClickEvent
        /* synthetic */ val `this$0`: ResultFragmentPhimHD

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        init {
            `$currentLinks` = objectRef
            `this$0` = resultFragmentPhimHD
            `$episodeClick` = episodeClickEvent
            `$currentSubs` = objectRef2
            `$apiName` = str
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */  override fun invoke(extractorLink: ExtractorLink?) {
            invoke2(extractorLink)
            return Unit.INSTANCE
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        fun invoke2(link: ExtractorLink?) {
            Intrinsics.checkNotNullParameter(link, "link")
            val set: Set<ExtractorLink>? = `$currentLinks`.element
            val indexOf: Int = if (set != null) CollectionsKt.indexOf(set, link) else -1
            `invokeSuspend$startChromecast`(
                `this$0`,
                `$episodeClick`,
                `$currentLinks`,
                `$currentSubs`,
                `$apiName`,
                if (indexOf == -1) 0 else indexOf
            )
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: ResultFragmentPhimHD.kt */
    @Metadata(
        m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n??\u0006\u0002\b\u0004"],
        m107d2 = ["<anonymous>", "", "link", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "invoke"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD$onViewCreated$handleAction$1$9 */ /* loaded from: classes4.dex */
    class C49379 internal constructor(/* synthetic */val `this$0`: ResultFragmentPhimHD, /* synthetic */
                                                     val `$episodeClick`: EpisodeClickEvent, /* synthetic */
                                                     val `$apiName`: String,
                                                     objectRef: ObjectRef<Set<SubtitleData?>?>
    ) : Lambda<Any?>(1), Function1<ExtractorLink?, Unit> {
        /* synthetic */ val `$currentSubs`: ObjectRef<Set<SubtitleData>>

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        init {
            `$currentSubs` = objectRef
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */  override fun invoke(extractorLink: ExtractorLink?) {
            invoke2(extractorLink)
            return Unit.INSTANCE
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
            r7 = r13.this$0.currentPoster;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
            r6 = r13.this$0.currentType;
         */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */ /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        fun invoke2(r14: ExtractorLink?) {
            /*
                r13 = this;
                java.lang.String r0 = "link"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD$Companion r1 = com.lagradost.cloudstream3.p041ui.result.ResultFragmentPhimHD.Companion
                com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD r0 = r13.this$0
                android.content.Context r2 = r0.getContext()
                com.lagradost.cloudstream3.ui.result.EpisodeClickEvent r0 = r13.$episodeClick
                com.lagradost.cloudstream3.ui.result.ResultEpisode r3 = r0.getData()
                com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD r0 = r13.this$0
                java.lang.Boolean r0 = com.lagradost.cloudstream3.p041ui.result.ResultFragmentPhimHD.access$getCurrentIsMovie$p(r0)
                if (r0 == 0) goto L76
                boolean r4 = r0.booleanValue()
                com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD r0 = r13.this$0
                java.lang.String r5 = com.lagradost.cloudstream3.p041ui.result.ResultFragmentPhimHD.access$getCurrentHeaderName$p(r0)
                if (r5 != 0) goto L28
                return
            L28:
                com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD r0 = r13.this$0
                com.lagradost.cloudstream3.TvType r6 = com.lagradost.cloudstream3.p041ui.result.ResultFragmentPhimHD.access$getCurrentType$p(r0)
                if (r6 != 0) goto L31
                return
            L31:
                com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD r0 = r13.this$0
                java.lang.String r7 = com.lagradost.cloudstream3.p041ui.result.ResultFragmentPhimHD.access$getCurrentPoster$p(r0)
                if (r7 != 0) goto L3a
                return
            L3a:
                java.lang.String r8 = r13.$apiName
                com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD r0 = r13.this$0
                java.lang.Integer r0 = com.lagradost.cloudstream3.p041ui.result.ResultFragmentPhimHD.access$getCurrentId$p(r0)
                if (r0 == 0) goto L76
                int r9 = r0.intValue()
                com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD r0 = r13.this$0
                java.lang.String r10 = r0.getUrl()
                if (r10 != 0) goto L51
                return
            L51:
                java.util.List r11 = kotlin.collections.CollectionsKt.listOf(r14)
                kotlin.jvm.internal.Ref$ObjectRef<java.util.Set<com.lagradost.cloudstream3.ui.player.SubtitleData>> r14 = r13.$currentSubs
                T r14 = r14.element
                java.util.Set r14 = (java.util.Set) r14
                if (r14 != 0) goto L5e
                return
            L5e:
                java.util.List r12 = com.lagradost.cloudstream3.MainAPIKt.sortSubs(r14)
                r1.startDownload(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                com.lagradost.cloudstream3.CommonActivity r14 = com.lagradost.cloudstream3.CommonActivity.INSTANCE
                com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD r0 = r13.this$0
                androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
                android.app.Activity r0 = (android.app.Activity) r0
                r1 = 2131951871(0x7f1300ff, float:1.9540169E38)
                r2 = 0
                r14.showToast(r0, r1, r2)
            L76:
                return
            */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.p041ui.result.ResultFragmentPhimHD\$onViewCreated\$handleAction$1.C49379.invoke2(com.lagradost.cloudstream3.utils.ExtractorLink):void")
        }
    }

    companion object {
        private fun `invokeSuspend$acquireSingleExtractorLink`(
            resultFragmentPhimHD: ResultFragmentPhimHD,
            list: List<ExtractorLink>,
            str: String,
            function1: Function1<ExtractorLink, Unit>
        ) {
            val builder: AlertDialog.Builder = AlertDialog.Builder(
                resultFragmentPhimHD.requireContext(),
                R.style.AlertDialogCustom
            )
            builder.setTitle(str)
            val list2: List<ExtractorLink> = list
            val arrayList: ArrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10))
            for (extractorLink: ExtractorLink in list2) {
                arrayList.add(
                    extractorLink.name + ' ' + Qualities.Companion.getStringByInt(
                        Integer.valueOf(
                            extractorLink.quality
                        )
                    )
                )
            }
            val array: Array<Object?> = arrayList.toArray(arrayOfNulls<String>(0))
            Objects.requireNonNull(
                array,
                "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            )
            builder.setItems(array as Array<CharSequence?>?, object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.result.-$$Lambda$ResultFragmentPhimHD$onViewCreated$handleAction$1$mXYqM8jlZtPQujcpotsMTVyRFcY
                @Override // android.content.DialogInterface.OnClickListener
                fun onClick(dialogInterface: DialogInterface?, i: Int) {
                    `m8804invokeSuspend$acquireSingleExtractorLink$lambda1`(
                        this@Function1,
                        list,
                        dialogInterface,
                        i
                    )
                }
            })
            builder.create().show()
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: invokeSuspend$acquireSingleExtractorLink$lambda-1  reason: not valid java name */
        fun `m8804invokeSuspend$acquireSingleExtractorLink$lambda1`(
            function1: Function1<*, *>,
            list: List,
            dialogInterface: DialogInterface?,
            i: Int
        ) {
            function1.invoke(list.get(i))
            if (dialogInterface != null) {
                dialogInterface.dismiss()
            }
        }

        private fun `invokeSuspend$acquireSingleSubtitleLink`(
            resultFragmentPhimHD: ResultFragmentPhimHD,
            list: List<SubtitleData>,
            str: String,
            function1: Function1<SubtitleData, Unit>
        ) {
            val builder: AlertDialog.Builder = AlertDialog.Builder(
                resultFragmentPhimHD.requireContext(),
                R.style.AlertDialogCustom
            )
            builder.setTitle(str)
            val list2: List<SubtitleData> = list
            val arrayList: ArrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10))
            for (subtitleData: SubtitleData in list2) {
                arrayList.add(subtitleData.getName())
            }
            val array: Array<Object?> = arrayList.toArray(arrayOfNulls<String>(0))
            Objects.requireNonNull(
                array,
                "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            )
            builder.setItems(array as Array<CharSequence?>?, object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.result.-$$Lambda$ResultFragmentPhimHD$onViewCreated$handleAction$1$tko5eYwwMvnPvWMHCj-Cj9S4QWQ
                @Override // android.content.DialogInterface.OnClickListener
                fun onClick(dialogInterface: DialogInterface?, i: Int) {
                    `m8805invokeSuspend$acquireSingleSubtitleLink$lambda3`(
                        this@Function1,
                        list,
                        dialogInterface,
                        i
                    )
                }
            })
            builder.create().show()
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: invokeSuspend$acquireSingleSubtitleLink$lambda-3  reason: not valid java name */
        fun `m8805invokeSuspend$acquireSingleSubtitleLink$lambda3`(
            function1: Function1<*, *>,
            list: List,
            dialogInterface: DialogInterface?,
            i: Int
        ) {
            function1.invoke(list.get(i))
            if (dialogInterface != null) {
                dialogInterface.dismiss()
            }
        }

        private fun `invokeSuspend$acquireSingeExtractorLink`(
            objectRef: ObjectRef<Set<ExtractorLink>>,
            resultFragmentPhimHD: ResultFragmentPhimHD,
            str: String,
            function1: Function1<ExtractorLink, Unit>
        ) {
            val set: Set<ExtractorLink>? = objectRef.element
            if (set == null) {
                return
            }
            `invokeSuspend$acquireSingleExtractorLink`(
                resultFragmentPhimHD,
                MainAPIKt.sortUrls(set),
                str,
                function1
            )
        }

        /* JADX INFO: Access modifiers changed from: private */
        fun `invokeSuspend$startChromecast`(
            resultFragmentPhimHD: ResultFragmentPhimHD,
            episodeClickEvent: EpisodeClickEvent,
            objectRef: ObjectRef<Set<ExtractorLink?>?>,
            objectRef2: ObjectRef<Set<SubtitleData?>?>,
            str: String?,
            i: Int
        ) {
            val list: List<ResultEpisode?>?
            var activity: FragmentActivity?
            var castSession: CastSession?
            val bool: Boolean?
            val str2: String?
            val str3: String?
            list = resultFragmentPhimHD.currentEpisodes
            if ((list == null) || ((resultFragmentPhimHD.getActivity()
                    .also({ activity = it })) == null) || ((CommonActivity.INSTANCE.getCastSession(
                    activity
                ).also({ castSession = it })) == null)
            ) {
                return
            }
            val castHelper: CastHelper = CastHelper.INSTANCE
            bool = resultFragmentPhimHD.currentIsMovie
            if (bool != null) {
                val booleanValue: Boolean = bool.booleanValue()
                str2 = resultFragmentPhimHD.currentHeaderName
                str3 = resultFragmentPhimHD.currentPoster
                val index: Int = episodeClickEvent.getData().getIndex()
                val set: Set<ExtractorLink>? = objectRef.element
                if (set == null) {
                    return
                }
                val sortUrls: List<ExtractorLink> = MainAPIKt.sortUrls(set)
                val set2: Set<SubtitleData>? = objectRef2.element
                if (set2 == null) {
                    return
                }
                castHelper.startCast(
                    castSession,
                    str,
                    booleanValue,
                    str2,
                    str3,
                    index,
                    list,
                    sortUrls,
                    MainAPIKt.sortSubs(set2),
                    Integer.valueOf(i),
                    Long.valueOf(ResultFragmentPhimHDKt.getRealPosition(episodeClickEvent.getData()))
                )
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */ /* JADX WARN: Removed duplicated region for block: B:29:0x00c7  */ /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */ /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.Object] */ /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Object] */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
        fun `invokeSuspend$requireLinks`(
            r14: String?,
            r15: ResultFragmentPhimHD?,
            r16: EpisodeClickEvent?,
            r17: ObjectRef<Set<ExtractorLink?>?>?,
            r18: ObjectRef<Set<SubtitleData?>?>?,
            r19: Boolean,
            r20: Boolean,
            r21: Continuation<in Boolean?>?
        ): Any {
            /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.p041ui.result.ResultFragmentPhimHD\$onViewCreated\$handleAction$1.invokeSuspend\$requireLinks(java.lang.String, com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD, com.lagradost.cloudstream3.ui.result.EpisodeClickEvent, kotlin.jvm.internal.Ref\$ObjectRef, kotlin.jvm.internal.Ref\$ObjectRef, boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object")
        }

        fun  /* synthetic */`invokeSuspend$requireLinks$default`(
            str: String?,
            resultFragmentPhimHD: ResultFragmentPhimHD?,
            episodeClickEvent: EpisodeClickEvent?,
            objectRef: ObjectRef<*>?,
            objectRef2: ObjectRef<*>?,
            z: Boolean,
            z2: Boolean,
            continuation: Continuation<*>?,
            i: Int,
            obj: Object?
        ): Object {
            return `invokeSuspend$requireLinks`(
                str,
                resultFragmentPhimHD,
                episodeClickEvent,
                objectRef,
                objectRef2,
                z,
                if ((i and 64) != 0) true else z2,
                continuation
            )
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: invokeSuspend$requireLinks$lambda-4  reason: not valid java name */
        fun `m8807invokeSuspend$requireLinks$lambda4`(
            resultFragmentPhimHD: ResultFragmentPhimHD,
            dialogInterface: DialogInterface?
        ) {
            val i: Int
            i = resultFragmentPhimHD.currentLoadingCount
            resultFragmentPhimHD.currentLoadingCount = i + 1
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: invokeSuspend$lambda-7$lambda-6  reason: not valid java name */
        fun `m8806invokeSuspend$lambda7$lambda6`(
            arrayList: ArrayList,
            episodeClickEvent: EpisodeClickEvent,
            objectRef: ObjectRef<*>,
            resultFragmentPhimHD: ResultFragmentPhimHD,
            str: String?,
            mainAPI: MainAPI?,
            dialogInterface: DialogInterface?,
            i: Int
        ) {
            val obj: Object = arrayList.get(i)
            Intrinsics.checkNotNullExpressionValue(obj, "verifiedOptionsValues[which]")
            ResultFragmentPhimHD.Companion.`onViewCreated$handleAction`(
                resultFragmentPhimHD,
                str,
                mainAPI,
                EpisodeClickEvent((obj as Number).intValue(), episodeClickEvent.getData())
            )
            val alertDialog: AlertDialog? = objectRef.element as AlertDialog?
            if (alertDialog != null) {
                UIHelper.INSTANCE.dismissSafe(alertDialog, resultFragmentPhimHD.getActivity())
            }
        }
    }
}