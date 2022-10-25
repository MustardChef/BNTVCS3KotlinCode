package com.lagradost.cloudstream3.movieproviders

import com.fasterxml.jackson.core.type.TypeReference
import com.lagradost.cloudstream3.utils.AppUtils
import org.jsoup.nodes.Element
import java.util.ArrayList
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: MyCimaProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "", "surl", "", "kotlin.jvm.PlatformType"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.movieproviders.MyCimaProvider\$load$5",
    m98f = "MyCimaProvider.kt",
    m97i = [],
    m96l = [bqk.f6552bL],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* loaded from: classes3.dex */
class `MyCimaProvider$load$5`(/* synthetic */val `this$0`: MyCimaProvider,
                                             arrayList: ArrayList<Episode?>,
                                             continuation: Continuation<in `MyCimaProvider$load$5`?>?
) : SuspendLambda(2, continuation), Function2<String, Continuation<in Unit>?, Object> {
    /* synthetic */ val `$episodes`: ArrayList<Episode>

    /* synthetic */
    var `L$0`: Object? = null
    var label = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$episodes` = arrayList
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        val `myCimaProvider$load$5` = `MyCimaProvider$load$5`(`this$0`, `$episodes`, continuation)
        `myCimaProvider$load$5`.`L$0` = obj
        return `myCimaProvider$load$5`
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(str: String, continuation: Continuation<in Unit>?): Object {
        return (create(str, continuation) as `MyCimaProvider$load$5`).invokeSuspend(Unit.INSTANCE)
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val obj2: Object
        val intFromText: Integer
        val intFromText2: Integer
        var intFromText3: Integer
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            val surl = `L$0` as String?
            Intrinsics.checkNotNullExpressionValue(surl, "surl")
            if (StringsKt.`contains$default`(
                    surl as CharSequence?,
                    "%d9%85%d8%af%d8%a8%d9%84%d8%ac" as CharSequence,
                    false,
                    2,
                    null as Object?
                )
            ) {
                return Unit.INSTANCE
            }
            label = 1
            obj2 = Requests.`get$default`(
                MainActivityKt.getApp(),
                surl,
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
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            ResultKt.throwOnFailure(obj)
            obj2 = obj
        }
        val document: Document = (obj2 as NiceResponse).getDocument()
        val fmoreButton: Elements = document.select("div.MoreEpisodes--Button")
        val myCimaProvider = `this$0`
        val text: String = document.select("div.List--Seasons--Episodes a.selected").text()
        Intrinsics.checkNotNullExpressionValue(
            text,
            "seasonsite.select(\"div.L…sodes a.selected\").text()"
        )
        intFromText = myCimaProvider.getIntFromText(text)
        val intValue = if (intFromText != null) intFromText.intValue() else 1
        val select: Elements =
            document.select("div.Seasons--Episodes div.Episodes--Seasons--Episodes a")
        Intrinsics.checkNotNullExpressionValue(
            select,
            "seasonsite.select(\"div.S…es--Seasons--Episodes a\")"
        )
        val elements: Elements = select
        val arrayList: ArrayList<Episode> = `$episodes`
        val myCimaProvider2 = `this$0`
        val arrayList2 = ArrayList(CollectionsKt.collectionSizeOrDefault(elements, 10))
        for (element in elements) {
            val attr: String = element.attr(ShareConstants.WEB_DIALOG_PARAM_HREF)
            Intrinsics.checkNotNullExpressionValue(attr, "it.attr(\"href\")")
            val text2: String = element.text()
            val boxInt: Integer = boxing.boxInt(intValue)
            val text3: String = element.text()
            Intrinsics.checkNotNullExpressionValue(text3, "it.text()")
            intFromText3 = myCimaProvider2.getIntFromText(text3)
            arrayList2.add(
                boxing.boxBoolean(
                    arrayList.add(
                        Episode(
                            attr,
                            text2,
                            boxInt,
                            intFromText3,
                            null,
                            null,
                            null,
                            null,
                            240,
                            null
                        )
                    )
                )
            )
        }
        Intrinsics.checkNotNullExpressionValue(fmoreButton, "fmoreButton")
        if (!fmoreButton.isEmpty()) {
            val size: Int =
                document.select("div.Seasons--Episodes div.Episodes--Seasons--Episodes a").size()
            val myCimaProvider3 = `this$0`
            val first: Element = document.select("div.Episodes--Seasons--Episodes a").first()
            Intrinsics.checkNotNull(first)
            val text4: String = first.text()
            Intrinsics.checkNotNullExpressionValue(
                text4,
                "seasonsite.select(\"div.E…odes a\").first()!!.text()"
            )
            intFromText2 = myCimaProvider3.getIntFromText(text4)
            ParCollections.apmap(
                CollectionsKt.arrayListOf<Any>(
                    boxing.boxInt(size),
                    boxing.boxInt(size + 40),
                    boxing.boxInt(size + 80),
                    boxing.boxInt(size + 120),
                    boxing.boxInt(size + 160),
                    boxing.boxInt(size + 200),
                    boxing.boxInt(size + 240),
                    boxing.boxInt(size + 280),
                    boxing.boxInt(size + 320),
                    boxing.boxInt(size + 360),
                    boxing.boxInt(size + 400),
                    boxing.boxInt(size + 440),
                    boxing.boxInt(size + 480),
                    boxing.boxInt(size + 520),
                    boxing.boxInt(size + 660),
                    boxing.boxInt(size + TypedValues.TransitionType.TYPE_DURATION),
                    boxing.boxInt(size + 740),
                    boxing.boxInt(size + 780),
                    boxing.boxInt(size + 820),
                    boxing.boxInt(size + 860),
                    boxing.boxInt(size + 900),
                    boxing.boxInt(size + 940),
                    boxing.boxInt(size + 980),
                    boxing.boxInt(size + 1020),
                    boxing.boxInt(size + 1060),
                    boxing.boxInt(size + 1100),
                    boxing.boxInt(size + 1140),
                    boxing.boxInt(size + 1180),
                    boxing.boxInt(size + 1220),
                    intFromText2
                ), C48122(intFromText2, `this$0`, fmoreButton, `$episodes`, intValue, null)
            )
            return Unit.INSTANCE
        }
        return Unit.INSTANCE
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: MyCimaProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@"],
        m107d2 = ["<anonymous>", "", "it", ""],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    @DebugMetadata(
        m99c = "com.lagradost.cloudstream3.movieproviders.MyCimaProvider\$load$5$2",
        m98f = "MyCimaProvider.kt",
        m97i = [],
        m96l = [bqk.f6531ar],
        m95m = "invokeSuspend",
        m94n = [],
        m93s = []
    ) /* renamed from: com.lagradost.cloudstream3.movieproviders.MyCimaProvider$load$5$2 */ /* loaded from: classes3.dex */
    class C48122 internal constructor(
        num: Integer?,
        myCimaProvider: MyCimaProvider,
        elements: Elements,
        arrayList: ArrayList<Episode?>,
        i: Int,
        continuation: Continuation<in C48122?>?
    ) : SuspendLambda(2, continuation), Function2<Integer, Continuation<in Unit>?, Object> {
        /* synthetic */ val `$episodes`: ArrayList<Episode>
        /* synthetic */ val `$fmoreButton`: Elements
        /* synthetic */ val `$fseason`: Int
        /* synthetic */ val `$totals`: Integer?

        /* synthetic */
        var `L$0`: Object? = null
        var label = 0
        /* synthetic */ val `this$0`: MyCimaProvider

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        init {
            `$totals` = num
            `this$0` = myCimaProvider
            `$fmoreButton` = elements
            `$episodes` = arrayList
            `$fseason` = i
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
            val c48122 =
                C48122(`$totals`, `this$0`, `$fmoreButton`, `$episodes`, `$fseason`, continuation)
            c48122.`L$0` = obj
            return c48122
        }

        @Override // kotlin.jvm.functions.Function2
        override fun invoke(num: Integer, continuation: Continuation<in Unit>?): Object {
            return (create(num, continuation) as C48122).invokeSuspend(Unit.INSTANCE)
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        override fun invokeSuspend(obj: Object): Object {
            val obj2: Object
            var intFromText: Integer
            val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
            val i = label
            if (i == 0) {
                ResultKt.throwOnFailure(obj)
                val num: Integer? = `L$0` as Integer?
                if (num != null) {
                    val intValue: Int = num.intValue()
                    val num2: Integer? = `$totals`
                    Intrinsics.checkNotNull(num2)
                    if (intValue > num2.intValue()) {
                        return Unit.INSTANCE
                    }
                    label = 1
                    obj2 = Requests.`get$default`(
                        MainActivityKt.getApp(),
                        `this$0`.getMainUrl()
                            .toString() + "/AjaxCenter/MoreEpisodes/" + `$fmoreButton`.attr("data-term") + JsonPointer.SEPARATOR + num,
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
                }
                return Unit.INSTANCE
            } else if (i != 1) {
                throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
            } else {
                ResultKt.throwOnFailure(obj)
                obj2 = obj
            }
            val appUtils = AppUtils.INSTANCE
            val output: String = (MainAPIKt.getMapper().readValue(
                (obj2 as NiceResponse).getText(),
                object :
                    TypeReference<MoreEPS?>() { // from class: com.lagradost.cloudstream3.movieproviders.MyCimaProvider$load$5$2$invokeSuspend$$inlined$parseJson$1
                }) as MoreEPS).getOutput()
            val select: Elements = Jsoup.parse(
                if (output != null) StringsKt.`replace$default`(
                    output,
                    "\\",
                    "",
                    false,
                    4,
                    null as Object?
                ) else null
            ).select("a")
            Intrinsics.checkNotNullExpressionValue(select, "document.select(\"a\")")
            val elements: Elements = select
            val arrayList: ArrayList<Episode> = `$episodes`
            val i2 = `$fseason`
            val myCimaProvider = `this$0`
            val arrayList2 = ArrayList(CollectionsKt.collectionSizeOrDefault(elements, 10))
            for (element in elements) {
                val attr: String = element.attr(ShareConstants.WEB_DIALOG_PARAM_HREF)
                Intrinsics.checkNotNullExpressionValue(attr, "it.attr(\"href\")")
                val text: String = element.text()
                val boxInt: Integer = boxing.boxInt(i2)
                val text2: String = element.text()
                Intrinsics.checkNotNullExpressionValue(text2, "it.text()")
                intFromText = myCimaProvider.getIntFromText(text2)
                arrayList2.add(
                    boxing.boxBoolean(
                        arrayList.add(
                            Episode(
                                attr,
                                text,
                                boxInt,
                                intFromText,
                                null,
                                null,
                                null,
                                null,
                                240,
                                null
                            )
                        )
                    )
                )
            }
            return Unit.INSTANCE
        }
    }
}