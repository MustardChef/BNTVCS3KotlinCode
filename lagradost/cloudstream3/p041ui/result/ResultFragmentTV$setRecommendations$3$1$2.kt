package com.lagradost.cloudstream3.p041ui.result

import java.util.List

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: ResultFragmentTV.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
    m107d2 = ["<anonymous>", "", "it", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentTV$setRecommendations$3$1$2 */ /* loaded from: classes4.dex */
class `ResultFragmentTV$setRecommendations$3$1$2` constructor(/* synthetic */val `this$0`: ResultFragmentTV,
                                                                             list: List<SearchResponse>,
                                                                             list2: List<String>
) : Lambda<Any?>(1), Function1<Integer, Unit> {
    /* synthetic */ val `$apiNames`: List<String>
    /* synthetic */ val `$rec`: List<SearchResponse>

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$rec` = list
        `$apiNames` = list2
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(num: Integer) {
        invoke(num.intValue())
        return Unit.INSTANCE
    }

    override fun invoke(i: Int) {
        `this$0`.setRecommendations(`$rec`, `$apiNames`.get(i))
    }
}