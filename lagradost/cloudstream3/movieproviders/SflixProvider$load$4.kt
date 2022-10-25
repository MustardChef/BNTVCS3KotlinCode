package com.lagradost.cloudstream3.movieproviders

import org.jsoup.nodes.Element
import java.util.ArrayList
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function3
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: SflixProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\u008a@"],
    m107d2 = ["<anonymous>", "", "season", "", "element", "Lorg/jsoup/nodes/Element;", "kotlin.jvm.PlatformType"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.movieproviders.SflixProvider\$load$4",
    m98f = "SflixProvider.kt",
    m97i = [0, 0],
    m96l = [bqk.f6598ce],
    m95m = "invokeSuspend",
    m94n = ["episode", "season"],
    m93s = ["L$0", "I$0"]
) /* loaded from: classes3.dex */
class `SflixProvider$load$4`(/* synthetic */val `this$0`: SflixProvider,
                                            arrayList: ArrayList<Episode?>,
                                            str: String,
                                            continuation: Continuation<in `SflixProvider$load$4`>?
) : SuspendLambda(3, continuation), Function3<Integer?, Element?, Continuation<in Unit>?, Object?> {
    /* synthetic */ val `$episodes`: ArrayList<Episode>
    /* synthetic */ val `$url`: String

    /* synthetic */
    var `I$0` = 0

    /* synthetic */
    var `L$0`: Object? = null
    var label = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$episodes` = arrayList
        `$url` = str
    }

    override fun invoke(i: Int, element: Element?, continuation: Continuation<in Unit>?): Object {
        val `sflixProvider$load$4` =
            `SflixProvider$load$4`(`this$0`, `$episodes`, `$url`, continuation)
        `sflixProvider$load$4`.`I$0` = i
        `sflixProvider$load$4`.`L$0` = element
        return `sflixProvider$load$4`.invokeSuspend(Unit.INSTANCE)
    }

    @Override // kotlin.jvm.functions.Function3
    /* bridge */ /* synthetic */  override operator fun invoke(
        num: Integer,
        element: Element,
        continuation: Continuation<in Unit>
    ): Object {
        return invoke(num.intValue(), element, continuation)
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val obj2: Object
        val i: Int
        val intRef: IntRef?
        var ownText: String?
        var i2: Int
        var groupValues: List<String?>?
        var str: String?
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i3 = label
        var i4 = 0
        var i5 = 1
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj)
            val i6 = `I$0`
            val attr: String = (`L$0` as Element?)!!.attr("data-id")
            if (attr == null || StringsKt.isBlank(attr)) {
                return Unit.INSTANCE
            }
            val intRef2 = IntRef()
            val app: RequestCustom = MainActivityKt.getApp()
            `L$0` = intRef2
            `I$0` = i6
            label = 1
            obj2 = Requests.`get$default`(
                app,
                `this$0`.getMainUrl().toString() + "/ajax/v2/season/episodes/" + attr,
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
            i = i6
            intRef = intRef2
        } else if (i3 != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            i = `I$0`
            intRef = `L$0` as IntRef?
            ResultKt.throwOnFailure(obj)
            obj2 = obj
        }
        val document: Document = (obj2 as NiceResponse).getDocument()
        var seasonEpisodesItems: Elements =
            document.select("div.flw-item.film_single-item.episode-item.eps-item")
        val elements: Elements = seasonEpisodesItems
        if (elements == null || elements.isEmpty()) {
            seasonEpisodesItems = document.select("ul > li > a")
        }
        Intrinsics.checkNotNullExpressionValue(seasonEpisodesItems, "seasonEpisodesItems")
        val arrayList: ArrayList<Episode> = `$episodes`
        val sflixProvider = `this$0`
        val str3 = `$url`
        val it: Iterator<Element> = seasonEpisodesItems.iterator()
        while (it.hasNext()) {
            val next = it.next()
            var num: Integer? = null
            val select: Elements = next?.select("img")
            if (select == null || select.attr("title").also { ownText = it } == null) {
                ownText = next.ownText()
            }
            val attr2: String? = if (select != null) select.attr("src") else null
            val attr3: String? = next.attr("data-id")
            if (attr3 != null) {
                Intrinsics.checkNotNullExpressionValue(
                    attr3,
                    "it.attr(\"data-id\") ?: return@forEach"
                )
                intRef.element += i5
                var str4: String? = next.select("div.episode-number").text()
                if (str4 == null) {
                    str4 = ownText
                }
                val regex = Regex("\\d+")
                Intrinsics.checkNotNullExpressionValue(str4, "str")
                val `find$default` = Regex.`find$default`(regex, str4, i4, 2, null)
                if (`find$default` != null && `find$default`.groupValues.also {
                        groupValues = it
                    } != null && CollectionsKt.firstOrNull<Any>(groupValues as List<Object?>?) as String?. also {
                        str = it
                    } != null) {
                    num = StringsKt.toIntOrNull(str)
                }
                i2 = if (num != null) {
                    num.intValue()
                } else {
                    intRef.element
                }
                arrayList.add(
                    MainAPIKt.newEpisode<Tuples<*, *>>(
                        sflixProvider,
                        Tuples<Any?, Any?>(str3, attr3),
                        `SflixProvider$load$4$1$1`(sflixProvider, attr2, ownText, i2, i)
                    )
                )
                i4 = 0
                i5 = 1
            }
        }
        return Unit.INSTANCE
    }
}