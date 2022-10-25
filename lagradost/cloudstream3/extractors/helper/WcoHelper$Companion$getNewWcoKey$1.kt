package com.lagradost.cloudstream3.extractors.helper

import kotlin.coroutines.Continuation
import kotlin.coroutines.jvm.internal.DebugMetadata

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: WcoHelper.kt */
@Metadata(m106k = 3, m105mv = [1, 6, 0], m103xi = 48)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.extractors.helper.WcoHelper\$Companion",
    m98f = "WcoHelper.kt",
    m97i = [],
    m96l = [52],
    m95m = "getNewWcoKey",
    m94n = [],
    m93s = []
) /* loaded from: classes3.dex */
class `WcoHelper$Companion$getNewWcoKey$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */(/* synthetic */
    val `this$0`: WcoHelper.Companion,
    continuation: Continuation<in `WcoHelper$Companion$getNewWcoKey$1`?>?
) : ContinuationImpl(continuation) {
    var label = 0

    /* synthetic */
    var result: Object? = null

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        result = obj
        label = label or Integer.MIN_VALUE
        return `this$0`.getNewWcoKey(this)
    }
}