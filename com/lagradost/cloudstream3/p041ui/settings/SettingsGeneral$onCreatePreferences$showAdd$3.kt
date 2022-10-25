package com.lagradost.cloudstream3.p041ui.settings

import android.content.Context
import com.lagradost.cloudstream3.AcraApplication
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: SettingsGeneral.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
    m107d2 = ["<anonymous>", "", "selection", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.settings.SettingsGeneral$onCreatePreferences$showAdd$3 */ /* loaded from: classes4.dex */
class `SettingsGeneral$onCreatePreferences$showAdd$3` constructor(
    list: List<MainAPI>,
    settingsGeneral: SettingsGeneral
) : Lambda<Any?>(1), Function1<Integer, Unit> {
    /* synthetic */ val `$providers`: List<MainAPI>
    /* synthetic */ val `this$0`: SettingsGeneral

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$providers` = list
        `this$0` = settingsGeneral
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(num: Integer) {
        invoke(num.intValue())
        return Unit.INSTANCE
    }

    override fun invoke(i: Int) {
        var context: Context?
        val mainAPI: MainAPI? = CollectionsKt.getOrNull<Any>(`$providers`, i) as MainAPI?
        if (mainAPI == null || (`this$0`.getContext().also({ context = it })) == null) {
            return
        }
        val create: AlertDialog =
            AlertDialog.Builder(context, R.style.AlertDialogCustom).setView(R.layout.add_site_input)
                .create()
        Intrinsics.checkNotNullExpressionValue(create, "builder.create()")
        create.show()
        val textView: TextView? = create.findViewById<View>(C4761R.C4764id.text2) as TextView?
        if (textView != null) {
            textView.setText(mainAPI.name)
        }
        val materialButton: MaterialButton? =
            create.findViewById<View>(C4761R.C4764id.apply_btt) as MaterialButton?
        if (materialButton != null) {
            val settingsGeneral: SettingsGeneral = `this$0`
            materialButton.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.settings.-$$Lambda$SettingsGeneral$onCreatePreferences$showAdd$3$qVcT7F9BQQ8FJacbrFfGZq8niPY
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    `m8916invoke$lambda0`(this@AlertDialog, mainAPI, settingsGeneral, view)
                }
            })
        }
        val materialButton2: MaterialButton? =
            create.findViewById<View>(C4761R.C4764id.cancel_btt) as MaterialButton?
        if (materialButton2 != null) {
            val settingsGeneral2: SettingsGeneral = `this$0`
            materialButton2.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.ui.settings.-$$Lambda$SettingsGeneral$onCreatePreferences$showAdd$3$l1ZM5Kcttqg7WKxMna1r5ManP4w
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    `m8917invoke$lambda1`(this@AlertDialog, settingsGeneral2, view)
                }
            })
        }
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: invoke$lambda-0  reason: not valid java name */
        fun `m8916invoke$lambda0`(
            dialog: AlertDialog,
            provider: MainAPI?,
            `this$0`: SettingsGeneral,
            view: View?
        ) {
            val `onCreatePreferences$getCurrent`: List
            var text: Editable
            var text2: Editable
            var text3: Editable
            Intrinsics.checkNotNullParameter(dialog, "\$dialog")
            Intrinsics.checkNotNullParameter(provider, "\$provider")
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            val editText: EditText? =
                dialog.findViewById<View>(C4761R.C4764id.site_name_input) as EditText?
            var str: String? = null
            val obj: String? = if ((editText == null || (editText.getText()
                    .also({ text3 = it })) == null)
            ) null else text3.toString()
            val editText2: EditText? =
                dialog.findViewById<View>(C4761R.C4764id.site_url_input) as EditText?
            val obj2: String? = if ((editText2 == null || (editText2.getText()
                    .also({ text2 = it })) == null)
            ) null else text2.toString()
            val editText3: EditText? =
                dialog.findViewById<View>(C4761R.C4764id.site_lang_input) as EditText?
            if (editText3 != null && (editText3.getText().also({ text = it })) != null) {
                str = text.toString()
            }
            val str2: String? = str
            var z: Boolean = true
            if (str2 == null || StringsKt.isBlank(str2)) {
                str = provider.getLang()
            }
            val str3: String? = obj2
            if (!(str3 == null || StringsKt.isBlank(str3))) {
                val str4: String? = obj
                if (str4 != null && !StringsKt.isBlank(str4)) {
                    z = false
                }
                if (!z && str!!.length() === 2) {
                    `onCreatePreferences$getCurrent` =
                        SettingsGeneral.Companion.`onCreatePreferences$getCurrent`()
                    val simpleName: String = provider.getClass().getSimpleName()
                    Intrinsics.checkNotNullExpressionValue(
                        simpleName,
                        "provider.javaClass.simpleName"
                    )
                    `onCreatePreferences$getCurrent`.add(CustomSite(simpleName, obj, obj2, str))
                    val companion: AcraApplication.Companion = AcraApplication.Companion
                    val array: Array<Object> =
                        `onCreatePreferences$getCurrent`.toArray(arrayOfNulls<CustomSite>(0))
                    Objects.requireNonNull(
                        array,
                        "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
                    )
                    companion.setKey(DataStoreKt.USER_PROVIDER_API, array)
                    UIHelper.INSTANCE.dismissSafe(dialog, `this$0`.getActivity())
                    return
                }
            }
            CommonActivity.INSTANCE.showToast(
                `this$0`.getActivity(),
                R.string.error_invalid_data,
                0
            )
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: invoke$lambda-1  reason: not valid java name */
        fun `m8917invoke$lambda1`(dialog: AlertDialog?, `this$0`: SettingsGeneral, view: View?) {
            Intrinsics.checkNotNullParameter(dialog, "\$dialog")
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            UIHelper.INSTANCE.dismissSafe(dialog, `this$0`.getActivity())
        }
    }
}