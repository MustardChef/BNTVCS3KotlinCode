package com.lagradost.cloudstream3

import androidx.exifinterface.media.ExifInterface
import kotlin.coroutines.jvm.internal.DebugMetadata
import com.lagradost.cloudstream3.``ParCollectionsKt$apmapIndexed$1$1$1`
import kotlin.jvm.internal.Intrinsics

/* compiled from: MainAPI.kt */
@Metadata(
    m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000c\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"],
    m107d2 = ["Lcom/lagradost/cloudstream3/Actor;", "", "name", "", "image", "(Ljava/lang/String;Ljava/lang/String;)V", "getImage", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class Actor(name: String, str: String?) {
    val image: String?
    val name: String
    operator fun component1(): String {
        return name
    }

    operator fun component2(): String? {
        return image
    }

    fun copy(name: String, str: String?): Actor {
        Intrinsics.checkNotNullParameter(name, "name")
        return Actor(name, str)
    }

    override fun equals(obj: Object): Boolean {
        if (this === obj) {
            return true
        }
        if (obj is Actor) {
            val actor = obj as Actor
            return Intrinsics.areEqual(name, actor.name) && Intrinsics.areEqual(
                image, actor.image
            )
        }
        return false
    }

    override fun hashCode(): Int {
        val hashCode = name.hashCode() * 31
        val str = image
        return hashCode + (str?.hashCode() ?: 0)
    }

    override fun toString(): String {
        return "Actor(name=" + name + ", image=" + image + ')'
    }

    init {
        Intrinsics.checkNotNullParameter(name, "name")
        this.name = name
        image = str
    }

    /* synthetic */   constructor(
        str: String,
        str2: String?,
        i: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(str, if (i and 2 != 0) null else str2) {
    }

    companion object {
        fun  /* synthetic */`copy$default`(
            actor: Actor,
            str: String,
            str2: String?,
            i: Int,
            obj: Object?
        ): Actor {
            var str = str
            var str2 = str2
            if (i and 1 != 0) {
                str = actor.name
            }
            if (i and 2 != 0) {
                str2 = actor.image
            }
            return actor.copy(str, str2)
        }
    }
}