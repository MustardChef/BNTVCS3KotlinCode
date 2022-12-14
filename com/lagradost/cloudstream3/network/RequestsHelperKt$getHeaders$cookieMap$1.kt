package com.lagradost.cloudstream3.network

import java.util.Map
import kotlin.jvm.internal.Intrinsics

/* compiled from: RequestsHelper.kt */
@Metadata(
    m108d1 = ["\u0000\u0012\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"],
    m107d2 = ["<anonymous>", "", "it", "", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes3.dex */
internal class `RequestsHelperKt$getHeaders$cookieMap$1` : Lambda<Any?>(1),
    Function1<Map.Entry<String?, String?>, CharSequence> {
    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override fun invoke(entry: Map.Entry<String?, String?>): CharSequence {
        return invoke2(entry)
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(it: Map.Entry<String?, String?>): CharSequence {
        Intrinsics.checkNotNullParameter(it, "it")
        return it.getKey() + '=' + it.getValue() + ';'
    }

    companion object {
        val INSTANCE = `RequestsHelperKt$getHeaders$cookieMap$1`()
    }
}