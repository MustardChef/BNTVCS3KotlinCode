package com.lagradost.cloudstream3.p041ui.download

import android.view.View
import kotlin.jvm.internal.Intrinsics

/* compiled from: DownloadFragment.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
    m107d2 = ["<anonymous>", "", "it", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.download.DownloadFragment$onCreateView$4 */ /* loaded from: classes3.dex */
internal class `DownloadFragment$onCreateView$4`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(  /* synthetic */
    val `this$0`: DownloadFragment
) : Lambda<Any?>(1), Function1<Long, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(l: Long) {
        invoke(l.longValue())
        return Unit.INSTANCE
    }

    override fun invoke(j: Long) {
        val bytesAsText: String?
        val textView: TextView? =
            `this$0`.`_$_findCachedViewById`(C4761R.C4764id.download_used_txt) as TextView?
        if (textView != null) {
            val string: String = `this$0`.getString(R.string.storage_size_format)
            Intrinsics.checkNotNullExpressionValue(
                string,
                "getString(R.string.storage_size_format)"
            )
            bytesAsText = `this$0`.getBytesAsText(j)
            val format: String = String.format(
                string,
                Arrays.copyOf(arrayOf(`this$0`.getString(R.string.used_storage), bytesAsText), 2)
            )
            Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)")
            textView.setText(format)
        }
        val `_$_findCachedViewById`: View? =
            `this$0`.`_$_findCachedViewById`(C4761R.C4764id.download_used)
        if (`_$_findCachedViewById` != null) {
            `this$0`.setLayoutWidth(`_$_findCachedViewById`, j)
        }
    }
}