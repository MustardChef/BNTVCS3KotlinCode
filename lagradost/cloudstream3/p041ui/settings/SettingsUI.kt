package com.lagradost.cloudstream3.p041ui.settings

import android.content.SharedPreferences
import androidx.preference.Preference
import kotlin.jvm.internal.Intrinsics

/* compiled from: SettingsUI.kt */
@Metadata(
    m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u000c"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/settings/SettingsUI;", "Landroidx/preference/PreferenceFragmentCompat;", "()V", "onCreatePreferences", "", "savedInstanceState", "Landroid/os/Bundle;", "rootKey", "", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.settings.SettingsUI */ /* loaded from: classes4.dex */
class SettingsUI constructor() : PreferenceFragmentCompat() {
    var `_$_findViewCache`: Map<Integer, View> = LinkedHashMap()
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

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public override fun onViewCreated(view: View, bundle: Bundle) {
        Intrinsics.checkNotNullParameter(view, "view")
        super.onViewCreated(view, bundle)
        SettingsFragment.Companion.Companion.setUpToolbar(this, R.string.category_ui)
    }

    @Override // androidx.preference.PreferenceFragmentCompat
    public override fun onCreatePreferences(bundle: Bundle, str: String) {
        UIHelper.INSTANCE.hideKeyboard(this)
        setPreferencesFromResource(R.xml.settins_ui, str)
        val defaultSharedPreferences: SharedPreferences =
            PreferenceManager.getDefaultSharedPreferences(requireContext())
        val settingsUI: SettingsUI = this
        val pref: Preference? =
            SettingsFragment.Companion.Companion.getPref(settingsUI, R.string.poster_ui_key)
        if (pref != null) {
            pref.setOnPreferenceClickListener(object : OnPreferenceClickListener {
                // from class: com.lagradost.cloudstream3.ui.settings.-$$Lambda$SettingsUI$voEzFzz65rtBbGkjr_P-4GXEHrs
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public override fun onPreferenceClick(preference: Preference): Boolean {
                    val `m8935onCreatePreferences$lambda2`: Boolean
                    `m8935onCreatePreferences$lambda2` = `m8935onCreatePreferences$lambda2`(
                        this@SettingsUI,
                        defaultSharedPreferences,
                        preference
                    )
                    return `m8935onCreatePreferences$lambda2`
                }
            })
        }
        val pref2: Preference? =
            SettingsFragment.Companion.Companion.getPref(settingsUI, R.string.app_layout_key)
        if (pref2 != null) {
            pref2.setOnPreferenceClickListener(object : OnPreferenceClickListener {
                // from class: com.lagradost.cloudstream3.ui.settings.-$$Lambda$SettingsUI$8FqnSbqctDZv2CPtqGjWp_H1Stc
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public override fun onPreferenceClick(preference: Preference): Boolean {
                    val `m8936onCreatePreferences$lambda3`: Boolean
                    `m8936onCreatePreferences$lambda3` = `m8936onCreatePreferences$lambda3`(
                        this@SettingsUI,
                        defaultSharedPreferences,
                        preference
                    )
                    return `m8936onCreatePreferences$lambda3`
                }
            })
        }
        val pref3: Preference? =
            SettingsFragment.Companion.Companion.getPref(settingsUI, R.string.app_theme_key)
        if (pref3 != null) {
            pref3.setOnPreferenceClickListener(object : OnPreferenceClickListener {
                // from class: com.lagradost.cloudstream3.ui.settings.-$$Lambda$SettingsUI$NcqQM64WzWxt0xGGxkLmem02dEE
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public override fun onPreferenceClick(preference: Preference): Boolean {
                    val `m8937onCreatePreferences$lambda4`: Boolean
                    `m8937onCreatePreferences$lambda4` = `m8937onCreatePreferences$lambda4`(
                        this@SettingsUI,
                        defaultSharedPreferences,
                        preference
                    )
                    return `m8937onCreatePreferences$lambda4`
                }
            })
        }
        val pref4: Preference? =
            SettingsFragment.Companion.Companion.getPref(settingsUI, R.string.primary_color_key)
        if (pref4 != null) {
            pref4.setOnPreferenceClickListener(object : OnPreferenceClickListener {
                // from class: com.lagradost.cloudstream3.ui.settings.-$$Lambda$SettingsUI$HIcNBM4WW0Yb4vDKQ1Tv1uJAVC8
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public override fun onPreferenceClick(preference: Preference): Boolean {
                    val `m8938onCreatePreferences$lambda5`: Boolean
                    `m8938onCreatePreferences$lambda5` = `m8938onCreatePreferences$lambda5`(
                        this@SettingsUI,
                        defaultSharedPreferences,
                        preference
                    )
                    return `m8938onCreatePreferences$lambda5`
                }
            })
        }
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onCreatePreferences$lambda-2  reason: not valid java name */
        fun `m8935onCreatePreferences$lambda2`(
            `this$0`: SettingsUI,
            sharedPreferences: SharedPreferences,
            preference: Preference
        ): Boolean {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val stringArray: Array<String> =
                `this$0`.getResources().getStringArray(R.array.poster_ui_options)
            Intrinsics.checkNotNullExpressionValue(
                stringArray,
                "resources.getStringArray….array.poster_ui_options)"
            )
            val stringArray2: Array<String?> =
                `this$0`.getResources().getStringArray(R.array.poster_ui_options_values)
            Intrinsics.checkNotNullExpressionValue(
                stringArray2,
                "resources.getStringArray…poster_ui_options_values)"
            )
            val arrayList: ArrayList = ArrayList(stringArray2.size)
            var i: Int = 0
            for (str: String? in stringArray2) {
                arrayList.add(Boolean.valueOf(sharedPreferences.getBoolean(str, true)))
            }
            val arrayList2: ArrayList = ArrayList()
            for (obj: Object in arrayList) {
                val i2: Int = i + 1
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow()
                }
                val valueOf: Integer? =
                    if ((obj as Boolean).booleanValue()) Integer.valueOf(i) else null
                if (valueOf != null) {
                    arrayList2.add(valueOf)
                }
                i = i2
            }
            val arrayList3: ArrayList = arrayList2
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                val list: List<String> = ArraysKt.toList(stringArray)
                val string: String = `this$0`.getString(R.string.poster_ui_settings)
                Intrinsics.checkNotNullExpressionValue(
                    string,
                    "getString(R.string.poster_ui_settings)"
                )
                SingleSelectionHelper.INSTANCE.showMultiDialog(
                    activity,
                    list,
                    arrayList3,
                    string,
                    `SettingsUI$onCreatePreferences$1$1`.Companion.INSTANCE,
                    `SettingsUI$onCreatePreferences$1$2`(
                        sharedPreferences,
                        stringArray2,
                        preference
                    )
                )
            }
            return true
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onCreatePreferences$lambda-3  reason: not valid java name */
        fun `m8936onCreatePreferences$lambda3`(
            `this$0`: SettingsUI,
            sharedPreferences: SharedPreferences,
            preference: Preference?
        ): Boolean {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val stringArray: Array<String> =
                `this$0`.getResources().getStringArray(R.array.app_layout)
            Intrinsics.checkNotNullExpressionValue(
                stringArray,
                "resources.getStringArray(R.array.app_layout)"
            )
            val intArray: IntArray = `this$0`.getResources().getIntArray(R.array.app_layout_values)
            Intrinsics.checkNotNullExpressionValue(
                intArray,
                "resources.getIntArray(R.array.app_layout_values)"
            )
            val i: Int = sharedPreferences.getInt(`this$0`.getString(R.string.app_layout_key), -1)
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                val list: List<String> = ArraysKt.toList(stringArray)
                val indexOf: Int = ArraysKt.indexOf(intArray, i)
                val string: String = `this$0`.getString(R.string.app_layout)
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.app_layout)")
                SingleSelectionHelper.INSTANCE.showBottomDialog(
                    activity,
                    list,
                    indexOf,
                    string,
                    true,
                    `SettingsUI$onCreatePreferences$2$1`.Companion.INSTANCE,
                    `SettingsUI$onCreatePreferences$2$2`(sharedPreferences, `this$0`, intArray)
                )
                return true
            }
            return true
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onCreatePreferences$lambda-4  reason: not valid java name */
        fun `m8937onCreatePreferences$lambda4`(
            `this$0`: SettingsUI,
            sharedPreferences: SharedPreferences,
            preference: Preference?
        ): Boolean {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val stringArray: Array<String> =
                `this$0`.getResources().getStringArray(R.array.themes_names)
            Intrinsics.checkNotNullExpressionValue(
                stringArray,
                "resources.getStringArray(R.array.themes_names)"
            )
            val stringArray2: Array<String?> =
                `this$0`.getResources().getStringArray(R.array.themes_names_values)
            Intrinsics.checkNotNullExpressionValue(
                stringArray2,
                "resources.getStringArray…rray.themes_names_values)"
            )
            val string: String = sharedPreferences.getString(
                `this$0`.getString(R.string.app_theme_key),
                ArraysKt.first(stringArray2)
            )
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                val list: List<String> = ArraysKt.toList(stringArray)
                val indexOf: Int = ArraysKt.indexOf(stringArray2, string)
                val string2: String = `this$0`.getString(R.string.app_theme_settings)
                Intrinsics.checkNotNullExpressionValue(
                    string2,
                    "getString(R.string.app_theme_settings)"
                )
                SingleSelectionHelper.INSTANCE.showBottomDialog(
                    activity,
                    list,
                    indexOf,
                    string2,
                    true,
                    `SettingsUI$onCreatePreferences$3$1`.Companion.INSTANCE,
                    `SettingsUI$onCreatePreferences$3$2`(sharedPreferences, `this$0`, stringArray2)
                )
                return true
            }
            return true
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onCreatePreferences$lambda-5  reason: not valid java name */
        fun `m8938onCreatePreferences$lambda5`(
            `this$0`: SettingsUI,
            sharedPreferences: SharedPreferences,
            preference: Preference?
        ): Boolean {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val stringArray: Array<String> =
                `this$0`.getResources().getStringArray(R.array.themes_overlay_names)
            Intrinsics.checkNotNullExpressionValue(
                stringArray,
                "resources.getStringArray…ray.themes_overlay_names)"
            )
            val stringArray2: Array<String?> =
                `this$0`.getResources().getStringArray(R.array.themes_overlay_names_values)
            Intrinsics.checkNotNullExpressionValue(
                stringArray2,
                "resources.getStringArray…mes_overlay_names_values)"
            )
            val string: String = sharedPreferences.getString(
                `this$0`.getString(R.string.primary_color_key),
                ArraysKt.first(stringArray2)
            )
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                val list: List<String> = ArraysKt.toList(stringArray)
                val indexOf: Int = ArraysKt.indexOf(stringArray2, string)
                val string2: String = `this$0`.getString(R.string.primary_color_settings)
                Intrinsics.checkNotNullExpressionValue(
                    string2,
                    "getString(R.string.primary_color_settings)"
                )
                SingleSelectionHelper.INSTANCE.showDialog(
                    activity,
                    list,
                    indexOf,
                    string2,
                    true,
                    `SettingsUI$onCreatePreferences$4$1`.Companion.INSTANCE,
                    `SettingsUI$onCreatePreferences$4$2`(sharedPreferences, `this$0`, stringArray2)
                )
                return true
            }
            return true
        }
    }
}