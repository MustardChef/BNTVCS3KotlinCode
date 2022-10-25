package com.lagradost.cloudstream3.extractors

import org.jsoup.nodes.Element
import java.util.ArrayList
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: Vidstream.kt */
@Metadata(
    m108d1 = ["\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"],
    m107d2 = ["<anonymous>", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.extractors.Vidstream\$getUrl$4",
    m98f = "Vidstream.kt",
    m97i = [],
    m96l = [79],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
)
/* loaded from: classes3.dex */
internal class `Vidstream$getUrl$4`(/* synthetic */val `$extractorUrl`: String, /* synthetic */
                                                   val `$isCasting`: Boolean,
                                                   function1: Function1<SubtitleFile?, Unit>?,
                                                   function12: Function1<ExtractorLink?, Unit>,
                                                   continuation: Continuation<in `Vidstream$getUrl$4`?>?
) : SuspendLambda(1, continuation), Function1<Continuation<in Unit>?, Object> {
    /* synthetic */ val `$callback`: Function1<ExtractorLink?, Unit>
    /* synthetic */ val `$subtitleCallback`: Function1<SubtitleFile?, Unit>?
    var label = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$subtitleCallback` = function1
        `$callback` = function12
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(continuation: Continuation<*>?): Continuation<Unit> {
        return `Vidstream$getUrl$4`(
            `$extractorUrl`,
            `$isCasting`,
            `$subtitleCallback`,
            `$callback`,
            continuation
        )
    }

    @Override // kotlin.jvm.functions.Function1
    override fun invoke(continuation: Continuation<in Unit>?): Object {
        return (create(continuation) as `Vidstream$getUrl$4`).invokeSuspend(Unit.INSTANCE)
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val obj2: Object
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            label = 1
            obj2 = Requests.`get$default`(
                MainActivityKt.getApp(),
                `$extractorUrl`,
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
        val z = `$isCasting`
        val str = `$extractorUrl`
        val function1: Function1<SubtitleFile, Unit>? = `$subtitleCallback`
        val function12: Function1<ExtractorLink, Unit> = `$callback`
        val primaryLinks: Elements = Jsoup.parse((obj2 as NiceResponse).getText())
            .select("ul.list-server-items > li.linkserver")
        Intrinsics.checkNotNullExpressionValue(primaryLinks, "primaryLinks")
        val hashSet = HashSet()
        val arrayList: ArrayList<Element> = ArrayList()
        for (element in primaryLinks) {
            if (hashSet.add(element.attr("data-video"))) {
                arrayList.add(element)
            }
        }
        for (element2 in arrayList) {
            val attr: String = element2.attr("data-video")
            val extractorApis: Array<ExtractorApi> = ExtractorApiKt.extractorApis
            val arrayList2 = ArrayList()
            for (extractorApi in extractorApis) {
                if (if (extractorApi.requiresReferer && z) false else true) {
                    arrayList2.add(extractorApi)
                }
            }
            ParCollections.apmap(
                arrayList2,
                `Vidstream$getUrl$4$1$2$2`(attr, str, function1, function12, null)
            )
        }
        return Unit.INSTANCE
    }
}