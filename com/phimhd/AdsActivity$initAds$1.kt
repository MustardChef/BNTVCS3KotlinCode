package com.phimhd

import android.os.Handler
import kotlin.jvm.internal.Intrinsics

/* compiled from: AdsActivity.kt */
@Metadata(
    m108d1 = ["\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000f"],
    m107d2 = ["com/phimhd/AdsActivity\$initAds$1", "Lcom/applovin/mediation/MaxAdListener;", "onAdClicked", "", "ad", "Lcom/applovin/mediation/MaxAd;", "onAdDisplayFailed", "error", "Lcom/applovin/mediation/MaxError;", "onAdDisplayed", "onAdHidden", "onAdLoadFailed", "adUnitId", "", "onAdLoaded", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class `AdsActivity$initAds$1`     /* JADX INFO: Access modifiers changed from: package-private */(  /* synthetic */
    val `this$0`: AdsActivity
) : MaxAdListener {
    @Override // com.applovin.mediation.MaxAdListener
    override fun onAdClicked(ad: MaxAd) {
        Intrinsics.checkNotNullParameter(ad, "ad")
    }

    @Override // com.applovin.mediation.MaxAdListener
    override fun onAdDisplayed(ad: MaxAd) {
        Intrinsics.checkNotNullParameter(ad, "ad")
    }

    @Override // com.applovin.mediation.MaxAdListener
    override fun onAdLoaded(ad: MaxAd) {
        Intrinsics.checkNotNullParameter(ad, "ad")
        `this$0`.retryAttemptFullScreen = 0
        Log.d("DuongKK", "LOADED ADS INTER")
    }

    @Override // com.applovin.mediation.MaxAdListener
    override fun onAdHidden(ad: MaxAd) {
        val maxInterstitialAd: MaxInterstitialAd?
        Intrinsics.checkNotNullParameter(ad, "ad")
        maxInterstitialAd = `this$0`.mInterstitialAd
        if (maxInterstitialAd != null) {
            maxInterstitialAd.loadAd()
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    override fun onAdLoadFailed(adUnitId: String, error: MaxError) {
        val i: Int
        val i2: Int
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId")
        Intrinsics.checkNotNullParameter(error, "error")
        val adsActivity = `this$0`
        i = adsActivity.retryAttemptFullScreen
        adsActivity.retryAttemptFullScreen = i + 1
        val timeUnit: TimeUnit = TimeUnit.SECONDS
        i2 = `this$0`.retryAttemptFullScreen
        val millis: Long = timeUnit.toMillis(Math.pow(2.0, Math.min(6, i2)) as Long)
        val handler = Handler()
        val adsActivity2 = `this$0`
        handler.postDelayed(object : Runnable() {
            // from class: com.phimhd.-$$Lambda$AdsActivity$initAds$1$AwiPelOVVQaAqinPixFUAUirhbw
            @Override // java.lang.Runnable
            fun run() {
                `m9031onAdLoadFailed$lambda0`(this@AdsActivity)
            }
        }, millis)
        Log.d("DuongKK", "LOADED FAIL INTER " + error.getMessage())
    }

    @Override // com.applovin.mediation.MaxAdListener
    override fun onAdDisplayFailed(ad: MaxAd, error: MaxError) {
        val maxInterstitialAd: MaxInterstitialAd?
        Intrinsics.checkNotNullParameter(ad, "ad")
        Intrinsics.checkNotNullParameter(error, "error")
        maxInterstitialAd = `this$0`.mInterstitialAd
        if (maxInterstitialAd != null) {
            maxInterstitialAd.loadAd()
        }
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: private */ /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
        r1 = r1.mInterstitialAd;
     */
        /* renamed from: onAdLoadFailed$lambda-0  reason: not valid java name */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
        fun `m9031onAdLoadFailed$lambda0`(r1: AdsActivity?) {
            /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            com.applovin.mediation.ads.MaxInterstitialAd r0 = com.phimhd.AdsActivity.access$getMInterstitialAd$p(r1)
            if (r0 == 0) goto L14
            com.applovin.mediation.ads.MaxInterstitialAd r1 = com.phimhd.AdsActivity.access$getMInterstitialAd$p(r1)
            if (r1 == 0) goto L14
            r1.loadAd()
        L14:
            return
        */
            throw UnsupportedOperationException("Method not decompiled: com.phimhd.AdsActivity\$initAds$1.m9031onAdLoadFailed\$lambda0(com.phimhd.AdsActivity):void")
        }
    }
}