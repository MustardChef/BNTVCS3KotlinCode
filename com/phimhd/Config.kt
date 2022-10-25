package com.phimhd

import java.util.ArrayList

/* loaded from: classes4.dex */
class Config {
    @SerializedName("approvedApp")
    var approvedApp = false

    @SerializedName("config")
    var config: String? = null

    @SerializedName("defaultContentPopUpAds")
    var defaultContentPopUpAds: String? = null

    @SerializedName("idPlayerToGetLink")
    var idPlayerToGetLink: String? = null

    @SerializedName("isBanned")
    var isBanned: String? = null

    @SerializedName("isPermitFullscreen")
    var isPermitFullscreen: String? = null

    @SerializedName("isRequired")
    var isRequired = false

    @SerializedName("streamByWebEmbed")
    var isStreamByWebEmbed = false

    @SerializedName(SDKConstants.PARAM_KEY)
    var key: String? = null

    @SerializedName("listBanners")
    var listBanners: ArrayList<Banner>? = null

    @SerializedName("listServers")
    var listServers: String? = null

    @SerializedName("movieOnlyForPremium")
    var isMovieOnlyForPremium = false

    @SerializedName("needToGetLink")
    var needToGetLink: String? = null

    @SerializedName("phone")
    var phone: String? = null

    @SerializedName("premium")
    var premium: String? = null

    @SerializedName("showUpgradeMethod")
    var isShowUpgradeMethod = false

    @SerializedName("token")
    var token: String? = null

    @SerializedName("unlimited")
    var unlimited: String? = null

    @SerializedName("urlApiGetStream")
    var urlApiGetStream: String? = null

    @SerializedName("urlImagePoster")
    var urlImagePoster: String? = null

    @SerializedName("urlPaymentMomo")
    var urlPaymentMomo: String? = null

    @SerializedName("urlPaymentPaypal")
    var urlPaymentPaypal: String? = null

    @SerializedName("urlPrivacy")
    var urlPrivacy: String? = null

    @SerializedName("urlRedirectPoster")
    var urlRedirectPoster: String? = null

    @SerializedName("value")
    var value: String? = null

    @SerializedName("vast")
    var vast: String? = null

    @SerializedName(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION)
    var version = 0f

    @SerializedName("watchAdsToAccessPremiumMovie")
    var isWatchAdsToAccessPremiumMovie = false
    fun getListBanners(): ArrayList<Banner> {
        return listBanners
    }

    fun setListBanners(arrayList: ArrayList<Banner?>) {
        listBanners = arrayList
    }
}