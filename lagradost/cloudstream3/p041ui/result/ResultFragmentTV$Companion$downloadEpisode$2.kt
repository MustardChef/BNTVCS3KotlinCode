package com.lagradost.cloudstream3.p041ui.result

import android.app.Activity
import com.lagradost.cloudstream3.p041ui.player.IGenerator
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: ResultFragmentTV.kt */
@Metadata(
    m108d1 = ["\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"],
    m107d2 = ["<anonymous>", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.ui.result.ResultFragmentTV\$Companion\$downloadEpisode$2",
    m98f = "ResultFragmentTV.kt",
    m97i = [0, 0],
    m96l = [393],
    m95m = "invokeSuspend",
    m94n = ["currentLinks", "currentSubs"],
    m93s = ["L$0", "L$1"]
) /* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentTV$Companion$downloadEpisode$2 */ /* loaded from: classes4.dex */
class `ResultFragmentTV$Companion$downloadEpisode$2` constructor(/* synthetic */val `$episode`: ResultEpisode?,
                                                                                activity: Activity?,
                                                                                z: Boolean,
                                                                                str: String?,
                                                                                tvType: TvType?,
                                                                                str2: String?,
                                                                                str3: String?,
                                                                                i: Int,
                                                                                str4: String?,
                                                                                continuation: Continuation<in `ResultFragmentTV$Companion$downloadEpisode$2`?>?
) : SuspendLambda(1, continuation), Function1<Continuation<in Unit>?, Object> {
    /* synthetic */ val `$activity`: Activity?
    /* synthetic */ val `$apiName`: String?
    /* synthetic */ val `$currentHeaderName`: String?
    /* synthetic */ val `$currentIsMovie`: Boolean
    /* synthetic */ val `$currentPoster`: String?
    /* synthetic */ val `$currentType`: TvType?
    /* synthetic */ val `$parentId`: Int
    /* synthetic */ val `$url`: String?
    var `L$0`: Object? = null
    var `L$1`: Object? = null
    var label: Int = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$activity` = activity
        `$currentIsMovie` = z
        `$currentHeaderName` = str
        `$currentType` = tvType
        `$currentPoster` = str2
        `$apiName` = str3
        `$parentId` = i
        `$url` = str4
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun create(continuation: Continuation<*>?): Continuation<Unit> {
        return `ResultFragmentTV$Companion$downloadEpisode$2`(
            `$episode`,
            `$activity`,
            `$currentIsMovie`,
            `$currentHeaderName`,
            `$currentType`,
            `$currentPoster`,
            `$apiName`,
            `$parentId`,
            `$url`,
            continuation
        )
    }

    @Override // kotlin.jvm.functions.Function1
    public override fun invoke(continuation: Continuation<in Unit>?): Object {
        return (create(continuation) as `ResultFragmentTV$Companion$downloadEpisode$2`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun invokeSuspend(obj: Object): Object {
        val linkedHashSet: LinkedHashSet?
        val set: Set?
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i: Int = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            val repoLinkGenerator: RepoLinkGenerator = RepoLinkGenerator(
                CollectionsKt.listOf(
                    `$episode`
                ), 0, null, 6, null
            )
            linkedHashSet = LinkedHashSet()
            val linkedHashSet2: LinkedHashSet = LinkedHashSet()
            `L$0` = linkedHashSet
            `L$1` = linkedHashSet2
            label = 1
            if (IGenerator.DefaultImpls.`generateLinks$default`(
                    repoLinkGenerator,
                    false,
                    false,
                    C49401(linkedHashSet),
                    C49412(linkedHashSet2),
                    0,
                    this,
                    16,
                    null
                ) === coroutine_suspended
            ) {
                return coroutine_suspended
            }
            set = linkedHashSet2
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            set = `L$1`
            linkedHashSet = `L$0`
            ResultKt.throwOnFailure(obj)
        }
        if (linkedHashSet.isEmpty()) {
            Coroutines.INSTANCE.main(C49423(`$activity`, null))
            return Unit.INSTANCE
        }
        ResultFragmentTV.Companion.Companion.startDownload(
            `$activity`,
            `$episode`,
            `$currentIsMovie`,
            `$currentHeaderName`,
            `$currentType`,
            `$currentPoster`,
            `$apiName`,
            `$parentId`,
            `$url`,
            MainAPIKt.sortUrls(linkedHashSet),
            MainAPIKt.sortSubs(set)
        )
        return Unit.INSTANCE
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: ResultFragmentTV.kt */
    @Metadata(
        m108d1 = ["\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n¢\u0006\u0002\b\u0006"],
        m107d2 = ["<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "Lcom/lagradost/cloudstream3/utils/ExtractorUri;", "invoke"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentTV$Companion$downloadEpisode$2$1 */ /* loaded from: classes4.dex */
    class C49401 internal constructor(set: Set<ExtractorLink>?) : Lambda<Any?>(1),
        Function1<Tuples<out ExtractorLink?, out ExtractorUri?>, Unit> {
        /* synthetic */ val `$currentLinks`: Set<ExtractorLink>?

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        init {
            `$currentLinks` = set
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */  override fun invoke(tuples: Tuples<out ExtractorLink?, out ExtractorUri?>) {
            invoke2(tuples as Tuples<out ExtractorLink?, ExtractorUri?>)
            return Unit.INSTANCE
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        fun invoke2(it: Tuples<out ExtractorLink?, ExtractorUri?>) {
            Intrinsics.checkNotNullParameter(it, "it")
            val first: ExtractorLink? = it.getFirst()
            if (first != null) {
                `$currentLinks`.add(first)
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: ResultFragmentTV.kt */
    @Metadata(
        m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
        m107d2 = ["<anonymous>", "", "sub", "Lcom/lagradost/cloudstream3/ui/player/SubtitleData;", "invoke"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentTV$Companion$downloadEpisode$2$2 */ /* loaded from: classes4.dex */
    class C49412 internal constructor(set: Set<SubtitleData>) : Lambda<Any?>(1),
        Function1<SubtitleData?, Unit> {
        /* synthetic */ val `$currentSubs`: Set<SubtitleData>

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        init {
            `$currentSubs` = set
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */  override fun invoke(subtitleData: SubtitleData?) {
            invoke2(subtitleData)
            return Unit.INSTANCE
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        fun invoke2(sub: SubtitleData?) {
            Intrinsics.checkNotNullParameter(sub, "sub")
            `$currentSubs`.add(sub)
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: ResultFragmentTV.kt */
    @Metadata(
        m108d1 = ["\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"],
        m107d2 = ["<anonymous>", ""],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    @DebugMetadata(
        m99c = "com.lagradost.cloudstream3.ui.result.ResultFragmentTV\$Companion\$downloadEpisode$2$3",
        m98f = "ResultFragmentTV.kt",
        m97i = [],
        m96l = [],
        m95m = "invokeSuspend",
        m94n = [],
        m93s = []
    ) /* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentTV$Companion$downloadEpisode$2$3 */ /* loaded from: classes4.dex */
    class C49423 internal constructor(
        activity: Activity?,
        continuation: Continuation<in C49423?>?
    ) : SuspendLambda(1, continuation), Function1<Continuation<in Unit>?, Object> {
        /* synthetic */ val `$activity`: Activity?
        var label: Int = 0

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        init {
            `$activity` = activity
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public override fun create(continuation: Continuation<*>?): Continuation<Unit> {
            return C49423(`$activity`, continuation)
        }

        @Override // kotlin.jvm.functions.Function1
        public override fun invoke(continuation: Continuation<in Unit>?): Object {
            return (create(continuation) as C49423).invokeSuspend(Unit.INSTANCE)
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public override fun invokeSuspend(obj: Object): Object {
            IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (label == 0) {
                ResultKt.throwOnFailure(obj)
                CommonActivity.INSTANCE.showToast(`$activity`, R.string.no_links_found_toast, 0)
                return Unit.INSTANCE
            }
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        }
    }
}