package com.lagradost.cloudstream3.p041ui.result

import java.util.List

/* compiled from: ResultFragmentPhimHD.kt */
@Metadata(
    m108d1 = ["\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"],
    m107d2 = ["<anonymous>", "", SessionDescription.ATTR_RANGE, "", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD$onViewCreated$13 */ /* loaded from: classes4.dex */
internal class `ResultFragmentPhimHD$onViewCreated$13`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(  /* synthetic */
    val `this$0`: ResultFragmentPhimHD
) : Lambda<Any?>(1), Function1<List<String?>?, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(list: List<String?>?) {
        invoke2(list)
        return Unit.INSTANCE
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
        if ((r3.getVisibility() == 0) == true) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */ /* renamed from: invoke  reason: avoid collision after fix types in other method */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun invoke2(r6: List<String?>?) {
        /*
            r5 = this;
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD r0 = r5.this$0
            com.lagradost.cloudstream3.p041ui.result.ResultFragmentPhimHD.access$setEpisodeRanges$p(r0, r6)
            com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD r0 = r5.this$0
            int r1 = com.lagradost.cloudstream3.C4761R.C4764id.result_episode_select
            android.view.View r0 = r0._$_findCachedViewById(r1)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            if (r0 != 0) goto L18
            goto L99
        L18:
            int r6 = r6.size()
            r1 = 0
            r2 = 1
            if (r6 > r2) goto L24
            r1 = 8
            goto L96
        L24:
            com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD r6 = r5.this$0
            int r3 = com.lagradost.cloudstream3.C4761R.C4764id.result_season_button
            android.view.View r3 = r6._$_findCachedViewById(r3)
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            if (r3 == 0) goto L44
            java.lang.String r4 = "result_season_button"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            android.view.View r3 = (android.view.View) r3
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L3f
            r3 = 1
            goto L40
        L3f:
            r3 = 0
        L40:
            if (r3 != r2) goto L44
            r3 = 1
            goto L45
        L44:
            r3 = 0
        L45:
            if (r3 != 0) goto L96
            int r3 = com.lagradost.cloudstream3.C4761R.C4764id.result_series_parent
            android.view.View r3 = r6._$_findCachedViewById(r3)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            if (r3 == 0) goto L64
            java.lang.String r4 = "result_series_parent"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            android.view.View r3 = (android.view.View) r3
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L60
            r3 = 1
            goto L61
        L60:
            r3 = 0
        L61:
            if (r3 != r2) goto L64
            goto L65
        L64:
            r2 = 0
        L65:
            if (r2 == 0) goto L7f
            int r2 = com.lagradost.cloudstream3.C4761R.C4764id.result_resume_series_button
            android.view.View r2 = r6._$_findCachedViewById(r2)
            com.google.android.material.button.MaterialButton r2 = (com.google.android.material.button.MaterialButton) r2
            android.view.View r2 = (android.view.View) r2
            int r3 = com.lagradost.cloudstream3.C4761R.C4764id.result_episode_select
            android.view.View r6 = r6._$_findCachedViewById(r3)
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            android.view.View r6 = (android.view.View) r6
            com.lagradost.cloudstream3.p041ui.result.ResultFragmentPhimHD.access$onViewCreated$setFocusUpAndDown(r2, r6)
            goto L96
        L7f:
            int r2 = com.lagradost.cloudstream3.C4761R.C4764id.result_bookmark_button
            android.view.View r2 = r6._$_findCachedViewById(r2)
            com.google.android.material.button.MaterialButton r2 = (com.google.android.material.button.MaterialButton) r2
            android.view.View r2 = (android.view.View) r2
            int r3 = com.lagradost.cloudstream3.C4761R.C4764id.result_episode_select
            android.view.View r6 = r6._$_findCachedViewById(r3)
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            android.view.View r6 = (android.view.View) r6
            com.lagradost.cloudstream3.p041ui.result.ResultFragmentPhimHD.access$onViewCreated$setFocusUpAndDown(r2, r6)
        L96:
            r0.setVisibility(r1)
        L99:
            return
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.p041ui.result.ResultFragmentPhimHD\$onViewCreated$13.invoke2(java.util.List):void")
    }
}