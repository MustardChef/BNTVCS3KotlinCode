package com.lagradost.cloudstream3.movieproviders

import java.util.ArrayList
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: NginxProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/TvSeriesLoadResponse;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class `NginxProvider$load$5`(/* synthetic */val `$title`: String, /* synthetic */
                                            val `$url`: String,
                                            arrayList: ArrayList<Episode?>,
                                            str3: String,
                                            list: List<String>,
                                            str4: String,
                                            map: Map<String, String>
) : Lambda<Any?>(1), Function1<TvSeriesLoadResponse, Unit> {
    /* synthetic */ val `$authHeader`: Map<String, String>
    /* synthetic */ val `$description`: String
    /* synthetic */ val `$episodeList`: ArrayList<Episode>
    /* synthetic */ val `$posterUrl`: String
    /* synthetic */ val `$tagsList`: List<String>

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$episodeList` = arrayList
        `$description` = str3
        `$tagsList` = list
        `$posterUrl` = str4
        `$authHeader` = map
    }

    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override fun invoke(tvSeriesLoadResponse: TvSeriesLoadResponse) {
        invoke2(tvSeriesLoadResponse)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(newTvSeriesLoadResponse: TvSeriesLoadResponse) {
        Intrinsics.checkNotNullParameter(newTvSeriesLoadResponse, "\$this\$newTvSeriesLoadResponse")
        val title = `$title`
        Intrinsics.checkNotNullExpressionValue(title, "title")
        newTvSeriesLoadResponse.setName(title)
        newTvSeriesLoadResponse.setUrl(`$url`)
        newTvSeriesLoadResponse.setEpisodes(`$episodeList`)
        newTvSeriesLoadResponse.plot = `$description`
        newTvSeriesLoadResponse.tags = `$tagsList`
        MainAPIKt.addPoster(newTvSeriesLoadResponse, `$posterUrl`, `$authHeader`)
    }
}