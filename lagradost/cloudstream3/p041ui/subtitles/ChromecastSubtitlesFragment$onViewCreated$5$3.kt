package com.lagradost.cloudstream3.p041ui.subtitles

import java.util.ArrayList
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: ChromecastSubtitlesFragment.kt */
@Metadata(
    m108d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"],
    m107d2 = ["<anonymous>", "", FirebaseAnalytics.Param.INDEX, "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.subtitles.ChromecastSubtitlesFragment$onViewCreated$5$3 */ /* loaded from: classes4.dex */
class `ChromecastSubtitlesFragment$onViewCreated$5$3`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(/* synthetic */
    val `this$0`: ChromecastSubtitlesFragment, /* synthetic */
    val `$fontSizes`: List<Tuples<Float, String>>
) : Lambda<Any?>(1), Function1<Integer, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(num: Integer) {
        invoke(num.intValue())
        return Unit.INSTANCE
    }

    override fun invoke(i: Int) {
        var saveChromeCaptionStyle: SaveChromeCaptionStyle?
        saveChromeCaptionStyle = `this$0`.state
        if (saveChromeCaptionStyle == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE)
            saveChromeCaptionStyle = null
        }
        val list: List<Tuples<Float, String>> = `$fontSizes`
        val arrayList: ArrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10))
        val it: Iterator<T> = list.iterator()
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((it.next() as Tuples<*, *>).getFirst() as Number).floatValue()))
        }
        saveChromeCaptionStyle.setFontScale((arrayList.get(i) as Number).floatValue())
    }
}