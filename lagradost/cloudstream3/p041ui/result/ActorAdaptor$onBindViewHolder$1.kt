package com.lagradost.cloudstream3.p041ui.result

import java.util.List

/* compiled from: ActorAdaptor.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
    m107d2 = ["<anonymous>", "", "it", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.result.ActorAdaptor$onBindViewHolder$1 */ /* loaded from: classes4.dex */
internal class `ActorAdaptor$onBindViewHolder$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(/* synthetic */
    val `this$0`: ActorAdaptor, /* synthetic */
    val `$position`: Int
) : Lambda<Any?>(1), Function1<Integer, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(num: Integer) {
        invoke(num.intValue())
        return Unit.INSTANCE
    }

    override fun invoke(i: Int) {
        val list: List?
        val list2: List?
        list = `this$0`.actors
        list2 = `this$0`.actors
        (list.get(`$position`) as ActorMetaData).setInverted(!(list2.get(`$position`) as ActorMetaData).isInverted())
        `this$0`.notifyItemChanged(`$position`)
    }
}