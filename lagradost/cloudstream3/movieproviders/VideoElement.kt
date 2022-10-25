package com.lagradost.cloudstream3.movieproviders

import java.util.List
import kotlin.jvm.internal.Intrinsics

/* compiled from: StreamingcommunityProvider.kt */
@Metadata(
    m108d1 = ["\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"],
    m107d2 = ["Lcom/lagradost/cloudstream3/movieproviders/VideoElement;", "", "id", "", "slug", "", "images", "", "Lcom/lagradost/cloudstream3/movieproviders/Image;", "(JLjava/lang/String;Ljava/util/List;)V", "getId", "()J", "getImages", "()Ljava/util/List;", "getSlug", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class VideoElement(
    @JsonProperty("id") j: Long,
    @JsonProperty("slug") slug: String,
    @JsonProperty("images") images: List<Image>
) {
    /* renamed from: id */
    val id: Long
    val images: List<Image>
    val slug: String
    operator fun component1(): Long {
        return id
    }

    operator fun component2(): String {
        return slug
    }

    operator fun component3(): List<Image> {
        return images
    }

    fun copy(
        @JsonProperty("id") j: Long,
        @JsonProperty("slug") slug: String,
        @JsonProperty("images") images: List<Image>
    ): VideoElement {
        Intrinsics.checkNotNullParameter(slug, "slug")
        Intrinsics.checkNotNullParameter(images, "images")
        return VideoElement(j, slug, images)
    }

    override fun equals(obj: Object): Boolean {
        if (this === obj) {
            return true
        }
        if (obj is VideoElement) {
            val videoElement = obj as VideoElement
            return id == videoElement.id && Intrinsics.areEqual(
                slug,
                videoElement.slug
            ) && Intrinsics.areEqual(
                images, videoElement.images
            )
        }
        return false
    }

    override fun hashCode(): Int {
        return (`C$r8$backportedMethods$utility$Long$1$hashCode`.hashCode(id) * 31 + slug.hashCode()) * 31 + images.hashCode()
    }

    override fun toString(): String {
        return "VideoElement(id=" + id + ", slug=" + slug + ", images=" + images + ')'
    }

    init {
        Intrinsics.checkNotNullParameter(slug, "slug")
        Intrinsics.checkNotNullParameter(images, "images")
        id = j
        this.slug = slug
        this.images = images
    }

    companion object {
        /* JADX WARN: Multi-variable type inference failed */
        fun  /* synthetic */`copy$default`(
            videoElement: VideoElement,
            j: Long,
            str: String,
            list: List,
            i: Int,
            obj: Object?
        ): VideoElement {
            var j = j
            var str = str
            var list: List = list
            if (i and 1 != 0) {
                j = videoElement.id
            }
            if (i and 2 != 0) {
                str = videoElement.slug
            }
            if (i and 4 != 0) {
                list = videoElement.images
            }
            return videoElement.copy(j, str, list)
        }
    }
}