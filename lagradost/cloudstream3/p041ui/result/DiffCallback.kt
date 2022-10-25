package com.lagradost.cloudstream3.p041ui.result

import java.util.List
import kotlin.jvm.internal.Intrinsics

/* compiled from: ImageAdapter.kt */
@Metadata(
    m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\u000c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u000c\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/result/DiffCallback;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/recyclerview/widget/DiffUtil\$Callback;", "oldList", "", "newList", "(Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.result.DiffCallback */ /* loaded from: classes4.dex */
class DiffCallback<T> constructor(oldList: List<T>, newList: List<T>) : DiffUtil.Callback() {
    private val newList: List<T>
    private val oldList: List<T>

    /* JADX WARN: Multi-variable type inference failed */
    init {
        Intrinsics.checkNotNullParameter(oldList, "oldList")
        Intrinsics.checkNotNullParameter(newList, "newList")
        this.oldList = oldList
        this.newList = newList
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public override fun areItemsTheSame(i: Int, i2: Int): Boolean {
        return Intrinsics.areEqual(oldList.get(i), newList.get(i2))
    }

    // androidx.recyclerview.widget.DiffUtil.Callback
    @get:Override
    val oldListSize: Int
        // androidx.recyclerview.widget.DiffUtil.Callback
        get() {
            return oldList.size()
        }

    // androidx.recyclerview.widget.DiffUtil.Callback
    @get:Override
    val newListSize: Int
        // androidx.recyclerview.widget.DiffUtil.Callback
        get() {
            return newList.size()
        }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public override fun areContentsTheSame(i: Int, i2: Int): Boolean {
        return Intrinsics.areEqual(oldList.get(i), newList.get(i2))
    }
}