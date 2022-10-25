package com.lagradost.cloudstream3.p041ui.browser

import android.util.Log
import okhttp3.MediaType
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.jvm.internal.Intrinsics

/* compiled from: SubtitleBrowserRepository.kt */
@Metadata(
    m108d1 = ["\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n\u0012\u0004\u0012\u00020\u00040\tJ\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006J$\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00040\tJ(\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¨\u0006\u0015"],
    m107d2 = ["Lcom/lagradost/cloudstream3/ui/browser/SubtitleBrowserRepository;", "", "()V", "downloadSubtitle", "", "url", "", "fileDir", "callback", "Lkotlin/Function1;", "", "extractZipSubtitle", "responseBody", "Lokhttp3/ResponseBody;", "uploadFile", "file", "Ljava/io/File;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "writeResponseBodyToDisk", "body", "filename", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.browser.SubtitleBrowserRepository */ /* loaded from: classes.dex */
class SubtitleBrowserRepository constructor() {
    fun downloadSubtitle(url: String?, fileDir: String, callback: Function1<List<String?>?, Unit>) {
        Intrinsics.checkNotNullParameter(url, "url")
        Intrinsics.checkNotNullParameter(fileDir, "fileDir")
        Intrinsics.checkNotNullParameter(callback, "callback")
        ApiUtils().createApi().downloadZipSubtitleFile(url)
            .enqueue(object : Callback<ResponseBody?> {
                // from class: com.lagradost.cloudstream3.ui.browser.SubtitleBrowserRepository$downloadSubtitle$1
                @Override // retrofit2.Callback
                public override fun onResponse(
                    call: Call<ResponseBody>,
                    response: Response<ResponseBody>
                ) {
                    Intrinsics.checkNotNullParameter(call, "call")
                    Intrinsics.checkNotNullParameter(response, "response")
                    val body: ResponseBody? = response.body()
                    if (body != null) {
                        val subtitleBrowserRepository: SubtitleBrowserRepository =
                            this@SubtitleBrowserRepository
                        val str: String = fileDir
                        val function1: Function1<List<String>, Unit> = callback
                        val extractZipSubtitle: List<String>? =
                            subtitleBrowserRepository.extractZipSubtitle(body, str)
                        Log.d("DuongKK", "File " + extractZipSubtitle)
                        if (extractZipSubtitle != null) {
                            function1.invoke(extractZipSubtitle)
                        }
                    }
                }

                @Override // retrofit2.Callback
                public override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                    Intrinsics.checkNotNullParameter(call, "call")
                    Intrinsics.checkNotNullParameter(t, "t")
                    Log.e("DuongKK", "onFailure " + t.getMessage())
                }
            })
    }

    fun extractZipSubtitle(responseBody: ResponseBody, fileDir: String): List<String>? {
        Intrinsics.checkNotNullParameter(responseBody, "responseBody")
        Intrinsics.checkNotNullParameter(fileDir, "fileDir")
        val writeResponseBodyToDisk: List<String>? = writeResponseBodyToDisk(
            fileDir,
            responseBody,
            "file" + System.currentTimeMillis().toString() + ".srt"
        )
        val sb: StringBuilder = StringBuilder()
        sb.append("file download was a success? ")
        sb.append(writeResponseBodyToDisk)
        Log.d(
            "DuongKK",
            if (sb.toString() != null) ServerProtocol.DIALOG_RETURN_SCOPES_TRUE else "false"
        )
        return writeResponseBodyToDisk
    }

    /* JADX WARN: Multi-variable type inference failed */ /* JADX WARN: Type inference failed for: r13v0, types: [okhttp3.ResponseBody] */ /* JADX WARN: Type inference failed for: r13v1 */ /* JADX WARN: Type inference failed for: r13v2 */ /* JADX WARN: Type inference failed for: r13v3, types: [java.io.InputStream] */ /* JADX WARN: Type inference failed for: r13v4, types: [java.io.InputStream] */ /* JADX WARN: Type inference failed for: r13v5, types: [java.io.InputStream] */ /* JADX WARN: Type inference failed for: r6v1 */ /* JADX WARN: Type inference failed for: r6v2 */ /* JADX WARN: Type inference failed for: r6v4, types: [java.io.OutputStream] */ /* JADX WARN: Type inference failed for: r6v7 */
    private fun writeResponseBodyToDisk(
        str: String,
        responseBody: ResponseBody,
        str2: String
    ): List<String>? {
        var responseBody: ResponseBody = responseBody
        var fileOutputStream: FileOutputStream?
        val arrayList: ArrayList?
        try {
            val substring: String = str2.substring(
                StringsKt.`lastIndexOf$default`(
                    str2 as CharSequence?,
                    ".",
                    0,
                    false,
                    6,
                    null as Object?
                )
            )
            Intrinsics.checkNotNullExpressionValue(
                substring,
                "this as java.lang.String).substring(startIndex)"
            )
            r6 = 4
            val file: File = File(
                str + File.separator + StringsKt.`replace$default`(
                    str2,
                    substring,
                    ".zip",
                    false,
                    4,
                    null as Object?
                )
            )
            try {
                try {
                    val bArr: ByteArray = ByteArray(4096)
                    val contentLength: Long = responseBody.contentLength()
                    var j: Long = 0
                    responseBody = responseBody.byteStream()
                    try {
                        fileOutputStream = FileOutputStream(file)
                        while (true) {
                            try {
                                val read: Int = responseBody.read(bArr)
                                if (read == -1) {
                                    break
                                }
                                fileOutputStream.write(bArr, 0, read)
                                j += read.toLong()
                                Log.d("DuongKK", "file download: " + j + " of " + contentLength)
                            } catch (e: IOException) {
                                e = e
                                e.printStackTrace()
                                arrayList = null
                                if (responseBody != 0) {
                                    responseBody.close()
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close()
                                }
                                return arrayList
                            }
                        }
                        fileOutputStream.flush()
                        val unzipFile: Boolean = ZipUtils.unzipFile(file, file.getParentFile())
                        Log.d("DuongKK", "unzipSuccess: " + unzipFile)
                        if (unzipFile) {
                            val filesPath: List<String> = ZipUtils.getFilesPath(file)
                            arrayList = ArrayList()
                            val it: Iterator<String> = filesPath.iterator()
                            while (it.hasNext()) {
                                arrayList.add(File(str + File.separator + it.next()).getAbsolutePath())
                            }
                        } else {
                            arrayList = null
                        }
                        if (responseBody != 0) {
                            responseBody.close()
                        }
                    } catch (e2: IOException) {
                        e = e2
                        fileOutputStream = null
                    } catch (th: Throwable) {
                        th = th
                        r6 = 0
                        if (responseBody != 0) {
                            responseBody.close()
                        }
                        if (r6 !== 0) {
                            r6.close()
                        }
                        throw th
                    }
                } catch (e3: IOException) {
                    e = e3
                    responseBody = 0
                    fileOutputStream = null
                } catch (th2: Throwable) {
                    th = th2
                    responseBody = 0
                    r6 = 0
                }
                fileOutputStream.close()
                return arrayList
            } catch (th3: Throwable) {
                th = th3
            }
        } catch (e4: IOException) {
            e4.printStackTrace()
            return null
        }
    }

    fun uploadFile(file: File, callback: Function1<SubtitleFile?, Unit>) {
        Intrinsics.checkNotNullParameter(file, "file")
        Intrinsics.checkNotNullParameter(callback, "callback")
        Log.d("Du", "File: " + file.getAbsolutePath())
        val createApi: ApiService = ApiUtils().createApi()
        val createFormData: MultipartBody.Part = MultipartBody.Part.Companion.createFormData(
            "myFile", file.getName(), RequestBody.Companion.create(
                MediaType.Companion.parse("multipart/form-data"), file
            )
        )
        RequestBody.Companion.create(MultipartBody.FORM, "hello, this is description speaking")
        val execute: Response<ResponseSubtitle?> = createApi.upload(createFormData).execute()
        if (execute.isSuccessful() && execute.body() != null) {
            val body: ResponseSubtitle? = execute.body()
            val sb: StringBuilder = StringBuilder()
            sb.append("Data sub ")
            sb.append(if (body != null) body.fullPath else null)
            Log.d("Du", sb.toString())
            if (body != null) {
                callback.invoke(
                    SubtitleFile(
                        String.valueOf(file.getName()),
                        body.fullPath,
                        null,
                        4,
                        null
                    )
                )
                return
            }
            return
        }
        Log.e("Du", "Data sub error")
        callback.invoke(null)
    }
}