package com.lagradost.cloudstream3

import android.app.Application
import com.blankj.utilcode.util.Utils
import com.lagradost.cloudstream3.utils.AppUtils
import org.acra.ktx.ExtensionsKt
import kotlin.jvm.internal.Intrinsics

/* compiled from: AcraApplication.kt */
@Metadata(
    m108d1 = ["\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\t"],
    m107d2 = ["Lcom/lagradost/cloudstream3/AcraApplication;", "Landroid/app/Application;", "()V", "attachBaseContext", "", TtmlNode.RUBY_BASE, "Landroid/content/Context;", "onCreate", "Companion", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes3.dex */
open class AcraApplication : Application() {
    @Override // android.app.Application
    open fun onCreate() {
        super.onCreate()
        Utils.init(this)
    }

    @Override // android.content.ContextWrapper
    protected fun attachBaseContext(context: Context?) {
        super.attachBaseContext(context)
        AcraApplication.Companion.Companion.setContext(context)
        ExtensionsKt.initAcra(this, `AcraApplication$attachBaseContext$1`.Companion.INSTANCE)
    }

    /* compiled from: AcraApplication.kt */
    @Metadata(
        m108d1 = ["\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u000c\u001a\u0004\u0018\u0001H\r\"\n\b\u0000\u0010\r\u0018\u0001*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0086\b¢\u0006\u0002\u0010\u0010J.\u0010\u000c\u001a\u0004\u0018\u0001H\r\"\n\b\u0000\u0010\r\u0018\u0001*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u0001H\rH\u0086\b¢\u0006\u0002\u0010\u0012J,\u0010\u000c\u001a\u0004\u0018\u0001H\r\"\n\b\u0000\u0010\r\u0018\u0001*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086\b¢\u0006\u0002\u0010\u0014J6\u0010\u000c\u001a\u0004\u0018\u0001H\r\"\n\b\u0000\u0010\r\u0018\u0001*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u0001H\rH\u0086\b¢\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00172\u0006\u0010\u0013\u001a\u00020\u000fJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fJ\u000e\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0002\u0010\u001eJ!\u0010\u001f\u001a\u00020\u0019\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u0002H\r¢\u0006\u0002\u0010 J)\u0010\u001f\u001a\u00020\u0019\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u0002H\r¢\u0006\u0002\u0010!R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00058F@BX\u0086\u000e¢\u0006\u000c\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\""],
        m107d2 = ["Lcom/lagradost/cloudstream3/AcraApplication\$Companion;", "", "()V", "_context", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "value", "context", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getKey", ExifInterface.GPS_DIRECTION_TRUE, "path", "", "(Ljava/lang/String;)Ljava/lang/Object;", "defVal", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "folder", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "getKeys", "", "openBrowser", "", "url", "removeKey", "removeKeys", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "setKey", "(Ljava/lang/String;Ljava/lang/Object;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "app_release"],
        m106k = 1,
        m105mv = [1, 6, 0],
        m103xi = 48
    ) /* loaded from: classes3.dex */
    class Companion private constructor() {
        /* synthetic */   constructor(defaultConstructorMarker: DefaultConstructorMarker?) : this() {}

        /* JADX INFO: Access modifiers changed from: private */
        var context: Context?
            get() {
                val weakReference: WeakReference = AcraApplication.Companion._context
                return if (weakReference != null) {
                    weakReference.get() as Context
                } else null
            }
            set(context) {
                AcraApplication.Companion._context = WeakReference(context)
            }

        fun removeKeys(folder: String?): Integer? {
            Intrinsics.checkNotNullParameter(folder, "folder")
            val context: Context? = context
            return if (context != null) {
                Integer.valueOf(DataStore.INSTANCE.removeKeys(context, folder))
            } else null
        }

        fun <T> setKey(path: String?, t: T) {
            Intrinsics.checkNotNullParameter(path, "path")
            val context: Context? = context
            if (context != null) {
                DataStore.INSTANCE.setKey<T>(context, path, t)
            }
        }

        fun <T> setKey(folder: String?, path: String?, t: T) {
            Intrinsics.checkNotNullParameter(folder, "folder")
            Intrinsics.checkNotNullParameter(path, "path")
            val context: Context? = context
            if (context != null) {
                DataStore.INSTANCE.setKey<T>(context, folder, path, t)
            }
        }

        /* synthetic */  fun <T> getKey(path: String?, t: T): T? {
            Intrinsics.checkNotNullParameter(path, "path")
            val context: Context? = context
            if (context != null) {
                val dataStore: DataStore = DataStore.INSTANCE
                try {
                    val string: String =
                        dataStore.getSharedPrefs(context).getString(path, null) ?: return t
                    Intrinsics.checkNotNullExpressionValue(
                        string,
                        "getSharedPrefs().getStri…h, null) ?: return defVal"
                    )
                    val mapper: JsonMapper = dataStore.getMapper()
                    Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE)
                    val t2 = mapper.readValue<Any>(string, Object::class.java) as T
                    Intrinsics.checkNotNullExpressionValue(
                        t2,
                        "mapper.readValue(this, T::class.java)"
                    )
                    return t2
                } catch (unused: Exception) {
                }
            }
            return null
        }

        /* synthetic */  fun <T> getKey(path: String?): T? {
            Intrinsics.checkNotNullParameter(path, "path")
            val context: Context? = context
            if (context != null) {
                val dataStore: DataStore = DataStore.INSTANCE
                return try {
                    val string: String =
                        dataStore.getSharedPrefs(context).getString(path, null) ?: return null
                    Intrinsics.checkNotNullExpressionValue(
                        string,
                        "getSharedPrefs().getStri…h, null) ?: return defVal"
                    )
                    val mapper: JsonMapper = dataStore.getMapper()
                    Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE)
                    val t = mapper.readValue<Any>(string, Object::class.java) as T
                    Intrinsics.checkNotNullExpressionValue(
                        t,
                        "mapper.readValue(this, T::class.java)"
                    )
                    t
                } catch (unused: Exception) {
                    null
                }
            }
            return null
        }

        /* synthetic */  fun <T> getKey(folder: String?, path: String?): T? {
            Intrinsics.checkNotNullParameter(folder, "folder")
            Intrinsics.checkNotNullParameter(path, "path")
            val context: Context? = context
            if (context != null) {
                val dataStore: DataStore = DataStore.INSTANCE
                return try {
                    val string: String = dataStore.getSharedPrefs(context)
                        .getString(dataStore.getFolderName(folder, path), null)
                        ?: return null
                    Intrinsics.checkNotNullExpressionValue(
                        string,
                        "getSharedPrefs().getStri…h, null) ?: return defVal"
                    )
                    val mapper: JsonMapper = dataStore.getMapper()
                    Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE)
                    val t = mapper.readValue<Any>(string, Object::class.java) as T
                    Intrinsics.checkNotNullExpressionValue(
                        t,
                        "mapper.readValue(this, T::class.java)"
                    )
                    t
                } catch (unused: Exception) {
                    null
                }
            }
            return null
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* synthetic */  fun <T> getKey(folder: String?, path: String?, t: T): T? {
            Intrinsics.checkNotNullParameter(folder, "folder")
            Intrinsics.checkNotNullParameter(path, "path")
            val context: Context? = context
            var t2: T? = null
            if (context != null) {
                val dataStore: DataStore = DataStore.INSTANCE
                try {
                    val string: String = dataStore.getSharedPrefs(context)
                        .getString(dataStore.getFolderName(folder, path), null)
                    t2 = if (string == null) {
                        t
                    } else {
                        Intrinsics.checkNotNullExpressionValue(
                            string,
                            "getSharedPrefs().getStri…h, null) ?: return defVal"
                        )
                        val mapper: JsonMapper = dataStore.getMapper()
                        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE)
                        val readValue: Object = mapper.readValue<Any>(string, Object::class.java)
                        Intrinsics.checkNotNullExpressionValue(
                            readValue,
                            "mapper.readValue(this, T::class.java)"
                        )
                        readValue
                    }
                } catch (unused: Exception) {
                }
                if (t2 == null) {
                    return t
                }
            }
            return t2
        }

        fun getKeys(folder: String?): List<String>? {
            Intrinsics.checkNotNullParameter(folder, "folder")
            val context: Context? = context
            return if (context != null) {
                DataStore.INSTANCE.getKeys(context, folder)
            } else null
        }

        fun removeKey(folder: String?, path: String?) {
            Intrinsics.checkNotNullParameter(folder, "folder")
            Intrinsics.checkNotNullParameter(path, "path")
            val context: Context? = context
            if (context != null) {
                DataStore.INSTANCE.removeKey(context, folder, path)
            }
        }

        fun removeKey(path: String?) {
            Intrinsics.checkNotNullParameter(path, "path")
            val context: Context? = context
            if (context != null) {
                DataStore.INSTANCE.removeKey(context, path)
            }
        }

        fun openBrowser(url: String?) {
            Intrinsics.checkNotNullParameter(url, "url")
            val context: Context? = context
            if (context != null) {
                AppUtils.INSTANCE.openBrowser(context, url)
            }
        }
    }

    companion object {
        @kotlin.jvm.JvmField
        val Companion = Companion(null)
        private val _context: WeakReference<Context>? = null
    }
}