package com.lagradost.cloudstream3.movieproviders

import com.fasterxml.jackson.core.type.TypeReference
import com.google.common.net.HttpHeaders
import com.lagradost.cloudstream3.utils.AppUtils
import org.jsoup.nodes.Element
import java.util.List
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: CuevanaProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "", "it", "Lorg/jsoup/nodes/Element;", "kotlin.jvm.PlatformType"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.movieproviders.CuevanaProvider\$loadLinks$2",
    m98f = "CuevanaProvider.kt",
    m97i = [],
    m96l = [],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* loaded from: classes3.dex */
class `CuevanaProvider$loadLinks$2`(/* synthetic */val `this$0`: CuevanaProvider, /* synthetic */
                                                   val `$data`: String,
                                                   function1: Function1<SubtitleFile, Unit>,
                                                   function12: Function1<ExtractorLink, Unit>,
                                                   continuation: Continuation<in `CuevanaProvider$loadLinks$2`?>?
) : SuspendLambda(2, continuation), Function2<Element, Continuation<in Unit>?, Object> {
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
        val `cuevanaProvider$loadLinks$2` = `CuevanaProvider$loadLinks$2`(
            `this$0`,
            `$data`,
            `$subtitleCallback`,
            `$callback`,
            continuation
        )
        `cuevanaProvider$loadLinks$2`.`L$0` = obj
        return `cuevanaProvider$loadLinks$2`
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(element: Element, continuation: Continuation<in Unit>?): Object {
        return (create(
            element,
            continuation
        ) as `CuevanaProvider$loadLinks$2`).invokeSuspend(Unit.INSTANCE)
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        IntrinsicsKt.getCOROUTINE_SUSPENDED()
        if (label == 0) {
            ResultKt.throwOnFailure(obj)
            val attr: String = (`L$0` as Element?)!!.attr("data-src")
            Intrinsics.checkNotNullExpressionValue(attr, "it.attr(\"data-src\")")
            val fixUrl: String = MainAPIKt.fixUrl(`this$0`, attr)
            if (StringsKt.`contains$default`(
                    fixUrl as CharSequence,
                    "api.cuevana3.me/fembed/" as CharSequence,
                    false,
                    2,
                    null as Object?
                )
            ) {
                ParCollections.apmap(
                    SequencesKt.toList(
                        SequencesKt.map(
                            Regex.`findAll$default`(
                                Regex("(https.\\/\\/api\\.cuevana3\\.me\\/fembed\\/\\?h=[a-zA-Z0-9]{0,8}[a-zA-Z0-9_-]+)"),
                                fixUrl,
                                0,
                                2,
                                null
                            ), C47831.INSTANCE
                        )
                    ), C47842(
                        `$data`, `$subtitleCallback`, `$callback`, null
                    )
                )
            }
            if (StringsKt.`contains$default`(
                    fixUrl as CharSequence,
                    "tomatomatela" as CharSequence,
                    false,
                    2,
                    null as Object?
                )
            ) {
                ParCollections.apmap(
                    SequencesKt.toList(
                        SequencesKt.map(
                            Regex.`findAll$default`(
                                Regex("(\\/\\/apialfa.tomatomatela.com\\/ir\\/player.php\\?h=[a-zA-Z0-9]{0,8}[a-zA-Z0-9_-]+)"),
                                fixUrl,
                                0,
                                2,
                                null
                            ), C47853.INSTANCE
                        )
                    ), C47864(
                        `$data`, `$subtitleCallback`, `$callback`, null
                    )
                )
            }
            return Unit.INSTANCE
        }
        throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: CuevanaProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
        m107d2 = ["<anonymous>", "", "femreg", "Lkotlin/text/MatchResult;", "invoke"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.movieproviders.CuevanaProvider$loadLinks$2$1 */ /* loaded from: classes3.dex */
    class C47831 internal constructor() : Lambda<Any?>(1), Function1<MatchResult, String> {
        @Override // kotlin.jvm.functions.Function1
        override fun invoke(femreg: MatchResult): String {
            Intrinsics.checkNotNullParameter(femreg, "femreg")
            return femreg.value
        }

        companion object {
            val INSTANCE = C47831()
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: CuevanaProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"],
        m107d2 = ["<anonymous>", "", "fem", ""],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    @DebugMetadata(
        m99c = "com.lagradost.cloudstream3.movieproviders.CuevanaProvider\$loadLinks$2$2",
        m98f = "CuevanaProvider.kt",
        m97i = [],
        m96l = [208, bqk.f6596cc],
        m95m = "invokeSuspend",
        m94n = [],
        m93s = []
    ) /* renamed from: com.lagradost.cloudstream3.movieproviders.CuevanaProvider$loadLinks$2$2 */ /* loaded from: classes3.dex */
    class C47842 internal constructor(/* synthetic */val `$data`: String,
                                                     function1: Function1<SubtitleFile, Unit>,
                                                     function12: Function1<ExtractorLink, Unit>,
                                                     continuation: Continuation<in C47842?>?
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
            val c47842 = C47842(`$data`, `$subtitleCallback`, `$callback`, continuation)
            c47842.`L$0` = obj
            return c47842
        }

        @Override // kotlin.jvm.functions.Function2
        override fun invoke(str: String, continuation: Continuation<in Unit>?): Object {
            return (create(str, continuation) as C47842).invokeSuspend(Unit.INSTANCE)
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        override fun invokeSuspend(obj: Object): Object {
            val `post$default`: Object
            val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
            val i = label
            if (i == 0) {
                ResultKt.throwOnFailure(obj)
                val `replace$default`: String = StringsKt.`replace$default`(
                    `L$0` as String?,
                    "https://api.cuevana3.me/fembed/?h=",
                    "",
                    false,
                    4,
                    null as Object?
                )
                val app: RequestCustom = MainActivityKt.getApp()
                val tuplesArr = arrayOf<Tuples<*, *>>(
                    TuplesKt.m100to<Any, Any>(HttpHeaders.HOST, "api.cuevana3.me"),
                    TuplesKt.m100to<Any, Any>("User-Agent", MainAPIKt.USER_AGENT),
                    TuplesKt.m100to<Any, Any>(
                        "Accept",
                        "application/json, text/javascript, */*; q=0.01"
                    ),
                    TuplesKt.m100to<Any, Any>(
                        HttpHeaders.ACCEPT_LANGUAGE, "en-US,en;q=0.5"
                    ),
                    TuplesKt.m100to<Any, Any>(
                        "Content-Type",
                        "application/x-www-form-urlencoded; charset=UTF-8"
                    ),
                    TuplesKt.m100to<Any, Any>(
                        HttpHeaders.X_REQUESTED_WITH, "XMLHttpRequest"
                    ),
                    TuplesKt.m100to<Any, Any>(
                        HttpHeaders.ORIGIN, "https://api.cuevana3.me"
                    ),
                    TuplesKt.m100to<Any, Any>(
                        HttpHeaders.DNT, "1"
                    ),
                    TuplesKt.m100to<Any, Any>("Connection", "keep-alive"),
                    TuplesKt.m100to<Any, Any>(
                        HttpHeaders.SEC_FETCH_DEST, "empty"
                    ),
                    TuplesKt.m100to<Any, Any>(HttpHeaders.SEC_FETCH_MODE, "cors"),
                    TuplesKt.m100to<Any, Any>(
                        HttpHeaders.SEC_FETCH_SITE, HttpHeaders.ReferrerPolicyValues.SAME_ORIGIN
                    )
                )
                label = 1
                `post$default` = Requests.`post$default`(
                    app,
                    "https://api.cuevana3.me/fembed/api.php",
                    MapsKt.mapOf(*tuplesArr),
                    null,
                    null,
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
                    32220,
                    null
                )
                if (`post$default` === coroutine_suspended) {
                    return coroutine_suspended
                }
            } else if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj)
                    return Unit.INSTANCE
                }
                throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
            } else {
                ResultKt.throwOnFailure(obj)
                `post$default` = obj
            }
            val text: String = (`post$default` as NiceResponse).getText()
            val appUtils = AppUtils.INSTANCE
            val url: String = (MainAPIKt.getMapper().readValue(
                text,
                object :
                    TypeReference<Femcuevana?>() { // from class: com.lagradost.cloudstream3.movieproviders.CuevanaProvider$loadLinks$2$2$invokeSuspend$$inlined$parseJson$1
                }) as Femcuevana).getUrl()
            if (StringsKt.`contains$default`(
                    url as CharSequence,
                    "fembed" as CharSequence,
                    false,
                    2,
                    null as Object?
                )
            ) {
                label = 2
                if (ExtractorApiKt.loadExtractor(
                        url,
                        `$data`,
                        `$subtitleCallback`,
                        `$callback`,
                        this
                    ) === coroutine_suspended
                ) {
                    return coroutine_suspended
                }
            }
            return Unit.INSTANCE
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: CuevanaProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
        m107d2 = ["<anonymous>", "", "tomreg", "Lkotlin/text/MatchResult;", "invoke"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.movieproviders.CuevanaProvider$loadLinks$2$3 */ /* loaded from: classes3.dex */
    class C47853 internal constructor() : Lambda<Any?>(1), Function1<MatchResult, String> {
        @Override // kotlin.jvm.functions.Function1
        override fun invoke(tomreg: MatchResult): String {
            Intrinsics.checkNotNullParameter(tomreg, "tomreg")
            return tomreg.value
        }

        companion object {
            val INSTANCE = C47853()
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: CuevanaProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"],
        m107d2 = ["<anonymous>", "", "", "tom", ""],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    @DebugMetadata(
        m99c = "com.lagradost.cloudstream3.movieproviders.CuevanaProvider\$loadLinks$2$4",
        m98f = "CuevanaProvider.kt",
        m97i = [],
        m96l = [241],
        m95m = "invokeSuspend",
        m94n = [],
        m93s = []
    ) /* renamed from: com.lagradost.cloudstream3.movieproviders.CuevanaProvider$loadLinks$2$4 */ /* loaded from: classes3.dex */
    class C47864 internal constructor(/* synthetic */val `$data`: String,
                                                     function1: Function1<SubtitleFile, Unit>,
                                                     function12: Function1<ExtractorLink, Unit>,
                                                     continuation: Continuation<in C47864?>?
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
            val c47864 = C47864(`$data`, `$subtitleCallback`, `$callback`, continuation)
            c47864.`L$0` = obj
            return c47864
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
            return (create(str, continuation) as C47864).invokeSuspend(Unit.INSTANCE)
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        override fun invokeSuspend(obj: Object): Object {
            val `post$default`: Object
            val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
            val i = label
            if (i == 0) {
                ResultKt.throwOnFailure(obj)
                val `replace$default`: String = StringsKt.`replace$default`(
                    `L$0` as String?,
                    "//apialfa.tomatomatela.com/ir/player.php?h=",
                    "",
                    false,
                    4,
                    null as Object?
                )
                val app: RequestCustom = MainActivityKt.getApp()
                val tuplesArr = arrayOf<Tuples<*, *>>(
                    TuplesKt.m100to<Any, Any>(HttpHeaders.HOST, "apialfa.tomatomatela.com"),
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
                    TuplesKt.m100to<Any, Any>("Connection", "keep-alive"),
                    TuplesKt.m100to<Any, Any>("Upgrade-Insecure-Requests", "1"),
                    TuplesKt.m100to<Any, Any>(
                        HttpHeaders.SEC_FETCH_DEST, "iframe"
                    ),
                    TuplesKt.m100to<Any, Any>(HttpHeaders.SEC_FETCH_MODE, "navigate"),
                    TuplesKt.m100to<Any, Any>(
                        HttpHeaders.SEC_FETCH_SITE, HttpHeaders.ReferrerPolicyValues.SAME_ORIGIN
                    )
                )
                label = 1
                `post$default` = Requests.`post$default`(
                    app,
                    "https://apialfa.tomatomatela.com/ir/rd.php",
                    MapsKt.mapOf(*tuplesArr),
                    null,
                    null,
                    null,
                    MapsKt.mapOf(Tuples<Any?, Any?>("url", `replace$default`)),
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
                    .values(FirebaseAnalytics.Param.LOCATION), C47871(
                    `$data`, `$subtitleCallback`, `$callback`, null
                )
            )
        }

        /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: CuevanaProvider.kt */
        @Metadata(
            m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"],
            m107d2 = ["<anonymous>", "", "loc", ""],
            m106k = 3,
            m105mv = [1, 6, 0],
            m103xi = 48
        )
        @DebugMetadata(
            m99c = "com.lagradost.cloudstream3.movieproviders.CuevanaProvider\$loadLinks$2$4$1",
            m98f = "CuevanaProvider.kt",
            m97i = [],
            m96l = [],
            m95m = "invokeSuspend",
            m94n = [],
            m93s = []
        ) /* renamed from: com.lagradost.cloudstream3.movieproviders.CuevanaProvider$loadLinks$2$4$1 */ /* loaded from: classes3.dex */
        class C47871 internal constructor(/* synthetic */val `$data`: String,
                                                         function1: Function1<SubtitleFile, Unit>,
                                                         function12: Function1<ExtractorLink, Unit>,
                                                         continuation: Continuation<in C47871?>?
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
                val c47871 = C47871(`$data`, `$subtitleCallback`, `$callback`, continuation)
                c47871.`L$0` = obj
                return c47871
            }

            @Override // kotlin.jvm.functions.Function2
            override fun invoke(str: String, continuation: Continuation<in Unit>?): Object {
                return (create(str, continuation) as C47871).invokeSuspend(Unit.INSTANCE)
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            override fun invokeSuspend(obj: Object): Object {
                IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (label == 0) {
                    ResultKt.throwOnFailure(obj)
                    val str = `L$0` as String?
                    if (StringsKt.`contains$default`(
                            str as CharSequence?,
                            "goto_ddh.php" as CharSequence,
                            false,
                            2,
                            null as Object?
                        )
                    ) {
                        ParCollections.apmap(
                            SequencesKt.toList(
                                SequencesKt.map(
                                    Regex.`findAll$default`(
                                        Regex("(\\/\\/api.cuevana3.me\\/ir\\/goto_ddh.php\\?h=[a-zA-Z0-9]{0,8}[a-zA-Z0-9_-]+)"),
                                        str,
                                        0,
                                        2,
                                        null
                                    ), C47881.INSTANCE
                                )
                            ), C47892(
                                `$data`, `$subtitleCallback`, `$callback`, null
                            )
                        )
                    }
                    if (StringsKt.`contains$default`(
                            str as CharSequence?,
                            "index.php?h=" as CharSequence,
                            false,
                            2,
                            null as Object?
                        )
                    ) {
                        ParCollections.apmap(
                            SequencesKt.toList(
                                SequencesKt.map(
                                    Regex.`findAll$default`(
                                        Regex("(\\/\\/api.cuevana3.me\\/sc\\/index.php\\?h=[a-zA-Z0-9]{0,8}[a-zA-Z0-9_-]+)"),
                                        str,
                                        0,
                                        2,
                                        null
                                    ), C47913.INSTANCE
                                )
                            ), C47924(
                                `$data`, `$subtitleCallback`, `$callback`, null
                            )
                        )
                    }
                    return Unit.INSTANCE
                }
                throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
            }

            /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: CuevanaProvider.kt */
            @Metadata(
                m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
                m107d2 = ["<anonymous>", "", "goreg", "Lkotlin/text/MatchResult;", "invoke"],
                m106k = 3,
                m105mv = [1, 6, 0],
                m103xi = 48
            ) /* renamed from: com.lagradost.cloudstream3.movieproviders.CuevanaProvider$loadLinks$2$4$1$1 */ /* loaded from: classes3.dex */
            class C47881 internal constructor() : Lambda<Any?>(1), Function1<MatchResult, String> {
                @Override // kotlin.jvm.functions.Function1
                override fun invoke(goreg: MatchResult): String {
                    Intrinsics.checkNotNullParameter(goreg, "goreg")
                    return StringsKt.`replace$default`(
                        goreg.value,
                        "//api.cuevana3.me/ir/goto_ddh.php?h=",
                        "",
                        false,
                        4,
                        null as Object?
                    )
                }

                companion object {
                    val INSTANCE = C47881()
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: CuevanaProvider.kt */
            @Metadata(
                m108d1 = ["\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"],
                m107d2 = ["<anonymous>", "", "", "gotolink", ""],
                m106k = 3,
                m105mv = [1, 6, 0],
                m103xi = 48
            )
            @DebugMetadata(
                m99c = "com.lagradost.cloudstream3.movieproviders.CuevanaProvider\$loadLinks$2$4$1$2",
                m98f = "CuevanaProvider.kt",
                m97i = [],
                m96l = [bqk.f6615cv],
                m95m = "invokeSuspend",
                m94n = [],
                m93s = []
            ) /* renamed from: com.lagradost.cloudstream3.movieproviders.CuevanaProvider$loadLinks$2$4$1$2 */ /* loaded from: classes3.dex */
            class C47892 internal constructor(/* synthetic */val `$data`: String,
                                                             function1: Function1<SubtitleFile, Unit>,
                                                             function12: Function1<ExtractorLink, Unit>,
                                                             continuation: Continuation<in C47892?>?
            ) : SuspendLambda(2, continuation),
                Function2<String, Continuation<in List<Boolean?>?>?, Object> {
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
                override fun create(
                    obj: Object,
                    continuation: Continuation<*>?
                ): Continuation<Unit> {
                    val c47892 = C47892(`$data`, `$subtitleCallback`, `$callback`, continuation)
                    c47892.`L$0` = obj
                    return c47892
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
                    return (create(str, continuation) as C47892).invokeSuspend(Unit.INSTANCE)
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                override fun invokeSuspend(obj: Object): Object {
                    val `post$default`: Object
                    val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    val i = label
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj)
                        val app: RequestCustom = MainActivityKt.getApp()
                        val tuplesArr = arrayOf<Tuples<*, *>>(
                            TuplesKt.m100to<Any, Any>(
                                HttpHeaders.HOST, "api.cuevana3.me"
                            ),
                            TuplesKt.m100to<Any, Any>("User-Agent", MainAPIKt.USER_AGENT),
                            TuplesKt.m100to<Any, Any>(
                                "Accept",
                                "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8"
                            ),
                            TuplesKt.m100to<Any, Any>(
                                HttpHeaders.ACCEPT_LANGUAGE, "en-US,en;q=0.5"
                            ),
                            TuplesKt.m100to<Any, Any>(
                                "Content-Type",
                                "application/x-www-form-urlencoded"
                            ),
                            TuplesKt.m100to<Any, Any>(
                                HttpHeaders.ORIGIN, "null"
                            ),
                            TuplesKt.m100to<Any, Any>(HttpHeaders.DNT, "1"),
                            TuplesKt.m100to<Any, Any>("Connection", "keep-alive"),
                            TuplesKt.m100to<Any, Any>("Upgrade-Insecure-Requests", "1"),
                            TuplesKt.m100to<Any, Any>(
                                HttpHeaders.SEC_FETCH_DEST, "iframe"
                            ),
                            TuplesKt.m100to<Any, Any>(
                                HttpHeaders.SEC_FETCH_MODE, "navigate"
                            ),
                            TuplesKt.m100to<Any, Any>(
                                HttpHeaders.SEC_FETCH_SITE,
                                HttpHeaders.ReferrerPolicyValues.SAME_ORIGIN
                            )
                        )
                        label = 1
                        `post$default` = Requests.`post$default`(
                            app,
                            "https://api.cuevana3.me/ir/redirect_ddh.php",
                            MapsKt.mapOf(*tuplesArr),
                            null,
                            null,
                            null,
                            MapsKt.mapOf(Tuples<Any?, Any?>("url", `L$0` as String?)),
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
                            .values(FirebaseAnalytics.Param.LOCATION), C47901(
                            `$data`, `$subtitleCallback`, `$callback`, null
                        )
                    )
                }

                /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: CuevanaProvider.kt */
                @Metadata(
                    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"],
                    m107d2 = ["<anonymous>", "", "golink", ""],
                    m106k = 3,
                    m105mv = [1, 6, 0],
                    m103xi = 48
                )
                @DebugMetadata(
                    m99c = "com.lagradost.cloudstream3.movieproviders.CuevanaProvider\$loadLinks$2$4$1$2$1",
                    m98f = "CuevanaProvider.kt",
                    m97i = [],
                    m96l = [284],
                    m95m = "invokeSuspend",
                    m94n = [],
                    m93s = []
                ) /* renamed from: com.lagradost.cloudstream3.movieproviders.CuevanaProvider$loadLinks$2$4$1$2$1 */ /* loaded from: classes3.dex */
                class C47901 internal constructor(/* synthetic */val `$data`: String,
                                                                 function1: Function1<SubtitleFile, Unit>,
                                                                 function12: Function1<ExtractorLink, Unit>,
                                                                 continuation: Continuation<in C47901?>?
                ) : SuspendLambda(2, continuation),
                    Function2<String, Continuation<in Boolean?>?, Object> {
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
                    override fun create(
                        obj: Object,
                        continuation: Continuation<*>?
                    ): Continuation<Unit> {
                        val c47901 = C47901(`$data`, `$subtitleCallback`, `$callback`, continuation)
                        c47901.`L$0` = obj
                        return c47901
                    }

                    @Override // kotlin.jvm.functions.Function2
                    override fun invoke(
                        str: String,
                        continuation: Continuation<in Boolean?>?
                    ): Object {
                        return (create(str, continuation) as C47901).invokeSuspend(Unit.INSTANCE)
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

            /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: CuevanaProvider.kt */
            @Metadata(
                m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
                m107d2 = ["<anonymous>", "", "indreg", "Lkotlin/text/MatchResult;", "invoke"],
                m106k = 3,
                m105mv = [1, 6, 0],
                m103xi = 48
            ) /* renamed from: com.lagradost.cloudstream3.movieproviders.CuevanaProvider$loadLinks$2$4$1$3 */ /* loaded from: classes3.dex */
            class C47913 internal constructor() : Lambda<Any?>(1), Function1<MatchResult, String> {
                @Override // kotlin.jvm.functions.Function1
                override fun invoke(indreg: MatchResult): String {
                    Intrinsics.checkNotNullParameter(indreg, "indreg")
                    return StringsKt.`replace$default`(
                        indreg.value,
                        "//api.cuevana3.me/sc/index.php?h=",
                        "",
                        false,
                        4,
                        null as Object?
                    )
                }

                companion object {
                    val INSTANCE = C47913()
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: CuevanaProvider.kt */
            @Metadata(
                m108d1 = ["\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"],
                m107d2 = ["<anonymous>", "", "", "inlink", ""],
                m106k = 3,
                m105mv = [1, 6, 0],
                m103xi = 48
            )
            @DebugMetadata(
                m99c = "com.lagradost.cloudstream3.movieproviders.CuevanaProvider\$loadLinks$2$4$1$4",
                m98f = "CuevanaProvider.kt",
                m97i = [],
                m96l = [294],
                m95m = "invokeSuspend",
                m94n = [],
                m93s = []
            ) /* renamed from: com.lagradost.cloudstream3.movieproviders.CuevanaProvider$loadLinks$2$4$1$4 */ /* loaded from: classes3.dex */
            class C47924 internal constructor(/* synthetic */val `$data`: String,
                                                             function1: Function1<SubtitleFile, Unit>,
                                                             function12: Function1<ExtractorLink, Unit>,
                                                             continuation: Continuation<in C47924?>?
            ) : SuspendLambda(2, continuation),
                Function2<String, Continuation<in List<Boolean?>?>?, Object> {
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
                override fun create(
                    obj: Object,
                    continuation: Continuation<*>?
                ): Continuation<Unit> {
                    val c47924 = C47924(`$data`, `$subtitleCallback`, `$callback`, continuation)
                    c47924.`L$0` = obj
                    return c47924
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
                    return (create(str, continuation) as C47924).invokeSuspend(Unit.INSTANCE)
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                override fun invokeSuspend(obj: Object): Object {
                    val `post$default`: Object
                    val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    val i = label
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj)
                        val app: RequestCustom = MainActivityKt.getApp()
                        val tuplesArr = arrayOf<Tuples<*, *>>(
                            TuplesKt.m100to<Any, Any>(
                                HttpHeaders.HOST, "api.cuevana3.me"
                            ),
                            TuplesKt.m100to<Any, Any>("User-Agent", MainAPIKt.USER_AGENT),
                            TuplesKt.m100to<Any, Any>(
                                "Accept",
                                "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8"
                            ),
                            TuplesKt.m100to<Any, Any>(
                                HttpHeaders.ACCEPT_LANGUAGE, "en-US,en;q=0.5"
                            ),
                            TuplesKt.m100to<Any, Any>(
                                HttpHeaders.ACCEPT_ENCODING, "gzip, deflate, br"
                            ),
                            TuplesKt.m100to<Any, Any>(
                                "Content-Type",
                                "application/x-www-form-urlencoded"
                            ),
                            TuplesKt.m100to<Any, Any>(
                                HttpHeaders.ORIGIN, "null"
                            ),
                            TuplesKt.m100to<Any, Any>(HttpHeaders.DNT, "1"),
                            TuplesKt.m100to<Any, Any>("Connection", "keep-alive"),
                            TuplesKt.m100to<Any, Any>("Upgrade-Insecure-Requests", "1"),
                            TuplesKt.m100to<Any, Any>(
                                HttpHeaders.SEC_FETCH_DEST, "iframe"
                            ),
                            TuplesKt.m100to<Any, Any>(
                                HttpHeaders.SEC_FETCH_MODE, "navigate"
                            ),
                            TuplesKt.m100to<Any, Any>(
                                HttpHeaders.SEC_FETCH_SITE,
                                HttpHeaders.ReferrerPolicyValues.SAME_ORIGIN
                            ),
                            TuplesKt.m100to<Any, Any>(
                                HttpHeaders.SEC_FETCH_USER, "?1"
                            )
                        )
                        label = 1
                        `post$default` = Requests.`post$default`(
                            app,
                            "https://api.cuevana3.me/sc/r.php",
                            MapsKt.mapOf(*tuplesArr),
                            null,
                            null,
                            null,
                            MapsKt.mapOf(Tuples<Any?, Any?>("h", `L$0` as String?)),
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
                            .values(FirebaseAnalytics.Param.LOCATION), C47931(
                            `$data`, `$subtitleCallback`, `$callback`, null
                        )
                    )
                }

                /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: CuevanaProvider.kt */
                @Metadata(
                    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"],
                    m107d2 = ["<anonymous>", "", "link", ""],
                    m106k = 3,
                    m105mv = [1, 6, 0],
                    m103xi = 48
                )
                @DebugMetadata(
                    m99c = "com.lagradost.cloudstream3.movieproviders.CuevanaProvider\$loadLinks$2$4$1$4$1",
                    m98f = "CuevanaProvider.kt",
                    m97i = [],
                    m96l = [314],
                    m95m = "invokeSuspend",
                    m94n = [],
                    m93s = []
                ) /* renamed from: com.lagradost.cloudstream3.movieproviders.CuevanaProvider$loadLinks$2$4$1$4$1 */ /* loaded from: classes3.dex */
                class C47931 internal constructor(/* synthetic */val `$data`: String,
                                                                 function1: Function1<SubtitleFile, Unit>,
                                                                 function12: Function1<ExtractorLink, Unit>,
                                                                 continuation: Continuation<in C47931?>?
                ) : SuspendLambda(2, continuation),
                    Function2<String, Continuation<in Boolean?>?, Object> {
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
                    override fun create(
                        obj: Object,
                        continuation: Continuation<*>?
                    ): Continuation<Unit> {
                        val c47931 = C47931(`$data`, `$subtitleCallback`, `$callback`, continuation)
                        c47931.`L$0` = obj
                        return c47931
                    }

                    @Override // kotlin.jvm.functions.Function2
                    override fun invoke(
                        str: String,
                        continuation: Continuation<in Boolean?>?
                    ): Object {
                        return (create(str, continuation) as C47931).invokeSuspend(Unit.INSTANCE)
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
    }
}