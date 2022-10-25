package com.lagradost.cloudstream3

import android.content.Context
import com.bongngotv2.R
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: MainAPI.kt */
@Metadata(
    m108d1 = ["\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001e\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u000bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u000bJ\u0012\u0010!\u001a\u0004\u0018\u00010\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000bJ/\u0010$\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000b2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010'J\u0016\u0010(\u001a\u00020\u000c2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000bJ\u0006\u0010)\u001a\u00020*J\b\u0010+\u001a\u00020*H\u0002J\n\u0010,\u001a\u00020\u000b*\u00020\u000bJ\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012*\u00020.2\b\b\u0002\u0010/\u001a\u000200J\u0010\u00101\u001a\b\u0012\u0004\u0012\u00020302*\u00020.J\u0010\u00104\u001a\b\u0012\u0004\u0012\u00020\u000b02*\u00020.J\u0010\u00105\u001a\b\u0012\u0004\u0012\u00020\u000b02*\u00020.J\u0010\u00106\u001a\b\u0012\u0004\u0012\u00020702*\u00020.J\n\u00108\u001a\u00020\u000c*\u000209R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u000cX\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006:"],
    m107d2 = ["Lcom/lagradost/cloudstream3/APIHolder;", "", "()V", "allProviders", "Ljava/util/ArrayList;", "Lcom/lagradost/cloudstream3/MainAPI;", "Lkotlin/collections/ArrayList;", "getAllProviders", "()Ljava/util/ArrayList;", "apiMap", "", "", "", "getApiMap", "()Ljava/util/Map;", "setApiMap", "(Ljava/util/Map;)V", "apis", "", "getApis", "()Ljava/util/List;", "setApis", "(Ljava/util/List;)V", "defProvider", "unixTime", "", "getUnixTime", "()J", "unixTimeMS", "getUnixTimeMS", "getApiFromName", "apiName", "getApiFromNameNull", "getApiFromUrlNull", "url", "getApiNameFromUrl", "getCaptchaToken", SDKConstants.PARAM_KEY, "referer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLoadResponseIdFromUrl", "initAll", "", "initMap", "capitalize", "filterProviderByPreferredMedia", "Landroid/content/Context;", "hasHomePageIsRequired", "", "getApiDubstatusSettings", "Ljava/util/HashSet;", "Lcom/lagradost/cloudstream3/DubStatus;", "getApiProviderLangSettings", "getApiSettings", "getApiTypeSettings", "Lcom/lagradost/cloudstream3/TvType;", "getId", "Lcom/lagradost/cloudstream3/LoadResponse;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class APIHolder private constructor() {
    fun capitalize(str: String): String {
        val valueOf: String
        Intrinsics.checkNotNullParameter(str, "<this>")
        if (str.length() > 0) {
            val sb = StringBuilder()
            val charAt: Char = str.charAt(0)
            if (Character.isLowerCase(charAt)) {
                val locale: Locale = Locale.getDefault()
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault()")
                valueOf = CharsKt.titlecase(charAt, locale)
            } else {
                valueOf = String.valueOf(charAt)
            }
            sb.append(valueOf as Object)
            val substring: String = str.substring(1)
            Intrinsics.checkNotNullExpressionValue(
                substring,
                "this as java.lang.String).substring(startIndex)"
            )
            sb.append(substring)
            return sb.toString()
        }
        return str
    }

    val unixTime: Long
        get() = System.currentTimeMillis() / 1000
    val unixTimeMS: Long
        get() = System.currentTimeMillis()
    val allProviders: ArrayList<MainAPI>
        get() = Companion.allProviders

    fun initAll() {
        val it: Iterator<MainAPI> = Companion.allProviders.iterator()
        while (it.hasNext()) {
            it.next().init()
        }
        Companion.apiMap = null
    }

    var apis: List<MainAPI>
        get() = Companion.apis
        set(list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>")
            Companion.apis = list
        }
    var apiMap: Map<String, Any>?
        get() = Companion.apiMap
        set(map) {
            Companion.apiMap = map
        }

    fun getApiNameFromUrl(url: String): String? {
        Intrinsics.checkNotNullParameter(url, "url")
        for (mainAPI in Companion.apis) {
            val lowerCase: String = url.toLowerCase(Locale.ROOT)
            Intrinsics.checkNotNullExpressionValue(
                lowerCase,
                "this as java.lang.String).toLowerCase(Locale.ROOT)"
            )
            if (!StringsKt.`contains$default`(
                    lowerCase as CharSequence,
                    mainAPI.mainUrl as CharSequence,
                    false,
                    2,
                    null as Object?
                )
            ) {
                val lowerCase2: String = url.toLowerCase(Locale.ROOT)
                Intrinsics.checkNotNullExpressionValue(
                    lowerCase2,
                    "this as java.lang.String).toLowerCase(Locale.ROOT)"
                )
                if (StringsKt.`contains$default`(
                        mainAPI.mainUrl as CharSequence,
                        lowerCase2 as CharSequence,
                        false,
                        2,
                        null as Object?
                    )
                ) {
                }
            }
            return mainAPI.name
        }
        return Companion.apis[0].name
    }

    private fun initMap() {
        if (Companion.apiMap == null) {
            val list = Companion.apis
            val arrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10))
            var i = 0
            for (obj in list) {
                val i2 = i + 1
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow()
                }
                arrayList.add(TuplesKt.m100to(obj.name, Integer.valueOf(i)))
                i = i2
            }
            Companion.apiMap = MapsKt.toMap(arrayList)
        }
    }

    fun getApiFromName(str: String?): MainAPI {
        val apiFromNameNull = getApiFromNameNull(str)
        return apiFromNameNull ?: Companion.apis[0]
    }

    fun getApiFromNameNull(str: String?): MainAPI? {
        var num: Integer
        if (str == null) {
            return null
        }
        initMap()
        val map: Map<String, Integer>? = Companion.apiMap
        return if (map == null || map[str].also { num = it } == null) {
            null
        } else CollectionsKt.getOrNull(Companion.apis, num.intValue()) as MainAPI?
    }

    fun getApiFromUrlNull(str: String?): MainAPI? {
        if (str == null) {
            return null
        }
        val it: Iterator<MainAPI> = Companion.allProviders.iterator()
        while (it.hasNext()) {
            val next = it.next()
            if (StringsKt.`startsWith$default`(str, next.mainUrl, false, 2, null as Object?)) {
                return next
            }
        }
        return null
    }

    fun getLoadResponseIdFromUrl(url: String?, apiName: String?): Int {
        Intrinsics.checkNotNullParameter(url, "url")
        Intrinsics.checkNotNullParameter(apiName, "apiName")
        return StringsKt.`replace$default`(
            StringsKt.`replace$default`(
                url,
                getApiFromName(apiName).mainUrl,
                "",
                false,
                4,
                null as Object?
            ), "/", "", false, 4, null as Object?
        ).hashCode()
    }

    fun getId(loadResponse: LoadResponse): Int {
        Intrinsics.checkNotNullParameter(loadResponse, "<this>")
        return getLoadResponseIdFromUrl(loadResponse.url, loadResponse.apiName)
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */ /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */ /* JADX WARN: Removed duplicated region for block: B:24:0x017d A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:25:0x017e  */ /* JADX WARN: Removed duplicated region for block: B:28:0x0191  */ /* JADX WARN: Removed duplicated region for block: B:29:0x0198  */ /* JADX WARN: Removed duplicated region for block: B:31:0x019b  */ /* JADX WARN: Removed duplicated region for block: B:36:0x0232 A[RETURN] */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun getCaptchaToken(
        r31: String?,
        r32: String?,
        r33: String?,
        r34: Continuation<in String?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.APIHolder.getCaptchaToken(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    fun getApiSettings(context: Context): HashSet<String> {
        Intrinsics.checkNotNullParameter(context, "<this>")
        val hashSet: HashSet<String> = HashSet()
        val apiProviderLangSettings: HashSet<String> = getApiProviderLangSettings(context)
        val arrayList = ArrayList()
        for (obj in Companion.apis) {
            if (apiProviderLangSettings.contains(obj.lang)) {
                arrayList.add(obj)
            }
        }
        val arrayList2: ArrayList<MainAPI> = arrayList
        val arrayList3 = ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10))
        for (mainAPI in arrayList2) {
            arrayList3.add(mainAPI.name)
        }
        hashSet.addAll(arrayList3)
        return hashSet
    }

    fun getApiDubstatusSettings(context: Context): HashSet<DubStatus> {
        Intrinsics.checkNotNullParameter(context, "<this>")
        val defaultSharedPreferences: SharedPreferences =
            PreferenceManager.getDefaultSharedPreferences(context)
        val hashSet: HashSet<DubStatus> = HashSet()
        CollectionsKt.addAll(hashSet, DubStatus.values())
        val string: String = context.getString(R.string.display_sub_key)
        val hashSet2: HashSet<DubStatus> = hashSet
        val arrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(hashSet2, 10))
        for (dubStatus in hashSet2) {
            arrayList.add(dubStatus.name())
        }
        val stringSet: Set<String> =
            defaultSharedPreferences.getStringSet(string, CollectionsKt.toMutableSet(arrayList))
                ?: return hashSet
        val values = DubStatus.values()
        val arrayList2 = ArrayList(values.size)
        for (dubStatus2 in values) {
            arrayList2.add(dubStatus2.name())
        }
        val hashSet3: HashSet = CollectionsKt.toHashSet(arrayList2)
        val arrayList3 = ArrayList()
        for (obj in stringSet) {
            if (hashSet3.contains(obj)) {
                arrayList3.add(obj)
            }
        }
        val arrayList4: ArrayList<String> = arrayList3
        val arrayList5 = ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10))
        for (it in arrayList4) {
            Intrinsics.checkNotNullExpressionValue(it, "it")
            arrayList5.add(DubStatus.valueOf(it!!))
        }
        return CollectionsKt.toHashSet(arrayList5)
    }

    fun getApiProviderLangSettings(context: Context): HashSet<String> {
        Intrinsics.checkNotNullParameter(context, "<this>")
        val defaultSharedPreferences: SharedPreferences =
            PreferenceManager.getDefaultSharedPreferences(context)
        val hashSet: HashSet<String> = HashSet()
        hashSet.add("en")
        val stringSet: Set<String> = defaultSharedPreferences.getStringSet(
            context.getString(R.string.provider_lang_key),
            CollectionsKt.toMutableSet(hashSet)
        )
        return if (stringSet == null || stringSet.isEmpty()) hashSet else CollectionsKt.toHashSet(
            stringSet
        )
    }

    fun getApiTypeSettings(context: Context): HashSet<TvType> {
        Intrinsics.checkNotNullParameter(context, "<this>")
        val defaultSharedPreferences: SharedPreferences =
            PreferenceManager.getDefaultSharedPreferences(context)
        val hashSet: HashSet<TvType> = HashSet()
        CollectionsKt.addAll(hashSet, TvType.values())
        val string: String = context.getString(R.string.search_types_list_key)
        val hashSet2: HashSet<TvType> = hashSet
        val arrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(hashSet2, 10))
        for (tvType in hashSet2) {
            arrayList.add(tvType.name())
        }
        val stringSet: Set<String> =
            defaultSharedPreferences.getStringSet(string, CollectionsKt.toMutableSet(arrayList))
        if (stringSet == null || stringSet.isEmpty()) {
            return hashSet
        }
        val values = TvType.values()
        val arrayList2 = ArrayList(values.size)
        for (tvType2 in values) {
            arrayList2.add(tvType2.name())
        }
        val hashSet3: HashSet = CollectionsKt.toHashSet(arrayList2)
        val arrayList3 = ArrayList()
        for (obj in stringSet) {
            if (hashSet3.contains(obj)) {
                arrayList3.add(obj)
            }
        }
        val arrayList4: ArrayList<String> = arrayList3
        val arrayList5 = ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10))
        for (it in arrayList4) {
            Intrinsics.checkNotNullExpressionValue(it, "it")
            arrayList5.add(TvType.valueOf(it!!))
        }
        val hashSet4: HashSet<TvType> = CollectionsKt.toHashSet(arrayList5)
        return if (hashSet4.isEmpty()) hashSet else hashSet4
    }

    fun filterProviderByPreferredMedia(context: Context, z: Boolean): List<MainAPI> {
        var z2: Boolean
        Intrinsics.checkNotNullParameter(context, "<this>")
        val i: Int = PreferenceManager.getDefaultSharedPreferences(context).getInt(
            context.getString(
                R.string.prefer_media_type_key
            ), 0
        )
        val apiProviderLangSettings: HashSet<String> = getApiProviderLangSettings(context)
        val arrayList = ArrayList()
        for (obj in Companion.apis) {
            if (apiProviderLangSettings.contains(obj.lang)) {
                arrayList.add(obj)
            }
        }
        val arrayList2 = ArrayList()
        val it: Iterator = arrayList.iterator()
        while (true) {
            var z3 = true
            if (!it.hasNext()) {
                break
            }
            val next: Object = it.next()
            if (!(next as MainAPI).hasMainPage && z) {
                z3 = false
            }
            if (z3) {
                arrayList2.add(next)
            }
        }
        val arrayList3: ArrayList = arrayList2
        if (i < 1) {
            return arrayList3
        }
        var listOf: List = CollectionsKt.listOf<Object>(
            *arrayOf<TvType?>(
                TvType.Anime,
                TvType.AnimeMovie,
                TvType.OVA
            ) as Array<Object?>
        )
        val listOf2: List = CollectionsKt.listOf<Object>(
            *arrayOf<TvType?>(
                TvType.Movie,
                TvType.TvSeries,
                TvType.Cartoon,
                TvType.AsianDrama
            ) as Array<Object?>
        )
        val listOf3: List = CollectionsKt.listOf(TvType.Documentary)
        if (i != 2) {
            listOf = if (i != 3) listOf2 else listOf3
        }
        val arrayList4 = ArrayList()
        for (obj2 in arrayList3) {
            val supportedTypes: Set<TvType?>? = (obj2 as MainAPI).supportedTypes
            if (supportedTypes !is Collection || !supportedTypes.isEmpty()) {
                for (tvType in supportedTypes!!) {
                    if (listOf.contains(tvType)) {
                        z2 = true
                        break
                    }
                }
            }
            z2 = false
            if (z2) {
                arrayList4.add(obj2)
            }
        }
        return arrayList4
    }

    companion object {
        private var apiMap: Map<String, Integer>? = null
        private const val defProvider = 0
        @kotlin.jvm.JvmField
        val INSTANCE = APIHolder()
        private val allProviders: ArrayList<MainAPI> = CollectionsKt.arrayListOf<MainAPI>(
            PhimChillProvider(),
            SubNhanhProvider(),
            LokLokProvider(),
            SuperStream(),
            SflixProvider(),
            SolarmovieProvider(),
            HDTodayProvider(),
            TocanimeProvider()
        )
        private var apis: List<MainAPI> = ArrayList()
        fun  /* synthetic */`getCaptchaToken$default`(
            aPIHolder: APIHolder,
            str: String?,
            str2: String?,
            str3: String?,
            continuation: Continuation<*>?,
            i: Int,
            obj: Object?
        ): Object {
            var str3 = str3
            if (i and 4 != 0) {
                str3 = null
            }
            return aPIHolder.getCaptchaToken(str, str2, str3, continuation)
        }

        @kotlin.jvm.JvmStatic
        fun  /* synthetic */`filterProviderByPreferredMedia$default`(
            aPIHolder: APIHolder,
            context: Context,
            z: Boolean,
            i: Int,
            obj: Object?
        ): List {
            var z = z
            if (i and 1 != 0) {
                z = true
            }
            return aPIHolder.filterProviderByPreferredMedia(context, z)
        }
    }
}