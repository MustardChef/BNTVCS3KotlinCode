package com.lagradost.cloudstream3.p041ui.settings

import android.content.SharedPreferences
import androidx.preference.Preference
import kotlin.jvm.internal.Intrinsics

/* compiled from: SettingsLang.kt */
@Metadata(
    m108d1 = ["\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000c\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R&\u0010\u0003\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/settings/SettingsLang;", "Landroidx/preference/PreferenceFragmentCompat;", "()V", "languages", "", "Lkotlin/Triple;", "", "getCurrentLocale", "onCreatePreferences", "", "savedInstanceState", "Landroid/os/Bundle;", "rootKey", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.settings.SettingsLang */ /* loaded from: classes4.dex */
class SettingsLang constructor() : PreferenceFragmentCompat() {
    var `_$_findViewCache`: Map<Integer, View> = LinkedHashMap()
    private val languages: List<Triple<String, String, String>> =
        CollectionsKt.sortedWith(CollectionsKt.arrayListOf<Triple<*, *, *>>(
            Triple<Any?, Any?, Any?>("", "Spanish", "es"),
            Triple<Any?, Any?, Any?>("", "English", "en"),
            Triple<Any?, Any?, Any?>("", "Viet Nam", "vi"),
            Triple<Any?, Any?, Any?>("", "Dutch", "nl"),
            Triple<Any?, Any?, Any?>("", "French", "fr"),
            Triple<Any?, Any?, Any?>("", "Greek", "el"),
            Triple<Any?, Any?, Any?>("", "Swedish", "sv"),
            Triple<Any?, Any?, Any?>("", "Tagalog", "tl"),
            Triple<Any?, Any?, Any?>("", "Polish", "pl"),
            Triple<Any?, Any?, Any?>("", "Hindi", "hi"),
            Triple<Any?, Any?, Any?>("", "Malayalam", "ml"),
            Triple<Any?, Any?, Any?>("", "Norsk", "no"),
            Triple<Any?, Any?, Any?>("", "German", "de"),
            Triple<Any?, Any?, Any?>("", "Arabic", "ar"),
            Triple<Any?, Any?, Any?>("", "Turkish", "tr"),
            Triple<Any?, Any?, Any?>("", "Macedonian", "mk"),
            Triple<Any?, Any?, Any?>("🇧🇷", "Portuguese (Brazil)", "pt"),
            Triple<Any?, Any?, Any?>("", "Romanian", "ro"),
            Triple<Any?, Any?, Any?>("", "Italian", "it"),
            Triple<Any?, Any?, Any?>("", "Chinese", "zh"),
            Triple<Any?, Any?, Any?>("", "Indonesian", "id"),
            Triple<Any?, Any?, Any?>("", "Czech", "cs")
        ), object : Comparator() {
            // from class: com.lagradost.cloudstream3.ui.settings.SettingsLang$special$$inlined$sortedBy$1
            @Override // java.util.Comparator
            fun compare(t: T, t2: T): Int {
                return ComparisonsKt.compareValues<Comparable<*>>(
                    (t as Triple<*, *, *>).getSecond() as String?,
                    (t2 as Triple<*, *, *>).getSecond() as String?
                )
            }
        })

    fun `_$_clearFindViewByIdCache`() {
        `_$_findViewCache`.clear()
    }

    fun `_$_findCachedViewById`(i: Int): View? {
        var findViewById: View?
        val map: Map<Integer, View> = `_$_findViewCache`
        val view: View? = map.get(Integer.valueOf(i))
        if (view == null) {
            val view2: View? = getView()
            if (view2 == null || (view2.findViewById(i).also({ findViewById = it })) == null) {
                return null
            }
            map.put(Integer.valueOf(i), findViewById)
            return findViewById
        }
        return view
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public /* synthetic */  override fun onDestroyView() {
        super.onDestroyView()
        `_$_clearFindViewByIdCache`()
    }

    private val currentLocale: String
        private get() {
            var locale: Locale
            val configuration: Configuration? = requireContext().getResources().getConfiguration()
            val language: String? = if ((configuration == null || (configuration.locale.also({
                    locale = it
                })) == null)) null else locale.getLanguage()
            return if (language == null) "en" else language
        }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public override fun onViewCreated(view: View, bundle: Bundle) {
        Intrinsics.checkNotNullParameter(view, "view")
        super.onViewCreated(view, bundle)
        SettingsFragment.Companion.Companion.setUpToolbar(
            this,
            R.string.category_preferred_media_and_lang
        )
    }

    @Override // androidx.preference.PreferenceFragmentCompat
    public override fun onCreatePreferences(bundle: Bundle, str: String) {
        UIHelper.INSTANCE.hideKeyboard(this)
        setPreferencesFromResource(R.xml.settings_media_lang, str)
        val defaultSharedPreferences: SharedPreferences =
            PreferenceManager.getDefaultSharedPreferences(requireContext())
        val settingsLang: SettingsLang = this
        val pref: Preference? =
            SettingsFragment.Companion.Companion.getPref(settingsLang, R.string.display_sub_key)
        if (pref != null) {
            pref.setOnPreferenceClickListener(object : OnPreferenceClickListener {
                // from class: com.lagradost.cloudstream3.ui.settings.-$$Lambda$SettingsLang$XimvwsyBCF2nU8KsBRRWWYbU9gg
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public override fun onPreferenceClick(preference: Preference): Boolean {
                    val `m8919onCreatePreferences$lambda3`: Boolean
                    `m8919onCreatePreferences$lambda3` = `m8919onCreatePreferences$lambda3`(
                        this@SettingsLang,
                        defaultSharedPreferences,
                        preference
                    )
                    return `m8919onCreatePreferences$lambda3`
                }
            })
        }
        val pref2: Preference? = SettingsFragment.Companion.Companion.getPref(
            settingsLang,
            R.string.prefer_media_type_key
        )
        if (pref2 != null) {
            pref2.setOnPreferenceClickListener(object : OnPreferenceClickListener {
                // from class: com.lagradost.cloudstream3.ui.settings.-$$Lambda$SettingsLang$EF8QMfZkrpYqYrX4H8ioqIWQqAM
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public override fun onPreferenceClick(preference: Preference): Boolean {
                    val `m8920onCreatePreferences$lambda4`: Boolean
                    `m8920onCreatePreferences$lambda4` = `m8920onCreatePreferences$lambda4`(
                        this@SettingsLang,
                        defaultSharedPreferences,
                        preference
                    )
                    return `m8920onCreatePreferences$lambda4`
                }
            })
        }
        val pref3: Preference? =
            SettingsFragment.Companion.Companion.getPref(settingsLang, R.string.locale_key)
        if (pref3 != null) {
            pref3.setOnPreferenceClickListener(object : OnPreferenceClickListener {
                // from class: com.lagradost.cloudstream3.ui.settings.-$$Lambda$SettingsLang$aFf4g7YQHz3wpRa41nO_SxxSUbg
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public override fun onPreferenceClick(preference: Preference): Boolean {
                    val `m8921onCreatePreferences$lambda8`: Boolean
                    `m8921onCreatePreferences$lambda8` = `m8921onCreatePreferences$lambda8`(
                        this@SettingsLang,
                        defaultSharedPreferences,
                        preference
                    )
                    return `m8921onCreatePreferences$lambda8`
                }
            })
        }
        val pref4: Preference? =
            SettingsFragment.Companion.Companion.getPref(settingsLang, R.string.provider_lang_key)
        if (pref4 != null) {
            pref4.setOnPreferenceClickListener(object : OnPreferenceClickListener {
                // from class: com.lagradost.cloudstream3.ui.settings.-$$Lambda$SettingsLang$Rir4mOxTpzOOLSSQ32UWvGSzhyI
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public override fun onPreferenceClick(preference: Preference): Boolean {
                    val `m8918onCreatePreferences$lambda12`: Boolean
                    `m8918onCreatePreferences$lambda12` = `m8918onCreatePreferences$lambda12`(
                        this@SettingsLang,
                        defaultSharedPreferences,
                        preference
                    )
                    return `m8918onCreatePreferences$lambda12`
                }
            })
        }
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onCreatePreferences$lambda-3  reason: not valid java name */
        fun `m8919onCreatePreferences$lambda3`(
            `this$0`: SettingsLang,
            sharedPreferences: SharedPreferences?,
            preference: Preference?
        ): Boolean {
            var apiDubstatusSettings: HashSet<DubStatus?>
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity == null || (APIHolder.INSTANCE.getApiDubstatusSettings(activity)
                    .also({ apiDubstatusSettings = it })) == null
            ) {
                return true
            }
            val values: Array<DubStatus?> = DubStatus.values()
            val arrayList: ArrayList = ArrayList(values.size)
            for (dubStatus: DubStatus in values) {
                arrayList.add(dubStatus.name())
            }
            val arrayList2: ArrayList = arrayList
            val arrayList3: ArrayList = ArrayList()
            val it: Iterator<DubStatus> = apiDubstatusSettings.iterator()
            while (it.hasNext()) {
                val i: DubStatus = it.next()
                Intrinsics.checkNotNullExpressionValue(i, "i")
                arrayList3.add(Integer.valueOf(ArraysKt.indexOf<DubStatus>(values, i)))
            }
            val activity2: FragmentActivity? = `this$0`.getActivity()
            if (activity2 != null) {
                val string: String = `this$0`.getString(R.string.display_subbed_dubbed_settings)
                Intrinsics.checkNotNullExpressionValue(
                    string,
                    "getString(R.string.display_subbed_dubbed_settings)"
                )
                SingleSelectionHelper.INSTANCE.showMultiDialog(
                    activity2,
                    arrayList2,
                    arrayList3,
                    string,
                    `SettingsLang$onCreatePreferences$1$1$1`.Companion.INSTANCE,
                    `SettingsLang$onCreatePreferences$1$1$2`(
                        sharedPreferences,
                        `this$0`,
                        values,
                        arrayList2
                    )
                )
                return true
            }
            return true
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onCreatePreferences$lambda-4  reason: not valid java name */
        fun `m8920onCreatePreferences$lambda4`(
            `this$0`: SettingsLang,
            sharedPreferences: SharedPreferences,
            preference: Preference?
        ): Boolean {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val stringArray: Array<String> =
                `this$0`.getResources().getStringArray(R.array.media_type_pref)
            Intrinsics.checkNotNullExpressionValue(
                stringArray,
                "resources.getStringArray(R.array.media_type_pref)"
            )
            val intArray: IntArray =
                `this$0`.getResources().getIntArray(R.array.media_type_pref_values)
            Intrinsics.checkNotNullExpressionValue(
                intArray,
                "resources.getIntArray(R.…y.media_type_pref_values)"
            )
            val i: Int =
                sharedPreferences.getInt(`this$0`.getString(R.string.prefer_media_type_key), 0)
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                val list: List<String> = ArraysKt.toList(stringArray)
                val indexOf: Int = ArraysKt.indexOf(intArray, i)
                val string: String = `this$0`.getString(R.string.preferred_media_settings)
                Intrinsics.checkNotNullExpressionValue(
                    string,
                    "getString(R.string.preferred_media_settings)"
                )
                SingleSelectionHelper.INSTANCE.showBottomDialog(
                    activity,
                    list,
                    indexOf,
                    string,
                    true,
                    `SettingsLang$onCreatePreferences$2$1`.Companion.INSTANCE,
                    `SettingsLang$onCreatePreferences$2$2`(sharedPreferences, `this$0`, intArray)
                )
                return true
            }
            return true
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onCreatePreferences$lambda-8  reason: not valid java name */
        fun `m8921onCreatePreferences$lambda8`(
            `this$0`: SettingsLang,
            sharedPreferences: SharedPreferences?,
            preference: Preference?
        ): Boolean {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val mutableList: List = CollectionsKt.toMutableList(`this$0`.languages as Collection?)
            val currentLocale: String = `this$0`.currentLocale
            val list: List<Triple<*, *, *>> = mutableList
            val arrayList: ArrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10))
            for (triple: Triple<*, *, *> in list) {
                arrayList.add(triple.getThird() as String?)
            }
            val arrayList2: ArrayList = arrayList
            val arrayList3: ArrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10))
            for (triple2: Triple<*, *, *> in list) {
                val str: String = triple2.component2() as String
                val str2: String = triple2.component3() as String
                var str3: String = triple2.component1() as String
                if (StringsKt.isBlank(str3)) {
                    var flagFromIso: String? = SubtitleHelper.INSTANCE.getFlagFromIso(str2)
                    if (flagFromIso == null) {
                        flagFromIso = MediaError.ERROR_TYPE_ERROR
                    }
                    str3 = flagFromIso
                }
                arrayList3.add(str3 + ' ' + str)
            }
            val arrayList4: ArrayList = arrayList3
            val indexOf: Int = arrayList2.indexOf(currentLocale)
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                val string: String = `this$0`.getString(R.string.app_language)
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.app_language)")
                SingleSelectionHelper.INSTANCE.showDialog(
                    activity,
                    arrayList4,
                    indexOf,
                    string,
                    true,
                    `SettingsLang$onCreatePreferences$3$1`.Companion.INSTANCE,
                    `SettingsLang$onCreatePreferences$3$2`(arrayList2, `this$0`, sharedPreferences)
                )
                return true
            }
            return true
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onCreatePreferences$lambda-12  reason: not valid java name */
        fun `m8918onCreatePreferences$lambda12`(
            `this$0`: SettingsLang,
            sharedPreferences: SharedPreferences?,
            preference: Preference?
        ): Boolean {
            var apiProviderLangSettings: HashSet<String?>
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity == null || (APIHolder.INSTANCE.getApiProviderLangSettings(activity)
                    .also({ apiProviderLangSettings = it })) == null
            ) {
                return true
            }
            val hashSet: HashSet = HashSet()
            for (mainAPI: MainAPI in APIHolder.INSTANCE.apis) {
                hashSet.add(mainAPI.getLang())
            }
            val arrayList: ArrayList = ArrayList()
            val it: Iterator<String> = apiProviderLangSettings.iterator()
            while (it.hasNext()) {
                val i: String = it.next()
                Intrinsics.checkNotNullExpressionValue(i, "i")
                arrayList.add(Integer.valueOf(CollectionsKt.indexOf(hashSet, i)))
            }
            val hashSet2: HashSet<String> = hashSet
            val arrayList2: ArrayList =
                ArrayList(CollectionsKt.collectionSizeOrDefault(hashSet2, 10))
            for (str: String? in hashSet2) {
                val flagFromIso: String = SubtitleHelper.INSTANCE.getFlagFromIso(str)
                val fromTwoLettersToLanguage: String =
                    SubtitleHelper.INSTANCE.fromTwoLettersToLanguage(str)
                arrayList2.add(
                    Tuples<Any?, Any?>(
                        str,
                        flagFromIso + ' ' + fromTwoLettersToLanguage
                    )
                )
            }
            val arrayList3: ArrayList = arrayList2
            val activity2: FragmentActivity? = `this$0`.getActivity()
            if (activity2 != null) {
                val singleSelectionHelper: SingleSelectionHelper = SingleSelectionHelper.INSTANCE
                val fragmentActivity: FragmentActivity = activity2
                val arrayList4: ArrayList<Tuples<*, *>> = arrayList3
                val arrayList5: ArrayList =
                    ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10))
                for (tuples: Tuples<*, *> in arrayList4) {
                    arrayList5.add(tuples.getSecond() as String?)
                }
                val string: String = `this$0`.getString(R.string.provider_lang_settings)
                Intrinsics.checkNotNullExpressionValue(
                    string,
                    "getString(R.string.provider_lang_settings)"
                )
                singleSelectionHelper.showMultiDialog(
                    fragmentActivity,
                    arrayList5,
                    arrayList,
                    string,
                    `SettingsLang$onCreatePreferences$4$1$2`.Companion.INSTANCE,
                    `SettingsLang$onCreatePreferences$4$1$3`(
                        sharedPreferences,
                        `this$0`,
                        arrayList3
                    )
                )
                return true
            }
            return true
        }
    }
}