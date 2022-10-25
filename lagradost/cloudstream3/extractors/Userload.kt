package com.lagradost.cloudstream3.extractors

import org.mozilla.javascript.Context
import java.util.ArrayList
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* compiled from: Userload.kt */
@Metadata(
    m108d1 = ["\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J+\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\u0006\u0010\u001b\u001a\u00020\u0004H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u0014\u0010\u000c\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"],
    m107d2 = ["Lcom/lagradost/cloudstream3/extractors/Userload;", "Lcom/lagradost/cloudstream3/utils/ExtractorApi;", "()V", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "requiresReferer", "", "getRequiresReferer", "()Z", "decodeVideoJs", "", "text", "evaluateMath", "mathExpression", "getUrl", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "url", "referer", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "splitInput", TvContractCompat.PARAM_INPUT, "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class Userload : ExtractorApi() {
    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    val requiresReferer = false

    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    var name = "Userload"
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    // com.lagradost.cloudstream3.utils.ExtractorApi
    @get:Override
    var mainUrl = "https://userload.co"
        set(str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>")
            field = str
        }

    @Override // com.lagradost.cloudstream3.utils.ExtractorApi
    override fun getUrl(
        str: String?,
        str2: String?,
        continuation: Continuation<in List<ExtractorLink?>?>?
    ): Object {
        return `getUrl$suspendImpl`(this, str, str2, continuation as Continuation<*>?)
    }

    private fun splitInput(str: String): List<String> {
        val arrayList = ArrayList()
        val length: Int = str.length()
        var str2 = ""
        var i = 0
        for (i2 in 0 until length) {
            val charAt: Char = str.charAt(i2)
            if (charAt == '(') {
                i++
            } else if (charAt == ')') {
                i--
            }
            str2 = str2 + charAt
            if (i == 0) {
                if (!StringsKt.isBlank(str2) && !Intrinsics.areEqual(str2, "+")) {
                    arrayList.add(str2)
                }
                str2 = ""
            }
        }
        return arrayList
    }

    private fun evaluateMath(str: String): String {
        val enter = Context.enter()
        enter.initStandardObjects()
        enter.optimizationLevel = -1
        val initStandardObjects: ScriptableObject = enter.initStandardObjects()
        Intrinsics.checkNotNullExpressionValue(initStandardObjects, "rhino.initStandardObjects()")
        val scriptableObject: ScriptableObject = initStandardObjects
        return try {
            enter.evaluateString(scriptableObject, "eval($str)", "JavaScript", 1, null).toString()
        } catch (unused: EvaluatorException) {
            ""
        }
    }

    private fun decodeVideoJs(str: String): List<String> {
        var groups: MatchGroupCollection
        var matchGroup: MatchGroup
        var str3 = ""
        Regex("\\s+|/\\*.*?\\*/").replace(str, "")
        val drop: List<String> = CollectionsKt.drop(
            StringsKt.`split$default`(
                StringsKt.`split$default`(
                    str as CharSequence,
                    arrayOf("+(ﾟДﾟ)[ﾟoﾟ]"),
                    false,
                    0,
                    6,
                    null as Object?
                ).get(1) as CharSequence, arrayOf("+ (ﾟДﾟ)[ﾟεﾟ]+"), false, 0, 6, null as Object?
            ), 1
        )
        val arrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(drop, 10))
        for (str4 in drop) {
            arrayList.add(
                StringsKt.`replace$default`(
                    StringsKt.`replace$default`(
                        StringsKt.`replace$default`(
                            StringsKt.`replace$default`(
                                StringsKt.`replace$default`(
                                    StringsKt.`replace$default`(
                                        StringsKt.`replace$default`(
                                            StringsKt.`replace$default`(
                                                StringsKt.`replace$default`(
                                                    StringsKt.`replace$default`(
                                                        str4,
                                                        "(oﾟｰﾟo)",
                                                        "u",
                                                        false,
                                                        4,
                                                        null as Object?
                                                    ), "c", "0", false, 4, null as Object?
                                                ),
                                                "(ﾟДﾟ)['0']",
                                                "c",
                                                false,
                                                4,
                                                null as Object?
                                            ), "ﾟΘﾟ", "1", false, 4, null as Object?
                                        ),
                                        "!+[]",
                                        "1",
                                        false,
                                        4,
                                        null as Object?
                                    ), "-~", "1+", false, 4, null as Object?
                                ), "o", "3", false, 4, null as Object?
                            ),
                            "_",
                            "3",
                            false,
                            4,
                            null as Object?
                        ), "ﾟｰﾟ", "4", false, 4, null as Object?
                    ), "(+", "(", false, 4, null as Object?
                )
            )
        }
        val arrayList2: ArrayList<String> = ArrayList()
        val it: Iterator = CollectionsKt.dropLast(arrayList, 1).iterator()
        while (true) {
            if (!it.hasNext()) {
                break
            }
            val splitInput = splitInput(it.next() as String)
            val arrayList3 = ArrayList(CollectionsKt.collectionSizeOrDefault(splitInput, 10))
            for (str5 in splitInput) {
                arrayList3.add(
                    StringsKt.`substringBefore$default`(
                        evaluateMath(str5),
                        ".",
                        null as String?,
                        2,
                        null as Object?
                    )
                )
            }
            val obj: String = arrayList3.toString()
            val sb = StringBuilder()
            val length: Int = obj.length()
            for (i in 0 until length) {
                val charAt: Char = obj.charAt(i)
                if (Character.isDigit(charAt)) {
                    sb.append(charAt)
                }
            }
            val sb2 = sb.toString()
            Intrinsics.checkNotNullExpressionValue(
                sb2,
                "filterTo(StringBuilder(), predicate).toString()"
            )
            arrayList2.add(sb2)
        }
        for (str6 in arrayList2) {
            val sb3 = StringBuilder()
            sb3.append(str3)
            val parseInt: Int = Integer.parseInt(str6, CharsKt.checkRadix(8))
            if (parseInt < 0 || parseInt > 65535) {
                throw IllegalArgumentException("Invalid Char code: $parseInt")
            }
            sb3.append(parseInt.toChar())
            str3 = sb3.toString()
        }
        val `find$default` = Regex.`find$default`(
            Regex("\"morocco=\"((.|\\\\n)*?)\"&mycountry=\""),
            str3,
            0,
            2,
            null
        )
        return CollectionsKt.listOf<Object>(
            *arrayOf<String>(
                StringsKt.dropLast(
                    StringsKt.drop(
                        String.valueOf(if (`find$default` == null || `find$default`.groups.also {
                                groups = it
                            } == null || groups[1].also {
                                matchGroup = it
                            } == null) null else matchGroup.value),
                        1), 1),
                StringsKt.`substringBefore$default`(
                    StringsKt.`substringAfter$default`(
                        str3,
                        "&mycountry=\"+",
                        null as String?,
                        2,
                        null as Object?
                    ), ")", null as String?, 2, null as Object?
                )) as Array<Object>)
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */ /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */ /* JADX WARN: Removed duplicated region for block: B:35:0x016e A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:36:0x016f  */ /* JADX WARN: Removed duplicated region for block: B:40:0x01a7  */ /* JADX WARN: Removed duplicated region for block: B:46:0x021b  */ /* JADX WARN: Removed duplicated region for block: B:51:0x02c7 A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:52:0x02c8  */ /* JADX WARN: Removed duplicated region for block: B:55:0x0308 A[RETURN] */ /* JADX WARN: Removed duplicated region for block: B:56:0x0309  */ /* JADX WARN: Type inference failed for: r0v18, types: [java.util.List] */ /* JADX WARN: Type inference failed for: r0v23, types: [java.util.List] */ /* JADX WARN: Type inference failed for: r3v42, types: [java.util.List] */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
        fun  /* synthetic */`getUrl$suspendImpl`(
            r31: Userload?,
            r32: String?,
            r33: String?,
            r34: Continuation<*>?
        ): Any {
            /*
            Method dump skipped, instructions count: 837
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.extractors.Userload.getUrl\$suspendImpl(com.lagradost.cloudstream3.extractors.Userload, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object")
        }
    }
}