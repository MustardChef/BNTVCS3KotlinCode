package com.lagradost.cloudstream3.subtitleproviders

import android.util.Log
import retrofit2.Response
import kotlin.jvm.internal.Intrinsics

/* compiled from: OpenSubtitleProvider.kt */
@Metadata(
    m108d1 = ["\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002JM\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00060\u000eH\u0016¢\u0006\u0002\u0010\u0011¨\u0006\u0012"],
    m107d2 = ["Lcom/lagradost/cloudstream3/subtitleproviders/OpenSubtitleProvider;", "Lcom/lagradost/cloudstream3/subtitleproviders/SubtitleApi;", "()V", "getService", "Lcom/lagradost/cloudstream3/services/ApiService;", "getSubtitles", "", "title", "", "year", "lang", "isTvSeries", "", "callback", "Lkotlin/Function1;", "", "Lcom/lagradost/cloudstream3/SubtitleFile;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;)V", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class OpenSubtitleProvider : SubtitleApi() {
    private val service: ApiService
        private get() = ApiUtils().createApi()

    @Override // com.lagradost.cloudstream3.subtitleproviders.SubtitleApi
    override fun getSubtitles(
        title: String?,
        str: String?,
        str2: String,
        bool: Boolean?,
        callback: Function1<List<SubtitleFile?>?, Unit>
    ) {
        var body: MovieIMDB
        var imdbID: String
        var listSub: List<SubtitleResponseOpenSubtitle>
        Intrinsics.checkNotNullParameter(title, "title")
        Intrinsics.checkNotNullParameter(callback, "callback")
        var `replace$default`: String = StringsKt.`replace$default`(
            StringsKt.`replace$default`(
                title,
                "(",
                "",
                false,
                4,
                null as Object?
            ), ")", "", false, 4, null as Object?
        )
        if (str != null) {
            `replace$default` =
                StringsKt.`replace$default`(`replace$default`, str, "", false, 4, null as Object?)
        }
        val arrayList = ArrayList()
        val arrayListOf: ArrayList = CollectionsKt.arrayListOf<Any>(
            "f395e338",
            "5161ca84",
            "7b72cfe2",
            "6f9425fa",
            "6d91a85b"
        )
        val str3 =
            "http://www.omdbapi.com/?t=" + `replace$default` + "&apikey=" + CollectionsKt.random(
                arrayListOf,
                Random.Default
            ) as String + "&y=" + str
        Log.d("DuongKK", "URL GETIMDB - $str3")
        val execute: Response<MovieIMDB> = service.getInfoMovieFromIMDB(str3).execute()
        if (!execute.isSuccessful || execute.body()
                .also { body = it } == null || body.imdbID.also { imdbID = it } == null
        ) {
            return
        }
        val str4 = "https://rest.opensubtitles.org/search/imdbid-$imdbID/sublanguageid-$str2"
        Log.d("DuongKK", "URL GETSUB - $str4")
        val execute2: Response<List<SubtitleResponseOpenSubtitle>> =
            service.getSubtitleFromOpenSubtitles("phimhd", str4).execute()
        if (!execute2.isSuccessful || execute2.body().also { listSub = it } == null) {
            return
        }
        Intrinsics.checkNotNullExpressionValue(listSub, "listSub")
        for (subtitleResponseOpenSubtitle in listSub) {
            val zipDownloadLink: String? = subtitleResponseOpenSubtitle.zipDownloadLink
            val subFileName: String? = subtitleResponseOpenSubtitle.subFileName
            if (zipDownloadLink != null && subFileName != null) {
                arrayList.add(SubtitleFile(String.valueOf(subFileName), zipDownloadLink, true))
            }
        }
        callback.invoke(arrayList)
    }
}