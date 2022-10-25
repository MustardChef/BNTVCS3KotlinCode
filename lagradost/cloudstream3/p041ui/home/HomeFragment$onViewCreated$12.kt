package com.lagradost.cloudstream3.p041ui.home

import com.lagradost.cloudstream3.HomePageList.name
import com.lagradost.cloudstream3.HomePageList.getList
import com.lagradost.cloudstream3.utils.Event.plusAssign
import com.lagradost.cloudstream3.utils.UIHelper.dismissSafe
import com.lagradost.cloudstream3.utils.Event.minusAssign
import com.lagradost.cloudstream3.MainAPI.name
import com.lagradost.cloudstream3.utils.UIHelper.getSpanCount
import com.lagradost.cloudstream3.utils.Event.invoke
import com.lagradost.cloudstream3.MainAPI.mainUrl
import com.lagradost.cloudstream3.APIHolder.Companion.`filterProviderByPreferredMedia$default`
import com.lagradost.cloudstream3.Page.name
import com.lagradost.cloudstream3.Page.getUrl
import com.lagradost.cloudstream3.AcraApplication.Companion.context
import com.lagradost.cloudstream3.utils.DataStore.getSharedPrefs
import com.lagradost.cloudstream3.utils.DataStore.mapper
import com.lagradost.cloudstream3.SearchResponse.name
import com.lagradost.cloudstream3.utils.UIHelper.Companion.`setImageBlur$default`
import com.lagradost.cloudstream3.SearchResponse.posterUrl
import com.lagradost.cloudstream3.widget.CenterZoomLayoutManager.setOnSizeListener
import com.lagradost.cloudstream3.syncproviders.AccountManager.Companion.oAuth2Apis
import com.lagradost.cloudstream3.syncproviders.AuthAPI.LoginInfo.profilePicture
import com.lagradost.cloudstream3.utils.UIHelper.Companion.`setImage$default`
import com.lagradost.cloudstream3.utils.AppUtils.Companion.`loadSearchResult$default`
import com.lagradost.cloudstream3.APIHolder.apis
import com.lagradost.cloudstream3.MainAPI.hasMainPage
import com.lagradost.cloudstream3.utils.UIHelper.navigate
import com.lagradost.cloudstream3.PageResponse.nextUrl
import com.lagradost.cloudstream3.PageResponse.list
import com.lagradost.cloudstream3.utils.UIHelper.IsBottomLayout
import com.lagradost.cloudstream3.APIHolder.getApiFromNameNull
import com.lagradost.cloudstream3.APIHolder.getApiNameFromUrl
import com.lagradost.cloudstream3.AcraApplication.Companion.setKey
import com.lagradost.cloudstream3.MainAPI.supportedTypes
import com.lagradost.cloudstream3.widget.CenterZoomLayoutManager.updateSize
import com.lagradost.cloudstream3.widget.CenterZoomLayoutManager.Companion.`snap$default`
import com.lagradost.cloudstream3.HomePageResponse.items
import com.lagradost.cloudstream3.HomePageList.urlMore
import com.lagradost.cloudstream3.HomePageList.nameApi
import com.lagradost.cloudstream3.HomePageList.getCardType
import com.lagradost.cloudstream3.utils.UIHelper.popupMenuNoIconsAndNoStringRes
import com.lagradost.cloudstream3.utils.DataStore.setKey
import com.lagradost.cloudstream3.utils.DataStoreHelper.setResultWatchState
import com.lagradost.cloudstream3.SearchResponse.id
import com.lagradost.cloudstream3.utils.SingleSelectionHelper.showOptionSelectStringRes
import com.lagradost.cloudstream3.utils.DataStoreHelper.removeLastWatched
import com.lagradost.cloudstream3.utils.DataStoreHelper.ResumeWatchingResult.getParentId
import com.lagradost.cloudstream3.utils.DataStoreHelper.getBookmarkedData
import com.lagradost.cloudstream3.utils.DataStoreHelper.BookmarkedData.latestUpdatedTime
import com.lagradost.cloudstream3.utils.DataStoreHelper.allWatchStateIds
import com.lagradost.cloudstream3.utils.DataStoreHelper.getResultWatchState
import com.lagradost.cloudstream3.utils.DataStoreHelper.allResumeStateIds
import com.lagradost.cloudstream3.utils.DataStoreHelper.getLastWatched
import com.lagradost.cloudstream3.utils.VideoDownloadHelper.ResumeWatching.updateTime
import com.lagradost.cloudstream3.utils.UIHelper.fixPaddingStatusbar
import com.lagradost.cloudstream3.utils.UIHelper.popCurrentPage
import com.lagradost.cloudstream3.APIHolder.getApiFromName
import com.lagradost.cloudstream3.utils.ExtractorLink.source
import com.lagradost.cloudstream3.MainAPI.getVideoInterceptor
import com.lagradost.cloudstream3.MainActivityKt.getApp
import com.lagradost.cloudstream3.utils.ExtractorLink.referer
import com.lagradost.cloudstream3.utils.ExtractorLink.headers
import com.lagradost.cloudstream3.utils.ExtractorUri.getUri
import com.lagradost.cloudstream3.utils.Qualities.value
import com.lagradost.cloudstream3.utils.ExtractorLink.url
import com.lagradost.cloudstream3.utils.ExtractorLink.isM3u8
import com.lagradost.cloudstream3.utils.ExtractorLink.extractorData
import com.lagradost.cloudstream3.syncproviders.providers.OpenSubtitlesApi.search
import com.lagradost.cloudstream3.syncproviders.AccountManager.Companion.subtitleProviders
import com.lagradost.cloudstream3.syncproviders.providers.OpenSubtitlesApi.loginInfo
import com.lagradost.cloudstream3.utils.DataStoreHelper.getViewPos
import com.lagradost.cloudstream3.utils.DataStoreHelper.PosDur.duration
import com.lagradost.cloudstream3.utils.DataStoreHelper.PosDur.position
import com.lagradost.cloudstream3.utils.Coroutines.ioSafe
import com.lagradost.cloudstream3.utils.ExtractorLink.quality
import com.lagradost.cloudstream3.MainAPIKt.isMovieType
import com.lagradost.cloudstream3.utils.ExtractorUri.getTvType
import com.lagradost.cloudstream3.utils.ExtractorUri.getEpisode
import com.lagradost.cloudstream3.utils.ExtractorUri.getSeason
import com.lagradost.cloudstream3.utils.ExtractorUri.headerName
import com.lagradost.cloudstream3.utils.UIHelper.colorFromAttribute
import com.lagradost.cloudstream3.subtitles.AbstractSubtitleEntities.SubtitleEntity.getLang
import com.lagradost.cloudstream3.subtitles.AbstractSubtitleEntities.SubtitleEntity.getName
import com.lagradost.cloudstream3.utils.SubtitleHelper.fromTwoLettersToLanguage
import com.lagradost.cloudstream3.utils.SubtitleHelper.languages
import com.lagradost.cloudstream3.utils.SubtitleHelper.Language639.iSO_639_1
import com.lagradost.cloudstream3.utils.SubtitleHelper.Language639.languageName
import com.lagradost.cloudstream3.utils.SingleSelectionHelper.showDialog
import com.lagradost.cloudstream3.syncproviders.providers.OpenSubtitlesApi.idPrefix
import com.lagradost.cloudstream3.subtitles.AbstractSubtitleEntities.SubtitleEntity.getIdPrefix
import com.lagradost.cloudstream3.MainAPIKt.sortSubs
import com.lagradost.cloudstream3.utils.ExtractorLink.name
import com.lagradost.cloudstream3.utils.ExtractorUri.name
import com.lagradost.cloudstream3.utils.UIHelper.hideSystemUI
import com.lagradost.cloudstream3.MainAPIKt.isEpisodeBased
import com.lagradost.cloudstream3.utils.UIHelper.getToPx
import com.lagradost.cloudstream3.utils.UIHelper.showSystemUI
import com.lagradost.cloudstream3.utils.Vector2.x
import com.lagradost.cloudstream3.utils.Vector2.y
import com.lagradost.cloudstream3.utils.Vector2.minus
import com.lagradost.cloudstream3.CommonActivity.playerEventListener
import com.lagradost.cloudstream3.CommonActivity.setKeyEventListener
import com.lagradost.cloudstream3.utils.UIHelper.getNavigationBarHeight
import com.lagradost.cloudstream3.utils.UIHelper.getStatusBarHeight
import com.lagradost.cloudstream3.SubtitleFile.lang
import com.lagradost.cloudstream3.SubtitleFile.url
import com.lagradost.cloudstream3.SubtitleFile.isZipUrl
import com.lagradost.cloudstream3.utils.ExtractorUri.relativePath
import com.lagradost.cloudstream3.utils.ExtractorUri.displayName
import com.lagradost.cloudstream3.utils.VideoDownloadManager.getFolder
import com.lagradost.cloudstream3.utils.ExtractorUri.basePath
import com.lagradost.cloudstream3.CommonActivity.canEnterPipMode
import com.lagradost.cloudstream3.CommonActivity.isInPIPMode
import com.lagradost.cloudstream3.utils.AppUtils.requestLocalAudioFocus
import com.lagradost.cloudstream3.utils.AppUtils.focusRequest
import com.lagradost.cloudstream3.CommonActivity.dispatchKeyEvent
import com.lagradost.cloudstream3.CommonActivity.onKeyDown
import com.lagradost.cloudstream3.CommonActivity.onUserLeaveHint
import com.lagradost.cloudstream3.CommonActivity.loadThemes
import com.lagradost.cloudstream3.CommonActivity.init
import com.lagradost.cloudstream3.utils.Coroutines.runOnMainThread
import com.lagradost.cloudstream3.MainAPI.extractorVerifierJob
import com.lagradost.cloudstream3.LoadResponse.name
import com.lagradost.cloudstream3.syncproviders.providers.OpenSubtitlesApi.load
import com.lagradost.cloudstream3.ActorData.hashCode
import com.lagradost.cloudstream3.syncproviders.AccountManager.Companion.syncApis
import com.lagradost.cloudstream3.syncproviders.SyncRepo.name
import com.lagradost.cloudstream3.syncproviders.SyncRepo.idPrefix
import com.lagradost.cloudstream3.syncproviders.SyncRepo.hasAccount
import com.lagradost.cloudstream3.syncproviders.SyncRepo.getIcon
import com.lagradost.cloudstream3.syncproviders.AccountManager.Companion.malApi
import com.lagradost.cloudstream3.syncproviders.AccountManager.Companion.aniListApi
import com.lagradost.cloudstream3.syncproviders.SyncAPI.SyncStatus.getWatchedEpisodes
import com.lagradost.cloudstream3.syncproviders.SyncAPI.SyncResult.getTotalEpisodes
import com.lagradost.cloudstream3.syncproviders.SyncAPI.SyncStatus.Companion.`copy$default`
import com.lagradost.cloudstream3.utils.VideoDownloadManager.getDownloadFileInfoAndUpdateSettings
import com.lagradost.cloudstream3.utils.VideoDownloadManager.DownloadedFileInfoResult.fileLength
import com.lagradost.cloudstream3.utils.VideoDownloadManager.DownloadedFileInfoResult.totalBytes
import com.lagradost.cloudstream3.LoadResponse.getDuration
import com.lagradost.cloudstream3.syncproviders.SyncAPI.SyncResult.getDuration
import com.lagradost.cloudstream3.LoadResponse.setDuration
import com.lagradost.cloudstream3.LoadResponse.getRating
import com.lagradost.cloudstream3.syncproviders.SyncAPI.SyncResult.getPublicScore
import com.lagradost.cloudstream3.LoadResponse.setRating
import com.lagradost.cloudstream3.LoadResponse.tags
import com.lagradost.cloudstream3.syncproviders.SyncAPI.SyncResult.genres
import com.lagradost.cloudstream3.LoadResponse.plot
import com.lagradost.cloudstream3.syncproviders.SyncAPI.SyncResult.synopsis
import com.lagradost.cloudstream3.LoadResponse.Companion.addTrailer
import com.lagradost.cloudstream3.syncproviders.SyncAPI.SyncResult.trailerUrl
import com.lagradost.cloudstream3.LoadResponse.posterUrl
import com.lagradost.cloudstream3.syncproviders.SyncAPI.SyncResult.posterUrl
import com.lagradost.cloudstream3.syncproviders.SyncAPI.SyncResult.backgroundPosterUrl
import com.lagradost.cloudstream3.LoadResponse.actors
import com.lagradost.cloudstream3.syncproviders.SyncAPI.SyncResult.getActors
import com.lagradost.cloudstream3.syncproviders.SyncAPI.SyncResult.recommendations
import com.lagradost.cloudstream3.syncproviders.SyncAPI.SyncSearchResult.copy
import com.lagradost.cloudstream3.syncproviders.SyncAPI.SyncSearchResult.name
import com.lagradost.cloudstream3.syncproviders.SyncAPI.SyncSearchResult.apiName
import com.lagradost.cloudstream3.syncproviders.SyncAPI.SyncSearchResult.url
import com.lagradost.cloudstream3.syncproviders.SyncAPI.SyncSearchResult.posterUrl
import com.lagradost.cloudstream3.syncproviders.SyncAPI.SyncSearchResult.getType
import com.lagradost.cloudstream3.syncproviders.SyncAPI.SyncSearchResult.getQuality
import com.lagradost.cloudstream3.syncproviders.SyncAPI.SyncSearchResult.posterHeaders
import com.lagradost.cloudstream3.syncproviders.SyncAPI.SyncSearchResult.id
import com.lagradost.cloudstream3.LoadResponse.recommendations
import com.lagradost.cloudstream3.utils.DataStoreHelper.setResultSeason
import com.lagradost.cloudstream3.utils.DataStoreHelper.setDub
import com.lagradost.cloudstream3.utils.DataStoreHelper.getResultSeason
import com.lagradost.cloudstream3.SearchResponse.url
import com.lagradost.cloudstream3.SearchResponse.apiName
import com.lagradost.cloudstream3.utils.DataStoreHelper.ResumeWatchingResult.getSeason
import com.lagradost.cloudstream3.utils.DataStoreHelper.ResumeWatchingResult.getEpisode
import com.lagradost.cloudstream3.utils.VideoDownloadManager.getFileName
import com.lagradost.cloudstream3.utils.VideoDownloadManager.DownloadEpisodeMetadata.getType
import com.lagradost.cloudstream3.utils.VideoDownloadManager.DownloadEpisodeMetadata.mainName
import com.lagradost.cloudstream3.utils.VideoDownloadManager.sanitizeFilename
import com.lagradost.cloudstream3.utils.DataStore.getFolderName
import com.lagradost.cloudstream3.utils.VideoDownloadManager.downloadEpisodeUsingWorker
import com.lagradost.cloudstream3.utils.SubtitleHelper.fromLanguageToTwoLetters
import com.lagradost.cloudstream3.ActorData.actor
import com.lagradost.cloudstream3.Actor.image
import com.lagradost.cloudstream3.utils.SingleSelectionHelper.showBottomDialog
import com.lagradost.cloudstream3.utils.AppUtils.openBrowser
import com.lagradost.cloudstream3.utils.Coroutines.main
import com.lagradost.cloudstream3.utils.UIHelper.popupMenuNoIcons
import com.lagradost.cloudstream3.utils.SyncUtil.getIdsFromUrl
import com.lagradost.cloudstream3.syncproviders.SyncRepo.getStatus
import com.lagradost.cloudstream3.syncproviders.SyncRepo.score
import com.lagradost.cloudstream3.Actor.name
import com.lagradost.cloudstream3.syncproviders.SyncAPI.SyncStatus.getScore
import com.lagradost.cloudstream3.syncproviders.SyncAPI.SyncStatus.status
import com.lagradost.cloudstream3.syncproviders.SyncAPI.SyncStatus.getMaxEpisodes
import com.lagradost.cloudstream3.utils.VideoDownloadHelper.ResumeWatching.getEpisodeId
import com.lagradost.cloudstream3.MainAPI.vpnStatus
import com.lagradost.cloudstream3.MainAPI.providerType
import com.lagradost.cloudstream3.LoadResponse.type
import com.lagradost.cloudstream3.TvSeriesLoadResponse.getEpisodes
import com.lagradost.cloudstream3.TvSeriesLoadResponse.showStatus
import com.lagradost.cloudstream3.AnimeLoadResponse.showStatus
import com.lagradost.cloudstream3.LoadResponse.getYear
import com.lagradost.cloudstream3.LoadResponse.trailers
import com.lagradost.cloudstream3.LoadResponse.syncData
import com.lagradost.cloudstream3.LoadResponse.url
import com.lagradost.cloudstream3.LoadResponse.apiName
import com.lagradost.cloudstream3.LoadResponse.posterHeaders
import com.lagradost.cloudstream3.LoadResponse.comingSoon
import com.lagradost.cloudstream3.MainAPI.hasDownloadSupport
import com.lagradost.cloudstream3.APIHolder.getId
import com.lagradost.cloudstream3.utils.DataStoreHelper.setBookmarkedData
import com.lagradost.cloudstream3.utils.DataStoreHelper.BookmarkedData.bookmarkedTime
import com.lagradost.cloudstream3.utils.UIHelper.setImageBlur
import com.lagradost.cloudstream3.LoadResponse.reviewUrl
import com.lagradost.cloudstream3.utils.FillerEpisodeCheck.getFillerEpisodes
import com.lagradost.cloudstream3.MainAPIKt.sortUrls
import com.lagradost.cloudstream3.utils.VideoDownloadManager.downloadThing
import com.lagradost.cloudstream3.utils.ExtractorSubtitleLink.name
import com.lagradost.cloudstream3.utils.ExtractorSubtitleLink.url
import com.lagradost.cloudstream3.utils.Qualities.Companion.getStringByInt
import com.lagradost.cloudstream3.CommonActivity.getCastSession
import com.lagradost.cloudstream3.utils.CastHelper.startCast
import com.lagradost.cloudstream3.utils.DataStoreHelper.ResumeWatchingResult.isFromDownload
import com.lagradost.cloudstream3.utils.AppUtils.loadSearchResult
import com.lagradost.cloudstream3.utils.UIHelper.hideKeyboard
import com.lagradost.cloudstream3.AcraApplication.Companion.removeKey
import com.lagradost.cloudstream3.services.ApiUtils.createApi
import com.lagradost.cloudstream3.services.ApiService.downloadZipSubtitleFile
import com.lagradost.cloudstream3.services.ApiService.upload
import com.lagradost.cloudstream3.services.ResponseSubtitle.fullPath
import com.lagradost.cloudstream3.utils.InAppUpdater.Companion.runAutoUpdate
import com.lagradost.cloudstream3.utils.VideoDownloadManager.downloadDeleteEvent
import com.lagradost.cloudstream3.utils.VideoDownloadManager.downloadProgressEvent
import com.lagradost.cloudstream3.utils.VideoDownloadManager.downloadStatusEvent
import com.lagradost.cloudstream3.utils.VideoDownloadManager.getDownloadState
import com.lagradost.cloudstream3.utils.VideoDownloadManager.deleteFileAndUpdateSettings
import com.lagradost.cloudstream3.utils.VideoDownloadHelper.DownloadEpisodeCached.id
import com.lagradost.cloudstream3.utils.DataStoreHelper.fixVisual
import com.lagradost.cloudstream3.utils.AppUtils.getNameFull
import com.lagradost.cloudstream3.utils.VideoDownloadHelper.DownloadEpisodeCached.name
import com.lagradost.cloudstream3.utils.VideoDownloadHelper.DownloadEpisodeCached.episode
import com.lagradost.cloudstream3.utils.VideoDownloadHelper.DownloadEpisodeCached.getSeason
import com.lagradost.cloudstream3.utils.VideoDownloadHelper.DownloadHeaderCached.poster
import com.lagradost.cloudstream3.utils.VideoDownloadHelper.DownloadHeaderCached.name
import com.lagradost.cloudstream3.utils.VideoDownloadHelper.DownloadHeaderCached.hashCode
import com.lagradost.cloudstream3.utils.VideoDownloadHelper.DownloadEpisodeCached.hashCode
import com.lagradost.cloudstream3.utils.VideoDownloadHelper.DownloadEpisodeCached.parentId
import com.lagradost.cloudstream3.utils.VideoDownloadHelper.DownloadHeaderCached.id
import com.lagradost.cloudstream3.utils.VideoDownloadHelper.DownloadHeaderCached.getType
import com.lagradost.cloudstream3.utils.AppUtils.loadResult
import com.lagradost.cloudstream3.utils.VideoDownloadHelper.DownloadHeaderCached.url
import com.lagradost.cloudstream3.utils.VideoDownloadHelper.DownloadHeaderCached.apiName
import com.lagradost.cloudstream3.utils.DataStore.getKeys
import com.lagradost.cloudstream3.utils.SingleSelectionHelper.showMultiDialog
import com.lagradost.cloudstream3.APIHolder.getApiDubstatusSettings
import com.lagradost.cloudstream3.utils.SubtitleHelper.getFlagFromIso
import com.lagradost.cloudstream3.APIHolder.getApiProviderLangSettings
import com.lagradost.cloudstream3.MainAPI.getLang
import com.lagradost.cloudstream3.syncproviders.AuthAPI.LoginInfo.name
import com.lagradost.cloudstream3.syncproviders.AuthAPI.LoginInfo.accountIndex
import com.lagradost.cloudstream3.syncproviders.AuthAPI.name
import com.lagradost.cloudstream3.syncproviders.AuthAPI.logOut
import com.lagradost.cloudstream3.syncproviders.AuthAPI.createAccountUrl
import com.lagradost.cloudstream3.syncproviders.InAppAuthAPI.requiresUsername
import com.lagradost.cloudstream3.syncproviders.InAppAuthAPI.requiresPassword
import com.lagradost.cloudstream3.syncproviders.InAppAuthAPI.requiresServer
import com.lagradost.cloudstream3.syncproviders.InAppAuthAPI.requiresEmail
import com.lagradost.cloudstream3.syncproviders.AccountManager.accounts
import com.lagradost.cloudstream3.syncproviders.AccountManager.accountIndex
import com.lagradost.cloudstream3.syncproviders.AuthAPI.loginInfo
import com.lagradost.cloudstream3.syncproviders.AccountManager.Companion.openSubtitlesApi
import com.lagradost.cloudstream3.syncproviders.AccountManager.Companion.nginxApi
import com.lagradost.cloudstream3.APIHolder.allProviders
import com.lagradost.cloudstream3.utils.VideoDownloadManager.downloadDir
import com.lagradost.cloudstream3.utils.BackupUtils.backup
import com.lagradost.cloudstream3.utils.BackupUtils.restorePrompt
import com.lagradost.cloudstream3.syncproviders.AccountManager.Companion.accountManagers
import com.lagradost.cloudstream3.syncproviders.InAppAuthAPI.login
import com.lagradost.cloudstream3.CommonActivity.Companion.`showToast$default`
import com.lagradost.cloudstream3.CommonActivity.setLocale
import com.lagradost.cloudstream3.syncproviders.AccountManager.changeAccount
import com.lagradost.cloudstream3.utils.VideoDownloadManager.getBasePath
import com.lagradost.cloudstream3.CommonActivity.onColorSelectedEvent
import com.lagradost.cloudstream3.CommonActivity.onDialogDismissedEvent
import com.lagradost.cloudstream3.APIHolder.filterProviderByPreferredMedia
import com.lagradost.cloudstream3.MainAPI.hasQuickSearch
import com.lagradost.cloudstream3.MainAPI.load
import com.lagradost.cloudstream3.MainAPIKt.fixUrl
import com.lagradost.cloudstream3.MainAPI.search
import com.lagradost.cloudstream3.utils.UIHelper.adjustAlpha
import com.lagradost.cloudstream3.utils.CastHelper.getMediaInfo
import com.lagradost.cloudstream3.utils.CastHelper.awaitLinks
import com.lagradost.cloudstream3.MainAPI.loadPage
import com.lagradost.cloudstream3.MainAPI.getMainPage
import com.lagradost.cloudstream3.MainAPI.quickSearch
import com.lagradost.cloudstream3.utils.AppUtils.toJson
import com.google.android.exoplayer2.text.ttml.TtmlNode
import com.facebook.appevents.internal.ViewHierarchyConstants
import com.phimhd.BaseFragment
import View.OnClickListener
import com.lagradost.cloudstream3.p041ui.home.HomeFragment
import com.lagradost.cloudstream3.HomePageResponse
import kotlin.jvm.internal.DefaultConstructorMarker
import com.lagradost.cloudstream3.SearchResponse
import com.lagradost.cloudstream3.HomePageList
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.bongngotv2.R
import com.lagradost.cloudstream3.p041ui.AutofitRecyclerView
import com.lagradost.cloudstream3.p041ui.search.SearchAdaptor
import kotlin.collections.CollectionsKt
import com.lagradost.cloudstream3.p041ui.home.``HomeFragment$Companion$loadHomepageList$2`
import com.lagradost.cloudstream3.utils.AppUtils
import kotlin.jvm.internal.Intrinsics

/* compiled from: HomeFragment.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
    m107d2 = ["<anonymous>", "", "callback", "Lcom/lagradost/cloudstream3/ui/search/SearchClickCallback;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* renamed from: com.lagradost.cloudstream3.ui.home.HomeFragment$onViewCreated$12 */ /* loaded from: classes3.dex */
internal class `HomeFragment$onViewCreated$12`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(  /* synthetic */
    val `this$0`: HomeFragment
) : Lambda<Any?>(1), Function1<SearchClickCallback, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(searchClickCallback: SearchClickCallback) {
        invoke2(searchClickCallback)
        return Unit.INSTANCE
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: HomeFragment.kt */
    @Metadata(
        m108d1 = ["\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"],
        m107d2 = ["<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "", "invoke"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.home.HomeFragment$onViewCreated$12$1 */ /* loaded from: classes3.dex */
    class C48591 internal constructor(/* synthetic */val `this$0`: HomeFragment,
                                                     searchClickCallback: SearchClickCallback
    ) : Lambda<Any?>(1), Function1<Tuples<out Boolean?, out Integer?>, Unit> {
        /* synthetic */ val `$callback`: SearchClickCallback

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        init {
            `$callback` = searchClickCallback
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */  override fun invoke(tuples: Tuples<out Boolean?, out Integer?>) {
            invoke2(tuples as Tuples<Boolean?, Integer?>)
            return Unit.INSTANCE
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        fun invoke2(tuples: Tuples<Boolean?, Integer?>) {
            Intrinsics.checkNotNullParameter(tuples, "<name for destructuring parameter 0>")
            val booleanValue: Boolean = tuples.component1().booleanValue()
            val intValue: Int = tuples.component2().intValue()
            if (!booleanValue) {
                if (intValue == 0) {
                    `invoke$info`(`this$0`, `$callback`)
                } else if (intValue != 1) {
                } else {
                    `invoke$remove`(`$callback`, `this$0`)
                }
            } else if (intValue == 0) {
                `invoke$play`(`this$0`, `$callback`)
            } else if (intValue == 1) {
                `invoke$info`(`this$0`, `$callback`)
            } else if (intValue != 2) {
            } else {
                `invoke$remove`(`$callback`, `this$0`)
            }
        }

        companion object {
            private fun `invoke$play`(
                homeFragment: HomeFragment,
                searchClickCallback: SearchClickCallback
            ) {
                `loadSearchResult$default`(
                    AppUtils.INSTANCE,
                    homeFragment.getActivity(),
                    searchClickCallback.getCard(),
                    1,
                    null,
                    4,
                    null
                )
                homeFragment.reloadStored()
            }

            private fun `invoke$remove`(
                searchClickCallback: SearchClickCallback,
                homeFragment: HomeFragment
            ) {
                DataStoreHelper.INSTANCE.setResultWatchState(
                    searchClickCallback.getCard().id,
                    WatchType.NONE.getInternalId()
                )
                homeFragment.reloadStored()
            }

            private fun `invoke$info`(
                homeFragment: HomeFragment,
                searchClickCallback: SearchClickCallback
            ) {
                SearchHelper.Companion.INSTANCE.handleSearchClickCallback(
                    homeFragment.getActivity(),
                    SearchClickCallback(
                        0,
                        searchClickCallback.getView(),
                        -1,
                        searchClickCallback.getCard()
                    )
                )
                homeFragment.reloadStored()
            }
        }
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(callback: SearchClickCallback) {
        Intrinsics.checkNotNullParameter(callback, "callback")
        if (callback.getAction() != 1) {
            `this$0`.homeHandleSearch(callback)
            return
        }
        val activity: FragmentActivity? = `this$0`.getActivity()
        if (activity != null) {
            SingleSelectionHelper.INSTANCE.showOptionSelectStringRes(
                activity,
                callback.getView(),
                callback.getCard().posterUrl,
                CollectionsKt.listOf<Object>(
                    *arrayOf<Integer>(
                        Integer.valueOf(
                            R.string.action_open_watching
                        ), Integer.valueOf(R.string.action_remove_from_bookmarks)
                    ) as Array<Object>
                ),
                CollectionsKt.listOf<Object>(
                    *arrayOf<Integer>(
                        Integer.valueOf(
                            R.string.action_open_play
                        ),
                        Integer.valueOf(R.string.action_open_watching),
                        Integer.valueOf(R.string.action_remove_from_bookmarks)
                    ) as Array<Object>
                ),
                C48591(
                    `this$0`, callback
                )
            )
        }
    }
}