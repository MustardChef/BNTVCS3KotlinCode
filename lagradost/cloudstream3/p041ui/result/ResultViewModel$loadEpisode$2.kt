package com.lagradost.cloudstream3.p041ui.result

import com.lagradost.cloudstream3.p041ui.player.IGenerator
import java.util.LinkedHashSet
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: ResultViewModel.kt */
@Metadata(
    m108d1 = ["\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u0001H\u008a@"],
    m107d2 = ["<anonymous>", "Lkotlin/Pair;", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "Lcom/lagradost/cloudstream3/ui/player/SubtitleData;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.ui.result.ResultViewModel\$loadEpisode$2",
    m98f = "ResultViewModel.kt",
    m97i = [0, 0],
    m96l = [255],
    m95m = "invokeSuspend",
    m94n = ["currentLinks", "currentSubs"],
    m93s = ["L$0", "L$1"]
) /* renamed from: com.lagradost.cloudstream3.ui.result.ResultViewModel$loadEpisode$2 */ /* loaded from: classes4.dex */
class `ResultViewModel$loadEpisode$2`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(/* synthetic */
    val `this$0`: ResultViewModel, /* synthetic */
    val `$episode`: ResultEpisode, /* synthetic */
    val `$clearCache`: Boolean, /* synthetic */
    val `$isCasting`: Boolean, continuation: Continuation<in `ResultViewModel$loadEpisode$2`?>?
) : SuspendLambda(1, continuation),
    Function1<Continuation<in Tuples<out Set<ExtractorLink?>?, out Set<SubtitleData?>?>?>?, Object> {
    var `L$0`: Object? = null
    var `L$1`: Object? = null
    var label: Int = 0

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun create(continuation: Continuation<*>?): Continuation<Unit> {
        return `ResultViewModel$loadEpisode$2`(
            `this$0`,
            `$episode`,
            `$clearCache`,
            `$isCasting`,
            continuation
        )
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(continuation: Continuation<in Tuples<out Set<ExtractorLink?>?, out Set<SubtitleData?>?>?>?): Object {
        return invoke2(continuation as Continuation<in Tuples<out Set<ExtractorLink?>?, out Set<SubtitleData?>?>?>?)
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(continuation: Continuation<in Tuples<out Set<ExtractorLink?>?, out Set<SubtitleData?>?>?>?): Object {
        return (create(continuation) as `ResultViewModel$loadEpisode$2`).invokeSuspend(Unit.INSTANCE)
    }

    /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Set] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun invokeSuspend(obj: Object): Object {
        var obj: Object? = obj
        val mutableLiveData: MutableLiveData<*>
        val linkedHashSet: Set?
        val linkedHashSet2: LinkedHashSet?
        val iGenerator: IGenerator?
        val iGenerator2: IGenerator?
        val linkedHashSet3: LinkedHashSet?
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i: Int = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            mutableLiveData = `this$0`._episodes
            val list: List? = mutableLiveData.getValue()
            val indexOf: Int = if (list != null) list.indexOf(`$episode`) else `$episode`.getIndex()
            linkedHashSet = LinkedHashSet()
            linkedHashSet2 = LinkedHashSet()
            iGenerator = `this$0`.generator
            if (iGenerator != null) {
                iGenerator.mo8669goto(indexOf)
            }
            iGenerator2 = `this$0`.generator
            if (iGenerator2 != null) {
                `L$0` = linkedHashSet
                `L$1` = linkedHashSet2
                label = 1
                obj = IGenerator.DefaultImpls.`generateLinks$default`(
                    iGenerator2,
                    `$clearCache`,
                    `$isCasting`,
                    C49511(linkedHashSet),
                    C49522(linkedHashSet2),
                    0,
                    this,
                    16,
                    null
                )
                if (obj === coroutine_suspended) {
                    return coroutine_suspended
                }
                linkedHashSet3 = linkedHashSet2
            }
            return Tuples<Any?, Any?>(
                CollectionsKt.toSet(linkedHashSet),
                CollectionsKt.toSet(linkedHashSet2)
            )
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            linkedHashSet = `L$0`
            ResultKt.throwOnFailure(obj)
            linkedHashSet3 = `L$1`
        }
        val bool: Boolean? = obj
        linkedHashSet2 = linkedHashSet3
        return Tuples<Any?, Any?>(
            CollectionsKt.toSet(linkedHashSet),
            CollectionsKt.toSet(linkedHashSet2)
        )
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: ResultViewModel.kt */
    @Metadata(
        m108d1 = ["\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n¢\u0006\u0002\b\u0006"],
        m107d2 = ["<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "Lcom/lagradost/cloudstream3/utils/ExtractorUri;", "invoke"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.result.ResultViewModel$loadEpisode$2$1 */ /* loaded from: classes4.dex */
    class C49511 internal constructor(set: Set<ExtractorLink>?) : Lambda<Any?>(1),
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

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: ResultViewModel.kt */
    @Metadata(
        m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
        m107d2 = ["<anonymous>", "", "sub", "Lcom/lagradost/cloudstream3/ui/player/SubtitleData;", "invoke"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.result.ResultViewModel$loadEpisode$2$2 */ /* loaded from: classes4.dex */
    class C49522 internal constructor(set: Set<SubtitleData>?) : Lambda<Any?>(1),
        Function1<SubtitleData?, Unit> {
        /* synthetic */ val `$currentSubs`: Set<SubtitleData>?

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
}