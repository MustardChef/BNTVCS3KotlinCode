package com.phimhd

import android.animation.Animator
import androidx.fragment.app.Fragment
import retrofit2.Call
import retrofit2.Response
import kotlin.jvm.internal.Intrinsics

/* compiled from: BaseActivity.kt */
@Metadata(
    m108d1 = ["\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\b&\u0018\u0000 T2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001TB\u0005¢\u0006\u0002\u0010\u0004J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020*J\b\u0010+\u001a\u00020'H\u0002J\u0006\u0010,\u001a\u00020'J\b\u0010-\u001a\u00020'H\u0002J\u0010\u0010.\u001a\u00020\u00192\u0006\u0010/\u001a\u000200H\u0016J\u0012\u00101\u001a\u00020'2\b\u00102\u001a\u0004\u0018\u000103H\u0002J\u0014\u00104\u001a\u0004\u0018\u00010\u00032\b\u00105\u001a\u0004\u0018\u000106H\u0002J\u0006\u00107\u001a\u00020'J\b\u00108\u001a\u00020*H\$J\b\u00109\u001a\u00020'H\$J\b\u0010:\u001a\u00020'H\$J\u0010\u0010;\u001a\u00020'2\u0006\u0010<\u001a\u00020\u0003H\u0016J\u0012\u0010=\u001a\u00020'2\b\u0010>\u001a\u0004\u0018\u00010?H\u0014J\b\u0010@\u001a\u00020'H\u0014J\u0006\u0010A\u001a\u00020'J\b\u0010B\u001a\u00020'H\u0014J\b\u0010C\u001a\u00020'H\u0014J\b\u0010D\u001a\u00020'H\u0004J\u0006\u0010E\u001a\u00020'J\b\u0010F\u001a\u00020'H\u0014J\b\u0010G\u001a\u00020'H\u0014J\b\u0010H\u001a\u00020'H\u0014J\u0010\u0010I\u001a\u00020'2\u0006\u0010J\u001a\u00020\u0019H\u0016J\u0006\u0010K\u001a\u00020'J\u0006\u0010L\u001a\u00020'J\u0006\u0010M\u001a\u00020'J\u0010\u0010N\u001a\u00020'2\b\u0010O\u001a\u0004\u0018\u000103J\u0018\u0010P\u001a\u00020'2\b\u0010Q\u001a\u0004\u0018\u00010\u00032\u0006\u0010R\u001a\u00020*J\u0016\u0010S\u001a\u00020'2\u0006\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020*R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u000cR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u0019X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u0019X\u0082D¢\u0006\u0002\n\u0000R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010\"\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006U"],
    m107d2 = ["Lcom/phimhd/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/lagradost/cloudstream3/ui/browser/ICallback;", "", "()V", "connection", "Landroid/content/ServiceConnection;", "dialogLoading", "Lcom/phimhd/ProgressDialogCustom;", "getDialogLoading", "()Lcom/phimhd/ProgressDialogCustom;", "setDialogLoading", "(Lcom/phimhd/ProgressDialogCustom;)V", "dialogNetwork", "Landroidx/appcompat/app/AlertDialog;", "getDialogNetwork", "()Landroidx/appcompat/app/AlertDialog;", "setDialogNetwork", "(Landroidx/appcompat/app/AlertDialog;)V", "dialogUpgrade", "Lcom/phimhd/BottomUpgradeDialog;", "dialogUpgradeSuccess", "getDialogUpgradeSuccess", "setDialogUpgradeSuccess", "mBound", "", "getMBound", "()Z", "setMBound", "(Z)V", "mBounded", ViewHierarchyConstants.TAG_KEY, "getTag", "()Ljava/lang/String;", "visibleFragment", "Landroidx/fragment/app/Fragment;", "getVisibleFragment", "()Landroidx/fragment/app/Fragment;", "addToTab", "", "fragmentSearch", "idResource", "", "applicationWillEnterForeground", "applicationdidenterbackground", "checkMyKey", "dispatchTouchEvent", "event", "Landroid/view/MotionEvent;", "generateDialogUpgradeSuccess", SDKConstants.PARAM_KEY, "Lcom/phimhd/Key;", "getProcessName", "context", "Landroid/content/Context;", "hideDialogUpgrade", "initLayout", "initVariables", "initViews", "onCallback", "s", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onNetworkTurnOn", "onPause", "onResume", "onServiceConnected", "onSocketConnected", "onStart", "onStop", "onUserLeaveHint", "onWindowFocusChanged", "hasFocus", "showDialogExpired", "showDialogKeyUpgrade", "showDialogUpgrade", "showKeyToUI", "newKey", "showToast", "message", "type", "tranToTab", "Companion", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes4.dex */
abstract class BaseActivity : AppCompatActivity(), ICallback<String?> {
    var `_$_findViewCache`: Map<Integer, View> = LinkedHashMap()
    private val connection: ServiceConnection = object : ServiceConnection() {
        // from class: com.phimhd.BaseActivity$connection$1
        @Override // android.content.ServiceConnection
        fun onServiceConnected(className: ComponentName?, service: IBinder?) {
            Intrinsics.checkNotNullParameter(className, "className")
            Intrinsics.checkNotNullParameter(service, "service")
            mBound = true
            LogUtils.m6080d("onServiceConnected", *arrayOfNulls<Object>(0))
            this@BaseActivity.onServiceConnected()
        }

        @Override // android.content.ServiceConnection
        fun onServiceDisconnected(arg0: ComponentName?) {
            Intrinsics.checkNotNullParameter(arg0, "arg0")
            mBound = false
            LogUtils.m6080d("onServiceDisconnected", *arrayOfNulls<Object>(0))
        }
    }
    var dialogLoading: ProgressDialogCustom? = null
    var dialogNetwork: AlertDialog? = null
    private var dialogUpgrade: BottomUpgradeDialog? = null
    private var dialogUpgradeSuccess: AlertDialog? = null

    /* JADX INFO: Access modifiers changed from: protected */
    protected var mBound = false
        set
    private val mBounded = false
    open fun `_$_clearFindViewByIdCache`() {
        `_$_findViewCache`.clear()
    }

    open fun `_$_findCachedViewById`(i: Int): View? {
        val map: Map<Integer, View> = `_$_findViewCache`
        val view: View? = map[Integer.valueOf(i)]
        if (view == null) {
            val findViewById: View = findViewById<View>(i)
            if (findViewById != null) {
                map.put(Integer.valueOf(i), findViewById)
                return findViewById
            }
            return null
        }
        return view
    }

    val tag: String?
        get() = null

    protected abstract fun initLayout(): Int
    protected abstract fun initVariables()
    protected abstract fun initViews()
    fun onNetworkTurnOn() {}

    /* JADX INFO: Access modifiers changed from: protected */
    fun onServiceConnected() {}
    fun onSocketConnected() {}
    fun showDialogExpired() {}
    fun showToast(str: String?, i: Int) {}
    fun getDialogUpgradeSuccess(): AlertDialog? {
        return dialogUpgradeSuccess
    }

    fun setDialogUpgradeSuccess(alertDialog: AlertDialog?) {
        dialogUpgradeSuccess = alertDialog
    }

    fun tranToTab(fragmentSearch: Fragment, i: Int) {
        Intrinsics.checkNotNullParameter(fragmentSearch, "fragmentSearch")
        val supportFragmentManager: FragmentManager = getSupportFragmentManager()
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager")
        supportFragmentManager.beginTransaction()
            .replace(i, fragmentSearch, fragmentSearch.getClass().getSimpleName())
            .addToBackStack(null).commit()
    }

    fun addToTab(fragmentSearch: Fragment, i: Int) {
        Intrinsics.checkNotNullParameter(fragmentSearch, "fragmentSearch")
        val supportFragmentManager: FragmentManager = getSupportFragmentManager()
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager")
        supportFragmentManager.beginTransaction()
            .add(i, fragmentSearch, fragmentSearch.getClass().getSimpleName()).commit()
    }

    val visibleFragment: Fragment?
        get() {
            val supportFragmentManager: FragmentManager = getSupportFragmentManager()
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager")
            val fragments: List<Fragment> = supportFragmentManager.getFragments()
            Intrinsics.checkNotNullExpressionValue(fragments, "fragmentManager.fragments")
            for (fragment in fragments) {
                if (fragment != null && fragment.isVisible) {
                    return fragment
                }
            }
            return null
        }

    @Override // android.app.Activity, android.view.Window.Callback
    fun dispatchTouchEvent(event: MotionEvent): Boolean {
        Intrinsics.checkNotNullParameter(event, "event")
        val currentFocus: View = getCurrentFocus()
        val dispatchTouchEvent: Boolean = super.dispatchTouchEvent(event)
        if (currentFocus is EditText) {
            val currentFocus2: View = getCurrentFocus()
            val iArr = IntArray(2)
            Intrinsics.checkNotNull(currentFocus2)
            currentFocus2.getLocationOnScreen(iArr)
            val rawX: Float = event.getRawX() + currentFocus2.getLeft() - iArr[0]
            val rawY: Float = event.getRawY() + currentFocus2.getTop() - iArr[1]
            if (event.getAction() === 1 && (rawX < currentFocus2.getLeft() || rawX >= currentFocus2.getRight() || rawY < currentFocus2.getTop() || rawY > currentFocus2.getBottom())) {
                val systemService: Object = getSystemService("input_method")
                Objects.requireNonNull(
                    systemService,
                    "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"
                )
                val currentFocus3: View = getWindow().getCurrentFocus()
                Intrinsics.checkNotNull(currentFocus3)
                (systemService as InputMethodManager).hideSoftInputFromWindow(
                    currentFocus3.getWindowToken(),
                    0
                )
            }
        }
        return dispatchTouchEvent
    }

    private fun getProcessName(context: Context?): String? {
        if (context == null) {
            return null
        }
        val systemService: Object = context.getSystemService("activity")
        Objects.requireNonNull(
            systemService,
            "null cannot be cast to non-null type android.app.ActivityManager"
        )
        for (runningAppProcessInfo in (systemService as ActivityManager).getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid === Process.myPid()) {
                return runningAppProcessInfo.processName
            }
        }
        return null
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    override fun onCreate(bundle: Bundle) {
        var processName: String?
        super.onCreate(bundle)
        setContentView(initLayout())
        if (Build.VERSION.SDK_INT > 9) {
            StrictMode.setThreadPolicy(Builder().permitAll().build())
        }
        initViews()
        val baseActivity = this
        dialogLoading = ProgressDialogCustom(baseActivity)
        initVariables()
        if (Build.VERSION.SDK_INT >= 28 && getProcessName(baseActivity).also {
                processName = it
            } != null && !Intrinsics.areEqual(getPackageName(), processName)) {
            WebView.setDataDirectorySuffix(processName)
        }
        dialogUpgrade = BottomUpgradeDialog.Companion.Companion.newInstance()
    }

    private fun checkMyKey() {
        var key: Key
        val companion: AppController = AppController.Companion.Companion.getInstance()
        if (companion == null || companion.key.also { key = it } == null) {
            return
        }
        LogUtils.m6080d("Check Key Token :" + Gson().toJson(key), *arrayOfNulls<Object>(0))
        ApiUtils().createApi().checkKeyWithToken(AbstractSpiCall.ACCEPT_JSON_VALUE, key)
            .enqueue(object : CallBackBase<ApiResponse<Key?>?>() {
                // from class: com.phimhd.BaseActivity$checkMyKey$1
                @Override // com.lagradost.cloudstream3.services.CallBackBase
                override fun onRequestSuccess(
                    call: Call<ApiResponse<Key?>>?,
                    response: Response<ApiResponse<Key?>>?
                ) {
                    Intrinsics.checkNotNullParameter(call, "call")
                    Intrinsics.checkNotNullParameter(response, "response")
                    if (response!!.isSuccessful() && response.body() != null) {
                        val body: ApiResponse<Key?> = response.body()
                        Intrinsics.checkNotNull(body)
                        if (body.isSuccess) {
                            val body2: ApiResponse<Key?> = response.body()
                            Intrinsics.checkNotNull(body2)
                            if (body2.getData() != null) {
                                val body3: ApiResponse<Key?> = response.body()
                                Intrinsics.checkNotNull(body3)
                                val data: Key = body3.getData()
                                val companion2: AppController =
                                    AppController.Companion.Companion.getInstance() ?: return
                                companion2.key = data
                                return
                            }
                        }
                        val companion3: AppController =
                            AppController.Companion.Companion.getInstance()
                        if (companion3 != null) {
                            companion3.key = null
                        }
                        val sb = StringBuilder()
                        sb.append("\n                                ")
                        val body4: ApiResponse<Key?> = response.body()
                        Intrinsics.checkNotNull(body4)
                        sb.append(body4.message)
                        sb.append("\n                                ")
                        sb.append(Gson().toJson(this@Key))
                        sb.append("\n                                ")
                        LogUtils.m6078e(
                            StringsKt.trimIndent(sb.toString()),
                            *arrayOfNulls<Object>(0)
                        )
                        return
                    }
                    val companion4: AppController = AppController.Companion.Companion.getInstance()
                    if (companion4 != null) {
                        companion4.key = null
                    }
                    LogUtils.m6078e(response.message(), *arrayOfNulls<Object>(0))
                }

                @Override // com.lagradost.cloudstream3.services.CallBackBase
                override fun onRequestFailure(call: Call<ApiResponse<Key?>>?, t: Throwable?) {
                    Intrinsics.checkNotNullParameter(call, "call")
                    Intrinsics.checkNotNullParameter(t, "t")
                    LogUtils.m6078e(t.getMessage(), arrayOfNulls<Object>(0))
                }
            })
    }

    private fun generateDialogUpgradeSuccess(key: Key?) {
        val str: String
        val str2: String
        if (key == null) {
            return
        }
        val materialAlertDialogBuilder = MaterialAlertDialogBuilder(this)
        materialAlertDialogBuilder.setTitle(Html.fromHtml(getString(R.string.active_success_title)) as CharSequence)
        var format: String = SimpleDateFormat("dd/MM/yyyy").format(Date(key.expiredTime))
        if (key.isExpired) {
            format = getString(R.string.expired_code)
        }
        if (key.expiredTime == -1L) {
            str2 = getString(R.string.unlimited_plan)
            Intrinsics.checkNotNullExpressionValue(str2, "getString(R.string.unlimited_plan)")
            str = getString(R.string.unlimited_text)
        } else {
            val string: String = getString(R.string.premium_plan)
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.premium_plan)")
            str = format
            str2 = string
        }
        val stringCompanionObject: String.Companion = StringCompanionObject.INSTANCE
        val string2: String = getString(R.string.active_success_content)
        Intrinsics.checkNotNullExpressionValue(
            string2,
            "getString(R.string.active_success_content)"
        )
        val format2: String = String.format(string2, Arrays.copyOf(arrayOf(str2, key.key, str), 3))
        Intrinsics.checkNotNullExpressionValue(format2, "format(format, *args)")
        materialAlertDialogBuilder.setMessage(Html.fromHtml(format2) as CharSequence)
        materialAlertDialogBuilder.setPositiveButton(
            getString(R.string.ok) as CharSequence?,
            `$$Lambda$BaseActivity$rzJn9kRpLjrG9Q1xoZbXLpjRQcE`.Companion.INSTANCE as OnClickListener
        )
        materialAlertDialogBuilder.setNegativeButton(
            getString(R.string.delete) as CharSequence?,
            object : OnClickListener() {
                // from class: com.phimhd.-$$Lambda$BaseActivity$q707XPG3e5SI5lUCLkAAszecsmE
                @Override // android.content.DialogInterface.OnClickListener
                fun onClick(dialogInterface: DialogInterface?, i: Int) {
                    BaseActivity.Companion.`m9035generateDialogUpgradeSuccess$lambda2`(
                        this@BaseActivity,
                        dialogInterface,
                        i
                    )
                }
            })
        materialAlertDialogBuilder.setCancelable(true)
        materialAlertDialogBuilder.setBackground(getDrawable(R.drawable.bg_white))
        val create: AlertDialog = materialAlertDialogBuilder.create()
        dialogUpgradeSuccess = create
        Intrinsics.checkNotNull(create)
        create.setOnShowListener(object : OnShowListener() {
            // from class: com.phimhd.-$$Lambda$BaseActivity$A0UKHTQZ6eMB5F4yVBOa5Ur_fjM
            @Override // android.content.DialogInterface.OnShowListener
            fun onShow(dialogInterface: DialogInterface?) {
                BaseActivity.Companion.`m9036generateDialogUpgradeSuccess$lambda3`(
                    this@BaseActivity,
                    dialogInterface
                )
            }
        })
    }

    fun showDialogKeyUpgrade() {
        if (dialogUpgradeSuccess != null) {
            val companion: AppController = AppController.Companion.Companion.getInstance()
            if ((if (companion != null) companion.key else null) != null) {
                val alertDialog: AlertDialog? = dialogUpgradeSuccess
                Intrinsics.checkNotNull(alertDialog)
                alertDialog.show()
                return
            }
        }
        val companion2: AppController = AppController.Companion.Companion.getInstance()
        generateDialogUpgradeSuccess(if (companion2 != null) companion2.key else null)
        val alertDialog2: AlertDialog? = dialogUpgradeSuccess
        if (alertDialog2 != null) {
            Intrinsics.checkNotNull(alertDialog2)
            alertDialog2.show()
        }
    }

    fun showDialogUpgrade() {
        val bottomUpgradeDialog = dialogUpgrade
        if (bottomUpgradeDialog != null) {
            Intrinsics.checkNotNull(bottomUpgradeDialog)
            if (bottomUpgradeDialog.isVisible) {
                return
            }
            val bottomUpgradeDialog2 = dialogUpgrade
            Intrinsics.checkNotNull(bottomUpgradeDialog2)
            bottomUpgradeDialog2.show(getSupportFragmentManager(), "dialogUpgrade")
        }
    }

    fun hideDialogUpgrade() {
        val bottomUpgradeDialog = dialogUpgrade
        if (bottomUpgradeDialog != null) {
            Intrinsics.checkNotNull(bottomUpgradeDialog)
            if (bottomUpgradeDialog.isVisible) {
                val bottomUpgradeDialog2 = dialogUpgrade
                Intrinsics.checkNotNull(bottomUpgradeDialog2)
                bottomUpgradeDialog2.dismiss()
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    override fun onPause() {
        super.onPause()
    }

    @Override // android.app.Activity, android.view.Window.Callback
    fun onWindowFocusChanged(z: Boolean) {
        BaseActivity.Companion.isWindowFocused = z
        if (BaseActivity.Companion.isBackPressed && !z) {
            BaseActivity.Companion.isBackPressed = false
            BaseActivity.Companion.isWindowFocused = true
        }
        super.onWindowFocusChanged(z)
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    fun onUserLeaveHint() {
        Log.d("onUserLeaveHint", "Home button pressed")
        super.onUserLeaveHint()
    }

    private fun applicationWillEnterForeground() {
        if (BaseActivity.Companion.isAppWentToBg) {
            BaseActivity.Companion.isAppWentToBg = false
        }
    }

    fun applicationdidenterbackground() {
        if (BaseActivity.Companion.isWindowFocused) {
            return
        }
        BaseActivity.Companion.isAppWentToBg = true
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    override fun onStop() {
        super.onStop()
        applicationdidenterbackground()
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    override fun onStart() {
        applicationWillEnterForeground()
        super.onStart()
        checkMyKey()
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    override fun onResume() {
        super.onResume()
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    override fun onDestroy() {
        hideDialogUpgrade()
        val alertDialog: AlertDialog? = dialogUpgradeSuccess
        if (alertDialog != null) {
            Intrinsics.checkNotNull(alertDialog)
            if (alertDialog.isShowing()) {
                val alertDialog2: AlertDialog? = dialogUpgradeSuccess
                Intrinsics.checkNotNull(alertDialog2)
                alertDialog2.dismiss()
            }
        }
        super.onDestroy()
    }

    @Override // com.lagradost.cloudstream3.p041ui.browser.ICallback
    override fun onCallback(s: String) {
        Intrinsics.checkNotNullParameter(s, "s")
        val progressDialogCustom = dialogLoading
        Intrinsics.checkNotNull(progressDialogCustom)
        progressDialogCustom!!.showDialog()
        val key = Key()
        key.setKey(s)
        ApiUtils().createApi().checkKey(AbstractSpiCall.ACCEPT_JSON_VALUE, key)
            .enqueue(object : CallBackBase<ApiResponse<Key?>?>() {
                // from class: com.phimhd.BaseActivity$onCallback$1
                @Override // com.lagradost.cloudstream3.services.CallBackBase
                override fun onRequestSuccess(
                    call: Call<ApiResponse<Key?>>?,
                    response: Response<ApiResponse<Key?>>?
                ) {
                    Intrinsics.checkNotNullParameter(call, "call")
                    Intrinsics.checkNotNullParameter(response, "response")
                    val dialogLoading = dialogLoading
                    Intrinsics.checkNotNull(dialogLoading)
                    dialogLoading!!.hideDialog()
                    if (response!!.isSuccessful() && response.body() != null) {
                        val body: ApiResponse<Key?> = response.body()
                        Intrinsics.checkNotNull(body)
                        if (body.isSuccess) {
                            val body2: ApiResponse<Key?> = response.body()
                            Intrinsics.checkNotNull(body2)
                            if (body2.getData() != null) {
                                val body3: ApiResponse<Key?> = response.body()
                                Intrinsics.checkNotNull(body3)
                                val data: Key = body3.getData()
                                val companion: AppController =
                                    AppController.Companion.Companion.getInstance()
                                if (companion != null) {
                                    companion.key = data
                                }
                                showKeyToUI(data)
                                return
                            }
                        }
                        val body4: ApiResponse<Key?> = response.body()
                        Intrinsics.checkNotNull(body4)
                        LogUtils.m6078e(body4.message, *arrayOfNulls<Object>(0))
                        val baseActivity = this@BaseActivity
                        Toast.makeText(
                            baseActivity,
                            baseActivity.getString(R.string.active_fail),
                            0
                        ).show()
                        return
                    }
                    LogUtils.m6078e(response.message(), *arrayOfNulls<Object>(0))
                    val baseActivity2 = this@BaseActivity
                    Toast.makeText(baseActivity2, baseActivity2.getString(R.string.active_fail), 0)
                        .show()
                }

                @Override // com.lagradost.cloudstream3.services.CallBackBase
                override fun onRequestFailure(call: Call<ApiResponse<Key?>>?, t: Throwable?) {
                    Intrinsics.checkNotNullParameter(call, "call")
                    Intrinsics.checkNotNullParameter(t, "t")
                    val dialogLoading = dialogLoading
                    Intrinsics.checkNotNull(dialogLoading)
                    dialogLoading!!.hideDialog()
                    LogUtils.m6078e(t.getMessage(), arrayOfNulls<Object>(0))
                    val baseActivity = this@BaseActivity
                    Toast.makeText(baseActivity, baseActivity.getString(R.string.active_fail), 0)
                        .show()
                }
            })
    }

    fun showKeyToUI(key: Key?) {
        val baseActivity = this
        LocalBroadcastManager.getInstance(baseActivity)
            .sendBroadcast(Intent(Constants.INTENT_UPDATE_KEY))
        val lottieAnimationView = LottieAnimationView(baseActivity)
        lottieAnimationView.setAnimation(R.raw.animation)
        lottieAnimationView.setLayoutParams(LayoutParams(-1, -1))
        if (findViewById<View>(R.id.homeRoot) != null) {
            val findViewById: View = findViewById<View>(R.id.homeRoot)
            Objects.requireNonNull(
                findViewById,
                "null cannot be cast to non-null type android.view.ViewGroup"
            )
            (findViewById as ViewGroup).addView(lottieAnimationView)
        }
        lottieAnimationView.setRepeatMode(1)
        lottieAnimationView.playAnimation()
        lottieAnimationView.addAnimatorListener(object : AnimatorListenerAdapter() {
            // from class: com.phimhd.BaseActivity$showKeyToUI$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            fun onAnimationEnd(animation: Animator?) {
                Intrinsics.checkNotNullParameter(animation, "animation")
                super.onAnimationEnd(animation)
                if (this@BaseActivity.findViewById<View>(R.id.homeRoot) != null) {
                    val findViewById2: View = this@BaseActivity.findViewById<View>(R.id.homeRoot)
                    Objects.requireNonNull(
                        findViewById2,
                        "null cannot be cast to non-null type android.view.ViewGroup"
                    )
                    (findViewById2 as ViewGroup).removeView(lottieAnimationView)
                }
            }
        })
        generateDialogUpgradeSuccess(key)
        val alertDialog: AlertDialog? = dialogUpgradeSuccess
        if (alertDialog != null) {
            Intrinsics.checkNotNull(alertDialog)
            if (alertDialog.isShowing()) {
                return
            }
            val alertDialog2: AlertDialog? = dialogUpgradeSuccess
            Intrinsics.checkNotNull(alertDialog2)
            alertDialog2.show()
        }
    }

    /* compiled from: BaseActivity.kt */
    @Metadata(
        m108d1 = ["\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0005\"\u0004\b\t\u0010\u0007R\u001a\u0010\n\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0005\"\u0004\b\u000b\u0010\u0007R\u001a\u0010\u000c\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000c\u0010\u0005\"\u0004\b\r\u0010\u0007¨\u0006\u000e"],
        m107d2 = ["Lcom/phimhd/BaseActivity\$Companion;", "", "()V", "isAppWentToBg", "", "()Z", "setAppWentToBg", "(Z)V", "isBackPressed", "setBackPressed", "isMenuOpened", "setMenuOpened", "isWindowFocused", "setWindowFocused", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        var isAppWentToBg: Boolean
            get() = BaseActivity.Companion.isAppWentToBg
            set(z) {
                BaseActivity.Companion.isAppWentToBg = z
            }
        var isWindowFocused: Boolean
            get() = BaseActivity.Companion.isWindowFocused
            set(z) {
                BaseActivity.Companion.isWindowFocused = z
            }
        var isMenuOpened: Boolean
            get() = BaseActivity.Companion.isMenuOpened
            set(z) {
                BaseActivity.Companion.isMenuOpened = z
            }
        var isBackPressed: Boolean
            get() = BaseActivity.Companion.isBackPressed
            set(z) {
                BaseActivity.Companion.isBackPressed = z
            }
    }

    companion object {
        val Companion = Companion(null)
        private const val isAppWentToBg = false
        private const val isBackPressed = false
        private const val isMenuOpened = false
        private const val isWindowFocused = false

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: generateDialogUpgradeSuccess$lambda-1  reason: not valid java name */
        fun `m9034generateDialogUpgradeSuccess$lambda1`(dialog: DialogInterface, i: Int) {
            Intrinsics.checkNotNullParameter(dialog, "dialog")
            dialog.dismiss()
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: generateDialogUpgradeSuccess$lambda-2  reason: not valid java name */
        fun `m9035generateDialogUpgradeSuccess$lambda2`(
            `this$0`: BaseActivity,
            dialog: DialogInterface,
            i: Int
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(dialog, "dialog")
            val companion: AppController = AppController.Companion.Companion.getInstance()
            if (companion != null) {
                companion.key = null
            }
            dialog.dismiss()
            `this$0`.recreate()
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: generateDialogUpgradeSuccess$lambda-3  reason: not valid java name */
        fun `m9036generateDialogUpgradeSuccess$lambda3`(
            `this$0`: BaseActivity,
            dialogInterface: DialogInterface?
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val alertDialog: AlertDialog? = `this$0`.dialogUpgradeSuccess
            Intrinsics.checkNotNull(alertDialog)
            alertDialog.getButton(-1).setTextColor(ContextCompat.getColor(`this$0`, R.color.blue))
            val identifier: Int =
                `this$0`.getResources().getIdentifier("alertTitle", "id", "android")
            val alertDialog2: AlertDialog? = `this$0`.dialogUpgradeSuccess
            Intrinsics.checkNotNull(alertDialog2)
            val textView: TextView = alertDialog2.findViewById<View>(identifier) as TextView
            if (textView != null) {
                textView.setTextColor(ContextCompat.getColor(`this$0`, R.color.background_color))
            }
        }
    }
}