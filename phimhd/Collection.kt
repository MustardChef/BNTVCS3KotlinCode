package com.phimhd

import java.util.List
import kotlin.jvm.internal.Intrinsics

/* compiled from: ConfigHome.kt */
@Metadata(
    m108d1 = ["\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000c¨\u0006\u0018"],
    m107d2 = ["Lcom/phimhd/Collection;", "", "name", "", "urlDetail", "movies", "", "Lcom/phimhd/MovieHome;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getMovies", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", "getUrlDetail", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class Collection(
    @JsonProperty("name") name: String,
    @JsonProperty("urlDetail") urlDetail: String,
    @JsonProperty("movies") movies: List<MovieHome>
) {
    val movies: List<MovieHome>
    val name: String
    val urlDetail: String
    operator fun component1(): String {
        return name
    }

    operator fun component2(): String {
        return urlDetail
    }

    operator fun component3(): List<MovieHome> {
        return movies
    }

    fun copy(
        @JsonProperty("name") name: String,
        @JsonProperty("urlDetail") urlDetail: String,
        @JsonProperty("movies") movies: List<MovieHome>
    ): Collection {
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(urlDetail, "urlDetail")
        Intrinsics.checkNotNullParameter(movies, "movies")
        return Collection(name, urlDetail, movies)
    }

    override fun equals(obj: Object): Boolean {
        if (this === obj) {
            return true
        }
        if (obj is Collection) {
            val collection = obj as Collection
            return Intrinsics.areEqual(name, collection.name) && Intrinsics.areEqual(
                urlDetail, collection.urlDetail
            ) && Intrinsics.areEqual(movies, collection.movies)
        }
        return false
    }

    override fun hashCode(): Int {
        return (name.hashCode() * 31 + urlDetail.hashCode()) * 31 + movies.hashCode()
    }

    override fun toString(): String {
        return "Collection(name=" + name + ", urlDetail=" + urlDetail + ", movies=" + movies + ')'
    }

    init {
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(urlDetail, "urlDetail")
        Intrinsics.checkNotNullParameter(movies, "movies")
        this.name = name
        this.urlDetail = urlDetail
        this.movies = movies
    }

    companion object {
        /* JADX WARN: Multi-variable type inference failed */
        fun  /* synthetic */`copy$default`(
            collection: Collection,
            str: String,
            str2: String,
            list: List,
            i: Int,
            obj: Object?
        ): Collection {
            var str = str
            var str2 = str2
            var list: List = list
            if (i and 1 != 0) {
                str = collection.name
            }
            if (i and 2 != 0) {
                str2 = collection.urlDetail
            }
            if (i and 4 != 0) {
                list = collection.movies
            }
            return collection.copy(str, str2, list)
        }
    }
}