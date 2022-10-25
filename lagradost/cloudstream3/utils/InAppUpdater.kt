package com.lagradost.cloudstream3.utils

import android.app.Activity
import kotlin.concurrent.Thread
import kotlin.jvm.internal.Intrinsics

/* compiled from: InAppUpdater.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"],
    m107d2 = ["Lcom/lagradost/cloudstream3/utils/InAppUpdater;", "", "()V", "Companion", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
object InAppUpdater {
    @kotlin.jvm.JvmField
    val Companion = Companion(null)
    private val mapper: JsonMapper =
        JsonMapper.builder().addModule(KotlinModule(0, false, false, false, null, false, 63, null))
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).build()

    /* compiled from: InAppUpdater.kt */
    @Metadata(
        m108d1 = ["\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0005\u0017\u0018\u0019\u001a\u001bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0014\u0010\u000c\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u000c\u0010\u0011\u001a\u00020\u0012*\u00020\u000eH\u0002J\u000c\u0010\u0013\u001a\u00020\u0012*\u00020\u000eH\u0002J\u000c\u0010\u0014\u001a\u00020\u0012*\u00020\u000eH\u0002J\u0014\u0010\u0015\u001a\u00020\r*\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\rR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"],
        m107d2 = ["Lcom/lagradost/cloudstream3/utils/InAppUpdater\$Companion;", "", "()V", "mapper", "Lcom/fasterxml/jackson/databind/json/JsonMapper;", "kotlin.jvm.PlatformType", "openApk", "", "context", "Landroid/content/Context;", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "downloadUpdate", "", "Landroid/app/Activity;", "url", "", "getAppUpdate", "Lcom/lagradost/cloudstream3/utils/InAppUpdater\$Companion\$Update;", "getPreReleaseUpdate", "getReleaseUpdate", "runAutoUpdate", "checkAutoUpdate", "GithubAsset", "GithubObject", "GithubRelease", "GithubTag", "Update", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        /* compiled from: InAppUpdater.kt */
        @Metadata(
            m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"],
            m107d2 = ["Lcom/lagradost/cloudstream3/utils/InAppUpdater\$Companion\$GithubAsset;", "", "name", "", "size", "", "browser_download_url", FirebaseAnalytics.Param.CONTENT_TYPE, "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getBrowser_download_url", "()Ljava/lang/String;", "getContent_type", "getName", "getSize", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"],
            m106k = 1,
            m105mv = [1, 6, 0],
            m103xi = 48
        ) /* loaded from: classes4.dex */
        class GithubAsset(
            @JsonProperty("name") name: String,
            @JsonProperty("size") i: Int,
            @JsonProperty("browser_download_url") browser_download_url: String,
            @JsonProperty("content_type") content_type: String
        ) {
            val browser_download_url: String
            val content_type: String
            val name: String
            val size: Int
            operator fun component1(): String {
                return name
            }

            operator fun component2(): Int {
                return size
            }

            operator fun component3(): String {
                return browser_download_url
            }

            operator fun component4(): String {
                return content_type
            }

            fun copy(
                @JsonProperty("name") name: String,
                @JsonProperty("size") i: Int,
                @JsonProperty("browser_download_url") browser_download_url: String,
                @JsonProperty("content_type") content_type: String
            ): GithubAsset {
                Intrinsics.checkNotNullParameter(name, "name")
                Intrinsics.checkNotNullParameter(browser_download_url, "browser_download_url")
                Intrinsics.checkNotNullParameter(content_type, "content_type")
                return GithubAsset(name, i, browser_download_url, content_type)
            }

            override fun equals(obj: Object): Boolean {
                if (this === obj) {
                    return true
                }
                if (obj is GithubAsset) {
                    val githubAsset = obj as GithubAsset
                    return Intrinsics.areEqual(
                        name,
                        githubAsset.name
                    ) && size == githubAsset.size && Intrinsics.areEqual(
                        browser_download_url, githubAsset.browser_download_url
                    ) && Intrinsics.areEqual(
                        content_type, githubAsset.content_type
                    )
                }
                return false
            }

            override fun hashCode(): Int {
                return ((name.hashCode() * 31 + size) * 31 + browser_download_url.hashCode()) * 31 + content_type.hashCode()
            }

            override fun toString(): String {
                return "GithubAsset(name=" + name + ", size=" + size + ", browser_download_url=" + browser_download_url + ", content_type=" + content_type + ')'
            }

            init {
                Intrinsics.checkNotNullParameter(name, "name")
                Intrinsics.checkNotNullParameter(browser_download_url, "browser_download_url")
                Intrinsics.checkNotNullParameter(content_type, "content_type")
                this.name = name
                size = i
                this.browser_download_url = browser_download_url
                this.content_type = content_type
            }

            companion object {
                fun  /* synthetic */`copy$default`(
                    githubAsset: GithubAsset,
                    str: String,
                    i: Int,
                    str2: String,
                    str3: String,
                    i2: Int,
                    obj: Object?
                ): GithubAsset {
                    var str = str
                    var i = i
                    var str2 = str2
                    var str3 = str3
                    if (i2 and 1 != 0) {
                        str = githubAsset.name
                    }
                    if (i2 and 2 != 0) {
                        i = githubAsset.size
                    }
                    if (i2 and 4 != 0) {
                        str2 = githubAsset.browser_download_url
                    }
                    if (i2 and 8 != 0) {
                        str3 = githubAsset.content_type
                    }
                    return githubAsset.copy(str, i, str2, str3)
                }
            }
        }

        /* compiled from: InAppUpdater.kt */
        @Metadata(
            m108d1 = ["\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\u000cJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JK\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006\""],
            m107d2 = ["Lcom/lagradost/cloudstream3/utils/InAppUpdater\$Companion\$GithubRelease;", "", "tag_name", "", "body", "assets", "", "Lcom/lagradost/cloudstream3/utils/InAppUpdater\$Companion\$GithubAsset;", "target_commitish", "prerelease", "", "node_id", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;)V", "getAssets", "()Ljava/util/List;", "getBody", "()Ljava/lang/String;", "getNode_id", "getPrerelease", "()Z", "getTag_name", "getTarget_commitish", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_release"],
            m106k = 1,
            m105mv = [1, 6, 0],
            m103xi = 48
        ) /* loaded from: classes4.dex */
        class GithubRelease(
            @JsonProperty("tag_name") tag_name: String,
            @JsonProperty("body") body: String,
            @JsonProperty("assets") assets: List<GithubAsset>,
            @JsonProperty("target_commitish") target_commitish: String,
            @JsonProperty("prerelease") z: Boolean,
            @JsonProperty("node_id") node_id: String
        ) {
            val assets: List<GithubAsset>
            val body: String
            val node_id: String
            val prerelease: Boolean
            val tag_name: String
            val target_commitish: String
            operator fun component1(): String {
                return tag_name
            }

            operator fun component2(): String {
                return body
            }

            operator fun component3(): List<GithubAsset> {
                return assets
            }

            operator fun component4(): String {
                return target_commitish
            }

            operator fun component5(): Boolean {
                return prerelease
            }

            operator fun component6(): String {
                return node_id
            }

            fun copy(
                @JsonProperty("tag_name") tag_name: String,
                @JsonProperty("body") body: String,
                @JsonProperty("assets") assets: List<GithubAsset>,
                @JsonProperty("target_commitish") target_commitish: String,
                @JsonProperty("prerelease") z: Boolean,
                @JsonProperty("node_id") node_id: String
            ): GithubRelease {
                Intrinsics.checkNotNullParameter(tag_name, "tag_name")
                Intrinsics.checkNotNullParameter(body, "body")
                Intrinsics.checkNotNullParameter(assets, "assets")
                Intrinsics.checkNotNullParameter(target_commitish, "target_commitish")
                Intrinsics.checkNotNullParameter(node_id, "node_id")
                return GithubRelease(tag_name, body, assets, target_commitish, z, node_id)
            }

            override fun equals(obj: Object): Boolean {
                if (this === obj) {
                    return true
                }
                if (obj is GithubRelease) {
                    val githubRelease = obj as GithubRelease
                    return Intrinsics.areEqual(
                        tag_name,
                        githubRelease.tag_name
                    ) && Intrinsics.areEqual(
                        body, githubRelease.body
                    ) && Intrinsics.areEqual(assets, githubRelease.assets) && Intrinsics.areEqual(
                        target_commitish, githubRelease.target_commitish
                    ) && prerelease == githubRelease.prerelease && Intrinsics.areEqual(
                        node_id, githubRelease.node_id
                    )
                }
                return false
            }

            /* JADX WARN: Multi-variable type inference failed */
            override fun hashCode(): Int {
                val hashCode =
                    (((tag_name.hashCode() * 31 + body.hashCode()) * 31 + assets.hashCode()) * 31 + target_commitish.hashCode()) * 31
                val z = prerelease
                var i: Int = z.toInt()
                if (z.toInt() != 0) {
                    i = 1
                }
                return (hashCode + i) * 31 + node_id.hashCode()
            }

            override fun toString(): String {
                return "GithubRelease(tag_name=" + tag_name + ", body=" + body + ", assets=" + assets + ", target_commitish=" + target_commitish + ", prerelease=" + prerelease + ", node_id=" + node_id + ')'
            }

            init {
                Intrinsics.checkNotNullParameter(tag_name, "tag_name")
                Intrinsics.checkNotNullParameter(body, "body")
                Intrinsics.checkNotNullParameter(assets, "assets")
                Intrinsics.checkNotNullParameter(target_commitish, "target_commitish")
                Intrinsics.checkNotNullParameter(node_id, "node_id")
                this.tag_name = tag_name
                this.body = body
                this.assets = assets
                this.target_commitish = target_commitish
                prerelease = z
                this.node_id = node_id
            }

            companion object {
                fun  /* synthetic */`copy$default`(
                    githubRelease: GithubRelease,
                    str: String,
                    str2: String,
                    list: List,
                    str3: String,
                    z: Boolean,
                    str4: String,
                    i: Int,
                    obj: Object?
                ): GithubRelease {
                    var str = str
                    var str2 = str2
                    var str3 = str3
                    var z = z
                    var str4 = str4
                    if (i and 1 != 0) {
                        str = githubRelease.tag_name
                    }
                    if (i and 2 != 0) {
                        str2 = githubRelease.body
                    }
                    val str5 = str2
                    var list2: List<GithubAsset?> = list
                    if (i and 4 != 0) {
                        list2 = githubRelease.assets
                    }
                    val list3: List = list2
                    if (i and 8 != 0) {
                        str3 = githubRelease.target_commitish
                    }
                    val str6 = str3
                    if (i and 16 != 0) {
                        z = githubRelease.prerelease
                    }
                    val z2 = z
                    if (i and 32 != 0) {
                        str4 = githubRelease.node_id
                    }
                    return githubRelease.copy(str, str5, list3, str6, z2, str4)
                }
            }
        }

        /* compiled from: InAppUpdater.kt */
        @Metadata(
            m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000c\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"],
            m107d2 = ["Lcom/lagradost/cloudstream3/utils/InAppUpdater\$Companion\$GithubObject;", "", "sha", "", "type", "url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSha", "()Ljava/lang/String;", "getType", "getUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
            m106k = 1,
            m105mv = [1, 6, 0],
            m103xi = 48
        ) /* loaded from: classes4.dex */
        class GithubObject(
            @JsonProperty("sha") sha: String,
            @JsonProperty("type") type: String,
            @JsonProperty("url") url: String
        ) {
            val sha: String
            val type: String
            val url: String
            operator fun component1(): String {
                return sha
            }

            operator fun component2(): String {
                return type
            }

            operator fun component3(): String {
                return url
            }

            fun copy(
                @JsonProperty("sha") sha: String,
                @JsonProperty("type") type: String,
                @JsonProperty("url") url: String
            ): GithubObject {
                Intrinsics.checkNotNullParameter(sha, "sha")
                Intrinsics.checkNotNullParameter(type, "type")
                Intrinsics.checkNotNullParameter(url, "url")
                return GithubObject(sha, type, url)
            }

            override fun equals(obj: Object): Boolean {
                if (this === obj) {
                    return true
                }
                if (obj is GithubObject) {
                    val githubObject = obj as GithubObject
                    return Intrinsics.areEqual(sha, githubObject.sha) && Intrinsics.areEqual(
                        type, githubObject.type
                    ) && Intrinsics.areEqual(url, githubObject.url)
                }
                return false
            }

            override fun hashCode(): Int {
                return (sha.hashCode() * 31 + type.hashCode()) * 31 + url.hashCode()
            }

            override fun toString(): String {
                return "GithubObject(sha=" + sha + ", type=" + type + ", url=" + url + ')'
            }

            init {
                Intrinsics.checkNotNullParameter(sha, "sha")
                Intrinsics.checkNotNullParameter(type, "type")
                Intrinsics.checkNotNullParameter(url, "url")
                this.sha = sha
                this.type = type
                this.url = url
            }

            companion object {
                fun  /* synthetic */`copy$default`(
                    githubObject: GithubObject,
                    str: String,
                    str2: String,
                    str3: String,
                    i: Int,
                    obj: Object?
                ): GithubObject {
                    var str = str
                    var str2 = str2
                    var str3 = str3
                    if (i and 1 != 0) {
                        str = githubObject.sha
                    }
                    if (i and 2 != 0) {
                        str2 = githubObject.type
                    }
                    if (i and 4 != 0) {
                        str3 = githubObject.url
                    }
                    return githubObject.copy(str, str2, str3)
                }
            }
        }

        /* compiled from: InAppUpdater.kt */
        @Metadata(
            m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"],
            m107d2 = ["Lcom/lagradost/cloudstream3/utils/InAppUpdater\$Companion\$GithubTag;", "", "github_object", "Lcom/lagradost/cloudstream3/utils/InAppUpdater\$Companion\$GithubObject;", "(Lcom/lagradost/cloudstream3/utils/InAppUpdater\$Companion\$GithubObject;)V", "getGithub_object", "()Lcom/lagradost/cloudstream3/utils/InAppUpdater\$Companion\$GithubObject;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
            m106k = 1,
            m105mv = [1, 6, 0],
            m103xi = 48
        ) /* loaded from: classes4.dex */
        class GithubTag(@JsonProperty("object") github_object: GithubObject) {
            val github_object: GithubObject
            operator fun component1(): GithubObject {
                return github_object
            }

            fun copy(@JsonProperty("object") github_object: GithubObject): GithubTag {
                Intrinsics.checkNotNullParameter(github_object, "github_object")
                return GithubTag(github_object)
            }

            override fun equals(obj: Object): Boolean {
                return if (this === obj) {
                    true
                } else obj is GithubTag && Intrinsics.areEqual(
                    github_object,
                    (obj as GithubTag).github_object
                )
            }

            override fun hashCode(): Int {
                return github_object.hashCode()
            }

            override fun toString(): String {
                return "GithubTag(github_object=" + github_object + ')'
            }

            init {
                Intrinsics.checkNotNullParameter(github_object, "github_object")
                this.github_object = github_object
            }

            companion object {
                fun  /* synthetic */`copy$default`(
                    githubTag: GithubTag,
                    githubObject: GithubObject,
                    i: Int,
                    obj: Object?
                ): GithubTag {
                    var githubObject = githubObject
                    if (i and 1 != 0) {
                        githubObject = githubTag.github_object
                    }
                    return githubTag.copy(githubObject)
                }
            }
        }

        /* compiled from: InAppUpdater.kt */
        @Metadata(
            m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003JC\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"],
            m107d2 = ["Lcom/lagradost/cloudstream3/utils/InAppUpdater\$Companion\$Update;", "", "shouldUpdate", "", "updateURL", "", "updateVersion", "changelog", "updateNodeId", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChangelog", "()Ljava/lang/String;", "getShouldUpdate", "()Z", "getUpdateNodeId", "getUpdateURL", "getUpdateVersion", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_release"],
            m106k = 1,
            m105mv = [1, 6, 0],
            m103xi = 48
        ) /* loaded from: classes4.dex */
        class Update(
            @param:JsonProperty("shouldUpdate") val shouldUpdate: Boolean,
            @param:JsonProperty(
                "updateURL"
            ) val updateURL: String?,
            @param:JsonProperty("updateVersion") val updateVersion: String?,
            @param:JsonProperty(
                "changelog"
            ) val changelog: String?,
            @param:JsonProperty("updateNodeId") val updateNodeId: String?
        ) {
            operator fun component1(): Boolean {
                return shouldUpdate
            }

            operator fun component2(): String? {
                return updateURL
            }

            operator fun component3(): String? {
                return updateVersion
            }

            operator fun component4(): String? {
                return changelog
            }

            operator fun component5(): String? {
                return updateNodeId
            }

            fun copy(
                @JsonProperty("shouldUpdate") z: Boolean,
                @JsonProperty("updateURL") str: String?,
                @JsonProperty("updateVersion") str2: String?,
                @JsonProperty("changelog") str3: String?,
                @JsonProperty("updateNodeId") str4: String?
            ): Update {
                return Update(z, str, str2, str3, str4)
            }

            override fun equals(obj: Object): Boolean {
                if (this === obj) {
                    return true
                }
                if (obj is Update) {
                    val update = obj as Update
                    return shouldUpdate == update.shouldUpdate && Intrinsics.areEqual(
                        updateURL, update.updateURL
                    ) && Intrinsics.areEqual(
                        updateVersion, update.updateVersion
                    ) && Intrinsics.areEqual(
                        changelog, update.changelog
                    ) && Intrinsics.areEqual(
                        updateNodeId, update.updateNodeId
                    )
                }
                return false
            }

            /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Type inference failed for: r0v1, types: [int] */ /* JADX WARN: Type inference failed for: r0v10 */ /* JADX WARN: Type inference failed for: r0v11 */
            override fun hashCode(): Int {
                val z = shouldUpdate
                r0 = z
                if (z) {
                    r0 = 1
                }
                val i: Int = r0 * 31
                val str = updateURL
                val hashCode = (i + (str?.hashCode() ?: 0)) * 31
                val str2 = updateVersion
                val hashCode2 = (hashCode + (str2?.hashCode() ?: 0)) * 31
                val str3 = changelog
                val hashCode3 = (hashCode2 + (str3?.hashCode() ?: 0)) * 31
                val str4 = updateNodeId
                return hashCode3 + (str4?.hashCode() ?: 0)
            }

            override fun toString(): String {
                return "Update(shouldUpdate=" + shouldUpdate + ", updateURL=" + updateURL + ", updateVersion=" + updateVersion + ", changelog=" + changelog + ", updateNodeId=" + updateNodeId + ')'
            }

            companion object {
                fun  /* synthetic */`copy$default`(
                    update: Update,
                    z: Boolean,
                    str: String?,
                    str2: String?,
                    str3: String?,
                    str4: String?,
                    i: Int,
                    obj: Object?
                ): Update {
                    var z = z
                    var str = str
                    var str2 = str2
                    var str3 = str3
                    var str4 = str4
                    if (i and 1 != 0) {
                        z = update.shouldUpdate
                    }
                    if (i and 2 != 0) {
                        str = update.updateURL
                    }
                    val str5 = str
                    if (i and 4 != 0) {
                        str2 = update.updateVersion
                    }
                    val str6 = str2
                    if (i and 8 != 0) {
                        str3 = update.changelog
                    }
                    val str7 = str3
                    if (i and 16 != 0) {
                        str4 = update.updateNodeId
                    }
                    return update.copy(z, str5, str6, str7, str4)
                }
            }
        }

        private fun getAppUpdate(activity: Activity): Update {
            val releaseUpdate: Update
            return try {
                releaseUpdate = if (PreferenceManager.getDefaultSharedPreferences(activity)
                        .getBoolean(activity.getString(R.string.prerelease_update_key), false)
                ) {
                    getPreReleaseUpdate(activity)
                } else {
                    getReleaseUpdate(activity)
                }
                releaseUpdate
            } catch (e: Exception) {
                System.out.println(e)
                Update(false, null, null, null, null)
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x0149  */ /* JADX WARN: Removed duplicated region for block: B:41:0x0167  */ /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private fun getReleaseUpdate(r17: Activity): Update {
            /*
                Method dump skipped, instructions count: 383
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.utils.InAppUpdater.Companion.getReleaseUpdate(android.app.Activity):com.lagradost.cloudstream3.utils.InAppUpdater\$Companion\$Update")
        }

        private fun getPreReleaseUpdate(activity: Activity): Update {
            val `runBlocking$default`: Object
            `runBlocking$default` = BuildersKt__BuildersKt.`runBlocking$default`(
                null,
                `InAppUpdater$Companion$getPreReleaseUpdate$1`(activity, null),
                1,
                null
            )
            return `runBlocking$default`
        }

        /* JADX INFO: Access modifiers changed from: private */
        fun downloadUpdate(activity: Activity, str: String?): Boolean {
            val j: Long
            val systemService: Object =
                ContextCompat.getSystemService(activity, DownloadManager::class.java)
            Intrinsics.checkNotNull(systemService)
            val downloadManager: DownloadManager = systemService as DownloadManager
            j = try {
                downloadManager.enqueue(
                    Request(Uri.parse(str)).setMimeType("application/vnd.android.package-archive")
                        .setTitle("BongNgoTV Update").setDestinationInExternalPublicDir(
                        Environment.DIRECTORY_DOWNLOADS,
                        activity.getString(R.string.app_name) + ".apk"
                    ).setAllowedNetworkTypes(3).setAllowedOverRoaming(true)
                        .setNotificationVisibility(1)
                )
            } catch (e: Exception) {
                ArchComponentExt.logError(e)
                CommonActivity.INSTANCE.showToast(activity, R.string.storage_error, 0)
                -1
            }
            if (j == -1L) {
                return true
            }
            activity.registerReceiver(object : BroadcastReceiver() {
                // from class: com.lagradost.cloudstream3.utils.InAppUpdater$Companion$downloadUpdate$1
                @Override // android.content.BroadcastReceiver
                fun onReceive(context: Context?, intent: Intent?) {
                    val j2: Long
                    try {
                        j2 = if (intent != null) {
                            intent.getLongExtra("extra_download_id", j)
                        } else {
                            j
                        }
                        val query: DownloadManager.Query = Query()
                        query.setFilterById(j2)
                        val query2: Cursor = downloadManager.query(query)
                        if (query2.moveToFirst() && 8 == query2.getInt(query2.getColumnIndex("status"))) {
                            query2.getColumnIndex("mediaprovider_uri")
                            val uri: Uri =
                                Uri.parse(query2.getString(query2.getColumnIndex("local_uri")))
                            Intrinsics.checkNotNullExpressionValue(uri, "uri")
                            InAppUpdater.Companion.openApk(activity, uri)
                        }
                    } catch (e2: Exception) {
                        ArchComponentExt.logError(e2)
                    }
                }
            }, IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"))
            return true
        }

        fun openApk(context: Context, uri: Uri) {
            Intrinsics.checkNotNullParameter(context, "context")
            Intrinsics.checkNotNullParameter(uri, "uri")
            try {
                val path: String = uri.getPath()
                if (path != null) {
                    val uriForFile: Uri =
                        FileProvider.getUriForFile(context, "com.bongngotv2.provider", File(path))
                    val intent = Intent("android.intent.action.VIEW")
                    intent.addFlags(1)
                    intent.addFlags(67108864)
                    intent.putExtra("android.intent.extra.NOT_UNKNOWN_SOURCE", true)
                    intent.setData(uriForFile)
                    context.startActivity(intent)
                }
            } catch (e: Exception) {
                ArchComponentExt.logError(e)
            }
        }

        fun runAutoUpdate(activity: Activity, z: Boolean): Boolean {
            Intrinsics.checkNotNullParameter(activity, "<this>")
            val defaultSharedPreferences: SharedPreferences =
                PreferenceManager.getDefaultSharedPreferences(activity)
            if (!z || defaultSharedPreferences.getBoolean(
                    activity.getString(R.string.auto_update_key),
                    true
                )
            ) {
                val appUpdate = getAppUpdate(activity)
                if (!appUpdate.shouldUpdate || appUpdate.updateURL == null) {
                    return false
                }
                if (StringsKt.`equals$default`(
                        appUpdate.updateNodeId,
                        defaultSharedPreferences.getString(
                            activity.getString(R.string.skip_update_key),
                            ""
                        ),
                        false,
                        2,
                        null
                    )
                ) {
                    return false
                }
                activity.runOnUiThread(object : Runnable() {
                    // from class: com.lagradost.cloudstream3.utils.-$$Lambda$InAppUpdater$Companion$pNdtEfQm-ZeoE1acYRtPjROPZtA
                    @Override // java.lang.Runnable
                    fun run() {
                        `m9001runAutoUpdate$lambda16`(
                            activity,
                            appUpdate,
                            z,
                            defaultSharedPreferences
                        )
                    }
                })
                return true
            }
            return false
        }

        companion object {
            /* JADX INFO: Access modifiers changed from: private */ /* renamed from: runAutoUpdate$lambda-16$lambda-15$lambda-13  reason: not valid java name */
            fun `m9003runAutoUpdate$lambda16$lambda15$lambda13`(
                dialogInterface: DialogInterface?,
                i: Int
            ) {
            }

            fun  /* synthetic */`runAutoUpdate$default`(
                companion: InAppUpdater.Companion,
                activity: Activity,
                z: Boolean,
                i: Int,
                obj: Object?
            ): Boolean {
                var z = z
                if (i and 1 != 0) {
                    z = true
                }
                return companion.runAutoUpdate(activity, z)
            }

            /* JADX INFO: Access modifiers changed from: private */ /* renamed from: runAutoUpdate$lambda-16  reason: not valid java name */
            fun `m9001runAutoUpdate$lambda16`(
                this_runAutoUpdate: Activity,
                update: Update,
                z: Boolean,
                sharedPreferences: SharedPreferences
            ) {
                Intrinsics.checkNotNullParameter(this_runAutoUpdate, "\$this_runAutoUpdate")
                Intrinsics.checkNotNullParameter(update, "\$update")
                try {
                    val packageName: String = this_runAutoUpdate.getPackageName()
                    val packageInfo: PackageInfo? =
                        if (packageName != null) this_runAutoUpdate.getPackageManager()
                            .getPackageInfo(packageName, 0) else null
                    val builder: AlertDialog.Builder = AlertDialog.Builder(this_runAutoUpdate)
                    val string: String = this_runAutoUpdate.getString(R.string.new_update_format)
                    Intrinsics.checkNotNullExpressionValue(
                        string,
                        "getString(R.string.new_update_format)"
                    )
                    val objArr: Array<Object?> = arrayOfNulls<Object?>(2)
                    objArr[0] = if (packageInfo != null) packageInfo.versionName else null
                    objArr[1] = update.updateVersion
                    val format: String = String.format(string, Arrays.copyOf(objArr, 2))
                    Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)")
                    builder.setTitle(format)
                    builder.setMessage(String.valueOf(update.changelog))
                    builder.setPositiveButton(R.string.update, object : OnClickListener() {
                        // from class: com.lagradost.cloudstream3.utils.-$$Lambda$InAppUpdater$Companion$CPVgpZg3x-LdaMJZcLdUFDJS4Eo
                        @Override // android.content.DialogInterface.OnClickListener
                        fun onClick(dialogInterface: DialogInterface?, i: Int) {
                            `m9002runAutoUpdate$lambda16$lambda15$lambda12`(
                                this_runAutoUpdate,
                                this_runAutoUpdate,
                                update,
                                dialogInterface,
                                i
                            )
                        }
                    })
                    builder.setNegativeButton(
                        R.string.cancel,
                        `$$Lambda$InAppUpdater$Companion$sR65Wcj52hCgBgmmIZES0Av70`.Companion.INSTANCE
                    )
                    if (z) {
                        builder.setNeutralButton(R.string.skip_update, object : OnClickListener() {
                            // from class: com.lagradost.cloudstream3.utils.-$$Lambda$InAppUpdater$Companion$gSM6YJrxozwDO8gk0mbCkbW3D_o
                            @Override // android.content.DialogInterface.OnClickListener
                            fun onClick(dialogInterface: DialogInterface?, i: Int) {
                                `m9004runAutoUpdate$lambda16$lambda15$lambda14`(
                                    sharedPreferences,
                                    this_runAutoUpdate,
                                    update,
                                    dialogInterface,
                                    i
                                )
                            }
                        })
                    }
                    builder.show()
                } catch (e: Exception) {
                    ArchComponentExt.logError(e)
                }
            }

            /* JADX INFO: Access modifiers changed from: private */ /* renamed from: runAutoUpdate$lambda-16$lambda-15$lambda-12  reason: not valid java name */
            fun `m9002runAutoUpdate$lambda16$lambda15$lambda12`(
                context: Activity?,
                this_runAutoUpdate: Activity,
                update: Update,
                dialogInterface: DialogInterface?,
                i: Int
            ) {
                Intrinsics.checkNotNullParameter(context, "\$context")
                Intrinsics.checkNotNullParameter(this_runAutoUpdate, "\$this_runAutoUpdate")
                Intrinsics.checkNotNullParameter(update, "\$update")
                CommonActivity.INSTANCE.showToast(context, R.string.download_started, 1)
                Thread.thread(
                    r12 and 1 !== 0,
                    if (r12 and 2 !== 0) false else false,
                    if (r12 and 4 !== 0) null else null,
                    if (r12 and 8 !== 0) null else null,
                    if (r12 and 16 !== 0) -1 else 0,
                    `InAppUpdater$Companion$runAutoUpdate$1$1$1$1`(
                        this_runAutoUpdate,
                        context,
                        update
                    )
                )
            }

            /* JADX INFO: Access modifiers changed from: private */ /* renamed from: runAutoUpdate$lambda-16$lambda-15$lambda-14  reason: not valid java name */
            fun `m9004runAutoUpdate$lambda16$lambda15$lambda14`(
                sharedPreferences: SharedPreferences,
                this_runAutoUpdate: Activity,
                update: Update,
                dialogInterface: DialogInterface?,
                i: Int
            ) {
                Intrinsics.checkNotNullParameter(this_runAutoUpdate, "\$this_runAutoUpdate")
                Intrinsics.checkNotNullParameter(update, "\$update")
                val edit: SharedPreferences.Editor = sharedPreferences.edit()
                val string: String = this_runAutoUpdate.getString(R.string.skip_update_key)
                var updateNodeId = update.updateNodeId
                if (updateNodeId == null) {
                    updateNodeId = ""
                }
                edit.putString(string, updateNodeId).apply()
            }
        }
    }
}