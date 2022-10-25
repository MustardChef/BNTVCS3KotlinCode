package com.lagradost.cloudstream3.utils

import android.content.ContentUris

/* loaded from: classes4.dex */
object RealPathUtil {
    fun getRealPath(context: Context, uri: Uri, str: String?): String? {
        if (Build.VERSION.SDK_INT < 11) {
            return getRealPathFromURI_BelowAPI11(context, uri, str)
        }
        return if (Build.VERSION.SDK_INT < 19) {
            getRealPathFromURI_API11to18(context, uri, str)
        } else getRealPathFromURI_API19(
            context,
            uri,
            str
        )
    }

    fun getRealPathFromURI_API11to18(context: Context?, uri: Uri?, str: String?): String? {
        val loadInBackground: Cursor =
            CursorLoader(context, uri, arrayOf("_data"), null, null, null).loadInBackground()
        if (loadInBackground != null) {
            val columnIndexOrThrow: Int = loadInBackground.getColumnIndexOrThrow("_data")
            loadInBackground.moveToFirst()
            val string: String = loadInBackground.getString(columnIndexOrThrow)
            loadInBackground.close()
            return string
        }
        return null
    }

    fun getRealPathFromURI_BelowAPI11(context: Context, uri: Uri?, str: String?): String {
        val query: Cursor =
            context.getContentResolver().query(uri, arrayOf("_data"), null, null, null)
        if (query != null) {
            val columnIndexOrThrow: Int = query.getColumnIndexOrThrow("_data")
            query.moveToFirst()
            val string: String = query.getString(columnIndexOrThrow)
            query.close()
            return string
        }
        return ""
    }

    fun getRealPathFromURI_API19(context: Context, uri: Uri, str: String?): String? {
        var uri2: Uri? = null
        if (Build.VERSION.SDK_INT >= 19 && DocumentsContract.isDocumentUri(context, uri)) {
            if (isExternalStorageDocument(uri)) {
                val documentId: String = DocumentsContract.getDocumentId(uri)
                if (documentId != null && documentId.startsWith("msf:")) {
                    val file = File(context.getCacheDir(), str)
                    return try {
                        val openInputStream: InputStream =
                            context.getContentResolver().openInputStream(uri)
                        val fileOutputStream = FileOutputStream(file)
                        try {
                            val bArr = ByteArray(4096)
                            while (true) {
                                val read: Int = openInputStream.read(bArr)
                                if (read == -1) {
                                    break
                                }
                                fileOutputStream.write(bArr, 0, read)
                            }
                            fileOutputStream.flush()
                            val absolutePath: String = file.getAbsolutePath()
                            fileOutputStream.close()
                            if (openInputStream != null) {
                                openInputStream.close()
                            }
                            absolutePath
                        } catch (th: Throwable) {
                            try {
                                fileOutputStream.close()
                            } catch (th2: Throwable) {
                                th.addSuppressed(th2)
                            }
                            throw th
                        }
                    } catch (e: IOException) {
                        e.printStackTrace()
                        null
                    }
                }
                val split: Array<String> = documentId.split(":")
                if (StorageId.PRIMARY.equalsIgnoreCase(split[0])) {
                    return Environment.getExternalStorageDirectory() + "/" + split[1]
                }
            } else if (isDownloadsDocument(uri)) {
                val documentId2: String = DocumentsContract.getDocumentId(uri)
                if (documentId2 != null && documentId2.startsWith("msf:")) {
                    val file2 = File(context.getCacheDir(), str)
                    return try {
                        val openInputStream2: InputStream =
                            context.getContentResolver().openInputStream(uri)
                        val fileOutputStream2 = FileOutputStream(file2)
                        val bArr2 = ByteArray(4096)
                        while (true) {
                            val read2: Int = openInputStream2.read(bArr2)
                            if (read2 == -1) {
                                break
                            }
                            fileOutputStream2.write(bArr2, 0, read2)
                        }
                        fileOutputStream2.flush()
                        val absolutePath2: String = file2.getAbsolutePath()
                        fileOutputStream2.close()
                        if (openInputStream2 != null) {
                            openInputStream2.close()
                        }
                        absolutePath2
                    } catch (e2: IOException) {
                        e2.printStackTrace()
                        null
                    }
                }
                return getDataColumn(
                    context,
                    ContentUris.withAppendedId(
                        Uri.parse("content://downloads/public_downloads"),
                        Long.valueOf(documentId2).longValue()
                    ),
                    null,
                    null
                )
            } else if (isMediaDocument(uri)) {
                val documentId3: String = DocumentsContract.getDocumentId(uri)
                if (documentId3 != null && documentId3.startsWith("msf:")) {
                    val file3 = File(context.getCacheDir(), str)
                    return try {
                        val openInputStream3: InputStream =
                            context.getContentResolver().openInputStream(uri)
                        val fileOutputStream3 = FileOutputStream(file3)
                        try {
                            val bArr3 = ByteArray(4096)
                            while (true) {
                                val read3: Int = openInputStream3.read(bArr3)
                                if (read3 == -1) {
                                    break
                                }
                                fileOutputStream3.write(bArr3, 0, read3)
                            }
                            fileOutputStream3.flush()
                            val absolutePath3: String = file3.getAbsolutePath()
                            fileOutputStream3.close()
                            if (openInputStream3 != null) {
                                openInputStream3.close()
                            }
                            absolutePath3
                        } catch (th3: Throwable) {
                            try {
                                fileOutputStream3.close()
                            } catch (th4: Throwable) {
                                th3.addSuppressed(th4)
                            }
                            throw th3
                        }
                    } catch (e3: IOException) {
                        e3.printStackTrace()
                        null
                    }
                }
                val split2: Array<String> = documentId3.split(":")
                val str2 = split2[0]
                if ("image".equals(str2)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI
                } else if ("video".equals(str2)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI
                } else if ("audio".equals(str2)) {
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
                }
                return getDataColumn(context, uri2, "_id=?", arrayOf(split2[1]))
            }
        } else if ("content".equalsIgnoreCase(uri.getScheme())) {
            return if (isGooglePhotosUri(uri)) {
                uri.getLastPathSegment()
            } else getDataColumn(context, uri, null, null)
        } else if ("file".equalsIgnoreCase(uri.getScheme())) {
            return uri.getPath()
        }
        return null
    }

    fun getDataColumn(context: Context, uri: Uri?, str: String?, strArr: Array<String>?): String? {
        var cursor: Cursor? = null
        try {
            val query: Cursor =
                context.getContentResolver().query(uri, arrayOf("_data"), str, strArr, null)
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        val string: String = query.getString(query.getColumnIndexOrThrow("_data"))
                        if (query != null) {
                            query.close()
                        }
                        return string
                    }
                } catch (th: Throwable) {
                    th = th
                    cursor = query
                    if (cursor != null) {
                        cursor.close()
                    }
                    throw th
                }
            }
            if (query != null) {
                query.close()
            }
            return null
        } catch (th2: Throwable) {
            th = th2
        }
    }

    fun isExternalStorageDocument(uri: Uri): Boolean {
        return DocumentFileCompat.EXTERNAL_STORAGE_AUTHORITY.equals(uri.getAuthority())
    }

    fun isDownloadsDocument(uri: Uri): Boolean {
        return DocumentFileCompat.DOWNLOADS_FOLDER_AUTHORITY.equals(uri.getAuthority())
    }

    fun isMediaDocument(uri: Uri): Boolean {
        return DocumentFileCompat.MEDIA_FOLDER_AUTHORITY.equals(uri.getAuthority())
    }

    fun isGooglePhotosUri(uri: Uri): Boolean {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority())
    }
}