package com.lagradost.cloudstream3.syncproviders

import android.content.Context
import com.lagradost.cloudstream3.AcraApplication
import kotlin.jvm.internal.Intrinsics

/* compiled from: AccountManager.kt */
@Metadata(
    m108d1 = ["\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000c\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\b&\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0006\u0010\u0017\u001a\u00020\u0013J\b\u0010\u0018\u001a\u00020\u0013H\u0004J\b\u0010\u0019\u001a\u00020\u0013H\u0004J\b\u0010\u001a\u001a\u00020\u0013H\u0004J\b\u0010\u001b\u001a\u00020\u0013H\u0004R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000c\u0010\r\"\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"],
    m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/AccountManager;", "Lcom/lagradost/cloudstream3/syncproviders/AuthAPI;", "defIndex", "", "(I)V", "accountActiveKey", "", "getAccountActiveKey", "()Ljava/lang/String;", "accountId", "getAccountId", "accountIndex", "getAccountIndex", "()I", "setAccountIndex", "accountsKey", "getAccountsKey", "lastAccountIndex", "changeAccount", "", FirebaseAnalytics.Param.INDEX, "getAccounts", "", "init", "registerAccount", "removeAccountKeys", "switchToNewAccount", "switchToOldAccount", "Companion", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes3.dex */
abstract class AccountManager(private val defIndex: Int) : AuthAPI {
    var accountIndex: Int
    private var lastAccountIndex: Int

    /* compiled from: AccountManager.kt */
    @Metadata(
        m108d1 = ["\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010-\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u0013R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u000c0\u00048F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0007R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\$R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\u00048F¢\u0006\u0006\u001a\u0004\b&\u0010\u0007R\u0011\u0010'\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010+\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b,\u0010*¨\u00060"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/AccountManager\$Companion;", "", "()V", "OAuth2Apis", "", "Lcom/lagradost/cloudstream3/syncproviders/OAuth2API;", "getOAuth2Apis", "()Ljava/util/List;", "SyncApis", "Lcom/lagradost/cloudstream3/syncproviders/SyncRepo;", "getSyncApis", "accountManagers", "Lcom/lagradost/cloudstream3/syncproviders/AccountManager;", "getAccountManagers", "aniListApi", "Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi;", "getAniListApi", "()Lcom/lagradost/cloudstream3/syncproviders/providers/AniListApi;", "appString", "", "inAppAuths", "Lcom/lagradost/cloudstream3/syncproviders/InAppAuthAPIManager;", "getInAppAuths", "malApi", "Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi;", "getMalApi", "()Lcom/lagradost/cloudstream3/syncproviders/providers/MALApi;", "maxStale", "", "nginxApi", "Lcom/lagradost/cloudstream3/syncproviders/providers/NginxApi;", "getNginxApi", "()Lcom/lagradost/cloudstream3/syncproviders/providers/NginxApi;", "openSubtitlesApi", "Lcom/lagradost/cloudstream3/syncproviders/providers/OpenSubtitlesApi;", "getOpenSubtitlesApi", "()Lcom/lagradost/cloudstream3/syncproviders/providers/OpenSubtitlesApi;", "subtitleProviders", "getSubtitleProviders", "unixTime", "", "getUnixTime", "()J", "unixTimeMs", "getUnixTimeMs", "secondsToReadable", "seconds", "completedValue", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        val malApi: MALApi
            get() = AccountManager.Companion.malApi
        val aniListApi: AniListApi
            get() = AccountManager.Companion.aniListApi
        val openSubtitlesApi: OpenSubtitlesApi
            get() = AccountManager.Companion.openSubtitlesApi
        val nginxApi: NginxApi
            get() = AccountManager.Companion.nginxApi
        val oAuth2Apis: List<OAuth2API>
            get() = CollectionsKt.listOf<Object>(
                *arrayOf<OAuth2API>(
                    malApi,
                    aniListApi
                ) as Array<Object>
            )
        val accountManagers: List<AccountManager>
            get() = CollectionsKt.listOf<Object>(
                *arrayOf<AccountManager>(
                    malApi,
                    aniListApi,
                    openSubtitlesApi,
                    nginxApi
                ) as Array<Object>
            )
        val syncApis: List<SyncRepo>
            get() = CollectionsKt.listOf<Object>(
                *arrayOf(
                    SyncRepo(malApi), SyncRepo(
                        aniListApi
                    )
                ) as Array<Object>
            )
        val inAppAuths: List<InAppAuthAPIManager>
            get() = CollectionsKt.listOf<Object>(
                *arrayOf<InAppAuthAPIManager>(
                    openSubtitlesApi,
                    nginxApi
                ) as Array<Object>
            )
        val subtitleProviders: List<Any>
            get() = CollectionsKt.listOf<OpenSubtitlesApi>(openSubtitlesApi)
        val unixTime: Long
            get() = System.currentTimeMillis() / 1000
        val unixTimeMs: Long
            get() = System.currentTimeMillis()

        fun secondsToReadable(i: Int, completedValue: String): String {
            val str: String
            Intrinsics.checkNotNullParameter(completedValue, "completedValue")
            val j = i.toLong()
            val days: Long = TimeUnit.SECONDS.toDays(j)
            val seconds: Long = j - TimeUnit.DAYS.toSeconds(days)
            val hours: Long = TimeUnit.SECONDS.toHours(seconds)
            val minutes: Long =
                TimeUnit.SECONDS.toMinutes(seconds - TimeUnit.HOURS.toSeconds(hours))
            TimeUnit.MINUTES.toSeconds(minutes)
            if (minutes < 0) {
                return completedValue
            }
            val sb = StringBuilder()
            var str2 = ""
            str = if (days != 0L) {
                days.toString() + "d "
            } else {
                ""
            }
            sb.append(str)
            if (hours != 0L) {
                str2 = hours.toString() + "h "
            }
            sb.append(str2)
            sb.append(minutes)
            sb.append('m')
            return sb.toString()
        }
    }

    init {
        accountIndex = defIndex
        lastAccountIndex = defIndex
    }

    /* JADX INFO: Access modifiers changed from: protected */
    val accountId: String
        get() = idPrefix.toString() + "_account_" + accountIndex
    private val accountActiveKey: String
        private get() = idPrefix.toString() + "_active"
    private val accountsKey: String
        private get() = idPrefix.toString() + "_accounts"

    /* JADX INFO: Access modifiers changed from: protected */
    fun removeAccountKeys() {
        var arrayList: ArrayList
        AcraApplication.Companion.removeKeys(accountId)
        val accounts = accounts
        if (accounts == null || ArraysKt.toMutableList(accounts).also { arrayList = it } == null) {
            arrayList = ArrayList()
        }
        arrayList.remove(Integer.valueOf(accountIndex))
        AcraApplication.Companion.setKey(accountsKey, CollectionsKt.toIntArray(arrayList))
        init()
    }

    val accounts: IntArray?
        get() {
            val companion: AcraApplication.Companion = AcraApplication.Companion
            val accountsKey = accountsKey
            var obj: Object? = IntArray(0)
            val context: Context = companion.getContext()
            if (context != null) {
                val dataStore: DataStore = DataStore.INSTANCE
                try {
                    val string: String =
                        dataStore.getSharedPrefs(context).getString(accountsKey, null)
                    if (string != null) {
                        Intrinsics.checkNotNullExpressionValue(
                            string,
                            "getSharedPrefs().getStri…h, null) ?: return defVal"
                        )
                        obj = dataStore.mapper.readValue(string, IntArray::class.java)
                        Intrinsics.checkNotNullExpressionValue(
                            obj,
                            "mapper.readValue(this, T::class.java)"
                        )
                    }
                } catch (unused: Exception) {
                }
                return obj
            }
            obj = null
            return obj
        }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun init() {
        /*
            r5 = this;
            com.lagradost.cloudstream3.AcraApplication$Companion r0 = com.lagradost.cloudstream3.AcraApplication.Companion
            java.lang.String r1 = r5.getAccountActiveKey()
            int r2 = r5.defIndex
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            android.content.Context r0 = r0.getContext()
            r3 = 0
            if (r0 == 0) goto L35
            com.lagradost.cloudstream3.utils.DataStore r4 = com.lagradost.cloudstream3.utils.DataStore.INSTANCE
            android.content.SharedPreferences r0 = r4.getSharedPrefs(r0)     // Catch: java.lang.Exception -> L35
            java.lang.String r0 = r0.getString(r1, r3)     // Catch: java.lang.Exception -> L35
            if (r0 != 0) goto L20
            goto L36
        L20:
            java.lang.String r1 = "getSharedPrefs().getStri…h, null) ?: return defVal"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Exception -> L35
            com.fasterxml.jackson.databind.json.JsonMapper r1 = r4.getMapper()     // Catch: java.lang.Exception -> L35
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            java.lang.Object r2 = r1.readValue(r0, r2)     // Catch: java.lang.Exception -> L35
            java.lang.String r0 = "mapper.readValue(this, T::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)     // Catch: java.lang.Exception -> L35
            goto L36
        L35:
            r2 = r3
        L36:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r0 = r2.intValue()
            r5.accountIndex = r0
            int[] r0 = r5.getAccounts()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L53
            int r3 = r0.length
            if (r3 != 0) goto L4e
            r3 = 1
            goto L4f
        L4e:
            r3 = 0
        L4f:
            r3 = r3 ^ r2
            if (r3 != r2) goto L53
            r1 = 1
        L53:
            if (r1 == 0) goto L61
            com.lagradost.cloudstream3.syncproviders.AuthAPI$LoginInfo r1 = r5.loginInfo()
            if (r1 != 0) goto L61
            int r0 = kotlin.collections.ArraysKt.first(r0)
            r5.accountIndex = r0
        L61:
            return
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.AccountManager.init():void")
    }

    /* JADX INFO: Access modifiers changed from: protected */
    fun switchToNewAccount() {
        var maxOrNull: Integer
        val accounts = accounts
        lastAccountIndex = accountIndex
        accountIndex = (if (accounts == null || ArraysKt.maxOrNull(accounts)
                .also { maxOrNull = it } == null
        ) 0 else maxOrNull.intValue()) + 1
    }

    /* JADX INFO: Access modifiers changed from: protected */
    fun switchToOldAccount() {
        accountIndex = lastAccountIndex
    }

    /* JADX INFO: Access modifiers changed from: protected */
    fun registerAccount() {
        var arrayList: ArrayList
        AcraApplication.Companion.setKey(accountActiveKey, Integer.valueOf(accountIndex))
        val accounts = accounts
        if (accounts == null || ArraysKt.toMutableList(accounts).also { arrayList = it } == null) {
            arrayList = ArrayList()
        }
        if (!arrayList.contains(Integer.valueOf(accountIndex))) {
            arrayList.add(Integer.valueOf(accountIndex))
        }
        AcraApplication.Companion.setKey(accountsKey, CollectionsKt.toIntArray(arrayList))
    }

    fun changeAccount(i: Int) {
        accountIndex = i
        AcraApplication.Companion.setKey(accountActiveKey, Integer.valueOf(i))
    }

    companion object {
        const val appString = "cloudstreamapp"
        const val maxStale = 600
        @kotlin.jvm.JvmField
        val Companion = Companion(null)
        private val malApi: MALApi = MALApi(0)
        private val aniListApi: AniListApi = AniListApi(0)
        private val openSubtitlesApi: OpenSubtitlesApi = OpenSubtitlesApi(0)
        private val nginxApi: NginxApi = NginxApi(0)
    }
}