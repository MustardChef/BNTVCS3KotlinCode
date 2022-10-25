package com.lagradost.cloudstream3.p041ui.player

import android.os.Looper
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: PlayerGeneratorViewModel.kt */
@Metadata(
    m108d1 = ["\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"],
    m107d2 = ["<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.ui.player.PlayerGeneratorViewModel\$extrasZipSubtitle$1",
    m98f = "PlayerGeneratorViewModel.kt",
    m97i = [],
    m96l = [],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* renamed from: com.lagradost.cloudstream3.ui.player.PlayerGeneratorViewModel$extrasZipSubtitle$1 */ /* loaded from: classes3.dex */
class `PlayerGeneratorViewModel$extrasZipSubtitle$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */ constructor(/* synthetic */
    val `$subtitleFileZip`: SubtitleData, /* synthetic */
    val `$fileDir`: String?, /* synthetic */
    val `this$0`: PlayerGeneratorViewModel, /* synthetic */
    val `$callback`: Function1<SubtitleData?, Unit>,
    continuation: Continuation<in `PlayerGeneratorViewModel$extrasZipSubtitle$1`?>?
) : SuspendLambda(2, continuation), Function2<CoroutineScope, Continuation<in Unit>?, Object> {
    var label: Int = 0

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        return `PlayerGeneratorViewModel$extrasZipSubtitle$1`(
            `$subtitleFileZip`,
            `$fileDir`,
            `this$0`,
            `$callback`,
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
        ) as `PlayerGeneratorViewModel$extrasZipSubtitle$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun invokeSuspend(obj: Object): Object {
        IntrinsicsKt.getCOROUTINE_SUSPENDED()
        if (label == 0) {
            ResultKt.throwOnFailure(obj)
            val subtitleBrowserRepository: SubtitleBrowserRepository = SubtitleBrowserRepository()
            ArrayList()
            val intRef: IntRef = IntRef()
            Log.d(
                "Duongkk",
                "Main Thread " + Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())
            )
            Log.e("Duongkk Thread", Thread.currentThread().getName())
            subtitleBrowserRepository.downloadSubtitle(
                `$subtitleFileZip`.getUrl(),
                `$fileDir`,
                C48731(intRef, subtitleBrowserRepository, `this$0`, `$callback`)
            )
            return Unit.INSTANCE
        }
        throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: PlayerGeneratorViewModel.kt */
    @Metadata(
        m108d1 = ["\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"],
        m107d2 = ["<anonymous>", "", "listFilePath", "", "", "invoke"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.player.PlayerGeneratorViewModel$extrasZipSubtitle$1$1 */ /* loaded from: classes3.dex */
    class C48731 internal constructor(
        intRef: IntRef,
        subtitleBrowserRepository: SubtitleBrowserRepository,
        playerGeneratorViewModel: PlayerGeneratorViewModel,
        function1: Function1<SubtitleData?, Unit>
    ) : Lambda<Any?>(1), Function1<List<String?>, Unit> {
        /* synthetic */ val `$callback`: Function1<SubtitleData, Unit>
        /* synthetic */ val `$repository`: SubtitleBrowserRepository
        /* synthetic */ val `$size`: IntRef
        /* synthetic */ val `this$0`: PlayerGeneratorViewModel

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
        init {
            `$size` = intRef
            `$repository` = subtitleBrowserRepository
            `this$0` = playerGeneratorViewModel
            `$callback` = function1
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */  override fun invoke(list: List<String?>) {
            invoke2(list)
            return Unit.INSTANCE
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        fun invoke2(listFilePath: List<String?>) {
            Intrinsics.checkNotNullParameter(listFilePath, "listFilePath")
            `$size`.element = listFilePath.size()
            Log.d("BLUE", String.valueOf(listFilePath))
            val arrayList: ArrayList = ArrayList()
            for (obj: Object? in listFilePath) {
                val str: String? = obj
                val z: Boolean = false
                if (if ((StringsKt.`endsWith$default`(
                            str,
                            "srt",
                            false,
                            2,
                            null as Object?
                        ) || StringsKt.`endsWith$default`(
                            str,
                            "vtt",
                            false,
                            2,
                            null as Object?
                        ) || StringsKt.`endsWith$default`(str, "xml", false, 2, null as Object?))
                    ) true else true
                ) {
                    arrayList.add(obj)
                }
            }
            `$repository`.uploadFile(
                File(CollectionsKt.first<Any>(arrayList as List<Object?>?) as String?), C48741(
                    `this$0`, `$callback`
                )
            )
        }

        /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: PlayerGeneratorViewModel.kt */
        @Metadata(
            m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"],
            m107d2 = ["<anonymous>", "", "subtitleFile", "Lcom/lagradost/cloudstream3/SubtitleFile;", "invoke"],
            m106k = 3,
            m105mv = [1, 6, 0],
            m103xi = 48
        ) /* renamed from: com.lagradost.cloudstream3.ui.player.PlayerGeneratorViewModel$extrasZipSubtitle$1$1$1 */ /* loaded from: classes3.dex */
        class C48741  /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */ internal constructor(/* synthetic */
            val `this$0`: PlayerGeneratorViewModel, /* synthetic */
            val `$callback`: Function1<SubtitleData, Unit>
        ) : Lambda<Any?>(1), Function1<SubtitleFile?, Unit> {
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */  override fun invoke(subtitleFile: SubtitleFile?) {
                invoke2(subtitleFile)
                return Unit.INSTANCE
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            fun invoke2(subtitleFile: SubtitleFile?) {
                val iGenerator: IGenerator?
                var loadResponse: LoadResponse
                if (subtitleFile != null) {
                    val playerGeneratorViewModel: PlayerGeneratorViewModel = `this$0`
                    val function1: Function1<SubtitleData, Unit> = `$callback`
                    val sb: StringBuilder = StringBuilder()
                    sb.append("Vietsub ")
                    iGenerator = playerGeneratorViewModel.generator
                    sb.append(
                        if ((iGenerator == null || (iGenerator.getLoadResponse()
                                .also({ loadResponse = it })) == null)
                        ) null else loadResponse.name
                    )
                    sb.append(' ')
                    sb.append(System.currentTimeMillis())
                    val subtitleData: SubtitleData = SubtitleData(
                        sb.toString(),
                        subtitleFile.url,
                        SubtitleOrigin.URL,
                        PlayerSubtitleHelper.Companion.Companion.toSubtitleMimeType(subtitleFile.url),
                        false
                    )
                    Log.d("BLUE", "auto choose " + subtitleData)
                    function1.invoke(subtitleData)
                }
            }
        }
    }
}