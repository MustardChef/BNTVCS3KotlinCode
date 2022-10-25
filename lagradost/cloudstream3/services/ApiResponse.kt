package com.lagradost.cloudstream3.services

import com.lagradost.cloudstream3.utils.VideoDownloadManager.downloadEvent
import com.lagradost.cloudstream3.utils.Event.invoke
import androidx.exifinterface.media.ExifInterface
import retrofit2.Retrofit
import okhttp3.OkHttpClient
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.converter.gson.GsonConverterFactory
import kotlin.jvm.internal.DefaultConstructorMarker
import com.lagradost.cloudstream3.services.`$$Lambda$ApiUtils$bDXlutHUzLCg3HelnBfEzhZ7gME`
import com.lagradost.cloudstream3.services.ApiService
import okhttp3.Interceptor
import com.google.firebase.crashlytics.internal.common.AbstractSpiCall
import com.google.firebase.analytics.FirebaseAnalytics
import retrofit2.http.POST
import com.lagradost.cloudstream3.services.ApiResponse
import retrofit2.http.GET
import retrofit2.http.Url
import okhttp3.ResponseBody
import com.lagradost.cloudstream3.subtitleproviders.MovieIMDB
import com.lagradost.cloudstream3.subtitleproviders.SubtitleResponseOpenSubtitle
import retrofit2.http.Multipart
import okhttp3.MultipartBody
import com.lagradost.cloudstream3.services.ResponseSubtitle
import com.google.firebase.messaging.FirebaseMessagingService
import com.blankj.utilcode.util.LogUtils
import com.phimhd.AppController
import com.google.firebase.messaging.RemoteMessage
import com.google.gson.annotations.SerializedName
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants
import com.lagradost.cloudstream3.utils.VideoDownloadManager.DownloadActionType
import com.lagradost.cloudstream3.utils.VideoDownloadManager
import kotlin.Tuples
import com.lagradost.cloudstream3.services.ApiUtils
import com.lagradost.cloudstream3.services.``$$Lambda$ApiUtils$bDXlutHUzLCg3HelnBfEzhZ7gME`

/* loaded from: classes3.dex */
class ApiResponse<T> {
    @SerializedName(alternate = ["errorId"], value = "code")
    var code = 0

    @SerializedName("Count")
    var count = 0

    @SerializedName("data")
    var data: T? = null

    @SerializedName(alternate = ["content"], value = "message")
    var message: String? = null

    @SerializedName("predictions")
    var place: T? = null

    @SerializedName("results")
    var placeNearBy: T? = null

    @SerializedName("routes")
    var routes: T? = null

    @SerializedName("success")
    var isSuccess = false
    fun getRoutes(): T {
        return routes
    }

    fun setRoutes(t: T) {
        routes = t
    }

    fun getPlaceNearBy(): T {
        return placeNearBy
    }

    fun setPlaceNearBy(t: T) {
        placeNearBy = t
    }

    constructor() {}
    constructor(str: String?, z: Boolean) {
        message = str
        isSuccess = z
    }

    constructor(t: T, str: String?, z: Boolean) {
        data = t
        message = str
        isSuccess = z
    }

    fun getData(): T {
        return data
    }

    fun setData(t: T) {
        data = t
    }

    fun getPlace(): T {
        return place
    }

    fun setPlace(t: T) {
        place = t
    }
}