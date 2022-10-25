package com.lagradost.cloudstream3.p041ui.download

import android.content.Context
import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: DownloadViewModel.kt */
@Metadata(
    m108d1 = ["\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"],
    m107d2 = ["<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.ui.download.DownloadViewModel\$updateList$1",
    m98f = "DownloadViewModel.kt",
    m97i = [1, 1, 1, 2, 2, 2],
    m96l = [41, 56, 70, 79],
    m95m = "invokeSuspend",
    m94n = ["totalBytesUsedByChild", "currentBytesUsedByChild", "totalDownloads", "totalBytesUsedByChild", "currentBytesUsedByChild", "totalDownloads"],
    m93s = ["L$0", "L$1", "L$2", "L$0", "L$1", "L$2"]
) /* renamed from: com.lagradost.cloudstream3.ui.download.DownloadViewModel$updateList$1 */ /* loaded from: classes3.dex */
class `DownloadViewModel$updateList$1` constructor(/* synthetic */val `this$0`: DownloadViewModel,
                                                                  context: Context?,
                                                                  continuation: Continuation<in `DownloadViewModel$updateList$1`?>?
) : SuspendLambda(2, continuation), Function2<CoroutineScope, Continuation<in Unit>?, Object> {
    /* synthetic */ val `$context`: Context?
    var `L$0`: Object? = null
    var `L$1`: Object? = null
    var `L$2`: Object? = null
    var label: Int = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$context` = context
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        return `DownloadViewModel$updateList$1`(`this$0`, `$context`, continuation)
    }

    @Override // kotlin.jvm.functions.Function2
    public override fun invoke(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in Unit>?
    ): Object {
        return (create(
            coroutineScope,
            continuation
        ) as `DownloadViewModel$updateList$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d3 A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:24:0x00d4  */ /* JADX WARN: Removed duplicated region for block: B:27:0x00fd A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:31:0x012a A[LOOP:0: B:29:0x0124->B:31:0x012a, LOOP_END] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */ public override fun invokeSuspend(r19: Any?): Any {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.p041ui.download.DownloadViewModel\$updateList$1.invokeSuspend(java.lang.Object):java.lang.Object")
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: DownloadViewModel.kt */
    @Metadata(
        m108d1 = ["\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"],
        m107d2 = ["<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    @DebugMetadata(
        m99c = "com.lagradost.cloudstream3.ui.download.DownloadViewModel\$updateList$1$1",
        m98f = "DownloadViewModel.kt",
        m97i = [],
        m96l = [],
        m95m = "invokeSuspend",
        m94n = [],
        m93s = []
    ) /* renamed from: com.lagradost.cloudstream3.ui.download.DownloadViewModel$updateList$1$1 */ /* loaded from: classes3.dex */
    class C48471 internal constructor(
        list: List<DownloadEpisodeCached>,
        context: Context,
        hashMap: HashMap<Integer?, Long?>,
        hashMap2: HashMap<Integer?, Long?>,
        hashMap3: HashMap<Integer?, Integer?>,
        continuation: Continuation<in C48471?>?
    ) : SuspendLambda(2, continuation), Function2<CoroutineScope, Continuation<in Unit>?, Object> {
        /* synthetic */ val `$children`: List<DownloadEpisodeCached>
        /* synthetic */ val `$context`: Context
        /* synthetic */ val `$currentBytesUsedByChild`: HashMap<Integer, Long>
        /* synthetic */ val `$totalBytesUsedByChild`: HashMap<Integer, Long>
        /* synthetic */ val `$totalDownloads`: HashMap<Integer, Integer>
        var label: Int = 0

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        init {
            `$children` = list
            `$context` = context
            `$totalBytesUsedByChild` = hashMap
            `$currentBytesUsedByChild` = hashMap2
            `$totalDownloads` = hashMap3
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public override fun create(
            obj: Object,
            continuation: Continuation<*>?
        ): Continuation<Unit> {
            return C48471(
                `$children`,
                `$context`,
                `$totalBytesUsedByChild`,
                `$currentBytesUsedByChild`,
                `$totalDownloads`,
                continuation
            )
        }

        @Override // kotlin.jvm.functions.Function2
        public override fun invoke(
            coroutineScope: CoroutineScope,
            continuation: Continuation<in Unit>?
        ): Object {
            return (create(coroutineScope, continuation) as C48471).invokeSuspend(Unit.INSTANCE)
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public override fun invokeSuspend(obj: Object): Object {
            IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (label == 0) {
                ResultKt.throwOnFailure(obj)
                for (downloadEpisodeCached: DownloadEpisodeCached in `$children`) {
                    val downloadFileInfoAndUpdateSettings: DownloadedFileInfoResult? =
                        VideoDownloadManager.INSTANCE.getDownloadFileInfoAndUpdateSettings(
                            `$context`, downloadEpisodeCached.id
                        )
                    if (downloadFileInfoAndUpdateSettings != null && downloadFileInfoAndUpdateSettings.fileLength > 1) {
                        var totalBytes: Long = downloadFileInfoAndUpdateSettings.totalBytes
                        var fileLength: Long = downloadFileInfoAndUpdateSettings.fileLength
                        val hashMap: HashMap<Integer, Long> = `$totalBytesUsedByChild`
                        val boxInt: Integer = boxing.boxInt(downloadEpisodeCached.parentId)
                        val l: Long? =
                            `$totalBytesUsedByChild`.get(boxing.boxInt(downloadEpisodeCached.parentId))
                        if (l != null) {
                            totalBytes += l.longValue()
                        }
                        hashMap.put(boxInt, boxing.boxLong(totalBytes))
                        val hashMap2: HashMap<Integer, Long> = `$currentBytesUsedByChild`
                        val boxInt2: Integer = boxing.boxInt(downloadEpisodeCached.parentId)
                        val l2: Long? =
                            `$currentBytesUsedByChild`.get(boxing.boxInt(downloadEpisodeCached.parentId))
                        if (l2 != null) {
                            fileLength += l2.longValue()
                        }
                        hashMap2.put(boxInt2, boxing.boxLong(fileLength))
                        val hashMap3: HashMap<Integer, Integer> = `$totalDownloads`
                        val boxInt3: Integer = boxing.boxInt(downloadEpisodeCached.parentId)
                        val num: Integer? =
                            `$totalDownloads`.get(boxing.boxInt(downloadEpisodeCached.parentId))
                        hashMap3.put(
                            boxInt3,
                            boxing.boxInt(if (num != null) 1 + num.intValue() else 1)
                        )
                    }
                }
                return Unit.INSTANCE
            }
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        }
    }
}