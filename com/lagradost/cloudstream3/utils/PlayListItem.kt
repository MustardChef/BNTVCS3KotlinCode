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
import kotlin.jvm.internal.Intrinsics

/* compiled from: ExtractorApi.kt */
@Metadata(
    m108d1 = ["\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000c\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"],
    m107d2 = ["Lcom/lagradost/cloudstream3/utils/PlayListItem;", "", "url", "", "durationUs", "", "(Ljava/lang/String;J)V", "getDurationUs", "()J", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class PlayListItem(url: String, j: Long) {
    val durationUs: Long
    val url: String
    operator fun component1(): String {
        return url
    }

    operator fun component2(): Long {
        return durationUs
    }

    fun copy(url: String, j: Long): PlayListItem {
        Intrinsics.checkNotNullParameter(url, "url")
        return PlayListItem(url, j)
    }

    override fun equals(obj: Object): Boolean {
        if (this === obj) {
            return true
        }
        if (obj is PlayListItem) {
            val playListItem = obj as PlayListItem
            return Intrinsics.areEqual(
                url,
                playListItem.url
            ) && durationUs == playListItem.durationUs
        }
        return false
    }

    override fun hashCode(): Int {
        return url.hashCode() * 31 + `C$r8$backportedMethods$utility$Long$1$hashCode`.hashCode(
            durationUs
        )
    }

    override fun toString(): String {
        return "PlayListItem(url=" + url + ", durationUs=" + durationUs + ')'
    }

    init {
        Intrinsics.checkNotNullParameter(url, "url")
        this.url = url
        durationUs = j
    }

    companion object {
        fun  /* synthetic */`copy$default`(
            playListItem: PlayListItem,
            str: String,
            j: Long,
            i: Int,
            obj: Object?
        ): PlayListItem {
            var str = str
            var j = j
            if (i and 1 != 0) {
                str = playListItem.url
            }
            if (i and 2 != 0) {
                j = playListItem.durationUs
            }
            return playListItem.copy(str, j)
        }
    }
}