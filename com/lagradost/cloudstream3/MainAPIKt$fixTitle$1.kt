package com.lagradost.cloudstream3

import java.util.Locale
import kotlin.jvm.internal.Intrinsics

/* compiled from: MainAPI.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
    m107d2 = ["<anonymous>", "", "it", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes3.dex */
internal class `MainAPIKt$fixTitle$1` : Lambda<Any?>(1), Function1<String, CharSequence> {
    @Override // kotlin.jvm.functions.Function1
    override fun invoke(it: String): CharSequence {
        var it = it
        Intrinsics.checkNotNullParameter(it, "it")
        var lowerCase: String = it.toLowerCase(Locale.ROOT)
        Intrinsics.checkNotNullExpressionValue(
            lowerCase,
            "this as java.lang.String).toLowerCase(Locale.ROOT)"
        )
        if (lowerCase.length() > 0) {
            val sb = StringBuilder()
            val charAt: Char = lowerCase.charAt(0)
            if (Character.isLowerCase(charAt)) {
                val locale: Locale = Locale.getDefault()
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault()")
                it = CharsKt.titlecase(charAt, locale)
            }
            sb.append(it as Object)
            val substring: String = lowerCase.substring(1)
            Intrinsics.checkNotNullExpressionValue(
                substring,
                "this as java.lang.String).substring(startIndex)"
            )
            sb.append(substring)
            lowerCase = sb.toString()
        }
        return lowerCase
    }

    companion object {
        val INSTANCE = `MainAPIKt$fixTitle$1`()
    }
}