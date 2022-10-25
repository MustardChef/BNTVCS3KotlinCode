package com.lagradost.cloudstream3.utils

import android.app.Notification
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: DownloadFileWorkManager.kt */
@Metadata(m106k = 3, m105mv = [1, 6, 0], m103xi = 48) /* loaded from: classes4.dex */
/* synthetic */   class `DownloadFileWorkManager$doWork$4`  /* JADX INFO: Access modifiers changed from: package-private */
    (obj: Object?) : FunctionReferenceImpl(
    2,
    obj,
    DownloadFileWorkManager::class.java,
    "handleNotification",
    "handleNotification(ILandroid/app/Notification;)V",
    0
), Function2<Integer, Notification?, Unit> {
    @Override // kotlin.jvm.functions.Function2
    /* bridge */ /* synthetic */  override fun invoke(num: Integer, notification: Notification?) {
        invoke(num.intValue(), notification)
        return Unit.INSTANCE
    }

    override fun invoke(i: Int, p1: Notification?) {
        Intrinsics.checkNotNullParameter(p1, "p1")
        (this.receiver as DownloadFileWorkManager).handleNotification(i, p1)
    }
}