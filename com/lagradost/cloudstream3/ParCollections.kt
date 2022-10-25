package com.lagradost.cloudstream3

import java.util.List
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function3
import kotlin.jvm.internal.Intrinsics

@Metadata(
    m108d1 = ["\u0000B\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\\\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\"\u0004\b\u0000\u0010\u00032>\u0010\u0004\u001a \u0012\u001c\b\u0001\u0012\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00060\u0005\"\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006ø\u0001\u0000¢\u0006\u0002\u0010\b\u001aN\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u0002H\u000b0\u00012\"\u0010\u000c\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\rø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001ah\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u000f\"\u0004\b\u0001\u0010\u0010\"\u0004\b\u0002\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u00100\u00112.\u0010\u000c\u001a*\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u00100\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\rø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001ac\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u0002H\u000b0\u000127\u0010\u000c\u001a3\b\u0001\u0012\u0013\u0012\u00110\u0016¢\u0006\u000c\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u0002H\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0015ø\u0001\u0000¢\u0006\u0002\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"],
    m107d2 = ["argamap", "", "", "R", "transforms", "", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "([Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "apmap", "B", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "f", "Lkotlin/Function2;", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "", "(Ljava/util/Map;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "apmapIndexed", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", FirebaseAnalytics.Param.INDEX, "(Ljava/util/List;Lkotlin/jvm/functions/Function3;)Ljava/util/List;", "app_release"],
    m106k = 2,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ParCollectionsKt */ /* loaded from: classes3.dex */
object ParCollections {
    fun <K, V, R> apmap(
        map: Map<out K?, V?>?,
        f: Function2<Map.Entry<K?, V?>?, Continuation<in R?>?, Object?>?
    ): List<R> {
        val `runBlocking$default`: Object
        Intrinsics.checkNotNullParameter(map, "<this>")
        Intrinsics.checkNotNullParameter(f, "f")
        `runBlocking$default` = BuildersKt__BuildersKt.`runBlocking$default`(
            null,
            `ParCollectionsKt$apmap$1`(map, f, null),
            1,
            null
        )
        return `runBlocking$default`
    }

    @kotlin.jvm.JvmStatic
    fun <A, B> apmap(list: List<A?>?, f: Function2<A?, Continuation<in B?>?, Object?>?): List<B> {
        val `runBlocking$default`: Object
        Intrinsics.checkNotNullParameter(list, "<this>")
        Intrinsics.checkNotNullParameter(f, "f")
        `runBlocking$default` = BuildersKt__BuildersKt.`runBlocking$default`(
            null,
            `ParCollectionsKt$apmap$2`(list, f, null),
            1,
            null
        )
        return `runBlocking$default`
    }

    @kotlin.jvm.JvmStatic
    fun <A, B> apmapIndexed(
        list: List<A?>?,
        f: Function3<in Integer?, in A?, in Continuation<in B?>?, out Object?>?
    ): List<B> {
        val `runBlocking$default`: Object
        Intrinsics.checkNotNullParameter(list, "<this>")
        Intrinsics.checkNotNullParameter(f, "f")
        `runBlocking$default` = BuildersKt__BuildersKt.`runBlocking$default`(
            null,
            `ParCollectionsKt$apmapIndexed$1`(list, f, null),
            1,
            null
        )
        return `runBlocking$default`
    }

    @kotlin.jvm.JvmStatic
    fun <R> argamap(vararg transforms: Function1<Continuation<in R?>?, Object?>?): List<Object> {
        val `runBlocking$default`: Object
        Intrinsics.checkNotNullParameter(transforms, "transforms")
        `runBlocking$default` = BuildersKt__BuildersKt.`runBlocking$default`(
            null,
            `ParCollectionsKt$argamap$1`(transforms, null),
            1,
            null
        )
        return `runBlocking$default`
    }
}