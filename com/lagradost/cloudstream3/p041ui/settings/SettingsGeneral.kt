package com.lagradost.cloudstream3.p041ui.settings

import android.content.Context
import androidx.preference.Preference
import kotlin.jvm.internal.Intrinsics

/* compiled from: SettingsGeneral.kt */
@Metadata(
    m108d1 = ["\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\u000c\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/settings/SettingsGeneral;", "Landroidx/preference/PreferenceFragmentCompat;", "()V", "pathPicker", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/net/Uri;", "onCreatePreferences", "", "savedInstanceState", "Landroid/os/Bundle;", "rootKey", "", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "CustomSite", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.settings.SettingsGeneral */ /* loaded from: classes4.dex */
class SettingsGeneral constructor() : PreferenceFragmentCompat() {
    var `_$_findViewCache`: Map<Integer, View> = LinkedHashMap()
    val pathPicker: ActivityResultLauncher<Uri>
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

    init {
        val registerForActivityResult: ActivityResultLauncher<Uri> =
            registerForActivityResult(OpenDocumentTree(), object : ActivityResultCallback<Any?> {
                // from class: com.lagradost.cloudstream3.ui.settings.-$$Lambda$SettingsGeneral$8FMX6Ki1qpQHoVxwfvTmzo0N7CI
                @Override // androidx.activity.result.ActivityResultCallback
                public override fun onActivityResult(obj: Object) {
                    `m8915pathPicker$lambda1`(this@SettingsGeneral, obj as Uri?)
                }
            })
        Intrinsics.checkNotNullExpressionValue(
            registerForActivityResult,
            "registerForActivityResul…)\n            }\n        }"
        )
        pathPicker = registerForActivityResult
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public override fun onViewCreated(view: View, bundle: Bundle) {
        Intrinsics.checkNotNullParameter(view, "view")
        super.onViewCreated(view, bundle)
        SettingsFragment.Companion.Companion.setUpToolbar(this, R.string.category_general)
    }

    /* compiled from: SettingsGeneral.kt */
    @Metadata(
        m108d1 = ["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000c\u0010\t¨\u0006\u0018"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/settings/SettingsGeneral\$CustomSite;", "", "parentJavaClass", "", "name", "url", "lang", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLang", "()Ljava/lang/String;", "getName", "getParentJavaClass", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.settings.SettingsGeneral$CustomSite */ /* loaded from: classes4.dex */
    class CustomSite constructor(
        @JsonProperty("parentJavaClass") parentJavaClass: String,
        @JsonProperty("name") name: String,
        @JsonProperty("url") url: String,
        @JsonProperty("lang") lang: String
    ) {
        val lang: String
        val name: String
        val parentJavaClass: String
        val url: String
        operator fun component1(): String {
            return parentJavaClass
        }

        operator fun component2(): String {
            return name
        }

        operator fun component3(): String {
            return url
        }

        operator fun component4(): String {
            return lang
        }

        fun copy(
            @JsonProperty("parentJavaClass") parentJavaClass: String,
            @JsonProperty("name") name: String,
            @JsonProperty("url") url: String,
            @JsonProperty("lang") lang: String
        ): CustomSite {
            Intrinsics.checkNotNullParameter(parentJavaClass, "parentJavaClass")
            Intrinsics.checkNotNullParameter(name, "name")
            Intrinsics.checkNotNullParameter(url, "url")
            Intrinsics.checkNotNullParameter(lang, "lang")
            return CustomSite(parentJavaClass, name, url, lang)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is CustomSite) {
                val customSite: CustomSite = obj
                return Intrinsics.areEqual(
                    parentJavaClass,
                    customSite.parentJavaClass
                ) && Intrinsics.areEqual(
                    name, customSite.name
                ) && Intrinsics.areEqual(url, customSite.url) && Intrinsics.areEqual(
                    lang, customSite.lang
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return (((((parentJavaClass.hashCode() * 31) + name.hashCode()) * 31) + url.hashCode()) * 31) + lang.hashCode()
        }

        override fun toString(): String {
            return "CustomSite(parentJavaClass=" + parentJavaClass + ", name=" + name + ", url=" + url + ", lang=" + lang + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(parentJavaClass, "parentJavaClass")
            Intrinsics.checkNotNullParameter(name, "name")
            Intrinsics.checkNotNullParameter(url, "url")
            Intrinsics.checkNotNullParameter(lang, "lang")
            this.parentJavaClass = parentJavaClass
            this.name = name
            this.url = url
            this.lang = lang
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                customSite: CustomSite,
                str: String,
                str2: String,
                str3: String,
                str4: String,
                i: Int,
                obj: Object?
            ): CustomSite {
                var str: String = str
                var str2: String = str2
                var str3: String = str3
                var str4: String = str4
                if ((i and 1) != 0) {
                    str = customSite.parentJavaClass
                }
                if ((i and 2) != 0) {
                    str2 = customSite.name
                }
                if ((i and 4) != 0) {
                    str3 = customSite.url
                }
                if ((i and 8) != 0) {
                    str4 = customSite.lang
                }
                return customSite.copy(str, str2, str3, str4)
            }
        }
    }

    @Override // androidx.preference.PreferenceFragmentCompat
    public override fun onCreatePreferences(bundle: Bundle, str: String) {
        val str2: String
        UIHelper.INSTANCE.hideKeyboard(this)
        setPreferencesFromResource(R.xml.settins_general, str)
        val defaultSharedPreferences: SharedPreferences =
            PreferenceManager.getDefaultSharedPreferences(requireContext())
        val settingsGeneral: SettingsGeneral = this
        val pref: Preference? = SettingsFragment.Companion.Companion.getPref(
            settingsGeneral,
            R.string.override_site_key
        )
        if (pref != null) {
            pref.setOnPreferenceClickListener(object : OnPreferenceClickListener {
                // from class: com.lagradost.cloudstream3.ui.settings.-$$Lambda$SettingsGeneral$NY6C_sviY8GpDh_eLOkPjcXMwIM
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public override fun onPreferenceClick(preference: Preference): Boolean {
                    val `m8911onCreatePreferences$lambda8`: Boolean
                    `m8911onCreatePreferences$lambda8` =
                        `m8911onCreatePreferences$lambda8`(this@SettingsGeneral, preference)
                    return `m8911onCreatePreferences$lambda8`
                }
            })
        }
        val pref2: Preference? =
            SettingsFragment.Companion.Companion.getPref(settingsGeneral, R.string.legal_notice_key)
        if (pref2 != null) {
            pref2.setOnPreferenceClickListener(
                `$$Lambda$SettingsGeneral$FYlCQVujJ8iEr7ZEFy64GbqALbY`.Companion.INSTANCE
            )
        }
        val pref3: Preference? =
            SettingsFragment.Companion.Companion.getPref(settingsGeneral, R.string.dns_key)
        if (pref3 != null) {
            pref3.setOnPreferenceClickListener(object : OnPreferenceClickListener {
                // from class: com.lagradost.cloudstream3.ui.settings.-$$Lambda$SettingsGeneral$UOHRGNhbwPrt7UfmUGnAhY4PO0Q
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public override fun onPreferenceClick(preference: Preference): Boolean {
                    val `m8908onCreatePreferences$lambda10`: Boolean
                    `m8908onCreatePreferences$lambda10` = `m8908onCreatePreferences$lambda10`(
                        this@SettingsGeneral,
                        defaultSharedPreferences,
                        preference
                    )
                    return `m8908onCreatePreferences$lambda10`
                }
            })
        }
        val pref4: Preference? = SettingsFragment.Companion.Companion.getPref(
            settingsGeneral,
            R.string.download_path_key
        )
        if (pref4 != null) {
            pref4.setOnPreferenceClickListener(object : OnPreferenceClickListener {
                // from class: com.lagradost.cloudstream3.ui.settings.-$$Lambda$SettingsGeneral$ExgAbz2aUWv-XY_MME4RucdN_88
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public override fun onPreferenceClick(preference: Preference): Boolean {
                    val `m8909onCreatePreferences$lambda11`: Boolean
                    `m8909onCreatePreferences$lambda11` = `m8909onCreatePreferences$lambda11`(
                        defaultSharedPreferences,
                        this,
                        preference
                    )
                    return `m8909onCreatePreferences$lambda11`
                }
            })
        }
        try {
            SettingsFragment.Companion.Companion.setBeneneCount(
                defaultSharedPreferences.getInt(
                    getString(R.string.benene_count),
                    0
                )
            )
            val pref5: Preference? =
                SettingsFragment.Companion.Companion.getPref(this, R.string.benene_count)
            if (pref5 != null) {
                if (SettingsFragment.Companion.Companion.getBeneneCount() <= 0) {
                    str2 = getString(R.string.benene_count_text_none)
                } else {
                    val string: String = getString(R.string.benene_count_text)
                    Intrinsics.checkNotNullExpressionValue(
                        string,
                        "getString(\n             …ext\n                    )"
                    )
                    val format: String = String.format(
                        string,
                        Arrays.copyOf(
                            arrayOf<Object>(Integer.valueOf(SettingsFragment.Companion.Companion.getBeneneCount())),
                            1
                        )
                    )
                    Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)")
                    str2 = format
                }
                pref5.setSummary(str2)
                pref5.setOnPreferenceClickListener(object : OnPreferenceClickListener {
                    // from class: com.lagradost.cloudstream3.ui.settings.-$$Lambda$SettingsGeneral$FLfAlXn3jhfkigb2guBMG18tvcg
                    @Override // androidx.preference.Preference.OnPreferenceClickListener
                    public override fun onPreferenceClick(preference: Preference): Boolean {
                        val `m8910onCreatePreferences$lambda13$lambda12`: Boolean
                        `m8910onCreatePreferences$lambda13$lambda12` =
                            `m8910onCreatePreferences$lambda13$lambda12`(
                                defaultSharedPreferences,
                                this,
                                preference
                            )
                        return `m8910onCreatePreferences$lambda13$lambda12`
                    }
                })
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: pathPicker$lambda-1  reason: not valid java name */
        fun `m8915pathPicker$lambda1`(`this$0`: SettingsGeneral, uri: Uri?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            if (uri == null) {
                return
            }
            var context: Context? = `this$0`.getContext()
            if (context == null && (AcraApplication.Companion.context.also({
                    context = it
                })) == null) {
                return
            }
            context.getContentResolver().takePersistableUriPermission(uri, 3)
            val fromUri: UniFile = UniFile.fromUri(context, uri)
            System.out.println(("Selected URI path: " + uri + " - Full path: " + fromUri.getFilePath()) as Object?)
            PreferenceManager.getDefaultSharedPreferences(context).edit()
                .putString(`this$0`.getString(R.string.download_path_key), uri.toString()).apply()
            var filePath: String? = fromUri.getFilePath()
            if (filePath == null) {
                filePath = uri.toString()
            }
            PreferenceManager.getDefaultSharedPreferences(context).edit()
                .putString(`this$0`.getString(R.string.download_path_pref), filePath).apply()
        }

        /* JADX INFO: Access modifiers changed from: private */
        fun `onCreatePreferences$getCurrent`(): List<CustomSite> {
            var mutableList: List<CustomSite?>?
            val context: Context? = AcraApplication.Companion.context
            var obj: Object? = null
            if (context != null) {
                val dataStore: DataStore = DataStore.INSTANCE
                try {
                    val string: String? = dataStore.getSharedPrefs(context)
                        .getString(DataStoreKt.USER_PROVIDER_API, null)
                    if (string != null) {
                        Intrinsics.checkNotNullExpressionValue(
                            string,
                            "getSharedPrefs().getStri…h, null) ?: return defVal"
                        )
                        val readValue: Object =
                            dataStore.mapper.readValue(string, Array<CustomSite>::class.java)
                        Intrinsics.checkNotNullExpressionValue(
                            readValue,
                            "mapper.readValue(this, T::class.java)"
                        )
                        obj = readValue
                    }
                } catch (unused: Exception) {
                }
            }
            val customSiteArr: Array<CustomSite>? = obj
            return if ((customSiteArr == null || (ArraysKt.toMutableList(customSiteArr)
                    .also({ mutableList = it })) == null)
            ) ArrayList() else mutableList
        }

        private fun `onCreatePreferences$showAdd`(settingsGeneral: SettingsGeneral) {
            var string: String?
            val hashSet: HashSet = HashSet()
            val arrayList: ArrayList = ArrayList()
            for (obj: Object in APIHolder.INSTANCE.allProviders) {
                if (hashSet.add((obj as MainAPI).getClass())) {
                    arrayList.add(obj)
                }
            }
            val sortedWith: List = CollectionsKt.sortedWith(arrayList, object : Comparator() {
                // from class: com.lagradost.cloudstream3.ui.settings.SettingsGeneral$onCreatePreferences$showAdd$$inlined$sortedBy$1
                @Override // java.util.Comparator
                fun compare(t: T, t2: T): Int {
                    return ComparisonsKt.compareValues<Comparable<*>>(
                        (t as MainAPI).name,
                        (t2 as MainAPI).name
                    )
                }
            })
            val activity: FragmentActivity? = settingsGeneral.getActivity()
            if (activity != null) {
                val singleSelectionHelper: SingleSelectionHelper = SingleSelectionHelper.INSTANCE
                val fragmentActivity: FragmentActivity = activity
                val list: List<MainAPI> = sortedWith
                val arrayList2: ArrayList =
                    ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10))
                for (mainAPI: MainAPI in list) {
                    arrayList2.add(mainAPI.name + " (" + mainAPI.mainUrl + ')')
                }
                val arrayList3: ArrayList = arrayList2
                val context: Context? = settingsGeneral.getContext()
                if (context == null || (context.getString(R.string.add_site_pref)
                        .also({ string = it })) == null
                ) {
                    return
                }
                singleSelectionHelper.showDialog(
                    fragmentActivity,
                    arrayList3,
                    -1,
                    string,
                    true,
                    `SettingsGeneral$onCreatePreferences$showAdd$2`.Companion.INSTANCE,
                    `SettingsGeneral$onCreatePreferences$showAdd$3`(sortedWith, settingsGeneral)
                )
            }
        }

        private fun `onCreatePreferences$showDelete`(settingsGeneral: SettingsGeneral) {
            var string: String?
            val `onCreatePreferences$getCurrent`: List<CustomSite> =
                `onCreatePreferences$getCurrent`()
            val activity: FragmentActivity? = settingsGeneral.getActivity()
            if (activity != null) {
                val singleSelectionHelper: SingleSelectionHelper = SingleSelectionHelper.INSTANCE
                val fragmentActivity: FragmentActivity = activity
                val list: List<CustomSite> = `onCreatePreferences$getCurrent`
                val arrayList: ArrayList =
                    ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10))
                for (customSite: CustomSite in list) {
                    arrayList.add(customSite.name)
                }
                val arrayList2: ArrayList = arrayList
                val emptyList: List<Integer> = CollectionsKt.emptyList<Any>()
                val context: Context? = settingsGeneral.getContext()
                if (context == null || (context.getString(R.string.remove_site_pref)
                        .also({ string = it })) == null
                ) {
                    return
                }
                singleSelectionHelper.showMultiDialog(
                    fragmentActivity,
                    arrayList2,
                    emptyList,
                    string,
                    `SettingsGeneral$onCreatePreferences$showDelete$2`.Companion.INSTANCE,
                    `SettingsGeneral$onCreatePreferences$showDelete$3`(
                        `onCreatePreferences$getCurrent`
                    )
                )
            }
        }

        private fun `onCreatePreferences$showAddOrDelete`(settingsGeneral: SettingsGeneral) {
            val context: Context? = settingsGeneral.getContext()
            if (context == null) {
                return
            }
            val create: AlertDialog = AlertDialog.Builder(context, R.style.AlertDialogCustom)
                .setView(R.layout.add_remove_sites).create()
            Intrinsics.checkNotNullExpressionValue(create, "builder.create()")
            create.show()
            val textView: TextView? =
                create.findViewById<View>(C4761R.C4764id.add_site) as TextView?
            if (textView != null) {
                textView.setOnClickListener(object : OnClickListener() {
                    // from class: com.lagradost.cloudstream3.ui.settings.-$$Lambda$SettingsGeneral$syIZAQKT53HnKrkZib2-UWr00Es
                    @Override // android.view.View.OnClickListener
                    fun onClick(view: View?) {
                        `m8913onCreatePreferences$showAddOrDelete$lambda6`(
                            this@AlertDialog,
                            settingsGeneral,
                            view
                        )
                    }
                })
            }
            val textView2: TextView? =
                create.findViewById<View>(C4761R.C4764id.remove_site) as TextView?
            if (textView2 != null) {
                textView2.setOnClickListener(object : OnClickListener() {
                    // from class: com.lagradost.cloudstream3.ui.settings.-$$Lambda$SettingsGeneral$3MTZiwWX_jHntMuDygEcUUR2qWU
                    @Override // android.view.View.OnClickListener
                    fun onClick(view: View?) {
                        `m8914onCreatePreferences$showAddOrDelete$lambda7`(
                            this@AlertDialog,
                            settingsGeneral,
                            view
                        )
                    }
                })
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onCreatePreferences$showAddOrDelete$lambda-6  reason: not valid java name */
        fun `m8913onCreatePreferences$showAddOrDelete$lambda6`(
            dialog: AlertDialog?,
            `this$0`: SettingsGeneral,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(dialog, "\$dialog")
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            `onCreatePreferences$showAdd`(`this$0`)
            UIHelper.INSTANCE.dismissSafe(dialog, `this$0`.getActivity())
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onCreatePreferences$showAddOrDelete$lambda-7  reason: not valid java name */
        fun `m8914onCreatePreferences$showAddOrDelete$lambda7`(
            dialog: AlertDialog?,
            `this$0`: SettingsGeneral,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(dialog, "\$dialog")
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            `onCreatePreferences$showDelete`(`this$0`)
            UIHelper.INSTANCE.dismissSafe(dialog, `this$0`.getActivity())
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onCreatePreferences$lambda-8  reason: not valid java name */
        fun `m8911onCreatePreferences$lambda8`(
            `this$0`: SettingsGeneral,
            preference: Preference?
        ): Boolean {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            if (`onCreatePreferences$getCurrent`().isEmpty()) {
                `onCreatePreferences$showAdd`(`this$0`)
                return true
            }
            `onCreatePreferences$showAddOrDelete`(`this$0`)
            return true
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onCreatePreferences$lambda-9  reason: not valid java name */
        fun `m8912onCreatePreferences$lambda9`(preference: Preference): Boolean {
            val builder: AlertDialog.Builder =
                AlertDialog.Builder(preference.getContext(), R.style.AlertDialogCustom)
            builder.setTitle(R.string.legal_notice)
            builder.setMessage(R.string.legal_notice_text)
            builder.show()
            return true
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onCreatePreferences$lambda-10  reason: not valid java name */
        fun `m8908onCreatePreferences$lambda10`(
            `this$0`: SettingsGeneral,
            sharedPreferences: SharedPreferences,
            preference: Preference?
        ): Boolean {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val stringArray: Array<String> =
                `this$0`.getResources().getStringArray(R.array.dns_pref)
            Intrinsics.checkNotNullExpressionValue(
                stringArray,
                "resources.getStringArray(R.array.dns_pref)"
            )
            val intArray: IntArray = `this$0`.getResources().getIntArray(R.array.dns_pref_values)
            Intrinsics.checkNotNullExpressionValue(
                intArray,
                "resources.getIntArray(R.array.dns_pref_values)"
            )
            val i: Int = sharedPreferences.getInt(`this$0`.getString(R.string.dns_pref), 0)
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                val list: List<String> = ArraysKt.toList(stringArray)
                val indexOf: Int = ArraysKt.indexOf(intArray, i)
                val string: String = `this$0`.getString(R.string.dns_pref)
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.dns_pref)")
                SingleSelectionHelper.INSTANCE.showBottomDialog(
                    activity,
                    list,
                    indexOf,
                    string,
                    true,
                    `SettingsGeneral$onCreatePreferences$3$1`.Companion.INSTANCE,
                    `SettingsGeneral$onCreatePreferences$3$2`(sharedPreferences, `this$0`, intArray)
                )
                return true
            }
            return true
        }

        private fun `onCreatePreferences$getDownloadDirs`(settingsGeneral: SettingsGeneral): List<String> {
            val list: List<String>? = ArchComponentExt.normalSafeApiCall(
                `SettingsGeneral$onCreatePreferences$getDownloadDirs$1`(settingsGeneral)
            )
            return if (list == null) CollectionsKt.emptyList<Any>() else list
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onCreatePreferences$lambda-11  reason: not valid java name */
        fun `m8909onCreatePreferences$lambda11`(
            sharedPreferences: SharedPreferences,
            `this$0`: SettingsGeneral,
            preference: Preference?
        ): Boolean {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val `onCreatePreferences$getDownloadDirs`: List<String?> =
                `onCreatePreferences$getDownloadDirs`(`this$0`)
            var string: String? =
                sharedPreferences.getString(`this$0`.getString(R.string.download_path_pref), null)
            if (string == null) {
                string = String.valueOf(VideoDownloadManager.INSTANCE.downloadDir)
            }
            Intrinsics.checkNotNullExpressionValue(
                string,
                "settingsManager.getStrin…tDownloadDir().toString()"
            )
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                val plus: List<String> = CollectionsKt.plus(
                    `onCreatePreferences$getDownloadDirs` as Collection?,
                    CollectionsKt.listOf(TypedValues.Custom.NAME) as Iterable?
                )
                val indexOf: Int = `onCreatePreferences$getDownloadDirs`.indexOf(string)
                val string2: String = `this$0`.getString(R.string.download_path_pref)
                Intrinsics.checkNotNullExpressionValue(
                    string2,
                    "getString(R.string.download_path_pref)"
                )
                SingleSelectionHelper.INSTANCE.showBottomDialog(
                    activity,
                    plus,
                    indexOf,
                    string2,
                    true,
                    `SettingsGeneral$onCreatePreferences$4$1`.Companion.INSTANCE,
                    `SettingsGeneral$onCreatePreferences$4$2`(
                        `onCreatePreferences$getDownloadDirs`,
                        `this$0`,
                        sharedPreferences
                    )
                )
                return true
            }
            return true
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onCreatePreferences$lambda-13$lambda-12  reason: not valid java name */
        fun `m8910onCreatePreferences$lambda13$lambda12`(
            sharedPreferences: SharedPreferences,
            `this$0`: SettingsGeneral,
            preference: Preference
        ): Boolean {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            try {
                val companion: SettingsFragment.Companion = SettingsFragment.Companion.Companion
                companion.setBeneneCount(companion.getBeneneCount() + 1)
                sharedPreferences.edit().putInt(
                    `this$0`.getString(R.string.benene_count),
                    SettingsFragment.Companion.Companion.getBeneneCount()
                ).apply()
                val string: String = `this$0`.getString(R.string.benene_count_text)
                Intrinsics.checkNotNullExpressionValue(
                    string,
                    "getString(R.string.benene_count_text)"
                )
                val format: String = String.format(
                    string,
                    Arrays.copyOf(
                        arrayOf<Object>(Integer.valueOf(SettingsFragment.Companion.Companion.getBeneneCount())),
                        1
                    )
                )
                Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)")
                preference.setSummary(format)
            } catch (e: Exception) {
                ArchComponentExt.logError(e)
            }
            return true
        }
    }
}