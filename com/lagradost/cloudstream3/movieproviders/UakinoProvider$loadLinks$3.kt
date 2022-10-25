package com.lagradost.cloudstream3.movieproviders

import com.lagradost.cloudstream3.mvvm.Resource
import java.util.ArrayList
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: UakinoProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"],
    m107d2 = ["<anonymous>", "Lcom/lagradost/cloudstream3/mvvm/Resource;", "", "", "link", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.movieproviders.UakinoProvider\$loadLinks$3",
    m98f = "UakinoProvider.kt",
    m97i = [],
    m96l = [152],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* loaded from: classes3.dex */
class `UakinoProvider$loadLinks$3`(/* synthetic */val `this$0`: UakinoProvider,
                                                  function1: Function1<ExtractorLink, Unit>,
                                                  continuation: Continuation<in `UakinoProvider$loadLinks$3`?>?
) : SuspendLambda(2, continuation),
    Function2<String, Continuation<in Resource<out List<Unit>?>?>?, Object> {
    /* synthetic */ val `$callback`: Function1<ExtractorLink, Unit>

    /* synthetic */
    var `L$0`: Object? = null
    var label = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$callback` = function1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        val `uakinoProvider$loadLinks$3` =
            `UakinoProvider$loadLinks$3`(`this$0`, `$callback`, continuation)
        `uakinoProvider$loadLinks$3`.`L$0` = obj
        return `uakinoProvider$loadLinks$3`
    }

    @Override // kotlin.jvm.functions.Function2
    /* bridge */ /* synthetic */  override fun invoke(
        str: String,
        continuation: Continuation<in Resource<out List<Unit>?>?>?
    ): Object {
        return invoke2(str, continuation)
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(str: String, continuation: Continuation<in Resource<out List<Unit>?>?>?): Object {
        return (create(
            str,
            continuation
        ) as `UakinoProvider$loadLinks$3`).invokeSuspend(Unit.INSTANCE)
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: UakinoProvider.kt */
    @Metadata(
        m108d1 = ["\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"],
        m107d2 = ["<anonymous>", "", ""],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    @DebugMetadata(
        m99c = "com.lagradost.cloudstream3.movieproviders.UakinoProvider\$loadLinks$3$1",
        m98f = "UakinoProvider.kt",
        m97i = [],
        m96l = [153],
        m95m = "invokeSuspend",
        m94n = [],
        m93s = []
    ) /* renamed from: com.lagradost.cloudstream3.movieproviders.UakinoProvider$loadLinks$3$1 */ /* loaded from: classes3.dex */
    class C48311 internal constructor(/* synthetic */val `$link`: String?, /* synthetic */
                                                     val `this$0`: UakinoProvider,
                                                     function1: Function1<ExtractorLink, Unit>,
                                                     continuation: Continuation<in C48311?>?
    ) : SuspendLambda(1, continuation), Function1<Continuation<in List<Unit>?>?, Object> {
        /* synthetic */ val `$callback`: Function1<ExtractorLink, Unit>
        var label = 0

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
        init {
            `$callback` = function1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        override fun create(continuation: Continuation<*>?): Continuation<Unit> {
            return C48311(`$link`, `this$0`, `$callback`, continuation)
        }

        @Override // kotlin.jvm.functions.Function1
        /* bridge */ /* synthetic */  override fun invoke(continuation: Continuation<in List<Unit>?>?): Object {
            return invoke2(continuation)
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        fun invoke2(continuation: Continuation<in List<Unit>?>?): Object {
            return (create(continuation) as C48311).invokeSuspend(Unit.INSTANCE)
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        override fun invokeSuspend(obj: Object): Object {
            val obj2: Object
            val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
            val i = label
            if (i == 0) {
                ResultKt.throwOnFailure(obj)
                val app: RequestCustom = MainActivityKt.getApp()
                val str = `$link`
                label = 1
                obj2 = Requests.`get$default`(
                    app,
                    str,
                    null,
                    `this$0`.getMainUrl() + JsonPointer.SEPARATOR,
                    null,
                    null,
                    false,
                    0,
                    null,
                    0L,
                    null,
                    false,
                    this,
                    2042,
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
            val select: Elements = (obj2 as NiceResponse).getDocument().select("script")
            Intrinsics.checkNotNullExpressionValue(
                select,
                "app.get(link, referer = …document.select(\"script\")"
            )
            val elements: Elements = select
            val uakinoProvider = `this$0`
            val function1: Function1<ExtractorLink, Unit> = `$callback`
            val arrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(elements, 10))
            for (element in elements) {
                val data: String = element.data()
                Intrinsics.checkNotNullExpressionValue(data, "script.data()")
                if (StringsKt.`contains$default`(
                        data as CharSequence,
                        "var player = new Playerjs({" as CharSequence,
                        false,
                        2,
                        null as Object?
                    )
                ) {
                    val data2: String = element.data()
                    Intrinsics.checkNotNullExpressionValue(data2, "script.data()")
                    for (obj3 in M3u8Helper.Companion.`generateM3u8$default`(
                        M3u8Helper.Companion,
                        uakinoProvider.getName(),
                        StringsKt.`substringBefore$default`(
                            StringsKt.`substringAfterLast$default`(
                                data2,
                                "file:\"",
                                null as String?,
                                2,
                                null as Object?
                            ), "\",", null as String?, 2, null as Object?
                        ),
                        "https://ashdi.vip/",
                        null,
                        null,
                        null,
                        56,
                        null
                    )) {
                        function1.invoke(obj3)
                    }
                }
                arrayList.add(Unit.INSTANCE)
            }
            return arrayList
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        var obj: Object = obj
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            label = 1
            obj = ArchComponentExt.safeApiCall(
                C48311(`L$0` as String?, `this$0`, `$callback`, null),
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