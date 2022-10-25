package com.phimhd

import java.util.List
import kotlin.jvm.internal.Intrinsics

/* compiled from: ConfigHome.kt */
@Metadata(
    m108d1 = ["\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"],
    m107d2 = ["Lcom/phimhd/ConfigHome;", "", "collections", "", "Lcom/phimhd/Collection;", "listBanners", "Lcom/phimhd/Banner;", "(Ljava/util/List;Ljava/util/List;)V", "getCollections", "()Ljava/util/List;", "getListBanners", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class ConfigHome(
    @JsonProperty("collections") collections: List<Collection>,
    @JsonProperty("listBanners") listBanners: List<Banner>
) {
    val collections: List<Collection>
    val listBanners: List<Banner>
    operator fun component1(): List<Collection> {
        return collections
    }

    operator fun component2(): List<Banner> {
        return listBanners
    }

    fun copy(
        @JsonProperty("collections") collections: List<Collection>,
        @JsonProperty("listBanners") listBanners: List<Banner>
    ): ConfigHome {
        Intrinsics.checkNotNullParameter(collections, "collections")
        Intrinsics.checkNotNullParameter(listBanners, "listBanners")
        return ConfigHome(collections, listBanners)
    }

    override fun equals(obj: Object): Boolean {
        if (this === obj) {
            return true
        }
        if (obj is ConfigHome) {
            val configHome = obj as ConfigHome
            return Intrinsics.areEqual(collections, configHome.collections) && Intrinsics.areEqual(
                listBanners, configHome.listBanners
            )
        }
        return false
    }

    override fun hashCode(): Int {
        return collections.hashCode() * 31 + listBanners.hashCode()
    }

    override fun toString(): String {
        return "ConfigHome(collections=" + collections + ", listBanners=" + listBanners + ')'
    }

    init {
        Intrinsics.checkNotNullParameter(collections, "collections")
        Intrinsics.checkNotNullParameter(listBanners, "listBanners")
        this.collections = collections
        this.listBanners = listBanners
    }

    companion object {
        /* JADX WARN: Multi-variable type inference failed */
        fun  /* synthetic */`copy$default`(
            configHome: ConfigHome,
            list: List,
            list2: List,
            i: Int,
            obj: Object?
        ): ConfigHome {
            var list: List = list
            var list2: List = list2
            if (i and 1 != 0) {
                list = configHome.collections
            }
            if (i and 2 != 0) {
                list2 = configHome.listBanners
            }
            return configHome.copy(list, list2)
        }
    }
}