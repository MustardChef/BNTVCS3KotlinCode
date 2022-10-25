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
import kotlin.jvm.functions.Functions

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: FillerEpisodeCheck.kt */
@Metadata(
    m108d1 = ["\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"],
    m107d2 = ["<anonymous>", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class `FillerEpisodeCheck$calc$1`(/* synthetic */val `$this_calc`: Int, intRef: IntRef) :
    Lambda<Any?>(0), Functions<Unit> {
    /* synthetic */ val `$counter`: IntRef

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$counter` = intRef
    }

    @Override // kotlin.jvm.functions.Functions
    /* bridge */ /* synthetic */  override fun invoke() {
        invoke2()
        return Unit.INSTANCE
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: FillerEpisodeCheck.kt */
    @Metadata(
        m108d1 = ["\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"],
        m107d2 = ["<anonymous>", ""],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    @DebugMetadata(
        m99c = "com.lagradost.cloudstream3.utils.FillerEpisodeCheck\$calc$1$1",
        m98f = "FillerEpisodeCheck.kt",
        m97i = [],
        m96l = [],
        m95m = "invokeSuspend",
        m94n = [],
        m93s = []
    ) /* renamed from: com.lagradost.cloudstream3.utils.FillerEpisodeCheck$calc$1$1 */ /* loaded from: classes4.dex */
    class C49791 internal constructor(
        intRef: IntRef,
        i: Int,
        continuation: Continuation<in C49791?>?
    ) : SuspendLambda(1, continuation), Function1<Continuation<in Unit>?, Object?> {
        /* synthetic */ val `$counter`: IntRef
        /* synthetic */ val `$this_calc`: Int
        var label = 0

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        init {
            `$counter` = intRef
            `$this_calc` = i
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        override fun create(continuation: Continuation<*>?): Continuation<Unit> {
            return C49791(`$counter`, `$this_calc`, continuation)
        }

        @Override // kotlin.jvm.functions.Function1
        override operator fun invoke(continuation: Continuation<in Unit>): Object {
            return (create(continuation) as C49791).invokeSuspend(Unit.INSTANCE)
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        override fun invokeSuspend(obj: Object): Object {
            IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (label == 0) {
                ResultKt.throwOnFailure(obj)
                var z = true
                while (z) {
                    `$counter`.element++
                    if (`$this_calc` > 10) {
                        z = false
                    }
                }
                return Unit.INSTANCE
            }
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        }
    }

    @Override // kotlin.jvm.functions.Functions
            /* renamed from: invoke  reason: avoid collision after fix types in other method */    fun invoke2() {
        Thread.sleep(`$this_calc` * TimeConstants.MIN)
        Coroutines.Companion.INSTANCE.main(C49791(`$counter`, `$this_calc`, null))
    }
}