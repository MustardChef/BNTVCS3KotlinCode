package com.lagradost.cloudstream3.utils

import android.app.Activity
import kotlin.jvm.functions.Functions
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: InAppUpdater.kt */
@Metadata(
    m108d1 = ["\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"],
    m107d2 = ["<anonymous>", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class `InAppUpdater$Companion$runAutoUpdate$1$1$1$1`(
    activity: Activity,
    activity2: Activity?,
    update: InAppUpdater.Companion.Update
) : Lambda<Any?>(0), Functions<Unit> {
    /* synthetic */ val `$context`: Activity?
    /* synthetic */ val `$this_runAutoUpdate`: Activity
    /* synthetic */ val `$update`: InAppUpdater.Companion.Update

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$this_runAutoUpdate` = activity
        `$context` = activity2
        `$update` = update
    }

    @Override // kotlin.jvm.functions.Functions
    /* bridge */ /* synthetic */  override fun invoke() {
        invoke2()
        return Unit.INSTANCE
    }

    @Override // kotlin.jvm.functions.Functions
            /* renamed from: invoke  reason: avoid collision after fix types in other method */    fun invoke2() {
        val bool = ArchComponentExt.normalSafeApiCall(
            `InAppUpdater$Companion$runAutoUpdate$1$1$1$1$downloadStatus$1`(
                `$context`, `$update`
            )
        ) as Boolean
        if (if (bool != null) bool.booleanValue() else false) {
            return
        }
        val activity: Activity = `$this_runAutoUpdate`
        val activity2: Activity? = `$context`
        activity.runOnUiThread(object : Runnable() {
            // from class: com.lagradost.cloudstream3.utils.-$$Lambda$InAppUpdater$Companion$runAutoUpdate$1$1$1$1$K6VLAzZlQ2l2puvWeuYC1Zm9jGo
            @Override // java.lang.Runnable
            fun run() {
                `m9005invoke$lambda0`(activity2)
            }
        })
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: invoke$lambda-0  reason: not valid java name */
        fun `m9005invoke$lambda0`(context: Activity?) {
            Intrinsics.checkNotNullParameter(context, "\$context")
            CommonActivity.INSTANCE.showToast(context, R.string.download_failed, 1)
        }
    }
}