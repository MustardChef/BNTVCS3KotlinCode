package com.lagradost.cloudstream3.movieproviders

import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: PinoyMoviesEsProvider.kt */
@Metadata(m106k = 3, m105mv = [1, 6, 0], m103xi = 48)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.movieproviders.PinoyMoviesEsProvider",
    m98f = "PinoyMoviesEsProvider.kt",
    m97i = [0, 0],
    m96l = [152],
    m95m = "load",
    m94n = ["this", "url"],
    m93s = ["L$0", "L$1"]
) /* loaded from: classes3.dex */
class `PinoyMoviesEsProvider$load$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */(/* synthetic */
    val `this$0`: PinoyMoviesEsProvider,
    continuation: Continuation<in `PinoyMoviesEsProvider$load$1`?>?
) : ContinuationImpl(continuation) {
    var `L$0`: Object? = null
    var `L$1`: Object? = null
    var label = 0

    /* synthetic */
    var result: Object? = null

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        result = obj
        label = label or Integer.MIN_VALUE
        return `this$0`.load(null, this)
    }
}