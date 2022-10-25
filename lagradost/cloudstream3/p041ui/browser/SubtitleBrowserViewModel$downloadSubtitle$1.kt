package com.lagradost.cloudstream3.p041ui.browser

import com.lagradost.cloudstream3.mvvm.Resource
import java.util.List
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: SubtitleBrowserViewModel.kt */
@Metadata(
    m108d1 = ["\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"],
    m107d2 = ["<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.ui.browser.SubtitleBrowserViewModel\$downloadSubtitle$1",
    m98f = "SubtitleBrowserViewModel.kt",
    m97i = [],
    m96l = [],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* renamed from: com.lagradost.cloudstream3.ui.browser.SubtitleBrowserViewModel$downloadSubtitle$1 */ /* loaded from: classes.dex */
class `SubtitleBrowserViewModel$downloadSubtitle$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(/* synthetic */
    val `this$0`: SubtitleBrowserViewModel, /* synthetic */
    val `$url`: String?, /* synthetic */
    val `$fileDir`: String,
    continuation: Continuation<in `SubtitleBrowserViewModel$downloadSubtitle$1`?>?
) : SuspendLambda(2, continuation), Function2<CoroutineScope, Continuation<in Unit>?, Object> {
    var label: Int = 0

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        return `SubtitleBrowserViewModel$downloadSubtitle$1`(
            `this$0`,
            `$url`,
            `$fileDir`,
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
        ) as `SubtitleBrowserViewModel$downloadSubtitle$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun invokeSuspend(obj: Object): Object {
        val mutableLiveData: MutableLiveData<*>
        IntrinsicsKt.getCOROUTINE_SUSPENDED()
        if (label == 0) {
            ResultKt.throwOnFailure(obj)
            mutableLiveData = `this$0`._resultResponse
            mutableLiveData.postValue(Loading(`$url`))
            val repo: SubtitleBrowserRepository? = `this$0`.getRepo()
            if (repo != null) {
                repo.downloadSubtitle(`$url`, `$fileDir`, C48401(`this$0`))
            }
            return Unit.INSTANCE
        }
        throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: SubtitleBrowserViewModel.kt */
    @Metadata(
        m108d1 = ["\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"],
        m107d2 = ["<anonymous>", "", "it", "", "", "invoke"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.browser.SubtitleBrowserViewModel$downloadSubtitle$1$1 */ /* loaded from: classes.dex */
    class C48401  /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ internal constructor(  /* synthetic */
        val `this$0`: SubtitleBrowserViewModel
    ) : Lambda<Any?>(1), Function1<List<String?>?, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */  override fun invoke(list: List<String?>?) {
            invoke2(list)
            return Unit.INSTANCE
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        fun invoke2(it: List<String?>?) {
            val mutableLiveData: MutableLiveData<*>
            Intrinsics.checkNotNullParameter(it, "it")
            mutableLiveData = `this$0`._resultResponse
            mutableLiveData.postValue(Resource.Success<Any?>(it))
        }
    }
}