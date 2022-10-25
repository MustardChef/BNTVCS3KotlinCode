package com.lagradost.cloudstream3.p041ui.home

import com.lagradost.cloudstream3.p041ui.WatchType
import java.util.ArrayList
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: HomeViewModel.kt */
@Metadata(
    m108d1 = ["\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"],
    m107d2 = ["<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.ui.home.HomeViewModel\$loadStoredData$1",
    m98f = "HomeViewModel.kt",
    m97i = [],
    m96l = [100, 133],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* renamed from: com.lagradost.cloudstream3.ui.home.HomeViewModel$loadStoredData$1 */ /* loaded from: classes3.dex */
class `HomeViewModel$loadStoredData$1` constructor(/* synthetic */val `this$0`: HomeViewModel,
                                                                  enumSet: EnumSet<WatchType?>,
                                                                  continuation: Continuation<in `HomeViewModel$loadStoredData$1`?>?
) : SuspendLambda(2, continuation), Function2<CoroutineScope, Continuation<in Unit>?, Object> {
    /* synthetic */ val `$preferredWatchStatus`: EnumSet<WatchType>
    var label: Int = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$preferredWatchStatus` = enumSet
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        return `HomeViewModel$loadStoredData$1`(`this$0`, `$preferredWatchStatus`, continuation)
    }

    @Override // kotlin.jvm.functions.Function2
    public override fun invoke(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in Unit>?
    ): Object {
        return (create(
            coroutineScope,
            continuation
        ) as `HomeViewModel$loadStoredData$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun invokeSuspend(obj: Object): Object {
        var obj: Object = obj
        val mutableLiveData: MutableLiveData<*>
        val mutableLiveData2: MutableLiveData<*>
        val mutableLiveData3: MutableLiveData<*>
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i: Int = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            label = 1
            obj = BuildersKt.withContext(
                Dispatchers.getIO(),
                `HomeViewModel$loadStoredData$1$watchStatusIds$1`(null),
                this
            )
            if (obj === coroutine_suspended) {
                return coroutine_suspended
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj)
                mutableLiveData3 = `this$0`._bookmarks
                mutableLiveData3.postValue(
                    Tuples<Any?, Any?>(
                        boxing.boxBoolean(true),
                        obj as List?
                    )
                )
                return Unit.INSTANCE
            }
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            ResultKt.throwOnFailure(obj)
        }
        val list: List? = obj
        if (list != null) {
            val hashSet: HashSet = HashSet()
            val arrayList: ArrayList = ArrayList()
            for (obj2: Object? in list) {
                if (hashSet.add(boxing.boxInt(((obj2 as Tuples<*, *>).getFirst() as Number).intValue()))) {
                    arrayList.add(obj2)
                }
            }
            val arrayList2: ArrayList<Tuples<*, *>?> = arrayList
            val length: Int = WatchType.values().size
            val currentWatchTypes: EnumSet = EnumSet.noneOf(WatchType::class.java)
            for (tuples: Tuples<*, *> in arrayList2) {
                currentWatchTypes.add(tuples.getSecond())
                if (currentWatchTypes.size() >= length) {
                    break
                }
            }
            currentWatchTypes.remove(WatchType.NONE)
            if (currentWatchTypes.size() <= 0) {
                mutableLiveData2 = `this$0`._bookmarks
                mutableLiveData2.postValue(
                    Tuples<Any?, Any?>(
                        boxing.boxBoolean(false),
                        ArrayList()
                    )
                )
                return Unit.INSTANCE
            }
            var enumSet: EnumSet<WatchType?> = `$preferredWatchStatus`
            if (enumSet == null) {
                Intrinsics.checkNotNullExpressionValue(currentWatchTypes, "currentWatchTypes")
                enumSet = EnumSet.of(CollectionsKt.first(currentWatchTypes) as Enum?)
            }
            mutableLiveData = `this$0`._availableWatchStatusTypes
            mutableLiveData.postValue(Tuples<Any?, Any?>(enumSet, currentWatchTypes))
            label = 2
            obj = BuildersKt.withContext(
                Dispatchers.getIO(),
                `HomeViewModel$loadStoredData$1$list$1`(arrayList2, enumSet, null),
                this
            )
            if (obj === coroutine_suspended) {
                return coroutine_suspended
            }
            mutableLiveData3 = `this$0`._bookmarks
            mutableLiveData3.postValue(Tuples<Any?, Any?>(boxing.boxBoolean(true), obj as List?))
            return Unit.INSTANCE
        }
        return Unit.INSTANCE
    }
}