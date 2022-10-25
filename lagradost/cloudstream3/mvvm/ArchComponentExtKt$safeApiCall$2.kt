package com.lagradost.cloudstream3.mvvm

import com.bumptech.glide.load.HttpException
import java.net.SocketTimeoutException
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: ArchComponentExt.kt */
@Metadata(
    m108d1 = ["\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "Lcom/lagradost/cloudstream3/mvvm/Resource;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.mvvm.ArchComponentExtKt\$safeApiCall$2",
    m98f = "ArchComponentExt.kt",
    m97i = [],
    m96l = [77],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* loaded from: classes3.dex */
class `ArchComponentExtKt$safeApiCall$2`(
    function1: Function1<Continuation<in T?>?, Object?>,
    continuation: Continuation<in `ArchComponentExtKt$safeApiCall$2`?>?
) : SuspendLambda(2, continuation),
    Function2<CoroutineScope, Continuation<in Resource<out T?>?>?, Object> {
    /* synthetic */ val `$apiCall`: Function1<Continuation<in T?>?, Object?>
    var label = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$apiCall` = function1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        return `ArchComponentExtKt$safeApiCall$2`(`$apiCall`, continuation)
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in Resource<out T?>?>?
    ): Object {
        return (create(
            coroutineScope,
            continuation
        ) as `ArchComponentExtKt$safeApiCall$2`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        var obj: Object? = obj
        val safeFail: Resource.Failure
        var fileName: String?
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        return try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj)
                val function1: Function1<Continuation<in T?>, Object?> = `$apiCall`
                label = 1
                obj = function1.invoke(this)
                if (obj === coroutine_suspended) {
                    return coroutine_suspended
                }
            } else if (i != 1) {
                throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
            } else {
                ResultKt.throwOnFailure(obj)
            }
            Resource.Success<Any?>(obj)
        } catch (th: Throwable) {
            ArchComponentExt.logError(th)
            if (th is NullPointerException) {
                val stackTrace: Array<StackTraceElement> = th.getStackTrace()
                Intrinsics.checkNotNullExpressionValue(stackTrace, "throwable.stackTrace")
                val length = stackTrace.size
                var i2 = 0
                while (i2 < length) {
                    val stackTraceElement: StackTraceElement = stackTrace[i2]
                    if (if (stackTraceElement == null || stackTraceElement.getFileName()
                                .also { fileName = it } == null || !StringsKt.endsWith(
                                fileName,
                                "provider.kt",
                                true
                            )
                        ) false else true
                    ) {
                        return Resource.Failure(
                            false,
                            null,
                            null,
                            """NullPointerException at ${stackTraceElement.getFileName()} ${
                                stackTraceElement.getLineNumber().toString()
                            }
Site might have updated or added Cloudflare/DDOS protection"""
                        )
                    }
                    i2++
                }
                safeFail = ArchComponentExt.safeFail<Any>(th)
            } else if (th is SocketTimeoutException) {
                safeFail = Resource.Failure(
                    true,
                    null,
                    null,
                    "Connection Timeout\nPlease try again later."
                )
            } else if (th is HttpException) {
                val boxInt: Integer = boxing.boxInt((th as HttpException).statusCode)
                var message: String = th.getMessage()
                if (message == null) {
                    message = "HttpException"
                }
                return Resource.Failure(false, boxInt, null, message)
            } else if (th is UnknownHostException) {
                safeFail =
                    Resource.Failure(true, null, null, "Cannot connect to server, try again later.")
            } else if (th is ErrorLoadingException) {
                var message2: String = th.getMessage()
                if (message2 == null) {
                    message2 = "Error loading, try again later."
                }
                return Resource.Failure(true, null, null, message2)
            } else if (th is Standard) {
                safeFail = Resource.Failure(false, null, null, "This operation is not implemented.")
            } else if (th is SSLHandshakeException) {
                val sb = StringBuilder()
                var message3: String = th.getMessage()
                if (message3 == null) {
                    message3 = "SSLHandshakeException"
                }
                sb.append(message3)
                sb.append("\nTry again later.")
                return Resource.Failure(true, null, null, sb.toString())
            } else {
                safeFail = ArchComponentExt.safeFail<Any>(th)
            }
            safeFail
        }
    }
}