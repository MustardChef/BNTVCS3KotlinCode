package com.lagradost.cloudstream3.movieproviders

import java.util.List
import kotlin.jvm.internal.Intrinsics

/* compiled from: EgyBestProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/TvSeriesLoadResponse;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes3.dex */
internal class `EgyBestProvider$load$6`(/* synthetic */val `$posterUrl`: String, /* synthetic */
                                                       val `$tags`: List<String>,
                                                       num: Integer,
                                                       str2: String,
                                                       list2: List<ActorData>,
                                                       str3: String
) : Lambda<Any?>(1), Function1<TvSeriesLoadResponse, Unit> {
    /* synthetic */ val `$actors`: List<ActorData>
    /* synthetic */ val `$synopsis`: String
    /* synthetic */ val `$year`: Integer
    /* synthetic */ val `$youtubeTrailer`: String

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$year` = num
        `$synopsis` = str2
        `$actors` = list2
        `$youtubeTrailer` = str3
    }

    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override fun invoke(tvSeriesLoadResponse: TvSeriesLoadResponse) {
        invoke2(tvSeriesLoadResponse)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(newTvSeriesLoadResponse: TvSeriesLoadResponse) {
        Intrinsics.checkNotNullParameter(newTvSeriesLoadResponse, "\$this\$newTvSeriesLoadResponse")
        newTvSeriesLoadResponse.posterUrl = `$posterUrl`
        newTvSeriesLoadResponse.tags = `$tags`
        newTvSeriesLoadResponse.setYear(`$year`)
        newTvSeriesLoadResponse.plot = `$synopsis`
        newTvSeriesLoadResponse.actors = `$actors`
        LoadResponse.Companion.addTrailer(newTvSeriesLoadResponse, `$youtubeTrailer`)
    }
}