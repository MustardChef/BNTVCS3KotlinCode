package com.lagradost.cloudstream3.p041ui.home

import android.content.Context
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
    m99c = "com.lagradost.cloudstream3.ui.home.HomeViewModel\$loadAndCancel$1",
    m98f = "HomeViewModel.kt",
    m97i = [],
    m96l = [],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* renamed from: com.lagradost.cloudstream3.ui.home.HomeViewModel$loadAndCancel$1 */ /* loaded from: classes3.dex */
class `HomeViewModel$loadAndCancel$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(/* synthetic */
    val `$preferredApiName`: String?, /* synthetic */
    val `this$0`: HomeViewModel, continuation: Continuation<in `HomeViewModel$loadAndCancel$1`?>?
) : SuspendLambda(2, continuation), Function2<CoroutineScope, Continuation<in Unit>?, Object> {
    var label: Int = 0

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        return `HomeViewModel$loadAndCancel$1`(`$preferredApiName`, `this$0`, continuation)
    }

    @Override // kotlin.jvm.functions.Function2
    public override fun invoke(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in Unit>?
    ): Object {
        return (create(
            coroutineScope,
            continuation
        ) as `HomeViewModel$loadAndCancel$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun invokeSuspend(obj: Object): Object {
        IntrinsicsKt.getCOROUTINE_SUSPENDED()
        if (label == 0) {
            ResultKt.throwOnFailure(obj)
            val apiFromNameNull: MainAPI? = APIHolder.INSTANCE.getApiFromNameNull(
                `$preferredApiName`
            )
            if (Intrinsics.areEqual(
                    `$preferredApiName`,
                    APIRepository.Companion.Companion.getNoneApi().name
                )
            ) {
                `this$0`.loadAndCancel(APIRepository.Companion.Companion.getNoneApi())
            } else if (!Intrinsics.areEqual(
                    `$preferredApiName`,
                    APIRepository.Companion.Companion.getRandomApi().name
                ) && apiFromNameNull != null
            ) {
                `this$0`.loadAndCancel(apiFromNameNull)
            } else {
                val context: Context? = AcraApplication.Companion.context
                var z: Boolean = true
                val `filterProviderByPreferredMedia$default`: List? =
                    if (context != null) APIHolder.`filterProviderByPreferredMedia$default`(
                        APIHolder.INSTANCE,
                        context,
                        false,
                        1,
                        null
                    ) else null
                val list: List? = `filterProviderByPreferredMedia$default`
                if (list != null && !list.isEmpty()) {
                    z = false
                }
                if (z) {
                    `this$0`.loadAndCancel(APIRepository.Companion.Companion.getNoneApi())
                } else {
                    val mainAPI: MainAPI =
                        CollectionsKt.first<Any>(`filterProviderByPreferredMedia$default` as List<Object?>?) as MainAPI
                    `this$0`.loadAndCancel(mainAPI)
                    AcraApplication.Companion.setKey<Any>(DataStoreKt.HOMEPAGE_API, mainAPI.name)
                }
            }
            return Unit.INSTANCE
        }
        throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
    }
}