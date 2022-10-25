package com.phimhd

import com.google.gson.annotations.SerializedName

/* loaded from: classes4.dex */
class Version {
    var description: String? = null
    var isRequired = false
    var linkApk: String? = null
    var typeUpdate = 0

    @SerializedName("value")
    var version: String? = null
}