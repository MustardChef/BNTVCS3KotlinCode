package com.lagradost.cloudstream3.syncproviders.providers

import com.lagradost.cloudstream3.utils.DataStore.getSharedPrefs
import com.lagradost.cloudstream3.utils.DataStore.getFolderName
import com.lagradost.cloudstream3.utils.DataStore.mapper
import com.lagradost.cloudstream3.AcraApplication.Companion.openBrowser
import com.lagradost.cloudstream3.AcraApplication.Companion.setKey
import com.lagradost.cloudstream3.utils.Coroutines.ioSafe
import com.lagradost.cloudstream3.AcraApplication.Companion.removeKey
import com.lagradost.cloudstream3.AcraApplication.Companion.removeKeys
import com.google.firebase.analytics.FirebaseAnalytics
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants
import androidx.constraintlayout.core.motion.utils.TypedValues
import com.lagradost.cloudstream3.syncproviders.AccountManager
import com.lagradost.cloudstream3.syncproviders.SyncAPI
import com.lagradost.cloudstream3.syncproviders.providers.MALApi.MalTitleHolder
import com.fasterxml.jackson.databind.json.JsonMapper
import com.bongngotv2.R
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.fasterxml.jackson.databind.DeserializationFeature
import com.lagradost.cloudstream3.syncproviders.AuthAPI.LoginInfo
import com.lagradost.cloudstream3.AcraApplication
import com.lagradost.cloudstream3.utils.DataStore
import com.lagradost.cloudstream3.syncproviders.providers.MALApi
import com.lagradost.cloudstream3.syncproviders.SyncAPI.SyncSearchResult
import kotlin.text.MatchResult
import kotlin.text.Regex
import kotlin.collections.CollectionsKt
import com.lagradost.cloudstream3.syncproviders.SyncAPI.SyncStatus
import kotlin.text.StringsKt
import kotlin.coroutines.jvm.internal.boxing
import com.fasterxml.jackson.annotation.JsonProperty
import com.lagradost.cloudstream3.syncproviders.providers.MALApi.MainPicture
import com.lagradost.cloudstream3.syncproviders.providers.MALApi.MyListStatus
import com.lagradost.cloudstream3.syncproviders.providers.MALApi.StartSeason
import com.lagradost.cloudstream3.syncproviders.providers.MALApi.RelatedAnime
import com.lagradost.cloudstream3.syncproviders.providers.MALApi.Studios
import com.lagradost.cloudstream3.syncproviders.providers.MALApi.Statistics
import com.lagradost.cloudstream3.syncproviders.providers.MALApi.MalAnime
import kotlin.jvm.JvmOverloads
import kotlin.jvm.internal.DefaultConstructorMarker
import com.uwetrottmann.tmdb2.TmdbHelper
import com.lagradost.cloudstream3.syncproviders.SyncAPI.SyncResult
import com.lagradost.cloudstream3.syncproviders.providers.MALApi.ResponseToken
import com.lagradost.cloudstream3.syncproviders.providers.MALApi.Paging
import com.lagradost.cloudstream3.syncproviders.providers.MALApi.MalList
import com.facebook.share.internal.MessengerShareContentUtility
import com.lagradost.cloudstream3.syncproviders.providers.MALApi.ListStatus
import androidx.tvprovider.media.p009tv.TvContractCompat
import com.lagradost.cloudstream3.syncproviders.providers.MALApi.MalStatusType
import kotlin.collections.ArraysKt
import com.lagradost.cloudstream3.syncproviders.providers.MALApi.SmallMalAnime
import com.lagradost.cloudstream3.mvvm.ArchComponentExt
import kotlin.coroutines.intrinsics.IntrinsicsKt
import com.lagradost.cloudstream3.syncproviders.providers.MALApi.MalUser
import com.facebook.internal.AnalyticsEvents
import com.facebook.AccessToken
import com.lagradost.cloudstream3.syncproviders.providers.MALApi.MalDatum
import com.lagradost.cloudstream3.syncproviders.providers.MALApi.MalRoot
import com.lagradost.cloudstream3.syncproviders.providers.MALApi.MalNode
import com.lagradost.cloudstream3.syncproviders.providers.MALApi.MalStatus
import com.lagradost.cloudstream3.syncproviders.providers.MALApi.MalMainPicture
import com.lagradost.cloudstream3.syncproviders.providers.MALApi.MalSearchNode
import com.lagradost.cloudstream3.syncproviders.providers.MALApi.MalSearch
import com.lagradost.cloudstream3.syncproviders.InAppAuthAPIManager
import com.lagradost.cloudstream3.syncproviders.InAppAuthAPI.LoginData
import com.lagradost.cloudstream3.syncproviders.providers.NginxApi
import com.lagradost.cloudstream3.movieproviders.NginxProvider
import com.lagradost.cloudstream3.syncproviders.providers.AniListApi
import com.lagradost.cloudstream3.syncproviders.providers.AniListApi.GetSearchRoot
import com.lagradost.cloudstream3.syncproviders.providers.AniListApi.GetSearchMedia
import com.lagradost.cloudstream3.syncproviders.providers.AniListApi.Companion.AniListStatusType
import com.lagradost.cloudstream3.syncproviders.providers.AniListApi.SeasonResponse
import com.lagradost.cloudstream3.utils.Coroutines
import com.lagradost.cloudstream3.syncproviders.providers.``AniListApi$initGetUser$1`
import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: MALApi.kt */
@Metadata(m106k = 3, m105mv = [1, 6, 0], m103xi = 48)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.syncproviders.providers.MALApi",
    m98f = "MALApi.kt",
    m97i = [0],
    m96l = [262, bqk.f6535av],
    m95m = "handleRedirect",
    m94n = ["this"],
    m93s = ["L$0"]
) /* loaded from: classes3.dex */
class `MALApi$handleRedirect$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */(/* synthetic */
    val `this$0`: MALApi, continuation: Continuation<in `MALApi$handleRedirect$1`?>?
) : ContinuationImpl(continuation) {
    var `L$0`: Object? = null
    var label = 0

    /* synthetic */
    var result: Object? = null

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        result = obj
        label = label or Integer.MIN_VALUE
        return `this$0`.handleRedirect(null, this)
    }
}