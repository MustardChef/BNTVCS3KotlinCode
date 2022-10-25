package com.lagradost.cloudstream3.p041ui.subtitles

import com.lagradost.cloudstream3.AcraApplication
import java.util.ArrayList
import kotlin.jvm.internal.Intrinsics

/* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: SubtitlesFragment.kt */
@Metadata(
    m108d1 = ["\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"],
    m107d2 = ["<anonymous>", "", "indexList", "", "", "invoke"],
    m106k = 3,
    m105mv = [1, 6, 0],
    m103xi = 48
) /* renamed from: com.lagradost.cloudstream3.ui.subtitles.SubtitlesFragment$onViewCreated$15$2 */ /* loaded from: classes4.dex */
class `SubtitlesFragment$onViewCreated$15$2`     /* JADX INFO: Access modifiers changed from: package-private */ /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ constructor(  /* synthetic */
    val `$lang639_1`: List<String>
) : Lambda<Any?>(1), Function1<List<Integer?>, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */  override fun invoke(list: List<Integer?>) {
        invoke2(list as List<Integer?>)
        return Unit.INSTANCE
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    fun invoke2(indexList: List<Integer?>) {
        Intrinsics.checkNotNullParameter(indexList, "indexList")
        val companion: AcraApplication.Companion = AcraApplication.Companion
        val list: List<Integer?> = indexList
        val list2: List<String> = `$lang639_1`
        val arrayList: ArrayList = ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10))
        for (number: Number in list) {
            arrayList.add(list2.get(number.intValue()))
        }
        companion.setKey(SubtitlesFragmentKt.SUBTITLE_DOWNLOAD_KEY, CollectionsKt.toList(arrayList))
    }
}