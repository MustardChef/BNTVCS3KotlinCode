package com.lagradost.cloudstream3.p041ui.result

import android.widget.TextView
import kotlin.jvm.internal.Intrinsics

/* compiled from: ResultFragmentTV.kt */
@Metadata(
    m108d1 = ["\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"],
    m107d2 = ["<anonymous>", "", "list", "", "Lcom/lagradost/cloudstream3/ui/result/CurrentSynced;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentTV$onViewCreated$15 */ /* loaded from: classes4.dex */
internal class `ResultFragmentTV$onViewCreated$15`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(  /* synthetic */
    val `this$0`: ResultFragmentTV
) : Lambda<Any?>(1), Function1<List<CurrentSynced>, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(list: List<CurrentSynced>) {
        invoke2(list)
        return Unit.INSTANCE
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: ResultFragmentTV.kt */
    @Metadata(
        m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
        m107d2 = ["<anonymous>", "", "it", "Lcom/lagradost/cloudstream3/ui/result/CurrentSynced;", "invoke"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentTV$onViewCreated$15$2 */ /* loaded from: classes4.dex */
    class C49442 internal constructor() : Lambda<Any?>(1), Function1<CurrentSynced, CharSequence?> {
        @Override // kotlin.jvm.functions.Function1
        public override fun invoke(it: CurrentSynced): CharSequence? {
            Intrinsics.checkNotNullParameter(it, "it")
            return it.getName()
        }

        companion object {
            val INSTANCE: C49442 = C49442()
        }
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(list: List<CurrentSynced>) {
        Intrinsics.checkNotNullParameter(list, "list")
        val textView: TextView? =
            `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_sync_names) as TextView?
        if (textView != null) {
            val arrayList: ArrayList = ArrayList()
            for (obj: Object? in list) {
                val currentSynced: CurrentSynced = obj
                if (currentSynced.isSynced() && currentSynced.getHasAccount()) {
                    arrayList.add(obj)
                }
            }
            textView.setText(
                CollectionsKt.`joinToString$default`(
                    arrayList,
                    null,
                    null,
                    null,
                    0,
                    null,
                    C49442.INSTANCE,
                    31,
                    null
                )
            )
        }
        val arrayList2: ArrayList = ArrayList()
        for (obj2: Object in list) {
            val currentSynced2: CurrentSynced = obj2
            if (currentSynced2.isSynced() && currentSynced2.getHasAccount()) {
                arrayList2.add(obj2)
            }
        }
        val arrayList3: ArrayList<CurrentSynced> = arrayList2
        val recyclerView: RecyclerView? =
            `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_mini_sync) as RecyclerView?
        if (recyclerView != null) {
            recyclerView.setVisibility(if (true xor arrayList3.isEmpty()) 0 else 8)
        }
        val recyclerView2: RecyclerView? =
            `this$0`.`_$_findCachedViewById`(C4761R.C4764id.result_mini_sync) as RecyclerView?
        val adapter: RecyclerView.Adapter<*>? =
            if (recyclerView2 != null) recyclerView2.getAdapter() else null
        val imageAdapter: ImageAdapter? = if (adapter is ImageAdapter) adapter else null
        if (imageAdapter != null) {
            val arrayList4: ArrayList = ArrayList()
            for (currentSynced3: CurrentSynced in arrayList3) {
                val icon: Integer? = currentSynced3.getIcon()
                if (icon != null) {
                    arrayList4.add(icon)
                }
            }
            imageAdapter.updateList(arrayList4)
        }
    }
}