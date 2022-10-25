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
import kotlin.jvm.internal.Intrinsics

/* compiled from: ResponseSubtitle.kt */
@Metadata(
    m108d1 = ["\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"],
    m107d2 = ["Lcom/lagradost/cloudstream3/services/ResponseSubtitle;", "", "fullPath", "", "(Ljava/lang/String;)V", "getFullPath", "()Ljava/lang/String;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class ResponseSubtitle(fullPath: String) {
    val fullPath: String

    init {
        Intrinsics.checkNotNullParameter(fullPath, "fullPath")
        this.fullPath = fullPath
    }
}