package com.lagradost.cloudstream3.movieproviders

import com.fasterxml.jackson.core.type.TypeReference
import com.lagradost.cloudstream3.utils.AppUtils
import org.jsoup.nodes.Element
import java.util.Map
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: EstrenosDoramasProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "", TtmlNode.RUBY_CONTAINER, "Lorg/jsoup/nodes/Element;", "kotlin.jvm.PlatformType"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.movieproviders.EstrenosDoramasProvider\$loadLinks$2",
    m98f = "EstrenosDoramasProvider.kt",
    m97i = [0],
    m96l = [192],
    m95m = "invokeSuspend",
    m94n = ["directlink"],
    m93s = ["L$0"]
) /* loaded from: classes3.dex */
class `EstrenosDoramasProvider$loadLinks$2`(/* synthetic */val `this$0`: EstrenosDoramasProvider, /* synthetic */
                                                           val `$data`: String,
                                                           function1: Function1<SubtitleFile, Unit>,
                                                           function12: Function1<ExtractorLink?, Unit>,
                                                           map: Map<String, String>,
                                                           continuation: Continuation<in `EstrenosDoramasProvider$loadLinks$2`?>?
) : SuspendLambda(2, continuation), Function2<Element, Continuation<in Unit>?, Object> {
    /* synthetic */ val `$callback`: Function1<ExtractorLink?, Unit>
    /* synthetic */ val `$headers`: Map<String, String>
    /* synthetic */ val `$subtitleCallback`: Function1<SubtitleFile, Unit>

    /* synthetic */
    var `L$0`: Object? = null
    var label = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$subtitleCallback` = function1
        `$callback` = function12
        `$headers` = map
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        val `estrenosDoramasProvider$loadLinks$2` = `EstrenosDoramasProvider$loadLinks$2`(
            `this$0`, `$data`, `$subtitleCallback`, `$callback`, `$headers`, continuation
        )
        `estrenosDoramasProvider$loadLinks$2`.`L$0` = obj
        return `estrenosDoramasProvider$loadLinks$2`
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(element: Element, continuation: Continuation<in Unit>?): Object {
        return (create(
            element,
            continuation
        ) as `EstrenosDoramasProvider$loadLinks$2`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        val str: String?
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            val attr: String = (`L$0` as Element?)!!.attr("src")
            Intrinsics.checkNotNullExpressionValue(attr, "container.attr(\"src\")")
            val fixUrl: String = MainAPIKt.fixUrl(`this$0`, attr)
            `L$0` = fixUrl
            label = 1
            if (ExtractorApiKt.loadExtractor(
                    fixUrl,
                    `$data`,
                    `$subtitleCallback`,
                    `$callback`,
                    this
                ) === coroutine_suspended
            ) {
                return coroutine_suspended
            }
            str = fixUrl
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            str = `L$0`
            ResultKt.throwOnFailure(obj)
        }
        if (StringsKt.`contains$default`(
                str as CharSequence?,
                "/repro/amz/" as CharSequence,
                false,
                2,
                null as Object?
            )
        ) {
            ParCollections.apmap(
                SequencesKt.toList(
                    SequencesKt.map(
                        Regex.`findAll$default`(
                            Regex("https:\\/\\/repro3\\.estrenosdoramas\\.us\\/repro\\/amz\\/examples\\/.*\\.php\\?key=.*$"),
                            str,
                            0,
                            2,
                            null
                        ), C47971.INSTANCE
                    )
                ), C47982(`$headers`, `this$0`, `$callback`, null)
            )
        }
        if (StringsKt.`contains$default`(
                str as CharSequence?,
                "reproducir14" as CharSequence,
                false,
                2,
                null as Object?
            )
        ) {
            ParCollections.apmap(
                SequencesKt.toList(
                    SequencesKt.map(
                        Regex.`findAll$default`(
                            Regex("(https:\\/\\/repro.\\.estrenosdoramas\\.us\\/repro\\/reproducir14\\.php\\?key=[a-zA-Z0-9]{0,8}[a-zA-Z0-9_-]+)"),
                            str,
                            0,
                            2,
                            null
                        ), C47993.INSTANCE
                    )
                ), C48004(`$headers`, `$data`, `$subtitleCallback`, `$callback`, null)
            )
        }
        if (StringsKt.`contains$default`(
                str as CharSequence?,
                "reproducir120" as CharSequence,
                false,
                2,
                null as Object?
            )
        ) {
            ParCollections.apmap(
                SequencesKt.toList(
                    SequencesKt.map(
                        Regex.`findAll$default`(
                            Regex("(https:\\/\\/repro3.estrenosdoramas.us\\/repro\\/reproducir120\\.php\\?\\nkey=[a-zA-Z0-9]{0,8}[a-zA-Z0-9_-]+)"),
                            str,
                            0,
                            2,
                            null
                        ), C48015.INSTANCE
                    )
                ), C48026(`$headers`, `this$0`, `$callback`, null)
            )
        }
        return Unit.INSTANCE
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: EstrenosDoramasProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
        m107d2 = ["<anonymous>", "", "it", "Lkotlin/text/MatchResult;", "invoke"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.movieproviders.EstrenosDoramasProvider$loadLinks$2$1 */ /* loaded from: classes3.dex */
    class C47971 internal constructor() : Lambda<Any?>(1), Function1<MatchResult, String> {
        @Override // kotlin.jvm.functions.Function1
        override fun invoke(it: MatchResult): String {
            Intrinsics.checkNotNullParameter(it, "it")
            return Regex("https:\\/\\/repro3\\.estrenosdoramas\\.us\\/repro\\/amz\\/examples\\/.*\\.php\\?key=").replace(
                it.value,
                ""
            )
        }

        companion object {
            val INSTANCE = C47971()
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: EstrenosDoramasProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"],
        m107d2 = ["<anonymous>", "", SDKConstants.PARAM_KEY, ""],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    @DebugMetadata(
        m99c = "com.lagradost.cloudstream3.movieproviders.EstrenosDoramasProvider\$loadLinks$2$2",
        m98f = "EstrenosDoramasProvider.kt",
        m97i = [],
        m96l = [199],
        m95m = "invokeSuspend",
        m94n = [],
        m93s = []
    ) /* renamed from: com.lagradost.cloudstream3.movieproviders.EstrenosDoramasProvider$loadLinks$2$2 */ /* loaded from: classes3.dex */
    class C47982 internal constructor(/* synthetic */val `$headers`: Map<String, String>, /* synthetic */
                                                     val `this$0`: EstrenosDoramasProvider,
                                                     function1: Function1<ExtractorLink?, Unit>,
                                                     continuation: Continuation<in C47982?>?
    ) : SuspendLambda(2, continuation), Function2<String, Continuation<in Unit>?, Object> {
        /* synthetic */ val `$callback`: Function1<ExtractorLink?, Unit>

        /* synthetic */
        var `L$0`: Object? = null
        var label = 0

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
        init {
            `$callback` = function1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
            val c47982 = C47982(`$headers`, `this$0`, `$callback`, continuation)
            c47982.`L$0` = obj
            return c47982
        }

        @Override // kotlin.jvm.functions.Function2
        override fun invoke(str: String, continuation: Continuation<in Unit>?): Object {
            return (create(str, continuation) as C47982).invokeSuspend(Unit.INSTANCE)
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        override fun invokeSuspend(obj: Object): Object {
            val `post$default`: Object
            val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
            val i = label
            if (i == 0) {
                ResultKt.throwOnFailure(obj)
                val app: RequestCustom = MainActivityKt.getApp()
                val map = `$headers`
                val tuplesArr = arrayOf<Tuples<*, *>>(
                    Tuples<Any?, Any?>(
                        SDKConstants.PARAM_KEY,
                        `L$0` as String?
                    ), Tuples<Any?, Any?>("token", "MDAwMDAwMDAwMA==")
                )
                label = 1
                `post$default` = Requests.`post$default`(
                    app,
                    "https://repro3.estrenosdoramas.us/repro/amz/examples/player/api/indexDCA.php",
                    map,
                    null,
                    null,
                    null,
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
            val text: String = (`post$default` as NiceResponse).getText()
            val appUtils = AppUtils.INSTANCE
            val base64Decode: String = MainAPIKt.base64Decode(
                (MainAPIKt.getMapper().readValue(
                    text,
                    object :
                        TypeReference<ReproDoramas?>() { // from class: com.lagradost.cloudstream3.movieproviders.EstrenosDoramasProvider$loadLinks$2$2$invokeSuspend$$inlined$parseJson$1
                    }) as ReproDoramas).getLink()
            )
            if (StringsKt.`contains$default`(
                    base64Decode as CharSequence,
                    "m3u8" as CharSequence,
                    false,
                    2,
                    null as Object?
                )
            ) {
                val estrenosDoramasProvider = `this$0`
                estrenosDoramasProvider.cleanExtractor(
                    estrenosDoramasProvider.getName(),
                    `this$0`.getName(),
                    base64Decode,
                    "https://repro3.estrenosdoramas.us",
                    StringsKt.`contains$default`(
                        base64Decode as CharSequence,
                        ".m3u8" as CharSequence,
                        false,
                        2,
                        null as Object?
                    ),
                    `$callback`
                )
            }
            return Unit.INSTANCE
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: EstrenosDoramasProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
        m107d2 = ["<anonymous>", "", "it", "Lkotlin/text/MatchResult;", "invoke"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.movieproviders.EstrenosDoramasProvider$loadLinks$2$3 */ /* loaded from: classes3.dex */
    class C47993 internal constructor() : Lambda<Any?>(1), Function1<MatchResult, String> {
        @Override // kotlin.jvm.functions.Function1
        override fun invoke(it: MatchResult): String {
            Intrinsics.checkNotNullParameter(it, "it")
            return it.value
        }

        companion object {
            val INSTANCE = C47993()
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: EstrenosDoramasProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"],
        m107d2 = ["<anonymous>", "", "it", ""],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    @DebugMetadata(
        m99c = "com.lagradost.cloudstream3.movieproviders.EstrenosDoramasProvider\$loadLinks$2$4",
        m98f = "EstrenosDoramasProvider.kt",
        m97i = [],
        m96l = [bqk.f6562bV, bqk.f6526am, bqk.f6541bA],
        m95m = "invokeSuspend",
        m94n = [],
        m93s = []
    ) /* renamed from: com.lagradost.cloudstream3.movieproviders.EstrenosDoramasProvider$loadLinks$2$4 */ /* loaded from: classes3.dex */
    class C48004 internal constructor(/* synthetic */val `$headers`: Map<String, String>, /* synthetic */
                                                     val `$data`: String,
                                                     function1: Function1<SubtitleFile, Unit>,
                                                     function12: Function1<ExtractorLink?, Unit>,
                                                     continuation: Continuation<in C48004?>?
    ) : SuspendLambda(2, continuation), Function2<String, Continuation<in Boolean?>?, Object> {
        /* synthetic */ val `$callback`: Function1<ExtractorLink?, Unit>
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
            val c48004 = C48004(`$headers`, `$data`, `$subtitleCallback`, `$callback`, continuation)
            c48004.`L$0` = obj
            return c48004
        }

        @Override // kotlin.jvm.functions.Function2
        override fun invoke(str: String, continuation: Continuation<in Boolean?>?): Object {
            return (create(str, continuation) as C48004).invokeSuspend(Unit.INSTANCE)
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0117 A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */   override fun invokeSuspend(r31: Any?): Any {
            /*
                Method dump skipped, instructions count: 281
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.EstrenosDoramasProvider\$loadLinks$2.C48004.invokeSuspend(java.lang.Object):java.lang.Object")
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: EstrenosDoramasProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
        m107d2 = ["<anonymous>", "", "it", "Lkotlin/text/MatchResult;", "invoke"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.movieproviders.EstrenosDoramasProvider$loadLinks$2$5 */ /* loaded from: classes3.dex */
    class C48015 internal constructor() : Lambda<Any?>(1), Function1<MatchResult, String> {
        @Override // kotlin.jvm.functions.Function1
        override fun invoke(it: MatchResult): String {
            Intrinsics.checkNotNullParameter(it, "it")
            return it.value
        }

        companion object {
            val INSTANCE = C48015()
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: EstrenosDoramasProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"],
        m107d2 = ["<anonymous>", "", "it", ""],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    @DebugMetadata(
        m99c = "com.lagradost.cloudstream3.movieproviders.EstrenosDoramasProvider\$loadLinks$2$6",
        m98f = "EstrenosDoramasProvider.kt",
        m97i = [],
        m96l = [bqk.f6602ci, 255],
        m95m = "invokeSuspend",
        m94n = [],
        m93s = []
    ) /* renamed from: com.lagradost.cloudstream3.movieproviders.EstrenosDoramasProvider$loadLinks$2$6 */ /* loaded from: classes3.dex */
    class C48026 internal constructor(/* synthetic */val `$headers`: Map<String, String>, /* synthetic */
                                                     val `this$0`: EstrenosDoramasProvider,
                                                     function1: Function1<ExtractorLink?, Unit>,
                                                     continuation: Continuation<in C48026?>?
    ) : SuspendLambda(2, continuation), Function2<String, Continuation<in Unit>?, Object> {
        /* synthetic */ val `$callback`: Function1<ExtractorLink?, Unit>

        /* synthetic */
        var `L$0`: Object? = null
        var label = 0

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
        init {
            `$callback` = function1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
            val c48026 = C48026(`$headers`, `this$0`, `$callback`, continuation)
            c48026.`L$0` = obj
            return c48026
        }

        @Override // kotlin.jvm.functions.Function2
        override fun invoke(str: String, continuation: Continuation<in Unit>?): Object {
            return (create(str, continuation) as C48026).invokeSuspend(Unit.INSTANCE)
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        override fun invokeSuspend(obj: Object): Object {
            val obj2: Object
            val `post$default`: Object
            val `replace$default`: String
            val `substringBefore$default`: String
            val `substringBefore$default2`: String
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
                if (i == 2) {
                    ResultKt.throwOnFailure(obj)
                    `post$default` = obj
                    val text: String = (`post$default` as NiceResponse).getText()
                    `replace$default` = StringsKt.`replace$default`(
                        StringsKt.`substringBefore$default`(
                            StringsKt.`substringAfter$default`(
                                text,
                                "\"{file:'",
                                null as String?,
                                2,
                                null as Object?
                            ), "',label:", null as String?, 2, null as Object?
                        ), "\\/", "/", false, 4, null as Object?
                    )
                    `substringBefore$default` = StringsKt.`substringBefore$default`(
                        StringsKt.`substringAfter$default`(
                            text,
                            ",label:'",
                            null as String?,
                            2,
                            null as Object?
                        ), "',type:", null as String?, 2, null as Object?
                    )
                    `substringBefore$default2` = StringsKt.`substringBefore$default`(
                        StringsKt.`substringAfter$default`(
                            text,
                            "type: '",
                            null as String?,
                            2,
                            null as Object?
                        ), "'}\"", null as String?, 2, null as Object?
                    )
                    if (!StringsKt.isBlank(`replace$default`) && !StringsKt.contains(
                            `substringBefore$default` as CharSequence,
                            "File not found" as CharSequence,
                            true
                        )
                    ) {
                        val estrenosDoramasProvider = `this$0`
                        estrenosDoramasProvider.cleanExtractor(
                            "Movil",
                            "Movil $`substringBefore$default`",
                            `replace$default`,
                            "",
                            !StringsKt.`contains$default`(
                                `substringBefore$default2` as CharSequence,
                                "mp4" as CharSequence,
                                false,
                                2,
                                null as Object?
                            ),
                            `$callback`
                        )
                    }
                    return Unit.INSTANCE
                }
                throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
            } else {
                ResultKt.throwOnFailure(obj)
                obj2 = obj
            }
            val text2: String = (obj2 as NiceResponse).getText()
            val `substringBefore$default3`: String = StringsKt.`substringBefore$default`(
                StringsKt.`substringAfter$default`(
                    text2,
                    "var videoid = '",
                    null as String?,
                    2,
                    null as Object?
                ), "';", null as String?, 2, null as Object?
            )
            val `substringBefore$default4`: String = StringsKt.`substringBefore$default`(
                StringsKt.`substringAfter$default`(
                    text2,
                    "var tokens = '",
                    null as String?,
                    2,
                    null as Object?
                ), "';", null as String?, 2, null as Object?
            )
            val `substringBefore$default5`: String = StringsKt.`substringBefore$default`(
                StringsKt.`substringAfter$default`(
                    text2,
                    "{ acc: \"",
                    null as String?,
                    2,
                    null as Object?
                ), "\", id:", null as String?, 2, null as Object?
            )
            val app: RequestCustom = MainActivityKt.getApp()
            val map = `$headers`
            val tuplesArr = arrayOf<Tuples<*, *>>(
                Tuples<Any?, Any?>("acc", `substringBefore$default5`),
                Tuples<Any?, Any?>("id", `substringBefore$default3`),
                Tuples<Any?, Any?>("tk", `substringBefore$default4`)
            )
            label = 2
            `post$default` = Requests.`post$default`(
                app,
                "https://repro3.estrenosdoramas.us/repro/api3.php",
                map,
                null,
                null,
                null,
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
                32220,
                null
            )
            if (`post$default` === coroutine_suspended) {
                return coroutine_suspended
            }
            val text3: String = (`post$default` as NiceResponse).getText()
            `replace$default` = StringsKt.`replace$default`(
                StringsKt.`substringBefore$default`(
                    StringsKt.`substringAfter$default`(
                        text3,
                        "\"{file:'",
                        null as String?,
                        2,
                        null as Object?
                    ), "',label:", null as String?, 2, null as Object?
                ), "\\/", "/", false, 4, null as Object?
            )
            `substringBefore$default` = StringsKt.`substringBefore$default`(
                StringsKt.`substringAfter$default`(
                    text3,
                    ",label:'",
                    null as String?,
                    2,
                    null as Object?
                ), "',type:", null as String?, 2, null as Object?
            )
            `substringBefore$default2` = StringsKt.`substringBefore$default`(
                StringsKt.`substringAfter$default`(
                    text3,
                    "type: '",
                    null as String?,
                    2,
                    null as Object?
                ), "'}\"", null as String?, 2, null as Object?
            )
            if (!StringsKt.isBlank(`replace$default`)) {
                val estrenosDoramasProvider2 = `this$0`
                estrenosDoramasProvider2.cleanExtractor(
                    "Movil",
                    "Movil $`substringBefore$default`",
                    `replace$default`,
                    "",
                    !StringsKt.`contains$default`(
                        `substringBefore$default2` as CharSequence,
                        "mp4" as CharSequence,
                        false,
                        2,
                        null as Object?
                    ),
                    `$callback`
                )
            }
            return Unit.INSTANCE
        }
    }
}