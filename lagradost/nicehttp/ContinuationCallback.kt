package com.lagradost.nicehttp

import androidx.core.app.NotificationCompat
import okhttp3.Call
import okhttp3.Callback
import okhttp3.Response
import java.io.IOException
import kotlin.jvm.internal.Intrinsics

/* compiled from: Requests.kt */
@Metadata(
    m108d1 = ["\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012#\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\u000c\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002j\u0002`\bB\u001b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\u000c¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\rH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\u000cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"],
    m107d2 = ["Lcom/lagradost/nicehttp/ContinuationCallback;", "Lokhttp3/Callback;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "Lkotlinx/coroutines/CompletionHandler;", NotificationCompat.CATEGORY_CALL, "Lokhttp3/Call;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "Lokhttp3/Response;", "(Lokhttp3/Call;Lkotlinx/coroutines/CancellableContinuation;)V", "invoke", "onFailure", "e", "Ljava/io/IOException;", "onResponse", "response", "library_release"],
    m106k = 1,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* loaded from: classes4.dex */
class ContinuationCallback(call: Call, continuation: CancellableContinuation<in Response?>) :
    Callback, Function1<Throwable?, Unit> {
    private val call: Call
    private val continuation: CancellableContinuation<Response>

    /* JADX WARN: Multi-variable type inference failed */
    init {
        Intrinsics.checkNotNullParameter(call, "call")
        Intrinsics.checkNotNullParameter(continuation, "continuation")
        this.call = call
        this.continuation = continuation
    }

    @Override // kotlin.jvm.functions.Function1
    /* bridge */ /* synthetic */  override fun invoke(th: Throwable?) {
        invoke2(th)
        return Unit.INSTANCE
    }

    @Override // okhttp3.Callback
    override fun onResponse(call: Call, response: Response) {
        Intrinsics.checkNotNullParameter(call, "call")
        Intrinsics.checkNotNullParameter(response, "response")
        continuation.resume(response, null)
    }

    @Override // okhttp3.Callback
    override fun onFailure(call: Call, e: IOException) {
        Intrinsics.checkNotNullParameter(call, "call")
        Intrinsics.checkNotNullParameter(e, "e")
        if (call.isCanceled) {
            return
        }
        val companion = Result.Companion
        continuation.resumeWith(Result.m9066constructorimpl<Any>(ResultKt.createFailure(e)))
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(th: Throwable?) {
        try {
            call.cancel()
        } catch (unused: Throwable) {
        }
    }
}