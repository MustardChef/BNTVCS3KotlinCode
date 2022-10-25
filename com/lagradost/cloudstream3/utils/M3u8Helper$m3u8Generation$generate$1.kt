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

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: M3u8Helper.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"],
    m107d2 = ["<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lcom/lagradost/cloudstream3/utils/M3u8Helper\$M3u8Stream;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.utils.M3u8Helper\$m3u8Generation\$generate$1",
    m98f = "M3u8Helper.kt",
    m97i = [0, 0, 0, 0, 0, 1, 1, 1],
    m96l = [139, 149, 158],
    m95m = "invokeSuspend",
    m94n = ["\$this\$sequence", "m3u8Parent", "quality", "m3u8Link", "hasAnyContent", "\$this\$sequence", "m3u8Parent", "hasAnyContent"],
    m93s = ["L$0", "L$1", "L$3", "L$4", "I$0", "L$0", "L$1", "I$0"]
) /* loaded from: classes4.dex */
class `M3u8Helper$m3u8Generation$generate$1`(/* synthetic */val `this$0`: M3u8Helper,
                                                            m3u8Stream: M3u8Stream?,
                                                            bool: Boolean?,
                                                            continuation: Continuation<in `M3u8Helper$m3u8Generation$generate$1`?>?
) : RestrictedSuspendLambda(2, continuation),
    Function2<SequenceScope<in M3u8Stream?>, Continuation<in Unit>?, Object> {
    /* synthetic */ val `$m3u8`: M3u8Stream?
    /* synthetic */ val `$returnThis`: Boolean?
    var `I$0` = 0
    private /* synthetic */  var `L$0`: Object? = null
    var `L$1`: Object? = null
    var `L$2`: Object? = null
    var `L$3`: Object? = null
    var `L$4`: Object? = null
    var label = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$m3u8` = m3u8Stream
        `$returnThis` = bool
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        val `m3u8Helper$m3u8Generation$generate$1` = `M3u8Helper$m3u8Generation$generate$1`(
            `this$0`, `$m3u8`, `$returnThis`, continuation
        )
        `m3u8Helper$m3u8Generation$generate$1`.`L$0` = obj
        return `m3u8Helper$m3u8Generation$generate$1`
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(
        sequenceScope: SequenceScope<in M3u8Stream?>,
        continuation: Continuation<in Unit>?
    ): Object {
        return (create(
            sequenceScope,
            continuation
        ) as `M3u8Helper$m3u8Generation$generate$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0094  */ /* JADX WARN: Removed duplicated region for block: B:41:0x017d A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:42:0x017e  */ /* JADX WARN: Removed duplicated region for block: B:44:0x0184  */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x017e -> B:43:0x0181). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun invokeSuspend(r17: Any?): Any {
        /*
            Method dump skipped, instructions count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.utils.M3u8Helper\$m3u8Generation\$generate$1.invokeSuspend(java.lang.Object):java.lang.Object")
    }
}