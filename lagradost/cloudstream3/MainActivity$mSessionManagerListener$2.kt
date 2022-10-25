package com.lagradost.cloudstream3

import kotlin.jvm.functions.Functions

/* compiled from: MainActivity.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00060\u0001R\u00020\u0002H\n¢\u0006\u0002\b\u0003"],
    m107d2 = ["<anonymous>", "Lcom/lagradost/cloudstream3/MainActivity\$SessionManagerListenerImpl;", "Lcom/lagradost/cloudstream3/MainActivity;", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
/* loaded from: classes3.dex */
internal class `MainActivity$mSessionManagerListener$2`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */(  /* synthetic */
    val `this$0`: MainActivity
) : Lambda<Any?>(0), Functions<SessionManagerListenerImpl?> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    override fun invoke(): SessionManagerListenerImpl {
        return SessionManagerListenerImpl()
    }
}