package com.lagradost.cloudstream3.movieproviders

import com.google.common.net.HttpHeaders
import org.jsoup.nodes.Element
import java.util.List
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: CinecalidadProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "", "it", "Lorg/jsoup/nodes/Element;", "kotlin.jvm.PlatformType"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.movieproviders.CinecalidadProvider\$loadLinks$2",
    m98f = "CinecalidadProvider.kt",
    m97i = [0, 1],
    m96l = [161, 163],
    m95m = "invokeSuspend",
    m94n = ["url", "url"],
    m93s = ["L$0", "L$0"]
) /* loaded from: classes3.dex */
class `CinecalidadProvider$loadLinks$2`(
    function1: Function1<SubtitleFile, Unit>,
    function12: Function1<ExtractorLink, Unit>,
    cinecalidadProvider: CinecalidadProvider,
    str: String,
    continuation: Continuation<in `CinecalidadProvider$loadLinks$2`?>?
) : SuspendLambda(2, continuation), Function2<Element, Continuation<in Unit>?, Object> {
    /* synthetic */ val `$callback`: Function1<ExtractorLink, Unit>
    /* synthetic */ val `$data`: String
    /* synthetic */ val `$subtitleCallback`: Function1<SubtitleFile, Unit>

    /* synthetic */
    var `L$0`: Object? = null
    var label = 0
    /* synthetic */ val `this$0`: CinecalidadProvider

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$subtitleCallback` = function1
        `$callback` = function12
        `this$0` = cinecalidadProvider
        `$data` = str
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        val `cinecalidadProvider$loadLinks$2` = `CinecalidadProvider$loadLinks$2`(
            `$subtitleCallback`, `$callback`, `this$0`, `$data`, continuation
        )
        `cinecalidadProvider$loadLinks$2`.`L$0` = obj
        return `cinecalidadProvider$loadLinks$2`
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(element: Element, continuation: Continuation<in Unit>?): Object {
        return (create(element, continuation) as `CinecalidadProvider$loadLinks$2`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val url: String?
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            val url2: String = (`L$0` as Element?)!!.attr("data-option")
            Intrinsics.checkNotNullExpressionValue(url2, "url")
            if (StringsKt.`startsWith$default`(
                    url2,
                    "https://cinestart.net",
                    false,
                    2,
                    null as Object?
                )
            ) {
                `L$0` = url2
                label = 1
                if (Cinestart().getSafeUrl(
                        url2,
                        null,
                        `$subtitleCallback`,
                        `$callback`,
                        this
                    ) === coroutine_suspended
                ) {
                    return coroutine_suspended
                }
            } else {
                `L$0` = url2
                label = 2
                if (ExtractorApiKt.loadExtractor(
                        url2,
                        `this$0`.getMainUrl(),
                        `$subtitleCallback`,
                        `$callback`,
                        this
                    ) === coroutine_suspended
                ) {
                    return coroutine_suspended
                }
            }
            url = url2
        } else if (i == 1 || i == 2) {
            url = `L$0`
            ResultKt.throwOnFailure(obj)
        } else {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        }
        Intrinsics.checkNotNullExpressionValue(url, "url")
        if (StringsKt.`startsWith$default`(
                url,
                "https://cinecalidad.lol",
                false,
                2,
                null as Object?
            )
        ) {
            ParCollections.apmap(
                SequencesKt.toList(
                    SequencesKt.map(
                        Regex.`findAll$default`(
                            Regex("(https:\\/\\/cinecalidad\\.lol\\/play\\/\\?h=[a-zA-Z0-9]{0,8}[a-zA-Z0-9_-]+)"),
                            url,
                            0,
                            2,
                            null
                        ), C47761.INSTANCE
                    )
                ), C47772(
                    `$data`, `this$0`, `$subtitleCallback`, `$callback`, null
                )
            )
        }
        return Unit.INSTANCE
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: CinecalidadProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
        m107d2 = ["<anonymous>", "", "it", "Lkotlin/text/MatchResult;", "invoke"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.movieproviders.CinecalidadProvider$loadLinks$2$1 */ /* loaded from: classes3.dex */
    class C47761 internal constructor() : Lambda<Any?>(1), Function1<MatchResult, String> {
        @Override // kotlin.jvm.functions.Function1
        override fun invoke(it: MatchResult): String {
            Intrinsics.checkNotNullParameter(it, "it")
            return StringsKt.`replace$default`(
                it.value,
                "/play/",
                "/play/r.php",
                false,
                4,
                null as Object?
            )
        }

        companion object {
            val INSTANCE = C47761()
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: CinecalidadProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"],
        m107d2 = ["<anonymous>", "", "", "it", ""],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    @DebugMetadata(
        m99c = "com.lagradost.cloudstream3.movieproviders.CinecalidadProvider\$loadLinks$2$2",
        m98f = "CinecalidadProvider.kt",
        m97i = [],
        m96l = [171],
        m95m = "invokeSuspend",
        m94n = [],
        m93s = []
    ) /* renamed from: com.lagradost.cloudstream3.movieproviders.CinecalidadProvider$loadLinks$2$2 */ /* loaded from: classes3.dex */
    class C47772 internal constructor(/* synthetic */val `$data`: String, /* synthetic */
                                                     val `this$0`: CinecalidadProvider,
                                                     function1: Function1<SubtitleFile, Unit>,
                                                     function12: Function1<ExtractorLink, Unit>,
                                                     continuation: Continuation<in C47772?>?
    ) : SuspendLambda(2, continuation), Function2<String, Continuation<in List<Unit>?>?, Object> {
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
            val c47772 = C47772(`$data`, `this$0`, `$subtitleCallback`, `$callback`, continuation)
            c47772.`L$0` = obj
            return c47772
        }

        @Override // kotlin.jvm.functions.Function2
        /* bridge */ /* synthetic */  override fun invoke(
            str: String,
            continuation: Continuation<in List<Unit>?>?
        ): Object {
            return invoke2(str, continuation)
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        fun invoke2(str: String, continuation: Continuation<in List<Unit>?>?): Object {
            return (create(str, continuation) as C47772).invokeSuspend(Unit.INSTANCE)
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        override fun invokeSuspend(obj: Object): Object {
            val obj2: Object
            val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
            val i = label
            if (i == 0) {
                ResultKt.throwOnFailure(obj)
                val str = `L$0` as String?
                val app: RequestCustom = MainActivityKt.getApp()
                val tuplesArr = arrayOf<Tuples<*, *>>(
                    TuplesKt.m100to<Any, Any>(HttpHeaders.HOST, "cinecalidad.lol"),
                    TuplesKt.m100to<Any, Any>("User-Agent", MainAPIKt.USER_AGENT),
                    TuplesKt.m100to<Any, Any>(
                        "Accept",
                        "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8"
                    ),
                    TuplesKt.m100to<Any, Any>(
                        HttpHeaders.ACCEPT_LANGUAGE, "en-US,en;q=0.5"
                    ),
                    TuplesKt.m100to<Any, Any>(
                        HttpHeaders.DNT, "1"
                    ),
                    TuplesKt.m100to<Any, Any>("Connection", "keep-alive"),
                    TuplesKt.m100to<Any, Any>(
                        HttpHeaders.REFERER, `$data`
                    ),
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
                obj2 = Requests.`get$default`(
                    app,
                    str,
                    MapsKt.mapOf(*tuplesArr),
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
                    2012,
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
            return ParCollections.apmap(
                (obj2 as NiceResponse).getOkhttpResponse().headers()
                    .values(FirebaseAnalytics.Param.LOCATION), C47781(
                    `this$0`, `$subtitleCallback`, `$callback`, null
                )
            )
        }

        /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: CinecalidadProvider.kt */
        @Metadata(
            m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"],
            m107d2 = ["<anonymous>", "", "extractedurl", ""],
            m106k = 3,
            m105mv = [1, 6, 0],
            m103xi = 48
        )
        @DebugMetadata(
            m99c = "com.lagradost.cloudstream3.movieproviders.CinecalidadProvider\$loadLinks$2$2$1",
            m98f = "CinecalidadProvider.kt",
            m97i = [],
            m96l = [190],
            m95m = "invokeSuspend",
            m94n = [],
            m93s = []
        ) /* renamed from: com.lagradost.cloudstream3.movieproviders.CinecalidadProvider$loadLinks$2$2$1 */ /* loaded from: classes3.dex */
        class C47781 internal constructor(/* synthetic */val `this$0`: CinecalidadProvider,
                                                         function1: Function1<SubtitleFile, Unit>,
                                                         function12: Function1<ExtractorLink, Unit>,
                                                         continuation: Continuation<in C47781?>?
        ) : SuspendLambda(2, continuation), Function2<String, Continuation<in Unit>?, Object> {
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
                val c47781 = C47781(`this$0`, `$subtitleCallback`, `$callback`, continuation)
                c47781.`L$0` = obj
                return c47781
            }

            @Override // kotlin.jvm.functions.Function2
            override fun invoke(str: String, continuation: Continuation<in Unit>?): Object {
                return (create(str, continuation) as C47781).invokeSuspend(Unit.INSTANCE)
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            override fun invokeSuspend(obj: Object): Object {
                val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
                val i = label
                if (i == 0) {
                    ResultKt.throwOnFailure(obj)
                    val str = `L$0` as String?
                    if (StringsKt.`contains$default`(
                            str as CharSequence?,
                            "cinestart" as CharSequence,
                            false,
                            2,
                            null as Object?
                        )
                    ) {
                        label = 1
                        if (ExtractorApiKt.loadExtractor(
                                str,
                                `this$0`.getMainUrl(),
                                `$subtitleCallback`,
                                `$callback`,
                                this
                            ) === coroutine_suspended
                        ) {
                            return coroutine_suspended
                        }
                    }
                } else if (i != 1) {
                    throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
                } else {
                    ResultKt.throwOnFailure(obj)
                }
                return Unit.INSTANCE
            }
        }
    }
}