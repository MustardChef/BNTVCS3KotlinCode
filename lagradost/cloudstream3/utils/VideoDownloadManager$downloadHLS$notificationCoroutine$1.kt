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

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: VideoDownloadManager.kt */
@Metadata(
    m108d1 = ["\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"],
    m107d2 = ["<anonymous>", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.utils.VideoDownloadManager\$downloadHLS\$notificationCoroutine$1",
    m98f = "VideoDownloadManager.kt",
    m97i = [0],
    m96l = [1237],
    m95m = "invokeSuspend",
    m94n = ["i"],
    m93s = ["I$0"]
) /* loaded from: classes4.dex */
class `VideoDownloadManager$downloadHLS$notificationCoroutine$1`(
    booleanRef: BooleanRef,
    booleanRef2: BooleanRef,
    booleanRef3: BooleanRef,
    num: Integer,
    function1: Function1<in CreateNotificationMetadata, Unit>,
    longRef: LongRef,
    j: Long,
    longRef2: LongRef,
    continuation: Continuation<in `VideoDownloadManager$downloadHLS$notificationCoroutine$1`?>?
) : SuspendLambda(1, continuation), Function1<Continuation<in Unit>?, Object?> {
    /* synthetic */ val `$bytesDownloaded`: LongRef
    /* synthetic */ val `$createNotificationCallback`: Function1<CreateNotificationMetadata, Unit>
    /* synthetic */ val `$isDone`: BooleanRef
    /* synthetic */ val `$isFailed`: BooleanRef
    /* synthetic */ val `$isPaused`: BooleanRef
    /* synthetic */ val `$parentId`: Integer
    /* synthetic */ val `$totalTs`: Long
    /* synthetic */ val `$tsProgress`: LongRef
    var `I$0` = 0
    var label = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$isDone` = booleanRef
        `$isFailed` = booleanRef2
        `$isPaused` = booleanRef3
        `$parentId` = num
        `$createNotificationCallback` = function1
        `$bytesDownloaded` = longRef
        `$totalTs` = j
        `$tsProgress` = longRef2
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(continuation: Continuation<*>?): Continuation<Unit> {
        return `VideoDownloadManager$downloadHLS$notificationCoroutine$1`(
            `$isDone`,
            `$isFailed`,
            `$isPaused`,
            `$parentId`,
            `$createNotificationCallback`,
            `$bytesDownloaded`,
            `$totalTs`,
            `$tsProgress`,
            continuation
        )
    }

    @Override // kotlin.jvm.functions.Function1
    override operator fun invoke(continuation: Continuation<in Unit>): Object {
        return (create(continuation) as `VideoDownloadManager$downloadHLS$notificationCoroutine$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */ /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0037 -> B:13:0x0038). Please submit an issue!!! */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0049 -> B:18:0x004c). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun invokeSuspend(r13: Any?): Any {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.label
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L12
            int r1 = r12.I$0
            kotlin.ResultKt.throwOnFailure(r13)
            r13 = r12
            goto L4c
        L12:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1a:
            kotlin.ResultKt.throwOnFailure(r13)
            r13 = r12
        L1e:
            kotlin.jvm.internal.Ref$BooleanRef r1 = r13.$isDone
            boolean r1 = r1.element
            if (r1 != 0) goto L37
            kotlin.jvm.internal.Ref$BooleanRef r3 = r13.$isDone
            kotlin.jvm.internal.Ref$BooleanRef r4 = r13.$isFailed
            kotlin.jvm.internal.Ref$BooleanRef r5 = r13.$isPaused
            java.lang.Integer r6 = r13.$parentId
            kotlin.jvm.functions.Function1<com.lagradost.cloudstream3.utils.VideoDownloadManager$CreateNotificationMetadata, kotlin.Unit> r7 = r13.$createNotificationCallback
            kotlin.jvm.internal.Ref$LongRef r8 = r13.$bytesDownloaded
            long r9 = r13.$totalTs
            kotlin.jvm.internal.Ref$LongRef r11 = r13.$tsProgress
            com.lagradost.cloudstream3.utils.VideoDownloadManager.m9023access$downloadHLS$updateNotification22(r3, r4, r5, r6, r7, r8, r9, r11)
        L37:
            r1 = 1
        L38:
            r3 = 11
            if (r1 >= r3) goto L1e
            r3 = 100
            r5 = r13
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            r13.I$0 = r1
            r13.label = r2
            java.lang.Object r3 = kotlinx.coroutines.DelayKt.delay(r3, r5)
            if (r3 != r0) goto L4c
            return r0
        L4c:
            int r1 = r1 + r2
            goto L38
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.utils.VideoDownloadManager\$downloadHLS\$notificationCoroutine$1.invokeSuspend(java.lang.Object):java.lang.Object")
    }
}