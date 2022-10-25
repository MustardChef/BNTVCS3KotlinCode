package com.lagradost.cloudstream3.p041ui.player

import android.util.Log
import kotlin.jvm.internal.Intrinsics

/* compiled from: RepoLinkGenerator.kt */
@Metadata(
    m108d1 = ["\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"],
    m107d2 = ["<anonymous>", "", "it", "", "Lcom/lagradost/cloudstream3/SubtitleFile;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.player.RepoLinkGenerator$generateLinks$4$1$1 */ /* loaded from: classes3.dex */
internal class `RepoLinkGenerator$generateLinks$4$1$1` constructor(/* synthetic */val `$currentSubsCache`: Set<SubtitleData>,
                                                                                  function1: Function1<SubtitleData?, Unit>
) : Lambda<Any?>(1), Function1<List<SubtitleFile?>, Unit> {
    /* synthetic */ val `$subtitleCallback`: Function1<SubtitleData, Unit>

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$subtitleCallback` = function1
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(list: List<SubtitleFile?>) {
        invoke2(list as List<SubtitleFile?>)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(it: List<SubtitleFile?>) {
        Intrinsics.checkNotNullParameter(it, "it")
        val set: Set<SubtitleData> = `$currentSubsCache`
        val function1: Function1<SubtitleData, Unit> = `$subtitleCallback`
        for (subtitleFile: SubtitleFile? in it) {
            val subtitleData: SubtitleData =
                PlayerSubtitleHelper.Companion.Companion.getSubtitleData(subtitleFile)
            if (!set.contains(subtitleData)) {
                function1.invoke(subtitleData)
                set.add(subtitleData)
                Log.d("BLUE", "add to callback  --> " + subtitleData)
            }
        }
    }
}