package com.lagradost.cloudstream3.p041ui.result

import android.view.View
import kotlin.jvm.internal.Intrinsics

/* compiled from: ResultFragmentTV.kt */
@Metadata(
    m108d1 = ["\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001e\u0010\u0002\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004 \u0005*\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"],
    m107d2 = ["<anonymous>", "", "seasonList", "", "", "kotlin.jvm.PlatformType", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentTV$onViewCreated$11 */ /* loaded from: classes4.dex */
internal class `ResultFragmentTV$onViewCreated$11`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(  /* synthetic */
    val `this$0`: ResultFragmentTV
) : Lambda<Any?>(1), Function1<List<Integer?>?, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(list: List<Integer?>?) {
        invoke2(list as List<Integer?>?)
        return Unit.INSTANCE
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        if ((r4.getVisibility() == 0) == true) goto L13;
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun invoke2(r7: List<Int?>?) {
        /*
            r6 = this;
            com.lagradost.cloudstream3.ui.result.ResultFragmentTV r0 = r6.this$0
            int r1 = com.lagradost.cloudstream3.C4761R.C4764id.result_season_button
            android.view.View r0 = r0._$_findCachedViewById(r1)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            if (r0 != 0) goto Ld
            goto L6c
        Ld:
            int r1 = r7.size()
            r2 = 0
            r3 = 1
            if (r1 > r3) goto L18
            r2 = 8
            goto L69
        L18:
            com.lagradost.cloudstream3.ui.result.ResultFragmentTV r1 = r6.this$0
            int r4 = com.lagradost.cloudstream3.C4761R.C4764id.result_series_parent
            android.view.View r4 = r1._$_findCachedViewById(r4)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            if (r4 == 0) goto L37
            java.lang.String r5 = "result_series_parent"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            android.view.View r4 = (android.view.View) r4
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L33
            r4 = 1
            goto L34
        L33:
            r4 = 0
        L34:
            if (r4 != r3) goto L37
            goto L38
        L37:
            r3 = 0
        L38:
            if (r3 == 0) goto L52
            int r3 = com.lagradost.cloudstream3.C4761R.C4764id.result_resume_series_button
            android.view.View r3 = r1._$_findCachedViewById(r3)
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            android.view.View r3 = (android.view.View) r3
            int r4 = com.lagradost.cloudstream3.C4761R.C4764id.result_season_button
            android.view.View r1 = r1._$_findCachedViewById(r4)
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            android.view.View r1 = (android.view.View) r1
            com.lagradost.cloudstream3.p041ui.result.ResultFragmentTV.access$onViewCreated$setFocusUpAndDown(r3, r1)
            goto L69
        L52:
            int r3 = com.lagradost.cloudstream3.C4761R.C4764id.result_bookmark_button
            android.view.View r3 = r1._$_findCachedViewById(r3)
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            android.view.View r3 = (android.view.View) r3
            int r4 = com.lagradost.cloudstream3.C4761R.C4764id.result_season_button
            android.view.View r1 = r1._$_findCachedViewById(r4)
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            android.view.View r1 = (android.view.View) r1
            com.lagradost.cloudstream3.p041ui.result.ResultFragmentTV.access$onViewCreated$setFocusUpAndDown(r3, r1)
        L69:
            r0.setVisibility(r2)
        L6c:
            com.lagradost.cloudstream3.ui.result.ResultFragmentTV r0 = r6.this$0
            int r1 = com.lagradost.cloudstream3.C4761R.C4764id.result_season_button
            android.view.View r0 = r0._$_findCachedViewById(r1)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            if (r0 == 0) goto L82
            com.lagradost.cloudstream3.ui.result.ResultFragmentTV r1 = r6.this$0
            com.lagradost.cloudstream3.ui.result.-$$Lambda$ResultFragmentTV$onViewCreated$11$Ky-iNL5TYqwsMH7gnMMuakWK1EA r2 = new com.lagradost.cloudstream3.ui.result.-$$Lambda$ResultFragmentTV$onViewCreated$11$Ky-iNL5TYqwsMH7gnMMuakWK1EA
            r2.<init>()
            r0.setOnClickListener(r2)
        L82:
            return
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.p041ui.result.ResultFragmentTV\$onViewCreated$11.invoke2(java.util.List):void")
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: invoke$lambda-2  reason: not valid java name */
        fun `m8838invoke$lambda2`(`this$0`: ResultFragmentTV, seasonList: List?, view: View?) {
            var fromIndexToSeasonText: String?
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val materialButton: MaterialButton? =
                `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_season_button) as MaterialButton?
            if (materialButton != null) {
                val uIHelper: UIHelper = UIHelper.INSTANCE
                val materialButton2: MaterialButton = materialButton
                Intrinsics.checkNotNullExpressionValue(seasonList, "seasonList")
                val list: List<Integer> = seasonList
                val arrayList: ArrayList =
                    ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10))
                for (num: Integer? in list) {
                    val valueOf: Integer = Integer.valueOf(if (num != null) num.intValue() else -2)
                    fromIndexToSeasonText = `this$0`.fromIndexToSeasonText(num)
                    arrayList.add(Tuples<Any?, Any?>(valueOf, fromIndexToSeasonText))
                }
                uIHelper.popupMenuNoIconsAndNoStringRes(
                    materialButton2,
                    arrayList,
                    `ResultFragmentTV$onViewCreated$11$2$2`(`this$0`)
                )
            }
        }
    }
}