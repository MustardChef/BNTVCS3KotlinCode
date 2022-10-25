package com.lagradost.cloudstream3

import android.app.Activity
import com.bongngotv2.R
import com.google.android.gms.cast.framework.SessionManager
import com.lagradost.cloudstream3.utils.Event
import kotlin.jvm.internal.Intrinsics

/* compiled from: CommonActivity.kt */
@Metadata(
    m108d1 = ["\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001GB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010*\u001a\u0004\u0018\u00010\u00062\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010.J5\u0010/\u001a\u0004\u0018\u00010 2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u00100\u001a\u0004\u0018\u0001012\u0006\u00102\u001a\u0002032\b\b\u0002\u00104\u001a\u00020 H\u0002¢\u0006\u0002\u00105J\u0010\u00106\u001a\u00020'2\b\u0010+\u001a\u0004\u0018\u00010,J\u0010\u00107\u001a\u00020'2\b\u0010+\u001a\u0004\u0018\u00010,J\"\u00108\u001a\u00020'2\b\u0010+\u001a\u0004\u0018\u00010,2\u0006\u00109\u001a\u00020 2\b\u0010-\u001a\u0004\u0018\u00010\u0019J\u0010\u0010:\u001a\u00020'2\b\u0010+\u001a\u0004\u0018\u00010,J\u001a\u0010;\u001a\u00020'2\b\u0010<\u001a\u0004\u0018\u00010=2\b\u0010>\u001a\u0004\u0018\u00010\u0004J\"\u0010?\u001a\u00020'2\b\u0010+\u001a\u0004\u0018\u00010,2\b\b\u0001\u0010@\u001a\u00020 2\u0006\u0010A\u001a\u00020 J+\u0010?\u001a\u00020'2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010@\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010A\u001a\u0004\u0018\u00010 ¢\u0006\u0002\u0010BJ\u000c\u0010C\u001a\u00020'*\u00020,H\u0002J\u000e\u0010D\u001a\u0004\u0018\u00010E*\u0004\u0018\u00010,J\n\u0010F\u001a\u00020'*\u00020=R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000c\u0010\b\"\u0004\b\r\u0010\nR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\b\"\u0004\b\u0015\u0010\nR6\u0010\u0016\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u00060\u0018\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR#\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0\u00180\u001f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R(\u0010%\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001d¨\u0006H"],
    m107d2 = ["Lcom/lagradost/cloudstream3/CommonActivity;", "", "()V", "TAG", "", "canEnterPipMode", "", "getCanEnterPipMode", "()Z", "setCanEnterPipMode", "(Z)V", "canShowPipMode", "getCanShowPipMode", "setCanShowPipMode", "currentToast", "Landroid/widget/Toast;", "getCurrentToast", "()Landroid/widget/Toast;", "setCurrentToast", "(Landroid/widget/Toast;)V", "isInPIPMode", "setInPIPMode", "keyEventListener", "Lkotlin/Function1;", "Lkotlin/Pair;", "Landroid/view/KeyEvent;", "getKeyEventListener", "()Lkotlin/jvm/functions/Function1;", "setKeyEventListener", "(Lkotlin/jvm/functions/Function1;)V", "onColorSelectedEvent", "Lcom/lagradost/cloudstream3/utils/Event;", "", "getOnColorSelectedEvent", "()Lcom/lagradost/cloudstream3/utils/Event;", "onDialogDismissedEvent", "getOnDialogDismissedEvent", "playerEventListener", "Lcom/lagradost/cloudstream3/ui/player/PlayerEventType;", "", "getPlayerEventListener", "setPlayerEventListener", "dispatchKeyEvent", "act", "Landroid/app/Activity;", "event", "(Landroid/app/Activity;Landroid/view/KeyEvent;)Ljava/lang/Boolean;", "getNextFocus", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "direction", "Lcom/lagradost/cloudstream3/CommonActivity\$FocusDirection;", "depth", "(Landroid/app/Activity;Landroid/view/View;Lcom/lagradost/cloudstream3/CommonActivity\$FocusDirection;I)Ljava/lang/Integer;", "init", "loadThemes", "onKeyDown", "keyCode", "onUserLeaveHint", "setLocale", "context", "Landroid/content/Context;", "languageCode", "showToast", "message", TypedValues.TransitionType.S_DURATION, "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Integer;)V", "enterPIPMode", "getCastSession", "Lcom/google/android/gms/cast/framework/CastSession;", "updateLocale", "FocusDirection", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes3.dex */
class CommonActivity private constructor() {
    /* compiled from: CommonActivity.kt */
    @Metadata(
        m108d1 = ["\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"],
        m107d2 = ["Lcom/lagradost/cloudstream3/CommonActivity\$FocusDirection;", "", "(Ljava/lang/String;I)V", "Left", "Right", "Up", "Down", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    /* loaded from: classes3.dex */
    enum class FocusDirection {
        Left, Right, Up, Down
    }

    /* compiled from: CommonActivity.kt */
    @Metadata(m106k = 3, m105mv = [1, 6, 0], m103xi = 48) /* loaded from: classes3.dex */
    /* synthetic */
    object WhenMappings {
        /* synthetic */ val `$EnumSwitchMapping$0`: IntArray

        init {
            val iArr = IntArray(FocusDirection.values().size)
            com.lagradost.cloudstream3.iArr.get(FocusDirection.Left.ordinal()) = 1
            com.lagradost.cloudstream3.iArr.get(FocusDirection.Up.ordinal()) = 2
            com.lagradost.cloudstream3.iArr.get(FocusDirection.Right.ordinal()) = 3
            com.lagradost.cloudstream3.iArr.get(FocusDirection.Down.ordinal()) = 4
            `$EnumSwitchMapping$0` = com.lagradost.cloudstream3.iArr
        }
    }

    fun getCastSession(activity: Activity?): CastSession? {
        var mSessionManager: SessionManager
        val mainActivity = activity as MainActivity?
        return if (mainActivity == null || mainActivity.getMSessionManager()
                .also { mSessionManager = it } == null
        ) {
            null
        } else mSessionManager.currentCastSession
    }

    var canEnterPipMode: Boolean
        get() = Companion.canEnterPipMode
        set(z) {
            Companion.canEnterPipMode = z
        }
    var canShowPipMode: Boolean
        get() = Companion.canShowPipMode
        set(z) {
            Companion.canShowPipMode = z
        }
    var isInPIPMode: Boolean
        get() = Companion.isInPIPMode
        set(z) {
            Companion.isInPIPMode = z
        }
    val onColorSelectedEvent: Event<Tuples<Any, Any>>
        get() = Companion.onColorSelectedEvent
    val onDialogDismissedEvent: Event<Any>
        get() = Companion.onDialogDismissedEvent
    var playerEventListener: ((Any) -> Unit)?
        get() = Companion.playerEventListener
        set(function1) {
            Companion.playerEventListener = function1
        }
    val keyEventListener: ((Tuples<out Any?, Boolean?>) -> Boolean)?
        get() = Companion.keyEventListener

    fun setKeyEventListener(function1: Function1<Tuples<out KeyEvent?, Boolean?>?, Boolean>?) {
        Companion.keyEventListener = function1
    }

    var currentToast: Toast?
        get() = Companion.currentToast
        set(toast) {
            Companion.currentToast = toast
        }

    fun showToast(activity: Activity?, i: Int, i2: Int) {
        if (activity == null) {
            return
        }
        showToast(activity, activity.getString(i), Integer.valueOf(i2))
    }

    fun showToast(activity: Activity?, str: String?, num: Integer?) {
        if (activity == null || str == null) {
            Log.w(TAG, "invalid showToast act = $activity message = $str")
            return
        }
        Log.i(TAG, "showToast = $str")
        try {
            val toast: Toast? = Companion.currentToast
            if (toast != null) {
                toast.cancel()
            }
        } catch (e: Exception) {
            ArchComponentExt.logError(e)
        }
        try {
            val systemService: Object = activity.getSystemService("layout_inflater")
                ?: throw NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater")
            val inflate: View = (systemService as LayoutInflater).inflate(
                R.layout.toast, activity.findViewById(
                    R.id.toast_layout_root
                ) as ViewGroup
            )
            Intrinsics.checkNotNullExpressionValue(
                inflate,
                "inflater.inflate(\n      … ViewGroup?\n            )"
            )
            val findViewById: View = inflate.findViewById(R.id.text)
                ?: throw NullPointerException("null cannot be cast to non-null type android.widget.TextView")
            (findViewById as TextView).setText(StringsKt.trim(str as CharSequence?).toString())
            val toast2 = Toast(activity)
            toast2.setGravity(81, 0, UIHelper.INSTANCE.getToPx(5))
            toast2.setDuration(if (num != null) num.intValue() else 0)
            toast2.setView(inflate)
            toast2.show()
            Companion.currentToast = toast2
        } catch (e2: Exception) {
            ArchComponentExt.logError(e2)
        }
    }

    fun setLocale(context: Context?, str: String?) {
        if (context == null || str == null) {
            return
        }
        val locale = Locale(str)
        val resources: Resources = context.getResources()
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources")
        val configuration: Configuration = resources.getConfiguration()
        Locale.setDefault(locale)
        configuration.setLocale(locale)
        if (Build.VERSION.SDK_INT >= 24) {
            context.createConfigurationContext(configuration)
        }
        resources.updateConfiguration(configuration, resources.getDisplayMetrics())
    }

    fun updateLocale(context: Context) {
        Intrinsics.checkNotNullParameter(context, "<this>")
        setLocale(
            context, PreferenceManager.getDefaultSharedPreferences(context).getString(
                context.getString(
                    R.string.locale_key
                ), null
            )
        )
    }

    fun init(activity: Activity?) {
        if (activity == null) {
            return
        }
        Companion.canShowPipMode = Build.VERSION.SDK_INT >= 24 && activity.getPackageManager()
            .hasSystemFeature("android.software.picture_in_picture") && UIHelper.INSTANCE.hasPIPPermission(
            activity
        )
        updateLocale(activity)
    }

    private fun enterPIPMode(activity: Activity) {
        if (UIHelper.INSTANCE.shouldShowPIPMode(
                activity,
                Companion.canEnterPipMode
            ) && Companion.canShowPipMode
        ) {
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    try {
                        activity.enterPictureInPictureMode(Builder().build())
                    } catch (unused: Exception) {
                        activity.enterPictureInPictureMode()
                    }
                } else if (Build.VERSION.SDK_INT >= 24) {
                    activity.enterPictureInPictureMode()
                }
            } catch (e: Exception) {
                ArchComponentExt.logError(e)
            }
        }
    }

    fun onUserLeaveHint(activity: Activity?) {
        if (Companion.canEnterPipMode && Companion.canShowPipMode && activity != null) {
            enterPIPMode(activity)
        }
    }

    fun loadThemes(activity: Activity?) {
        if (activity == null) {
            return
        }
        val defaultSharedPreferences: SharedPreferences =
            PreferenceManager.getDefaultSharedPreferences(activity)
        val string: String = defaultSharedPreferences.getString(
            activity.getString(R.string.app_theme_key),
            "AmoledLight"
        )
        var i = R.style.AppTheme
        if (string != null) {
            when (string.hashCode()) {
                64266207 -> string.equals("Black")
                73417974 -> if (string.equals("Light")) {
                    i = R.style.LightMode
                    break
                }
                1964972424 -> if (string.equals("Amoled")) {
                    i = R.style.AmoledMode
                    break
                }
                2078007406 -> if (string.equals("AmoledLight")) {
                    i = R.style.AmoledModeLight
                    break
                }
            }
        }
        val string2: String = defaultSharedPreferences.getString(
            activity.getString(R.string.primary_color_key),
            "Normal"
        )
        var i2 = R.style.OverlayPrimaryColorNormal
        if (string2 != null) {
            when (string2.hashCode()) {
                -2114143920 -> if (string2.equals("NavyBlue")) {
                    i2 = R.style.OverlayPrimaryColorNavyBlue
                    break
                }
                -1997434736 -> if (string2.equals("Maroon")) {
                    i2 = R.style.OverlayPrimaryColorMaroon
                    break
                }
                -1955878649 -> string2.equals("Normal")
                -1893076004 -> if (string2.equals("Purple")) {
                    i2 = R.style.OverlayPrimaryColorPurple
                    break
                }
                82033 -> if (string2.equals("Red")) {
                    i2 = R.style.OverlayPrimaryColorRed
                    break
                }
                2227967 -> if (string2.equals("Grey")) {
                    i2 = R.style.OverlayPrimaryColorGrey
                    break
                }
                2487702 -> if (string2.equals("Pink")) {
                    i2 = R.style.OverlayPrimaryColorPink
                    break
                }
                64459030 -> if (string2.equals("Brown")) {
                    i2 = R.style.OverlayPrimaryColorBrown
                    break
                }
                69066467 -> if (string2.equals("Green")) {
                    i2 = R.style.OverlayPrimaryColorGreen
                    break
                }
                76884678 -> if (string2.equals("Party")) {
                    i2 = R.style.OverlayPrimaryColorParty
                    break
                }
                83549193 -> if (string2.equals("White")) {
                    i2 = R.style.OverlayPrimaryColorWhite
                    break
                }
                129648909 -> if (string2.equals("DarkGreen")) {
                    i2 = R.style.OverlayPrimaryColorDarkGreen
                    break
                }
                1375944721 -> if (string2.equals("CarnationPink")) {
                    i2 = R.style.OverlayPrimaryColorCarnationPink
                    break
                }
                1627490871 -> if (string2.equals("GreenApple")) {
                    i2 = R.style.OverlayPrimaryColorGreenApple
                    break
                }
                1982479237 -> if (string2.equals("Banana")) {
                    i2 = R.style.OverlayPrimaryColorBanana
                    break
                }
            }
        }
        activity.getTheme().applyStyle(i, true)
        activity.getTheme().applyStyle(i2, true)
        activity.getTheme().applyStyle(R.style.LoadedStyle, true)
    }

    private fun getNextFocus(
        activity: Activity?,
        view: View?,
        focusDirection: FocusDirection,
        i: Int
    ): Integer? {
        val nextFocusLeftId: Int
        if (view == null || i >= 10 || activity == null) {
            return null
        }
        val i2 = WhenMappings.`$EnumSwitchMapping$0`[focusDirection.ordinal()]
        nextFocusLeftId = if (i2 == 1) {
            view.getNextFocusLeftId()
        } else if (i2 == 2) {
            view.getNextFocusUpId()
        } else if (i2 == 3) {
            view.getNextFocusRightId()
        } else if (i2 != 4) {
            throw NoWhenBranchMatchedException()
        } else {
            view.getNextFocusDownId()
        }
        if (nextFocusLeftId != -1) {
            val findViewById: View = activity.findViewById(nextFocusLeftId)
            var z = false
            if (findViewById != null && !findViewById.isShown()) {
                z = true
            }
            if (z) {
                return getNextFocus(activity, findViewById, focusDirection, i + 1)
            }
            return if (i == 0) {
                null
            } else Integer.valueOf(nextFocusLeftId)
        }
        return null
    }

    fun onKeyDown(activity: Activity?, i: Int, keyEvent: KeyEvent?) {
        val playerEventType: PlayerEventType?
        var function1: Function1<PlayerEventType?, Unit>
        playerEventType = when (i) {
            29, 89, bqk.f6533at -> PlayerEventType.SeekBack
            32, 90, 125, bqk.f6532as -> PlayerEventType.SeekForward
            33, 147 -> PlayerEventType.ShowSpeed
            36, 82 -> PlayerEventType.ToggleHide
            40, 151 -> PlayerEventType.Lock
            41, 164 -> PlayerEventType.ToggleMute
            43, 152 -> PlayerEventType.SearchSubtitlesOnline
            44, 62, 66, 85, 160 -> PlayerEventType.PlayPauseToggle
            46, 144 -> PlayerEventType.Resize
            47, 153 -> PlayerEventType.ShowMirrors
            87, 103 -> PlayerEventType.NextEpisode
            88, 102 -> PlayerEventType.PrevEpisode
            108, 126 -> PlayerEventType.Play
            127 -> PlayerEventType.Pause
            else -> null
        }
        if (playerEventType == null || Companion.playerEventListener.also {
                function1 = it
            } == null) {
            return
        }
        function1.invoke(playerEventType)
    }

    fun dispatchKeyEvent(activity: Activity?, keyEvent: KeyEvent?): Boolean? {
        val `nextFocus$default`: Integer?
        var findViewById: View
        if (activity == null) {
            return null
        }
        if (keyEvent != null) {
            val keyCode: Int = keyEvent.getKeyCode()
            if (keyEvent.getAction() === 0 && activity.getCurrentFocus() != null) {
                `nextFocus$default` = when (keyCode) {
                    19 -> `getNextFocus$default`(
                        INSTANCE,
                        activity,
                        activity.getCurrentFocus(),
                        FocusDirection.Up,
                        0,
                        8,
                        null
                    )
                    20 -> `getNextFocus$default`(
                        INSTANCE,
                        activity,
                        activity.getCurrentFocus(),
                        FocusDirection.Down,
                        0,
                        8,
                        null
                    )
                    21 -> `getNextFocus$default`(
                        INSTANCE,
                        activity,
                        activity.getCurrentFocus(),
                        FocusDirection.Left,
                        0,
                        8,
                        null
                    )
                    22 -> `getNextFocus$default`(
                        INSTANCE,
                        activity,
                        activity.getCurrentFocus(),
                        FocusDirection.Right,
                        0,
                        8,
                        null
                    )
                    else -> null
                }
                if (`nextFocus$default` != null && `nextFocus$default`.intValue() !== -1 && activity.findViewById(
                        `nextFocus$default`.intValue()
                    ).also { findViewById = it } != null
                ) {
                    findViewById.requestFocus()
                    val function1: Function1<Tuples<out KeyEvent?, Boolean?>?, Boolean>? =
                        Companion.keyEventListener
                    function1?.invoke?.invoke()
                    return true
                } else if (keyCode == 23 && (activity.getCurrentFocus() is SearchView || activity.getCurrentFocus() is SearchAutoComplete)) {
                    val uIHelper: UIHelper = UIHelper.INSTANCE
                    val currentFocus: View = activity.getCurrentFocus()
                    uIHelper.showInputMethod(if (currentFocus != null) currentFocus.findFocus() else null)
                }
            }
        }
        val function12: Function1<Tuples<out KeyEvent?, Boolean?>?, Boolean>? =
            Companion.keyEventListener
        var z = false
        if (function12 != null && function12.invoke(Tuples<Any?, Any?>(keyEvent, false))
                .booleanValue()
        ) {
            z = true
        }
        return if (z) true else null
    }

    companion object {
        const val TAG = "COMPACT"
        private var canEnterPipMode = false
        private var canShowPipMode = false
        private var currentToast: Toast? = null
        private var isInPIPMode = false
        private var keyEventListener: Function1<Tuples<out KeyEvent?, Boolean?>?, Boolean>? = null
        private var playerEventListener: Function1<PlayerEventType, Unit>? = null
        @kotlin.jvm.JvmField
        val INSTANCE = CommonActivity()
        private val onColorSelectedEvent: Event<Tuples<Integer, Integer>> =
            Event<Tuples<Integer, Integer>>()
        private val onDialogDismissedEvent: Event<Integer> = Event<Integer>()
        @kotlin.jvm.JvmStatic
        fun  /* synthetic */`showToast$default`(
            commonActivity: CommonActivity,
            activity: Activity?,
            str: String?,
            num: Integer?,
            i: Int,
            obj: Object?
        ) {
            var num: Integer? = num
            if (i and 4 != 0) {
                num = null
            }
            commonActivity.showToast(activity, str, num)
        }

        fun  /* synthetic */`getNextFocus$default`(
            commonActivity: CommonActivity,
            activity: Activity?,
            view: View?,
            focusDirection: FocusDirection,
            i: Int,
            i2: Int,
            obj: Object?
        ): Integer? {
            var i = i
            if (i2 and 8 != 0) {
                i = 0
            }
            return commonActivity.getNextFocus(activity, view, focusDirection, i)
        }
    }
}