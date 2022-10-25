package com.lagradost.cloudstream3.utils

import android.app.Activity
import com.fasterxml.jackson.core.type.TypeReference
import kotlin.jvm.internal.Intrinsics

/* compiled from: BackupUtils.kt */
@Metadata(
    m108d1 = ["\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u000b\u001a\u00020\u000c*\u00020\rJ\"\u0010\u000e\u001a\u00020\u000c*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013J2\u0010\u0015\u001a\u00020\u000c\"\u0004\b\u0000\u0010\u0016*\u00020\u000f2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u0016\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u0013H\u0002J\n\u0010\u001a\u001a\u00020\u000c*\u00020\rJ\n\u0010\u001b\u001a\u00020\u000c*\u00020\rR(\u0010\u0003\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u001e"],
    m107d2 = ["Lcom/lagradost/cloudstream3/utils/BackupUtils;", "", "()V", "restoreFileSelector", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "getRestoreFileSelector", "()Landroidx/activity/result/ActivityResultLauncher;", "setRestoreFileSelector", "(Landroidx/activity/result/ActivityResultLauncher;)V", "backup", "", "Landroidx/fragment/app/FragmentActivity;", "restore", "Landroid/content/Context;", "backupFile", "Lcom/lagradost/cloudstream3/utils/BackupUtils\$BackupFile;", "restoreSettings", "", "restoreDataStore", "restoreMap", ExifInterface.GPS_DIRECTION_TRUE, "map", "", "isEditingAppSettings", "restorePrompt", "setUpBackup", "BackupFile", "BackupVars", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class BackupUtils private constructor() {
    var restoreFileSelector: ActivityResultLauncher<Array<String>>
        get() = Companion.restoreFileSelector
        set(activityResultLauncher) {
            Companion.restoreFileSelector = activityResultLauncher
        }

    /* compiled from: BackupUtils.kt */
    @Metadata(
        m108d1 = ["\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0016\b\u0001\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0016\b\u0001\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003\u0012\u0016\b\u0001\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0016\b\u0001\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003\u0012\u0016\b\u0001\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u0003\u0012\u001e\b\u0001\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e\u0018\u00010\u0003¢\u0006\u0002\u0010\u000fJ\u0017\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e\u0018\u00010\u0003HÆ\u0003J¡\u0001\u0010\u001d\u001a\u00020\u00002\u0016\b\u0003\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0003\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00032\u0016\b\u0003\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\b\u0003\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0018\u00010\u00032\u0016\b\u0003\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u00032\u001e\b\u0003\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\t\u0010!\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R'\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006\""],
        m107d2 = ["Lcom/lagradost/cloudstream3/utils/BackupUtils\$BackupVars;", "", "_Bool", "", "", "", "_Int", "", "_String", "_Float", "", "_Long", "", "_StringSet", "", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "get_Bool", "()Ljava/util/Map;", "get_Float", "get_Int", "get_Long", "get_String", "get_StringSet", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class BackupVars(
        @param:JsonProperty("_Bool") private val _Bool: Map<String, Boolean>?,
        @JsonProperty("_Int") map2: Map<String, Integer>?,
        @JsonProperty("_String") map3: Map<String, String>?,
        @JsonProperty("_Float") map4: Map<String, Float>?,
        @JsonProperty("_Long") map5: Map<String, Long>?,
        @JsonProperty("_StringSet") map6: Map<String, Set<String?>?>?
    ) {
        private val _Float: Map<String, Float>?
        private val _Int: Map<String, Integer>?
        private val _Long: Map<String, Long>?
        private val _String: Map<String, String>?
        private val _StringSet: Map<String, Set<String?>?>?
        operator fun component1(): Map<String, Boolean>? {
            return _Bool
        }

        operator fun component2(): Map<String, Integer>? {
            return _Int
        }

        operator fun component3(): Map<String, String>? {
            return _String
        }

        operator fun component4(): Map<String, Float>? {
            return _Float
        }

        operator fun component5(): Map<String, Long>? {
            return _Long
        }

        operator fun component6(): Map<String, Set<String?>?>? {
            return _StringSet
        }

        fun copy(
            @JsonProperty("_Bool") map: Map<String, Boolean>?,
            @JsonProperty("_Int") map2: Map<String, Integer>?,
            @JsonProperty("_String") map3: Map<String, String>?,
            @JsonProperty("_Float") map4: Map<String, Float>?,
            @JsonProperty("_Long") map5: Map<String, Long>?,
            @JsonProperty("_StringSet") map6: Map<String, Set<String?>?>?
        ): BackupVars {
            return BackupVars(map, map2, map3, map4, map5, map6)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is BackupVars) {
                val backupVars = obj as BackupVars
                return Intrinsics.areEqual(_Bool, backupVars._Bool) && Intrinsics.areEqual(
                    _Int, backupVars._Int
                ) && Intrinsics.areEqual(_String, backupVars._String) && Intrinsics.areEqual(
                    _Float, backupVars._Float
                ) && Intrinsics.areEqual(_Long, backupVars._Long) && Intrinsics.areEqual(
                    _StringSet, backupVars._StringSet
                )
            }
            return false
        }

        override fun hashCode(): Int {
            val map = _Bool
            val hashCode = (map?.hashCode() ?: 0) * 31
            val map2: Map<String, Integer>? = _Int
            val hashCode2 = (hashCode + (map2?.hashCode() ?: 0)) * 31
            val map3 = _String
            val hashCode3 = (hashCode2 + (map3?.hashCode() ?: 0)) * 31
            val map4 = _Float
            val hashCode4 = (hashCode3 + (map4?.hashCode() ?: 0)) * 31
            val map5 = _Long
            val hashCode5 = (hashCode4 + (map5?.hashCode() ?: 0)) * 31
            val map6 = _StringSet
            return hashCode5 + (map6?.hashCode() ?: 0)
        }

        override fun toString(): String {
            return "BackupVars(_Bool=" + _Bool + ", _Int=" + _Int + ", _String=" + _String + ", _Float=" + _Float + ", _Long=" + _Long + ", _StringSet=" + _StringSet + ')'
        }

        /* JADX WARN: Multi-variable type inference failed */
        init {
            _Int = map2
            _String = map3
            _Float = map4
            _Long = map5
            _StringSet = map6
        }

        fun get_Bool(): Map<String, Boolean>? {
            return _Bool
        }

        fun get_Int(): Map<String, Integer>? {
            return _Int
        }

        fun get_String(): Map<String, String>? {
            return _String
        }

        fun get_Float(): Map<String, Float>? {
            return _Float
        }

        fun get_Long(): Map<String, Long>? {
            return _Long
        }

        fun get_StringSet(): Map<String, Set<String?>?>? {
            return _StringSet
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                backupVars: BackupVars,
                map: Map?,
                map2: Map?,
                map3: Map?,
                map4: Map?,
                map5: Map?,
                map6: Map?,
                i: Int,
                obj: Object?
            ): BackupVars {
                var map7: Map<String, Boolean>? = map
                if (i and 1 != 0) {
                    map7 = backupVars._Bool
                }
                var map8: Map<String, Integer?>? = map2
                if (i and 2 != 0) {
                    map8 = backupVars._Int
                }
                val map9: Map? = map8
                var map10: Map<String, String?>? = map3
                if (i and 4 != 0) {
                    map10 = backupVars._String
                }
                val map11: Map? = map10
                var map12: Map<String, Float?>? = map4
                if (i and 8 != 0) {
                    map12 = backupVars._Float
                }
                val map13: Map? = map12
                var map14: Map<String, Long?>? = map5
                if (i and 16 != 0) {
                    map14 = backupVars._Long
                }
                val map15: Map? = map14
                var map16: Map<String, Set<String?>?>? = map6
                if (i and 32 != 0) {
                    map16 = backupVars._StringSet
                }
                return backupVars.copy(map7, map9, map11, map13, map15, map16)
            }
        }
    }

    /* compiled from: BackupUtils.kt */
    @Metadata(
        m108d1 = ["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000c\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"],
        m107d2 = ["Lcom/lagradost/cloudstream3/utils/BackupUtils\$BackupFile;", "", "datastore", "Lcom/lagradost/cloudstream3/utils/BackupUtils\$BackupVars;", "settings", "(Lcom/lagradost/cloudstream3/utils/BackupUtils\$BackupVars;Lcom/lagradost/cloudstream3/utils/BackupUtils\$BackupVars;)V", "getDatastore", "()Lcom/lagradost/cloudstream3/utils/BackupUtils\$BackupVars;", "getSettings", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes4.dex */
    class BackupFile(
        @JsonProperty("datastore") datastore: BackupVars,
        @JsonProperty("settings") settings: BackupVars
    ) {
        val datastore: BackupVars
        val settings: BackupVars
        operator fun component1(): BackupVars {
            return datastore
        }

        operator fun component2(): BackupVars {
            return settings
        }

        fun copy(
            @JsonProperty("datastore") datastore: BackupVars,
            @JsonProperty("settings") settings: BackupVars
        ): BackupFile {
            Intrinsics.checkNotNullParameter(datastore, "datastore")
            Intrinsics.checkNotNullParameter(settings, "settings")
            return BackupFile(datastore, settings)
        }

        override fun equals(obj: Object): Boolean {
            if (this === obj) {
                return true
            }
            if (obj is BackupFile) {
                val backupFile = obj as BackupFile
                return Intrinsics.areEqual(datastore, backupFile.datastore) && Intrinsics.areEqual(
                    settings, backupFile.settings
                )
            }
            return false
        }

        override fun hashCode(): Int {
            return datastore.hashCode() * 31 + settings.hashCode()
        }

        override fun toString(): String {
            return "BackupFile(datastore=" + datastore + ", settings=" + settings + ')'
        }

        init {
            Intrinsics.checkNotNullParameter(datastore, "datastore")
            Intrinsics.checkNotNullParameter(settings, "settings")
            this.datastore = datastore
            this.settings = settings
        }

        companion object {
            fun  /* synthetic */`copy$default`(
                backupFile: BackupFile,
                backupVars: BackupVars,
                backupVars2: BackupVars,
                i: Int,
                obj: Object?
            ): BackupFile {
                var backupVars = backupVars
                var backupVars2 = backupVars2
                if (i and 1 != 0) {
                    backupVars = backupFile.datastore
                }
                if (i and 2 != 0) {
                    backupVars2 = backupFile.settings
                }
                return backupFile.copy(backupVars, backupVars2)
            }
        }
    }

    fun backup(fragmentActivity: FragmentActivity) {
        val openOutputStream: OutputStream
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>")
        try {
            if (UIHelper.Companion.INSTANCE.checkWrite(fragmentActivity)) {
                val first: UniFile =
                    VideoDownloadManager.Companion.INSTANCE.getBasePath(fragmentActivity).getFirst()
                val str =
                    "CS3_Backup_" + SimpleDateFormat("yyyy_MM_dd_HH_mm").format(Date(System.currentTimeMillis()))
                val allData: Map<String, *> =
                    DataStore.Companion.INSTANCE.getSharedPrefs(fragmentActivity).getAll()
                val allSettings: Map<String, *> =
                    DataStore.Companion.INSTANCE.getDefaultSharedPrefs(fragmentActivity).getAll()
                Intrinsics.checkNotNullExpressionValue(allData, "allData")
                val linkedHashMap = LinkedHashMap()
                for (entry in allData.entrySet()) {
                    if (entry.getValue() is Boolean) {
                        linkedHashMap.put(entry.getKey(), entry.getValue())
                    }
                }
                val linkedHashMap2: LinkedHashMap? =
                    if (linkedHashMap is Map) linkedHashMap else null
                val linkedHashMap3 = LinkedHashMap()
                for (entry2 in allData.entrySet()) {
                    if (entry2.getValue() is Integer) {
                        linkedHashMap3.put(entry2.getKey(), entry2.getValue())
                    }
                }
                val linkedHashMap4: LinkedHashMap? =
                    if (linkedHashMap3 is Map) linkedHashMap3 else null
                val linkedHashMap5 = LinkedHashMap()
                for (entry3 in allData.entrySet()) {
                    if (entry3.getValue() is String) {
                        linkedHashMap5.put(entry3.getKey(), entry3.getValue())
                    }
                }
                val linkedHashMap6: LinkedHashMap? =
                    if (linkedHashMap5 is Map) linkedHashMap5 else null
                val linkedHashMap7 = LinkedHashMap()
                for (entry4 in allData.entrySet()) {
                    if (entry4.getValue() is Float) {
                        linkedHashMap7.put(entry4.getKey(), entry4.getValue())
                    }
                }
                val linkedHashMap8: LinkedHashMap? =
                    if (linkedHashMap7 is Map) linkedHashMap7 else null
                val linkedHashMap9 = LinkedHashMap()
                for (entry5 in allData.entrySet()) {
                    if (entry5.getValue() is Long) {
                        linkedHashMap9.put(entry5.getKey(), entry5.getValue())
                    }
                }
                val linkedHashMap10: LinkedHashMap? =
                    if (linkedHashMap9 is Map) linkedHashMap9 else null
                val linkedHashMap11 = LinkedHashMap()
                for (entry6 in allData.entrySet()) {
                    val value: Object = entry6.getValue()
                    if ((if (value is Set) value else null) != null) {
                        linkedHashMap11.put(entry6.getKey(), entry6.getValue())
                    }
                }
                val backupVars = BackupVars(
                    linkedHashMap2,
                    linkedHashMap4,
                    linkedHashMap6,
                    linkedHashMap8,
                    linkedHashMap10,
                    if (linkedHashMap11 is Map) linkedHashMap11 else null
                )
                Intrinsics.checkNotNullExpressionValue(allSettings, "allSettings")
                val linkedHashMap12 = LinkedHashMap()
                for (entry7 in allSettings.entrySet()) {
                    if (entry7.getValue() is Boolean) {
                        linkedHashMap12.put(entry7.getKey(), entry7.getValue())
                    }
                }
                val linkedHashMap13: LinkedHashMap? =
                    if (linkedHashMap12 is Map) linkedHashMap12 else null
                val linkedHashMap14 = LinkedHashMap()
                for (entry8 in allSettings.entrySet()) {
                    if (entry8.getValue() is Integer) {
                        linkedHashMap14.put(entry8.getKey(), entry8.getValue())
                    }
                }
                val linkedHashMap15: LinkedHashMap? =
                    if (linkedHashMap14 is Map) linkedHashMap14 else null
                val linkedHashMap16 = LinkedHashMap()
                for (entry9 in allSettings.entrySet()) {
                    if (entry9.getValue() is String) {
                        linkedHashMap16.put(entry9.getKey(), entry9.getValue())
                    }
                }
                val linkedHashMap17: LinkedHashMap? =
                    if (linkedHashMap16 is Map) linkedHashMap16 else null
                val linkedHashMap18 = LinkedHashMap()
                for (entry10 in allSettings.entrySet()) {
                    if (entry10.getValue() is Float) {
                        linkedHashMap18.put(entry10.getKey(), entry10.getValue())
                    }
                }
                val linkedHashMap19: LinkedHashMap? =
                    if (linkedHashMap18 is Map) linkedHashMap18 else null
                val linkedHashMap20 = LinkedHashMap()
                for (entry11 in allSettings.entrySet()) {
                    if (entry11.getValue() is Long) {
                        linkedHashMap20.put(entry11.getKey(), entry11.getValue())
                    }
                }
                val linkedHashMap21: LinkedHashMap? =
                    if (linkedHashMap20 is Map) linkedHashMap20 else null
                val linkedHashMap22 = LinkedHashMap()
                for (entry12 in allSettings.entrySet()) {
                    val value2: Object = entry12.getValue()
                    if ((if (value2 is Set) value2 else null) != null) {
                        linkedHashMap22.put(entry12.getKey(), entry12.getValue())
                    }
                }
                val backupFile = BackupFile(
                    backupVars,
                    BackupVars(
                        linkedHashMap13,
                        linkedHashMap15,
                        linkedHashMap17,
                        linkedHashMap19,
                        linkedHashMap21,
                        if (linkedHashMap22 is Map) linkedHashMap22 else null
                    )
                )
                if (Build.VERSION.SDK_INT >= 29) {
                    if (first != null && VideoDownloadManager.Companion.INSTANCE.isDownloadDir(first)) {
                        val contentResolver: ContentResolver = fragmentActivity.getContentResolver()
                        val contentUri: Uri = MediaStore.Downloads.getContentUri("external_primary")
                        Intrinsics.checkNotNullExpressionValue(
                            contentUri,
                            "getContentUri(MediaStore.VOLUME_EXTERNAL_PRIMARY)"
                        )
                        val contentValues = ContentValues()
                        contentValues.put("_display_name", str)
                        contentValues.put("title", str)
                        contentValues.put("mime_type", AbstractSpiCall.ACCEPT_JSON_VALUE)
                        val unit = Unit.INSTANCE
                        val insert: Uri = contentResolver.insert(contentUri, contentValues)
                            ?: throw IOException("Error creating file uri")
                        openOutputStream = contentResolver.openOutputStream(insert, "w")
                        if (openOutputStream == null) {
                            throw IOException("Error opening stream")
                        }
                        Intrinsics.checkNotNullExpressionValue(
                            openOutputStream,
                            "if (Build.VERSION.SDK_IN…m()\n                    }"
                        )
                        val printWriter = PrintWriter(openOutputStream)
                        printWriter.print(
                            DataStore.Companion.INSTANCE.getMapper().writeValueAsString(backupFile)
                        )
                        printWriter.close()
                        CommonActivity.INSTANCE.showToast(
                            fragmentActivity,
                            R.string.backup_success,
                            1
                        )
                        return
                    }
                }
                val str2 = "$str.json"
                val findFile: UniFile? = if (first != null) first.findFile(str2) else null
                if (findFile != null && findFile.exists()) {
                    findFile.delete()
                }
                val createFile: UniFile = (if (first != null) first.createFile(str2) else null)
                    ?: throw IOException("Error creating file")
                if (!createFile.exists()) {
                    throw IOException("File does not exist")
                }
                openOutputStream = createFile.openOutputStream()
                Intrinsics.checkNotNullExpressionValue(
                    openOutputStream,
                    "if (Build.VERSION.SDK_IN…m()\n                    }"
                )
                val printWriter2 = PrintWriter(openOutputStream)
                printWriter2.print(
                    DataStore.Companion.INSTANCE.getMapper().writeValueAsString(backupFile)
                )
                printWriter2.close()
                CommonActivity.INSTANCE.showToast(fragmentActivity, R.string.backup_success, 1)
                return
            }
            CommonActivity.INSTANCE.showToast(
                fragmentActivity as Activity,
                fragmentActivity.getString(R.string.backup_failed),
                1 as Integer
            )
            UIHelper.Companion.INSTANCE.requestRW(fragmentActivity)
        } catch (e: Exception) {
            ArchComponentExt.logError(e)
            try {
                val string: String = fragmentActivity.getString(R.string.backup_failed_error_format)
                Intrinsics.checkNotNullExpressionValue(
                    string,
                    "getString(R.string.backup_failed_error_format)"
                )
                val format: String =
                    String.format(string, Arrays.copyOf(arrayOf<Object>(e.toString()), 1))
                Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)")
                CommonActivity.INSTANCE.showToast(
                    fragmentActivity as Activity,
                    format,
                    1 as Integer
                )
            } catch (e2: Exception) {
                ArchComponentExt.logError(e2)
            }
        }
    }

    fun setUpBackup(fragmentActivity: FragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>")
        try {
            Companion.restoreFileSelector = fragmentActivity.registerForActivityResult(
                OpenDocument(),
                object : ActivityResultCallback<Any?> {
                    // from class: com.lagradost.cloudstream3.utils.-$$Lambda$BackupUtils$oW8X6wdZUsCXnsRKWfbtobfBmb4
                    @Override // androidx.activity.result.ActivityResultCallback
                    override fun onActivityResult(obj: Object) {
                        `m8996setUpBackup$lambda15`(this@FragmentActivity, obj as Uri)
                    }
                })
        } catch (e: Exception) {
            ArchComponentExt.logError(e)
        }
    }

    fun restorePrompt(fragmentActivity: FragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>")
        fragmentActivity.runOnUiThread(object : Runnable() {
            // from class: com.lagradost.cloudstream3.utils.-$$Lambda$BackupUtils$VK90u8xQRPBNaj5jOdCbXboLf4M
            @Override // java.lang.Runnable
            fun run() {
                `m8995restorePrompt$lambda16`(this@FragmentActivity)
            }
        })
    }

    fun restore(context: Context, backupFile: BackupFile, z: Boolean, z2: Boolean) {
        Intrinsics.checkNotNullParameter(context, "<this>")
        Intrinsics.checkNotNullParameter(backupFile, "backupFile")
        if (z) {
            restoreMap<Any>(context, backupFile.settings.get_Bool(), true)
            restoreMap<Any>(context, backupFile.settings.get_Int(), true)
            restoreMap<Any>(context, backupFile.settings.get_String(), true)
            restoreMap<Any>(context, backupFile.settings.get_Float(), true)
            restoreMap<Any>(context, backupFile.settings.get_Long(), true)
            restoreMap<Any?>(context, backupFile.settings.get_StringSet(), true)
        }
        if (z2) {
            `restoreMap$default`(this, context, backupFile.datastore.get_Bool(), false, 2, null)
            `restoreMap$default`(this, context, backupFile.datastore.get_Int(), false, 2, null)
            `restoreMap$default`(this, context, backupFile.datastore.get_String(), false, 2, null)
            `restoreMap$default`(this, context, backupFile.datastore.get_Float(), false, 2, null)
            `restoreMap$default`(this, context, backupFile.datastore.get_Long(), false, 2, null)
            `restoreMap$default`(
                this,
                context,
                backupFile.datastore.get_StringSet(),
                false,
                2,
                null
            )
        }
    }

    private fun <T> restoreMap(context: Context, map: Map<String, T?>?, z: Boolean) {
        if (map != null) {
            for (entry in map.entrySet()) {
                DataStore.Companion.INSTANCE.setKeyRaw(context, entry.getKey(), entry.getValue(), z)
            }
        }
    }

    companion object {
        @kotlin.jvm.JvmField
        val INSTANCE = BackupUtils()
        private var restoreFileSelector: ActivityResultLauncher<Array<String>>? = null

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: setUpBackup$lambda-15  reason: not valid java name */
        fun `m8996setUpBackup$lambda15`(this_setUpBackup: FragmentActivity, uri: Uri?) {
            Intrinsics.checkNotNullParameter(this_setUpBackup, "\$this_setUpBackup")
            if (uri != null) {
                try {
                    val openInputStream: InputStream =
                        this_setUpBackup.getContentResolver().openInputStream(uri)
                            ?: return
                    Intrinsics.checkNotNullExpressionValue(
                        openInputStream,
                        "activity.contentResolver…registerForActivityResult"
                    )
                    INSTANCE.restore(
                        this_setUpBackup,
                        DataStore.Companion.INSTANCE.getMapper().readValue<BackupFile>(
                            openInputStream,
                            object :
                                TypeReference<BackupFile?>() { // from class: com.lagradost.cloudstream3.utils.BackupUtils$setUpBackup$lambda-15$lambda-14$lambda-13$$inlined$readValue$1
                            }) as BackupFile,
                        true,
                        true
                    )
                    this_setUpBackup.recreate()
                } catch (e: Exception) {
                    ArchComponentExt.logError(e)
                    try {
                        val commonActivity: CommonActivity = CommonActivity.INSTANCE
                        val fragmentActivity: FragmentActivity = this_setUpBackup
                        val string: String =
                            this_setUpBackup.getString(R.string.restore_failed_format)
                        Intrinsics.checkNotNullExpressionValue(
                            string,
                            "getString(R.string.restore_failed_format)"
                        )
                        val format: String =
                            String.format(string, Arrays.copyOf(arrayOf<Object>(e.toString()), 1))
                        Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)")
                        CommonActivity.`showToast$default`(
                            commonActivity,
                            fragmentActivity,
                            format,
                            null,
                            4,
                            null
                        )
                    } catch (e2: Exception) {
                        ArchComponentExt.logError(e2)
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: restorePrompt$lambda-16  reason: not valid java name */
        fun `m8995restorePrompt$lambda16`(this_restorePrompt: FragmentActivity?) {
            Intrinsics.checkNotNullParameter(this_restorePrompt, "\$this_restorePrompt")
            try {
                val activityResultLauncher: ActivityResultLauncher<Array<String>>? =
                    restoreFileSelector
                if (activityResultLauncher != null) {
                    activityResultLauncher.launch(
                        arrayOf(
                            "text/plain",
                            "text/str",
                            MimeTypes.TEXT_UNKNOWN,
                            AbstractSpiCall.ACCEPT_JSON_VALUE,
                            "unknown/unknown",
                            "content/unknown"
                        )
                    )
                }
            } catch (e: Exception) {
                CommonActivity.`showToast$default`(
                    CommonActivity.INSTANCE,
                    this_restorePrompt,
                    e.getMessage(),
                    null,
                    4,
                    null
                )
                ArchComponentExt.logError(e)
            }
        }

        fun  /* synthetic */`restoreMap$default`(
            backupUtils: BackupUtils,
            context: Context,
            map: Map?,
            z: Boolean,
            i: Int,
            obj: Object?
        ) {
            var z = z
            if (i and 2 != 0) {
                z = false
            }
            backupUtils.restoreMap(context, map, z)
        }
    }
}