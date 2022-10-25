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
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"],
    m107d2 = ["<anonymous>", "", "Lkotlin/sequences/SequenceScope;", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.utils.M3u8Helper\$defaultIvGen$1",
    m98f = "M3u8Helper.kt",
    m97i = [0, 0],
    m96l = [71],
    m95m = "invokeSuspend",
    m94n = ["\$this\$sequence", "initial"],
    m93s = ["L$0", "I$0"]
) /* loaded from: classes4.dex */
class `M3u8Helper$defaultIvGen$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */(/* synthetic */
    val `this$0`: M3u8Helper, continuation: Continuation<in `M3u8Helper$defaultIvGen$1`?>?
) : RestrictedSuspendLambda(2, continuation),
    Function2<SequenceScope<in ByteArray?>, Continuation<in Unit>?, Object> {
    var `I$0` = 0
    private /* synthetic */  var `L$0`: Object? = null
    var label = 0

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        val `m3u8Helper$defaultIvGen$1` = `M3u8Helper$defaultIvGen$1`(`this$0`, continuation)
        `m3u8Helper$defaultIvGen$1`.`L$0` = obj
        return `m3u8Helper$defaultIvGen$1`
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(
        sequenceScope: SequenceScope<in ByteArray?>,
        continuation: Continuation<in Unit>?
    ): Object {
        return (create(sequenceScope, continuation) as `M3u8Helper$defaultIvGen$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003d A[RETURN] */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003b -> B:12:0x003e). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun invokeSuspend(r7: Any?): Any {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L1e
            if (r1 != r2) goto L16
            int r1 = r6.I$0
            java.lang.Object r3 = r6.L$0
            kotlin.sequences.SequenceScope r3 = (kotlin.sequences.SequenceScope) r3
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = r6
            goto L3e
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r6.L$0
            kotlin.sequences.SequenceScope r7 = (kotlin.sequences.SequenceScope) r7
            r3 = r7
            r1 = 1
            r7 = r6
        L28:
            com.lagradost.cloudstream3.utils.M3u8Helper r4 = r7.this$0
            byte[] r4 = com.lagradost.cloudstream3.utils.M3u8Helper.access$toBytes16Big(r4, r1)
            r5 = r7
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            r7.L$0 = r3
            r7.I$0 = r1
            r7.label = r2
            java.lang.Object r4 = r3.yield(r4, r5)
            if (r4 != r0) goto L3e
            return r0
        L3e:
            int r1 = r1 + r2
            goto L28
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.utils.M3u8Helper\$defaultIvGen$1.invokeSuspend(java.lang.Object):java.lang.Object")
    }
}