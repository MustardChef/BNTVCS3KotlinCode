package com.lagradost.cloudstream3.p041ui.livetv

import com.lagradost.cloudstream3.mvvm.Resource
import java.util.List
import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: LiveTvViewModel.kt */
@Metadata(
    m108d1 = ["\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"],
    m107d2 = ["<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.ui.livetv.LiveTvViewModel\$search$1",
    m98f = "LiveTvViewModel.kt",
    m97i = [],
    m96l = [39],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* renamed from: com.lagradost.cloudstream3.ui.livetv.LiveTvViewModel$search$1 */ /* loaded from: classes3.dex */
class `LiveTvViewModel$search$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(/* synthetic */
    val `this$0`: LiveTvViewModel, continuation: Continuation<in `LiveTvViewModel$search$1`?>?
) : SuspendLambda(2, continuation), Function2<CoroutineScope, Continuation<in Unit>?, Object> {
    var label: Int = 0

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        return `LiveTvViewModel$search$1`(`this$0`, continuation)
    }

    @Override // kotlin.jvm.functions.Function2
    public override fun invoke(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in Unit>?
    ): Object {
        return (create(coroutineScope, continuation) as `LiveTvViewModel$search$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun invokeSuspend(obj: Object): Object {
        val mutableLiveData: MutableLiveData<*>
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i: Int = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            mutableLiveData = `this$0`._searchResponse
            mutableLiveData.postValue(Loading(null, 1, null))
            label = 1
            if (BuildersKt.withContext<Unit>(
                    Dispatchers.getIO(),
                    C48641(`this$0`, null),
                    this
                ) === coroutine_suspended
            ) {
                return coroutine_suspended
            }
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            ResultKt.throwOnFailure(obj)
        }
        return Unit.INSTANCE
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: LiveTvViewModel.kt */
    @Metadata(
        m108d1 = ["\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"],
        m107d2 = ["<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    @DebugMetadata(
        m99c = "com.lagradost.cloudstream3.ui.livetv.LiveTvViewModel\$search$1$1",
        m98f = "LiveTvViewModel.kt",
        m97i = [],
        m96l = [40],
        m95m = "invokeSuspend",
        m94n = [],
        m93s = []
    ) /* renamed from: com.lagradost.cloudstream3.ui.livetv.LiveTvViewModel$search$1$1 */ /* loaded from: classes3.dex */
    class C48641  /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ internal constructor(/* synthetic */
        val `this$0`: LiveTvViewModel, continuation: Continuation<in C48641?>?
    ) : SuspendLambda(2, continuation), Function2<CoroutineScope, Continuation<in Unit>?, Object> {
        var label: Int = 0

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public override fun create(
            obj: Object,
            continuation: Continuation<*>?
        ): Continuation<Unit> {
            return C48641(`this$0`, continuation)
        }

        @Override // kotlin.jvm.functions.Function2
        public override fun invoke(
            coroutineScope: CoroutineScope,
            continuation: Continuation<in Unit>?
        ): Object {
            return (create(coroutineScope, continuation) as C48641).invokeSuspend(Unit.INSTANCE)
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public override fun invokeSuspend(obj: Object): Object {
            var obj: Object? = obj
            val mutableLiveData: MutableLiveData<*>
            val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
            val i: Int = label
            if (i == 0) {
                ResultKt.throwOnFailure(obj)
                label = 1
                obj = `this$0`.getIPTV(this)
                if (obj === coroutine_suspended) {
                    return coroutine_suspended
                }
            } else if (i != 1) {
                throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
            } else {
                ResultKt.throwOnFailure(obj)
            }
            mutableLiveData = `this$0`._searchResponse
            mutableLiveData.postValue(Resource.Success<Any?>(obj as List?))
            return Unit.INSTANCE
        }
    }
}