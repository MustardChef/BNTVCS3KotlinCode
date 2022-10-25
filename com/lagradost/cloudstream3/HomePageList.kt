package com.lagradost.cloudstream3

import java.util.List
import kotlin.jvm.internal.Intrinsics

/* compiled from: MainAPI.kt */
@Metadata(
    m108d1 = ["\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000c\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\rR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"],
    m107d2 = ["Lcom/lagradost/cloudstream3/HomePageList;", "", "name", "", "list", "", "Lcom/lagradost/cloudstream3/SearchResponse;", "urlMore", "nameApi", "cardType", "Lcom/lagradost/cloudstream3/ui/home/ParentItemAdapter\$CardType;", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/ui/home/ParentItemAdapter\$CardType;)V", "getCardType", "()Lcom/lagradost/cloudstream3/ui/home/ParentItemAdapter\$CardType;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getNameApi", "getUrlMore", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class HomePageList(
    name: String,
    list: List<SearchResponse>,
    str: String?,
    str2: String?,
    cardType: CardType
) {
    private val cardType: CardType
    private var list: List<SearchResponse>
    val name: String
    val nameApi: String?
    val urlMore: String?

    init {
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(list, "list")
        Intrinsics.checkNotNullParameter(cardType, "cardType")
        this.name = name
        this.list = list
        urlMore = str
        nameApi = str2
        this.cardType = cardType
    }

    fun getList(): List<SearchResponse> {
        return list
    }

    fun setList(list: List<SearchResponse>) {
        Intrinsics.checkNotNullParameter(list, "<set-?>")
        this.list = list
    }

    /* synthetic */   constructor(
        str: String,
        list: List,
        str2: String?,
        str3: String?,
        cardType: CardType?,
        i: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(
        str,
        list,
        if (i and 4 != 0) null else str2,
        if (i and 8 != 0) null else str3,
        if (i and 16 != 0) HomeParentItemAdapter.CardType.NORMAL_CARD else cardType
    ) {
    }

    fun getCardType(): CardType {
        return cardType
    }
}