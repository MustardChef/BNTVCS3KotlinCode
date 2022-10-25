package com.lagradost.cloudstream3.movieproviders

import com.google.common.net.HttpHeaders
import org.jsoup.nodes.Element
import java.util.List
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: SeriesflixProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\u008a@"],
    m107d2 = ["<anonymous>", "", "", "it", "Lorg/jsoup/nodes/Element;", "kotlin.jvm.PlatformType"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.movieproviders.SeriesflixProvider\$loadLinks$2$1",
    m98f = "SeriesflixProvider.kt",
    m97i = [],
    m96l = [197],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* loaded from: classes3.dex */
class `SeriesflixProvider$loadLinks$2$1`(/* synthetic */val `$data`: String,
                                                        function1: Function1<SubtitleFile, Unit>,
                                                        function12: Function1<ExtractorLink, Unit>,
                                                        continuation: Continuation<in `SeriesflixProvider$loadLinks$2$1`?>?
) : SuspendLambda(2, continuation), Function2<Element, Continuation<in List<Boolean?>?>?, Object> {
    /* synthetic */ val `$callback`: Function1<ExtractorLink, Unit>
    /* synthetic */ val `$subtitleCallback`: Function1<SubtitleFile, Unit>

    /* synthetic */
    var `L$0`: Object? = null
    var label = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$subtitleCallback` = function1
        `$callback` = function12
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        val `seriesflixProvider$loadLinks$2$1` = `SeriesflixProvider$loadLinks$2$1`(
            `$data`,
            `$subtitleCallback`,
            `$callback`,
            continuation
        )
        `seriesflixProvider$loadLinks$2$1`.`L$0` = obj
        return `seriesflixProvider$loadLinks$2$1`
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
        return (create(element, continuation) as `SeriesflixProvider$loadLinks$2$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val `post$default`: Object
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            val iframe: String = (`L$0` as Element?)!!.attr("src")
            Intrinsics.checkNotNullExpressionValue(iframe, "iframe")
            val `replace$default`: String = StringsKt.`replace$default`(
                iframe,
                "https://sc.seriesflix.video/index.php?h=",
                "",
                false,
                4,
                null as Object?
            )
            val app: RequestCustom = MainActivityKt.getApp()
            val tuplesArr = arrayOf<Tuples<*, *>>(
                TuplesKt.m100to<Any, Any>(HttpHeaders.HOST, "sc.seriesflix.video"),
                TuplesKt.m100to<Any, Any>("User-Agent", MainAPIKt.USER_AGENT),
                TuplesKt.m100to<Any, Any>(
                    "Accept",
                    "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8"
                ),
                TuplesKt.m100to<Any, Any>(
                    HttpHeaders.ACCEPT_LANGUAGE, "en-US,en;q=0.5"
                ),
                TuplesKt.m100to<Any, Any>("Content-Type", "application/x-www-form-urlencoded"),
                TuplesKt.m100to<Any, Any>(
                    HttpHeaders.ORIGIN, "null"
                ),
                TuplesKt.m100to<Any, Any>(HttpHeaders.DNT, "1"),
                TuplesKt.m100to<Any, Any>("Alt-Used", "sc.seriesflix.video"),
                TuplesKt.m100to<Any, Any>("Connection", "keep-alive"),
                TuplesKt.m100to<Any, Any>("Upgrade-Insecure-Requests", "1"),
                TuplesKt.m100to<Any, Any>(
                    HttpHeaders.SEC_FETCH_DEST, "iframe"
                ),
                TuplesKt.m100to<Any, Any>(HttpHeaders.SEC_FETCH_MODE, "navigate"),
                TuplesKt.m100to<Any, Any>(
                    HttpHeaders.SEC_FETCH_SITE, HttpHeaders.ReferrerPolicyValues.SAME_ORIGIN
                ),
                TuplesKt.m100to<Any, Any>(
                    HttpHeaders.SEC_FETCH_USER, "?1"
                )
            )
            label = 1
            `post$default` = Requests.`post$default`(
                app,
                "https://sc.seriesflix.video/r.php",
                MapsKt.mapOf(*tuplesArr),
                null,
                MapsKt.mapOf(Tuples<Any?, Any?>("h", `replace$default`)),
                null,
                MapsKt.mapOf(Tuples<Any?, Any?>("h", `replace$default`)),
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
                32212,
                null
            )
            if (`post$default` === coroutine_suspended) {
                return coroutine_suspended
            }
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            ResultKt.throwOnFailure(obj)
            `post$default` = obj
        }
        return ParCollections.apmap(
            (`post$default` as NiceResponse).getOkhttpResponse().headers()
                .values(FirebaseAnalytics.Param.LOCATION), C48201(
                `$data`, `$subtitleCallback`, `$callback`, null
            )
        )
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: SeriesflixProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"],
        m107d2 = ["<anonymous>", "", "link", ""],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    @DebugMetadata(
        m99c = "com.lagradost.cloudstream3.movieproviders.SeriesflixProvider\$loadLinks$2$1$1",
        m98f = "SeriesflixProvider.kt",
        m97i = [],
        m96l = [bqk.f6558bR],
        m95m = "invokeSuspend",
        m94n = [],
        m93s = []
    ) /* renamed from: com.lagradost.cloudstream3.movieproviders.SeriesflixProvider$loadLinks$2$1$1 */ /* loaded from: classes3.dex */
    class C48201 internal constructor(/* synthetic */val `$data`: String,
                                                     function1: Function1<SubtitleFile, Unit>,
                                                     function12: Function1<ExtractorLink, Unit>,
                                                     continuation: Continuation<in C48201?>?
    ) : SuspendLambda(2, continuation), Function2<String, Continuation<in Boolean?>?, Object> {
        /* synthetic */ val `$callback`: Function1<ExtractorLink, Unit>
        /* synthetic */ val `$subtitleCallback`: Function1<SubtitleFile, Unit>

        /* synthetic */
        var `L$0`: Object? = null
        var label = 0

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
        init {
            `$subtitleCallback` = function1
            `$callback` = function12
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
            val c48201 = C48201(`$data`, `$subtitleCallback`, `$callback`, continuation)
            c48201.`L$0` = obj
            return c48201
        }

        @Override // kotlin.jvm.functions.Function2
        override fun invoke(str: String, continuation: Continuation<in Boolean?>?): Object {
            return (create(str, continuation) as C48201).invokeSuspend(Unit.INSTANCE)
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        override fun invokeSuspend(obj: Object): Object {
            var obj: Object = obj
            val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
            val i = label
            if (i == 0) {
                ResultKt.throwOnFailure(obj)
                label = 1
                obj = ExtractorApiKt.loadExtractor(
                    StringsKt.`replace$default`(
                        `L$0` as String?,
                        "#bu",
                        "",
                        false,
                        4,
                        null as Object?
                    ), `$data`, `$subtitleCallback`, `$callback`, this
                )
                if (obj === coroutine_suspended) {
                    return coroutine_suspended
                }
            } else if (i != 1) {
                throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
            } else {
                ResultKt.throwOnFailure(obj)
            }
            return obj
        }
    }
}