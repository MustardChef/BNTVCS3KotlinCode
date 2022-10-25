package com.lagradost.cloudstream3.p041ui.download

import android.widget.TextView
import kotlin.jvm.internal.Intrinsics

/* compiled from: DownloadFragment.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
    m107d2 = ["<anonymous>", "", "it", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.download.DownloadFragment$onCreateView$1 */ /* loaded from: classes3.dex */
internal class `DownloadFragment$onCreateView$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(  /* synthetic */
    val `this$0`: DownloadFragment
) : Lambda<Any?>(1), Function1<String?, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(str: String?) {
        invoke2(str)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(it: String?) {
        Intrinsics.checkNotNullParameter(it, "it")
        (`this$0`.`_$_findCachedViewById`(C4761R.C4764id.text_no_downloads) as TextView?).setText(it)
    }
}