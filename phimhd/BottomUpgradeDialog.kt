package com.phimhd

import android.app.Dialog
import kotlin.jvm.internal.Intrinsics

/* compiled from: BottomUpgradeDialog.kt */
@Metadata(
    m108d1 = ["\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u001b\u001a\u00020\u000bH\u0016J\u0006\u0010\u001c\u001a\u00020\u000bJ\u0006\u0010\u001d\u001a\u00020\u000bJ\u000e\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0016J\u001a\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0017J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\""],
    m107d2 = ["Lcom/phimhd/BottomUpgradeDialog;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "iCallback", "Lcom/lagradost/cloudstream3/ui/browser/ICallback;", "", "getICallback", "()Lcom/lagradost/cloudstream3/ui/browser/ICallback;", "setICallback", "(Lcom/lagradost/cloudstream3/ui/browser/ICallback;)V", "crosslineTextView", "", "tv", "Landroid/widget/TextView;", "onAttach", "context", "Landroid/content/Context;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onDetach", "onViewBackClicked", "onViewClicked", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "removecrosslineTextView", "Companion", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class BottomUpgradeDialog : BottomSheetDialogFragment() {
    var `_$_findViewCache`: Map<Integer, View> = LinkedHashMap()
    private var iCallback: ICallback<String>? = null
    fun `_$_clearFindViewByIdCache`() {
        `_$_findViewCache`.clear()
    }

    fun `_$_findCachedViewById`(i: Int): View? {
        var findViewById: View?
        val map: Map<Integer, View> = `_$_findViewCache`
        val view: View? = map[Integer.valueOf(i)]
        if (view == null) {
            val view2: View = getView()
            if (view2 == null || view2.findViewById(i).also { findViewById = it } == null) {
                return null
            }
            map.put(Integer.valueOf(i), findViewById)
            return findViewById
        }
        return view
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    /* synthetic */  override fun onDestroyView() {
        super.onDestroyView()
        `_$_clearFindViewByIdCache`()
    }

    fun getICallback(): ICallback<String> {
        return iCallback
    }

    fun setICallback(iCallback: ICallback<String?>) {
        this.iCallback = iCallback
    }

    /* compiled from: BottomUpgradeDialog.kt */
    @Metadata(
        m108d1 = ["\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\u0005"],
        m107d2 = ["Lcom/phimhd/BottomUpgradeDialog\$Companion;", "", "()V", "newInstance", "Lcom/phimhd/BottomUpgradeDialog;", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        fun newInstance(): BottomUpgradeDialog {
            val bundle = Bundle()
            val bottomUpgradeDialog = BottomUpgradeDialog()
            bottomUpgradeDialog.setArguments(bundle)
            return bottomUpgradeDialog
        }
    }

    @Override // androidx.fragment.app.Fragment
    override fun onCreateView(
        inflater: LayoutInflater,
        viewGroup: ViewGroup,
        bundle: Bundle
    ): View {
        Intrinsics.checkNotNullParameter(inflater, "inflater")
        return inflater.inflate(R.layout.dialog_upgrade_layout, viewGroup, false)
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    override fun onCreateDialog(bundle: Bundle): Dialog {
        val bottomSheetDialog: BottomSheetDialog = super.onCreateDialog(bundle) as BottomSheetDialog
        bottomSheetDialog.setOnShowListener(
            `$$Lambda$BottomUpgradeDialog$Reen6GEwZ9ReCZRxtog0ixylHw`.Companion.INSTANCE
        )
        return bottomSheetDialog
    }

    @Override // androidx.fragment.app.Fragment
    override fun onViewCreated(view: View, bundle: Bundle) {
        var config: Config
        Intrinsics.checkNotNullParameter(view, "view")
        super.onViewCreated(view, bundle)
        (`_$_findCachedViewById`(C4761R.C4764id.viewpager) as ViewPager?).setClipToPadding(false)
        (`_$_findCachedViewById`(C4761R.C4764id.viewpager) as ViewPager?).setPageMargin(12)
        (`_$_findCachedViewById`(C4761R.C4764id.viewpager) as ViewPager?).setAdapter(
            AdapterUpgradeItem()
        )
        (`_$_findCachedViewById`(C4761R.C4764id.viewpager) as ViewPager?).addOnPageChangeListener(
            object : OnPageChangeListener {
                // from class: com.phimhd.BottomUpgradeDialog$onViewCreated$1
                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                override fun onPageScrollStateChanged(i: Int) {
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                override fun onPageScrolled(i: Int, f: Float, i2: Int) {
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                override fun onPageSelected(i: Int) {
                    if (i == 1) {
                        (`_$_findCachedViewById`(C4761R.C4764id.tvQuality) as TextView?).setText(
                            this@BottomUpgradeDialog.getString(R.string.ben_quality)
                        )
                        val bottomUpgradeDialog = this@BottomUpgradeDialog
                        val tvAds: TextView? =
                            bottomUpgradeDialog.`_$_findCachedViewById`(C4761R.C4764id.tvAds) as TextView?
                        Intrinsics.checkNotNullExpressionValue(tvAds, "tvAds")
                        bottomUpgradeDialog.removecrosslineTextView(tvAds)
                        val bottomUpgradeDialog2 = this@BottomUpgradeDialog
                        val tvSupport: TextView? =
                            bottomUpgradeDialog2.`_$_findCachedViewById`(C4761R.C4764id.tvSupport) as TextView?
                        Intrinsics.checkNotNullExpressionValue(tvSupport, "tvSupport")
                        bottomUpgradeDialog2.crosslineTextView(tvSupport)
                        val bottomUpgradeDialog3 = this@BottomUpgradeDialog
                        val tvDownload: TextView? =
                            bottomUpgradeDialog3.`_$_findCachedViewById`(C4761R.C4764id.tvDownload) as TextView?
                        Intrinsics.checkNotNullExpressionValue(tvDownload, "tvDownload")
                        bottomUpgradeDialog3.crosslineTextView(tvDownload)
                        (`_$_findCachedViewById`(C4761R.C4764id.textView15) as TextView?).setText(
                            this@BottomUpgradeDialog.getString(R.string.premium_plan)
                        )
                        val context: Context = this@BottomUpgradeDialog.getContext()
                        Intrinsics.checkNotNull(context)
                        (`_$_findCachedViewById`(C4761R.C4764id.tvAds) as TextView?).setTextColor(
                            ContextCompat.getColor(context, R.color.background_color)
                        )
                        val context2: Context = this@BottomUpgradeDialog.getContext()
                        Intrinsics.checkNotNull(context2)
                        (`_$_findCachedViewById`(C4761R.C4764id.tvSupport) as TextView?).setTextColor(
                            ContextCompat.getColor(context2, R.color.gray_light)
                        )
                        val context3: Context = this@BottomUpgradeDialog.getContext()
                        Intrinsics.checkNotNull(context3)
                        (`_$_findCachedViewById`(C4761R.C4764id.tvDownload) as TextView?).setTextColor(
                            ContextCompat.getColor(context3, R.color.gray_light)
                        )
                    } else if (i == 2) {
                        (`_$_findCachedViewById`(C4761R.C4764id.tvQuality) as TextView?).setText(
                            this@BottomUpgradeDialog.getString(R.string.ben_quality)
                        )
                        (`_$_findCachedViewById`(C4761R.C4764id.textView15) as TextView?).setText(
                            this@BottomUpgradeDialog.getString(R.string.unlimited_plan)
                        )
                        val bottomUpgradeDialog4 = this@BottomUpgradeDialog
                        val tvAds2: TextView? =
                            bottomUpgradeDialog4.`_$_findCachedViewById`(C4761R.C4764id.tvAds) as TextView?
                        Intrinsics.checkNotNullExpressionValue(tvAds2, "tvAds")
                        bottomUpgradeDialog4.removecrosslineTextView(tvAds2)
                        val bottomUpgradeDialog5 = this@BottomUpgradeDialog
                        val tvDownload2: TextView? =
                            bottomUpgradeDialog5.`_$_findCachedViewById`(C4761R.C4764id.tvDownload) as TextView?
                        Intrinsics.checkNotNullExpressionValue(tvDownload2, "tvDownload")
                        bottomUpgradeDialog5.removecrosslineTextView(tvDownload2)
                        val bottomUpgradeDialog6 = this@BottomUpgradeDialog
                        val tvSupport2: TextView? =
                            bottomUpgradeDialog6.`_$_findCachedViewById`(C4761R.C4764id.tvSupport) as TextView?
                        Intrinsics.checkNotNullExpressionValue(tvSupport2, "tvSupport")
                        bottomUpgradeDialog6.removecrosslineTextView(tvSupport2)
                        val context4: Context = this@BottomUpgradeDialog.getContext()
                        Intrinsics.checkNotNull(context4)
                        (`_$_findCachedViewById`(C4761R.C4764id.tvSupport) as TextView?).setTextColor(
                            ContextCompat.getColor(context4, R.color.background_color)
                        )
                        val context5: Context = this@BottomUpgradeDialog.getContext()
                        Intrinsics.checkNotNull(context5)
                        (`_$_findCachedViewById`(C4761R.C4764id.tvAds) as TextView?).setTextColor(
                            ContextCompat.getColor(context5, R.color.background_color)
                        )
                        val context6: Context = this@BottomUpgradeDialog.getContext()
                        Intrinsics.checkNotNull(context6)
                        (`_$_findCachedViewById`(C4761R.C4764id.tvDownload) as TextView?).setTextColor(
                            ContextCompat.getColor(context6, R.color.background_color)
                        )
                    } else {
                        (`_$_findCachedViewById`(C4761R.C4764id.tvQuality) as TextView?).setText(
                            this@BottomUpgradeDialog.getString(R.string.ben_quality)
                        )
                        (`_$_findCachedViewById`(C4761R.C4764id.textView15) as TextView?).setText(
                            this@BottomUpgradeDialog.getString(R.string.standard_plan)
                        )
                        val bottomUpgradeDialog7 = this@BottomUpgradeDialog
                        val tvAds3: TextView? =
                            bottomUpgradeDialog7.`_$_findCachedViewById`(C4761R.C4764id.tvAds) as TextView?
                        Intrinsics.checkNotNullExpressionValue(tvAds3, "tvAds")
                        bottomUpgradeDialog7.crosslineTextView(tvAds3)
                        val bottomUpgradeDialog8 = this@BottomUpgradeDialog
                        val tvDownload3: TextView? =
                            bottomUpgradeDialog8.`_$_findCachedViewById`(C4761R.C4764id.tvDownload) as TextView?
                        Intrinsics.checkNotNullExpressionValue(tvDownload3, "tvDownload")
                        bottomUpgradeDialog8.crosslineTextView(tvDownload3)
                        val bottomUpgradeDialog9 = this@BottomUpgradeDialog
                        val tvSupport3: TextView? =
                            bottomUpgradeDialog9.`_$_findCachedViewById`(C4761R.C4764id.tvSupport) as TextView?
                        Intrinsics.checkNotNullExpressionValue(tvSupport3, "tvSupport")
                        bottomUpgradeDialog9.crosslineTextView(tvSupport3)
                        val context7: Context = this@BottomUpgradeDialog.getContext()
                        Intrinsics.checkNotNull(context7)
                        (`_$_findCachedViewById`(C4761R.C4764id.tvAds) as TextView?).setTextColor(
                            ContextCompat.getColor(context7, R.color.gray_light)
                        )
                        val context8: Context = this@BottomUpgradeDialog.getContext()
                        Intrinsics.checkNotNull(context8)
                        (`_$_findCachedViewById`(C4761R.C4764id.tvSupport) as TextView?).setTextColor(
                            ContextCompat.getColor(context8, R.color.gray_light)
                        )
                        val context9: Context = this@BottomUpgradeDialog.getContext()
                        Intrinsics.checkNotNull(context9)
                        (`_$_findCachedViewById`(C4761R.C4764id.tvDownload) as TextView?).setTextColor(
                            ContextCompat.getColor(context9, R.color.gray_light)
                        )
                    }
                }
            })
        val objArr: Array<Object?> = arrayOfNulls<Object?>(1)
        val companion: AppController = AppController.Companion.Companion.getInstance()
        objArr[0] = if (companion == null || companion.config.also {
                config = it
            } == null) null else config.phone
        val string: String = getString(R.string.step_1, *objArr)
        Intrinsics.checkNotNullExpressionValue(
            string,
            "getString(R.string.step_….instance?.config?.phone)"
        )
        val string2: String = getString(R.string.step_2)
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.step_2)")
        val string3: String = getString(R.string.step_3)
        Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.step_3)")
        val string4: String = getString(R.string.contact_us)
        Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.contact_us)")
        if (Build.VERSION.SDK_INT >= 24) {
            (`_$_findCachedViewById`(C4761R.C4764id.tvStep1) as TextView?).setText(
                Html.fromHtml(
                    string,
                    63
                )
            )
            (`_$_findCachedViewById`(C4761R.C4764id.tvStep2) as TextView?).setText(
                Html.fromHtml(
                    string2,
                    63
                )
            )
            (`_$_findCachedViewById`(C4761R.C4764id.textView24) as TextView?).setText(
                Html.fromHtml(
                    string3,
                    63
                )
            )
            (`_$_findCachedViewById`(C4761R.C4764id.tvContact) as TextView?).setText(
                Html.fromHtml(
                    string4,
                    63
                )
            )
        } else {
            (`_$_findCachedViewById`(C4761R.C4764id.tvStep1) as TextView?).setText(
                Html.fromHtml(
                    string
                )
            )
            (`_$_findCachedViewById`(C4761R.C4764id.tvStep1) as TextView?).setText(
                Html.fromHtml(
                    string2
                )
            )
            (`_$_findCachedViewById`(C4761R.C4764id.textView24) as TextView?).setText(
                Html.fromHtml(
                    string3
                )
            )
            (`_$_findCachedViewById`(C4761R.C4764id.tvContact) as TextView?).setText(
                Html.fromHtml(
                    string4
                )
            )
        }
        (`_$_findCachedViewById`(C4761R.C4764id.viewpager) as ViewPager?).setCurrentItem(1)
        val companion2: AppController = AppController.Companion.Companion.getInstance()
        val config2 = if (companion2 != null) companion2.config else null
        if (config2 != null) {
            if (config2.isShowUpgradeMethod) {
                (`_$_findCachedViewById`(C4761R.C4764id.groupVisible) as Group?).setVisibility(0)
            } else {
                (`_$_findCachedViewById`(C4761R.C4764id.groupVisible) as Group?).setVisibility(8)
            }
        }
        (`_$_findCachedViewById`(C4761R.C4764id.upgradeBtn) as MaterialButton?).setOnClickListener(
            object : OnClickListener() {
                // from class: com.phimhd.-$$Lambda$BottomUpgradeDialog$yAqfGIomTVTcJgyVjJT4W3AVztU
                @Override // android.view.View.OnClickListener
                fun onClick(view2: View?) {
                    BottomUpgradeDialog.Companion.`m9058onViewCreated$lambda1`(
                        this@BottomUpgradeDialog,
                        view2
                    )
                }
            })
        (`_$_findCachedViewById`(C4761R.C4764id.imgBack) as ImageView?).setOnClickListener(object :
            OnClickListener() {
            // from class: com.phimhd.-$$Lambda$BottomUpgradeDialog$Yq7RJuujsTYWHqLqblYsGgC10Qk
            @Override // android.view.View.OnClickListener
            fun onClick(view2: View?) {
                BottomUpgradeDialog.Companion.`m9059onViewCreated$lambda2`(
                    this@BottomUpgradeDialog,
                    view2
                )
            }
        })
        (`_$_findCachedViewById`(C4761R.C4764id.button) as MaterialButton?).setOnClickListener(
            object : OnClickListener() {
                // from class: com.phimhd.-$$Lambda$BottomUpgradeDialog$frm0fGuGWELdq_HaTweFwSliZL0
                @Override // android.view.View.OnClickListener
                fun onClick(view2: View?) {
                    BottomUpgradeDialog.Companion.`m9060onViewCreated$lambda3`(
                        this@BottomUpgradeDialog,
                        view2
                    )
                }
            })
        (`_$_findCachedViewById`(C4761R.C4764id.tvContact) as TextView?).setOnClickListener(object :
            OnClickListener() {
            // from class: com.phimhd.-$$Lambda$BottomUpgradeDialog$k_IdvJLGeOQuAqnOawgxV2ghxQg
            @Override // android.view.View.OnClickListener
            fun onClick(view2: View?) {
                BottomUpgradeDialog.Companion.`m9061onViewCreated$lambda4`(
                    this@BottomUpgradeDialog,
                    view2
                )
            }
        })
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun crosslineTextView(textView: TextView?) {
        textView.setPaintFlags(textView.getPaintFlags() or 16)
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun removecrosslineTextView(textView: TextView?) {
        textView.setPaintFlags(textView.getPaintFlags() and -17)
    }

    fun onViewClicked() {
        val objectRef: ObjectRef<*> = ObjectRef<Any?>()
        objectRef.element = Constants.URL_RECEIVE
        val string: String = getString(R.string.pay_with_momo)
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.pay_with_momo)")
        val string2: String = getString(R.string.pay_with_paypal)
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.pay_with_paypal)")
        val arrayListOf: ArrayList = CollectionsKt.arrayListOf<Any>(string, string2)
        val activity: FragmentActivity = getActivity()
        if (activity != null) {
            val string3: String = getString(R.string.select_payment_method)
            Intrinsics.checkNotNullExpressionValue(
                string3,
                "getString(R.string.select_payment_method)"
            )
            SingleSelectionHelper.INSTANCE.showDialog(
                activity,
                arrayListOf,
                0,
                string3,
                true,
                `BottomUpgradeDialog$onViewClicked$1`.Companion.INSTANCE,
                `BottomUpgradeDialog$onViewClicked$2`(objectRef, this)
            )
        }
    }

    fun onViewBackClicked() {
        dismiss()
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    override fun onAttach(context: Context) {
        Intrinsics.checkNotNullParameter(context, "context")
        super.onAttach(context)
        if (context is ICallback<*>) {
            iCallback = context as ICallback<*>
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    override fun onDetach() {
        super.onDetach()
        iCallback = null
    }

    fun onViewClicked(view: View) {
        Intrinsics.checkNotNullParameter(view, "view")
        val id: Int = view.getId()
        if (id != R.id.button) {
            if (id != R.id.tvContact) {
                return
            }
            val intent = Intent("android.intent.action.VIEW")
            intent.setData(Uri.parse(Constants.URL_PAGE))
            startActivity(intent)
            return
        }
        UIHelper.INSTANCE.hideKeyboard(this)
        if (iCallback != null) {
            if ((`_$_findCachedViewById`(C4761R.C4764id.editTextTextEmailAddress) as EditText?).getText()
                    .toString().length() === 0
            ) {
                Toast.makeText(getContext(), getString(R.string.please_fill_key), 0).show()
            } else {
                val iCallback: ICallback<String> = iCallback
                Intrinsics.checkNotNull(iCallback)
                iCallback.onCallback(
                    (`_$_findCachedViewById`(C4761R.C4764id.editTextTextEmailAddress) as EditText?).getText()
                        .toString()
                )
            }
        }
        dismiss()
    }

    companion object {
        val Companion = Companion(null)

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onCreateDialog$lambda-0  reason: not valid java name */
        fun `m9057onCreateDialog$lambda0`(dialog: DialogInterface) {
            Intrinsics.checkNotNullParameter(dialog, "dialog")
            val findViewById: View =
                (dialog as BottomSheetDialog).findViewById<View>(R.id.design_bottom_sheet)
            Objects.requireNonNull(
                findViewById,
                "null cannot be cast to non-null type android.view.View"
            )
            val from: BottomSheetBehavior<*> = BottomSheetBehavior.from<View>(findViewById)
            Intrinsics.checkNotNullExpressionValue(from, "from(bottomSheet)")
            from.setPeekHeight(Resources.getSystem().getDisplayMetrics().heightPixels)
            from.setState(3)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
        fun `m9058onViewCreated$lambda1`(`this$0`: BottomUpgradeDialog, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            `this$0`.onViewClicked()
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-2  reason: not valid java name */
        fun `m9059onViewCreated$lambda2`(`this$0`: BottomUpgradeDialog, view: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            `this$0`.onViewBackClicked()
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-3  reason: not valid java name */
        fun `m9060onViewCreated$lambda3`(`this$0`: BottomUpgradeDialog, it: View) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullExpressionValue(it, "it")
            `this$0`.onViewClicked(it)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: onViewCreated$lambda-4  reason: not valid java name */
        fun `m9061onViewCreated$lambda4`(`this$0`: BottomUpgradeDialog, it: View) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullExpressionValue(it, "it")
            `this$0`.onViewClicked(it)
        }
    }
}