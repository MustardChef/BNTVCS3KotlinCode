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
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: VideoDownloadManager.kt */
@Metadata(
    m108d1 = ["\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"],
    m107d2 = ["<anonymous>", "", "event", "Lkotlin/Pair;", "", "Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadActionType;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class `VideoDownloadManager$downloadHLS$downloadEventListener$1`(
    num: Integer,
    booleanRef: BooleanRef,
    booleanRef2: BooleanRef,
    booleanRef3: BooleanRef,
    function1: Function1<in CreateNotificationMetadata, Unit>,
    longRef: LongRef,
    j: Long,
    longRef2: LongRef
) : Lambda<Any?>(1), Function1<Tuples<out Integer?, out DownloadActionType?>?, Unit> {
    /* synthetic */ val `$bytesDownloaded`: LongRef
    /* synthetic */ val `$createNotificationCallback`: Function1<CreateNotificationMetadata, Unit>
    /* synthetic */ val `$isDone`: BooleanRef
    /* synthetic */ val `$isFailed`: BooleanRef
    /* synthetic */ val `$isPaused`: BooleanRef
    /* synthetic */ val `$parentId`: Integer
    /* synthetic */ val `$totalTs`: Long
    /* synthetic */ val `$tsProgress`: LongRef

    /* compiled from: VideoDownloadManager.kt */
    @Metadata(m106k = 3, m105mv = [1, 6, 0], m103xi = 48) /* loaded from: classes4.dex */
    /* synthetic */
    object WhenMappings {
        /* synthetic */ val `$EnumSwitchMapping$0`: IntArray

        init {
            val iArr = IntArray(VideoDownloadManager.DownloadActionType.values().size)
            com.lagradost.cloudstream3.utils.iArr.get(DownloadActionType.Stop.ordinal()) = 1
            com.lagradost.cloudstream3.utils.iArr.get(DownloadActionType.Pause.ordinal()) = 2
            com.lagradost.cloudstream3.utils.iArr.get(DownloadActionType.Resume.ordinal()) = 3
            `$EnumSwitchMapping$0` = com.lagradost.cloudstream3.utils.iArr
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$parentId` = num
        `$isFailed` = booleanRef
        `$isPaused` = booleanRef2
        `$isDone` = booleanRef3
        `$createNotificationCallback` = function1
        `$bytesDownloaded` = longRef
        `$totalTs` = j
        `$tsProgress` = longRef2
    }

    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override operator fun invoke(tuples: Tuples<out Integer?, out DownloadActionType>) {
        invoke2(tuples as Tuples<Integer?, out DownloadActionType>)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(event: Tuples<Integer?, out DownloadActionType>) {
        Intrinsics.checkNotNullParameter(event, "event")
        val intValue: Int = event.getFirst().intValue()
        val num: Integer = `$parentId`
        if (num != null && intValue == num.intValue()) {
            val i = WhenMappings.`$EnumSwitchMapping$0`[event.getSecond()
                .ordinal()]
            if (i == 1) {
                `$isFailed`.element = true
            } else if (i == 2) {
                `$isPaused`.element = true
            } else if (i == 3) {
                `$isPaused`.element = false
            }
            VideoDownloadManager.Companion.`m9025downloadHLS$updateNotification22`(
                `$isDone`,
                `$isFailed`,
                `$isPaused`,
                `$parentId`,
                `$createNotificationCallback`,
                `$bytesDownloaded`,
                `$totalTs`,
                `$tsProgress`
            )
        }
    }
}