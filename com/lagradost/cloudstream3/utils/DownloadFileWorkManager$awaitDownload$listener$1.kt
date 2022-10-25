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

/* compiled from: DownloadFileWorkManager.kt */
@Metadata(
    m108d1 = ["\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"],
    m107d2 = ["<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lcom/lagradost/cloudstream3/utils/VideoDownloadManager\$DownloadType;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes4.dex */
internal class `DownloadFileWorkManager$awaitDownload$listener$1`(/* synthetic */
    val `$id`: Int, booleanRef: BooleanRef
) : Lambda<Any?>(1), Function1<Tuples<out Integer?, out DownloadType?>?, Unit> {
    /* synthetic */ val `$isDone`: BooleanRef

    /* compiled from: DownloadFileWorkManager.kt */
    @Metadata(m106k = 3, m105mv = [1, 6, 0], m103xi = 48) /* loaded from: classes4.dex */
    /* synthetic */
    object WhenMappings {
        /* synthetic */ val `$EnumSwitchMapping$0`: IntArray

        init {
            val iArr = IntArray(VideoDownloadManager.DownloadType.values().size)
            com.lagradost.cloudstream3.utils.iArr.get(DownloadType.IsDone.ordinal()) = 1
            com.lagradost.cloudstream3.utils.iArr.get(DownloadType.IsFailed.ordinal()) = 2
            com.lagradost.cloudstream3.utils.iArr.get(DownloadType.IsStopped.ordinal()) = 3
            `$EnumSwitchMapping$0` = com.lagradost.cloudstream3.utils.iArr
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$isDone` = booleanRef
    }

    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override operator fun invoke(tuples: Tuples<out Integer?, out DownloadType>) {
        invoke2(tuples as Tuples<Integer?, out DownloadType>)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(tuples: Tuples<Integer?, out DownloadType>) {
        Intrinsics.checkNotNullParameter(tuples, "<name for destructuring parameter 0>")
        val intValue: Int = tuples.component1().intValue()
        val component2: DownloadType = tuples.component2()
        if (`$id` == intValue) {
            val i = WhenMappings.`$EnumSwitchMapping$0`[component2.ordinal()]
            if (i == 1 || i == 2 || i == 3) {
                `$isDone`.element = true
            }
        }
    }
}