package com.lagradost.cloudstream3.p041ui.download

import android.app.Activity
import kotlin.jvm.internal.Intrinsics

/* compiled from: DownloadButtonSetup.kt */
@Metadata(
    m108d1 = ["\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/download/DownloadButtonSetup;", "", "()V", "handleDownloadClick", "", "activity", "Landroid/app/Activity;", "headerName", "", "click", "Lcom/lagradost/cloudstream3/ui/download/DownloadClickEvent;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.download.DownloadButtonSetup */ /* loaded from: classes3.dex */
class DownloadButtonSetup private constructor() {
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c8 A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:57:0x01c9  */ /* JADX WARN: Removed duplicated region for block: B:68:0x0208 A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:69:0x0209  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun handleDownloadClick(r25: Activity?, r26: String?, r27: DownloadClickEvent?) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.p041ui.download.DownloadButtonSetup.handleDownloadClick(android.app.Activity, java.lang.String, com.lagradost.cloudstream3.ui.download.DownloadClickEvent):void")
    }

    companion object {
        val INSTANCE: DownloadButtonSetup = DownloadButtonSetup()

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: handleDownloadClick$lambda-1$lambda-0  reason: not valid java name */
        fun `m8621handleDownloadClick$lambda1$lambda0`(
            ctx: Activity?,
            i: Int,
            dialogInterface: DialogInterface?,
            i2: Int
        ) {
            Intrinsics.checkNotNullParameter(ctx, "\$ctx")
            if (i2 != -1) {
                return
            }
            VideoDownloadManager.INSTANCE.deleteFileAndUpdateSettings(ctx, i)
        }
    }
}