package com.lagradost.cloudstream3.syncproviders.providers

import android.content.Context
import com.fasterxml.jackson.core.type.TypeReference
import com.lagradost.cloudstream3.AcraApplication
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: MALApi.kt */
@Metadata(
    m108d1 = ["\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001f\u0018\u0000 e2\u00020\u00012\u00020\u0002:\u001fcdefghijklmnopqrstuvwxyz{|}~\u007f\u0080\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010&\u001a\u00020'H\u0016J\u0011\u0010(\u001a\u00020'H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010)J\u001c\u0010*\u001a\u0004\u0018\u00010\u000b2\u0006\u0010+\u001a\u00020\u000b2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u000bJ\u0010\u00100\u001a\u00020.2\u0006\u00101\u001a\u00020\u0004H\u0002J\n\u00102\u001a\u0004\u0018\u00010\u000bH\u0002J\u001b\u00103\u001a\u0004\u0018\u0001042\u0006\u00105\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0002\u00106J\u0010\u00107\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000bH\u0016J\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020;0:H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010)J\u0015\u0010<\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010:H\u0002¢\u0006\u0002\u0010=J\u001d\u0010>\u001a\u0004\u0018\u00010?2\b\b\u0002\u0010@\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0002\u00106J\u0019\u0010A\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010:H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010)J\u001d\u0010B\u001a\u0004\u0018\u00010C2\b\b\u0002\u0010D\u001a\u00020#H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010EJ\u001b\u0010F\u001a\u0004\u0018\u00010G2\u0006\u00105\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010HJ\u001b\u0010I\u001a\u0004\u0018\u00010J2\u0006\u00105\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010HJ\u0019\u0010K\u001a\u00020#2\u0006\u00108\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010HJ\b\u0010L\u001a\u00020'H\u0016J\n\u0010M\u001a\u0004\u0018\u00010NH\u0016J\u0019\u0010O\u001a\u0004\u0018\u00010P2\b\u0010/\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010QJ\u0011\u0010R\u001a\u00020'H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010)J!\u0010S\u001a\u00020#2\u0006\u00105\u001a\u00020\u000b2\u0006\u0010T\u001a\u00020JH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010UJ\u001f\u0010V\u001a\b\u0012\u0004\u0012\u00020X0W2\u0006\u0010\u001c\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010HJ\u0011\u0010Y\u001a\u00020'H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010)J=\u0010Z\u001a\u00020#2\u0006\u00105\u001a\u00020\u00042\n\b\u0002\u0010T\u001a\u0004\u0018\u00010.2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u0004H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\\J?\u0010Z\u001a\u0004\u0018\u00010\u000b2\u0006\u00105\u001a\u00020\u00042\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u0004H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010]J\u0010\u0010^\u001a\u00020'2\u0006\u0010_\u001a\u00020\u000bH\u0002J\u0014\u0010`\u001a\u0004\u0018\u00010X2\b\u0010a\u001a\u0004\u0018\u00010bH\u0002R*\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b`\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000c\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u001a\u0010\u0016\u001a\u00020\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0019R\u0014\u0010\u001f\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u000eR\u000e\u0010!\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u00020#X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0081\u0001"],
    m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi;", "Lcom/lagradost/cloudstream3/syncproviders/AccountManager;", "Lcom/lagradost/cloudstream3/syncproviders/SyncAPI;", FirebaseAnalytics.Param.INDEX, "", "(I)V", "allTitles", "Ljava/util/HashMap;", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MalTitleHolder;", "Lkotlin/collections/HashMap;", "codeVerifier", "", "createAccountUrl", "getCreateAccountUrl", "()Ljava/lang/String;", "icon", "getIcon", "()Ljava/lang/Integer;", "idPrefix", "getIdPrefix", SDKConstants.PARAM_KEY, "getKey", "mainUrl", "getMainUrl", "setMainUrl", "(Ljava/lang/String;)V", "mapper", "Lcom/fasterxml/jackson/databind/json/JsonMapper;", "name", "getName", "setName", "redirectUrl", "getRedirectUrl", "requestId", "requiresLogin", "", "getRequiresLogin", "()Z", "authenticate", "", "checkMalToken", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "convertJapanTimeToTimeRemaining", "date", "endDate", "convertToStatus", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MalStatusType;", TypedValues.Custom.S_STRING, "fromIntToAnimeStatus", "inp", "getAuth", "getDataAboutMalId", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$SmallMalAnime;", "id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getIdFromUrl", "url", "getMalAnimeList", "", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Data;", "getMalAnimeListCached", "()[Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Data;", "getMalAnimeListSlice", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MalList;", TypedValues.CycleType.S_WAVE_OFFSET, "getMalAnimeListSmart", "getMalUser", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MalUser;", "setSettings", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getResult", "Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncResult;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStatus", "Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncStatus;", "handleRedirect", "logOut", "loginInfo", "Lcom/lagradost/cloudstream3/syncproviders/AuthAPI\$LoginInfo;", "parseDate", "", "(Ljava/lang/String;)Ljava/lang/Long;", "refreshToken", "score", "status", "(Ljava/lang/String;Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "", "Lcom/lagradost/cloudstream3/syncproviders/SyncAPI\$SyncSearchResult;", "setAllMalData", "setScoreRequest", "num_watched_episodes", "(ILcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MalStatusType;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storeToken", "response", "toSearchResult", "node", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Node;", "AlternativeTitles", "Broadcast", "Companion", "Data", "Genres", "ListStatus", "MainPicture", "MalAnime", "MalDatum", "MalList", "MalMainPicture", "MalNode", "MalRoot", "MalSearch", "MalSearchNode", "MalStatus", "MalStatusType", "MalTitleHolder", "MalUser", "MyListStatus", "Node", "Paging", "Recommendations", "RelatedAnime", "ResponseToken", "SmallMalAnime", "StartSeason", "Statistics", "Status", "Studios", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class MALApi(i: Int) : AccountManager(i), SyncAPI {
    private val allTitles: HashMap<Integer, MalTitleHolder>
    private var codeVerifier: String
    private val createAccountUrl: String
    private val icon: Int

    // com.lagradost.cloudstream3.syncproviders.AuthAPI
    @get:Override
    val idPrefix = "mal"

    // com.lagradost.cloudstream3.syncproviders.OAuth2API
    @get:Override
    val key = "1714d6f2f4f7cc19644384f8c4629910"
    private var mainUrl = "https://myanimelist.net"
    private val mapper: JsonMapper
    private var name = "MAL"

    // com.lagradost.cloudstream3.syncproviders.OAuth2API
    @get:Override
    val redirectUrl = "mallogin"
    private val requestId = 0

    // com.lagradost.cloudstream3.syncproviders.AuthAPI
    @get:Override
    val requiresLogin: Boolean

    init {
        icon = R.drawable.mal_logo
        requiresLogin = true
        createAccountUrl = getMainUrl() + "/register.php"
        val build: JsonMapper = JsonMapper.builder()
            .addModule(KotlinModule(0, false, false, false, null, false, 63, null))
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).build()
        Intrinsics.checkNotNull(build)
        mapper = build
        codeVerifier = ""
        allTitles = HashMap()
    }

    @Override // com.lagradost.cloudstream3.syncproviders.AuthAPI
    override fun getName(): String {
        return name
    }

    fun setName(str: String) {
        Intrinsics.checkNotNullParameter(str, "<set-?>")
        name = str
    }

    @Override // com.lagradost.cloudstream3.syncproviders.SyncAPI
    override fun getMainUrl(): String {
        return mainUrl
    }

    fun setMainUrl(str: String) {
        Intrinsics.checkNotNullParameter(str, "<set-?>")
        mainUrl = str
    }

    @Override // com.lagradost.cloudstream3.syncproviders.AuthAPI
    override fun getIcon(): Integer? {
        return Integer.valueOf(icon)
    }

    @Override // com.lagradost.cloudstream3.syncproviders.AuthAPI
    override fun getCreateAccountUrl(): String? {
        return createAccountUrl
    }

    @Override // com.lagradost.cloudstream3.syncproviders.AuthAPI
    override fun logOut() {
        removeAccountKeys()
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */ /* JADX WARN: Removed duplicated region for block: B:15:0x004c A[RETURN] */
    @Override // com.lagradost.cloudstream3.syncproviders.AuthAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun loginInfo(): LoginInfo? {
        /*
            r5 = this;
            com.lagradost.cloudstream3.AcraApplication$Companion r0 = com.lagradost.cloudstream3.AcraApplication.Companion
            java.lang.String r1 = r5.getAccountId()
            android.content.Context r0 = r0.getContext()
            r2 = 0
            if (r0 == 0) goto L35
            com.lagradost.cloudstream3.utils.DataStore r3 = com.lagradost.cloudstream3.utils.DataStore.INSTANCE
            java.lang.String r4 = "mal_user"
            java.lang.String r1 = r3.getFolderName(r1, r4)
            android.content.SharedPreferences r0 = r3.getSharedPrefs(r0)     // Catch: java.lang.Exception -> L35
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Exception -> L35
            if (r0 != 0) goto L20
            goto L35
        L20:
            java.lang.String r1 = "getSharedPrefs().getStri…h, null) ?: return defVal"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Exception -> L35
            com.fasterxml.jackson.databind.json.JsonMapper r1 = r3.getMapper()     // Catch: java.lang.Exception -> L35
            java.lang.Class<com.lagradost.cloudstream3.syncproviders.providers.MALApi$MalUser> r3 = com.lagradost.cloudstream3.syncproviders.providers.MALApi.MalUser.class
            java.lang.Object r0 = r1.readValue(r0, r3)     // Catch: java.lang.Exception -> L35
            java.lang.String r1 = "mapper.readValue(this, T::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Exception -> L35
            goto L36
        L35:
            r0 = r2
        L36:
            com.lagradost.cloudstream3.syncproviders.providers.MALApi$MalUser r0 = (com.lagradost.cloudstream3.syncproviders.providers.MALApi.MalUser) r0
            if (r0 == 0) goto L4c
            com.lagradost.cloudstream3.syncproviders.AuthAPI$LoginInfo r1 = new com.lagradost.cloudstream3.syncproviders.AuthAPI$LoginInfo
            java.lang.String r2 = r0.getPicture()
            java.lang.String r0 = r0.getName()
            int r3 = r5.getAccountIndex()
            r1.<init>(r2, r0, r3)
            return r1
        L4c:
            return r2
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.MALApi.loginInfo():com.lagradost.cloudstream3.syncproviders.AuthAPI\$LoginInfo")
    }

    private val auth: String?
        private get() {
            val companion: AcraApplication.Companion = AcraApplication.Companion
            val accountId: String = getAccountId()
            val context: Context = companion.getContext()
            var obj: Object? = null
            if (context != null) {
                val dataStore: DataStore = DataStore.INSTANCE
                try {
                    val string: String = dataStore.getSharedPrefs(context).getString(
                        dataStore.getFolderName(
                            accountId,
                            MALApi.Companion.MAL_TOKEN_KEY
                        ), null
                    )
                    if (string != null) {
                        Intrinsics.checkNotNullExpressionValue(
                            string,
                            "getSharedPrefs().getStri…h, null) ?: return defVal"
                        )
                        val readValue: Object =
                            dataStore.mapper.readValue(string, String::class.java)
                        Intrinsics.checkNotNullExpressionValue(
                            readValue,
                            "mapper.readValue(this, T::class.java)"
                        )
                        obj = readValue
                    }
                } catch (unused: Exception) {
                }
            }
            return obj
        }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */ /* JADX WARN: Removed duplicated region for block: B:25:0x00e8  */
    @Override // com.lagradost.cloudstream3.syncproviders.SyncAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun search(
        r22: String?,
        r23: Continuation<in MutableList<SyncSearchResult?>?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.MALApi.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    @Override // com.lagradost.cloudstream3.syncproviders.SyncAPI
    override fun getIdFromUrl(url: String?): String {
        Intrinsics.checkNotNullParameter(url, "url")
        val `find$default` = Regex.`find$default`(Regex("/anime/((.*)/|(.*))"), url, 0, 2, null)
        Intrinsics.checkNotNull(`find$default`)
        return CollectionsKt.first<Any>(`find$default`.groupValues as List<Object?>) as String
    }

    @Override // com.lagradost.cloudstream3.syncproviders.SyncAPI
    override fun score(
        str: String?,
        syncStatus: SyncStatus,
        continuation: Continuation<in Boolean?>?
    ): Object {
        val intOrNull: Integer? = StringsKt.toIntOrNull(str)
        return if (intOrNull != null) {
            setScoreRequest(
                intOrNull.intValue(),
                fromIntToAnimeStatus(syncStatus.getStatus()),
                syncStatus.getScore(),
                syncStatus.getWatchedEpisodes(),
                continuation
            )
        } else boxing.boxBoolean(false)
    }

    /* compiled from: MALApi.kt */
    @Metadata(
        m108d1 = ["\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bP\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B©\u0003\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000c\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0019\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010'\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u0019\u0012\u0010\b\u0001\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0019\u0012\u0010\b\u0001\u0010*\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u0019\u0012\u0010\b\u0001\u0010,\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\u0019\u0012\n\b\u0001\u0010.\u001a\u0004\u0018\u00010/¢\u0006\u0002\u00100J\u0010\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00104J\u0010\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00104J\u0010\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00104J\u0010\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00104J\u000b\u0010a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010f\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00104J\u000b\u0010j\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010!HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00104J\u000b\u0010n\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010o\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0019HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010q\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u0019HÆ\u0003J\u0011\u0010r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0019HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010t\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u0019HÆ\u0003J\u0011\u0010u\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\u0019HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010/HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010{\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010BJ\u0010\u0010|\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00104J²\u0003\u0010}\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00192\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010'\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u00192\u0010\b\u0003\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00192\u0010\b\u0003\u0010*\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u00192\u0010\b\u0003\u0010,\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\u00192\n\b\u0003\u0010.\u001a\u0004\u0018\u00010/HÆ\u0001¢\u0006\u0002\u0010~J\u0015\u0010\u007f\u001a\u00030\u0080\u00012\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0003HÖ\u0001J\n\u0010\u0083\u0001\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0015\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00105\u001a\u0004\b3\u00104R\u0013\u0010&\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u00107R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b;\u00107R\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00105\u001a\u0004\b>\u00104R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010C\u001a\u0004\bA\u0010BR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bD\u00107R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bG\u00107R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00105\u001a\u0004\bH\u00104R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00105\u001a\u0004\bI\u00104R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00105\u001a\u0004\bJ\u00104R\u0019\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bK\u0010=R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00105\u001a\u0004\bL\u00104R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00105\u001a\u0004\bM\u00104R\u0013\u0010$\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bN\u00107R\u0019\u0010*\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bO\u0010=R\u0019\u0010'\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bP\u0010=R\u0019\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010=R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bR\u00107R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bS\u00107R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0013\u0010.\u001a\u0004\u0018\u00010/¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bX\u00107R\u0019\u0010,\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bY\u0010=R\u0013\u0010\u000c\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bZ\u00107R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b[\u00107R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\\\u00107¨\u0006\u0084\u0001"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MalAnime;", "", "id", "", "title", "", "mainPicture", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MainPicture;", "alternativeTitles", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$AlternativeTitles;", "startDate", "endDate", "synopsis", "mean", "", "rank", "popularity", "numListUsers", "numScoringUsers", "nsfw", "createdAt", "updatedAt", "mediaType", "status", "genres", "Ljava/util/ArrayList;", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Genres;", "myListStatus", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MyListStatus;", "numEpisodes", "startSeason", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$StartSeason;", "broadcast", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Broadcast;", "source", "averageEpisodeDuration", "rating", "pictures", "background", "relatedAnime", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$RelatedAnime;", "relatedManga", "recommendations", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Recommendations;", "studios", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Studios;", "statistics", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Statistics;", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MainPicture;Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$AlternativeTitles;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MyListStatus;Ljava/lang/Integer;Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$StartSeason;Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Broadcast;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Statistics;)V", "getAlternativeTitles", "()Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$AlternativeTitles;", "getAverageEpisodeDuration", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBackground", "()Ljava/lang/String;", "getBroadcast", "()Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Broadcast;", "getCreatedAt", "getEndDate", "getGenres", "()Ljava/util/ArrayList;", "getId", "getMainPicture", "()Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MainPicture;", "getMean", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMediaType", "getMyListStatus", "()Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MyListStatus;", "getNsfw", "getNumEpisodes", "getNumListUsers", "getNumScoringUsers", "getPictures", "getPopularity", "getRank", "getRating", "getRecommendations", "getRelatedAnime", "getRelatedManga", "getSource", "getStartDate", "getStartSeason", "()Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$StartSeason;", "getStatistics", "()Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Statistics;", "getStatus", "getStudios", "getSynopsis", "getTitle", "getUpdatedAt", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MainPicture;Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$AlternativeTitles;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MyListStatus;Ljava/lang/Integer;Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$StartSeason;Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Broadcast;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Statistics;)Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MalAnime;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class MalAnime(
        @JsonProperty("id") num: Integer,
        @JsonProperty("title") str: String,
        @JsonProperty("main_picture") mainPicture: MainPicture,
        @JsonProperty("alternative_titles") alternativeTitles: AlternativeTitles,
        @JsonProperty("start_date") str2: String,
        @JsonProperty("end_date") str3: String,
        @JsonProperty("synopsis") str4: String,
        @JsonProperty("mean") d: Double,
        @JsonProperty("rank") num2: Integer,
        @JsonProperty("popularity") num3: Integer,
        @JsonProperty("num_list_users") num4: Integer,
        @JsonProperty("num_scoring_users") num5: Integer,
        @JsonProperty("nsfw") str5: String,
        @JsonProperty("created_at") str6: String,
        @JsonProperty("updated_at") str7: String,
        @JsonProperty("media_type") str8: String,
        @JsonProperty("status") str9: String,
        @JsonProperty("genres") arrayList: ArrayList<Genres?>,
        @JsonProperty("my_list_status") myListStatus: MyListStatus,
        @JsonProperty("num_episodes") num6: Integer,
        @JsonProperty("start_season") startSeason: StartSeason,
        @JsonProperty("broadcast") broadcast: Broadcast,
        @JsonProperty("source") str10: String,
        @JsonProperty("average_episode_duration") num7: Integer,
        @JsonProperty("rating") str11: String,
        @JsonProperty("pictures") arrayList2: ArrayList<MainPicture?>,
        @JsonProperty("background") str12: String,
        @JsonProperty("related_anime") arrayList3: ArrayList<RelatedAnime?>,
        @JsonProperty("related_manga") arrayList4: ArrayList<String?>,
        @JsonProperty("recommendations") arrayList5: ArrayList<Recommendations?>,
        @JsonProperty("studios") arrayList6: ArrayList<Studios?>,
        @JsonProperty("statistics") statistics: Statistics
    ) {
        val alternativeTitles: AlternativeTitles
        private val averageEpisodeDuration: Integer
        val background: String
        val broadcast: Broadcast
        val createdAt: String
        val endDate: String
        private val genres: ArrayList<Genres>

        /* renamed from: id */
        private val f10009id: Integer
        val mainPicture: MainPicture
        val mean: Double
        val mediaType: String
        val myListStatus: MyListStatus
        val nsfw: String
        private val numEpisodes: Integer
        private val numListUsers: Integer
        private val numScoringUsers: Integer
        private val pictures: ArrayList<MainPicture>
        private val popularity: Integer
        private val rank: Integer
        val rating: String
        private val recommendations: ArrayList<Recommendations>
        private val relatedAnime: ArrayList<RelatedAnime>
        private val relatedManga: ArrayList<String>
        val source: String
        val startDate: String
        val startSeason: StartSeason
        val statistics: Statistics
        val status: String
        private val studios: ArrayList<Studios>
        val synopsis: String
        val title: String
        val updatedAt: String
        operator fun component1(): Integer {
            return f10009id
        }

        operator fun component10(): Integer {
            return popularity
        }

        operator fun component11(): Integer {
            return numListUsers
        }

        operator fun component12(): Integer {
            return numScoringUsers
        }

        operator fun component13(): String {
            return nsfw
        }

        operator fun component14(): String {
            return createdAt
        }

        operator fun component15(): String {
            return updatedAt
        }

        operator fun component16(): String {
            return mediaType
        }

        operator fun component17(): String {
            return status
        }

        operator fun component18(): ArrayList<Genres> {
            return genres
        }

        operator fun component19(): MyListStatus {
            return myListStatus
        }

        operator fun component2(): String {
            return title
        }

        operator fun component20(): Integer {
            return numEpisodes
        }

        operator fun component21(): StartSeason {
            return startSeason
        }

        operator fun component22(): Broadcast {
            return broadcast
        }

        operator fun component23(): String {
            return source
        }

        operator fun component24(): Integer {
            return averageEpisodeDuration
        }

        operator fun component25(): String {
            return rating
        }

        operator fun component26(): ArrayList<MainPicture> {
            return pictures
        }

        operator fun component27(): String {
            return background
        }

        operator fun component28(): ArrayList<RelatedAnime> {
            return relatedAnime
        }

        operator fun component29(): ArrayList<String> {
            return relatedManga
        }

        operator fun component3(): MainPicture {
            return mainPicture
        }

        operator fun component30(): ArrayList<Recommendations> {
            return recommendations
        }

        operator fun component31(): ArrayList<Studios> {
            return studios
        }

        operator fun component32(): Statistics {
            return statistics
        }

        operator fun component4(): AlternativeTitles {
            return alternativeTitles
        }

        operator fun component5(): String {
            return startDate
        }

        operator fun component6(): String {
            return endDate
        }

        operator fun component7(): String {
            return synopsis
        }

        operator fun component8(): Double {
            return mean
        }

        operator fun component9(): Integer {
            return rank
        }

        fun copy(
            @JsonProperty("id") num: Integer,
            @JsonProperty("title") str: String,
            @JsonProperty("main_picture") mainPicture: MainPicture,
            @JsonProperty("alternative_titles") alternativeTitles: AlternativeTitles,
            @JsonProperty("start_date") str2: String,
            @JsonProperty("end_date") str3: String,
            @JsonProperty("synopsis") str4: String,
            @JsonProperty("mean") d: Double,
            @JsonProperty("rank") num2: Integer,
            @JsonProperty("popularity") num3: Integer,
            @JsonProperty("num_list_users") num4: Integer,
            @JsonProperty("num_scoring_users") num5: Integer,
            @JsonProperty("nsfw") str5: String,
            @JsonProperty("created_at") str6: String,
            @JsonProperty("updated_at") str7: String,
            @JsonProperty("media_type") str8: String,
            @JsonProperty("status") str9: String,
            @JsonProperty("genres") arrayList: ArrayList<Genres?>,
            @JsonProperty("my_list_status") myListStatus: MyListStatus,
            @JsonProperty("num_episodes") num6: Integer,
            @JsonProperty("start_season") startSeason: StartSeason,
            @JsonProperty("broadcast") broadcast: Broadcast,
            @JsonProperty("source") str10: String,
            @JsonProperty("average_episode_duration") num7: Integer,
            @JsonProperty("rating") str11: String,
            @JsonProperty("pictures") arrayList2: ArrayList<MainPicture?>,
            @JsonProperty("background") str12: String,
            @JsonProperty("related_anime") arrayList3: ArrayList<RelatedAnime?>,
            @JsonProperty("related_manga") arrayList4: ArrayList<String?>,
            @JsonProperty("recommendations") arrayList5: ArrayList<Recommendations?>,
            @JsonProperty("studios") arrayList6: ArrayList<Studios?>,
            @JsonProperty("statistics") statistics: Statistics
        ): MalAnime {
            return MalAnime(
                num,
                str,
                mainPicture,
                alternativeTitles,
                str2,
                str3,
                str4,
                d,
                num2,
                num3,
                num4,
                num5,
                str5,
                str6,
                str7,
                str8,
                str9,
                arrayList,
                myListStatus,
                num6,
                startSeason,
                broadcast,
                str10,
                num7,
                str11,
                arrayList2,
                str12,
                arrayList3,
                arrayList4,
                arrayList5,
                arrayList6,
                statistics
            )
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is MalAnime) {
                val malAnime = obj as MalAnime
                return Intrinsics.areEqual(f10009id, malAnime.f10009id) && Intrinsics.areEqual(
                    title, malAnime.title
                ) && Intrinsics.areEqual(mainPicture, malAnime.mainPicture) && Intrinsics.areEqual(
                    alternativeTitles, malAnime.alternativeTitles
                ) && Intrinsics.areEqual(
                    startDate, malAnime.startDate
                ) && Intrinsics.areEqual(
                    endDate, malAnime.endDate
                ) && Intrinsics.areEqual(synopsis, malAnime.synopsis) && Intrinsics.areEqual(
                    mean as Object, malAnime.mean as Object
                ) && Intrinsics.areEqual(
                    rank, malAnime.rank
                ) && Intrinsics.areEqual(popularity, malAnime.popularity) && Intrinsics.areEqual(
                    numListUsers, malAnime.numListUsers
                ) && Intrinsics.areEqual(
                    numScoringUsers, malAnime.numScoringUsers
                ) && Intrinsics.areEqual(
                    nsfw, malAnime.nsfw
                ) && Intrinsics.areEqual(createdAt, malAnime.createdAt) && Intrinsics.areEqual(
                    updatedAt, malAnime.updatedAt
                ) && Intrinsics.areEqual(
                    mediaType, malAnime.mediaType
                ) && Intrinsics.areEqual(status, malAnime.status) && Intrinsics.areEqual(
                    genres, malAnime.genres
                ) && Intrinsics.areEqual(
                    myListStatus,
                    malAnime.myListStatus
                ) && Intrinsics.areEqual(
                    numEpisodes, malAnime.numEpisodes
                ) && Intrinsics.areEqual(
                    startSeason, malAnime.startSeason
                ) && Intrinsics.areEqual(
                    broadcast, malAnime.broadcast
                ) && Intrinsics.areEqual(source, malAnime.source) && Intrinsics.areEqual(
                    averageEpisodeDuration, malAnime.averageEpisodeDuration
                ) && Intrinsics.areEqual(
                    rating, malAnime.rating
                ) && Intrinsics.areEqual(pictures, malAnime.pictures) && Intrinsics.areEqual(
                    background, malAnime.background
                ) && Intrinsics.areEqual(
                    relatedAnime, malAnime.relatedAnime
                ) && Intrinsics.areEqual(
                    relatedManga, malAnime.relatedManga
                ) && Intrinsics.areEqual(
                    recommendations, malAnime.recommendations
                ) && Intrinsics.areEqual(
                    studios, malAnime.studios
                ) && Intrinsics.areEqual(statistics, malAnime.statistics)
            }
            return false
        }

        override fun hashCode(): Int {
            val num: Integer = f10009id
            val hashCode = (if (num == null) 0 else num.hashCode()) * 31
            val str = title
            val hashCode2 = (hashCode + (str?.hashCode() ?: 0)) * 31
            val mainPicture = mainPicture
            val hashCode3 = (hashCode2 + (mainPicture?.hashCode() ?: 0)) * 31
            val alternativeTitles = alternativeTitles
            val hashCode4 = (hashCode3 + (alternativeTitles?.hashCode() ?: 0)) * 31
            val str2 = startDate
            val hashCode5 = (hashCode4 + (str2?.hashCode() ?: 0)) * 31
            val str3 = endDate
            val hashCode6 = (hashCode5 + (str3?.hashCode() ?: 0)) * 31
            val str4 = synopsis
            val hashCode7 = (hashCode6 + (str4?.hashCode() ?: 0)) * 31
            val d = mean
            val hashCode8 = (hashCode7 + (d?.hashCode() ?: 0)) * 31
            val num2: Integer = rank
            val hashCode9: Int = (hashCode8 + if (num2 == null) 0 else num2.hashCode()) * 31
            val num3: Integer = popularity
            val hashCode10: Int = (hashCode9 + if (num3 == null) 0 else num3.hashCode()) * 31
            val num4: Integer = numListUsers
            val hashCode11: Int = (hashCode10 + if (num4 == null) 0 else num4.hashCode()) * 31
            val num5: Integer = numScoringUsers
            val hashCode12: Int = (hashCode11 + if (num5 == null) 0 else num5.hashCode()) * 31
            val str5 = nsfw
            val hashCode13 = (hashCode12 + (str5?.hashCode() ?: 0)) * 31
            val str6 = createdAt
            val hashCode14 = (hashCode13 + (str6?.hashCode() ?: 0)) * 31
            val str7 = updatedAt
            val hashCode15 = (hashCode14 + (str7?.hashCode() ?: 0)) * 31
            val str8 = mediaType
            val hashCode16 = (hashCode15 + (str8?.hashCode() ?: 0)) * 31
            val str9 = status
            val hashCode17 = (hashCode16 + (str9?.hashCode() ?: 0)) * 31
            val arrayList: ArrayList<Genres> = genres
            val hashCode18: Int =
                (hashCode17 + if (arrayList == null) 0 else arrayList.hashCode()) * 31
            val myListStatus = myListStatus
            val hashCode19 = (hashCode18 + (myListStatus?.hashCode() ?: 0)) * 31
            val num6: Integer = numEpisodes
            val hashCode20: Int = (hashCode19 + if (num6 == null) 0 else num6.hashCode()) * 31
            val startSeason = startSeason
            val hashCode21 = (hashCode20 + (startSeason?.hashCode() ?: 0)) * 31
            val broadcast = broadcast
            val hashCode22 = (hashCode21 + (broadcast?.hashCode() ?: 0)) * 31
            val str10 = source
            val hashCode23 = (hashCode22 + (str10?.hashCode() ?: 0)) * 31
            val num7: Integer = averageEpisodeDuration
            val hashCode24: Int = (hashCode23 + if (num7 == null) 0 else num7.hashCode()) * 31
            val str11 = rating
            val hashCode25 = (hashCode24 + (str11?.hashCode() ?: 0)) * 31
            val arrayList2: ArrayList<MainPicture> = pictures
            val hashCode26: Int =
                (hashCode25 + if (arrayList2 == null) 0 else arrayList2.hashCode()) * 31
            val str12 = background
            val hashCode27 = (hashCode26 + (str12?.hashCode() ?: 0)) * 31
            val arrayList3: ArrayList<RelatedAnime> = relatedAnime
            val hashCode28: Int =
                (hashCode27 + if (arrayList3 == null) 0 else arrayList3.hashCode()) * 31
            val arrayList4: ArrayList<String> = relatedManga
            val hashCode29: Int =
                (hashCode28 + if (arrayList4 == null) 0 else arrayList4.hashCode()) * 31
            val arrayList5: ArrayList<Recommendations> = recommendations
            val hashCode30: Int =
                (hashCode29 + if (arrayList5 == null) 0 else arrayList5.hashCode()) * 31
            val arrayList6: ArrayList<Studios> = studios
            val hashCode31: Int =
                (hashCode30 + if (arrayList6 == null) 0 else arrayList6.hashCode()) * 31
            val statistics = statistics
            return hashCode31 + (statistics?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "MalAnime(id=" + f10009id + ", title=" + title + ", mainPicture=" + mainPicture + ", alternativeTitles=" + alternativeTitles + ", startDate=" + startDate + ", endDate=" + endDate + ", synopsis=" + synopsis + ", mean=" + mean + ", rank=" + rank + ", popularity=" + popularity + ", numListUsers=" + numListUsers + ", numScoringUsers=" + numScoringUsers + ", nsfw=" + nsfw + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", mediaType=" + mediaType + ", status=" + status + ", genres=" + genres + ", myListStatus=" + myListStatus + ", numEpisodes=" + numEpisodes + ", startSeason=" + startSeason + ", broadcast=" + broadcast + ", source=" + source + ", averageEpisodeDuration=" + averageEpisodeDuration + ", rating=" + rating + ", pictures=" + pictures + ", background=" + background + ", relatedAnime=" + relatedAnime + ", relatedManga=" + relatedManga + ", recommendations=" + recommendations + ", studios=" + studios + ", statistics=" + statistics + ')'
        }

        init {
            f10009id = num
            title = str
            this.mainPicture = mainPicture
            this.alternativeTitles = alternativeTitles
            startDate = str2
            endDate = str3
            synopsis = str4
            mean = d
            rank = num2
            popularity = num3
            numListUsers = num4
            numScoringUsers = num5
            nsfw = str5
            createdAt = str6
            updatedAt = str7
            mediaType = str8
            status = str9
            genres = arrayList
            this.myListStatus = myListStatus
            numEpisodes = num6
            this.startSeason = startSeason
            this.broadcast = broadcast
            source = str10
            averageEpisodeDuration = num7
            rating = str11
            pictures = arrayList2
            background = str12
            relatedAnime = arrayList3
            relatedManga = arrayList4
            recommendations = arrayList5
            studios = arrayList6
            this.statistics = statistics
        }

        val id: Integer
            get() = f10009id

        fun getRank(): Integer {
            return rank
        }

        fun getPopularity(): Integer {
            return popularity
        }

        fun getNumListUsers(): Integer {
            return numListUsers
        }

        fun getNumScoringUsers(): Integer {
            return numScoringUsers
        }

        fun getGenres(): ArrayList<Genres> {
            return genres
        }

        fun getNumEpisodes(): Integer {
            return numEpisodes
        }

        fun getAverageEpisodeDuration(): Integer {
            return averageEpisodeDuration
        }

        fun getPictures(): ArrayList<MainPicture> {
            return pictures
        }

        fun getRelatedAnime(): ArrayList<RelatedAnime> {
            return relatedAnime
        }

        fun getRelatedManga(): ArrayList<String> {
            return relatedManga
        }

        fun getRecommendations(): ArrayList<Recommendations> {
            return recommendations
        }

        fun getStudios(): ArrayList<Studios> {
            return studios
        }
    }

    /* compiled from: MALApi.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0016"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Recommendations;", "", "node", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Node;", "numRecommendations", "", "(Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Node;Ljava/lang/Integer;)V", "getNode", "()Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Node;", "getNumRecommendations", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Node;Ljava/lang/Integer;)Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Recommendations;", "equals", "", "other", "hashCode", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Recommendations(
        @param:JsonProperty("node") val node: Node?,
        @JsonProperty("num_recommendations") num: Integer?
    ) {
        private val numRecommendations: Integer?
        operator fun component1(): Node? {
            return node
        }

        operator fun component2(): Integer? {
            return numRecommendations
        }

        fun copy(
            @JsonProperty("node") node: Node?,
            @JsonProperty("num_recommendations") num: Integer?
        ): Recommendations {
            return Recommendations(node, num)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Recommendations) {
                val recommendations = obj as Recommendations
                return Intrinsics.areEqual(node, recommendations.node) && Intrinsics.areEqual(
                    numRecommendations, recommendations.numRecommendations
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val node = node
            val hashCode = (node?.hashCode() ?: 0) * 31
            val num: Integer? = numRecommendations
            return hashCode + if (num != null) num.hashCode() else 0
        }

        override fun toString(): String {
            return "Recommendations(node=" + node + ", numRecommendations=" + numRecommendations + ')'
        }

        init {
            numRecommendations = num
        }

        @JvmOverloads
                /* synthetic */   constructor(
            node: Node? = null,
            num: Integer? = null,
            i: Int = 3,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(if (i and 1 != 0) null else node, if (i and 2 != 0) null else num) {
        }

        fun getNumRecommendations(): Integer? {
            return numRecommendations
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                recommendations: Recommendations,
                node: Node?,
                num: Integer?,
                i: Int,
                obj: Object?
            ): Recommendations {
                var node = node
                var num: Integer? = num
                if (i and 1 != 0) {
                    node = recommendations.node
                }
                if (i and 2 != 0) {
                    num = recommendations.numRecommendations
                }
                return recommendations.copy(node, num)
            }
        }
    }

    /* compiled from: MALApi.kt */
    @Metadata(
        m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Studios;", "", "id", "", "name", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Studios;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Studios(@JsonProperty("id") num: Integer?, @JsonProperty("name") str: String?) {
        /* renamed from: id */
        private val f10015id: Integer?
        val name: String?
        operator fun component1(): Integer? {
            return f10015id
        }

        operator fun component2(): String? {
            return name
        }

        fun copy(@JsonProperty("id") num: Integer?, @JsonProperty("name") str: String?): Studios {
            return Studios(num, str)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Studios) {
                val studios = obj as Studios
                return Intrinsics.areEqual(f10015id, studios.f10015id) && Intrinsics.areEqual(
                    name, studios.name
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val num: Integer? = f10015id
            val hashCode = (if (num == null) 0 else num.hashCode()) * 31
            val str = name
            return hashCode + (str?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "Studios(id=" + f10015id + ", name=" + name + ')'
        }

        init {
            f10015id = num
            name = str
        }

        @JvmOverloads
                /* synthetic */   constructor(
            num: Integer? = null,
            str: String? = null,
            i: Int = 3,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(if (i and 1 != 0) null else num, if (i and 2 != 0) null else str) {
        }

        val id: Integer?
            get() = f10015id

        companion object {
            fun  /* synthetic */`copy$default`(
                studios: Studios,
                num: Integer?,
                str: String?,
                i: Int,
                obj: Object?
            ): Studios {
                var num: Integer? = num
                var str = str
                if (i and 1 != 0) {
                    num = studios.f10015id
                }
                if (i and 2 != 0) {
                    str = studios.name
                }
                return studios.copy(num, str)
            }
        }
    }

    /* compiled from: MALApi.kt */
    @Metadata(
        m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u0019\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u000c\u001a\u0004\b\u0007\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u001f"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MyListStatus;", "", "status", "", "score", "", "numEpisodesWatched", "isRewatching", "", "updatedAt", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNumEpisodesWatched", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getScore", "getStatus", "()Ljava/lang/String;", "getUpdatedAt", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MyListStatus;", "equals", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class MyListStatus(
        @param:JsonProperty("status") val status: String?,
        @JsonProperty("score") num: Integer?,
        @JsonProperty("num_episodes_watched") num2: Integer?,
        @JsonProperty("is_rewatching") bool: Boolean?,
        @JsonProperty("updated_at") str2: String?
    ) {
        val isRewatching: Boolean?
        private val numEpisodesWatched: Integer?
        private val score: Integer?
        val updatedAt: String?
        operator fun component1(): String? {
            return status
        }

        operator fun component2(): Integer? {
            return score
        }

        operator fun component3(): Integer? {
            return numEpisodesWatched
        }

        operator fun component4(): Boolean? {
            return isRewatching
        }

        operator fun component5(): String? {
            return updatedAt
        }

        fun copy(
            @JsonProperty("status") str: String?,
            @JsonProperty("score") num: Integer?,
            @JsonProperty("num_episodes_watched") num2: Integer?,
            @JsonProperty("is_rewatching") bool: Boolean?,
            @JsonProperty("updated_at") str2: String?
        ): MyListStatus {
            return MyListStatus(str, num, num2, bool, str2)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is MyListStatus) {
                val myListStatus = obj as MyListStatus
                return Intrinsics.areEqual(status, myListStatus.status) && Intrinsics.areEqual(
                    score, myListStatus.score
                ) && Intrinsics.areEqual(
                    numEpisodesWatched, myListStatus.numEpisodesWatched
                ) && Intrinsics.areEqual(
                    isRewatching, myListStatus.isRewatching
                ) && Intrinsics.areEqual(
                    updatedAt, myListStatus.updatedAt
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val str = status
            val hashCode = (str?.hashCode() ?: 0) * 31
            val num: Integer? = score
            val hashCode2: Int = (hashCode + if (num == null) 0 else num.hashCode()) * 31
            val num2: Integer? = numEpisodesWatched
            val hashCode3: Int = (hashCode2 + if (num2 == null) 0 else num2.hashCode()) * 31
            val bool = isRewatching
            val hashCode4 = (hashCode3 + (bool?.hashCode() ?: 0)) * 31
            val str2 = updatedAt
            return hashCode4 + (str2?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "MyListStatus(status=" + status + ", score=" + score + ", numEpisodesWatched=" + numEpisodesWatched + ", isRewatching=" + isRewatching + ", updatedAt=" + updatedAt + ')'
        }

        init {
            score = num
            numEpisodesWatched = num2
            isRewatching = bool
            updatedAt = str2
        }

        @JvmOverloads
                /* synthetic */   constructor(
            str: String? = null,
            num: Integer? = null,
            num2: Integer? = null,
            bool: Boolean? = null,
            str2: String? = null,
            i: Int = 31,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) null else str,
            if (i and 2 != 0) null else num,
            if (i and 4 != 0) null else num2,
            if (i and 8 != 0) null else bool,
            if (i and 16 != 0) null else str2
        ) {
        }

        fun getScore(): Integer? {
            return score
        }

        fun getNumEpisodesWatched(): Integer? {
            return numEpisodesWatched
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                myListStatus: MyListStatus,
                str: String?,
                num: Integer?,
                num2: Integer?,
                bool: Boolean?,
                str2: String?,
                i: Int,
                obj: Object?
            ): MyListStatus {
                var str = str
                var num: Integer? = num
                var num2: Integer? = num2
                var bool = bool
                var str2 = str2
                if (i and 1 != 0) {
                    str = myListStatus.status
                }
                if (i and 2 != 0) {
                    num = myListStatus.score
                }
                val num3: Integer? = num
                if (i and 4 != 0) {
                    num2 = myListStatus.numEpisodesWatched
                }
                val num4: Integer? = num2
                if (i and 8 != 0) {
                    bool = myListStatus.isRewatching
                }
                val bool2 = bool
                if (i and 16 != 0) {
                    str2 = myListStatus.updatedAt
                }
                return myListStatus.copy(str, num3, num4, bool2, str2)
            }
        }
    }

    /* compiled from: MALApi.kt */
    @Metadata(
        m108d1 = ["\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\u000b¨\u0006\u0017"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$RelatedAnime;", "", "node", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Node;", "relationType", "", "relationTypeFormatted", "(Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Node;Ljava/lang/String;Ljava/lang/String;)V", "getNode", "()Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Node;", "getRelationType", "()Ljava/lang/String;", "getRelationTypeFormatted", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class RelatedAnime(
        @param:JsonProperty("node") val node: Node?,
        @param:JsonProperty(
            "relation_type"
        ) val relationType: String?,
        @param:JsonProperty("relation_type_formatted") val relationTypeFormatted: String?
    ) {
        operator fun component1(): Node? {
            return node
        }

        operator fun component2(): String? {
            return relationType
        }

        operator fun component3(): String? {
            return relationTypeFormatted
        }

        fun copy(
            @JsonProperty("node") node: Node?,
            @JsonProperty("relation_type") str: String?,
            @JsonProperty("relation_type_formatted") str2: String?
        ): RelatedAnime {
            return RelatedAnime(node, str, str2)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is RelatedAnime) {
                val relatedAnime = obj as RelatedAnime
                return Intrinsics.areEqual(node, relatedAnime.node) && Intrinsics.areEqual(
                    relationType, relatedAnime.relationType
                ) && Intrinsics.areEqual(
                    relationTypeFormatted, relatedAnime.relationTypeFormatted
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val node = node
            val hashCode = (node?.hashCode() ?: 0) * 31
            val str = relationType
            val hashCode2 = (hashCode + (str?.hashCode() ?: 0)) * 31
            val str2 = relationTypeFormatted
            return hashCode2 + (str2?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "RelatedAnime(node=" + node + ", relationType=" + relationType + ", relationTypeFormatted=" + relationTypeFormatted + ')'
        }

        @JvmOverloads
                /* synthetic */   constructor(
            node: Node? = null,
            str: String? = null,
            str2: String? = null,
            i: Int = 7,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) null else node,
            if (i and 2 != 0) null else str,
            if (i and 4 != 0) null else str2
        ) {
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                relatedAnime: RelatedAnime,
                node: Node?,
                str: String?,
                str2: String?,
                i: Int,
                obj: Object?
            ): RelatedAnime {
                var node = node
                var str = str
                var str2 = str2
                if (i and 1 != 0) {
                    node = relatedAnime.node
                }
                if (i and 2 != 0) {
                    str = relatedAnime.relationType
                }
                if (i and 4 != 0) {
                    str2 = relatedAnime.relationTypeFormatted
                }
                return relatedAnime.copy(node, str, str2)
            }
        }
    }

    /* compiled from: MALApi.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Status;", "", "watching", "", "completed", "onHold", "dropped", "planToWatch", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCompleted", "()Ljava/lang/String;", "getDropped", "getOnHold", "getPlanToWatch", "getWatching", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Status(
        @param:JsonProperty("watching") val watching: String?,
        @param:JsonProperty(
            "completed"
        ) val completed: String?,
        @param:JsonProperty("on_hold") val onHold: String?,
        @param:JsonProperty(
            "dropped"
        ) val dropped: String?,
        @param:JsonProperty("plan_to_watch") val planToWatch: String?
    ) {
        operator fun component1(): String? {
            return watching
        }

        operator fun component2(): String? {
            return completed
        }

        operator fun component3(): String? {
            return onHold
        }

        operator fun component4(): String? {
            return dropped
        }

        operator fun component5(): String? {
            return planToWatch
        }

        fun copy(
            @JsonProperty("watching") str: String?,
            @JsonProperty("completed") str2: String?,
            @JsonProperty("on_hold") str3: String?,
            @JsonProperty("dropped") str4: String?,
            @JsonProperty("plan_to_watch") str5: String?
        ): Status {
            return Status(str, str2, str3, str4, str5)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Status) {
                val status = obj as Status
                return Intrinsics.areEqual(watching, status.watching) && Intrinsics.areEqual(
                    completed, status.completed
                ) && Intrinsics.areEqual(onHold, status.onHold) && Intrinsics.areEqual(
                    dropped, status.dropped
                ) && Intrinsics.areEqual(planToWatch, status.planToWatch)
            }
            return false
        }

        override fun hashCode(): Int {
            val str = watching
            val hashCode = (str?.hashCode() ?: 0) * 31
            val str2 = completed
            val hashCode2 = (hashCode + (str2?.hashCode() ?: 0)) * 31
            val str3 = onHold
            val hashCode3 = (hashCode2 + (str3?.hashCode() ?: 0)) * 31
            val str4 = dropped
            val hashCode4 = (hashCode3 + (str4?.hashCode() ?: 0)) * 31
            val str5 = planToWatch
            return hashCode4 + (str5?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "Status(watching=" + watching + ", completed=" + completed + ", onHold=" + onHold + ", dropped=" + dropped + ", planToWatch=" + planToWatch + ')'
        }

        @JvmOverloads
                /* synthetic */   constructor(
            str: String? = null,
            str2: String? = null,
            str3: String? = null,
            str4: String? = null,
            str5: String? = null,
            i: Int = 31,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) null else str,
            if (i and 2 != 0) null else str2,
            if (i and 4 != 0) null else str3,
            if (i and 8 != 0) null else str4,
            if (i and 16 != 0) null else str5
        ) {
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                status: Status,
                str: String?,
                str2: String?,
                str3: String?,
                str4: String?,
                str5: String?,
                i: Int,
                obj: Object?
            ): Status {
                var str = str
                var str2 = str2
                var str3 = str3
                var str4 = str4
                var str5 = str5
                if (i and 1 != 0) {
                    str = status.watching
                }
                if (i and 2 != 0) {
                    str2 = status.completed
                }
                val str6 = str2
                if (i and 4 != 0) {
                    str3 = status.onHold
                }
                val str7 = str3
                if (i and 8 != 0) {
                    str4 = status.dropped
                }
                val str8 = str4
                if (i and 16 != 0) {
                    str5 = status.planToWatch
                }
                return status.copy(str, str6, str7, str8, str5)
            }
        }
    }

    /* compiled from: MALApi.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Statistics;", "", "status", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Status;", "numListUsers", "", "(Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Status;Ljava/lang/Integer;)V", "getNumListUsers", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStatus", "()Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Status;", "component1", "component2", "copy", "(Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Status;Ljava/lang/Integer;)Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Statistics;", "equals", "", "other", "hashCode", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Statistics(
        @param:JsonProperty("status") val status: Status?,
        @JsonProperty("num_list_users") num: Integer?
    ) {
        private val numListUsers: Integer?
        operator fun component1(): Status? {
            return status
        }

        operator fun component2(): Integer? {
            return numListUsers
        }

        fun copy(
            @JsonProperty("status") status: Status?,
            @JsonProperty("num_list_users") num: Integer?
        ): Statistics {
            return Statistics(status, num)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Statistics) {
                val statistics = obj as Statistics
                return Intrinsics.areEqual(status, statistics.status) && Intrinsics.areEqual(
                    numListUsers, statistics.numListUsers
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val status = status
            val hashCode = (status?.hashCode() ?: 0) * 31
            val num: Integer? = numListUsers
            return hashCode + if (num != null) num.hashCode() else 0
        }

        override fun toString(): String {
            return "Statistics(status=" + status + ", numListUsers=" + numListUsers + ')'
        }

        init {
            numListUsers = num
        }

        @JvmOverloads
                /* synthetic */   constructor(
            status: Status? = null,
            num: Integer? = null,
            i: Int = 3,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(if (i and 1 != 0) null else status, if (i and 2 != 0) null else num) {
        }

        fun getNumListUsers(): Integer? {
            return numListUsers
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                statistics: Statistics,
                status: Status?,
                num: Integer?,
                i: Int,
                obj: Object?
            ): Statistics {
                var status = status
                var num: Integer? = num
                if (i and 1 != 0) {
                    status = statistics.status
                }
                if (i and 2 != 0) {
                    num = statistics.numListUsers
                }
                return statistics.copy(status, num)
            }
        }
    }

    private fun parseDate(str: String?): Long? {
        var parse: Date
        return try {
            val simpleDateFormat = SimpleDateFormat(TmdbHelper.TMDB_DATE_PATTERN)
            if (str == null || simpleDateFormat.parse(str).also { parse = it } == null) {
                null
            } else Long.valueOf(parse.getTime())
        } catch (unused: Exception) {
            null
        }
    }

    private fun toSearchResult(node: Node?): SyncSearchResult? {
        var title: String?
        if (node == null || node.title.also { title = it } == null) {
            return null
        }
        val name = getName()
        val valueOf: String = String.valueOf(node.id)
        val str = "https://myanimelist.net/anime/" + node.id
        val main_picture = node.main_picture
        return SyncSearchResult(
            title,
            name,
            valueOf,
            str,
            main_picture?.large,
            null,
            null,
            null,
            null,
            480,
            null
        )
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */ /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */ /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */ /* JADX WARN: Removed duplicated region for block: B:29:0x00e1  */ /* JADX WARN: Removed duplicated region for block: B:30:0x00f3  */ /* JADX WARN: Removed duplicated region for block: B:33:0x0109  */ /* JADX WARN: Removed duplicated region for block: B:35:0x010e  */ /* JADX WARN: Removed duplicated region for block: B:41:0x0123  */ /* JADX WARN: Removed duplicated region for block: B:48:0x014b  */ /* JADX WARN: Removed duplicated region for block: B:51:0x0153  */ /* JADX WARN: Removed duplicated region for block: B:56:0x017f  */ /* JADX WARN: Removed duplicated region for block: B:59:0x01a1  */ /* JADX WARN: Removed duplicated region for block: B:69:0x01d2  */ /* JADX WARN: Removed duplicated region for block: B:72:0x01da  */ /* JADX WARN: Removed duplicated region for block: B:85:0x0213  */
    @Override // com.lagradost.cloudstream3.syncproviders.SyncAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun getResult(r45: String?, r46: Continuation<in SyncResult?>?): Any {
        /*
            Method dump skipped, instructions count: 594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.MALApi.getResult(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */ /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */ /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */ /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */ /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */ /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */ /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */ /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    @Override // com.lagradost.cloudstream3.syncproviders.SyncAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun getStatus(r14: String?, r15: Continuation<in SyncStatus?>?): Any {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.lagradost.cloudstream3.syncproviders.providers.MALApi$getStatus$1
            if (r0 == 0) goto L14
            r0 = r15
            com.lagradost.cloudstream3.syncproviders.providers.MALApi$getStatus$1 r0 = (com.lagradost.cloudstream3.syncproviders.providers.MALApi$getStatus$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r15 = r0.label
            int r15 = r15 - r2
            r0.label = r15
            goto L19
        L14:
            com.lagradost.cloudstream3.syncproviders.providers.MALApi$getStatus$1 r0 = new com.lagradost.cloudstream3.syncproviders.providers.MALApi$getStatus$1
            r0.<init>(r13, r15)
        L19:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.throwOnFailure(r15)
            goto L49
        L2b:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L33:
            kotlin.ResultKt.throwOnFailure(r15)
            java.lang.Integer r14 = kotlin.text.StringsKt.toIntOrNull(r14)
            if (r14 == 0) goto L85
            int r14 = r14.intValue()
            r0.label = r3
            java.lang.Object r15 = r13.getDataAboutMalId(r14, r0)
            if (r15 != r1) goto L49
            return r1
        L49:
            com.lagradost.cloudstream3.syncproviders.providers.MALApi$SmallMalAnime r15 = (com.lagradost.cloudstream3.syncproviders.providers.MALApi.SmallMalAnime) r15
            if (r15 == 0) goto L52
            com.lagradost.cloudstream3.syncproviders.providers.MALApi$MalStatus r14 = r15.getMy_list_status()
            goto L53
        L52:
            r14 = r4
        L53:
            if (r14 == 0) goto L5f
            int r15 = r14.getScore()
            java.lang.Integer r15 = kotlin.coroutines.jvm.internal.boxing.boxInt(r15)
            r7 = r15
            goto L60
        L5f:
            r7 = r4
        L60:
            java.lang.String[] r15 = com.lagradost.cloudstream3.syncproviders.providers.MALApi.malStatusAsString
            if (r14 == 0) goto L69
            java.lang.String r0 = r14.getStatus()
            goto L6a
        L69:
            r0 = r4
        L6a:
            int r6 = kotlin.collections.ArraysKt.indexOf(r15, r0)
            if (r14 == 0) goto L78
            int r14 = r14.getNum_episodes_watched()
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.boxing.boxInt(r14)
        L78:
            r8 = r4
            com.lagradost.cloudstream3.syncproviders.SyncAPI$SyncStatus r14 = new com.lagradost.cloudstream3.syncproviders.SyncAPI$SyncStatus
            r9 = 0
            r10 = 0
            r11 = 16
            r12 = 0
            r5 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r14
        L85:
            return r4
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.MALApi.getStatus(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* compiled from: MALApi.kt */
    @Metadata(
        m108d1 = ["\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000c¨\u0006\r"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Companion;", "", "()V", "MAL_CACHED_LIST", "", "MAL_REFRESH_TOKEN_KEY", "MAL_SHOULD_UPDATE_LIST", "MAL_TOKEN_KEY", "MAL_UNIXTIME_KEY", "MAL_USER_KEY", "malStatusAsString", "", "[Ljava/lang/String;", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */ /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */ /* JADX WARN: Removed duplicated region for block: B:24:0x0114  */ /* JADX WARN: Removed duplicated region for block: B:29:0x0137  */ /* JADX WARN: Removed duplicated region for block: B:30:0x0139  */
    @Override // com.lagradost.cloudstream3.syncproviders.OAuth2API
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun handleRedirect(r25: String?, r26: Continuation<in Boolean?>?): Any {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.MALApi.handleRedirect(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    @Override // com.lagradost.cloudstream3.syncproviders.OAuth2API
    override fun authenticate() {
        val bArr = ByteArray(96)
        SecureRandom().nextBytes(bArr)
        val encodeToString: String = Base64.encodeToString(bArr, 0)
        Intrinsics.checkNotNullExpressionValue(
            encodeToString,
            "encodeToString(codeVerifierBytes, Base64.DEFAULT)"
        )
        val `replace$default`: String = StringsKt.`replace$default`(
            StringsKt.`replace$default`(
                StringsKt.`replace$default`(
                    StringsKt.trimEnd(encodeToString, '='),
                    "+",
                    "-",
                    false,
                    4,
                    null as Object?
                ), "/", "_", false, 4, null as Object?
            ), "\n", "", false, 4, null as Object?
        )
        codeVerifier = `replace$default`
        AcraApplication.Companion.openBrowser("https://myanimelist.net/v1/oauth2/authorize?response_type=code&client_id=" + key + "&code_challenge=" + `replace$default` + "&state=RequestID" + requestId)
    }

    private fun storeToken(str: String) {
        try {
            if (Intrinsics.areEqual(str, "")) {
                return
            }
            val responseToken = mapper.readValue<ResponseToken>(
                str,
                object :
                    TypeReference<ResponseToken?>() { // from class: com.lagradost.cloudstream3.syncproviders.providers.MALApi$storeToken$$inlined$readValue$1
                }) as ResponseToken
            AcraApplication.Companion.setKey(
                getAccountId(),
                MALApi.Companion.MAL_UNIXTIME_KEY,
                Long.valueOf(responseToken.expires_in + AccountManager.Companion.Companion.getUnixTime())
            )
            AcraApplication.Companion.setKey<Any>(
                getAccountId(),
                MALApi.Companion.MAL_REFRESH_TOKEN_KEY,
                responseToken.refresh_token
            )
            AcraApplication.Companion.setKey<Any>(
                getAccountId(),
                MALApi.Companion.MAL_TOKEN_KEY,
                responseToken.access_token
            )
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(5:19|20|(4:22|23|24|(1:26)(2:27|28))|31|(1:33)(1:34))|12|13|14))|37|6|7|(0)(0)|12|13|14) */ /* JADX WARN: Code restructure failed: missing block: B:31:0x00df, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e0, code lost:
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */ /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun refreshToken(r25: Continuation<in Unit>?): Any {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.MALApi.refreshToken(kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* compiled from: MALApi.kt */
    @Metadata(
        m108d1 = ["\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MalList;", "", "data", "", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Data;", "paging", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Paging;", "(Ljava/util/List;Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Paging;)V", "getData", "()Ljava/util/List;", "getPaging", "()Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Paging;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class MalList(@JsonProperty("data") data: List<Data>, @JsonProperty("paging") paging: Paging) {
        val data: List<Data>
        val paging: Paging
        operator fun component1(): List<Data> {
            return data
        }

        operator fun component2(): Paging {
            return paging
        }

        fun copy(
            @JsonProperty("data") data: List<Data>,
            @JsonProperty("paging") paging: Paging
        ): MalList {
            Intrinsics.checkNotNullParameter(data, "data")
            Intrinsics.checkNotNullParameter(paging, "paging")
            return MalList(data, paging)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is MalList) {
                val malList = obj as MalList
                return Intrinsics.areEqual(data, malList.data) && Intrinsics.areEqual(
                    paging, malList.paging
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return data.hashCode() * 31 + paging.hashCode()
        }

        override fun toString(): String {
            return "MalList(data=" + data + ", paging=" + paging + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(data, "data")
            Intrinsics.checkNotNullParameter(paging, "paging")
            this.data = data
            this.paging = paging
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                malList: MalList,
                list: List,
                paging: Paging,
                i: Int,
                obj: Object?
            ): MalList {
                var list: List = list
                var paging = paging
                if (i and 1 != 0) {
                    list = malList.data
                }
                if (i and 2 != 0) {
                    paging = malList.paging
                }
                return malList.copy(list, paging)
            }
        }
    }

    /* compiled from: MALApi.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000c\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MainPicture;", "", "medium", "", "large", "(Ljava/lang/String;Ljava/lang/String;)V", "getLarge", "()Ljava/lang/String;", "getMedium", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class MainPicture(
        @JsonProperty("medium") medium: String,
        @JsonProperty("large") large: String
    ) {
        val large: String
        val medium: String
        operator fun component1(): String {
            return medium
        }

        operator fun component2(): String {
            return large
        }

        fun copy(
            @JsonProperty("medium") medium: String,
            @JsonProperty("large") large: String
        ): MainPicture {
            Intrinsics.checkNotNullParameter(medium, "medium")
            Intrinsics.checkNotNullParameter(large, "large")
            return MainPicture(medium, large)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is MainPicture) {
                val mainPicture = obj as MainPicture
                return Intrinsics.areEqual(medium, mainPicture.medium) && Intrinsics.areEqual(
                    large, mainPicture.large
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return medium.hashCode() * 31 + large.hashCode()
        }

        override fun toString(): String {
            return "MainPicture(medium=" + medium + ", large=" + large + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(medium, "medium")
            Intrinsics.checkNotNullParameter(large, "large")
            this.medium = medium
            this.large = large
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                mainPicture: MainPicture,
                str: String,
                str2: String,
                i: Int,
                obj: Object?
            ): MainPicture {
                var str = str
                var str2 = str2
                if (i and 1 != 0) {
                    str = mainPicture.medium
                }
                if (i and 2 != 0) {
                    str2 = mainPicture.large
                }
                return mainPicture.copy(str, str2)
            }
        }
    }

    /* compiled from: MALApi.kt */
    @Metadata(
        m108d1 = ["\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b@\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u009b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000c\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0010\b\u0001\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\"J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u00104J\u0011\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u0010\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010O\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0005HÆ\u0003J¤\u0002\u0010\\\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0010\b\u0003\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010]J\u0013\u0010^\u001a\u00020_2\b\u0010`\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010a\u001a\u00020\u0003HÖ\u0001J\t\u0010b\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\$R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010 \u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u00105\u001a\u0004\b3\u00104R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u0010+R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u0010+R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010'\u001a\u0004\b8\u0010&R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010'\u001a\u0004\b9\u0010&R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010'\u001a\u0004\b:\u0010&R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010'\u001a\u0004\b;\u0010&R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010'\u001a\u0004\b<\u0010&R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010'\u001a\u0004\b=\u0010&R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b>\u0010+R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0013\u0010\u000c\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bA\u0010+R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bB\u0010+R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bC\u0010+R\u0013\u0010!\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bD\u0010+¨\u0006c"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Node;", "", "id", "", "title", "", "main_picture", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MainPicture;", "alternative_titles", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$AlternativeTitles;", MessengerShareContentUtility.MEDIA_TYPE, "num_episodes", "status", "start_date", "end_date", "average_episode_duration", "synopsis", "mean", "", "genres", "", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Genres;", "rank", "popularity", "num_list_users", "num_favorites", "num_scoring_users", "start_season", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$StartSeason;", "broadcast", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Broadcast;", "nsfw", "created_at", "updated_at", "(ILjava/lang/String;Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MainPicture;Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$AlternativeTitles;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$StartSeason;Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Broadcast;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAlternative_titles", "()Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$AlternativeTitles;", "getAverage_episode_duration", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBroadcast", "()Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Broadcast;", "getCreated_at", "()Ljava/lang/String;", "getEnd_date", "getGenres", "()Ljava/util/List;", "getId", "()I", "getMain_picture", "()Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MainPicture;", "getMean", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMedia_type", "getNsfw", "getNum_episodes", "getNum_favorites", "getNum_list_users", "getNum_scoring_users", "getPopularity", "getRank", "getStart_date", "getStart_season", "()Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$StartSeason;", "getStatus", "getSynopsis", "getTitle", "getUpdated_at", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MainPicture;Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$AlternativeTitles;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$StartSeason;Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Broadcast;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Node;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Node(
        @JsonProperty("id") i: Int,
        @JsonProperty("title") title: String,
        @JsonProperty("main_picture") mainPicture: MainPicture,
        @JsonProperty("alternative_titles") alternativeTitles: AlternativeTitles,
        @JsonProperty("media_type") str: String,
        @JsonProperty("num_episodes") num: Integer,
        @JsonProperty("status") str2: String,
        @JsonProperty("start_date") str3: String,
        @JsonProperty("end_date") str4: String,
        @JsonProperty("average_episode_duration") num2: Integer,
        @JsonProperty("synopsis") str5: String,
        @JsonProperty("mean") d: Double,
        @JsonProperty("genres") list: List<Genres>,
        @JsonProperty("rank") num3: Integer,
        @JsonProperty("popularity") num4: Integer,
        @JsonProperty("num_list_users") num5: Integer,
        @JsonProperty("num_favorites") num6: Integer,
        @JsonProperty("num_scoring_users") num7: Integer,
        @JsonProperty("start_season") startSeason: StartSeason,
        @JsonProperty("broadcast") broadcast: Broadcast,
        @JsonProperty("nsfw") str6: String,
        @JsonProperty("created_at") str7: String,
        @JsonProperty("updated_at") str8: String
    ) {
        val alternative_titles: AlternativeTitles
        private val average_episode_duration: Integer
        val broadcast: Broadcast
        val created_at: String
        val end_date: String
        val genres: List<Genres>

        /* renamed from: id */
        val id: Int
        val main_picture: MainPicture
        val mean: Double
        val media_type: String
        val nsfw: String
        private val num_episodes: Integer
        private val num_favorites: Integer
        private val num_list_users: Integer
        private val num_scoring_users: Integer
        private val popularity: Integer
        private val rank: Integer
        val start_date: String
        val start_season: StartSeason
        val status: String
        val synopsis: String
        val title: String
        val updated_at: String
        operator fun component1(): Int {
            return id
        }

        operator fun component10(): Integer {
            return average_episode_duration
        }

        operator fun component11(): String {
            return synopsis
        }

        operator fun component12(): Double {
            return mean
        }

        operator fun component13(): List<Genres> {
            return genres
        }

        operator fun component14(): Integer {
            return rank
        }

        operator fun component15(): Integer {
            return popularity
        }

        operator fun component16(): Integer {
            return num_list_users
        }

        operator fun component17(): Integer {
            return num_favorites
        }

        operator fun component18(): Integer {
            return num_scoring_users
        }

        operator fun component19(): StartSeason {
            return start_season
        }

        operator fun component2(): String {
            return title
        }

        operator fun component20(): Broadcast {
            return broadcast
        }

        operator fun component21(): String {
            return nsfw
        }

        operator fun component22(): String {
            return created_at
        }

        operator fun component23(): String {
            return updated_at
        }

        operator fun component3(): MainPicture {
            return main_picture
        }

        operator fun component4(): AlternativeTitles {
            return alternative_titles
        }

        operator fun component5(): String {
            return media_type
        }

        operator fun component6(): Integer {
            return num_episodes
        }

        operator fun component7(): String {
            return status
        }

        operator fun component8(): String {
            return start_date
        }

        operator fun component9(): String {
            return end_date
        }

        fun copy(
            @JsonProperty("id") i: Int,
            @JsonProperty("title") title: String,
            @JsonProperty("main_picture") mainPicture: MainPicture,
            @JsonProperty("alternative_titles") alternativeTitles: AlternativeTitles,
            @JsonProperty("media_type") str: String,
            @JsonProperty("num_episodes") num: Integer,
            @JsonProperty("status") str2: String,
            @JsonProperty("start_date") str3: String,
            @JsonProperty("end_date") str4: String,
            @JsonProperty("average_episode_duration") num2: Integer,
            @JsonProperty("synopsis") str5: String,
            @JsonProperty("mean") d: Double,
            @JsonProperty("genres") list: List<Genres>,
            @JsonProperty("rank") num3: Integer,
            @JsonProperty("popularity") num4: Integer,
            @JsonProperty("num_list_users") num5: Integer,
            @JsonProperty("num_favorites") num6: Integer,
            @JsonProperty("num_scoring_users") num7: Integer,
            @JsonProperty("start_season") startSeason: StartSeason,
            @JsonProperty("broadcast") broadcast: Broadcast,
            @JsonProperty("nsfw") str6: String,
            @JsonProperty("created_at") str7: String,
            @JsonProperty("updated_at") str8: String
        ): Node {
            Intrinsics.checkNotNullParameter(title, "title")
            return Node(
                i,
                title,
                mainPicture,
                alternativeTitles,
                str,
                num,
                str2,
                str3,
                str4,
                num2,
                str5,
                d,
                list,
                num3,
                num4,
                num5,
                num6,
                num7,
                startSeason,
                broadcast,
                str6,
                str7,
                str8
            )
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Node) {
                val node = obj as Node
                return id == node.id && Intrinsics.areEqual(
                    title,
                    node.title
                ) && Intrinsics.areEqual(
                    main_picture, node.main_picture
                ) && Intrinsics.areEqual(
                    alternative_titles, node.alternative_titles
                ) && Intrinsics.areEqual(
                    media_type, node.media_type
                ) && Intrinsics.areEqual(
                    num_episodes, node.num_episodes
                ) && Intrinsics.areEqual(
                    status, node.status
                ) && Intrinsics.areEqual(start_date, node.start_date) && Intrinsics.areEqual(
                    end_date, node.end_date
                ) && Intrinsics.areEqual(
                    average_episode_duration, node.average_episode_duration
                ) && Intrinsics.areEqual(
                    synopsis, node.synopsis
                ) && Intrinsics.areEqual(
                    mean as Object,
                    node.mean as Object
                ) && Intrinsics.areEqual(
                    genres, node.genres
                ) && Intrinsics.areEqual(rank, node.rank) && Intrinsics.areEqual(
                    popularity, node.popularity
                ) && Intrinsics.areEqual(
                    num_list_users, node.num_list_users
                ) && Intrinsics.areEqual(
                    num_favorites, node.num_favorites
                ) && Intrinsics.areEqual(
                    num_scoring_users, node.num_scoring_users
                ) && Intrinsics.areEqual(
                    start_season, node.start_season
                ) && Intrinsics.areEqual(
                    broadcast, node.broadcast
                ) && Intrinsics.areEqual(nsfw, node.nsfw) && Intrinsics.areEqual(
                    created_at, node.created_at
                ) && Intrinsics.areEqual(
                    updated_at, node.updated_at
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val hashCode = (id * 31 + title.hashCode()) * 31
            val mainPicture = main_picture
            val hashCode2 = (hashCode + (mainPicture?.hashCode() ?: 0)) * 31
            val alternativeTitles = alternative_titles
            val hashCode3 = (hashCode2 + (alternativeTitles?.hashCode() ?: 0)) * 31
            val str = media_type
            val hashCode4 = (hashCode3 + (str?.hashCode() ?: 0)) * 31
            val num: Integer = num_episodes
            val hashCode5: Int = (hashCode4 + if (num == null) 0 else num.hashCode()) * 31
            val str2 = status
            val hashCode6 = (hashCode5 + (str2?.hashCode() ?: 0)) * 31
            val str3 = start_date
            val hashCode7 = (hashCode6 + (str3?.hashCode() ?: 0)) * 31
            val str4 = end_date
            val hashCode8 = (hashCode7 + (str4?.hashCode() ?: 0)) * 31
            val num2: Integer = average_episode_duration
            val hashCode9: Int = (hashCode8 + if (num2 == null) 0 else num2.hashCode()) * 31
            val str5 = synopsis
            val hashCode10 = (hashCode9 + (str5?.hashCode() ?: 0)) * 31
            val d = mean
            val hashCode11 = (hashCode10 + (d?.hashCode() ?: 0)) * 31
            val list = genres
            val hashCode12 = (hashCode11 + (list?.hashCode() ?: 0)) * 31
            val num3: Integer = rank
            val hashCode13: Int = (hashCode12 + if (num3 == null) 0 else num3.hashCode()) * 31
            val num4: Integer = popularity
            val hashCode14: Int = (hashCode13 + if (num4 == null) 0 else num4.hashCode()) * 31
            val num5: Integer = num_list_users
            val hashCode15: Int = (hashCode14 + if (num5 == null) 0 else num5.hashCode()) * 31
            val num6: Integer = num_favorites
            val hashCode16: Int = (hashCode15 + if (num6 == null) 0 else num6.hashCode()) * 31
            val num7: Integer = num_scoring_users
            val hashCode17: Int = (hashCode16 + if (num7 == null) 0 else num7.hashCode()) * 31
            val startSeason = start_season
            val hashCode18 = (hashCode17 + (startSeason?.hashCode() ?: 0)) * 31
            val broadcast = broadcast
            val hashCode19 = (hashCode18 + (broadcast?.hashCode() ?: 0)) * 31
            val str6 = nsfw
            val hashCode20 = (hashCode19 + (str6?.hashCode() ?: 0)) * 31
            val str7 = created_at
            val hashCode21 = (hashCode20 + (str7?.hashCode() ?: 0)) * 31
            val str8 = updated_at
            return hashCode21 + (str8?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "Node(id=" + id + ", title=" + title + ", main_picture=" + main_picture + ", alternative_titles=" + alternative_titles + ", media_type=" + media_type + ", num_episodes=" + num_episodes + ", status=" + status + ", start_date=" + start_date + ", end_date=" + end_date + ", average_episode_duration=" + average_episode_duration + ", synopsis=" + synopsis + ", mean=" + mean + ", genres=" + genres + ", rank=" + rank + ", popularity=" + popularity + ", num_list_users=" + num_list_users + ", num_favorites=" + num_favorites + ", num_scoring_users=" + num_scoring_users + ", start_season=" + start_season + ", broadcast=" + broadcast + ", nsfw=" + nsfw + ", created_at=" + created_at + ", updated_at=" + updated_at + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(title, "title")
            id = i
            this.title = title
            main_picture = mainPicture
            alternative_titles = alternativeTitles
            media_type = str
            num_episodes = num
            status = str2
            start_date = str3
            end_date = str4
            average_episode_duration = num2
            synopsis = str5
            mean = d
            genres = list
            rank = num3
            popularity = num4
            num_list_users = num5
            num_favorites = num6
            num_scoring_users = num7
            start_season = startSeason
            this.broadcast = broadcast
            nsfw = str6
            created_at = str7
            updated_at = str8
        }

        fun getNum_episodes(): Integer {
            return num_episodes
        }

        fun getAverage_episode_duration(): Integer {
            return average_episode_duration
        }

        fun getRank(): Integer {
            return rank
        }

        fun getPopularity(): Integer {
            return popularity
        }

        fun getNum_list_users(): Integer {
            return num_list_users
        }

        fun getNum_favorites(): Integer {
            return num_favorites
        }

        fun getNum_scoring_users(): Integer {
            return num_scoring_users
        }
    }

    /* compiled from: MALApi.kt */
    @Metadata(
        m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001c"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$ListStatus;", "", "status", "", "score", "", "num_episodes_watched", "is_rewatching", "", "updated_at", "(Ljava/lang/String;IIZLjava/lang/String;)V", "()Z", "getNum_episodes_watched", "()I", "getScore", "getStatus", "()Ljava/lang/String;", "getUpdated_at", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class ListStatus(
        @JsonProperty("status") str: String,
        @JsonProperty("score") i: Int,
        @JsonProperty("num_episodes_watched") i2: Int,
        @JsonProperty("is_rewatching") z: Boolean,
        @JsonProperty("updated_at") updated_at: String
    ) {
        private val is_rewatching: Boolean
        val num_episodes_watched: Int
        val score: Int
        val status: String
        val updated_at: String
        operator fun component1(): String {
            return status
        }

        operator fun component2(): Int {
            return score
        }

        operator fun component3(): Int {
            return num_episodes_watched
        }

        operator fun component4(): Boolean {
            return is_rewatching
        }

        operator fun component5(): String {
            return updated_at
        }

        fun copy(
            @JsonProperty("status") str: String,
            @JsonProperty("score") i: Int,
            @JsonProperty("num_episodes_watched") i2: Int,
            @JsonProperty("is_rewatching") z: Boolean,
            @JsonProperty("updated_at") updated_at: String
        ): ListStatus {
            Intrinsics.checkNotNullParameter(updated_at, "updated_at")
            return ListStatus(str, i, i2, z, updated_at)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is ListStatus) {
                val listStatus = obj as ListStatus
                return Intrinsics.areEqual(
                    status,
                    listStatus.status
                ) && score == listStatus.score && num_episodes_watched == listStatus.num_episodes_watched && is_rewatching == listStatus.is_rewatching && Intrinsics.areEqual(
                    updated_at, listStatus.updated_at
                )
            }
            return false
        }

        /* JADX WARN: Multi-variable type inference failed */
        override fun hashCode(): Int {
            val str = status
            val hashCode = (((str?.hashCode() ?: 0) * 31 + score) * 31 + num_episodes_watched) * 31
            val z = is_rewatching
            var i: Int = z.toInt()
            if (z.toInt() != 0) {
                i = 1
            }
            return (hashCode + i) * 31 + updated_at.hashCode()
        }

        override fun toString(): String {
            return "ListStatus(status=" + status + ", score=" + score + ", num_episodes_watched=" + num_episodes_watched + ", is_rewatching=" + is_rewatching + ", updated_at=" + updated_at + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(updated_at, "updated_at")
            status = str
            score = i
            num_episodes_watched = i2
            is_rewatching = z
            this.updated_at = updated_at
        }

        fun is_rewatching(): Boolean {
            return is_rewatching
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                listStatus: ListStatus,
                str: String,
                i: Int,
                i2: Int,
                z: Boolean,
                str2: String,
                i3: Int,
                obj: Object?
            ): ListStatus {
                var str = str
                var i = i
                var i2 = i2
                var z = z
                var str2 = str2
                if (i3 and 1 != 0) {
                    str = listStatus.status
                }
                if (i3 and 2 != 0) {
                    i = listStatus.score
                }
                val i4 = i
                if (i3 and 4 != 0) {
                    i2 = listStatus.num_episodes_watched
                }
                val i5 = i2
                if (i3 and 8 != 0) {
                    z = listStatus.is_rewatching
                }
                val z2 = z
                if (i3 and 16 != 0) {
                    str2 = listStatus.updated_at
                }
                return listStatus.copy(str, i4, i5, z2, str2)
            }
        }
    }

    /* compiled from: MALApi.kt */
    @Metadata(
        m108d1 = ["\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Data;", "", "node", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Node;", "list_status", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$ListStatus;", "(Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Node;Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$ListStatus;)V", "getList_status", "()Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$ListStatus;", "getNode", "()Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Node;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Data(
        @JsonProperty("node") node: Node,
        @JsonProperty("list_status") listStatus: ListStatus
    ) {
        val list_status: ListStatus
        val node: Node
        operator fun component1(): Node {
            return node
        }

        operator fun component2(): ListStatus {
            return list_status
        }

        fun copy(
            @JsonProperty("node") node: Node,
            @JsonProperty("list_status") listStatus: ListStatus
        ): Data {
            Intrinsics.checkNotNullParameter(node, "node")
            return Data(node, listStatus)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Data) {
                val data = obj as Data
                return Intrinsics.areEqual(node, data.node) && Intrinsics.areEqual(
                    list_status, data.list_status
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val hashCode = node.hashCode() * 31
            val listStatus = list_status
            return hashCode + (listStatus?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "Data(node=" + node + ", list_status=" + list_status + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(node, "node")
            this.node = node
            list_status = listStatus
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                data: Data,
                node: Node,
                listStatus: ListStatus,
                i: Int,
                obj: Object?
            ): Data {
                var node = node
                var listStatus = listStatus
                if (i and 1 != 0) {
                    node = data.node
                }
                if (i and 2 != 0) {
                    listStatus = data.list_status
                }
                return data.copy(node, listStatus)
            }
        }
    }

    /* compiled from: MALApi.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Paging;", "", "next", "", "(Ljava/lang/String;)V", "getNext", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Paging(@param:JsonProperty("next") val next: String) {
        operator fun component1(): String {
            return next
        }

        fun copy(@JsonProperty("next") str: String): Paging {
            return Paging(str)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is Paging && Intrinsics.areEqual(
                next,
                (obj as Paging).next
            )
        }

        override fun hashCode(): Int {
            val str = next ?: return 0
            return str.hashCode()
        }

        override fun toString(): String {
            return "Paging(next=" + next + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                paging: Paging,
                str: String,
                i: Int,
                obj: Object?
            ): Paging {
                var str = str
                if (i and 1 != 0) {
                    str = paging.next
                }
                return paging.copy(str)
            }
        }
    }

    /* compiled from: MALApi.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000c¨\u0006\u0017"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$AlternativeTitles;", "", "synonyms", "", "", "en", "ja", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getEn", "()Ljava/lang/String;", "getJa", "getSynonyms", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class AlternativeTitles(
        @JsonProperty("synonyms") synonyms: List<String>,
        @JsonProperty("en") en: String,
        @JsonProperty("ja") ja: String
    ) {
        /* renamed from: en */
        val en: String

        /* renamed from: ja */
        val ja: String
        val synonyms: List<String>
        operator fun component1(): List<String> {
            return synonyms
        }

        operator fun component2(): String {
            return en
        }

        operator fun component3(): String {
            return ja
        }

        fun copy(
            @JsonProperty("synonyms") synonyms: List<String>,
            @JsonProperty("en") en: String,
            @JsonProperty("ja") ja: String
        ): AlternativeTitles {
            Intrinsics.checkNotNullParameter(synonyms, "synonyms")
            Intrinsics.checkNotNullParameter(en, "en")
            Intrinsics.checkNotNullParameter(ja, "ja")
            return AlternativeTitles(synonyms, en, ja)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is AlternativeTitles) {
                val alternativeTitles = obj as AlternativeTitles
                return Intrinsics.areEqual(
                    synonyms,
                    alternativeTitles.synonyms
                ) && Intrinsics.areEqual(
                    en, alternativeTitles.en
                ) && Intrinsics.areEqual(ja, alternativeTitles.ja)
            }
            return false
        }

        override fun hashCode(): Int {
            return (synonyms.hashCode() * 31 + en.hashCode()) * 31 + ja.hashCode()
        }

        override fun toString(): String {
            return "AlternativeTitles(synonyms=" + synonyms + ", en=" + en + ", ja=" + ja + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(synonyms, "synonyms")
            Intrinsics.checkNotNullParameter(en, "en")
            Intrinsics.checkNotNullParameter(ja, "ja")
            this.synonyms = synonyms
            this.en = en
            this.ja = ja
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                alternativeTitles: AlternativeTitles,
                list: List,
                str: String,
                str2: String,
                i: Int,
                obj: Object?
            ): AlternativeTitles {
                var list: List = list
                var str = str
                var str2 = str2
                if (i and 1 != 0) {
                    list = alternativeTitles.synonyms
                }
                if (i and 2 != 0) {
                    str = alternativeTitles.en
                }
                if (i and 4 != 0) {
                    str2 = alternativeTitles.ja
                }
                return alternativeTitles.copy(list, str, str2)
            }
        }
    }

    /* compiled from: MALApi.kt */
    @Metadata(
        m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000c\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Genres;", "", "id", "", "name", "", "(ILjava/lang/String;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Genres(@JsonProperty("id") i: Int, @JsonProperty("name") name: String) {
        /* renamed from: id */
        val id: Int
        val name: String
        operator fun component1(): Int {
            return id
        }

        operator fun component2(): String {
            return name
        }

        fun copy(@JsonProperty("id") i: Int, @JsonProperty("name") name: String): Genres {
            Intrinsics.checkNotNullParameter(name, "name")
            return Genres(i, name)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Genres) {
                val genres = obj as Genres
                return id == genres.id && Intrinsics.areEqual(name, genres.name)
            }
            return false
        }

        override fun hashCode(): Int {
            return id * 31 + name.hashCode()
        }

        override fun toString(): String {
            return "Genres(id=" + id + ", name=" + name + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(name, "name")
            id = i
            this.name = name
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                genres: Genres,
                i: Int,
                str: String,
                i2: Int,
                obj: Object?
            ): Genres {
                var i = i
                var str = str
                if (i2 and 1 != 0) {
                    i = genres.id
                }
                if (i2 and 2 != 0) {
                    str = genres.name
                }
                return genres.copy(i, str)
            }
        }
    }

    /* compiled from: MALApi.kt */
    @Metadata(
        m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000c\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$StartSeason;", "", "year", "", "season", "", "(ILjava/lang/String;)V", "getSeason", "()Ljava/lang/String;", "getYear", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class StartSeason(@JsonProperty("year") i: Int, @JsonProperty("season") season: String) {
        val season: String
        val year: Int
        operator fun component1(): Int {
            return year
        }

        operator fun component2(): String {
            return season
        }

        fun copy(
            @JsonProperty("year") i: Int,
            @JsonProperty("season") season: String
        ): StartSeason {
            Intrinsics.checkNotNullParameter(season, "season")
            return StartSeason(i, season)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is StartSeason) {
                val startSeason = obj as StartSeason
                return year == startSeason.year && Intrinsics.areEqual(season, startSeason.season)
            }
            return false
        }

        override fun hashCode(): Int {
            return year * 31 + season.hashCode()
        }

        override fun toString(): String {
            return "StartSeason(year=" + year + ", season=" + season + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(season, "season")
            year = i
            this.season = season
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                startSeason: StartSeason,
                i: Int,
                str: String,
                i2: Int,
                obj: Object?
            ): StartSeason {
                var i = i
                var str = str
                if (i2 and 1 != 0) {
                    i = startSeason.year
                }
                if (i2 and 2 != 0) {
                    str = startSeason.season
                }
                return startSeason.copy(i, str)
            }
        }
    }

    /* compiled from: MALApi.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000c\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Broadcast;", "", "day_of_the_week", "", TvContractCompat.PARAM_START_TIME, "(Ljava/lang/String;Ljava/lang/String;)V", "getDay_of_the_week", "()Ljava/lang/String;", "getStart_time", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Broadcast(
        @param:JsonProperty("day_of_the_week") val day_of_the_week: String, @param:JsonProperty(
            "start_time"
        ) val start_time: String
    ) {
        operator fun component1(): String {
            return day_of_the_week
        }

        operator fun component2(): String {
            return start_time
        }

        fun copy(
            @JsonProperty("day_of_the_week") str: String,
            @JsonProperty("start_time") str2: String
        ): Broadcast {
            return Broadcast(str, str2)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Broadcast) {
                val broadcast = obj as Broadcast
                return Intrinsics.areEqual(
                    day_of_the_week,
                    broadcast.day_of_the_week
                ) && Intrinsics.areEqual(
                    start_time, broadcast.start_time
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val str = day_of_the_week
            val hashCode = (str?.hashCode() ?: 0) * 31
            val str2 = start_time
            return hashCode + (str2?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "Broadcast(day_of_the_week=" + day_of_the_week + ", start_time=" + start_time + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                broadcast: Broadcast,
                str: String,
                str2: String,
                i: Int,
                obj: Object?
            ): Broadcast {
                var str = str
                var str2 = str2
                if (i and 1 != 0) {
                    str = broadcast.day_of_the_week
                }
                if (i and 2 != 0) {
                    str2 = broadcast.start_time
                }
                return broadcast.copy(str, str2)
            }
        }
    }/*
            r4 = this;
            com.lagradost.cloudstream3.AcraApplication$Companion r0 = com.lagradost.cloudstream3.AcraApplication.Companion
            java.lang.String r1 = "mal_cached_list"
            android.content.Context r0 = r0.getContext()
            r2 = 0
            if (r0 == 0) goto L2d
            com.lagradost.cloudstream3.utils.DataStore r3 = com.lagradost.cloudstream3.utils.DataStore.INSTANCE
            android.content.SharedPreferences r0 = r3.getSharedPrefs(r0)     // Catch: java.lang.Exception -> L2d
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Exception -> L2d
            if (r0 != 0) goto L18
            goto L2d
        L18:
            java.lang.String r1 = "getSharedPrefs().getStri…h, null) ?: return defVal"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Exception -> L2d
            com.fasterxml.jackson.databind.json.JsonMapper r1 = r3.getMapper()     // Catch: java.lang.Exception -> L2d
            java.lang.Class<com.lagradost.cloudstream3.syncproviders.providers.MALApi$Data[]> r3 = com.lagradost.cloudstream3.syncproviders.providers.MALApi.Data[].class
            java.lang.Object r0 = r1.readValue(r0, r3)     // Catch: java.lang.Exception -> L2d
            java.lang.String r1 = "mapper.readValue(this, T::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Exception -> L2d
            goto L2e
        L2d:
            r0 = r2
        L2e:
            boolean r1 = r0 instanceof com.lagradost.cloudstream3.syncproviders.providers.MALApi.Data[]
            if (r1 == 0) goto L35
            r2 = r0
            com.lagradost.cloudstream3.syncproviders.providers.MALApi$Data[] r2 = (com.lagradost.cloudstream3.syncproviders.providers.MALApi.Data[]) r2
        L35:
            return r2
        */

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */ /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private val malAnimeListCached: Array<Data>
        private get() {
            /*
            r4 = this;
            com.lagradost.cloudstream3.AcraApplication$Companion r0 = com.lagradost.cloudstream3.AcraApplication.Companion
            java.lang.String r1 = "mal_cached_list"
            android.content.Context r0 = r0.getContext()
            r2 = 0
            if (r0 == 0) goto L2d
            com.lagradost.cloudstream3.utils.DataStore r3 = com.lagradost.cloudstream3.utils.DataStore.INSTANCE
            android.content.SharedPreferences r0 = r3.getSharedPrefs(r0)     // Catch: java.lang.Exception -> L2d
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Exception -> L2d
            if (r0 != 0) goto L18
            goto L2d
        L18:
            java.lang.String r1 = "getSharedPrefs().getStri…h, null) ?: return defVal"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Exception -> L2d
            com.fasterxml.jackson.databind.json.JsonMapper r1 = r3.getMapper()     // Catch: java.lang.Exception -> L2d
            java.lang.Class<com.lagradost.cloudstream3.syncproviders.providers.MALApi$Data[]> r3 = com.lagradost.cloudstream3.syncproviders.providers.MALApi.Data[].class
            java.lang.Object r0 = r1.readValue(r0, r3)     // Catch: java.lang.Exception -> L2d
            java.lang.String r1 = "mapper.readValue(this, T::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Exception -> L2d
            goto L2e
        L2d:
            r0 = r2
        L2e:
            boolean r1 = r0 instanceof com.lagradost.cloudstream3.syncproviders.providers.MALApi.Data[]
            if (r1 == 0) goto L35
            r2 = r0
            com.lagradost.cloudstream3.syncproviders.providers.MALApi$Data[] r2 = (com.lagradost.cloudstream3.syncproviders.providers.MALApi.Data[]) r2
        L35:
            return r2
        */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.MALApi.getMalAnimeListCached():com.lagradost.cloudstream3.syncproviders.providers.MALApi\$Data[]")
        }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun getMalAnimeListSmart(r8: Continuation<in Array<Data?>?>?): Any {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.lagradost.cloudstream3.syncproviders.providers.MALApi$getMalAnimeListSmart$1
            if (r0 == 0) goto L14
            r0 = r8
            com.lagradost.cloudstream3.syncproviders.providers.MALApi$getMalAnimeListSmart$1 r0 = (com.lagradost.cloudstream3.syncproviders.providers.MALApi$getMalAnimeListSmart$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            com.lagradost.cloudstream3.syncproviders.providers.MALApi$getMalAnimeListSmart$1 r0 = new com.lagradost.cloudstream3.syncproviders.providers.MALApi$getMalAnimeListSmart$1
            r0.<init>(r7, r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            java.lang.String r3 = "mal_should_update_list"
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            kotlin.ResultKt.throwOnFailure(r8)
            goto L83
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.String r8 = r7.getAuth()
            r2 = 0
            if (r8 != 0) goto L3f
            return r2
        L3f:
            com.lagradost.cloudstream3.AcraApplication$Companion r8 = com.lagradost.cloudstream3.AcraApplication.Companion
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.boxing.boxBoolean(r4)
            android.content.Context r8 = r8.getContext()
            if (r8 == 0) goto L70
            com.lagradost.cloudstream3.utils.DataStore r6 = com.lagradost.cloudstream3.utils.DataStore.INSTANCE
            android.content.SharedPreferences r8 = r6.getSharedPrefs(r8)     // Catch: java.lang.Exception -> L6f
            java.lang.String r8 = r8.getString(r3, r2)     // Catch: java.lang.Exception -> L6f
            if (r8 != 0) goto L59
            r2 = r5
            goto L70
        L59:
            java.lang.String r5 = "getSharedPrefs().getStri…h, null) ?: return defVal"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r5)     // Catch: java.lang.Exception -> L6f
            com.fasterxml.jackson.databind.json.JsonMapper r5 = r6.getMapper()     // Catch: java.lang.Exception -> L6f
            java.lang.Class<java.lang.Boolean> r6 = java.lang.Boolean.class
            java.lang.Object r8 = r5.readValue(r8, r6)     // Catch: java.lang.Exception -> L6f
            java.lang.String r5 = "mapper.readValue(this, T::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r5)     // Catch: java.lang.Exception -> L6f
            r2 = r8
            goto L70
        L6f:
        L70:
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.boxing.boxBoolean(r4)
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r8)
            if (r8 == 0) goto L97
            r0.label = r4
            java.lang.Object r8 = r7.getMalAnimeList(r0)
            if (r8 != r1) goto L83
            return r1
        L83:
            com.lagradost.cloudstream3.syncproviders.providers.MALApi$Data[] r8 = (com.lagradost.cloudstream3.syncproviders.providers.MALApi.Data[]) r8
            com.lagradost.cloudstream3.AcraApplication$Companion r0 = com.lagradost.cloudstream3.AcraApplication.Companion
            java.lang.String r1 = "mal_cached_list"
            r0.setKey(r1, r8)
            com.lagradost.cloudstream3.AcraApplication$Companion r0 = com.lagradost.cloudstream3.AcraApplication.Companion
            r1 = 0
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.boxing.boxBoolean(r1)
            r0.setKey(r3, r1)
            goto L9b
        L97:
            com.lagradost.cloudstream3.syncproviders.providers.MALApi$Data[] r8 = r7.getMalAnimeListCached()
        L9b:
            return r8
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.MALApi.getMalAnimeListSmart(kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */ /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */ /* JADX WARN: Removed duplicated region for block: B:23:0x0079 A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */ /* JADX WARN: Type inference failed for: r6v6, types: [java.util.List] */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0077 -> B:24:0x007a). Please submit an issue!!! */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun getMalAnimeList(r10: Continuation<in Array<Data?>?>?): Any {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.lagradost.cloudstream3.syncproviders.providers.MALApi$getMalAnimeList$1
            if (r0 == 0) goto L14
            r0 = r10
            com.lagradost.cloudstream3.syncproviders.providers.MALApi$getMalAnimeList$1 r0 = (com.lagradost.cloudstream3.syncproviders.providers.MALApi$getMalAnimeList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.label
            int r10 = r10 - r2
            r0.label = r10
            goto L19
        L14:
            com.lagradost.cloudstream3.syncproviders.providers.MALApi$getMalAnimeList$1 r0 = new com.lagradost.cloudstream3.syncproviders.providers.MALApi$getMalAnimeList$1
            r0.<init>(r9, r10)
        L19:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4a
            if (r2 == r5) goto L42
            if (r2 != r4) goto L3a
            java.lang.Object r2 = r0.L$2
            kotlin.text.Regex r2 = (kotlin.text.Regex) r2
            java.lang.Object r6 = r0.L$1
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r0.L$0
            com.lagradost.cloudstream3.syncproviders.providers.MALApi r7 = (com.lagradost.cloudstream3.syncproviders.providers.MALApi) r7
            kotlin.ResultKt.throwOnFailure(r10)
            goto L7a
        L3a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L42:
            java.lang.Object r2 = r0.L$0
            com.lagradost.cloudstream3.syncproviders.providers.MALApi r2 = (com.lagradost.cloudstream3.syncproviders.providers.MALApi) r2
            kotlin.ResultKt.throwOnFailure(r10)
            goto L59
        L4a:
            kotlin.ResultKt.throwOnFailure(r10)
            r0.L$0 = r9
            r0.label = r5
            java.lang.Object r10 = r9.checkMalToken(r0)
            if (r10 != r1) goto L58
            return r1
        L58:
            r2 = r9
        L59:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.List r10 = (java.util.List) r10
            kotlin.text.Regex r6 = new kotlin.text.Regex
            java.lang.String r7 = "offset=(\\d+)"
            r6.<init>(r7)
            r7 = r2
            r2 = r6
            r6 = r10
            r10 = 0
        L6b:
            r0.L$0 = r7
            r0.L$1 = r6
            r0.L$2 = r2
            r0.label = r4
            java.lang.Object r10 = r7.getMalAnimeListSlice(r10, r0)
            if (r10 != r1) goto L7a
            return r1
        L7a:
            com.lagradost.cloudstream3.syncproviders.providers.MALApi$MalList r10 = (com.lagradost.cloudstream3.syncproviders.providers.MALApi.MalList) r10
            if (r10 != 0) goto L7f
            goto Lb8
        L7f:
            java.util.List r8 = r10.getData()
            java.util.Collection r8 = (java.util.Collection) r8
            r6.addAll(r8)
            com.lagradost.cloudstream3.syncproviders.providers.MALApi$Paging r10 = r10.getPaging()
            java.lang.String r10 = r10.getNext()
            if (r10 == 0) goto Lb8
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            r8 = 0
            kotlin.text.MatchResult r10 = kotlin.text.Regex.find$default(r2, r10, r3, r4, r8)
            if (r10 == 0) goto Lb1
            java.util.List r10 = r10.getGroupValues()
            if (r10 == 0) goto Lb1
            java.lang.Object r10 = r10.get(r5)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto Lb1
            int r10 = java.lang.Integer.parseInt(r10)
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.boxing.boxInt(r10)
        Lb1:
            if (r8 == 0) goto Lb8
            int r10 = r8.intValue()
            goto L6b
        Lb8:
            java.util.Collection r6 = (java.util.Collection) r6
            com.lagradost.cloudstream3.syncproviders.providers.MALApi$Data[] r10 = new com.lagradost.cloudstream3.syncproviders.providers.MALApi.Data[r3]
            java.lang.Object[] r10 = r6.toArray(r10)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            java.util.Objects.requireNonNull(r10, r0)
            return r10
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.MALApi.getMalAnimeList(kotlin.coroutines.Continuation):java.lang.Object")
    }

    fun convertToStatus(string: String?): MalStatusType {
        Intrinsics.checkNotNullParameter(string, "string")
        return fromIntToAnimeStatus(ArraysKt.indexOf(MALApi.Companion.malStatusAsString, string))
    }

    /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun getMalAnimeListSlice(r20: Int, r21: Continuation<in MalList?>?): Any {
        /*
            r19 = this;
            r0 = r21
            boolean r1 = r0 instanceof com.lagradost.cloudstream3.syncproviders.providers.MALApi$getMalAnimeListSlice$1
            if (r1 == 0) goto L18
            r1 = r0
            com.lagradost.cloudstream3.syncproviders.providers.MALApi$getMalAnimeListSlice$1 r1 = (com.lagradost.cloudstream3.syncproviders.providers.MALApi$getMalAnimeListSlice$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L18
            int r0 = r1.label
            int r0 = r0 - r3
            r1.label = r0
            r2 = r19
            goto L1f
        L18:
            com.lagradost.cloudstream3.syncproviders.providers.MALApi$getMalAnimeListSlice$1 r1 = new com.lagradost.cloudstream3.syncproviders.providers.MALApi$getMalAnimeListSlice$1
            r2 = r19
            r1.<init>(r2, r0)
        L1f:
            java.lang.Object r0 = r1.result
            java.lang.Object r15 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.label
            r4 = 1
            if (r3 == 0) goto L39
            if (r3 != r4) goto L31
            kotlin.ResultKt.throwOnFailure(r0)
            goto La2
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            kotlin.ResultKt.throwOnFailure(r0)
            java.lang.String r0 = r19.getAuth()
            if (r0 != 0) goto L44
            r0 = 0
            return r0
        L44:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "https://api.myanimelist.net/v2/users/"
            r3.append(r5)
            java.lang.String r5 = "@me"
            r3.append(r5)
            java.lang.String r5 = "/animelist?fields=list_status,num_episodes,media_type,status,start_date,end_date,synopsis,alternative_titles,mean,genres,rank,num_list_users,nsfw,average_episode_duration,num_favorites,popularity,num_scoring_users,start_season,favorites_info,broadcast,created_at,updated_at&nsfw=1&limit=100&offset="
            r3.append(r5)
            r5 = r20
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            com.lagradost.cloudstream3.utils.Extensions$RequestCustom r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            com.lagradost.nicehttp.Requests r3 = (com.lagradost.nicehttp.Requests) r3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Bearer "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.String r6 = "Authorization"
            kotlin.Pair r0 = kotlin.TuplesKt.m100to(r6, r0)
            java.util.Map r0 = kotlin.collections.MapsKt.mapOf(r0)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            r17 = 1980(0x7bc, float:2.775E-42)
            r18 = 0
            r1.label = r4
            r4 = r5
            r5 = r0
            r0 = r15
            r15 = r16
            r16 = r1
            java.lang.Object r1 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18)
            if (r1 != r0) goto La1
            return r0
        La1:
            r0 = r1
        La2:
            com.lagradost.nicehttp.NiceResponse r0 = (com.lagradost.nicehttp.NiceResponse) r0
            java.lang.String r0 = r0.getText()
            com.lagradost.cloudstream3.utils.DataStore r1 = com.lagradost.cloudstream3.utils.DataStore.INSTANCE
            com.fasterxml.jackson.databind.json.JsonMapper r1 = r1.getMapper()
            java.lang.Class<com.lagradost.cloudstream3.syncproviders.providers.MALApi$MalList> r3 = com.lagradost.cloudstream3.syncproviders.providers.MALApi.MalList.class
            java.lang.Object r0 = r1.readValue(r0, r3)
            java.lang.String r1 = "mapper.readValue(this, T::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.MALApi.getMalAnimeListSlice(int, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun getDataAboutMalId(r20: Int, r21: Continuation<in SmallMalAnime?>?): Any {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            boolean r2 = r1 instanceof com.lagradost.cloudstream3.syncproviders.providers.MALApi$getDataAboutMalId$1
            if (r2 == 0) goto L18
            r2 = r1
            com.lagradost.cloudstream3.syncproviders.providers.MALApi$getDataAboutMalId$1 r2 = (com.lagradost.cloudstream3.syncproviders.providers.MALApi$getDataAboutMalId$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r1 = r2.label
            int r1 = r1 - r4
            r2.label = r1
            goto L1d
        L18:
            com.lagradost.cloudstream3.syncproviders.providers.MALApi$getDataAboutMalId$1 r2 = new com.lagradost.cloudstream3.syncproviders.providers.MALApi$getDataAboutMalId$1
            r2.<init>(r0, r1)
        L1d:
            java.lang.Object r1 = r2.result
            java.lang.Object r15 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r2.label
            r4 = 1
            if (r3 == 0) goto L3a
            if (r3 != r4) goto L32
            java.lang.Object r2 = r2.L$0
            com.lagradost.cloudstream3.syncproviders.providers.MALApi r2 = (com.lagradost.cloudstream3.syncproviders.providers.MALApi) r2
            kotlin.ResultKt.throwOnFailure(r1)
            goto La0
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            kotlin.ResultKt.throwOnFailure(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "https://api.myanimelist.net/v2/anime/"
            r1.append(r3)
            r3 = r20
            r1.append(r3)
            java.lang.String r3 = "?fields=id,title,num_episodes,my_list_status"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.lagradost.cloudstream3.utils.Extensions$RequestCustom r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            com.lagradost.nicehttp.Requests r3 = (com.lagradost.nicehttp.Requests) r3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Bearer "
            r5.append(r6)
            java.lang.String r6 = r19.getAuth()
            if (r6 != 0) goto L6d
            r1 = 0
            return r1
        L6d:
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "Authorization"
            kotlin.Pair r5 = kotlin.TuplesKt.m100to(r6, r5)
            java.util.Map r5 = kotlin.collections.MapsKt.mapOf(r5)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            r17 = 1980(0x7bc, float:2.775E-42)
            r18 = 0
            r2.L$0 = r0
            r2.label = r4
            r4 = r1
            r1 = r15
            r15 = r16
            r16 = r2
            java.lang.Object r2 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18)
            if (r2 != r1) goto L9e
            return r1
        L9e:
            r1 = r2
            r2 = r0
        La0:
            com.lagradost.nicehttp.NiceResponse r1 = (com.lagradost.nicehttp.NiceResponse) r1
            java.lang.String r1 = r1.getText()
            com.fasterxml.jackson.databind.json.JsonMapper r2 = r2.mapper
            com.fasterxml.jackson.databind.ObjectMapper r2 = (com.fasterxml.jackson.databind.ObjectMapper) r2
            com.lagradost.cloudstream3.syncproviders.providers.MALApi$getDataAboutMalId$$inlined$readValue$1 r3 = new com.lagradost.cloudstream3.syncproviders.providers.MALApi$getDataAboutMalId$$inlined$readValue$1
            r3.<init>()
            com.fasterxml.jackson.core.type.TypeReference r3 = (com.fasterxml.jackson.core.type.TypeReference) r3
            java.lang.Object r1 = r2.readValue(r1, r3)
            return r1
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.MALApi.getDataAboutMalId(int, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */ /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */ /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */ /* JADX WARN: Removed duplicated region for block: B:31:0x0116 A[LOOP:0: B:29:0x0110->B:31:0x0116, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:35:0x0145 A[LOOP:1: B:33:0x013f->B:35:0x0145, LOOP_END] */ /* JADX WARN: Removed duplicated region for block: B:38:0x0163  */ /* JADX WARN: Removed duplicated region for block: B:39:0x0165  */ /* JADX WARN: Removed duplicated region for block: B:41:0x0169  */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00df -> B:28:0x00e2). Please submit an issue!!! */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun setAllMalData(r28: Continuation<in Unit>?): Any {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.MALApi.setAllMalData(kotlin.coroutines.Continuation):java.lang.Object")
    }

    fun convertJapanTimeToTimeRemaining(date: String, str: String?): String? {
        Intrinsics.checkNotNullParameter(date, "date")
        if (str != null) {
            try {
                if (SimpleDateFormat(TmdbHelper.TMDB_DATE_PATTERN).parse(str)
                        .getTime() < System.currentTimeMillis()
                ) {
                    return null
                }
            } catch (e: ParseException) {
                ArchComponentExt.logError(e)
            }
        }
        if (StringsKt.`contains$default`(
                date as CharSequence,
                "null" as CharSequence,
                false,
                2,
                null as Object?
            ) || StringsKt.`contains$default`(
                date as CharSequence,
                "other" as CharSequence,
                false,
                2,
                null as Object?
            )
        ) {
            return null
        }
        val calendar: Calendar = Calendar.getInstance()
        val i: Int = calendar.get(4)
        val i2: Int = calendar.get(1)
        val simpleDateFormat = SimpleDateFormat("yyyy MM W EEEE HH:mm")
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Japan"))
        val parse: Date =
            simpleDateFormat.parse(i2 + ' '.code + (calendar.get(2) + 1) + ' ' + i + ' ' + date)
                ?: return null
        var time: Long = (parse.getTime() - System.currentTimeMillis()) / 1000
        if (time > -604800 && time < 0) {
            time += 604800
        }
        return AccountManager.Companion.Companion.secondsToReadable(time.toInt(), "Now")
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun checkMalToken(continuation: Continuation<in Unit>?): Object {
        val unixTime: Long = AccountManager.Companion.Companion.getUnixTime()
        val companion: AcraApplication.Companion = AcraApplication.Companion
        val accountId: String = getAccountId()
        val context: Context = companion.getContext()
        var obj: Object? = null
        if (context != null) {
            val dataStore: DataStore = DataStore.INSTANCE
            try {
                val string: String = dataStore.getSharedPrefs(context).getString(
                    dataStore.getFolderName(
                        accountId,
                        MALApi.Companion.MAL_UNIXTIME_KEY
                    ), null
                )
                if (string != null) {
                    Intrinsics.checkNotNullExpressionValue(
                        string,
                        "getSharedPrefs().getStri…h, null) ?: return defVal"
                    )
                    val readValue: Object = dataStore.mapper.readValue(string, Long::class.java)
                    Intrinsics.checkNotNullExpressionValue(
                        readValue,
                        "mapper.readValue(this, T::class.java)"
                    )
                    obj = readValue
                }
            } catch (unused: Exception) {
            }
        }
        val l = obj as Long?
        if (unixTime > (if (l != null) l.longValue() else 0L)) {
            val refreshToken: Object = refreshToken(continuation)
            return if (refreshToken === IntrinsicsKt.getCOROUTINE_SUSPENDED()) refreshToken else Unit.INSTANCE
        }
        return Unit.INSTANCE
    }

    /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */ /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */ /* JADX WARN: Removed duplicated region for block: B:22:0x0075 A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */ /* JADX WARN: Removed duplicated region for block: B:30:0x00d4  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun getMalUser(r23: Boolean, r24: Continuation<in MalUser?>?): Any {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.MALApi.getMalUser(boolean, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* compiled from: MALApi.kt */
    @Metadata(
        m108d1 = ["\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000c\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\u000cj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MalStatusType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "setValue", "(I)V", "Watching", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_COMPLETED, "OnHold", "Dropped", "PlanToWatch", "None", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    /* loaded from: classes3.dex */
    enum class MalStatusType(var value: Int) {
        Watching(0), Completed(1), OnHold(2), Dropped(3), PlanToWatch(4), None(-1);

    }

    private fun fromIntToAnimeStatus(i: Int): MalStatusType {
        return when (i) {
            -1 -> MalStatusType.None
            0 -> MalStatusType.Watching
            1 -> MalStatusType.Completed
            2 -> MalStatusType.OnHold
            3 -> MalStatusType.Dropped
            4 -> MalStatusType.PlanToWatch
            5 -> MalStatusType.Watching
            else -> MalStatusType.None
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */ /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun setScoreRequest(
        r10: Int,
        r11: MalStatusType?,
        r12: Int?,
        r13: Int?,
        r14: Continuation<in Boolean?>?
    ): Any {
        /*
            r9 = this;
            boolean r0 = r14 instanceof com.lagradost.cloudstream3.syncproviders.providers.MALApi$setScoreRequest$1
            if (r0 == 0) goto L14
            r0 = r14
            com.lagradost.cloudstream3.syncproviders.providers.MALApi$setScoreRequest$1 r0 = (com.lagradost.cloudstream3.syncproviders.providers.MALApi$setScoreRequest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r14 = r0.label
            int r14 = r14 - r2
            r0.label = r14
            goto L19
        L14:
            com.lagradost.cloudstream3.syncproviders.providers.MALApi$setScoreRequest$1 r0 = new com.lagradost.cloudstream3.syncproviders.providers.MALApi$setScoreRequest$1
            r0.<init>(r9, r14)
        L19:
            r6 = r0
            java.lang.Object r14 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r7 = 0
            r8 = 1
            if (r1 == 0) goto L3a
            if (r1 != r8) goto L32
            int r10 = r6.I$0
            java.lang.Object r11 = r6.L$0
            com.lagradost.cloudstream3.syncproviders.providers.MALApi r11 = (com.lagradost.cloudstream3.syncproviders.providers.MALApi) r11
            kotlin.ResultKt.throwOnFailure(r14)
            goto L60
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            kotlin.ResultKt.throwOnFailure(r14)
            if (r11 != 0) goto L41
            r11 = 0
            goto L4d
        L41:
            java.lang.String[] r14 = com.lagradost.cloudstream3.syncproviders.providers.MALApi.malStatusAsString
            int r11 = r11.getValue()
            int r11 = java.lang.Math.max(r7, r11)
            r11 = r14[r11]
        L4d:
            r3 = r11
            r6.L$0 = r9
            r6.I$0 = r10
            r6.label = r8
            r1 = r9
            r2 = r10
            r4 = r12
            r5 = r13
            java.lang.Object r14 = r1.setScoreRequest(r2, r3, r4, r5, r6)
            if (r14 != r0) goto L5f
            return r0
        L5f:
            r11 = r9
        L60:
            java.lang.String r14 = (java.lang.String) r14
            r12 = r14
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            if (r12 == 0) goto L70
            boolean r12 = kotlin.text.StringsKt.isBlank(r12)
            if (r12 == 0) goto L6e
            goto L70
        L6e:
            r12 = 0
            goto L71
        L70:
            r12 = 1
        L71:
            if (r12 == 0) goto L74
            goto Lc8
        L74:
            com.fasterxml.jackson.databind.json.JsonMapper r12 = r11.mapper
            com.fasterxml.jackson.databind.ObjectMapper r12 = (com.fasterxml.jackson.databind.ObjectMapper) r12
            com.lagradost.cloudstream3.syncproviders.providers.MALApi$setScoreRequest$$inlined$readValue$1 r13 = new com.lagradost.cloudstream3.syncproviders.providers.MALApi$setScoreRequest$$inlined$readValue$1
            r13.<init>()
            com.fasterxml.jackson.core.type.TypeReference r13 = (com.fasterxml.jackson.core.type.TypeReference) r13
            java.lang.Object r12 = r12.readValue(r14, r13)
            com.lagradost.cloudstream3.syncproviders.providers.MALApi$MalStatus r12 = (com.lagradost.cloudstream3.syncproviders.providers.MALApi.MalStatus) r12
            java.util.HashMap<java.lang.Integer, com.lagradost.cloudstream3.syncproviders.providers.MALApi$MalTitleHolder> r13 = r11.allTitles
            java.lang.Integer r14 = kotlin.coroutines.jvm.internal.boxing.boxInt(r10)
            boolean r13 = r13.containsKey(r14)
            if (r13 == 0) goto Lb5
            java.util.HashMap<java.lang.Integer, com.lagradost.cloudstream3.syncproviders.providers.MALApi$MalTitleHolder> r13 = r11.allTitles
            java.lang.Integer r14 = kotlin.coroutines.jvm.internal.boxing.boxInt(r10)
            java.lang.Object r13 = r13.get(r14)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r13)
            com.lagradost.cloudstream3.syncproviders.providers.MALApi$MalTitleHolder r13 = (com.lagradost.cloudstream3.syncproviders.providers.MALApi.MalTitleHolder) r13
            java.lang.Integer r14 = kotlin.coroutines.jvm.internal.boxing.boxInt(r10)
            java.util.HashMap<java.lang.Integer, com.lagradost.cloudstream3.syncproviders.providers.MALApi$MalTitleHolder> r11 = r11.allTitles
            java.util.Map r11 = (java.util.Map) r11
            com.lagradost.cloudstream3.syncproviders.providers.MALApi$MalTitleHolder r0 = new com.lagradost.cloudstream3.syncproviders.providers.MALApi$MalTitleHolder
            java.lang.String r13 = r13.getName()
            r0.<init>(r12, r10, r13)
            r11.put(r14, r0)
            goto Lc7
        Lb5:
            java.lang.Integer r13 = kotlin.coroutines.jvm.internal.boxing.boxInt(r10)
            java.util.HashMap<java.lang.Integer, com.lagradost.cloudstream3.syncproviders.providers.MALApi$MalTitleHolder> r11 = r11.allTitles
            java.util.Map r11 = (java.util.Map) r11
            com.lagradost.cloudstream3.syncproviders.providers.MALApi$MalTitleHolder r14 = new com.lagradost.cloudstream3.syncproviders.providers.MALApi$MalTitleHolder
            java.lang.String r0 = ""
            r14.<init>(r12, r10, r0)
            r11.put(r13, r14)
        Lc7:
            r7 = 1
        Lc8:
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.boxing.boxBoolean(r7)
            return r10
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.MALApi.setScoreRequest(int, com.lagradost.cloudstream3.syncproviders.providers.MALApi\$MalStatusType, java.lang.Integer, java.lang.Integer, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun setScoreRequest(
        r25: Int,
        r26: String?,
        r27: Int?,
        r28: Int?,
        r29: Continuation<in String?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.MALApi.setScoreRequest(int, java.lang.String, java.lang.Integer, java.lang.Integer, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* compiled from: MALApi.kt */
    @Metadata(
        m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000cR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$ResponseToken;", "", "token_type", "", AccessToken.EXPIRES_IN_KEY, "", "access_token", "refresh_token", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAccess_token", "()Ljava/lang/String;", "getExpires_in", "()I", "getRefresh_token", "getToken_type", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class ResponseToken(
        @JsonProperty("token_type") token_type: String,
        @JsonProperty("expires_in") i: Int,
        @JsonProperty("access_token") access_token: String,
        @JsonProperty("refresh_token") refresh_token: String
    ) {
        val access_token: String
        val expires_in: Int
        val refresh_token: String
        val token_type: String
        operator fun component1(): String {
            return token_type
        }

        operator fun component2(): Int {
            return expires_in
        }

        operator fun component3(): String {
            return access_token
        }

        operator fun component4(): String {
            return refresh_token
        }

        fun copy(
            @JsonProperty("token_type") token_type: String,
            @JsonProperty("expires_in") i: Int,
            @JsonProperty("access_token") access_token: String,
            @JsonProperty("refresh_token") refresh_token: String
        ): ResponseToken {
            Intrinsics.checkNotNullParameter(token_type, "token_type")
            Intrinsics.checkNotNullParameter(access_token, "access_token")
            Intrinsics.checkNotNullParameter(refresh_token, "refresh_token")
            return ResponseToken(token_type, i, access_token, refresh_token)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is ResponseToken) {
                val responseToken = obj as ResponseToken
                return Intrinsics.areEqual(
                    token_type,
                    responseToken.token_type
                ) && expires_in == responseToken.expires_in && Intrinsics.areEqual(
                    access_token, responseToken.access_token
                ) && Intrinsics.areEqual(
                    refresh_token, responseToken.refresh_token
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return ((token_type.hashCode() * 31 + expires_in) * 31 + access_token.hashCode()) * 31 + refresh_token.hashCode()
        }

        override fun toString(): String {
            return "ResponseToken(token_type=" + token_type + ", expires_in=" + expires_in + ", access_token=" + access_token + ", refresh_token=" + refresh_token + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(token_type, "token_type")
            Intrinsics.checkNotNullParameter(access_token, "access_token")
            Intrinsics.checkNotNullParameter(refresh_token, "refresh_token")
            this.token_type = token_type
            expires_in = i
            this.access_token = access_token
            this.refresh_token = refresh_token
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                responseToken: ResponseToken,
                str: String,
                i: Int,
                str2: String,
                str3: String,
                i2: Int,
                obj: Object?
            ): ResponseToken {
                var str = str
                var i = i
                var str2 = str2
                var str3 = str3
                if (i2 and 1 != 0) {
                    str = responseToken.token_type
                }
                if (i2 and 2 != 0) {
                    i = responseToken.expires_in
                }
                if (i2 and 4 != 0) {
                    str2 = responseToken.access_token
                }
                if (i2 and 8 != 0) {
                    str3 = responseToken.refresh_token
                }
                return responseToken.copy(str, i, str2, str3)
            }
        }
    }

    /* compiled from: MALApi.kt */
    @Metadata(
        m108d1 = ["\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\u000c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MalRoot;", "", "data", "", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MalDatum;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class MalRoot(@JsonProperty("data") data: List<MalDatum>) {
        val data: List<MalDatum>
        operator fun component1(): List<MalDatum> {
            return data
        }

        fun copy(@JsonProperty("data") data: List<MalDatum>): MalRoot {
            Intrinsics.checkNotNullParameter(data, "data")
            return MalRoot(data)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is MalRoot && Intrinsics.areEqual(
                data,
                (obj as MalRoot).data
            )
        }

        override fun hashCode(): Int {
            return data.hashCode()
        }

        override fun toString(): String {
            return "MalRoot(data=" + data + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(data, "data")
            this.data = data
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                malRoot: MalRoot,
                list: List,
                i: Int,
                obj: Object?
            ): MalRoot {
                var list: List = list
                if (i and 1 != 0) {
                    list = malRoot.data
                }
                return malRoot.copy(list)
            }
        }
    }

    /* compiled from: MALApi.kt */
    @Metadata(
        m108d1 = ["\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000c\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MalDatum;", "", "node", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MalNode;", "list_status", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MalStatus;", "(Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MalNode;Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MalStatus;)V", "getList_status", "()Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MalStatus;", "getNode", "()Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MalNode;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class MalDatum(
        @JsonProperty("node") node: MalNode,
        @JsonProperty("list_status") list_status: MalStatus
    ) {
        val list_status: MalStatus
        val node: MalNode
        operator fun component1(): MalNode {
            return node
        }

        operator fun component2(): MalStatus {
            return list_status
        }

        fun copy(
            @JsonProperty("node") node: MalNode,
            @JsonProperty("list_status") list_status: MalStatus
        ): MalDatum {
            Intrinsics.checkNotNullParameter(node, "node")
            Intrinsics.checkNotNullParameter(list_status, "list_status")
            return MalDatum(node, list_status)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is MalDatum) {
                val malDatum = obj as MalDatum
                return Intrinsics.areEqual(node, malDatum.node) && Intrinsics.areEqual(
                    list_status, malDatum.list_status
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return node.hashCode() * 31 + list_status.hashCode()
        }

        override fun toString(): String {
            return "MalDatum(node=" + node + ", list_status=" + list_status + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(node, "node")
            Intrinsics.checkNotNullParameter(list_status, "list_status")
            this.node = node
            this.list_status = list_status
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                malDatum: MalDatum,
                malNode: MalNode,
                malStatus: MalStatus,
                i: Int,
                obj: Object?
            ): MalDatum {
                var malNode = malNode
                var malStatus = malStatus
                if (i and 1 != 0) {
                    malNode = malDatum.node
                }
                if (i and 2 != 0) {
                    malStatus = malDatum.list_status
                }
                return malDatum.copy(malNode, malStatus)
            }
        }
    }

    /* compiled from: MALApi.kt */
    @Metadata(
        m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000c\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MalNode;", "", "id", "", "title", "", "(ILjava/lang/String;)V", "getId", "()I", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class MalNode(@JsonProperty("id") i: Int, @JsonProperty("title") title: String) {
        /* renamed from: id */
        val id: Int
        val title: String
        operator fun component1(): Int {
            return id
        }

        operator fun component2(): String {
            return title
        }

        fun copy(@JsonProperty("id") i: Int, @JsonProperty("title") title: String): MalNode {
            Intrinsics.checkNotNullParameter(title, "title")
            return MalNode(i, title)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is MalNode) {
                val malNode = obj as MalNode
                return id == malNode.id && Intrinsics.areEqual(title, malNode.title)
            }
            return false
        }

        override fun hashCode(): Int {
            return id * 31 + title.hashCode()
        }

        override fun toString(): String {
            return "MalNode(id=" + id + ", title=" + title + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(title, "title")
            id = i
            this.title = title
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                malNode: MalNode,
                i: Int,
                str: String,
                i2: Int,
                obj: Object?
            ): MalNode {
                var i = i
                var str = str
                if (i2 and 1 != 0) {
                    i = malNode.id
                }
                if (i2 and 2 != 0) {
                    str = malNode.title
                }
                return malNode.copy(i, str)
            }
        }
    }

    /* compiled from: MALApi.kt */
    @Metadata(
        m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001c"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MalStatus;", "", "status", "", "score", "", "num_episodes_watched", "is_rewatching", "", "updated_at", "(Ljava/lang/String;IIZLjava/lang/String;)V", "()Z", "getNum_episodes_watched", "()I", "getScore", "getStatus", "()Ljava/lang/String;", "getUpdated_at", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class MalStatus(
        @JsonProperty("status") status: String,
        @JsonProperty("score") i: Int,
        @JsonProperty("num_episodes_watched") i2: Int,
        @JsonProperty("is_rewatching") z: Boolean,
        @JsonProperty("updated_at") updated_at: String
    ) {
        private val is_rewatching: Boolean
        val num_episodes_watched: Int
        val score: Int
        val status: String
        val updated_at: String
        operator fun component1(): String {
            return status
        }

        operator fun component2(): Int {
            return score
        }

        operator fun component3(): Int {
            return num_episodes_watched
        }

        operator fun component4(): Boolean {
            return is_rewatching
        }

        operator fun component5(): String {
            return updated_at
        }

        fun copy(
            @JsonProperty("status") status: String,
            @JsonProperty("score") i: Int,
            @JsonProperty("num_episodes_watched") i2: Int,
            @JsonProperty("is_rewatching") z: Boolean,
            @JsonProperty("updated_at") updated_at: String
        ): MalStatus {
            Intrinsics.checkNotNullParameter(status, "status")
            Intrinsics.checkNotNullParameter(updated_at, "updated_at")
            return MalStatus(status, i, i2, z, updated_at)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is MalStatus) {
                val malStatus = obj as MalStatus
                return Intrinsics.areEqual(
                    status,
                    malStatus.status
                ) && score == malStatus.score && num_episodes_watched == malStatus.num_episodes_watched && is_rewatching == malStatus.is_rewatching && Intrinsics.areEqual(
                    updated_at, malStatus.updated_at
                )
            }
            return false
        }

        /* JADX WARN: Multi-variable type inference failed */
        override fun hashCode(): Int {
            val hashCode = ((status.hashCode() * 31 + score) * 31 + num_episodes_watched) * 31
            val z = is_rewatching
            var i: Int = z.toInt()
            if (z.toInt() != 0) {
                i = 1
            }
            return (hashCode + i) * 31 + updated_at.hashCode()
        }

        override fun toString(): String {
            return "MalStatus(status=" + status + ", score=" + score + ", num_episodes_watched=" + num_episodes_watched + ", is_rewatching=" + is_rewatching + ", updated_at=" + updated_at + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(status, "status")
            Intrinsics.checkNotNullParameter(updated_at, "updated_at")
            this.status = status
            score = i
            num_episodes_watched = i2
            is_rewatching = z
            this.updated_at = updated_at
        }

        fun is_rewatching(): Boolean {
            return is_rewatching
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                malStatus: MalStatus,
                str: String,
                i: Int,
                i2: Int,
                z: Boolean,
                str2: String,
                i3: Int,
                obj: Object?
            ): MalStatus {
                var str = str
                var i = i
                var i2 = i2
                var z = z
                var str2 = str2
                if (i3 and 1 != 0) {
                    str = malStatus.status
                }
                if (i3 and 2 != 0) {
                    i = malStatus.score
                }
                val i4 = i
                if (i3 and 4 != 0) {
                    i2 = malStatus.num_episodes_watched
                }
                val i5 = i2
                if (i3 and 8 != 0) {
                    z = malStatus.is_rewatching
                }
                val z2 = z
                if (i3 and 16 != 0) {
                    str2 = malStatus.updated_at
                }
                return malStatus.copy(str, i4, i5, z2, str2)
            }
        }
    }

    /* compiled from: MALApi.kt */
    @Metadata(
        m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MalUser;", "", "id", "", "name", "", FirebaseAnalytics.Param.LOCATION, "joined_at", "picture", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getJoined_at", "()Ljava/lang/String;", "getLocation", "getName", "getPicture", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class MalUser(
        @JsonProperty("id") i: Int,
        @JsonProperty("name") name: String,
        @JsonProperty("location") location: String,
        @JsonProperty("joined_at") joined_at: String,
        @JsonProperty("picture") str: String
    ) {
        /* renamed from: id */
        val id: Int
        val joined_at: String
        val location: String
        val name: String
        val picture: String
        operator fun component1(): Int {
            return id
        }

        operator fun component2(): String {
            return name
        }

        operator fun component3(): String {
            return location
        }

        operator fun component4(): String {
            return joined_at
        }

        operator fun component5(): String {
            return picture
        }

        fun copy(
            @JsonProperty("id") i: Int,
            @JsonProperty("name") name: String,
            @JsonProperty("location") location: String,
            @JsonProperty("joined_at") joined_at: String,
            @JsonProperty("picture") str: String
        ): MalUser {
            Intrinsics.checkNotNullParameter(name, "name")
            Intrinsics.checkNotNullParameter(location, "location")
            Intrinsics.checkNotNullParameter(joined_at, "joined_at")
            return MalUser(i, name, location, joined_at, str)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is MalUser) {
                val malUser = obj as MalUser
                return id == malUser.id && Intrinsics.areEqual(
                    name,
                    malUser.name
                ) && Intrinsics.areEqual(
                    location, malUser.location
                ) && Intrinsics.areEqual(joined_at, malUser.joined_at) && Intrinsics.areEqual(
                    picture, malUser.picture
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val hashCode =
                (((id * 31 + name.hashCode()) * 31 + location.hashCode()) * 31 + joined_at.hashCode()) * 31
            val str = picture
            return hashCode + (str?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "MalUser(id=" + id + ", name=" + name + ", location=" + location + ", joined_at=" + joined_at + ", picture=" + picture + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(name, "name")
            Intrinsics.checkNotNullParameter(location, "location")
            Intrinsics.checkNotNullParameter(joined_at, "joined_at")
            id = i
            this.name = name
            this.location = location
            this.joined_at = joined_at
            picture = str
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                malUser: MalUser,
                i: Int,
                str: String,
                str2: String,
                str3: String,
                str4: String,
                i2: Int,
                obj: Object?
            ): MalUser {
                var i = i
                var str = str
                var str2 = str2
                var str3 = str3
                var str4 = str4
                if (i2 and 1 != 0) {
                    i = malUser.id
                }
                if (i2 and 2 != 0) {
                    str = malUser.name
                }
                val str5 = str
                if (i2 and 4 != 0) {
                    str2 = malUser.location
                }
                val str6 = str2
                if (i2 and 8 != 0) {
                    str3 = malUser.joined_at
                }
                val str7 = str3
                if (i2 and 16 != 0) {
                    str4 = malUser.picture
                }
                return malUser.copy(i, str5, str6, str7, str4)
            }
        }
    }

    /* compiled from: MALApi.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000c\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MalMainPicture;", "", "large", "", "medium", "(Ljava/lang/String;Ljava/lang/String;)V", "getLarge", "()Ljava/lang/String;", "getMedium", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class MalMainPicture(
        @param:JsonProperty("large") val large: String, @param:JsonProperty(
            "medium"
        ) val medium: String
    ) {
        operator fun component1(): String {
            return large
        }

        operator fun component2(): String {
            return medium
        }

        fun copy(
            @JsonProperty("large") str: String,
            @JsonProperty("medium") str2: String
        ): MalMainPicture {
            return MalMainPicture(str, str2)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is MalMainPicture) {
                val malMainPicture = obj as MalMainPicture
                return Intrinsics.areEqual(large, malMainPicture.large) && Intrinsics.areEqual(
                    medium, malMainPicture.medium
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val str = large
            val hashCode = (str?.hashCode() ?: 0) * 31
            val str2 = medium
            return hashCode + (str2?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "MalMainPicture(large=" + large + ", medium=" + medium + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                malMainPicture: MalMainPicture,
                str: String,
                str2: String,
                i: Int,
                obj: Object?
            ): MalMainPicture {
                var str = str
                var str2 = str2
                if (i and 1 != 0) {
                    str = malMainPicture.large
                }
                if (i and 2 != 0) {
                    str2 = malMainPicture.medium
                }
                return malMainPicture.copy(str, str2)
            }
        }
    }

    /* compiled from: MALApi.kt */
    @Metadata(
        m108d1 = ["\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$SmallMalAnime;", "", "id", "", "title", "", "num_episodes", "my_list_status", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MalStatus;", "main_picture", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MalMainPicture;", "(ILjava/lang/String;ILcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MalStatus;Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MalMainPicture;)V", "getId", "()I", "getMain_picture", "()Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MalMainPicture;", "getMy_list_status", "()Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MalStatus;", "getNum_episodes", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class SmallMalAnime(/* renamed from: id */
        @param:JsonProperty("id") val id: Int,
        @param:JsonProperty("title") val title: String,
        @param:JsonProperty(
            "num_episodes"
        ) val num_episodes: Int,
        @param:JsonProperty("my_list_status") val my_list_status: MalStatus,
        @param:JsonProperty(
            "main_picture"
        ) val main_picture: MalMainPicture
    ) {
        operator fun component1(): Int {
            return id
        }

        operator fun component2(): String {
            return title
        }

        operator fun component3(): Int {
            return num_episodes
        }

        operator fun component4(): MalStatus {
            return my_list_status
        }

        operator fun component5(): MalMainPicture {
            return main_picture
        }

        fun copy(
            @JsonProperty("id") i: Int,
            @JsonProperty("title") str: String,
            @JsonProperty("num_episodes") i2: Int,
            @JsonProperty("my_list_status") malStatus: MalStatus,
            @JsonProperty("main_picture") malMainPicture: MalMainPicture
        ): SmallMalAnime {
            return SmallMalAnime(i, str, i2, malStatus, malMainPicture)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is SmallMalAnime) {
                val smallMalAnime = obj as SmallMalAnime
                return id == smallMalAnime.id && Intrinsics.areEqual(
                    title,
                    smallMalAnime.title
                ) && num_episodes == smallMalAnime.num_episodes && Intrinsics.areEqual(
                    my_list_status, smallMalAnime.my_list_status
                ) && Intrinsics.areEqual(
                    main_picture, smallMalAnime.main_picture
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val i = id * 31
            val str = title
            val hashCode = ((i + (str?.hashCode() ?: 0)) * 31 + num_episodes) * 31
            val malStatus = my_list_status
            val hashCode2 = (hashCode + (malStatus?.hashCode() ?: 0)) * 31
            val malMainPicture = main_picture
            return hashCode2 + (malMainPicture?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "SmallMalAnime(id=" + id + ", title=" + title + ", num_episodes=" + num_episodes + ", my_list_status=" + my_list_status + ", main_picture=" + main_picture + ')'
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                smallMalAnime: SmallMalAnime,
                i: Int,
                str: String,
                i2: Int,
                malStatus: MalStatus,
                malMainPicture: MalMainPicture,
                i3: Int,
                obj: Object?
            ): SmallMalAnime {
                var i = i
                var str = str
                var i2 = i2
                var malStatus = malStatus
                var malMainPicture = malMainPicture
                if (i3 and 1 != 0) {
                    i = smallMalAnime.id
                }
                if (i3 and 2 != 0) {
                    str = smallMalAnime.title
                }
                val str2 = str
                if (i3 and 4 != 0) {
                    i2 = smallMalAnime.num_episodes
                }
                val i4 = i2
                if (i3 and 8 != 0) {
                    malStatus = smallMalAnime.my_list_status
                }
                val malStatus2 = malStatus
                if (i3 and 16 != 0) {
                    malMainPicture = smallMalAnime.main_picture
                }
                return smallMalAnime.copy(i, str2, i4, malStatus2, malMainPicture)
            }
        }
    }

    /* compiled from: MALApi.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000c\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MalSearchNode;", "", "node", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Node;", "(Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Node;)V", "getNode", "()Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$Node;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class MalSearchNode(@JsonProperty("node") node: Node) {
        val node: Node
        operator fun component1(): Node {
            return node
        }

        fun copy(@JsonProperty("node") node: Node): MalSearchNode {
            Intrinsics.checkNotNullParameter(node, "node")
            return MalSearchNode(node)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is MalSearchNode && Intrinsics.areEqual(
                node,
                (obj as MalSearchNode).node
            )
        }

        override fun hashCode(): Int {
            return node.hashCode()
        }

        override fun toString(): String {
            return "MalSearchNode(node=" + node + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(node, "node")
            this.node = node
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                malSearchNode: MalSearchNode,
                node: Node,
                i: Int,
                obj: Object?
            ): MalSearchNode {
                var node = node
                if (i and 1 != 0) {
                    node = malSearchNode.node
                }
                return malSearchNode.copy(node)
            }
        }
    }

    /* compiled from: MALApi.kt */
    @Metadata(
        m108d1 = ["\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\u000c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MalSearch;", "", "data", "", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MalSearchNode;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class MalSearch(@JsonProperty("data") data: List<MalSearchNode>) {
        val data: List<MalSearchNode>
        operator fun component1(): List<MalSearchNode> {
            return data
        }

        fun copy(@JsonProperty("data") data: List<MalSearchNode>): MalSearch {
            Intrinsics.checkNotNullParameter(data, "data")
            return MalSearch(data)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is MalSearch && Intrinsics.areEqual(
                data,
                (obj as MalSearch).data
            )
        }

        override fun hashCode(): Int {
            return data.hashCode()
        }

        override fun toString(): String {
            return "MalSearch(data=" + data + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(data, "data")
            this.data = data
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                malSearch: MalSearch,
                list: List,
                i: Int,
                obj: Object?
            ): MalSearch {
                var list: List = list
                if (i and 1 != 0) {
                    list = malSearch.data
                }
                return malSearch.copy(list)
            }
        }
    }

    /* compiled from: MALApi.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MalTitleHolder;", "", "status", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MalStatus;", "id", "", "name", "", "(Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MalStatus;ILjava/lang/String;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getStatus", "()Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi\$MalStatus;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class MalTitleHolder(status: MalStatus, i: Int, name: String) {
        /* renamed from: id */
        val id: Int
        val name: String
        val status: MalStatus
        operator fun component1(): MalStatus {
            return status
        }

        operator fun component2(): Int {
            return id
        }

        operator fun component3(): String {
            return name
        }

        fun copy(status: MalStatus, i: Int, name: String): MalTitleHolder {
            Intrinsics.checkNotNullParameter(status, "status")
            Intrinsics.checkNotNullParameter(name, "name")
            return MalTitleHolder(status, i, name)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is MalTitleHolder) {
                val malTitleHolder = obj as MalTitleHolder
                return Intrinsics.areEqual(
                    status,
                    malTitleHolder.status
                ) && id == malTitleHolder.id && Intrinsics.areEqual(
                    name, malTitleHolder.name
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return (status.hashCode() * 31 + id) * 31 + name.hashCode()
        }

        override fun toString(): String {
            return "MalTitleHolder(status=" + status + ", id=" + id + ", name=" + name + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(status, "status")
            Intrinsics.checkNotNullParameter(name, "name")
            this.status = status
            id = i
            this.name = name
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                malTitleHolder: MalTitleHolder,
                malStatus: MalStatus,
                i: Int,
                str: String,
                i2: Int,
                obj: Object?
            ): MalTitleHolder {
                var malStatus = malStatus
                var i = i
                var str = str
                if (i2 and 1 != 0) {
                    malStatus = malTitleHolder.status
                }
                if (i2 and 2 != 0) {
                    i = malTitleHolder.id
                }
                if (i2 and 4 != 0) {
                    str = malTitleHolder.name
                }
                return malTitleHolder.copy(malStatus, i, str)
            }
        }
    }

    companion object {
        const val MAL_CACHED_LIST = "mal_cached_list"
        const val MAL_REFRESH_TOKEN_KEY = "mal_refresh_token"
        const val MAL_SHOULD_UPDATE_LIST = "mal_should_update_list"
        const val MAL_TOKEN_KEY = "mal_token"
        const val MAL_UNIXTIME_KEY = "mal_unixtime"
        const val MAL_USER_KEY = "mal_user"
        val Companion = Companion(null)
        private val malStatusAsString =
            arrayOf("watching", "completed", "on_hold", "dropped", "plan_to_watch")

        fun  /* synthetic */`getMalAnimeListSlice$default`(
            mALApi: MALApi,
            i: Int,
            continuation: Continuation<*>?,
            i2: Int,
            obj: Object?
        ): Object {
            var i = i
            if (i2 and 1 != 0) {
                i = 0
            }
            return mALApi.getMalAnimeListSlice(i, continuation)
        }

        fun  /* synthetic */`convertJapanTimeToTimeRemaining$default`(
            mALApi: MALApi,
            str: String,
            str2: String?,
            i: Int,
            obj: Object?
        ): String? {
            var str2 = str2
            if (i and 2 != 0) {
                str2 = null
            }
            return mALApi.convertJapanTimeToTimeRemaining(str, str2)
        }

        fun  /* synthetic */`getMalUser$default`(
            mALApi: MALApi,
            z: Boolean,
            continuation: Continuation<*>?,
            i: Int,
            obj: Object?
        ): Object {
            var z = z
            if (i and 1 != 0) {
                z = true
            }
            return mALApi.getMalUser(z, continuation)
        }
    }
}