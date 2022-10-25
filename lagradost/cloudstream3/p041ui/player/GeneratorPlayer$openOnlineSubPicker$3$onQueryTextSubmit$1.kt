package com.lagradost.cloudstream3.p041ui.player

import android.app.Dialog
import kotlin.coroutines.Continuation

/* compiled from: GeneratorPlayer.kt */
@Metadata(
    m108d1 = ["\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"],
    m107d2 = ["<anonymous>", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.ui.player.GeneratorPlayer\$openOnlineSubPicker$3\$onQueryTextSubmit$1",
    m98f = "GeneratorPlayer.kt",
    m97i = [],
    m96l = [],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
)
/* renamed from: com.lagradost.cloudstream3.ui.player.GeneratorPlayer$openOnlineSubPicker$3$onQueryTextSubmit$1 */ /* loaded from: classes3.dex */
internal class `GeneratorPlayer$openOnlineSubPicker$3$onQueryTextSubmit$1` constructor(/* synthetic */
    val `$query`: String,
    tempMetaData: TempMetaData,
    objectRef: ObjectRef<String?>,
    l: Long?,
    list: List<OpenSubtitlesApi>,
    generatorPlayer: GeneratorPlayer,
    dialog: Dialog,
    objectRef2: ObjectRef<List<SubtitleEntity?>?>,
    arrayAdapter: ArrayAdapter<String?>,
    continuation: Continuation<in `GeneratorPlayer$openOnlineSubPicker$3$onQueryTextSubmit$1`?>?
) : SuspendLambda(1, continuation), Function1<Continuation<in Unit>?, Object> {
    /* synthetic */ val `$adapter`: ArrayAdapter<String>
    /* synthetic */ val `$currentLanguageTwoLetters`: ObjectRef<String>
    /* synthetic */ val `$currentSubtitles`: ObjectRef<List<SubtitleEntity>>
    /* synthetic */ val `$currentTempMeta`: TempMetaData
    /* synthetic */ val `$dialog`: Dialog
    /* synthetic */ val `$imdbId`: Long?
    /* synthetic */ val `$providers`: List<OpenSubtitlesApi>
    var label: Int = 0
    /* synthetic */ val `this$0`: GeneratorPlayer

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$currentTempMeta` = tempMetaData
        `$currentLanguageTwoLetters` = objectRef
        `$imdbId` = l
        `$providers` = list
        `this$0` = generatorPlayer
        `$dialog` = dialog
        `$currentSubtitles` = objectRef2
        `$adapter` = arrayAdapter
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun create(continuation: Continuation<*>?): Continuation<Unit> {
        return `GeneratorPlayer$openOnlineSubPicker$3$onQueryTextSubmit$1`(
            `$query`,
            `$currentTempMeta`,
            `$currentLanguageTwoLetters`,
            `$imdbId`,
            `$providers`,
            `this$0`,
            `$dialog`,
            `$currentSubtitles`,
            `$adapter`,
            continuation
        )
    }

    @Override // kotlin.jvm.functions.Function1
    public override fun invoke(continuation: Continuation<in Unit>?): Object {
        return (create(continuation) as `GeneratorPlayer$openOnlineSubPicker$3$onQueryTextSubmit$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun invokeSuspend(obj: Object): Object {
        IntrinsicsKt.getCOROUTINE_SUSPENDED()
        if (label == 0) {
            ResultKt.throwOnFailure(obj)
            val str: String? = `$query`
            if (str == null) {
                return Unit.INSTANCE
            }
            val episode: Integer = `$currentTempMeta`.getEpisode()
            val season: Integer = `$currentTempMeta`.getSeason()
            var str2: String? = `$currentLanguageTwoLetters`.element
            if (StringsKt.isBlank(str2)) {
                str2 = null
            }
            val filterNotNull: List = CollectionsKt.filterNotNull(
                ParCollections.apmap(
                    `$providers`,
                    C4870x7c758d06(
                        SubtitleSearch(
                            str,
                            `$imdbId`,
                            str2,
                            episode,
                            season,
                            null,
                            32,
                            null
                        ), null
                    )
                )
            )
            val list: List<List> = filterNotNull
            val arrayList: ArrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10))
            for (list2: List in list) {
                arrayList.add(boxing.boxInt(list2.size()))
            }
            val num: Integer? =
                CollectionsKt.maxOrNull<Comparable<T?>>(arrayList as Iterable<Comparable?>?) as Integer?
            if (num != null) {
                val intValue: Int = num.intValue()
                val arrayList2: ArrayList = ArrayList()
                val size: Int = filterNotNull.size()
                for (i in 0 until intValue) {
                    for (i2 in 0 until size) {
                        val subtitleEntity: SubtitleEntity? = CollectionsKt.getOrNull(
                            filterNotNull.get(i2) as List?,
                            i
                        ) as SubtitleEntity?
                        if (subtitleEntity != null) {
                            arrayList2.add(subtitleEntity)
                        }
                    }
                }
                val activity: FragmentActivity? = `this$0`.getActivity()
                if (activity != null) {
                    val dialog: Dialog = `$dialog`
                    val objectRef: ObjectRef<List<SubtitleEntity>> = `$currentSubtitles`
                    val arrayAdapter: ArrayAdapter<String> = `$adapter`
                    activity.runOnUiThread(object : Runnable() {
                        // from class: com.lagradost.cloudstream3.ui.player.-$$Lambda$GeneratorPlayer$openOnlineSubPicker$3$onQueryTextSubmit$1$Mhumnaby3fFLD3sn8eZdnMlv6nk
                        @Override // java.lang.Runnable
                        fun run() {
                            `m8736invokeSuspend$lambda2`(
                                arrayList2,
                                dialog,
                                objectRef,
                                arrayAdapter
                            )
                        }
                    })
                }
                return Unit.INSTANCE
            }
            return Unit.INSTANCE
        }
        throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: invokeSuspend$lambda-2  reason: not valid java name */
        fun `m8736invokeSuspend$lambda2`(
            arrayList: ArrayList?,
            dialog: Dialog,
            objectRef: ObjectRef<*>?,
            arrayAdapter: ArrayAdapter?
        ) {
            GeneratorPlayer.Companion.`openOnlineSubPicker$setSubtitlesList`(
                objectRef,
                arrayAdapter,
                arrayList
            )
            val contentLoadingProgressBar: ContentLoadingProgressBar? =
                dialog.findViewById(C4761R.C4764id.search_loading_bar) as ContentLoadingProgressBar?
            if (contentLoadingProgressBar != null) {
                contentLoadingProgressBar.hide()
            }
        }
    }
}