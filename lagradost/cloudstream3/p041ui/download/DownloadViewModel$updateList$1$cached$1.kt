package com.lagradost.cloudstream3.p041ui.download

import android.content.Context
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: DownloadViewModel.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/utils/VideoDownloadHelper\$DownloadHeaderCached;", "Lkotlinx/coroutines/CoroutineScope;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.ui.download.DownloadViewModel\$updateList$1\$cached$1",
    m98f = "DownloadViewModel.kt",
    m97i = [],
    m96l = [],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
)
/* renamed from: com.lagradost.cloudstream3.ui.download.DownloadViewModel$updateList$1$cached$1 */ /* loaded from: classes3.dex */
internal class `DownloadViewModel$updateList$1$cached$1` constructor(
    hashMap: HashMap<Integer?, Integer?>,
    context: Context,
    continuation: Continuation<in `DownloadViewModel$updateList$1$cached$1`?>?
) : SuspendLambda(2, continuation),
    Function2<CoroutineScope, Continuation<in List<DownloadHeaderCached?>?>?, Object> {
    /* synthetic */ val `$context`: Context
    /* synthetic */ val `$totalDownloads`: HashMap<Integer, Integer>
    var label: Int = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$totalDownloads` = hashMap
        `$context` = context
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        return `DownloadViewModel$updateList$1$cached$1`(
            `$totalDownloads`,
            `$context`,
            continuation
        )
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */  override fun invoke(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in List<DownloadHeaderCached?>?>?
    ): Object {
        return invoke2(
            coroutineScope,
            continuation as Continuation<in List<DownloadHeaderCached?>?>?
        )
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in List<DownloadHeaderCached?>?>?
    ): Object {
        return (create(
            coroutineScope,
            continuation
        ) as `DownloadViewModel$updateList$1$cached$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun invokeSuspend(obj: Object): Object {
        IntrinsicsKt.getCOROUTINE_SUSPENDED()
        if (label == 0) {
            ResultKt.throwOnFailure(obj)
            val entrySet: Set<Map.Entry<Integer, Integer>> = `$totalDownloads`.entrySet()
            Intrinsics.checkNotNullExpressionValue(entrySet, "totalDownloads.entries")
            val arrayList: ArrayList<Map.Entry> = ArrayList()
            for (obj2: Object in entrySet) {
                val value: Object = (obj2 as Map.Entry).getValue()
                Intrinsics.checkNotNullExpressionValue(value, "it.value")
                if ((value as Number).intValue() > 0) {
                    arrayList.add(obj2)
                }
            }
            val context: Context = `$context`
            val arrayList2: ArrayList = ArrayList()
            for (entry: Map.Entry in arrayList) {
                val dataStore: DataStore = DataStore.INSTANCE
                var obj3: Object? = null
                try {
                    val string: String? = dataStore.getSharedPrefs(context).getString(
                        dataStore.getFolderName(
                            DataStoreKt.DOWNLOAD_HEADER_CACHE,
                            String.valueOf((entry.getKey() as Number).intValue())
                        ), null
                    )
                    if (string != null) {
                        Intrinsics.checkNotNullExpressionValue(
                            string,
                            "getSharedPrefs().getStri…h, null) ?: return defVal"
                        )
                        val readValue: Object =
                            dataStore.mapper.readValue(string, DownloadHeaderCached::class.java)
                        Intrinsics.checkNotNullExpressionValue(
                            readValue,
                            "mapper.readValue(this, T::class.java)"
                        )
                        obj3 = readValue
                    }
                } catch (unused: Exception) {
                }
                val downloadHeaderCached: DownloadHeaderCached? = obj3 as DownloadHeaderCached?
                if (downloadHeaderCached != null) {
                    arrayList2.add(downloadHeaderCached)
                }
            }
            return arrayList2
        }
        throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
    }
}