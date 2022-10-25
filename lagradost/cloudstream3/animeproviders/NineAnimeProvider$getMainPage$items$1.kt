package com.lagradost.cloudstream3.animeproviders

import com.fasterxml.jackson.core.type.TypeReference
import org.jsoup.nodes.Element
import java.util.ArrayList
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: NineAnimeProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "Lcom/lagradost/cloudstream3/HomePageList;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.animeproviders.NineAnimeProvider\$getMainPage\$items$1",
    m98f = "NineAnimeProvider.kt",
    m97i = [0],
    m96l = [150],
    m95m = "invokeSuspend",
    m94n = ["name"],
    m93s = ["L$0"]
)
/* loaded from: classes3.dex */
internal class `NineAnimeProvider$getMainPage$items$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */(/* synthetic */
    val `this$0`: NineAnimeProvider,
    continuation: Continuation<in `NineAnimeProvider$getMainPage$items$1`?>?
) : SuspendLambda(2, continuation),
    Function2<Tuples<out String?, out String?>, Continuation<in HomePageList?>?, Object> {
    /* synthetic */
    var `L$0`: Object? = null
    var label = 0

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        val `nineAnimeProvider$getMainPage$items$1` = `NineAnimeProvider$getMainPage$items$1`(
            `this$0`, continuation
        )
        `nineAnimeProvider$getMainPage$items$1`.`L$0` = obj
        return `nineAnimeProvider$getMainPage$items$1`
    }

    @Override // kotlin.jvm.functions.Function2
    /* bridge */ /* synthetic */  override fun invoke(
        tuples: Tuples<out String?, out String?>,
        continuation: Continuation<in HomePageList?>?
    ): Object {
        return invoke2(tuples as Tuples<String?, String?>, continuation)
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(
        tuples: Tuples<String?, String?>,
        continuation: Continuation<in HomePageList?>?
    ): Object {
        return (create(
            tuples,
            continuation
        ) as `NineAnimeProvider$getMainPage$items$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val obj2: Object
        val str: String?
        var num: Integer?
        var num2: Integer?
        var selectFirst: Element
        var text: String?
        var selectFirst2: Element
        var text2: String?
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
            str = str3
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            ResultKt.throwOnFailure(obj)
            obj2 = obj
            str = `L$0`
        }
        val select: Elements = Jsoup.parse(
            (Requests.Companion.getMapper().readValue<NineAnimeProvider.Response>(
                (obj2 as NiceResponse).getText(),
                object :
                    TypeReference<NineAnimeProvider.Response?>() { // from class: com.lagradost.cloudstream3.animeproviders.NineAnimeProvider$getMainPage$items$1$invokeSuspend$$inlined$parsed$1
                }) as NineAnimeProvider.Response).html
        ).select("div.item")
        Intrinsics.checkNotNullExpressionValue(
            select,
            "parse(\n                a…     ).select(\"div.item\")"
        )
        val nineAnimeProvider = `this$0`
        val arrayList = ArrayList()
        for (element in select) {
            val selectFirst3: Element = element.selectFirst(".info > .name")
            var animeSearchResponse: AnimeSearchResponse? = null
            if (selectFirst3 != null) {
                Intrinsics.checkNotNullExpressionValue(
                    selectFirst3,
                    "element.selectFirst(\".in…?: return@mapNotNull null"
                )
                val link: String = selectFirst3.attr(ShareConstants.WEB_DIALOG_PARAM_HREF)
                val selectFirst4: Element = element.selectFirst(".poster > a > img")
                val attr: String? = selectFirst4?.attr("src")
                val selectFirst5: Element =
                    element.selectFirst(".poster > a > .meta > .inner > .left")
                if (selectFirst5 == null || selectFirst5.selectFirst(".sub")
                        .also { selectFirst2 = it } == null || selectFirst2.text()
                        .also { text2 = it } == null
                ) {
                    num = null
                } else {
                    Intrinsics.checkNotNullExpressionValue(text2, "text()")
                    num = StringsKt.toIntOrNull(text2)
                }
                if (selectFirst5 == null || selectFirst5.selectFirst(".dub")
                        .also { selectFirst = it } == null || selectFirst.text()
                        .also { text = it } == null
                ) {
                    num2 = null
                } else {
                    Intrinsics.checkNotNullExpressionValue(text, "text()")
                    num2 = StringsKt.toIntOrNull(text)
                }
                val text3: String? = selectFirst3.text()
                if (text3 != null) {
                    Intrinsics.checkNotNullExpressionValue(
                        text3,
                        "title.text() ?: return@mapNotNull null"
                    )
                    Intrinsics.checkNotNullExpressionValue(link, "link")
                    animeSearchResponse = MainAPIKt.`newAnimeSearchResponse$default`(
                        nineAnimeProvider,
                        text3,
                        link,
                        null,
                        false,
                        `NineAnimeProvider$getMainPage$items$1$home$1$1`(
                            attr!!, num2, num
                        ),
                        12,
                        null
                    )
                }
            }
            if (animeSearchResponse != null) {
                arrayList.add(animeSearchResponse)
            }
        }
        return HomePageList(str, arrayList, null, null, null, 28, null)
    }
}