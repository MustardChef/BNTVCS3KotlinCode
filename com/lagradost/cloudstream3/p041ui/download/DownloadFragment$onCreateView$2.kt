package com.lagradost.cloudstream3.p041ui.download

import java.util.List
import kotlin.jvm.internal.Intrinsics

/* compiled from: DownloadFragment.kt */
@Metadata(
    m108d1 = ["\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"],
    m107d2 = ["<anonymous>", "", "it", "", "Lcom/lagradost/cloudstream3/ui/download/VisualDownloadHeaderCached;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.download.DownloadFragment$onCreateView$2 */ /* loaded from: classes3.dex */
internal class `DownloadFragment$onCreateView$2`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(  /* synthetic */
    val `this$0`: DownloadFragment
) : Lambda<Any?>(1), Function1<List<VisualDownloadHeaderCached>, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(list: List<VisualDownloadHeaderCached>) {
        invoke2(list)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(it: List<VisualDownloadHeaderCached>) {
        Intrinsics.checkNotNullParameter(it, "it")
        `this$0`.setList(it)
        val download_loading: ShimmerFrameLayout? =
            `this$0`.`_$_findCachedViewById`(C4761R.C4764id.download_loading) as ShimmerFrameLayout?
        Intrinsics.checkNotNullExpressionValue(download_loading, "download_loading")
        download_loading.setVisibility(8)
    }
}