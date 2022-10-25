package com.lagradost.cloudstream3.syncproviders.providers

import android.content.Context
import com.lagradost.cloudstream3.AcraApplication
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: OpenSubtitlesApi.kt */
@Metadata(
    m108d1 = ["\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 42\u00020\u00012\u00020\u0002:\t456789:;<B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0017\u001a\u00020\u0012H\u0002J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\n\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J!\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ\u0011\u0010 \u001a\u00020!H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\"J\u001b\u0010#\u001a\u0004\u0018\u00010\u00072\u0006\u0010$\u001a\u00020%H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010&J\b\u0010'\u001a\u00020!H\u0016J\u0019\u0010(\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010)J\n\u0010*\u001a\u0004\u0018\u00010+H\u0016J!\u0010,\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010-2\u0006\u0010.\u001a\u00020/H\u0096@ø\u0001\u0000¢\u0006\u0002\u00100J\u0012\u00101\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010\u0019H\u0002J\b\u00102\u001a\u00020!H\u0002J\b\u00103\u001a\u00020!H\u0002R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000cR\u0014\u0010\r\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u0012X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0012X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006="],
    m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/OpenSubtitlesApi;", "Lcom/lagradost/cloudstream3/syncproviders/InAppAuthAPIManager;", "Lcom/lagradost/cloudstream3/subtitles/AbstractSubProvider;", FirebaseAnalytics.Param.INDEX, "", "(I)V", "createAccountUrl", "", "getCreateAccountUrl", "()Ljava/lang/String;", "icon", "getIcon", "()Ljava/lang/Integer;", "idPrefix", "getIdPrefix", "name", "getName", "requiresPassword", "", "getRequiresPassword", "()Z", "requiresUsername", "getRequiresUsername", "canDoRequest", "getAuthKey", "Lcom/lagradost/cloudstream3/syncproviders/providers/OpenSubtitlesApi\$SubtitleOAuthEntity;", "getLatestLoginData", "Lcom/lagradost/cloudstream3/syncproviders/InAppAuthAPI\$LoginData;", "initLogin", AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER, "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initialize", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "data", "Lcom/lagradost/cloudstream3/subtitles/AbstractSubtitleEntities\$SubtitleEntity;", "(Lcom/lagradost/cloudstream3/subtitles/AbstractSubtitleEntities\$SubtitleEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logOut", "login", "(Lcom/lagradost/cloudstream3/syncproviders/InAppAuthAPI\$LoginData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loginInfo", "Lcom/lagradost/cloudstream3/syncproviders/AuthAPI\$LoginInfo;", "search", "", "query", "Lcom/lagradost/cloudstream3/subtitles/AbstractSubtitleEntities\$SubtitleSearch;", "(Lcom/lagradost/cloudstream3/subtitles/AbstractSubtitleEntities\$SubtitleSearch;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setAuthKey", "throwGotTooManyRequests", "throwIfCantDoRequest", "Companion", "OAuthToken", "ResultAttributes", "ResultData", "ResultDownloadLink", "ResultFeatureDetails", "ResultFiles", "Results", "SubtitleOAuthEntity", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class OpenSubtitlesApi(i: Int) : InAppAuthAPIManager(i), AbstractSubProvider {
    private val createAccountUrl: String
    private val icon: Int

    // com.lagradost.cloudstream3.syncproviders.InAppAuthAPIManager, com.lagradost.cloudstream3.syncproviders.AuthAPI
    @get:Override
    val idPrefix = "opensubtitles"

    // com.lagradost.cloudstream3.syncproviders.InAppAuthAPIManager, com.lagradost.cloudstream3.syncproviders.AuthAPI
    @get:Override
    val name = "OpenSubtitles"

    // com.lagradost.cloudstream3.syncproviders.InAppAuthAPIManager, com.lagradost.cloudstream3.syncproviders.InAppAuthAPI
    @get:Override
    val requiresPassword: Boolean

    // com.lagradost.cloudstream3.syncproviders.InAppAuthAPIManager, com.lagradost.cloudstream3.syncproviders.InAppAuthAPI
    @get:Override
    val requiresUsername: Boolean

    init {
        icon = R.drawable.open_subtitles_icon
        requiresPassword = true
        requiresUsername = true
        createAccountUrl = "https://www.opensubtitles.com/en/users/sign_up"
    }

    @Override // com.lagradost.cloudstream3.syncproviders.InAppAuthAPIManager, com.lagradost.cloudstream3.syncproviders.AuthAPI
    override fun getIcon(): Integer? {
        return Integer.valueOf(icon)
    }

    @Override // com.lagradost.cloudstream3.syncproviders.AuthAPI
    override fun getCreateAccountUrl(): String? {
        return createAccountUrl
    }

    /* compiled from: OpenSubtitlesApi.kt */
    @Metadata(
        m108d1 = ["\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\u000c\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/OpenSubtitlesApi\$Companion;", "", "()V", "OPEN_SUBTITLES_USER_KEY", "", "TAG", "apiKey", "coolDownDuration", "", "currentCoolDown", "getCurrentCoolDown", "()J", "setCurrentCoolDown", "(J)V", "currentSession", "Lcom/lagradost/cloudstream3/syncproviders/providers/OpenSubtitlesApi\$SubtitleOAuthEntity;", "getCurrentSession", "()Lcom/lagradost/cloudstream3/syncproviders/providers/OpenSubtitlesApi\$SubtitleOAuthEntity;", "setCurrentSession", "(Lcom/lagradost/cloudstream3/syncproviders/providers/OpenSubtitlesApi\$SubtitleOAuthEntity;)V", "host", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        var currentCoolDown: Long
            get() = OpenSubtitlesApi.Companion.currentCoolDown
            set(j) {
                OpenSubtitlesApi.Companion.currentCoolDown = j
            }
        var currentSession: SubtitleOAuthEntity
            get() = OpenSubtitlesApi.Companion.currentSession
            set(subtitleOAuthEntity) {
                OpenSubtitlesApi.Companion.currentSession = subtitleOAuthEntity
            }
    }

    private fun canDoRequest(): Boolean {
        return AccountManager.Companion.Companion.getUnixTimeMs() > OpenSubtitlesApi.Companion.currentCoolDown
    }

    private fun throwIfCantDoRequest() {
        if (canDoRequest()) {
            return
        }
        throw ErrorLoadingException("Too many requests wait for " + (OpenSubtitlesApi.Companion.currentCoolDown - AccountManager.Companion.Companion.getUnixTimeMs()) / 1000 + 's')
    }

    private fun throwGotTooManyRequests() {
        OpenSubtitlesApi.Companion.currentCoolDown =
            AccountManager.Companion.Companion.getUnixTimeMs() + 30000
        throw ErrorLoadingException("Too many requests")
    }

    private var authKey: SubtitleOAuthEntity
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
                            OpenSubtitlesApi.Companion.OPEN_SUBTITLES_USER_KEY
                        ), null
                    )
                    if (string != null) {
                        Intrinsics.checkNotNullExpressionValue(
                            string,
                            "getSharedPrefs().getStri…h, null) ?: return defVal"
                        )
                        val readValue: Object =
                            dataStore.mapper.readValue(string, SubtitleOAuthEntity::class.java)
                        Intrinsics.checkNotNullExpressionValue(
                            readValue,
                            "mapper.readValue(this, T::class.java)"
                        )
                        obj = readValue
                    }
                } catch (unused: Exception) {
                }
            }
            return (obj as SubtitleOAuthEntity?)!!
        }
        private set(subtitleOAuthEntity) {
            if (subtitleOAuthEntity == null) {
                AcraApplication.Companion.removeKey(
                    getAccountId(),
                    OpenSubtitlesApi.Companion.OPEN_SUBTITLES_USER_KEY
                )
            }
            OpenSubtitlesApi.Companion.currentSession = subtitleOAuthEntity
            AcraApplication.Companion.setKey<SubtitleOAuthEntity>(
                getAccountId(),
                OpenSubtitlesApi.Companion.OPEN_SUBTITLES_USER_KEY,
                subtitleOAuthEntity
            )
        }

    @Override // com.lagradost.cloudstream3.syncproviders.InAppAuthAPIManager, com.lagradost.cloudstream3.syncproviders.AuthAPI
    override fun loginInfo(): LoginInfo? {
        val authKey: SubtitleOAuthEntity? = authKey
        return if (authKey != null) {
            LoginInfo(null, authKey.getUser(), getAccountIndex())
        } else null
    }

    // com.lagradost.cloudstream3.syncproviders.InAppAuthAPIManager, com.lagradost.cloudstream3.syncproviders.InAppAuthAPI
    @get:Override
    val latestLoginData: LoginData?
        // com.lagradost.cloudstream3.syncproviders.InAppAuthAPIManager, com.lagradost.cloudstream3.syncproviders.InAppAuthAPI
        get() {
            val authKey = authKey ?: return null
            return LoginData(authKey.getUser(), authKey.getPass(), null, null, 12, null)
        }

    @Override // com.lagradost.cloudstream3.syncproviders.InAppAuthAPIManager
    override fun initialize(continuation: Continuation<in Unit>?): Object? {
        var pass: String?
        var user: String?
        var authKey: SubtitleOAuthEntity? = authKey
        var str: String? = "duong12210119"
        var str2: String? = "duongnv1996"
        if (authKey == null) {
            authKey = SubtitleOAuthEntity("duongnv1996", "duong12210119", "")
        }
        OpenSubtitlesApi.Companion.currentSession = authKey
        if (authKey != null && authKey.getUser().also { user = it } != null) {
            str2 = user
        }
        val subtitleOAuthEntity: SubtitleOAuthEntity = OpenSubtitlesApi.Companion.currentSession
        if (subtitleOAuthEntity != null && subtitleOAuthEntity.getPass()
                .also { pass = it } != null
        ) {
            str = pass
        }
        val initLogin: Object = initLogin(str2, str, continuation)
        return if (initLogin === IntrinsicsKt.getCOROUTINE_SUSPENDED()) initLogin else Unit.INSTANCE
    }

    @Override // com.lagradost.cloudstream3.syncproviders.InAppAuthAPIManager, com.lagradost.cloudstream3.syncproviders.AuthAPI
    override fun logOut() {
        authKey = null
        removeAccountKeys()
        OpenSubtitlesApi.Companion.currentSession = authKey
    }

    /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */ /* JADX WARN: Removed duplicated region for block: B:20:0x00c6  */ /* JADX WARN: Removed duplicated region for block: B:35:0x0102  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun initLogin(r29: String?, r30: String?, r31: Continuation<in Boolean?>?): Any {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.OpenSubtitlesApi.initLogin(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */ /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */ /* JADX WARN: Removed duplicated region for block: B:29:0x005e A[Catch: Exception -> 0x002e, TRY_LEAVE, TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x002a, B:27:0x0056, B:29:0x005e), top: B:40:0x002a }] */
    @Override // com.lagradost.cloudstream3.syncproviders.InAppAuthAPIManager, com.lagradost.cloudstream3.syncproviders.InAppAuthAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun login(r5: LoginData?, r6: Continuation<in Boolean?>?): Any {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.lagradost.cloudstream3.syncproviders.providers.OpenSubtitlesApi$login$1
            if (r0 == 0) goto L14
            r0 = r6
            com.lagradost.cloudstream3.syncproviders.providers.OpenSubtitlesApi$login$1 r0 = (com.lagradost.cloudstream3.syncproviders.providers.OpenSubtitlesApi$login$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            com.lagradost.cloudstream3.syncproviders.providers.OpenSubtitlesApi$login$1 r0 = new com.lagradost.cloudstream3.syncproviders.providers.OpenSubtitlesApi$login$1
            r0.<init>(r4, r6)
        L19:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r5 = r0.L$0
            com.lagradost.cloudstream3.syncproviders.providers.OpenSubtitlesApi r5 = (com.lagradost.cloudstream3.syncproviders.providers.OpenSubtitlesApi) r5
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Exception -> L2e
            goto L56
        L2e:
            r6 = move-exception
            goto L68
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.String r6 = r5.getUsername()
            if (r6 == 0) goto L81
            java.lang.String r5 = r5.getPassword()
            if (r5 == 0) goto L79
            r4.switchToNewAccount()
            r0.L$0 = r4     // Catch: java.lang.Exception -> L66
            r0.label = r3     // Catch: java.lang.Exception -> L66
            java.lang.Object r6 = r4.initLogin(r6, r5, r0)     // Catch: java.lang.Exception -> L66
            if (r6 != r1) goto L55
            return r1
        L55:
            r5 = r4
        L56:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Exception -> L2e
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Exception -> L2e
            if (r6 == 0) goto L70
            r5.registerAccount()     // Catch: java.lang.Exception -> L2e
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.boxing.boxBoolean(r3)     // Catch: java.lang.Exception -> L2e
            return r5
        L66:
            r6 = move-exception
            r5 = r4
        L68:
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            com.lagradost.cloudstream3.mvvm.ArchComponentExt.logError(r6)
            r5.switchToOldAccount()
        L70:
            r5.switchToOldAccount()
            r5 = 0
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.boxing.boxBoolean(r5)
            return r5
        L79:
            com.lagradost.cloudstream3.ErrorLoadingException r5 = new com.lagradost.cloudstream3.ErrorLoadingException
            java.lang.String r6 = "Requires Password"
            r5.<init>(r6)
            throw r5
        L81:
            com.lagradost.cloudstream3.ErrorLoadingException r5 = new com.lagradost.cloudstream3.ErrorLoadingException
            java.lang.String r6 = "Requires Username"
            r5.<init>(r6)
            throw r5
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.OpenSubtitlesApi.login(com.lagradost.cloudstream3.syncproviders.InAppAuthAPI\$LoginData, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */ /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */ /* JADX WARN: Removed duplicated region for block: B:54:0x0193  */ /* JADX WARN: Removed duplicated region for block: B:58:0x019f  */ /* JADX WARN: Removed duplicated region for block: B:69:0x01d7  */
    @Override // com.lagradost.cloudstream3.subtitles.AbstractSubProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun search(
        r25: SubtitleSearch?,
        r26: Continuation<in MutableList<SubtitleEntity?>?>?
    ): Any {
        /*
            Method dump skipped, instructions count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.OpenSubtitlesApi.search(com.lagradost.cloudstream3.subtitles.AbstractSubtitleEntities\$SubtitleSearch, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */ /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */ /* JADX WARN: Removed duplicated region for block: B:24:0x00fe  */ /* JADX WARN: Removed duplicated region for block: B:30:0x011d  */ /* JADX WARN: Removed duplicated region for block: B:35:0x013a  */
    @Override // com.lagradost.cloudstream3.subtitles.AbstractSubProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun load(r24: SubtitleEntity?, r25: Continuation<in String?>?): Any {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.syncproviders.providers.OpenSubtitlesApi.load(com.lagradost.cloudstream3.subtitles.AbstractSubtitleEntities\$SubtitleEntity, kotlin.coroutines.Continuation):java.lang.Object")
    }

    /* compiled from: OpenSubtitlesApi.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\u000c\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/OpenSubtitlesApi\$SubtitleOAuthEntity;", "", "user", "", "pass", "access_token", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccess_token", "()Ljava/lang/String;", "setAccess_token", "(Ljava/lang/String;)V", "getPass", "setPass", "getUser", "setUser", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class SubtitleOAuthEntity(user: String, pass: String, access_token: String) {
        private var access_token: String
        private var pass: String
        private var user: String
        operator fun component1(): String {
            return user
        }

        operator fun component2(): String {
            return pass
        }

        operator fun component3(): String {
            return access_token
        }

        fun copy(user: String, pass: String, access_token: String): SubtitleOAuthEntity {
            Intrinsics.checkNotNullParameter(user, "user")
            Intrinsics.checkNotNullParameter(pass, "pass")
            Intrinsics.checkNotNullParameter(access_token, "access_token")
            return SubtitleOAuthEntity(user, pass, access_token)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is SubtitleOAuthEntity) {
                val subtitleOAuthEntity = obj as SubtitleOAuthEntity
                return Intrinsics.areEqual(user, subtitleOAuthEntity.user) && Intrinsics.areEqual(
                    pass, subtitleOAuthEntity.pass
                ) && Intrinsics.areEqual(
                    access_token, subtitleOAuthEntity.access_token
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return (user.hashCode() * 31 + pass.hashCode()) * 31 + access_token.hashCode()
        }

        override fun toString(): String {
            return "SubtitleOAuthEntity(user=" + user + ", pass=" + pass + ", access_token=" + access_token + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(user, "user")
            Intrinsics.checkNotNullParameter(pass, "pass")
            Intrinsics.checkNotNullParameter(access_token, "access_token")
            this.user = user
            this.pass = pass
            this.access_token = access_token
        }

        fun getUser(): String {
            return user
        }

        fun setUser(str: String) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            user = str
        }

        fun getPass(): String {
            return pass
        }

        fun setPass(str: String) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            pass = str
        }

        fun getAccess_token(): String {
            return access_token
        }

        fun setAccess_token(str: String) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            access_token = str
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                subtitleOAuthEntity: SubtitleOAuthEntity,
                str: String,
                str2: String,
                str3: String,
                i: Int,
                obj: Object?
            ): SubtitleOAuthEntity {
                var str = str
                var str2 = str2
                var str3 = str3
                if (i and 1 != 0) {
                    str = subtitleOAuthEntity.user
                }
                if (i and 2 != 0) {
                    str2 = subtitleOAuthEntity.pass
                }
                if (i and 4 != 0) {
                    str3 = subtitleOAuthEntity.access_token
                }
                return subtitleOAuthEntity.copy(str, str2, str3)
            }
        }
    }

    /* compiled from: OpenSubtitlesApi.kt */
    @Metadata(
        m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000c\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/OpenSubtitlesApi\$OAuthToken;", "", "token", "", "status", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getStatus", "()Ljava/lang/Integer;", "setStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/lagradost/cloudstream3/syncproviders/providers/OpenSubtitlesApi\$OAuthToken;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class OAuthToken(
        @param:JsonProperty("token") var token: String?,
        @JsonProperty("status") num: Integer?
    ) {
        private var status: Integer?
        operator fun component1(): String? {
            return token
        }

        operator fun component2(): Integer? {
            return status
        }

        fun copy(
            @JsonProperty("token") str: String?,
            @JsonProperty("status") num: Integer?
        ): OAuthToken {
            return OAuthToken(str, num)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is OAuthToken) {
                val oAuthToken = obj as OAuthToken
                return Intrinsics.areEqual(token, oAuthToken.token) && Intrinsics.areEqual(
                    status, oAuthToken.status
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val str = token
            val hashCode = (str?.hashCode() ?: 0) * 31
            val num: Integer? = status
            return hashCode + if (num != null) num.hashCode() else 0
        }

        override fun toString(): String {
            return "OAuthToken(token=" + token + ", status=" + status + ')'
        }

        init {
            status = num
        }

        @JvmOverloads
                /* synthetic */   constructor(
            str: String? = null,
            num: Integer? = null,
            i: Int = 3,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(if (i and 1 != 0) null else str, if (i and 2 != 0) null else num) {
        }

        fun getStatus(): Integer? {
            return status
        }

        fun setStatus(num: Integer?) {
            status = num
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                oAuthToken: OAuthToken,
                str: String?,
                num: Integer?,
                i: Int,
                obj: Object?
            ): OAuthToken {
                var str = str
                var num: Integer? = num
                if (i and 1 != 0) {
                    str = oAuthToken.token
                }
                if (i and 2 != 0) {
                    num = oAuthToken.status
                }
                return oAuthToken.copy(str, num)
            }
        }
    }

    /* compiled from: OpenSubtitlesApi.kt */
    @Metadata(
        m108d1 = ["\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u000c2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/OpenSubtitlesApi\$Results;", "", "data", "", "Lcom/lagradost/cloudstream3/syncproviders/providers/OpenSubtitlesApi\$ResultData;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "setData", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Results(@param:JsonProperty("data") var data: List<ResultData>) {
        operator fun component1(): List<ResultData> {
            return data
        }

        fun copy(@JsonProperty("data") list: List<ResultData>): Results {
            return Results(list)
        }

        override fun equals(obj: Object): Boolean {
            return if (this === obj) {
                true
            } else obj is Results && Intrinsics.areEqual(
                data,
                (obj as Results).data
            )
        }

        override fun hashCode(): Int {
            val list = data ?: return 0
            return list.hashCode()
        }

        override fun toString(): String {
            return "Results(data=" + data + ')'
        }

        @JvmOverloads
                /* synthetic */   constructor(
            list: List? = null,
            i: Int = 1,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(if (i and 1 != 0) CollectionsKt.emptyList<Any>() else list) {
        }

        companion object {
            /* JADX WARN: Multi-variable type inference failed */
            fun  /* synthetic */`copy$default`(
                results: Results,
                list: List,
                i: Int,
                obj: Object?
            ): Results {
                var list: List = list
                if (i and 1 != 0) {
                    list = results.data
                }
                return results.copy(list)
            }
        }
    }

    /* compiled from: OpenSubtitlesApi.kt */
    @Metadata(
        m108d1 = ["\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0015\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000c\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u001c"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/OpenSubtitlesApi\$ResultData;", "", "id", "", "type", "attributes", "Lcom/lagradost/cloudstream3/syncproviders/providers/OpenSubtitlesApi\$ResultAttributes;", "(Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/syncproviders/providers/OpenSubtitlesApi\$ResultAttributes;)V", "getAttributes", "()Lcom/lagradost/cloudstream3/syncproviders/providers/OpenSubtitlesApi\$ResultAttributes;", "setAttributes", "(Lcom/lagradost/cloudstream3/syncproviders/providers/OpenSubtitlesApi\$ResultAttributes;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getType", "setType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class ResultData(/* renamed from: id */
        @param:JsonProperty("id") var id: String?,
        @param:JsonProperty("type") var type: String?,
        @param:JsonProperty(
            "attributes"
        ) var attributes: ResultAttributes
    ) {

        operator fun component1(): String? {
            return id
        }

        operator fun component2(): String? {
            return type
        }

        operator fun component3(): ResultAttributes {
            return attributes
        }

        fun copy(
            @JsonProperty("id") str: String?,
            @JsonProperty("type") str2: String?,
            @JsonProperty("attributes") resultAttributes: ResultAttributes
        ): ResultData {
            return ResultData(str, str2, resultAttributes)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is ResultData) {
                val resultData = obj as ResultData
                return Intrinsics.areEqual(id, resultData.id) && Intrinsics.areEqual(
                    type, resultData.type
                ) && Intrinsics.areEqual(attributes, resultData.attributes)
            }
            return false
        }

        override fun hashCode(): Int {
            val str = id
            val hashCode = (str?.hashCode() ?: 0) * 31
            val str2 = type
            val hashCode2 = (hashCode + (str2?.hashCode() ?: 0)) * 31
            val resultAttributes = attributes
            return hashCode2 + (resultAttributes?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "ResultData(id=" + id + ", type=" + type + ", attributes=" + attributes + ')'
        }

        @JvmOverloads
                /* synthetic */   constructor(
            str: String? = null,
            str2: String? = null,
            resultAttributes: ResultAttributes? = null,
            i: Int = 7,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) null else str,
            if (i and 2 != 0) null else str2,
            if (i and 4 != 0) ResultAttributes(
                null,
                null,
                null,
                null,
                null,
                null,
                63,
                null
            ) else resultAttributes
        ) {
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                resultData: ResultData,
                str: String?,
                str2: String?,
                resultAttributes: ResultAttributes,
                i: Int,
                obj: Object?
            ): ResultData {
                var str = str
                var str2 = str2
                var resultAttributes = resultAttributes
                if (i and 1 != 0) {
                    str = resultData.id
                }
                if (i and 2 != 0) {
                    str2 = resultData.type
                }
                if (i and 4 != 0) {
                    resultAttributes = resultData.attributes
                }
                return resultData.copy(str, str2, resultAttributes)
            }
        }
    }

    /* compiled from: OpenSubtitlesApi.kt */
    @Metadata(
        m108d1 = ["\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u000cJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003JW\u0010%\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018¨\u0006,"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/OpenSubtitlesApi\$ResultAttributes;", "", "subtitleId", "", "language", "release", "url", "files", "", "Lcom/lagradost/cloudstream3/syncproviders/providers/OpenSubtitlesApi\$ResultFiles;", "featDetails", "Lcom/lagradost/cloudstream3/syncproviders/providers/OpenSubtitlesApi\$ResultFeatureDetails;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/lagradost/cloudstream3/syncproviders/providers/OpenSubtitlesApi\$ResultFeatureDetails;)V", "getFeatDetails", "()Lcom/lagradost/cloudstream3/syncproviders/providers/OpenSubtitlesApi\$ResultFeatureDetails;", "setFeatDetails", "(Lcom/lagradost/cloudstream3/syncproviders/providers/OpenSubtitlesApi\$ResultFeatureDetails;)V", "getFiles", "()Ljava/util/List;", "setFiles", "(Ljava/util/List;)V", "getLanguage", "()Ljava/lang/String;", "setLanguage", "(Ljava/lang/String;)V", "getRelease", "setRelease", "getSubtitleId", "setSubtitleId", "getUrl", "setUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class ResultAttributes(
        @param:JsonProperty("subtitle_id") var subtitleId: String,
        @param:JsonProperty(
            "language"
        ) var language: String,
        @param:JsonProperty("release") var release: String,
        @param:JsonProperty(
            "url"
        ) var url: String,
        @param:JsonProperty("files") var files: List<ResultFiles>,
        @param:JsonProperty(
            "feature_details"
        ) var featDetails: ResultFeatureDetails
    ) {
        operator fun component1(): String {
            return subtitleId
        }

        operator fun component2(): String {
            return language
        }

        operator fun component3(): String {
            return release
        }

        operator fun component4(): String {
            return url
        }

        operator fun component5(): List<ResultFiles> {
            return files
        }

        operator fun component6(): ResultFeatureDetails {
            return featDetails
        }

        fun copy(
            @JsonProperty("subtitle_id") str: String,
            @JsonProperty("language") str2: String,
            @JsonProperty("release") str3: String,
            @JsonProperty("url") str4: String,
            @JsonProperty("files") list: List<ResultFiles>,
            @JsonProperty("feature_details") resultFeatureDetails: ResultFeatureDetails
        ): ResultAttributes {
            return ResultAttributes(str, str2, str3, str4, list, resultFeatureDetails)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is ResultAttributes) {
                val resultAttributes = obj as ResultAttributes
                return Intrinsics.areEqual(
                    subtitleId,
                    resultAttributes.subtitleId
                ) && Intrinsics.areEqual(
                    language, resultAttributes.language
                ) && Intrinsics.areEqual(
                    release, resultAttributes.release
                ) && Intrinsics.areEqual(
                    url, resultAttributes.url
                ) && Intrinsics.areEqual(files, resultAttributes.files) && Intrinsics.areEqual(
                    featDetails, resultAttributes.featDetails
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val str = subtitleId
            val hashCode = (str?.hashCode() ?: 0) * 31
            val str2 = language
            val hashCode2 = (hashCode + (str2?.hashCode() ?: 0)) * 31
            val str3 = release
            val hashCode3 = (hashCode2 + (str3?.hashCode() ?: 0)) * 31
            val str4 = url
            val hashCode4 = (hashCode3 + (str4?.hashCode() ?: 0)) * 31
            val list = files
            val hashCode5 = (hashCode4 + (list?.hashCode() ?: 0)) * 31
            val resultFeatureDetails = featDetails
            return hashCode5 + (resultFeatureDetails?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "ResultAttributes(subtitleId=" + subtitleId + ", language=" + language + ", release=" + release + ", url=" + url + ", files=" + files + ", featDetails=" + featDetails + ')'
        }

        @JvmOverloads
                /* synthetic */   constructor(
            str: String? = null,
            str2: String? = null,
            str3: String? = null,
            str4: String? = null,
            list: List? = null,
            resultFeatureDetails: ResultFeatureDetails? = null,
            i: Int = 63,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) null else str,
            if (i and 2 != 0) null else str2,
            if (i and 4 != 0) null else str3,
            if (i and 8 == 0) str4 else null,
            if (i and 16 != 0) CollectionsKt.emptyList<Any>() else list,
            if (i and 32 != 0) ResultFeatureDetails(
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                2047,
                null
            ) else resultFeatureDetails
        ) {
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                resultAttributes: ResultAttributes,
                str: String,
                str2: String,
                str3: String,
                str4: String,
                list: List,
                resultFeatureDetails: ResultFeatureDetails,
                i: Int,
                obj: Object?
            ): ResultAttributes {
                var str = str
                var str2 = str2
                var str3 = str3
                var str4 = str4
                var resultFeatureDetails = resultFeatureDetails
                if (i and 1 != 0) {
                    str = resultAttributes.subtitleId
                }
                if (i and 2 != 0) {
                    str2 = resultAttributes.language
                }
                val str5 = str2
                if (i and 4 != 0) {
                    str3 = resultAttributes.release
                }
                val str6 = str3
                if (i and 8 != 0) {
                    str4 = resultAttributes.url
                }
                val str7 = str4
                var list2: List<ResultFiles?> = list
                if (i and 16 != 0) {
                    list2 = resultAttributes.files
                }
                val list3: List = list2
                if (i and 32 != 0) {
                    resultFeatureDetails = resultAttributes.featDetails
                }
                return resultAttributes.copy(str, str5, str6, str7, list3, resultFeatureDetails)
            }
        }
    }

    /* compiled from: OpenSubtitlesApi.kt */
    @Metadata(
        m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000c\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/OpenSubtitlesApi\$ResultFiles;", "", "fileId", "", "fileName", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getFileId", "()Ljava/lang/Integer;", "setFileId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getFileName", "()Ljava/lang/String;", "setFileName", "(Ljava/lang/String;)V", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/lagradost/cloudstream3/syncproviders/providers/OpenSubtitlesApi\$ResultFiles;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class ResultFiles(
        @JsonProperty("file_id") num: Integer?,
        @JsonProperty("file_name") str: String?
    ) {
        private var fileId: Integer?
        var fileName: String?
        operator fun component1(): Integer? {
            return fileId
        }

        operator fun component2(): String? {
            return fileName
        }

        fun copy(
            @JsonProperty("file_id") num: Integer?,
            @JsonProperty("file_name") str: String?
        ): ResultFiles {
            return ResultFiles(num, str)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is ResultFiles) {
                val resultFiles = obj as ResultFiles
                return Intrinsics.areEqual(fileId, resultFiles.fileId) && Intrinsics.areEqual(
                    fileName, resultFiles.fileName
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val num: Integer? = fileId
            val hashCode = (if (num == null) 0 else num.hashCode()) * 31
            val str = fileName
            return hashCode + (str?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "ResultFiles(fileId=" + fileId + ", fileName=" + fileName + ')'
        }

        init {
            fileId = num
            fileName = str
        }

        @JvmOverloads
                /* synthetic */   constructor(
            num: Integer? = null,
            str: String? = null,
            i: Int = 3,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(if (i and 1 != 0) null else num, if (i and 2 != 0) null else str) {
        }

        fun getFileId(): Integer? {
            return fileId
        }

        fun setFileId(num: Integer?) {
            fileId = num
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                resultFiles: ResultFiles,
                num: Integer?,
                str: String?,
                i: Int,
                obj: Object?
            ): ResultFiles {
                var num: Integer? = num
                var str = str
                if (i and 1 != 0) {
                    num = resultFiles.fileId
                }
                if (i and 2 != 0) {
                    str = resultFiles.fileName
                }
                return resultFiles.copy(num, str)
            }
        }
    }

    /* compiled from: OpenSubtitlesApi.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jb\u0010&\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0006HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000c\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000f¨\u0006-"],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/OpenSubtitlesApi\$ResultDownloadLink;", "", "link", "", "fileName", "requests", "", "remaining", "message", "resetTime", "resetTimeUtc", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFileName", "()Ljava/lang/String;", "setFileName", "(Ljava/lang/String;)V", "getLink", "setLink", "getMessage", "setMessage", "getRemaining", "()Ljava/lang/Integer;", "setRemaining", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getRequests", "setRequests", "getResetTime", "setResetTime", "getResetTimeUtc", "setResetTimeUtc", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/lagradost/cloudstream3/syncproviders/providers/OpenSubtitlesApi\$ResultDownloadLink;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class ResultDownloadLink(
        @param:JsonProperty("link") var link: String?,
        @param:JsonProperty(
            "file_name"
        ) var fileName: String?,
        @JsonProperty("requests") num: Integer?,
        @JsonProperty("remaining") num2: Integer?,
        @JsonProperty("message") str3: String?,
        @JsonProperty("reset_time") str4: String?,
        @JsonProperty("reset_time_utc") str5: String?
    ) {
        var message: String?
        private var remaining: Integer?
        private var requests: Integer?
        var resetTime: String?
        var resetTimeUtc: String?
        operator fun component1(): String? {
            return link
        }

        operator fun component2(): String? {
            return fileName
        }

        operator fun component3(): Integer? {
            return requests
        }

        operator fun component4(): Integer? {
            return remaining
        }

        operator fun component5(): String? {
            return message
        }

        operator fun component6(): String? {
            return resetTime
        }

        operator fun component7(): String? {
            return resetTimeUtc
        }

        fun copy(
            @JsonProperty("link") str: String?,
            @JsonProperty("file_name") str2: String?,
            @JsonProperty("requests") num: Integer?,
            @JsonProperty("remaining") num2: Integer?,
            @JsonProperty("message") str3: String?,
            @JsonProperty("reset_time") str4: String?,
            @JsonProperty("reset_time_utc") str5: String?
        ): ResultDownloadLink {
            return ResultDownloadLink(str, str2, num, num2, str3, str4, str5)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is ResultDownloadLink) {
                val resultDownloadLink = obj as ResultDownloadLink
                return Intrinsics.areEqual(link, resultDownloadLink.link) && Intrinsics.areEqual(
                    fileName, resultDownloadLink.fileName
                ) && Intrinsics.areEqual(
                    requests, resultDownloadLink.requests
                ) && Intrinsics.areEqual(
                    remaining, resultDownloadLink.remaining
                ) && Intrinsics.areEqual(
                    message, resultDownloadLink.message
                ) && Intrinsics.areEqual(
                    resetTime, resultDownloadLink.resetTime
                ) && Intrinsics.areEqual(
                    resetTimeUtc, resultDownloadLink.resetTimeUtc
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val str = link
            val hashCode = (str?.hashCode() ?: 0) * 31
            val str2 = fileName
            val hashCode2 = (hashCode + (str2?.hashCode() ?: 0)) * 31
            val num: Integer? = requests
            val hashCode3: Int = (hashCode2 + if (num == null) 0 else num.hashCode()) * 31
            val num2: Integer? = remaining
            val hashCode4: Int = (hashCode3 + if (num2 == null) 0 else num2.hashCode()) * 31
            val str3 = message
            val hashCode5 = (hashCode4 + (str3?.hashCode() ?: 0)) * 31
            val str4 = resetTime
            val hashCode6 = (hashCode5 + (str4?.hashCode() ?: 0)) * 31
            val str5 = resetTimeUtc
            return hashCode6 + (str5?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "ResultDownloadLink(link=" + link + ", fileName=" + fileName + ", requests=" + requests + ", remaining=" + remaining + ", message=" + message + ", resetTime=" + resetTime + ", resetTimeUtc=" + resetTimeUtc + ')'
        }

        init {
            requests = num
            remaining = num2
            message = str3
            resetTime = str4
            resetTimeUtc = str5
        }

        @JvmOverloads
                /* synthetic */   constructor(
            str: String? = null,
            str2: String? = null,
            num: Integer? = null,
            num2: Integer? = null,
            str3: String? = null,
            str4: String? = null,
            str5: String? = null,
            i: Int = 127,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) null else str,
            if (i and 2 != 0) null else str2,
            if (i and 4 != 0) null else num,
            if (i and 8 != 0) null else num2,
            if (i and 16 != 0) null else str3,
            if (i and 32 != 0) null else str4,
            if (i and 64 != 0) null else str5
        ) {
        }

        fun getRequests(): Integer? {
            return requests
        }

        fun setRequests(num: Integer?) {
            requests = num
        }

        fun getRemaining(): Integer? {
            return remaining
        }

        fun setRemaining(num: Integer?) {
            remaining = num
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                resultDownloadLink: ResultDownloadLink,
                str: String?,
                str2: String?,
                num: Integer?,
                num2: Integer?,
                str3: String?,
                str4: String?,
                str5: String?,
                i: Int,
                obj: Object?
            ): ResultDownloadLink {
                var str = str
                var str2 = str2
                var num: Integer? = num
                var num2: Integer? = num2
                var str3 = str3
                var str4 = str4
                var str5 = str5
                if (i and 1 != 0) {
                    str = resultDownloadLink.link
                }
                if (i and 2 != 0) {
                    str2 = resultDownloadLink.fileName
                }
                val str6 = str2
                if (i and 4 != 0) {
                    num = resultDownloadLink.requests
                }
                val num3: Integer? = num
                if (i and 8 != 0) {
                    num2 = resultDownloadLink.remaining
                }
                val num4: Integer? = num2
                if (i and 16 != 0) {
                    str3 = resultDownloadLink.message
                }
                val str7 = str3
                if (i and 32 != 0) {
                    str4 = resultDownloadLink.resetTime
                }
                val str8 = str4
                if (i and 64 != 0) {
                    str5 = resultDownloadLink.resetTimeUtc
                }
                return resultDownloadLink.copy(str, str6, num3, num4, str7, str8, str5)
            }
        }
    }

    /* compiled from: OpenSubtitlesApi.kt */
    @Metadata(
        m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b3\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0092\u0001\u00106\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00107J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020\u0003HÖ\u0001J\t\u0010<\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001e\u0010\u0013R\u001c\u0010\u000c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001e\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b#\u0010\u0011\"\u0004\b$\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u001e\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b'\u0010\u0011\"\u0004\b(\u0010\u0013R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b)\u0010\u0011\"\u0004\b*\u0010\u0013¨\u0006="],
        m107d2 = ["Lcom/lagradost/cloudstream3/syncproviders/providers/OpenSubtitlesApi\$ResultFeatureDetails;", "", "year", "", "title", "", "movieName", "imdbId", "tmdbId", "seasonNumber", "episodeNumber", "parentImdbId", "parentTitle", "parentTmdbId", "parentFeatureId", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getEpisodeNumber", "()Ljava/lang/Integer;", "setEpisodeNumber", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getImdbId", "setImdbId", "getMovieName", "()Ljava/lang/String;", "setMovieName", "(Ljava/lang/String;)V", "getParentFeatureId", "setParentFeatureId", "getParentImdbId", "setParentImdbId", "getParentTitle", "setParentTitle", "getParentTmdbId", "setParentTmdbId", "getSeasonNumber", "setSeasonNumber", "getTitle", "setTitle", "getTmdbId", "setTmdbId", "getYear", "setYear", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/lagradost/cloudstream3/syncproviders/providers/OpenSubtitlesApi\$ResultFeatureDetails;", "equals", "", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class ResultFeatureDetails(
        @JsonProperty("year") num: Integer?,
        @JsonProperty("title") str: String?,
        @JsonProperty("movie_name") str2: String?,
        @JsonProperty("imdb_id") num2: Integer?,
        @JsonProperty("tmdb_id") num3: Integer?,
        @JsonProperty("season_number") num4: Integer?,
        @JsonProperty("episode_number") num5: Integer?,
        @JsonProperty("parent_imdb_id") num6: Integer?,
        @JsonProperty("parent_title") str3: String?,
        @JsonProperty("parent_tmdb_id") num7: Integer?,
        @JsonProperty("parent_feature_id") num8: Integer?
    ) {
        private var episodeNumber: Integer?
        private var imdbId: Integer?
        var movieName: String?
        private var parentFeatureId: Integer?
        private var parentImdbId: Integer?
        var parentTitle: String?
        private var parentTmdbId: Integer?
        private var seasonNumber: Integer?
        var title: String?
        private var tmdbId: Integer?
        private var year: Integer?
        operator fun component1(): Integer? {
            return year
        }

        operator fun component10(): Integer? {
            return parentTmdbId
        }

        operator fun component11(): Integer? {
            return parentFeatureId
        }

        operator fun component2(): String? {
            return title
        }

        operator fun component3(): String? {
            return movieName
        }

        operator fun component4(): Integer? {
            return imdbId
        }

        operator fun component5(): Integer? {
            return tmdbId
        }

        operator fun component6(): Integer? {
            return seasonNumber
        }

        operator fun component7(): Integer? {
            return episodeNumber
        }

        operator fun component8(): Integer? {
            return parentImdbId
        }

        operator fun component9(): String? {
            return parentTitle
        }

        fun copy(
            @JsonProperty("year") num: Integer?,
            @JsonProperty("title") str: String?,
            @JsonProperty("movie_name") str2: String?,
            @JsonProperty("imdb_id") num2: Integer?,
            @JsonProperty("tmdb_id") num3: Integer?,
            @JsonProperty("season_number") num4: Integer?,
            @JsonProperty("episode_number") num5: Integer?,
            @JsonProperty("parent_imdb_id") num6: Integer?,
            @JsonProperty("parent_title") str3: String?,
            @JsonProperty("parent_tmdb_id") num7: Integer?,
            @JsonProperty("parent_feature_id") num8: Integer?
        ): ResultFeatureDetails {
            return ResultFeatureDetails(
                num,
                str,
                str2,
                num2,
                num3,
                num4,
                num5,
                num6,
                str3,
                num7,
                num8
            )
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is ResultFeatureDetails) {
                val resultFeatureDetails = obj as ResultFeatureDetails
                return Intrinsics.areEqual(year, resultFeatureDetails.year) && Intrinsics.areEqual(
                    title, resultFeatureDetails.title
                ) && Intrinsics.areEqual(
                    movieName, resultFeatureDetails.movieName
                ) && Intrinsics.areEqual(
                    imdbId, resultFeatureDetails.imdbId
                ) && Intrinsics.areEqual(
                    tmdbId, resultFeatureDetails.tmdbId
                ) && Intrinsics.areEqual(
                    seasonNumber, resultFeatureDetails.seasonNumber
                ) && Intrinsics.areEqual(
                    episodeNumber, resultFeatureDetails.episodeNumber
                ) && Intrinsics.areEqual(
                    parentImdbId, resultFeatureDetails.parentImdbId
                ) && Intrinsics.areEqual(
                    parentTitle, resultFeatureDetails.parentTitle
                ) && Intrinsics.areEqual(
                    parentTmdbId, resultFeatureDetails.parentTmdbId
                ) && Intrinsics.areEqual(
                    parentFeatureId, resultFeatureDetails.parentFeatureId
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val num: Integer? = year
            val hashCode = (if (num == null) 0 else num.hashCode()) * 31
            val str = title
            val hashCode2 = (hashCode + (str?.hashCode() ?: 0)) * 31
            val str2 = movieName
            val hashCode3 = (hashCode2 + (str2?.hashCode() ?: 0)) * 31
            val num2: Integer? = imdbId
            val hashCode4: Int = (hashCode3 + if (num2 == null) 0 else num2.hashCode()) * 31
            val num3: Integer? = tmdbId
            val hashCode5: Int = (hashCode4 + if (num3 == null) 0 else num3.hashCode()) * 31
            val num4: Integer? = seasonNumber
            val hashCode6: Int = (hashCode5 + if (num4 == null) 0 else num4.hashCode()) * 31
            val num5: Integer? = episodeNumber
            val hashCode7: Int = (hashCode6 + if (num5 == null) 0 else num5.hashCode()) * 31
            val num6: Integer? = parentImdbId
            val hashCode8: Int = (hashCode7 + if (num6 == null) 0 else num6.hashCode()) * 31
            val str3 = parentTitle
            val hashCode9 = (hashCode8 + (str3?.hashCode() ?: 0)) * 31
            val num7: Integer? = parentTmdbId
            val hashCode10: Int = (hashCode9 + if (num7 == null) 0 else num7.hashCode()) * 31
            val num8: Integer? = parentFeatureId
            return hashCode10 + if (num8 != null) num8.hashCode() else 0
        }

        override fun toString(): String {
            return "ResultFeatureDetails(year=" + year + ", title=" + title + ", movieName=" + movieName + ", imdbId=" + imdbId + ", tmdbId=" + tmdbId + ", seasonNumber=" + seasonNumber + ", episodeNumber=" + episodeNumber + ", parentImdbId=" + parentImdbId + ", parentTitle=" + parentTitle + ", parentTmdbId=" + parentTmdbId + ", parentFeatureId=" + parentFeatureId + ')'
        }

        init {
            year = num
            title = str
            movieName = str2
            imdbId = num2
            tmdbId = num3
            seasonNumber = num4
            episodeNumber = num5
            parentImdbId = num6
            parentTitle = str3
            parentTmdbId = num7
            parentFeatureId = num8
        }

        @JvmOverloads
                /* synthetic */   constructor(
            num: Integer? = null,
            str: String? = null,
            str2: String? = null,
            num2: Integer? = null,
            num3: Integer? = null,
            num4: Integer? = null,
            num5: Integer? = null,
            num6: Integer? = null,
            str3: String? = null,
            num7: Integer? = null,
            num8: Integer? = null,
            i: Int = 2047,
            defaultConstructorMarker: DefaultConstructorMarker? = null
        ) : this(
            if (i and 1 != 0) null else num,
            if (i and 2 != 0) null else str,
            if (i and 4 != 0) null else str2,
            if (i and 8 != 0) null else num2,
            if (i and 16 != 0) null else num3,
            if (i and 32 != 0) null else num4,
            if (i and 64 != 0) null else num5,
            if (i and 128 != 0) null else num6,
            if (i and 256 != 0) null else str3,
            if (i and 512 != 0) null else num7,
            if (i and 1024 == 0) num8 else null
        ) {
        }

        fun getYear(): Integer? {
            return year
        }

        fun setYear(num: Integer?) {
            year = num
        }

        fun getImdbId(): Integer? {
            return imdbId
        }

        fun setImdbId(num: Integer?) {
            imdbId = num
        }

        fun getTmdbId(): Integer? {
            return tmdbId
        }

        fun setTmdbId(num: Integer?) {
            tmdbId = num
        }

        fun getSeasonNumber(): Integer? {
            return seasonNumber
        }

        fun setSeasonNumber(num: Integer?) {
            seasonNumber = num
        }

        fun getEpisodeNumber(): Integer? {
            return episodeNumber
        }

        fun setEpisodeNumber(num: Integer?) {
            episodeNumber = num
        }

        fun getParentImdbId(): Integer? {
            return parentImdbId
        }

        fun setParentImdbId(num: Integer?) {
            parentImdbId = num
        }

        fun getParentTmdbId(): Integer? {
            return parentTmdbId
        }

        fun setParentTmdbId(num: Integer?) {
            parentTmdbId = num
        }

        fun getParentFeatureId(): Integer? {
            return parentFeatureId
        }

        fun setParentFeatureId(num: Integer?) {
            parentFeatureId = num
        }
    }

    companion object {
        val Companion = Companion(null)
        const val OPEN_SUBTITLES_USER_KEY = "open_subtitles_user"
        const val TAG = "OPENSUBS"
        const val apiKey = "uyBLgFD17MgrYmA0gSXoKllMJBelOYj2"
        const val coolDownDuration: Long = 30000
        private const val currentCoolDown: Long = 0
        private val currentSession: SubtitleOAuthEntity? = null
        const val host = "https://api.opensubtitles.com/api/v1"
    }
}