package com.lagradost.cloudstream3.movieproviders

import java.util.ArrayList
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: EstrenosDoramasProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/AnimeLoadResponse;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class `EstrenosDoramasProvider$load$2`(/* synthetic */val `$title`: String, /* synthetic */
                                                      val `$poster`: String,
                                                      arrayList: ArrayList<Episode?>,
                                                      str3: String
) : Lambda<Any?>(1), Function1<AnimeLoadResponse, Unit> {
    /* synthetic */ val `$epi`: ArrayList<Episode>
    /* synthetic */ val `$finaldesc`: String

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$epi` = arrayList
        `$finaldesc` = str3
    }

    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override fun invoke(animeLoadResponse: AnimeLoadResponse) {
        invoke2(animeLoadResponse)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(newAnimeLoadResponse: AnimeLoadResponse) {
        Intrinsics.checkNotNullParameter(newAnimeLoadResponse, "\$this\$newAnimeLoadResponse")
        newAnimeLoadResponse.japName = null
        newAnimeLoadResponse.engName = Regex("[Pp]elicula |[Pp]elicula").replace(`$title`, "")
        newAnimeLoadResponse.posterUrl = `$poster`
        MainAPIKt.addEpisodes(
            newAnimeLoadResponse,
            DubStatus.Subbed,
            CollectionsKt.reversed(`$epi`)
        )
        newAnimeLoadResponse.plot = `$finaldesc`
    }
}