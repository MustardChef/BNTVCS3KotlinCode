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
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/* loaded from: classes3.dex */
abstract class CallBackBase<T> : Callback<T> {
    private val call: Call<T>? = null
    abstract fun onRequestFailure(call: Call<T>?, th: Throwable?)
    abstract fun onRequestSuccess(call: Call<T>?, response: Response<T>?)

    @Override // retrofit2.Callback
    override fun onResponse(call: Call<T>, response: Response<T>) {
        onRequestSuccess(call, response)
    }

    fun enqueueAgain() {
        call!!.enqueue(this)
    }

    @Override // retrofit2.Callback
    override fun onFailure(call: Call<T>, th: Throwable) {
        LogUtils.m6083a(
            """
    ${call.request().toString().toString()}
    ${th.getMessage()}
    """.trimIndent()
        )
        onRequestFailure(call, th)
    }
}