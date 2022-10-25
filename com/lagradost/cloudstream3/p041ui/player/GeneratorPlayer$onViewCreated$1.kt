package com.lagradost.cloudstream3.p041ui.player

import android.util.Log
import com.lagradost.cloudstream3.mvvm.Resource
import kotlin.jvm.internal.Intrinsics

/* compiled from: GeneratorPlayer.kt */
@Metadata(
    m108d1 = ["\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n¢\u0006\u0002\b\u0005"],
    m107d2 = ["<anonymous>", "", "data", "Lcom/lagradost/cloudstream3/mvvm/Resource;", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.player.GeneratorPlayer$onViewCreated$1 */ /* loaded from: classes3.dex */
internal class `GeneratorPlayer$onViewCreated$1` constructor() : Lambda<Any?>(1),
    Function1<Resource<out Object?>?, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(resource: Resource<out Object?>?) {
        invoke2(resource)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(data: Resource<out Object?>?) {
        Intrinsics.checkNotNullParameter(data, "data")
        if (data is Resource.Success<*>) {
            Log.d("BLUE -->", String.valueOf(data))
        }
    }

    companion object {
        val INSTANCE: `GeneratorPlayer$onViewCreated$1` = `GeneratorPlayer$onViewCreated$1`()
    }
}