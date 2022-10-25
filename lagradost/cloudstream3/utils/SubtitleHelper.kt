package com.lagradost.cloudstream3.utils

import java.util.HashMap
import kotlin.jvm.internal.Intrinsics

/* compiled from: SubtitleHelper.kt */
@Metadata(
    m108d1 = ["\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001dB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u0005J\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u0005J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u0005J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u0005J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005J\b\u0010\u001b\u001a\u00020\u001cH\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\u000c¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"],
    m107d2 = ["Lcom/lagradost/cloudstream3/utils/SubtitleHelper;", "", "()V", "ISO_639_1Map", "Ljava/util/HashMap;", "", "asciiOffset", "", "flagOffset", "flags", "", "languages", "", "Lcom/lagradost/cloudstream3/utils/SubtitleHelper\$Language639;", "getLanguages", "()Ljava/util/List;", TypedValues.CycleType.S_WAVE_OFFSET, "fromLanguageToThreeLetters", TvContractCompat.PARAM_INPUT, "fromLanguageToTwoLetters", "looseCheck", "", "fromThreeLettersToLanguage", "fromTwoLettersToLanguage", "fromTwoLettersToThreeLetters", "getFlagFromIso", "inp", "initISO6391Map", "", "Language639", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class SubtitleHelper private constructor() {
    /* compiled from: SubtitleHelper.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000cR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000cR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000cR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000c¨\u0006!"],
        m107d2 = ["Lcom/lagradost/cloudstream3/utils/SubtitleHelper\$Language639;", "", "languageName", "", "nativeName", "ISO_639_1", "ISO_639_2_T", "ISO_639_2_B", "ISO_639_3", "ISO_639_6", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getISO_639_1", "()Ljava/lang/String;", "getISO_639_2_B", "getISO_639_2_T", "getISO_639_3", "getISO_639_6", "getLanguageName", "getNativeName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class Language639(
        languageName: String,
        nativeName: String,
        ISO_639_1: String,
        ISO_639_2_T: String,
        ISO_639_2_B: String,
        ISO_639_3: String,
        ISO_639_6: String
    ) {
        val iSO_639_1: String
        val iSO_639_2_B: String
        val iSO_639_2_T: String
        val iSO_639_3: String
        val iSO_639_6: String
        val languageName: String
        val nativeName: String
        operator fun component1(): String {
            return languageName
        }

        operator fun component2(): String {
            return nativeName
        }

        operator fun component3(): String {
            return iSO_639_1
        }

        operator fun component4(): String {
            return iSO_639_2_T
        }

        operator fun component5(): String {
            return iSO_639_2_B
        }

        operator fun component6(): String {
            return iSO_639_3
        }

        operator fun component7(): String {
            return iSO_639_6
        }

        fun copy(
            languageName: String,
            nativeName: String,
            ISO_639_1: String,
            ISO_639_2_T: String,
            ISO_639_2_B: String,
            ISO_639_3: String,
            ISO_639_6: String
        ): Language639 {
            Intrinsics.checkNotNullParameter(languageName, "languageName")
            Intrinsics.checkNotNullParameter(nativeName, "nativeName")
            Intrinsics.checkNotNullParameter(ISO_639_1, "ISO_639_1")
            Intrinsics.checkNotNullParameter(ISO_639_2_T, "ISO_639_2_T")
            Intrinsics.checkNotNullParameter(ISO_639_2_B, "ISO_639_2_B")
            Intrinsics.checkNotNullParameter(ISO_639_3, "ISO_639_3")
            Intrinsics.checkNotNullParameter(ISO_639_6, "ISO_639_6")
            return Language639(
                languageName,
                nativeName,
                ISO_639_1,
                ISO_639_2_T,
                ISO_639_2_B,
                ISO_639_3,
                ISO_639_6
            )
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is Language639) {
                val language639 = obj as Language639
                return Intrinsics.areEqual(
                    languageName,
                    language639.languageName
                ) && Intrinsics.areEqual(
                    nativeName, language639.nativeName
                ) && Intrinsics.areEqual(
                    iSO_639_1, language639.iSO_639_1
                ) && Intrinsics.areEqual(
                    iSO_639_2_T, language639.iSO_639_2_T
                ) && Intrinsics.areEqual(
                    iSO_639_2_B, language639.iSO_639_2_B
                ) && Intrinsics.areEqual(
                    iSO_639_3, language639.iSO_639_3
                ) && Intrinsics.areEqual(
                    iSO_639_6, language639.iSO_639_6
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return (((((languageName.hashCode() * 31 + nativeName.hashCode()) * 31 + iSO_639_1.hashCode()) * 31 + iSO_639_2_T.hashCode()) * 31 + iSO_639_2_B.hashCode()) * 31 + iSO_639_3.hashCode()) * 31 + iSO_639_6.hashCode()
        }

        override fun toString(): String {
            return "Language639(languageName=" + languageName + ", nativeName=" + nativeName + ", ISO_639_1=" + iSO_639_1 + ", ISO_639_2_T=" + iSO_639_2_T + ", ISO_639_2_B=" + iSO_639_2_B + ", ISO_639_3=" + iSO_639_3 + ", ISO_639_6=" + iSO_639_6 + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(languageName, "languageName")
            Intrinsics.checkNotNullParameter(nativeName, "nativeName")
            Intrinsics.checkNotNullParameter(ISO_639_1, "ISO_639_1")
            Intrinsics.checkNotNullParameter(ISO_639_2_T, "ISO_639_2_T")
            Intrinsics.checkNotNullParameter(ISO_639_2_B, "ISO_639_2_B")
            Intrinsics.checkNotNullParameter(ISO_639_3, "ISO_639_3")
            Intrinsics.checkNotNullParameter(ISO_639_6, "ISO_639_6")
            this.languageName = languageName
            this.nativeName = nativeName
            iSO_639_1 = ISO_639_1
            iSO_639_2_T = ISO_639_2_T
            iSO_639_2_B = ISO_639_2_B
            iSO_639_3 = ISO_639_3
            iSO_639_6 = ISO_639_6
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                language639: Language639,
                str: String,
                str2: String,
                str3: String,
                str4: String,
                str5: String,
                str6: String,
                str7: String,
                i: Int,
                obj: Object?
            ): Language639 {
                var str = str
                var str2 = str2
                var str3 = str3
                var str4 = str4
                var str5 = str5
                var str6 = str6
                var str7 = str7
                if (i and 1 != 0) {
                    str = language639.languageName
                }
                if (i and 2 != 0) {
                    str2 = language639.nativeName
                }
                val str8 = str2
                if (i and 4 != 0) {
                    str3 = language639.iSO_639_1
                }
                val str9 = str3
                if (i and 8 != 0) {
                    str4 = language639.iSO_639_2_T
                }
                val str10 = str4
                if (i and 16 != 0) {
                    str5 = language639.iSO_639_2_B
                }
                val str11 = str5
                if (i and 32 != 0) {
                    str6 = language639.iSO_639_3
                }
                val str12 = str6
                if (i and 64 != 0) {
                    str7 = language639.iSO_639_6
                }
                return language639.copy(str, str8, str9, str10, str11, str12, str7)
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */ /* JADX WARN: Removed duplicated region for block: B:5:0x0014  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun fromLanguageToTwoLetters(r5: String?, r6: Boolean): String {
        /*
            r4 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.List<com.lagradost.cloudstream3.utils.SubtitleHelper$Language639> r0 = com.lagradost.cloudstream3.utils.SubtitleHelper.languages
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()
            com.lagradost.cloudstream3.utils.SubtitleHelper$Language639 r1 = (com.lagradost.cloudstream3.utils.SubtitleHelper.Language639) r1
            java.lang.String r3 = r1.getLanguageName()
            boolean r3 = kotlin.text.StringsKt.equals(r3, r5, r2)
            if (r3 != 0) goto L2e
            java.lang.String r3 = r1.getNativeName()
            boolean r2 = kotlin.text.StringsKt.equals(r3, r5, r2)
            if (r2 == 0) goto Ld
        L2e:
            java.lang.String r5 = r1.getISO_639_1()
            return r5
        L33:
            if (r6 == 0) goto L69
            java.util.List<com.lagradost.cloudstream3.utils.SubtitleHelper$Language639> r6 = com.lagradost.cloudstream3.utils.SubtitleHelper.languages
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L3d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L69
            java.lang.Object r0 = r6.next()
            com.lagradost.cloudstream3.utils.SubtitleHelper$Language639 r0 = (com.lagradost.cloudstream3.utils.SubtitleHelper.Language639) r0
            r1 = r5
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r3 = r0.getLanguageName()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = kotlin.text.StringsKt.contains(r1, r3, r2)
            if (r3 != 0) goto L64
            java.lang.String r3 = r0.getNativeName()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r1 = kotlin.text.StringsKt.contains(r1, r3, r2)
            if (r1 == 0) goto L3d
        L64:
            java.lang.String r5 = r0.getISO_639_1()
            return r5
        L69:
            r5 = 0
            return r5
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.utils.SubtitleHelper.fromLanguageToTwoLetters(java.lang.String, boolean):java.lang.String")
    }

    private fun initISO6391Map() {
        for (language639 in Companion.languages) {
            ISO_639_1Map.put(language639.iSO_639_1, language639.languageName)
        }
    }

    fun fromTwoLettersToLanguage(input: String): String? {
        Intrinsics.checkNotNullParameter(input, "input")
        if (input.length() !== 2) {
            return null
        }
        if (ISO_639_1Map.isEmpty()) {
            initISO6391Map()
        }
        val ROOT: Locale = Locale.ROOT
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT")
        val lowerCase: String = input.toLowerCase(ROOT)
        Intrinsics.checkNotNullExpressionValue(
            lowerCase,
            "this as java.lang.String).toLowerCase(locale)"
        )
        return ISO_639_1Map.get(lowerCase)
    }

    fun fromTwoLettersToThreeLetters(input: String): String? {
        Intrinsics.checkNotNullParameter(input, "input")
        if (input.length() !== 2) {
            return null
        }
        val ROOT: Locale = Locale.ROOT
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT")
        val lowerCase: String = input.toLowerCase(ROOT)
        Intrinsics.checkNotNullExpressionValue(
            lowerCase,
            "this as java.lang.String).toLowerCase(locale)"
        )
        for (language639 in Companion.languages) {
            if (Intrinsics.areEqual(language639.iSO_639_1, lowerCase)) {
                return language639.iSO_639_2_T
            }
        }
        return null
    }

    fun fromThreeLettersToLanguage(input: String): String? {
        Intrinsics.checkNotNullParameter(input, "input")
        if (input.length() !== 3) {
            return null
        }
        val ROOT: Locale = Locale.ROOT
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT")
        val lowerCase: String = input.toLowerCase(ROOT)
        Intrinsics.checkNotNullExpressionValue(
            lowerCase,
            "this as java.lang.String).toLowerCase(locale)"
        )
        for (language639 in Companion.languages) {
            if (Intrinsics.areEqual(language639.iSO_639_2_B, lowerCase)) {
                return language639.languageName
            }
        }
        for (language6392 in Companion.languages) {
            if (Intrinsics.areEqual(language6392.iSO_639_2_T, lowerCase)) {
                return language6392.languageName
            }
        }
        for (language6393 in Companion.languages) {
            if (Intrinsics.areEqual(language6393.iSO_639_3, lowerCase)) {
                return language6393.languageName
            }
        }
        return null
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0011  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    fun fromLanguageToThreeLetters(r4: String?): String {
        /*
            r3 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.List<com.lagradost.cloudstream3.utils.SubtitleHelper$Language639> r0 = com.lagradost.cloudstream3.utils.SubtitleHelper.languages
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            com.lagradost.cloudstream3.utils.SubtitleHelper$Language639 r1 = (com.lagradost.cloudstream3.utils.SubtitleHelper.Language639) r1
            java.lang.String r2 = r1.getLanguageName()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            if (r2 != 0) goto L2b
            java.lang.String r2 = r1.getNativeName()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            if (r2 == 0) goto Lb
        L2b:
            java.lang.String r4 = r1.getISO_639_2_T()
            return r4
        L30:
            r4 = 0
            return r4
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.utils.SubtitleHelper.fromLanguageToThreeLetters(java.lang.String):java.lang.String")
    }

    fun getFlagFromIso(str: String?): String? {
        var str2: String?
        return try {
            val map = flags
            if (str == null || map[str].also { str2 = it } == null) {
                return null
            }
            val codePointAt: Int = Character.codePointAt(str2, 0) + offset
            val codePointAt2: Int = Character.codePointAt(str2, 1) + offset
            val sb = StringBuilder()
            val chars: CharArray = Character.toChars(codePointAt)
            Intrinsics.checkNotNullExpressionValue(chars, "toChars(firstChar)")
            sb.append(String(chars))
            val chars2: CharArray = Character.toChars(codePointAt2)
            Intrinsics.checkNotNullExpressionValue(chars2, "toChars(secondChar)")
            sb.append(String(chars2))
            sb.toString()
        } catch (e: Exception) {
            ArchComponentExt.logError(e)
            null
        }
    }

    val languages: List<Language639>
        get() = Companion.languages

    companion object {
        private const val asciiOffset = 65
        private const val flagOffset = 127462
        private const val offset = 127397
        @kotlin.jvm.JvmField
        val INSTANCE = SubtitleHelper()
        private val ISO_639_1Map: HashMap<String, String> = HashMap()
        private val flags: Map<String, String> = MapsKt.mapOf(
            TuplesKt.m100to<Any, Any>("af", "ZA"),
            TuplesKt.m100to<Any, Any>("agq", "CM"),
            TuplesKt.m100to<Any, Any>("ak", "GH"),
            TuplesKt.m100to<Any, Any>("am", "ET"),
            TuplesKt.m100to<Any, Any>("ar", "AE"),
            TuplesKt.m100to<Any, Any>("as", "IN"),
            TuplesKt.m100to<Any, Any>("asa", "TZ"),
            TuplesKt.m100to<Any, Any>("az", "AZ"),
            TuplesKt.m100to<Any, Any>("bas", "CM"),
            TuplesKt.m100to<Any, Any>("be", "BY"),
            TuplesKt.m100to<Any, Any>("bem", "ZM"),
            TuplesKt.m100to<Any, Any>("bez", "IT"),
            TuplesKt.m100to<Any, Any>("bg", "BG"),
            TuplesKt.m100to<Any, Any>("bm", "ML"),
            TuplesKt.m100to<Any, Any>("bn", "BD"),
            TuplesKt.m100to<Any, Any>("bo", "CN"),
            TuplesKt.m100to<Any, Any>(TtmlNode.TAG_BR, "FR"),
            TuplesKt.m100to<Any, Any>("brx", "IN"),
            TuplesKt.m100to<Any, Any>("bs", "BA"),
            TuplesKt.m100to<Any, Any>("ca", "ES"),
            TuplesKt.m100to<Any, Any>("cgg", "UG"),
            TuplesKt.m100to<Any, Any>("chr", "US"),
            TuplesKt.m100to<Any, Any>("cs", "CZ"),
            TuplesKt.m100to<Any, Any>("cy", "GB"),
            TuplesKt.m100to<Any, Any>("da", "DK"),
            TuplesKt.m100to<Any, Any>("dav", "KE"),
            TuplesKt.m100to<Any, Any>("de", "DE"),
            TuplesKt.m100to<Any, Any>("dje", "NE"),
            TuplesKt.m100to<Any, Any>("dua", "CM"),
            TuplesKt.m100to<Any, Any>("dyo", "SN"),
            TuplesKt.m100to<Any, Any>("ebu", "KE"),
            TuplesKt.m100to<Any, Any>("ee", "GH"),
            TuplesKt.m100to<Any, Any>("en", "GB"),
            TuplesKt.m100to<Any, Any>("el", "GR"),
            TuplesKt.m100to<Any, Any>("es", "ES"),
            TuplesKt.m100to<Any, Any>("et", "EE"),
            TuplesKt.m100to<Any, Any>("eu", "ES"),
            TuplesKt.m100to<Any, Any>("ewo", "CM"),
            TuplesKt.m100to<Any, Any>("fa", "IR"),
            TuplesKt.m100to<Any, Any>("fil", "PH"),
            TuplesKt.m100to<Any, Any>("fr", "FR"),
            TuplesKt.m100to<Any, Any>("ga", "IE"),
            TuplesKt.m100to<Any, Any>("gl", "ES"),
            TuplesKt.m100to<Any, Any>("gsw", "CH"),
            TuplesKt.m100to<Any, Any>("gu", "IN"),
            TuplesKt.m100to<Any, Any>("guz", "KE"),
            TuplesKt.m100to<Any, Any>("gv", "GB"),
            TuplesKt.m100to<Any, Any>("ha", "NG"),
            TuplesKt.m100to<Any, Any>("haw", "US"),
            TuplesKt.m100to<Any, Any>("he", "IL"),
            TuplesKt.m100to<Any, Any>("hi", "IN"),
            TuplesKt.m100to<Any, Any>("ff", "CN"),
            TuplesKt.m100to<Any, Any>("fi", "FI"),
            TuplesKt.m100to<Any, Any>("fo", "FO"),
            TuplesKt.m100to<Any, Any>("hr", "HR"),
            TuplesKt.m100to<Any, Any>("hu", "HU"),
            TuplesKt.m100to<Any, Any>("hy", "AM"),
            TuplesKt.m100to<Any, Any>("id", "ID"),
            TuplesKt.m100to<Any, Any>("ig", "NG"),
            TuplesKt.m100to<Any, Any>("ii", "CN"),
            TuplesKt.m100to<Any, Any>("is", "IS"),
            TuplesKt.m100to<Any, Any>("it", "IT"),
            TuplesKt.m100to<Any, Any>("ita", "IT"),
            TuplesKt.m100to<Any, Any>("ja", "JP"),
            TuplesKt.m100to<Any, Any>("jmc", "TZ"),
            TuplesKt.m100to<Any, Any>("ka", "GE"),
            TuplesKt.m100to<Any, Any>("kab", "DZ"),
            TuplesKt.m100to<Any, Any>("ki", "KE"),
            TuplesKt.m100to<Any, Any>("kam", "KE"),
            TuplesKt.m100to<Any, Any>("mer", "KE"),
            TuplesKt.m100to<Any, Any>("kde", "TZ"),
            TuplesKt.m100to<Any, Any>("kea", "CV"),
            TuplesKt.m100to<Any, Any>("khq", "ML"),
            TuplesKt.m100to<Any, Any>("kk", "KZ"),
            TuplesKt.m100to<Any, Any>("kl", "GL"),
            TuplesKt.m100to<Any, Any>("kln", "KE"),
            TuplesKt.m100to<Any, Any>("km", "KH"),
            TuplesKt.m100to<Any, Any>("kn", "IN"),
            TuplesKt.m100to<Any, Any>("ko", "KR"),
            TuplesKt.m100to<Any, Any>("kok", "IN"),
            TuplesKt.m100to<Any, Any>("ksb", "TZ"),
            TuplesKt.m100to<Any, Any>("ksf", "CM"),
            TuplesKt.m100to<Any, Any>("kw", "GB"),
            TuplesKt.m100to<Any, Any>("lag", "TZ"),
            TuplesKt.m100to<Any, Any>("lg", "UG"),
            TuplesKt.m100to<Any, Any>(UserDataStore.LAST_NAME, "CG"),
            TuplesKt.m100to<Any, Any>("lt", "LT"),
            TuplesKt.m100to<Any, Any>("lu", "CD"),
            TuplesKt.m100to<Any, Any>("lv", "LV"),
            TuplesKt.m100to<Any, Any>("lat", "LV"),
            TuplesKt.m100to<Any, Any>("luo", "KE"),
            TuplesKt.m100to<Any, Any>("luy", "KE"),
            TuplesKt.m100to<Any, Any>("mas", "TZ"),
            TuplesKt.m100to<Any, Any>("mfe", "MU"),
            TuplesKt.m100to<Any, Any>("mg", "MG"),
            TuplesKt.m100to<Any, Any>("mgh", "MZ"),
            TuplesKt.m100to<Any, Any>("ml", "IN"),
            TuplesKt.m100to<Any, Any>("mk", "MK"),
            TuplesKt.m100to<Any, Any>("mr", "IN"),
            TuplesKt.m100to<Any, Any>("ms", "MY"),
            TuplesKt.m100to<Any, Any>("mt", "MT"),
            TuplesKt.m100to<Any, Any>("mua", "CM"),
            TuplesKt.m100to<Any, Any>("my", "MM"),
            TuplesKt.m100to<Any, Any>("naq", "NA"),
            TuplesKt.m100to<Any, Any>("nb", "NO"),
            TuplesKt.m100to<Any, Any>("no", "NO"),
            TuplesKt.m100to<Any, Any>("nn", "NO"),
            TuplesKt.m100to<Any, Any>("nd", "ZW"),
            TuplesKt.m100to<Any, Any>("ne", "NP"),
            TuplesKt.m100to<Any, Any>("nl", "NL"),
            TuplesKt.m100to<Any, Any>("nmg", "CM"),
            TuplesKt.m100to<Any, Any>("nus", "SD"),
            TuplesKt.m100to<Any, Any>("nyn", "UG"),
            TuplesKt.m100to<Any, Any>("om", "ET"),
            TuplesKt.m100to<Any, Any>("or", "IN"),
            TuplesKt.m100to<Any, Any>("pa", "PK"),
            TuplesKt.m100to<Any, Any>("pl", "PL"),
            TuplesKt.m100to<Any, Any>("ps", "AF"),
            TuplesKt.m100to<Any, Any>("pt", "PT"),
            TuplesKt.m100to<Any, Any>("rm", "CH"),
            TuplesKt.m100to<Any, Any>("rn", "BI"),
            TuplesKt.m100to<Any, Any>("ro", "RO"),
            TuplesKt.m100to<Any, Any>("ru", "RU"),
            TuplesKt.m100to<Any, Any>("rw", "RW"),
            TuplesKt.m100to<Any, Any>("rof", "TZ"),
            TuplesKt.m100to<Any, Any>("rwk", "TZ"),
            TuplesKt.m100to<Any, Any>("saq", "KE"),
            TuplesKt.m100to<Any, Any>("sbp", "TZ"),
            TuplesKt.m100to<Any, Any>("seh", "MZ"),
            TuplesKt.m100to<Any, Any>("ses", "ML"),
            TuplesKt.m100to<Any, Any>("sg", "CF"),
            TuplesKt.m100to<Any, Any>("shi", "MA"),
            TuplesKt.m100to<Any, Any>("si", "LK"),
            TuplesKt.m100to<Any, Any>("sk", "SK"),
            TuplesKt.m100to<Any, Any>("sl", "SI"),
            TuplesKt.m100to<Any, Any>("sn", "ZW"),
            TuplesKt.m100to<Any, Any>("so", "SO"),
            TuplesKt.m100to<Any, Any>("sq", "AL"),
            TuplesKt.m100to<Any, Any>("sr", "RS"),
            TuplesKt.m100to<Any, Any>("sv", "SE"),
            TuplesKt.m100to<Any, Any>("sw", "TZ"),
            TuplesKt.m100to<Any, Any>("swc", "CD"),
            TuplesKt.m100to<Any, Any>("ta", "IN"),
            TuplesKt.m100to<Any, Any>("te", "IN"),
            TuplesKt.m100to<Any, Any>("teo", "UG"),
            TuplesKt.m100to<Any, Any>("th", "TH"),
            TuplesKt.m100to<Any, Any>("ti", "ET"),
            TuplesKt.m100to<Any, Any>("to", "TO"),
            TuplesKt.m100to<Any, Any>("tr", "TR"),
            TuplesKt.m100to<Any, Any>("twq", "NE"),
            TuplesKt.m100to<Any, Any>("tzm", "MA"),
            TuplesKt.m100to<Any, Any>("uk", "UA"),
            TuplesKt.m100to<Any, Any>("ur", "PK"),
            TuplesKt.m100to<Any, Any>("uz", "UZ"),
            TuplesKt.m100to<Any, Any>("vai", "LR"),
            TuplesKt.m100to<Any, Any>("vi", "VN"),
            TuplesKt.m100to<Any, Any>("vun", "TZ"),
            TuplesKt.m100to<Any, Any>("xog", "UG"),
            TuplesKt.m100to<Any, Any>("yav", "CM"),
            TuplesKt.m100to<Any, Any>("yo", "NG"),
            TuplesKt.m100to<Any, Any>("zh", "CN"),
            TuplesKt.m100to<Any, Any>("zu", "ZA"),
            TuplesKt.m100to<Any, Any>("tl", "PH")
        )
        private val languages: List<Language639> = CollectionsKt.listOf<Object>(
            *arrayOf(
                Language639("Abkhaz", "аҧсуа бызшәа, аҧсшәа", "ab", "abk", "abk", "abk", "abks"),
                Language639("Afar", "Afaraf", "aa", "aar", "aar", "aar", "aars"),
                Language639("Afrikaans", "Afrikaans", "af", "afr", "afr", "afr", "afrs"),
                Language639("Akan", "Akan", "ak", "aka", "aka", "aka", ""),
                Language639("Albanian", "Shqip", "sq", "sqi", "", "sqi", ""),
                Language639("Amharic", "አማርኛ", "am", "amh", "amh", "amh", ""),
                Language639("Arabic", "العربية", "ar", "ara", "ara", "ara", ""),
                Language639("Aragonese", "aragonés", "an", "arg", "arg", "arg", ""),
                Language639("Armenian", "Հայերեն", "hy", "hye", "", "hye", ""),
                Language639("Assamese", "অসমীয়া", "as", "asm", "asm", "asm", ""),
                Language639("Avaric", "авар мацӀ, магӀарул мацӀ", "av", "ava", "ava", "ava", ""),
                Language639("Avestan", "avesta", "ae", "ave", "ave", "ave", ""),
                Language639("Aymara", "aymar aru", "ay", "aym", "aym", "aym", ""),
                Language639("Azerbaijani", "azərbaycan dili", "az", "aze", "aze", "aze", ""),
                Language639("Bambara", "bamanankan", "bm", "bam", "bam", "bam", ""),
                Language639("Bashkir", "башҡорт теле", "ba", "bak", "bak", "bak", ""),
                Language639("Basque", "euskara, euskera", "eu", "eus", "", "eus", ""),
                Language639("Belarusian", "беларуская мова", "be", "bel", "bel", "bel", ""),
                Language639("Bengali", "বাংলা", "bn", "ben", "ben", "ben", ""),
                Language639("Bihari", "भोजपुरी", "bh", "bih", "bih", "", ""),
                Language639("Bislama", "Bislama", "bi", "bis", "bis", "bis", ""),
                Language639("Bosnian", "bosanski jezik", "bs", "bos", "bos", "bos", "boss"),
                Language639("Breton", "brezhoneg", TtmlNode.TAG_BR, "bre", "bre", "bre", ""),
                Language639("Bulgarian", "български език", "bg", "bul", "bul", "bul", "buls"),
                Language639("Burmese", "ဗမာစာ", "my", "mya", "", "mya", ""),
                Language639("Catalan", "català", "ca", "cat", "cat", "cat", ""),
                Language639("Chamorro", "Chamoru", "ch", "cha", "cha", "cha", ""),
                Language639("Chechen", "нохчийн мотт", "ce", "che", "che", "che", ""),
                Language639("Chichewa", "chiCheŵa, chinyanja", "ny", "nya", "nya", "nya", ""),
                Language639("Chinese", "中文 (Zhōngwén), 汉语, 漢語", "zh", "zho", "", "zho", ""),
                Language639("Chuvash", "чӑваш чӗлхи", "cv", "chv", "chv", "chv", ""),
                Language639("Cornish", "Kernewek", "kw", "cor", "cor", "cor", ""),
                Language639("Corsican", "corsu, lingua corsa", "co", "cos", "cos", "cos", ""),
                Language639("Cree", "ᓀᐦᐃᔭᐍᐏᐣ", "cr", "cre", "cre", "cre", ""),
                Language639("Croatian", "hrvatski jezik", "hr", "hrv", "hrv", "hrv", ""),
                Language639("Czech", "čeština, český jazyk", "cs", "ces", "", "ces", ""),
                Language639("Danish", "dansk", "da", "dan", "dan", "dan", ""),
                Language639(
                    "Divehi",
                    "ދިވެހި",
                    "dv",
                    TtmlNode.TAG_DIV,
                    TtmlNode.TAG_DIV,
                    TtmlNode.TAG_DIV,
                    ""
                ),
                Language639("Dutch", "Nederlands, Vlaams", "nl", "nld", "", "nld", ""),
                Language639("Dzongkha", "རྫོང་ཁ", "dz", "dzo", "dzo", "dzo", ""),
                Language639("English", "English", "en", "eng", "eng", "eng", "engs"),
                Language639("Esperanto", "Esperanto", "eo", "epo", "epo", "epo", ""),
                Language639("Estonian", "eesti, eesti keel", "et", "est", "est", "est", ""),
                Language639("Ewe", "Eʋegbe", "ee", "ewe", "ewe", "ewe", ""),
                Language639("Faroese", "føroyskt", "fo", "fao", "fao", "fao", ""),
                Language639("Fijian", "vosa Vakaviti", "fj", "fij", "fij", "fij", ""),
                Language639("Finnish", "suomi, suomen kieli", "fi", "fin", "fin", "fin", ""),
                Language639("French", "français, langue française", "fr", "fra", "", "fra", "fras"),
                Language639("Fula", "Fulfulde, Pulaar, Pular", "ff", "ful", "ful", "ful", ""),
                Language639("Galician", "galego", "gl", "glg", "glg", "glg", ""),
                Language639("Georgian", "ქართული", "ka", "kat", "", "kat", ""),
                Language639("German", "Deutsch", "de", "deu", "", "deu", "deus"),
                Language639("Greek", "ελληνικά", "el", "ell", "", "ell", "ells"),
                Language639("Guaraní", "Avañe'ẽ", "gn", "grn", "grn", "grn", ""),
                Language639("Gujarati", "ગુજરાતી", "gu", "guj", "guj", "guj", ""),
                Language639("Haitian", "Kreyòl ayisyen", "ht", "hat", "hat", "hat", ""),
                Language639("Hausa", "(Hausa) هَوُسَ", "ha", "hau", "hau", "hau", ""),
                Language639("Hebrew", "עברית", "he", "heb", "heb", "heb", ""),
                Language639("Herero", "Otjiherero", "hz", "her", "her", "her", ""),
                Language639("Hindi", "हिन्दी, हिंदी", "hi", "hin", "hin", "hin", "hins"),
                Language639("Hiri Motu", "Hiri Motu", "ho", "hmo", "hmo", "hmo", ""),
                Language639("Hungarian", "magyar", "hu", "hun", "hun", "hun", ""),
                Language639("Interlingua", "Interlingua", "ia", "ina", "ina", "ina", ""),
                Language639("Indonesian", "Bahasa Indonesia", "id", "ind", "ind", "ind", ""),
                Language639(
                    "Interlingue",
                    "Originally called Occidental; then Interlingue after WWII",
                    "ie",
                    "ile",
                    "ile",
                    "ile",
                    ""
                ),
                Language639("Irish", "Gaeilge", "ga", "gle", "gle", "gle", ""),
                Language639("Igbo", "Asụsụ Igbo", "ig", "ibo", "ibo", "ibo", ""),
                Language639("Inupiaq", "Iñupiaq, Iñupiatun", "ik", "ipk", "ipk", "ipk", ""),
                Language639("Ido", "Ido", "io", "ido", "ido", "ido", "idos"),
                Language639("Icelandic", "Íslenska", "is", "isl", "", "isl", ""),
                Language639("Italian", "italiano", "it", "ita", "ita", "ita", "itas"),
                Language639("Inuktitut", "ᐃᓄᒃᑎᑐᑦ", "iu", "iku", "iku", "iku", ""),
                Language639("Japanese", "日本語 (にほんご)", "ja", "jpn", "jpn", "jpn", ""),
                Language639("Javanese", "ꦧꦱꦗꦮ", "jv", "jav", "jav", "jav", ""),
                Language639(
                    "Kalaallisut",
                    "kalaallisut, kalaallit oqaasii",
                    "kl",
                    "kal",
                    "kal",
                    "kal",
                    ""
                ),
                Language639("Kannada", "ಕನ್ನಡ", "kn", "kan", "kan", "kan", ""),
                Language639("Kanuri", "Kanuri", "kr", "kau", "kau", "kau", ""),
                Language639("Kashmiri", "कश्मीरी, كشميري\u200e", "ks", "kas", "kas", "kas", ""),
                Language639("Kazakh", "қазақ тілі", "kk", "kaz", "kaz", "kaz", ""),
                Language639("Khmer", "ខ្មែរ, ខេមរភាសា, ភាសាខ្មែរ", "km", "khm", "khm", "khm", ""),
                Language639("Kikuyu", "Gĩkũyũ", "ki", "kik", "kik", "kik", ""),
                Language639("Kinyarwanda", "Ikinyarwanda", "rw", "kin", "kin", "kin", ""),
                Language639("Kyrgyz", "Кыргызча, Кыргыз тили", "ky", "kir", "kir", "kir", ""),
                Language639("Komi", "коми кыв", "kv", "kom", "kom", "kom", ""),
                Language639("Kongo", "Kikongo", "kg", "kon", "kon", "kon", ""),
                Language639("Korean", "한국어, 조선어", "ko", "kor", "kor", "kor", ""),
                Language639("Kurdish", "Kurdî, كوردی\u200e", "ku", "kur", "kur", "kur", ""),
                Language639("Kwanyama", "Kuanyama", "kj", "kua", "kua", "kua", ""),
                Language639("Latin", "latine, lingua latina", "la", "lat", "lat", "lat", "lats"),
                Language639("Luxembourgish", "Lëtzebuergesch", "lb", "ltz", "ltz", "ltz", ""),
                Language639("Ganda", "Luganda", "lg", "lug", "lug", "lug", ""),
                Language639("Limburgish", "Limburgs", "li", "lim", "lim", "lim", ""),
                Language639("Lingala", "Lingála", UserDataStore.LAST_NAME, "lin", "lin", "lin", ""),
                Language639("Lao", "ພາສາລາວ", "lo", "lao", "lao", "lao", ""),
                Language639("Lithuanian", "lietuvių kalba", "lt", "lit", "lit", "lit", ""),
                Language639("Luba-Katanga", "Tshiluba", "lu", "lub", "lub", "lub", ""),
                Language639("Latvian", "latviešu valoda", "lv", "lav", "lav", "lav", ""),
                Language639("Manx", "Gaelg, Gailck", "gv", "glv", "glv", "glv", ""),
                Language639("Macedonian", "македонски јазик", "mk", "mkd", "", "mkd", ""),
                Language639("Malagasy", "fiteny malagasy", "mg", "mlg", "mlg", "mlg", ""),
                Language639("Malay", "bahasa Melayu, بهاس ملايو\u200e", "ms", "msa", "", "msa", ""),
                Language639("Malayalam", "മലയാളം", "ml", "mal", "mal", "mal", ""),
                Language639("Maltese", "Malti", "mt", "mlt", "mlt", "mlt", ""),
                Language639("Māori", "te reo Māori", "mi", "mri", "", "mri", ""),
                Language639("Marathi", "मराठी", "mr", "mar", "mar", "mar", ""),
                Language639("Marshallese", "Kajin M̧ajeļ", "mh", "mah", "mah", "mah", ""),
                Language639("Mongolian", "Монгол хэл", "mn", "mon", "mon", "mon", ""),
                Language639("Nauruan", "Dorerin Naoero", "na", "nau", "nau", "nau", ""),
                Language639("Navajo", "Diné bizaad", "nv", "nav", "nav", "nav", ""),
                Language639("Northern Ndebele", "isiNdebele", "nd", "nde", "nde", "nde", ""),
                Language639("Nepali", "नेपाली", "ne", "nep", "nep", "nep", ""),
                Language639("Ndonga", "Owambo", "ng", "ndo", "ndo", "ndo", ""),
                Language639("Norwegian Bokmål", "Norsk bokmål", "nb", "nob", "nob", "nob", ""),
                Language639("Norwegian Nynorsk", "Norsk nynorsk", "nn", "nno", "nno", "nno", ""),
                Language639("Norwegian", "Norsk", "no", "nor", "nor", "nor", ""),
                Language639("Nuosu", "ꆈꌠ꒿ Nuosuhxop", "ii", "iii", "iii", "iii", ""),
                Language639("Southern Ndebele", "isiNdebele", "nr", "nbl", "nbl", "nbl", ""),
                Language639("Occitan", "occitan, lenga d'òc", "oc", "oci", "oci", "oci", ""),
                Language639("Ojibwe", "ᐊᓂᔑᓈᐯᒧᐎᓐ", "oj", "oji", "oji", "oji", ""),
                Language639(
                    "Old Church Slavonic",
                    "ѩзыкъ словѣньскъ",
                    "cu",
                    "chu",
                    "chu",
                    "chu",
                    ""
                ),
                Language639("Oromo", "Afaan Oromoo", "om", "orm", "orm", "orm", ""),
                Language639("Oriya", "ଓଡ଼ିଆ", "or", "ori", "ori", "ori", ""),
                Language639("Ossetian", "ирон æвзаг", "os", "oss", "oss", "oss", ""),
                Language639("Panjabi", "ਪੰਜਾਬੀ, پنجابی\u200e", "pa", "pan", "pan", "pan", ""),
                Language639("Pāli", "पाऴि", "pi", "pli", "pli", "pli", ""),
                Language639("Persian", "فارسی", "fa", "fas", "", "fas", ""),
                Language639(
                    "Polish",
                    "język polski, polszczyzna",
                    "pl",
                    "pol",
                    "pol",
                    "pol",
                    "pols"
                ),
                Language639("Pashto", "پښتو", "ps", "pus", "pus", "pus", ""),
                Language639("Portuguese", "português", "pt", "por", "por", "por", ""),
                Language639("Quechua", "Runa Simi, Kichwa", "qu", "que", "que", "que", ""),
                Language639("Romansh", "rumantsch grischun", "rm", "roh", "roh", "roh", ""),
                Language639("Kirundi", "Ikirundi", "rn", "run", "run", "run", ""),
                Language639("Reunion Creole", "Kréol Rénioné", "rc", "rcf", "rcf", "rcf", ""),
                Language639("Romanian", "limba română", "ro", "ron", "", "ron", ""),
                Language639("Russian", "Русский", "ru", "rus", "rus", "rus", ""),
                Language639("Sanskrit", "संस्कृतम्", "sa", "san", "san", "san", ""),
                Language639("Sardinian", "sardu", "sc", "srd", "srd", "srd", ""),
                Language639("Sindhi", "सिन्धी, سنڌي، سندھی\u200e", "sd", "snd", "snd", "snd", ""),
                Language639("Northern Sami", "Davvisámegiella", "se", "sme", "sme", "sme", ""),
                Language639("Samoan", "gagana fa'a Samoa", "sm", "smo", "smo", "smo", ""),
                Language639("Sango", "yângâ tî sängö", "sg", "sag", "sag", "sag", ""),
                Language639("Serbian", "српски језик", "sr", "srp", "srp", "srp", ""),
                Language639("Scottish Gaelic", "Gàidhlig", "gd", "gla", "gla", "gla", ""),
                Language639("Shona", "chiShona", "sn", "sna", "sna", "sna", ""),
                Language639("Sinhalese", "සිංහල", "si", "sin", "sin", "sin", ""),
                Language639("Slovak", "slovenčina, slovenský jazyk", "sk", "slk", "", "slk", ""),
                Language639(
                    "Slovene",
                    "slovenski jezik, slovenščina",
                    "sl",
                    "slv",
                    "slv",
                    "slv",
                    ""
                ),
                Language639("Somali", "Soomaaliga, af Soomaali", "so", "som", "som", "som", ""),
                Language639(
                    "Southern Sotho",
                    "Sesotho",
                    UserDataStore.STATE,
                    "sot",
                    "sot",
                    "sot",
                    ""
                ),
                Language639("Spanish", "español", "es", "spa", "spa", "spa", ""),
                Language639("Sundanese", "Basa Sunda", "su", "sun", "sun", "sun", ""),
                Language639("Swahili", "Kiswahili", "sw", "swa", "swa", "swa", ""),
                Language639("Swati", "SiSwati", "ss", "ssw", "ssw", "ssw", ""),
                Language639("Swedish", "svenska", "sv", "swe", "swe", "swe", ""),
                Language639("Tamil", "தமிழ்", "ta", "tam", "tam", "tam", ""),
                Language639("Telugu", "తెలుగు", "te", "tel", "tel", "tel", ""),
                Language639("Tajik", "тоҷикӣ, toçikī, تاجیکی\u200e", "tg", "tgk", "tgk", "tgk", ""),
                Language639("Thai", "ไทย", "th", "tha", "tha", "tha", ""),
                Language639("Tigrinya", "ትግርኛ", "ti", "tir", "tir", "tir", ""),
                Language639("Tibetan Standard", "བོད་ཡིག", "bo", "bod", "", "bod", ""),
                Language639("Turkmen", "Türkmen, Түркмен", "tk", "tuk", "tuk", "tuk", ""),
                Language639("Tagalog", "Wikang Tagalog", "tl", "tgl", "tgl", "tgl", ""),
                Language639("Tswana", "Setswana", "tn", "tsn", "tsn", "tsn", ""),
                Language639("Tonga", "faka Tonga", "to", "ton", "ton", "ton", ""),
                Language639("Turkish", "Türkçe", "tr", "tur", "tur", "tur", ""),
                Language639(
                    "Tsonga",
                    "Xitsonga",
                    HlsSegmentFormat.f9702TS,
                    "tso",
                    "tso",
                    "tso",
                    ""
                ),
                Language639(
                    "Tatar",
                    "татар теле, tatar tele",
                    TtmlNode.TAG_TT,
                    "tat",
                    "tat",
                    "tat",
                    ""
                ),
                Language639("Twi", "Twi", "tw", "twi", "twi", "twi", ""),
                Language639("Tahitian", "Reo Tahiti", "ty", "tah", "tah", "tah", ""),
                Language639("Uyghur", "ئۇيغۇرچە\u200e, Uyghurche", "ug", "uig", "uig", "uig", ""),
                Language639("Ukrainian", "Українська", "uk", "ukr", "ukr", "ukr", ""),
                Language639("Urdu", "اردو", "ur", "urd", "urd", "urd", ""),
                Language639("Uzbek", "Oʻzbek, Ўзбек, أۇزبېك\u200e", "uz", "uzb", "uzb", "uzb", ""),
                Language639("Venda", "Tshivenḓa", "ve", "ven", "ven", "ven", ""),
                Language639("Vietnamese", "Tiếng Việt", "vi", "vie", "vie", "vie", ""),
                Language639("Volapük", "Volapük", "vo", "vol", "vol", "vol", ""),
                Language639("Walloon", "walon", "wa", "wln", "wln", "wln", ""),
                Language639("Welsh", "Cymraeg", "cy", "cym", "", "cym", ""),
                Language639("Wolof", "Wollof", "wo", "wol", "wol", "wol", ""),
                Language639("Western Frisian", "Frysk", "fy", "fry", "fry", "fry", ""),
                Language639("Xhosa", "isiXhosa", "xh", "xho", "xho", "xho", ""),
                Language639("Yiddish", "ייִדיש", "yi", "yid", "yid", "yid", ""),
                Language639("Yoruba", "Yorùbá", "yo", "yor", "yor", "yor", ""),
                Language639("Zhuang", "Saɯ cueŋƅ, Saw cuengh", "za", "zha", "zha", "zha", ""),
                Language639("Zulu", "isiZulu", "zu", "zul", "zul", "zul", "")
            ) as Array<Object>
        )
    }
}