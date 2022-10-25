package com.lagradost.cloudstream3.movieproviders

import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: VfFilmProvider.kt */
@Metadata(m106k = 3, m105mv = [1, 6, 0], m103xi = 48)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.movieproviders.VfFilmProvider",
    m98f = "VfFilmProvider.kt",
    m97i = [],
    m96l = [63, 66],
    m95m = "getDirect",
    m94n = [],
    m93s = []
) /* loaded from: classes3.dex */
class `VfFilmProvider$getDirect$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */(/* synthetic */
    val `this$0`: VfFilmProvider, continuation: Continuation<in `VfFilmProvider$getDirect$1`?>?
) : ContinuationImpl(continuation) {
    var label = 0

    /* synthetic */
    var result: Object? = null

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val direct: Object
        result = obj
        label = label or Integer.MIN_VALUE
        direct = `this$0`.getDirect(null, this)
        return direct
    }
}