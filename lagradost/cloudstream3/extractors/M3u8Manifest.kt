package com.lagradost.cloudstream3.extractors

import java.util.ArrayList
import kotlin.jvm.internal.Intrinsics

/* compiled from: M3u8Manifest.kt */
@Metadata(
    m108d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u0004j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005`\u00072\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"],
    m107d2 = ["Lcom/lagradost/cloudstream3/extractors/M3u8Manifest;", "", "()V", "extractLinks", "Ljava/util/ArrayList;", "Lkotlin/Pair;", "", "Lkotlin/collections/ArrayList;", "m3u8Data", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class M3u8Manifest private constructor() {
    fun extractLinks(m3u8Data: String?): ArrayList<Tuples<String, String>> {
        Intrinsics.checkNotNullParameter(m3u8Data, "m3u8Data")
        val arrayList: ArrayList<Tuples<String, String>> = ArrayList()
        for (matchResult in Regex.`findAll$default`(
            Regex("\"(.*?)\":\"(.*?)\""),
            m3u8Data,
            0,
            2,
            null
        )) {
            var `replace$default`: String = StringsKt.`replace$default`(
                matchResult.groupValues.get(1),
                "auto",
                "Auto",
                false,
                4,
                null as Object?
            )
            if (!Intrinsics.areEqual(`replace$default`, "Auto") && !StringsKt.`endsWith$default`(
                    `replace$default` as CharSequence,
                    'p',
                    false,
                    2,
                    null as Object?
                )
            ) {
                `replace$default` = `replace$default` + 'p'
            }
            arrayList.add(Tuples<A, B>(matchResult.groupValues.get(2), `replace$default`))
        }
        return arrayList
    }

    companion object {
        val INSTANCE = M3u8Manifest()
    }
}