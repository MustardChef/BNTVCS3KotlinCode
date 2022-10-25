package com.lagradost.cloudstream3

import android.content.Context
import com.bongngotv2.R
import kotlin.jvm.functions.Functions

/* compiled from: AcraApplication.kt */
@Metadata(
    m108d1 = ["\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"],
    m107d2 = ["<anonymous>", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes3.dex */
internal class `CustomReportSender$send$1`(context: Context) : Lambda<Any?>(0), Functions<Unit> {
    /* synthetic */ val `$context`: Context

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$context` = context
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: AcraApplication.kt */
    @Metadata(
        m108d1 = ["\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"],
        m107d2 = ["<anonymous>", "", "invoke"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.CustomReportSender$send$1$1 */ /* loaded from: classes3.dex */
    class C47551 internal constructor(context: Context) : Lambda<Any?>(0), Functions<Unit> {
        /* synthetic */ val `$context`: Context

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        init {
            `$context` = context
        }

        @Override // kotlin.jvm.functions.Functions
        /* bridge */ /* synthetic */  override fun invoke() {
            invoke2()
            return Unit.INSTANCE
        }

        @Override // kotlin.jvm.functions.Functions
                /* renamed from: invoke  reason: avoid collision after fix types in other method */    fun invoke2() {
            Toast.makeText(`$context`, R.string.acra_report_toast, 0).show()
        }
    }

    @Override // kotlin.jvm.functions.Functions
    /* bridge */ /* synthetic */  override fun invoke() {
        invoke2()
        return Unit.INSTANCE
    }

    @Override // kotlin.jvm.functions.Functions
            /* renamed from: invoke  reason: avoid collision after fix types in other method */    fun invoke2() {
        ArchComponentExt.normalSafeApiCall<Unit>(C47551(`$context`))
    }
}