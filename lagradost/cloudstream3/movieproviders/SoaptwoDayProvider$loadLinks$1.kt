package com.lagradost.cloudstream3.movieproviders

import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: SoaptwoDayProvider.kt */
@Metadata(m106k = 3, m105mv = [1, 6, 0], m103xi = 48)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.movieproviders.SoaptwoDayProvider",
    m98f = "SoaptwoDayProvider.kt",
    m97i = [0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1],
    m96l = [191, 207],
    m95m = "loadLinks",
    m94n = ["this", "data", "subtitleCallback", "callback", "this", "data", "subtitleCallback", "callback", "movieid", "ajaxlink", "destination\$iv\$iv"],
    m93s = ["L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"]
) /* loaded from: classes3.dex */
class `SoaptwoDayProvider$loadLinks$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */(/* synthetic */
    val `this$0`: SoaptwoDayProvider,
    continuation: Continuation<in `SoaptwoDayProvider$loadLinks$1`?>?
) : ContinuationImpl(continuation) {
    var `L$0`: Object? = null
    var `L$1`: Object? = null
    var `L$2`: Object? = null
    var `L$3`: Object? = null
    var `L$4`: Object? = null
    var `L$5`: Object? = null
    var `L$6`: Object? = null
    var `L$7`: Object? = null
    var label = 0

    /* synthetic */
    var result: Object? = null

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        result = obj
        label = label or Integer.MIN_VALUE
        return `this$0`.loadLinks(null, false, null, null, this)
    }
}