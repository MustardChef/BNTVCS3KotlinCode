package com.lagradost.cloudstream3

import android.util.Log
import com.bongngotv2.R
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: MainActivity.kt */
@Metadata(
    m108d1 = ["\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"],
    m107d2 = ["<anonymous>", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.MainActivity\$handleAppIntent$1",
    m98f = "MainActivity.kt",
    m97i = [],
    m96l = [434],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* loaded from: classes3.dex */
class `MainActivity$handleAppIntent$1`(
    objectRef: ObjectRef<String?>,
    oAuth2API: OAuth2API,
    mainActivity: MainActivity,
    continuation: Continuation<in `MainActivity$handleAppIntent$1`?>?
) : SuspendLambda(1, continuation), Function1<Continuation<in Unit>?, Object> {
    /* synthetic */ val `$api`: OAuth2API
    /* synthetic */ val `$str`: ObjectRef<String>
    var label = 0
    /* synthetic */ val `this$0`: MainActivity

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$str` = objectRef
        `$api` = oAuth2API
        `this$0` = mainActivity
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(continuation: Continuation<*>?): Continuation<Unit> {
        return `MainActivity$handleAppIntent$1`(`$str`, `$api`, `this$0`, continuation)
    }

    @Override // kotlin.jvm.functions.Function1
    override fun invoke(continuation: Continuation<in Unit>?): Object {
        return (create(continuation) as `MainActivity$handleAppIntent$1`).invokeSuspend(Unit.INSTANCE)
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        var obj: Object = obj
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            Log.i(MainActivity.Companion.TAG, "handleAppIntent " + `$str`.element)
            label = 1
            obj = `$api`.handleRedirect(`$str`.element, this)
            if (obj === coroutine_suspended) {
                return coroutine_suspended
            }
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            ResultKt.throwOnFailure(obj)
        }
        val booleanValue: Boolean = (obj as Boolean).booleanValue()
        if (booleanValue) {
            Log.i(MainActivity.Companion.TAG, "authenticated " + `$api`.getName())
        } else {
            Log.i(MainActivity.Companion.TAG, "failed to authenticate " + `$api`.getName())
        }
        val mainActivity = `this$0`
        val oAuth2API: OAuth2API = `$api`
        mainActivity.runOnUiThread(object : Runnable() {
            // from class: com.lagradost.cloudstream3.-$$Lambda$MainActivity$handleAppIntent$1$HU4R6P3SafJFqY88G-1C53WG9hI
            @Override // java.lang.Runnable
            fun run() {
                `m8598invokeSuspend$lambda0`(this@MainActivity, booleanValue, oAuth2API)
            }
        })
        return Unit.INSTANCE
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: invokeSuspend$lambda-0  reason: not valid java name */
        fun `m8598invokeSuspend$lambda0`(
            mainActivity: MainActivity,
            z: Boolean,
            oAuth2API: OAuth2API
        ) {
            try {
                val commonActivity: CommonActivity = CommonActivity.Companion.INSTANCE
                val string: String =
                    mainActivity.getString(if (z) R.string.authenticated_user else R.string.authenticated_user_fail)
                Intrinsics.checkNotNullExpressionValue(
                    string,
                    "getString(if (isSuccessf….authenticated_user_fail)"
                )
                val format: String =
                    String.format(string, Arrays.copyOf(arrayOf<Object>(oAuth2API.getName()), 1))
                Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)")
                CommonActivity.Companion.`showToast$default`(
                    commonActivity,
                    mainActivity,
                    format,
                    null,
                    4,
                    null
                )
            } catch (e: Exception) {
                ArchComponentExt.logError(e)
            }
        }
    }
}