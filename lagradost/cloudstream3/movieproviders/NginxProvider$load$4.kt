package com.lagradost.cloudstream3.movieproviders

import java.util.ArrayList
import kotlin.coroutines.Continuation

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: NginxProvider.kt */
@Metadata(
    m108d1 = ["\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u008a@"],
    m107d2 = ["<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", ""],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.movieproviders.NginxProvider\$load$4",
    m98f = "NginxProvider.kt",
    m97i = [0, 0, 1, 1, 1, 1],
    m96l = [137, 143],
    m95m = "invokeSuspend",
    m94n = ["seasonString", "seasonInt", "seasonString", "seasonDocument", "episode", "seasonInt"],
    m93s = ["L$0", "I$0", "L$0", "L$1", "L$6", "I$0"]
) /* loaded from: classes3.dex */
class `NginxProvider$load$4`(/* synthetic */val `$authHeader`: Map<String, String>,
                                            arrayList: ArrayList<Episode?>,
                                            nginxProvider: NginxProvider,
                                            continuation: Continuation<in `NginxProvider$load$4`?>?
) : SuspendLambda(2, continuation),
    Function2<Tuples<out Integer?, out String?>, Continuation<in Unit>?, Object> {
    /* synthetic */ val `$episodeList`: ArrayList<Episode>
    var `I$0` = 0

    /* synthetic */
    var `L$0`: Object? = null
    var `L$1`: Object? = null
    var `L$2`: Object? = null
    var `L$3`: Object? = null
    var `L$4`: Object? = null
    var `L$5`: Object? = null
    var `L$6`: Object? = null
    var label = 0
    /* synthetic */ val `this$0`: NginxProvider

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$episodeList` = arrayList
        `this$0` = nginxProvider
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        val `nginxProvider$load$4` =
            `NginxProvider$load$4`(`$authHeader`, `$episodeList`, `this$0`, continuation)
        `nginxProvider$load$4`.`L$0` = obj
        return `nginxProvider$load$4`
    }

    @Override // kotlin.jvm.functions.Function2
    /* bridge */ /* synthetic */  override fun invoke(
        tuples: Tuples<out Integer?, out String?>,
        continuation: Continuation<in Unit>?
    ): Object {
        return invoke2(tuples as Tuples<Integer?, String?>, continuation)
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(tuples: Tuples<Integer?, String?>, continuation: Continuation<in Unit>?): Object {
        return (create(tuples, continuation) as `NginxProvider$load$4`).invokeSuspend(Unit.INSTANCE)
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00c0  */ /* JADX WARN: Removed duplicated region for block: B:29:0x018d  */ /* JADX WARN: Removed duplicated region for block: B:30:0x0194  */ /* JADX WARN: Removed duplicated region for block: B:33:0x019e  */ /* JADX WARN: Removed duplicated region for block: B:34:0x01a3  */ /* JADX WARN: Removed duplicated region for block: B:38:0x01d8  */ /* JADX WARN: Removed duplicated region for block: B:51:0x0238  */ /* JADX WARN: Removed duplicated region for block: B:52:0x0273  */ /* JADX WARN: Removed duplicated region for block: B:54:0x027b  */ /* JADX WARN: Removed duplicated region for block: B:56:0x022a A[SYNTHETIC] */ /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0129 -> B:21:0x0133). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */   override fun invokeSuspend(r31: Any?): Any {
        /*
            Method dump skipped, instructions count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw UnsupportedOperationException("Method not decompiled: com.lagradost.cloudstream3.movieproviders.NginxProvider\$load$4.invokeSuspend(java.lang.Object):java.lang.Object")
    }
}