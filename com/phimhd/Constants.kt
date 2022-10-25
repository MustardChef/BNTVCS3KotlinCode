package com.phimhd

import com.lagradost.cloudstream3.services.ApiUtils.createApi
import com.lagradost.cloudstream3.services.ApiService.checkKeyWithToken
import com.lagradost.cloudstream3.services.ApiResponse.isSuccess
import com.lagradost.cloudstream3.services.ApiResponse.message
import com.lagradost.cloudstream3.services.ApiService.checkKey
import com.lagradost.cloudstream3.p041ui.home.HomeFragment.currentApiName
import com.lagradost.cloudstream3.p041ui.livetv.LiveTvSportFragment.Companion.pushSearch
import com.lagradost.cloudstream3.Page.name
import com.lagradost.cloudstream3.Page.getUrl
import com.lagradost.cloudstream3.HomePageResponse.titleMenuCountry
import com.lagradost.cloudstream3.p041ui.home.PageBottomSheet.Companion.newInstance
import com.lagradost.cloudstream3.Page.getNameApi
import com.lagradost.cloudstream3.HomePageResponse.titleMenuGenres
import com.lagradost.cloudstream3.utils.UIHelper.Companion.`setImage$default`
import com.lagradost.cloudstream3.SearchResponse.name
import com.lagradost.cloudstream3.AnimeSearchResponse.getDubStatus
import com.lagradost.cloudstream3.SearchResponse.posterUrl
import com.lagradost.cloudstream3.utils.UIHelper.setImageBlur
import com.lagradost.cloudstream3.SearchResponse.posterHeaders
import com.lagradost.cloudstream3.utils.AppUtils.Companion.`loadSearchResult$default`
import com.lagradost.cloudstream3.APIHolder.getApiNameFromUrl
import com.lagradost.cloudstream3.AcraApplication.onCreate
import com.lagradost.cloudstream3.services.ApiService.getConfig
import com.lagradost.cloudstream3.Page.isSelected
import com.lagradost.cloudstream3.Page.description
import com.lagradost.cloudstream3.p041ui.browser.ICallback.onCallback
import com.lagradost.cloudstream3.utils.SingleSelectionHelper.showDialog
import com.lagradost.cloudstream3.utils.UIHelper.hideKeyboard
import com.google.gson.annotations.SerializedName
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants
import com.fasterxml.jackson.annotation.JsonProperty
import com.phimhd.IPTV
import androidx.tvprovider.media.p009tv.TvContractCompat
import com.phimhd.Banner
import com.facebook.internal.ServerProtocol
import com.phimhd.ListIPTV
import com.google.gson.annotations.Expose
import com.facebook.appevents.UserDataStore
import com.google.android.exoplayer2.text.ttml.TtmlNode
import com.phimhd.AESHelper
import com.phimhd.MovieHome
import com.phimhd.ConfigHome
import com.phimhd.BaseActivity
import com.applovin.mediation.ads.MaxInterstitialAd
import com.phimhd.AdsActivity
import com.phimhd.``AdsActivity$initAds$1`

/* loaded from: classes4.dex */
object Constants {
    const val APPLOVIN_UNIT_ID_ADS_INTERSTITIAL_DOWNLOAD_MOVIE = "f6489886b41a475c"
    const val APPLOVIN_UNIT_ID_ADS_INTERSTITIAL_EXIT_MOVIE = "f6489886b41a475c"
    const val APPLOVIN_UNIT_ID_ADS_INTERSTITIAL_MOVIE = "ba2444945d00d18d"
    const val APP_ID_SMARTAPP = "200591559"
    const val BUNDLE = "BUNDLE"
    const val COLLECTION_ID_CINEMA_MOVIE = "60d014acc04505ac8cc91060"
    const val COLLECTION_ID_DRAMA_MOVIE = "60d014d2c04505ac8cc91062"
    const val COLLECTION_ID_FORYOU = "60d015d9c04505ac8cc91065"
    const val COLLECTION_ID_GENRE = "60d01515c04505ac8cc91063"
    const val COLLECTION_ID_RECOMMEND_MOVIE = "60d0148ec04505ac8cc9105f"
    const val COLLECTION_ID_TRAILER = "60d01580c04505ac8cc91064"
    const val COLLECTION_ID_TRENDING_MOVIE = "60d0144ac04505ac8cc9105e"
    const val COLLECTION_ID_TVSHOW = "60d014bfc04505ac8cc91061"
    const val COLLECTION_ID_WATCHED_MOVIE = "60d01407c04505ac8cc9105d"
    const val DURATION_BANNER: Long = 10000
    const val DURATION_DEFAULT_ANIMATION = 200
    const val DURATION_SHOW_BOTTOM_SHEET_DOWNLOAD: Long = 5000
    const val HOST_EMBED = "HOST_EMBED"
    const val INTENT_ACTION_UPDATE_VIEW = "com.phimhd.INTENT_UPDATE_VIEW"
    const val INTENT_PROGRESS_DOWNLOAD = "com.phimhd.INTENT_PROGRESS_DOWNLOAD"
    const val INTENT_UPDATE_KEY = "com.phimhd.INTENT_UPDATE_KEY"
    const val IS_PLAY_AD = "IS_PLAY_AD"
    const val KEY_DOWNLOAD_DATA = "KEY_DOWNLOAD_DATA"
    const val KEY_HISTORY = "HISTORY"
    const val KEY_PROGRESS_DOWNLOAD = "KEY_PROGRESS_DOWNLOAD"
    const val KEY_SERIES = "/series"
    const val MAX_ITEM_BANNER = 10
    const val MAX_MOVIE_PER_REQUEST = 15
    const val MSG = "MSG"
    const val MSG_PARSE_HTML = 1000
    const val REQUEST_CODE_OPEN_WEBEMBED = 81
    const val RESULT_CODE_PERCENT = 91
    const val RESULT_OPEN_DOWNLOAD = 10
    const val RESULT_SEARCH_NAME = 991
    const val TIME_30MIN_TO_SHOW_ADS: Long = 1800000
    const val TIME_EXPIRED: Long = 21600000
    const val TIME_INTERVAL: Long = 1000
    const val TIME_TO_SHOW_ADS: Long = 300000
    const val TOKEN_GET_EPS = "TOKEN_EPS"
    const val UNIT_ID_ADS = "ca-app-pub-4210645197299676/6275590549"
    const val UNIT_ID_ADS_FAKE = "ca-app-pub-3940256099942544/1033173712"
    const val UNIT_ID_ADS_INTERSTITIAL = "ca-app-pub-8111851745620460/4864273000"
    const val UNIT_ID_ADS_INTERSTITIAL_EXIT_MOVIE = "ca-app-pub-8111851745620460/2238109661"
    const val UNIT_ID_ADS_RETURN = "ca-app-pub-8133704302449527/2348028171"
    const val UNIT_ID_ADS_VIDEO_REWARD = "ca-app-pub-8111851745620460/4463983608"
    const val UNIT_ID_ADS_VIDEO_REWARD_FAKE = "ca-app-pub-3940256099942544/5224354917"
    const val URL_HOME = "https://bapngoz.com/"
    const val URL_HOME_BONG_NGOZZ = "https://bongngozz.com/"
    const val URL_HOME_FLIXTOR = "https://flixtor.video/home"
    const val URL_MENU_1 = "https://bapngoz.com/phim-chieu-rap/"
    const val URL_MENU_2 = "https://bapngoz.com/phim-le/"
    const val URL_MENU_3 = "https://bapngoz.com/the-loai/tv-show/"
    const val URL_MENU_4 = "https://bapngoz.com/phim-bo/"
    const val URL_MENU_5 =
        "https://bilutvzz.net/danh-sach/phim-moi/?order=&type=&cat_id=4&city_id=&year="
    const val URL_PAGE = "https://m.me/phimhdlr"
    const val URL_PAGE_ADS = "https://download.dongjav.app"
    const val URL_RECEIVE = "https://nhantien.momo.vn/0962672240"
    const val URL_RECEIVE_PAYPAL = "https://paypal.me/duongnv1996"
    const val URL_ROOT_BILUTV = "https://bilutvs.net/"
    const val URL_ROOT_FLIXTOR = "https://flixtor.video/"
    const val URL_SEARCH = "https://bapngoz.com/phim-chieu-rap/"
    const val URL_SEARCH_DEFAULT_FLIXTOR = "https://flixtor.video/filter?sort=views%3Adesc"
    const val URL_VAST = "https://phimhd.xyz/api/phimhd/ads"
    const val URL_WEBSITE = "http://phimhd.xyz/"
    const val UUID_ADS_COLONY = "appd76d0784045f430ab8"
    const val ZONE_1_ID_ADS_COLONY = "vzddaa988e5df74c9284"
}