package com.lagradost.cloudstream3.p041ui.browser

import android.content.Context

/* renamed from: com.lagradost.cloudstream3.ui.browser.DownloadSubtitleTask */ /* loaded from: classes.dex */
class DownloadSubtitleTask constructor(
    context: Context?,
    str: String?,
    iCallback: ICallback<String>
) : AsyncTask<ResponseBody?, Void?, String?>() {
    var contextWeakReference: WeakReference<Context>
    var fileNameWeakReference: WeakReference<String>
    var iCallback: ICallback<String>

    init {
        contextWeakReference = WeakReference(context)
        fileNameWeakReference = WeakReference(str)
        this.iCallback = iCallback
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    fun doInBackground(vararg responseBodyArr: ResponseBody?): String? {
        val str: String
        if (contextWeakReference.get() != null) {
            val context: Context = contextWeakReference.get()
            if (fileNameWeakReference.get() != null) {
                str = fileNameWeakReference.get()
            } else {
                str = "file" + System.currentTimeMillis().toString() + ".srt"
            }
            val writeResponseBodyToDisk: String =
                writeResponseBodyToDisk(context, responseBodyArr.get(0), str)
            val sb: StringBuilder = StringBuilder()
            sb.append("file download was a success? ")
            sb.append(writeResponseBodyToDisk)
            Log.d(
                "DuongKK",
                if (sb.toString() != null) ServerProtocol.DIALOG_RETURN_SCOPES_TRUE else "false"
            )
            return writeResponseBodyToDisk
        }
        return null
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    fun onPostExecute(str: String?) {
        super.onPostExecute(str as DownloadSubtitleTask?)
        val iCallback: ICallback<String>? = iCallback
        if (iCallback != null) {
            iCallback.onCallback((str)!!)
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e2 A[Catch: IOException -> 0x00eb, TryCatch #5 {IOException -> 0x00eb, blocks: (B:3:0x0001, B:14:0x008f, B:15:0x0092, B:18:0x0098, B:19:0x009b, B:36:0x00d6, B:38:0x00db, B:42:0x00e2, B:44:0x00e7, B:45:0x00ea), top: B:51:0x0001 }] */ /* JADX WARN: Removed duplicated region for block: B:44:0x00e7 A[Catch: IOException -> 0x00eb, TryCatch #5 {IOException -> 0x00eb, blocks: (B:3:0x0001, B:14:0x008f, B:15:0x0092, B:18:0x0098, B:19:0x009b, B:36:0x00d6, B:38:0x00db, B:42:0x00e2, B:44:0x00e7, B:45:0x00ea), top: B:51:0x0001 }] */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private fun writeResponseBodyToDisk(
        r12: android.content.Context,
        r13: ResponseBody?,
        r14: String
    ): String {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.p041ui.browser.DownloadSubtitleTask.writeResponseBodyToDisk(android.content.Context, okhttp3.ResponseBody, java.lang.String):java.lang.String")
    }
}