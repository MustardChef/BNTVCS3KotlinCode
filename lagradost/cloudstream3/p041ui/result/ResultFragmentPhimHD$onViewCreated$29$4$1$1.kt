package com.lagradost.cloudstream3.p041ui.result

import android.content.Context
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: ResultFragmentPhimHD.kt */
@Metadata(
    m108d1 = ["\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"],
    m107d2 = ["<anonymous>", "Landroid/widget/ImageView;", "Lkotlinx/coroutines/CoroutineScope;"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
)
@DebugMetadata(
    m99c = "com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD\$onViewCreated$29$4$1$1",
    m98f = "ResultFragmentPhimHD.kt",
    m97i = [],
    m96l = [],
    m95m = "invokeSuspend",
    m94n = [],
    m93s = []
) /* renamed from: com.lagradost.cloudstream3.ui.result.ResultFragmentPhimHD$onViewCreated$29$4$1$1 */ /* loaded from: classes4.dex */
class `ResultFragmentPhimHD$onViewCreated$29$4$1$1` constructor(
    context: Context,
    str: String?,
    continuation: Continuation<in `ResultFragmentPhimHD$onViewCreated$29$4$1$1`?>?
) : SuspendLambda(2, continuation),
    Function2<CoroutineScope, Continuation<in ImageView?>?, Object> {
    /* synthetic */ val `$ctx`: Context
    /* synthetic */ val `$posterImageLink`: String?
    var label: Int = 0

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    init {
        `$ctx` = context
        `$posterImageLink` = str
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun create(obj: Object, continuation: Continuation<*>?): Continuation<Unit> {
        return `ResultFragmentPhimHD$onViewCreated$29$4$1$1`(
            `$ctx`,
            `$posterImageLink`,
            continuation
        )
    }

    @Override // kotlin.jvm.functions.Function2
    public override fun invoke(
        coroutineScope: CoroutineScope,
        continuation: Continuation<in ImageView?>?
    ): Object {
        return (create(
            coroutineScope,
            continuation
        ) as `ResultFragmentPhimHD$onViewCreated$29$4$1$1`).invokeSuspend(
            Unit.INSTANCE
        )
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public override fun invokeSuspend(obj: Object): Object {
        IntrinsicsKt.getCOROUTINE_SUSPENDED()
        if (label == 0) {
            ResultKt.throwOnFailure(obj)
            val builder: AlertDialog.Builder = AlertDialog.Builder(`$ctx`)
            builder.setView(R.layout.result_poster)
            val create: AlertDialog = builder.create()
            Intrinsics.checkNotNullExpressionValue(create, "sourceBuilder.create()")
            create.show()
            val imageView: ImageView? = create.findViewById<View>(R.id.imgPoster) as ImageView?
            if (imageView != null) {
                UIHelper.`setImage$default`(
                    UIHelper.INSTANCE,
                    imageView,
                    `$posterImageLink`,
                    null,
                    null,
                    6,
                    null
                )
                imageView.setOnClickListener(object : OnClickListener() {
                    // from class: com.lagradost.cloudstream3.ui.result.-$$Lambda$ResultFragmentPhimHD$onViewCreated$29$4$1$1$igZmaz7h5lLAhMtHKEQvDEFZDC8
                    @Override // android.view.View.OnClickListener
                    fun onClick(view: View?) {
                        `m8802invokeSuspend$lambda1$lambda0`(this@AlertDialog, view)
                    }
                })
                return imageView
            }
            return null
        }
        throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
    }

    companion object {
        /* JADX INFO: Access modifiers changed from: private */ /* renamed from: invokeSuspend$lambda-1$lambda-0  reason: not valid java name */
        fun `m8802invokeSuspend$lambda1$lambda0`(alertDialog: AlertDialog?, view: View?) {
            UIHelper.INSTANCE.dismissSafe(alertDialog)
        }
    }
}