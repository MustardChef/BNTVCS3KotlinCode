package com.lagradost.cloudstream3.p041ui.settings

import android.app.Activity
import androidx.fragment.app.Fragment
import androidx.preference.Preference
import kotlin.jvm.internal.Intrinsics

/* compiled from: SettingsFragment.kt */
@Metadata(
    m108d1 = ["\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000f"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/settings/SettingsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", ViewHierarchyConstants.VIEW_KEY, "Companion", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.settings.SettingsFragment */ /* loaded from: classes4.dex */
class SettingsFragment constructor() : Fragment() {
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

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */  override fun onDestroyView() {
        super.onDestroyView()
        `_$_clearFindViewByIdCache`()
    }

    /* compiled from: SettingsFragment.kt */
    @Metadata(
        m108d1 = ["\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cJ\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u000c\u0010\u0011\u001a\u00020\u0004*\u00020\u0012H\u0002J\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0014*\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0004J\u000c\u0010\u0017\u001a\u00020\u0018*\u00020\u0012H\u0002J\n\u0010\u0019\u001a\u00020\u0018*\u00020\u0012J\n\u0010\u001a\u001a\u00020\u0018*\u00020\u0012J\n\u0010\u001b\u001a\u00020\u0018*\u00020\u0012J\u0016\u0010\u001c\u001a\u00020\u000e*\u0004\u0018\u00010\u00152\b\b\u0001\u0010\u001d\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u001e"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/settings/SettingsFragment\$Companion;", "", "()V", "beneneCount", "", "getBeneneCount", "()I", "setBeneneCount", "(I)V", "getFolderSize", "", "dir", "Ljava/io/File;", "push", "", "activity", "Landroid/app/Activity;", "getLayoutInt", "Landroid/content/Context;", "getPref", "Landroidx/preference/Preference;", "Landroidx/preference/PreferenceFragmentCompat;", "id", "isAutoTv", "", "isEmulatorSettings", "isTrueTvSettings", "isTvSettings", "setUpToolbar", "title", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.settings.SettingsFragment$Companion */ /* loaded from: classes4.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        var beneneCount: Int
            get() {
                return SettingsFragment.Companion.beneneCount
            }
            set(i) {
                SettingsFragment.Companion.beneneCount = i
            }

        fun push(activity: Activity?) {
            val uIHelper: UIHelper = UIHelper.INSTANCE
            val bundle: Bundle = Bundle()
            val unit: Unit = Unit.INSTANCE
            uIHelper.navigate(activity, R.id.global_to_navigation_settings, bundle)
        }

        fun getPref(preferenceFragmentCompat: PreferenceFragmentCompat?, i: Int): Preference? {
            if (preferenceFragmentCompat == null) {
                return null
            }
            try {
                return preferenceFragmentCompat.findPreference(preferenceFragmentCompat.getString(i))
            } catch (e: Exception) {
                ArchComponentExt.logError(e)
                return null
            }
        }

        fun setUpToolbar(preferenceFragmentCompat: PreferenceFragmentCompat?, i: Int) {
            if (preferenceFragmentCompat == null) {
                return
            }
            val view: View? = preferenceFragmentCompat.getView()
            val materialToolbar: MaterialToolbar? =
                (if (view != null) view.findViewById(C4761R.C4764id.settings_toolbar) else null) as MaterialToolbar?
            if (materialToolbar != null) {
                materialToolbar.setTitle(i)
                materialToolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24)
                materialToolbar.setNavigationOnClickListener(object : OnClickListener() {
                    // from class: com.lagradost.cloudstream3.ui.settings.-$$Lambda$SettingsFragment$Companion$Wqo_28Is8ZmAeZ1Y2jU05q12rAc
                    @Override // android.view.View.OnClickListener
                    fun onClick(view2: View?) {
                        `m8905setUpToolbar$lambda2$lambda1`(this@PreferenceFragmentCompat, view2)
                    }
                })
            }
            val uIHelper: UIHelper = UIHelper.INSTANCE
            val context: Context = preferenceFragmentCompat.getContext()
            val view2: View? = preferenceFragmentCompat.getView()
            uIHelper.fixPaddingStatusbar(
                context,
                (if (view2 != null) view2.findViewById(C4761R.C4764id.settings_toolbar) else null) as MaterialToolbar?
            )
        }

        fun getFolderSize(dir: File): Long {
            var folderSize: Long
            Intrinsics.checkNotNullParameter(dir, "dir")
            val listFiles: Array<File>? = dir.listFiles()
            var j: Long = 0
            if (listFiles != null) {
                for (file: File in listFiles) {
                    if (file.isFile()) {
                        folderSize = file.length()
                    } else {
                        val companion: SettingsFragment.Companion = Companion
                        Intrinsics.checkNotNullExpressionValue(file, "file")
                        folderSize = companion.getFolderSize(file)
                    }
                    j += folderSize
                }
            }
            return j
        }

        private fun getLayoutInt(context: Context): Int {
            return PreferenceManager.getDefaultSharedPreferences(context)
                .getInt(context.getString(R.string.app_layout_key), -1)
        }

        fun isTvSettings(context: Context): Boolean {
            Intrinsics.checkNotNullParameter(context, "<this>")
            val layoutInt: Int = getLayoutInt(context)
            var i: Int = layoutInt
            if (layoutInt == -1) {
                i = isAutoTv(context).toInt()
            }
            return i == 1 || i == 2
        }

        fun isTrueTvSettings(context: Context): Boolean {
            Intrinsics.checkNotNullParameter(context, "<this>")
            val layoutInt: Int = getLayoutInt(context)
            var i: Int = layoutInt
            if (layoutInt == -1) {
                i = isAutoTv(context).toInt()
            }
            return i == 1
        }

        fun isEmulatorSettings(context: Context): Boolean {
            Intrinsics.checkNotNullParameter(context, "<this>")
            return getLayoutInt(context) == 2
        }

        private fun isAutoTv(context: Context): Boolean {
            val uiModeManager: UiModeManager? = context.getSystemService("uimode") as UiModeManager?
            val MODEL: String = Build.MODEL
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL")
            val lowerCase: String = MODEL.toLowerCase(Locale.ROOT)
            Intrinsics.checkNotNullExpressionValue(
                lowerCase,
                "this as java.lang.String).toLowerCase(Locale.ROOT)"
            )
            if (uiModeManager != null && uiModeManager.getCurrentModeType() === 4) {
                return true
            }
            val MODEL2: String = Build.MODEL
            Intrinsics.checkNotNullExpressionValue(MODEL2, "MODEL")
            if (StringsKt.`contains$default`(
                    MODEL2 as CharSequence?,
                    "AFT" as CharSequence?,
                    false,
                    2,
                    null as Object?
                )
            ) {
                return true
            }
            val str: String = lowerCase
            return StringsKt.`contains$default`(
                str as CharSequence?,
                "firestick" as CharSequence?,
                false,
                2,
                null as Object?
            ) || StringsKt.`contains$default`(
                str as CharSequence?,
                "fire tv" as CharSequence?,
                false,
                2,
                null as Object?
            ) || StringsKt.`contains$default`(
                str as CharSequence?,
                "chromecast" as CharSequence?,
                false,
                2,
                null as Object?
            )
        }

        companion object {
            /* JADX INFO: Access modifiers changed from: private */ /* renamed from: setUpToolbar$lambda-2$lambda-1  reason: not valid java name */
            fun `m8905setUpToolbar$lambda2$lambda1`(
                preferenceFragmentCompat: PreferenceFragmentCompat,
                view: View?
            ) {
                val activity: FragmentActivity? = preferenceFragmentCompat.getActivity()
                if (activity != null) {
                    activity.onBackPressed()
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onCreateView(
        inflater: LayoutInflater,
        viewGroup: ViewGroup,
        bundle: Bundle
    ): View {
        Intrinsics.checkNotNullParameter(inflater, "inflater")
        return inflater.inflate(R.layout.main_settings, viewGroup, false)
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onViewCreated(view: View, bundle: Bundle) {
        var profilePicture: String?
        Intrinsics.checkNotNullParameter(view, "view")
        val context: Context? = getContext()
        val z: Boolean = context != null && Companion.Companion.isTrueTvSettings(context)
        val it: Iterator<AccountManager> = AccountManager.Companion.accountManagers.iterator()
        while (true) {
            if (!it.hasNext()) {
                break
            }
            val loginInfo: LoginInfo? = it.next().loginInfo()
            if (loginInfo != null && (loginInfo.profilePicture.also({
                    profilePicture = it
                })) != null) {
                val imageView: ImageView? =
                    `_$_findCachedViewById`(C4761R.C4764id.settings_profile_pic) as ImageView?
                if (imageView != null && UIHelper.`setImage$default`(
                        UIHelper.INSTANCE,
                        imageView,
                        profilePicture,
                        null,
                        Integer.valueOf(HomeFragment.Companion.Companion.getErrorProfilePic()),
                        2,
                        null
                    )
                ) {
                    val textView: TextView? =
                        `_$_findCachedViewById`(C4761R.C4764id.settings_profile_text) as TextView?
                    if (textView != null) {
                        textView.setText(loginInfo.name)
                    }
                    val linearLayout: LinearLayout? =
                        `_$_findCachedViewById`(C4761R.C4764id.settings_profile) as LinearLayout?
                    if (linearLayout != null) {
                        linearLayout.setVisibility(0)
                    }
                }
            }
        }
        for (tuples: Tuples<*, *> in CollectionsKt.listOf<Object>(
            *arrayOf<Tuples<*, *>>(
                Tuples(
                    `_$_findCachedViewById`(C4761R.C4764id.settings_general) as TextView?,
                    Integer.valueOf(R.id.action_navigation_settings_to_navigation_settings_general as Int)
                ),
                Tuples(
                    `_$_findCachedViewById`(C4761R.C4764id.settings_player) as TextView?,
                    Integer.valueOf(R.id.action_navigation_settings_to_navigation_settings_player as Int)
                ),
                Tuples(
                    `_$_findCachedViewById`(C4761R.C4764id.settings_credits) as TextView?,
                    Integer.valueOf(R.id.action_navigation_settings_to_navigation_settings_account as Int)
                ),
                Tuples(
                    `_$_findCachedViewById`(C4761R.C4764id.settings_ui) as TextView?,
                    Integer.valueOf(R.id.action_navigation_settings_to_navigation_settings_ui as Int)
                ),
                Tuples(
                    `_$_findCachedViewById`(C4761R.C4764id.settings_lang) as TextView?,
                    Integer.valueOf(R.id.action_navigation_settings_to_navigation_settings_lang as Int)
                ),
                Tuples<Any?, Any?>(
                    `_$_findCachedViewById`(C4761R.C4764id.settings_updates) as TextView?,
                    Integer.valueOf(R.id.action_navigation_settings_to_navigation_settings_updates as Int)
                )
            ) as Array<Object>
        )) {
            val view2: TextView? = tuples.component1() as TextView?
            val intValue: Int = (tuples.component2() as Number).intValue()
            if (view2 != null) {
                Intrinsics.checkNotNullExpressionValue(view2, "view")
                view2.setOnClickListener(object : OnClickListener() {
                    // from class: com.lagradost.cloudstream3.ui.settings.-$$Lambda$SettingsFragment$lRkBUoJo8MttA4kfvH8-rOq1PNI
                    @Override // android.view.View.OnClickListener
                    fun onClick(view3: View?) {
                        Companion.`m8904onViewCreated$lambda2$lambda1$lambda0`(
                            intValue,
                            this,
                            view3
                        )
                    }
                })
                if (z) {
                    view2.setFocusable(true)
                    view2.setFocusableInTouchMode(true)
                }
            }
        }
    }

    companion object {
        val Companion: Companion = Companion(null)
        private val beneneCount: Int = 0
        private fun `onViewCreated$navigate`(settingsFragment: SettingsFragment, i: Int) {
            val activity: FragmentActivity? = settingsFragment.getActivity()
            if (activity != null) {
                UIHelper.INSTANCE.navigate(activity, i, Bundle())
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-2$lambda-1$lambda-0  reason: not valid java name */
        fun `m8904onViewCreated$lambda2$lambda1$lambda0`(
            i: Int,
            `this$0`: SettingsFragment?,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            SettingsFragment.Companion.`onViewCreated$navigate`(`this$0`, i)
        }
    }
}