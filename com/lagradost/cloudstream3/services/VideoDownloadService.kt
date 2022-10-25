package com.lagradost.cloudstream3.services

import android.app.IntentService

/* compiled from: VideoDownloadService.kt */
@Metadata(
    m108d1 = ["\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u0007"],
    m107d2 = ["Lcom/lagradost/cloudstream3/services/VideoDownloadService;", "Landroid/app/IntentService;", "()V", "onHandleIntent", "", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class VideoDownloadService : IntentService("VideoDownloadService") {
    @Override // android.app.IntentService
    protected fun onHandleIntent(intent: Intent?) {
        val downloadActionType: DownloadActionType
        if (intent != null) {
            val intExtra: Int = intent.getIntExtra("id", -1)
            val stringExtra: String = intent.getStringExtra("type")
            if (intExtra == -1 || stringExtra == null) {
                return
            }
            val hashCode = stringExtra.hashCode()
            downloadActionType = if (hashCode != -934426579) {
                if (hashCode != 3540994) {
                    if (hashCode != 106440182 || !stringExtra.equals("pause")) {
                        return
                    }
                    VideoDownloadManager.DownloadActionType.Pause
                } else if (!stringExtra.equals("stop")) {
                    return
                } else {
                    VideoDownloadManager.DownloadActionType.Stop
                }
            } else if (!stringExtra.equals("resume")) {
                return
            } else {
                VideoDownloadManager.DownloadActionType.Resume
            }
            VideoDownloadManager.INSTANCE.downloadEvent.invoke(
                Tuples<A, B>(
                    Integer.valueOf(intExtra),
                    downloadActionType
                )
            )
        }
    }
}