package com.phimhd

import com.blankj.utilcode.util.Utils
import java.util.List
import kotlin.jvm.internal.Intrinsics

/* compiled from: AppController.kt */
@Metadata(
    m108d1 = ["\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 ?2\u00020\u0001:\u0001?B\u0005¢\u0006\u0002\u0010\u0002J\b\u00109\u001a\u0004\u0018\u00010\nJ\u0006\u0010:\u001a\u00020&J\b\u0010;\u001a\u00020<H\u0016J\u0010\u0010=\u001a\u00020<2\b\u00106\u001a\u0004\u0018\u000105J\u0010\u0010>\u001a\u00020<2\b\u0010'\u001a\u0004\u0018\u00010\nR*\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\n8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u000c\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010(\u001a\u0004\u0018\u00010)2\b\u0010(\u001a\u0004\u0018\u00010)@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00106\u001a\u0004\u0018\u0001052\b\u00104\u001a\u0004\u0018\u000105@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b7\u00108¨\u0006@"],
    m107d2 = ["Lcom/phimhd/AppController;", "Lcom/lagradost/cloudstream3/AcraApplication;", "()V", "config", "Lcom/phimhd/Config;", "getConfig", "()Lcom/phimhd/Config;", "setConfig", "(Lcom/phimhd/Config;)V", "fid", "", "getFid", "()Ljava/lang/String;", "setFid", "(Ljava/lang/String;)V", "homePageLiveTv", "Lcom/lagradost/cloudstream3/HomePageList;", "getHomePageLiveTv", "()Lcom/lagradost/cloudstream3/HomePageList;", "setHomePageLiveTv", "(Lcom/lagradost/cloudstream3/HomePageList;)V", SDKConstants.PARAM_KEY, "Lcom/phimhd/Key;", "getKey", "()Lcom/phimhd/Key;", "setKey", "(Lcom/phimhd/Key;)V", "listBannerHome", "", "Lcom/phimhd/Banner;", "getListBannerHome", "()Ljava/util/List;", "setListBannerHome", "(Ljava/util/List;)V", "listHomeConfigCollection", "getListHomeConfigCollection", "setListHomeConfigCollection", "mSetting", "Lcom/blankj/utilcode/util/SPUtils;", "tokenFCM", "user", "Lcom/phimhd/User;", "getUser", "()Lcom/phimhd/User;", "setUser", "(Lcom/phimhd/User;)V", "vastAdded", "", "getVastAdded", "()Z", "setVastAdded", "(Z)V", "<set-?>", "Lcom/phimhd/Version;", ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, "getVersion", "()Lcom/phimhd/Version;", "getTokenFCM", "getmSetting", "onCreate", "", "setNewVersion", "setTokenFCM", "Companion", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class AppController : AcraApplication() {
    var config: Config? = null
        get() {
            val sPUtils: SPUtils? = mSetting
            Intrinsics.checkNotNull(sPUtils)
            if (sPUtils.getString("config") != null) {
                val sPUtils2: SPUtils? = mSetting
                Intrinsics.checkNotNull(sPUtils2)
                val configStr: String = sPUtils2.getString("config")
                Intrinsics.checkNotNullExpressionValue(configStr, "configStr")
                return if (configStr.length() === 0) {
                    null
                } else Gson().fromJson<Any>(
                    configStr,
                    Config::class.java as Class<Object?>?
                )
            }
            return null
        }
        set(config) {
            field = config
            if (config != null) {
                getmSetting().put("config", Gson().toJson(config))
            } else {
                getmSetting().remove("config")
            }
        }
    var fid: String? = null
        get() {
            LogUtils.m6080d("Fid: $field", *arrayOfNulls<Object>(0))
            return field
        }
    var homePageLiveTv: HomePageList? = null
    var key: Key? = null
        get() {
            var string: String
            if (field == null && getmSetting().getString(SDKConstants.PARAM_KEY)
                    .also { string = it } != null
            ) {
                if (!(string.length() === 0)) {
                    field = Gson().fromJson<Any>(string, Key::class.java as Class<Object?>?)
                }
            }
            return field
        }
        set(key) {
            field = key
            if (key != null) {
                getmSetting().put(SDKConstants.PARAM_KEY, Gson().toJson(key))
            } else {
                getmSetting().remove(SDKConstants.PARAM_KEY)
            }
        }
    var listBannerHome: List<Banner>? = null
    var listHomeConfigCollection: List<HomePageList>? = null
    private var mSetting: SPUtils? = null
    private var tokenFCM: String? = null
    var user: User? = null
        set(user) {
            field = user
            getmSetting().put("user", Gson().toJson(user))
            if (user == null || user.getKey() == null || key != null) {
                return
            }
            key = user.getKey()
        }
    var vastAdded = false
    var version: Version? = null
        private set

    @Override // com.lagradost.cloudstream3.AcraApplication, android.app.Application
    override fun onCreate() {
        super.onCreate()
        AppController.Companion.instance = this
        val appController = this
        Utils.init(appController)
        FacebookSdk.sdkInitialize(appController)
        mSetting = SPUtils("setting")
        val string: String = getmSetting().getString(SDKConstants.PARAM_KEY)
        if (string != null) {
            if (!(string.length() === 0)) {
                key = Gson().fromJson<Any>(string, Key::class.java as Class<Object?>?)
            }
        }
        val string2: String = getmSetting().getString("user")
        if (string2 != null) {
            if (!(string2.length() === 0)) {
                user = Gson().fromJson<Any>(string2, User::class.java as Class<Object?>?)
            }
        }
        tokenFCM = getmSetting().getString("tokenFCM")
        AppLovinSdk.getInstance(appController).setMediationProvider(AppLovinMediationProvider.MAX)
        AppLovinSdk.initializeSdk(
            appController,
            `$$Lambda$AppController$n3oMObSP4iuyVxCugFCRuwa4Yzs`.Companion.INSTANCE
        )
    }

    fun getmSetting(): SPUtils? {
        if (mSetting == null) {
            mSetting = SPUtils("setting")
        }
        val sPUtils: SPUtils? = mSetting
        Intrinsics.checkNotNull(sPUtils)
        return sPUtils
    }

    fun setNewVersion(version: Version?) {
        this.version = version
    }

    fun setTokenFCM(str: String?) {
        tokenFCM = str
        getmSetting().put("tokenFCM", str)
    }

    fun getTokenFCM(): String? {
        return tokenFCM
    }

    /* compiled from: AppController.kt */
    @Metadata(
        m108d1 = ["\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R$\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"],
        m107d2 = ["Lcom/phimhd/AppController\$Companion;", "", "()V", "<set-?>", "Lcom/phimhd/AppController;", "instance", "getInstance", "()Lcom/phimhd/AppController;", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        @get:Synchronized
        val instance: AppController
            get() = AppController.Companion.instance
    }

    companion object {
        val Companion = Companion(null)
        private val instance: AppController? = null

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onCreate$lambda-0  reason: not valid java name */
        fun `m9033onCreate$lambda0`(appLovinSdkConfiguration: AppLovinSdkConfiguration?) {}
    }
}