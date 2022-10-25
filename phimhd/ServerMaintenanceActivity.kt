package com.phimhd

import android.content.Intent
/* loaded from: classes4.dex */
class ServerMaintenanceActivity : BaseActivity() {
    @Override // com.phimhd.BaseActivity
    override fun initLayout(): Int {
        return R.layout.server_activity
    }

    @Override // com.phimhd.BaseActivity
    override fun initVariables() {
    }

    @Override // com.phimhd.BaseActivity
    override fun initViews() {
        findViewById<View>(R.id.tvInfo).setOnClickListener(object : OnClickListener() {
            // from class: com.phimhd.ServerMaintenanceActivity.1
            @Override // android.view.View.OnClickListener
            fun onClick(view: View?) {
                val intent = Intent("android.intent.action.VIEW")
                intent.setData(Uri.parse(Constants.URL_WEBSITE))
                this@ServerMaintenanceActivity.startActivity(intent)
            }
        })
    }
}