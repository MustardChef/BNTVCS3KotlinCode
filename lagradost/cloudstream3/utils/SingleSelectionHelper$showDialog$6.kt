package com.lagradost.cloudstream3.utils

import java.util.List
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: SingleSelectionHelper.kt */
@Metadata(
    m108d1 = ["\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"],
    m107d2 = ["<anonymous>", "", "it", "", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class `SingleSelectionHelper$showDialog$6`(function1: Function1<Integer?, Unit>) : Lambda<Any?>(1),
    Function1<List<Integer?>, Unit> {
    /* synthetic */ val `$callback`: Function1<Integer, Unit>

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$callback` = function1
    }

    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override fun invoke(list: List<Integer?>) {
        invoke2(list as List<Integer?>)
        return Unit.INSTANCE
    }

    /* JADX WARN: Multi-variable type inference failed */ /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(it: List<Integer?>) {
        Intrinsics.checkNotNullParameter(it, "it")
        if (!it.isEmpty()) {
            `$callback`.invoke(CollectionsKt.first(it as List<Object?>))
        }
    }
}