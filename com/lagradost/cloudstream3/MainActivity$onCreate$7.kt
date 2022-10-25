package com.lagradost.cloudstream3

import androidx.exifinterface.media.ExifInterface
import kotlin.coroutines.jvm.internal.DebugMetadata
import com.lagradost.cloudstream3.``ParCollectionsKt$apmapIndexed$1$1$1`
import com.lagradost.cloudstream3.utils.InAppUpdater
import kotlin.jvm.functions.Functions

/* compiled from: MainActivity.kt */
@Metadata(
    m108d1 = ["\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"],
    m107d2 = ["<anonymous>", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes3.dex */
internal class `MainActivity$onCreate$7`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */(  /* synthetic */
    val `this$0`: MainActivity
) : Lambda<Any?>(0), Functions<Unit> {
    @Override // kotlin.jvm.functions.Functions
    /* bridge */ /* synthetic */  override fun invoke() {
        invoke2()
        return Unit.INSTANCE
    }

    @Override // kotlin.jvm.functions.Functions
            /* renamed from: invoke  reason: avoid collision after fix types in other method */    fun invoke2() {
        InAppUpdater.Companion.`runAutoUpdate$default`(
            InAppUpdater.Companion,
            `this$0`,
            false,
            1,
            null
        )
    }
}