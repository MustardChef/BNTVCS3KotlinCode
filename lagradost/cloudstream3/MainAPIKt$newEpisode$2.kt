package com.lagradost.cloudstream3

import androidx.exifinterface.media.ExifInterface
import kotlin.coroutines.jvm.internal.DebugMetadata
import com.lagradost.cloudstream3.``ParCollectionsKt$apmapIndexed$1$1$1`
import kotlin.jvm.internal.Intrinsics

/* compiled from: MainAPI.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
    m107d2 = ["<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/lagradost/cloudstream3/Episode;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes3.dex */
internal class `MainAPIKt$newEpisode$2` : Lambda<Any?>(1), Function1<Episode?, Unit> {
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(episode: Episode?) {
        Intrinsics.checkNotNullParameter(episode, "\$this\$null")
    }

    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override fun invoke(episode: Episode?) {
        invoke2(episode)
        return Unit.INSTANCE
    }

    companion object {
        val INSTANCE = `MainAPIKt$newEpisode$2`()
    }
}