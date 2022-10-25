package com.lagradost.cloudstream3.p041ui.download

import android.content.Context
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: DownloadViewModel.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/ui/download/VisualDownloadHeaderCached;", "Lkotlinx/coroutines/CoroutineScope;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.ui.download.DownloadViewModel\$updateList$1\$visual$1",
    m98f = "DownloadViewModel.kt",
    m97i = [],
    m96l = [],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
)
/* renamed from: com.lagradost.cloudstream3.ui.download.DownloadViewModel$updateList$1$visual$1 */ /* loaded from: classes3.dex */
internal class `DownloadViewModel$updateList$1$visual$1` constructor(
    list: List<DownloadHeaderCached>,
    hashMap: HashMap<Integer?, Integer?>,
    hashMap2: HashMap<Integer?, Long?>,
    hashMap3: HashMap<Integer?, Long?>,
    context: Context,
    continuation: Continuation<in `DownloadViewModel$updateList$1$visual$1`?>?
) : SuspendLambda(2, continuation),
    Function2<CoroutineScope, Continuation<in List<VisualDownloadHeaderCached?>?>?, Object> {
    /* synthetic */ val `$cached`: List<DownloadHeaderCached>
    /* synthetic */ val `$context`: Context
    /* synthetic */ val `$currentBytesUsedByChild`: HashMap<Integer, Long>
    /* synthetic */ val `$totalBytesUsedByChild`: HashMap<Integer, Long>
    /* synthetic */ val `$totalDownloads`: HashMap<Integer, Integer>
    var label: Int = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$cached` = list
        `$totalDownloads` = hashMap
        `$totalBytesUsedByChild` = hashMap2
        `$currentBytesUsedByChild` = hashMap3
        `$context` = context
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        return `DownloadViewModel$updateList$1$visual$1`(
            `$cached`,
            `$totalDownloads`,
            `$totalBytesUsedByChild`,
            `$currentBytesUsedByChild`,
            `$context`,
            continuation
        )
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */  override fun invoke(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in List<VisualDownloadHeaderCached?>?>?
    ): Object {
        return invoke2(coroutineScope, continuation)
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in List<VisualDownloadHeaderCached?>?>?
    ): Object {
        return (create(
            coroutineScope,
            continuation
        ) as `DownloadViewModel$updateList$1$visual$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun invokeSuspend(obj: Object): Object {
        var visualDownloadHeaderCached: VisualDownloadHeaderCached?
        var downloadEpisodeCached: DownloadEpisodeCached?
        var obj2: Object?
        var downloadEpisodeCached2: DownloadEpisodeCached?
        var string: String?
        IntrinsicsKt.getCOROUTINE_SUSPENDED()
        if (label != 0) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        }
        ResultKt.throwOnFailure(obj)
        val hashMap: HashMap<Integer, Integer> = `$totalDownloads`
        val hashMap2: HashMap<Integer, Long> = `$totalBytesUsedByChild`
        val hashMap3: HashMap<Integer, Long> = `$currentBytesUsedByChild`
        val context: Context = `$context`
        val arrayList: ArrayList = ArrayList()
        for (downloadHeaderCached: DownloadHeaderCached in `$cached`) {
            var num: Integer? = hashMap.get(boxing.boxInt(downloadHeaderCached.id))
            if (num == null) {
                num = boxing.boxInt(0)
            }
            Intrinsics.checkNotNullExpressionValue(num, "totalDownloads[it.id] ?: 0")
            val intValue: Int = num.intValue()
            var l: Long? = hashMap2.get(boxing.boxInt(downloadHeaderCached.id))
            if (l == null) {
                l = boxing.boxLong(0L)
            }
            Intrinsics.checkNotNullExpressionValue(l, "totalBytesUsedByChild[it.id] ?: 0")
            val longValue: Long = l.longValue()
            var l2: Long? = hashMap3.get(boxing.boxInt(downloadHeaderCached.id))
            if (l2 == null) {
                l2 = boxing.boxLong(0L)
            }
            Intrinsics.checkNotNullExpressionValue(l2, "currentBytesUsedByChild[it.id] ?: 0")
            val longValue2: Long = l2.longValue()
            if (longValue <= 0 || intValue <= 0) {
                visualDownloadHeaderCached = null
            } else {
                if (MainAPIKt.isMovieType(downloadHeaderCached.getType())) {
                    val dataStore: DataStore = DataStore.INSTANCE
                    try {
                        downloadEpisodeCached = null
                        try {
                            string = dataStore.getSharedPrefs(context).getString(
                                dataStore.getFolderName(
                                    DataStoreKt.DOWNLOAD_EPISODE_CACHE,
                                    DataStore.INSTANCE.getFolderName(
                                        String.valueOf(
                                            downloadHeaderCached.id
                                        ), String.valueOf(downloadHeaderCached.id)
                                    )
                                ), null
                            )
                        } catch (unused: Exception) {
                        }
                    } catch (unused2: Exception) {
                        downloadEpisodeCached = null
                    }
                    if (string == null) {
                        obj2 = downloadEpisodeCached
                        downloadEpisodeCached2 = obj2 as DownloadEpisodeCached?
                    } else {
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
                        obj2 = readValue
                        downloadEpisodeCached2 = obj2 as DownloadEpisodeCached?
                    }
                } else {
                    downloadEpisodeCached2 = null
                }
                visualDownloadHeaderCached = VisualDownloadHeaderCached(
                    0,
                    intValue,
                    longValue,
                    longValue2,
                    downloadHeaderCached,
                    downloadEpisodeCached2
                )
            }
            if (visualDownloadHeaderCached != null) {
                arrayList.add(visualDownloadHeaderCached)
            }
        }
        return CollectionsKt.sortedWith(arrayList, object : Comparator() {
            // from class: com.lagradost.cloudstream3.ui.download.DownloadViewModel$updateList$1$visual$1$invokeSuspend$$inlined$sortedBy$1
            @Override // java.util.Comparator
            fun compare(t: T, t2: T): Int {
                var season: Integer
                var season2: Integer
                val visualDownloadHeaderCached2: VisualDownloadHeaderCached = t
                val child: DownloadEpisodeCached? = visualDownloadHeaderCached2.getChild()
                var i: Int = 0
                val episode: Int = if (child != null) child.episode else 0
                val child2: DownloadEpisodeCached? = visualDownloadHeaderCached2.getChild()
                val valueOf: Integer = Integer.valueOf(
                    episode + (if ((child2 == null || (child2.getSeason()
                            .also({ season2 = it })) == null)
                    ) 0 else season2.intValue() * 10000)
                )
                val visualDownloadHeaderCached3: VisualDownloadHeaderCached = t2
                val child3: DownloadEpisodeCached? = visualDownloadHeaderCached3.getChild()
                val episode2: Int = if (child3 != null) child3.episode else 0
                val child4: DownloadEpisodeCached? = visualDownloadHeaderCached3.getChild()
                if (child4 != null && (child4.getSeason().also({ season = it })) != null) {
                    i = season.intValue() * 10000
                }
                return ComparisonsKt.compareValues(valueOf, Integer.valueOf(episode2 + i))
            }
        })
    }
}