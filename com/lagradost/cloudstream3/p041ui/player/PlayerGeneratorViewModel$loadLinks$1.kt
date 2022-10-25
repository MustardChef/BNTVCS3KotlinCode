package com.lagradost.cloudstream3.p041ui.player

import com.lagradost.cloudstream3.mvvm.Resource
import java.util.LinkedHashSet
import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: PlayerGeneratorViewModel.kt */
@Metadata(
    m108d1 = ["\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"],
    m107d2 = ["<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.ui.player.PlayerGeneratorViewModel\$loadLinks$1",
    m98f = "PlayerGeneratorViewModel.kt",
    m97i = [0, 0],
    m96l = [144],
    m95m = "invokeSuspend",
    m94n = ["currentLinks", "currentSubs"],
    m93s = ["L$0", "L$1"]
) /* renamed from: com.lagradost.cloudstream3.ui.player.PlayerGeneratorViewModel$loadLinks$1 */ /* loaded from: classes3.dex */
class `PlayerGeneratorViewModel$loadLinks$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(/* synthetic */
    val `this$0`: PlayerGeneratorViewModel, /* synthetic */
    val `$clearCache`: Boolean, /* synthetic */
    val `$isCasting`: Boolean,
    continuation: Continuation<in `PlayerGeneratorViewModel$loadLinks$1`?>?
) : SuspendLambda(2, continuation), Function2<CoroutineScope, Continuation<in Unit>?, Object> {
    var `L$0`: Object? = null
    var `L$1`: Object? = null
    var label: Int = 0

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        return `PlayerGeneratorViewModel$loadLinks$1`(
            `this$0`,
            `$clearCache`,
            `$isCasting`,
            continuation
        )
    }

    @Override // kotlin.jvm.functions.Function2
    public override fun invoke(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in Unit>?
    ): Object {
        return (create(
            coroutineScope,
            continuation
        ) as `PlayerGeneratorViewModel$loadLinks$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun invokeSuspend(obj: Object): Object {
        var obj: Object? = obj
        val linkedHashSet: Set?
        val mutableLiveData: MutableLiveData<*>
        val mutableLiveData2: MutableLiveData<*>
        val mutableLiveData3: MutableLiveData<*>
        val set: Set?
        val mutableLiveData4: MutableLiveData<*>
        val mutableLiveData5: MutableLiveData<*>
        val mutableLiveData6: MutableLiveData<*>
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i: Int = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            linkedHashSet = LinkedHashSet()
            val linkedHashSet2: LinkedHashSet = LinkedHashSet()
            mutableLiveData = `this$0`._currentSubs
            mutableLiveData.postValue(linkedHashSet2)
            mutableLiveData2 = `this$0`._currentLinks
            mutableLiveData2.postValue(linkedHashSet)
            mutableLiveData3 = `this$0`._loadingLinks
            mutableLiveData3.postValue(Loading(null, 1, null))
            `L$0` = linkedHashSet
            `L$1` = linkedHashSet2
            label = 1
            val safeApiCall: Object = ArchComponentExt.safeApiCall(
                `PlayerGeneratorViewModel$loadLinks$1$loadingState$1`(
                    `this$0`, `$clearCache`, `$isCasting`, linkedHashSet, linkedHashSet2, null
                ), this
            )
            if (safeApiCall === coroutine_suspended) {
                return coroutine_suspended
            }
            set = linkedHashSet2
            obj = safeApiCall
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            set = `L$1`
            linkedHashSet = `L$0`
            ResultKt.throwOnFailure(obj)
        }
        mutableLiveData4 = `this$0`._loadingLinks
        mutableLiveData4.postValue(obj as Resource<*>?)
        mutableLiveData5 = `this$0`._currentLinks
        mutableLiveData5.postValue(linkedHashSet)
        mutableLiveData6 = `this$0`._currentSubs
        mutableLiveData6.postValue(set)
        return Unit.INSTANCE
    }
}