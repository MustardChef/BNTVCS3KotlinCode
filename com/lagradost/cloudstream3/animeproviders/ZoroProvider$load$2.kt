package com.lagradost.cloudstream3.animeproviders

import com.lagradost.cloudstream3.LoadResponse
import java.util.List
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: ZoroProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/AnimeLoadResponse;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class `ZoroProvider$load$2`(
    objectRef: ObjectRef<String?>,
    str: String,
    str2: String,
    objectRef2: ObjectRef<Integer?>,
    list: List<Episode>,
    objectRef3: ObjectRef<ShowStatus?>,
    str3: String,
    list2: List<String>,
    list3: List<AnimeSearchResponse>,
    list4: List<ActorData>,
    zoroSyncData: ZoroSyncData
) : Lambda<Any?>(1), Function1<AnimeLoadResponse, Unit> {
    /* synthetic */ val `$actors`: List<ActorData>
    /* synthetic */ val `$description`: String
    /* synthetic */ val `$episodes`: List<Episode>
    /* synthetic */ val `$japaneseTitle`: ObjectRef<String>
    /* synthetic */ val `$poster`: String
    /* synthetic */ val `$recommendations`: List<AnimeSearchResponse>
    /* synthetic */ val `$status`: ObjectRef<ShowStatus>
    /* synthetic */ val `$syncData`: ZoroSyncData
    /* synthetic */ val `$tags`: List<String>
    /* synthetic */ val `$title`: String
    /* synthetic */ val `$year`: ObjectRef<Integer>

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$japaneseTitle` = objectRef
        `$title` = str
        `$poster` = str2
        `$year` = objectRef2
        `$episodes` = list
        `$status` = objectRef3
        `$description` = str3
        `$tags` = list2
        `$recommendations` = list3
        `$actors` = list4
        `$syncData` = zoroSyncData
    }

    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override fun invoke(animeLoadResponse: AnimeLoadResponse) {
        invoke2(animeLoadResponse)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(newAnimeLoadResponse: AnimeLoadResponse) {
        var aniListId: String?
        var malId: String?
        Intrinsics.checkNotNullParameter(newAnimeLoadResponse, "\$this\$newAnimeLoadResponse")
        newAnimeLoadResponse.japName = `$japaneseTitle`.element
        newAnimeLoadResponse.engName = `$title`
        newAnimeLoadResponse.posterUrl = `$poster`
        newAnimeLoadResponse.setYear(`$year`.element)
        MainAPIKt.addEpisodes(newAnimeLoadResponse, DubStatus.Subbed, `$episodes`)
        newAnimeLoadResponse.showStatus = `$status`.element
        newAnimeLoadResponse.plot = `$description`
        newAnimeLoadResponse.tags = `$tags`
        newAnimeLoadResponse.setRecommendations(`$recommendations`)
        newAnimeLoadResponse.actors = `$actors`
        val companion: LoadResponse.Companion = LoadResponse.Companion
        val animeLoadResponse: AnimeLoadResponse = newAnimeLoadResponse
        val zoroSyncData: ZoroSyncData = `$syncData`
        var num: Integer? = null
        companion.addMalId(
            animeLoadResponse,
            if (zoroSyncData == null || zoroSyncData.getMalId()
                    .also { malId = it } == null
            ) null else StringsKt.toIntOrNull(malId))
        val companion2: LoadResponse.Companion = LoadResponse.Companion
        val zoroSyncData2: ZoroSyncData = `$syncData`
        if (zoroSyncData2 != null && zoroSyncData2.getAniListId().also { aniListId = it } != null) {
            num = StringsKt.toIntOrNull(aniListId)
        }
        companion2.addAniListId(animeLoadResponse, num)
    }
}