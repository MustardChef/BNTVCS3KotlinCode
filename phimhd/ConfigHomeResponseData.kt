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
import kotlin.jvm.internal.Intrinsics

/* compiled from: ConfigHome.kt */
@Metadata(
    m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"],
    m107d2 = ["Lcom/phimhd/ConfigHomeResponseData;", "", "data", "Lcom/phimhd/ConfigHome;", "(Lcom/phimhd/ConfigHome;)V", "getData", "()Lcom/phimhd/ConfigHome;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class ConfigHomeResponseData(@JsonProperty("data") data: ConfigHome) {
    val data: ConfigHome
    operator fun component1(): ConfigHome {
        return data
    }

    fun copy(@JsonProperty("data") data: ConfigHome): ConfigHomeResponseData {
        Intrinsics.checkNotNullParameter(data, "data")
        return ConfigHomeResponseData(data)
    }

    override fun equals(obj: Object): Boolean {
        return if (this === obj) {
            true
        } else obj is ConfigHomeResponseData && Intrinsics.areEqual(
            data,
            (obj as ConfigHomeResponseData).data
        )
    }

    override fun hashCode(): Int {
        return data.hashCode()
    }

    override fun toString(): String {
        return "ConfigHomeResponseData(data=" + data + ')'
    }

    init {
        Intrinsics.checkNotNullParameter(data, "data")
        this.data = data
    }

    companion object {
        fun  /* synthetic */`copy$default`(
            configHomeResponseData: ConfigHomeResponseData,
            configHome: ConfigHome,
            i: Int,
            obj: Object?
        ): ConfigHomeResponseData {
            var configHome = configHome
            if (i and 1 != 0) {
                configHome = configHomeResponseData.data
            }
            return configHomeResponseData.copy(configHome)
        }
    }
}