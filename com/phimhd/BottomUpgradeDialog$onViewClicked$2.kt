package com.phimhd

import android.content.Intent

/* compiled from: BottomUpgradeDialog.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
    m107d2 = ["<anonymous>", "", "it", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes4.dex */
internal class `BottomUpgradeDialog$onViewClicked$2`(
    objectRef: ObjectRef<String?>,
    bottomUpgradeDialog: BottomUpgradeDialog
) : Lambda<Any?>(1), Function1<Integer, Unit> {
    /* synthetic */ val `$url`: ObjectRef<String>
    /* synthetic */ val `this$0`: BottomUpgradeDialog

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$url` = objectRef
        `this$0` = bottomUpgradeDialog
    }

    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override fun invoke(num: Integer) {
        invoke(num.intValue())
        return Unit.INSTANCE
    }

    /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Type inference failed for: r1v0 */ /* JADX WARN: Type inference failed for: r1v1 */ /* JADX WARN: Type inference failed for: r1v10 */ /* JADX WARN: Type inference failed for: r1v11 */ /* JADX WARN: Type inference failed for: r1v12 */ /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.String] */ /* JADX WARN: Type inference failed for: r1v4, types: [T] */ /* JADX WARN: Type inference failed for: r1v5 */ /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.String] */ /* JADX WARN: Type inference failed for: r1v8 */ /* JADX WARN: Type inference failed for: r1v9 */
    override fun invoke(i: Int) {
        var config: Config
        var config2: Config
        val objectRef: ObjectRef<String> = `$url`
        r1 = 0
        r1 = 0
        r1 = 0
        r1 = 0
        if (i == 0) {
            val companion: AppController = AppController.Companion.Companion.getInstance()
            if (companion != null && companion.config.also { config2 = it } != null) {
                r1 = config2.urlPaymentMomo
            }
            if (r1 === 0) {
                r1 = Constants.URL_RECEIVE
            }
        } else {
            val companion2: AppController = AppController.Companion.Companion.getInstance()
            if (companion2 != null && companion2.config.also { config = it } != null) {
                r1 = config.urlPaymentPaypal
            }
            if (r1 === 0) {
                r1 = Constants.URL_RECEIVE_PAYPAL
            }
        }
        objectRef.element = r1
        val intent = Intent("android.intent.action.VIEW")
        intent.setData(Uri.parse(`$url`.element))
        `this$0`.startActivity(intent)
    }
}