package com.lagradost.cloudstream3.p041ui

import android.view.View
import kotlin.jvm.internal.Intrinsics

/* compiled from: ControllerActivity.kt */
@Metadata(
    m108d1 = ["\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/SkipNextEpisodeController;", "Lcom/google/android/gms/cast/framework/media/uicontroller/UIController;", ViewHierarchyConstants.VIEW_KEY, "Landroid/widget/ImageView;", "(Landroid/widget/ImageView;)V", "getView", "()Landroid/widget/ImageView;", "onMediaStatusUpdated", "", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.SkipNextEpisodeController */ /* loaded from: classes.dex */
class SkipNextEpisodeController constructor(view: ImageView) : UIController() {
    private val view: ImageView

    init {
        Intrinsics.checkNotNullParameter(view, "view")
        this.view = view
        view.setImageResource(R.drawable.ic_baseline_skip_next_24)
        view.setOnClickListener(object : OnClickListener() {
            // from class: com.lagradost.cloudstream3.ui.-$$Lambda$SkipNextEpisodeController$Kg-BhkMecoxhmxIgcgVvKqSHe4c
            @Override // android.view.View.OnClickListener
            fun onClick(view2: View?) {
                `m8612_init_$lambda1`(this@SkipNextEpisodeController, view2)
            }
        })
    }

    fun getView(): ImageView {
        return view
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
        r0 = com.lagradost.cloudstream3.p041ui.ControllerActivityKt.getItemIndex(r0);
     */
    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */ public override fun onMediaStatusUpdated() {
        /*
            r3 = this;
            super.onMediaStatusUpdated()
            android.widget.ImageView r0 = r3.view
            r1 = 8
            r0.setVisibility(r1)
            com.google.android.gms.cast.framework.media.RemoteMediaClient r0 = r3.getRemoteMediaClient()
            if (r0 == 0) goto L44
            java.lang.Integer r0 = com.lagradost.cloudstream3.p041ui.ControllerActivityKt.access$getItemIndex(r0)
            if (r0 == 0) goto L44
            int r0 = r0.intValue()
            com.google.android.gms.cast.framework.media.RemoteMediaClient r1 = r3.getRemoteMediaClient()
            if (r1 == 0) goto L44
            com.google.android.gms.cast.framework.media.MediaQueue r1 = r1.getMediaQueue()
            if (r1 == 0) goto L44
            int r1 = r1.getItemCount()
            int r1 = r1 - r0
            r0 = 1
            if (r1 <= r0) goto L44
            com.google.android.gms.cast.framework.media.RemoteMediaClient r1 = r3.getRemoteMediaClient()
            r2 = 0
            if (r1 == 0) goto L3c
            boolean r1 = r1.isLoadingNextItem()
            if (r1 != 0) goto L3c
            goto L3d
        L3c:
            r0 = 0
        L3d:
            if (r0 == 0) goto L44
            android.widget.ImageView r0 = r3.view
            r0.setVisibility(r2)
        L44:
            return
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.p041ui.SkipNextEpisodeController.onMediaStatusUpdated():void")
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: _init_$lambda-1  reason: not valid java name */
        fun `m8612_init_$lambda1`(`this$0`: SkipNextEpisodeController, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val remoteMediaClient: RemoteMediaClient? = `this$0`.getRemoteMediaClient()
            if (remoteMediaClient != null) {
                remoteMediaClient.queueNext(JSONObject())
                `this$0`.view.setVisibility(8)
            }
        }
    }
}