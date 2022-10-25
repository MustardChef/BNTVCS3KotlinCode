package com.lagradost.cloudstream3.p041ui.home

import android.util.Log
import com.lagradost.cloudstream3.mvvm.Resource
import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: PageViewModel.kt */
@Metadata(
    m108d1 = ["\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"],
    m107d2 = ["<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.ui.home.PageViewModel\$getPage$1",
    m98f = "PageViewModel.kt",
    m97i = [0],
    m96l = [60],
    m95m = "invokeSuspend",
    m94n = ["response"],
    m93s = ["L$1"]
) /* renamed from: com.lagradost.cloudstream3.ui.home.PageViewModel$getPage$1 */ /* loaded from: classes3.dex */
class `PageViewModel$getPage$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(/* synthetic */
    val `$url`: String?, /* synthetic */
    val `$name`: String?, /* synthetic */
    val `$urlApi`: String?, /* synthetic */
    val `this$0`: PageViewModel, continuation: Continuation<in `PageViewModel$getPage$1`?>?
) : SuspendLambda(2, continuation), Function2<CoroutineScope, Continuation<in Unit>?, Object> {
    var `L$0`: Object? = null
    var `L$1`: Object? = null
    var label: Int = 0

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        return `PageViewModel$getPage$1`(`$url`, `$name`, `$urlApi`, `this$0`, continuation)
    }

    @Override // kotlin.jvm.functions.Function2
    public override fun invoke(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in Unit>?
    ): Object {
        return (create(coroutineScope, continuation) as `PageViewModel$getPage$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun invokeSuspend(obj: Object): Object {
        val apiFromNameNull: MainAPI?
        val pageViewModel: PageViewModel?
        val mutableLiveData: MutableLiveData<*>
        val objectRef: ObjectRef<*>?
        val unit: Unit
        val mutableLiveData2: MutableLiveData<*>
        val mutableLiveData3: MutableLiveData<*>
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i: Int = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            val str: String? = `$url`
            if (!(str == null || str.length() === 0)) {
                val str2: String? = `$name`
                if (!(str2 == null || str2.length() === 0)) {
                    val str3: String? = `$urlApi`
                    if (!(str3 == null || str3.length() === 0)) {
                        Log.d("Blue", "url -> " + `$url` + " - " + `$name` + " - " + `$urlApi`)
                        if (StringsKt.`startsWith$default`(
                                `$urlApi`,
                                "http",
                                false,
                                2,
                                null as Object?
                            )
                        ) {
                            apiFromNameNull = APIHolder.INSTANCE.getApiFromNameNull(
                                APIHolder.INSTANCE.getApiNameFromUrl(
                                    `$urlApi`
                                )
                            )
                        } else {
                            apiFromNameNull = APIHolder.INSTANCE.getApiFromNameNull(`$urlApi`)
                        }
                        if (apiFromNameNull != null) {
                            pageViewModel = `this$0`
                            val str4: String? = `$url`
                            pageViewModel.setRepos(APIRepository(apiFromNameNull, null, 2, null))
                            mutableLiveData = pageViewModel._searchResponse
                            mutableLiveData.postValue(Loading(null, 1, null))
                            ArrayList()
                            val objectRef2: ObjectRef<*> = ObjectRef<Any?>()
                            `L$0` = pageViewModel
                            `L$1` = objectRef2
                            label = 1
                            if (BuildersKt.withContext<Unit>(
                                    Dispatchers.getIO(),
                                    `PageViewModel$getPage$1$1$1`(
                                        objectRef2,
                                        pageViewModel,
                                        str4,
                                        null
                                    ),
                                    this
                                ) === coroutine_suspended
                            ) {
                                return coroutine_suspended
                            }
                            objectRef = objectRef2
                        } else {
                            boxing.boxInt(Log.e("Blue", "Error API NULL"))
                            return Unit.INSTANCE
                        }
                    }
                }
            }
            return Unit.INSTANCE
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            objectRef = `L$1` as ObjectRef<*>?
            pageViewModel = `L$0`
            ResultKt.throwOnFailure(obj)
        }
        val resource: Resource<*>? = objectRef.element
        if (resource != null) {
            mutableLiveData3 = pageViewModel!!._searchResponse
            mutableLiveData3.postValue(resource)
            unit = Unit.INSTANCE
        } else {
            unit = null
        }
        if (unit == null) {
            mutableLiveData2 = pageViewModel!!._searchResponse
            mutableLiveData2.postValue(
                Resource.Failure(
                    false,
                    boxing.boxInt(HttpStatusCodes.HTTP_NOT_FOUND),
                    null,
                    "not found"
                )
            )
        }
        return Unit.INSTANCE
    }
}