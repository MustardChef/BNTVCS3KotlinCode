package com.lagradost.cloudstream3.p041ui.settings

import java.util.Arrays
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: SettingsAccount.kt */
@Metadata(
    m108d1 = ["\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"],
    m107d2 = ["<anonymous>", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.ui.settings.SettingsAccount\$addAccount$3$1",
    m98f = "SettingsAccount.kt",
    m97i = [],
    m96l = [113],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* renamed from: com.lagradost.cloudstream3.ui.settings.SettingsAccount$addAccount$3$1 */ /* loaded from: classes4.dex */
class `SettingsAccount$addAccount$3$1` constructor(
    accountManager: AccountManager,
    loginData: LoginData,
    settingsAccount: SettingsAccount,
    continuation: Continuation<in `SettingsAccount$addAccount$3$1`?>?
) : SuspendLambda(1, continuation), Function1<Continuation<in Unit>?, Object> {
    /* synthetic */ val `$api`: AccountManager
    /* synthetic */ val `$loginData`: LoginData
    var label: Int = 0
    /* synthetic */ val `this$0`: SettingsAccount

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$api` = accountManager
        `$loginData` = loginData
        `this$0` = settingsAccount
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun create(continuation: Continuation<*>?): Continuation<Unit> {
        return `SettingsAccount$addAccount$3$1`(`$api`, `$loginData`, `this$0`, continuation)
    }

    @Override // kotlin.jvm.functions.Function1
    public override fun invoke(continuation: Continuation<in Unit>?): Object {
        return (create(continuation) as `SettingsAccount$addAccount$3$1`).invokeSuspend(Unit.INSTANCE)
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun invokeSuspend(obj: Object): Object {
        var obj: Object = obj
        var z: Boolean
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i: Int = label
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj)
                label = 1
                obj = (`$api` as InAppAuthAPI).login(`$loginData`, this)
                if (obj === coroutine_suspended) {
                    return coroutine_suspended
                }
            } else if (i != 1) {
                throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
            } else {
                ResultKt.throwOnFailure(obj)
            }
            z = (obj as Boolean).booleanValue()
        } catch (e: Exception) {
            ArchComponentExt.logError(e)
            z = false
        }
        val activity: FragmentActivity? = `this$0`.getActivity()
        if (activity != null) {
            val settingsAccount: SettingsAccount = `this$0`
            val accountManager: AccountManager = `$api`
            activity.runOnUiThread(object : Runnable() {
                // from class: com.lagradost.cloudstream3.ui.settings.-$$Lambda$SettingsAccount$addAccount$3$1$dLHKQC6WlpVPfu0s1K_yP30LNTw
                @Override // java.lang.Runnable
                fun run() {
                    `m8902invokeSuspend$lambda0`(this@SettingsAccount, z, accountManager)
                }
            })
        }
        return Unit.INSTANCE
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: invokeSuspend$lambda-0  reason: not valid java name */
        fun `m8902invokeSuspend$lambda0`(
            settingsAccount: SettingsAccount,
            z: Boolean,
            accountManager: AccountManager
        ) {
            try {
                val commonActivity: CommonActivity = CommonActivity.INSTANCE
                val activity: FragmentActivity = settingsAccount.getActivity()
                val string: String =
                    settingsAccount.getString(if (z) R.string.authenticated_user else R.string.authenticated_user_fail)
                Intrinsics.checkNotNullExpressionValue(
                    string,
                    "getString(if (isSuccessf….authenticated_user_fail)"
                )
                val format: String =
                    String.format(string, Arrays.copyOf(arrayOf<Object>(accountManager.name), 1))
                Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)")
                CommonActivity.`showToast$default`(commonActivity, activity, format, null, 4, null)
            } catch (e: Exception) {
                ArchComponentExt.logError(e)
            }
        }
    }
}