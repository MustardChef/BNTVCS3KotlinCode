package com.lagradost.cloudstream3

import androidx.exifinterface.media.ExifInterface
import kotlin.coroutines.jvm.internal.DebugMetadata
import com.lagradost.cloudstream3.``ParCollectionsKt$apmapIndexed$1$1$1`
import kotlin.jvm.internal.Intrinsics

/* compiled from: MainAPI.kt */
@Metadata(
    m108d1 = ["\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\u000c\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006\u0016"],
    m107d2 = ["Lcom/lagradost/cloudstream3/Page;", "", "name", "", "url", "isSelected", "", "nameApi", "description", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "()Z", "setSelected", "(Z)V", "getName", "getNameApi", "setNameApi", "getUrl", "setUrl", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class Page(name: String, url: String, z: Boolean, nameApi: String, str: String?) {
    var description: String?
    var isSelected: Boolean
    val name: String
    private var nameApi: String
    private var url: String

    init {
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(url, "url")
        Intrinsics.checkNotNullParameter(nameApi, "nameApi")
        this.name = name
        this.url = url
        isSelected = z
        this.nameApi = nameApi
        description = str
    }

    /* synthetic */   constructor(
        str: String,
        str2: String,
        z: Boolean,
        str3: String,
        str4: String?,
        i: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(str, str2, if (i and 4 != 0) false else z, str3, if (i and 16 != 0) null else str4) {
    }

    fun getUrl(): String {
        return url
    }

    fun setUrl(str: String) {
        Intrinsics.checkNotNullParameter(str, "<set-?>")
        url = str
    }

    fun getNameApi(): String {
        return nameApi
    }

    fun setNameApi(str: String) {
        Intrinsics.checkNotNullParameter(str, "<set-?>")
        nameApi = str
    }
}