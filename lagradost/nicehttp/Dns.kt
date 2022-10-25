package com.lagradost.nicehttp

import java.net.InetAddress
import kotlin.jvm.internal.Intrinsics

@Metadata(
    m108d1 = ["\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¨\u0006\u0006"],
    m107d2 = ["addGenericDns", "Lokhttp3/OkHttpClient\$Builder;", "url", "", "ips", "", "library_release"],
    m106k = 2,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.nicehttp.DnsKt */ /* loaded from: classes4.dex */
object Dns {
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
}