package com.lagradost.cloudstream3.utils

import android.app.Activity
import kotlin.jvm.functions.Functions
import kotlin.jvm.internal.Intrinsics

/* compiled from: SingleSelectionHelper.kt */
@Metadata(
    m108d1 = ["\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JT\u0010\u0003\u001a\u00020\u0004*\u0004\u0018\u00010\u00052\u000c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u000c\u001a\u00020\r2\u000c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0011Jp\u0010\u0012\u001a\u00020\u0004*\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u000c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0004\u0012\u00020\u00040\u00112\u000c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fJT\u0010\u0012\u001a\u00020\u0004*\u0004\u0018\u00010\u00052\u000c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u000c\u001a\u00020\r2\u000c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0011JW\u0010\u0016\u001a\u00020\u0004*\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00112\u000c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0002¢\u0006\u0002\u0010\u0019JX\u0010\u001a\u001a\u00020\u0004*\u0004\u0018\u00010\u00052\u000c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u000b\u001a\u00020\b2\u000c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0004\u0012\u00020\u00040\u0011JK\u0010\u001b\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\n2\u000c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0002\u0010\u001cJ^\u0010\u001d\u001a\u00020\u0004*\u0004\u0018\u00010\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\b2\u000c\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u001e\u0010\u0010\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0#\u0012\u0004\u0012\u00020\u00040\u0011H\u0002J^\u0010$\u001a\u00020\u0004*\u0004\u0018\u00010\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\b2\u000c\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u001e\u0010\u0010\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0#\u0012\u0004\u0012\u00020\u00040\u0011¨\u0006%"],
    m107d2 = ["Lcom/lagradost/cloudstream3/utils/SingleSelectionHelper;", "", "()V", "showBottomDialog", "", "Landroid/app/Activity;", FirebaseAnalytics.Param.ITEMS, "", "", "selectedIndex", "", "name", "showApply", "", "dismissCallback", "Lkotlin/Function0;", "callback", "Lkotlin/Function1;", "showDialog", "dialog", "Landroid/app/Dialog;", "isMultiSelect", "showInputDialog", "value", "textInputType", "(Landroid/app/Activity;Landroid/app/Dialog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "showMultiDialog", "showNginxTextInputDialog", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "showOptionSelect", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "poster", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "tvOptions", "Lkotlin/Pair;", "showOptionSelectStringRes", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class SingleSelectionHelper private constructor() {
    fun showOptionSelectStringRes(
        activity: Activity?,
        view: View?,
        str: String,
        options: List<Integer>,
        tvOptions: List<Integer>,
        callback: Function1<Tuples<Boolean?, Integer?>?, Unit>
    ) {
        Intrinsics.checkNotNullParameter(options, "options")
        Intrinsics.checkNotNullParameter(tvOptions, "tvOptions")
        Intrinsics.checkNotNullParameter(callback, "callback")
        if (activity == null) {
            return
        }
        val list: List<Integer> = options
        val arrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10))
        for (number in list) {
            val string: String = activity.getString(number.intValue())
            Intrinsics.checkNotNullExpressionValue(string, "this.getString(it)")
            arrayList.add(string)
        }
        val arrayList2: ArrayList = arrayList
        val list2: List<Integer> = tvOptions
        val arrayList3 = ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10))
        for (number2 in list2) {
            val string2: String = activity.getString(number2.intValue())
            Intrinsics.checkNotNullExpressionValue(string2, "this.getString(it)")
            arrayList3.add(string2)
        }
        showOptionSelect(activity, view, str, arrayList2, arrayList3, callback)
    }

    private fun showOptionSelect(
        activity: Activity?,
        view: View?,
        str: String,
        list: List<String>,
        list2: List<String>,
        function1: Function1<Tuples<Boolean?, Integer?>?, Unit>
    ) {
        if (activity == null) {
            return
        }
        val activity2: Activity = activity
        if (!SettingsFragment.Companion.isTvSettings(activity2)) {
            if (view != null) {
                val uIHelper: UIHelper = UIHelper.Companion.INSTANCE
                val arrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10))
                for (obj in list) {
                    val i: Int = r5 + 1
                    if (r5 < 0) {
                        CollectionsKt.throwIndexOverflow()
                    }
                    arrayList.add(
                        Tuples<Any?, Any?>(
                            Integer.valueOf(r5),
                            obj
                        )
                    )
                    r5 = i
                }
                uIHelper.popupMenuNoIconsAndNoStringRes(
                    view,
                    arrayList,
                    `SingleSelectionHelper$showOptionSelect$4`(function1)
                )
                return
            }
            return
        }
        val create: AlertDialog = AlertDialog.Builder(activity2, R.style.AlertDialogCustom)
            .setView(R.layout.options_popup_tv).create()
        Intrinsics.checkNotNullExpressionValue(create, "builder.create()")
        create.show()
        val listView: ListView = create.findViewById<View>(R.id.listview1) as ListView
        var z = true
        if (listView != null) {
            listView.setChoiceMode(1)
            val arrayAdapter = ArrayAdapter(activity2, R.layout.sort_bottom_single_choice_color)
            arrayAdapter.addAll(list2)
            listView.setAdapter(arrayAdapter as ListAdapter)
            listView.setOnItemClickListener(object : OnItemClickListener() {
                // from class: com.lagradost.cloudstream3.utils.-$$Lambda$SingleSelectionHelper$1E9-F5o2dKfKMb5j9C1SRdYOXbM
                @Override // android.widget.AdapterView.OnItemClickListener
                fun onItemClick(adapterView: AdapterView?, view2: View?, i2: Int, j: Long) {
                    `m9017showOptionSelect$lambda4$lambda3`(
                        this@Function1,
                        create,
                        activity,
                        adapterView,
                        view2,
                        i2,
                        j
                    )
                }
            })
        }
        val imageView: ImageView = create.findViewById<View>(R.id.imageView) as ImageView
        if (imageView != null) {
            val imageView2: ImageView = imageView
            if (str != null && str.length() !== 0) {
                z = false
            }
            imageView2.setVisibility(if (z) 8 else 0)
            UIHelper.Companion.`setImage$default`(
                UIHelper.Companion.INSTANCE,
                imageView,
                str,
                null,
                null,
                6,
                null
            )
        }
    }

    fun showDialog(
        activity: Activity?,
        dialog: Dialog,
        items: List<String?>?,
        selectedIndex: List<Integer?>,
        name: String?,
        z: Boolean,
        z2: Boolean,
        callback: Function1<List<Integer?>?, Unit>,
        dismissCallback: Functions<Unit>?
    ) {
        val textView: TextView
        val z3: Boolean
        Intrinsics.checkNotNullParameter(dialog, "dialog")
        Intrinsics.checkNotNullParameter(items, "items")
        Intrinsics.checkNotNullParameter(selectedIndex, "selectedIndex")
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(callback, "callback")
        Intrinsics.checkNotNullParameter(dismissCallback, "dismissCallback")
        if (activity == null) {
            return
        }
        val z4 = z || z2
        val findViewById: View = dialog.findViewById(R.id.listview1)
        Intrinsics.checkNotNull(findViewById)
        val listView: ListView = findViewById as ListView
        val findViewById2: View = dialog.findViewById(R.id.text1)
        Intrinsics.checkNotNull(findViewById2)
        val textView2: TextView = findViewById2 as TextView
        val findViewById3: View = dialog.findViewById(R.id.apply_btt)
        Intrinsics.checkNotNull(findViewById3)
        val textView3: TextView = findViewById3 as TextView
        val findViewById4: View = dialog.findViewById(R.id.cancel_btt)
        Intrinsics.checkNotNull(findViewById4)
        val textView4: TextView = findViewById4 as TextView
        val findViewById5: View = dialog.findViewById(R.id.apply_btt_holder)
        Intrinsics.checkNotNull(findViewById5)
        (findViewById5 as LinearLayout).setVisibility(if (z4) 0 else 8)
        if (z4) {
            textView = textView4
        } else {
            val layoutParams: ViewGroup.LayoutParams = listView.getLayoutParams()
            Objects.requireNonNull(
                layoutParams,
                "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
            )
            val layoutParams2: LinearLayout.LayoutParams = layoutParams as LinearLayout.LayoutParams
            val listView2: ListView = listView
            val layoutParams3: ViewGroup.LayoutParams = listView2.getLayoutParams()
            val marginLayoutParams: ViewGroup.MarginLayoutParams? =
                if (layoutParams3 is ViewGroup.MarginLayoutParams) layoutParams3 as ViewGroup.MarginLayoutParams else null
            val i = if (marginLayoutParams != null) marginLayoutParams.leftMargin else 0
            val layoutParams4: ViewGroup.LayoutParams = listView2.getLayoutParams()
            textView = textView4
            val marginLayoutParams2: ViewGroup.MarginLayoutParams? =
                if (layoutParams4 is ViewGroup.MarginLayoutParams) layoutParams4 as ViewGroup.MarginLayoutParams else null
            val i2 = if (marginLayoutParams2 != null) marginLayoutParams2.topMargin else 0
            val layoutParams5: ViewGroup.LayoutParams = listView2.getLayoutParams()
            val marginLayoutParams3: ViewGroup.MarginLayoutParams? =
                if (layoutParams5 is ViewGroup.MarginLayoutParams) layoutParams5 as ViewGroup.MarginLayoutParams else null
            layoutParams2.setMargins(
                i,
                i2,
                if (marginLayoutParams3 != null) marginLayoutParams3.rightMargin else 0,
                0
            )
            listView.setLayoutParams(layoutParams2)
        }
        textView2.setText(name)
        val arrayAdapter = ArrayAdapter(activity, R.layout.sort_bottom_single_choice)
        arrayAdapter.addAll(items)
        listView.setAdapter(arrayAdapter as ListAdapter)
        if (z2) {
            listView.setChoiceMode(2)
            z3 = true
        } else {
            z3 = true
            listView.setChoiceMode(1)
        }
        for (num in selectedIndex) {
            listView.setItemChecked(num.intValue(), z3)
        }
        val num2: Integer =
            CollectionsKt.minOrNull<Comparable<T?>>(selectedIndex as Iterable<Comparable?>) as Integer
        if (num2 != null) {
            listView.setSelection(num2.intValue())
        }
        dialog.setOnDismissListener(object : OnDismissListener() {
            // from class: com.lagradost.cloudstream3.utils.-$$Lambda$SingleSelectionHelper$_quW3Lgn-ouB9XXLDnvd4yUm2jw
            @Override // android.content.DialogInterface.OnDismissListener
            fun onDismiss(dialogInterface: DialogInterface?) {
                `m9012showDialog$lambda8`(this@Functions, dialogInterface)
            }
        })
        listView.setOnItemClickListener(object : OnItemClickListener() {
            // from class: com.lagradost.cloudstream3.utils.-$$Lambda$SingleSelectionHelper$UeWPO4w7u9UenpGGA_-RJpRqfUM
            @Override // android.widget.AdapterView.OnItemClickListener
            fun onItemClick(adapterView: AdapterView?, view: View?, i3: Int, j: Long) {
                `m9013showDialog$lambda9`(
                    z4,
                    z2,
                    listView,
                    callback,
                    dialog,
                    activity,
                    adapterView,
                    view,
                    i3,
                    j
                )
            }
        })
        if (z4) {
            textView3.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.utils.-$$Lambda$SingleSelectionHelper$NI6cKmni_VGbmG278Kfh03vWEmQ
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    `m9010showDialog$lambda10`(listView, callback, dialog, activity, view)
                }
            })
            textView.setOnClickListener(object : OnClickListener() {
                // from class: com.lagradost.cloudstream3.utils.-$$Lambda$SingleSelectionHelper$0OvOCfYBoH8KA_sMrwTjbicQxjk
                @Override // android.view.View.OnClickListener
                fun onClick(view: View?) {
                    `m9011showDialog$lambda11`(dialog, activity, view)
                }
            })
        }
    }

    private fun showInputDialog(
        activity: Activity?,
        dialog: Dialog,
        str: String,
        str2: String,
        num: Integer?,
        function1: Function1<String?, Unit>,
        functions: Functions<Unit>
    ) {
        if (activity == null) {
            return
        }
        val findViewById: View = dialog.findViewById(R.id.nginx_text_input)
        Intrinsics.checkNotNull(findViewById)
        val editText: EditText = findViewById as EditText
        val findViewById2: View = dialog.findViewById(R.id.text1)
        Intrinsics.checkNotNull(findViewById2)
        val findViewById3: View = dialog.findViewById(R.id.apply_btt)
        Intrinsics.checkNotNull(findViewById3)
        val textView: TextView = findViewById3 as TextView
        val findViewById4: View = dialog.findViewById(R.id.cancel_btt)
        Intrinsics.checkNotNull(findViewById4)
        val textView2: TextView = findViewById4 as TextView
        val findViewById5: View = dialog.findViewById(R.id.apply_btt_holder)
        Intrinsics.checkNotNull(findViewById5)
        (findViewById5 as LinearLayout).setVisibility(0)
        (findViewById2 as TextView).setText(str2)
        if (num != null) {
            editText.setInputType(num.intValue())
        }
        editText.setText(str, TextView.BufferType.EDITABLE)
        textView.setOnClickListener(object : OnClickListener() {
            // from class: com.lagradost.cloudstream3.utils.-$$Lambda$SingleSelectionHelper$Gq3sYU26dhrElQxEsriGH0o4jUw
            @Override // android.view.View.OnClickListener
            fun onClick(view: View?) {
                `m9014showInputDialog$lambda12`(this@Function1, editText, dialog, activity, view)
            }
        })
        textView2.setOnClickListener(object : OnClickListener() {
            // from class: com.lagradost.cloudstream3.utils.-$$Lambda$SingleSelectionHelper$M4JwaAlaKvQK_AaSnd_Pb8dmHqk
            @Override // android.view.View.OnClickListener
            fun onClick(view: View?) {
                `m9015showInputDialog$lambda13`(dialog, activity, view)
            }
        })
        dialog.setOnDismissListener(object : OnDismissListener() {
            // from class: com.lagradost.cloudstream3.utils.-$$Lambda$SingleSelectionHelper$zU-KbuFLRpByvF-o1CiGhPZLHP8
            @Override // android.content.DialogInterface.OnDismissListener
            fun onDismiss(dialogInterface: DialogInterface?) {
                `m9016showInputDialog$lambda14`(this@Functions, dialogInterface)
            }
        })
    }

    fun showMultiDialog(
        activity: Activity?,
        items: List<String?>?,
        selectedIndex: List<Integer?>,
        name: String?,
        dismissCallback: Functions<Unit>?,
        callback: Function1<List<Integer?>?, Unit>
    ) {
        Intrinsics.checkNotNullParameter(items, "items")
        Intrinsics.checkNotNullParameter(selectedIndex, "selectedIndex")
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(dismissCallback, "dismissCallback")
        Intrinsics.checkNotNullParameter(callback, "callback")
        if (activity == null) {
            return
        }
        val create: AlertDialog = AlertDialog.Builder(activity, R.style.AlertDialogCustom)
            .setView(R.layout.bottom_selection_dialog).create()
        Intrinsics.checkNotNullExpressionValue(create, "builder.create()")
        create.show()
        showDialog(
            activity,
            create,
            items,
            selectedIndex,
            name,
            true,
            true,
            callback,
            dismissCallback
        )
    }

    fun showDialog(
        activity: Activity?,
        items: List<String?>?,
        i: Int,
        name: String?,
        z: Boolean,
        dismissCallback: Functions<Unit>?,
        callback: Function1<Integer?, Unit>
    ) {
        Intrinsics.checkNotNullParameter(items, "items")
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(dismissCallback, "dismissCallback")
        Intrinsics.checkNotNullParameter(callback, "callback")
        if (activity == null) {
            return
        }
        val create: AlertDialog = AlertDialog.Builder(activity, R.style.AlertDialogCustom)
            .setView(R.layout.bottom_selection_dialog).create()
        Intrinsics.checkNotNullExpressionValue(create, "builder.create()")
        create.show()
        showDialog(
            activity,
            create,
            items,
            CollectionsKt.listOf(Integer.valueOf(i)),
            name,
            z,
            false,
            `SingleSelectionHelper$showDialog$6`(callback),
            dismissCallback
        )
    }

    fun showBottomDialog(
        activity: Activity?,
        items: List<String?>?,
        i: Int,
        name: String?,
        z: Boolean,
        dismissCallback: Functions<Unit>?,
        callback: Function1<Integer?, Unit>
    ) {
        Intrinsics.checkNotNullParameter(items, "items")
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(dismissCallback, "dismissCallback")
        Intrinsics.checkNotNullParameter(callback, "callback")
        if (activity == null) {
            return
        }
        val bottomSheetDialog = BottomSheetDialog(activity)
        bottomSheetDialog.setContentView(R.layout.bottom_selection_dialog)
        bottomSheetDialog.show()
        showDialog(
            activity,
            bottomSheetDialog,
            items,
            CollectionsKt.listOf(Integer.valueOf(i)),
            name,
            z,
            false,
            `SingleSelectionHelper$showBottomDialog$1`(callback),
            dismissCallback
        )
    }

    fun showNginxTextInputDialog(
        activity: Activity?,
        name: String,
        value: String,
        num: Integer?,
        dismissCallback: Functions<Unit>,
        callback: Function1<String?, Unit>
    ) {
        Intrinsics.checkNotNullParameter(activity, "<this>")
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(value, "value")
        Intrinsics.checkNotNullParameter(dismissCallback, "dismissCallback")
        Intrinsics.checkNotNullParameter(callback, "callback")
        val bottomSheetDialog = BottomSheetDialog(activity)
        bottomSheetDialog.setContentView(R.layout.bottom_input_dialog)
        bottomSheetDialog.show()
        showInputDialog(activity, bottomSheetDialog, value, name, num, callback, dismissCallback)
    }

    companion object {
        @kotlin.jvm.JvmField
        val INSTANCE = SingleSelectionHelper()
        fun  /* synthetic */`showOptionSelectStringRes$default`(
            singleSelectionHelper: SingleSelectionHelper,
            activity: Activity?,
            view: View?,
            str: String,
            list: List,
            list2: List,
            function1: Function1<*, *>,
            i: Int,
            obj: Object?
        ) {
            var list3: List = list2
            if (i and 8 != 0) {
                list3 = CollectionsKt.emptyList<Any>()
            }
            singleSelectionHelper.showOptionSelectStringRes(
                activity,
                view,
                str,
                list,
                list3,
                function1
            )
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: showOptionSelect$lambda-4$lambda-3  reason: not valid java name */
        fun `m9017showOptionSelect$lambda4$lambda3`(
            callback: Function1<*, *>,
            dialog: AlertDialog?,
            activity: Activity?,
            adapterView: AdapterView?,
            view: View?,
            i: Int,
            j: Long
        ) {
            Intrinsics.checkNotNullParameter(callback, "\$callback")
            Intrinsics.checkNotNullParameter(dialog, "\$dialog")
            callback.invoke(Tuples<Any?, Any?>(true, Integer.valueOf(i)))
            UIHelper.Companion.INSTANCE.dismissSafe(dialog, activity)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: showDialog$lambda-8  reason: not valid java name */
        fun `m9012showDialog$lambda8`(
            dismissCallback: Functions<*>,
            dialogInterface: DialogInterface?
        ) {
            Intrinsics.checkNotNullParameter(dismissCallback, "\$dismissCallback")
            dismissCallback.invoke()
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: showDialog$lambda-9  reason: not valid java name */
        fun `m9013showDialog$lambda9`(
            z: Boolean,
            z2: Boolean,
            listView: ListView,
            callback: Function1<*, *>,
            dialog: Dialog?,
            activity: Activity?,
            adapterView: AdapterView?,
            view: View?,
            i: Int,
            j: Long
        ) {
            Intrinsics.checkNotNullParameter(listView, "\$listView")
            Intrinsics.checkNotNullParameter(callback, "\$callback")
            Intrinsics.checkNotNullParameter(dialog, "\$dialog")
            if (!z) {
                callback.invoke(CollectionsKt.listOf(Integer.valueOf(i)))
                UIHelper.Companion.INSTANCE.dismissSafe(dialog, activity)
            } else if (z2) {
            } else {
                listView.setItemChecked(i, true)
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: showDialog$lambda-10  reason: not valid java name */
        fun `m9010showDialog$lambda10`(
            listView: ListView,
            callback: Function1<*, *>,
            dialog: Dialog?,
            activity: Activity?,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(listView, "\$listView")
            Intrinsics.checkNotNullParameter(callback, "\$callback")
            Intrinsics.checkNotNullParameter(dialog, "\$dialog")
            val arrayList = ArrayList()
            val count: Int = listView.getCount()
            for (i in 0 until count) {
                if (listView.getCheckedItemPositions().get(i)) {
                    arrayList.add(Integer.valueOf(i))
                }
            }
            callback.invoke(arrayList)
            UIHelper.Companion.INSTANCE.dismissSafe(dialog, activity)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: showDialog$lambda-11  reason: not valid java name */
        fun `m9011showDialog$lambda11`(dialog: Dialog?, activity: Activity?, view: View?) {
            Intrinsics.checkNotNullParameter(dialog, "\$dialog")
            UIHelper.Companion.INSTANCE.dismissSafe(dialog, activity)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: showInputDialog$lambda-12  reason: not valid java name */
        fun `m9014showInputDialog$lambda12`(
            callback: Function1<*, *>,
            inputView: EditText,
            dialog: Dialog?,
            activity: Activity?,
            view: View?
        ) {
            Intrinsics.checkNotNullParameter(callback, "\$callback")
            Intrinsics.checkNotNullParameter(inputView, "\$inputView")
            Intrinsics.checkNotNullParameter(dialog, "\$dialog")
            callback.invoke(inputView.getText().toString())
            UIHelper.Companion.INSTANCE.dismissSafe(dialog, activity)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: showInputDialog$lambda-13  reason: not valid java name */
        fun `m9015showInputDialog$lambda13`(dialog: Dialog?, activity: Activity?, view: View?) {
            Intrinsics.checkNotNullParameter(dialog, "\$dialog")
            UIHelper.Companion.INSTANCE.dismissSafe(dialog, activity)
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: showInputDialog$lambda-14  reason: not valid java name */
        fun `m9016showInputDialog$lambda14`(
            dismissCallback: Functions<*>,
            dialogInterface: DialogInterface?
        ) {
            Intrinsics.checkNotNullParameter(dismissCallback, "\$dismissCallback")
            dismissCallback.invoke()
        }
    }
}