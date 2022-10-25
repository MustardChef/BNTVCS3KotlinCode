package com.lagradost.cloudstream3

import java.util.List
import kotlin.jvm.internal.Intrinsics

/* compiled from: MainAPI.kt */
@Metadata(
    m108d1 = ["\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001BO\u0012\u000c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\rR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u0013"],
    m107d2 = ["Lcom/lagradost/cloudstream3/HomePageResponse;", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/lagradost/cloudstream3/HomePageList;", "listGenre", "Lcom/lagradost/cloudstream3/Page;", "listCountry", "titleMenuGenres", "", "titleMenuCountry", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getItems", "()Ljava/util/List;", "getListCountry", "getListGenre", "getTitleMenuCountry", "()Ljava/lang/String;", "getTitleMenuGenres", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class HomePageResponse(
    items: List<HomePageList>,
    list: List<Page>?,
    list2: List<Page>?,
    str: String?,
    str2: String?
) {
    val items: List<HomePageList>
    val listCountry: List<Page>?
    val listGenre: List<Page>?
    val titleMenuCountry: String?
    val titleMenuGenres: String?

    init {
        Intrinsics.checkNotNullParameter(items, "items")
        this.items = items
        listGenre = list
        listCountry = list2
        titleMenuGenres = str
        titleMenuCountry = str2
    }

    /* synthetic */   constructor(
        list: List,
        list2: List?,
        list3: List?,
        str: String?,
        str2: String?,
        i: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(
        list,
        if (i and 2 != 0) null else list2,
        if (i and 4 != 0) null else list3,
        if (i and 8 != 0) null else str,
        if (i and 16 != 0) null else str2
    ) {
    }
}