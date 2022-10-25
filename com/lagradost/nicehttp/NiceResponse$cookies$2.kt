package com.lagradost.nicehttp

import java.util.Map
import kotlin.jvm.functions.Functions

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: Requests.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class `NiceResponse$cookies$2`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */(  /* synthetic */
    val `this$0`: NiceResponse
) : Lambda<Any?>(0), Functions<Map<String?, String?>?> {
    @Override // kotlin.jvm.functions.Functions
    override fun invoke(): Map<String?, String?> {
        val cookies: Map<String?, String?>
        cookies = RequestsKt.getCookies(`this$0`.okhttpResponse)
        return cookies
    }
}