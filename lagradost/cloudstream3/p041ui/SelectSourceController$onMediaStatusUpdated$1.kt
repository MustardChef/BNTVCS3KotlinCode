package com.lagradost.cloudstream3.p041ui

import com.lagradost.cloudstream3.mvvm.Resource
import com.lagradost.cloudstream3.utils.AppUtils
import java.util.LinkedHashSet
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: ControllerActivity.kt */
@Metadata(
    m108d1 = ["\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"],
    m107d2 = ["<anonymous>", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.ui.SelectSourceController\$onMediaStatusUpdated$1",
    m98f = "ControllerActivity.kt",
    m97i = [0, 0],
    m96l = [296],
    m95m = "invokeSuspend",
    m94n = ["currentLinks", "currentSubs"],
    m93s = ["L$0", "L$1"]
)
/* renamed from: com.lagradost.cloudstream3.ui.SelectSourceController$onMediaStatusUpdated$1 */ /* loaded from: classes.dex */
internal class `SelectSourceController$onMediaStatusUpdated$1` constructor(
    resultEpisode: ResultEpisode,
    metadataHolder: MetadataHolder,
    i: Int,
    selectSourceController: SelectSourceController,
    continuation: Continuation<in `SelectSourceController$onMediaStatusUpdated$1`?>?
) : SuspendLambda(1, continuation), Function1<Continuation<in Unit>?, Object> {
    /* synthetic */ val `$epData`: ResultEpisode
    /* synthetic */ val `$index`: Int
    /* synthetic */ val `$meta`: MetadataHolder
    var `L$0`: Object? = null
    var `L$1`: Object? = null
    var label: Int = 0
    /* synthetic */ val `this$0`: SelectSourceController

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$epData` = resultEpisode
        `$meta` = metadataHolder
        `$index` = i
        `this$0` = selectSourceController
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun create(continuation: Continuation<*>?): Continuation<Unit> {
        return `SelectSourceController$onMediaStatusUpdated$1`(
            `$epData`,
            `$meta`,
            `$index`,
            `this$0`,
            continuation
        )
    }

    @Override // kotlin.jvm.functions.Function1
    public override fun invoke(continuation: Continuation<in Unit>?): Object {
        return (create(continuation) as `SelectSourceController$onMediaStatusUpdated$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun invokeSuspend(obj: Object): Object {
        var obj: Object? = obj
        val linkedHashSet: LinkedHashSet?
        val set: Set?
        val copy: MetadataHolder
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i: Int = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            linkedHashSet = LinkedHashSet()
            val linkedHashSet2: LinkedHashSet = LinkedHashSet()
            `L$0` = linkedHashSet
            `L$1` = linkedHashSet2
            label = 1
            val safeApiCall: Object = ArchComponentExt.safeApiCall(
                `SelectSourceController$onMediaStatusUpdated$1$isSuccessful$1`(
                    RepoLinkGenerator(
                        CollectionsKt.listOf<ResultEpisode>(
                            `$epData`
                        ), 0, null, 6, null
                    ), linkedHashSet, linkedHashSet2, null
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
        val sortUrls: List<ExtractorLink> = MainAPIKt.sortUrls(linkedHashSet)
        val sortSubs: List<SubtitleData> = MainAPIKt.sortSubs(set)
        if (Intrinsics.areEqual(
                obj as Resource<*>?,
                Resource.Success<Any?>(boxing.boxBoolean(true))
            ) && (!linkedHashSet.isEmpty())
        ) {
            copy = r3.copy(
                if ((r18 and 1) !== 0) r3.apiName else null,
                if ((r18 and 2) !== 0) r3.isMovie else false,
                if ((r18 and 4) !== 0) r3.title else null,
                if ((r18 and 8) !== 0) r3.poster else null,
                if ((r18 and 16) !== 0) r3.currentEpisodeIndex else `$index`,
                if ((r18 and 32) !== 0) r3.episodes else null,
                if ((r18 and 64) !== 0) r3.currentLinks else sortUrls,
                if ((r18 and 128) !== 0) `$meta`.currentSubtitles else sortSubs
            )
            val mediaInfo: MediaInfo = CastHelper.INSTANCE.getMediaInfo(
                `$epData`, copy, 0, JSONObject(
                    AppUtils.INSTANCE.toJson(copy)
                ), sortSubs
            )
            val activity: ControllerActivity? = `this$0`.getActivity()
            val selectSourceController: SelectSourceController = `this$0`
            activity.runOnUiThread(object : Runnable() {
                // from class: com.lagradost.cloudstream3.ui.-$$Lambda$SelectSourceController$onMediaStatusUpdated$1$xCQo0Er5qQdTyBAY4mEqeXXvy6k
                @Override // java.lang.Runnable
                fun run() {
                    `m8611invokeSuspend$lambda0`(this@SelectSourceController, mediaInfo)
                }
            })
        }
        return Unit.INSTANCE
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: invokeSuspend$lambda-0  reason: not valid java name */
        fun `m8611invokeSuspend$lambda0`(
            selectSourceController: SelectSourceController,
            mediaInfo: MediaInfo?
        ) {
            val remoteMediaClient: RemoteMediaClient?
            val castHelper: CastHelper = CastHelper.INSTANCE
            remoteMediaClient = selectSourceController.getRemoteMediaClient()
            castHelper.awaitLinks(
                if (remoteMediaClient != null) remoteMediaClient.queueAppendItem(
                    MediaQueueItem.Builder(mediaInfo).build(),
                    JSONObject()
                ) else null, `SelectSourceController$onMediaStatusUpdated$1$1$1`.Companion.INSTANCE
            )
            selectSourceController.setLoadingMore(false)
        }
    }
}