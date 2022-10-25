package com.lagradost.cloudstream3.animeproviders

import java.util.List
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: DoramasYTProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/AnimeLoadResponse;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class `DoramasYTProvider$load$2`(/* synthetic */val `$poster`: String,
                                                list: List<Episode>,
                                                showStatus: ShowStatus,
                                                str2: String,
                                                list2: List<String>
) : Lambda<Any?>(1), Function1<AnimeLoadResponse, Unit> {
    /* synthetic */ val `$description`: String
    /* synthetic */ val `$episodes`: List<Episode>
    /* synthetic */ val `$genres`: List<String>
    /* synthetic */ val `$status`: ShowStatus

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$episodes` = list
        `$status` = showStatus
        `$description` = str2
        `$genres` = list2
    }

    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override fun invoke(animeLoadResponse: AnimeLoadResponse) {
        invoke2(animeLoadResponse)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(newAnimeLoadResponse: AnimeLoadResponse) {
        Intrinsics.checkNotNullParameter(newAnimeLoadResponse, "\$this\$newAnimeLoadResponse")
        newAnimeLoadResponse.posterUrl = `$poster`
        MainAPIKt.addEpisodes(newAnimeLoadResponse, DubStatus.Subbed, `$episodes`)
        newAnimeLoadResponse.showStatus = `$status`
        newAnimeLoadResponse.plot = `$description`
        newAnimeLoadResponse.tags = `$genres`
    }
}