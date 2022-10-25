package com.lagradost.cloudstream3.p041ui.result

import android.content.ClipData
import kotlin.jvm.internal.Intrinsics

/* compiled from: ResultFragmentPhimHD.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
    m107d2 = ["<anonymous>", "", "link", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD$onViewCreated$handleAction$1$4$1 */ /* loaded from: classes4.dex */
internal class `ResultFragmentPhimHD$onViewCreated$handleAction$1$4$1` constructor(fragmentActivity: FragmentActivity) :
    Lambda<Any?>(1), Function1<ExtractorLink, Unit> {
    /* synthetic */ val `$act`: FragmentActivity

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$act` = fragmentActivity
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(extractorLink: ExtractorLink) {
        invoke2(extractorLink)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(link: ExtractorLink) {
        Intrinsics.checkNotNullParameter(link, "link")
        val clipboardManager: ClipboardManager? =
            `$act`.getSystemService("clipboard") as ClipboardManager?
        if (clipboardManager == null) {
            return
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText(link.name, link.url))
        CommonActivity.INSTANCE.showToast(`$act`, R.string.copy_link_toast, 0)
    }
}