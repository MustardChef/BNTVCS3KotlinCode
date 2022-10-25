package com.lagradost.cloudstream3.p041ui

import com.lagradost.cloudstream3.p041ui.player.IGenerator
import java.util.Set
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: ControllerActivity.kt */
@Metadata(
    m108d1 = ["\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\u008a@"],
    m107d2 = ["<anonymous>", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.ui.SelectSourceController\$onMediaStatusUpdated$1\$isSuccessful$1",
    m98f = "ControllerActivity.kt",
    m97i = [],
    m96l = [297],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
)
/* renamed from: com.lagradost.cloudstream3.ui.SelectSourceController$onMediaStatusUpdated$1$isSuccessful$1 */ /* loaded from: classes.dex */
internal class `SelectSourceController$onMediaStatusUpdated$1$isSuccessful$1` constructor(
    repoLinkGenerator: RepoLinkGenerator,
    set: Set<ExtractorLink>?,
    set2: Set<SubtitleData>,
    continuation: Continuation<in `SelectSourceController$onMediaStatusUpdated$1$isSuccessful$1`?>?
) : SuspendLambda(1, continuation), Function1<Continuation<in Boolean?>?, Object> {
    /* synthetic */ val `$currentLinks`: Set<ExtractorLink>?
    /* synthetic */ val `$currentSubs`: Set<SubtitleData>
    /* synthetic */ val `$generator`: RepoLinkGenerator
    var label: Int = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$generator` = repoLinkGenerator
        `$currentLinks` = set
        `$currentSubs` = set2
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun create(continuation: Continuation<*>?): Continuation<Unit> {
        return `SelectSourceController$onMediaStatusUpdated$1$isSuccessful$1`(
            `$generator`,
            `$currentLinks`,
            `$currentSubs`,
            continuation
        )
    }

    @Override // kotlin.jvm.functions.Function1
    public override fun invoke(continuation: Continuation<in Boolean?>?): Object {
        return (create(continuation) as `SelectSourceController$onMediaStatusUpdated$1$isSuccessful$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: ControllerActivity.kt */
    @Metadata(
        m108d1 = ["\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n¢\u0006\u0002\b\u0006"],
        m107d2 = ["<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "Lcom/lagradost/cloudstream3/utils/ExtractorUri;", "invoke"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.SelectSourceController$onMediaStatusUpdated$1$isSuccessful$1$1 */ /* loaded from: classes.dex */
    class C48381 internal constructor(set: Set<ExtractorLink>?) : Lambda<Any?>(1),
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

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: ControllerActivity.kt */
    @Metadata(
        m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
        m107d2 = ["<anonymous>", "", "it", "Lcom/lagradost/cloudstream3/ui/player/SubtitleData;", "invoke"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.SelectSourceController$onMediaStatusUpdated$1$isSuccessful$1$2 */ /* loaded from: classes.dex */
    class C48392 internal constructor(set: Set<SubtitleData>) : Lambda<Any?>(1),
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
        fun invoke2(it: SubtitleData?) {
            Intrinsics.checkNotNullParameter(it, "it")
            `$currentSubs`.add(it)
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun invokeSuspend(obj: Object): Object {
        var obj: Object = obj
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i: Int = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            label = 1
            obj = IGenerator.DefaultImpls.`generateLinks$default`(
                `$generator`,
                false,
                true,
                C48381(`$currentLinks`),
                C48392(`$currentSubs`),
                0,
                this,
                16,
                null
            )
            if (obj === coroutine_suspended) {
                return coroutine_suspended
            }
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            ResultKt.throwOnFailure(obj)
        }
        return obj
    }
}