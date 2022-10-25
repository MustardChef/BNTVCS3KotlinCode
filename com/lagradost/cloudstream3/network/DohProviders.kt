package com.lagradost.cloudstream3.network

import java.net.InetAddress
import kotlin.jvm.internal.Intrinsics

@Metadata(
    m108d1 = ["\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0001\u001a \u0010\u0003\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u000c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0001¨\u0006\t"],
    m107d2 = ["addAdGuardDns", "Lokhttp3/OkHttpClient\$Builder;", "addCloudFlareDns", "addGenericDns", "url", "", "ips", "", "addGoogleDns", "app_release"],
    m106k = 2,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.network.DohProvidersKt */ /* loaded from: classes3.dex */
object DohProviders {
    fun addGenericDns(
        builder: OkHttpClient.Builder,
        url: String?,
        ips: List<String>
    ): OkHttpClient.Builder {
        Intrinsics.checkNotNullParameter(builder, "<this>")
        Intrinsics.checkNotNullParameter(url, "url")
        Intrinsics.checkNotNullParameter(ips, "ips")
        val url2: DnsOverHttps.Builder =
            DnsOverHttps.Builder().client(builder.build()).url(HttpUrl.Companion.get(url))
        val arrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(ips, 10))
        for (str in ips) {
            arrayList.add(InetAddress.getByName(str))
        }
        return builder.dns(url2.bootstrapDnsHosts(arrayList).build())
    }

    fun addGoogleDns(builder: OkHttpClient.Builder): OkHttpClient.Builder {
        Intrinsics.checkNotNullParameter(builder, "<this>")
        return addGenericDns(
            builder,
            "https://dns.google/dns-query",
            CollectionsKt.listOf<Object>(*arrayOf("8.8.4.4", "8.8.8.8") as Array<Object>)
        )
    }

    fun addCloudFlareDns(builder: OkHttpClient.Builder): OkHttpClient.Builder {
        Intrinsics.checkNotNullParameter(builder, "<this>")
        return addGenericDns(
            builder,
            "https://cloudflare-dns.com/dns-query",
            CollectionsKt.listOf<Object>(
                *arrayOf(
                    "1.1.1.1",
                    "1.0.0.1",
                    "2606:4700:4700::1111",
                    "2606:4700:4700::1001"
                ) as Array<Object>
            )
        )
    }

    fun addAdGuardDns(builder: OkHttpClient.Builder): OkHttpClient.Builder {
        Intrinsics.checkNotNullParameter(builder, "<this>")
        return addGenericDns(
            builder,
            "https://dns.adguard.com/dns-query",
            CollectionsKt.listOf<Object>(
                *arrayOf(
                    "94.140.14.140",
                    "94.140.14.141"
                ) as Array<Object>
            )
        )
    }
}