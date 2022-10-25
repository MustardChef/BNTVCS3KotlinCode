package com.lagradost.cloudstream3.p041ui.player

import android.app.Activity
import com.lagradost.cloudstream3.mvvm.Resource
import kotlin.jvm.internal.Intrinsics

/* compiled from: GeneratorPlayer.kt */
@Metadata(
    m108d1 = ["\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n¢\u0006\u0002\b\u0005"],
    m107d2 = ["<anonymous>", "", "it", "Lcom/lagradost/cloudstream3/mvvm/Resource;", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.player.GeneratorPlayer$onViewCreated$6 */ /* loaded from: classes3.dex */
internal class `GeneratorPlayer$onViewCreated$6`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(  /* synthetic */
    val `this$0`: GeneratorPlayer
) : Lambda<Any?>(1), Function1<Resource<out Boolean?>?, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(resource: Resource<out Boolean?>?) {
        invoke2(resource as Resource<Boolean?>?)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(it: Resource<Boolean?>?) {
        Intrinsics.checkNotNullParameter(it, "it")
        if (it is Loading) {
            `this$0`.startLoading()
        } else if (it is Resource.Success<*>) {
            `this$0`.startPlayer()
        } else if (it is Resource.Failure) {
            CommonActivity.INSTANCE.showToast(
                `this$0`.getActivity() as Activity?,
                (it as Resource.Failure).errorString,
                1 as Integer?
            )
            `this$0`.startPlayer()
        }
    }
}