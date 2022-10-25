package com.lagradost.cloudstream3.utils

import com.lagradost.cloudstream3.MainAPIKt.isMovieType
import com.lagradost.cloudstream3.MainAPIKt.getMapper
import com.lagradost.cloudstream3.CommonActivity.Companion.`showToast$default`
import com.lagradost.cloudstream3.MainAPIKt.base64Decode
import com.lagradost.cloudstream3.AcraApplication.Companion.getKeys
import com.lagradost.cloudstream3.AcraApplication.Companion.setKey
import com.lagradost.cloudstream3.AcraApplication.Companion.context
import com.lagradost.cloudstream3.AcraApplication.Companion.removeKey
import com.lagradost.cloudstream3.MainActivityKt.getApp
import com.lagradost.cloudstream3.APIHolder.getApiFromNameNull
import com.lagradost.cloudstream3.MainAPI.extractorVerifierJob
import androidx.exifinterface.media.ExifInterface
import com.google.android.exoplayer2.source.rtsp.SessionDescription
import kotlin.LazyKt
import com.lagradost.cloudstream3.utils.``Vector2$lengthSquared$2`

/* compiled from: DataStoreHelper.kt */
@Metadata(
    m108d1 = ["\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"],
    m107d2 = ["RESULT_DUB", "", "RESULT_RESUME_WATCHING", "RESULT_RESUME_WATCHING_HAS_MIGRATED", "RESULT_RESUME_WATCHING_OLD", "RESULT_SEASON", "RESULT_WATCH_STATE", "RESULT_WATCH_STATE_DATA", "VIDEO_POS_DUR", "app_release"],
    m106k = 2,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
object DataStoreHelperKt {
    const val RESULT_DUB = "result_dub"
    const val RESULT_RESUME_WATCHING = "result_resume_watching_2"
    const val RESULT_RESUME_WATCHING_HAS_MIGRATED = "result_resume_watching_migrated"
    const val RESULT_RESUME_WATCHING_OLD = "result_resume_watching"
    const val RESULT_SEASON = "result_season"
    const val RESULT_WATCH_STATE = "result_watch_state"
    const val RESULT_WATCH_STATE_DATA = "result_watch_state_data"
    const val VIDEO_POS_DUR = "video_pos_dur"
}