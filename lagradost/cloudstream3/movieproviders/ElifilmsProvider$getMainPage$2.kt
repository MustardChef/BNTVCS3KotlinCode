package com.lagradost.cloudstream3.movieproviders

import org.jsoup.nodes.Element
import java.util.ArrayList
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: ElifilmsProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.movieproviders.ElifilmsProvider\$getMainPage$2",
    m98f = "ElifilmsProvider.kt",
    m97i = [0],
    m96l = [27],
    m95m = "invokeSuspend",
    m94n = ["name"],
    m93s = ["L$0"]
) /* loaded from: classes3.dex */
class `ElifilmsProvider$getMainPage$2`(
    arrayList: ArrayList<HomePageList?>,
    elifilmsProvider: ElifilmsProvider,
    continuation: Continuation<in `ElifilmsProvider$getMainPage$2`?>?
) : SuspendLambda(2, continuation),
    Function2<Tuples<out String?, out String?>, Continuation<in Boolean?>?, Object> {
    /* synthetic */ val `$items`: ArrayList<HomePageList>

    /* synthetic */
    var `L$0`: Object? = null
    var label = 0
    /* synthetic */ val `this$0`: ElifilmsProvider

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$items` = arrayList
        `this$0` = elifilmsProvider
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        val `elifilmsProvider$getMainPage$2` =
            `ElifilmsProvider$getMainPage$2`(`$items`, `this$0`, continuation)
        `elifilmsProvider$getMainPage$2`.`L$0` = obj
        return `elifilmsProvider$getMainPage$2`
    }

    @Override // kotlin.jvm.functions.Function2
    /* bridge */ /* synthetic */  override fun invoke(
        tuples: Tuples<out String?, out String?>,
        continuation: Continuation<in Boolean?>?
    ): Object {
        return invoke2(tuples as Tuples<String?, String?>, continuation)
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(
        tuples: Tuples<String?, String?>,
        continuation: Continuation<in Boolean?>?
    ): Object {
        return (create(
            tuples,
            continuation
        ) as `ElifilmsProvider$getMainPage$2`).invokeSuspend(Unit.INSTANCE)
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val obj2: Object
        val str: String?
        var str2: String
        var str3: String
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            val tuples = `L$0` as Tuples<*, *>?
            val str4 = tuples!!.component1() as String
            val str5 = tuples.component2() as String
            val app: RequestCustom = MainActivityKt.getApp()
            val str6 = str4 ?: ""
            `L$0` = str5
            label = 1
            obj2 = Requests.`get$default`(
                app,
                str6,
                null,
                null,
                null,
                null,
                false,
                0,
                null,
                0L,
                null,
                false,
                this,
                2046,
                null
            )
            if (obj2 === coroutine_suspended) {
                return coroutine_suspended
            }
            str = str5
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            ResultKt.throwOnFailure(obj)
            obj2 = obj
            str = `L$0`
        }
        val select: Elements = (obj2 as NiceResponse).getDocument().select("article.shortstory.cf")
        Intrinsics.checkNotNullExpressionValue(select, "soup.select(\"article.shortstory.cf\")")
        val elements: Elements = select
        val elifilmsProvider = `this$0`
        val arrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(elements, 10))
        for (element in elements) {
            val selectFirst: Element = element.selectFirst(".short_header")
            var str7: String? = null
            val text: String? = selectFirst?.text()
            str2 = if (text == null) {
                ""
            } else {
                Intrinsics.checkNotNullExpressionValue(
                    text,
                    "it.selectFirst(\".short_header\")?.text() ?: \"\""
                )
                text
            }
            val selectFirst2: Element = element.selectFirst("div a")
            val attr: String? = selectFirst2?.attr(ShareConstants.WEB_DIALOG_PARAM_HREF)
            str3 = if (attr == null) {
                ""
            } else {
                Intrinsics.checkNotNullExpressionValue(
                    attr,
                    "it.selectFirst(\"div a\")?.attr(\"href\") ?: \"\""
                )
                attr
            }
            val name: String? = elifilmsProvider.getName()
            val tvType: TvType = TvType.Movie
            val selectFirst3: Element = element.selectFirst("a.ah-imagge img")
            if (selectFirst3 != null) {
                str7 = selectFirst3.attr("data-src")
            }
            arrayList.add(
                TvSeriesSearchResponse(
                    str2,
                    str3,
                    name,
                    tvType,
                    str7,
                    null,
                    null,
                    null,
                    null,
                    null,
                    MediaRouterJellybean.DEVICE_OUT_BLUETOOTH,
                    null
                )
            )
        }
        return boxing.boxBoolean(
            `$items`.add(
                HomePageList(
                    str,
                    arrayList,
                    null,
                    null,
                    null,
                    28,
                    null
                )
            )
        )
    }
}