package com.phimhd

import android.app.Dialog

/* loaded from: classes4.dex */
class ProgressDialogCustom : ProgressDialog {
    var context: Context
    private var mProgressDialog: Dialog
    private val tvMess: TextView? = null

    constructor(context: Context, str: String?, z: Boolean) : super(context) {
        this.context = context
        val progressDialog = ProgressDialog(context)
        mProgressDialog = progressDialog
        progressDialog.setCancelable(z)
    }

    constructor(context: Context) : super(context) {
        this.context = context
        val from: LayoutInflater = LayoutInflater.from(context)
        val dialog = Dialog(context)
        mProgressDialog = dialog
        dialog.getWindow().requestFeature(1)
        val inflate: View = from.inflate(R.layout.dialog_loading, null as ViewGroup?, false)
        mProgressDialog.getWindow().setBackgroundDrawable(ColorDrawable(0))
        mProgressDialog.setContentView(inflate)
        mProgressDialog.setCancelable(false)
    }

    fun showDialog() {
        try {
            val dialog: Dialog = mProgressDialog
            if (dialog != null) {
                dialog.show()
                Handler().postDelayed(object : Runnable() {
                    // from class: com.phimhd.-$$Lambda$ProgressDialogCustom$eGqn8FACWAlRWpsLs6D4hSG2urg
                    @Override // java.lang.Runnable
                    fun run() {
                        `lambda$showDialog$0$ProgressDialogCustom`()
                    }
                }, 5000L)
            }
        } catch (unused: Exception) {
        }
    }

    /* synthetic */   fun `lambda$showDialog$0$ProgressDialogCustom`() {
        val dialog: Dialog = mProgressDialog
        if (dialog != null) {
            dialog.setCancelable(true)
        }
    }

    fun hideDialog() {
        try {
            val dialog: Dialog = mProgressDialog
            if (dialog == null || !dialog.isShowing()) {
                return
            }
            mProgressDialog.dismiss()
        } catch (unused: Exception) {
        }
    }
}