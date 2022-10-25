package com.lagradost.cloudstream3.movieproviders

import java.util.ArrayList
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: MyCimaProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"],
    m107d2 = ["<anonymous>", "", "", "url", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.movieproviders.MyCimaProvider\$search$2",
    m98f = "MyCimaProvider.kt",
    m97i = [],
    m96l = [71],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
)
/* loaded from: classes3.dex */
internal class `MyCimaProvider$search$2`(/* synthetic */val `this$0`: MyCimaProvider,
                                                        arrayList: ArrayList<SearchResponse?>,
                                                        continuation: Continuation<in `MyCimaProvider$search$2`?>?
) : SuspendLambda(2, continuation), Function2<String, Continuation<in List<Boolean?>?>?, Object> {
    /* synthetic */ val `$result`: ArrayList<SearchResponse>

    /* synthetic */
    var `L$0`: Object? = null
    var label = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$result` = arrayList
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        val `myCimaProvider$search$2` = `MyCimaProvider$search$2`(`this$0`, `$result`, continuation)
        `myCimaProvider$search$2`.`L$0` = obj
        return `myCimaProvider$search$2`
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
        return (create(str, continuation) as `MyCimaProvider$search$2`).invokeSuspend(Unit.INSTANCE)
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val obj2: Object
        var searchResponse: SearchResponse
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            val str = `L$0` as String?
            label = 1
            obj2 = Requests.`get$default`(
                MainActivityKt.getApp(),
                str,
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
        val select: Elements =
            (obj2 as NiceResponse).getDocument().select("div.Grid--MycimaPosts div.GridItem")
        Intrinsics.checkNotNullExpressionValue(
            select,
            "d.select(\"div.Grid--MycimaPosts div.GridItem\")"
        )
        val myCimaProvider = `this$0`
        val arrayList: ArrayList<SearchResponse> = `$result`
        val arrayList2 = ArrayList()
        for (it in select) {
            val text: String = it.text()
            Intrinsics.checkNotNullExpressionValue(text, "it.text()")
            var bool: Boolean? = null
            if (!StringsKt.`contains$default`(
                    text as CharSequence,
                    "اعلان" as CharSequence,
                    false,
                    2,
                    null as Object?
                )
            ) {
                Intrinsics.checkNotNullExpressionValue(it, "it")
                searchResponse = myCimaProvider.toSearchResponse(it)
                if (searchResponse != null) {
                    bool = boxing.boxBoolean(arrayList.add(searchResponse))
                }
            }
            if (bool != null) {
                arrayList2.add(bool)
            }
        }
        return arrayList2
    }
}