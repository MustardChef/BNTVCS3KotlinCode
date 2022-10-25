package com.lagradost.cloudstream3

import androidx.exifinterface.media.ExifInterface
import kotlin.coroutines.jvm.internal.DebugMetadata
import com.lagradost.cloudstream3.``ParCollectionsKt$apmapIndexed$1$1$1`
import kotlin.jvm.internal.Intrinsics

/* compiled from: MainAPI.kt */
@Metadata(
    m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\bJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\u000b¨\u0006\u0017"],
    m107d2 = ["Lcom/lagradost/cloudstream3/SubtitleFile;", "", "lang", "", "url", "isZipUrl", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLang", "()Ljava/lang/String;", "getUrl", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/lagradost/cloudstream3/SubtitleFile;", "equals", "other", "hashCode", "", "toString", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class SubtitleFile(lang: String, url: String, bool: Boolean) {
    val isZipUrl: Boolean
    val lang: String
    val url: String
    operator fun component1(): String {
        return lang
    }

    operator fun component2(): String {
        return url
    }

    operator fun component3(): Boolean {
        return isZipUrl
    }

    fun copy(lang: String, url: String, bool: Boolean): SubtitleFile {
        Intrinsics.checkNotNullParameter(lang, "lang")
        Intrinsics.checkNotNullParameter(url, "url")
        return SubtitleFile(lang, url, bool)
    }

    override fun equals(obj: Object): Boolean {
        if (this === obj) {
            return true
        }
        if (obj is SubtitleFile) {
            val subtitleFile = obj as SubtitleFile
            return Intrinsics.areEqual(lang, subtitleFile.lang) && Intrinsics.areEqual(
                url, subtitleFile.url
            ) && Intrinsics.areEqual(isZipUrl, subtitleFile.isZipUrl)
        }
        return false
    }

    override fun hashCode(): Int {
        val hashCode = (lang.hashCode() * 31 + url.hashCode()) * 31
        val bool = isZipUrl
        return hashCode + (bool?.hashCode() ?: 0)
    }

    override fun toString(): String {
        return "SubtitleFile(lang=" + lang + ", url=" + url + ", isZipUrl=" + isZipUrl + ')'
    }

    init {
        Intrinsics.checkNotNullParameter(lang, "lang")
        Intrinsics.checkNotNullParameter(url, "url")
        this.lang = lang
        this.url = url
        isZipUrl = bool
    }

    /* synthetic */   constructor(
        str: String,
        str2: String,
        bool: Boolean?,
        i: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(str, str2, (if (i and 4 != 0) false else bool)!!) {
    }

    companion object {
        fun  /* synthetic */`copy$default`(
            subtitleFile: SubtitleFile,
            str: String,
            str2: String,
            bool: Boolean,
            i: Int,
            obj: Object?
        ): SubtitleFile {
            var str = str
            var str2 = str2
            var bool = bool
            if (i and 1 != 0) {
                str = subtitleFile.lang
            }
            if (i and 2 != 0) {
                str2 = subtitleFile.url
            }
            if (i and 4 != 0) {
                bool = subtitleFile.isZipUrl
            }
            return subtitleFile.copy(str, str2, bool)
        }
    }
}