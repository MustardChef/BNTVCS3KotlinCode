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
    m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000cR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000c¨\u0006\u001b"],
    m107d2 = ["Lcom/phimhd/MovieHome;", "", "title", "", "urlDetail", "urlPhoto", "urlStream", "isSponsor", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "()Z", "getTitle", "()Ljava/lang/String;", "getUrlDetail", "getUrlPhoto", "getUrlStream", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class MovieHome(
    @JsonProperty("title") title: String,
    @JsonProperty("urlDetail") urlDetail: String,
    @JsonProperty("urlPhoto") urlPhoto: String,
    @JsonProperty("urlStream") urlStream: String,
    @JsonProperty("isSponsor") z: Boolean
) {
    val isSponsor: Boolean
    val title: String
    val urlDetail: String
    val urlPhoto: String
    val urlStream: String
    operator fun component1(): String {
        return title
    }

    operator fun component2(): String {
        return urlDetail
    }

    operator fun component3(): String {
        return urlPhoto
    }

    operator fun component4(): String {
        return urlStream
    }

    operator fun component5(): Boolean {
        return isSponsor
    }

    fun copy(
        @JsonProperty("title") title: String,
        @JsonProperty("urlDetail") urlDetail: String,
        @JsonProperty("urlPhoto") urlPhoto: String,
        @JsonProperty("urlStream") urlStream: String,
        @JsonProperty("isSponsor") z: Boolean
    ): MovieHome {
        Intrinsics.checkNotNullParameter(title, "title")
        Intrinsics.checkNotNullParameter(urlDetail, "urlDetail")
        Intrinsics.checkNotNullParameter(urlPhoto, "urlPhoto")
        Intrinsics.checkNotNullParameter(urlStream, "urlStream")
        return MovieHome(title, urlDetail, urlPhoto, urlStream, z)
    }

    override fun equals(obj: Object): Boolean {
        if (this === obj) {
            return true
        }
        if (obj is MovieHome) {
            val movieHome = obj as MovieHome
            return Intrinsics.areEqual(title, movieHome.title) && Intrinsics.areEqual(
                urlDetail, movieHome.urlDetail
            ) && Intrinsics.areEqual(urlPhoto, movieHome.urlPhoto) && Intrinsics.areEqual(
                urlStream, movieHome.urlStream
            ) && isSponsor == movieHome.isSponsor
        }
        return false
    }

    /* JADX WARN: Multi-variable type inference failed */
    override fun hashCode(): Int {
        val hashCode =
            (((title.hashCode() * 31 + urlDetail.hashCode()) * 31 + urlPhoto.hashCode()) * 31 + urlStream.hashCode()) * 31
        val z = isSponsor
        var i: Int = z.toInt()
        if (z.toInt() != 0) {
            i = 1
        }
        return hashCode + i
    }

    override fun toString(): String {
        return "MovieHome(title=" + title + ", urlDetail=" + urlDetail + ", urlPhoto=" + urlPhoto + ", urlStream=" + urlStream + ", isSponsor=" + isSponsor + ')'
    }

    init {
        Intrinsics.checkNotNullParameter(title, "title")
        Intrinsics.checkNotNullParameter(urlDetail, "urlDetail")
        Intrinsics.checkNotNullParameter(urlPhoto, "urlPhoto")
        Intrinsics.checkNotNullParameter(urlStream, "urlStream")
        this.title = title
        this.urlDetail = urlDetail
        this.urlPhoto = urlPhoto
        this.urlStream = urlStream
        isSponsor = z
    }

    companion object {
        fun  /* synthetic */`copy$default`(
            movieHome: MovieHome,
            str: String,
            str2: String,
            str3: String,
            str4: String,
            z: Boolean,
            i: Int,
            obj: Object?
        ): MovieHome {
            var str = str
            var str2 = str2
            var str3 = str3
            var str4 = str4
            var z = z
            if (i and 1 != 0) {
                str = movieHome.title
            }
            if (i and 2 != 0) {
                str2 = movieHome.urlDetail
            }
            val str5 = str2
            if (i and 4 != 0) {
                str3 = movieHome.urlPhoto
            }
            val str6 = str3
            if (i and 8 != 0) {
                str4 = movieHome.urlStream
            }
            val str7 = str4
            if (i and 16 != 0) {
                z = movieHome.isSponsor
            }
            return movieHome.copy(str, str5, str6, str7, z)
        }
    }
}