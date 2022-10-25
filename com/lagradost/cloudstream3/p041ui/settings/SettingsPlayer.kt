package com.lagradost.cloudstream3.p041ui.settings

import android.content.Context
import androidx.preference.Preference
import kotlin.jvm.internal.Intrinsics

/* compiled from: SettingsPlayer.kt */
@Metadata(
    m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u000c"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/settings/SettingsPlayer;", "Landroidx/preference/PreferenceFragmentCompat;", "()V", "onCreatePreferences", "", "savedInstanceState", "Landroid/os/Bundle;", "rootKey", "", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.settings.SettingsPlayer */ /* loaded from: classes4.dex */
class SettingsPlayer constructor() : PreferenceFragmentCompat() {
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
        SettingsFragment.Companion.Companion.setUpToolbar(this, R.string.category_player)
    }

    @Override // androidx.preference.PreferenceFragmentCompat
    public override fun onCreatePreferences(bundle: Bundle, str: String) {
        UIHelper.INSTANCE.hideKeyboard(this)
        setPreferencesFromResource(R.xml.settings_player, str)
        val defaultSharedPreferences: SharedPreferences =
            PreferenceManager.getDefaultSharedPreferences(requireContext())
        val settingsPlayer: SettingsPlayer = this
        val pref: Preference? = SettingsFragment.Companion.Companion.getPref(
            settingsPlayer,
            R.string.video_buffer_length_key
        )
        if (pref != null) {
            pref.setOnPreferenceClickListener(object : OnPreferenceClickListener {
                // from class: com.lagradost.cloudstream3.ui.settings.-$$Lambda$SettingsPlayer$U_a0GWwN13U6QVBPIojHCsUTaoE
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public override fun onPreferenceClick(preference: Preference): Boolean {
                    val `m8924onCreatePreferences$lambda0`: Boolean
                    `m8924onCreatePreferences$lambda0` = `m8924onCreatePreferences$lambda0`(
                        this@SettingsPlayer,
                        defaultSharedPreferences,
                        preference
                    )
                    return `m8924onCreatePreferences$lambda0`
                }
            })
        }
        val pref2: Preference? = SettingsFragment.Companion.Companion.getPref(
            settingsPlayer,
            R.string.prefer_limit_title_key
        )
        if (pref2 != null) {
            pref2.setOnPreferenceClickListener(object : OnPreferenceClickListener {
                // from class: com.lagradost.cloudstream3.ui.settings.-$$Lambda$SettingsPlayer$yPwRv-7bhDVLu7iojeE2w5w9jUc
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public override fun onPreferenceClick(preference: Preference): Boolean {
                    val `m8925onCreatePreferences$lambda1`: Boolean
                    `m8925onCreatePreferences$lambda1` = `m8925onCreatePreferences$lambda1`(
                        this@SettingsPlayer,
                        defaultSharedPreferences,
                        preference
                    )
                    return `m8925onCreatePreferences$lambda1`
                }
            })
        }
        val pref3: Preference? = SettingsFragment.Companion.Companion.getPref(
            settingsPlayer,
            R.string.prefer_limit_title_rez_key
        )
        if (pref3 != null) {
            pref3.setOnPreferenceClickListener(object : OnPreferenceClickListener {
                // from class: com.lagradost.cloudstream3.ui.settings.-$$Lambda$SettingsPlayer$HL4W_cV4ZBrf6SP2y3YQOME0iXA
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public override fun onPreferenceClick(preference: Preference): Boolean {
                    val `m8928onCreatePreferences$lambda2`: Boolean
                    `m8928onCreatePreferences$lambda2` = `m8928onCreatePreferences$lambda2`(
                        this@SettingsPlayer,
                        defaultSharedPreferences,
                        preference
                    )
                    return `m8928onCreatePreferences$lambda2`
                }
            })
        }
        val pref4: Preference? =
            SettingsFragment.Companion.Companion.getPref(settingsPlayer, R.string.quality_pref_key)
        if (pref4 != null) {
            pref4.setOnPreferenceClickListener(object : OnPreferenceClickListener {
                // from class: com.lagradost.cloudstream3.ui.settings.-$$Lambda$SettingsPlayer$32gRM30kYFXjgY6HcLmya9bBBIw
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public override fun onPreferenceClick(preference: Preference): Boolean {
                    val `m8929onCreatePreferences$lambda5`: Boolean
                    `m8929onCreatePreferences$lambda5` = `m8929onCreatePreferences$lambda5`(
                        defaultSharedPreferences,
                        this,
                        preference
                    )
                    return `m8929onCreatePreferences$lambda5`
                }
            })
        }
        val pref5: Preference? = SettingsFragment.Companion.Companion.getPref(
            settingsPlayer,
            R.string.subtitle_settings_key
        )
        if (pref5 != null) {
            pref5.setOnPreferenceClickListener(object : OnPreferenceClickListener {
                // from class: com.lagradost.cloudstream3.ui.settings.-$$Lambda$SettingsPlayer$xi163W_nBPJikYGwIhfxo3gVizk
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public override fun onPreferenceClick(preference: Preference): Boolean {
                    val `m8930onCreatePreferences$lambda6`: Boolean
                    `m8930onCreatePreferences$lambda6` =
                        `m8930onCreatePreferences$lambda6`(this@SettingsPlayer, preference)
                    return `m8930onCreatePreferences$lambda6`
                }
            })
        }
        val pref6: Preference? = SettingsFragment.Companion.Companion.getPref(
            settingsPlayer,
            R.string.subtitle_settings_chromecast_key
        )
        if (pref6 != null) {
            pref6.setOnPreferenceClickListener(object : OnPreferenceClickListener {
                // from class: com.lagradost.cloudstream3.ui.settings.-$$Lambda$SettingsPlayer$iUXjQU-FQjAuR6nRAS8Lo5oR-zw
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public override fun onPreferenceClick(preference: Preference): Boolean {
                    val `m8931onCreatePreferences$lambda7`: Boolean
                    `m8931onCreatePreferences$lambda7` =
                        `m8931onCreatePreferences$lambda7`(this@SettingsPlayer, preference)
                    return `m8931onCreatePreferences$lambda7`
                }
            })
        }
        val pref7: Preference? = SettingsFragment.Companion.Companion.getPref(
            settingsPlayer,
            R.string.video_buffer_disk_key
        )
        if (pref7 != null) {
            pref7.setOnPreferenceClickListener(object : OnPreferenceClickListener {
                // from class: com.lagradost.cloudstream3.ui.settings.-$$Lambda$SettingsPlayer$nfy4F5CJiEyqyPqTS8mXtfm7S7E
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public override fun onPreferenceClick(preference: Preference): Boolean {
                    val `m8932onCreatePreferences$lambda8`: Boolean
                    `m8932onCreatePreferences$lambda8` = `m8932onCreatePreferences$lambda8`(
                        this@SettingsPlayer,
                        defaultSharedPreferences,
                        preference
                    )
                    return `m8932onCreatePreferences$lambda8`
                }
            })
        }
        val pref8: Preference? = SettingsFragment.Companion.Companion.getPref(
            settingsPlayer,
            R.string.video_buffer_size_key
        )
        if (pref8 != null) {
            pref8.setOnPreferenceClickListener(object : OnPreferenceClickListener {
                // from class: com.lagradost.cloudstream3.ui.settings.-$$Lambda$SettingsPlayer$hzSpHAzQriOL9dntMeXEU3iNvfc
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public override fun onPreferenceClick(preference: Preference): Boolean {
                    val `m8933onCreatePreferences$lambda9`: Boolean
                    `m8933onCreatePreferences$lambda9` = `m8933onCreatePreferences$lambda9`(
                        this@SettingsPlayer,
                        defaultSharedPreferences,
                        preference
                    )
                    return `m8933onCreatePreferences$lambda9`
                }
            })
        }
        val pref9: Preference? = SettingsFragment.Companion.Companion.getPref(
            settingsPlayer,
            R.string.video_buffer_clear_key
        )
        if (pref9 != null) {
            val context: Context? = getContext()
            val cacheDir: File? = if (context != null) context.getCacheDir() else null
            if (cacheDir == null) {
                return
            }
            Intrinsics.checkNotNullExpressionValue(cacheDir, "context?.cacheDir ?: return@let")
            `m8927onCreatePreferences$lambda11$updateSummery`(pref9, this, cacheDir)
            pref9.setOnPreferenceClickListener(object : OnPreferenceClickListener {
                // from class: com.lagradost.cloudstream3.ui.settings.-$$Lambda$SettingsPlayer$zLw1_s9W9sXVw_iwuvavTzROVXU
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public override fun onPreferenceClick(preference: Preference): Boolean {
                    val `m8926onCreatePreferences$lambda11$lambda10`: Boolean
                    `m8926onCreatePreferences$lambda11$lambda10` =
                        `m8926onCreatePreferences$lambda11$lambda10`(
                            cacheDir,
                            pref9,
                            this,
                            preference
                        )
                    return `m8926onCreatePreferences$lambda11$lambda10`
                }
            })
        }
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onCreatePreferences$lambda-0  reason: not valid java name */
        fun `m8924onCreatePreferences$lambda0`(
            `this$0`: SettingsPlayer,
            sharedPreferences: SharedPreferences,
            preference: Preference?
        ): Boolean {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val stringArray: Array<String> =
                `this$0`.getResources().getStringArray(R.array.video_buffer_length_names)
            Intrinsics.checkNotNullExpressionValue(
                stringArray,
                "resources.getStringArray…ideo_buffer_length_names)"
            )
            val intArray: IntArray =
                `this$0`.getResources().getIntArray(R.array.video_buffer_length_values)
            Intrinsics.checkNotNullExpressionValue(
                intArray,
                "resources.getIntArray(R.…deo_buffer_length_values)"
            )
            val i: Int =
                sharedPreferences.getInt(`this$0`.getString(R.string.video_buffer_length_key), 0)
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                val list: List<String> = ArraysKt.toList(stringArray)
                val indexOf: Int = ArraysKt.indexOf(intArray, i)
                val string: String = `this$0`.getString(R.string.video_buffer_length_settings)
                Intrinsics.checkNotNullExpressionValue(
                    string,
                    "getString(R.string.video_buffer_length_settings)"
                )
                SingleSelectionHelper.INSTANCE.showDialog(
                    activity,
                    list,
                    indexOf,
                    string,
                    true,
                    `SettingsPlayer$onCreatePreferences$1$1`.Companion.INSTANCE,
                    `SettingsPlayer$onCreatePreferences$1$2`(sharedPreferences, `this$0`, intArray)
                )
                return true
            }
            return true
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onCreatePreferences$lambda-1  reason: not valid java name */
        fun `m8925onCreatePreferences$lambda1`(
            `this$0`: SettingsPlayer,
            sharedPreferences: SharedPreferences,
            preference: Preference?
        ): Boolean {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val stringArray: Array<String> =
                `this$0`.getResources().getStringArray(R.array.limit_title_pref_names)
            Intrinsics.checkNotNullExpressionValue(
                stringArray,
                "resources.getStringArray…y.limit_title_pref_names)"
            )
            val intArray: IntArray =
                `this$0`.getResources().getIntArray(R.array.limit_title_pref_values)
            Intrinsics.checkNotNullExpressionValue(
                intArray,
                "resources.getIntArray(R.….limit_title_pref_values)"
            )
            val i: Int =
                sharedPreferences.getInt(`this$0`.getString(R.string.prefer_limit_title_key), 0)
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                val list: List<String> = ArraysKt.toList(stringArray)
                val indexOf: Int = ArraysKt.indexOf(intArray, i)
                val string: String = `this$0`.getString(R.string.limit_title)
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.limit_title)")
                SingleSelectionHelper.INSTANCE.showBottomDialog(
                    activity,
                    list,
                    indexOf,
                    string,
                    true,
                    `SettingsPlayer$onCreatePreferences$2$1`.Companion.INSTANCE,
                    `SettingsPlayer$onCreatePreferences$2$2`(sharedPreferences, `this$0`, intArray)
                )
                return true
            }
            return true
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onCreatePreferences$lambda-2  reason: not valid java name */
        fun `m8928onCreatePreferences$lambda2`(
            `this$0`: SettingsPlayer,
            sharedPreferences: SharedPreferences,
            preference: Preference?
        ): Boolean {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val stringArray: Array<String> =
                `this$0`.getResources().getStringArray(R.array.limit_title_rez_pref_names)
            Intrinsics.checkNotNullExpressionValue(
                stringArray,
                "resources.getStringArray…mit_title_rez_pref_names)"
            )
            val intArray: IntArray =
                `this$0`.getResources().getIntArray(R.array.limit_title_rez_pref_values)
            Intrinsics.checkNotNullExpressionValue(
                intArray,
                "resources.getIntArray(R.…it_title_rez_pref_values)"
            )
            val i: Int =
                sharedPreferences.getInt(`this$0`.getString(R.string.prefer_limit_title_rez_key), 3)
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                val list: List<String> = ArraysKt.toList(stringArray)
                val indexOf: Int = ArraysKt.indexOf(intArray, i)
                val string: String = `this$0`.getString(R.string.limit_title_rez)
                Intrinsics.checkNotNullExpressionValue(
                    string,
                    "getString(R.string.limit_title_rez)"
                )
                SingleSelectionHelper.INSTANCE.showBottomDialog(
                    activity,
                    list,
                    indexOf,
                    string,
                    true,
                    `SettingsPlayer$onCreatePreferences$3$1`.Companion.INSTANCE,
                    `SettingsPlayer$onCreatePreferences$3$2`(sharedPreferences, `this$0`, intArray)
                )
                return true
            }
            return true
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onCreatePreferences$lambda-5  reason: not valid java name */
        fun `m8929onCreatePreferences$lambda5`(
            sharedPreferences: SharedPreferences,
            `this$0`: SettingsPlayer,
            preference: Preference?
        ): Boolean {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val values: Array<Qualities> = Qualities.values()
            val arrayList: ArrayList = ArrayList(values.size)
            for (qualities: Qualities in values) {
                arrayList.add(Integer.valueOf(qualities.value))
            }
            val mutableList: List =
                CollectionsKt.toMutableList(CollectionsKt.reversed(arrayList) as Collection?)
            mutableList.remove(Integer.valueOf(Qualities.Unknown.value))
            val list: List<Number> = mutableList
            val arrayList2: ArrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10))
            for (number: Number in list) {
                arrayList2.add(Qualities.Companion.getStringByInt(Integer.valueOf(number.intValue())))
            }
            val arrayList3: ArrayList = arrayList2
            val i: Int = sharedPreferences.getInt(
                `this$0`.getString(R.string.quality_pref_key),
                (ArraysKt.last<Qualities>(Qualities.values()) as Qualities).value
            )
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                val list2: List<String> = CollectionsKt.toList(arrayList3)
                val indexOf: Int = mutableList.indexOf(Integer.valueOf(i))
                val string: String = `this$0`.getString(R.string.watch_quality_pref)
                Intrinsics.checkNotNullExpressionValue(
                    string,
                    "getString(R.string.watch_quality_pref)"
                )
                SingleSelectionHelper.INSTANCE.showBottomDialog(
                    activity,
                    list2,
                    indexOf,
                    string,
                    true,
                    `SettingsPlayer$onCreatePreferences$4$1`.Companion.INSTANCE,
                    `SettingsPlayer$onCreatePreferences$4$2`(
                        sharedPreferences,
                        `this$0`,
                        mutableList
                    )
                )
                return true
            }
            return true
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onCreatePreferences$lambda-6  reason: not valid java name */
        fun `m8930onCreatePreferences$lambda6`(
            `this$0`: SettingsPlayer,
            preference: Preference?
        ): Boolean {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            SubtitlesFragment.Companion.Companion.push(`this$0`.getActivity(), false)
            return true
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onCreatePreferences$lambda-7  reason: not valid java name */
        fun `m8931onCreatePreferences$lambda7`(
            `this$0`: SettingsPlayer,
            preference: Preference?
        ): Boolean {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            ChromecastSubtitlesFragment.Companion.Companion.push(`this$0`.getActivity(), false)
            return true
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onCreatePreferences$lambda-8  reason: not valid java name */
        fun `m8932onCreatePreferences$lambda8`(
            `this$0`: SettingsPlayer,
            sharedPreferences: SharedPreferences,
            preference: Preference?
        ): Boolean {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val stringArray: Array<String> =
                `this$0`.getResources().getStringArray(R.array.video_buffer_size_names)
            Intrinsics.checkNotNullExpressionValue(
                stringArray,
                "resources.getStringArray….video_buffer_size_names)"
            )
            val intArray: IntArray =
                `this$0`.getResources().getIntArray(R.array.video_buffer_size_values)
            Intrinsics.checkNotNullExpressionValue(
                intArray,
                "resources.getIntArray(R.…video_buffer_size_values)"
            )
            val i: Int =
                sharedPreferences.getInt(`this$0`.getString(R.string.video_buffer_disk_key), 0)
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                val list: List<String> = ArraysKt.toList(stringArray)
                val indexOf: Int = ArraysKt.indexOf(intArray, i)
                val string: String = `this$0`.getString(R.string.video_buffer_disk_settings)
                Intrinsics.checkNotNullExpressionValue(
                    string,
                    "getString(R.string.video_buffer_disk_settings)"
                )
                SingleSelectionHelper.INSTANCE.showDialog(
                    activity,
                    list,
                    indexOf,
                    string,
                    true,
                    `SettingsPlayer$onCreatePreferences$7$1`.Companion.INSTANCE,
                    `SettingsPlayer$onCreatePreferences$7$2`(sharedPreferences, `this$0`, intArray)
                )
                return true
            }
            return true
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onCreatePreferences$lambda-9  reason: not valid java name */
        fun `m8933onCreatePreferences$lambda9`(
            `this$0`: SettingsPlayer,
            sharedPreferences: SharedPreferences,
            preference: Preference?
        ): Boolean {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val stringArray: Array<String> =
                `this$0`.getResources().getStringArray(R.array.video_buffer_size_names)
            Intrinsics.checkNotNullExpressionValue(
                stringArray,
                "resources.getStringArray….video_buffer_size_names)"
            )
            val intArray: IntArray =
                `this$0`.getResources().getIntArray(R.array.video_buffer_size_values)
            Intrinsics.checkNotNullExpressionValue(
                intArray,
                "resources.getIntArray(R.…video_buffer_size_values)"
            )
            val i: Int =
                sharedPreferences.getInt(`this$0`.getString(R.string.video_buffer_size_key), 0)
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                val list: List<String> = ArraysKt.toList(stringArray)
                val indexOf: Int = ArraysKt.indexOf(intArray, i)
                val string: String = `this$0`.getString(R.string.video_buffer_size_settings)
                Intrinsics.checkNotNullExpressionValue(
                    string,
                    "getString(R.string.video_buffer_size_settings)"
                )
                SingleSelectionHelper.INSTANCE.showDialog(
                    activity,
                    list,
                    indexOf,
                    string,
                    true,
                    `SettingsPlayer$onCreatePreferences$8$1`.Companion.INSTANCE,
                    `SettingsPlayer$onCreatePreferences$8$2`(sharedPreferences, `this$0`, intArray)
                )
                return true
            }
            return true
        }

        /* renamed from: onCreatePreferences$lambda-11$updateSummery  reason: not valid java name */
        private fun `m8927onCreatePreferences$lambda11$updateSummery`(
            preference: Preference,
            settingsPlayer: SettingsPlayer,
            file: File?
        ) {
            try {
                val string: String = settingsPlayer.getString(R.string.mb_format)
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.mb_format)")
                val format: String = String.format(
                    string,
                    Arrays.copyOf(
                        arrayOf<Object>(
                            Long.valueOf(
                                SettingsFragment.Companion.Companion.getFolderSize(
                                    file
                                ) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED
                            )
                        ), 1
                    )
                )
                Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)")
                preference.setSummary(format)
            } catch (e: Exception) {
                ArchComponentExt.logError(e)
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onCreatePreferences$lambda-11$lambda-10  reason: not valid java name */
        fun `m8926onCreatePreferences$lambda11$lambda10`(
            cacheDir: File?,
            pref: Preference,
            `this$0`: SettingsPlayer,
            preference: Preference?
        ): Boolean {
            Intrinsics.checkNotNullParameter(cacheDir, "\$cacheDir")
            Intrinsics.checkNotNullParameter(pref, "\$pref")
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            try {
                FilesKt.deleteRecursively(cacheDir)
                `m8927onCreatePreferences$lambda11$updateSummery`(pref, `this$0`, cacheDir)
                return true
            } catch (e: Exception) {
                ArchComponentExt.logError(e)
                return true
            }
        }
    }
}