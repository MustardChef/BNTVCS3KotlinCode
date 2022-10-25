package com.lagradost.cloudstream3.p041ui.result

import com.phimhd.Key
import java.util.Objects
import kotlin.jvm.internal.Intrinsics

/* compiled from: ResultFragmentPhimHD.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
    m107d2 = ["<anonymous>", "", "downloadClickEvent", "Lcom/lagradost/cloudstream3/ui/download/DownloadClickEvent;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD$onViewCreated$adapter$2 */ /* loaded from: classes4.dex */
internal class `ResultFragmentPhimHD$onViewCreated$adapter$2`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(  /* synthetic */
    val `this$0`: ResultFragmentPhimHD
) : Lambda<Any?>(1), Function1<DownloadClickEvent?, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(downloadClickEvent: DownloadClickEvent?) {
        invoke2(downloadClickEvent)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(downloadClickEvent: DownloadClickEvent?) {
        var key: Key
        val str: String?
        Intrinsics.checkNotNullParameter(downloadClickEvent, "downloadClickEvent")
        val companion: AppController? = AppController.Companion.getInstance()
        if ((if (companion != null) companion.getKey() else null) != null) {
            val companion2: AppController? = AppController.Companion.getInstance()
            if (companion2 == null || (companion2.getKey().also({ key = it })) == null) {
                return
            }
            val resultFragmentPhimHD: ResultFragmentPhimHD = `this$0`
            if (!key.isExpired()) {
                str = resultFragmentPhimHD.currentHeaderName
                DownloadButtonSetup.Companion.INSTANCE.handleDownloadClick(
                    resultFragmentPhimHD.getActivity(),
                    str,
                    downloadClickEvent
                )
                return
            }
            val activity: FragmentActivity = resultFragmentPhimHD.getActivity()
            Objects.requireNonNull(
                activity,
                "null cannot be cast to non-null type com.lagradost.cloudstream3.MainActivity"
            )
            (activity as MainActivity).showDialogUpgrade()
            return
        }
        val activity2: FragmentActivity = `this$0`.getActivity()
        Objects.requireNonNull(
            activity2,
            "null cannot be cast to non-null type com.lagradost.cloudstream3.MainActivity"
        )
        (activity2 as MainActivity).showDialogUpgrade()
    }
}