package com.lagradost.cloudstream3

import android.content.ComponentName
import okhttp3.Cache
import kotlin.jvm.internal.Intrinsics

/* compiled from: MainActivity.kt */
@Metadata(
    m108d1 = ["\u00008\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\"\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000c\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\"\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006!"],
    m107d2 = ["DEFAULT_CACHE_TIME", "", "DEFAULT_CACHE_TIME_UNIT", "Ljava/util/concurrent/TimeUnit;", "getDEFAULT_CACHE_TIME_UNIT", "()Ljava/util/concurrent/TimeUnit;", "VLC_COMPONENT", "Landroid/content/ComponentName;", "getVLC_COMPONENT", "()Landroid/content/ComponentName;", "VLC_EXTRA_DURATION_OUT", "", "VLC_EXTRA_POSITION_OUT", "VLC_FROM_PROGRESS", "VLC_FROM_START", "VLC_INTENT_ACTION_RESULT", "VLC_LAST_ID_KEY", "VLC_PACKAGE", "VLC_REQUEST_CODE", "app", "Lcom/lagradost/cloudstream3/utils/Extensions\$RequestCustom;", "getApp", "()Lcom/lagradost/cloudstream3/utils/Extensions\$RequestCustom;", "setApp", "(Lcom/lagradost/cloudstream3/utils/Extensions\$RequestCustom;)V", "cache", "Lokhttp3/Cache;", "getCache", "()Lokhttp3/Cache;", "okHttpClient", "Lokhttp3/OkHttpClient;", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "app_release"],
    m106k = 2,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
object MainActivityKt {
    const val DEFAULT_CACHE_TIME = 4
    private val DEFAULT_CACHE_TIME_UNIT: TimeUnit? = null
    const val VLC_EXTRA_DURATION_OUT = "extra_duration"
    const val VLC_EXTRA_POSITION_OUT = "extra_position"
    const val VLC_FROM_PROGRESS = -2
    const val VLC_FROM_START = -1
    const val VLC_INTENT_ACTION_RESULT = "org.videolan.vlc.player.result"
    const val VLC_LAST_ID_KEY = "vlc_last_open_id"
    const val VLC_REQUEST_CODE = 42
    private var app: RequestCustom? = null
    val cache: Cache? = null
    private val okHttpClient: OkHttpClient? = null
    const val VLC_PACKAGE = "org.videolan.vlc"
    val vLC_COMPONENT: ComponentName =
        ComponentName(VLC_PACKAGE, "org.videolan.vlc.gui.video.VideoPlayerActivity")

    init {
        val timeUnit: TimeUnit = TimeUnit.HOURS
        DEFAULT_CACHE_TIME_UNIT = com.lagradost.cloudstream3.timeUnit
        val context: Context = AcraApplication.Companion.Companion.getContext()
        val cache2 = Cache(
            File(
                if (com.lagradost.cloudstream3.context != null) com.lagradost.cloudstream3.context.getCacheDir() else null,
                "http_cache"
            ), 52428800L
        )
        cache = com.lagradost.cloudstream3.cache2
        val build: OkHttpClient = OkHttpClient.Builder().cache(com.lagradost.cloudstream3.cache2)
            .addInterceptor(ForceCacheInterceptor()).build()
        okHttpClient = com.lagradost.cloudstream3.build
        val requestCustom = RequestCustom()
        com.lagradost.cloudstream3.requestCustom.setBaseClient(com.lagradost.cloudstream3.build)
        com.lagradost.cloudstream3.requestCustom.setDefaultHeaders(
            MapsKt.mapOf(
                TuplesKt.m100to<Any, Any?>(
                    "user-agent",
                    MainAPIKt.USER_AGENT
                )
            )
        )
        com.lagradost.cloudstream3.requestCustom.setDefaultCacheTime(4)
        com.lagradost.cloudstream3.requestCustom.setDefaultCacheTimeUnit(com.lagradost.cloudstream3.timeUnit)
        app = com.lagradost.cloudstream3.requestCustom
    }

    fun getDEFAULT_CACHE_TIME_UNIT(): TimeUnit? {
        return DEFAULT_CACHE_TIME_UNIT
    }

    fun getOkHttpClient(): OkHttpClient? {
        return okHttpClient
    }

    @kotlin.jvm.JvmStatic
    fun getApp(): RequestCustom? {
        return app
    }

    fun setApp(requestCustom: RequestCustom?) {
        Intrinsics.checkNotNullParameter(requestCustom, "<set-?>")
        app = requestCustom
    }
}