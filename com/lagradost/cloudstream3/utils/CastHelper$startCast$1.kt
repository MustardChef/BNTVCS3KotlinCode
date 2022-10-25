package com.lagradost.cloudstream3.utils

import java.util.List

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: CastHelper.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
    m107d2 = ["<anonymous>", "", "it", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class `CastHelper$startCast$1`(/* synthetic */val `$currentLinks`: List<ExtractorLink>, /* synthetic */
                                              val `$index`: Int,
                                              castSession: CastSession,
                                              str: String,
                                              z: Boolean,
                                              str2: String,
                                              str3: String,
                                              i2: Int,
                                              list2: List<ResultEpisode>,
                                              list3: List<SubtitleData>,
                                              l: Long
) : Lambda<Any?>(1), Function1<Boolean, Unit> {
    /* synthetic */ val `$apiName`: String
    /* synthetic */ val `$currentEpisodeIndex`: Int
    /* synthetic */ val `$episodes`: List<ResultEpisode>
    /* synthetic */ val `$isMovie`: Boolean
    /* synthetic */ val `$poster`: String
    /* synthetic */ val `$startTime`: Long
    /* synthetic */ val `$subtitles`: List<SubtitleData>
    /* synthetic */ val `$this_startCast`: CastSession
    /* synthetic */ val `$title`: String

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$this_startCast` = castSession
        `$apiName` = str
        `$isMovie` = z
        `$title` = str2
        `$poster` = str3
        `$currentEpisodeIndex` = i2
        `$episodes` = list2
        `$subtitles` = list3
        `$startTime` = l
    }

    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override fun invoke(bool: Boolean) {
        invoke(bool.booleanValue())
        return Unit.INSTANCE
    }

    override fun invoke(z: Boolean) {
        if (`$currentLinks`.size() > `$index` + 1) {
            CastHelper.Companion.INSTANCE.startCast(
                `$this_startCast`,
                `$apiName`,
                `$isMovie`,
                `$title`,
                `$poster`,
                `$currentEpisodeIndex`,
                `$episodes`,
                `$currentLinks`,
                `$subtitles`,
                Integer.valueOf(
                    `$index` + 1
                ),
                `$startTime`
            )
        }
    }
}