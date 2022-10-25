package com.lagradost.cloudstream3

import android.content.Context
import kotlin.jvm.internal.Intrinsics

/* compiled from: AcraApplication.kt */
@Metadata(
    m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"],
    m107d2 = ["Lcom/lagradost/cloudstream3/CustomReportSender;", "Lorg/acra/sender/ReportSender;", "()V", "deleteAppData", "", "context", "Landroid/content/Context;", "send", "errorContent", "Lorg/acra/data/CrashReportData;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class CustomReportSender : ReportSender {
    @Override // org.acra.sender.ReportSender
    /* synthetic */  override fun requiresForeground(): Boolean {
        return ReportSender.CC.`$default$requiresForeground`(this)
    }

    @Override // org.acra.sender.ReportSender
    /* synthetic */  override fun send(
        context: Context,
        crashReportData: CrashReportData,
        bundle: Bundle
    ) {
        ReportSender.CC.`$default$send`(this, context, crashReportData, bundle)
    }

    @Override // org.acra.sender.ReportSender
    override fun send(context: Context, errorContent: CrashReportData) {
        Intrinsics.checkNotNullParameter(context, "context")
        Intrinsics.checkNotNullParameter(errorContent, "errorContent")
        deleteAppData(context)
        Coroutines.INSTANCE.runOnMainThread(`CustomReportSender$send$1`(context))
    }

    private fun deleteAppData(context: Context) {
        try {
            val packageName: String = context.getApplicationContext().getPackageName()
            Intrinsics.checkNotNullExpressionValue(
                packageName,
                "context.applicationContext.packageName"
            )
            val runtime: Runtime = Runtime.getRuntime()
            runtime.exec("pm clear $packageName")
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}