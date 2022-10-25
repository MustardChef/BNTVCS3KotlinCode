package com.lagradost.cloudstream3

import java.util.ArrayList
import kotlin.jvm.internal.Intrinsics

/* compiled from: MainAPI.kt */
@Metadata(
    m108d1 = ["\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000c\bf\u0018\u0000 I2\u00020\u0001:\u0001IR \u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\u000c\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u00020\nX¦\u000e¢\u0006\u000c\u001a\u0004\b\u000b\u0010\u000c\"\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u00020\u0010X¦\u000e¢\u0006\u000c\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u0016X¦\u000e¢\u0006\u000c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u00020\nX¦\u000e¢\u0006\u000c\u001a\u0004\b\u001c\u0010\u000c\"\u0004\b\u001d\u0010\u000eR\u001a\u0010\u001e\u001a\u0004\u0018\u00010\nX¦\u000e¢\u0006\u000c\u001a\u0004\b\u001f\u0010\u000c\"\u0004\b \u0010\u000eR&\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\"X¦\u000e¢\u0006\u000c\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u0004\u0018\u00010\nX¦\u000e¢\u0006\u000c\u001a\u0004\b(\u0010\u000c\"\u0004\b)\u0010\u000eR\u001a\u0010*\u001a\u0004\u0018\u00010\u0016X¦\u000e¢\u0006\u000c\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001aR \u0010-\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u0003X¦\u000e¢\u0006\u000c\u001a\u0004\b/\u0010\u0006\"\u0004\b0\u0010\bR\u0014\u00101\u001a\u0004\u0018\u00010\nX¦\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u000cR$\u00103\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n04X¦\u000e¢\u0006\u000c\u001a\u0004\b5\u0010$\"\u0004\b6\u0010&R \u00107\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003X¦\u000e¢\u0006\u000c\u001a\u0004\b8\u0010\u0006\"\u0004\b9\u0010\bR \u0010:\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003X¦\u000e¢\u0006\u000c\u001a\u0004\b;\u0010\u0006\"\u0004\b<\u0010\bR\u0018\u0010=\u001a\u00020>X¦\u000e¢\u0006\u000c\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0018\u0010C\u001a\u00020\nX¦\u000e¢\u0006\u000c\u001a\u0004\bD\u0010\u000c\"\u0004\bE\u0010\u000eR\u001a\u0010F\u001a\u0004\u0018\u00010\u0016X¦\u000e¢\u0006\u000c\u001a\u0004\bG\u0010\u0018\"\u0004\bH\u0010\u001a¨\u0006J"],
    m107d2 = ["Lcom/lagradost/cloudstream3/LoadResponse;", "", "actors", "", "Lcom/lagradost/cloudstream3/ActorData;", "getActors", "()Ljava/util/List;", "setActors", "(Ljava/util/List;)V", "apiName", "", "getApiName", "()Ljava/lang/String;", "setApiName", "(Ljava/lang/String;)V", "comingSoon", "", "getComingSoon", "()Z", "setComingSoon", "(Z)V", TypedValues.TransitionType.S_DURATION, "", "getDuration", "()Ljava/lang/Integer;", "setDuration", "(Ljava/lang/Integer;)V", "name", "getName", "setName", "plot", "getPlot", "setPlot", "posterHeaders", "", "getPosterHeaders", "()Ljava/util/Map;", "setPosterHeaders", "(Ljava/util/Map;)V", "posterUrl", "getPosterUrl", "setPosterUrl", "rating", "getRating", "setRating", "recommendations", "Lcom/lagradost/cloudstream3/SearchResponse;", "getRecommendations", "setRecommendations", "reviewUrl", "getReviewUrl", "syncData", "", "getSyncData", "setSyncData", "tags", "getTags", "setTags", "trailers", "getTrailers", "setTrailers", "type", "Lcom/lagradost/cloudstream3/TvType;", "getType", "()Lcom/lagradost/cloudstream3/TvType;", "setType", "(Lcom/lagradost/cloudstream3/TvType;)V", "url", "getUrl", "setUrl", "year", "getYear", "setYear", "Companion", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
interface LoadResponse {
    var actors: List<ActorData>?
    var apiName: String?
    var comingSoon: Boolean
    fun getDuration(): Integer?
    var name: String
    var plot: String?
    var posterHeaders: Map<String, String>?
    var posterUrl: String?
    fun getRating(): Integer?
    var recommendations: List<SearchResponse>?
    val reviewUrl: String?
    var syncData: Map<String, String>
    var tags: List<String>?
    var trailers: List<String>?
    var type: TvType
    var url: String
    fun getYear(): Integer?
    fun setDuration(num: Integer?)
    fun setRating(num: Integer?)
    fun setYear(num: Integer?)

    /* compiled from: MainAPI.kt */
    @Metadata(
        m108d1 = ["\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007¢\u0006\u0002\b\u000cJ/\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u001c\u0010\t\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0018\u00010\nH\u0007¢\u0006\u0002\b\u000fJ*\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u001c\u0010\t\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00040\r\u0018\u00010\nH\u0007J!\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nH\u0007¢\u0006\u0002\b\u0010J\u0019\u0010\u0011\u001a\u00020\u0007*\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\u0014\u0010\u0015\u001a\u00020\u0007*\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004J\u0014\u0010\u0017\u001a\u00020\u0007*\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004J\u0014\u0010\u0018\u001a\u00020\u0007*\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004J\u0019\u0010\u001a\u001a\u00020\u0007*\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\u0019\u0010\u001b\u001a\u00020\u0007*\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\u0014\u0010\u001b\u001a\u00020\u0007*\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004J\u0014\u0010\u001e\u001a\u00020\u0007*\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004J\u0014\u0010\u001f\u001a\u00020\u0007*\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004J\u0014\u0010 \u001a\u00020\u0007*\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\u0004J\u001a\u0010 \u001a\u00020\u0007*\u00020\b2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nJ\u0014\u0010#\u001a\u00020\u0007*\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"],
        m107d2 = ["Lcom/lagradost/cloudstream3/LoadResponse\$Companion;", "", "()V", "aniListIdPrefix", "", "malIdPrefix", "addActors", "", "Lcom/lagradost/cloudstream3/LoadResponse;", "actors", "", "Lcom/lagradost/cloudstream3/Actor;", "addActorsOnly", "Lkotlin/Pair;", "Lcom/lagradost/cloudstream3/ActorRole;", "addActorsRole", "addActorNames", "addAniListId", "id", "", "(Lcom/lagradost/cloudstream3/LoadResponse;Ljava/lang/Integer;)V", "addDuration", TvContractCompat.PARAM_INPUT, "addImdbId", "addImdbUrl", "url", "addMalId", "addRating", "value", "text", "addTMDbId", "addTrackId", "addTrailer", "trailerUrl", "trailerUrls", "addkitsuId", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Companion private constructor() {
        fun addImdbId(loadResponse: LoadResponse?, str: String?) {
            Intrinsics.checkNotNullParameter(loadResponse, "<this>")
        }

        fun addTMDbId(loadResponse: LoadResponse?, str: String?) {
            Intrinsics.checkNotNullParameter(loadResponse, "<this>")
        }

        fun addTrackId(loadResponse: LoadResponse?, str: String?) {
            Intrinsics.checkNotNullParameter(loadResponse, "<this>")
        }

        fun addkitsuId(loadResponse: LoadResponse?, str: String?) {
            Intrinsics.checkNotNullParameter(loadResponse, "<this>")
        }

        fun addActorNames(loadResponse: LoadResponse, list: List<String>?) {
            Intrinsics.checkNotNullParameter(loadResponse, "<this>")
            var arrayList: ArrayList? = null
            if (list != null) {
                val list2: List<String> = list
                val arrayList2 = ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10))
                for (str in list2) {
                    arrayList2.add(ActorData(Actor(str, null, 2, null), null, null, null, 14, null))
                }
                arrayList = arrayList2
            }
            loadResponse.actors = arrayList
        }

        fun addActors(loadResponse: LoadResponse, list: List<Tuples<Actor, String>>?) {
            val arrayList: ArrayList?
            Intrinsics.checkNotNullParameter(loadResponse, "<this>")
            arrayList = if (list != null) {
                val list2: List<Tuples<Actor, String>> = list
                val arrayList2 = ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10))
                val it: Iterator<T> = list2.iterator()
                while (it.hasNext()) {
                    val tuples = it.next() as Tuples<*, *>
                    arrayList2.add(
                        ActorData(
                            tuples.component1() as Actor,
                            null,
                            tuples.component2() as String,
                            null,
                            10,
                            null
                        )
                    )
                }
                arrayList2
            } else {
                null
            }
            loadResponse.actors = arrayList
        }

        fun addActorsRole(loadResponse: LoadResponse, list: List<Tuples<Actor, out ActorRole>?>?) {
            val arrayList: ArrayList?
            Intrinsics.checkNotNullParameter(loadResponse, "<this>")
            arrayList = if (list != null) {
                val list2: List<Tuples<Actor, out ActorRole>?> = list
                val arrayList2 = ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10))
                val it: Iterator<T?> = list2.iterator()
                while (it.hasNext()) {
                    val tuples = it.next() as Tuples<*, *>?
                    arrayList2.add(
                        ActorData(
                            tuples!!.component1() as Actor,
                            tuples.component2() as ActorRole,
                            null,
                            null,
                            12,
                            null
                        )
                    )
                }
                arrayList2
            } else {
                null
            }
            loadResponse.actors = arrayList
        }

        fun addActorsOnly(loadResponse: LoadResponse, list: List<Actor>?) {
            val arrayList: ArrayList?
            Intrinsics.checkNotNullParameter(loadResponse, "<this>")
            arrayList = if (list != null) {
                val list2: List<Actor> = list
                val arrayList2 = ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10))
                for (actor in list2) {
                    arrayList2.add(ActorData(actor, null, null, null, 14, null))
                }
                arrayList2
            } else {
                null
            }
            loadResponse.actors = arrayList
        }

        fun addMalId(loadResponse: LoadResponse, num: Integer?) {
            Intrinsics.checkNotNullParameter(loadResponse, "<this>")
            val syncData = loadResponse.syncData
            val str = malIdPrefix
            if (num != null) {
                syncData.put(str, String.valueOf(num.intValue()))
            }
        }

        fun addAniListId(loadResponse: LoadResponse, num: Integer?) {
            Intrinsics.checkNotNullParameter(loadResponse, "<this>")
            val syncData = loadResponse.syncData
            val str = aniListIdPrefix
            if (num != null) {
                syncData.put(str, String.valueOf(num.intValue()))
            }
        }

        fun addImdbUrl(loadResponse: LoadResponse?, str: String?) {
            Intrinsics.checkNotNullParameter(loadResponse, "<this>")
            addImdbId(loadResponse, MainAPIKt.imdbUrlToIdNullable(str))
        }

        fun addTrailer(loadResponse: LoadResponse, str: String?) {
            Intrinsics.checkNotNullParameter(loadResponse, "<this>")
            if (str == null) {
                return
            }
            if (loadResponse.trailers == null) {
                loadResponse.trailers = CollectionsKt.listOf(str)
                return
            }
            val trailers = loadResponse.trailers
            val mutableList: List<String>? =
                if (trailers != null) CollectionsKt.toMutableList(trailers as Collection?) else null
            mutableList?.add(str)
            loadResponse.trailers = mutableList
        }

        fun addTrailer(loadResponse: LoadResponse, list: List<String>?) {
            Intrinsics.checkNotNullParameter(loadResponse, "<this>")
            if (list == null) {
                return
            }
            if (loadResponse.trailers == null) {
                loadResponse.trailers = list
                return
            }
            val trailers = loadResponse.trailers
            val mutableList: List<String>? =
                if (trailers != null) CollectionsKt.toMutableList(trailers as Collection?) else null
            mutableList?.addAll(list)
            loadResponse.trailers = mutableList
        }

        fun addRating(loadResponse: LoadResponse?, str: String?) {
            Intrinsics.checkNotNullParameter(loadResponse, "<this>")
            addRating(loadResponse, MainAPIKt.toRatingInt(str))
        }

        fun addRating(loadResponse: LoadResponse, num: Integer?) {
            Intrinsics.checkNotNullParameter(loadResponse, "<this>")
            if (num == null || num.intValue() < 0 || num.intValue() > 10000) {
                return
            }
            loadResponse.setRating(num)
        }

        fun addDuration(loadResponse: LoadResponse, str: String?) {
            Intrinsics.checkNotNullParameter(loadResponse, "<this>")
            var durationFromString: Integer? = MainAPIKt.getDurationFromString(str)
            if (durationFromString == null) {
                durationFromString = loadResponse.getDuration()
            }
            loadResponse.setDuration(durationFromString)
        }

        companion object {
            /* synthetic */ val `$$INSTANCE` = Companion()
            private val malIdPrefix: String = AccountManager.Companion.getMalApi().getIdPrefix()
            private val aniListIdPrefix: String =
                AccountManager.Companion.getAniListApi().getIdPrefix()
        }
    }

    companion object {
        @kotlin.jvm.JvmField
        val Companion = LoadResponse.Companion.`$$INSTANCE`
    }
}