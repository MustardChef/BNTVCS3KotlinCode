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
import kotlin.coroutines.Continuation

/* compiled from: UnshortenUrl.kt */
@Metadata(m106k = 3, m105mv = [1, 6, 0], m103xi = 48)
internal class `ShortLink$shortList$3`  /* JADX INFO: Access modifiers changed from: package-private */
    (obj: Object?) : AdaptedFunctionReference(
    2,
    obj,
    UnshortenUrl::class.java,
    "unshortenLinksafe",
    "unshortenLinksafe(Ljava/lang/String;)Ljava/lang/String;",
    4
), Function2<String?, Continuation<in String?>?, Object?>, SuspendFunction {
    @Override // kotlin.jvm.functions.Function2
    override fun invoke(str: String?, continuation: Continuation<in String?>?): Object? {
        val unshortenLinksafe: Object?
        unshortenLinksafe = (this.receiver as UnshortenUrl).unshortenLinksafe(str)
        return unshortenLinksafe
    }
}