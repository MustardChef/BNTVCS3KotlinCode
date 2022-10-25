package com.lagradost.nicehttp

import java.io.File
import kotlin.jvm.internal.Intrinsics

/* compiled from: NiceFile.kt */
@Metadata(
    m108d1 = ["\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000c\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u000f\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\tB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0013"],
    m107d2 = ["Lcom/lagradost/nicehttp/NiceFile;", "", "name", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "file", "Ljava/io/File;", "(Ljava/lang/String;Ljava/io/File;)V", "(Ljava/io/File;)V", "fileName", "fileType", "(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)V", "getFile", "()Ljava/io/File;", "getFileName", "()Ljava/lang/String;", "getFileType", "getName", "library_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class NiceFile {
    private val file: File?
    val fileName: String
    val fileType: String?
    val name: String

    constructor(name: String, fileName: String, file: File?, str: String?) {
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(fileName, "fileName")
        this.name = name
        this.fileName = fileName
        this.file = file
        fileType = str
    }

    fun getFile(): File? {
        return file
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    constructor(name: String, value: String) : this(name, value, null, null) {
        Intrinsics.checkNotNullParameter(name, "name")
        Intrinsics.checkNotNullParameter(value, "value")
    }

    /* JADX WARN: Illegal instructions before constructor call */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    constructor(r3: String?, r4: java.io.File?) {
        /*
            r2 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = r4.getName()
            java.lang.String r1 = "file.name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r1 = 0
            r2.<init>(r3, r0, r4, r1)
            return
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.nicehttp.NiceFile.<init>(java.lang.String, java.io.File):void")
    }

    /* JADX WARN: Illegal instructions before constructor call */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    constructor(r3: java.io.File?) {
        /*
            r2 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = r3.getName()
            java.lang.String r1 = "file.name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0, r3)
            return
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.nicehttp.NiceFile.<init>(java.io.File):void")
    }
}