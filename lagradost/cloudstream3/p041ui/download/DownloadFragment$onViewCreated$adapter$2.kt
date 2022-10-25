package com.lagradost.cloudstream3.p041ui.download

import android.content.Context
import kotlin.jvm.internal.Intrinsics

/* compiled from: DownloadFragment.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
    m107d2 = ["<anonymous>", "", "downloadClickEvent", "Lcom/lagradost/cloudstream3/ui/download/DownloadClickEvent;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.download.DownloadFragment$onViewCreated$adapter$2 */ /* loaded from: classes3.dex */
internal class `DownloadFragment$onViewCreated$adapter$2`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(  /* synthetic */
    val `this$0`: DownloadFragment
) : Lambda<Any?>(1), Function1<DownloadClickEvent, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(downloadClickEvent: DownloadClickEvent) {
        invoke2(downloadClickEvent)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(downloadClickEvent: DownloadClickEvent) {
        var context: Context?
        var downloadViewModel: DownloadViewModel?
        Intrinsics.checkNotNullParameter(downloadClickEvent, "downloadClickEvent")
        if (downloadClickEvent.getData() is DownloadEpisodeCached) {
            DownloadButtonSetup.Companion.INSTANCE.handleDownloadClick(
                `this$0`.getActivity(),
                (downloadClickEvent.getData() as DownloadEpisodeCached?).name,
                downloadClickEvent
            )
            if (downloadClickEvent.getAction() != 1 || (`this$0`.getContext()
                    .also({ context = it })) == null
            ) {
                return
            }
            downloadViewModel = `this$0`.downloadsViewModel
            if (downloadViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("downloadsViewModel")
                downloadViewModel = null
            }
            downloadViewModel!!.updateList(context)
        }
    }
}