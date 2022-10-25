package com.lagradost.cloudstream3.p041ui.player

import android.util.Log
import kotlin.jvm.internal.Intrinsics

/* compiled from: RepoLinkGenerator.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
    m107d2 = ["<anonymous>", "", "link", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.player.RepoLinkGenerator$generateLinks$result$2 */ /* loaded from: classes3.dex */
internal class `RepoLinkGenerator$generateLinks$result$2` constructor(/* synthetic */val `$currentLinks`: Set<String>,
                                                                                     set2: Set<ExtractorLink>,
                                                                                     function1: Function1<Tuples<out ExtractorLink?, ExtractorUri?>?, Unit>
) : Lambda<Any?>(1), Function1<ExtractorLink, Unit> {
    /* synthetic */ val `$callback`: Function1<Tuples<out ExtractorLink?, ExtractorUri?>, Unit>
    /* synthetic */ val `$currentLinkCache`: Set<ExtractorLink>

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$currentLinkCache` = set2
        `$callback` = function1
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(extractorLink: ExtractorLink) {
        invoke2(extractorLink)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(link: ExtractorLink) {
        Intrinsics.checkNotNullParameter(link, "link")
        Log.d(RepoLinkGenerator.Companion.TAG, "Loaded ExtractorLink: " + link)
        if (`$currentLinks`.contains(link.url) || `$currentLinkCache`.contains(link)) {
            return
        }
        `$currentLinks`.add(link.url)
        `$callback`.invoke(Tuples<ExtractorLink, ExtractorUri?>(link, null))
        `$currentLinkCache`.add(link)
    }
}