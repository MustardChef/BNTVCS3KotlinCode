package com.lagradost.cloudstream3.p041ui.subtitles

import android.app.Activity
import androidx.fragment.app.Fragment
import com.lagradost.cloudstream3.utils.Event
import kotlin.jvm.functions.Functions
import kotlin.jvm.internal.Intrinsics

/* compiled from: SubtitlesFragment.kt */
@Metadata(
    m108d1 = ["\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u001c\u0010\n\u001a\u00020\u000b2\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\rH\u0002J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u000bH\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u001a\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J#\u0010\u001a\u001a\u00020\u000b*\u00020\u001b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0002\u0010\u001dJ\u000c\u0010\u001e\u001a\u00020\u000b*\u00020\u001bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000¨\u0006 "],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/subtitles/SubtitlesFragment;", "Landroidx/fragment/app/Fragment;", "()V", MessengerShareContentUtility.SHARE_BUTTON_HIDE, "", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/lagradost/cloudstream3/ui/subtitles/SaveCaptionStyle;", "getColor", "", "id", "onColorSelected", "", "stuff", "Lkotlin/Pair;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onDialogDismissed", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "setColor", "Landroid/content/Context;", "color", "(Landroid/content/Context;ILjava/lang/Integer;)V", "updateState", "Companion", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.subtitles.SubtitlesFragment */ /* loaded from: classes4.dex */
class SubtitlesFragment constructor() : Fragment() {
    var `_$_findViewCache`: Map<Integer, View> = LinkedHashMap()
    var hide: Boolean = true
    var state: SaveCaptionStyle? = null
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

    /* compiled from: SubtitlesFragment.kt */
    @Metadata(
        m108d1 = ["\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u0005J\u0010\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000cH\u0002J\u000c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000fJ\u0018\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u001a\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019J\u0012\u0010\u001a\u001a\u00020\u001b*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0005J\u000c\u0010\u001e\u001a\u00020\u001b*\u00020\u001cH\u0002J\u0012\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u000f*\u00020\u001cH\u0002J\u0012\u0010!\u001a\u00020\u0015*\u00020\u001c2\u0006\u0010\"\u001a\u00020\u0005R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006#"],
        m107d2 = ["Lcom/lagradost/cloudstream3/ui/subtitles/SubtitlesFragment\$Companion;", "", "()V", "applyStyleEvent", "Lcom/lagradost/cloudstream3/utils/Event;", "Lcom/lagradost/cloudstream3/ui/subtitles/SaveCaptionStyle;", "getApplyStyleEvent", "()Lcom/lagradost/cloudstream3/utils/Event;", "getAutoSelectLanguageISO639_1", "", "getCurrentSavedStyle", "getDefColor", "", "id", "getDownloadSubsLanguageISO639_1", "", "getPixels", "unit", "size", "", "push", "", "activity", "Landroid/app/Activity;", MessengerShareContentUtility.SHARE_BUTTON_HIDE, "", "fromSaveToStyle", "Lcom/google/android/exoplayer2/ui/CaptionStyleCompat;", "Landroid/content/Context;", "data", "getCurrentStyle", "getSavedFonts", "Ljava/io/File;", "saveStyle", "style", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* renamed from: com.lagradost.cloudstream3.ui.subtitles.SubtitlesFragment$Companion */ /* loaded from: classes4.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        /* JADX INFO: Access modifiers changed from: private */
        fun getDefColor(i: Int): Int {
            if (i != 0) {
                return if (i != 1) if (i != 2) 0 else 0 else ViewCompat.MEASURED_STATE_MASK
            }
            return -1
        }

        val applyStyleEvent: Event<SaveCaptionStyle>
            get() {
                return SubtitlesFragment.Companion.applyStyleEvent
            }

        fun fromSaveToStyle(context: Context?, data: SaveCaptionStyle?): CaptionStyleCompat {
            var typeface: Typeface?
            val typeface2: Typeface?
            Intrinsics.checkNotNullParameter(context, "<this>")
            Intrinsics.checkNotNullParameter(data, "data")
            val foregroundColor: Int = data.getForegroundColor()
            val backgroundColor: Int = data.getBackgroundColor()
            val windowColor: Int = data.getWindowColor()
            val edgeType: Int = data.getEdgeType()
            val edgeColor: Int = data.getEdgeColor()
            val typefaceFilePath: String? = data.getTypefaceFilePath()
            if (typefaceFilePath != null) {
                try {
                    typeface = Typeface.createFromFile(File(typefaceFilePath))
                } catch (unused: Exception) {
                    typeface = null
                }
                if (typeface != null) {
                    typeface2 = typeface
                    return CaptionStyleCompat(
                        foregroundColor,
                        backgroundColor,
                        windowColor,
                        edgeType,
                        edgeColor,
                        typeface2
                    )
                }
            }
            val typeface3: Integer? = data!!.getTypeface()
            val font: Typeface? = if (typeface3 != null) ResourcesCompat.getFont(
                context,
                typeface3.intValue()
            ) else null
            typeface2 = if (font == null) Typeface.SANS_SERIF else font
            return CaptionStyleCompat(
                foregroundColor,
                backgroundColor,
                windowColor,
                edgeType,
                edgeColor,
                typeface2
            )
        }

        fun push(activity: Activity?, z: Boolean) {
            val uIHelper: UIHelper = UIHelper.INSTANCE
            val bundle: Bundle = Bundle()
            bundle.putBoolean(MessengerShareContentUtility.SHARE_BUTTON_HIDE, z)
            val unit: Unit = Unit.INSTANCE
            uIHelper.navigate(activity, R.id.global_to_navigation_subtitles, bundle)
        }

        fun saveStyle(context: Context?, style: SaveCaptionStyle?) {
            Intrinsics.checkNotNullParameter(context, "<this>")
            Intrinsics.checkNotNullParameter(style, "style")
            DataStore.INSTANCE.setKey(context, SubtitlesFragmentKt.SUBTITLE_KEY, style)
        }

        val currentSavedStyle: SaveCaptionStyle
            get() {
                val context: Context? = AcraApplication.Companion.context
                var obj: Object? = null
                if (context != null) {
                    val dataStore: DataStore = DataStore.INSTANCE
                    try {
                        val string: String? = dataStore.getSharedPrefs(context)
                            .getString(SubtitlesFragmentKt.SUBTITLE_KEY, null)
                        if (string != null) {
                            Intrinsics.checkNotNullExpressionValue(
                                string,
                                "getSharedPrefs().getStri…h, null) ?: return defVal"
                            )
                            val readValue: Object =
                                dataStore.mapper.readValue(string, SaveCaptionStyle::class.java)
                            Intrinsics.checkNotNullExpressionValue(
                                readValue,
                                "mapper.readValue(this, T::class.java)"
                            )
                            obj = readValue
                        }
                    } catch (unused: Exception) {
                    }
                }
                val saveCaptionStyle: SaveCaptionStyle? = obj
                return if (saveCaptionStyle == null) SaveCaptionStyle(
                    getDefColor(0),
                    getDefColor(2),
                    getDefColor(3),
                    1,
                    getDefColor(1),
                    null,
                    null,
                    20,
                    null,
                    false,
                    false,
                    1536,
                    null
                ) else saveCaptionStyle
            }

        /* JADX INFO: Access modifiers changed from: private */
        fun getSavedFonts(context: Context): List<File> {
            var externalFilesDir: File
            if (context.getExternalFilesDir(null) == null) {
                return CollectionsKt.emptyList<Any>()
            }
            val file: File = File(externalFilesDir.getAbsolutePath() + "/Fonts")
            file.mkdir()
            val list: Array<String>? = file.list()
            if (list == null) {
                return CollectionsKt.emptyList<Any>()
            }
            val arrayList: ArrayList = ArrayList()
            for (it: String in list) {
                Intrinsics.checkNotNullExpressionValue(it, "it")
                val file2: File? =
                    if (StringsKt.`endsWith$default`(it, ".ttf", false, 2, null as Object?)) File(
                        file.getAbsolutePath() + JsonPointer.SEPARATOR + it
                    ) else null
                if (file2 != null) {
                    arrayList.add(file2)
                }
            }
            return arrayList
        }

        private fun getCurrentStyle(context: Context): CaptionStyleCompat {
            return fromSaveToStyle(context, currentSavedStyle)
        }

        /* JADX INFO: Access modifiers changed from: private */
        fun getPixels(i: Int, f: Float): Int {
            val displayMetrics: DisplayMetrics = Resources.getSystem().getDisplayMetrics()
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "getSystem().displayMetrics")
            return TypedValue.applyDimension(i, f, displayMetrics)
        }

        val downloadSubsLanguageISO639_1: List<String>
            get() {
                val context: Context? = AcraApplication.Companion.context
                var obj: Object? = null
                if (context != null) {
                    val dataStore: DataStore = DataStore.INSTANCE
                    try {
                        val string: String? = dataStore.getSharedPrefs(context)
                            .getString(SubtitlesFragmentKt.SUBTITLE_DOWNLOAD_KEY, null)
                        if (string != null) {
                            Intrinsics.checkNotNullExpressionValue(
                                string,
                                "getSharedPrefs().getStri…h, null) ?: return defVal"
                            )
                            val readValue: Object =
                                dataStore.mapper.readValue(string, List::class.java)
                            Intrinsics.checkNotNullExpressionValue(
                                readValue,
                                "mapper.readValue(this, T::class.java)"
                            )
                            obj = readValue
                        }
                    } catch (unused: Exception) {
                    }
                }
                val list: List<String>? = obj
                return if (list == null) CollectionsKt.listOf("vi") else list
            }
        val autoSelectLanguageISO639_1: String
            get() {
                val context: Context? = AcraApplication.Companion.context
                var obj: Object? = null
                if (context != null) {
                    val dataStore: DataStore = DataStore.INSTANCE
                    try {
                        val string: String? = dataStore.getSharedPrefs(context)
                            .getString(SubtitlesFragmentKt.SUBTITLE_AUTO_SELECT_KEY, null)
                        if (string != null) {
                            Intrinsics.checkNotNullExpressionValue(
                                string,
                                "getSharedPrefs().getStri…h, null) ?: return defVal"
                            )
                            val readValue: Object =
                                dataStore.mapper.readValue(string, String::class.java)
                            Intrinsics.checkNotNullExpressionValue(
                                readValue,
                                "mapper.readValue(this, T::class.java)"
                            )
                            obj = readValue
                        }
                    } catch (unused: Exception) {
                    }
                }
                val str: String? = obj
                return if (str == null) "vi" else str
            }

        companion object {
            fun  /* synthetic */`push$default`(
                companion: SubtitlesFragment.Companion,
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

    private fun setColor(context: Context, i: Int, num: Integer?) {
        val defColor: Int
        if (num == null) {
            defColor = Companion.Companion.getDefColor(i)
        } else {
            defColor = num.intValue()
        }
        var saveCaptionStyle: SaveCaptionStyle? = null
        if (i == 0) {
            val saveCaptionStyle2: SaveCaptionStyle? = state
            if (saveCaptionStyle2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
            } else {
                saveCaptionStyle = saveCaptionStyle2
            }
            saveCaptionStyle.setForegroundColor(defColor)
        } else if (i == 1) {
            val saveCaptionStyle3: SaveCaptionStyle? = state
            if (saveCaptionStyle3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
            } else {
                saveCaptionStyle = saveCaptionStyle3
            }
            saveCaptionStyle.setEdgeColor(defColor)
        } else if (i == 2) {
            val saveCaptionStyle4: SaveCaptionStyle? = state
            if (saveCaptionStyle4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
            } else {
                saveCaptionStyle = saveCaptionStyle4
            }
            saveCaptionStyle.setBackgroundColor(defColor)
        } else if (i == 3) {
            val saveCaptionStyle5: SaveCaptionStyle? = state
            if (saveCaptionStyle5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
            } else {
                saveCaptionStyle = saveCaptionStyle5
            }
            saveCaptionStyle.setWindowColor(defColor)
        }
        updateState(context)
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun updateState(context: Context?) {
        val subtitleView: SubtitleView? =
            `_$_findCachedViewById`(C4761R.C4764id.subtitle_text) as SubtitleView?
        if (subtitleView != null) {
            val companion: Companion = Companion
            var saveCaptionStyle: SaveCaptionStyle? = state
            if (saveCaptionStyle == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
                saveCaptionStyle = null
            }
            subtitleView.setStyle(companion.fromSaveToStyle(context, saveCaptionStyle))
        }
    }

    private fun getColor(i: Int): Int {
        val foregroundColor: Int
        var saveCaptionStyle: SaveCaptionStyle? = null
        if (i == 0) {
            val saveCaptionStyle2: SaveCaptionStyle? = state
            if (saveCaptionStyle2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
            } else {
                saveCaptionStyle = saveCaptionStyle2
            }
            foregroundColor = saveCaptionStyle.getForegroundColor()
        } else if (i == 1) {
            val saveCaptionStyle3: SaveCaptionStyle? = state
            if (saveCaptionStyle3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
            } else {
                saveCaptionStyle = saveCaptionStyle3
            }
            foregroundColor = saveCaptionStyle.getEdgeColor()
        } else if (i == 2) {
            val saveCaptionStyle4: SaveCaptionStyle? = state
            if (saveCaptionStyle4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
            } else {
                saveCaptionStyle = saveCaptionStyle4
            }
            foregroundColor = saveCaptionStyle.getBackgroundColor()
        } else if (i != 3) {
            foregroundColor = 0
        } else {
            val saveCaptionStyle5: SaveCaptionStyle? = state
            if (saveCaptionStyle5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
            } else {
                saveCaptionStyle = saveCaptionStyle5
            }
            foregroundColor = saveCaptionStyle.getWindowColor()
        }
        return if (foregroundColor == 0) ViewCompat.MEASURED_STATE_MASK else foregroundColor
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onCreateView(
        inflater: LayoutInflater,
        viewGroup: ViewGroup,
        bundle: Bundle
    ): View {
        Intrinsics.checkNotNullParameter(inflater, "inflater")
        return inflater.inflate(R.layout.subtitle_settings, viewGroup, false)
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onDestroy() {
        super.onDestroy()
        CommonActivity.INSTANCE.onColorSelectedEvent.minusAssign(
            `SubtitlesFragment$onDestroy$1`(
                this
            )
        )
    }

    @Override // androidx.fragment.app.Fragment
    public override fun onViewCreated(view: View, bundle: Bundle) {
        var companion: Companion
        var externalFilesDir: File
        Intrinsics.checkNotNullParameter(view, "view")
        super.onViewCreated(view, bundle)
        val arguments: Bundle? = getArguments()
        hide =
            if (arguments != null) arguments.getBoolean(MessengerShareContentUtility.SHARE_BUTTON_HIDE) else true
        CommonActivity.INSTANCE.onColorSelectedEvent.plusAssign(
            `SubtitlesFragment$onViewCreated$1`(
                this
            )
        )
        CommonActivity.INSTANCE.onDialogDismissedEvent.plusAssign(
            `SubtitlesFragment$onViewCreated$2`(this)
        )
        val textView: TextView? =
            `_$_findCachedViewById`(C4761R.C4764id.subs_import_text) as TextView?
        var saveCaptionStyle: SaveCaptionStyle? = null
        if (textView != null) {
            val string: String = getString(R.string.subs_import_text)
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.subs_import_text)")
            val objArr: Array<Object> = arrayOfNulls<Object>(1)
            val sb: StringBuilder = StringBuilder()
            val context: Context? = getContext()
            sb.append(
                if ((context == null || (context.getExternalFilesDir(null)
                        .also({ externalFilesDir = it })) == null)
                ) null else externalFilesDir.getAbsolutePath()
            )
            sb.append("/Fonts")
            objArr.get(0) = sb.toString()
            val format: String = String.format(string, Arrays.copyOf(objArr, 1))
            Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)")
            textView.setText(format)
        }
        val context2: Context? = getContext()
        if (context2 != null) {
            UIHelper.INSTANCE.fixPaddingStatusbar(
                context2,
                `_$_findCachedViewById`(C4761R.C4764id.subs_root) as ScrollView?
            )
        }
        state = Companion.Companion.getCurrentSavedStyle()
        val context3: Context? = getContext()
        if (context3 != null) {
            updateState(context3)
        }
        val context4: Context? = getContext()
        val z: Boolean =
            context4 != null && SettingsFragment.Companion.Companion.isTrueTvSettings(context4)
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
        val subs_window_color: TextView? =
            `_$_findCachedViewById`(C4761R.C4764id.subs_window_color) as TextView?
        Intrinsics.checkNotNullExpressionValue(subs_window_color, "subs_window_color")
        Companion.`onViewCreated$setup`(subs_window_color, z, this, 3)
        val `subtitlesFragment$onViewCreated$dismissCallback$1`: `SubtitlesFragment$onViewCreated$dismissCallback$1` =
            `SubtitlesFragment$onViewCreated$dismissCallback$1`(this)
        val subs_subtitle_elevation: TextView? =
            `_$_findCachedViewById`(C4761R.C4764id.subs_subtitle_elevation) as TextView?
        Intrinsics.checkNotNullExpressionValue(subs_subtitle_elevation, "subs_subtitle_elevation")
        subs_subtitle_elevation.setFocusableInTouchMode(z)
        (`_$_findCachedViewById`(C4761R.C4764id.subs_subtitle_elevation) as TextView?).setOnClickListener(
            object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.subtitles.-$$Lambda$SubtitlesFragment$4YChNb__jwYn8HkbfB41LpW4EH4
                @Override // android.view.View.OnClickListener
                fun onClick(view2: View?) {
                    Companion.`m8985onViewCreated$lambda5`(
                        this@SubtitlesFragment,
                        `subtitlesFragment$onViewCreated$dismissCallback$1`,
                        view2
                    )
                }
            })
        (`_$_findCachedViewById`(C4761R.C4764id.subs_subtitle_elevation) as TextView?).setOnLongClickListener(
            object : OnLongClickListener() {
                // from class: com.lagradost.cloudstream3.ui.subtitles.-$$Lambda$SubtitlesFragment$BgJ0TE45-ZRsfeEL556eXoxqVaI
                @Override // android.view.View.OnLongClickListener
                fun onLongClick(view2: View?): Boolean {
                    val `m8986onViewCreated$lambda6`: Boolean
                    `m8986onViewCreated$lambda6` =
                        Companion.`m8986onViewCreated$lambda6`(this@SubtitlesFragment, view2)
                    return `m8986onViewCreated$lambda6`
                }
            })
        val subs_edge_type: TextView? =
            `_$_findCachedViewById`(C4761R.C4764id.subs_edge_type) as TextView?
        Intrinsics.checkNotNullExpressionValue(subs_edge_type, "subs_edge_type")
        subs_edge_type.setFocusableInTouchMode(z)
        (`_$_findCachedViewById`(C4761R.C4764id.subs_edge_type) as TextView?).setOnClickListener(
            object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.subtitles.-$$Lambda$SubtitlesFragment$_etdu8jjx86p1kipoIzfv9Rwiz0
                @Override // android.view.View.OnClickListener
                fun onClick(view2: View?) {
                    Companion.`m8987onViewCreated$lambda9`(
                        this@SubtitlesFragment,
                        `subtitlesFragment$onViewCreated$dismissCallback$1`,
                        view2
                    )
                }
            })
        (`_$_findCachedViewById`(C4761R.C4764id.subs_edge_type) as TextView?).setOnLongClickListener(
            object : OnLongClickListener() {
                // from class: com.lagradost.cloudstream3.ui.subtitles.-$$Lambda$SubtitlesFragment$faXLcZdrYNIE_CG0kEv1_wHHVbI
                @Override // android.view.View.OnLongClickListener
                fun onLongClick(view2: View?): Boolean {
                    val `m8972onViewCreated$lambda10`: Boolean
                    `m8972onViewCreated$lambda10` =
                        Companion.`m8972onViewCreated$lambda10`(this@SubtitlesFragment, view2)
                    return `m8972onViewCreated$lambda10`
                }
            })
        val subs_font_size: TextView? =
            `_$_findCachedViewById`(C4761R.C4764id.subs_font_size) as TextView?
        Intrinsics.checkNotNullExpressionValue(subs_font_size, "subs_font_size")
        subs_font_size.setFocusableInTouchMode(z)
        (`_$_findCachedViewById`(C4761R.C4764id.subs_font_size) as TextView?).setOnClickListener(
            object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.subtitles.-$$Lambda$SubtitlesFragment$vXst-0QHQwbZX2h0Zys1TdQeWJE
                @Override // android.view.View.OnClickListener
                fun onClick(view2: View?) {
                    Companion.`m8973onViewCreated$lambda13`(
                        this@SubtitlesFragment,
                        `subtitlesFragment$onViewCreated$dismissCallback$1`,
                        view2
                    )
                }
            })
        val switchMaterial: SwitchMaterial? =
            `_$_findCachedViewById`(C4761R.C4764id.subtitles_remove_bloat) as SwitchMaterial?
        if (switchMaterial != null) {
            var saveCaptionStyle2: SaveCaptionStyle? = state
            if (saveCaptionStyle2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
                saveCaptionStyle2 = null
            }
            switchMaterial.setChecked(saveCaptionStyle2.getRemoveBloat())
        }
        val switchMaterial2: SwitchMaterial? =
            `_$_findCachedViewById`(C4761R.C4764id.subtitles_remove_bloat) as SwitchMaterial?
        if (switchMaterial2 != null) {
            switchMaterial2.setOnCheckedChangeListener(object : OnCheckedChangeListener() {
                // from class: com.lagradost.cloudstream3.ui.subtitles.-$$Lambda$SubtitlesFragment$dDsFHRXBgYnd6rwhlfan9qIXqg8
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                fun onCheckedChanged(compoundButton: CompoundButton?, z2: Boolean) {
                    Companion.`m8974onViewCreated$lambda14`(
                        this@SubtitlesFragment,
                        compoundButton,
                        z2
                    )
                }
            })
        }
        val switchMaterial3: SwitchMaterial? =
            `_$_findCachedViewById`(C4761R.C4764id.subtitles_remove_captions) as SwitchMaterial?
        if (switchMaterial3 != null) {
            val saveCaptionStyle3: SaveCaptionStyle? = state
            if (saveCaptionStyle3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
            } else {
                saveCaptionStyle = saveCaptionStyle3
            }
            switchMaterial3.setChecked(saveCaptionStyle.getRemoveCaptions())
        }
        val switchMaterial4: SwitchMaterial? =
            `_$_findCachedViewById`(C4761R.C4764id.subtitles_remove_captions) as SwitchMaterial?
        if (switchMaterial4 != null) {
            switchMaterial4.setOnCheckedChangeListener(object : OnCheckedChangeListener() {
                // from class: com.lagradost.cloudstream3.ui.subtitles.-$$Lambda$SubtitlesFragment$rXhtkHUwRnOgPfCwCUtAKwW8ID0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                fun onCheckedChanged(compoundButton: CompoundButton?, z2: Boolean) {
                    Companion.`m8975onViewCreated$lambda15`(
                        this@SubtitlesFragment,
                        compoundButton,
                        z2
                    )
                }
            })
        }
        (`_$_findCachedViewById`(C4761R.C4764id.subs_font_size) as TextView?).setOnLongClickListener(
            object : OnLongClickListener() {
                // from class: com.lagradost.cloudstream3.ui.subtitles.-$$Lambda$SubtitlesFragment$lxBbwc4UTZTrx6ZrMyn0Zy11b6s
                @Override // android.view.View.OnLongClickListener
                fun onLongClick(view2: View?): Boolean {
                    val `m8976onViewCreated$lambda16`: Boolean
                    `m8976onViewCreated$lambda16` =
                        Companion.`m8976onViewCreated$lambda16`(this@SubtitlesFragment, view2)
                    return `m8976onViewCreated$lambda16`
                }
            })
        val subs_font: TextView? = `_$_findCachedViewById`(C4761R.C4764id.subs_font) as TextView?
        Intrinsics.checkNotNullExpressionValue(subs_font, "subs_font")
        subs_font.setFocusableInTouchMode(z)
        (`_$_findCachedViewById`(C4761R.C4764id.subs_font) as TextView?).setOnClickListener(object :
            OnClickListener() {
            // from class: com.lagradost.cloudstream3.ui.subtitles.-$$Lambda$SubtitlesFragment$oeicXb_Io4vVlv-xWIZIyEHhdyk
            @Override // android.view.View.OnClickListener
            fun onClick(view2: View?) {
                Companion.`m8977onViewCreated$lambda22`(
                    this@SubtitlesFragment,
                    `subtitlesFragment$onViewCreated$dismissCallback$1`,
                    view2
                )
            }
        })
        (`_$_findCachedViewById`(C4761R.C4764id.subs_font) as TextView?).setOnLongClickListener(
            object : OnLongClickListener() {
                // from class: com.lagradost.cloudstream3.ui.subtitles.-$$Lambda$SubtitlesFragment$6b5qO8ioC7QuSNb1uV44ak3msvE
                @Override // android.view.View.OnLongClickListener
                fun onLongClick(view2: View?): Boolean {
                    val `m8978onViewCreated$lambda23`: Boolean
                    `m8978onViewCreated$lambda23` =
                        Companion.`m8978onViewCreated$lambda23`(this@SubtitlesFragment, view2)
                    return `m8978onViewCreated$lambda23`
                }
            })
        val subs_auto_select_language: TextView? =
            `_$_findCachedViewById`(C4761R.C4764id.subs_auto_select_language) as TextView?
        Intrinsics.checkNotNullExpressionValue(
            subs_auto_select_language,
            "subs_auto_select_language"
        )
        subs_auto_select_language.setFocusableInTouchMode(z)
        (`_$_findCachedViewById`(C4761R.C4764id.subs_auto_select_language) as TextView?).setOnClickListener(
            object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.subtitles.-$$Lambda$SubtitlesFragment$DpNJzBG8dgARaHhlXN3DBdJpoRI
                @Override // android.view.View.OnClickListener
                fun onClick(view2: View?) {
                    Companion.`m8979onViewCreated$lambda26`(
                        this@SubtitlesFragment,
                        `subtitlesFragment$onViewCreated$dismissCallback$1`,
                        view2
                    )
                }
            })
        (`_$_findCachedViewById`(C4761R.C4764id.subs_auto_select_language) as TextView?).setOnLongClickListener(
            object : OnLongClickListener() {
                // from class: com.lagradost.cloudstream3.ui.subtitles.-$$Lambda$SubtitlesFragment$EpXhWf1SeIXjGUjaXC6ywFS79Ew
                @Override // android.view.View.OnLongClickListener
                fun onLongClick(view2: View?): Boolean {
                    val `m8980onViewCreated$lambda27`: Boolean
                    `m8980onViewCreated$lambda27` =
                        Companion.`m8980onViewCreated$lambda27`(this@SubtitlesFragment, view2)
                    return `m8980onViewCreated$lambda27`
                }
            })
        val subs_download_languages: TextView? =
            `_$_findCachedViewById`(C4761R.C4764id.subs_download_languages) as TextView?
        Intrinsics.checkNotNullExpressionValue(subs_download_languages, "subs_download_languages")
        subs_download_languages.setFocusableInTouchMode(z)
        (`_$_findCachedViewById`(C4761R.C4764id.subs_download_languages) as TextView?).setOnClickListener(
            object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.subtitles.-$$Lambda$SubtitlesFragment$uPk8cRhfjYIhBLDcM0lEDqe0HLI
                @Override // android.view.View.OnClickListener
                fun onClick(view2: View?) {
                    Companion.`m8981onViewCreated$lambda32`(
                        this@SubtitlesFragment,
                        `subtitlesFragment$onViewCreated$dismissCallback$1`,
                        view2
                    )
                }
            })
        (`_$_findCachedViewById`(C4761R.C4764id.subs_download_languages) as TextView?).setOnLongClickListener(
            object : OnLongClickListener() {
                // from class: com.lagradost.cloudstream3.ui.subtitles.-$$Lambda$SubtitlesFragment$ZVvC7PhycwROe6Hr11NDh1XaAzY
                @Override // android.view.View.OnLongClickListener
                fun onLongClick(view2: View?): Boolean {
                    val `m8982onViewCreated$lambda33`: Boolean
                    `m8982onViewCreated$lambda33` =
                        Companion.`m8982onViewCreated$lambda33`(this@SubtitlesFragment, view2)
                    return `m8982onViewCreated$lambda33`
                }
            })
        (`_$_findCachedViewById`(C4761R.C4764id.cancel_btt) as MaterialButton?).setOnClickListener(
            object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.subtitles.-$$Lambda$SubtitlesFragment$nTXOHT4Ge303EklqcbFL_R6PIiY
                @Override // android.view.View.OnClickListener
                fun onClick(view2: View?) {
                    Companion.`m8983onViewCreated$lambda34`(this@SubtitlesFragment, view2)
                }
            })
        (`_$_findCachedViewById`(C4761R.C4764id.apply_btt) as MaterialButton?).setOnClickListener(
            object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.subtitles.-$$Lambda$SubtitlesFragment$3aksB42Tb9sBAEGO-GviAF8DbhM
                @Override // android.view.View.OnClickListener
                fun onClick(view2: View?) {
                    Companion.`m8984onViewCreated$lambda35`(this@SubtitlesFragment, view2)
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
        private val applyStyleEvent: Event<SaveCaptionStyle> = Event()
        private fun `onViewCreated$setup`(
            view: View,
            z: Boolean,
            subtitlesFragment: SubtitlesFragment,
            i: Int
        ) {
            view.setFocusableInTouchMode(z)
            view.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.subtitles.-$$Lambda$SubtitlesFragment$VLGIvBNKJlqalLSxtOE7hMQ93l0
                @Override // android.view.View.OnClickListener
                fun onClick(view2: View?) {
                    SubtitlesFragment.Companion.`m8988onViewCreated$setup$lambda1`(
                        this@SubtitlesFragment,
                        i,
                        view2
                    )
                }
            })
            view.setOnLongClickListener(object : OnLongClickListener() {
                // from class: com.lagradost.cloudstream3.ui.subtitles.-$$Lambda$SubtitlesFragment$x67PIN9gEoOS1edDSgxDClXe0DA
                @Override // android.view.View.OnLongClickListener
                fun onLongClick(view2: View?): Boolean {
                    val `m8989onViewCreated$setup$lambda2`: Boolean
                    `m8989onViewCreated$setup$lambda2` =
                        SubtitlesFragment.Companion.`m8989onViewCreated$setup$lambda2`(
                            this@SubtitlesFragment,
                            i,
                            view2
                        )
                    return `m8989onViewCreated$setup$lambda2`
                }
            })
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$setup$lambda-1  reason: not valid java name */
        fun `m8988onViewCreated$setup$lambda1`(`this$0`: SubtitlesFragment, i: Int, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                ColorPickerDialog.newBuilder().setDialogId(i).setShowAlphaSlider(true)
                    .setColor(`this$0`.getColor(i)).show(activity)
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$setup$lambda-2  reason: not valid java name */
        fun `m8989onViewCreated$setup$lambda2`(
            `this$0`: SubtitlesFragment,
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
        fun `m8985onViewCreated$lambda5`(
            `this$0`: SubtitlesFragment,
            dismissCallback: Functions<*>?,
            view: View
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(dismissCallback, "\$dismissCallback")
            val listOf: List = CollectionsKt.listOf<Object>(
                *arrayOf<Tuples<*, *>>(
                    Tuples<Any?, Any?>(
                        0,
                        view.getContext().getString(R.string.none)
                    ),
                    Tuples<Any?, Any?>(10, "10dp"),
                    Tuples<Any?, Any?>(20, "20dp"),
                    Tuples<Any?, Any?>(30, "30dp"),
                    Tuples<Any?, Any?>(40, "40dp"),
                    Tuples<Any?, Any?>(50, "50dp"),
                    Tuples<Any?, Any?>(60, "60dp"),
                    Tuples<Any?, Any?>(70, "70dp"),
                    Tuples<Any?, Any?>(80, "80dp"),
                    Tuples<Any?, Any?>(90, "90dp"),
                    Tuples<Any?, Any?>(100, "100dp")
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
                var saveCaptionStyle: SaveCaptionStyle? = `this$0`.state
                if (saveCaptionStyle == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
                    saveCaptionStyle = null
                }
                val indexOf: Int =
                    arrayList4.indexOf(Integer.valueOf(saveCaptionStyle.getElevation()))
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
                    `SubtitlesFragment$onViewCreated$3$3`(`this$0`, listOf, view)
                )
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-6  reason: not valid java name */
        fun `m8986onViewCreated$lambda6`(`this$0`: SubtitlesFragment, view: View): Boolean {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            var saveCaptionStyle: SaveCaptionStyle? = `this$0`.state
            if (saveCaptionStyle == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
                saveCaptionStyle = null
            }
            saveCaptionStyle.setElevation(20)
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
        fun `m8987onViewCreated$lambda9`(
            `this$0`: SubtitlesFragment,
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
                var saveCaptionStyle: SaveCaptionStyle? = `this$0`.state
                if (saveCaptionStyle == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
                    saveCaptionStyle = null
                }
                val indexOf: Int =
                    arrayList4.indexOf(Integer.valueOf(saveCaptionStyle.getEdgeType()))
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
                    `SubtitlesFragment$onViewCreated$5$3`(`this$0`, listOf, view)
                )
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-10  reason: not valid java name */
        fun `m8972onViewCreated$lambda10`(`this$0`: SubtitlesFragment, view: View): Boolean {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            var saveCaptionStyle: SaveCaptionStyle? = `this$0`.state
            if (saveCaptionStyle == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
                saveCaptionStyle = null
            }
            saveCaptionStyle.setEdgeType(1)
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

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-13  reason: not valid java name */
        fun `m8973onViewCreated$lambda13`(
            `this$0`: SubtitlesFragment,
            dismissCallback: Functions<*>?,
            view: View
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(dismissCallback, "\$dismissCallback")
            var saveCaptionStyle: SaveCaptionStyle? = null
            val valueOf: Float = Float.valueOf(6.0f)
            val valueOf2: Float = Float.valueOf(7.0f)
            val valueOf3: Float = Float.valueOf(8.0f)
            val valueOf4: Float = Float.valueOf(9.0f)
            val valueOf5: Float = Float.valueOf(10.0f)
            val valueOf6: Float = Float.valueOf(11.0f)
            val valueOf7: Float = Float.valueOf(12.0f)
            val valueOf8: Float = Float.valueOf(13.0f)
            val valueOf9: Float = Float.valueOf(14.0f)
            val valueOf10: Float = Float.valueOf(15.0f)
            val valueOf11: Float = Float.valueOf(16.0f)
            val valueOf12: Float = Float.valueOf(17.0f)
            val valueOf13: Float = Float.valueOf(18.0f)
            val valueOf14: Float = Float.valueOf(19.0f)
            val valueOf15: Float = Float.valueOf(20.0f)
            val valueOf16: Float = Float.valueOf(21.0f)
            val valueOf17: Float = Float.valueOf(22.0f)
            val valueOf18: Float = Float.valueOf(23.0f)
            val valueOf19: Float = Float.valueOf(24.0f)
            val valueOf20: Float = Float.valueOf(25.0f)
            val valueOf21: Float = Float.valueOf(26.0f)
            val valueOf22: Float = Float.valueOf(28.0f)
            val valueOf23: Float = Float.valueOf(30.0f)
            val valueOf24: Float = Float.valueOf(32.0f)
            val valueOf25: Float = Float.valueOf(34.0f)
            val valueOf26: Float = Float.valueOf(36.0f)
            val valueOf27: Float = Float.valueOf(38.0f)
            val valueOf28: Float = Float.valueOf(40.0f)
            val valueOf29: Float = Float.valueOf(42.0f)
            val valueOf30: Float = Float.valueOf(44.0f)
            val valueOf31: Float = Float.valueOf(48.0f)
            val valueOf32: Float = Float.valueOf(60.0f)
            val listOf: List = CollectionsKt.listOf<Object>(
                *arrayOf<Tuples<*, *>>(
                    Tuples<Any?, Any?>(null, view.getContext().getString(R.string.normal)),
                    Tuples<Any?, Any?>(valueOf, "6sp"),
                    Tuples<Any?, Any?>(valueOf2, "7sp"),
                    Tuples<Any?, Any?>(valueOf3, "8sp"),
                    Tuples<Any?, Any?>(valueOf4, "9sp"),
                    Tuples<Any?, Any?>(valueOf5, "10sp"),
                    Tuples<Any?, Any?>(valueOf6, "11sp"),
                    Tuples<Any?, Any?>(valueOf7, "12sp"),
                    Tuples<Any?, Any?>(valueOf8, "13sp"),
                    Tuples<Any?, Any?>(valueOf9, "14sp"),
                    Tuples<Any?, Any?>(valueOf10, "15sp"),
                    Tuples<Any?, Any?>(valueOf11, "16sp"),
                    Tuples<Any?, Any?>(valueOf12, "17sp"),
                    Tuples<Any?, Any?>(valueOf13, "18sp"),
                    Tuples<Any?, Any?>(valueOf14, "19sp"),
                    Tuples<Any?, Any?>(valueOf15, "20sp"),
                    Tuples<Any?, Any?>(valueOf16, "21sp"),
                    Tuples<Any?, Any?>(valueOf17, "22sp"),
                    Tuples<Any?, Any?>(valueOf18, "23sp"),
                    Tuples<Any?, Any?>(valueOf19, "24sp"),
                    Tuples<Any?, Any?>(valueOf20, "25sp"),
                    Tuples<Any?, Any?>(valueOf21, "26sp"),
                    Tuples<Any?, Any?>(valueOf22, "28sp"),
                    Tuples<Any?, Any?>(valueOf23, "30sp"),
                    Tuples<Any?, Any?>(valueOf24, "32sp"),
                    Tuples<Any?, Any?>(valueOf25, "34sp"),
                    Tuples<Any?, Any?>(valueOf26, "36sp"),
                    Tuples<Any?, Any?>(valueOf27, "38sp"),
                    Tuples<Any?, Any?>(valueOf28, "40sp"),
                    Tuples<Any?, Any?>(valueOf29, RoomMasterTable.DEFAULT_ID.toString() + "sp"),
                    Tuples<Any?, Any?>(valueOf30, "44sp"),
                    Tuples<Any?, Any?>(valueOf31, "48sp"),
                    Tuples<Any?, Any?>(valueOf32, "60sp")
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
                    arrayList3.add(tuples2.getFirst() as Float?)
                }
                val arrayList4: ArrayList = arrayList3
                val saveCaptionStyle2: SaveCaptionStyle? = `this$0`.state
                if (saveCaptionStyle2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
                } else {
                    saveCaptionStyle = saveCaptionStyle2
                }
                val indexOf: Int = arrayList4.indexOf(saveCaptionStyle.getFixedTextSize())
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
                    `SubtitlesFragment$onViewCreated$7$3`(`this$0`, listOf)
                )
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-14  reason: not valid java name */
        fun `m8974onViewCreated$lambda14`(
            `this$0`: SubtitlesFragment,
            compoundButton: CompoundButton?,
            z: Boolean
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            var saveCaptionStyle: SaveCaptionStyle? = `this$0`.state
            if (saveCaptionStyle == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
                saveCaptionStyle = null
            }
            saveCaptionStyle.setRemoveBloat(z)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-15  reason: not valid java name */
        fun `m8975onViewCreated$lambda15`(
            `this$0`: SubtitlesFragment,
            compoundButton: CompoundButton?,
            z: Boolean
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            var saveCaptionStyle: SaveCaptionStyle? = `this$0`.state
            if (saveCaptionStyle == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
                saveCaptionStyle = null
            }
            saveCaptionStyle.setRemoveCaptions(z)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-16  reason: not valid java name */
        fun `m8976onViewCreated$lambda16`(`this$0`: SubtitlesFragment, view: View?): Boolean {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            var saveCaptionStyle: SaveCaptionStyle? = `this$0`.state
            if (saveCaptionStyle == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
                saveCaptionStyle = null
            }
            saveCaptionStyle.setFixedTextSize(null)
            CommonActivity.INSTANCE.showToast(
                `this$0`.getActivity(),
                R.string.subs_default_reset_toast,
                0
            )
            return true
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-22  reason: not valid java name */
        fun `m8977onViewCreated$lambda22`(
            `this$0`: SubtitlesFragment,
            dismissCallback: Functions<*>?,
            view: View
        ) {
            val size: Int
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(dismissCallback, "\$dismissCallback")
            var i: Int = 0
            val listOf: List = CollectionsKt.listOf<Object>(
                *arrayOf<Tuples<*, *>>(
                    Tuples<Any?, Any?>(null, view.getContext().getString(R.string.normal)),
                    Tuples<Any?, Any?>(Integer.valueOf(R.font.trebuchet_ms as Int), "Trebuchet MS"),
                    Tuples<Any?, Any?>(Integer.valueOf(R.font.netflix_sans as Int), "Netflix Sans"),
                    Tuples<Any?, Any?>(Integer.valueOf(R.font.google_sans as Int), "Google Sans"),
                    Tuples<Any?, Any?>(Integer.valueOf(R.font.open_sans as Int), "Open Sans"),
                    Tuples<Any?, Any?>(Integer.valueOf(R.font.futura as Int), "Futura"),
                    Tuples<Any?, Any?>(Integer.valueOf(R.font.consola as Int), "Consola"),
                    Tuples<Any?, Any?>(Integer.valueOf(R.font.gotham as Int), "Gotham"),
                    Tuples<Any?, Any?>(
                        Integer.valueOf(R.font.lucida_grande as Int),
                        "Lucida Grande"
                    ),
                    Tuples<Any?, Any?>(Integer.valueOf(R.font.stix_general as Int), "STIX General"),
                    Tuples<Any?, Any?>(
                        Integer.valueOf(R.font.times_new_roman as Int),
                        "Times New Roman"
                    ),
                    Tuples<Any?, Any?>(Integer.valueOf(R.font.verdana as Int), "Verdana"),
                    Tuples<Any?, Any?>(Integer.valueOf(R.font.ubuntu_regular as Int), "Ubuntu"),
                    Tuples<Any?, Any?>(Integer.valueOf(R.font.comic_sans as Int), "Comic Sans"),
                    Tuples<Any?, Any?>(Integer.valueOf(R.font.poppins_regular as Int), "Poppins")
                ) as Array<Object>
            )
            val companion: Companion = Companion
            val context: Context = view.getContext()
            Intrinsics.checkNotNullExpressionValue(context, "textView.context")
            val savedFonts: List = companion.getSavedFonts(context)
            val it: Iterator = savedFonts.iterator()
            var i2: Int = 0
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1
                    break
                }
                val absolutePath: String = (it.next() as File).getAbsolutePath()
                var saveCaptionStyle: SaveCaptionStyle? = `this$0`.state
                if (saveCaptionStyle == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
                    saveCaptionStyle = null
                }
                if (Intrinsics.areEqual(absolutePath, saveCaptionStyle.getTypefaceFilePath())) {
                    break
                }
                i2++
            }
            if (i2 == -1) {
                val it2: Iterator = listOf.iterator()
                while (true) {
                    if (!it2.hasNext()) {
                        size = -1
                        break
                    }
                    val first: Object = (it2.next() as Tuples<*, *>).getFirst()
                    var saveCaptionStyle2: SaveCaptionStyle? = `this$0`.state
                    if (saveCaptionStyle2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
                        saveCaptionStyle2 = null
                    }
                    if (Intrinsics.areEqual(first, saveCaptionStyle2!!.getTypeface())) {
                        size = i
                        break
                    }
                    i++
                }
            } else {
                size = i2 + listOf.size()
            }
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
                val list2: List<File> = savedFonts
                val arrayList3: ArrayList =
                    ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10))
                for (file: File in list2) {
                    arrayList3.add(file.getName())
                }
                val plus: List<String> =
                    CollectionsKt.plus(arrayList2 as Collection?, arrayList3 as Iterable?)
                Objects.requireNonNull(
                    view,
                    "null cannot be cast to non-null type android.widget.TextView"
                )
                singleSelectionHelper.showDialog(
                    fragmentActivity,
                    plus,
                    size,
                    (view as TextView).getText().toString(),
                    false,
                    dismissCallback,
                    `SubtitlesFragment$onViewCreated$11$3`(listOf, `this$0`, savedFonts, view)
                )
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-23  reason: not valid java name */
        fun `m8978onViewCreated$lambda23`(`this$0`: SubtitlesFragment, view: View): Boolean {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            var saveCaptionStyle: SaveCaptionStyle? = `this$0`.state
            if (saveCaptionStyle == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
                saveCaptionStyle = null
            }
            saveCaptionStyle!!.setTypeface(null)
            var saveCaptionStyle2: SaveCaptionStyle? = `this$0`.state
            if (saveCaptionStyle2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
                saveCaptionStyle2 = null
            }
            saveCaptionStyle2.setTypefaceFilePath(null)
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

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-26  reason: not valid java name */
        fun `m8979onViewCreated$lambda26`(
            `this$0`: SubtitlesFragment,
            dismissCallback: Functions<*>?,
            view: View
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(dismissCallback, "\$dismissCallback")
            val string: String = view.getContext().getString(R.string.none)
            Intrinsics.checkNotNullExpressionValue(
                string,
                "textView.context.getString(R.string.none)"
            )
            val string2: String = view.getContext().getString(R.string.none)
            Intrinsics.checkNotNullExpressionValue(
                string2,
                "textView.context.getString(R.string.none)"
            )
            val arrayListOf: ArrayList = CollectionsKt.arrayListOf<Language639>(
                Language639(
                    string,
                    string2,
                    "",
                    "",
                    "",
                    "",
                    ""
                )
            )
            arrayListOf.addAll(SubtitleHelper.INSTANCE.languages)
            val arrayList: ArrayList<Language639> = arrayListOf
            val arrayList2: ArrayList =
                ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10))
            for (language639: Language639 in arrayList) {
                arrayList2.add(language639.iSO_639_1)
            }
            val arrayList3: ArrayList = arrayList2
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                val singleSelectionHelper: SingleSelectionHelper = SingleSelectionHelper.INSTANCE
                val fragmentActivity: FragmentActivity = activity
                val arrayList4: ArrayList =
                    ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10))
                for (language6392: Language639 in arrayList) {
                    arrayList4.add(language6392.languageName)
                }
                val indexOf: Int =
                    arrayList3.indexOf(SubtitlesFragment.Companion.Companion.getAutoSelectLanguageISO639_1())
                Objects.requireNonNull(
                    view,
                    "null cannot be cast to non-null type android.widget.TextView"
                )
                singleSelectionHelper.showDialog(
                    fragmentActivity,
                    arrayList4,
                    indexOf,
                    (view as TextView).getText().toString(),
                    true,
                    dismissCallback,
                    `SubtitlesFragment$onViewCreated$13$2`(arrayList3)
                )
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-27  reason: not valid java name */
        fun `m8980onViewCreated$lambda27`(`this$0`: SubtitlesFragment, view: View?): Boolean {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            AcraApplication.Companion.setKey<Any>(
                SubtitlesFragmentKt.SUBTITLE_AUTO_SELECT_KEY,
                "vi"
            )
            CommonActivity.INSTANCE.showToast(
                `this$0`.getActivity(),
                R.string.subs_default_reset_toast,
                0
            )
            return true
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-32  reason: not valid java name */
        fun `m8981onViewCreated$lambda32`(
            `this$0`: SubtitlesFragment,
            dismissCallback: Functions<*>?,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(dismissCallback, "\$dismissCallback")
            val languages: List<Language639> = SubtitleHelper.INSTANCE.languages
            val arrayList: ArrayList =
                ArrayList(CollectionsKt.collectionSizeOrDefault(languages, 10))
            for (language639: Language639 in languages) {
                arrayList.add(language639.iSO_639_1)
            }
            val arrayList2: ArrayList = arrayList
            val downloadSubsLanguageISO639_1: List<String> =
                SubtitlesFragment.Companion.Companion.getDownloadSubsLanguageISO639_1()
            val arrayList3: ArrayList =
                ArrayList(CollectionsKt.collectionSizeOrDefault(downloadSubsLanguageISO639_1, 10))
            for (str: String? in downloadSubsLanguageISO639_1) {
                arrayList3.add(Integer.valueOf(arrayList2.indexOf(str)))
            }
            val arrayList4: ArrayList = ArrayList()
            for (obj: Object in arrayList3) {
                if ((obj as Number).intValue() >= 0) {
                    arrayList4.add(obj)
                }
            }
            val arrayList5: ArrayList = arrayList4
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                val singleSelectionHelper: SingleSelectionHelper = SingleSelectionHelper.INSTANCE
                val fragmentActivity: FragmentActivity = activity
                val arrayList6: ArrayList =
                    ArrayList(CollectionsKt.collectionSizeOrDefault(languages, 10))
                for (language6392: Language639 in languages) {
                    arrayList6.add(language6392.languageName)
                }
                Objects.requireNonNull(
                    view,
                    "null cannot be cast to non-null type android.widget.TextView"
                )
                singleSelectionHelper.showMultiDialog(
                    fragmentActivity,
                    arrayList6,
                    arrayList5,
                    (view as TextView).getText().toString(),
                    dismissCallback,
                    `SubtitlesFragment$onViewCreated$15$2`(arrayList2)
                )
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-33  reason: not valid java name */
        fun `m8982onViewCreated$lambda33`(`this$0`: SubtitlesFragment, view: View?): Boolean {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            AcraApplication.Companion.setKey(
                SubtitlesFragmentKt.SUBTITLE_DOWNLOAD_KEY,
                CollectionsKt.listOf("vi")
            )
            CommonActivity.INSTANCE.showToast(
                `this$0`.getActivity(),
                R.string.subs_default_reset_toast,
                0
            )
            return true
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-34  reason: not valid java name */
        fun `m8983onViewCreated$lambda34`(`this$0`: SubtitlesFragment, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                UIHelper.INSTANCE.popCurrentPage(activity)
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-35  reason: not valid java name */
        fun `m8984onViewCreated$lambda35`(`this$0`: SubtitlesFragment, view: View) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val companion: Companion = Companion
            val context: Context = view.getContext()
            Intrinsics.checkNotNullExpressionValue(context, "it.context")
            var saveCaptionStyle: SaveCaptionStyle? = `this$0`.state
            var saveCaptionStyle2: SaveCaptionStyle? = null
            if (saveCaptionStyle == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
                saveCaptionStyle = null
            }
            companion.saveStyle(context, saveCaptionStyle)
            val event: Event<SaveCaptionStyle?> = SubtitlesFragment.Companion.applyStyleEvent
            var saveCaptionStyle3: SaveCaptionStyle? = `this$0`.state
            if (saveCaptionStyle3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
                saveCaptionStyle3 = null
            }
            event.invoke(saveCaptionStyle3)
            val context2: Context = view.getContext()
            Intrinsics.checkNotNullExpressionValue(context2, "it.context")
            val saveCaptionStyle4: SaveCaptionStyle? = `this$0`.state
            if (saveCaptionStyle4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
            } else {
                saveCaptionStyle2 = saveCaptionStyle4
            }
            companion.fromSaveToStyle(context2, saveCaptionStyle2)
            val activity: FragmentActivity? = `this$0`.getActivity()
            if (activity != null) {
                UIHelper.INSTANCE.popCurrentPage(activity)
            }
        }
    }
}