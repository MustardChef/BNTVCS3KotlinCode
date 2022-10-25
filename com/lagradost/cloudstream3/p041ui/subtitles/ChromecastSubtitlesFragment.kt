package com.lagradost.cloudstream3.p041ui.subtitles

import android.app.Activity
import androidx.fragment.app.Fragment
import com.lagradost.cloudstream3.utils.Event
import kotlin.jvm.functions.Functions
import kotlin.jvm.internal.Intrinsics

/* compiled from: ChromecastSubtitlesFragment.kt */
@Metadata(
    m108d1 = ["\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u001c\u0010\n\u001a\u00020\u000b2\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\rH\u0002J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u000bH\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u001a\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J#\u0010\u001a\u001a\u00020\u000b*\u00020\u001b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0002\u0010\u001dJ\u000c\u0010\u001e\u001a\u00020\u000b*\u00020\u001bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000¨\u0006 "],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/subtitles/ChromecastSubtitlesFragment;", "Landroidx/fragment/app/Fragment;", "()V", MessengerShareContentUtility.SHARE_BUTTON_HIDE, "", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/lagradost/cloudstream3/ui/subtitles/SaveChromeCaptionStyle;", "getColor", "", "id", "onColorSelected", "", "stuff", "Lkotlin/Pair;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onDialogDismissed", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "setColor", "Landroid/content/Context;", "color", "(Landroid/content/Context;ILjava/lang/Integer;)V", "updateState", "Companion", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.subtitles.ChromecastSubtitlesFragment */ /* loaded from: classes4.dex */
class ChromecastSubtitlesFragment constructor() : Fragment() {
    var `_$_findViewCache`: Map<Integer, View> = LinkedHashMap()
    var hide: Boolean = true
    var state: SaveChromeCaptionStyle? = null

    /* JADX INFO: Access modifiers changed from: private */
    fun updateState(context: Context?) {}
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

    /* compiled from: ChromecastSubtitlesFragment.kt */
    @Metadata(
        m108d1 = ["\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002J\u0018\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u001a\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016J\u0012\u0010\u0017\u001a\u00020\u0012*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0005R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/subtitles/ChromecastSubtitlesFragment\$Companion;", "", "()V", "applyStyleEvent", "Lcom/lagradost/cloudstream3/utils/Event;", "Lcom/lagradost/cloudstream3/ui/subtitles/SaveChromeCaptionStyle;", "getApplyStyleEvent", "()Lcom/lagradost/cloudstream3/utils/Event;", "defaultState", "getCurrentSavedStyle", "getDefColor", "", "id", "getPixels", "unit", "size", "", "push", "", "activity", "Landroid/app/Activity;", MessengerShareContentUtility.SHARE_BUTTON_HIDE, "", "saveStyle", "Landroid/content/Context;", "style", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.subtitles.ChromecastSubtitlesFragment$Companion */ /* loaded from: classes4.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        /* JADX INFO: Access modifiers changed from: private */
        fun getDefColor(i: Int): Int {
            if (i != 0) {
                return if (i != 1) if (i != 2) 0 else 0 else ViewCompat.MEASURED_STATE_MASK
            }
            return -1
        }

        val applyStyleEvent: Event<SaveChromeCaptionStyle>
            get() {
                return ChromecastSubtitlesFragment.Companion.applyStyleEvent
            }

        fun push(activity: Activity?, z: Boolean) {
            val uIHelper: UIHelper = UIHelper.INSTANCE
            val bundle: Bundle = Bundle()
            bundle.putBoolean(MessengerShareContentUtility.SHARE_BUTTON_HIDE, z)
            val unit: Unit = Unit.INSTANCE
            uIHelper.navigate(activity, R.id.global_to_navigation_chrome_subtitles, bundle)
        }

        fun saveStyle(context: Context?, style: SaveChromeCaptionStyle?) {
            Intrinsics.checkNotNullParameter(context, "<this>")
            Intrinsics.checkNotNullParameter(style, "style")
            DataStore.INSTANCE.setKey(
                context,
                ChromecastSubtitlesFragmentKt.CHROME_SUBTITLE_KEY,
                style
            )
        }

        /* JADX INFO: Access modifiers changed from: private */
        fun getPixels(i: Int, f: Float): Int {
            val displayMetrics: DisplayMetrics = Resources.getSystem().getDisplayMetrics()
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "getSystem().displayMetrics")
            return TypedValue.applyDimension(i, f, displayMetrics)
        }

        val currentSavedStyle: SaveChromeCaptionStyle
            get() {
                val context: Context? = AcraApplication.Companion.context
                var obj: Object? = null
                if (context != null) {
                    val dataStore: DataStore = DataStore.INSTANCE
                    try {
                        val string: String? = dataStore.getSharedPrefs(context)
                            .getString(ChromecastSubtitlesFragmentKt.CHROME_SUBTITLE_KEY, null)
                        if (string != null) {
                            Intrinsics.checkNotNullExpressionValue(
                                string,
                                "getSharedPrefs().getStri…h, null) ?: return defVal"
                            )
                            val readValue: Object = dataStore.mapper.readValue(
                                string,
                                SaveChromeCaptionStyle::class.java
                            )
                            Intrinsics.checkNotNullExpressionValue(
                                readValue,
                                "mapper.readValue(this, T::class.java)"
                            )
                            obj = readValue
                        }
                    } catch (unused: Exception) {
                    }
                }
                val saveChromeCaptionStyle: SaveChromeCaptionStyle? = obj
                return if (saveChromeCaptionStyle == null) ChromecastSubtitlesFragment.Companion.defaultState else saveChromeCaptionStyle
            }

        companion object {
            fun  /* synthetic */`push$default`(
                companion: ChromecastSubtitlesFragment.Companion,
                activity: Activity?,
                z: Boolean,
                i: Int,
                obj: Object?
            ) {
                var z: Boolean = z
                if ((i and 2) != 0) {
                    z = true
                }
                companion.push(activity, z)
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun onColorSelected(tuples: Tuples<Integer?, Integer?>) {
        var activity: FragmentActivity?
        val context: Context? = getContext()
        if (context != null) {
            setColor(context, tuples.getFirst().intValue(), tuples.getSecond())
        }
        if (!hide || (getActivity().also({ activity = it })) == null) {
            return
        }
        UIHelper.INSTANCE.hideSystemUI(activity)
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun onDialogDismissed(i: Int) {
        var activity: FragmentActivity?
        if (!hide || (getActivity().also({ activity = it })) == null) {
            return
        }
        UIHelper.INSTANCE.hideSystemUI(activity)
    }

    private fun getColor(i: Int): Int {
        val foregroundColor: Int
        var saveChromeCaptionStyle: SaveChromeCaptionStyle? = null
        if (i == 0) {
            val saveChromeCaptionStyle2: SaveChromeCaptionStyle? = state
            if (saveChromeCaptionStyle2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
            } else {
                saveChromeCaptionStyle = saveChromeCaptionStyle2
            }
            foregroundColor = saveChromeCaptionStyle.getForegroundColor()
        } else if (i == 1) {
            val saveChromeCaptionStyle3: SaveChromeCaptionStyle? = state
            if (saveChromeCaptionStyle3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
            } else {
                saveChromeCaptionStyle = saveChromeCaptionStyle3
            }
            foregroundColor = saveChromeCaptionStyle.getEdgeColor()
        } else if (i == 2) {
            val saveChromeCaptionStyle4: SaveChromeCaptionStyle? = state
            if (saveChromeCaptionStyle4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
            } else {
                saveChromeCaptionStyle = saveChromeCaptionStyle4
            }
            foregroundColor = saveChromeCaptionStyle.getBackgroundColor()
        } else if (i != 3) {
            foregroundColor = 0
        } else {
            val saveChromeCaptionStyle5: SaveChromeCaptionStyle? = state
            if (saveChromeCaptionStyle5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
            } else {
                saveChromeCaptionStyle = saveChromeCaptionStyle5
            }
            foregroundColor = saveChromeCaptionStyle.getWindowColor()
        }
        return if (foregroundColor == 0) ViewCompat.MEASURED_STATE_MASK else foregroundColor
    }

    private fun setColor(context: Context, i: Int, num: Integer?) {
        val defColor: Int
        if (num == null) {
            defColor = Companion.Companion.getDefColor(i)
        } else {
            defColor = num.intValue()
        }
        var saveChromeCaptionStyle: SaveChromeCaptionStyle? = null
        if (i == 0) {
            val saveChromeCaptionStyle2: SaveChromeCaptionStyle? = state
            if (saveChromeCaptionStyle2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
            } else {
                saveChromeCaptionStyle = saveChromeCaptionStyle2
            }
            saveChromeCaptionStyle.setForegroundColor(defColor)
        } else if (i == 1) {
            val saveChromeCaptionStyle3: SaveChromeCaptionStyle? = state
            if (saveChromeCaptionStyle3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
            } else {
                saveChromeCaptionStyle = saveChromeCaptionStyle3
            }
            saveChromeCaptionStyle.setEdgeColor(defColor)
        } else if (i == 2) {
            val saveChromeCaptionStyle4: SaveChromeCaptionStyle? = state
            if (saveChromeCaptionStyle4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
            } else {
                saveChromeCaptionStyle = saveChromeCaptionStyle4
            }
            saveChromeCaptionStyle.setBackgroundColor(defColor)
        } else if (i == 3) {
            val saveChromeCaptionStyle5: SaveChromeCaptionStyle? = state
            if (saveChromeCaptionStyle5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
            } else {
                saveChromeCaptionStyle = saveChromeCaptionStyle5
            }
            saveChromeCaptionStyle.setWindowColor(defColor)
        }
        updateState(context)
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onCreateView(
        inflater: LayoutInflater,
        viewGroup: ViewGroup,
        bundle: Bundle
    ): View {
        Intrinsics.checkNotNullParameter(inflater, "inflater")
        return inflater.inflate(R.layout.chromecast_subtitle_settings, viewGroup, false)
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onDestroy() {
        super.onDestroy()
        CommonActivity.INSTANCE.onColorSelectedEvent.minusAssign(
            `ChromecastSubtitlesFragment$onDestroy$1`(this)
        )
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onViewCreated(view: View, bundle: Bundle) {
        Intrinsics.checkNotNullParameter(view, "view")
        super.onViewCreated(view, bundle)
        val arguments: Bundle? = getArguments()
        hide =
            if (arguments != null) arguments.getBoolean(MessengerShareContentUtility.SHARE_BUTTON_HIDE) else true
        CommonActivity.INSTANCE.onColorSelectedEvent.plusAssign(
            `ChromecastSubtitlesFragment$onViewCreated$1`(this)
        )
        CommonActivity.INSTANCE.onDialogDismissedEvent.plusAssign(
            `ChromecastSubtitlesFragment$onViewCreated$2`(this)
        )
        val context: Context? = getContext()
        if (context != null) {
            UIHelper.INSTANCE.fixPaddingStatusbar(
                context,
                `_$_findCachedViewById`(C4761R.C4764id.subs_root) as ScrollView?
            )
        }
        val companion: Companion = Companion
        state = companion.currentSavedStyle
        val context2: Context? = getContext()
        if (context2 != null) {
            updateState(context2)
        }
        val context3: Context? = getContext()
        val z: Boolean =
            context3 != null && SettingsFragment.Companion.Companion.isTvSettings(context3)
        val subs_text_color: TextView? =
            `_$_findCachedViewById`(C4761R.C4764id.subs_text_color) as TextView?
        Intrinsics.checkNotNullExpressionValue(subs_text_color, "subs_text_color")
        Companion.`onViewCreated$setup`(subs_text_color, z, this, 0)
        val subs_outline_color: TextView? =
            `_$_findCachedViewById`(C4761R.C4764id.subs_outline_color) as TextView?
        Intrinsics.checkNotNullExpressionValue(subs_outline_color, "subs_outline_color")
        Companion.`onViewCreated$setup`(subs_outline_color, z, this, 1)
        val subs_background_color: TextView? =
            `_$_findCachedViewById`(C4761R.C4764id.subs_background_color) as TextView?
        Intrinsics.checkNotNullExpressionValue(subs_background_color, "subs_background_color")
        Companion.`onViewCreated$setup`(subs_background_color, z, this, 2)
        val `chromecastSubtitlesFragment$onViewCreated$dismissCallback$1`: `ChromecastSubtitlesFragment$onViewCreated$dismissCallback$1` =
            `ChromecastSubtitlesFragment$onViewCreated$dismissCallback$1`(this)
        val subs_edge_type: TextView? =
            `_$_findCachedViewById`(C4761R.C4764id.subs_edge_type) as TextView?
        Intrinsics.checkNotNullExpressionValue(subs_edge_type, "subs_edge_type")
        subs_edge_type.setFocusableInTouchMode(z)
        (`_$_findCachedViewById`(C4761R.C4764id.subs_edge_type) as TextView?).setOnClickListener(
            object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.subtitles.-$$Lambda$ChromecastSubtitlesFragment$Pn-xqUQwET3SwyzRzqdqaxi-1Vw
                @Override // android.view.View.OnClickListener
                fun onClick(view2: View?) {
                    Companion.`m8963onViewCreated$lambda5`(
                        this@ChromecastSubtitlesFragment,
                        `chromecastSubtitlesFragment$onViewCreated$dismissCallback$1`,
                        view2
                    )
                }
            })
        (`_$_findCachedViewById`(C4761R.C4764id.subs_edge_type) as TextView?).setOnLongClickListener(
            object : OnLongClickListener() {
                // from class: com.lagradost.cloudstream3.ui.subtitles.-$$Lambda$ChromecastSubtitlesFragment$DgQXryQUNZpzZMlw1_caVGHEXsU
                @Override // android.view.View.OnLongClickListener
                fun onLongClick(view2: View?): Boolean {
                    val `m8964onViewCreated$lambda6`: Boolean
                    `m8964onViewCreated$lambda6` = Companion.`m8964onViewCreated$lambda6`(
                        this@ChromecastSubtitlesFragment,
                        view2
                    )
                    return `m8964onViewCreated$lambda6`
                }
            })
        val subs_font_size: TextView? =
            `_$_findCachedViewById`(C4761R.C4764id.subs_font_size) as TextView?
        Intrinsics.checkNotNullExpressionValue(subs_font_size, "subs_font_size")
        subs_font_size.setFocusableInTouchMode(z)
        (`_$_findCachedViewById`(C4761R.C4764id.subs_font_size) as TextView?).setOnClickListener(
            object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.subtitles.-$$Lambda$ChromecastSubtitlesFragment$PqmEZYupLjFwWOUxSH3dh9lDroM
                @Override // android.view.View.OnClickListener
                fun onClick(view2: View?) {
                    Companion.`m8965onViewCreated$lambda9`(
                        this@ChromecastSubtitlesFragment,
                        `chromecastSubtitlesFragment$onViewCreated$dismissCallback$1`,
                        view2
                    )
                }
            })
        (`_$_findCachedViewById`(C4761R.C4764id.subs_font_size) as TextView?).setOnLongClickListener(
            object : OnLongClickListener() {
                // from class: com.lagradost.cloudstream3.ui.subtitles.-$$Lambda$ChromecastSubtitlesFragment$B7qZyEINCoi8pBIP27sRHbAZjjA
                @Override // android.view.View.OnLongClickListener
                fun onLongClick(view2: View?): Boolean {
                    val `m8958onViewCreated$lambda10`: Boolean
                    `m8958onViewCreated$lambda10` = Companion.`m8958onViewCreated$lambda10`(
                        this@ChromecastSubtitlesFragment,
                        view2
                    )
                    return `m8958onViewCreated$lambda10`
                }
            })
        val subs_font: TextView? = `_$_findCachedViewById`(C4761R.C4764id.subs_font) as TextView?
        Intrinsics.checkNotNullExpressionValue(subs_font, "subs_font")
        subs_font.setFocusableInTouchMode(z)
        (`_$_findCachedViewById`(C4761R.C4764id.subs_font) as TextView?).setOnClickListener(object :
            OnClickListener() {
            // from class: com.lagradost.cloudstream3.ui.subtitles.-$$Lambda$ChromecastSubtitlesFragment$G16oD7Q5yL1ehV6sz0cr_pvt-Ww
            @Override // android.view.View.OnClickListener
            fun onClick(view2: View?) {
                Companion.`m8959onViewCreated$lambda13`(
                    this@ChromecastSubtitlesFragment,
                    `chromecastSubtitlesFragment$onViewCreated$dismissCallback$1`,
                    view2
                )
            }
        })
        (`_$_findCachedViewById`(C4761R.C4764id.subs_font) as TextView?).setOnLongClickListener(
            object : OnLongClickListener() {
                // from class: com.lagradost.cloudstream3.ui.subtitles.-$$Lambda$ChromecastSubtitlesFragment$Ym1cbYRwn5t_sM8_dMO_zZMUJEs
                @Override // android.view.View.OnLongClickListener
                fun onLongClick(view2: View?): Boolean {
                    val `m8960onViewCreated$lambda14`: Boolean
                    `m8960onViewCreated$lambda14` = Companion.`m8960onViewCreated$lambda14`(
                        this@ChromecastSubtitlesFragment,
                        view2
                    )
                    return `m8960onViewCreated$lambda14`
                }
            })
        (`_$_findCachedViewById`(C4761R.C4764id.cancel_btt) as MaterialButton?).setOnClickListener(
            object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.subtitles.-$$Lambda$ChromecastSubtitlesFragment$a92eWdHHs-1fEWR0bh8EvyJp4KA
                @Override // android.view.View.OnClickListener
                fun onClick(view2: View?) {
                    Companion.`m8961onViewCreated$lambda15`(this@ChromecastSubtitlesFragment, view2)
                }
            })
        (`_$_findCachedViewById`(C4761R.C4764id.apply_btt) as MaterialButton?).setOnClickListener(
            object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.subtitles.-$$Lambda$ChromecastSubtitlesFragment$nAjj28LRVO4QeY-AR4KEgcAvNr4
                @Override // android.view.View.OnClickListener
                fun onClick(view2: View?) {
                    Companion.`m8962onViewCreated$lambda16`(this@ChromecastSubtitlesFragment, view2)
                }
            })
        (`_$_findCachedViewById`(C4761R.C4764id.subtitle_text) as SubtitleView?).setCues(
            CollectionsKt.listOf<Cue>(
                Cue.Builder().setTextSize(companion.getPixels(2, 25.0f).toFloat(), 2).setText(
                    (`_$_findCachedViewById`(C4761R.C4764id.subtitle_text) as SubtitleView?).getContext()
                        .getString(R.string.subtitles_example_text)
                ).build()
            )
        )
    }

    companion object {
        val Companion: Companion = Companion(null)
        private val applyStyleEvent: Event<SaveChromeCaptionStyle> = Event()
        private val defaultState: SaveChromeCaptionStyle =
            SaveChromeCaptionStyle(null, null, 0, 0, 0, 0, 0.0f, 0, 255, null)

        private fun `onViewCreated$setup`(
            view: View,
            z: Boolean,
            chromecastSubtitlesFragment: ChromecastSubtitlesFragment,
            i: Int
        ) {
            view.setFocusableInTouchMode(z)
            view.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.subtitles.-$$Lambda$ChromecastSubtitlesFragment$wAKXdNf0Aa3LcQNE6WAiDodMt1s
                @Override // android.view.View.OnClickListener
                fun onClick(view2: View?) {
                    ChromecastSubtitlesFragment.Companion.`m8966onViewCreated$setup$lambda1`(
                        this@ChromecastSubtitlesFragment,
                        i,
                        view2
                    )
                }
            })
            view.setOnLongClickListener(object : OnLongClickListener() {
                // from class: com.lagradost.cloudstream3.ui.subtitles.-$$Lambda$ChromecastSubtitlesFragment$MFBl9GwAaPssMU7Hp1OBw32KFPs
                @Override // android.view.View.OnLongClickListener
                fun onLongClick(view2: View?): Boolean {
                    val `m8967onViewCreated$setup$lambda2`: Boolean
                    `m8967onViewCreated$setup$lambda2` =
                        ChromecastSubtitlesFragment.Companion.`m8967onViewCreated$setup$lambda2`(
                            this@ChromecastSubtitlesFragment,
                            i,
                            view2
                        )
                    return `m8967onViewCreated$setup$lambda2`
                }
            })
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$setup$lambda-1  reason: not valid java name */
        fun `m8966onViewCreated$setup$lambda1`(
            `this$0`: ChromecastSubtitlesFragment,
            i: Int,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                ColorPickerDialog.newBuilder().setDialogId(i).setShowAlphaSlider(true)
                    .setColor(`this$0`.getColor(i)).show(activity)
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$setup$lambda-2  reason: not valid java name */
        fun `m8967onViewCreated$setup$lambda2`(
            `this$0`: ChromecastSubtitlesFragment,
            i: Int,
            view: View
        ): Boolean {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val context: Context = view.getContext()
            Intrinsics.checkNotNullExpressionValue(context, "it.context")
            `this$0`.setColor(context, i, null)
            CommonActivity.INSTANCE.showToast(
                `this$0`.getActivity(),
                R.string.subs_default_reset_toast,
                0
            )
            return true
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-5  reason: not valid java name */
        fun `m8963onViewCreated$lambda5`(
            `this$0`: ChromecastSubtitlesFragment,
            dismissCallback: Functions<*>?,
            view: View
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(dismissCallback, "\$dismissCallback")
            val listOf: List = CollectionsKt.listOf<Object>(
                *arrayOf<Tuples<*, *>>(
                    Tuples<Any?, Any?>(
                        0,
                        view.getContext().getString(R.string.subtitles_none)
                    ),
                    Tuples<Any?, Any?>(1, view.getContext().getString(R.string.subtitles_outline)),
                    Tuples<Any?, Any?>(
                        4,
                        view.getContext().getString(R.string.subtitles_depressed)
                    ),
                    Tuples<Any?, Any?>(2, view.getContext().getString(R.string.subtitles_shadow)),
                    Tuples<Any?, Any?>(3, view.getContext().getString(R.string.subtitles_raised))
                ) as Array<Object>
            )
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                val singleSelectionHelper: SingleSelectionHelper = SingleSelectionHelper.INSTANCE
                val fragmentActivity: FragmentActivity = activity
                val list: List<Tuples<*, *>> = listOf
                val arrayList: ArrayList =
                    ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10))
                for (tuples: Tuples<*, *> in list) {
                    val second: Object = tuples.getSecond()
                    Intrinsics.checkNotNullExpressionValue(second, "it.second")
                    arrayList.add(second as String?)
                }
                val arrayList2: ArrayList = arrayList
                val arrayList3: ArrayList =
                    ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10))
                for (tuples2: Tuples<*, *> in list) {
                    arrayList3.add(Integer.valueOf((tuples2.getFirst() as Number).intValue()))
                }
                val arrayList4: ArrayList = arrayList3
                var saveChromeCaptionStyle: SaveChromeCaptionStyle? = `this$0`.state
                if (saveChromeCaptionStyle == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
                    saveChromeCaptionStyle = null
                }
                val indexOf: Int =
                    arrayList4.indexOf(Integer.valueOf(saveChromeCaptionStyle.getEdgeType()))
                Objects.requireNonNull(
                    view,
                    "null cannot be cast to non-null type android.widget.TextView"
                )
                singleSelectionHelper.showDialog(
                    fragmentActivity,
                    arrayList2,
                    indexOf,
                    (view as TextView).getText().toString(),
                    false,
                    dismissCallback,
                    `ChromecastSubtitlesFragment$onViewCreated$3$3`(`this$0`, listOf, view)
                )
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-6  reason: not valid java name */
        fun `m8964onViewCreated$lambda6`(
            `this$0`: ChromecastSubtitlesFragment,
            view: View
        ): Boolean {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            var saveChromeCaptionStyle: SaveChromeCaptionStyle? = `this$0`.state
            if (saveChromeCaptionStyle == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
                saveChromeCaptionStyle = null
            }
            saveChromeCaptionStyle.setEdgeType(ChromecastSubtitlesFragment.Companion.defaultState.getEdgeType())
            val context: Context = view.getContext()
            Intrinsics.checkNotNullExpressionValue(context, "it.context")
            `this$0`.updateState(context)
            CommonActivity.INSTANCE.showToast(
                `this$0`.getActivity(),
                R.string.subs_default_reset_toast,
                0
            )
            return true
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-9  reason: not valid java name */
        fun `m8965onViewCreated$lambda9`(
            `this$0`: ChromecastSubtitlesFragment,
            dismissCallback: Functions<*>?,
            view: View
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(dismissCallback, "\$dismissCallback")
            val listOf: List = CollectionsKt.listOf<Object>(
                *arrayOf<Tuples<*, *>>(
                    Tuples<Any?, Any?>(Float.valueOf(0.75f), "75%"),
                    Tuples<Any?, Any?>(Float.valueOf(0.8f), "80%"),
                    Tuples<Any?, Any?>(Float.valueOf(0.85f), "85%"),
                    Tuples<Any?, Any?>(Float.valueOf(0.9f), "90%"),
                    Tuples<Any?, Any?>(Float.valueOf(0.95f), "95%"),
                    Tuples<Any?, Any?>(Float.valueOf(1.0f), "100%"),
                    Tuples(Float.valueOf(1.05f), view.getContext().getString(R.string.normal)),
                    Tuples<Any?, Any?>(Float.valueOf(1.1f), "110%"),
                    Tuples<Any?, Any?>(Float.valueOf(1.15f), "115%"),
                    Tuples<Any?, Any?>(Float.valueOf(1.2f), "120%"),
                    Tuples<Any?, Any?>(Float.valueOf(1.25f), "125%"),
                    Tuples<Any?, Any?>(Float.valueOf(1.3f), "130%"),
                    Tuples<Any?, Any?>(Float.valueOf(1.35f), "135%"),
                    Tuples<Any?, Any?>(Float.valueOf(1.4f), "140%"),
                    Tuples<Any?, Any?>(Float.valueOf(1.45f), "145%"),
                    Tuples<Any?, Any?>(Float.valueOf(1.5f), "150%")
                ) as Array<Object>
            )
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                val singleSelectionHelper: SingleSelectionHelper = SingleSelectionHelper.INSTANCE
                val fragmentActivity: FragmentActivity = activity
                val list: List<Tuples<*, *>> = listOf
                val arrayList: ArrayList =
                    ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10))
                for (tuples: Tuples<*, *> in list) {
                    arrayList.add(tuples.getSecond() as String?)
                }
                val arrayList2: ArrayList = arrayList
                val arrayList3: ArrayList =
                    ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10))
                for (tuples2: Tuples<*, *> in list) {
                    arrayList3.add(Float.valueOf((tuples2.getFirst() as Number).floatValue()))
                }
                val arrayList4: ArrayList = arrayList3
                var saveChromeCaptionStyle: SaveChromeCaptionStyle? = `this$0`.state
                if (saveChromeCaptionStyle == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
                    saveChromeCaptionStyle = null
                }
                val indexOf: Int =
                    arrayList4.indexOf(Float.valueOf(saveChromeCaptionStyle.getFontScale()))
                Objects.requireNonNull(
                    view,
                    "null cannot be cast to non-null type android.widget.TextView"
                )
                singleSelectionHelper.showDialog(
                    fragmentActivity,
                    arrayList2,
                    indexOf,
                    (view as TextView).getText().toString(),
                    false,
                    dismissCallback,
                    `ChromecastSubtitlesFragment$onViewCreated$5$3`(`this$0`, listOf)
                )
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-10  reason: not valid java name */
        fun `m8958onViewCreated$lambda10`(
            `this$0`: ChromecastSubtitlesFragment,
            view: View?
        ): Boolean {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            var saveChromeCaptionStyle: SaveChromeCaptionStyle? = `this$0`.state
            if (saveChromeCaptionStyle == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
                saveChromeCaptionStyle = null
            }
            saveChromeCaptionStyle.setFontScale(ChromecastSubtitlesFragment.Companion.defaultState.getFontScale())
            CommonActivity.INSTANCE.showToast(
                `this$0`.getActivity(),
                R.string.subs_default_reset_toast,
                0
            )
            return true
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-13  reason: not valid java name */
        fun `m8959onViewCreated$lambda13`(
            `this$0`: ChromecastSubtitlesFragment,
            dismissCallback: Functions<*>?,
            view: View
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(dismissCallback, "\$dismissCallback")
            var saveChromeCaptionStyle: SaveChromeCaptionStyle? = null
            val listOf: List = CollectionsKt.listOf<Object>(
                *arrayOf<Tuples<*, *>>(
                    Tuples<Any?, Any?>(
                        null,
                        view.getContext().getString(R.string.normal)
                    ),
                    Tuples<Any?, Any?>("Droid Sans", "Droid Sans"),
                    Tuples<Any?, Any?>("Droid Sans Mono", "Droid Sans Mono"),
                    Tuples<Any?, Any?>("Droid Serif Regular", "Droid Serif Regular"),
                    Tuples<Any?, Any?>("Cutive Mono", "Cutive Mono"),
                    Tuples<Any?, Any?>("Short Stack", "Short Stack"),
                    Tuples<Any?, Any?>("Quintessential", "Quintessential"),
                    Tuples<Any?, Any?>("Alegreya Sans SC", "Alegreya Sans SC")
                ) as Array<Object>
            )
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                val singleSelectionHelper: SingleSelectionHelper = SingleSelectionHelper.INSTANCE
                val fragmentActivity: FragmentActivity = activity
                val list: List<Tuples<*, *>> = listOf
                val arrayList: ArrayList =
                    ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10))
                for (tuples: Tuples<*, *> in list) {
                    val second: Object = tuples.getSecond()
                    Intrinsics.checkNotNullExpressionValue(second, "it.second")
                    arrayList.add(second as String?)
                }
                val arrayList2: ArrayList = arrayList
                val arrayList3: ArrayList =
                    ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10))
                for (tuples2: Tuples<*, *> in list) {
                    arrayList3.add(tuples2.getFirst() as String?)
                }
                val arrayList4: ArrayList = arrayList3
                val saveChromeCaptionStyle2: SaveChromeCaptionStyle? = `this$0`.state
                if (saveChromeCaptionStyle2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
                } else {
                    saveChromeCaptionStyle = saveChromeCaptionStyle2
                }
                val indexOf: Int = arrayList4.indexOf(saveChromeCaptionStyle.getFontFamily())
                Objects.requireNonNull(
                    view,
                    "null cannot be cast to non-null type android.widget.TextView"
                )
                singleSelectionHelper.showDialog(
                    fragmentActivity,
                    arrayList2,
                    indexOf,
                    (view as TextView).getText().toString(),
                    false,
                    dismissCallback,
                    `ChromecastSubtitlesFragment$onViewCreated$7$3`(`this$0`, listOf, view)
                )
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-14  reason: not valid java name */
        fun `m8960onViewCreated$lambda14`(
            `this$0`: ChromecastSubtitlesFragment,
            view: View
        ): Boolean {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            var saveChromeCaptionStyle: SaveChromeCaptionStyle? = `this$0`.state
            if (saveChromeCaptionStyle == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
                saveChromeCaptionStyle = null
            }
            saveChromeCaptionStyle.setFontFamily(ChromecastSubtitlesFragment.Companion.defaultState.getFontFamily())
            val context: Context = view.getContext()
            Intrinsics.checkNotNullExpressionValue(context, "textView.context")
            `this$0`.updateState(context)
            CommonActivity.INSTANCE.showToast(
                `this$0`.getActivity(),
                R.string.subs_default_reset_toast,
                0
            )
            return true
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-15  reason: not valid java name */
        fun `m8961onViewCreated$lambda15`(`this$0`: ChromecastSubtitlesFragment, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                UIHelper.INSTANCE.popCurrentPage(activity)
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-16  reason: not valid java name */
        fun `m8962onViewCreated$lambda16`(`this$0`: ChromecastSubtitlesFragment, view: View) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val companion: Companion = Companion
            val context: Context = view.getContext()
            Intrinsics.checkNotNullExpressionValue(context, "it.context")
            var saveChromeCaptionStyle: SaveChromeCaptionStyle? = `this$0`.state
            var saveChromeCaptionStyle2: SaveChromeCaptionStyle? = null
            if (saveChromeCaptionStyle == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
                saveChromeCaptionStyle = null
            }
            companion.saveStyle(context, saveChromeCaptionStyle)
            val event: Event<SaveChromeCaptionStyle?> =
                ChromecastSubtitlesFragment.Companion.applyStyleEvent
            val saveChromeCaptionStyle3: SaveChromeCaptionStyle? = `this$0`.state
            if (saveChromeCaptionStyle3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
            } else {
                saveChromeCaptionStyle2 = saveChromeCaptionStyle3
            }
            event.invoke(saveChromeCaptionStyle2)
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                UIHelper.INSTANCE.popCurrentPage(activity)
            }
        }
    }
}