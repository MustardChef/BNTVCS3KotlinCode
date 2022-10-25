package com.lagradost.cloudstream3.movieproviders

import com.google.common.net.HttpHeaders
import org.jsoup.nodes.Element
import java.util.List
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: EntrepeliculasyseriesProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\u008a@"],
    m107d2 = ["<anonymous>", "", "", "it", "Lorg/jsoup/nodes/Element;", "kotlin.jvm.PlatformType"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.movieproviders.EntrepeliculasyseriesProvider\$loadLinks$2",
    m98f = "EntrepeliculasyseriesProvider.kt",
    m97i = [0],
    m96l = [151],
    m95m = "invokeSuspend",
    m94n = ["servers"],
    m93s = ["L$0"]
) /* loaded from: classes3.dex */
class `EntrepeliculasyseriesProvider$loadLinks$2`(/* synthetic */val `$data`: String,
                                                                 function1: Function1<SubtitleFile, Unit>,
                                                                 function12: Function1<ExtractorLink, Unit>,
                                                                 continuation: Continuation<in `EntrepeliculasyseriesProvider$loadLinks$2`?>?
) : SuspendLambda(2, continuation),
    Function2<Element, Continuation<in List<List<Boolean?>?>?>?, Object> {
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
        val `entrepeliculasyseriesProvider$loadLinks$2` =
            `EntrepeliculasyseriesProvider$loadLinks$2`(
                `$data`, `$subtitleCallback`, `$callback`, continuation
            )
        `entrepeliculasyseriesProvider$loadLinks$2`.`L$0` = obj
        return `entrepeliculasyseriesProvider$loadLinks$2`
    }

    @Override // kotlin.jvm.functions.Function2
    /* bridge */ /* synthetic */  override fun invoke(
        element: Element,
        continuation: Continuation<in List<List<Boolean?>?>?>?
    ): Object {
        return invoke2(element, continuation)
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(element: Element, continuation: Continuation<in List<List<Boolean?>?>?>?): Object {
        return (create(
            element,
            continuation
        ) as `EntrepeliculasyseriesProvider$loadLinks$2`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val obj2: Object
        val str: String?
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            val servers: String = (`L$0` as Element?)!!.attr("data-link")
            Intrinsics.checkNotNullExpressionValue(servers, "servers")
            `L$0` = servers
            label = 1
            obj2 = Requests.`get$default`(
                MainActivityKt.getApp(),
                servers,
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
            str = servers
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            ResultKt.throwOnFailure(obj)
            obj2 = obj
            str = `L$0`
        }
        val select: Elements =
            (obj2 as NiceResponse).getDocument().select(TvContractCompat.PARAM_INPUT)
        Intrinsics.checkNotNullExpressionValue(select, "doc.select(\"input\")")
        return ParCollections.apmap(
            select,
            C47941(str, `$data`, `$subtitleCallback`, `$callback`, null)
        )
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: EntrepeliculasyseriesProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\u008a@"],
        m107d2 = ["<anonymous>", "", "", "it", "Lorg/jsoup/nodes/Element;", "kotlin.jvm.PlatformType"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    @DebugMetadata(
        m99c = "com.lagradost.cloudstream3.movieproviders.EntrepeliculasyseriesProvider\$loadLinks$2$1",
        m98f = "EntrepeliculasyseriesProvider.kt",
        m97i = [],
        m96l = [154],
        m95m = "invokeSuspend",
        m94n = [],
        m93s = []
    ) /* renamed from: com.lagradost.cloudstream3.movieproviders.EntrepeliculasyseriesProvider$loadLinks$2$1 */ /* loaded from: classes3.dex */
    class C47941 internal constructor(/* synthetic */val `$servers`: String?, /* synthetic */
                                                     val `$data`: String,
                                                     function1: Function1<SubtitleFile, Unit>,
                                                     function12: Function1<ExtractorLink, Unit>,
                                                     continuation: Continuation<in C47941?>?
    ) : SuspendLambda(2, continuation),
        Function2<Element, Continuation<in List<Boolean?>?>?, Object> {
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
            val c47941 = C47941(`$servers`, `$data`, `$subtitleCallback`, `$callback`, continuation)
            c47941.`L$0` = obj
            return c47941
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
            return (create(element, continuation) as C47941).invokeSuspend(Unit.INSTANCE)
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        override fun invokeSuspend(obj: Object): Object {
            val `post$default`: Object
            val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
            val i = label
            if (i == 0) {
                ResultKt.throwOnFailure(obj)
                val attr: String = (`L$0` as Element?)!!.attr("value")
                val app: RequestCustom = MainActivityKt.getApp()
                val tuplesArr = arrayOf<Tuples<*, *>>(
                    TuplesKt.m100to<Any, Any>(HttpHeaders.HOST, "entrepeliculasyseries.nu"),
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
                        HttpHeaders.ORIGIN, "https://entrepeliculasyseries.nu"
                    ),
                    TuplesKt.m100to<Any, Any>(
                        HttpHeaders.DNT, "1"
                    ),
                    TuplesKt.m100to<Any, Any>("Connection", "keep-alive"),
                    TuplesKt.m100to<Any, Any?>(
                        HttpHeaders.REFERER, `$servers`
                    ),
                    TuplesKt.m100to<Any, Any>("Upgrade-Insecure-Requests", "1"),
                    TuplesKt.m100to<Any, Any>(
                        HttpHeaders.SEC_FETCH_DEST, "document"
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
                    "https://entrepeliculasyseries.nu/r.php",
                    MapsKt.mapOf(*tuplesArr),
                    null,
                    null,
                    null,
                    MapsKt.mapOf(Tuples<Any?, Any?>("h", attr)),
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
                    32220,
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
                    .values(FirebaseAnalytics.Param.LOCATION), C47951(
                    `$data`, `$subtitleCallback`, `$callback`, null
                )
            )
        }

        /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: EntrepeliculasyseriesProvider.kt */
        @Metadata(
            m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"],
            m107d2 = ["<anonymous>", "", "it", ""],
            m106k = 3,
            m105mv = [1, 6, 0],
            m103xi = 48
        )
        @DebugMetadata(
            m99c = "com.lagradost.cloudstream3.movieproviders.EntrepeliculasyseriesProvider\$loadLinks$2$1$1",
            m98f = "EntrepeliculasyseriesProvider.kt",
            m97i = [],
            m96l = [173],
            m95m = "invokeSuspend",
            m94n = [],
            m93s = []
        ) /* renamed from: com.lagradost.cloudstream3.movieproviders.EntrepeliculasyseriesProvider$loadLinks$2$1$1 */ /* loaded from: classes3.dex */
        class C47951 internal constructor(/* synthetic */val `$data`: String,
                                                         function1: Function1<SubtitleFile, Unit>,
                                                         function12: Function1<ExtractorLink, Unit>,
                                                         continuation: Continuation<in C47951?>?
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
                val c47951 = C47951(`$data`, `$subtitleCallback`, `$callback`, continuation)
                c47951.`L$0` = obj
                return c47951
            }

            @Override // kotlin.jvm.functions.Function2
            override fun invoke(str: String, continuation: Continuation<in Boolean?>?): Object {
                return (create(str, continuation) as C47951).invokeSuspend(Unit.INSTANCE)
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
                        `L$0` as String?,
                        `$data`,
                        `$subtitleCallback`,
                        `$callback`,
                        this
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
}