package com.lagradost.cloudstream3.p041ui.player

import android.util.Log

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: PlayerGeneratorViewModel.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"],
    m107d2 = ["<anonymous>", "", "subtitleFile", "Lcom/lagradost/cloudstream3/SubtitleFile;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.player.PlayerGeneratorViewModel$uploadFileSub$1 */ /* loaded from: classes3.dex */
class `PlayerGeneratorViewModel$uploadFileSub$1` constructor(/* synthetic */val `this$0`: PlayerGeneratorViewModel,
                                                                            function1: Function1<SubtitleData?, Unit>
) : Lambda<Any?>(1), Function1<SubtitleFile?, Unit> {
    /* synthetic */ val `$callback`: Function1<SubtitleData, Unit>

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$callback` = function1
    }

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