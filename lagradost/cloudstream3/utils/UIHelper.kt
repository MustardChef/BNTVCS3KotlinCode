package com.lagradost.cloudstream3.utils

import android.app.Activity
import androidx.core.app.NotificationCompat
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import com.bumptech.glide.load.Transformation
import com.bumptech.glide.load.model.Headers
import com.google.common.net.HttpHeaders
import kotlin.jvm.internal.Intrinsics

/* compiled from: UIHelper.kt */
@Metadata(
    m108d1 = ["\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000c\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000b\u001a\u00020\u00072\b\b\u0001\u0010\u000c\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0004J\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0010\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u000c\u0010\u0016\u001a\u00020\u0017*\u0004\u0018\u00010\u0018J\u0012\u0010\u0019\u001a\u00020\u0007*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0017J\n\u0010\u001c\u001a\u00020\u0017*\u00020\u001aJ\u0012\u0010\u001d\u001a\u00020\u0007*\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0007J\u000c\u0010\u001f\u001a\u00020\u000f*\u0004\u0018\u00010 J\u0016\u0010\u001f\u001a\u00020\u000f*\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\u001aJ\u0016\u0010\"\u001a\u00020\u000f*\u0004\u0018\u00010\u00182\b\u0010#\u001a\u0004\u0018\u00010\u0011J\u0012\u0010$\u001a\u00020\u000f*\u00020\u00182\u0006\u0010#\u001a\u00020\u0011J\n\u0010%\u001a\u00020\u0007*\u00020\u0018J \u0010&\u001a\u00020\u0007*\u00020\u00182\b\b\u0001\u0010'\u001a\u00020\u00072\b\b\u0002\u0010(\u001a\u00020\u0004H\u0007J\u0013\u0010)\u001a\u0004\u0018\u00010\u0007*\u0004\u0018\u00010\u001a¢\u0006\u0002\u0010*J\n\u0010+\u001a\u00020\u0007*\u00020\u0018J\n\u0010,\u001a\u00020\u0017*\u00020\u0018J\n\u0010\u000e\u001a\u00020\u000f*\u00020\u001aJ\n\u0010\u000e\u001a\u00020\u000f*\u00020-J\n\u0010.\u001a\u00020\u000f*\u00020\u001aJ\"\u0010/\u001a\u00020\u000f*\u0004\u0018\u00010\u001a2\b\b\u0001\u00100\u001a\u00020\u00072\n\b\u0002\u00101\u001a\u0004\u0018\u000102J\n\u00103\u001a\u00020\u000f*\u000204J?\u00105\u001a\u000206*\u00020\u00112\u0018\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000709082\u0017\u0010:\u001a\u0013\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u000f0;¢\u0006\u0002\b=H\u0007J?\u0010>\u001a\u000206*\u00020\u00112\u0018\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020?09082\u0017\u0010:\u001a\u0013\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u000f0;¢\u0006\u0002\b=H\u0007J\n\u0010@\u001a\u00020\u000f*\u00020\u001aJ?\u0010A\u001a\u00020\u0017*\u0004\u0018\u00010B2\b\u0010C\u001a\u0004\u0018\u00010?2\u0016\b\u0002\u0010D\u001a\u0010\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020?\u0018\u00010E2\n\b\u0003\u0010F\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010GJ'\u0010H\u001a\u00020\u000f*\u0004\u0018\u00010B2\b\u0010C\u001a\u0004\u0018\u00010?2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010JJ@\u0010K\u001a\u00020\u000f*\u0004\u0018\u00010B2\b\u0010C\u001a\u0004\u0018\u00010?2\u0006\u0010L\u001a\u00020\u00072\b\b\u0002\u0010M\u001a\u00020\u00072\u0016\b\u0002\u0010D\u001a\u0010\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020?\u0018\u00010EJ\u0012\u0010N\u001a\u00020\u0017*\u00020\u00182\u0006\u0010O\u001a\u00020\u0017J\n\u0010P\u001a\u00020\u000f*\u00020\u001aR\u0015\u0010\u0003\u001a\u00020\u0004*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0015\u0010\u0003\u001a\u00020\u0007*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\bR\u0015\u0010\t\u001a\u00020\u0004*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0015\u0010\t\u001a\u00020\u0007*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006Q"],
    m107d2 = ["Lcom/lagradost/cloudstream3/utils/UIHelper;", "", "()V", "toDp", "", "getToDp", "(F)F", "", "(I)I", "toPx", "getToPx", "adjustAlpha", "color", "factor", "hideKeyboard", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "setListViewHeightBasedOnItems", "listView", "Landroid/widget/ListView;", "showInputMethod", "IsBottomLayout", "", "Landroid/content/Context;", "changeStatusBarState", "Landroid/app/Activity;", MessengerShareContentUtility.SHARE_BUTTON_HIDE, "checkWrite", "colorFromAttribute", "attribute", "dismissSafe", "Landroid/app/Dialog;", "activity", "fixPaddingStatusbar", "v", "fixPaddingStatusbarView", "getNavigationBarHeight", "getResourceColor", "resource", "alphaFactor", "getSpanCount", "(Landroid/app/Activity;)Ljava/lang/Integer;", "getStatusBarHeight", "hasPIPPermission", "Landroidx/fragment/app/Fragment;", "hideSystemUI", "navigate", NotificationCompat.CATEGORY_NAVIGATION, "arguments", "Landroid/os/Bundle;", "popCurrentPage", "Landroidx/fragment/app/FragmentActivity;", "popupMenuNoIcons", "Landroidx/appcompat/widget/PopupMenu;", FirebaseAnalytics.Param.ITEMS, "", "Lkotlin/Pair;", "onMenuItemClick", "Lkotlin/Function1;", "Landroid/view/MenuItem;", "Lkotlin/ExtensionFunctionType;", "popupMenuNoIconsAndNoStringRes", "", "requestRW", "setImage", "Landroid/widget/ImageView;", "url", "headers", "", "errorImageDrawable", "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Integer;)Z", "setImage1", "isUsingTransition", "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/Boolean;)V", "setImageBlur", "radius", "sample", "shouldShowPIPMode", "isInPlayer", "showSystemUI", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class UIHelper private constructor() {
    fun getToPx(i: Int): Int {
        return (i * Resources.getSystem().getDisplayMetrics().density) as Int
    }

    fun getToPx(f: Float): Float {
        return f * Resources.getSystem().getDisplayMetrics().density
    }

    fun getToDp(i: Int): Int {
        return (i / Resources.getSystem().getDisplayMetrics().density) as Int
    }

    fun getToDp(f: Float): Float {
        return f / Resources.getSystem().getDisplayMetrics().density
    }

    fun checkWrite(activity: Activity?): Boolean {
        Intrinsics.checkNotNullParameter(activity, "<this>")
        return ContextCompat.checkSelfPermission(
            activity,
            "android.permission.WRITE_EXTERNAL_STORAGE"
        ) == 0
    }

    fun requestRW(activity: Activity?) {
        Intrinsics.checkNotNullParameter(activity, "<this>")
        ActivityCompat.requestPermissions(
            activity,
            arrayOf(
                "android.permission.WRITE_EXTERNAL_STORAGE",
                "android.permission.READ_EXTERNAL_STORAGE"
            ),
            1337
        )
    }

    fun setListViewHeightBasedOnItems(listView: ListView?) {
        val adapter: ListAdapter = (if (listView != null) listView.getAdapter() else null) ?: return
        val count: Int = adapter.getCount()
        var i = 0
        for (i2 in 0 until count) {
            val view: View = adapter.getView(i2, null, listView)
            Intrinsics.checkNotNullExpressionValue(
                view,
                "listAdapter.getView(itemPos, null, listView)"
            )
            view.measure(0, 0)
            i += view.getMeasuredHeight()
        }
        val layoutParams: ViewGroup.LayoutParams = listView.getLayoutParams()
        Intrinsics.checkNotNullExpressionValue(layoutParams, "listView.layoutParams")
        layoutParams.height = i + listView.getDividerHeight() * (count - 1)
        listView.setLayoutParams(layoutParams)
        listView.requestLayout()
    }

    fun getSpanCount(activity: Activity?): Integer? {
        var resources: Resources
        var configuration: Configuration
        if (activity == null || activity.getResources()
                .also { resources = it } == null || resources.getConfiguration()
                .also { configuration = it } == null
        ) {
            return null
        }
        return if (configuration.orientation === 2) {
            6
        } else 3
    }

    fun hideKeyboard(fragment: Fragment) {
        var window: Window
        var decorView: View
        Intrinsics.checkNotNullParameter(fragment, "<this>")
        val activity: FragmentActivity? = fragment.activity
        if (activity != null && activity.getWindow()
                .also { window = it } != null && window.getDecorView()
                .also { decorView = it } != null
        ) {
            decorView.clearFocus()
        }
        val view: View? = fragment.view
        if (view != null) {
            INSTANCE.hideKeyboard(view)
        }
    }

    fun hideKeyboard(activity: Activity) {
        var rootView: View?
        var decorView: View
        Intrinsics.checkNotNullParameter(activity, "<this>")
        val window: Window = activity.getWindow()
        if (window != null && window.getDecorView().also { decorView = it } != null) {
            decorView.clearFocus()
        }
        val findViewById: View = activity.findViewById(16908290)
        if (findViewById == null || findViewById.getRootView().also { rootView = it } == null) {
            return
        }
        INSTANCE.hideKeyboard(rootView)
    }

    fun navigate(activity: Activity, i: Int, bundle: Bundle?) {
        var navController: NavController
        if (activity is FragmentActivity) {
            val findFragmentById: Fragment =
                (activity as FragmentActivity).getSupportFragmentManager()
                    .findFragmentById(R.id.nav_host_fragment)
            val navHostFragment: NavHostFragment? =
                if (findFragmentById is NavHostFragment) findFragmentById as NavHostFragment else null
            if (navHostFragment == null || navHostFragment.getNavController()
                    .also { navController = it } == null
            ) {
                return
            }
            navController.navigate(i, bundle)
        }
    }

    fun getResourceColor(context: Context, i: Int, f: Float): Int {
        Intrinsics.checkNotNullParameter(context, "<this>")
        val obtainStyledAttributes: TypedArray = context.obtainStyledAttributes(intArrayOf(i))
        Intrinsics.checkNotNullExpressionValue(
            obtainStyledAttributes,
            "obtainStyledAttributes(intArrayOf(resource))"
        )
        val color: Int = obtainStyledAttributes.getColor(0, 0)
        obtainStyledAttributes.recycle()
        return if (f < 1.0f) Color.argb(
            MathKt.roundToInt((color shr 24 and 255) * f),
            color shr 16 and 255,
            color shr 8 and 255,
            color and 255
        ) else color
    }

    fun setImage1(imageView: ImageView?, str: String?, bool: Boolean?) {
        if (imageView != null) {
            if (str == null || StringsKt.isBlank(str)) {
                return
            }
            try {
                val glideUrl = GlideUrl(
                    str,
                    LazyHeaders.Builder().addHeader(HttpHeaders.REFERER, "https://phimchill.tv/")
                        .build()
                )
                val build: DrawableCrossFadeFactory =
                    DrawableCrossFadeFactory.Builder().setCrossFadeEnabled(true).build()
                if (Intrinsics.areEqual(bool as Object?, true as Object)) {
                    with(imageView.getContext()).asBitmap().load(glideUrl as Object)
                        .transition(BitmapTransitionOptions.withCrossFade(build) as TransitionOptions<*, in Bitmap?>)
                        .diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView)
                } else {
                    with(imageView.getContext()).load(glideUrl as Object)
                        .diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView)
                }
            } catch (e: Exception) {
                ArchComponentExt.logError(e)
            }
        }
    }

    fun setImage(
        imageView: ImageView?,
        str: String?,
        map: Map<String?, String?>?,
        num: Integer?
    ): Boolean {
        return if (imageView != null) {
            if (str == null || StringsKt.isBlank(str)) {
                false
            } else try {
                val transition: GlideRequest<Drawable?> =
                    with(imageView.getContext()).load(GlideUrl(str, // com.bumptech.glide.load.model.Headers
                        // from class: com.lagradost.cloudstream3.utils.-$$Lambda$UIHelper$Kw1Orhcme-BpGHEVuoh434kh708
                        Headers {
                            val `m9021setImage$lambda2`: Map
                            `m9021setImage$lambda2` = `m9021setImage$lambda2`(map)
                            `m9021setImage$lambda2`
                        }) as Object?
                    )
                        .transition(DrawableTransitionOptions.withCrossFade() as TransitionOptions<*, in Drawable?>)
                Intrinsics.checkNotNullExpressionValue(
                    transition,
                    "with(this.context)\n     …sFade()\n                )"
                )
                if (num != null) {
                    transition.error(num.intValue()).into(imageView)
                } else {
                    transition.into(imageView)
                }
                true
            } catch (e: Exception) {
                ArchComponentExt.logError(e)
                false
            }
        } else false
    }

    fun setImageBlur(
        imageView: ImageView?,
        str: String?,
        i: Int,
        i2: Int,
        map: Map<String?, String?>?
    ) {
        if (imageView != null) {
            if (str == null || StringsKt.isBlank(str)) {
                return
            }
            try {
                with(imageView.getContext()).load(GlideUrl(str, // com.bumptech.glide.load.model.Headers
                    // from class: com.lagradost.cloudstream3.utils.-$$Lambda$UIHelper$OlkUFkVmDse_BPgyEnOjLGFlbKM
                    Headers {
                        val `m9022setImageBlur$lambda3`: Map
                        `m9022setImageBlur$lambda3` = `m9022setImageBlur$lambda3`(map)
                        `m9022setImageBlur$lambda3`
                    }) as Object?
                ).apply(
                    GlideOptions.Companion.bitmapTransform(
                        BlurTransformation(
                            i,
                            i2
                        ) as Transformation<Bitmap?>?
                    ) as BaseRequestOptions<*>
                )
                    .transition(DrawableTransitionOptions.withCrossFade() as TransitionOptions<*, in Drawable?>)
                    .into(imageView)
            } catch (e: Exception) {
                ArchComponentExt.logError(e)
            }
        }
    }

    fun adjustAlpha(i: Int, f: Float): Int {
        return Color.argb(
            MathKt.roundToInt(Color.alpha(i) * f),
            Color.red(i),
            Color.green(i),
            Color.blue(i)
        )
    }

    fun colorFromAttribute(context: Context, i: Int): Int {
        Intrinsics.checkNotNullParameter(context, "<this>")
        val obtainStyledAttributes: TypedArray = context.obtainStyledAttributes(intArrayOf(i))
        Intrinsics.checkNotNullExpressionValue(
            obtainStyledAttributes,
            "obtainStyledAttributes(intArrayOf(attribute))"
        )
        val color: Int = obtainStyledAttributes.getColor(0, 0)
        obtainStyledAttributes.recycle()
        return color
    }

    fun hideSystemUI(activity: Activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>")
        activity.getWindow().getDecorView().setSystemUiVisibility(5894)
    }

    fun popCurrentPage(fragmentActivity: FragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>")
        fragmentActivity.onBackPressed()
    }

    fun getStatusBarHeight(context: Context): Int {
        var identifier: Int
        Intrinsics.checkNotNullParameter(context, "<this>")
        return if (!SettingsFragment.Companion.isTvSettings(context) && context.getResources()
                .getIdentifier("status_bar_height", "dimen", "android").also { identifier = it } > 0
        ) {
            context.getResources().getDimensionPixelSize(identifier)
        } else 0
    }

    fun fixPaddingStatusbar(context: Context?, view: View?) {
        if (view == null || context == null) {
            return
        }
        view.setPadding(
            view.getPaddingLeft(),
            view.getPaddingTop() + getStatusBarHeight(context),
            view.getPaddingRight(),
            view.getPaddingBottom()
        )
    }

    fun fixPaddingStatusbarView(context: Context, v: View) {
        Intrinsics.checkNotNullParameter(context, "<this>")
        Intrinsics.checkNotNullParameter(v, "v")
        val layoutParams: ViewGroup.LayoutParams = v.getLayoutParams()
        layoutParams.height = getStatusBarHeight(context)
        v.setLayoutParams(layoutParams)
    }

    fun getNavigationBarHeight(context: Context): Int {
        Intrinsics.checkNotNullParameter(context, "<this>")
        val identifier: Int =
            context.getResources().getIdentifier("navigation_bar_height", "dimen", "android")
        return if (identifier > 0) {
            context.getResources().getDimensionPixelSize(identifier)
        } else 0
    }

    fun IsBottomLayout(context: Context?): Boolean {
        return if (context == null) {
            true
        } else PreferenceManager.getDefaultSharedPreferences(context)
            .getBoolean(context.getString(R.string.bottom_title_key), true)
    }

    fun changeStatusBarState(activity: Activity, z: Boolean): Int {
        Intrinsics.checkNotNullParameter(activity, "<this>")
        if (z) {
            val window: Window = activity.getWindow()
            if (window != null) {
                window.setFlags(1024, 1024)
            }
            return 0
        }
        activity.getWindow().clearFlags(1024)
        return getStatusBarHeight(activity)
    }

    fun showSystemUI(activity: Activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>")
        activity.getWindow().getDecorView().setSystemUiVisibility(1280)
        changeStatusBarState(activity, SettingsFragment.Companion.isEmulatorSettings(activity))
    }

    fun shouldShowPIPMode(context: Context, z: Boolean): Boolean {
        Intrinsics.checkNotNullParameter(context, "<this>")
        return try {
            val defaultSharedPreferences: SharedPreferences =
                PreferenceManager.getDefaultSharedPreferences(context)
            (if (defaultSharedPreferences != null) defaultSharedPreferences.getBoolean(
                context.getString(
                    R.string.pip_enabled_key
                ), true
            ) else true) && z
        } catch (e: Exception) {
            ArchComponentExt.logError(e)
            false
        }
    }

    fun hasPIPPermission(context: Context): Boolean {
        Intrinsics.checkNotNullParameter(context, "<this>")
        val systemService: Object = context.getSystemService("appops")
        Objects.requireNonNull(
            systemService,
            "null cannot be cast to non-null type android.app.AppOpsManager"
        )
        return Build.VERSION.SDK_INT < 26 || (systemService as AppOpsManager).checkOpNoThrow(
            "android:picture_in_picture",
            Process.myUid(),
            context.getPackageName()
        ) === 0
    }

    fun hideKeyboard(view: View?) {
        var inputMethodManager: InputMethodManager
        if (view == null || view.getContext()
                .getSystemService("input_method") as InputMethodManager?. also {
                inputMethodManager = it
            } == null
        ) {
            return
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0)
    }

    fun showInputMethod(view: View?) {
        var inputMethodManager: InputMethodManager
        if (view == null || view.getContext()
                .getSystemService("input_method") as InputMethodManager?. also {
                inputMethodManager = it
            } == null
        ) {
            return
        }
        inputMethodManager.showSoftInput(view, 0)
    }

    fun dismissSafe(dialog: Dialog?, activity: Activity?) {
        val z = true
        if (dialog != null && dialog.isShowing()) {
            if (if (activity == null || activity.isFinishing()) false else false) {
                dialog.dismiss()
            }
        }
    }

    fun dismissSafe(dialog: Dialog?) {
        val z = true
        if (if (dialog == null || !dialog.isShowing()) false else false) {
            dialog.dismiss()
        }
    }

    fun popupMenuNoIcons(
        view: View,
        items: List<Tuples<Integer?, Integer?>>,
        onMenuItemClick: Function1<MenuItem?, Unit>?
    ): PopupMenu {
        Intrinsics.checkNotNullParameter(view, "<this>")
        Intrinsics.checkNotNullParameter(items, "items")
        Intrinsics.checkNotNullParameter(onMenuItemClick, "onMenuItemClick")
        val popupMenu = PopupMenu(
            ContextThemeWrapper(view.getContext(), R.style.PopupMenu as Int),
            view,
            0,
            R.attr.actionOverflowMenuStyle,
            0
        )
        val it: Iterator<T> = items.iterator()
        while (it.hasNext()) {
            val tuples = it.next() as Tuples<*, *>
            popupMenu.getMenu().add(
                0,
                (tuples.component1() as Number).intValue(),
                0,
                (tuples.component2() as Number).intValue()
            )
        }
        val menu: Menu = popupMenu.getMenu()
        val menuBuilder: MenuBuilder? = if (menu is MenuBuilder) menu as MenuBuilder else null
        if (menuBuilder != null) {
            menuBuilder.setOptionalIconsVisible(true)
        }
        popupMenu.setOnMenuItemClickListener(object : PopupMenu.OnMenuItemClickListener {
            // from class: com.lagradost.cloudstream3.utils.-$$Lambda$UIHelper$JEIN4LEvArmruQt8YTSl_7hLf8A
            @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
            override fun onMenuItemClick(menuItem: MenuItem): Boolean {
                val `m9019popupMenuNoIcons$lambda5`: Boolean
                `m9019popupMenuNoIcons$lambda5` =
                    `m9019popupMenuNoIcons$lambda5`(this@Function1, menuItem)
                return `m9019popupMenuNoIcons$lambda5`
            }
        })
        popupMenu.show()
        return popupMenu
    }

    fun popupMenuNoIconsAndNoStringRes(
        view: View,
        items: List<Tuples<Integer?, String?>>,
        onMenuItemClick: Function1<MenuItem?, Unit>?
    ): PopupMenu {
        Intrinsics.checkNotNullParameter(view, "<this>")
        Intrinsics.checkNotNullParameter(items, "items")
        Intrinsics.checkNotNullParameter(onMenuItemClick, "onMenuItemClick")
        val popupMenu = PopupMenu(
            ContextThemeWrapper(view.getContext(), R.style.PopupMenu as Int),
            view,
            0,
            R.attr.actionOverflowMenuStyle,
            0
        )
        val it: Iterator<T> = items.iterator()
        while (it.hasNext()) {
            val tuples = it.next() as Tuples<*, *>
            popupMenu.getMenu().add(
                0,
                (tuples.component1() as Number).intValue(),
                0,
                tuples.component2() as String
            )
        }
        val menu: Menu = popupMenu.getMenu()
        val menuBuilder: MenuBuilder? = if (menu is MenuBuilder) menu as MenuBuilder else null
        if (menuBuilder != null) {
            menuBuilder.setOptionalIconsVisible(true)
        }
        popupMenu.setOnMenuItemClickListener(object : PopupMenu.OnMenuItemClickListener {
            // from class: com.lagradost.cloudstream3.utils.-$$Lambda$UIHelper$9wTzmhaWbligerBLGrAJVtpJRxE
            @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
            override fun onMenuItemClick(menuItem: MenuItem): Boolean {
                val `m9020popupMenuNoIconsAndNoStringRes$lambda7`: Boolean
                `m9020popupMenuNoIconsAndNoStringRes$lambda7` =
                    `m9020popupMenuNoIconsAndNoStringRes$lambda7`(this@Function1, menuItem)
                return `m9020popupMenuNoIconsAndNoStringRes$lambda7`
            }
        })
        popupMenu.show()
        return popupMenu
    }

    companion object {
        @kotlin.jvm.JvmField
        val INSTANCE = UIHelper()
        fun  /* synthetic */`navigate$default`(
            uIHelper: UIHelper,
            activity: Activity,
            i: Int,
            bundle: Bundle?,
            i2: Int,
            obj: Object?
        ) {
            var bundle: Bundle? = bundle
            if (i2 and 2 != 0) {
                bundle = null
            }
            uIHelper.navigate(activity, i, bundle)
        }

        fun  /* synthetic */`getResourceColor$default`(
            uIHelper: UIHelper,
            context: Context,
            i: Int,
            f: Float,
            i2: Int,
            obj: Object?
        ): Int {
            var f = f
            if (i2 and 2 != 0) {
                f = 1.0f
            }
            return uIHelper.getResourceColor(context, i, f)
        }

        fun  /* synthetic */`setImage1$default`(
            uIHelper: UIHelper,
            imageView: ImageView?,
            str: String?,
            bool: Boolean?,
            i: Int,
            obj: Object?
        ) {
            var bool = bool
            if (i and 2 != 0) {
                bool = false
            }
            uIHelper.setImage1(imageView, str, bool)
        }

        /* JADX WARN: Multi-variable type inference failed */
        @kotlin.jvm.JvmStatic
        fun  /* synthetic */`setImage$default`(
            uIHelper: UIHelper,
            imageView: ImageView?,
            str: String?,
            map: Map?,
            num: Integer?,
            i: Int,
            obj: Object?
        ): Boolean {
            var map: Map? = map
            var num: Integer? = num
            if (i and 2 != 0) {
                map = null
            }
            if (i and 4 != 0) {
                num = null
            }
            return uIHelper.setImage(imageView, str, map, num)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: setImage$lambda-2  reason: not valid java name */
        fun `m9021setImage$lambda2`(map: Map?): Map {
            return if (map == null) MapsKt.emptyMap<Any, Any>() else map
        }

        /* JADX WARN: Multi-variable type inference failed */
        @kotlin.jvm.JvmStatic
        fun  /* synthetic */`setImageBlur$default`(
            uIHelper: UIHelper,
            imageView: ImageView?,
            str: String?,
            i: Int,
            i2: Int,
            map: Map?,
            i3: Int,
            obj: Object?
        ) {
            val i4 = if (i3 and 4 != 0) 3 else i2
            var map2: Map<String?, String?>? = map
            if (i3 and 8 != 0) {
                map2 = null
            }
            uIHelper.setImageBlur(imageView, str, i, i4, map2)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: setImageBlur$lambda-3  reason: not valid java name */
        fun `m9022setImageBlur$lambda3`(map: Map?): Map {
            return if (map == null) MapsKt.emptyMap<Any, Any>() else map
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: popupMenuNoIcons$lambda-5  reason: not valid java name */
        fun `m9019popupMenuNoIcons$lambda5`(
            onMenuItemClick: Function1<*, *>,
            it: MenuItem?
        ): Boolean {
            Intrinsics.checkNotNullParameter(onMenuItemClick, "\$onMenuItemClick")
            Intrinsics.checkNotNullExpressionValue(it, "it")
            onMenuItemClick.invoke(it)
            return true
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: popupMenuNoIconsAndNoStringRes$lambda-7  reason: not valid java name */
        fun `m9020popupMenuNoIconsAndNoStringRes$lambda7`(
            onMenuItemClick: Function1<*, *>,
            it: MenuItem?
        ): Boolean {
            Intrinsics.checkNotNullParameter(onMenuItemClick, "\$onMenuItemClick")
            Intrinsics.checkNotNullExpressionValue(it, "it")
            onMenuItemClick.invoke(it)
            return true
        }
    }
}