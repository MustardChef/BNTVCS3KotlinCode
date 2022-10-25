package com.lagradost.cloudstream3

import androidx.exifinterface.media.ExifInterface
import kotlin.coroutines.jvm.internal.DebugMetadata
import com.lagradost.cloudstream3.``ParCollectionsKt$apmapIndexed$1$1$1`
import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: MainAPI.kt */
@Metadata(m106k = 3, m105mv = [1, 6, 0], m103xi = 48)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.APIHolder",
    m98f = "MainAPI.kt",
    m97i = [0, 0, 1, 1, 1],
    m96l = [bqk.f6557bQ, bqk.f6562bV, bqk.f6526am],
    m95m = "getCaptchaToken",
    m94n = [SDKConstants.PARAM_KEY, "domain", SDKConstants.PARAM_KEY, "domain", "vToken"],
    m93s = ["L$0", "L$1", "L$0", "L$1", "L$2"]
) /* loaded from: classes3.dex */
class `APIHolder$getCaptchaToken$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */(/* synthetic */
    val `this$0`: APIHolder, continuation: Continuation<in `APIHolder$getCaptchaToken$1`?>?
) : ContinuationImpl(continuation) {
    var `L$0`: Object? = null
    var `L$1`: Object? = null
    var `L$2`: Object? = null
    var label = 0

    /* synthetic */
    var result: Object? = null

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        result = obj
        label = label or Integer.MIN_VALUE
        return `this$0`.getCaptchaToken(null, null, null, this)
    }
}