package com.lagradost.cloudstream3

import com.fasterxml.jackson.core.type.TypeReference
import com.lagradost.cloudstream3.utils.AppUtils
import java.util.HashMap
import kotlin.coroutines.Continuation

/* compiled from: MainActivity.kt */
@Metadata(
    m108d1 = ["\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"],
    m107d2 = ["<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.MainActivity\$onCreate$2",
    m98f = "MainActivity.kt",
    m97i = [],
    m96l = [598],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
)
/* loaded from: classes3.dex */
internal class `MainActivity$onCreate$2`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */(/* synthetic */
    val `this$0`: MainActivity, /* synthetic */
    val `$hasBenene`: Boolean, continuation: Continuation<in `MainActivity$onCreate$2`?>?
) : SuspendLambda(2, continuation), Function2<CoroutineScope, Continuation<in Unit>?, Object> {
    var label = 0

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        return `MainActivity$onCreate$2`(`this$0`, `$hasBenene`, continuation)
    }

    @Override // kotlin.jvm.functions.Function2
    override fun invoke(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in Unit>?
    ): Object {
        return (create(coroutineScope, continuation) as `MainActivity$onCreate$2`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: MainActivity.kt */
    @Metadata(
        m108d1 = ["\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"],
        m107d2 = ["<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"],
        m106k = 3,
        m105mv = [1, 6, 0],
        m103xi = 48
    )
    @DebugMetadata(
        m99c = "com.lagradost.cloudstream3.MainActivity\$onCreate$2$1",
        m98f = "MainActivity.kt",
        m97i = [],
        m96l = [627],
        m95m = "invokeSuspend",
        m94n = [],
        m93s = []
    ) /* renamed from: com.lagradost.cloudstream3.MainActivity$onCreate$2$1 */ /* loaded from: classes3.dex */
    class C47591  /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ internal constructor(/* synthetic */
        val `this$0`: MainActivity, /* synthetic */
        val `$hasBenene`: Boolean, continuation: Continuation<in C47591?>?
    ) : SuspendLambda(2, continuation), Function2<CoroutineScope, Continuation<in Unit>?, Object> {
        var label = 0

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
            return C47591(`this$0`, `$hasBenene`, continuation)
        }

        @Override // kotlin.jvm.functions.Function2
        override fun invoke(
            coroutineScope: CoroutineScope,
            continuation: Continuation<in Unit>?
        ): Object {
            return (create(coroutineScope, continuation) as C47591).invokeSuspend(Unit.INSTANCE)
        }

        /* JADX WARN: Removed duplicated region for block: B:109:0x0206 A[SYNTHETIC] */ /* JADX WARN: Removed duplicated region for block: B:112:0x01d9 A[SYNTHETIC] */ /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */ /* JADX WARN: Removed duplicated region for block: B:21:0x0050 A[Catch: Exception -> 0x0017, TRY_LEAVE, TryCatch #1 {Exception -> 0x0017, blocks: (B:5:0x0010, B:32:0x00a1, B:36:0x00c7, B:38:0x00cc, B:39:0x00ea, B:41:0x00f1, B:43:0x0103, B:47:0x0113, B:48:0x011f, B:49:0x0132, B:51:0x0138, B:52:0x0148, B:54:0x0152, B:55:0x0164, B:57:0x016a, B:62:0x0182, B:63:0x018e, B:64:0x01a1, B:66:0x01a7, B:67:0x01b7, B:69:0x01c4, B:70:0x01d9, B:72:0x01df, B:74:0x01f4, B:76:0x01fa, B:82:0x0206, B:83:0x020a, B:68:0x01c0, B:12:0x0025, B:19:0x004c, B:21:0x0050, B:25:0x0065, B:28:0x006b, B:29:0x007a), top: B:91:0x000c }] */ /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */ /* JADX WARN: Removed duplicated region for block: B:28:0x006b A[Catch: Exception -> 0x0017, TryCatch #1 {Exception -> 0x0017, blocks: (B:5:0x0010, B:32:0x00a1, B:36:0x00c7, B:38:0x00cc, B:39:0x00ea, B:41:0x00f1, B:43:0x0103, B:47:0x0113, B:48:0x011f, B:49:0x0132, B:51:0x0138, B:52:0x0148, B:54:0x0152, B:55:0x0164, B:57:0x016a, B:62:0x0182, B:63:0x018e, B:64:0x01a1, B:66:0x01a7, B:67:0x01b7, B:69:0x01c4, B:70:0x01d9, B:72:0x01df, B:74:0x01f4, B:76:0x01fa, B:82:0x0206, B:83:0x020a, B:68:0x01c0, B:12:0x0025, B:19:0x004c, B:21:0x0050, B:25:0x0065, B:28:0x006b, B:29:0x007a), top: B:91:0x000c }] */ /* JADX WARN: Removed duplicated region for block: B:29:0x007a A[Catch: Exception -> 0x0017, TryCatch #1 {Exception -> 0x0017, blocks: (B:5:0x0010, B:32:0x00a1, B:36:0x00c7, B:38:0x00cc, B:39:0x00ea, B:41:0x00f1, B:43:0x0103, B:47:0x0113, B:48:0x011f, B:49:0x0132, B:51:0x0138, B:52:0x0148, B:54:0x0152, B:55:0x0164, B:57:0x016a, B:62:0x0182, B:63:0x018e, B:64:0x01a1, B:66:0x01a7, B:67:0x01b7, B:69:0x01c4, B:70:0x01d9, B:72:0x01df, B:74:0x01f4, B:76:0x01fa, B:82:0x0206, B:83:0x020a, B:68:0x01c0, B:12:0x0025, B:19:0x004c, B:21:0x0050, B:25:0x0065, B:28:0x006b, B:29:0x007a), top: B:91:0x000c }] */ /* JADX WARN: Removed duplicated region for block: B:38:0x00cc A[Catch: Exception -> 0x0017, TryCatch #1 {Exception -> 0x0017, blocks: (B:5:0x0010, B:32:0x00a1, B:36:0x00c7, B:38:0x00cc, B:39:0x00ea, B:41:0x00f1, B:43:0x0103, B:47:0x0113, B:48:0x011f, B:49:0x0132, B:51:0x0138, B:52:0x0148, B:54:0x0152, B:55:0x0164, B:57:0x016a, B:62:0x0182, B:63:0x018e, B:64:0x01a1, B:66:0x01a7, B:67:0x01b7, B:69:0x01c4, B:70:0x01d9, B:72:0x01df, B:74:0x01f4, B:76:0x01fa, B:82:0x0206, B:83:0x020a, B:68:0x01c0, B:12:0x0025, B:19:0x004c, B:21:0x0050, B:25:0x0065, B:28:0x006b, B:29:0x007a), top: B:91:0x000c }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */   override fun invokeSuspend(r23: Any?): Any {
            /*
                Method dump skipped, instructions count: 538
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.MainActivity\$onCreate$2.C47591.invokeSuspend(java.lang.Object):java.lang.Object")
        }

        /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: MainActivity.kt */
        @Metadata(
            m108d1 = ["\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"],
            m107d2 = ["<anonymous>", ""],
            m106k = 3,
            m105mv = [1, 6, 0],
            m103xi = 48
        )
        @DebugMetadata(
            m99c = "com.lagradost.cloudstream3.MainActivity\$onCreate$2$1$1",
            m98f = "MainActivity.kt",
            m97i = [],
            m96l = [TypedValues.MotionType.TYPE_PATHMOTION_ARC],
            m95m = "invokeSuspend",
            m94n = [],
            m93s = []
        ) /* renamed from: com.lagradost.cloudstream3.MainActivity$onCreate$2$1$1 */ /* loaded from: classes3.dex */
        class C47601  /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ internal constructor(/* synthetic */
            val `this$0`: MainActivity, continuation: Continuation<in C47601?>?
        ) : SuspendLambda(1, continuation), Function1<Continuation<in Unit>?, Object> {
            var label = 0

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            override fun create(continuation: Continuation<*>?): Continuation<Unit> {
                return C47601(`this$0`, continuation)
            }

            @Override // kotlin.jvm.functions.Function1
            override fun invoke(continuation: Continuation<in Unit>?): Object {
                return (create(continuation) as C47601).invokeSuspend(Unit.INSTANCE)
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            override fun invokeSuspend(obj: Object): Object {
                val obj2: Object
                var providersInfoJson: ProvidersInfoJson
                val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
                val i = label
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj)
                        label = 1
                        obj2 = Requests.`get$default`(
                            MainActivityKt.getApp(),
                            MainAPIKt.PROVIDER_STATUS_URL,
                            null,
                            null,
                            null,
                            null,
                            false,
                            0,
                            null,
                            0L,
                            null,
                            false,
                            this,
                            2046,
                            null
                        )
                        if (obj2 === coroutine_suspended) {
                            return coroutine_suspended
                        }
                    } else if (i != 1) {
                        throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
                    } else {
                        ResultKt.throwOnFailure(obj)
                        obj2 = obj
                    }
                    val text: String = (obj2 as NiceResponse).getText()
                    val appUtils = AppUtils.INSTANCE
                    var obj3: Object? = null
                    if (text != null) {
                        try {
                            obj3 = MainAPIKt.getMapper().readValue(
                                text,
                                object :
                                    TypeReference<HashMap<String?, ProvidersInfoJson?>?>() { // from class: com.lagradost.cloudstream3.MainActivity$onCreate$2$1$1$invokeSuspend$$inlined$tryParseJson$1
                                })
                        } catch (unused: Exception) {
                        }
                    }
                    val hashMap: HashMap<String, ProvidersInfoJson>? = obj3 as HashMap?
                    DataStore.INSTANCE.setKey(`this$0`, MainAPIKt.PROVIDER_STATUS_KEY, text)
                    MainAPI.Companion.Companion.setOverrideData(hashMap)
                    APIHolder.Companion.INSTANCE.initAll()
                    for (mainAPI in APIHolder.Companion.INSTANCE.getApis()) {
                        if (hashMap != null && hashMap.get(mainAPI.getClass().getSimpleName())
                                .also { providersInfoJson = it } != null
                        ) {
                            mainAPI.overrideWithNewData(providersInfoJson)
                        }
                    }
                } catch (e: Exception) {
                    ArchComponentExt.logError(e)
                }
                return Unit.INSTANCE
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun invokeSuspend(obj: Object): Object {
        var obj: Object = obj
        val coroutine_suspended: Object = IntrinsicsKt.getCOROUTINE_SUSPENDED()
        val i = label
        if (i == 0) {
            ResultKt.throwOnFailure(obj)
            label = 1
            obj = BuildersKt.withContext<Unit>(
                Dispatchers.getIO(),
                C47591(`this$0`, `$hasBenene`, null),
                this
            )
            if (obj === coroutine_suspended) {
                return coroutine_suspended
            }
        } else if (i != 1) {
            throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
        } else {
            ResultKt.throwOnFailure(obj)
        }
        return obj
    }
}