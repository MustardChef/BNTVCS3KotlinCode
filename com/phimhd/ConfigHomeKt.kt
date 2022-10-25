package com.phimhd

import android.util.Log
import kotlin.jvm.internal.Intrinsics

/* compiled from: ConfigHome.kt */
@Metadata(
    m108d1 = ["\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0006\u001a\u0010\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\u0006\u001a\n\u0010\n\u001a\u00020\u000b*\u00020\u000c\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"],
    m107d2 = ["IPTV_API_NAME", "", "SPONSOR_API_NAME", "toHomePageList", "Lcom/lagradost/cloudstream3/HomePageList;", "Lcom/phimhd/Collection;", "Lcom/phimhd/ListIPTV;", "toLiveTvSearchResponse", "", "Lcom/lagradost/cloudstream3/LiveTvSearchResponse;", "toSearchResponse", "Lcom/lagradost/cloudstream3/MovieSearchResponse;", "Lcom/phimhd/Banner;", "app_release"],
    m106k = 2,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
object ConfigHomeKt {
    const val IPTV_API_NAME = "iptv"
    const val SPONSOR_API_NAME = "sponsor"
    fun toHomePageList(listIPTV: ListIPTV): HomePageList {
        var str: String?
        Intrinsics.checkNotNullParameter(listIPTV, "<this>")
        val arrayList = ArrayList()
        val it: Iterator<T?> = listIPTV.data.iterator()
        while (true) {
            if (!it.hasNext()) {
                break
            }
            val next: Object? = it.next()
            if ((next as IPTV?)!!.link != null) {
                arrayList.add(next)
            }
        }
        val arrayList2: ArrayList<IPTV> = arrayList
        val arrayList3 = ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10))
        for (iptv in arrayList2) {
            val title: String = iptv.title
            Intrinsics.checkNotNull(title)
            val link: List<String?> = iptv.link
            if (link == null || CollectionsKt.first<Any>(link as List<Object?>) as String?. also {
                    str = it
                } == null) {
                str = ""
            }
            val tvType: TvType = TvType.Movie
            val thumbnail: String = iptv.thumbnail
            Intrinsics.checkNotNull(thumbnail)
            arrayList3.add(
                MovieSearchResponse(
                    title,
                    str,
                    IPTV_API_NAME,
                    tvType,
                    thumbnail,
                    0,
                    null,
                    null,
                    null,
                    448,
                    null
                )
            )
        }
        return HomePageList(
            "TV",
            arrayList3,
            null,
            null,
            HomeParentItemAdapter.CardType.TV_CARD,
            12,
            null
        )
    }

    fun toLiveTvSearchResponse(listIPTV: ListIPTV): List<LiveTvSearchResponse> {
        var str: String?
        Intrinsics.checkNotNullParameter(listIPTV, "<this>")
        val arrayList = ArrayList()
        val it: Iterator<T?> = listIPTV.data.iterator()
        while (true) {
            if (!it.hasNext()) {
                break
            }
            val next: Object? = it.next()
            if ((next as IPTV?)!!.link != null) {
                arrayList.add(next)
            }
        }
        val arrayList2: ArrayList<IPTV> = arrayList
        val arrayList3 = ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10))
        for (iptv in arrayList2) {
            val title: String = iptv.title
            Intrinsics.checkNotNull(title)
            val link: List<String?> = iptv.link
            if (link == null || CollectionsKt.first<Any>(link as List<Object?>) as String?. also {
                    str = it
                } == null) {
                str = ""
            }
            val tvType: TvType = TvType.Movie
            val thumbnail: String = iptv.thumbnail
            Intrinsics.checkNotNull(thumbnail)
            arrayList3.add(
                LiveTvSearchResponse(
                    title,
                    str,
                    IPTV_API_NAME,
                    tvType,
                    thumbnail,
                    0,
                    null,
                    null,
                    null,
                    448,
                    null
                )
            )
        }
        return arrayList3
    }

    fun toSearchResponse(banner: Banner): MovieSearchResponse {
        Intrinsics.checkNotNullParameter(banner, "<this>")
        val title: String? = banner.title
        val urlDetail: String? = banner.urlDetail
        var str: String? = ""
        val str2 = urlDetail ?: ""
        val urlPhoto: String? = banner.urlPhoto
        val aPIHolder: APIHolder = APIHolder.INSTANCE
        val urlDetail2: String? = banner.urlDetail
        if (urlDetail2 == null) {
            val urlStream: String? = banner.urlStream
            if (urlStream != null) {
                str = urlStream
            }
        } else {
            str = urlDetail2
        }
        return MovieSearchResponse(
            title,
            str2,
            aPIHolder.getApiNameFromUrl(str),
            null,
            urlPhoto,
            null,
            null,
            null,
            null,
            488,
            null
        )
    }

    fun toHomePageList(collection: Collection): HomePageList {
        Intrinsics.checkNotNullParameter(collection, "<this>")
        val name: String? = collection.name
        val movies: List<MovieHome?>? = collection.movies
        val arrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(movies, 10))
        val it: Iterator<T?> = movies!!.iterator()
        while (true) {
            val z = false
            if (!it.hasNext()) {
                break
            }
            val movieHome = it.next() as MovieHome?
            Log.d("DuongKK", String.valueOf(movieHome))
            arrayList.add(
                MovieSearchResponse(
                    movieHome.getTitle(),
                    if (movieHome!!.isSponsor) movieHome.urlStream else movieHome.urlDetail,
                    if (movieHome.isSponsor) SPONSOR_API_NAME else APIHolder.INSTANCE.getApiNameFromUrl(
                        movieHome.urlDetail
                    ),
                    TvType.Movie,
                    movieHome.urlPhoto,
                    0,
                    null,
                    null,
                    null,
                    448,
                    null
                )
            )
        }
        val arrayList2: ArrayList = arrayList
        val urlDetail: String? = collection.urlDetail
        return HomePageList(
            name,
            arrayList2,
            if (urlDetail == null || StringsKt.isBlank(urlDetail)) true else if (true) null else collection.urlDetail,
            collection.urlDetail,
            null,
            16,
            null
        )
    }
}