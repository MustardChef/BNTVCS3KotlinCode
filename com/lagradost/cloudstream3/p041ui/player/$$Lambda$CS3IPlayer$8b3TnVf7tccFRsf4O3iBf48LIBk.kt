package com.lagradost.cloudstream3.p041ui.player

import javax.net.ssl.HostnameVerifier

/* compiled from: lambda */ /* renamed from: com.lagradost.cloudstream3.ui.player.-$$Lambda$CS3IPlayer$8b3TnVf7tccFRsf4O3iBf48LIBk  reason: invalid class name */ /* loaded from: classes3.dex */
/* synthetic */  class `$$Lambda$CS3IPlayer$8b3TnVf7tccFRsf4O3iBf48LIBk` private /* synthetic */   constructor() :
    HostnameVerifier {
    @Override // javax.net.ssl.HostnameVerifier
    fun verify(str: String?, sSLSession: SSLSession?): Boolean {
        val `m8663loadOnlinePlayer$lambda16`: Boolean
        `m8663loadOnlinePlayer$lambda16` =
            CS3IPlayer.Companion.`m8663loadOnlinePlayer$lambda16`(str, sSLSession)
        return `m8663loadOnlinePlayer$lambda16`
    }

    companion object {
        /* synthetic */ val INSTANCE: `$$Lambda$CS3IPlayer$8b3TnVf7tccFRsf4O3iBf48LIBk` =
            `$$Lambda$CS3IPlayer$8b3TnVf7tccFRsf4O3iBf48LIBk`()
    }
}