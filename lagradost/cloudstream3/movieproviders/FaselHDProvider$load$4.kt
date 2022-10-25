package com.lagradost.cloudstream3.movieproviders

import org.jsoup.nodes.Element
import java.util.ArrayList
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: FaselHDProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\u008a@"],
    m107d2 = ["<anonymous>", "", "", "it", "Lorg/jsoup/nodes/Element;", "kotlin.jvm.PlatformType"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.movieproviders.FaselHDProvider\$load$4",
    m98f = "FaselHDProvider.kt",
    m97i = [],
    m96l = [119],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* loaded from: classes3.dex */
class `FaselHDProvider$load$4`(/* synthetic */val `this$0`: FaselHDProvider,
                                              arrayList: ArrayList<Episode?>,
                                              continuation: Continuation<in `FaselHDProvider$load$4`?>?
) : SuspendLambda(2, continuation), Function2<Element, Continuation<in List<Boolean?>?>?, Object> {
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
        val `faselHDProvider$load$4` = `FaselHDProvider$load$4`(`this$0`, `$episodes`, continuation)
        `faselHDProvider$load$4`.`L$0` = obj
        return `faselHDProvider$load$4`
    }

    @Override // kotlin.jvm.functions.Function2
    /* bridge */ /* synthetic */  override fun invoke(
        element: Element,
        continuation: Continuation<in List<Boolean?>?>?
    ): Object {
        return invoke2(element, continuation)
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(element: Element, continuation: Continuation<in List<Boolean?>?>?): Object {
        return (create(
            element,
            continuation
        ) as `FaselHDProvider$load$4`).invokeSuspend(Unit.INSTANCE)
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val obj2: Object
        var intFromText: Integer
        var intFromText2: Integer
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            val app: RequestCustom = MainActivityKt.getApp()
            label = 1
            obj2 = Requests.`get$default`(
                app,
                `this$0`.getMainUrl().toString() + "/?p=" + (`L$0` as Element?)!!.attr("data-href"),
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
        val select: Elements = document.select("div.epAll a")
        Intrinsics.checkNotNullExpressionValue(select, "s.select(\"div.epAll a\")")
        val elements: Elements = select
        val arrayList: ArrayList<Episode> = `$episodes`
        val faselHDProvider = `this$0`
        val arrayList2 = ArrayList(CollectionsKt.collectionSizeOrDefault(elements, 10))
        for (element in elements) {
            val attr: String = element.attr(ShareConstants.WEB_DIALOG_PARAM_HREF)
            Intrinsics.checkNotNullExpressionValue(attr, "it.attr(\"href\")")
            val text: String = element.text()
            val text2: String = document.select("div.seasonDiv.active div.title").text()
            Intrinsics.checkNotNullExpressionValue(
                text2,
                "s.select(\"div.seasonDiv.active div.title\").text()"
            )
            intFromText = faselHDProvider.getIntFromText(text2)
            val text3: String = element.text()
            Intrinsics.checkNotNullExpressionValue(text3, "it.text()")
            intFromText2 = faselHDProvider.getIntFromText(text3)
            arrayList2.add(
                boxing.boxBoolean(
                    arrayList.add(
                        Episode(
                            attr,
                            text,
                            intFromText,
                            intFromText2,
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
        return arrayList2
    }
}