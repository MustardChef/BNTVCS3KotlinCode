package com.phimhd

import java.util.List
import kotlin.jvm.internal.Intrinsics

/* compiled from: ConfigHome.kt */
@Metadata(
    m108d1 = ["\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\u000c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"],
    m107d2 = ["Lcom/phimhd/ListIPTV;", "", "data", "", "Lcom/phimhd/IPTV;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class ListIPTV(@JsonProperty("data") data: List<IPTV>) {
    val data: List<IPTV>
    operator fun component1(): List<IPTV> {
        return data
    }

    fun copy(@JsonProperty("data") data: List<IPTV>): ListIPTV {
        Intrinsics.checkNotNullParameter(data, "data")
        return ListIPTV(data)
    }

    override fun equals(obj: Object): Boolean {
        return if (this === obj) {
            true
        } else obj is ListIPTV && Intrinsics.areEqual(
            data,
            (obj as ListIPTV).data
        )
    }

    override fun hashCode(): Int {
        return data.hashCode()
    }

    override fun toString(): String {
        return "ListIPTV(data=" + data + ')'
    }

    init {
        Intrinsics.checkNotNullParameter(data, "data")
        this.data = data
    }

    companion object {
        /* JADX WARN: Multi-variable type inference failed */
        fun  /* synthetic */`copy$default`(
            listIPTV: ListIPTV,
            list: List,
            i: Int,
            obj: Object?
        ): ListIPTV {
            var list: List = list
            if (i and 1 != 0) {
                list = listIPTV.data
            }
            return listIPTV.copy(list)
        }
    }
}