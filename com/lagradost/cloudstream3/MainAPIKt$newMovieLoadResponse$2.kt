package com.lagradost.cloudstream3

import androidx.exifinterface.media.ExifInterface
import kotlin.coroutines.jvm.internal.DebugMetadata
import com.lagradost.cloudstream3.``ParCollectionsKt$apmapIndexed$1$1$1`
import kotlin.jvm.internal.Intrinsics

/* compiled from: MainAPI.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/MovieLoadResponse;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes3.dex */
internal class `MainAPIKt$newMovieLoadResponse$2` : Lambda<Any?>(1),
    Function1<MovieLoadResponse?, Unit> {
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(movieLoadResponse: MovieLoadResponse?) {
        Intrinsics.checkNotNullParameter(movieLoadResponse, "\$this\$null")
    }

    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override fun invoke(movieLoadResponse: MovieLoadResponse?) {
        invoke2(movieLoadResponse)
        return Unit.INSTANCE
    }

    companion object {
        val INSTANCE = `MainAPIKt$newMovieLoadResponse$2`()
    }
}