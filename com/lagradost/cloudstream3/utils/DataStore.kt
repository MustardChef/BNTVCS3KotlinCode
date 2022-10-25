package com.lagradost.cloudstream3.utils

import android.content.Context
import kotlin.jvm.internal.Intrinsics

/* compiled from: DataStore.kt */
@Metadata(
    m108d1 = ["\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u0010\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u000f\u001a\u00020\u0010*\u00020\u000e2\u0006\u0010\n\u001a\u00020\bJ\u001a\u0010\u000f\u001a\u00020\u0010*\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\n\u0010\u0011\u001a\u00020\u000c*\u00020\u000eJ(\u0010\u0012\u001a\u0004\u0018\u0001H\u0013\"\n\b\u0000\u0010\u0013\u0018\u0001*\u00020\u0001*\u00020\u000e2\u0006\u0010\n\u001a\u00020\bH\u0086\b¢\u0006\u0002\u0010\u0014J2\u0010\u0012\u001a\u0004\u0018\u0001H\u0013\"\n\b\u0000\u0010\u0013\u0018\u0001*\u00020\u0001*\u00020\u000e2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u0001H\u0013H\u0086\b¢\u0006\u0002\u0010\u0016J0\u0010\u0012\u001a\u0004\u0018\u0001H\u0013\"\n\b\u0000\u0010\u0013\u0018\u0001*\u00020\u0001*\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0086\b¢\u0006\u0002\u0010\u0017J:\u0010\u0012\u001a\u0004\u0018\u0001H\u0013\"\n\b\u0000\u0010\u0013\u0018\u0001*\u00020\u0001*\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u0001H\u0013H\u0086\b¢\u0006\u0002\u0010\u0018J\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001a*\u00020\u000e2\u0006\u0010\t\u001a\u00020\bJ\n\u0010\u001b\u001a\u00020\u000c*\u00020\u000eJ\u0012\u0010\u001c\u001a\u00020\u001d*\u00020\u000e2\u0006\u0010\n\u001a\u00020\bJ\u001a\u0010\u001c\u001a\u00020\u001d*\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u0012\u0010\u001e\u001a\u00020\u001f*\u00020\u000e2\u0006\u0010\t\u001a\u00020\bJ%\u0010 \u001a\u00020\u001d\"\u0004\b\u0000\u0010\u0013*\u00020\u000e2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010!\u001a\u0002H\u0013¢\u0006\u0002\u0010\"J-\u0010 \u001a\u00020\u001d\"\u0004\b\u0000\u0010\u0013*\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010!\u001a\u0002H\u0013¢\u0006\u0002\u0010#J/\u0010$\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u0013*\u00020\u000e2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010!\u001a\u0002H\u00132\b\b\u0002\u0010%\u001a\u00020\u0010¢\u0006\u0002\u0010&J\u001e\u0010'\u001a\u0002H\u0013\"\n\b\u0000\u0010\u0013\u0018\u0001*\u00020\u0001*\u00020\bH\u0086\b¢\u0006\u0002\u0010(R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006)"],
    m107d2 = ["Lcom/lagradost/cloudstream3/utils/DataStore;", "", "()V", "mapper", "Lcom/fasterxml/jackson/databind/json/JsonMapper;", "getMapper", "()Lcom/fasterxml/jackson/databind/json/JsonMapper;", "getFolderName", "", "folder", "path", "getPreferences", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "containsKey", "", "getDefaultSharedPrefs", "getKey", ExifInterface.GPS_DIRECTION_TRUE, "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;", "defVal", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "getKeys", "", "getSharedPrefs", "removeKey", "", "removeKeys", "", "setKey", "value", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "setKeyRaw", "isEditingAppSettings", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;Z)V", "toKotlinObject", "(Ljava/lang/String;)Ljava/lang/Object;", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class DataStore private constructor() {
    val mapper: JsonMapper?
        get() = Companion.mapper

    private fun getPreferences(context: Context): SharedPreferences {
        val sharedPreferences: SharedPreferences =
            context.getSharedPreferences(DataStoreKt.PREFERENCES_NAME, 0)
        Intrinsics.checkNotNullExpressionValue(
            sharedPreferences,
            "context.getSharedPrefere…ME, Context.MODE_PRIVATE)"
        )
        return sharedPreferences
    }

    fun getSharedPrefs(context: Context): SharedPreferences {
        Intrinsics.checkNotNullParameter(context, "<this>")
        return getPreferences(context)
    }

    fun getFolderName(folder: String, path: String): String {
        Intrinsics.checkNotNullParameter(folder, "folder")
        Intrinsics.checkNotNullParameter(path, "path")
        return folder + JsonPointer.SEPARATOR + path
    }

    fun <T> setKeyRaw(context: Context, path: String?, t: T?, z: Boolean) {
        val edit: SharedPreferences.Editor
        val str: String
        Intrinsics.checkNotNullParameter(context, "<this>")
        Intrinsics.checkNotNullParameter(path, "path")
        try {
            if (z) {
                edit = getDefaultSharedPrefs(context).edit()
                str = "getDefaultSharedPrefs().edit()"
            } else {
                edit = getSharedPrefs(context).edit()
                str = "getSharedPrefs().edit()"
            }
            Intrinsics.checkNotNullExpressionValue(edit, str)
            if (t is Boolean) {
                edit.putBoolean(path, (t as Boolean).booleanValue())
            } else if (t is Integer) {
                edit.putInt(path, (t as Number?).intValue())
            } else if (t is String) {
                edit.putString(path, t as String?)
            } else if (t is Float) {
                edit.putFloat(path, (t as Number).floatValue())
            } else if (t is Long) {
                edit.putLong(path, (t as Number).longValue())
            } else {
                if (Intrinsics.areEqual(t, Boolean.valueOf((if (t is Set) t else null) != null))) {
                    if (t == null) {
                        throw NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>")
                    }
                    edit.putStringSet(path, t as Set?)
                }
            }
            edit.apply()
        } catch (e: Exception) {
            ArchComponentExt.logError(e)
        }
    }

    fun getDefaultSharedPrefs(context: Context?): SharedPreferences {
        Intrinsics.checkNotNullParameter(context, "<this>")
        val defaultSharedPreferences: SharedPreferences =
            PreferenceManager.getDefaultSharedPreferences(context)
        Intrinsics.checkNotNullExpressionValue(
            defaultSharedPreferences,
            "getDefaultSharedPreferences(this)"
        )
        return defaultSharedPreferences
    }

    fun getKeys(context: Context, folder: String?): List<String> {
        Intrinsics.checkNotNullParameter(context, "<this>")
        Intrinsics.checkNotNullParameter(folder, "folder")
        val arrayList = ArrayList()
        for (obj in getSharedPrefs(context).getAll().keySet()) {
            val it = obj as String
            Intrinsics.checkNotNullExpressionValue(it, "it")
            if (StringsKt.`startsWith$default`(it, folder, false, 2, null as Object?)) {
                arrayList.add(obj)
            }
        }
        return arrayList
    }

    fun removeKey(context: Context, folder: String, path: String) {
        Intrinsics.checkNotNullParameter(context, "<this>")
        Intrinsics.checkNotNullParameter(folder, "folder")
        Intrinsics.checkNotNullParameter(path, "path")
        removeKey(context, getFolderName(folder, path))
    }

    fun containsKey(context: Context, folder: String, path: String): Boolean {
        Intrinsics.checkNotNullParameter(context, "<this>")
        Intrinsics.checkNotNullParameter(folder, "folder")
        Intrinsics.checkNotNullParameter(path, "path")
        return containsKey(context, getFolderName(folder, path))
    }

    fun containsKey(context: Context, path: String?): Boolean {
        Intrinsics.checkNotNullParameter(context, "<this>")
        Intrinsics.checkNotNullParameter(path, "path")
        return getSharedPrefs(context).contains(path)
    }

    fun removeKey(context: Context, path: String?) {
        Intrinsics.checkNotNullParameter(context, "<this>")
        Intrinsics.checkNotNullParameter(path, "path")
        try {
            val sharedPrefs: SharedPreferences = getSharedPrefs(context)
            if (sharedPrefs.contains(path)) {
                val edit: SharedPreferences.Editor = sharedPrefs.edit()
                Intrinsics.checkNotNullExpressionValue(edit, "prefs.edit()")
                edit.remove(path)
                edit.apply()
            }
        } catch (e: Exception) {
            ArchComponentExt.logError(e)
        }
    }

    fun removeKeys(context: Context, folder: String?): Int {
        Intrinsics.checkNotNullParameter(context, "<this>")
        Intrinsics.checkNotNullParameter(folder, "folder")
        val keys = getKeys(context, folder)
        for (str in keys) {
            INSTANCE.removeKey(context, str)
        }
        return keys.size()
    }

    fun <T> setKey(context: Context, path: String?, t: T) {
        Intrinsics.checkNotNullParameter(context, "<this>")
        Intrinsics.checkNotNullParameter(path, "path")
        try {
            val edit: SharedPreferences.Editor = getSharedPrefs(context).edit()
            Intrinsics.checkNotNullExpressionValue(edit, "getSharedPrefs().edit()")
            edit.putString(path, Companion.mapper.writeValueAsString(t))
            edit.apply()
        } catch (e: Exception) {
            ArchComponentExt.logError(e)
        }
    }

    fun <T> setKey(context: Context, folder: String, path: String, t: T) {
        Intrinsics.checkNotNullParameter(context, "<this>")
        Intrinsics.checkNotNullParameter(folder, "folder")
        Intrinsics.checkNotNullParameter(path, "path")
        setKey(context, getFolderName(folder, path), t)
    }

    /* synthetic */  fun <T> toKotlinObject(str: String?): T {
        Intrinsics.checkNotNullParameter(str, "<this>")
        val mapper2: JsonMapper? = mapper
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE)
        val t = mapper2.readValue<Any>(str, Object::class.java) as T
        Intrinsics.checkNotNullExpressionValue(t, "mapper.readValue(this, T::class.java)")
        return t
    }

    /* synthetic */  fun <T> getKey(context: Context, path: String?, t: T): T? {
        Intrinsics.checkNotNullParameter(context, "<this>")
        Intrinsics.checkNotNullParameter(path, "path")
        return try {
            val string: String = getSharedPrefs(context).getString(path, null) ?: return t
            val mapper2: JsonMapper? = mapper
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE)
            val t2 = mapper2.readValue<Any>(string, Object::class.java) as T
            Intrinsics.checkNotNullExpressionValue(t2, "mapper.readValue(this, T::class.java)")
            t2
        } catch (unused: Exception) {
            null
        }
    }

    /* synthetic */  fun <T> getKey(context: Context, folder: String, path: String): T? {
        Intrinsics.checkNotNullParameter(context, "<this>")
        Intrinsics.checkNotNullParameter(folder, "folder")
        Intrinsics.checkNotNullParameter(path, "path")
        return try {
            val string: String =
                getSharedPrefs(context).getString(getFolderName(folder, path), null)
                    ?: return null
            Intrinsics.checkNotNullExpressionValue(
                string,
                "getSharedPrefs().getStri…h, null) ?: return defVal"
            )
            val mapper2: JsonMapper? = mapper
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE)
            val t = mapper2.readValue<Any>(string, Object::class.java) as T
            Intrinsics.checkNotNullExpressionValue(t, "mapper.readValue(this, T::class.java)")
            t
        } catch (unused: Exception) {
            null
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */  fun <T> getKey(context: Context, folder: String, path: String, t: T): T {
        Intrinsics.checkNotNullParameter(context, "<this>")
        Intrinsics.checkNotNullParameter(folder, "folder")
        Intrinsics.checkNotNullParameter(path, "path")
        val folderName = getFolderName(folder, path)
        var t2: T? = null
        try {
            val string: String = getSharedPrefs(context).getString(folderName, null)
            t2 = if (string == null) {
                t
            } else {
                Intrinsics.checkNotNullExpressionValue(
                    string,
                    "getSharedPrefs().getStri…h, null) ?: return defVal"
                )
                val mapper2: JsonMapper? = mapper
                Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE)
                val readValue: Object = mapper2.readValue<Any>(string, Object::class.java)
                Intrinsics.checkNotNullExpressionValue(
                    readValue,
                    "mapper.readValue(this, T::class.java)"
                )
                readValue
            }
        } catch (unused: Exception) {
        }
        return t2 ?: t
    }

    /* synthetic */  fun <T> getKey(context: Context, path: String?): T? {
        Intrinsics.checkNotNullParameter(context, "<this>")
        Intrinsics.checkNotNullParameter(path, "path")
        return try {
            val string: String = getSharedPrefs(context).getString(path, null) ?: return null
            Intrinsics.checkNotNullExpressionValue(
                string,
                "getSharedPrefs().getStri…h, null) ?: return defVal"
            )
            val mapper2: JsonMapper? = mapper
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE)
            val t = mapper2.readValue<Any>(string, Object::class.java) as T
            Intrinsics.checkNotNullExpressionValue(t, "mapper.readValue(this, T::class.java)")
            t
        } catch (unused: Exception) {
            null
        }
    }

    companion object {
        @kotlin.jvm.JvmField
        val INSTANCE = DataStore()
        private val mapper: JsonMapper? = null

        init {
            val build: JsonMapper = JsonMapper.builder()
                .addModule(KotlinModule(0, false, false, false, null, false, 63, null))
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).build()
            Intrinsics.checkNotNullExpressionValue(
                com.lagradost.cloudstream3.utils.build,
                "builder().addModule(Kotl…ROPERTIES, false).build()"
            )
            mapper = com.lagradost.cloudstream3.utils.build
        }

        fun  /* synthetic */`setKeyRaw$default`(
            dataStore: DataStore,
            context: Context,
            str: String?,
            obj: Object,
            z: Boolean,
            i: Int,
            obj2: Object?
        ) {
            var z = z
            if (i and 4 != 0) {
                z = false
            }
            dataStore.setKeyRaw<Any>(context, str, obj, z)
        }
    }
}