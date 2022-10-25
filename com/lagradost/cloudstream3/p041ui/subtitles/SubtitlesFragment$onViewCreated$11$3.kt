package com.lagradost.cloudstream3.p041ui.subtitles

import android.content.Context
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: SubtitlesFragment.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
    m107d2 = ["<anonymous>", "", FirebaseAnalytics.Param.INDEX, "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.subtitles.SubtitlesFragment$onViewCreated$11$3 */ /* loaded from: classes4.dex */
class `SubtitlesFragment$onViewCreated$11$3` constructor(
    list: List<Tuples<Integer, String>>,
    subtitlesFragment: SubtitlesFragment,
    list2: List<File?>,
    view: View
) : Lambda<Any?>(1), Function1<Integer, Unit> {
    /* synthetic */ val `$fontTypes`: List<Tuples<Integer, String>>
    /* synthetic */ val `$savedFontTypes`: List<File?>
    /* synthetic */ val `$textView`: View
    /* synthetic */ val `this$0`: SubtitlesFragment

    /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ /* JADX WARN: Multi-variable type inference failed */
    init {
        `$fontTypes` = list
        `this$0` = subtitlesFragment
        `$savedFontTypes` = list2
        `$textView` = view
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(num: Integer) {
        invoke(num.intValue())
        return Unit.INSTANCE
    }

    override fun invoke(i: Int) {
        var saveCaptionStyle: SaveCaptionStyle?
        var saveCaptionStyle2: SaveCaptionStyle?
        var saveCaptionStyle3: SaveCaptionStyle?
        var saveCaptionStyle4: SaveCaptionStyle?
        if (i < `$fontTypes`.size()) {
            saveCaptionStyle3 = `this$0`.state
            if (saveCaptionStyle3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
                saveCaptionStyle3 = null
            }
            saveCaptionStyle3!!.setTypeface(`$fontTypes`.get(i).getFirst())
            saveCaptionStyle4 = `this$0`.state
            if (saveCaptionStyle4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
                saveCaptionStyle4 = null
            }
            saveCaptionStyle4.setTypefaceFilePath(null)
        } else {
            saveCaptionStyle = `this$0`.state
            if (saveCaptionStyle == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
                saveCaptionStyle = null
            }
            saveCaptionStyle.setTypefaceFilePath(
                `$savedFontTypes`.get(i - `$fontTypes`.size()).getAbsolutePath()
            )
            saveCaptionStyle2 = `this$0`.state
            if (saveCaptionStyle2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
                saveCaptionStyle2 = null
            }
            saveCaptionStyle2!!.setTypeface(null)
        }
        val subtitlesFragment: SubtitlesFragment = `this$0`
        val context: Context = (`$textView` as TextView).getContext()
        Intrinsics.checkNotNullExpressionValue(context, "textView.context")
        subtitlesFragment.updateState(context)
    }
}