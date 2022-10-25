package com.lagradost.cloudstream3.utils

import java.util.HashMap
import kotlin.jvm.internal.Intrinsics

/* compiled from: JsUnpacker.kt */
@Metadata(
    m108d1 = ["\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \b2\u00020\u0001:\u0002\b\tB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"],
    m107d2 = ["Lcom/lagradost/cloudstream3/utils/JsUnpacker;", "", "packedJS", "", "(Ljava/lang/String;)V", "detect", "", "unpack", "Companion", "Unbase", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class JsUnpacker(private val packedJS: String?) {
    fun detect(): Boolean {
        val str = packedJS
        Intrinsics.checkNotNull(str)
        return Pattern.compile("eval\\(function\\(p,a,c,k,e,[rd]")
            .matcher(StringsKt.`replace$default`(str, " ", "", false, 4, null as Object?)).find()
    }

    fun unpack(): String? {
        val i: Int
        try {
            val matcher: Matcher = Pattern.compile(
                "\\}\\s*\\('(.*)',\\s*(.*?),\\s*(\\d+),\\s*'(.*?)'\\.split\\('\\|'\\)",
                32
            ).matcher(
                packedJS
            )
            if (matcher.find() && matcher.groupCount() === 4) {
                val group: String = matcher.group(1)
                Intrinsics.checkNotNullExpressionValue(group, "m.group(1)")
                val `replace$default`: String =
                    StringsKt.`replace$default`(group, "\\'", "'", false, 4, null as Object?)
                val radixStr: String = matcher.group(2)
                val countStr: String = matcher.group(3)
                val group2: String = matcher.group(4)
                Intrinsics.checkNotNullExpressionValue(group2, "m.group(4)")
                val array: Array<Object?> =
                    Regex("\\|").split(group2, 0).toArray(arrayOfNulls<String>(0))
                if (array != null) {
                    val strArr = array as Array<String?>
                    var i2 = 36
                    try {
                        Intrinsics.checkNotNullExpressionValue(radixStr, "radixStr")
                        i2 = Integer.parseInt(radixStr)
                    } catch (unused: Exception) {
                    }
                    i = try {
                        Intrinsics.checkNotNullExpressionValue(countStr, "countStr")
                        Integer.parseInt(countStr)
                    } catch (unused2: Exception) {
                        0
                    }
                    if (strArr.size != i) {
                        throw Exception("Unknown p.a.c.k.e.r. encoding")
                    }
                    val unbase = Unbase(i2)
                    val matcher2: Matcher = Pattern.compile("\\b\\w+\\b").matcher(`replace$default`)
                    val sb = StringBuilder(`replace$default`)
                    var i3 = 0
                    while (matcher2.find()) {
                        val word: String = matcher2.group(0)
                        Intrinsics.checkNotNullExpressionValue(word, "word")
                        val unbase2 = unbase.unbase(word)
                        val str =
                            if (unbase2 >= strArr.size || unbase2 < 0) null else strArr[unbase2]
                        if (str != null) {
                            if (str.length() > 0) {
                                sb.replace(matcher2.start() + i3, matcher2.end() + i3, str)
                                i3 += str.length() - word.length()
                            }
                        }
                    }
                    return sb.toString()
                }
                throw NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>")
            }
        } catch (e: Exception) {
            ArchComponentExt.logError(e)
        }
        return null
    }

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: JsUnpacker.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000c\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R.\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"],
        m107d2 = ["Lcom/lagradost/cloudstream3/utils/JsUnpacker\$Unbase;", "", "radix", "", "(Lcom/lagradost/cloudstream3/utils/JsUnpacker;I)V", "ALPHABET_62", "", "ALPHABET_95", "alphabet", "dictionary", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "unbase", "str", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    /* loaded from: classes4.dex */
    inner class Unbase(private val radix: Int) {
        private val ALPHABET_62 = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
        private val ALPHABET_95 =
            " !\"#$%&\\'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~"
        private var alphabet: String? = null
        private var dictionary: HashMap<String, Integer>? = null

        init {
            if (radix > 36) {
                var i2 = 0
                if (radix < 62) {
                    val substring: String =
                        "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".substring(
                            0,
                            radix
                        )
                    Intrinsics.checkNotNullExpressionValue(
                        substring,
                        "this as java.lang.String…ing(startIndex, endIndex)"
                    )
                    alphabet = substring
                } else {
                    if (63 <= radix && radix < 95) {
                        val substring2: String =
                            " !\"#$%&\\'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~".substring(
                                0,
                                radix
                            )
                        Intrinsics.checkNotNullExpressionValue(
                            substring2,
                            "this as java.lang.String…ing(startIndex, endIndex)"
                        )
                        alphabet = substring2
                    } else if (radix == 62) {
                        alphabet = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
                    } else if (radix == 95) {
                        alphabet =
                            " !\"#$%&\\'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~"
                    }
                }
                dictionary = HashMap(95)
                val str = alphabet
                Intrinsics.checkNotNull(str)
                val length: Int = str!!.length()
                while (i2 < length) {
                    val valueOf: Integer = Integer.valueOf(i2)
                    val hashMap: HashMap<String, Integer> = dictionary
                    Intrinsics.checkNotNull(hashMap)
                    val str2 = alphabet
                    Intrinsics.checkNotNull(str2)
                    val i3 = i2 + 1
                    val substring3: String = str2.substring(i2, i3)
                    Intrinsics.checkNotNullExpressionValue(
                        substring3,
                        "this as java.lang.String…ing(startIndex, endIndex)"
                    )
                    hashMap.put(substring3, valueOf)
                    i2 = i3
                }
            }
        }

        fun unbase(str: String?): Int {
            Intrinsics.checkNotNullParameter(str, "str")
            if (alphabet == null) {
                return Integer.parseInt(str, CharsKt.checkRadix(radix))
            }
            val sb: String = StringBuilder(str).reverse().toString()
            Intrinsics.checkNotNullExpressionValue(sb, "StringBuilder(str).reverse().toString()")
            val length: Int = sb.length()
            var i = 0
            var i2 = 0
            while (i2 < length) {
                val pow: Double = Math.pow(radix, i2)
                val hashMap: HashMap<String, Integer> = dictionary
                Intrinsics.checkNotNull(hashMap)
                val i3 = i2 + 1
                val substring: String = sb.substring(i2, i3)
                Intrinsics.checkNotNullExpressionValue(
                    substring,
                    "this as java.lang.String…ing(startIndex, endIndex)"
                )
                val num: Integer = hashMap.get(substring)
                Intrinsics.checkNotNull(num)
                i += (pow * num.doubleValue()) as Int
                i2 = i3
            }
            return i
        }
    }

    /* compiled from: JsUnpacker.kt */
    @Metadata(
        m108d1 = ["\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000c\u0010\n\u001a\u0004\u0018\u00010\u000b*\u00020\u000bR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u000c"],
        m107d2 = ["Lcom/lagradost/cloudstream3/utils/JsUnpacker\$Companion;", "", "()V", "c", "", "", "getC", "()Ljava/util/List;", "z", "getZ", "load", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        val c: List<Any>
            get() = JsUnpacker.Companion.f10027c
        val z: List<Any>
            get() = JsUnpacker.Companion.f10028z

        fun load(str: String): String? {
            var str = str
            Intrinsics.checkNotNullParameter(str, "<this>")
            return try {
                try {
                    val size: Int = c.size()
                    for (i in 0 until size) {
                        str =
                            if (c[i % 4].intValue() > 270) str + c[i % 3].intValue() else str + c[i].intValue() as Char
                    }
                    val substring: String = str.substring(str.length() - c.size(), str.length())
                    Intrinsics.checkNotNullExpressionValue(
                        substring,
                        "this as java.lang.String…ing(startIndex, endIndex)"
                    )
                    Class.forName(substring).getName()
                } catch (unused: Exception) {
                    var valueOf: String = String.valueOf(c[2].intValue() as Char)
                    var i2 = 0
                    while (i2 < z.size()) {
                        valueOf = valueOf + z[i2].intValue() as Char
                        i2++
                    }
                    val substring2: String = valueOf.substring(1, valueOf.length())
                    Intrinsics.checkNotNullExpressionValue(
                        substring2,
                        "this as java.lang.String…ing(startIndex, endIndex)"
                    )
                    Class.forName(substring2).getName()
                }
            } catch (unused2: Exception) {
                null as String?
            }
        }
    }

    companion object {
        val Companion = Companion(null)

        /* renamed from: c */
        private val f10027c: List<Integer> = CollectionsKt.listOf<Object>(
            *arrayOf(
                99,
                111,
                109,
                46,
                103,
                111,
                111,
                103,
                108,
                101,
                46,
                97,
                110,
                100,
                114,
                111,
                105,
                100,
                46,
                103,
                109,
                115,
                46,
                97,
                100,
                115,
                46,
                77,
                111,
                98,
                105,
                108,
                101,
                65,
                100,
                115
            ) as Array<Object>
        )

        /* renamed from: z */
        private val f10028z: List<Integer> = CollectionsKt.listOf<Object>(
            *arrayOf(
                99,
                111,
                109,
                46,
                102,
                97,
                99,
                101,
                98,
                111,
                111,
                107,
                46,
                97,
                100,
                115,
                46,
                65,
                100
            ) as Array<Object>
        )
    }
}