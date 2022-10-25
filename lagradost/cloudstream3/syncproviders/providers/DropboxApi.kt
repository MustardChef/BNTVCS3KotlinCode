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
import kotlin.jvm.internal.Intrinsics

@Metadata(
    m108d1 = ["\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0019\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u001aH\u0016J\n\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"],
    m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/Dropbox;", "Lcom/lagradost/cloudstream3/syncproviders/OAuth2API;", "()V", "createAccountUrl", "", "getCreateAccountUrl", "()Ljava/lang/String;", "icon", "", "getIcon", "()Ljava/lang/Integer;", "idPrefix", "getIdPrefix", SDKConstants.PARAM_KEY, "getKey", "name", "getName", "setName", "(Ljava/lang/String;)V", "redirectUrl", "getRedirectUrl", "requiresLogin", "", "getRequiresLogin", "()Z", "authenticate", "", "handleRedirect", "url", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logOut", "loginInfo", "Lcom/lagradost/cloudstream3/syncproviders/AuthAPI\$LoginInfo;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.syncproviders.providers.Dropbox */ /* loaded from: classes3.dex */
class DropboxApi : OAuth2API {
    // com.lagradost.cloudstream3.syncproviders.AuthAPI
    @get:Override
    val createAccountUrl: String? = null

    // com.lagradost.cloudstream3.syncproviders.AuthAPI
    @get:Override
    val idPrefix = "dropbox"

    // com.lagradost.cloudstream3.syncproviders.AuthAPI
    @get:Override
    var name = "Dropbox"
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.syncproviders.OAuth2API
    @get:Override
    val key = "zlqsamadlwydvb2"

    // com.lagradost.cloudstream3.syncproviders.OAuth2API
    @get:Override
    val redirectUrl = "dropboxlogin"

    // com.lagradost.cloudstream3.syncproviders.AuthAPI
    @get:Override
    val requiresLogin = true

    // com.lagradost.cloudstream3.syncproviders.AuthAPI
    @get:Override
    val icon: Integer?
        // com.lagradost.cloudstream3.syncproviders.AuthAPI
        get() {
            throw Standard("An operation is not implemented: Not yet implemented")
        }

    @Override // com.lagradost.cloudstream3.syncproviders.OAuth2API
    override fun authenticate() {
        throw Standard("An operation is not implemented: Not yet implemented")
    }

    @Override // com.lagradost.cloudstream3.syncproviders.OAuth2API
    override fun handleRedirect(str: String?, continuation: Continuation<in Boolean?>?): Object? {
        throw Standard("An operation is not implemented: Not yet implemented")
    }

    @Override // com.lagradost.cloudstream3.syncproviders.AuthAPI
    override fun logOut() {
        throw Standard("An operation is not implemented: Not yet implemented")
    }

    @Override // com.lagradost.cloudstream3.syncproviders.AuthAPI
    override fun loginInfo(): LoginInfo? {
        throw Standard("An operation is not implemented: Not yet implemented")
    }
}