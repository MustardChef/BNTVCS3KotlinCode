package com.lagradost.cloudstream3.p041ui.browser

import android.webkit.JavascriptInterface

/* renamed from: com.lagradost.cloudstream3.ui.browser.JavaScriptInterface */ /* loaded from: classes.dex */
class JavaScriptInterface constructor(var iCallback: ICallback<String>) {
    @JavascriptInterface
    fun processHTML(str: String?) {
        iCallback.onCallback((str)!!)
    }
}