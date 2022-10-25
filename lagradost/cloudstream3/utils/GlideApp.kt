package com.lagradost.cloudstream3.utils

import android.app.Activity
import androidx.fragment.app.Fragment

/* loaded from: classes4.dex */
object GlideApp {
    fun getPhotoCacheDir(context: Context?): File {
        return Glide.getPhotoCacheDir(context)
    }

    fun getPhotoCacheDir(context: Context?, str: String?): File {
        return Glide.getPhotoCacheDir(context, str)
    }

    operator fun get(context: Context?): Glide {
        return Glide.get(context)
    }

    @Deprecated
    fun init(glide: Glide?) {
        Glide.init(glide)
    }

    fun init(context: Context?, glideBuilder: GlideBuilder?) {
        Glide.init(context, glideBuilder)
    }

    fun enableHardwareBitmaps() {
        Glide.enableHardwareBitmaps()
    }

    fun tearDown() {
        Glide.tearDown()
    }

    fun with(context: Context?): GlideRequests {
        return Glide.with(context)
    }

    fun with(activity: Activity?): GlideRequests {
        return Glide.with(activity)
    }

    fun with(fragmentActivity: FragmentActivity?): GlideRequests {
        return Glide.with(fragmentActivity)
    }

    fun with(fragment: Fragment?): GlideRequests {
        return Glide.with(fragment)
    }

    @Deprecated
    fun with(fragment: android.app.Fragment?): GlideRequests {
        return Glide.with(fragment)
    }

    fun with(view: View?): GlideRequests {
        return Glide.with(view)
    }
}