package com.lagradost.cloudstream3.receivers

import android.content.BroadcastReceiver

/* compiled from: VideoDownloadRestartReceiver.kt */
@Metadata(
    m108d1 = ["\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"],
    m107d2 = ["Lcom/lagradost/cloudstream3/receivers/VideoDownloadRestartReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class VideoDownloadRestartReceiver : BroadcastReceiver() {
    @Override // android.content.BroadcastReceiver
    fun onReceive(context: Context?, intent: Intent?) {
        Log.i("Broadcast Listened", "Service tried to stop")
    }
}