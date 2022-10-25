package com.lagradost.cloudstream3

import androidx.exifinterface.media.ExifInterface
import kotlin.coroutines.jvm.internal.DebugMetadata
import com.lagradost.cloudstream3.``ParCollectionsKt$apmapIndexed$1$1$1`
import kotlin.jvm.internal.Intrinsics

/* compiled from: MainAPI.kt */
@Metadata(
    m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J3\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u000cR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\u000cR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\u000c¨\u0006\u001f"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ProvidersInfoJson;", "", "name", "", "url", "credentials", "status", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getCredentials", "()Ljava/lang/String;", "setCredentials", "(Ljava/lang/String;)V", "getName", "setName", "getStatus", "()I", "setStatus", "(I)V", "getUrl", "setUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class ProvidersInfoJson(
    @JsonProperty("name") name: String,
    @JsonProperty("url") url: String,
    @JsonProperty("credentials") str: String?,
    @JsonProperty("status") i: Int
) {
    var credentials: String?
    private var name: String
    var status: Int
    private var url: String
    operator fun component1(): String {
        return name
    }

    operator fun component2(): String {
        return url
    }

    operator fun component3(): String? {
        return credentials
    }

    operator fun component4(): Int {
        return status
    }

    fun copy(
        @JsonProperty("name") name: String,
        @JsonProperty("url") url: String,
        @JsonProperty("credentials") str: String?,
        @JsonProperty("status") i: Int
    ): ProvidersInfoJson {
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(url, "url")
        return ProvidersInfoJson(name, url, str, i)
    }

    override fun equals(obj: Object): Boolean {
        if (this === obj) {
            return true
        }
        if (obj is ProvidersInfoJson) {
            val providersInfoJson = obj as ProvidersInfoJson
            return Intrinsics.areEqual(name, providersInfoJson.name) && Intrinsics.areEqual(
                url, providersInfoJson.url
            ) && Intrinsics.areEqual(
                credentials,
                providersInfoJson.credentials
            ) && status == providersInfoJson.status
        }
        return false
    }

    override fun hashCode(): Int {
        val hashCode = (name.hashCode() * 31 + url.hashCode()) * 31
        val str = credentials
        return (hashCode + (str?.hashCode() ?: 0)) * 31 + status
    }

    override fun toString(): String {
        return "ProvidersInfoJson(name=" + name + ", url=" + url + ", credentials=" + credentials + ", status=" + status + ')'
    }

    init {
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(url, "url")
        this.name = name
        this.url = url
        credentials = str
        status = i
    }

    /* synthetic */   constructor(
        str: String,
        str2: String,
        str3: String?,
        i: Int,
        i2: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(str, str2, if (i2 and 4 != 0) null else str3, i) {
    }

    fun getName(): String {
        return name
    }

    fun setName(str: String) {
        Intrinsics.checkNotNullParameter(str, "<set-?>")
        name = str
    }

    fun getUrl(): String {
        return url
    }

    fun setUrl(str: String) {
        Intrinsics.checkNotNullParameter(str, "<set-?>")
        url = str
    }

    companion object {
        fun  /* synthetic */`copy$default`(
            providersInfoJson: ProvidersInfoJson,
            str: String,
            str2: String,
            str3: String?,
            i: Int,
            i2: Int,
            obj: Object?
        ): ProvidersInfoJson {
            var str = str
            var str2 = str2
            var str3 = str3
            var i = i
            if (i2 and 1 != 0) {
                str = providersInfoJson.name
            }
            if (i2 and 2 != 0) {
                str2 = providersInfoJson.url
            }
            if (i2 and 4 != 0) {
                str3 = providersInfoJson.credentials
            }
            if (i2 and 8 != 0) {
                i = providersInfoJson.status
            }
            return providersInfoJson.copy(str, str2, str3, i)
        }
    }
}