package com.lagradost.cloudstream3.syncproviders

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

/* compiled from: InAppAuthAPI.kt */
@Metadata(
    m108d1 = ["\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\n\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0011\u0010 \u001a\u00020!H\u0097@ø\u0001\u0000¢\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020!H\u0016J\u0019\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u001fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010&J\n\u0010'\u001a\u0004\u0018\u00010(H\u0016R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000c\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"],
    m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/InAppAuthAPIManager;", "Lcom/lagradost/cloudstream3/syncproviders/AccountManager;", "Lcom/lagradost/cloudstream3/syncproviders/InAppAuthAPI;", "defIndex", "", "(I)V", "icon", "getIcon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "idPrefix", "", "getIdPrefix", "()Ljava/lang/String;", "name", "getName", "requiresEmail", "", "getRequiresEmail", "()Z", "requiresLogin", "getRequiresLogin", "requiresPassword", "getRequiresPassword", "requiresServer", "getRequiresServer", "requiresUsername", "getRequiresUsername", "storesPasswordInPlainText", "getStoresPasswordInPlainText", "getLatestLoginData", "Lcom/lagradost/cloudstream3/syncproviders/InAppAuthAPI\$LoginData;", "initialize", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logOut", "login", "data", "(Lcom/lagradost/cloudstream3/syncproviders/InAppAuthAPI\$LoginData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loginInfo", "Lcom/lagradost/cloudstream3/syncproviders/AuthAPI\$LoginInfo;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes3.dex */
abstract class InAppAuthAPIManager(i: Int) : AccountManager(i), InAppAuthAPI {
    // com.lagradost.cloudstream3.syncproviders.AuthAPI
    @get:Override
    override val icon: Integer? = null

    // com.lagradost.cloudstream3.syncproviders.InAppAuthAPI
    @get:Override
    override val requiresEmail = false

    // com.lagradost.cloudstream3.syncproviders.AuthAPI
    @get:Override
    override val requiresLogin = true

    // com.lagradost.cloudstream3.syncproviders.InAppAuthAPI
    @get:Override
    override val requiresPassword = false

    // com.lagradost.cloudstream3.syncproviders.InAppAuthAPI
    @get:Override
    override val requiresServer = false

    // com.lagradost.cloudstream3.syncproviders.InAppAuthAPI
    @get:Override
    override val requiresUsername = false

    // com.lagradost.cloudstream3.syncproviders.InAppAuthAPI
    @get:Override
    override val storesPasswordInPlainText = true
    open fun initialize(continuation: Continuation<in Unit>?): Object? {
        return Unit.INSTANCE
    }

    @Override // com.lagradost.cloudstream3.syncproviders.InAppAuthAPI
    override fun login(loginData: LoginData?, continuation: Continuation<in Boolean?>?): Object {
        return `login$suspendImpl`(this, loginData, continuation)
    }

    @Override // com.lagradost.cloudstream3.syncproviders.AuthAPI
    override fun logOut() {
        throw Standard(null, 1, null)
    }

    // com.lagradost.cloudstream3.syncproviders.AuthAPI
    @get:Override
    override val idPrefix: String
        // com.lagradost.cloudstream3.syncproviders.AuthAPI
        get() {
            throw Standard(null, 1, null)
        }

    // com.lagradost.cloudstream3.syncproviders.AuthAPI
    @get:Override
    override val name: String
        // com.lagradost.cloudstream3.syncproviders.AuthAPI
        get() {
            throw Standard(null, 1, null)
        }

    // com.lagradost.cloudstream3.syncproviders.InAppAuthAPI
    @get:Override
    override val latestLoginData: LoginData?
        // com.lagradost.cloudstream3.syncproviders.InAppAuthAPI
        get() {
            throw Standard(null, 1, null)
        }

    @Override // com.lagradost.cloudstream3.syncproviders.AuthAPI
    override fun loginInfo(): LoginInfo? {
        throw Standard(null, 1, null)
    }

    companion object {
        fun  /* synthetic */`login$suspendImpl`(
            inAppAuthAPIManager: InAppAuthAPIManager?,
            loginData: LoginData?,
            continuation: Continuation<*>?
        ): Object {
            throw Standard(null, 1, null)
        }
    }
}