package com.lagradost.cloudstream3.utils

import java.util.LinkedHashSet
import kotlin.jvm.internal.Intrinsics

/* compiled from: Event.kt */
@Metadata(
    m108d1 = ["\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00072\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\u0002J\u001d\u0010\r\u001a\u00020\u00072\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\u0002R \u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"],
    m107d2 = ["Lcom/lagradost/cloudstream3/utils/Event;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "observers", "", "Lkotlin/Function1;", "", "invoke", "value", "(Ljava/lang/Object;)V", "minusAssign", "observer", "plusAssign", "app_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class Event<T> {
    private val observers: Set<Function1<T, Unit>> = LinkedHashSet()
    operator fun plusAssign(observer: Function1<T, Unit>?) {
        Intrinsics.checkNotNullParameter(observer, "observer")
        observers.add(observer)
    }

    operator fun minusAssign(observer: Function1<T, Unit>?) {
        Intrinsics.checkNotNullParameter(observer, "observer")
        observers.remove(observer)
    }

    operator fun invoke(t: T) {
        for (function1 in observers) {
            function1.invoke(t)
        }
    }
}