package com.lagradost.cloudstream3.movieproviders

import com.fasterxml.jackson.core.type.TypeReference
import java.util.Date
import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: HDrezkaProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "", "server", "Lcom/lagradost/cloudstream3/movieproviders/HDrezkaProvider\$Server;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.movieproviders.HDrezkaProvider\$loadLinks$2$2",
    m98f = "HDrezkaProvider.kt",
    m97i = [],
    m96l = [345],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* loaded from: classes3.dex */
class `HDrezkaProvider$loadLinks$2$2`(/* synthetic */val `this$0`: HDrezkaProvider, /* synthetic */
                                                     val `$res`: HDrezkaProvider.Data,
                                                     function1: Function1<SubtitleFile?, Unit>,
                                                     function12: Function1<ExtractorLink, Unit>,
                                                     continuation: Continuation<in `HDrezkaProvider$loadLinks$2$2`?>?
) : SuspendLambda(2, continuation),
    Function2<HDrezkaProvider.Server, Continuation<in Unit>?, Object> {
    /* synthetic */ val `$callback`: Function1<ExtractorLink, Unit>
    /* synthetic */ val `$subtitleCallback`: Function1<SubtitleFile?, Unit>

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
        val `hDrezkaProvider$loadLinks$2$2` = `HDrezkaProvider$loadLinks$2$2`(
            `this$0`,
            `$res`,
            `$subtitleCallback`,
            `$callback`,
            continuation
        )
        `hDrezkaProvider$loadLinks$2$2`.`L$0` = obj
        return `hDrezkaProvider$loadLinks$2$2`
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(
        server: HDrezkaProvider.Server,
        continuation: Continuation<in Unit>?
    ): Object {
        return (create(
            server,
            continuation
        ) as `HDrezkaProvider$loadLinks$2$2`).invokeSuspend(Unit.INSTANCE)
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: HDrezkaProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\u008a@"],
        m107d2 = ["<anonymous>", ""],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    @DebugMetadata(
        m99c = "com.lagradost.cloudstream3.movieproviders.HDrezkaProvider\$loadLinks$2$2$1",
        m98f = "HDrezkaProvider.kt",
        m97i = [],
        m96l = [346],
        m95m = "invokeSuspend",
        m94n = [],
        m93s = []
    ) /* renamed from: com.lagradost.cloudstream3.movieproviders.HDrezkaProvider$loadLinks$2$2$1 */ /* loaded from: classes3.dex */
    class C48061 internal constructor(/* synthetic */val `this$0`: HDrezkaProvider, /* synthetic */
                                                     val `$res`: HDrezkaProvider.Data, /* synthetic */
                                                     val `$server`: HDrezkaProvider.Server?,
                                                     function1: Function1<SubtitleFile?, Unit>,
                                                     function12: Function1<ExtractorLink, Unit>,
                                                     continuation: Continuation<in C48061?>?
    ) : SuspendLambda(1, continuation), Function1<Continuation<in Unit>?, Object> {
        /* synthetic */ val `$callback`: Function1<ExtractorLink, Unit>
        /* synthetic */ val `$subtitleCallback`: Function1<SubtitleFile?, Unit>
        var label = 0

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
        init {
            `$subtitleCallback` = function1
            `$callback` = function12
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        override fun create(continuation: Continuation<*>?): Continuation<Unit> {
            return C48061(
                `this$0`,
                `$res`,
                `$server`,
                `$subtitleCallback`,
                `$callback`,
                continuation
            )
        }

        @Override // kotlin.jvm.functions.Function1
        override fun invoke(continuation: Continuation<in Unit>?): Object {
            return (create(continuation) as C48061).invokeSuspend(Unit.INSTANCE)
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        override fun invokeSuspend(obj: Object): Object {
            val `post$default`: Object
            val obj2: Object?
            val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
            val i = label
            if (i == 0) {
                ResultKt.throwOnFailure(obj)
                val app: RequestCustom = MainActivityKt.getApp()
                val str =
                    `this$0`.getMainUrl().toString() + "/ajax/get_cdn_series/?t=" + Date().getTime()
                val mapOf: Map = MapsKt.mapOf(
                    TuplesKt.m100to<Any, Any?>("id", `$res`.id),
                    TuplesKt.m100to<Any, Any?>("translator_id", `$server`.getTranslator_id()),
                    TuplesKt.m100to<Any, Any?>("favs", `$res`.favs),
                    TuplesKt.m100to<Any, Any?>("is_camrip", `$server`.getCamrip()),
                    TuplesKt.m100to<Any, Any?>("is_ads", `$server`.getAds()),
                    TuplesKt.m100to<Any, Any?>("is_director", `$server`.getDirector()),
                    TuplesKt.m100to<Any, Any?>("season", `$res`.season),
                    TuplesKt.m100to<Any, Any?>("episode", `$res`.episode),
                    TuplesKt.m100to<Any, Any?>("action", `$res`.action)
                )
                val linkedHashMap = LinkedHashMap()
                for (entry in mapOf.entrySet()) {
                    if (entry.getValue() as String != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue())
                    }
                }
                val linkedHashMap2: LinkedHashMap = linkedHashMap
                val linkedHashMap3 = LinkedHashMap(MapsKt.mapCapacity(linkedHashMap2.size()))
                for (entry2 in linkedHashMap2.entrySet()) {
                    val key: Object = entry2.getKey()
                    val value: Object = entry2.getValue()
                    Objects.requireNonNull(
                        value,
                        "null cannot be cast to non-null type kotlin.String"
                    )
                    linkedHashMap3.put(key, value as String)
                }
                label = 1
                `post$default` = Requests.`post$default`(
                    app,
                    str,
                    null,
                    `$res`.ref,
                    null,
                    null,
                    linkedHashMap3,
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
                    32730,
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
            obj2 = try {
                Requests.Companion.getMapper().readValue<HDrezkaProvider.Sources>(
                    (`post$default` as NiceResponse).getText(),
                    object :
                        TypeReference<HDrezkaProvider.Sources?>() { // from class: com.lagradost.cloudstream3.movieproviders.HDrezkaProvider$loadLinks$2$2$1$invokeSuspend$$inlined$parsedSafe$1
                    })
            } catch (e: Exception) {
                e.printStackTrace()
                null
            }
            val sources = obj2 as HDrezkaProvider.Sources?
            if (sources != null) {
                `this$0`.invokeSources(
                    String.valueOf(`$server`.getTranslator_name()),
                    sources.url,
                    String.valueOf(sources.subtitle),
                    `$subtitleCallback`,
                    `$callback`
                )
                return Unit.INSTANCE
            }
            return null
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        var obj: Object = obj
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            val hDrezkaProvider = `this$0`
            val data = `$res`
            label = 1
            obj = ArchComponentExt.suspendSafeApiCall<Unit>(
                C48061(
                    hDrezkaProvider,
                    data,
                    `L$0` as HDrezkaProvider.Server?,
                    `$subtitleCallback`,
                    `$callback`,
                    null
                ), this
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