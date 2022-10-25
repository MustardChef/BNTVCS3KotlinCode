package com.phimhd

import android.content.res.Configuration
import kotlin.jvm.internal.Intrinsics

/* compiled from: AdsActivity.kt */
@Metadata(
    m108d1 = ["\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\n\u0010\u0010\u001a\u0004\u0018\u00010\rH&J\b\u0010\u0011\u001a\u00020\u000fH\u0014J\b\u0010\u0012\u001a\u00020\u000fH\u0014J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0014J\b\u0010\u0017\u001a\u00020\u000fH\u0016J\b\u0010\u0018\u001a\u00020\u000fH\u0016J\b\u0010\u0019\u001a\u00020\u000fH\u0016J\b\u0010\u001a\u001a\u00020\u000fH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"],
    m107d2 = ["Lcom/phimhd/AdsActivity;", "Lcom/phimhd/BaseActivity;", "()V", "countDownTimer30MinAds", "Landroid/os/CountDownTimer;", "countDownTimerAds", "mInterstitialAd", "Lcom/applovin/mediation/ads/MaxInterstitialAd;", "mInterstitialDownloadAd", "retryAttemptFullScreen", "", "retryAttemptFullScreenDownload", "tvTimeAds", "Landroid/widget/TextView;", "initAds", "", "initTvTimeCountdonwAds", "initVariables", "initViews", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onDestroy", "releaseCountdownAds", "showFullscreenAds", "showFullscreenDownloadAds", "startCountDownAds", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes4.dex */
abstract class AdsActivity : BaseActivity() {
    override var `_$_findViewCache`: Map<Integer, View> = LinkedHashMap()
    private var countDownTimer30MinAds: CountDownTimer? = null
    private var countDownTimerAds: CountDownTimer? = null
    var mInterstitialAd: MaxInterstitialAd? = null
    var mInterstitialDownloadAd: MaxInterstitialAd? = null
    val retryAttemptFullScreen = 0
    val retryAttemptFullScreenDownload = 0
    private var tvTimeAds: TextView? = null

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

    abstract fun initTvTimeCountdonwAds(): TextView?

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.phimhd.BaseActivity
    public override fun initViews() {
        tvTimeAds = initTvTimeCountdonwAds()
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.phimhd.BaseActivity
    public override fun initVariables() {
        initAds()
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    override fun onConfigurationChanged(newConfig: Configuration) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig")
        super.onConfigurationChanged(newConfig)
        if (newConfig.orientation === 2 || newConfig.orientation === 1) {
            val maxInterstitialAd: MaxInterstitialAd? = mInterstitialAd
            if (maxInterstitialAd != null) {
                maxInterstitialAd.loadAd()
            }
            Log.d("DuongKK", "Start Load Ad INTER")
        }
    }

    protected fun initAds() {
        val adsActivity = this
        mInterstitialAd =
            MaxInterstitialAd(Constants.APPLOVIN_UNIT_ID_ADS_INTERSTITIAL_MOVIE, adsActivity)
        mInterstitialDownloadAd = MaxInterstitialAd("f6489886b41a475c", adsActivity)
        val maxInterstitialAd: MaxInterstitialAd? = mInterstitialAd
        Intrinsics.checkNotNull(maxInterstitialAd)
        maxInterstitialAd.setListener(`AdsActivity$initAds$1`(this))
        val maxInterstitialAd2: MaxInterstitialAd? = mInterstitialDownloadAd
        Intrinsics.checkNotNull(maxInterstitialAd2)
        maxInterstitialAd2.setListener(`AdsActivity$initAds$2`(this))
        countDownTimerAds = object : CountDownTimer() {
            // from class: com.phimhd.AdsActivity$initAds$3
            /* JADX INFO: Access modifiers changed from: package-private */
            init {
                super(300000L, 1000L)
            }

            @Override // android.os.CountDownTimer
            fun onTick(j: Long) {
                val textView: TextView?
                val textView2: TextView
                val textView3: TextView?
                val i = j.toInt() / 1000
                Log.d("du", "Sec $i")
                if (i <= 5) {
                    textView = tvTimeAds
                    if (textView != null) {
                        textView2 = tvTimeAds
                        Intrinsics.checkNotNull(textView2)
                        textView2.setVisibility(0)
                        textView3 = tvTimeAds
                        Intrinsics.checkNotNull(textView3)
                        textView3.setText(
                            this@AdsActivity.getString(
                                R.string.ads_will_show_after,
                                arrayOf<Object>(Integer.valueOf(i))
                            )
                        )
                    }
                }
            }

            @Override // android.os.CountDownTimer
            fun onFinish() {
                val textView: TextView?
                val countDownTimer: CountDownTimer?
                val textView2: TextView
                textView = tvTimeAds
                if (textView != null) {
                    textView2 = tvTimeAds
                    Intrinsics.checkNotNull(textView2)
                    textView2.setVisibility(4)
                }
                LogUtils.m6080d("onFinish countDownTimerAds- WEB EMBED", *arrayOfNulls<Object>(0))
                showFullscreenAds()
                countDownTimer = countDownTimer30MinAds
                Intrinsics.checkNotNull(countDownTimer)
                countDownTimer.start()
            }
        }
        countDownTimer30MinAds = object : CountDownTimer() {
            // from class: com.phimhd.AdsActivity$initAds$4
            /* JADX INFO: Access modifiers changed from: package-private */
            init {
                super(Constants.TIME_30MIN_TO_SHOW_ADS, 1000L)
            }

            @Override // android.os.CountDownTimer
            fun onTick(j: Long) {
                val textView: TextView?
                val textView2: TextView
                val textView3: TextView?
                val i = j.toInt() / 1000
                if (i <= 5) {
                    textView = tvTimeAds
                    if (textView != null) {
                        textView2 = tvTimeAds
                        Intrinsics.checkNotNull(textView2)
                        textView2.setVisibility(0)
                        textView3 = tvTimeAds
                        Intrinsics.checkNotNull(textView3)
                        textView3.setText("Quảng cáo sẽ xuất hiện sau " + i + 's')
                    }
                }
            }

            @Override // android.os.CountDownTimer
            fun onFinish() {
                val textView: TextView?
                val countDownTimer: CountDownTimer?
                val textView2: TextView
                textView = tvTimeAds
                if (textView != null) {
                    textView2 = tvTimeAds
                    Intrinsics.checkNotNull(textView2)
                    textView2.setVisibility(4)
                }
                LogUtils.m6080d(
                    "onFinish countDownTimer30MinAds- WEB EMBED",
                    *arrayOfNulls<Object>(0)
                )
                showFullscreenAds()
                countDownTimer = countDownTimer30MinAds
                Intrinsics.checkNotNull(countDownTimer)
                countDownTimer.start()
            }
        }
        val maxInterstitialAd3: MaxInterstitialAd? = mInterstitialAd
        if (maxInterstitialAd3 != null) {
            maxInterstitialAd3.loadAd()
        }
        Log.d("DuongKK", "Start Load Ad INTER")
    }

    fun showFullscreenAds() {
        val maxInterstitialAd: MaxInterstitialAd? = mInterstitialAd
        if (maxInterstitialAd != null) {
            Intrinsics.checkNotNull(maxInterstitialAd)
            if (maxInterstitialAd.isReady()) {
                LogUtils.m6080d("showFullscreenAds - WEB EMBED", *arrayOfNulls<Object>(0))
                val maxInterstitialAd2: MaxInterstitialAd? = mInterstitialAd
                if (maxInterstitialAd2 != null) {
                    maxInterstitialAd2.showAd()
                    return
                }
                return
            }
        }
        LogUtils.m6080d("Ads fullscreen not load yet", *arrayOfNulls<Object>(0))
    }

    fun showFullscreenDownloadAds() {
        val maxInterstitialAd: MaxInterstitialAd? = mInterstitialDownloadAd
        if (maxInterstitialAd != null) {
            Intrinsics.checkNotNull(maxInterstitialAd)
            if (maxInterstitialAd.isReady()) {
                LogUtils.m6080d("DuongKK", "showFullscreenAds mInterstitialDownloadAd - WEB EMBED")
                val maxInterstitialAd2: MaxInterstitialAd? = mInterstitialDownloadAd
                if (maxInterstitialAd2 != null) {
                    maxInterstitialAd2.showAd()
                    return
                }
                return
            }
        }
        LogUtils.m6080d("DuongKK", "Ads fullscreen mInterstitialDownloadAd not load yet")
    }

    fun startCountDownAds() {
        if (countDownTimerAds != null) {
            val companion: AppController = AppController.Companion.Companion.getInstance()
            if ((if (companion != null) companion.key else null) != null) {
                val companion2: AppController = AppController.Companion.Companion.getInstance()
                val key = if (companion2 != null) companion2.key else null
                if (key == null || !key.isExpired) {
                    return
                }
                val countDownTimer: CountDownTimer? = countDownTimer30MinAds
                if (countDownTimer != null && countDownTimer != null) {
                    countDownTimer.cancel()
                }
                val countDownTimer2: CountDownTimer? = countDownTimerAds
                if (countDownTimer2 != null) {
                    countDownTimer2.start()
                }
                Log.d("DuongKK", "start Countdownads")
                return
            }
            val countDownTimer3: CountDownTimer? = countDownTimer30MinAds
            if (countDownTimer3 != null && countDownTimer3 != null) {
                countDownTimer3.cancel()
            }
            val countDownTimer4: CountDownTimer? = countDownTimerAds
            if (countDownTimer4 != null) {
                countDownTimer4.start()
            }
            Log.d("DuongKK", "start Countdownads")
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.phimhd.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    override fun onDestroy() {
        releaseCountdownAds()
        super.onDestroy()
    }

    fun releaseCountdownAds() {
        val countDownTimer: CountDownTimer? = countDownTimer30MinAds
        if (countDownTimer != null && countDownTimer != null) {
            countDownTimer.cancel()
        }
        val countDownTimer2: CountDownTimer? = countDownTimerAds
        if (countDownTimer2 != null && countDownTimer2 != null) {
            countDownTimer2.cancel()
        }
        Log.d("DuongKK", "Release Countdownads")
    }
}