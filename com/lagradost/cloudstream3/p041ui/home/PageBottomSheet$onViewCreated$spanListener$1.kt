package com.lagradost.cloudstream3.p041ui.home

import java.util.Objects

/* compiled from: PageBottomSheet.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
    m107d2 = ["<anonymous>", "", TtmlNode.TAG_SPAN, "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.home.PageBottomSheet$onViewCreated$spanListener$1 */ /* loaded from: classes3.dex */
internal class `PageBottomSheet$onViewCreated$spanListener$1` constructor(autofitRecyclerView: AutofitRecyclerView) :
    Lambda<Any?>(1), Function1<Integer, Unit> {
    /* synthetic */ val `$recycle`: AutofitRecyclerView

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$recycle` = autofitRecyclerView
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(num: Integer) {
        invoke(num.intValue())
        return Unit.INSTANCE
    }

    override fun invoke(i: Int) {
        `$recycle`.setSpanCount(i)
        val adapter: RecyclerView.Adapter<*> = `$recycle`.getAdapter()
        Objects.requireNonNull(
            adapter,
            "null cannot be cast to non-null type com.lagradost.cloudstream3.ui.search.SearchAdapter"
        )
        (adapter as SearchAdaptor).notifyDataSetChanged()
    }
}