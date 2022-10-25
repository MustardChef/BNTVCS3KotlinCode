package com.lagradost.cloudstream3

import androidx.exifinterface.media.ExifInterface
import kotlin.coroutines.jvm.internal.DebugMetadata
import com.lagradost.cloudstream3.``ParCollectionsKt$apmapIndexed$1$1$1`
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: MainAPI.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/AnimeLoadResponse;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class `MainAPIKt$newAnimeLoadResponse$1` internal constructor() : Lambda<Any?>(1),
    Function1<AnimeLoadResponse?, Unit> {
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(animeLoadResponse: AnimeLoadResponse?) {
        Intrinsics.checkNotNullParameter(animeLoadResponse, "\$this\$null")
    }

    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override fun invoke(animeLoadResponse: AnimeLoadResponse?) {
        invoke2(animeLoadResponse)
        return Unit.INSTANCE
    }

    companion object {
        val INSTANCE = `MainAPIKt$newAnimeLoadResponse$1`()
    }
}