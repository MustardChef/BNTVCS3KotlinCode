package com.lagradost.nicehttp

import javax.net.ssl.HostnameVerifier

/* compiled from: lambda */ /* renamed from: com.lagradost.nicehttp.-$$Lambda$RequestsKt$bAfRwzknvdCXxHGMs-D5sJemaoQ  reason: invalid class name */ /* loaded from: classes4.dex */
/* synthetic */  class `$$Lambda$RequestsKt$bAfRwzknvdCXxHGMsD5sJemaoQ` private /* synthetic */   constructor() :
    HostnameVerifier {
    @Override // javax.net.ssl.HostnameVerifier
    fun verify(str: String?, sSLSession: SSLSession?): Boolean {
        val `m9026ignoreAllSSLErrors$lambda10`: Boolean
        `m9026ignoreAllSSLErrors$lambda10` =
            RequestsKt.`m9026ignoreAllSSLErrors$lambda10`(str, sSLSession)
        return `m9026ignoreAllSSLErrors$lambda10`
    }

    companion object {
        /* synthetic */ val INSTANCE = `$$Lambda$RequestsKt$bAfRwzknvdCXxHGMsD5sJemaoQ`()
    }
}