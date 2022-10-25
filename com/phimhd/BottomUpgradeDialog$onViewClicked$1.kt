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
import kotlin.jvm.functions.Functions

/* compiled from: BottomUpgradeDialog.kt */
@Metadata(
    m108d1 = ["\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"],
    m107d2 = ["<anonymous>", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes4.dex */
internal class `BottomUpgradeDialog$onViewClicked$1` : Lambda<Any?>(0), Functions<Unit> {
    @Override // kotlin.jvm.functions.Functions
            /* renamed from: invoke  reason: avoid collision after fix types in other method */    fun invoke2() {
    }

    @Override // kotlin.jvm.functions.Functions
    /* bridge */ /* synthetic */  override fun invoke() {
        invoke2()
        return Unit.INSTANCE
    }

    companion object {
        val INSTANCE = `BottomUpgradeDialog$onViewClicked$1`()
    }
}