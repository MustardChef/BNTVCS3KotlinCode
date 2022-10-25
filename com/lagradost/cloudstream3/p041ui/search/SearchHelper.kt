package com.lagradost.cloudstream3.p041ui.search

import android.app.Activity
import com.lagradost.cloudstream3.p041ui.player.GeneratorPlayer
import com.lagradost.cloudstream3.utils.AppUtils
import kotlin.jvm.internal.Intrinsics

/* compiled from: SearchHelper.kt */
@Metadata(
    m108d1 = ["\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/search/SearchHelper;", "", "()V", "handleSearchClickCallback", "", "activity", "Landroid/app/Activity;", "callback", "Lcom/lagradost/cloudstream3/ui/search/SearchClickCallback;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.search.SearchHelper */ /* loaded from: classes4.dex */
class SearchHelper private constructor() {
    fun handleSearchClickCallback(activity: Activity?, callback: SearchClickCallback) {
        Intrinsics.checkNotNullParameter(callback, "callback")
        val card: SearchResponse? = callback.getCard()
        val action: Int = callback.getAction()
        if (action == 0) {
            AppUtils.`loadSearchResult$default`(AppUtils.INSTANCE, activity, card, 0, null, 6, null)
        } else if (action == 1) {
            CommonActivity.INSTANCE.showToast(activity, callback.getCard().name, 0 as Integer?)
        } else {
            if (action != 2) {
                if (action != 998) {
                    if (action == 999 && activity != null) {
                        UIHelper.INSTANCE.navigate(
                            activity,
                            R.id.global_to_navigation_player,
                            GeneratorPlayer.Companion.Companion.`newInstance$default`(
                                GeneratorPlayer.Companion.Companion,
                                SponsorFileGenerator(
                                    CollectionsKt.listOf(card.url),
                                    card.name,
                                    ConfigHomeKt.SPONSOR_API_NAME
                                ),
                                null,
                                2,
                                null
                            )
                        )
                    }
                } else if (activity != null) {
                    UIHelper.INSTANCE.navigate(
                        activity,
                        R.id.global_to_navigation_player,
                        GeneratorPlayer.Companion.Companion.`newInstance$default`(
                            GeneratorPlayer.Companion.Companion,
                            SponsorFileGenerator(
                                CollectionsKt.listOf(card.url),
                                card.name,
                                ConfigHomeKt.IPTV_API_NAME
                            ),
                            null,
                            2,
                            null
                        )
                    )
                }
            } else if (card is ResumeWatchingResult) {
                val id: Integer? = card.id
                if (id == null) {
                    CommonActivity.INSTANCE.showToast(activity, R.string.error_invalid_id, 0)
                } else {
                    val resumeWatchingResult: ResumeWatchingResult = card as ResumeWatchingResult
                    if (resumeWatchingResult.isFromDownload) {
                        val downloadButtonSetup: DownloadButtonSetup =
                            DownloadButtonSetup.Companion.INSTANCE
                        val name: String = card.name
                        val name2: String = card.name
                        val posterUrl: String = card.posterUrl
                        val episode: Integer? = resumeWatchingResult.getEpisode()
                        val intValue: Int = if (episode != null) episode.intValue() else 0
                        val season: Integer = resumeWatchingResult.getSeason()
                        val intValue2: Int = id.intValue()
                        val parentId: Integer? = resumeWatchingResult.getParentId()
                        if (parentId == null) {
                            return
                        }
                        downloadButtonSetup.handleDownloadClick(
                            activity,
                            name,
                            DownloadClickEvent(
                                0,
                                DownloadEpisodeCached(
                                    name2,
                                    posterUrl,
                                    intValue,
                                    season,
                                    intValue2,
                                    parentId.intValue(),
                                    null,
                                    null,
                                    System.currentTimeMillis()
                                )
                            )
                        )
                    } else {
                        AppUtils.INSTANCE.loadSearchResult(activity, card, 2, id)
                    }
                }
            } else {
                handleSearchClickCallback(
                    activity,
                    SearchClickCallback(0, callback.getView(), -1, callback.getCard())
                )
            }
        }
    }

    companion object {
        val INSTANCE: SearchHelper = SearchHelper()
    }
}