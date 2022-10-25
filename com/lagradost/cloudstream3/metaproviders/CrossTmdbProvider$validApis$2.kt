package com.lagradost.cloudstream3.metaproviders

import java.util.ArrayList
import kotlin.jvm.functions.Functions
import kotlin.jvm.internal.Intrinsics

/* compiled from: CrossTmdbProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "", "Lcom/lagradost/cloudstream3/MainAPI;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes3.dex */
internal class `CrossTmdbProvider$validApis$2`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */(  /* synthetic */
    val `this$0`: CrossTmdbProvider
) : Lambda<Any?>(0), Functions<List<MainAPI?>?> {
    @Override // kotlin.jvm.functions.Functions
    override fun invoke(): List<MainAPI> {
        val crossTmdbProvider = `this$0`
        val arrayList = ArrayList()
        for (obj in APIHolder.INSTANCE.apis) {
            val mainAPI: MainAPI = obj as MainAPI
            if (Intrinsics.areEqual(
                    mainAPI.getLang(),
                    crossTmdbProvider.getLang()
                ) && !Intrinsics.areEqual(mainAPI.getClass(), crossTmdbProvider.getClass())
            ) {
                arrayList.add(obj)
            }
        }
        return arrayList
    }
}