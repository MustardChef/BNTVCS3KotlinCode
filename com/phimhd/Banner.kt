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
    m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JI\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006\u001e"],
    m107d2 = ["Lcom/phimhd/Banner;", "", "title", "", "urlPhoto", TvContractCompat.Channels.Logo.CONTENT_DIRECTORY, "isSponsor", "", "urlStream", "urlDetail", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "()Z", "getLogo", "()Ljava/lang/String;", "getTitle", "getUrlDetail", "getUrlPhoto", "getUrlStream", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class Banner(
    @JsonProperty("title") title: String,
    @JsonProperty("urlPhoto") urlPhoto: String,
    @JsonProperty("logo") logo: String,
    @JsonProperty("isSponsor") z: Boolean,
    @JsonProperty("urlStream") str: String,
    @JsonProperty("urlDetail") str2: String
) {
    val isSponsor: Boolean
    val logo: String
    val title: String
    val urlDetail: String
    val urlPhoto: String
    val urlStream: String
    operator fun component1(): String {
        return title
    }

    operator fun component2(): String {
        return urlPhoto
    }

    operator fun component3(): String {
        return logo
    }

    operator fun component4(): Boolean {
        return isSponsor
    }

    operator fun component5(): String {
        return urlStream
    }

    operator fun component6(): String {
        return urlDetail
    }

    fun copy(
        @JsonProperty("title") title: String,
        @JsonProperty("urlPhoto") urlPhoto: String,
        @JsonProperty("logo") logo: String,
        @JsonProperty("isSponsor") z: Boolean,
        @JsonProperty("urlStream") str: String,
        @JsonProperty("urlDetail") str2: String
    ): Banner {
        Intrinsics.checkNotNullParameter(title, "title")
        Intrinsics.checkNotNullParameter(urlPhoto, "urlPhoto")
        Intrinsics.checkNotNullParameter(logo, "logo")
        return Banner(title, urlPhoto, logo, z, str, str2)
    }

    override fun equals(obj: Object): Boolean {
        if (this === obj) {
            return true
        }
        if (obj is Banner) {
            val banner = obj as Banner
            return Intrinsics.areEqual(title, banner.title) && Intrinsics.areEqual(
                urlPhoto, banner.urlPhoto
            ) && Intrinsics.areEqual(
                logo,
                banner.logo
            ) && isSponsor == banner.isSponsor && Intrinsics.areEqual(
                urlStream, banner.urlStream
            ) && Intrinsics.areEqual(urlDetail, banner.urlDetail)
        }
        return false
    }

    /* JADX WARN: Multi-variable type inference failed */
    override fun hashCode(): Int {
        val hashCode = ((title.hashCode() * 31 + urlPhoto.hashCode()) * 31 + logo.hashCode()) * 31
        val z = isSponsor
        var i: Int = z.toInt()
        if (z.toInt() != 0) {
            i = 1
        }
        val i2 = (hashCode + i) * 31
        val str = urlStream
        val hashCode2 = (i2 + (str?.hashCode() ?: 0)) * 31
        val str2 = urlDetail
        return hashCode2 + (str2?.hashCode() ?: 0)
    }

    override fun toString(): String {
        return "Banner(title=" + title + ", urlPhoto=" + urlPhoto + ", logo=" + logo + ", isSponsor=" + isSponsor + ", urlStream=" + urlStream + ", urlDetail=" + urlDetail + ')'
    }

    init {
        Intrinsics.checkNotNullParameter(title, "title")
        Intrinsics.checkNotNullParameter(urlPhoto, "urlPhoto")
        Intrinsics.checkNotNullParameter(logo, "logo")
        this.title = title
        this.urlPhoto = urlPhoto
        this.logo = logo
        isSponsor = z
        urlStream = str
        urlDetail = str2
    }

    companion object {
        fun  /* synthetic */`copy$default`(
            banner: Banner,
            str: String,
            str2: String,
            str3: String,
            z: Boolean,
            str4: String,
            str5: String,
            i: Int,
            obj: Object?
        ): Banner {
            var str = str
            var str2 = str2
            var str3 = str3
            var z = z
            var str4 = str4
            var str5 = str5
            if (i and 1 != 0) {
                str = banner.title
            }
            if (i and 2 != 0) {
                str2 = banner.urlPhoto
            }
            val str6 = str2
            if (i and 4 != 0) {
                str3 = banner.logo
            }
            val str7 = str3
            if (i and 8 != 0) {
                z = banner.isSponsor
            }
            val z2 = z
            if (i and 16 != 0) {
                str4 = banner.urlStream
            }
            val str8 = str4
            if (i and 32 != 0) {
                str5 = banner.urlDetail
            }
            return banner.copy(str, str6, str7, z2, str8, str5)
        }
    }
}