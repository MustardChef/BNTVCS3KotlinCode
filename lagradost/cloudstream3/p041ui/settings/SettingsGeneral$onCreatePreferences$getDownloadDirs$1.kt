package com.lagradost.cloudstream3.p041ui.settings

import android.content.Context
import kotlin.jvm.functions.Functions
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: SettingsGeneral.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.settings.SettingsGeneral$onCreatePreferences$getDownloadDirs$1 */ /* loaded from: classes4.dex */
class `SettingsGeneral$onCreatePreferences$getDownloadDirs$1`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(  /* synthetic */
    val `this$0`: SettingsGeneral
) : Lambda<Any?>(0), Functions<List<String?>?> {
    @Override // kotlin.jvm.functions.Functions
    public override fun invoke(): List<String?> {
        var basePath: Tuples<UniFile, String?>
        var first: UniFile
        val downloadDir: UniFile? = VideoDownloadManager.INSTANCE.downloadDir
        var str: String? = null
        var listOf: List = CollectionsKt.listOf<Object>(
            *arrayOf<String?>(
                if (downloadDir != null) downloadDir.getFilePath() else null,
                if (Build.VERSION.SDK_INT >= 29) null else Environment.getExternalStorageDirectory()
                    .getAbsolutePath() + File.separator + `this$0`.getResources()
                    .getString(R.string.app_name_download_path)
            ) as Array<Object?>
        )
        try {
            val context: Context? = `this$0`.getContext()
            if ((context != null) && ((VideoDownloadManager.INSTANCE.getBasePath(context)
                    .also({ basePath = it })) != null) && ((basePath.getFirst()
                    .also({ first = it })) == null || (first.getFilePath()
                    .also({ str = it })) == null)
            ) {
                str = basePath.getSecond()
            }
            val list: List = listOf
            val externalFilesDirs: Array<File> = `this$0`.requireContext().getExternalFilesDirs("")
            Intrinsics.checkNotNullExpressionValue(
                externalFilesDirs,
                "requireContext().getExternalFilesDirs(\"\")"
            )
            val arrayList: ArrayList = ArrayList()
            for (file: File in externalFilesDirs) {
                val path: String? = file.getPath()
                if (path != null) {
                    arrayList.add(path)
                }
            }
            listOf = CollectionsKt.plus(
                CollectionsKt.plus(
                    list as Collection?,
                    arrayList as Iterable?
                ) as Collection<String?>?, str
            )
        } catch (unused: Exception) {
        }
        return CollectionsKt.distinct(CollectionsKt.filterNotNull(listOf))
    }
}