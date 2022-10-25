package com.phimhd

import java.util.List
import kotlin.jvm.internal.Intrinsics

/* compiled from: ConfigHome.kt */
@Metadata(
    m108d1 = ["\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003JK\u0010\u0016\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"],
    m107d2 = ["Lcom/phimhd/IPTV;", "", "id", "", "title", "thumbnail", "userAgent", "link", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getLink", "()Ljava/util/List;", "getThumbnail", "getTitle", "getUserAgent", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class IPTV(/* renamed from: id */
    @param:JsonProperty("id") val id: String,
    @param:JsonProperty("title") val title: String,
    @param:JsonProperty(
        "thumbnail"
    ) val thumbnail: String,
    @param:JsonProperty("userAgent") val userAgent: String,
    @param:JsonProperty(
        "link"
    ) private val link: List<String>
) {
    operator fun component1(): String {
        return id
    }

    operator fun component2(): String {
        return title
    }

    operator fun component3(): String {
        return thumbnail
    }

    operator fun component4(): String {
        return userAgent
    }

    operator fun component5(): List<String> {
        return link
    }

    fun copy(
        @JsonProperty("id") str: String,
        @JsonProperty("title") str2: String,
        @JsonProperty("thumbnail") str3: String,
        @JsonProperty("userAgent") str4: String,
        @JsonProperty("link") list: List<String>
    ): IPTV {
        return IPTV(str, str2, str3, str4, list)
    }

    override fun equals(obj: Object): Boolean {
        if (this === obj) {
            return true
        }
        if (obj is IPTV) {
            val iptv = obj as IPTV
            return Intrinsics.areEqual(id, iptv.id) && Intrinsics.areEqual(
                title, iptv.title
            ) && Intrinsics.areEqual(thumbnail, iptv.thumbnail) && Intrinsics.areEqual(
                userAgent, iptv.userAgent
            ) && Intrinsics.areEqual(link, iptv.link)
        }
        return false
    }

    override fun hashCode(): Int {
        val str = id
        val hashCode = (str?.hashCode() ?: 0) * 31
        val str2 = title
        val hashCode2 = (hashCode + (str2?.hashCode() ?: 0)) * 31
        val str3 = thumbnail
        val hashCode3 = (hashCode2 + (str3?.hashCode() ?: 0)) * 31
        val str4 = userAgent
        val hashCode4 = (hashCode3 + (str4?.hashCode() ?: 0)) * 31
        val list = link
        return hashCode4 + (list?.hashCode() ?: 0)
    }

    override fun toString(): String {
        return "IPTV(id=" + id + ", title=" + title + ", thumbnail=" + thumbnail + ", userAgent=" + userAgent + ", link=" + link + ')'
    }

    fun getLink(): List<String>? {
        return link
    }

    companion object {
        fun  /* synthetic */`copy$default`(
            iptv: IPTV,
            str: String,
            str2: String,
            str3: String,
            str4: String,
            list: List,
            i: Int,
            obj: Object?
        ): IPTV {
            var str = str
            var str2 = str2
            var str3 = str3
            var str4 = str4
            if (i and 1 != 0) {
                str = iptv.id
            }
            if (i and 2 != 0) {
                str2 = iptv.title
            }
            val str5 = str2
            if (i and 4 != 0) {
                str3 = iptv.thumbnail
            }
            val str6 = str3
            if (i and 8 != 0) {
                str4 = iptv.userAgent
            }
            val str7 = str4
            var list2: List<String> = list
            if (i and 16 != 0) {
                list2 = iptv.link
            }
            return iptv.copy(str, str5, str6, str7, list2)
        }
    }
}