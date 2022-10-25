package com.lagradost.cloudstream3.extractors

import java.util.ArrayList
import kotlin.jvm.internal.Intrinsics

/* compiled from: WcoStream.kt */
@Metadata(
    m108d1 = ["\u0000.\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0002\u0000\u0004\b\u008a\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0018\b\u0003\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J(\u0010\n\u001a\u00020\u00002\u0018\b\u0003\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\u000c\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"],
    m107d2 = ["com/lagradost/cloudstream3/extractors/WcoStream\$getUrl\$MediaWco", "", "sources", "Ljava/util/ArrayList;", "com/lagradost/cloudstream3/extractors/WcoStream\$getUrl\$SourcesWco", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getSources", "()Ljava/util/ArrayList;", "component1", "copy", "(Ljava/util/ArrayList;)Lcom/lagradost/cloudstream3/extractors/WcoStream\$getUrl\$MediaWco;", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class `WcoStream$getUrl$MediaWco`(@JsonProperty("sources") sources: ArrayList<`WcoStream$getUrl$SourcesWco`?>) {
    private val sources: ArrayList<`WcoStream$getUrl$SourcesWco`>
    operator fun component1(): ArrayList<`WcoStream$getUrl$SourcesWco`> {
        return sources
    }

    fun copy(@JsonProperty("sources") sources: ArrayList<`WcoStream$getUrl$SourcesWco`?>): `WcoStream$getUrl$MediaWco` {
        Intrinsics.checkNotNullParameter(sources, "sources")
        return `WcoStream$getUrl$MediaWco`(sources)
    }

    override fun equals(obj: Object): Boolean {
        return if (this === obj) {
            true
        } else obj is `WcoStream$getUrl$MediaWco` && Intrinsics.areEqual(
            sources,
            (obj as `WcoStream$getUrl$MediaWco`).sources
        )
    }

    override fun hashCode(): Int {
        return sources.hashCode()
    }

    override fun toString(): String {
        return "MediaWco(sources=" + sources + ')'
    }

    init {
        Intrinsics.checkNotNullParameter(sources, "sources")
        this.sources = sources
    }

    /* synthetic */   constructor(
        arrayList: ArrayList?,
        i: Int,
        defaultConstructorMarker: DefaultConstructorMarker?
    ) : this(if (i and 1 != 0) ArrayList() else arrayList) {
    }

    fun getSources(): ArrayList<`WcoStream$getUrl$SourcesWco`> {
        return sources
    }

    companion object {
        /* JADX WARN: Multi-variable type inference failed */
        fun  /* synthetic */`copy$default`(
            `wcoStream$getUrl$MediaWco`: `WcoStream$getUrl$MediaWco`,
            arrayList: ArrayList,
            i: Int,
            obj: Object?
        ): `WcoStream$getUrl$MediaWco` {
            var arrayList: ArrayList = arrayList
            if (i and 1 != 0) {
                arrayList = `wcoStream$getUrl$MediaWco`.sources
            }
            return `wcoStream$getUrl$MediaWco`.copy(arrayList)
        }
    }
}