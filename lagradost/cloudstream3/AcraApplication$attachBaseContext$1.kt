package com.lagradost.cloudstream3

import androidx.exifinterface.media.ExifInterface
import kotlin.coroutines.jvm.internal.DebugMetadata
import com.lagradost.cloudstream3.``ParCollectionsKt$apmapIndexed$1$1$1`
import kotlin.jvm.internal.Intrinsics

/* compiled from: AcraApplication.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "", "Lorg/acra/config/CoreConfigurationBuilder;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes3.dex */
internal class `AcraApplication$attachBaseContext$1` : Lambda<Any?>(1),
    Function1<CoreConfigurationBuilder, Unit> {
    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override fun invoke(coreConfigurationBuilder: CoreConfigurationBuilder) {
        invoke2(coreConfigurationBuilder)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(initAcra: CoreConfigurationBuilder) {
        Intrinsics.checkNotNullParameter(initAcra, "\$this\$initAcra")
        initAcra.setBuildConfigClass(BuildConfig::class.java)
        initAcra.setReportFormat(StringFormat.JSON)
        initAcra.setReportContent(
            arrayOf<ReportField>(
                ReportField.BUILD_CONFIG,
                ReportField.USER_CRASH_DATE,
                ReportField.ANDROID_VERSION,
                ReportField.PHONE_MODEL,
                ReportField.STACK_TRACE
            )
        )
    }

    companion object {
        val INSTANCE = `AcraApplication$attachBaseContext$1`()
    }
}