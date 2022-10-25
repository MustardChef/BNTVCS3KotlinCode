package com.lagradost.cloudstream3.utils

import android.media.AudioManager

/* compiled from: lambda */ /* renamed from: com.lagradost.cloudstream3.utils.-$$Lambda$AppUtils$JqLl3xBEk0g6nRiHno8HbRudteo  reason: invalid class name */ /* loaded from: classes4.dex */
/* synthetic */  class `$$Lambda$AppUtils$JqLl3xBEk0g6nRiHno8HbRudteo` private /* synthetic */   constructor() :
    AudioManager.OnAudioFocusChangeListener {
    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    fun onAudioFocusChange(i: Int) {
        AppUtils.Companion.`m8990getAudioListener$lambda5`(i)
    }

    companion object {
        /* synthetic */ val INSTANCE = `$$Lambda$AppUtils$JqLl3xBEk0g6nRiHno8HbRudteo`()
    }
}