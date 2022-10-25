package com.lagradost.cloudstream3.p041ui.download

import android.content.Context
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: DownloadChildFragment.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/ui/download/VisualDownloadChildCached;", "Lkotlinx/coroutines/CoroutineScope;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.ui.download.DownloadChildFragment\$updateList$1$1\$eps$1",
    m98f = "DownloadChildFragment.kt",
    m97i = [],
    m96l = [],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* renamed from: com.lagradost.cloudstream3.ui.download.DownloadChildFragment$updateList$1$1$eps$1 */ /* loaded from: classes3.dex */
class `DownloadChildFragment$updateList$1$1$eps$1` constructor(/* synthetic */val `$data`: List<String>, /* synthetic */
                                                                              val `this$0`: DownloadChildFragment,
                                                                              context: Context,
                                                                              continuation: Continuation<in `DownloadChildFragment$updateList$1$1$eps$1`?>?
) : SuspendLambda(2, continuation),
    Function2<CoroutineScope, Continuation<in List<VisualDownloadChildCached?>?>?, Object> {
    /* synthetic */ val `$ctx`: Context
    var label: Int = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$ctx` = context
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        return `DownloadChildFragment$updateList$1$1$eps$1`(`$data`, `this$0`, `$ctx`, continuation)
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */  override fun invoke(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in List<VisualDownloadChildCached?>?>?
    ): Object {
        return invoke2(coroutineScope, continuation)
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in List<VisualDownloadChildCached?>?>?
    ): Object {
        return (create(
            coroutineScope,
            continuation
        ) as `DownloadChildFragment$updateList$1$1$eps$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun invokeSuspend(obj: Object): Object {
        IntrinsicsKt.getCOROUTINE_SUSPENDED()
        if (label != 0) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        }
        ResultKt.throwOnFailure(obj)
        val downloadChildFragment: DownloadChildFragment = `this$0`
        val arrayList: ArrayList<DownloadEpisodeCached> = ArrayList()
        val it: Iterator<T> = `$data`.iterator()
        while (true) {
            var downloadEpisodeCached: DownloadEpisodeCached? = null
            if (!it.hasNext()) {
                break
            }
            val context: Context? = downloadChildFragment.getContext()
            if (context != null) {
                val dataStore: DataStore = DataStore.INSTANCE
                try {
                    val string: String? =
                        dataStore.getSharedPrefs(context).getString(it.next(), null)
                    if (string != null) {
                        Intrinsics.checkNotNullExpressionValue(
                            string,
                            "getSharedPrefs().getStri…h, null) ?: return defVal"
                        )
                        val readValue: Object =
                            dataStore.mapper.readValue(string, DownloadEpisodeCached::class.java)
                        Intrinsics.checkNotNullExpressionValue(
                            readValue,
                            "mapper.readValue(this, T::class.java)"
                        )
                        downloadEpisodeCached = readValue
                    }
                } catch (unused: Exception) {
                }
                downloadEpisodeCached = downloadEpisodeCached
            }
            if (downloadEpisodeCached != null) {
                arrayList.add(downloadEpisodeCached)
            }
        }
        val ctx: Context = `$ctx`
        val arrayList2: ArrayList = ArrayList()
        for (downloadEpisodeCached2: DownloadEpisodeCached in arrayList) {
            val videoDownloadManager: VideoDownloadManager = VideoDownloadManager.INSTANCE
            Intrinsics.checkNotNullExpressionValue(ctx, "ctx")
            val downloadFileInfoAndUpdateSettings: DownloadedFileInfoResult? =
                videoDownloadManager.getDownloadFileInfoAndUpdateSettings(
                    ctx,
                    downloadEpisodeCached2.id
                )
            val visualDownloadChildCached: VisualDownloadChildCached? =
                if (downloadFileInfoAndUpdateSettings == null) null else VisualDownloadChildCached(
                    downloadFileInfoAndUpdateSettings.fileLength,
                    downloadFileInfoAndUpdateSettings.totalBytes,
                    downloadEpisodeCached2
                )
            if (visualDownloadChildCached != null) {
                arrayList2.add(visualDownloadChildCached)
            }
        }
        return arrayList2
    }
}