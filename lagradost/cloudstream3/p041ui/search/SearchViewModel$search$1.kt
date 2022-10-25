package com.lagradost.cloudstream3.p041ui.search

import com.lagradost.cloudstream3.mvvm.Resource
import java.util.ArrayList
import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: SearchViewModel.kt */
@Metadata(
    m108d1 = ["\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"],
    m107d2 = ["<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.ui.search.SearchViewModel\$search$1",
    m98f = "SearchViewModel.kt",
    m97i = [0],
    m96l = [98],
    m95m = "invokeSuspend",
    m94n = ["currentList"],
    m93s = ["L$0"]
) /* renamed from: com.lagradost.cloudstream3.ui.search.SearchViewModel$search$1 */ /* loaded from: classes4.dex */
class `SearchViewModel$search$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(/* synthetic */
    val `$query`: String, /* synthetic */
    val `this$0`: SearchViewModel, /* synthetic */
    val `$isQuickSearch`: Boolean, /* synthetic */
    val `$ignoreSettings`: Boolean, /* synthetic */
    val `$providersActive`: Set<String>, continuation: Continuation<in `SearchViewModel$search$1`?>?
) : SuspendLambda(2, continuation), Function2<CoroutineScope, Continuation<in Unit>?, Object> {
    var `L$0`: Object? = null
    var label: Int = 0

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        return `SearchViewModel$search$1`(
            `$query`,
            `this$0`,
            `$isQuickSearch`,
            `$ignoreSettings`,
            `$providersActive`,
            continuation
        )
    }

    @Override // kotlin.jvm.functions.Function2
    public override fun invoke(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in Unit>?
    ): Object {
        return (create(coroutineScope, continuation) as `SearchViewModel$search$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun invokeSuspend(obj: Object): Object {
        val mutableLiveData: MutableLiveData<*>
        val mutableLiveData2: MutableLiveData<*>
        val arrayList: ArrayList?
        val mutableLiveData3: MutableLiveData<*>
        val mutableLiveData4: MutableLiveData<*>
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i: Int = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            if (`$query`.length() <= 1) {
                `this$0`.clearSearch()
                return Unit.INSTANCE
            }
            if (!`$isQuickSearch`) {
                val valueOf: String = String.valueOf(`$query`.hashCode())
                AcraApplication.Companion.setKey<SearchHistoryItem>(
                    SearchViewModelKt.SEARCH_HISTORY_KEY,
                    valueOf,
                    SearchHistoryItem(
                        System.currentTimeMillis(),
                        `$query`,
                        CollectionsKt.emptyList<Any>(),
                        valueOf
                    )
                )
            }
            mutableLiveData = `this$0`._searchResponse
            mutableLiveData.postValue(Loading(null, 1, null))
            val arrayList2: ArrayList = ArrayList()
            mutableLiveData2 = `this$0`._currentSearch
            mutableLiveData2.postValue(ArrayList())
            `L$0` = arrayList2
            label = 1
            if (BuildersKt.withContext(
                    Dispatchers.getIO(),
                    C49591(
                        `this$0`,
                        `$ignoreSettings`,
                        `$providersActive`,
                        `$isQuickSearch`,
                        `$query`,
                        arrayList2,
                        null
                    ),
                    this
                ) === coroutine_suspended
            ) {
                return coroutine_suspended
            }
            arrayList = arrayList2
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            arrayList = `L$0` as ArrayList?
            ResultKt.throwOnFailure(obj)
        }
        mutableLiveData3 = `this$0`._currentSearch
        mutableLiveData3.postValue(arrayList)
        val arrayList3: ArrayList = ArrayList()
        val arrayList4: ArrayList<OnGoingSearch>? = arrayList
        val arrayList5: ArrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10))
        for (onGoingSearch: OnGoingSearch in arrayList4) {
            arrayList5.add(onGoingSearch.getData())
        }
        val arrayList6: ArrayList = ArrayList()
        for (obj2: Object? in arrayList5) {
            if (obj2 is Resource.Success<*>) {
                arrayList6.add(obj2)
            }
        }
        val arrayList7: ArrayList<Resource.Success<*>> = arrayList6
        val arrayList8: ArrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10))
        for (success: Resource.Success<*> in arrayList7) {
            arrayList8.add(success.value as List?)
        }
        val arrayList9: ArrayList<List> = arrayList8
        var i2: Int = 0
        while (true) {
            var i3: Int = 0
            for (list: List in arrayList9) {
                if (list.size() > i2) {
                    arrayList3.add(list.get(i2))
                    i3++
                }
            }
            if (i3 == 0) {
                mutableLiveData4 = `this$0`._searchResponse
                mutableLiveData4.postValue(Resource.Success<Any?>(arrayList3))
                return Unit.INSTANCE
            }
            i2++
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: SearchViewModel.kt */
    @Metadata(
        m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"],
        m107d2 = ["<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    @DebugMetadata(
        m99c = "com.lagradost.cloudstream3.ui.search.SearchViewModel\$search$1$1",
        m98f = "SearchViewModel.kt",
        m97i = [],
        m96l = [],
        m95m = "invokeSuspend",
        m94n = [],
        m93s = []
    ) /* renamed from: com.lagradost.cloudstream3.ui.search.SearchViewModel$search$1$1 */ /* loaded from: classes4.dex */
    class C49591 internal constructor(/* synthetic */val `this$0`: SearchViewModel, /* synthetic */
                                                     val `$ignoreSettings`: Boolean, /* synthetic */
                                                     val `$providersActive`: Set<String>, /* synthetic */
                                                     val `$isQuickSearch`: Boolean, /* synthetic */
                                                     val `$query`: String,
                                                     arrayList: ArrayList<OnGoingSearch?>,
                                                     continuation: Continuation<in C49591?>?
    ) : SuspendLambda(2, continuation),
        Function2<CoroutineScope, Continuation<in List<Unit>?>?, Object> {
        /* synthetic */ val `$currentList`: ArrayList<OnGoingSearch>
        var label: Int = 0

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        init {
            `$currentList` = arrayList
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public override fun create(
            obj: Object,
            continuation: Continuation<*>?
        ): Continuation<Unit> {
            return C49591(
                `this$0`,
                `$ignoreSettings`,
                `$providersActive`,
                `$isQuickSearch`,
                `$query`,
                `$currentList`,
                continuation
            )
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */  override fun invoke(
            coroutineScope: CoroutineScope,
            continuation: Continuation<in List<Unit>?>?
        ): Object {
            return invoke2(coroutineScope, continuation)
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        fun invoke2(
            coroutineScope: CoroutineScope,
            continuation: Continuation<in List<Unit>?>?
        ): Object {
            return (create(coroutineScope, continuation) as C49591).invokeSuspend(Unit.INSTANCE)
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public override fun invokeSuspend(obj: Object): Object {
            val list: List?
            IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (label == 0) {
                ResultKt.throwOnFailure(obj)
                list = `this$0`.repos
                val z: Boolean = `$ignoreSettings`
                val set: Set<String> = `$providersActive`
                val z2: Boolean = `$isQuickSearch`
                val arrayList: ArrayList = ArrayList()
                for (obj2: Object in list) {
                    val aPIRepository: APIRepository = obj2 as APIRepository
                    if ((z || set.isEmpty() || set.contains(aPIRepository.getName())) && (!z2 || aPIRepository.getHasQuickSearch())) {
                        arrayList.add(obj2)
                    }
                }
                return ParCollections.apmap(
                    arrayList,
                    C49602(`$isQuickSearch`, `$query`, `$currentList`, `this$0`, null)
                )
            }
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        }

        /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: SearchViewModel.kt */
        @Metadata(
            m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"],
            m107d2 = ["<anonymous>", "", "a", "Lcom/lagradost/cloudstream3/ui/APIRepository;"],
            m106k = 3,
            m105mv = [1, 6, 0],
            m103xi = 48
        )
        @DebugMetadata(
            m99c = "com.lagradost.cloudstream3.ui.search.SearchViewModel\$search$1$1$2",
            m98f = "SearchViewModel.kt",
            m97i = [0, 1],
            m96l = [102, 102],
            m95m = "invokeSuspend",
            m94n = ["a", "a"],
            m93s = ["L$0", "L$0"]
        ) /* renamed from: com.lagradost.cloudstream3.ui.search.SearchViewModel$search$1$1$2 */ /* loaded from: classes4.dex */
        class C49602 internal constructor(/* synthetic */val `$isQuickSearch`: Boolean, /* synthetic */
                                                         val `$query`: String,
                                                         arrayList: ArrayList<OnGoingSearch?>,
                                                         searchViewModel: SearchViewModel,
                                                         continuation: Continuation<in C49602?>?
        ) : SuspendLambda(2, continuation),
            Function2<APIRepository, Continuation<in Unit>?, Object> {
            /* synthetic */ val `$currentList`: ArrayList<OnGoingSearch>

            /* synthetic */
            var `L$0`: Object? = null
            var label: Int = 0
            /* synthetic */ val `this$0`: SearchViewModel

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            init {
                `$currentList` = arrayList
                `this$0` = searchViewModel
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public override fun create(
                obj: Object,
                continuation: Continuation<*>?
            ): Continuation<Unit> {
                val c49602: C49602 =
                    C49602(`$isQuickSearch`, `$query`, `$currentList`, `this$0`, continuation)
                c49602.`L$0` = obj
                return c49602
            }

            @Override // kotlin.jvm.functions.Function2
            public override fun invoke(
                aPIRepository: APIRepository,
                continuation: Continuation<in Unit>?
            ): Object {
                return (create(aPIRepository, continuation) as C49602).invokeSuspend(Unit.INSTANCE)
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public override fun invokeSuspend(obj: Object): Object {
                var obj: Object = obj
                val aPIRepository: APIRepository?
                val resource: Resource<*>
                val mutableLiveData: MutableLiveData<*>
                val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
                val i: Int = label
                if (i == 0) {
                    ResultKt.throwOnFailure(obj)
                    val aPIRepository2: APIRepository? = `L$0` as APIRepository?
                    if (`$isQuickSearch`) {
                        `L$0` = aPIRepository2
                        label = 1
                        val quickSearch: Object = aPIRepository2.quickSearch(`$query`, this)
                        if (quickSearch === coroutine_suspended) {
                            return coroutine_suspended
                        }
                        aPIRepository = aPIRepository2
                        obj = quickSearch
                        resource = obj
                    } else {
                        `L$0` = aPIRepository2
                        label = 2
                        val search: Object = aPIRepository2.search(`$query`, this)
                        if (search === coroutine_suspended) {
                            return coroutine_suspended
                        }
                        aPIRepository = aPIRepository2
                        obj = search
                        resource = obj
                    }
                } else if (i == 1) {
                    aPIRepository = `L$0` as APIRepository?
                    ResultKt.throwOnFailure(obj)
                    resource = obj
                } else if (i == 2) {
                    aPIRepository = `L$0` as APIRepository?
                    ResultKt.throwOnFailure(obj)
                    resource = obj
                } else {
                    throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
                }
                `$currentList`.add(OnGoingSearch(aPIRepository.getName(), resource))
                mutableLiveData = `this$0`._currentSearch
                mutableLiveData.postValue(`$currentList`)
                return Unit.INSTANCE
            }
        }
    }
}