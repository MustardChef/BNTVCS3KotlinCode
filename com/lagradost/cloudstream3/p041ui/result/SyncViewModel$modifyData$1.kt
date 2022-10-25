package com.lagradost.cloudstream3.p041ui.result

import android.util.Log
import com.lagradost.cloudstream3.mvvm.Resource
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: SyncViewModel.kt */
@Metadata(
    m108d1 = ["\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"],
    m107d2 = ["<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.ui.result.SyncViewModel\$modifyData$1",
    m98f = "SyncViewModel.kt",
    m97i = [],
    m96l = [],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* renamed from: com.lagradost.cloudstream3.ui.result.SyncViewModel$modifyData$1 */ /* loaded from: classes4.dex */
class `SyncViewModel$modifyData$1` constructor(/* synthetic */val `this$0`: SyncViewModel,
                                                              function1: Function1<SyncStatus, SyncStatus>,
                                                              continuation: Continuation<in `SyncViewModel$modifyData$1`?>?
) : SuspendLambda(2, continuation), Function2<CoroutineScope, Continuation<in Unit>?, Object> {
    /* synthetic */ val `$update`: Function1<SyncStatus, SyncStatus>
    var label: Int = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$update` = function1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        return `SyncViewModel$modifyData$1`(`this$0`, `$update`, continuation)
    }

    @Override // kotlin.jvm.functions.Function2
    public override fun invoke(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in Unit>?
    ): Object {
        return (create(coroutineScope, continuation) as `SyncViewModel$modifyData$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: SyncViewModel.kt */
    @Metadata(
        m108d1 = ["\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"],
        m107d2 = ["<anonymous>", "", "<name for destructuring parameter 0>", "", ""],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    @DebugMetadata(
        m99c = "com.lagradost.cloudstream3.ui.result.SyncViewModel\$modifyData$1$1",
        m98f = "SyncViewModel.kt",
        m97i = [0, 0],
        m96l = [191, 195],
        m95m = "invokeSuspend",
        m94n = ["id", "repo"],
        m93s = ["L$0", "L$2"]
    ) /* renamed from: com.lagradost.cloudstream3.ui.result.SyncViewModel$modifyData$1$1 */ /* loaded from: classes4.dex */
    class C49541 internal constructor(/* synthetic */val `this$0`: SyncViewModel,
                                                     function1: Function1<SyncStatus, SyncStatus>,
                                                     continuation: Continuation<in C49541?>?
    ) : SuspendLambda(2, continuation),
        Function2<Map.Entry<String?, String?>, Continuation<in Unit>?, Object> {
        /* synthetic */ val `$update`: Function1<SyncStatus, SyncStatus>

        /* synthetic */
        var `L$0`: Object? = null
        var `L$1`: Object? = null
        var `L$2`: Object? = null
        var label: Int = 0

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
        init {
            `$update` = function1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public override fun create(
            obj: Object,
            continuation: Continuation<*>?
        ): Continuation<Unit> {
            val c49541: C49541 = C49541(`this$0`, `$update`, continuation)
            c49541.`L$0` = obj
            return c49541
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */  override fun invoke(
            entry: Map.Entry<String?, String?>,
            continuation: Continuation<in Unit>?
        ): Object {
            return invoke2(entry, continuation)
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        fun invoke2(
            entry: Map.Entry<String?, String?>,
            continuation: Continuation<in Unit>?
        ): Object {
            return (create(entry, continuation) as C49541).invokeSuspend(Unit.INSTANCE)
        }

        /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.Function1] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public override fun invokeSuspend(obj: Object): Object {
            var obj: Object = obj
            val str: String?
            val list: List?
            var obj2: Object?
            val syncRepo: SyncRepo?
            val function1: Function1<SyncStatus, SyncStatus>?
            val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
            val i: Int = label
            if (i == 0) {
                ResultKt.throwOnFailure(obj)
                val entry: Map.Entry? = `L$0`
                str = entry.getValue()
                list = `this$0`.repos
                val it: Iterator = list.iterator()
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null
                        break
                    }
                    obj2 = it.next()
                    if (Intrinsics.areEqual((obj2 as SyncRepo?).idPrefix, entry.getKey())) {
                        break
                    }
                }
                syncRepo = obj2 as SyncRepo?
                if (syncRepo != null) {
                    val function12: Function1<SyncStatus, SyncStatus> = `$update`
                    if (syncRepo.hasAccount()) {
                        `L$0` = str
                        `L$1` = function12
                        `L$2` = syncRepo
                        label = 1
                        val status: Object = syncRepo.getStatus(str, this)
                        if (status === coroutine_suspended) {
                            return coroutine_suspended
                        }
                        function1 = function12
                        obj = status
                    }
                    return Unit.INSTANCE
                }
                return null
            } else if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj)
                    val resource: Resource<*> = obj
                    return Unit.INSTANCE
                }
                throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
            } else {
                syncRepo = `L$2` as SyncRepo?
                function1 = `L$1`
                str = `L$0`
                ResultKt.throwOnFailure(obj)
            }
            val resource2: Resource<*> = obj
            if (resource2 is Resource.Success<*>) {
                val invoke: SyncStatus? = function1!!.invoke(resource2.value)
                if (invoke != null) {
                    Log.i(
                        SyncViewModel.Companion.TAG,
                        "modifyData " + syncRepo.name + " => " + invoke
                    )
                    `L$0` = null
                    `L$1` = null
                    `L$2` = null
                    label = 2
                    obj = syncRepo.score(str, invoke, this)
                    if (obj === coroutine_suspended) {
                        return coroutine_suspended
                    }
                    val resource3: Resource<*> = obj
                }
            } else if (resource2 is Resource.Failure) {
                Log.e(
                    SyncViewModel.Companion.TAG,
                    "modifyData getStatus error " + resource2.errorString
                )
            }
            return Unit.INSTANCE
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun invokeSuspend(obj: Object): Object {
        val map: Map?
        IntrinsicsKt.getCOROUTINE_SUSPENDED()
        if (label == 0) {
            ResultKt.throwOnFailure(obj)
            map = `this$0`.syncs
            ParCollections.apmap(map, C49541(`this$0`, `$update`, null))
            return Unit.INSTANCE
        }
        throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
    }
}