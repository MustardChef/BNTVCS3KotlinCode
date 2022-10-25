package com.lagradost.cloudstream3.utils

import com.lagradost.cloudstream3.MainAPIKt.isMovieType
import com.lagradost.cloudstream3.MainAPIKt.getMapper
import com.lagradost.cloudstream3.CommonActivity.Companion.`showToast$default`
import com.lagradost.cloudstream3.MainAPIKt.base64Decode
import com.lagradost.cloudstream3.AcraApplication.Companion.getKeys
import com.lagradost.cloudstream3.AcraApplication.Companion.setKey
import com.lagradost.cloudstream3.AcraApplication.Companion.context
import com.lagradost.cloudstream3.AcraApplication.Companion.removeKey
import com.lagradost.cloudstream3.MainActivityKt.getApp
import com.lagradost.cloudstream3.APIHolder.getApiFromNameNull
import com.lagradost.cloudstream3.MainAPI.extractorVerifierJob
import androidx.exifinterface.media.ExifInterface
import com.google.android.exoplayer2.source.rtsp.SessionDescription
import kotlin.LazyKt
import com.lagradost.cloudstream3.utils.``Vector2$lengthSquared$2`
import kotlin.coroutines.Continuation

/* compiled from: M3u8Helper.kt */
@Metadata(
    m108d1 = ["\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"],
    m107d2 = ["<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.utils.M3u8Helper\$m3u8Generation\$generate$1\$response$1",
    m98f = "M3u8Helper.kt",
    m97i = [],
    m96l = [123],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
)
/* loaded from: classes4.dex */
internal class `M3u8Helper$m3u8Generation$generate$1$response$1`(
    m3u8Stream: M3u8Stream,
    continuation: Continuation<in `M3u8Helper$m3u8Generation$generate$1$response$1`?>?
) : SuspendLambda(2, continuation), Function2<CoroutineScope, Continuation<in String?>?, Object> {
    /* synthetic */ val `$m3u8`: M3u8Stream
    var label = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$m3u8` = m3u8Stream
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        return `M3u8Helper$m3u8Generation$generate$1$response$1`(`$m3u8`, continuation)
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in String?>?
    ): Object {
        return (create(
            coroutineScope,
            continuation
        ) as `M3u8Helper$m3u8Generation$generate$1$response$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val obj2: Object
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            label = 1
            obj2 = Requests.`get$default`(
                MainActivityKt.getApp(),
                `$m3u8`.getStreamUrl(),
                `$m3u8`.getHeaders(),
                null,
                null,
                null,
                false,
                0,
                null,
                0L,
                null,
                false,
                this,
                2044,
                null
            )
            if (obj2 === coroutine_suspended) {
                return coroutine_suspended
            }
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            ResultKt.throwOnFailure(obj)
            obj2 = obj
        }
        return (obj2 as NiceResponse).getText()
    }
}