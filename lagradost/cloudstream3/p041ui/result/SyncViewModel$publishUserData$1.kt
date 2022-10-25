package com.lagradost.cloudstream3.p041ui.result

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
import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: SyncViewModel.kt */
@Metadata(
    m108d1 = ["\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"],
    m107d2 = ["<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.ui.result.SyncViewModel\$publishUserData$1",
    m98f = "SyncViewModel.kt",
    m97i = [0],
    m96l = [172],
    m95m = "invokeSuspend",
    m94n = ["user"],
    m93s = ["L$0"]
) /* renamed from: com.lagradost.cloudstream3.ui.result.SyncViewModel$publishUserData$1 */ /* loaded from: classes4.dex */
class `SyncViewModel$publishUserData$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(/* synthetic */
    val `this$0`: SyncViewModel, continuation: Continuation<in `SyncViewModel$publishUserData$1`?>?
) : SuspendLambda(2, continuation), Function2<CoroutineScope, Continuation<in Unit>?, Object> {
    var `L$0`: Object? = null
    var `L$1`: Object? = null
    var `L$2`: Object? = null
    var label: Int = 0

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        return `SyncViewModel$publishUserData$1`(`this$0`, continuation)
    }

    @Override // kotlin.jvm.functions.Function2
    public override fun invoke(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in Unit>?
    ): Object {
        return (create(
            coroutineScope,
            continuation
        ) as `SyncViewModel$publishUserData$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00ac -> B:26:0x00b3). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */ public override fun invokeSuspend(r12: Any?): Any {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.label
            r2 = 1
            if (r1 == 0) goto L29
            if (r1 != r2) goto L21
            java.lang.Object r1 = r11.L$2
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r3 = r11.L$1
            com.lagradost.cloudstream3.ui.result.SyncViewModel r3 = (com.lagradost.cloudstream3.p041ui.result.SyncViewModel) r3
            java.lang.Object r4 = r11.L$0
            com.lagradost.cloudstream3.mvvm.Resource r4 = (com.lagradost.cloudstream3.mvvm.Resource) r4
            kotlin.ResultKt.throwOnFailure(r12)
            r5 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r11
            goto Lb3
        L21:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L29:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.String r12 = "SYNCVM"
            java.lang.String r1 = "publishUserData"
            android.util.Log.i(r12, r1)
            com.lagradost.cloudstream3.ui.result.SyncViewModel r12 = r11.this$0
            androidx.lifecycle.LiveData r12 = r12.getUserData()
            java.lang.Object r12 = r12.getValue()
            com.lagradost.cloudstream3.mvvm.Resource r12 = (com.lagradost.cloudstream3.mvvm.Resource) r12
            boolean r1 = r12 instanceof com.lagradost.cloudstream3.mvvm.Resource.Success
            if (r1 == 0) goto Lbb
            com.lagradost.cloudstream3.ui.result.SyncViewModel r1 = r11.this$0
            java.util.Map r1 = com.lagradost.cloudstream3.p041ui.result.SyncViewModel.access$getSyncs$p(r1)
            com.lagradost.cloudstream3.ui.result.SyncViewModel r3 = r11.this$0
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r4 = r12
            r12 = r11
        L55:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto Lbc
            java.lang.Object r5 = r1.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            java.util.List r7 = com.lagradost.cloudstream3.p041ui.result.SyncViewModel.access$getRepos$p(r3)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L77:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L8f
            java.lang.Object r8 = r7.next()
            r9 = r8
            com.lagradost.cloudstream3.syncproviders.SyncRepo r9 = (com.lagradost.cloudstream3.syncproviders.SyncRepo) r9
            java.lang.String r9 = r9.getIdPrefix()
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r6)
            if (r9 == 0) goto L77
            goto L90
        L8f:
            r8 = 0
        L90:
            com.lagradost.cloudstream3.syncproviders.SyncRepo r8 = (com.lagradost.cloudstream3.syncproviders.SyncRepo) r8
            if (r8 == 0) goto L55
            r6 = r4
            com.lagradost.cloudstream3.mvvm.Resource$Success r6 = (com.lagradost.cloudstream3.mvvm.Resource.Success) r6
            java.lang.Object r6 = r6.getValue()
            com.lagradost.cloudstream3.syncproviders.SyncAPI$SyncStatus r6 = (com.lagradost.cloudstream3.syncproviders.SyncAPI.SyncStatus) r6
            r12.L$0 = r4
            r12.L$1 = r3
            r12.L$2 = r1
            r12.label = r2
            java.lang.Object r5 = r8.score(r5, r6, r12)
            if (r5 != r0) goto Lac
            return r0
        Lac:
            r10 = r0
            r0 = r12
            r12 = r5
            r5 = r4
            r4 = r3
            r3 = r1
            r1 = r10
        Lb3:
            com.lagradost.cloudstream3.mvvm.Resource r12 = (com.lagradost.cloudstream3.mvvm.Resource) r12
            r12 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r4 = r5
            goto L55
        Lbb:
            r12 = r11
        Lbc:
            com.lagradost.cloudstream3.ui.result.SyncViewModel r12 = r12.this$0
            r12.updateUserData()
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.p041ui.result.SyncViewModel\$publishUserData$1.invokeSuspend(java.lang.Object):java.lang.Object")
    }
}