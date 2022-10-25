package com.lagradost.cloudstream3.services

import com.lagradost.cloudstream3.utils.VideoDownloadManager.downloadEvent
import com.lagradost.cloudstream3.utils.Event.invoke
import androidx.exifinterface.media.ExifInterface
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.converter.gson.GsonConverterFactory
import kotlin.jvm.internal.DefaultConstructorMarker
import com.lagradost.cloudstream3.services.`$$Lambda$ApiUtils$bDXlutHUzLCg3HelnBfEzhZ7gME`
import com.lagradost.cloudstream3.services.ApiService
import com.google.firebase.crashlytics.internal.common.AbstractSpiCall
import com.google.firebase.analytics.FirebaseAnalytics
import retrofit2.http.POST
import com.lagradost.cloudstream3.services.ApiResponse
import retrofit2.http.GET
import retrofit2.http.Url
import com.lagradost.cloudstream3.subtitleproviders.MovieIMDB
import com.lagradost.cloudstream3.subtitleproviders.SubtitleResponseOpenSubtitle
import retrofit2.http.Multipart
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
import okhttp3.*

/* compiled from: lambda */ /* renamed from: com.lagradost.cloudstream3.services.-$$Lambda$ApiUtils$bDXlutHUzLCg3HelnBfEzhZ7gME  reason: invalid class name */ /* loaded from: classes3.dex */
/* synthetic */  class `$$Lambda$ApiUtils$bDXlutHUzLCg3HelnBfEzhZ7gME` private /* synthetic */   constructor() :
    Interceptor {
    @Override // okhttp3.Interceptor
    override fun intercept(chain: Interceptor.Chain): Response {
        val `m8604createService$lambda0`: Response
        `m8604createService$lambda0` = ApiUtils.Companion.`m8604createService$lambda0`(chain)
        return `m8604createService$lambda0`
    }

    companion object {
        /* synthetic */ val INSTANCE = `$$Lambda$ApiUtils$bDXlutHUzLCg3HelnBfEzhZ7gME`()
    }
}