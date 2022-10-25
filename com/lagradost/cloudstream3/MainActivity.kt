package com.lagradost.cloudstream3

import android.content.Intent
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import com.bongngotv2.R
import com.google.android.gms.cast.framework.Session
import com.google.android.gms.cast.framework.SessionManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.lagradost.cloudstream3.utils.AppUtils
import kotlin.jvm.internal.Intrinsics

/* compiled from: MainActivity.kt */
@Metadata(
    m108d1 = ["\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 K2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002KLB\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0013H\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0014J\n\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u0013H\u0014J\b\u0010#\u001a\u00020\u0013H\u0014J\"\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u001f2\b\u0010'\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010(\u001a\u00020\u0013H\u0016J\u0018\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u001fH\u0016J\u0010\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020.H\u0016J\u0012\u0010/\u001a\u00020\u00132\b\u00100\u001a\u0004\u0018\u000101H\u0014J\b\u00102\u001a\u00020\u0013H\u0014J\u0010\u00103\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u001fH\u0016J\u001a\u00104\u001a\u00020\u00152\u0006\u00105\u001a\u00020\u001f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0018\u00106\u001a\u00020\u00152\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0002J\u0012\u0010;\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010<\u001a\u00020\u0013H\u0014J\b\u0010=\u001a\u00020\u0013H\u0014J\b\u0010>\u001a\u00020\u0013H\u0014J$\u0010?\u001a\u00020\u00132\u000c\u0010@\u001a\b\u0012\u0004\u0012\u00020B0A2\u000c\u0010C\u001a\b\u0012\u0004\u0012\u00020B0DH\u0016J\u0006\u0010E\u001a\u00020\u0013J\u0010\u0010F\u001a\u00020\u00132\u0006\u0010G\u001a\u00020HH\u0002J\u0016\u0010I\u001a\u00020\u0015*\u00020H2\b\b\u0001\u0010J\u001a\u00020\u001fH\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\u000c8BX\u0082\u0084\u0002¢\u0006\u000c\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006M"],
    m107d2 = ["Lcom/lagradost/cloudstream3/MainActivity;", "Lcom/phimhd/AdsActivity;", "Lcom/jaredrummler/android/colorpicker/ColorPickerDialogListener;", "Lcom/phimhd/ICallbackDialogFilter;", "()V", "mSessionManager", "Lcom/google/android/gms/cast/framework/SessionManager;", "getMSessionManager", "()Lcom/google/android/gms/cast/framework/SessionManager;", "setMSessionManager", "(Lcom/google/android/gms/cast/framework/SessionManager;)V", "mSessionManagerListener", "Lcom/google/android/gms/cast/framework/SessionManagerListener;", "Lcom/google/android/gms/cast/framework/Session;", "getMSessionManagerListener", "()Lcom/google/android/gms/cast/framework/SessionManagerListener;", "mSessionManagerListener\$delegate", "Lkotlin/Lazy;", "backPressed", "", "dispatchKeyEvent", "", "event", "Landroid/view/KeyEvent;", "dispatchTouchEvent", "Landroid/view/MotionEvent;", "handleAppIntent", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "hideDialogFilter", "initLayout", "", "initTvTimeCountdonwAds", "Landroid/widget/TextView;", "initVariables", "initViews", "onActivityResult", "requestCode", "resultCode", "data", "onBackPressed", "onColorSelected", "dialogId", "color", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onDialogDismissed", "onKeyDown", "keyCode", "onNavDestinationSelected", "item", "Landroid/view/MenuItem;", "navController", "Landroidx/navigation/NavController;", "onNewIntent", "onPause", "onResume", "onUserLeaveHint", "showDialogFilter", "list", "", "Lcom/lagradost/cloudstream3/Page;", "iCallbackToFragment", "Lcom/lagradost/cloudstream3/ui/browser/ICallback;", "test", "updateNavBar", "destination", "Landroidx/navigation/NavDestination;", "matchDestination", "destId", "Companion", "SessionManagerListenerImpl", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class MainActivity : AdsActivity(), ColorPickerDialogListener, ICallbackDialogFilter {
    var mSessionManager: SessionManager? = null
    var `_$_findViewCache`: Map<Integer, View> = LinkedHashMap()
    private val `mSessionManagerListener$delegate`: Lazy<*> =
        LazyKt.lazy(`MainActivity$mSessionManagerListener$2`(this))

    @Override // com.phimhd.AdsActivity, com.phimhd.BaseActivity
    override fun `_$_clearFindViewByIdCache`() {
        `_$_findViewCache`.clear()
    }

    @Override // com.phimhd.AdsActivity, com.phimhd.BaseActivity
    override fun `_$_findCachedViewById`(i: Int): View {
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

    fun test() {}

    /* compiled from: MainActivity.kt */
    @Metadata(
        m108d1 = ["\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"],
        m107d2 = ["Lcom/lagradost/cloudstream3/MainActivity\$Companion;", "", "()V", "TAG", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}
    }

    @Override // com.jaredrummler.android.colorpicker.ColorPickerDialogListener
    override fun onColorSelected(i: Int, i2: Int) {
        CommonActivity.Companion.INSTANCE.getOnColorSelectedEvent()
            .invoke(Tuples<A, B>(Integer.valueOf(i), Integer.valueOf(i2)))
    }

    @Override // com.jaredrummler.android.colorpicker.ColorPickerDialogListener
    override fun onDialogDismissed(i: Int) {
        CommonActivity.Companion.INSTANCE.getOnDialogDismissedEvent().invoke(Integer.valueOf(i))
    }

    @Override // com.phimhd.AdsActivity
    override fun initTvTimeCountdonwAds(): TextView {
        return `_$_findCachedViewById`(C4764id.tvTimeAds) as TextView
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.phimhd.AdsActivity, com.phimhd.BaseActivity
    override fun initVariables() {
        super.initVariables()
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.phimhd.AdsActivity, com.phimhd.BaseActivity
    override fun initViews() {
        super.initViews()
        val recyclerView: RecyclerView =
            `_$_findCachedViewById`(C4764id.rcvBlurFilter) as RecyclerView
        if (recyclerView != null) {
            recyclerView.setLayoutManager(LinearLayoutManager(this))
        }
        val recyclerView2: RecyclerView =
            `_$_findCachedViewById`(C4764id.rcvBlurFilter) as RecyclerView
        if (recyclerView2 != null) {
            recyclerView2.setHasFixedSize(true)
        }
        val floatingActionButton: FloatingActionButton =
            `_$_findCachedViewById`(C4764id.btnCloseDialogBlur) as FloatingActionButton
        if (floatingActionButton != null) {
            floatingActionButton.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.-$$Lambda$MainActivity$tHpbBIHKQj1tEKdz_J-Uo1-pRRo
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    MainActivity.Companion.`m8591initViews$lambda0`(this@MainActivity, view)
                }
            })
        }
        val frameLayout: FrameLayout =
            `_$_findCachedViewById`(C4764id.blurViewDialog) as FrameLayout
        if (frameLayout != null) {
            frameLayout.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.-$$Lambda$MainActivity$LCdJ2bQMIB9v3KGy_eqH4JpDGBw
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    MainActivity.Companion.`m8592initViews$lambda1`(this@MainActivity, view)
                }
            })
        }
    }

    @Override // com.phimhd.ICallbackDialogFilter
    override fun showDialogFilter(list: List<Page?>, iCallbackToFragment: ICallback<Page>) {
        Intrinsics.checkNotNullParameter(list, "list")
        Intrinsics.checkNotNullParameter(iCallbackToFragment, "iCallbackToFragment")
        (`_$_findCachedViewById`(C4764id.rcvBlurFilter) as RecyclerView).setAdapter(
            AdapterFilterItem(list, object : ICallback<Any?> {
                // from class: com.lagradost.cloudstream3.-$$Lambda$MainActivity$kR1NHcPF_uR0Mg9tRdwyzCeY_rw
                @Override // com.lagradost.cloudstream3.p041ui.browser.ICallback
                override fun onCallback(obj: Object) {
                    MainActivity.Companion.`m8597showDialogFilter$lambda2`(
                        this@MainActivity,
                        iCallbackToFragment,
                        obj as Page
                    )
                }
            })
        )
        val alphaAnimation = AlphaAnimation(0.0f, 1.0f)
        alphaAnimation.setDuration(300L)
        val animationSet = AnimationSet(false)
        animationSet.addAnimation(alphaAnimation)
        animationSet.setAnimationListener(object : AnimationListener() {
            // from class: com.lagradost.cloudstream3.MainActivity$showDialogFilter$1
            @Override // android.view.animation.Animation.AnimationListener
            fun onAnimationRepeat(animation: Animation?) {
                Intrinsics.checkNotNullParameter(animation, "animation")
            }

            @Override // android.view.animation.Animation.AnimationListener
            fun onAnimationStart(animation: Animation?) {
                Intrinsics.checkNotNullParameter(animation, "animation")
                (`_$_findCachedViewById`(C4764id.blurViewDialog) as FrameLayout).setAlpha(0.0f)
                (`_$_findCachedViewById`(C4764id.blurViewDialog) as FrameLayout).setVisibility(0)
            }

            @Override // android.view.animation.Animation.AnimationListener
            fun onAnimationEnd(animation: Animation?) {
                Intrinsics.checkNotNullParameter(animation, "animation")
                (`_$_findCachedViewById`(C4764id.blurViewDialog) as FrameLayout).setAlpha(1.0f)
                (`_$_findCachedViewById`(C4764id.blurViewDialog) as FrameLayout).setVisibility(0)
            }
        })
        (`_$_findCachedViewById`(C4764id.blurViewDialog) as FrameLayout).setAlpha(1.0f)
        (`_$_findCachedViewById`(C4764id.blurViewDialog) as FrameLayout).setVisibility(0)
    }

    @Override // com.phimhd.ICallbackDialogFilter
    override fun hideDialogFilter() {
        val alphaAnimation = AlphaAnimation(1.0f, 0.0f)
        alphaAnimation.setDuration(300L)
        val animationSet = AnimationSet(false)
        animationSet.addAnimation(alphaAnimation)
        animationSet.setAnimationListener(object : AnimationListener() {
            // from class: com.lagradost.cloudstream3.MainActivity$hideDialogFilter$1
            @Override // android.view.animation.Animation.AnimationListener
            fun onAnimationRepeat(animation: Animation?) {
                Intrinsics.checkNotNullParameter(animation, "animation")
            }

            @Override // android.view.animation.Animation.AnimationListener
            fun onAnimationStart(animation: Animation?) {
                Intrinsics.checkNotNullParameter(animation, "animation")
                (`_$_findCachedViewById`(C4764id.blurViewDialog) as FrameLayout).setAlpha(1.0f)
                (`_$_findCachedViewById`(C4764id.blurViewDialog) as FrameLayout).setVisibility(0)
            }

            @Override // android.view.animation.Animation.AnimationListener
            fun onAnimationEnd(animation: Animation?) {
                Intrinsics.checkNotNullParameter(animation, "animation")
                (`_$_findCachedViewById`(C4764id.blurViewDialog) as FrameLayout).setAlpha(0.0f)
                (`_$_findCachedViewById`(C4764id.blurViewDialog) as FrameLayout).setVisibility(8)
            }
        })
        (`_$_findCachedViewById`(C4764id.blurViewDialog) as FrameLayout).startAnimation(animationSet)
    }

    @Override // com.phimhd.AdsActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    override fun onConfigurationChanged(newConfig: Configuration) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig")
        super.onConfigurationChanged(newConfig)
        CommonActivity.Companion.INSTANCE.updateLocale(this)
        val findFragmentById: Fragment =
            getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment)
        Objects.requireNonNull(
            findFragmentById,
            "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment"
        )
        val currentDestination: NavDestination =
            (findFragmentById as NavHostFragment).getNavController().getCurrentDestination()
        if (currentDestination != null) {
            updateNavBar(currentDestination)
        }
    }

    private fun updateNavBar(navDestination: NavDestination) {
        UIHelper.INSTANCE.hideKeyboard(this)
        val linearLayout: LinearLayout =
            `_$_findCachedViewById`(C4764id.cast_mini_controller_holder) as LinearLayout
        val z = true
        if (linearLayout != null) {
            linearLayout.setVisibility(
                if (CollectionsKt.listOf<Object>(
                        *arrayOf<Integer>(
                            Integer.valueOf(
                                R.id.navigation_results
                            ), Integer.valueOf(R.id.navigation_player)
                        ) as Array<Object>
                    ).contains(Integer.valueOf(navDestination.getId())) xor true
                ) 0 else 8
            )
        }
        val contains: Boolean = CollectionsKt.listOf<Object>(
            *arrayOf<Integer>(
                Integer.valueOf(
                    R.id.navigation_home
                ),
                Integer.valueOf(R.id.navigation_search),
                Integer.valueOf(R.id.navigation_downloads),
                Integer.valueOf(
                    R.id.navigation_profile
                ),
                Integer.valueOf(R.id.navigation_download_child),
                Integer.valueOf(R.id.navigation_subtitles),
                Integer.valueOf(
                    R.id.navigation_chrome_subtitles
                ),
                Integer.valueOf(R.id.navigation_settings_player),
                Integer.valueOf(R.id.navigation_settings_updates),
                Integer.valueOf(
                    R.id.navigation_settings_ui
                ),
                Integer.valueOf(R.id.navigation_settings_account),
                Integer.valueOf(R.id.navigation_settings_lang),
                Integer.valueOf(
                    R.id.navigation_settings_general
                )
            ) as Array<Object>
        ).contains(Integer.valueOf(navDestination.getId()))
        val i: Int = getResources().getConfiguration().orientation
        val z2 = i != 1 && i == 2
        val bottomNavigationView = `_$_findCachedViewById`(C4764id.nav_view) as BottomNavigationView
        bottomNavigationView?.setVisibility(if (contains && !z2) 0 else 8)
        val navigationRailView: NavigationRailView =
            `_$_findCachedViewById`(C4764id.nav_rail_view) as NavigationRailView
                ?: return
        navigationRailView.setVisibility(if (contains && z2) false else if (false) 0 else 8)
    }

    fun getMSessionManager(): SessionManager? {
        val sessionManager = mSessionManager
        if (sessionManager != null) {
            return sessionManager
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSessionManager")
        return null
    }

    fun setMSessionManager(sessionManager: SessionManager?) {
        Intrinsics.checkNotNullParameter(sessionManager, "<set-?>")
        mSessionManager = sessionManager
    }

    private val mSessionManagerListener: SessionManagerListener<Session>
        private get() = `mSessionManagerListener$delegate`.value as SessionManagerListener<*>

    /* JADX INFO: Access modifiers changed from: private */ /* compiled from: MainActivity.kt */
    @Metadata(
        m108d1 = ["\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u0018\u0010\u000c\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bH\u0016¨\u0006\u0017"],
        m107d2 = ["Lcom/lagradost/cloudstream3/MainActivity\$SessionManagerListenerImpl;", "Lcom/google/android/gms/cast/framework/SessionManagerListener;", "Lcom/google/android/gms/cast/framework/Session;", "(Lcom/lagradost/cloudstream3/MainActivity;)V", "onSessionEnded", "", "session", "error", "", "onSessionEnding", "onSessionResumeFailed", "i", "onSessionResumed", "wasSuspended", "", "onSessionResuming", "s", "", "onSessionStartFailed", "onSessionStarted", "sessionId", "onSessionStarting", "onSessionSuspended", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    /* loaded from: classes3.dex */
    inner class SessionManagerListenerImpl : SessionManagerListener<Session?> {
        @Override // com.google.android.gms.cast.framework.SessionManagerListener
        override fun onSessionEnded(session: Session, i: Int) {
            Intrinsics.checkNotNullParameter(session, "session")
        }

        @Override // com.google.android.gms.cast.framework.SessionManagerListener
        override fun onSessionEnding(session: Session) {
            Intrinsics.checkNotNullParameter(session, "session")
        }

        @Override // com.google.android.gms.cast.framework.SessionManagerListener
        override fun onSessionResumeFailed(session: Session, i: Int) {
            Intrinsics.checkNotNullParameter(session, "session")
        }

        @Override // com.google.android.gms.cast.framework.SessionManagerListener
        override fun onSessionResuming(session: Session, s: String) {
            Intrinsics.checkNotNullParameter(session, "session")
            Intrinsics.checkNotNullParameter(s, "s")
        }

        @Override // com.google.android.gms.cast.framework.SessionManagerListener
        override fun onSessionStartFailed(session: Session, i: Int) {
            Intrinsics.checkNotNullParameter(session, "session")
        }

        @Override // com.google.android.gms.cast.framework.SessionManagerListener
        override fun onSessionStarting(session: Session) {
            Intrinsics.checkNotNullParameter(session, "session")
        }

        @Override // com.google.android.gms.cast.framework.SessionManagerListener
        override fun onSessionSuspended(session: Session, i: Int) {
            Intrinsics.checkNotNullParameter(session, "session")
        }

        @Override // com.google.android.gms.cast.framework.SessionManagerListener
        override fun onSessionStarted(session: Session, sessionId: String) {
            Intrinsics.checkNotNullParameter(session, "session")
            Intrinsics.checkNotNullParameter(sessionId, "sessionId")
            this@MainActivity.invalidateOptionsMenu()
        }

        @Override // com.google.android.gms.cast.framework.SessionManagerListener
        override fun onSessionResumed(session: Session, z: Boolean) {
            Intrinsics.checkNotNullParameter(session, "session")
            this@MainActivity.invalidateOptionsMenu()
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.phimhd.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    override fun onResume() {
        super.onResume()
        try {
            if (AppUtils.INSTANCE.isCastApiAvailable(this)) {
                getMSessionManager()!!.addSessionManagerListener(mSessionManagerListener)
            }
        } catch (e: Exception) {
            ArchComponentExt.logError(e)
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.phimhd.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    override fun onPause() {
        super.onPause()
        try {
            if (AppUtils.INSTANCE.isCastApiAvailable(this)) {
                getMSessionManager()!!.removeSessionManagerListener(mSessionManagerListener)
            }
        } catch (e: Exception) {
            ArchComponentExt.logError(e)
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    override fun dispatchKeyEvent(keyEvent: KeyEvent): Boolean {
        val dispatchKeyEvent: Boolean =
            CommonActivity.Companion.INSTANCE.dispatchKeyEvent(this, keyEvent)
        return if (dispatchKeyEvent != null) dispatchKeyEvent.booleanValue() else super.dispatchKeyEvent(
            keyEvent
        )
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    override fun onKeyDown(i: Int, keyEvent: KeyEvent): Boolean {
        CommonActivity.Companion.INSTANCE.onKeyDown(this, i, keyEvent)
        return super.onKeyDown(i, keyEvent)
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.phimhd.BaseActivity, android.app.Activity
    override fun onUserLeaveHint() {
        super.onUserLeaveHint()
        CommonActivity.Companion.INSTANCE.onUserLeaveHint(this)
    }

    private fun backPressed() {
        val window: Window = getWindow()
        if (window != null) {
            window.setNavigationBarColor(
                UIHelper.INSTANCE.colorFromAttribute(
                    this,
                    R.attr.primaryGrayBackground
                )
            )
        }
        val mainActivity = this
        CommonActivity.Companion.INSTANCE.updateLocale(mainActivity)
        super.onBackPressed()
        CommonActivity.Companion.INSTANCE.updateLocale(mainActivity)
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    override fun onBackPressed() {
        var childFragmentManager: FragmentManager
        val findFragmentById: Fragment =
            getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment)
        var unit: Unit = null
        val navHostFragment: NavHostFragment? =
            if (findFragmentById is NavHostFragment) findFragmentById as NavHostFragment else null
        val primaryNavigationFragment: Fragment? =
            if (navHostFragment == null || navHostFragment.getChildFragmentManager()
                    .also { childFragmentManager = it } == null
            ) null else childFragmentManager.getPrimaryNavigationFragment()
        val iOnBackPressed: IOnBackPressed? =
            if (primaryNavigationFragment is IOnBackPressed) primaryNavigationFragment as IOnBackPressed? else null
        if (iOnBackPressed != null) {
            if (iOnBackPressed.onBackPressed()) {
                backPressed()
            }
            unit = Unit.INSTANCE
        }
        if (unit == null) {
            backPressed()
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */ /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    override fun onActivityResult(i: Int, i2: Int, intent: Intent) {
        if (42 == i && i2 == -1 && intent != null) {
            val longExtra: Long = intent.getLongExtra(MainActivityKt.VLC_EXTRA_POSITION_OUT, -1L)
            val longExtra2: Long = intent.getLongExtra(MainActivityKt.VLC_EXTRA_DURATION_OUT, -1L)
            val dataStore: DataStore = DataStore.INSTANCE
            val mainActivity = this
            var num: Integer? = null
            try {
                val string: String = dataStore.getSharedPrefs(mainActivity)
                    .getString(MainActivityKt.VLC_LAST_ID_KEY, null)
                if (string != null) {
                    Intrinsics.checkNotNullExpressionValue(
                        string,
                        "getSharedPrefs().getStri…h, null) ?: return defVal"
                    )
                    val readValue: Object =
                        dataStore.getMapper().readValue<Any>(string, Integer::class.java)
                    Intrinsics.checkNotNullExpressionValue(
                        readValue,
                        "mapper.readValue(this, T::class.java)"
                    )
                    num = readValue
                }
            } catch (unused: Exception) {
            }
            val num2: Integer = num
            System.out.println("SET KEY $num2 at $longExtra / $longExtra2" as Object)
            if (longExtra2 > 0 && longExtra > 0) {
                DataStoreHelper.INSTANCE.setViewPos(num2, longExtra, longExtra2)
            }
            DataStore.INSTANCE.removeKey(mainActivity, MainActivityKt.VLC_LAST_ID_KEY)
            ResultFragmentPhimHD.Companion.updateUI()
        }
        super.onActivityResult(i, i2, intent)
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.phimhd.AdsActivity, com.phimhd.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    override fun onDestroy() {
        val intent = Intent()
        intent.setAction("restart_service")
        intent.setClass(this, VideoDownloadRestartReceiver::class.java)
        sendBroadcast(intent)
        super.onDestroy()
    }

    @Override // com.phimhd.BaseActivity
    protected override fun initLayout(): Int {
        return if (SettingsFragment.Companion.isTvSettings(this)) R.layout.activity_main_tv else R.layout.activity_main
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    override fun onNewIntent(intent: Intent) {
        handleAppIntent(intent)
        super.onNewIntent(intent)
    }

    /* JADX WARN: Type inference failed for: r15v18, types: [T, java.lang.String] */ /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.String] */
    private fun handleAppIntent(intent: Intent?) {
        if (intent == null) {
            return
        }
        val objectRef: ObjectRef<*> = ObjectRef<Any?>()
        objectRef.element = intent.getDataString()
        if (objectRef.element == 0) {
            objectRef.element = intent.getStringExtra("jsonData")
        }
        Log.d("DuongKK", "String data = " + objectRef.element as String)
        val mainActivity = this
        AppUtils.INSTANCE.loadCache(mainActivity)
        if (objectRef.element != 0) {
            if (StringsKt.`contains$default`(
                    objectRef.element as CharSequence,
                    AccountManager.appString as CharSequence,
                    false,
                    2,
                    null as Object?
                )
            ) {
                for (oAuth2API in AccountManager.Companion.getOAuth2Apis()) {
                    if (StringsKt.`contains$default`(
                            objectRef.element as CharSequence,
                            (JsonPointer.SEPARATOR + oAuth2API.getRedirectUrl()) as CharSequence,
                            false,
                            2,
                            null as Object?
                        )
                    ) {
                        Coroutines.INSTANCE.ioSafe(
                            `MainActivity$handleAppIntent$1`(
                                objectRef,
                                oAuth2API,
                                this,
                                null
                            )
                        )
                    }
                }
            } else if (StringsKt.`startsWith$default`(
                    objectRef.element as String,
                    DownloadFragmentKt.DOWNLOAD_NAVIGATE_TO,
                    false,
                    2,
                    null as Object?
                )
            ) {
                UIHelper.`navigate$default`(
                    UIHelper.INSTANCE,
                    mainActivity,
                    R.id.navigation_downloads,
                    null,
                    2,
                    null
                )
            } else {
                for (mainAPI in APIHolder.Companion.INSTANCE.getApis()) {
                    if (StringsKt.`startsWith$default`(
                            objectRef.element as String,
                            mainAPI.mainUrl,
                            false,
                            2,
                            null as Object?
                        )
                    ) {
                        AppUtils.INSTANCE.loadResult(
                            this,
                            objectRef.element as String,
                            mainAPI.name,
                            if (r13 and 4 !== 0) 0 else 0,
                            if (r13 and 8 !== 0) 0 else 0
                        )
                        return
                    }
                }
            }
        }
    }

    @Override // com.phimhd.BaseActivity, android.app.Activity, android.view.Window.Callback
    override fun dispatchTouchEvent(event: MotionEvent): Boolean {
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

    private fun matchDestination(navDestination: NavDestination, i: Int): Boolean {
        var z: Boolean
        val it: Iterator<NavDestination> =
            NavDestination.Companion.getHierarchy(navDestination).iterator()
        do {
            z = false
            if (!it.hasNext()) {
                return false
            }
            if (it.next().getId() === i) {
                z = true
                continue
            }
        } while (!z)
        return true
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x005f, code lost:
        if (matchDestination(r7, r6.getItemId()) == true) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private fun onNavDestinationSelected(r6: MenuItem, r7: NavController): Boolean {
        /*
            r5 = this;
            androidx.navigation.NavOptions$Builder r0 = new androidx.navigation.NavOptions$Builder
            r0.<init>()
            r1 = 1
            androidx.navigation.NavOptions$Builder r0 = r0.setLaunchSingleTop(r1)
            androidx.navigation.NavOptions$Builder r0 = r0.setRestoreState(r1)
            r2 = 2130771996(0x7f01001c, float:1.7147098E38)
            androidx.navigation.NavOptions$Builder r0 = r0.setEnterAnim(r2)
            r2 = 2130771997(0x7f01001d, float:1.71471E38)
            androidx.navigation.NavOptions$Builder r0 = r0.setExitAnim(r2)
            r2 = 2130772012(0x7f01002c, float:1.714713E38)
            androidx.navigation.NavOptions$Builder r0 = r0.setPopEnterAnim(r2)
            r2 = 2130772013(0x7f01002d, float:1.7147132E38)
            androidx.navigation.NavOptions$Builder r0 = r0.setPopExitAnim(r2)
            int r2 = r6.getOrder()
            r3 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 & r3
            r3 = 0
            if (r2 != 0) goto L45
            androidx.navigation.NavGraph$Companion r2 = androidx.navigation.NavGraph.Companion
            androidx.navigation.NavGraph r4 = r7.getGraph()
            androidx.navigation.NavDestination r2 = r2.findStartDestination(r4)
            int r2 = r2.getId()
            r0.setPopUpTo(r2, r3, r1)
        L45:
            androidx.navigation.NavOptions r0 = r0.build()
            int r2 = r6.getItemId()     // Catch: java.lang.IllegalArgumentException -> L64
            r4 = 0
            r7.navigate(r2, r4, r0)     // Catch: java.lang.IllegalArgumentException -> L64
            androidx.navigation.NavDestination r7 = r7.getCurrentDestination()     // Catch: java.lang.IllegalArgumentException -> L64
            if (r7 == 0) goto L62
            int r6 = r6.getItemId()     // Catch: java.lang.IllegalArgumentException -> L64
            boolean r6 = r5.matchDestination(r7, r6)     // Catch: java.lang.IllegalArgumentException -> L64
            if (r6 != r1) goto L62
            goto L63
        L62:
            r1 = 0
        L63:
            r3 = r1
        L64:
            return r3
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.MainActivity.onNavDestinationSelected(android.view.MenuItem, androidx.navigation.NavController):boolean")
    }

    /* JADX INFO: Access modifiers changed from: protected */ /* JADX WARN: Can't wrap try/catch for region: R(15:1|(2:4|2)|5|6|(2:7|8)|9|(3:10|11|12)|(7:14|(2:94|95)(1:16)|17|18|19|20|(29:22|23|24|(3:26|(5:28|(2:29|(2:31|(2:33|34))(2:41|42))|35|(2:37|38)(1:40)|39)|43)|44|45|46|47|(1:49)|51|(1:53)|54|(1:56)|(1:58)|59|(1:61)|62|(1:64)|(1:66)|(1:68)|69|(1:71)|72|(2:74|(1:76))|78|79|80|81|82)(28:89|24|(0)|44|45|46|47|(0)|51|(0)|54|(0)|(0)|59|(0)|62|(0)|(0)|(0)|69|(0)|72|(0)|78|79|80|81|82))|99|(0)(0)|17|18|19|20|(0)(0)) */ /* JADX WARN: Can't wrap try/catch for region: R(16:1|(2:4|2)|5|6|7|8|9|(3:10|11|12)|(7:14|(2:94|95)(1:16)|17|18|19|20|(29:22|23|24|(3:26|(5:28|(2:29|(2:31|(2:33|34))(2:41|42))|35|(2:37|38)(1:40)|39)|43)|44|45|46|47|(1:49)|51|(1:53)|54|(1:56)|(1:58)|59|(1:61)|62|(1:64)|(1:66)|(1:68)|69|(1:71)|72|(2:74|(1:76))|78|79|80|81|82)(28:89|24|(0)|44|45|46|47|(0)|51|(0)|54|(0)|(0)|59|(0)|62|(0)|(0)|(0)|69|(0)|72|(0)|78|79|80|81|82))|99|(0)(0)|17|18|19|20|(0)(0)) */ /* JADX WARN: Code restructure failed: missing block: B:49:0x014a, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x014b, code lost:
        com.lagradost.cloudstream3.mvvm.ArchComponentExt.logError(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */ /* JADX WARN: Removed duplicated region for block: B:28:0x00ac  */ /* JADX WARN: Removed duplicated region for block: B:29:0x00ad A[Catch: Exception -> 0x00c2, TRY_LEAVE, TryCatch #6 {Exception -> 0x00c2, blocks: (B:26:0x00a2, B:29:0x00ad), top: B:108:0x00a2 }] */ /* JADX WARN: Removed duplicated region for block: B:34:0x00c7 A[Catch: Exception -> 0x014a, TryCatch #2 {Exception -> 0x014a, blocks: (B:25:0x009b, B:32:0x00c3, B:34:0x00c7, B:36:0x00cb, B:37:0x00d9, B:39:0x00df, B:43:0x00fa, B:45:0x00fe, B:46:0x0134, B:47:0x0137), top: B:100:0x009b }] */ /* JADX WARN: Removed duplicated region for block: B:54:0x0174 A[Catch: Exception -> 0x0188, TRY_LEAVE, TryCatch #3 {Exception -> 0x0188, blocks: (B:52:0x0169, B:54:0x0174), top: B:102:0x0169 }] */ /* JADX WARN: Removed duplicated region for block: B:60:0x01ce  */ /* JADX WARN: Removed duplicated region for block: B:63:0x01de  */ /* JADX WARN: Removed duplicated region for block: B:65:0x01e6  */ /* JADX WARN: Removed duplicated region for block: B:68:0x01f8  */ /* JADX WARN: Removed duplicated region for block: B:72:0x0230  */ /* JADX WARN: Removed duplicated region for block: B:75:0x0236  */ /* JADX WARN: Removed duplicated region for block: B:78:0x023c  */ /* JADX WARN: Removed duplicated region for block: B:82:0x024a  */ /* JADX WARN: Removed duplicated region for block: B:85:0x0255  */ /* JADX WARN: Removed duplicated region for block: B:96:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */ /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    @Override // com.phimhd.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun onCreate(r15: Bundle?) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.MainActivity.onCreate(android.os.Bundle):void")
    }

    companion object {
        val Companion = Companion(null)
        const val TAG = "MAINACT"

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: initViews$lambda-0  reason: not valid java name */
        fun `m8591initViews$lambda0`(`this$0`: MainActivity, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            `this$0`.hideDialogFilter()
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: initViews$lambda-1  reason: not valid java name */
        fun `m8592initViews$lambda1`(`this$0`: MainActivity, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            `this$0`.hideDialogFilter()
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: showDialogFilter$lambda-2  reason: not valid java name */
        fun `m8597showDialogFilter$lambda2`(
            `this$0`: MainActivity,
            iCallbackToFragment: ICallback<*>,
            page: Page?
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(iCallbackToFragment, "\$iCallbackToFragment")
            `this$0`.hideDialogFilter()
            iCallbackToFragment.onCallback(page)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onCreate$lambda-13  reason: not valid java name */
        fun `m8594onCreate$lambda13`(
            `this$0`: MainActivity,
            navController: NavController,
            item: MenuItem
        ): Boolean {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(navController, "\$navController")
            Intrinsics.checkNotNullParameter(item, "item")
            return `this$0`.onNavDestinationSelected(item, navController)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onCreate$lambda-14  reason: not valid java name */
        fun `m8595onCreate$lambda14`(
            `this$0`: MainActivity,
            navController: NavController,
            item: MenuItem
        ): Boolean {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(navController, "\$navController")
            Intrinsics.checkNotNullParameter(item, "item")
            return `this$0`.onNavDestinationSelected(item, navController)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onCreate$lambda-15  reason: not valid java name */
        fun `m8596onCreate$lambda15`(
            `this$0`: MainActivity,
            navController: NavController?,
            destination: NavDestination,
            bundle: Bundle?
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(navController, "<anonymous parameter 0>")
            Intrinsics.checkNotNullParameter(destination, "destination")
            `this$0`.updateNavBar(destination)
        }
    }
}