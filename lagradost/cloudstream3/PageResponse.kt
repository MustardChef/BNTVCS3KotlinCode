package com.lagradost.cloudstream3

import java.util.List
import kotlin.jvm.internal.Intrinsics

/* compiled from: MainAPI.kt */
@Metadata(
    m108d1 = ["\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u000c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000c"],
    m107d2 = ["Lcom/lagradost/cloudstream3/PageResponse;", "", "list", "", "Lcom/lagradost/cloudstream3/SearchResponse;", "nextUrl", "", "(Ljava/util/List;Ljava/lang/String;)V", "getList", "()Ljava/util/List;", "getNextUrl", "()Ljava/lang/String;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class PageResponse(list: List<SearchResponse>, str: String?) {
    val list: List<SearchResponse>
    val nextUrl: String?

    /* JADX WARN: Multi-variable type inference failed */
    init {
        Intrinsics.checkNotNullParameter(list, "list")
        this.list = list
        nextUrl = str
    }

    /* synthetic */   constructor(
        list: List,
        str: String?,
        i: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(list, if (i and 2 != 0) null else str) {
    }
}