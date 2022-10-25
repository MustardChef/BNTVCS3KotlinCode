package com.lagradost.cloudstream3.movieproviders

import okio.Utf8
import org.jsoup.nodes.Element
import java.util.ArrayList
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: EstrenosDoramasProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.movieproviders.EstrenosDoramasProvider\$getMainPage$2",
    m98f = "EstrenosDoramasProvider.kt",
    m97i = [0],
    m96l = [40],
    m95m = "invokeSuspend",
    m94n = ["name"],
    m93s = ["L$0"]
)
/* loaded from: classes3.dex */
internal class `EstrenosDoramasProvider$getMainPage$2`(
    arrayList: ArrayList<HomePageList?>,
    estrenosDoramasProvider: EstrenosDoramasProvider,
    continuation: Continuation<in `EstrenosDoramasProvider$getMainPage$2`?>?
) : SuspendLambda(2, continuation),
    Function2<Tuples<out String?, out String?>, Continuation<in Boolean?>?, Object> {
    /* synthetic */ val `$items`: ArrayList<HomePageList>

    /* synthetic */
    var `L$0`: Object? = null
    var label = 0
    /* synthetic */ val `this$0`: EstrenosDoramasProvider

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$items` = arrayList
        `this$0` = estrenosDoramasProvider
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        val `estrenosDoramasProvider$getMainPage$2` = `EstrenosDoramasProvider$getMainPage$2`(
            `$items`, `this$0`, continuation
        )
        `estrenosDoramasProvider$getMainPage$2`.`L$0` = obj
        return `estrenosDoramasProvider$getMainPage$2`
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
        ) as `EstrenosDoramasProvider$getMainPage$2`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val obj2: Object
        val str: String?
        var cleanTitle: String
        var of: EnumSet
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            val tuples = `L$0` as Tuples<*, *>?
            val str2 = tuples!!.component1() as String
            val str3 = tuples.component2() as String
            `L$0` = str3
            label = 1
            obj2 = Requests.`get$default`(
                MainActivityKt.getApp(),
                str2,
                null,
                null,
                null,
                null,
                false,
                0,
                null,
                120L,
                null,
                false,
                this,
                1790,
                null
            )
            if (obj2 === coroutine_suspended) {
                return coroutine_suspended
            }
            str = str3
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            ResultKt.throwOnFailure(obj)
            obj2 = obj
            str = `L$0`
        }
        val select: Elements = (obj2 as NiceResponse).getDocument().select("div.clearfix")
        Intrinsics.checkNotNullExpressionValue(
            select,
            "app.get(url, timeout = 1…nt.select(\"div.clearfix\")"
        )
        val elements: Elements = select
        val estrenosDoramasProvider = `this$0`
        val arrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(elements, 10))
        for (element in elements) {
            val selectFirst: Element = element.selectFirst("h3 a")
            val text: String? = selectFirst?.text()
            Intrinsics.checkNotNull(text)
            cleanTitle = estrenosDoramasProvider.cleanTitle(text)
            val selectFirst2: Element = element.selectFirst("img.cate_thumb")
            val attr: String? = selectFirst2?.attr("src")
            val selectFirst3: Element = element.selectFirst("a")
            val attr2: String? = selectFirst3?.attr(ShareConstants.WEB_DIALOG_PARAM_HREF)
            Intrinsics.checkNotNull(attr2)
            val name: String? = estrenosDoramasProvider.getName()
            val tvType: TvType = TvType.AsianDrama
            val str4 = cleanTitle
            of = if (StringsKt.`contains$default`(
                    str4 as CharSequence,
                    "Latino" as CharSequence,
                    false,
                    2,
                    null as Object?
                ) || StringsKt.`contains$default`(
                    str4 as CharSequence,
                    "Castellano" as CharSequence,
                    false,
                    2,
                    null as Object?
                )
            ) {
                EnumSet.of(DubStatus.Dubbed)
            } else {
                EnumSet.of(DubStatus.Subbed)
            }
            arrayList.add(
                AnimeSearchResponse(
                    cleanTitle,
                    attr2,
                    name,
                    tvType,
                    attr,
                    null,
                    of,
                    null,
                    null,
                    null,
                    null,
                    null,
                    Utf8.MASK_2BYTES,
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