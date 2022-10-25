package com.lagradost.cloudstream3.utils

import android.app.Activity
import kotlin.jvm.functions.Functions

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: InAppUpdater.kt */
@Metadata(
    m108d1 = ["\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"],
    m107d2 = ["<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class `InAppUpdater$Companion$runAutoUpdate$1$1$1$1$downloadStatus$1`(
    activity: Activity?,
    update: InAppUpdater.Companion.Update
) : Lambda<Any?>(0), Functions<Boolean?> {
    /* synthetic */ val `$context`: Activity?
    /* synthetic */ val `$update`: InAppUpdater.Companion.Update

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$context` = activity
        `$update` = update
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    override fun invoke(): Boolean {
        val downloadUpdate: Boolean
        downloadUpdate = InAppUpdater.Companion.downloadUpdate(`$context`, `$update`.updateURL)
        return Boolean.valueOf(downloadUpdate)
    }
}