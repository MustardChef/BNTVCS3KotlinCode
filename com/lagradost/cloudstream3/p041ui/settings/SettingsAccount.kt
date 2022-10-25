package com.lagradost.cloudstream3.p041ui.settings

import android.content.Context
import androidx.preference.Preference
import kotlin.jvm.internal.Intrinsics

/* compiled from: SettingsAccount.kt */
@Metadata(
    m108d1 = ["\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0003J\u001c\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\u000c\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0002¨\u0006\u0015"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/settings/SettingsAccount;", "Landroidx/preference/PreferenceFragmentCompat;", "()V", "addAccount", "", "api", "Lcom/lagradost/cloudstream3/syncproviders/AccountManager;", "onCreatePreferences", "savedInstanceState", "Landroid/os/Bundle;", "rootKey", "", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "showAccountSwitch", "context", "Landroid/content/Context;", "showLoginInfo", "info", "Lcom/lagradost/cloudstream3/syncproviders/AuthAPI\$LoginInfo;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.settings.SettingsAccount */ /* loaded from: classes4.dex */
class SettingsAccount constructor() : PreferenceFragmentCompat() {
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
        SettingsFragment.Companion.Companion.setUpToolbar(this, R.string.category_account)
    }

    private fun showLoginInfo(accountManager: AccountManager, loginInfo: LoginInfo) {
        var textView: TextView
        val context: Context? = getContext()
        if (context == null) {
            return
        }
        val show: AlertDialog = AlertDialog.Builder(context, R.style.AlertDialogCustom)
            .setView(R.layout.account_managment).show()
        val cardView: CardView? =
            show.findViewById<View>(C4761R.C4764id.account_main_profile_picture_holder) as CardView?
        if (cardView != null) {
            val cardView2: CardView = cardView
            val imageView: ImageView? =
                show.findViewById<View>(C4761R.C4764id.account_main_profile_picture) as ImageView?
            val z: Boolean = true
            cardView2.setVisibility(
                if ((imageView == null || !UIHelper.`setImage$default`(
                        UIHelper.INSTANCE,
                        imageView,
                        loginInfo.profilePicture,
                        null,
                        null,
                        6,
                        null
                    ))
                ) false else if (false) 0 else 8
            )
        }
        val textView2: TextView? =
            show.findViewById<View>(C4761R.C4764id.account_logout) as TextView?
        if (textView2 != null) {
            textView2.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.settings.-$$Lambda$SettingsAccount$ffEKmvIslkGoH642qab0d0Xcd8Q
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    `m8900showLoginInfo$lambda0`(this@AccountManager, show, this, view)
                }
            })
        }
        var name: String? = loginInfo.name
        if (name == null) {
            val context2: Context? = getContext()
            name = if (context2 != null) context2.getString(R.string.no_data) else null
        }
        if (name != null && (show.findViewById<View>(R.id.account_name) as TextView?. also ({
                textView = it
            })) != null) {
            textView.setText(name)
        }
        val textView3: TextView? = show.findViewById<View>(C4761R.C4764id.account_site) as TextView?
        if (textView3 != null) {
            textView3.setText(accountManager.name)
        }
        val textView4: TextView? =
            show.findViewById<View>(C4761R.C4764id.account_switch_account) as TextView?
        if (textView4 != null) {
            textView4.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.settings.-$$Lambda$SettingsAccount$L745XfnbMD48bx3XbO2TJa1wY48
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    `m8901showLoginInfo$lambda2`(this@AlertDialog, this, accountManager, view)
                }
            })
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c1  */ /* JADX WARN: Removed duplicated region for block: B:54:0x00c2  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private fun addAccount(r6: AccountManager) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.p041ui.settings.SettingsAccount.addAccount(com.lagradost.cloudstream3.syncproviders.AccountManager):void")
    }

    private fun showAccountSwitch(context: Context, accountManager: AccountManager) {
        val accounts: IntArray? = accountManager.accounts
        if (accounts == null) {
            return
        }
        val show: AlertDialog =
            AlertDialog.Builder(context, R.style.AlertDialogCustom).setView(R.layout.account_switch)
                .show()
        val textView: TextView? = show.findViewById<View>(C4761R.C4764id.account_add) as TextView?
        if (textView != null) {
            textView.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.settings.-$$Lambda$SettingsAccount$ZcMAKae0mNYwOOFcWtXu9jlUJK8
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    `m8899showAccountSwitch$lambda7`(
                        this@SettingsAccount,
                        accountManager,
                        show,
                        view
                    )
                }
            })
        }
        val accountIndex: Int = accountManager.accountIndex
        val arrayList: ArrayList = ArrayList()
        for (i: Int in accounts) {
            accountManager.accountIndex = i
            val loginInfo: LoginInfo? = accountManager.loginInfo()
            if (loginInfo != null) {
                arrayList.add(loginInfo)
            }
        }
        accountManager.accountIndex = accountIndex
        val accountAdapter: AccountAdapter = AccountAdapter(
            arrayList,
            R.layout.account_single,
            `SettingsAccount$showAccountSwitch$adapter$1`(show, this, accountManager)
        )
        val recyclerView: RecyclerView? =
            show.findViewById<View>(R.id.account_list) as RecyclerView?
        if (recyclerView == null) {
            return
        }
        recyclerView.setAdapter(accountAdapter)
    }

    @Override // androidx.preference.PreferenceFragmentCompat
    public override fun onCreatePreferences(bundle: Bundle, str: String) {
        UIHelper.INSTANCE.hideKeyboard(this)
        setPreferencesFromResource(R.xml.settings_account, str)
        for (tuples: Tuples<*, *> in CollectionsKt.listOf<Object>(
            *arrayOf<Tuples<*, *>?>(
                TuplesKt.m100to(
                    Integer.valueOf(R.string.mal_key as Int),
                    AccountManager.Companion.malApi
                ),
                TuplesKt.m100to(
                    Integer.valueOf(R.string.anilist_key as Int),
                    AccountManager.Companion.aniListApi
                ),
                TuplesKt.m100to(
                    Integer.valueOf(R.string.opensubtitles_key as Int),
                    AccountManager.Companion.openSubtitlesApi
                ),
                TuplesKt.m100to(
                    Integer.valueOf(R.string.nginx_key as Int),
                    AccountManager.Companion.nginxApi
                )
            ) as Array<Object?>
        )) {
            val intValue: Int = (tuples.component1() as Number).intValue()
            val accountManager: AccountManager = tuples.component2() as AccountManager
            val pref: Preference? = SettingsFragment.Companion.Companion.getPref(this, intValue)
            if (pref != null) {
                val string: String = getString(R.string.login_format)
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.login_format)")
                val format: String = String.format(
                    string,
                    Arrays.copyOf(
                        arrayOf<Object>(accountManager.name, getString(R.string.account)),
                        2
                    )
                )
                Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)")
                pref.setTitle(format)
                pref.setOnPreferenceClickListener(object : OnPreferenceClickListener {
                    // from class: com.lagradost.cloudstream3.ui.settings.-$$Lambda$SettingsAccount$upiNYEctNR8Of_9KRWoK0_neZG4
                    @Override // androidx.preference.Preference.OnPreferenceClickListener
                    public override fun onPreferenceClick(preference: Preference): Boolean {
                        val `m8898onCreatePreferences$lambda9$lambda8`: Boolean
                        `m8898onCreatePreferences$lambda9$lambda8` =
                            `m8898onCreatePreferences$lambda9$lambda8`(
                                this@AccountManager,
                                this,
                                preference
                            )
                        return `m8898onCreatePreferences$lambda9$lambda8`
                    }
                })
            }
        }
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: showLoginInfo$lambda-0  reason: not valid java name */
        fun `m8900showLoginInfo$lambda0`(
            api: AccountManager,
            alertDialog: AlertDialog?,
            `this$0`: SettingsAccount,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(api, "\$api")
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            api.logOut()
            UIHelper.INSTANCE.dismissSafe(alertDialog, `this$0`.getActivity())
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: showLoginInfo$lambda-2  reason: not valid java name */
        fun `m8901showLoginInfo$lambda2`(
            alertDialog: AlertDialog?,
            `this$0`: SettingsAccount,
            api: AccountManager,
            view: View
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(api, "\$api")
            UIHelper.INSTANCE.dismissSafe(alertDialog, `this$0`.getActivity())
            val context: Context = view.getContext()
            Intrinsics.checkNotNullExpressionValue(context, "it.context")
            `this$0`.showAccountSwitch(context, api)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: addAccount$lambda-3  reason: not valid java name */
        fun `m8894addAccount$lambda3`(api: AccountManager, `this$0`: SettingsAccount, view: View?) {
            Intrinsics.checkNotNullParameter(api, "\$api")
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val intent: Intent = Intent("android.intent.action.VIEW")
            intent.setData(Uri.parse(api.createAccountUrl))
            try {
                `this$0`.startActivity(intent)
            } catch (e: Exception) {
                ArchComponentExt.logError(e)
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: addAccount$lambda-5  reason: not valid java name */
        fun `m8895addAccount$lambda5`(
            api: AccountManager,
            alertDialog: AlertDialog,
            `this$0`: SettingsAccount,
            view: View?
        ) {
            var editText: EditText
            var text: Editable
            var editText2: EditText
            var text2: Editable
            var editText3: EditText
            var text3: Editable
            var editText4: EditText
            var text4: Editable
            Intrinsics.checkNotNullParameter(api, "\$api")
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val inAppAuthAPI: InAppAuthAPI = api as InAppAuthAPI
            Coroutines.INSTANCE.ioSafe(
                `SettingsAccount$addAccount$3$1`(
                    api,
                    LoginData(
                        if ((!inAppAuthAPI.requiresUsername || ((alertDialog.findViewById<View>(
                                C4761R.C4764id.login_username_input
                            ) as EditText?. also ({
                                editText4 = it
                            })) == null) || ((editText4.getText().also({ text4 = it })) == null))
                        ) null else text4.toString(),
                        if ((!inAppAuthAPI.requiresPassword || ((alertDialog.findViewById<View>(
                                C4761R.C4764id.login_password_input
                            ) as EditText?. also ({
                                editText3 = it
                            })) == null) || ((editText3.getText().also({ text3 = it })) == null))
                        ) null else text3.toString(),
                        if ((!inAppAuthAPI.requiresServer || ((alertDialog.findViewById<View>(C4761R.C4764id.login_server_input) as EditText?. also ({
                                editText = it
                            })) == null) || ((editText.getText()
                                .also({ text = it })) == null))
                        ) null else text.toString(),
                        if ((!inAppAuthAPI.requiresEmail || ((alertDialog.findViewById<View>(C4761R.C4764id.login_email_input) as EditText?. also ({
                                editText2 = it
                            })) == null) || ((editText2.getText()
                                .also({ text2 = it })) == null))
                        ) null else text2.toString()
                    ),
                    `this$0`,
                    null
                )
            )
            UIHelper.INSTANCE.dismissSafe(alertDialog, `this$0`.getActivity())
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: addAccount$lambda-6  reason: not valid java name */
        fun `m8896addAccount$lambda6`(
            alertDialog: AlertDialog?,
            `this$0`: SettingsAccount,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            UIHelper.INSTANCE.dismissSafe(alertDialog, `this$0`.getActivity())
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: showAccountSwitch$lambda-7  reason: not valid java name */
        fun `m8899showAccountSwitch$lambda7`(
            `this$0`: SettingsAccount,
            api: AccountManager,
            alertDialog: AlertDialog?,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(api, "\$api")
            `this$0`.addAccount(api)
            if (alertDialog != null) {
                UIHelper.INSTANCE.dismissSafe(alertDialog, `this$0`.getActivity())
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onCreatePreferences$lambda-9$lambda-8  reason: not valid java name */
        fun `m8898onCreatePreferences$lambda9$lambda8`(
            api: AccountManager,
            `this$0`: SettingsAccount,
            preference: Preference?
        ): Boolean {
            Intrinsics.checkNotNullParameter(api, "\$api")
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val loginInfo: LoginInfo? = api.loginInfo()
            if (loginInfo != null) {
                `this$0`.showLoginInfo(api, loginInfo)
                return true
            }
            `this$0`.addAccount(api)
            return true
        }
    }
}