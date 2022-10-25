package com.lagradost.cloudstream3.utils

import android.app.Activity
import androidx.tvprovider.media.p009tv.WatchNextProgram
import com.fasterxml.jackson.core.type.TypeReference
import okhttp3.Cache
import kotlin.jvm.internal.Intrinsics

/* compiled from: AppUtils.kt */
@Metadata(
    m108d1 = ["\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0003J4\u0010\u0014\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00152\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\t0\u0018H\u0007J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006J\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J(\u0010 \u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00152\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0003J\u001e\u0010\"\u001a\u0002H#\"\u0006\b\u0000\u0010#\u0018\u00012\u0006\u0010$\u001a\u00020\u001fH\u0086\b¢\u0006\u0002\u0010%J\u001a\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0'2\u0006\u0010(\u001a\u00020)J\"\u0010*\u001a\u0004\u0018\u0001H#\"\u0006\b\u0000\u0010#\u0018\u00012\b\u0010$\u001a\u0004\u0018\u00010\u001fH\u0086\b¢\u0006\u0002\u0010%J\u001a\u0010+\u001a\u00020,*\u00020\u00112\u000c\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00130.H\u0007J\u0018\u0010/\u001a\u00020,*\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u00010\u001fH\u0002J-\u00102\u001a\u00020\u001f*\u00020\u00112\b\u00103\u001a\u0004\u0018\u00010\u001f2\b\u00104\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0002\u00107J\u0018\u00108\u001a\u0004\u0018\u00010\u001d*\u00020\u00112\b\u0010-\u001a\u0004\u0018\u00010\u001dH\u0007J\u0012\u00109\u001a\u00020\t*\u00020\u00112\u0006\u0010:\u001a\u00020\u001fJ\n\u0010;\u001a\u00020\t*\u00020\u0011J\n\u0010<\u001a\u00020\t*\u00020\u0011J\n\u0010=\u001a\u00020\t*\u00020\u0011J\u000c\u0010>\u001a\u00020,*\u0004\u0018\u000100J.\u0010?\u001a\u00020,*\u00020@2\u0006\u0010(\u001a\u00020\u001f2\u0006\u0010A\u001a\u00020\u001f2\b\b\u0002\u0010B\u001a\u0002052\b\b\u0002\u0010C\u001a\u000205J/\u0010D\u001a\u00020,*\u0004\u0018\u0001002\u0006\u0010\u0012\u001a\u00020E2\b\b\u0002\u0010B\u001a\u0002052\n\b\u0002\u0010C\u001a\u0004\u0018\u000105¢\u0006\u0002\u0010FJ\u0012\u0010G\u001a\u00020,*\u00020\u00112\u0006\u0010(\u001a\u00020\u001fJ\u0014\u0010H\u001a\u00020,*\u0002002\b\u0010I\u001a\u0004\u0018\u00010\u0006J\n\u0010J\u001a\u00020\u001f*\u00020\u0001R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\u000c\u0010\r¨\u0006K"],
    m107d2 = ["Lcom/lagradost/cloudstream3/utils/AppUtils;", "", "()V", "currentAudioFocusChangeListener", "Landroid/media/AudioManager\$OnAudioFocusChangeListener;", "currentAudioFocusRequest", "Landroid/media/AudioFocusRequest;", "onAudioFocusEvent", "Lcom/lagradost/cloudstream3/utils/Event;", "", "getOnAudioFocusEvent", "()Lcom/lagradost/cloudstream3/utils/Event;", "setOnAudioFocusEvent", "(Lcom/lagradost/cloudstream3/utils/Event;)V", "buildWatchNextProgramUri", "Landroidx/tvprovider/media/tv/WatchNextProgram;", "context", "Landroid/content/Context;", "card", "Lcom/lagradost/cloudstream3/utils/DataStoreHelper\$ResumeWatchingResult;", "findFirstWatchNextProgram", "Lkotlin/Pair;", "", "predicate", "Lkotlin/Function1;", "Landroid/database/Cursor;", "getAudioListener", "getFocusRequest", "getVideoContentUri", "Landroid/net/Uri;", "videoFilePath", "", "getWatchNextProgramByVideoId", "id", "parseJson", ExifInterface.GPS_DIRECTION_TRUE, "value", "(Ljava/lang/String;)Ljava/lang/Object;", "splitQuery", "", "url", "Ljava/net/URL;", "tryParseJson", "addProgramsToContinueWatching", "", "data", "", "cacheClass", "Landroid/app/Activity;", "clazz", "getNameFull", "name", "episode", "", "season", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;", "getUri", "isAppInstalled", ShareConstants.MEDIA_URI, "isCastApiAvailable", "isConnectedToChromecast", "isUsingMobileData", "loadCache", "loadResult", "Landroidx/appcompat/app/AppCompatActivity;", "apiName", "startAction", "startValue", "loadSearchResult", "Lcom/lagradost/cloudstream3/SearchResponse;", "(Landroid/app/Activity;Lcom/lagradost/cloudstream3/SearchResponse;ILjava/lang/Integer;)V", "openBrowser", "requestLocalAudioFocus", "focusRequest", "toJson", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class AppUtils private constructor() {
    /* JADX INFO: Access modifiers changed from: private */
    fun buildWatchNextProgramUri(
        context: Context,
        resumeWatchingResult: ResumeWatchingResult
    ): WatchNextProgram {
        val name: String
        var episode: Integer
        val type: TvType = resumeWatchingResult.getType()
        val z = if (type == null || MainAPIKt.isMovieType(type)) false else true
        name = if (z) {
            getNameFull(
                context,
                resumeWatchingResult.getName(),
                resumeWatchingResult.getEpisode(),
                resumeWatchingResult.getSeason()
            )
        } else {
            resumeWatchingResult.getName()
        }
        val internalProviderId = (((WatchNextProgram.Builder()
            .setEpisodeTitle(name) as WatchNextProgram.Builder).setType(if (z) 3 else 0)
            .setWatchNextType(0).setTitle(name) as WatchNextProgram.Builder).setPosterArtUri(
            Uri.parse(
                resumeWatchingResult.getPosterUrl()
            )
        ) as WatchNextProgram.Builder).setIntentUri(Uri.parse(resumeWatchingResult.getUrl()))
            .setInternalProviderId(resumeWatchingResult.getUrl())
        val watchPos: PosDur = resumeWatchingResult.getWatchPos()
        if (watchPos != null) {
            internalProviderId.setDurationMillis(watchPos.getDuration().toInt())
            internalProviderId.setLastPlaybackPositionMillis(watchPos.getPosition().toInt())
        }
        if (z && resumeWatchingResult.getEpisode().also { episode = it } != null) {
            val builder =
                internalProviderId.setEpisodeNumber(episode.intValue()) as WatchNextProgram.Builder
        }
        val build = internalProviderId.build()
        Intrinsics.checkNotNullExpressionValue(build, "builder.build()")
        return build
    }

    fun findFirstWatchNextProgram(
        context: Context,
        predicate: Function1<Cursor?, Boolean>
    ): Tuples<WatchNextProgram?, Long?> {
        Intrinsics.checkNotNullParameter(context, "context")
        Intrinsics.checkNotNullParameter(predicate, "predicate")
        val query: Cursor = context.getContentResolver().query(
            TvContractCompat.WatchNextPrograms.CONTENT_URI,
            WatchNextProgram.PROJECTION,
            null,
            null,
            null
        )
        if (query != null) {
            val cursor: Cursor = query
            try {
                val cursor2: Cursor = cursor
                if (cursor2.moveToFirst()) {
                    while (!predicate.invoke(query).booleanValue()) {
                        if (!cursor2.moveToNext()) {
                            val unit = Unit.INSTANCE
                            Closeable.closeFinally(cursor, null)
                        }
                    }
                    val m100to: Tuples<WatchNextProgram?, Long?> = TuplesKt.m100to(
                        WatchNextProgram.fromCursor(query), Long.valueOf(query.getLong(0))
                    )
                    Closeable.closeFinally(cursor, null)
                    return m100to
                }
                val unit2 = Unit.INSTANCE
                Closeable.closeFinally(cursor, null)
            } finally {
            }
        }
        return TuplesKt.m100to(null, null)
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Synchronized
    fun getWatchNextProgramByVideoId(
        str: String?,
        context: Context
    ): Tuples<WatchNextProgram?, Long?> {
        return findFirstWatchNextProgram(context, `AppUtils$getWatchNextProgramByVideoId$1`(str))
    }

    fun addProgramsToContinueWatching(context: Context, data: List<ResumeWatchingResult?>) {
        Intrinsics.checkNotNullParameter(context, "<this>")
        Intrinsics.checkNotNullParameter(data, "data")
        if (Build.VERSION.SDK_INT < 26) {
            return
        }
        Coroutines.Companion.INSTANCE.ioSafe(
            `AppUtils$addProgramsToContinueWatching$1`(
                data,
                context,
                null
            )
        )
    }

    fun getVideoContentUri(context: Context, videoFilePath: String): Uri {
        Intrinsics.checkNotNullParameter(context, "context")
        Intrinsics.checkNotNullParameter(videoFilePath, "videoFilePath")
        val query: Cursor = context.getContentResolver().query(
            MediaStore.Video.Media.EXTERNAL_CONTENT_URI,
            arrayOf("_id"),
            "_data=? ",
            arrayOf(videoFilePath),
            null
        )
        if (query != null && query.moveToFirst()) {
            val i: Int = query.getInt(query.getColumnIndex("_id"))
            query.close()
            val uri: Uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            return Uri.withAppendedPath(uri, "" + i)
        }
        val contentValues = ContentValues()
        contentValues.put("_data", videoFilePath)
        return context.getContentResolver()
            .insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues)
    }

    fun openBrowser(context: Context?, url: String?) {
        Intrinsics.checkNotNullParameter(context, "<this>")
        Intrinsics.checkNotNullParameter(url, "url")
        try {
            val intent = Intent("android.intent.action.VIEW")
            intent.setData(Uri.parse(url))
            intent.addFlags(268468224)
            ContextCompat.startActivity(context, intent, null)
        } catch (e: Exception) {
            ArchComponentExt.logError(e)
        }
    }

    fun splitQuery(url: URL): Map<String, String> {
        var strArr: Array<String?>
        Intrinsics.checkNotNullParameter(url, "url")
        val linkedHashMap = LinkedHashMap()
        val query: String = url.getQuery()
        Intrinsics.checkNotNullExpressionValue(query, "url.query")
        val array: Array<Object> = StringsKt.`split$default`(
            query as CharSequence,
            arrayOf("&"),
            false,
            0,
            6,
            null as Object?
        ).toArray(arrayOfNulls<String>(0))
        Objects.requireNonNull(
            array,
            "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
        )
        for (str in array) {
            val `indexOf$default`: Int =
                StringsKt.`indexOf$default`(str as CharSequence, "=", 0, false, 6, null as Object?)
            val substring: String = str.substring(0, `indexOf$default`)
            Intrinsics.checkNotNullExpressionValue(
                substring,
                "this as java.lang.String…ing(startIndex, endIndex)"
            )
            val decode: String = URLDecoder.decode(substring, "UTF-8")
            Intrinsics.checkNotNullExpressionValue(
                decode,
                "decode(pair.substring(0, idx), \"UTF-8\")"
            )
            val substring2: String = str.substring(`indexOf$default` + 1)
            Intrinsics.checkNotNullExpressionValue(
                substring2,
                "this as java.lang.String).substring(startIndex)"
            )
            val decode2: String = URLDecoder.decode(substring2, "UTF-8")
            Intrinsics.checkNotNullExpressionValue(
                decode2,
                "decode(pair.substring(idx + 1), \"UTF-8\")"
            )
            linkedHashMap.put(decode, decode2)
        }
        return linkedHashMap
    }

    fun toJson(obj: Object?): String? {
        Intrinsics.checkNotNullParameter(obj, "<this>")
        if (obj is String) {
            return obj
        }
        val writeValueAsString: String = MainAPIKt.getMapper().writeValueAsString(obj)
        Intrinsics.checkNotNullExpressionValue(
            writeValueAsString,
            "mapper.writeValueAsString(this)"
        )
        return writeValueAsString
    }

    /* synthetic */  fun <T> parseJson(value: String?): T {
        Intrinsics.checkNotNullParameter(value, "value")
        Intrinsics.needClassReification()
        return MainAPIKt.getMapper().readValue(
            value,
            object :
                TypeReference<T>() { // from class: com.lagradost.cloudstream3.utils.AppUtils$parseJson$$inlined$readValue$1
            })
    }

    fun getNameFull(context: Context, str: String?, num: Integer?, num2: Integer?): String {
        var num: Integer? = num
        var num2: Integer? = num2
        Intrinsics.checkNotNullParameter(context, "<this>")
        if (num != null && num.intValue() === 0) {
            num = null
        }
        if (num2 != null && num2.intValue() === 0) {
            num2 = null
        }
        val string: String = context.getString(R.string.season)
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.season)")
        val string2: String = context.getString(R.string.episode)
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.episode)")
        val string3: String = context.getString(R.string.season_short)
        Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.season_short)")
        val string4: String = context.getString(R.string.episode_short)
        Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.episode_short)")
        return if (str == null) {
            if (num == null || num2 == null) {
                return if (num2 == null) {
                    "$string2 $num"
                } else ""
            }
            "$string $num2 - $string2 $num"
        } else if (num == null || num2 == null) {
            if (num != null) {
                "$string2 $num. $str"
            } else str
        } else {
            string3 + num2 + ':'.code + string4 + num + ' '.code + str
        }
    }

    fun loadCache(activity: Activity?) {
        try {
            cacheClass(
                activity,
                JsUnpacker.Companion.Companion.load("android.net.NetworkCapabilities")
            )
        } catch (unused: Exception) {
        }
    }

    fun loadResult(
        appCompatActivity: AppCompatActivity,
        url: String?,
        apiName: String?,
        i: Int,
        i2: Int
    ) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "<this>")
        Intrinsics.checkNotNullParameter(url, "url")
        Intrinsics.checkNotNullParameter(apiName, "apiName")
        appCompatActivity.runOnUiThread(object : Runnable() {
            // from class: com.lagradost.cloudstream3.utils.-$$Lambda$AppUtils$iaite49wW099-TVuH9NG7uV6WcY
            @Override // java.lang.Runnable
            fun run() {
                `m8993loadResult$lambda3`(this@AppCompatActivity, url, apiName, i, i2)
            }
        })
    }

    fun loadSearchResult(activity: Activity?, card: SearchResponse?, i: Int, num: Integer?) {
        Intrinsics.checkNotNullParameter(card, "card")
        if (activity != null) {
            activity.runOnUiThread(object : Runnable() {
                // from class: com.lagradost.cloudstream3.utils.-$$Lambda$AppUtils$1Wd-f5GFg-iaksaYAz8SUBjsUlM
                @Override // java.lang.Runnable
                fun run() {
                    `m8994loadSearchResult$lambda4`(activity, card, i, num)
                }
            })
        }
    }

    fun requestLocalAudioFocus(activity: Activity, audioFocusRequest: AudioFocusRequest?) {
        Intrinsics.checkNotNullParameter(activity, "<this>")
        if (Build.VERSION.SDK_INT >= 26 && audioFocusRequest != null) {
            val systemService: Object = activity.getSystemService("audio")
            Objects.requireNonNull(
                systemService,
                "null cannot be cast to non-null type android.media.AudioManager"
            )
            (systemService as AudioManager).requestAudioFocus(audioFocusRequest)
            return
        }
        val systemService2: Object = activity.getSystemService("audio")
        Objects.requireNonNull(
            systemService2,
            "null cannot be cast to non-null type android.media.AudioManager"
        )
        (systemService2 as AudioManager).requestAudioFocus(null, 3, 3)
    }

    var onAudioFocusEvent: Event<Boolean>
        get() = Companion.onAudioFocusEvent
        set(event) {
            Intrinsics.checkNotNullParameter(event, "<set-?>")
            Companion.onAudioFocusEvent = event
        }
    private val audioListener: AudioManager.OnAudioFocusChangeListener
        private get() {
            val onAudioFocusChangeListener: AudioManager.OnAudioFocusChangeListener? =
                currentAudioFocusChangeListener
            if (onAudioFocusChangeListener != null) {
                return onAudioFocusChangeListener
            }
            val __lambda_apputils_jqll3xbek0g6nrihno8hbrudteo: `$$Lambda$AppUtils$JqLl3xBEk0g6nRiHno8HbRudteo` =
                `$$Lambda$AppUtils$JqLl3xBEk0g6nRiHno8HbRudteo`.Companion.INSTANCE
            currentAudioFocusChangeListener = __lambda_apputils_jqll3xbek0g6nrihno8hbrudteo
            return __lambda_apputils_jqll3xbek0g6nrihno8hbrudteo
        }

    fun isCastApiAvailable(context: Context): Boolean {
        Intrinsics.checkNotNullParameter(context, "<this>")
        val z = GoogleApiAvailability.getInstance()
            .isGooglePlayServicesAvailable(context.getApplicationContext()) == 0
        return try {
            val applicationContext: Context = context.getApplicationContext()
            if (applicationContext != null) {
                CastContext.getSharedInstance(applicationContext)
            }
            z
        } catch (e: Exception) {
            System.out.println(e)
            false
        }
    }

    fun isConnectedToChromecast(context: Context): Boolean {
        Intrinsics.checkNotNullParameter(context, "<this>")
        return isCastApiAvailable(context) && CastContext.getSharedInstance(context)
            .getCastState() == 4
    }

    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */ /* JADX WARN: Removed duplicated region for block: B:76:0x01ed  */ /* JADX WARN: Removed duplicated region for block: B:78:0x01f2  */ /* JADX WARN: Removed duplicated region for block: B:80:0x01f7  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun getUri(r13: android.content.Context?, r14: Uri?): Uri {
        /*
            Method dump skipped, instructions count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.utils.AppUtils.getUri(android.content.Context, android.net.Uri):android.net.Uri")
    }

    fun isUsingMobileData(context: Context): Boolean {
        Intrinsics.checkNotNullParameter(context, "<this>")
        val systemService: Object = context.getSystemService("connectivity")
        Objects.requireNonNull(
            systemService,
            "null cannot be cast to non-null type android.net.ConnectivityManager"
        )
        val connectivityManager: ConnectivityManager = systemService as ConnectivityManager
        val allNetworks: Array<Network> = connectivityManager.getAllNetworks()
        Intrinsics.checkNotNullExpressionValue(allNetworks, "conManager.allNetworks")
        for (network in allNetworks) {
            val networkCapabilities: NetworkCapabilities =
                connectivityManager.getNetworkCapabilities(network)
            if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
                return true
            }
        }
        return false
    }

    private fun cacheClass(activity: Activity?, str: String?) {
        var cacheDir: File?
        if (str == null || activity == null || activity.getCacheDir()
                .also { cacheDir = it } == null
        ) {
            return
        }
        Cache(File(cacheDir, FillerEpisodeCheck.Companion.INSTANCE.toClassDir(str)), 20971520L)
    }

    fun isAppInstalled(context: Context?, uri: String?): Boolean {
        Intrinsics.checkNotNullParameter(context, "<this>")
        Intrinsics.checkNotNullParameter(uri, "uri")
        return try {
            Wrappers.packageManager(context).getPackageInfo(uri, 0)
            true
        } catch (unused: PackageManager.NameNotFoundException) {
            false
        }
    }

    val focusRequest: AudioFocusRequest?
        get() {
            val audioFocusRequest: AudioFocusRequest?
            val audioFocusRequest2: AudioFocusRequest? = currentAudioFocusRequest
            if (audioFocusRequest2 != null) {
                return audioFocusRequest2
            }
            audioFocusRequest = if (Build.VERSION.SDK_INT >= 26) {
                val builder: AudioFocusRequest.Builder = Builder(1)
                val builder2: AudioAttributes.Builder = Builder()
                builder2.setUsage(1)
                builder2.setContentType(3)
                builder.setAudioAttributes(builder2.build())
                builder.setAcceptsDelayedFocusGain(true)
                val audioListener: AudioManager.OnAudioFocusChangeListener =
                    INSTANCE.audioListener
                if (audioListener != null) {
                    builder.setOnAudioFocusChangeListener(audioListener)
                }
                builder.build()
            } else {
                null
            }
            currentAudioFocusRequest = audioFocusRequest
            return audioFocusRequest
        }

    /* synthetic */  fun <T> tryParseJson(str: String?): T? {
        return if (str == null) {
            null
        } else try {
            Intrinsics.needClassReification()
            MainAPIKt.getMapper().readValue(
                str,
                object :
                    TypeReference<T>() { // from class: com.lagradost.cloudstream3.utils.AppUtils$tryParseJson$$inlined$parseJson$1
                })
        } catch (unused: Exception) {
            null
        }
    }

    companion object {
        private var currentAudioFocusChangeListener: AudioManager.OnAudioFocusChangeListener? = null
        private var currentAudioFocusRequest: AudioFocusRequest? = null
        @kotlin.jvm.JvmField
        val INSTANCE = AppUtils()
        private var onAudioFocusEvent = Event<Boolean>()

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: loadResult$lambda-3  reason: not valid java name */
        fun `m8993loadResult$lambda3`(
            this_loadResult: AppCompatActivity,
            url: String?,
            apiName: String?,
            i: Int,
            i2: Int
        ) {
            Intrinsics.checkNotNullParameter(this_loadResult, "\$this_loadResult")
            Intrinsics.checkNotNullParameter(url, "\$url")
            Intrinsics.checkNotNullParameter(apiName, "\$apiName")
            val appCompatActivity: AppCompatActivity = this_loadResult
            val appCompatActivity2: AppCompatActivity = this_loadResult
            UIHelper.Companion.INSTANCE.navigate(
                appCompatActivity,
                if (SettingsFragment.Companion.isTrueTvSettings(appCompatActivity2)) R.id.global_to_navigation_results_tv else R.id.global_to_navigation_results,
                if (SettingsFragment.Companion.isTrueTvSettings(appCompatActivity2)) ResultFragmentTV.Companion.newInstance(
                    url,
                    apiName,
                    i,
                    i2
                ) else ResultFragmentPhimHD.Companion.newInstance(url, apiName, i, i2)
            )
        }

        @kotlin.jvm.JvmStatic
        fun  /* synthetic */`loadSearchResult$default`(
            appUtils: AppUtils,
            activity: Activity?,
            searchResponse: SearchResponse?,
            i: Int,
            num: Integer?,
            i2: Int,
            obj: Object?
        ) {
            var i = i
            var num: Integer? = num
            if (i2 and 2 != 0) {
                i = 0
            }
            if (i2 and 4 != 0) {
                num = null
            }
            appUtils.loadSearchResult(activity, searchResponse, i, num)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: loadSearchResult$lambda-4  reason: not valid java name */
        fun `m8994loadSearchResult$lambda4`(
            activity: Activity,
            card: SearchResponse?,
            i: Int,
            num: Integer?
        ) {
            Intrinsics.checkNotNullParameter(card, "\$card")
            val activity2: Activity = activity
            UIHelper.Companion.INSTANCE.navigate(
                activity,
                if (SettingsFragment.Companion.isTrueTvSettings(activity2)) R.id.global_to_navigation_results_tv else R.id.global_to_navigation_results,
                if (SettingsFragment.Companion.isTrueTvSettings(activity2)) ResultFragmentTV.Companion.newInstance(
                    card,
                    i,
                    num
                ) else ResultFragmentPhimHD.Companion.newInstance(card, i, num)
            )
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: getAudioListener$lambda-5  reason: not valid java name */
        fun `m8990getAudioListener$lambda5`(i: Int) {
            val z = true
            onAudioFocusEvent.invoke(Boolean.valueOf(if (i == 1 || i == 2 || i == 4) false else false))
        }
    }
}