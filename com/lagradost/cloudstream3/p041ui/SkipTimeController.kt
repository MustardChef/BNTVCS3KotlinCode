package com.lagradost.cloudstream3.p041ui

import android.view.View
import kotlin.jvm.internal.Intrinsics

/* compiled from: ControllerActivity.kt */
@Metadata(
    m108d1 = ["\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/SkipTimeController;", "Lcom/google/android/gms/cast/framework/media/uicontroller/UIController;", ViewHierarchyConstants.VIEW_KEY, "Landroid/widget/ImageView;", "forwards", "", "(Landroid/widget/ImageView;Z)V", "getView", "()Landroid/widget/ImageView;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.SkipTimeController */ /* loaded from: classes.dex */
class SkipTimeController constructor(view: ImageView, z: Boolean) : UIController() {
    private val view: ImageView

    init {
        Intrinsics.checkNotNullParameter(view, "view")
        this.view = view
        view.setImageResource(if (z) R.drawable.go_forward_30 else R.drawable.go_back_30)
        view.setOnClickListener(object : OnClickListener() {
            // from class: com.lagradost.cloudstream3.ui.-$$Lambda$SkipTimeController$Jhvvvc5iy_dJvgzKAvUi0qDqmVA
            @Override // android.view.View.OnClickListener
            fun onClick(view2: View?) {
                `m8614_init_$lambda1`(this@SkipTimeController, r2, z, view2)
            }
        })
    }

    fun getView(): ImageView {
        return view
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: _init_$lambda-1  reason: not valid java name */
        fun `m8614_init_$lambda1`(`this$0`: SkipTimeController, i: Int, z: Boolean, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val remoteMediaClient: RemoteMediaClient? = `this$0`.getRemoteMediaClient()
            if (remoteMediaClient != null) {
                remoteMediaClient.seek(
                    MediaSeekOptions.Builder()
                        .setPosition(remoteMediaClient.getApproximateStreamPosition() + (i * 1000 * (if (z) 1 else -1)))
                        .build()
                )
            }
        }
    }
}