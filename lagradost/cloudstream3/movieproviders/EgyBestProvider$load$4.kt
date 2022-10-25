package com.lagradost.cloudstream3.movieproviders

import java.util.ArrayList
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: EgyBestProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\u008a@"],
    m107d2 = ["<anonymous>", "", "", "it", "", "kotlin.jvm.PlatformType"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.movieproviders.EgyBestProvider\$load$4",
    m98f = "EgyBestProvider.kt",
    m97i = [0],
    m96l = [124],
    m95m = "invokeSuspend",
    m94n = ["it"],
    m93s = ["L$0"]
) /* loaded from: classes3.dex */
class `EgyBestProvider$load$4`(/* synthetic */val `this$0`: EgyBestProvider,
                                              arrayList: ArrayList<Episode?>,
                                              continuation: Continuation<in `EgyBestProvider$load$4`?>?
) : SuspendLambda(2, continuation), Function2<String, Continuation<in List<Boolean?>?>?, Object> {
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
        val `egyBestProvider$load$4` = `EgyBestProvider$load$4`(`this$0`, `$episodes`, continuation)
        `egyBestProvider$load$4`.`L$0` = obj
        return `egyBestProvider$load$4`
    }

    @Override // kotlin.jvm.functions.Function2
    /* bridge */ /* synthetic */  override fun invoke(
        str: String,
        continuation: Continuation<in List<Boolean?>?>?
    ): Object {
        return invoke2(str, continuation)
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(str: String, continuation: Continuation<in List<Boolean?>?>?): Object {
        return (create(str, continuation) as `EgyBestProvider$load$4`).invokeSuspend(Unit.INSTANCE)
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val obj2: Object
        val it: String?
        var num: Integer?
        var groupValues: List<String?>?
        var intFromText: Integer
        var num2: Integer?
        var intFromText2: Integer
        var groupValues2: List<String?>?
        var str: String?
        var intFromText3: Integer
        var groupValues3: List<String?>?
        var str2: String?
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            val it2 = `L$0` as String?
            Intrinsics.checkNotNullExpressionValue(it2, "it")
            `L$0` = it2
            label = 1
            obj2 = Requests.`get$default`(
                MainActivityKt.getApp(),
                it2,
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
            it = it2
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            it = `L$0`
            ResultKt.throwOnFailure(obj)
            obj2 = obj
        }
        val document: Document = (obj2 as NiceResponse).getDocument()
        val regex = Regex("season-(.....)")
        Intrinsics.checkNotNullExpressionValue(it, "it")
        var i2 = 0
        var i3 = 2
        var num3: Integer? = null
        val `find$default` = Regex.`find$default`(regex, it, 0, 2, null)
        val intFromText4: Integer? = if (`find$default` == null || `find$default`.groupValues.also {
                groupValues3 = it
            } == null || CollectionsKt.getOrNull<Any>(groupValues3, 1) as String?. also {
                str2 = it
            } == null) null else `this$0`.getIntFromText(str2)
        val select: Elements = document.select("tr.published")
        Intrinsics.checkNotNullExpressionValue(select, "d.select(\"tr.published\")")
        val z: Boolean = !select.isEmpty()
        var str3: String? = "ep-(.....)"
        var str4: String? = ShareConstants.WEB_DIALOG_PARAM_HREF
        if (z) {
            val select2: Elements = document.select("tr.published")
            Intrinsics.checkNotNullExpressionValue(select2, "d.select(\"tr.published\")")
            val elements: Elements = select2
            val egyBestProvider = `this$0`
            var arrayList: ArrayList<Episode> = `$episodes`
            var arrayList2 = ArrayList(CollectionsKt.collectionSizeOrDefault(elements, 10))
            for (element in elements) {
                val regex2 = Regex(str3)
                val attr: String = element.select(".ep_title a").attr(str4)
                Intrinsics.checkNotNullExpressionValue(
                    attr,
                    "element.select(\".ep_title a\").attr(\"href\")"
                )
                val `find$default2` = Regex.`find$default`(regex2, attr, i2, i3, num3)
                if (`find$default2` == null || `find$default2`.groupValues.also {
                        groupValues2 = it
                    } == null || CollectionsKt.getOrNull<Any>(
                        groupValues2,
                        1
                    ) as String?. also { str = it } == null) {
                    num2 = num3
                } else {
                    intFromText3 = egyBestProvider.getIntFromText(str)
                    num2 = intFromText3
                }
                val attr2: String = element.select(".ep_title a").attr(str4)
                Intrinsics.checkNotNullExpressionValue(
                    attr2,
                    "element.select(\".ep_title a\").attr(\"href\")"
                )
                val html: String = element.select("td.ep_title").html()
                Intrinsics.checkNotNullExpressionValue(
                    html,
                    "element.select(\"td.ep_title\").html()"
                )
                val replace: String = Regex(".*</span>|</a>").replace(html, "")
                val text: String = element.select("td.tam:not(.date, .ep_len)").text()
                Intrinsics.checkNotNullExpressionValue(
                    text,
                    "element.select(\"td.tam:n…(.date, .ep_len)\").text()"
                )
                intFromText2 = egyBestProvider.getIntFromText(text)
                val arrayList3: ArrayList = arrayList2
                val arrayList4: ArrayList<Episode> = arrayList
                arrayList3.add(
                    boxing.boxBoolean(
                        arrayList4.add(
                            Episode(
                                attr2,
                                replace,
                                intFromText4,
                                num2,
                                null,
                                intFromText2,
                                null,
                                null,
                                208,
                                null
                            )
                        )
                    )
                )
                str4 = str4
                str3 = str3
                arrayList2 = arrayList3
                arrayList = arrayList4
                i2 = 0
                i3 = 2
                num3 = null
            }
            return arrayList2
        }
        val select3: Elements = document.select("#mainLoad > div:nth-child(3) > div.movies_small a")
        Intrinsics.checkNotNullExpressionValue(
            select3,
            "d.select(\"#mainLoad > di…3) > div.movies_small a\")"
        )
        val elements2: Elements = select3
        val egyBestProvider2 = `this$0`
        val arrayList5: ArrayList<Episode> = `$episodes`
        val arrayList6 = ArrayList(CollectionsKt.collectionSizeOrDefault(elements2, 10))
        for (element2 in elements2) {
            val regex3 = Regex("ep-(.....)")
            val attr3: String = element2.attr(ShareConstants.WEB_DIALOG_PARAM_HREF)
            Intrinsics.checkNotNullExpressionValue(attr3, "eit.attr(\"href\")")
            val `find$default3` = Regex.`find$default`(regex3, attr3, 0, 2, null)
            if (`find$default3` != null && `find$default3`.groupValues.also {
                    groupValues = it
                } != null) {
                val str5 = CollectionsKt.getOrNull<Any>(groupValues, 1) as String
                if (str5 != null) {
                    intFromText = egyBestProvider2.getIntFromText(str5)
                    num = intFromText
                    val attr4: String = element2.attr(ShareConstants.WEB_DIALOG_PARAM_HREF)
                    Intrinsics.checkNotNullExpressionValue(attr4, "eit.attr(\"href\")")
                    arrayList6.add(
                        boxing.boxBoolean(
                            arrayList5.add(
                                Episode(
                                    attr4,
                                    element2.select("span.title").text(),
                                    intFromText4,
                                    num,
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
            }
            num = null
            val attr42: String = element2.attr(ShareConstants.WEB_DIALOG_PARAM_HREF)
            Intrinsics.checkNotNullExpressionValue(attr42, "eit.attr(\"href\")")
            arrayList6.add(
                boxing.boxBoolean(
                    arrayList5.add(
                        Episode(
                            attr42,
                            element2.select("span.title").text(),
                            intFromText4,
                            num,
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
        return arrayList6
    }
}