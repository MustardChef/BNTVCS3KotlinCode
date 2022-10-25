package com.lagradost.cloudstream3.p041ui.player

import java.util.Set
import kotlin.jvm.internal.Intrinsics

/* compiled from: RepoLinkGenerator.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
    m107d2 = ["<anonymous>", "", "file", "Lcom/lagradost/cloudstream3/SubtitleFile;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.player.RepoLinkGenerator$generateLinks$result$1 */ /* loaded from: classes3.dex */
internal class `RepoLinkGenerator$generateLinks$result$1` constructor(/* synthetic */val `$currentSubsUrls`: Set<String?>, /* synthetic */
                                                                                     val `$currentSubsNames`: Set<String?>, /* synthetic */
                                                                                     val `$currentSubsCache`: Set<SubtitleData>,
                                                                                     function1: Function1<SubtitleData?, Unit>
) : Lambda<Any?>(1), Function1<SubtitleFile?, Unit> {
    /* synthetic */ val `$subtitleCallback`: Function1<SubtitleData, Unit>

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$subtitleCallback` = function1
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(subtitleFile: SubtitleFile?) {
        invoke2(subtitleFile)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(file: SubtitleFile?) {
        Intrinsics.checkNotNullParameter(file, "file")
        val subtitleData: SubtitleData =
            PlayerSubtitleHelper.Companion.Companion.getSubtitleData(file)
        if (`$currentSubsUrls`.contains(subtitleData.getUrl())) {
            return
        }
        `$currentSubsUrls`.add(subtitleData.getUrl())
        var i: Int = 0
        var name: String? = subtitleData.getName()
        while (`$currentSubsNames`.contains(name)) {
            i++
            name = subtitleData.getName() + ' ' + i
        }
        `$currentSubsNames`.add(name)
        val `copy$default`: SubtitleData = SubtitleData.Companion.`copy$default`(
            subtitleData,
            name,
            null,
            null,
            null,
            null,
            30,
            null
        )
        if (`$currentSubsCache`.contains(`copy$default`)) {
            return
        }
        `$subtitleCallback`.invoke(`copy$default`)
        `$currentSubsCache`.add(`copy$default`)
    }
}