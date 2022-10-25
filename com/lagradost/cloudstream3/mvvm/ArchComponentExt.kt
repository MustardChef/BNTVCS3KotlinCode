package com.lagradost.cloudstream3.mvvm

import android.util.Log
import androidx.lifecycle.Observer
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Functions
import kotlin.jvm.internal.Intrinsics

@Metadata(
    m108d1 = ["\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a!\u0010\u0004\u001a\u0004\u0018\u0001H\u0005\"\u0004\b\u0000\u0010\u00052\u000c\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0007¢\u0006\u0002\u0010\b\u001a;\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\n\"\u0004\b\u0000\u0010\u00052\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u000c\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00050\n\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a7\u0010\u0010\u001a\u0004\u0018\u0001H\u0005\"\u0004\b\u0000\u0010\u00052\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u000c\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001aA\u0010\u0011\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0005*\u00020\u00122\u000c\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00142!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u0011H\u0005¢\u0006\u000c\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00010\u000b\u001aA\u0010\u0019\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0005*\u00020\u00122\u000c\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00142!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u0011H\u0005¢\u0006\u000c\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"],
    m107d2 = ["logError", "", "throwable", "", "normalSafeApiCall", ExifInterface.GPS_DIRECTION_TRUE, "apiCall", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "safeApiCall", "Lcom/lagradost/cloudstream3/mvvm/Resource;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "safeFail", "suspendSafeApiCall", "observe", "Landroidx/lifecycle/LifecycleOwner;", "liveData", "Landroidx/lifecycle/LiveData;", "action", "Lkotlin/ParameterName;", "name", "t", "observeDirectly", "app_release"],
    m106k = 2,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.mvvm.ArchComponentExtKt */ /* loaded from: classes3.dex */
object ArchComponentExt {
    fun <T> observe(
        lifecycleOwner: LifecycleOwner?,
        liveData: LiveData<T>,
        action: Function1<T, Unit>?
    ) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<this>")
        Intrinsics.checkNotNullParameter(liveData, "liveData")
        Intrinsics.checkNotNullParameter(action, "action")
        liveData.observe(lifecycleOwner, // androidx.lifecycle.Observer
            Observer<Any?> { obj ->
                // from class: com.lagradost.cloudstream3.mvvm.-$$Lambda$ArchComponentExtKt$qLsgs792J5t3k3YZ5E-ohHCNS24
                `m8602observe$lambda1`(this@Function1, obj)
            })
    }

    /* JADX INFO: Access modifiers changed from: private */ /* renamed from: observe$lambda-1  reason: not valid java name */
    fun `m8602observe$lambda1`(action: Function1<*, *>, obj: Object?) {
        Intrinsics.checkNotNullParameter(action, "\$action")
        if (obj != null) {
            action.invoke(obj)
        }
    }

    fun <T> observeDirectly(
        lifecycleOwner: LifecycleOwner?,
        liveData: LiveData<T>,
        action: Function1<T, Unit>
    ) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<this>")
        Intrinsics.checkNotNullParameter(liveData, "liveData")
        Intrinsics.checkNotNullParameter(action, "action")
        liveData.observe(lifecycleOwner, // androidx.lifecycle.Observer
            Observer<Any?> { obj ->
                // from class: com.lagradost.cloudstream3.mvvm.-$$Lambda$ArchComponentExtKt$pNGfDi5fVwN_n0Jng1O6cIC8pw0
                `m8603observeDirectly$lambda3`(this@Function1, obj)
            })
        val value: T = liveData.getValue()
        if (value != null) {
            action.invoke(value)
        }
    }

    /* JADX INFO: Access modifiers changed from: private */ /* renamed from: observeDirectly$lambda-3  reason: not valid java name */
    fun `m8603observeDirectly$lambda3`(action: Function1<*, *>, obj: Object?) {
        Intrinsics.checkNotNullParameter(action, "\$action")
        if (obj != null) {
            action.invoke(obj)
        }
    }

    @JvmStatic
    fun logError(throwable: Throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable")
        Log.d("ApiError", "-------------------------------------------------------------------")
        Log.d("ApiError", "safeApiCall: " + throwable.getLocalizedMessage())
        Log.d("ApiError", "safeApiCall: " + throwable.getMessage())
        throwable.printStackTrace()
        Log.d("ApiError", "-------------------------------------------------------------------")
    }

    fun <T> normalSafeApiCall(apiCall: Functions<out T>): T? {
        Intrinsics.checkNotNullParameter(apiCall, "apiCall")
        return try {
            apiCall.invoke()
        } catch (th: Throwable) {
            logError(th)
            null
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */ /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */ /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    @JvmStatic
    fun <T> suspendSafeApiCall(
        r4: Function1<Continuation<in T?>?, Any?>?,
        r5: Continuation<in T?>?
    ): Any {
        /*
            boolean r0 = r5 instanceof com.lagradost.cloudstream3.mvvm.ArchComponentExtKt$suspendSafeApiCall$1
            if (r0 == 0) goto L14
            r0 = r5
            com.lagradost.cloudstream3.mvvm.ArchComponentExtKt$suspendSafeApiCall$1 r0 = (com.lagradost.cloudstream3.mvvm.ArchComponentExtKt$suspendSafeApiCall$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.label
            int r5 = r5 - r2
            r0.label = r5
            goto L19
        L14:
            com.lagradost.cloudstream3.mvvm.ArchComponentExtKt$suspendSafeApiCall$1 r0 = new com.lagradost.cloudstream3.mvvm.ArchComponentExtKt$suspendSafeApiCall$1
            r0.<init>(r5)
        L19:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Throwable -> L2a
            goto L40
        L2a:
            r4 = move-exception
            goto L41
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            kotlin.ResultKt.throwOnFailure(r5)
            r0.label = r3     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r5 = r4.invoke(r0)     // Catch: java.lang.Throwable -> L2a
            if (r5 != r1) goto L40
            return r1
        L40:
            return r5
        L41:
            logError(r4)
            r4 = 0
            return r4
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.mvvm.ArchComponentExt.suspendSafeApiCall(kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object")
    }

    fun <T> safeFail(throwable: Throwable): Resource<T> {
        Intrinsics.checkNotNullParameter(throwable, "throwable")
        val sb = StringBuilder()
        var localizedMessage: String = throwable.getLocalizedMessage()
        if (localizedMessage == null) {
            localizedMessage = ""
        }
        sb.append(localizedMessage)
        sb.append("\n\n")
        val stackTrace: Array<StackTraceElement> = throwable.getStackTrace()
        Intrinsics.checkNotNullExpressionValue(stackTrace, "throwable.stackTrace")
        sb.append(
            ArraysKt.`joinToString$default`(
                stackTrace,
                "\n",
                null as CharSequence?,
                null as CharSequence?,
                0,
                null as CharSequence?,
                `ArchComponentExtKt$safeFail$stackTraceMsg$1`.Companion.INSTANCE,
                30,
                null as Object?
            )
        )
        return Resource.Failure(false, null, null, sb.toString())
    }

    @JvmStatic
    fun <T> safeApiCall(
        function1: Function1<Continuation<in T?>?, Object?>,
        continuation: Continuation<in Resource<out T?>?>?
    ): Object {
        return BuildersKt.withContext(
            Dispatchers.getIO(),
            `ArchComponentExtKt$safeApiCall$2`(function1, null),
            continuation
        )
    }
}