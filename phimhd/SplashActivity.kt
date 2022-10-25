package com.phimhd

import android.content.Context
import retrofit2.Call
import retrofit2.Response
import kotlin.jvm.internal.Intrinsics

/* compiled from: SplashActivity.kt */
@Metadata(
    m108d1 = ["\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\u0006\u0010\u000c\u001a\u00020\bJ\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\bH\u0014J\b\u0010\u0010\u001a\u00020\bH\u0014J\u0010\u0010\u0011\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\nJ\u0006\u0010\u0014\u001a\u00020\bJ\b\u0010\u0015\u001a\u00020\bH\u0002J\u0012\u0010\u0016\u001a\u00020\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0006\u0010\u0019\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001b"],
    m107d2 = ["Lcom/phimhd/SplashActivity;", "Lcom/phimhd/BaseActivity;", "()V", "myContext", "Landroid/content/Context;", "getMyContext", "()Landroid/content/Context;", "getConfigApi", "", "url", "", "getCurrentLocale", "hiddenProgress", "initLayout", "", "initVariables", "initViews", "onError", "message", "onErrorApi", "onErrorAuthorization", "onFailGetConfig", "onSuccessGetConfig", "config", "Lcom/phimhd/Config;", "showProgress", "Companion", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class SplashActivity : BaseActivity() {
    override var `_$_findViewCache`: Map<Integer, View> = LinkedHashMap()

    @Override // com.phimhd.BaseActivity
    override fun `_$_clearFindViewByIdCache`() {
        this.`_$_findViewCache`.clear()
    }

    @Override // com.phimhd.BaseActivity
    override fun `_$_findCachedViewById`(i: Int): View? {
        val map: Map<Integer?, View?>? = this.`_$_findViewCache`
        val view: View? = map!![Integer.valueOf(i)]
        if (view == null) {
            val findViewById: View = findViewById<View>(i)
            if (findViewById != null) {
                map.put(Integer.valueOf(i), findViewById)
                return findViewById
            }
            return null
        }
        return view
    }

    fun hiddenProgress() {}

    @Override // com.phimhd.BaseActivity
    override fun initLayout(): Int {
        return R.layout.splash_activity
    }

    fun onError(str: String?) {}
    fun onErrorApi(str: String?) {}
    fun onErrorAuthorization() {}
    fun showProgress() {}

    /* compiled from: SplashActivity.kt */
    @Metadata(
        m108d1 = ["\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"],
        m107d2 = ["Lcom/phimhd/SplashActivity\$Companion;", "", "()V", "BYPASS", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}
    }

    private val currentLocale: String
        private get() {
            var locale: Locale
            val configuration: Configuration = resources.getConfiguration()
            val language: String? = if (configuration == null || configuration.locale.also {
                    locale = it
                } == null) null else locale.getLanguage()
            return language ?: "en"
        }

    @Override // com.phimhd.BaseActivity
    override fun initVariables() {
        val str: String
        val currentLocale = currentLocale
        str = if (Intrinsics.areEqual(
                currentLocale,
                "vi"
            ) || Intrinsics.areEqual(currentLocale, "en")
        ) {
            "https://raw.githubusercontent.com/cinehubwork/abc/master/config_$currentLocale.json"
        } else {
            "https://raw.githubusercontent.com/cinehubwork/abc/master/config_en.json"
        }
        LogUtils.m6080d("DuongKK", str)
        getConfigApi(str)
    }

    private fun getConfigApi(str: String) {
        ApiUtils().createApi().getConfig(str).enqueue(object : CallBackBase<Config?>() {
            // from class: com.phimhd.SplashActivity$getConfigApi$1
            @Override // com.lagradost.cloudstream3.services.CallBackBase
            override fun onRequestSuccess(call: Call<Config>?, response: Response<Config>?) {
                var unit: Unit = null
                if (response != null) {
                    val splashActivity = this@SplashActivity
                    if (!response.isSuccessful) {
                        splashActivity.onFailGetConfig()
                    } else {
                        val body = response.body()
                        if (body != null) {
                            LogUtils.m6080d("Du", body.toString())
                            val f = body.version
                            if (!body.approvedApp) {
                                splashActivity.onFailGetConfig()
                            } else {
                                val companion: AppController =
                                    AppController.Companion.Companion.getInstance()
                                if (companion != null) {
                                    companion.config = body
                                }
                                val companion2: AppController =
                                    AppController.Companion.Companion.getInstance()
                                if (companion2 != null) {
                                    companion2.setListBannerHome(body.getListBanners())
                                }
                                splashActivity.onSuccessGetConfig(body)
                            }
                            unit = Unit.INSTANCE
                        }
                        if (unit == null) {
                            splashActivity.onFailGetConfig()
                        }
                    }
                    unit = Unit.INSTANCE
                }
                if (unit == null) {
                    onFailGetConfig()
                }
            }

            @Override // com.lagradost.cloudstream3.services.CallBackBase
            override fun onRequestFailure(call: Call<Config>?, th: Throwable?) {
                val sb = StringBuilder()
                sb.append("Error ")
                sb.append(th?.getMessage())
                LogUtils.m6078e(sb.toString(), arrayOfNulls<Object>(0))
                onFailGetConfig()
            }
        })
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun onFailGetConfig() {
        val intent = Intent(this, ServerMaintenanceActivity::class.java)
        val stringExtra: String = getIntent().getStringExtra("jsonData")
        if (stringExtra != null) {
            intent.putExtra("jsonData", stringExtra)
        }
        startActivity(intent)
        finish()
    }

    @Override // com.phimhd.BaseActivity
    override fun initViews() {
        val textView: TextView? = `_$_findCachedViewById`(C4761R.C4764id.tvVersion) as TextView?
        Intrinsics.checkNotNull(textView)
        textView.setText(getString(R.string.version) + " 5.6.84")
    }

    fun onSuccessGetConfig(config: Config?) {
        val intent = Intent(this, MainActivity::class.java)
        val stringExtra: String = getIntent().getStringExtra("jsonData")
        if (stringExtra != null) {
            intent.putExtra("jsonData", stringExtra)
        }
        startActivity(intent)
        finish()
    }

    val myContext: Context
        get() = this

    companion object {
        const val BYPASS = true
        val Companion = Companion(null)
        fun  /* synthetic */`onSuccessGetConfig$default`(
            splashActivity: SplashActivity,
            config: Config?,
            i: Int,
            obj: Object?
        ) {
            var config = config
            if (i and 1 != 0) {
                config = null
            }
            splashActivity.onSuccessGetConfig(config)
        }
    }
}