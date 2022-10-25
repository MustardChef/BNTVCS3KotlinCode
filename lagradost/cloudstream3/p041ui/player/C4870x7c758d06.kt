package com.lagradost.cloudstream3.p041ui.player

import java.util.List
import kotlin.coroutines.Continuation

/* compiled from: GeneratorPlayer.kt */
@Metadata(
    m108d1 = ["\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/subtitles/AbstractSubtitleEntities\$SubtitleEntity;", "it", "Lcom/lagradost/cloudstream3/syncproviders/providers/OpenSubtitlesApi;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.ui.player.GeneratorPlayer\$openOnlineSubPicker$3\$onQueryTextSubmit$1\$results$1",
    m98f = "GeneratorPlayer.kt",
    m97i = [],
    m96l = [293],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
)
/* renamed from: com.lagradost.cloudstream3.ui.player.GeneratorPlayer$openOnlineSubPicker$3$onQueryTextSubmit$1$results$1 */ /* loaded from: classes3.dex */
internal class C4870x7c758d06 constructor(
    subtitleSearch: SubtitleSearch,
    continuation: Continuation<in C4870x7c758d06?>?
) : SuspendLambda(2, continuation),
    Function2<OpenSubtitlesApi, Continuation<in List<SubtitleEntity?>?>?, Object> {
    /* synthetic */ val `$search`: SubtitleSearch

    /* synthetic */
    var `L$0`: Object? = null
    var label: Int = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$search` = subtitleSearch
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        val c4870x7c758d06: C4870x7c758d06 = C4870x7c758d06(`$search`, continuation)
        c4870x7c758d06.`L$0` = obj
        return c4870x7c758d06
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(
        openSubtitlesApi: OpenSubtitlesApi,
        continuation: Continuation<in List<SubtitleEntity?>?>?
    ): Object {
        return (create(
            openSubtitlesApi,
            continuation
        ) as C4870x7c758d06).invokeSuspend(Unit.INSTANCE)
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */  override fun invoke(
        openSubtitlesApi: OpenSubtitlesApi,
        continuation: Continuation<in List<SubtitleEntity?>?>?
    ): Object {
        return invoke2(openSubtitlesApi, continuation as Continuation<in List<SubtitleEntity?>?>?)
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun invokeSuspend(obj: Object): Object {
        var obj: Object = obj
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i: Int = label
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj)
                val openSubtitlesApi: OpenSubtitlesApi? = `L$0` as OpenSubtitlesApi?
                label = 1
                obj = openSubtitlesApi.search(`$search`, this)
                if (obj === coroutine_suspended) {
                    return coroutine_suspended
                }
            } else if (i != 1) {
                throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
            } else {
                ResultKt.throwOnFailure(obj)
            }
            return obj
        } catch (unused: Exception) {
            return null
        }
    }
}