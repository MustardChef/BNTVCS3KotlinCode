package com.lagradost.cloudstream3.p041ui.player

import java.util.List
import kotlin.jvm.internal.Intrinsics

/* compiled from: AbstractPlayerFragment.kt */
@Metadata(m106k = 3, m105mv = [1, 6, 0], m103xi = 48)
internal class `AbstractPlayerFragment$onViewCreated$10`  /* JADX INFO: Access modifiers changed from: package-private */
constructor(obj: Object?) : FunctionReferenceImpl(
    1,
    obj,
    AbstractPlayerFragment::class.java,
    "embeddedSubtitlesFetched",
    "embeddedSubtitlesFetched(Ljava/util/List;)V",
    0
), Function1<List<SubtitleData?>?, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(list: List<SubtitleData?>?) {
        invoke2(list)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(p0: List<SubtitleData?>?) {
        Intrinsics.checkNotNullParameter(p0, "p0")
        (this.receiver as AbstractPlayerFragment).embeddedSubtitlesFetched(p0)
    }
}