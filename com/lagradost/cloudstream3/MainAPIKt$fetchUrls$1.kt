package com.lagradost.cloudstream3

import androidx.exifinterface.media.ExifInterface
import kotlin.coroutines.jvm.internal.DebugMetadata
import com.lagradost.cloudstream3.``ParCollectionsKt$apmapIndexed$1$1$1`
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: MainAPI.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
    m107d2 = ["<anonymous>", "", "it", "Lkotlin/text/MatchResult;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class `MainAPIKt$fetchUrls$1` internal constructor() : Lambda<Any?>(1),
    Function1<MatchResult, String> {
    @Override // kotlin.jvm.functions.Function1
    override fun invoke(it: MatchResult): String {
        Intrinsics.checkNotNullParameter(it, "it")
        return StringsKt.removeSurrounding(
            StringsKt.trim(it.value as CharSequence).toString(),
            "\"" as CharSequence
        )
    }

    companion object {
        val INSTANCE = `MainAPIKt$fetchUrls$1`()
    }
}