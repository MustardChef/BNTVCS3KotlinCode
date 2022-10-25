package com.lagradost.cloudstream3.movieproviders

import org.jsoup.nodes.Element
import java.util.ArrayList
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: TrailersTwoProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"],
    m107d2 = ["<anonymous>", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.movieproviders.TrailersTwoProvider\$loadLinks$3",
    m98f = "TrailersTwoProvider.kt",
    m97i = [1],
    m96l = [183, 188],
    m95m = "invokeSuspend",
    m94n = ["movieId"],
    m93s = ["L$2"]
)
/* loaded from: classes3.dex */
internal class `TrailersTwoProvider$loadLinks$3`(
    tmdbLink: TmdbLink,
    z: Boolean,
    str: String,
    function1: Function1<ExtractorLink?, Unit>,
    trailersTwoProvider: TrailersTwoProvider,
    continuation: Continuation<in `TrailersTwoProvider$loadLinks$3`?>?
) : SuspendLambda(1, continuation), Function1<Continuation<in Unit>?, Object> {
    /* synthetic */ val `$callback`: Function1<ExtractorLink?, Unit>
    /* synthetic */ val `$isMovie`: Boolean
    /* synthetic */ val `$mappedData`: TmdbLink
    /* synthetic */ val `$videoUrl`: String
    var `L$0`: Object? = null
    var `L$1`: Object? = null
    var `L$2`: Object? = null
    var label = 0
    /* synthetic */ val `this$0`: TrailersTwoProvider

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$mappedData` = tmdbLink
        `$isMovie` = z
        `$videoUrl` = str
        `$callback` = function1
        `this$0` = trailersTwoProvider
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(continuation: Continuation<*>?): Continuation<Unit> {
        return `TrailersTwoProvider$loadLinks$3`(
            `$mappedData`,
            `$isMovie`,
            `$videoUrl`,
            `$callback`,
            `this$0`,
            continuation
        )
    }

    @Override // kotlin.jvm.functions.Function1
    override fun invoke(continuation: Continuation<in Unit>?): Object {
        return (create(continuation) as `TrailersTwoProvider$loadLinks$3`).invokeSuspend(Unit.INSTANCE)
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val obj2: Object
        val trailersTwoProvider: TrailersTwoProvider?
        val obj3: Object
        val function1: Function1<ExtractorLink, Unit>?
        val str: String?
        var groupValues: List<String?>?
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            val movieName: String = `$mappedData`.getMovieName()
            if (movieName != null && `$isMovie`) {
                val app: RequestCustom = MainActivityKt.getApp()
                label = 1
                obj2 = Requests.`get$default`(
                    app,
                    "https://trailers.to/en/quick-search?q=$movieName",
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
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj)
            obj2 = obj
        } else {
            if (i == 2) {
                function1 = `L$0`
                ResultKt.throwOnFailure(obj)
                trailersTwoProvider = `L$1`
                str = `L$2`
                obj3 = obj
                val url: String = (obj3 as NiceResponse).getUrl()
                function1!!.invoke(
                    ExtractorLink(
                        trailersTwoProvider.getName(),
                        trailersTwoProvider.getName().toString() + " Backup",
                        StringsKt.`replace$default`(
                            url,
                            JsonPointer.SEPARATOR + trailersTwoProvider.getUser() + "/0/",
                            JsonPointer.SEPARATOR + trailersTwoProvider.getUser() + JsonPointer.SEPARATOR.code + str + JsonPointer.SEPARATOR.code,
                            false,
                            4,
                            null as Object?
                        ),
                        "https://trailers.to",
                        Qualities.Unknown.value,
                        false,
                        null,
                        null,
                        192,
                        null
                    )
                )
                return Unit.INSTANCE
            }
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        }
        val select: Elements = (obj2 as NiceResponse).getDocument().select("a.post-minimal")
        Intrinsics.checkNotNullExpressionValue(
            select,
            "app.get(\"https://trailer….select(\"a.post-minimal\")"
        )
        val arrayList = ArrayList()
        val it: Iterator<Element> = select.iterator()
        while (true) {
            if (!it.hasNext()) {
                break
            }
            val next = it.next()
            val attr: String? = next?.attr(ShareConstants.WEB_DIALOG_PARAM_HREF)
            if (attr != null) {
                arrayList.add(attr)
            }
        }
        val arrayList2: ArrayList<String> = arrayList
        val arrayList3 = ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10))
        for (str2 in arrayList2) {
            val `find$default` = Regex.`find$default`(Regex("/movie/(\\d+)/"), str2, 0, 2, null)
            arrayList3.add(if (`find$default` == null || `find$default`.groupValues.also {
                    groupValues = it
                } == null) null else CollectionsKt.getOrNull<Any>(groupValues, 1) as String)
        }
        val str3 = CollectionsKt.firstOrNull<Any>(arrayList3 as List<Object?>) as String?
        if (str3 != null) {
            val str4 = `$videoUrl`
            val function12: Function1<ExtractorLink, Unit> = `$callback`
            val trailersTwoProvider2 = `this$0`
            `L$0` = function12
            `L$1` = trailersTwoProvider2
            `L$2` = str3
            label = 2
            trailersTwoProvider = trailersTwoProvider2
            obj3 = Requests.`get$default`(
                MainActivityKt.getApp(),
                str4,
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
            if (obj3 === coroutine_suspended) {
                return coroutine_suspended
            }
            function1 = function12
            str = str3
            val url2: String = (obj3 as NiceResponse).getUrl()
            function1.invoke(
                ExtractorLink(
                    trailersTwoProvider.getName(),
                    trailersTwoProvider.getName().toString() + " Backup",
                    StringsKt.`replace$default`(
                        url2,
                        JsonPointer.SEPARATOR + trailersTwoProvider.user + "/0/",
                        JsonPointer.SEPARATOR + trailersTwoProvider.user + JsonPointer.SEPARATOR.code + str + JsonPointer.SEPARATOR.code,
                        false,
                        4,
                        null as Object?
                    ),
                    "https://trailers.to",
                    Qualities.Unknown.value,
                    false,
                    null,
                    null,
                    192,
                    null
                )
            )
        }
        return Unit.INSTANCE
    }
}