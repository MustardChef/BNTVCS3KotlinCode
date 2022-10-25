package com.lagradost.cloudstream3.p041ui.player

import java.security.cert.X509Certificate

/* compiled from: SSLTrustManager.kt */
@Metadata(
    m108d1 = ["\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042\u0010\u0010\u0005\u001a\u000c\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0002\u0010\nJ)\u0010\u000b\u001a\u00020\u00042\u0010\u0010\u0005\u001a\u000c\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0002\u0010\nJ\u0013\u0010\u000c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0002\u0010\r¨\u0006\u000e"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/player/SSLTrustManager;", "Ljavax/net/ssl/X509TrustManager;", "()V", "checkClientTrusted", "", "p0", "", "Ljava/security/cert/X509Certificate;", "p1", "", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V", "checkServerTrusted", "getAcceptedIssuers", "()[Ljava/security/cert/X509Certificate;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.player.SSLTrustManager */ /* loaded from: classes3.dex */
class SSLTrustManager constructor() : X509TrustManager {
    @Override // javax.net.ssl.X509TrustManager
    fun checkClientTrusted(x509CertificateArr: Array<X509Certificate?>?, str: String?) {
    }

    @Override // javax.net.ssl.X509TrustManager
    fun checkServerTrusted(x509CertificateArr: Array<X509Certificate?>?, str: String?) {
    }

    // javax.net.ssl.X509TrustManager
    @get:Override
    val acceptedIssuers: Array<Any>
        get() {
            return arrayOfNulls(0)
        }
}