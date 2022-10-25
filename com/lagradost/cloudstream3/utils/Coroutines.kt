package com.lagradost.cloudstream3.utils

import android.os.Handler
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Functions
import kotlin.jvm.internal.Intrinsics

/* compiled from: Coroutines.kt */
@Metadata(
    m108d1 = ["\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006ø\u0001\u0000¢\u0006\u0002\u0010\tJ,\u0010\n\u001a\u00020\u00042\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0014\u0010\u000b\u001a\u00020\b2\u000c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\b0\u000c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"],
    m107d2 = ["Lcom/lagradost/cloudstream3/utils/Coroutines;", "", "()V", "ioSafe", "Lkotlinx/coroutines/Job;", "work", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", MediaTrack.ROLE_MAIN, "runOnMainThread", "Lkotlin/Function0;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class Coroutines private constructor() {
    fun main(work: Function1<Continuation<in Unit>?, Object?>): Job {
        Intrinsics.checkNotNullParameter(work, "work")
        return BuildersKt.`launch$default`(
            CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()),
            null,
            null,
            `Coroutines$main$1`(work, null),
            3,
            null
        )
    }

    fun ioSafe(work: Function1<Continuation<in Unit>?, Object?>): Job {
        Intrinsics.checkNotNullParameter(work, "work")
        return BuildersKt.`launch$default`(
            CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()),
            null,
            null,
            `Coroutines$ioSafe$1`(work, null),
            3,
            null
        )
    }

    fun runOnMainThread(work: Functions<Unit>?) {
        Intrinsics.checkNotNullParameter(work, "work")
        Handler(Looper.getMainLooper()).post(object : Runnable() {
            // from class: com.lagradost.cloudstream3.utils.-$$Lambda$Coroutines$2oNhc4k7ekGvxEU9DP0Z9ggFSEI
            @Override // java.lang.Runnable
            fun run() {
                `m8997runOnMainThread$lambda0`(this@Functions)
            }
        })
    }

    companion object {
        @kotlin.jvm.JvmField
        val INSTANCE = Coroutines()

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: runOnMainThread$lambda-0  reason: not valid java name */
        fun `m8997runOnMainThread$lambda0`(work: Functions<*>) {
            Intrinsics.checkNotNullParameter(work, "\$work")
            work.invoke()
        }
    }
}